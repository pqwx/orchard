/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIllll
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
 */
package orchard.internal;

import java.util.Arrays;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class IIlIllll {
    private final int[] I = new int[12];
    private double l;
    private int II;
    private double Il;
    private static final int lI = 12;
    private boolean ll;
    private int III;
    private int IIl;
    private static final int[] IlI;

    /*
     * Enabled aggressive block sorting
     */
    private void I(int n) {
        if (n <= 0) {
            return;
        }
        this.II = n;
        this.I[this.III] = n;
        this.III = (this.III + 1) % 12;
        if (this.IIl < 12) {
            ++this.IIl;
        }
        if (!this.ll) {
            this.l = n;
            this.Il = (double)n / 2.0;
            this.ll = true;
            return;
        }
        this.Il = 0.75 * this.Il + 0.25 * Math.abs(this.l - (double)n);
        this.l = 0.875 * this.l + 0.125 * (double)n;
    }

    private double l() {
        return !this.ll ? (double)this.II : this.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double II(double d) {
        if (this.IIl <= 0) {
            return this.l();
        }
        double d2 = Math.max(0.0, Math.min(1.0, d));
        int[] nArray = new int[this.IIl];
        System.arraycopy(this.I, 0, nArray, 0, this.IIl);
        Arrays.sort(nArray);
        int n = Math.max(0, Math.min(nArray.length - 1, (int)Math.round((double)(nArray.length - 1) * d2)));
        return nArray[n];
    }

    private int Il() {
        return this.II;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lI() {
        this.l = 0.0;
        this.Il = 0.0;
        this.II = 0;
        this.ll = false;
        this.IIl = 0;
        this.III = 0;
    }

    private IIlIllll() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double ll() {
        if (!this.ll) return 0.0;
        double d = this.Il;
        return d;
    }

    private static int III(int n, int n2) {
        return IlI[n ^ 0xC0A303FA] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 863385776;
        byte[] byArray = "\u00a7krSU\u00c7.\u0099\u00c8=\u00da\u00a0".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        IlI = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IIlIllll.IlI[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

