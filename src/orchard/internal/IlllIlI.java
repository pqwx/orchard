/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Normal
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
final class IlllIlI
extends Enum<IlllIlI> {
    public static final /* enum */ IlllIlI I;
    private static String[] l;
    public static final /* enum */ IlllIlI II;
    private final IIIlIIIII Il;
    private static final /* synthetic */ IlllIlI[] lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0xED8ECEE ^ n;
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

    private static /* synthetic */ IlllIlI[] l() {
        return new IlllIlI[]{II, I};
    }

    private IlllIlI(String string2) {
        this.Il = StringFactory.lIl(string2);
    }

    public static IlllIlI II(String string) {
        return Enum.valueOf(IlllIlI.class, string);
    }

    public static IlllIlI[] values() {
        return (IlllIlI[])lI.clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block12: {
                block17: {
                    block18: {
                        block15: {
                            block11: {
                                block13: {
                                    block14: {
                                        break block17;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var13_4 = -1;
                                            break block11;
lbl4:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl6:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                            break;
                                        }
lbl8:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl10:
                                        // 1 sources

                                        while (true) {
                                            var3_8 += 4;
                                            if (++var4_9 < var1_6) ** GOTO lbl4
                                            break block12;
                                            break;
                                        }
lbl14:
                                        // 1 sources

                                        while (true) {
                                            IlllIlI.IIl = new Object[var9_3.length];
                                            break block13;
                                            break;
                                        }
lbl17:
                                        // 1 sources

                                        while (true) {
                                            var11_12 += var12_13;
                                            break block14;
lbl20:
                                            // 1 sources

                                            while (var13_4 == 0) {
                                                break block15;
                                            }
                                            break block16;
                                            break;
                                        }
                                        var5_10 = (var0_5[var3_8] & 255) << 24 | (var0_5[var3_8 + 1] & 255) << 16 | (var0_5[var3_8 + 2] & 255) << 8 | var0_5[var3_8 + 3] & 255;
                                        IlllIlI.ll[var4_9] = var5_10 ^= var2_7;
                                        ** while (true)
                                        var1_6 = var0_5.length / 4;
                                        break block18;
                                    }
                                    while (++var10_11 >= var8_2.length) {
                                        var13_4 = 0;
                                        break block11;
lbl32:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    break block16;
                                }
                                var2_7 = 899687707;
                                var0_5 = "\u0000\u000fIX'\u00a7\u00c8\u00d4\u0091\u001fOE5\u008fK\u00cb\u00c6\u00a54\u00fbh&\u0093k".getBytes("ISO-8859-1");
                                ** while (true)
                            }
                            var10_11 = 0;
                            ** while (true)
                        }
                        IlllIlI.III = var9_3;
                        ** while (true)
                    }
                    IlllIlI.ll = new int[var1_6];
                    var3_8 = 0;
                    var4_9 = 0;
                    ** while (true)
                    var11_12 = 0;
                    var12_13 = 0;
                    ** GOTO lbl20
                    var8_2 = "\u6b81\u6b84\u6b83\u6b8f".toCharArray();
                    var9_3 = new String[var8_2.length];
                    ** while (true)
lbl56:
                    // 1 sources

                    while (true) {
                        var9_3[var10_11] = var7_1.substring(var11_12, var11_12 + var12_13);
                        ** continue;
                        break;
                    }
                }
                var6 = 27527;
                var7_1 = "\uaead\u386b\u2785\u7fad\u7ef9\ue558\u3072\u73eb\u1859\u0194\u4d34\u2303\ua6f4\uf0ed\uf200\ue54d\uacdd\u6cf5\uaeba\ufef2\u2b82";
                ** while (true)
            }
            IlllIlI.l = new String[4];
            IlllIlI.Il();
            IlllIlI.II = new IlllIlI("Normal");
            IlllIlI.I = new IlllIlI("Mmc");
            IlllIlI.lI = IlllIlI.l();
            return;
        }
        var12_13 = var8_2[var10_11] ^ var6;
        ** while (true)
    }

    private static void Il() {
        IlllIlI.l[0] = IlllIlI.I(IlllIlI.ll(-35822807, -536340811).toCharArray(), 53471L, 1137596094);
        IlllIlI.l[1] = IlllIlI.I(IlllIlI.ll(-35822808, 1540110525).toCharArray(), 54879L, -1883499566);
        IlllIlI.l[2] = IlllIlI.I(IlllIlI.ll(-35822805, -58956988).toCharArray(), 18580L, -95099183);
        IlllIlI.l[3] = IlllIlI.I(IlllIlI.ll(-35822806, -1439287052).toCharArray(), 57234L, -773328328);
    }

    public String toString() {
        return this.Il.IIII();
    }

    private static int lI(int n, int n2) {
        return ll[n ^ 0x18055311] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xFDDD6329;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlllIlI.IIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7017DC6;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 28 -> 61;
                case 19 -> 45;
                case 13 -> 206;
                case 25 -> 150;
                case 23 -> 227;
                case 4 -> 86;
                case 1 -> 213;
                case 26 -> 236;
                case 22 -> 76;
                case 5 -> 235;
                case 6 -> 72;
                case 18 -> 129;
                case 30 -> 127;
                case 10 -> 2;
                case 21 -> 215;
                case 8 -> 20;
                case 3 -> 133;
                case 15 -> 150;
                case 16 -> 235;
                case 9 -> 252;
                case 11 -> 167;
                case 31 -> 197;
                case 24 -> 136;
                case 17 -> 3;
                case 7 -> 155;
                default -> 69;
                case 29 -> 104;
                case 27 -> 179;
                case 12 -> 38;
                case 20 -> 157;
                case 14 -> 65;
                case 2 -> 15;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

