package xyz.qualk.nohitdelay.mixin;

import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * An example mixin using SpongePowered's Mixin library and ObjectWeb ASM.
 *
 * @see Inject
 * @see Mixin
 */

@Mixin(Minecraft.class)
public class MinecraftMixin {

    @Shadow private int leftClickCounter;

    @Inject(method = "clickMouse", at = @At(value = "HEAD"))
    private void clickMouseAfter(final CallbackInfo ci) {
        leftClickCounter = 0;
    }
}