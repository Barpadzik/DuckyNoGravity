package pl.barpad.duckynogravity;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class MessagesYML {

    private static FileConfiguration messages;

    public static FileConfiguration getMessages(JavaPlugin plugin) {
        if (messages == null) {
            load(plugin);
        }
        return messages;
    }

    public static void load(JavaPlugin plugin) {
        File file = new File(plugin.getDataFolder(), "messages.yml");
        if (!file.exists()) {
            plugin.saveResource("messages.yml", false);
        }
        messages = YamlConfiguration.loadConfiguration(file);
    }

    public static void reload(JavaPlugin plugin) {
        load(plugin);
    }
}