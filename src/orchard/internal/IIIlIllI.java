/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
 *   - III
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.util.math.Vec3d
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.Vec3d;

@Environment(value=EnvType.CLIENT)
final class IIIlIllI
extends Record {
    private final float I;
    private final float l;
    private final float II;
    private final float Il;
    private final Vec3d lI;
    private final float ll;
    private final float III;

    public float I() {
        return this.III;
    }

    public float l() {
        return this.ll;
    }

    public float II() {
        return this.I;
    }

    public float Il() {
        return this.Il;
    }

    public Vec3d lI() {
        return this.lI;
    }

    public float ll() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIlIllI.class, "point;yaw;pitch;yawDelta;pitchDelta;rawYawDelta;rawPitchDelta", "lI", "l", "I", "III", "II", "ll", "Il"}, this);
    }

    public float III() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIlIllI.class, "point;yaw;pitch;yawDelta;pitchDelta;rawYawDelta;rawPitchDelta", "lI", "l", "I", "III", "II", "ll", "Il"}, this, object);
    }

    private IIIlIllI(Vec3d vec3d, float f, float f2, float f3, float f4, float f5, float f6) {
        this.lI = vec3d;
        this.l = f;
        this.I = f2;
        this.III = f3;
        this.II = f4;
        this.ll = f5;
        this.Il = f6;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIlIllI.class, "point;yaw;pitch;yawDelta;pitchDelta;rawYawDelta;rawPitchDelta", "lI", "l", "I", "III", "II", "ll", "Il"}, this);
    }
}

