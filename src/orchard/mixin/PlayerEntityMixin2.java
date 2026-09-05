/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.lIIlIIlI
 * Mixin target   : PlayerEntity
 *
 * Recovered strings in this class:
 *   - knockbackTarget
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.Vec3d
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import orchard.core.ClientEntrypoint;
import orchard.module.movement.KeepSprint;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(value=EnvType.CLIENT)
@Mixin(value={PlayerEntity.class})
public abstract class PlayerEntityMixin2 {
    private static KeepSprint I() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        return clientEntrypoint == null || clientEntrypoint.IlI() == null ? null : clientEntrypoint.IlI().IIllllI();
    }

    @Redirect(method={"knockbackTarget"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1657;method_5728(Z)V"))
    private void l(PlayerEntity playerEntity, boolean bl, Entity entity, float f, Vec3d vec3d) {
        KeepSprint keepSprint = PlayerEntityMixin2.I();
        if (keepSprint != null && keepSprint.lI(playerEntity)) {
            return;
        }
        playerEntity.setSprinting(bl);
    }

    @Redirect(method={"knockbackTarget"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_243;method_18805(DDD)Lnet/minecraft/class_243;"))
    private Vec3d II(Vec3d vec3d, double d, double d2, double d3, Entity entity, float f, Vec3d vec3d2) {
        PlayerEntity playerEntity = (PlayerEntity)this;
        KeepSprint keepSprint = PlayerEntityMixin2.I();
        if (keepSprint == null || !keepSprint.lll(playerEntity)) {
            return vec3d.multiply(d, d2, d3);
        }
        double d4 = keepSprint.IlI();
        return vec3d.multiply(d4, d2, d4);
    }
}

