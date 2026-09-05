/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIlIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - user32
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Library
 *  com.sun.jna.Native
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.sun.jna.Library;
import com.sun.jna.Native;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
interface IIIlIlIl
extends Library {
    public static final int I = 16;
    public static final int l = 4;
    public static final int II = 8;
    public static final IIIlIlIl Il;
    public static final String[] lI;
    public static final int ll = 2;
    public static final int[] III;
    public static final String[] IIl;
    public static final Object[] IlI;

    public void I(int var1, int var2, int var3, int var4, int var5);

    public static String l(char[] cArray, long l2, int n) {
        int n2 = 0x3155450B ^ n;
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
     * Unable to fully structure code
     */
    static {
        block30: {
            block27: {
                block32: {
                    block33: {
                        block29: {
                            block28: {
                                block31: {
                                    break block31;
lbl1:
                                    // 1 sources

                                    while (var15_10 >= var14_9.length) {
                                        break block27;
                                    }
                                    break block28;
lbl4:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl6:
                                    // 1 sources

                                    while (true) {
                                        IIIlIlIl.III = new int[var1_12];
                                        ** GOTO lbl73
lbl9:
                                        // 1 sources

                                        while (true) {
                                            IIIlIlIl.III[var4_15] = var5_16 ^= var2_13;
                                            ** GOTO lbl78
                                            break;
                                        }
                                        break;
                                    }
lbl12:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    v0 = var15_10++;
                                    var14_9[v0] = (char)(var14_9[v0] ^ var16_1);
                                    ** GOTO lbl1
lbl17:
                                    // 2 sources

                                    while (true) {
                                        var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                                        ** continue;
                                        break;
                                    }
lbl20:
                                    // 1 sources

                                    while (true) {
                                        var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                                        var15_10 = 0;
                                        break block28;
lbl24:
                                        // 1 sources

                                        while (true) {
                                            v1 = 31;
                                            break block29;
                                            break;
                                        }
                                        break;
                                    }
lbl27:
                                    // 1 sources

                                    while (true) {
                                        var11_6 += var12_7;
                                        ** GOTO lbl64
                                        break;
                                    }
lbl30:
                                    // 1 sources

                                    while (true) {
                                        var9_4 = new String[var8_3.length];
                                        ** GOTO lbl51
                                        break;
                                    }
lbl33:
                                    // 1 sources

                                    while (true) {
                                        IIIlIlIl.IlI = new Object[var9_4.length];
                                        ** GOTO lbl82
                                        break;
                                    }
                                }
                                var6 = 4336;
                                break block32;
lbl39:
                                // 1 sources

                                while (true) {
                                    v1 = 106;
                                    break block29;
                                    break;
                                }
                            }
                            switch (var15_10 % 6) {
                                case 1: {
                                    ** continue;
                                }
                                case 4: {
                                    ** continue;
                                }
lbl48:
                                // 1 sources

                                while (true) {
                                    var13_8 = 0;
                                    ** GOTO lbl12
                                    break;
                                }
lbl51:
                                // 1 sources

                                var13_8 = -1;
                                ** continue;
lbl53:
                                // 1 sources

                                while (true) {
                                    IIIlIlIl.lI = new String[1];
                                    IIIlIlIl.II();
                                    IIIlIlIl.Il = (IIIlIlIl)Native.load((String)"user32", IIIlIlIl.class);
                                    return;
                                }
                                case 5: {
                                    v1 = 69;
                                    break;
                                }
lbl61:
                                // 1 sources

                                while (true) {
                                    var4_15 = 0;
                                    ** GOTO lbl17
                                    break;
                                }
lbl64:
                                // 1 sources

                                if (++var10_5 >= var8_3.length) {
                                    ** continue;
                                }
                                ** GOTO lbl75
                                case 2: {
                                    v1 = 31;
                                    break;
                                }
                                case 3: {
                                    v1 = 78;
                                    break;
                                }
lbl73:
                                // 1 sources

                                var3_14 = 0;
                                ** continue;
lbl75:
                                // 2 sources

                                while (true) {
                                    var12_7 = var8_3[var10_5] ^ var6;
                                    ** continue;
                                    break;
                                }
lbl78:
                                // 1 sources

                                var3_14 += 4;
                                if (++var4_15 >= var1_12) ** break;
                                ** continue;
                                ** continue;
lbl82:
                                // 1 sources

                                var2_13 = -1964824978;
                                break block33;
lbl84:
                                // 1 sources

                                while (true) {
                                    var12_7 = 0;
                                    break block30;
                                    break;
                                }
                            }
                        }
lbl88:
                        // 2 sources

                        while (true) {
                            var16_1 = v1;
                            ** continue;
                            break;
                        }
                        var10_5 = 0;
                        var11_6 = 0;
                        ** while (true)
lbl94:
                        // 1 sources

                        while (true) {
                            IIIlIlIl.IIl = var9_4;
                            ** continue;
                            break;
                        }
                    }
                    var0_11 = "\u00bd\u00ff~\u00ce\u00d8\u0015\u00dcf\u00d4\u00aa\u0084<".getBytes("ISO-8859-1");
                    var1_12 = var0_11.length / 4;
                    ** while (true)
                    v1 = 64;
                    ** while (true)
                }
                var7_2 = "\ud38b\ub736\ud16a\u5e7f\ud5c6\ue5bb\u6341\u30b1";
                var8_3 = "\u10f8".toCharArray();
                ** while (true)
            }
            var9_4[var10_5] = new String(var14_9).intern();
            ** while (true)
        }
        ** while (var13_8 != 0)
lbl112:
        // 1 sources

        ** while (true)
    }

    public static void II() {
        IIIlIlIl.lI[0] = IIIlIlIl.l(IIIlIlIl.lI(-465196726, -1028822813).toCharArray(), 98772L, 1206977081);
    }

    public static int Il(int n, int n2) {
        return III[n ^ 0x59D8A9B7] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xE445A94A;
        char[] cArray = IIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIlIlIl.IlI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x507A0883;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 26 -> 166;
                case 17 -> 245;
                case 23 -> 25;
                case 28 -> 21;
                case 3 -> 161;
                case 1 -> 156;
                case 8 -> 45;
                case 31 -> 204;
                case 13 -> 124;
                case 25 -> 143;
                case 10 -> 156;
                case 14 -> 89;
                case 21 -> 36;
                case 5 -> 187;
                case 15 -> 80;
                case 4 -> 240;
                case 24 -> 169;
                case 20 -> 151;
                case 27 -> 13;
                case 18 -> 139;
                case 9 -> 255;
                case 16 -> 53;
                case 6 -> 65;
                case 7 -> 126;
                default -> 176;
                case 22 -> 79;
                case 30 -> 131;
                case 29 -> 92;
                case 11 -> 190;
                case 12 -> 13;
                case 2 -> 162;
                case 19 -> 245;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

