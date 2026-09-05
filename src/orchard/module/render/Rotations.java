/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIIlIl
 * Module         : Rotations  [RENDER]
 * Description    : Shows silent server head rotations on the local player model.   (client's own text)
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
import orchard.core.ModuleBase;
import orchard.core.StringFactory;

@Environment(value=EnvType.CLIENT)
public final class Rotations
extends ModuleBase {
    private static String[] I;
    private static final int[] l;
    private static final String[] II;
    private static final Object[] Il;

    public Rotations() {
        super(StringFactory.IIII("Rotations"), Category.l, StringFactory.IIII("Shows silent server head rotations on the local player model."));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0xC74A0768 ^ n;
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

    private static void IIl() {
        Rotations.I[0] = Rotations.lI(Rotations.lII((short)28083, '\u53b9', 1613697334).toCharArray(), 45634L, -1769262592);
        Rotations.I[1] = Rotations.lI(Rotations.lII((short)60806, '\u53b8', 1426668276).toCharArray(), 55896L, -1766884223);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block27: {
            block26: {
                block24: {
                    block25: {
                        var6 = 19107;
                        ** GOTO lbl91
lbl3:
                        // 1 sources

                        while (true) {
                            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                            var15_10 = 0;
                            break block24;
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            if (var15_10 < var14_9.length) break block24;
                            ** GOTO lbl88
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var0_12 = "\u00dc\u00c3\u00bd\u0005Sh\u0096\u00b3?\u00edl\u00e0\u008e\u001c8Z".getBytes("ISO-8859-1");
                            break block25;
                            break;
                        }
lbl13:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            v0 = 114;
                            break block26;
                            break;
                        }
                        Rotations.l[var4_15] = var5_16 ^= var2_11;
                        var3_14 += 4;
                        if (++var4_15 < var1_13) ** GOTO lbl85
                        Rotations.I = new String[2];
                        Rotations.IIl();
                        return;
lbl24:
                        // 1 sources

                        while (var13_8 == 0) {
                            ** GOTO lbl83
                        }
                        ** GOTO lbl72
                    }
                    var1_13 = var0_12.length / 4;
                    ** GOTO lbl67
lbl30:
                    // 1 sources

                    while (true) {
                        var13_8 = 0;
                        ** GOTO lbl52
lbl33:
                        // 1 sources

                        while (true) {
                            var12_7 = '\u0000';
                            ** GOTO lbl24
                            break;
                        }
                        break;
                    }
lbl36:
                    // 1 sources

                    while (true) {
                        v1 = var15_10++;
                        var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
                        ** GOTO lbl60
                        break;
                    }
lbl40:
                    // 1 sources

                    while (true) {
                        Rotations.Il = new Object[var9_4.length];
                        ** GOTO lbl47
                        break;
                    }
                }
                switch (var15_10 % 6) {
                    case 1: {
                        ** continue;
                    }
lbl47:
                    // 1 sources

                    var2_11 = -646908859;
                    ** continue;
                    case 4: {
                        v0 = 41;
                        break;
                    }
lbl52:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                    case 3: {
                        v0 = 57;
                        break;
                    }
lbl57:
                    // 1 sources

                    while (true) {
                        var13_8 = -1;
                        ** continue;
                        break;
                    }
lbl60:
                    // 1 sources

                    ** continue;
lbl61:
                    // 1 sources

                    while (true) {
                        var3_14 = 0;
                        break block27;
                        break;
                    }
                    var10_5 = 0;
                    var11_6 = 0;
                    ** continue;
lbl67:
                    // 1 sources

                    Rotations.l = new int[var1_13];
                    ** continue;
lbl69:
                    // 1 sources

                    while (true) {
                        var9_4 = new String[var8_3.length];
                        ** continue;
                        break;
                    }
lbl72:
                    // 2 sources

                    while (true) {
                        var12_7 = var8_3[var10_5];
                        ** continue;
                        break;
                    }
                    case 5: {
                        v0 = 96;
                        break;
                    }
lbl78:
                    // 1 sources

                    while (true) {
                        ** GOTO lbl94
                        break;
                    }
                    default: {
                        v0 = 114;
                        break;
                    }
lbl83:
                    // 1 sources

                    Rotations.II = var9_4;
                    ** continue;
lbl85:
                    // 2 sources

                    while (true) {
                        var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
                        ** continue;
                        break;
                    }
lbl88:
                    // 1 sources

                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    ** continue;
lbl91:
                    // 1 sources

                    var7_2 = "\u8494\u6294\u9af0\u12c8\u0c5d\ue459\ufbba\u499f\uf43e\u1d99\u279f\uf4bd\u27b6\u3704\u7c1f\u0b38\ucbcb\u728c\uc67f\u8229\ubd64\u80a8\u7e34\u2359\u970e\u2fa1\ucd05\ufabc\uea69\u1fc5\ud804\uc4ef\u6ac3\u8d61\ucba5\udd01\ucb3b\ub6d9\uf734\u5034\ua424\u4f55\u3ded\u5650\udaab\u79ben\u6f86\uac1d\u04c0\u276c\u2912\u98f0\uece8\u830b\ud8da\u602a\ue2a8\u38d0\u908f\u738c\u7f77\u95a3\ucf87\ua8dc\u35d1\u068a\uc7c0\uaa29\ufef5\u544e\ub1d6\u8b7a\u65ff\ub5cf\ubee7\uce23\u857b\uc2dc\u7c67\u9e3a\uccb0\u3433\u01e5\u32fb\ua559\u1cb4\uf5bb\ube15\u1063\u89f8\ue8ef\uc5bc\u1fb5\u8e66\ud922";
                    var8_3 = "\fT".toCharArray();
                    ** continue;
lbl94:
                    // 1 sources

                    if (++var10_5 < var8_3.length) ** continue;
                    ** continue;
                    case 2: {
                        v0 = 57;
                        break;
                    }
                }
            }
            var16_1 = v0;
            ** while (true)
        }
        var4_15 = 0;
        ** while (true)
    }

    private static int IlI(int n, int n2) {
        return l[n ^ 0xD99399FE] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lII(short s, char c, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x53B9;
        char[] cArray = II[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            Rotations.Il[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x62E7;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 51656;
            n6 += 49552;
            n6 ^= 0x3A9D;
            n6 ^= 0x39E4;
            n6 -= 43560;
            n6 ^= 0x554B;
            n6 -= 40124;
            n6 -= 5476;
            n6 ^= 0x45D3;
            cArray[n5] = (char)((n6 += 50912) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

