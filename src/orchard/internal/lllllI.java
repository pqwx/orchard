/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
 *   - equals
 *   - lII
 *   - IlI
 *   - III
 *   - Ill
 *   - IIl
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.Illll;

@Environment(value=EnvType.CLIENT)
public final class lllllI
extends Record {
    private final float I;
    private final boolean l;
    private final boolean II;
    private final boolean Il;
    private final boolean lI;
    private final Illll ll;
    private final boolean III;
    private final double IIl;
    private final boolean IlI;
    private final boolean Ill;
    private final double lII;

    public boolean I() {
        return this.Il;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lllllI.class, "range;fovRadiusDegrees;smart;bodyAimPart;priorityHead;priorityChest;priorityLegs;stableUpperBody;requireLineOfSight;trackThroughWalls;hitboxScale", "lII", "I", "IlI", "ll", "III", "Ill", "lI", "l", "Il", "II", "IIl"}, this);
    }

    public boolean l() {
        return this.lI;
    }

    public float II() {
        return this.I;
    }

    public boolean Il() {
        return this.IlI;
    }

    public double lI() {
        return this.IIl;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lllllI.class, "range;fovRadiusDegrees;smart;bodyAimPart;priorityHead;priorityChest;priorityLegs;stableUpperBody;requireLineOfSight;trackThroughWalls;hitboxScale", "lII", "I", "IlI", "ll", "III", "Ill", "lI", "l", "Il", "II", "IIl"}, this);
    }

    public lllllI(double d, float f, boolean bl, Illll illll, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, double d2) {
        this.lII = d;
        this.I = f;
        this.IlI = bl;
        this.ll = illll;
        this.III = bl2;
        this.Ill = bl3;
        this.lI = bl4;
        this.l = bl5;
        this.Il = bl6;
        this.II = bl7;
        this.IIl = d2;
    }

    public boolean ll() {
        return this.Ill;
    }

    public Illll III() {
        return this.ll;
    }

    public boolean IIl() {
        return this.l;
    }

    public boolean IlI() {
        return this.III;
    }

    lllllI(double d, float f, boolean bl, Illll illll, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        this(d, f, bl, illll, bl2, bl3, bl4, bl5, true, false, 1.0);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lllllI.class, "range;fovRadiusDegrees;smart;bodyAimPart;priorityHead;priorityChest;priorityLegs;stableUpperBody;requireLineOfSight;trackThroughWalls;hitboxScale", "lII", "I", "IlI", "ll", "III", "Ill", "lI", "l", "Il", "II", "IIl"}, this, object);
    }

    public boolean Ill() {
        return this.II;
    }

    public double lII() {
        return this.lII;
    }
}

