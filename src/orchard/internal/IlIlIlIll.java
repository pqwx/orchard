/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIlIll
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
 *  net.minecraft.entity.LivingEntity
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.LivingEntity;
import orchard.internal.IlIlIIIlI;

@Environment(value=EnvType.CLIENT)
final class IlIlIlIll
extends Record {
    private final IlIlIIIlI I;
    private final double l;
    private final LivingEntity II;
    private final float Il;
    private final double lI;

    public float I() {
        return this.Il;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIlIlIll.class, "entity;candidate;distance;angularDistance;health", "II", "I", "lI", "l", "Il"}, this);
    }

    public LivingEntity l() {
        return this.II;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIlIlIll.class, "entity;candidate;distance;angularDistance;health", "II", "I", "lI", "l", "Il"}, this);
    }

    public double II() {
        return this.l;
    }

    public IlIlIIIlI Il() {
        return this.I;
    }

    private IlIlIlIll(LivingEntity livingEntity, IlIlIIIlI ilIlIIIlI, double d, double d2, float f) {
        this.II = livingEntity;
        this.I = ilIlIIIlI;
        this.lI = d;
        this.l = d2;
        this.Il = f;
    }

    public double lI() {
        return this.lI;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIlIlIll.class, "entity;candidate;distance;angularDistance;health", "II", "I", "lI", "l", "Il"}, this, object);
    }
}

