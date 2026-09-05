/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Water
 *   - Lava
 *   - Both
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
final class IlllllI
extends Enum<IlllllI> {
    private final IIIlIIIII I;
    public static final /* enum */ IlllllI l;
    public static final /* enum */ IlllllI II;
    private static final /* synthetic */ IlllllI[] Il;
    public static final /* enum */ IlllllI lI;
    private static final String[] ll;
    private static final Object[] III;

    private static /* synthetic */ IlllllI[] I() {
        return new IlllllI[]{l, lI, II};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 27993;
        String string = "\uaa01\ua9ee\ua9fb\ua9ee\u6235\u622b\u6217\u6224\u622f\u6212\u619e\u619e\u79bb\u79cd\u79ba\u79c9\u79b0\uc382\uc347\uc366\uc353\uc69f\uc363\uc381\uc32f\ue06c\ue067\ue07e\ue062\u1445\u1442\u1446\u1411\u145e\u1411\u148d\u148d";
        char[] cArray = "\u6d5d\u6d51\u6d5c\u6d51\u6d5d\u6d51".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                ll = stringArray;
                III = new Object[stringArray.length];
                l = new IlllllI(StringFactory.IIII("Lava"));
                lI = new IlllllI(StringFactory.IIII("Water"));
                II = new IlllllI(StringFactory.IIII("Both"));
                Il = IlllllI.I();
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

    public static IlllllI valueOf(String string) {
        return Enum.valueOf(IlllllI.class, string);
    }

    public static IlllllI[] values() {
        return (IlllllI[])Il.clone();
    }

    public String toString() {
        return this.I.IIII();
    }

    private IlllllI(IIIlIIIII iIIlIIIII) {
        this.I = iIIlIIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(int n, int n2, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x8ABD;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlllllI.III[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xE7;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 11539;
            n7 += 27141;
            n7 ^= 0x5190;
            n7 -= 51133;
            n7 += 48656;
            n7 -= 63637;
            n7 ^= 0x72B9;
            n7 ^= 0x981;
            cArray[n6] = (char)((n7 += 35263) ^ n4 ^ c ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

