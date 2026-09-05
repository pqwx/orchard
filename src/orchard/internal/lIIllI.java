/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - position;shouldFlush
 *   - hashCode
 *   - toString
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
final class lIIllI
extends Record {
    private final boolean I;
    private final Vec3d l;

    public boolean I() {
        return this.I;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIIllI.class, "position;shouldFlush", "l", "I"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIIllI.class, "position;shouldFlush", "l", "I"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIIllI.class, "position;shouldFlush", "l", "I"}, this);
    }

    private lIIllI(Vec3d vec3d, boolean bl) {
        this.l = vec3d;
        this.I = bl;
    }

    public Vec3d l() {
        return this.l;
    }
}

