package com.enderdevelopment.plugin;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    @Override
    public void onEnable() {
        getLogger().info("StealthDoor has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("StealthDoor has been disabled!");
    }
}