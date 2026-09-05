/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.Ill
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
public final class Ill
extends Enum<Ill> {
    public static final /* enum */ Ill I;
    private static final /* synthetic */ Ill[] l;
    public static final /* enum */ Ill II;
    public static final /* enum */ Ill Il;
    private static final String[] lI;
    private static final Object[] ll;

    public static Ill I(String string) {
        return Enum.valueOf(Ill.class, string);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 12611;
        String string = "\u4460\u4426\u4448\u4423\ubfb0\ubf91\ubff3\ubf87\ubf84\ubfa9\ubfa2\ubffe\ubfe6\u577f\u5734\u575a\u54d9\u54d5\u54ec\u577f\u573e\u574b";
        char[] cArray = "\u0004\t\t".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            char c;
            int n4;
            if (!bl || (bl = false) || !true) {
                c = cArray[n4];
                char[] cArray2 = string.substring(n3, n3 + c).toCharArray();
                int n5 = 0;
                boolean bl2 = true;
                block8: while (true) {
                    int n6;
                    if (!bl2 || (bl2 = false) || !true) {
                        int n7 = n6;
                        int n8 = n5++;
                        cArray2[n8] = (char)(cArray2[n8] ^ n7 ^ n);
                        if (n5 >= cArray2.length) break;
                    }
                    switch (n5 % 6) {
                        default: {
                            n6 = 51;
                            continue block8;
                        }
                        case 2: {
                            n6 = 27;
                            continue block8;
                        }
                        case 3: {
                            n6 = 111;
                            continue block8;
                        }
                        case 5: {
                            n6 = 84;
                            continue block8;
                        }
                        case 1: {
                            n6 = 116;
                            continue block8;
                        }
                        case 4: 
                    }
                    n6 = 115;
                }
                stringArray[n4] = new String(cArray2).intern();
                n3 += c;
                if (++n4 < cArray.length) continue;
                n2 = 0;
            }
            n4 = 0;
            n3 = 0;
            c = '\u0000';
            if (n2 == 0) break;
        }
        lI = stringArray;
        ll = new Object[stringArray.length];
        I = new Ill();
        Il = new Ill();
        II = new Ill();
        l = Ill.l();
    }

    private static /* synthetic */ Ill[] l() {
        return new Ill[]{I, Il, II};
    }

    public static Ill[] values() {
        return (Ill[])l.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, short s, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x7CB1;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Ill.ll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4687;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 37759;
            n6 -= 11493;
            n6 += 2801;
            n6 -= 60063;
            n6 ^= 0x6DB3;
            n6 -= 21824;
            n6 += 41207;
            n6 -= 10516;
            n6 += 6871;
            cArray[n5] = (char)((n6 ^= 0x1C75) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

