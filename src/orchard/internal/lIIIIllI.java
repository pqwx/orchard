/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIIllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
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
final class lIIIIllI
extends Record {
    private final boolean I;
    private final boolean l;
    private final double II;
    private final double Il;
    private final double lI;
    private final boolean ll;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIIIIllI.class, "moving;closeToEdge;safeToRelease;directionX;directionZ;distance", "l", "I", "ll", "Il", "II", "lI"}, this);
    }

    public boolean I() {
        return this.I;
    }

    public boolean l() {
        return this.ll;
    }

    lIIIIllI(boolean bl, boolean bl2, boolean bl3, double d, double d2, double d3) {
        this.l = bl;
        this.I = bl2;
        this.ll = bl3;
        this.Il = d;
        this.II = d2;
        this.lI = d3;
    }

    public double II() {
        return this.Il;
    }

    public boolean Il() {
        return this.l;
    }

    public double lI() {
        return this.lI;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIIIIllI.class, "moving;closeToEdge;safeToRelease;directionX;directionZ;distance", "l", "I", "ll", "Il", "II", "lI"}, this, object);
    }

    public double ll() {
        return this.II;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIIIIllI.class, "moving;closeToEdge;safeToRelease;directionX;directionZ;distance", "l", "I", "ll", "Il", "II", "lI"}, this);
    }

    static lIIIIllI III() {
        return new lIIIIllI(false, false, true, 0.0, 0.0, 0.0);
    }
}

