/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllllIII
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
 */
package orchard.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.MathHelper;
import orchard.internal.IIIllIllI;
import orchard.internal.lIIllIl;
import orchard.internal.lllllIll;

@Environment(value=EnvType.CLIENT)
public final class lllllIII<K> {
    private static final double I = 90.0;
    private static final long l = 175L;
    private static final double II = 72.0;
    private final Map<K, IIIllIllI> Il = new HashMap<K, IIIllIllI>();
    private static final double lI = 80.0;

    /*
     * Enabled aggressive block sorting
     */
    public lIIllIl I(K k, lIIllIl lIIllIl2, double d) {
        if (k == null) return lIIllIl2;
        if (lIIllIl2 != null) {
            long l2;
            double d2 = lIIllIl2.ll();
            double d3 = lIIllIl2.lI();
            if (!Double.isFinite(lIIllIl2.I())) return lIIllIl2;
            if (!Double.isFinite(lIIllIl2.l())) return lIIllIl2;
            if (!Double.isFinite(d2)) return lIIllIl2;
            if (Double.isFinite(d3)) {
                l2 = System.currentTimeMillis();
                IIIllIllI iIIllIllI = this.Il.get(k);
                if (iIIllIllI != null && !this.ll(iIIllIllI, lIIllIl2, d, l2)) {
                    double d4 = lIIllIl2.I() - iIIllIllI.Il;
                    double d5 = lIIllIl2.l() - iIIllIllI.ll;
                    double d6 = d2 - iIIllIllI.I;
                    double d7 = d3 - iIIllIllI.l;
                    double d8 = MathHelper.clamp((double)(0.46 + Math.hypot(d4, d5) / 60.0), (double)0.46, (double)0.84);
                    double d9 = iIIllIllI.Il + d4 * d8;
                    double d10 = iIIllIllI.ll + d5 * d8;
                    double d11 = iIIllIllI.I + d6 * d8;
                    double d12 = iIIllIllI.l + d7 * d8;
                    this.Il.put(k, new IIIllIllI(d9, d10, d11, d12, d, l2));
                    return new lIIllIl(d9, d10, d9 + Math.max(1.0, d11), d10 + Math.max(1.0, d12));
                }
            } else {
                return lIIllIl2;
            }
            this.Il.put(k, new IIIllIllI(lIIllIl2.I(), lIIllIl2.l(), d2, d3, d, l2));
            return lIIllIl2;
        }
        return lIIllIl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public lllllIll l(K k, double d, double d2, double d3) {
        if (k == null) return new lllllIll(d, d2, d3);
        if (!Double.isFinite(d)) return new lllllIll(d, d2, d3);
        if (!Double.isFinite(d2)) {
            return new lllllIll(d, d2, d3);
        }
        long l2 = System.currentTimeMillis();
        IIIllIllI iIIllIllI = this.Il.get(k);
        if (iIIllIllI != null && !this.II(iIIllIllI, d, d2, d3, l2)) {
            double d4 = d - iIIllIllI.Il;
            double d5 = d2 - iIIllIllI.ll;
            double d6 = MathHelper.clamp((double)(0.42 + Math.hypot(d4, d5) / 55.0), (double)0.42, (double)0.82);
            double d7 = iIIllIllI.Il + d4 * d6;
            double d8 = iIIllIllI.ll + d5 * d6;
            this.Il.put(k, new IIIllIllI(d7, d8, Double.NaN, Double.NaN, d3, l2));
            return new lllllIll(d7, d8, d3);
        }
        this.Il.put(k, new IIIllIllI(d, d2, Double.NaN, Double.NaN, d3, l2));
        return new lllllIll(d, d2, d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean II(IIIllIllI iIIllIllI, double d, double d2, double d3, long l2) {
        double d4 = d - iIIllIllI.Il;
        double d5 = d2 - iIIllIllI.ll;
        if (d4 * d4 + d5 * d5 > 5184.0) return true;
        if (l2 - iIIllIllI.II > 175L) return true;
        if (lllllIII.Il(iIIllIllI.lI, d3) > 1.8) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double Il(double d, double d2) {
        if (!Double.isFinite(d)) return 1.0;
        if (!Double.isFinite(d2)) return 1.0;
        if (d <= 0.0) return 1.0;
        if (!(d2 <= 0.0)) return Math.max(d, d2) / Math.max(1.0, Math.min(d, d2));
        return 1.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean ll(IIIllIllI iIIllIllI, lIIllIl lIIllIl2, double d, long l2) {
        double d2 = lIIllIl2.I() - iIIllIllI.Il;
        double d3 = lIIllIl2.l() - iIIllIllI.ll;
        if (!Double.isFinite(iIIllIllI.I)) return true;
        if (!Double.isFinite(iIIllIllI.l)) return true;
        if (d2 * d2 + d3 * d3 > 8100.0) return true;
        if (Math.abs(lIIllIl2.ll() - iIIllIllI.I) > 80.0) return true;
        if (Math.abs(lIIllIl2.lI() - iIIllIllI.l) > 80.0) return true;
        if (l2 - iIIllIllI.II > 175L) return true;
        if (lllllIII.Il(iIIllIllI.lI, d) > 1.8) return true;
        return false;
    }

    public void III(Set<K> set) {
        if (set != null) {
            if (!set.isEmpty()) {
                this.Il.keySet().removeIf(object -> {
                    if (set.contains(object)) return false;
                    return true;
                });
                return;
            }
        }
        this.Il.clear();
    }

    public void IIl() {
        this.Il.clear();
    }
}

