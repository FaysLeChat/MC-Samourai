package fr.haifunime.samourai;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.UUID;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;

import fr.haifunime.samourai.events.ManagePlayerdata;

public class Menus {
	
	public static void upgrades(Player player) {
		Inventory upgrades = Bukkit.getServer().createInventory(player, 6*9, "§f» §6§lAméliorations");
		
		ItemStack points = new ItemStack(Material.EMERALD, 1);
		ItemMeta pointsM = points.getItemMeta();
		pointsM.setDisplayName("§f» §e§lMes points disponibles");
		List<String> pointsLore = new ArrayList<>();
		pointsLore.add("§7Gemme(s) §f: §e" + ManagePlayerdata.getGemmes(player) + " §a⧫");
		pointsM.setLore(pointsLore);
		points.setItemMeta(pointsM);
		
		ItemStack helmet0 = new ItemStack(Material.INK_SACK, 1, (byte)8);
		ItemMeta helmet0M = helmet0.getItemMeta();
		helmet0M.setDisplayName("§f» §e§lCasque");
		List<String> helmet0Lore = new ArrayList<>();
		helmet0Lore.add("§7Type §f: §7Protection");
		helmet0Lore.add(" ");
		helmet0Lore.add("§3■ §f§lAmélioration §8▏ §c§lNon débloqué");
		helmet0Lore.add("§8➜ §aCasque en Cuir");
		helmet0Lore.add("§8➜ §aSanté (+2 ❤)");
		helmet0Lore.add(" ");
		helmet0Lore.add("§7Coût §f: §e2 §a⧫");
		helmet0M.setLore(helmet0Lore);
		helmet0.setItemMeta(helmet0M);
		
		ItemStack helmet1 = new ItemStack(Material.LEATHER_HELMET, 1);
		ItemMeta helmet1M = helmet1.getItemMeta();
		helmet1M.setDisplayName("§f» §e§lCasque");
		List<String> helmet1Lore = new ArrayList<>();
		helmet1Lore.add("§7Type §f: §7Protection");
		helmet1Lore.add(" ");
		helmet1Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 1");
		helmet1Lore.add("§a+ §8Casque en Cuir ➜ §aCasque en Or");
		helmet1Lore.add("§a+ §8Santé (+2 ❤)➜ §aSanté (+4 ❤)");
		helmet1Lore.add(" ");
		helmet1Lore.add("§fEffet §8- §cSanté ❤");
		helmet1Lore.add("§7§oCe casque accorde à son");
		helmet1Lore.add("§7§oporteur un bonus de santé.");
		helmet1Lore.add(" ");
		helmet1Lore.add("§7Coût §f: §e4 §a⧫");
		helmet1M.setLore(helmet1Lore);
		helmet1.setItemMeta(helmet1M);
		
		ItemStack helmet2 = new ItemStack(Material.GOLD_HELMET, 1);
		ItemMeta helmet2M = helmet2.getItemMeta();
		helmet2M.setDisplayName("§f» §e§lCasque");
		List<String> helmet2Lore = new ArrayList<>();
		helmet2Lore.add("§7Type §f: §7Protection");
		helmet2Lore.add(" ");
		helmet2Lore.add("§■ §f§lAmélioration §8▏ §b§lNiv. 2");
		helmet2Lore.add("§a+ §8Casque en Or ➜ §aCasque en Chaînes");
		helmet2Lore.add("§a+ §8Santé (+4 ❤)➜ §aSanté (+6 ❤)");
		helmet2Lore.add(" ");
		helmet2Lore.add("§fEffet §8- §cSanté ❤");
		helmet2Lore.add("§7§oCe casque accorde à son");
		helmet2Lore.add("§7§oporteur un bonus de santé.");
		helmet2Lore.add(" ");
		helmet2Lore.add("§7Coût §f: §e7 §a⧫");
		helmet2M.setLore(helmet2Lore);
		helmet2.setItemMeta(helmet2M);
		
		ItemStack helmet3 = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		ItemMeta helmet3M = helmet3.getItemMeta();
		helmet3M.setDisplayName("§f» §e§lCasque");
		List<String> helmet3Lore = new ArrayList<>();
		helmet3Lore.add("§7Type §f: §7Protection");
		helmet3Lore.add(" ");
		helmet3Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 3");
		helmet3Lore.add("§a+ §8Casque en Chaînes ➜ §aCasque en Fer");
		helmet3Lore.add("§a+ §8Santé (+6 ❤)➜ §aSanté (+8 ❤)");
		helmet3Lore.add(" ");
		helmet3Lore.add("§fEffet §8- §cSanté ❤");
		helmet3Lore.add("§7§oCe casque accorde à son");
		helmet3Lore.add("§7§oporteur un bonus de santé.");
		helmet3Lore.add(" ");
		helmet3Lore.add("§7Coût §f: §e10 §a⧫");
		helmet3M.setLore(helmet3Lore);
		helmet3.setItemMeta(helmet3M);
		
		ItemStack helmet4 = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta helmet4M = helmet4.getItemMeta();
		helmet4M.setDisplayName("§f» §e§lCasque");
		List<String> helmet4Lore = new ArrayList<>();
		helmet4Lore.add("§7Type §f: §7Protection");
		helmet4Lore.add(" ");
		helmet4Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 4");
		helmet4Lore.add("§a+ §8Casque en Fer ➜ §aCasque en Diamant");
		helmet4Lore.add("§a+ §8Santé (+8 ❤)➜ §aSanté (+10 ❤)");
		helmet4Lore.add(" ");
		helmet4Lore.add("§fEffet §8- §cSanté ❤");
		helmet4Lore.add("§7§oCe casque accorde à son");
		helmet4Lore.add("§7§oporteur un bonus de santé.");
		helmet4Lore.add(" ");
		helmet4Lore.add("§7Coût §f: §e15 §a⧫");
		helmet4M.setLore(helmet4Lore);
		helmet4.setItemMeta(helmet4M);
		
		ItemStack helmet5 = new ItemStack(Material.DIAMOND_HELMET, 1);
		ItemMeta helmet5M = helmet5.getItemMeta();
		helmet5M.setDisplayName("§f» §e§lCasque");
		List<String> helmet5Lore = new ArrayList<>();
		helmet5Lore.add("§7Type §f: §7Protection");
		helmet5Lore.add(" ");
		helmet5Lore.add("§3■ §f§lAmélioration §8▏ §e§lMAX.");
		helmet5Lore.add("§a+ §8Casque en Diamant");
		helmet5Lore.add("§a+ §8Santé (+10 ❤)");
		helmet5Lore.add(" ");
		helmet5Lore.add("§fEffet §8- §cSanté ❤");
		helmet5Lore.add("§7§oCe casque accorde à son");
		helmet5Lore.add("§7§oporteur un bonus de santé.");
		helmet5M.setLore(helmet5Lore);
		helmet5.setItemMeta(helmet5M);
		
		ItemStack katana0 = new ItemStack(Material.STICK, 1);
		ItemMeta katana0M = katana0.getItemMeta();
		katana0M.setDisplayName("§f» §e§lKatana");
		List<String> katana0Lore = new ArrayList<>();
		katana0Lore.add("§7Type §f: §7Corps à corps");
		katana0Lore.add(" ");
		katana0Lore.add("§3■ §f§lAmélioration §8▏ §c§lNon débloqué");
		katana0Lore.add("§a+ §8Kataka d'entrainement ➜ §aKatana en Bois");
		katana0Lore.add("§a+ §8Tranchant II");
		katana0Lore.add(" ");
		katana0Lore.add("§7Coût §f: §e4 §a⧫");
		katana0M.setLore(katana0Lore);
		katana0.setItemMeta(katana0M);
		
		ItemStack katana1 = new ItemStack(Material.WOOD_SWORD, 1);
		ItemMeta katana1M = katana1.getItemMeta();
		katana1M.setDisplayName("§f» §e§lKatana");
		List<String> katana1Lore = new ArrayList<>();
		katana1Lore.add("§7Type §f: §7Corps à corps");
		katana1Lore.add(" ");
		katana1Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 1");
		katana1Lore.add("§a+ §8Katana en Bois ➜ §aKatana en Pierre");
		katana1Lore.add(" ");
		katana1Lore.add("§7Coût §f: §e6 §a⧫");
		katana1M.setLore(katana1Lore);
		katana1.setItemMeta(katana1M);
		
		ItemStack katana2 = new ItemStack(Material.STONE_SWORD, 1);
		ItemMeta katana2M = katana2.getItemMeta();
		katana2M.setDisplayName("§f» §e§lKatana");
		List<String> katana2Lore = new ArrayList<>();
		katana2Lore.add("§7Type §f: §7Corps à corps");
		katana2Lore.add(" ");
		katana2Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 2");
		katana2Lore.add("§a+ §8Kataka en Pierre ➜ §aKatana en Fer");
		katana2Lore.add(" ");
		katana2Lore.add("§7Coût §f: §e10 §a⧫");
		katana2M.setLore(katana2Lore);
		katana2.setItemMeta(katana2M);
		
		ItemStack katana3 = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta katana3M = katana3.getItemMeta();
		katana3M.setDisplayName("§f» §e§lKatana");
		List<String> katana3Lore = new ArrayList<>();
		katana3Lore.add("§7Type §f: §7Corps à corps");
		katana3Lore.add(" ");
		katana3Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 3");
		katana3Lore.add("§a+ §8Kataka en Fer ➜ §aKatana en Diamant");
		katana3Lore.add(" ");
		katana3Lore.add("§7Coût §f: §e15 §a⧫");
		katana3M.setLore(katana3Lore);
		katana3.setItemMeta(katana3M);
		
		ItemStack katana4 = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta katana4M = katana4.getItemMeta();
		katana4M.setDisplayName("§f» §e§lKatana");
		List<String> katana4Lore = new ArrayList<>();
		katana4Lore.add("§7Type §f: §7Corps à corps");
		katana4Lore.add(" ");
		katana4Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 4");
		katana4Lore.add("§a+ §8Kataka en Diamant ➜ §aKatana en Or");
		katana4Lore.add("§8➜ §aTranchant IV");
		katana4Lore.add(" ");
		katana4Lore.add("§7Coût §f: §e20 §a⧫");
		katana4M.setLore(katana4Lore);
		katana4.setItemMeta(katana4M);
		
		ItemStack katana5 = new ItemStack(Material.GOLD_SWORD, 1);
		ItemMeta katana5M = katana5.getItemMeta();
		katana5M.setDisplayName("§f» §e§lKatana");
		List<String> katana5Lore = new ArrayList<>();
		katana5Lore.add("§7Type §f: §7Corps à corps");
		katana5Lore.add(" ");
		katana5Lore.add("§3■ §f§lAmélioration §8▏ §e§lMAX.");
		katana5Lore.add("§a+ §8Kataka en Or");
		katana5Lore.add("§a+ §8Tranchant IV");
		katana5M.setLore(katana5Lore);
		katana5.setItemMeta(katana5M);
		
		ItemStack bow0 = new ItemStack(Material.INK_SACK, 1, (byte)8);
		ItemMeta bow0M = bow0.getItemMeta();
		bow0M.setDisplayName("§f» §e§lArc");
		List<String> bow0Lore = new ArrayList<>();
		bow0Lore.add("§7Type §f: §7Distance");
		bow0Lore.add(" ");
		bow0Lore.add("§3■ §f§lAmélioration §8▏ §c§lNon débloquée");
		bow0Lore.add(" ");
		bow0Lore.add("§7Coût §f: §e5 §a⧫");
		bow0M.setLore(bow0Lore);
		bow0.setItemMeta(bow0M);
		
		ItemStack bow1 = new ItemStack(Material.BOW, 1);
		ItemMeta bow1M = bow1.getItemMeta();
		bow1M.setDisplayName("§f» §e§lArc");
		List<String> bow1Lore = new ArrayList<>();
		bow1Lore.add("§7Type §f: §7Distance");
		bow1Lore.add(" ");
		bow1Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 1");
		bow1Lore.add("§a+ §8Infinité I");
		bow1Lore.add("§8➜ §aPuissance I");
		bow1Lore.add(" ");
		bow1Lore.add("§7Coût §f: §e8 §a⧫");
		bow1M.setLore(bow1Lore);
		bow1.setItemMeta(bow1M);
		
		ItemStack bow2 = new ItemStack(Material.BOW, 1);
		ItemMeta bow2M = bow2.getItemMeta();
		bow2M.setDisplayName("§f» §e§lArc");
		List<String> bow2Lore = new ArrayList<>();
		bow2Lore.add("§7Type §f: §7Distance");
		bow2Lore.add(" ");
		bow2Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 2");
		bow2Lore.add("§a+ §8Infinité I");
		bow2Lore.add("§8➜ §aPuissance I");
		bow2Lore.add("§8➜ §aRecul I");
		bow2Lore.add(" ");
		bow2Lore.add("§7Coût §f: §e10 §a⧫");
		bow2M.setLore(bow2Lore);
		bow2.setItemMeta(bow2M);
		
		ItemStack bow3 = new ItemStack(Material.BOW, 1);
		ItemMeta bow3M = bow3.getItemMeta();
		bow3M.setDisplayName("§f» §e§lArc");
		List<String> bow3Lore = new ArrayList<>();
		bow3Lore.add("§7Type §f: §7Distance");
		bow3Lore.add(" ");
		bow3Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 3");
		bow3Lore.add("§a+ §8Infinité I");
		bow3Lore.add("§a+ §8Puissance I §8➜ §aPuissance II");
		bow2Lore.add("§8➜ §aRecul I");
		bow3Lore.add(" ");
		bow3Lore.add("§7Coût §f: §e15 §a⧫");
		bow3M.setLore(bow3Lore);
		bow3.setItemMeta(bow3M);
		
		ItemStack bow4 = new ItemStack(Material.BOW, 1);
		ItemMeta bow4M = bow4.getItemMeta();
		bow4M.setDisplayName("§f» §e§lArc");
		List<String> bow4Lore = new ArrayList<>();
		bow4Lore.add("§7Type §f: §7Distance");
		bow4Lore.add(" ");
		bow4Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 4");
		bow4Lore.add("§a+ §8Infinité I");
		bow4Lore.add("§a+ §8Puissance II §8➜ §aPuissance III");
		bow4Lore.add("§a+ §8Recul I §8➜ §aRecul II");
		bow4Lore.add(" ");
		bow4Lore.add("§7Coût §f: §e20 §a⧫");
		bow4M.setLore(bow4Lore);
		bow4.setItemMeta(bow4M);
		
		ItemStack bow5 = new ItemStack(Material.BOW, 1);
		ItemMeta bow5M = bow5.getItemMeta();
		bow5M.setDisplayName("§f» §e§lArc");
		List<String> bow5Lore = new ArrayList<>();
		bow5Lore.add("§7Type §f: §7Distance");
		bow5Lore.add(" ");
		bow5Lore.add("§3■ §f§lAmélioration §8▏ §e§lMAX.");
		bow5Lore.add("§a+ §8Infinité I");
		bow5Lore.add("§a+ §8Puissance III");
		bow5Lore.add("§a+ §8Recul II");
		bow5M.setLore(bow5Lore);
		bow5.setItemMeta(bow5M);
		
		ItemStack chestplate0 = new ItemStack(Material.INK_SACK, 1, (byte)8);
		ItemMeta chestplate0M = chestplate0.getItemMeta();
		chestplate0M.setDisplayName("§f» §e§lPlastron");
		List<String> chestplate0Lore = new ArrayList<>();
		chestplate0Lore.add("§7Type §f: §7Protection");
		chestplate0Lore.add(" ");
		chestplate0Lore.add("§3■ §f§lAmélioration §8▏ §c§lNon débloqué");
		chestplate0Lore.add("§8➜ §aPlastron en Cuir");
		chestplate0Lore.add("§8➜ §aProtection I");
		chestplate0Lore.add("§8➜ §aEpines I");
		chestplate0Lore.add(" ");
		chestplate0Lore.add("§7Coût §f: §e3 §a⧫");
		chestplate0M.setLore(chestplate0Lore);
		chestplate0.setItemMeta(chestplate0M);
		
		ItemStack chestplate1 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		ItemMeta chestplate1M = chestplate1.getItemMeta();
		chestplate1M.setDisplayName("§f» §e§lPlastron");
		List<String> chestplate1Lore = new ArrayList<>();
		chestplate1Lore.add("§7Type §f: §7Protection");
		chestplate1Lore.add(" ");
		chestplate1Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 1");
		chestplate1Lore.add("§a+ §8Plastron en Cuir ➜ §aPlastron en Or");
		chestplate1Lore.add("§a+ §8Protection I");
		chestplate1Lore.add("§a+ §8Epines I ➜ §aEpines II");
		chestplate1Lore.add(" ");
		chestplate1Lore.add("§fEffet §8- §3Epines ✷");
		chestplate1Lore.add("§7§oCe plastron renvoie une partie");
		chestplate1Lore.add("§7§odes dégats subis à l'ennemi.");
		chestplate1Lore.add(" ");
		chestplate1Lore.add("§7Coût §f: §e5 §a⧫");
		chestplate1M.setLore(chestplate1Lore);
		chestplate1.setItemMeta(chestplate1M);
		
		ItemStack chestplate2 = new ItemStack(Material.GOLD_CHESTPLATE, 1);
		ItemMeta chestplate2M = chestplate2.getItemMeta();
		chestplate2M.setDisplayName("§f» §e§lPlastron");
		List<String> chestplate2Lore = new ArrayList<>();
		chestplate2Lore.add("§7Type §f: §7Protection");
		chestplate2Lore.add(" ");
		chestplate2Lore.add("§■ §f§lAmélioration §8▏ §b§lNiv. 2");
		chestplate2Lore.add("§a+ §8Plastron en Or ➜ §aPlastron en Chaînes");
		chestplate2Lore.add("§a+ §8Protection I ➜ §aProtection II");
		chestplate2Lore.add("§a+ §8Epines II ➜ §aEpines III");
		chestplate2Lore.add(" ");
		chestplate2Lore.add("§fEffet §8- §3Epines ✷");
		chestplate2Lore.add("§7§oCe plastron renvoie une partie");
		chestplate2Lore.add("§7§odes dégats subis à l'ennemi.");
		chestplate2Lore.add(" ");
		chestplate2Lore.add("§7Coût §f: §e8 §a⧫");
		chestplate2M.setLore(chestplate2Lore);
		chestplate2.setItemMeta(chestplate2M);
		
		ItemStack chestplate3 = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
		ItemMeta chestplate3M = chestplate3.getItemMeta();
		chestplate3M.setDisplayName("§f» §e§lPlastron");
		List<String> chestplate3Lore = new ArrayList<>();
		chestplate3Lore.add("§7Type §f: §7Protection");
		chestplate3Lore.add(" ");
		chestplate3Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 3");
		chestplate3Lore.add("§a+ §8Plastron en Chaînes ➜ §aPlastron en Fer");
		chestplate3Lore.add("§a+ §8Protection II");
		chestplate3Lore.add("§a+ §8Epines III ➜ §aEpines IV");
		chestplate3Lore.add(" ");
		chestplate3Lore.add("§fEffet §8- §3Epines ✷");
		chestplate3Lore.add("§7§oCe plastron renvoie une partie");
		chestplate3Lore.add("§7§odes dégats subis à l'ennemi.");
		chestplate3Lore.add(" ");
		chestplate3Lore.add("§7Coût §f: §e12 §a⧫");
		chestplate3M.setLore(chestplate3Lore);
		chestplate3.setItemMeta(chestplate3M);
		
		ItemStack chestplate4 = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta chestplate4M = chestplate4.getItemMeta();
		chestplate4M.setDisplayName("§f» §e§lPlastron");
		List<String> chestplate4Lore = new ArrayList<>();
		chestplate4Lore.add("§7Type §f: §7Protection");
		chestplate4Lore.add(" ");
		chestplate4Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 4");
		chestplate4Lore.add("§a+ §8Plastron en Fer ➜ §aPlastron en Diamant");
		chestplate4Lore.add("§a+ §8Protection II ➜ §aProtection III");
		chestplate4Lore.add("§a+ §8Epines IV ➜ §aEpines V");
		chestplate4Lore.add(" ");
		chestplate4Lore.add("§fEffet §8- §3Epines ✷");
		chestplate4Lore.add("§7§oCe plastron renvoie une partie");
		chestplate4Lore.add("§7§odes dégats subis à l'ennemi.");
		chestplate4Lore.add(" ");
		chestplate4Lore.add("§7Coût §f: §e18 §a⧫");
		chestplate4M.setLore(chestplate4Lore);
		chestplate4.setItemMeta(chestplate4M);
		
		ItemStack chestplate5 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
		ItemMeta chestplate5M = chestplate5.getItemMeta();
		chestplate5M.setDisplayName("§f» §e§lPlastron");
		List<String> chestplate5Lore = new ArrayList<>();
		chestplate5Lore.add("§7Type §f: §7Protection");
		chestplate5Lore.add(" ");
		chestplate5Lore.add("§3■ §f§lAmélioration §8▏ §e§lMAX.");
		chestplate5Lore.add("§a+ §8Plastron en Diamant");
		chestplate5Lore.add("§a+ §8Protection III");
		chestplate5Lore.add("§a+ §8Epines V");
		chestplate5Lore.add(" ");
		chestplate5Lore.add("§fEffet §8- §3Epines ✷");
		chestplate5Lore.add("§7§oCe plastron renvoie une partie");
		chestplate5Lore.add("§7§odes dégats subis à l'ennemi.");
		chestplate5M.setLore(chestplate5Lore);
		chestplate5.setItemMeta(chestplate5M);
		
		ItemStack leggings0 = new ItemStack(Material.INK_SACK, 1, (byte)8);
		ItemMeta leggings0M = leggings0.getItemMeta();
		leggings0M.setDisplayName("§f» §e§lJambières");
		List<String> leggings0Lore = new ArrayList<>();
		leggings0Lore.add("§7Type §f: §7Protection");
		leggings0Lore.add(" ");
		leggings0Lore.add("§3■ §f§lAmélioration §8▏ §c§lNon débloqué");
		leggings0Lore.add("§8➜ §aJambières en Cuir");
		leggings0Lore.add("§8➜ §aVitesse (x15%)");
		leggings0Lore.add(" ");
		leggings0Lore.add("§7Coût §f: §e3 §a⧫");
		leggings0M.setLore(leggings0Lore);
		leggings0.setItemMeta(leggings0M);
		
		ItemStack leggings1 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
		ItemMeta leggings1M = leggings1.getItemMeta();
		leggings1M.setDisplayName("§f» §e§lJambières");
		List<String> leggings1Lore = new ArrayList<>();
		leggings1Lore.add("§7Type §f: §7Protection");
		leggings1Lore.add(" ");
		leggings1Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 1");
		leggings1Lore.add("§a+ §8Jambières en Cuir ➜ §aJambières en Or");
		leggings1Lore.add("§a+ §8Vitesse (x15%%) ➜ §aVitesse (x30%)");
		leggings1Lore.add(" ");
		leggings1Lore.add("§fEffet §8- §bVitesse ✈");
		leggings1Lore.add("§7§oCes jambières accordent à son");
		leggings1Lore.add("§7§oporteur un bonus de vitesse.");
		leggings1Lore.add(" ");
		leggings1Lore.add("§7Coût §f: §e5 §a⧫");
		leggings1M.setLore(leggings1Lore);
		leggings1.setItemMeta(leggings1M);
		
		ItemStack leggings2 = new ItemStack(Material.GOLD_LEGGINGS, 1);
		ItemMeta leggings2M = leggings2.getItemMeta();
		leggings2M.setDisplayName("§f» §e§lJambières");
		List<String> leggings2Lore = new ArrayList<>();
		leggings2Lore.add("§7Type §f: §7Protection");
		leggings2Lore.add(" ");
		leggings2Lore.add("§■ §f§lAmélioration §8▏ §b§lNiv. 2");
		leggings2Lore.add("§a+ §8Jambières en Or ➜ §aJambières en Chaînes");
		leggings2Lore.add("§a+ §8Vitesse (x30%%) ➜ §aVitesse (x45%)");
		leggings2Lore.add(" ");
		leggings2Lore.add("§fEffet §8- §bVitesse ✈");
		leggings2Lore.add("§7§oCes jambières accordent à son");
		leggings2Lore.add("§7§oporteur un bonus de vitesse.");
		leggings2Lore.add(" ");
		leggings2Lore.add("§7Coût §f: §e8 §a⧫");
		leggings2M.setLore(leggings2Lore);
		leggings2.setItemMeta(leggings2M);
		
		ItemStack leggings3 = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
		ItemMeta leggings3M = leggings3.getItemMeta();
		leggings3M.setDisplayName("§f» §e§lJambières");
		List<String> leggings3Lore = new ArrayList<>();
		leggings3Lore.add("§7Type §f: §7Protection");
		leggings3Lore.add(" ");
		leggings3Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 3");
		leggings3Lore.add("§a+ §8Jambières en Chaînes ➜ §aJambières en Fer");
		leggings3Lore.add("§a+ §8Vitesse (x45%%) ➜ §aVitesse (x60%)");
		leggings3Lore.add(" ");
		leggings3Lore.add("§fEffet §8- §bVitesse ✈");
		leggings3Lore.add("§7§oCes jambières accordent à son");
		leggings3Lore.add("§7§oporteur un bonus de vitesse.");
		leggings3Lore.add(" ");
		leggings3Lore.add("§7Coût §f: §e12 §a⧫");
		leggings3M.setLore(leggings3Lore);
		leggings3.setItemMeta(leggings3M);
		
		ItemStack leggings4 = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta leggings4M = leggings4.getItemMeta();
		leggings4M.setDisplayName("§f» §e§lJambières");
		List<String> leggings4Lore = new ArrayList<>();
		leggings4Lore.add("§7Type §f: §7Protection");
		leggings4Lore.add(" ");
		leggings4Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 4");
		leggings4Lore.add("§a+ §8Jambières en Fer ➜ §aJambières en Diamant");
		leggings4Lore.add("§a+ §8Vitesse (x60%%) ➜ §aVitesse (x75%)");
		leggings4Lore.add(" ");
		leggings4Lore.add("§fEffet §8- §bVitesse ✈");
		leggings4Lore.add("§7§oCes jambières accordent à son");
		leggings4Lore.add("§7§oporteur un bonus de vitesse.");
		leggings4Lore.add(" ");
		leggings4Lore.add("§7Coût §f: §e18 §a⧫");
		leggings4M.setLore(leggings4Lore);
		leggings4.setItemMeta(leggings4M);
		
		ItemStack leggings5 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
		ItemMeta leggings5M = leggings5.getItemMeta();
		leggings5M.setDisplayName("§f» §e§lJambières");
		List<String> leggings5Lore = new ArrayList<>();
		leggings5Lore.add("§7Type §f: §7Protection");
		leggings5Lore.add(" ");
		leggings5Lore.add("§3■ §f§lAmélioration §8▏ §e§lMAX.");
		leggings5Lore.add("§a+ §8Jambières en Diamant");
		leggings5Lore.add("§a+ §8Vitesse (x75%)");
		leggings5Lore.add(" ");
		leggings5Lore.add("§fEffet §8- §bVitesse ✈");
		leggings5Lore.add("§7§oCes jambières accordent à son");
		leggings5Lore.add("§7§oporteur un bonus de vitesse.");
		leggings5M.setLore(leggings5Lore);
		leggings5.setItemMeta(leggings5M);
		
		ItemStack healthrune0 = new ItemStack(Material.INK_SACK, 1, (byte)8);
		ItemMeta healthrune0M = healthrune0.getItemMeta();
		healthrune0M.setDisplayName("§f» §e§lRune de Soin");
		List<String> healthrune0Lore = new ArrayList<>();
		healthrune0Lore.add("§7Type §f: §7Pierre runique");
		healthrune0Lore.add(" ");
		healthrune0Lore.add("§3■ §f§lAmélioration §8▏ §c§lNon débloqué");
		healthrune0Lore.add("§8➜ §aRégénération passive");
		healthrune0Lore.add(" ");
		healthrune0Lore.add("§fEffet §8- §cRune §f:");
		healthrune0Lore.add("§7§oTuer un ennemi offre à son");
		healthrune0Lore.add("§7§oporteur une régénération passive.");
		healthrune0Lore.add(" ");
		healthrune0Lore.add("§7Coût §f: §e15 §a⧫");
		healthrune0M.setLore(healthrune0Lore);
		healthrune0.setItemMeta(healthrune0M);
		
		Field profileField = null;
		ItemStack healthrune1 = new ItemStack(Material.SKULL_ITEM, 1, (short) 3);
        SkullMeta healthrune1M = (SkullMeta)healthrune1.getItemMeta();
        healthrune1M.setDisplayName("§f» §e§lRune de Soin");
        List<String> healthrune1Lore = new ArrayList<>();
        healthrune1Lore.add("§7Type §f: §7Pierre runique");
        healthrune1Lore.add("");
        healthrune1Lore.add("§3■ §f§lAmélioration §8▏ §e§lMAX.");
        healthrune1Lore.add("§a+ §8Régénération passive");
        healthrune1Lore.add("");
        healthrune1Lore.add("§fEffet §8- §cRune §f:");
        healthrune1Lore.add("§7§oTuer un ennemi offre à son");
        healthrune1Lore.add("§7§oporteur une régénération passive.");
        healthrune1M.setLore(healthrune1Lore);
        GameProfile profile = new GameProfile(UUID.randomUUID(), null);
        byte[] data = Base64.getEncoder().encode(String.format(
                "{textures:{SKIN:{url:\"%s\"}}}", "http://textures.minecraft.net/texture/a07a44410bfc09702f1701a8793c83f915237399e4944652cc762f7e4adb7a77").getBytes());
        profile.getProperties().put("textures", new Property("textures", new String(data)));
        try {
            if (profileField == null) {
                profileField = healthrune1M.getClass().getDeclaredField("profile");
            }
            profileField.setAccessible(true);
            profileField.set(healthrune1M, profile);
            healthrune1.setItemMeta(healthrune1M);
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
		
		ItemStack boots0 = new ItemStack(Material.INK_SACK, 1, (byte)8);
		ItemMeta boots0M = boots0.getItemMeta();
		boots0M.setDisplayName("§f» §e§lBottes");
		List<String> boots0Lore = new ArrayList<>();
		boots0Lore.add("§7Type §f: §7Protection");
		boots0Lore.add(" ");
		boots0Lore.add("§3■ §f§lAmélioration §8▏ §c§lNon débloqué");
		boots0Lore.add("§8➜ §aBottes en Cuir");
		boots0Lore.add("§8➜ §aChute amortie I");
		boots0Lore.add(" ");
		boots0Lore.add("§7Coût §f: §e2 §a⧫");
		boots0M.setLore(boots0Lore);
		boots0.setItemMeta(boots0M);
		
		ItemStack boots1 = new ItemStack(Material.LEATHER_BOOTS, 1);
		ItemMeta boots1M = boots1.getItemMeta();
		boots1M.setDisplayName("§f» §e§lBottes");
		List<String> boots1Lore = new ArrayList<>();
		boots1Lore.add("§7Type §f: §7Protection");
		boots1Lore.add(" ");
		boots1Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 1");
		boots1Lore.add("§a+ §8Bottes en Cuir ➜ §aBottes en Or");
		boots1Lore.add("§a+ §8Chute amortie I");
		boots1Lore.add(" ");
		boots1Lore.add("§7Coût §f: §e4 §a⧫");
		boots1M.setLore(boots1Lore);
		boots1.setItemMeta(boots1M);
		
		ItemStack boots2 = new ItemStack(Material.GOLD_BOOTS, 1);
		ItemMeta boots2M = boots2.getItemMeta();
		boots2M.setDisplayName("§f» §e§lBottes");
		List<String> boots2Lore = new ArrayList<>();
		boots2Lore.add("§7Type §f: §7Protection");
		boots2Lore.add(" ");
		boots2Lore.add("§■ §f§lAmélioration §8▏ §b§lNiv. 2");
		boots2Lore.add("§a+ §8Bottes en Or ➜ §aBottes en Chaînes");
		boots2Lore.add("§a+ §8Chute amortie I ➜ §aChute amortie II");
		boots2Lore.add("§8➜ §aRebond I");
		boots2Lore.add(" ");
		boots2Lore.add("§7Coût §f: §e7 §a⧫");
		boots2M.setLore(boots2Lore);
		boots2.setItemMeta(boots2M);
		
		ItemStack boots3 = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
		ItemMeta boots3M = boots3.getItemMeta();
		boots3M.setDisplayName("§f» §e§lBottes");
		List<String> boots3Lore = new ArrayList<>();
		boots3Lore.add("§7Type §f: §7Protection");
		boots3Lore.add(" ");
		boots3Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 3");
		boots3Lore.add("§a+ §8Bottes en Chaînes ➜ §aBottes en Fer");
		boots3Lore.add("§a+ §8Chute amortie II");
		boots3Lore.add("§a+ §8Rebond I");
		boots3Lore.add(" ");
		boots3Lore.add("§fEffet §8- §aRebond ➹");
		boots3Lore.add("§7§oCes bottes offrent un bonus");
		boots3Lore.add("§7§ode Saut I à son porteur.");
		boots3Lore.add(" ");
		boots3Lore.add("§7Coût §f: §e10 §a⧫");
		boots3M.setLore(boots3Lore);
		boots3.setItemMeta(boots3M);
		
		ItemStack boots4 = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta boots4M = boots4.getItemMeta();
		boots4M.setDisplayName("§f» §e§lBottes");
		List<String> boots4Lore = new ArrayList<>();
		boots4Lore.add("§7Type §f: §7Protection");
		boots4Lore.add(" ");
		boots4Lore.add("§3■ §f§lAmélioration §8▏ §b§lNiv. 4");
		boots4Lore.add("§a+ §8Bottes en Fer ➜ §aBottes en Diamant");
		boots4Lore.add("§a+ §8Chute amortie II ➜ §aChute amortie III");
		boots4Lore.add("§a+ §8Rebond I ➜ §aRebond II");
		boots4Lore.add(" ");
		boots4Lore.add("§fEffet §8- §aRebond ➹");
		boots4Lore.add("§7§oCes bottes offrent un bonus");
		boots4Lore.add("§7§ode Saut I à son porteur.");
		boots4Lore.add(" ");
		boots4Lore.add("§7Coût §f: §e15 §a⧫");
		boots4M.setLore(boots4Lore);
		boots4.setItemMeta(boots4M);
		
		ItemStack boots5 = new ItemStack(Material.DIAMOND_BOOTS, 1);
		ItemMeta boots5M = boots5.getItemMeta();
		boots5M.setDisplayName("§f» §e§lBottes");
		List<String> boots5Lore = new ArrayList<>();
		boots5Lore.add("§7Type §f: §7Protection");
		boots5Lore.add(" ");
		boots5Lore.add("§3■ §f§lAmélioration §8▏ §e§lMAX.");
		boots5Lore.add("§a+ §8Bottes en Diamant");
		boots5Lore.add("§a+ §8Chute amortie III");
		boots5Lore.add("§a+ §8Rebond II");
		boots5Lore.add(" ");
		boots5Lore.add("§fEffet §8- §aRebond ➹");
		boots5Lore.add("§7§oCes bottes offrent un bonus");
		boots5Lore.add("§7§ode Saut I à son porteur.");
		boots5M.setLore(boots5Lore);
		boots5.setItemMeta(boots5M);
		
		ItemStack exit = new ItemStack(Material.ARROW, 1);
		ItemMeta exitM = exit.getItemMeta();
		exitM.setDisplayName("§f» §c§lFermer le menu");
		exit.setItemMeta(exitM);
		
		upgrades.setItem(8, points);
		
		if(ManagePlayerdata.getUpgrade(player, "helmet") == 0) {
			upgrades.setItem(11, helmet0);
		}
		if(ManagePlayerdata.getUpgrade(player, "helmet") == 1) {
			upgrades.setItem(11, helmet1);
		}
		if(ManagePlayerdata.getUpgrade(player, "helmet") == 2) {
			upgrades.setItem(11, helmet2);
		}
		if(ManagePlayerdata.getUpgrade(player, "helmet") == 3) {
			upgrades.setItem(11, helmet3);
		}
		if(ManagePlayerdata.getUpgrade(player, "helmet") == 4) {
			upgrades.setItem(11, helmet4);
		}
		if(ManagePlayerdata.getUpgrade(player, "helmet") == 5) {
			upgrades.setItem(11, helmet5);
		}
		
		if(ManagePlayerdata.getUpgrade(player, "katana") == 0) {
			upgrades.setItem(13, katana0);
		}
		if(ManagePlayerdata.getUpgrade(player, "katana") == 1) {
			upgrades.setItem(13, katana1);
		}
		if(ManagePlayerdata.getUpgrade(player, "katana") == 2) {
			upgrades.setItem(13, katana2);
		}
		if(ManagePlayerdata.getUpgrade(player, "katana") == 3) {
			upgrades.setItem(13, katana3);
		}
		if(ManagePlayerdata.getUpgrade(player, "katana") == 4) {
			upgrades.setItem(13, katana4);
		}
		if(ManagePlayerdata.getUpgrade(player, "katana") == 5) {
			upgrades.setItem(13, katana5);
		}
		
		if(ManagePlayerdata.getUpgrade(player, "bow") == 0) {
			upgrades.setItem(15, bow0);
		}
		if(ManagePlayerdata.getUpgrade(player, "bow") == 1) {
			upgrades.setItem(15, bow1);
		}
		if(ManagePlayerdata.getUpgrade(player, "bow") == 2) {
			upgrades.setItem(15, bow2);
		}
		if(ManagePlayerdata.getUpgrade(player, "bow") == 3) {
			upgrades.setItem(15, bow3);
		}
		if(ManagePlayerdata.getUpgrade(player, "bow") == 4) {
			upgrades.setItem(15, bow4);
		}
		if(ManagePlayerdata.getUpgrade(player, "bow") == 5) {
			upgrades.setItem(15, bow5);
		}
		
		if(ManagePlayerdata.getUpgrade(player, "chestplate") == 0) {
			upgrades.setItem(20, chestplate0);
		}
		if(ManagePlayerdata.getUpgrade(player, "chestplate") == 1) {
			upgrades.setItem(20, chestplate1);
		}
		if(ManagePlayerdata.getUpgrade(player, "chestplate") == 2) {
			upgrades.setItem(20, chestplate2);
		}
		if(ManagePlayerdata.getUpgrade(player, "chestplate") == 3) {
			upgrades.setItem(20, chestplate3);
		}
		if(ManagePlayerdata.getUpgrade(player, "chestplate") == 4) {
			upgrades.setItem(20, chestplate4);
		}
		if(ManagePlayerdata.getUpgrade(player, "chestplate") == 5) {
			upgrades.setItem(20, chestplate5);
		}
		
		if(ManagePlayerdata.getUpgrade(player, "leggings") == 0) {
			upgrades.setItem(29, leggings0);
		}
		if(ManagePlayerdata.getUpgrade(player, "leggings") == 1) {
			upgrades.setItem(29, leggings1);
		}
		if(ManagePlayerdata.getUpgrade(player, "leggings") == 2) {
			upgrades.setItem(29, leggings2);
		}
		if(ManagePlayerdata.getUpgrade(player, "leggings") == 3) {
			upgrades.setItem(29, leggings3);
		}
		if(ManagePlayerdata.getUpgrade(player, "leggings") == 4) {
			upgrades.setItem(29, leggings4);
		}
		if(ManagePlayerdata.getUpgrade(player, "leggings") == 5) {
			upgrades.setItem(29, leggings5);
		}
		
		if(ManagePlayerdata.getUpgrade(player, "healthrune") == 0) {
			upgrades.setItem(31, healthrune0);
		}
		if(ManagePlayerdata.getUpgrade(player, "healthrune") == 1) {
			upgrades.setItem(31, healthrune1);
		}
		
		if(ManagePlayerdata.getUpgrade(player, "boots") == 0) {
			upgrades.setItem(38, boots0);
		}
		if(ManagePlayerdata.getUpgrade(player, "boots") == 1) {
			upgrades.setItem(38, boots1);
		}
		if(ManagePlayerdata.getUpgrade(player, "boots") == 2) {
			upgrades.setItem(38, boots2);
		}
		if(ManagePlayerdata.getUpgrade(player, "boots") == 3) {
			upgrades.setItem(38, boots3);
		}
		if(ManagePlayerdata.getUpgrade(player, "boots") == 4) {
			upgrades.setItem(38, boots4);
		}
		if(ManagePlayerdata.getUpgrade(player, "boots") == 5) {
			upgrades.setItem(38, boots5);
		}
		
		upgrades.setItem(45, exit);
		
		player.openInventory(upgrades);
	}

}
