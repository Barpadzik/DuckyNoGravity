package pl.barpad.duckynogravity;

import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("DuckyNoPhysics Enabled | Author: Barpad");
        ConfigManager configManager = new ConfigManager(this);
        new DisablePhysics(this, configManager);

    }

    @Override
    public void onDisable() {
        getLogger().info("DuckyNoPhysics Disabled | Author: Barpad");
    }
}
