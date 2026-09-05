/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - owner;listener
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
import orchard.internal.lIlIlll;

@Environment(value=EnvType.CLIENT)
final class llIlIII
extends Record {
    private final lIlIlll I;
    private final Object l;

    public lIlIlll I() {
        return this.I;
    }

    private boolean l(Object object) {
        return this.l == object;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{llIlIII.class, "owner;listener", "l", "I"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{llIlIII.class, "owner;listener", "l", "I"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{llIlIII.class, "owner;listener", "l", "I"}, this);
    }

    private llIlIII(Object object, lIlIlll lIlIlll2) {
        this.l = object;
        this.I = lIlIlll2;
    }

    public Object II() {
        return this.l;
    }
}

