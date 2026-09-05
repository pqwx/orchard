/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - value;velocity
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

record IlllIIll(double I, double l) {
    private final double I;
    private final double l;

    public double I() {
        return this.l;
    }

    public double l() {
        return this.I;
    }

    private IlllIIll(double d, double d2) {
        this.l = d;
        this.I = d2;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlllIIll.class, "value;velocity", "l", "I"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlllIIll.class, "value;velocity", "l", "I"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlllIIll.class, "value;velocity", "l", "I"}, this);
    }
}

