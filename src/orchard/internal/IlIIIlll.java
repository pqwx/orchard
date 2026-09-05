/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIlll
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
final class IlIIIlll
extends Enum<IlIIIlll> {
    private final boolean I;
    public static final /* enum */ IlIIIlll l;
    private final int II;
    public static final /* enum */ IlIIIlll Il;
    public static final /* enum */ IlIIIlll lI;
    private static final /* synthetic */ IlIIIlll[] ll;
    public static final /* enum */ IlIIIlll III;
    public static final /* enum */ IlIIIlll IIl;
    private static final String[] IlI;
    private static final Object[] Ill;

    public static IlIIIlll I(String string) {
        return Enum.valueOf(IlIIIlll.class, string);
    }

    private IlIIIlll(int n2, boolean bl) {
        this.II = n2;
        this.I = bl;
    }

    private static /* synthetic */ IlIIIlll[] l() {
        return new IlIIIlll[]{III, l, IIl, Il, lI};
    }

    public static IlIIIlll[] values() {
        return (IlIIIlll[])ll.clone();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block13: {
                    block14: {
                        break block14;
lbl1:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl3:
                        // 1 sources

                        while (true) {
                            var7_7 = 0;
                            break block13;
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
                            IlIIIlll.IIl = new IlIIIlll(2, true);
                            ** continue;
                            break;
                        }
lbl11:
                        // 1 sources

                        while (++var4_4 >= var2_2.length) {
                            ** continue;
lbl13:
                            // 1 sources

                            ** GOTO lbl3
                        }
                        break block15;
lbl15:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            var5_5 = 0;
                            ** continue;
                            break;
                        }
lbl20:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        IlIIIlll.Il = new IlIIIlll(3, false);
                        break block16;
lbl24:
                        // 1 sources

                        while (true) {
                            var5_5 += var6_6;
                            ** GOTO lbl11
                            break;
                        }
lbl27:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                            ** continue;
                            break;
                        }
                    }
                    var0 = 17474;
                    var1_1 = "\ub367\ub3d7\ub32c\ub3c9\ub360\u31f9\u3141\u31a5\u3141\u31ea\u3a15\u3aa0\u3a42\u3aa2\u3a0d\u3aed\u3a21\u3add\u3af2\u3a5f\u3a72\u3ac0\u0805\u08bd\u0844\u08ba\u0809\u08e5\u082c\u08c7\u14bc\u1408\u14f7\u141a\u14a6\u144d\u1485";
                    ** while (true)
                    IlIIIlll.IlI = var3_3;
                    IlIIIlll.Ill = new Object[var3_3.length];
                    ** while (true)
                    IlIIIlll.III = new IlIIIlll(0, true);
                    IlIIIlll.l = new IlIIIlll(1, true);
                    ** while (true)
lbl42:
                    // 1 sources

                    while (true) {
                        var7_7 = -1;
                        break block13;
                        break;
                    }
                    var6_6 = 0;
                    if (var7_7 == 0) {
                        ** continue;
                    }
                    break block15;
                }
                var4_4 = 0;
                ** while (true)
            }
            var6_6 = var2_2[var4_4] ^ var0;
            ** while (true)
            var2_2 = "\u4447\u4447\u444e\u444a\u4445".toCharArray();
            var3_3 = new String[var2_2.length];
            ** while (true)
        }
        IlIIIlll.lI = new IlIIIlll(4, false);
        IlIIIlll.ll = IlIIIlll.l();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x4A9E28D0;
        char[] cArray = IlI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Ill[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIIlll.Ill[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xEC7E5BFE;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 6 -> 14;
                case 11 -> 227;
                case 22 -> 209;
                case 23 -> 158;
                case 26 -> 191;
                case 9 -> 106;
                default -> 38;
                case 12 -> 151;
                case 19 -> 9;
                case 27 -> 244;
                case 5 -> 208;
                case 13 -> 98;
                case 20 -> 141;
                case 25 -> 4;
                case 1 -> 133;
                case 15 -> 198;
                case 29 -> 26;
                case 30 -> 223;
                case 7 -> 228;
                case 3 -> 134;
                case 24 -> 159;
                case 31 -> 212;
                case 10 -> 79;
                case 21 -> 38;
                case 17 -> 80;
                case 14 -> 38;
                case 28 -> 28;
                case 16 -> 231;
                case 4 -> 50;
                case 18 -> 34;
                case 2 -> 97;
                case 8 -> 214;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

