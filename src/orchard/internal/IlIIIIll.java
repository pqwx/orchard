/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIIll
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
 *  net.minecraft.client.gui.DrawContext
 */
package orchard.internal;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.DrawContext;
import orchard.core.ClientEntrypoint;
import orchard.internal.IIIlI;
import orchard.internal.IIIllIII;
import orchard.internal.IIllIIlII;
import orchard.internal.lIIIlIII;
import orchard.internal.llIlllIl;
import orchard.module.iface.Interface;

@Environment(value=EnvType.CLIENT)
public final class IlIIIIll {
    public static final double I = 10.0;
    private static final Color l;
    public static final double II = 999.0;
    public static final double Il = 7.0;
    private static final Color lI;
    private static final Color ll;
    private static final Color III;
    private static final Color IIl;
    public static final double IlI = 5.0;
    private static final Color Ill;
    private static final Color lII;
    public static final double lIl = 6.0;
    public static final double llI = 8.0;
    private static final int[] lll;

    public static Color I() {
        Interface interface_ = IlIIIIll.lll();
        return interface_ != null ? interface_.lIIl() : lIIIlIII.ll(IIl, 0.18);
    }

    public static void l(DrawContext drawContext, IIIllIII iIIllIII, double d, double d2, double d3, double d4, boolean bl) {
        IlIIIIll.IlI(drawContext, iIIllIII, d, d2, d3, d4, bl, 1.0);
    }

    public static int II(int n) {
        return IlIIIIll.IIII(IlIIIIll.Ill(), n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 67608618;
        byte[] byArray = "\u0082Z\u00f2\u00c3\u00d4\u00d8\u000f:B\u00108\u00a3{\f\u00a9\u00a7\u0083\u00d1\u00af\u00fc\u00ed\u008a\u00b6C\u00d9\u00e5\u00e5>\u008d\ni\u0005\u00b2\u00f1\u0088\u00bb\u00acM\u009be8\u00fc\u0097\u0093\u00b0A\u00f7\u00a3\u0092W\u007fs\u00d80\u00ca9H\u001b,\u00f6\u0093\u00a5\nI\u00ed\u0016M\u00c5sH\u00bdn\u00fc\u0018\u00cb\u00ad-\u0099\u00f1M\tC\n\u00a9\u00ad\u008d\u00d2\u00aa\f\u00c4\u00a5\u00a2.\u0082\u00ed\u00ed\u00ba0Y:\u00c2a\u001b\u00f9\u00e4\u00f8\u00e1\u000f\u00c4\r3\u00d7\u00bf\u0006k\u00a5\u0002\u00c9`\u00c2k\u00dfs(\u00898h`\u00f6c\"z\u00f3\u001d\u0096\u00d5\u0090\u008c\u0006\u0011".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        lll = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IlIIIIll.lll[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
        IIl = new Color(207, 0, 255, 255);
        III = new Color(15, 17, 23, 230);
        Ill = new Color(9, 10, 16, 240);
        lII = new Color(253, 245, 255, 255);
        ll = new Color(181, 173, 202, 255);
        lI = new Color(28, 30, 36, 255);
        l = new Color(185, 188, 194, 255);
    }

    public static int Il() {
        return IlIIIIll.IIII(l, 18);
    }

    public static int lI(Color color) {
        Color color2 = color == null ? Color.WHITE : color;
        return color2.getRGB();
    }

    public static Color ll() {
        Interface interface_ = IlIIIIll.lll();
        return interface_ == null ? Ill : interface_.IIIllI();
    }

    public static Color III() {
        Interface interface_ = IlIIIIll.lll();
        return interface_ == null ? IIl : interface_.IIIll();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Color IIl() {
        Color color;
        Interface interface_;
        block1: {
            interface_ = IlIIIIll.lll();
            if (interface_ != null) break block1;
            color = III;
            return color;
        }
        color = interface_.IlIIl();
        return color;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlI(DrawContext drawContext, IIIllIII iIIllIII, double d, double d2, double d3, double d4, boolean bl, double d5) {
        double d6;
        double d7;
        IIIllIII iIIllIII2;
        if (drawContext == null) return;
        if (d3 <= 0.0) return;
        if (!(d4 <= 0.0)) {
            IIIllIII iIIllIII3 = iIIllIII2 = iIIllIII == null ? IIIllIII.l : iIIllIII;
            d7 = IIllIIlII.II(d5);
            if (d7 <= 0.0) {
                return;
            }
            d6 = Math.min(iIIllIII2.II, Math.min(d3, d4) * 0.5);
        }
        return;
        int n = iIIllIII2.Il + (bl ? 12 : 0);
        if (bl) {
            n = Math.min(255, n);
        }
        IIIlI.Illl(drawContext, d, d2, d3, d4, d6, llIlllIl.ll(IlIIIIll.lIIl(n), d7));
    }

    public static Color Ill() {
        Interface interface_ = IlIIIIll.lll();
        return interface_ == null ? lII : interface_.lIllI();
    }

    public static int lII(int n) {
        return IlIIIIll.IIII(IlIIIIll.III(), n);
    }

    public static Color lIl() {
        Interface interface_ = IlIIIIll.lll();
        return interface_ != null ? interface_.llIl() : ll;
    }

    public static int llI() {
        return IlIIIIll.lIIl(112);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Interface lll() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return null;
        if (clientEntrypoint.IlI() != null) return clientEntrypoint.IlI().IlIlIl();
        return null;
    }

    private IlIIIIll() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int IIII(Color color, int n) {
        Color color2 = color == null ? Color.WHITE : color;
        return lIIIlIII.II(color2.getRGB(), n);
    }

    public static int IIIl() {
        return IlIIIIll.IIII(l, 20);
    }

    public static int IIlI() {
        return IlIIIIll.IIII(l, 34);
    }

    public static int IIll(int n) {
        return IlIIIIll.IIII(IlIIIIll.lIl(), n);
    }

    public static void IlII(DrawContext drawContext, double d, double d2, double d3, double d4, double d5) {
        IIIlI.Illl(drawContext, d, d2, d3, d4, d5, IlIIIIll.lIII());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int IlIl(int n) {
        Interface interface_ = IlIIIIll.lll();
        Color color = interface_ == null ? IIl : interface_.IIlll();
        return IlIIIIll.IIII(color, n);
    }

    public static int IllI() {
        return IlIIIIll.IIII(l, 44);
    }

    public static int Illl(int n) {
        return IlIIIIll.IIII(IlIIIIll.ll(), n);
    }

    public static int lIII() {
        return IlIIIIll.IIII(l, 42);
    }

    public static int lIIl(int n) {
        return IlIIIIll.IIII(lI, n);
    }

    private static int lIlI(int n, int n2) {
        return lll[n ^ 0xF99DB13E] ^ n2 ^ n;
    }
}

