/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlllIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - player;handle
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
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayerEntity;
import orchard.internal.IIlIIIIIl;

@Environment(value=EnvType.CLIENT)
final class IIIlllIlI
extends Record {
    private final IIlIIIIIl I;
    private final ClientPlayerEntity l;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIlllIlI.class, "player;handle", "l", "I"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIlllIlI.class, "player;handle", "l", "I"}, this);
    }

    private IIIlllIlI(ClientPlayerEntity clientPlayerEntity, IIlIIIIIl iIlIIIIIl) {
        this.l = clientPlayerEntity;
        this.I = iIlIIIIIl;
    }

    public ClientPlayerEntity I() {
        return this.l;
    }

    public IIlIIIIIl l() {
        return this.I;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIlllIlI.class, "player;handle", "l", "I"}, this);
    }
}

