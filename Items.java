package fr.haifunime.samourai;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Items {
	
	public static void giveItem(Player player, String type, int level) {
		
		ItemStack helmet1 = new ItemStack(Material.LEATHER_HELMET, 1);
		ItemMeta helmet1M = helmet1.getItemMeta();
		helmet1M.setDisplayName("§f» §e§lCasque");
		helmet1M.spigot().setUnbreakable(true);
		helmet1M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		helmet1.setItemMeta(helmet1M);
		
		ItemStack helmet2 = new ItemStack(Material.GOLD_HELMET, 1);
		ItemMeta helmet2M = helmet2.getItemMeta();
		helmet2M.setDisplayName("§f» §e§lCasque");
		helmet2M.spigot().setUnbreakable(true);
		helmet2M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		helmet2.setItemMeta(helmet2M);
		
		ItemStack helmet3 = new ItemStack(Material.CHAINMAIL_HELMET, 1);
		ItemMeta helmet3M = helmet3.getItemMeta();
		helmet3M.setDisplayName("§f» §e§lCasque");
		helmet3M.spigot().setUnbreakable(true);
		helmet3M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		helmet3.setItemMeta(helmet3M);
		
		ItemStack helmet4 = new ItemStack(Material.IRON_HELMET, 1);
		ItemMeta helmet4M = helmet4.getItemMeta();
		helmet4M.setDisplayName("§f» §e§lCasque");
		helmet4M.spigot().setUnbreakable(true);
		helmet4M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		helmet4.setItemMeta(helmet4M);
		
		ItemStack helmet5 = new ItemStack(Material.DIAMOND_HELMET, 1);
		ItemMeta helmet5M = helmet5.getItemMeta();
		helmet5M.setDisplayName("§f» §e§lCasque");
		helmet5M.spigot().setUnbreakable(true);
		helmet5M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		helmet5.setItemMeta(helmet5M);
		
		ItemStack chestplate1 = new ItemStack(Material.LEATHER_CHESTPLATE, 1);
		ItemMeta chestplate1M = chestplate1.getItemMeta();
		chestplate1M.setDisplayName("§f» §e§lPlastron");
		chestplate1M.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		chestplate1M.addEnchant(Enchantment.THORNS, 1, true);
		chestplate1M.spigot().setUnbreakable(true);
		chestplate1M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		chestplate1M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		chestplate1.setItemMeta(chestplate1M);
		
		ItemStack chestplate2 = new ItemStack(Material.GOLD_CHESTPLATE, 1);
		ItemMeta chestplate2M = chestplate2.getItemMeta();
		chestplate2M.setDisplayName("§f» §e§lPlastron");
		chestplate2M.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 1, true);
		chestplate2M.addEnchant(Enchantment.THORNS, 2, true);
		chestplate2M.spigot().setUnbreakable(true);
		chestplate2M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		chestplate2M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		chestplate2.setItemMeta(chestplate2M);
		
		ItemStack chestplate3 = new ItemStack(Material.CHAINMAIL_CHESTPLATE, 1);
		ItemMeta chestplate3M = chestplate3.getItemMeta();
		chestplate3M.setDisplayName("§f» §e§lPlastron");
		chestplate3M.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		chestplate3M.addEnchant(Enchantment.THORNS, 3, true);
		chestplate3M.spigot().setUnbreakable(true);
		chestplate3M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		chestplate3M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		chestplate3.setItemMeta(chestplate3M);
		
		ItemStack chestplate4 = new ItemStack(Material.IRON_CHESTPLATE, 1);
		ItemMeta chestplate4M = chestplate4.getItemMeta();
		chestplate4M.setDisplayName("§f» §e§lPlastron");
		chestplate4M.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 2, true);
		chestplate4M.addEnchant(Enchantment.THORNS, 4, true);
		chestplate4M.spigot().setUnbreakable(true);
		chestplate4M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		chestplate4M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		chestplate4.setItemMeta(chestplate4M);
		
		ItemStack chestplate5 = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
		ItemMeta chestplate5M = chestplate5.getItemMeta();
		chestplate5M.setDisplayName("§f» §e§lPlastron");
		chestplate5M.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 3, true);
		chestplate5M.addEnchant(Enchantment.THORNS, 5, true);
		chestplate5M.spigot().setUnbreakable(true);
		chestplate5M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		chestplate5M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		chestplate5.setItemMeta(chestplate5M);
		
		ItemStack leggings1 = new ItemStack(Material.LEATHER_LEGGINGS, 1);
		ItemMeta leggings1M = leggings1.getItemMeta();
		leggings1M.setDisplayName("§f» §e§lJambières");
		leggings1M.spigot().setUnbreakable(true);
		leggings1M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		leggings1.setItemMeta(helmet1M);
		
		ItemStack leggings2 = new ItemStack(Material.GOLD_LEGGINGS, 1);
		ItemMeta leggings2M = leggings2.getItemMeta();
		leggings2M.setDisplayName("§f» §e§lJambières");
		leggings2M.spigot().setUnbreakable(true);
		leggings2M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		leggings2.setItemMeta(leggings2M);
		
		ItemStack leggings3 = new ItemStack(Material.CHAINMAIL_LEGGINGS, 1);
		ItemMeta leggings3M = leggings3.getItemMeta();
		leggings3M.setDisplayName("§f» §e§lJambières");
		leggings3M.spigot().setUnbreakable(true);
		leggings3M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		leggings3.setItemMeta(leggings3M);
		
		ItemStack leggings4 = new ItemStack(Material.IRON_LEGGINGS, 1);
		ItemMeta leggings4M = leggings4.getItemMeta();
		leggings4M.setDisplayName("§f» §e§lJambières");
		leggings4M.spigot().setUnbreakable(true);
		leggings4M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		leggings4.setItemMeta(leggings4M);
		
		ItemStack leggings5 = new ItemStack(Material.DIAMOND_LEGGINGS, 1);
		ItemMeta leggings5M = leggings5.getItemMeta();
		leggings5M.setDisplayName("§f» §e§lJambières");
		leggings5M.spigot().setUnbreakable(true);
		leggings5M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		leggings5.setItemMeta(leggings5M);
		
		ItemStack boots1 = new ItemStack(Material.LEATHER_BOOTS, 1);
		ItemMeta boots1M = boots1.getItemMeta();
		boots1M.setDisplayName("§f» §e§lBottes");
		boots1M.addEnchant(Enchantment.PROTECTION_FALL, 1, true);
		boots1M.spigot().setUnbreakable(true);
		boots1M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		boots1M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		boots1.setItemMeta(boots1M);
		
		ItemStack boots2 = new ItemStack(Material.GOLD_BOOTS, 1);
		ItemMeta boots2M = boots2.getItemMeta();
		boots2M.setDisplayName("§f» §e§lBottes");
		boots2M.addEnchant(Enchantment.PROTECTION_FALL, 2, true);
		boots2M.spigot().setUnbreakable(true);
		boots2M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		boots2M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		boots2.setItemMeta(boots2M);
		
		ItemStack boots3 = new ItemStack(Material.CHAINMAIL_BOOTS, 1);
		ItemMeta boots3M = boots3.getItemMeta();
		boots3M.setDisplayName("§f» §e§lBottes");
		boots3M.addEnchant(Enchantment.PROTECTION_FALL, 1, true);
		boots3M.spigot().setUnbreakable(true);
		boots3M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		boots3M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		boots3.setItemMeta(boots3M);
		
		ItemStack boots4 = new ItemStack(Material.IRON_BOOTS, 1);
		ItemMeta boots4M = boots4.getItemMeta();
		boots4M.setDisplayName("§f» §e§lBottes");
		boots4M.addEnchant(Enchantment.PROTECTION_FALL, 1, true);
		boots4M.spigot().setUnbreakable(true);
		boots4M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		boots4M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		boots4.setItemMeta(boots4M);
		
		ItemStack boots5 = new ItemStack(Material.DIAMOND_BOOTS, 1);
		ItemMeta boots5M = boots5.getItemMeta();
		boots5M.setDisplayName("§f» §e§lBottes");
		boots5M.addEnchant(Enchantment.PROTECTION_FALL, 1, true);
		boots5M.spigot().setUnbreakable(true);
		boots5M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		boots5M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		boots5.setItemMeta(boots5M);
		
		ItemStack katana0 = new ItemStack(Material.STICK, 1);
		ItemMeta katana0M = katana0.getItemMeta();
		katana0M.setDisplayName("§e§lKatana");
		katana0M.addEnchant(Enchantment.DAMAGE_ALL, 2, true);
		katana0M.spigot().setUnbreakable(true);
		katana0M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		katana0M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		katana0.setItemMeta(katana0M);
		
		ItemStack katana1 = new ItemStack(Material.WOOD_SWORD, 1);
		ItemMeta katana1M = katana1.getItemMeta();
		katana1M.setDisplayName("§e§lKatana");
		katana1M.spigot().setUnbreakable(true);
		katana1M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		katana1.setItemMeta(katana1M);
		
		ItemStack katana2 = new ItemStack(Material.STONE_SWORD, 1);
		ItemMeta katana2M = katana2.getItemMeta();
		katana2M.setDisplayName("§e§lKatana");
		katana2M.spigot().setUnbreakable(true);
		katana2M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		katana2.setItemMeta(katana2M);
		
		ItemStack katana3 = new ItemStack(Material.IRON_SWORD, 1);
		ItemMeta katana3M = katana3.getItemMeta();
		katana3M.setDisplayName("§e§lKatana");
		katana3M.spigot().setUnbreakable(true);
		katana3M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		katana3.setItemMeta(katana3M);
		
		ItemStack katana4 = new ItemStack(Material.DIAMOND_SWORD, 1);
		ItemMeta katana4M = katana4.getItemMeta();
		katana4M.setDisplayName("§e§lKatana");
		katana4M.spigot().setUnbreakable(true);
		katana4M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		katana4.setItemMeta(katana4M);
		
		ItemStack katana5 = new ItemStack(Material.GOLD_SWORD, 1);
		ItemMeta katana5M = katana5.getItemMeta();
		katana5M.setDisplayName("§e§lKatana");
		katana5M.addEnchant(Enchantment.DAMAGE_ALL, 4, true);
		katana5M.spigot().setUnbreakable(true);
		katana5M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		katana5M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		katana5.setItemMeta(katana5M);
		
		ItemStack bow1 = new ItemStack(Material.BOW, 1);
		ItemMeta bow1M = bow1.getItemMeta();
		bow1M.setDisplayName("§e§lArc");
		bow1M.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		bow1M.spigot().setUnbreakable(true);
		bow1M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		bow1M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		bow1.setItemMeta(bow1M);
		
		ItemStack bow2 = new ItemStack(Material.BOW, 1);
		ItemMeta bow2M = bow2.getItemMeta();
		bow2M.setDisplayName("§e§lArc");
		bow2M.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		bow2M.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		bow2M.spigot().setUnbreakable(true);
		bow2M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		bow2M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		bow2.setItemMeta(bow2M);
		
		ItemStack bow3 = new ItemStack(Material.BOW, 1);
		ItemMeta bow3M = bow3.getItemMeta();
		bow3M.setDisplayName("§e§lArc");
		bow3M.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		bow3M.addEnchant(Enchantment.ARROW_DAMAGE, 1, true);
		bow3M.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
		bow3M.spigot().setUnbreakable(true);
		bow3M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		bow3M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		bow3.setItemMeta(bow3M);
		
		ItemStack bow4 = new ItemStack(Material.BOW, 1);
		ItemMeta bow4M = bow4.getItemMeta();
		bow4M.setDisplayName("§e§lArc");
		bow4M.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		bow4M.addEnchant(Enchantment.ARROW_DAMAGE, 2, true);
		bow4M.addEnchant(Enchantment.ARROW_KNOCKBACK, 1, true);
		bow4M.spigot().setUnbreakable(true);
		bow4M.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		bow4M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		bow4.setItemMeta(bow4M);
		
		ItemStack bow5 = new ItemStack(Material.BOW, 1);
		ItemMeta bow5M = bow5.getItemMeta();
		bow5M.setDisplayName("§e§lArc");
		bow5M.addEnchant(Enchantment.ARROW_INFINITE, 1, true);
		bow5M.addEnchant(Enchantment.ARROW_DAMAGE, 3, true);
		bow5M.addEnchant(Enchantment.ARROW_KNOCKBACK, 2, true);
		bow5M.spigot().setUnbreakable(true);
		bow5M.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		bow5.setItemMeta(bow5M);
		
		if(type.equals("helmet")) {
			if(level == 1) {
				player.getInventory().setHelmet(helmet1);
				player.setMaxHealth(24);
				player.setHealth(player.getMaxHealth());
			}
			if(level == 2) {
				player.getInventory().setHelmet(helmet2);
				player.setMaxHealth(28);
				player.setHealth(player.getMaxHealth());
			}
			if(level == 3) {
				player.getInventory().setHelmet(helmet3);
				player.setMaxHealth(32);
				player.setHealth(player.getMaxHealth());
			}
			if(level == 4) {
				player.getInventory().setHelmet(helmet4);
				player.setMaxHealth(36);
				player.setHealth(player.getMaxHealth());
			}
			if(level == 5) {
				player.getInventory().setHelmet(helmet5);
				player.setMaxHealth(40);
				player.setHealth(player.getMaxHealth());
			}
		}
		if(type.equals("chestplate")) {
			if(level == 1) {
				player.getInventory().setChestplate(chestplate1);
			}
			if(level == 2) {
				player.getInventory().setChestplate(chestplate1);
			}
			if(level == 3) {
				player.getInventory().setChestplate(chestplate3);
			}
			if(level == 4) {
				player.getInventory().setChestplate(chestplate4);
			}
			if(level == 5) {
				player.getInventory().setChestplate(chestplate5);
			}
		}
		if(type.equals("leggings")) {
			if(level == 1) {
				player.getInventory().setLeggings(leggings1);
				player.setWalkSpeed((float)0.23);
			}
			if(level == 2) {
				player.getInventory().setLeggings(leggings2);
				player.setWalkSpeed((float)0.26);
			}
			if(level == 3) {
				player.getInventory().setLeggings(leggings3);
				player.setWalkSpeed((float)0.29);
			}
			if(level == 4) {
				player.getInventory().setLeggings(leggings4);
				player.setWalkSpeed((float)0.32);
			}
			if(level == 5) {
				player.getInventory().setLeggings(leggings5);
				player.setWalkSpeed((float)0.35);
			}
		}
		if(type.equals("boots")) {
			if(level == 1) {
				player.getInventory().setBoots(boots1);
			}
			if(level == 2) {
				player.getInventory().setBoots(boots2);
			}
			if(level == 3) {
				player.getInventory().setBoots(boots3);
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 0, true), true);
			}
			if(level == 4) {
				player.getInventory().setBoots(boots4);
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 0, true), true);
			}
			if(level == 5) {
				player.getInventory().setBoots(boots5);
				player.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, 1, true), true);
			}
		}
		if(type.equals("katana")) {
			if(level == 0) {
				player.getInventory().setItem(0, katana0);
			}
			if(level == 1) {
				player.getInventory().setItem(0, katana1);
			}
			if(level == 2) {
				player.getInventory().setItem(0, katana2);
			}
			if(level == 3) {
				player.getInventory().setItem(0, katana3);
			}
			if(level == 4) {
				player.getInventory().setItem(0, katana4);
			}
			if(level == 5) {
				player.getInventory().setItem(0, katana5);
			}
		}
		if(type.equals("bow")) {
			if(level == 1) {
				player.getInventory().setItem(1, bow1);
				player.getInventory().setItem(2, new ItemStack(Material.ARROW, 1));
			}
			if(level == 2) {
				player.getInventory().setItem(1, bow2);
				player.getInventory().setItem(2, new ItemStack(Material.ARROW, 1));
			}
			if(level == 3) {
				player.getInventory().setItem(1, bow3);
				player.getInventory().setItem(2, new ItemStack(Material.ARROW, 1));
			}
			if(level == 4) {
				player.getInventory().setItem(1, bow4);
				player.getInventory().setItem(2, new ItemStack(Material.ARROW, 1));
			}
			if(level == 5) {
				player.getInventory().setItem(1, bow5);
				player.getInventory().setItem(2, new ItemStack(Material.ARROW, 1));
			}
		}
		
	}

}
