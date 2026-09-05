/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIlIlI
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
public final class IlIIIlIlI
extends Enum<IlIIIlIlI> {
    public static final /* enum */ IlIIIlIlI I;
    private static final /* synthetic */ IlIIIlIlI[] l;
    public static final /* enum */ IlIIIlIlI II;
    private final IIIlIIIII Il;
    private static final String[] lI;
    private static final Object[] ll;

    public String toString() {
        return this.Il.IIII();
    }

    private IlIIIlIlI(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block10: {
                block15: {
                    block12: {
                        block11: {
                            block13: {
                                var0 = 3206;
                                break block13;
lbl3:
                                // 1 sources

                                while (true) {
                                    var7_4 = -1;
                                    break block10;
                                    break;
                                }
lbl6:
                                // 1 sources

                                while (true) {
                                    var3_3 = new String[var2_2.length];
                                    ** continue;
                                    break;
                                }
lbl9:
                                // 1 sources

                                while (true) {
                                    IlIIIlIlI.l = IlIIIlIlI.I();
                                    return;
                                }
lbl12:
                                // 1 sources

                                while (true) {
                                    var5_6 += var6_7;
                                    break block11;
                                    break;
                                }
lbl15:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl17:
                                // 1 sources

                                while (var7_4 == 0) {
                                    break block12;
                                }
                                break block14;
lbl20:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var1_1 = "\u0305\u02ef\u02ec\u02f3\u02ea\u0304\u7acf\u7b8b\u7b8f\u7af7\u7ae3\u7aee\u7adc\u7afc\u115d\u115e\u1151\u1160\u1164\u115f\ua1b5\ua19b\ua167\ua195\ua1bd\ua192\ua0f1\ua0ee";
                            var2_2 = "\u0c80\u0c8e\u0c80\u0c8e".toCharArray();
                            ** while (true)
                            var5_6 = 0;
                            var6_7 = 0;
                            ** GOTO lbl17
lbl29:
                            // 1 sources

                            while (true) {
                                var7_4 = 0;
                                break block10;
                                break;
                            }
                            IlIIIlIlI.ll = new Object[var3_3.length];
                            break block15;
lbl34:
                            // 1 sources

                            while (true) {
                                var3_3[var4_5] = var1_1.substring(var5_6, var5_6 + var6_7);
                                ** continue;
                                break;
                            }
                        }
                        if (++var4_5 >= var2_2.length) {
                            ** continue;
                        }
                        break block14;
                    }
                    IlIIIlIlI.lI = var3_3;
                    ** while (true)
                }
                IlIIIlIlI.I = new IlIIIlIlI(StringFactory.IIII("Silent"));
                IlIIIlIlI.II = new IlIIIlIlI(StringFactory.IIII("Legit"));
                ** while (true)
            }
            var4_5 = 0;
            ** while (true)
        }
        var6_7 = var2_2[var4_5] ^ var0;
        ** while (true)
    }

    public static IlIIIlIlI[] values() {
        return (IlIIIlIlI[])l.clone();
    }

    public static IlIIIlIlI valueOf(String string) {
        return Enum.valueOf(IlIIIlIlI.class, string);
    }

    private static /* synthetic */ IlIIIlIlI[] I() {
        return new IlIIIlIlI[]{I, II};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(int n, int n2, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xCAEA;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIIlIlI.ll[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6066;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 15181;
            n7 += 49031;
            n7 ^= 0x1D9F;
            n7 += 51257;
            n7 -= 59855;
            n7 += 52605;
            n7 += 23516;
            n7 ^= 0xFBC4;
            cArray[n6] = (char)((n7 ^= 0xACA) ^ n4 ^ c ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

