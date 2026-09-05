/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlIIII
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
 *  net.minecraft.client.network.OtherClientPlayerEntity
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.OtherClientPlayerEntity;

@Environment(value=EnvType.CLIENT)
final class llIlIIII
extends Record {
    private final OtherClientPlayerEntity I;
    private final double l;
    private final long II;
    private final float Il;
    private final double lI;
    private final double ll;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{llIlIIII.class, "player;createdAt;x;y;z;bodyYaw", "I", "II", "ll", "lI", "l", "Il"}, this, object);
    }

    public long I() {
        return this.II;
    }

    public double l() {
        return this.l;
    }

    public double II() {
        return this.ll;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{llIlIIII.class, "player;createdAt;x;y;z;bodyYaw", "I", "II", "ll", "lI", "l", "Il"}, this);
    }

    public OtherClientPlayerEntity Il() {
        return this.I;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{llIlIIII.class, "player;createdAt;x;y;z;bodyYaw", "I", "II", "ll", "lI", "l", "Il"}, this);
    }

    private llIlIIII(OtherClientPlayerEntity otherClientPlayerEntity, long l2, double d, double d2, double d3, float f) {
        this.I = otherClientPlayerEntity;
        this.II = l2;
        this.ll = d;
        this.lI = d2;
        this.l = d3;
        this.Il = f;
    }

    public float lI() {
        return this.Il;
    }

    public double ll() {
        return this.lI;
    }
}

