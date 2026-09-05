/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIlIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - x;y;width;height
 *   - hashCode
 *   - toString
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

public record lIIlIlII(double I, double l, double II, double Il) {
    private final double I;
    private final double l;
    private final double II;
    private final double Il;

    public double I() {
        return this.II;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIIlIlII.class, "x;y;width;height", "Il", "l", "II", "I"}, this);
    }

    public double l() {
        return this.Il;
    }

    public double II() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIIlIlII.class, "x;y;width;height", "Il", "l", "II", "I"}, this, object);
    }

    public double Il() {
        return this.I;
    }

    public lIIlIlII(double d, double d2, double d3, double d4) {
        this.Il = d;
        this.l = d2;
        this.II = d3;
        this.I = d4;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIIlIlII.class, "x;y;width;height", "Il", "l", "II", "I"}, this);
    }
}

