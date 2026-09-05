/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIlIll
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
import orchard.core.StringFactory;
import orchard.internal.III;
import orchard.internal.IIIlIIIII;
import orchard.internal.llIIllI;
import orchard.internal.llIllll;

@Environment(value=EnvType.CLIENT)
public abstract sealed class IlIIlIll
extends Enum<IlIIlIll>
permits llIllll, III, llIIllI {
    private static final /* synthetic */ IlIIlIll[] I;
    private static String[] l;
    private final IIIlIIIII II;
    public static final /* enum */ IlIIlIll Il;
    public static final /* enum */ IlIIlIll lI;
    public static final /* enum */ IlIIlIll ll;
    private static final int[] III;
    private static final String[] IIl;
    private static final Object[] IlI;

    private static void II() {
        IlIIlIll.l[0] = IlIIlIll.Il(IlIIlIll.IIl(-1589951534, '\u93db', (short)7974).toCharArray(), 52408L, IlIIlIll.III(1972881626, -2099583459));
        IlIIlIll.l[1] = IlIIlIll.Il(IlIIlIll.IIl(-179040079, '\u93da', (short)47613).toCharArray(), 42933L, IlIIlIll.III(1972881627, 1651160124));
        IlIIlIll.l[2] = IlIIlIll.Il(IlIIlIll.IIl(1933785993, '\u93d9', (short)33451).toCharArray(), 19036L, IlIIlIll.III(1972881624, 344867321));
        IlIIlIll.l[3] = IlIIlIll.Il(IlIIlIll.IIl(-997775718, '\u93d8', (short)56840).toCharArray(), 67856L, IlIIlIll.III(1972881625, -1644283947));
        IlIIlIll.l[4] = IlIIlIll.Il(IlIIlIll.IIl(-921489184, '\u93df', (short)20863).toCharArray(), 93617L, IlIIlIll.III(1972881630, 1489294336));
        IlIIlIll.l[5] = IlIIlIll.Il(IlIIlIll.IIl(-1183505854, '\u93de', (short)56893).toCharArray(), 51734L, IlIIlIll.III(1972881631, 1712468871));
    }

    private static String Il(char[] cArray, long l2, int n) {
        int n2 = IlIIlIll.III(1972881628, -1531090851) ^ n;
        int n3 = 0;
        while (n3 < cArray.length) {
            n2 = n2 ^ (int)l2 ^ ~n3;
            n2 ^= n - n3 * cArray.length;
            n2 = -n2 * n | n3;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            int n4 = n3 & IlIIlIll.III(1972881629, 1592433185);
            n = n << n4 | n >>> -n4;
            l2 ^= (long)n4;
            ++n3;
        }
        return new String(cArray);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 8072;
        String string = "\uef7b\u3186\ue640\ufb9f\uadc4\u91ee\u1370\u096a\ue257\ub9a8\uc6ba\u48c2\uc034\u3fdb\ub759\ubcf1\u919f\ud2e9\u6ad7\ud694\u7c30\u6f1a\uc679\ub1b0\u9a9a\u461b\ue6ed\u0258\uedf5\u6292\u62a6\u506b\u560a\u74ea\u504f\uc2c4\ud12a\u8d64\ud31b\u7d25\u5ea2\u0af8\uff58\u75e0\uc650\uaa3a\ua353";
        char[] cArray = "\u1f80\u1f8e\u1f8f\u1f84\u1f80\u1f8e".toCharArray();
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
        IIl = stringArray;
        IlI = new Object[stringArray.length];
        int n6 = -1977138799;
        byte[] byArray = "=\u00c1\u00d4rF\u00dcd`\u00ca\u00b5\u00b3\u00b2\u00d5\u00aa\r\u00cdV\u00d3\u0001\u007f\u00ed\u00aeM\u008f\u00f6\u00e1\r\u00d3\u00a1Z\u0013\u0092HS\u00e7=".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        III = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            IlIIlIll.III[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        l = new String[IlIIlIll.III(1972881618, -1209831816)];
        IlIIlIll.II();
        Il = new llIllll(StringFactory.IIl(l[3]));
        ll = new III(StringFactory.IIl(l[4]));
        lI = new llIIllI(StringFactory.IIl(l[0]));
        I = IlIIlIll.ll();
    }

    float l(float f) {
        return f;
    }

    abstract float I(float var1);

    private IlIIlIll(String string2) {
        this.II = StringFactory.lIl(string2);
    }

    public String toString() {
        return this.II.IIII();
    }

    public static IlIIlIll lI(String string) {
        return Enum.valueOf(IlIIlIll.class, string);
    }

    public static IlIIlIll[] values() {
        return (IlIIlIll[])I.clone();
    }

    private static /* synthetic */ IlIIlIll[] ll() {
        return new IlIIlIll[]{Il, ll, lI};
    }

    private static int III(int n, int n2) {
        return III[n ^ 0x7597C8DA] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIl(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x93DB;
        char[] cArray = IIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlI[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIlIll.IlI[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1270;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x2FC3;
            n6 ^= 0x37AC;
            n6 += 14176;
            n6 += 57881;
            n6 += 26479;
            cArray[n5] = (char)((n6 ^= 0x38EB) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

