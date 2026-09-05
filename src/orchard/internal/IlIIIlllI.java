/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIlllI
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
record IlIIIlllI(double I, double l, double II, double Il) {
    private final double I;
    private final double II;
    private final double Il;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIIIlllI.class, "x;y;w;h", "II", "Il", "I", "l"}, this, object);
    }

    private IlIIIlllI(double d, double d2, double d3, double d4) {
        this.II = d;
        this.Il = d2;
        this.I = d3;
        this.l = d4;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIIIlllI.class, "x;y;w;h", "II", "Il", "I", "l"}, this);
    }

    public double I() {
        return this.Il;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIIIlllI.class, "x;y;w;h", "II", "Il", "I", "l"}, this);
    }

    public double II() {
        return this.I;
    }

    public double Il() {
        return this.II;
    }
}

