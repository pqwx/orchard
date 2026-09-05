/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIIIII
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
final class IlIlIIIII
extends Enum<IlIlIIIII> {
    private static final /* synthetic */ IlIlIIIII[] I;
    public static final /* enum */ IlIlIIIII l;
    public static final /* enum */ IlIlIIIII II;
    private static final String[] Il;
    private static final Object[] lI;

    public static IlIlIIIII valueOf(String string) {
        return Enum.valueOf(IlIlIIIII.class, string);
    }

    private static /* synthetic */ IlIlIIIII[] I() {
        return new IlIlIIIII[]{l, II};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 17541;
        String string = "\uc972\uc97b\uc971\ucb09\uc96b\uc97c\ufddc\ufdba\ufdb7\ufddb\ufdd3";
        char[] cArray = "\u4483\u4480".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
        Il = stringArray;
        lI = new Object[stringArray.length];
        l = new IlIlIIIII();
        II = new IlIlIIIII();
        I = IlIlIIIII.I();
    }

    public static IlIlIIIII[] values() {
        return (IlIlIIIII[])I.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(char c, short s, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xE738;
        char[] cArray = Il[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIlIIIII.lI[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7F5;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 51211;
            n6 += 2373;
            n6 -= 8142;
            n6 += 13878;
            n6 -= 60189;
            n6 ^= 0xB50E;
            n6 += 60390;
            n6 ^= 0x54AB;
            n6 -= 27960;
            cArray[n5] = (char)((n6 ^= 0xA6F9) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

