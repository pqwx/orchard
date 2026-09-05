/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIIllI
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
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
final class lIlIIllI
extends Record {
    private final IIIlIIIII I;
    private final double l;
    private final IIIlIIIII II;
    private final double Il;
    private final double lI;

    public IIIlIIIII I() {
        return this.I;
    }

    public IIIlIIIII l() {
        return this.II;
    }

    public double II() {
        return this.lI;
    }

    private lIlIIllI(IIIlIIIII iIIlIIIII, IIIlIIIII iIIlIIIII2, double d, double d2, double d3) {
        this.II = iIIlIIIII;
        this.I = iIIlIIIII2;
        this.Il = d;
        this.l = d2;
        this.lI = d3;
    }

    public double Il() {
        return this.Il;
    }

    public double lI() {
        return this.l;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIlIIllI.class, "labelText;valueText;labelWidth;valueWidth;totalTextWidth", "II", "I", "Il", "l", "lI"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIlIIllI.class, "labelText;valueText;labelWidth;valueWidth;totalTextWidth", "II", "I", "Il", "l", "lI"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIlIIllI.class, "labelText;valueText;labelWidth;valueWidth;totalTextWidth", "II", "I", "Il", "l", "lI"}, this, object);
    }
}

