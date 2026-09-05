/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Player
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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.lIIIllll;

@Environment(value=EnvType.CLIENT)
public final class IlIIllI {
    public static final double I = 0.01;
    private static final double l = 32.0;
    public static final boolean II = true;
    private static final double Il = 382.0;
    public static final double lI = 0.1;
    private static final double ll = 64.0;
    private static final double III = 620.0;
    public static final double IIl = 0.01;
    private static final double IlI = 3.0;
    private static final String[] Ill;
    private static final Object[] lII;

    /*
     * Enabled aggressive block sorting
     */
    public static lIIIllll I(boolean bl, boolean bl2, boolean bl3, boolean bl4, float f, float f2) {
        float f3;
        float f4 = (bl ? 1.0f : 0.0f) - (bl2 ? 1.0f : 0.0f);
        float f5 = (float)Math.sqrt(f4 * f4 + (f3 = (bl3 ? 1.0f : 0.0f) - (bl4 ? 1.0f : 0.0f)) * f3);
        if (f5 <= 1.0E-4f) {
            return new lIIIllll(0.0f, 0.0f);
        }
        if (f5 > 1.0f) {
            f4 /= f5;
            f3 /= f5;
        }
        float f6 = IlIIllI.lII(f - f2);
        float f7 = (float)Math.toRadians(f6);
        float f8 = (float)Math.sin(f7);
        float f9 = (float)Math.cos(f7);
        float f10 = f3 * f9 + f4 * f8;
        float f11 = f4 * f9 - f3 * f8;
        float f12 = (float)Math.sqrt(f11 * f11 + f10 * f10);
        if (!(f12 > 1.0f)) return new lIIIllll(f11, f10);
        return new lIIIllll(f11 /= f12, f10 /= f12);
    }

    public static double l(double d) {
        return IlIIllI.Il(d, 0.85);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean II(long l2, long l3) {
        if (l2 >= l3) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double Il(double d, double d2) {
        double d3 = Double.isFinite(d) ? Math.max(0.0, Math.min(d, 0.1)) : 0.0;
        double d4 = !Double.isFinite(d2) ? 0.85 : Math.max(0.0, Math.min(d2, 1.0));
        double d5 = 12.0 - d4 * 9.5;
        return 1.0 - Math.exp(-d3 * d5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String lI(String string, int n) {
        String string2 = string != null && !string.isBlank() ? string.trim() : "Player";
        int n2 = Math.max(1, n);
        String string3 = string2;
        return string3 + n2;
    }

    private static double ll(double d) {
        return Math.max(0.0, Math.min(100.0, d));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean III(boolean bl, int n, boolean bl2) {
        if (bl2) return false;
        if (bl) return true;
        if (n <= 0) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IIl(boolean bl, boolean bl2) {
        if (!bl) return false;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double IlI(boolean bl, boolean bl2) {
        if (bl && !bl2) {
            return 0.86;
        }
        if (!bl2) return 0.73;
        if (bl) return 0.73;
        return 0.58;
    }

    public static double Ill(int n, int n2) {
        if (n > 0) {
            int n3 = Math.max(0, Math.min(n, n2));
            return (double)(n - n3) * 100.0 / (double)n;
        }
        return 100.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float lII(float f) {
        float f2 = f % 360.0f;
        if (f2 >= 180.0f) {
            f2 -= 360.0f;
        }
        if (f2 < -180.0f) {
            f2 += 360.0f;
        }
        return f2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean lIl(double d, double d2) {
        if (!(d >= IlIIllI.ll(d2))) return false;
        return true;
    }

    public static int llI(int n, int n2) {
        return n + 1 + Math.max(0, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lll(double d, float f, double d2) {
        if (!Double.isFinite(d)) return false;
        if (!(d < 0.0)) return false;
        if (!Float.isFinite(f)) return false;
        if (!(f > 0.9f)) return false;
        if (!((double)f >= d2)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IIII(boolean bl, String string) {
        if (!bl) return false;
        if (string == null) return false;
        if (string.isBlank()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double IIIl(double d) {
        double d2 = Double.isFinite(d) ? Math.max(0.0, d) : 0.0;
        double d3 = Math.max(0.0, Math.min(1.0, (d2 - 0.5) / 11.5));
        return d3 * d3 * (3.0 - 2.0 * d3);
    }

    public static boolean IIlI(double d) {
        return d >= 0.1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double IIll(double d) {
        double d2 = Double.isFinite(d) ? Math.max(0.0, d) : 0.0;
        double d3 = Math.min(1.0, d2 / 30.0);
        double d4 = d3 * d3 * (3.0 - 2.0 * d3);
        return 0.14 + d4 * 0.86;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IlII(boolean bl, boolean bl2, double d, double d2) {
        if (!bl) return false;
        if (bl2) return false;
        if (d >= 0.0) return true;
        if (d2 <= 0.0) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double IlIl(double d, double d2, double d3) {
        double d4 = Double.isFinite(d) ? d : 0.0;
        double d5 = !Double.isFinite(d2) ? 0.0 : d2;
        double d6 = !Double.isFinite(d3) ? 0.0 : Math.max(0.0, d3);
        return Math.max(d4 - d6, Math.min(d4 + d6, d5));
    }

    public static boolean IllI(double d, double d2) {
        return d < IlIIllI.ll(d2);
    }

    private IlIIllI() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double Illl(double d, int n, int n2) {
        double d2 = Double.isFinite(d) ? Math.max(1.0, d) : 1.0;
        double d3 = (double)Math.max(1, n) / 652.0;
        double d4 = (double)Math.max(1, n2) / 446.0;
        double d5 = Math.max(1.0, Math.min(d3, d4));
        return Math.min(d2, Math.min(3.0, d5));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lIII(double d, double d2, double d3, double d4, double[] dArray) {
        if (!(Math.abs(d2) < 1.0E-9)) {
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
        if (!(d >= d3)) return false;
        if (!(d <= d4)) return false;
        return true;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static List<String> lIIl(String string, String string2) {
        if (string == null || string.isBlank()) {
            return List.of();
        }
        String string3 = string2 != null && !string2.isBlank() ? string2 : ";";
        String[] stringArray = string.split(string3);
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        int n2 = 0;
        boolean bl = true;
        while (true) {
            String string4;
            if (!bl || (bl = false) || !true) {
                ++n2;
            }
            if (n2 >= n) {
                return List.copyOf(arrayList);
            }
            String string5 = stringArray2[n2];
            if (string5 == null || (string4 = string5.trim()).isEmpty()) continue;
            arrayList.add(string4);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean lIlI(double d, float f, boolean bl, boolean bl2) {
        if (!IlIIllI.lll(d, f, 0.0)) return false;
        if (bl) return false;
        if (bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean lIll(long l2, long l3, long l4) {
        if (l4 <= 0L) return true;
        if (l2 < l3) return false;
        return true;
    }

    public static long llII(long l2, long l3, long l4) {
        return Math.max(l2, l3 + Math.max(0L, l4));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean llIl(double d, double d2, double d3, double d4, double d5) {
        double d6 = Math.max(0.0, d3);
        double d7 = d4 - d;
        double d8 = d5 - d2;
        if (!(d7 * d7 + d8 * d8 <= d6 * d6)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean lllI(Object object, Object object2) {
        if (Objects.deepEquals(object, object2)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean llll(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12) {
        double[] dArray = new double[]{0.0, 1.0};
        if (!IlIIllI.lIII(d, d4 - d, Math.min(d7, d10), Math.max(d7, d10), dArray)) return false;
        if (!IlIIllI.lIII(d2, d5 - d2, Math.min(d8, d11), Math.max(d8, d11), dArray)) return false;
        if (!IlIIllI.lIII(d3, d6 - d3, Math.min(d9, d12), Math.max(d9, d12), dArray)) {
            return false;
        }
        if (!(dArray[0] < 0.999999)) return false;
        if (dArray[1] >= 0.0) return true;
        return false;
    }

    public static String IIIII(long l2, long l3) {
        return Long.toString(l2 + Math.max(1L, l3));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIIIl(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        double d8 = Math.max(0.0, d3);
        double d9 = Math.max(Math.min(d4, d6), Math.min(d, Math.max(d4, d6)));
        double d10 = Math.max(Math.min(d5, d7), Math.min(d2, Math.max(d5, d7)));
        double d11 = d9 - d;
        double d12 = d10 - d2;
        if (!(d11 * d11 + d12 * d12 <= d8 * d8)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block13: {
            block12: {
                block9: {
                    block11: {
                        block8: {
                            block10: {
                                break block10;
lbl1:
                                // 1 sources

                                while (++var4_4 >= var2_2.length) {
                                    break block8;
                                }
                                break block11;
lbl4:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl6:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (true) {
                                    var6_6 = 0;
                                    break block9;
                                    break;
                                }
                                var3_3 = new String[var2_2.length];
                                var7_7 = -1;
                                break block12;
lbl14:
                                // 1 sources

                                while (true) {
                                    ** GOTO lbl1
                                    break;
                                }
                            }
                            var0 = 23573;
                            var1_1 = "\u85f9\u8600\u8606\u875c\u8606\u8758\u85f6\u85ec\uaea0\uaea0\uafce\uafce";
                            var2_2 = "\u5c1d\u5c11".toCharArray();
                            ** while (true)
                        }
                        var7_7 = 0;
                        break block12;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_5 = 0;
                            ** continue;
                            break;
                        }
                        var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                        var5_5 += var6_6;
                        ** while (true)
                    }
lbl31:
                    // 2 sources

                    while (true) {
                        var6_6 = var2_2[var4_4] ^ var0;
                        ** continue;
                        break;
                    }
                }
                ** while (var7_7 != 0)
lbl36:
                // 1 sources

                break block13;
lbl37:
                // 1 sources

                while (true) {
                    IlIIllI.lII = new Object[var3_3.length];
                    return;
                }
            }
            var4_4 = 0;
            ** while (true)
        }
        IlIIllI.Ill = var3_3;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIIlI(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xFA37;
        char[] cArray = Ill[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lII[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIllI.lII[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x776F;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 13984;
            n6 -= 49157;
            n6 ^= 0x6C70;
            n6 -= 67;
            n6 ^= 0x5BA;
            cArray[n5] = (char)((n6 += 44359) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

