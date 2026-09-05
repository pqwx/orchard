/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Normal
 *   - Bypass
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
final class lIIIIIlI
extends Enum<lIIIIIlI> {
    private final IIIlIIIII I;
    public static final /* enum */ lIIIIIlI l;
    private static final /* synthetic */ lIIIIIlI[] II;
    public static final /* enum */ lIIIIIlI Il;
    private static final String[] lI;
    private static final Object[] ll;

    public static lIIIIIlI[] values() {
        return (lIIIIIlI[])II.clone();
    }

    public String toString() {
        return this.I.IIII();
    }

    public static lIIIIIlI I(String string) {
        return Enum.valueOf(lIIIIIlI.class, string);
    }

    private lIIIIIlI(IIIlIIIII iIIlIIIII) {
        this.I = iIIlIIIII;
    }

    private static /* synthetic */ lIIIIIlI[] l() {
        return new lIIIIIlI[]{Il, l};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 22208;
        String string = "\ua4c6\ua4c5\ua4fa\ua4c3\ua4d7\ua4c4\ub1ba\ub1be\ub1ba\ub677\ub183\ub19c\ub186\ub18c\u2fc8\u2ff1\u2ffa\u2fc9\u2fc7\u2fc7\u1506\u153c\u1542\u1516\u153b\u15e2\u1501\u1516";
        char[] cArray = "\u56c6\u56c8\u56c6\u56c8".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                lI = stringArray;
                ll = new Object[stringArray.length];
                Il = new lIIIIIlI(StringFactory.IIII("Normal"));
                l = new lIIIIIlI(StringFactory.IIII("Bypass"));
                II = lIIIIIlI.l();
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
     * Enabled aggressive block sorting
     */
    private static String II(char c, int n, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x87C2;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIIIIIlI.ll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1B17;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x6598;
            n6 -= 51063;
            n6 -= 31620;
            n6 -= 30180;
            n6 -= 47721;
            n6 -= 29991;
            cArray[n5] = (char)((n6 ^= 0x7DD) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

