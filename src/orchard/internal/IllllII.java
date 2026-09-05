/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - token;attempt;deadlineTick
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
import orchard.internal.IIlIIlll;

@Environment(value=EnvType.CLIENT)
final class IllllII
extends Record {
    private final IIlIIlll I;
    private final long l;
    private final int II;

    private IllllII(long l2, IIlIIlll iIlIIlll, int n) {
        this.l = l2;
        this.I = iIlIIlll;
        this.II = n;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IllllII.class, "token;attempt;deadlineTick", "l", "I", "II"}, this);
    }

    public int I() {
        return this.II;
    }

    public long l() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IllllII.class, "token;attempt;deadlineTick", "l", "I", "II"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IllllII.class, "token;attempt;deadlineTick", "l", "I", "II"}, this);
    }

    public IIlIIlll II() {
        return this.I;
    }
}

