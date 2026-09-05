/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIlllll
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
record lIIlllll(double I, double l, double II, double Il) {
    private final double I;
    private final double l;
    private final double Il;

    public double I() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIIlllll.class, "minX;minY;maxX;maxY", "II", "Il", "I", "l"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIIlllll.class, "minX;minY;maxX;maxY", "II", "Il", "I", "l"}, this);
    }

    public double l() {
        return this.Il;
    }

    public double Il() {
        return this.I;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIIlllll.class, "minX;minY;maxX;maxY", "II", "Il", "I", "l"}, this);
    }

    private lIIlllll(double d, double d2, double d3, double d4) {
        this.II = d;
        this.Il = d2;
        this.I = d3;
        this.l = d4;
    }
}

