/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIlIIl
 * Module         : Promo  [HUD]
 * Description    : Displays custom promotional or watermark text on screen with`shadow and color shift.   (client's own text)
 *
 * Recovered strings in this class:
 *   - ), 18.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII(
 *   - ), 94.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII(
 *   - Orchard Client
 *   - Color Shift
 *   - .getBytes(
 *   - Background
 *   - Shadow
 *   - Promo
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
 */
package orchard.module.hud;

import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlI;
import orchard.internal.IIIllIII;
import orchard.internal.IlIIIIll;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;
import orchard.internal.lllIlI;
import orchard.internal.lllIlIII;

@Environment(value=EnvType.CLIENT)
public final class Promo
extends ModuleBase
implements lllIlIII {
    private final lIlIIlI I;
    private final lIlIIlI l;
    private static final IIIllIII II;
    private static final double Il = 7.0;
    private static final double lI = 18.0;
    private final llIll ll;
    private final llIll III;
    private final llIll IIl;
    private final lIlIIlI IlI;
    private final lllIlI Ill = this.IIlllIl(new lllIlI((Object)StringFactory.IIII("Text"), StringFactory.IIII("Orchard Client")));
    private static final int[] lII;
    private static final String[] lIl;
    private static final Object[] llI;

    @Override
    public void llII(DrawContext drawContext, int n, int n2, float f, boolean bl) {
        this.IIl(drawContext, bl);
    }

    private double I() {
        return Math.max(0.75, Math.min(2.0, (Double)this.l.lIl() / 100.0));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IIl(DrawContext drawContext, boolean bl) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (drawContext == null || minecraftClient == null || minecraftClient.textRenderer == null) {
            return;
        }
        String string = this.lII();
        if (string.isEmpty() && !bl) {
            return;
        }
        if (string.isEmpty()) {
            string = "Promo";
        }
        double d = this.I();
        double d2 = this.IlII();
        double d3 = this.IlIl();
        TextRenderer textRenderer = minecraftClient.textRenderer;
        double d4 = this.IlI(textRenderer, string);
        IIIlI.lIlIIl(drawContext);
        IIIlI.Ill(drawContext, d2, d3);
        IIIlI.IIlll(drawContext, d, d);
        try {
            if (((Boolean)this.ll.lIl()).booleanValue() || bl) {
                IlIIIIll.l(drawContext, II, 0.0, 0.0, d4, 18.0, bl);
            }
            double d5 = (Boolean)this.ll.lIl() != false ? 7.0 : 0.0;
            Objects.requireNonNull(textRenderer);
            double d6 = (18.0 - 9.0) * 0.5;
            int n = IlIIIIll.II(245);
            boolean bl2 = (Boolean)this.III.lIl();
            String string2 = string;
            IIIlI.lllIII((Boolean)this.IIl.lIl(), () -> {
                block2: {
                    block1: {
                        if (!bl2) break block1;
                        break block2;
                    }
                    IIIlI.IlIIll(drawContext, textRenderer, string2, d5, d6, n);
                    return;
                }
                IIIlI.lllll(drawContext, textRenderer, string2, d5, d6, n);
            });
        }
        finally {
            IIIlI.IlIllI(drawContext);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double IlI(TextRenderer textRenderer, String string) {
        double d;
        double d2 = IIIlI.IIIlll(textRenderer, string);
        if (((Boolean)this.ll.lIl()).booleanValue()) {
            d = 14.0 + d2;
            return d;
        }
        d = d2;
        return d;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean Illl(double d, double d2) {
        if (!(d >= this.IlII())) return false;
        if (!(d <= this.IlII() + this.III())) return false;
        if (!(d2 >= this.IlIl())) return false;
        if (!(d2 <= this.IlIl() + this.IIll())) return false;
        return true;
    }

    @Override
    public double IlIl() {
        return (Double)this.IlI.lIl();
    }

    @Override
    public void lllI(double d, double d2) {
        this.I.lI(Math.max(0.0, d));
        this.IlI.lI(Math.max(0.0, d2));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 2890;
        var7_2 = "\u972d\u978c\u971f\u9704\u97cd\u9753\u9779\u97b6\u46ce\u466f\u46fc\u46e7\u462e\u46b0\u469a\u4655\u768e\u762b\u76d0\u768a\u7668\u76e7\u76d2\u7678\u769b\u76e0\u7635\u76ab\u76a1\u7629\u7608\u76f3\u76b4\u7686\u76c7\u761f\u76bb\u7679\u7607\u767f\u762d\u76a7\u7692\u762e\u762f\u76d4\u7620\u761c\u76e9\u7632\u76a6\u76a8\u7613\u76c8\u76bc\u766f\u768c\u76e0\u7621\u7695\u76f9\u7659\u7615\u76c9\u76e3\u76c5\u769b\u760a\u76e4\u7611\u765b\u7667\u766b\u76fb\u76b8\u7625\u7643\u76e0\u7670\u761b\u769c\u7614\u76f9\u7698\u7642\u76f3\u76aa\u7640\u76ec\u76df\u7649\u768c\u76f5\u7678\u7670\u76e8\u769d\u76b9\u76af\u7620\u769a\u7621\u763d\u7664\u767d\u7697\u76dc\u7622\u7603\u768d\u764f\u7617\u7694\u7620\u7684\u7696\u7654\u76cd\u76b6\u767b\u76b2\u76eb\u767b\u76a1\u7689\u7676\u763c\u76eb\u75a9\u7508\u7584\u75ac\u7548\u75c7\u759a\u7531\ucae9\uca30\ucade\ucaff\uca0b\uca82\uca89\uca0c\ucafb\uca92\uca06\ucaa6\ucac5\uca32\uca47\ucabe\ucad7\ucab9\ucabb\uca13\u3fb3\u3f6e\u3fa3\u3fae\u3f55\u3fdd\u3fe4\u3f54\u934d\u9394\u9355\u935b\u93a9\u9312\u9337\u93b7\u9351\u9309\u9389\u9356\u9366\u93b2\u93cb\u9345\uc8de\uc842\uc8e4\uc8c9\uc83d\uc88e\uc8e2\uc83a\uc8c3\uc895\uc824\uc8fa\uc8f5\uc80f\uc816\uc8d6\ub99c\ub92b\ub9d7\ub9f4\u816b\u81d2\u816c\u8105\uad43\uade4\uad08\uad2b\u5bf1\u5b48\u5bf6\u5b9f\u84e0\u843d\u84ec\u84fd\u8400\u848e\u849a\u847b\u04ad\u0456\u04ba\u0499";
        var8_3 = "\u0b42\u0b42\u0b3a\u0b42\u0b5e\u0b42\u0b5a\u0b5a\u0b4e\u0b4e\u0b4e\u0b4e\u0b42\u0b4e".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl41
lbl7:
        // 1 sources

        while (true) {
            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
            Promo.lII[var4_15] = var5_16 ^= var2_13;
            var3_14 += 4;
            if (++var4_15 < var1_12) continue;
            Promo.II = IIIllIII.ll;
            return;
        }
        while (true) {
            block11: {
                switch (var15_10 % 6) {
                    case 2: {
                        v0 = 74;
                        break;
                    }
                    case 1: {
                        v0 = 45;
                        break;
                    }
                    case 3: {
                        v0 = 47;
                        break;
                    }
                    default: {
                        v0 = 54;
                        break;
                    }
                    case 5: {
                        v0 = 17;
                        break;
                    }
                    case 4: {
                        v0 = 96;
                    }
                }
                var16_1 = v0;
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                if (var15_10 < var14_9.length) continue;
                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                if (++var10_5 < var8_3.length) break block11;
                var13_8 = 0;
lbl41:
                // 2 sources

                var10_5 = 0;
                var11_6 = 0;
                var12_7 = 0;
                if (var13_8 == 0) break;
            }
            var12_7 = var8_3[var10_5] ^ var6;
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
        }
        Promo.lIl = var9_4;
        Promo.llI = new Object[var9_4.length];
        var2_13 = -1596440477;
        var0_11 = "7\u00d5A\u0007".getBytes("ISO-8859-1");
        var1_12 = var0_11.length / 4;
        Promo.lII = new int[var1_12];
        var3_14 = 0;
        var4_15 = 0;
        ** while (true)
    }

    @Override
    public void lIII(DrawContext drawContext, int n, int n2, float f) {
        this.IIl(drawContext, false);
    }

    @Override
    public double IIll() {
        return 18.0 * this.I();
    }

    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        this.IIl(drawContext, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String lII() {
        String string = this.Ill.I();
        if (string == null) return "";
        String string2 = string;
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Promo() {
        super(StringFactory.IIII("qIZbkRY="), Category.I, StringFactory.IIII("vJ1HjBVWSQ/XC4pKG9zT3oiGW5EWQ1kTmQmTGQDBnomZgFGOFFZCF9ccmkEbk9GQ2IdXjhxSXlyAAYtRD8DWn5ybQ9wYWVRclAeTVh2TzZaRkkDS"));
        this.III = this.IIlllIl(new llIll((Object)StringFactory.IIII("Shadow"), true));
        this.IIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Color Shift"), true));
        this.ll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Background"), true));
        this.I = this.IIlllIl(new lIlIIlI(StringFactory.IIII("X"), 18.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII("px")));
        this.IlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Y"), 94.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII("px")));
        this.l = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Scale"), 100.0, 75.0, 200.0, 5.0).IIII(StringFactory.IIII("%")));
    }

    @Override
    public double IlII() {
        return (Double)this.I.lIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public double III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return 42.0 * this.I();
        if (minecraftClient.textRenderer != null) return this.IlI(minecraftClient.textRenderer, this.lII()) * this.I();
        return 42.0 * this.I();
    }

    private static int lIl(int n, int n2) {
        return lII[n ^ 0xDDAEEC39] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xD3E07556;
        char[] cArray = lIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Promo.llI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x190B25CA;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 9 -> 86;
                case 18 -> 67;
                default -> 6;
                case 10 -> 178;
                case 22 -> 198;
                case 7 -> 202;
                case 25 -> 119;
                case 30 -> 181;
                case 2 -> 99;
                case 13 -> 248;
                case 31 -> 173;
                case 28 -> 214;
                case 27 -> 158;
                case 14 -> 250;
                case 23 -> 225;
                case 19 -> 174;
                case 16 -> 91;
                case 29 -> 60;
                case 3 -> 37;
                case 5 -> 124;
                case 21 -> 241;
                case 26 -> 85;
                case 15 -> 95;
                case 24 -> 132;
                case 17 -> 102;
                case 1 -> 132;
                case 6 -> 122;
                case 20 -> 10;
                case 12 -> 28;
                case 8 -> 74;
                case 4 -> 170;
                case 11 -> 42;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

