/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Sprint Jump
 *   - Walk
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
final class llIIIIll
extends Enum<llIIIIll> {
    public static final /* enum */ llIIIIll I;
    private final IIIlIIIII l;
    public static final /* enum */ llIIIIll II;
    private static final /* synthetic */ llIIIIll[] Il;
    public static final /* enum */ llIIIIll lI;
    private static final String[] ll;
    private static final Object[] III;

    private llIIIIll(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    public static llIIIIll[] values() {
        return (llIIIIll[])Il.clone();
    }

    public String toString() {
        return this.l.IIII();
    }

    public static llIIIIll I(String string) {
        return Enum.valueOf(llIIIIll.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 7176;
        String string = "\u190a\u1987\u1987\u19a4\uf963\uf9bf\uf9d1\uf9fa\uf9c0\uf9a7\uf942\uf934\u60e1\u6079\u6076\u6049\u6041\u6027\ua57c\ua5a2\ua5c9\ua5f8\ua5dc\ua59e\ua507\ua551\u0caa\u0c32\u0c3d\u0c02\u0c0a\u0c6c\u0cc8\u0cab\u0c19\u0cc3\u0cb8\u8239\u82e7\u828c\u82bd\u8299\u82db\u8242\u8214\u82b8\u827b\u8238\u829b\u82ed\u82e0\u825f\u82c5";
        char[] cArray = "\u1c0c\u1c00\u1c0e\u1c00\u1c03\u1c18".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 != 0) {
                do {
                    n5 = cArray[n3] ^ n;
                    stringArray[n3] = string.substring(n4, n4 + n5);
                    n4 += n5;
                } while (++n3 < cArray.length);
            } else {
                ll = stringArray;
                III = new Object[stringArray.length];
                lI = new llIIIIll(StringFactory.IIII("Walk"));
                II = new llIIIIll(StringFactory.IIII("Sprint"));
                I = new llIIIIll(StringFactory.IIII("Sprint Jump"));
                Il = llIIIIll.l();
                return;
            }
            n2 = 0;
        }
    }

    private static /* synthetic */ llIIIIll[] l() {
        return new llIIIIll[]{lI, II, I};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x70B157B;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIIIIll.III[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xEDCFEDF7;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 22 -> 226;
                case 25 -> 41;
                case 19 -> 66;
                default -> 131;
                case 2 -> 21;
                case 27 -> 245;
                case 21 -> 106;
                case 10 -> 146;
                case 11 -> 19;
                case 18 -> 89;
                case 3 -> 49;
                case 12 -> 100;
                case 1 -> 24;
                case 30 -> 155;
                case 13 -> 114;
                case 31 -> 92;
                case 8 -> 54;
                case 5 -> 66;
                case 9 -> 244;
                case 4 -> 62;
                case 14 -> 172;
                case 24 -> 37;
                case 6 -> 237;
                case 7 -> 155;
                case 15 -> 51;
                case 20 -> 162;
                case 29 -> 43;
                case 23 -> 51;
                case 16 -> 246;
                case 28 -> 46;
                case 26 -> 51;
                case 17 -> 44;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

