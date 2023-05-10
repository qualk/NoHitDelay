package xyz.qualk.nohitdelay.command;

import xyz.qualk.nohitdelay.NoHitDelay;
import cc.polyfrost.oneconfig.utils.commands.annotations.Command;
import cc.polyfrost.oneconfig.utils.commands.annotations.Main;

/**
 * An example command implementing the Command api of OneConfig.
 * Registered in NoHitDelay.java with `CommandManager.INSTANCE.registerCommand(new ExampleCommand());`
 *
 * @see Command
 * @see Main
 * @see NoHitDelay
 */
@Command(value = NoHitDelay.MODID, description = "Access the " + NoHitDelay.NAME + " GUI.")
public class ExampleCommand {
    @Main
    private void handle() {
        NoHitDelay.INSTANCE.config.openGui();
    }
}