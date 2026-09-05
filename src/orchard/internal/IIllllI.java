/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllllI
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
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import orchard.internal.IIlIIllI;

public final class IIllllI
extends Record {
    private final boolean I;
    private final int l;
    private final IIlIIllI II;
    private final double Il;
    private final double lI;
    private final double ll;

    public IIlIIllI I() {
        return this.II;
    }

    public IIllllI(IIlIIllI iIlIIllI, boolean bl, double d, double d2, double d3, int n) {
        this.II = iIlIIllI;
        this.I = bl;
        this.ll = d;
        this.Il = d2;
        this.lI = d3;
        this.l = n;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIllllI.class, "viability;stunSlamOpportunity;primary;secondary;tertiary;stableId", "II", "I", "ll", "Il", "lI", "l"}, this);
    }

    public boolean l() {
        return this.I;
    }

    public double II() {
        return this.Il;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIllllI.class, "viability;stunSlamOpportunity;primary;secondary;tertiary;stableId", "II", "I", "ll", "Il", "lI", "l"}, this);
    }

    public double Il() {
        return this.ll;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIllllI.class, "viability;stunSlamOpportunity;primary;secondary;tertiary;stableId", "II", "I", "ll", "Il", "lI", "l"}, this, object);
    }

    public int lI() {
        return this.l;
    }

    public double ll() {
        return this.lI;
    }
}

