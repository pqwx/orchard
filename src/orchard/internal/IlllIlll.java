/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - hashCode
 *   - toString
 *   - equals
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

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.IlIIIlII;
import orchard.internal.IlIIIlIll;

@Environment(value=EnvType.CLIENT)
final class IlllIlll
implements InvocationHandler {
    private static String[] I;
    private final IlIIIlIll l;
    private static final int[] II;
    private static final String[] Il;
    private static final Object[] lI;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public Object invoke(Object var1_1, Method var2_2, Object[] var3_3) {
        block14: {
            if (var2_2.getDeclaringClass() != Object.class) ** GOTO lbl8
            var4_4 = var2_2.getName();
            var5_6 = -1;
            switch (var4_4.hashCode()) {
                case 147696667: {
                    if (!var4_4.equals("hashCode")) ** GOTO lbl13
                    ** GOTO lbl15
                }
lbl8:
                // 1 sources

                if (var3_3 == null) ** GOTO lbl-1000
                ** GOTO lbl17
                case -1295482945: {
                    if (var4_4.equals("equals")) {
                        var5_6 = 2;
                    }
                }
lbl13:
                // 6 sources

                default: {
                    break block14;
                }
lbl15:
                // 1 sources

                var5_6 = 1;
                break block14;
lbl17:
                // 1 sources

                if (var3_3.length > 0) {
                    v0 = var3_3[0];
                } else lbl-1000:
                // 2 sources

                {
                    v0 = null;
                }
                var4_5 = v0;
                this.l.afterEntities(new IlIIIlII(var4_5));
                return null;
                case -1776922004: 
            }
            if (var4_4.equals("toString")) ** GOTO lbl36
        }
        switch (var5_6) {
            default: {
                return null;
            }
            case 1: {
                v1 = System.identityHashCode(var1_1);
                return v1;
            }
            case 2: {
                if (var1_1 != (var3_3 != null && var3_3.length != 0 ? var3_3[0] : null)) ** GOTO lbl38
                ** GOTO lbl40
            }
lbl36:
            // 1 sources

            var5_6 = 0;
            ** GOTO lbl13
lbl38:
            // 1 sources

            v2 = false;
            ** GOTO lbl41
lbl40:
            // 1 sources

            v2 = true;
lbl41:
            // 2 sources

            v1 = v2;
            return v1;
            case 0: 
        }
        return "IlovcatsWorldRenderAfterEntitiesProxy";
    }

    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0x4AB5F5B9 ^ n;
        int n3 = 0;
        while (n3 < cArray.length) {
            n2 = n2 ^ (int)l2 ^ ~n3;
            n2 ^= n - n3 * cArray.length;
            n2 = -n2 * n | n3;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            int n4 = n3 & 0xFF;
            n = n << n4 | n >>> -n4;
            l2 ^= (long)n4;
            ++n3;
        }
        return new String(cArray);
    }

    private IlllIlll(IlIIIlIll ilIIIlIll) {
        this.l = ilIIIlIll;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block28: {
            block27: {
                block26: {
                    var6 = 29908;
                    ** GOTO lbl63
lbl3:
                    // 1 sources

                    while (true) {
                        var4_15 = 0;
                        ** GOTO lbl37
                        break;
                    }
lbl6:
                    // 1 sources

                    while (true) {
                        if (var15_13 < var14_12.length) break block26;
                        ** GOTO lbl57
lbl9:
                        // 1 sources

                        while (true) {
                            v0 = 121;
                            ** GOTO lbl51
                            break;
                        }
                        break;
                    }
lbl12:
                    // 1 sources

                    while (true) {
                        var11_9 = 0;
                        ** GOTO lbl35
                        break;
                    }
lbl15:
                    // 2 sources

                    while (true) {
                        var12_10 = var8_6[var10_8];
                        ** GOTO lbl70
                        break;
                    }
lbl18:
                    // 1 sources

                    while (true) {
                        var13_11 = 0;
                        ** GOTO lbl39
                        break;
                    }
                }
                block13: while (true) {
                    switch (var15_13 % 6) {
                        case 1: {
                            ** continue;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl28:
                        // 1 sources

                        while (true) {
                            IlllIlll.I = new String[4];
                            IlllIlll.l();
                            return;
                        }
lbl32:
                        // 1 sources

                        while (true) {
                            IlllIlll.Il = var9_7;
                            ** continue;
                            break;
                        }
lbl35:
                        // 1 sources

                        var12_10 = '\u0000';
                        break block27;
lbl37:
                        // 2 sources

                        while (true) {
                            ** GOTO lbl89
                            break;
                        }
lbl39:
                        // 2 sources

                        while (true) {
                            var10_8 = 0;
                            ** continue;
                            break;
                        }
lbl42:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl44:
                        // 1 sources

                        while (true) {
                            var13_11 = -1;
                            ** continue;
                            break;
                        }
lbl47:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl49:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl51:
                        // 6 sources

                        while (true) {
                            var16_14 = v0;
                            break block28;
                            break;
                        }
                        case 3: {
                            v0 = 55;
                            ** GOTO lbl51
                        }
lbl57:
                        // 1 sources

                        var9_7[var10_8] = new String(var14_12).intern();
                        var11_9 += var12_10;
                        ** GOTO lbl88
                        case 4: {
                            v0 = 46;
                            ** GOTO lbl51
                        }
lbl63:
                        // 1 sources

                        var7_5 = "\u7830\u364c\u956e\ub4b9\uba74\u6665\ub601\u6496\u0436\uc8a7\u8979\u76d9\u151a\u2191\u6774\u6fbb\u27a8\u9bb1\u8d05\u6e17\u6db3\uc367\u8119\uc244\uc984\ub722\u7a85\u7de2\udd99\u05538\u6903\ubc98\ud98f\u8f67\uba47\uab29\uf039\u83d6\u7376\u5d37\u7524\u7f05\u73eb\u5030\u7005\u55d0\ua788\u98bb\u0295\u03a1\u852e\uef8f\u2aef\u20d1\u58fb\u296a\uefa2\u703b\u9432\uf801\u59b7\u15c4\uc397\uf9a5\u4d10\ub5f5\u5464\u3728\u115b\udfe1\uc8bc\u1ef5\u8d20";
                        ** continue;
                        IlllIlll.II = new int[var1_2];
                        var3_4 = 0;
                        ** continue;
lbl68:
                        // 1 sources

                        while (true) {
                            ** continue;
                            break;
                        }
lbl70:
                        // 1 sources

                        var14_12 = var7_5.substring(var11_9, var11_9 + var12_10).toCharArray();
                        var15_13 = 0;
                        continue block13;
                        case 5: {
                            v0 = 87;
                            ** GOTO lbl51
                        }
lbl76:
                        // 1 sources

                        while (true) {
                            if (++var10_8 < var8_6.length) ** GOTO lbl15
                            ** continue;
                            break;
                        }
                        IlllIlll.lI = new Object[var9_7.length];
                        var2_3 = 1230448982;
                        ** continue;
                        var0_1 = "!S&Bp\t\u00f5-\u007f\u00d2\u0085o\u008e)\u00ccz\u00c9\u00ee\u00ae\u00c0\u009cI\u008e\u00e8".getBytes("ISO-8859-1");
                        var1_2 = var0_1.length / 4;
                        ** continue;
                        var8_6 = "4\b\b\u0006".toCharArray();
                        var9_7 = new String[var8_6.length];
                        ** continue;
lbl88:
                        // 1 sources

                        ** continue;
lbl89:
                        // 1 sources

                        var5_16 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                        IlllIlll.II[var4_15] = var5_16 ^= var2_3;
                        var3_4 += 4;
                        if (++var4_15 < var1_2) ** continue;
                        ** continue;
                        case 2: {
                            v0 = 110;
                            ** GOTO lbl51
                        }
                    }
                    break;
                }
                v0 = 95;
                ** while (true)
            }
            if (var13_11 == 0) ** break;
            ** while (true)
            ** while (true)
        }
        v1 = var15_13++;
        var14_12[v1] = (char)(var14_12[v1] ^ var16_14 ^ var6);
        ** while (true)
    }

    private static void l() {
        IlllIlll.I[0] = IlllIlll.I(IlllIlll.Il(-263933580, -1781238289).toCharArray(), 39206L, -557900093);
        IlllIlll.I[1] = IlllIlll.I(IlllIlll.Il(-263933579, 1596483963).toCharArray(), 22836L, 1507978270);
        IlllIlll.I[2] = IlllIlll.I(IlllIlll.Il(-263933578, 141846706).toCharArray(), 34965L, -667654062);
        IlllIlll.I[3] = IlllIlll.I(IlllIlll.Il(-263933577, -1544411503).toCharArray(), 77288L, -1117193276);
    }

    private static int II(int n, int n2) {
        return II[n ^ 0x9ED409F8] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String Il(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xF044B174;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlllIlll.lI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4589E028;
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
                default: {
                    n6 = 199;
                    continue block33;
                }
                case 31: {
                    n6 = 241;
                    continue block33;
                }
                case 4: {
                    n6 = 181;
                    continue block33;
                }
                case 11: {
                    n6 = 253;
                    continue block33;
                }
                case 7: {
                    n6 = 100;
                    continue block33;
                }
                case 8: {
                    n6 = 185;
                    continue block33;
                }
                case 18: {
                    n6 = 119;
                    continue block33;
                }
                case 14: {
                    n6 = 30;
                    continue block33;
                }
                case 10: {
                    n6 = 169;
                    continue block33;
                }
                case 25: {
                    n6 = 77;
                    continue block33;
                }
                case 27: {
                    n6 = 119;
                    continue block33;
                }
                case 19: {
                    n6 = 236;
                    continue block33;
                }
                case 5: {
                    n6 = 150;
                    continue block33;
                }
                case 15: {
                    n6 = 94;
                    continue block33;
                }
                case 6: {
                    n6 = 219;
                    continue block33;
                }
                case 22: {
                    n6 = 203;
                    continue block33;
                }
                case 16: {
                    n6 = 174;
                    continue block33;
                }
                case 17: {
                    n6 = 227;
                    continue block33;
                }
                case 28: {
                    n6 = 224;
                    continue block33;
                }
                case 1: {
                    n6 = 207;
                    continue block33;
                }
                case 24: {
                    n6 = 43;
                    continue block33;
                }
                case 13: {
                    n6 = 200;
                    continue block33;
                }
                case 21: {
                    n6 = 116;
                    continue block33;
                }
                case 30: {
                    n6 = 215;
                    continue block33;
                }
                case 29: {
                    n6 = 81;
                    continue block33;
                }
                case 20: {
                    n6 = 121;
                    continue block33;
                }
                case 3: {
                    n6 = 28;
                    continue block33;
                }
                case 2: {
                    n6 = 61;
                    continue block33;
                }
                case 9: {
                    n6 = 129;
                    continue block33;
                }
                case 12: {
                    n6 = 33;
                    continue block33;
                }
                case 23: {
                    n6 = 197;
                    continue block33;
                }
                case 26: 
            }
            n6 = 158;
        }
    }
}

