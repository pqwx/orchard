/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIllIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - minX;minY;maxX;maxY
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
public record lIIllIl(double I, double l, double II, double Il) {
    private final double I;
    private final double II;
    private final double Il;

    public double I() {
        return this.Il;
    }

    public lIIllIl(double d, double d2, double d3, double d4) {
        this.Il = d;
        this.l = d2;
        this.II = d3;
        this.I = d4;
    }

    public double II() {
        return (this.Il + this.II) * 0.5;
    }

    public double Il() {
        return this.I;
    }

    public double lI() {
        return this.I - this.l;
    }

    public double ll() {
        return this.II - this.Il;
    }

    public double III() {
        return this.II;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIIllIl.class, "minX;minY;maxX;maxY", "Il", "l", "II", "I"}, this);
    }

    public double IIl() {
        return (this.l + this.I) * 0.5;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIIllIl.class, "minX;minY;maxX;maxY", "Il", "l", "II", "I"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIIllIl.class, "minX;minY;maxX;maxY", "Il", "l", "II", "I"}, this, object);
    }
}

