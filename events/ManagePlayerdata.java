package fr.haifunime.samourai.events;

import java.io.File;
import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;

public class ManagePlayerdata {
	
	public static void createPlayerdata(Player player) {
		String uuid = player.getUniqueId().toString();
        File userdata = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "playerdata");
        File file = new File(userdata, File.separator + uuid + ".yml");
        FileConfiguration playerData = YamlConfiguration.loadConfiguration(file);
        
        if (!file.exists()) {
            try {
                playerData.createSection("money");
                playerData.set("money.gemmes", 0);
               
                playerData.createSection("upgrades");
                playerData.set("upgrades.helmet", 0);
                playerData.set("upgrades.chestplate", 0);
                playerData.set("upgrades.leggings", 0);
                playerData.set("upgrades.boots", 0);
                playerData.set("upgrades.katana", 0);
                playerData.set("upgrades.bow", 0);
                playerData.set("upgrades.healthrune", 0);
                                    
                playerData.save(file);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
	}
	
	public static void addGemmes(Player player, int amount) {
		String uuid = player.getUniqueId().toString();
        File userdata = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "playerdata");
        File file = new File(userdata, File.separator + uuid + ".yml");
        FileConfiguration playerData = YamlConfiguration.loadConfiguration(file);
        
        if (file.exists()) {
            try {
                int now = playerData.getInt("money.gemmes");
                int after = (now+amount);
                playerData.set("money.gemmes", after);
               
                playerData.save(file);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
	}
	
	public static void removeGemmes(Player player, int amount) {
		String uuid = player.getUniqueId().toString();
        File userdata = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "playerdata");
        File file = new File(userdata, File.separator + uuid + ".yml");
        FileConfiguration playerData = YamlConfiguration.loadConfiguration(file);
        
        if (file.exists()) {
            try {
            	int now = playerData.getInt("money.gemmes");
            	int after = (now-amount);
                playerData.set("money.gemmes", after);
               
                playerData.save(file);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
	}
	
	public static void setGemmes(Player player, int amount) {
		String uuid = player.getUniqueId().toString();
        File userdata = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "playerdata");
        File file = new File(userdata, File.separator + uuid + ".yml");
        FileConfiguration playerData = YamlConfiguration.loadConfiguration(file);
        
        if (file.exists()) {
            try {
                playerData.set("money.gemmes", amount);
               
                playerData.save(file);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
	}
	
	public static int getGemmes(Player player) {
		String uuid = player.getUniqueId().toString();
        File userdata = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "playerdata");
        File file = new File(userdata, File.separator + uuid + ".yml");
        FileConfiguration playerData = YamlConfiguration.loadConfiguration(file);
        
        int now = playerData.getInt("money.gemmes");
        return now;
	}
	
	public static int getUpgrade(Player player, String upgrade) {
		String uuid = player.getUniqueId().toString();
        File userdata = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "playerdata");
        File file = new File(userdata, File.separator + uuid + ".yml");
        FileConfiguration playerData = YamlConfiguration.loadConfiguration(file);
        
        int up = 0;
        
        if(upgrade.equals("helmet")) {
        	up = playerData.getInt("upgrades.helmet");
        }
        if(upgrade.equals("chestplate")) {
        	up = playerData.getInt("upgrades.chestplate");
        }
        if(upgrade.equals("leggings")) {
        	up = playerData.getInt("upgrades.leggings");
        }
        if(upgrade.equals("boots")) {
        	up = playerData.getInt("upgrades.boots");
        }
        if(upgrade.equals("katana")) {
        	up = playerData.getInt("upgrades.katana");
        }
        if(upgrade.equals("bow")) {
        	up = playerData.getInt("upgrades.bow");
        }
        if(upgrade.equals("healthrune")) {
        	up = playerData.getInt("upgrades.healthrune");
        }
        return up;
	}
	
	public static void setUpgrade(Player player, String upgrade, int level) {
		String uuid = player.getUniqueId().toString();
        File userdata = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "playerdata");
        File file = new File(userdata, File.separator + uuid + ".yml");
        FileConfiguration playerData = YamlConfiguration.loadConfiguration(file);
        
        if (file.exists()) {
            try {
            	if(upgrade.equals("helmet")) {
                	playerData.set("upgrades.helmet", level);
                }
                if(upgrade.equals("chestplate")) {
                	playerData.set("upgrades.chestplate", level);
                }
                if(upgrade.equals("leggings")) {
                	playerData.set("upgrades.leggings", level);
                }
                if(upgrade.equals("boots")) {
                	playerData.set("upgrades.boots", level);
                }
                if(upgrade.equals("katana")) {
                	playerData.set("upgrades.katana", level);
                }
                if(upgrade.equals("bow")) {
                	playerData.set("upgrades.bow", level);
                }
                if(upgrade.equals("healthrune")) {
                	playerData.set("upgrades.healthrune", level);
                }
               
                playerData.save(file);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
	}

}
