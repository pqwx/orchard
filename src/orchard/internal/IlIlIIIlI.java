/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
 *   - III
 *   - IIl
 *   - IlI
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
public final class IlIlIIIlI
extends Record {
    private final float I;
    private final double l;
    private final boolean II;
    private final float Il;
    private final Vec3d lI;
    private final float ll;
    private final int III;
    private final float IIl;
    private final boolean IlI;

    public boolean I() {
        return this.IlI;
    }

    IlIlIIIlI(int n, Vec3d vec3d, float f, double d, float f2) {
        this(n, vec3d, f, d, f2, false, 0.0f, 0.0f, false);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIlIIIlI.class, "entityId;targetPos;angleFactor;score;fovRadiusDegrees;trackedTarget;selfHorizontalSpeed;targetHorizontalSpeed;stableUpperBody", "III", "lI", "IIl", "l", "ll", "II", "I", "Il", "IlI"}, this);
    }

    public Vec3d l() {
        return this.lI;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIlIIIlI.class, "entityId;targetPos;angleFactor;score;fovRadiusDegrees;trackedTarget;selfHorizontalSpeed;targetHorizontalSpeed;stableUpperBody", "III", "lI", "IIl", "l", "ll", "II", "I", "Il", "IlI"}, this);
    }

    public int II() {
        return this.III;
    }

    public boolean Il() {
        return this.II;
    }

    public float lI() {
        return this.Il;
    }

    public float ll() {
        return this.IIl;
    }

    public float III() {
        return this.ll;
    }

    public IlIlIIIlI(int n, Vec3d vec3d, float f, double d, float f2, boolean bl, float f3, float f4, boolean bl2) {
        this.III = n;
        this.lI = vec3d;
        this.IIl = f;
        this.l = d;
        this.ll = f2;
        this.II = bl;
        this.I = f3;
        this.Il = f4;
        this.IlI = bl2;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIlIIIlI.class, "entityId;targetPos;angleFactor;score;fovRadiusDegrees;trackedTarget;selfHorizontalSpeed;targetHorizontalSpeed;stableUpperBody", "III", "lI", "IIl", "l", "ll", "II", "I", "Il", "IlI"}, this, object);
    }

    IlIlIIIlI(int n, Vec3d vec3d, float f, double d, float f2, boolean bl) {
        this(n, vec3d, f, d, f2, bl, 0.0f, 0.0f, false);
    }

    static IlIlIIIlI IIl(int n, Vec3d vec3d) {
        if (vec3d == null) {
            return null;
        }
        return new IlIlIIIlI(n, vec3d, 0.0f, 0.0, 360.0f, false, 0.0f, 0.0f, true);
    }

    public float IlI() {
        return this.I;
    }

    public double Ill() {
        return this.l;
    }
}

