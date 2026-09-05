/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIlIl
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

import java.util.IdentityHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.lIllIIll;
import orchard.internal.lllIlllI;
import orchard.internal.llllIIIl;

@Environment(value=EnvType.CLIENT)
final class IIIIlIl {
    private static final IdentityHashMap<Object, Long> I;
    private static lIllIIll l;
    private static int II;
    private static long Il;
    private static long lI;
    private static final int[] ll;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static lIllIIll I(lllIlllI lllIlllI2) {
        return new lIllIIll(l.II(), l.ll(), l.Il(), l.I(), l.l(), lllIlllI2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static synchronized boolean l(Object object, long l2, int n) {
        if (!IIIIlIl.ll(object, l2)) return false;
        if (l.lI() != lllIlllI.Il) return false;
        if (l.Il() == n) {
            l = IIIIlIl.I(lllIlllI.II);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 714458797;
        byte[] byArray = "\u00da\u001a6\u0097\u00d5\u0005G\u00f1".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        ll = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IIIIlIl.ll[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
        II = -1;
        I = new IdentityHashMap();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static synchronized boolean II(int n, int n2) {
        if (II >= 0) return false;
        if (n != n2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static synchronized boolean Il(Object object, long l2, long l3) {
        if (!IIIIlIl.ll(object, l2)) return false;
        if (l.lI() != lllIlllI.I) return false;
        if (l3 > l.l()) {
            l = IIIIlIl.I(lllIlllI.Il);
            return true;
        }
        return false;
    }

    static synchronized void lI(int n) {
        II = n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean ll(Object object, long l2) {
        if (l == null) return false;
        if (l.II() != object) return false;
        if (l.I() != l2) return false;
        return true;
    }

    static synchronized void III(Object object, long l2) {
        if (IIIIlIl.ll(object, l2)) {
            l = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static synchronized void IIl(Object object, int n) {
        if (object == null) return;
        if (I.containsKey(object)) {
            return;
        }
        long l2 = ++lI;
        I.put(object, l2);
        Il = l2;
        II = n;
    }

    private IIIIlIl() {
    }

    static synchronized void IlI(int n) {
        if (II == n) {
            II = -1;
        }
    }

    static synchronized int Ill() {
        return II;
    }

    /*
     * Enabled aggressive block sorting
     */
    static synchronized void lII() {
        Il = 0L;
        II = -1;
        I.clear();
        l = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static synchronized boolean lIl(Object object, long l2, int n) {
        if (!IIIIlIl.IIIl(object, l2, n)) {
            return false;
        }
        lllIlllI lllIlllI2 = l.lI() == lllIlllI.ll ? lllIlllI.I : lllIlllI.lI;
        l = IIIIlIl.I(lllIlllI2);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static synchronized boolean llI(Object object, long l2, int n, int n2) {
        if (!IIIIlIl.ll(object, l2)) return false;
        if (l.lI() != lllIlllI.Il) return false;
        if (l.ll() != n) return false;
        if (l.Il() != n2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static synchronized llllIIIl lll(Object object, int n) {
        Long l2 = I.remove(object);
        if (l2 == null) {
            return llllIIIl.lI;
        }
        if (l2 != Il) return llllIIIl.l;
        if (II != n) return llllIIIl.l;
        Il = 0L;
        II = -1;
        return llllIIIl.II;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static synchronized boolean IIII(long l2) {
        if (l == null) return false;
        if (l.I() != l2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static synchronized boolean IIIl(Object object, long l2, int n) {
        if (!IIIIlIl.ll(object, l2)) {
            return false;
        }
        switch (l.lI().ordinal()) {
            case 0: {
                if (n != l.ll()) return false;
                return true;
            }
            default: {
                return false;
            }
            case 3: {
                if (n == l.Il()) return true;
                return false;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static synchronized boolean IIlI(Object object, int n, int n2, long l2, long l3) {
        if (object == null) return false;
        if (n < 0) return false;
        if (n > 8) return false;
        if (n2 < 0) return false;
        if (n2 > 8) return false;
        if (n == n2) return false;
        if (l != null && l.I() != l2) {
            return false;
        }
        l = new lIllIIll(object, n, n2, l2, l3, lllIlllI.ll);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static synchronized boolean IIll(Object object, int n) {
        Long l2 = I.remove(object);
        if (l2 != null && l2 == Il && II == n) {
            Il = 0L;
            II = -1;
            return true;
        }
        return false;
    }

    private static int IlII(int n, int n2) {
        return ll[n ^ 0x956FEA65] ^ n2 ^ n;
    }
}

