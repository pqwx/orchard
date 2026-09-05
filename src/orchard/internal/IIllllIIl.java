/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllllIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - nJVGixBZ
 *   - os.name
 *   - windows
 *   - linux
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.client.util.InputUtil$Type
 */
package orchard.internal;

import java.awt.GraphicsEnvironment;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import orchard.core.StringFactory;
import orchard.internal.IlIIlIIlI;
import orchard.internal.IllllI;

@Environment(value=EnvType.CLIENT)
public final class IIllllIIl {
    private static final int I;
    private static final Object l;
    private static final boolean II;
    private static final boolean Il;
    private static final int[] lI;
    private static final String[] ll;
    private static final Object[] III;

    /*
     * Enabled aggressive block sorting
     */
    private static int I() {
        String string = System.getProperty("os.name", "").toLowerCase(Locale.ROOT);
        if (string.startsWith("windows")) {
            return 1;
        }
        if (string.contains("linux")) return 2;
        if (string.contains(StringFactory.IIl("lZVX"))) return 2;
        if (string.contains(StringFactory.IIl("nJVGixBZ"))) return 2;
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int l(int n) {
        int n2;
        switch (n) {
            case 3: {
                n2 = 4;
                break;
            }
            default: {
                return 0;
            }
            case 5: {
                n2 = 6;
                break;
            }
            case 4: {
                n2 = 5;
                break;
            }
            case 7: {
                n2 = 8;
                break;
            }
            case 0: {
                n2 = 1;
                break;
            }
            case 2: {
                n2 = 2;
                break;
            }
            case 1: {
                n2 = 3;
                break;
            }
            case 6: {
                n2 = 7;
            }
        }
        int n3 = n2;
        if (n3 == 0) return 0;
        int n4 = InputEvent.getMaskForButton(n3);
        return n4;
    }

    private IIllllIIl() {
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block25: {
                block24: {
                    block26: {
                        block22: {
                            block20: {
                                block23: {
                                    break block23;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        v0 = false;
                                        ** GOTO lbl10
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
lbl10:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        break;
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
                                        continue;
                                        break;
                                    }
lbl16:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    var3_11 = 0;
                                    var4_12 = 0;
                                    break block24;
                                    var2_2 = 1680211280;
                                    var0_1 = "~\u00ef\u0082\u0081\n\u007f\u00bd??\u00ec-\u00f2|\u00a6\u00eb%vi\u0014\u009e\u00af\u00e8$00@SR\u00e7A\u00e0;\u00fb\u00e4\u00a9\u00f0_\u0018f&Y\u0081D%\u00d7q\u00deE\u00b6`\u00bdi\u00a5\u0099d\u00f8\u00ad\u001c\u008c\u000f\u000b]N\n\u00ea\u00b2\u0083\u000b\u00dap\u0018@M\u00ff\u00a7|-\u00da|\u00a8\f\\\u00c1\u001d\u00b6H\u00e2l\u00dd2]\u009f\u0096\u00959\u00f2\u00ac\u008b\u0086\u001b\u00e9i\u00db\u00bcl\u00fe'\u0011\u00a8\u000f\u00c9\u00a7\u00d7\u00a6\u00fd\u0092\u00ab\u00be\u00ca\u00efCh|a\u00862\u00dbZ\u00d5yN2\u0085\u0096\u00c0\u00a6!\u0097\u0004>\u00c4j\u007f\u00ef\u00efx\u00ea\u00fdV\u00a7?\u00d7\u00d1\u001c\u009aK\u00d7\u00be\u00b1\u00e0\u00f1\u0093\u00a3\u0083\u00d8\u00aa\u00a2m\u00c9\u001e\u00fap\n\u001e\u00f0\u009a\u001e\u0093\u0015\u00de\u00c5\u00c2\u0011\\\t\u0095u^\u00ef]\u00ac\u00c0\\\u00b5\u0013tJ\u00d8\u001d`\u00e9\u00e4\u00ad\u00e1\u00f9\u00b0\u000e\u0097O\u0090\u00cd}\u00b5A6(\u0097pU\u00a2$X-\u00ce*\u0002\u00d5o\u00e3\u00b3\u00d3\r\u00dcG\u00ae\u00da\u009b_b\u00b5\"\u001b\u00fb9\u00f4\"\f\u0087".getBytes("ISO-8859-1");
                                    ** while (true)
lbl24:
                                    // 1 sources

                                    while (true) {
                                        break block20;
                                        break;
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
                                        var13_9 = 0;
                                        break block21;
                                        break;
                                    }
lbl31:
                                    // 1 sources

                                    while (true) {
                                        var11_7 = 0;
                                        ** continue;
                                        break;
                                    }
                                }
                                var6 = 15611;
                                break block25;
lbl37:
                                // 1 sources

                                while (true) {
                                    v1 = true;
                                    break block22;
                                    break;
                                }
lbl40:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                var9_5 = new String[var8_4.length];
                                var13_9 = -1;
                                break block21;
lbl45:
                                // 1 sources

                                while (true) {
                                    IIllllIIl.l = new Object();
                                    return;
                                }
lbl48:
                                // 1 sources

                                while (true) {
                                    var11_7 += var12_8;
                                    ** continue;
                                    break;
                                }
lbl51:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            if (++var10_6 < var8_4.length) ** GOTO lbl51
                            ** while (true)
                            IIllllIIl.II = v0;
                            if ((IIllllIIl.I & 2) != 0) {
                                ** continue;
                            }
                            break block26;
                        }
lbl61:
                        // 2 sources

                        while (true) {
                            IIllllIIl.Il = v1;
                            ** continue;
                            break;
                        }
                        var1_10 = var0_1.length / 4;
                        IIllllIIl.lI = new int[var1_10];
                        ** while (true)
                        IIllllIIl.lI[var4_12] = var5_13 ^= var2_2;
                        var3_11 += 4;
                        if (++var4_12 >= var1_10) {
                            ** continue;
                        }
                        break block24;
                        IIllllIIl.I = IIllllIIl.I();
                        ** while ((IIllllIIl.I & 1) == 0)
lbl74:
                        // 1 sources

                        v0 = true;
                        ** while (true)
                        var12_8 = var8_4[var10_6] ^ var6;
                        var9_5[var10_6] = var7_3.substring(var11_7, var11_7 + var12_8);
                        ** while (true)
                    }
                    v1 = false;
                    ** while (true)
                }
                var5_13 = (var0_1[var3_11] & 255) << 24 | (var0_1[var3_11 + 1] & 255) << 16 | (var0_1[var3_11 + 2] & 255) << 8 | var0_1[var3_11 + 3] & 255;
                ** while (true)
            }
            var7_3 = "\u1557\u16af\u1560\u1562\u1558\u155b\u155b\u1562\u168d\u1692\u16a6\u16a6\uf8a5\uf762\uf75e\uf8ae\uf8aa\uf8cd\uf8b5\uf8ce\uf8be\uf8a0\uf75a\uf75a\u8bc9\u8ba7\u8a7c\u8bcc\u8bc4\u8b9c\u8bb0\u8a78\u1248\u1216\u1222\u1214\ub45a\ub476\ub592\ub483\ub455\ub464\ub47e\ub586";
            var8_4 = "\u3cf7\u3cf7\u3cf3\u3cff\u3cf3".toCharArray();
            ** while (true)
            IIllllIIl.ll = var9_5;
            IIllllIIl.III = new Object[var9_5.length];
            ** while (true)
        }
        var10_6 = 0;
        ** while (true)
        var12_8 = 0;
        if (var13_9 == 0) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int II(int n) {
        if (n >= 48) {
            if (n <= 57) return n;
        }
        if (n >= 65 && n <= 90) {
            return n;
        }
        if (n >= 290) {
            if (n <= 301) return 112 + n - 290;
        }
        if (n >= 302 && n <= 313) {
            return 61440 + n - 302;
        }
        if (n >= 320 && n <= 329) {
            return 96 + n - 320;
        }
        switch (n) {
            case 336: {
                return 61;
            }
            case 343: 
            case 347: {
                return 157;
            }
            case 260: {
                return 155;
            }
            case 284: {
                return 19;
            }
            case 258: {
                return 9;
            }
            case 256: {
                return 27;
            }
            case 44: {
                return 44;
            }
            case 281: {
                return 145;
            }
            case 261: {
                return 127;
            }
            case 266: {
                return 33;
            }
            case 262: {
                return 39;
            }
            case 268: {
                return 36;
            }
            case 39: {
                return 222;
            }
            case 91: {
                return 91;
            }
            case 341: 
            case 345: {
                return 17;
            }
            case 45: {
                return 45;
            }
            case 32: {
                return 32;
            }
            case 59: {
                return 59;
            }
            case 46: {
                return 46;
            }
            case 263: {
                return 37;
            }
            case 257: {
                return 10;
            }
            case 47: {
                return 47;
            }
            case 331: {
                return 111;
            }
            case 283: {
                return 154;
            }
            case 93: {
                return 93;
            }
            case 282: {
                return 144;
            }
            case 265: {
                return 38;
            }
            case 269: {
                return 35;
            }
            case 348: {
                return 525;
            }
            case 334: {
                return 107;
            }
            case 333: {
                return 109;
            }
            default: {
                return 0;
            }
            case 280: {
                return 20;
            }
            case 61: {
                return 61;
            }
            case 267: {
                return 34;
            }
            case 259: {
                return 8;
            }
            case 264: {
                return 40;
            }
            case 332: {
                return 106;
            }
            case 96: {
                return 192;
            }
            case 340: 
            case 344: {
                return 16;
            }
            case 92: {
                return 92;
            }
            case 330: {
                return 110;
            }
            case 342: 
            case 346: {
                return 18;
            }
            case 335: 
        }
        return 10;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean Il(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.isWindowFocused()) return false;
        if (minecraftClient.getWindow() != null) return true;
        return false;
    }

    public static boolean lI() {
        if (II) {
            return IlIIlIIlI.IIl();
        }
        try {
            return Il && !GraphicsEnvironment.isHeadless() && IllllI.l() != null;
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean ll(MinecraftClient minecraftClient, InputUtil.Key key, boolean bl, boolean bl2) {
        if (II) {
            return IlIIlIIlI.lI(minecraftClient, key, bl, bl2);
        }
        if (!Il || key == null || (bl || !bl2) && !IIllllIIl.Il(minecraftClient)) {
            return false;
        }
        try {
            Robot robot = IllllI.l();
            if (robot == null) {
                return false;
            }
            Object object = l;
            synchronized (object) {
                if (key.getCategory() == InputUtil.Type.MOUSE) {
                    int n = IIllllIIl.l(key.getCode());
                    if (n == 0) {
                        return false;
                    }
                    if (bl) {
                        robot.mousePress(n);
                    } else {
                        robot.mouseRelease(n);
                    }
                    return true;
                }
                int n = IIllllIIl.II(key.getCode());
                if (n == 0) {
                    return false;
                }
                if (bl) {
                    robot.keyPress(n);
                } else {
                    robot.keyRelease(n);
                }
                return true;
            }
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    public static void III() {
        if (Il) {
            IllllI.l();
        }
    }

    private static int IIl(int n, int n2) {
        return lI[n ^ 0x6451F764] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlI(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0x3738;
        char[] cArray = ll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIllllIIl.III[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1E5B;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 19716;
            n6 ^= 0x2080;
            n6 += 1072;
            cArray[n5] = (char)((n6 ^= 0x4E45) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

