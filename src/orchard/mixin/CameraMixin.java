/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIlIlIIII
 * Mixin target   : Camera
 *
 * Recovered strings in this class:
 *   - update
 *   - TAIL
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.render.Camera
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.render.Camera;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import orchard.core.ClientEntrypoint;
import orchard.internal.Ill;
import orchard.internal.lIIlllIl;
import orchard.module.combat.AimAssist;
import orchard.module.render.Freecam;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={Camera.class})
public abstract class CameraMixin {
    @Shadow
    private boolean thirdPerson;

    @Shadow
    protected abstract void moveBy(float var1, float var2, float var3);

    @Inject(method={"update"}, at={@At(value="TAIL")})
    private void I(World world, Entity entity, boolean bl, boolean bl2, float f, CallbackInfo callbackInfo) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        Freecam freecam = clientEntrypoint.IlI().IlIllI();
        if (freecam != null && freecam.l(entity)) {
            this.thirdPerson = false;
            this.setPos(freecam.lI(f));
            this.setRotation(freecam.lII(f), freecam.lll(f));
            return;
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        boolean bl3 = false;
        AimAssist aimAssist = clientEntrypoint.IlI().IllIII();
        if (aimAssist != null && aimAssist.IIIlI(entity)) {
            f2 = aimAssist.lIlII(f);
            f3 = aimAssist.lIIll(f);
            bl3 = true;
        } else {
            Ill ill = lIIlllIl.II();
            if (lIIlllIl.III(ill, entity)) {
                f2 = lIIlllIl.I(ill, f);
                f3 = lIIlllIl.Il(ill, f);
                bl3 = true;
            }
        }
        if (bl3) {
            this.setPos(entity.getCameraPosVec(f));
            float f4 = f2;
            float f5 = f3;
            if (bl2) {
                f4 += 180.0f;
                f5 = -f5;
            }
            this.setRotation(f4, f5);
            if (bl) {
                Entity entity2;
                float f6 = 1.0f;
                float f7 = 4.0f;
                if (entity instanceof LivingEntity) {
                    LivingEntity livingEntity = (LivingEntity)entity;
                    f6 = livingEntity.getScale();
                    f7 = (float)livingEntity.getAttributeValue(EntityAttributes.CAMERA_DISTANCE);
                }
                float f8 = f6;
                float f9 = f7;
                if (entity.hasVehicle() && (entity2 = entity.getVehicle()) instanceof LivingEntity) {
                    LivingEntity livingEntity = (LivingEntity)entity2;
                    f8 = livingEntity.getScale();
                    f9 = (float)livingEntity.getAttributeValue(EntityAttributes.CAMERA_DISTANCE);
                }
                this.moveBy(-this.clipToSpace(Math.max(f6 * f7, f8 * f9)), 0.0f, 0.0f);
            }
            return;
        }
    }

    @Shadow
    protected abstract float clipToSpace(float var1);

    @Shadow
    protected abstract void setPos(Vec3d var1);

    @Shadow
    protected abstract void setRotation(float var1, float var2);
}

