package fr.haifunime.samourai.events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import fr.haifunime.samourai.Main;
import fr.haifunime.samourai.Menus;
import fr.haifunime.samourai.utils.BookUtils;

public class ProcessClick {
	
	public static void action(Player player, ItemStack current, Inventory inventory) {
		if(current == null || current.getItemMeta() == null || current.getItemMeta().getDisplayName() == null) { 
			player.updateInventory(); 
			return; 
		}
		if(current.getType().equals(Material.BOOK) && current.getItemMeta().getDisplayName().equals("§8× §6§lComment jouer !? §8×")) {
			BookUtils bu = new BookUtils();
			bu.openBook(BookUtils.book("Jouer", "Haifunime", new String[] {"§aEn cours de rédaction"}), player);
		}
		if(current.getType().equals(Material.IRON_AXE) && current.getItemMeta().getDisplayName().equals("§8× §6§lJouer §8×")) {
			Main.getInstance().actionPlay(player);
		}
		if(current.getType().equals(Material.MAGMA_CREAM) && current.getItemMeta().getDisplayName().equals("§8× §6§lAméliorations §8×")) {
			Menus.upgrades(player);
		}
		if(current.getType().equals(Material.BARRIER) && current.getItemMeta().getDisplayName().equals("§8× §6§lQuitter §4DEV-ONLY §8×")) {
			Main.getInstance().actionSpawn(player, true);
		}
		
		if(inventory.getName().equals("§f» §6§lAméliorations")) {
			if(current.getItemMeta().getDisplayName().equals("§f» §e§lCasque")) {
				if(ManagePlayerdata.getUpgrade(player, "helmet") == 0) {
					if(ManagePlayerdata.getGemmes(player) >= 2) {
						ManagePlayerdata.removeGemmes(player, 2);
						ManagePlayerdata.setUpgrade(player, "helmet", 1);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "helmet") == 1) {
					if(ManagePlayerdata.getGemmes(player) >= 4) {
						ManagePlayerdata.removeGemmes(player, 4);
						ManagePlayerdata.setUpgrade(player, "helmet", 2);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "helmet") == 2) {
					if(ManagePlayerdata.getGemmes(player) >= 7) {
						ManagePlayerdata.removeGemmes(player, 7);
						ManagePlayerdata.setUpgrade(player, "helmet", 3);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "helmet") == 3) {
					if(ManagePlayerdata.getGemmes(player) >= 10) {
						ManagePlayerdata.removeGemmes(player, 10);
						ManagePlayerdata.setUpgrade(player, "helmet", 4);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "helmet") == 4) {
					if(ManagePlayerdata.getGemmes(player) >= 15) {
						ManagePlayerdata.removeGemmes(player, 15);
						ManagePlayerdata.setUpgrade(player, "helmet", 5);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
			}
			if(current.getItemMeta().getDisplayName().equals("§f» §e§lPlastron")) {
				if(ManagePlayerdata.getUpgrade(player, "chestplate") == 0) {
					if(ManagePlayerdata.getGemmes(player) >= 3) {
						ManagePlayerdata.removeGemmes(player, 3);
						ManagePlayerdata.setUpgrade(player, "chestplate", 1);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "chestplate") == 1) {
					if(ManagePlayerdata.getGemmes(player) >= 5) {
						ManagePlayerdata.removeGemmes(player, 5);
						ManagePlayerdata.setUpgrade(player, "chestplate", 2);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "chestplate") == 2) {
					if(ManagePlayerdata.getGemmes(player) >= 8) {
						ManagePlayerdata.removeGemmes(player, 8);
						ManagePlayerdata.setUpgrade(player, "chestplate", 3);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "chestplate") == 3) {
					if(ManagePlayerdata.getGemmes(player) >= 12) {
						ManagePlayerdata.removeGemmes(player, 12);
						ManagePlayerdata.setUpgrade(player, "chestplate", 4);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "chestplate") == 4) {
					if(ManagePlayerdata.getGemmes(player) >= 18) {
						ManagePlayerdata.removeGemmes(player, 18);
						ManagePlayerdata.setUpgrade(player, "chestplate", 5);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
			}
			if(current.getItemMeta().getDisplayName().equals("§f» §e§lJambières")) {
				if(ManagePlayerdata.getUpgrade(player, "leggings") == 0) {
					if(ManagePlayerdata.getGemmes(player) >= 3) {
						ManagePlayerdata.removeGemmes(player, 3);
						ManagePlayerdata.setUpgrade(player, "leggings", 1);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "leggings") == 1) {
					if(ManagePlayerdata.getGemmes(player) >= 5) {
						ManagePlayerdata.removeGemmes(player, 5);
						ManagePlayerdata.setUpgrade(player, "leggings", 2);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "leggings") == 2) {
					if(ManagePlayerdata.getGemmes(player) >= 8) {
						ManagePlayerdata.removeGemmes(player, 8);
						ManagePlayerdata.setUpgrade(player, "leggings", 3);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "leggings") == 3) {
					if(ManagePlayerdata.getGemmes(player) >= 12) {
						ManagePlayerdata.removeGemmes(player, 12);
						ManagePlayerdata.setUpgrade(player, "leggings", 4);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "leggings") == 4) {
					if(ManagePlayerdata.getGemmes(player) >= 18) {
						ManagePlayerdata.removeGemmes(player, 18);
						ManagePlayerdata.setUpgrade(player, "leggings", 5);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
			}
			if(current.getItemMeta().getDisplayName().equals("§f» §e§lBottes")) {
				if(ManagePlayerdata.getUpgrade(player, "boots") == 0) {
					if(ManagePlayerdata.getGemmes(player) >= 2) {
						ManagePlayerdata.removeGemmes(player, 2);
						ManagePlayerdata.setUpgrade(player, "boots", 1);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "boots") == 1) {
					if(ManagePlayerdata.getGemmes(player) >= 4) {
						ManagePlayerdata.removeGemmes(player, 4);
						ManagePlayerdata.setUpgrade(player, "boots", 2);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "boots") == 2) {
					if(ManagePlayerdata.getGemmes(player) >= 7) {
						ManagePlayerdata.removeGemmes(player, 7);
						ManagePlayerdata.setUpgrade(player, "boots", 3);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "boots") == 3) {
					if(ManagePlayerdata.getGemmes(player) >= 10) {
						ManagePlayerdata.removeGemmes(player, 10);
						ManagePlayerdata.setUpgrade(player, "boots", 4);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "boots") == 4) {
					if(ManagePlayerdata.getGemmes(player) >= 15) {
						ManagePlayerdata.removeGemmes(player, 15);
						ManagePlayerdata.setUpgrade(player, "boots", 5);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
			}
			if(current.getItemMeta().getDisplayName().equals("§f» §e§lKatana")) {
				if(ManagePlayerdata.getUpgrade(player, "katana") == 0) {
					if(ManagePlayerdata.getGemmes(player) >= 4) {
						ManagePlayerdata.removeGemmes(player, 4);
						ManagePlayerdata.setUpgrade(player, "katana", 1);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "katana") == 1) {
					if(ManagePlayerdata.getGemmes(player) >= 6) {
						ManagePlayerdata.removeGemmes(player, 6);
						ManagePlayerdata.setUpgrade(player, "katana", 2);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "katana") == 2) {
					if(ManagePlayerdata.getGemmes(player) >= 10) {
						ManagePlayerdata.removeGemmes(player, 10);
						ManagePlayerdata.setUpgrade(player, "katana", 3);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "katana") == 3) {
					if(ManagePlayerdata.getGemmes(player) >= 15) {
						ManagePlayerdata.removeGemmes(player, 15);
						ManagePlayerdata.setUpgrade(player, "katana", 4);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "katana") == 4) {
					if(ManagePlayerdata.getGemmes(player) >= 20) {
						ManagePlayerdata.removeGemmes(player, 20);
						ManagePlayerdata.setUpgrade(player, "katana", 5);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
			}
			if(current.getItemMeta().getDisplayName().equals("§f» §e§lRune de Soin")) {
				if(ManagePlayerdata.getUpgrade(player, "healthrune") == 0) {
					if(ManagePlayerdata.getGemmes(player) >= 15) {
						ManagePlayerdata.removeGemmes(player, 15);
						ManagePlayerdata.setUpgrade(player, "healthrune", 1);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
			}
			if(current.getItemMeta().getDisplayName().equals("§f» §e§lArc")) {
				if(ManagePlayerdata.getUpgrade(player, "bow") == 0) {
					if(ManagePlayerdata.getGemmes(player) >= 5) {
						ManagePlayerdata.removeGemmes(player, 5);
						ManagePlayerdata.setUpgrade(player, "bow", 1);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "bow") == 1) {
					if(ManagePlayerdata.getGemmes(player) >= 8) {
						ManagePlayerdata.removeGemmes(player, 8);
						ManagePlayerdata.setUpgrade(player, "bow", 2);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "bow") == 2) {
					if(ManagePlayerdata.getGemmes(player) >= 10) {
						ManagePlayerdata.removeGemmes(player, 10);
						ManagePlayerdata.setUpgrade(player, "bow", 3);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "bow") == 3) {
					if(ManagePlayerdata.getGemmes(player) >= 15) {
						ManagePlayerdata.removeGemmes(player, 15);
						ManagePlayerdata.setUpgrade(player, "bow", 4);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
				if(ManagePlayerdata.getUpgrade(player, "bow") == 4) {
					if(ManagePlayerdata.getGemmes(player) >= 20) {
						ManagePlayerdata.removeGemmes(player, 20);
						ManagePlayerdata.setUpgrade(player, "bow", 5);
						Menus.upgrades(player);
						player.updateInventory();
						return;
					} else {
						player.sendMessage("§f§l(§c§l!§f§l) §cVous n'avez pas assez de gemmes pour améliorer ceci.");
					}
				}
			}
			if(current.getItemMeta().getDisplayName().equals("§f» §c§lFermer le menu")) {
				player.closeInventory();
			}
		}
	}

}
