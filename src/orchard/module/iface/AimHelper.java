/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllllIlI
 * Module         : Aim Helper  [IFACE]
 * Description    : Removed legacy helper   (client's own text)
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
package orchard.module.iface;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;

@Environment(value=EnvType.CLIENT)
public final class AimHelper
extends ModuleBase {
    private static volatile AimHelper I;
    private static final String[] l;
    private static final Object[] II;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static AimHelper lI() {
        AimHelper aimHelper = I;
        if (aimHelper != null) return aimHelper;
        Class<AimHelper> clazz = AimHelper.class;
        synchronized (AimHelper.class) {
            aimHelper = I;
            if (aimHelper != null) return aimHelper;
            I = aimHelper = new AimHelper();
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return aimHelper;
        }
    }

    private AimHelper() {
        super(StringFactory.IIII("Aim Helper"), Category.lI, StringFactory.IIII("Removed legacy helper"));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block25: {
                block26: {
                    block22: {
                        block21: {
                            break block24;
lbl1:
                            // 1 sources

                            while (true) {
                                continue;
lbl3:
                                // 1 sources

                                while (true) {
                                    v0 = 79;
                                    ** GOTO lbl13
                                    break;
                                }
                                break;
                            }
lbl6:
                            // 1 sources

                            while (true) {
                                block23: {
                                    if (var9_9 < var8_8.length) break block23;
                                    break block21;
lbl9:
                                    // 1 sources

                                    while (true) {
                                        break block22;
                                        break;
                                    }
lbl11:
                                    // 1 sources

                                    while (true) {
                                        v0 = 72;
lbl13:
                                        // 5 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        break;
                                    }
lbl15:
                                    // 2 sources

                                    while (true) {
                                        continue;
lbl17:
                                        // 1 sources

                                        while (true) {
                                            v0 = 100;
                                            ** GOTO lbl13
                                            break;
                                        }
                                        var6_6 = var2_2[var4_4];
                                        var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                                        var9_9 = 0;
                                        break block23;
                                        break;
                                    }
lbl24:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl26:
                                    // 1 sources

                                    while (true) {
                                        v0 = 63;
                                        ** GOTO lbl13
                                        break;
                                    }
lbl29:
                                    // 1 sources

                                    while (true) {
                                        v0 = 79;
                                        ** continue;
                                        break;
                                    }
                                }
                                switch (var9_9 % 5) {
                                    default: {
                                        ** continue;
                                    }
                                    case 2: {
                                        ** continue;
                                    }
                                    case 1: {
                                        ** continue;
                                    }
                                    case 3: {
                                        ** continue;
                                    }
                                    ** case 4:
lbl43:
                                    // 1 sources

                                    ** continue;
                                }
                                break;
                            }
                            var6_6 = '\u0000';
                            if (var7_7 != 0) ** GOTO lbl15
                            break block25;
                            var4_4 = 0;
                            var5_5 = 0;
                            ** while (true)
                        }
                        var3_3[var4_4] = new String(var8_8).intern();
                        var5_5 += var6_6;
                        ** while (true)
lbl54:
                        // 1 sources

                        while (true) {
                            var7_7 = -1;
                            ** GOTO lbl24
                            break;
                        }
                    }
                    if (++var4_4 >= var2_2.length) ** break;
                    ** while (true)
                    break block26;
lbl61:
                    // 1 sources

                    while (true) {
                        AimHelper.II = new Object[var3_3.length];
                        return;
                    }
                }
                var7_7 = 0;
                ** while (true)
lbl67:
                // 1 sources

                while (true) {
                    var3_3 = new String[var2_2.length];
                    ** continue;
                    break;
                }
            }
            AimHelper.l = var3_3;
            ** while (true)
        }
        var0 = 27104;
        var1_1 = "\ubb30\ubb7f\ubb0b\ubb22\ubb2e\ubb06\ubbba\ubb3d\ubb2c\ubb68\ubb9a\ubbb5\ubbef\ubb4a\ubb07\ubb29\ua091\ua0f0\ua0d9\ua087\ua0d3\ua090\ua060\ua098\ua087\ua0ca\ua03f\ua021\ua049\ua0d2\ua0f7\ua0e8\ua04f\ua0a7\ua035\ua0cf\ua046\ua08d\ua02f\ua0d3\ua07d\ua0ea\ua054\ua060";
        var2_2 = "\u0010\u001c".toCharArray();
        ** while (true)
lbl78:
        // 1 sources

        while (true) {
            ** continue;
            break;
        }
        var10_10 = v0;
        v1 = var9_9++;
        var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static String IIl(int var0, int var1_1) {
        block53: {
            block51: {
                block52: {
                    break block52;
lbl1:
                    // 1 sources

                    while (true) {
                        var9_9 = 142;
                        ** GOTO lbl112
                        break;
                    }
lbl4:
                    // 1 sources

                    while (true) {
                        var9_9 = 241;
                        ** GOTO lbl112
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var9_9 = 183;
                        ** GOTO lbl112
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        var5_5 = new Throwable().getStackTrace();
                        ** GOTO lbl97
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var9_9 = 2;
                        if (true) ** GOTO lbl112
                        break;
                    }
                }
                var3_2 = var0 ^ -1111394488;
                break block53;
                block38: while (true) {
                    ** GOTO lbl86
lbl21:
                    // 1 sources

                    while (true) {
                        var9_9 = 61;
                        ** GOTO lbl112
                        break;
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        var9_9 = 57;
                        ** GOTO lbl112
                        break;
                    }
lbl27:
                    // 1 sources

                    while (true) {
                        var9_9 = 189;
                        ** GOTO lbl112
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        var9_9 = 100;
                        ** GOTO lbl112
                        break;
                    }
lbl33:
                    // 1 sources

                    while (true) {
                        var9_9 = 201;
                        ** GOTO lbl112
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        var9_9 = 167;
                        ** GOTO lbl112
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var9_9 = 187;
                        ** GOTO lbl112
                        break;
                    }
lbl42:
                    // 1 sources

                    while (true) {
                        var9_9 = 246;
                        ** GOTO lbl112
                        break;
                    }
lbl45:
                    // 1 sources

                    block47: while (true) {
                        switch (var8_8 & 31) {
                            case 2: {
                                ** continue;
                            }
                            case 5: {
                                ** continue;
                            }
                            case 8: {
                                ** continue;
                            }
                            case 26: {
                                ** continue;
                            }
                            case 27: {
                                ** continue;
                            }
                            case 24: {
                                ** continue;
                            }
                            case 1: {
                                ** continue;
                            }
                            case 6: {
                                ** continue;
                            }
                            case 31: {
                                ** continue;
                            }
                            case 15: {
                                ** continue;
                            }
                            case 3: {
                                ** continue;
                            }
                            default: {
                                ** continue;
                            }
                            case 20: {
                                var9_9 = 60;
                                ** GOTO lbl112
                            }
                            case 25: {
                                var9_9 = 182;
                                ** GOTO lbl112
                            }
                            case 19: {
                                var9_9 = 188;
                                ** GOTO lbl112
                            }
                            case 30: {
                                var9_9 = 79;
                                ** GOTO lbl112
                            }
                            case 10: {
                                var9_9 = 80;
                                ** GOTO lbl112
                            }
lbl86:
                            // 1 sources

                            if (++var8_8 < var4_4.length) continue block47;
                            break block51;
                            case 11: {
                                var9_9 = 126;
                                ** GOTO lbl112
                            }
                            case 22: {
                                var9_9 = 12;
                                ** GOTO lbl112
                            }
lbl94:
                            // 1 sources

                            while (true) {
                                var5_5 = var2_3;
                                ** GOTO lbl108
                                break;
                            }
lbl97:
                            // 1 sources

                            AimHelper.II[var3_2] = var5_5;
                            ** GOTO lbl108
                            case 23: {
                                var9_9 = 236;
                                ** GOTO lbl112
                            }
                            case 17: {
                                var9_9 = 251;
                                ** GOTO lbl112
                            }
                            case 13: {
                                var9_9 = 238;
                                ** GOTO lbl112
                            }
lbl108:
                            // 2 sources

                            var6_6 = var5_5[1];
                            break;
                            case 14: {
                                var9_9 = 137;
lbl112:
                                // 32 sources

                                while (true) {
                                    var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
                                    continue block38;
                                    break;
                                }
                            }
                        }
                        break;
                    }
                    break;
                }
lbl115:
                // 1 sources

                while (true) {
                    var8_8 = 0;
                    ** continue;
                    break;
                }
            }
            return new String(var4_4).intern();
            {
                case 29: {
                    var9_9 = 146;
                    ** GOTO lbl112
                }
                case 7: {
                    var9_9 = 218;
                    ** GOTO lbl112
                }
                case 16: {
                    var9_9 = 54;
                    ** GOTO lbl112
                }
                case 21: {
                    var9_9 = 192;
                    ** GOTO lbl112
                }
                case 28: {
                    var9_9 = 98;
                    ** GOTO lbl112
                }
                case 18: {
                    var9_9 = 34;
                    ** GOTO lbl112
                }
            }
        }
        var4_4 = AimHelper.l[var3_2].toCharArray();
        ** while ((var2_3 = (StackTraceElement[])AimHelper.II[var3_2]) == null)
lbl141:
        // 1 sources

        ** while (true)
        {
            case 12: {
                var9_9 = 28;
                ** GOTO lbl112
            }
        }
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 378362752;
        ** while (true)
        {
            case 4: {
                var9_9 = 174;
                ** GOTO lbl112
            }
            ** case 9:
        }
lbl151:
        // 1 sources

        var9_9 = 154;
        ** while (true)
    }
}

