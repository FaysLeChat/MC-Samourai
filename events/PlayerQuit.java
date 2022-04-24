package fr.haifunime.samourai.events;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import fr.haifunime.samourai.Main;

public class PlayerQuit implements Listener {
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent event) {
		event.setQuitMessage(null);
		if(Main.getInstance().ingame.contains(event.getPlayer()))
			Main.getInstance().ingame.remove(event.getPlayer());
	}

}
