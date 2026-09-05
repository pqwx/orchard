/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIlIlIl
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

@Environment(value=EnvType.CLIENT)
final class lIIlIlIl
extends Enum<lIIlIlIl> {
    private static final /* synthetic */ lIIlIlIl[] I;
    private static String[] l;
    public static final /* enum */ lIIlIlIl II;
    public static final /* enum */ lIIlIlIl Il;
    private static final int[] lI;
    private static final String[] ll;
    private static final Object[] III;

    private static void I() {
        lIIlIlIl.l[0] = lIIlIlIl.l(lIIlIlIl.ll(1801209503, 1850160512).toCharArray(), 89508L, -269001157);
        lIIlIlIl.l[1] = lIIlIlIl.l(lIIlIlIl.ll(1801209502, -1384699908).toCharArray(), 14028L, -1883280322);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0x50A4D85E ^ n;
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

    private static /* synthetic */ lIIlIlIl[] II() {
        return new lIIlIlIl[]{II, Il};
    }

    public static lIIlIlIl[] values() {
        return (lIIlIlIl[])I.clone();
    }

    public static lIIlIlIl Il(String string) {
        return Enum.valueOf(lIIlIlIl.class, string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block16: {
                    block15: {
                        block17: {
                            block14: {
                                break block18;
lbl1:
                                // 1 sources

                                while (++var10_4 >= var8_2.length) {
                                    break block14;
                                }
                                break block19;
lbl4:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl6:
                                // 1 sources

                                while (true) {
                                    var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                                    break block15;
                                    break;
                                }
lbl9:
                                // 2 sources

                                while (true) {
                                    continue;
lbl11:
                                    // 1 sources

                                    while (true) {
                                        var3_11 += 4;
                                        if (++var4_12 < var1_9) break block16;
                                        break block17;
                                        break;
                                    }
lbl15:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var13_7 = 0;
                            ** GOTO lbl9
lbl20:
                            // 1 sources

                            while (true) {
                                var3_11 = 0;
                                var4_12 = 0;
                                break block16;
                                break;
                            }
lbl24:
                            // 1 sources

                            while (true) {
                                lIIlIlIl.lI = new int[var1_9];
                                ** continue;
                                break;
                            }
lbl27:
                            // 1 sources

                            while (true) {
                                ** GOTO lbl1
                                break;
                            }
                        }
                        lIIlIlIl.l = new String[2];
                        lIIlIlIl.I();
                        lIIlIlIl.II = new lIIlIlIl();
                        lIIlIlIl.Il = new lIIlIlIl();
                        lIIlIlIl.I = lIIlIlIl.II();
                        return;
lbl36:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            lIIlIlIl.ll = var9_3;
                            ** continue;
                            break;
                        }
lbl41:
                        // 1 sources

                        while (var13_7 == 0) {
                            ** continue;
lbl43:
                            // 1 sources

                            ** GOTO lbl38
                        }
                        break block19;
                    }
                    var11_5 += var12_6;
                    ** while (true)
                    var0_8 = "8\u00aa3\u008e\u0010\u008b\u009bB1\u0015IaV\u00a1\u0085\u00bf".getBytes("ISO-8859-1");
                    var1_9 = var0_8.length / 4;
                    ** while (true)
lbl51:
                    // 1 sources

                    while (true) {
                        var8_2 = "\u67bc\u67bd".toCharArray();
                        ** continue;
                        break;
                    }
                }
                var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
                lIIlIlIl.lI[var4_12] = var5_13 ^= var2_10;
                ** while (true)
            }
            var6 = 26552;
            var7_1 = "\u6d37\u6b52\uf0f7\u0dd1\u6f51\ua80a\u2c66\u3e81\ua163";
            ** while (true)
lbl62:
            // 1 sources

            while (true) {
                var12_6 = 0;
                ** GOTO lbl41
                break;
            }
            lIIlIlIl.III = new Object[var9_3.length];
            var2_10 = 874937734;
            ** while (true)
            var10_4 = 0;
            var11_5 = 0;
            ** while (true)
        }
        var12_6 = var8_2[var10_4] ^ var6;
        ** while (true)
        var9_3 = new String[var8_2.length];
        var13_7 = -1;
        ** while (true)
    }

    private static int lI(int n, int n2) {
        return lI[n ^ 0xD4C46D0F] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String ll(int var0, int var1_1) {
        var3_2 = var0 ^ 1801209503;
        var4_4 = lIIlIlIl.ll[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])lIIlIlIl.III[var3_2];
        if (var2_3 == null) {
            var5_5 = new Throwable().getStackTrace();
            lIIlIlIl.III[var3_2] = var5_5;
        } else {
            var5_5 = var2_3;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 505465232;
        var8_8 = 0;
        if (true) ** GOTO lbl17
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) {
                return new String(var4_4).intern();
            }
lbl17:
            // 3 sources

            switch (var8_8 & 31) {
                case 19: {
                    var9_9 = 65;
                    continue block33;
                }
                case 11: {
                    var9_9 = 45;
                    continue block33;
                }
                case 5: {
                    var9_9 = 190;
                    continue block33;
                }
                case 26: {
                    var9_9 = 250;
                    continue block33;
                }
                case 22: {
                    var9_9 = 224;
                    continue block33;
                }
                case 27: {
                    var9_9 = 39;
                    continue block33;
                }
                case 21: {
                    var9_9 = 196;
                    continue block33;
                }
                case 25: {
                    var9_9 = 143;
                    continue block33;
                }
                case 16: {
                    var9_9 = 37;
                    continue block33;
                }
                case 30: {
                    var9_9 = 52;
                    continue block33;
                }
                case 6: {
                    var9_9 = 1;
                    continue block33;
                }
                case 3: {
                    var9_9 = 241;
                    continue block33;
                }
                case 7: {
                    var9_9 = 85;
                    continue block33;
                }
                case 17: {
                    var9_9 = 106;
                    continue block33;
                }
                case 28: {
                    var9_9 = 214;
                    continue block33;
                }
                case 4: {
                    var9_9 = 202;
                    continue block33;
                }
                case 1: {
                    var9_9 = 231;
                    continue block33;
                }
                case 2: {
                    var9_9 = 153;
                    continue block33;
                }
                case 12: {
                    var9_9 = 66;
                    continue block33;
                }
                case 20: {
                    var9_9 = 74;
                    continue block33;
                }
                case 18: {
                    var9_9 = 7;
                    continue block33;
                }
                case 14: {
                    var9_9 = 177;
                    continue block33;
                }
                case 23: {
                    var9_9 = 194;
                    continue block33;
                }
                case 8: {
                    var9_9 = 116;
                    continue block33;
                }
                case 13: {
                    var9_9 = 116;
                    continue block33;
                }
                case 15: {
                    var9_9 = 76;
                    continue block33;
                }
                case 10: {
                    var9_9 = 12;
                    continue block33;
                }
                default: {
                    var9_9 = 193;
                    continue block33;
                }
                case 31: {
                    var9_9 = 78;
                    continue block33;
                }
                case 24: {
                    var9_9 = 186;
                    continue block33;
                }
                case 29: {
                    var9_9 = 112;
                    continue block33;
                }
                case 9: 
            }
            var9_9 = 3;
        }
    }
}

