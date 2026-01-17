package net.hntdstudio.hytale.commands;

import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.basecommands.AbstractPlayerCommand;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.entity.entities.player.hud.HudManager;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.World;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import net.hntdstudio.hytale.ui.hud.HelloWorldHud;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class DisplayPlayerHud_CMD extends AbstractPlayerCommand {
    public DisplayPlayerHud_CMD(@NonNullDecl String name, @NonNullDecl String description) {
        super(name, description);
    }

    @Override
    protected void execute(@NonNullDecl CommandContext commandContext, @NonNullDecl Store<EntityStore> store, @NonNullDecl Ref<EntityStore> ref, @NonNullDecl PlayerRef playerRef, @NonNullDecl World world) {
        Player playerComponent = (Player)store.getComponent(ref, Player.getComponentType());
        assert playerComponent != null;
        HudManager hudManager  = playerComponent.getHudManager();
        HelloWorldHud customHud = new HelloWorldHud(playerRef);
        hudManager.setCustomHud(playerRef, customHud);

    }
}
