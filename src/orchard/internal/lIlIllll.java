/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIllll
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
final class lIlIllll
extends Enum<lIlIllll> {
    public static final /* enum */ lIlIllll I;
    private static String[] l;
    private static final /* synthetic */ lIlIllll[] II;
    public static final /* enum */ lIlIllll Il;
    public static final /* enum */ lIlIllll lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 4607;
        String string = "\uc04f\u83c7\u17a3\u8abc\uf1ee\ufbde\u5792\u3616\ud4ed\u5dca\u207e\u0b69";
        char[] cArray = "\u11fa\u11fc\u11fb".toCharArray();
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
        III = stringArray;
        IIl = new Object[stringArray.length];
        int n6 = 1701920673;
        byte[] byArray = "\\\u00bc*\n\u008e\u00b8\u00da\u0094z\u00deK\u00fc\u008e\u00d1\u0001V\u00a4\u00ecl\u009c".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        ll = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            lIlIllll.ll[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        l = new String[3];
        lIlIllll.I();
        I = new lIlIllll();
        Il = new lIlIllll();
        lI = new lIlIllll();
        II = lIlIllll.II();
    }

    public static lIlIllll[] values() {
        return (lIlIllll[])II.clone();
    }

    private static void I() {
        lIlIllll.l[0] = lIlIllll.Il(lIlIllll.ll(-1715513825, '\u8709', '\uedfc').toCharArray(), 54998L, 1691757170);
        lIlIllll.l[1] = lIlIllll.Il(lIlIllll.ll(993724284, '\u8708', '\uf810').toCharArray(), 93453L, 249668966);
        lIlIllll.l[2] = lIlIllll.Il(lIlIllll.ll(50879550, '\u870b', '\ub965').toCharArray(), 71931L, 2057536852);
    }

    public static lIlIllll l(String string) {
        return Enum.valueOf(lIlIllll.class, string);
    }

    private static /* synthetic */ lIlIllll[] II() {
        return new lIlIllll[]{I, Il, lI};
    }

    private static String Il(char[] cArray, long l2, int n) {
        int n2 = 0x5FC40465 ^ n;
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

    private static int lI(int n, int n2) {
        return ll[n ^ 0xC3570DAA] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, char c, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x8709;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIlIllll.IIl[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6C8A;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 6272;
            n6 -= 11087;
            n6 ^= 0xFA2D;
            n6 += 8913;
            n6 -= 29375;
            n6 -= 42532;
            n6 -= 27361;
            n6 ^= 0x782D;
            cArray[n5] = (char)((n6 -= 40800) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

