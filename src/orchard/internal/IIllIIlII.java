/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIIlII
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
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class IIllIIlII {
    public static double I(double d, double d2) {
        double d3 = IIllIIlII.II(d);
        double d4 = Math.max(0.0, Math.min(8.0, d2 * 60.0));
        return 1.0 - Math.pow(1.0 - d3, d4);
    }

    public static double l(double d) {
        double d2 = 1.0 - IIllIIlII.II(d);
        return 1.0 - d2 * d2 * d2;
    }

    public static double II(double d) {
        return Math.max(0.0, Math.min(1.0, d));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static double Il(double d) {
        double d2 = IIllIIlII.II(d);
        if (d2 >= 1.0) {
            return 1.0;
        }
        double d3 = 1.0 - Math.pow(2.0, -10.0 * d2);
        return d3;
    }

    private IIllIIlII() {
    }

    public static double lI(double d) {
        double d2 = IIllIIlII.II(d);
        return d2 * d2 * d2 * (d2 * (d2 * 6.0 - 15.0) + 10.0);
    }

    public static double ll(double d) {
        double d2 = IIllIIlII.II(d);
        return d2 < 0.5 ? 4.0 * d2 * d2 * d2 : 1.0 - Math.pow(-2.0 * d2 + 2.0, 3.0) * 0.5;
    }

    public static double III(double d, double d2, double d3, double d4) {
        return d + (d2 - d) * IIllIIlII.I(d3, d4);
    }

    public static double IIl(double d) {
        double d2 = IIllIIlII.II(d) - 1.0;
        return 1.0 + d2 * d2 * (2.70158 * d2 + 1.70158);
    }
}

