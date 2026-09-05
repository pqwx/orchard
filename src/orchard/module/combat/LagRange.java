/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIIlIl
 * Module         : LagRange  [COMBAT]
 * Description    : Briefly chokes outbound packets while closing into opponent range.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Indicator Opacity
 *   - Last Target Only
 *   - Stop On Damage
 *   - Indicator Size
 *   - Start Range
 *   - Max Delay
 *   - blinking 
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
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.util.math.MathHelper
 */
package orchard.module.combat;

import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.util.math.MathHelper;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlI;
import orchard.internal.IIllllllI;
import orchard.internal.IlIIIIll;
import orchard.internal.IlIlIlIII;
import orchard.internal.lIIIlIII;
import orchard.internal.lIIIlIl;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIllIlIl;
import orchard.internal.llIlIIIl;
import orchard.internal.llIll;
import orchard.internal.lllIll;

@Environment(value=EnvType.CLIENT)
public final class LagRange
extends ModuleBase {
    private static final double I = 8.0;
    private static final int l = 26;
    private final llIll II;
    private boolean Il;
    private static final double lI = Math.PI * 2;
    private int ll;
    private final lIlIIlI III = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Start Range"), 4.5, 4.0, 6.0, 0.05).IIIl("b"));
    private int IIl;
    private final lIlIIlI IlI;
    private final lIlIIlI Ill = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Ticks"), 15.0, 5.0, 20.0, 1.0).IIIl("t"));
    private final llIll lII;
    private final lIlIIlI lIl;
    private static String[] llI;
    private static final int lll = 5;
    private final lIlIIlI IIII;
    private final llIll IIIl;
    private int IIlI;
    private static final int IIll = 5;
    private static final int IlII = 20;
    private boolean IlIl;
    private final IlIlIlIII IllI;
    private static final int[] Illl;
    private static final String[] lIII;
    private static final Object[] lIIl;

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient) {
        if (lIIllllI.IIIIlIl(minecraftClient)) {
            return true;
        }
        if (minecraftClient == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.forwardKey.isPressed()) return true;
        if (minecraftClient.options.backKey.isPressed()) return true;
        if (minecraftClient.options.leftKey.isPressed()) return true;
        if (minecraftClient.options.rightKey.isPressed()) return true;
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private LivingEntity IIl(MinecraftClient var1_1) {
        block5: {
            block7: {
                block8: {
                    block6: {
                        v0 = var2_2 = this.IllI == null ? null : this.IllI.lIll();
                        if (!((Boolean)this.II.lIl()).booleanValue()) break block6;
                        if (!this.lllI(var1_1, var2_2)) break block7;
                        break block8;
                    }
                    ** if (this.lllI((MinecraftClient)var1_1, (LivingEntity)var2_2) && var1_1.player.squaredDistanceTo((Entity)var2_2) <= 64.0) goto lbl19
                }
                if (var1_1.player.squaredDistanceTo((Entity)var2_2) <= 64.0) {
                    return var2_2;
                }
            }
            var3_3 = this.IllI == null ? null : this.IllI.lIl();
            if (this.lllI(var1_1, var3_3) == false) return null;
            if (!(var1_1.player.squaredDistanceTo((Entity)var3_3) <= 64.0)) return null;
            return var3_3;
lbl-1000:
            // 1 sources

            {
                var3_4 = this.IllI == null ? null : this.IllI.lIl();
                if (this.lllI(var1_1, var3_4) && var1_1.player.squaredDistanceTo((Entity)var3_4) <= 64.0) {
                    return var3_4;
                }
                ** GOTO lbl20
            }
lbl19:
            // 1 sources

            return var2_2;
lbl20:
            // 1 sources

            var4_5 = null;
            var5_6 = Infinity;
            var7_7 = 64.0;
            var9_8 = var1_1.world.getPlayers().iterator();
            break block5;
lbl25:
            // 1 sources

            while (true) {
                var4_5 = var10_9;
                var5_6 = var11_10;
                break block5;
                break;
            }
lbl29:
            // 1 sources

            ** while ((var11_10 = var1_1.player.squaredDistanceTo((Entity)var10_9)) <= var7_7 && var11_10 < var5_6)
        }
        if (var9_8.hasNext() == false) return var4_5;
        var10_9 = (PlayerEntity)var9_8.next();
        if (this.lllI(var1_1, (LivingEntity)var10_9)) ** GOTO lbl29
    }

    private int IlI() {
        return Math.max(5, Math.min(20, (int)Math.round((Double)this.Ill.lIl())));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        if (!((Boolean)this.IIIl.lIl()).booleanValue() || !this.llIl()) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null && minecraftClient.getWindow() != null && minecraftClient.player != null && !minecraftClient.options.hudHidden) {
            double d = (double)minecraftClient.getWindow().getScaledWidth() * 0.5;
            double d2 = (double)minecraftClient.getWindow().getScaledHeight() * 0.5;
            this.IIlI(drawContext, d, d2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lII(Entity entity) {
        if (!this.Il) {
            return false;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IllII(minecraftClient, entity)) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        this.lIl(true);
        this.IIII(minecraftClient);
        return true;
    }

    private void lIl(boolean bl) {
        if (this.Il) {
            lIIIlIl.lIll(llIlIIIl.awo, bl);
        }
        this.Il = false;
        this.IlIl = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll(MinecraftClient minecraftClient, boolean bl) {
        if ((Boolean)this.lII.lIl() == false) return false;
        if (!this.Il) {
            return false;
        }
        this.lIl(true);
        if (!bl) return true;
        this.IIII(minecraftClient);
        return true;
    }

    @Override
    public void III() {
        this.IlllI(MinecraftClient.getInstance());
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIII(MinecraftClient minecraftClient) {
        this.ll = minecraftClient == null || minecraftClient.player == null ? Integer.MIN_VALUE : minecraftClient.player.age;
        this.IIl = minecraftClient == null || minecraftClient.player == null ? 0 : minecraftClient.player.age + 5;
    }

    /*
     * Unable to fully structure code
     */
    private void IIlI(DrawContext var1_1, double var2_2, double var4_3) {
        var6_4 = (Double)this.lIl.lIl();
        var8_5 = Math.max(1.6, var6_4 * 0.22);
        var10_6 = (double)System.nanoTime() / 1.0E9 * 6.283185307179586 * 1.35;
        var12_7 = Math.max(0, Math.min(255, (int)Math.round((Double)this.IIII.lIl())));
        var13_8 = IlIIIIll.III().getRGB();
        var14_9 = 0;
        if (true) ** GOTO lbl12
        block0: while (true) {
            block9: {
                block7: {
                    block6: {
                        block8: {
                            IIIlI.IIIIIl(var1_1, v0, v1, var8_5 * 0.5, var26_17);
                            while (true) {
                                ++var14_9;
lbl12:
                                // 2 sources

                                if (var14_9 >= 26) break block6;
                                break block7;
                                break;
                            }
                            while (true) {
                                v1 = var33_10;
                                continue block0;
                                break;
                            }
lbl17:
                            // 2 sources

                            while (true) {
                                if (var14_9 == 0) break block8;
                                v0 = var31_20;
lbl20:
                                // 2 sources

                                while (true) {
                                    if (var14_9 != 0) ** continue;
                                    break block9;
                                    break;
                                }
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                if (var14_9 != 25) ** continue;
                                ** GOTO lbl17
                                break;
                            }
                        }
                        v0 = var27_18;
                        ** continue;
                    }
                    return;
                }
                var15_11 = (double)var14_9 / 26.0;
                var17_12 = (double)(var14_9 + 1) / 26.0;
                var19_13 = var10_6 + var15_11 * 3.141592653589793;
                var21_14 = var10_6 + var17_12 * 3.141592653589793;
                var23_15 = 0.35 + 0.65 * var17_12;
                var25_16 = Math.max(20, Math.min(255, (int)Math.round((double)var12_7 * var23_15)));
                var26_17 = lIIIlIII.II(var13_8, var25_16);
                var27_18 = var2_2 + Math.cos(var19_13) * var6_4;
                var29_19 = var4_3 + Math.sin(var19_13) * var6_4;
                var31_20 = var2_2 + Math.cos(var21_14) * var6_4;
                var33_10 = var4_3 + Math.sin(var21_14) * var6_4;
                IIIlI.Illlll(var1_1, var27_18, var29_19, var31_20, var33_10, var8_5, var26_17);
                if (var14_9 != 0) ** break;
                ** continue;
                ** continue;
            }
            v1 = var29_19;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.player.hurtTime < 2) return false;
        if (this.lll(minecraftClient, true)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        if (minecraftClient.player.isGliding()) return false;
        if (minecraftClient.getNetworkHandler() != null) return true;
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private boolean Illl(MinecraftClient var1_1) {
        block8: {
            block12: {
                block9: {
                    block10: {
                        if (var1_1 == null) break block9;
                        break block10;
lbl3:
                        // 1 sources

                        while (true) {
                            block11: {
                                var2_2 = var1_1.world.getPlayers().iterator();
                                ** GOTO lbl29
lbl6:
                                // 1 sources

                                return true;
lbl8:
                                // 3 sources

                                while (lIllIlIl.lIlI(var1_1.player.distanceTo((Entity)var3_3), var4_4)) {
                                    ** continue;
lbl10:
                                    // 1 sources

                                    ** GOTO lbl6
                                }
                                break block11;
lbl12:
                                // 1 sources

                                while ((var20_12 = (var16_10 = var1_1.player.getVelocity().x - var3_3.getVelocity().x) * (var12_8 = var6_5 / var10_7) + (var18_11 = var1_1.player.getVelocity().z - var3_3.getVelocity().z) * (var14_9 = var8_6 / var10_7)) > 0.0) {
                                    var4_4 = var20_12;
                                    ** GOTO lbl8
                                }
                                ** GOTO lbl8
                                while (true) {
                                    var4_4 = var1_1.player.getVelocity().horizontalLength();
                                    var6_5 = var3_3.getX() - var1_1.player.getX();
                                    var10_7 = Math.sqrt(var6_5 * var6_5 + (var8_6 = var3_3.getZ() - var1_1.player.getZ()) * var8_6);
                                    if (!(var10_7 > 1.0E-4)) ** GOTO lbl8
                                    ** GOTO lbl12
                                    break;
                                }
                            }
                            if (true) ** GOTO lbl29
                            break;
                        }
                    }
                    if (var1_1.player == null) break block9;
                    break block12;
                    while (true) {
                        if (this.lllI(var1_1, (LivingEntity)(var3_3 = (PlayerEntity)var2_2.next()))) ** continue;
lbl29:
                        // 3 sources

                        if (var2_2.hasNext()) {
                            continue;
                        }
                        break block8;
                        break;
                    }
                }
lbl33:
                // 2 sources

                return false;
            }
            ** while (var1_1.world != null)
lbl37:
            // 1 sources

            ** while (true)
        }
        return false;
    }

    private double lIII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        double d;
        block2: {
            double d2;
            double d3;
            double d4;
            double d5;
            double d6;
            block3: {
                block1: {
                    if (minecraftClient == null || minecraftClient.player == null) break block1;
                    d = minecraftClient.player.getVelocity().horizontalLength();
                    if (livingEntity == null) break block2;
                    break block3;
                }
                return 3.0;
            }
            double d7 = livingEntity.getX() - minecraftClient.player.getX();
            double d8 = livingEntity.getZ() - minecraftClient.player.getZ();
            double d9 = Math.sqrt(d7 * d7 + d8 * d8);
            if (d9 > 1.0E-4 && (d6 = (d5 = minecraftClient.player.getVelocity().x - livingEntity.getVelocity().x) * (d4 = d7 / d9) + (d3 = minecraftClient.player.getVelocity().z - livingEntity.getVelocity().z) * (d2 = d8 / d9)) > 0.0) {
                d = d6;
            }
        }
        return lIllIlIl.lllI(d);
    }

    private int lIIl() {
        return this.IlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IIlIllI(Packet<?> packet) {
        if (!this.Il) return;
        if (!(packet instanceof PlayerInteractItemC2SPacket)) return;
        PlayerInteractItemC2SPacket playerInteractItemC2SPacket = (PlayerInteractItemC2SPacket)packet;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (!minecraftClient.player.isGliding()) {
            return;
        }
        ItemStack itemStack = minecraftClient.player.getStackInHand(playerInteractItemC2SPacket.getHand());
        if (!itemStack.isOf(Items.FIREWORK_ROCKET)) return;
        this.lIl(true);
        this.IIII(minecraftClient);
    }

    public void lIlI(MinecraftClient minecraftClient) {
        this.IlllI(minecraftClient);
        if (this.Il) {
            lIIIlIl.lIl(llIlIIIl.awo, lllIll.Il);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (!lIIIlIl.lIl(llIlIIIl.awo, lllIll.Il)) {
            return;
        }
        this.Il = true;
        this.ll = minecraftClient.player.age;
        this.IIlI = livingEntity == null ? Integer.MIN_VALUE : livingEntity.getId();
        lIIIlIl.clearLagRangePingDelay();
    }

    public LagRange(IlIlIlIII ilIlIlIII) {
        super(StringFactory.IIII("LagRange"), Category.II, StringFactory.IIII("Briefly chokes outbound packets while closing into opponent range."));
        this.IlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Max Delay"), 180.0, 50.0, 300.0, 5.0).IIIl("ms"));
        this.II = this.IIlllIl(new llIll((Object)StringFactory.IIII("Last Target Only"), false));
        this.lII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Stop On Damage"), true));
        this.IIIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Indicator"), true));
        this.lIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Indicator Size"), 9.0, 5.0, 16.0, 1.0).IIIl("px"));
        this.IIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Indicator Opacity"), 215.0, 80.0, 255.0, 5.0));
        this.ll = Integer.MIN_VALUE;
        this.IIlI = Integer.MIN_VALUE;
        this.IllI = ilIlIlIII;
        this.lIl.lIII(this.IIIl::lIl);
        this.IIII.lIII(this.IIIl::lIl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean llII(LivingEntity livingEntity) {
        if (livingEntity == null) return false;
        if (this.IIlI == Integer.MIN_VALUE) return false;
        if (livingEntity.getId() == this.IIlI) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean llIl() {
        if (!this.IIIlIIl()) return false;
        if (!this.Il) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity == null) return false;
        if (livingEntity == minecraftClient.player) return false;
        if (!livingEntity.isAlive()) return false;
        if (livingEntity.isRemoved()) return false;
        if (!IIllllllI.II(livingEntity)) return true;
        return false;
    }

    @Override
    public void llll() {
        this.lIl(true);
        this.IIIIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIII(MinecraftClient minecraftClient) {
        if (!this.Il) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (this.IIlI == Integer.MIN_VALUE) {
            return false;
        }
        Entity entity = minecraftClient.world.getEntityById(this.IIlI);
        if (!(entity instanceof LivingEntity)) return false;
        LivingEntity livingEntity = (LivingEntity)entity;
        if (IIllllllI.II(livingEntity)) return true;
        return false;
    }

    private void IIIIl() {
        this.Il = false;
        this.ll = Integer.MIN_VALUE;
        this.IlIl = false;
        this.IIlI = Integer.MIN_VALUE;
        this.IIl = 0;
        lIIIlIl.clearLagRangePingDelay();
    }

    @Override
    public String II() {
        if (this.Il) {
            int n = this.IIlll(MinecraftClient.getInstance());
            String string = "blinking ";
            return string + n;
        }
        String string = "b";
        String string2 = this.IIIlI(this.IlIlI());
        return string2 + string;
    }

    private String IIIlI(double d) {
        return String.format(Locale.ROOT, "%.2f", d);
    }

    private double IIIll(MinecraftClient minecraftClient) {
        return this.lIII(minecraftClient, null);
    }

    private int IIlII() {
        return 5;
    }

    private long IIlIl() {
        return Math.max(50L, Math.min(300L, Math.round((Double)this.IlI.lIl())));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIllI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (livingEntity == null) {
            return false;
        }
        double d = minecraftClient.player.distanceTo((Entity)livingEntity);
        if (!this.lI(minecraftClient)) return false;
        if (this.lIIIl(minecraftClient, livingEntity)) return false;
        if (!(d > this.lIII(minecraftClient, livingEntity))) return false;
        if (!(d <= this.IlIlI())) return false;
        return true;
    }

    private int IIlll(MinecraftClient minecraftClient) {
        if (minecraftClient != null && minecraftClient.player != null) {
            if (this.ll >= 0) {
                return Math.max(0, minecraftClient.player.age - this.ll);
            }
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        int n = this.IIlll(minecraftClient);
        if (n >= this.lIIl()) {
            return true;
        }
        if (this.Illl(minecraftClient)) {
            return true;
        }
        if (!this.lI(minecraftClient)) return true;
        if (livingEntity == null) {
            return true;
        }
        if (this.lIIIl(minecraftClient, livingEntity)) {
            return true;
        }
        double d = minecraftClient.player.distanceTo((Entity)livingEntity);
        if (d > 8.0) return true;
        if (d <= this.lIII(minecraftClient, livingEntity)) {
            return true;
        }
        if (n < this.IIlII()) {
            return false;
        }
        if (n < this.IlI()) return false;
        if (this.Illll(minecraftClient, livingEntity)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.player.age < this.IIl) return false;
        return true;
    }

    @Override
    public void ll() {
        this.IIIIl();
    }

    private double IlIlI() {
        return MathHelper.clamp((double)((Double)this.III.lIl()), (double)4.0, (double)6.0);
    }

    private static void IlIll() {
        LagRange.llI[0] = LagRange.lIIlI(LagRange.lIlII((short)20783, '\u6199', -947379654).toCharArray(), 70448L, -1793822343);
        LagRange.llI[1] = LagRange.lIIlI(LagRange.lIlII((short)18090, '\u6198', -1099481808).toCharArray(), 87931L, 156885464);
        LagRange.llI[2] = LagRange.lIIlI(LagRange.lIlII((short)529, '\u619b', -2139411805).toCharArray(), 76984L, 2114979097);
        LagRange.llI[3] = LagRange.lIIlI(LagRange.lIlII((short)11207, '\u619a', 1035818467).toCharArray(), 90203L, -536641898);
        LagRange.llI[4] = LagRange.lIIlI(LagRange.lIlII((short)42833, '\u619d', 229985392).toCharArray(), 22732L, 1136275375);
        LagRange.llI[5] = LagRange.lIIlI(LagRange.lIlII((short)6207, '\u619c', 1615739957).toCharArray(), 49531L, 1197158224);
        LagRange.llI[6] = LagRange.lIIlI(LagRange.lIlII((short)51576, '\u619f', -450597683).toCharArray(), 31798L, 1603108447);
        LagRange.llI[7] = LagRange.lIIlI(LagRange.lIlII((short)54250, '\u619e', 747846500).toCharArray(), 4418L, 1048146217);
        LagRange.llI[8] = LagRange.lIIlI(LagRange.lIlII((short)63696, '\u6191', -1526454026).toCharArray(), 86966L, -1804238573);
        LagRange.llI[9] = LagRange.lIIlI(LagRange.lIlII((short)6172, '\u6190', -247445600).toCharArray(), 1193L, 833662330);
        LagRange.llI[10] = LagRange.lIIlI(LagRange.lIlII((short)39071, '\u6193', 1821201342).toCharArray(), 91936L, 1681118126);
        LagRange.llI[11] = LagRange.lIIlI(LagRange.lIlII((short)6105, '\u6192', 497621835).toCharArray(), 40147L, 176430852);
        LagRange.llI[12] = LagRange.lIIlI(LagRange.lIlII((short)53884, '\u6195', -1317266943).toCharArray(), 84716L, 2038424742);
        LagRange.llI[13] = LagRange.lIIlI(LagRange.lIlII((short)47864, '\u6194', 1951407424).toCharArray(), 13671L, 433364488);
        LagRange.llI[14] = LagRange.lIIlI(LagRange.lIlII((short)48468, '\u6197', 812454449).toCharArray(), 87231L, -444966170);
        LagRange.llI[15] = LagRange.lIIlI(LagRange.lIlII((short)62194, '\u6196', 545684530).toCharArray(), 86870L, -266679596);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllII(MinecraftClient minecraftClient, Entity entity) {
        if (!(entity instanceof PlayerEntity)) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (entity == minecraftClient.player) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlllI(MinecraftClient minecraftClient) {
        if (!this.IllI(minecraftClient)) {
            this.lIl(false);
            this.IIIIl();
            return;
        }
        if (this.IlII(minecraftClient)) {
            return;
        }
        if (this.IIIII(minecraftClient)) {
            this.lIl(false);
            this.IIII(minecraftClient);
            return;
        }
        LivingEntity livingEntity = this.IIl(minecraftClient);
        if (this.Il) {
            lIIIlIl.IlllII(llIlIIIl.awo, this.IIlIl());
            if (!this.IlIII(minecraftClient, livingEntity)) return;
            this.lIl(false);
            this.IIII(minecraftClient);
            return;
        }
        if (lIIIlIl.IlIIIl()) {
            return;
        }
        boolean bl = this.IIllI(minecraftClient, livingEntity);
        if (!bl || this.llII(livingEntity)) {
            this.IlIl = false;
        }
        if (this.IlIl) return;
        if (!bl) return;
        if (!this.IlIIl(minecraftClient)) return;
        this.lIll(minecraftClient, livingEntity);
    }

    @Override
    public void I(Entity entity) {
        this.lII(entity);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean Illll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        double d = minecraftClient.player.getX() - livingEntity.getX();
        double d2 = minecraftClient.player.getZ() - livingEntity.getZ();
        double d3 = minecraftClient.player.getEyeY() - livingEntity.getEyeY();
        double d4 = Math.sqrt(d * d + d2 * d2);
        float f = (float)(Math.toDegrees(Math.atan2(d2, d)) - 90.0);
        float f2 = (float)(-Math.toDegrees(Math.atan2(d3, d4)));
        float f3 = Math.abs(MathHelper.wrapDegrees((float)(livingEntity.getYaw() - f)));
        float f4 = Math.abs(MathHelper.wrapDegrees((float)(livingEntity.getPitch() - f2)));
        if (!(f3 <= 12.0f)) return false;
        if (!(f4 <= 20.0f)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 26069;
        String string = "\u1c6b\u098d\u0129\u5ba6\u8288\uda48\uc193\ua180\u36a7\uabe3\ub8b6\ua0d5\ua507\u319d\u4afc\uf076\u568e\u41eb\u81df\ufb69\u3c96\ua477\u4958\u7deb\u7a76\u446a\u7c1c\u3a9b\u28c5\u2358\ubd48\u84d5\uce71\udc02\ue2ee\u3d52\ue730\u3aeb\u5c6b\u0a43\ua741\u959e\u1937\u27b3\ucbc4\u570f\u2e40\u1535\u8bfd\u3d35\u30a2\ue8da\u9dea\udc93\u00d9\u939c\u8df4\u6179\u22ac\uf847\ua99b\u2e2d\u6df8\u4fa3\uc24c\ud4b5\u195a\u78b5\ud81b\u9f1a\uccc2\ufd6a\ucf91\u5c86\ue54f\uec12\u6a3f\uce38\u0371\ue134\u99cf\uf23f\u9b4f\u9c5d\u3a00\uae05\ufc5c\u43e4\u0ea0\ue458\u5e34\u88df\u2304\u1771\uebce\ubd71\u8772\u75c4\u301b\ud68e\udd97\u6617\uf372\ud7a1\u085a\u957a\u3c63\u59e4\uddfd\u7d8b\u07b5\u3d32\u057a\udb4e\u41c3\u6764\u2b43\ua743\u59eb\u9359\u0611\u982c\u2f0d\uf514\u744e\u4bbe\u464b\ucc16\u9007\u5d52\udef6\ub8cf\u11fc\u2b5d\uc5f7\u07b6\u4792\uda30\ubf1e\udac8\u1e0a\u291e\u8442\u0b09\u4d98\u4976\u9ffb\u4deb\u59fe\u335f\ucf40\u21b9\u8c00\ub9ab\u49e8\u01a1\uddf7\u04f4\u4c01\udd2d\u032a\uc1d4\u596b\ubf9b\ue76b\u3905\uaede\uef9f\u34a4\uae4d\u9e9b\u008e\u0b0d\u61c4\u49db\u3b0a\ub58d\ud7ca\u65ab\u43f9\u8f39\udbfe\u305a\u228e\uc73a\u23be\udacf\u11c0\u2f83\ucf00\uadc7\ufc21\u7580\u08d1\u215a\uca49\u3729\u27b6\u519c\u4f81\u9210\u5b1f\ufd95\uf516\u3a3f\u592c\ud03c\ueeb7\u3599\u2b1d\u5fa8\u5690\u2aa3\u1086\u5005\u3095\ua502\u09ae\ue0eb\u2181\u1f0b\u0d0a\u80bf\u6f09\uc0c6\u0edc\u4f46\u0403\u5f73\u6b4e\u9387\u7383\u63bd\u240a\u45aa\u8792\uc505\u967d\ub0dc\ud9ed\ue88b\u735f\ufdf1\uf6e6\ue56a\uc96b\uf841\uc0bc\u1dcc\u33bf\u3514\ueb83\u8458\u35ac\ue49f\u6c1c\u1fed\u48d6\u4e21\ua6f6\u98a0\uaac2\u0bf6\ueefc\ud575\u781c\ubcff\uc6ad\u6dbe\u791a\ub9ae\u3635";
        char[] cArray = "\u65dd\u65d9\u65d1\u65c1\u65d1\u65cd\u65cd\u65d1\u65d1\u65c5\u65d9\u658d\u65d9\u65dd\u65d9\u65c1".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                lIII = stringArray;
                lIIl = new Object[stringArray.length];
                int n6 = 1363714731;
                byte[] byArray = "\u001d\u008d\u009e\u00ed|\u00b1\u00c0l\u0012\u0096\u00ee\u00d2\u0006\u0089\u00aa\u00f3\u0091{-\u00b3\u00cb\u0007\u00d8E\u0087\u007f\u00fe\u0083N\u00c5\u00e1\u000f\u00c8\u00f4#$\u00fd\u00ac\u00f8\u0082\u00c5zJS\u00c8[9\u0018\u00f1&vHh^\u00f0\u0092`\u009e&\u00ea\u00f6\u0013\u00af\u00a9\u0091\u00bc\u008b\u0000\u00c2\u008djL\u00f5u\u00d1\u001d\u0090\u001c~Zi\u00abS\u00f0\u00a3\u00bck\u00f0\u00f1\u00b9>\u00c8%\u00f4\u00ea\u00ee\u00e1\u0099\u0099D\u00c3n\u00e1|\u00b1\u00c3\u00df\u00b9@2@\u0080!\r\n\"F-y\u00a6n\u00ab]\u0091\u00df\u00d2\u00bd\u0017&\u0000\u00c7\u00f3\u00b4\u00d7c\u00c3\u000f^\u00a6G\u00f4\u00e8V\u00b3\u00e2\u008c\u00b5\u00c0\u00d7\u00b1\b\u00cd:\u0083\u00bai\u00d7B\u009c\u00a4\u0085P\u0014\u00d3\u0004\u001ai\u0005=\u0091\u00ae\u0097Ho\u00e6\u008e\u009b\u00ca\u0087$\u0091\u00f7\u00a1\u0016\u00c7\u00c5Y\u00ff\u0085\u00b4\"\u0087\u00f4\u0017\u009a\u0091\u0080\u00edFA\u00dc\u00e7:g\u0081\u00c8\u0001\u00b7\u00e3\"\u00e5\u00e6".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                Illl = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    LagRange.Illl[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                llI = new String[16];
                LagRange.IlIll();
                return;
            }
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        double d;
        double d2;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.options == null) return false;
        if (livingEntity == null) return false;
        double d3 = 0.0;
        double d4 = 0.0;
        if (minecraftClient.options.forwardKey.isPressed()) {
            d3 += -Math.sin(Math.toRadians(minecraftClient.player.getYaw()));
            d4 += Math.cos(Math.toRadians(minecraftClient.player.getYaw()));
        }
        if (minecraftClient.options.backKey.isPressed()) {
            d3 -= -Math.sin(Math.toRadians(minecraftClient.player.getYaw()));
            d4 -= Math.cos(Math.toRadians(minecraftClient.player.getYaw()));
        }
        if (minecraftClient.options.leftKey.isPressed()) {
            d3 += -Math.cos(Math.toRadians(minecraftClient.player.getYaw()));
            d4 += -Math.sin(Math.toRadians(minecraftClient.player.getYaw()));
        }
        if (minecraftClient.options.rightKey.isPressed()) {
            d3 -= -Math.cos(Math.toRadians(minecraftClient.player.getYaw()));
            d4 -= -Math.sin(Math.toRadians(minecraftClient.player.getYaw()));
        }
        if ((d2 = Math.sqrt(d3 * d3 + d4 * d4)) < 1.0E-4) {
            return false;
        }
        double d5 = livingEntity.getX() - minecraftClient.player.getX();
        double d6 = Math.sqrt(d5 * d5 + (d = livingEntity.getZ() - minecraftClient.player.getZ()) * d);
        if (d6 < 1.0E-4) {
            return false;
        }
        double d7 = d3 / d2 * (d5 / d6) + d4 / d2 * (d / d6);
        if (!(d7 < -0.15)) return false;
        return true;
    }

    private static String lIIlI(char[] cArray, long l2, int n) {
        int n2 = 0xF757E357 ^ n;
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

    private static int lIIll(int n, int n2) {
        return Illl[n ^ 0x66D47189] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIlII(short s, char c, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x6199;
        char[] cArray = lIII[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIIl[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            LagRange.lIIl[n2] = stackTraceElementArray = new Throwable().getStackTrace();
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x441C;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x1699;
            n6 ^= 0x4FAC;
            n6 += 18896;
            cArray[n5] = (char)((n6 -= 59723) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

