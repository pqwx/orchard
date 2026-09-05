/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllII
 * Module         : FullBright  [RENDER]
 * Description    : Keeps the world visually bright on the client.   (client's own text)
 *
 * Recovered strings in this class:
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
package orchard.module.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;

@Environment(value=EnvType.CLIENT)
public final class FullBright
extends ModuleBase {
    private static String[] I;
    private static final int[] l;
    private static final String[] II;
    private static final Object[] Il;

    public FullBright() {
        super(StringFactory.IIII("FullBright"), Category.l, StringFactory.IIII("Keeps the world visually bright on the client."));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean I() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        if (clientEntrypoint.IlI().IIlIllI() == null) return false;
        if (!clientEntrypoint.IlI().IIlIllI().IIIlIIl()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0xE1CD3FDA ^ n;
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
        block28: {
            block27: {
                block34: {
                    block36: {
                        block31: {
                            block35: {
                                block33: {
                                    block30: {
                                        block29: {
                                            block32: {
                                                break block32;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    if (var13_8 != 0) break block27;
                                                    break block28;
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

                                                while (++var10_5 >= var8_3.length) {
                                                    break block29;
                                                }
                                                break block27;
lbl9:
                                                // 1 sources

                                                while (true) {
                                                    FullBright.l = new int[var1_12];
                                                    break block30;
                                                    break;
                                                }
lbl12:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 40;
                                                    ** GOTO lbl57
                                                    break;
                                                }
lbl15:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 49;
                                                    ** GOTO lbl57
                                                    break;
                                                }
lbl18:
                                                // 1 sources

                                                while (true) {
                                                    var1_12 = var0_11.length / 4;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            var6 = 9882;
                                            break block33;
lbl24:
                                            // 1 sources

                                            while (true) {
                                                FullBright.I = new String[2];
                                                FullBright.IIl();
                                                return;
                                            }
lbl28:
                                            // 2 sources

                                            while (true) {
                                                var10_5 = 0;
                                                ** continue;
                                                break;
                                            }
lbl31:
                                            // 1 sources

                                            while (var15_10 >= var14_9.length) {
                                                break block31;
                                            }
                                            break block34;
lbl34:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var13_8 = 0;
                                        ** GOTO lbl28
lbl39:
                                        // 1 sources

                                        while (true) {
                                            ** GOTO lbl6
                                            break;
                                        }
                                    }
                                    var3_14 = 0;
                                    var4_15 = 0;
                                    ** GOTO lbl34
                                    var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                                    break block35;
                                }
                                var7_2 = "\u6ea4\u269c\ud765\ue37b\ufa15\u051d\u7baf\u996b\u73f8\ub9f6\u8df2\u3380\u2089\ueabc\ub25e\ua869\u2982\u8ea9\uddb3\u7575\u7c48\u88be\u4572\uf4ad\ud4c5\u3594\u2ce7\ue580\u8a45\u3f85\u8056\u181f\u7db1\ue0c4\u5f0d\uf976\u8187\u8ca0\ue35b\ua4a4\u194e\u470f\u7452\u4b09\u2dba\ua78a\ud26b\ufb20\u2133\ue05c\u461b\u4af2\u9196\u0d00\uc8fb\uf962\u8567\u36f1\uca97\ua0b0\u4201\uf12c\ud0c7\ua29e\u943d\u537d\ue851\ue2e1\u089d\u5351\u4f95z\ub46f\u683b\ua8ef\u2494\u6878\u873b\ub0c1\u8424";
                                break block36;
lbl50:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl52:
                                // 1 sources

                                while (true) {
                                    var13_8 = -1;
                                    ** continue;
                                    break;
                                }
lbl55:
                                // 1 sources

                                while (true) {
                                    v0 = 71;
lbl57:
                                    // 5 sources

                                    while (true) {
                                        continue;
lbl59:
                                        // 1 sources

                                        while (true) {
                                            ** GOTO lbl31
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
lbl61:
                                // 1 sources

                                while (true) {
                                    var0_11 = "\u00eb\u0001T\u00a6\u00d1er\u00a8\u00eb\u008f('\u00ca\u00cbY\u0015".getBytes("ISO-8859-1");
                                    ** continue;
                                    break;
                                }
                            }
                            FullBright.l[var4_15] = var5_16 ^= var2_13;
                            var3_14 += 4;
                            if (++var4_15 >= var1_12) ** break;
                            ** while (true)
                            ** while (true)
                            var11_6 = 0;
                            var12_7 = '\u0000';
                            ** while (true)
lbl73:
                            // 1 sources

                            while (true) {
                                v0 = 32;
                                ** GOTO lbl57
                                break;
                            }
                        }
                        var9_4[var10_5] = new String(var14_9).intern();
                        var11_6 += var12_7;
                        ** while (true)
                        FullBright.Il = new Object[var9_4.length];
                        var2_13 = -1378554885;
                        ** while (true)
                        var16_1 = v0;
                        v1 = var15_10++;
                        var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
                        ** while (true)
                    }
                    var8_3 = "@\u0010".toCharArray();
                    var9_4 = new String[var8_3.length];
                    ** while (true)
lbl91:
                    // 1 sources

                    while (true) {
                        v0 = 122;
                        ** continue;
                        break;
                    }
                }
lbl95:
                // 2 sources

                while (true) {
                    switch (var15_10 % 5) {
                        case 1: {
                            ** continue;
                        }
                        default: {
                            ** continue;
                        }
                        case 4: {
                            ** continue;
                        }
                        case 3: {
                            ** continue;
                        }
                        ** case 2:
lbl106:
                        // 1 sources

                        ** continue;
                    }
                    break;
                }
            }
            var12_7 = var8_3[var10_5];
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
            ** while (true)
        }
        FullBright.II = var9_4;
        ** while (true)
    }

    private static void IIl() {
        FullBright.I[0] = FullBright.lI(FullBright.lII('\uc98c', 50319, 730747295).toCharArray(), 98253L, -976107917);
        FullBright.I[1] = FullBright.lI(FullBright.lII('\ue843', 50318, -1586999975).toCharArray(), 53976L, 1628555097);
    }

    private static int IlI(int n, int n2) {
        return l[n ^ 0x5891EE6C] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lII(char c, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xC48F;
        char[] cArray = II[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            FullBright.Il[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6F2D;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0x8BCA;
            n7 ^= 0x3B5D;
            n7 += 55520;
            n7 -= 37840;
            n7 ^= 0x1D42;
            n7 -= 22382;
            n7 += 26985;
            n7 += 1774;
            n7 ^= 0x1608;
            cArray[n6] = (char)((n7 ^= 0x5FC0) ^ n4 ^ c ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

