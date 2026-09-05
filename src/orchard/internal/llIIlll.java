/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.Arm
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.RotationAxis
 *  org.joml.Quaternionfc
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import orchard.core.ClientEntrypoint;
import orchard.internal.IIlIlllI;
import orchard.internal.IIllIlll;
import orchard.module.render.Animations;
import org.joml.Quaternionfc;

@Environment(value=EnvType.CLIENT)
public final class llIIlll {
    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static void I(AbstractClientPlayerEntity abstractClientPlayerEntity, Hand hand, ItemStack itemStack, float f, float f2, MatrixStack matrixStack) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        Hand hand2;
        float f8;
        Arm arm;
        Animations animations = llIIlll.l();
        if (animations == null) return;
        if (!animations.lIII()) return;
        if (itemStack.isEmpty()) return;
        if (llIIlll.II(abstractClientPlayerEntity, hand)) {
            arm = llIIlll.Il(abstractClientPlayerEntity, hand);
            f8 = arm == Arm.RIGHT ? 1.0f : -1.0f;
            hand2 = abstractClientPlayerEntity.preferredHand != null ? abstractClientPlayerEntity.preferredHand : Hand.MAIN_HAND;
            f7 = hand2 == hand ? f2 : 0.0f;
        }
        return;
        float f9 = !abstractClientPlayerEntity.handSwinging || hand2 != hand ? 0.0f : Math.max(0.0f, abstractClientPlayerEntity.getHandSwingProgress(f));
        float f10 = Math.max(0.0f, Math.max(f7, f9));
        IIllIlll iIllIlll = animations.IIII(hand);
        float f11 = iIllIlll.IIl(f10);
        float f12 = MathHelper.sin((double)(f10 * f10 * (float)Math.PI));
        float f13 = 1.0f;
        float f14 = iIllIlll.Ill();
        if (!animations.IIl() && arm == Arm.LEFT) {
            f14 = -f14;
        }
        matrixStack.translate(f14, iIllIlll.lll(), iIllIlll.lIl());
        float f15 = iIllIlll.I();
        switch (iIllIlll.Il()) {
            case lI: {
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(animations.lIl(hand)));
                break;
            }
            case ll: {
                matrixStack.translate(-0.14142136f * f8 - 0.05f * f8 * f11 * f15, 0.08f + 0.06f * f11 * f15, 0.14142136f - 0.09f * f12 * f15);
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(-102.25f - 80.0f * f11 * f15));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(13.365f * f8 - 20.0f * f8 * f12 * f15));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(78.05f * f8 - 20.0f * f8 * f11 * f15));
                break;
            }
        }
        switch (iIllIlll.IIII()) {
            case l: {
                f6 = f11 * f15;
                matrixStack.translate(-0.14f * f8 * f6, 0.06f * f6, -0.08f * f6);
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(f8 * (45.0f - 24.0f * f12 * f15)));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(f8 * -18.0f * f6));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(-72.0f * f6));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(f8 * -45.0f));
                break;
            }
            case II: {
                f6 = iIllIlll.II(f10);
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(f6 * 360.0f * f15 * f8));
                break;
            }
            case lI: {
                f6 = 1.0f - f11 * 0.16f * f15;
                f13 = MathHelper.clamp((float)f6, (float)0.72f, (float)1.25f);
                break;
            }
            case Il: {
                f6 = f11 * f15;
                matrixStack.translate(0.0f, 0.035f * f6, -0.06f * f6);
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(-58.0f * f6));
                break;
            }
            case IIl: {
                f6 = f11 * f15;
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(iIllIlll.IlI() * f6));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(iIllIlll.III() * f6 * f8));
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(iIllIlll.IIlI() * f6 * f8));
                break;
            }
            case III: {
                matrixStack.translate(0.0f, -f11 * 0.02f * f15, -f11 * 0.42f * f15);
                matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(-22.0f * f11 * f15));
                break;
            }
        }
        if ((f6 = iIllIlll.ll()) != 0.0f) {
            matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_X.rotationDegrees(f6));
        }
        if ((f5 = iIllIlll.IlII()) != 0.0f) {
            matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Y.rotationDegrees(f5));
        }
        if ((f4 = iIllIlll.llI()) != 0.0f) {
            matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(f4));
        }
        if ((f3 = iIllIlll.IIIl()) != 0.0f) {
            matrixStack.multiply((Quaternionfc)RotationAxis.POSITIVE_Z.rotationDegrees(f3 * f8));
        }
        float f16 = iIllIlll.lII() * f13;
        matrixStack.scale(f16, f16, f16);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Animations l() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return null;
        }
        Animations animations = clientEntrypoint.IlI().IIlIII();
        return animations;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean II(AbstractClientPlayerEntity abstractClientPlayerEntity, Hand hand) {
        Animations animations = llIIlll.l();
        if (animations == null) return true;
        if (!animations.lIII()) return true;
        if (animations.IIIIl()) {
            return true;
        }
        if (llIIlll.Il(abstractClientPlayerEntity, hand) == Arm.LEFT) return false;
        return true;
    }

    private llIIlll() {
    }

    private static Arm Il(AbstractClientPlayerEntity abstractClientPlayerEntity, Hand hand) {
        return hand == Hand.MAIN_HAND ? abstractClientPlayerEntity.getMainArm() : abstractClientPlayerEntity.getMainArm().getOpposite();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean lI(Hand hand) {
        Animations animations = llIIlll.l();
        if (animations == null) return false;
        if (!animations.lIII()) return false;
        if (animations.IlIll(hand) == IIlIlllI.IlI) return false;
        return true;
    }
}

