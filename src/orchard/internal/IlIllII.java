/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIllII
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
 *  net.minecraft.util.math.MathHelper
 */
package orchard.internal;

import java.util.SplittableRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.MathHelper;

@Environment(value=EnvType.CLIENT)
final class IlIllII {
    private float I;
    private static final float l = (float)Math.PI * 2;
    private float II;
    private float Il;
    private float lI;
    private float ll = 4.5f;
    private float III = 2.7f;
    private float IIl;
    private float IlI;
    private SplittableRandom Ill = new SplittableRandom();

    /*
     * Enabled aggressive block sorting
     */
    void I(long l2) {
        SplittableRandom splittableRandom = new SplittableRandom(l2);
        this.Ill = splittableRandom;
        this.IlI = splittableRandom.nextFloat();
        this.IIl = splittableRandom.nextFloat() * 2.0f - 1.0f;
        this.II = splittableRandom.nextFloat() * 2.0f - 1.0f;
        this.I = splittableRandom.nextFloat();
        this.Il = splittableRandom.nextFloat() * 2.0f - 1.0f;
        this.lI = splittableRandom.nextFloat() * 2.0f - 1.0f;
        this.III = 4.6f + splittableRandom.nextFloat() * 3.4f;
        this.ll = 5.4f + splittableRandom.nextFloat() * 4.2f;
    }

    /*
     * Enabled aggressive block sorting
     */
    float[] l(float f, float f2, float f3, float f4) {
        float f5 = Math.max(0.0f, Math.min(f, 0.1f));
        this.IlI += f5 * this.III;
        while (this.IlI >= 1.0f) {
            this.IlI -= 1.0f;
            this.IIl = this.II;
            this.II = this.Ill.nextFloat() * 2.0f - 1.0f;
        }
        this.I += f5 * this.ll;
        while (true) {
            if (!(this.I >= 1.0f)) {
                float f6 = this.IlI;
                float f7 = f6 * f6 * (3.0f - 2.0f * f6);
                float f8 = MathHelper.lerp((float)f7, (float)this.IIl, (float)this.II);
                float f9 = this.I;
                float f10 = f9 * f9 * (3.0f - 2.0f * f9);
                float f11 = MathHelper.lerp((float)f10, (float)this.Il, (float)this.lI);
                float f12 = MathHelper.clamp((float)(f2 / 120.0f), (float)0.0f, (float)1.0f);
                float f13 = 0.6f + 0.4f * f12 * f12;
                float f14 = f3 * 1.35f * f13;
                float f15 = f3 * 1.1f * MathHelper.clamp((float)f4, (float)0.35f, (float)1.0f) * f13;
                return new float[]{f8 * f14, f11 * f15};
            }
            this.I -= 1.0f;
            this.Il = this.lI;
            this.lI = this.Ill.nextFloat() * 2.0f - 1.0f;
        }
    }

    float[] II(float f, float f2, float f3) {
        return this.l(f, f2, f3, 0.65f);
    }

    void Il() {
        this.I(System.nanoTime());
    }

    /*
     * Enabled aggressive block sorting
     */
    IlIllII() {
        this.I(System.nanoTime());
    }
}

