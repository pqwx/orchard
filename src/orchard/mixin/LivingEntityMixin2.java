/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IllIllIl
 * Mixin target   : LivingEntity
 *
 * Recovered strings in this class:
 *   - getHandSwingDuration
 *   - RETURN
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
 *  net.minecraft.entity.LivingEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import orchard.core.ClientEntrypoint;
import orchard.module.render.Animations;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={LivingEntity.class})
public abstract class LivingEntityMixin2 {
    @Inject(method={"getHandSwingDuration"}, at={@At(value="RETURN")}, cancellable=true, require=0)
    private void I(CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null || minecraftClient.player != this) {
            return;
        }
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        Animations animations = clientEntrypoint.IlI().IIlIII();
        if (animations != null && animations.lIlI()) {
            callbackInfoReturnable.setReturnValue((Object)animations.lIll((Integer)callbackInfoReturnable.getReturnValue()));
        }
    }
}

