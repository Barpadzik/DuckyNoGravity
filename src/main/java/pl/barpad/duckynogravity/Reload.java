package pl.barpad.duckynogravity;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reload extends AbstractCommand implements TabExecutor {

    private final JavaPlugin plugin;
    private final ConfigManager configManager;

    public Reload(JavaPlugin plugin, ConfigManager configManager) {
        super("duckynogravity", "duckynogravity.reload", "Reload Command");
        this.plugin = plugin;
        this.configManager = configManager;
        FileConfiguration messages = plugin.getConfig();
        this.register();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        FileConfiguration messages = MessagesYML.getMessages(plugin);

        if (args.length == 1 && args[0].equalsIgnoreCase("reload")) {
            if (!sender.hasPermission("duckynogravity.reload")) {
                sender.sendMessage(color(messages.getString("no-permission", "&cYou don't have permission to use this command.")));
                return true;
            }

            plugin.reloadConfig();
            configManager.reload();
            MessagesYML.reload(plugin);

            sender.sendMessage(color(messages.getString("reload-success", "&aDuckyNoGravity configuration reloaded!")));
            return true;
        }

        sender.sendMessage(color(messages.getString("usage", "&eUsage: /duckynogravity reload")));
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 1) {
            if ("reload".startsWith(args[0].toLowerCase()) && sender.hasPermission("nogravity.reload")) {
                return Collections.singletonList("reload");
            }
        }
        return new ArrayList<>();
    }

    private String color(String message) {
        return message == null ? "" : message.replace("&", "§");
    }
}