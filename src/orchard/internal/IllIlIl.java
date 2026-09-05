/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIlIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.IIlIlII;
import orchard.internal.llIllII;

@Environment(value=EnvType.CLIENT)
public final class IllIlIl {
    private static final int[] I;

    /*
     * Enabled aggressive block sorting
     */
    public static float I(float f, float f2, float f3) {
        float f4;
        float f5 = (float)IllIlIl.ll(f3, 0.0, 1.0);
        float f6 = Math.max(f, f2) - Math.min(f, f2);
        float f7 = f6 * f5;
        if (!(f > f2)) {
            f4 = -f7;
            return f2 + f4;
        }
        f4 = f7;
        return f2 + f4;
    }

    public static double l(double d, double d2, double d3) {
        return IllIlIl.lII(d, d2, IllIlIl.ll(d3, 0.0, 1.0));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int II(int n, int n2, double d) {
        double d2 = IllIlIl.ll(d, 0.0, 1.0);
        int n3 = IllIlIl.llI(n, n2, 24, d2);
        int n4 = IllIlIl.llI(n, n2, 16, d2);
        int n5 = IllIlIl.llI(n, n2, 8, d2);
        int n6 = IllIlIl.llI(n, n2, 0, d2);
        return n3 << 24 | n4 << 16 | n5 << 8 | n6;
    }

    public static int Il(int n, double d) {
        int n2 = n >>> 24 & 0xFF;
        return IllIlIl.IlI(n, (int)((double)n2 * IllIlIl.ll(d, 0.0, 1.0)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double lI(double d, double d2, double d3, double d4) {
        double d5 = IllIlIl.IIIl(d, 0.0);
        double d6 = IllIlIl.Ill(d3, 1.0);
        double d7 = IllIlIl.Ill(d4, 0.0);
        double d8 = Math.max(0.0, d6 - d7);
        double d9 = IllIlIl.IIIl(d2, d8);
        return d5 * Math.max(d9, d8);
    }

    public static double ll(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    /*
     * Unable to fully structure code
     */
    public static llIllII III(llIllII var0, Iterable<llIllII> var1_1, double var2_2, double var4_3) {
        block21: {
            block18: {
                block24: {
                    block22: {
                        block14: {
                            block12: {
                                block23: {
                                    block17: {
                                        block19: {
                                            block16: {
                                                block13: {
                                                    block15: {
                                                        block20: {
                                                            if (var0 == null) break block19;
                                                            break block20;
lbl3:
                                                            // 1 sources

                                                            while (true) {
                                                                var6_4 = var12_8.I();
                                                                break block12;
                                                                break;
                                                            }
lbl6:
                                                            // 1 sources

                                                            while (true) {
                                                                v0 = true;
                                                                break block13;
                                                                break;
                                                            }
lbl9:
                                                            // 1 sources

                                                            while (true) {
                                                                var13_9 = var12_8.I() + var12_8.II();
                                                                break block14;
                                                                break;
                                                            }
lbl12:
                                                            // 1 sources

                                                            while (true) {
                                                                break block15;
lbl14:
                                                                // 1 sources

                                                                while (true) {
                                                                    break block16;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                        }
                                                        if (var1_1 == null) break block19;
                                                        break block21;
                                                    }
                                                    var6_4 = var0.I();
                                                    break block22;
                                                }
lbl23:
                                                // 2 sources

                                                while (true) {
                                                    var10_6 = v0;
                                                    break block17;
                                                    break;
                                                }
lbl26:
                                                // 1 sources

                                                while (true) {
                                                    var6_4 = var13_9 - var0.II();
                                                    break block12;
                                                    break;
                                                }
                                            }
                                            var12_8 = var11_7.next();
                                            if (var12_8 == null) break block18;
                                            break block23;
                                        }
lbl34:
                                        // 2 sources

                                        return var0;
lbl36:
                                        // 1 sources

                                        while (true) {
                                            v0 = false;
                                            ** continue;
                                            break;
                                        }
lbl39:
                                        // 1 sources

                                        while (true) {
                                            if (!(Math.abs(var12_8.I() - var6_4) < var4_3)) break block12;
                                            ** continue;
lbl42:
                                            // 1 sources

                                            while (true) {
                                                var8_5 = var12_8.Il();
                                                break block18;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    var11_7 = var1_1.iterator();
                                    break block18;
                                }
                                if (!var12_8.equals(var0)) break block24;
                                break block18;
                            }
lbl52:
                            // 2 sources

                            while (Math.abs(var12_8.Il() - var8_5) < var4_3) {
                                ** continue;
lbl54:
                                // 1 sources

                                ** GOTO lbl42
                            }
                            break block18;
                        }
                        var15_10 = var6_4 + var0.II();
                        if (!(Math.abs(var13_9 - var15_10) < var4_3)) ** GOTO lbl52
                        ** while (true)
                    }
                    var8_5 = var0.Il();
                    ** while (!(var6_4 + var0.II() * 0.5 >= var2_2 * 0.5))
lbl63:
                    // 1 sources

                    ** while (true)
                }
                ** while (!var10_6)
lbl66:
                // 1 sources

                ** while (true)
            }
            ** while (var11_7.hasNext())
lbl69:
            // 1 sources

            return new llIllII(var6_4, var8_5, var0.II(), var0.l());
        }
        ** while (!(var4_3 <= 0.0))
lbl72:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static llIllII IIl(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = Math.max(0.0, d3);
        double d8 = Math.max(0.0, d4);
        double d9 = Math.max(0.0, d5 - d7);
        double d10 = Math.max(0.0, d6 - d8);
        return new llIllII(IllIlIl.ll(d, 0.0, d9), IllIlIl.ll(d2, 0.0, d10), d7, d8);
    }

    public static int IlI(int n, int n2) {
        return IllIlIl.IIll(n2, 0, 255) << 24 | n & 0xFFFFFF;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static double Ill(double d, double d2) {
        double d3;
        if (Double.isFinite(d)) {
            d3 = d;
            return d3;
        }
        d3 = d2;
        return d3;
    }

    public static double lII(double d, double d2, double d3) {
        return d + (d2 - d) * d3;
    }

    public static double lIl(double d, double d2, double d3, double d4) {
        double d5 = IllIlIl.ll(d4 * d3, 0.0, 1.0);
        return (1.0 - d5) * d + d5 * d2;
    }

    private static int llI(int n, int n2, int n3, double d) {
        int n4 = n >>> n3 & 0xFF;
        int n5 = n2 >>> n3 & 0xFF;
        return IllIlIl.IIll((int)IllIlIl.lII(n4, n5, d), 0, 255);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static IIlIlII lll(double d, double d2, double d3, double d4, double d5, double d6) {
        if (!Double.isFinite(d)) return IIlIlII.Il;
        if (!Double.isFinite(d2)) return IIlIlII.Il;
        if (!Double.isFinite(d3)) return IIlIlII.Il;
        if (!Double.isFinite(d4)) return IIlIlII.Il;
        if (!Double.isFinite(d5)) return IIlIlII.Il;
        if (Double.isFinite(d6)) {
        } else {
            return IIlIlII.Il;
        }
        double d7 = d3 < 0.0 ? d + d3 : d;
        double d8 = !(d4 < 0.0) ? d2 : d2 + d4;
        double d9 = Math.abs(d3);
        double d10 = Math.abs(d4);
        if (d9 <= 0.0) return IIlIlII.Il;
        if (!(d10 <= 0.0)) {
            double d11 = Math.min(d9, d10) * 0.5;
            return new IIlIlII(d7, d8, d9, d10, IllIlIl.ll(d5, 0.0, d11), IllIlIl.ll(d6, 0.0, d11));
        }
        return IIlIlII.Il;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIII(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = Math.min(d3, d3 + d5);
        double d8 = Math.max(d3, d3 + d5);
        double d9 = Math.min(d4, d4 + d6);
        double d10 = Math.max(d4, d4 + d6);
        if (!(d > d7)) return false;
        if (!(d < d8)) return false;
        if (!(d2 > d9)) return false;
        if (d2 < d10) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double IIIl(double d, double d2) {
        double d3;
        if (!Double.isFinite(d) || !(d > 0.0)) {
            d3 = d2;
            return d3;
        }
        d3 = d;
        return d3;
    }

    private IllIlIl() {
    }

    public static double IIlI(double d, double d2, double d3) {
        return d + (d2 - d) * IllIlIl.ll(d3, 0.0, 1.0);
    }

    public static int IIll(int n, int n2, int n3) {
        return Math.max(n2, Math.min(n3, n));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double IlII(double d, double d2, double d3, double d4) {
        double d5 = IllIlIl.IIIl(d, 0.0);
        double d6 = IllIlIl.Ill(d3, 1.0);
        double d7 = IllIlIl.Ill(d4, 0.0);
        double d8 = Math.max(0.0, d6 - d7);
        double d9 = Math.max(IllIlIl.IIIl(d2, d8), d8);
        return d5 * (d6 + (d9 - d8) * 0.5);
    }

    private static int IlIl(int n, int n2) {
        return I[n ^ 0xFA6487A8] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1927159756;
        byte[] byArray = "N#i<\u008d\u00fc\u00f7P8F\u00cd\u00a1\u00dc\u00c1\u00c9_\r(\u00ff{\u00aa\u00fa\u0096q\u00b1j\u00938\u00edH\u0007\u00c8@\u0091@s\u0094\u008d;%8\u00f1\u00ab#\u000f\"\u00cf\u0018P\u00bb\u00c7\u00f9\u0011R\u0087s".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        I = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IllIlIl.I[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

