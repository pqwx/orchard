/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllI
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
final class lllI
extends Enum<lllI> {
    public static final /* enum */ lllI I;
    public static final /* enum */ lllI l;
    private static String[] II;
    private static final /* synthetic */ lllI[] Il;
    private static final int[] lI;
    private static final String[] ll;
    private static final Object[] III;

    private static /* synthetic */ lllI[] I() {
        return new lllI[]{l, I};
    }

    public static lllI[] values() {
        return (lllI[])Il.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 8385;
        String string = "\u8466\ucdc6\u1485\u92bb\u0ab3\u11a7\ud2b6\uf836\u5bce\u6e26\u149c";
        char[] cArray = "\u20c4\u20c7".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 != 0) {
                do {
                    n5 = cArray[n3] ^ n;
                    stringArray[n3] = string.substring(n4, n4 + n5);
                    n4 += n5;
                } while (++n3 < cArray.length);
            } else {
                ll = stringArray;
                III = new Object[stringArray.length];
                int n6 = -216355831;
                byte[] byArray = "\u00df\u0015[\u00f3\u00b1\u00b7\u00d9'\u00c5\u00d5?\u0095v\u00bb\u0000\u007f".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                lI = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    lllI.lI[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                II = new String[2];
                lllI.Il();
                l = new lllI();
                I = new lllI();
                Il = lllI.I();
                return;
            }
            n2 = 0;
        }
    }

    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0x93BE1F1A ^ n;
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

    public static lllI II(String string) {
        return Enum.valueOf(lllI.class, string);
    }

    private static void Il() {
        lllI.II[0] = lllI.l(lllI.ll(-1906151513, -510765510).toCharArray(), 67161L, -365476577);
        lllI.II[1] = lllI.l(lllI.ll(-1906151514, -556587730).toCharArray(), 90593L, -1437751400);
    }

    private static int lI(int n, int n2) {
        return lI[n ^ 0xAB7637E5] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x8E626FA7;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lllI.III[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3CA1144F;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 3 -> 216;
                case 11 -> 72;
                case 9 -> 67;
                case 20 -> 218;
                case 23 -> 189;
                case 25 -> 230;
                case 27 -> 240;
                case 5 -> 1;
                case 15 -> 75;
                case 28 -> 48;
                case 29 -> 174;
                case 14 -> 92;
                case 18 -> 16;
                case 7 -> 56;
                case 12 -> 80;
                case 31 -> 205;
                case 22 -> 156;
                case 4 -> 231;
                case 24 -> 50;
                case 1 -> 44;
                case 10 -> 211;
                case 6 -> 104;
                case 8 -> 116;
                case 19 -> 145;
                case 13 -> 251;
                case 21 -> 182;
                case 16 -> 227;
                case 17 -> 163;
                default -> 205;
                case 2 -> 176;
                case 26 -> 147;
                case 30 -> 110;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

