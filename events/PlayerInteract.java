package fr.haifunime.samourai.events;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import fr.haifunime.samourai.Main;

public class PlayerInteract implements Listener {
	
	@EventHandler
	public void onClickInvPlayer(PlayerInteractEvent event) {
		Player player = event.getPlayer();
		ItemStack current = event.getItem();
		
    	if(event.getAction() == Action.RIGHT_CLICK_AIR || event.getAction() == Action.RIGHT_CLICK_BLOCK || event.getAction() == Action.LEFT_CLICK_AIR || event.getAction() == Action.LEFT_CLICK_BLOCK) {
    		ProcessClick.action(player, current, player.getInventory());
		}
	}
	
	@EventHandler
	public void onPlayerDrop(PlayerDropItemEvent event) {
		event.setCancelled(true);
	}
    
    @EventHandler
    public void onDamage(EntityDamageByEntityEvent event) {
    	if(event.getEntity().getWorld().getName().equals("Samurais")) {
    		if(event.getEntity() instanceof Player) {
    			if(!Main.getInstance().ingame.contains(event.getEntity()))
    			event.setCancelled(true);
    		}
    	}
    }
    
    @EventHandler(priority = EventPriority.MONITOR)
    public void onDeath(PlayerDeathEvent event) {
    	final Player killed = event.getEntity();
    	final Player killer = event.getEntity().getKiller();
    	
    	Main.getInstance().ingame.remove(killed);
    	
    	event.setDroppedExp(0);
    	event.setDeathMessage(null);
    	event.getDrops().clear();
    	
    	Bukkit.getScheduler().runTaskLater(Main.getInstance(), new Runnable() {
    		@Override
    		public void run() {
    			killed.spigot().respawn();
    		}
    	}, 1);
    	    	
    	ManagePlayerdata.addGemmes(killer, 1);
    	ManageStats.addDeath(killed);
    	ManageStats.addKill(killer);
    	if(ManagePlayerdata.getUpgrade(killer, "healthrune") == 1)
    		killer.addPotionEffect(new PotionEffect(PotionEffectType.REGENERATION, 15, 0, true), true);
    	killer.sendMessage("§8× §e§lSamuraïs§r §8× §7Vous avez gagné §2+§e1 §a⧫§7. §8(§2+ §e??? §d❀ §f: §7Elimination§8)");
    	for(Player all : Bukkit.getWorld("Samurais").getPlayers()) {
    		if(Main.getInstance().ingame.contains(all))
    		all.sendMessage("§f§l(§c☠§f§l)§r §7" + killed.getName() + " §fà été tranché par §7" + killer.getName() + " §f!");
    	}
    }
    
    @EventHandler
    public void onRespawn(PlayerRespawnEvent event) {
    	if(event.getPlayer().getWorld().getName().equals("Samurais")) {
    		Main.getInstance().actionSpawn(event.getPlayer(), false);
    		event.setRespawnLocation(new Location(event.getPlayer().getWorld(), 138.5, 2, -1265.5));
    	}
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
    	if(event.getPlayer().getWorld().getName().equals("Samurais")) {
    		event.setCancelled(true);
    	}
    }
    
    @EventHandler
    public void onBlockPlace(BlockPlaceEvent event) {
    	if(event.getPlayer().getWorld().getName().equals("Samurais")) {
    		event.setCancelled(true);
    	}
    }
    
    @EventHandler
    public void onFoodLess(FoodLevelChangeEvent event) {
    	if(event.getEntity().getWorld().getName().equals("Samurais")) {
    		event.setCancelled(true);
    	}
    }
    
    @EventHandler
	public void onClick(InventoryClickEvent event) {
		ItemStack current = event.getCurrentItem();
		Player player = (Player)event.getWhoClicked();
		
		if(current == null) return;
		
		if(!player.getGameMode().equals(GameMode.CREATIVE)) event.setCancelled(true);
		ProcessClick.action(player, current, event.getInventory());
    }

}
