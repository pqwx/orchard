/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.llII
 * Mixin target   : LightmapTextureManager
 *
 * Recovered strings in this class:
 *   - getDarkness
 *   - update
 *   - INVOKE
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
 *  net.minecraft.client.option.SimpleOption
 *  net.minecraft.client.render.LightmapTextureManager
 *  net.minecraft.entity.LivingEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.option.SimpleOption;
import net.minecraft.client.render.LightmapTextureManager;
import net.minecraft.entity.LivingEntity;
import orchard.module.render.FullBright;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={LightmapTextureManager.class})
public abstract class LightmapTextureManagerMixin {
    @Inject(method={"getDarkness"}, at={@At(value="HEAD")}, cancellable=true, require=0)
    private void I(LivingEntity livingEntity, float f, float f2, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        if (FullBright.I()) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.0f));
        }
    }

    @Redirect(method={"update"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_7172;method_41753()Ljava/lang/Object;", ordinal=2), require=0)
    private Object l(SimpleOption<?> simpleOption) {
        Object object = simpleOption.getValue();
        return FullBright.I() && object instanceof Double ? Double.valueOf(16.0) : object;
    }
}

