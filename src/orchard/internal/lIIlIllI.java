/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIlIllI
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
public final class lIIlIllI
extends Enum<lIIlIllI> {
    private static final /* synthetic */ lIIlIllI[] I;
    private static String[] l;
    public static final /* enum */ lIIlIllI II;
    public static final /* enum */ lIIlIllI Il;
    private static final int[] lI;
    private static final String[] ll;
    private static final Object[] III;

    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0x18101CB2 ^ n;
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

    public static lIIlIllI[] values() {
        return (lIIlIllI[])I.clone();
    }

    private static /* synthetic */ lIIlIllI[] l() {
        return new lIIlIllI[]{II, Il};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block25: {
            block27: {
                block26: {
                    block24: {
                        var6 = 2230;
                        ** GOTO lbl60
lbl3:
                        // 1 sources

                        while (true) {
                            var3_4 += 4;
                            if (++var4_5 < var1_2) break block24;
                            break block25;
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
                            continue;
                            break;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            lIIlIllI.ll = var9_9;
                            ** GOTO lbl77
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            ** GOTO lbl80
                            break;
                        }
lbl18:
                        // 1 sources

                        while (true) {
                            lIIlIllI.lI[var4_5] = var5_6 ^= var2_3;
                            ** continue;
                            break;
                        }
                        var1_2 = var0_1.length / 4;
                        lIIlIllI.lI = new int[var1_2];
                        ** while (true)
lbl24:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        v0 = var15_15++;
                        var14_14[v0] = (char)(var14_14[v0] ^ var16_16 ^ var6);
                        ** GOTO lbl58
lbl29:
                        // 1 sources

                        while (true) {
                            var9_9[var10_10] = new String(var14_14).intern();
                            if (true) ** GOTO lbl75
                            break;
                        }
                    }
lbl33:
                    // 2 sources

                    while (true) {
                        var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                        ** continue;
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        v1 = 94;
                        break block26;
                        break;
                    }
                    block17: while (true) {
                        var12_12 = var8_8[var10_10];
                        var14_14 = var7_7.substring(var11_11, var11_11 + var12_12).toCharArray();
                        var15_15 = 0;
                        block18: while (true) {
                            switch (var15_15 % 5) {
                                case 2: {
                                    ** continue;
                                }
lbl47:
                                // 1 sources

                                while (true) {
                                    var13_13 = 0;
                                    ** GOTO lbl66
                                    break;
                                }
                                case 3: {
                                    v1 = 27;
                                    break block17;
                                }
                                case 1: {
                                    v1 = 54;
                                    break block17;
                                }
lbl56:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl58:
                                // 1 sources

                                if (var15_15 < var14_14.length) continue block18;
                                ** continue;
lbl60:
                                // 1 sources

                                var7_7 = "\u882f\ua660\u6e70\u5713\u2c7b\ufd00\u8807\ud2d1\u7ec0\u2ff4\u9205";
                                var8_8 = "\u0007\u0004".toCharArray();
                                ** continue;
                                var12_12 = '\u0000';
                                if (var13_13 != 0) continue block17;
                                ** continue;
lbl66:
                                // 2 sources

                                while (true) {
                                    var10_10 = 0;
                                    break block27;
                                    break;
                                }
lbl69:
                                // 1 sources

                                while (true) {
                                    var0_1 = "\u00fb\u00d4e\u00ce#s\u00b9M+lv3I\u00c5\u00bc\u00a1".getBytes("ISO-8859-1");
                                    ** continue;
                                    break;
                                }
                                case 4: {
                                    v1 = 85;
                                    break block17;
                                }
lbl75:
                                // 1 sources

                                var11_11 += var12_12;
                                ** continue;
lbl77:
                                // 1 sources

                                lIIlIllI.III = new Object[var9_9.length];
                                var2_3 = -451465016;
                                ** continue;
lbl80:
                                // 1 sources

                                if (++var10_10 >= var8_8.length) ** break;
                                continue block17;
                                ** continue;
                            }
                            break;
                        }
                        break;
                    }
                }
lbl84:
                // 2 sources

                while (true) {
                    var16_16 = v1;
                    ** continue;
                    break;
                }
                var3_4 = 0;
                var4_5 = 0;
                ** while (true)
            }
            var11_11 = 0;
            ** while (true)
            v1 = 34;
            ** while (true)
        }
        lIIlIllI.l = new String[2];
        lIIlIllI.Il();
        lIIlIllI.II = new lIIlIllI();
        lIIlIllI.Il = new lIIlIllI();
        lIIlIllI.I = lIIlIllI.l();
        return;
        var9_9 = new String[var8_8.length];
        var13_13 = -1;
        ** while (true)
    }

    public static lIIlIllI II(String string) {
        return Enum.valueOf(lIIlIllI.class, string);
    }

    private static void Il() {
        lIIlIllI.l[0] = lIIlIllI.I(lIIlIllI.ll(1978289948, -527956080).toCharArray(), 25316L, -213490374);
        lIIlIllI.l[1] = lIIlIllI.I(lIIlIllI.ll(1978289949, -400921908).toCharArray(), 77870L, -190999329);
    }

    private static int lI(int n, int n2) {
        return lI[n ^ 0xFD395A87] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x75EA4F1C;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIIlIllI.III[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x8F8E52A9;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 14: {
                    n6 = 24;
                    continue block33;
                }
                case 31: {
                    n6 = 125;
                    continue block33;
                }
                case 9: {
                    n6 = 113;
                    continue block33;
                }
                case 24: {
                    n6 = 234;
                    continue block33;
                }
                case 1: {
                    n6 = 215;
                    continue block33;
                }
                case 3: {
                    n6 = 108;
                    continue block33;
                }
                case 5: {
                    n6 = 82;
                    continue block33;
                }
                case 12: {
                    n6 = 241;
                    continue block33;
                }
                case 19: {
                    n6 = 52;
                    continue block33;
                }
                case 29: {
                    n6 = 96;
                    continue block33;
                }
                case 11: {
                    n6 = 84;
                    continue block33;
                }
                case 4: {
                    n6 = 154;
                    continue block33;
                }
                case 18: {
                    n6 = 31;
                    continue block33;
                }
                case 23: {
                    n6 = 155;
                    continue block33;
                }
                case 20: {
                    n6 = 156;
                    continue block33;
                }
                case 7: {
                    n6 = 177;
                    continue block33;
                }
                case 17: {
                    n6 = 181;
                    continue block33;
                }
                case 30: {
                    n6 = 150;
                    continue block33;
                }
                default: {
                    n6 = 214;
                    continue block33;
                }
                case 26: {
                    n6 = 117;
                    continue block33;
                }
                case 21: {
                    n6 = 141;
                    continue block33;
                }
                case 27: {
                    n6 = 8;
                    continue block33;
                }
                case 2: {
                    n6 = 236;
                    continue block33;
                }
                case 15: {
                    n6 = 65;
                    continue block33;
                }
                case 6: {
                    n6 = 213;
                    continue block33;
                }
                case 13: {
                    n6 = 1;
                    continue block33;
                }
                case 10: {
                    n6 = 208;
                    continue block33;
                }
                case 25: {
                    n6 = 122;
                    continue block33;
                }
                case 16: {
                    n6 = 220;
                    continue block33;
                }
                case 8: {
                    n6 = 21;
                    continue block33;
                }
                case 28: {
                    n6 = 135;
                    continue block33;
                }
                case 22: 
            }
            n6 = 2;
        }
        return new String(cArray).intern();
    }
}

