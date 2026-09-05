/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIll
 * Module         : FPS  [HUD]
 * Description    : Shows the current FPS in a small HUD cell.   (client's own text)
 *
 * Recovered strings in this class:
 *   - ), 18.0, 0.0, 4000.0, 1.0).IIIl(
 *   - ), 72.0, 0.0, 4000.0, 1.0).IIIl(
 *   - .getBytes(
 *   - Scale
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
import orchard.internal.lllIlIII;

@Environment(value=EnvType.CLIENT)
public final class FPS
extends ModuleBase
implements lllIlIII {
    private static final double I = 18.0;
    private final lIlIIlI l = this.IIlllIl(new lIlIIlI(StringFactory.IIII("X"), 18.0, 0.0, 4000.0, 1.0).IIIl("px"));
    private final lIlIIlI II = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Y"), 72.0, 0.0, 4000.0, 1.0).IIIl("px"));
    private static String[] Il;
    private static final double lI = 7.0;
    private final lIlIIlI ll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Scale"), 100.0, 75.0, 200.0, 5.0).IIIl("%"));
    private static final double III = 4.0;
    private static final IIIllIII IIl;
    private static final int[] IlI;
    private static final String[] Ill;
    private static final Object[] lII;

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

    public FPS() {
        super(StringFactory.IIII("FPS"), Category.I, StringFactory.IIII("Shows the current FPS in a small HUD cell."));
    }

    private double lI() {
        return (Double)this.ll.lIl() / 100.0;
    }

    private static void IlI() {
        FPS.Il[0] = FPS.lII(FPS.IllI(-194314181, '\udd7a', '\u6300').toCharArray(), 15547L, -550700063);
        FPS.Il[1] = FPS.lII(FPS.IllI(-429650664, '\ufa57', '\u6301').toCharArray(), 48960L, -423875854);
        FPS.Il[2] = FPS.lII(FPS.IllI(1480859579, '\ud230', '\u6302').toCharArray(), 71342L, -2147024056);
        FPS.Il[3] = FPS.lII(FPS.IllI(-584879904, '\u3f3c', '\u6303').toCharArray(), 91490L, -982609195);
        FPS.Il[4] = FPS.lII(FPS.IllI(727612432, '\u0794', '\u6304').toCharArray(), 705L, -887597874);
        FPS.Il[5] = FPS.lII(FPS.IllI(-592873806, '\u2a59', '\u6305').toCharArray(), 55969L, 609397775);
        FPS.Il[6] = FPS.lII(FPS.IllI(-1509068465, '\uf25f', '\u6306').toCharArray(), 19520L, -100843184);
        FPS.Il[7] = FPS.lII(FPS.IllI(-1854512117, '\u0f25', '\u6307').toCharArray(), 76025L, 1185405736);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block18: {
                block19: {
                    block16: {
                        block17: {
                            block15: {
                                break block18;
lbl1:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl3:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl5:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
                                break block19;
lbl9:
                                // 1 sources

                                while (true) {
                                    FPS.Il = new String[8];
                                    FPS.IlI();
                                    FPS.IIl = IIIllIII.ll;
                                    return;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    FPS.lII = new Object[var9_3.length];
                                    break block14;
                                    break;
                                }
lbl17:
                                // 1 sources

                                while (true) {
                                    var13_7 = -1;
                                    break block15;
                                    break;
                                }
lbl20:
                                // 1 sources

                                while (true) {
                                    var4_12 = 0;
                                    ** GOTO lbl3
                                    break;
                                }
lbl23:
                                // 1 sources

                                while (true) {
                                    FPS.IlI = new int[var1_9];
                                    var3_11 = 0;
                                    ** continue;
                                    break;
                                }
lbl27:
                                // 1 sources

                                while (true) {
                                    FPS.Ill = var9_3;
                                    ** continue;
                                    break;
                                }
lbl30:
                                // 1 sources

                                while (true) {
                                    if (++var10_4 < var8_2.length) break block16;
                                    break block17;
                                    break;
                                }
lbl33:
                                // 1 sources

                                while (var13_7 == 0) {
                                    ** continue;
lbl35:
                                    // 1 sources

                                    ** GOTO lbl27
                                }
                                break block16;
lbl37:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
lbl40:
                            // 2 sources

                            while (true) {
                                var10_4 = 0;
                                ** continue;
                                break;
                            }
                        }
                        var13_7 = 0;
                        ** while (true)
                        var11_5 = 0;
                        var12_6 = 0;
                        ** GOTO lbl33
lbl49:
                        // 1 sources

                        while (true) {
                            var1_9 = var0_8.length / 4;
                            ** continue;
                            break;
                        }
                    }
                    var12_6 = var8_2[var10_4] ^ var6;
                    ** while (true)
                }
                FPS.IlI[var4_12] = var5_13 ^= var2_10;
                var3_11 += 4;
                if (++var4_12 >= var1_9) ** break;
                ** while (true)
                ** while (true)
            }
            var6 = 5976;
            var7_1 = "\udd5b\u9b83\uf3cc\u123e\uc32b\uc1bb\u3203\u8842\ue577\u1568\ud49b\ue6b2\ucee9\ua051\uf8ea\u2e4d\u6bad\u0a94\ue8f8\uce4c\udfaf\u305a\ub616\u9415\uc619\u3fbc\uef04\u57f3\uec56\u3db1\u92f5\u8450\u49db\u0863\uedfa\uaa0e\uf6d0\u9afa\u1816\u84b9\ua331\uf6b2\udc28\uc18e\u4335\u2c64\uf841\uc746\u1dd6\ubc20\ue198\u9cc0\udf4f\ud948\u85d9\u3591\u1ea9\ue15e\u729f\u2470\ub3c0\udd0b\uc7a7\ucaee\u4554\u59f4\u36a5\u364f\u329f\u33df\u57ac\u60e9\u4735\ub943\u72ce\u5c34\u404d\ua9de\u63ad\ufab8\u7eee\u4bfb\u98c9\u529e\uada8\u43da\u52a7\ue8ed";
            ** while (true)
        }
        var2_10 = 2122451916;
        var0_8 = "\u00ea\u00fd\r7w)\u00c4\u00ba\u00cd\u0016\u00c9\u00e4\u008d\u00b5o\u00c6\u00c5N\u00b6\u00b4\u00b1d\u00e5\u00d7H\u0000I\u00fcw\u00ef\u00f8`Y\u0082\u00f1\u0097\u009c\u00c0f\u00a5\u00c1\u00a4C2\u001b\u00c2K\u00b0\u0094\u00ef\u0016'\u00dd2V\u00cd,\u008c\u00e1sc\u0002RA\u00c0bHq".getBytes("ISO-8859-1");
        ** while (true)
        var8_2 = "\u175c\u175c\u175c\u175c\u175c\u1760\u175c\u1750".toCharArray();
        var9_3 = new String[var8_2.length];
        ** while (true)
        var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
        var11_5 += var12_6;
        ** while (true)
    }

    @Override
    public void lllI(double d, double d2) {
        this.l.lI(Math.max(0.0, d));
        this.II.lI(Math.max(0.0, d2));
    }

    private static String lII(char[] cArray, long l2, int n) {
        int n2 = 0x6D5B8D34 ^ n;
        int n3 = 0;
        while (n3 < cArray.length) {
            n2 = n2 ^ (int)l2 ^ ~n3;
            n2 ^= n - n3 * cArray.length;
            n2 = -n2 * n | n3;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            int n4 = n3 & 0xFF;
            n = n << n4 | n >>> -n4;
            l2 ^= (long)n4;
            ++n3;
        }
        return new String(cArray);
    }

    @Override
    public double III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null) {
            if (minecraftClient.textRenderer != null) {
                return this.IIII(minecraftClient.textRenderer, this.lll()) * this.lI();
            }
        }
        return 42.0 * this.lI();
    }

    @Override
    public double IIll() {
        return 18.0 * this.lI();
    }

    @Override
    public double IlIl() {
        return (Double)this.II.lIl();
    }

    @Override
    public void llII(DrawContext drawContext, int n, int n2, float f, boolean bl) {
        this.lIl(drawContext, bl);
    }

    @Override
    public void lIII(DrawContext drawContext, int n, int n2, float f) {
        this.lIl(drawContext, false);
    }

    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        this.lIl(drawContext, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lIl(DrawContext drawContext, boolean bl) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (drawContext == null || minecraftClient == null || minecraftClient.textRenderer == null) {
            return;
        }
        double d = this.lI();
        double d2 = this.IlII();
        double d3 = this.IlIl();
        TextRenderer textRenderer = minecraftClient.textRenderer;
        String string = "fps";
        String string2 = this.lll();
        double d4 = this.IIII(textRenderer, string2);
        IIIlI.lIlIIl(drawContext);
        IIIlI.Ill(drawContext, d2, d3);
        IIIlI.IIlll(drawContext, d, d);
        try {
            IlIIIIll.l(drawContext, IIl, 0.0, 0.0, d4, 18.0, bl);
            double d5 = 7.0;
            double d6 = d5 + (double)IIIlI.IIIlll(textRenderer, string) + 4.0;
            Objects.requireNonNull(textRenderer);
            double d7 = (18.0 - 9.0) * 0.5;
            IIIlI.lllIII(true, () -> IIIlI.IlIIll(drawContext, textRenderer, string, d5, d7, IlIIIIll.II(245)));
            IIIlI.IlIIll(drawContext, textRenderer, string2, d6, d7, IlIIIIll.II(245));
        }
        finally {
            IIIlI.IlIllI(drawContext);
        }
    }

    private String lll() {
        return String.valueOf(MinecraftClient.getInstance().getCurrentFps());
    }

    @Override
    public double IlII() {
        return (Double)this.l.lIl();
    }

    private double IIII(TextRenderer textRenderer, String string) {
        return 14.0 + (double)IIIlI.IIIlll(textRenderer, "fps") + 4.0 + (double)IIIlI.IIIlll(textRenderer, string);
    }

    private static int IIlI(int n, int n2) {
        return IlI[n ^ 0xCC267804] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IllI(int n, char c, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0x6300;
        char[] cArray = Ill[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lII[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            FPS.lII[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5F41;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 38892;
            n6 -= 4835;
            n6 ^= 0x6304;
            n6 -= 56785;
            n6 ^= 0x3FAE;
            cArray[n5] = (char)((n6 ^= 0x2972) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

