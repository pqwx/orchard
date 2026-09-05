/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - TotemGuard
 *   - Normal
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
public final class IIIIlll
extends Enum<IIIIlll> {
    private final IIIlIIIII I;
    public static final /* enum */ IIIIlll l;
    public static final /* enum */ IIIIlll II;
    private static final /* synthetic */ IIIIlll[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 25158;
        String string = "\uc87b\uc87a\uc887\uc878\uc874\uc879\ubd2f\ubd2b\ubd2f\ubc7c\ubc50\ubc89\ubc53\ubc59\u57b7\u578c\u57b7\u57c6\u578e\u57bc\u57c4\u57b6\u57c2\u57b1\u57c7\u6254\u624c\u6252\u6287\u632b\u6274\u6274\u6251\u6274\u6274\u6314\u6280\u6282\u6287\u631b\u631b";
        char[] cArray = "\u6240\u624e\u624d\u6256".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            int n4;
            int n5;
            if (!bl || (bl = false) || !true) {
                n4 = cArray[n5] ^ n;
                stringArray[n5] = string.substring(n3, n3 + n4);
                n3 += n4;
                if (++n5 < cArray.length) continue;
                n2 = 0;
            }
            n5 = 0;
            n3 = 0;
            n4 = 0;
            if (n2 == 0) break;
        }
        lI = stringArray;
        ll = new Object[stringArray.length];
        II = new IIIIlll(StringFactory.IIII("Normal"));
        l = new IIIIlll(StringFactory.IIII("TotemGuard"));
        Il = IIIIlll.I();
    }

    private IIIIlll(IIIlIIIII iIIlIIIII) {
        this.I = iIIlIIIII;
    }

    public String toString() {
        return this.I.IIII();
    }

    public static IIIIlll valueOf(String string) {
        return Enum.valueOf(IIIIlll.class, string);
    }

    public static IIIIlll[] values() {
        return (IIIIlll[])Il.clone();
    }

    private static /* synthetic */ IIIIlll[] I() {
        return new IIIIlll[]{II, l};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(short s, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0x2901;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIlll.ll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6202;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 28486;
            n7 += 29052;
            n7 ^= 0x31BB;
            n7 ^= 0xFE25;
            n7 -= 55407;
            n7 += 38339;
            n7 += 27099;
            n7 += 24873;
            n7 -= 30518;
            cArray[n6] = (char)((n7 -= 34268) ^ n4 ^ s ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

