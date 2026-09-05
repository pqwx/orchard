/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Silent
 *   - Legit
 *   - Lock
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
public final class IIIlll
extends Enum<IIIlll> {
    public static final /* enum */ IIIlll I;
    private final IIIlIIIII l;
    public static final /* enum */ IIIlll II;
    public static final /* enum */ IIIlll Il;
    private static final /* synthetic */ IIIlll[] lI;
    private static final String[] ll;
    private static final Object[] III;

    public static IIIlll[] values() {
        return (IIIlll[])lI.clone();
    }

    private IIIlll(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    public IIIlIIIII I() {
        return this.l;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 11451;
        var1_1 = "\uff5d\uff19\uffec\uff95\uff7f\uff43\uc7f8\uc783\uc767\uc713\uc7cd\uc7c1\uc7a5\uc7da\u69e9\u69b6\u695b\u6934\u69d9\u69f2\u3258\u3259\u32b5\u32bb\u3269\u3267\u3254\u3206\u8d50\u8d16\u8df2\u8d9c\ub71c\ub767\ub7b1\ub7fb\ub729\ub703\ub74c\ub73e";
        var2_2 = "\u2cbd\u2cb3\u2cbd\u2cb3\u2cbf\u2cb3".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        if (true) ** GOTO lbl40
        while (true) {
            var6_6 = var2_2[var4_4] ^ var0;
            var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
            var9_9 = 0;
            if (true) ** GOTO lbl17
            block8: while (true) {
                var10_10 = v0;
                v1 = var9_9++;
                var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
                if (var9_9 >= var8_8.length) break;
lbl17:
                // 2 sources

                switch (var9_9 % 6) {
                    default: {
                        v0 = 38;
                        continue block8;
                    }
                    case 4: {
                        v0 = 39;
                        continue block8;
                    }
                    case 1: {
                        v0 = 34;
                        continue block8;
                    }
                    case 2: {
                        v0 = 26;
                        continue block8;
                    }
                    case 5: {
                        v0 = 88;
                        continue block8;
                    }
                    case 3: 
                }
                v0 = 110;
            }
            var3_3[var4_4] = new String(var8_8).intern();
            var5_5 += var6_6;
            if (++var4_4 < var2_2.length) continue;
            var7_7 = 0;
lbl40:
            // 2 sources

            var4_4 = 0;
            var5_5 = 0;
            var6_6 = 0;
            if (var7_7 == 0) break;
        }
        IIIlll.ll = var3_3;
        IIIlll.III = new Object[var3_3.length];
        IIIlll.Il = new IIIlll(StringFactory.IIII("Legit"));
        IIIlll.I = new IIIlll(StringFactory.IIII("Silent"));
        IIIlll.II = new IIIlll(StringFactory.IIII("Lock"));
        IIIlll.lI = IIIlll.II();
    }

    public static IIIlll l(String string) {
        return Enum.valueOf(IIIlll.class, string);
    }

    public String toString() {
        return this.l.IIII();
    }

    private static /* synthetic */ IIIlll[] II() {
        return new IIIlll[]{Il, I, II};
    }

    /*
     * Unable to fully structure code
     */
    private static String Il(int var0, int var1_1) {
        block45: {
            block50: {
                block49: {
                    block46: {
                        block47: {
                            block48: {
                                break block48;
lbl1:
                                // 1 sources

                                while (true) {
                                    var9_9 = 225;
                                    ** GOTO lbl61
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl6:
                                // 1 sources

                                while (true) {
                                    var9_9 = 140;
                                    ** GOTO lbl61
                                    break;
                                }
lbl9:
                                // 1 sources

                                while (true) {
                                    break block45;
                                    break;
                                }
                            }
                            var3_2 = var0 ^ -418879887;
                            break block49;
lbl14:
                            // 1 sources

                            while (true) {
                                var9_9 = 131;
                                ** GOTO lbl61
                                break;
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                var9_9 = 61;
                                ** GOTO lbl61
                                break;
                            }
lbl20:
                            // 1 sources

                            while (true) {
                                var9_9 = 20;
                                ** GOTO lbl61
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                IIIlll.III[var3_2] = var5_5;
                                break block46;
                                break;
                            }
lbl26:
                            // 1 sources

                            while (var2_3 != null) {
                                break block47;
                            }
                            break block50;
lbl29:
                            // 2 sources

                            while (true) {
                                switch (var8_8 & 31) {
                                    case 29: {
                                        ** continue;
                                    }
                                    case 14: {
                                        ** continue;
                                    }
                                    case 15: {
                                        ** continue;
                                    }
                                    case 21: {
                                        ** continue;
                                    }
                                    case 1: {
                                        ** continue;
                                    }
                                    case 9: {
                                        var9_9 = 179;
                                        ** GOTO lbl61
                                    }
                                    default: {
                                        var9_9 = 85;
                                        ** GOTO lbl61
                                    }
                                    case 6: {
                                        var9_9 = 76;
                                        ** GOTO lbl61
                                    }
                                    case 24: {
                                        var9_9 = 154;
                                        ** GOTO lbl61
                                    }
                                    case 30: {
                                        var9_9 = 151;
                                        ** GOTO lbl61
                                    }
                                    case 31: {
                                        var9_9 = 49;
                                        ** GOTO lbl61
                                    }
                                    case 19: {
                                        var9_9 = 217;
lbl61:
                                        // 32 sources

                                        while (true) {
                                            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    case 22: {
                                        var9_9 = 136;
                                        ** GOTO lbl61
                                    }
                                    case 4: {
                                        var9_9 = 121;
                                        ** GOTO lbl61
                                    }
                                    case 5: {
                                        var9_9 = 55;
                                        ** GOTO lbl61
                                    }
                                    case 3: {
                                        var9_9 = 214;
                                        ** GOTO lbl61
                                    }
                                    case 16: {
                                        var9_9 = 73;
                                        ** GOTO lbl61
                                    }
                                }
                                break;
                            }
                        }
                        var5_5 = var2_3;
                    }
                    var6_6 = var5_5[1];
                    ** while (true)
lbl84:
                    // 1 sources

                    return new String(var4_4).intern();
                }
                var4_4 = IIIlll.ll[var3_2].toCharArray();
                var2_3 = (StackTraceElement[])IIIlll.III[var3_2];
                ** GOTO lbl26
            }
            var5_5 = new Throwable().getStackTrace();
            ** while (true)
            {
                case 11: {
                    var9_9 = 195;
                    ** GOTO lbl61
                }
                case 25: {
                    var9_9 = 20;
                    ** GOTO lbl61
                }
                case 8: {
                    var9_9 = 77;
                    ** GOTO lbl61
                }
                case 26: {
                    var9_9 = 206;
                    ** GOTO lbl61
                }
                case 7: {
                    var9_9 = 58;
                    ** GOTO lbl61
                }
            }
        }
        if (++var8_8 < var4_4.length) ** GOTO lbl29
        ** while (true)
        {
            case 23: {
                var9_9 = 80;
                ** GOTO lbl61
            }
            case 13: {
                var9_9 = 154;
                ** GOTO lbl61
            }
            case 10: {
                var9_9 = 85;
                ** GOTO lbl61
            }
            case 20: {
                var9_9 = 38;
                ** GOTO lbl61
            }
            case 2: {
                var9_9 = 196;
                ** GOTO lbl61
            }
            case 27: {
                var9_9 = 53;
                ** GOTO lbl61
            }
            case 12: {
                var9_9 = 46;
                ** GOTO lbl61
            }
            case 18: {
                var9_9 = 144;
                ** GOTO lbl61
            }
            case 28: {
                var9_9 = 253;
                ** GOTO lbl61
            }
            ** case 17:
        }
lbl139:
        // 1 sources

        var9_9 = 128;
        ** while (true)
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 780667643;
        var8_8 = 0;
        ** while (true)
    }
}

