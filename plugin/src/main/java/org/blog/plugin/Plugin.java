package org.blog.plugin;

import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.event.TextEvent;
import java.util.Objects;

public final class Plugin extends JavaPlugin {

    @Override
    public void onEnable() {
        Event();
        // Plugin startup logic
        getLogger().info("Plugin Start");
        getCommand("test").setExecutor(new command());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("Plugin Stop");
    }

    public void Event(){
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(new testevent(), this);
    }


}
