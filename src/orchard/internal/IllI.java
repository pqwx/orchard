/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllI
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
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
final class IllI
extends Record {
    private final IIIlIIIII I;
    private final String l;
    private final double II;
    private final IIIlIIIII Il;
    private final double lI;
    private final double ll;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IllI.class, "key;label;value;labelWidth;valueWidth;totalTextWidth", "l", "I", "Il", "lI", "II", "ll"}, this);
    }

    private IllI(String string, IIIlIIIII iIIlIIIII, IIIlIIIII iIIlIIIII2, double d, double d2, double d3) {
        this.l = string;
        this.I = iIIlIIIII;
        this.Il = iIIlIIIII2;
        this.lI = d;
        this.II = d2;
        this.ll = d3;
    }

    public double I() {
        return this.II;
    }

    public IIIlIIIII l() {
        return this.I;
    }

    public String II() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IllI.class, "key;label;value;labelWidth;valueWidth;totalTextWidth", "l", "I", "Il", "lI", "II", "ll"}, this, object);
    }

    public double Il() {
        return this.lI;
    }

    public IIIlIIIII lI() {
        return this.Il;
    }

    public double ll() {
        return this.ll;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IllI.class, "key;label;value;labelWidth;valueWidth;totalTextWidth", "l", "I", "Il", "lI", "II", "ll"}, this);
    }
}

