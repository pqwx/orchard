/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIIII
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
import orchard.internal.IlIIIl;

@Environment(value=EnvType.CLIENT)
record IIllIIII(Vec3d I, Vec3d l, IlIIIl II) {
    private final Vec3d l;
    private final IlIIIl II;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIllIIII.class, "position;initialVelocity;spec", "l", "I", "II"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIllIIII.class, "position;initialVelocity;spec", "l", "I", "II"}, this);
    }

    public IlIIIl l() {
        return this.II;
    }

    public Vec3d II() {
        return this.l;
    }

    private IIllIIII(Vec3d vec3d, Vec3d vec3d2, IlIIIl ilIIIl) {
        this.l = vec3d;
        this.I = vec3d2;
        this.II = ilIIIl;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIllIIII.class, "position;initialVelocity;spec", "l", "I", "II"}, this, object);
    }
}

