/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllll
 * Module         : NoEffectView  [RENDER]
 * Description    : Removes bad status-effect visuals from your camera.   (client's own text)
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
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.registry.entry.RegistryEntry
 */
package orchard.module.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;

@Environment(value=EnvType.CLIENT)
public final class NoEffectView
extends ModuleBase {
    private static String[] I;
    private static final int[] l;
    private static final String[] II;
    private static final Object[] Il;

    public NoEffectView() {
        super(StringFactory.IIII("NoEffectView"), Category.l, StringFactory.IIII("Removes bad status-effect visuals from your camera."));
    }

    private static void lI() {
        NoEffectView.I[0] = NoEffectView.IIl(NoEffectView.lIl(2058428686, -1589297439).toCharArray(), 58114L, 334969243);
        NoEffectView.I[1] = NoEffectView.IIl(NoEffectView.lIl(2058428687, -726719180).toCharArray(), 85844L, 661784611);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIl(char[] cArray, long l2, int n) {
        int n2 = 0x4E6C5282 ^ n;
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
        block19: {
            block15: {
                block18: {
                    block17: {
                        block20: {
                            block14: {
                                block16: {
                                    break block16;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var6 = 13652;
                                break block17;
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
                                    break;
                                }
lbl10:
                                // 1 sources

                                while (true) {
                                    break block14;
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
                                var9_3 = new String[var8_2.length];
                                var13_7 = -1;
                                break block18;
lbl19:
                                // 1 sources

                                while (true) {
                                    var11_5 += var12_6;
                                    ** continue;
                                    break;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    NoEffectView.II = var9_3;
                                    ** continue;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    NoEffectView.I = new String[2];
                                    NoEffectView.lI();
                                    return;
                                }
                            }
                            if (++var10_4 < var8_2.length) break block19;
                            break block20;
lbl32:
                            // 1 sources

                            while (var13_7 == 0) {
                                ** continue;
lbl34:
                                // 1 sources

                                ** GOTO lbl22
                            }
                            break block19;
lbl36:
                            // 1 sources

                            while (true) {
                                var3_11 += 4;
                                if (++var4_12 >= var1_9) {
                                    ** continue;
                                }
                                break block15;
                                break;
                            }
                            var3_11 = 0;
                            var4_12 = 0;
                            break block15;
                        }
                        var13_7 = 0;
                        break block18;
                        var11_5 = 0;
                        var12_6 = 0;
                        ** GOTO lbl32
                    }
                    var7_1 = "\ufc24\ub61d\u4c2f\u36e8\u131a\u2c4c\u1b04\ua125\ubde8\ub54a\u894d\u26a8\uda28\u51a9\ucccf\u4910\u73bd\uef9d\u9523\udd36\uc1c3\u6d2b\uada2\u98ed\u59a4\u76e0\ud23a\u00db\u4a36\u7bb7\u4df4\u91ad\u28d4\u5ccf\u396c\ue1f8\u0e74\u33b3\u5bd7\u7ec9\u834a\ua14c\uc93f\u31f2\u39da\ubd87\u18c7\u4475\u7f33\u40b6\u898e\u4509\u9489\u1a7e\u5e1f\u4529\u65e9\u532e\udb1e\u07b4\u0c52\u6475\u452e\u1329\u287a\ub123\u1cc0\u60b3\u77b5\u9e6b\ued13\ub62c\uf6fd\u3043\u5e86\uef97\uc727\u71c2\u0153\u677c\u2a30\u4da1\u8766\u83cf";
                    var8_2 = "\u3510\u3544".toCharArray();
                    ** while (true)
                    NoEffectView.Il = new Object[var9_3.length];
                    var2_10 = -324865849;
                    var0_8 = "\u001b\u0000\u001a@X\u00de1-[i\u0017\u00e5c\u00a7\u0007+".getBytes("ISO-8859-1");
                    ** while (true)
lbl58:
                    // 1 sources

                    while (true) {
                        var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                        ** continue;
                        break;
                    }
                }
                var10_4 = 0;
                ** while (true)
lbl64:
                // 1 sources

                while (true) {
                    NoEffectView.l[var4_12] = var5_13 ^= var2_10;
                    ** continue;
                    break;
                }
            }
            var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
            ** while (true)
            var1_9 = var0_8.length / 4;
            NoEffectView.l = new int[var1_9];
            ** while (true)
        }
        var12_6 = var8_2[var10_4] ^ var6;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IlI(RegistryEntry<StatusEffect> registryEntry) {
        if (!this.IIIlIIl()) return false;
        if (StatusEffects.BLINDNESS.equals(registryEntry)) return true;
        if (StatusEffects.DARKNESS.equals(registryEntry)) return true;
        if (!StatusEffects.NAUSEA.equals(registryEntry)) return false;
        return true;
    }

    private static int lII(int n, int n2) {
        return l[n ^ 0x81103209] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    private static String lIl(int var0, int var1_1) {
        block45: {
            break block45;
lbl1:
            // 1 sources

            while (true) {
                var9_9 = 218;
                ** GOTO lbl9
                break;
            }
lbl4:
            // 1 sources

            while (true) {
                var9_9 = 185;
                ** GOTO lbl9
                break;
            }
lbl7:
            // 1 sources

            while (true) {
                var9_9 = 112;
lbl9:
                // 32 sources

                while (true) {
                    var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
                    if (true) ** GOTO lbl91
                    break;
                }
                break;
            }
        }
        var3_2 = var0 ^ 2058428686;
        var4_4 = NoEffectView.II[var3_2].toCharArray();
        ** GOTO lbl128
lbl16:
        // 1 sources

        while (true) {
            var9_9 = 134;
            ** GOTO lbl9
            break;
        }
        block38: while (true) {
            switch (var8_8 & 31) {
                case 14: {
                    ** continue;
                }
                case 11: {
                    ** continue;
                }
                case 16: {
                    ** continue;
                }
                case 24: {
                    ** continue;
                }
                case 21: {
                    var9_9 = 233;
                    ** GOTO lbl9
                }
                case 8: {
                    var9_9 = 188;
                    ** GOTO lbl9
                }
                case 6: {
                    var9_9 = 59;
                    ** GOTO lbl9
                }
                case 25: {
                    var9_9 = 57;
                    ** GOTO lbl9
                }
                case 2: {
                    var9_9 = 91;
                    ** GOTO lbl9
                }
                case 29: {
                    var9_9 = 196;
                    ** GOTO lbl9
                }
                case 5: {
                    var9_9 = 60;
                    ** GOTO lbl9
                }
                case 22: {
                    var9_9 = 126;
                    ** GOTO lbl9
                }
                case 30: {
                    var9_9 = 167;
                    ** GOTO lbl9
                }
                case 26: {
                    var9_9 = 115;
                    ** GOTO lbl9
                }
lbl59:
                // 1 sources

                while (true) {
                    var8_8 = 0;
                    continue block38;
                    break;
                }
lbl62:
                // 1 sources

                while (true) {
                    NoEffectView.Il[var3_2] = var5_5;
                    ** GOTO lbl108
                    break;
                }
                case 1: {
                    var9_9 = 36;
                    ** GOTO lbl9
                }
                case 18: {
                    var9_9 = 39;
                    ** GOTO lbl9
                }
                default: {
                    var9_9 = 118;
                    ** GOTO lbl9
                }
                case 27: {
                    var9_9 = 126;
                    ** GOTO lbl9
                }
                case 15: {
                    var9_9 = 61;
                    ** GOTO lbl9
                }
lbl80:
                // 1 sources

                return new String(var4_4).intern();
                case 20: {
                    var9_9 = 198;
                    ** GOTO lbl9
                }
                case 13: {
                    var9_9 = 4;
                    ** GOTO lbl9
                }
                case 4: {
                    var9_9 = 229;
                    ** GOTO lbl9
                }
lbl91:
                // 1 sources

                if (++var8_8 >= var4_4.length) ** break;
                continue block38;
                ** continue;
                case 23: {
                    var9_9 = 130;
                    ** GOTO lbl9
                }
                case 3: {
                    var9_9 = 177;
                    ** GOTO lbl9
                }
                case 10: {
                    var9_9 = 182;
                    ** GOTO lbl9
                }
lbl103:
                // 1 sources

                while (true) {
                    var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 1571570108;
                    ** continue;
                    break;
                }
lbl106:
                // 1 sources

                while (true) {
                    var5_5 = var2_3;
lbl108:
                    // 2 sources

                    var6_6 = var5_5[1];
                    ** continue;
                    break;
                }
                while (true) {
                    var5_5 = new Throwable().getStackTrace();
                    ** continue;
                    break;
                }
                case 19: {
                    var9_9 = 223;
                    ** GOTO lbl9
                }
                case 9: {
                    var9_9 = 126;
                    ** GOTO lbl9
                }
                case 12: {
                    var9_9 = 191;
                    ** GOTO lbl9
                }
                case 7: {
                    var9_9 = 193;
                    ** GOTO lbl9
                }
                case 31: {
                    var9_9 = 12;
                    ** GOTO lbl9
                }
lbl128:
                // 1 sources

                var2_3 = (StackTraceElement[])NoEffectView.Il[var3_2];
                if (var2_3 == null) ** continue;
                ** continue;
                case 28: {
                    var9_9 = 167;
                    ** GOTO lbl9
                }
                case 17: 
            }
            break;
        }
        var9_9 = 95;
        ** while (true)
    }
}

