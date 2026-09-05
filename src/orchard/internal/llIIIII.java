/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIIII
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
public final class llIIIII
extends Enum<llIIIII> {
    public static final /* enum */ llIIIII I;
    private static final /* synthetic */ llIIIII[] l;
    public static final /* enum */ llIIIII II;
    private static final String[] Il;
    private static final Object[] lI;

    private static /* synthetic */ llIIIII[] I() {
        return new llIIIII[]{II, I};
    }

    public static llIIIII[] values() {
        return (llIIIII[])l.clone();
    }

    public static llIIIII l(String string) {
        return Enum.valueOf(llIIIII.class, string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block8: {
                block9: {
                    block7: {
                        block10: {
                            break block10;
                            while (true) {
                                var7_7 = 0;
                                break block7;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var0 = 21043;
                        var1_1 = "\u9d78\u9d73\u9d73\ub80f\ub812\ub80f\ub81c\ub817";
                        var2_2 = "\u5230\u5236".toCharArray();
                        break block11;
lbl11:
                        // 1 sources

                        while (true) {
                            if (var7_7 != 0) break block8;
                            break block9;
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            if (++var4_4 >= var2_2.length) ** continue;
                            break block8;
                            break;
                        }
                        var5_5 = 0;
                        var6_6 = 0;
                        ** while (true)
lbl20:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
lbl23:
                    // 2 sources

                    while (true) {
                        var4_4 = 0;
                        ** continue;
                        break;
                    }
                }
                llIIIII.Il = var3_3;
                ** while (true)
lbl29:
                // 1 sources

                while (true) {
                    llIIIII.l = llIIIII.I();
                    return;
                }
            }
            var6_6 = var2_2[var4_4] ^ var0;
            var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
            var5_5 += var6_6;
            ** while (true)
        }
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        ** while (true)
        llIIIII.lI = new Object[var3_3.length];
        llIIIII.II = new llIIIII();
        llIIIII.I = new llIIIII();
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, short s, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xFE57;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIIIII.lI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1DC7;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0x7A72;
            n7 += 21936;
            n7 ^= 0xF5B6;
            n7 += 31857;
            cArray[n6] = (char)((n7 ^= 0x515A) ^ n4 ^ s ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

