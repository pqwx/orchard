/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlI
 * Purpose not identified - name is the original obfuscated one.
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
final class IlI
extends Enum<IlI> {
    public static final /* enum */ IlI I;
    public static final /* enum */ IlI l;
    public static final /* enum */ IlI II;
    public static final /* enum */ IlI Il;
    public static final /* enum */ IlI lI;
    private static final /* synthetic */ IlI[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 19519;
        String string = "\u29e8\u298b\u2951\u2986\u5388\u53f0\u532a\u53e9\u53f5\u5375\u53b1\u535b\u53aa\u533f\u53c1\u5317\u537d\u93c4\u93bc\u9366\u93a5\u93b9\u932d\u93e7\u9310\u93ef\u9379\u9383\u675c\u6724\u67fe\u673d\u6721\u67a6\u676e\u678f\u677e\u67eb\u6715\u67c3\u67a9\uab22\uab5a\uab80\uab43\uab5f\uabd9\uab1d\uabeb\uab0d\uab90\uab6a\uabae\uabd0\uab0d\uabf2\uaba5\uab8e";
        char[] cArray = "\u4c3b\u4c32\u4c34\u4c32\u4c2e".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                n2 = 0;
            }
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
        }
        III = stringArray;
        IIl = new Object[stringArray.length];
        lI = new IlI();
        l = new IlI();
        II = new IlI();
        Il = new IlI();
        I = new IlI();
        ll = IlI.I();
    }

    public static IlI[] values() {
        return (IlI[])ll.clone();
    }

    private static /* synthetic */ IlI[] I() {
        return new IlI[]{lI, l, II, Il, I};
    }

    public static IlI l(String string) {
        return Enum.valueOf(IlI.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x4159631F;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlI.IIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4B991F77;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 23 -> 69;
                case 7 -> 239;
                case 19 -> 212;
                case 26 -> 125;
                case 31 -> 224;
                case 29 -> 213;
                case 30 -> 245;
                case 18 -> 153;
                case 9 -> 145;
                case 10 -> 99;
                case 20 -> 228;
                default -> 56;
                case 21 -> 11;
                case 15 -> 170;
                case 17 -> 57;
                case 2 -> 132;
                case 13 -> 15;
                case 16 -> 140;
                case 14 -> 242;
                case 12 -> 222;
                case 25 -> 80;
                case 1 -> 86;
                case 11 -> 188;
                case 3 -> 90;
                case 6 -> 24;
                case 28 -> 167;
                case 5 -> 199;
                case 4 -> 77;
                case 22 -> 135;
                case 8 -> 5;
                case 24 -> 191;
                case 27 -> 166;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

