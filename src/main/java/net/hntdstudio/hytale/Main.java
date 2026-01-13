package net.hntdstudio.hytale;

import com.hypixel.hytale.common.plugin.PluginManifest;
import com.hypixel.hytale.protocol.packets.interface_.HudComponent;
import com.hypixel.hytale.server.core.Options;
import com.hypixel.hytale.server.core.command.system.CommandManager;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import com.hypixel.hytale.server.core.plugin.PluginManager;
import net.hntdstudio.hytale.commands.HelloWorld_CMD;
import net.hntdstudio.hytale.commands.UpdateHUD_CMD;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class Main extends JavaPlugin {

    public Main(@NonNullDecl JavaPluginInit init) {
        super(init);
    }


    @Override
    protected void start0() {
        super.start0();

        System.out.println("Hello world lol!");
        CommandManager.get().register(new HelloWorld_CMD("helloworld", ""));
        CommandManager.get().register(new UpdateHUD_CMD("updateUIHelloWorld", ""));
    }
}
