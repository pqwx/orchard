/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - user32
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Library
 *  com.sun.jna.Native
 *  com.sun.jna.platform.win32.BaseTSD$ULONG_PTR
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.platform.win32.BaseTSD;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
interface llIIlII
extends Library {
    public static final llIIlII I;
    public static final String[] l;
    public static final int[] II;
    public static final String[] Il;
    public static final Object[] lI;

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block39: {
                block38: {
                    block35: {
                        block32: {
                            block29: {
                                block37: {
                                    block33: {
                                        block36: {
                                            block30: {
                                                block34: {
                                                    block28: {
                                                        break block34;
lbl1:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl3:
                                                        // 1 sources

                                                        while (true) {
                                                            v0 = 19;
                                                            ** GOTO lbl39
                                                            break;
                                                        }
lbl6:
                                                        // 2 sources

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
                                                            break block28;
                                                            break;
                                                        }
lbl12:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                        var9_4[var10_5] = new String(var14_9).intern();
                                                        var11_6 += var12_7;
                                                        break block35;
lbl17:
                                                        // 1 sources

                                                        while (true) {
                                                            var3_14 += 4;
                                                            if (++var4_15 < var1_13) break block29;
                                                            break block30;
                                                            break;
                                                        }
                                                    }
                                                    if (var15_10 >= var14_9.length) {
                                                        ** continue;
lbl24:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    break block31;
                                                }
                                                var6 = 26084;
                                                var7_2 = "\u5d69\u0dd5\ub1e7\u6ed9\u478d\u04b9\uce1e\u3d97";
                                                ** while (true)
lbl31:
                                                // 1 sources

                                                while (true) {
                                                    var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                                                    var15_10 = 0;
                                                    break block31;
                                                    break;
                                                }
lbl35:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl37:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 124;
lbl39:
                                                    // 6 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                    break;
                                                }
                                                var2_11 = 1266589089;
                                                break block36;
lbl43:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 25;
                                                    ** GOTO lbl39
                                                    break;
                                                }
                                            }
                                            llIIlII.l = new String[1];
                                            llIIlII.II();
                                            llIIlII.I = (llIIlII)Native.load((String)"user32", llIIlII.class);
                                            return;
                                        }
                                        var0_12 = "\u0094r\u00b1\u00ce\u0085\u00d9\tN\u00c1oA\"".getBytes("ISO-8859-1");
                                        var1_13 = var0_12.length / 4;
                                        ** while (true)
lbl55:
                                        // 1 sources

                                        while (true) {
                                            if (++var10_5 < var8_3.length) break block32;
                                            break block33;
                                            break;
                                        }
                                        var8_3 = "\b".toCharArray();
                                        break block37;
                                        var10_5 = 0;
                                        break block38;
                                        llIIlII.Il = var9_4;
                                        llIIlII.lI = new Object[var9_4.length];
                                        ** while (true)
lbl65:
                                        // 1 sources

                                        while (true) {
                                            if (var13_8 == 0) {
                                                ** continue;
                                            }
                                            break block32;
                                            break;
                                        }
                                        llIIlII.II = new int[var1_13];
                                        break block39;
                                    }
                                    var13_8 = 0;
                                    ** GOTO lbl6
lbl74:
                                    // 1 sources

                                    while (true) {
                                        v0 = 101;
                                        ** GOTO lbl39
                                        break;
                                    }
                                }
                                var9_4 = new String[var8_3.length];
                                var13_8 = -1;
                                ** while (true)
                                var16_1 = v0;
                                v1 = var15_10++;
                                var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
                                ** while (true)
                            }
lbl86:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var12_7 = var8_3[var10_5];
                        ** while (true)
lbl91:
                        // 1 sources

                        while (true) {
                            v0 = 103;
                            ** GOTO lbl39
                            break;
                        }
                    }
                    ** while (true)
                }
                var11_6 = 0;
                var12_7 = '\u0000';
                ** while (true)
                var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
                llIIlII.II[var4_15] = var5_16 ^= var2_11;
                ** while (true)
            }
            var3_14 = 0;
            var4_15 = 0;
            ** while (true)
lbl107:
            // 1 sources

            while (true) {
                v0 = 3;
                ** continue;
                break;
            }
        }
        switch (var15_10 % 6) {
            case 4: {
                ** continue;
            }
            case 3: {
                ** continue;
            }
            default: {
                ** continue;
            }
            case 1: {
                ** continue;
            }
            case 5: {
                ** continue;
            }
            ** case 2:
lbl123:
            // 1 sources

            ** continue;
        }
    }

    public static String I(char[] cArray, long l2, int n) {
        int n2 = 0x1E860D86 ^ n;
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

    public void l(byte var1, byte var2, int var3, BaseTSD.ULONG_PTR var4);

    public static void II() {
        llIIlII.l[0] = llIIlII.I(llIIlII.lI(63791439, -153861342).toCharArray(), 48460L, 284361949);
    }

    public static int Il(int n, int n2) {
        return II[n ^ 0xAB3AC6B3] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x3CD614F;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIIlII.lI[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xFE88866D;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 4 -> 188;
                default -> 137;
                case 15 -> 88;
                case 1 -> 76;
                case 2 -> 30;
                case 26 -> 135;
                case 19 -> 212;
                case 24 -> 214;
                case 14 -> 232;
                case 9 -> 6;
                case 30 -> 9;
                case 13 -> 18;
                case 12 -> 240;
                case 8 -> 46;
                case 21 -> 238;
                case 17 -> 49;
                case 18 -> 111;
                case 20 -> 64;
                case 16 -> 32;
                case 7 -> 63;
                case 29 -> 192;
                case 23 -> 208;
                case 3 -> 192;
                case 22 -> 220;
                case 10 -> 141;
                case 6 -> 34;
                case 5 -> 196;
                case 25 -> 128;
                case 27 -> 234;
                case 31 -> 167;
                case 11 -> 146;
                case 28 -> 98;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

