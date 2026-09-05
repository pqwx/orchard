/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIllI
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
public final class IlIIIllI
extends Enum<IlIIIllI> {
    private static final /* synthetic */ IlIIIllI[] I;
    private final IIIlIIIII l;
    public static final /* enum */ IlIIIllI II;
    public static final /* enum */ IlIIIllI Il;
    private static final String[] lI;
    private static final Object[] ll;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 24997;
        String string = "\u4d3a\u4dd2\u4db4\u4d01\u4d82\u4d85\ubdf8\ubd4e\ubd29\ubdfd\ubd41\ubd63\ubd55\ubdf3\uc09e\uc06d\uc013\uc0b0\uc034\uc024\u6964\u69a8\u69c7\u6969\u69d9\u69f9\u6998\u6913";
        char[] cArray = "\u0006\b\u0006\b".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        block6: while (true) {
            int n3;
            int n4;
            block13: {
                int n5;
                int n6;
                char c;
                char[] cArray2;
                block14: {
                    block12: {
                        if (bl && !(bl = false) && true) break block12;
                        int n7 = n4;
                        int n8 = n3++;
                        cArray2[n8] = (char)(cArray2[n8] ^ n7 ^ n);
                        if (n3 < cArray2.length) break block13;
                        stringArray[n6] = new String(cArray2).intern();
                        n5 += c;
                        if (++n6 < cArray.length) break block14;
                        n2 = 0;
                    }
                    n6 = 0;
                    n5 = 0;
                    c = '\u0000';
                    if (n2 == 0) {
                        lI = stringArray;
                        ll = new Object[stringArray.length];
                        II = new IlIIIllI(StringFactory.IIII("Silent"));
                        Il = new IlIIIllI(StringFactory.IIII("Legit"));
                        I = IlIIIllI.I();
                        return;
                    }
                }
                c = cArray[n6];
                cArray2 = string.substring(n5, n5 + c).toCharArray();
                n3 = 0;
            }
            switch (n3 % 5) {
                default: {
                    n4 = 73;
                    continue block6;
                }
                case 4: {
                    n4 = 4;
                    continue block6;
                }
                case 3: {
                    n4 = 114;
                    continue block6;
                }
                case 2: {
                    n4 = 26;
                    continue block6;
                }
                case 1: 
            }
            n4 = 102;
        }
    }

    public static IlIIIllI[] values() {
        return (IlIIIllI[])I.clone();
    }

    private IlIIIllI(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    public static IlIIIllI valueOf(String string) {
        return Enum.valueOf(IlIIIllI.class, string);
    }

    private static /* synthetic */ IlIIIllI[] I() {
        return new IlIIIllI[]{II, Il};
    }

    public String toString() {
        return this.l.IIII();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String l(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x640C38F;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIIllI.ll[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x844DF374;
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
                case 21: {
                    n6 = 228;
                    continue block33;
                }
                case 18: {
                    n6 = 252;
                    continue block33;
                }
                case 17: {
                    n6 = 235;
                    continue block33;
                }
                case 14: {
                    n6 = 141;
                    continue block33;
                }
                case 23: {
                    n6 = 194;
                    continue block33;
                }
                case 1: {
                    n6 = 183;
                    continue block33;
                }
                case 28: {
                    n6 = 162;
                    continue block33;
                }
                case 11: {
                    n6 = 63;
                    continue block33;
                }
                case 12: {
                    n6 = 22;
                    continue block33;
                }
                case 24: {
                    n6 = 57;
                    continue block33;
                }
                case 16: {
                    n6 = 237;
                    continue block33;
                }
                case 4: {
                    n6 = 130;
                    continue block33;
                }
                case 3: {
                    n6 = 124;
                    continue block33;
                }
                case 25: {
                    n6 = 217;
                    continue block33;
                }
                case 29: {
                    n6 = 173;
                    continue block33;
                }
                case 27: {
                    n6 = 156;
                    continue block33;
                }
                case 20: {
                    n6 = 3;
                    continue block33;
                }
                case 13: {
                    n6 = 223;
                    continue block33;
                }
                case 6: {
                    n6 = 253;
                    continue block33;
                }
                case 26: {
                    n6 = 59;
                    continue block33;
                }
                case 31: {
                    n6 = 16;
                    continue block33;
                }
                case 19: {
                    n6 = 126;
                    continue block33;
                }
                case 30: {
                    n6 = 189;
                    continue block33;
                }
                case 5: {
                    n6 = 210;
                    continue block33;
                }
                case 2: {
                    n6 = 168;
                    continue block33;
                }
                case 8: {
                    n6 = 14;
                    continue block33;
                }
                case 10: {
                    n6 = 215;
                    continue block33;
                }
                case 7: {
                    n6 = 7;
                    continue block33;
                }
                default: {
                    n6 = 106;
                    continue block33;
                }
                case 22: {
                    n6 = 108;
                    continue block33;
                }
                case 15: {
                    n6 = 151;
                    continue block33;
                }
                case 9: 
            }
            n6 = 91;
        }
    }
}

