/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Refills used TNT minecarts from inventory.
 *   - Cart Refill
 *   - .getBytes(
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
import orchard.internal.IIIlIIll;
import orchard.internal.lIlIllll;

@Environment(value=EnvType.CLIENT)
public final class IIIIll
extends IIIlIIll {
    private static String[] I;
    private static final int[] lIIl;
    private static final String[] lIll;
    private static final Object[] llII;

    private static String lIIlI(char[] cArray, long l2, int n) {
        int n2 = 0x79922FDD ^ n;
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

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block13: {
                block14: {
                    block19: {
                        block20: {
                            block18: {
                                block17: {
                                    block15: {
                                        break block15;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            continue;
lbl3:
                                            // 1 sources

                                            while (true) {
                                                block16: {
                                                    break block16;
lbl5:
                                                    // 1 sources

                                                    while (true) {
                                                        var13_7 = 0;
                                                        break block13;
                                                        break;
                                                    }
                                                }
                                                if (++var10_4 >= var8_2.length) {
                                                    ** continue;
                                                }
                                                break block14;
                                                break;
                                            }
                                            break;
                                        }
                                    }
                                    var6 = 18101;
                                    break block17;
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
                                    var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
                                    break block18;
lbl21:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl23:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl25:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    var3_11 = 0;
                                    var4_12 = 0;
                                    ** GOTO lbl15
                                    var11_5 = 0;
                                    break block19;
                                    var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                                    var11_5 += var12_6;
                                    ** while (true)
                                }
                                var7_1 = "\u88c0\ua75d\u4dbc\u50fc\u773f\uee89\u8835\u0a5a\u6a1b\u032d\u74a9\u7de4\uad9f\ud775\u2ba2\ud3ba\u342er\u6932\u230e\uf259\u4b95\u039d\u91ce\ue672\u3bb0\uf94b\ucfc8\u7661\uaa12\u4265\u4159\u1355\u7691\u9ab4\u4222\u1e25\u9fac\u5008\u4870\u79b8\u9f48\ud7ab\u9382\u60f0\uf889\u08c2\u9312\u5d28\uadaa\u95be\u4daf\u6434\uaa65\u65e0\ud03f\u8043\uc438\u4454\ud5c9\uf2bb\u194e\ud85e\u1dc7\u886f\u8dca\u01b4\u2417\ud1f1\u3b97\u03bc\u3c2d";
                                break block20;
lbl38:
                                // 1 sources

                                while (true) {
                                    IIIIll.lIIl = new int[var1_9];
                                    ** continue;
                                    break;
                                }
lbl41:
                                // 1 sources

                                while (true) {
                                    IIIIll.I = new String[2];
                                    IIIIll.lIIll();
                                    return;
                                }
                            }
                            IIIIll.lIIl[var4_12] = var5_13 ^= var2_10;
                            var3_11 += 4;
                            if (++var4_12 >= var1_9) ** break;
                            ** while (true)
                            ** while (true)
                        }
                        var8_2 = "\u46a5\u468d".toCharArray();
                        break block21;
                    }
                    var12_6 = 0;
                    if (var13_7 == 0) {
                        ** continue;
                    }
                    break block14;
                    IIIIll.lIll = var9_3;
                    IIIIll.llII = new Object[var9_3.length];
                    var2_10 = -2118649812;
                    ** while (true)
                }
                var12_6 = var8_2[var10_4] ^ var6;
                ** while (true)
                var0_8 = "\u00a7B%\u00e9\f|\u00d1\u00cb\u00ed\u0019\f,\u00d8\u00fa8d".getBytes("ISO-8859-1");
                var1_9 = var0_8.length / 4;
                ** while (true)
            }
lbl70:
            // 2 sources

            while (true) {
                var10_4 = 0;
                ** continue;
                break;
            }
        }
        var9_3 = new String[var8_2.length];
        var13_7 = -1;
        ** while (true)
    }

    private static void lIIll() {
        IIIIll.I[0] = IIIIll.lIIlI(IIIIll.lIllI(-1268328777, 1724542033).toCharArray(), 71706L, -554055440);
        IIIIll.I[1] = IIIIll.lIIlI(IIIIll.lIllI(-1268328778, 1443892887).toCharArray(), 53670L, -1710225772);
    }

    public IIIIll() {
        super((Object)StringFactory.IIII("Cart Refill"), StringFactory.IIII("Refills used TNT minecarts from inventory."), lIlIllll.lI, false);
    }

    private static int lIlII(int n, int n2) {
        return lIIl[n ^ 0xC23C936F] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIllI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xB466D6B7;
        char[] cArray = lIll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llII[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIll.llII[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x8D42084A;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 18 -> 70;
                case 28 -> 112;
                case 29 -> 26;
                case 8 -> 192;
                case 21 -> 135;
                case 4 -> 195;
                case 2 -> 224;
                case 10 -> 86;
                case 20 -> 3;
                case 24 -> 114;
                case 31 -> 232;
                case 27 -> 52;
                case 26 -> 118;
                case 19 -> 12;
                case 13 -> 192;
                case 25 -> 103;
                case 22 -> 61;
                case 3 -> 224;
                case 5 -> 168;
                case 15 -> 120;
                case 14 -> 33;
                case 1 -> 121;
                case 11 -> 126;
                case 9 -> 162;
                case 16 -> 155;
                case 30 -> 147;
                case 7 -> 33;
                case 12 -> 240;
                default -> 101;
                case 6 -> 175;
                case 17 -> 141;
                case 23 -> 215;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

