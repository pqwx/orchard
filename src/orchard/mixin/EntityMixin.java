/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIIlIlI
 * Mixin target   : Entity
 *
 * Recovered strings in this class:
 *   - getTeamColorValue
 *   - isGlowing
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
 *  net.minecraft.entity.Entity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import orchard.internal.IIIIIIIII;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={Entity.class})
public abstract class EntityMixin {
    @Inject(method={"getTeamColorValue"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        Entity entity = (Entity)this;
        if (IIIIIIIII.III(entity.getUuid())) {
            callbackInfoReturnable.setReturnValue((Object)IIIIIIIII.I(entity.getUuid()));
        }
    }

    @Inject(method={"isGlowing"}, at={@At(value="HEAD")}, cancellable=true)
    private void l(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        Entity entity = (Entity)this;
        if (IIIIIIIII.III(entity.getUuid())) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }
}

