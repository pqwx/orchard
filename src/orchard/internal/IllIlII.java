/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
 *   - III
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record IllIlII(double I, double l, double II, double Il, double lI, double III) {
    private final double I;
    private final double l;
    private final double II;
    private final double Il;
    private final double lI;
    private static final IllIlII ll = new IllIlII(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    private final double III;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IllIlII.class, "x;y;width;height;radius;stroke", "Il", "II", "I", "lI", "III", "l"}, this);
    }

    public double I() {
        return this.l;
    }

    public IllIlII(double d, double d2, double d3, double d4, double d5, double d6) {
        this.Il = d;
        this.II = d2;
        this.I = d3;
        this.lI = d4;
        this.III = d5;
        this.l = d6;
    }

    public double l() {
        return this.III;
    }

    public double II() {
        return this.lI;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IllIlII.class, "x;y;width;height;radius;stroke", "Il", "II", "I", "lI", "III", "l"}, this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Il() {
        if (!(this.I > 0.0)) return false;
        if (!(this.lI > 0.0)) return false;
        return true;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IllIlII.class, "x;y;width;height;radius;stroke", "Il", "II", "I", "lI", "III", "l"}, this, object);
    }

    public double lI() {
        return this.Il;
    }

    public double ll() {
        return this.I;
    }

    public double III() {
        return this.II;
    }
}

