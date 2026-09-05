/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.llIIIIl
 * Mixin target   : FireworkRocketEntity
 *
 * Recovered strings in this class:
 *   - INVOKE
 *   - tick
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.projectile.FireworkRocketEntity
 *  net.minecraft.util.math.Vec3d
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.util.math.Vec3d;
import orchard.core.ClientEntrypoint;
import orchard.module.movement.MoveFix;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(value=EnvType.CLIENT)
@Mixin(value={FireworkRocketEntity.class})
public abstract class FireworkRocketEntityMixin2 {
    @Redirect(method={"tick"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1309;method_5720()Lnet/minecraft/class_243;"), require=0)
    private Vec3d I(LivingEntity livingEntity) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null || clientEntrypoint.IlI() == null) {
            return livingEntity.getRotationVector();
        }
        MoveFix moveFix = clientEntrypoint.IlI().lIIlll();
        return moveFix == null ? livingEntity.getRotationVector() : moveFix.lll(livingEntity);
    }
}

