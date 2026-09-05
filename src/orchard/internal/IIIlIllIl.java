/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIllIl
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
final class IIIlIllIl
extends Record {
    private final double I;
    private final double l;
    private final double II;
    private final double Il;
    private final double lI;
    private final double ll;
    private final double III;

    IIIlIllIl I(double d, double d2, double d3, double d4) {
        return new IIIlIllIl(d, d2, d3, d4, this.ll, this.II, this.Il);
    }

    public double l() {
        return this.Il;
    }

    public double II() {
        return this.I;
    }

    public double Il() {
        return this.lI;
    }

    public double lI() {
        return this.III;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIlIllIl.class, "x;y;width;height;distanceSq;healthPercent;alpha", "I", "III", "l", "lI", "ll", "II", "Il"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIlIllIl.class, "x;y;width;height;distanceSq;healthPercent;alpha", "I", "III", "l", "lI", "ll", "II", "Il"}, this);
    }

    public double ll() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIlIllIl.class, "x;y;width;height;distanceSq;healthPercent;alpha", "I", "III", "l", "lI", "ll", "II", "Il"}, this, object);
    }

    public double III() {
        return this.II;
    }

    private IIIlIllIl(double d, double d2, double d3, double d4, double d5, double d6, double d7) {
        this.I = d;
        this.III = d2;
        this.l = d3;
        this.lI = d4;
        this.ll = d5;
        this.II = d6;
        this.Il = d7;
    }

    public double IIl() {
        return this.ll;
    }
}

