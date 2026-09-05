/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlllII
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

import java.util.ArrayList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.Illllll;
import orchard.internal.lllIlI;

@Environment(value=EnvType.CLIENT)
final class IlIlllII {
    private final boolean I;
    private final int l;
    private final boolean II;
    private final lllIlI Il;
    private final Illllll lI;
    private static final String[] ll;
    private static final Object[] III;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean I(Illllll illllll, int n) {
        if (this.lI != illllll) return false;
        if (this.l != n) return false;
        return true;
    }

    static IlIlllII l() {
        return new IlIlllII(null, null, -1, false, true);
    }

    /*
     * Unable to fully structure code
     */
    void II(String var1_1) {
        block8: {
            block17: {
                block13: {
                    block9: {
                        block12: {
                            block16: {
                                block14: {
                                    block11: {
                                        block10: {
                                            block15: {
                                                if (this.Il == null) break block14;
                                                break block15;
lbl3:
                                                // 1 sources

                                                return;
                                                while (true) {
                                                    break block8;
                                                    break;
                                                }
lbl7:
                                                // 1 sources

                                                while (true) {
                                                    var7_7 = var6_6.trim();
                                                    if (!var7_7.isEmpty()) break block9;
lbl10:
                                                    // 2 sources

                                                    while (true) {
                                                        ++var5_5;
                                                        break block10;
                                                        break;
                                                    }
                                                    break;
                                                }
lbl13:
                                                // 1 sources

                                                while (this.l >= this.lI.lll().size()) {
                                                    break block11;
                                                }
                                                break block16;
lbl16:
                                                // 1 sources

                                                while (true) {
                                                    if (this.l < 0) ** continue;
                                                    ** GOTO lbl13
                                                    break;
                                                }
                                            }
                                            this.Il.Il(var1_1);
                                            ** while (true)
lbl22:
                                            // 2 sources

                                            return;
                                        }
lbl25:
                                        // 2 sources

                                        while (true) {
                                            if (var5_5 >= var4_4) break block12;
                                            break block13;
                                            break;
                                        }
                                    }
                                    this.lI.IlI(var1_1);
                                    break block17;
                                }
                                if (this.lI == null) ** GOTO lbl22
                                ** while (true)
                            }
                            this.lI.lI(this.l, var1_1);
                            break block17;
                        }
                        this.lI.IlII(var2_2);
                        ** while (true)
                    }
                    var2_2.add(var7_7);
                    ** while (true)
                }
                var6_6 = var3_3[var5_5];
                ** while (true)
            }
            return;
        }
        var2_2 = new ArrayList<String>();
        var3_3 = var1_1.split("[,;]");
        var4_4 = var3_3.length;
        var5_5 = 0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    boolean Il(IlIlllII ilIlllII) {
        if (ilIlllII == null) return false;
        if (this.Il != ilIlllII.Il) return false;
        if (this.lI != ilIlllII.lI) return false;
        if (this.l != ilIlllII.l) return false;
        if (this.I != ilIlllII.I) return false;
        if (this.II == ilIlllII.II) return true;
        return false;
    }

    static IlIlllII lI(Illllll illllll, int n) {
        return new IlIlllII(null, illllll, n, false, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIlllII(lllIlI lllIlI2, Illllll illllll, int n, boolean bl, boolean bl2) {
        this.Il = lllIlI2;
        this.lI = illllll;
        this.l = n;
        this.I = bl;
        this.II = bl2;
    }

    static IlIlllII ll() {
        return new IlIlllII(null, null, -1, true, false);
    }

    static IlIlllII III(Illllll illllll) {
        return new IlIlllII(null, illllll, -1, false, false);
    }

    static IlIlllII IIl(lllIlI lllIlI2) {
        return new IlIlllII(lllIlI2, null, -1, false, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 22318;
        String string = "\u921d\u928f\u927f\u92c3\u92bf\u92b8\u9247\u9280";
        char[] cArray = "\u5726".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
        ll = stringArray;
        III = new Object[stringArray.length];
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IlI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xEBB2B5EC;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIlllII.III[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x332002C1;
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
                case 2: {
                    n6 = 229;
                    continue block33;
                }
                case 8: {
                    n6 = 96;
                    continue block33;
                }
                case 20: {
                    n6 = 226;
                    continue block33;
                }
                case 29: {
                    n6 = 49;
                    continue block33;
                }
                case 4: {
                    n6 = 45;
                    continue block33;
                }
                case 25: {
                    n6 = 91;
                    continue block33;
                }
                case 28: {
                    n6 = 120;
                    continue block33;
                }
                case 14: {
                    n6 = 18;
                    continue block33;
                }
                case 7: {
                    n6 = 64;
                    continue block33;
                }
                case 17: {
                    n6 = 77;
                    continue block33;
                }
                case 15: {
                    n6 = 66;
                    continue block33;
                }
                case 12: {
                    n6 = 192;
                    continue block33;
                }
                case 24: {
                    n6 = 117;
                    continue block33;
                }
                case 30: {
                    n6 = 187;
                    continue block33;
                }
                case 13: {
                    n6 = 10;
                    continue block33;
                }
                case 26: {
                    n6 = 243;
                    continue block33;
                }
                case 27: {
                    n6 = 228;
                    continue block33;
                }
                case 16: {
                    n6 = 187;
                    continue block33;
                }
                default: {
                    n6 = 143;
                    continue block33;
                }
                case 6: {
                    n6 = 135;
                    continue block33;
                }
                case 1: {
                    n6 = 75;
                    continue block33;
                }
                case 10: {
                    n6 = 74;
                    continue block33;
                }
                case 18: {
                    n6 = 73;
                    continue block33;
                }
                case 11: {
                    n6 = 254;
                    continue block33;
                }
                case 9: {
                    n6 = 238;
                    continue block33;
                }
                case 3: {
                    n6 = 110;
                    continue block33;
                }
                case 5: {
                    n6 = 20;
                    continue block33;
                }
                case 31: {
                    n6 = 7;
                    continue block33;
                }
                case 22: {
                    n6 = 68;
                    continue block33;
                }
                case 21: {
                    n6 = 11;
                    continue block33;
                }
                case 19: {
                    n6 = 140;
                    continue block33;
                }
                case 23: 
            }
            n6 = 69;
        }
    }
}

