package fr.haifunime.samourai;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.ScoreboardManager;
import org.github.paperspigot.Title;

import fr.haifunime.samourai.events.ChangeWorld;
import fr.haifunime.samourai.events.ManageMessages;
import fr.haifunime.samourai.events.ManagePlayerdata;
import fr.haifunime.samourai.events.ManageStats;
import fr.haifunime.samourai.events.PlayerInteract;
import fr.haifunime.samourai.events.PlayerJoin;
import fr.haifunime.samourai.events.PlayerQuit;
import fr.haifunime.samourai.events.WeatherChange;
import fr.haifunime.samourai.utils.Updater;

public class Main extends JavaPlugin {
	
	private static Main instance = null;
	public ArrayList<Player> ingame = new ArrayList<Player>();
	public int updated = 0;
	
	Updater updater = new Updater(this);
	ManageMessages messages = new ManageMessages(this);
		
	@Override
	public void onEnable() {
		int seconds = 300; // 5m
		new BukkitRunnable() {
		    @Override
		    public void run() {
		    	updater.checkForUpdates();
		    }
		}.runTaskTimer(this, 0L, 20L * seconds);
		    	
		messages.createMessagesData();
		messages.updateMessagesData();
		
		instance = this;
		getServer().getPluginManager().registerEvents(new ChangeWorld(), this);
		getServer().getPluginManager().registerEvents(new PlayerInteract(), this);
		getServer().getPluginManager().registerEvents(new PlayerJoin(), this);
		getServer().getPluginManager().registerEvents(new PlayerQuit(), this);
		getServer().getPluginManager().registerEvents(new WeatherChange(), this);
		getCommand("samurai").setExecutor(new Commands());
		
		ScoreboardManager manager = Bukkit.getScoreboardManager();
		Scoreboard scoreboard = manager.getNewScoreboard();
	 
		Objective lhobjective = scoreboard.registerNewObjective("showhealth", "health");
		lhobjective.setDisplaySlot(DisplaySlot.BELOW_NAME);
		lhobjective.setDisplayName("§c❤");
		
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, new Runnable() {
			public void run() {      		  
	        	for(Player online : Bukkit.getWorld("Samurais").getPlayers()) {	  
	        		if(ingame.contains(online)) {
	        			online.setScoreboard(scoreboard);
	        			online.setHealth(online.getHealth());
	        		} else {
	        			online.setScoreboard(manager.getNewScoreboard());
	        		}
	        	}
	        }
		}, 0, 20);
	}
	
	public void actionJoin(Player player) {
		player.setHealth(2);
		player.sendMessage(messages.getMessage("messages.welcome", player, this));
		player.sendTitle(new Title(messages.getMessage("messages.title_join", player, this), messages.getMessage("messages.subtitle_join", player, this)));
		Main.getInstance().actionSpawn(player, true);
		ManagePlayerdata.createPlayerdata(player);
		if(ManageStats.isCreated(player) == false) ManageStats.createPlayerStats(player);
	}
	
	public void actionSpawn(Player player, boolean tp) {
		if(ingame.contains(player)) ingame.remove(player);
		player.setGameMode(GameMode.ADVENTURE);
		player.setMaxHealth(2);
		player.setFoodLevel(20);
		player.setWalkSpeed((float)0.2);
		for(PotionEffect pe : player.getActivePotionEffects()) {
			player.removePotionEffect(pe.getType());
		}
		player.getInventory().clear();
		player.getInventory().setHelmet(null);
		player.getInventory().setChestplate(null);
		player.getInventory().setLeggings(null);
		player.getInventory().setBoots(null);
		player.getInventory().setHeldItemSlot(0);
		if(tp == true) player.teleport(new Location(player.getWorld(), 138.5, 2, -1265.5));
		spawnItems(player);
		
	}
	
	public void actionPlay(Player player) {
		player.setFlying(false);
		player.setGameMode(GameMode.ADVENTURE);
		for(PotionEffect pe : player.getActivePotionEffects()) {
			player.removePotionEffect(pe.getType());
		}
		player.getInventory().clear();
		player.setMaxHealth(20);
		player.setHealth(20);
		player.teleport(new Location(player.getWorld(), 170.5, 24, -1210.5, 180, 0));
		ingame.add(player);
		
		Items.giveItem(player, "helmet", ManagePlayerdata.getUpgrade(player, "helmet"));
		Items.giveItem(player, "chestplate", ManagePlayerdata.getUpgrade(player, "chestplate"));
		Items.giveItem(player, "leggings", ManagePlayerdata.getUpgrade(player, "leggings"));
		Items.giveItem(player, "boots", ManagePlayerdata.getUpgrade(player, "boots"));
		Items.giveItem(player, "katana", ManagePlayerdata.getUpgrade(player, "katana"));
		Items.giveItem(player, "bow", ManagePlayerdata.getUpgrade(player, "bow"));
		player.getInventory().setHeldItemSlot(0);
		
		//Dev Only
		ItemStack leave = new ItemStack(Material.BARRIER, 1);
		ItemMeta leaveM = leave.getItemMeta();
		leaveM.setDisplayName("§8× §6§lQuitter §4DEV-ONLY §8×");
		leave.setItemMeta(leaveM);
		
		player.getInventory().setItem(8, leave);
	}
	
	public void spawnItems(Player player) {
		ItemStack play = new ItemStack(Material.IRON_AXE, 1);
		ItemMeta playM = play.getItemMeta();
		playM.setDisplayName(messages.getMessage("messages.item_play", player, this));
		play.setItemMeta(playM);
		
		ItemStack upgrade = new ItemStack(Material.MAGMA_CREAM, 1);
		ItemMeta upgradeM = upgrade.getItemMeta();
		upgradeM.setDisplayName(messages.getMessage("messages.item_upgrade", player, this));
		upgrade.setItemMeta(upgradeM);
		
		ItemStack spectator = new ItemStack(Material.NETHER_STAR, 1);
		ItemMeta spectatorM = spectator.getItemMeta();
		spectatorM.setDisplayName(messages.getMessage("messages.item_spectator", player, this));
		spectator.setItemMeta(spectatorM);
		
		ItemStack stats = new ItemStack(Material.ITEM_FRAME, 1);
		ItemMeta statsM = stats.getItemMeta();
		statsM.setDisplayName(messages.getMessage("messages.item_stats", player, this));
		stats.setItemMeta(statsM);
		
		ItemStack howtoplay = new ItemStack(Material.BOOK, 1);
		ItemMeta howtoplayM = howtoplay.getItemMeta();
		howtoplayM.setDisplayName(messages.getMessage("messages.item_howtoplay", player, this));
		howtoplay.setItemMeta(howtoplayM);
		
		player.getInventory().clear();
		
		player.getInventory().setItem(0, play);
		player.getInventory().setItem(1, upgrade);
		player.getInventory().setItem(4, spectator);
		player.getInventory().setItem(7, stats);
		player.getInventory().setItem(8, howtoplay);
	}
	
	public static Main getInstance() {
    	return instance;
    }

}
