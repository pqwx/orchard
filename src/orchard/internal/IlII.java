/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlII
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
 *  net.minecraft.entity.player.PlayerEntity
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.player.PlayerEntity;

@Environment(value=EnvType.CLIENT)
final class IlII
extends Record {
    private final float I;
    private final double l;
    private final PlayerEntity II;
    private final double Il;

    public double I() {
        return this.Il;
    }

    public float l() {
        return this.I;
    }

    public double II() {
        return this.l;
    }

    public PlayerEntity Il() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlII.class, "target;distance;angularDistance;health", "II", "l", "Il", "I"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlII.class, "target;distance;angularDistance;health", "II", "l", "Il", "I"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlII.class, "target;distance;angularDistance;health", "II", "l", "Il", "I"}, this);
    }

    private IlII(PlayerEntity playerEntity, double d, double d2, float f) {
        this.II = playerEntity;
        this.l = d;
        this.Il = d2;
        this.I = f;
    }
}

