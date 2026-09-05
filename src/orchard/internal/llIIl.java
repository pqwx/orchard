/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
 *   - IlI
 *   - IIl
 *   - III
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.util.Identifier
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;
import orchard.internal.IlIlIllll;

@Environment(value=EnvType.CLIENT)
final class llIIl
extends Record {
    private final double I;
    private final double l;
    private final double II;
    private final IlIlIllll Il;
    private final float lI;
    private final Identifier ll;
    private final Map<Integer, IlIlIllll> III;
    private final double IIl;
    private final double IlI;

    public float I() {
        return this.lI;
    }

    public double l() {
        return this.IlI;
    }

    public IlIlIllll II() {
        return this.Il;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{llIIl.class, "texture;width;height;distanceRange;lineHeight;ascender;descender;glyphs;fallback", "ll", "IlI", "II", "lI", "I", "IIl", "l", "III", "Il"}, this);
    }

    public Identifier Il() {
        return this.ll;
    }

    public double lI() {
        return this.II;
    }

    public double ll() {
        return this.I;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{llIIl.class, "texture;width;height;distanceRange;lineHeight;ascender;descender;glyphs;fallback", "ll", "IlI", "II", "lI", "I", "IIl", "l", "III", "Il"}, this);
    }

    public double III() {
        return this.l;
    }

    private llIIl(Identifier identifier, double d, double d2, float f, double d3, double d4, double d5, Map<Integer, IlIlIllll> map, IlIlIllll ilIlIllll) {
        this.ll = identifier;
        this.IlI = d;
        this.II = d2;
        this.lI = f;
        this.I = d3;
        this.IIl = d4;
        this.l = d5;
        this.III = map;
        this.Il = ilIlIllll;
    }

    public Map<Integer, IlIlIllll> IIl() {
        return this.III;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{llIIl.class, "texture;width;height;distanceRange;lineHeight;ascender;descender;glyphs;fallback", "ll", "IlI", "II", "lI", "I", "IIl", "l", "III", "Il"}, this, object);
    }

    public double IlI() {
        return this.IIl;
    }
}

