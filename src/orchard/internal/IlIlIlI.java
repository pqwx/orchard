/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIlI
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package orchard.internal;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import orchard.internal.IIIlIllII;
import orchard.internal.IIlIIlI;
import orchard.internal.IIlIIllII;
import orchard.internal.IIllIIllI;
import orchard.internal.IIlllllIl;
import orchard.internal.IIllllllI;
import orchard.internal.IlIIllI;
import orchard.internal.IlIlIIIlI;
import orchard.internal.IlIlIlIl;
import orchard.internal.IlIllII;
import orchard.internal.IlIlllI;
import orchard.internal.IlllIl;
import orchard.internal.Illll;
import orchard.internal.IllllIIl;
import orchard.internal.lIIlIll;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIlIl;
import orchard.internal.llIlllll;
import orchard.internal.lllIIIII;
import orchard.internal.lllllI;
import orchard.module.combat.KillAura;

@Environment(value=EnvType.CLIENT)
public final class IlIlIlI {
    private float I;
    private static final float l = 420.0f;
    private float II;
    private static final float Il = 320.0f;
    private static final float lI = 3.0f;
    private static final float ll = 0.11f;
    private static final float III = 1.08f;
    private static final float IIl = 0.88f;
    private static final float IlI = 0.35f;
    private int Ill = -1;
    private static final float lII = 1.45f;
    private float lIl;
    private static final float llI = 1.45f;
    private int lll;
    private static final float IIII = 0.35f;
    private static final float IIIl = 0.016f;
    private float IIlI;
    private static final float IIll = 0.14f;
    private static final float IlII = 14.0f;
    private float IlIl;
    private float IllI = 1.0f;
    private float Illl;
    private static final float lIII = 0.55f;
    private float lIIl;
    private static final float lIlI = 10.5f;
    private static final float lIll = 0.24f;
    private static final float llII = 1.45f;
    private IlIlIIIlI llIl;
    private static final float lllI = 0.075f;
    private static final float llll = 1.14f;
    private static final float IIIII = 2.5f;
    private static final float IIIIl = 0.32f;
    private int IIIlI = -1;
    private static final float IIIll = 0.28f;
    private static final float IIlII = 0.0015f;
    private static final float IIlIl = 0.035f;
    private static final float IIllI = 0.52f;
    private boolean IIlll;
    private static final float IlIII = 0.68f;
    private float IlIIl;
    private float IlIlI;
    private static final float IlIll = 1.7f;
    private static final float IllII = 36.0f;
    private static final float IllIl = 0.45f;
    private float IlllI = 1.0f;
    private static final float Illll = 0.8f;
    private static final float lIIII = 0.22f;
    private static final float lIIIl = 0.18f;
    private static final float lIIlI = 0.005f;
    private static final float lIIll = 1.35f;
    private static final float lIlII = 0.12f;
    private float lIlIl;
    private static final float lIllI = 0.46f;
    private static final float lIlll = 0.0125f;
    private float llIII;
    private static final float llIIl = 0.45f;
    private static final float llIlI = 150.0f;
    private final IIlIIlI llIll = new IIlIIlI();
    private static final float lllII = 1.4f;
    private float lllIl;
    private static final int llllI = 2;
    private static final float lllll = 0.9f;
    private float IIIIII;
    private float IIIIIl = 1.0f;
    private static final float IIIIlI = 0.34f;
    private float IIIIll;
    private static final float IIIlII = 0.55f;
    private float IIIlIl;
    private float IIIllI;
    private static final float IIIlll = 0.14f;
    private final IlIllII IIlIII;
    private static final float IIlIIl = 0.65f;
    private static final float IIlIlI = 107.0f;
    private static final float IIlIll = 180.0f;
    private float IIllII;
    private static final float IIllIl = 0.25f;
    private static final float IIlllI = 0.01f;
    private float IIllll;
    private static final float IlIIII = 1.8f;
    private boolean IlIIIl;
    private static final float IlIIlI = 0.12f;
    private static final float IlIIll = 0.82f;
    private float IlIlII;
    private float IlIlIl;
    private static final float IlIllI = 1.35f;
    private float IlIlll;
    private static final float IllIII = 0.07f;
    private static final float IllIIl = 0.78f;
    private static final float IllIlI = 0.02f;
    private float IllIll = 1.0f;
    private static final float IlllII = 1.35f;
    private static final float IlllIl = 0.18f;
    private double IllllI;
    private static final float Illlll = 0.0015f;
    private static final float lIIIII = 20.0f;
    private static final float lIIIIl = 8.0f;
    private static final float lIIIlI = 0.35f;
    private static final float lIIIll = 0.18f;
    private float lIIlII = 1.0f;
    private static final float lIIlIl = 0.82f;
    private static final double lIIllI = 2.0;
    private static final int lIIlll = 6;
    private long lIlIII;
    private static final float lIlIIl = 0.22f;
    private static final float lIlIlI = 1.3f;
    private Vec3d lIlIll;
    private boolean lIllII;
    private static final float lIllIl = 0.55f;
    private static final int lIlllI = 4;
    private static final float lIllll = 120.0f;
    private static final float llIIII = 1.3f;
    private float llIIIl = 1.0f;
    private static final float llIIlI = 0.012f;
    private static final float llIIll = 0.55f;
    private static final float llIlII = 0.36f;
    private static final float llIlIl = 0.1f;
    private static final float llIllI = 3.25f;
    private float llIlll;
    private float lllIII;
    private static final float lllIIl = 3.2f;
    private float lllIlI;
    private boolean lllIll;
    private long llllII;
    private static final float llllIl = 3.0f;
    private static final float lllllI = 0.028f;
    private float llllll;
    private static final float IIIIIII = 0.19f;
    private static final float IIIIIIl = 0.012f;
    private float IIIIIlI;
    private static final float IIIIIll = 90.0f;
    private static final float IIIIlII = 1.35f;
    private static final float IIIIlIl = 0.08f;
    private static final float IIIIllI = -90.0f;
    private float IIIIlll;
    private static final float IIIlIII = 0.22f;
    private static final float IIIlIIl = 1.2f;
    private static final float IIIlIlI = 1.15f;
    private float IIIlIll;
    private static IlIlIlI IIIllII;
    private static final float IIIllIl = 0.08f;
    private float IIIlllI;
    private static final float IIIllll = 0.55f;
    private static final float IIlIIII = 2.05f;
    private float IIlIIIl;
    private int IIlIIlI = -1;
    private static final double IIlIIll = 1.0E-6;
    private static final float IIlIlII = 0.01f;
    private static final float IIlIlIl = 0.42f;
    private float IIlIllI;
    private static final float IIlIlll = 0.3f;
    private float IIllIII;
    private static final float IIllIIl = 1.02f;
    private static final float IIllIlI = 0.18f;
    private static final float IIllIll = 4.9f;
    private static final float IIlllII = 0.82f;
    private static final float IIlllIl = 0.4f;
    private static final float IIllllI = 2.15f;
    private static final float IIlllll = 0.75f;
    private float IlIIIII;
    private float IlIIIIl;
    IllllIIl IlIIIlI;
    private float IlIIIll = 0.35f;
    private static final float IlIIlII = 0.6f;
    private static final float IlIIlIl = 0.9f;
    private static final float IlIIllI = 0.18f;
    private static final float IlIIlll = 2.3f;
    private float IlIlIII;
    private float IlIlIIl = 1.0f;
    private static final float IlIlIlI = 0.075f;
    private static final float IlIlIll = 1.1f;
    private static final float IlIllII = 0.6f;
    private float IlIllIl = 0.45f;
    private static final float IlIlllI = 0.4f;
    private static final float IlIllll = 0.86f;
    private static final float IllIIII = 0.1f;
    private static final float IllIIIl = 0.0014f;
    private IlIlIlIl IllIIlI;
    private static final float IllIIll = 0.86f;
    private static final float IllIlII = 0.7f;
    private final IIlIIlI IllIlIl = new IIlIIlI();
    private static final float IllIllI = 179.0f;
    private static final float IllIlll = 0.024f;
    private float IlllIII;
    private float IlllIIl;
    private static final float IlllIlI = 0.42f;
    private static final float IlllIll = 24.0f;
    private static final float IllllII = 0.016666668f;
    private static final float IllllIl = 1.4f;
    private final IIlIIlI IlllllI = new IIlIIlI();
    private static final float Illllll = 0.58f;
    private static final float lIIIIII = 0.25f;
    private static final float lIIIIIl = 0.3f;
    private static final float lIIIIlI = 4.0f;
    private int lIIIIll = -1;
    private static final float lIIIlII = 0.35f;
    private boolean lIIIlIl;
    private float lIIIllI;
    private static final float lIIIlll = 0.4f;
    private static final float lIIlIII = 0.85f;
    private static final float lIIlIIl = 0.18f;
    private float lIIlIlI;
    private boolean lIIlIll;
    private static final float lIIllII = 60.0f;
    private float lIIllIl = 1.0f;
    private float lIIlllI;
    private float lIIllll;
    private float lIlIIII;
    private float lIlIIIl;
    private Vec3d lIlIIlI;
    private static final float lIlIIll = 0.04f;
    private static final float lIlIlII = 0.06666667f;
    private static final float lIlIlIl = 3.0f;
    private static final float lIlIllI = 0.82f;
    private float lIlIlll;
    private float lIllIII;
    private static final float lIllIIl = 0.7f;
    private static final float lIllIlI = 0.55f;
    private static final float lIllIll = 2.85f;
    private static final float lIlllII = 0.78f;
    private float lIlllIl;
    private static final float lIllllI = 0.08f;
    private int lIlllll;
    private static final long llIIIII = 100000000L;
    private static final float llIIIIl = 0.72f;
    private static final float llIIIlI = 0.06f;
    private static final float llIIIll = 1.55f;
    private float llIIlII;
    private float llIIlIl;
    private float llIIllI;
    private static final float llIIlll = 0.22f;
    private static final float llIlIII = 1.5f;
    private static final float llIlIIl = 0.12f;
    private float llIlIlI;
    private long llIlIll;
    private static final double llIllII = 0.2;
    private static final float llIllIl = 0.7f;
    private static final float llIlllI = 1.12f;
    private static final long llIllll = 150000000L;
    private static final float lllIIII = 0.004f;
    private long lllIIIl;
    private static final float lllIIlI = 0.05f;
    private static final float lllIIll = 4.5f;
    private static final float lllIlII = 0.12f;
    private int lllIlIl;
    private static final float lllIllI = 1.7f;
    private static final float lllIlll = 0.46f;
    private float llllIII;
    private float llllIIl = 1.0f;
    private int llllIlI = -1;
    private float llllIll = 1.0f;
    private int lllllII = -1;
    private static final float lllllIl = 0.1f;
    private static final float llllllI = 0.5f;
    private static final int lllllll = 4;
    private float IIIIIIII;
    private static final float IIIIIIIl = 0.14f;
    private int IIIIIIlI;
    private static final float IIIIIIll = 1.35f;
    private float IIIIIlII;
    private static final float IIIIIlIl = 0.018f;
    private static final float IIIIIllI = 0.6f;
    private float IIIIIlll;
    private static final int[] IIIIlIII;

    private float I(int n) {
        return (float)(n & Integer.MAX_VALUE) / 2.1474836E9f;
    }

    private float l(float f) {
        float f2 = MathHelper.clamp((float)f, (float)1.0f, (float)300.0f);
        return MathHelper.clamp((float)((f2 - 1.0f) / 299.0f), (float)0.0f, (float)1.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void II(int n, ThreadLocalRandom threadLocalRandom) {
        this.IIIlI = n;
        this.lIIllll = 0.0f;
        this.IlIIIIl = 0.18f + threadLocalRandom.nextFloat() * 0.22f;
        float f = 0.18f + threadLocalRandom.nextFloat() * 0.64f;
        float f2 = 0.12f + threadLocalRandom.nextFloat() * 0.22f;
        this.IIIIll = f * (threadLocalRandom.nextBoolean() ? 1.0f : -1.0f);
        this.IlIl = f * f2 * (threadLocalRandom.nextBoolean() ? 1.0f : -1.0f);
    }

    private float Il(float f, float f2, float f3) {
        return MathHelper.lerp((float)MathHelper.clamp((float)f3, (float)0.0f, (float)1.0f), (float)f, (float)f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lI(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3) {
        Vec3d vec3d4 = vec3d3.subtract(vec3d);
        double d = Math.max(0.0, vec3d4.dotProduct(vec3d2));
        Vec3d vec3d5 = vec3d.add(vec3d2.multiply(d));
        return vec3d3.squaredDistanceTo(vec3d5);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void ll(MinecraftClient minecraftClient, IlIlIlIl ilIlIlIl, boolean bl, IlIlIIIlI ilIlIIIlI, boolean bl2) {
        long l2 = System.nanoTime();
        if (bl2) {
            if (l2 - this.lIlIII <= 100000000L) return;
            this.IllIll(minecraftClient, ilIlIlIl, bl, ilIlIIIlI, l2, true);
            return;
        }
        this.llllll();
        if (l2 - this.lIlIII <= 100000000L) {
            return;
        }
        this.IIIIlI(minecraftClient, ilIlIlIl, bl, ilIlIIIlI, 0.05f, l2, false);
    }

    public void III() {
        this.Illl();
    }

    /*
     * Enabled aggressive block sorting
     */
    public IlIlIlI() {
        this.IlllIIl = (float)(Math.random() * 6.2831853);
        this.II = (float)(Math.random() * 6.2831853);
        this.IIlI = (float)(Math.random() * 6.2831853);
        this.IIlIIIl = (float)(Math.random() * 6.2831853);
        this.lIIl = (float)(Math.random() * 6.2831853);
        this.llIIllI = (float)(Math.random() * 6.2831853);
        this.lll = Integer.MIN_VALUE;
        this.IllllI = Double.MAX_VALUE;
        this.IIlIII = new IlIllII();
    }

    /*
     * Enabled aggressive block sorting
     */
    public IlIlIIIlI IIl(MinecraftClient minecraftClient, LivingEntity livingEntity, lllllI lllllI2, boolean bl, Vec3d vec3d, boolean bl2) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (livingEntity == null) return null;
        if (lllllI2 == null) return null;
        if (orchard.internal.IlIlIlI.IIlllIl(vec3d)) {
            if (livingEntity == minecraftClient.player) return null;
            if (!livingEntity.isAlive()) return null;
            if (livingEntity.isRemoved()) return null;
            if (!bl2) {
                if (livingEntity.isInvisible()) return null;
            }
            if (!IIllllllI.II(livingEntity)) {
                Vec3d vec3d2 = minecraftClient.player.getEyePos();
                Vec3d vec3d3 = this.llI(minecraftClient);
                if (!orchard.internal.IlIlIlI.IIlllIl(vec3d2)) return null;
                if (orchard.internal.IlIlIlI.IIlllIl(vec3d3)) return this.IIllIll(minecraftClient, livingEntity, lllllI2, bl, vec3d2, vec3d3, vec3d);
                return null;
            }
            return null;
        }
        return null;
    }

    private Vec3d IlI(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3) {
        Vec3d vec3d4 = vec3d3.subtract(vec3d2);
        double d = vec3d4.lengthSquared();
        if (!(d <= 1.0E-6)) {
            double d2 = vec3d4.dotProduct(vec3d.subtract(vec3d2)) / d;
            d2 = MathHelper.clamp((double)d2, (double)0.0, (double)1.0);
            return vec3d2.add(vec3d4.multiply(d2));
        }
        return vec3d3;
    }

    IlIlIIIlI Ill(MinecraftClient minecraftClient, LivingEntity livingEntity, lllllI lllllI2, boolean bl, boolean bl2) {
        if (minecraftClient != null) {
            if (minecraftClient.player != null) {
                return this.IIlIIIl(minecraftClient, livingEntity, lllllI2, bl, bl2, minecraftClient.player.getEyePos(), this.llI(minecraftClient));
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void lII(boolean bl, float f) {
        block1: {
            if (!bl) break block1;
            this.lIlIIIl = f;
            return;
        }
        this.lIlIlll = f;
    }

    private float lIl(float f, float f2, float f3) {
        if (f < f2) {
            return Math.min(f + f3, f2);
        }
        return Math.max(f - f3, f2);
    }

    private Vec3d llI(MinecraftClient minecraftClient) {
        Vec3d vec3d = minecraftClient.player.getRotationVec(1.0f);
        double d = vec3d.lengthSquared();
        if (!(d <= 1.0E-6)) {
            return vec3d.multiply(1.0 / Math.sqrt(d));
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d lll(Vec3d vec3d, Vec3d vec3d2, LivingEntity livingEntity) {
        Box box = livingEntity.getBoundingBox();
        Vec3d vec3d3 = box.getCenter();
        double d = box.maxY - box.minY;
        Vec3d vec3d4 = new Vec3d(vec3d3.x, box.minY, vec3d3.z);
        Vec3d vec3d5 = new Vec3d(vec3d3.x, box.minY + d, vec3d3.z);
        return this.IlI(vec3d, vec3d4, vec3d5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIII(int n, ThreadLocalRandom threadLocalRandom) {
        this.llllIlI = n;
        this.lIIIllI = threadLocalRandom.nextFloat() * ((float)Math.PI * 2);
        this.llIII = threadLocalRandom.nextFloat() * ((float)Math.PI * 2);
        this.lIIlllI = 1.35f + threadLocalRandom.nextFloat() * 3.5500002f;
        this.IIIlIll = 0.97200006f + threadLocalRandom.nextFloat() * 3.5500002f * 0.58f;
        this.llllIII = 0.075f + threadLocalRandom.nextFloat() * 0.145f;
        this.lIl = this.llllIII * 0.4f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIl(MinecraftClient minecraftClient, Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3, double d, float f) {
        if (!orchard.internal.IlIlIlI.IIlllIl(vec3d3)) return false;
        if (vec3d.squaredDistanceTo(vec3d3) > d) {
            return false;
        }
        Vec3d vec3d4 = vec3d3.subtract(vec3d);
        if (!(this.IIIIIII(vec3d2, vec3d4) <= f)) return false;
        if (!this.IIlIl(minecraftClient, vec3d, vec3d3)) return false;
        return true;
    }

    private void IIlI() {
        this.llIIlII = 0.0f;
        this.lllIl = 0.0f;
    }

    private static boolean IIll(double d, double d2) {
        return Math.abs(d - d2) <= 1.0E-7;
    }

    /*
     * Enabled aggressive block sorting
     */
    static float IlII(float f, float f2, float f3, float f4) {
        if (!Float.isFinite(f)) return 0.0f;
        if (!Float.isFinite(f2)) return 0.0f;
        if (Math.abs(f) <= 0.0015f) return 0.0f;
        if (f2 != 0.0f && Math.signum(f2) != Math.signum(f)) {
            return 0.0f;
        }
        float f5 = MathHelper.clamp((float)f3, (float)0.0033333334f, (float)0.055555556f);
        float f6 = Math.max(Math.max(f4, 0.0f), 180.0f * f5);
        return MathHelper.clamp((float)f2, (float)(-f6), (float)f6);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IlIl(Vec3d vec3d, Box box, float f, float f2) {
        if (!this.IIlll) {
            ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
            this.llIIIl = threadLocalRandom.nextFloat() * 1.0999999f + 0.3f;
            this.IIIIIl = threadLocalRandom.nextFloat() * 1.0999999f + 0.3f;
            this.IlllI = threadLocalRandom.nextFloat() * 1.0999999f + 0.3f;
            this.IIlll = true;
        }
        float f3 = Math.max(0.0f, Math.min(f, 0.1f));
        this.IIlI += f3 * this.llIIIl * ((float)Math.PI * 2);
        this.IIlIIIl += f3 * this.IIIIIl * ((float)Math.PI * 2);
        this.lIIl += f3 * this.IlllI * ((float)Math.PI * 2);
        float f4 = (float)(Math.sin(this.IIlI) * 0.6 + Math.sin((double)this.IIlI * 1.9) * 0.4);
        float f5 = (float)(Math.sin(this.IIlIIIl) * 0.55 + Math.sin((double)this.IIlIIIl * 1.5) * 0.45);
        float f6 = (float)(Math.sin(this.lIIl) * 0.65 + Math.sin((double)this.lIIl * 1.7) * 0.35);
        double d = vec3d.x + (double)(f4 * f2);
        double d2 = vec3d.y + (double)(f5 * f2);
        double d3 = vec3d.z + (double)(f6 * f2);
        return new Vec3d(MathHelper.clamp((double)d, (double)box.minX, (double)box.maxX), MathHelper.clamp((double)d2, (double)box.minY, (double)box.maxY), MathHelper.clamp((double)d3, (double)box.minZ, (double)box.maxZ));
    }

    /*
     * Unable to fully structure code
     */
    private Vec3d IllI(MinecraftClient var1_1, Vec3d var2_2, Vec3d var3_3, LivingEntity var4_4, Box var5_5, double var6_6, float var8_7) {
        block20: {
            block22: {
                block24: {
                    block25: {
                        block17: {
                            block19: {
                                block16: {
                                    block21: {
                                        block23: {
                                            block18: {
                                                if (var1_1 == null) break block16;
                                                break block22;
lbl3:
                                                // 1 sources

                                                while (true) {
                                                    if (var2_2 == null) break block16;
                                                    break block17;
lbl6:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl8:
                                                    // 2 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                    break;
                                                }
lbl10:
                                                // 1 sources

                                                while (orchard.internal.IlIlIlI.IIlllIl(var16_13)) {
                                                    break block18;
                                                }
                                                break block21;
lbl13:
                                                // 1 sources

                                                while (true) {
                                                    v0 = var4_4.getBoundingBox();
                                                    ** GOTO lbl8
                                                    break;
                                                }
lbl16:
                                                // 1 sources

                                                while (true) {
                                                    if (var4_4 != null) break block19;
                                                    break block16;
                                                    break;
                                                }
                                                return var12_10;
                                            }
                                            if (!(var2_2.squaredDistanceTo(var16_13) > var10_9)) break block23;
                                            break block21;
lbl24:
                                            // 1 sources

                                            while (true) {
                                                continue;
lbl26:
                                                // 1 sources

                                                while (var23_18 < var13_11) {
                                                    break block20;
                                                }
                                                break block21;
                                                break;
                                            }
lbl29:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                            var9_8 = v0;
                                            break block24;
lbl33:
                                            // 1 sources

                                            while (true) {
                                                var16_13 = var15_12.next();
                                                ** GOTO lbl10
                                                break;
                                            }
                                            var21_17 = this.lI(var2_2, var3_3, var16_13);
                                            var23_18 = var19_16 + var21_17 * 0.35 + (double)var18_15 * 0.02;
                                            ** GOTO lbl26
                                        }
                                        var17_14 = var16_13.subtract(var2_2);
                                        ** while (true)
                                    }
lbl43:
                                    // 5 sources

                                    while (true) {
                                        if (!var15_12.hasNext()) ** continue;
                                        ** continue;
                                        break;
                                    }
                                    while (true) {
                                        var19_16 = var2_2.squaredDistanceTo(var16_13);
                                        ** continue;
                                        break;
                                    }
                                }
lbl50:
                                // 3 sources

                                return null;
                            }
                            if (var5_5 == null) {
                                ** continue;
                            }
                            break block25;
                        }
                        if (var3_3 == null) ** GOTO lbl50
                        ** while (true)
lbl59:
                        // 1 sources

                        while (true) {
                            if (this.IIlIl(var1_1, var2_2, var16_13)) ** continue;
                            ** GOTO lbl43
                            break;
                        }
                        var18_15 = this.IIIIIII(var3_3, var17_14);
                        if (var18_15 > var8_7) ** GOTO lbl43
                        ** while (true)
                    }
                    v0 = var5_5;
                    ** while (true)
                }
                var10_9 = var6_6 * var6_6;
                var12_10 = null;
                ** while (true)
            }
            if (var1_1.world != null) ** break;
            ** while (true)
            ** while (true)
            var13_11 = Infinity;
            var15_12 = this.IIlIlI(var2_2, var9_8).iterator();
            ** GOTO lbl43
        }
        var13_11 = var23_18;
        var12_10 = var16_13;
        ** while (true)
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void Illl() {
        this.IllIIlI = null;
        this.llIl = null;
        this.llIlIll = 0L;
        this.lll = Integer.MIN_VALUE;
        this.lIlIIlI = null;
        this.IIlI();
        this.IIIlIll();
        Class<IlIlIlI> clazz = IlIlIlI.class;
        synchronized (IlIlIlI.class) {
            if (IIIllII == this) {
                IIIllII = null;
            }
            // ** MonitorExit[var1_1] (shouldn't be in output)
            return;
        }
    }

    private static float lIII(float f) {
        float f2 = MathHelper.clamp((float)f, (float)1.0f, (float)500.0f);
        return MathHelper.clamp((float)((f2 - 1.0f) / 499.0f), (float)0.0f, (float)1.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIl(MinecraftClient minecraftClient, IlIlIlIl ilIlIlIl, IlIlIIIlI ilIlIIIlI, float f, boolean bl) {
        boolean bl2;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        IIllIIllI iIllIIllI;
        float f16;
        float f17;
        boolean bl3;
        IlllIl illlIl = ilIlIlIl.IIl();
        if (ilIlIIIlI.I()) {
            this.lIllll(minecraftClient, ilIlIlIl, ilIlIIIlI, f);
            return;
        }
        float[] fArray = ilIlIlIl.I() ? orchard.internal.IlIlllI.lllI(minecraftClient) : null;
        float f18 = fArray == null ? minecraftClient.player.getYaw() : fArray[0];
        float f19 = this.IIIlIII(fArray == null ? minecraftClient.player.getPitch() : fArray[1]);
        llIlllll llIlllll2 = this.IIIlll(minecraftClient, ilIlIlIl, ilIlIIIlI, f18, f19, f);
        float f20 = llIlllll2.l();
        float f21 = this.IIIIIlI(illlIl, f19, llIlllll2.I());
        float f22 = this.IIIIl(orchard.internal.IlIlIlI.IIlIlll(f20 - f18), ilIlIIIlI.II());
        f20 = f18 + f22;
        float f23 = f21 - f19;
        float f24 = (float)Math.hypot(f22, f23);
        if (f24 <= 0.01f) {
            this.IIlI();
            this.llllIl();
            this.IIlIII.Il();
            this.lIllII(f18, f19);
            return;
        }
        if (this.lllIl(ilIlIIIlI, f24)) {
            this.IIlI();
            this.llllIl();
            this.IIlIII.Il();
            this.lIllII(f18, f19);
            return;
        }
        IIIlIllII iIIlIllII = ilIlIlIl.Ill();
        lIIlIll lIIlIll2 = this.IllIII(ilIlIlIl, ilIlIIIlI, f24, f, bl);
        if (lIIlIll2.l()) {
            f20 += lIIlIll2.I();
            f21 = this.IIIlIII(f21 + lIIlIll2.II());
        }
        float f25 = this.IIIIl(orchard.internal.IlIlIlI.IIlIlll(f20 - f18), ilIlIIIlI.II());
        f20 = f18 + f25;
        float f26 = f21 - f19;
        float f27 = (float)Math.hypot(f25, f26);
        lIIlIll lIIlIll3 = this.IIlIll(ilIlIlIl, ilIlIIIlI, f27, f, bl);
        if (lIIlIll3.l()) {
            f21 = this.IIIlIII(f21 + lIIlIll3.II());
            f25 = this.IIIIl(orchard.internal.IlIlIlI.IIlIlll((f20 += lIIlIll3.I()) - f18), ilIlIIIlI.II());
            f20 = f18 + f25;
            f26 = f21 - f19;
            f27 = (float)Math.hypot(f25, f26);
        }
        this.lIlIIl(ilIlIlIl, ilIlIIIlI, f27);
        lIIlIll lIIlIll4 = this.llIlIl(ilIlIlIl, ilIlIIIlI, f27);
        if (lIIlIll4.l()) {
            f20 = f18 + f25 + lIIlIll4.I();
            f21 = this.IIIlIII(f19 + f26 + lIIlIll4.II());
        }
        f21 = this.IIIIIlI(illlIl, f19, f21);
        f25 = this.IIIIl(orchard.internal.IlIlIlI.IIlIlll(f20 - f18), ilIlIIIlI.II());
        f20 = f18 + f25;
        f26 = f21 - f19;
        f27 = (float)Math.hypot(f25, f26);
        this.lIIlll(ilIlIlIl, f18, f19, f25, f26);
        float f28 = this.IIlIIl(this.llIll, ilIlIIIlI.II(), 45, f, iIIlIllII.IIII(), iIIlIllII.lI(), iIIlIllII.I(), iIIlIllII.l());
        float f29 = this.IIlIIl(this.IllIlIl, ilIlIIIlI.II(), 87, f, iIIlIllII.ll(), iIIlIllII.llI(), iIIlIllII.I(), iIIlIllII.l());
        float f30 = this.lIllI(ilIlIIIlI, f25, f26);
        f30 = MathHelper.clamp((float)(f30 * this.lIIlII), (float)0.0f, (float)1.0f);
        float f31 = this.IIIII(ilIlIlIl, f30, f28);
        float f32 = this.IIIII(ilIlIlIl, f30, f29) * 0.78f;
        if (Math.abs(f25) <= f31 && Math.abs(f26) <= f32 && Math.abs(this.llIIlII) <= 0.011f && Math.abs(this.lllIl) <= 0.011f) {
            this.IIlI();
            this.llllIl();
            this.IIlIII.Il();
            this.lIllII(f18, f19);
            float f33 = this.IIIllll(ilIlIlIl) * Math.max(f, 0.0f) * 0.35f;
            if (ilIlIIIlI.I()) return;
            if (this.IlIIIl) return;
            if (!(ilIlIlIl.III() <= 1.0f)) return;
            if (!(ThreadLocalRandom.current().nextFloat() < f33)) return;
            ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
            this.IlIIIl = true;
            this.IIIIlll = 0.3f + threadLocalRandom.nextFloat() * 0.59999996f;
            return;
        }
        boolean bl4 = this.IIIIIIlI > 0;
        boolean bl5 = bl3 = this.lllIlIl > 0;
        if (!bl4 || !bl3) {
            f17 = this.lllll(ilIlIlIl);
            f16 = this.lIlI(ilIlIlIl);
            iIllIIllI = this.lIll(ilIlIlIl, f18, f20, this.llIIlII, f17, bl4, f, f30, f28, true, f27, ilIlIIIlI.I());
        }
        this.IIlI();
        this.lIllII(f18, f19);
        return;
        IIllIIllI iIllIIllI2 = f26 != 0.0f ? this.lIll(ilIlIlIl, f19, f21, this.lllIl, f16, bl3, f, f30, f29, false, f27, ilIlIIIlI.I()) : new IIllIIllI(f19, 0.0f);
        float f34 = MathHelper.wrapDegrees((float)(iIllIIllI.I() - f18));
        float f35 = iIllIIllI2.I() - f19;
        this.llIIlII = iIllIIllI.l();
        this.lllIl = iIllIIllI2.l();
        float f36 = (float)Math.hypot(f34, f35);
        if (!this.IIIlI(ilIlIlIl) && f27 > 1.0E-4f && f36 > 1.0E-4f) {
            float f37 = MathHelper.clamp((float)(f36 / f27), (float)0.0f, (float)1.0f);
            float f38 = f37 * f37 * (3.0f - 2.0f * f37);
            float f39 = f38 / Math.max(f37, 1.0E-4f);
            float f40 = MathHelper.clamp((float)(1.0f + (f39 - 1.0f) * 0.42f), (float)0.55f, (float)1.45f);
            f15 = 0.22f;
            if (this.lllIll(ilIlIlIl)) {
                f15 *= 0.78f;
            }
            f14 = (float)Math.sin((double)f37 * Math.PI);
            f13 = this.I * f15 * f14;
            f12 = f40 * (1.0f - f13 * 0.5f);
            f11 = f40 * (1.0f + f13);
            f34 *= f12;
            f35 *= f11;
        }
        lIlIlIl lIlIlIl2 = this.lIllIl(ilIlIlIl, f34, f35, f27, f, Math.max(f17, f16));
        f34 = lIlIlIl2.I();
        f35 = lIlIlIl2.l();
        f36 = (float)Math.hypot(f34, f35);
        lIlIlIl lIlIlIl3 = this.IIllIl(ilIlIlIl, f34, f35, f25, f26, f27, f36, f30, ilIlIIIlI.I());
        f34 = lIlIlIl3.I();
        f35 = lIlIlIl3.l();
        boolean bl6 = ilIlIlIl.III() > 1.0f;
        boolean bl7 = ilIlIlIl.Il() == lllIIIII.II;
        f15 = ilIlIlIl.IIl().III();
        f14 = !ilIlIIIlI.I() && !bl7 ? (bl6 ? 0.05f : 0.2f * f15 * MathHelper.clamp((float)(f27 / 6.0f), (float)0.0f, (float)1.0f)) : 0.0f;
        float f41 = f13 = !this.lllIll(ilIlIlIl) ? ilIlIlIl.IIl().lI() : iIIlIllII.llIl();
        float f42 = !bl6 && !bl7 ? f13 : (f12 = 0.0f);
        if (f12 > 0.0f && f27 > 0.15f) {
            f11 = (float)Math.hypot(this.llIIlII, this.lllIl);
            f10 = MathHelper.clamp((float)(f11 / 10.0f), (float)0.35f, (float)1.6f);
            f9 = MathHelper.clamp((float)(f27 / 4.0f), (float)0.25f, (float)1.25f);
            f8 = f12 * f10 * f9;
            f7 = Math.signum(f25) * Math.min(Math.abs(f25) * 0.3f, 3.0f) * f8;
            f6 = Math.signum(f26) * Math.min(Math.abs(f26) * 0.2f, 1.8f) * f8;
            f34 += f7 * MathHelper.clamp((float)(f * 30.0f), (float)0.3f, (float)1.5f);
            f35 += f6 * MathHelper.clamp((float)(f * 30.0f), (float)0.3f, (float)1.5f);
        }
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        f10 = Math.abs(this.llIIlII);
        f9 = Math.abs(this.lllIl);
        f8 = !bl7 ? iIIlIllII.IIl() * f14 : 0.0f;
        f7 = MathHelper.clamp((float)(f27 / 2.0f), (float)0.0f, (float)1.0f);
        f7 *= f7;
        f6 = (0.028f + Math.min(f10 * 0.0014f, 0.06f)) * f8 * f7;
        float f43 = (0.028f + Math.min(f9 * 0.0014f, 0.06f)) * f8 * f7;
        float f44 = 0.18f * f8;
        if (f44 <= 1.0E-6f) {
            this.IlIlII = 0.0f;
            this.IIIIIlI = 0.0f;
        } else {
            this.IlIlII = MathHelper.clamp((float)(this.IlIlII * 0.86f + (threadLocalRandom.nextFloat() - 0.5f) * f6), (float)(-f44), (float)f44);
            this.IIIIIlI = MathHelper.clamp((float)(this.IIIIIlI * 0.86f + (threadLocalRandom.nextFloat() - 0.5f) * f43), (float)(-f44), (float)f44);
        }
        if (threadLocalRandom.nextFloat() < 0.55f * iIIlIllII.lllI() * f14 * Math.max(f, 0.0f)) {
            f5 = (0.07f + threadLocalRandom.nextFloat() * 0.15f) * iIIlIllII.IIll();
            f4 = 0.28800002f * Math.max(f8, iIIlIllII.IIll());
            if (!threadLocalRandom.nextBoolean()) {
                float f45;
                if (f35 == 0.0f) {
                    f45 = threadLocalRandom.nextBoolean() ? 1.0f : -1.0f;
                }
                f45 = -Math.signum(f35);
                var55_53 = f45;
                this.IIIIIlI = MathHelper.clamp((float)(this.IIIIIlI + var55_53 * f5), (float)(-f4), (float)f4);
            } else {
                var55_53 = f34 != 0.0f ? -Math.signum(f34) : (threadLocalRandom.nextBoolean() ? 1.0f : -1.0f);
                this.IlIlII = MathHelper.clamp((float)(this.IlIlII + var55_53 * f5), (float)(-f4), (float)f4);
            }
        }
        f34 += this.IlIlII;
        f35 += this.IIIIIlI;
        f5 = (float)Math.hypot(this.llIIlII, this.lllIl) * 20.0f;
        f4 = 0.07f * iIIlIllII.IIl() * f7;
        float[] fArray2 = this.IIlIII.II(f, f5, f4);
        f34 += fArray2[0];
        f35 += fArray2[1];
        f34 *= illlIl.Il();
        f35 *= illlIl.IlI();
        if (Math.abs(f21 - f19) <= 0.0015f && Math.abs(f35) <= 0.0015f) {
            f35 = 0.0f;
            this.lllIl = 0.0f;
        }
        if (Math.abs(f34) <= 0.01f && Math.abs(f35) <= 0.01f) {
            this.lIllII(f18, f19);
            return;
        }
        float f46 = this.IIllII(ilIlIlIl, f, bl);
        f34 *= f46;
        f35 *= f46;
        if (this.IIllII < 0.25f) {
            this.IIllII += Math.max(0.0f, Math.min(f, 0.1f));
            f3 = MathHelper.clamp((float)(this.IIllII / 0.25f), (float)0.0f, (float)1.0f);
            f3 = f3 * f3 * (3.0f - 2.0f * f3);
            f34 *= f3;
            f35 *= f3;
        }
        if (!bl6) {
            this.lllII(f);
            if (this.lIIlII()) {
                f3 = MathHelper.clamp((float)(1.0f - this.llllll / Math.max(0.001f, this.llllll + f)), (float)0.05f, (float)0.25f);
                f34 *= f3;
                f35 *= f3;
            }
            if (this.IIIlllI > 0.0f && this.IIIlIl > 1.0E-4f) {
                f3 = MathHelper.clamp((float)(this.IIIlllI / this.IIIlIl), (float)0.0f, (float)1.0f);
                f2 = MathHelper.clamp((float)(1.0f - 0.85f * f3), (float)0.15f, (float)1.0f);
                f34 *= f2;
                f35 *= f2;
                this.IIIlllI = Math.max(0.0f, this.IIIlllI - Math.max(0.0f, f));
            }
        }
        f34 += this.IlllII(ilIlIlIl, f34, bl) * f14;
        f35 += this.IlllII(ilIlIlIl, f35, bl) * f14;
        f3 = this.IllIl(minecraftClient);
        f34 = this.lIlIl(f34, f3, true);
        f35 = this.lIlIl(f35, f3, false);
        f2 = f18 + f34;
        float f47 = this.IIIlIII(f19 + f35);
        boolean bl8 = bl2 = !ilIlIlIl.I() || this.Illlll(minecraftClient, ilIlIIIlI, f2, f47);
        if (!ilIlIlIl.I()) {
            lIIllllI.IIlII(minecraftClient, f2, f47);
        }
        if (!bl2) {
            this.IIlI();
            this.lIllII(f18, f19);
            return;
        }
        this.lIllII(f2, f47);
        if (!(Math.abs(this.I) > 1.0E-4f)) return;
        float f48 = Math.max(0.05f, 0.55f);
        this.I *= (float)Math.exp(-Math.max(f, 0.0f) / f48);
    }

    /*
     * Enabled aggressive block sorting
     */
    private float lIlI(IlIlIlIl ilIlIlIl) {
        float f = this.IIllIII(ilIlIlIl);
        float f2 = (0.74f + (1.0f - f) * 1.15f) * 1.45f * this.llIIII(ilIlIlIl) * ilIlIlIl.III();
        if (!this.lllIll(ilIlIlIl)) return f2;
        return f2 *= ilIlIlIl.Ill().lII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIllIIllI lIll(IlIlIlIl ilIlIlIl, float f, float f2, float f3, float f4, boolean bl, float f5, float f6, float f7, boolean bl2, float f8, boolean bl3) {
        float f9;
        float f10;
        float f11 = this.IIllI(ilIlIlIl, f6, f7, !bl2);
        float f12 = this.IIlllll(ilIlIlIl, f4, f6, f7);
        if (!bl3) {
            f10 = ilIlIlIl.IIl().l();
            f11 *= 0.85f + f10 * 0.3f;
            f12 *= 0.9f - f10 * 0.1f;
        } else {
            f10 = (float)orchard.internal.IlIIllI.IIll(f8);
            f9 = ilIlIlIl.IIl().l();
            f11 *= 0.9f + f9 * 0.35f + (1.0f - f10) * 0.15f;
            f12 *= 0.85f - f9 * 0.15f + f10 * 0.3f;
            if (this.IIIlI(ilIlIlIl)) {
                f11 *= 1.35f;
                f12 *= 0.75f;
            }
        }
        if (f8 < 24.0f) {
            f10 = MathHelper.clamp((float)(f8 / 24.0f), (float)0.0f, (float)1.0f);
            f9 = 1.0f - (1.0f - f10) * (1.0f - f10) * (1.0f - f10);
            float f13 = 0.2f + 0.8f * f9;
            f12 *= f13;
            f11 = Math.max(f11, f11 * (1.0f + (1.0f - f10) * 0.35f));
        } else if (ilIlIlIl.III() > 1.0f && f8 < 3.0f) {
            f10 = MathHelper.clamp((float)(f8 / 3.0f), (float)0.35f, (float)1.0f);
            f12 *= f10;
        }
        f10 = MathHelper.clamp((float)f5, (float)0.0033333334f, (float)0.055555556f);
        if (bl) {
            IIllIIllI iIllIIllI;
            iIllIIllI(f, this.lIl(f3, 0.0f, f12 * f10 * 1.25f));
            return iIllIIllI;
        }
        if (!bl2) return this.IIIIllI(f, this.IIIlIII(f2), f3, f11, f12, f10);
        return this.IlllIl(f, f2, f3, f11, f12, f10);
    }

    void llII(int n, double d) {
        this.IIlIIlI = n;
        this.IllllI = d;
    }

    public IlIlIIIlI llIl(MinecraftClient minecraftClient, LivingEntity livingEntity, lllllI lllllI2, boolean bl, Vec3d vec3d) {
        return this.IIl(minecraftClient, livingEntity, lllllI2, bl, vec3d, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    float lllI(float f, float f2, float f3) {
        float f4;
        float f5;
        if (!this.lIIlIll) {
            return 0.0f;
        }
        this.Illl += f2;
        float f6 = this.IlIlIII > 0.0f ? MathHelper.clamp((float)(this.Illl / this.IlIlIII), (float)0.0f, (float)1.0f) : 1.0f;
        float f7 = Math.abs(f);
        float f8 = this.IIIIIl(f6, f3);
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        f8 += f8 * (threadLocalRandom.nextFloat() - 0.5f) * 2.0f * 0.08f;
        float f9 = Math.signum(f) * Math.min(f8, f7);
        float f10 = this.llIlII(f, this.lIIlIlI);
        f10 = MathHelper.clamp((float)f10, (float)(-f3 * 0.6f), (float)(f3 * 0.6f));
        float f11 = 8.0f;
        float f12 = 4.0f;
        if (f7 >= f11) {
            f5 = 1.0f;
        } else if (f7 <= f12) {
            f5 = 0.0f;
        } else {
            f4 = (f7 - f12) / (f11 - f12);
            f5 = f4 * f4 * (3.0f - 2.0f * f4);
        }
        f4 = MathHelper.lerp((float)f5, (float)f10, (float)f9);
        this.lIIlIlI = f4;
        return f4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float llll(float f, float f2, float f3, float f4) {
        float f5 = orchard.internal.IlIlIlI.IlII(f, f2, f3, f4);
        if (f5 == 0.0f && f2 != 0.0f) {
            this.lllIl = 0.0f;
            this.IlIIl = 0.0f;
        }
        return f5;
    }

    private float IIIII(IlIlIlIl ilIlIlIl, float f, float f2) {
        float f3 = this.IIllIII(ilIlIlIl);
        return MathHelper.clamp((float)(0.024f + f3 * 0.038f + (1.0f - f2) * 0.09f - f * 0.018f), (float)0.024f, (float)0.14f);
    }

    /*
     * Enabled aggressive block sorting
     */
    float IIIIl(float f, int n) {
        if (!Float.isFinite(f)) {
            return f;
        }
        float f2 = Math.abs(f);
        if (n != this.lIIIIll) {
            this.lIIIIll = n;
            if (f2 < 150.0f) {
                this.IIllll = 0.0f;
            }
        }
        if (this.IIllll != 0.0f) {
            if (f2 >= 150.0f) {
                return orchard.internal.IlIlIlI.IlIllI(f, this.IIllll);
            }
            this.IIllll = 0.0f;
        }
        if (!(f2 >= 179.0f)) return f;
        this.IIllll = this.lIIlIl();
        return orchard.internal.IlIlIlI.IlIllI(f, this.IIllll);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlI(IlIlIlIl ilIlIlIl) {
        if (ilIlIlIl == null) return false;
        if (ilIlIlIl.Il() != lllIIIII.II) return false;
        if (ilIlIlIl.ll() != IIlIIllII.I) return false;
        if (!(ilIlIlIl.IIl().l() <= 1.0E-4f)) return false;
        if (ilIlIlIl.I()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IIIll(MinecraftClient minecraftClient, Vec3d vec3d) {
        if (minecraftClient == null) return vec3d;
        if (minecraftClient.player == null) return vec3d;
        if (vec3d == null) {
            return vec3d;
        }
        Vec3d vec3d2 = minecraftClient.player.getEyePos();
        Vec3d vec3d3 = this.llI(minecraftClient);
        if (!orchard.internal.IlIlIlI.IIlllIl(vec3d3)) {
            return vec3d;
        }
        double d = Math.max(0.75, Math.min(vec3d2.distanceTo(vec3d), 8.0));
        return vec3d2.add(vec3d3.multiply(d));
    }

    /*
     * Enabled aggressive block sorting
     */
    static float IIlII(float f, float f2) {
        if (!Float.isFinite(f)) return 0.0f;
        if (!Float.isFinite(f2)) return 0.0f;
        if (Math.abs(f) <= 0.01f) return 0.0f;
        if (f2 == 0.0f) return 0.0f;
        if (Math.signum(f2) == Math.signum(f)) return Math.copySign(Math.min(Math.abs(f2), Math.abs(f)), f);
        return 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIl(MinecraftClient minecraftClient, Vec3d vec3d, Vec3d vec3d2) {
        BlockHitResult blockHitResult = minecraftClient.world.raycast(new RaycastContext(vec3d, vec3d2, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)minecraftClient.player));
        if (blockHitResult == null) return true;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIllI(IlIlIlIl ilIlIlIl, float f, float f2, boolean bl) {
        float f3;
        float f4;
        float f5;
        float f6 = ilIlIlIl.IIl().l();
        float f7 = 0.035f + f6 * 0.145f - f * 0.02f;
        float f8 = MathHelper.clamp((float)(f7 * MathHelper.clamp((float)(2.0f - f2), (float)0.9f, (float)1.1f)), (float)0.03f, (float)0.22f);
        float f9 = !bl ? Math.abs(this.lllIl) : Math.abs(this.llIIlII);
        float f10 = f5 = bl ? 0.35f : 0.12f;
        if (this.lllIll(ilIlIlIl)) {
            f5 *= 0.78f;
        }
        float f11 = MathHelper.clamp((float)(f9 / 60.0f), (float)0.0f, (float)1.0f);
        f8 *= 1.0f + f5 * f11 * 0.3f;
        if (ilIlIlIl.Il() == lllIIIII.I) {
            f4 = MathHelper.clamp((float)(ilIlIlIl.IlI() / 100.0f), (float)0.0f, (float)1.0f);
            f3 = 1.0f + (1.0f - f4) * 2.5f;
            f8 *= f3;
        }
        f4 = Math.max(1.0f, ilIlIlIl.III());
        f3 = MathHelper.clamp((float)(0.015f / f4), (float)0.003f, (float)0.025f);
        if (!this.lllIll(ilIlIlIl)) return MathHelper.clamp((float)(f8 / f4), (float)f3, (float)0.28f);
        return MathHelper.clamp((float)((f8 *= ilIlIlIl.Ill().llII()) / f4), (float)f3, (float)0.25f);
    }

    /*
     * Enabled aggressive block sorting
     */
    static Box IIlll(Box box, double d) {
        if (box == null) {
            return null;
        }
        double d2 = Math.min(box.getLengthX(), Math.min(box.getLengthY(), box.getLengthZ()));
        double d3 = Math.max(0.0, d2 * 0.49);
        double d4 = Double.isFinite(d) ? MathHelper.clamp((double)d, (double)0.0, (double)d3) : 0.0;
        return new Box(box.minX + d4, box.minY + d4, box.minZ + d4, box.maxX - d4, box.maxY - d4, box.maxZ - d4);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IlIII(MinecraftClient minecraftClient, Vec3d vec3d, Vec3d vec3d2, LivingEntity livingEntity, lllllI lllllI2, double d, float f) {
        Illll illll;
        Illll illll2 = illll = lllllI2.III() == null ? orchard.internal.Illll.II : lllllI2.III();
        if (lllllI2.Il()) {
            Box box = IIlllllIl.IlIllll(livingEntity, illll);
            return this.IIlIIll(minecraftClient, vec3d, vec3d2, livingEntity, box, d, f);
        }
        Vec3d vec3d3 = IIlllllIl.IlIllIl(livingEntity, illll);
        if (!this.IIIl(minecraftClient, vec3d, vec3d2, vec3d3, d * d, f)) return null;
        Vec3d vec3d4 = vec3d3;
        return vec3d4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean IlIIl() {
        if (!this.lIIlIll) return false;
        if (this.lIIIlI()) return false;
        return true;
    }

    private static float IlIlI(float f) {
        float f2 = MathHelper.clamp((float)f, (float)1.0f, (float)300.0f);
        return MathHelper.clamp((float)((f2 - 1.0f) / 299.0f), (float)0.0f, (float)1.0f);
    }

    /*
     * Unable to fully structure code
     */
    private lIlIlIl IlIll(float var1_1, float var2_2, float var3_3, float var4_4, float var5_5, boolean var6_6) {
        block45: {
            block39: {
                block43: {
                    block44: {
                        block38: {
                            block29: {
                                block46: {
                                    block30: {
                                        block35: {
                                            block41: {
                                                block36: {
                                                    block32: {
                                                        block37: {
                                                            block31: {
                                                                block33: {
                                                                    block42: {
                                                                        block27: {
                                                                            block34: {
                                                                                block40: {
                                                                                    block28: {
                                                                                        if (var6_6) break block40;
                                                                                        break block41;
lbl3:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var10_9 = ThreadLocalRandom.current();
                                                                                            break block27;
                                                                                            break;
                                                                                        }
lbl6:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            break block28;
                                                                                            break;
                                                                                        }
lbl8:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            v0 = 1.75f;
                                                                                            break block29;
                                                                                            break;
                                                                                        }
lbl11:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            break block30;
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
                                                                                            continue;
                                                                                            break;
                                                                                        }
lbl17:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            continue;
                                                                                            break;
                                                                                        }
lbl19:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            v1 = 0.82f;
                                                                                            break block31;
                                                                                            break;
                                                                                        }
lbl22:
                                                                                        // 1 sources

                                                                                        return new lIlIlIl(var1_1, var2_2);
                                                                                    }
                                                                                    var8_7 = orchard.internal.IlIlIlI.IIlIlII(0.9f, 2.3f, var3_3) * (1.0f - orchard.internal.IlIlIlI.IIlIlII(6.2f, 10.4f, var3_3));
                                                                                    var9_8 = 1.15f * Math.max(var5_5, 0.0f) * MathHelper.clamp((float)(var4_4 * 2.4f), (float)0.0f, (float)0.85f) * MathHelper.clamp((float)(0.35f + var8_7 * 0.4f), (float)0.35f, (float)0.75f);
                                                                                    ** while (true)
                                                                                    while (true) {
                                                                                        v2 = 0.11f + var10_9.nextFloat() * 0.49f;
                                                                                        break block32;
                                                                                        break;
                                                                                    }
lbl31:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (!(var10_9.nextFloat() < 0.144f)) break block33;
                                                                                        break block34;
                                                                                        break;
                                                                                    }
                                                                                }
lbl35:
                                                                                // 3 sources

                                                                                while (true) {
                                                                                    this.IIIIIlII = 0.0f;
                                                                                    break block35;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            v3 = true;
                                                                            break block42;
lbl41:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                if (!var11_10) ** continue;
                                                                                break block36;
                                                                                break;
                                                                            }
lbl44:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                var14_14 = v4;
                                                                                ** continue;
                                                                                break;
                                                                            }
                                                                            var15_15 = var2_2 * var12_11 * var14_14;
                                                                            ** while (!var11_10)
lbl49:
                                                                            // 1 sources

                                                                            break block43;
lbl50:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
lbl52:
                                                                            // 1 sources

                                                                            while (var8_7 > 0.55f) {
                                                                                break block37;
                                                                            }
                                                                            break block33;
                                                                        }
                                                                        if (!(var10_9.nextFloat() >= var9_8)) ** GOTO lbl52
                                                                        ** while (true)
                                                                        var13_13 = var1_1 * (var12_11 *= MathHelper.clamp((float)(0.75f + var4_4 * 2.6f), (float)0.75f, (float)v0));
                                                                        if (!var11_10) break block44;
                                                                        break block45;
                                                                    }
lbl62:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        var11_10 = v3;
                                                                        ** continue;
                                                                        break;
                                                                    }
lbl65:
                                                                    // 1 sources

                                                                    return new lIlIlIl(var1_1, var2_2);
                                                                    this.IIIIIlII = 0.0f;
                                                                    this.lIlllIl = 0.0f;
                                                                    ** while (true)
lbl70:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        this.IIIIIlII = -var13_13 * var16_16;
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                }
lbl74:
                                                                // 2 sources

                                                                while (true) {
                                                                    v3 = false;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl77:
                                                                // 1 sources

                                                                while (true) {
                                                                    var2_2 += this.lIlllIl;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl80:
                                                                // 1 sources

                                                                return new lIlIlIl(var1_1, var2_2);
lbl82:
                                                                // 1 sources

                                                                while (var11_10) {
                                                                    ** continue;
lbl84:
                                                                    // 1 sources

                                                                    ** GOTO lbl8
                                                                }
                                                                break block46;
                                                                this.lIlllIl = -var15_15 * var16_16;
                                                                return new lIlIlIl(var1_1 + var13_13, var2_2 + var15_15);
                                                            }
lbl89:
                                                            // 2 sources

                                                            while (true) {
                                                                var16_16 = v1;
                                                                ** continue;
                                                                break;
                                                            }
                                                        }
                                                        ** while (!(var4_4 > 0.12f))
lbl94:
                                                        // 1 sources

                                                        ** while (true)
lbl95:
                                                        // 1 sources

                                                        while (true) {
                                                            if (var3_3 <= 0.01f) ** GOTO lbl35
                                                            if (this.IIIIIlII != 0.0f) break block38;
                                                            break block39;
                                                            break;
                                                        }
                                                    }
lbl100:
                                                    // 2 sources

                                                    while (true) {
                                                        var12_11 = v2;
                                                        ** GOTO lbl82
                                                        break;
                                                    }
                                                }
                                                v2 = 0.52f + var10_9.nextFloat() * 1.78f;
                                                ** while (true)
                                            }
                                            if (!(var4_4 <= 1.0E-4f)) ** break;
                                            ** while (true)
                                            ** while (true)
                                        }
                                        this.lIlllIl = 0.0f;
                                        return new lIlIlIl(var1_1, var2_2);
                                    }
                                    var7_12 = (float)Math.hypot(var1_1, var2_2);
                                    ** while (!(var7_12 <= 0.005f))
lbl116:
                                    // 1 sources

                                    ** while (true)
                                }
                                v0 = 1.45f;
                            }
                            ** while (true)
                        }
lbl122:
                        // 2 sources

                        while (true) {
                            var1_1 += this.IIIIIlII;
                            ** continue;
                            break;
                        }
                    }
                    v4 = 0.78f + var10_9.nextFloat() * 0.26f;
                    ** GOTO lbl44
                }
                v1 = 1.06f;
                ** while (true)
            }
            ** while (this.lIlllIl == 0.0f)
lbl133:
            // 1 sources

            ** while (true)
        }
        v4 = 0.38f + var10_9.nextFloat() * 0.24f;
        ** while (true)
    }

    public float IllII(MinecraftClient minecraftClient, Vec3d vec3d, float f) {
        return this.lIIIII(minecraftClient, vec3d, IlIlIlIl.II(f));
    }

    private float IllIl(MinecraftClient minecraftClient) {
        double d;
        if (minecraftClient == null || minecraftClient.options == null) {
            return 0.0f;
        }
        try {
            d = (Double)minecraftClient.options.getMouseSensitivity().getValue();
        }
        catch (Exception exception) {
            d = 0.5;
        }
        double d2 = d * 0.6 + 0.2;
        double d3 = d2 * d2 * d2;
        return (float)(d3 * 8.0 * 0.15);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlllI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity == null) {
            return false;
        }
        double d = minecraftClient.player.getVelocity().horizontalLength();
        double d2 = livingEntity.getVelocity().horizontalLength();
        if (!Double.isFinite(d)) return false;
        if (!Double.isFinite(d2)) {
            return false;
        }
        if (!(d <= (double)0.012f)) return false;
        if (!(d2 <= (double)0.012f)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void Illll(MinecraftClient minecraftClient, long l2) {
        if (this.IllIIlI != null && this.llIl != null && l2 <= this.llIlIll) {
            this.llllII(minecraftClient, this.IllIIlI, true, this.llIl, false);
            return;
        }
        this.Illl();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float lIIII(Vec3d vec3d) {
        if (vec3d == null) return 90.0f;
        if (!(vec3d.y > 0.0)) return 90.0f;
        return -90.0f;
    }

    float lIIIl() {
        return this.lIlIlll;
    }

    /*
     * Enabled aggressive block sorting
     */
    void lIIlI() {
        this.lIIlIll = false;
        this.Illl = 0.0f;
        this.IlIlIII = 0.0f;
        this.lIIlIlI = 0.0f;
        this.Ill = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float lIIll(MinecraftClient minecraftClient, Vec3d vec3d, IlIlIlIl ilIlIlIl, int n) {
        BlockHitResult blockHitResult;
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.world == null || vec3d == null || !orchard.internal.IlIlIlI.IIlllIl(vec3d) || ilIlIlIl == null) {
            this.Illl();
            return Float.MAX_VALUE;
        }
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (hitResult instanceof BlockHitResult && (blockHitResult = (BlockHitResult)hitResult).getType() == HitResult.Type.BLOCK && blockHitResult.getPos().squaredDistanceTo(vec3d) <= 0.04000000000000001) {
            return 0.0f;
        }
        long l2 = System.nanoTime();
        IlIlIIIlI ilIlIIIlI = IlIlIIIlI.IIl(n, vec3d);
        if (ilIlIIIlI == null) {
            return Float.MAX_VALUE;
        }
        this.lIlIll(ilIlIlIl, ilIlIIIlI, l2);
        this.ll(minecraftClient, ilIlIlIl, true, ilIlIIIlI, false);
        float f = minecraftClient.player.getYaw();
        float f2 = this.IIIlIII(minecraftClient.player.getPitch());
        Vec3d vec3d2 = minecraftClient.player.getEyePos();
        Vec3d vec3d3 = vec3d.subtract(vec3d2);
        double d = Math.sqrt(vec3d3.x * vec3d3.x + vec3d3.z * vec3d3.z);
        if (d <= 1.0E-4) {
            return Math.abs(this.lIIII(vec3d3) - f2);
        }
        float f3 = (float)(Math.toDegrees(Math.atan2(vec3d3.z, vec3d3.x)) - 90.0);
        float f4 = this.IIIlIII((float)(-Math.toDegrees(Math.atan2(vec3d3.y, d))));
        float f5 = MathHelper.wrapDegrees((float)(f3 - f));
        float f6 = f4 - f2;
        return (float)Math.hypot(f5, f6);
    }

    private static float lIlII(float f, float f2, float f3) {
        return MathHelper.lerp((float)MathHelper.clamp((float)f3, (float)0.0f, (float)1.0f), (float)f, (float)f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    float lIlIl(float f, float f2, boolean bl) {
        if (f2 <= 1.0E-6f) return f;
        if (!Float.isFinite(f2)) return f;
        if (!Float.isFinite(f)) {
            return f;
        }
        float f3 = bl ? this.lIlIIIl : this.lIlIlll;
        float f4 = Math.abs(f += f3);
        if (f4 < f2 * 0.06f) {
            this.lII(bl, f);
            return 0.0f;
        }
        float f5 = (float)Math.round(f / f2) * f2;
        this.lII(bl, MathHelper.clamp((float)(f - f5), (float)(-f2 * 0.5f), (float)(f2 * 0.5f)));
        return f5;
    }

    private float lIllI(IlIlIIIlI ilIlIIIlI, float f, float f2) {
        float f3 = Math.max(ilIlIIIlI.III(), 1.0f);
        float f4 = MathHelper.clamp((float)(this.lIIllI(f, f2) / f3), (float)0.0f, (float)1.0f);
        return Math.max(ilIlIIIlI.ll(), f4);
    }

    /*
     * Enabled aggressive block sorting
     */
    boolean lIlll(int n, double d) {
        if (this.IIlIIlI == -1) return true;
        if (n == this.IIlIIlI) return true;
        if (!(d * (double)1.4f < this.IllllI)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIII() {
        this.IIIlI = -1;
        this.lIIllll = 0.0f;
        this.IlIIIIl = 0.0f;
        this.IIIIll = 0.0f;
        this.IlIl = 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIIl(MinecraftClient minecraftClient) {
        if (minecraftClient != null && minecraftClient.player != null) {
            this.lllIIl();
            this.lIllII(minecraftClient.player.getYaw(), this.IIIlIII(minecraftClient.player.getPitch()));
            return;
        }
        this.IlIIll();
    }

    float llIlI() {
        return this.lIlIIIl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    float llIll(float f, float f2) {
        if (f <= 0.0f) {
            return 0.1f;
        }
        if (f2 <= 0.0f) {
            return 0.1f;
        }
        float f3 = (float)(Math.log(2.0 * (double)f / (double)f2 + 1.0) / Math.log(2.0));
        return 0.14f * f3 + 0.08f;
    }

    /*
     * Enabled aggressive block sorting
     */
    void lllII(float f) {
        if (!this.lIIIlIl) return;
        this.llllll -= f;
        if (!(this.llllll <= 0.0f)) return;
        this.lIIIlIl = false;
        this.llllll = 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllIl(IlIlIIIlI ilIlIIIlI, float f) {
        if (ilIlIIIlI == null) return false;
        if (ilIlIIIlI.I()) return false;
        if (f > 0.42f) return false;
        if (ilIlIIIlI.IlI() > 0.012f) return false;
        if (ilIlIIIlI.lI() > 0.012f) {
            return false;
        }
        if (!(Math.abs(this.llIIlII) <= 0.011f)) return false;
        if (Math.abs(this.lllIl) <= 0.011f) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    void llllI(float f, float f2) {
        this.lIIlIll = true;
        this.lllIII = f;
        this.Illl = 0.0f;
        this.IlIlIII = this.llIll(f, f2);
        this.lIIlIlI = 0.0f;
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        this.IlIlIl = 0.18f + threadLocalRandom.nextFloat() * 0.099999994f;
        this.IIIllI = 0.55f + threadLocalRandom.nextFloat() * 0.14999998f;
        this.lIllIII = 0.01f + threadLocalRandom.nextFloat() * 0.24f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float lllll(IlIlIlIl ilIlIlIl) {
        float f = this.IIllIII(ilIlIlIl);
        float f2 = (1.0f + (1.0f - f) * 1.55f) * 1.45f * this.llIIII(ilIlIlIl) * ilIlIlIl.III();
        if (!this.lllIll(ilIlIlIl)) return f2;
        return f2 *= ilIlIlIl.Ill().lII();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private float IIIIII(int n, int n2, int n3, float f, float f2) {
        float f3;
        int n4 = this.IIIllII(n * 31 + n3 * 17 + n2);
        int n5 = Math.floorMod(n4, 3);
        float f4 = this.I(this.IIIllII(n * 97 + n3 * 37 + n2 * 3));
        float f5 = this.Il(f, 0.992f, 0.72f);
        float f6 = this.Il(1.008f, f2, 0.28f);
        switch (n5) {
            case 1: {
                f3 = this.Il(f6, f2, f4);
                return f3;
            }
            case 0: {
                f3 = this.Il(f, f5, f4);
                return f3;
            }
        }
        f3 = this.Il(f5, f6, f4);
        return f3;
    }

    /*
     * Enabled aggressive block sorting
     */
    float IIIIIl(float f, float f2) {
        float f3 = orchard.internal.IlIlIlI.IIlIlII(0.0f, 1.0f, f / 0.35f);
        float f4 = (float)Math.pow(f3, 0.7);
        float f5 = orchard.internal.IlIlIlI.IIlIlII(0.5f, 1.0f, f);
        float f6 = (float)Math.pow(f5, 1.4);
        return f2 * f4 * (1.0f - f6);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIlI(MinecraftClient minecraftClient, IlIlIlIl ilIlIlIl, boolean bl, IlIlIIIlI ilIlIIIlI, float f, long l2, boolean bl2) {
        if (minecraftClient == null || minecraftClient.player == null) {
            this.IlIIll();
            return;
        }
        if (bl && !this.IIlllI(ilIlIlIl)) {
            if (this.IlIIIl) {
                float f2 = Math.max(0.0f, Math.min(f, 0.1f));
                this.IIIIlll -= f2;
                if (!(this.IIIIlll <= 0.0f)) {
                    this.llIIl(minecraftClient);
                    this.llllII = l2;
                    return;
                }
                this.IlIIIl = false;
                this.IIIIlll = 0.0f;
                this.IIllII = 0.0f;
            }
            if (ilIlIIIlI != null) {
                this.lIIl(minecraftClient, ilIlIlIl, ilIlIIIlI, f, bl2);
                this.llllII = l2;
                return;
            }
            this.llIIl(minecraftClient);
            this.lllllII = -1;
            this.llIII();
            this.llllII = l2;
            return;
        }
        this.llIIl(minecraftClient);
        this.IlIIIl = false;
        this.IIIIlll = 0.0f;
        this.llllII = l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int IIIIll(Vec3d vec3d) {
        int n = (int)Math.round(vec3d.x);
        int n2 = (int)Math.round(vec3d.y);
        int n3 = (int)Math.round(vec3d.z);
        return n * 73856093 ^ n2 * 19349663 ^ n3 * 83492791;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIIlII(float f) {
        float f2;
        float f3 = (float)Math.PI * 2;
        float f4 = f % f3;
        if (!(f4 < 0.0f)) {
            f2 = f4;
            return f2;
        }
        f2 = f4 + f3;
        return f2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIIlIl(Vec3d vec3d, Box box) {
        if (vec3d == null) return Double.POSITIVE_INFINITY;
        if (box != null) {
            double d = MathHelper.clamp((double)vec3d.x, (double)box.minX, (double)box.maxX);
            double d2 = MathHelper.clamp((double)vec3d.y, (double)box.minY, (double)box.maxY);
            double d3 = MathHelper.clamp((double)vec3d.z, (double)box.minZ, (double)box.maxZ);
            double d4 = vec3d.x - d;
            double d5 = vec3d.y - d2;
            double d6 = vec3d.z - d3;
            return d4 * d4 + d5 * d5 + d6 * d6;
        }
        return Double.POSITIVE_INFINITY;
    }

    private float IIIllI(long l2) {
        if (this.llllII == 0L) {
            return 0.05f;
        }
        float f = (float)(l2 - this.llllII) / 1.0E9f;
        return MathHelper.clamp((float)f, (float)0.0033333334f, (float)0.055555556f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private llIlllll IIIlll(MinecraftClient minecraftClient, IlIlIlIl ilIlIlIl, IlIlIIIlI ilIlIIIlI, float f, float f2, float f3) {
        Vec3d vec3d;
        block4: {
            Vec3d vec3d2;
            block6: {
                block5: {
                    vec3d = minecraftClient.player.getEyePos();
                    vec3d2 = ilIlIIIlI.l();
                    if (!orchard.internal.IlIlIlI.IIlllIl(vec3d2)) break block5;
                    if (this.lllllII != ilIlIIIlI.II() || !orchard.internal.IlIlIlI.IIlllIl(this.lIlIll)) break block6;
                    if (ilIlIlIl.lII()) {
                        float f4 = MathHelper.clamp((float)f3, (float)0.0f, (float)0.1f);
                        float f5 = 1.0f - (float)Math.exp(-20.0f * f4);
                        this.lIlIll = this.lIlIll.lerp(vec3d2, (double)f5);
                        break block4;
                    } else {
                        this.lIlIll = vec3d2;
                    }
                    break block4;
                }
                return new llIlllll(f, this.IIIlIII(f2));
            }
            this.lllllII = ilIlIIIlI.II();
            this.lIlIll = vec3d2;
            this.lIlllll = 0;
            this.I = 0.0f;
            this.IIIlIl = 0.0f;
            this.IIIlllI = 0.0f;
            this.llIIlI(ilIlIlIl.IIl().ll());
            this.lIIlII = 1.0f;
            this.IlIlI = 0.0f;
            this.lllIlI = 0.0f;
            this.IlIlIl(ilIlIlIl, ilIlIIIlI, this.IIllIlI(minecraftClient, ilIlIIIlI), ThreadLocalRandom.current().nextLong());
            ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
            this.lIIllIl = !threadLocalRandom.nextBoolean() ? -1.0f : 1.0f;
            this.IllIll = 0.28f + threadLocalRandom.nextFloat() * 0.24f;
            this.IIlIllI = threadLocalRandom.nextFloat() * ((float)Math.PI * 2);
            this.IlllIII = threadLocalRandom.nextFloat() * ((float)Math.PI * 2);
            this.IlIllIl = 0.32f + threadLocalRandom.nextFloat() * 0.26f;
            this.IlIIIll = 0.24f + threadLocalRandom.nextFloat() * 0.22f;
            this.IIlIII.Il();
            this.llIII();
        }
        Vec3d vec3d3 = ilIlIIIlI.I() ? this.lIlIll : this.llIlll(vec3d, this.lIlIll, f3, ilIlIlIl);
        Vec3d vec3d4 = vec3d3.subtract(vec3d);
        double d = Math.sqrt(vec3d4.x * vec3d4.x + vec3d4.z * vec3d4.z);
        if ((ilIlIlIl.lII() || this.IIllIlI(minecraftClient, ilIlIIIlI)) && d < 0.2) {
            this.IIlI();
            this.IIIlIll();
            return new llIlllll(f, this.IIIlIII(f2));
        }
        if (!(d <= 1.0E-4)) {
            float f6 = (float)(Math.toDegrees(Math.atan2(vec3d4.z, vec3d4.x)) - 90.0);
            float f7 = this.IIIlIII((float)(-Math.toDegrees(Math.atan2(vec3d4.y, d))));
            return new llIlllll(f6, f7);
        }
        if (!(vec3d4.lengthSquared() <= 1.0E-8)) return new llIlllll(f, this.lIIII(vec3d4));
        return new llIlllll(f, this.IIIlIII(f2));
    }

    private float IIlIII(IlIlIlIl ilIlIlIl) {
        return this.Il(1.35f, 2.85f, this.l(ilIlIlIl.IlI()));
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIlIIl(IIlIIlI iIlIIlI, int n, int n2, float f, float f2, float f3, float f4, float f5) {
        if (iIlIIlI.III != n) {
            iIlIIlI.III = n;
            iIlIIlI.I = 0;
            iIlIIlI.lI = 1.0f;
            iIlIIlI.II = 1.0f;
            iIlIIlI.l = this.IIIIII(n, n2, 0, f2, f3);
            iIlIIlI.Il = this.IlIIIII(n, n2, 0, f4, f5);
            iIlIIlI.ll = 0.0f;
        }
        iIlIIlI.ll += Math.max(f, 0.0f);
        while (iIlIIlI.ll >= iIlIIlI.Il) {
            iIlIIlI.ll -= iIlIIlI.Il;
            iIlIIlI.II = iIlIIlI.lI = iIlIIlI.l;
            ++iIlIIlI.I;
            iIlIIlI.l = this.IIIIII(n, n2, iIlIIlI.I, f2, f3);
            iIlIIlI.Il = this.IlIIIII(n, n2, iIlIIlI.I, f4, f5);
        }
        float f6 = iIlIIlI.Il <= 1.0E-4f ? 1.0f : MathHelper.clamp((float)(iIlIIlI.ll / iIlIIlI.Il), (float)0.0f, (float)1.0f);
        float f7 = f6 * f6 * (3.0f - 2.0f * f6);
        iIlIIlI.lI = MathHelper.lerp((float)f7, (float)iIlIIlI.II, (float)iIlIIlI.l);
        return iIlIIlI.lI;
    }

    /*
     * Unable to fully structure code
     */
    private List<Vec3d> IIlIlI(Vec3d var1_1, Box var2_2) {
        block23: {
            block33: {
                block31: {
                    block30: {
                        block29: {
                            block22: {
                                block26: {
                                    block25: {
                                        block27: {
                                            block32: {
                                                block18: {
                                                    block28: {
                                                        block24: {
                                                            block19: {
                                                                block20: {
                                                                    block21: {
                                                                        break block28;
lbl1:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var29_21 = var18_12;
                                                                            var30_22 = var29_21.length;
                                                                            var31_23 = 0;
                                                                            break block18;
                                                                            break;
                                                                        }
lbl6:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
lbl8:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (orchard.internal.IlIlIlI.IIll(var22_16, var2_2.maxX)) break block19;
                                                                            break block20;
                                                                            break;
                                                                        }
lbl11:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
lbl13:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            ++var21_15;
                                                                            break block21;
                                                                            break;
                                                                        }
lbl16:
                                                                        // 1 sources

                                                                        while (!orchard.internal.IlIlIlI.IIll(var27_20, var2_2.maxY)) {
                                                                            break block22;
                                                                        }
                                                                        break block19;
                                                                    }
lbl20:
                                                                    // 2 sources

                                                                    while (var21_15 < var20_14) {
                                                                        ** continue;
lbl22:
                                                                        // 1 sources

                                                                        ** GOTO lbl11
                                                                    }
                                                                    break block29;
lbl24:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                if (orchard.internal.IlIlIlI.IIll(var27_20, var2_2.minY)) break block19;
                                                                ** GOTO lbl16
lbl29:
                                                                // 1 sources

                                                                while (true) {
                                                                    var27_20 = var24_17[var26_19];
                                                                    ** continue;
                                                                    break;
                                                                }
                                                                var14_9 = MathHelper.clamp((double)var1_1.z, (double)var2_2.minZ, (double)var2_2.maxZ);
                                                                break block30;
lbl34:
                                                                // 1 sources

                                                                while (orchard.internal.IlIlIlI.IIll(var32_24, var2_2.maxZ)) {
                                                                    break block19;
                                                                    while (true) {
                                                                        ++var26_19;
                                                                        break block23;
                                                                        break;
                                                                    }
                                                                }
                                                                break block31;
lbl40:
                                                                // 1 sources

                                                                while (true) {
                                                                    var12_8 = MathHelper.clamp((double)var1_1.y, (double)var2_2.minY, (double)var2_2.maxY);
                                                                    ** continue;
                                                                    break;
                                                                }
                                                            }
lbl44:
                                                            // 3 sources

                                                            while (true) {
                                                                v0 = true;
                                                                break block24;
                                                                break;
                                                            }
                                                            var6_5 = (var2_2.minY + var2_2.maxY) * 0.5;
                                                            break block32;
                                                        }
lbl50:
                                                        // 2 sources

                                                        while (true) {
                                                            continue;
lbl52:
                                                            // 1 sources

                                                            while (true) {
                                                                if (orchard.internal.IlIlIlI.IIll(var22_16, var2_2.minX)) ** GOTO lbl44
                                                                ** continue;
                                                                break;
                                                            }
                                                            var34_25 = v0;
                                                            if (!var34_25) break block25;
                                                            break block26;
                                                            break;
                                                        }
                                                    }
                                                    var3_3 = new ArrayList<Vec3d>(28);
                                                    break block33;
                                                }
lbl62:
                                                // 2 sources

                                                while (true) {
                                                    if (var31_23 >= var30_22) ** continue;
                                                    break block27;
                                                    break;
                                                }
                                            }
                                            var8_6 = (var2_2.minZ + var2_2.maxZ) * 0.5;
                                            var10_7 = MathHelper.clamp((double)var1_1.x, (double)var2_2.minX, (double)var2_2.maxX);
                                            ** while (true)
                                        }
                                        var32_24 = var29_21[var31_23];
                                        ** while (true)
                                    }
lbl73:
                                    // 2 sources

                                    while (true) {
                                        ++var31_23;
                                        ** continue;
                                        break;
                                    }
lbl76:
                                    // 1 sources

                                    while (true) {
                                        var19_13 = var16_10;
                                        var20_14 = var19_13.length;
                                        var21_15 = 0;
                                        ** GOTO lbl20
                                        break;
                                    }
                                }
                                var3_3.add(new Vec3d(var22_16, var27_20, var32_24));
                                ** while (true)
                            }
                            if (!orchard.internal.IlIlIlI.IIll(var32_24, var2_2.minZ)) ** break;
                            ** while (true)
                            ** GOTO lbl34
                        }
                        return var3_3;
                    }
                    var16_10 = new double[]{var2_2.minX, var4_4, var2_2.maxX, var10_7};
                    var17_11 = new double[]{var2_2.minY, var6_5, var2_2.maxY, var12_8};
                    var18_12 = new double[]{var2_2.minZ, var8_6, var2_2.maxZ, var14_9};
                    ** while (true)
                }
                v0 = false;
                ** while (true)
                var22_16 = var19_13[var21_15];
                var24_17 = var17_11;
                var25_18 = var24_17.length;
                var26_19 = 0;
                break block23;
            }
            var3_3.add(this.lllIII(var1_1, var2_2));
            var4_4 = (var2_2.minX + var2_2.maxX) * 0.5;
            ** while (true)
        }
        ** while (var26_19 >= var25_18)
lbl111:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIlIll IIlIll(IlIlIlIl ilIlIlIl, IlIlIIIlI ilIlIIIlI, float f, float f2, boolean bl) {
        float f3;
        block2: {
            block3: {
                block1: {
                    if (!this.lllIll(ilIlIlIl)) return orchard.internal.lIIlIll.l;
                    if (ilIlIlIl.Il() == lllIIIII.II) return orchard.internal.lIIlIll.l;
                    if (ilIlIIIlI == null) return orchard.internal.lIIlIll.l;
                    if (ilIlIIIlI.I()) return orchard.internal.lIIlIll.l;
                    if (this.IIIlI != ilIlIIIlI.II()) return orchard.internal.lIIlIll.l;
                    if (this.IlIIIIl <= 1.0E-4f) return orchard.internal.lIIlIll.l;
                    if (f <= 3.25f) break block1;
                    float f4 = Math.max(0.0f, Math.min(f2, 0.1f));
                    this.lIIllll = Math.min(this.IlIIIIl, this.lIIllll + f4);
                    f3 = MathHelper.clamp((float)(this.lIIllll / this.IlIIIIl), (float)0.0f, (float)1.0f);
                    if (!(f3 >= 1.0f)) break block2;
                    break block3;
                }
                return orchard.internal.lIIlIll.l;
            }
            if (!(f > 4.15f)) return orchard.internal.lIIlIll.l;
            this.II(ilIlIIIlI.II(), ThreadLocalRandom.current());
            f3 = 0.0f;
        }
        float f5 = (float)Math.sin((double)f3 * Math.PI);
        float f6 = orchard.internal.IlIlIlI.IIlIlII(3.25f, 24.0f, f);
        float f7 = f5 * f6;
        if (bl) {
            f7 *= 0.55f;
        }
        if (!(f7 <= 1.0E-4f)) return new lIIlIll(this.IIIIll * f7, this.IlIl * f7);
        return orchard.internal.lIIlIll.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIllII(IlIlIlIl ilIlIlIl, float f, boolean bl) {
        float f2;
        block2: {
            block3: {
                block1: {
                    if (bl || ilIlIlIl.III() > 1.0f) break block1;
                    f2 = Math.max(0.0f, Math.min(f, 0.1f));
                    if (!(this.IIIIIlll > 0.0f)) break block2;
                    this.IIIIIlll -= f2;
                    if (this.IIIIIlll > 0.0f) {
                        return this.llllIIl;
                    }
                    break block3;
                }
                this.IIIIIlll = 0.0f;
                this.llllIIl = 1.0f;
                return 1.0f;
            }
            this.IIIIIlll = 0.0f;
            this.llllIIl = 1.0f;
        }
        IIIlIllII iIIlIllII = ilIlIlIl.Ill();
        float f3 = 0.82f * iIIlIllII.IlIl() * f2;
        float f4 = iIIlIllII.IlII();
        float f5 = iIIlIllII.IIIl();
        float f6 = 0.04f * iIIlIllII.lll();
        float f7 = 0.18f * iIIlIllII.lll();
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        if (!(threadLocalRandom.nextFloat() < f3)) return 1.0f;
        this.IIIIIlll = f6 + threadLocalRandom.nextFloat() * (f7 - f6);
        this.llllIIl = f4 + threadLocalRandom.nextFloat() * (f5 - f4);
        return this.llllIIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIlIlIl IIllIl(IlIlIlIl ilIlIlIl, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean bl) {
        float f8;
        float f9;
        float f10;
        boolean bl2;
        float f11;
        float f12;
        block5: {
            block3: {
                block4: {
                    block2: {
                        if (this.IIIlI(ilIlIlIl)) return new lIlIlIl(f, f2);
                        if (f5 <= 1.35f) return new lIlIlIl(f, f2);
                        if (f6 <= 1.0E-4f) break block2;
                        f12 = MathHelper.clamp((float)((f5 - 1.35f) / 1.65f), (float)0.0f, (float)1.0f);
                        if (!this.lllIll(ilIlIlIl)) break block3;
                        break block4;
                    }
                    return new lIlIlIl(f, f2);
                }
                f11 = 1.08f;
                break block5;
            }
            f11 = 1.0f;
        }
        float f13 = f11;
        boolean bl3 = bl2 = bl && ilIlIlIl.Il() == lllIIIII.II;
        float f14 = bl2 ? 0.075f : (f10 = bl ? 0.34f : 0.19f);
        float f15 = !bl2 ? (bl ? 0.24f : 0.14f) : (f9 = 0.055f);
        if (this.IIIlI(ilIlIlIl)) {
            f10 *= 0.45f;
            f9 *= 0.45f;
        }
        if ((f8 = Math.min(f10, f6 * f9) * f12 * f13 * this.IllIll * MathHelper.clamp((float)(0.55f + f7 * 0.45f), (float)0.55f, (float)1.0f)) <= 1.0E-4f) {
            return new lIlIlIl(f, f2);
        }
        float f16 = -f4 / f5;
        float f17 = f3 / f5;
        return new lIlIlIl(f += f16 * f8 * this.lIIllIl, f2 += f17 * f8 * this.lIIllIl * 0.58f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlllI(IlIlIlIl ilIlIlIl) {
        if (ilIlIlIl == null) return false;
        if (ilIlIlIl.Il() != lllIIIII.I) return false;
        if (!(ilIlIlIl.IlI() <= 0.001f)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private Vec3d IIllll(MinecraftClient var1_1, Vec3d var2_2, Vec3d var3_3, LivingEntity var4_4, Box var5_5, double var6_6, float var8_7) {
        block21: {
            block22: {
                block27: {
                    block30: {
                        block28: {
                            block23: {
                                block20: {
                                    block18: {
                                        block29: {
                                            block17: {
                                                block19: {
                                                    block26: {
                                                        block25: {
                                                            block16: {
                                                                block24: {
                                                                    if (var1_1 == null) break block24;
                                                                    break block25;
lbl3:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (!this.IIIl(var1_1, var2_2, var3_3, var18_11, var9_8, var8_7)) break block16;
                                                                        break block17;
                                                                        break;
                                                                    }
                                                                }
lbl7:
                                                                // 6 sources

                                                                return null;
                                                            }
                                                            if (!this.IIIl(var1_1, var2_2, var3_3, var17_10, var9_8, var8_7)) break block26;
                                                            break block27;
lbl12:
                                                            // 1 sources

                                                            while (true) {
                                                                if (var4_4 == null) ** GOTO lbl7
                                                                break block18;
                                                                break;
                                                            }
lbl15:
                                                            // 1 sources

                                                            while (true) {
                                                                var11_9 = var18_11;
                                                                break block19;
                                                                break;
                                                            }
lbl18:
                                                            // 1 sources

                                                            while (true) {
                                                                var13_13 = var19_15;
                                                                ** continue;
                                                                break;
                                                            }
lbl21:
                                                            // 1 sources

                                                            return null;
lbl23:
                                                            // 1 sources

                                                            while (!this.IIIl(var1_1, var2_2, var3_3, var18_11, var9_8, var8_7)) {
                                                                break block20;
                                                            }
                                                            break block28;
lbl26:
                                                            // 1 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                            while (true) {
                                                                if (orchard.internal.IlIlIlI.IIlllIl(var12_12)) break block21;
                                                                break block22;
                                                                break;
                                                            }
                                                        }
                                                        if (var1_1.world == null) ** GOTO lbl7
                                                        break block29;
                                                    }
                                                    return var11_9;
lbl36:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var3_3 == null) ** GOTO lbl7
                                                        ** continue;
                                                        break;
                                                    }
                                                    var11_9 = null;
                                                    var12_12 = null;
                                                    break block30;
lbl42:
                                                    // 1 sources

                                                    while (true) {
                                                        var18_11 = var17_10.next();
                                                        ** GOTO lbl23
                                                        break;
                                                    }
                                                    while (true) {
                                                        if (orchard.internal.IlIlIlI.IIlllIl(var11_9)) ** continue;
                                                        ** continue;
                                                        break;
                                                    }
lbl48:
                                                    // 1 sources

                                                    while (true) {
                                                        var9_8 = var6_6 * var6_6;
                                                        ** continue;
                                                        break;
                                                    }
                                                }
lbl52:
                                                // 2 sources

                                                while (true) {
                                                    if (!(var19_15 > var15_14)) break block20;
                                                    break block23;
                                                    break;
                                                }
                                            }
                                            return var18_11;
lbl57:
                                            // 1 sources

                                            while (true) {
                                                var17_10 = this.IIlIlI(var2_2, var5_5).iterator();
                                                break block20;
                                                break;
                                            }
                                        }
                                        if (var2_2 == null) ** GOTO lbl7
                                        ** while (true)
                                    }
                                    ** while (var5_5 != null)
lbl65:
                                    // 1 sources

                                    ** while (true)
                                }
lbl67:
                                // 2 sources

                                while (true) {
                                    if (!var17_10.hasNext()) ** continue;
                                    ** continue;
                                    break;
                                }
                            }
                            var15_14 = var19_15;
                            var12_12 = var18_11;
                            ** while (true)
                        }
                        var19_15 = var2_2.squaredDistanceTo(var18_11);
                        ** while (!(var19_15 < var13_13))
lbl77:
                        // 1 sources

                        ** while (true)
                    }
                    var13_13 = Infinity;
                    var15_14 = -Infinity;
                    ** while (true)
                }
                return this.IIIlIlI(var17_10, var5_5);
            }
            return var11_9;
        }
        var17_10 = var11_9.lerp(var12_12, 0.5);
        var18_11 = this.IIIlIlI(var11_9.lerp(var17_10, 0.5), var5_5);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIII(MinecraftClient minecraftClient, IlIlIlIl ilIlIlIl, llIlllll llIlllll2, float f, float f2, float f3) {
        float f4;
        float f5;
        float f6 = llIlllll2.l();
        float f7 = this.IIIlIII(llIlllll2.I());
        float f8 = MathHelper.wrapDegrees((float)(f6 - f));
        float f9 = (float)Math.hypot(f8, f5 = f7 - f2);
        if (f9 <= (f4 = 0.35f) && Math.abs(this.llIIlII) <= 0.5f && Math.abs(this.lllIl) <= 0.5f) {
            this.IIlI();
            this.lIllII(f, f2);
            return;
        }
        float f10 = this.lllll(ilIlIlIl);
        float f11 = 0.06f + 0.04f * MathHelper.clamp((float)(f9 / 15.0f), (float)0.0f, (float)1.0f);
        float f12 = f10 * 22.0f;
        float f13 = MathHelper.clamp((float)f3, (float)0.0033333334f, (float)0.055555556f);
        IIllIIllI iIllIIllI = this.IlllIl(f, f6, this.llIIlII, f11, f12, f13);
        IIllIIllI iIllIIllI2 = this.IIIllIl(f2, f7, this.lllIl, f12, f10, f13);
        float f14 = MathHelper.wrapDegrees((float)(iIllIIllI.I() - f));
        float f15 = iIllIIllI2.I() - f2;
        this.llIIlII = iIllIIllI.l();
        this.lllIl = iIllIIllI2.l();
        float f16 = this.IllIl(minecraftClient);
        f14 = this.lIlIl(f14, f16, true);
        f15 = this.lIlIl(f15, f16, false);
        if (Math.abs(f14) <= 0.01f && Math.abs(f15) <= 0.01f) {
            this.lIllII(f, f2);
            return;
        }
        float f17 = f + f14;
        float f18 = this.IIIlIII(f2 + f15);
        lIIllllI.IIlII(minecraftClient, f17, f18);
        this.lIllII(f17, f18);
    }

    float IlIIIl() {
        return (float)Math.hypot(this.llIIlII, this.lllIl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float IlIIlI(float f, float f2, float f3) {
        if (f3 <= 1.0E-6f) {
            return 0.0f;
        }
        if (Math.abs(f) <= 0.01f) {
            return 0.0f;
        }
        float f4 = Math.min(f2, Math.abs(f) * 0.42f);
        return Math.signum(f) * f4 * f3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIll() {
        this.lIllII = false;
        this.lIlIIII = 0.0f;
        this.lIlIl = 0.0f;
        this.lllIIl();
    }

    public float IlIlII(MinecraftClient minecraftClient, Vec3d vec3d, float f) {
        return this.lIIIII(minecraftClient, vec3d, IlIlIlIl.l(f));
    }

    /*
     * Enabled aggressive block sorting
     */
    void IlIlIl(IlIlIlIl ilIlIlIl, IlIlIIIlI ilIlIIIlI, boolean bl, long l2) {
        if (ilIlIlIl != null && ilIlIIIlI != null && ilIlIlIl.Il() == lllIIIII.II && ilIlIIIlI.I() && ilIlIlIl.lII() && bl) {
            if (this.IlIIIlI != null) {
                if (this.IlIIIlI.IlII() == ilIlIIIlI.II()) return;
            }
            this.IlIIIlI = new IllllIIl(l2, ilIlIIIlI.II());
            return;
        }
        this.IlIIIlI = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static float IlIllI(float f, float f2) {
        if (!Float.isFinite(f)) return f;
        if (f2 == 0.0f) return f;
        if (f == 0.0f) {
            return f;
        }
        float f3 = Math.abs(f);
        float f4 = Math.signum(f2);
        if (Math.signum(f) != f4) return f4 * (360.0f - f3);
        return f;
    }

    public static void IlIlll() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIlIll IllIII(IlIlIlIl ilIlIlIl, IlIlIIIlI ilIlIIIlI, float f, float f2, boolean bl) {
        float f3;
        if (!this.lllIll(ilIlIlIl)) return orchard.internal.lIIlIll.l;
        if (ilIlIlIl.Il() == lllIIIII.II) return orchard.internal.lIIlIll.l;
        if (ilIlIIIlI == null) return orchard.internal.lIIlIll.l;
        if (ilIlIIIlI.I()) return orchard.internal.lIIlIll.l;
        if (f <= 0.45f) {
            return orchard.internal.lIIlIll.l;
        }
        if (this.llllIlI != ilIlIIIlI.II()) {
            this.IIII(ilIlIIIlI.II(), ThreadLocalRandom.current());
        }
        float f4 = Math.max(0.0f, Math.min(f2, 0.1f));
        this.lIIIllI = this.IIIlII(this.lIIIllI + f4 * this.lIIlllI * ((float)Math.PI * 2));
        this.llIII = this.IIIlII(this.llIII + f4 * this.IIIlIll * ((float)Math.PI * 2));
        IIIlIllII iIIlIllII = ilIlIlIl.Ill();
        float f5 = orchard.internal.IlIlIlI.IIlIlII(0.45f, 10.5f, f);
        float f6 = (float)Math.hypot(this.llIIlII, this.lllIl);
        float f7 = MathHelper.clamp((float)(0.32f + f6 / 36.0f), (float)0.32f, (float)1.0f);
        float f8 = MathHelper.clamp((float)(0.72f + iIIlIllII.lIIl() * 0.18f + iIIlIllII.IIl() * 0.22f), (float)0.7f, (float)1.35f);
        if (bl) {
            f8 *= 0.55f;
        }
        if ((f3 = f5 * f7 * f8) <= 1.0E-4f) {
            return orchard.internal.lIIlIll.l;
        }
        float f9 = (float)(Math.sin(this.lIIIllI) * 0.72 + Math.sin(this.lIIIllI * 2.17f + this.llIII) * 0.28);
        float f10 = (float)(Math.sin(this.llIII) * 0.68 + Math.sin(this.llIII * 1.63f + this.lIIIllI) * 0.32);
        return new lIIlIll(f10 * this.lIl * f3, f9 * this.llllIII * f3);
    }

    private static float IllIIl(float f, float f2, float f3) {
        if (!Float.isFinite(f)) {
            return f2;
        }
        return MathHelper.clamp((float)f, (float)f2, (float)f3);
    }

    void IllIlI() {
        this.IIlIIlI = -1;
        this.IllllI = Double.MAX_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllIll(MinecraftClient minecraftClient, IlIlIlIl ilIlIlIl, boolean bl, IlIlIIIlI ilIlIIIlI, long l2, boolean bl2) {
        if (this.lllIIIl == 0L) {
            this.lllIIIl = l2;
            this.llIIlIl = 0.0f;
            this.IIIIlI(minecraftClient, ilIlIlIl, bl, ilIlIIIlI, 0.016666668f, l2, bl2);
            return;
        }
        float f = MathHelper.clamp((float)((float)(l2 - this.lllIIIl) / 1.0E9f), (float)0.0f, (float)0.2f);
        this.lllIIIl = l2;
        this.llIIlIl = Math.min(this.llIIlIl + f, 0.06666667f);
        int n = 0;
        while (this.llIIlIl >= 0.016666668f && n < 4) {
            this.IIIIlI(minecraftClient, ilIlIlIl, bl, ilIlIIIlI, 0.016666668f, l2, bl2);
            this.llIIlIl -= 0.016666668f;
            ++n;
        }
        if (n != 0) return;
        if (!(this.llIIlIl > 0.0f)) return;
        float f2 = MathHelper.clamp((float)this.llIIlIl, (float)0.0033333334f, (float)0.016666668f);
        this.llIIlIl = 0.0f;
        this.IIIIlI(minecraftClient, ilIlIlIl, bl, ilIlIIIlI, f2, l2, bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IlllII(IlIlIlIl ilIlIlIl, float f, boolean bl) {
        float f2 = Math.abs(f);
        if (f2 <= 1.0E-4f) {
            return 0.0f;
        }
        ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
        float f3 = (threadLocalRandom.nextFloat() - 0.5f) * 2.0f;
        float f4 = Math.min(f2 * 0.018f, 0.035f);
        if (!bl) {
            return f3 * (f4 *= ilIlIlIl.Ill().lIIl());
        }
        return f3 * (f4 *= 0.35f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIllIIllI IlllIl(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f2 - f;
        float f8 = !(Math.abs(f7) >= 150.0f) || !(Math.abs(f7) <= 210.0f) ? orchard.internal.IlIlIlI.IIlIlll(f7) : f7;
        float f9 = f + f8;
        return this.IIIIllI(f, f9, f3, f4, f5, f6);
    }

    private float IllllI(IlIlIlIl ilIlIlIl) {
        if (ilIlIlIl.Il() == lllIIIII.II) {
            return orchard.internal.IlIlIlI.lIII(ilIlIlIl.IlI());
        }
        return this.l(ilIlIlIl.IlI());
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illlll(MinecraftClient minecraftClient, IlIlIIIlI ilIlIIIlI, float f, float f2) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (ilIlIIIlI == null) return false;
        Entity entity = minecraftClient.world.getEntityById(ilIlIIIlI.II());
        if (entity == null) return false;
        if (orchard.internal.IlIlllI.IlIIII(minecraftClient, 150, f, f2)) return true;
        return false;
    }

    private float lIIIII(MinecraftClient minecraftClient, Vec3d vec3d, IlIlIlIl ilIlIlIl) {
        return this.lIIll(minecraftClient, vec3d, ilIlIlIl, orchard.internal.IlIlIlI.IIIIll(vec3d));
    }

    private float lIIIIl(IlIlIlIl ilIlIlIl) {
        return this.Il(1.45f, 2.15f, this.l(ilIlIlIl.IlI()));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean lIIIlI() {
        if (!this.lIIlIll) return false;
        if (!(this.Illl < this.IlIlIII * 0.65f)) return false;
        return true;
    }

    private float lIIIll(IlIlIlIl ilIlIlIl) {
        return this.Il(0.46f, 0.24f, this.l(ilIlIlIl.IlI()));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean lIIlII() {
        if (!this.lIIIlIl) return false;
        if (!(this.llllll > 0.0f)) return false;
        return true;
    }

    private float lIIlIl() {
        if (!(Math.abs(this.llIIlII) > 0.01f)) {
            if (!(Math.abs(this.IlIIIII) > 0.01f)) {
                return 1.0f;
            }
        } else {
            return Math.signum(this.llIIlII);
        }
        return Math.signum(this.IlIIIII);
    }

    private float lIIllI(float f, float f2) {
        return (float)Math.hypot(f, f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIlll(IlIlIlIl ilIlIlIl, float f, float f2, float f3, float f4) {
        if (ilIlIlIl.lI() && this.lIllII) {
            this.IIIIIIlI = this.lllIlI(f, this.lIlIIII, f3, this.IIIIIIlI, true);
            this.lllIlIl = this.lllIlI(f2, this.lIlIl, f4, this.lllIlIl, false);
            return;
        }
        this.IIIIIIlI = 0;
        this.lllIlIl = 0;
    }

    public void lIlIII() {
        this.IlIIll();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlIIl(IlIlIlIl ilIlIlIl, IlIlIIIlI ilIlIIIlI, float f) {
        boolean bl;
        if (!this.lllIll(ilIlIlIl) || ilIlIIIlI == null) {
            this.lIIlI();
            return;
        }
        if (f <= 3.36f) {
            this.lIIlI();
            return;
        }
        boolean bl2 = this.Ill != ilIlIIIlI.II();
        boolean bl3 = bl = this.lIIlIll && f > this.lllIII + 6.0f;
        if (this.lIIlIll && !bl2) {
            if (!bl) return;
        }
        float f2 = MathHelper.clamp((float)(1.4f + (1.0f - ilIlIIIlI.ll()) * 2.4f), (float)1.2f, (float)4.0f);
        this.llllI(f, f2);
        this.Ill = ilIlIIIlI.II();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void lIlIlI() {
        this.lIlllll = 0;
        this.IIllIII = 0.0f;
        this.IIIIIIII = 0.0f;
        this.llIlll = 0.0f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lIlIll(IlIlIlIl ilIlIlIl, IlIlIIIlI ilIlIIIlI, long l2) {
        this.IllIIlI = ilIlIlIl;
        this.llIl = ilIlIIIlI;
        this.llIlIll = l2 + 150000000L;
        Class<IlIlIlI> clazz = IlIlIlI.class;
        synchronized (IlIlIlI.class) {
            IlIlIlI ilIlIlI = IIIllII;
            if (ilIlIlI != null && ilIlIlI != this) {
                ilIlIlI.Illl();
            }
            IIIllII = this;
            // ** MonitorExit[var5_4] (shouldn't be in output)
            return;
        }
    }

    private void lIllII(float f, float f2) {
        this.lIllII = true;
        this.lIlIIII = f;
        this.lIlIl = this.IIIlIII(f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIlIlIl lIllIl(IlIlIlIl ilIlIlIl, float f, float f2, float f3, float f4, float f5) {
        float f6;
        if (!this.lllIll(ilIlIlIl)) return new lIlIlIl(f, f2);
        if (!this.lIIlIll) return new lIlIlIl(f, f2);
        if (!(f3 <= 1.0E-4f)) {
            f6 = (float)Math.hypot(f, f2);
            if (f6 <= 1.0E-4f) {
                return new lIlIlIl(f, f2);
            }
        } else {
            return new lIlIlIl(f, f2);
        }
        float f7 = Math.abs(this.lllI(f3, f4, Math.max(f5, 0.005f)));
        if (f7 <= 1.0E-4f) {
            return new lIlIlIl(f, f2);
        }
        float f8 = MathHelper.clamp((float)(f7 / f6), (float)0.42f, (float)1.34f);
        return new lIlIlIl(f * f8, f2 * f8);
    }

    public float lIlllI(MinecraftClient minecraftClient, Vec3d vec3d, float f, int n) {
        return this.lIIll(minecraftClient, vec3d, IlIlIlIl.l(f), n);
    }

    /*
     * Unable to fully structure code
     */
    private void lIllll(MinecraftClient var1_1, IlIlIlIl var2_2, IlIlIIIlI var3_3, float var4_4) {
        block198: {
            block184: {
                block203: {
                    block193: {
                        block173: {
                            block138: {
                                block168: {
                                    block126: {
                                        block174: {
                                            block163: {
                                                block187: {
                                                    block143: {
                                                        block166: {
                                                            block181: {
                                                                block178: {
                                                                    block199: {
                                                                        block133: {
                                                                            block176: {
                                                                                block170: {
                                                                                    block200: {
                                                                                        block172: {
                                                                                            block201: {
                                                                                                block202: {
                                                                                                    block157: {
                                                                                                        block196: {
                                                                                                            block171: {
                                                                                                                block194: {
                                                                                                                    block169: {
                                                                                                                        block182: {
                                                                                                                            block177: {
                                                                                                                                block190: {
                                                                                                                                    block136: {
                                                                                                                                        block195: {
                                                                                                                                            block139: {
                                                                                                                                                block158: {
                                                                                                                                                    block197: {
                                                                                                                                                        block153: {
                                                                                                                                                            block167: {
                                                                                                                                                                block183: {
                                                                                                                                                                    block144: {
                                                                                                                                                                        block141: {
                                                                                                                                                                            block151: {
                                                                                                                                                                                block148: {
                                                                                                                                                                                    block175: {
                                                                                                                                                                                        block154: {
                                                                                                                                                                                            block191: {
                                                                                                                                                                                                block162: {
                                                                                                                                                                                                    block147: {
                                                                                                                                                                                                        block156: {
                                                                                                                                                                                                            block161: {
                                                                                                                                                                                                                block155: {
                                                                                                                                                                                                                    block186: {
                                                                                                                                                                                                                        block192: {
                                                                                                                                                                                                                            block180: {
                                                                                                                                                                                                                                block131: {
                                                                                                                                                                                                                                    block165: {
                                                                                                                                                                                                                                        block159: {
                                                                                                                                                                                                                                            block130: {
                                                                                                                                                                                                                                                block127: {
                                                                                                                                                                                                                                                    block152: {
                                                                                                                                                                                                                                                        block185: {
                                                                                                                                                                                                                                                            block160: {
                                                                                                                                                                                                                                                                block164: {
                                                                                                                                                                                                                                                                    block134: {
                                                                                                                                                                                                                                                                        block140: {
                                                                                                                                                                                                                                                                            block189: {
                                                                                                                                                                                                                                                                                block150: {
                                                                                                                                                                                                                                                                                    block188: {
                                                                                                                                                                                                                                                                                        block145: {
                                                                                                                                                                                                                                                                                            block128: {
                                                                                                                                                                                                                                                                                                block132: {
                                                                                                                                                                                                                                                                                                    block149: {
                                                                                                                                                                                                                                                                                                        block146: {
                                                                                                                                                                                                                                                                                                            block125: {
                                                                                                                                                                                                                                                                                                                block142: {
                                                                                                                                                                                                                                                                                                                    block179: {
                                                                                                                                                                                                                                                                                                                        block129: {
                                                                                                                                                                                                                                                                                                                            block137: {
                                                                                                                                                                                                                                                                                                                                block135: {
                                                                                                                                                                                                                                                                                                                                    break block174;
lbl1:
                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                        if (!this.IIIlI(var2_2)) break block125;
                                                                                                                                                                                                                                                                                                                                        break block126;
                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                    }
lbl4:
                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                    }
lbl6:
                                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                    }
lbl8:
                                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                                    while (Math.abs(var13_11) < 0.6f) {
                                                                                                                                                                                                                                                                                                                                        break block127;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    break block175;
lbl11:
                                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                        this.IlIIl = var30_22;
                                                                                                                                                                                                                                                                                                                                        break block128;
                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                    }
lbl14:
                                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                                    while (var6_30 == null) {
                                                                                                                                                                                                                                                                                                                                        break block129;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    break block176;
lbl17:
                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                    while (var21_18) {
                                                                                                                                                                                                                                                                                                                                        break block130;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    break block171;
lbl20:
                                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                                    return;
lbl22:
                                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                        break block131;
                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                    }
lbl24:
                                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                        if (var10_8 == null) break block132;
                                                                                                                                                                                                                                                                                                                                        break block133;
                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                    }
lbl27:
                                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                    }
lbl29:
                                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                                    while (Math.abs(var30_22) > Math.abs(var14_12)) {
                                                                                                                                                                                                                                                                                                                                        break block134;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    break block177;
lbl32:
                                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                    }
lbl34:
                                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                    }
lbl36:
                                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                                    while (var14_12 == 0.0f) {
                                                                                                                                                                                                                                                                                                                                        break block135;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    break block178;
lbl39:
                                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                        var30_22 = orchard.internal.IlIlIlI.IIlIIII(var30_22, var33_23);
                                                                                                                                                                                                                                                                                                                                        break block136;
                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                                        v0 = false;
                                                                                                                                                                                                                                                                                                                                        break block137;
                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                    v1 = new IIllIIllI(var8_7, 0.0f);
                                                                                                                                                                                                                                                                                                                                    break block138;
                                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                                }
lbl49:
                                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                    continue;
                                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                                }
lbl51:
                                                                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                    v2 = var10_8.Il(var2_2.Ill().IIII(), var2_2.Ill().lI());
                                                                                                                                                                                                                                                                                                                                    break block139;
                                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                                }
lbl54:
                                                                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                                    continue;
                                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
lbl57:
                                                                                                                                                                                                                                                                                                                            // 2 sources

                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                continue;
                                                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                                                            }
lbl59:
                                                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                var29_21 += var34_33 * MathHelper.clamp((float)(var4_4 * 30.0f), (float)0.3f, (float)1.5f);
                                                                                                                                                                                                                                                                                                                                break block140;
                                                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                                                            }
lbl62:
                                                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                var30_22 += this.IlllII(var2_2, var30_22, false) * var34_31 * 0.72f;
                                                                                                                                                                                                                                                                                                                                break block141;
                                                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                                                            }
lbl65:
                                                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                if (var2_2.Il() != lllIIIII.II) break block142;
                                                                                                                                                                                                                                                                                                                                break block143;
                                                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                                                            }
lbl68:
                                                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                                continue;
                                                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        v3 = var1_1.player.getYaw();
                                                                                                                                                                                                                                                                                                                        break block179;
lbl73:
                                                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                            continue;
                                                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                            v4 = var5_5.lI();
                                                                                                                                                                                                                                                                                                                            break block144;
                                                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                                                        }
lbl78:
                                                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                            this.IlIIl = 0.0f;
                                                                                                                                                                                                                                                                                                                            ** GOTO lbl49
                                                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                                                        }
lbl81:
                                                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                                            var11_9 += var16_44.I();
                                                                                                                                                                                                                                                                                                                            break block145;
                                                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
lbl85:
                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                    }
lbl87:
                                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                    }
lbl89:
                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                    var43_43 = v0;
                                                                                                                                                                                                                                                                                                                    if (var2_2.I()) break block180;
                                                                                                                                                                                                                                                                                                                    break block181;
lbl94:
                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                    }
lbl96:
                                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                                        var30_22 *= var33_23;
                                                                                                                                                                                                                                                                                                                        break block146;
                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                v5 = false;
                                                                                                                                                                                                                                                                                                                ** GOTO lbl4
lbl102:
                                                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                    v6 = var10_8.lIII(var2_2.Ill().ll(), var2_2.Ill().llI());
                                                                                                                                                                                                                                                                                                                    break block147;
                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                }
lbl105:
                                                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                    var35_24 *= var36_25;
                                                                                                                                                                                                                                                                                                                    break block148;
                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                }
lbl108:
                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                    continue;
                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                }
lbl110:
                                                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                    continue;
                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                }
lbl112:
                                                                                                                                                                                                                                                                                                                // 2 sources

                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                    var34_34 = v7;
                                                                                                                                                                                                                                                                                                                    break block149;
                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                }
lbl115:
                                                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                                    continue;
                                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
lbl118:
                                                                                                                                                                                                                                                                                                            // 2 sources

                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                if (!var21_18) break block148;
                                                                                                                                                                                                                                                                                                                break block150;
                                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                                            }
lbl121:
                                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                continue;
                                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                                            }
lbl123:
                                                                                                                                                                                                                                                                                                            // 2 sources

                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                continue;
                                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                                            }
lbl125:
                                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                                continue;
                                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                                            }
lbl127:
                                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                                            while (this.lIIlII()) {
                                                                                                                                                                                                                                                                                                                ** continue;
lbl129:
                                                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                                                ** GOTO lbl73
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                            break block182;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                                            var33_23 = this.IllIl(var1_1);
                                                                                                                                                                                                                                                                                                            ** continue;
                                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                    var29_21 += var34_34[0];
                                                                                                                                                                                                                                                                                                    break block183;
lbl138:
                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                        v8 = false;
                                                                                                                                                                                                                                                                                                        break block151;
                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                    }
lbl141:
                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                        var30_22 = this.llll(var14_12, var30_22, var4_4, var33_23);
                                                                                                                                                                                                                                                                                                        ** GOTO lbl17
                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                    }
lbl144:
                                                                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                    }
lbl146:
                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                        if (!this.Illlll(var1_1, var3_3, var41_40, var42_41)) ** continue;
                                                                                                                                                                                                                                                                                                        break block152;
                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                    }
lbl149:
                                                                                                                                                                                                                                                                                                    // 3 sources

                                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                                        if (var5_5.III() > 0.0f) {
                                                                                                                                                                                                                                                                                                            ** continue;
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                        break block153;
                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                var29_21 += this.IlllII(var2_2, var29_21, false) * var34_31;
                                                                                                                                                                                                                                                                                                ** while (true)
                                                                                                                                                                                                                                                                                                var33_23 = var24_26 * MathHelper.clamp((float)(var15_13 / 4.0f), (float)0.15f, (float)1.0f);
                                                                                                                                                                                                                                                                                                break block184;
lbl158:
                                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                                    continue;
                                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                                }
lbl160:
                                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                                while (var2_2.lII()) {
                                                                                                                                                                                                                                                                                                    ** continue;
lbl162:
                                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                                    ** GOTO lbl141
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                ** GOTO lbl17
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            if (!(Math.abs(var29_21) <= 0.01f)) break block185;
                                                                                                                                                                                                                                                                                            break block186;
lbl167:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            return;
lbl169:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                v9 = false;
                                                                                                                                                                                                                                                                                                ** GOTO lbl87
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
lbl172:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                var33_23 = orchard.internal.IlIlIlI.IIlIlII(0.35f, 7.0f, var15_13);
                                                                                                                                                                                                                                                                                                break block154;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
lbl175:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                continue;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                            var31_27 = (float)Math.hypot(var29_21, var30_22);
                                                                                                                                                                                                                                                                                            break block187;
lbl179:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                this.lIllII(var7_6, var8_7);
                                                                                                                                                                                                                                                                                                ** continue;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
lbl182:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                v10 = false;
                                                                                                                                                                                                                                                                                                break block155;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
lbl185:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                if (var10_8 == null) break block156;
                                                                                                                                                                                                                                                                                                break block157;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
lbl188:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                continue;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
lbl190:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                continue;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
lbl192:
                                                                                                                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                                                                                if (!var16_44.l()) ** GOTO lbl27
                                                                                                                                                                                                                                                                                                ** continue;
                                                                                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        var12_10 = this.IIIlIII(var12_10 + var16_44.II());
                                                                                                                                                                                                                                                                                        ** while (true)
                                                                                                                                                                                                                                                                                        var7_6 = v3;
                                                                                                                                                                                                                                                                                        if (var6_30 != null) break block188;
                                                                                                                                                                                                                                                                                        break block189;
lbl201:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            if (!var21_18) break block158;
                                                                                                                                                                                                                                                                                            break block159;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                        }
lbl204:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            if (!this.lllIll(var2_2)) ** continue;
                                                                                                                                                                                                                                                                                            break block160;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                        }
lbl207:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                                                            v11 = (float)((double)var35_24 * Math.tanh(var36_25 / var35_24));
                                                                                                                                                                                                                                                                                            break block161;
                                                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                                                        }
lbl210:
                                                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                                                        while (var15_13 > 0.15f) {
                                                                                                                                                                                                                                                                                            break block162;
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                        break block168;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                    v12 = var6_30[1];
                                                                                                                                                                                                                                                                                    ** GOTO lbl108
lbl216:
                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                        var31_27 = Math.signum(var14_12) * Math.min(Math.abs(var14_12) * (0.15f + 0.6f * var24_26) * var28_38 * var29_21, 1.8f);
                                                                                                                                                                                                                                                                                        ** continue;
                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                    }
lbl219:
                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                    }
lbl221:
                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                        this.IIlI();
                                                                                                                                                                                                                                                                                        ** continue;
                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                    }
lbl224:
                                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                                        v13 = this.IIlllII(var5_5.IIl(), var15_13, var4_4);
                                                                                                                                                                                                                                                                                        break block163;
                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                var36_25 = MathHelper.clamp((float)((var22_19 + var23_20) * 0.5f), (float)0.78f, (float)1.22f);
                                                                                                                                                                                                                                                                                ** while (true)
lbl230:
                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                                                    continue;
                                                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                                                }
lbl232:
                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                while (Math.abs(var29_21) > Math.abs(var13_11)) {
                                                                                                                                                                                                                                                                                    break block164;
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                break block175;
lbl235:
                                                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                                                while (var5_5.ll() > 0.0f) {
                                                                                                                                                                                                                                                                                    ** GOTO lbl127
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                break block182;
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                            v12 = var1_1.player.getPitch();
                                                                                                                                                                                                                                                                            ** while (true)
                                                                                                                                                                                                                                                                            var33_23 = var10_8.Illl();
                                                                                                                                                                                                                                                                            var29_21 *= var33_23;
                                                                                                                                                                                                                                                                            ** while (true)
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                        var30_22 += var35_24 * MathHelper.clamp((float)(var4_4 * 30.0f), (float)0.3f, (float)1.5f);
                                                                                                                                                                                                                                                                        ** GOTO lbl149
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                    var30_22 = var14_12;
                                                                                                                                                                                                                                                                    break block177;
                                                                                                                                                                                                                                                                    this.llllIl();
                                                                                                                                                                                                                                                                    this.lllII(var4_4);
                                                                                                                                                                                                                                                                    ** GOTO lbl235
lbl253:
                                                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                var29_21 = var13_11;
                                                                                                                                                                                                                                                                break block175;
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                            v4 = var2_2.Ill().llIl() * 0.25f;
                                                                                                                                                                                                                                                            break block144;
                                                                                                                                                                                                                                                        }
lbl262:
                                                                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                            break block165;
                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        var30_22 = var32_29.l();
                                                                                                                                                                                                                                                        if (!(var24_26 > 0.0f)) ** GOTO lbl149
                                                                                                                                                                                                                                                        break block190;
                                                                                                                                                                                                                                                        var34_32 = MathHelper.clamp((float)(var4_4 * 60.0f), (float)0.25f, (float)3.0f);
                                                                                                                                                                                                                                                        break block191;
lbl269:
                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                            var29_21 = orchard.internal.IlIlIlI.IIlIIII(var29_21, var33_23);
                                                                                                                                                                                                                                                            ** continue;
                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        this.IIIlIll();
                                                                                                                                                                                                                                                        break block192;
lbl274:
                                                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                                                            this.lllIl *= var36_25;
                                                                                                                                                                                                                                                            ** GOTO lbl1
                                                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                        var14_12 = var12_10 - var8_7;
                                                                                                                                                                                                                                                        var15_13 = (float)Math.hypot(var13_11, var14_12);
                                                                                                                                                                                                                                                        ** while (true)
                                                                                                                                                                                                                                                    }
lbl281:
                                                                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                                        v0 = true;
                                                                                                                                                                                                                                                        ** continue;
                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                if (Math.signum(var29_21) != Math.signum(var13_11)) break block175;
                                                                                                                                                                                                                                                ** GOTO lbl232
                                                                                                                                                                                                                                                this.lIllII(var7_6, var8_7);
                                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            if (var2_2.lII()) {
                                                                                                                                                                                                                                                ** continue;
lbl292:
                                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                                    continue;
                                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                            break block171;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        if (var10_8 != null) {
                                                                                                                                                                                                                                            ** continue;
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                        break block193;
                                                                                                                                                                                                                                        var12_10 = this.IIIIIlI(var5_5, var8_7, var12_10);
                                                                                                                                                                                                                                        break block194;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    var41_40 = var7_6 + var29_21;
                                                                                                                                                                                                                                    break block195;
lbl304:
                                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                                        v10 = true;
                                                                                                                                                                                                                                        break block155;
                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                this.lIIlll(var2_2, var7_6, var8_7, var13_11, var14_12);
                                                                                                                                                                                                                                ** while (this.IIIIIIlI <= 0)
lbl310:
                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                break block196;
lbl311:
                                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                    var30_22 = this.llll(var14_12, var30_22, var4_4, var33_23);
                                                                                                                                                                                                                                    break block166;
                                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
lbl315:
                                                                                                                                                                                                                            // 2 sources

                                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                                if (!var43_43) {
                                                                                                                                                                                                                                    ** continue;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                break block167;
                                                                                                                                                                                                                                break;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        this.lIllII(var7_6, var8_7);
                                                                                                                                                                                                                        return;
lbl322:
                                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                            var26_35 = this.IIIlIII(var26_35 + var31_27);
                                                                                                                                                                                                                            break block168;
                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    ** while (!(Math.abs((float)var30_22) <= 0.01f))
lbl327:
                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                    ** while (true)
lbl328:
                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                    while (Math.signum(var30_22) == Math.signum(var14_12)) {
                                                                                                                                                                                                                        ** GOTO lbl29
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break block177;
lbl331:
                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        this.IlIIl *= var36_25;
                                                                                                                                                                                                                        break block169;
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    }
lbl334:
                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    }
lbl336:
                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        v7 = var10_8.lll(var33_23, 0.11f * var5_5.III(), 1.0f);
                                                                                                                                                                                                                        ** GOTO lbl112
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    }
lbl339:
                                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        continue;
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    var32_28 = this.IIIIl(orchard.internal.IlIlIlI.IIlIlll(var25_45 + var30_22 - var7_6), var3_3.II());
                                                                                                                                                                                                                    var25_45 = var7_6 + var32_28;
                                                                                                                                                                                                                    ** while (true)
                                                                                                                                                                                                                }
                                                                                                                                                                                                                var20_17 = v10;
                                                                                                                                                                                                                ** while (true)
lbl347:
                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                    var13_11 = this.IIIIl(orchard.internal.IlIlIlI.IIlIlll(var11_9 - var7_6), var3_3.II());
                                                                                                                                                                                                                    ** continue;
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                }
lbl350:
                                                                                                                                                                                                                // 1 sources

                                                                                                                                                                                                                return;
                                                                                                                                                                                                                var40_46 = v14;
                                                                                                                                                                                                                var30_22 = this.IlIIl + var40_46;
                                                                                                                                                                                                                ** GOTO lbl8
                                                                                                                                                                                                            }
lbl356:
                                                                                                                                                                                                            // 2 sources

                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                continue;
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
lbl359:
                                                                                                                                                                                                        // 2 sources

                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                            continue;
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        this.lIllII(var7_6, var8_7);
                                                                                                                                                                                                        return;
lbl363:
                                                                                                                                                                                                        // 1 sources

                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                            var30_22 = Math.signum(var13_11) * Math.min(Math.abs(var13_11) * (0.2f + 0.8f * var24_26) * var28_38 * var29_21, 3.0f);
                                                                                                                                                                                                            ** continue;
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
lbl367:
                                                                                                                                                                                                    // 3 sources

                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                        continue;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    }
lbl369:
                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                        if (!var18_15) ** GOTO lbl144
                                                                                                                                                                                                        ** continue;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    }
lbl372:
                                                                                                                                                                                                    // 2 sources

                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                        var6_30 = v15;
                                                                                                                                                                                                        ** GOTO lbl14
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    this.llIIlII = var27_36.l();
                                                                                                                                                                                                    this.lllIl = var28_39.l();
                                                                                                                                                                                                    ** while (true)
lbl378:
                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                        v11 = var36_25;
                                                                                                                                                                                                        ** continue;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    var15_13 = (float)Math.hypot(var13_11, var14_12);
                                                                                                                                                                                                    ** while (var10_8 == null)
lbl383:
                                                                                                                                                                                                    // 1 sources

                                                                                                                                                                                                    break block197;
                                                                                                                                                                                                }
                                                                                                                                                                                                var27_37 = (float)Math.hypot(this.llIIlII, this.lllIl);
                                                                                                                                                                                                break block198;
                                                                                                                                                                                            }
                                                                                                                                                                                            var35_24 = Math.max(var33_23, (0.35f + (1.0f - var5_5.l()) * 0.45f + var24_26 * 0.4f) * var34_32);
                                                                                                                                                                                            if (var15_13 < 4.0f) ** break;
                                                                                                                                                                                            ** while (true)
                                                                                                                                                                                            ** while (true)
lbl392:
                                                                                                                                                                                            // 1 sources

                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                v15 = null;
                                                                                                                                                                                                ** GOTO lbl372
                                                                                                                                                                                                break;
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                        var34_31 = 0.55f + var33_23 * 0.75f;
                                                                                                                                                                                        ** while (true)
                                                                                                                                                                                    }
                                                                                                                                                                                    if (!(Math.abs(var14_12) < 0.6f)) break block177;
                                                                                                                                                                                    ** GOTO lbl328
                                                                                                                                                                                    var29_21 = MathHelper.wrapDegrees((float)(var27_36.I() - var7_6));
                                                                                                                                                                                    var30_22 = var28_39.I() - var8_7;
                                                                                                                                                                                    ** while (true)
                                                                                                                                                                                }
                                                                                                                                                                                var36_25 = var29_21 - this.IlIIIII;
                                                                                                                                                                                ** while (!(Math.abs((float)var36_25) <= 1.0E-5f))
lbl407:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                ** while (true)
lbl408:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    v15 = orchard.internal.IlIlllI.lllI(var1_1);
                                                                                                                                                                                    ** continue;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
lbl411:
                                                                                                                                                                                // 1 sources

                                                                                                                                                                                while (true) {
                                                                                                                                                                                    v2 = 1.0f;
                                                                                                                                                                                    break block139;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                            }
lbl415:
                                                                                                                                                                            // 2 sources

                                                                                                                                                                            while (true) {
                                                                                                                                                                                continue;
                                                                                                                                                                                break;
                                                                                                                                                                            }
lbl417:
                                                                                                                                                                            // 1 sources

                                                                                                                                                                            while (Math.abs(var39_49) <= 1.0E-5f) {
                                                                                                                                                                                break block170;
                                                                                                                                                                            }
                                                                                                                                                                            break block199;
                                                                                                                                                                        }
lbl421:
                                                                                                                                                                        // 3 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            if (var10_8 == null) ** continue;
                                                                                                                                                                            ** continue;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                    }
lbl425:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    while (true) {
                                                                                                                                                                        continue;
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                var30_22 += var34_34[1];
                                                                                                                                                                break block153;
                                                                                                                                                            }
                                                                                                                                                            this.lIllII(var41_40, var42_41);
                                                                                                                                                            ** while (true)
lbl433:
                                                                                                                                                            // 2 sources

                                                                                                                                                            while (true) {
                                                                                                                                                                if (var30_22 != 0.0f) break block171;
                                                                                                                                                                break block172;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        if (!var21_18) ** GOTO lbl421
                                                                                                                                                        ** while (true)
lbl439:
                                                                                                                                                        // 1 sources

                                                                                                                                                        while (true) {
                                                                                                                                                            v9 = true;
                                                                                                                                                            ** continue;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    v13 = var10_8.lI(var5_5.IIl(), var15_13);
                                                                                                                                                    break block163;
                                                                                                                                                }
                                                                                                                                                v6 = 1.0f;
                                                                                                                                                ** GOTO lbl367
                                                                                                                                            }
lbl449:
                                                                                                                                            // 2 sources

                                                                                                                                            while (true) {
                                                                                                                                                var22_19 = v2;
                                                                                                                                                ** continue;
                                                                                                                                                break;
                                                                                                                                            }
lbl452:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                var10_8 = this.IlIIIlI;
                                                                                                                                                ** continue;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        var42_41 = this.IIIlIII(var8_7 + var30_22);
                                                                                                                                        ** while (!var2_2.I())
lbl458:
                                                                                                                                        // 1 sources

                                                                                                                                        ** while (true)
                                                                                                                                    }
                                                                                                                                    while (true) {
                                                                                                                                        this.IlIIIII = var29_21;
                                                                                                                                        ** continue;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var15_13 > 0.15f) ** break;
                                                                                                                                ** while (true)
                                                                                                                                ** while (true)
                                                                                                                                this.IIlI();
                                                                                                                                this.IIIlIll();
                                                                                                                                ** while (true)
                                                                                                                                var23_20 = v6;
                                                                                                                                ** while (!var20_17)
lbl472:
                                                                                                                                // 1 sources

                                                                                                                                break block200;
                                                                                                                            }
                                                                                                                            if (var2_2.lII()) {
                                                                                                                                ** continue;
lbl476:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    this.lIllII(var7_6, var8_7);
                                                                                                                                    ** continue;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            break block166;
                                                                                                                            var11_9 = var7_6 + var13_11;
                                                                                                                            var14_12 = var12_10 - var8_7;
                                                                                                                            ** while (true)
                                                                                                                        }
                                                                                                                        ** while (!(var15_13 <= 0.01f))
lbl485:
                                                                                                                        // 1 sources

                                                                                                                        ** while (true)
                                                                                                                        var21_18 = v5;
                                                                                                                        ** while (!var21_18)
lbl488:
                                                                                                                        // 1 sources

                                                                                                                        break block201;
                                                                                                                        this.IIlI();
                                                                                                                        this.IIIlIll();
                                                                                                                        ** while (true)
                                                                                                                    }
                                                                                                                    this.llIIlII *= var36_25;
                                                                                                                    ** while (true)
                                                                                                                    var29_21 = orchard.internal.IlIlIlI.IIlII(var13_11, var29_21);
                                                                                                                    break block202;
                                                                                                                    var18_15 = v9;
                                                                                                                    if (var17_14) ** break;
                                                                                                                    ** while (true)
                                                                                                                    ** while (true)
lbl501:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        var29_21 += var10_8.l(this.IIlIlIl(var2_2, var29_21 / var35_24)) * var34_31;
                                                                                                                        break block173;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                var13_11 = this.IIIIl(orchard.internal.IlIlIlI.IIlIlll(var11_9 - var7_6), var3_3.II());
                                                                                                                var11_9 = var7_6 + var13_11;
                                                                                                                ** while (true)
lbl508:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    if (var5_5.I() <= 0.0f) ** break;
                                                                                                                    ** continue;
                                                                                                                    ** continue;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
lbl513:
                                                                                                            // 2 sources

                                                                                                            while (true) {
                                                                                                                if (var10_8 == null) ** continue;
                                                                                                                ** continue;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        v8 = true;
                                                                                                        ** while (true)
                                                                                                    }
                                                                                                    var10_8.III(var4_4, var2_2.Ill().I(), var2_2.Ill().l());
                                                                                                    ** while (true)
lbl522:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        this.llIIlII = 0.0f;
                                                                                                        ** GOTO lbl433
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                var30_22 = orchard.internal.IlIlIlI.IIlII(var14_12, var30_22);
                                                                                                if (var29_21 == 0.0f) ** break;
                                                                                                ** while (true)
                                                                                                ** while (true)
                                                                                            }
                                                                                            if (var10_8 != null) {
                                                                                                ** continue;
                                                                                            }
                                                                                            break block203;
                                                                                            var24_26 = v4;
                                                                                            var25_45 = var11_9;
                                                                                            ** while (true)
lbl537:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var30_22 = this.lIlIl(var30_22, var33_23, false);
                                                                                                ** GOTO lbl160
                                                                                                break;
                                                                                            }
lbl540:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                if (var5_5.I() <= 0.0f) ** continue;
                                                                                                ** GOTO lbl36
                                                                                                break;
                                                                                            }
                                                                                            this.IIlI();
                                                                                            this.IIIlIll();
                                                                                            ** while (true)
                                                                                        }
                                                                                        this.lllIl = 0.0f;
                                                                                        ** while (true)
                                                                                        var38_42 = var35_24 * Math.max(0.2f, var5_5.I());
                                                                                        var39_49 = var30_22 - this.IlIIl;
                                                                                        ** GOTO lbl417
lbl552:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            v7 = this.IIlIII.l(var4_4, var33_23, 0.11f * var5_5.III(), 1.0f);
                                                                                            ** continue;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    v4 = 0.0f;
                                                                                    ** while (true)
                                                                                }
                                                                                v14 = var39_49;
                                                                                ** GOTO lbl123
                                                                                var11_9 = var9_47.l();
                                                                                var12_10 = this.IIIIIlI(var5_5, var8_7, var9_47.I());
                                                                                ** while (true)
                                                                                var36_25 = MathHelper.clamp((float)(var15_13 / 4.0f), (float)0.2f, (float)1.0f);
                                                                                this.IlIIIII *= var36_25;
                                                                                ** while (true)
                                                                            }
                                                                            v3 = var6_30[0];
                                                                            ** while (true)
                                                                        }
                                                                        var35_24 = MathHelper.clamp((float)(var4_4 * 60.0f), (float)0.25f, (float)3.0f);
                                                                        ** while (true)
                                                                    }
                                                                    v14 = (float)((double)var38_42 * Math.tanh(var39_49 / var38_42));
                                                                    ** while (true)
                                                                    var19_16 = (float)orchard.internal.IlIIllI.IIll(var15_13);
                                                                    ** while (!(var2_2.III() > 1.0f))
lbl578:
                                                                    // 1 sources

                                                                    ** while (true)
                                                                    var8_7 = this.IIIlIII(v12);
                                                                    var9_47 = this.IIIlll(var1_1, var2_2, var3_3, var7_6, var8_7, var4_4);
                                                                    ** while (true)
                                                                }
                                                                v1 = this.lIll(var2_2, var8_7, var26_35, this.lllIl, this.lIlI(var2_2) * var5_5.I(), var18_15, var4_4, var19_16, var23_20, false, var15_13, true);
                                                                break block138;
                                                            }
                                                            lIIllllI.IIlII(var1_1, var41_40, var42_41);
                                                            ** while (true)
                                                        }
                                                        var29_21 = this.lIlIl(var29_21, var33_23, true);
                                                        ** while (true)
                                                        var37_48 = v11;
                                                        var29_21 = this.IlIIIII + var37_48;
                                                        ** while (true)
                                                        var17_14 = v8;
                                                        ** while (this.lllIlIl <= 0)
lbl596:
                                                        // 1 sources

                                                        ** while (true)
                                                    }
                                                    v5 = true;
                                                    ** while (true)
                                                    var33_23 = (float)Math.hypot(this.llIIlII, this.lllIl) * 20.0f;
                                                    ** while (var10_8 == null)
lbl602:
                                                    // 1 sources

                                                    ** while (true)
                                                    var26_35 = var12_10;
                                                    if (!(var24_26 > 0.0f)) break block168;
                                                    ** GOTO lbl210
                                                }
                                                var32_29 = this.IIllIl(var2_2, var29_21, var30_22, var13_11, var14_12, var15_13, var31_27, var19_16, true);
                                                var29_21 = var32_29.I();
                                                ** while (true)
                                            }
                                            var16_44 = v13;
                                            ** while (true)
                                        }
                                        var5_5 = var2_2.IIl();
                                        ** while (!var2_2.I())
lbl616:
                                        // 1 sources

                                        ** while (true)
                                    }
                                    var35_24 *= 0.85f;
                                    ** while (true)
                                }
                                var27_36 = this.lIll(var2_2, var7_6, var25_45, this.llIIlII, this.lllll(var2_2), var17_14, var4_4, var19_16, var22_19, true, var15_13, true);
                                ** while (true)
                            }
                            var28_39 = v1;
                            ** while (true)
                        }
                        var30_22 += var10_8.IIl(this.IIlIlIl(var2_2, var30_22 / var35_24)) * var34_31 * 0.72f;
                        ** while (true)
                    }
                    v6 = this.IIlIIl(this.IllIlIl, var3_3.II(), 127, var4_4, var2_2.Ill().ll(), var2_2.Ill().llI(), var2_2.Ill().I(), var2_2.Ill().l());
                    ** while (true)
                }
                v2 = this.IIlIIl(this.llIll, var3_3.II(), 109, var4_4, var2_2.Ill().IIII(), var2_2.Ill().lI(), var2_2.Ill().I(), var2_2.Ill().l());
                ** while (true)
            }
            var34_33 = Math.signum(var13_11) * Math.min(Math.abs(var13_11) * 0.3f, 3.0f) * var33_23;
            var35_24 = Math.signum(var14_12) * Math.min(Math.abs(var14_12) * 0.2f, 1.8f) * var33_23;
            ** while (true)
        }
        var28_38 = MathHelper.clamp((float)(var27_37 / 10.0f), (float)0.35f, (float)1.6f);
        var29_21 = MathHelper.clamp((float)(var15_13 / 4.0f), (float)0.25f, (float)1.25f);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private float llIIII(IlIlIlIl ilIlIlIl) {
        if (ilIlIlIl == null) return 1.0f;
        if (ilIlIlIl.Il() == lllIIIII.I) return MathHelper.clamp((float)(ilIlIlIl.IlI() / 100.0f), (float)0.0f, (float)2.0f);
        return 1.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float llIIIl(MinecraftClient minecraftClient, BlockHitResult blockHitResult, float f) {
        if (!this.IIIlIIl(minecraftClient, blockHitResult)) {
            this.III();
            return Float.MAX_VALUE;
        }
        int n = 31 * blockHitResult.getBlockPos().hashCode() + blockHitResult.getSide().ordinal();
        if (this.lIlIIlI != null) {
            if (this.lll == n) return this.IllII(minecraftClient, this.lIlIIlI, f);
        }
        this.lll = n;
        this.lIlIIlI = orchard.internal.IlIlllI.IIIIIl(blockHitResult.getPos());
        return this.IllII(minecraftClient, this.lIlIIlI, f);
    }

    /*
     * Enabled aggressive block sorting
     */
    void llIIlI(float f) {
        if (!(f <= 0.0f) && Float.isFinite(f)) {
            this.lIIIlIl = true;
            this.llllll = f;
            return;
        }
        this.lIIIlIl = false;
        this.llllll = 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float llIIll(MinecraftClient minecraftClient, Vec3d vec3d, Vec3d vec3d2) {
        Vec3d vec3d3 = vec3d2.subtract(vec3d);
        double d = Math.sqrt(vec3d3.x * vec3d3.x + vec3d3.z * vec3d3.z);
        if (d <= 1.0E-4) {
            return 0.016f;
        }
        float f = (float)(Math.toDegrees(Math.atan2(vec3d3.z, vec3d3.x)) - 90.0);
        float f2 = (float)(-Math.toDegrees(Math.atan2(vec3d3.y, d)));
        float f3 = MathHelper.wrapDegrees((float)(f - minecraftClient.player.getYaw()));
        float f4 = f2 - this.IIIlIII(minecraftClient.player.getPitch());
        float f5 = (float)Math.sqrt(f3 * f3 + f4 * f4);
        float f6 = MathHelper.clamp((float)((f5 - 2.5f) / 11.5f), (float)0.0f, (float)1.0f);
        return 0.016f + f6 * 0.084f;
    }

    float llIlII(float f, float f2) {
        float f3 = f * this.IlIlIl + f2 * this.IIIllI;
        if (!(Math.abs(f) < this.lIllIII)) {
            return f3;
        }
        return 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIlIll llIlIl(IlIlIlIl ilIlIlIl, IlIlIIIlI ilIlIIIlI, float f) {
        if (ilIlIIIlI == null) return orchard.internal.lIIlIll.l;
        if (ilIlIIIlI.Il()) return orchard.internal.lIIlIll.l;
        if (f <= 1.35f) return orchard.internal.lIIlIll.l;
        float f2 = MathHelper.clamp((float)((ilIlIIIlI.ll() - 0.18f) / 0.82f), (float)0.0f, (float)1.0f);
        if (f2 <= 1.0E-4f) return orchard.internal.lIIlIll.l;
        float f3 = MathHelper.clamp((float)((f - 1.35f) / 1.65f), (float)0.0f, (float)1.0f);
        if (f3 <= 1.0E-4f) return orchard.internal.lIIlIll.l;
        float f4 = this.lllIll(ilIlIlIl) ? 0.6f : 1.0f;
        float f5 = Math.min(0.02f, f * 0.004f) * f3 * f4 * f2;
        return new lIIlIll(this.IlIlI * f5, this.lllIlI * f5 * 0.72f);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void llIllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.world == null) {
            return;
        }
        long l2 = System.nanoTime();
        Class<IlIlIlI> clazz = IlIlIlI.class;
        synchronized (IlIlIlI.class) {
            IlIlIlI ilIlIlI = IIIllII;
            // ** MonitorExit[var4_2] (shouldn't be in output)
            if (ilIlIlI != null) {
                ilIlIlI.Illll(minecraftClient, l2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d llIlll(Vec3d vec3d, Vec3d vec3d2, float f, IlIlIlIl ilIlIlIl) {
        IIIlIllII iIIlIllII = ilIlIlIl.Ill();
        float f2 = iIIlIllII.lIll();
        if (!(f2 <= 1.0E-6f)) {
            if (!this.lllIll) {
                ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
                this.llllIll = threadLocalRandom.nextFloat() * 1.35f + 0.35f;
                this.IlIlIIl = threadLocalRandom.nextFloat() * 1.35f + 0.35f;
                this.IllI = threadLocalRandom.nextFloat() * 1.35f + 0.35f;
                this.llIlIlI = threadLocalRandom.nextFloat() * ((float)Math.PI * 2);
                this.IlIlll = threadLocalRandom.nextFloat() * ((float)Math.PI * 2);
                this.IIIIII = threadLocalRandom.nextFloat() * ((float)Math.PI * 2);
                this.lllIll = true;
            }
            float f3 = Math.max(0.0f, Math.min(f, 0.1f));
            ThreadLocalRandom threadLocalRandom = ThreadLocalRandom.current();
            float f4 = 1.0f + (threadLocalRandom.nextFloat() - 0.5f) * 0.018f;
            float f5 = 1.0f + (threadLocalRandom.nextFloat() - 0.5f) * 0.018f;
            float f6 = 1.0f + (threadLocalRandom.nextFloat() - 0.5f) * 0.014f;
            float f7 = iIIlIllII.Ill();
            this.IlllIIl += f3 * this.llllIll * f4 * f7 * ((float)Math.PI * 2);
            this.II += f3 * this.IlIlIIl * f5 * f7 * ((float)Math.PI * 2);
            this.llIIllI += f3 * this.IllI * f6 * f7 * ((float)Math.PI * 2);
            float f8 = (float)(Math.sin(this.IlllIIl + this.llIlIlI) * 0.5 + Math.sin((double)this.IlllIIl * 1.7 + (double)this.IlIlll) * 0.3 + Math.sin((double)this.llIIllI * 2.3 + (double)this.IIIIII) * 0.2);
            float f9 = (float)(Math.sin(this.II + this.IlIlll) * 0.45 + Math.sin((double)this.II * 1.3 + (double)this.llIlIlI) * 0.3 + Math.sin((double)this.llIIllI * 1.9 + (double)this.IIIIII) * 0.25);
            Vec3d vec3d3 = vec3d2.subtract(vec3d);
            double d = Math.sqrt(vec3d3.x * vec3d3.x + vec3d3.z * vec3d3.z);
            if (!(d <= 1.0E-4)) {
                double d2 = -vec3d3.z / d;
                double d3 = vec3d3.x / d;
                double d4 = d2 * (double)f8 * (double)f2;
                double d5 = d3 * (double)f8 * (double)f2;
                double d6 = f9 * f2;
                return vec3d2.add(d4, d6, d5);
            }
            return vec3d2;
        }
        return vec3d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d lllIII(Vec3d vec3d, Box box) {
        boolean bl;
        double d = MathHelper.clamp((double)vec3d.x, (double)box.minX, (double)box.maxX);
        double d2 = MathHelper.clamp((double)vec3d.y, (double)box.minY, (double)box.maxY);
        double d3 = MathHelper.clamp((double)vec3d.z, (double)box.minZ, (double)box.maxZ);
        boolean bl2 = bl = vec3d.x >= box.minX && vec3d.x <= box.maxX && vec3d.y >= box.minY && vec3d.y <= box.maxY && vec3d.z >= box.minZ && vec3d.z <= box.maxZ;
        if (!bl) {
            return new Vec3d(d, d2, d3);
        }
        double d4 = Math.abs(vec3d.x - box.minX);
        double d5 = Math.abs(box.maxX - vec3d.x);
        double d6 = Math.abs(vec3d.y - box.minY);
        double d7 = Math.abs(box.maxY - vec3d.y);
        double d8 = Math.abs(vec3d.z - box.minZ);
        double d9 = Math.abs(box.maxZ - vec3d.z);
        double d10 = Math.min(Math.min(Math.min(d4, d5), Math.min(d6, d7)), Math.min(d8, d9));
        if (d10 == d4) {
            return new Vec3d(box.minX, d2, d3);
        }
        if (d10 == d5) {
            return new Vec3d(box.maxX, d2, d3);
        }
        if (d10 == d6) {
            return new Vec3d(d, box.minY, d3);
        }
        if (d10 != d7) {
            if (d10 != d8) return new Vec3d(d, d2, box.maxZ);
            return new Vec3d(d, d2, box.minZ);
        }
        return new Vec3d(d, box.maxY, d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllIIl() {
        this.IIlI();
        this.IIIIIIlI = 0;
        this.lllIlIl = 0;
        this.lIlIll = null;
        this.lllllII = -1;
        this.llllII = 0L;
        this.lIlIII = 0L;
        this.lllIIIl = 0L;
        this.llIIlIl = 0.0f;
        this.llIll.I();
        this.IllIlIl.I();
        this.IlllllI.I();
        this.IIIIIlll = 0.0f;
        this.llllIIl = 1.0f;
        this.IlIIIl = false;
        this.IIIIlll = 0.0f;
        this.IIllII = 0.25f;
        this.llllIl();
        this.I = 0.0f;
        this.IIIlllI = 0.0f;
        this.IIIlIl = 0.0f;
        this.lIIlII = 1.0f;
        this.IlIlI = 0.0f;
        this.lllIlI = 0.0f;
        this.lIIllIl = 1.0f;
        this.IllIll = 1.0f;
        this.IIIlIll();
        this.lIlIIIl = 0.0f;
        this.lIlIlll = 0.0f;
        this.llllIlI = -1;
        this.lIIIllI = 0.0f;
        this.llIII = 0.0f;
        this.lIIlllI = 0.0f;
        this.IIIlIll = 0.0f;
        this.llllIII = 0.0f;
        this.lIl = 0.0f;
        this.llIII();
        this.lIIlI();
        this.lIlIlI();
        this.IIlIIlI = -1;
        this.IllllI = Double.MAX_VALUE;
        this.llllll = 0.0f;
        this.lIIIlIl = false;
        this.IIllll = 0.0f;
        this.lIIIIll = -1;
        this.IlIIIlI = null;
        this.IIlIII.Il();
    }

    /*
     * Enabled aggressive block sorting
     */
    private int lllIlI(float f, float f2, float f3, int n, boolean bl) {
        if (Math.abs(f3) <= 0.01f) {
            return 0;
        }
        float f4 = bl ? MathHelper.wrapDegrees((float)(f - f2)) : f - f2;
        if (!(Math.abs(f4) >= 0.8f)) return Math.max(0, n - 1);
        if (Math.signum(f4) == Math.signum(f3)) return Math.max(0, n - 1);
        return 4;
    }

    private boolean lllIll(IlIlIlIl ilIlIlIl) {
        return ilIlIlIl.ll() == IIlIIllII.I;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void llllII(MinecraftClient minecraftClient, IlIlIlIl ilIlIlIl, boolean bl, IlIlIIIlI ilIlIIIlI, boolean bl2) {
        long l2 = System.nanoTime();
        if (!bl2) {
            this.llllll();
            float f = this.IIIllI(l2);
            this.lIlIII = l2;
            this.IIIIlI(minecraftClient, ilIlIlIl, bl, ilIlIIIlI, f, l2, false);
            return;
        }
        this.lIlIII = l2;
        this.IllIll(minecraftClient, ilIlIlIl, bl, ilIlIIIlI, l2, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llllIl() {
        this.IlIlII = 0.0f;
        this.IIIIIlI = 0.0f;
        this.IIIIIlII = 0.0f;
        this.lIlllIl = 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float lllllI(IlIlIlIl ilIlIlIl, float f, float f2, boolean bl) {
        float f3 = this.IIllIII(ilIlIlIl);
        float f4 = MathHelper.clamp((float)((0.05f + (1.0f - f3) * 0.11f + f * 0.08f) * f2), (float)0.035f, (float)0.26f);
        if (this.lllIll(ilIlIlIl)) {
            f4 *= ilIlIlIl.Ill().Il();
            f4 = MathHelper.clamp((float)f4, (float)0.06f, (float)0.54f);
        }
        if (!bl) return f4;
        return MathHelper.clamp((float)(f4 * 0.48f), (float)0.018f, (float)0.12f);
    }

    private void llllll() {
        this.lllIIIl = 0L;
        this.llIIlIl = 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIIIIII(Vec3d vec3d, Vec3d vec3d2) {
        double d = vec3d.length();
        double d2 = vec3d2.length();
        if (d <= 1.0E-6) return Float.POSITIVE_INFINITY;
        if (d2 <= 1.0E-6) {
            return Float.POSITIVE_INFINITY;
        }
        double d3 = vec3d.dotProduct(vec3d2) / (d * d2);
        d3 = MathHelper.clamp((double)d3, (double)-1.0, (double)1.0);
        return (float)Math.toDegrees(Math.acos(d3));
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IIIIIIl(Vec3d vec3d, LivingEntity livingEntity) {
        Vec3d vec3d2;
        Box box = livingEntity.getBoundingBox();
        vec3d2(MathHelper.clamp((double)vec3d.x, (double)box.minX, (double)box.maxX), MathHelper.clamp((double)vec3d.y, (double)box.minY, (double)box.maxY), MathHelper.clamp((double)vec3d.z, (double)box.minZ, (double)box.maxZ));
        return vec3d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIIIIlI(IlllIl illlIl, float f, float f2) {
        float f3;
        if (illlIl.I() <= 0.0f) {
            return f;
        }
        float f4 = this.IIIlIII(f2);
        if (!(Math.abs(f4 - f) <= 0.0125f)) {
            f3 = f4;
            return f3;
        }
        f3 = f;
        return f3;
    }

    IlIlIIIlI IIIIIll(MinecraftClient minecraftClient, LivingEntity livingEntity, lllllI lllllI2, boolean bl) {
        return this.Ill(minecraftClient, livingEntity, lllllI2, bl, false);
    }

    IllllIIl IIIIlII() {
        return this.IlIIIlI;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean IIIIlIl() {
        Class<IlIlIlI> clazz = IlIlIlI.class;
        synchronized (IlIlIlI.class) {
            // ** MonitorExit[var0] (shouldn't be in output)
            return IIIllII != null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIllIIllI IIIIllI(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = Math.max(0.003f, f4);
        float f8 = 2.0f / f7;
        float f9 = f8 * f6;
        float f10 = 1.0f / (1.0f + f9 + 0.48f * f9 * f9 + 0.235f * f9 * f9 * f9);
        float f11 = f - f2;
        float f12 = f2;
        float f13 = f5 * f7;
        f11 = MathHelper.clamp((float)f11, (float)(-f13), (float)f13);
        f2 = f - f11;
        float f14 = (f3 + f8 * f11) * f6;
        float f15 = (f3 - f8 * f14) * f10;
        float f16 = f2 + (f11 + f14) * f10;
        boolean bl = f12 - f > 0.0f == f16 > f12;
        if (!bl) return new IIllIIllI(f16, f15);
        f16 = f12;
        return new IIllIIllI(f16, f15 *= 0.25f);
    }

    /*
     * Enabled aggressive block sorting
     */
    Vec3d IIIIlll(MinecraftClient minecraftClient, LivingEntity livingEntity, Vec3d vec3d) {
        IllllIIl illllIIl = this.IlIIIlI;
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (minecraftClient.world == null) return null;
        if (livingEntity == null) return null;
        if (illllIIl == null) return null;
        if (illllIIl.IlII() != livingEntity.getId()) return null;
        if (orchard.internal.IlIlIlI.IIlllIl(vec3d)) {
            boolean bl = KillAura.lII(minecraftClient.player.getBoundingBox(), minecraftClient.player.getEyePos(), livingEntity.getBoundingBox());
            Vec3d vec3d2 = illllIIl.llI(minecraftClient.player.getEyePos(), vec3d, livingEntity.getBoundingBox(), bl);
            if (orchard.internal.IlIlIlI.IIlllIl(vec3d2)) {
                Vec3d vec3d3 = minecraftClient.player.getEyePos();
                if (this.IIlIl(minecraftClient, vec3d3, vec3d2)) return vec3d2;
                return null;
            }
            return null;
        }
        return null;
    }

    private float IIIlIII(float f) {
        return MathHelper.clamp((float)f, (float)-90.0f, (float)90.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIIlIIl(MinecraftClient minecraftClient, BlockHitResult blockHitResult) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockHitResult == null) return false;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return false;
        if (blockHitResult.getPos() == null) {
            return false;
        }
        BlockPos blockPos = blockHitResult.getBlockPos();
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (blockState == null) return false;
        if (blockState.isAir()) return false;
        if (blockState.isReplaceable()) {
            return false;
        }
        double d = Math.max(0.0, minecraftClient.player.getBlockInteractionRange() - 0.05);
        if (minecraftClient.player.getEyePos().squaredDistanceTo(blockHitResult.getPos()) <= d * d) return true;
        return false;
    }

    private Vec3d IIIlIlI(Vec3d vec3d, Box box) {
        if (vec3d == null || box == null) {
            return vec3d;
        }
        return new Vec3d(MathHelper.clamp((double)vec3d.x, (double)box.minX, (double)box.maxX), MathHelper.clamp((double)vec3d.y, (double)box.minY, (double)box.maxY), MathHelper.clamp((double)vec3d.z, (double)box.minZ, (double)box.maxZ));
    }

    private void IIIlIll() {
        this.IlIIIII = 0.0f;
        this.IlIIl = 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIIllII(int n) {
        int n2 = n;
        n2 ^= n2 << 13;
        n2 ^= n2 >>> 17;
        n2 ^= n2 << 5;
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIllIIllI IIIllIl(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = 12.88053f;
        float f8 = 1.0f;
        float f9 = f - f2;
        float f10 = -2.0f * f8 * f7 * f3 - f7 * f7 * f9;
        float f11 = f3 + f10 * f6;
        if (f4 > 0.0f) {
            f11 = MathHelper.clamp((float)f11, (float)(-f4), (float)f4);
        }
        float f12 = f11 * f6;
        if (f5 > 0.0f) {
            f12 = MathHelper.clamp((float)f12, (float)(-f5), (float)f5);
        }
        float f13 = f + f12;
        boolean bl = f2 - f > 0.0f == f13 > f2;
        if (!bl) return new IIllIIllI(f13, f11);
        if (!(Math.abs(f9) <= f5)) return new IIllIIllI(f13, f11);
        f13 = f2;
        return new IIllIIllI(f13, f11 *= 0.25f);
    }

    private static float IIIlllI(ThreadLocalRandom threadLocalRandom) {
        return (threadLocalRandom.nextFloat() + threadLocalRandom.nextFloat() + threadLocalRandom.nextFloat()) / 1.5f - 1.0f;
    }

    private float IIIllll(IlIlIlIl ilIlIlIl) {
        return ilIlIlIl.Ill().lIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    static float IIlIIII(float f, float f2) {
        if (f2 <= 1.0E-6f) return f;
        if (!Float.isFinite(f2)) return f;
        if (!Float.isFinite(f)) return f;
        if (f != 0.0f) {
            float f3 = (float)Math.floor(Math.abs(f) / f2 + 1.0E-4f);
            return Math.copySign(f3 * f2, f);
        }
        return f;
    }

    /*
     * Enabled aggressive block sorting
     */
    IlIlIIIlI IIlIIIl(MinecraftClient minecraftClient, LivingEntity livingEntity, lllllI lllllI2, boolean bl, boolean bl2, Vec3d vec3d, Vec3d vec3d2) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (livingEntity == null) return null;
        if (lllllI2 == null) return null;
        if (vec3d == null) return null;
        if (vec3d2 == null) {
            return null;
        }
        if (livingEntity == minecraftClient.player) return null;
        if (!livingEntity.isAlive()) return null;
        if (livingEntity.isRemoved()) return null;
        if (bl2 || !livingEntity.isInvisible()) {
            if (IIllllllI.II(livingEntity)) {
                return null;
            }
        } else {
            return null;
        }
        double d = vec3d2.lengthSquared();
        if (d <= 1.0E-6) {
            return null;
        }
        vec3d2 = vec3d2.multiply(1.0 / Math.sqrt(d));
        if (!orchard.internal.IlIlIlI.IIlllIl(vec3d)) return null;
        if (orchard.internal.IlIlIlI.IIlllIl(vec3d2)) {
            Vec3d vec3d3 = this.IIllIIl(minecraftClient, vec3d, vec3d2, livingEntity, lllllI2);
            if (orchard.internal.IlIlIlI.IIlllIl(vec3d3)) return this.IIllIll(minecraftClient, livingEntity, lllllI2, bl, vec3d, vec3d2, vec3d3);
            return null;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    float IIlIIlI(MinecraftClient minecraftClient, Vec3d vec3d) {
        if (minecraftClient == null) return Float.MAX_VALUE;
        if (minecraftClient.player == null) return Float.MAX_VALUE;
        if (vec3d != null) {
            Vec3d vec3d2 = minecraftClient.player.getEyePos();
            Vec3d vec3d3 = vec3d.subtract(vec3d2);
            double d = Math.sqrt(vec3d3.x * vec3d3.x + vec3d3.z * vec3d3.z);
            if (d <= 1.0E-4) {
                return 0.0f;
            }
            float f = (float)(Math.toDegrees(Math.atan2(vec3d3.z, vec3d3.x)) - 90.0);
            float f2 = this.IIIlIII((float)(-Math.toDegrees(Math.atan2(vec3d3.y, d))));
            float f3 = MathHelper.wrapDegrees((float)(f - minecraftClient.player.getYaw()));
            float f4 = f2 - this.IIIlIII(minecraftClient.player.getPitch());
            return (float)Math.hypot(f3, f4);
        }
        return Float.MAX_VALUE;
    }

    /*
     * Unable to fully structure code
     */
    private Vec3d IIlIIll(MinecraftClient var1_1, Vec3d var2_2, Vec3d var3_3, LivingEntity var4_4, Box var5_5, double var6_6, float var8_7) {
        block22: {
            block20: {
                block12: {
                    block21: {
                        block17: {
                            block14: {
                                block16: {
                                    block15: {
                                        block19: {
                                            block18: {
                                                block13: {
                                                    if (var1_1 == null) break block13;
                                                    break block18;
lbl3:
                                                    // 1 sources

                                                    while (true) {
                                                        var12_10 = var16_13;
                                                        break block12;
                                                        break;
                                                    }
lbl6:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var4_4 == null) break block13;
                                                        break block14;
lbl9:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                        break;
                                                    }
lbl11:
                                                    // 1 sources

                                                    while (var17_14 < var13_11) {
                                                        break block15;
                                                    }
                                                    break block12;
lbl14:
                                                    // 1 sources

                                                    return var11_9;
lbl16:
                                                    // 1 sources

                                                    while (true) {
                                                        if (this.IIIl(var1_1, var2_2, var3_3, var11_9, var9_8, var8_7)) {
                                                            ** continue;
                                                        }
                                                        break block16;
                                                        break;
                                                    }
                                                }
lbl21:
                                                // 5 sources

                                                return null;
                                            }
                                            if (var1_1.world == null) ** GOTO lbl21
                                            break block19;
lbl26:
                                            // 1 sources

                                            while (true) {
                                                var15_12 = this.IIlIlI(var2_2, var5_5).iterator();
                                                break block12;
                                                break;
                                            }
                                        }
                                        if (var2_2 == null) ** GOTO lbl21
                                        break block20;
                                    }
                                    var13_11 = var17_14;
                                    ** while (true)
                                }
                                var12_10 = null;
                                break block21;
lbl38:
                                // 1 sources

                                while (true) {
                                    break block17;
                                    break;
                                }
                            }
                            ** while (var5_5 != null)
lbl42:
                            // 1 sources

                            ** GOTO lbl21
                        }
                        var9_8 = var6_6 * var6_6;
                        var11_9 = this.lllIII(var2_2, var5_5);
                        ** while (true)
lbl47:
                        // 1 sources

                        while (true) {
                            var17_14 = var2_2.squaredDistanceTo(var16_13);
                            ** GOTO lbl11
                            break;
                        }
                    }
                    var13_11 = Infinity;
                    ** while (true)
                }
lbl54:
                // 2 sources

                while (var15_12.hasNext()) {
                    ** continue;
lbl56:
                    // 1 sources

                    ** GOTO lbl9
                }
                break block22;
            }
            if (var3_3 != null) ** break;
            ** while (true)
            ** while (true)
            var16_13 = var15_12.next();
            ** while (this.IIIl((MinecraftClient)var1_1, (Vec3d)var2_2, (Vec3d)var3_3, (Vec3d)var16_13, (double)var9_8, (float)var8_7))
lbl64:
            // 1 sources

            ** GOTO lbl54
        }
        return var12_10;
    }

    private static float IIlIlII(float f, float f2, float f3) {
        float f4 = MathHelper.clamp((float)((f3 - f) / (f2 - f)), (float)0.0f, (float)1.0f);
        return f4 * f4 * (3.0f - 2.0f * f4);
    }

    private float IIlIlIl(IlIlIlIl ilIlIlIl, float f) {
        float f2 = Math.abs(f);
        if (!(f2 <= 1.0E-4f)) {
            return Math.min(f2 * 0.018f, 0.035f) * ilIlIlIl.Ill().lIIl();
        }
        return 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    Vec3d IIlIllI(Vec3d vec3d, LivingEntity livingEntity, Box box) {
        ThreadLocalRandom threadLocalRandom;
        if (livingEntity == null) return vec3d;
        if (vec3d == null) {
            return vec3d;
        }
        --this.lIlllll;
        if (this.lIlllll <= 0) {
            threadLocalRandom = ThreadLocalRandom.current();
            Box box2 = livingEntity.getBoundingBox();
            float f = (float)((box2.maxX - box2.minX) * 0.5);
            float f2 = (float)(box2.maxY - box2.minY);
            this.IIllIII = orchard.internal.IlIlIlI.IIIlllI(threadLocalRandom) * f * 0.22f;
            this.IIIIIIII = orchard.internal.IlIlIlI.IIIlllI(threadLocalRandom) * f2 * 0.18f + 0.1f;
            this.llIlll = orchard.internal.IlIlIlI.IIIlllI(threadLocalRandom) * f * 0.22f;
            this.lIlllll = 2 + threadLocalRandom.nextInt(5);
        }
        threadLocalRandom = box == null ? livingEntity.getBoundingBox() : box;
        double d = MathHelper.clamp((double)(vec3d.x + (double)this.IIllIII), (double)((Box)threadLocalRandom).minX, (double)((Box)threadLocalRandom).maxX);
        double d2 = MathHelper.clamp((double)(vec3d.y + (double)this.IIIIIIII), (double)((Box)threadLocalRandom).minY, (double)((Box)threadLocalRandom).maxY);
        double d3 = MathHelper.clamp((double)(vec3d.z + (double)this.llIlll), (double)((Box)threadLocalRandom).minZ, (double)((Box)threadLocalRandom).maxZ);
        return new Vec3d(d, d2, d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    static float IIlIlll(float f) {
        if (!Float.isFinite(f)) {
            return f;
        }
        float f2 = MathHelper.wrapDegrees((float)f);
        if (!(Math.abs(f2) >= 179.999f)) return f2;
        if (f == 0.0f) return f2;
        return Math.copySign(Math.abs(f2), f);
    }

    private float IIllIII(IlIlIlIl ilIlIlIl) {
        if (ilIlIlIl.Il() != lllIIIII.l) {
            if (ilIlIlIl.Il() != lllIIIII.II) {
                float f = MathHelper.clamp((float)ilIlIlIl.IlI(), (float)0.0f, (float)200.0f);
                float f2 = f / 100.0f;
                return MathHelper.clamp((float)(1.01f - f2), (float)0.01f, (float)1.0f);
            }
        }
        return MathHelper.clamp((float)this.Il(0.14f, 0.01f, this.IllllI(ilIlIlIl)), (float)0.01f, (float)0.14f);
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Vec3d IIllIIl(MinecraftClient var1_1, Vec3d var2_2, Vec3d var3_3, LivingEntity var4_4, lllllI var5_5) {
        block46: {
            block44: {
                block37: {
                    block40: {
                        block32: {
                            block34: {
                                block42: {
                                    block31: {
                                        block29: {
                                            block39: {
                                                block43: {
                                                    block38: {
                                                        block33: {
                                                            block45: {
                                                                block36: {
                                                                    block28: {
                                                                        block35: {
                                                                            block30: {
                                                                                block41: {
                                                                                    break block41;
lbl1:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var11_10 = var16_14;
                                                                                        ** GOTO lbl7
                                                                                        break;
                                                                                    }
lbl4:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (!var5_5.Il()) break block28;
                                                                                        break block29;
lbl7:
                                                                                        // 5 sources

                                                                                        while (true) {
                                                                                            if (!var14_12.hasNext()) break block30;
                                                                                            break block31;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    }
lbl10:
                                                                                    // 1 sources

                                                                                    while (this.IIIlIl(var2_2, var4_4.getBoundingBox()) > var6_6 * var6_6) {
                                                                                        return null;
                                                                                    }
                                                                                    break block42;
lbl13:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        v0 = true;
                                                                                        break block32;
                                                                                        break;
                                                                                    }
lbl16:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var22_19 = (double)var19_17 + var24_20 * 1.8 + Math.sqrt(var20_18) * 1.1;
                                                                                        break block33;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var6_6 = var5_5.lII();
                                                                                var8_7 = Math.max(var5_5.II(), 0.5f);
                                                                                ** GOTO lbl10
lbl23:
                                                                                // 1 sources

                                                                                while (var5_5.Il()) {
                                                                                    break block34;
                                                                                }
                                                                                return var14_12;
lbl26:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    continue;
lbl28:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var14_12 = IIlllllIl.IllIIIl(var5_5.IlI(), var5_5.ll(), var5_5.l()).iterator();
                                                                                        ** GOTO lbl7
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                                while (true) {
                                                                                    break block35;
                                                                                    break;
                                                                                }
lbl33:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (!var5_5.ll()) break block36;
                                                                                    break block37;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            if (!orchard.internal.IlIlIlI.IIlllIl(var10_9)) {
                                                                                return null;
                                                                            }
                                                                            break block43;
                                                                        }
                                                                        var18_16 = var17_15.subtract(var2_2);
                                                                        break block44;
                                                                        var10_9 = null;
                                                                        break block45;
                                                                    }
lbl46:
                                                                    // 3 sources

                                                                    while (true) {
                                                                        if (orchard.internal.IlIlIlI.IIlllIl(var17_15)) ** continue;
                                                                        ** GOTO lbl7
                                                                        break;
                                                                    }
                                                                }
lbl50:
                                                                // 3 sources

                                                                while (true) {
                                                                    v0 = false;
                                                                    break block32;
                                                                    break;
                                                                }
lbl53:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (orchard.internal.IlIlIlI.IIlllIl(var14_12)) break block38;
                                                                    return var10_9;
                                                                }
lbl56:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (!var5_5.IlI()) ** GOTO lbl50
                                                                    ** continue;
                                                                    break;
                                                                }
lbl59:
                                                                // 1 sources

                                                                while (true) {
                                                                    break block39;
                                                                    break;
                                                                }
lbl61:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            var11_10 = null;
                                                            var12_11 = Infinity;
                                                            ** while (true)
lbl67:
                                                            // 1 sources

                                                            while (true) {
                                                                var22_19 = var20_18;
                                                                break block33;
                                                                break;
                                                            }
lbl70:
                                                            // 1 sources

                                                            while (true) {
                                                                var10_9 = var17_15;
                                                                ** continue;
                                                                break;
                                                            }
lbl73:
                                                            // 1 sources

                                                            while (true) {
                                                                var17_15 = this.IIllll(var1_1, var2_2, var3_3, var4_4, var16_14, var6_6, var8_7);
                                                                ** continue;
                                                                break;
                                                            }
lbl76:
                                                            // 1 sources

                                                            while (true) {
                                                                break block40;
                                                                break;
                                                            }
                                                        }
                                                        if (!(var22_19 < var12_11)) ** GOTO lbl7
                                                        break block46;
                                                    }
                                                    ** while (!(var2_2.squaredDistanceTo((Vec3d)var14_12) > var6_6 * var6_6))
lbl83:
                                                    // 1 sources

                                                    return var10_9;
lbl84:
                                                    // 1 sources

                                                    while (true) {
                                                        var14_12 = this.IIlIllI(var10_9, var4_4, var11_10);
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                ** while (!this.IlllI((MinecraftClient)var1_1, (LivingEntity)var4_4))
lbl89:
                                                // 1 sources

                                                ** while (true)
lbl90:
                                                // 1 sources

                                                while (true) {
                                                    var17_15 = this.IllI(var1_1, var2_2, var3_3, var4_4, var4_4.getBoundingBox(), var6_6, var8_7);
                                                    ** GOTO lbl46
                                                    break;
                                                }
                                            }
                                            var15_13 = var14_12.subtract(var2_2);
                                            if (!(this.IIIIIII(var3_3, (Vec3d)var15_13) > var8_7)) ** GOTO lbl23
                                            return var10_9;
lbl97:
                                            // 1 sources

                                            while (true) {
                                                var24_20 = Math.sqrt(this.lI(var2_2, var3_3, var17_15));
                                                ** continue;
                                                break;
                                            }
                                        }
                                        if (!orchard.internal.IlIlIlI.IIlllIl(var17_15)) ** break;
                                        ** while (true)
                                        ** while (true)
                                        this.lIlIlI();
                                        return var10_9;
                                    }
                                    var15_13 = var14_12.next();
                                    var16_14 = IIlllllIl.IlIllll(var4_4, var15_13);
                                    ** while (true)
                                }
                                ** while (!var5_5.IIl())
lbl112:
                                // 1 sources

                                return this.IlIII(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6, var8_7);
                            }
                            if (this.IIlIl(var1_1, var2_2, var14_12)) return var14_12;
                            return var10_9;
                        }
                        var9_8 = v0;
                        ** while (true)
                    }
                    var20_18 = var2_2.squaredDistanceTo(var17_15);
                    ** while (!var9_8)
lbl122:
                    // 1 sources

                    ** while (true)
                }
                if (var5_5.l()) ** break;
                ** while (true)
                ** while (true)
            }
            var19_17 = this.IIIIIII(var3_3, var18_16);
            ** while (!(var19_17 > var8_7))
lbl130:
            // 1 sources

            ** while (true)
        }
        var12_11 = var22_19;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIllIlI(MinecraftClient minecraftClient, IlIlIIIlI ilIlIIIlI) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (ilIlIIIlI == null) return false;
        if (minecraftClient.world.getEntityById(ilIlIIIlI.II()) instanceof LivingEntity) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIlIIIlI IIllIll(MinecraftClient minecraftClient, LivingEntity livingEntity, lllllI lllllI2, boolean bl, Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3) {
        IlIlIIIlI ilIlIIIlI;
        float f;
        double d;
        float f2;
        float f3;
        block6: {
            block7: {
                block4: {
                    block5: {
                        if (minecraftClient == null) return null;
                        if (minecraftClient.player == null) return null;
                        if (livingEntity == null) return null;
                        if (lllllI2 == null) return null;
                        if (!orchard.internal.IlIlIlI.IIlllIl(vec3d)) return null;
                        if (!orchard.internal.IlIlIlI.IIlllIl(vec3d2)) return null;
                        if (!orchard.internal.IlIlIlI.IIlllIl(vec3d3)) {
                            return null;
                        }
                        double d2 = lllllI2.lII();
                        double d3 = this.IIIlIl(vec3d, livingEntity.getBoundingBox());
                        if (d3 > d2 * d2) break block4;
                        Vec3d vec3d4 = vec3d3.subtract(vec3d);
                        double d4 = Math.sqrt(vec3d4.x * vec3d4.x + vec3d4.z * vec3d4.z);
                        if (d4 <= 1.0E-4) {
                            return null;
                        }
                        f3 = Math.max(lllllI2.II(), 0.5f);
                        f2 = this.IIIIIII(vec3d2, vec3d4);
                        if (f2 > f3) break block5;
                        double d5 = Math.sqrt(this.lI(vec3d, vec3d2, vec3d3));
                        d = (double)f2 + d5 * 1.8 + Math.sqrt(d3) * 1.1;
                        if (!bl) break block6;
                        break block7;
                    }
                    return null;
                }
                return null;
            }
            d -= 2.0;
        }
        float f4 = MathHelper.clamp((float)(f2 / Math.max(f3, 1.0f)), (float)0.0f, (float)1.0f);
        float f5 = (float)minecraftClient.player.getVelocity().horizontalLength();
        if (!Float.isFinite(f5) || f5 < 0.0f) {
            f5 = 0.0f;
        }
        if (!Float.isFinite(f = (float)livingEntity.getVelocity().horizontalLength()) || f < 0.0f) {
            f = 0.0f;
        }
        ilIlIIIlI(livingEntity.getId(), vec3d3, f4, d, f3, bl, f5, f, lllllI2.IIl());
        return ilIlIIIlI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIlIll IIlllII(float f, float f2, float f3) {
        if (f <= 0.0f) {
            return orchard.internal.lIIlIll.l;
        }
        float f4 = MathHelper.clamp((float)f3, (float)0.0f, (float)0.1f);
        this.IIlIllI = this.IIIlII(this.IIlIllI + f4 * this.IlIllIl * ((float)Math.PI * 2));
        this.IlllIII = this.IIIlII(this.IlllIII + f4 * this.IlIIIll * ((float)Math.PI * 2));
        float f5 = 0.35f + 0.65f * orchard.internal.IlIlIlI.IIlIlII(0.1f, 4.0f, f2);
        float f6 = 0.28f * f * f5;
        float f7 = (float)(Math.sin(this.IIlIllI) + Math.sin(this.IIlIllI * 0.47f + 1.3f) * (double)0.35f);
        float f8 = (float)(Math.sin(this.IlllIII) + Math.sin(this.IlllIII * 0.61f + 0.7f) * (double)0.28f);
        return new lIIlIll(f7 * f6, f8 * f6 * 0.72f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIlllIl(Vec3d vec3d) {
        if (vec3d == null) return false;
        if (!Double.isFinite(vec3d.x)) return false;
        if (!Double.isFinite(vec3d.y)) return false;
        if (Double.isFinite(vec3d.z)) return true;
        return false;
    }

    Vec3d IIllllI(Vec3d vec3d, LivingEntity livingEntity) {
        return this.IIlIllI(vec3d, livingEntity, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIlllll(IlIlIlIl ilIlIlIl, float f, float f2, float f3) {
        float f4 = Math.max(f, 0.005f);
        float f5 = this.IIllIII(ilIlIlIl);
        float f6 = f4 * 20.0f * (0.95f + (1.0f - f5) * 0.55f + f2 * 0.95f) * f3 * 1.45f * this.llIIII(ilIlIlIl) * ilIlIlIl.III();
        if (!this.lllIll(ilIlIlIl)) return f6;
        return f6 *= ilIlIlIl.Ill().lII();
    }

    private float IlIIIII(int n, int n2, int n3, float f, float f2) {
        float f3 = this.I(this.IIIllII(n * 53 + n3 * 29 + n2 * 5));
        return this.Il(f, f2, f3);
    }

    private float IlIIIIl(IlIlIlIl ilIlIlIl, IlIlIIIlI ilIlIIIlI, ThreadLocalRandom threadLocalRandom) {
        if (!this.lllIll(ilIlIlIl)) {
            return 0.06f + threadLocalRandom.nextFloat() * 0.105f;
        }
        if (!ilIlIIIlI.Il()) {
            return 0.014f + threadLocalRandom.nextFloat() * 0.038f;
        }
        return 0.01f + threadLocalRandom.nextFloat() * 0.026f;
    }

    public void IlIIIlI() {
        this.IlIIll();
        this.Illl();
    }

    private static int IlIIIll(int n, int n2) {
        return IIIIlIII[n ^ 0x28A47A57] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 263429335;
        byte[] byArray = "0>\\\fx\u0006|\u00f6\u008bD\u00cf\u0088\u00a2\u00eb^v\u001d(\u0096\u00d4yi>y;[H\u00f1\u0081\u008dls\u000f\u00e8\u008b\u001f\u00a0?\u00dd_E \u00fa\u00f4\u0088Tk\fz\u00e2\u009b?\u00a4\u000b8% @\u00c1\u00e5U\u00ea\u00b1\u0003\u001e\u00f2^\u00d9\u00be\\\u0015<t\u00e7\u00b0b\"\u00a8\u00df\u0005\u009e}\u00d1S".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        IIIIlIII = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            orchard.internal.IlIlIlI.IIIIlIII[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

