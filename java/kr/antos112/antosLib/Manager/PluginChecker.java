package kr.antos112.antosLib.Manager;

import kr.antos112.antosLib.AntosLib;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.plugin.RegisteredServiceProvider;

public class PluginChecker {
    private final static AntosLib antosLib = new AntosLib();

    private PluginChecker() {}

    public static boolean checkPlugin(String PluginName) {
        if (antosLib.getServer().getPluginManager().getPlugin(PluginName) != null) {
            return true;
        }
        return false;
    }

    public static boolean checkVault() {
        RegisteredServiceProvider<Economy> rsp = antosLib.getServer().getServicesManager().getRegistration(Economy.class);
        return rsp.getProvider() != null;
    }
}
