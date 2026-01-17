package net.hntdstudio.hytale.commands;

import com.hypixel.hytale.component.Ref;
import com.hypixel.hytale.component.Store;
import com.hypixel.hytale.server.core.Message;
import com.hypixel.hytale.server.core.command.system.CommandContext;
import com.hypixel.hytale.server.core.command.system.basecommands.AbstractPlayerCommand;
import com.hypixel.hytale.server.core.entity.entities.Player;
import com.hypixel.hytale.server.core.universe.PlayerRef;
import com.hypixel.hytale.server.core.universe.world.World;
import com.hypixel.hytale.server.core.universe.world.storage.EntityStore;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class HelloWorld_CMD extends AbstractPlayerCommand {

    public HelloWorld_CMD(@NonNullDecl String name, @NonNullDecl String description) {
        super(name, description);
    }

    @Override
    protected void execute(@NonNullDecl CommandContext commandContext, @NonNullDecl Store<EntityStore> store, @NonNullDecl Ref<EntityStore> ref, @NonNullDecl PlayerRef playerRef, @NonNullDecl World world) {
        Player playerComponent = (Player)store.getComponent(ref, Player.getComponentType());
        assert playerComponent != null;
        Message rainbowText = Message.empty().insertAll(
                Message.raw("H").color("#FF0000"),
                Message.raw("E").color("#FF7F00"),
                Message.raw("L").color("#FFFF00"),
                Message.raw("L").color("#00FF00"),
                Message.raw("").color("#0000FF"),
                Message.raw("W").color("#FF0000"),
                Message.raw("O").color("#FF7F00"),
                Message.raw("R").color("#FFFF00"),
                Message.raw("L").color("#00FF00"),
                Message.raw("D").color("#0000FF"),
                Message.raw("!").color("#8B00FF")
        );

        commandContext.sendMessage(rainbowText);
        commandContext.sendMessage(Message.translation("example.this.is.a.example"));
    }
}
