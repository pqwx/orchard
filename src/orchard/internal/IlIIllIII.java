/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIllIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
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
final class IlIIllIII
extends Record {
    private final int I;
    private final Vec3d l;
    private final double II;
    private final double Il;
    private final float lI;
    private final double ll;
    private final double III;

    public Vec3d I() {
        return this.l;
    }

    public double l() {
        return this.III;
    }

    private IlIIllIII(int n, Vec3d vec3d, float f, double d, double d2, double d3, double d4) {
        this.I = n;
        this.l = vec3d;
        this.lI = f;
        this.Il = d;
        this.II = d2;
        this.III = d3;
        this.ll = d4;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIIllIII.class, "entityId;targetPos;angleFactor;score;distance;angularDistance;health", "I", "l", "lI", "Il", "II", "III", "ll"}, this, object);
    }

    public double II() {
        return this.ll;
    }

    public float Il() {
        return this.lI;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIIllIII.class, "entityId;targetPos;angleFactor;score;distance;angularDistance;health", "I", "l", "lI", "Il", "II", "III", "ll"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIIllIII.class, "entityId;targetPos;angleFactor;score;distance;angularDistance;health", "I", "l", "lI", "Il", "II", "III", "ll"}, this);
    }

    public double lI() {
        return this.Il;
    }

    public double ll() {
        return this.II;
    }

    public int III() {
        return this.I;
    }
}

