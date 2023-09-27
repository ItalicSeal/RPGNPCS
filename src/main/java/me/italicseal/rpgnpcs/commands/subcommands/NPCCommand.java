package me.italicseal.rpgnpcs.commands.subcommands;

import me.italicseal.rpgnpcs.commands.SubCommand;
import org.bukkit.entity.Player;

public class NPCCommand extends SubCommand {

    @Override
    public String getName() {
        return "create";
    }

    @Override
    public String getDescription() {
        return "Used to create npc";
    }

    @Override
    public String getSyntax() {
        return "/RPGNPC create";
    }

    @Override
    public void perform(Player player, String[] args) {
        if (args.length >= 1){
            player.sendMessage("Creating npc...");
        }else{
            player.sendMessage("ussage: " + getSyntax());
        }

    }
}
