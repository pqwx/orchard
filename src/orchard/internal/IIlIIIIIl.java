/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - id;owner
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
public final class IIlIIIIIl
extends Record {
    private final Object I;
    private final long l;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIlIIIIIl.class, "id;owner", "l", "I"}, this);
    }

    public Object I() {
        return this.I;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean l() {
        if (this.l <= 0L) return false;
        if (this.I == null) return false;
        return true;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIlIIIIIl.class, "id;owner", "l", "I"}, this, object);
    }

    public long II() {
        return this.l;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIlIIIIIl.class, "id;owner", "l", "I"}, this);
    }

    public IIlIIIIIl(long l2, Object object) {
        this.l = l2;
        this.I = object;
    }
}

