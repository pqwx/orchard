/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Dia Crystal
 *   - OG Vanilla
 *   - Dia SMP
 *   - .getBytes(
 *   - Minecart
 *   - Vanilla
 *   - Crystal
 *   - Creeper
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
public final class llllII
extends Enum<llllII> {
    public static final /* enum */ llllII I;
    public static final /* enum */ llllII l;
    public static final /* enum */ llllII II;
    public static final /* enum */ llllII Il;
    public static final /* enum */ llllII lI;
    private final IIIlIIIII ll;
    public static final /* enum */ llllII III;
    public static final /* enum */ llllII IIl;
    public static final /* enum */ llllII IlI;
    public static final /* enum */ llllII Ill;
    public static final /* enum */ llllII lII;
    public static final /* enum */ llllII lIl;
    public static final /* enum */ llllII llI;
    public static final /* enum */ llllII lll;
    public static final /* enum */ llllII IIII;
    public static final /* enum */ llllII IIIl;
    public static final /* enum */ llllII IIlI;
    public static final /* enum */ llllII IIll;
    private static final /* synthetic */ llllII[] IlII;
    public static final /* enum */ llllII IlIl;
    public static final /* enum */ llllII IllI;
    public static final /* enum */ llllII Illl;
    public static final /* enum */ llllII lIII;
    public static final /* enum */ llllII lIIl;
    private static final int[] lIlI;
    private static final String[] lIll;
    private static final Object[] llII;

    private static /* synthetic */ llllII[] I() {
        return new llllII[]{Illl, lIII, III, IlI, lll, lII, IIlI, IllI, l, lIIl, lIl, IlIl, IIII, I, II, lI, IIIl, IIl, IIll, Il, Ill, llI};
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block10: {
            block8: {
                block9: {
                    var6 = 1685;
                    var7_7 = "\u0b73\u0b66\u0b48\u0b9d\u34d3\u34c3\u34e8\u3423\u3453\u342a\u34f9\u3448\uc7d4\uc7d7\uc7f7\uc72e\uc757\uc712\uc7a0\u5d2a\u5d3c\u5d35\u5ddc\u5dad\u5dd6\u5d6d\u5de8\u5d0e\u5d50\u5dac\u5dc3\uc20e\uc21e\uc229\uc2ea\uc280\u8bd9\u8b88\u8bdd\u8b2f\u8b5b\u8b1c\u8bfb\u8b47\u449d\u4490\u44a2\ub17e\ub146\ub148\ub1bc\ueb13\ueb16\ueb32\uebe6\ueb9d\uebcd\ueb7f\uf462\uf437\uf476\uf4bc\uf4e4\uf4bc\uf445\uf492\uf44c\uf40f\uf4e3\uf48c\ua15e\ua155\ua161\u88df\u88f0\u88e1\u880a\ud820\ud829\ud80d\ue585\ue581\ue5b4\ue521\u4eb8\u4eb2\u4e80\u751a\u7548\u753c\u75e5\u1f92\u1f8a\u1fa7\u1f7f\u6480\u64ba\u6499\u6449\u6400\u6479\u64aa\u641b\uf461\uf472\uf45c\u5a02\u5a13\u5a0a\u5ac3\u9a74\u9a6d\u9a5a\u05db\u05ca\u05e1\u050f\u3f95\u3f90\u3fa8\u3f76\u3f1f\u3f4f\u3fe7\u1dd6\u1d83\u1dc2\u1d14\u1d57\u1d2e\u1dac\u1d22\u1df1\u1d9d\u1d57\u1d38\uc933\uc926\uc90e\uc9c7\uc9a8\uc9ed\u8aa4\u8a8c\u8aaf\u8a60\u8a22\u8a5c\u8a88\u8a52\u884a\u8857\u886d\u88be\u88c4\u8892\ub932\ub90a\ub917\ub9ef\ub9b4\ub9d9\ub953\ub9c1\ud37a\ud362\ud342\ud39a\ud3fb\ud3a5\ud300\u25d5\u25ef\u25cc\u2525\u2554\u253c\u25ba\u2529\u25f0\u25b9\u2555\u253a\u9d5e\u9d4e\u9d66\u9db3\u9dc9\u9d8e\u9d22\u9d95\u18f5\u18cf\u188b\u1805\u1875\u180f\u1892\u1804\u18d3\u18bf\u182f\u181a\u6923\u6934\u690e\u69d0\u69ad\uc1de\uc18f\uc1c6\uc118\uc15b\uc121\uc1fc\uc140\uc6f9\uc6eb\uc6df\uc60c\uc671\uc63f\uc69a\u9218\u9237\u920b\u92eb\u929e\u92f4\u9271\u92e2\u923b\u9272\u929e\u92f1\u1d95\u1d8a\u1db4\u1d76\u1d0d\u1d57\ue301\ue311\ue308\ue3d1\ue380\ue3eb\ue34c\ue3ef\ufd1c\ufd05\ufd22\ufde2\ufd82\ufdd6\ufd62\ufdd9\ufd0f\ufd40\ufddd\ua25c\ua274\ua220\ua299\ua280\ua2b2\ua239\ua2be\ua27a\ua222\ua2c8\ua2c8\ua25a\ua25c\ua200\ua2fe\u0550\u0549\u056e\u05ae\u05de\u0585\u0527\u930e\u9326\u9372\u93cb\u93d2\u93e7\u936b\u939c\u9322\u9360\u938c\u93e3\u8a58\u8a44\u8a73\u8aa4\u8acf\u8a85\u8a3d\u8a89\u8a58\u8a0f\u8c7e\u8c29\u8c7c\u8cba\u8ce2\u8cbe\u8c01\u8c82\u8c5e\u8c01\u8c80\u8cce\u8c7a\u8c77\u8c50\u8cde";
                    var8_8 = "\u0691\u069d\u0692\u0699\u0690\u069d\u0696\u0691\u0692\u0699\u0696\u0691\u0696\u0691\u0696\u0691\u0691\u069d\u0696\u0691\u0696\u0691\u0692\u0699\u0693\u069d\u0693\u069d\u0692\u0699\u069d\u0699\u0690\u069d\u0692\u0699\u0693\u069d\u069e\u0685\u0692\u0699\u069f\u0685".toCharArray();
                    var9_9 = new String[var8_8.length];
                    var13_13 = -1;
                    ** GOTO lbl15
lbl7:
                    // 1 sources

                    while (true) {
                        var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                        llllII.lIlI[var4_5] = var5_6 ^= var2_3;
                        var3_4 += 4;
                        if (++var4_5 < var1_2) continue;
                        break block8;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var13_13 = 0;
lbl15:
                        // 2 sources

                        var10_10 = 0;
                        var11_11 = 0;
                        var12_12 = 0;
                        if (var13_13 != 0) break block9;
                        llllII.lIll = var9_9;
                        llllII.llII = new Object[var9_9.length];
                        var2_3 = 1207990932;
                        var0_1 = "\u001aW\u00feE\u00b1\u008bK\u0091{#\u00d3\u001eX``*>\u0088\u00888\u0011\u00d5\u0087\u00a5\"qi\u00a9X^\u0011\u00faH\u00dc\u000b\u0091\u00b5v\u00e6>\u00e7\u00f8\u00ec\u0099e\u0093@Op2\u00f6r\u0096\u00d1^%\u00fb\u00bf\u00d1\u00b3W\u00eb\u00aaa\u001fb\u0017E]H\u0081\u0010\u0097\u00f2\u00ed\u00ecy5\u00cfJ}e\u001b/\u00e4=\u00c3\u008c\u001f\u00c3'\u00e9\u0087TJqx\u00e5c\u0095\u00ef\u009e\u00c4\u00d0\f\u00f9\u007f\u0015B\u000e\u0084\u00e4eK\u00ff\u001bO\u00fa\u00ed\n}@7|\u0017\u00ef6}\u00ac\u00eb\u009cw".getBytes("ISO-8859-1");
                        var1_2 = var0_1.length / 4;
                        llllII.lIlI = new int[var1_2];
                        var3_4 = 0;
                        var4_5 = 0;
                        ** continue;
                        break;
                    }
                    var9_9[var10_10] = new String(var14_14).intern();
                    var11_11 += var12_12;
                    ** while (++var10_10 >= var8_8.length)
                }
                var12_12 = var8_8[var10_10] ^ var6;
                var14_14 = var7_7.substring(var11_11, var11_11 + var12_12).toCharArray();
                var15_15 = 0;
                break block10;
            }
            llllII.Illl = new llllII(StringFactory.IIII("None"));
            llllII.lIII = new llllII(StringFactory.IIII("Vanilla"));
            llllII.III = new llllII(StringFactory.IIII("Sword"));
            llllII.IlI = new llllII(StringFactory.IIII("Axe"));
            llllII.lll = new llllII(StringFactory.IIII("Crystal"));
            llllII.lII = new llllII(StringFactory.IIII("Pot"));
            llllII.IIlI = new llllII(StringFactory.IIII("UHC"));
            llllII.IllI = new llllII(StringFactory.IIII("SMP"));
            llllII.l = new llllII(StringFactory.IIII("Mace"));
            llllII.lIIl = new llllII(StringFactory.IIII("Bed"));
            llllII.lIl = new llllII(StringFactory.IIII("Bow"));
            llllII.IlIl = new llllII(StringFactory.IIII("Creeper"));
            llllII.IIII = new llllII(StringFactory.IIII("Debuff"));
            llllII.I = new llllII(StringFactory.IIII("Elytra"));
            llllII.II = new llllII(StringFactory.IIII("Manhunt"));
            llllII.lI = new llllII(StringFactory.IIII("Minecart"));
            llllII.IIIl = new llllII(StringFactory.IIII("Speed"));
            llllII.IIl = new llllII(StringFactory.IIII("Trident"));
            llllII.IIll = new llllII(StringFactory.IIII("Nethop"));
            llllII.Il = new llllII(StringFactory.IIII("Dia Crystal"));
            llllII.Ill = new llllII(StringFactory.IIII("Dia SMP"));
            llllII.llI = new llllII(StringFactory.IIII("OG Vanilla"));
            llllII.IlII = llllII.I();
            return;
        }
lbl62:
        // 2 sources

        switch (var15_15 % 5) {
            default: {
                v0 = 51;
                break;
            }
            case 2: {
                v0 = 26;
                break;
            }
            case 1: {
                v0 = 109;
                break;
            }
            case 4: {
                v0 = 66;
                break;
            }
            case 3: {
                v0 = 60;
            }
        }
        var16_16 = v0;
        v1 = var15_15++;
        var14_14[v1] = (char)(var14_14[v1] ^ var16_16);
        if (var15_15 < var14_14.length) ** GOTO lbl62
    }

    public static llllII[] values() {
        return (llllII[])IlII.clone();
    }

    private llllII(IIIlIIIII iIIlIIIII) {
        this.ll = iIIlIIIII;
    }

    public String toString() {
        return this.ll.IIII();
    }

    public static llllII l(String string) {
        return Enum.valueOf(llllII.class, string);
    }

    public IIIlIIIII II() {
        return this.ll;
    }

    private static int Il(int n, int n2) {
        return lIlI[n ^ 0xF7BDC27C] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xFB1F684;
        char[] cArray = lIll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llII[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llllII.llII[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5DBD3038;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 27: {
                    n6 = 254;
                    continue block33;
                }
                case 29: {
                    n6 = 145;
                    continue block33;
                }
                case 6: {
                    n6 = 35;
                    continue block33;
                }
                case 26: {
                    n6 = 88;
                    continue block33;
                }
                case 25: {
                    n6 = 169;
                    continue block33;
                }
                case 10: {
                    n6 = 215;
                    continue block33;
                }
                case 14: {
                    n6 = 8;
                    continue block33;
                }
                case 2: {
                    n6 = 12;
                    continue block33;
                }
                case 5: {
                    n6 = 194;
                    continue block33;
                }
                case 7: {
                    n6 = 229;
                    continue block33;
                }
                case 4: {
                    n6 = 246;
                    continue block33;
                }
                case 12: {
                    n6 = 4;
                    continue block33;
                }
                case 20: {
                    n6 = 243;
                    continue block33;
                }
                case 31: {
                    n6 = 94;
                    continue block33;
                }
                case 11: {
                    n6 = 230;
                    continue block33;
                }
                case 3: {
                    n6 = 244;
                    continue block33;
                }
                case 1: {
                    n6 = 84;
                    continue block33;
                }
                case 22: {
                    n6 = 241;
                    continue block33;
                }
                default: {
                    n6 = 30;
                    continue block33;
                }
                case 9: {
                    n6 = 54;
                    continue block33;
                }
                case 24: {
                    n6 = 131;
                    continue block33;
                }
                case 8: {
                    n6 = 18;
                    continue block33;
                }
                case 13: {
                    n6 = 61;
                    continue block33;
                }
                case 23: {
                    n6 = 9;
                    continue block33;
                }
                case 28: {
                    n6 = 253;
                    continue block33;
                }
                case 16: {
                    n6 = 152;
                    continue block33;
                }
                case 17: {
                    n6 = 0;
                    continue block33;
                }
                case 19: {
                    n6 = 73;
                    continue block33;
                }
                case 15: {
                    n6 = 247;
                    continue block33;
                }
                case 18: {
                    n6 = 163;
                    continue block33;
                }
                case 21: {
                    n6 = 84;
                    continue block33;
                }
                case 30: 
            }
            n6 = 221;
        }
    }
}

