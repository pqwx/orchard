/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIlIllI
 * Module         : Module List  [HUD]
 * Description    : Liquid-style arraylist with scalable accents.   (client's own text)
 *
 * Recovered strings in this class:
 *   - ), 38.0, 0.0, 3000.0, 1.0).IIII(StringFactory.IIII(
 *   - Show Preview In Editor
 *   - Background Style
 *   - Background Alpha
 *   - Secondary Color
 *   - Animation Speed
 *   - Rainbow Spread
 *   - Slide Distance
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
 *  net.minecraft.client.gui.DrawContext
 */
package orchard.module.hud;

import java.awt.Color;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIlIlI;
import orchard.internal.IIIIlIllI;
import orchard.internal.IIIlI;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIllIII;
import orchard.internal.IIlIIIlll;
import orchard.internal.IIllIIIl;
import orchard.internal.IIllIl;
import orchard.internal.Il;
import orchard.internal.IlIIIIll;
import orchard.internal.IlIIlIII;
import orchard.internal.IlIllIIII;
import orchard.internal.IllI;
import orchard.internal.IllIIIll;
import orchard.internal.IlllIll;
import orchard.internal.lIIIIIll;
import orchard.internal.lIIlIIl;
import orchard.internal.lIIlllI;
import orchard.internal.lIlI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlIIll;
import orchard.internal.lIlIIllI;
import orchard.internal.llIIlllI;
import orchard.internal.llIlIlI;
import orchard.internal.llIlIlII;
import orchard.internal.llIlIllI;
import orchard.internal.llIll;
import orchard.internal.lllIlIII;
import orchard.internal.lllIllII;
import orchard.module.iface.Interface;

@Environment(value=EnvType.CLIENT)
public final class ModuleList
extends ModuleBase
implements lllIlIII {
    private static final List<IlllIll> I;
    private static final List<Il> l;
    private final IIIIIIIIl<lllIllII> II;
    private static final Color Il;
    private final lIlIIlI lI;
    private final llIll ll;
    private List<IllI> III;
    private final lIlIIlI IIl;
    private static final long IlI = 50000000L;
    private final llIlIlII Ill;
    private final llIlIlI lII;
    private final Map<String, IIIIlIlI> lIl;
    private double llI = 0.0;
    private static final IIIlIIIII lll;
    private double IIII = 0.0;
    private final Supplier<List<ModuleBase>> IIIl;
    private final lIlIIlI IIlI;
    private final lIlIIlI IIll;
    private final llIll IlII;
    private long IlIl;
    private final lIlIIlI IllI;
    private final IIIIIIIIl<IlIllIIII> Illl = this.IIlllIl(new IIIIIIIIl<IlIllIIII>(StringFactory.IIII("Style"), IlIllIIII.class, IlIllIIII.l));
    private final lIlIIlI lIII;
    private final Interface lIIl;
    private final IIIIIIIIl<lIIlIIl> lIlI;
    private static final IIIlIIIII lIll;
    private final lIlIIlI llII;
    private final llIll llIl;
    private final lIlIIlI lllI;
    private final lIlIIlI llll;
    private final lIlIIlI IIIII;
    private final llIll IIIIl;
    private final IIIIIIIIl<lIlI> IIIlI;
    private static final IIIlIIIII IIIll;
    private static final IIIlIIIII IIlII;
    private boolean IIlIl;
    private static final IIIlIIIII IIllI;
    private static final double IIlll = 3.0;
    private final llIll IlIII;
    private final llIlIlII IlIIl;
    private static final IIIllIII IlIlI;
    private final IIIIIIIIl<IllIIIll> IlIll;
    private final IIIIIIIIl<llIlIllI> IllII;
    private final lIlIIlI IllIl;
    private static final double IlllI = 3.0;
    private final IlIIlIII Illll;
    private final lIlIIlI lIIII;
    private final lIlIIlI lIIIl;
    private static final int[] lIIlI;
    private static final String[] lIIll;
    private static final Object[] lIlII;

    private Color lI() {
        Color color = (Color)this.IlIIl.lIl();
        if (color.getRGB() == new Color(155, 155, 155, 255).getRGB()) {
            return this.lIIl.IIlII();
        }
        return color;
    }

    private Color IIl() {
        Color color = (Color)this.Ill.lIl();
        if (color.getRGB() == new Color(255, 255, 255, 255).getRGB()) {
            return this.lIIl.lIlI();
        }
        return color;
    }

    private IIIlIIIII IlI(IIIlIIIII iIIlIIIII) {
        if (iIIlIIIII != null) {
            if (this.lIlI.lIl() == lIIlIIl.Il) {
                return iIIlIIIII;
            }
        } else {
            return StringFactory.lIl("");
        }
        return StringFactory.lIl(this.IllI(iIIlIIIII.IIII()).trim());
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
    public double III() {
        return this.IIII * this.lIl();
    }

    private double lII(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    private double lIl() {
        return this.lII((Double)this.IllIl.lIl() / 100.0, 0.6, 1.8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lll(MinecraftClient minecraftClient, double d, double d2) {
        double d3 = minecraftClient == null || minecraftClient.textRenderer == null ? 9.0 : orchard.internal.IIIlI.IllIII(minecraftClient.textRenderer);
        double d4 = d + (d2 - d3) * 0.5;
        return (double)Math.round(d4 * 2.0) * 0.5;
    }

    private int IIII(int n, int n2) {
        return (n2 & 0xFF) << 24 | n & 0xFFFFFF;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public List<IIllIl<?>> IlIlIl() {
        block24: {
            block25: {
                block29: {
                    block21: {
                        block23: {
                            block20: {
                                block19: {
                                    block28: {
                                        block17: {
                                            block26: {
                                                block27: {
                                                    block22: {
                                                        block18: {
                                                            block16: {
                                                                break block24;
lbl1:
                                                                // 1 sources

                                                                while (var5_5 != StringFactory.IIII("Style").llII()) {
                                                                    break block16;
                                                                }
                                                                break block18;
lbl4:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (var4_4 != this.llll) break block17;
                                                                    break block18;
lbl7:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (var5_5 == StringFactory.IIII("qpVdkhtYR1ykGJpcCw==").llII()) break block18;
                                                                        break block19;
                                                                        break;
                                                                    }
                                                                    break;
                                                                }
lbl10:
                                                                // 2 sources

                                                                while (this.II.lIl() == lllIllII.I) {
                                                                    break block20;
                                                                }
                                                                break block25;
                                                            }
                                                            if (var5_5 == StringFactory.IIII("upVXlx5FXwmZDN9qG8rSmw==").llII()) break block18;
                                                            break block26;
lbl16:
                                                            // 1 sources

                                                            while (true) {
                                                                if (((Boolean)this.ll.lIl()).booleanValue()) break block17;
                                                                break block21;
                                                                break;
                                                            }
lbl19:
                                                            // 1 sources

                                                            while (var5_5 == StringFactory.IIII("Left Margin").llII()) {
                                                                break block18;
                                                            }
                                                            ** GOTO lbl10
lbl22:
                                                            // 1 sources

                                                            while (this.II.lIl() == lllIllII.Il) {
                                                                ** GOTO lbl19
                                                            }
                                                            ** GOTO lbl10
                                                            while (true) {
                                                                var5_5 = var4_4.lllI();
                                                                ** GOTO lbl1
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
                                                                if (var5_5 != StringFactory.IIII("qptBkh1ZVQ+E").llII()) break block22;
                                                                break;
                                                            }
                                                        }
lbl33:
                                                        // 14 sources

                                                        while (true) {
                                                            if (var3_3.hasNext()) {
                                                                ** continue;
                                                            }
                                                            break block23;
                                                            break;
                                                        }
                                                    }
                                                    if (var5_5 != StringFactory.IIII("v4ZVmBBSXgjXLpZVAw==").llII()) ** GOTO lbl22
                                                    ** GOTO lbl33
                                                    var4_4 = var3_3.next();
                                                    if (var4_4 == this.IllII) ** GOTO lbl33
                                                    break block27;
lbl43:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_3 = var1_1.iterator();
                                                        ** GOTO lbl33
                                                        break;
                                                    }
lbl46:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var5_5 == StringFactory.IIII("Secondary Color").llII()) ** GOTO lbl33
lbl48:
                                                        // 2 sources

                                                        while (true) {
                                                            var2_2.add(var4_4);
                                                            ** GOTO lbl33
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (var4_4 == this.lIIIl) ** GOTO lbl33
                                                break block28;
                                            }
                                            if (var5_5 == StringFactory.IIII("upVXlx5FXwmZDN94A8PWnw==").llII()) ** GOTO lbl33
                                            ** while (true)
                                        }
                                        if (this.IlIll.lIl() == IllIIIll.I) break block29;
                                        ** while (true)
lbl61:
                                        // 1 sources

                                        while (true) {
                                            if (var4_4 != this.IIIIl) ** continue;
                                            ** GOTO lbl33
                                            break;
                                        }
                                    }
                                    if (var4_4 == this.IlII) ** GOTO lbl33
                                    ** while (true)
                                }
                                if (var5_5 != StringFactory.IIII("Rainbow Spread").llII()) break block29;
                                ** GOTO lbl33
                            }
                            if (var5_5 != StringFactory.IIII("Right Margin").llII()) break block25;
                            ** GOTO lbl33
                        }
                        return Collections.unmodifiableList(var2_2);
                    }
                    if (var4_4 == this.IIIlI) ** GOTO lbl33
                    ** while (true)
                }
                ** while (this.IlIll.lIl() != IllIIIll.lI)
lbl80:
                // 1 sources

                ** while (true)
            }
            ** while (var5_5 != StringFactory.IIII((String)"Suffix Color").llII())
lbl83:
            // 1 sources

            ** while (true)
        }
        var1_1 = super.IlIlIl();
        var2_2 = new ArrayList<IIllIl<?>>(var1_1.size());
        ** while (true)
    }

    private Color IIlI(Color color) {
        return Il;
    }

    /*
     * Enabled aggressive block sorting
     */
    private String IllI(String string) {
        String string2 = string != null ? string : "";
        switch (((lIIlIIl)this.lIlI.lIl()).ordinal()) {
            case 0: {
                String string3 = string2;
                return string3;
            }
            case 2: {
                String string3 = string2.toLowerCase(Locale.ROOT);
                return string3;
            }
            case 1: {
                String string3 = string2.toUpperCase(Locale.ROOT);
                return string3;
            }
        }
        throw new MatchException(null, null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static IIIlIIIII lIlI(Category category) {
        switch (category) {
            case l: {
                IIIlIIIII iIIlIIIII = lll;
                return iIIlIIIII;
            }
            case II: {
                IIIlIIIII iIIlIIIII = IIllI;
                return iIIlIIIII;
            }
            case lI: {
                return null;
            }
            case IIl: {
                IIIlIIIII iIIlIIIII = lIll;
                return iIIlIIIII;
            }
            case ll: {
                IIIlIIIII iIIlIIIII = IIIll;
                return iIIlIIIII;
            }
            case I: {
                IIIlIIIII iIIlIIIII = IIlII;
                return iIIlIIIII;
            }
        }
        throw new MatchException(null, null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lIll(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean bl, double d8) {
        if (!this.IlIll()) {
            IlIIIIll.IlI(drawContext, IlIlI, d4, d5, d6, d7, bl, d8);
            return;
        }
        boolean bl2 = !this.IlIII();
        boolean bl3 = this.IlIII();
        double d9 = d7;
        double d10 = d4 - (bl2 ? d9 : 0.0);
        double d11 = d6 + (bl2 || bl3 ? d9 : 0.0);
        double d12 = d + d4 * d3;
        double d13 = d2 + d5 * d3;
        orchard.internal.IIIlI.lIlI(drawContext, d12, d13, d12 + d6 * d3, d13 + d7 * d3, 0.0);
        try {
            IlIIIIll.IlI(drawContext, IlIlI, d10, d5, d11, d7, bl, d8);
        }
        finally {
            orchard.internal.IIIlI.lIllll(drawContext);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private double llIl(double d) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        double d2 = minecraftClient.getWindow() == null ? 0.0 : (double)minecraftClient.getWindow().getScaledWidth();
        if (this.II.lIl() != lllIllII.Il) return Math.max(0.0, (Double)this.IIll.lIl());
        return Math.max(0.0, d2 - (Double)this.lIII.lIl() - d);
    }

    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        this.IIlIl(drawContext, false, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color IIIII(int n, int n2) {
        Color color = this.IIl();
        if (this.IlIll.lIl() != IllIIIll.I) {
            if (this.IlIll.lIl() == IllIIIll.lI) return color;
            if (n2 <= 1) {
                return color;
            }
            double d = (double)n / (double)(n2 - 1);
            return this.lIllI(color, this.lI(), d);
        }
        return this.IIlll(0.5);
    }

    private static String IIIIl(long l2) {
        return Long.toUnsignedString(l2, 36);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIIlI(ModuleBase moduleBase) {
        if (moduleBase == null) return false;
        if (moduleBase.IlIlIIl() == null) return false;
        if (!this.lII.IIl(ModuleList.lIlI(moduleBase.IlIlIIl()))) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIll(DrawContext drawContext, llIIlllI llIIlllI2, IIIIlIllI iIIIlIllI, int n) {
        Color color = this.IIIII(0, Math.max(1, n));
        int n2 = this.IIII(color.getRGB(), 235);
        int n3 = this.IIII((iIIIlIllI == null ? color : iIIIlIllI.l()).getRGB(), 235);
        int n4 = this.IIII((iIIIlIllI != null ? iIIIlIllI.I() : color).getRGB(), 235);
        double d = Math.max(1.0, (Double)this.IIIII.lIl() - 1.0);
        double d2 = 1.0;
        double d3 = Math.max(0.0, llIIlllI2.l() - llIIlllI2.lI() - d2 * 2.0);
        double d4 = Math.max(0.0, llIIlllI2.ll() - llIIlllI2.Il() - d2 * 2.0);
        double d5 = this.IlIII() ? llIIlllI2.l() - (Double)this.llll.lIl() - d2 : llIIlllI2.lI() + d2;
        if (iIIIlIllI != null) {
            orchard.internal.IIIlI.IIlIIl(drawContext, d5, llIIlllI2.Il() + d2, (Double)this.llll.lIl(), d4, d, n3, n4);
            return;
        }
        orchard.internal.IIIlI.IlllII(drawContext, d5, llIIlllI2.Il() + d2, (Double)this.llll.lIl(), d4, d, n2);
    }

    /*
     * Unable to fully structure code
     */
    private List<IllI> IIlII(MinecraftClient var1_1, boolean var2_2, long var3_3) {
        block20: {
            block19: {
                block22: {
                    block24: {
                        block23: {
                            block26: {
                                block27: {
                                    block21: {
                                        block25: {
                                            block18: {
                                                if (this.IlIl == -9223372036854775808L) break block25;
                                                break block26;
lbl3:
                                                // 1 sources

                                                return this.III;
lbl5:
                                                // 1 sources

                                                while (true) {
                                                    var9_9 = this.IIIIII(var7_7.lIlll());
                                                    if (var8_8.lIlI()) break block18;
lbl8:
                                                    // 2 sources

                                                    while (true) {
                                                        var5_4.add(this.IIIIIl(var1_1, ModuleList.IIIIl(var7_7.IlIIllI()), var8_8, var9_9));
                                                        break block19;
                                                        break;
                                                    }
                                                    break;
                                                }
lbl12:
                                                // 1 sources

                                                return this.III;
lbl14:
                                                // 2 sources

                                                while (var6_6 < ModuleList.l.size()) {
                                                    break block20;
                                                }
                                                break block23;
lbl17:
                                                // 1 sources

                                                while (true) {
                                                    var6_5 = this.IIIl.get().iterator();
                                                    break block19;
                                                    break;
                                                }
lbl20:
                                                // 1 sources

                                                while (var7_7.IlIlIIl() != Category.lI) {
                                                    break block21;
                                                }
                                                break block19;
                                            }
                                            ** while (!var9_9.lIlI())
lbl25:
                                            // 1 sources

                                            break block19;
                                        }
lbl27:
                                        // 4 sources

                                        while (true) {
                                            var5_4 = new ArrayList<IllI>();
                                            ** continue;
                                            break;
                                        }
lbl30:
                                        // 1 sources

                                        while (true) {
                                            if (var3_3 - this.IlIl >= 50000000L) ** GOTO lbl27
                                            break block22;
                                            break;
                                        }
                                    }
                                    if (this.IIIlI((ModuleBase)var7_7)) break block27;
                                    break block19;
lbl36:
                                    // 1 sources

                                    while (!(var7_7 instanceof lllIlIII)) {
                                        ** GOTO lbl20
                                    }
                                    break block19;
lbl39:
                                    // 1 sources

                                    while (var7_7.IIIlIIl()) {
                                        ** GOTO lbl36
                                    }
                                    break block19;
                                }
                                var8_8 = this.IlI(var7_7.IIIlllI());
                                ** while (true)
                            }
                            if (var3_3 < this.IlIl) ** GOTO lbl27
                            ** while (true)
lbl48:
                            // 1 sources

                            while (true) {
                                if (!var2_2) break block23;
                                break block24;
                                break;
                            }
lbl51:
                            // 1 sources

                            while (true) {
                                var5_4.add(this.IIIIIl(var1_1, var10_10 + var11_11, this.IlI(var7_7.I()), this.IlI(var7_7.l())));
                                ** GOTO lbl14
                                break;
                            }
lbl55:
                            // 1 sources

                            while (true) {
                                var6_6 = 0;
                                ** GOTO lbl14
                                break;
                            }
lbl58:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
lbl61:
                        // 3 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl63:
                        // 1 sources

                        while (true) {
                            if (!var5_4.isEmpty()) ** GOTO lbl61
                            ** continue;
                            break;
                        }
lbl66:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        var7_7 = var6_5.next();
                        if (!var7_7.lllllI()) break block19;
                        ** GOTO lbl39
                    }
                    if (((Boolean)this.IlIII.lIl()).booleanValue()) ** break;
                    ** while (true)
                    ** while (true)
                    this.IlIl = var3_3;
                    this.IIlIl = var2_2;
                    ** while (true)
                }
                if (var2_2 == this.IIlIl) ** break;
                ** while (true)
                ** while (true)
                var5_4.sort(Comparator.comparingDouble((ToDoubleFunction<IllI>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, ll(), (Lorchard/internal/IllI;)D)()).reversed());
                this.III = List.copyOf(var5_4);
                ** while (true)
            }
            ** while (!var6_5.hasNext())
lbl87:
            // 1 sources

            ** while (true)
        }
        var7_7 = ModuleList.l.get(var6_6);
        var11_11 = var6_6++;
        var10_10 = StringFactory.IIl("p6tEjhxBWRmAN6A=");
        ** while (true)
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IIlIl(DrawContext drawContext, boolean bl, boolean bl2) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null || minecraftClient.textRenderer == null) {
            return;
        }
        IIlIIIlll iIlIIIlll = this.llllI(bl);
        if (iIlIIIlll.II().isEmpty()) {
            return;
        }
        double d = this.lIl();
        double d2 = this.IlIl();
        double d3 = (Double)this.IIl.lIl();
        double d4 = this.IIII;
        double d5 = d4 * d;
        double d6 = this.llIl(d5);
        ArrayList<IIllIIIl> arrayList = new ArrayList<IIllIIIl>(iIlIIIlll.II().size());
        for (lIIIIIll object : iIlIIIlll.II()) {
            IIIIlIlI iIIIlIlI = this.lIl.get(object.lI());
            if (iIIIlIlI == null) continue;
            arrayList.add(new IIllIIIl(iIIIlIlI, object));
        }
        int n = 0;
        for (IIllIIIl iIllIIIl : arrayList) {
            if (!(iIllIIIl.l().Il() > 0.001)) continue;
            ++n;
        }
        if (n == 0) {
            return;
        }
        double d7 = this.lIIll(minecraftClient);
        IIIIlIllI iIIIlIllI = this.IlIll.lIl() == IllIIIll.I ? this.llIII() : null;
        boolean bl3 = this.IlIll() && this.IIIlI.lIl() == orchard.internal.lIlI.Il;
        llIIlllI llIIlllI2 = bl3 ? this.lIlII(minecraftClient, arrayList, d7) : null;
        Boolean bl4 = orchard.internal.IIIlI.lIl(false);
        orchard.internal.IIIlI.lIlIIl(drawContext);
        try {
            orchard.internal.IIIlI.Ill(drawContext, d6, d2);
            orchard.internal.IIIlI.IIlll(drawContext, d, d);
            int n2 = 0;
            for (IIllIIIl iIllIIIl : arrayList) {
                lIIIIIll lIIIIIll2 = iIllIIIl.l();
                double d8 = lIIIIIll2.Il();
                if (d8 <= 0.001) continue;
                lIlIIllI lIlIIllI2 = this.lllll(minecraftClient, iIllIIIl.I(), d7);
                double d9 = Math.max(0.0, lIIIIIll2.I());
                double d10 = (1.0 - d8) * (Double)this.lllI.lIl();
                double d11 = this.II.lIl() == lllIllII.Il ? d10 : -d10;
                double d12 = this.II.lIl() == lllIllII.Il ? d4 - d9 + d11 : d11;
                double d13 = lIIIIIll2.IlI();
                Color color = this.IIIII(n2++, n);
                Color color2 = iIIIlIllI == null ? color : iIIIlIllI.l();
                Color color3 = iIIIlIllI == null ? color : iIIIlIllI.I();
                lIlIIll lIlIIll2 = this.lIlIl(d12, d9, lIlIIllI2);
                double d14 = lIlIIll2.I();
                double d15 = lIlIIll2.l();
                double d16 = this.lll(minecraftClient, d13, d3);
                int n3 = this.IIII(color.getRGB(), (int)Math.round(235.0 * d8));
                int n4 = this.IIII(color2.getRGB(), (int)Math.round(235.0 * d8));
                int n5 = this.IIII(color3.getRGB(), (int)Math.round(235.0 * d8));
                double d17 = this.IlIll() ? (Double)this.llll.lIl() + 1.0 : 0.0;
                double d18 = this.IlIII() ? d12 : d12 + d17;
                double d19 = Math.max(0.0, d9 - d17);
                this.lIll(drawContext, d6, d2, d, d18, d13, d19, d3, bl2, d8);
                if (this.IlIll() && !bl3) {
                    if (!this.IlIII()) {
                        orchard.internal.IIIlI.IlllII(drawContext, d12 + 1.0, d13 + 1.0, (Double)this.llll.lIl(), d3 - 2.0, Math.max(1.0, (Double)this.IIIII.lIl() - 1.0), iIIIlIllI == null ? n3 : n4);
                    } else {
                        orchard.internal.IIIlI.IlllII(drawContext, d12 + d9 - (Double)this.llll.lIl() - 1.0, d13 + 1.0, (Double)this.llll.lIl(), d3 - 2.0, Math.max(1.0, (Double)this.IIIII.lIl() - 1.0), iIIIlIllI == null ? n3 : n5);
                    }
                }
                int n6 = Math.max(0, Math.min(255, (int)Math.round(255.0 * d8)));
                int n7 = this.IIII(0, Math.max(0, Math.min(180, (int)Math.round(160.0 * d8))));
                if (((Boolean)this.llIl.lIl()).booleanValue()) {
                    if (!lIlIIllI2.l().lIlI()) {
                        this.IIIIlI(drawContext, minecraftClient, lIlIIllI2.l(), d14 + 1.0, d16 + 1.0, n7, false);
                    }
                    if (!lIlIIllI2.I().lIlI()) {
                        this.IIIIlI(drawContext, minecraftClient, lIlIIllI2.I(), d15 + 1.0, d16 + 1.0, n7, false);
                    }
                }
                int n8 = color.getRGB();
                int n9 = this.IIII(n8, n6);
                int n10 = this.IIII(this.IIlI(color).getRGB(), n6);
                if (!lIlIIllI2.l().lIlI()) {
                    this.IIIIlI(drawContext, minecraftClient, lIlIIllI2.l(), d14, d16, n9, true);
                }
                if (lIlIIllI2.I().lIlI()) continue;
                this.IIIIlI(drawContext, minecraftClient, lIlIIllI2.I(), d15, d16, n10, false);
            }
            if (bl3 && llIIlllI2 != null && llIIlllI2.I()) {
                this.IIIll(drawContext, llIIlllI2, iIIIlIllI, n);
            }
        }
        finally {
            orchard.internal.IIIlI.IlIllI(drawContext);
            orchard.internal.IIIlI.IlIll(bl4);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIIlIIIII IIllI(MinecraftClient minecraftClient, IIIlIIIII iIIlIIIII, double d) {
        if (iIIlIIIII == null) return StringFactory.lIl("");
        if (iIIlIIIII.lll()) return StringFactory.lIl("");
        if (!(d <= 0.0)) {
            if (!(this.Illll(minecraftClient, iIIlIIIII) <= d)) {
                IIIlIIIII iIIlIIIII2 = StringFactory.IIII("...");
                double d2 = this.Illll(minecraftClient, iIIlIIIII2);
                int[] nArray = new int[]{0};
                double[] dArray = new double[]{0.0};
                boolean[] blArray = new boolean[]{true};
                iIIlIIIII.llI(n -> {
                    if (!blArray[0]) {
                        return;
                    }
                    double d3 = orchard.internal.IIIlI.IIIlll(minecraftClient.textRenderer, new String(Character.toChars(n)));
                    if (dArray[0] + d3 + d2 > d) {
                        blArray[0] = false;
                        return;
                    }
                    dArray[0] = dArray[0] + d3;
                    nArray[0] = nArray[0] + 1;
                });
                return iIIlIIIII.II(nArray[0]).llIl(iIIlIIIII2);
            }
            return iIIlIIIII;
        }
        return StringFactory.lIl("");
    }

    private Color IIlll(double d) {
        double d2 = (Double)this.IllI.lIl() * 0.0018;
        double d3 = Math.max(1.0, (Double)this.lIIII.lIl());
        double d4 = (double)System.currentTimeMillis() * d2 + d * (d3 / 16.0);
        double d5 = 0.5 + 0.5 * Math.sin(d4 * Math.PI * 2.0);
        return this.lIllI(this.IIl(), this.lI(), d5);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIII() {
        if (this.II.lIl() != lllIllII.Il) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double IlIIl() {
        if (!this.IlIll()) return 0.0;
        double d = (Double)this.llll.lIl();
        return d;
    }

    private void IlIlI(DrawContext drawContext, MinecraftClient minecraftClient, IIIlIIIII iIIlIIIII, double d, double d2, int n) {
        double[] dArray = new double[]{d};
        iIIlIIIII.llI(n2 -> {
            String string = new String(Character.toChars(n2));
            orchard.internal.IIIlI.IlIIll(drawContext, minecraftClient.textRenderer, string, dArray[0], d2, n);
            dArray[0] = dArray[0] + (double)orchard.internal.IIIlI.IIIlll(minecraftClient.textRenderer, string);
        });
    }

    private boolean IlIll() {
        return (Boolean)this.ll.lIl();
    }

    @Override
    public void llII(DrawContext drawContext, int n, int n2, float f, boolean bl) {
        this.IIlIl(drawContext, true, bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lllI(double d, double d2) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.getWindow() == null) {
            return;
        }
        double d3 = this.III();
        double d4 = minecraftClient.getWindow().getScaledWidth();
        if (this.II.lIl() == lllIllII.Il) {
            this.lIII.lI(Math.max(0.0, d4 - d - d3));
        } else {
            this.IIll.lI(Math.max(0.0, d));
        }
        this.llII.lI(Math.max(0.0, d2));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block36: {
                block37: {
                    block32: {
                        block29: {
                            block35: {
                                block33: {
                                    block34: {
                                        block28: {
                                            block31: {
                                                block27: {
                                                    break block34;
lbl1:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl3:
                                                    // 1 sources

                                                    while (true) {
                                                        var2_1 = -1724348094;
                                                        ** continue;
                                                        break;
                                                    }
lbl6:
                                                    // 1 sources

                                                    while (var13_8 == 0) {
                                                        break block27;
                                                    }
                                                    break block35;
lbl9:
                                                    // 1 sources

                                                    while (true) {
                                                        var13_8 = 0;
                                                        break block28;
                                                        break;
                                                    }
lbl12:
                                                    // 1 sources

                                                    while (true) {
                                                        ModuleList.lIlII = new Object[var9_4.length];
                                                        ** continue;
                                                        break;
                                                    }
lbl15:
                                                    // 1 sources

                                                    while (true) {
                                                        v0(StringFactory.IIII("rJVEjBxF"), StringFactory.IIII("Simple"));
                                                        break block29;
                                                        break;
                                                    }
lbl18:
                                                    // 1 sources

                                                    while (true) {
                                                        break block30;
                                                        break;
                                                    }
lbl20:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl22:
                                                    // 1 sources

                                                    while (true) {
                                                        break block31;
                                                        break;
                                                    }
lbl24:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl26:
                                                    // 1 sources

                                                    while (true) {
                                                        v1(StringFactory.IIII("qJ1amypHXxOR"), StringFactory.IIII("150ms"));
                                                        ** continue;
                                                        break;
                                                    }
lbl29:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
                                                }
                                                ModuleList.lIIll = var9_4;
                                                ** while (true)
lbl34:
                                                // 1 sources

                                                while (true) {
                                                    ModuleList.I = List.of(new IlllIll(ModuleList.lIll, (Object)StringFactory.IIII("qJhVhRxF")), v2, v3, new IlllIll(ModuleList.lll, (Object)StringFactory.IIII("qpFamBxF")), v4);
                                                    return;
                                                }
lbl37:
                                                // 1 sources

                                                while (true) {
                                                    ModuleList.IlIlI = IIIllIII.lI;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            if (++var10_5 >= var8_3.length) {
                                                ** continue;
                                            }
                                            break block35;
                                            var0_9 = "\u00ea\u00ea\u00fe\u00d5mso\u0082\u0084\u00fd\u0004\u0089>O\f\u009e\u0094\u00c3\u00b7u\u00ec\u00fb\u00c3\u000bD\u00ac\u00d4\u00ed\u00a8Ly#\u0086\u0090\u00ba\u00fb\u00cc\u00e7q]\u00be\u0014\u0082R\u00b1JB|m\u00e3\u00c4j\u000f9\u001b>\u00db\\m\u00e5v\u00a7\u00e0\u00e1/\u00ad\u0082\u00ce\u009d\u00aa\u00e0b\u00c9\u009e\u0098\u00ae\u00b5L\u0002\u00fbx\u00d8\u00c3c*\u0012\u00f5\u00fe\u00b5\u00e4\u00a2\u00ea\u00dc\u0099\u000f\u00f4\u009d)\u00e2\u0097".getBytes("ISO-8859-1");
                                            break block36;
lbl46:
                                            // 1 sources

                                            while (true) {
                                                var13_8 = -1;
                                                break block28;
lbl49:
                                                // 1 sources

                                                while (true) {
                                                    var12_7 = 0;
                                                    ** GOTO lbl6
                                                    break;
                                                }
                                                break;
                                            }
lbl52:
                                            // 1 sources

                                            while (true) {
                                                v5(StringFactory.IIII("rIZdmx5SQj6YHA=="), StringFactory.IIII("1.9"));
                                                ** continue;
                                                break;
                                            }
lbl55:
                                            // 1 sources

                                            while (true) {
                                                var11_6 = 0;
                                                ** continue;
                                                break;
                                            }
                                            ModuleList.lll = StringFactory.IIII("RENDER");
                                            break block37;
                                        }
                                        var10_5 = 0;
                                        ** while (true)
lbl63:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl65:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl67:
                                        // 1 sources

                                        while (true) {
                                            var4_12 = 0;
                                            break block32;
                                            break;
                                        }
lbl70:
                                        // 1 sources

                                        while (true) {
                                            v3(ModuleList.IIIll, (Object)StringFactory.IIII("tZtCmRRSXgg="));
                                            break block33;
                                            break;
                                        }
                                    }
                                    var6 = 6767;
                                    var7_2 = "\u528f\u52cc\u555e\u52a2\u52b5\u555e\u5299\u52c3\u15f9\u15ee\u15cc\u15c6\u15e2\u15e6\u15b9\u15fc\u15c6\u15eb\u15e1\u15d8\u15ca\u15f4\u15a5\u15ed\u15fb\u15a6\u15e0\u15cf\u15e1\u15eb\u15b1\u15b1\u8a3a\u8a2d\u8a0b\u8a05\u8a21\u8a25\u8a7a\u8a3b\u8a05\u8a2c\u8a22\u8a07\u8a09\u8a33\u8a66\u8a79\u8a3e\u8a65\u8a0d\u8a0c\u8ad3\u8a2c\u8a72\u8a72\u8a74\u8a73\u8a77\u8a71\u8a5a\u8a4b\u8a34\u8a69\u8a15\u8a14\u8a1a\u8a78\uc97f\uc93d\uc913\uc91f\uc946\uc96b\uc96b\uc91c\uc961\uc940\uc943\uc961\uc965\uc949\uc913\uc91f\uc97a\uc970\uc936\uc936\ua7e6\ua7fc\ua7c8\ua7c3\ua7e9\ua7c8\ua79e\ua7b8\ua7c5\ua7d1\ua7b8\ua7d1\ua7c1\ua7cc\ua7f5\ua7ad\u3e6a\u3e69\u3e2a\u3e7d\u3e65\u3e5a\u3e29\u3e41\u3e6f\u3e7b\u3edb\u3e4f\u3e4d\u3ede\u3e73\u3e41\u385f\u399c\u399a\u39bd\u39a3\u39b8\u398e\u39b0\u398b\u398c\u39e5\u39b7\u398e\u3986\u398e\u3984\ub7c1\ub7c2\ub7e8\ub7c6\ub7cb\ub7da\ub7f6\ub7e9\ub794\ub781\ub7c9\ub7cb\ub7e7\ub7ec\ub7c2\ub7c3\ub7e3\ub7f7\ub7bd\ub7bd\u3c36\u3c35\u3cd3\u3c11\u3c00\u3c0d\u3c01\u3cde\u3cd7\u3c76\u3c3e\u3c00\u3c24\u3c2e\u3c76\u3c18\u3c31\u3c01\u3c18\u3c4a\u7879\u782d\u7870\u7852\u7813\u7872\u781e\u784e\u784d\u7859\u7820\u7877\u784b\u7876\u7872\u784f\u7849\u7831\u7864\u7875\u8e84\u8ec6\u8e98\u8157\u8e8a\u8ebc\u8e8c\u8ea2\u8ea5\u8eb2\u8ebf\u8153\u815e\u8ec6\u8153\u8ecf\ufa89\ufafe\ufac7\ufad9\u0d0d\u0d22\u0d36\u0d4d\u0d0e\u0d3a\u0d06\u0d02\ua3a8\ua396\ua257\ua3e8\ua255\ua3b9\ua3ab\ua3b9\uec68\uec72\uec68\uec6b\uec17\uec48\uec42\uec1b\uec66\uec6b\uec65\uecdf\uaea9\ua15c\uae80\uae90\ua15d\uae8e\uaea2\uaea6\u45a0\u4588\u45bb\u45ac\ud391\ud25c\ud3b9\ud3b7\ud3b0\ud38b\ud3d8\ud3b2\ud3a4\ud389\ud3c5\ud3ac\ud25b\ud254\ud3c0\ud3c0\u15b1\u145e\u1457\u1588\u2e6c\u2e41\u2e2c\u2e1c\u2e68\u2e64\u2e6b\u2e73\u2e43\u2e63\u2e76\u2e59\u0132\u01dc\u013e\u013e\u01d4\u011a\u0128\u0166\u00f4\u00ec\u00e8\u00e5\u00cc\u00e4\u00ca\u00f8\ub2f3\ub2b7\ub2b3\ub2ea\ub2da\ub2f2\ub296\ub2e1\u604f\u6016\u6048\u607a\u6048\u606e\u6058\u606a\u6208\u6248\u6237\u6229\u620d\u620b\u620b\u6227\u086d\u0843\u086d\u087c\u0816\u084b\u084b\u084c\u0851\u0810\u0810\u0826\uf896\uf895\uf8c3\uf8e6\uf8fa\uf8c7\uf89d\uf8c3\u747f\u7467\u746c\u747b\ub67d\ub613\ub67d\ub66a\ub652\ub61b\ub61f\ub61c\ub66e\ub66d\ub66c\ub64e\ub660\ub63d\ub67c\ub636\u02c4\u029e\u0287\u02e2\u02ff\u02e6\u0296\u02e4\u0290\u02e7\u02bd\u0294\u0293\u02ee\u02ea\u02f5\u02e4\u028f\u029c\u029b\u02fe\u029e\u02fb\u02ea\u02f1\u029e\u02e3\u029d\u02e7\u02c0\u0297\u029c\u02ca\u02f0\u02cf\u02e0\u02e1\u02e6\u02ce\u02e7\u0285\u0283\u029d\u02ee\u02fc\u02fc\u02ff\u02ee\u02f1\u02f2\u02ee\u02e4\u0290\u0283\u029f\u02e1\u02ff\u0298\u02d8\u0296\u15e9\u145e\u15cc\u15d8\u15e3\u15cc\u159f\u1455\u1166\u114b\u1169\u1115\u111e\u1179\u1115\u1162\u1147\u1143\u117c\u1175\u2e7c\u2e7b\u2e3c\u2e1f\u2e47\u2e6c\u2e3b\u2e13\u2e4d\u2e69\u2e09\u2e6d\u2e6f\u2e30\u2e61\u2e13\u6b26\u6b06\u6bdc\u6b62\ue742\ue760\ue764\ue717\ue74d\ue764\ue75a\ue734\ue761\ue715\ue734\ue715\ue765\ue710\ue771\ue709\u5ff0\u5f90\u5fd2\u5f8c\u3bb7\u3bb9\u3bc5\u3bc5\uafd7\uaf37\uaf39\uaf63\u3110\u31dc\u316b\u3149\u3166\u314d\u316a\u31d4\ufc53\ufdc1\ufc5d\ufc5d\u1321\u133b\u1312\u1302\u1339\u1336\u1320\u136d\u1336\u1302\u1335\u1333\u1303\u130b\u1321\u131f\u031d\u037d\u0363\u0339\ucdaa\ucd83\ucdbf\ucd8a\ucda6\ucd8b\ucd8b\ucdb3\ucdbf\ucc50\ucd96\ucd96\u4cb0\u4f50\u4c92\u4ccc\uf77b\uf77c\uf770\uf77a\uf751\uf744\uf73b\uf762\uf71e\uf71b\uf711\uf76f\u1d7e\u1d1e\u1d44\u1d1a\u18c0\u18cb\u18ed\u18e3\u18f7\u18c3\u1880\u189d\u18e3\u18ce\u18c8\u18f1\u189f\u1895\u1884\u18cc\u189e\u1883\u18d9\u18fa\u18c8\u18ce\u1898\u1898\u7c04\u7c2d\u7c33\u7c2f\u7c3c\u7c25\u7c33\u7cd3\u62f1\u62c0\u62e2\u62ce\u62e9\u62d8\u62e2\u62c2\u62c1\u62c2\u62f7\u62c3\u62c1\u62c0\u62c8\u62c9\u62f3\u62e3\u62b9\u62b9\ua853\ua98b\ua987\ua98e\ua9ba\ua987\ua9ad\ua9e1\ua9b6\ua982\ua9ec\ua9b4\ua971\ua926\ua948\ua943\ua91d\ua96a\ua974\ua952\ua975\ua976\ua9db\ua959\ua974\ua97c\ua974\ua97e\u6852\u6812\u6851\u686e\u6870\u6844\u6858\u686d\u6873\u6867\u681c\u6871\u6861\u6866\u681a\u681a\u579a\u57a2\u57a3\u57bd\u57b4\u57ab\u5781\u565f\u57ac\u57af\u5792\u57d9\u565b\u57ce\u5657\u57a0\u57a1\u57ba\u57c6\u57c6\u99e9\u985d\u99c0\u99c2\u99e3\u99e2\u99ee\u99fe\u99fd\u99c9\u9850\u99c7\u99fb\u99c6\u99e2\u99ff\u99d9\u99a1\u9994\u99c5\u03f3\u03c8\u03e2\u0390\u03cc\u03f0\u03b3\u03f2\u0390\u03c1\u03cb\u039e\u03e4\u03fa\u03bf\u03b4\u03e7\u03b0\u03e8\u03e1\u03da\u03c1\u03bb\u03bb\u3d10\u3d41\u3d6f\u3d73\u3d78\u3d49\u3d6f\u3d4f\u3d40\u3d5a\u3d10\u3d60\u3d4f\u3d44\u3d1f\u3d49\u0f71\u0f51\u0f1f\u0fd5\u7815\u7816\u7874\u7872\u786f\u786e\u7862\u787d\u7848\u78d5\u781d\u786f\u7843\u7840\u7816\u7867\u7847\u7813\u7829\u7829\uc772\uc771\uc747\uc715\uc71c\uc769\uc765\uc75a\uc743\uc732\uc77a\uc71c\uc748\uc74a\uc732\uc714\uc775\uc765\uc714\uc72e\u3103\u3147\u313c\u3108\u313f\u3122\u3105\u312c\u3108\u3122\u3125\u31d7\u31dc\u312a\u3147\u312c\u3128\u31de\u312b\u314f\ue872\ue852\ue810\ue8d6\u6fd4\u6f3d\u6fd7\u6f23\u6f2e\u6f35\u6f2f\u6f03\u6f02\u6f35\u6f1a\u6f3d\u6f36\u6f0e\u6fdf\u6f0d\u6f06\u6fd3\u6f25\u6f38\u5822\u581a\u5806\u580f\u582b\u5806\u5820\u5839\u5835\u5812\u5862\u5808\u5812\u5868\u5825\u581f\ue03d\ue07f\ue021\ue0dd\ue018\ue039\ue039\ue02a\ue0d3\ue00e\ue011\ue0d3\ue027\ue03b\ue021\ue0dd\ue02c\ue03e\ue048\ue048\u99b8\u99f8\u9985\u99b4\u9850\u9991\u99f8\u998c\u9984\u985b\u9986\u9992\u99b6\u99a6\u99e0\u99e0\u2061\u20d5\u206a\u2064\u2079\u2021\u206e\u2060\u2041\u207a\u206d\u2044Q\u207c\u2062\u204f\u2076\u202f\u2014\u2041\u20d3\u2014\u20d4\u2041\u204a\u2049\u2067\u2077\u2074\u2041\u20dd\u20dd";
                                    ** while (true)
lbl77:
                                    // 1 sources

                                    while (true) {
                                        v4(ModuleList.IIlII, (Object)StringFactory.IIII("sKFw"));
                                        ** continue;
                                        break;
                                    }
lbl80:
                                    // 1 sources

                                    while (true) {
                                        var11_6 += var12_7;
                                        ** continue;
                                        break;
                                    }
                                }
                                ** while (true)
                            }
                            var12_7 = var8_3[var10_5] ^ var6;
                            var9_4[var10_5] = var7_2.substring(var11_6, var11_6 + var12_7);
                            ** while (true)
lbl89:
                            // 1 sources

                            while (true) {
                                var3_11 = 0;
                                ** continue;
                                break;
                            }
                        }
                        ModuleList.l = List.of(v5, v1, v0);
                        ** while (true)
                        ModuleList.lIIlI[var4_12] = var5_13 ^= var2_1;
                        var3_11 += 4;
                        ** while (++var4_12 >= var1_10)
                    }
                    var5_13 = (var0_9[var3_11] & 255) << 24 | (var0_9[var3_11 + 1] & 255) << 16 | (var0_9[var3_11 + 2] & 255) << 8 | var0_9[var3_11 + 3] & 255;
                    ** while (true)
lbl101:
                    // 1 sources

                    while (true) {
                        v2(ModuleList.IIllI, (Object)StringFactory.IIII("u5tZnhhD"));
                        ** continue;
                        break;
                    }
                    var8_3 = "\u1a67\u1a77\u1a77\u1a63\u1a7b\u1a7f\u1a7f\u1a7f\u1a7b\u1a7b\u1a7b\u1a7f\u1a6b\u1a67\u1a67\u1a63\u1a67\u1a6b\u1a7f\u1a6b\u1a63\u1a67\u1a67\u1a67\u1a67\u1a67\u1a63\u1a67\u1a6b\u1a7f\u1a53\u1a67\u1a63\u1a7f\u1a6b\u1a7f\u1a6b\u1a6b\u1a6b\u1a67\u1a6b\u1a7f\u1a6b\u1a63\u1a6b\u1a63\u1a6b\u1a77\u1a67\u1a7b\u1a63\u1a7f\u1a7f\u1a7b\u1a7b\u1a77\u1a7f\u1a6b\u1a7b\u1a7b\u1a7b\u1a6b\u1a7b\u1a7f\u1a7b\u1a7f\u1a4f".toCharArray();
                    var9_4 = new String[var8_3.length];
                    ** while (true)
                    ModuleList.IIllI = StringFactory.IIII("COMBAT");
                    ModuleList.IIIll = StringFactory.IIII("MOVEMENT");
                    ** while (true)
                }
                ModuleList.IIlII = StringFactory.IIII("HUD");
                ** while (true)
                ModuleList.Il = Color.WHITE;
                ModuleList.lIll = StringFactory.IIII("PLAYER");
                ** while (true)
            }
            var1_10 = var0_9.length / 4;
            ModuleList.lIIlI = new int[var1_10];
            ** while (true)
        }
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private double Illll(MinecraftClient minecraftClient, IIIlIIIII iIIlIIIII) {
        if (iIIlIIIII == null) return 0.0;
        if (iIIlIIIII.lll()) {
            return 0.0;
        }
        double[] dArray = new double[]{0.0};
        iIIlIIIII.llI(n -> {
            dArray[0] = dArray[0] + (double)orchard.internal.IIIlI.IIIlll(minecraftClient.textRenderer, new String(Character.toChars(n)));
        });
        return dArray[0];
    }

    @Override
    public double IIll() {
        return this.llI * this.lIl();
    }

    private double lIIIl(lIlIIllI lIlIIllI2) {
        return lIlIIllI2.II() + (Double)this.IIlI.lIl() * 2.0 + this.IlIIl() + 8.0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double lIIlI() {
        if (!this.IlIll()) return 0.0;
        double d = (Double)this.llll.lIl() + 2.0;
        return d;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lIIll(MinecraftClient minecraftClient) {
        if (minecraftClient.getWindow() == null) {
            return Double.POSITIVE_INFINITY;
        }
        double d = minecraftClient.getWindow().getScaledWidth();
        double d2 = this.II.lIl() == lllIllII.Il ? (Double)this.lIII.lIl() : (Double)this.IIll.lIl();
        double d3 = Math.max(0.0, d - Math.max(0.0, d2)) / this.lIl();
        return Math.max(0.0, d3 - (Double)this.IIlI.lIl() * 2.0 - this.IlIIl() - 8.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private llIIlllI lIlII(MinecraftClient minecraftClient, List<IIllIIIl> list, double d) {
        double d2 = Double.POSITIVE_INFINITY;
        double d3 = Double.NEGATIVE_INFINITY;
        double d4 = Double.POSITIVE_INFINITY;
        double d5 = Double.NEGATIVE_INFINITY;
        int n = 0;
        Iterator<IIllIIIl> iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                if (n != 0) return new llIIlllI(d2, d3, d4, d5, n);
                return new llIIlllI(0.0, 0.0, 0.0, 0.0, 0);
            }
            IIllIIIl iIllIIIl = iterator.next();
            lIIIIIll lIIIIIll2 = iIllIIIl.l();
            double d6 = lIIIIIll2.Il();
            if (d6 <= 0.001) continue;
            double d7 = Math.max(0.0, lIIIIIll2.I());
            double d8 = (1.0 - d6) * (Double)this.lllI.lIl();
            double d9 = this.II.lIl() != lllIllII.Il ? -d8 : d8;
            double d10 = this.II.lIl() == lllIllII.Il ? this.IIII - d7 + d9 : d9;
            double d11 = lIIIIIll2.IlI();
            d2 = Math.min(d2, d10);
            d3 = Math.max(d3, d10 + d7);
            d4 = Math.min(d4, d11);
            d5 = Math.max(d5, d11 + (Double)this.IIl.lIl());
            ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIlIIll lIlIl(double d, double d2, lIlIIllI lIlIIllI2) {
        double d3 = this.lIIlI();
        double d4 = (Double)this.IIlI.lIl() + 3.0;
        double d5 = d + d4 + (!this.IlIII() ? d3 : 0.0);
        double d6 = d + d2 - d4 - (!this.IlIII() ? 0.0 : d3);
        double d7 = Math.max(0.0, d6 - d5);
        double d8 = Math.min(lIlIIllI2.II(), d7);
        double d9 = Math.min(lIlIIllI2.Il(), d8);
        double d10 = lIlIIllI2.Il() > 0.0 && lIlIIllI2.lI() > 0.0 ? this.llIll() : 0.0;
        double d11 = this.II.lIl() == lllIllII.Il ? d6 - d8 : d5;
        d11 = this.lII(d11, d5, Math.max(d5, d6 - d8));
        double d12 = !(lIlIIllI2.lI() > 0.0) ? d11 : d11 + d9 + d10;
        return new lIlIIll(d11, d12);
    }

    @Override
    public double IlIl() {
        return (Double)this.llII.lIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color lIllI(Color color, Color color2, double d) {
        double d2 = Math.max(0.0, Math.min(1.0, d));
        int n = (int)Math.round((double)color.getRed() + (double)(color2.getRed() - color.getRed()) * d2);
        int n2 = (int)Math.round((double)color.getGreen() + (double)(color2.getGreen() - color.getGreen()) * d2);
        int n3 = (int)Math.round((double)color.getBlue() + (double)(color2.getBlue() - color.getBlue()) * d2);
        int n4 = (int)Math.round((double)color.getAlpha() + (double)(color2.getAlpha() - color.getAlpha()) * d2);
        return new Color(n, n2, n3, n4);
    }

    @Override
    public void lIII(DrawContext drawContext, int n, int n2, float f) {
        this.IIlIl(drawContext, false, false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private IIIIlIllI llIII() {
        return new IIIIlIllI(this.IIlll(0.0), this.IIlll(1.0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ boolean llIlI(Set set, String string) {
        if (set.contains(string)) return false;
        return true;
    }

    private double llIll() {
        return 3.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIlIIIlll llllI(boolean bl) {
        Object object;
        Object object22;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.textRenderer == null) {
            return this.Illll.lII();
        }
        long l2 = System.nanoTime();
        List<IllI> list = this.IIlII(minecraftClient, bl, l2);
        double d = this.lIIll(minecraftClient);
        ArrayList<lIIlllI> arrayList = new ArrayList<lIIlllI>(list.size());
        for (Object object22 : list) {
            object = this.lIl.computeIfAbsent(((IllI)object22).II(), string -> new IIIIlIlI());
            ((IIIIlIlI)object).lI = ((IllI)object22).l();
            ((IIIIlIlI)object).I = ((IllI)object22).lI();
            ((IIIIlIlI)object).II = ((IllI)object22).Il();
            ((IIIIlIlI)object).Il = ((IllI)object22).I();
            ((IIIIlIlI)object).l = ((IllI)object22).ll();
            lIlIIllI lIlIIllI2 = this.lllll(minecraftClient, (IIIIlIlI)object, d);
            arrayList.add(new lIIlllI(((IllI)object22).II(), this.lIIIl(lIlIIllI2)));
        }
        IIlIIIlll iIlIIIlll = this.Illll.l(arrayList, (Double)this.IIl.lIl(), 0.0, (Double)this.lI.lIl(), l2);
        object22 = new HashSet();
        object = iIlIIIlll.II().iterator();
        while (true) {
            if (!object.hasNext()) {
                this.lIl.keySet().removeIf(arg_0 -> ModuleList.llIlI((Set)object22, arg_0));
                this.IIII = iIlIIIlll.l();
                this.llI = iIlIIIlll.I();
                return iIlIIIlll;
            }
            lIIIIIll lIIIIIll2 = (lIIIIIll)object.next();
            object22.add(lIIIIIll2.lI());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public ModuleList(Supplier<List<ModuleBase>> supplier, Interface interface_) {
        super(StringFactory.IIII("tZtQiRVSEDCeG4s="), Category.I, StringFactory.IIII("tJ1FiRBTHQ+DEZNcT9LMjJmNWJUKQxALnhyXGRzQ35KZlliZWVZTH5IGi0pB"), true);
        this.II = this.IIlllIl(new IIIIIIIIl<lllIllII>(StringFactory.IIII("Alignment"), lllIllII.class, lllIllII.Il));
        this.lIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Right Margin"), 1.0, 0.0, 300.0, 1.0).IIII(StringFactory.IIII("px")));
        this.IIll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Left Margin"), 14.0, 0.0, 300.0, 1.0).IIII(StringFactory.IIII("px")));
        this.llII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Y"), 38.0, 0.0, 3000.0, 1.0).IIII(StringFactory.IIII("px")));
        this.IllIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Scale"), 100.0, 60.0, 180.0, 5.0).IIII(StringFactory.IIII("%")));
        this.IIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Item Height"), 14.0, 12.0, 24.0, 1.0).IIII(StringFactory.IIII("px")));
        this.IIlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Padding"), 0.25, 0.25, 12.0, 0.25).IIII(StringFactory.IIII("px")));
        this.IIIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Roundness"), 2.0, 0.0, 10.0, 0.5).IIII(StringFactory.IIII("px")));
        this.IllII = this.IIlllIl(new IIIIIIIIl<llIlIllI>(StringFactory.IIII("Background Style"), llIlIllI.class, llIlIllI.I));
        this.ll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Accent"), true));
        this.IIIlI = this.IIlllIl(new IIIIIIIIl<lIlI>(StringFactory.IIII("Accent Layout"), lIlI.class, orchard.internal.lIlI.Il));
        this.lIlI = this.IIlllIl(new IIIIIIIIl<lIIlIIl>(StringFactory.IIII("Text Case"), lIIlIIl.class, lIIlIIl.Il));
        this.IIIIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Suffix Color"), true));
        this.IlIll = this.IIlllIl(new IIIIIIIIl<IllIIIll>(StringFactory.IIII("Color Mode"), IllIIIll.class, IllIIIll.l));
        this.Ill = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Primary Color"), new Color(255, 255, 255, 255)));
        this.IlIIl = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Secondary Color"), new Color(155, 155, 155, 255)));
        this.lIIIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Background Alpha"), 132.0, 0.0, 255.0, 1.0));
        this.llll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Accent Width"), 2.0, 1.0, 6.0, 0.5).IIII(StringFactory.IIII("px")));
        this.IllI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Rainbow Speed"), 0.6, 0.2, 1.0, 0.1));
        this.lIIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Rainbow Spread"), 16.0, 2.0, 64.0, 1.0));
        this.lllI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Slide Distance"), 24.0, 0.0, 80.0, 1.0).IIII(StringFactory.IIII("px")));
        this.lI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Animation Speed"), 0.7, 0.05, 0.7, 0.01));
        this.llIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Text Shadow"), true));
        this.IlII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Gradient Fill"), true));
        this.lII = this.IIlllIl(new llIlIlI(StringFactory.IIII("Categories"), I, Set.of(IIIll, IIllI)));
        this.IlIII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Show Preview In Editor"), true));
        this.lIl = new LinkedHashMap<String, IIIIlIlI>();
        this.Illll = new IlIIlIII();
        this.III = List.of();
        this.IlIl = Long.MIN_VALUE;
        this.IIIl = supplier;
        this.lIIl = interface_;
        this.IIIlI.lIII(this.ll::lIl);
        this.llll.lIII(this.ll::lIl);
        this.IIlIIll(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIlIIllI lllll(MinecraftClient minecraftClient, IIIIlIlI iIIIlIlI, double d) {
        double d2;
        double d3;
        double d4;
        IIIlIIIII iIIlIIIII;
        IIIlIIIII iIIlIIIII2;
        block2: {
            block3: {
                double d5;
                double d6;
                block1: {
                    iIIlIIIII2 = iIIIlIlI.lI == null ? StringFactory.lIl("") : iIIIlIlI.lI;
                    iIIlIIIII = iIIIlIlI.I != null ? iIIIlIlI.I : StringFactory.lIl("");
                    d4 = Math.max(0.0, d);
                    d3 = this.llIll();
                    d6 = iIIIlIlI.II;
                    d2 = iIIIlIlI.Il;
                    d5 = d6 + (!(d2 > 0.0) ? 0.0 : d3 + d2);
                    if (Double.isInfinite(d4)) return new lIlIIllI(iIIlIIIII2, iIIlIIIII, d6, d2, d5);
                    if (d5 <= d4) break block1;
                    if (!iIIlIIIII.lIlI() && !(d2 <= 0.0)) break block2;
                    break block3;
                }
                return new lIlIIllI(iIIlIIIII2, iIIlIIIII, d6, d2, d5);
            }
            IIIlIIIII iIIlIIIII3 = this.IIllI(minecraftClient, iIIlIIIII2, d4);
            double d7 = this.Illll(minecraftClient, iIIlIIIII3);
            return new lIlIIllI(iIIlIIIII3, StringFactory.lIl(""), d7, 0.0, d7);
        }
        if (!(d2 >= d4)) {
            double d8 = Math.max(0.0, d4 - d2 - d3);
            IIIlIIIII iIIlIIIII4 = this.IIllI(minecraftClient, iIIlIIIII2, d8);
            double d9 = this.Illll(minecraftClient, iIIlIIIII4);
            if (!iIIlIIIII4.lIlI()) return new lIlIIllI(iIIlIIIII4, iIIlIIIII, d9, d2, d9 + d3 + d2);
            return new lIlIIllI(StringFactory.lIl(""), iIIlIIIII, 0.0, d2, d2);
        }
        IIIlIIIII iIIlIIIII5 = this.IIllI(minecraftClient, iIIlIIIII, d4);
        double d10 = this.Illll(minecraftClient, iIIlIIIII5);
        return new lIlIIllI(StringFactory.lIl(""), iIIlIIIII5, 0.0, d10, d10);
    }

    @Override
    public double IlII() {
        return this.llIl(this.III());
    }

    private IIIlIIIII IIIIII(String string) {
        return StringFactory.lIl(this.IllI(string).trim());
    }

    /*
     * Enabled aggressive block sorting
     */
    private IllI IIIIIl(MinecraftClient minecraftClient, String string, IIIlIIIII iIIlIIIII, IIIlIIIII iIIlIIIII2) {
        double d = this.Illll(minecraftClient, iIIlIIIII);
        double d2 = iIIlIIIII2 != null && !iIIlIIIII2.lIlI() ? this.Illll(minecraftClient, iIIlIIIII2) : 0.0;
        double d3 = d + (d2 > 0.0 ? this.llIll() + d2 : 0.0);
        return new IllI(string, iIIlIIIII, iIIlIIIII2, d, d2, d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIlI(DrawContext drawContext, MinecraftClient minecraftClient, IIIlIIIII iIIlIIIII, double d, double d2, int n, boolean bl) {
        if (bl && this.IlIll.lIl() == IllIIIll.l) {
            orchard.internal.IIIlI.lllIII(true, () -> this.IlIlI(drawContext, minecraftClient, iIIlIIIII, d, d2, n));
            return;
        }
        this.IlIlI(drawContext, minecraftClient, iIIlIIIII, d, d2, n);
    }

    private static int IIIIll(int n, int n2) {
        return lIIlI[n ^ 0x904DA0B7] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIIlII(char c, int n, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xECF4;
        char[] cArray = lIIll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIlII[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            ModuleList.lIlII[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6322;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xF957;
            n6 += 41278;
            n6 += 54709;
            n6 ^= 0x4FF8;
            n6 += 52088;
            n6 -= 29227;
            n6 += 30024;
            n6 += 32680;
            cArray[n5] = (char)((n6 += 1473) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

