/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIlIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Distance
 *   - Health
 *   - FOV
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
public final class IIIIlIIlI
extends Enum<IIIIlIIlI> {
    public static final /* enum */ IIIIlIIlI I;
    private final IIIlIIIII l;
    private static final /* synthetic */ IIIIlIIlI[] II;
    public static final /* enum */ IIIIlIIlI Il;
    public static final /* enum */ IIIIlIIlI lI;
    private static final String[] ll;
    private static final Object[] III;

    private static /* synthetic */ IIIIlIIlI[] I() {
        return new IIIIlIIlI[]{lI, I, Il};
    }

    public static IIIIlIIlI valueOf(String string) {
        return Enum.valueOf(IIIIlIIlI.class, string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block15: {
                block9: {
                    block14: {
                        block13: {
                            block10: {
                                block12: {
                                    block8: {
                                        break block11;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl3:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl5:
                                        // 1 sources

                                        while (true) {
                                            break block8;
                                            break;
                                        }
lbl7:
                                        // 1 sources

                                        while (true) {
                                            var6_6 = 0;
                                            if (var7_7 != 0) break block9;
                                            break block10;
                                            break;
                                        }
                                    }
                                    if (++var4_4 < var2_2.length) break block9;
                                    break block12;
lbl14:
                                    // 1 sources

                                    while (true) {
                                        IIIIlIIlI.II = IIIIlIIlI.I();
                                        return;
                                    }
                                }
                                var7_7 = 0;
                                break block13;
                            }
                            IIIIlIIlI.ll = var3_3;
                            ** while (true)
                            IIIIlIIlI.III = new Object[var3_3.length];
                            break block14;
                        }
lbl26:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                        var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                        var5_5 += var6_6;
                        ** while (true)
                    }
                    IIIIlIIlI.lI = new IIIIlIIlI(StringFactory.IIII("FOV"));
                    break block15;
                }
                var6_6 = var2_2[var4_4] ^ var0;
                ** while (true)
lbl37:
                // 1 sources

                while (true) {
                    continue;
lbl39:
                    // 1 sources

                    while (true) {
                        var7_7 = -1;
                        ** continue;
                        break;
                    }
                    var2_2 = "\u527e\u5279\u527b\u5275\u5275\u5271".toCharArray();
                    var3_3 = new String[var2_2.length];
                    ** continue;
                    break;
                }
            }
            IIIIlIIlI.I = new IIIIlIIlI(StringFactory.IIII("Health"));
            IIIIlIIlI.Il = new IIIIlIIlI(StringFactory.IIII("Distance"));
            ** while (true)
        }
        var0 = 21117;
        var1_1 = "\u67a1\u6646\u67b1\u13c6\u13ca\u13c8\u132f\ue7c9\ue7c2\ue71e\ue7cd\ue715\ue7c9\udcd6\udcc1\udced\udcbd\udcde\udce8\udc98\udc8d\u925e\u920d\u926f\u926e\u9205\u9208\u925f\u9261\u2f21\u2efd\u2f04\u2ef7\u2f1c\u2ef5\u2f17\u2f2d\u2f00\u2fc7\u2f1a\u2f08";
        ** while (true)
        var4_4 = 0;
        var5_5 = 0;
        ** while (true)
    }

    public String toString() {
        return this.l.IIII();
    }

    private IIIIlIIlI(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    public static IIIIlIIlI[] values() {
        return (IIIIlIIlI[])II.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(char c, char c2, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xAA1D;
        char[] cArray = ll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIlIIlI.III[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x59D9;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 56772;
            n6 -= 21505;
            n6 -= 32865;
            n6 += 63210;
            n6 -= 26294;
            n6 ^= 0x6552;
            n6 -= 21961;
            cArray[n5] = (char)((n6 -= 5314) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

