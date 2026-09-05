/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Density
 *   - Breach
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
final class lIllIl
extends Enum<lIllIl> {
    private static final /* synthetic */ lIllIl[] I;
    final IIIlIIIII l;
    public static final /* enum */ lIllIl II;
    public static final /* enum */ lIllIl Il;
    final IIIlIIIII lI;
    private static final String[] ll;
    private static final Object[] III;

    public static lIllIl[] values() {
        return (lIllIl[])I.clone();
    }

    private lIllIl(IIIlIIIII iIIlIIIII, IIIlIIIII iIIlIIIII2) {
        this.lI = iIIlIIIII;
        this.l = iIIlIIIII2;
    }

    public static lIllIl valueOf(String string) {
        return Enum.valueOf(lIllIl.class, string);
    }

    private static /* synthetic */ lIllIl[] I() {
        return new lIllIl[]{II, Il};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block19: {
                block20: {
                    block22: {
                        break block22;
lbl1:
                        // 1 sources

                        while (true) {
                            var2_2 = "\u2df0\u2dfb\u2dff\u2df1\u2dff\u2dfb".toCharArray();
                            ** GOTO lbl30
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            ** GOTO lbl34
                            break;
                        }
lbl6:
                        // 1 sources

                        while (true) {
                            lIllIl.II = new lIllIl(StringFactory.IIII("Density"), StringFactory.IIII("Breach"));
                            ** GOTO lbl32
                            break;
                        }
lbl9:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            if (var7_7 != 0) ** GOTO lbl9
                            break block19;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var5_5 = 0;
                            var6_6 = 0;
                            ** continue;
                            break;
                        }
lbl18:
                        // 1 sources

                        block12: while (true) {
                            switch (var9_9 % 5) {
                                case 3: {
                                    v0 = 22;
                                    break block12;
                                }
lbl23:
                                // 2 sources

                                while (true) {
                                    var4_4 = 0;
                                    ** continue;
                                    break;
                                }
lbl26:
                                // 1 sources

                                while (true) {
                                    v1 = var9_9++;
                                    var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
                                    ** continue;
                                    break;
                                }
lbl30:
                                // 1 sources

                                var3_3 = new String[var2_2.length];
                                break block20;
lbl32:
                                // 1 sources

                                lIllIl.Il = new lIllIl(StringFactory.IIII("Breach"), StringFactory.IIII("Density"));
                                break;
lbl34:
                                // 1 sources

                                if (var9_9 < var8_8.length) continue block12;
                                ** GOTO lbl47
                                case 2: {
                                    v0 = 55;
                                    break block12;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    ** GOTO lbl44
lbl41:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = 0;
                                        ** GOTO lbl23
                                        break;
                                    }
lbl44:
                                    // 1 sources

                                    if (++var4_4 >= var2_2.length) ** break;
                                    ** continue;
                                    ** continue;
                                    break;
                                }
lbl47:
                                // 1 sources

                                var3_3[var4_4] = new String(var8_8).intern();
                                break block21;
                            }
                            break;
                        }
lbl49:
                        // 5 sources

                        while (true) {
                            var10_10 = v0;
                            ** continue;
                            break;
                        }
                    }
                    var0 = 11767;
                    var1_1 = "\u6cdc\u6c0c\u6cd6\u6cfa\u6c31\u6c68\u6c5b\ud414\ud4f9\ud424\ud432\ud4e8\ud4be\ud4ba\ud451\ud472\ud4d6\ud491\ud430\uc5ba\uc571\uc595\uc5ac\uc541\uc539\uc525\uc5de\u635a\u639b\u635d\u6368\u63bb\u63f4\u50af\u5064\u5080\u50b9\u5054\u502c\u5030\u50cb\u2590\u257d\u25a0\u25b6\u256c\u253a\u253e\u25d5\u25f6\u2552\u2515\u25b4";
                    ** while (true)
                }
                var7_7 = -1;
                ** while (true)
lbl59:
                // 1 sources

                while (true) {
                    lIllIl.III = new Object[var3_3.length];
                    ** continue;
                    break;
                }
            }
            lIllIl.ll = var3_3;
            ** while (true)
            var6_6 = var2_2[var4_4] ^ var0;
            var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
            var9_9 = 0;
            ** while (true)
        }
        var5_5 += var6_6;
        ** while (true)
        {
            case 4: {
                v0 = 4;
                break;
            }
        }
        lIllIl.I = lIllIl.I();
        return;
        {
            case 1: {
                v0 = 97;
                break;
            }
        }
        v0 = 41;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String l(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x7FDCBEBD;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIllIl.III[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xC15957F7;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 9: {
                    n6 = 110;
                    continue block33;
                }
                case 23: {
                    n6 = 190;
                    continue block33;
                }
                case 19: {
                    n6 = 252;
                    continue block33;
                }
                case 20: {
                    n6 = 90;
                    continue block33;
                }
                case 29: {
                    n6 = 148;
                    continue block33;
                }
                case 7: {
                    n6 = 207;
                    continue block33;
                }
                case 21: {
                    n6 = 20;
                    continue block33;
                }
                case 5: {
                    n6 = 2;
                    continue block33;
                }
                case 6: {
                    n6 = 116;
                    continue block33;
                }
                case 15: {
                    n6 = 240;
                    continue block33;
                }
                case 2: {
                    n6 = 184;
                    continue block33;
                }
                case 14: {
                    n6 = 120;
                    continue block33;
                }
                case 1: {
                    n6 = 63;
                    continue block33;
                }
                case 13: {
                    n6 = 143;
                    continue block33;
                }
                case 31: {
                    n6 = 63;
                    continue block33;
                }
                case 3: {
                    n6 = 168;
                    continue block33;
                }
                case 22: {
                    n6 = 20;
                    continue block33;
                }
                case 11: {
                    n6 = 129;
                    continue block33;
                }
                case 12: {
                    n6 = 198;
                    continue block33;
                }
                case 30: {
                    n6 = 36;
                    continue block33;
                }
                default: {
                    n6 = 166;
                    continue block33;
                }
                case 17: {
                    n6 = 53;
                    continue block33;
                }
                case 28: {
                    n6 = 166;
                    continue block33;
                }
                case 26: {
                    n6 = 1;
                    continue block33;
                }
                case 25: {
                    n6 = 201;
                    continue block33;
                }
                case 10: {
                    n6 = 104;
                    continue block33;
                }
                case 24: {
                    n6 = 2;
                    continue block33;
                }
                case 4: {
                    n6 = 107;
                    continue block33;
                }
                case 8: {
                    n6 = 218;
                    continue block33;
                }
                case 16: {
                    n6 = 33;
                    continue block33;
                }
                case 27: {
                    n6 = 46;
                    continue block33;
                }
                case 18: 
            }
            n6 = 120;
        }
        return new String(cArray).intern();
    }
}

