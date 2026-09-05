/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIlIll
 * Module         : KeybindsHUD  [HUD]
 * Description    : Shows all bound modules and their assigned keys.   (client's own text)
 *
 * Recovered strings in this class:
 *   - ), 120.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII(
 *   - ), 24.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII(
 *   - No bound modules
 *   - Enabled Only
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
 *  net.minecraft.client.gui.DrawContext
 */
package orchard.module.hud;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlI;
import orchard.internal.IlIIIIll;
import orchard.internal.IlIIllIlI;
import orchard.internal.lIII;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;
import orchard.internal.lllIlIII;
import orchard.module.iface.Interface;

@Environment(value=EnvType.CLIENT)
public final class KeybindsHUD
extends ModuleBase
implements lllIlIII {
    private final lIlIIlI I;
    private final lIlIIlI l;
    private final llIll II = this.IIlllIl(new llIll((Object)StringFactory.IIII("Enabled Only"), false));
    private final lIlIIlI Il = this.IIlllIl(new lIlIIlI(StringFactory.IIII("X"), 24.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII("px")));
    private final Supplier<List<ModuleBase>> lI;
    private final Interface ll;
    private static final int[] III;
    private static final String[] IIl;
    private static final Object[] IlI;

    private double I() {
        return (Double)this.l.lIl() / 100.0;
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

    /*
     * Enabled aggressive block sorting
     */
    private lIII lI(MinecraftClient minecraftClient, List<IlIIllIlI> list) {
        if (minecraftClient == null) return new lIII(150.0, 42.0);
        if (minecraftClient.textRenderer == null) {
            return new lIII(150.0, 42.0);
        }
        double d = 118.0;
        double d2 = 18.0;
        Iterator<IlIIllIlI> iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                double d3 = 14.0 + (double)Math.max(1, list.size()) * d2;
                return new lIII(Math.max(140.0, d), Math.max(36.0, d3));
            }
            IlIIllIlI ilIIllIlI = iterator.next();
            double d4 = (double)(IIIlI.IIIlll(minecraftClient.textRenderer, ilIIllIlI.I) + IIIlI.IIIlll(minecraftClient.textRenderer, ilIIllIlI.l)) + 42.0;
            d = Math.max(d, d4);
        }
    }

    @Override
    public double IIll() {
        return this.lI((MinecraftClient)MinecraftClient.getInstance(), this.IlI()).I * this.I();
    }

    @Override
    public void lIII(DrawContext drawContext, int n, int n2, float f) {
        this.lII(drawContext, false);
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
        this.Il.lI(Math.max(0.0, Math.min(d, d3)));
        this.I.lI(Math.max(0.0, Math.min(d2, d4)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public KeybindsHUD(Supplier<List<ModuleBase>> supplier, Interface interface_) {
        super(StringFactory.IIII("KeybindsHUD"), Category.I, StringFactory.IIII("Shows all bound modules and their assigned keys."));
        this.I = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Y"), 120.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII("px")));
        this.l = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Scale"), 100.0, 70.0, 180.0, 5.0).IIII(StringFactory.IIII("%")));
        this.lI = supplier;
        this.ll = interface_;
    }

    @Override
    public void llII(DrawContext drawContext, int n, int n2, float f, boolean bl) {
        this.lII(drawContext, bl);
    }

    private static /* synthetic */ String IIl(IlIIllIlI ilIIllIlI) {
        return ilIIllIlI.I;
    }

    /*
     * Unable to fully structure code
     */
    private List<IlIIllIlI> IlI() {
        block25: {
            block20: {
                block27: {
                    block22: {
                        block19: {
                            block24: {
                                block26: {
                                    block21: {
                                        block16: {
                                            block17: {
                                                block23: {
                                                    block18: {
                                                        block15: {
                                                            block13: {
                                                                block14: {
                                                                    break block21;
lbl1:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (!var6_6.isBlank()) break block13;
                                                                        break block14;
                                                                        while (true) {
                                                                            break block15;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
lbl6:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_3 = var2_2.iterator();
                                                                        break block16;
                                                                        break;
                                                                    }
                                                                }
                                                                var6_6 = var4_4.IIllllI();
                                                            }
                                                            if (var6_6 == null) break block16;
                                                            break block22;
lbl14:
                                                            // 1 sources

                                                            while (true) {
                                                                if (var4_4 == this) break block16;
                                                                break block17;
                                                                break;
                                                            }
lbl17:
                                                            // 1 sources

                                                            while (var5_5 == null) {
                                                                break block18;
                                                            }
                                                            break block23;
lbl20:
                                                            // 2 sources

                                                            while (true) {
                                                                var5_5 = var4_4.IIIlllI();
                                                                ** GOTO lbl17
                                                                break;
                                                            }
                                                        }
                                                        var1_1.sort(Comparator.comparing((Function<IlIIllIlI, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IIl(orchard.internal.IlIIllIlI ), (Lorchard/internal/IlIIllIlI;)Ljava/lang/String;)(), String.CASE_INSENSITIVE_ORDER));
                                                        return var1_1;
                                                    }
                                                    v0 = "";
                                                    break block24;
                                                }
                                                v0 = var5_5.IIII();
                                                break block24;
lbl32:
                                                // 2 sources

                                                return var1_1;
lbl34:
                                                // 1 sources

                                                while (var7_7.isBlank()) {
                                                    break block16;
                                                }
                                                break block25;
lbl37:
                                                // 1 sources

                                                while (var7_7 != null) {
                                                    ** GOTO lbl34
                                                }
                                                break block16;
                                            }
                                            if (var4_4.IIIIIII()) break block26;
                                            break block16;
lbl43:
                                            // 1 sources

                                            while (true) {
                                                var7_7 = lIIllllI.IlIl(var4_4.IIIllII());
                                                ** GOTO lbl37
                                                break;
                                            }
lbl46:
                                            // 1 sources

                                            while (true) {
                                                if (var2_2 == null) ** GOTO lbl32
                                                break block19;
                                                break;
                                            }
                                        }
lbl50:
                                        // 5 sources

                                        while (true) {
                                            if (!var3_3.hasNext()) ** continue;
                                            break block20;
                                            break;
                                        }
                                    }
                                    var1_1 = new ArrayList<IlIIllIlI>();
                                    var2_2 = this.lI.get();
                                    ** while (true)
lbl57:
                                    // 1 sources

                                    while (true) {
                                        if (var4_4 == null) ** GOTO lbl50
                                        ** continue;
                                        break;
                                    }
                                }
                                if (!((Boolean)this.II.lIl()).booleanValue()) ** GOTO lbl20
                                break block27;
                            }
                            var6_6 = v0;
                            ** while (true)
                        }
                        ** while (!var2_2.isEmpty())
lbl68:
                        // 1 sources

                        ** while (true)
                    }
                    ** while (!var6_6.isBlank())
lbl71:
                    // 1 sources

                    ** GOTO lbl50
                }
                if (!var4_4.IIIlIIl()) ** break;
                ** while (true)
                ** GOTO lbl50
            }
            var4_4 = var3_3.next();
            ** while (true)
        }
        var1_1.add(new IlIIllIlI(var6_6, var7_7, var4_4.IIIlIIl()));
        ** while (true)
    }

    @Override
    public double IlIl() {
        return (Double)this.I.lIl();
    }

    /*
     * Unable to fully structure code
     */
    private void lII(DrawContext var1_1, boolean var2_2) {
        block35: {
            block25: {
                block36: {
                    block31: {
                        block26: {
                            block23: {
                                block24: {
                                    block33: {
                                        block28: {
                                            block34: {
                                                block22: {
                                                    block32: {
                                                        block30: {
                                                            block29: {
                                                                block27: {
                                                                    break block27;
lbl1:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        IIIlI.IlIIll(var1_1, var3_3.textRenderer, var21_4, var24_6, var26_7, IlIIIIll.IIII(IlIIIIll.lIl(), 220));
                                                                        break block22;
                                                                        break;
                                                                    }
lbl4:
                                                                    // 1 sources

                                                                    while (var22_19.II) {
                                                                        break block23;
                                                                    }
                                                                    break block28;
lbl7:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl9:
                                                                    // 1 sources

                                                                    return;
lbl11:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var12_14 = IlIIIIll.III();
                                                                        ** continue;
                                                                        break;
                                                                    }
lbl14:
                                                                    // 1 sources

                                                                    while (var22_19.II) {
                                                                        break block24;
                                                                    }
                                                                    break block29;
lbl17:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        IIIlI.IIlll(var1_1, var10_13, var10_13);
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                    v0 = var5_10.l;
                                                                    v1 = var5_10.I;
                                                                    if (!var2_2) break block30;
                                                                    break block31;
lbl24:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        if (!var21_5.hasNext()) break block22;
                                                                        break block25;
                                                                        break;
                                                                    }
lbl27:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl29:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl31:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var3_3 = MinecraftClient.getInstance();
                                                                if (var3_3.textRenderer != null) break block32;
                                                                ** while (true)
lbl37:
                                                                // 1 sources

                                                                while (true) {
                                                                    var19_18 += var15_16;
                                                                    ** GOTO lbl24
                                                                    break;
                                                                }
lbl40:
                                                                // 1 sources

                                                                while (true) {
                                                                    IIIlI.Ill(var1_1, var6_11, var8_12);
                                                                    ** continue;
                                                                    break;
                                                                }
                                                                IIIlI.Illl(var1_1, 6.0, var19_18, var5_10.l - 12.0, var13_15, 4.0, IlIIIIll.Illl(176));
                                                                var23_21 = var19_18 + Math.max(0.0, (var13_15 - IIIlI.IllIII(var3_3.textRenderer)) * 0.5);
                                                                ** GOTO lbl14
                                                                var13_15 = 16.0;
                                                                break block33;
lbl48:
                                                                // 2 sources

                                                                while (true) {
                                                                    IIIlI.Illl(var1_1, 0.0, 0.0, v0, v1, 7.0, IlIIIIll.Illl(v2));
                                                                    ** continue;
                                                                    break;
                                                                }
lbl51:
                                                                // 1 sources

                                                                while (true) {
                                                                    var26_7 = (var5_10.I - IIIlI.IllIII(var3_3.textRenderer)) * 0.5;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl54:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            v3 = IlIIIIll.IIII(IlIIIIll.lIl(), 220);
                                                            break block34;
                                                        }
                                                        v2 = 176;
                                                        ** GOTO lbl48
lbl62:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    var4_9 = this.IlI();
                                                    var5_10 = this.lI(var3_3, var4_9);
                                                    ** while (true)
lbl68:
                                                    // 1 sources

                                                    while (true) {
                                                        var24_6 = Math.max(8.0, (var5_10.l - var22_20) * 0.5);
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                IIIlI.IlIllI(var1_1);
                                                return;
lbl74:
                                                // 1 sources

                                                while (var4_9.isEmpty()) {
                                                    break block26;
                                                }
                                                break block35;
                                            }
lbl78:
                                            // 2 sources

                                            while (true) {
                                                var25_22 = v3;
                                                ** GOTO lbl4
                                                break;
                                            }
lbl81:
                                            // 1 sources

                                            while (true) {
                                                var22_20 = IIIlI.IIIlll(var3_3.textRenderer, var21_4);
                                                ** continue;
                                                break;
                                            }
lbl84:
                                            // 1 sources

                                            while (true) {
                                                var19_18 = var17_17;
                                                ** GOTO lbl74
                                                break;
                                            }
                                            var10_13 = this.I();
                                            IIIlI.lIlIIl(var1_1);
                                            ** while (true)
                                        }
                                        v4 = IlIIIIll.IIII(IlIIIIll.lIl(), 220);
                                        ** GOTO lbl31
                                        var6_11 = this.IlII();
                                        var8_12 = this.IlIl();
                                        ** while (true)
                                    }
                                    var15_16 = 18.0;
                                    var17_17 = 7.0;
                                    ** while (true)
                                }
                                v3 = IlIIIIll.IIII(IlIIIIll.Ill(), 255);
                                ** while (true)
                            }
                            v4 = IlIIIIll.IIII(var12_14, 255);
                            ** while (true)
                        }
                        var21_4 = "No bound modules";
                        ** while (true)
                        var26_8 = v4;
                        break block36;
                    }
                    v2 = 188;
                    ** while (true)
                }
                IIIlI.IlIIll(var1_1, var3_3.textRenderer, var22_19.I, 12.0, var23_21, var25_22);
                IIIlI.IlIIIl(var1_1, var3_3.textRenderer, var22_19.l, var5_10.l - 12.0, var23_21, var26_8);
                ** while (true)
            }
            var22_19 = var21_5.next();
            ** while (true)
        }
        var21_5 = var4_9.iterator();
        ** while (true)
    }

    @Override
    public double IlII() {
        return (Double)this.Il.lIl();
    }

    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        if (!this.IIIlIIl()) {
            return;
        }
        this.lII(drawContext, false);
    }

    @Override
    public double III() {
        return this.lI((MinecraftClient)MinecraftClient.getInstance(), this.IlI()).l * this.I();
    }

    private static int lIl(int n, int n2) {
        return III[n ^ 0xB37FEF7F] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block18: {
            block19: {
                block14: {
                    block12: {
                        block17: {
                            block16: {
                                block13: {
                                    block15: {
                                        break block15;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            break block12;
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
                                            var3_11 += 4;
                                            if (++var4_12 < var1_9) ** GOTO lbl3
                                            break block13;
                                            break;
                                        }
lbl9:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl11:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                                        var11_5 += var12_6;
                                        ** while (true)
                                    }
                                    var6 = 15525;
                                    break block16;
lbl19:
                                    // 2 sources

                                    while (true) {
                                        var12_6 = var8_2[var10_4] ^ var6;
                                        ** continue;
                                        break;
                                    }
lbl22:
                                    // 1 sources

                                    while (true) {
                                        continue;
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
                                        var13_7 = -1;
                                        break block14;
lbl29:
                                        // 1 sources

                                        while (true) {
                                            KeybindsHUD.IIl = var9_3;
                                            ** continue;
                                            break;
                                        }
                                        break;
                                    }
                                    var3_11 = 0;
                                    var4_12 = 0;
                                    ** while (true)
lbl35:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl37:
                                    // 1 sources

                                    while (true) {
                                        var13_7 = 0;
                                        break block14;
                                        break;
                                    }
                                    var11_5 = 0;
                                    break block17;
                                }
                                return;
                            }
                            var7_1 = "\u0260\u02ba\u022d\u0225\u0205\u0207\u0211\u0219\u021d\u022e\u0248\u0244\u021f\u0271\u0260\u02b2\u2a97\u2ad3\u2a9e\u2aa8\u2aaf\u2a95\u2aad\u2afe\u2af3\u2af8\u2a89\u2aa8\u2af9\u2af0\u2ad7\u2af5\u2a85\u2a92\u2ad9\u2aa7\u2ad9\u2a96\u2af5\u2aa8\u2af3\u2a8f\u2a91\u2af4\u2af3\u2a91\u2a8c\u2aa9\u2aaa\u2aa5\u2aa7\u2aa8\u2a85\u2af8\u2a94\u2aa8\u2ad8\u2ad3\u2aa3\u2af1\u2ad7\u2a84\u2af5\u2af6\u2a89\u2aaa\u2ad3\u2afe\u2a83\u2a96\u2a8f\u2a8b\u2ad9\u2ad7\u2a8f\u2af1\u2a9f\u2a99\u2ad9\u2af7\u2e2e\u2e02\u2e2c\u2e0e\u2e16\u2e14\u2e0e\u2e0b\u2e0e\u2e7e\u2e25\u2e50\u2e7a\u2e2c\u2e76\u2e7d\u6544\u656e\u6572\u6572\u1f4c\u1f6c\u1fb6\u1f60\ua35c\ua346\ua32a\ua32a\ub43d\ub5dd\ub5c7\ub5f1\u182a\u186e\u181f\u1871\u1814\u187d\u1810\u1866\u99f6\u99d8\u99fc\u99fc\uc35c\uc340\uc35f\uc3bd\uc362\uc368\uc3b6\uc34f\uc3b8\uc368\uc366\uc3b8\uc34e\uc3b6\uc34e\uc36c\uc34b\uc35c\uc323\uc36e\uc366\uc3a1\uc315\uc315";
                            break block18;
                        }
                        var12_6 = 0;
                        if (var13_7 != 0) ** GOTO lbl19
                        ** while (true)
                    }
                    if (++var10_4 >= var8_2.length) ** break;
                    ** while (true)
                    ** while (true)
                    var0_8 = "\u00ca\u000b\u00e0O[\u00ac\u00ec\u0089\u00ddr\u00a3\u00a6\u000bE\t\rvP\u00d5y\u00d8\u00e2\u00f1\u0099\u00c3\u00a3\u000f\u00f2\u00a6\u00d0\u000fA".getBytes("ISO-8859-1");
                    break block19;
                    KeybindsHUD.IlI = new Object[var9_3.length];
                    var2_10 = -1677395420;
                    ** while (true)
                }
                var10_4 = 0;
                ** while (true)
            }
            var1_9 = var0_8.length / 4;
            KeybindsHUD.III = new int[var1_9];
            ** while (true)
        }
        var8_2 = "\u3cb5\u3ce5\u3cb5\u3ca1\u3ca1\u3ca1\u3ca1\u3cad\u3ca1\u3cbd".toCharArray();
        var9_3 = new String[var8_2.length];
        ** while (true)
        var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
        KeybindsHUD.III[var4_12] = var5_13 ^= var2_10;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lll(int n, short s, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0xC67B;
        char[] cArray = IIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            KeybindsHUD.IlI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x26EC;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0x8ACE;
            n7 += 14131;
            n7 += 27679;
            cArray[n6] = (char)((n7 -= 21824) ^ n4 ^ s ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

