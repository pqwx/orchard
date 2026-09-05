/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - ORANGE
 *   - Yellow
 *   - Purple
 *   - Custom
 *   - Green
 *   - CYAN
 *   - PINK
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

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.core.Theme;
import orchard.internal.IIIlIIIII;
import orchard.internal.IlllIlIl;

@Environment(value=EnvType.CLIENT)
final class lIIIIlll
extends Enum<lIIIIlll> {
    private static final /* synthetic */ lIIIIlll[] I;
    public static final /* enum */ lIIIIlll l;
    public static final /* enum */ lIIIIlll II;
    public static final /* enum */ lIIIIlll Il;
    public static final /* enum */ lIIIIlll lI;
    public static final /* enum */ lIIIIlll ll;
    public static final /* enum */ lIIIIlll III;
    private final IIIlIIIII IIl;
    public static final /* enum */ lIIIIlll IlI;
    public static final /* enum */ lIIIIlll Ill;
    private static final int[] lII;
    private static final String[] lIl;
    private static final Object[] llI;

    public static lIIIIlll I(String string) {
        return Enum.valueOf(lIIIIlll.class, string);
    }

    public static lIIIIlll[] values() {
        return (lIIIIlll[])I.clone();
    }

    private static /* synthetic */ lIIIIlll[] l() {
        return new lIIIIlll[]{lI, II, Ill, l, IlI, III, Il, ll};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static lIIIIlll II(Theme theme) {
        if (theme == null) return lI;
        if (theme == Theme.Illl) {
            return lI;
        }
        Color color = theme.ll();
        if (color == null) {
            return Il;
        }
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        if (!(fArray[1] < 0.18f)) {
            float f = fArray[0];
            if (f < 0.035f) return II;
            if (!(f >= 0.94f)) {
                if (f < 0.18f) {
                    return Ill;
                }
                if (!(f < 0.42f)) {
                    if (!(f < 0.7f)) return III;
                    return IlI;
                }
                return l;
            }
            return II;
        }
        return Il;
    }

    /*
     * Enabled aggressive block sorting
     */
    static lIIIIlll Il(String string) {
        if (string == null) return lI;
        if (!"ORANGE".equals(string)) {
            if ("CYAN".equals(string)) {
                return IlI;
            }
            if ("PINK".equals(string)) {
                return III;
            }
        } else {
            return Ill;
        }
        lIIIIlll[] lIIIIlllArray = lIIIIlll.values();
        int n = lIIIIlllArray.length;
        int n2 = 0;
        while (n2 < n) {
            lIIIIlll lIIIIlll2 = lIIIIlllArray[n2];
            if (IlllIlIl.I(lIIIIlll2, string)) {
                return lIIIIlll2;
            }
            ++n2;
        }
        return lI;
    }

    IIIlIIIII lI() {
        return this.IIl;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 24446;
        var7_2 = "\uf063\uf047\uf0e4\uf068\uf0e8\uf0c8\uf029\uf07f\u0b35\u0b10\u0bd8\u0b3f\u0bbf\u0b92\u0b76\u0b6c\udc57\udc0c\udcbe\udc5e\udcde\udce4\udc10\udc0a\ub9e2\ub989\ub946\u734b\u7302\u73ff\u7329\u2800\u2871\u28bf\uc52a\uc54d\uc5b4\uc544\uc71a\uc760\uc7a6\uc741\uc780\uc7a1\ucff6\ucfa5\ucf76\ucf8e\ucf7e\ucf6e\ucfc8\ucfc9\u4467\u4414\u44cc\u442b\u44e2\ub512\ub536\ub597\ub578\ub585\ub583\ub50c\ub548\uc589\uc5e1\uc537\uc5c0\uc52b\uc548\uc59f\uc552\uc5bf\uc5ba\uc568\uc572\uec42\uec21\uece9\uec0c\uecd2\uece2\u0cb2\u0cec\u0c2c\u0cca\u0c25\u0c34\u0c9e\u0c81\ufd74\ufd10\ufdde\ufd38\u93f8\u93b0\u9351\u93a3\u936b\u934e\u93ba\u93a0\u61bb\u61cb\u6102\u61e2\u613b\u6100\ua132\ua115\ua1a8\ua141\ua1a2\ua1b0\ua116\ua137";
        var8_3 = "\u5f76\u5f76\u5f76\u5f7d\u5f7a\u5f7d\u5f7a\u5f78\u5f76\u5f7b\u5f76\u5f7a\u5f76\u5f78\u5f76\u5f7a\u5f76\u5f78\u5f76".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl14
        block6: while (true) {
            block10: {
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                break block10;
                while (true) {
                    var13_8 = 0;
lbl14:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = 0;
                    if (var13_8 != 0) continue block6;
                    lIIIIlll.lIl = var9_4;
                    lIIIIlll.llI = new Object[var9_4.length];
                    var2_13 = 1957307098;
                    var0_11 = "c5\u0017\u00a0^\u00fe\u00aco\u00e1@=\u00a12#\u0001D&\u009a\u00e4y".getBytes("ISO-8859-1");
                    var1_12 = var0_11.length / 4;
                    lIIIIlll.lII = new int[var1_12];
                    var3_14 = 0;
                    var4_15 = 0;
                    do {
                        var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                        lIIIIlll.lII[var4_15] = var5_16 ^= var2_13;
                        var3_14 += 4;
                    } while (++var4_15 < var1_12);
                    lIIIIlll.lI = new lIIIIlll(StringFactory.IIII("All"));
                    lIIIIlll.II = new lIIIIlll(StringFactory.IIII("Red"));
                    lIIIIlll.Ill = new lIIIIlll(StringFactory.IIII("Yellow"));
                    lIIIIlll.l = new lIIIIlll(StringFactory.IIII("Green"));
                    lIIIIlll.IlI = new lIIIIlll(StringFactory.IIII("Blue"));
                    lIIIIlll.III = new lIIIIlll(StringFactory.IIII("Purple"));
                    lIIIIlll.Il = new lIIIIlll(StringFactory.IIII("Mono"));
                    lIIIIlll.ll = new lIIIIlll(StringFactory.IIII("Custom"));
                    lIIIIlll.I = lIIIIlll.l();
                    return;
                }
            }
            do {
                switch (var15_10 % 5) {
                    case 3: {
                        v0 = 108;
                        break;
                    }
                    case 4: {
                        v0 = 72;
                        break;
                    }
                    default: {
                        v0 = 122;
                        break;
                    }
                    case 2: {
                        v0 = 93;
                        break;
                    }
                    case 1: {
                        v0 = 122;
                    }
                }
                var16_1 = v0;
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
            } while (var15_10 < var14_9.length);
            var9_4[var10_5] = new String(var14_9).intern();
            var11_6 += var12_7;
            if (++var10_5 >= var8_3.length) ** continue;
        }
    }

    private lIIIIlll(IIIlIIIII iIIlIIIII) {
        this.IIl = iIIlIIIII;
    }

    boolean ll(Theme theme) {
        return this == lI || this == lIIIIlll.II(theme);
    }

    private static int III(int n, int n2) {
        return lII[n ^ 0xEDCBA2A2] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    private static String IIl(int var0, int var1_1) {
        block39: {
            block40: {
                break block40;
lbl1:
                // 1 sources

                while (true) {
                    var2_3 = (StackTraceElement[])lIIIIlll.llI[var3_2];
                    if (var2_3 != null) break block39;
                    var5_5 = new Throwable().getStackTrace();
                    ** GOTO lbl52
                    break;
                }
lbl6:
                // 2 sources

                block34: while (true) {
                    block0 : switch (var8_8 & 31) {
                        case 29: {
                            var9_9 = 194;
                            break block34;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 511639111;
                            break block0;
                            break;
                        }
                        case 8: {
                            var9_9 = 133;
                            break block34;
                        }
                        case 22: {
                            var9_9 = 119;
                            break block34;
                        }
lbl20:
                        // 1 sources

                        return new String(var4_4).intern();
                        case 31: {
                            var9_9 = 238;
                            break block34;
                        }
                        default: {
                            var9_9 = 248;
                            break block34;
                        }
                        case 13: {
                            var9_9 = 174;
                            break block34;
                        }
                        case 4: {
                            var9_9 = 70;
                            break block34;
                        }
                        case 30: {
                            var9_9 = 73;
                            break block34;
                        }
                        case 16: {
                            var9_9 = 49;
                            break block34;
                        }
                        case 26: {
                            var9_9 = 166;
                            break block34;
                        }
                        case 7: {
                            var9_9 = 206;
                            break block34;
                        }
                        case 12: {
                            var9_9 = 110;
                            break block34;
                        }
                        case 10: {
                            var9_9 = 196;
                            break block34;
                        }
lbl52:
                        // 1 sources

                        lIIIIlll.llI[var3_2] = var5_5;
                        break;
                    }
                    break;
                }
lbl54:
                // 32 sources

                while (true) {
                    continue;
                    break;
                }
                {
                    case 23: {
                        var9_9 = 156;
                        break;
                    }
                    case 11: {
                        var9_9 = 162;
                        break;
                    }
                    case 17: {
                        var9_9 = 168;
                        break;
                    }
                    case 1: {
                        var9_9 = 158;
                        break;
                    }
                    case 25: {
                        var9_9 = 97;
                        break;
                    }
                }
lbl71:
                // 2 sources

                while (true) {
                    var6_6 = var5_5[1];
                    ** continue;
                    break;
                }
                var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
                if (++var8_8 < var4_4.length) ** GOTO lbl6
                ** while (true)
            }
            var3_2 = var0 ^ -1665612813;
            var4_4 = lIIIIlll.lIl[var3_2].toCharArray();
            ** while (true)
            {
                case 2: {
                    var9_9 = 118;
                    break;
                }
                case 9: {
                    var9_9 = 73;
                    break;
                }
                case 24: {
                    var9_9 = 213;
                    break;
                }
                case 5: {
                    var9_9 = 77;
                    break;
                }
                case 6: {
                    var9_9 = 243;
                    break;
                }
                case 21: {
                    var9_9 = 247;
                    break;
                }
                case 15: {
                    var9_9 = 82;
                    break;
                }
                case 20: {
                    var9_9 = 224;
                    break;
                }
                case 27: {
                    var9_9 = 225;
                    break;
                }
                case 19: {
                    var9_9 = 78;
                    break;
                }
            }
        }
        var5_5 = var2_3;
        ** while (true)
        {
            case 18: {
                var9_9 = 37;
                break;
            }
        }
        var8_8 = 0;
        ** while (true)
        {
            case 14: {
                var9_9 = 103;
                break;
            }
            case 28: {
                var9_9 = 95;
                break;
            }
            ** case 3:
        }
lbl126:
        // 1 sources

        var9_9 = 160;
        ** while (true)
    }
}

