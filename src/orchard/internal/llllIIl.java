/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllIIl
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
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.BlockPos;

@Environment(value=EnvType.CLIENT)
final class llllIIl
extends Record {
    private final BlockPos I;
    private final float l;
    private final float II;
    private final BlockPos Il;

    public BlockPos I() {
        return this.Il;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{llllIIl.class, "firePos;railPos;shotYaw;shotPitch", "I", "Il", "II", "l"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{llllIIl.class, "firePos;railPos;shotYaw;shotPitch", "I", "Il", "II", "l"}, this);
    }

    public float l() {
        return this.l;
    }

    private llllIIl(BlockPos blockPos, BlockPos blockPos2, float f, float f2) {
        this.I = blockPos;
        this.Il = blockPos2;
        this.II = f;
        this.l = f2;
    }

    public BlockPos II() {
        return this.I;
    }

    public float Il() {
        return this.II;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{llllIIl.class, "firePos;railPos;shotYaw;shotPitch", "I", "Il", "II", "l"}, this, object);
    }
}

