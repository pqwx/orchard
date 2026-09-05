/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIllIl
 * Purpose not identified - name is the original obfuscated one.
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.Difficulty
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.Difficulty;
import net.minecraft.world.RaycastContext;
import orchard.internal.IlIIllI;

@Environment(value=EnvType.CLIENT)
public final class IIllIllIl {
    /*
     * Enabled aggressive block sorting
     */
    public static float I(LivingEntity livingEntity, Vec3d vec3d, float f) {
        if (livingEntity == null) return 0.0f;
        if (vec3d == null) {
            return 0.0f;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.world == null) {
            return 0.0f;
        }
        float f2 = f * 2.0f;
        double d = Math.sqrt(livingEntity.getEntityPos().squaredDistanceTo(vec3d)) / (double)f2;
        if (d > 1.0) {
            return 0.0f;
        }
        double d2 = 1.0 - d;
        float f3 = (float)((d2 * d2 + d2) * 0.5 * 7.0 * (double)f2 + 1.0);
        f3 = IIllIllIl.II(f3, minecraftClient.world.getDifficulty());
        float f4 = livingEntity.getArmor();
        float f5 = livingEntity.getAttributeInstance(EntityAttributes.ARMOR_TOUGHNESS) != null ? (float)livingEntity.getAttributeValue(EntityAttributes.ARMOR_TOUGHNESS) : 0.0f;
        float f6 = 2.0f + f5 / 4.0f;
        float f7 = MathHelper.clamp((float)(f4 - f3 / f6), (float)(f4 * 0.2f), (float)20.0f);
        return f3 * (1.0f - f7 / 25.0f);
    }

    private IIllIllIl() {
    }

    /*
     * Unable to fully structure code
     */
    private static float l(Vec3d var0, Box var1_1, Entity var2_2, BlockPos var3_3, BlockPos var4_4) {
        block21: {
            block25: {
                block28: {
                    block26: {
                        block27: {
                            block29: {
                                block33: {
                                    block31: {
                                        block30: {
                                            block20: {
                                                block24: {
                                                    block32: {
                                                        block23: {
                                                            block22: {
                                                                block19: {
                                                                    break block30;
lbl1:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var20_14 = 0.0;
                                                                        break block19;
                                                                        break;
                                                                    }
lbl4:
                                                                    // 3 sources

                                                                    return 0.0f;
                                                                }
lbl7:
                                                                // 2 sources

                                                                while (var20_14 <= 1.0) {
                                                                    break block20;
                                                                }
                                                                break block31;
lbl10:
                                                                // 1 sources

                                                                while (true) {
                                                                    ++var16_11;
                                                                    break block21;
                                                                    break;
                                                                }
lbl13:
                                                                // 1 sources

                                                                while (true) {
                                                                    v0(MathHelper.lerp((double)var18_13, (double)var1_1.minX, (double)var1_1.maxX) + var12_9, MathHelper.lerp((double)var20_14, (double)var1_1.minY, (double)var1_1.maxY), MathHelper.lerp((double)var22_15, (double)var1_1.minZ, (double)var1_1.maxZ) + var14_10);
                                                                    break block22;
                                                                    break;
                                                                }
lbl16:
                                                                // 2 sources

                                                                while (true) {
                                                                    if (var18_13 <= 1.0) {
                                                                        ** continue;
                                                                    }
                                                                    break block23;
                                                                    break;
                                                                }
                                                            }
                                                            var24_16 = v0;
                                                            if (IIllIllIl.lI(var5_5, var24_16, var0, var2_2, var3_3, var4_4)) {
                                                                ** continue;
lbl24:
                                                                // 4 sources

                                                                return 0.0f;
lbl26:
                                                                // 1 sources

                                                                while (true) {
                                                                    var22_15 += var10_8;
                                                                    break block24;
                                                                    break;
                                                                }
lbl29:
                                                                // 1 sources

                                                                while (true) {
                                                                    v1 = (float)var16_11 / (float)var17_12;
                                                                    break block25;
                                                                    break;
                                                                }
                                                            }
                                                            break block21;
                                                        }
                                                        ** while (var17_12 != 0)
lbl35:
                                                        // 1 sources

                                                        break block32;
lbl36:
                                                        // 1 sources

                                                        while (true) {
                                                            var12_9 = (1.0 - Math.floor(1.0 / var6_6) * var6_6) * 0.5;
                                                            break block26;
                                                            break;
                                                        }
lbl39:
                                                        // 1 sources

                                                        while (true) {
                                                            if (var8_7 < 0.0) ** GOTO lbl4
                                                            break block27;
                                                            break;
                                                        }
                                                        while (true) {
                                                            break block28;
                                                            break;
                                                        }
lbl44:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    v1 = 0.0f;
                                                    break block25;
                                                }
lbl50:
                                                // 2 sources

                                                while (!(var22_15 <= 1.0)) {
                                                    var20_14 += var8_7;
                                                    ** GOTO lbl7
                                                }
                                                break block33;
lbl54:
                                                // 1 sources

                                                while (true) {
                                                    if (var6_6 < 0.0) ** GOTO lbl4
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            var22_15 = 0.0;
                                            ** GOTO lbl50
lbl60:
                                            // 1 sources

                                            while (true) {
                                                if (var1_1 == null) ** GOTO lbl24
                                                break block29;
                                                break;
                                            }
lbl63:
                                            // 1 sources

                                            while (true) {
                                                if (var5_5.world != null) ** continue;
                                                ** GOTO lbl24
                                                break;
                                            }
                                        }
                                        var5_5 = MinecraftClient.getInstance();
                                        if (var0 == null) ** GOTO lbl24
                                        ** while (true)
                                    }
                                    var18_13 += var6_6;
                                    ** GOTO lbl16
                                }
                                ** while (true)
                            }
                            if (var2_2 != null) ** break;
                            ** while (true)
                            ** while (true)
                        }
                        ** while (!(var10_8 < 0.0))
lbl81:
                        // 1 sources

                        ** while (true)
                    }
                    var14_10 = (1.0 - Math.floor(1.0 / var10_8) * var10_8) * 0.5;
                    var16_11 = 0;
                    ** while (true)
                }
                var6_6 = 1.0 / (var1_1.getLengthX() * 2.0 + 1.0);
                var8_7 = 1.0 / (var1_1.getLengthY() * 2.0 + 1.0);
                var10_8 = 1.0 / (var1_1.getLengthZ() * 2.0 + 1.0);
                ** while (true)
                var17_12 = 0;
                var18_13 = 0.0;
                ** while (true)
            }
            return v1;
        }
        ++var17_12;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float II(float f, Difficulty difficulty) {
        float f2;
        if (difficulty == Difficulty.PEACEFUL) {
            return 0.0f;
        }
        if (difficulty == Difficulty.EASY) {
            return Math.min(f * 0.5f + 1.0f, f);
        }
        if (difficulty == Difficulty.HARD) {
            f2 = f * 1.5f;
            return f2;
        }
        f2 = f;
        return f2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float Il(LivingEntity livingEntity, Vec3d vec3d, float f, BlockPos blockPos) {
        if (livingEntity == null) return 0.0f;
        if (vec3d == null) {
            return 0.0f;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.world != null) {
            Vec3d vec3d2 = livingEntity.getEntityPos();
            Box box = livingEntity.getBoundingBox();
            float f2 = f * 2.0f;
            double d = Math.sqrt(vec3d2.squaredDistanceTo(vec3d)) / (double)f2;
            if (d > 1.0) {
                return 0.0f;
            }
            float f3 = blockPos == null ? IIllIllIl.III(vec3d, box, (Entity)livingEntity) : IIllIllIl.l(vec3d, box, (Entity)livingEntity, null, blockPos);
            double d2 = (1.0 - d) * (double)f3;
            float f4 = (float)((d2 * d2 + d2) * 0.5 * 7.0 * (double)f2 + 1.0);
            f4 = IIllIllIl.II(f4, minecraftClient.world.getDifficulty());
            float f5 = livingEntity.getArmor();
            float f6 = livingEntity.getAttributeInstance(EntityAttributes.ARMOR_TOUGHNESS) != null ? (float)livingEntity.getAttributeValue(EntityAttributes.ARMOR_TOUGHNESS) : 0.0f;
            float f7 = 2.0f + f6 / 4.0f;
            float f8 = MathHelper.clamp((float)(f5 - f4 / f7), (float)(f5 * 0.2f), (float)20.0f);
            return f4 * (1.0f - f8 / 25.0f);
        }
        return 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lI(MinecraftClient minecraftClient, Vec3d vec3d, Vec3d vec3d2, Entity entity, BlockPos blockPos, BlockPos blockPos2) {
        BlockHitResult blockHitResult;
        if (blockPos2 != null) {
            if (IIllIllIl.ll(vec3d2, vec3d, blockPos2)) return false;
        }
        if ((blockHitResult = minecraftClient.world.raycast(new RaycastContext(vec3d2, vec3d, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, entity))).getType() == HitResult.Type.MISS) {
            return true;
        }
        if (blockPos == null) return false;
        if (blockHitResult.getBlockPos().equals((Object)blockPos)) return true;
        return false;
    }

    static boolean ll(Vec3d vec3d, Vec3d vec3d2, BlockPos blockPos) {
        if (vec3d != null) {
            if (vec3d2 != null && blockPos != null) {
                return IlIIllI.llll(vec3d.x, vec3d.y, vec3d.z, vec3d2.x, vec3d2.y, vec3d2.z, blockPos.getX(), blockPos.getY(), blockPos.getZ(), (double)blockPos.getX() + 1.0, (double)blockPos.getY() + 1.0, (double)blockPos.getZ() + 1.0);
            }
        }
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private static float III(Vec3d var0, Box var1_1, Entity var2_2) {
        block24: {
            block25: {
                block26: {
                    block20: {
                        block27: {
                            block28: {
                                block19: {
                                    block21: {
                                        block22: {
                                            block23: {
                                                block17: {
                                                    block16: {
                                                        block15: {
                                                            break block22;
lbl1:
                                                            // 1 sources

                                                            return 0.0f;
lbl3:
                                                            // 1 sources

                                                            while (true) {
                                                                v0(MathHelper.lerp((double)var16_11, (double)var1_1.minX, (double)var1_1.maxX) + var10_7, MathHelper.lerp((double)var18_12, (double)var1_1.minY, (double)var1_1.maxY), MathHelper.lerp((double)var20_13, (double)var1_1.minZ, (double)var1_1.maxZ) + var12_8);
                                                                break block15;
                                                                break;
                                                            }
lbl6:
                                                            // 1 sources

                                                            while (true) {
                                                                ** continue;
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
                                                                v1 = 0.0f;
                                                                break block16;
                                                                break;
                                                            }
lbl13:
                                                            // 1 sources

                                                            while (true) {
                                                                if (var15_10 != 0) break block17;
                                                                ** continue;
                                                                break;
                                                            }
lbl16:
                                                            // 1 sources

                                                            while (true) {
                                                                block18: {
                                                                    continue;
lbl18:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        if (var20_13 <= 1.0) {
                                                                            ** continue;
                                                                        }
                                                                        break block18;
                                                                        break;
                                                                    }
                                                                    var12_8 = (1.0 - Math.floor(1.0 / var8_6) * var8_6) * 0.5;
                                                                    break block19;
                                                                }
                                                                var18_12 += var6_5;
                                                                break block20;
                                                                break;
                                                            }
                                                        }
                                                        var22_14 = v0;
                                                        var23_15 = var3_3.world.raycast(new RaycastContext(var22_14, var0, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, var2_2));
                                                        break block23;
                                                    }
lbl32:
                                                    // 2 sources

                                                    return v1;
                                                }
                                                v1 = (float)var14_9 / (float)var15_10;
                                                ** while (true)
lbl37:
                                                // 1 sources

                                                while (true) {
                                                    var16_11 += var4_4;
                                                    break block21;
                                                    break;
                                                }
                                            }
                                            if (var23_15.getType() != HitResult.Type.MISS) break block24;
                                            break block25;
                                            var6_5 = 1.0 / (var1_1.getLengthY() * 2.0 + 1.0);
                                            break block26;
lbl45:
                                            // 1 sources

                                            while (true) {
                                                var20_13 += var8_6;
                                                ** GOTO lbl18
                                                break;
                                            }
lbl48:
                                            // 1 sources

                                            while (true) {
                                                var16_11 = 0.0;
                                                break block21;
                                                break;
                                            }
lbl51:
                                            // 1 sources

                                            while (true) {
                                                var20_13 = 0.0;
                                                ** continue;
                                                break;
                                            }
                                        }
                                        var3_3 = MinecraftClient.getInstance();
                                        if (var3_3.world == null) {
                                            ** continue;
                                        }
                                        break block27;
                                    }
                                    ** while (!(var16_11 <= 1.0))
lbl61:
                                    // 1 sources

                                    break block28;
                                }
                                var14_9 = 0;
                                var15_10 = 0;
                                ** while (true)
                            }
                            var18_12 = 0.0;
                            break block20;
                        }
                        var4_4 = 1.0 / (var1_1.getLengthX() * 2.0 + 1.0);
                        ** while (true)
                    }
                    ** while (!(var18_12 <= 1.0))
lbl74:
                    // 1 sources

                    ** while (true)
                }
                var8_6 = 1.0 / (var1_1.getLengthZ() * 2.0 + 1.0);
                var10_7 = (1.0 - Math.floor(1.0 / var4_4) * var4_4) * 0.5;
                ** while (true)
            }
            ++var14_9;
        }
        ++var15_10;
        ** while (true)
    }

    public static float IIl(LivingEntity livingEntity, Vec3d vec3d, float f) {
        return IIllIllIl.Il(livingEntity, vec3d, f, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float IlI(LivingEntity livingEntity, BlockPos blockPos, BlockPos blockPos2, Vec3d vec3d) {
        MinecraftClient minecraftClient;
        if (livingEntity == null) return 0.0f;
        if (blockPos != null) {
            minecraftClient = MinecraftClient.getInstance();
            if (minecraftClient.world == null) {
                return 0.0f;
            }
        } else {
            return 0.0f;
        }
        Vec3d vec3d2 = Vec3d.ofCenter((Vec3i)blockPos);
        Vec3d vec3d3 = livingEntity.getEntityPos();
        Vec3d vec3d4 = vec3d == null ? vec3d3 : vec3d;
        Box box = livingEntity.getBoundingBox().offset(vec3d4.subtract(vec3d3));
        float f = 10.0f;
        double d = Math.sqrt(vec3d4.squaredDistanceTo(vec3d2)) / (double)f;
        if (d > 1.0) {
            return 0.0f;
        }
        float f2 = IIllIllIl.l(vec3d2, box, (Entity)livingEntity, blockPos, blockPos2);
        double d2 = (1.0 - d) * (double)f2;
        float f3 = (float)((d2 * d2 + d2) * 0.5 * 7.0 * (double)f + 1.0);
        f3 = IIllIllIl.II(f3, minecraftClient.world.getDifficulty());
        float f4 = livingEntity.getArmor();
        float f5 = livingEntity.getAttributeInstance(EntityAttributes.ARMOR_TOUGHNESS) != null ? (float)livingEntity.getAttributeValue(EntityAttributes.ARMOR_TOUGHNESS) : 0.0f;
        float f6 = 2.0f + f5 / 4.0f;
        float f7 = MathHelper.clamp((float)(f4 - f3 / f6), (float)(f4 * 0.2f), (float)20.0f);
        return f3 * (1.0f - f7 / 25.0f);
    }

    public static float Ill(LivingEntity livingEntity, Vec3d vec3d, float f) {
        try {
            float f2 = IIllIllIl.I(livingEntity, vec3d, f);
            return Float.isFinite(f2) ? f2 : Float.POSITIVE_INFINITY;
        }
        catch (LinkageError | RuntimeException throwable) {
            return Float.POSITIVE_INFINITY;
        }
    }
}

