/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIlIlll
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
final class IIIIlIlll
extends Enum<IIIIlIlll> {
    private static final /* synthetic */ IIIIlIlll[] I;
    public static final /* enum */ IIIIlIlll l;
    public static final /* enum */ IIIIlIlll II;
    private static final String[] Il;
    private static final Object[] lI;

    private static /* synthetic */ IIIIlIlll[] I() {
        return new IIIIlIlll[]{II, l};
    }

    public static IIIIlIlll[] values() {
        return (IIIIlIlll[])I.clone();
    }

    public static IIIIlIlll valueOf(String string) {
        return Enum.valueOf(IIIIlIlll.class, string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block16: {
                block15: {
                    block13: {
                        block12: {
                            break block14;
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
                                continue;
                                break;
                            }
lbl6:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl8:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                var7_7 = 0;
                                break block13;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                var2_2 = "\u7db4\u7db3".toCharArray();
                                ** continue;
                                break;
                            }
lbl16:
                            // 1 sources

                            while (true) {
                                IIIIlIlll.II = new IIIIlIlll();
                                ** continue;
                                break;
                            }
                            var6_6 = 0;
                            if (var7_7 != 0) break block15;
                            break block16;
                        }
                        if (++var4_4 >= var2_2.length) {
                            ** continue;
                        }
                        break block15;
                        IIIIlIlll.l = new IIIIlIlll();
                        IIIIlIlll.I = IIIIlIlll.I();
                        return;
lbl29:
                        // 1 sources

                        while (true) {
                            var5_5 = 0;
                            ** continue;
                            break;
                        }
lbl32:
                        // 1 sources

                        while (true) {
                            var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                            ** continue;
                            break;
                        }
                    }
lbl36:
                    // 2 sources

                    while (true) {
                        var4_4 = 0;
                        ** continue;
                        break;
                    }
                }
                var6_6 = var2_2[var4_4] ^ var0;
                ** while (true)
                var3_3 = new String[var2_2.length];
                var7_7 = -1;
                ** while (true)
lbl45:
                // 1 sources

                while (true) {
                    IIIIlIlll.lI = new Object[var3_3.length];
                    ** continue;
                    break;
                }
            }
            IIIIlIlll.Il = var3_3;
            ** while (true)
        }
        var0 = 32183;
        var1_1 = "\u3bd3\u3b20\u3b06\uea63\uea85\ueabc\uea95";
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xB211A8EE;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIlIlll.lI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2190EA7F;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                default -> 158;
                case 15 -> 59;
                case 18 -> 215;
                case 24 -> 170;
                case 9 -> 218;
                case 10 -> 74;
                case 25 -> 188;
                case 26 -> 77;
                case 23 -> 57;
                case 30 -> 90;
                case 1 -> 116;
                case 11 -> 83;
                case 27 -> 238;
                case 17 -> 145;
                case 3 -> 96;
                case 7 -> 189;
                case 2 -> 79;
                case 13 -> 2;
                case 16 -> 91;
                case 19 -> 33;
                case 29 -> 145;
                case 14 -> 41;
                case 21 -> 113;
                case 31 -> 185;
                case 4 -> 152;
                case 6 -> 105;
                case 22 -> 232;
                case 12 -> 57;
                case 20 -> 57;
                case 28 -> 12;
                case 5 -> 242;
                case 8 -> 113;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

