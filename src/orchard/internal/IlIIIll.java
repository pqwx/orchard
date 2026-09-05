/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIll
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
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction$Axis
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.World
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

@Environment(value=EnvType.CLIENT)
public final class IlIIIll {
    private static final int I = 6;
    private static final double l = 1.05;
    private static final int[] II;

    public static double I(World world, double d, double d2, double d3, double d4) {
        double d5 = Math.max(0.0, d4 - 0.05);
        double d6 = Double.NEGATIVE_INFINITY;
        d6 = Math.max(d6, IlIIIll.Il(world, d, d2, d3));
        d6 = Math.max(d6, IlIIIll.Il(world, d - d5, d2, d3 - d5));
        d6 = Math.max(d6, IlIIIll.Il(world, d - d5, d2, d3 + d5));
        d6 = Math.max(d6, IlIIIll.Il(world, d + d5, d2, d3 - d5));
        d6 = Math.max(d6, IlIIIll.Il(world, d + d5, d2, d3 + d5));
        return d6;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Vec3d l(World world, LivingEntity livingEntity, Vec3d vec3d, Vec3d vec3d2, double d) {
        if (world == null) return vec3d2;
        if (livingEntity == null) return vec3d2;
        if (vec3d2 == null) {
            return vec3d2;
        }
        double d2 = IlIIIll.I(world, vec3d2.x, vec3d2.y, vec3d2.z, livingEntity.getWidth() / 2.0f);
        if (!Double.isFinite(d2)) return vec3d2;
        if (d2 == Double.NEGATIVE_INFINITY) {
            return vec3d2;
        }
        double d3 = d2 - vec3d2.y;
        if (d3 <= 0.0) return vec3d2;
        if (d > 0.08) {
            return vec3d2;
        }
        if (d3 <= 0.2) {
            return new Vec3d(vec3d2.x, d2, vec3d2.z);
        }
        if (!(d3 <= 0.45)) return vec3d2;
        if (vec3d == null) return vec3d2;
        if (!(Math.abs(vec3d.y - d2) <= 0.3)) return vec3d2;
        if (!(d <= 0.02)) return vec3d2;
        return new Vec3d(vec3d2.x, d2, vec3d2.z);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Vec3d II(World world, Vec3d vec3d, double d) {
        if (world == null) return vec3d;
        if (vec3d != null) {
            double d2 = IlIIIll.I(world, vec3d.x, vec3d.y, vec3d.z, d);
            if (d2 == Double.NEGATIVE_INFINITY) return vec3d;
            if (!(vec3d.y < d2)) return vec3d;
            return new Vec3d(vec3d.x, d2, vec3d.z);
        }
        return vec3d;
    }

    private IlIIIll() {
    }

    /*
     * Unable to fully structure code
     */
    private static double Il(World var0, double var1_1, double var3_2, double var5_3) {
        var7_4 = MathHelper.floor((double)(var3_2 + 1.0));
        var8_5 = -Infinity;
        var10_6 = 0;
        ** GOTO lbl8
        block0: while (!((var14_10 = (double)var11_7.getY() + var13_9.getMax(Direction.Axis.Y)) <= var3_2 + 1.05)) lbl-1000:
        // 2 sources

        {
            while (true) {
                ++var10_6;
lbl8:
                // 2 sources

                if (var10_6 >= 6) {
                    return var8_5;
                }
                var11_7 = BlockPos.ofFloored((double)var1_1, (double)(var7_4 - var10_6), (double)var5_3);
                var12_8 = var0.getBlockState(var11_7);
                var13_9 = var12_8.getCollisionShape((BlockView)var0, var11_7);
                if (!var13_9.isEmpty()) continue block0;
                continue;
                break;
            }
        }
        var8_5 = Math.max(var8_5, var14_10);
        ** while (true)
    }

    private static int lI(int n, int n2) {
        return II[n ^ 0x49FF8D81] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 29006002;
        byte[] byArray = "\u00ae#\u00cc\u00ed".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        II = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IlIIIll.II[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

