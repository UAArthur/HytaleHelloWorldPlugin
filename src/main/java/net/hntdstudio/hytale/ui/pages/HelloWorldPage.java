package net.hntdstudio.hytale.ui.pages;

import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.protocol.packets.interface_.CustomPageLifetime;
import com.hypixel.hytale.protocol.packets.interface_.CustomUIEventBindingType;
import com.hypixel.hytale.protocol.packets.interface_.Page;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.entity.entities.player.pages.CustomUIPage;
import com.hypixel.hytale.server.core.ui.builder.EventData;
import com.hypixel.hytale.server.core.ui.builder.UICommandBuilder;
import com.hypixel.hytale.server.core.ui.builder.UIEventBuilder;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;

import javax.annotation.Nonnull;

public class HelloWorldPage extends CustomUIPage {

    public HelloWorldPage(@Nonnull PlayerRef playerRef) {
        super(playerRef, CustomPageLifetime.CanDismissOrCloseThroughInteraction);
    }

    @Override
    public void build(@Nonnull Ref<EntityStore> ref,
                      @Nonnull UICommandBuilder commandBuilder,
                      @Nonnull UIEventBuilder eventBuilder,
                      @Nonnull Store<EntityStore> store) {

        commandBuilder.append("Hud/HelloWorldPage.ui");

        eventBuilder.addEventBinding(
                CustomUIEventBindingType.Activating,
                "#ButtonA",
                EventData.of("Selection", "A")
        );

        eventBuilder.addEventBinding(
                CustomUIEventBindingType.Activating,
                "#ButtonB",
                EventData.of("Selection", "B")
        );
    }

    @Override
    public void handleDataEvent(@Nonnull Ref<EntityStore> ref,
                                @Nonnull Store<EntityStore> store,
                                String rawData) {

        Player player = (Player) store.getComponent(ref, Player.getComponentType());
        assert player != null;

        if (rawData.contains("\"Selection\":\"A\"")) {
            playerRef.sendMessage(Message.raw("You selected Button A"));
            player.getPageManager().setPage(ref, store, Page.None);

        } else if (rawData.contains("\"Selection\":\"B\"")) {
            playerRef.sendMessage(Message.raw("You selected Button B"));
            player.getPageManager().setPage(ref, store, Page.None);
        }
    }
}