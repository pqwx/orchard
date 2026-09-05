/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIllIllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - x;y;w;h;click;scroll
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
import orchard.internal.IIIIlIII;
import orchard.internal.lllIlIlI;

@Environment(value=EnvType.CLIENT)
final class IlIllIllI
extends Record {
    private final lllIlIlI I;
    private final double l;
    private final double II;
    private final double Il;
    private final IIIIlIII lI;
    private final double ll;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIllIllI.class, "x;y;w;h;click;scroll", "l", "II", "Il", "ll", "lI", "I"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIllIllI.class, "x;y;w;h;click;scroll", "l", "II", "Il", "ll", "lI", "I"}, this, object);
    }

    public lllIlIlI I() {
        return this.I;
    }

    public IIIIlIII l() {
        return this.lI;
    }

    /*
     * Enabled aggressive block sorting
     */
    boolean II(double d, double d2) {
        if (!(d >= this.l)) return false;
        if (!(d <= this.l + this.Il)) return false;
        if (!(d2 >= this.II)) return false;
        if (!(d2 <= this.II + this.ll)) return false;
        return true;
    }

    public double Il() {
        return this.l;
    }

    public double lI() {
        return this.Il;
    }

    private IlIllIllI(double d, double d2, double d3, double d4, IIIIlIII iIIIlIII, lllIlIlI lllIlIlI2) {
        this.l = d;
        this.II = d2;
        this.Il = d3;
        this.ll = d4;
        this.lI = iIIIlIII;
        this.I = lllIlIlI2;
    }

    public double ll() {
        return this.ll;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIllIllI.class, "x;y;w;h;click;scroll", "l", "II", "Il", "ll", "lI", "I"}, this);
    }

    public double III() {
        return this.II;
    }
}

