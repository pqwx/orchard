/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.l
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - token;attempt;deadlineTick
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
import orchard.internal.IIIlIIlIl;

@Environment(value=EnvType.CLIENT)
final class l
extends Record {
    private final IIIlIIlIl I;
    private final long l;
    private final int II;

    private l(long l2, IIIlIIlIl iIIlIIlIl, int n) {
        this.l = l2;
        this.I = iIIlIIlIl;
        this.II = n;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{l.class, "token;attempt;deadlineTick", "l", "I", "II"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{l.class, "token;attempt;deadlineTick", "l", "I", "II"}, this);
    }

    public IIIlIIlIl I() {
        return this.I;
    }

    public long l() {
        return this.l;
    }

    public int II() {
        return this.II;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{l.class, "token;attempt;deadlineTick", "l", "I", "II"}, this, object);
    }
}

