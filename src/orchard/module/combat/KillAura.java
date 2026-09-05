/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllIlII
 * Module         : KillAura  [COMBAT]
 * Description    : aim +phit   (client's own text)
 *
 * Recovered strings in this class:
 *   - Incompatable modules
 *   - Range Variability
 *   - Horizontal Speed
 *   - Track invisibles
 *   - Vertical Speed
 *   - Reaction Time
 *   - Aim Priority
 *   - Range Window
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.MaceItem
 *  net.minecraft.registry.Registries
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.combat;

import com.google.gson.JsonObject;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.Camera;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MaceItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIIIIlI;
import orchard.internal.IIIIllII;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIIlIllII;
import orchard.internal.IIIllIIl;
import orchard.internal.IIlI;
import orchard.internal.IIlIIllII;
import orchard.internal.IIlllIIIl;
import orchard.internal.IIlllllIl;
import orchard.internal.IIllllllI;
import orchard.internal.IlIIllI;
import orchard.internal.IlIIlllll;
import orchard.internal.IlIlIIIlI;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlIlIl;
import orchard.internal.IlIlIlIll;
import orchard.internal.IlIlllI;
import orchard.internal.IlllIl;
import orchard.internal.IlllIll;
import orchard.internal.lIIllII;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIlIlI;
import orchard.internal.llIll;
import orchard.internal.lllIIIII;
import orchard.internal.lllIIlI;
import orchard.internal.lllllI;
import orchard.internal.lllllII;
import orchard.mixin.ClientPlayerEntityMixin2;
import orchard.module.combat.AutoMace;
import orchard.module.combat.BreachSwap;
import orchard.module.combat.MaceSwap;
import orchard.module.combat.ShieldBreaker;
import orchard.module.movement.AutoPlay;
import orchard.module.player.ElytraSwap;

@Environment(value=EnvType.CLIENT)
public final class KillAura
extends ModuleBase {
    private final llIll l;
    private final IIIlIlIIl II;
    private final llIll Il;
    private final IlIlIlI lI;
    private static final float ll = 200.0f;
    private final llIlIlI III;
    private final lllllII IIl;
    private static final double IlI = 8.0;
    private double Ill;
    private static final float lII = 2.0f;
    private final llIll lIl;
    private final lIlIIlI llI;
    private static final float lll = 1.35f;
    private final llIll IIII;
    private final lIlIIlI IIIl;
    private static final float IIlI = 490.0f;
    private double IIll;
    private final IIIlIlIIl IlII;
    private int IlIl;
    private final lIlIIlI IllI;
    private final lIlIIlI Illl;
    private final lIlIIlI lIII;
    private final llIll lIIl;
    private static final double lIlI = 1.0;
    private final lIlIIlI lIll;
    private final IIIIIIIIl<IIIllIIl> llII;
    private static final List<IlllIll> llIl;
    private static final int lllI = 1;
    private final IIIIIIIIl<IIIIIIIlI> llll = this.IIlllIl(new IIIIIIIIl<IIIIIIIlI>(StringFactory.IIII("Mode"), IIIIIIIlI.class, IIIIIIIlI.I));
    private final lIlIIlI IIIII;
    private final IIIlIlIIl IIIIl;
    private static final float IIIlI = 90.0f;
    private static final double IIIll = 9.999;
    private LivingEntity IIlII;
    private double IIlIl;
    private final llIll IIllI;
    private final lIIllII IIlll;
    private static final IIIlIIIII IlIII;
    private final IIIIIIIIl<IIIIllII> IlIIl = this.IIlllIl(new IIIIIIIIl<IIIIllII>(StringFactory.IIII("Target Mode"), IIIIllII.class, IIIIllII.I));
    private final lIlIIlI IlIlI;
    private final IIIlIlIIl IlIll;
    private static final float IllII = 0.9f;
    private int IllIl;
    private final IIIlIlIIl IlllI;
    private final llIll Illll;
    private static final IIIlIIIII lIIII;
    private static final float lIIIl = 1.6f;
    private static final float lIIlI = 620.0f;
    private static final float lIIll = -90.0f;
    private double lIlII;
    private static final double lIlIl = 10.0;
    private double lIllI;
    private final llIll lIlll;
    private static final float llIII = 420.0f;
    private static final IIIlIIIII llIIl;
    private static final String[] I;
    private static final Object[] llIlI;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float lI(double d) {
        double d2 = MathHelper.clamp((double)d, (double)1.0, (double)10.0);
        if (!(d2 <= 8.0)) {
            double d3 = (d2 - 8.0) / 2.0;
            return (float)MathHelper.lerp((double)d3, (double)420.0, (double)490.0);
        }
        double d4 = (d2 - 1.0) / 7.0;
        return (float)MathHelper.lerp((double)d4, (double)200.0, (double)420.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        if (Math.abs(this.IlII.IIIl() - 6.0) < 1.0E-6 && Math.abs(this.IlII.IIII() - 6.0) < 1.0E-6 || Math.abs(this.IlII.IIIl() - 1.0) < 1.0E-6 && Math.abs(this.IlII.IIII() - 8.0) < 1.0E-6) {
            this.IlII.I(new double[]{10.0, 10.0});
        }
        if (Math.abs(this.II.IIIl() - 6.0) < 1.0E-6 && Math.abs(this.II.IIII() - 6.0) < 1.0E-6 || Math.abs(this.II.IIIl() - 1.0) < 1.0E-6 && Math.abs(this.II.IIII() - 8.0) < 1.0E-6) {
            this.II.I(new double[]{10.0, 10.0});
        }
        if (Math.abs((Double)this.llI.lIl() - 3.0) < 1.0E-6) {
            this.llI.lI(4.5);
        }
        if (Math.abs((Double)this.IlIlI.lIl() - 180.0) < 1.0E-6) {
            this.IlIlI.lI(360.0);
        }
        if (Math.abs((Double)this.IIIl.lIl() - 10.0) < 1.0E-6) {
            this.IIIl.lI(28.0);
        }
        if (!(Math.abs((Double)this.lIll.lIl()) < 1.0E-6)) return;
        this.lIll.lI(18.0);
    }

    /*
     * Unable to fully structure code
     */
    private LivingEntity IIl(MinecraftClient var1_1) {
        block62: {
            block51: {
                block40: {
                    block53: {
                        block61: {
                            block56: {
                                block59: {
                                    block42: {
                                        block58: {
                                            block55: {
                                                block54: {
                                                    block37: {
                                                        block46: {
                                                            block63: {
                                                                block35: {
                                                                    block39: {
                                                                        block52: {
                                                                            block60: {
                                                                                block50: {
                                                                                    block45: {
                                                                                        block41: {
                                                                                            block48: {
                                                                                                block38: {
                                                                                                    block49: {
                                                                                                        block47: {
                                                                                                            block44: {
                                                                                                                block34: {
                                                                                                                    block57: {
                                                                                                                        block43: {
                                                                                                                            block36: {
                                                                                                                                break block54;
                                                                                                                                while (true) {
                                                                                                                                    break block34;
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

                                                                                                                                return var3_3;
                                                                                                                                while (true) {
                                                                                                                                    v0 = this.lIlIl(var4_4, var10_13, var12_15);
                                                                                                                                    break block35;
                                                                                                                                    break;
                                                                                                                                }
lbl10:
                                                                                                                                // 1 sources

                                                                                                                                while (this.lIll(var1_1, var5_7)) {
                                                                                                                                    break block36;
                                                                                                                                }
                                                                                                                                break block39;
lbl13:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    if (!this.lIll(var1_1, var10_13)) ** GOTO lbl62
                                                                                                                                    break block37;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                while (true) {
                                                                                                                                    this.lI.llII(var7_9.getId(), var6_8.lI());
                                                                                                                                    break block38;
                                                                                                                                    break;
                                                                                                                                }
lbl19:
                                                                                                                                // 2 sources

                                                                                                                                while (true) {
                                                                                                                                    continue;
                                                                                                                                    break;
                                                                                                                                }
lbl21:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    v1 = var1_1.world.getPlayers();
                                                                                                                                    ** GOTO lbl3
                                                                                                                                    break;
                                                                                                                                }
lbl24:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    if (var5_7.isRemoved()) break block39;
                                                                                                                                    ** GOTO lbl10
                                                                                                                                    break;
                                                                                                                                }
lbl27:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    if (!var8_11) ** continue;
                                                                                                                                    break block40;
                                                                                                                                    break;
                                                                                                                                }
lbl30:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    if (var6_8 == null) break block41;
                                                                                                                                    break block42;
                                                                                                                                    break;
                                                                                                                                }
lbl33:
                                                                                                                                // 1 sources

                                                                                                                                while (this.IIlII != null) {
                                                                                                                                    break block43;
                                                                                                                                }
                                                                                                                                break block46;
lbl36:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    if (var12_15 != null) break block44;
                                                                                                                                    break block45;
                                                                                                                                    break;
                                                                                                                                }
lbl39:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    if (this.lI.lIlll(var7_9.getId(), var6_8.lI())) break block46;
                                                                                                                                    ** GOTO lbl33
                                                                                                                                    break;
                                                                                                                                }
lbl42:
                                                                                                                                // 1 sources

                                                                                                                                while (this.IlIIl.lIl() == IIIIllII.l) {
                                                                                                                                    break block47;
                                                                                                                                }
                                                                                                                                break block55;
lbl45:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    this.lI.llII(var3_3.getId(), var2_2.distanceTo((Entity)var3_3));
                                                                                                                                    ** continue;
                                                                                                                                    break;
                                                                                                                                }
lbl48:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    v2 = null;
                                                                                                                                    ** GOTO lbl19
                                                                                                                                    break;
                                                                                                                                }
lbl51:
                                                                                                                                // 2 sources

                                                                                                                                while (true) {
                                                                                                                                    var8_11 = v3;
                                                                                                                                    ** continue;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (this.IlII(var1_1, var5_7)) break block56;
                                                                                                                            break block57;
lbl57:
                                                                                                                            // 1 sources

                                                                                                                            while (!this.IlII(var1_1, this.IIlII)) {
                                                                                                                                break block48;
                                                                                                                            }
                                                                                                                            break block58;
lbl60:
                                                                                                                            // 1 sources

                                                                                                                            while (true) {
                                                                                                                                var8_10 = var5_6.iterator();
lbl62:
                                                                                                                                // 6 sources

                                                                                                                                while (true) {
                                                                                                                                    if (!var8_10.hasNext()) break block49;
                                                                                                                                    break block50;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                break;
                                                                                                                            }
lbl65:
                                                                                                                            // 1 sources

                                                                                                                            while (((Boolean)this.Il.lIl()).booleanValue()) {
                                                                                                                                ** continue;
lbl67:
                                                                                                                                // 1 sources

                                                                                                                                ** GOTO lbl21
                                                                                                                            }
                                                                                                                            break block59;
                                                                                                                        }
                                                                                                                        if (!this.IIlII.isAlive()) break block46;
                                                                                                                        break block60;
                                                                                                                    }
                                                                                                                    if (this.IIIIl(var1_1, var5_7, true) == null) break block39;
                                                                                                                    break block56;
lbl75:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        if (var1_1.world != null) ** continue;
                                                                                                                        break block51;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                var3_3 = this.IIIlI(var1_1);
                                                                                                                if (var3_3 == null) ** GOTO lbl42
                                                                                                                ** while (true)
                                                                                                            }
lbl83:
                                                                                                            // 2 sources

                                                                                                            while (true) {
                                                                                                                if (!var11_14) ** continue;
                                                                                                                break block52;
                                                                                                                break;
                                                                                                            }
lbl86:
                                                                                                            // 1 sources

                                                                                                            while (var4_5 == null) {
                                                                                                                ** continue;
lbl88:
                                                                                                                // 1 sources

                                                                                                                ** GOTO lbl48
                                                                                                            }
                                                                                                            break block61;
                                                                                                        }
                                                                                                        var4_5 = ClientEntrypoint.lII();
                                                                                                        ** GOTO lbl86
lbl93:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            var7_9 = var10_13;
                                                                                                            ** GOTO lbl62
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    if (var7_9 == null) break block38;
                                                                                                    break block62;
lbl99:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        if (!(var9_12 instanceof LivingEntity)) ** GOTO lbl62
                                                                                                        break block53;
                                                                                                        break;
                                                                                                    }
                                                                                                }
lbl103:
                                                                                                // 2 sources

                                                                                                return var7_9;
                                                                                            }
                                                                                            if (this.IIIIl(var1_1, this.IIlII, true) == null) break block46;
                                                                                            break block58;
                                                                                        }
lbl109:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            var6_8 = var13_16;
                                                                                            ** continue;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    ** while (var11_14)
lbl114:
                                                                                    // 1 sources

                                                                                    ** GOTO lbl62
                                                                                }
                                                                                var9_12 = (Entity)var8_10.next();
                                                                                ** while (true)
                                                                            }
                                                                            if (this.IIlII.isRemoved()) break block46;
                                                                            break block63;
                                                                        }
                                                                        v0 = new IlIlIlIll(var10_13, var12_15, 0.0, 0.0, var10_13.getHealth());
                                                                        break block35;
                                                                    }
lbl125:
                                                                    // 3 sources

                                                                    return null;
                                                                }
                                                                var13_16 = v0;
                                                                ** while (true)
                                                            }
                                                            if (this.lIll(var1_1, this.IIlII)) ** GOTO lbl57
                                                        }
                                                        v3 = false;
                                                        ** GOTO lbl51
                                                    }
                                                    var11_14 = this.IlII(var1_1, var10_13);
                                                    var12_15 = this.lIII(var1_1, var10_13);
                                                    ** while (true)
                                                }
                                                var2_2 = var1_1.player;
                                                if (var2_2 != null) {
                                                    ** continue;
                                                }
                                                break block51;
                                            }
                                            var4_4 = var2_2.getEyePos();
                                            ** GOTO lbl65
                                        }
                                        v3 = true;
                                        ** while (true)
lbl150:
                                        // 1 sources

                                        while (true) {
                                            var7_9 = null;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    if (this.lIlI(var13_16, var6_8)) ** break;
                                    ** while (true)
                                    ** while (true)
lbl157:
                                    // 1 sources

                                    while (true) {
                                        if (!var5_7.isAlive()) ** GOTO lbl125
                                        ** continue;
                                        break;
                                    }
                                }
                                v1 = var1_1.world.getEntities();
                                ** while (true)
                            }
                            return var5_7;
                        }
                        v2 = var4_5.lI().lIll();
                        ** while (true)
                    }
                    var10_13 = (LivingEntity)var9_12;
                    ** while (true)
                    var5_7 = v2;
                    if (var5_7 != null) ** break;
                    ** while (true)
                    ** while (true)
                }
                this.lI.llII(this.IIlII.getId(), var1_1.player.distanceTo((Entity)this.IIlII));
                return this.IIlII;
            }
            return null;
            var5_6 = v1;
            var6_8 = null;
            ** while (true)
        }
        ** while (var6_8 == null)
lbl185:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (!(minecraftClient.player.getMainHandStack().getItem() instanceof AxeItem)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean lII(Box box, Vec3d vec3d, Box box2) {
        if (box == null) return false;
        if (vec3d == null) return false;
        if (box2 == null) return false;
        Box box3 = box2.expand(0.02);
        if (box3.contains(vec3d)) return true;
        if (box3.intersects(box)) return true;
        return false;
    }

    public float lIl(float f) {
        return this.IIl.III(f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll(MinecraftClient minecraftClient) {
        AutoMace autoMace;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.currentScreen != null) {
            return false;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (!clientPlayerEntity.isAlive()) return false;
        if (clientPlayerEntity.hasVehicle()) {
            return false;
        }
        if (IlIlIlI.IIIIlIl()) {
            return false;
        }
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        AutoMace autoMace2 = autoMace = clientEntrypoint == null || clientEntrypoint.IlI() == null ? null : clientEntrypoint.IlI().IIIlllI();
        if (autoMace != null && autoMace.lIll()) {
            return false;
        }
        if (((Boolean)this.lIIl.lIl()).booleanValue() && !this.IIlII(clientPlayerEntity.getMainHandStack())) {
            return false;
        }
        if (!this.llIII(clientPlayerEntity)) {
            if ((Boolean)this.l.lIl() == false) return true;
            if (this.IIIII(minecraftClient)) return true;
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity != null) {
            MaceSwap maceSwap = clientEntrypoint.IlI().IlIIIIl();
            if (maceSwap != null && maceSwap.IIIlIIl()) {
                if (maceSwap.IlIllI(livingEntity)) {
                    return true;
                }
                if (maceSwap.IIII(minecraftClient, livingEntity)) {
                    return true;
                }
            }
            ShieldBreaker shieldBreaker = clientEntrypoint.IlI().IIIIlI();
            if (shieldBreaker == null) return false;
            if (!shieldBreaker.IIIlIIl()) return false;
            if (!shieldBreaker.lIlI(livingEntity)) {
                if (!shieldBreaker.IllIlI(minecraftClient, livingEntity)) return false;
                return true;
            }
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double IIlI() {
        double d;
        block1: {
            if (!((Boolean)this.IIllI.lIl()).booleanValue()) break block1;
            d = this.lIllI;
            return d;
        }
        d = (Double)this.Illl.lIl();
        return d;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity == null) return false;
        if (KillAura.lII(minecraftClient.player.getBoundingBox(), minecraftClient.player.getEyePos(), livingEntity.getBoundingBox())) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllI(MinecraftClient minecraftClient, boolean bl) {
        boolean bl2 = bl && this.IIIlIIl() && this.llll.lIl() == IIIIIIIlI.l && minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null && minecraftClient.currentScreen == null;
        boolean bl3 = !IlIlIlI.IIIIlIl() && !IlIlllI.IIll();
        this.IIl.IlI(minecraftClient, bl2, bl3);
    }

    private void Illl() {
        this.IIlIl = this.IlIlI(this.IlII);
        this.IIll = this.IlIlI(this.II);
    }

    private IlIlIIIlI lIII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        return this.IIIIl(minecraftClient, livingEntity, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (livingEntity == null) {
            return false;
        }
        Vec3d vec3d = minecraftClient.player.getEyePos();
        Box box = livingEntity.getBoundingBox();
        if (this.IlII(minecraftClient, livingEntity)) return true;
        double d = (box.minX + box.maxX) * 0.5;
        double d2 = (box.minY + box.maxY) * 0.5;
        double d3 = (box.minZ + box.maxZ) * 0.5;
        if (this.IlllI(minecraftClient, vec3d, new Vec3d(d, d2, d3))) return true;
        if (this.IlllI(minecraftClient, vec3d, new Vec3d(d, box.minY + (double)livingEntity.getStandingEyeHeight() * 0.85, d3))) return true;
        if (this.IlllI(minecraftClient, vec3d, new Vec3d(d, box.minY + (box.maxY - box.minY) * 0.35, d3))) return true;
        if (this.IlllI(minecraftClient, vec3d, new Vec3d(box.minX, d2, d3))) return true;
        if (this.IlllI(minecraftClient, vec3d, new Vec3d(box.maxX, d2, d3))) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        this.lI.lIlIII();
        this.IllI(MinecraftClient.getInstance(), false);
        this.IlIIl();
        this.lIlII();
        this.Illl();
        this.IllIl = 0;
        this.IlIl = -1;
        this.IIlII = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected boolean llIIl() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return true;
        if (clientEntrypoint.IlI() == null) return true;
        AutoMace autoMace = clientEntrypoint.IlI().IIIlllI();
        if (autoMace == null) return true;
        if (!autoMace.IIIlIIl()) return true;
        IIlllIIIl.ll().Il(IlIIlllll.I, "Incompatable modules", "", 3200L);
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIlI(IlIlIlIll ilIlIlIll, IlIlIlIll ilIlIlIll2) {
        boolean bl;
        if (ilIlIlIll2 == null) return true;
        switch (((IIIIllII)((Object)this.IlIIl.lIl())).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 2: {
                bl = this.IIIllI(ilIlIlIll.I(), ilIlIlIll2.I(), ilIlIlIll.lI(), ilIlIlIll2.lI(), ilIlIlIll.II(), ilIlIlIll2.II());
                return bl;
            }
            case 0: 
            case 3: {
                bl = this.IIIllI(ilIlIlIll.II(), ilIlIlIll2.II(), ilIlIlIll.lI(), ilIlIlIll2.lI(), ilIlIlIll.I(), ilIlIlIll2.I());
                return bl;
            }
            case 1: 
        }
        bl = this.IIIllI(ilIlIlIll.lI(), ilIlIlIll2.lI(), ilIlIlIll.II(), ilIlIlIll2.II(), ilIlIlIll.I(), ilIlIlIll2.I());
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity == minecraftClient.player) return false;
        if (!livingEntity.isAlive()) return false;
        if (!livingEntity.isRemoved()) {
            if (IIllllllI.II(livingEntity)) {
                return false;
            }
        } else {
            return false;
        }
        if (!((Boolean)this.lIl.lIl()).booleanValue() && livingEntity.isInvisible()) {
            return false;
        }
        if (!((Boolean)this.Il.lIl()).booleanValue() || livingEntity instanceof PlayerEntity) {
            if ((Boolean)this.lIIl.lIl() == false) return this.lIIl(minecraftClient, livingEntity);
            if (this.IIlII(minecraftClient.player.getMainHandStack())) return this.lIIl(minecraftClient, livingEntity);
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIlIlIl llII(MinecraftClient minecraftClient, LivingEntity livingEntity, IlIlIIIlI ilIlIIIlI) {
        boolean bl;
        double d = this.lIIIl(this.IlII, this.IIlIl);
        double d2 = this.lIIIl(this.II, this.IIll);
        float f = this.lI(d);
        float f2 = this.lI(d2);
        float f3 = Math.max(f, f2);
        float f4 = MathHelper.clamp((float)(((float)Math.max(d, d2) - 1.0f) / 9.0f), (float)0.0f, (float)1.0f);
        float f5 = 1.0f + 1.0f * f4 * f4 * f4;
        if (this.llllI()) {
            f5 = 2.0f;
        }
        f5 *= 1.6f;
        float f6 = this.lllll(minecraftClient, livingEntity, ilIlIIIlI);
        float f7 = ilIlIIIlI == null ? 0.0f : MathHelper.clamp((float)ilIlIIIlI.ll(), (float)0.0f, (float)1.0f);
        float f8 = 1.0f + f6 * 0.22f + f7 * 0.3f;
        if (ilIlIIIlI != null && ilIlIIIlI.Il()) {
            f8 -= 0.06f;
        }
        f8 = MathHelper.clamp((float)f8, (float)0.9f, (float)1.35f);
        float f9 = MathHelper.clamp((float)(f3 * f8), (float)200.0f, (float)620.0f);
        float f10 = ((Double)this.lIII.lIl()).floatValue() / 100.0f;
        float f11 = 0.1f + 0.9f * (float)Math.pow(f10, 1.15f);
        if (this.llll.lIl() != IIIIIIIlI.l) {
            bl = false;
            return new IlIlIlIl(f9, lllIIIII.II, IIlIIllII.l, bl, IIIlIllII.lIl(f6, ((Double)this.IIIl.lIl()).floatValue() / 100.0f, ((Double)this.lIll.lIl()).floatValue() / 100.0f), new IlllIl(f11, ((Double)this.IIIII.lIl()).floatValue() / 1000.0f * (1.0f - f4) * (1.0f - f4), ((Double)this.IIIl.lIl()).floatValue() / 100.0f, ((Double)this.lIll.lIl()).floatValue() / 100.0f, ((Double)this.IllI.lIl()).floatValue() / 100.0f, f / f3, f2 / f3), false, f5, true);
        }
        bl = true;
        return new IlIlIlIl(f9, lllIIIII.II, IIlIIllII.l, bl, IIIlIllII.lIl(f6, ((Double)this.IIIl.lIl()).floatValue() / 100.0f, ((Double)this.lIll.lIl()).floatValue() / 100.0f), new IlllIl(f11, ((Double)this.IIIII.lIl()).floatValue() / 1000.0f * (1.0f - f4) * (1.0f - f4), ((Double)this.IIIl.lIl()).floatValue() / 100.0f, ((Double)this.lIll.lIl()).floatValue() / 100.0f, ((Double)this.IllI.lIl()).floatValue() / 100.0f, f / f3, f2 / f3), false, f5, true);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        IlllIll illlIll;
        int n = 6472;
        String string = "\u1037\u1028\u1062\u102a\u0fef\u104a\u1040\u103a\u1035\u1041\u1059\u0f9b\u1027\u1062\u104c\u1047\u0f96\u0f89\u0f7b\u1040\u0fed\u0ff3\u0fa0\u1029\u1035\u1029\u0f8a\u0f9d\uf95a\uf939\uf945\uf935\uf8ec\uf950\uf49c\uf49c\ue111\udba9\ue156\udb1c\ue104\ue0ff\udbbe\udbc1\ue20d\ue0af\ue00b\ue215\ue20f\ue1f4\ue0be\ue0be\ue875\u1d2e\u1d32\ue8a2\ue88f\ue88b\u1d3f\u1d3f\uc8f5\uc3b5\uc8ea\uc320\uc8f8\uc95b\uc3c2\uc3bd\udc11\ue223\udbf7\ue2b1\udc03\udc10\ue2ba\ue2ba\ubcdb\ubc97\ubc67\ubc87\ubc8e\ubc82\ubcd7\ubc77\uf750\ufa66\ufa92\uf75a\uf728\uf755\uf729\uf760\uf6f2\uf729\ufa91\ufa8e\uca64\uca41\uc988\uca41\uc98a\uca4d\uca51\uca27\uca3e\uca39\uca3e\uca53\ufae7\ufdad\ufae7\ufd24\ufae8\ufd24\ufdb8\ufdb8\u2b20\u30f8\u30f4\u30eb\u2bad\u2b0a\u2b0a\u30e6\u3105\u30e6\u30eb\u30e9\u30e6\u30f8\u2bb3\u2bdd\u8e31\u8d6a\u8da4\u8d75\u8d9c\u8d67\u8d7e\u8d8f\u8d78\u8d95\u8d9f\u8d85\u8d82\u8d7e\u8def\u8d87\u8d68\u8def\u8da2\u8da2\u8da3\u8d95\u8df3\u8df3\uc80a\uc808\uca0e\uca0d\uc807\uc9fa\uc9fa\uca03\uca03\uc9ea\uca0c\uca00\uca05\uc8dc\uc8b7\uc819\uc9f9\uc81c\uc819\uc8bb\u08c8\u0823\u08c5\u08d9\u0871\u08c7\u081f\u0817\u08da\u08b7\u08a6\u08c0\u08b9\u08d1\u08e3\u08be\u08ce\u08c5\u081f\u0a14\ud2d3\ud2c7\ud2d0\ud2da\ucbf9\ud2dc\ud2b8\ud2c7\ud270\ud2d0\ud2c9\ud26c\ud2ca\ucc0c\ud2c0\ud270\u3ed8\u3ea7\u3e1b\u3eca\u3ee0\u3e6c\u3e6d\u3eb8\u3ebe\u3ea8\u3e20\u3ee3\u3eaa\u3ea7\u3ed9\u3ed3\u3ea8\u3eb1\u3eaa\u3e06\uda22\udab6\udaad\uda07\uda18\ud414\udae2\uda0b\ud3e9\uda19\udaae\ud3e6\ud404\ud414\udade\udade\u2aa6\u2a24\u2ab8\u2ab8\u12ca\u12c9\u12d3\u12c3\u12cb\u12dc\u120a\u126e\u12c1\u12e1\u12c5\u12c1\u12a9\u12a7\u1217\u12be\u12b8\u126c\u0bf6\u0bf6\u46fe\u4919\u4757\u49cd\uf8b9\uf8e4\ufa0d\uf8e4\ufa13\uf8ca\ufa0d\uf8c8\uf86f\uf86c\uf8cd\uf8ca\uab08\uabaa\ub0f6\ub0f6\uefe6\uf61d\uf6b1\ueff4\uefe8\uf621\uefff\ueffd\uf624\uf003\uefe8\ueff4\uf015\uf6a7\uf6ab\uf6b8\u998d\u99f3\u9967\u9967\u76e5\u76bc\u7625\u76b5\u76c8\u766e\u76c1\u76ce\u76cd\u76de\u7624\u76c2\u76b5\u76cc\u76b5\u7619\ub169\ub25f\ub1db\ub1db\ud20c\ud0b1\ud0b8\ud0b1\ud0ba\ud00a\ud25b\ud0ae\ud018\ud1fe\ud1fe\ud0c4\ue425\ue5f8\ue471\ue5f8\ue4c7\ue657\ue41e\ue5f4\ue5eb\ue610\ue603\ue5f4\ue601\ue5f9\ue406\ue601\uaf16\uafb5\uafb7\uafa6\uafba\uafbd\uafc0\uafdd\uafe3\uafcd\ua55b\uafc7\uafc6\uafe3\ua502\uafab\uafcb\uafc1\ua4f8\uafdd\uafce\uafb8\uaf72\ua4ea\u2e07\u2eb0\u27e6\u27f7\u2e23\u2e18\u2e25\u2e73\u648e\u64a1\u693d\u693d\ue4bb\ue4d4\ue4c2\ue4cb\ue46f\ue4dc\ue4e1\ue4bc\ue4be\ue4dc\ue4c1\ue4be\ue4d0\ue4ce\ue4a6\ue4b9\u91a6\u91c9\u8ef5\u8ef5\u20e0\u20b7\u20bb\u20d0\u206d\u20c0\u2020\u20c2\u20c4\u20d2\u2215\u2016\u20d1\u20b7\u206f\u2072\ubce8\u070b\u07cf\u07cf\u00b8\u00cc\u00ba\u00b5\u6eeb\u7107\u71b3\u711d\u6bba\u710e\u6bb5\u6b73\u6b17\u6bbc\u70f9\u6b71\u6b71\u6bdf\u6bd4\u6b72\u6bca\u6bcc\u70e6\u70e6\ucd5c\ucd45\ucd4b\ucd29\ucd4b\ucd3d\ucd3b\ucd39\ucd3c\ud89c\ucd54\ud89f\ucd4d\ucd63\ucd51\ucd4c\u6453\u6436\u644b\u63ef\u6397\u6445\u6436\u6465\u6458\u63f3\u6454\u6463\u645e\u6446\u6445\u63ee\u6449\u6429\u6380\u6443\u639b\u63ee\u6392\u6392\u229a\u1eee\u2295\u2293\u2277\u229c\u1f59\u2291\u2288\u1f2c\u1ef3\u229e\u2281\u2282\u1f2c\u1f46\u765b\u74c2\u7407\u75f7\u7613\u740b\u7423\u7423\u74b2\u74b1\u7418\u7423\u740b\u74ae\u741e\u74aa\ud6c2\ud6d9\ud61b\ud6c8\ud6cc\ud6e5\ud6d3\ud6b9\ud6df\ud000\ud6a8\ud6b8\ud6c6\ucff4\ud6ce\ucffc\ubbf2\ubc29\ubc4b\ubc38\ubc5c\ubc35\ubc63\ubc30\ubc26\ubc51\ubc2a\ubc2b";
        char[] cArray = "\u1954\u1940\u1940\u1940\u1940\u1940\u1940\u1940\u1944\u1944\u1940\u1958\u1950\u195c\u195c\u1958\u195c\u1958\u194c\u195c\u194c\u1944\u194c\u1958\u194c\u1958\u194c\u1944\u1958\u1950\u1940\u194c\u1958\u194c\u1958\u194c\u194c\u194c\u1958\u1958\u1950\u1958\u1958\u1958\u1944".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            int n4;
            int n5;
            if (!bl || (bl = false) || !true) {
                n4 = cArray[n5] ^ n;
                stringArray[n5] = string.substring(n3, n3 + n4);
                n3 += n4;
                if (++n5 < cArray.length) continue;
                n2 = 0;
            }
            n5 = 0;
            n3 = 0;
            n4 = 0;
            if (n2 == 0) break;
        }
        I = stringArray;
        llIlI = new Object[stringArray.length];
        llIIl = StringFactory.IIII("head");
        lIIII = StringFactory.IIII("chest");
        IlIII = StringFactory.IIII("legs");
        illlIll(lIIII, (Object)StringFactory.IIII("u5xRjw0="));
        llIl = List.of(new IlllIll(llIIl, (Object)StringFactory.IIII("sJFVmA==")), illlIll, new IlllIll(IlIII, (Object)StringFactory.IIII("tJFTjw==")));
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean llIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (!this.IIIlIIl()) return false;
        if (!this.lll(minecraftClient)) return false;
        if (livingEntity == null) return false;
        if (!this.lIll(minecraftClient, livingEntity)) return false;
        if (this.IlII(minecraftClient, livingEntity)) return true;
        if (this.IIIIl(minecraftClient, livingEntity, true) == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity == null) {
            return false;
        }
        MaceSwap maceSwap = clientEntrypoint.IlI().IlIIIIl();
        if (maceSwap != null && maceSwap.IIIlIIl() && maceSwap.IIII(minecraftClient, livingEntity)) {
            return true;
        }
        BreachSwap breachSwap = clientEntrypoint.IlI().l();
        if (breachSwap == null) return false;
        if (!breachSwap.IIIlIIl()) return false;
        if (breachSwap.llIl()) {
            return true;
        }
        if (!breachSwap.lIll(minecraftClient, livingEntity)) return false;
        return true;
    }

    private boolean IIIII(MinecraftClient minecraftClient) {
        block2: {
            block1: {
                block0: {
                    if (minecraftClient.getWindow() == null) break block0;
                    if (this.IIlll.ll()) break block1;
                    break block2;
                }
                return false;
            }
            return lIIllllI.llI(minecraftClient, (InputUtil.Key)this.IIlll.lIl());
        }
        return false;
    }

    @Override
    public void llll() {
        this.lI.IlIIIlI();
        this.IllI(MinecraftClient.getInstance(), false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIlIIIlI IIIIl(MinecraftClient minecraftClient, LivingEntity livingEntity, boolean bl) {
        IlIlIIIlI ilIlIIIlI;
        Vec3d vec3d;
        Vec3d vec3d2;
        lllllI lllllI2;
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (livingEntity == null) return null;
        if (this.lIll(minecraftClient, livingEntity)) {
            if (this.IIlIl() && !this.IIIlll(minecraftClient, livingEntity.getBoundingBox().getCenter())) {
                return null;
            }
            lllllI2 = this.IlIII();
            Vec3d vec3d3 = this.IllII(minecraftClient, livingEntity);
            if (vec3d3 != null) {
                vec3d2 = this.lllIl(minecraftClient, livingEntity, livingEntity.getBoundingBox().getCenter());
                vec3d2 = KillAura.IIIll(minecraftClient.player.getEyePos(), minecraftClient.player.getRotationVec(1.0f), livingEntity.getBoundingBox(), vec3d2, this.IlII(minecraftClient, livingEntity));
                vec3d = this.lI.IIIIlll(minecraftClient, livingEntity, vec3d2);
                Vec3d vec3d4 = vec3d != null ? vec3d : vec3d2;
                IlIlIIIlI ilIlIIIlI2 = this.lI.IIl(minecraftClient, livingEntity, lllllI2, bl, vec3d4, (Boolean)this.lIl.lIl());
                if (ilIlIIIlI2 == null && vec3d != null) {
                    ilIlIIIlI2 = this.lI.IIl(minecraftClient, livingEntity, lllllI2, bl, vec3d2, (Boolean)this.lIl.lIl());
                }
                if (ilIlIIIlI2 != null) {
                    return ilIlIIIlI2;
                }
                lllllI2 = new lllllI(lllllI2.lII(), lllllI2.II(), true, lllllI2.III(), true, true, true, true);
            }
            if (this.llllI()) {
                return this.lI.IIl(minecraftClient, livingEntity, lllllI2, bl, livingEntity.getBoundingBox().getCenter(), (Boolean)this.lIl.lIl());
            }
        } else {
            return null;
        }
        if (!((Boolean)this.IIII.lIl()).booleanValue() && (ilIlIIIlI = this.lI.IIl(minecraftClient, livingEntity, lllllI2, bl, this.lllIl(minecraftClient, livingEntity, vec3d = (vec3d2 = IIlllllIl.IlIllll(livingEntity, ((IIIllIIl)((Object)this.llII.lIl())).Il)) != null ? vec3d2.getCenter() : livingEntity.getBoundingBox().getCenter()), (Boolean)this.lIl.lIl())) != null) {
            return ilIlIIIlI;
        }
        if (this.IlIIl.lIl() != IIIIllII.I) return this.lI.Ill(minecraftClient, livingEntity, lllllI2, bl, (Boolean)this.lIl.lIl());
        vec3d2 = this.llIlI(minecraftClient);
        if (vec3d2 != null) return this.lI.IIlIIIl(minecraftClient, livingEntity, lllllI2, bl, (Boolean)this.lIl.lIl(), minecraftClient.player.getEyePos(), vec3d2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private LivingEntity IIIlI(MinecraftClient minecraftClient) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        AutoPlay autoPlay = clientEntrypoint != null && clientEntrypoint.IlI() != null ? clientEntrypoint.IlI().llIIlI() : null;
        PlayerEntity playerEntity = autoPlay == null ? null : autoPlay.llII(minecraftClient);
        if (!this.llIl(minecraftClient, (LivingEntity)playerEntity)) return null;
        PlayerEntity playerEntity2 = playerEntity;
        return playerEntity2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        boolean bl = this.lll(minecraftClient);
        LivingEntity livingEntity = !bl ? null : this.IIl(minecraftClient);
        IlIlIIIlI ilIlIIIlI = livingEntity == null ? null : this.IIIIl(minecraftClient, livingEntity, true);
        this.IllI(minecraftClient, bl && livingEntity != null);
        this.lI.ll(minecraftClient, this.llII(minecraftClient, livingEntity, ilIlIIIlI), bl, ilIlIIIlI, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    static Vec3d IIIll(Vec3d vec3d, Vec3d vec3d2, Box box, Vec3d vec3d3, boolean bl) {
        if (!bl) return vec3d3;
        if (vec3d == null) return vec3d3;
        if (vec3d2 == null) return vec3d3;
        if (box == null) return vec3d3;
        if (vec3d3 != null) {
            double d = Math.sqrt(vec3d2.x * vec3d2.x + vec3d2.z * vec3d2.z);
            if (!Double.isFinite(d)) return vec3d3;
            if (!(d <= 1.0E-6)) {
                Vec3d vec3d4;
                double d2 = Math.min(0.08, Math.min(box.getLengthX(), box.getLengthZ()) * 0.25);
                double d3 = vec3d2.x / d;
                double d4 = vec3d2.z / d;
                double d5 = (box.minX + box.maxX) * 0.5;
                double d6 = (box.minZ + box.maxZ) * 0.5;
                double d7 = Math.hypot(d5 - vec3d.x, d6 - vec3d.z);
                double d8 = MathHelper.clamp((double)d7, (double)0.34, (double)0.58);
                vec3d4(MathHelper.clamp((double)(vec3d.x + d3 * d8), (double)(box.minX + d2), (double)(box.maxX - d2)), MathHelper.clamp((double)vec3d3.y, (double)box.minY, (double)box.maxY), MathHelper.clamp((double)(vec3d.z + d4 * d8), (double)(box.minZ + d2), (double)(box.maxZ - d2)));
                return vec3d4;
            }
            return vec3d3;
        }
        return vec3d3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlII(ItemStack itemStack) {
        if (itemStack.isEmpty()) {
            return false;
        }
        if (itemStack.getItem() instanceof AxeItem) return true;
        if (itemStack.getItem() instanceof MaceItem) {
            return true;
        }
        String string = Registries.ITEM.getId((Object)itemStack.getItem()).getPath();
        return string.endsWith("_sword");
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIlIl() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIIlIIl()) return false;
        if (this.llll.lIl() != IIIIIIIlI.l) return false;
        if (!this.IIl.IIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIllI(IIIlIlIIl iIIlIlIIl) {
        double d;
        double d2;
        double d3 = iIIlIlIIl.IIIl();
        if (d3 == (d2 = iIIlIlIIl.IIII())) {
            d = d3;
            return d;
        }
        d = ThreadLocalRandom.current().nextDouble(d3, d2);
        return d;
    }

    public float IIlll(float f) {
        return this.IIl.lI(f);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private lllllI IlIII() {
        return new lllllI((Double)this.llI.lIl(), MathHelper.clamp((float)(((Double)this.IlIlI.lIl()).floatValue() * 0.5f), (float)0.5f, (float)180.0f), (Boolean)this.IIII.lIl(), ((IIIllIIl)((Object)this.llII.lIl())).Il, this.III.IIl(llIIl), this.III.IIl(lIIII), this.III.IIl(IlIII), true);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        boolean bl = this.lll(minecraftClient);
        LivingEntity livingEntity = bl ? this.IIl(minecraftClient) : null;
        IlIlIIIlI ilIlIIIlI = livingEntity == null ? null : this.IIIIl(minecraftClient, livingEntity, true);
        this.IllI(minecraftClient, bl && livingEntity != null);
        this.lI.llllII(minecraftClient, this.llII(minecraftClient, livingEntity, ilIlIIIlI), bl, ilIlIIIlI, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIl() {
        double d;
        if (!((Boolean)this.IIllI.lIl()).booleanValue()) {
            this.lIllI = (Double)this.Illl.lIl();
            return;
        }
        double d2 = this.IlIll.IIIl();
        this.lIllI = d2 != (d = this.IlIll.IIII()) ? ThreadLocalRandom.current().nextDouble(d2, d) : d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IlIlI(IIIlIlIIl iIIlIlIIl) {
        double d;
        double d2;
        double d3 = iIIlIlIIl.IIIl();
        if (d3 == (d2 = iIIlIlIIl.IIII())) {
            d = d3;
            return d;
        }
        d = ThreadLocalRandom.current().nextDouble(d3, d2);
        return d;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IlIll(ItemStack itemStack) {
        if (itemStack == null) return this.lIlII;
        if (itemStack.isEmpty()) return this.lIlII;
        if (!(itemStack.getItem() instanceof AxeItem)) return this.lIlII;
        return this.Ill;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IllII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (livingEntity == null) {
            return null;
        }
        Vec3d vec3d = minecraftClient.player.getEyePos();
        Box box = livingEntity.getBoundingBox();
        Vec3d vec3d2 = new Vec3d(MathHelper.clamp((double)vec3d.x, (double)box.minX, (double)box.maxX), MathHelper.clamp((double)vec3d.y, (double)box.minY, (double)box.maxY), MathHelper.clamp((double)vec3d.z, (double)box.minZ, (double)box.maxZ));
        double d = this.IIIlII() + 1.0E-4;
        if (!(vec3d.squaredDistanceTo(vec3d2) <= d * d)) return null;
        if (!this.IlllI(minecraftClient, vec3d, vec3d2)) {
            return null;
        }
        Vec3d vec3d3 = vec3d2;
        return vec3d3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlllI(MinecraftClient minecraftClient, Vec3d vec3d, Vec3d vec3d2) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (vec3d == null) return false;
        if (vec3d2 == null) return false;
        BlockHitResult blockHitResult = lIIllllI.IIIIllI(minecraftClient, (Entity)minecraftClient.player, vec3d, vec3d2);
        if (blockHitResult == null) return true;
        if (blockHitResult.getType() == HitResult.Type.MISS) {
            return true;
        }
        if (!(vec3d.squaredDistanceTo(blockHitResult.getPos()) + 1.0E-4 >= vec3d.squaredDistanceTo(vec3d2))) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lIIIl(IIIlIlIIl iIIlIlIIl, double d) {
        double d2 = iIIlIlIIl.IIIl();
        double d3 = iIIlIlIIl.IIII();
        if (!(Math.abs(d2 - d3) <= 1.0E-6)) return MathHelper.clamp((double)d, (double)Math.min(d2, d3), (double)Math.max(d2, d3));
        return MathHelper.clamp((double)d2, (double)1.0, (double)10.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIlI(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) return false;
        if (clientPlayerEntity.isOnGround()) {
            return false;
        }
        if (clientPlayerEntity.isTouchingWater()) return false;
        if (clientPlayerEntity.isSubmergedInWater()) return false;
        if (clientPlayerEntity.isInLava()) return false;
        if (lIIllllI.IIllIl((Entity)clientPlayerEntity)) return false;
        if (clientPlayerEntity.hasVehicle()) return false;
        if (clientPlayerEntity.isClimbing()) return false;
        if (clientPlayerEntity.hasNoGravity()) return false;
        if (clientPlayerEntity.isUsingItem()) return false;
        if (lIIllllI.IllllI((LivingEntity)clientPlayerEntity)) return false;
        if (lIIllllI.IlllII((LivingEntity)clientPlayerEntity)) return false;
        if (clientPlayerEntity.getAbilities().flying) return false;
        if (clientPlayerEntity.hasStatusEffect(StatusEffects.LEVITATION)) return false;
        if (clientPlayerEntity.hasStatusEffect(StatusEffects.BLINDNESS)) return false;
        if (clientPlayerEntity.hasStatusEffect(StatusEffects.SLOW_FALLING)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Vec3d lIIll(float f, float f2) {
        double d = Math.toRadians(f);
        double d2 = Math.toRadians(f2);
        double d3 = Math.cos(d2);
        return new Vec3d(-Math.sin(d) * d3, -Math.sin(d2), Math.cos(d) * d3).normalize();
    }

    @Override
    public void IllIll(MinecraftClient minecraftClient) {
    }

    private void lIlII() {
        this.lIlII = this.IIllI(this.IlllI);
        this.Ill = this.IIllI(this.IIIIl);
    }

    private IlIlIlIll lIlIl(Vec3d vec3d, LivingEntity livingEntity, IlIlIIIlI ilIlIIIlI) {
        double d = vec3d.distanceTo(ilIlIIIlI.l());
        double d2 = ilIlIIIlI.ll() * ilIlIIIlI.III();
        return new IlIlIlIll(livingEntity, ilIlIIIlI, d, d2, livingEntity.getHealth());
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIllI(ClientPlayerEntity clientPlayerEntity, float f) {
        if ((Boolean)this.lIlll.lIl() == false) return false;
        if (clientPlayerEntity == null) {
            return false;
        }
        if (!this.lIIlI(clientPlayerEntity)) {
            return false;
        }
        if (!IlIIllI.IIlI(clientPlayerEntity.fallDistance)) return true;
        if (!IlIIllI.lIlI(clientPlayerEntity.getVelocity().y, f, clientPlayerEntity.isSprinting(), ((ClientPlayerEntityMixin2)clientPlayerEntity).virel$getLastSprinting())) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean llIII(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) return false;
        if (!clientPlayerEntity.isUsingItem()) return false;
        if (clientPlayerEntity.getActiveHand() != Hand.OFF_HAND) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d llIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) {
            return null;
        }
        if (minecraftClient.gameRenderer != null && minecraftClient.gameRenderer.getCamera() != null) {
            Camera camera = minecraftClient.gameRenderer.getCamera();
            return this.lIIll(camera.getYaw(), camera.getPitch());
        }
        Vec3d vec3d = minecraftClient.player.getRotationVec(1.0f);
        double d = vec3d.lengthSquared();
        if (d <= 1.0E-7) return null;
        Vec3d vec3d2 = vec3d.multiply(1.0 / Math.sqrt(d));
        return vec3d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIll() {
        this.Illl();
        this.IlIIl();
        this.lIlII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllII(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) {
            return false;
        }
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.currentScreen != null) {
            return false;
        }
        if (!this.lll(minecraftClient)) {
            return false;
        }
        int n = lIIllllI.lllI(minecraftClient.player.getInventory());
        if (this.IlIl != -1 && n != this.IlIl) {
            this.IllIl = 1;
        }
        this.IlIl = n;
        if (this.IllIl <= 0) {
            LivingEntity livingEntity = this.IIl(minecraftClient);
            if (livingEntity != null) return this.IIlIlI(minecraftClient, livingEntity);
            this.IIlII = null;
            return false;
        }
        --this.IllIl;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d lllIl(MinecraftClient minecraftClient, LivingEntity livingEntity, Vec3d vec3d) {
        if (minecraftClient == null) return vec3d;
        if (minecraftClient.player == null) return vec3d;
        if (livingEntity == null) return vec3d;
        if (vec3d == null) return vec3d;
        Vec3d vec3d2 = livingEntity.getVelocity();
        double d = vec3d2.horizontalLength();
        if (!Double.isFinite(d)) return vec3d;
        if (d < 0.05) {
            return vec3d;
        }
        double d2 = minecraftClient.player.distanceTo((Entity)livingEntity);
        double d3 = MathHelper.clamp((double)(1.0 + d2 * 0.25), (double)1.0, (double)2.2);
        Vec3d vec3d3 = new Vec3d(vec3d2.x, 0.0, vec3d2.z).multiply(d3 / 20.0);
        double d4 = Math.max(0.1, Math.min(0.2, d * 0.35 * d3 / 20.0));
        if (vec3d3.length() > d4) {
            vec3d3 = vec3d3.normalize().multiply(d4);
        }
        Vec3d vec3d4 = vec3d.add(vec3d3);
        Box box = livingEntity.getBoundingBox();
        double d5 = Math.min(0.08, Math.min(box.getLengthX(), box.getLengthZ()) * 0.25);
        return new Vec3d(MathHelper.clamp((double)vec3d4.x, (double)(box.minX + d5), (double)(box.maxX - d5)), MathHelper.clamp((double)vec3d4.y, (double)box.minY, (double)box.maxY), MathHelper.clamp((double)vec3d4.z, (double)(box.minZ + d5), (double)(box.maxZ - d5)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean llllI() {
        if (!(this.lIIIl(this.IlII, this.IIlIl) >= 9.999)) return false;
        if (!(this.lIIIl(this.II, this.IIll) >= 9.999)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float lllll(MinecraftClient minecraftClient, LivingEntity livingEntity, IlIlIIIlI ilIlIIIlI) {
        float f;
        if (minecraftClient == null) return 0.0f;
        if (minecraftClient.player == null) return 0.0f;
        if (livingEntity == null) return 0.0f;
        if (ilIlIIIlI == null) {
            return 0.0f;
        }
        double d = livingEntity.getVelocity().horizontalLength();
        double d2 = minecraftClient.player.getVelocity().horizontalLength();
        float f2 = MathHelper.clamp((float)((float)((d + d2) * 3.35)), (float)0.0f, (float)1.0f);
        float f3 = MathHelper.clamp((float)(ilIlIIIlI.ll() * 2.05f), (float)0.0f, (float)1.0f);
        if (((Boolean)this.IIII.lIl()).booleanValue()) {
            f = MathHelper.clamp((float)(ilIlIIIlI.ll() / 0.18f), (float)0.12f, (float)1.0f);
            if (lIIllllI.IIIllII(minecraftClient, livingEntity, this.IIIlII(), true) != null) {
                f = Math.min(f, 0.22f);
            }
            f2 *= f;
            f3 *= f;
        }
        f = ilIlIIIlI.Il() ? 0.16f : 0.0f;
        return MathHelper.clamp((float)(f + f2 * 0.44f + f3 * 0.36f), (float)0.0f, (float)1.0f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity == null) {
            return false;
        }
        ElytraSwap elytraSwap = clientEntrypoint.IlI().IlIlll();
        if (elytraSwap == null) return false;
        if (!elytraSwap.lII(minecraftClient, livingEntity)) return false;
        return true;
    }

    public void IIIIIl(float f, float f2, float f3, float f4) {
        this.IIl.Il(f, f2, f3, f4);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIlI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (this.llIII(clientPlayerEntity)) {
            return false;
        }
        if (lIIllllI.IIIIIlI(minecraftClient) > 0) return false;
        if (lIIllllI.IIIIll(minecraftClient) > 0) {
            return false;
        }
        ItemStack itemStack = clientPlayerEntity.getMainHandStack();
        float f = clientPlayerEntity.getAttackCooldownProgress(0.5f);
        if ((double)f < this.IlIll(itemStack)) {
            return false;
        }
        if (itemStack.getItem() instanceof MaceItem) {
            if (!this.IIIlIl(clientPlayerEntity)) return true;
            return false;
        }
        if (!((Boolean)this.lIlll.lIl()).booleanValue() || ((Boolean)this.Illll.lIl()).booleanValue() || !lIIllllI.lllIlI(livingEntity, clientPlayerEntity)) {
            if (!this.lIllI(clientPlayerEntity, f)) return true;
            return false;
        }
        if (!this.lIIlI(clientPlayerEntity)) return true;
        if (IlIIllI.IIlI(clientPlayerEntity.fallDistance)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIIIll(Entity entity) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return false;
        if (entity != minecraftClient.player) return false;
        if (this.IIlIl()) return true;
        return false;
    }

    private double IIIlII() {
        return Math.min(3.0, this.IIlI());
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlIl(ClientPlayerEntity clientPlayerEntity) {
        if (!((Boolean)this.lIlll.lIl()).booleanValue()) {
            return false;
        }
        if (clientPlayerEntity.isOnGround()) return false;
        if (clientPlayerEntity.isGliding()) {
            return false;
        }
        if (MaceItem.shouldDealAdditionalDamage((LivingEntity)clientPlayerEntity)) {
            return false;
        }
        if (!(clientPlayerEntity.fallDistance >= 1.5)) return false;
        if (!(clientPlayerEntity.getVelocity().y < 0.0)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public KillAura() {
        super(StringFactory.IIII("s51YkDhCQh0="), Category.II, StringFactory.IIII("mZ1Z3FJHWBWD"));
        llIll llIll2;
        IIIlIlIIl iIIlIlIIl;
        this.IlII = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Horizontal Speed"), 10.0, 10.0, 1.0, 10.0, 0.1));
        this.II = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Vertical Speed"), 10.0, 10.0, 1.0, 10.0, 0.1));
        iIIlIlIIl(StringFactory.IIII("q4Nbjh0XcxOYBJtWGN0="), 0.89, 0.93, 0.8, 1.0, 0.01);
        this.IlllI = this.IIlllIl(iIIlIlIIl);
        this.IIIIl = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("uYxR3DpYXxCTB4hX"), 0.89, 0.93, 0.8, 1.0, 0.01));
        llIll2((Object)StringFactory.IIII("sZNakwtSEC+fAZpVC8A="), false);
        this.Illll = this.IIlllIl(llIll2);
        this.lIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Smoothness"), 22.0, 0.0, 100.0, 1.0).IIII(StringFactory.IIII("%")));
        this.IIIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Reaction Time"), 195.0, 0.0, 500.0, 5.0).IIII(StringFactory.IIII("ms")));
        this.IIIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Aim Drift"), 28.0, 0.0, 100.0, 1.0).IIII(StringFactory.IIII("%")));
        this.lIll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Hand Tremor"), 18.0, 0.0, 100.0, 1.0).IIII(StringFactory.IIII("%")));
        this.IllI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Pitch Ratio"), 100.0, 0.0, 100.0, 1.0).IIII(StringFactory.IIII("%")));
        this.III = this.IIlllIl(new llIlIlI(StringFactory.IIII("Aim Part"), llIl, Set.of(llIIl, lIIII, IlIII)));
        this.llII = this.IIlllIl(new IIIIIIIIl<IIIllIIl>(StringFactory.IIII("Aim Priority"), IIIllIIl.class, IIIllIIl.l));
        this.IIllI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Range Variability"), false));
        this.Illl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Range"), 3.0, 1.0, 3.0, 0.01).IIII(StringFactory.IIII("m")));
        this.IlIll = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Range Window"), 2.7, 3.0, 2.0, 3.0, 0.01).IIll(StringFactory.IIII("m")));
        this.llI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Rotate Range"), 4.5, 1.0, 8.0, 0.01).IIII(StringFactory.IIII("m")));
        this.IlIlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("FOV"), 360.0, 2.0, 360.0, 1.0).IIII(StringFactory.IIII("deg")));
        this.IIII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Smart look"), true));
        this.Il = this.IIlllIl(new llIll((Object)StringFactory.IIII("Players Only"), true));
        this.lIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Track invisibles"), false));
        this.lIlll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Smart Crits"), true));
        this.lIIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Weapon Only"), false));
        this.l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Hold To Use"), false));
        this.IIlll = this.IIlllIl(new lIIllII(StringFactory.IIII("Hold Bind")));
        this.IIl = new lllllII();
        this.lI = new IlIlIlI();
        this.IlIl = -1;
        this.IIlll.lIII(this.l::lIl);
        this.Illl.lIII(() -> (Boolean)this.IIllI.lIl() == false);
        this.IlIll.lIII(this.IIllI::lIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIllI(double d, double d2, double d3, double d4, double d5, double d6) {
        int n = Double.compare(d, d2);
        if (n == 0) {
            int n2 = Double.compare(d3, d4);
            if (n2 != 0) {
                if (n2 < 0) return true;
                return false;
            }
            if (Double.compare(d5, d6) >= 0) return false;
            return true;
        }
        if (n >= 0) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlll(MinecraftClient minecraftClient, Vec3d vec3d) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (vec3d == null) {
            return false;
        }
        Vec3d vec3d2 = this.llIlI(minecraftClient);
        if (vec3d2 == null) {
            return false;
        }
        Vec3d vec3d3 = vec3d.subtract(minecraftClient.player.getEyePos());
        double d = vec3d3.length();
        if (d <= 1.0E-4) return true;
        double d2 = vec3d2.dotProduct(vec3d3.multiply(1.0 / d));
        double d3 = Math.toDegrees(Math.acos(MathHelper.clamp((double)d2, (double)-1.0, (double)1.0)));
        float f = MathHelper.clamp((float)(((Double)this.IlIlI.lIl()).floatValue() * 0.5f), (float)0.5f, (float)180.0f);
        if (d3 <= (double)f) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIlIII(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if ((Boolean)this.lIlll.lIl() == false) return false;
        if (!this.lll(minecraftClient)) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (!this.lIIlI(minecraftClient.player)) return false;
        if (orchard.internal.IIlI.IIl(minecraftClient)) return false;
        if (lIIllllI.llIlI()) return false;
        if (orchard.internal.IIlI.IIlI(minecraftClient)) return false;
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        ItemStack itemStack = clientPlayerEntity.getMainHandStack();
        if (itemStack.getItem() instanceof MaceItem) return false;
        if (lIIllllI.IIIIIlI(minecraftClient) > 0) return false;
        if (lIIllllI.IIIIll(minecraftClient) > 0) return false;
        if (!IlIIllI.lll(clientPlayerEntity.getVelocity().y, clientPlayerEntity.getAttackCooldownProgress(0.5f), this.IlIll(itemStack))) return false;
        LivingEntity livingEntity = this.IIlII;
        if (livingEntity == null) return false;
        if (!this.lIll(minecraftClient, livingEntity)) return false;
        if (!((Boolean)this.Illll.lIl()).booleanValue()) {
            if (lIIllllI.lllIlI(livingEntity, clientPlayerEntity)) return false;
        }
        double d = Math.min(3.0, this.IIIlII());
        EntityHitResult entityHitResult = lIIllllI.IIIllII(minecraftClient, livingEntity, d, true);
        if (entityHitResult == null) return false;
        if (entityHitResult.getEntity() != livingEntity) return false;
        if (!(clientPlayerEntity.getEyePos().distanceTo(entityHitResult.getPos()) <= d + 1.0E-4)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return false;
        }
        lllIIlI lllIIlI2 = clientEntrypoint.IlI();
        if (lllIIlI2 == null) return false;
        if (lllIIlI2.IIlIl() == null) return false;
        if (!lllIIlI2.IIlIl().IIIII(minecraftClient, (Entity)livingEntity)) return false;
        return true;
    }

    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        this.lllII(minecraftClient);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean IIlIlI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (livingEntity != this.IIlII) {
            this.IIlII = livingEntity;
        }
        if (orchard.internal.IIlI.IIl(minecraftClient) || lIIllllI.llIlI()) {
            return false;
        }
        if (minecraftClient.player.isUsingItem()) {
            return false;
        }
        double d = Math.min(3.0, this.IIIlII());
        EntityHitResult entityHitResult = lIIllllI.IIIllII(minecraftClient, livingEntity, d, true);
        if (this.lI.lIIlII() && entityHitResult == null) {
            return false;
        }
        if (entityHitResult == null || entityHitResult.getEntity() != livingEntity) {
            return false;
        }
        if (minecraftClient.player.getEyePos().distanceTo(entityHitResult.getPos()) > d + 1.0E-4) {
            return false;
        }
        if (this.IIlIIl(minecraftClient, livingEntity)) {
            return false;
        }
        if (entityHitResult != null && lIIllllI.lllIlI(livingEntity, minecraftClient.player) && !((Boolean)this.Illll.lIl()).booleanValue() && this.IIII(minecraftClient, livingEntity)) {
            return false;
        }
        if (!this.IIIIlI(minecraftClient, livingEntity)) {
            return false;
        }
        if (minecraftClient.player.isUsingItem() || minecraftClient.player.isBlocking()) {
            return false;
        }
        if (entityHitResult == null) {
            return false;
        }
        if (this.IIIIII(minecraftClient, livingEntity)) {
            return false;
        }
        if (this.lllI(minecraftClient, livingEntity)) {
            this.llIll();
            return true;
        }
        lIIllllI.IllllII(true);
        try {
            if (!lIIllllI.IIlllll(minecraftClient, entityHitResult)) {
                boolean bl = false;
                return bl;
            }
        }
        finally {
            lIIllllI.IllllII(false);
        }
        this.llIll();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlIll(int n, short s, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x5ED0;
        char[] cArray = I[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llIlI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            KillAura.llIlI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3CDE;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 41702;
            n7 ^= 0xDA4E;
            n7 += 1424;
            n7 -= 15866;
            n7 ^= 0xF90A;
            n7 += 48175;
            n7 -= 23541;
            n7 -= 63429;
            n7 -= 12624;
            cArray[n6] = (char)((n7 ^= 0xCC8) ^ n4 ^ s ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

