package xyz.qualk.nohitdelay;

import xyz.qualk.nohitdelay.command.ExampleCommand;
import xyz.qualk.nohitdelay.config.TestConfig;
import cc.polyfrost.oneconfig.events.event.InitializationEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import cc.polyfrost.oneconfig.utils.commands.CommandManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

/**
 * The entrypoint of the Example Mod that initializes it.
 *
 * @see Mod
 * @see InitializationEvent
 */
@Mod(modid = NoHitDelay.MODID, name = NoHitDelay.NAME, version = NoHitDelay.VERSION)
public class NoHitDelay implements preInitializationEvent {
    public static final String MODID = "@ID@";
    public static final String NAME = "@NAME@";
    public static final String VERSION = "@VER@";
    // Sets the variables from `gradle.properties`. See the `blossom` config in `build.gradle.kts`.
    @Mod.Instance(MODID)
    public static NoHitDelay INSTANCE; // Adds the instance of the mod, so we can access other variables.
    public static TestConfig config;
}

public class NoHitDelay implements IFMLLoadingPlugin {
    public NoHitDelay() {
        Mixinbootstrap.init();
        Mixins.addConfiguration("mixins.nohitdelay.json");
        MixinEnvironment.getDefaultEnvironment().setSide(MixinEnvironment.Side.CLIENT);
    }
}

    // Register the config and commands.
    @Mod.EventHandler
    public void preInit(FMLInitializationEvent event) {
        config = new TestConfig();
        CommandManager.INSTANCE.registerCommand(new ExampleCommand());
    }

