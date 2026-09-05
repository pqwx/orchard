/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllllIl
 * Purpose not identified - name is the original obfuscated one.
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
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.Vec3d;

@Environment(value=EnvType.CLIENT)
final class IIllllIl {
    private long I;
    private long l;
    private long II;
    private static final double Il = 4096.0;
    private boolean lI;

    public Vec3d I(Vec3d vec3d) {
        this.Il(vec3d);
        return this.II();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean l(Vec3d vec3d) {
        if (vec3d == null) return false;
        if (!Double.isFinite(vec3d.x)) return false;
        if (!Double.isFinite(vec3d.y)) return false;
        if (!Double.isFinite(vec3d.z)) return false;
        return true;
    }

    public Vec3d II() {
        if (!this.lI) {
            return null;
        }
        return new Vec3d((double)this.l / 4096.0, (double)this.I / 4096.0, (double)this.II / 4096.0);
    }

    public void Il(Vec3d vec3d) {
        if (!IIllllIl.l(vec3d)) {
            this.ll();
            return;
        }
        this.l = Math.round(vec3d.x * 4096.0);
        this.I = Math.round(vec3d.y * 4096.0);
        this.II = Math.round(vec3d.z * 4096.0);
        this.lI = true;
    }

    public Vec3d lI(long l2, long l3, long l4) {
        if (!this.lI) {
            return null;
        }
        this.l += l2;
        this.I += l3;
        this.II += l4;
        return this.II();
    }

    IIllllIl() {
    }

    public void ll() {
        this.l = 0L;
        this.I = 0L;
        this.II = 0L;
        this.lI = false;
    }

    public boolean III() {
        return this.lI;
    }
}

