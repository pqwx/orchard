/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllllIIl
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
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.internal;

import java.util.SplittableRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.internal.IIIlII;
import orchard.internal.IlIlIlI;
import orchard.internal.lIIlIl;
import orchard.internal.lIIlIll;

@Environment(value=EnvType.CLIENT)
final class IllllIIl {
    private float I;
    private float l;
    private float II;
    private static final float Il = 0.35f;
    private static final float lI = 0.10000001f;
    private final float[] ll;
    private final lIIlIl III;
    private final float IIl;
    private float IlI;
    private static final float Ill = 0.3f;
    private static final float lII = 0.22f;
    private static final float lIl = 0.125f;
    private int llI;
    private static final double lll = 0.025;
    private static final int IIII = 6;
    private float IIIl;
    private float IIlI;
    private final float IIll;
    private float IlII;
    private static final float IlIl = 2.1f;
    private float IllI;
    private static final float Illl = 0.105f;
    private float lIII;
    private static final float lIIl = 0.22f;
    private float lIlI;
    private static final float lIll = 2.4f;
    private float llII;
    private static final float llIl = 0.185f;
    private float lllI;
    private static final float llll = 0.22f;
    private static final float IIIII = 0.55f;
    private final float[] IIIIl;
    private final float IIIlI;
    private float IIIll;
    private static final float IIlII = 0.9f;
    private final int IIlIl;
    private static final long IIllI = -7046029254386353131L;
    private static final float IIlll = 0.25f;
    private float IlIII;
    private static final float IlIIl = 0.016666668f;
    private int IlIlI;
    private float IlIll;
    private static final float IllII = 1.3f;
    private static final float IllIl = 0.15f;
    private final float IlllI;
    private static final float Illll = 0.045f;
    private static final float lIIII = 0.85f;
    private static final float lIIIl = 0.018f;
    private final SplittableRandom lIIlI;
    private float lIIll;
    private static final float lIlII = 0.3f;
    private float lIlIl;
    private float lIllI;
    private float lIlll;
    private final float llIII;
    private final lIIlIl llIIl = new lIIlIl();
    private float llIlI;
    private final float llIll;
    private float lllII;
    private static final float lllIl = 0.72f;
    private final float llllI;
    private boolean lllll;
    private static final float IIIIII = 3.0f;
    private static final float IIIIIl = 1.1f;
    private float IIIIlI = 1.0f;
    private static final float IIIIll = 0.45f;
    private final float IIIlII;
    private float IIIlIl;
    private static final int[] IIIllI;

    /*
     * Enabled aggressive block sorting
     */
    private static float I(float f, float f2, float f3, float f4) {
        float f5 = f4 <= 1.0E-4f ? 1.0f : MathHelper.clamp((float)(f3 / f4), (float)0.0f, (float)1.0f);
        float f6 = f5 * f5 * (3.0f - 2.0f * f5);
        return MathHelper.lerp((float)f6, (float)f, (float)f2);
    }

    float l(float f) {
        return this.lIl(true) * f * this.IIIIlI;
    }

    private float II(float f, float f2) {
        return f + this.lIIlI.nextFloat() * (f2 - f);
    }

    float Il(float f, float f2) {
        return this.Ill(this.llIIl, f, f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    lIIlIll lI(float f, float f2) {
        if (f <= 0.0f) {
            return lIIlIll.l;
        }
        float f3 = 0.35f + 0.65f * IlIlIlI.IIlIlII(0.1f, 4.0f, f2);
        float f4 = 0.3f * f * f3;
        float f5 = (float)Math.tanh(this.lIlll) * f4;
        float f6 = (float)Math.tanh(this.lIII) * f4 * 0.72f;
        return new lIIlIll(f5, f6);
    }

    float ll(int n) {
        return this.IIIIl[n];
    }

    /*
     * Enabled aggressive block sorting
     */
    void III(float f, float f2, float f3) {
        float f4 = MathHelper.clamp((float)(Float.isFinite(f) ? f : 0.0f), (float)0.0f, (float)0.10000001f);
        this.lIlI = Math.min(this.lIlI + f4, 0.10000001f);
        this.IIIIlI = MathHelper.clamp((float)(f4 / 0.016666668f), (float)0.25f, (float)3.0f);
        this.IllI = 0.0f;
        this.lIlIl = 0.0f;
        this.llI = 0;
        this.IlIlI = 0;
        int n = 0;
        while (this.lIlI >= 0.016666668f && n < 6) {
            this.lIIl(0.016666668f, f2, f3);
            this.lIlI -= 0.016666668f;
            ++n;
        }
        return;
    }

    float IIl(float f) {
        return this.lIl(false) * f * this.IIIIlI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI(float f, float f2, float f3, lIIlIl lIIlIl2) {
        lIIlIl2.Il += f;
        int n = 0;
        while (lIIlIl2.Il >= lIIlIl2.I && n < 32) {
            lIIlIl2.Il -= lIIlIl2.I;
            lIIlIl2.l = lIIlIl2.II;
            lIIlIl2.II = this.IIlI();
            lIIlIl2.I = MathHelper.lerp((float)MathHelper.clamp((float)f2, (float)0.02f, (float)5.0f), (float)MathHelper.clamp((float)f3, (float)f2, (float)5.0f), (float)this.lII());
            ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private float Ill(lIIlIl lIIlIl2, float f, float f2) {
        float f3 = lIIlIl2.I;
        float f4 = !(f3 <= 1.0E-4f) ? MathHelper.clamp((float)(lIIlIl2.Il / f3), (float)0.0f, (float)1.0f) : 1.0f;
        float f5 = f4 * f4 * (3.0f - 2.0f * f4);
        float f6 = IllllIIl.IllI(lIIlIl2.l, f, f2);
        float f7 = IllllIIl.IllI(lIIlIl2.II, f, f2);
        return MathHelper.lerp((float)f5, (float)f6, (float)f7);
    }

    private float lII() {
        return this.lIIlI.nextFloat();
    }

    /*
     * Enabled aggressive block sorting
     */
    private float lIl(boolean bl) {
        float f;
        if (this.llI > 0) {
            float f2 = !bl ? this.lIlIl : this.IllI;
            return f2 / (float)this.llI;
        }
        if (!bl) {
            f = this.IlI;
            return f;
        }
        f = this.IIIll;
        return f;
    }

    /*
     * Enabled aggressive block sorting
     */
    Vec3d llI(Vec3d vec3d, Vec3d vec3d2, Box box, boolean bl) {
        Vec3d vec3d3;
        double d;
        Vec3d vec3d4;
        float f;
        if (vec3d == null) return null;
        if (vec3d2 == null) return null;
        if (box == null) {
            return null;
        }
        float f2 = bl ? 0.0f : this.II;
        double d2 = Math.hypot(f2, f = !bl ? this.llIlI : MathHelper.clamp((float)this.llIlI, (float)-0.22f, (float)0.22f));
        if (d2 <= 1.0E-6) {
            return vec3d2;
        }
        if (d2 > (double)0.55f) {
            float f3 = (float)((double)0.55f / d2);
            f2 *= f3;
            f *= f3;
        }
        Vec3d vec3d5 = vec3d2.subtract(vec3d);
        double d3 = Math.sqrt(vec3d5.x * vec3d5.x + vec3d5.z * vec3d5.z);
        double d4 = vec3d5.length();
        if (d3 <= 1.0E-4) return null;
        if (d4 <= 1.0E-4) return null;
        if (!IlIlIlI.IIlllIl(vec3d5)) {
            return null;
        }
        if (bl) {
            double d5 = Math.tan(Math.toRadians(f)) * d3;
            vec3d4 = new Vec3d(vec3d2.x, vec3d2.y + d5, vec3d2.z);
        } else {
            float f4 = (float)(Math.toDegrees(Math.atan2(vec3d5.z, vec3d5.x)) - 90.0) + f2;
            float f5 = MathHelper.clamp((float)((float)(-Math.toDegrees(Math.atan2(vec3d5.y, d3))) + f), (float)-89.9f, (float)89.9f);
            double d6 = Math.toRadians(f4);
            d = Math.toRadians(f5);
            double d7 = Math.cos(d);
            vec3d4 = vec3d.add(new Vec3d(-Math.sin(d6) * d7, -Math.sin(d), Math.cos(d6) * d7).multiply(d4));
        }
        if (!IlIlIlI.IIlllIl(vec3d4)) {
            return null;
        }
        Box box2 = IlIlIlI.IIlll(box, 0.025);
        vec3d3(MathHelper.clamp((double)vec3d4.x, (double)box2.minX, (double)box2.maxX), MathHelper.clamp((double)vec3d4.y, (double)box2.minY, (double)box2.maxY), MathHelper.clamp((double)vec3d4.z, (double)box2.minZ, (double)box2.maxZ));
        Vec3d vec3d6 = vec3d3;
        Vec3d vec3d7 = vec3d5.normalize();
        Vec3d vec3d8 = vec3d6.subtract(vec3d).normalize();
        d = Math.toDegrees(Math.acos(MathHelper.clamp((double)vec3d8.dotProduct(vec3d7), (double)-1.0, (double)1.0)));
        if (!Double.isFinite(d)) return vec3d2;
        if (!(d > 0.5501000119209289)) return vec3d6;
        return vec3d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    float[] lll(float f, float f2, float f3) {
        float f4 = MathHelper.clamp((float)(f / 120.0f), (float)0.0f, (float)1.0f);
        float f5 = 0.6f + 0.4f * f4 * f4;
        float f6 = IllllIIl.I(this.I, this.lllII, this.IIIl, this.IlIll) * f2 * 1.35f * f5 * this.IIIIlI;
        float f7 = IllllIIl.I(this.lIllI, this.lllI, this.lIIll, this.IlIII) * f2 * 1.1f * MathHelper.clamp((float)f3, (float)0.35f, (float)1.0f) * f5 * this.IIIIlI;
        return new float[]{f6, f7};
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIII() {
        double d = (double)0.55f * Math.sqrt(Math.max(0.0, this.lIIlI.nextDouble()));
        double d2 = Math.PI * 2 * this.lIIlI.nextDouble();
        this.IIlI = (float)(d * Math.cos(d2));
        this.IlII = (float)(d * Math.sin(d2));
    }

    float IIIl(int n) {
        return this.ll[n];
    }

    private IIIlII IIlI() {
        return new IIIlII(this.lIIlI.nextInt(3), this.lIIlI.nextFloat(), this.lIIlI.nextFloat());
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIll() {
        if (this.lllll) {
            this.lllll = false;
            return this.llII;
        }
        double d = Math.max(1.0E-12, this.lIIlI.nextDouble());
        double d2 = this.lIIlI.nextDouble();
        double d3 = Math.sqrt(-2.0 * Math.log(d));
        double d4 = Math.PI * 2 * d2;
        this.llII = (float)(Math.sin(d4) * d3);
        this.lllll = true;
        return (float)(Math.cos(d4) * d3);
    }

    int IlII() {
        return this.IIlIl;
    }

    private float IlIl() {
        return this.lIIlI.nextFloat() * 2.0f - 1.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static float IllI(IIIlII iIIlII, float f, float f2) {
        float f3;
        float f4 = IlIlIlI.lIlII(f, 0.992f, 0.72f);
        float f5 = IlIlIlI.lIlII(1.008f, f2, 0.28f);
        switch (iIIlII.l()) {
            case 0: {
                f3 = IlIlIlI.lIlII(f, f4, iIIlII.II());
                return f3;
            }
            case 1: {
                f3 = IlIlIlI.lIlII(f5, f2, iIIlII.II());
                return f3;
            }
        }
        f3 = IlIlIlI.lIlII(f4, f5, iIIlII.II());
        return f3;
    }

    /*
     * Enabled aggressive block sorting
     */
    float Illl() {
        if (this.IIll <= 1.0E-4f) return 1.0f;
        if (this.l >= this.IIll) {
            return 1.0f;
        }
        float f = MathHelper.clamp((float)(this.l / this.IIll), (float)0.0f, (float)1.0f);
        float f2 = f * f * (3.0f - 2.0f * f);
        return 0.15f + 0.85f * f2;
    }

    /*
     * Enabled aggressive block sorting
     */
    IllllIIl(long l2, int n) {
        this.III = new lIIlIl();
        this.ll = new float[6];
        this.IIIIl = new float[6];
        this.lIIlI = new SplittableRandom(l2 ^ (long)n * -7046029254386353131L);
        this.IIlIl = n;
        this.IIIlI = this.II(1.3f, 2.4f);
        this.llllI = this.II(1.1f, 2.1f);
        this.IIl = this.II(-0.3f, 0.3f);
        this.llIll = (float)Math.sqrt(Math.max(0.0, 1.0 - (double)(this.IIl * this.IIl)));
        this.IIIlII = (float)Math.sqrt(2.0 * (double)this.IIIlI) * 0.85f;
        this.llIII = (float)Math.sqrt(2.0 * (double)this.llllI) * 0.85f;
        this.llIIl.l = this.IIlI();
        this.llIIl.II = this.IIlI();
        this.llIIl.I = this.lII();
        this.III.l = this.IIlI();
        this.III.II = this.IIlI();
        this.III.I = this.lII();
        this.I = this.IlIl();
        this.lllII = this.IlIl();
        this.IlIll = this.II(0.125f, 0.22f);
        this.lIllI = this.IlIl();
        this.lllI = this.IlIl();
        this.IlIII = this.II(0.105f, 0.185f);
        this.IlllI = this.II(0.22f, 0.45f);
        this.IIIlIl = this.II(0.35f, 0.9f);
        this.IIII();
        this.IIll = this.II(0.018f, 0.045f);
    }

    float lIII(float f, float f2) {
        return this.Ill(this.III, f, f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIl(float f, float f2, float f3) {
        this.IlI(f, f2, f3, this.llIIl);
        this.IlI(f, f2, f3, this.III);
        float f4 = (float)Math.sqrt(f);
        float f5 = this.IIll();
        float f6 = this.IIl * f5 + this.llIll * this.IIll();
        this.lIlll += -this.IIIlI * this.lIlll * f + this.IIIlII * f4 * f5;
        this.lIII += -this.llllI * this.lIII * f + this.llIII * f4 * f6;
        if (!Float.isFinite(this.lIlll)) {
            this.lIlll = 0.0f;
        }
        if (!Float.isFinite(this.lIII)) {
            this.lIII = 0.0f;
        }
        this.IIIl += f;
        if (this.IIIl >= this.IlIll) {
            this.IIIl -= this.IlIll;
            this.I = this.lllII;
            this.lllII = this.IlIl();
            this.IlIll = this.II(0.125f, 0.22f);
        }
        this.lIIll += f;
        if (this.lIIll >= this.IlIII) {
            this.lIIll -= this.IlIII;
            this.lIllI = this.lllI;
            this.lllI = this.IlIl();
            this.IlIII = this.II(0.105f, 0.185f);
        }
        this.IIIll = this.IlIl();
        this.IlI = this.IlIl();
        this.IllI += this.IIIll;
        this.lIlIl += this.IlI;
        ++this.llI;
        if (this.IlIlI < 6) {
            this.ll[this.IlIlI] = this.IIIll;
            this.IIIIl[this.IlIlI] = this.IlI;
        }
        ++this.IlIlI;
        this.IIIlIl -= f;
        if (this.IIIlIl <= 0.0f) {
            this.IIIlIl += this.II(0.35f, 0.9f);
            this.IIII();
        }
        float f7 = 1.0f - (float)Math.exp(-f / this.IlllI);
        this.II += (this.IIlI - this.II) * f7;
        this.llIlI += (this.IlII - this.llIlI) * f7;
        this.l = Math.min(this.l + f, this.IIll);
    }

    int lIlI() {
        return this.IlIlI;
    }

    private static int lIll(int n, int n2) {
        return IIIllI[n ^ 0x40A37EA1] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -188620147;
        byte[] byArray = "I\u00d6}\u00ee\u00a8\u00b5]S\u00f4R\u001a0q\u00f0\u00cd`\u009b\u0096V\u00c9".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        IIIllI = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IllllIIl.IIIllI[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

