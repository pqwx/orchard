/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIll
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
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayerEntity;

@Environment(value=EnvType.CLIENT)
final class IIlIll
extends Record {
    private final int I;
    private final int l;
    private final ClientPlayerEntity II;
    private final int Il;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIlIll.class, "player;slot;expectedSelectedSlot;restoreTick", "II", "l", "I", "Il"}, this);
    }

    public int I() {
        return this.l;
    }

    public int l() {
        return this.I;
    }

    public ClientPlayerEntity II() {
        return this.II;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIlIll.class, "player;slot;expectedSelectedSlot;restoreTick", "II", "l", "I", "Il"}, this, object);
    }

    private IIlIll(ClientPlayerEntity clientPlayerEntity, int n, int n2, int n3) {
        this.II = clientPlayerEntity;
        this.l = n;
        this.I = n2;
        this.Il = n3;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIlIll.class, "player;slot;expectedSelectedSlot;restoreTick", "II", "l", "I", "Il"}, this);
    }

    public int Il() {
        return this.Il;
    }
}

