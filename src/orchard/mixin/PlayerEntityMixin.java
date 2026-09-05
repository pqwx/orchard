/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IlIIlIIII
 * Mixin target   : PlayerEntity
 *
 * Recovered strings in this class:
 *   - getDisplayName
 *   - getName
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
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import orchard.internal.IIIIllIII;
import orchard.internal.IIlIllIII;
import orchard.internal.IllIIlll;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={PlayerEntity.class})
public abstract class PlayerEntityMixin {
    @Inject(method={"getDisplayName"}, at={@At(value="RETURN")}, cancellable=true, require=0)
    private void I(CallbackInfoReturnable<Text> callbackInfoReturnable) {
        PlayerEntity playerEntity = (PlayerEntity)this;
        Text text = IIlIllIII.III(playerEntity.getGameProfile(), (Text)callbackInfoReturnable.getReturnValue());
        callbackInfoReturnable.setReturnValue((Object)IIIIllIII.IIl(playerEntity, IllIIlll.I(playerEntity, text)));
    }

    @Inject(method={"getName"}, at={@At(value="RETURN")}, cancellable=true, require=0)
    private void l(CallbackInfoReturnable<Text> callbackInfoReturnable) {
        PlayerEntity playerEntity = (PlayerEntity)this;
        Text text = IIlIllIII.III(playerEntity.getGameProfile(), (Text)callbackInfoReturnable.getReturnValue());
        callbackInfoReturnable.setReturnValue((Object)IIIIllIII.IIl(playerEntity, IllIIlll.I(playerEntity, text)));
    }
}

