package me.italicseal.rpgnpcs;

import me.italicseal.rpgnpcs.commands.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class RPGNPCS extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("RPGNPC").setExecutor(new CommandManager());
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}