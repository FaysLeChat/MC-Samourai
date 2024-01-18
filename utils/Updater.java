package fr.haifunime.samourai.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import fr.haifunime.samourai.Main;

public class Updater {
  	private final String dlLink = "http://51.178.138.132/pl/haifusamurais/latest.jar";
	private final String versionLink = "http://51.178.138.132/pl/haifusamurais/version.txt";
	private Plugin plugin;
	
	public Updater(Plugin plugin) {
		this.plugin = plugin;
	}
	
	public void checkForUpdates() {
		if(Main.getInstance().updated == 0) {
			int oldVersion = this.getVersionFromString(plugin.getDescription().getVersion());
			String path = this.getFilePath();
		
			try {
				URL url = new URL(versionLink);
				URLConnection con = url.openConnection();
				InputStreamReader isr = new InputStreamReader(con.getInputStream());
				BufferedReader reader = new BufferedReader(isr);
				int newVersion = this.getVersionFromString(reader.readLine());
				reader.close();
			
				if(newVersion > oldVersion) {
					Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "[Fays Updater]" + " " + ChatColor.GREEN + "New update found!" + " " + ChatColor.YELLOW + newVersion);
					Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "[Fays Updater]" + " " + ChatColor.GREEN + "Downloading...");
					
					url = new URL(dlLink);
					con = url.openConnection();
					InputStream in = con.getInputStream();
					FileOutputStream out = new FileOutputStream(path);
					byte[] buffer = new byte[1024];
					int size = 0;
					while((size = in.read(buffer)) != -1) {
						out.write(buffer, 0, size);
					}
				
					out.close();
					in.close();
					Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "[Fays Updater]" + " " + ChatColor.GREEN + "Successfully updated!");
					Bukkit.getConsoleSender().sendMessage(ChatColor.DARK_PURPLE + "[Fays Updater]" + " " + ChatColor.AQUA + "Please reload or restart your server.");
				}
			} catch(IOException e) {
				plugin.getLogger().log(Level.SEVERE, "Failed to auto update", e);
			}
		} else {
			
		}
	}
	
	private String getFilePath() {
		if(plugin instanceof JavaPlugin) {
			try {
				Method method = JavaPlugin.class.getDeclaredMethod("getFile");
				boolean wasAccessible = method.isAccessible();
				method.setAccessible(true);
				File file = (File) method.invoke(plugin);
				method.setAccessible(wasAccessible);
				
				return file.getPath();
			} catch(Exception e) {
				return "plugins" + File.separator + plugin.getName();
			}
		} else {
			return "plugins" + File.separator + plugin.getName();
		}
	}
	
	private int getVersionFromString(String from) {
		String result = "";
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(from);
		
		while(matcher.find()) {
			result += matcher.group();
		}
		
		return result.isEmpty() ? 0 : Integer.parseInt(result);
	}
}