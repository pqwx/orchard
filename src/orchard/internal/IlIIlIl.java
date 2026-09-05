/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIlIl
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
final class IlIIlIl
extends Record {
    private final double I;
    private final double l;
    private final double II;
    private final double Il;
    private final String lI;

    public double I() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIIlIl.class, "name;cardLeft;cardTop;cardWidth;nameX", "lI", "I", "Il", "II", "l"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIIlIl.class, "name;cardLeft;cardTop;cardWidth;nameX", "lI", "I", "Il", "II", "l"}, this);
    }

    public double l() {
        return this.l;
    }

    public double II() {
        return this.Il;
    }

    public String Il() {
        return this.lI;
    }

    private IlIIlIl(String string, double d, double d2, double d3, double d4) {
        this.lI = string;
        this.I = d;
        this.Il = d2;
        this.II = d3;
        this.l = d4;
    }

    public double lI() {
        return this.I;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIIlIl.class, "name;cardLeft;cardTop;cardWidth;nameX", "lI", "I", "Il", "II", "l"}, this, object);
    }
}

