package fr.haifunime.samourai.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import fr.haifunime.samourai.Main;

public class PlayerJoin implements Listener {
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event) {
		event.setJoinMessage(null);
		if(event.getPlayer().getWorld().getName().equals("Samurais")) {
			Main.getInstance().actionJoin(event.getPlayer());
		}
	}

}
