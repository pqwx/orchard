/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIllIl
 * Module         : 2D ESP  [RENDER]
 * Description    : Projects players as 2D boxes on the HUD.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Health Bar
 *   - .getBytes(
 *   - Mode
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
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.render;

import java.awt.Color;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.function.ToDoubleFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlI;
import orchard.internal.IIIlIllIl;
import orchard.internal.IllIlI;
import orchard.internal.lIIIlIII;
import orchard.internal.lIIllIl;
import orchard.internal.lIIllllI;
import orchard.internal.lIIlllll;
import orchard.internal.lIlll;
import orchard.internal.llIIIl;
import orchard.internal.llIIlI;
import orchard.internal.llIll;
import orchard.internal.lllllIII;

@Environment(value=EnvType.CLIENT)
public final class M2DESP
extends ModuleBase {
    private static final double I = 4.0;
    private static String[] l;
    private final IIIIIIIIl<llIIlI> II = this.IIlllIl(new IIIIIIIIl<llIIlI>(StringFactory.IIII("Mode"), llIIlI.class, llIIlI.I));
    private static final int Il = 255;
    private static final double lI = 1.0;
    private long ll;
    private final List<IIIlIllIl> III;
    private final lllllIII<UUID> IIl;
    private static final double IlI = 2.0;
    private static final int Ill = 190;
    private static final double lII = 1.0;
    private final llIll lIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Health Bar"), true));
    private static final int llI = -436207616;
    private static final int[] lll;
    private static final String[] IIII;
    private static final Object[] IIIl;

    private static void l() {
        M2DESP.l[0] = M2DESP.Illl(M2DESP.llIl(1155391823, 1154969388).toCharArray(), 49131L, -137687777);
        M2DESP.l[1] = M2DESP.Illl(M2DESP.llIl(1155391822, 312769613).toCharArray(), 44790L, 829854779);
        M2DESP.l[2] = M2DESP.Illl(M2DESP.llIl(1155391821, 1597443979).toCharArray(), 88433L, 1132230854);
        M2DESP.l[3] = M2DESP.Illl(M2DESP.llIl(1155391820, -667127491).toCharArray(), 52857L, -1465868465);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lI(DrawContext drawContext, IIIlIllIl iIIlIllIl) {
        double d = this.IlIl(iIIlIllIl.II());
        double d2 = this.IlIl(iIIlIllIl.lI());
        double d3 = Math.max(2.0, this.IlIl(iIIlIllIl.ll()));
        double d4 = Math.max(4.0, this.IlIl(iIIlIllIl.Il()));
        llIIlI llIIlI2 = (llIIlI)((Object)this.II.lIl());
        int n = this.IllI(190);
        int n2 = this.IllI(255);
        if (llIIlI2 == llIIlI.I) {
            this.IlII(drawContext, d - 1.0, d2 - 1.0, d3 + 2.0, d4 + 2.0, -436207616, 1.0);
            if (d3 > 2.0 && d4 > 2.0) {
                this.IlII(drawContext, d + 1.0, d2 + 1.0, d3 - 2.0, d4 - 2.0, -436207616, 1.0);
            }
            this.IlII(drawContext, d, d2, d3, d4, n, 1.0);
        }
        if (llIIlI2 == llIIlI.Il) {
            this.IIIl(drawContext, d, d2, d3, d4, n2);
        }
        if ((Boolean)this.lIl.lIl() == false) return;
        this.lIIl(drawContext, iIIlIllIl, d, d2, d3, d4);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color IIl(int n) {
        Color color = Color.WHITE;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null && clientEntrypoint.IlI() != null && clientEntrypoint.IlI().IlIlIl() != null) {
            color = clientEntrypoint.IlI().IlIlIl().lIlI();
        }
        int n2 = Math.max(0, Math.min(255, n));
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n2);
    }

    private double IlI(PlayerEntity playerEntity) {
        double d = Math.max(0.0f, playerEntity.getAbsorptionAmount());
        double d2 = (double)Math.max(0.0f, playerEntity.getHealth()) + d;
        double d3 = Math.max(1.0f, playerEntity.getMaxHealth() + playerEntity.getAbsorptionAmount());
        return Math.max(0.0, Math.min(1.0, d2 / d3));
    }

    @Override
    public void llll() {
        this.III.clear();
        this.IIl.IIl();
        this.ll = 0L;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 5927;
        var7_1 = "\u95d3\u997f\u8cc3\u58c5\u259a\u34a8\u8f39\ued6f\ufcb6\u95d0\uf443\u3acc\u2bbb\uf8bf\u9ce4\u21d8\uf533\u499f\uf539\u15ba\u223c\u7e00\u26da\ud477\u7a85\u22f0\ud4b8\u5424\u8768\u8dc1\ub354\u83df\u3143\u7be2\u0cf6\u3523\udea1\u157b\u3b12\ubd7d\u9944\u0cd1\uc0b6\u4efc\uf634\u4765\ub193\uccb2\u72b6\u6dc1\ua240\u6647\u8653\u6707\ucc78\u430d\u5881\uee14\u65b7\u13f8\u3c25\u8e49\ue70b\u6293\ue534\u6cef\ua9c4\u9a0f\u73e9\uc465\u316a\u7728\ud76f\u8ce9\u0e41\ufff6\u685e\u5070\u37b9\ub337\uacad\u500c\u4db2\u3cf1\u2027\u0219\u512f\u5a0f";
        var8_2 = "\u00108\b\b".toCharArray();
        var9_4 = new String[var8_2.length];
        var13_8 = -1;
        ** GOTO lbl11
lbl7:
        // 1 sources

        while (true) {
            continue;
            break;
        }
        while (true) {
            var13_8 = 0;
lbl11:
            // 2 sources

            var10_5 = 0;
            var11_6 = 0;
            var12_7 = '\u0000';
            if (var13_8 != 0) ** GOTO lbl38
            ** continue;
            break;
        }
lbl-1000:
        // 2 sources

        {
            switch (var15_10 % 5) {
                case 2: {
                    v0 = 71;
                    ** break;
                }
                case 3: {
                    v0 = 71;
                    ** break;
                }
                case 1: {
                    v0 = 26;
                    ** break;
                }
                default: {
                    v0 = 81;
                    ** break;
                }
                case 4: 
            }
            v0 = 35;
lbl31:
            // 5 sources

            var16_3 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_3 ^ var6);
            if (var15_10 < var14_9.length) continue;
            var9_4[var10_5] = new String(var14_9).intern();
            var11_6 += var12_7;
            if (++var10_5 >= var8_2.length) ** continue;
lbl38:
            // 2 sources

            var12_7 = var8_2[var10_5];
            var14_9 = var7_1.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
            ** while (true)
        }
        M2DESP.IIII = var9_4;
        M2DESP.IIIl = new Object[var9_4.length];
        var2_13 = 216042142;
        var0_11 = "Q\u00ce\u00c0\u0088\u0014~\u00d5\fo\u0099\u00b6\u00ae\u00fbG\u00d6\u0084\u0087\u000f\u0081\u00db\u0093\u00eb\u00f1\u00a7B\u00fb\u00cd*\u0017@\u0004\u0094n2\\\u0015\u000e6)\u001c\u00e3\u00c72\u00f9S-1N\u00bdm\u0084\u0084sr\u001b\u00f6\f\u0083\nw\u0018\u00eeS=\u0016\u00ff\u00cb\u00d5".getBytes("ISO-8859-1");
        var1_12 = var0_11.length / 4;
        M2DESP.lll = new int[var1_12];
        var3_14 = 0;
        var4_15 = 0;
        do {
            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
            M2DESP.lll[var4_15] = var5_16 ^= var2_13;
            var3_14 += 4;
        } while (++var4_15 < var1_12);
        M2DESP.l = new String[4];
        M2DESP.l();
    }

    private double lIl(double d, double d2) {
        return Math.max(2.0, Math.min(d2 * 0.22, Math.min(d * 0.28, 10.0)));
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIIlIllIl llI(MinecraftClient minecraftClient, PlayerEntity playerEntity, lIIlllll lIIlllll2, int n, int n2) {
        if (lIIlllll2 == null) {
            return null;
        }
        double d = lIIlllll2.Il() - lIIlllll2.II();
        double d2 = lIIlllll2.I() - lIIlllll2.l();
        if (!Double.isFinite(d)) return null;
        if (!Double.isFinite(d2)) return null;
        if (d < 0.0) return null;
        if (d2 < 0.0) {
            return null;
        }
        double d3 = Math.max(0.35, Math.min(2.0, Math.max(d, d2) * 0.006));
        double d4 = lIIlllll2.II() - d3;
        double d5 = lIIlllll2.l() - d3;
        double d6 = lIIlllll2.Il() + d3;
        double d7 = lIIlllll2.I() + d3;
        if (d6 < 0.0) return null;
        if (d4 > (double)n) return null;
        if (d7 < 0.0) return null;
        if (d5 > (double)n2) {
            return null;
        }
        d4 = Math.max(0.0, d4);
        d5 = Math.max(0.0, d5);
        d6 = Math.min((double)n, d6);
        d7 = Math.min((double)n2, d7);
        if (d6 <= d4) return null;
        if (!(d7 <= d5)) {
            double d8 = (d4 + d6) * 0.5;
            double d9 = (d5 + d7) * 0.5;
            double d10 = Math.min((double)n, Math.max(2.0, d6 - d4));
            double d11 = Math.min((double)n2, Math.max(4.0, d7 - d5));
            double d12 = Math.max(0.0, Math.min((double)n - d10, d8 - d10 * 0.5));
            double d13 = Math.max(0.0, Math.min((double)n2 - d11, d9 - d11 * 0.5));
            return new IIIlIllIl(d12, d13, d10, d11, playerEntity.squaredDistanceTo((Entity)minecraftClient.player), this.IlI(playerEntity), 1.0);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIIlIllIl lll(II iI, PlayerEntity playerEntity, float f) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) return null;
        if (minecraftClient.getWindow() == null) {
            return null;
        }
        int n = minecraftClient.getWindow().getScaledWidth();
        int n2 = minecraftClient.getWindow().getScaledHeight();
        if (n <= 0) return null;
        if (n2 <= 0) {
            return null;
        }
        Vec3d vec3d = IllIlI.IIlIlI((Entity)playerEntity, f);
        Box box = playerEntity.getBoundingBox().offset(vec3d.x - playerEntity.getX(), vec3d.y - playerEntity.getY(), vec3d.z - playerEntity.getZ());
        lIIlllll lIIlllll2 = this.lIII(iI, this.IIll(box));
        if (lIIlllll2 != null) return this.llI(minecraftClient, playerEntity, lIIlllll2, n, n2);
        lIIlllll2 = this.lIlI(iI, box);
        return this.llI(minecraftClient, playerEntity, lIIlllll2, n, n2);
    }

    private double IIII(double d, double d2) {
        return Math.max(2.0, Math.min(d * 0.28, Math.min(d2 * 0.22, 10.0)));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void Ill(II var1_1) {
        block5: {
            this.III.clear();
            if (!this.IIIlIIl() || !IllIlI.lIIll(var1_1)) {
                this.IIl.IIl();
                this.IIlI();
                return;
            }
            var2_2 = MinecraftClient.getInstance();
            if (var2_2.player != null && var2_2.world != null && var2_2.getWindow() != null) {
                var3_3 = lIIllllI.IlIIII(var2_2);
                var4_4 = new HashSet<UUID>();
                var5_5 = var2_2.world.getPlayers().iterator();
            } else {
                this.IIl.IIl();
                this.IIlI();
                return;
            }
            break block5;
lbl18:
            // 1 sources

            var7_7 = this.lll(var1_1, var6_6, var3_3);
            if (var7_7 != null) {
                var8_8 = var6_6.getUuid();
                var4_4.add(var8_8);
                var9_9 = this.IIl.I(var8_8, new lIIllIl(var7_7.II(), var7_7.lI(), var7_7.II() + var7_7.ll(), var7_7.lI() + var7_7.Il()), var7_7.IIl());
                this.III.add(var7_7.I(var9_9.I(), var9_9.l(), Math.max(2.0, var9_9.ll()), Math.max(4.0, var9_9.lI())));
            }
        }
        if (!var5_5.hasNext()) {
            this.IIl.III(var4_4);
            this.IIlI();
            this.III.sort(Comparator.comparingDouble((ToDoubleFunction<IIIlIllIl>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, IIl(), (Lorchard/internal/IIIlIllIl;)D)()).reversed());
            return;
        }
        var6_6 = (PlayerEntity)var5_5.next();
        if (IllIlI.IIIII(var2_2, var6_6)) ** GOTO lbl18
    }

    private void IIIl(DrawContext drawContext, double d5, double d6, double d7, double d8, int n) {
        double d9 = this.IIII(d7, d8);
        double d10 = this.lIl(d7, d8);
        this.lIll((d, d2, d3, d4) -> IIIlI.lIIlll(drawContext, d, d2, d + d3, d2 + d4, -436207616), d5, d6, d7, d8, d9, d10, 3.0, 1.0);
        this.lIll((d, d2, d3, d4) -> IIIlI.lIIlll(drawContext, d, d2, d + d3, d2 + d4, n), d5, d6, d7, d8, d9, d10, 1.0, 0.0);
    }

    private double IIlI() {
        long l2 = System.nanoTime();
        if (this.ll <= 0L) {
            this.ll = l2;
            return 0.016666666666666666;
        }
        double d = (double)(l2 - this.ll) / 1.0E9;
        this.ll = l2;
        return Math.max(0.004166666666666667, Math.min(0.06666666666666667, d));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private List<Vec3d> IIll(Box box) {
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>(14);
        double[] dArray = new double[]{box.minX, box.maxX};
        int n = dArray.length;
        int n2 = 0;
        boolean bl = true;
        block0: while (true) {
            if (!bl || (bl = false) || !true) {
                ++n2;
            }
            if (n2 >= n) {
                double d = (box.minX + box.maxX) * 0.5;
                double d2 = (box.minY + box.maxY) * 0.5;
                double d3 = (box.minZ + box.maxZ) * 0.5;
                arrayList.add(new Vec3d(d, box.minY, d3));
                arrayList.add(new Vec3d(d, box.maxY, d3));
                arrayList.add(new Vec3d(d, d2, box.minZ));
                arrayList.add(new Vec3d(d, d2, box.maxZ));
                arrayList.add(new Vec3d(box.minX, d2, d3));
                arrayList.add(new Vec3d(box.maxX, d2, d3));
                return arrayList;
            }
            double d = dArray[n2];
            double[] dArray2 = new double[]{box.minY, box.maxY};
            int n3 = dArray2.length;
            int n4 = 0;
            while (true) {
                if (n4 >= n3) continue block0;
                double d4 = dArray2[n4];
                for (double d5 : new double[]{box.minZ, box.maxZ}) {
                    arrayList.add(new Vec3d(d, d4, d5));
                }
                ++n4;
            }
            break;
        }
    }

    private void IlII(DrawContext drawContext, double d, double d2, double d3, double d4, int n, double d5) {
        IIIlI.lIIlll(drawContext, d, d2, d + d3, d2 + d5, n);
        IIIlI.lIIlll(drawContext, d, d2 + d4 - d5, d + d3, d2 + d4, n);
        IIIlI.lIIlll(drawContext, d, d2, d + d5, d2 + d4, n);
        IIIlI.lIIlll(drawContext, d + d3 - d5, d2, d + d3, d2 + d4, n);
    }

    private double IlIl(double d) {
        return Math.round(d);
    }

    private int IllI(int n) {
        Color color = this.IIl(n);
        return color.getAlpha() << 24 | color.getRed() << 16 | color.getGreen() << 8 | color.getBlue();
    }

    private static String Illl(char[] cArray, long l2, int n) {
        int n2 = 0x39EBA62A ^ n;
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private lIIlllll lIII(II iI, List<Vec3d> list) {
        lIIllIl lIIllIl2 = IllIlI.IlllI(iI, list);
        if (lIIllIl2 == null) return null;
        lIIlllll lIIlllll2 = new lIIlllll(lIIllIl2.I(), lIIllIl2.l(), lIIllIl2.III(), lIIllIl2.Il());
        return lIIlllll2;
    }

    private void lIIl(DrawContext drawContext, IIIlIllIl iIIlIllIl, double d, double d2, double d3, double d4) {
        double d5 = d - 1.0 - 3.0;
        if (d5 < 1.0) {
            d5 = d + d3 + 3.0;
        }
        double d6 = Math.max(0.0, Math.min(1.0, iIIlIllIl.III()));
        double d7 = Math.max(1.0, (double)Math.round(d4 * d6));
        int n = lIIIlIII.I(d6).getRGB();
        IIIlI.lIIlll(drawContext, d5 - 1.0, d2 - 1.0, d5 + 1.0 + 1.0, d2 + d4 + 1.0, -436207616);
        IIIlI.lIIlll(drawContext, d5, d2 + d4 - d7, d5 + 1.0, d2 + d4, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIlllll lIlI(II iI, Box box) {
        double d = (box.minX + box.maxX) * 0.5;
        double d2 = (box.minZ + box.maxZ) * 0.5;
        Vec3d vec3d = new Vec3d(d, box.minY, d2);
        Vec3d vec3d2 = new Vec3d(d, box.maxY, d2);
        Vec3d vec3d3 = new Vec3d(d, (box.minY + box.maxY) * 0.5, d2);
        lIlll lIlll2 = IllIlI.llIll(iI, vec3d);
        lIlll lIlll3 = IllIlI.llIll(iI, vec3d2);
        if (lIlll2 == null || lIlll3 == null) {
            lIlll lIlll4 = IllIlI.llIll(iI, vec3d3);
            if (lIlll4 != null) return new lIIlllll(lIlll4.l() - 1.0, lIlll4.I() - 2.0, lIlll4.l() + 1.0, lIlll4.I() + 2.0);
            return null;
        } else {
            double d3 = (lIlll2.l() + lIlll3.l()) * 0.5;
            double d4 = Math.min(lIlll2.I(), lIlll3.I());
            double d5 = Math.max(lIlll2.I(), lIlll3.I());
            double d6 = Math.max(4.0, d5 - d4);
            double d7 = Math.max(2.0, d6 * 0.36);
            return new lIIlllll(d3 - d7 * 0.5, d4, d3 + d7 * 0.5, d5);
        }
    }

    private void lIll(llIIIl llIIIl2, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8) {
        double d9 = d - d8;
        double d10 = d2 - d8;
        double d11 = d + d3 + d8;
        double d12 = d2 + d4 + d8;
        double d13 = d5 + d8;
        double d14 = d6 + d8;
        llIIIl2.add(d9, d10, d13, d7);
        llIIIl2.add(d9, d10, d7, d14);
        llIIIl2.add(d11 - d13, d10, d13, d7);
        llIIIl2.add(d11 - d7, d10, d7, d14);
        llIIIl2.add(d9, d12 - d7, d13, d7);
        llIIIl2.add(d9, d12 - d14, d7, d14);
        llIIIl2.add(d11 - d13, d12 - d7, d13, d7);
        llIIIl2.add(d11 - d7, d12 - d14, d7, d14);
    }

    public M2DESP() {
        super(StringFactory.IIII("2D ESP"), Category.l, StringFactory.IIII("Projects players as 2D boxes on the HUD."));
        this.IIl = new lllllIII();
        this.III = new ArrayList<IIIlIllIl>();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        if (!this.IIIlIIl()) return;
        if (!this.III.isEmpty()) {
            Iterator<IIIlIllIl> iterator = this.III.iterator();
            while (iterator.hasNext()) {
                IIIlIllIl iIIlIllIl = iterator.next();
                this.lI(drawContext, iIIlIllIl);
            }
            return;
        }
    }

    private static int llII(int n, int n2) {
        return lll[n ^ 0x90944BE3] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String llIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x44DDE14F;
        char[] cArray = IIII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            M2DESP.IIIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x210B7C73;
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
                case 9: {
                    n6 = 4;
                    continue block33;
                }
                case 5: {
                    n6 = 115;
                    continue block33;
                }
                case 17: {
                    n6 = 75;
                    continue block33;
                }
                case 27: {
                    n6 = 5;
                    continue block33;
                }
                case 21: {
                    n6 = 93;
                    continue block33;
                }
                case 23: {
                    n6 = 94;
                    continue block33;
                }
                case 24: {
                    n6 = 1;
                    continue block33;
                }
                case 14: {
                    n6 = 138;
                    continue block33;
                }
                case 15: {
                    n6 = 245;
                    continue block33;
                }
                case 4: {
                    n6 = 2;
                    continue block33;
                }
                case 25: {
                    n6 = 171;
                    continue block33;
                }
                case 31: {
                    n6 = 159;
                    continue block33;
                }
                case 19: {
                    n6 = 115;
                    continue block33;
                }
                case 12: {
                    n6 = 185;
                    continue block33;
                }
                case 13: {
                    n6 = 30;
                    continue block33;
                }
                case 26: {
                    n6 = 199;
                    continue block33;
                }
                case 30: {
                    n6 = 240;
                    continue block33;
                }
                default: {
                    n6 = 209;
                    continue block33;
                }
                case 1: {
                    n6 = 148;
                    continue block33;
                }
                case 7: {
                    n6 = 159;
                    continue block33;
                }
                case 3: {
                    n6 = 253;
                    continue block33;
                }
                case 18: {
                    n6 = 68;
                    continue block33;
                }
                case 29: {
                    n6 = 204;
                    continue block33;
                }
                case 20: {
                    n6 = 227;
                    continue block33;
                }
                case 28: {
                    n6 = 193;
                    continue block33;
                }
                case 2: {
                    n6 = 51;
                    continue block33;
                }
                case 16: {
                    n6 = 234;
                    continue block33;
                }
                case 22: {
                    n6 = 47;
                    continue block33;
                }
                case 10: {
                    n6 = 213;
                    continue block33;
                }
                case 11: {
                    n6 = 36;
                    continue block33;
                }
                case 8: {
                    n6 = 116;
                    continue block33;
                }
                case 6: 
            }
            n6 = 27;
        }
    }
}

