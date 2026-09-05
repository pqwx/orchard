/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIll
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
final class IIllIll
extends Record {
    private final Object I;
    private final int l;
    private final long II;
    private final long Il;
    private final ChannelPromise lI;

    public long I() {
        return this.Il;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIllIll.class, "message;promise;queuedAtNanos;transactionId;sequence", "I", "lI", "Il", "l", "II"}, this);
    }

    public long l() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIllIll.class, "message;promise;queuedAtNanos;transactionId;sequence", "I", "lI", "Il", "l", "II"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIllIll.class, "message;promise;queuedAtNanos;transactionId;sequence", "I", "lI", "Il", "l", "II"}, this, object);
    }

    public ChannelPromise II() {
        return this.lI;
    }

    public Object Il() {
        return this.I;
    }

    private IIllIll(Object object, ChannelPromise channelPromise, long l2, int n, long l3) {
        this.I = object;
        this.lI = channelPromise;
        this.Il = l2;
        this.l = n;
        this.II = l3;
    }

    public int lI() {
        return this.l;
    }
}

