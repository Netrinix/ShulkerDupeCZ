package dev.drrockymc.shulkerdupecz;

import dev.drrockymc.shulkerdupecz.commands.CommandBase;
import dev.drrockymc.shulkerdupecz.events.Dupe;
import dev.drrockymc.shulkerdupecz.events.fl;
import dev.drrockymc.shulkerdupecz.util.FileUtil;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        saveDefaultConfig();
        getCommand("sd").setExecutor(new CommandBase());
        FileUtil.setup();
        FileUtil.getPlayerDataConfig().options().copyDefaults(true);
        FileUtil.save();
        getServer().getPluginManager().registerEvents((Listener)new Dupe(this), (Plugin)this);
        getServer().getPluginManager().registerEvents((Listener)new fl(this), (Plugin)this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
