/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIlIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - entity;pos;distanceSq
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.util.math.Vec3d
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

@Environment(value=EnvType.CLIENT)
record lIIlIII(Entity I, Vec3d l, double II) {
    private final Entity I;
    private final Vec3d l;
    private final double II;

    public double I() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIIlIII.class, "entity;pos;distanceSq", "I", "l", "II"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIIlIII.class, "entity;pos;distanceSq", "I", "l", "II"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIIlIII.class, "entity;pos;distanceSq", "I", "l", "II"}, this);
    }

    public Entity l() {
        return this.I;
    }

    public Vec3d II() {
        return this.l;
    }
}

