/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.Illll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Chest
 *   - Head
 *   - Legs
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
public final class Illll
extends Enum<Illll> {
    public static final /* enum */ Illll I;
    private final double l;
    public static final /* enum */ Illll II;
    private final double Il;
    private final IIIlIIIII lI;
    public static final /* enum */ Illll ll;
    private static final /* synthetic */ Illll[] III;
    private final double IIl;
    private static final String[] IlI;
    private static final Object[] Ill;

    public static Illll[] values() {
        return (Illll[])III.clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block14: {
                block13: {
                    block16: {
                        block15: {
                            break block15;
lbl1:
                            // 1 sources

                            while (true) {
                                var5_5 += var6_6;
                                break block12;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                var7_7 = 0;
                                break block13;
                                break;
                            }
lbl7:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                Illll.III = Illll.l();
                                return;
                            }
lbl12:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                if (++var4_4 >= var2_2.length) {
                                    ** continue;
lbl17:
                                    // 1 sources

                                    while (true) {
                                        var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                                        ** continue;
                                        break;
                                    }
                                }
                                break block14;
                                break;
                            }
                            var6_6 = 0;
                            if (var7_7 != 0) break block14;
                            break block16;
                        }
                        var0 = 26953;
                        var1_1 = "\u5394\u53a3\u53af\u53a0\u5106\u5101\u50f5\u50e5\u512c\u5108\u50dc\u50dc\udb85\udb9c\udb9b\udb95\udba8\u5f03\u5ec3\u5ef4\u5f2a\u5ee2\u5f01\u5ecc\u5ecb\u1bf7\u180c\u180a\u1bfe\u8edb\u8ecd\u8ec9\u8ebb\u8eed\u8ec6\u8f10\u8f10";
                        ** while (true)
lbl28:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl30:
                        // 1 sources

                        while (true) {
                            var5_5 = 0;
                            ** continue;
                            break;
                        }
lbl33:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl35:
                        // 1 sources

                        while (true) {
                            var7_7 = -1;
                            break block13;
                            break;
                        }
                    }
                    Illll.IlI = var3_3;
                    ** while (true)
                }
                var4_4 = 0;
                ** while (true)
                Illll.Ill = new Object[var3_3.length];
                Illll.ll = new Illll(StringFactory.IIII("Head"), 0.88, 0.72, 1.0);
                ** while (true)
            }
            var6_6 = var2_2[var4_4] ^ var0;
            ** while (true)
            Illll.II = new Illll(StringFactory.IIII("Chest"), 0.58, 0.38, 0.72);
            Illll.I = new Illll(StringFactory.IIII("Legs"), 0.24, 0.0, 0.38);
            ** while (true)
            var2_2 = "\u694d\u6941\u694c\u6941\u694d\u6941".toCharArray();
            var3_3 = new String[var2_2.length];
            ** while (true)
        }
        ** while (true)
    }

    double I() {
        return this.Il;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Illll(IIIlIIIII iIIlIIIII, double d, double d2, double d3) {
        this.lI = iIIlIIIII;
        this.Il = d;
        this.IIl = d2;
        this.l = d3;
    }

    private static /* synthetic */ Illll[] l() {
        return new Illll[]{ll, II, I};
    }

    public static Illll II(String string) {
        return Enum.valueOf(Illll.class, string);
    }

    public String toString() {
        return this.lI.IIII();
    }

    double Il() {
        return this.IIl;
    }

    double lI() {
        return this.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, int n2, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0x676D;
        char[] cArray = IlI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Ill[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            Illll.Ill[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6665;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0x51F6;
            n7 -= 52879;
            n7 += 23102;
            cArray[n6] = (char)((n7 += 38524) ^ n4 ^ s ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

