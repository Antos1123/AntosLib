package kr.antos112.antosLib.api;

import org.bukkit.Effect;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.Random;

public class RandomEffect {
    private static final Random random = new Random();

    private RandomEffect() {}
    public static PotionEffectType getRandomEffect() {
        return PotionEffectType.values()[random.nextInt(PotionEffectType.values().length)];
    }

    public static PotionEffectType getGooodEffect() {
        PotionEffectType[] potionEffectTypes = {PotionEffectType.SPEED, PotionEffectType.FAST_DIGGING, PotionEffectType.JUMP,PotionEffectType.INCREASE_DAMAGE, PotionEffectType.DAMAGE_RESISTANCE,PotionEffectType.REGENERATION,
        PotionEffectType.FIRE_RESISTANCE,PotionEffectType.WATER_BREATHING,PotionEffectType.NIGHT_VISION,PotionEffectType.ABSORPTION,PotionEffectType.HEALTH_BOOST,PotionEffectType.SATURATION,PotionEffectType.LUCK,
        PotionEffectType.SLOW_FALLING, PotionEffectType.CONDUIT_POWER, PotionEffectType.DOLPHINS_GRACE,PotionEffectType.HEAL,PotionEffectType.INVISIBILITY, PotionEffectType.GLOWING, PotionEffectType.HERO_OF_THE_VILLAGE};

        return potionEffectTypes[random.nextInt(potionEffectTypes.length)];
    }

    public static PotionEffectType getBadEffect() {
        PotionEffectType[] potionEffectTypes = {PotionEffectType.SLOW,PotionEffectType.SLOW_DIGGING,PotionEffectType.CONFUSION, PotionEffectType.BLINDNESS,PotionEffectType.HUNGER,PotionEffectType.WEAKNESS,PotionEffectType.POISON,PotionEffectType.WITHER,PotionEffectType.HARM,PotionEffectType.LEVITATION,
        PotionEffectType.BAD_OMEN};

        return potionEffectTypes[random.nextInt(potionEffectTypes.length)];
    }

    public static void applyRandomEffect(Player player, int i, int j) {
        player.addPotionEffect(new PotionEffect(getRandomEffect(), i, j));
    }

    public static void applyGoodEffect(Player player, int i, int j) {
        player.addPotionEffect(new PotionEffect(getGooodEffect(), i, j));
    }

    public static void applyBadEffect(Player player, int i, int j) {
        player.addPotionEffect(new PotionEffect(getBadEffect(), i, j));
    }
}