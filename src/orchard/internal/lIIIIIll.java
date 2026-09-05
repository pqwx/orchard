/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
 *   - III
 *   - IIl
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import orchard.internal.IlIIlIII;

public final class lIIIIIll
extends Record {
    private final String I;
    private final boolean l;
    private final double II;
    private final double Il;
    private final double lI;
    private final double ll;
    private final double III;
    private final int IIl;

    public double I() {
        return this.ll;
    }

    public lIIIIIll(String string, boolean bl, double d, double d2, double d3, double d4, double d5, int n) {
        this.I = string;
        this.l = bl;
        this.III = d;
        this.II = d2;
        this.Il = d3;
        this.ll = d4;
        this.lI = d5;
        this.IIl = n;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIIIIIll.class, "key;active;visibility;easedVisibility;y;width;targetWidth;rank", "I", "l", "III", "II", "Il", "ll", "lI", "IIl"}, this);
    }

    public boolean l() {
        return this.l;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIIIIIll.class, "key;active;visibility;easedVisibility;y;width;targetWidth;rank", "I", "l", "III", "II", "Il", "ll", "lI", "IIl"}, this);
    }

    public int II() {
        return this.IIl;
    }

    public double Il() {
        return this.II;
    }

    public String lI() {
        return this.I;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIIIIIll.class, "key;active;visibility;easedVisibility;y;width;targetWidth;rank", "I", "l", "III", "II", "Il", "ll", "lI", "IIl"}, this, object);
    }

    public double ll(double d, double d2) {
        return (IlIIlIII.ll(d) + IlIIlIII.ll(d2)) * this.II;
    }

    public double III() {
        return this.lI;
    }

    public double IIl() {
        return this.III;
    }

    public double IlI() {
        return this.Il;
    }
}

