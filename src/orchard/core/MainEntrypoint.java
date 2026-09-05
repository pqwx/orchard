/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIIll
 * Identified from direct evidence; see README.md
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - orchard
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ModInitializer
 */
package orchard.core;

import net.fabricmc.api.ModInitializer;

public final class MainEntrypoint
implements ModInitializer {
    private static String[] I;
    public static final String l;
    private static final int[] II;
    private static final String[] Il;
    private static final Object[] lI;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block13: {
            var6 = 2660;
            var7_2 = "\u7d3d\uc991\uf22f\ud199\u4813\ud129\u9050\u9bad\ue799\u9e58\ub62c\uaed7";
            var8_3 = "\u0a68".toCharArray();
            var9_4 = new String[var8_3.length];
            var13_8 = -1;
            break block13;
lbl7:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl9:
            // 2 sources

            while (true) {
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl48
                break;
            }
            var2_11 = -697910217;
            var0_12 = "\u00b7\u00da\u0017\u009c\u00c6\u00fc\u00e5CO\u0014HM".getBytes("ISO-8859-1");
            var1_13 = var0_12.length / 4;
            MainEntrypoint.II = new int[var1_13];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
                MainEntrypoint.II[var4_15] = var5_16 ^= var2_11;
                var3_14 += 4;
            } while (++var4_15 < var1_13);
            MainEntrypoint.I = new String[1];
            MainEntrypoint.l();
            MainEntrypoint.l = "orchard";
            return;
        }
lbl30:
        // 2 sources

        while (true) {
            var10_5 = 0;
            var11_6 = 0;
            var12_7 = 0;
            if (var13_8 != 0) ** GOTO lbl9
            MainEntrypoint.Il = var9_4;
            MainEntrypoint.lI = new Object[var9_4.length];
            ** continue;
            break;
        }
        block11: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
            if (var15_10 >= var14_9.length) {
                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                if (++var10_5 >= var8_3.length) ** break;
                ** continue;
                break;
            }
lbl48:
            // 3 sources

            switch (var15_10 % 6) {
                case 4: {
                    v0 = 123;
                    continue block11;
                }
                case 2: {
                    v0 = 54;
                    continue block11;
                }
                default: {
                    v0 = 96;
                    continue block11;
                }
                case 3: {
                    v0 = 31;
                    continue block11;
                }
                case 1: {
                    v0 = 4;
                    continue block11;
                }
                case 5: 
            }
            v0 = 108;
        }
        var13_8 = 0;
        ** while (true)
    }

    public void onInitialize() {
    }

    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0xC482D6BC ^ n;
        for (int i = 0; i < cArray.length; ++i) {
            n2 = n2 ^ (int)l2 ^ ~i;
            n2 ^= n - i * cArray.length;
            n2 = -n2 * n | i;
            cArray[i] = (char)(cArray[i] ^ n2);
            int n3 = i & 0xFF;
            n = n << n3 | n >>> -n3;
            l2 ^= (long)n3;
        }
        return new String(cArray);
    }

    private static void l() {
        MainEntrypoint.I[0] = MainEntrypoint.I(MainEntrypoint.Il(989180226, 2054247554).toCharArray(), 97889L, 813802509);
    }

    private static int II(int n, int n2) {
        return II[n ^ 0xE997C673] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Il(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x3AF5B142;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            MainEntrypoint.lI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x564D4FB6;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 19 -> 165;
                case 30 -> 129;
                case 9 -> 73;
                case 16 -> 17;
                case 31 -> 181;
                case 12 -> 148;
                case 10 -> 150;
                case 6 -> 232;
                case 21 -> 107;
                case 29 -> 12;
                case 1 -> 158;
                case 4 -> 86;
                case 8 -> 7;
                case 11 -> 31;
                case 5 -> 118;
                case 25 -> 57;
                case 14 -> 195;
                case 20 -> 65;
                case 17 -> 85;
                case 15 -> 133;
                case 3 -> 243;
                case 28 -> 205;
                case 13 -> 191;
                default -> 65;
                case 24 -> 162;
                case 2 -> 179;
                case 7 -> 126;
                case 26 -> 198;
                case 27 -> 103;
                case 18 -> 22;
                case 23 -> 92;
                case 22 -> 228;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

