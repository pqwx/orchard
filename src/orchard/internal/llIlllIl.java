/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlllIl
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

import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.IIllIIIlI;
import orchard.internal.lIIlIlII;
import orchard.internal.lllIlIII;

@Environment(value=EnvType.CLIENT)
final class llIlllIl {
    private static String[] I;
    private static final int[] l;
    private static final String[] II;
    private static final Object[] Il;

    private llIlllIl() {
    }

    public static double I(double d) {
        double d2 = llIlllIl.IlII(d, 0.0, 1.0);
        double d3 = 1.0 - d2;
        return 1.0 - d3 * d3 * d3;
    }

    public static float l(float f, float f2, float f3) {
        return IIllIIIlI.II(f, f2, f3);
    }

    public static boolean II(double d, double d2, double d3, double d4, double d5, double d6) {
        return IIllIIIlI.llI(d, d2, d3, d4, d5, d6);
    }

    public static double Il(double d, double d2, double d3) {
        return IIllIIIlI.I(d, d2, d3);
    }

    public static int lI(int n, int n2, int n3) {
        return IIllIIIlI.IIIl(n, n2, n3);
    }

    public static int ll(int n, double d) {
        return IIllIIIlI.Ill(n, d);
    }

    public static double III(double d, double d2, double d3) {
        if (d3 <= d2) {
            return 0.0;
        }
        return llIlllIl.IlII((d - d2) / (d3 - d2), 0.0, 1.0);
    }

    public static double IIl(double d, double d2, double d3, double d4) {
        return IIllIIIlI.IIl(d, d2, d3, d4);
    }

    private static String IlI(char[] cArray, long l2, int n) {
        int n2 = 0xB1A6D0F1 ^ n;
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

    public static int Ill(int n, int n2, double d) {
        double d2 = llIlllIl.IlII(d, 0.0, 1.0);
        int n3 = n >>> 24 & 0xFF;
        int n4 = n >>> 16 & 0xFF;
        int n5 = n >>> 8 & 0xFF;
        int n6 = n & 0xFF;
        int n7 = n2 >>> 24 & 0xFF;
        int n8 = n2 >>> 16 & 0xFF;
        int n9 = n2 >>> 8 & 0xFF;
        int n10 = n2 & 0xFF;
        int n11 = llIlllIl.lI((int)Math.round(llIlllIl.Il(n3, n7, d2)), 0, 255);
        int n12 = llIlllIl.lI((int)Math.round(llIlllIl.Il(n4, n8, d2)), 0, 255);
        int n13 = llIlllIl.lI((int)Math.round(llIlllIl.Il(n5, n9, d2)), 0, 255);
        int n14 = llIlllIl.lI((int)Math.round(llIlllIl.Il(n6, n10, d2)), 0, 255);
        return n11 << 24 | n12 << 16 | n13 << 8 | n14;
    }

    public static int lII(int n, int n2, double d) {
        return IIllIIIlI.IlI(n, n2, d);
    }

    public static double lIl(double d, double d2, double d3) {
        return IIllIIIlI.III(d, d2, d3);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            var6 = 28452;
            var7_2 = "\u9db7\u340a\ucc86\ub775\u1813\uae1c\u9cad\uc274\u8366\u5bf4\ub1de\u50a1\udd36\u9c3e\ub9c2\ueee9";
            var8_3 = "\u6f20\u6f20\u6f20\u6f20".toCharArray();
            var9_4 = new String[var8_3.length];
            var13_8 = -1;
            if (true) ** GOTO lbl28
lbl7:
            // 1 sources

            while (true) {
                llIlllIl.l[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
                if (++var4_15 < var1_12) ** GOTO lbl21
                break block12;
                break;
            }
            while (true) {
                llIlllIl.II = var9_4;
                llIlllIl.Il = new Object[var9_4.length];
                var2_13 = 3712582;
                var0_11 = "\u00cap\u00d4\u00a4IJ\u0084\u00ccI\t\u0094\b\rN(`el;6\u001e\u00d9\u00a0L\u00dd\u000f\u00cf\u00d6IJ\u0018\u00f4l\u00e5\u00cd\u00d1\u00d9\u0092Q\u00c0\u00d2\u0091\u00afS\u0087\u00cfr~X\u00b1'\u00ccQ\u0002\u00e6\u0017\u00ed9\u00ee\u009e\u0099\u00fd\u00e9\u009f\u00f0^\u00abU{;\u0096\u0097F\u0005!-e\u00fcJAG\u00ac\u0007\u00c9\u00a3O\u00cbQ\u00b6\u000e\bX\u00ea\u0001tb\u00a7t\u00b9\u00899\"\u00cf8K9\u00c9\u00c6.\u00c8\u009a\u009c 1dw".getBytes("ISO-8859-1");
                var1_12 = var0_11.length / 4;
                llIlllIl.l = new int[var1_12];
                var3_14 = 0;
                var4_15 = 0;
lbl21:
                // 2 sources

                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                ** continue;
                break;
            }
            while (true) {
                block13: {
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_3.length) break block13;
                    var13_8 = 0;
lbl28:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = 0;
                    if (var13_8 == 0) ** continue;
                }
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                do {
                    switch (var15_10 % 5) {
                        default: {
                            v0 = 29;
                            break;
                        }
                        case 4: {
                            v0 = 98;
                            break;
                        }
                        case 2: {
                            v0 = 45;
                            break;
                        }
                        case 1: {
                            v0 = 60;
                            break;
                        }
                        case 3: {
                            v0 = 43;
                        }
                    }
                    var16_1 = v0;
                    v1 = var15_10++;
                    var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                } while (var15_10 < var14_9.length);
            }
        }
        llIlllIl.I = new String[4];
        llIlllIl.IIll();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String llI(double d, double d2, String string) {
        String string2;
        String string3;
        String string4;
        int n = llIlllIl.IIIl(d2);
        if (n <= 0) {
            v0 = Long.toString(Math.round(d));
        } else {
            string4 = "f";
            int n2 = n;
            String string5 = "%.";
            v0 = string3 = String.format(Locale.US, string5 + n2 + string4, d);
        }
        if (n > 0 && string3.indexOf(46) >= 0) {
            while (string3.endsWith("0")) {
                string3 = string3.substring(0, string3.length() - 1);
            }
            if (string3.endsWith(".")) {
                string3 = string3.substring(0, string3.length() - 1);
            }
        }
        if (string != null && !string.isBlank()) {
            string4 = string;
            String string6 = string3;
            string2 = string6 + string4;
            return string2;
        }
        string2 = string3;
        return string2;
    }

    public static lIIlIlII lll(double d, double d2, double d3, double d4, double d5, double d6) {
        return IIllIIIlI.IIll(d, d2, d3, d4, d5, d6);
    }

    public static double IIII(double d) {
        double d2 = llIlllIl.IlII(d, 0.0, 1.0);
        return 1.0 - (1.0 - d2) * (1.0 - d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int IIIl(double d) {
        double d2 = Math.abs(d);
        if (d2 <= 0.0) {
            return 0;
        }
        int n = 0;
        while (n < 6) {
            if (!(Math.abs(d2 - Math.rint(d2)) > 1.0E-6)) return n;
            d2 *= 10.0;
            ++n;
        }
        return n;
    }

    public static int IIlI(int n, int n2) {
        return IIllIIIlI.lll(n, n2);
    }

    private static void IIll() {
        llIlllIl.I[0] = llIlllIl.IlI(llIlllIl.lIII(190329805, '\u670f', (short)16211).toCharArray(), 67756L, 529506570);
        llIlllIl.I[1] = llIlllIl.IlI(llIlllIl.lIII(-777491274, '\u670e', (short)6246).toCharArray(), 22178L, 1416515650);
        llIlllIl.I[2] = llIlllIl.IlI(llIlllIl.lIII(1937339523, '\u670d', (short)3222).toCharArray(), 64655L, 1060619482);
        llIlllIl.I[3] = llIlllIl.IlI(llIlllIl.lIII(-706919937, '\u670c', (short)41498).toCharArray(), 33260L, 118722133);
    }

    public static double IlII(double d, double d2, double d3) {
        return IIllIIIlI.ll(d, d2, d3);
    }

    public static lIIlIlII IlIl(lIIlIlII lIIlIlII2, Iterable<lIIlIlII> iterable, double d, double d2) {
        return IIllIIIlI.l(lIIlIlII2, iterable, d, d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IllI(lllIlIII lllIlIII2, double d, double d2) {
        double d3;
        lIIlIlII lIIlIlII2;
        if (lllIlIII2 == null) {
            return false;
        }
        double d4 = lllIlIII2.IlII();
        if (Double.compare(d4, (lIIlIlII2 = llIlllIl.lll(d4, d3 = lllIlIII2.IlIl(), lllIlIII2.III(), lllIlIII2.IIll(), d, d2)).l()) != 0 || Double.compare(d3, lIIlIlII2.II()) != 0) {
            lllIlIII2.lllI(lIIlIlII2.l(), lIIlIlII2.II());
            return true;
        }
        return false;
    }

    private static int Illl(int n, int n2) {
        return l[n ^ 0x8F1435D5] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIII(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x670F;
        char[] cArray = II[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIlllIl.Il[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4884;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 53925;
            n6 -= 46644;
            n6 += 26680;
            n6 -= 5071;
            n6 -= 13679;
            n6 -= 19801;
            n6 ^= 0x82D;
            n6 ^= 0xF2BD;
            cArray[n5] = (char)((n6 ^= 0x6071) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

