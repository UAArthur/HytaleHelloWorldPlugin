package net.hntdstudio.hytale;

import com.hypixel.hytale.server.core.command.system.CommandManager;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import net.hntdstudio.hytale.commands.HelloWorld_CMD;
import net.hntdstudio.hytale.commands.UpdateHUD_CMD;
import net.hntdstudio.hytale.events.PlayerJoinListener;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

import net.hntdstudio.hytale.api.events.ListenerRegister;
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

        ListenerRegister registrar = new ListenerRegister(getEventRegistry());
            registrar.registerListener(new PlayerJoinListener());
    }
}
