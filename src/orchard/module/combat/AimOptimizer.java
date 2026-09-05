/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIl
 * Module         : Aim Optimizer  [COMBAT]
 * Description    : Slows mouse movement near targets and releases speed on the hitbox   (client's own text)
 *
 * Recovered strings in this class:
 *   - Target Tracking Scale
 *   - Max Field of View
 *   - Only While Moving
 *   - Micro Adjustment
 *   - Smoothing Speed
 *   - Deadzone Radius
 *   - Pitch Weight
 *   - Target Mode
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.combat;

import java.util.Iterator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIlllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class AimOptimizer
extends ModuleBase {
    private final lIlIIlI I;
    private final lIlIIlI l;
    private static final float II = 0.01f;
    private final IIIIIIIIl<IIIIlllI> Il = this.IIlllIl(new IIIIIIIIl<IIIIlllI>(StringFactory.IIII("Target Mode"), IIIIlllI.class, IIIIlllI.Il));
    private static final double lI = 8.0;
    private final lIlIIlI ll;
    private final lIlIIlI III;
    private static String[] IIl;
    private final lIlIIlI IlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Range"), 8.0, 2.0, 12.0, 0.25).IIIl("m"));
    private final llIll Ill;
    private final lIlIIlI lII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Max Field of View"), 9.0, 1.0, 35.0, 0.5).IIIl("deg"));
    private final lIlIIlI lIl;
    private volatile float llI = 1.0f;
    private static final int[] lll;
    private static final String[] IIII;
    private static final Object[] IIIl;

    private static void I() {
        AimOptimizer.IIl[0] = AimOptimizer.lll(AimOptimizer.lIII(1957608165, 1455843325).toCharArray(), 69738L, 1496496929);
        AimOptimizer.IIl[1] = AimOptimizer.lll(AimOptimizer.lIII(1957608164, 161967199).toCharArray(), 28317L, -2044860459);
        AimOptimizer.IIl[2] = AimOptimizer.lll(AimOptimizer.lIII(1957608167, 327118299).toCharArray(), 58905L, -993943688);
        AimOptimizer.IIl[3] = AimOptimizer.lll(AimOptimizer.lIII(1957608166, 1380008035).toCharArray(), 12333L, -935669782);
        AimOptimizer.IIl[4] = AimOptimizer.lll(AimOptimizer.lIII(1957608161, -2128579789).toCharArray(), 58220L, 314773199);
        AimOptimizer.IIl[5] = AimOptimizer.lll(AimOptimizer.lIII(1957608160, -1390801274).toCharArray(), 85147L, -242829458);
        AimOptimizer.IIl[6] = AimOptimizer.lll(AimOptimizer.lIII(1957608163, -84792631).toCharArray(), 36767L, 1900084491);
        AimOptimizer.IIl[7] = AimOptimizer.lll(AimOptimizer.lIII(1957608162, 1862953339).toCharArray(), 57512L, -856759623);
        AimOptimizer.IIl[8] = AimOptimizer.lll(AimOptimizer.lIII(1957608173, -1123720796).toCharArray(), 74178L, 130095361);
        AimOptimizer.IIl[9] = AimOptimizer.lll(AimOptimizer.lIII(1957608172, -872138518).toCharArray(), 85880L, -30734475);
        AimOptimizer.IIl[10] = AimOptimizer.lll(AimOptimizer.lIII(1957608175, 1646814225).toCharArray(), 53280L, -1351893757);
        AimOptimizer.IIl[11] = AimOptimizer.lll(AimOptimizer.lIII(1957608174, 1246243512).toCharArray(), 96930L, 1105311125);
        AimOptimizer.IIl[12] = AimOptimizer.lll(AimOptimizer.lIII(1957608169, 1211256146).toCharArray(), 22688L, -549531916);
    }

    @Override
    public void llll() {
        this.llI = 1.0f;
    }

    private void lI(float f) {
        float f2 = MathHelper.clamp((float)((Double)this.ll.lIl()).floatValue(), (float)0.01f, (float)1.0f);
        this.llI = MathHelper.lerp((float)f2, (float)this.llI, (float)f);
        if (Math.abs(this.llI - f) < 0.001f) {
            this.llI = f;
        }
    }

    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null) {
            if (minecraftClient.player != null && minecraftClient.world != null) {
                this.lI(this.lIl(minecraftClient));
                return;
            }
        }
        this.lI(1.0f);
    }

    @Override
    public void ll() {
        this.llI = ((Double)this.I.lIl()).floatValue();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIl(LivingEntity livingEntity, IIIIlllI iIIIlllI) {
        boolean bl = livingEntity instanceof PlayerEntity;
        if (iIIIlllI == IIIIlllI.lI) return true;
        if (iIIIlllI == IIIIlllI.Il) {
            if (bl) return true;
        }
        if (iIIIlllI != IIIIlllI.l) return false;
        if (bl) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public float IlI() {
        if (!this.IIIlIIl()) return 1.0f;
        float f = this.llI;
        return f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean lII() {
        if (!this.IIIlIIl()) return false;
        if (!(Math.abs(this.llI - 1.0f) > 0.01f)) return false;
        return true;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 15462;
        var7_3 = "\u5c58\uff4d\u29c3\uaa19\u290e\u7810\u6251\uede9\uaf50\uf49f\ue70f\u36b8\u4881\u38e4\u3061\u623d\ua993\u37d6\u6dde\u529f\u2800\u87a0\ud710\u19c3\u5481\u39d5\u220d\ue5fd\u03c3\u8149\ucb37\u3b27\ue75c\ud74d\uec88\u762e\u21cb\ub884\u37dc\u4e60\u16e4\u1f0a\u8361\u785b\u09f7\ub653\uec69\u8ab3\u70f8\uc6d0\u1d8b\ucb48\u6057\u570c\u540c\ube40\u5fd3\u524c\u8021\ub088\u95e3\u631b\u886d\uaced\u4ce3\u6def\u3888\u7618\uc7fd\u0e08\u4091\u39d4\ua452\u8180\u2cdd\ub263\ucc00\u2f41\u7da5\u660c\u7534\u61da\uf22e\u1461\u0a19\uea80\u5e49\u34e3\u497e\u30bb\u0ca2\uaad1\u638c\uf567\uaba4\ue8e8\ud47b\uc48b\uee42\u6cbc\u56ff\u14a0\u22e4\u80ad\u2a46\u180d\ud8e3\u48ab\u7b2b\ub1a8\u4ade\u3f5d\u38b5\u268b\ueaa1\u56fd\u3aaf\u6a30\u8d0b\ubc44\uc94d\u55c9\u4019\u9fcb\u194b\uc817\u3582\u3191\uef79\uf6ed\u5ad4\u4c90\u201f\ube6a\u938f\ub979\u744c\u8b07\ud943\u8bb8\ue61a\ueed9\ufc74\u648f\uf097\ueb82\u5fd8\ua0bd\u0299\u0fd5\u7d55\u0a92\u3fcb\ueb80\uf742\u5d4f\u5be6\uf57b\u1110\u3563\u9b18\u0f3c\uf79c\uee2b\u2ab5\u1529\u2406\u46bb\u59bf\u38fd\u2c71\u7fe8\u20c7\ueb28\u9cba\ud7e6\u46da\u7bb3\u4453\uc901\u7f78\uc33b\ud2d6\u5ea0\u31e0\ue4ab\u2ed3\ub52e\u53a7\u9003\ue759\u92b5\u4706\ued53\u32a1\uf23f\u0a96\u0e5d\ucbcf\u3871\u40de\u20c3\u99c6\uab16\uafc7\u7b36\u1efa\ue791\u88d5\u8566\u9984\ufa70\u0cb1\u53f2\u47d7\ue345\u3d5b\ufb96\u355c\u46b1\uf2e9\ub32e\ufd7f\u1820\u374f\udf1c\ua723\u1530\u4de9\u0cb6\u9088\ud68b\u8f9a\u741c\u53ef\u1c41\u6d4c\uf426\ud29f\ub6f9\u07b1\u89d0\u0c16\u64f2\ubd5e\ube1b\ue58c\ud491\u6a05\u21e7\u703a\u8f31\uef41\u446b\ua372\u687b\ucb3e\ub4d9\u6be3\u8e5e\u17f1\ub339\ufe48\u51cf\u11d1\u87d3\ud71c\ue0a4\u3dbf\ued52\u89a7\u1d22\u8ad2\u491f\uc61c\u201a\u5c49\ub914\u0e9e\ud4e8\u5c67\u8369\u850f\u3dc9\u44a5\u23a1\ue521\u8c1c\u5832\u2030\u7a83\uf1aa\ufce6\ue966\u3f8f\u9419";
        var8_4 = "\u3c72\u3c6e\u3c62\u3c72\u3c7e\u3c7a\u3c7e\u3c76\u3c76\u3c3e\u3c62\u3c72\u3c7e".toCharArray();
        var9_5 = new String[var8_4.length];
        var13_9 = -1;
        if (true) ** GOTO lbl13
        while (true) {
            block10: {
                block11: {
                    if (var15_11 < var14_10.length) break block10;
                    var9_5[var10_6] = new String(var14_10).intern();
                    var11_7 += var12_8;
                    if (++var10_6 < var8_4.length) break block11;
                    var13_9 = 0;
lbl13:
                    // 2 sources

                    var10_6 = 0;
                    var11_7 = 0;
                    var12_8 = 0;
                    if (var13_9 == 0) ** GOTO lbl38
                }
                var12_8 = var8_4[var10_6] ^ var6;
                var14_10 = var7_3.substring(var11_7, var11_7 + var12_8).toCharArray();
                var15_11 = 0;
            }
            switch (var15_11 % 6) {
                case 2: {
                    v0 = 80;
                    break;
                }
                case 1: {
                    v0 = 124;
                    break;
                }
                case 3: {
                    v0 = 99;
                    break;
                }
                case 4: {
                    v0 = 56;
                    break;
                }
                default: {
                    v0 = 53;
                    break;
                }
lbl38:
                // 1 sources

                AimOptimizer.IIII = var9_5;
                AimOptimizer.IIIl = new Object[var9_5.length];
                var2_2 = -1014792593;
                var0_12 = ">\u001e3\u00ad\u00a39\u008f\u009f\u009f\u00a2]>%\u00940\u0086_\u00d1\u00a4\u009f\u00ed\u009b!|z3\u00c6\u008c\u0001\u0090D\u00ba\u00ab=\u009ez\u0007\u0012\u00f4\u00cf\u00b6C\u00f5g\u00f1\u009f\u009e\u00ce6l\u00a1\u0007\u0099\u0086R'\u0091\u0012\u00ea^\u00e0\u00f3\u00adW\u00dfHY\u0094\u0093h5\u00f0\u0089F/\u00da\u00f5`\u00b4\u00b3$\u00e2\u0092\u00c6\u00cd\u00e2\u001b\u00a1\u008e\u00e2\u00f3\u0090\u00c77\u00da\u000b=t9\u00f5\u00ef\u00123\u00adOy\u00f7\u00dfwk\u0089\u0098\u00b62\u00bb\u0002\n\u00ef\u000b\u00bf".getBytes("ISO-8859-1");
                var1_13 = var0_12.length / 4;
                AimOptimizer.lll = new int[var1_13];
                var3_14 = 0;
                var4_15 = 0;
                if (true) ** GOTO lbl59
                case 5: {
                    v0 = 13;
                }
            }
            var16_1 = v0;
            v1 = var15_11++;
            var14_10[v1] = (char)(var14_10[v1] ^ var16_1);
        }
        while (true) {
            var3_14 += 4;
            if (++var4_15 >= var1_13) {
                AimOptimizer.IIl = new String[13];
                AimOptimizer.I();
                return;
            }
lbl59:
            // 3 sources

            var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
            AimOptimizer.lll[var4_15] = var5_16 ^= var2_2;
        }
    }

    public AimOptimizer() {
        super(StringFactory.IIII("Aim Optimizer"), Category.II, StringFactory.IIII("Slows mouse movement near targets and releases speed on the hitbox"));
        this.l = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Smoothing Speed"), 0.55, 0.1, 1.0, 0.05));
        this.lIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Target Tracking Scale"), 1.08, 0.5, 1.5, 0.05));
        this.I = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Pitch Weight"), 1.0, 0.5, 1.5, 0.05));
        this.III = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Deadzone Radius"), 0.05, 0.0, 0.5, 0.01).IIIl("m"));
        this.ll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Micro Adjustment"), 0.22, 0.05, 0.6, 0.01));
        this.Ill = this.IIlllIl(new llIll((Object)StringFactory.IIII("Only While Moving"), true));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private float lIl(MinecraftClient minecraftClient) {
        if (!this.IIlI(minecraftClient)) {
            return ((Double)this.I.lIl()).floatValue();
        }
        Vec3d vec3d = minecraftClient.player.getEyePos();
        Vec3d vec3d2 = minecraftClient.player.getRotationVec(1.0f).normalize();
        double d = Math.max(0.1, (Double)this.IlI.lIl());
        Vec3d vec3d3 = vec3d.add(vec3d2.multiply(d));
        IIIIlllI iIIIlllI = (IIIIlllI)((Object)this.Il.lIl());
        double d2 = Math.max(0.0, (Double)this.III.lIl());
        double d3 = Math.max(0.1, (Double)this.lII.lIl());
        double d4 = 0.0;
        Iterator iterator = minecraftClient.world.getEntities().iterator();
        boolean bl = true;
        block0: while (true) {
            LivingEntity livingEntity;
            if (!bl || (bl = false) || !true) {
                if (this.IIl(livingEntity, iIIIlllI) && !(minecraftClient.player.squaredDistanceTo((Entity)livingEntity) > d * d)) {
                    Box box = livingEntity.getBoundingBox().expand(d2);
                    if (box.raycast(vec3d, vec3d3).isPresent()) {
                        return ((Double)this.lIl.lIl()).floatValue();
                    }
                    double d5 = this.IIII(vec3d, vec3d2, box);
                    if (d5 <= d3) {
                        double d6 = 1.0 - d5 / d3;
                        d4 = Math.max(d4, this.IllI(d6));
                    }
                }
            }
            while (true) {
                if (!iterator.hasNext()) {
                    float f = ((Double)this.I.lIl()).floatValue();
                    if (!(d4 <= 0.0)) {
                        float f2 = ((Double)this.l.lIl()).floatValue();
                        return (float)MathHelper.lerp((double)d4, (double)f, (double)f2);
                    }
                    return f;
                }
                Entity entity = (Entity)iterator.next();
                if (entity instanceof LivingEntity && (livingEntity = (LivingEntity)entity) != minecraftClient.player && livingEntity.isAlive() && !livingEntity.isRemoved()) continue block0;
            }
            break;
        }
    }

    private static String lll(char[] cArray, long l2, int n) {
        int n2 = 0x47752FC0 ^ n;
        int n3 = 0;
        while (n3 < cArray.length) {
            n2 = n2 ^ (int)l2 ^ ~n3;
            n2 ^= n - n3 * cArray.length;
            n2 = -n2 * n | n3;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            int n4 = n3 & 0xFF;
            n = n << n4 | n >>> -n4;
            l2 ^= (long)n4;
            ++n3;
        }
        return new String(cArray);
    }

    private double IIII(Vec3d vec3d, Vec3d vec3d2, Box box) {
        Vec3d vec3d3 = box.getCenter();
        Vec3d vec3d4 = new Vec3d(vec3d3.x, box.minY + (box.maxY - box.minY) * 0.72, vec3d3.z);
        Vec3d vec3d5 = new Vec3d(vec3d3.x, box.minY + (box.maxY - box.minY) * 0.38, vec3d3.z);
        return Math.min(this.IlII(vec3d2, vec3d3.subtract(vec3d)), Math.min(this.IlII(vec3d2, vec3d4.subtract(vec3d)), this.IlII(vec3d2, vec3d5.subtract(vec3d))));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlI(MinecraftClient minecraftClient) {
        if (!((Boolean)this.Ill.lIl()).booleanValue()) {
            return true;
        }
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.attackKey == null) return false;
        if (!minecraftClient.options.attackKey.isPressed()) return false;
        return true;
    }

    private double IlII(Vec3d vec3d, Vec3d vec3d2) {
        double d = vec3d2.length();
        if (d <= 1.0E-6) {
            return 0.0;
        }
        double d2 = MathHelper.clamp((double)vec3d.dotProduct(vec3d2.multiply(1.0 / d)), (double)-1.0, (double)1.0);
        return Math.toDegrees(Math.acos(d2));
    }

    private double IllI(double d) {
        double d2 = MathHelper.clamp((double)d, (double)0.0, (double)1.0);
        return d2 * d2 * (3.0 - 2.0 * d2);
    }

    private static int Illl(int n, int n2) {
        return lll[n ^ 0xD5C17E2] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lIII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x74AEBAE5;
        char[] cArray = IIII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            AimOptimizer.IIIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x637F059D;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 30: {
                    n6 = 38;
                    continue block33;
                }
                case 6: {
                    n6 = 3;
                    continue block33;
                }
                case 15: {
                    n6 = 161;
                    continue block33;
                }
                case 27: {
                    n6 = 205;
                    continue block33;
                }
                case 9: {
                    n6 = 210;
                    continue block33;
                }
                case 16: {
                    n6 = 85;
                    continue block33;
                }
                case 7: {
                    n6 = 185;
                    continue block33;
                }
                case 14: {
                    n6 = 170;
                    continue block33;
                }
                case 1: {
                    n6 = 7;
                    continue block33;
                }
                case 5: {
                    n6 = 223;
                    continue block33;
                }
                case 18: {
                    n6 = 7;
                    continue block33;
                }
                default: {
                    n6 = 80;
                    continue block33;
                }
                case 4: {
                    n6 = 2;
                    continue block33;
                }
                case 12: {
                    n6 = 203;
                    continue block33;
                }
                case 19: {
                    n6 = 106;
                    continue block33;
                }
                case 26: {
                    n6 = 112;
                    continue block33;
                }
                case 11: {
                    n6 = 152;
                    continue block33;
                }
                case 10: {
                    n6 = 173;
                    continue block33;
                }
                case 8: {
                    n6 = 41;
                    continue block33;
                }
                case 21: {
                    n6 = 89;
                    continue block33;
                }
                case 24: {
                    n6 = 27;
                    continue block33;
                }
                case 20: {
                    n6 = 243;
                    continue block33;
                }
                case 17: {
                    n6 = 244;
                    continue block33;
                }
                case 13: {
                    n6 = 191;
                    continue block33;
                }
                case 2: {
                    n6 = 27;
                    continue block33;
                }
                case 22: {
                    n6 = 102;
                    continue block33;
                }
                case 23: {
                    n6 = 193;
                    continue block33;
                }
                case 31: {
                    n6 = 179;
                    continue block33;
                }
                case 25: {
                    n6 = 224;
                    continue block33;
                }
                case 29: {
                    n6 = 228;
                    continue block33;
                }
                case 3: {
                    n6 = 212;
                    continue block33;
                }
                case 28: 
            }
            n6 = 214;
        }
    }
}

