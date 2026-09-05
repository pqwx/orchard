/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Opponent
 *   - Manual
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
public final class lIlIlII
extends Enum<lIlIlII> {
    public static final /* enum */ lIlIlII I;
    private final IIIlIIIII l;
    private static String[] II;
    private static final /* synthetic */ lIlIlII[] Il;
    public static final /* enum */ lIlIlII lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    public static lIlIlII I(String string) {
        return Enum.valueOf(lIlIlII.class, string);
    }

    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0x42BB7DE6 ^ n;
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

    private static void II() {
        lIlIlII.II[0] = lIlIlII.l(lIlIlII.ll(-349801588, 1193430910).toCharArray(), 42299L, -928088371);
        lIlIlII.II[1] = lIlIlII.l(lIlIlII.ll(-349801587, 482421620).toCharArray(), 55758L, -675087853);
        lIlIlII.II[2] = lIlIlII.l(lIlIlII.ll(-349801586, 963140201).toCharArray(), 86413L, 1888266892);
        lIlIlII.II[3] = lIlIlII.l(lIlIlII.ll(-349801585, 2021488005).toCharArray(), 83819L, -1460254688);
    }

    private lIlIlII(String string2) {
        this.l = StringFactory.lIl(string2);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 25028;
        String string = "\u2ee8\u3579\u5964\u204c\ue759\u273a\ua1ff\ufc6f\uf392\ue71b\u4fe3\u338d\u500d\uab27\u4b65\u43ed\u03e3\uc42d\ube4d\ufa88\u552f\u9e4a\u1139\u6bde\u3988\u7167\ubdb3\ud25b\uab65\uee09\u0e61\ud3ee\ue532\u0ee4";
        char[] cArray = "\u61c2\u61c8\u61cc\u61cc".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                n2 = 0;
            }
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
        }
        III = stringArray;
        IIl = new Object[stringArray.length];
        int n6 = 60561155;
        byte[] byArray = "^\u00e6\u00acU\u00fd}1\u00ae;s\u0011\n0S\u009aP\u00e3E\u0087p\u0083\u00ae\u00f1\u0016".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        ll = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            lIlIlII.ll[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        II = new String[4];
        lIlIlII.II();
        I = new lIlIlII("Manual");
        lI = new lIlIlII("Opponent");
        Il = lIlIlII.Il();
    }

    public String toString() {
        return this.l.IIII();
    }

    private static /* synthetic */ lIlIlII[] Il() {
        return new lIlIlII[]{I, lI};
    }

    public static lIlIlII[] values() {
        return (lIlIlII[])Il.clone();
    }

    private static int lI(int n, int n2) {
        return ll[n ^ 0x17E8CAD] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    private static String ll(int var0, int var1_1) {
        block60: {
            block62: {
                block61: {
                    block59: {
                        break block61;
lbl1:
                        // 1 sources

                        while (true) {
                            var9_9 = 69;
                            ** GOTO lbl142
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var9_9 = 55;
                            ** GOTO lbl142
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var9_9 = 161;
                            ** GOTO lbl142
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var9_9 = 15;
                            ** GOTO lbl142
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            var9_9 = 100;
                            ** GOTO lbl142
                            break;
                        }
lbl16:
                        // 1 sources

                        while (true) {
                            var9_9 = 130;
                            ** GOTO lbl142
                            break;
                        }
lbl19:
                        // 1 sources

                        while (true) {
                            lIlIlII.IIl[var3_2] = var5_5;
                            break block59;
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            var2_3 = (StackTraceElement[])lIlIlII.IIl[var3_2];
                            if (var2_3 != null) ** GOTO lbl132
                            var5_5 = new Throwable().getStackTrace();
                            ** continue;
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            var9_9 = 28;
                            ** GOTO lbl142
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            var9_9 = 212;
                            ** GOTO lbl142
                            break;
                        }
lbl33:
                        // 1 sources

                        while (true) {
                            var9_9 = 186;
                            ** GOTO lbl142
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            var9_9 = 187;
                            ** GOTO lbl142
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var9_9 = 176;
                            ** GOTO lbl142
                            break;
                        }
lbl42:
                        // 1 sources

                        while (true) {
                            var9_9 = 186;
                            ** GOTO lbl142
                            break;
                        }
                    }
lbl46:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl48:
                    // 1 sources

                    while (true) {
                        var9_9 = 187;
                        ** GOTO lbl142
                        break;
                    }
lbl51:
                    // 1 sources

                    while (true) {
                        break block60;
                        break;
                    }
lbl53:
                    // 1 sources

                    while (true) {
                        var9_9 = 28;
                        ** GOTO lbl142
                        break;
                    }
lbl56:
                    // 1 sources

                    while (true) {
                        var9_9 = 94;
                        ** GOTO lbl142
                        break;
                    }
lbl59:
                    // 1 sources

                    while (true) {
                        var9_9 = 65;
                        ** GOTO lbl142
                        break;
                    }
                }
                var3_2 = var0 ^ -349801588;
                var4_4 = lIlIlII.III[var3_2].toCharArray();
                ** while (true)
lbl66:
                // 1 sources

                while (true) {
                    var9_9 = 143;
                    ** GOTO lbl142
                    break;
                }
lbl69:
                // 1 sources

                while (true) {
                    var9_9 = 229;
                    ** GOTO lbl142
                    break;
                }
lbl72:
                // 1 sources

                while (true) {
                    var9_9 = 164;
                    ** GOTO lbl142
                    break;
                }
lbl75:
                // 1 sources

                return new String(var4_4).intern();
lbl77:
                // 2 sources

                while (true) {
                    switch (var8_8 & 31) {
                        case 17: {
                            ** continue;
                        }
                        case 19: {
                            ** continue;
                        }
                        case 9: {
                            ** continue;
                        }
                        case 3: {
                            ** continue;
                        }
                        case 28: {
                            ** continue;
                        }
                        default: {
                            ** continue;
                        }
                        case 10: {
                            ** continue;
                        }
                        case 1: {
                            ** continue;
                        }
                        case 15: {
                            ** continue;
                        }
                        case 24: {
                            ** continue;
                        }
                        case 22: {
                            ** continue;
                        }
                        case 30: {
                            ** continue;
                        }
                        case 27: {
                            ** continue;
                        }
                        case 21: {
                            ** continue;
                        }
                        case 12: {
                            ** continue;
                        }
                        case 7: {
                            ** continue;
                        }
                        case 4: {
                            ** continue;
                        }
                        case 6: {
                            ** continue;
                        }
                        case 20: {
                            ** continue;
                        }
                        case 2: {
                            var9_9 = 240;
                            ** GOTO lbl142
                        }
                        case 8: {
                            var9_9 = 102;
                            ** GOTO lbl142
                        }
                        case 29: {
                            var9_9 = 29;
                            ** GOTO lbl142
                        }
                        case 14: {
                            var9_9 = 232;
                            ** GOTO lbl142
                        }
                        case 18: {
                            var9_9 = 50;
                            ** GOTO lbl142
                        }
lbl132:
                        // 1 sources

                        var5_5 = var2_3;
                        ** continue;
                        case 25: {
                            var9_9 = 175;
                            ** GOTO lbl142
                        }
                        case 16: {
                            var9_9 = 221;
                            ** GOTO lbl142
                        }
                        case 26: {
                            var9_9 = 98;
lbl142:
                            // 32 sources

                            while (true) {
                                var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
                                ** continue;
                                break;
                            }
                        }
                    }
                    break;
                }
                var6_6 = var5_5[1];
                break block62;
                {
                    case 11: {
                        var9_9 = 237;
                        ** GOTO lbl142
                    }
                }
            }
            var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -635842842;
            var8_8 = 0;
            ** GOTO lbl77
            {
                case 13: {
                    var9_9 = 80;
                    ** GOTO lbl142
                }
            }
        }
        if (++var8_8 >= var4_4.length) ** break;
        ** while (true)
        ** while (true)
        {
            case 31: {
                var9_9 = 75;
                ** GOTO lbl142
            }
            case 5: {
                var9_9 = 32;
                ** GOTO lbl142
            }
            ** case 23:
        }
lbl168:
        // 1 sources

        var9_9 = 77;
        ** while (true)
    }
}

