/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIlIII
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

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class lIIIlIII {
    private static final int[] I;

    public static Color I(double d) {
        double d2 = Math.max(0.0, Math.min(1.0, d));
        return lIIIlIII.l(new Color(255, 64, 64), new Color(80, 220, 120), d2);
    }

    public static Color l(Color color, Color color2, double d) {
        double d2 = Math.max(0.0, Math.min(1.0, d));
        int n = (int)Math.round((double)color.getRed() + (double)(color2.getRed() - color.getRed()) * d2);
        int n2 = (int)Math.round((double)color.getGreen() + (double)(color2.getGreen() - color.getGreen()) * d2);
        int n3 = (int)Math.round((double)color.getBlue() + (double)(color2.getBlue() - color.getBlue()) * d2);
        int n4 = (int)Math.round((double)color.getAlpha() + (double)(color2.getAlpha() - color.getAlpha()) * d2);
        return new Color(n, n2, n3, n4);
    }

    public static int II(int n, int n2) {
        return Math.max(0, Math.min(255, n2)) << 24 | n & 0xFFFFFF;
    }

    public static Color Il(Color color, double d) {
        return lIIIlIII.l(color, Color.BLACK, d);
    }

    public static Color lI(int n, int n2) {
        double d = Math.max(0.0, Math.min(1.0, (double)n / (double)Math.max(1, n2)));
        return lIIIlIII.l(new Color(80, 220, 120), new Color(255, 64, 64), d);
    }

    private lIIIlIII() {
    }

    public static Color ll(Color color, double d) {
        return lIIIlIII.l(color, Color.WHITE, d);
    }

    public static Color III(Color color, int n) {
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), Math.max(0, Math.min(255, n)));
    }

    private static int IIl(int n, int n2) {
        return I[n ^ 0x7455276D] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 1265220295;
        byte[] byArray = "\u00ec\u00b2YG\u0007\u00e4\u00d8\u0097w\u00d2\u00ec\u00d3y\u008a\u00c0u8o\u00d6\u0012\u00cdFE\u00ef\u008aQ&n\u00d4#\u00a4\u00acX}`P#\u0091w>\u0017\\@\u0092<~\u00c5\u008c\u0013O\u007fhT=\\WJM\u00b7\u0098\u00af\u000f\"\u000e".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        I = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            lIIIlIII.I[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

