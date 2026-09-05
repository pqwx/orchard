/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - PvPTiers Style
 *   - Classic Style
 *   - MCTiers Style
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
public final class IlIIIIIl
extends Enum<IlIIIIIl> {
    public static final /* enum */ IlIIIIIl I;
    private final IIIlIIIII l;
    private static final /* synthetic */ IlIIIIIl[] II;
    public static final /* enum */ IlIIIIIl Il;
    public static final /* enum */ IlIIIIIl lI;
    private static final String[] ll;
    private static final Object[] III;

    public static IlIIIIIl I(String string) {
        return Enum.valueOf(IlIIIIIl.class, string);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 1461;
        String string = "\u6cdf\u6c26\u6cc2\u6c77\u6c4c\u6c57\u6c44\u9d44\u9df2\u9d46\u9ddf\u9dd8\u9dc4\u9dda\u9d88\u9d1e\u9d52\u9d27\u9de8\u9d81\u9df1\u9d92\u9d32\u9db1\u9dcc\u9d4a\u9d16\ud56d\ud59d\ud572\ud5d1\ud5f7\ud5fa\ud5f4\ud5b2\u351d\u35d3\u3539\u35bf\u359e\u35ac\u35b5\u35e3\u3547\u3559\u352c\u3586\u35db\u35d1\u35e1\u3578\u35ee\u35cf\u3573\u354b\u893a\u89c2\u893c\u8986\u89b1\u89a7\u89bf\u9145\u91a5\u914a\u91ee\u91de\u91e1\u91d2\u91ab\u911a\u9152\u9127\u91e8\u9181\u91f1\u9192\u9132\u91b1\u91cc\u914a\u9116";
        char[] cArray = "\u05b2\u05a1\u05bd\u05a1\u05b2\u05a1".toCharArray();
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
        ll = stringArray;
        III = new Object[stringArray.length];
        I = new IlIIIIIl(StringFactory.IIII("Classic Style"));
        lI = new IlIIIIIl(StringFactory.IIII("PvPTiers Style"));
        Il = new IlIIIIIl(StringFactory.IIII("MCTiers Style"));
        II = IlIIIIIl.l();
    }

    private static /* synthetic */ IlIIIIIl[] l() {
        return new IlIIIIIl[]{I, lI, Il};
    }

    public IIIlIIIII II() {
        return this.l;
    }

    public String toString() {
        return this.l.IIII();
    }

    public static IlIIIIIl[] values() {
        return (IlIIIIIl[])II.clone();
    }

    private IlIIIIIl(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Il(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x33E94C04;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIIIIl.III[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xFBAC2A9E;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 23 -> 200;
                case 27 -> 174;
                case 6 -> 3;
                case 5 -> 26;
                case 24 -> 164;
                case 8 -> 226;
                case 20 -> 207;
                case 25 -> 200;
                case 4 -> 27;
                case 22 -> 112;
                case 19 -> 130;
                case 3 -> 32;
                case 17 -> 2;
                case 28 -> 165;
                case 7 -> 68;
                case 26 -> 190;
                case 2 -> 135;
                case 11 -> 42;
                case 15 -> 205;
                default -> 152;
                case 10 -> 247;
                case 30 -> 61;
                case 12 -> 96;
                case 29 -> 243;
                case 1 -> 110;
                case 16 -> 91;
                case 21 -> 23;
                case 18 -> 222;
                case 31 -> 68;
                case 14 -> 97;
                case 9 -> 202;
                case 13 -> 17;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

