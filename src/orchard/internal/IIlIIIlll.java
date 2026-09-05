/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - rows;width;height
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
import java.util.List;
import orchard.internal.lIIIIIll;

public final class IIlIIIlll
extends Record {
    private final double I;
    private final double l;
    private final List<lIIIIIll> II;

    public double I() {
        return this.I;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIlIIIlll.class, "rows;width;height", "II", "l", "I"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIlIIIlll.class, "rows;width;height", "II", "l", "I"}, this, object);
    }

    public double l() {
        return this.l;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIlIIIlll.class, "rows;width;height", "II", "l", "I"}, this);
    }

    public IIlIIIlll(List<lIIIIIll> list, double d, double d2) {
        this.II = list;
        this.l = d;
        this.I = d2;
    }

    public List<lIIIIIll> II() {
        return this.II;
    }

    private static IIlIIIlll Il() {
        return new IIlIIIlll(List.of(), 0.0, 0.0);
    }
}

