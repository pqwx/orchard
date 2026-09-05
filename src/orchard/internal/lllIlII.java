/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - dx;dz;player
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
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
record lllIlII(double I, double l, boolean II) {
    private final double I;
    private final double l;
    private final boolean II;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lllIlII.class, "dx;dz;player", "l", "I", "II"}, this);
    }

    public boolean I() {
        return this.II;
    }

    public double l() {
        return this.I;
    }

    private lllIlII(double d, double d2, boolean bl) {
        this.l = d;
        this.I = d2;
        this.II = bl;
    }

    public double II() {
        return this.l;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lllIlII.class, "dx;dz;player", "l", "I", "II"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lllIlII.class, "dx;dz;player", "l", "I", "II"}, this, object);
    }
}

