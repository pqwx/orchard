/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IlIIIIIIl
 * Mixin target   : Mouse
 *
 * Recovered strings in this class:
 *   - onMouseButton
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
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.Mouse
 *  net.minecraft.client.input.MouseInput
 *  net.minecraft.client.util.Window
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
import net.minecraft.client.Mouse;
import net.minecraft.client.input.MouseInput;
import net.minecraft.client.util.Window;
import orchard.core.ClientEntrypoint;
import orchard.internal.lIIllllI;
import orchard.internal.lIllIIlI;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={Mouse.class})
public abstract class MouseMixin2 {
    @Shadow
    private MinecraftClient client;

    @Shadow
    public abstract double getScaledX(Window var1);

    @Shadow
    public abstract double getScaledY(Window var1);

    @Inject(method={"onMouseButton"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(long l2, MouseInput mouseInput, int n, CallbackInfo callbackInfo) {
        lIIllllI.IIlIlI(l2, mouseInput.button(), n);
        if (this.client == null || this.client.currentScreen == null || this.client.currentScreen instanceof lIllIIlI || this.client.getOverlay() != null || n != 1) {
            return;
        }
        Window window = this.client.getWindow();
        if (l2 != window.getHandle()) {
            return;
        }
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null && clientEntrypoint.IlI() != null) {
            double d = this.getScaledX(window);
            double d2 = this.getScaledY(window);
            if (clientEntrypoint.IlI().llIll(d, d2, mouseInput.button())) {
                callbackInfo.cancel();
            }
        }
    }
}

