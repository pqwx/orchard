/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIlIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
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
 *  net.minecraft.network.packet.Packet
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.packet.Packet;

@Environment(value=EnvType.CLIENT)
record IlIIIlIII(Predicate<Packet<?>> I, Consumer<Packet<?>> l, Predicate<Packet<?>> II) {
    private final Predicate<Packet<?>> I;
    private final Consumer<Packet<?>> l;
    private final Predicate<Packet<?>> II;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIIIlIII.class, "shouldHold;observer;shouldFlushBeforeForward", "I", "l", "II"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIIIlIII.class, "shouldHold;observer;shouldFlushBeforeForward", "I", "l", "II"}, this);
    }

    public Predicate<Packet<?>> I() {
        return this.II;
    }

    public Predicate<Packet<?>> l() {
        return this.I;
    }

    public Consumer<Packet<?>> II() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIIIlIII.class, "shouldHold;observer;shouldFlushBeforeForward", "I", "l", "II"}, this, object);
    }
}

