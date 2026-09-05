/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIIll
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
final class IlIlIIll
extends Record {
    private final boolean I;
    private final boolean l;
    private final String II;

    public String I() {
        return this.II;
    }

    public boolean l() {
        return this.I;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIlIIll.class, "value;changed;continueStripping", "II", "l", "I"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIlIIll.class, "value;changed;continueStripping", "II", "l", "I"}, this);
    }

    public boolean II() {
        return this.l;
    }

    private IlIlIIll(String string, boolean bl, boolean bl2) {
        this.II = string;
        this.l = bl;
        this.I = bl2;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIlIIll.class, "value;changed;continueStripping", "II", "l", "I"}, this);
    }
}

