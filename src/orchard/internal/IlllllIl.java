/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllllIl
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

import java.util.function.BooleanSupplier;
import orchard.internal.IIlIIllI;
import orchard.internal.IIllllI;

public final class IlllllIl {
    public static final float I = 0.12f;
    public static final double l = 0.02;
    public static final double II = 0.25;
    private static final int[] Il;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static boolean I(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        double d14 = Math.max(0.0, d13);
        double d15 = d14 * d14;
        double d16 = 0.0;
        double d17 = 1.0;
        int n = 0;
        boolean bl = true;
        while (true) {
            double d18;
            if (!bl || (bl = false) || !true) {
                ++n;
            }
            if (n < 28) {
                double d19;
                d18 = (d16 * 2.0 + d17) / 3.0;
                double d20 = (d16 + d17 * 2.0) / 3.0;
                double d21 = IlllllIl.IlI(d18, d, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12);
                if (d21 <= (d19 = IlllllIl.IlI(d20, d, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12))) {
                    d17 = d20;
                    continue;
                }
            } else {
                double d22 = (d16 + d17) * 0.5;
                if (Math.min(IlllllIl.IlI(0.0, d, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12), Math.min(IlllllIl.IlI(d22, d, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12), IlllllIl.IlI(1.0, d, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12))) <= d15) return true;
                return false;
            }
            d16 = d18;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean l(IIllllI iIllllI, IIllllI iIllllI2) {
        if (iIllllI == null) {
            return false;
        }
        if (iIllllI2 == null) {
            return true;
        }
        int n = iIllllI.I().compareTo(iIllllI2.I());
        if (n != 0) {
            if (n > 0) return true;
            return false;
        }
        if (iIllllI.l() != iIllllI2.l()) {
            return iIllllI.l();
        }
        int n2 = Double.compare(iIllllI.Il(), iIllllI2.Il());
        if (n2 != 0) {
            if (n2 >= 0) return false;
            return true;
        }
        int n3 = Double.compare(iIllllI.II(), iIllllI2.II());
        if (n3 != 0) {
            if (n3 < 0) return true;
            return false;
        }
        int n4 = Double.compare(iIllllI.ll(), iIllllI2.ll());
        if (n4 != 0) {
            if (n4 < 0) return true;
            return false;
        }
        if (iIllllI.lI() >= iIllllI2.lI()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean II(IIllllI iIllllI, IIllllI iIllllI2, double d) {
        if (iIllllI == null) {
            return false;
        }
        if (iIllllI2 == null) {
            return true;
        }
        int n = iIllllI.I().compareTo(iIllllI2.I());
        if (n != 0) {
            if (n <= 0) return false;
            return true;
        }
        if (iIllllI.l() != iIllllI2.l()) {
            return iIllllI.l();
        }
        double d2 = Math.max(0.0, d);
        if (iIllllI.Il() + d2 < iIllllI2.Il()) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean Il(boolean bl, BooleanSupplier booleanSupplier) {
        if (bl) {
            return true;
        }
        if (booleanSupplier == null) return false;
        if (!booleanSupplier.getAsBoolean()) return false;
        return true;
    }

    public static float lI(double d, boolean bl) {
        float f = (float)IlllllIl.lIl(d / 100.0, 0.0, 1.0);
        return !bl ? f : Math.min(f, 0.12f);
    }

    public static double ll(double d, int n, int n2, double d2, double d3) {
        double d4 = Math.max(0.0, d);
        double d5 = 5.0 + IlllllIl.IIII(d4) + d4 * 0.5 * (double)Math.max(0, n2);
        double d6 = Math.max(0.0, d2);
        double d7 = 2.0 + Math.max(0.0, d3) / 4.0;
        double d8 = IlllllIl.lIl(d6 - d5 / d7, d6 * 0.2, 20.0) / 25.0;
        d8 = IlllllIl.lIl(d8 - 0.15 * (double)Math.max(0, n), 0.0, 1.0);
        return d5 * (1.0 - d8);
    }

    public static double III(double d, double d2, double d3) {
        double d4 = Math.min(d, d2);
        double d5 = Math.max(d, d2);
        return d4 + (d5 - d4) * IlllllIl.lIl(d3, 0.0, 1.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double IIl(double d, double d2, double d3) {
        if (Double.isFinite(d) && Double.isFinite(d2) && Double.isFinite(d3) && !(d2 <= 1.0E-4) && !(d3 <= 0.0)) {
            return IlllllIl.lIl(d / d2, 0.0, Math.min(0.25, d3));
        }
        return 0.0;
    }

    private static double IlI(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13) {
        return IlllllIl.Ill(d2 - d5 * d, d3 - d6 * d, d4 - d7 * d, d8, d9, d10, d11, d12, d13);
    }

    public static double Ill(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
        double d10 = Math.max(d4 - d, Math.max(0.0, d - d7));
        double d11 = Math.max(d5 - d2, Math.max(0.0, d2 - d8));
        double d12 = Math.max(d6 - d3, Math.max(0.0, d3 - d9));
        return d10 * d10 + d11 * d11 + d12 * d12;
    }

    public static boolean lII(double d, double d2) {
        return d > Math.max(0.0, d2);
    }

    private static double lIl(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    public static double llI(double d) {
        return Math.max(0.0, d - 0.02);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static IIlIIllI lll(boolean bl, boolean bl2, boolean bl3) {
        IIlIIllI iIlIIllI;
        if (!bl) {
            return IIlIIllI.II;
        }
        if (bl2) {
            return IIlIIllI.l;
        }
        if (bl3) {
            iIlIIllI = IIlIIllI.lI;
            return iIlIIllI;
        }
        iIlIIllI = IIlIIllI.Il;
        return iIlIIllI;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double IIII(double d) {
        double d2 = Math.max(0.0, d);
        if (d2 <= 3.0) {
            return 4.0 * d2;
        }
        if (!(d2 <= 8.0)) return 22.0 + (d2 - 8.0);
        return 12.0 + 2.0 * (d2 - 3.0);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IIIl(boolean bl, boolean bl2) {
        if (!bl) return false;
        if (bl2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double IIlI(double d, double d2) {
        double d3 = Math.max(0.0, d);
        if (d2 > 0.0) {
            return 0.0;
        }
        if (!(d2 > -0.5)) return d3;
        if (!(d3 > 1.0)) return d3;
        return 1.0;
    }

    private IlllllIl() {
    }

    private static int IIll(int n, int n2) {
        return Il[n ^ 0xC49C92B9] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -344265477;
        byte[] byArray = "\u00f2\u00ad/\u00b9".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        Il = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IlllllIl.Il[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

