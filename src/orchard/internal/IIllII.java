/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllII
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
final class IIllII
extends Enum<IIllII> {
    public static final /* enum */ IIllII I;
    public static final /* enum */ IIllII l;
    private static final /* synthetic */ IIllII[] II;
    public static final /* enum */ IIllII Il;
    public static final /* enum */ IIllII lI;
    public static final /* enum */ IIllII ll;
    public static final /* enum */ IIllII III;
    public static final /* enum */ IIllII IIl;
    public static final /* enum */ IIllII IlI;
    private static final int[] Ill;
    private static final String[] lII;
    private static final Object[] lIl;

    public static IIllII I(String string) {
        return Enum.valueOf(IIllII.class, string);
    }

    public static IIllII[] values() {
        return (IIllII[])II.clone();
    }

    private static /* synthetic */ IIllII[] l() {
        return new IIllII[]{lI, IlI, ll, I, l, Il, III, IIl};
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 32649;
        var7_2 = "\uaf7a\uafda\uaf32\uaf51\u7f2d\u7f93\u7f7b\u7f14\ua6a7\ua608\ua6fb\ua697\u2fdd\u2f72\u2f81\u2fed\u2f25\u2f7b\u2f2b\u2f86\u2ff3\u2f57\u2fa5\u2fce\u5484\u5427\u54ce\u54a3\u547d\u542e\u9b64\u9bc7\u9b2e\u9b43\u9b9d\u9bce\u9b88\u9b38\u9b49\u9be3\u9b02\u9b79\u9b08\u9be2\u6cac\u6c1a\u6cfd\u6c97\u6c4f\uc938\uc982\uc974\uc919\uc9c1\uc99e\uc9d5";
        var8_3 = "\u7f8d\u7f8d\u7f8d\u7f85\u7f8f\u7f87\u7f8c\u7f8e".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
lbl6:
        // 2 sources

        while (true) {
            var10_5 = 0;
            var11_6 = 0;
            var12_7 = 0;
            if (var13_8 != 0) ** GOTO lbl-1000
            IIllII.lII = var9_4;
            IIllII.lIl = new Object[var9_4.length];
            var2_13 = 505403050;
            var0_11 = "\u009d\u00bb\u0012x@\u00e1\u00ea\u0097\u00a2/\u00e0/na\u00c3-\u00f5Y\u00e8W".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            IIllII.Ill = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                IIllII.Ill[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            IIllII.lI = new IIllII();
            IIllII.IlI = new IIllII();
            IIllII.ll = new IIllII();
            IIllII.I = new IIllII();
            IIllII.l = new IIllII();
            IIllII.Il = new IIllII();
            IIllII.III = new IIllII();
            IIllII.IIl = new IIllII();
            IIllII.II = IIllII.l();
            return;
        }
        var9_4[var10_5] = new String(var14_9).intern();
        var11_6 += var12_7;
        if (++var10_5 < var8_3.length) lbl-1000:
        // 2 sources

        {
            var12_7 = var8_3[var10_5] ^ var6;
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
        } else {
            var13_8 = 0;
            ** continue;
        }
lbl43:
        // 2 sources

        switch (var15_10 % 5) {
            case 2: {
                v0 = 122;
                break;
            }
            case 4: {
                v0 = 83;
                break;
            }
            case 3: {
                v0 = 111;
                break;
            }
            default: {
                v0 = 79;
                break;
            }
            case 1: {
                v0 = 44;
            }
        }
        var16_1 = v0;
        v1 = var15_10++;
        var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
        if (var15_10 < var14_9.length) ** GOTO lbl43
    }

    private static int II(int n, int n2) {
        return Ill[n ^ 0xE44F6283] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String Il(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x21B9A9C5;
        char[] cArray = lII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIllII.lIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xDCDF346;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 2 -> 97;
                case 9 -> 133;
                case 25 -> 80;
                case 8 -> 18;
                case 12 -> 91;
                case 18 -> 222;
                case 22 -> 107;
                case 5 -> 191;
                case 29 -> 84;
                case 20 -> 129;
                case 17 -> 70;
                case 23 -> 56;
                case 16 -> 29;
                case 19 -> 37;
                case 26 -> 246;
                case 3 -> 30;
                case 13 -> 187;
                case 28 -> 160;
                case 21 -> 77;
                case 30 -> 170;
                case 1 -> 215;
                case 15 -> 98;
                case 27 -> 71;
                case 6 -> 128;
                case 31 -> 163;
                case 11 -> 103;
                default -> 25;
                case 24 -> 182;
                case 4 -> 225;
                case 14 -> 1;
                case 10 -> 112;
                case 7 -> 122;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

