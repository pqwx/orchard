/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.Il
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - label;value
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
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
record Il(IIIlIIIII I, IIIlIIIII l) {
    private final IIIlIIIII I;
    private final IIIlIIIII l;

    public IIIlIIIII I() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{Il.class, "label;value", "l", "I"}, this, object);
    }

    public IIIlIIIII l() {
        return this.I;
    }

    private Il(IIIlIIIII iIIlIIIII, IIIlIIIII iIIlIIIII2) {
        this.l = iIIlIIIII;
        this.I = iIIlIIIII2;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{Il.class, "label;value", "l", "I"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{Il.class, "label;value", "l", "I"}, this);
    }
}

