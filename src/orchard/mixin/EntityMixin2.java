/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIIllIIlI
 * Mixin target   : Entity
 *
 * Recovered strings in this class:
 *   - shouldRenderName
 *   - getDisplayName
 *   - isInvisibleTo
 *   - getName
 *   - RETURN
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
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.text.Text
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import orchard.internal.IIIIllIII;
import orchard.internal.IIlIllIII;
import orchard.internal.IllIIlll;
import orchard.module.render.Nametags;
import orchard.module.render.PlayerHider;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={Entity.class})
public abstract class EntityMixin2 {
    @Inject(method={"isInvisibleTo"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(PlayerEntity playerEntity, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        Entity entity = (Entity)this;
        if (PlayerHider.lI(entity)) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    @Inject(method={"getDisplayName"}, at={@At(value="RETURN")}, cancellable=true)
    private void l(CallbackInfoReturnable<Text> callbackInfoReturnable) {
        Entity entity = (Entity)this;
        if (entity instanceof PlayerEntity) {
            PlayerEntity playerEntity = (PlayerEntity)entity;
            Text text = IIlIllIII.III(playerEntity.getGameProfile(), (Text)callbackInfoReturnable.getReturnValue());
            callbackInfoReturnable.setReturnValue((Object)IIIIllIII.IIl(playerEntity, IllIIlll.I(playerEntity, text)));
        }
    }

    @Inject(method={"shouldRenderName"}, at={@At(value="HEAD")}, cancellable=true)
    private void II(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        Entity entity = (Entity)this;
        if (PlayerHider.IlI(entity) || Nametags.llIl(entity)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"getName"}, at={@At(value="RETURN")}, cancellable=true)
    private void Il(CallbackInfoReturnable<Text> callbackInfoReturnable) {
        Entity entity = (Entity)this;
        if (entity instanceof PlayerEntity) {
            PlayerEntity playerEntity = (PlayerEntity)entity;
            Text text = IIlIllIII.III(playerEntity.getGameProfile(), (Text)callbackInfoReturnable.getReturnValue());
            callbackInfoReturnable.setReturnValue((Object)IIIIllIII.IIl(playerEntity, IllIIlll.I(playerEntity, text)));
        }
    }
}

