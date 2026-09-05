/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIIlI
 * Module         : Inventory  [HUD]
 * Description    : Shows a compact inventory item grid.   (client's own text)
 *
 * Recovered strings in this class:
 *   - ), 240.0, 0.0, 4000.0, 1.0).IIIl(
 *   - ), 18.0, 0.0, 4000.0, 1.0).IIIl(
 *   - .getBytes(
 *   - Background
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
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.ItemStack
 */
package orchard.module.hud;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlI;
import orchard.internal.IIIllIII;
import orchard.internal.IlIIIIll;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;
import orchard.internal.lllIlIII;

@Environment(value=EnvType.CLIENT)
public final class Inventory
extends ModuleBase
implements lllIlIII {
    private final lIlIIlI I;
    private static final int l = 3;
    private static final int II = 9;
    private static final IIIllIII Il;
    private static final double lI = 172.0;
    private final lIlIIlI ll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("X"), 18.0, 0.0, 4000.0, 1.0).IIIl("px"));
    private final lIlIIlI III;
    private static final double IIl = 5.0;
    private static String[] IlI;
    private static final double Ill = 18.0;
    private static final double lII = 64.0;
    private final llIll lIl;
    private static final double llI = 0.0;
    private static final int[] lll;
    private static final String[] IIII;
    private static final Object[] IIIl;

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
    public void lIII(DrawContext drawContext, int n, int n2, float f) {
        this.IlI(drawContext, false);
    }

    @Override
    public double III() {
        return 172.0 * this.IIl();
    }

    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0x2CA7AD49 ^ n;
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
    public void llII(DrawContext drawContext, int n, int n2, float f, boolean bl) {
        this.IlI(drawContext, bl);
    }

    private static void lI() {
        Inventory.IlI[0] = Inventory.I(Inventory.IIlI('\u56ad', 2008305885, 36063).toCharArray(), 52930L, 728279133);
        Inventory.IlI[1] = Inventory.I(Inventory.IIlI('\u56ac', -1395755771, 45951).toCharArray(), 59911L, 1153818148);
        Inventory.IlI[2] = Inventory.I(Inventory.IIlI('\u56af', 879193743, 24913).toCharArray(), 40403L, -30535218);
        Inventory.IlI[3] = Inventory.I(Inventory.IIlI('\u56ae', -2058985739, 9120).toCharArray(), 70482L, -1057749322);
        Inventory.IlI[4] = Inventory.I(Inventory.IIlI('\u56a9', -973047028, 4337).toCharArray(), 48555L, -1104423577);
        Inventory.IlI[5] = Inventory.I(Inventory.IIlI('\u56a8', -588623482, 13553).toCharArray(), 26102L, -1454885606);
        Inventory.IlI[6] = Inventory.I(Inventory.IIlI('\u56ab', -1849210505, 49125).toCharArray(), 39139L, -951218614);
        Inventory.IlI[7] = Inventory.I(Inventory.IIlI('\u56aa', -384300990, 10445).toCharArray(), 39658L, -326355122);
    }

    private double IIl() {
        return (Double)this.III.lIl() / 100.0;
    }

    @Override
    public double IlII() {
        return (Double)this.ll.lIl();
    }

    @Override
    public double IIll() {
        return 64.0 * this.IIl();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IlI(DrawContext drawContext, boolean bl) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (drawContext == null || minecraftClient == null || minecraftClient.player == null || minecraftClient.textRenderer == null) {
            return;
        }
        double d = this.IIl();
        IIIlI.lIlIIl(drawContext);
        IIIlI.Ill(drawContext, this.IlII(), this.IlIl());
        IIIlI.IIlll(drawContext, d, d);
        try {
            this.lII(drawContext, bl);
            this.lll(drawContext, minecraftClient, minecraftClient.player.getInventory());
        }
        finally {
            IIIlI.IlIllI(drawContext);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void lII(DrawContext drawContext, boolean bl) {
        if (!((Boolean)this.lIl.lIl()).booleanValue()) {
            if (!bl) {
                return;
            }
        }
        IlIIIIll.l(drawContext, Il, 0.0, 0.0, 172.0, 64.0, bl);
    }

    private int lIl(int n, int n2) {
        return 9 + n * 9 + n2;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 8887;
        var7_2 = "\u93cd\u3e2c\ue786\ua7d2\u85d6\u6ab5\ue83f\u5342\uf7cf\uba78\ua5af\u405b\u53e6\u738d\u0c36\u49a3\u7621\u1977\ub16b\u302a\u7913\u752d\u6d7b\u57f5\udb03\u4250\u8e80\u5848\ud351\u7c92\u8685\u4494\u0ada\u0246\ue005\ub2dc\u6b3b\u1302\u696f\u8daa\u3937\u8598\u02fb\ue40b\uba0d\udd72\uc7df\ub109\u644b\u5503\u7907\u231e\uccfd\uee94\u1d9f\ue71e\u7a56\ub7b4\ufeb0\ud781\u0a66\ub33c\u7d2f\u17da\u9a6d\uea28\uac01\ue89e\u9f3f\u48ce\u78b1\u87cf\u1db0\u5946\ud6bc\u421b\uacd5\u596b\uc980\ufc60\u9d71\u2e7f\u3d0d\ub5b9\u79a6\u7e85\ub377\u23e3\u5e08\uffdb\u4d6a\ud2f2\u13a8\ucd81\u0e5b\u82f8\u8e85\uad94\uded9\u1db3";
        var8_3 = "\u22bf\u22b3\u2287\u22bb\u22b3\u22a7\u22b3\u22b3".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl20
lbl7:
        // 1 sources

        while (true) {
            var3_14 = 0;
            var4_15 = 0;
            if (true) ** GOTO lbl59
            break;
        }
        block7: while (true) {
            block10: {
                block11: {
                    var16_1 = v0;
                    v1 = var15_10++;
                    var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                    if (var15_10 < var14_9.length) break block10;
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_3.length) break block11;
                    var13_8 = 0;
lbl20:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = 0;
                    if (var13_8 == 0) ** GOTO lbl42
                }
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
            }
            switch (var15_10 % 5) {
                default: {
                    v0 = 115;
                    continue block7;
                }
                case 2: {
                    v0 = 67;
                    continue block7;
                }
                case 3: {
                    v0 = 36;
                    continue block7;
                }
                case 1: {
                    v0 = 53;
                    continue block7;
                }
lbl42:
                // 1 sources

                Inventory.IIII = var9_4;
                Inventory.IIIl = new Object[var9_4.length];
                var2_13 = 1588857322;
                var0_11 = "#\u00e5oD8\u00e8\u00ca@\u00c3\u00b1\\\u00c5\u0089\u00f1t\u00dc\u00e18\u00fb\u0003<\u00a6\bEEv\u001d\u0087\u001b7P\u0005\u00e9P\u0098L\r\u00f7\u00b5{X[\u0084\u00f4\u00c5\u0081F\u009b\u00ef\u00fb'\u008b\u00c8L\u00deP\u0084\u0014\u00dd\u00cf\u00971\u0087O\u001f\u0081\u009f}_\u00b2\u008fw".getBytes("ISO-8859-1");
                var1_12 = var0_11.length / 4;
                Inventory.lll = new int[var1_12];
                ** continue;
                case 4: 
            }
            v0 = 10;
        }
        while (true) {
            var3_14 += 4;
            if (++var4_15 >= var1_12) {
                Inventory.IlI = new String[8];
                Inventory.lI();
                Inventory.Il = IIIllIII.l;
                return;
            }
lbl59:
            // 3 sources

            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
            Inventory.lll[var4_15] = var5_16 ^= var2_13;
        }
    }

    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        this.IlI(drawContext, false);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void lll(DrawContext drawContext, MinecraftClient minecraftClient, PlayerInventory playerInventory) {
        TextRenderer textRenderer = minecraftClient.textRenderer;
        double d = 5.0;
        double d2 = 5.0;
        int n = 0;
        boolean bl = true;
        while (true) {
            int n2;
            if (!bl || (bl = false) || !true) {
                if (n2 < 9) {
                    int n3 = this.lIl(n, n2);
                    double d3 = d + (double)n2 * 18.0 + 1.0;
                    double d4 = d2 + (double)n * 18.0 + 1.0;
                    IlIIIIll.IlII(drawContext, d3, d4, 16.0, 16.0, 3.5);
                    ItemStack itemStack = playerInventory.getStack(n3);
                    if (!itemStack.isEmpty()) {
                        IIIlI.II(drawContext, textRenderer, itemStack, (int)Math.round(d3 + 0.0), (int)Math.round(d4 + 0.0));
                    }
                    ++n2;
                    continue;
                }
                ++n;
            }
            if (n >= 3) {
                return;
            }
            n2 = 0;
        }
    }

    @Override
    public double IlIl() {
        return (Double)this.I.lIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lllI(double d, double d2) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        double d3 = Double.MAX_VALUE;
        double d4 = Double.MAX_VALUE;
        if (minecraftClient != null && minecraftClient.getWindow() != null) {
            d3 = Math.max(0.0, (double)minecraftClient.getWindow().getScaledWidth() - this.III());
            d4 = Math.max(0.0, (double)minecraftClient.getWindow().getScaledHeight() - this.IIll());
        }
        this.ll.lI(Math.max(0.0, Math.min(d, d3)));
        this.I.lI(Math.max(0.0, Math.min(d2, d4)));
    }

    public Inventory() {
        super(StringFactory.IIII("Inventory"), Category.I, StringFactory.IIII("Shows a compact inventory item grid."));
        this.I = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Y"), 240.0, 0.0, 4000.0, 1.0).IIIl("px"));
        this.III = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Scale"), 100.0, 60.0, 200.0, 5.0).IIIl("%"));
        this.lIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Background"), true));
    }

    private static int IIII(int n, int n2) {
        return lll[n ^ 0xDD31DA99] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlI(char c, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = c ^ 0x56AD;
        char[] cArray = IIII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            Inventory.IIIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x63C1;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 44165;
            n7 += 12339;
            n7 += 57572;
            n7 -= 27962;
            n7 -= 53430;
            n7 -= 18822;
            cArray[n6] = (char)((n7 -= 46830) ^ n4 ^ n2 ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

