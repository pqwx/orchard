/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlllIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Flint
 *   - Lava
 *   - Both
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
final class lIlllIII
extends Enum<lIlllIII> {
    private static final /* synthetic */ lIlllIII[] I;
    public static final /* enum */ lIlllIII l;
    public static final /* enum */ lIlllIII II;
    private final IIIlIIIII Il;
    public static final /* enum */ lIlllIII lI;
    private static final String[] ll;
    private static final Object[] III;

    public static lIlllIII valueOf(String string) {
        return Enum.valueOf(lIlllIII.class, string);
    }

    private static /* synthetic */ lIlllIII[] I() {
        return new lIlllIII[]{l, lI, II};
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 26384;
        String string = "\u2dfc\u2dd3\u2d86\u2d58\u2da5\ua2b8\ua29b\ua2d3\ua206\ua2ee\ua201\ua250\ua2c6\u50a0\u5088\u50cf\u5001\uacd9\uacc2\uac8e\uac42\uac88\uac54\uac3e\uaca5\udd63\udd4b\udd00\uddc5\u64c6\u64e6\u64b2\u645e\u6494\u645a\u6420\u64bb";
        char[] cArray = "\u0005\b\u0004\b\u0004\b".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        block6: while (true) {
            int n3;
            int n4;
            block12: {
                int n5;
                int n6;
                char c;
                char[] cArray2;
                block13: {
                    block11: {
                        if (bl && !(bl = false) && true) break block11;
                        int n7 = n4;
                        int n8 = n3++;
                        cArray2[n8] = (char)(cArray2[n8] ^ n7 ^ n);
                        if (n3 < cArray2.length) break block12;
                        stringArray[n6] = new String(cArray2).intern();
                        n5 += c;
                        if (++n6 < cArray.length) break block13;
                        n2 = 0;
                    }
                    n6 = 0;
                    n5 = 0;
                    c = '\u0000';
                    if (n2 == 0) {
                        ll = stringArray;
                        III = new Object[stringArray.length];
                        l = new lIlllIII(StringFactory.IIII("Flint"));
                        lI = new lIlllIII(StringFactory.IIII("Lava"));
                        II = new lIlllIII(StringFactory.IIII("Both"));
                        I = lIlllIII.I();
                        return;
                    }
                }
                c = cArray[n6];
                cArray2 = string.substring(n5, n5 + c).toCharArray();
                n3 = 0;
            }
            switch (n3 % 5) {
                case 4: {
                    n4 = 103;
                    continue block6;
                }
                case 1: {
                    n4 = 11;
                    continue block6;
                }
                case 3: {
                    n4 = 122;
                    continue block6;
                }
                default: {
                    n4 = 108;
                    continue block6;
                }
                case 2: 
            }
            n4 = 55;
        }
    }

    private lIlllIII(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    public String toString() {
        return this.Il.IIII();
    }

    public static lIlllIII[] values() {
        return (lIlllIII[])I.clone();
    }

    /*
     * Unable to fully structure code
     */
    private static String l(int var0, int var1_1) {
        block54: {
            block53: {
                block51: {
                    block52: {
                        break block54;
lbl1:
                        // 1 sources

                        while (true) {
                            var9_9 = 59;
                            ** GOTO lbl71
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var9_9 = 32;
                            ** GOTO lbl71
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var9_9 = 163;
                            ** GOTO lbl71
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var9_9 = 78;
                            ** GOTO lbl71
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var5_5 = var2_3;
                            break block51;
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var9_9 = 200;
                            ** GOTO lbl71
                            break;
                        }
lbl19:
                        // 1 sources

                        while (true) {
                            var9_9 = 38;
                            ** GOTO lbl71
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            var9_9 = 182;
                            ** GOTO lbl71
                            break;
                        }
                        while (true) {
                            break block52;
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            break block53;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            continue;
lbl31:
                            // 1 sources

                            while (true) {
                                var9_9 = 230;
                                ** GOTO lbl71
                                break;
                            }
lbl34:
                            // 1 sources

                            while (true) {
                                var9_9 = 217;
                                ** GOTO lbl71
                                break;
                            }
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            if (var2_3 == null) ** continue;
                            ** continue;
                            break;
                        }
lbl40:
                        // 2 sources

                        while (true) {
                            switch (var8_8 & 31) {
                                case 22: {
                                    ** continue;
                                }
                                case 28: {
                                    ** continue;
                                }
                                case 11: {
                                    ** continue;
                                }
                                case 19: {
                                    ** continue;
                                }
                                case 7: {
                                    ** continue;
                                }
                                case 9: {
                                    ** continue;
                                }
                                case 21: {
                                    ** continue;
                                }
                                case 27: {
                                    ** continue;
                                }
                                case 31: {
                                    ** continue;
                                }
                                case 13: {
                                    var9_9 = 184;
                                    ** GOTO lbl71
                                }
                                case 14: {
                                    var9_9 = 12;
                                    ** GOTO lbl71
                                }
                                case 29: {
                                    var9_9 = 166;
                                    ** GOTO lbl71
                                }
                                case 25: {
                                    var9_9 = 206;
lbl71:
                                    // 32 sources

                                    while (true) {
                                        var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
                                        ** continue;
                                        break;
                                    }
                                }
                                case 16: {
                                    var9_9 = 126;
                                    ** GOTO lbl71
                                }
                                case 3: {
                                    var9_9 = 28;
                                    ** GOTO lbl71
                                }
                                case 8: {
                                    var9_9 = 126;
                                    ** GOTO lbl71
                                }
                                case 30: {
                                    var9_9 = 110;
                                    ** GOTO lbl71
                                }
                                case 1: {
                                    var9_9 = 228;
                                    ** GOTO lbl71
                                }
                            }
                            break;
                        }
                        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 1763809099;
                        var8_8 = 0;
                        ** GOTO lbl40
                        {
                            case 2: {
                                var9_9 = 136;
                                ** GOTO lbl71
                            }
                        }
                    }
                    var5_5 = new Throwable().getStackTrace();
                    lIlllIII.III[var3_2] = var5_5;
                    break block51;
                    {
                        case 12: {
                            var9_9 = 109;
                            ** GOTO lbl71
                        }
                        case 5: {
                            var9_9 = 14;
                            ** GOTO lbl71
                        }
                        case 17: {
                            var9_9 = 3;
                            ** GOTO lbl71
                        }
                    }
lbl108:
                    // 1 sources

                    return new String(var4_4).intern();
                    {
                        case 6: {
                            var9_9 = 111;
                            ** GOTO lbl71
                        }
                        case 20: {
                            var9_9 = 202;
                            ** GOTO lbl71
                        }
                    }
                }
                var6_6 = var5_5[1];
                ** while (true)
                {
                    case 15: {
                        var9_9 = 124;
                        ** GOTO lbl71
                    }
                    default: {
                        var9_9 = 166;
                        ** GOTO lbl71
                    }
                }
lbl125:
                // 1 sources

                while (true) {
                    var2_3 = (StackTraceElement[])lIlllIII.III[var3_2];
                    ** continue;
                    break;
                }
                {
                    case 10: {
                        var9_9 = 86;
                        ** GOTO lbl71
                    }
                    case 18: {
                        var9_9 = 32;
                        ** GOTO lbl71
                    }
                    case 4: {
                        var9_9 = 230;
                        ** GOTO lbl71
                    }
                    case 26: {
                        var9_9 = 11;
                        ** GOTO lbl71
                    }
                }
            }
            if (++var8_8 >= var4_4.length) ** break;
            ** while (true)
            ** while (true)
            {
                case 23: {
                    var9_9 = 55;
                    ** GOTO lbl71
                }
            }
        }
        var3_2 = var0 ^ 1537584007;
        var4_4 = lIlllIII.ll[var3_2].toCharArray();
        ** while (true)
        {
            ** case 24:
        }
lbl152:
        // 1 sources

        var9_9 = 149;
        ** while (true)
    }
}

