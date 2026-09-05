/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlIIIl
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
public final class llIlIIIl
extends Enum<llIlIIIl> {
    public static final /* enum */ llIlIIIl I;
    private static final /* synthetic */ llIlIIIl[] l;
    private static final String[] II;
    private static final Object[] Il;

    public static llIlIIIl I(String string) {
        return Enum.valueOf(llIlIIIl.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 8056;
        String string = "\u34cc\u34c3\u34d0\u34c5\u34ca\u34d4\u34d1\u34cd\u34c2\u34c4\u34c6\u34ce\u34c6\u34cf\u34d5";
        char[] cArray = "\u1f77".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                II = stringArray;
                Il = new Object[stringArray.length];
                I = new llIlIIIl();
                l = llIlIIIl.l();
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

    private static /* synthetic */ llIlIIIl[] l() {
        return new llIlIIIl[]{I};
    }

    public static llIlIIIl[] values() {
        return (llIlIIIl[])l.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char c, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0x8426;
        char[] cArray = II[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIlIIIl.Il[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4595;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0x4178;
            n7 += 11988;
            n7 -= 62162;
            n7 += 54049;
            cArray[n6] = (char)((n7 -= 59940) ^ n4 ^ c ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

