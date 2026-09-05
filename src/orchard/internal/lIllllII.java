/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllllII
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
import orchard.internal.lllIll;

@Environment(value=EnvType.CLIENT)
final class lIllllII
extends Record {
    private final long I;
    private final lllIll l;
    private final ChannelPromise II;
    private final long Il;
    private final Object lI;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIllllII.class, "message;promise;mode;queuedAtNanos;sequence", "lI", "II", "l", "I", "Il"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIllllII.class, "message;promise;mode;queuedAtNanos;sequence", "lI", "II", "l", "I", "Il"}, this, object);
    }

    private lIllllII(Object object, ChannelPromise channelPromise, lllIll lllIll2, long l2, long l3) {
        this.lI = object;
        this.II = channelPromise;
        this.l = lllIll2;
        this.I = l2;
        this.Il = l3;
    }

    public lllIll I() {
        return this.l;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIllllII.class, "message;promise;mode;queuedAtNanos;sequence", "lI", "II", "l", "I", "Il"}, this);
    }

    public long l() {
        return this.I;
    }

    public Object II() {
        return this.lI;
    }

    public ChannelPromise Il() {
        return this.II;
    }

    public long lI() {
        return this.Il;
    }
}

