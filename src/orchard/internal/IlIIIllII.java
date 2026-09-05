/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Silent
 *   - Legit
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
public final class IlIIIllII
extends Enum<IlIIIllII> {
    private static final /* synthetic */ IlIIIllII[] I;
    public static final /* enum */ IlIIIllII l;
    public static final /* enum */ IlIIIllII II;
    private final IIIlIIIII Il;
    private static final String[] lI;
    private static final Object[] ll;

    private IlIIIllII(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    public String toString() {
        return this.Il.IIII();
    }

    private static /* synthetic */ IlIIIllII[] I() {
        return new IlIIIllII[]{II, l};
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 1382;
        String string = "\ud864\ud815\ud808\ud808\ud873\ud86f\u7483\u74c0\u74cc\u74bd\u74cd\u74a4\u74b1\u7451\ua9c3\ua9c5\ua9c3\ua9d8\ua991\ub38f\ub352\ub35e\ub3b9\ub3cd\ub3a2\ub3cc\ub3f9";
        char[] cArray = "\u0006\b\u0005\b".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            char c;
            int n4;
            if (!bl || (bl = false) || !true) {
                c = cArray[n4];
                char[] cArray2 = string.substring(n3, n3 + c).toCharArray();
                int n5 = 0;
                boolean bl2 = true;
                block7: while (true) {
                    int n6;
                    if (!bl2 || (bl2 = false) || !true) {
                        int n7 = n6;
                        int n8 = n5++;
                        cArray2[n8] = (char)(cArray2[n8] ^ n7 ^ n);
                        if (n5 >= cArray2.length) break;
                    }
                    switch (n5 % 5) {
                        case 3: {
                            n6 = 88;
                            continue block7;
                        }
                        case 4: {
                            n6 = 36;
                            continue block7;
                        }
                        case 2: {
                            n6 = 65;
                            continue block7;
                        }
                        case 1: {
                            n6 = 65;
                            continue block7;
                        }
                    }
                    n6 = 78;
                }
                stringArray[n4] = new String(cArray2).intern();
                n3 += c;
                if (++n4 < cArray.length) continue;
                n2 = 0;
            }
            n4 = 0;
            n3 = 0;
            c = '\u0000';
            if (n2 == 0) break;
        }
        lI = stringArray;
        ll = new Object[stringArray.length];
        II = new IlIIIllII(StringFactory.IIII("Silent"));
        l = new IlIIIllII(StringFactory.IIII("Legit"));
        I = IlIIIllII.I();
    }

    public static IlIIIllII[] values() {
        return (IlIIIllII[])I.clone();
    }

    public static IlIIIllII l(String string) {
        return Enum.valueOf(IlIIIllII.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0x1E36;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIIllII.ll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x55DD;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 61935;
            n7 += 60560;
            n7 += 3638;
            n7 -= 13418;
            n7 += 13737;
            cArray[n6] = (char)((n7 += 36766) ^ n4 ^ s ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

