/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 */
package orchard.internal;

import java.util.Iterator;
import orchard.internal.IllIlII;
import orchard.internal.lIIlIlII;

public final class IIllIIIlI {
    private static final int[] I;

    public static double I(double d, double d2, double d3) {
        return IIllIIIlI.Il(d, d2, IIllIIIlI.ll(d3, 0.0, 1.0));
    }

    private IIllIIIlI() {
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static lIIlIlII l(lIIlIlII lIIlIlII2, Iterable<lIIlIlII> iterable, double d, double d2) {
        double d3;
        double d4;
        if (lIIlIlII2 == null) return lIIlIlII2;
        if (iterable == null) return lIIlIlII2;
        if (!(d2 <= 0.0)) {
            d4 = lIIlIlII2.l();
            d3 = lIIlIlII2.II();
        }
        return lIIlIlII2;
        boolean bl = d4 + lIIlIlII2.I() * 0.5 >= d * 0.5;
        Iterator<lIIlIlII> iterator = iterable.iterator();
        boolean bl2 = true;
        block0: while (true) {
            lIIlIlII lIIlIlII3;
            if (!bl2 || (bl2 = false) || !true) {
                if (bl) {
                    double d5;
                    double d6 = lIIlIlII3.l() + lIIlIlII3.I();
                    if (Math.abs(d6 - (d5 = d4 + lIIlIlII2.I())) < d2) {
                        d4 = d6 - lIIlIlII2.I();
                    }
                } else if (Math.abs(lIIlIlII3.l() - d4) < d2) {
                    d4 = lIIlIlII3.l();
                }
                if (Math.abs(lIIlIlII3.II() - d3) < d2) {
                    d3 = lIIlIlII3.II();
                }
            }
            while (iterator.hasNext()) {
                lIIlIlII3 = iterator.next();
                if (lIIlIlII3 != null && !lIIlIlII3.equals(lIIlIlII2)) continue block0;
            }
            return new lIIlIlII(d4, d3, lIIlIlII2.I(), lIIlIlII2.Il());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float II(float f, float f2, float f3) {
        float f4;
        float f5 = (float)IIllIIIlI.ll(f3, 0.0, 1.0);
        float f6 = Math.max(f, f2) - Math.min(f, f2);
        float f7 = f6 * f5;
        if (f > f2) {
            f4 = f7;
            return f2 + f4;
        }
        f4 = -f7;
        return f2 + f4;
    }

    public static double Il(double d, double d2, double d3) {
        return d + (d2 - d) * d3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static IllIlII lI(double d, double d2, double d3, double d4, double d5, double d6) {
        block1: {
            if (!Double.isFinite(d)) return IllIlII.ll;
            if (!Double.isFinite(d2)) return IllIlII.ll;
            if (!Double.isFinite(d3)) return IllIlII.ll;
            if (!Double.isFinite(d4)) return IllIlII.ll;
            if (!Double.isFinite(d5)) return IllIlII.ll;
            if (!Double.isFinite(d6)) break block1;
        }
        return IllIlII.ll;
        double d7 = d3 < 0.0 ? d + d3 : d;
        double d8 = d4 < 0.0 ? d2 + d4 : d2;
        double d9 = Math.abs(d3);
        double d10 = Math.abs(d4);
        if (d9 <= 0.0) return IllIlII.ll;
        if (!(d10 <= 0.0)) {
            double d11 = Math.min(d9, d10) * 0.5;
            return new IllIlII(d7, d8, d9, d10, IIllIIIlI.ll(d5, 0.0, d11), IIllIIIlI.ll(d6, 0.0, d11));
        }
        return IllIlII.ll;
    }

    public static double ll(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static double III(double d, double d2, double d3) {
        return d + (d2 - d) * IIllIIIlI.ll(d3, 0.0, 1.0);
    }

    public static double IIl(double d, double d2, double d3, double d4) {
        double d5 = IIllIIIlI.ll(d4 * d3, 0.0, 1.0);
        return (1.0 - d5) * d + d5 * d2;
    }

    public static int IlI(int n, int n2, double d) {
        double d2 = IIllIIIlI.ll(d, 0.0, 1.0);
        int n3 = IIllIIIlI.lII(n, n2, 24, d2);
        int n4 = IIllIIIlI.lII(n, n2, 16, d2);
        int n5 = IIllIIIlI.lII(n, n2, 8, d2);
        int n6 = IIllIIIlI.lII(n, n2, 0, d2);
        return n3 << 24 | n4 << 16 | n5 << 8 | n6;
    }

    public static int Ill(int n, double d) {
        int n2 = n >>> 24 & 0xFF;
        return IIllIIIlI.lll(n, (int)((double)n2 * IIllIIIlI.ll(d, 0.0, 1.0)));
    }

    private static int lII(int n, int n2, int n3, double d) {
        int n4 = n >>> n3 & 0xFF;
        int n5 = n2 >>> n3 & 0xFF;
        return IIllIIIlI.IIIl((int)IIllIIIlI.Il(n4, n5, d), 0, 255);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double lIl(double d, double d2) {
        double d3;
        if (Double.isFinite(d) && d > 0.0) {
            d3 = d;
            return d3;
        }
        d3 = d2;
        return d3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean llI(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = Math.min(d3, d3 + d5);
        double d8 = Math.max(d3, d3 + d5);
        double d9 = Math.min(d4, d4 + d6);
        double d10 = Math.max(d4, d4 + d6);
        if (!(d > d7)) return false;
        if (!(d < d8)) return false;
        if (!(d2 > d9)) return false;
        if (!(d2 < d10)) return false;
        return true;
    }

    public static int lll(int n, int n2) {
        return IIllIIIlI.IIIl(n2, 0, 255) << 24 | n & 0xFFFFFF;
    }

    public static double IIII(double d, double d2, double d3, double d4) {
        double d5 = IIllIIIlI.lIl(d, 0.0);
        double d6 = IIllIIIlI.IlII(d3, 1.0);
        double d7 = IIllIIIlI.IlII(d4, 0.0);
        double d8 = Math.max(0.0, d6 - d7);
        double d9 = Math.max(IIllIIIlI.lIl(d2, d8), d8);
        return d5 * (d6 + (d9 - d8) * 0.5);
    }

    public static int IIIl(int n, int n2, int n3) {
        return Math.max(n2, Math.min(n3, n));
    }

    public static double IIlI(double d, double d2, double d3, double d4) {
        double d5 = IIllIIIlI.lIl(d, 0.0);
        double d6 = IIllIIIlI.IlII(d3, 1.0);
        double d7 = IIllIIIlI.IlII(d4, 0.0);
        double d8 = Math.max(0.0, d6 - d7);
        double d9 = IIllIIIlI.lIl(d2, d8);
        return d5 * Math.max(d9, d8);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static lIIlIlII IIll(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = Double.isFinite(d) ? d : 0.0;
        double d8 = Double.isFinite(d2) ? d2 : 0.0;
        double d9 = Double.isFinite(d3) ? Math.max(0.0, d3) : 0.0;
        double d10 = Double.isFinite(d4) ? Math.max(0.0, d4) : 0.0;
        double d11 = Double.isFinite(d5) ? Math.max(0.0, d5) : 0.0;
        double d12 = Double.isFinite(d6) ? Math.max(0.0, d6) : 0.0;
        double d13 = Math.max(0.0, d11 - d9);
        double d14 = Math.max(0.0, d12 - d10);
        return new lIIlIlII(IIllIIIlI.ll(d7, 0.0, d13), IIllIIIlI.ll(d8, 0.0, d14), d9, d10);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static double IlII(double d, double d2) {
        double d3;
        block1: {
            if (!Double.isFinite(d)) break block1;
            d3 = d;
            return d3;
        }
        d3 = d2;
        return d3;
    }

    private static int IlIl(int n, int n2) {
        return I[n ^ 0xBCA1606B] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1287107598;
        byte[] byArray = "\u00af\u00a1)\u00a43\bK\u009a\u008fZNKso\n\u00c5:\u00ec\u0017&\u0085Q\u00c3\u0015\u00b3a1\u00d4\u00ebo,O\u00d9\u00cc\u009b94\u000e\u00bbW\u00a7\u00b03\u00efj\u0012\u00a5l@\u00ab\u00fd`t\u008b\u0006\u00dd".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        I = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IIllIIIlI.I[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

