/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIlllI
 * Purpose not identified - name is the original obfuscated one.
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
final class lllIlllI
extends Enum<lllIlllI> {
    public static final /* enum */ lllIlllI I;
    private static final /* synthetic */ lllIlllI[] l;
    public static final /* enum */ lllIlllI II;
    public static final /* enum */ lllIlllI Il;
    public static final /* enum */ lllIlllI lI;
    public static final /* enum */ lllIlllI ll;
    private static final String[] III;
    private static final Object[] IIl;

    public static lllIlllI I(String string) {
        return Enum.valueOf(lllIlllI.class, string);
    }

    private static /* synthetic */ lllIlllI[] l() {
        return new lllIlllI[]{ll, I, Il, II, lI};
    }

    public static lllIlllI[] values() {
        return (lllIlllI[])l.clone();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 31083;
        String string = "\u0397\u0360\u03c5\u0306\u0331\u0393\u038f\u03da\u03ec\u3d85\u3da6\u3ddf\u3df4\u3dd9\u3dad\u3d83\u3dc0\u3df6\u3dc9\u3d8b\u3db6\u3ddf\u3df9\uf4ac\uf493\uf4d0\uf4f5\uf4d8\uf483\uf483\uf4eb\uf4f1\uf4c8\uf4b1\uf4a5\uf4e8\uf4f9\uf4d8\uf480\uf491\uf4ce\uf4de\uf4fd\u1bce\u1bb2\u1bfe\u1bd5\u1b8f\u1bdf\u1bbe\u1bfc\u1bd6\u1bf1\ub3ca\ub3f6\ub3ba\ub38c\ub3a0\ub3c4\ub2c3\ub392";
        char[] cArray = "\u7962\u7965\u797f\u7961\u7963".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        block6: while (true) {
            int n3;
            int n4;
            block12: {
                int n5;
                int n6;
                int n7;
                char[] cArray2;
                block13: {
                    block11: {
                        if (bl && !(bl = false) && true) break block11;
                        int n8 = n4;
                        int n9 = n3++;
                        cArray2[n9] = (char)(cArray2[n9] ^ n8);
                        if (n3 < cArray2.length) break block12;
                        stringArray[n6] = new String(cArray2).intern();
                        n5 += n7;
                        if (++n6 < cArray.length) break block13;
                        n2 = 0;
                    }
                    n6 = 0;
                    n5 = 0;
                    n7 = 0;
                    if (n2 == 0) {
                        III = stringArray;
                        IIl = new Object[stringArray.length];
                        ll = new lllIlllI();
                        I = new lllIlllI();
                        Il = new lllIlllI();
                        II = new lllIlllI();
                        lI = new lllIlllI();
                        l = lllIlllI.l();
                        return;
                    }
                }
                n7 = cArray[n6] ^ n;
                cArray2 = string.substring(n5, n5 + n7).toCharArray();
                n3 = 0;
            }
            switch (n3 % 5) {
                default: {
                    n4 = 28;
                    continue block6;
                }
                case 3: {
                    n4 = 111;
                    continue block6;
                }
                case 4: {
                    n4 = 79;
                    continue block6;
                }
                case 2: {
                    n4 = 74;
                    continue block6;
                }
                case 1: 
            }
            n4 = 4;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char c, char c2, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xFCB2;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lllIlllI.IIl[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5894;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 14233;
            n6 += 15538;
            n6 -= 17662;
            n6 += 20369;
            n6 ^= 0x2031;
            n6 ^= 0xF4BE;
            n6 -= 25403;
            cArray[n5] = (char)((n6 += 53890) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

