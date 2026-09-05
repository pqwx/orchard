/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.I
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
 *  net.minecraft.util.math.BlockPos
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.BlockPos;

@Environment(value=EnvType.CLIENT)
record I(BlockPos I, double l, double II) {
    private final BlockPos I;
    private final double l;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{I.class, "pos;occupancy;projectedDistanceSquared", "I", "II", "l"}, this);
    }

    private I(BlockPos blockPos, double d, double d2) {
        this.I = blockPos;
        this.II = d;
        this.l = d2;
    }

    public double I() {
        return this.l;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{I.class, "pos;occupancy;projectedDistanceSquared", "I", "II", "l"}, this);
    }

    public BlockPos l() {
        return this.I;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{I.class, "pos;occupancy;projectedDistanceSquared", "I", "II", "l"}, this, object);
    }
}

