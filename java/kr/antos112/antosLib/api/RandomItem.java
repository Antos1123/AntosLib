package kr.antos112.antosLib.api;

import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.Random;

public class RandomItem {
    private static final Random random = new Random();

    private RandomItem() {}

    public static ItemStack getRandomItemWithAir() {
        ItemStack[] itemStacks = new ItemStack[Material.values().length];
        for (int i = 0; i < Material.values().length; i++) {
            itemStacks[i] = new ItemStack(Material.values()[i]);
        }
        return itemStacks[random.nextInt(itemStacks.length)];
    }

    public static ItemStack getRandomItemWithoutAir() {
        ItemStack[] itemStacks = new ItemStack[Material.values().length];
        for (int i = 0; i < Material.values().length; i++) {
            itemStacks[i] = new ItemStack(Material.values()[i]);
        }
        ItemStack itemStack = itemStacks[random.nextInt(itemStacks.length)];
        while (itemStack == new ItemStack(Material.AIR) || itemStack == null) {
            itemStack = itemStacks[random.nextInt(itemStacks.length)];
        }
        return itemStack;
    }

    public static void giveRandomItemWithAir(Player player) {
        player.getInventory().addItem(getRandomItemWithAir());
    }

    public static void giveRandomItemWithoutAir(Player player) {
        player.getInventory().addItem(getRandomItemWithoutAir());
    }
}