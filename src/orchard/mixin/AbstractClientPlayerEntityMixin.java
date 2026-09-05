/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIIIIII
 * Mixin target   : AbstractClientPlayerEntity
 *
 * Recovered strings in this class:
 *   - getSkin
 *   - HEAD
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import com.mojang.authlib.GameProfile;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import orchard.internal.IIlIllIII;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={AbstractClientPlayerEntity.class})
public abstract class AbstractClientPlayerEntityMixin {
    @Inject(method={"getSkin"}, at={@At(value="HEAD")}, cancellable=true, require=0)
    private void I(CallbackInfoReturnable<Object> callbackInfoReturnable) {
        GameProfile gameProfile = ((AbstractClientPlayerEntity)this).getGameProfile();
        Object object = IIlIllIII.I(gameProfile);
        if (object != null) {
            callbackInfoReturnable.setReturnValue(object);
        }
    }
}

