/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Silent
 *   - Strict
 *   - None
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

@Environment(value=EnvType.CLIENT)
public final class llIlllI
extends Enum<llIlllI> {
    public static final /* enum */ llIlllI I;
    public static final /* enum */ llIlllI l;
    private final IIIlIIIII II;
    public static final /* enum */ llIlllI Il;
    private static String[] lI;
    private static final /* synthetic */ llIlllI[] ll;
    private static final int[] III;
    private static final String[] IIl;
    private static final Object[] IlI;

    private llIlllI(String string2) {
        this.II = StringFactory.lIl(string2);
    }

    public static llIlllI I(String string) {
        return Enum.valueOf(llIlllI.class, string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block15: {
                block21: {
                    block18: {
                        block16: {
                            block17: {
                                block13: {
                                    block19: {
                                        block14: {
                                            break block19;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                var3_4 += 4;
                                                if (++var4_5 < var1_2) break block13;
                                                break block14;
                                                break;
                                            }
lbl5:
                                            // 1 sources

                                            while (true) {
                                                block20: {
                                                    var13_13 = -1;
                                                    break block20;
lbl8:
                                                    // 1 sources

                                                    while (var13_13 == 0) {
                                                        break block15;
                                                    }
                                                    break block16;
lbl11:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
lbl14:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl16:
                                                // 1 sources

                                                while (true) {
                                                    var11_11 += var12_12;
                                                    break block17;
                                                    break;
                                                }
lbl19:
                                                // 1 sources

                                                while (true) {
                                                    var13_13 = 0;
                                                    ** continue;
                                                    break;
                                                }
                                                var2_3 = -889243960;
                                                break block18;
lbl24:
                                                // 1 sources

                                                while (true) {
                                                    var4_5 = 0;
                                                    break block13;
                                                    break;
                                                }
lbl27:
                                                // 1 sources

                                                while (true) {
                                                    var3_4 = 0;
                                                    ** continue;
                                                    break;
                                                }
                                                break;
                                            }
                                        }
                                        llIlllI.lI = new String[6];
                                        llIlllI.Il();
                                        llIlllI.l = new llIlllI("None");
                                        llIlllI.I = new llIlllI("Silent");
                                        llIlllI.Il = new llIlllI("Strict");
                                        llIlllI.ll = llIlllI.II();
                                        return;
lbl38:
                                        // 1 sources

                                        while (true) {
                                            if (++var10_10 < var8_8.length) break block16;
                                            ** continue;
                                            break;
                                        }
lbl41:
                                        // 1 sources

                                        while (true) {
                                            var12_12 = 0;
                                            ** GOTO lbl8
                                            break;
                                        }
lbl44:
                                        // 1 sources

                                        while (true) {
                                            llIlllI.III[var4_5] = var5_6 ^= var2_3;
                                            ** continue;
                                            break;
                                        }
lbl47:
                                        // 1 sources

                                        while (true) {
                                            llIlllI.III = new int[var1_2];
                                            ** continue;
                                            break;
                                        }
                                    }
                                    var6 = 30509;
                                    break block21;
                                    var10_10 = 0;
                                    var11_11 = 0;
                                    ** while (true)
                                }
                                var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                                ** while (true)
                            }
                            ** while (true)
                        }
                        var12_12 = var8_8[var10_10] ^ var6;
                        var9_9[var10_10] = var7_7.substring(var11_11, var11_11 + var12_12);
                        ** while (true)
                    }
                    var0_1 = "\u00fb\u001e\u001d1\u00df\n\u0015\u001b\u00a7<\u00d5\u00e8\u0081\u00af\u001b\u0002\u0085\u00ea\r\u00a8\u0082\u00ec\u00a2\u0017\u00a2\u0080b\u00ed\u008f\u008c \u0004P\u0098\u0010)".getBytes("ISO-8859-1");
                    var1_2 = var0_1.length / 4;
                    ** while (true)
                }
                var7_7 = "\u323e\ubf8b\u6c38\ue0b7\ud730\uee0f\u6f29\u178a\uee99\ub4d5\ud0c4\uae31\u87ce\uefbe\u93e1\u01e4\ucc33\u9aa2\ubc66\u468b\uf2f4\u70f9\u880e\uddf0\ud195\ue1f4\uc405\u1ecd\u29f0\u27c4\ub4d0\u3ce7\u09b6\u3aab\u710c\ucdc2\u0334\u6c34\u8510\ufc99";
                break block22;
            }
            llIlllI.IIl = var9_9;
            llIlllI.IlI = new Object[var9_9.length];
            ** while (true)
        }
        var8_8 = "\u7729\u772b\u7725\u7725\u7725\u772b".toCharArray();
        var9_9 = new String[var8_8.length];
        ** while (true)
    }

    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0x81F955B7 ^ n;
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

    public String toString() {
        return this.II.IIII();
    }

    public static llIlllI[] values() {
        return (llIlllI[])ll.clone();
    }

    private static /* synthetic */ llIlllI[] II() {
        return new llIlllI[]{l, I, Il};
    }

    private static void Il() {
        llIlllI.lI[0] = llIlllI.l(llIlllI.ll('\udf5c', '\ufafa', 620852918).toCharArray(), 10601L, -1418993197);
        llIlllI.lI[1] = llIlllI.l(llIlllI.ll('\udf5d', '\ud765', -1642122658).toCharArray(), 55271L, -1000925737);
        llIlllI.lI[2] = llIlllI.l(llIlllI.ll('\udf5e', '\ub2b4', 780288452).toCharArray(), 26808L, 1747626956);
        llIlllI.lI[3] = llIlllI.l(llIlllI.ll('\udf5f', '\uf181', -1816123967).toCharArray(), 94341L, 869839536);
        llIlllI.lI[4] = llIlllI.l(llIlllI.ll('\udf58', '\ub9c5', -1708958256).toCharArray(), 74500L, 1222116777);
        llIlllI.lI[5] = llIlllI.l(llIlllI.ll('\udf59', '\uf0d4', -872401670).toCharArray(), 19423L, 295942021);
    }

    private static int lI(int n, int n2) {
        return III[n ^ 0x2E4E785] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(char c, char c2, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xDF5C;
        char[] cArray = IIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlI[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIlllI.IlI[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xD3D;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 37418;
            n6 ^= 0x2450;
            n6 ^= 0x4C30;
            n6 += 31564;
            n6 ^= 0x2F9E;
            cArray[n5] = (char)((n6 -= 45082) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

