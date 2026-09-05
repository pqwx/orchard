/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIllIlIII
 * Mixin target   : ArmedEntityRenderState
 *
 * Recovered strings in this class:
 *   - updateRenderState
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
 *  net.minecraft.client.render.entity.state.ArmedEntityRenderState
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.Arm
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.entity.state.ArmedEntityRenderState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import orchard.internal.lIIllllI;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(value=EnvType.CLIENT)
@Mixin(value={ArmedEntityRenderState.class})
public abstract class ArmedEntityRenderStateMixin {
    @Redirect(method={"updateRenderState"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_61420(Lnet/minecraft/class_1306;)Lnet/minecraft/class_1799;"))
    private static ItemStack I(LivingEntity livingEntity, Arm arm) {
        if (livingEntity instanceof ClientPlayerEntity) {
            ClientPlayerEntity clientPlayerEntity = (ClientPlayerEntity)livingEntity;
            if (arm == livingEntity.getMainArm()) {
                return lIIllllI.llIIl(clientPlayerEntity);
            }
        }
        return livingEntity.getStackInArm(arm);
    }

    @Redirect(method={"updateRenderState"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_6047()Lnet/minecraft/class_1799;"))
    private static ItemStack l(LivingEntity livingEntity) {
        ItemStack itemStack;
        if (livingEntity instanceof ClientPlayerEntity) {
            ClientPlayerEntity clientPlayerEntity = (ClientPlayerEntity)livingEntity;
            itemStack = lIIllllI.llIIl(clientPlayerEntity);
        } else {
            itemStack = livingEntity.getMainHandStack();
        }
        return itemStack;
    }
}

