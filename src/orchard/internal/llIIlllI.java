/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIlllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - minX;maxX;minY;maxY;count
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
final class llIIlllI
extends Record {
    private final double I;
    private final int l;
    private final double II;
    private final double Il;
    private final double lI;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{llIIlllI.class, "minX;maxX;minY;maxY;count", "lI", "I", "II", "Il", "l"}, this, object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean I() {
        if (this.l <= 0) return false;
        if (!(this.I > this.lI)) return false;
        if (!(this.Il > this.II)) return false;
        return true;
    }

    public double l() {
        return this.I;
    }

    public int II() {
        return this.l;
    }

    private llIIlllI(double d, double d2, double d3, double d4, int n) {
        this.lI = d;
        this.I = d2;
        this.II = d3;
        this.Il = d4;
        this.l = n;
    }

    public double Il() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{llIIlllI.class, "minX;maxX;minY;maxY;count", "lI", "I", "II", "Il", "l"}, this);
    }

    public double lI() {
        return this.lI;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{llIIlllI.class, "minX;maxX;minY;maxY;count", "lI", "I", "II", "Il", "l"}, this);
    }

    public double ll() {
        return this.Il;
    }
}

