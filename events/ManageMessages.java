package fr.haifunime.samourai.events;

import java.io.File;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class ManageMessages {
	
	private Plugin plugin;
	
	File file = new File(Bukkit.getServer().getPluginManager().getPlugin("HaifunimeSamurai").getDataFolder(), File.separator + "messages" + ".yml");
    FileConfiguration messages = YamlConfiguration.loadConfiguration(file);
	
	public ManageMessages(Plugin plugin) {
		this.plugin = plugin;
	}
	
	public void createMessagesData() {        
        if (!file.exists()) {
            try {
                messages.createSection("file");
                messages.set("file.version", getVersionFromString(plugin.getDescription().getVersion()));
               
                messages.createSection("messages");
                messages.set("messages.title_join", " &b× &6&lSamuraïs&r &b×");
                messages.set("messages.subtitle_join", "&7par &e&lHaifunime&r");
                messages.set("messages.welcome", "\n&f&l» &e&lBienvenue sur le mode de jeu &f&l: &6&lSamuraïs\n&r \n&eInfo &f: &7Bonne chance et bon jeu, &b&o%displayname% &7!\n&7Version actuelle du jeu &f: &d&ov%version%\n&r ");
                                    
                messages.set("messages.item_play", "&8× &6&lJouer &8×");
                messages.set("messages.item_upgrade", "&8× &6&lAméliorations &8×");
                messages.set("messages.item_spectator", "&8× &6&lSpectateur &8×");
                messages.set("messages.stats", "&8× &6&lStatistiques &8×");
                messages.set("messages.item_howtoplay", "&8× &6&lComment jouer !? &8×");
                
                messages.save(file);
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
	}
	
	public void updateMessagesData() {
        if (file.exists()) {
            try {
            	if(getVersionFromString(plugin.getDescription().getVersion()) > messages.getInt("file.version")) {
            		messages.set("file.version", getVersionFromString(plugin.getDescription().getVersion()));
            		
            		
                                    
            		messages.save(file);
            	}
            } catch (IOException exception) {
                exception.printStackTrace();
            }
        }
	}
	
	public String getMessage(String locate, Player player, Plugin plugin, Player killer) {        
        String temp = "null";
        if (file.exists()) {
            temp = messages.getString(locate);
            temp = ChatColor.translateAlternateColorCodes('&', temp);
            if(player != null) temp = temp.replace("%playername%", player.getName()).replace("%displayname%", player.getDisplayName());
            if(plugin != null) temp = temp.replace("%version%", plugin.getDescription().getVersion());
            if(killer != null) temp = temp.replace("", newChar)
        }
		return temp;
	}
	
	private static int getVersionFromString(String from) {
		String result = "";
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(from);
		
		while(matcher.find()) {
			result += matcher.group();
		}
		
		return result.isEmpty() ? 0 : Integer.parseInt(result);
	}

}
