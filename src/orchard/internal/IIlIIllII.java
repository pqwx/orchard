/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIllII
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
public final class IIlIIllII
extends Enum<IIlIIllII> {
    public static final /* enum */ IIlIIllII I;
    public static final /* enum */ IIlIIllII l;
    private static final /* synthetic */ IIlIIllII[] II;
    private static final String[] Il;
    private static final Object[] lI;

    public static IIlIIllII[] values() {
        return (IIlIIllII[])II.clone();
    }

    private static /* synthetic */ IIlIIllII[] I() {
        return new IIlIIllII[]{l, I};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 27539;
        String string = "\ua8bb\ua8ba\ua8c7\ua8bc\ua8b8\ua8bd\u5602\u5603\u55f4\u5603\u560a\u560d\u55f6\u5603\u55f8";
        char[] cArray = "\u6b95\u6b9a".toCharArray();
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
                Il = stringArray;
                lI = new Object[stringArray.length];
                l = new IIlIIllII();
                I = new IIlIIllII();
                II = IIlIIllII.I();
                return;
            }
            n2 = 0;
        }
    }

    public static IIlIIllII l(String string) {
        return Enum.valueOf(IIlIIllII.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char c, char c2, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xE2AA;
        char[] cArray = Il[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIlIIllII.lI[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3920;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 46532;
            n6 -= 13322;
            n6 -= 54351;
            n6 -= 19760;
            n6 += 25468;
            n6 -= 45569;
            cArray[n5] = (char)((n6 ^= 0xE24B) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

