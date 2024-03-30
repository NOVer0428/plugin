package org.blog.plugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;

public class testevent implements Listener {
    @EventHandler
    public void Join(PlayerJoinEvent event){
        event.setJoinMessage("플레이어가 접속하였습니다.");
    }
    @EventHandler
    public void Interact(PlayerInteractEvent event){
        Player p = event.getPlayer();
        Action a = event.getAction();
        if(a.equals(Action.LEFT_CLICK_AIR)){
            p.sendMessage("테스트");
        }
    }
}
