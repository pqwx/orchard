/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIll
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

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
final class lIIIll {
    private final int I;
    private final long l;
    private static final int[] II;

    private lIIIll(long l2, int n) {
        this.l = l2;
        this.I = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        if (object instanceof String) {
            String string = (String)object;
            if (string.codePointCount(0, string.length()) != this.I) return false;
            if (StringFactory.I(string) != this.l) return false;
            return true;
        }
        if (!(object instanceof IIIlIIIII)) return false;
        IIIlIIIII iIIlIIIII = (IIIlIIIII)object;
        if (iIIlIIIII.IIll() != this.I) return false;
        if (iIIlIIIII.llII() != this.l) return false;
        return true;
    }

    private static lIIIll I(IIIlIIIII iIIlIIIII) {
        return new lIIIll(iIIlIIIII.llII(), iIIlIIIII.IIll());
    }

    public int hashCode() {
        return Long.hashCode(this.l) * 31 + this.I;
    }

    private static int l(int n, int n2) {
        return II[n ^ 0x75064B81] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -686028570;
        byte[] byArray = "u7\u00c5\u00d4".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        II = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            lIIIll.II[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

