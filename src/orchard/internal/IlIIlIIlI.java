/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIlIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - ).toLowerCase().contains(
 *   - .getBytes(
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.platform.win32.BaseTSD$ULONG_PTR
 *  com.sun.jna.platform.win32.User32
 *  com.sun.jna.platform.win32.WinDef$DWORD
 *  com.sun.jna.platform.win32.WinDef$LONG
 *  com.sun.jna.platform.win32.WinDef$WORD
 *  com.sun.jna.platform.win32.WinUser$INPUT
 *  com.sun.jna.platform.win32.WinUser$KEYBDINPUT
 *  com.sun.jna.platform.win32.WinUser$MOUSEINPUT
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.client.util.InputUtil$Type
 */
package orchard.internal;

import com.sun.jna.platform.win32.BaseTSD;
import com.sun.jna.platform.win32.User32;
import com.sun.jna.platform.win32.WinDef;
import com.sun.jna.platform.win32.WinUser;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIII;
import orchard.internal.IIlllIl;

@Environment(value=EnvType.CLIENT)
public final class IlIIlIIlI {
    private static final int I = 2;
    private static final int l = 0;
    private static final int II = 256;
    private static final int Il = 128;
    private static final int lI = 64;
    private static final int ll = 2;
    private static final int III = 1;
    private static final boolean IIl;
    private static final int IlI = 32;
    private static final int Ill = 16;
    private static final int lII = 4;
    private static final int lIl = 8;
    private static final int[] llI;
    private static final String[] lll;
    private static final Object[] IIII;

    /*
     * Enabled aggressive block sorting
     */
    private static int I(int n) {
        if (n >= 48) {
            if (n <= 57) return n;
        }
        if (n >= 65 && n <= 90) {
            return n;
        }
        if (n >= 290 && n <= 314) {
            return 112 + n - 290;
        }
        if (n >= 320 && n <= 329) {
            return 96 + n - 320;
        }
        switch (n) {
            default: {
                return -1;
            }
            case 269: {
                return 35;
            }
            case 45: {
                return 189;
            }
            case 92: {
                return 220;
            }
            case 263: {
                return 37;
            }
            case 46: {
                return 190;
            }
            case 333: {
                return 109;
            }
            case 346: {
                return 165;
            }
            case 44: {
                return 188;
            }
            case 91: {
                return 219;
            }
            case 265: {
                return 38;
            }
            case 264: {
                return 40;
            }
            case 340: {
                return 160;
            }
            case 342: {
                return 164;
            }
            case 331: {
                return 111;
            }
            case 260: {
                return 45;
            }
            case 257: {
                return 13;
            }
            case 39: {
                return 222;
            }
            case 268: {
                return 36;
            }
            case 59: {
                return 186;
            }
            case 283: {
                return 44;
            }
            case 262: {
                return 39;
            }
            case 347: {
                return 92;
            }
            case 259: {
                return 8;
            }
            case 345: {
                return 163;
            }
            case 258: {
                return 9;
            }
            case 281: {
                return 145;
            }
            case 32: {
                return 32;
            }
            case 280: {
                return 20;
            }
            case 266: {
                return 33;
            }
            case 343: {
                return 91;
            }
            case 282: {
                return 144;
            }
            case 330: {
                return 110;
            }
            case 332: {
                return 106;
            }
            case 96: {
                return 192;
            }
            case 348: {
                return 93;
            }
            case 47: {
                return 191;
            }
            case 335: {
                return 13;
            }
            case 341: {
                return 162;
            }
            case 61: {
                return 187;
            }
            case 93: {
                return 221;
            }
            case 284: {
                return 19;
            }
            case 256: {
                return 27;
            }
            case 344: {
                return 161;
            }
            case 334: {
                return 107;
            }
            case 336: {
                return 187;
            }
            case 267: {
                return 34;
            }
            case 261: 
        }
        return 46;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
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
                            continue;
                            break;
                        }
                        var9_6[var10_7] = var7_4.substring(var11_8, var11_8 + var12_9);
                        var11_8 += var12_9;
                        break block15;
lbl12:
                        // 2 sources

                        while (true) {
                            var5_13 = (var0_1[var3_11] & 255) << 24 | (var0_1[var3_11 + 1] & 255) << 16 | (var0_1[var3_11 + 2] & 255) << 8 | var0_1[var3_11 + 3] & 255;
                            ** continue;
                            break;
                        }
lbl15:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl19:
                        // 1 sources

                        while (true) {
                            var13_10 = 0;
                            ** GOTO lbl15
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            var2_3 = -780260360;
                            ** continue;
                            break;
                        }
                        var10_7 = 0;
                        var11_8 = 0;
                        ** while (true)
lbl28:
                        // 1 sources

                        while (true) {
                            IlIIlIIlI.llI = new int[var1_2];
                            ** continue;
                            break;
                        }
                        var3_11 = 0;
                        var4_12 = 0;
                        ** GOTO lbl12
lbl34:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl36:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var6 = 956;
                    break block16;
lbl41:
                    // 2 sources

                    while (true) {
                        var12_9 = var8_5[var10_7] ^ var6;
                        ** continue;
                        break;
                    }
                    var9_6 = new String[var8_5.length];
                    var13_10 = -1;
                    ** while (true)
                    IlIIlIIlI.lll = var9_6;
                    IlIIlIIlI.IIII = new Object[var9_6.length];
                    ** while (true)
                    IlIIlIIlI.llI[var4_12] = var5_13 ^= var2_3;
                    var3_11 += 4;
                    if (++var4_12 >= var1_2) ** break;
                    ** while (true)
                    break block17;
                }
                if (++var10_7 < var8_5.length) ** GOTO lbl41
                ** while (true)
                var0_1 = "d\u008e\u00a8W\u00c99\u0011J\u00f3[n^0\u00b6\u00b8\u0016\u0080\u00e4\u00fe\u00b3\u00a9%\u0001\u00ef\u00f0\u0089\u00eb[\u00de^^\u009b#\u0003\u0082\u0001\u0012\u00ae\u00c5#\u00d8\u00ee\u0087\u008e\u00f4\u0010\u00b2\u0098RQ\u000bl'\u00fc\u0004\u00e6\u00a9\u0014kU\u0093\u0015\t\u00b7\u00db\n_\u0013L\u00c3:\u00ea7;_:1\u00d1\u00bf~\u00d9\u0017\u00c5\u00de\u00a2\u0010X\u00b9>4;i\u0095\u00a7\u0011\u001a\u0095\u008b\u00ef$u\u000eU.\u001f\u00b3\u0011)V\u00f4\u00fb\u00b9\u009eg\u00db:\u0092G^\u00beb\u009fk\u008eOP\u00b7ZP\u00d7\u001a+\t\u00b4\u0083{\u00bb\u00ed\u00f3\u00b80\u00caU\u00d5\u00ddYbn\u0099\u00a9\u00bcG\"vn`\u0088\u00cf\u0010\u00a2\u00c6\u001c\u0088\u00142\u00cc-j\bT\u007fE\u0017\u00d0\u00c2!\u00cd\u00a8h#Z:0\u00a4\u00c4\u00e2\u00fb\u00c8\u00d8\u0094\u0010\u00f4\u00db\bv\u00b6$#\u0080\u00b9\u008b\u00afm{\u00e5\u00b0\u009bz\u008b=,\u0092#WpD+\u00ef\u000f\u00a5b\u00ea2\u00eeh\u0017'W\u0097Lv0<X7\u009f8\u00e5J\u009c\u001e\u00b0\u00a3\u0098\u00fc\u00b4:*\u00d9D\u009e\u00b4\u00d3\u00afr\u00d9R\u0011\u001d\u0089\u0098\u00ba\u001b\u00ac\u00ae\u000b\u009e\u00e4\u00e3\u00cc<\u0097".getBytes("ISO-8859-1");
                var1_2 = var0_1.length / 4;
                ** while (true)
lbl61:
                // 1 sources

                return;
                var12_9 = 0;
                if (var13_10 == 0) ** break;
                ** while (true)
                ** while (true)
            }
            var7_4 = "\u8605\u86e3\u8678\u86cb\u86e2\u86f9\u86d9\u86dd\u8677\u86c0\u8629\u86ee\u6599\u6578\u65b0\u6551\u657e\u6549\u6571\u6567\u65ea\u657c\u65b3\u6574";
            var8_5 = "\u03b0\u03b0".toCharArray();
            ** while (true)
        }
        IlIIlIIlI.IIl = System.getProperty(StringFactory.IIl("l4cakhhaVQ=="), "").toLowerCase().contains("windows");
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static IIIlIIII l(InputUtil.Key key) {
        if (key == null) return null;
        if (key.getCategory() == InputUtil.Type.MOUSE) return null;
        int n = IlIIlIIlI.I(key.getCode());
        if (n < 0) return null;
        int n2 = User32.INSTANCE.MapVirtualKeyEx(n, 0, User32.INSTANCE.GetKeyboardLayout(0));
        if (n2 != 0) return new IIIlIIII(n2, IlIIlIIlI.III(key.getCode()));
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void II(WinUser.INPUT iNPUT, int n, int n2) {
        iNPUT.type = new WinDef.DWORD(0L);
        iNPUT.input.setType(WinUser.MOUSEINPUT.class);
        iNPUT.input.mi = new WinUser.MOUSEINPUT();
        iNPUT.input.mi.dx = new WinDef.LONG(0L);
        iNPUT.input.mi.dy = new WinDef.LONG(0L);
        iNPUT.input.mi.mouseData = new WinDef.DWORD((long)n2);
        iNPUT.input.mi.dwFlags = new WinDef.DWORD((long)n);
        iNPUT.input.mi.time = new WinDef.DWORD(0L);
        iNPUT.input.mi.dwExtraInfo = new BaseTSD.ULONG_PTR(0L);
        iNPUT.write();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean Il(MinecraftClient minecraftClient) {
        if (!IIl) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.isWindowFocused()) return false;
        if (minecraftClient.getWindow() == null) return false;
        return true;
    }

    public static boolean lI(MinecraftClient minecraftClient, InputUtil.Key key, boolean bl, boolean bl2) {
        if (!IIl || key == null || (bl || !bl2) && !IlIIlIIlI.Il(minecraftClient)) {
            return false;
        }
        try {
            if (key.getCategory() == InputUtil.Type.MOUSE) {
                IIlllIl iIlllIl = IlIIlIIlI.IlI(key.getCode());
                if (iIlllIl == null) {
                    return false;
                }
                return IlIIlIIlI.lII(bl ? iIlllIl.I() : iIlllIl.l(), iIlllIl.II());
            }
            IIIlIIII iIIlIIII = IlIIlIIlI.l(key);
            return iIIlIIII != null && IlIIlIIlI.ll(iIIlIIII, !bl);
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ll(IIIlIIII iIIlIIII, boolean bl) {
        WinUser.INPUT[] iNPUTArray = (WinUser.INPUT[])new WinUser.INPUT().toArray(1);
        IlIIlIIlI.Ill(iNPUTArray[0], iIIlIIII, bl);
        if (User32.INSTANCE.SendInput(new WinDef.DWORD(1L), iNPUTArray, iNPUTArray[0].size()).intValue() != 1) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean III(int n) {
        switch (n) {
            default: {
                return false;
            }
            case 260: 
            case 261: 
            case 262: 
            case 263: 
            case 264: 
            case 265: 
            case 266: 
            case 267: 
            case 268: 
            case 269: 
            case 282: 
            case 283: 
            case 331: 
            case 335: 
            case 343: 
            case 345: 
            case 346: 
            case 347: 
            case 348: 
        }
        return true;
    }

    private IlIIlIIlI() {
    }

    public static boolean IIl() {
        return IIl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static IIlllIl IlI(int n) {
        IIlllIl iIlllIl;
        switch (n) {
            case 2: {
                iIlllIl = new IIlllIl(32, 64, 0);
                return iIlllIl;
            }
            case 3: {
                iIlllIl = new IIlllIl(128, 256, 1);
                return iIlllIl;
            }
            default: {
                return null;
            }
            case 4: {
                iIlllIl = new IIlllIl(128, 256, 2);
                return iIlllIl;
            }
            case 0: {
                iIlllIl = new IIlllIl(2, 4, 0);
                return iIlllIl;
            }
            case 1: 
        }
        iIlllIl = new IIlllIl(8, 16, 0);
        return iIlllIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void Ill(WinUser.INPUT iNPUT, IIIlIIII iIIlIIII, boolean bl) {
        int n = 8;
        if (iIIlIIII.I()) {
            n |= 1;
        }
        if (bl) {
            n |= 2;
        }
        iNPUT.type = new WinDef.DWORD(1L);
        iNPUT.input.setType(WinUser.KEYBDINPUT.class);
        iNPUT.input.ki = new WinUser.KEYBDINPUT();
        iNPUT.input.ki.wVk = new WinDef.WORD(0L);
        iNPUT.input.ki.wScan = new WinDef.WORD((long)iIIlIIII.l());
        iNPUT.input.ki.dwFlags = new WinDef.DWORD((long)n);
        iNPUT.input.ki.time = new WinDef.DWORD(0L);
        iNPUT.input.ki.dwExtraInfo = new BaseTSD.ULONG_PTR(0L);
        iNPUT.write();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean lII(int n, int n2) {
        WinUser.INPUT[] iNPUTArray = (WinUser.INPUT[])new WinUser.INPUT().toArray(1);
        IlIIlIIlI.II(iNPUTArray[0], n, n2);
        if (User32.INSTANCE.SendInput(new WinDef.DWORD(1L), iNPUTArray, iNPUTArray[0].size()).intValue() != 1) return false;
        return true;
    }

    private static int lIl(int n, int n2) {
        return llI[n ^ 0xA4F6F5C4] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String llI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x5B0E87E3;
        char[] cArray = lll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIII[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIlIIlI.IIII[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xB041EACB;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 8 -> 37;
                default -> 109;
                case 16 -> 107;
                case 28 -> 69;
                case 18 -> 105;
                case 26 -> 182;
                case 3 -> 174;
                case 24 -> 248;
                case 6 -> 181;
                case 17 -> 148;
                case 29 -> 164;
                case 4 -> 141;
                case 2 -> 31;
                case 21 -> 87;
                case 20 -> 197;
                case 13 -> 82;
                case 12 -> 109;
                case 22 -> 93;
                case 15 -> 236;
                case 5 -> 149;
                case 30 -> 165;
                case 19 -> 150;
                case 27 -> 36;
                case 25 -> 176;
                case 1 -> 211;
                case 31 -> 212;
                case 14 -> 251;
                case 9 -> 149;
                case 7 -> 184;
                case 11 -> 215;
                case 23 -> 162;
                case 10 -> 16;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

