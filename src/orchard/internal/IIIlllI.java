/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Normal
 *   - Legit
 *   - Off
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
final class IIIlllI
extends Enum<IIIlllI> {
    private final IIIlIIIII I;
    public static final /* enum */ IIIlllI l;
    public static final /* enum */ IIIlllI II;
    private static final /* synthetic */ IIIlllI[] Il;
    public static final /* enum */ IIIlllI lI;
    private static String[] ll;
    private static final int[] III;
    private static final String[] IIl;
    private static final Object[] IlI;

    public static IIIlllI I(String string) {
        return Enum.valueOf(IIIlllI.class, string);
    }

    private IIIlllI(String string2) {
        this.I = StringFactory.lIl(string2);
    }

    public static IIIlllI[] values() {
        return (IIIlllI[])Il.clone();
    }

    public String toString() {
        return this.I.IIII();
    }

    private static /* synthetic */ IIIlllI[] l() {
        return new IIIlllI[]{lI, l, II};
    }

    private static void II() {
        IIIlllI.ll[0] = IIIlllI.Il(IIIlllI.ll(-183882041, '\u92e0', (short)13729).toCharArray(), 3290L, -1875566926);
        IIIlllI.ll[1] = IIIlllI.Il(IIIlllI.ll(-1855634289, '\u92e1', (short)2971).toCharArray(), 25037L, -1172160576);
        IIIlllI.ll[2] = IIIlllI.Il(IIIlllI.ll(1591225867, '\u92e2', (short)43519).toCharArray(), 40002L, -1733249972);
        IIIlllI.ll[3] = IIIlllI.Il(IIIlllI.ll(1988896420, '\u92e3', (short)25121).toCharArray(), 8063L, 2027835297);
        IIIlllI.ll[4] = IIIlllI.Il(IIIlllI.ll(129593503, '\u92e4', (short)33328).toCharArray(), 62377L, 341282985);
        IIIlllI.ll[5] = IIIlllI.Il(IIIlllI.ll(715408592, '\u92e5', (short)22890).toCharArray(), 94750L, -76099957);
    }

    private static String Il(char[] cArray, long l2, int n) {
        int n2 = 0x3D23C8E8 ^ n;
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

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 24775;
        String string = "\uba74\u16a6\ua7f6\ua65e\ubaec\uffc4\uf68e\uce66\ufba1\u7a92\u88b9\u711e\u3d32\ud8d4\udd20\u8082\u2220\u890c\u295a\ud0d3\u8a3f\ud1a6\ud6c2\u05fd\u8082\uc38c\u4a76\ue9f4\u6685\u15af\u5ee4\u84fa\u7b25\u4722";
        char[] cArray = "\u60c3\u60c4\u60cf\u60c1\u60c2\u60cf".toCharArray();
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
        int n6 = -1342743043;
        byte[] byArray = "\u00af_\u0080M5\u00d2\u00b6\u00b2\u0083\u0090\u000f$!N\u009e\u00b3\u00c0\u00c0\t\u00e4A$\u0015\u0094\u0099\u0002D\u00112Rp\u00fa\u00f4\u00ebR\"".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        III = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            IIIlllI.III[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        ll = new String[6];
        IIIlllI.II();
        lI = new IIIlllI("Off");
        l = new IIIlllI("Normal");
        II = new IIIlllI("Legit");
        Il = IIIlllI.l();
    }

    private static int lI(int n, int n2) {
        return III[n ^ 0x50112137] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x92E0;
        char[] cArray = IIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlI[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIlllI.IlI[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x170D;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xF899;
            n6 -= 27409;
            n6 += 21933;
            n6 += 44700;
            n6 ^= 0x6336;
            cArray[n5] = (char)((n6 -= 170) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

