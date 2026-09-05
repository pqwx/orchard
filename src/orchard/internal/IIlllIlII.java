/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlllIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Freelook
 *   - Legit
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
public final class IIlllIlII
extends Enum<IIlllIlII> {
    private final IIIlIIIII I;
    public static final /* enum */ IIlllIlII l;
    private static final /* synthetic */ IIlllIlII[] II;
    public static final /* enum */ IIlllIlII Il;
    private static final String[] lI;
    private static final Object[] ll;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 14804;
        String string = "\uccd6\uccbd\ucc17\ucc10\uccf1\uccc6\u8785\u87d1\u876a\u8760\u87b5\u87b2\u876f\u87e3\u6442\u643c\u649c\u6484\u6460\u6459\u64e5\u6460\u2270\u2203\u2281\u2291\u2243\u2246\u22fe\u2270\u22e1\u22a4\u22d5\u2259";
        char[] cArray = "\u39d2\u39dc\u39dc\u39d8".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        block6: while (true) {
            int n3;
            int n4;
            block12: {
                int n5;
                int n6;
                int n7;
                char[] cArray2;
                block13: {
                    block11: {
                        if (bl && !(bl = false) && true) break block11;
                        int n8 = n4;
                        int n9 = n3++;
                        cArray2[n9] = (char)(cArray2[n9] ^ n8);
                        if (n3 < cArray2.length) break block12;
                        stringArray[n6] = new String(cArray2).intern();
                        n5 += n7;
                        if (++n6 < cArray.length) break block13;
                        n2 = 0;
                    }
                    n6 = 0;
                    n5 = 0;
                    n7 = 0;
                    if (n2 == 0) {
                        lI = stringArray;
                        ll = new Object[stringArray.length];
                        l = new IIlllIlII(StringFactory.IIII("Legit"));
                        Il = new IIlllIlII(StringFactory.IIII("Freelook"));
                        II = IIlllIlII.I();
                        return;
                    }
                }
                n7 = cArray[n6] ^ n;
                cArray2 = string.substring(n5, n5 + n7).toCharArray();
                n3 = 0;
            }
            switch (n3 % 5) {
                case 1: {
                    n4 = 76;
                    continue block6;
                }
                case 4: {
                    n4 = 41;
                    continue block6;
                }
                case 3: {
                    n4 = 127;
                    continue block6;
                }
                default: {
                    n4 = 108;
                    continue block6;
                }
                case 2: 
            }
            n4 = 62;
        }
    }

    public static IIlllIlII valueOf(String string) {
        return Enum.valueOf(IIlllIlII.class, string);
    }

    private IIlllIlII(IIIlIIIII iIIlIIIII) {
        this.I = iIIlIIIII;
    }

    public static IIlllIlII[] values() {
        return (IIlllIlII[])II.clone();
    }

    public String toString() {
        return this.I.IIII();
    }

    private static /* synthetic */ IIlllIlII[] I() {
        return new IIlllIlII[]{l, Il};
    }

    /*
     * Unable to fully structure code
     */
    private static String l(int var0, int var1_1) {
        block63: {
            block66: {
                block69: {
                    block67: {
                        block65: {
                            block64: {
                                break block67;
lbl1:
                                // 1 sources

                                while (true) {
                                    var9_9 = 15;
                                    ** GOTO lbl159
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    var9_9 = 201;
                                    ** GOTO lbl159
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    var9_9 = 195;
                                    ** GOTO lbl159
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    var9_9 = 12;
                                    ** GOTO lbl159
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    block68: {
                                        break block68;
lbl15:
                                        // 1 sources

                                        while (true) {
                                            var9_9 = 207;
                                            ** GOTO lbl159
                                            break;
                                        }
lbl18:
                                        // 1 sources

                                        while (true) {
                                            var9_9 = 95;
                                            ** GOTO lbl159
                                            break;
                                        }
lbl21:
                                        // 1 sources

                                        while (true) {
                                            var9_9 = 178;
                                            ** GOTO lbl159
                                            break;
                                        }
                                    }
                                    if (++var8_8 < var4_4.length) break block63;
                                    break block64;
lbl27:
                                    // 1 sources

                                    while (true) {
                                        var9_9 = 222;
                                        ** GOTO lbl159
                                        break;
                                    }
                                    break;
                                }
lbl30:
                                // 1 sources

                                while (true) {
                                    if (var2_3 != null) break block65;
                                    break block66;
                                    break;
                                }
lbl33:
                                // 1 sources

                                while (true) {
                                    var9_9 = 238;
                                    ** GOTO lbl159
                                    break;
                                }
                            }
                            return new String(var4_4).intern();
lbl38:
                            // 1 sources

                            while (true) {
                                var9_9 = 77;
                                ** GOTO lbl159
                                break;
                            }
lbl41:
                            // 1 sources

                            while (true) {
                                var9_9 = 10;
                                ** GOTO lbl159
                                break;
                            }
lbl44:
                            // 1 sources

                            while (true) {
                                var8_8 = 0;
                                break block63;
                                break;
                            }
lbl47:
                            // 1 sources

                            while (true) {
                                var9_9 = 7;
                                ** GOTO lbl159
                                break;
                            }
                        }
                        var5_5 = var2_3;
lbl52:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl54:
                        // 1 sources

                        while (true) {
                            var9_9 = 188;
                            ** GOTO lbl159
                            break;
                        }
lbl57:
                        // 1 sources

                        while (true) {
                            var9_9 = 46;
                            ** GOTO lbl159
                            break;
                        }
lbl60:
                        // 1 sources

                        while (true) {
                            var9_9 = 35;
                            ** GOTO lbl159
                            break;
                        }
                    }
                    var3_2 = var0 ^ -1501192949;
                    break block69;
lbl66:
                    // 1 sources

                    while (true) {
                        var9_9 = 118;
                        ** GOTO lbl159
                        break;
                    }
lbl69:
                    // 1 sources

                    while (true) {
                        var9_9 = 225;
                        ** GOTO lbl159
                        break;
                    }
lbl72:
                    // 1 sources

                    while (true) {
                        var9_9 = 0;
                        ** GOTO lbl159
                        break;
                    }
lbl75:
                    // 1 sources

                    while (true) {
                        var9_9 = 194;
                        ** GOTO lbl159
                        break;
                    }
                }
                var4_4 = IIlllIlII.lI[var3_2].toCharArray();
                var2_3 = (StackTraceElement[])IIlllIlII.ll[var3_2];
                ** while (true)
lbl82:
                // 1 sources

                while (true) {
                    var9_9 = 210;
                    ** GOTO lbl159
                    break;
                }
            }
            var5_5 = new Throwable().getStackTrace();
            IIlllIlII.ll[var3_2] = var5_5;
            ** while (true)
lbl89:
            // 1 sources

            while (true) {
                var9_9 = 32;
                ** GOTO lbl159
                break;
            }
lbl92:
            // 1 sources

            while (true) {
                var9_9 = 112;
                ** GOTO lbl159
                break;
            }
lbl95:
            // 1 sources

            while (true) {
                var9_9 = 76;
                ** GOTO lbl159
                break;
            }
lbl98:
            // 1 sources

            while (true) {
                var9_9 = 253;
                ** GOTO lbl159
                break;
            }
            var6_6 = var5_5[1];
            var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -153708575;
            ** while (true)
lbl104:
            // 1 sources

            while (true) {
                var9_9 = 173;
                ** GOTO lbl159
                break;
            }
        }
        switch (var8_8 & 31) {
            case 11: {
                ** continue;
            }
            case 30: {
                ** continue;
            }
            case 6: {
                ** continue;
            }
            case 13: {
                ** continue;
            }
            case 16: {
                ** continue;
            }
            case 5: {
                ** continue;
            }
            case 19: {
                ** continue;
            }
            case 24: {
                ** continue;
            }
            case 15: {
                ** continue;
            }
            default: {
                ** continue;
            }
            case 14: {
                ** continue;
            }
            case 1: {
                ** continue;
            }
            case 20: {
                ** continue;
            }
            case 18: {
                ** continue;
            }
            case 12: {
                ** continue;
            }
            case 29: {
                ** continue;
            }
            case 8: {
                ** continue;
            }
            case 28: {
                ** continue;
            }
            case 2: {
                ** continue;
            }
            case 9: {
                ** continue;
            }
            case 4: {
                ** continue;
            }
            case 22: {
                ** continue;
            }
            case 26: {
                ** continue;
            }
            case 10: {
                ** continue;
            }
            case 25: {
                ** continue;
            }
lbl159:
            // 32 sources

            while (true) {
                var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
                ** continue;
                break;
            }
            case 27: {
                var9_9 = 236;
                ** GOTO lbl159
            }
            case 23: {
                var9_9 = 98;
                ** GOTO lbl159
            }
            case 3: {
                var9_9 = 155;
                ** GOTO lbl159
            }
            case 17: {
                var9_9 = 31;
                ** GOTO lbl159
            }
            case 31: {
                var9_9 = 232;
                ** GOTO lbl159
            }
            case 21: {
                var9_9 = 129;
                ** GOTO lbl159
            }
            case 7: 
        }
        var9_9 = 48;
        ** while (true)
    }
}

