package pl.barpad.duckynogravity;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockFromToEvent;
import org.bukkit.event.entity.EntityChangeBlockEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class DisablePhysics implements Listener {

    private final ConfigManager config;

    public DisablePhysics(JavaPlugin plugin, ConfigManager configManager) {
        this.config = configManager;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Block block = event.getBlock();
        String worldName = block.getWorld().getName();

        if (config.isBlockGravityEnabled()) return;
        if (config.getDisabledWorldsForBlocks().contains(worldName)) return;

        if (block.getType().hasGravity() && !config.isBlockBreakAllowed()) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onEntityChangeBlock(EntityChangeBlockEvent event) {
        Block block = event.getBlock();
        String worldName = block.getWorld().getName();

        if (config.isBlockGravityEnabled()) return;
        if (config.getDisabledWorldsForBlocks().contains(worldName)) return;

        if (block.getType().hasGravity()) {
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onFluidFlow(BlockFromToEvent event) {
        Block block = event.getBlock();
        String worldName = block.getWorld().getName();

        if (config.isFluidGravityEnabled()) return;
        if (config.getDisabledWorldsForFluids().contains(worldName)) return;

        if (!block.getType().isSolid()) {
            event.setCancelled(true);
        }
    }
}