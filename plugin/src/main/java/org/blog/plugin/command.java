package org.blog.plugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class command implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof  Player){
            Player p = (Player) commandSender;
            p.sendMessage("플러그인 정상 작동!");
            return true;
        } else {
            commandSender.sendMessage("해당 명령어는 플레이어만 사용할 수 있습니다!");
            return  false;
        }
    }

}
