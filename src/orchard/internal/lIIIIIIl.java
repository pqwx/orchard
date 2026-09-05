/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIIIIl
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
public final class lIIIIIIl
extends Enum<lIIIIIIl> {
    private static final /* synthetic */ lIIIIIIl[] I;
    public static final /* enum */ lIIIIIIl l;
    public static final /* enum */ lIIIIIIl II;
    private static final String[] Il;
    private static final Object[] lI;

    private static /* synthetic */ lIIIIIIl[] I() {
        return new lIIIIIIl[]{l, II};
    }

    public static lIIIIIIl l(String string) {
        return Enum.valueOf(lIIIIIIl.class, string);
    }

    public static lIIIIIIl[] values() {
        return (lIIIIIIl[])I.clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block12: {
                block13: {
                    block14: {
                        block8: {
                            block9: {
                                block11: {
                                    break block11;
lbl1:
                                    // 1 sources

                                    while (var7_7 == 0) {
                                        break block8;
                                    }
                                    break block12;
lbl4:
                                    // 1 sources

                                    while (true) {
                                        var6_6 = 0;
                                        ** GOTO lbl1
                                        break;
                                    }
                                }
                                var0 = 2558;
                                var1_1 = "\u27fc\u27fd\u27fc\u280b\u87f9\u87e8\u87f6\u87f9\u87df\u87e8\u87f9";
                                break block13;
lbl11:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var7_7 = -1;
                                    break block9;
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (++var4_4 >= var2_2.length) {
                                    break block10;
                                }
                                break block12;
lbl19:
                                // 1 sources

                                while (true) {
                                    ** GOTO lbl16
                                    break;
                                }
                            }
lbl22:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        lIIIIIIl.Il = var3_3;
                        break block14;
                        var4_4 = 0;
                        var5_5 = 0;
                        ** while (true)
                    }
                    lIIIIIIl.lI = new Object[var3_3.length];
                    lIIIIIIl.l = new lIIIIIIl();
                    ** while (true)
lbl34:
                    // 1 sources

                    while (true) {
                        var5_5 += var6_6;
                        ** continue;
                        break;
                    }
                }
                var2_2 = "\u09fa\u09f9".toCharArray();
                var3_3 = new String[var2_2.length];
                ** while (true)
            }
            var6_6 = var2_2[var4_4] ^ var0;
            var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
            ** while (true)
            lIIIIIIl.II = new lIIIIIIl();
            lIIIIIIl.I = lIIIIIIl.I();
            return;
        }
        var7_7 = 0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x3B7D;
        char[] cArray = Il[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIIIIIIl.lI[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2BA0;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 47012;
            n6 ^= 0x3FE3;
            n6 ^= 0x4668;
            n6 -= 17025;
            n6 += 49318;
            n6 ^= 0x77E5;
            n6 += 23167;
            cArray[n5] = (char)((n6 += 1337) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

