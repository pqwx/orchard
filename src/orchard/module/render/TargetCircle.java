/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIllIl
 * Module         : TargetCircle  [RENDER]
 * Description    : Renders an animated circle moving up and down around your current target.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Line Width
 *   - Color Sync
 *   - .getBytes(
 *   - Radius
 *   - Alpha
 *   - Trail
 *   - Color
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
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package orchard.module.render;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIllllllI;
import orchard.internal.IlIlIlIII;
import orchard.internal.IllIlI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIllIlIl;
import orchard.internal.llIlIlII;
import orchard.internal.llIll;
import orchard.module.iface.Interface;

@Environment(value=EnvType.CLIENT)
public final class TargetCircle
extends ModuleBase {
    private final lIlIIlI I;
    private static final long l = 2500L;
    private static String[] II;
    private final lIlIIlI Il;
    private final llIlIlII lI;
    private final lIlIIlI ll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Radius"), 0.12, 0.0, 1.0, 0.01).IIIl("m"));
    private final llIll III;
    private final IlIlIlIII IIl;
    private final lIlIIlI IlI;
    private static final int Ill = 96;
    private final llIll lII;
    private static final int[] lIl;
    private static final String[] llI;
    private static final Object[] lll;

    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0xEDDA15AA ^ n;
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

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIl(MinecraftClient minecraftClient, Vec3d vec3d, Vec3d vec3d2) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.player == null) return false;
        if (vec3d == null) return false;
        if (vec3d2 == null) return false;
        BlockHitResult blockHitResult = minecraftClient.world.raycast(new RaycastContext(vec3d, vec3d2, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)minecraftClient.player));
        if (blockHitResult == null) return true;
        if (blockHitResult.getType() == HitResult.Type.MISS) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Ill(II iI) {
        if (!IllIlI.lIIll(iI)) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        LivingEntity livingEntity = this.lIl(minecraftClient);
        if (minecraftClient == null) return;
        if (livingEntity == null) {
            return;
        }
        float f = lIIllllI.IlIIII(minecraftClient);
        Vec3d vec3d = IllIlI.IIlIlI((Entity)livingEntity, f);
        Box box = livingEntity.getBoundingBox().offset(vec3d.x - livingEntity.getX(), vec3d.y - livingEntity.getY(), vec3d.z - livingEntity.getZ());
        double d = Math.max(0.35, box.getLengthY());
        double d2 = Math.max(0.3, (double)livingEntity.getWidth() * 0.65) + (Double)this.ll.lIl();
        double d3 = (double)System.nanoTime() / 1.0E9;
        double d4 = d3 * Math.PI * 2.0 * (Double)this.I.lIl();
        Color color = this.lII();
        double d5 = (Double)this.Il.lIl();
        Vec3d vec3d2 = IllIlI.IllIl(iI);
        boolean bl = this.IIl(minecraftClient, vec3d2, new Vec3d(box.getCenter().x, box.getCenter().y, box.getCenter().z));
        if (((Boolean)this.III.lIl()).booleanValue()) {
            for (int i = 4; i >= 1; --i) {
                double d6 = d4 - (double)i * 0.11;
                double d7 = (Math.sin(d6) + 1.0) * 0.5;
                double d8 = vec3d.y + 0.04 + d7 * Math.max(0.05, d - 0.08);
                double d9 = d5 * (0.3 - (double)i * 0.045);
                this.IIII(iI, box, vec3d2, new Vec3d(vec3d.x, d8, vec3d.z), d2, color, d9, Math.max(0.5f, ((Double)this.IlI.lIl()).floatValue() - (float)i * 0.2f), bl);
            }
        }
        double d10 = (Math.sin(d4) + 1.0) * 0.5;
        double d11 = vec3d.y + 0.04 + d10 * Math.max(0.05, d - 0.08);
        this.IIII(iI, box, vec3d2, new Vec3d(vec3d.x, d11, vec3d.z), d2, color, d5, ((Double)this.IlI.lIl()).floatValue(), bl);
    }

    private static void IlI() {
        TargetCircle.II[0] = TargetCircle.lI(TargetCircle.lIII(-1678616080, (short)22988, '\ud710').toCharArray(), 63180L, 1936698749);
        TargetCircle.II[1] = TargetCircle.lI(TargetCircle.lIII(1516114852, (short)31339, '\ud711').toCharArray(), 76026L, 439512522);
        TargetCircle.II[2] = TargetCircle.lI(TargetCircle.lIII(-2024905849, (short)44339, '\ud712').toCharArray(), 96715L, -1589728600);
        TargetCircle.II[3] = TargetCircle.lI(TargetCircle.lIII(120389645, (short)62138, '\ud713').toCharArray(), 66389L, 412688557);
        TargetCircle.II[4] = TargetCircle.lI(TargetCircle.lIII(-1983752153, (short)42419, '\ud714').toCharArray(), 67916L, -1058355751);
        TargetCircle.II[5] = TargetCircle.lI(TargetCircle.lIII(-51424636, (short)55724, '\ud715').toCharArray(), 24516L, 366782757);
        TargetCircle.II[6] = TargetCircle.lI(TargetCircle.lIII(493500463, (short)45065, '\ud716').toCharArray(), 6485L, 135609634);
        TargetCircle.II[7] = TargetCircle.lI(TargetCircle.lIII(-260030258, (short)41056, '\ud717').toCharArray(), 24442L, -1588778459);
        TargetCircle.II[8] = TargetCircle.lI(TargetCircle.lIII(-740157927, (short)45956, '\ud718').toCharArray(), 50222L, -701763417);
        TargetCircle.II[9] = TargetCircle.lI(TargetCircle.lIII(-1820912410, (short)32678, '\ud719').toCharArray(), 51878L, -1580434519);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color lII() {
        ClientEntrypoint clientEntrypoint;
        Interface interface_;
        Color color = (Color)this.lI.lIl();
        if (((Boolean)this.lII.lIl()).booleanValue() && (interface_ = (clientEntrypoint = ClientEntrypoint.lII()) != null && clientEntrypoint.IlI() != null ? clientEntrypoint.IlI().lIIIII() : null) != null) {
            color = interface_.lIlI();
        }
        int n = MathHelper.clamp((int)((int)Math.round((Double)this.Il.lIl())), (int)0, (int)255);
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 1237;
        var7_2 = "\ue594\u4bb0\uda62\u43dd\ucbd8\ua2e1\u31ab\ue324\u683a\u96c7\u4965\u51b5\u57ae\u0241\u885c\ufb63\u480b\u2951\u2418\ucc1b\u9cb7\ude58\u79b5\u1e4a\u5366\uf4ed\u04f5\u393b\ue390\u4923\ufbc7\u7311\ue87f\u2101\ud964\ub323\uee3f\uf352\u1e1e\uf303\uc670\uc927\uf221\u7373\u4996\u8ebf\u7cde\ua225\ud857\ue2c1\ufb03\u1d89\ueba2\uff1a\u861b\u8d2f\u9be6\u0630\ue80f\u62dc\ue97b\u747a\u8083\ua4d1\u909b\u855e\u6a04\u3b3b\u8434\u4fea\uafd0\uabe4\u6562\u93bd\ud5b9\u5ee1\u18bf\u9587\u3103\u9303\ue10a\u75e1\u7b38\u3692\u7d9a\ua8bf\ua4ea\u8bdc\u4447\ubed2\ud16b\ud4f3\u6c06\u8e73\ud252\ufa9a\ufc72\u0199\ub893\u8122\u29d8\u24ec\u3cf6\u2a1d\uf485\u53e4\ucc48\u050a\ub5a9\u3af3\ua47d\u331b\u8276\u64c6\u13c2\u202e\ub098\u7566\uf758\ud92d\ua276\ua7d7\u3d4e\u4986\u9664\uf238\u36fc\u7122\u02f2\u53ff\u4755\u0388\uf532\ub345\u9b3b\u5322\ub08f\u47e2\ub07e\u8103\u6130\ubb70\uf1c4\uae59\u7820\u7165\u5914\ub335\u4008\ud50f\u4622\ue87b\uf961\u1024\u9187\uc0ce\ubcff\u67c4\u821a\u1884\u3249\uf201\ub93c\u3112\u3c48\uc1b8\u4769\u4ba9\ua990\u64a1\uca20\u18c2\u9cfb\u97bc\ud3ac\u2edc\u1df1\udff2\u3a5f\ud58d\uac71\u9f41\u389f\ufaca\u1266\ud4cc\ud5bc\u278b\u2aca\ua72f\u6885\u8bff";
        var8_3 = "\b\b\u0010\u0010\b\b\u0004d\b\u0010".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl16
        block6: while (true) {
            block10: {
                var16_1 = v0;
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
                if (var15_10 < var14_9.length) break block10;
                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                if (++var10_5 < var8_3.length) ** GOTO lbl-1000
                var13_8 = 0;
lbl16:
                // 2 sources

                var10_5 = 0;
                var11_6 = 0;
                var12_7 = '\u0000';
                if (var13_8 != 0) lbl-1000:
                // 2 sources

                {
                    var12_7 = var8_3[var10_5];
                    var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                    var15_10 = 0;
                } else {
                    TargetCircle.llI = var9_4;
                    TargetCircle.lll = new Object[var9_4.length];
                    var2_13 = 222181076;
                    var0_11 = "\u00f6\u00b7\u00e3\u00b5F\u00fa\u0096\u00bc\u00c1|\u0082\u00e1\u00e6&\u00bb\u0097oM\u00ac\u00ac\u00ea\u00d8s\u00ceP\u00dd?\u00f4'No\u00ed\u0016\u001a\u00e4\u00f2O\u0087\u00bd\u0084d}@:\f\u00f1\u00ddj\u00a6\u00cb\u0007\u0010lR\u0097\u00e4\u00dd\u00ca\u00169)\u00aa|\u00cd\u00dc\u00dag\u008c\u000e\u00faZo\u00e0\u0097\u00f7>\u0013S\u0089\u00de\u00c2\u00d8\u00c2\u00c3\u00e8\u00e8\u001eF\u0087:{<nWVjm\u00dd\u00f1DFa9\u00e02\u00ce5\u0081\n\u0011]\u0092".getBytes("ISO-8859-1");
                    var1_12 = var0_11.length / 4;
                    TargetCircle.lIl = new int[var1_12];
                    var3_14 = 0;
                    var4_15 = 0;
                    do {
                        var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                        TargetCircle.lIl[var4_15] = var5_16 ^= var2_13;
                        var3_14 += 4;
                    } while (++var4_15 < var1_12);
                    break;
                }
            }
            switch (var15_10 % 5) {
                case 1: {
                    v0 = 34;
                    continue block6;
                }
                case 3: {
                    v0 = 47;
                    continue block6;
                }
                case 4: {
                    v0 = 66;
                    continue block6;
                }
                case 2: {
                    v0 = 25;
                    continue block6;
                }
            }
            v0 = 41;
        }
        TargetCircle.II = new String[10];
        TargetCircle.IlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private LivingEntity lIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (minecraftClient.world == null) return null;
        if (this.IIl == null) {
            return null;
        }
        LivingEntity livingEntity = this.IIl.lIl();
        if (!this.IlII(minecraftClient, livingEntity) && this.IIl.IIll(System.currentTimeMillis()) <= 2500L) {
            livingEntity = this.IIl.lIll();
        }
        if (!this.IlII(minecraftClient, livingEntity)) {
            return null;
        }
        LivingEntity livingEntity2 = livingEntity;
        return livingEntity2;
    }

    private void IIII(II iI, Box box, Vec3d vec3d, Vec3d vec3d2, double d, Color color, double d2, float f, boolean bl) {
        IllIlI.IIl(iI, vec3d2, d, 96, color, d2, f);
        if (!bl) {
            return;
        }
        IllIlI.lIlII(iI, vec3d2, d, 96, color, d2, f, false, n -> this.IIlI(vec3d, vec3d2, d, box, n));
    }

    private boolean IIlI(Vec3d vec3d, Vec3d vec3d2, double d, Box box, int n) {
        double d2 = Math.PI * 2 * (double)n / 96.0;
        double d3 = Math.PI * 2 * (double)(n + 1) / 96.0;
        Vec3d vec3d3 = new Vec3d(vec3d2.x + (Math.cos(d2) + Math.cos(d3)) * d * 0.5, vec3d2.y, vec3d2.z + (Math.sin(d2) + Math.sin(d3)) * d * 0.5);
        return lIllIlIl.III(vec3d.x, vec3d.y, vec3d.z, vec3d3.x, vec3d3.y, vec3d3.z, box.minX, box.minY, box.minZ, box.maxX, box.maxY, box.maxZ);
    }

    public TargetCircle(IlIlIlIII ilIlIlIII) {
        super(StringFactory.IIII("TargetCircle"), Category.l, StringFactory.IIII("Renders an animated circle moving up and down around your current target."));
        this.I = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Speed"), 1.0, 0.1, 3.0, 0.05));
        this.IlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Line Width"), 5.0, 0.5, 5.0, 0.1));
        this.Il = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Alpha"), 235.0, 20.0, 255.0, 1.0));
        this.III = this.IIlllIl(new llIll((Object)StringFactory.IIII("Trail"), true));
        this.lII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Color Sync"), true));
        this.lI = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Color"), new Color(92, 210, 255, 235)));
        this.IIl = ilIlIlIII;
        this.lI.lIII(() -> (Boolean)this.lII.lIl() == false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (livingEntity == null) return false;
        if (livingEntity == minecraftClient.player) return false;
        if (!livingEntity.isAlive()) return false;
        if (livingEntity.isRemoved()) return false;
        if (livingEntity.isSpectator()) return false;
        if (IIllllllI.II(livingEntity)) return false;
        if (minecraftClient.world.getEntityById(livingEntity.getId()) != livingEntity) return false;
        return true;
    }

    private static int Illl(int n, int n2) {
        return lIl[n ^ 0x9615B304] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIII(int n, short s, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xD710;
        char[] cArray = llI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            TargetCircle.lll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2052;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 21547;
            n6 -= 7457;
            n6 ^= 0xA1E5;
            n6 += 5646;
            cArray[n5] = (char)((n6 ^= 0x5415) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

