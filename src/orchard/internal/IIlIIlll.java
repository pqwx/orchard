/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - kind;recoveries
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
import orchard.internal.lllI;

@Environment(value=EnvType.CLIENT)
final class IIlIIlll
extends Record {
    private final int I;
    private final lllI l;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIlIIlll.class, "kind;recoveries", "l", "I"}, this);
    }

    private IIlIIlll I(int n) {
        return new IIlIIlll(this.l, n);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIlIIlll.class, "kind;recoveries", "l", "I"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIlIIlll.class, "kind;recoveries", "l", "I"}, this, object);
    }

    private IIlIIlll(lllI lllI2, int n) {
        this.l = lllI2;
        this.I = n;
    }

    public lllI l() {
        return this.l;
    }

    public int II() {
        return this.I;
    }
}

