/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIIIl
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
final class lllIIIl
extends Record {
    private final float I;
    private final float l;
    private final Vec3d II;
    private final float Il;
    private final float lI;
    private final float ll;
    private final float III;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lllIIIl.class, "point;yaw;pitch;yawDelta;pitchDelta;rawYawDelta;rawPitchDelta", "II", "ll", "I", "lI", "l", "III", "Il"}, this, object);
    }

    public float I() {
        return this.III;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lllIIIl.class, "point;yaw;pitch;yawDelta;pitchDelta;rawYawDelta;rawPitchDelta", "II", "ll", "I", "lI", "l", "III", "Il"}, this);
    }

    public Vec3d l() {
        return this.II;
    }

    public float II() {
        return this.l;
    }

    public float Il() {
        return this.I;
    }

    public float lI() {
        return this.lI;
    }

    public float ll() {
        return this.Il;
    }

    public float III() {
        return this.ll;
    }

    private lllIIIl(Vec3d vec3d, float f, float f2, float f3, float f4, float f5, float f6) {
        this.II = vec3d;
        this.ll = f;
        this.I = f2;
        this.lI = f3;
        this.l = f4;
        this.III = f5;
        this.Il = f6;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lllIIIl.class, "point;yaw;pitch;yawDelta;pitchDelta;rawYawDelta;rawPitchDelta", "II", "ll", "I", "lI", "l", "III", "Il"}, this);
    }
}

