/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIlIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - placePos;supportPos;hitPos
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
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

@Environment(value=EnvType.CLIENT)
final class lIIIlIIl
extends Record {
    private final Vec3d I;
    private final BlockPos l;
    private final BlockPos II;

    public BlockPos I() {
        return this.II;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIIIlIIl.class, "placePos;supportPos;hitPos", "II", "l", "I"}, this);
    }

    public BlockPos l() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIIIlIIl.class, "placePos;supportPos;hitPos", "II", "l", "I"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIIIlIIl.class, "placePos;supportPos;hitPos", "II", "l", "I"}, this);
    }

    public Vec3d II() {
        return this.I;
    }

    private lIIIlIIl(BlockPos blockPos, BlockPos blockPos2, Vec3d vec3d) {
        this.II = blockPos;
        this.l = blockPos2;
        this.I = vec3d;
    }
}

