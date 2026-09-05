/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIlIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Compact
 *   - Vinyl
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
final class llIIlIl
extends Enum<llIIlIl> {
    public static final /* enum */ llIIlIl I;
    private static final /* synthetic */ llIIlIl[] l;
    private final IIIlIIIII II;
    public static final /* enum */ llIIlIl Il;
    private static final String[] lI;
    private static final Object[] ll;

    public static llIIlIl valueOf(String string) {
        return Enum.valueOf(llIIlIl.class, string);
    }

    private llIIlIl(IIIlIIIII iIIlIIIII) {
        this.II = iIIlIIIII;
    }

    public String toString() {
        return this.II.IIII();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            block17: {
                block12: {
                    block13: {
                        block14: {
                            block16: {
                                break block16;
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
                                    var7_7 = -1;
                                    break block12;
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (true) {
                                    var5_5 += var6_6;
                                    break block13;
                                    break;
                                }
lbl11:
                                // 1 sources

                                while (true) {
                                    llIIlIl.l = llIIlIl.I();
                                    return;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    if (++var4_4 < var2_2.length) break block14;
                                    break block15;
                                    break;
                                }
lbl17:
                                // 1 sources

                                while (true) {
                                    llIIlIl.Il = new llIIlIl(StringFactory.IIII("Vinyl"));
                                    ** continue;
                                    break;
                                }
                                var5_5 = 0;
                                break block17;
lbl22:
                                // 1 sources

                                while (true) {
                                    llIIlIl.I = new llIIlIl(StringFactory.IIII("Compact"));
                                    ** continue;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                                    ** continue;
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var0 = 28070;
                            var1_1 = "\ub442\ub4f4\ub4e1\ub4ed\ub4b2\ub499\ub4e6\u90e3\u9019\u904f\u9070\u900e\u900f\u904d\u9072\u90e4\u9020\u901a\u90e4\u4afc\u4a59\u4a49\u4a4f\u4a14\u8c12\u8caa\u8cfc\u8cbd\u8cfa\u8ce9\u8c86\u8cec";
                            ** while (true)
                        }
lbl35:
                        // 2 sources

                        while (true) {
                            var6_6 = var2_2[var4_4] ^ var0;
                            ** continue;
                            break;
                        }
                    }
                    ** while (true)
                }
lbl41:
                // 2 sources

                while (true) {
                    var4_4 = 0;
                    ** continue;
                    break;
                }
                llIIlIl.lI = var3_3;
                llIIlIl.ll = new Object[var3_3.length];
                ** while (true)
                var2_2 = "\u6da1\u6daa\u6da3\u6dae".toCharArray();
                var3_3 = new String[var2_2.length];
                ** while (true)
            }
            var6_6 = 0;
            ** while (var7_7 != 0)
lbl53:
            // 1 sources

            ** while (true)
        }
        var7_7 = 0;
        ** while (true)
    }

    public static llIIlIl[] values() {
        return (llIIlIl[])l.clone();
    }

    private static /* synthetic */ llIIlIl[] I() {
        return new llIIlIl[]{I, Il};
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String l(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x4D479181;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIIlIl.ll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1E8656B7;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 29 -> 190;
                case 19 -> 187;
                case 31 -> 252;
                case 24 -> 133;
                case 1 -> 219;
                case 18 -> 205;
                case 30 -> 72;
                case 4 -> 147;
                case 2 -> 204;
                case 26 -> 204;
                case 16 -> 253;
                case 17 -> 215;
                case 21 -> 58;
                case 7 -> 208;
                case 28 -> 151;
                case 14 -> 88;
                case 20 -> 169;
                case 27 -> 247;
                case 3 -> 221;
                default -> 97;
                case 12 -> 155;
                case 9 -> 150;
                case 11 -> 46;
                case 10 -> 208;
                case 15 -> 140;
                case 8 -> 65;
                case 6 -> 210;
                case 5 -> 186;
                case 13 -> 73;
                case 25 -> 163;
                case 23 -> 102;
                case 22 -> 22;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

