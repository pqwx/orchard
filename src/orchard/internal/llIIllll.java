/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIllll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.internal;

import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.internal.IIlIIlIll;
import orchard.internal.IlIlIlI;
import orchard.internal.IllIll;
import orchard.internal.Illll;

@Environment(value=EnvType.CLIENT)
final class llIIllll {
    private final Map<IllIll, Vec3d> I = new IIlIIlIll(this, 32, 0.75f, true);
    private static final int[] l;

    private static Vec3d I(Box box, Vec3d vec3d) {
        return new Vec3d(MathHelper.lerp((double)vec3d.x, (double)box.minX, (double)box.maxX), MathHelper.lerp((double)vec3d.y, (double)box.minY, (double)box.maxY), MathHelper.lerp((double)vec3d.z, (double)box.minZ, (double)box.maxZ));
    }

    /*
     * Enabled aggressive block sorting
     */
    void l(int n, Illll illll, Box box, Vec3d vec3d) {
        if (box == null) return;
        if (IlIlIlI.IIlllIl(vec3d)) {
            this.I.put(new IllIll(n, llIIllll.Il(illll)), llIIllll.IIl(box, vec3d));
            return;
        }
    }

    llIIllll() {
    }

    void II() {
        this.I.clear();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Illll Il(Illll illll) {
        Illll illll2;
        if (illll != null) {
            illll2 = illll;
            return illll2;
        }
        illll2 = Illll.II;
        return illll2;
    }

    void lI(int n, Illll illll) {
        this.I.remove(new IllIll(n, llIIllll.Il(illll)));
    }

    /*
     * Enabled aggressive block sorting
     */
    Vec3d ll(int n, Illll illll, Box box) {
        if (box == null) {
            return null;
        }
        Vec3d vec3d = this.I.get(new IllIll(n, llIIllll.Il(illll)));
        if (vec3d == null) return null;
        Vec3d vec3d2 = llIIllll.I(box, vec3d);
        return vec3d2;
    }

    private static double III(double d, double d2, double d3) {
        double d4 = d3 - d2;
        if (d4 <= 1.0E-6) {
            return 0.5;
        }
        return MathHelper.clamp((double)((d - d2) / d4), (double)0.0, (double)1.0);
    }

    private static Vec3d IIl(Box box, Vec3d vec3d) {
        return new Vec3d(llIIllll.III(vec3d.x, box.minX, box.maxX), llIIllll.III(vec3d.y, box.minY, box.maxY), llIIllll.III(vec3d.z, box.minZ, box.maxZ));
    }

    int IlI() {
        return this.I.size();
    }

    private static int Ill(int n, int n2) {
        return l[n ^ 0x9B9FCB60] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 528093900;
        byte[] byArray = "\u00b7\u0081\u00c1\u00f0".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        l = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            llIIllll.l[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

