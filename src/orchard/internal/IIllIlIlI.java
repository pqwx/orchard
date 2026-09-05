/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIlIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Right
 *   - Left
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
public final class IIllIlIlI
extends Enum<IIllIlIlI> {
    public static final /* enum */ IIllIlIlI I;
    private static String[] l;
    public static final /* enum */ IIllIlIlI II;
    private static final /* synthetic */ IIllIlIlI[] Il;
    private final IIIlIIIII lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    public static IIllIlIlI I(String string) {
        return Enum.valueOf(IIllIlIlI.class, string);
    }

    public String toString() {
        return this.lI.IIII();
    }

    private static /* synthetic */ IIllIlIlI[] l() {
        return new IIllIlIlI[]{I, II};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 29875;
        String string = "\u969f\u7588\u9404\uc66f\ub9d4\ub1d9\u3e39\u4b03\u0f7e\uf593\u735a\u234f\u94cf\u735c\u6e84\u430c\ufe53\u20d5\u5ca1\ua6bf\u6b31\u41eb\u8e42\u1d14\u118a";
        char[] cArray = "\u74bb\u74b7\u74b6\u74bb".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
        III = stringArray;
        IIl = new Object[stringArray.length];
        int n6 = 1774020517;
        byte[] byArray = "\u00a7\u00a0\u00d0\u00d8'\u00caE\u0083\u00c0\u00ef\u00b3B\u00df\u00c6\u0014\u00cb\u0081\u0006*\u00f9\u00ad\u00c9\u00be\u00e7".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        ll = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            IIllIlIlI.ll[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        l = new String[4];
        IIllIlIlI.Il();
        I = new IIllIlIlI("Left");
        II = new IIllIlIlI("Right");
        Il = IIllIlIlI.l();
    }

    public static IIllIlIlI[] values() {
        return (IIllIlIlI[])Il.clone();
    }

    private IIllIlIlI(String string2) {
        this.lI = StringFactory.lIl(string2);
    }

    private static String II(char[] cArray, long l2, int n) {
        int n2 = 0x73948130 ^ n;
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

    private static void Il() {
        IIllIlIlI.l[0] = IIllIlIlI.II(IIllIlIlI.ll(1620370273, -1531495103).toCharArray(), 85601L, -1086389906);
        IIllIlIlI.l[1] = IIllIlIlI.II(IIllIlIlI.ll(1620370272, -1585495215).toCharArray(), 10157L, 1840976940);
        IIllIlIlI.l[2] = IIllIlIlI.II(IIllIlIlI.ll(1620370275, 1311779755).toCharArray(), 23885L, 1281427228);
        IIllIlIlI.l[3] = IIllIlIlI.II(IIllIlIlI.ll(1620370274, 46036408).toCharArray(), 60946L, -978546882);
    }

    private static int lI(int n, int n2) {
        return ll[n ^ 0x5D1A9EC1] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x6094E361;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIllIlIlI.IIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xB3C41FE4;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 27 -> 244;
                case 6 -> 240;
                case 31 -> 92;
                case 20 -> 149;
                case 30 -> 187;
                case 24 -> 98;
                case 5 -> 179;
                case 19 -> 36;
                case 29 -> 53;
                case 25 -> 159;
                case 22 -> 154;
                case 10 -> 145;
                case 1 -> 125;
                default -> 12;
                case 4 -> 208;
                case 23 -> 252;
                case 9 -> 190;
                case 17 -> 206;
                case 14 -> 24;
                case 28 -> 208;
                case 16 -> 171;
                case 13 -> 105;
                case 7 -> 199;
                case 8 -> 161;
                case 12 -> 147;
                case 3 -> 38;
                case 18 -> 143;
                case 15 -> 212;
                case 2 -> 104;
                case 26 -> 60;
                case 11 -> 107;
                case 21 -> 197;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

