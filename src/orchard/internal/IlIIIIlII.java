/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - No Move
 *   - .getBytes(
 *   - Blatant
 *   - Stop
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
final class IlIIIIlII
extends Enum<IlIIIIlII> {
    public static final /* enum */ IlIIIIlII I;
    private static final /* synthetic */ IlIIIIlII[] l;
    public static final /* enum */ IlIIIIlII II;
    public static final /* enum */ IlIIIIlII Il;
    private static String[] lI;
    private final IIIlIIIII ll;
    private static final int[] III;
    private static final String[] IIl;
    private static final Object[] IlI;

    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0xC303281F ^ n;
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

    private static void l() {
        IlIIIIlII.lI[0] = IlIIIIlII.I(IlIIIIlII.ll(-175809945, 1130699776).toCharArray(), 2646L, -1748896615);
        IlIIIIlII.lI[1] = IlIIIIlII.I(IlIIIIlII.ll(-175809946, -623965553).toCharArray(), 14238L, -421491040);
        IlIIIIlII.lI[2] = IlIIIIlII.I(IlIIIIlII.ll(-175809947, -522051448).toCharArray(), 15654L, 185790996);
        IlIIIIlII.lI[3] = IlIIIIlII.I(IlIIIIlII.ll(-175809948, -155901296).toCharArray(), 74765L, -253661282);
        IlIIIIlII.lI[4] = IlIIIIlII.I(IlIIIIlII.ll(-175809949, 136914775).toCharArray(), 90919L, 1547208870);
        IlIIIIlII.lI[5] = IlIIIIlII.I(IlIIIIlII.ll(-175809950, -673626992).toCharArray(), 66578L, 97627487);
    }

    public static IlIIIIlII[] values() {
        return (IlIIIIlII[])l.clone();
    }

    public String toString() {
        return this.ll.IIII();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 9114;
        var7_2 = "\ub046\u45d3\u97e5\ua8d1\u6959\u6452\ue385\u60fb\ue2a9\u2156\uc70e\ud2b0\u2b8e\u53dd\u81a7\u6976\ucc04\ua297\ucf1d\u7f26\ue084\ucaa5\u155b\u5b33\uac27\u096f\ue7f6\ub325\ubfb3\ua113\ue77b\u0fbb\u9a35\u70dc\uf3c2\u7b4d\u647f\ud68d\u951f\uf81f\u1504\u9f70\ud28b\ue75e\u1a65\udd6d\uedd0\u048a\u02e9\uc24e";
        var8_3 = "\u2392\u239d\u2396\u239d\u2396\u239e".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl22
lbl7:
        // 1 sources

        while (true) {
            var3_14 += 4;
            if (++var4_15 < var1_12) ** GOTO lbl40
            IlIIIIlII.lI = new String[6];
            IlIIIIlII.l();
            IlIIIIlII.Il = new IlIIIIlII("Stop");
            IlIIIIlII.II = new IlIIIIlII("Blatant");
            IlIIIIlII.I = new IlIIIIlII("No Move");
            IlIIIIlII.l = IlIIIIlII.II();
            return;
        }
        while (true) {
            block11: {
                block10: {
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_3.length) break block10;
                    var13_8 = 0;
lbl22:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = 0;
                    if (var13_8 == 0) break block11;
                }
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl47
            }
            IlIIIIlII.IIl = var9_4;
            IlIIIIlII.IlI = new Object[var9_4.length];
            var2_13 = -755630448;
            var0_11 = "k\u00f6n$\u00d0\u00f3\u00a3\u008a0\u00ab\u00ee\u00a7\u0010\u0007\u00b2C\u0010G\u0090\u00cd\u00c6o\u0082d\u00d5w2\u00e1\u00e8\u00fa\u000fI\u0013{\u0095\u001a".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            IlIIIIlII.III = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
lbl40:
            // 2 sources

            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
            IlIIIIlII.III[var4_15] = var5_16 ^= var2_13;
            ** continue;
            break;
        }
        while (true) {
            v0 = var15_10++;
            var14_9[v0] = (char)(var14_9[v0] ^ var16_1);
            if (var15_10 >= var14_9.length) ** continue;
lbl47:
            // 2 sources

            switch (var15_10 % 6) {
                case 3: {
                    v1 = 44;
                    break;
                }
                case 2: {
                    v1 = 79;
                    break;
                }
                default: {
                    v1 = 23;
                    break;
                }
                case 5: {
                    v1 = 78;
                    break;
                }
                case 1: {
                    v1 = 60;
                    break;
                }
                case 4: {
                    v1 = 75;
                }
            }
            var16_1 = v1;
        }
    }

    private static /* synthetic */ IlIIIIlII[] II() {
        return new IlIIIIlII[]{Il, II, I};
    }

    public static IlIIIIlII Il(String string) {
        return Enum.valueOf(IlIIIIlII.class, string);
    }

    private IlIIIIlII(String string2) {
        this.ll = StringFactory.lIl(string2);
    }

    private static int lI(int n, int n2) {
        return III[n ^ 0x35EB9648] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xF5855A67;
        char[] cArray = IIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIIIlII.IlI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x82A8F240;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 1 -> 216;
                case 26 -> 210;
                case 14 -> 151;
                case 2 -> 80;
                case 7 -> 27;
                case 16 -> 172;
                case 5 -> 124;
                case 17 -> 110;
                case 18 -> 15;
                case 8 -> 18;
                case 22 -> 77;
                case 11 -> 203;
                case 21 -> 186;
                case 12 -> 7;
                case 20 -> 164;
                default -> 44;
                case 9 -> 34;
                case 23 -> 95;
                case 29 -> 101;
                case 10 -> 22;
                case 19 -> 206;
                case 15 -> 119;
                case 24 -> 239;
                case 13 -> 181;
                case 27 -> 92;
                case 28 -> 125;
                case 6 -> 191;
                case 30 -> 200;
                case 3 -> 118;
                case 4 -> 3;
                case 31 -> 140;
                case 25 -> 133;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

