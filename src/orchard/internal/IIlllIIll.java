/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlllIIll
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

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class IIlllIIll {
    private long I;
    static final double l = 20.0;
    private static final double II = 1.0E9;
    private static final long Il = 250000000L;

    /*
     * Enabled aggressive block sorting
     */
    void I(double d, double d2) {
        long l2 = System.nanoTime();
        long l3 = this.I <= 0L || l2 - this.I > 250000000L ? l2 : this.I;
        this.I = l3 + this.l(d, d2);
    }

    IIlllIIll() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private long l(double d, double d2) {
        double d3;
        double d4 = Math.max(0.1, Math.min(20.0, d));
        double d5 = d4 == (d3 = Math.max(d4, Math.min(20.0, d2))) ? d4 : ThreadLocalRandom.current().nextDouble(d4, d3);
        return Math.max(1L, Math.round(1.0E9 / d5));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean II() {
        long l2 = System.nanoTime();
        if (this.I <= 0L) return true;
        if (l2 < this.I) return false;
        return true;
    }

    void Il() {
        this.I = 0L;
    }
}

