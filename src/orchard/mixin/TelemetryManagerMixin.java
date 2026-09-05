/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.lIIIl
 * Mixin target   : TelemetryManager
 *
 * Recovered strings in this class:
 *   - getSender
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
 *  net.minecraft.client.session.telemetry.TelemetryManager
 *  net.minecraft.client.session.telemetry.TelemetrySender
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.session.telemetry.TelemetryManager;
import net.minecraft.client.session.telemetry.TelemetrySender;
import orchard.net.PacketInterceptor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={TelemetryManager.class})
public abstract class TelemetryManagerMixin {
    @Inject(method={"getSender"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(CallbackInfoReturnable<TelemetrySender> callbackInfoReturnable) {
        if (PacketInterceptor.IlII()) {
            callbackInfoReturnable.setReturnValue((Object)TelemetrySender.NOOP);
        }
    }
}

