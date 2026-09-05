/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
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
public final class lIIIIIl
extends Record {
    private final float I;
    private final float l;
    private final float II;
    private final float Il;
    private final Vec3d lI;

    public float I() {
        return this.I;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIIIIIl.class, "point;rawYaw;rawPitch;rawYawDelta;rawPitchDelta", "lI", "l", "I", "II", "Il"}, this);
    }

    public lIIIIIl(Vec3d vec3d, float f, float f2, float f3, float f4) {
        this.lI = vec3d;
        this.l = f;
        this.I = f2;
        this.II = f3;
        this.Il = f4;
    }

    public float l() {
        return this.l;
    }

    public Vec3d II() {
        return this.lI;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIIIIIl.class, "point;rawYaw;rawPitch;rawYawDelta;rawPitchDelta", "lI", "l", "I", "II", "Il"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIIIIIl.class, "point;rawYaw;rawPitch;rawYawDelta;rawPitchDelta", "lI", "l", "I", "II", "Il"}, this);
    }

    public float Il() {
        return this.Il;
    }

    public float lI() {
        return this.II;
    }
}

