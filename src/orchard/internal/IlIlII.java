/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlII
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
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class IlIlII
extends Record {
    private final int I;
    private final double l;
    private final boolean II;
    private final double Il;

    public boolean I() {
        return this.II;
    }

    public IlIlII(double d, double d2, boolean bl, int n) {
        this.l = d;
        this.Il = d2;
        this.II = bl;
        this.I = n;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIlII.class, "provenanceSuspicion;behaviorSuspicion;rejected;teleportGraceTicks", "l", "Il", "II", "I"}, this, object);
    }

    public int l() {
        return this.I;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIlII.class, "provenanceSuspicion;behaviorSuspicion;rejected;teleportGraceTicks", "l", "Il", "II", "I"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIlII.class, "provenanceSuspicion;behaviorSuspicion;rejected;teleportGraceTicks", "l", "Il", "II", "I"}, this);
    }

    public double II() {
        return this.Il;
    }

    public double Il() {
        return this.l;
    }
}

