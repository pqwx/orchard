/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Freelook
 *   - Normal
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
final class IIIIIIIlI
extends Enum<IIIIIIIlI> {
    public static final /* enum */ IIIIIIIlI I;
    public static final /* enum */ IIIIIIIlI l;
    private static final /* synthetic */ IIIIIIIlI[] II;
    private final IIIlIIIII Il;
    private static final String[] lI;
    private static final Object[] ll;

    private IIIIIIIlI(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    public String toString() {
        return this.Il.IIII();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 11743;
        String string = "\u8024\u8027\u80c8\u8025\u8039\u8022\u5152\u514e\u5152\u54a7\u513b\u54b0\u5156\u5140\u4746\u3a9a\u3aab\u3aab\u3ab0\u3ab1\u3ab1\u3ab5\u4153\u4158\u44af\u44b7\u4156\u44b7\u44b3\u44aa\u44ad\u414d\u4144\u4126";
        char[] cArray = "\u2dd9\u2dd7\u2dd7\u2dd3".toCharArray();
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
        lI = stringArray;
        ll = new Object[stringArray.length];
        I = new IIIIIIIlI(StringFactory.IIII("Normal"));
        l = new IIIIIIIlI(StringFactory.IIII("Freelook"));
        II = IIIIIIIlI.l();
    }

    public static IIIIIIIlI I(String string) {
        return Enum.valueOf(IIIIIIIlI.class, string);
    }

    private static /* synthetic */ IIIIIIIlI[] l() {
        return new IIIIIIIlI[]{I, l};
    }

    public static IIIIIIIlI[] values() {
        return (IIIIIIIlI[])II.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char c, short s, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xB0CD;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIIIIlI.ll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2A09;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 14586;
            n6 ^= 0x864E;
            n6 += 54031;
            n6 += 33294;
            n6 ^= 0xBC1D;
            cArray[n5] = (char)((n6 ^= 0x2281) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

