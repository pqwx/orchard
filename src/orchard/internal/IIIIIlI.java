/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIlI
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
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;

@Environment(value=EnvType.CLIENT)
public final class IIIIIlI
extends Record {
    private final double I;
    private final double l;
    private final long II;
    private final double Il;
    private final double lI;
    private final double ll;
    private static final double III = 0.1;

    public double I() {
        return this.ll;
    }

    public Vec3d l() {
        return new Vec3d(this.ll, this.l, this.lI);
    }

    public double II() {
        return this.Il;
    }

    public IIIIIlI(double d, double d2, double d3, long l2, double d4, double d5) {
        d4 = Math.max(0.1, d4);
        d5 = Math.max(0.1, d5);
        this.ll = d;
        this.l = d2;
        this.lI = d3;
        this.II = l2;
        this.Il = d4;
        this.I = d5;
    }

    public double Il() {
        return this.I;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIIIlI.class, "x;y;z;timestampMs;width;height", "ll", "l", "lI", "II", "Il", "I"}, this);
    }

    public IIIIIlI lI(IIIIIlI iIIIIlI, long l2) {
        if (iIIIIlI != null) {
            if (iIIIIlI.II != this.II) {
                double d = iIIIIlI.II - this.II;
                double d2 = Math.max(0.0, Math.min(1.0, (double)(l2 - this.II) / d));
                return new IIIIIlI(IIIIIlI.IIl(this.ll, iIIIIlI.ll, d2), IIIIIlI.IIl(this.l, iIIIIlI.l, d2), IIIIIlI.IIl(this.lI, iIIIIlI.lI, d2), l2, IIIIIlI.IIl(this.Il, iIIIIlI.Il, d2), IIIIIlI.IIl(this.I, iIIIIlI.I, d2));
            }
        }
        return this;
    }

    public Box ll() {
        double d = this.Il * 0.5;
        return new Box(this.ll - d, this.l, this.lI - d, this.ll + d, this.l + this.I, this.lI + d);
    }

    public double III() {
        return this.l;
    }

    private static double IIl(double d, double d2, double d3) {
        return d + (d2 - d) * d3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIIIlI.class, "x;y;z;timestampMs;width;height", "ll", "l", "lI", "II", "Il", "I"}, this);
    }

    public long IlI() {
        return this.II;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIIIlI.class, "x;y;z;timestampMs;width;height", "ll", "l", "lI", "II", "Il", "I"}, this, object);
    }

    public double Ill() {
        return this.lI;
    }
}

