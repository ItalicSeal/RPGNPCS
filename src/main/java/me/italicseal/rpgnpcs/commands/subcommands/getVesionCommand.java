package me.italicseal.rpgnpcs.commands.subcommands;

import me.italicseal.rpgnpcs.AbstractionLoader;
import me.italicseal.rpgnpcs.commands.SubCommand;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class getVesionCommand extends SubCommand {
    @Override
    public String getName() {
        return "serverVersion";
    }

    @Override
    public String getDescription() {
        return "Gets the current version of minecraft server";
    }

    @Override
    public String getSyntax() {
        return "Usage: /RPGNPC serverVersion";
    }

    @Override
    public void perform(Player player, String[] args) {
        AbstractionLoader abstractionLoader = new AbstractionLoader();
        abstractionLoader.loadLocalAbstractions(Bukkit.getServer());
        player.sendMessage("The server is running on: " + abstractionLoader.getServerVersion());
    }
}
