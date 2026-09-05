/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Click
 *   - Place
 *   - Look
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
public final class llIlllII
extends Enum<llIlllII> {
    public static final /* enum */ llIlllII I;
    public static final /* enum */ llIlllII l;
    private static final /* synthetic */ llIlllII[] II;
    private final IIIlIIIII Il;
    public static final /* enum */ llIlllII lI;
    private static final String[] ll;
    private static final Object[] III;

    public static llIlllII[] values() {
        return (llIlllII[])II.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 2745;
        String string = "\ud044\ud049\ud046\ud044\ud03c\u7f2f\u7eef\u7f0c\u7f40\u7f12\u7f3c\u7f2b\u7f07\uc597\uc592\uc592\uc596\ua6a2\ua6d4\ua6a2\ua6ec\ua69a\ua6a7\ua6d1\ua6d1\u62e4\u6338\u6333\u6335\u62df\u1c00\u1ba9\u1c07\u1bf5\u1bfd\u1bd7\u1bfe\u1c0c";
        char[] cArray = "\u0abc\u0ab1\u0abd\u0ab1\u0abc\u0ab1".toCharArray();
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
        ll = stringArray;
        III = new Object[stringArray.length];
        I = new llIlllII(StringFactory.IIII("Click"));
        l = new llIlllII(StringFactory.IIII("Look"));
        lI = new llIlllII(StringFactory.IIII("Place"));
        II = llIlllII.I();
    }

    private static /* synthetic */ llIlllII[] I() {
        return new llIlllII[]{I, l, lI};
    }

    public static llIlllII valueOf(String string) {
        return Enum.valueOf(llIlllII.class, string);
    }

    public String toString() {
        return this.Il.IIII();
    }

    private llIlllII(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(int n, short s, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xB4EA;
        char[] cArray = ll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n2];
        if (stackTraceElementArray2 == null) {
            llIlllII.III[n2] = stackTraceElementArray = new Throwable().getStackTrace();
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x73C4;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 63306;
            n6 ^= 0x7BFB;
            n6 ^= 0xB3D0;
            n6 += 4175;
            n6 -= 41075;
            cArray[n5] = (char)((n6 -= 32967) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

