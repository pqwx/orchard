/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIlI
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
final class lIIIlI
extends Enum<lIIIlI> {
    private static final /* synthetic */ lIIIlI[] I;
    public static final /* enum */ lIIIlI l;
    public static final /* enum */ lIIIlI II;
    private final IIIlIIIII Il;
    private static final String[] lI;
    private static final Object[] ll;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 6425;
        var1_1 = "\u2a18\u2a1f\u2a0d\u2acd\u2ace\u2aed\u9617\u962f\u962c\u96e1\u96d6\u96c5\u96d5\u9648\ufea6\ufeba\ufeb0\ufe66\ufe62\ufe56\u4bb7\u4bf5\u4bfe\u4b49\u4b72\u4b63\u4b24\u4b94";
        var2_2 = "\u191f\u1911\u191f\u1911".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        if (true) ** GOTO lbl16
        block7: while (true) {
            block12: {
                block13: {
                    var10_10 = v0;
                    v1 = var9_9++;
                    var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
                    if (var9_9 < var8_8.length) break block12;
                    var3_3[var4_4] = new String(var8_8).intern();
                    var5_5 += var6_6;
                    if (++var4_4 < var2_2.length) break block13;
                    var7_7 = 0;
lbl16:
                    // 2 sources

                    var4_4 = 0;
                    var5_5 = 0;
                    var6_6 = 0;
                    if (var7_7 == 0) {
                        lIIIlI.lI = var3_3;
                        lIIIlI.ll = new Object[var3_3.length];
                        lIIIlI.II = new lIIIlI(StringFactory.IIII("Legit"));
                        lIIIlI.l = new lIIIlI(StringFactory.IIII("Silent"));
                        lIIIlI.I = lIIIlI.I();
                        return;
                    }
                }
                var6_6 = var2_2[var4_4] ^ var0;
                var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                var9_9 = 0;
            }
            switch (var9_9 % 6) {
                case 2: {
                    v0 = 90;
                    continue block7;
                }
                case 4: {
                    v0 = 5;
                    continue block7;
                }
                default: {
                    v0 = 81;
                    continue block7;
                }
                case 3: {
                    v0 = 28;
                    continue block7;
                }
                case 5: {
                    v0 = 33;
                    continue block7;
                }
                case 1: 
            }
            v0 = 123;
        }
    }

    public String toString() {
        return this.Il.IIII();
    }

    private static /* synthetic */ lIIIlI[] I() {
        return new lIIIlI[]{II, l};
    }

    private lIIIlI(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    public static lIIIlI[] values() {
        return (lIIIlI[])I.clone();
    }

    public static lIIIlI l(String string) {
        return Enum.valueOf(lIIIlI.class, string);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x1134C263;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIIIlI.ll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5979EBF3;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 16: {
                    n6 = 103;
                    continue block33;
                }
                case 23: {
                    n6 = 86;
                    continue block33;
                }
                case 2: {
                    n6 = 146;
                    continue block33;
                }
                case 20: {
                    n6 = 70;
                    continue block33;
                }
                default: {
                    n6 = 144;
                    continue block33;
                }
                case 13: {
                    n6 = 160;
                    continue block33;
                }
                case 11: {
                    n6 = 54;
                    continue block33;
                }
                case 24: {
                    n6 = 247;
                    continue block33;
                }
                case 12: {
                    n6 = 16;
                    continue block33;
                }
                case 15: {
                    n6 = 68;
                    continue block33;
                }
                case 14: {
                    n6 = 134;
                    continue block33;
                }
                case 22: {
                    n6 = 60;
                    continue block33;
                }
                case 7: {
                    n6 = 172;
                    continue block33;
                }
                case 6: {
                    n6 = 22;
                    continue block33;
                }
                case 3: {
                    n6 = 11;
                    continue block33;
                }
                case 9: {
                    n6 = 178;
                    continue block33;
                }
                case 1: {
                    n6 = 188;
                    continue block33;
                }
                case 29: {
                    n6 = 87;
                    continue block33;
                }
                case 21: {
                    n6 = 79;
                    continue block33;
                }
                case 5: {
                    n6 = 23;
                    continue block33;
                }
                case 18: {
                    n6 = 97;
                    continue block33;
                }
                case 25: {
                    n6 = 240;
                    continue block33;
                }
                case 31: {
                    n6 = 153;
                    continue block33;
                }
                case 8: {
                    n6 = 239;
                    continue block33;
                }
                case 28: {
                    n6 = 106;
                    continue block33;
                }
                case 19: {
                    n6 = 132;
                    continue block33;
                }
                case 30: {
                    n6 = 175;
                    continue block33;
                }
                case 17: {
                    n6 = 97;
                    continue block33;
                }
                case 26: {
                    n6 = 118;
                    continue block33;
                }
                case 10: {
                    n6 = 36;
                    continue block33;
                }
                case 4: {
                    n6 = 29;
                    continue block33;
                }
                case 27: 
            }
            n6 = 44;
        }
        return new String(cArray).intern();
    }
}

