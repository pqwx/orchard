/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Bucket
 *   - Block
 *   - Both
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
final class IlIlIlII
extends Enum<IlIlIlII> {
    public static final /* enum */ IlIlIlII I;
    public static final /* enum */ IlIlIlII l;
    private static final /* synthetic */ IlIlIlII[] II;
    private final IIIlIIIII Il;
    public static final /* enum */ IlIlIlII lI;
    private static final String[] ll;
    private static final Object[] III;

    private IlIlIlII(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    public String toString() {
        return this.Il.IIII();
    }

    public static IlIlIlII[] values() {
        return (IlIlIlII[])II.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 27730;
        String string = "\ua743\ua772\ua748\ua740\ua742\ua775\u7971\u7943\u7920\u7952\u7946\u7972\u7972\u791e\u6ec4\u6ebe\u6ebb\u6ebf\u6ed7\u7159\u7152\u711a\u7124\u7120\u714a\u713d\u7111\u43ad\u43b6\u437b\u43af\ue01f\ue028\ue024\ue073\ue04c\ue073\ue1f7\ue1f7";
        char[] cArray = "\u6c54\u6c5a\u6c57\u6c5a\u6c56\u6c5a".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                ll = stringArray;
                III = new Object[stringArray.length];
                l = new IlIlIlII(StringFactory.IIII("Bucket"));
                lI = new IlIlIlII(StringFactory.IIII("Block"));
                I = new IlIlIlII(StringFactory.IIII("Both"));
                II = IlIlIlII.l();
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

    public static IlIlIlII I(String string) {
        return Enum.valueOf(IlIlIlII.class, string);
    }

    private static /* synthetic */ IlIlIlII[] l() {
        return new IlIlIlII[]{l, lI, I};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, char c, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x71DE;
        char[] cArray = ll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIlIlII.III[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3275;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xBD89;
            n6 ^= 0x9B77;
            n6 += 41658;
            n6 ^= 0x43EC;
            cArray[n5] = (char)((n6 -= 9519) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

