/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
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
public record IIlIlII(double I, double l, double II, double lI, double ll, double III) {
    private final double l;
    private final double II;
    private static final IIlIlII Il = new IIlIlII(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    private final double lI;
    private final double ll;
    private final double III;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean l() {
        if (!(this.lI > 0.0)) return false;
        if (!(this.II > 0.0)) return false;
        return true;
    }

    public double II() {
        return this.l;
    }

    public double Il() {
        return this.III;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIlIlII.class, "x;y;width;height;radius;stroke", "ll", "l", "lI", "II", "III", "I"}, this, object);
    }

    public double lI() {
        return this.ll;
    }

    public double ll() {
        return this.lI;
    }

    public IIlIlII(double d, double d2, double d3, double d4, double d5, double d6) {
        this.ll = d;
        this.l = d2;
        this.lI = d3;
        this.II = d4;
        this.III = d5;
        this.I = d6;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIlIlII.class, "x;y;width;height;radius;stroke", "ll", "l", "lI", "II", "III", "I"}, this);
    }

    public double III() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIlIlII.class, "x;y;width;height;radius;stroke", "ll", "l", "lI", "II", "III", "I"}, this);
    }
}

