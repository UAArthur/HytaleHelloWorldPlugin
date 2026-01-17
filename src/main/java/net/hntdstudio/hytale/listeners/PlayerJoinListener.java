package net.hntdstudio.hytale.listeners;

import com.hypixel.hytale.builtin.hytalegenerator.LoggerUtil;
import com.hypixel.hytale.logger.HytaleLogger;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.event.events.player.PlayerConnectEvent;
import net.hntdstudio.hytale.api.events.EventHandler;

import java.util.logging.Level;

public class PlayerJoinListener {

    private final HytaleLogger logger = HytaleLogger.get("HelloWorldPlugin");

    @EventHandler
    public void OnPlayerConnect(PlayerConnectEvent event) {
        Player player = event.getHolder().getComponent(Player.getComponentType());
        assert player != null;

        player.sendMessage(Message.raw("Welcome to the server, " + player.getDisplayName() + "!"));
    }
}