/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllIll
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

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.IIlIIIIIl;
import orchard.internal.IIllllll;
import orchard.internal.IllIIlI;
import orchard.internal.IllIllI;
import orchard.internal.lIIIIlI;
import orchard.internal.lIIlIllI;

@Environment(value=EnvType.CLIENT)
public final class llllIll {
    private static final long I = Long.MAX_VALUE;
    private final AtomicLong l;
    private final Deque<lIIIIlI> II = new ArrayDeque<lIIIIlI>();
    private static final int[] Il;

    /*
     * Enabled aggressive block sorting
     */
    public synchronized IllIllI I(Object object) {
        lIIIIlI lIIIIlI2 = this.II.peekFirst();
        if (object == null) return null;
        if (lIIIIlI2 == null) return null;
        if (lIIIIlI2.Ill.I() != object) {
            return null;
        }
        IllIllI illIllI = lIIIIlI2.ll;
        return illIllI;
    }

    public synchronized boolean l(Object object) {
        lIIIIlI lIIIIlI2 = this.lIl(object);
        if (lIIIIlI2 == null) {
            return false;
        }
        lIIIIlI2.II = null;
        return this.II.remove(lIIIIlI2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void II(IllIIlI illIIlI, lIIIIlI lIIIIlI2) {
        int n;
        lIIIIlI lIIIIlI3 = this.llll(lIIIIlI2);
        int n2 = n = lIIIIlI3 != null ? lIIIIlI3.lII : lIIIIlI2.III;
        IllIllI illIllI = lIIIIlI2.ll == IllIllI.II ? IllIllI.II : (lIIIIlI3 != null ? lIIIIlI3.ll : lIIIIlI2.lIl);
        lIIIIlI2.I = true;
        lIIIIlI2.lII = n;
        lIIIIlI2.ll = illIllI;
        illIIlI.I(illIllI, n);
        if (illIllI == IllIllI.II) {
            if (!illIIlI.lI(illIllI, n)) return;
        }
        this.II.remove(lIIIIlI2);
        lIIIIlI2.I = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized boolean Il(IIlIIIIIl iIlIIIIIl) {
        if (this.IIIIl(iIlIIIIIl) == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized void lI(IllIIlI illIIlI, IIlIIIIIl iIlIIIIIl, lIIlIllI lIIlIllI2) {
        lIIIIlI lIIIIlI2 = this.IIIIl(iIlIIIIIl);
        if (lIIIIlI2 == null) {
            return;
        }
        this.IIIII(lIIIIlI2);
        llllIll.IlII(lIIIIlI2);
        if (lIIlIllI2 == lIIlIllI.II) {
            this.II(illIIlI, lIIIIlI2);
        } else {
            this.II.removeFirst();
        }
        if (lIIlIllI2 == lIIlIllI.II) return;
        if (this.II.isEmpty()) return;
        lIIIIlI lIIIIlI3 = this.II.peekFirst();
        illIIlI.I(lIIIIlI3.ll, lIIIIlI3.lII);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void ll(lIIIIlI lIIIIlI2, int n, int n2) {
        int n3 = lIIIIlI2.ll == IllIllI.II && n2 >= 0 ? Math.max(1, n2) : n2;
        lIIIIlI2.lI = n3 < 0 ? Long.MAX_VALUE : (long)n + (long)n3;
        lIIIIlI2.l = lIIIIlI2.ll == IllIllI.II ? IIllllll.Il : llllIll.lIIl(n3);
    }

    public synchronized int III() {
        return this.II.size();
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized IIlIIIIIl IIl(IllIIlI illIIlI, Object object, int n, IllIllI illIllI, int n2, boolean bl, Runnable runnable) {
        lIIIIlI lIIIIlI2;
        int n3;
        lIIIIlI lIIIIlI3;
        block6: {
            block5: {
                if (!llllIll.lll(illIIlI, object, n, illIllI)) {
                    return new IIlIIIIIl(0L, object);
                }
                lIIIIlI lIIIIlI4 = this.lIl(object);
                lIIIIlI3 = this.II.peekFirst();
                if (lIIIIlI4 == null) break block5;
                if (lIIIIlI4 != lIIIIlI3) return new IIlIIIIIl(0L, object);
                if (lIIIIlI4.I) break block6;
            }
            int n4 = n3 = !this.II.isEmpty() || illIllI != IllIllI.II ? this.IIII(illIIlI) : illIIlI.Il();
        }
        return new IIlIIIIIl(0L, object);
        if (n3 == n) {
            if (illIllI != IllIllI.II) return new IIlIIIIIl(0L, object);
            if (illIIlI.l() == n) {
                return new IIlIIIIIl(0L, object);
            }
        }
        int n5 = (lIIIIlI2 = this.II.peekLast()) == null ? illIIlI.l() : lIIIIlI2.III;
        IllIllI illIllI2 = lIIIIlI2 == null ? llllIll.lIll(illIllI) : lIIIIlI2.lIl;
        lIIIIlI lIIIIlI5 = new lIIIIlI(new IIlIIIIIl(this.l.incrementAndGet(), object), n5, illIllI2, n3, lIIIIlI3 != null ? lIIIIlI3.ll : llllIll.lIll(illIllI), n, illIllI, bl, runnable);
        llllIll.ll(lIIIIlI5, illIIlI.II(), n2);
        this.II.addFirst(lIIIIlI5);
        if (n3 == n) {
            if (illIllI == IllIllI.II) return lIIIIlI5.Ill;
        }
        illIIlI.I(illIllI, n);
        return lIIIIlI5.Ill;
        boolean bl2 = lIIIIlI3.lII != n || lIIIIlI3.ll != illIllI;
        lIIIIlI3.lII = n;
        lIIIIlI3.ll = illIllI;
        lIIIIlI3.Il = bl;
        lIIIIlI3.II = runnable;
        llllIll.ll(lIIIIlI3, illIIlI.II(), n2);
        if (!bl2) return lIIIIlI3.Ill;
        illIIlI.I(illIllI, n);
        return lIIIIlI3.Ill;
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized boolean IlI(Object object, int n) {
        lIIIIlI lIIIIlI2 = this.II.peekFirst();
        if (object == null) return false;
        if (n < 0) return false;
        if (n > 8) return false;
        if (lIIIIlI2 == null) return false;
        if (lIIIIlI2.Ill.I() != object) return false;
        if (!lIIIIlI2.I) {
            lIIIIlI2.lII = n;
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized boolean Ill(Object object, int n, int n2, IIllllll iIllllll) {
        lIIIIlI lIIIIlI2 = this.lIl(object);
        if (lIIIIlI2 == null) return false;
        if (!this.llIl(lIIIIlI2.Ill, n, n2, iIllllll)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized boolean lII() {
        lIIIIlI lIIIIlI2 = this.II.peekFirst();
        if (lIIIIlI2 == null) return false;
        if (lIIIIlI2.ll != IllIllI.II) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIIIlI lIl(Object object) {
        lIIIIlI lIIIIlI2;
        if (object == null) {
            return null;
        }
        Iterator<lIIIIlI> iterator = this.II.iterator();
        do {
            if (!iterator.hasNext()) return null;
            lIIIIlI2 = iterator.next();
        } while (lIIIIlI2.Ill.I() != object);
        return lIIIIlI2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized boolean llI(Object object) {
        if (this.lIl(object) == null) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean lll(IllIIlI illIIlI, Object object, int n, IllIllI illIllI) {
        if (illIIlI == null) return false;
        if (object == null) return false;
        if (illIllI == null) return false;
        if (n < 0) return false;
        if (n > 8) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized int IIII(IllIIlI illIIlI) {
        int n;
        lIIIIlI lIIIIlI2 = this.II.peekFirst();
        if (lIIIIlI2 == null) {
            n = illIIlI.l();
            return n;
        }
        n = lIIIIlI2.lII;
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized void IIIl(IllIIlI illIIlI, Object object, lIIlIllI lIIlIllI2) {
        lIIIIlI lIIIIlI2 = this.lIl(object);
        if (lIIIIlI2 == null) {
            return;
        }
        if (lIIIIlI2 != this.II.peekFirst()) {
            this.II.remove(lIIIIlI2);
            llllIll.IlII(lIIIIlI2);
            return;
        }
        llllIll.IlII(lIIIIlI2);
        if (lIIlIllI2 == lIIlIllI.II) {
            this.II(illIIlI, lIIIIlI2);
        } else {
            this.II.removeFirst();
        }
        if (lIIlIllI2 == lIIlIllI.II) return;
        if (this.II.isEmpty()) return;
        lIIIIlI lIIIIlI3 = this.II.peekFirst();
        illIIlI.I(lIIIIlI3.ll, lIIIIlI3.lII);
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized boolean IIlI(IllIIlI illIIlI, IIlIIIIIl iIlIIIIIl, int n, IllIllI illIllI, int n2) {
        if (!llllIll.lll(illIIlI, iIlIIIIIl == null ? null : iIlIIIIIl.I(), n, illIllI)) return false;
        if (iIlIIIIIl.II() == 0L) return false;
        if (illIIlI.II() >= n2) {
            if (iIlIIIIIl.II() >= 0L) return this.lIlI(illIIlI, iIlIIIIIl, n2);
            return illIIlI.lI(illIllI, n);
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized boolean IIll() {
        if (this.II.isEmpty()) return false;
        return true;
    }

    private static void IlII(lIIIIlI lIIIIlI2) {
        Runnable runnable = lIIIIlI2.II;
        lIIIIlI2.II = null;
        if (runnable != null) {
            try {
                runnable.run();
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    private boolean IlIl(IllIIlI illIIlI, lIIIIlI lIIIIlI2) {
        if (!illIIlI.lI(lIIIIlI2.ll, lIIIIlI2.lII)) {
            return false;
        }
        lIIIIlI2.I = false;
        return this.II.remove(lIIIIlI2);
    }

    public synchronized void IllI() {
        this.II.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized int Illl(Object object) {
        lIIIIlI lIIIIlI2 = this.II.peekFirst();
        if (object == null) return -1;
        if (lIIIIlI2 == null) return -1;
        if (lIIIIlI2.Ill.I() != object) return -1;
        int n = lIIIIlI2.lII;
        return n;
    }

    public llllIll() {
        this.l = new AtomicLong();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized boolean lIII() {
        lIIIIlI lIIIIlI2 = this.II.peekFirst();
        if (lIIIIlI2 == null) return false;
        if (!lIIIIlI2.I) return false;
        return true;
    }

    private static IIllllll lIIl(int n) {
        return n <= 0 ? IIllllll.l : IIllllll.Il;
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized boolean lIlI(IllIIlI illIIlI, IIlIIIIIl iIlIIIIIl, int n) {
        lIIIIlI lIIIIlI2 = this.IIIIl(iIlIIIIIl);
        if (lIIIIlI2 == null) return false;
        if (lIIIIlI2 != this.II.peekFirst()) return false;
        if (lIIIIlI2.I) return false;
        if (illIIlI.II() < n) return false;
        if (!illIIlI.lI(lIIIIlI2.ll, lIIIIlI2.lII)) return false;
        return true;
    }

    private static IllIllI lIll(IllIllI illIllI) {
        return illIllI != IllIllI.II ? illIllI : IllIllI.II;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized boolean llII(Object object) {
        lIIIIlI lIIIIlI2 = this.II.peekFirst();
        if (object == null) return false;
        if (lIIIIlI2 == null) return false;
        if (lIIIIlI2.Ill.I() != object) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized boolean llIl(IIlIIIIIl iIlIIIIIl, int n, int n2, IIllllll iIllllll) {
        IIllllll iIllllll2;
        block4: {
            int n3;
            block2: {
                block3: {
                    block1: {
                        lIIIIlI lIIIIlI2 = this.IIIIl(iIlIIIIIl);
                        if (lIIIIlI2 == null) return false;
                        if (lIIIIlI2.I) {
                            return false;
                        }
                        n3 = lIIIIlI2.ll == IllIllI.II && n2 >= 0 ? Math.max(1, n2) : n2;
                        lIIIIlI2.Il = true;
                        long l2 = lIIIIlI2.lI = n3 < 0 ? Long.MAX_VALUE : (long)n + (long)n3;
                        if (iIllllll != null) break block1;
                        if (lIIIIlI2.ll != IllIllI.II) break block2;
                        break block3;
                    }
                    iIllllll2 = iIllllll;
                    break block4;
                }
                iIllllll2 = IIllllll.Il;
                break block4;
            }
            iIllllll2 = llllIll.lIIl(n3);
        }
        lIIIIlI2.l = iIllllll2;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized IIlIIIIIl lllI(IllIIlI illIIlI, Object object, int n, IllIllI illIllI, int n2, boolean bl, Runnable runnable) {
        if (!llllIll.lll(illIIlI, object, n, illIllI)) {
            return new IIlIIIIIl(0L, object);
        }
        lIIIIlI lIIIIlI2 = this.lIl(object);
        int n3 = this.II.isEmpty() && illIllI == IllIllI.II ? illIIlI.Il() : this.IIII(illIIlI);
        if (lIIIIlI2 != null) return this.IIl(illIIlI, object, n, illIllI, n2, bl, runnable);
        if (n3 != n) return this.IIl(illIIlI, object, n, illIllI, n2, bl, runnable);
        if (illIllI != IllIllI.II) return new IIlIIIIIl(-1L, object);
        if (illIIlI.l() != n) return this.IIl(illIIlI, object, n, illIllI, n2, bl, runnable);
        return new IIlIIIIIl(-1L, object);
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIIIlI llll(lIIIIlI lIIIIlI2) {
        boolean bl = false;
        Iterator<lIIIIlI> iterator = this.II.iterator();
        while (iterator.hasNext()) {
            lIIIIlI lIIIIlI3 = iterator.next();
            if (bl) {
                return lIIIIlI3;
            }
            bl = lIIIIlI3 == lIIIIlI2;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void IIIII(lIIIIlI lIIIIlI2) {
        while (!this.II.isEmpty()) {
            lIIIIlI lIIIIlI3 = this.II.peekFirst();
            if (lIIIIlI3 == lIIIIlI2) return;
            this.II.removeFirst();
            llllIll.IlII(lIIIIlI3);
        }
    }

    /*
     * Unable to fully structure code
     */
    private lIIIIlI IIIIl(IIlIIIIIl var1_1) {
        block4: {
            block3: {
                block5: {
                    if (var1_1 == null) break block4;
                    break block5;
                    return var3_3;
                    {
                        var3_3 = var2_2.next();
                        if (var3_3.Ill.II() == var1_1.II() && var3_3.Ill.I() == var1_1.I()) ** continue;
lbl7:
                        // 2 sources

                        while (var2_2.hasNext()) {
                            continue block1;
                        }
                        break block3;
                    }
                }
                if (!var1_1.l()) break block4;
                var2_2 = this.II.iterator();
                ** GOTO lbl7
            }
            return null;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized void IIIlI(IllIIlI illIIlI, IIllllll iIllllll) {
        lIIIIlI lIIIIlI2;
        while ((lIIIIlI2 = this.II.peekFirst()) != null) {
            if (lIIIIlI2.I) {
                if (this.IlIl(illIIlI, lIIIIlI2)) continue;
                return;
            }
            if (!lIIIIlI2.I(illIIlI.II(), iIllllll)) {
                return;
            }
            boolean bl = lIIIIlI2.Il;
            llllIll.IlII(lIIIIlI2);
            if (bl) {
                this.II(illIIlI, lIIIIlI2);
                if (lIIIIlI2.I) {
                    return;
                }
            } else {
                this.II.removeFirst();
            }
            if (bl || this.II.isEmpty()) continue;
            lIIIIlI lIIIIlI3 = this.II.peekFirst();
            illIIlI.I(lIIIIlI3.ll, lIIIIlI3.lII);
        }
        return;
    }

    private static int IIIll(int n, int n2) {
        return Il[n ^ 0x3F57F83C] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 332298598;
        byte[] byArray = "}\u0019\u00a0\u00b5\u00ba\u00f4\u00c3(".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        Il = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            llllIll.Il[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

