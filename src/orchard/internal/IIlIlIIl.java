/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIlIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
 *   - equals
 *   - III
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import orchard.internal.IlIIIIl;
import orchard.internal.IlIIIl;

@Environment(value=EnvType.CLIENT)
final class IIlIlIIl
extends Record {
    private final long I;
    private final IlIIIl l;
    private final World II;
    private final int Il;
    private final Vec3d lI;
    private final IlIIIIl ll;
    private final Vec3d III;

    public IlIIIIl I() {
        return this.ll;
    }

    public World l() {
        return this.II;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean II(World world, long l2, Vec3d vec3d, Vec3d vec3d2, IlIIIl ilIIIl, int n) {
        if (this.II != world) return false;
        if (this.I != l2) return false;
        if (this.Il != n) return false;
        if (!this.lI.equals((Object)vec3d)) return false;
        if (!this.III.equals((Object)vec3d2)) return false;
        if (!this.l.equals(ilIIIl)) return false;
        return true;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIlIlIIl.class, "world;worldTime;position;velocity;spec;steps;result", "II", "I", "lI", "III", "l", "Il", "ll"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIlIlIIl.class, "world;worldTime;position;velocity;spec;steps;result", "II", "I", "lI", "III", "l", "Il", "ll"}, this, object);
    }

    public int Il() {
        return this.Il;
    }

    public IlIIIl lI() {
        return this.l;
    }

    public Vec3d ll() {
        return this.III;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIlIlIIl.class, "world;worldTime;position;velocity;spec;steps;result", "II", "I", "lI", "III", "l", "Il", "ll"}, this);
    }

    public Vec3d III() {
        return this.lI;
    }

    private IIlIlIIl(World world, long l2, Vec3d vec3d, Vec3d vec3d2, IlIIIl ilIIIl, int n, IlIIIIl ilIIIIl) {
        this.II = world;
        this.I = l2;
        this.lI = vec3d;
        this.III = vec3d2;
        this.l = ilIIIl;
        this.Il = n;
        this.ll = ilIIIIl;
    }

    public long IIl() {
        return this.I;
    }
}

