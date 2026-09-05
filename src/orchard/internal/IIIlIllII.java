/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
 *   - equals
 *   - IIII
 *   - IIlI
 *   - IlII
 *   - lIII
 *   - Illl
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

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.MathHelper;
import orchard.internal.IIlIIllII;
import orchard.internal.IlIlIlI;

@Environment(value=EnvType.CLIENT)
public final class IIIlIllII
extends Record {
    private final float I;
    private final float l;
    private final float II;
    private final float Il;
    private final float lI;
    private final float ll;
    private final float III;
    private final float IIl;
    private final float IlI;
    private final float Ill;
    private final float lII;
    private final float lIl;
    private final float llI;
    private final float lll;
    private final float IIII;
    private final float IIIl;
    private final float IIlI;
    private final float IIll;
    private final float IlII;
    private final float IlIl;
    private final float IllI;
    private final float Illl;
    private final float lIII;

    public float I() {
        return this.Il;
    }

    public float l() {
        return this.lIII;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIlIllII.class, "yawVarianceMin;yawVarianceMax;pitchVarianceMin;pitchVarianceMax;blendVarianceMin;blendVarianceMax;varianceDurationMin;varianceDurationMax;driftAmplitudeBlocks;driftFrequencyScale;stepJitterMultiplier;tremorMultiplier;twitchChanceMultiplier;twitchMagnitudeMultiplier;overshootMultiplier;microPauseChanceMultiplier;microPauseMinScale;microPauseMaxScale;microPauseDurationMultiplier;restTriggerChance;targetBlendMultiplier;smoothTimeScale;lockMultiplier", "IIII", "IIl", "IIlI", "lll", "IlII", "lIl", "Il", "lIII", "Illl", "IlIl", "lII", "I", "III", "IlI", "l", "IllI", "llI", "lI", "ll", "II", "Ill", "IIll", "IIIl"}, this);
    }

    static IIIlIllII II() {
        return new IIIlIllII(0.88f, 1.14f, 0.86f, 1.12f, 0.9f, 1.1f, 0.12f, 0.5f, 0.075f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.1f, 0.6f, 1.0f, 0.4f, 1.0f, 1.0f, 1.0f);
    }

    public float Il() {
        return this.Ill;
    }

    public float lI() {
        return this.IIl;
    }

    public float ll() {
        return this.IIlI;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static IIIlIllII III(float f, IIlIIllII iIlIIllII) {
        if (iIlIIllII != IIlIIllII.I) {
            return IIIlIllII.II();
        }
        float f2 = IlIlIlI.IlIlI(f);
        return new IIIlIllII(0.7f, 1.55f, 0.7f, 1.5f, 0.78f, 1.3f, 0.12f, 0.58f, 0.08f, 1.02f, 1.8f, 1.3f, 1.2f, 1.35f, IlIlIlI.lIlII(0.35f, 1.7f, f2), 0.36f, 0.46f, 0.82f, 0.68f, 0.08f, IlIlIlI.lIlII(1.45f, 2.15f, f2), IlIlIlI.lIlII(0.46f, 0.24f, f2), IlIlIlI.lIlII(1.35f, 2.85f, f2));
    }

    public float IIl() {
        return this.I;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIlIllII.class, "yawVarianceMin;yawVarianceMax;pitchVarianceMin;pitchVarianceMax;blendVarianceMin;blendVarianceMax;varianceDurationMin;varianceDurationMax;driftAmplitudeBlocks;driftFrequencyScale;stepJitterMultiplier;tremorMultiplier;twitchChanceMultiplier;twitchMagnitudeMultiplier;overshootMultiplier;microPauseChanceMultiplier;microPauseMinScale;microPauseMaxScale;microPauseDurationMultiplier;restTriggerChance;targetBlendMultiplier;smoothTimeScale;lockMultiplier", "IIII", "IIl", "IIlI", "lll", "IlII", "lIl", "Il", "lIII", "Illl", "IlIl", "lII", "I", "III", "IlI", "l", "IllI", "llI", "lI", "ll", "II", "Ill", "IIll", "IIIl"}, this);
    }

    /*
     * Enabled aggressive block sorting
     */
    public IIIlIllII(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, float f21, float f22, float f23) {
        f = IlIlIlI.IllIIl(f, 0.05f, 5.0f);
        f2 = IlIlIlI.IllIIl(Math.max(f2, f), f, 5.0f);
        f3 = IlIlIlI.IllIIl(f3, 0.05f, 5.0f);
        f4 = IlIlIlI.IllIIl(Math.max(f4, f3), f3, 5.0f);
        f5 = IlIlIlI.IllIIl(f5, 0.05f, 5.0f);
        f6 = IlIlIlI.IllIIl(Math.max(f6, f5), f5, 5.0f);
        f7 = IlIlIlI.IllIIl(f7, 0.02f, 5.0f);
        f8 = IlIlIlI.IllIIl(Math.max(f8, f7), f7, 5.0f);
        f9 = IlIlIlI.IllIIl(f9, 0.0f, 1.0f);
        f10 = IlIlIlI.IllIIl(f10, 0.0f, 8.0f);
        f11 = IlIlIlI.IllIIl(f11, 0.0f, 8.0f);
        f12 = IlIlIlI.IllIIl(f12, 0.0f, 8.0f);
        f13 = IlIlIlI.IllIIl(f13, 0.0f, 8.0f);
        f14 = IlIlIlI.IllIIl(f14, 0.0f, 8.0f);
        f15 = IlIlIlI.IllIIl(f15, 0.0f, 4.0f);
        f16 = IlIlIlI.IllIIl(f16, 0.0f, 8.0f);
        f17 = IlIlIlI.IllIIl(f17, 0.0f, 1.0f);
        f18 = IlIlIlI.IllIIl(Math.max(f18, f17), f17, 1.0f);
        f19 = IlIlIlI.IllIIl(f19, 0.0f, 8.0f);
        f20 = IlIlIlI.IllIIl(f20, 0.0f, 1.0f);
        f21 = IlIlIlI.IllIIl(f21, 0.0f, 8.0f);
        f22 = IlIlIlI.IllIIl(f22, 0.02f, 8.0f);
        f23 = IlIlIlI.IllIIl(f23, 0.05f, 24.0f);
        this.IIII = f;
        this.IIl = f2;
        this.IIlI = f3;
        this.lll = f4;
        this.IlII = f5;
        this.lIl = f6;
        this.Il = f7;
        this.lIII = f8;
        this.Illl = f9;
        this.IlIl = f10;
        this.lII = f11;
        this.I = f12;
        this.III = f13;
        this.IlI = f14;
        this.l = f15;
        this.IllI = f16;
        this.llI = f17;
        this.lI = f18;
        this.ll = f19;
        this.II = f20;
        this.Ill = f21;
        this.IIll = f22;
        this.IIIl = f23;
    }

    static IIIlIllII IlI() {
        return new IIIlIllII(1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    public float Ill() {
        return this.IlIl;
    }

    public float lII() {
        return this.IIIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static IIIlIllII lIl(float f, float f2, float f3) {
        IIIlIllII iIIlIllII;
        float f4 = MathHelper.clamp((float)f, (float)0.0f, (float)1.0f);
        float f5 = MathHelper.clamp((float)f2, (float)0.0f, (float)1.0f);
        float f6 = MathHelper.clamp((float)f3, (float)0.0f, (float)1.0f);
        float f7 = MathHelper.clamp((float)(0.24f + f4 * 0.46f + f5 * 0.2f + f6 * 0.1f), (float)0.2f, (float)1.0f);
        iIIlIllII(IlIlIlI.lIlII(0.88f, 0.76f, f7), IlIlIlI.lIlII(1.14f, 1.3f, f7), IlIlIlI.lIlII(0.9f, 0.8f, f7), IlIlIlI.lIlII(1.12f, 1.25f, f7), IlIlIlI.lIlII(0.9f, 0.82f, f7), IlIlIlI.lIlII(1.1f, 1.22f, f7), IlIlIlI.lIlII(0.16f, 0.1f, f7), IlIlIlI.lIlII(0.48f, 0.3f, f7), IlIlIlI.lIlII(0.018f, 0.048f, Math.max(f7, f5)), IlIlIlI.lIlII(0.78f, 1.22f, f7), IlIlIlI.lIlII(1.1f, 1.72f, f7), IlIlIlI.lIlII(0.82f, 1.18f, f6), IlIlIlI.lIlII(0.42f, 0.82f, f7), IlIlIlI.lIlII(0.48f, 0.9f, f7), IlIlIlI.lIlII(0.04f, 0.12f, f7), IlIlIlI.lIlII(0.12f, 0.28f, f7), 0.72f, 0.94f, 0.62f, 0.0f, IlIlIlI.lIlII(1.02f, 1.16f, f7), IlIlIlI.lIlII(1.04f, 0.94f, f7), 1.0f);
        return iIIlIllII;
    }

    public float llI() {
        return this.lll;
    }

    public float lll() {
        return this.ll;
    }

    public float IIII() {
        return this.IIII;
    }

    public float IIIl() {
        return this.lI;
    }

    public float IIlI() {
        return this.lIl;
    }

    public float IIll() {
        return this.IlI;
    }

    public float IlII() {
        return this.llI;
    }

    public float IlIl() {
        return this.IllI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static IIIlIllII IllI(float f) {
        IIIlIllII iIIlIllII;
        float f2 = IlIlIlI.lIII(f);
        iIIlIllII(0.7f, 1.55f, 0.7f, 1.5f, 0.78f, 1.3f, 0.12f, 0.58f, 0.08f, 1.02f, 1.8f, 1.3f, 1.2f, 1.35f, IlIlIlI.lIlII(0.35f, 1.7f, f2), 0.36f, 0.46f, 0.82f, 0.68f, 0.08f, IlIlIlI.lIlII(1.45f, 2.15f, f2), IlIlIlI.lIlII(0.46f, 0.24f, f2), IlIlIlI.lIlII(1.35f, 2.85f, f2));
        return iIIlIllII;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static IIIlIllII Illl(float f, float f2) {
        IIIlIllII iIIlIllII;
        IIIlIllII iIIlIllII2 = IIIlIllII.IllI(f);
        float f3 = MathHelper.clamp((float)f2, (float)0.0f, (float)1.0f);
        float f4 = MathHelper.clamp((float)((f - 500.0f) / 200.0f), (float)0.0f, (float)1.0f);
        float f5 = IlIlIlI.lIlII(iIIlIllII2.llII() * 0.72f, iIIlIllII2.llII() * 0.86f, f3);
        float f6 = IlIlIlI.lIlII(iIIlIllII2.lII() * 1.22f, iIIlIllII2.lII() * 1.36f, f3);
        iIIlIllII(IlIlIlI.lIlII(0.78f, 0.72f, f3), IlIlIlI.lIlII(1.32f, 1.42f, f3), IlIlIlI.lIlII(0.78f, 0.72f, f3), IlIlIlI.lIlII(1.3f, 1.38f, f3), IlIlIlI.lIlII(0.8f, 0.74f, f3), IlIlIlI.lIlII(1.28f, 1.36f, f3), IlIlIlI.lIlII(0.055f, 0.045f, f3), IlIlIlI.lIlII(0.32f, 0.24f, f3), 0.0f, IlIlIlI.lIlII(iIIlIllII2.Ill() * 1.18f, 1.58f, f3), IlIlIlI.lIlII(1.52f, 1.96f, f3), IlIlIlI.lIlII(0.86f, 1.08f, f3), IlIlIlI.lIlII(0.72f, 0.98f, f3), IlIlIlI.lIlII(0.78f, 1.04f, f3), IlIlIlI.lIlII(iIIlIllII2.llIl() * 0.55f, 0.28f, f3), IlIlIlI.lIlII(iIIlIllII2.IlIl(), 0.3f, f3), IlIlIlI.lIlII(iIIlIllII2.IlII(), 0.42f, f3), IlIlIlI.lIlII(iIIlIllII2.IIIl(), 0.82f, f3), IlIlIlI.lIlII(iIIlIllII2.lll(), 0.68f, f3), IlIlIlI.lIlII(iIIlIllII2.lIII(), 0.04f, f3), IlIlIlI.lIlII(iIIlIllII2.Il() * 1.34f, iIIlIllII2.Il() * 1.52f, f3), IlIlIlI.lIlII(f5, f5 * 0.84f, f4), IlIlIlI.lIlII(f6, f6 * 1.1f, f4));
        return iIIlIllII;
    }

    public float lIII() {
        return this.II;
    }

    public float lIIl() {
        return this.lII;
    }

    public float lIlI() {
        return this.IlII;
    }

    public float lIll() {
        return this.Illl;
    }

    public float llII() {
        return this.IIll;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIlIllII.class, "yawVarianceMin;yawVarianceMax;pitchVarianceMin;pitchVarianceMax;blendVarianceMin;blendVarianceMax;varianceDurationMin;varianceDurationMax;driftAmplitudeBlocks;driftFrequencyScale;stepJitterMultiplier;tremorMultiplier;twitchChanceMultiplier;twitchMagnitudeMultiplier;overshootMultiplier;microPauseChanceMultiplier;microPauseMinScale;microPauseMaxScale;microPauseDurationMultiplier;restTriggerChance;targetBlendMultiplier;smoothTimeScale;lockMultiplier", "IIII", "IIl", "IIlI", "lll", "IlII", "lIl", "Il", "lIII", "Illl", "IlIl", "lII", "I", "III", "IlI", "l", "IllI", "llI", "lI", "ll", "II", "Ill", "IIll", "IIIl"}, this, object);
    }

    public float llIl() {
        return this.l;
    }

    public float lllI() {
        return this.III;
    }
}

