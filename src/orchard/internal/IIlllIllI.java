/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlllIllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Silent
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
public final class IIlllIllI
extends Enum<IIlllIllI> {
    public static final /* enum */ IIlllIllI I;
    private final IIIlIIIII l;
    private static final /* synthetic */ IIlllIllI[] II;
    public static final /* enum */ IIlllIllI Il;
    private static String[] lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    private static void I() {
        IIlllIllI.lI[0] = IIlllIllI.II(IIlllIllI.ll(154782510, -1348058614).toCharArray(), 89731L, -1883103641);
        IIlllIllI.lI[1] = IIlllIllI.II(IIlllIllI.ll(154782511, 951398892).toCharArray(), 7379L, 1315051413);
        IIlllIllI.lI[2] = IIlllIllI.II(IIlllIllI.ll(154782508, -1574421984).toCharArray(), 96190L, -491052285);
        IIlllIllI.lI[3] = IIlllIllI.II(IIlllIllI.ll(154782509, -1372628829).toCharArray(), 96819L, -1161381788);
    }

    private static /* synthetic */ IIlllIllI[] l() {
        return new IIlllIllI[]{I, Il};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char[] cArray, long l2, int n) {
        int n2 = 0xB92F3B30 ^ n;
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

    public static IIlllIllI[] values() {
        return (IIlllIllI[])II.clone();
    }

    public String toString() {
        return this.l.IIII();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block36: {
                block40: {
                    block41: {
                        block34: {
                            block37: {
                                block39: {
                                    block35: {
                                        block33: {
                                            block32: {
                                                var6 = 26651;
                                                break block40;
lbl3:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 104;
                                                    break block32;
                                                    break;
                                                }
lbl6:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 96;
                                                    break block32;
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
                                                    v0 = 74;
                                                    break block32;
                                                    break;
                                                }
lbl14:
                                                // 1 sources

                                                while (true) {
                                                    continue;
lbl16:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                    var0_12 = "_\u00ea\u00c9G\u00e0&\u00e25\\\u00ee\u0010\u001d\u0095\u00acm?\u001e\u008dA\n\u008d\u0005;?".getBytes("ISO-8859-1");
                                                    var1_13 = var0_12.length / 4;
                                                    ** continue;
                                                    break;
                                                }
lbl21:
                                                // 1 sources

                                                while (true) {
                                                    if (var13_8 != 0) break block33;
                                                    break block34;
                                                    break;
                                                }
lbl24:
                                                // 1 sources

                                                while (true) {
                                                    var4_15 = 0;
                                                    break block35;
                                                    break;
                                                }
lbl27:
                                                // 1 sources

                                                while (true) {
                                                    var13_8 = 0;
                                                    break block36;
                                                    break;
                                                }
lbl30:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
lbl33:
                                            // 2 sources

                                            block17: while (true) {
                                                continue;
lbl35:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 105;
                                                    continue block17;
                                                    break;
                                                }
lbl38:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 72;
                                                    continue block17;
                                                    break;
                                                }
                                                break;
                                            }
lbl41:
                                            // 1 sources

                                            while (true) {
                                                IIlllIllI.lI = new String[4];
                                                IIlllIllI.I();
                                                IIlllIllI.I = new IIlllIllI("Silent");
                                                IIlllIllI.Il = new IIlllIllI("Legit");
                                                IIlllIllI.II = IIlllIllI.l();
                                                return;
                                            }
lbl48:
                                            // 1 sources

                                            while (var15_10 >= var14_9.length) {
                                                break block37;
                                            }
                                            break block41;
lbl51:
                                            // 1 sources

                                            while (true) {
                                                var13_8 = -1;
                                                break block36;
                                                break;
                                            }
                                        }
lbl55:
                                        // 2 sources

                                        while (true) {
                                            break block38;
                                            break;
                                        }
                                        IIlllIllI.ll = new int[var1_13];
                                        var3_14 = 0;
                                        ** while (true)
lbl60:
                                        // 1 sources

                                        while (true) {
                                            break block39;
                                            break;
                                        }
lbl62:
                                        // 1 sources

                                        while (true) {
                                            ** GOTO lbl48
                                            break;
                                        }
                                        IIlllIllI.IIl = new Object[var9_4.length];
                                        var2_11 = -1764452290;
                                        ** while (true)
                                    }
lbl68:
                                    // 2 sources

                                    while (true) {
                                        var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
                                        ** continue;
                                        break;
                                    }
                                }
                                ** while (++var10_5 < var8_3.length)
lbl73:
                                // 1 sources

                                ** while (true)
lbl74:
                                // 1 sources

                                while (true) {
                                    var11_6 += var12_7;
                                    ** continue;
                                    break;
                                }
                                var16_1 = v0;
                                v1 = var15_10++;
                                var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                                ** while (true)
lbl81:
                                // 1 sources

                                while (true) {
                                    var12_7 = 0;
                                    ** continue;
                                    break;
                                }
lbl84:
                                // 1 sources

                                while (true) {
                                    var11_6 = 0;
                                    ** continue;
                                    break;
                                }
lbl87:
                                // 1 sources

                                while (true) {
                                    var9_4 = new String[var8_3.length];
                                    ** continue;
                                    break;
                                }
                            }
                            var9_4[var10_5] = new String(var14_9).intern();
                            ** while (true)
                        }
                        IIlllIllI.III = var9_4;
                        ** while (true)
                        IIlllIllI.ll[var4_15] = var5_16 ^= var2_11;
                        var3_14 += 4;
                        ** while (++var4_15 < var1_13)
lbl99:
                        // 1 sources

                        ** while (true)
                    }
lbl101:
                    // 2 sources

                    while (true) {
                        switch (var15_10 % 6) {
                            case 2: {
                                ** continue;
                            }
                            case 1: {
                                ** continue;
                            }
                            case 4: {
                                ** continue;
                            }
                            case 5: {
                                ** continue;
                            }
                            case 3: {
                                ** continue;
                            }
                        }
                        v0 = 3;
                        ** continue;
                        break;
                    }
                }
                var7_2 = "\uf137\u41a0\u63e3\uddc5\u6afe\ud6e3\uc337\u5866\ua76e\u0587\u60f9\u8d40\u8a25\uc4e5\u7322\u3a10\udb43\uaabf\ueebf\ub67f\u947f\u2650\u18dc\uf82c\u1d07\uc28d\u2da9";
                var8_3 = "\u681e\u681d\u6813\u6813".toCharArray();
                ** while (true)
            }
            var10_5 = 0;
            ** while (true)
        }
        var12_7 = var8_3[var10_5] ^ var6;
        var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
        var15_10 = 0;
        ** while (true)
    }

    private IIlllIllI(String string2) {
        this.l = StringFactory.lIl(string2);
    }

    public static IIlllIllI Il(String string) {
        return Enum.valueOf(IIlllIllI.class, string);
    }

    private static int lI(int n, int n2) {
        return ll[n ^ 0x8EBED003] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String ll(int var0, int var1_1) {
        var3_2 = var0 ^ 154782510;
        var4_4 = IIlllIllI.III[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])IIlllIllI.IIl[var3_2];
        if (var2_3 != null) {
            var5_5 = var2_3;
        } else {
            var5_5 = new Throwable().getStackTrace();
            IIlllIllI.IIl[var3_2] = var5_5;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -1565454024;
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
                case 24: {
                    var9_9 = 211;
                    continue block33;
                }
                case 11: {
                    var9_9 = 249;
                    continue block33;
                }
                case 7: {
                    var9_9 = 78;
                    continue block33;
                }
                case 15: {
                    var9_9 = 185;
                    continue block33;
                }
                case 26: {
                    var9_9 = 182;
                    continue block33;
                }
                case 17: {
                    var9_9 = 125;
                    continue block33;
                }
                case 13: {
                    var9_9 = 249;
                    continue block33;
                }
                case 1: {
                    var9_9 = 203;
                    continue block33;
                }
                case 23: {
                    var9_9 = 176;
                    continue block33;
                }
                case 4: {
                    var9_9 = 89;
                    continue block33;
                }
                case 10: {
                    var9_9 = 105;
                    continue block33;
                }
                case 14: {
                    var9_9 = 223;
                    continue block33;
                }
                case 31: {
                    var9_9 = 64;
                    continue block33;
                }
                case 22: {
                    var9_9 = 244;
                    continue block33;
                }
                case 25: {
                    var9_9 = 120;
                    continue block33;
                }
                case 30: {
                    var9_9 = 60;
                    continue block33;
                }
                case 12: {
                    var9_9 = 235;
                    continue block33;
                }
                case 28: {
                    var9_9 = 6;
                    continue block33;
                }
                case 16: {
                    var9_9 = 109;
                    continue block33;
                }
                case 6: {
                    var9_9 = 153;
                    continue block33;
                }
                case 20: {
                    var9_9 = 95;
                    continue block33;
                }
                case 9: {
                    var9_9 = 236;
                    continue block33;
                }
                case 19: {
                    var9_9 = 87;
                    continue block33;
                }
                case 21: {
                    var9_9 = 33;
                    continue block33;
                }
                case 5: {
                    var9_9 = 229;
                    continue block33;
                }
                default: {
                    var9_9 = 225;
                    continue block33;
                }
                case 3: {
                    var9_9 = 58;
                    continue block33;
                }
                case 29: {
                    var9_9 = 190;
                    continue block33;
                }
                case 18: {
                    var9_9 = 153;
                    continue block33;
                }
                case 8: {
                    var9_9 = 26;
                    continue block33;
                }
                case 27: {
                    var9_9 = 53;
                    continue block33;
                }
                case 2: 
            }
            var9_9 = 10;
        }
    }
}

