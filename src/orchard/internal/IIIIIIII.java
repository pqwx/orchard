/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Item
 *   - Box
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
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
final class IIIIIIII
extends Enum<IIIIIIII> {
    public static final /* enum */ IIIIIIII I;
    public static final /* enum */ IIIIIIII l;
    private static final /* synthetic */ IIIIIIII[] II;
    private static String[] Il;
    private final IIIlIIIII lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    private static /* synthetic */ IIIIIIII[] I() {
        return new IIIIIIII[]{I, l};
    }

    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0x302D4831 ^ n;
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

    private static void II() {
        IIIIIIII.Il[0] = IIIIIIII.l(IIIIIIII.ll(-902997356, 5404, 58947).toCharArray(), 81655L, 1625973393);
        IIIIIIII.Il[1] = IIIIIIII.l(IIIIIIII.ll(-673679480, 5405, 43065).toCharArray(), 20990L, -1658154734);
        IIIIIIII.Il[2] = IIIIIIII.l(IIIIIIII.ll(10976451, 5406, 59886).toCharArray(), 46542L, -256798285);
        IIIIIIII.Il[3] = IIIIIIII.l(IIIIIIII.ll(-1352916805, 5407, 43824).toCharArray(), 41187L, -540654726);
    }

    private IIIIIIII(String string2) {
        this.lI = StringFactory.lIl(string2);
    }

    public static IIIIIIII Il(String string) {
        return Enum.valueOf(IIIIIIII.class, string);
    }

    public static IIIIIIII[] values() {
        return (IIIIIIII[])II.clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block18: {
            block17: {
                block19: {
                    block15: {
                        block16: {
                            break block17;
lbl1:
                            // 1 sources

                            while (true) {
                                var3_4 += 4;
                                if (++var4_5 < var1_2) break block15;
                                break block16;
                                break;
                            }
lbl5:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                var13_13 = -1;
                                ** GOTO lbl61
                                break;
                            }
lbl12:
                            // 1 sources

                            while (true) {
                                var9_9 = new String[var8_8.length];
                                ** continue;
                                break;
                            }
                            var2_3 = 611374346;
                            break block18;
lbl17:
                            // 1 sources

                            while (true) {
                                IIIIIIII.ll[var4_5] = var5_6 ^= var2_3;
                                ** continue;
                                break;
                            }
lbl20:
                            // 1 sources

                            while (true) {
                                var4_5 = 0;
                                break block15;
                                break;
                            }
                        }
                        IIIIIIII.Il = new String[4];
                        IIIIIIII.II();
                        IIIIIIII.I = new IIIIIIII("Box");
                        IIIIIIII.l = new IIIIIIII("Item");
                        IIIIIIII.II = IIIIIIII.I();
                        return;
lbl30:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl32:
                        // 1 sources

                        while (true) {
                            IIIIIIII.IIl = new Object[var9_9.length];
                            ** continue;
                            break;
                        }
                    }
                    var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                    ** while (true)
lbl38:
                    // 2 sources

                    while (true) {
                        var12_12 = var8_8[var10_10] ^ var6;
                        ** continue;
                        break;
                    }
                    var12_12 = 0;
                    if (var13_13 != 0) ** GOTO lbl38
                    break block19;
lbl44:
                    // 1 sources

                    while (true) {
                        var11_11 = 0;
                        ** continue;
                        break;
                    }
lbl47:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl49:
                    // 1 sources

                    while (true) {
                        var8_8 = "\u2815\u2815\u2819\u2812".toCharArray();
                        ** continue;
                        break;
                    }
                }
                IIIIIIII.III = var9_9;
                ** while (true)
            }
            var6 = 10257;
            var7_7 = "\udb7a\ufd0f\ub4a9\u9fca\u601e\ucabe\u1d43\u8573\ub414\uff67\ue2c9\u32ae\uaa58\u1c65\u41a4\uadbb\u6a8a\u09d4\u02df";
            ** while (true)
lbl59:
            // 1 sources

            while (true) {
                var13_13 = 0;
lbl61:
                // 2 sources

                var10_10 = 0;
                ** continue;
                break;
            }
lbl63:
            // 1 sources

            while (true) {
                if (++var10_10 >= var8_8.length) ** break;
                ** continue;
                ** continue;
                break;
            }
        }
        var0_1 = "\\\u000e1\u00cc\u00e8\u00e3\u00acL\u00d8C;wV\u00d7%\u00e4\u00c9\u008c#\u00ecV\u00a6\u00d77".getBytes("ISO-8859-1");
        var1_2 = var0_1.length / 4;
        ** while (true)
        IIIIIIII.ll = new int[var1_2];
        var3_4 = 0;
        ** while (true)
        var9_9[var10_10] = var7_7.substring(var11_11, var11_11 + var12_12);
        var11_11 += var12_12;
        ** while (true)
    }

    public String toString() {
        return this.lI.IIII();
    }

    private static int lI(int n, int n2) {
        return ll[n ^ 0x72A4A4EE] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2, int n3) {
        StackTraceElement[] stackTraceElementArray;
        int n4 = n2 ^ 0x151C;
        char[] cArray = III[n4].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n4];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIIIII.IIl[n4] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n5 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2BB8;
        int n6 = 0;
        do {
            int n7 = n6++;
            int n8 = cArray[n7] - 31619;
            n8 -= 39271;
            n8 += 24505;
            n8 += 58309;
            n8 -= 63740;
            cArray[n7] = (char)((n8 -= 5945) ^ n5 ^ n3 ^ n >> 16);
        } while (n6 < cArray.length);
        return new String(cArray).intern();
    }
}

