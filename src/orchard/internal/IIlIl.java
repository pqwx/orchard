/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
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
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;

@Environment(value=EnvType.CLIENT)
final class IIlIl
extends Record {
    private final Vec3d I;
    private final Direction l;
    private final double II;
    private final Vec3d Il;
    private final BlockPos lI;
    private final BlockPos ll;

    public Vec3d I() {
        return this.I;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIlIl.class, "pos;hitPos;supportPos;clickFace;raycastPos;distanceSq", "lI", "I", "ll", "l", "Il", "II"}, this);
    }

    public Direction l() {
        return this.l;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Vec3d II() {
        Vec3d vec3d;
        block2: {
            block1: {
                if (this.Il == null) break block1;
                break block2;
            }
            vec3d = this.I;
            return vec3d;
        }
        vec3d = this.Il;
        return vec3d;
    }

    public BlockPos Il() {
        return this.ll;
    }

    public double lI() {
        return this.II;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIlIl.class, "pos;hitPos;supportPos;clickFace;raycastPos;distanceSq", "lI", "I", "ll", "l", "Il", "II"}, this, object);
    }

    private IIlIl(BlockPos blockPos, Vec3d vec3d, BlockPos blockPos2, Direction direction, Vec3d vec3d2, double d) {
        this.lI = blockPos;
        this.I = vec3d;
        this.ll = blockPos2;
        this.l = direction;
        this.Il = vec3d2;
        this.II = d;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIlIl.class, "pos;hitPos;supportPos;clickFace;raycastPos;distanceSq", "lI", "I", "ll", "l", "Il", "II"}, this);
    }

    public BlockPos ll() {
        return this.lI;
    }

    public Vec3d III() {
        return this.Il;
    }
}

