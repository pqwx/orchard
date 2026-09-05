/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIllIl
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
import orchard.internal.llllIIII;

@Environment(value=EnvType.CLIENT)
final class lllIllIl
extends Record {
    private final int I;
    private final long l;
    private final llllIIII II;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lllIllIl.class, "token;attempt;deadlineTick", "l", "II", "I"}, this, object);
    }

    public long I() {
        return this.l;
    }

    private lllIllIl(long l2, llllIIII llllIIII2, int n) {
        this.l = l2;
        this.II = llllIIII2;
        this.I = n;
    }

    public int l() {
        return this.I;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lllIllIl.class, "token;attempt;deadlineTick", "l", "II", "I"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lllIllIl.class, "token;attempt;deadlineTick", "l", "II", "I"}, this);
    }

    public llllIIII II() {
        return this.II;
    }
}

