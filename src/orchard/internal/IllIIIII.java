/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Silent
 *   - Legit
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
public final class IllIIIII
extends Enum<IllIIIII> {
    private final IIIlIIIII I;
    public static final /* enum */ IllIIIII l;
    public static final /* enum */ IllIIIII II;
    private static final /* synthetic */ IllIIIII[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    public String toString() {
        return this.I.IIII();
    }

    private static /* synthetic */ IllIIIII[] I() {
        return new IllIIIII[]{II, l};
    }

    public static IllIIIII valueOf(String string) {
        return Enum.valueOf(IllIIIII.class, string);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 17156;
        String string = "\u5dc3\u5d8d\u5dd2\u5da5\u5db0\u5dda\ube6f\ubd77\ubd3f\ube6f\ube2f\ube4a\ube24\ube30\u5348\u532f\u52ac\u5301\u5339\u5346\u9ed8\u9eae\u9ed6\u9e70\u9ea4\u9ed7\u65d0\u6593";
        char[] cArray = "\u4302\u430c\u4302\u430c".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            int n4;
            int n5;
            if (!bl || (bl = false) || !true) {
                n4 = cArray[n5] ^ n;
                char[] cArray2 = string.substring(n3, n3 + n4).toCharArray();
                int n6 = 0;
                do {
                    int n7 = switch (n6 % 5) {
                        case 1 -> 5;
                        case 3 -> 41;
                        case 2 -> 113;
                        default -> 97;
                        case 4 -> 21;
                    };
                    int n8 = n6++;
                    cArray2[n8] = (char)(cArray2[n8] ^ n7);
                } while (n6 < cArray2.length);
                stringArray[n5] = new String(cArray2).intern();
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
        II = new IllIIIII(StringFactory.IIII("Silent"));
        l = new IllIIIII(StringFactory.IIII("Legit"));
        Il = IllIIIII.I();
    }

    private IllIIIII(IIIlIIIII iIIlIIIII) {
        this.I = iIIlIIIII;
    }

    public static IllIIIII[] values() {
        return (IllIIIII[])Il.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(int n, char c, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0xBFC8;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IllIIIII.ll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3B13;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 63888;
            n7 += 31491;
            n7 += 22268;
            n7 += 20778;
            n7 ^= 0x24AA;
            n7 -= 35144;
            n7 -= 38320;
            n7 ^= 0x3316;
            n7 -= 61889;
            cArray[n6] = (char)((n7 += 58373) ^ n4 ^ c ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

