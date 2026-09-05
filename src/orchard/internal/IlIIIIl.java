/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - points;hit;hitEntity
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
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.Vec3d;

@Environment(value=EnvType.CLIENT)
final class IlIIIIl
extends Record {
    private final Entity I;
    private final boolean l;
    private final List<Vec3d> II;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIIIIl.class, "points;hit;hitEntity", "II", "l", "I"}, this);
    }

    private IlIIIIl(List<Vec3d> list, boolean bl, Entity entity) {
        this.II = list;
        this.l = bl;
        this.I = entity;
    }

    public Entity I() {
        return this.I;
    }

    public boolean l() {
        return this.l;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIIIIl.class, "points;hit;hitEntity", "II", "l", "I"}, this);
    }

    public List<Vec3d> II() {
        return this.II;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIIIIl.class, "points;hit;hitEntity", "II", "l", "I"}, this, object);
    }
}

