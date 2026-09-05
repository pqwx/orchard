/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIlll
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
import orchard.internal.Illll;

@Environment(value=EnvType.CLIENT)
final class lIIIlll
extends Enum<lIIIlll> {
    private static final /* synthetic */ lIIIlll[] I;
    public static final /* enum */ lIIIlll l;
    public static final /* enum */ lIIIlll II;
    public static final /* enum */ lIIIlll Il;
    private final Illll lI;
    private static final String[] ll;
    private static final Object[] III;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 28705;
        var1_1 = "\uc7ff\uc7c8\uc7af\uc709\uf3dd\uf3ec\uf382\uf337\uf335\u8813\u8820\u8841\u88f6";
        var2_2 = "\u7025\u7024\u7025".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        ** GOTO lbl46
lbl7:
        // 1 sources

        while (true) {
            var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
            var9_9 = 0;
            ** GOTO lbl29
            break;
        }
lbl11:
        // 1 sources

        while (true) {
            var6_6 = 0;
            if (var7_7 != 0) ** GOTO lbl40
            lIIIlll.ll = var3_3;
            lIIIlll.III = new Object[var3_3.length];
            lIIIlll.Il = new lIIIlll(Illll.ll);
            lIIIlll.l = new lIIIlll(Illll.II);
            lIIIlll.II = new lIIIlll(Illll.I);
            lIIIlll.I = lIIIlll.I();
            return;
        }
lbl-1000:
        // 5 sources

        {
            block9: {
                var10_10 = v0;
                v1 = var9_9++;
                var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
                if (var9_9 < var8_8.length) break block9;
                var3_3[var4_4] = new String(var8_8).intern();
                var5_5 += var6_6;
                if (++var4_4 < var2_2.length) ** GOTO lbl40
                ** GOTO lbl45
            }
            switch (var9_9 % 5) {
                case 1: {
                    v0 = 14;
                    continue block8;
                }
                default: {
                    v0 = 30;
                    continue block8;
                }
                case 4: {
                    v0 = 119;
                    continue block8;
                }
lbl40:
                // 2 sources

                var6_6 = var2_2[var4_4] ^ var0;
                ** continue;
                case 2: {
                    v0 = 2;
                    continue block8;
                }
lbl45:
                // 1 sources

                var7_7 = 0;
lbl46:
                // 2 sources

                var4_4 = 0;
                var5_5 = 0;
                ** continue;
                case 3: 
            }
            v0 = 33;
            ** while (true)
        }
    }

    public String toString() {
        return this.lI.toString();
    }

    private lIIIlll(Illll illll) {
        this.lI = illll;
    }

    private static /* synthetic */ lIIIlll[] I() {
        return new lIIIlll[]{Il, l, II};
    }

    public static lIIIlll l(String string) {
        return Enum.valueOf(lIIIlll.class, string);
    }

    public static lIIIlll[] values() {
        return (lIIIlll[])I.clone();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x9125DB12;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIIIlll.III[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x156CBB7E;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 16: {
                    n6 = 111;
                    continue block33;
                }
                case 20: {
                    n6 = 148;
                    continue block33;
                }
                case 15: {
                    n6 = 209;
                    continue block33;
                }
                case 4: {
                    n6 = 224;
                    continue block33;
                }
                case 14: {
                    n6 = 176;
                    continue block33;
                }
                case 29: {
                    n6 = 207;
                    continue block33;
                }
                case 17: {
                    n6 = 222;
                    continue block33;
                }
                case 11: {
                    n6 = 3;
                    continue block33;
                }
                case 25: {
                    n6 = 34;
                    continue block33;
                }
                case 3: {
                    n6 = 179;
                    continue block33;
                }
                case 5: {
                    n6 = 1;
                    continue block33;
                }
                case 2: {
                    n6 = 51;
                    continue block33;
                }
                case 7: {
                    n6 = 95;
                    continue block33;
                }
                case 18: {
                    n6 = 9;
                    continue block33;
                }
                case 23: {
                    n6 = 22;
                    continue block33;
                }
                case 28: {
                    n6 = 39;
                    continue block33;
                }
                case 13: {
                    n6 = 18;
                    continue block33;
                }
                case 27: {
                    n6 = 210;
                    continue block33;
                }
                case 31: {
                    n6 = 67;
                    continue block33;
                }
                case 24: {
                    n6 = 56;
                    continue block33;
                }
                case 10: {
                    n6 = 156;
                    continue block33;
                }
                case 19: {
                    n6 = 102;
                    continue block33;
                }
                case 22: {
                    n6 = 196;
                    continue block33;
                }
                case 1: {
                    n6 = 92;
                    continue block33;
                }
                case 21: {
                    n6 = 145;
                    continue block33;
                }
                case 8: {
                    n6 = 47;
                    continue block33;
                }
                case 12: {
                    n6 = 47;
                    continue block33;
                }
                case 30: {
                    n6 = 210;
                    continue block33;
                }
                case 6: {
                    n6 = 107;
                    continue block33;
                }
                case 9: {
                    n6 = 10;
                    continue block33;
                }
                case 26: {
                    n6 = 208;
                    continue block33;
                }
            }
            n6 = 118;
        }
    }
}

