/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIII
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
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
final class llIIII
extends Enum<llIIII> {
    private static final /* synthetic */ llIIII[] I;
    public static final /* enum */ llIIII l;
    private final IIIlIIIII II;
    public static final /* enum */ llIIII Il;
    private static final String[] lI;
    private static final Object[] ll;

    public static llIIII[] values() {
        return (llIIII[])I.clone();
    }

    private static /* synthetic */ llIIII[] I() {
        return new llIIII[]{l, Il};
    }

    public static llIIII l(String string) {
        return Enum.valueOf(llIIII.class, string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block14: {
                block8: {
                    block9: {
                        block13: {
                            block12: {
                                block11: {
                                    break block11;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var0 = 18121;
                                break block12;
lbl6:
                                // 1 sources

                                while (true) {
                                    llIIII.lI = var3_2;
                                    llIIII.ll = new Object[var3_2.length];
                                    ** continue;
                                    break;
                                }
                            }
                            var1_1 = "\u9ebb\u9eaa\u9e8b\ua931\ua930\ua936\ua8f0\u5845\u5846\u582f\u6004\u603c\u601c\u604a";
                            break block13;
lbl13:
                            // 1 sources

                            while (true) {
                                if (++var4_4 < var2_3.length) break block8;
                                break block9;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl18:
                            // 1 sources

                            while (true) {
                                var7_7 = -1;
                                break block10;
                                break;
                            }
                        }
                        var2_3 = "\u46ca\u46cd\u46ca\u46cd".toCharArray();
                        var3_2 = new String[var2_3.length];
                        ** while (true)
                    }
                    var7_7 = 0;
                    break block10;
                    var6_6 = 0;
                    if (var7_7 == 0) {
                        ** continue;
lbl31:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl33:
                        // 1 sources

                        while (true) {
                            var5_5 = 0;
                            ** continue;
                            break;
                        }
                    }
                    break block8;
                    llIIII.l = new llIIII(StringFactory.IIII("RMB"));
                    break block14;
                }
                var6_6 = var2_3[var4_4] ^ var0;
                ** while (true)
            }
            llIIII.Il = new llIIII(StringFactory.IIII("LMB"));
            llIIII.I = llIIII.I();
            return;
            var3_2[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
            var5_5 += var6_6;
            ** while (true)
        }
        var4_4 = 0;
        ** while (true)
    }

    private llIIII(IIIlIIIII iIIlIIIII) {
        this.II = iIIlIIIII;
    }

    public String toString() {
        return this.II.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xAA84;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIIII.ll[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2A97;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 60225;
            n6 -= 65309;
            n6 -= 42548;
            n6 -= 7228;
            n6 -= 50047;
            n6 ^= 0x47E9;
            n6 += 56418;
            n6 += 2085;
            n6 -= 24251;
            cArray[n5] = (char)((n6 += 63452) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

