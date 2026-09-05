/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIIlll
 * Module         : Interface  [IFACE]
 * Description    : Global theme color.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Background Opacity
 *   - Text Color Shift
 *   - Background Image
 *   - ClickGUI Style
 *   - Selector Color
 *   - Theme Color
 *   - Accent soft
 *   - Panel dark
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.text.Text
 */
package orchard.module.iface;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.text.Text;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.core.Theme;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIllllI;
import orchard.internal.IlIllIIlI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIlIlII;
import orchard.internal.llIll;
import orchard.internal.lllIlI;

@Environment(value=EnvType.CLIENT)
public final class Interface
extends ModuleBase {
    private final lllIlI I;
    private static final Color l;
    private final llIlIlII II;
    private final llIlIlII Il;
    private static final double lI = 1.3;
    private final llIlIlII ll;
    private static final double III = 1.0;
    private final IIIIIIIIl<IIIIllllI> IIl = this.IIlllIl(new IIIIIIIIl<IIIIllllI>(StringFactory.IIII("ClickGUI Style"), IIIIllllI.class, IIIIllllI.lII));
    private final IIIIIIIIl<Theme> IlI = this.IIlllIl(new IIIIIIIIl<Theme>(StringFactory.IIII("Theme"), Theme.class, Theme.lIll));
    private final llIlIlII Ill;
    private static final boolean lII = false;
    private final llIlIlII lIl;
    private final lIlIIlI llI;
    private static final Color lll;
    private final IIIIIIIIl<IlIllIIlI> IIII = this.IIlllIl(new IIIIIIIIl<IlIllIIlI>(StringFactory.IIII("Font"), IlIllIIlI.class, IlIllIIlI.II));
    private final llIlIlII IIIl;
    private final llIlIlII IIlI;
    private final llIll IIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Text Color Shift"), true));
    private static final double IlII = 1.0;
    private static final int[] IlIl;
    private static final String[] IllI;
    private static final Object[] Illl;

    public static Text lI(String string) {
        return Interface.lll((Text)Text.literal((String)string));
    }

    public IIIIllllI IlI() {
        return (IIIIllllI)this.IIl.lIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void lIl(Theme theme) {
        Theme theme2 = theme == null ? Theme.Illl : theme;
        this.IlI.lII(theme2);
        if (theme2 == Theme.Illl) {
            return;
        }
        this.Il.II(theme2.ll());
        this.IIlI.II(theme2.lII());
        this.Ill.II(theme2.Ill());
        this.lIl.II(theme2.IIl());
        this.II.II(theme2.IlI());
        this.ll.II(theme2.II());
        this.IIIl.II(theme2.ll());
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return;
        clientEntrypoint.I();
    }

    public static Text lll(Text text) {
        return text;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static IlIllIIlI IIlI() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return IlIllIIlI.II;
        if (clientEntrypoint.IlI() == null) return IlIllIIlI.II;
        if (clientEntrypoint.IlI().IlIlIl() != null) return clientEntrypoint.IlI().IlIlIl().lIlII();
        return IlIllIIlI.II;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color IlII(Color color, Color color2) {
        Color color3;
        if (color != null) {
            if (color2 == null) {
                return color;
            }
        } else {
            Color color4;
            if (color2 == null) {
                color4 = lll;
                return color4;
            }
            color4 = color2;
            return color4;
        }
        float[] fArray = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float[] fArray2 = Color.RGBtoHSB(color2.getRed(), color2.getGreen(), color2.getBlue(), null);
        if (fArray2[1] != fArray[1]) {
            Color color5;
            if (!(fArray2[1] > fArray[1])) {
                color5 = color;
                return color5;
            }
            color5 = color2;
            return color5;
        }
        if (!(fArray2[2] > fArray[2])) {
            color3 = color;
            return color3;
        }
        color3 = color2;
        return color3;
    }

    public int IllI() {
        Color color = this.IIIIII();
        return this.llIII(this.llIlI(46), color);
    }

    public llIlIlII Illl() {
        return this.Il;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Color lIIl() {
        Theme theme = this.lIll();
        if (theme == Theme.Illl || theme.Ill() == null) {
            Color color;
            if (this.IlIII()) {
                color = (Color)this.Ill.lIl();
                return color;
            }
            color = this.IIlIII(this.lIlI(), new Color(125, 150, 205, 255), 0.46);
            return color;
        }
        return theme.Ill();
    }

    /*
     * Enabled aggressive block sorting
     */
    public Color lIlI() {
        Theme theme = this.lIll();
        if (theme == Theme.Illl) return ((IIIIllllI)this.IIl.lIl()).II((Color)this.Il.lIl());
        if (theme.ll() == null) return ((IIIIllllI)this.IIl.lIl()).II((Color)this.Il.lIl());
        return theme.ll();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Theme lIll() {
        Theme theme;
        Theme theme2 = (Theme)this.IlI.lIl();
        if (theme2 != null) {
            theme = theme2;
            return theme;
        }
        theme = Theme.Illl;
        return theme;
    }

    public String llII() {
        return this.I.I();
    }

    public Color llIl() {
        return l;
    }

    public boolean lllI() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIIII() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return true;
        if (clientEntrypoint.IlI() == null) return true;
        Interface interface_ = clientEntrypoint.IlI().IlIlIl();
        if (interface_ == null) return true;
        if (interface_.IIIIlI()) return true;
        return false;
    }

    public double IIIlI() {
        return 1.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Color IIIll() {
        Theme theme = this.lIll();
        if (theme == Theme.Illl) return (Color)this.IIIl.lIl();
        if (theme.ll() == null) return (Color)this.IIIl.lIl();
        return theme.ll();
    }

    /*
     * Enabled aggressive block sorting
     */
    public Color IIlII() {
        Color color;
        Theme theme = this.lIll();
        if (theme != Theme.Illl && theme.lII() != null) {
            return theme.lII();
        }
        if (this.IlIII()) {
            color = (Color)this.IIlI.lIl();
            return color;
        }
        color = this.IIIIll(this.lIlI(), 0.22);
        return color;
    }

    public double IIllI() {
        return (Double)this.llI.lIl() / 100.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Color IIlll() {
        Color color;
        Color color2 = this.lIlI();
        color2 = this.IlII(color2, this.IIlII());
        if ((color2 = this.IlII(color2, this.lIIl())) != null) {
            color = color2;
            return color;
        }
        color = this.lIllI();
        return color;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIII() {
        if (this.lIll() != Theme.Illl) return false;
        if (this.IIl.lIl() != IIIIllllI.lII) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Color IlIIl() {
        Color color;
        Theme theme = this.lIll();
        if (theme != Theme.Illl && theme.IIl() != null) {
            return theme.IIl();
        }
        if (!this.IlIII()) {
            color = this.IlIll(this.lIlI(), false);
            return color;
        }
        color = (Color)this.lIl.lIl();
        return color;
    }

    public Color IlIlI() {
        Color color;
        block3: {
            block1: {
                block2: {
                    Theme theme;
                    block0: {
                        theme = this.lIll();
                        if (theme != Theme.Illl && theme.II() != null) break block0;
                        if (!this.IlIII()) break block1;
                        break block2;
                    }
                    return theme.II();
                }
                color = (Color)this.ll.lIl();
                break block3;
            }
            color = new Color(6, 8, 15, 255);
        }
        return color;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color IlIll(Color color, boolean bl) {
        float f;
        float f2;
        float[] fArray;
        block3: {
            float f3;
            block2: {
                block4: {
                    block1: {
                        Color color2;
                        block0: {
                            color2 = color == null ? new Color(207, 0, 255, 255) : color;
                            fArray = Color.RGBtoHSB(color2.getRed(), color2.getGreen(), color2.getBlue(), null);
                            f2 = Math.max(0.16f, Math.min(0.42f, fArray[1] * 0.38f));
                            float f4 = f = bl ? 0.105f : 0.155f;
                            if (color2.getRed() <= 220 || color2.getGreen() <= 220 || color2.getBlue() <= 220) break block0;
                            f2 = 0.03f;
                            if (!bl) break block1;
                            f3 = 0.1f;
                            break block2;
                        }
                        if (color2.getRed() >= 36 || color2.getGreen() >= 36 || color2.getBlue() >= 36) break block3;
                        break block4;
                    }
                    f3 = 0.15f;
                    break block2;
                }
                f2 = 0.02f;
                f = !bl ? 0.115f : 0.075f;
                break block3;
            }
            f = f3;
        }
        int n = Color.HSBtoRGB(fArray[0], f2, f);
        return new Color(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, 255);
    }

    public llIlIlII IllII() {
        return this.IIlI;
    }

    public int Illll() {
        Color color = this.IIIIII();
        return this.llIII(this.llIlI(66), color);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String lIIIl() {
        Theme theme = this.lIll();
        if (theme == Theme.Illl) return ((IIIIllllI)this.IIl.lIl()).toString();
        return theme.toString();
    }

    public int lIIll() {
        Color color = this.IIIIII();
        return this.llIII(this.llIlI(106), color);
    }

    /*
     * Enabled aggressive block sorting
     */
    public IlIllIIlI lIlII() {
        IlIllIIlI ilIllIIlI;
        IlIllIIlI ilIllIIlI2 = (IlIllIIlI)this.IIII.lIl();
        if (ilIllIIlI2 != null) {
            ilIllIIlI = ilIllIIlI2;
            return ilIllIIlI;
        }
        ilIllIIlI = IlIllIIlI.II;
        return ilIllIIlI;
    }

    public int lIlIl() {
        Color color = this.IIIIII();
        return this.llIII(this.llIlI(50), color);
    }

    public Color lIllI() {
        return lll;
    }

    private int llIII(int n, Color color) {
        return n << 24 | (color.getRed() & 0xFF) << 16 | (color.getGreen() & 0xFF) << 8 | color.getBlue() & 0xFF;
    }

    private int llIlI(int n) {
        return Math.max(0, Math.min(255, (int)Math.round((double)n * 1.3)));
    }

    public double lllIl() {
        return 1.0;
    }

    public Color llllI() {
        return (Color)this.Il.lIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color IIIIII() {
        Color color;
        Color color2 = this.IIIlll();
        if (color2 != null) {
            color = color2;
            return color;
        }
        color = this.lIlI();
        return color;
    }

    public boolean IIIIlI() {
        return (Boolean)this.IIll.lIl();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block34: {
                block37: {
                    block33: {
                        block31: {
                            block35: {
                                block36: {
                                    block30: {
                                        block28: {
                                            block32: {
                                                block29: {
                                                    break block36;
lbl1:
                                                    // 1 sources

                                                    while (true) {
                                                        Interface.IlIl[var4_5] = var5_6 ^= var2_3;
                                                        break block28;
                                                        break;
                                                    }
lbl4:
                                                    // 1 sources

                                                    while (var15_15 >= var14_14.length) {
                                                        break block29;
lbl6:
                                                        // 1 sources

                                                        while (true) {
                                                            break block30;
                                                            break;
                                                        }
                                                    }
                                                    break block37;
lbl9:
                                                    // 6 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl11:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_5 = 0;
                                                        break block31;
                                                        break;
                                                    }
lbl14:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl16:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var13_13 != 0) break block32;
                                                        break block33;
                                                        break;
                                                    }
lbl19:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                var9_9[var10_10] = new String(var14_14).intern();
                                                var11_11 += var12_12;
                                                ** while (true)
lbl25:
                                                // 1 sources

                                                while (true) {
                                                    var13_13 = 0;
                                                    break block34;
                                                    break;
                                                }
lbl28:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl30:
                                                // 1 sources

                                                while (true) {
                                                    ** GOTO lbl4
                                                    break;
                                                }
lbl32:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 39;
                                                    ** GOTO lbl9
                                                    break;
                                                }
lbl35:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 76;
                                                    ** GOTO lbl9
                                                    break;
                                                }
                                                var16_16 = v0;
                                                v1 = var15_15++;
                                                var14_14[v1] = (char)(var14_14[v1] ^ var16_16);
                                                ** while (true)
                                            }
lbl43:
                                            // 2 sources

                                            while (true) {
                                                break block35;
                                                break;
                                            }
                                        }
                                        var3_4 += 4;
                                        if (++var4_5 < var1_2) break block31;
                                        ** while (true)
lbl49:
                                        // 1 sources

                                        while (true) {
                                            v0 = 49;
                                            ** GOTO lbl9
                                            break;
                                        }
lbl52:
                                        // 1 sources

                                        while (true) {
                                            v0 = 66;
                                            ** GOTO lbl9
                                            break;
                                        }
lbl55:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl57:
                                        // 1 sources

                                        while (true) {
                                            v0 = 77;
                                            ** GOTO lbl9
                                            break;
                                        }
lbl60:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    ** while (++var10_10 < var8_8.length)
lbl64:
                                    // 1 sources

                                    ** while (true)
                                }
                                var6 = 20172;
                                break block38;
                            }
                            var12_12 = var8_8[var10_10] ^ var6;
                            var14_14 = var7_7.substring(var11_11, var11_11 + var12_12).toCharArray();
                            var15_15 = 0;
                            break block37;
                            Interface.lll = new Color(253, 245, 255, 255);
                            Interface.l = new Color(181, 173, 202, 255);
                            return;
lbl76:
                            // 1 sources

                            while (true) {
                                v0 = 57;
                                ** continue;
                                break;
                            }
                        }
                        var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                        ** while (true)
                    }
                    Interface.IllI = var9_9;
                    ** while (true)
                }
                switch (var15_15 % 6) {
                    case 1: {
                        ** continue;
                    }
                    case 3: {
                        ** continue;
                    }
                    default: {
                        ** continue;
                    }
                    case 4: {
                        ** continue;
                    }
                    case 2: {
                        ** continue;
                    }
                    ** case 5:
lbl98:
                    // 1 sources

                    ** continue;
                }
            }
lbl100:
            // 2 sources

            while (true) {
                var10_10 = 0;
                ** continue;
                break;
            }
            Interface.Illl = new Object[var9_9.length];
            var2_3 = -743220249;
            var0_1 = "\u0017\u00e2\u00a1A\u0086\u008b\u00b2\u000bIV\u001c\u0011\tB\u00f2\u0089j2gr\u00f4\u00d6\u00f8\u001cj\u008a\u0017\u0084\u00da\u000e\u00bf\u0084h\u00effY6Uu-\u008b\u00cd\u0083m\u0002\u00ec\u00f5\u00a0\u00f2b\u00da~'\u00f6\u0090rY\u0089=\u0000/\u0087[\u00f8\u0099\u00fe\u00ee\u00bb\u000b\u0085\u001a.\u00af\u001b\u00c1\u001cc\u0098muOmx\u00b7%\u00de\u008b=\u00dc\u00dc\u00ee\u00c77\u0001\u0098-:\u008fG\u00d3!\u00cf\\\u00c0g\u0013\u000eQh~\u00caH\u001d\u00adl\u00de\u00b2&\u0092B>}\u00f4C\u00c2?\u00bd\u00c2\u009d\u00f1JTG\b\u0010\t\u001bP\u0002T\t\n cs\u00a9T\u0090L\u00e3R\u0011\u00f0\u009cM\u00f5Ar1\u009e\u00ac\u00fdG\u00dc!\"\u00b6\u0087\u00f7$v\u008af\u00b0\u00c2\u00e5\u00b3\u00e1\u0007>t;Q\u00ed\u00ca\u00d4)#\u00c9\u00af$\u00b1\bB\u00c5\u00cc\u00dcrs\u00f6\u00ea\u00f8D\u00a4\u00e1\u0007\u00aa]\u0095\u00d8\u00c0\u00f8\u0011<\u00be\u0010\u00adg\u00a4\u001d0\u009f]W\u009d\u00b5\u009c[?\u00a3\u00c1\u00b4\u00faz\u00e3\u008f\t\u009c\u00fb\u008aV\u00921\u009c\u00e4\u00f4\u00c7\u000f\u0097W\u00a0\u00b9O\u00f3\u00a2\u00d5Q\u00fa\u00d0\u00f9\u00d6\u0016\u00b6F\u00a4\u001b\u0091\u000f\u00ed\u00f6z\u0003\u0010;\u00fcn".getBytes("ISO-8859-1");
            ** while (true)
            var1_2 = var0_1.length / 4;
            Interface.IlIl = new int[var1_2];
            var3_4 = 0;
            ** while (true)
        }
        var7_7 = "\uf9f0\uf98d\uf99d\uf9f3\uf981\uf996\uf9fd\uf985\uf9e6\uf9ee\uf9db\uf998\uaaf4\uaaa3\uaa82\uaa85\uaa8f\uaaf6\uaafe\uaaee\uaad9\uaad4\uaa92\uaa8c\uaaa2\uaa96\uaaec\uaa86\uaae1\uaa99\uaaa2\uaa9e\uaa8f\uaa8b\uaaf6\uaaaf\uaaa7\uaa91\uaad1\uaad0\u9912\u98c4\u997d\u9958\u996c\u9979\u9973\u9902\u991f\u9908\u9922\u9959\u997c\u98c3\u9969\u997b\u9975\u98c6\u996e\u98dc\ufd48\ufda6\ufd32\ufdd5\ufd20\ufda0\ufd57\ufd9b\u9579\u9561\u9517\u9579\u950f\u952c\u9520\u9536\u2b48\u2ba6\u2b38\u2bc0\u2b32\u2b4c\u2b5a\u2b80\u2bd2\u2b33\u2bc8\u2b99\u2b47\u2b44\u2b8d\u2b24\u2bcb\u2bf9\u2b48\u2b87\u2b3d\u2b1a\u2bfe\u2b85\u2ad3\u2aca\u2b42\u2ab9\u2abb\u2aec\u2b13\u2b38\u2ab8\u2abc\u2ab8\u2aca\u2b20\u2b20\u2b5b\u2abc\u2b5c\u2ad8\u2b28\u2ad4\u2ab7\u2abc\u2b68\u2b13\uf363\uf37a\uf372\uf369\uf30b\uf37c\uf323\uf308\uf368\uf32c\uf308\uf31a\uf310\uf330\uf34b\uf357\uf357\uf33f\uf318\uf366\uf304\uf35d\uf304\uf32e\uaabe\uaa86\uaa38\uaa39\u7b9c\u7be2\u7bde\u7b81\u7be4\u7bf4\u7b93\u7b94\u7bf3\u7bdf\u7b98\u7b84\u7bec\u7b48\u7b26\u7b14\uf5f2\uf595\uf5f9\uf58c\uf589\uf583\uf585\uf5b3\uf5de\uf5df\uf5c6\uf5a2\u4317\u4378\u4358\u431d\u436c\u437e\u4324\u4312\u437b\u4306\u42b2\u436b\u4304\u430b\u4365\u42b2\u5f19\u5f66\u5f08\u5f54\u5f6e\u5f60\u5f75\u5edb\u8885\u889a\u88e4\u8888\u88a2\u88ac\u88a9\u888c\u88e4\u88e9\u8837\u8880\u8895\u88ed\u88dd\u88dc\uea95\uea80\uea88\uea93\ueae9\uea86\uea55\uea92\uea92\ueaea\ueaee\ueae8\uea82\uea9f\uea31\uea30\u3c16\u3bc4\u3c7b\u3c13\u3c69\u3c63\u3c19\u3c13\u3c2d\u3c69\u3ba7\u3c59\u3c70\u3bc4\u3c07\u3c0a\u3c75\u3c72\u3c02\u3bdc";
        var8_8 = "\u4ec0\u4ed0\u4ed8\u4ec4\u4ec4\u4ed4\u4ed4\u4ed4\u4ec8\u4edc\u4ec0\u4edc\u4ec4\u4edc\u4edc\u4ed8".toCharArray();
        ** while (true)
        var9_9 = new String[var8_8.length];
        var13_13 = -1;
        ** while (true)
        var11_11 = 0;
        var12_12 = 0;
        ** while (true)
    }

    private Color IIIIll(Color color, double d) {
        return this.IIlIII(color, Color.WHITE, d);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IIIlIl() {
        if (Interface.IIlI().III() == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Color IIIllI() {
        Color color;
        Theme theme = this.lIll();
        if (theme != Theme.Illl && theme.IlI() != null) {
            return theme.IlI();
        }
        if (this.IlIII()) {
            color = (Color)this.II.lIl();
            return color;
        }
        color = this.IlIll(this.lIlI(), true);
        return color;
    }

    public Color IIIlll() {
        Color color = this.lIlI();
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Interface() {
        super(StringFactory.IIII("sZpAmQtRUR+S"), Category.lI, StringFactory.IIII("v5hbnhhbEAifDZJcT9DRkpeGGg=="), false);
        this.I = this.IIlllIl(new lllIlI((Object)StringFactory.IIII("Background Image"), ""));
        this.llI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Background Opacity"), 100.0, 0.0, 100.0, 1.0).IIII(StringFactory.IIII("%")));
        this.Il = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Theme Color"), new Color(178, 86, 255, 255)));
        this.IIlI = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Accent 2"), new Color(255, 93, 206, 255)));
        this.Ill = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Accent soft"), new Color(214, 174, 255, 255)));
        this.lIl = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Panel"), new Color(32, 22, 42, 255)));
        this.II = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Panel dark"), new Color(14, 8, 20, 255)));
        this.ll = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Background"), new Color(8, 4, 12, 255)));
        this.IIIl = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Selector Color"), new Color(178, 86, 255, 255)));
        this.IIl.lIII(() -> false);
        this.IlI.lIII(() -> false);
        this.IIII.lIII(() -> true);
        this.IIll.lIII(() -> true);
        this.I.lIII(() -> false);
        this.llI.lIII(() -> false);
        this.Il.lIII(() -> {
            if (this.lIll() != Theme.Illl) return false;
            return true;
        });
        this.IIlI.lIII(() -> this.lIll() == Theme.Illl);
        this.Ill.lIII(() -> false);
        this.lIl.lIII(() -> false);
        this.II.lIII(() -> false);
        this.ll.lIII(() -> false);
        this.IIIl.lIII(() -> false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color IIlIII(Color color, Color color2, double d) {
        Color color3;
        Color color4 = color == null ? Color.WHITE : color;
        Color color5 = color2 != null ? color2 : Color.WHITE;
        double d2 = Math.max(0.0, Math.min(1.0, d));
        color3((int)Math.round((double)color4.getRed() + (double)(color5.getRed() - color4.getRed()) * d2), (int)Math.round((double)color4.getGreen() + (double)(color5.getGreen() - color4.getGreen()) * d2), (int)Math.round((double)color4.getBlue() + (double)(color5.getBlue() - color4.getBlue()) * d2), (int)Math.round((double)color4.getAlpha() + (double)(color5.getAlpha() - color4.getAlpha()) * d2));
        return color3;
    }

    public lllIlI IIlIIl() {
        return this.I;
    }

    private static int IIlIlI(int n, int n2) {
        return IlIl[n ^ 0x69F8A034] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlIll(char c, char c2, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xF432;
        char[] cArray = IllI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Illl[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Interface.Illl[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x687B;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 32810;
            n6 += 5678;
            n6 -= 26761;
            n6 ^= 0x5808;
            cArray[n5] = (char)((n6 -= 41002) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

