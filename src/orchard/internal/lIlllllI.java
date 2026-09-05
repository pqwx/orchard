/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlllllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Ground
 *   - Both
 *   - Air
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
public final class lIlllllI
extends Enum<lIlllllI> {
    private final IIIlIIIII I;
    private static String[] l;
    public static final /* enum */ lIlllllI II;
    private static final /* synthetic */ lIlllllI[] Il;
    public static final /* enum */ lIlllllI lI;
    public static final /* enum */ lIlllllI ll;
    private static final int[] III;
    private static final String[] IIl;
    private static final Object[] IlI;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 2793;
        String string = "\u72f8\u32a3\u0c5b\u8210\u5948\u15e2\u2448\u1ee8\u1208\ue6a0\udb73\ub985\u6d99\u7620\u3a76\uf3e7\ub192\u6255\ua2c0\u6aa3\u2a84\u466f\ub520\u0fd8\u21e8\u0718\u9534\u949c\ud337\u3855\u9673\u1a8f\u8aae";
        char[] cArray = "\u0ae1\u0aef\u0ae1\u0aea\u0aed\u0aed".toCharArray();
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
        IIl = stringArray;
        IlI = new Object[stringArray.length];
        int n6 = 603322233;
        byte[] byArray = "\u00c1\u001a:\u00bf=\u0018D\u00b1\u0017\u00f7\u0099\u00bf\u00e7\u00a3\u001e\u0080\u0018\u0093\u00bc\u00de\u00dd\u0090\u00c4|\u00dcO\u00e6 \u00956\u00fb\u00b8\u0080mQ\u0095".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        III = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            lIlllllI.III[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        l = new String[6];
        lIlllllI.l();
        II = new lIlllllI("Both");
        lI = new lIlllllI("Air");
        ll = new lIlllllI("Ground");
        Il = lIlllllI.Il();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0xB6577CA1 ^ n;
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

    public static lIlllllI[] values() {
        return (lIlllllI[])Il.clone();
    }

    private static void l() {
        lIlllllI.l[0] = lIlllllI.I(lIlllllI.ll(11470, 2059162437, '\uca78').toCharArray(), 45053L, -128517461);
        lIlllllI.l[1] = lIlllllI.I(lIlllllI.ll(11471, 1021999944, '\u1dbd').toCharArray(), 14761L, -733921346);
        lIlllllI.l[2] = lIlllllI.I(lIlllllI.ll(11468, -1398137259, '\uc3b2').toCharArray(), 97516L, 2001975159);
        lIlllllI.l[3] = lIlllllI.I(lIlllllI.ll(11469, -757324690, '\u016a').toCharArray(), 64061L, 574205733);
        lIlllllI.l[4] = lIlllllI.I(lIlllllI.ll(11466, -2130159609, '\u7db4').toCharArray(), 70044L, 733211560);
        lIlllllI.l[5] = lIlllllI.I(lIlllllI.ll(11467, -80523553, '\ub2e7').toCharArray(), 71686L, -1906774908);
    }

    public static lIlllllI II(String string) {
        return Enum.valueOf(lIlllllI.class, string);
    }

    private static /* synthetic */ lIlllllI[] Il() {
        return new lIlllllI[]{II, lI, ll};
    }

    private lIlllllI(String string2) {
        this.I = StringFactory.lIl(string2);
    }

    public String toString() {
        return this.I.IIII();
    }

    private static int lI(int n, int n2) {
        return III[n ^ 0xCEDBDAAD] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x2CCE;
        char[] cArray = IIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIlllllI.IlI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x783A;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 58986;
            n7 -= 59737;
            n7 += 19577;
            n7 ^= 0xD05;
            n7 += 57008;
            n7 += 37946;
            n7 -= 31168;
            cArray[n6] = (char)((n7 += 23057) ^ n4 ^ c ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

