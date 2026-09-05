/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - content;motion
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
import orchard.internal.IIIIlIlI;
import orchard.internal.lIIIIIll;

@Environment(value=EnvType.CLIENT)
final class IIllIIIl
extends Record {
    private final lIIIIIll I;
    private final IIIIlIlI l;

    private IIllIIIl(IIIIlIlI iIIIlIlI, lIIIIIll lIIIIIll2) {
        this.l = iIIIlIlI;
        this.I = lIIIIIll2;
    }

    public IIIIlIlI I() {
        return this.l;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIllIIIl.class, "content;motion", "l", "I"}, this);
    }

    public lIIIIIll l() {
        return this.I;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIllIIIl.class, "content;motion", "l", "I"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIllIIIl.class, "content;motion", "l", "I"}, this, object);
    }
}

