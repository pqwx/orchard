/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIl
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
import orchard.internal.IIllllIll;

@Environment(value=EnvType.CLIENT)
final class IlIIIl
extends Record {
    private final IIllllIll I;
    private final double l;
    private final double II;
    private final double Il;
    private final double lI;
    private final boolean ll;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIIIl.class, "gravity;drag;waterDrag;underwaterGravity;hasWaterCollision;order", "II", "l", "Il", "lI", "ll", "I"}, this);
    }

    public boolean I() {
        return this.ll;
    }

    public double l() {
        return this.Il;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIIIl.class, "gravity;drag;waterDrag;underwaterGravity;hasWaterCollision;order", "II", "l", "Il", "lI", "ll", "I"}, this);
    }

    private IlIIIl(double d, double d2, double d3, double d4, boolean bl, IIllllIll iIllllIll) {
        this.II = d;
        this.l = d2;
        this.Il = d3;
        this.lI = d4;
        this.ll = bl;
        this.I = iIllllIll;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIIIl.class, "gravity;drag;waterDrag;underwaterGravity;hasWaterCollision;order", "II", "l", "Il", "lI", "ll", "I"}, this, object);
    }

    public double II() {
        return this.l;
    }

    public double Il() {
        return this.lI;
    }

    public double lI() {
        return this.II;
    }

    public IIllllIll ll() {
        return this.I;
    }
}

