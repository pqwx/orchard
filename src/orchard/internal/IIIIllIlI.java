/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIllIlI
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
final class IIIIllIlI
extends Record {
    private final double I;
    private final double l;
    private final BlockPos II;

    public double I() {
        return this.l;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIIllIlI.class, "pos;occupancy;projectedDistanceSquared", "II", "I", "l"}, this);
    }

    public double l() {
        return this.I;
    }

    public BlockPos II() {
        return this.II;
    }

    private IIIIllIlI(BlockPos blockPos, double d, double d2) {
        this.II = blockPos;
        this.I = d;
        this.l = d2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIIllIlI.class, "pos;occupancy;projectedDistanceSquared", "II", "I", "l"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIIllIlI.class, "pos;occupancy;projectedDistanceSquared", "II", "I", "l"}, this, object);
    }
}

