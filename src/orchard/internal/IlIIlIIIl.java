/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIlIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - width;height;scaleX;scaleY
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
final class IlIIlIIIl
extends Record {
    private final int I;
    private final double l;
    private final int II;
    private final double Il;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIIlIIIl.class, "width;height;scaleX;scaleY", "II", "I", "l", "Il"}, this, object);
    }

    public int I() {
        return this.II;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIIlIIIl.class, "width;height;scaleX;scaleY", "II", "I", "l", "Il"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIIlIIIl.class, "width;height;scaleX;scaleY", "II", "I", "l", "Il"}, this);
    }

    double l(double d) {
        return this.l > 0.0 ? d / this.l : d;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    double II(double d) {
        double d2;
        block1: {
            if (!(this.Il > 0.0)) break block1;
            d2 = d / this.Il;
            return d2;
        }
        d2 = d;
        return d2;
    }

    public double Il() {
        return this.l;
    }

    private IlIIlIIIl(int n, int n2, double d, double d2) {
        this.II = n;
        this.I = n2;
        this.l = d;
        this.Il = d2;
    }

    public double lI() {
        return this.Il;
    }

    public int ll() {
        return this.I;
    }
}

