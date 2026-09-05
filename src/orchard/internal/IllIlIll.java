/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIlIll
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
final class IllIlIll
extends Record {
    private final double I;
    private final double l;
    private final boolean II;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean I() {
        if (!this.II) return false;
        if (!(this.I >= 0.74)) return false;
        if (!(this.l >= 0.65)) return false;
        return true;
    }

    public double l() {
        return this.l;
    }

    public boolean II() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IllIlIll.class, "centerSupported;supportRatio;leadingSupportRatio", "II", "I", "l"}, this);
    }

    public double Il() {
        return this.I;
    }

    private IllIlIll(boolean bl, double d, double d2) {
        this.II = bl;
        this.I = d;
        this.l = d2;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IllIlIll.class, "centerSupported;supportRatio;leadingSupportRatio", "II", "I", "l"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IllIlIll.class, "centerSupported;supportRatio;leadingSupportRatio", "II", "I", "l"}, this);
    }
}

