/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - this platform
 *   - .getBytes(
 *   - Windows
 *   - macOS
 *   - Linux
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 */
package orchard.internal;

public final class IllIllII
extends Enum<IllIllII> {
    private final String I;
    private static String[] l;
    public static final /* enum */ IllIllII II;
    private static final /* synthetic */ IllIllII[] Il;
    public static final /* enum */ IllIllII lI;
    public static final /* enum */ IllIllII ll;
    public static final /* enum */ IllIllII III;
    private static final int[] IIl;
    private static final String[] IlI;
    private static final Object[] Ill;

    public String I() {
        return this.I;
    }

    private static void l() {
        IllIllII.l[0] = IllIllII.lI(IllIllII.III(-1973550497, -810402707).toCharArray(), 19232L, 589736575);
        IllIllII.l[1] = IllIllII.lI(IllIllII.III(-1973550498, 230840982).toCharArray(), 76899L, 2104186588);
        IllIllII.l[2] = IllIllII.lI(IllIllII.III(-1973550499, -816960172).toCharArray(), 90503L, -1528080570);
        IllIllII.l[3] = IllIllII.lI(IllIllII.III(-1973550500, 1989566103).toCharArray(), 14909L, -1156487013);
        IllIllII.l[4] = IllIllII.lI(IllIllII.III(-1973550501, -2009252015).toCharArray(), 92683L, 1429177124);
        IllIllII.l[5] = IllIllII.lI(IllIllII.III(-1973550502, 1133068553).toCharArray(), 31427L, 891591198);
        IllIllII.l[6] = IllIllII.lI(IllIllII.III(-1973550503, 949567921).toCharArray(), 65688L, -1412065604);
        IllIllII.l[7] = IllIllII.lI(IllIllII.III(-1973550504, -1167306703).toCharArray(), 59L, 287625904);
    }

    private static /* synthetic */ IllIllII[] II() {
        return new IllIllII[]{ll, lI, II, III};
    }

    private IllIllII(String string2) {
        this.I = string2;
    }

    public static IllIllII Il(String string) {
        return Enum.valueOf(IllIllII.class, string);
    }

    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0x5C15B750 ^ n;
        for (int i = 0; i < cArray.length; ++i) {
            n2 = n2 ^ (int)l2 ^ ~i;
            n2 ^= n - i * cArray.length;
            n2 = -n2 * n | i;
            cArray[i] = (char)(cArray[i] ^ n2);
            int n3 = i & 0xFF;
            n = n << n3 | n >>> -n3;
            l2 ^= (long)n3;
        }
        return new String(cArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block16: {
                block15: {
                    block20: {
                        block19: {
                            block17: {
                                block18: {
                                    break block21;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        var12_6 = 0;
                                        if (var13_7 != 0) break block15;
                                        break block16;
                                        break;
                                    }
lbl5:
                                    // 1 sources

                                    while (true) {
                                        var3_11 += 4;
                                        if (++var4_12 < var1_9) break block17;
                                        break block18;
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
                                        IllIllII.IIl[var4_12] = var5_13 ^= var2_10;
                                        ** continue;
                                        break;
                                    }
                                }
                                IllIllII.l = new String[8];
                                IllIllII.l();
                                IllIllII.ll = new IllIllII("Windows");
                                IllIllII.lI = new IllIllII("macOS");
                                IllIllII.II = new IllIllII("Linux");
                                IllIllII.III = new IllIllII("this platform");
                                IllIllII.Il = IllIllII.II();
                                return;
lbl23:
                                // 1 sources

                                while (true) {
                                    break block19;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var11_5 += var12_6;
                                    ** continue;
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
lbl31:
                            // 2 sources

                            while (true) {
                                var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
                                ** continue;
                                break;
                            }
lbl34:
                            // 1 sources

                            while (true) {
                                var13_7 = 0;
                                break block20;
                                break;
                            }
                        }
                        if (++var10_4 >= var8_2.length) {
                            ** continue;
                        }
                        break block15;
                    }
lbl42:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl44:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl46:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                    var0_8 = "\u00ef\u00f5\u001a3\u00c7\u00a7\u001f8<mY\u0015/\u0082\u00c5#\u009f_{\u00ac=|\u00a1\u00f1\u00ccv\u0011\u00f6\u0016\u00a0\u00b3\u00d5^\u00f0Fa\b\u00f0\u0001\"]\u00d5>\u0093%\u00f7k\u00fc\u0092P\u009c\u00e0/v\u00f8\"\u00bbS\u00c9l".getBytes("ISO-8859-1");
                    var1_9 = var0_8.length / 4;
                    ** while (true)
lbl51:
                    // 1 sources

                    while (true) {
                        var13_7 = -1;
                        ** continue;
                        break;
                    }
lbl54:
                    // 1 sources

                    while (true) {
                        var4_12 = 0;
                        ** continue;
                        break;
                    }
                    IllIllII.Ill = new Object[var9_3.length];
                    var2_10 = -2125867890;
                    ** while (true)
                }
                var12_6 = var8_2[var10_4] ^ var6;
                var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                ** while (true)
                var10_4 = 0;
                var11_5 = 0;
                ** while (true)
            }
            IllIllII.IlI = var9_3;
            ** while (true)
            var8_2 = "\u20b2\u20bb\u20b6\u20aa\u20b6\u20b9\u20bb\u20bb".toCharArray();
            var9_3 = new String[var8_2.length];
            ** while (true)
        }
        var6 = 8382;
        var7_1 = "\u1151\u2400\u0dc8\u9b58\ue460\uecef\u61d0\u943a\u7dfb\u592a\uf46c\uf653\u4da1\ud48e\ufb3a\u3d2e\u63de\u70b4\u1417\u1705\u4dcc\u8922\u4c70\uf3fa\u3b5a\ubff8\u5b6f\u4274\u5671\uf6e1\u92b0\u4b82\uee27\u1a95\u3519\ucd97\u784e\u834f\u17ae\uab5f\u5136\u591e\u7e8e\u61ce\uf4f9\u243f\u793e\u41e0\u680e\u9fcb\u50e3\udea3\u6271\uc418\u8541\u9a6c\u8722\u8f2b\u1d31\uace2\u1dd4\u599c\uebda\u2d4f\ufef4\u90fe\uf660\u9459\u03ba\uc77b";
        ** while (true)
        IllIllII.IIl = new int[var1_9];
        var3_11 = 0;
        ** while (true)
    }

    public static IllIllII[] values() {
        return (IllIllII[])Il.clone();
    }

    private static int ll(int n, int n2) {
        return IIl[n ^ 0xC7537BD3] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String III(int var0, int var1_1) {
        var3_2 = var0 ^ -1973550497;
        var4_4 = IllIllII.IlI[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])IllIllII.Ill[var3_2];
        if (var2_3 != null) {
            var5_5 = var2_3;
        } else {
            var5_5 = new Throwable().getStackTrace();
            IllIllII.Ill[var3_2] = var5_5;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 625646178;
        var8_8 = 0;
        if (true) ** GOTO lbl16
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) break;
lbl16:
            // 2 sources

            switch (var8_8 & 31) {
                case 2: {
                    var9_9 = 45;
                    continue block33;
                }
                case 21: {
                    var9_9 = 189;
                    continue block33;
                }
                case 6: {
                    var9_9 = 170;
                    continue block33;
                }
                case 4: {
                    var9_9 = 47;
                    continue block33;
                }
                case 17: {
                    var9_9 = 246;
                    continue block33;
                }
                case 19: {
                    var9_9 = 221;
                    continue block33;
                }
                case 16: {
                    var9_9 = 101;
                    continue block33;
                }
                case 1: {
                    var9_9 = 112;
                    continue block33;
                }
                case 18: {
                    var9_9 = 170;
                    continue block33;
                }
                case 22: {
                    var9_9 = 25;
                    continue block33;
                }
                case 14: {
                    var9_9 = 129;
                    continue block33;
                }
                case 7: {
                    var9_9 = 18;
                    continue block33;
                }
                case 31: {
                    var9_9 = 57;
                    continue block33;
                }
                case 29: {
                    var9_9 = 6;
                    continue block33;
                }
                case 20: {
                    var9_9 = 221;
                    continue block33;
                }
                case 13: {
                    var9_9 = 17;
                    continue block33;
                }
                case 30: {
                    var9_9 = 70;
                    continue block33;
                }
                case 25: {
                    var9_9 = 104;
                    continue block33;
                }
                default: {
                    var9_9 = 202;
                    continue block33;
                }
                case 15: {
                    var9_9 = 231;
                    continue block33;
                }
                case 12: {
                    var9_9 = 7;
                    continue block33;
                }
                case 11: {
                    var9_9 = 51;
                    continue block33;
                }
                case 24: {
                    var9_9 = 13;
                    continue block33;
                }
                case 8: {
                    var9_9 = 131;
                    continue block33;
                }
                case 3: {
                    var9_9 = 84;
                    continue block33;
                }
                case 9: {
                    var9_9 = 240;
                    continue block33;
                }
                case 26: {
                    var9_9 = 145;
                    continue block33;
                }
                case 5: {
                    var9_9 = 198;
                    continue block33;
                }
                case 10: {
                    var9_9 = 169;
                    continue block33;
                }
                case 28: {
                    var9_9 = 56;
                    continue block33;
                }
                case 27: {
                    var9_9 = 118;
                    continue block33;
                }
                case 23: 
            }
            var9_9 = 133;
        }
        return new String(var4_4).intern();
    }
}

