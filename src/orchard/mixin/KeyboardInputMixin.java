/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIIllIlI
 * Mixin target   : KeyboardInput
 *
 * Recovered strings in this class:
 *   - tick
 *   - TAIL
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.input.KeyboardInput
 *  net.minecraft.client.option.GameOptions
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.input.Input;
import net.minecraft.client.input.KeyboardInput;
import net.minecraft.client.option.GameOptions;
import orchard.core.ClientEntrypoint;
import orchard.internal.IIIIlII;
import orchard.module.movement.SprintReset2;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={KeyboardInput.class})
public abstract class KeyboardInputMixin
extends Input {
    @Shadow
    private GameOptions settings;

    @Inject(method={"tick"}, at={@At(value="TAIL")}, require=0)
    private void I(CallbackInfo callbackInfo) {
        IIIIlII iIIIlII;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        SprintReset2 sprintReset2 = clientEntrypoint.IlI().IIIIIII();
        if (sprintReset2 != null) {
            sprintReset2.lIll(MinecraftClient.getInstance(), this);
        }
        if ((iIIIlII = IIIIlII.IlI()) != null) {
            iIIIlII.IIII(this.settings, this);
        }
    }
}

