/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIllllIlI
 * Mixin target   : EntityRenderer
 *
 * Recovered strings in this class:
 *   - hasLabel
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
 *  net.minecraft.client.render.entity.EntityRenderer
 *  net.minecraft.entity.Entity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.entity.Entity;
import orchard.module.render.Nametags;
import orchard.module.render.PlayerHider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={EntityRenderer.class})
public abstract class EntityRendererMixin {
    @Inject(method={"hasLabel"}, at={@At(value="HEAD")}, cancellable=true, require=0)
    private void I(Entity entity, double d, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (PlayerHider.IlI(entity) || Nametags.llIl(entity)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
}

