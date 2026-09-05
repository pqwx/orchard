/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIlllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - text;color
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
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
final class lIlIlllI
extends Record {
    private final int I;
    private final IIIlIIIII l;

    private lIlIlllI(IIIlIIIII iIIlIIIII, int n) {
        this.l = iIIlIIIII;
        this.I = n;
    }

    public int I() {
        return this.I;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIlIlllI.class, "text;color", "l", "I"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIlIlllI.class, "text;color", "l", "I"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIlIlllI.class, "text;color", "l", "I"}, this, object);
    }

    public IIIlIIIII l() {
        return this.l;
    }
}

