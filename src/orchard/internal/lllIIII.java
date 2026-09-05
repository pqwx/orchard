/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Static
 *   - Aurora
 *   - Prism
 *   - Pulse
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
public final class lllIIII
extends Enum<lllIIII> {
    private final IIIlIIIII I;
    public static final /* enum */ lllIIII l;
    public static final /* enum */ lllIIII II;
    private static final /* synthetic */ lllIIII[] Il;
    private static String[] lI;
    public static final /* enum */ lllIIII ll;
    public static final /* enum */ lllIIII III;
    private static final int[] IIl;
    private static final String[] IlI;
    private static final Object[] Ill;

    public String toString() {
        return this.I.IIII();
    }

    private static void I() {
        lllIIII.lI[0] = lllIIII.II(lllIIII.ll(11290, -1281789074, 53862).toCharArray(), 65729L, -1560041467);
        lllIIII.lI[1] = lllIIII.II(lllIIII.ll(11291, 1392127942, 2028).toCharArray(), 14347L, 757348827);
        lllIIII.lI[2] = lllIIII.II(lllIIII.ll(11288, -1579726160, 40841).toCharArray(), 61829L, -1487370443);
        lllIIII.lI[3] = lllIIII.II(lllIIII.ll(11289, -1599994074, 47768).toCharArray(), 98380L, 457219073);
        lllIIII.lI[4] = lllIIII.II(lllIIII.ll(11294, 940584501, 18399).toCharArray(), 26546L, -834530945);
        lllIIII.lI[5] = lllIIII.II(lllIIII.ll(11295, -1668516645, 34220).toCharArray(), 26289L, 470623748);
        lllIIII.lI[6] = lllIIII.II(lllIIII.ll(11292, -1280554596, 21159).toCharArray(), 3870L, 1756171681);
        lllIIII.lI[7] = lllIIII.II(lllIIII.ll(11293, 1454511941, 32753).toCharArray(), 57860L, 518524078);
    }

    public static lllIIII[] values() {
        return (lllIIII[])Il.clone();
    }

    public static lllIIII l(String string) {
        return Enum.valueOf(lllIIII.class, string);
    }

    private lllIIII(String string2) {
        this.I = StringFactory.lIl(string2);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 30691;
        var7_1 = "\u95ca\u2409\u0aac\u371a\u3efc\u70c3\u341b\u6a7e\u8f78\ub7a3\u28af\ud98b\u4ea9\u6314\ufd0d\u20f4\u58eb\ud1b5\u24fc\u3898\ua314\uf5de\u2ecc\u47bd\u5890\ud89e\uad96\u4159\u8a3e\u5cf0\u8620\u82cd\u6d51\u5f86\u690e\ud44b\ube8c\u8ae2\u344e\uf973\ud9a1\u1ad1\u4a22\u632f\ub85c\u2f62\ubd23\ufcb9\u8bf1\u0b0b\u371a\u6d6e\u942a\u5ee4";
        var8_5 = "\u77e5\u77eb\u77eb\u77eb\u77e6\u77eb\u77e5\u77e6".toCharArray();
        var9_6 = new String[var8_5.length];
        var13_10 = -1;
        ** GOTO lbl12
        while (true) {
            block11: {
                block10: {
                    var9_6[var10_7] = new String(var14_11).intern();
                    var11_8 += var12_9;
                    if (++var10_7 < var8_5.length) break block10;
                    var13_10 = 0;
lbl12:
                    // 2 sources

                    var10_7 = 0;
                    var11_8 = 0;
                    var12_9 = 0;
                    if (var13_10 == 0) break block11;
                }
                var12_9 = var8_5[var10_7] ^ var6;
                var14_11 = var7_1.substring(var11_8, var11_8 + var12_9).toCharArray();
                var15_12 = 0;
                if (true) ** GOTO lbl48
            }
            lllIIII.IlI = var9_6;
            lllIIII.Ill = new Object[var9_6.length];
            var2_4 = 660876257;
            var0_2 = "\u00a8Sf\u00eeH\u00f6}\u0088\u00d02\u00f2\u008a\u00d47\u00d3\t\u00fd\u00d9\u00ec\fU\u00c0xd5\u00fe\u00a0\u0003\"\u0095\u00f5\u00ab\u00d7\b\u000f\u00d5\u00a19=\u00fc\u0010\u00bd\u001cr\u00ec\u00b8\u00cdV6\u00c6+,Q/\u009b\u00c6[{\n\u00fe".getBytes("ISO-8859-1");
            var1_3 = var0_2.length / 4;
            lllIIII.IIl = new int[var1_3];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_2[var3_14] & 255) << 24 | (var0_2[var3_14 + 1] & 255) << 16 | (var0_2[var3_14 + 2] & 255) << 8 | var0_2[var3_14 + 3] & 255;
                lllIIII.IIl[var4_15] = var5_16 ^= var2_4;
                var3_14 += 4;
            } while (++var4_15 < var1_3);
            lllIIII.lI = new String[8];
            lllIIII.I();
            lllIIII.l = new lllIIII("Static");
            lllIIII.ll = new lllIIII("Prism");
            lllIIII.II = new lllIIII("Pulse");
            lllIIII.III = new lllIIII("Aurora");
            lllIIII.Il = lllIIII.Il();
            return;
        }
        block9: while (true) {
            var16_13 = v0;
            v1 = var15_12++;
            var14_11[v1] = (char)(var14_11[v1] ^ var16_13);
            if (var15_12 >= var14_11.length) ** continue;
lbl48:
            // 2 sources

            switch (var15_12 % 6) {
                default: {
                    v0 = 5;
                    continue block9;
                }
                case 5: {
                    v0 = 75;
                    continue block9;
                }
                case 1: {
                    v0 = 53;
                    continue block9;
                }
                case 4: {
                    v0 = 98;
                    continue block9;
                }
                case 3: {
                    v0 = 42;
                    continue block9;
                }
                case 2: 
            }
            v0 = 71;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char[] cArray, long l2, int n) {
        int n2 = 0xB7A715AA ^ n;
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

    private static /* synthetic */ lllIIII[] Il() {
        return new lllIIII[]{l, ll, II, III};
    }

    private static int lI(int n, int n2) {
        return IIl[n ^ 0x35E663C8] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2, int n3) {
        StackTraceElement[] stackTraceElementArray;
        int n4 = n ^ 0x2C1A;
        char[] cArray = IlI[n4].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Ill[n4];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lllIIII.Ill[n4] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n5 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xE6;
        int n6 = 0;
        do {
            int n7 = n6++;
            int n8 = cArray[n7] - 57081;
            n8 ^= 0x8C9C;
            n8 ^= 0x35A6;
            n8 += 46508;
            cArray[n7] = (char)((n8 ^= 0x6A02) ^ n5 ^ n3 ^ n2 >> 16);
        } while (n6 < cArray.length);
        return new String(cArray).intern();
    }
}

