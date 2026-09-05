/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIllI
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
import orchard.internal.lllIIII;

@Environment(value=EnvType.CLIENT)
public final class lIlIllI {
    private static final double I = 1.6E-4;
    private static final double l = 0.0042;
    private static final double II = 0.0027;
    private static final int[] Il;

    private static Color I(Color color, double d, int n) {
        double d2 = lIlIllI.IlI(d);
        Color color2 = lIlIllI.IIl(color, 0.72);
        Color color3 = lIlIllI.IIl(color, 1.28);
        return lIlIllI.Ill(lIlIllI.llI(color2, color3, d2), n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Color l(Color color, double d) {
        Color color2 = color == null ? Color.WHITE : color;
        return lIlIllI.Ill(color2, (int)Math.round((double)color2.getAlpha() * Math.max(0.0, d)));
    }

    private static int II(int n) {
        return Math.max(0, Math.min(255, n));
    }

    private lIlIllI() {
    }

    private static Color Il(Color color, double d, int n) {
        double d2 = (double)System.currentTimeMillis() * 0.0027 + d * 2.2;
        Color color2 = lIlIllI.Ill(new Color(92, 236, 255), n);
        Color color3 = lIlIllI.Ill(new Color(175, 116, 255), n);
        Color color4 = lIlIllI.Ill(lIlIllI.IIl(color, 1.18), n);
        Color color5 = lIlIllI.llI(color2, color3, 0.5 + 0.5 * Math.sin(d2));
        return lIlIllI.Ill(lIlIllI.llI(color4, color5, 0.42 + 0.28 * Math.cos(d2 * 0.7)), n);
    }

    private static Color lI(float f, float f2, float f3, int n) {
        int n2 = Color.HSBtoRGB(f, f2, f3);
        return new Color(n2 >> 16 & 0xFF, n2 >> 8 & 0xFF, n2 & 0xFF, lIlIllI.II(n));
    }

    private static Color ll(double d, int n) {
        float f = (float)(((double)System.currentTimeMillis() * 1.6E-4 + d * 0.173) % 1.0);
        return lIlIllI.lI(f, 0.78f, 1.0f, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Color III(Color color, lllIIII lllIIII2, double d) {
        int n = color == null ? 255 : color.getAlpha();
        return lIlIllI.lII(color, lllIIII2, d, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Color IIl(Color color, double d) {
        Color color2 = color == null ? Color.WHITE : color;
        return new Color(lIlIllI.II((int)Math.round((double)color2.getRed() * d)), lIlIllI.II((int)Math.round((double)color2.getGreen() * d)), lIlIllI.II((int)Math.round((double)color2.getBlue() * d)), color2.getAlpha());
    }

    public static double IlI(double d) {
        return 0.5 + 0.5 * Math.sin((double)System.currentTimeMillis() * 0.0042 + d * 5.0);
    }

    public static Color Ill(Color color, int n) {
        Color color2 = color != null ? color : Color.WHITE;
        return new Color(color2.getRed(), color2.getGreen(), color2.getBlue(), lIlIllI.II(n));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static Color lII(Color color, lllIIII lllIIII2, double d, int n) {
        Color color2;
        Color color3 = color == null ? new Color(255, 255, 255, n) : lIlIllI.Ill(color, n);
        switch ((lllIIII2 == null ? lllIIII.l : lllIIII2).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 2: {
                color2 = lIlIllI.I(color3, d, n);
                return color2;
            }
            case 1: {
                color2 = lIlIllI.ll(d, n);
                return color2;
            }
            case 3: {
                color2 = lIlIllI.Il(color3, d, n);
                return color2;
            }
            case 0: 
        }
        color2 = color3;
        return color2;
    }

    public static Color lIl(Color color, lllIIII lllIIII2, double d) {
        return lIlIllI.III(color, lllIIII2, d + 0.19);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Color llI(Color color, Color color2, double d) {
        Color color3 = color == null ? Color.WHITE : color;
        Color color4 = color2 == null ? Color.WHITE : color2;
        double d2 = Math.max(0.0, Math.min(1.0, d));
        return new Color(lIlIllI.II((int)Math.round((double)color3.getRed() + (double)(color4.getRed() - color3.getRed()) * d2)), lIlIllI.II((int)Math.round((double)color3.getGreen() + (double)(color4.getGreen() - color3.getGreen()) * d2)), lIlIllI.II((int)Math.round((double)color3.getBlue() + (double)(color4.getBlue() - color3.getBlue()) * d2)), lIlIllI.II((int)Math.round((double)color3.getAlpha() + (double)(color4.getAlpha() - color3.getAlpha()) * d2)));
    }

    private static int lll(int n, int n2) {
        return Il[n ^ 0xABB2454D] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1614330387;
        byte[] byArray = "\u008c6z\u007fNgD\u00c7\u00d0\u0089\u00ee&x\u00fd\b2\u00a2;lD^b\u00ba\\w\u0087\u00ff8\u001f4w\u00b5\u009d\u00ff(\u001e{EB\u0089\u009c?\u00953F\u00d8d=\b\f\u00ff\u00e8!\u009e\u0099\u008c\u00c7\u0017\u0006/\u009a\u000ey\u00e2".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        Il = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            lIlIllI.Il[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

