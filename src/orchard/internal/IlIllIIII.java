/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIllIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Classic
 *   - Liquid
 *   - Modern
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
import orchard.internal.lIIlll;

@Environment(value=EnvType.CLIENT)
final class IlIllIIII
extends Enum<IlIllIIII>
implements lIIlll {
    private static final /* synthetic */ IlIllIIII[] I;
    public static final /* enum */ IlIllIIII l;
    public static final /* enum */ IlIllIIII II;
    private final boolean Il;
    public static final /* enum */ IlIllIIII lI;
    private final IIIlIIIII ll;
    private static final String[] III;
    private static final Object[] IIl;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Enum<?> I() {
        IlIllIIII ilIllIIII;
        if (this != l) {
            ilIllIIII = l;
            return ilIllIIII;
        }
        ilIllIIII = this;
        return ilIllIIII;
    }

    @Override
    public boolean l() {
        return this.Il;
    }

    public static IlIllIIII II(String string) {
        return Enum.valueOf(IlIllIIII.class, string);
    }

    public String toString() {
        return this.ll.IIII();
    }

    public static IlIllIIII[] values() {
        return (IlIllIIII[])I.clone();
    }

    private IlIllIIII(IIIlIIIII iIIlIIIII) {
        this(iIIlIIIII, true);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 12780;
        String string = "\u7843\u78f7\u78a4\u7811\u78cd\u7840\u1b2d\u1ba2\u1b92\u1b54\u1bbb\u1b00\u1b75\u1b8c\ubce7\ubc54\ubc14\ubca4\ubc73\ubcef\ubb65\ubbfa\ubb9f\ubb0b\ubbf7\ubb4b\ubb0b\ubbca\u3584\u353c\u3575\u35c2\u3500\u359a\u6d0c\u6dfd\u6deb\u6d64\u6d98\u6d05\u6d67\u6d9d\u6db8\u6deb\u6db2\u6d1c";
        char[] cArray = "\u31ea\u31e4\u31ea\u31e4\u31ea\u31e0".toCharArray();
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
        l = new IlIllIIII(StringFactory.IIII("Liquid"));
        lI = new IlIllIIII(StringFactory.IIII("Modern"), false);
        II = new IlIllIIII(StringFactory.IIII("Classic"), false);
        I = IlIllIIII.Il();
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIllIIII(IIIlIIIII iIIlIIIII, boolean bl) {
        this.ll = iIIlIIIII;
        this.Il = bl;
    }

    private static /* synthetic */ IlIllIIII[] Il() {
        return new IlIllIIII[]{l, lI, II};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xC4E633DD;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIllIIII.IIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xE2ADD8FF;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 5 -> 103;
                case 18 -> 122;
                case 4 -> 231;
                case 29 -> 84;
                case 19 -> 134;
                case 9 -> 137;
                case 31 -> 129;
                case 30 -> 14;
                case 14 -> 217;
                case 17 -> 59;
                case 21 -> 70;
                case 25 -> 157;
                case 20 -> 61;
                case 13 -> 200;
                case 1 -> 221;
                case 10 -> 154;
                case 22 -> 46;
                case 26 -> 243;
                case 2 -> 150;
                case 24 -> 228;
                case 23 -> 235;
                case 12 -> 139;
                default -> 108;
                case 8 -> 248;
                case 27 -> 61;
                case 28 -> 69;
                case 15 -> 42;
                case 3 -> 39;
                case 6 -> 2;
                case 11 -> 52;
                case 7 -> 237;
                case 16 -> 181;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

