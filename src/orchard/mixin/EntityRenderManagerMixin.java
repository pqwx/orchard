/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIlIlIlll
 * Mixin target   : EntityRenderManager
 *
 * Recovered strings in this class:
 *   - net/minecraft/class_898
 *   - shouldRender
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
 *  net.minecraft.client.render.Frustum
 *  net.minecraft.entity.Entity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.Frustum;
import net.minecraft.entity.Entity;
import orchard.module.render.PlayerHider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(targets={"net/minecraft/class_898"})
public abstract class EntityRenderManagerMixin {
    @Inject(method={"shouldRender"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(Entity entity, Frustum frustum, double d, double d2, double d3, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (PlayerHider.lI(entity)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
}

