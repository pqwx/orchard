/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIllIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Product Sans Medium
 *   - Product Sans Bold
 *   - 16348rlki77s
 *   - tcmneyij75xd
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
public final class IlIllIIlI
extends Enum<IlIllIIlI>
implements lIIlll {
    private final IIIlIIIII I;
    public static final /* enum */ IlIllIIlI l;
    public static final /* enum */ IlIllIIlI II;
    private static final /* synthetic */ IlIllIIlI[] Il;
    private final IIIlIIIII lI;
    private static final String[] ll;
    private static final Object[] III;

    public String toString() {
        return this.I.IIII();
    }

    public static IlIllIIlI[] values() {
        return (IlIllIIlI[])Il.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 26871;
        String string = "\uc9d8\uc9c6\uc9d5\ud62c\uc9df\ud629\uc9dc\uc9c5\uc9d9\ud62b\uc9d2\uc9d9\uc9c5\uc9d7\ud62f\ud62c\uc9d3\uc9df\uc9d7\u2177\u211f\u216a\u2162\u217b\u2107\u214c\u2113\u2112\u210e\u214f\u217d\u2105\u216a\u210e\u211d\u2110\u2139\u2131\u2162\u217b\u2174\u2101\u2102\u2111\u2117\u210b\u210b\u2dc5\u2a2f\u2a35\u2a32\u2dc5\u2a09\u2a08\u2a08\u2a22\u2a0c\u2a29\u2a29\u2a22\u2a02\u2dd2\u2a37\u7232\u7234\u723b\u722e\u7231\u7227\u723e\u720b\u7237\u7225\u7238\u7237\u720b\u7224\u723b\u7226\u722e\u7bec\u7be4\u7bf5\u7b9d\u7b80\u7bfc\u7b97\u7bc8\u7bcd\u7bf9\u7b94\u7b82\u7bfa\u7bf5\u7bf9\u7be2\u7bcb\u7b4e\u7be7\u7bcd\u7b82\u7bef\u7b96\u7b50\ud77b\ud71b\ud765\ud76b\ud778\ud779\ud749\ud71c\ud714\ud713\ud763\ud70e\ud769\ud716\ud765\ud765";
        char[] cArray = "\u68e4\u68eb\u68e7\u68e6\u68ef\u68e7".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                ll = stringArray;
                III = new Object[stringArray.length];
                l = new IlIllIIlI(StringFactory.IIII("Product Sans Medium"), StringFactory.IIII("16348rlki77s"));
                II = new IlIllIIlI(StringFactory.IIII("Product Sans Bold"), StringFactory.IIII("tcmneyij75xd"));
                Il = IlIllIIlI.Il();
                return;
            }
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private IlIllIIlI(IIIlIIIII iIIlIIIII, IIIlIIIII iIIlIIIII2) {
        this.I = iIIlIIIII;
        this.lI = iIIlIIIII2;
    }

    public IIIlIIIII II() {
        return this.lI;
    }

    private static /* synthetic */ IlIllIIlI[] Il() {
        return new IlIllIIlI[]{l, II};
    }

    public IIIlIIIII lI() {
        return this.I;
    }

    public static IlIllIIlI ll(String string) {
        return Enum.valueOf(IlIllIIlI.class, string);
    }

    public String III() {
        return this.lI.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIl(short s, char c, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xA6BE;
        char[] cArray = ll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIllIIlI.III[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x251E;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xF3D4;
            n6 ^= 0x49C0;
            n6 ^= 0x7C3D;
            n6 -= 11637;
            n6 += 48636;
            n6 += 8594;
            cArray[n5] = (char)((n6 ^= 0x54AF) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

