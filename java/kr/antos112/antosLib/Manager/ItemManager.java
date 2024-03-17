package kr.antos112.antosLib.Manager;

import kr.antos112.antosLib.api.RandomEffect;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.inventory.meta.SkullMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Arrays;

public class ItemManager {
    private ItemManager() {}

    public static ItemStack createCustomPotion(int amout, Color color, PotionEffectType effectType, int duration, int amplifier, String displayName, String... lore) {
        ItemStack stack = new ItemStack(Material.POTION, amout);
        PotionMeta meta = (PotionMeta) stack.getItemMeta();
        meta.setDisplayName(displayName);
        meta.setLore(Arrays.asList(lore));
        meta.setColor(color);
        PotionEffect potionEffect = new PotionEffect(effectType, duration, amplifier);
        meta.addCustomEffect(potionEffect, false);
        stack.setItemMeta(meta);
        return stack;
    }

    public static ItemStack createCustomPotion(Color color, PotionEffectType effectType, int duration, int amplifier, String displayName, String... lore) {
        ItemStack stack = new ItemStack(Material.POTION);
        PotionMeta meta = (PotionMeta) stack.getItemMeta();
        meta.setDisplayName(displayName);
        meta.setLore(Arrays.asList(lore));
        meta.setColor(color);
        PotionEffect potionEffect = new PotionEffect(effectType, duration, amplifier);
        meta.addCustomEffect(potionEffect, false);
        stack.setItemMeta(meta);
        return stack;
    }

    public static ItemStack createCustomPotion(PotionEffectType effectType, int duration, int amplifier, String displayName, String... lore) {
        ItemStack stack = new ItemStack(Material.POTION);
        PotionMeta meta = (PotionMeta) stack.getItemMeta();
        meta.setDisplayName(displayName);
        meta.setLore(Arrays.asList(lore));
        meta.setColor(Color.BLUE);
        PotionEffect potionEffect = new PotionEffect(effectType, duration, amplifier);
        meta.addCustomEffect(potionEffect, false);
        stack.setItemMeta(meta);
        return stack;
    }

    public static ItemStack createCustomPotion(PotionEffectType effectType, int duration, int amplifier, String displayName) {
        ItemStack stack = new ItemStack(Material.POTION);
        PotionMeta meta = (PotionMeta) stack.getItemMeta();
        meta.setDisplayName(displayName);
        meta.setColor(Color.BLUE);
        PotionEffect potionEffect = new PotionEffect(effectType, duration, amplifier);
        meta.addCustomEffect(potionEffect, false);
        stack.setItemMeta(meta);
        return stack;
    }

    public static ItemStack createCustomPotion(PotionEffectType effectType, int duration, int amplifier) {
        ItemStack stack = new ItemStack(Material.POTION);
        PotionMeta meta = (PotionMeta) stack.getItemMeta();
        meta.setDisplayName("커스텀 포션");
        meta.setColor(Color.BLUE);
        PotionEffect potionEffect = new PotionEffect(effectType, duration, amplifier);
        meta.addCustomEffect(potionEffect, false);
        stack.setItemMeta(meta);
        return stack;
    }

    public static ItemStack getPlayerHead(String name, Player owner) {
        ItemStack head = new ItemStack(Material.PLAYER_HEAD);
        SkullMeta meta = (SkullMeta) head.getItemMeta();

        meta.setOwningPlayer(owner);
        meta.setDisplayName(name);

        head.setItemMeta(meta);

        return head;
    }
}
