/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIll
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
public final class lllIll
extends Enum<lllIll> {
    public static final /* enum */ lllIll I;
    private static final /* synthetic */ lllIll[] l;
    public static final /* enum */ lllIll II;
    public static final /* enum */ lllIll Il;
    public static final /* enum */ lllIll lI;
    private static final String[] ll;
    private static final Object[] III;

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block19: {
                block20: {
                    block23: {
                        block22: {
                            block21: {
                                break block23;
lbl1:
                                // 1 sources

                                while (true) {
                                    v0 = var9_9++;
                                    var8_8[v0] = (char)(var8_8[v0] ^ var10_10);
                                    break block19;
                                    break;
                                }
lbl5:
                                // 1 sources

                                block7: while (true) {
                                    var5_5 += var6_6;
                                    break block20;
lbl8:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var6_6 = 0;
                                        ** GOTO lbl32
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        lllIll.Il = new lllIll();
                                        ** GOTO lbl48
                                        break;
                                    }
lbl16:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl18:
                                    // 2 sources

                                    while (true) {
                                        switch (var9_9 % 5) {
                                            default: {
                                                v1 = 83;
                                                break block7;
                                            }
                                            case 4: {
                                                v1 = 66;
                                                break block7;
                                            }
lbl26:
                                            // 1 sources

                                            while (true) {
                                                var7_7 = -1;
                                                ** GOTO lbl36
                                                break;
                                            }
                                            case 3: {
                                                v1 = 21;
                                                break block7;
                                            }
lbl32:
                                            // 1 sources

                                            if (var7_7 != 0) ** GOTO lbl8
                                            ** continue;
lbl34:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl36:
                                            // 2 sources

                                            while (true) {
                                                var4_4 = 0;
                                                break block21;
                                                break;
                                            }
lbl39:
                                            // 1 sources

                                            while (true) {
                                                var7_7 = 0;
                                                ** continue;
                                                break;
                                            }
                                            var2_2 = "\u7ae6\u7ae3\u7ae0\u7ae8".toCharArray();
                                            var3_3 = new String[var2_2.length];
                                            ** continue;
                                            case 1: {
                                                v1 = 21;
                                                break block7;
                                            }
lbl48:
                                            // 1 sources

                                            lllIll.II = new lllIll();
                                            lllIll.l = lllIll.l();
                                            return;
lbl51:
                                            // 1 sources

                                            while (true) {
                                                lllIll.lI = new lllIll();
                                                break block22;
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                }
lbl54:
                                // 5 sources

                                while (true) {
                                    var10_10 = v1;
                                    ** continue;
                                    break;
                                }
                                {
                                    ** case 2:
                                }
lbl58:
                                // 1 sources

                                v1 = 81;
                                ** while (true)
                            }
                            var5_5 = 0;
                            ** while (true)
                        }
                        lllIll.I = new lllIll();
                        ** while (true)
                        lllIll.ll = var3_3;
                        lllIll.III = new Object[var3_3.length];
                        ** while (true)
                    }
                    var0 = 31461;
                    var1_1 = "\u0a3d\u0a7c\u0a38\u1e24\u1e9d\u1e2c\u1e98\u1e3a\u1ed0\ub957\ub8e3\ub8a8\ub8ed\ub8b9\uab0d\uab75\uab36\uab43\uab1c\uab05\uab4a\uab34\uab65\uab22\uab0c\uab48\uab23";
                    ** while (true)
                }
                if (++var4_4 >= var2_2.length) ** break;
                ** while (true)
                ** while (true)
            }
            if (var9_9 < var8_8.length) ** GOTO lbl18
            break block24;
            var6_6 = var2_2[var4_4] ^ var0;
            var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
            var9_9 = 0;
            ** while (true)
        }
        var3_3[var4_4] = new String(var8_8).intern();
        ** while (true)
    }

    public static lllIll I(String string) {
        return Enum.valueOf(lllIll.class, string);
    }

    public static lllIll[] values() {
        return (lllIll[])l.clone();
    }

    private static /* synthetic */ lllIll[] l() {
        return new lllIll[]{lI, I, Il, II};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char c, short s, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xA82F;
        char[] cArray = ll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lllIll.III[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6C88;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 7849;
            n6 -= 17283;
            n6 -= 62572;
            cArray[n5] = (char)((n6 -= 63325) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

