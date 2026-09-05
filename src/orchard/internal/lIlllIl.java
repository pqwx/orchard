/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlllIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Density
 *   - density
 *   - breach
 *   - Breach
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
final class lIlllIl
extends Enum<lIlllIl> {
    public static final /* enum */ lIlllIl I;
    public static final /* enum */ lIlllIl l;
    private final String II;
    private final IIIlIIIII Il;
    private static final /* synthetic */ lIlllIl[] lI;
    private final String ll;
    private static String[] III;
    private static final int[] IIl;
    private static final String[] IlI;
    private static final Object[] Ill;

    private static /* synthetic */ lIlllIl[] I() {
        return new lIlllIl[]{I, l};
    }

    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0x7CF35814 ^ n;
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

    public String toString() {
        return this.Il.IIII();
    }

    private static void II() {
        lIlllIl.III[0] = lIlllIl.l(lIlllIl.ll(1049980353, 972317136).toCharArray(), 73366L, 1838068089);
        lIlllIl.III[1] = lIlllIl.l(lIlllIl.ll(1049980352, -355320054).toCharArray(), 42620L, -849957210);
        lIlllIl.III[2] = lIlllIl.l(lIlllIl.ll(1049980355, -644254320).toCharArray(), 7928L, 1239029901);
        lIlllIl.III[3] = lIlllIl.l(lIlllIl.ll(1049980354, 236211855).toCharArray(), 54536L, -1009416238);
        lIlllIl.III[4] = lIlllIl.l(lIlllIl.ll(1049980357, 38799219).toCharArray(), 15008L, 1974864732);
        lIlllIl.III[5] = lIlllIl.l(lIlllIl.ll(1049980356, 1094208968).toCharArray(), 42777L, -646440157);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 12648;
        var7_2 = "\u6789\ub469\u9179\uc004\ua14d\u3638\u8d3f\u71b4\u044a\u9555\ua237\u9c3e\u38f9\uf98c\u44f1\u93fa\u299d\u4af5\udc64\u872a\ucdad\u0cdd\u6a98\u43db\u8fe5\u1bd1\u9942\ue2ff\uba79\u545f\u0bcd\u2895\u734b\u8bbe\u418e\ufafd\u70fe\ud6ca\u4bff\ub4de\u70c6\ua147\u746c\u2858\uefff\u350e\u8684\u0831\u5022\u1316\u71f4\u1432\u3c4a";
        var8_3 = "\b\b\f\u0007\u0006\f".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl34
        while (true) {
            block11: {
                switch (var15_10 % 6) {
                    case 3: {
                        v0 = 109;
                        ** break;
                    }
                    case 5: {
                        v0 = 62;
                        ** break;
                    }
                    case 1: {
                        v0 = 29;
                        ** break;
                    }
                    case 4: {
                        v0 = 121;
                        ** break;
                    }
                    default: {
                        v0 = 70;
                        ** break;
                    }
                    case 2: 
                }
                v0 = 105;
lbl26:
                // 6 sources

                var16_1 = v0;
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
                if (var15_10 < var14_9.length) continue;
                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                if (++var10_5 < var8_3.length) break block11;
                var13_8 = 0;
lbl34:
                // 2 sources

                var10_5 = 0;
                var11_6 = 0;
                var12_7 = '\u0000';
                if (var13_8 == 0) break;
            }
            var12_7 = var8_3[var10_5];
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
        }
        lIlllIl.IlI = var9_4;
        lIlllIl.Ill = new Object[var9_4.length];
        var2_13 = -1222733982;
        var0_11 = "o\u0091Z9\r\u007f\u00aav\u00f5\u00fbar\u00d2[\u00aa\u0092\n\u00b9Tlp\u0089\u0099\u008dFL^gtrB\u00e6\u00c9\u00d4\u000f\u008a".getBytes("ISO-8859-1");
        var1_12 = var0_11.length / 4;
        lIlllIl.IIl = new int[var1_12];
        var3_14 = 0;
        var4_15 = 0;
        if (true) ** GOTO lbl55
        while (true) {
            var3_14 += 4;
            if (++var4_15 >= var1_12) break;
lbl55:
            // 2 sources

            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
            lIlllIl.IIl[var4_15] = var5_16 ^= var2_13;
        }
        lIlllIl.III = new String[6];
        lIlllIl.II();
        lIlllIl.I = new lIlllIl("Density", "density", "breach");
        lIlllIl.l = new lIlllIl("Breach", "breach", "density");
        lIlllIl.lI = lIlllIl.I();
    }

    public static lIlllIl Il(String string) {
        return Enum.valueOf(lIlllIl.class, string);
    }

    public static lIlllIl[] values() {
        return (lIlllIl[])lI.clone();
    }

    private lIlllIl(String string2, String string3, String string4) {
        this.Il = StringFactory.lIl(string2);
        this.II = string3;
        this.ll = string4;
    }

    private static int lI(int n, int n2) {
        return IIl[n ^ 0x305D5E09] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x3E956DC1;
        char[] cArray = IlI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Ill[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIlllIl.Ill[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x9E1EC3FE;
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
                case 17: {
                    n6 = 178;
                    continue block33;
                }
                case 5: {
                    n6 = 156;
                    continue block33;
                }
                case 1: {
                    n6 = 211;
                    continue block33;
                }
                case 11: {
                    n6 = 249;
                    continue block33;
                }
                case 15: {
                    n6 = 46;
                    continue block33;
                }
                case 26: {
                    n6 = 116;
                    continue block33;
                }
                case 9: {
                    n6 = 94;
                    continue block33;
                }
                case 19: {
                    n6 = 147;
                    continue block33;
                }
                case 14: {
                    n6 = 103;
                    continue block33;
                }
                case 7: {
                    n6 = 55;
                    continue block33;
                }
                case 24: {
                    n6 = 241;
                    continue block33;
                }
                case 2: {
                    n6 = 95;
                    continue block33;
                }
                case 30: {
                    n6 = 193;
                    continue block33;
                }
                case 12: {
                    n6 = 2;
                    continue block33;
                }
                case 28: {
                    n6 = 221;
                    continue block33;
                }
                case 20: {
                    n6 = 192;
                    continue block33;
                }
                case 3: {
                    n6 = 23;
                    continue block33;
                }
                default: {
                    n6 = 6;
                    continue block33;
                }
                case 10: {
                    n6 = 226;
                    continue block33;
                }
                case 27: {
                    n6 = 91;
                    continue block33;
                }
                case 6: {
                    n6 = 232;
                    continue block33;
                }
                case 23: {
                    n6 = 86;
                    continue block33;
                }
                case 31: {
                    n6 = 116;
                    continue block33;
                }
                case 22: {
                    n6 = 64;
                    continue block33;
                }
                case 25: {
                    n6 = 195;
                    continue block33;
                }
                case 18: {
                    n6 = 60;
                    continue block33;
                }
                case 8: {
                    n6 = 45;
                    continue block33;
                }
                case 13: {
                    n6 = 225;
                    continue block33;
                }
                case 4: {
                    n6 = 8;
                    continue block33;
                }
                case 21: {
                    n6 = 193;
                    continue block33;
                }
                case 29: {
                    n6 = 20;
                    continue block33;
                }
                case 16: 
            }
            n6 = 215;
        }
    }
}

