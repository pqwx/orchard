/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Last hit
 *   - Closest
 *   - Health
 *   - Fov
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
public final class lIlIll
extends Enum<lIlIll> {
    private static final /* synthetic */ lIlIll[] I;
    public static final /* enum */ lIlIll l;
    private final IIIlIIIII II;
    public static final /* enum */ lIlIll Il;
    public static final /* enum */ lIlIll lI;
    public static final /* enum */ lIlIll ll;
    private static final String[] III;
    private static final Object[] IIl;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 21751;
        String string = "\ufe31\ufe28\ufe21\ud87b\ud879\ud87d\ud8a6\uaeb5\uaea6\uaea9\uaea5\uaeaf\uaea5\uae9e\u8c04\u8c44\u8c09\u8c0f\u8c07\u8bf9\u8bf9\u8c34\u8c1f\u8c30\u8c3c\u8c3c\u6567\u6572\u656e\u656b\u6563\u6567\u3382\u33ab\u33af\u339f\u338a\u33b4\u33c4\u338f\ubd1e\ubd1b\ubd2d\ubd26\ubd31\ubd22\ubd23\ubd26\u941a\u9410\u93fc\u940e\u942f\u940c\u9432\u942c\u93fd\u93f7\u942d\u9463";
        char[] cArray = "\u54f4\u54f3\u54f0\u54fb\u54f1\u54ff\u54ff\u54fb".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                III = stringArray;
                IIl = new Object[stringArray.length];
                ll = new lIlIll(StringFactory.IIII("Fov"));
                Il = new lIlIll(StringFactory.IIII("Closest"));
                l = new lIlIll(StringFactory.IIII("Health"));
                lI = new lIlIll(StringFactory.IIII("Last hit"));
                I = lIlIll.I();
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

    public static lIlIll[] values() {
        return (lIlIll[])I.clone();
    }

    private static /* synthetic */ lIlIll[] I() {
        return new lIlIll[]{ll, Il, l, lI};
    }

    private lIlIll(IIIlIIIII iIIlIIIII) {
        this.II = iIIlIIIII;
    }

    public String toString() {
        return this.II.IIII();
    }

    public static lIlIll l(String string) {
        return Enum.valueOf(lIlIll.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(short s, int n, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x2C53;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIlIll.IIl[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xCCF;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 18294;
            n6 ^= 0xB372;
            n6 ^= 0xECC1;
            n6 ^= 0x9901;
            cArray[n5] = (char)((n6 ^= 0xF57E) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

