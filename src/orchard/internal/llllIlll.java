/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - slot;score;preference
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
final class llllIlll
extends Record {
    private final int I;
    private final double l;
    private final int II;

    public int I() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{llllIlll.class, "slot;score;preference", "II", "l", "I"}, this);
    }

    private llllIlll(int n, double d, int n2) {
        this.II = n;
        this.l = d;
        this.I = n2;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{llllIlll.class, "slot;score;preference", "II", "l", "I"}, this);
    }

    public int l() {
        return this.I;
    }

    /*
     * Enabled aggressive block sorting
     */
    boolean II(llllIlll llllIlll2) {
        if (this.l > llllIlll2.l + 1.0E-4) {
            return true;
        }
        if (Math.abs(this.l - llllIlll2.l) <= 1.0E-4) {
            if (this.I > llllIlll2.I) return true;
        }
        if (!(Math.abs(this.l - llllIlll2.l) <= 1.0E-4)) return false;
        if (this.I != llllIlll2.I) return false;
        if (this.II >= llllIlll2.II) return false;
        return true;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{llllIlll.class, "slot;score;preference", "II", "l", "I"}, this, object);
    }

    public double Il() {
        return this.l;
    }
}

