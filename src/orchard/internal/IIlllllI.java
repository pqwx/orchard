/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlllllI
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
final class IIlllllI
extends Enum<IIlllllI> {
    public static final /* enum */ IIlllllI I;
    public static final /* enum */ IIlllllI l;
    public static final /* enum */ IIlllllI II;
    private static final /* synthetic */ IIlllllI[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    public static IIlllllI[] values() {
        return (IIlllllI[])Il.clone();
    }

    private static /* synthetic */ IIlllllI[] I() {
        return new IIlllllI[]{l, I, II};
    }

    public static IIlllllI l(String string) {
        return Enum.valueOf(IIlllllI.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 25759;
        String string = "\u931e\u9319\u931e\u930b\ub034\ub1bf\ub1be\ub1ab\ub1b8\u6ea3\u6e94\u6e9f\u6e92\u6e9c\u6ea4\u6e9d\u6e94";
        char[] cArray = "\u649b\u649a\u6497".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                lI = stringArray;
                ll = new Object[stringArray.length];
                l = new IIlllllI();
                I = new IIlllllI();
                II = new IIlllllI();
                Il = IIlllllI.I();
                return;
            }
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0x189A;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIlllllI.ll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3F3;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 46686;
            n6 += 52572;
            n6 ^= 0x67EA;
            n6 -= 4557;
            n6 -= 11423;
            n6 -= 56798;
            n6 ^= 0x5CBC;
            n6 += 60467;
            n6 ^= 0xEAB4;
            cArray[n5] = (char)((n6 ^= 0xECAB) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

