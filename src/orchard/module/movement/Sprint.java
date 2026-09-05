/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIIII
 * Module         : Sprint  [MOVEMENT]
 * Description    : Keeps you sprinting like a vanilla toggle sprint.   (client's own text)
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
 *  net.minecraft.client.MinecraftClient
 */
package orchard.module.movement;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;

@Environment(value=EnvType.CLIENT)
public final class Sprint
extends ModuleBase {
    private static String[] I;
    private static final int[] l;
    private static final String[] II;
    private static final Object[] Il;

    private static void I() {
        Sprint.I[0] = Sprint.IIl(Sprint.lII(2059433310, -852342767).toCharArray(), 69906L, -1426198022);
        Sprint.I[1] = Sprint.IIl(Sprint.lII(2059433311, 834813593).toCharArray(), 40871L, -207622252);
    }

    public Sprint() {
        super(StringFactory.IIII("Sprint"), Category.ll, StringFactory.IIII("Keeps you sprinting like a vanilla toggle sprint."));
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lI() {
        if (!this.IIIlIIl()) {
            return false;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.currentScreen != null) {
            return false;
        }
        if (!minecraftClient.player.isAlive()) return false;
        if (minecraftClient.player.isSneaking()) return false;
        if (minecraftClient.player.isUsingItem()) {
            return false;
        }
        if (!minecraftClient.options.forwardKey.isPressed()) return false;
        if (!minecraftClient.options.backKey.isPressed()) return true;
        return false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block13: {
                block16: {
                    block14: {
                        block15: {
                            break block16;
lbl1:
                            // 1 sources

                            while (true) {
                                var11_5 += var12_6;
                                break block13;
                                break;
                            }
lbl4:
                            // 1 sources

                            while (true) {
                                continue;
lbl6:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                break;
                            }
lbl8:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl10:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl12:
                            // 1 sources

                            while (true) {
                                var13_7 = -1;
                                break block14;
                                break;
                            }
lbl15:
                            // 1 sources

                            while (true) {
                                var13_7 = 0;
                                break block14;
                                break;
                            }
lbl18:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                            var8_2 = "\u5edb\u5e97".toCharArray();
                            var9_3 = new String[var8_2.length];
                            ** while (true)
lbl23:
                            // 1 sources

                            while (true) {
                                continue;
lbl25:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                break;
                            }
lbl27:
                            // 1 sources

                            while (true) {
                                Sprint.l = new int[var1_9];
                                ** continue;
                                break;
                            }
lbl30:
                            // 1 sources

                            while (true) {
                                var11_5 = 0;
                                ** continue;
                                break;
                            }
                            Sprint.II = var9_3;
                            Sprint.Il = new Object[var9_3.length];
                            ** while (true)
lbl36:
                            // 1 sources

                            while (true) {
                                var3_11 += 4;
                                if (++var4_12 < var1_9) ** GOTO lbl8
                                break block15;
                                break;
                            }
                            var2_10 = -1434962686;
                            break block17;
                        }
                        Sprint.I = new String[2];
                        Sprint.I();
                        return;
                        var3_11 = 0;
                        var4_12 = 0;
                        ** while (true)
                        var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
                        Sprint.l[var4_12] = var5_13 ^= var2_10;
                        ** while (true)
                    }
                    var10_4 = 0;
                    ** while (true)
                }
                var6 = 24275;
                var7_1 = "\u70fe\uf3ec\uc999\ucf1f\u860b\u2c09\u5572\uac1d\u4c78\udb25\u2984\u82f6\ue6bd\u6d5a\u0ce8\u2441\ubfc8\u35eb\uba75\ud481\u8093\u290a\ud722\u7d8f\u9853\u094b\ucf79\udbf5\ub8bc\ue6e5\u5861\ua910\ud3d7\ube93\ub39a\u47fa\ueb68\u5842\ud42d\ua62e\u76ae\u2901\u98d8\u5ffe\u8563\ub03c\u9b89\u865d\ua2ea\u39ae\u4900\u1c07\ufcbc\ub7b3\ud2c9\u8a2c\ue851\u7a03\u6469\u467c\u59f2\u6955\u3ae4\ubb38\u820a\u5309\ue9a3\u8f28\ue1c2\u345a\ue55d\u867f\uddd2\u1297\ud01f\u4779";
                ** while (true)
                var12_6 = var8_2[var10_4] ^ var6;
                var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                ** while (true)
                var12_6 = 0;
                if (var13_7 != 0) ** GOTO lbl10
                ** while (true)
            }
            if (++var10_4 >= var8_2.length) ** break;
            ** while (true)
            ** while (true)
        }
        var0_8 = "\t\u00f1\u00f4\u0018\u009c\u00e65\u00f3\u00bf\u00cctv\u00c2\u00f2y\u00dd".getBytes("ISO-8859-1");
        var1_9 = var0_8.length / 4;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIl(char[] cArray, long l2, int n) {
        int n2 = 0xE2384189 ^ n;
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

    private static int IlI(int n, int n2) {
        return l[n ^ 0xD0908393] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x7AC0755E;
        char[] cArray = II[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            Sprint.Il[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xDA4CE1FB;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 3 -> 199;
                default -> 71;
                case 9 -> 0;
                case 2 -> 33;
                case 24 -> 56;
                case 28 -> 46;
                case 20 -> 35;
                case 4 -> 187;
                case 5 -> 84;
                case 12 -> 204;
                case 18 -> 176;
                case 21 -> 192;
                case 29 -> 179;
                case 30 -> 129;
                case 16 -> 195;
                case 15 -> 106;
                case 11 -> 221;
                case 13 -> 252;
                case 22 -> 57;
                case 10 -> 149;
                case 27 -> 87;
                case 26 -> 147;
                case 6 -> 112;
                case 1 -> 237;
                case 19 -> 187;
                case 25 -> 209;
                case 14 -> 4;
                case 8 -> 17;
                case 23 -> 46;
                case 7 -> 182;
                case 17 -> 120;
                case 31 -> 235;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

