/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Middle
 *   - Right
 *   - Left
 *   - Top
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
final class lllIIIll
extends Enum<lllIIIll> {
    private final IIIlIIIII I;
    public static final /* enum */ lllIIIll l;
    public static final /* enum */ lllIIIll II;
    private static final /* synthetic */ lllIIIll[] Il;
    public static final /* enum */ lllIIIll lI;
    public static final /* enum */ lllIIIll ll;
    private static final String[] III;
    private static final Object[] IIl;

    public String toString() {
        return this.I.IIII();
    }

    private static /* synthetic */ lllIIIll[] I() {
        return new lllIIIll[]{II, ll, l, lI};
    }

    private lllIIIll(IIIlIIIII iIIlIIIII) {
        this.I = iIIlIIIII;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block28: {
            block26: {
                block25: {
                    block24: {
                        block27: {
                            break block27;
lbl1:
                            // 1 sources

                            while (true) {
                                var6_6 = '\u0000';
                                ** GOTO lbl16
lbl4:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                break;
                            }
lbl6:
                            // 1 sources

                            while (true) {
                                v0 = 11;
                                ** GOTO lbl48
                                break;
                            }
lbl9:
                            // 1 sources

                            block10: while (true) {
                                block0 : switch (var9_9 % 6) {
                                    default: {
                                        ** continue;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        var7_7 = -1;
                                        ** GOTO lbl41
                                        break;
                                    }
lbl16:
                                    // 1 sources

                                    if (var7_7 != 0) ** GOTO lbl24
                                    ** continue;
lbl18:
                                    // 1 sources

                                    while (true) {
                                        lllIIIll.lI = new lllIIIll(StringFactory.IIII("Right"));
                                        break block10;
                                        break;
                                    }
lbl21:
                                    // 1 sources

                                    while (true) {
                                        if (var9_9 < var8_8.length) continue block10;
                                        break block0;
lbl24:
                                        // 2 sources

                                        while (true) {
                                            var6_6 = var2_2[var4_4];
                                            break block24;
                                            break;
                                        }
lbl27:
                                        // 1 sources

                                        while (true) {
                                            var7_7 = 0;
                                            ** GOTO lbl41
                                            break;
                                        }
lbl30:
                                        // 1 sources

                                        while (true) {
                                            if (++var4_4 < var2_2.length) ** continue;
                                            ** continue;
                                            break;
                                        }
                                        break;
                                    }
                                    case 2: {
                                        v0 = 4;
                                        ** GOTO lbl48
                                    }
lbl36:
                                    // 1 sources

                                    while (true) {
                                        var5_5 = 0;
                                        ** continue;
                                        break;
                                    }
lbl39:
                                    // 1 sources

                                    while (true) {
                                        ** continue;
                                        break;
                                    }
lbl41:
                                    // 2 sources

                                    var4_4 = 0;
                                    ** continue;
lbl43:
                                    // 1 sources

                                    while (true) {
                                        lllIIIll.II = new lllIIIll(StringFactory.IIII("Middle"));
                                        break block25;
                                        break;
                                    }
                                    case 3: {
                                        v0 = 119;
lbl48:
                                        // 6 sources

                                        while (true) {
                                            var10_10 = v0;
                                            break block26;
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            lllIIIll.Il = lllIIIll.I();
                            return;
lbl53:
                            // 1 sources

                            while (true) {
                                var3_3 = new String[var2_2.length];
                                ** continue;
                                break;
                            }
                        }
                        var0 = 10661;
                        break block28;
                    }
                    var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                    var9_9 = 0;
                    ** while (true)
lbl63:
                    // 1 sources

                    while (true) {
                        lllIIIll.l = new lllIIIll(StringFactory.IIII("Left"));
                        ** continue;
                        break;
                    }
                }
                lllIIIll.ll = new lllIIIll(StringFactory.IIII("Top"));
                ** while (true)
                {
                    case 1: {
                        v0 = 80;
                        ** GOTO lbl48
                    }
                }
                var3_3[var4_4] = new String(var8_8).intern();
                var5_5 += var6_6;
                ** while (true)
lbl75:
                // 1 sources

                while (true) {
                    ** continue;
                    break;
                }
            }
            v1 = var9_9++;
            var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
            ** while (true)
            {
                case 5: {
                    v0 = 69;
                    ** GOTO lbl48
                }
            }
        }
        var1_1 = "\ue4ee\ue43e\ue47f\ue4e6\ue420\ue421\u819a\u8160\u8147\u81be\u814c\u816b\u81e7\u815d\u0691\u065e\u060d\uc2e5\uc209\uc27b\uc2d3\ucae2\uca3f\uca70\ucafb\udac2\uda28\uda68\udae4\uda10\uda30\udad4\uda6b\u721d\u72d2\u7290\u7206\u72d4\ude4e\ude9b\ude96\ude6a\ude9c\udeb9\ude50\udee2";
        var2_2 = "\u0006\b\u0003\u0004\u0004\b\u0005\b".toCharArray();
        ** while (true)
        {
            ** case 4:
        }
lbl89:
        // 1 sources

        v0 = 38;
        ** while (true)
        lllIIIll.III = var3_3;
        lllIIIll.IIl = new Object[var3_3.length];
        ** while (true)
    }

    public static lllIIIll[] values() {
        return (lllIIIll[])Il.clone();
    }

    public static lllIIIll l(String string) {
        return Enum.valueOf(lllIIIll.class, string);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String II(int var0, int var1_1) {
        var3_2 = var0 ^ -773872330;
        var4_4 = lllIIIll.III[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])lllIIIll.IIl[var3_2];
        if (var2_3 == null) {
            var5_5 = new Throwable().getStackTrace();
            lllIIIll.IIl[var3_2] = var5_5;
        } else {
            var5_5 = var2_3;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -448686022;
        var8_8 = 0;
        if (true) ** GOTO lbl16
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) break;
lbl16:
            // 2 sources

            switch (var8_8 & 31) {
                case 19: {
                    var9_9 = 43;
                    continue block33;
                }
                case 13: {
                    var9_9 = 65;
                    continue block33;
                }
                case 20: {
                    var9_9 = 63;
                    continue block33;
                }
                case 2: {
                    var9_9 = 223;
                    continue block33;
                }
                case 11: {
                    var9_9 = 100;
                    continue block33;
                }
                case 14: {
                    var9_9 = 35;
                    continue block33;
                }
                case 8: {
                    var9_9 = 44;
                    continue block33;
                }
                case 31: {
                    var9_9 = 18;
                    continue block33;
                }
                case 3: {
                    var9_9 = 53;
                    continue block33;
                }
                case 12: {
                    var9_9 = 252;
                    continue block33;
                }
                case 10: {
                    var9_9 = 104;
                    continue block33;
                }
                case 1: {
                    var9_9 = 199;
                    continue block33;
                }
                case 15: {
                    var9_9 = 186;
                    continue block33;
                }
                case 7: {
                    var9_9 = 243;
                    continue block33;
                }
                case 27: {
                    var9_9 = 15;
                    continue block33;
                }
                case 5: {
                    var9_9 = 193;
                    continue block33;
                }
                case 17: {
                    var9_9 = 41;
                    continue block33;
                }
                case 16: {
                    var9_9 = 55;
                    continue block33;
                }
                case 30: {
                    var9_9 = 79;
                    continue block33;
                }
                case 9: {
                    var9_9 = 65;
                    continue block33;
                }
                case 24: {
                    var9_9 = 141;
                    continue block33;
                }
                case 29: {
                    var9_9 = 187;
                    continue block33;
                }
                case 18: {
                    var9_9 = 144;
                    continue block33;
                }
                default: {
                    var9_9 = 72;
                    continue block33;
                }
                case 23: {
                    var9_9 = 237;
                    continue block33;
                }
                case 6: {
                    var9_9 = 23;
                    continue block33;
                }
                case 21: {
                    var9_9 = 86;
                    continue block33;
                }
                case 25: {
                    var9_9 = 28;
                    continue block33;
                }
                case 28: {
                    var9_9 = 98;
                    continue block33;
                }
                case 26: {
                    var9_9 = 130;
                    continue block33;
                }
                case 22: {
                    var9_9 = 179;
                    continue block33;
                }
                case 4: 
            }
            var9_9 = 170;
        }
        return new String(var4_4).intern();
    }
}

