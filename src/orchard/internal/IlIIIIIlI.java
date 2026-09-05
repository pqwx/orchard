/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIIIlI
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
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

@Environment(value=EnvType.CLIENT)
public final class IlIIIIIlI {
    /*
     * Enabled aggressive block sorting
     */
    public static boolean I(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3, double d) {
        if (vec3d == null) return false;
        if (vec3d2 == null) return false;
        if (vec3d3 == null) return false;
        Vec3d vec3d4 = vec3d3.subtract(vec3d);
        if (vec3d2.lengthSquared() <= 1.0E-9) return false;
        if (vec3d4.lengthSquared() <= 1.0E-9) {
            return false;
        }
        double d2 = vec3d2.normalize().dotProduct(vec3d4.normalize());
        double d3 = MathHelper.clamp((double)d2, (double)-1.0, (double)1.0);
        double d4 = Math.toDegrees(Math.acos(d3));
        if (d4 <= d) return true;
        return false;
    }

    private IlIIIIIlI() {
    }
}

