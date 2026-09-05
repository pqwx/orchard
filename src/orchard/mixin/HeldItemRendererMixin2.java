/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIlllll
 * Mixin target   : HeldItemRenderer
 *
 * Recovered strings in this class:
 *   - getHandRenderType
 *   - updateHeldItems
 *   - INVOKE
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.item.HeldItemRenderer
 *  net.minecraft.item.ItemStack
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.item.ItemStack;
import orchard.internal.lIIllllI;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(value=EnvType.CLIENT)
@Mixin(value={HeldItemRenderer.class})
public abstract class HeldItemRendererMixin2 {
    @Redirect(method={"getHandRenderType"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_746;method_6047()Lnet/minecraft/class_1799;"))
    private static ItemStack I(ClientPlayerEntity clientPlayerEntity) {
        return lIIllllI.llIIl(clientPlayerEntity);
    }

    @Redirect(method={"updateHeldItems"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_746;method_6047()Lnet/minecraft/class_1799;"))
    private ItemStack l(ClientPlayerEntity clientPlayerEntity) {
        return lIIllllI.llIIl(clientPlayerEntity);
    }
}

