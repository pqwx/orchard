/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIl
 * Module         : Watermark  [HUD]
 * Description    : Client logo watermark.   (client's own text)
 *
 * Recovered strings in this class:
 *   - ), 16.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII(
 *   - .gg/orchardclient
 *   - 16348rlki77s
 *   - .getBytes(
 *   - ORCHARD
 *   - k8s6i1
 *   - Scale
 *   - cats
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.Identifier
 */
package orchard.module.hud;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlI;
import orchard.internal.IIIlIIIII;
import orchard.internal.lIlIIlI;
import orchard.internal.lllIlIII;
import orchard.internal.llllIII;
import orchard.module.iface.Interface;

@Environment(value=EnvType.CLIENT)
public final class Watermark
extends ModuleBase
implements lllIlIII {
    private final lIlIIlI I;
    private static final int l = -1513240;
    private static final IIIlIIIII II;
    private static final int Il = 1000;
    private static final double lI = 0.3;
    private static final IIIlIIIII ll;
    private static final double III = 1.8;
    private final lIlIIlI IIl;
    private static final double IlI = -0.36;
    private static final IIIlIIIII Ill;
    private static final IIIlIIIII lII;
    private static final double lIl = 4.0;
    private static final IIIlIIIII llI;
    private static final IIIlIIIII lll;
    private final lIlIIlI IIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("X"), 16.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII("px")));
    private static final double IIIl = 0.62;
    private static final double IIlI = 30.0;
    private static final int[] IIll;
    private static final String[] IlII;
    private static final Object[] IlIl;

    /*
     * Enabled aggressive block sorting
     */
    private void lI(DrawContext drawContext, boolean bl) {
        double d = this.IlII();
        double d2 = this.IlIl();
        double d3 = this.lII();
        double d4 = 30.0;
        double d5 = 2.0;
        double d6 = 4.0;
        double d7 = 4.0;
        double d8 = d6 + d4 + d5;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        TextRenderer textRenderer = minecraftClient == null ? null : minecraftClient.textRenderer;
        String string = lII.IIII();
        String string2 = ll.IIII();
        double d9 = Watermark.IIII(textRenderer, string, Ill) * 1.8;
        double d10 = Watermark.IIII(textRenderer, string2, II) * 0.62;
        double d11 = Math.max(d9, d10);
        double d12 = d8;
        double d13 = d8;
        double d14 = 16.2;
        double d15 = 5.58;
        double d16 = d14 + 0.3 + d15;
        double d17 = d7 + (d4 - d16) * 0.5;
        double d18 = d17 + d14 + 0.3;
        IIIlI.lIlIIl(drawContext);
        IIIlI.Ill(drawContext, d, d2);
        IIIlI.IIlll(drawContext, d3, d3);
        IIIlI.IlIlIl(drawContext, Watermark.IIlI(llI), d6, d7, d4, d4, 1000, 1000);
        if (textRenderer != null) {
            Watermark.IlI(drawContext, textRenderer, string, d12, d17, 1.8, -0.36, Ill, -1);
            Watermark.lll(drawContext, textRenderer, string2, d13, d18, 0.62, II, -1513240, true);
        }
        IIIlI.IlIllI(drawContext);
    }

    @Override
    public void lIII(DrawContext drawContext, int n, int n2, float f) {
        this.lI(drawContext, false);
    }

    @Override
    public double IIll() {
        return this.IIl() * this.lII();
    }

    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        this.lI(drawContext, false);
    }

    private double IIl() {
        return 38.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IlI(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, double d3, double d4, IIIlIIIII iIIlIIIII, int n) {
        IIIlI.lIlIIl(drawContext);
        IIIlI.Ill(drawContext, d, d2);
        IIIlI.IIlll(drawContext, d3, d3);
        if (d4 != 0.0) {
            IIIlI.IIIlIl(drawContext, d4, 0.0);
        }
        if (!llllIII.Il(iIIlIIIII, drawContext, string, 0.0, 0.0, n, false, false)) {
            IIIlI.IlIIll(drawContext, textRenderer, string, 0.0, 0.0, n);
        }
        IIIlI.IlIllI(drawContext);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block10: {
            block11: {
                var6 = 29359;
                var7_2 = "\u233d\u2318\u236c\u2307\u230a\u2333\u2300\u2351\u3770\u36fd\u36a8\u36f7\u373b\u368d\u36ef\u36a8\u36c2\u36d3\u373f\u36c8\u36ae\u3724\u3730\u369c\u36cf\u374a\u36ed\u36d9\u373a\u36c8\u374d\u36c4\u36d3\u376b\u36ea\u36a4\u36fb\u36c9\u3773\u36ca\u36bc\u3714\u36c5\u36a5\u36f4\u36a5\u36f4\u36d8\u373a\u36fd\u374f\u3727\u38dc\u3873\u3896\u3873\u3892\u38cc\u38b5\u38d8\u388a\u388d\u3817\u387a\u764e\u75ec\u75b7\u75c3\u760f\u7679\u75ca\u75af\u75c4\u7637\u75ac\u75cd\u75ac\u75e7\u75cb\u767e\u75f3\u767a\u75e9\u7631\u7674\u75fb\u75bc\u765c\ue8f5\ue8ad\ue83c\ue876\ue84d\ue8f0\ue866\ue835\ua447\ua45c\ua46b\ua432\ua409\ua453\ua43f\ua46e\ua402\ua410\ua433\ua45e\ua458\ua3e2\ua47a\ua449\u5900\u59ac\u5910\u5973\u59a7\u5925\u5963\u59c9\u5947\u596b\u59cc\u599e\u5062\u4fcf\u5075\u5033\u5004\u504f\u5038\u5009\u5054\u5071\u503c\u502b\u5009\u4fc4\u5070\u5047\u505d\u5017\u504b\u507a\u504a\u4fc8\u5052\u5021\u500d\u5046\u4fc8\u5070\u5056\u5000\u4f9a\u4ff7\u2a2a\u2a31\u2a44\u2a1e\u7fae\u7fe3\u7fb4\u8034\ufa29\ufa0e\uf9bb\uf9e1\u7048\u7045\u7052\u6fc2\ud881\ud928\ud94e\ud8c6\ud939\ud89c\ud8ee\ud901\ua514\ua5db\ua52e\ua574";
                var8_3 = "\u72a7\u7283\u72a3\u72b7\u72a7\u72bf\u72a3\u728f\u72ab\u72ab\u72ab\u72ab\u72a7\u72ab".toCharArray();
                var9_4 = new String[var8_3.length];
                var13_8 = -1;
                ** GOTO lbl12
lbl7:
                // 1 sources

                while (var13_8 == 0) {
                    break block10;
                }
                break block11;
                while (true) {
                    var13_8 = 0;
lbl12:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = 0;
                    ** GOTO lbl7
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    switch (var15_10 % 5) {
                        default: {
                            v0 = 121;
                            break;
                        }
                        case 2: {
                            v0 = 69;
                            break;
                        }
                        case 1: {
                            v0 = 20;
                            break;
                        }
                        case 4: {
                            v0 = 55;
                            break;
                        }
                        case 3: {
                            v0 = 31;
                        }
                    }
                    var16_1 = v0;
                    v1 = var15_10++;
                    var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                    if (var15_10 < var14_9.length) continue;
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 >= var8_3.length) ** continue;
                    break;
                }
            }
            var12_7 = var8_3[var10_5] ^ var6;
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
            ** while (true)
        }
        Watermark.IlII = var9_4;
        Watermark.IlIl = new Object[var9_4.length];
        var2_11 = -1402531612;
        var0_12 = "M\u00f5\u00b8-)\u00b2\u00b56\f\u008e\u00db\u00a4".getBytes("ISO-8859-1");
        var1_13 = var0_12.length / 4;
        Watermark.IIll = new int[var1_13];
        var3_14 = 0;
        var4_15 = 0;
        do {
            var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
            Watermark.IIll[var4_15] = var5_16 ^= var2_11;
            var3_14 += 4;
        } while (++var4_15 < var1_13);
        Watermark.lll = StringFactory.IIII("cats");
        Watermark.llI = StringFactory.IIII("textures/w6t2c8/qcu0ht9j9xgh.png");
        Watermark.lII = StringFactory.IIII("ORCHARD");
        Watermark.ll = StringFactory.IIII(".gg/orchardclient");
        Watermark.Ill = StringFactory.IIII("k8s6i1");
        Watermark.II = StringFactory.IIII("16348rlki77s");
    }

    @Override
    public double IlII() {
        return (Double)this.IIII.lIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean Illl(double d, double d2) {
        if (!(d >= this.IlII())) return false;
        if (!(d <= this.IlII() + this.III())) return false;
        if (!(d2 >= this.IlIl())) return false;
        if (d2 <= this.IlIl() + this.IIll()) return true;
        return false;
    }

    @Override
    public double IlIl() {
        return (Double)this.I.lIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    public Watermark(Interface interface_) {
        super(StringFactory.IIII("r5VAmQtaUQ6c"), Category.I, StringFactory.IIII("Client logo watermark."));
        this.I = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Y"), 16.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII("px")));
        this.IIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Scale"), 155.0, 75.0, 300.0, 5.0).IIII(StringFactory.IIII("%")));
        this.IIlIIll(true);
    }

    private double lII() {
        return (Double)this.IIl.lIl() / 100.0;
    }

    @Override
    public double III() {
        return this.lIl() * this.lII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lIl() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        TextRenderer textRenderer = minecraftClient == null ? null : minecraftClient.textRenderer;
        double d = Watermark.IIII(textRenderer, lII.IIII(), Ill) * 1.8 + Math.abs(-0.36) * 9.0 * 1.8;
        double d2 = Watermark.IIII(textRenderer, ll.IIII(), II) * 0.62;
        return 40.0 + Math.max(d, d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void lll(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, double d3, IIIlIIIII iIIlIIIII, int n, boolean bl) {
        boolean bl2 = bl && Interface.IIIII();
        IIIlI.lIlIIl(drawContext);
        IIIlI.Ill(drawContext, d, d2);
        IIIlI.IIlll(drawContext, d3, d3);
        if (!llllIII.Il(iIIlIIIII, drawContext, string, 0.0, 0.0, n, false, bl2)) {
            if (bl2) {
                IIIlI.lllIII(true, () -> IIIlI.IlIIll(drawContext, textRenderer, string, 0.0, 0.0, n));
            } else {
                IIIlI.IlIIll(drawContext, textRenderer, string, 0.0, 0.0, n);
            }
        }
        IIIlI.IlIllI(drawContext);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static double IIII(TextRenderer textRenderer, String string, IIIlIIIII iIIlIIIII) {
        double d;
        int n = llllIII.lll(iIIlIIIII, string);
        if (n < 0) {
            if (textRenderer == null) return 48.0;
            d = textRenderer.getWidth(string);
            return d;
        }
        d = n;
        return d;
    }

    private static Identifier IIlI(IIIlIIIII iIIlIIIII) {
        return Identifier.of((String)lll.IIII(), (String)iIIlIIIII.IIII());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lllI(double d, double d2) {
        double d3 = Double.MAX_VALUE;
        double d4 = Double.MAX_VALUE;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null && minecraftClient.getWindow() != null) {
            d3 = Math.max(0.0, (double)minecraftClient.getWindow().getScaledWidth() - this.III());
            d4 = Math.max(0.0, (double)minecraftClient.getWindow().getScaledHeight() - this.IIll());
        }
        this.IIII.lI(Math.max(0.0, Math.min(d, d3)));
        this.I.lI(Math.max(0.0, Math.min(d2, d4)));
    }

    private static double IllI(TextRenderer textRenderer, String string) {
        return Watermark.IIII(textRenderer, string, Ill);
    }

    @Override
    public void llII(DrawContext drawContext, int n, int n2, float f, boolean bl) {
        this.lI(drawContext, bl);
    }

    private static int lIlI(int n, int n2) {
        return IIll[n ^ 0x33B99F2B] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIll(int n, short s, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xB116;
        char[] cArray = IlII[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlIl[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            Watermark.IlIl[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3507;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 12080;
            n6 += 11914;
            n6 += 1181;
            n6 += 52866;
            cArray[n5] = (char)((n6 += 38098) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

