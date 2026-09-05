/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - version;build;subversion
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
final class IIllIIIII
extends Record {
    private final int I;
    private final int l;
    private final String II;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIllIIIII.class, "version;build;subversion", "II", "I", "l"}, this);
    }

    IIllIIIII(String string, int n, int n2) {
        this.II = string;
        this.I = n;
        this.l = n2;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIllIIIII.class, "version;build;subversion", "II", "I", "l"}, this, object);
    }

    public String I() {
        return this.II;
    }

    public int l() {
        return this.l;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIllIIIII.class, "version;build;subversion", "II", "I", "l"}, this);
    }

    public int II() {
        return this.I;
    }
}

