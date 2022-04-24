package fr.haifunime.samourai.events;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class ManageStats {
	
	public static void createPlayerStats(Player player) {
		String uuid = player.getUniqueId().toString();
        File file = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "stats" + ".yml");
        FileConfiguration playerStatsData = YamlConfiguration.loadConfiguration(file);
        
        try {
        	if(!file.exists()) {
        		playerStatsData.createSection("stats");
        	}
        	playerStatsData.set("stats." + uuid + ".kills", 0);
        	playerStatsData.set("stats." + uuid + ".deaths", 0);
        	playerStatsData.set("stats." + uuid + ".created", 1);
                                    
        	playerStatsData.save(file);
        } catch (IOException exception) {
        	exception.printStackTrace();
        }
	}
	
	public static boolean isCreated(Player player) {
		String uuid = player.getUniqueId().toString();
        File file = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "stats" + ".yml");
        FileConfiguration playerStatsData = YamlConfiguration.loadConfiguration(file);
        
        if(playerStatsData.getInt("stats." + uuid + ".created") == 1) {
        	return true;
        } else {
        	return false;
        }
	}
	
	public static void addDeath(Player player) {
		String uuid = player.getUniqueId().toString();
        File file = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "stats" + ".yml");
        FileConfiguration playerStatsData = YamlConfiguration.loadConfiguration(file);
        
        try {
        	int now = playerStatsData.getInt("stats." + uuid + ".deaths");
        	int next = (now + 1);
        	playerStatsData.set("stats." + uuid + ".deaths", next);
        
        	playerStatsData.save(file);
        } catch (IOException exception) {
        	exception.printStackTrace();
        }
        
	}
	
	public static void addKill(Player player) {
		String uuid = player.getUniqueId().toString();
        File file = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "stats" + ".yml");
        FileConfiguration playerStatsData = YamlConfiguration.loadConfiguration(file);
        
        try {
        	int now = playerStatsData.getInt("stats." + uuid + ".kills");
        	int next = (now + 1);
        	playerStatsData.set("stats." + uuid + ".kills", next);
        	
        	playerStatsData.save(file);
        } catch (IOException exception) {
        	exception.printStackTrace();
        }
        
	}
	
	public static int getDeaths(Player player) {
		String uuid = player.getUniqueId().toString();
        File file = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "stats" + ".yml");
        FileConfiguration playerStatsData = YamlConfiguration.loadConfiguration(file);
        
        int now = playerStatsData.getInt("stats." + uuid + ".deaths");
        return now;
	}
	
	public static int getKills(Player player) {
		String uuid = player.getUniqueId().toString();
        File file = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "stats" + ".yml");
        FileConfiguration playerStatsData = YamlConfiguration.loadConfiguration(file);
        
        int now = playerStatsData.getInt("stats." + uuid + ".kills");
        return now;
	}

}
