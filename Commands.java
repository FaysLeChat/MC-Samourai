package fr.haifunime.samourai;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

import fr.haifunime.samourai.events.ManagePlayerdata;

public class Commands implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(sender.isOp() || sender instanceof ConsoleCommandSender) {
			if (cmd.getName().equalsIgnoreCase("samurai")) {
				if(args.length == 0) {
					sender.sendMessage("§eSamurai propulsé par §6§lLaliay §f| §blaliay.fr");
				}
				if(args.length >= 1) {
					if(args[0].equalsIgnoreCase("gemmes")) {
						if(args.length == 1){
							sender.sendMessage("§cSyntax: /samurai gemmes <add|remove|set> <player> <amount>");
						}
						if(args.length == 2){
							if(args[1].equalsIgnoreCase("add")) {
								sender.sendMessage("§cSyntax: /samurai gemmes add <player> <amount>");
							}
							if(args[1].equalsIgnoreCase("remove")) {
								sender.sendMessage("§cSyntax: /samurai gemmes remove <player> <amount>");
							}
							if(args[1].equalsIgnoreCase("set")) {
								sender.sendMessage("§cSyntax: /samurai gemmes set <player> <amount>");
							}
						}
						if(args.length == 3){
							if(args[1].equalsIgnoreCase("add")) {
								sender.sendMessage("§cSyntax: /samurai gemmes add " + args[2] + " <amount>");
							}
							if(args[1].equalsIgnoreCase("remove")) {
								sender.sendMessage("§cSyntax: /samurai gemmes remove " + args[2] + " <amount>");
							}
							if(args[1].equalsIgnoreCase("set")) {
								sender.sendMessage("§cSyntax: /samurai gemmes set " + args[2] + " <amount>");
							}
						}
						if(args.length == 4){
							Player player = Bukkit.getPlayer(args[2]);
							int amount = Integer.parseInt(args[3]);
							if(args[1].equalsIgnoreCase("add")) {
								ManagePlayerdata.addGemmes(player, amount);
								sender.sendMessage("§aTu as ajouté " + amount + " gemmes à " + player.getName());
							}
							if(args[1].equalsIgnoreCase("remove")) {
								ManagePlayerdata.removeGemmes(player, amount);
								sender.sendMessage("§aTu as retiré " + amount + " gemmes à " + player.getName());
							}
							if(args[1].equalsIgnoreCase("set")) {
								ManagePlayerdata.setGemmes(player, amount);
								sender.sendMessage("§aTu as modifié à " + amount + " le nombre de gemmes de " + player.getName());
							}
						}
                    }
					if(args[0].equalsIgnoreCase("upgrades")) {
						if(args.length == 1){
							sender.sendMessage("§cSyntax: /samurai upgrades <set> <player> <type> <amount>");
						}
						if(args.length == 2){
							if(args[1].equalsIgnoreCase("set")) {
								sender.sendMessage("§cSyntax: /samurai upgrades set <player> <amount>");
							}
						}
						if(args.length == 3){
							if(args[1].equalsIgnoreCase("set")) {
								sender.sendMessage("§cSyntax: /samurai upgades set " + args[2] + " <amount>");
							}
						}
						if(args.length == 4){
							if(args[1].equalsIgnoreCase("set")) {
								sender.sendMessage("§cSyntax: /samurai upgrades set " + args[2] + args[3] + " <amount>");
							}
						}
						if(args.length == 5){
							Player player = Bukkit.getPlayer(args[2]);
							String type = args[3];
							int amount = Integer.parseInt(args[4]);
							if(args[1].equalsIgnoreCase("set")) {
								ManagePlayerdata.setUpgrade(player, type, amount);
								sender.sendMessage("§aTu as modifié au joueur " + player.getName() + " le niveau de son " + type + " à " + amount);
							}
						}
                    }
					if(args[0].equalsIgnoreCase("forceplay")) {
						if(args.length == 1){
							sender.sendMessage("§cSyntax: /samurai forceplay <player>");
						}
						if(args.length == 2){
							Player player = Bukkit.getPlayer(args[1]);
							if(Main.getInstance().ingame.contains(player)) {
								sender.sendMessage("§cTu ne peux pas forcer le joueur §e" + player.getName() + " §cà jouer car il est déjà en jeu!");
							} else {
								Main.getInstance().actionPlay(player);
								sender.sendMessage("§aTu as forcé le joueur §e" + player.getName() + " §aà jouer!");
							}
						}
					}
				}
			}
		}
		return false;
	}

}
