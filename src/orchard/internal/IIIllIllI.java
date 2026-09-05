/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllIllI
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
final class IIIllIllI
extends Record {
    private final double I;
    private final double l;
    private final long II;
    private final double Il;
    private final double lI;
    private final double ll;

    public double I() {
        return this.l;
    }

    public long l() {
        return this.II;
    }

    public double II() {
        return this.I;
    }

    private IIIllIllI(double d, double d2, double d3, double d4, double d5, long l2) {
        this.Il = d;
        this.ll = d2;
        this.I = d3;
        this.l = d4;
        this.lI = d5;
        this.II = l2;
    }

    public double Il() {
        return this.lI;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIllIllI.class, "x;y;width;height;distanceSq;updatedAtMs", "Il", "ll", "I", "l", "lI", "II"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIllIllI.class, "x;y;width;height;distanceSq;updatedAtMs", "Il", "ll", "I", "l", "lI", "II"}, this);
    }

    public double lI() {
        return this.ll;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIllIllI.class, "x;y;width;height;distanceSq;updatedAtMs", "Il", "ll", "I", "l", "lI", "II"}, this);
    }

    public double ll() {
        return this.Il;
    }
}

