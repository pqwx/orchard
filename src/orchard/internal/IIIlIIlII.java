/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIIlII
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
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.entity.player.PlayerEntity
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.player.PlayerEntity;

@Environment(value=EnvType.CLIENT)
final class IIIlIIlII
extends Record {
    private final PlayerEntity I;
    private final float l;
    private final double II;
    private final double Il;

    private IIIlIIlII(PlayerEntity playerEntity, double d, double d2, float f) {
        this.I = playerEntity;
        this.Il = d;
        this.II = d2;
        this.l = f;
    }

    public PlayerEntity I() {
        return this.I;
    }

    public double l() {
        return this.II;
    }

    public double II() {
        return this.Il;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIlIIlII.class, "player;distance;angularDistance;health", "I", "Il", "II", "l"}, this);
    }

    public float Il() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIlIIlII.class, "player;distance;angularDistance;health", "I", "Il", "II", "l"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIlIIlII.class, "player;distance;angularDistance;health", "I", "Il", "II", "l"}, this);
    }
}

