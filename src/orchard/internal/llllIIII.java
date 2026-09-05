/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - kind;legit;recoveries
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
import orchard.internal.IIllIlIl;

@Environment(value=EnvType.CLIENT)
final class llllIIII
extends Record {
    private final IIllIlIl I;
    private final int l;
    private final boolean II;

    private llllIIII I(int n) {
        return new llllIIII(this.I, this.II, n);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{llllIIII.class, "kind;legit;recoveries", "I", "II", "l"}, this, object);
    }

    public boolean l() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{llllIIII.class, "kind;legit;recoveries", "I", "II", "l"}, this);
    }

    public int II() {
        return this.l;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{llllIIII.class, "kind;legit;recoveries", "I", "II", "l"}, this);
    }

    private llllIIII(IIllIlIl iIllIlIl, boolean bl, int n) {
        this.I = iIllIlIl;
        this.II = bl;
        this.l = n;
    }

    public IIllIlIl Il() {
        return this.I;
    }
}

