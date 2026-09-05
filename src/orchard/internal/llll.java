/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llll
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
final class llll
extends Enum<llll> {
    public static final /* enum */ llll I;
    public static final /* enum */ llll l;
    private static String[] II;
    private static final /* synthetic */ llll[] Il;
    public static final /* enum */ llll lI;
    public static final /* enum */ llll ll;
    public static final /* enum */ llll III;
    private static final int[] IIl;
    private static final String[] IlI;
    private static final Object[] Ill;

    public static llll[] values() {
        return (llll[])Il.clone();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 4809;
        String string = "\ubf69\ua081\u5566\u02f1\ue349\ub14e\u81c8\uf7e0\u2578\uaa82\u48d6\ucf0c\u0f47\u6414\u7e4c\u62fc\u47ca\ue37a\ue2af\u1a8c\ucc6b\ua8df\u7acb\uff35\u17e7\u69a7\u46f3\u7702\ud4df\u96f8\u90a0\u2f25\ue769";
        char[] cArray = "\u12cf\u12c5\u12cf\u12cc\u12cd".toCharArray();
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
        IlI = stringArray;
        Ill = new Object[stringArray.length];
        int n6 = 124637896;
        byte[] byArray = "\u00fc&:\u00bb\u0088\u00bb\u00e6\u0094cA\u00db\u00f9\u00e4\u00c6\u0000Y\u008b\u00a69\u0087$w\u00bf\u00d4\u00cb{W\u0090".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IIl = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            llll.IIl[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        II = new String[5];
        llll.Il();
        l = new llll();
        ll = new llll();
        lI = new llll();
        I = new llll();
        III = new llll();
        Il = llll.l();
    }

    public static llll I(String string) {
        return Enum.valueOf(llll.class, string);
    }

    private static /* synthetic */ llll[] l() {
        return new llll[]{l, ll, lI, I, III};
    }

    private static String II(char[] cArray, long l2, int n) {
        int n2 = 0x83DAACED ^ n;
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

    private static void Il() {
        llll.II[0] = llll.II(llll.ll(592799092, (short)39513, '\u1df1').toCharArray(), 1322L, 2111507193);
        llll.II[1] = llll.II(llll.ll(-1973609722, (short)65430, '\u1df0').toCharArray(), 80593L, -1899572904);
        llll.II[2] = llll.II(llll.ll(1783043327, (short)53538, '\u1df3').toCharArray(), 47996L, -1818967832);
        llll.II[3] = llll.II(llll.ll(1900620360, (short)14220, '\u1df2').toCharArray(), 9265L, 262055367);
        llll.II[4] = llll.II(llll.ll(997723554, (short)5650, '\u1df5').toCharArray(), 64052L, 1259743150);
    }

    private static int lI(int n, int n2) {
        return IIl[n ^ 0x4F19DF7D] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, short s, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x1DF1;
        char[] cArray = IlI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Ill[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llll.Ill[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5C1E;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 53767;
            n6 -= 31676;
            n6 ^= 0xC3EA;
            n6 -= 27500;
            cArray[n5] = (char)((n6 -= 26150) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

