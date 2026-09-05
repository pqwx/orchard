/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIl
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
record IllIl(double I, double l, double II, double Il) {
    private final double l;
    private final double Il;

    private IllIl(double d, double d2, double d3, double d4) {
        this.l = d;
        this.I = d2;
        this.Il = d3;
        this.II = d4;
    }

    public double l() {
        return this.Il;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IllIl.class, "x;y;width;height", "l", "I", "Il", "II"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IllIl.class, "x;y;width;height", "l", "I", "Il", "II"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IllIl.class, "x;y;width;height", "l", "I", "Il", "II"}, this, object);
    }

    public double Il() {
        return this.l;
    }
}

