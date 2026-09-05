/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.lIllIlII
 * Mixin target   : Mouse
 *
 * Recovered strings in this class:
 *   - tick
 *   - HEAD
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.Mouse
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.Mouse;
import orchard.core.ClientEntrypoint;
import orchard.internal.lllIIlI;
import orchard.module.combat.AimOptimizer;
import orchard.module.movement.AutoPlay;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={Mouse.class})
public abstract class MouseMixin3 {
    @Shadow
    private double cursorDeltaY;
    @Shadow
    private double cursorDeltaX;

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    private void I(CallbackInfo callbackInfo) {
        AimOptimizer aimOptimizer;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        lllIIlI lllIIlI2 = clientEntrypoint.IlI();
        if (lllIIlI2 == null) {
            return;
        }
        AutoPlay autoPlay = lllIIlI2.llIIlI();
        if (autoPlay != null) {
            autoPlay.IlIlI(this.cursorDeltaX, this.cursorDeltaY);
        }
        if ((aimOptimizer = lllIIlI2.IIllII()) == null || !aimOptimizer.lII()) {
            return;
        }
        float f = aimOptimizer.IlI();
        this.cursorDeltaX *= (double)f;
        this.cursorDeltaY *= (double)f;
    }
}

