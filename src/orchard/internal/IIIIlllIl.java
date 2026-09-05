/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIlllIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Feather
 *   - Fabric
 *   - Lunar
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
public final class IIIIlllIl
extends Enum<IIIIlllIl> {
    public static final /* enum */ IIIIlllIl I;
    public static final /* enum */ IIIIlllIl l;
    private static String[] II;
    private static final /* synthetic */ IIIIlllIl[] Il;
    public static final /* enum */ IIIIlllIl lI;
    private final String ll;
    private static final int[] III;
    private static final String[] IIl;
    private static final Object[] IlI;

    public static IIIIlllIl[] values() {
        return (IIIIlllIl[])Il.clone();
    }

    private static void I() {
        IIIIlllIl.II[0] = IIIIlllIl.Il(IIIIlllIl.III((short)61162, 1957722041, '\u759d').toCharArray(), 4520L, 809846512);
        IIIIlllIl.II[1] = IIIIlllIl.Il(IIIIlllIl.III((short)25790, 1764650637, '\u759c').toCharArray(), 20702L, 261747611);
        IIIIlllIl.II[2] = IIIIlllIl.Il(IIIIlllIl.III((short)16990, 1256271349, '\u759f').toCharArray(), 4796L, 1484605441);
        IIIIlllIl.II[3] = IIIIlllIl.Il(IIIIlllIl.III((short)52009, 1488863824, '\u759e').toCharArray(), 82124L, 766540034);
        IIIIlllIl.II[4] = IIIIlllIl.Il(IIIIlllIl.III((short)47105, -1270260253, '\u7599').toCharArray(), 70334L, -2008468973);
        IIIIlllIl.II[5] = IIIIlllIl.Il(IIIIlllIl.III((short)4035, 925255527, '\u7598').toCharArray(), 52199L, 1056254791);
    }

    public static IIIIlllIl l(String string) {
        return Enum.valueOf(IIIIlllIl.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 11408;
        String string = "\u1b1a\ue0dc\u07ed\u9a1d\u0cb4\ufef0\u3ebc\u9119\ufa34\ub00a\uc838\u8fa3\uf53e\u1072\ub4b3\uaa90\u7b98\u2f26\u65b3\uba67\udfd4\uad25\u14ca\u9b59\u70a7\ucb6b\u9b1f\ueee0\u66ad\u5207\uf2f3\u0fa7\u1e26\u9fc6\ud744\ud523\u87b2\ubbf8\u9e01\u46ab\ub899\ubfb3\uc56b\uc2f7\u82ce\u8393";
        char[] cArray = "\u2c97\u2c95\u2c9c\u2c96\u2c98\u2c98".toCharArray();
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
        int n6 = -29689722;
        byte[] byArray = "q&@\f\u00dd\u00ae\u00a8&\u0001\u00b9\u00f3\u00bf\u00db\u0089\u0007\u00a3\u00c8b,\u0090\u00b1\u00b4\u00b0c\u00f8kX\u00cb\u0080\u00a8dR\u00bduy\u00d5".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        III = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            IIIIlllIl.III[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        II = new String[6];
        IIIIlllIl.I();
        I = new IIIIlllIl("Fabric");
        l = new IIIIlllIl("Feather");
        lI = new IIIIlllIl("Lunar");
        Il = IIIIlllIl.lI();
    }

    public String II() {
        return this.ll;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Il(char[] cArray, long l2, int n) {
        int n2 = 0xE6A00A3C ^ n;
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

    private static /* synthetic */ IIIIlllIl[] lI() {
        return new IIIIlllIl[]{I, l, lI};
    }

    private IIIIlllIl(String string2) {
        this.ll = string2;
    }

    private static int ll(int n, int n2) {
        return III[n ^ 0xEA4F9ECB] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String III(short s, int n, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x759D;
        char[] cArray = IIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlI[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIlllIl.IlI[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x23F9;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 53187;
            n6 -= 46476;
            n6 += 20855;
            n6 += 22049;
            cArray[n5] = (char)((n6 ^= 0x29FB) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

