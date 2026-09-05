/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllI
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
record IlllI(PlayerEntity I, double l, double II, double Il, double lI) {
    private final PlayerEntity I;
    private final double l;
    private final double Il;
    private final double lI;

    public double I() {
        return this.l;
    }

    private IlllI(PlayerEntity playerEntity, double d, double d2, double d3, double d4) {
        this.I = playerEntity;
        this.Il = d;
        this.II = d2;
        this.lI = d3;
        this.l = d4;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlllI.class, "player;screenX;screenY;distanceSq;topY", "I", "Il", "II", "lI", "l"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlllI.class, "player;screenX;screenY;distanceSq;topY", "I", "Il", "II", "lI", "l"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlllI.class, "player;screenX;screenY;distanceSq;topY", "I", "Il", "II", "lI", "l"}, this);
    }

    public double l() {
        return this.Il;
    }

    public double Il() {
        return this.lI;
    }

    public PlayerEntity lI() {
        return this.I;
    }
}

