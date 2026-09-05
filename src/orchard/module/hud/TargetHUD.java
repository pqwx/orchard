/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIl
 * Module         : TargetHUD  [HUD]
 * Description    : Shows dynamic target info.   (client's own text)
 *
 * Recovered strings in this class:
 *   - ), 300.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII(
 *   - Decompilation failed
 *   - Tracking Mode
 *   - Track Target
 *   - Color Mode
 *   - .getBytes(
 *   - Color
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
 *  net.minecraft.client.gui.PlayerSkinDrawer
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.SkinTextures
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.hud;

import java.awt.Color;
import java.util.ArrayList;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.PlayerSkinDrawer;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.SkinTextures;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlI;
import orchard.internal.IIIllIII;
import orchard.internal.IIlIlIlI;
import orchard.internal.IIlIlllII;
import orchard.internal.IlIIIIll;
import orchard.internal.IlIlIlIII;
import orchard.internal.IllIl;
import orchard.internal.IllIlI;
import orchard.internal.lIIIlIII;
import orchard.internal.lIIllIl;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlIlIll;
import orchard.internal.llIlIlII;
import orchard.internal.llIll;
import orchard.internal.llIlllIl;
import orchard.internal.lllIIIll;
import orchard.internal.lllIlIII;
import orchard.internal.lllllIII;
import orchard.module.iface.Interface;

@Environment(value=EnvType.CLIENT)
public final class TargetHUD
extends ModuleBase
implements lllIlIII {
    private int I;
    private static final double l = 10.0;
    private IllIl II;
    private static final IIIllIII Il;
    private long lI;
    private final lIlIIlI ll;
    private double III;
    private static final float IIl = 10.0f;
    private final Interface IlI;
    private double Ill;
    private final IIIIIIIIl<lllIIIll> lII;
    private final llIlIlII lIl;
    private int llI;
    private static final double lll = 12.0;
    private final lllllIII<Integer> IIII;
    private final IIIIIIIIl<IIlIlllII> IIIl = this.IIlllIl(new IIIIIIIIl<IIlIlllII>(StringFactory.IIII("Mode"), IIlIlllII.class, IIlIlllII.Il));
    private final llIll IIlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Track Target"), false));
    private long IIll;
    private static final long IlII = 250L;
    private final IlIlIlIII IlIl;
    private final lIlIIlI IllI;
    private static final double Illl = 0.05;
    private final IIIIIIIIl<lIlIlIll> lIII;
    private final lIlIIlI lIIl;
    private static final int[] lIlI;
    private static final String[] lIll;
    private static final Object[] llII;

    /*
     * Enabled aggressive block sorting
     */
    private String I(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (!(livingEntity instanceof AbstractClientPlayerEntity)) return "0ms";
        AbstractClientPlayerEntity abstractClientPlayerEntity = (AbstractClientPlayerEntity)livingEntity;
        if (minecraftClient.getNetworkHandler() == null) {
            return "0ms";
        }
        PlayerListEntry playerListEntry = minecraftClient.getNetworkHandler().getPlayerListEntry(abstractClientPlayerEntity.getUuid());
        int n = playerListEntry == null ? 0 : playerListEntry.getLatency();
        String string = "ms";
        int n2 = n;
        return n2 + string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double l(double d, double d2) {
        if (!Double.isFinite(d)) return d;
        if (!Double.isFinite(d2)) return d;
        if (!(d2 <= 0.0)) return (double)Math.round(d * d2) / d2;
        return d;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block10: {
            var6 = 7867;
            var7_1 = "\u6383\u63e3\u646f\u63af\uf01c\uf08a\uf006\uf0d0\u8b48\u8be3\u8b95\u8c44\u286c\u2814\u2788\u27ac\u62b4\u6591\u65cf\u65d4\u62f5\u62a6\u62db\u65f5\u62f2\u65a7\u62b1\u62c1\u2b37\u2bf6\u2b5f\u2b19\u2b7b\u2b35\u2b40\u2c7f\u2c6d\u2c03\u2c55\u2c17\u2c5e\u2c51\u2c1e\u2c57\u2c21\u2c45\u2c53\u2c1d\u2b3e\u2bf1\u2b28\u2c57\u2c2f\u2c6f\u2b4d\u2c75\u2c5b\u2b70\u2b8c\u2b5a\u2b2c\u2c60\u2c2b\u2b83\u84f2\u8459\u84ed\u842e\u84bd\u8415\u85b4\u85d6\u1cc7\u1db7\u1da0\u1d80\u1ca7\u1cd9\u1db7\u1da6\u1d84\u1df3\u1c07\u1db6\u1daa\u1c3d\u1c85\u1cc3\u1bbd\u1a91\u1ada\u1ae2\u1bf5\u1bbb\u1aa8\u1bdf\u1ae0\u1b8f\u1bb9\u1aa6\u1aca\u1afe\u1aa9\u1bcf\u1a93\u1bd5\u1ac3\u1abc\uaca9\uad14\uacb5\uad4e\uacdf\uacaf\uacde\uad69\uacab\uacc0\uad67\uacf7\uad65\uacb6\uad15\uad51\u3ba9\u3c14\u3bb5\u3c4e\u3bdf\u3baf\u3bde\u3c4e\ub0c4\ub0af\ub0e1\ub0c5\uda8c\udad1\udb65\uda03\uc969\uc846\uc880\uc8a4\u7562\u74ff\u749b\u740d\ud695\ud72c\ud69d\ud6b3\ud6d7\ud77c\ud6ea\ud776\u8574\u8523\u857d\u8559\u9dd9\u9acb\u9d35\u9d11\uecf4\uec50\uec11\ued8b\ua613\ua675\ua6fb\ua6df\ub124\uaeb3\ub10d\ub129\u16f6\u17da\u16f3\u16d6\u16b2\u16dc\u167d\u161f";
            var8_2 = "\u1ebf\u1ebf\u1ebf\u1ebf\u1eb7\u1e9f\u1eb3\u1eab\u1eaf\u1eab\u1eb3\u1ebf\u1ebf\u1ebf\u1ebf\u1eb3\u1ebf\u1ebf\u1ebf\u1ebf\u1ebf\u1eb3".toCharArray();
            var9_3 = new String[var8_2.length];
            var13_9 = -1;
            break block10;
lbl7:
            // 1 sources

            while (true) {
                var1_13 = var0_4.length / 4;
                TargetHUD.lIlI = new int[var1_13];
                var3_14 = 0;
                var4_15 = 0;
                do {
                    var5_16 = (var0_4[var3_14] & 255) << 24 | (var0_4[var3_14 + 1] & 255) << 16 | (var0_4[var3_14 + 2] & 255) << 8 | var0_4[var3_14 + 3] & 255;
                    TargetHUD.lIlI[var4_15] = var5_16 ^= var2_5;
                    var3_14 += 4;
                } while (++var4_15 < var1_13);
                TargetHUD.Il = IIIllIII.I;
                return;
            }
            var9_3[var10_6] = new String(var14_10).intern();
            var11_7 += var12_8;
            if (++var10_6 < var8_2.length) ** GOTO lbl-1000
            var13_9 = 0;
        }
        var10_6 = 0;
        var11_7 = 0;
        var12_8 = 0;
        if (var13_9 != 0) lbl-1000:
        // 2 sources

        {
            var12_8 = var8_2[var10_6] ^ var6;
            var14_10 = var7_1.substring(var11_7, var11_7 + var12_8).toCharArray();
            var15_11 = 0;
        } else {
            TargetHUD.lIll = var9_3;
            TargetHUD.llII = new Object[var9_3.length];
            var2_5 = -595241241;
            var0_4 = "\u00dd$b\u008f\u00d9\u00db\u00c8\u00bc;\u00d4\u0003\u0085\u0092'Mg\u00fe\u009c\u0007c>\u008e\u00afRY\u009ad\u00f8\u009e\u00d5\u0088\u00c0MKL]\u00e4\u00ce\u00bb\u00b1\u00b5JZ\u00d6\u00d9\u0004\u00f9w\u00d8&\u0085\u0091\u00b2'\u00ff\u008d\u0013\u0011S\u0017f\u00eb`\u00ed\u00bd\u0011b\u00e1\u0094k\u00d8?b\u0088\u00aa\u0092\u00fd\u00ab\u00b2\u00a7\u001a\u008b\u009c\u00c4\u00e4\u00a8L d\u00a4ml\u00d5\u00b0\u00b6G\u00cc\u0001\u00cb\u00ca\u00d3\u00a4om\u00cd1;\u00f8}\u00f7\u00b6\u00b2\u00a4\u00ba9:".getBytes("ISO-8859-1");
            ** continue;
        }
lbl37:
        // 2 sources

        switch (var15_11 % 5) {
            case 1: {
                v0 = 10;
                break;
            }
            default: {
                v0 = 119;
                break;
            }
            case 4: {
                v0 = 51;
                break;
            }
            case 2: {
                v0 = 104;
                break;
            }
            case 3: {
                v0 = 76;
            }
        }
        var16_12 = v0;
        v1 = var15_11++;
        var14_10[v1] = (char)(var14_10[v1] ^ var16_12);
        if (var15_11 < var14_10.length) ** GOTO lbl37
    }

    private Color II() {
        if (this.lIII.lIl() == lIlIlIll.II) {
            return lIIIlIII.ll((Color)this.lIl.lIl(), 0.22);
        }
        return IlIIIIll.I();
    }

    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        this.lIl(drawContext, false, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lI(double d) {
        if (this.II == null) {
            return this.IlIl();
        }
        switch (((lllIIIll)((Object)this.lII.lIl())).ordinal()) {
            case 0: 
            case 2: 
            case 3: {
                double d2 = this.II.I() + this.II.II() / 2.0 - d * this.IIIll() / 2.0;
                return d2;
            }
            case 1: {
                double d2 = this.II.I() - d * this.IIIll() * 0.75;
                return d2;
            }
        }
        throw new MatchException(null, null);
    }

    private LivingEntity ll(MinecraftClient minecraftClient) {
        LivingEntity livingEntity = this.IIIl(minecraftClient);
        if (livingEntity == null) {
            return minecraftClient.player;
        }
        return livingEntity;
    }

    @Override
    public double III() {
        return this.IllI(this.ll(MinecraftClient.getInstance())).I() * this.IIIll();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(DrawContext drawContext, MinecraftClient minecraftClient, LivingEntity livingEntity, IIlIlIlI iIlIlIlI, double d, boolean bl) {
        Color color = this.IIII();
        Color color2 = this.II();
        double d2 = iIlIlIlI.I();
        double d3 = iIlIlIlI.l();
        double d4 = 60.0;
        double d5 = d2 - d4 - 10.0;
        String string = " HP";
        double d6 = (double)Math.round(d * 10.0) / 10.0;
        String string2 = d6 + string;
        String string3 = this.lIlI(minecraftClient, livingEntity);
        IlIIIIll.l(drawContext, Il, 0.0, 0.0, d2, d3, bl);
        IlIIIIll.IlII(drawContext, 8.0, 8.0, 42.0, 42.0, 5.0);
        this.IlI(drawContext, livingEntity, 9, 9, 40);
        IIIlI.IlIIll(drawContext, minecraftClient.textRenderer, livingEntity.getName().getString(), d4, 7.0, IlIIIIll.II(255));
        IIIlI.Illl(drawContext, d4, 25.0, d5, 6.0, 3.0, 0x52000000);
        IIIlI.IIlIIl(drawContext, d4, 25.0, d5 * this.III, 6.0, 3.0, color.getRGB(), color2.getRGB());
        IIIlI.IlIIll(drawContext, minecraftClient.textRenderer, string2, d4, 39.0, IlIIIIll.IIll(220));
        IIIlI.IlIIIl(drawContext, minecraftClient.textRenderer, string3, d2 - 10.0, 39.0, IlIIIIll.IIll(220));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI(DrawContext drawContext, LivingEntity livingEntity, int n, int n2, int n3) {
        PlayerListEntry playerListEntry;
        block3: {
            block2: {
                if (!(livingEntity instanceof AbstractClientPlayerEntity)) break block2;
                AbstractClientPlayerEntity abstractClientPlayerEntity = (AbstractClientPlayerEntity)livingEntity;
                MinecraftClient minecraftClient = MinecraftClient.getInstance();
                PlayerListEntry playerListEntry2 = playerListEntry = minecraftClient.getNetworkHandler() == null ? null : minecraftClient.getNetworkHandler().getPlayerListEntry(abstractClientPlayerEntity.getUuid());
                if (playerListEntry != null) break block3;
            }
            IIIlI.Illl(drawContext, n, n2, n3, n3, 4.0, 0x12FFFFFF);
            IIIlI.llIlll(drawContext, MinecraftClient.getInstance().textRenderer, "?", n, n2, n3, n3, -1);
            return;
        }
        PlayerSkinDrawer.draw((DrawContext)drawContext, (SkinTextures)playerListEntry.getSkinTextures(), (int)n, (int)n2, (int)n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Ill(II iI) {
        long l2;
        block5: {
            block3: {
                block4: {
                    block1: {
                        LivingEntity livingEntity;
                        MinecraftClient minecraftClient;
                        block2: {
                            block0: {
                                this.II = null;
                                if (!this.IIIlIIl() || !((Boolean)this.IIlI.lIl()).booleanValue() || !IllIlI.lIIll(iI)) break block0;
                                minecraftClient = MinecraftClient.getInstance();
                                livingEntity = this.IIIl(minecraftClient);
                                if (minecraftClient.player == null) break block1;
                                break block2;
                            }
                            this.IIII.IIl();
                            return;
                        }
                        if (livingEntity == null) break block1;
                        float f = lIIllllI.IlIIII(minecraftClient);
                        IllIl illIl = this.lII(iI, minecraftClient, livingEntity, f);
                        this.II = illIl;
                        if (illIl == null) break block3;
                        break block4;
                    }
                    this.II = null;
                    this.I = Integer.MIN_VALUE;
                    this.IIll = 0L;
                    this.IIII.IIl();
                    return;
                }
                l2 = System.currentTimeMillis();
                break block5;
            }
            l2 = 0L;
        }
        this.IIll = l2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private IllIl lII(II var1_1, MinecraftClient var2_2, LivingEntity var3_3, float var4_4) {
        block21: {
            block20: {
                block18: {
                    block16: {
                        block22: {
                            block17: {
                                block15: {
                                    block19: {
                                        break block22;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl3:
                                        // 1 sources

                                        while (true) {
                                            var18_17 = new double[]{var6_9.minZ, var6_9.maxZ};
                                            var19_18 = var18_17.length;
                                            var20_19 = 0;
                                            break block15;
                                            break;
                                        }
lbl8:
                                        // 1 sources

                                        while (true) {
                                            var21_20 = var18_17[var20_19];
                                            ** continue;
                                            break;
                                        }
lbl11:
                                        // 1 sources

                                        while (true) {
                                            v0(var9_8.I(), var9_8.l(), Math.max(1.0, var9_8.ll()), Math.max(1.0, var9_8.lI()));
                                            break block16;
                                            break;
                                        }
lbl14:
                                        // 1 sources

                                        while (true) {
                                            ++var15_15;
                                            break block17;
                                            break;
                                        }
lbl17:
                                        // 1 sources

                                        while (true) {
                                            var7_10.add(new Vec3d((var6_9.minX + var6_9.maxX) * 0.5, var6_9.minY, (var6_9.minZ + var6_9.maxZ) * 0.5));
                                            break block18;
                                            break;
                                        }
lbl21:
                                        // 2 sources

                                        while (true) {
                                            if (var10_11 >= var9_7) break block19;
                                            break block20;
                                            break;
                                        }
lbl24:
                                        // 1 sources

                                        while (true) {
                                            var13_13 = new double[]{var6_9.minY, var6_9.maxY};
                                            var14_14 = var13_13.length;
                                            var15_15 = 0;
                                            break block17;
                                            break;
                                        }
                                    }
                                    var7_10.add(new Vec3d((var6_9.minX + var6_9.maxX) * 0.5, var6_9.maxY, (var6_9.minZ + var6_9.maxZ) * 0.5));
                                    ** while (true)
lbl33:
                                    // 1 sources

                                    while (true) {
                                        var16_16 = var13_13[var15_15];
                                        ** continue;
                                        break;
                                    }
lbl36:
                                    // 1 sources

                                    while (true) {
                                        ++var10_11;
                                        ** GOTO lbl21
                                        break;
                                    }
lbl39:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    var7_10.add(new Vec3d(var11_12, var16_16, var21_20));
                                    ++var20_19;
                                }
                                ** while (var20_19 >= var19_18)
lbl46:
                                // 1 sources

                                ** while (true)
lbl47:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl49:
                                // 1 sources

                                while (true) {
                                    break block21;
                                    break;
                                }
                            }
                            ** while (var15_15 >= var14_14)
lbl53:
                            // 1 sources

                            ** while (true)
                        }
                        var5_5 = IllIlI.IIlIlI((Entity)var3_3, var4_4);
                        var6_9 = var3_3.getDimensions(var3_3.getPose()).getBoxAt(var5_5);
                        ** while (true)
lbl58:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        var7_10 = new ArrayList<Vec3d>(14);
                        var8_6 /* !! */  = new double[]{var6_9.minX, var6_9.maxX};
                        var9_7 = var8_6 /* !! */ .length;
                        var10_11 = 0;
                        ** while (true)
lbl65:
                        // 1 sources

                        while (true) {
                            this.I = -2147483648;
                            ** continue;
                            break;
                        }
                    }
                    return v0;
                }
                var8_6 /* !! */  = (double[])IllIlI.IlllI(var1_1, var7_10);
                ** while (var8_6 /* !! */  != null)
lbl73:
                // 1 sources

                ** while (true)
            }
            var11_12 = var8_6 /* !! */ [var10_11];
            ** while (true)
            this.IIII.IIl();
            return null;
        }
        this.I = var3_3.getId();
        this.IIll = System.currentTimeMillis();
        ** while (true)
        var9_8 = this.IIII.I(var3_3.getId(), (lIIllIl)var8_6 /* !! */ , var2_2.player.squaredDistanceTo((Entity)var3_3));
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private void lIl(DrawContext drawContext, boolean bl, boolean bl2) {
        double d;
        double d2;
        double d3;
        IIlIlIlI iIlIlIlI;
        double d4;
        LivingEntity livingEntity;
        MinecraftClient minecraftClient;
        block9: {
            block10: {
                block8: {
                    minecraftClient = MinecraftClient.getInstance();
                    if (minecraftClient.textRenderer == null) break block8;
                    LivingEntity livingEntity2 = livingEntity = bl ? this.ll(minecraftClient) : this.IIIl(minecraftClient);
                    if (livingEntity == null) {
                        this.IIIII();
                        return;
                    }
                    long l2 = System.currentTimeMillis();
                    d4 = this.IIlI(l2);
                    iIlIlIlI = this.IllI(livingEntity);
                    d3 = this.IIIll();
                    double d5 = iIlIlIlI.I() * d3;
                    double d6 = iIlIlIlI.l() * d3;
                    d2 = this.IlII();
                    d = this.IlIl();
                    if (bl || !((Boolean)this.IIlI.lIl()).booleanValue() || minecraftClient.player == null) break block9;
                    break block10;
                }
                return;
            }
            if (livingEntity != minecraftClient.player) {
                if (!this.IIIlI(livingEntity)) {
                    return;
                }
                d2 = this.llI(iIlIlIlI.I());
                d = this.lI(iIlIlIlI.l());
            }
        }
        d2 = this.l(d2, d3);
        d = this.l(d, d3);
        double d7 = Math.max(0.0, Math.min(1.0, (double)((livingEntity.getHealth() + livingEntity.getAbsorptionAmount()) / Math.max(1.0f, livingEntity.getMaxHealth() + livingEntity.getAbsorptionAmount()))));
        double d8 = Math.max(0.0, (double)(livingEntity.getHealth() + livingEntity.getAbsorptionAmount()));
        this.IIIIl(livingEntity, d7, d8, d4);
        double d9 = this.III;
        double d10 = this.Ill;
        IIIlI.lIlIIl(drawContext);
        IIIlI.Ill(drawContext, d2, d);
        IIIlI.IIlll(drawContext, d3, d3);
        switch (((IIlIlllII)((Object)this.IIIl.lIl())).ordinal()) {
            case 0: {
                this.IIl(drawContext, minecraftClient, livingEntity, iIlIlIlI, d10, bl2);
                break;
            }
            case 2: {
                this.llIl(drawContext, minecraftClient, livingEntity, iIlIlIlI, d9, bl2);
                break;
            }
            case 1: {
                this.lIll(drawContext, minecraftClient, livingEntity, iIlIlIlI, d9, bl2);
                break;
            }
        }
        IIIlI.IlIllI(drawContext);
    }

    /*
     * Enabled aggressive block sorting
     */
    private double llI(double d) {
        if (this.II == null) {
            return this.IlII();
        }
        switch (((lllIIIll)((Object)this.lII.lIl())).ordinal()) {
            case 0: 
            case 1: {
                double d2 = this.II.Il() + this.II.l() / 2.0 - d * this.IIIll() / 2.0;
                return d2;
            }
            case 3: {
                double d2 = this.II.Il() + this.II.l() - d * this.IIIll() * 0.25;
                return d2;
            }
            case 2: {
                double d2 = this.II.Il() - d * this.IIIll() * 0.75;
                return d2;
            }
        }
        throw new MatchException(null, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lll(double d, double d2, double d3, double d4) {
        if (!Double.isFinite(d)) return d2;
        if (!Double.isFinite(d2)) {
            return d2;
        }
        if (!(Math.abs(d2 - d) < 0.001)) {
            if (!(d4 <= 0.0)) return llIlllIl.IIl(d, d2, d3, d4);
            return d;
        }
        return d2;
    }

    private Color IIII() {
        if (this.lIII.lIl() == lIlIlIll.II) {
            return (Color)this.lIl.lIl();
        }
        return IlIIIIll.III();
    }

    /*
     * Enabled aggressive block sorting
     */
    private LivingEntity IIIl(MinecraftClient minecraftClient) {
        LivingEntity livingEntity;
        LivingEntity livingEntity2 = livingEntity = this.IlIl == null ? null : this.IlIl.lIl();
        if ((livingEntity == null || !livingEntity.isAlive() || livingEntity.isRemoved()) && this.IlIl != null) {
            livingEntity = this.IlIl.lIll();
        }
        if (livingEntity == null) return null;
        if (!livingEntity.isAlive()) return null;
        if (livingEntity.isRemoved()) {
            return null;
        }
        if (minecraftClient.player == null) return livingEntity;
        if (!(minecraftClient.player.distanceTo((Entity)livingEntity) > 10.0f)) return livingEntity;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIlI(long l2) {
        if (this.lI <= 0L) {
            this.lI = l2;
            return 0.0;
        }
        long l3 = Math.max(0L, l2 - this.lI);
        this.lI = l2;
        return Math.min(0.05, (double)l3 / 1000.0);
    }

    @Override
    public double IIll() {
        return this.IllI(this.ll(MinecraftClient.getInstance())).l() * this.IIIll();
    }

    @Override
    public double IlII() {
        return (Double)this.ll.lIl();
    }

    @Override
    public double IlIl() {
        return (Double)this.lIIl.lIl();
    }

    /*
     * Exception decompiling
     */
    private IIlIlIlI IllI(LivingEntity var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
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
    public void lIII(DrawContext drawContext, int n, int n2, float f) {
        this.lIl(drawContext, false, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public TargetHUD(IlIlIlIII ilIlIlIII, Interface interface_) {
        super(StringFactory.IIII("rJVGmxxDeCmz"), Category.I, StringFactory.IIII("Shows dynamic target info."));
        this.lII = this.IIlllIl(new IIIIIIIIl<lllIIIll>(StringFactory.IIII("Tracking Mode"), lllIIIll.class, lllIIIll.II));
        this.lIII = this.IIlllIl(new IIIIIIIIl<lIlIlIll>(StringFactory.IIII("Color Mode"), lIlIlIll.class, lIlIlIll.I));
        this.lIl = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Color"), Color.WHITE));
        this.ll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("X"), 300.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII("px")));
        this.lIIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Y"), 300.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII("px")));
        this.IllI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Scale"), 100.0, 60.0, 200.0, 5.0).IIII(StringFactory.IIII("%")));
        this.IIII = new lllllIII();
        this.I = Integer.MIN_VALUE;
        this.llI = Integer.MIN_VALUE;
        this.IlIl = ilIlIlIII;
        this.IlI = interface_;
        this.lII.lIII(this.IIlI::lIl);
        this.lIl.lIII(() -> this.lIII.lIl() == lIlIlIll.II);
    }

    /*
     * Enabled aggressive block sorting
     */
    private String lIlI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (this.IlIl == null || this.IlIl.lIl() != livingEntity) {
            if (minecraftClient.player != null) {
                String string = "m";
                int n = Math.round(minecraftClient.player.distanceTo((Entity)livingEntity));
                return n + string;
            }
            return "0m";
        }
        String string = "m";
        long l2 = Math.round(this.IlIl.llI());
        return l2 + string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIll(DrawContext drawContext, MinecraftClient minecraftClient, LivingEntity livingEntity, IIlIlIlI iIlIlIlI, double d, boolean bl) {
        Color color = this.IIII();
        Color color2 = this.II();
        double d2 = iIlIlIlI.I();
        double d3 = iIlIlIlI.l();
        double d4 = 42.0;
        double d5 = d2 - d4 - 7.0;
        String string = "%";
        long l2 = Math.round(d * 100.0);
        String string2 = l2 + string;
        IlIIIIll.l(drawContext, Il, 0.0, 0.0, d2, d3, bl);
        IlIIIIll.IlII(drawContext, 4.0, 4.0, 32.0, 32.0, 4.0);
        this.IlI(drawContext, livingEntity, 5, 5, 30);
        IIIlI.IlIIll(drawContext, minecraftClient.textRenderer, livingEntity.getName().getString(), d4, 5.0, IlIIIIll.II(255));
        IIIlI.Illl(drawContext, d4, 20.0, d5, 5.0, 2.5, 0x58000000);
        IIIlI.IIlIIl(drawContext, d4, 20.0, d5 * this.III, 5.0, 2.5, color.getRGB(), color2.getRGB());
        IIIlI.IlIIll(drawContext, minecraftClient.textRenderer, string2, d4, 29.0, IlIIIIll.IIll(210));
        IIIlI.IlIIIl(drawContext, minecraftClient.textRenderer, this.lIlI(minecraftClient, livingEntity), d2 - 7.0, 29.0, IlIIIIll.IIll(190));
    }

    @Override
    public void llII(DrawContext drawContext, int n, int n2, float f, boolean bl) {
        this.lIl(drawContext, true, bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIl(DrawContext drawContext, MinecraftClient minecraftClient, LivingEntity livingEntity, IIlIlIlI iIlIlIlI, double d, boolean bl) {
        Color color = this.IIII();
        Color color2 = this.II();
        double d2 = iIlIlIlI.I();
        double d3 = iIlIlIlI.l();
        double d4 = 46.0;
        double d5 = d2 - d4 - 9.0;
        String string = this.lIlI(minecraftClient, livingEntity);
        String string2 = "% - ";
        long l2 = Math.round(d * 100.0);
        String string3 = l2 + string2 + string;
        IlIIIIll.l(drawContext, Il, 0.0, 0.0, d2, d3, bl);
        IlIIIIll.IlII(drawContext, 6.0, 6.0, 34.0, 34.0, 5.0);
        this.IlI(drawContext, livingEntity, 7, 7, 32);
        IIIlI.IlIIll(drawContext, minecraftClient.textRenderer, livingEntity.getName().getString(), d4, 6.0, IlIIIIll.II(255));
        IIIlI.IlIIll(drawContext, minecraftClient.textRenderer, string3, d4, 18.0, IlIIIIll.IIll(200));
        IIIlI.Illl(drawContext, d4, 34.0, d5, 5.0, 2.5, 0x58000000);
        IIIlI.IIlIIl(drawContext, d4, 34.0, d5 * this.III, 5.0, 2.5, color.getRGB(), color2.getRGB());
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
        this.ll.lI(Math.max(0.0, Math.min(d, d3)));
        this.lIIl.lI(Math.max(0.0, Math.min(d2, d4)));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        this.II = null;
        this.I = Integer.MIN_VALUE;
        this.IIll = 0L;
        this.IIII.IIl();
        this.llI = Integer.MIN_VALUE;
        this.III = 0.0;
        this.Ill = 0.0;
        this.lI = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIII() {
        this.llI = Integer.MIN_VALUE;
        this.III = 0.0;
        this.Ill = 0.0;
        this.lI = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIl(LivingEntity livingEntity, double d, double d2, double d3) {
        if (livingEntity == null) {
            this.llI = Integer.MIN_VALUE;
            this.III = 0.0;
            this.Ill = 0.0;
            return;
        }
        if (this.llI == livingEntity.getId()) {
            this.III = this.lll(this.III, d, 10.0, d3);
            this.Ill = this.lll(this.Ill, d2, 12.0, d3);
            return;
        }
        this.llI = livingEntity.getId();
        this.III = d;
        this.Ill = d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlI(LivingEntity livingEntity) {
        if (this.II == null) return false;
        if (livingEntity == null) return false;
        if (this.I != livingEntity.getId()) return false;
        if (System.currentTimeMillis() - this.IIll > 250L) return false;
        return true;
    }

    private double IIIll() {
        return (Double)this.IllI.lIl() / 100.0;
    }

    private static int IIlII(int n, int n2) {
        return lIlI[n ^ 0xF8403CE8] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlIl(int n, short s, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x46F7;
        char[] cArray = lIll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llII[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            TargetHUD.llII[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2A77;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 34249;
            n6 ^= 0x957C;
            n6 -= 40134;
            n6 += 6372;
            n6 ^= 0x37A2;
            cArray[n5] = (char)((n6 ^= 0xF91F) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

