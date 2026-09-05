/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlIIl
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
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Vec3d
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;

@Environment(value=EnvType.CLIENT)
final class llIlIIl
extends Record {
    private final BlockPos I;
    private final BlockHitResult l;
    private final Vec3d II;
    private final BlockPos Il;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{llIlIIl.class, "placePos;supportPos;aimPos;hitResult", "I", "Il", "II", "l"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{llIlIIl.class, "placePos;supportPos;aimPos;hitResult", "I", "Il", "II", "l"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{llIlIIl.class, "placePos;supportPos;aimPos;hitResult", "I", "Il", "II", "l"}, this);
    }

    private llIlIIl(BlockPos blockPos, BlockPos blockPos2, Vec3d vec3d, BlockHitResult blockHitResult) {
        this.I = blockPos;
        this.Il = blockPos2;
        this.II = vec3d;
        this.l = blockHitResult;
    }

    public Vec3d I() {
        return this.II;
    }

    public BlockPos l() {
        return this.I;
    }

    public BlockHitResult II() {
        return this.l;
    }

    public BlockPos Il() {
        return this.Il;
    }
}

