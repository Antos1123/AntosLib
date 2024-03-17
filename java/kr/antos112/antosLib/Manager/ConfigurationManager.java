package kr.antos112.antosLib.Manager;

import kr.antos112.antosLib.AntosLib;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ConfigurationManager {
    private final Plugin antosLib;
    private final Map<File, FileConfiguration> configurationMap = new HashMap<>();

    public ConfigurationManager(Plugin plugin) {
        this.antosLib = plugin;
    }

    public void loadConfig() {
        if (new File(antosLib.getDataFolder(), "config.yml").exists()) {
            antosLib.saveDefaultConfig();
        }
        antosLib.getConfig().options().copyDefaults(true);
        antosLib.reloadConfig();
    }

    public void createCustomYAML(File path, String name) {
        File file = new File(path, name + ".yml");
        YamlConfiguration config = new YamlConfiguration();
        try {
            config.save(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void settingCustomYAML(File path, String yamlName) {
        FileConfiguration customyaml = YamlConfiguration.loadConfiguration(new File(path, yamlName + ".yml"));
        if (customyaml == null) {
            antosLib.getServer().getConsoleSender().sendMessage("[AntosLib] §cThe CustomYAML file cannot be found");
            antosLib.getServer().getConsoleSender().sendMessage("[AntosLib] §cPlease check again and try again");
            return;
        }
        configurationMap.put(path, customyaml);
        if (!new File(path, yamlName + ".yml").exists()) {
            antosLib.saveResource(yamlName + ".yml", false);
        }
        customyaml.options().copyDefaults(true);
    }

    public void settingCustomYAML(String yamlName) {
        FileConfiguration customyaml = YamlConfiguration.loadConfiguration(new File(antosLib.getDataFolder(), yamlName + ".yml"));
        if (customyaml == null) {
            antosLib.getServer().getConsoleSender().sendMessage("[AntosLib] §cThe CustomYAML file cannot be found");
            antosLib.getServer().getConsoleSender().sendMessage("[AntosLib] §cPlease check again and try again");
            return;
        }
        configurationMap.put(antosLib.getDataFolder(), customyaml);
        if (!new File(antosLib.getDataFolder(), yamlName + ".yml").exists()) {
            antosLib.saveResource(yamlName + ".yml", false);
        }
        customyaml.options().copyDefaults(true);
    }

    public void reloadCustomYaml(File path, String yamlName) {
        FileConfiguration customyaml = YamlConfiguration.loadConfiguration(new File(path, yamlName + ".yml"));
        if (customyaml == null) {
            antosLib.getServer().getConsoleSender().sendMessage("[AntosLib] §cThe CustomYAML file cannot be found");
            antosLib.getServer().getConsoleSender().sendMessage("[AntosLib] §cPlease check again and try again");
            return;
        }
        try {
            customyaml.load(new File(path, yamlName + ".yml"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public void reloadCustomYaml(String yamlName) {
        FileConfiguration customyaml = YamlConfiguration.loadConfiguration(new File(antosLib.getDataFolder(), yamlName + ".yml"));
        if (customyaml == null) {
            antosLib.getServer().getConsoleSender().sendMessage("[AntosLib] §cThe CustomYAML file cannot be found");
            antosLib.getServer().getConsoleSender().sendMessage("[AntosLib] §cPlease check again and try again");
            return;
        }

        try {
            customyaml.load(new File(antosLib.getDataFolder(), yamlName + ".yml"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    public FileConfiguration getCustomYAML(File path ,String yamlNAME) {
        FileConfiguration customyaml = YamlConfiguration.loadConfiguration(new File(path, yamlNAME + ".yml"));
        if (customyaml == null) {
            antosLib.getServer().getConsoleSender().sendMessage("[AntosLib] §cThe CustomYAML file cannot be found");
            antosLib.getServer().getConsoleSender().sendMessage("[AntosLib] §cPlease check again and try again");
            return null;
        }
        return customyaml;
    }

    public FileConfiguration getCustomYAML(String yamlNAME) {
        FileConfiguration customyaml = YamlConfiguration.loadConfiguration(new File(antosLib.getDataFolder(), yamlNAME + ".yml"));
        if (customyaml == null) {
            antosLib.getServer().getConsoleSender().sendMessage("[AntosLib] §cThe CustomYAML file cannot be found");
            antosLib.getServer().getConsoleSender().sendMessage("[AntosLib] §cPlease check again and try again");
            return null;
        }
        return customyaml;
    }

    public void saveAllPluginFiles() {
        for (Map.Entry<File, FileConfiguration> file : configurationMap.entrySet()) {
            try {
                file.getValue().save(file.getKey());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public List<FileConfiguration> getYAMLFilesInFolder(File path) {
        List<FileConfiguration> list = new ArrayList<>();
        if (path.exists()) {
            for (File configuration : Objects.requireNonNull(path.listFiles())) {
                FileConfiguration config = YamlConfiguration.loadConfiguration(configuration);
                list.add(config);
            }
        }

        return list;
    }
}