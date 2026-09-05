/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllllIII
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

@Environment(value=EnvType.CLIENT)
record IllllIII(int I, double l) {
    private final int I;
    private final double l;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IllllIII.class, "hazardSamples;nearestHazardDistance", "I", "l"}, this);
    }

    public double I() {
        return this.l;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IllllIII.class, "hazardSamples;nearestHazardDistance", "I", "l"}, this);
    }

    public int l() {
        return this.I;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean II(IllllIII illllIII) {
        if (illllIII == null) return true;
        if (this.I > illllIII.I) return true;
        if (this.I != illllIII.I) return false;
        if (this.l < illllIII.l) return true;
        return false;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IllllIII.class, "hazardSamples;nearestHazardDistance", "I", "l"}, this, object);
    }
}

