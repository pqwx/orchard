/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIlIl
 * Purpose not identified - name is the original obfuscated one.
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
 *  net.minecraft.block.BlockState
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Direction$Axis
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.World
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import orchard.internal.IllIlIll;
import orchard.internal.lIIIIllI;
import orchard.internal.llllIIll;

@Environment(value=EnvType.CLIENT)
final class IlIIIlIl {
    private static final double I = 0.02;
    private static final int l = 5;
    static final double II = 0.1;
    private static final double Il = 0.65;
    private static final double lI = 0.05;
    private static final double ll = 0.05;
    private static final double III = 0.74;
    private static final double IIl = 0.42;
    private static final double IlI = 0.15;
    private static final double Ill = 0.035;
    private static final double lII = 1.15;
    private static final double lIl = 0.025;
    private static final int[] llI;

    /*
     * Enabled aggressive block sorting
     */
    static llllIIll I(ClientPlayerEntity clientPlayerEntity, float f, float f2) {
        double d;
        double d2;
        float f3;
        double d3;
        double d4;
        double d5;
        if (clientPlayerEntity == null) {
            return null;
        }
        double d6 = Math.sqrt(f * f + f2 * f2);
        if (d6 < 0.001) {
            float f4 = (float)Math.toRadians(clientPlayerEntity.getYaw());
            double d7 = -Math.sin(f4);
            double d8 = Math.cos(f4);
            double d9 = Math.sqrt(d7 * d7 + d8 * d8);
            if (!(d9 < 0.001)) return new llllIIll(d7 / d9, d8 / d9);
            return null;
        }
        if (d6 > 1.0) {
            f /= (float)d6;
            f2 /= (float)d6;
        }
        if (!((d5 = Math.sqrt((d4 = -(d3 = Math.sin(f3 = (float)Math.toRadians(clientPlayerEntity.getYaw()))) * (double)f - (d2 = Math.cos(f3)) * (double)f2) * d4 + (d = d2 * (double)f - d3 * (double)f2) * d)) < 0.001)) return new llllIIll(d4 / d5, d / d5);
        return null;
    }

    private static double l(double d, double d2, int n, int n2) {
        if (n2 <= 1) {
            return (d + d2) * 0.5;
        }
        return d + (d2 - d) * ((double)n / (double)(n2 - 1));
    }

    private IlIIIlIl() {
    }

    private static boolean II(World world, ClientPlayerEntity clientPlayerEntity, double d, double d2) {
        Box box = clientPlayerEntity.getBoundingBox().offset(d, clientPlayerEntity.fallDistance - (double)clientPlayerEntity.getStepHeight(), d2).contract(0.05, 0.0, 0.05);
        return world.isSpaceEmpty((Entity)clientPlayerEntity, box);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean Il(World world, double d, double d2, double d3, double d4) {
        BlockPos blockPos = BlockPos.ofFloored((double)d, (double)d2, (double)d3);
        BlockState blockState = world.getBlockState(blockPos);
        if (blockState.isAir()) return false;
        if (!blockState.getFluidState().isEmpty()) return false;
        VoxelShape voxelShape = blockState.getCollisionShape((BlockView)world, blockPos);
        if (voxelShape.isEmpty()) return false;
        double d5 = (double)blockPos.getY() + voxelShape.getMax(Direction.Axis.Y);
        if (!(d5 >= d4 - 0.15)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static lIIIIllI lI(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity, double d) {
        IllIlIll illIlIll;
        double d2;
        llllIIll llllIIll2;
        if (minecraftClient == null) return lIIIIllI.III();
        if (minecraftClient.options == null) return lIIIIllI.III();
        if (minecraftClient.world == null) return lIIIIllI.III();
        if (clientPlayerEntity != null) {
            llllIIll2 = IlIIIlIl.lII(minecraftClient, clientPlayerEntity);
            if (llllIIll2 == null) {
                return lIIIIllI.III();
            }
            d2 = IlIIIlIl.III(clientPlayerEntity.getVelocity().x, clientPlayerEntity.getVelocity().z, llllIIll2.I(), llllIIll2.l(), d);
            illIlIll = IlIIIlIl.Ill((World)minecraftClient.world, clientPlayerEntity, llllIIll2.I(), llllIIll2.l(), d2);
        }
        return lIIIIllI.III();
        boolean bl = !IlIIIlIl.II((World)minecraftClient.world, clientPlayerEntity, 0.0, 0.0);
        boolean bl2 = IlIIIlIl.II((World)minecraftClient.world, clientPlayerEntity, llllIIll2.I() * d2, llllIIll2.l() * d2);
        boolean bl3 = bl && bl2;
        boolean bl4 = minecraftClient.options.forwardKey.isPressed() || minecraftClient.options.backKey.isPressed() || minecraftClient.options.leftKey.isPressed() || minecraftClient.options.rightKey.isPressed();
        return new lIIIIllI(bl4, bl3, illIlIll.I(), llllIIll2.I(), llllIIll2.l(), d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean ll(World world, ClientPlayerEntity clientPlayerEntity, double d, double d2) {
        if (world == null) return false;
        if (clientPlayerEntity == null) return false;
        if (IlIIIlIl.II(world, clientPlayerEntity, d, d2)) return false;
        return true;
    }

    static double III(double d, double d2, double d3, double d4, double d5) {
        double d6 = Math.max(0.0, d * d3 + d2 * d4);
        double d7 = d6 * 1.15 + 0.035;
        return Math.min(0.42, Math.max(Math.max(0.025, d5), d7));
    }

    /*
     * Unable to fully structure code
     */
    static double IIl(World var0, ClientPlayerEntity var1_1) {
        block9: {
            block10: {
                block8: {
                    if (var0 == null) lbl-1000:
                    // 2 sources

                    {
                        return 1.0;
                        while (true) {
                            ++var15_10;
                            break block8;
                            break;
                        }
                    }
                    if (var1_1 != null) break block10;
                    ** while (true)
lbl9:
                    // 1 sources

                    block2: while (true) {
                        ++var18_12;
                        ** GOTO lbl21
lbl12:
                        // 1 sources

                        while (true) {
                            var19_13 = IlIIIlIl.l(var9_6, var11_7, var18_12, 5);
                            if (!IlIIIlIl.Il(var0, var16_11, var3_3, var19_13, var2_2.minY)) continue block2;
                            break block9;
                            break;
                        }
                        break;
                    }
                }
lbl17:
                // 2 sources

                while (true) {
                    block11: {
                        if (var15_10 >= 5) {
                            return (double)var13_8 / (double)var14_9;
                        }
                        break block11;
lbl21:
                        // 2 sources

                        while (true) {
                            if (var18_12 >= 5) ** continue;
                            ** continue;
                            break;
                        }
                    }
                    var16_11 = IlIIIlIl.l(var5_4, var7_5, var15_10, 5);
                    var18_12 = 0;
                    ** continue;
                    break;
                }
            }
            var2_2 = var1_1.getBoundingBox();
            var3_3 = var2_2.minY - 0.05;
            var5_4 = var2_2.minX + 0.02;
            var7_5 = var2_2.maxX - 0.02;
            var9_6 = var2_2.minZ + 0.02;
            var11_7 = var2_2.maxZ - 0.02;
            var13_8 = 0;
            var14_9 = 25;
            var15_10 = 0;
            ** while (true)
        }
        ++var13_8;
        ** while (true)
    }

    static lIIIIllI IlI(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity) {
        return IlIIIlIl.lI(minecraftClient, clientPlayerEntity, 0.1);
    }

    /*
     * Unable to fully structure code
     */
    private static IllIlIll Ill(World var0, ClientPlayerEntity var1_1, double var2_2, double var4_3, double var6_4) {
        block20: {
            block18: {
                block19: {
                    block11: {
                        block17: {
                            block10: {
                                block14: {
                                    block12: {
                                        block13: {
                                            block7: {
                                                block16: {
                                                    block15: {
                                                        block9: {
                                                            block8: {
                                                                var8_5 = var1_1.getBoundingBox();
                                                                var9_6 = var8_5.minY - 0.05;
                                                                var11_7 = var8_5.minX + 0.02;
                                                                var13_8 = var8_5.maxX - 0.02;
                                                                var15_9 = var8_5.minZ + 0.02;
                                                                var17_10 = var8_5.maxZ - 0.02;
                                                                var19_11 = (var11_7 + var13_8) * 0.5;
                                                                var21_12 = (var15_9 + var17_10) * 0.5;
                                                                var23_13 = -var4_3;
                                                                var25_14 = var2_2;
                                                                var27_15 = 0.0;
                                                                var29_16 = 0.0;
                                                                var31_17 = new double[]{var11_7, var13_8};
                                                                var32_19 = var31_17.length;
                                                                var33_20 = 0;
                                                                break block15;
lbl17:
                                                                // 2 sources

                                                                while (true) {
                                                                    if (var33_20 >= 5) break block7;
                                                                    break block8;
                                                                    break;
                                                                }
lbl20:
                                                                // 2 sources

                                                                while (true) {
                                                                    if (var38_26 >= var37_25) break block9;
                                                                    break block10;
                                                                    break;
                                                                }
                                                            }
                                                            var34_21 = IlIIIlIl.l(var11_7, var13_8, var33_20, 5);
                                                            var36_22 = 0;
                                                            break block16;
                                                        }
                                                        ++var33_20;
                                                        break block15;
lbl30:
                                                        // 1 sources

                                                        while (true) {
                                                            ++var31_18;
                                                            break block11;
                                                            break;
                                                        }
                                                    }
                                                    if (var33_20 >= var32_19) break block17;
                                                    break block18;
                                                }
lbl37:
                                                // 2 sources

                                                while (true) {
                                                    if (var36_22 >= 5) break block12;
                                                    break block13;
                                                    break;
                                                }
                                            }
                                            var33_20 = 0;
                                            var34_21 = var27_15 + var6_4;
                                            var36_22 = 0;
                                            break block14;
                                        }
                                        var37_24 = IlIIIlIl.l(var15_9, var17_10, var36_22, 5);
                                        if (IlIIIlIl.Il(var0, var34_21, var9_6, var37_24, var8_5.minY)) {
                                            ** continue;
lbl49:
                                            // 2 sources

                                            while (true) {
                                                ++var36_22;
                                                break block14;
                                                break;
                                            }
                                        }
                                        break block11;
                                    }
                                    ++var33_20;
                                    ** GOTO lbl17
lbl56:
                                    // 1 sources

                                    while (true) {
                                        ++var33_20;
                                        ** GOTO lbl49
                                        break;
                                    }
                                }
                                if (var36_22 >= 5) break block19;
                                break block20;
                            }
                            var39_27 = var36_23[var38_26];
                            var41_28 = var34_21 - var19_11;
                            var43_29 = var39_27 - var21_12;
                            var27_15 = Math.max(var27_15, var41_28 * var2_2 + var43_29 * var4_3);
                            var29_16 = Math.max(var29_16, Math.abs(var41_28 * var23_13 + var43_29 * var25_14));
                            ++var38_26;
                            ** GOTO lbl20
                        }
                        var31_18 = 0;
                        var32_19 = 25;
                        var33_20 = 0;
                        ** while (true)
                    }
                    ++var36_22;
                    ** while (true)
                }
                var36_22 = (int)IlIIIlIl.Il(var0, var19_11, var9_6, var21_12, var8_5.minY);
                return new IllIlIll((boolean)var36_22, (double)var31_18 / (double)var32_19, (double)var33_20 / 5.0);
            }
            var34_21 = var31_17[var33_20];
            var36_23 = new double[]{var15_9, var17_10};
            var37_25 = var36_23.length;
            var38_26 = 0;
            ** while (true)
        }
        var37_24 = IlIIIlIl.l(-var29_16, var29_16, var36_22, 5);
        var39_27 = var19_11 + var2_2 * var34_21 + var23_13 * var37_24;
        if (IlIIIlIl.Il(var0, var39_27, var9_6, var41_28 = var21_12 + var4_3 * var34_21 + var25_14 * var37_24, var8_5.minY)) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    static llllIIll lII(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity) {
        float f;
        float f2;
        if (minecraftClient == null) return null;
        if (minecraftClient.options == null) return null;
        if (clientPlayerEntity != null) {
            f2 = 0.0f;
            f = 0.0f;
            if (minecraftClient.options.forwardKey.isPressed()) {
                f2 += 1.0f;
            }
        } else {
            return null;
        }
        if (minecraftClient.options.backKey.isPressed()) {
            f2 -= 1.0f;
        }
        if (minecraftClient.options.leftKey.isPressed()) {
            f += 1.0f;
        }
        if (!minecraftClient.options.rightKey.isPressed()) return IlIIIlIl.I(clientPlayerEntity, f2, f);
        return IlIIIlIl.I(clientPlayerEntity, f2, f -= 1.0f);
    }

    private static int lIl(int n, int n2) {
        return llI[n ^ 0xD8902AEC] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 1167876299;
        byte[] byArray = "q\u0012..\u00ed\u0083\u00fc\u00dd".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        llI = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IlIIIlIl.llI[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

