/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
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
 *  io.netty.channel.ChannelPromise
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import io.netty.channel.ChannelPromise;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class lI
extends Record {
    private final ChannelPromise I;
    private final Object l;
    private final long II;
    private final long Il;

    public long I() {
        return this.Il;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lI.class, "message;promise;queuedAtNanos;sequence", "l", "I", "II", "Il"}, this);
    }

    public Object l() {
        return this.l;
    }

    private lI(Object object, ChannelPromise channelPromise, long l2, long l3) {
        this.l = object;
        this.I = channelPromise;
        this.II = l2;
        this.Il = l3;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lI.class, "message;promise;queuedAtNanos;sequence", "l", "I", "II", "Il"}, this);
    }

    public ChannelPromise II() {
        return this.I;
    }

    public long Il() {
        return this.II;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lI.class, "message;promise;queuedAtNanos;sequence", "l", "I", "II", "Il"}, this, object);
    }
}

