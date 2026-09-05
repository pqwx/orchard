/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllllIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
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

@Environment(value=EnvType.CLIENT)
final class IIllllIll
extends Enum<IIllllIll> {
    private static String[] I;
    private static final /* synthetic */ IIllllIll[] l;
    public static final /* enum */ IIllllIll II;
    public static final /* enum */ IIllllIll Il;
    private static final int[] lI;
    private static final String[] ll;
    private static final Object[] III;

    public static IIllllIll I(String string) {
        return Enum.valueOf(IIllllIll.class, string);
    }

    private static void l() {
        IIllllIll.I[0] = IIllllIll.II(IIllllIll.ll(1247550224, '\u0727', '\ud489').toCharArray(), 12861L, -1400739554);
        IIllllIll.I[1] = IIllllIll.II(IIllllIll.ll(-1921099647, '\uc190', '\ud488').toCharArray(), 91651L, -330893530);
    }

    private static String II(char[] cArray, long l2, int n) {
        int n2 = 0x73BE5009 ^ n;
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

    public static IIllllIll[] values() {
        return (IIllllIll[])l.clone();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 25592;
        var7_2 = "\u8534\u91b0\ud5a8\ua1d4\u6245\u052b\u795b\u1803\u58db\u3053\u121e\u4f10\u9384\u525a\ub286\ud2ef\u7c39\uf13f\udccc\u908a\u9702\u91c4\udc8c\u9c1d\ud2c8\u5d16\ue606\u239a\ua4f2\u3fcd\u98cf\ub529\u80ff\u5a5a";
        var8_3 = "\u63e9\u63e9".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl10
        block7: while (true) {
            block12: {
                block11: {
                    if (++var10_5 < var8_3.length) break block11;
                    var13_8 = 0;
lbl10:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = 0;
                    if (var13_8 == 0) break block12;
                }
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl44
            }
            IIllllIll.ll = var9_4;
            IIllllIll.III = new Object[var9_4.length];
            var2_13 = 347427775;
            var0_11 = "4]\b\u00cc(\u00c2\u001a'd\u0096\u00c1\u00df\u00a8_\u00b0\u00c5".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            IIllllIll.lI = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                IIllllIll.lI[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            IIllllIll.I = new String[2];
            IIllllIll.l();
            IIllllIll.II = new IIllllIll();
            IIllllIll.Il = new IIllllIll();
            IIllllIll.l = IIllllIll.Il();
            return;
            block9: while (true) {
                var16_1 = v0;
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                if (var15_10 >= var14_9.length) ** GOTO lbl60
lbl44:
                // 2 sources

                switch (var15_10 % 6) {
                    default: {
                        v0 = 110;
                        continue block9;
                    }
                    case 2: {
                        v0 = 1;
                        continue block9;
                    }
                    case 5: {
                        v0 = 113;
                        continue block9;
                    }
                    case 3: {
                        v0 = 74;
                        continue block9;
                    }
                    case 4: {
                        v0 = 9;
                        continue block9;
                    }
lbl60:
                    // 1 sources

                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    continue block7;
                    case 1: 
                }
                v0 = 120;
            }
            break;
        }
    }

    private static /* synthetic */ IIllllIll[] Il() {
        return new IIllllIll[]{II, Il};
    }

    private static int lI(int n, int n2) {
        return lI[n ^ 0x3041884C] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, char c, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0xD489;
        char[] cArray = ll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIllllIll.III[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x543E;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x8693;
            n6 += 1441;
            n6 -= 31737;
            n6 -= 1624;
            n6 ^= 0x86F4;
            n6 ^= 0xF893;
            cArray[n5] = (char)((n6 += 28880) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

