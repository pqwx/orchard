/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIIll
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
import orchard.internal.IIllIll;

@Environment(value=EnvType.CLIENT)
final class lIIIIll
extends Record {
    private final Object I;
    private final IIllIll l;
    private final ChannelPromise II;
    private final long Il;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIIIIll.class, "message;promise;sequence;transaction", "I", "II", "Il", "l"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIIIIll.class, "message;promise;sequence;transaction", "I", "II", "Il", "l"}, this);
    }

    public long I() {
        return this.Il;
    }

    private lIIIIll(Object object, ChannelPromise channelPromise, long l2, IIllIll iIllIll) {
        this.I = object;
        this.II = channelPromise;
        this.Il = l2;
        this.l = iIllIll;
    }

    public IIllIll l() {
        return this.l;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIIIIll.class, "message;promise;sequence;transaction", "I", "II", "Il", "l"}, this);
    }

    public Object II() {
        return this.I;
    }

    public ChannelPromise Il() {
        return this.II;
    }
}

