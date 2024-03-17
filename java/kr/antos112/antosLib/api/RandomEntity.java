package kr.antos112.antosLib.api;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;

import java.util.Random;

public class RandomEntity {
    private RandomEntity() {}
    private final static Random random = new Random();
    public static EntityType getRandomEntityInOverworld() {
        EntityType[] monsters = {EntityType.ALLAY, EntityType.AXOLOTL, EntityType.BAT, EntityType.BEE, EntityType.BLAZE, EntityType.CAMEL, EntityType.CAT, EntityType.CAVE_SPIDER, EntityType.CHICKEN, EntityType.COD, EntityType.COW, EntityType.CREEPER, EntityType.DOLPHIN
                ,EntityType.DONKEY,EntityType.DROWNED, EntityType.ELDER_GUARDIAN, EntityType.EVOKER,EntityType.FOX,EntityType.FROG,EntityType.GLOW_SQUID, EntityType.GOAT, EntityType.GUARDIAN,EntityType.HORSE,EntityType.HUSK,EntityType.IRON_GOLEM,EntityType.LLAMA,EntityType.MULE
                ,EntityType.OCELOT,EntityType.PANDA,EntityType.PARROT,EntityType.PHANTOM,EntityType.PIG,EntityType.PILLAGER,EntityType.POLAR_BEAR,EntityType.PUFFERFISH,EntityType.RABBIT,EntityType.RAVAGER,EntityType.SALMON,EntityType.SHEEP,EntityType.SILVERFISH,EntityType.SKELETON
                ,EntityType.SKELETON_HORSE,EntityType.SLIME,EntityType.SNIFFER,EntityType.SNOWMAN,EntityType.SPIDER,EntityType.SQUID,EntityType.STRAY,EntityType.TADPOLE,EntityType.TRADER_LLAMA,EntityType.TROPICAL_FISH,EntityType.TURTLE,EntityType.VEX,EntityType.VILLAGER
                ,EntityType.VINDICATOR,EntityType.WANDERING_TRADER,EntityType.WITCH,EntityType.WOLF,EntityType.ZOGLIN,EntityType.ZOMBIE,EntityType.ZOMBIE_HORSE,EntityType.ZOMBIE_VILLAGER,EntityType.WARDEN};

        return monsters[random.nextInt(monsters.length)];
    }

    public static EntityType getRandomEntityInNether() {
        EntityType[] netherEntity = {EntityType.BLAZE,EntityType.GHAST,EntityType.HOGLIN,EntityType.MAGMA_CUBE,EntityType.PIGLIN,EntityType.PIGLIN_BRUTE,EntityType.STRIDER,EntityType.WITHER_SKELETON,EntityType.ZOMBIFIED_PIGLIN,EntityType.WITHER};

        return netherEntity[random.nextInt(netherEntity.length)];
    }

    public static EntityType getRandomEntityInEnder() {
        EntityType[] enderEntity = {EntityType.ENDER_DRAGON,EntityType.ENDERMAN, EntityType.ENDERMITE};

        return enderEntity[random.nextInt(enderEntity.length)];
    }

    public static EntityType getRandomBoss() {
        EntityType[] boss = {EntityType.WITHER,EntityType.ENDER_DRAGON,EntityType.WARDEN};

        return boss[random.nextInt(boss.length)];
    }

    public static void spawnRandomEntityInOverWorld(Player player) {
        player.getWorld().spawnEntity(player.getLocation(), getRandomEntityInOverworld());
    }

    public static void spawnRandomEntityInNether(Player player) {
        player.getWorld().spawnEntity(player.getLocation(), getRandomEntityInNether());
    }

    public static void spawnRandomEntityInEnder(Player player) {
        player.getWorld().spawnEntity(player.getLocation(), getRandomEntityInEnder());
    }

    public static void spawnRandomBoss(Player player) {
        player.getWorld().spawnEntity(player.getLocation(), getRandomBoss());
    }

    public static void spawnRandomEntityInOverWorld(Location location, World world) {
        world.spawnEntity(location, getRandomEntityInOverworld());
    }

    public static void spawnRandomEntityInNether(Location location, World world) {
        world.spawnEntity(location, getRandomEntityInNether());
    }

    public static void spawnRandomEntityInEnder(Location location, World world) {
        world.spawnEntity(location, getRandomEntityInEnder());
    }

    public static void spawnRandomBoss(Location location, World world) {
        world.spawnEntity(location, getRandomBoss());
    }
}