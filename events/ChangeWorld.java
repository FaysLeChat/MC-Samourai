package fr.haifunime.samourai.events;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;

import fr.haifunime.samourai.Main;

public class ChangeWorld implements Listener {
	
	@EventHandler
	public void onWorldChange(PlayerChangedWorldEvent event){
		if(event.getPlayer().getWorld().getName().equals("Samurais")) {
			Main.getInstance().actionJoin(event.getPlayer());
				
		}
		if(event.getFrom().getName().equals("Samurais")) {
			if(Main.getInstance().ingame.contains(event.getPlayer())) {
				Main.getInstance().ingame.remove(event.getPlayer());
				for(Player all : Bukkit.getWorld("Samurais").getPlayers()) {
					if(Main.getInstance().ingame.contains(all))
					all.sendMessage("§f§l(§c☠§f§l)§r §7" + event.getPlayer().getName() + " §fa disparu.");
				}
			}
		}
	}

}
