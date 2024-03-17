package kr.antos112.antosLib;

import kr.antos112.antosLib.Manager.ConfigurationManager;
import org.bukkit.plugin.java.JavaPlugin;

public class AntosLib extends JavaPlugin {
    ConfigurationManager configurationManager = new ConfigurationManager(this);
    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage("[AntosLib] §eAntosLib loaded successfully");
        getServer().getConsoleSender().sendMessage("[AntosLib] §eAntosLib's configuration file has been loaded successfully");
        configurationManager.loadConfig();
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage("[AntosLib] §eAntosLib is disabled");
        getServer().getConsoleSender().sendMessage("[AntosLib] §eAntosLib's configuration files are saved");

        configurationManager.saveAllPluginFiles();
    }
}
