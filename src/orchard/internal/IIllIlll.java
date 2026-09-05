/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
 *   - equals
 *   - IIIl
 *   - IIlI
 *   - IIII
 *   - lIl
 *   - llI
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
import orchard.internal.IIIIIIl;
import orchard.internal.IIlIlllI;
import orchard.internal.IlIIlIll;

@Environment(value=EnvType.CLIENT)
public final class IIllIlll
extends Record {
    private final float I;
    private final float l;
    private final float II;
    private final IlIIlIll Il;
    private final float lI;
    private final float ll;
    private final float III;
    private final float IIl;
    private final float IlI;
    private final float Ill;
    private final float lII;
    private final float lIl;
    private final float llI;
    private final IIlIlllI lll;
    private final float IIII;
    private final IIIIIIl IIIl;
    private final float IIlI;

    public float I() {
        return this.llI;
    }

    public IlIIlIll l() {
        return this.Il;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIllIlll.class, "holdingMode;swingMode;swingCurve;equipSmoothing;swingStrength;swingRotationX;swingRotationY;swingRotationZ;spinSpeed;scale;xOffset;yOffset;zOffset;tilt;rotationX;rotationY;rotationZ", "IIIl", "lll", "Il", "lIl", "llI", "ll", "lI", "IlI", "lII", "IIlI", "II", "IIII", "Ill", "I", "III", "l", "IIl"}, this);
    }

    public float II(float f) {
        return this.Il.l(MathHelper.clamp((float)f, (float)0.0f, (float)1.0f));
    }

    public IIIIIIl Il() {
        return this.IIIl;
    }

    public float lI() {
        return this.lIl;
    }

    public float ll() {
        return this.III;
    }

    public float III() {
        return this.lI;
    }

    public float IIl(float f) {
        return this.Il.I(MathHelper.clamp((float)f, (float)0.0f, (float)1.0f));
    }

    public float IlI() {
        return this.ll;
    }

    public float Ill() {
        return this.II;
    }

    public float lII() {
        return this.IIlI;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIllIlll.class, "holdingMode;swingMode;swingCurve;equipSmoothing;swingStrength;swingRotationX;swingRotationY;swingRotationZ;spinSpeed;scale;xOffset;yOffset;zOffset;tilt;rotationX;rotationY;rotationZ", "IIIl", "lll", "Il", "lIl", "llI", "ll", "lI", "IlI", "lII", "IIlI", "II", "IIII", "Ill", "I", "III", "l", "IIl"}, this, object);
    }

    public float lIl() {
        return this.Ill;
    }

    public float llI() {
        return this.IIl;
    }

    public float lll() {
        return this.IIII;
    }

    public IIlIlllI IIII() {
        return this.lll;
    }

    public float IIIl() {
        return this.I;
    }

    public IIllIlll(IIIIIIl iIIIIIl, IIlIlllI iIlIlllI, IlIIlIll ilIIlIll, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        this.IIIl = iIIIIIl;
        this.lll = iIlIlllI;
        this.Il = ilIIlIll;
        this.lIl = f;
        this.llI = f2;
        this.ll = f3;
        this.lI = f4;
        this.IlI = f5;
        this.lII = f6;
        this.IIlI = f7;
        this.II = f8;
        this.IIII = f9;
        this.Ill = f10;
        this.I = f11;
        this.III = f12;
        this.l = f13;
        this.IIl = f14;
    }

    public float IIlI() {
        return this.IlI;
    }

    public float IIll() {
        return this.lII;
    }

    public float IlII() {
        return this.l;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIllIlll.class, "holdingMode;swingMode;swingCurve;equipSmoothing;swingStrength;swingRotationX;swingRotationY;swingRotationZ;spinSpeed;scale;xOffset;yOffset;zOffset;tilt;rotationX;rotationY;rotationZ", "IIIl", "lll", "Il", "lIl", "llI", "ll", "lI", "IlI", "lII", "IIlI", "II", "IIII", "Ill", "I", "III", "l", "IIl"}, this);
    }
}

