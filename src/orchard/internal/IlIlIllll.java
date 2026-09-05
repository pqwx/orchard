/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIllll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
 *   - Ill
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
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class IlIlIllll
extends Record {
    private final double I;
    private final double l;
    private final double II;
    private final double Il;
    private final double lI;
    private final double ll;
    private final double III;
    private final double IIl;
    private final double IlI;
    private final int Ill;

    public double I() {
        return this.II;
    }

    public double l() {
        return this.Il;
    }

    public double II() {
        return this.lI;
    }

    public double Il() {
        return this.IlI;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIlIllll.class, "unicode;advance;planeLeft;planeBottom;planeRight;planeTop;atlasLeft;atlasBottom;atlasRight;atlasTop", "Ill", "lI", "Il", "IlI", "IIl", "ll", "I", "III", "l", "II"}, this);
    }

    public double lI() {
        return this.ll;
    }

    public double ll() {
        return this.IIl;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIlIllll.class, "unicode;advance;planeLeft;planeBottom;planeRight;planeTop;atlasLeft;atlasBottom;atlasRight;atlasTop", "Ill", "lI", "Il", "IlI", "IIl", "ll", "I", "III", "l", "II"}, this);
    }

    public double III() {
        return this.I;
    }

    public double IIl() {
        return this.III;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIlIllll.class, "unicode;advance;planeLeft;planeBottom;planeRight;planeTop;atlasLeft;atlasBottom;atlasRight;atlasTop", "Ill", "lI", "Il", "IlI", "IIl", "ll", "I", "III", "l", "II"}, this, object);
    }

    public int IlI() {
        return this.Ill;
    }

    public double Ill() {
        return this.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    boolean lII() {
        if (!(this.IIl > this.Il)) return false;
        if (!(this.ll > this.IlI)) return false;
        if (!(this.l > this.I)) return false;
        if (!(this.II > this.III)) return false;
        return true;
    }

    private IlIlIllll(int n, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        this.Ill = n;
        this.lI = d;
        this.Il = d2;
        this.IlI = d3;
        this.IIl = d4;
        this.ll = d5;
        this.I = d6;
        this.III = d7;
        this.l = d8;
        this.II = d9;
    }
}

