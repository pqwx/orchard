/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - sample
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 */
package orchard.internal;

import java.util.ArrayDeque;
import java.util.regex.Pattern;
import orchard.internal.IIIllIIll;
import orchard.internal.IlIlII;
import orchard.internal.IlIlIlIlI;

public final class lIlIIIII {
    public static final double I = 12.0;
    private static final int l = 2;
    private static final double II = 0.5;
    private int Il;
    private double lI;
    private static final int ll = 3;
    private static final double III = 2.0;
    private double IIl;
    public static final double IlI = 2.75;
    private double Ill;
    private static final Pattern lII;
    private long lIl = Long.MIN_VALUE;
    private long llI;
    private double lll = Double.NaN;
    private int IIII;
    private int IIIl;
    private static final double IIlI = 0.35;
    private static final double IIll = 3.0;
    private double IlII;
    private static final int IlIl = 20;
    private static String[] IllI;
    private final ArrayDeque<Long> Illl;
    public static final int lIII = 3;
    public static final int lIIl = 5;
    public static final int lIlI = 40;
    private double lIll;
    private static final int[] llII;
    private static final String[] llIl;
    private static final Object[] lllI;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean I(String string) {
        if (string == null) return false;
        if (!lII.matcher(string).matches()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public IlIlII l(IlIlIlIlI ilIlIlIlI, IIIllIIll iIIllIIll) {
        boolean bl;
        int n;
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        double d;
        boolean bl6;
        IIIllIIll iIIllIIll2;
        block21: {
            int n2;
            block19: {
                block20: {
                    block18: {
                        boolean bl7;
                        if (ilIlIlIlI == null) {
                            throw new IllegalArgumentException("sample");
                        }
                        IIIllIIll iIIllIIll3 = iIIllIIll2 = iIIllIIll == null ? IIIllIIll.ll : iIIllIIll;
                        if (ilIlIlIlI.Ill() == this.lIl) {
                            return this.lI(iIIllIIll2, ilIlIlIlI.Ill());
                        }
                        if (ilIlIlIlI.Ill() < this.lIl) {
                            this.Il();
                        }
                        long l2 = (bl7 = this.lIl != Long.MIN_VALUE) ? ilIlIlIlI.Ill() - this.lIl : 1L;
                        double d2 = 0.35 * (double)Math.min(Math.max(1L, l2), 40L);
                        this.lI = Math.max(0.0, this.lI - d2);
                        this.lIll = Math.max(0.0, this.lIll - d2);
                        bl6 = bl7 && l2 == 1L;
                        d = bl6 && lIlIIIII.II(ilIlIlIlI) ? lIlIIIII.III(this.IlII, this.Ill, this.IIl, ilIlIlIlI.III(), ilIlIlIlI.llI(), ilIlIlIlI.ll()) : Double.NaN;
                        boolean bl8 = bl6 && !ilIlIlIlI.l() && Double.isFinite(d);
                        bl5 = bl8 && ilIlIlIlI.IlI();
                        boolean bl9 = ilIlIlIlI.Ill() <= this.llI;
                        bl4 = false;
                        if (!bl8 || !(d >= 12.0)) {
                            double d3 = Double.isFinite(this.lll) ? Math.min(0.5, Math.max(0.0, this.lll) * 0.25) : 0.0;
                            double d4 = 2.75 + d3;
                            this.IIII = bl5 && !bl9 && d >= d4 ? ++this.IIII : 0;
                        } else {
                            this.llI = ilIlIlIlI.Ill() + 5L;
                            bl9 = true;
                            this.IIII = 0;
                            if (ilIlIlIlI.IlI()) {
                                bl4 = this.lII(ilIlIlIlI.Ill());
                            }
                        }
                        bl3 = ilIlIlIlI.lII() && ilIlIlIlI.IlI();
                        boolean bl10 = bl2 = ilIlIlIlI.lI() && ilIlIlIlI.IlI();
                        if (!bl3) break block18;
                        if (!bl6) break block19;
                        break block20;
                    }
                    n2 = 0;
                    break block21;
                }
                n2 = this.Il + 1;
                break block21;
            }
            n2 = this.Il = 1;
        }
        if (bl2) {
            n = !bl6 ? 1 : this.IIIl + 1;
        }
        n = 0;
        this.IIIl = n;
        boolean bl11 = this.Il >= 3;
        boolean bl12 = this.IIIl >= 20;
        boolean bl13 = bl = this.IIII >= 2;
        if (ilIlIlIlI.lIl()) {
            if (!ilIlIlIlI.II()) {
                this.lI += 1.25;
            }
            if (!ilIlIlIlI.I()) {
                this.lI += 1.5;
            }
            if (ilIlIlIlI.IIl()) {
                this.lI += 2.0;
            }
            if (bl11) {
                this.lIll += 0.8;
            }
            if (bl12) {
                this.lIll += 1.2;
            }
            if (bl) {
                this.lIll += 2.5;
            }
            if (bl4) {
                this.lIll += 2.5;
            }
            if (ilIlIlIlI.II() && ilIlIlIlI.I() && !ilIlIlIlI.IIl()) {
                this.lI = Math.max(0.0, this.lI - 3.0);
            }
            boolean bl14 = !(bl3 || bl2 || bl4 || bl5 && !(d < 2.75));
            boolean bl15 = bl14;
            if (bl15) {
                this.lIll = Math.max(0.0, this.lIll - 2.0);
            }
        }
        this.lI = Math.min(this.lI, iIIllIIll2.l() * 2.0);
        this.lIll = Math.min(this.lIll, iIIllIIll2.Il() * 2.0);
        this.lIl = ilIlIlIlI.Ill();
        if (lIlIIIII.II(ilIlIlIlI)) {
            this.IlII = ilIlIlIlI.III();
            this.Ill = ilIlIlIlI.llI();
            this.IIl = ilIlIlIlI.ll();
        }
        this.lll = Double.isFinite(ilIlIlIlI.Il()) ? Math.max(0.0, ilIlIlIlI.Il()) : Double.NaN;
        return this.lI(iIIllIIll2, ilIlIlIlI.Ill());
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean II(IlIlIlIlI ilIlIlIlI) {
        if (!Double.isFinite(ilIlIlIlI.III())) return false;
        if (!Double.isFinite(ilIlIlIlI.llI())) return false;
        if (!Double.isFinite(ilIlIlIlI.ll())) return false;
        return true;
    }

    public lIlIIIII() {
        this.llI = Long.MIN_VALUE;
        this.Illl = new ArrayDeque();
    }

    public void Il() {
        this.lI = 0.0;
        this.lIll = 0.0;
        this.lIl = Long.MIN_VALUE;
        this.lll = Double.NaN;
        this.llI = Long.MIN_VALUE;
        this.Illl.clear();
        this.Il = 0;
        this.IIIl = 0;
        this.IIII = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIlII lI(IIIllIIll iIIllIIll, long l2) {
        boolean bl;
        int n;
        int n2 = n = this.llI < l2 ? 0 : (int)Math.min(Integer.MAX_VALUE, this.llI - l2);
        if (!(this.lI >= iIIllIIll.l()) || !(this.lIll >= iIIllIIll.Il())) {
            bl = false;
            return new IlIlII(this.lI, this.lIll, bl, n);
        }
        bl = true;
        return new IlIlII(this.lI, this.lIll, bl, n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ll(long l2, long l3, long l4) {
        if (l4 < 0L) return false;
        if (l2 - l3 <= l4) return false;
        return true;
    }

    private static double III(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d4 - d;
        double d8 = d5 - d2;
        double d9 = d6 - d3;
        return Math.sqrt(d7 * d7 + d8 * d8 + d9 * d9);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIl(char[] cArray, long l2, int n) {
        int n2 = 0xCB294F89 ^ n;
        int n3 = 0;
        while (n3 < cArray.length) {
            n2 = n2 ^ (int)l2 ^ ~n3;
            n2 ^= n - n3 * cArray.length;
            n2 = -n2 * n | n3;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            int n4 = n3 & 0xFF;
            n = n << n4 | n >>> -n4;
            l2 ^= (long)n4;
            ++n3;
        }
        return new String(cArray);
    }

    private static void IlI() {
        lIlIIIII.IllI[0] = lIlIIIII.IIl(lIlIIIII.llI((short)62046, -231009589, '\u7c0f').toCharArray(), 76591L, -1633086475);
        lIlIIIII.IllI[1] = lIlIIIII.IIl(lIlIIIII.llI((short)15973, -401210898, '\u7c0e').toCharArray(), 62627L, 1630352828);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 12560;
        String string = "\ud630\u3c56\u2961\u2356\u1eda\uba5f\u29e5\uc0a2\uf144\u0879\u12d3\uaa8a\ue9ff\uf0d2\u3cba\uccd7\ub0c4\u2296\ua2c4\u5094\u0653\u2ace\u2037\u19d5\ua24f\uaaba\ubb3d\u2c5c\u826e\uc5b9\ud00a\ud60e";
        char[] cArray = "\u0018\b".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        block7: while (true) {
            int n3;
            int n4;
            block15: {
                int n5;
                int n6;
                char c;
                char[] cArray2;
                block16: {
                    block14: {
                        if (bl && !(bl = false) && true) break block14;
                        int n7 = n4;
                        int n8 = n3++;
                        cArray2[n8] = (char)(cArray2[n8] ^ n7 ^ n);
                        if (n3 < cArray2.length) break block15;
                        stringArray[n6] = new String(cArray2).intern();
                        n5 += c;
                        if (++n6 < cArray.length) break block16;
                        n2 = 0;
                    }
                    n6 = 0;
                    n5 = 0;
                    c = '\u0000';
                    if (n2 == 0) {
                        llIl = stringArray;
                        lllI = new Object[stringArray.length];
                        int n9 = -315699612;
                        byte[] byArray = "9\u0097ko\u001f\u00b9?\u00d8B%\u00d1\u0019qa\u00a6\u0091Q\u00d4\u00ce\u00b8".getBytes("ISO-8859-1");
                        int n10 = byArray.length / 4;
                        llII = new int[n10];
                        int n11 = 0;
                        int n12 = 0;
                        do {
                            int n13 = (byArray[n11] & 0xFF) << 24 | (byArray[n11 + 1] & 0xFF) << 16 | (byArray[n11 + 2] & 0xFF) << 8 | byArray[n11 + 3] & 0xFF;
                            lIlIIIII.llII[n12] = n13 ^= n9;
                            n11 += 4;
                        } while (++n12 < n10);
                        IllI = new String[2];
                        lIlIIIII.IlI();
                        lII = Pattern.compile("[A-Za-z0-9_]{1,16}");
                        return;
                    }
                }
                c = cArray[n6];
                cArray2 = string.substring(n5, n5 + c).toCharArray();
                n3 = 0;
            }
            switch (n3 % 6) {
                case 3: {
                    n4 = 70;
                    continue block7;
                }
                case 5: {
                    n4 = 45;
                    continue block7;
                }
                case 4: {
                    n4 = 115;
                    continue block7;
                }
                default: {
                    n4 = 9;
                    continue block7;
                }
                case 2: {
                    n4 = 50;
                    continue block7;
                }
                case 1: 
            }
            n4 = 105;
        }
    }

    public IlIlII Ill(IIIllIIll iIIllIIll) {
        return this.lI(iIIllIIll == null ? IIIllIIll.ll : iIIllIIll, this.lIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lII(long l2) {
        while (true) {
            if (this.Illl.isEmpty() || l2 - this.Illl.peekFirst() <= 40L) {
                this.Illl.addLast(l2);
                if (this.Illl.size() < 3) return false;
                return true;
            }
            this.Illl.removeFirst();
        }
    }

    private static int lIl(int n, int n2) {
        return llII[n ^ 0x45DCC625] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llI(short s, int n, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x7C0F;
        char[] cArray = llIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lllI[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIlIIIII.lllI[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x683C;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xE4D9;
            n6 ^= 0x4F4F;
            n6 ^= 0x879B;
            cArray[n5] = (char)((n6 += 24428) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

