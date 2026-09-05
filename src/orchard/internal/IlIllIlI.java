/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIllIlI
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
final class IlIllIlI
extends Enum<IlIllIlI> {
    public static final /* enum */ IlIllIlI I;
    private final IIIlIIIII l;
    public static final /* enum */ IlIllIlI II;
    private static final /* synthetic */ IlIllIlI[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    private IlIllIlI(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    public static IlIllIlI[] values() {
        return (IlIllIlI[])Il.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 20559;
        String string = "\ueb2d\ueb2e\ueaf1\ueb20\ueaf4\ueb2f\uc81a\uc858\uc83c\uc87a\uc852\uc86d\ucbce\ucbc1\uf554\uf56a\uf55d\uf566\uf55f\uf555\uae07\uae33\uae47\uae1f\uae3b\uae26\ua9f4\uae14";
        char[] cArray = "\u5049\u5047\u5049\u5047".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                lI = stringArray;
                ll = new Object[stringArray.length];
                II = new IlIllIlI(StringFactory.IIII("Legit"));
                I = new IlIllIlI(StringFactory.IIII("Silent"));
                Il = IlIllIlI.I();
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

    private static /* synthetic */ IlIllIlI[] I() {
        return new IlIllIlI[]{II, I};
    }

    public String toString() {
        return this.l.IIII();
    }

    public static IlIllIlI l(String string) {
        return Enum.valueOf(IlIllIlI.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x4DDE;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 == null) {
            IlIllIlI.ll[n3] = stackTraceElementArray = new Throwable().getStackTrace();
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4D35;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0x3842;
            n7 ^= 0xBA4B;
            n7 += 57253;
            n7 += 65453;
            n7 += 27066;
            n7 ^= 0xCBD6;
            n7 += 44722;
            n7 -= 789;
            n7 -= 43179;
            cArray[n6] = (char)((n7 -= 62589) ^ n4 ^ c ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

