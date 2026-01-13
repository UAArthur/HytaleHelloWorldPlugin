package net.hntdstudio.hytale;

import com.hypixel.hytale.server.core.Options;
import com.hypixel.hytale.server.core.command.system.CommandManager;
import com.hypixel.hytale.server.core.plugin.JavaPlugin;
import com.hypixel.hytale.server.core.plugin.JavaPluginInit;
import net.hntdstudio.hytale.commands.HelloWorld_CMD;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;

public class Main extends JavaPlugin {

    public Main(@NonNullDecl JavaPluginInit init) {
        super(init);
    }


    @Override
    protected void start0() {
        System.out.println("Hello world lol!");
        CommandManager.get().register(new HelloWorld_CMD("helloworld", ""));

    }
}
