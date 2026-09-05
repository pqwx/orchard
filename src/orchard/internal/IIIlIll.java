/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Closest
 *   - Other
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
final class IIIlIll
extends Enum<IIIlIll> {
    public static final /* enum */ IIIlIll I;
    private final IIIlIIIII l;
    private static final /* synthetic */ IIIlIll[] II;
    public static final /* enum */ IIIlIll Il;
    private static final String[] lI;
    private static final Object[] ll;

    private static /* synthetic */ IIIlIll[] I() {
        return new IIIlIll[]{Il, I};
    }

    private IIIlIll(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 19491;
        String string = "\u62cb\u62da\u62d7\u62db\u62d1\u62db\u62e2\u0c7b\u0c3b\u0c78\u0c72\u0c7a\u0c88\u0c88\u0c8b\u0ca2\u0c8f\u0c43\u0c43\u1218\u1221\u1215\u1212\u121b\u4d3f\u4d7f\u4d4d\u4d2e\u4d38\u4d5c\u4d3e\u4d88";
        char[] cArray = "\u4c24\u4c2f\u4c26\u4c2b".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                lI = stringArray;
                ll = new Object[stringArray.length];
                Il = new IIIlIll(StringFactory.IIII("Closest"));
                I = new IIIlIll(StringFactory.IIII("Other"));
                II = IIIlIll.I();
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

    public static IIIlIll[] values() {
        return (IIIlIll[])II.clone();
    }

    public static IIIlIll l(String string) {
        return Enum.valueOf(IIIlIll.class, string);
    }

    public String toString() {
        return this.l.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(short s, int n, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x374B;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIlIll.ll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5A94;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 60352;
            n6 += 5525;
            n6 ^= 0xA4E4;
            n6 ^= 0x4C93;
            cArray[n5] = (char)((n6 ^= 0xD8A3) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

