/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - x;y;width;height
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
public record llIllII(double I, double l, double II, double Il) {
    private final double I;
    private final double l;
    private final double II;
    private final double Il;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{llIllII.class, "x;y;width;height", "Il", "I", "l", "II"}, this);
    }

    public double I() {
        return this.Il;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{llIllII.class, "x;y;width;height", "Il", "I", "l", "II"}, this, object);
    }

    public double l() {
        return this.II;
    }

    public double II() {
        return this.l;
    }

    public double Il() {
        return this.I;
    }

    public llIllII(double d, double d2, double d3, double d4) {
        this.Il = d;
        this.I = d2;
        this.l = d3;
        this.II = d4;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{llIllII.class, "x;y;width;height", "Il", "I", "l", "II"}, this);
    }
}

