/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIllI
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
final class IIlIllI
extends Enum<IIlIllI> {
    public static final /* enum */ IIlIllI I;
    private static final /* synthetic */ IIlIllI[] l;
    public static final /* enum */ IIlIllI II;
    public static final /* enum */ IIlIllI Il;
    private static final String[] lI;
    private static final Object[] ll;

    public static IIlIllI valueOf(String string) {
        return Enum.valueOf(IIlIllI.class, string);
    }

    private static /* synthetic */ IIlIllI[] I() {
        return new IIlIllI[]{Il, II, I};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 21903;
        String string = "\u60bd\u60aa\u60a2\u60a9\uabfa\uab84\uab9c\uabf7\uabf2\uab87\uab88\uab9f\uab84\uab8c\u0f79\u0f03\u0f1b\u0f78\u0f31\u0f77\u0f75\u0f07\u0f31\u0f76\u0f07\u0f75\u0f77\u0f00\u0f78";
        char[] cArray = "\u558b\u5585\u5580".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 != 0) {
                do {
                    n5 = cArray[n3] ^ n;
                    stringArray[n3] = string.substring(n4, n4 + n5);
                    n4 += n5;
                } while (++n3 < cArray.length);
            } else {
                lI = stringArray;
                ll = new Object[stringArray.length];
                Il = new IIlIllI();
                II = new IIlIllI();
                I = new IIlIllI();
                l = IIlIllI.I();
                return;
            }
            n2 = 0;
        }
    }

    public static IIlIllI[] values() {
        return (IIlIllI[])l.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(char c, int n, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xC5D4;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIlIllI.ll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x685D;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x8C2F;
            n6 -= 24219;
            n6 -= 26754;
            n6 -= 63533;
            n6 += 35948;
            n6 ^= 0xFD1F;
            cArray[n5] = (char)((n6 += 38807) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

