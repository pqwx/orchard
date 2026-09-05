/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIlIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - readySlots;totalSlots
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
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class IlIIlIlII
extends Record {
    private final int I;
    private final List<Integer> l;

    boolean I() {
        return this.I > 0;
    }

    public List<Integer> l() {
        return this.l;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIIlIlII.class, "readySlots;totalSlots", "l", "I"}, this);
    }

    private IlIIlIlII(List<Integer> list, int n) {
        this.l = list;
        this.I = n;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIIlIlII.class, "readySlots;totalSlots", "l", "I"}, this, object);
    }

    boolean II() {
        return !this.l.isEmpty();
    }

    int Il() {
        return this.l.get(ThreadLocalRandom.current().nextInt(this.l.size()));
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIIlIlII.class, "readySlots;totalSlots", "l", "I"}, this);
    }

    public int lI() {
        return this.I;
    }
}

