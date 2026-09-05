/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllIlIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Player
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 */
package orchard.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import orchard.internal.IlIIlII;

public final class lIllIlIl {
    public static final double I = 0.01;
    private static final double l = 3.0;
    public static final boolean II = true;
    private static String[] Il;
    private static final double lI = 620.0;
    private static final double ll = 32.0;
    private static final double III = 64.0;
    public static final double IIl = 0.01;
    private static final double IlI = 382.0;
    private static final int[] Ill;
    private static final String[] lII;
    private static final Object[] lIl;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean I(long l2, long l3, long l4) {
        if (l4 <= 0L) return true;
        if (l2 < l3) return false;
        return true;
    }

    public static double l(int n, int n2) {
        if (n <= 0) {
            return 100.0;
        }
        int n3 = Math.max(0, Math.min(n, n2));
        return (double)(n - n3) * 100.0 / (double)n;
    }

    public static String II(long l2, long l3) {
        return Long.toString(l2 + Math.max(1L, l3));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean Il(Object object, Object object2) {
        if (Objects.deepEquals(object, object2)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean lI(double d, double d2) {
        if (!(d < lIllIlIl.lIII(d2))) return false;
        return true;
    }

    private static void ll() {
        lIllIlIl.Il[0] = lIllIlIl.IIl(lIllIlIl.IIlll(-300176980, -1459680906).toCharArray(), 60005L, -539510286);
        lIllIlIl.Il[1] = lIllIlIl.IIl(lIllIlIl.IIlll(-300176979, -681302078).toCharArray(), 38851L, -1865809839);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean III(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
        double[] dArray = new double[]{0.0, 1.0};
        if (!lIllIlIl.IIIII(d, d4 - d, Math.min(d7, d10), Math.max(d7, d10), dArray)) return false;
        if (!lIllIlIl.IIIII(d2, d5 - d2, Math.min(d8, d11), Math.max(d8, d11), dArray)) return false;
        if (!lIllIlIl.IIIII(d3, d6 - d3, Math.min(d9, d12), Math.max(d9, d12), dArray)) return false;
        if (!(dArray[0] < 0.999999)) return false;
        if (dArray[1] >= 0.0) return true;
        return false;
    }

    private static String IIl(char[] cArray, long l2, int n) {
        int n2 = 0x7A4CF803 ^ n;
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
    public static IlIIlII IlI(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        float f;
        float f2 = (bl ? 1.0f : 0.0f) - (bl2 ? 1.0f : 0.0f);
        float f3 = bl3 ? 1.0f : 0.0f;
        if (!bl4) {
            f = 0.0f;
            return new IlIIlII(f2, f3 - f);
        }
        f = 1.0f;
        return new IlIIlII(f2, f3 - f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean Ill(boolean bl, int n, boolean bl2) {
        if (bl2) return false;
        if (bl) return true;
        if (n <= 0) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean lII(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8;
        double d9;
        double d10 = Math.max(0.0, d3);
        double d11 = Math.max(Math.min(d4, d6), Math.min(d, Math.max(d4, d6)));
        double d12 = d11 - d;
        if (!(d12 * d12 + (d9 = (d8 = Math.max(Math.min(d5, d7), Math.min(d2, Math.max(d5, d7)))) - d2) * d9 <= d10 * d10)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float lIl(float f, float f2, float f3) {
        if (f2 < 0.0f) {
            f += 180.0f;
        }
        float f4 = 1.0f;
        if (f2 < 0.0f) {
            f4 = -0.5f;
        } else if (f2 > 0.0f) {
            f4 = 0.5f;
        }
        if (f3 > 0.0f) {
            f -= 90.0f * f4;
        }
        if (!(f3 < 0.0f)) return f;
        return f += 90.0f * f4;
    }

    public static int llI(int n, int n2) {
        return n + 1 + Math.max(0, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double lll(double d, double d2, double d3) {
        double d4 = Double.isFinite(d) ? d : 0.0;
        double d5 = Double.isFinite(d2) ? d2 : 0.0;
        double d6 = Double.isFinite(d3) ? Math.max(0.0, d3) : 0.0;
        return Math.max(d4 - d6, Math.min(d4 + d6, d5));
    }

    public static long IIII(long l2, long l3, long l4) {
        return Math.max(l2, l3 + Math.max(0L, l4));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double IIIl(boolean bl, boolean bl2) {
        if (!bl || bl2) {
            if (!bl2) return 0.73;
            if (bl) return 0.73;
            return 0.58;
        }
        return 0.86;
    }

    public static double IIlI(double d) {
        return lIllIlIl.IIIlI(d, 0.85);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IIll(boolean bl, String string) {
        if (!bl) return false;
        if (string == null) return false;
        if (string.isBlank()) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IlII(double d, double d2) {
        if (!(d >= lIllIlIl.lIII(d2))) return false;
        return true;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 18525;
        var7_2 = "\uaac1\u12be\u67b2\u0852\u8121\ue043\uaa4b\ua6ae\u5d13\u6cc4\u3aa4\u7082";
        var8_3 = "\u4855\u4859".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
lbl6:
        // 2 sources

        while (true) {
            var10_5 = 0;
            var11_6 = 0;
            var12_7 = 0;
            if (var13_8 != 0) ** GOTO lbl28
            lIllIlIl.lII = var9_4;
            lIllIlIl.lIl = new Object[var9_4.length];
            var2_13 = -195294689;
            var0_11 = "\u00b5A(\u0081\u00cc\u0093X\u00fb1`u\u00e3\u00c3\n$\u00a2".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            lIllIlIl.Ill = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                lIllIlIl.Ill[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            lIllIlIl.Il = new String[2];
            lIllIlIl.ll();
            return;
        }
        {
            block10: {
                if (++var10_5 >= var8_3.length) break block10;
lbl28:
                // 2 sources

                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl40
            }
            var13_8 = 0;
            ** continue;
            block9: while (true) {
                var16_1 = v0;
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                if (var15_10 >= var14_9.length) ** GOTO lbl53
lbl40:
                // 2 sources

                switch (var15_10 % 5) {
                    case 3: {
                        v0 = 116;
                        continue block9;
                    }
                    case 2: {
                        v0 = 84;
                        continue block9;
                    }
                    case 4: {
                        v0 = 38;
                        continue block9;
                    }
                    case 1: {
                        v0 = 113;
                        continue block9;
                    }
lbl53:
                    // 1 sources

                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    continue block8;
                }
                v0 = 43;
            }
        }
    }

    public static boolean IlIl(long l2, long l3) {
        return l2 < l3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IllI(double d, double d2, double d3, double d4, double d5) {
        double d6 = d4 - d;
        double d7 = d5 - d2;
        double d8 = Math.max(0.0, d3);
        if (!(d6 * d6 + d7 * d7 <= d8 * d8)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double Illl(double d, double d2) {
        if (!Double.isFinite(d)) return 0.0;
        if (!Double.isFinite(d2)) return 0.0;
        if (Math.abs(d) <= 1.0E-9) return 0.0;
        if (Math.signum(d) == Math.signum(d2)) return Math.copySign(Math.min(Math.abs(d2), Math.abs(d)), d);
        return 0.0;
    }

    private static double lIII(double d) {
        return Math.max(0.0, Math.min(100.0, d));
    }

    public static double lIIl(double d, int n, int n2) {
        double d2 = Double.isFinite(d) ? Math.max(1.0, d) : 1.0;
        double d3 = (double)Math.max(1, n) / 652.0;
        double d4 = (double)Math.max(1, n2) / 446.0;
        double d5 = Math.max(1.0, Math.min(d3, d4));
        return Math.min(d2, Math.min(3.0, d5));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean lIlI(double d, double d2) {
        if (!Double.isFinite(d)) return false;
        if (!(d >= 0.0)) return false;
        if (!(d <= lIllIlIl.lllI(d2))) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    public static IlIIlII lIll(boolean var0, boolean var1_1, boolean var2_2, boolean var3_3, float var4_4, float var5_5) {
        block27: {
            block23: {
                block30: {
                    block29: {
                        block20: {
                            block25: {
                                block19: {
                                    block22: {
                                        block24: {
                                            block14: {
                                                block18: {
                                                    block21: {
                                                        block15: {
                                                            block16: {
                                                                block28: {
                                                                    block17: {
                                                                        block26: {
                                                                            if (!var0) break block26;
                                                                            break block27;
lbl3:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                v0 = 1.0f;
                                                                                break block14;
                                                                                break;
                                                                            }
lbl6:
                                                                            // 1 sources

                                                                            return new IlIIlII(0.0f, 0.0f);
lbl8:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var14_14 = lIllIlIl.lIl(var4_4, var12_12, var13_13);
                                                                                var15_15 = Math.abs(lIllIlIl.IIIIl(var8_8 - var14_14));
                                                                                if (!(var15_15 < var11_11)) break block15;
                                                                                break block16;
                                                                                break;
                                                                            }
lbl13:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var8_8 = lIllIlIl.lIl(var5_5, var6_6, var7_7);
                                                                                var9_9 = 0.0f;
                                                                                var10_10 = 0.0f;
                                                                                var11_11 = 3.4028235E38f;
                                                                                var12_12 = -1;
                                                                                break block17;
                                                                                break;
                                                                            }
                                                                        }
                                                                        v1 = 0.0f;
                                                                        break block28;
                                                                    }
lbl24:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        if (var12_12 > 1) break block18;
                                                                        break block19;
                                                                        break;
                                                                    }
                                                                }
lbl28:
                                                                // 2 sources

                                                                while (true) {
                                                                    if (!var1_1) break block20;
                                                                    break block21;
                                                                    break;
                                                                }
                                                            }
                                                            var11_11 = var15_15;
                                                            var9_9 = var12_12;
                                                            var10_10 = var13_13;
                                                        }
lbl36:
                                                        // 2 sources

                                                        while (true) {
                                                            ++var13_13;
                                                            break block22;
                                                            break;
                                                        }
                                                    }
                                                    v2 = 1.0f;
                                                    break block29;
                                                }
                                                return new IlIIlII(var9_9, var10_10);
lbl44:
                                                // 1 sources

                                                while (true) {
                                                    if (var12_12 != 0) ** GOTO lbl8
                                                    break block23;
                                                    break;
                                                }
lbl47:
                                                // 1 sources

                                                while (true) {
                                                    v3 = 1.0f;
                                                    break block24;
                                                    break;
                                                }
                                                while (true) {
                                                    ++var12_12;
                                                    ** continue;
                                                    break;
                                                }
                                            }
lbl54:
                                            // 2 sources

                                            while (true) {
                                                var7_7 = v3 - v0;
                                                if (var6_6 != 0.0f) ** GOTO lbl13
                                                break block25;
                                                break;
                                            }
                                        }
lbl59:
                                        // 2 sources

                                        while (var3_3) {
                                            ** continue;
lbl61:
                                            // 1 sources

                                            ** GOTO lbl3
                                        }
                                        break block30;
                                    }
lbl64:
                                    // 2 sources

                                    while (true) {
                                        if (var13_13 > 1) ** continue;
                                        ** continue;
                                        break;
                                    }
                                }
                                var13_13 = -1;
                                ** while (true)
lbl70:
                                // 1 sources

                                while (true) {
                                    v3 = 0.0f;
                                    ** GOTO lbl59
                                    break;
                                }
                            }
                            if (var7_7 == 0.0f) ** break;
                            ** while (true)
                            ** while (true)
                        }
                        v2 = 0.0f;
                    }
                    var6_6 = v1 - v2;
                    ** while (!var2_2)
lbl82:
                    // 1 sources

                    ** while (true)
                }
                v0 = 0.0f;
                ** while (true)
            }
            if (var13_13 == 0) ** break;
            ** while (true)
            ** while (true)
        }
        v1 = 1.0f;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double llII(double d) {
        double d2 = Double.isFinite(d) ? Math.max(0.0, d) : 0.0;
        double d3 = Math.min(1.0, d2 / 30.0);
        double d4 = d3 * d3 * (3.0 - 2.0 * d3);
        return 0.14 + d4 * 0.86;
    }

    public static String llIl(String string, int n) {
        String string2 = string == null || string.isBlank() ? "Player" : string.trim();
        int n2 = Math.max(1, n);
        String string3 = string2;
        return string3 + n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double lllI(double d) {
        if (!Double.isFinite(d)) return 3.0;
        double d2 = Math.max(0.0, d);
        double d3 = d2;
        return 3.0 + d3 / 2.0;
    }

    private lIllIlIl() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double llll(double d) {
        double d2 = Double.isFinite(d) ? Math.max(0.0, d) : 0.0;
        double d3 = Math.max(0.0, Math.min(1.0, (d2 - 0.5) / 11.5));
        return d3 * d3 * (3.0 - 2.0 * d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIIII(double d, double d2, double d3, double d4, double[] dArray) {
        if (Math.abs(d2) < 1.0E-9) {
            if (!(d >= d3)) return false;
            if (d <= d4) return true;
            return false;
        }
        double d5 = (d3 - d) / d2;
        double d6 = (d4 - d) / d2;
        if (d5 > d6) {
            double d7 = d5;
            d5 = d6;
            d6 = d7;
        }
        dArray[0] = Math.max(dArray[0], d5);
        dArray[1] = Math.min(dArray[1], d6);
        if (dArray[0] <= dArray[1]) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float IIIIl(float f) {
        float f2 = f % 360.0f;
        if (f2 >= 180.0f) {
            f2 -= 360.0f;
        }
        if (!(f2 < -180.0f)) {
            return f2;
        }
        f2 += 360.0f;
        return f2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double IIIlI(double d, double d2) {
        double d3 = Double.isFinite(d) ? Math.max(0.0, Math.min(d, 0.1)) : 0.0;
        double d4 = Double.isFinite(d2) ? Math.max(0.0, Math.min(d2, 1.0)) : 0.85;
        double d5 = 12.0 - d4 * 9.5;
        return 1.0 - Math.exp(-d3 * d5);
    }

    /*
     * Unable to fully structure code
     */
    public static List<String> IIIll(String var0, String var1_1) {
        block11: {
            block6: {
                block14: {
                    block10: {
                        block8: {
                            block9: {
                                block13: {
                                    block12: {
                                        block7: {
                                            if (var0 == null) break block11;
                                            break block12;
lbl3:
                                            // 1 sources

                                            while (true) {
                                                var8_8 = var5_5[var7_7];
                                                if (var8_8 != null) break block6;
                                                break block7;
                                                break;
                                            }
lbl7:
                                            // 1 sources

                                            while (var1_1 != null) {
                                                break block8;
                                            }
                                            break block13;
                                        }
lbl11:
                                        // 3 sources

                                        while (true) {
                                            ++var7_7;
                                            break block9;
                                            break;
                                        }
                                    }
                                    if (!var0.isBlank()) ** GOTO lbl7
                                    break block11;
                                }
lbl18:
                                // 2 sources

                                while (true) {
                                    v0 = ";";
                                    break block10;
                                    break;
                                }
lbl21:
                                // 1 sources

                                while (true) {
                                    v0 = var1_1;
                                    break block10;
                                    break;
                                }
                            }
lbl25:
                            // 2 sources

                            while (var7_7 < var6_6) {
                                ** continue;
lbl27:
                                // 1 sources

                                ** GOTO lbl3
                            }
                            break block14;
                        }
                        ** while (!var1_1.isBlank())
lbl31:
                        // 1 sources

                        ** while (true)
                    }
                    var2_2 = v0;
                    var3_3 = var0.split(var2_2);
                    var4_4 = new ArrayList<String>();
                    var5_5 = var3_3;
                    var6_6 = var5_5.length;
                    var7_7 = 0;
                    ** GOTO lbl25
                }
                return List.copyOf(var4_4);
            }
            var9_9 = var8_8.trim();
            if (var9_9.isEmpty()) ** GOTO lbl11
            var4_4.add(var9_9);
            ** while (true)
        }
        return List.of();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIlII(boolean bl, boolean bl2, double d, double d2) {
        if (!bl) return false;
        if (bl2) return false;
        if (d >= 0.0) return true;
        if (!(d2 <= 0.0)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IIlIl(boolean bl, boolean bl2) {
        if (!bl) return false;
        if (!bl2) return false;
        return true;
    }

    private static int IIllI(int n, int n2) {
        return Ill[n ^ 0x8D1776B9] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IIlll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xEE1BA9AC;
        char[] cArray = lII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIl[n3];
        if (stackTraceElementArray2 == null) {
            lIllIlIl.lIl[n3] = stackTraceElementArray = new Throwable().getStackTrace();
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5D232A8B;
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
                case 19: {
                    n6 = 13;
                    continue block33;
                }
                case 13: {
                    n6 = 223;
                    continue block33;
                }
                case 7: {
                    n6 = 133;
                    continue block33;
                }
                case 31: {
                    n6 = 114;
                    continue block33;
                }
                case 21: {
                    n6 = 113;
                    continue block33;
                }
                case 18: {
                    n6 = 80;
                    continue block33;
                }
                case 24: {
                    n6 = 74;
                    continue block33;
                }
                case 8: {
                    n6 = 85;
                    continue block33;
                }
                case 14: {
                    n6 = 101;
                    continue block33;
                }
                case 3: {
                    n6 = 153;
                    continue block33;
                }
                default: {
                    n6 = 211;
                    continue block33;
                }
                case 4: {
                    n6 = 95;
                    continue block33;
                }
                case 25: {
                    n6 = 173;
                    continue block33;
                }
                case 6: {
                    n6 = 43;
                    continue block33;
                }
                case 29: {
                    n6 = 53;
                    continue block33;
                }
                case 26: {
                    n6 = 33;
                    continue block33;
                }
                case 2: {
                    n6 = 31;
                    continue block33;
                }
                case 30: {
                    n6 = 25;
                    continue block33;
                }
                case 15: {
                    n6 = 74;
                    continue block33;
                }
                case 22: {
                    n6 = 141;
                    continue block33;
                }
                case 11: {
                    n6 = 160;
                    continue block33;
                }
                case 28: {
                    n6 = 162;
                    continue block33;
                }
                case 9: {
                    n6 = 190;
                    continue block33;
                }
                case 10: {
                    n6 = 204;
                    continue block33;
                }
                case 16: {
                    n6 = 180;
                    continue block33;
                }
                case 1: {
                    n6 = 0;
                    continue block33;
                }
                case 20: {
                    n6 = 234;
                    continue block33;
                }
                case 5: {
                    n6 = 195;
                    continue block33;
                }
                case 17: {
                    n6 = 145;
                    continue block33;
                }
                case 12: {
                    n6 = 41;
                    continue block33;
                }
                case 27: {
                    n6 = 222;
                    continue block33;
                }
                case 23: 
            }
            n6 = 162;
        }
    }
}

