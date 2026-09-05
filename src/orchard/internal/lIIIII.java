/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Distance
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
public final class lIIIII
extends Enum<lIIIII> {
    public static final /* enum */ lIIIII I;
    private final IIIlIIIII l;
    private static final /* synthetic */ lIIIII[] II;
    private static final String[] Il;
    private static final Object[] lI;

    public IIIlIIIII I() {
        return this.l;
    }

    public static lIIIII valueOf(String string) {
        return Enum.valueOf(lIIIII.class, string);
    }

    private static /* synthetic */ lIIIII[] l() {
        return new lIIIII[]{I};
    }

    public String toString() {
        return this.l.IIII();
    }

    private lIIIII(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    public static lIIIII[] values() {
        return (lIIIII[])II.clone();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 20318;
        String string = "\u0614\u0636\u0620\u0612\u060f\u0646\u068d\u063f\u6223\u6230\u6247\u620b\u6222\u624f\u62a3\u6225\u626e\u6208\u623b\u629b";
        char[] cArray = "\u4f56\u4f52".toCharArray();
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
        Il = stringArray;
        lI = new Object[stringArray.length];
        I = new lIIIII(StringFactory.IIII("Distance"));
        II = lIIIII.l();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x2EBC2140;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIIIII.lI[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5A7FE064;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 30: {
                    n6 = 64;
                    continue block33;
                }
                case 27: {
                    n6 = 51;
                    continue block33;
                }
                case 31: {
                    n6 = 181;
                    continue block33;
                }
                case 11: {
                    n6 = 22;
                    continue block33;
                }
                case 19: {
                    n6 = 131;
                    continue block33;
                }
                case 26: {
                    n6 = 245;
                    continue block33;
                }
                case 25: {
                    n6 = 153;
                    continue block33;
                }
                case 13: {
                    n6 = 71;
                    continue block33;
                }
                case 10: {
                    n6 = 224;
                    continue block33;
                }
                case 1: {
                    n6 = 202;
                    continue block33;
                }
                case 20: {
                    n6 = 88;
                    continue block33;
                }
                case 5: {
                    n6 = 189;
                    continue block33;
                }
                case 14: {
                    n6 = 105;
                    continue block33;
                }
                case 16: {
                    n6 = 194;
                    continue block33;
                }
                case 8: {
                    n6 = 139;
                    continue block33;
                }
                case 18: {
                    n6 = 127;
                    continue block33;
                }
                case 21: {
                    n6 = 180;
                    continue block33;
                }
                case 3: {
                    n6 = 243;
                    continue block33;
                }
                case 17: {
                    n6 = 56;
                    continue block33;
                }
                case 22: {
                    n6 = 115;
                    continue block33;
                }
                case 28: {
                    n6 = 143;
                    continue block33;
                }
                case 6: {
                    n6 = 123;
                    continue block33;
                }
                case 7: {
                    n6 = 207;
                    continue block33;
                }
                case 24: {
                    n6 = 62;
                    continue block33;
                }
                default: {
                    n6 = 229;
                    continue block33;
                }
                case 4: {
                    n6 = 251;
                    continue block33;
                }
                case 23: {
                    n6 = 159;
                    continue block33;
                }
                case 12: {
                    n6 = 248;
                    continue block33;
                }
                case 2: {
                    n6 = 198;
                    continue block33;
                }
                case 29: {
                    n6 = 242;
                    continue block33;
                }
                case 15: {
                    n6 = 242;
                    continue block33;
                }
                case 9: 
            }
            n6 = 192;
        }
        return new String(cArray).intern();
    }
}

