/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIllIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
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

@Environment(value=EnvType.CLIENT)
final class IlIllIl
extends Enum<IlIllIl> {
    public static final /* enum */ IlIllIl I;
    public static final /* enum */ IlIllIl l;
    private static final /* synthetic */ IlIllIl[] II;
    public static final /* enum */ IlIllIl Il;
    private static String[] lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    public static IlIllIl I(String string) {
        return Enum.valueOf(IlIllIl.class, string);
    }

    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0xC5F231A8 ^ n;
        int n3 = 0;
        while (n3 < cArray.length) {
            n2 = n2 ^ (int)l2 ^ ~n3;
            n2 ^= n - n3 * cArray.length;
            n2 = -n2 * n | n3;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            int n4 = n3 & 0xFF;
            n = n << n4 | n >>> -n4;
            l2 ^= (long)n4;
            ++n3;
        }
        return new String(cArray);
    }

    public static IlIllIl[] values() {
        return (IlIllIl[])II.clone();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 19452;
        String string = "\u8075\u0e27\u2470\ue890\u01d4\u67a3\uf81d\u69a7\u99d4\u036c\uea1a\ub305\u1a29\ubd11\u7977\ue5e1\ufd5e\ub437\ud6bc\u1195\u557c\u433b\u1542\u1e5e";
        char[] cArray = "\u4bf5\u4bf7\u4bf8".toCharArray();
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
        III = stringArray;
        IIl = new Object[stringArray.length];
        int n6 = -2052610978;
        byte[] byArray = "\u00b3\u00a6\u00c4\u00b1\u00eb\fu\u00ea{W\u00c3\u00c3N\u00bc\u0090\\\u00fa\u0096\u0093\u0000".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        ll = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            IlIllIl.ll[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        lI = new String[3];
        IlIllIl.II();
        I = new IlIllIl();
        l = new IlIllIl();
        Il = new IlIllIl();
        II = IlIllIl.Il();
    }

    private static void II() {
        IlIllIl.lI[0] = IlIllIl.l(IlIllIl.ll('\u1eac', (short)50740, 1139501937).toCharArray(), 88812L, 1917156985);
        IlIllIl.lI[1] = IlIllIl.l(IlIllIl.ll('\u1ead', (short)22852, 1419655880).toCharArray(), 13146L, 1396720331);
        IlIllIl.lI[2] = IlIllIl.l(IlIllIl.ll('\u1eae', (short)47888, -861926665).toCharArray(), 52892L, 158280481);
    }

    private static /* synthetic */ IlIllIl[] Il() {
        return new IlIllIl[]{I, l, Il};
    }

    private static int lI(int n, int n2) {
        return ll[n ^ 0x54A983F4] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(char c, short s, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x1EAC;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIllIl.IIl[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6C72;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x6DE5;
            n6 ^= 0xA016;
            n6 -= 41371;
            n6 -= 27661;
            n6 ^= 0xDE59;
            n6 += 4220;
            n6 ^= 0x4D3C;
            cArray[n5] = (char)((n6 ^= 0xB7DF) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

