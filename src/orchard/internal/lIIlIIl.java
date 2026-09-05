/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIlIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Uppercase
 *   - Lowercase
 *   - Normal
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
import orchard.internal.lIIlll;

@Environment(value=EnvType.CLIENT)
final class lIIlIIl
extends Enum<lIIlIIl>
implements lIIlll {
    private final boolean I;
    private final IIIlIIIII l;
    public static final /* enum */ lIIlIIl II;
    public static final /* enum */ lIIlIIl Il;
    public static final /* enum */ lIIlIIl lI;
    private static final /* synthetic */ lIIlIIl[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    public static lIIlIIl II(String string) {
        return Enum.valueOf(lIIlIIl.class, string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block10: {
            block11: {
                block12: {
                    block14: {
                        block13: {
                            block9: {
                                break block10;
lbl1:
                                // 1 sources

                                while (true) {
                                    break block9;
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
                                    continue;
                                    break;
                                }
lbl7:
                                // 1 sources

                                while (true) {
                                    lIIlIIl.ll = lIIlIIl.Il();
                                    return;
                                }
                            }
                            if (++var4_4 < var2_2.length) break block11;
                            break block12;
                            lIIlIIl.III = var3_3;
                            break block13;
lbl15:
                            // 1 sources

                            while (var7_7 == 0) {
                                ** continue;
lbl17:
                                // 1 sources

                                ** GOTO lbl3
                            }
                            break block11;
lbl19:
                            // 1 sources

                            while (true) {
                                var6_6 = 0;
                                ** GOTO lbl15
                                break;
                            }
                            var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                            var5_5 += var6_6;
                            ** while (true)
                        }
                        lIIlIIl.IIl = new Object[var3_3.length];
                        break block14;
lbl28:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    lIIlIIl.Il = new lIIlIIl(StringFactory.IIII("Normal"));
                    lIIlIIl.II = new lIIlIIl(StringFactory.IIII("Uppercase"));
                    lIIlIIl.lI = new lIIlIIl(StringFactory.IIII("Lowercase"));
                    ** while (true)
                    var4_4 = 0;
                    var5_5 = 0;
                    ** while (true)
lbl38:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl40:
                    // 1 sources

                    while (true) {
                        var2_2 = "\u4912\u491c\u4911\u4918\u4911\u4918".toCharArray();
                        ** continue;
                        break;
                    }
                }
                var7_7 = 0;
                ** GOTO lbl28
            }
            var6_6 = var2_2[var4_4] ^ var0;
            ** while (true)
            var3_3 = new String[var2_2.length];
            var7_7 = -1;
            ** while (true)
        }
        var0 = 18708;
        var1_1 = "\u5559\u5590\u556e\u55cf\u5504\u55be\u54bb\u5477\u5490\u541d\u54f6\u5478\u548f\u5424\u0216\u02db\u0238\u0293\u0243\u0470\u0493\u047b\u04d2\u043d\u04b6\u045e\u04de\u04a2\u040a\u04f5\u047d\uce2e\ucee5\uce1e\uceb2\uce62\ucfdb\ucf2d\ucff0\ucf7e\ucf90\ucf1b\ucff3\ucf73\ucf0f\ucfa7\ucf58\ucfd0";
        ** while (true)
    }

    @Override
    public boolean l() {
        return this.I;
    }

    public static lIIlIIl[] values() {
        return (lIIlIIl[])ll.clone();
    }

    public String toString() {
        return this.l.IIII();
    }

    private lIIlIIl(IIIlIIIII iIIlIIIII) {
        this(iIIlIIIII, true);
    }

    private static /* synthetic */ lIIlIIl[] Il() {
        return new lIIlIIl[]{Il, II, lI};
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private lIIlIIl(IIIlIIIII iIIlIIIII, boolean bl) {
        this.l = iIIlIIIII;
        this.I = bl;
    }

    @Override
    public Enum<?> I() {
        return this;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x886A2D98;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIIlIIl.IIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x194B2CF;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 20: {
                    n6 = 68;
                    continue block33;
                }
                case 29: {
                    n6 = 62;
                    continue block33;
                }
                case 3: {
                    n6 = 175;
                    continue block33;
                }
                case 11: {
                    n6 = 22;
                    continue block33;
                }
                case 9: {
                    n6 = 99;
                    continue block33;
                }
                case 24: {
                    n6 = 110;
                    continue block33;
                }
                case 1: {
                    n6 = 242;
                    continue block33;
                }
                case 23: {
                    n6 = 59;
                    continue block33;
                }
                case 18: {
                    n6 = 129;
                    continue block33;
                }
                case 31: {
                    n6 = 82;
                    continue block33;
                }
                case 19: {
                    n6 = 215;
                    continue block33;
                }
                case 17: {
                    n6 = 6;
                    continue block33;
                }
                case 10: {
                    n6 = 230;
                    continue block33;
                }
                case 12: {
                    n6 = 20;
                    continue block33;
                }
                case 16: {
                    n6 = 122;
                    continue block33;
                }
                case 7: {
                    n6 = 179;
                    continue block33;
                }
                case 30: {
                    n6 = 127;
                    continue block33;
                }
                case 6: {
                    n6 = 18;
                    continue block33;
                }
                case 25: {
                    n6 = 186;
                    continue block33;
                }
                case 22: {
                    n6 = 175;
                    continue block33;
                }
                case 14: {
                    n6 = 196;
                    continue block33;
                }
                case 28: {
                    n6 = 116;
                    continue block33;
                }
                case 2: {
                    n6 = 17;
                    continue block33;
                }
                default: {
                    n6 = 58;
                    continue block33;
                }
                case 26: {
                    n6 = 250;
                    continue block33;
                }
                case 21: {
                    n6 = 135;
                    continue block33;
                }
                case 15: {
                    n6 = 127;
                    continue block33;
                }
                case 27: {
                    n6 = 195;
                    continue block33;
                }
                case 8: {
                    n6 = 207;
                    continue block33;
                }
                case 5: {
                    n6 = 223;
                    continue block33;
                }
                case 13: {
                    n6 = 165;
                    continue block33;
                }
                case 4: 
            }
            n6 = 104;
        }
    }
}

