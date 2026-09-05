/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIllII
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
final class IIIIIllII
extends Record {
    private final BlockPos I;
    private final BlockHitResult l;
    private final BlockPos II;
    private final Vec3d Il;

    public Vec3d I() {
        return this.Il;
    }

    private IIIIIllII(BlockPos blockPos, BlockPos blockPos2, Vec3d vec3d, BlockHitResult blockHitResult) {
        this.II = blockPos;
        this.I = blockPos2;
        this.Il = vec3d;
        this.l = blockHitResult;
    }

    public BlockPos l() {
        return this.I;
    }

    public BlockHitResult II() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIIIllII.class, "placePos;supportPos;faceCenter;hitResult", "II", "I", "Il", "l"}, this, object);
    }

    public BlockPos Il() {
        return this.II;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIIIllII.class, "placePos;supportPos;faceCenter;hitResult", "II", "I", "Il", "l"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIIIllII.class, "placePos;supportPos;faceCenter;hitResult", "II", "I", "Il", "l"}, this);
    }
}

