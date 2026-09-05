/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - scanCode;extended
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
record IIIlIIII(int I, boolean l) {
    private final int I;
    private final boolean l;

    public boolean I() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIlIIII.class, "scanCode;extended", "I", "l"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIlIIII.class, "scanCode;extended", "I", "l"}, this);
    }

    public int l() {
        return this.I;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIlIIII.class, "scanCode;extended", "I", "l"}, this);
    }
}

