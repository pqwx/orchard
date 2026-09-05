/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIllllI
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
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class IlIllllI
extends Record {
    private final double I;
    private final double l;
    private final double II;
    private final double Il;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIllllI.class, "x1;y1;x2;y2", "II", "I", "l", "Il"}, this, object);
    }

    public double I() {
        return this.I;
    }

    public double l() {
        return this.Il;
    }

    public double II() {
        return this.l;
    }

    private static IlIllllI Il(double d, double d2, double d3, double d4) {
        return new IlIllllI(Math.min(d, d3), Math.min(d2, d4), Math.max(d, d3), Math.max(d2, d4));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private IlIllllI lI(IlIllllI ilIllllI) {
        return new IlIllllI(Math.max(this.II, ilIllllI.II), Math.max(this.I, ilIllllI.I), Math.min(this.l, ilIllllI.l), Math.min(this.Il, ilIllllI.Il));
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIllllI.class, "x1;y1;x2;y2", "II", "I", "l", "Il"}, this);
    }

    private IlIllllI(double d, double d2, double d3, double d4) {
        this.II = d;
        this.I = d2;
        this.l = d3;
        this.Il = d4;
    }

    public double ll() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIllllI.class, "x1;y1;x2;y2", "II", "I", "l", "Il"}, this);
    }
}

