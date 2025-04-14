package pl.barpad.duckynogravity;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class ConfigManager {

    private final FileConfiguration config;

    public ConfigManager(JavaPlugin plugin) {
        plugin.saveDefaultConfig();
        this.config = plugin.getConfig();
    }

    public boolean isBlockGravityEnabled() {
        return config.getBoolean("block-gravity.enabled", false);
    }

    public boolean isBlockBreakAllowed() {
        return config.getBoolean("block-gravity.allow-break", false);
    }

    public List<String> getDisabledWorldsForBlocks() {
        return config.getStringList("block-gravity.disabled-worlds");
    }

    public boolean isFluidGravityEnabled() {
        return config.getBoolean("fluids-gravity.enabled", true);
    }

    public List<String> getDisabledWorldsForFluids() {
        return config.getStringList("fluids-gravity.disabled-worlds");
    }
}