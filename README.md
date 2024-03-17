# Purpose of this plugin
This plugin was created solely for the convenience of developers.
# How to use
1. First, apply the plugin to the server.
2. Then add this plugin's dependency to the plugin for which you want to create a dependency.
	#### Maven
````
<dependency>
  <groupId>kr.antos112.antosLib</groupId>
  <artifactId>AntosLib</artifactId>
  <version>1.0.0</version>
</dependency>
````
# Example usage for this plugin
````
@Override
public void onEnble() {
	if (PluginChecker.checkVault()) {
		// Check if the Vault plugin is applied to the server
		getLogger().info("Vault is applied!");
	}
	// Creates a ConfigurationManager variable and loads the specified config.
	CofigurationManager configManager = new CofigurationManager(this);
	configManager.loadConfig();
}
