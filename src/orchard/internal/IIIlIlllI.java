/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIlllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - x1;y1;x2;y2;color
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
final class IIIlIlllI
extends Record {
    private final int I;
    private final double l;
    private final double II;
    private final double Il;
    private final double lI;

    public double I() {
        return this.II;
    }

    private IIIlIlllI(double d, double d2, double d3, double d4, int n) {
        this.Il = d;
        this.II = d2;
        this.lI = d3;
        this.l = d4;
        this.I = n;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIlIlllI.class, "x1;y1;x2;y2;color", "Il", "II", "lI", "l", "I"}, this);
    }

    public double l() {
        return this.lI;
    }

    public double II() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIlIlllI.class, "x1;y1;x2;y2;color", "Il", "II", "lI", "l", "I"}, this, object);
    }

    public double Il() {
        return this.Il;
    }

    public int lI() {
        return this.I;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIlIlllI.class, "x1;y1;x2;y2;color", "Il", "II", "lI", "l", "I"}, this);
    }
}

