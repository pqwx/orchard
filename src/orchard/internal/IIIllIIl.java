/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllIIl
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
import orchard.internal.Illll;

@Environment(value=EnvType.CLIENT)
final class IIIllIIl
extends Enum<IIIllIIl> {
    public static final /* enum */ IIIllIIl I;
    public static final /* enum */ IIIllIIl l;
    public static final /* enum */ IIIllIIl II;
    private final Illll Il;
    private static final /* synthetic */ IIIllIIl[] lI;
    private static final String[] ll;
    private static final Object[] III;

    private static /* synthetic */ IIIllIIl[] I() {
        return new IIIllIIl[]{I, l, II};
    }

    public String toString() {
        return this.Il.toString();
    }

    public static IIIllIIl[] values() {
        return (IIIllIIl[])lI.clone();
    }

    public static IIIllIIl l(String string) {
        return Enum.valueOf(IIIllIIl.class, string);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 10722;
        String string = "\udb64\udba2\udb4a\udbdd\ufa67\ufaa7\ufa46\ufac2\ufa3e\uf081\uf043\uf0ad\uf02b";
        char[] cArray = "\u29e6\u29e7\u29e6".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                n2 = 0;
            }
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
        }
        ll = stringArray;
        III = new Object[stringArray.length];
        I = new IIIllIIl(Illll.ll);
        l = new IIIllIIl(Illll.II);
        II = new IIIllIIl(Illll.I);
        lI = IIIllIIl.I();
    }

    private IIIllIIl(Illll illll) {
        this.Il = illll;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x29A8EBFB;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIllIIl.III[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1F0D156E;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 3: {
                    n6 = 198;
                    continue block33;
                }
                case 21: {
                    n6 = 137;
                    continue block33;
                }
                case 2: {
                    n6 = 84;
                    continue block33;
                }
                case 31: {
                    n6 = 9;
                    continue block33;
                }
                case 11: {
                    n6 = 227;
                    continue block33;
                }
                case 20: {
                    n6 = 122;
                    continue block33;
                }
                case 19: {
                    n6 = 109;
                    continue block33;
                }
                case 5: {
                    n6 = 32;
                    continue block33;
                }
                case 18: {
                    n6 = 151;
                    continue block33;
                }
                case 22: {
                    n6 = 146;
                    continue block33;
                }
                case 7: {
                    n6 = 128;
                    continue block33;
                }
                default: {
                    n6 = 115;
                    continue block33;
                }
                case 15: {
                    n6 = 138;
                    continue block33;
                }
                case 16: {
                    n6 = 20;
                    continue block33;
                }
                case 30: {
                    n6 = 141;
                    continue block33;
                }
                case 12: {
                    n6 = 188;
                    continue block33;
                }
                case 1: {
                    n6 = 184;
                    continue block33;
                }
                case 27: {
                    n6 = 248;
                    continue block33;
                }
                case 24: {
                    n6 = 152;
                    continue block33;
                }
                case 28: {
                    n6 = 196;
                    continue block33;
                }
                case 23: {
                    n6 = 245;
                    continue block33;
                }
                case 6: {
                    n6 = 110;
                    continue block33;
                }
                case 29: {
                    n6 = 179;
                    continue block33;
                }
                case 4: {
                    n6 = 61;
                    continue block33;
                }
                case 8: {
                    n6 = 50;
                    continue block33;
                }
                case 10: {
                    n6 = 35;
                    continue block33;
                }
                case 9: {
                    n6 = 17;
                    continue block33;
                }
                case 13: {
                    n6 = 103;
                    continue block33;
                }
                case 25: {
                    n6 = 118;
                    continue block33;
                }
                case 14: {
                    n6 = 145;
                    continue block33;
                }
                case 17: {
                    n6 = 190;
                    continue block33;
                }
                case 26: 
            }
            n6 = 162;
        }
    }
}

