/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Refills used potions from inventory.
 *   - Pot Refill
 *   - .getBytes(
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
import orchard.internal.IIIlIIll;
import orchard.internal.lIlIllll;

@Environment(value=EnvType.CLIENT)
public final class IIIl
extends IIIlIIll {
    private static String[] I;
    private static final int[] lIIl;
    private static final String[] lIll;
    private static final Object[] llII;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 25813;
        String string = "\u3bac\u4726\u3059\u1392\u8ef3\u7615\u2510\ubf37\ufeb2\ueb02\u2fc7\u71ce\u09ff\u932b\u2a97\ubfc0\u3bf1\u92b6\u1f0e\u14fb\u8793\u0a0d\uf8f2\u033d\u1945\u0bea\u323d\u50a6\u5007\uc0d8\ude75\uf8d2\u5fc5\u1cef\ud54f\u6dca\u4179\ufab7\u2fd1\ud962\ue513\u95e8\ub64e\ue3c5\uecf2\uc135\uef14\u0d77\u1735\u336e\ub735\uaabe\udc78\u7d72\u77cc\u59e0\ud0b7\u802b\u82ea\u10ad\ucdad\ucdf9\u221c\u90ef";
        char[] cArray = "\u64e5\u64c5".toCharArray();
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
        lIll = stringArray;
        llII = new Object[stringArray.length];
        int n6 = 418736039;
        byte[] byArray = "\u00f7\u00f3\u00d5\u00b6\u00ae\u00ba\u00d47+\u00af4T\u00e8^\u00b3D".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        lIIl = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            IIIl.lIIl[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        I = new String[2];
        IIIl.lIIll();
    }

    public IIIl() {
        super((Object)StringFactory.IIII("Pot Refill"), StringFactory.IIII("Refills used potions from inventory."), lIlIllll.I, false);
    }

    private static String lIIlI(char[] cArray, long l2, int n) {
        int n2 = 0xB5DB26BF ^ n;
        for (int i = 0; i < cArray.length; ++i) {
            n2 = n2 ^ (int)l2 ^ ~i;
            n2 ^= n - i * cArray.length;
            n2 = -n2 * n | i;
            cArray[i] = (char)(cArray[i] ^ n2);
            int n3 = i & 0xFF;
            n = n << n3 | n >>> -n3;
            l2 ^= (long)n3;
        }
        return new String(cArray);
    }

    private static void lIIll() {
        IIIl.I[0] = IIIl.lIIlI(IIIl.lIllI(-1429921833, -1422361661).toCharArray(), 6205L, 1537063111);
        IIIl.I[1] = IIIl.lIIlI(IIIl.lIllI(-1429921834, 1754139129).toCharArray(), 41430L, 1239539369);
    }

    private static int lIlII(int n, int n2) {
        return lIIl[n ^ 0xF3DE5FE3] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lIllI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xAAC51FD7;
        char[] cArray = lIll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llII[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIl.llII[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xCAA238AD;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 17: {
                    n6 = 171;
                    continue block33;
                }
                case 21: {
                    n6 = 246;
                    continue block33;
                }
                case 2: {
                    n6 = 37;
                    continue block33;
                }
                case 22: {
                    n6 = 246;
                    continue block33;
                }
                case 10: {
                    n6 = 33;
                    continue block33;
                }
                case 28: {
                    n6 = 120;
                    continue block33;
                }
                case 15: {
                    n6 = 175;
                    continue block33;
                }
                case 4: {
                    n6 = 237;
                    continue block33;
                }
                case 30: {
                    n6 = 247;
                    continue block33;
                }
                case 31: {
                    n6 = 13;
                    continue block33;
                }
                case 5: {
                    n6 = 148;
                    continue block33;
                }
                case 6: {
                    n6 = 236;
                    continue block33;
                }
                case 3: {
                    n6 = 210;
                    continue block33;
                }
                case 9: {
                    n6 = 184;
                    continue block33;
                }
                default: {
                    n6 = 124;
                    continue block33;
                }
                case 13: {
                    n6 = 151;
                    continue block33;
                }
                case 11: {
                    n6 = 198;
                    continue block33;
                }
                case 14: {
                    n6 = 109;
                    continue block33;
                }
                case 1: {
                    n6 = 155;
                    continue block33;
                }
                case 19: {
                    n6 = 42;
                    continue block33;
                }
                case 7: {
                    n6 = 54;
                    continue block33;
                }
                case 18: {
                    n6 = 213;
                    continue block33;
                }
                case 20: {
                    n6 = 58;
                    continue block33;
                }
                case 26: {
                    n6 = 75;
                    continue block33;
                }
                case 12: {
                    n6 = 192;
                    continue block33;
                }
                case 29: {
                    n6 = 134;
                    continue block33;
                }
                case 23: {
                    n6 = 116;
                    continue block33;
                }
                case 16: {
                    n6 = 41;
                    continue block33;
                }
                case 24: {
                    n6 = 120;
                    continue block33;
                }
                case 25: {
                    n6 = 44;
                    continue block33;
                }
                case 27: {
                    n6 = 211;
                    continue block33;
                }
                case 8: 
            }
            n6 = 43;
        }
        return new String(cArray).intern();
    }
}

