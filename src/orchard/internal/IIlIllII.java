/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIllII
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

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;

@Environment(value=EnvType.CLIENT)
final class IIlIllII {
    private final byte[] I;
    private final long l;
    private final int II;
    private static final int[] Il;

    private String I() {
        byte[] byArray = this.lI();
        try {
            String string = new String(byArray, StandardCharsets.UTF_8);
            return string;
        }
        finally {
            Arrays.fill(byArray, (byte)0);
        }
    }

    private static byte l(long l2, int n) {
        long l3 = l2 + -7046029254386353131L * ((long)(n >>> 3) + 1L);
        long l4 = IIlIllII.Il(l3);
        return (byte)(l4 >>> ((n & 7) << 3));
    }

    private IIlIllII(byte[] byArray, long l2, int n) {
        this.I = byArray;
        this.l = l2;
        this.II = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static IIlIllII II(byte[] byArray, int n, int n2) {
        long l2 = StringFactory.l.nextLong();
        byte[] byArray2 = new byte[n2];
        int n3 = 0;
        while (n3 < n2) {
            byArray2[n3] = (byte)(byArray[n + n3] ^ IIlIllII.l(l2, n3));
            ++n3;
        }
        return new IIlIllII(byArray2, l2, StringFactory.III(byArray, n, n + n2));
    }

    private static long Il(long l2) {
        l2 = (l2 ^ l2 >>> 30) * -4658895280553007687L;
        l2 = (l2 ^ l2 >>> 27) * -7723592293110705685L;
        return l2 ^ l2 >>> 31;
    }

    /*
     * Enabled aggressive block sorting
     */
    private byte[] lI() {
        byte[] byArray = new byte[this.I.length];
        int n = 0;
        while (n < this.I.length) {
            byArray[n] = (byte)(this.I[n] ^ IIlIllII.l(this.l, n));
            ++n;
        }
        return byArray;
    }

    private static int ll(int n, int n2) {
        return Il[n ^ 0xFFEF34F4] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -403325657;
        byte[] byArray = "\u00d8\u00ba\u00bb\u00f9\u008a\u0090\u00cb\u0000\u00f0v\u001d\u00ee\u00f2\u00c3\u00ef`".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        Il = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IIlIllII.Il[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

