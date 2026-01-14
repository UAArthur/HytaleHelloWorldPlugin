package net.hntdstudio.hytale.events;

import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.event.events.player.PlayerConnectEvent;
import net.hntdstudio.hytale.api.events.EventHandler;

public class PlayerJoinListener {

    @EventHandler
    public void OnPlayerConnect(PlayerConnectEvent event) {
        Player player = event.getHolder().getComponent(Player.getComponentType());
        assert player != null;

        player.sendMessage(Message.raw("Welcome to the server, " + player.getDisplayName() + "!"));
    }
}
