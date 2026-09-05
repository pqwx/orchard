/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIllIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - x;y;width;height;color
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
final class IIlIIllIl
extends Record {
    private final double I;
    private final int l;
    private final double II;
    private final double Il;
    private final double lI;

    public double I() {
        return this.lI;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIlIIllIl.class, "x;y;width;height;color", "II", "lI", "Il", "I", "l"}, this);
    }

    public double l() {
        return this.I;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIlIIllIl.class, "x;y;width;height;color", "II", "lI", "Il", "I", "l"}, this, object);
    }

    private IIlIIllIl(double d, double d2, double d3, double d4, int n) {
        this.II = d;
        this.lI = d2;
        this.Il = d3;
        this.I = d4;
        this.l = n;
    }

    public double II() {
        return this.II;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIlIIllIl.class, "x;y;width;height;color", "II", "lI", "Il", "I", "l"}, this);
    }

    public double Il() {
        return this.Il;
    }

    public int lI() {
        return this.l;
    }
}

