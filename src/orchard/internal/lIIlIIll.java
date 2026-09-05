/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIlIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 */
package orchard.internal;

public final class lIIlIIll {
    private int I = -1;
    private long l = Long.MIN_VALUE;

    public static int I(long l2) {
        return Math.max(0, (int)Math.ceil((double)Math.max(0L, l2) / 50.0));
    }

    public void l() {
        this.I = -1;
        this.l = Long.MIN_VALUE;
    }

    public void II(int n, long l2, long l3) {
        this.I = n;
        this.l = l2 + Math.max(0L, l3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Il(int n) {
        if (this.I != n) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean lI(int n, long l2) {
        if (this.I != n) return false;
        if (l2 < this.l) return false;
        return true;
    }
}

