/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIlIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - textures/k3p9x1/
 *   - 7im0nf9t53qi
 *   - zq152pti0324
 *   - n3orcqujlg8t
 *   - 1meygl992oqu
 *   - s9o7m943f5cq
 *   - 3p5mp46oy474
 *   - i67tr3m5aamt
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.Identifier
 */
package orchard.internal;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;
import orchard.core.Category;
import orchard.core.StringFactory;
import orchard.core.Theme;
import orchard.internal.IIIlI;
import orchard.internal.IIIlIIIII;
import orchard.internal.Illl;
import orchard.internal.lIIIll;
import orchard.module.iface.Interface;

@Environment(value=EnvType.CLIENT)
public final class IIIIlIIII {
    private static final IIIlIIIII I;
    private static final int l = -12170926;
    private static final IIIlIIIII II;
    static final IIIlIIIII Il;
    static final int lI = 10;
    private static final double ll = 16.0;
    private static final IIIlIIIII III;
    private static final int IIl = -12960442;
    private static final IIIlIIIII IlI;
    private static final int Ill = -14013131;
    private static final IIIlIIIII lII;
    private static final double lIl = 8.0;
    private static final IIIlIIIII llI;
    private static final int lll = -1340993006;
    private static final IIIlIIIII IIII;
    private static final IIIlIIIII IIIl;
    static final int IIlI = 112;
    private static final IIIlIIIII IIll;
    private TextRenderer IlII;
    private static final IIIlIIIII IlIl;
    private Interface IllI;
    private static final lIIIll Illl;
    static final int lIII = 25;
    private DrawContext lIIl;
    private static final IIIlIIIII lIlI;
    private static final IIIlIIIII lIll;
    private static final double llII = 12.0;
    private static final IIIlIIIII llIl;
    private static final IIIlIIIII lllI;
    private static final int[] llll;
    private static final String[] IIIII;
    private static final Object[] IIIIl;

    /*
     * Enabled aggressive block sorting
     */
    void I(double d, double d2, double d3, double d4, double d5, Theme theme, boolean bl, double d6) {
        int n = (int)Math.round(IIIIlIIII.IIII(d6, 0.0, 1.0) * 255.0);
        if (n <= 0) return;
        if (d3 <= 0.0) return;
        if (d4 <= 0.0) return;
        if (d5 <= 0.0) {
            return;
        }
        double d7 = 5.5;
        IIIlI.Illl(this.lIIl, d, d2, d3, d4, d7, this.IIIIIl(n));
        IIIlI.IllllI(this.lIIl, d, d2, d3, d4, d7, !bl ? this.llIlI((int)((double)n * 0.62)) : this.lIll(Math.min(n, 210)));
        double d8 = 2.0;
        double d9 = Math.max(1.0, Math.min(d5 - d8, d4 - d8 * 2.0));
        Color color = theme.ll() != null ? theme.ll() : this.IllI.lIlI();
        Color color2 = theme.lII() == null ? this.IllI.IIlII() : theme.lII();
        IIIlI.IIlIIl(this.lIIl, d + d8, d2 + d8, Math.max(1.0, d3 - d8 * 2.0), d9, 4.0, IIIIlIIII.lllIl(color, n), IIIIlIIII.lllIl(color2, n));
    }

    /*
     * Enabled aggressive block sorting
     */
    void l(double d, double d2, double d3, double d4, IIIlIIIII iIIlIIIII, boolean bl, double d5) {
        IIIlIIIII iIIlIIIII2 = iIIlIIIII == null ? StringFactory.lIl("") : iIIlIIIII;
        int n = bl ? -12960442 : -14013131;
        int n2 = -12170926;
        int n3 = -1;
        double d6 = Math.min(IIIlI.lIIlIl(), d4 * 0.5);
        IIIlI.Illl(this.lIIl, d, d2, d3, d4, d6, n);
        IIIlI.IllllI(this.lIIl, d, d2, d3, d4, d6, n2);
        double d7 = IIIlI.lllI();
        double d8 = d5 <= 0.0 ? 1.0 : d5;
        double d9 = Math.max(0.0, d3 - d7 * 2.0) / d8;
        IIIlIIIII iIIlIIIII3 = this.IIIll(iIIlIIIII2, d9);
        double d10 = (double)this.lIlIl(iIIlIIIII3) * d8;
        double d11 = d + (d3 - d10) * 0.5;
        double d12 = d2 + (d4 - IIIlI.IllIII(this.IlII) * d8) * 0.5;
        this.Illll(iIIlIIIII3, d11, d12, n3, d8);
    }

    int II() {
        return IIIIlIIII.lllIl(this.IllI.llIl(), 218);
    }

    void Il(double d, double d2, double d3, double d4, boolean bl, boolean bl2) {
        this.IIlIl(d, d2, d3, d4, bl, bl2, 1.0);
    }

    void lI(double d, double d2, double d3, boolean bl, boolean bl2) {
        this.Il(d, d2, d3, 25.0, bl, bl2);
    }

    public void ll(int n, int n2) {
    }

    void III(double d, double d2, int n) {
        this.IIIlIl(IIIIlIIII.IIIllI(II), d, d2, 14.0, n);
    }

    int IIl() {
        return IIIIlIIII.lllIl(this.IllI.IIIllI(), 252);
    }

    void IlI(double d, double d2, double d3, double d4, String string) {
        this.llIll(d, d2, d3, d4, string, true, 1.0);
    }

    private double Ill(double d, double d2) {
        return d + Math.max(0.0, (d2 - IIIlI.IllIII(this.IlII)) * 0.5);
    }

    int lII() {
        return IIIIlIIII.lllIl(this.IllI.IlIIl(), 248);
    }

    void lIl(IIIlIIIII iIIlIIIII, double d, double d2, double d3, int n, double d4) {
        double d5 = d3 / d4;
        this.Illll(this.IIIll(iIIlIIIII, d5), d, d2, n, d4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void llI(String string, double d, double d2, int n, double d3) {
        if (string == null || string.isBlank()) {
            return;
        }
        if (d3 == 1.0) {
            this.IllI(string, d, d2, n);
            return;
        }
        IIIlI.lIlIIl(this.lIIl);
        try {
            IIIlI.Ill(this.lIIl, d, d2);
            IIIlI.IIlll(this.lIIl, d3, d3);
            IIIlI.IlIIll(this.lIIl, this.IlII, string, 0.0, 0.0, n);
        }
        finally {
            IIIlI.IlIllI(this.lIIl);
        }
    }

    private static double lll(double d, double d2, double d3) {
        double d4 = 6.0;
        return d + IIIIlIIII.IIII(d2 * d3, d4, Math.max(d4, d2 - d4));
    }

    static double IIII(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    void IIIl(double d, double d2, int n) {
        this.IIIlIl(IIIIlIIII.IIIllI(Il), d, d2, 14.0, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    int IIlI(String string) {
        if (string == null) return 0;
        if (!string.isEmpty()) return IIIlI.IIIlll(this.IlII, string);
        return 0;
    }

    void IIll(double d, double d2, double d3, Theme theme, boolean bl) {
        this.lIIIl(d, d2, d3, theme, bl, 1.0);
    }

    private void IlIl(double d, double d2, double d3, String string) {
        this.lIllI(d, d2, d3, string, 1.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    void IllI(String string, double d, double d2, int n) {
        block0: {
            if (string == null) return;
            if (string.isBlank()) break block0;
        }
        return;
        int n2 = Illl.equals(string) ? this.IIlIIl() : n;
        IIIlI.IlIIll(this.lIIl, this.IlII, string, d, d2, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    void Illl(IIIlIIIII iIIlIIIII, double d, double d2, int n) {
        if (iIIlIIIII == null) return;
        if (iIIlIIIII.lIlI()) {
            return;
        }
        int n3 = Illl.equals(iIIlIIIII) ? this.IIlIIl() : n;
        double[] dArray = new double[]{d};
        iIIlIIIII.llI(n2 -> {
            String string = IIIIlIIII.llll(n2);
            IIIlI.IlIIll(this.lIIl, this.IlII, string, dArray[0], d2, n3);
            dArray[0] = dArray[0] + (double)this.IIlI(string);
        });
    }

    void lIII(double d, double d2, double d3, double d4, double d5, String string) {
        this.llIl(d, d2, d3, d4, d5, string, 1.0);
    }

    void lIIl(IIIlIIIII iIIlIIIII, double d, double d2, int n, double d3) {
        IIIlIIIII iIIlIIIII2 = this.IIIll(iIIlIIIII, d3);
        this.Illl(iIIlIIIII2, d - (double)this.lIlIl(iIIlIIIII2) * 0.5, d2, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    void lIlI(DrawContext drawContext, TextRenderer textRenderer, Interface interface_) {
        this.lIIl = drawContext;
        this.IlII = textRenderer;
        this.IllI = interface_;
    }

    int lIll(int n) {
        return IIIIlIIII.lllIl(this.IllI.lIlI(), n);
    }

    IIIIlIIII() {
    }

    private static String llII() {
        return "textures/k3p9x1/";
    }

    /*
     * Enabled aggressive block sorting
     */
    void llIl(double d, double d2, double d3, double d4, double d5, String string, double d6) {
        double d7 = IIIIlIIII.IIII(Math.min(d4, d5), 0.0, 1.0);
        double d8 = IIIIlIIII.IIII(Math.max(d4, d5), 0.0, 1.0);
        double d9 = d2 + 16.0;
        double d10 = 6.0;
        double d11 = IIIIlIIII.lll(d, d3, d7);
        double d12 = IIIIlIIII.lll(d, d3, d8);
        double d13 = d11 - d10;
        double d14 = Math.max(12.0, d12 - d11 + 12.0);
        IIIlI.Illl(this.lIIl, d, d9, d3, 12.0, d10, 0x30FFFFFF);
        IIIlI.Illl(this.lIIl, d13, d9, d14, 12.0, d10, this.IIlIIl());
        IIIlI.Illl(this.lIIl, d11 - 4.0, d9 + 2.0, 8.0, 8.0, 4.0, -1);
        IIIlI.Illl(this.lIIl, d12 - 4.0, d9 + 2.0, 8.0, 8.0, 4.0, -1);
        this.lIllI(d, d2, d3, string, d6);
    }

    /*
     * Enabled aggressive block sorting
     */
    static Color lllI(Color color, Color color2, double d) {
        double d2 = IIIIlIIII.IIII(d, 0.0, 1.0);
        Color color3 = color != null ? color : Color.WHITE;
        Color color4 = color2 != null ? color2 : Color.WHITE;
        return new Color((int)Math.round((double)color3.getRed() + (double)(color4.getRed() - color3.getRed()) * d2), (int)Math.round((double)color3.getGreen() + (double)(color4.getGreen() - color3.getGreen()) * d2), (int)Math.round((double)color3.getBlue() + (double)(color4.getBlue() - color3.getBlue()) * d2), (int)Math.round((double)color3.getAlpha() + (double)(color4.getAlpha() - color3.getAlpha()) * d2));
    }

    private static String llll(int n) {
        return new String(Character.toChars(n));
    }

    int IIIII(int n) {
        return IIIIlIIII.lllIl(IIIIlIIII.lllI(this.IllI.IlIIl(), this.IllI.lIllI(), 0.055), n);
    }

    /*
     * Enabled aggressive block sorting
     */
    void IIIlI(Illl illl, double d, double d2, double d3, double d4, boolean bl) {
        int n = bl ? -12960442 : -14013131;
        int n2 = bl ? this.llIII() : this.II();
        double d5 = d4;
        double d6 = d2 + Math.max(0.0, (d4 - d5) * 0.5);
        IIIlI.Illl(this.lIIl, d, d6, d3, d5, IIIlI.lIIlIl(), n);
        double d7 = 14.0;
        double d8 = IIIlI.lllI();
        IIIlIIIII iIIlIIIII = this.IIIll(illl.l(), Math.max(0.0, d3 - d7 - d8 - IIIlI.lllI() * 2.0));
        double d9 = d7 + d8 + (double)this.lIlIl(iIIlIIIII);
        double d10 = d + Math.max(IIIlI.lllI(), (d3 - d9) * 0.5);
        this.IIIlIl(IIIIlIIII.IIIllI(switch (illl) {
            default -> IlI;
            case orchard.internal.Illl.I -> IIll;
            case orchard.internal.Illl.II -> lllI;
            case orchard.internal.Illl.lI -> lIll;
            case orchard.internal.Illl.ll -> IIII;
        }), d10, d6 + (d5 - d7) * 0.5, d7, n2);
        this.Illl(iIIlIIIII, d10 + d7 + d8, this.Ill(d6, d5), n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    IIIlIIIII IIIll(IIIlIIIII iIIlIIIII, double d) {
        if (iIIlIIIII == null) return StringFactory.lIl("");
        if (iIIlIIIII.lll()) return StringFactory.lIl("");
        if (!(d <= 0.0)) {
            if ((double)this.lIlIl(iIIlIIIII) <= d) {
                return iIIlIIIII;
            }
        } else {
            return StringFactory.lIl("");
        }
        int n = this.lIlIl(lII);
        int[] nArray = new int[]{0};
        int[] nArray2 = new int[]{0};
        boolean[] blArray = new boolean[]{true};
        iIIlIIIII.llI(n2 -> {
            if (!blArray[0]) {
                return;
            }
            int n3 = this.IIlI(IIIIlIIII.llll(n2));
            if (!((double)(nArray2[0] + n3 + n) > d)) {
                nArray[0] = nArray2[0] + n3;
                nArray2[0] = nArray[0] + 1;
                return;
            }
            blArray[0] = false;
        });
        return iIIlIIIII.II(nArray[0]).llIl(lII);
    }

    void IIlII(double d, double d2, double d3, double d4, boolean bl) {
        IIIlI.lI(this.lIIl, d, d2, d3, d4, 10.0, 0x68000000, 8.0, 6, 0.45);
        IIIlI.Illl(this.lIIl, d, d2, d3, d4, 10.0, -1340993006);
    }

    /*
     * Enabled aggressive block sorting
     */
    void IIlIl(double d, double d2, double d3, double d4, boolean bl, boolean bl2, double d5) {
        double d6 = IIIIlIIII.IIII(d5, 0.0, 1.0);
        int n = (int)(255.0 * d6);
        int n2 = IIIIlIIII.IlIIl(!bl ? -14013131 : -12960442, n);
        IIIlI.Illl(this.lIIl, d, d2, d3, d4 - 2.0, 5.5, n2);
        if (!bl2) return;
        int n3 = (int)(220.0 * d6);
        IIIlI.Illl(this.lIIl, d + 1.5, d2 + 6.0, 2.0, Math.max(2.0, d4 - 14.0), 1.0, IIIIlIIII.IlIIl(this.IIlIIl(), n3));
    }

    /*
     * Enabled aggressive block sorting
     */
    void IIllI(double d, double d2, boolean bl) {
        IIIlI.lIIl(this.lIIl, d, d2, bl, bl ? -12960442 : -14013131, -1);
    }

    void IIlll(double d, double d2, int n) {
        this.IIIlIl(IIIIlIIII.IIIllI(III), d, d2, 14.0, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    private String IlIII(String string, double d) {
        String string2;
        int n;
        if (string == null || string.isEmpty() || (double)this.IIlI(string) <= d) {
            if (string == null) return "";
            String string3 = string;
            return string3;
        }
        int n2 = string.length();
        while (n2 > 0 && !Character.isDigit(n = string.codePointBefore(n2)) && n != 46) {
            if (n == 45 || n == 43) break;
            n2 -= Character.charCount(n);
        }
        if (n2 <= 0) return this.lIlII(string, d);
        if (n2 >= string.length()) {
            return this.lIlII(string, d);
        }
        String string4 = string.substring(n2);
        double d2 = this.IIlI(string4);
        if (d2 >= d) {
            return this.lIlII(string, d);
        }
        String string5 = this.lIlII(string.substring(0, n2), Math.max(0.0, d - d2));
        if (!string5.isBlank()) {
            String string6 = string4;
            String string7 = string5;
            string2 = string7 + string6;
            return string2;
        }
        string2 = string4;
        return string2;
    }

    private static int IlIIl(int n, int n2) {
        int n3 = Math.max(0, Math.min(255, n2));
        return n3 << 24 | n & 0xFFFFFF;
    }

    void IlIll(double d, double d2, double d3, double d4, IIIlIIIII iIIlIIIII, boolean bl) {
        this.l(d, d2, d3, d4, iIIlIIIII, bl, 1.0);
    }

    void IllII(double d, double d2, double d3, double d4, String string, boolean bl) {
        this.lIlll(d, d2, d3, d4, string, bl, 1.0);
    }

    void IllIl(double d, double d2, boolean bl, int n) {
        this.IIIlIl(IIIIlIIII.IIIllI(bl ? IlIl : I), d, d2, 14.0, n);
    }

    void IlllI(String string, double d, double d2, int n, double d3) {
        String string2 = this.lIlII(string, d3);
        this.IllI(string2, d - (double)this.IIlI(string2) * 0.5, d2, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 29125;
        String string = "\u791c\u7996\u79be\u791c\u7954\u797b\u79dc\u7990\u7945\u7977\u796b\u79c9\u7940\u798a\u7998\u79be\u792b\u79f7\u794a\u798c\u79bf\u792c\u7984\u79f9\u7b23\u7bc9\u7b83\u7b28\u7b70\u7b59\u7bed\u7bb1\u7b64\u7b46\u7b58\u7b8c\u3822\u38cd\u38f2\u3855\u9c67\u9c82\u9ca2\u9c60\u9c2c\u9c13\u9cab\u9cef\u9c3b\u9c1c\u9c45\u9cb8\u9c3d\u9ced\u9cbe\u9cce\u4967\u49c5\u49db\u4961\u4932\u4919\u49a6\u49e8\u4937\u4912\u496a\u49ae\u4920\u49fc\u49a6\u49cc\u5a6a\u5adf\u5aec\u5a43\u5a27\u5a22\u5aa4\u5ae1\u5a31\u5a04\u5a55\u5a82\u5a35\u5afa\u5af4\u5aca\uaa2f\uaa99\uaaf8\uaa35\uaa72\uaa77\uaac3\uaaa7\uaa65\uaa51\uaa5a\uaaff\uaa71\uaaca\uaabe\uaa8c\u2bf7\u2b7e\u2b6c\u2bfb\u2bad\u2b90\u2b69\u2b4c\u2ba8\u2b8b\u2be4\u2b2e\u2bbb\u2b7e\u2b2d\u2b41\ubd11\ubd9f\ubdc5\ubd1c\ubd58\ubd72\ubdd9\ubd8a\ubd4b\ubd7d\ubd3c\ubdde\ubd5f\ubde2\ubddc\ubda5\u591e\u59e5\u59c8\u5932\u5945\u5943\u59f4\u5998\u5950\u5962\u596e\u59c3\u5958\u59e9\u5999\u59bc\ud831\ud8d6\ud897\ud82d\ud868\ud855\ud8f1\ud8ac\ud86f\ud870\ud835\ud8e1\ud867\ud8c1\ud8b9\ud884\ufb20\ufb9e\ufb8c\ufb25\ufb64\ufb4e\ufbd7\ufba3\ufb73\ufb7c\ufb0c\ufbc7\ufb67\ufbf3\ufba5\ufb89\u7973\u79cd\u79cc\u7974\u7924\u791d\u79a5\u79e5\u7936\u793c\u7947\u79a0\u7936\u799a\u79e5\u79cb\u210e\u21ac\u21a2\u2106\u2147\u2168\u21c4\u2180\u2158\u2160\u213a\u21d4\u2151\u21fb\u21b9\u21a9\u4e61\u4ee5\u4ed1\u4e79\u4e30\u4e18\u4e8e\u4ef1\u4e2b\u4e2d\u4e4d\u4ebf\u4e26\u4ebd\u4ef7\u4eda\u5a2c\u5ab5\u5a95\u5a3c\u5a75\u5a72\u5af7\u5ab6\u5a62\u5a6e\u5a16\u5ae0\u5a6a\u5aa4\u5a89\u5a81\u773d\u77db\u7784\u7724\u7763\u774a\u77ee\u77b6\u7779\u776c\u7739\u77ed\u7776\u77d9\u77a2\u77a5\ue30f\ue3e0\ue3df\ue378\u8a4c\u8abe\u8af9\u8a47\u8a00\u8a1a\u8ace\u8abc\uf3a1\uf355\uf34c\uf3d6\uf3b6\uf3ab\uf37f\uf30d";
        char[] cArray = "\u71dd\u71c9\u71c1\u71d5\u71d5\u71d5\u71d5\u71d5\u71d5\u71d5\u71d5\u71d5\u71d5\u71d5\u71d5\u71d5\u71d5\u71c1\u71cd\u71cd".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
        IIIII = stringArray;
        IIIIl = new Object[stringArray.length];
        int n6 = 2138947943;
        byte[] byArray = "\u00cfAp\u00bbEA]\u00ddZA\u00ee\u0004\u0092\u0005\u00b8\u00892\u0012\u00eb\u0087\u00fd\u009e[2\u00ef\u0007\u0096\u00d9F3h\u00f2p\u00c6\u0016\u008dj\u0096ss\u0018;\u00c6\u000fa&\u001b'\u0011\u00f3\u008c\u00e1\u00a5\u00a7\u00fc:\u0084a\u00de\u00b7J\u00edB\u00e2\u00f7M\u00de\u00b4\u00eda\\\u00e6\u00d2u=+\u00d2\u00d7\u00815)\u00a7L,u!\u00db;\u007f\u0086\u0014\u00f9\u00d6\u0018\u00bd\bZ\u00bb\u00ff~G\u0012z\u00a1\u00cbl\u001e\u00ed\u00f3\u00e5\u00a5<\u0090\f\u0086\\\u0007\u00e9\u0098\u0019?4h&\u00dc5\u00b3\b\u0096\u00f2\n\u00dc\u0087K\u0002\u00f6\u0084s\u00bfj\u0088Im\u009d\u00e194\u00b4\u00e1f\u000e;\u00df\u0000\u00fa\u0088".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        llll = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            IIIIlIIII.llll[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        Illl = lIIIll.I(StringFactory.IIII("Orchard"));
        lII = StringFactory.IIII("...");
        III = StringFactory.IIII("7im0nf9t53qi");
        II = StringFactory.IIII("zq152pti0324");
        I = StringFactory.IIII("n3orcqujlg8t");
        IlIl = StringFactory.IIII("njd3mt8cnx65");
        lIlI = StringFactory.IIII("1meygl992oqu");
        llIl = StringFactory.IIII("dj7hrcqfq1qn");
        llI = StringFactory.IIII("s9o7m943f5cq");
        IIIl = StringFactory.IIII("3p5mp46oy474");
        IIll = StringFactory.IIII("z50x9tr0h2dr");
        IlI = StringFactory.IIII("95bm27jfvyc5");
        IIII = StringFactory.IIII("i67tr3m5aamt");
        lIll = StringFactory.IIII("9v3dkqn4yrs4");
        lllI = StringFactory.IIII("0gyn3uv6ewml");
        Il = StringFactory.IIII("3grhefooyyue");
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void Illll(IIIlIIIII iIIlIIIII, double d, double d2, int n, double d3) {
        if (iIIlIIIII == null || iIIlIIIII.lIlI()) {
            return;
        }
        if (d3 == 1.0) {
            this.Illl(iIIlIIIII, d, d2, n);
            return;
        }
        IIIlI.lIlIIl(this.lIIl);
        try {
            IIIlI.Ill(this.lIIl, d, d2);
            IIIlI.IIlll(this.lIIl, d3, d3);
            this.Illl(iIIlIIIII, 0.0, 0.0, n);
        }
        finally {
            IIIlI.IlIllI(this.lIIl);
        }
    }

    void lIIII(String string, double d, double d2, double d3, int n, double d4) {
        double d5 = d3 / d4;
        this.llI(this.lIlII(string, d5), d, d2, n, d4);
    }

    /*
     * Enabled aggressive block sorting
     */
    void lIIIl(double d, double d2, double d3, Theme theme, boolean bl, double d4) {
        Color color;
        int n = (int)Math.round(IIIIlIIII.IIII(d4, 0.0, 1.0) * 255.0);
        if (n > 0) {
            color = theme.ll() == null ? this.IllI.lIlI() : theme.ll();
        }
        return;
        Color color2 = theme.lII() != null ? theme.lII() : this.IllI.IIlII();
        int n2 = bl ? n : (int)Math.round((double)n * 0.56);
        int n3 = !bl ? this.llIlI(n2) : IIIIlIIII.lllIl(this.IllI.lIllI(), n2);
        IIIlI.Illl(this.lIIl, d - 1.0, d2 - 1.0, d3 + 2.0, d3 + 2.0, 8.0, n3);
        IIIlI.IIlIIl(this.lIIl, d, d2, d3, d3, 7.0, IIIIlIIII.lllIl(color, n), IIIIlIIII.lllIl(color2, n));
    }

    int lIIlI(int n) {
        return IIIIlIIII.lllIl(this.IllI.IIlII(), n);
    }

    void lIIll(double d, double d2, double d3, double d4, String string, double d5) {
        this.llIll(d, d2, d3, d4, string, true, d5);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    String lIlII(String string, double d) {
        StringBuilder stringBuilder;
        String string2;
        block5: {
            String string3;
            String string4;
            char c;
            int n;
            int n2;
            block4: {
                if (string == null) return "";
                if (string.isEmpty()) {
                    return "";
                }
                if ((double)this.IIlI(string) <= d) {
                    return string;
                }
                string2 = "...";
                n2 = this.IIlI(string2);
                stringBuilder = new StringBuilder(string.length());
                n = 0;
                if (!true) break block4;
                if (n >= string.length()) return stringBuilder.append(string2).toString();
                c = string.charAt(n);
                if ((double)(this.IIlI(string4 = (string3 = stringBuilder.toString()) + c) + n2) > d) break block5;
            }
            do {
                stringBuilder.append(string.charAt(n));
                ++n;
                if (n >= string.length()) return stringBuilder.append(string2).toString();
                c = string.charAt(n);
            } while (!((double)(this.IIlI(string4 = (string3 = stringBuilder.toString()) + c) + n2) > d));
        }
        return stringBuilder.append(string2).toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    int lIlIl(IIIlIIIII iIIlIIIII) {
        if (iIIlIIIII == null) return 0;
        if (iIIlIIIII.lll()) return 0;
        int[] nArray = new int[]{0};
        iIIlIIIII.llI(n -> {
            nArray[0] = nArray[0] + this.IIlI(IIIIlIIII.llll(n));
        });
        return nArray[0];
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIllI(double d, double d2, double d3, String string, double d4) {
        if (string == null) return;
        if (!string.isBlank()) {
            double d5 = Math.max(14.0, d3 - 4.0) / d4;
            String string2 = this.IlIII(string, d5);
            double d6 = (double)this.IIlI(string2) * d4;
            double d7 = d2 + (24.0 - IIIlI.IllIII(this.IlII) * d4) * 0.5;
            this.llI(string2, d + d3 - d6, d7, -1, d4);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    void lIlll(double d, double d2, double d3, double d4, String string, boolean bl, double d5) {
        int n = bl ? -12960442 : -14013131;
        int n2 = -12170926;
        int n3 = -1;
        if (d5 == 1.0) {
            IIIlI.Illll(this.lIIl, this.IlII, string, d, d2, d3, d4, false, n, n2, n3);
            return;
        }
        double d6 = Math.min(4.5, d4 * 0.5);
        IIIlI.Illl(this.lIIl, d, d2, d3, d4, d6, n2);
        IIIlI.Illl(this.lIIl, d + 1.0, d2 + 1.0, d3 - 2.0, d4 - 2.0, Math.max(1.0, d6 - 1.0), n);
        double d7 = 8.0;
        double d8 = Math.max(0.0, d3 - d7 * 2.0) / d5;
        String string2 = IIIlI.llIIIl(this.IlII, string, d8);
        double d9 = (double)this.IIlI(string2) * d5;
        double d10 = d + (d3 - d9) * 0.5;
        double d11 = d2 + (d4 - IIIlI.IllIII(this.IlII) * d5) * 0.5;
        this.llI(string2, d10, d11, n3, d5);
    }

    int llIII() {
        return IIIIlIIII.lllIl(this.IllI.lIllI(), 255);
    }

    void llIIl(IIIlIIIII iIIlIIIII, double d, double d2, double d3, int n) {
        this.Illl(this.IIIll(iIIlIIIII, d3), d, d2, n);
    }

    int llIlI(int n) {
        return IIIIlIIII.lllIl(IIIIlIIII.lllI(this.IllI.IlIIl(), this.IllI.llIl(), 0.32), n);
    }

    /*
     * Enabled aggressive block sorting
     */
    void llIll(double d, double d2, double d3, double d4, String string, boolean bl, double d5) {
        double d6 = IIIIlIIII.IIII(d4, 0.0, 1.0);
        double d7 = d2 + 16.0;
        double d8 = 6.0;
        double d9 = d + IIIIlIIII.IIII(d3 * d6, d8, Math.max(d8, d3 - d8));
        double d10 = Math.max(12.0, d9 - d + d8);
        IIIlI.Illl(this.lIIl, d, d7, d3, 12.0, d8, 0x30FFFFFF);
        if (bl) {
            IIIlI.Illl(this.lIIl, d, d7, d10, 12.0, d8, this.IIlIIl());
        }
        IIIlI.Illl(this.lIIl, d9 - 4.0, d7 + 2.0, 8.0, 8.0, 4.0, bl ? -1 : this.IIlIIl());
        this.lIllI(d, d2, d3, string, d5);
    }

    /*
     * Enabled aggressive block sorting
     */
    void lllII(Category category, double d, double d2, int n) {
        this.IIIlIl(IIIIlIIII.IIIllI(switch (category) {
            case Category.IIl -> IIIl;
            default -> throw new MatchException(null, null);
            case Category.l -> llI;
            case Category.ll -> llIl;
            case Category.lI -> IlI;
            case Category.II -> lIlI;
            case Category.I -> IIll;
        }), d, d2, 14.0, n);
    }

    static int lllIl(Color color, int n) {
        Color color2 = color != null ? color : Color.WHITE;
        int n2 = Math.max(0, Math.min(255, n));
        return n2 << 24 | (color2.getRed() & 0xFF) << 16 | (color2.getGreen() & 0xFF) << 8 | color2.getBlue() & 0xFF;
    }

    int llllI(int n) {
        return IIIIlIIII.lllIl(IIIIlIIII.lllI(this.IllI.IlIIl(), this.IllI.lIlI(), 0.18), n);
    }

    /*
     * Enabled aggressive block sorting
     */
    int lllll(Theme theme, double d, double d2, int n) {
        int n2 = (int)Math.round(IIIIlIIII.IIII(n, 0.0, 255.0));
        if (n2 > 0) return IIIIlIIII.lllIl(this.IllI.lIllI(), n2);
        return 0;
    }

    void IIIIII(double d, double d2, double d3, double d4, String string, boolean bl) {
        this.llIll(d, d2, d3, d4, string, bl, 1.0);
    }

    int IIIIIl(int n) {
        return IIIIlIIII.lllIl(IIIIlIIII.lllI(this.IllI.IIIllI(), this.IllI.IlIIl(), 0.72), n);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIlI(String string, double d, double d2, double d3, double d4, double d5) {
        double d6 = 8.0;
        String string2 = IIIlI.llIIIl(this.IlII, string, Math.max(0.0, d3 - d6 * 2.0) / d5);
        double d7 = d + (d3 - (double)this.IIlI(string2) * d5) * 0.5;
        double d8 = d2 + (d4 - IIIlI.IllIII(this.IlII) * d5) * 0.5;
        this.llI(string2, d7, d8, -1, d5);
    }

    void IIIIll(Identifier identifier, double d, double d2, double d3, int n) {
        IIIlI.IlIlII(this.lIIl, identifier, d, d2, d3, d3, 64, 64, n);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void IIIlII(double d, double d2, double d3, double d4, String string, String string2, double d5, double d6) {
        int n = -14013131;
        double d7 = Math.min(4.0, d4 * 0.5);
        IIIlI.Illl(this.lIIl, d, d2, d3, d4, d7, n);
        double d8 = 1.0 - Math.pow(1.0 - Math.max(0.0, Math.min(1.0, d5)), 3.0);
        IIIlI.lIlI(this.lIIl, d, d2, d + d3, d2 + d4, 0.0);
        try {
            if (string != null && !string.isBlank() && d8 < 1.0) {
                this.IIIIlI(string, d, d2 - d4 * d8, d3, d4, d6);
            }
            this.IIIIlI(string2, d, d2 + d4 * (1.0 - d8), d3, d4, d6);
        }
        finally {
            IIIlI.lIllll(this.lIIl);
        }
    }

    void IIIlIl(Identifier identifier, double d, double d2, double d3, int n) {
        IIIlI.IIIlI(this.lIIl, identifier, d, d2, d3, d3, n);
    }

    private static Identifier IIIllI(IIIlIIIII iIIlIIIII) {
        String string = ".png";
        String string2 = iIIlIIIII.IIII();
        String string3 = IIIIlIIII.llII();
        return Identifier.of((String)StringFactory.IIII("m5VAjw==").IIII(), (String)(string3 + string2 + string));
    }

    int IIIlll(int n) {
        return IIIIlIIII.lllIl(this.IllI.IIlll(), n);
    }

    /*
     * Enabled aggressive block sorting
     */
    void IIlIII(Illl illl, double d, double d2, int n) {
        this.IIIlIl(IIIIlIIII.IIIllI(switch (illl) {
            case orchard.internal.Illl.I -> IIll;
            case orchard.internal.Illl.II -> lllI;
            case orchard.internal.Illl.ll -> IIII;
            default -> IlI;
            case orchard.internal.Illl.lI -> lIll;
        }), d, d2, 14.0, n);
    }

    int IIlIIl() {
        return IIIIlIIII.lllIl(this.IllI.lIlI(), 255);
    }

    void IIlIlI(String string, double d, double d2, double d3, int n) {
        this.IllI(this.lIlII(string, d3), d, d2, n);
    }

    private static int IIlIll(int n, int n2) {
        return llll[n ^ 0x6E1734B2] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIllII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x8A552B9B;
        char[] cArray = IIIII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIIIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIlIIII.IIIIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x97B647D0;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 31 -> 56;
                case 6 -> 37;
                case 4 -> 188;
                case 2 -> 121;
                case 29 -> 97;
                case 26 -> 55;
                case 5 -> 187;
                case 20 -> 14;
                case 21 -> 252;
                case 25 -> 168;
                case 9 -> 167;
                case 16 -> 252;
                case 11 -> 17;
                case 30 -> 24;
                case 1 -> 93;
                case 10 -> 197;
                case 24 -> 84;
                case 27 -> 67;
                case 19 -> 93;
                case 18 -> 190;
                case 15 -> 117;
                case 23 -> 69;
                case 3 -> 208;
                case 8 -> 146;
                case 17 -> 5;
                default -> 247;
                case 22 -> 56;
                case 12 -> 128;
                case 14 -> 97;
                case 28 -> 221;
                case 13 -> 51;
                case 7 -> 87;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

