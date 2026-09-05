/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllIIl
 * Module         : PotAssist  [COMBAT]
 * Description    : Automatically throws safe splash potions when looking down.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Auto rotate down
 *   - Splash only self
 *   - Potion whitelist
 *   - Trigger Pitch
 *   - Reapply Under
 *   - Switch Delay
 *   - Action Delay
 *   - Rotate mode
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
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.PotionContentsComponent
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffectCategory
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction$Axis
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.BlockView
 */
package orchard.module.combat;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIIlllll;
import orchard.internal.IIlI;
import orchard.internal.IIllIl;
import orchard.internal.IlIlIIlII;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlIlIII;
import orchard.internal.IlIlllI;
import orchard.internal.IlllIll;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIlII;
import orchard.internal.llIlIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class PotAssist
extends ModuleBase {
    private long I;
    private float l;
    private static final double II = 0.05;
    private boolean Il;
    private static final IIIlIIIII lI;
    private ItemStack ll;
    private static final IIIlIIIII III;
    private static final IIIlIIIII IIl;
    private boolean IlI;
    private final List<ItemStack> Ill;
    private static final IIIlIIIII lII;
    private int lIl;
    private final llIll llI;
    private int lll;
    private long IIII;
    private static final List<IlllIll> IIIl;
    private static final float IIlI = 0.5f;
    private final IIIlIlIIl IIll;
    private final llIll IlII;
    private long IlIl;
    private static final long IllI = 1400L;
    private final lIlIIlI Illl;
    private static final long lIII = 2500L;
    private static final double lIIl = 1.0;
    private final lIlIIlI lIlI;
    private static final double lIll = 0.5;
    private static final long llII = 1000L;
    private int llIl;
    private static final IIIlIIIII lllI;
    private int llll;
    private static final IIIlIIIII IIIII;
    private IlIlIIlII IIIIl;
    private final llIll IIIlI;
    private final llIlIlI IIIll;
    private static final IIIlIIIII IIlII;
    private static final IIIlIIIII IIlIl;
    private final llIll IIllI;
    private final lIlIIlI IIlll;
    private float IlIII;
    private static final long IlIIl = 700L;
    private long IlIlI;
    private static final long IlIll = 700L;
    private final IIIIIIIIl<IIIlllll> IllII;
    private int IllIl;
    private static final IIIlIIIII IlllI;
    private static final int Illll = 40;
    private int lIIII;
    private long lIIIl;
    private Vec3d lIIlI;
    private static final IIIlIIIII lIIll;
    private static final long lIlII = 250L;
    private long lIlIl;
    private long lIllI;
    private static final IIIlIIIII lIlll;
    private final lIlIIlI llIII;
    private float llIIl;
    private static final IIIlIIIII llIlI;
    private static final long llIll = 2000L;
    private final IlIlIlI lllII;
    private static final double lllIl = 1.0E-4;
    private static final long llllI = 500L;
    private static final IIIlIIIII lllll;
    private static final int IIIIII = 9;
    private final IIIlIlIIl IIIIIl;
    private final IlIlIlIII IIIIlI;
    private final llIll IIIIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Auto rotate down"), false));
    private long IIIlII;
    private static final IIIlIIIII IIIlIl;
    private static final int[] IIIllI;
    private static final String[] IIIlll;
    private static final Object[] IIlIII;

    /*
     * Enabled aggressive block sorting
     */
    private void lI(MinecraftClient minecraftClient, int n, long l2) {
        if (this.lIIII != n) {
            boolean bl = lIIllllI.llIllI(minecraftClient) != n;
            this.IlIl = l2 + (!bl ? 0L : this.IIl(this.IIll));
            this.lIIII = n;
        }
        this.lllIl(minecraftClient, n);
    }

    private long IIl(IIIlIlIIl iIIlIlIIl) {
        double d = iIIlIlIIl.IIIl();
        double d2 = iIIlIlIIl.IIII();
        if (d != d2) {
            return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d, d2)));
        }
        return Math.max(0L, Math.round(d));
    }

    /*
     * Unable to fully structure code
     */
    private double IlI(MinecraftClient var1_1, LivingEntity var2_2) {
        block31: {
            block25: {
                block27: {
                    block32: {
                        block26: {
                            block29: {
                                block30: {
                                    block22: {
                                        block20: {
                                            block24: {
                                                block28: {
                                                    block23: {
                                                        block21: {
                                                            block19: {
                                                                if (var1_1.world == null) break block27;
                                                                break block28;
lbl3:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
lbl5:
                                                                // 2 sources

                                                                while (true) {
                                                                    if (var26_18 >= var25_17) break block19;
                                                                    break block20;
                                                                    break;
                                                                }
lbl8:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
lbl10:
                                                                // 1 sources

                                                                while (true) {
                                                                    var12_8 = Math.max(var3_3.maxZ - 0.05, (var3_3.minZ + var3_3.maxZ) * 0.5);
                                                                    break block21;
                                                                    break;
                                                                }
lbl13:
                                                                // 1 sources

                                                                while (true) {
                                                                    var29_20 = var19_12;
                                                                    var30_21 = var29_20.length;
                                                                    var31_22 = 0;
                                                                    break block22;
                                                                    break;
                                                                }
lbl18:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
lbl20:
                                                                // 1 sources

                                                                while (true) {
                                                                    var24_16 = var18_11;
                                                                    var25_17 = var24_16.length;
                                                                    var26_18 = 0;
                                                                    ** GOTO lbl5
                                                                    break;
                                                                }
lbl25:
                                                                // 1 sources

                                                                while (true) {
                                                                    var22_15 = Infinity;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl28:
                                                                // 1 sources

                                                                while (true) {
                                                                    var34_24 = var20_13;
                                                                    break block23;
                                                                    break;
                                                                }
lbl31:
                                                                // 1 sources

                                                                while (true) {
                                                                    var32_23 = var29_20[var31_22];
                                                                    ** continue;
                                                                    break;
                                                                }
lbl34:
                                                                // 1 sources

                                                                while (var22_15 < 1.0) {
                                                                    break block24;
                                                                }
                                                                break block25;
lbl37:
                                                                // 1 sources

                                                                while (true) {
                                                                    var21_14 = Math.max(var1_1.world.getBottomY(), (int)Math.floor(var4_4 - 1.0 - 1.0));
                                                                    ** continue;
                                                                    break;
                                                                }
                                                            }
                                                            return var22_15;
                                                            var4_4 = var3_3.minY;
                                                            break block29;
lbl44:
                                                            // 1 sources

                                                            while (true) {
                                                                ++var26_18;
                                                                ** continue;
                                                                break;
                                                            }
                                                        }
                                                        var14_9 = (var3_3.minX + var3_3.maxX) * 0.5;
                                                        break block30;
lbl50:
                                                        // 1 sources

                                                        while (var36_26.isAir()) {
                                                            break block25;
                                                        }
                                                        break block31;
                                                        while (true) {
                                                            ++var31_22;
                                                            break block22;
                                                            break;
                                                        }
lbl56:
                                                        // 1 sources

                                                        while (true) {
                                                            var3_3 = var2_2.getBoundingBox();
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
lbl60:
                                                    // 2 sources

                                                    while (true) {
                                                        if (var34_24 < var21_14) ** continue;
                                                        break block26;
                                                        break;
                                                    }
                                                }
                                                ** while (var2_2 != null)
lbl65:
                                                // 1 sources

                                                break block27;
lbl66:
                                                // 1 sources

                                                while (true) {
                                                    if (!var37_27.isEmpty()) {
                                                        var38_28 = (double)var35_25.getY() + var37_27.getMax(Direction.Axis.Y);
                                                        ** continue;
                                                    }
                                                    break block25;
                                                    break;
                                                }
                                            }
                                            return var22_15;
                                        }
                                        var27_19 = var24_16[var26_18];
                                        ** while (true)
                                        var40_29 = Math.max(0.0, var4_4 - var38_28);
                                        var22_15 = Math.min(var22_15, var40_29);
                                        ** GOTO lbl34
                                    }
                                    ** while (var31_22 >= var30_21)
lbl81:
                                    // 1 sources

                                    ** while (true)
                                }
                                var16_10 = (var3_3.minZ + var3_3.maxZ) * 0.5;
                                var18_11 = new double[]{var6_5, var14_9, var8_6};
                                ** while (true)
                            }
                            var6_5 = Math.min(var3_3.minX + 0.05, (var3_3.minX + var3_3.maxX) * 0.5);
                            break block32;
                        }
                        var35_25 = BlockPos.ofFloored((double)var27_19, (double)var34_24, (double)var32_23);
                        var36_26 = var1_1.world.getBlockState(var35_25);
                        ** GOTO lbl50
                    }
                    var8_6 = Math.max(var3_3.maxX - 0.05, (var3_3.minX + var3_3.maxX) * 0.5);
                    var10_7 = Math.min(var3_3.minZ + 0.05, (var3_3.minZ + var3_3.maxZ) * 0.5);
                    ** while (true)
                }
                return Infinity;
            }
            --var34_24;
            ** while (true)
            var19_12 = new double[]{var10_7, var16_10, var12_8};
            var20_13 = (int)Math.floor(var4_4 - 1.0E-4);
            ** while (true)
        }
        var37_27 = var36_26.getCollisionShape((BlockView)var1_1.world, var35_25);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        this.lIIlI();
        this.Illl();
        this.IlIlI = 0L;
        this.IlIl = 0L;
        this.lIIIl = 0L;
        this.lllII.IlIIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) {
            return false;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (clientPlayerEntity.isOnGround()) {
            return true;
        }
        if (!(clientPlayerEntity.getVelocity().y < 0.0)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIl(RegistryEntry<StatusEffect> registryEntry, StatusEffectInstance statusEffectInstance) {
        IIIlIIIII iIIlIIIII = this.IIIlI(registryEntry, statusEffectInstance);
        if (iIIlIIIII == null) return false;
        if (!this.IIIll.IIl(iIIlIIIII)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll(long l2) {
        if (this.lIllI == 0L) return true;
        if (this.lIIIl <= 0L) return true;
        if (l2 - this.lIIIl >= 700L) return true;
        return false;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private llIlII IIII(ClientPlayerEntity clientPlayerEntity, long l2, boolean bl) {
        llIlII llIlII2 = null;
        int n = 0;
        boolean bl2 = true;
        while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                ++n;
            }
            if (n >= 9) {
                return llIlII2;
            }
            ItemStack itemStack = clientPlayerEntity.getInventory().getStack(n);
            llIlII llIlII3 = this.IlllI(clientPlayerEntity, itemStack, n, l2, bl);
            if (llIlII3 == null || llIlII3.I() <= 0 || llIlII3.Il() <= 0.0f && this.llIlI(llIlII3.l()) || llIlII2 != null && llIlII3.I() <= llIlII2.I()) continue;
            llIlII2 = llIlII3;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlI(MinecraftClient minecraftClient) {
        if (!this.llllI(minecraftClient)) {
            return false;
        }
        if (!this.IlI) {
            this.IlIII = minecraftClient.player.getPitch();
        }
        this.IlI = true;
        minecraftClient.player.setPitch(90.0f);
        lIIllllI.IIIlIlI(minecraftClient);
        ActionResult actionResult = lIIllllI.llllll(minecraftClient, Hand.MAIN_HAND);
        boolean bl = actionResult != null && actionResult.isAccepted();
        if (!bl) return bl;
        this.IllI(minecraftClient);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(ItemStack itemStack) {
        StatusEffectInstance statusEffectInstance;
        StatusEffect statusEffect;
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (!itemStack.isOf(Items.SPLASH_POTION)) return false;
        PotionContentsComponent potionContentsComponent = (PotionContentsComponent)itemStack.get(DataComponentTypes.POTION_CONTENTS);
        if (potionContentsComponent == null) return false;
        if (!potionContentsComponent.hasEffects()) return false;
        Iterator iterator = potionContentsComponent.getEffects().iterator();
        do {
            if (!iterator.hasNext()) return true;
        } while ((statusEffect = (StatusEffect)(statusEffectInstance = (StatusEffectInstance)iterator.next()).getEffectType().value()).getCategory() != StatusEffectCategory.HARMFUL);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.options == null) return;
        if (minecraftClient.options.useKey == null) {
            return;
        }
        lIIllllI.llIlIl(minecraftClient.options.useKey);
        minecraftClient.options.useKey.setPressed(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void Illl() {
        this.lIllI = 0L;
        this.llIIl = 0.0f;
        this.lIlIl = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIII(MinecraftClient minecraftClient, long l2) {
        boolean bl;
        block5: {
            block6: {
                block7: {
                    block3: {
                        block4: {
                            block2: {
                                block1: {
                                    if (this.Il && !((Boolean)this.IIIIll.lIl()).booleanValue()) break block1;
                                    if (!this.Il) break block2;
                                    if (this.IllII.lIl() != IIIlllll.Il) break block3;
                                    break block4;
                                }
                                this.lIIlI();
                                return;
                            }
                            bl = this.llIl(minecraftClient);
                            break block5;
                        }
                        if (this.IIIIl == IlIlIIlII.ll) break block6;
                        break block7;
                    }
                    boolean bl2 = this.lIlI(minecraftClient);
                    if (!bl2) {
                        this.lIlIl(minecraftClient);
                        return;
                    }
                    this.IllI(minecraftClient);
                    this.IIIIl = IlIlIIlII.I;
                    this.IIIlII = l2;
                    this.llIl = minecraftClient.player.age + 1;
                    return;
                }
                ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
                this.lIIlI = clientPlayerEntity.getEyePos().add(0.0, -2.0, 0.0);
                this.IIII = l2;
                this.lIl = 0;
                this.IIIIl = IlIlIIlII.ll;
                this.IIIlII = l2;
                return;
            }
            bl = this.IIlI(minecraftClient);
        }
        this.llIII(minecraftClient, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float lIIl(ClientPlayerEntity clientPlayerEntity, long l2) {
        if (l2 <= this.lIllI) {
            return Math.max(clientPlayerEntity.getHealth(), this.llIIl);
        }
        this.lIllI = 0L;
        this.llIIl = 0.0f;
        return clientPlayerEntity.getHealth();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlI(MinecraftClient minecraftClient) {
        if (!this.llllI(minecraftClient)) {
            return false;
        }
        float f = this.IIlII(minecraftClient);
        float f2 = this.lIll(minecraftClient);
        long l2 = ++this.I;
        return IlIlllI.IlIII(minecraftClient, 300, f, f2, () -> {
            ActionResult actionResult;
            if (this.IIIIl != IlIlIIlII.I) return false;
            if (l2 == this.I) {
                lIIllllI.IIIlIlI(minecraftClient);
                actionResult = lIIllllI.llllll(minecraftClient, Hand.MAIN_HAND);
            }
            return false;
            boolean bl = actionResult != null && actionResult.isAccepted();
            this.llIII(minecraftClient, bl);
            return bl;
        });
    }

    private float lIll(MinecraftClient minecraftClient) {
        return 90.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIl(MinecraftClient minecraftClient) {
        if (!this.llllI(minecraftClient)) {
            return false;
        }
        lIIllllI.IIIlIlI(minecraftClient);
        ActionResult actionResult = lIIllllI.llllll(minecraftClient, Hand.MAIN_HAND);
        boolean bl = actionResult != null && actionResult.isAccepted();
        if (!bl) return bl;
        this.IllI(minecraftClient);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIII(MinecraftClient minecraftClient, long l2) {
        block9: {
            block12: {
                block13: {
                    block10: {
                        block11: {
                            block8: {
                                if (this.IIIIl != IlIlIIlII.lI) break block8;
                                if (this.llll < 0) break block9;
                                break block10;
                            }
                            if (this.IIIIl != IlIlIIlII.ll) break block11;
                            if (l2 - this.IIII >= 2000L) {
                                this.lIII(minecraftClient, l2);
                                return;
                            }
                            if (this.lIIlI == null) {
                                this.lIII(minecraftClient, l2);
                                return;
                            }
                            float f = this.lllII.IllII(minecraftClient, this.lIIlI, ((Double)this.llIII.lIl()).floatValue());
                            ++this.lIl;
                            if (f <= 0.5f) break block12;
                            break block13;
                        }
                        if (this.IIIIl == IlIlIIlII.I) {
                            if (minecraftClient.player.age < this.llIl) return;
                            ++this.I;
                            this.lIlII(minecraftClient);
                            return;
                        }
                        if (this.IIIIl != IlIlIIlII.l) return;
                        if (minecraftClient.player.age < this.lll) return;
                        if (this.lllII(minecraftClient, l2)) return;
                        this.lIlIl(minecraftClient);
                        return;
                    }
                    if (this.llll < 9 && l2 - this.IIIlII <= 500L) {
                        if (lIIllllI.lllI(minecraftClient.player.getInventory()) != this.llll) {
                            this.lllIl(minecraftClient, this.llll);
                            return;
                        }
                        if (l2 < this.IlIl) {
                            return;
                        }
                        if (((Boolean)this.IIIIll.lIl()).booleanValue() && !this.lII(minecraftClient)) return;
                        this.lIII(minecraftClient, l2);
                        return;
                    }
                    break block9;
                }
                if (this.lIl < 40) return;
            }
            this.lIII(minecraftClient, l2);
            return;
        }
        this.lIIlI();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        IlllIll illlIll;
        IlllIll illlIll2;
        IlllIll illlIll3;
        IlllIll illlIll4;
        IlllIll illlIll5;
        IlllIll illlIll6;
        IlllIll illlIll7;
        int n = 30378;
        String string = "\uf505\uf5f7\uf5ce\uf562\uf5c7\uf524\uf50d\uf595\u65cc\u653e\u6507\u65ab\u650e\u65ed\u65c5\u650e\u652c\u65c0\u65fb\u650e\u09db\u0929\u0900\u09a9\u0919\u09fa\u0987\u0927\u0928\u09f2\u0980\u0919\u6929\u69db\u69f2\u695b\u69eb\u6908\u6975\u69d5\u69da\u6900\u6970\u69b9\u6968\u6913\u69f5\u696a\ue402\ue4b3\ue4ad\ue477\ue4c7\ue425\ue467\ue4ee\ue4f2\ue43f\ue424\ue49f\ue454\ue46c\ue490\ue422\ue46a\ue476\ue4ad\ue490\u53f1\u5347\u532e\u5390\u5333\u53d0\u53ad\u530f\u5301\u53f2\u53c9\u534a\u53a6\u53f6\u5352\u53d7\ue8b9\ue80f\ue866\ue8d8\ue87b\ue898\ue8e5\ue847\ue849\ue8ba\ue881\ue802\ue8ee\ue8be\ue81a\ue89f\ue8da\ue8e7\ue810\ue873\u7614\u769d\u76ce\u7672\u76d4\u7620\u766b\u76e6\u76e6\u760d\u7626\u76d3\uc099\uc010\uc043\uc0ff\uc059\uc0ad\uc0e6\uc06b\uc06b\uc08e\uc0c6\uc025\u3cd2\u3c22\u3c1e\u3ca5\u3c13\u3cf3\u3c9d\u3c13\u3c25\u3cdd\u3ced\u3c7d\u3c84\u3cd5\u3c44\u3cfd\u3cbd\u3cb2\u3c0e\u3c7c\u148c\u143f\u1421\u14e8\u144a\u14bb\u1480\u144b\u147a\u148a\u14d4\u1433\u14de\u148e\u142a\u14af\ua7ea\ua774\ua701\ua79e\ua72b\ua7ca\ua7a0\ua720\ua71c\ua7eb\ua7b5\ua775\ua7bf\ua7ec\ua77d\ua7d7\u6e40\u6eb3\u6eb1\u6e17\u6e86\u6e4a\u6e22\u6ebf\u6eb4\u6e79\u6e09\u6edd\u6e17\u6e47\u6ee7\u6e5b\ub313\ub399\ub3c9\ub37b\ub3d5\ub312\ub313\ub386\ue359\ue3b3\ue38a\ue326\ue383\ue360\ue349\ue3d1\uc4fe\uc414\uc42d\uc481\uc424\uc4c7\uc4ee\uc413\uc422\uc4d9\uc4b9\uc424\ubb44\ubbae\ubb87\ubb2e\ubb9e\ubb7d\ubb00\ubba0\ubbaf\ubb75\ubb07\ubb9e\uefac\uef46\uef6f\uefc6\uef76\uef95\uefe8\uef48\uef47\uef9d\uefea\uef13\uefeb\uef8b\uef0c\ueff7\ubb87\ubb2e\ubb30\ubbea\ubb5a\ubbbd\ubbcc\ubb59\ubb6f\ubba2\ubbb9\ubb02\ubbc9\ubbf1\ubb0d\ubbbf\ubbf7\ubbeb\ubb30\ubb0d\ufe63\ufecd\ufea4\ufe1a\ufeb9\ufe5a\ufe27\ufe85\ufe8b\ufe78\ufe43\ufec0\ufe2c\ufe7c\ufed8\ufe5d\u8628\u8686\u86ef\u8651\u86f2\u8611\u866c\u86ce\u86c0\u8633\u8608\u868b\u8667\u8637\u8693\u8616\u864a\u8608\u86ae\u86f4\u5144\u51d5\u5186\u513a\u519c\u5168\u5123\u51ae\u51ae\u5145\u516e\u519b\u6eb5\u6e24\u6e77\u6ecb\u6e6d\u6e99\u6ed2\u6e5f\u6e5f\u6ef2\u6edb\u6e7c\u6ef7\u6ea4\u6e74\u6eeb\u5996\u597e\u5942\u59f9\u594f\u59af\u59c6\u5978\u594f\u5981\u59b1\u5921\u59d8\u5989\u5918\u59a1\u59e1\u59ee\u5952\u5920\u9e31\u9e9a\u9e84\u9e4d\u9eef\u9e1e\u9e24\u9ed9\u9ed7\u9e2f\u9e71\u9e96\u9e7b\u9e2b\u9e8f\u9e0a\u0e6a\u0eec\u0e99\u0e06\u0eb3\u0e52\u0e38\u0eb8\u0e84\u0e73\u0e2d\u0eed\u0e27\u0e74\u0ee5\u0e4f\u97d5\u973e\u973c\u979a\u970b\u978f\u9799\u9718\u9739\u97f4\u9784\u9750\u979a\u97ca\u976a\u97d6\ue271\ue2e3\ue2b3\ue201\ue2af\ue268\ue269\ue2fc\u412f\u41bb\u41da\u4143\u41ee\u4115\u417f\u41df\u41c1\u410d\u4116\u418c\u4c70\u4cf3\u4cb3\u4c18\u4ca8\u4c67\u4c06\u4c96\u4c9f\u4c45\u4c31\u4cc6\u4c39\u4c6b\u4cc3\u4c44\u4c04\u4c0b\u4cd0\u4cd0\u4c3b\u4c3d\u4c7c\u4c6f\u4c15\u4ce6\u4c26\u4c2a\u4c64\u4c1b\u4cd9\u4c06\u4c6e\u4cc1\u4c9c\u4c14\u4c90\u4c4e\u4c04\u4c92\u4cb7\u4c5d\u4c04\u4cca\u4c12\u4c77\u4cf8\u4c5b\u4c07\u4c3d\u4ce8\u4cfe\u4c13\u4c6b\u4c6e\u4c6b\u4c28\u4ce3\u4c68\u4c32\u4c5d\u4c64\u4cd7\u4c35\u4c69\u4c9f\u4ccc\u4c3d\u4ca8\u4c77\u4c60\u4c99\u4c9b\u4c45\u4c29\u4cd2\u4c38\u4c45\u4cc8\u4c2f\u6975\u69f6\u69b6\u691d\u69ad\u692b\u693d\u6982\u6990\u6975\u690a\u69c1\u6937\u697e\u69e7\u694d\u6904\u6947\u69ff\u69d4\u6939\u6916\u6935\u6935\ud2b8\ud216\ud24d\ud2d4\ud261\ud282\ud2a9\ud25e\ud244\ud289\ud2ed\ud206\ud2f2\ud2b7\ud22e\ud2e3\u67c5\u6751\u671d\u678f\u671c\u67d5\u67d3\u6720\u672e\u67d9\u67ad\u674f\u6789\u67da\u674b\u67c1\u67b2\u67be\u670f\u6714\u29f8\u2973\u2920\u299e\uf329\uf3c3\uf3e6\uf360\uf3f7\uf300\uf379\uf3fa\uf3d5\uf31e\uf352\uf39d\uf365\uf326\uf3e5\uf30e\uadd5\uad4f\uad2a\uadd8\u93e1\u9361\u9300\u9389\u933e\u93dc\u939f\u930a\u9319\u93d2\u939e\u9351\u93a9\u93ea\u9329\u93c2\uaa6f\uaaf5\uaa90\uaa62\u0e01\u0eaf\u0ec6\u0e7a\u0edc\u0e2b\u0e4d\u0ed6\u0eeb\u0e24\u0e6a\u0e8f\u0e4d\u0e34\u0e8c\u0e04\u0e7f\u0e5f\u0ec8\u0ed3\uc943\uc9f2\uc9e7\uc94b\ubebf\ube3b\ube59\ubec3\ube38\ube93\ubeda\ube5a\ube50\ube9d\ubeed\ube3e\ubef0\ube89\ube22\ubee7\u497b\u49ed\u49be\u4902\u49a5\u4954\u4935\u49e3\u4996\u4958\u4959\u49fc\u493f\u4976\u49e3\u4922\u27ae\u2739\u277c\u27bc\u13d5\u1338\u1309\u139d\u130c\u13eb\u1396\u1333\u132e\u13e5\u138f\u136f\u139e\u13de\u1372\u1389\u3306\u33ec\u33d5\u3372\u33df\u333c\u3356\u33d5\u33fa\u3337\u335b\u33bb\u334a\u330a\u33a6\u333a\u3378\u3347\u3390\u33ba\u3348\u3361\u3342\u3342\ube56\ubec2\ubea3\ube3a\ube8d\ube6f\ube2c\ubeb9\ubeaa\ube64\ube31\ubed7\ube19\ube4a\ubedb\ube53\ube21\ube60\ubed0\ubef7\ube1c\ube17\ube12\ube12\u5d3e\u5dd4\u5df1\u5d77\u5de0\u5d17\u5d6e\u5ded\u5dc2\u5d09\u5d1a\u5d8e\u5d73\u5d4e\u5d96\u5d65\uf59b\uf571\uf558\uf5f1\uf541\uf5a2\uf5df\uf57f\uf570\uf5aa\uf5d8\uf541\u6beb\u6b7c\u6b11\u6b82\u6b34\u6bf4\u6bfc\u6b05\u6b35\u6bd9\u6b97\u6b6d\u6ba5\u6bf4\u6b48\u6bb3\ud8a8\ud83f\ud852\ud8c1\ud877\ud8b7\ud8bf\ud846\ud876\ud89a\ud8d4\ud82e\ud8e6\ud8b7\ud80b\ud8f0";
        char[] cArray = "\u76a2\u76a6\u76a6\u76ba\u76be\u76ba\u76be\u76a6\u76a6\u76be\u76ba\u76ba\u76ba\u76a2\u76a2\u76a6\u76a6\u76ba\u76be\u76ba\u76be\u76a6\u76ba\u76be\u76ba\u76ba\u76ba\u76a2\u76a6\u76fa\u76b2\u76ba\u76be\u76ae\u76ba\u76ae\u76ba\u76ae\u76be\u76ae\u76ba\u76ba\u76ae\u76ba\u76b2\u76b2\u76ba\u76a6\u76ba\u76ba".toCharArray();
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
        IIIlll = stringArray;
        IIlIII = new Object[stringArray.length];
        int n6 = 1870948858;
        byte[] byArray = "2q\u00da5\u00d9u=p\u00a1\u0007l\u00a6=\u001a\u00b7\u00e54i/#\u00b2\u00e3Fr\u00ad\u0016\u00ee\u00e6\u00fa\u00a8\noE\u000e\u00f4r\u0019\t\u008a\u00d3\u00a9\u001d\u0081\u0082\u00dd\u0080\u0088\u00a5\u00c6_a\u001a\u00c7\u00dbT\u001f\u00ee\u0098\u0098\u009b\u00fa\u00ef\u0007v\u00f5\u0093\u00fb\u009d\u00df\u00be\u008a\u00c8B[\u00dfF\u00e5\u00b7\u00f2'l\u0089TR\u00c5}\u00f74".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IIIllI = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            PotAssist.IIIllI[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        IIlIl = StringFactory.IIII("speed");
        lIlll = StringFactory.IIII("speed_2");
        IIIII = StringFactory.IIII("strength");
        III = StringFactory.IIII("strength_2");
        lllll = StringFactory.IIII("fire_resistance");
        IIl = StringFactory.IIII("regeneration");
        lllI = StringFactory.IIII("regeneration_2");
        lI = StringFactory.IIII("leaping");
        IIlII = StringFactory.IIII("leaping_2");
        lIIll = StringFactory.IIII("water_breathing");
        IIIlIl = StringFactory.IIII("night_vision");
        IlllI = StringFactory.IIII("invisibility");
        lII = StringFactory.IIII("slow_falling");
        llIlI = StringFactory.IIII("luck");
        IlllIll[] illlIllArray = new IlllIll[14];
        illlIllArray[0] = new IlllIll(IIlIl, (Object)StringFactory.IIII("Speed"));
        illlIllArray[1] = new IlllIll(lIlll, (Object)StringFactory.IIII("q4RRmR0XeTU="));
        illlIll7(IIIII, (Object)StringFactory.IIII("q4BGmRdQRBQ="));
        illlIllArray[2] = illlIll7;
        illlIllArray[3] = new IlllIll(III, (Object)StringFactory.IIII("q4BGmRdQRBTXIbY="));
        illlIll6(lllll, (Object)StringFactory.IIII("vp1GmVllVQ+eG4tYAdDb"));
        illlIllArray[4] = illlIll6;
        illlIllArray[5] = new IlllIll(IIl, (Object)StringFactory.IIII("qpFTmRdSQh2DAZBX"));
        illlIll5(lllI, (Object)StringFactory.IIII("qpFTmRdSQh2DAZBXT/r3"));
        illlIllArray[6] = illlIll5;
        illlIllArray[7] = new IlllIll(lI, (Object)StringFactory.IIII("tJFVjBBZVw=="));
        illlIll4(IIlII, (Object)StringFactory.IIII("tJFVjBBZV1y+IQ=="));
        illlIllArray[8] = illlIll4;
        illlIll3(lIIll, (Object)StringFactory.IIII("r5VAmQsXcg6SCYtRBt3Z"));
        illlIllArray[9] = illlIll3;
        illlIllArray[10] = new IlllIll(IIIlIl, (Object)StringFactory.IIII("tp1TlA0XZhWEAZBX"));
        illlIll2(IlllI, (Object)StringFactory.IIII("sZpClQpeUhWbAYtA"));
        illlIllArray[11] = illlIll2;
        illlIll(lII, (Object)StringFactory.IIII("q5hbi1lxURCbAZFe"));
        illlIllArray[12] = illlIll;
        illlIllArray[13] = new IlllIll(llIlI, (Object)StringFactory.IIII("tIFXlw=="));
        IIIl = List.of(illlIllArray);
    }

    private boolean IIIIl(MinecraftClient minecraftClient) {
        BlockHitResult blockHitResult;
        HitResult hitResult = minecraftClient.crosshairTarget;
        return hitResult instanceof BlockHitResult && (blockHitResult = (BlockHitResult)hitResult).getType() == HitResult.Type.BLOCK;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIIlIIIII IIIlI(RegistryEntry<StatusEffect> registryEntry, StatusEffectInstance statusEffectInstance) {
        IIIlIIIII iIIlIIIII;
        block16: {
            block18: {
                IIIlIIIII iIIlIIIII2;
                block17: {
                    block13: {
                        IIIlIIIII iIIlIIIII3;
                        int n;
                        block14: {
                            block15: {
                                n = statusEffectInstance.getAmplifier();
                                if (registryEntry.equals((Object)StatusEffects.SPEED)) break block14;
                                if (!registryEntry.equals((Object)StatusEffects.STRENGTH)) break block15;
                                if (n < 1) {
                                    iIIlIIIII = IIIII;
                                    return iIIlIIIII;
                                }
                                break block16;
                            }
                            if (registryEntry.equals((Object)StatusEffects.FIRE_RESISTANCE)) {
                                return lllll;
                            }
                            if (registryEntry.equals((Object)StatusEffects.REGENERATION)) {
                                if (n >= 1) {
                                    iIIlIIIII2 = lllI;
                                    return iIIlIIIII2;
                                }
                                break block17;
                            } else if (!registryEntry.equals((Object)StatusEffects.JUMP_BOOST)) {
                                if (registryEntry.equals((Object)StatusEffects.WATER_BREATHING)) {
                                    return lIIll;
                                }
                                break block13;
                            } else {
                                IIIlIIIII iIIlIIIII4;
                                if (n >= 1) {
                                    iIIlIIIII4 = IIlII;
                                    return iIIlIIIII4;
                                }
                                iIIlIIIII4 = lI;
                                return iIIlIIIII4;
                            }
                        }
                        if (n < 1) {
                            iIIlIIIII3 = IIlIl;
                            return iIIlIIIII3;
                        }
                        iIIlIIIII3 = lIlll;
                        return iIIlIIIII3;
                    }
                    if (registryEntry.equals((Object)StatusEffects.NIGHT_VISION)) {
                        return IIIlIl;
                    }
                    break block18;
                }
                iIIlIIIII2 = IIl;
                return iIIlIIIII2;
            }
            if (registryEntry.equals((Object)StatusEffects.INVISIBILITY)) {
                return IlllI;
            }
            if (!registryEntry.equals((Object)StatusEffects.SLOW_FALLING)) {
                if (!registryEntry.equals((Object)StatusEffects.LUCK)) return null;
                return llIlI;
            }
            return lII;
        }
        iIIlIIIII = III;
        return iIIlIIIII;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIIll(MinecraftClient minecraftClient, long l2) {
        LivingEntity livingEntity = this.lIllI(minecraftClient, l2);
        if (livingEntity == null) return true;
        if (!(this.IlI(minecraftClient, livingEntity) < 1.0)) return false;
        return true;
    }

    private float IIlII(MinecraftClient minecraftClient) {
        return minecraftClient.player.getYaw();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIl(ClientPlayerEntity clientPlayerEntity, long l2) {
        if (clientPlayerEntity.getHealth() >= clientPlayerEntity.getMaxHealth() - 0.25f) {
            this.Illl();
            return;
        }
        if (this.lIIIl > 0L && l2 - this.lIIIl >= 700L && (double)clientPlayerEntity.getHealth() <= (Double)this.IIlll.lIl() && (double)this.llIIl <= (Double)this.IIlll.lIl()) {
            this.lIllI = 0L;
            this.llIIl = 0.0f;
            return;
        }
        if (l2 <= this.lIllI) return;
        this.lIllI = 0L;
        this.llIIl = 0.0f;
    }

    public PotAssist() {
        this(null);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIllI(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) return false;
        if (!(this.llIIl < clientPlayerEntity.getMaxHealth() - 0.25f)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIlll() {
        if (!this.IIIlIIl()) {
            return false;
        }
        if (this.IIIIl != IlIlIIlII.Il) {
            return true;
        }
        if (this.lIIIl <= 0L) return false;
        if (System.currentTimeMillis() - this.lIIIl >= 250L) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IlIII() {
        if (!this.IIIlIIl()) return false;
        if (this.IIIIl == IlIlIIlII.Il) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private float IlIIl(StatusEffectInstance statusEffectInstance) {
        if (!statusEffectInstance.getEffectType().equals((Object)StatusEffects.INSTANT_HEALTH)) {
            return 0.0f;
        }
        if (statusEffectInstance.getAmplifier() < 1) return 3.0f;
        return 7.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (this.llllI(minecraftClient)) {
            if (orchard.internal.IIlI.IIl(minecraftClient)) {
                this.lIIlI();
                return;
            }
            long l2 = System.currentTimeMillis();
            this.IIlIl(minecraftClient.player, l2);
            if (this.IIIIl != IlIlIIlII.Il) {
                if (!this.IlIll(minecraftClient)) {
                    if (this.IIIIl == IlIlIIlII.Il) return;
                    this.lIIlI();
                    return;
                }
            } else {
                this.llIll(minecraftClient, l2);
                return;
            }
            if (this.IIIIl == IlIlIIlII.Il) return;
            this.IIIII(minecraftClient, l2);
            return;
        }
        this.lIIlI();
        this.Illl();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIll(MinecraftClient minecraftClient) {
        if ((Boolean)this.IlII.lIl() == false) return true;
        if (minecraftClient.player == null) return false;
        if (!minecraftClient.player.isOnGround()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        if (this.IIIIl == IlIlIIlII.Il) {
            return;
        }
        if (!this.llllI(minecraftClient)) {
            this.lIIlI();
            return;
        }
        if (orchard.internal.IIlI.IIl(minecraftClient)) {
            this.lIIlI();
            return;
        }
        if (this.IlIll(minecraftClient)) {
            this.IIIII(minecraftClient, System.currentTimeMillis());
            return;
        }
        this.lIIlI();
    }

    /*
     * Unable to fully structure code
     */
    private boolean IllII(MinecraftClient var1_1, long var2_2) {
        block23: {
            block28: {
                block31: {
                    block29: {
                        block32: {
                            block26: {
                                block25: {
                                    block27: {
                                        block21: {
                                            block30: {
                                                block24: {
                                                    block20: {
                                                        block22: {
                                                            block19: {
                                                                if (!((Boolean)this.IIllI.lIl()).booleanValue()) break block27;
                                                                break block28;
lbl3:
                                                                // 1 sources

                                                                while (var8_5) {
                                                                    break block19;
                                                                }
                                                                break block29;
lbl6:
                                                                // 2 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
lbl8:
                                                                // 2 sources

                                                                return v0;
                                                                while (true) {
                                                                    v1 = false;
                                                                    break block20;
                                                                    break;
                                                                }
lbl13:
                                                                // 1 sources

                                                                while (var7_4) {
                                                                    break block21;
                                                                }
                                                                break block30;
lbl16:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (!((double)var6_3 <= (Double)this.IIlll.lIl())) ** continue;
                                                                    break block22;
                                                                    break;
                                                                }
                                                            }
lbl20:
                                                            // 2 sources

                                                            while (this.lIllI > 0L) {
                                                                break block23;
                                                            }
                                                            break block29;
                                                        }
                                                        v1 = true;
                                                        break block20;
lbl26:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    var7_4 = v1;
                                                    ** GOTO lbl13
lbl31:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var9_6) break block24;
                                                        v0 = false;
                                                        ** GOTO lbl8
                                                        break;
                                                    }
                                                    var9_6 = v2;
                                                    if (var7_4) ** GOTO lbl20
                                                    ** GOTO lbl3
                                                }
                                                while (true) {
                                                    v0 = true;
                                                    ** continue;
                                                    break;
                                                }
lbl42:
                                                // 2 sources

                                                while (true) {
                                                    v2 = false;
                                                    ** GOTO lbl6
                                                    break;
                                                }
lbl45:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl47:
                                                // 1 sources

                                                while (true) {
                                                    var4_8 = var1_1.player.getHealth();
                                                    break block25;
                                                    break;
                                                }
                                            }
lbl51:
                                            // 2 sources

                                            while (var2_2 <= this.lIlIl) {
                                                break block26;
                                            }
                                            break block31;
                                        }
                                        this.lIlIl = var2_2 + 1400L;
                                        ** GOTO lbl51
lbl57:
                                        // 1 sources

                                        return var9_6;
                                        this.Illl();
                                        return false;
                                    }
lbl62:
                                    // 2 sources

                                    return false;
lbl64:
                                    // 1 sources

                                    while (var4_8 >= var5_7 - 0.25f) {
                                        ** continue;
lbl66:
                                        // 1 sources

                                        ** GOTO lbl26
                                    }
                                    break block32;
                                }
                                var5_7 = var1_1.player.getMaxHealth();
                                ** GOTO lbl64
                            }
                            v3 = true;
                            ** GOTO lbl45
lbl74:
                            // 1 sources

                            while (true) {
                                if (!(var6_3 < var5_7 - 0.25f)) ** GOTO lbl42
                                v2 = true;
                                ** continue;
                                break;
                            }
                        }
                        var6_3 = this.lIIl(var1_1.player, var2_2);
                        ** while (true)
                    }
lbl82:
                    // 2 sources

                    while (true) {
                        if (var7_4) ** continue;
                        ** continue;
                        break;
                    }
                }
                v3 = false;
                ** while (true)
            }
            ** while (this.llllI((MinecraftClient)var1_1))
lbl90:
            // 1 sources

            ** while (true)
            var8_5 = v3;
            if (var8_5) ** break;
            ** while (true)
            ** while (true)
        }
        ** while (!((double)var6_3 > ((Double)this.IIlll.lIl()).doubleValue()))
lbl97:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private llIlII IlllI(ClientPlayerEntity var1_1, ItemStack var2_2, int var3_3, long var4_4, boolean var6_5) {
        block37: {
            block51: {
                block42: {
                    block47: {
                        block48: {
                            block45: {
                                block46: {
                                    block41: {
                                        block50: {
                                            block36: {
                                                block33: {
                                                    block39: {
                                                        block35: {
                                                            block43: {
                                                                block34: {
                                                                    block44: {
                                                                        block49: {
                                                                            block40: {
                                                                                block38: {
                                                                                    if (this.IlII(var2_2)) break block45;
                                                                                    break block46;
                                                                                    while (true) {
                                                                                        v0 = null;
                                                                                        break block33;
                                                                                        break;
                                                                                    }
lbl6:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl8:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl10:
                                                                                    // 1 sources

                                                                                    while (!this.lIl((RegistryEntry<StatusEffect>)var14_10, var13_15)) {
                                                                                        break block34;
                                                                                    }
                                                                                    break block47;
lbl13:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (var16_19 != null) break block35;
                                                                                        break block36;
                                                                                        break;
                                                                                    }
lbl16:
                                                                                    // 2 sources

                                                                                    return v1;
lbl18:
                                                                                    // 1 sources

                                                                                    while (var15_17.getCategory() != StatusEffectCategory.BENEFICIAL) {
                                                                                        break block34;
                                                                                    }
                                                                                    break block48;
lbl21:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        v0 = new llIlII(var3_3, var8_6, 0.0f, var2_2.copy());
                                                                                        break block33;
                                                                                        break;
                                                                                    }
lbl24:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var8_6 += 90 + (var13_15.getAmplifier() - var16_19.getAmplifier()) * 8;
                                                                                        break block34;
                                                                                        break;
                                                                                    }
lbl27:
                                                                                    // 1 sources

                                                                                    while (var12_8 < var1_1.getMaxHealth() - 0.25f) {
                                                                                        break block37;
                                                                                    }
                                                                                    break block49;
lbl30:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        if (var8_6 <= 0) break block38;
                                                                                        break block39;
                                                                                        break;
                                                                                    }
lbl33:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        v1 = new llIlII(var3_3, var8_6, var10_7, var2_2.copy());
                                                                                        ** GOTO lbl16
                                                                                        break;
                                                                                    }
lbl36:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (var8_6 <= 0) ** continue;
                                                                                        ** continue;
                                                                                        break;
                                                                                    }
lbl39:
                                                                                    // 1 sources

                                                                                    while (var15_17.getCategory() == StatusEffectCategory.HARMFUL) {
                                                                                        break block40;
                                                                                    }
                                                                                    ** GOTO lbl18
lbl42:
                                                                                    // 1 sources

                                                                                    while (var16_19.getDuration() <= var11_14) {
                                                                                        break block41;
                                                                                    }
                                                                                    break block34;
lbl45:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        if (var8_6 <= 0) break block42;
                                                                                        ** continue;
                                                                                        break;
                                                                                    }
lbl48:
                                                                                    // 1 sources

                                                                                    while ((double)var12_8 <= (Double)this.IIlll.lIl()) {
                                                                                        ** GOTO lbl27
                                                                                    }
                                                                                    break block49;
lbl51:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var11_14 = Math.max(0, (int)Math.round((Double)this.Illl.lIl() * 20.0));
                                                                                        var12_9 = var7_12.getEffects().iterator();
                                                                                        break block34;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                v2 = null;
                                                                                break block50;
                                                                                var14_10 = var13_15.getEffectType();
                                                                                var15_17 = (StatusEffect)var14_10.value();
                                                                                ** GOTO lbl39
lbl61:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (var6_5) ** GOTO lbl6
                                                                                    break block43;
                                                                                    break;
                                                                                }
lbl64:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var12_8 = this.lIIl(var1_1, var4_4);
                                                                                    ** GOTO lbl48
                                                                                    break;
                                                                                }
lbl67:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (!((Boolean)this.IIllI.lIl()).booleanValue()) ** GOTO lbl30
                                                                                    ** continue;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            return null;
lbl72:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var10_7 = 0.0f;
                                                                                ** continue;
                                                                                break;
                                                                            }
lbl75:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                if (!(var10_7 > 0.0f)) ** GOTO lbl45
                                                                                ** continue;
                                                                                break;
                                                                            }
lbl78:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var10_7 += var16_18;
                                                                                break block44;
                                                                                break;
                                                                            }
                                                                        }
                                                                        v3 = false;
lbl83:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var13_16 = v3;
                                                                            ** continue;
                                                                            break;
                                                                        }
lbl86:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (var16_19.isInfinite()) break block34;
                                                                            ** GOTO lbl42
                                                                            break;
                                                                        }
                                                                    }
                                                                    var9_13 = true;
                                                                    break block34;
lbl92:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl94:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var13_15 = (StatusEffectInstance)var12_9.next();
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                }
lbl98:
                                                                // 4 sources

                                                                while (var12_9.hasNext()) {
                                                                    ** continue;
lbl100:
                                                                    // 1 sources

                                                                    ** GOTO lbl94
                                                                }
                                                                break block51;
                                                            }
                                                            if (!var13_16) ** break;
                                                            ** while (true)
                                                            ** while (true)
                                                        }
                                                        ** while (var13_15.getAmplifier() <= var16_19.getAmplifier())
lbl108:
                                                        // 1 sources

                                                        ** while (true)
                                                    }
                                                    v2 = new llIlII(var3_3, var8_6, 0.0f, var2_2.copy());
                                                    break block50;
                                                }
                                                return v0;
                                            }
                                            var8_6 += 120;
                                            ** GOTO lbl98
lbl117:
                                            // 1 sources

                                            while (true) {
                                                var16_19 = var1_1.getStatusEffect(var14_10);
                                                ** continue;
                                                break;
                                            }
lbl120:
                                            // 1 sources

                                            return null;
                                        }
                                        return v2;
                                    }
                                    var8_6 += 55;
                                    ** GOTO lbl98
lbl127:
                                    // 1 sources

                                    while (true) {
                                        var9_13 = false;
                                        ** continue;
                                        break;
                                    }
                                }
                                return null;
                            }
                            var7_12 = (PotionContentsComponent)var2_2.get(DataComponentTypes.POTION_CONTENTS);
                            var8_6 = 0;
                            ** while (true)
                        }
                        if (!var15_17.isInstant()) ** GOTO lbl10
                        ** while (true)
                    }
                    var9_13 = true;
                    ** while (true)
                    var16_18 = this.IlIIl(var13_15);
                    if (!(var16_18 > 0.0f)) ** GOTO lbl98
                    ** while (true)
                }
                v1 = null;
                ** while (true)
lbl148:
                // 1 sources

                while (true) {
                    var8_6 += 10000 + Math.round(Math.min(var10_7, var14_11) * 20.0f);
                    ** continue;
                    break;
                }
            }
            ** while (var9_13)
lbl153:
            // 1 sources

            ** while (true)
        }
        v3 = true;
        ** while (true)
        var14_11 = Math.max(0.0f, var1_1.getMaxHealth() - var12_8);
        ** while (!(var14_11 <= 0.25f))
lbl159:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity == null) return false;
        if (livingEntity == minecraftClient.player) return false;
        if (!livingEntity.isAlive()) return false;
        if (livingEntity.isRemoved()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIlI() {
        ++this.I;
        this.IIIIl = IlIlIIlII.Il;
        this.IIIlII = 0L;
        this.IlIl = 0L;
        this.lll = Integer.MAX_VALUE;
        this.lIIII = -1;
        this.l = 0.0f;
        this.ll = ItemStack.EMPTY;
        this.llll = -1;
        this.IllIl = -1;
        this.llIl = Integer.MIN_VALUE;
        this.Il = false;
        this.IlI = false;
        this.Ill.clear();
        this.lIIlI = null;
        this.IIII = 0L;
        this.lIl = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public PotAssist(IlIlIlIII ilIlIlIII) {
        super(StringFactory.IIII("PotAssist"), Category.II, StringFactory.IIII("Automatically throws safe splash potions when looking down."));
        llIlIlI llIlIlI2;
        this.IllII = this.IIlllIl((IIIIIIIIl)new IIIIIIIIl<IIIlllll>(StringFactory.IIII("Rotate mode"), IIIlllll.class, IIIlllll.l).lIII(this.IIIIll::lIl));
        this.lIlI = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("Trigger Pitch"), 75.0, 30.0, 90.0, 1.0).IIII(StringFactory.IIII("deg")).lIII(() -> {
            if ((Boolean)this.IIIIll.lIl() != false) return false;
            return true;
        }));
        this.IIll = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Switch Delay"), 55.0, 60.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.IIIIIl = this.IIlllIl((IIIlIlIIl)new IIIlIlIIl(StringFactory.IIII("Action Delay"), 0.0, 0.0, 0.0, 250.0, 1.0).IIll(StringFactory.IIII("ms")).lIII(() -> false));
        this.Illl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Reapply Under"), 3.0, 0.0, 30.0, 0.5).IIII(StringFactory.IIII("s")));
        this.IIllI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Use Healing"), true));
        this.IIlll = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("Heal Health"), 10.0, 1.0, 20.0, 0.5).IIII(StringFactory.IIII("HP")).lIII(this.IIllI::lIl));
        this.IlII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Ground Only"), false));
        this.llI = this.IIlllIl((llIll)((IIllIl)new llIll((Object)StringFactory.IIII("Splash only self"), false).lIII(() -> false)).llll());
        llIlIlI2(StringFactory.IIII("Potion whitelist"), IIIl, Set.of(lIlll, III, lllll));
        this.IIIll = this.IIlllIl(llIlIlI2);
        this.IIIlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Switch Back"), true));
        this.llIII = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("Strength"), 50.0, 1.0, 100.0, 1.0).lIII(() -> {
            if ((Boolean)this.IIIIll.lIl() == false) return false;
            if (this.IllII.lIl() != IIIlllll.Il) return false;
            return true;
        }));
        this.lllII = new IlIlIlI();
        this.IIIIl = IlIlIIlII.Il;
        this.ll = ItemStack.EMPTY;
        this.llll = -1;
        this.IllIl = -1;
        this.lll = Integer.MAX_VALUE;
        this.lIIII = -1;
        this.llIl = Integer.MIN_VALUE;
        this.Ill = new ArrayList<ItemStack>();
        this.IIIIlI = ilIlIlIII;
    }

    private void lIlII(MinecraftClient minecraftClient) {
        this.lIlIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlIl(MinecraftClient minecraftClient) {
        if (this.IlI && minecraftClient != null && minecraftClient.player != null) {
            IlIlllI.IIIlIl(minecraftClient, minecraftClient.player.getYaw(), this.IlIII);
            this.IlI = false;
        }
        if (!((Boolean)this.IIIlI.lIl()).booleanValue() || this.IllIl < 0 || this.IllIl >= 9 || this.IllIl == this.llll) {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
        } else {
            this.lllIl(minecraftClient, this.IllIl);
        }
        this.lIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        this.lIIlI();
        this.Illl();
        this.IlIlI = 0L;
        this.IlIl = 0L;
        this.lIIIl = 0L;
        this.lllII.lIlIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private LivingEntity lIllI(MinecraftClient minecraftClient, long l2) {
        LivingEntity livingEntity;
        LivingEntity livingEntity2 = livingEntity = this.IIIIlI != null ? this.IIIIlI.lIl() : null;
        if (this.lIIIl(minecraftClient, livingEntity)) {
            return livingEntity;
        }
        livingEntity = this.IIIIlI != null ? this.IIIIlI.lIll() : null;
        if (this.IIIIlI == null) return null;
        if (this.IIIIlI.IIll(l2) > 2500L) return null;
        if (!this.lIIIl(minecraftClient, livingEntity)) return null;
        return livingEntity;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        this.llllll(jsonObject, "Throw Delay", this.IIIIIl);
        this.llllll(jsonObject, "Throw Delay", this.IIIIIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIII(MinecraftClient minecraftClient, boolean bl) {
        long l2;
        ClientPlayerEntity clientPlayerEntity;
        block3: {
            block4: {
                block2: {
                    this.llIl = Integer.MIN_VALUE;
                    if (!bl || !this.llllI(minecraftClient)) break block2;
                    clientPlayerEntity = minecraftClient.player;
                    l2 = System.currentTimeMillis();
                    this.lIIIl = l2;
                    if (this.l <= 0.0f) {
                        this.Ill.add(this.ll.copy());
                    }
                    this.IlIlI = l2 + this.IIl(this.IIIIIl);
                    if (!(this.l > 0.0f)) break block3;
                    break block4;
                }
                this.lIlIl(minecraftClient);
                return;
            }
            this.llIIl = Math.min(clientPlayerEntity.getMaxHealth(), Math.max(clientPlayerEntity.getHealth(), this.lIIl(clientPlayerEntity, l2)) + this.l);
            this.lIllI = l2 + 1000L;
            this.lIlIl = l2 + 1400L;
            if (!this.IIllI(clientPlayerEntity)) {
                this.IlIlI = Math.max(this.IlIlI, l2 + 700L);
            }
        }
        this.IIIIl = IlIlIIlII.l;
        this.IIIlII = l2;
        this.lll = clientPlayerEntity.age + 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        if (!this.llllI(minecraftClient)) {
            this.lIIlI();
            this.Illl();
            return;
        }
        if (orchard.internal.IIlI.IIl(minecraftClient)) {
            this.lIIlI();
            return;
        }
        long l2 = System.currentTimeMillis();
        this.IIlIl(minecraftClient.player, l2);
        if (this.IIIIl == IlIlIIlII.Il) {
            if (!this.IlIll(minecraftClient)) {
                return;
            }
        } else {
            this.IIIII(minecraftClient, l2);
            return;
        }
        boolean bl = (double)minecraftClient.player.getPitch() >= (Double)this.lIlI.lIl() && this.IIIIl(minecraftClient);
        boolean bl2 = (Boolean)this.IIIIll.lIl();
        boolean bl3 = this.IllII(minecraftClient, l2);
        if (l2 < this.IlIlI) {
            if (!bl3) return;
            if (!this.lll(l2)) {
                return;
            }
        }
        if (bl || bl2) {
            if (bl2 && !this.lII(minecraftClient)) {
                return;
            }
            if (!this.IIIll(minecraftClient, l2)) {
                return;
            }
            llIlII llIlII2 = this.IIII(minecraftClient.player, l2, bl3);
            if (llIlII2 == null) {
                return;
            }
            if (bl3 && llIlII2.Il() <= 0.0f) {
                return;
            }
            boolean bl4 = !bl && bl2;
            this.lllll(minecraftClient, llIlII2, l2, bl4);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIlI(ItemStack itemStack) {
        ItemStack itemStack2;
        Iterator<ItemStack> iterator = this.Ill.iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while (!ItemStack.areItemsAndComponentsEqual((ItemStack)(itemStack2 = iterator.next()), (ItemStack)itemStack));
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIll(MinecraftClient minecraftClient, long l2) {
        if (!((Boolean)this.IIIIll.lIl()).booleanValue()) {
            return;
        }
        if (l2 < this.IlIlI) {
            return;
        }
        if (!this.IlIll(minecraftClient)) return;
        if (!this.lII(minecraftClient)) return;
        if (this.IIIll(minecraftClient, l2)) {
            llIlII llIlII2 = this.IIII(minecraftClient.player, l2, false);
            if (llIlII2 == null) return;
            if (llIlII2.Il() > 0.0f) {
                return;
            }
            this.lllll(minecraftClient, llIlII2, l2, true);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllII(MinecraftClient minecraftClient, long l2) {
        if (!this.IlIll(minecraftClient)) return false;
        if (!this.IIIll(minecraftClient, l2)) return false;
        if (this.Il) {
            if ((Boolean)this.IIIIll.lIl() == false) return false;
            if (!this.lII(minecraftClient)) {
                return false;
            }
        } else {
            if ((double)minecraftClient.player.getPitch() < (Double)this.lIlI.lIl()) return false;
            if (!this.IIIIl(minecraftClient)) {
                return false;
            }
        }
        boolean bl = this.IllII(minecraftClient, l2);
        llIlII llIlII2 = this.IIII(minecraftClient.player, l2, bl);
        if (llIlII2 == null) return false;
        if (bl && llIlII2.Il() <= 0.0f) {
            return false;
        }
        if (l2 < this.IlIlI) {
            return true;
        }
        this.llll = llIlII2.II();
        this.l = llIlII2.Il();
        this.ll = llIlII2.l();
        this.lI(minecraftClient, this.llll, l2);
        if (lIIllllI.lllI(minecraftClient.player.getInventory()) == this.llll && l2 >= this.IlIl) {
            this.lIII(minecraftClient, l2);
            return true;
        }
        this.IIIIl = IlIlIIlII.lI;
        this.IIIlII = l2;
        return true;
    }

    private void lllIl(MinecraftClient minecraftClient, int n) {
        lIIllllI.IlllIII(minecraftClient, this, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.useKey == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllll(MinecraftClient minecraftClient, llIlII llIlII2, long l2, boolean bl) {
        if (minecraftClient.options == null) return;
        if (minecraftClient.options.useKey == null) {
            return;
        }
        if (!this.IlIll(minecraftClient)) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        this.Ill.clear();
        this.IllIl = lIIllllI.lllI(clientPlayerEntity.getInventory());
        this.llll = llIlII2.II();
        this.l = llIlII2.Il();
        this.ll = llIlII2.l();
        this.Il = bl;
        this.lI(minecraftClient, this.llll, l2);
        if (lIIllllI.lllI(clientPlayerEntity.getInventory()) != this.llll || l2 < this.IlIl) {
            this.IIIIl = IlIlIIlII.lI;
            this.IIIlII = l2;
            return;
        }
        this.lIII(minecraftClient, l2);
    }

    private static int IIIIII(int n, int n2) {
        return IIIllI[n ^ 0x868D4F2E] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String IIIIIl(int var0, int var1_1) {
        var3_2 = var0 ^ -215059301;
        var4_4 = PotAssist.IIIlll[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])PotAssist.IIlIII[var3_2];
        if (var2_3 == null) {
            var5_5 = new Throwable().getStackTrace();
            PotAssist.IIlIII[var3_2] = var5_5;
        } else {
            var5_5 = var2_3;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -677837243;
        var8_8 = 0;
        if (true) ** GOTO lbl17
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) {
                return new String(var4_4).intern();
            }
lbl17:
            // 3 sources

            switch (var8_8 & 31) {
                case 26: {
                    var9_9 = 15;
                    continue block33;
                }
                case 13: {
                    var9_9 = 33;
                    continue block33;
                }
                case 8: {
                    var9_9 = 221;
                    continue block33;
                }
                case 17: {
                    var9_9 = 107;
                    continue block33;
                }
                case 24: {
                    var9_9 = 84;
                    continue block33;
                }
                case 31: {
                    var9_9 = 119;
                    continue block33;
                }
                case 23: {
                    var9_9 = 29;
                    continue block33;
                }
                case 1: {
                    var9_9 = 186;
                    continue block33;
                }
                case 21: {
                    var9_9 = 66;
                    continue block33;
                }
                case 12: {
                    var9_9 = 106;
                    continue block33;
                }
                case 9: {
                    var9_9 = 23;
                    continue block33;
                }
                case 22: {
                    var9_9 = 29;
                    continue block33;
                }
                case 27: {
                    var9_9 = 96;
                    continue block33;
                }
                case 28: {
                    var9_9 = 38;
                    continue block33;
                }
                case 15: {
                    var9_9 = 2;
                    continue block33;
                }
                case 11: {
                    var9_9 = 131;
                    continue block33;
                }
                case 6: {
                    var9_9 = 68;
                    continue block33;
                }
                case 20: {
                    var9_9 = 71;
                    continue block33;
                }
                case 2: {
                    var9_9 = 229;
                    continue block33;
                }
                case 16: {
                    var9_9 = 82;
                    continue block33;
                }
                case 7: {
                    var9_9 = 209;
                    continue block33;
                }
                case 25: {
                    var9_9 = 194;
                    continue block33;
                }
                default: {
                    var9_9 = 21;
                    continue block33;
                }
                case 5: {
                    var9_9 = 15;
                    continue block33;
                }
                case 30: {
                    var9_9 = 140;
                    continue block33;
                }
                case 4: {
                    var9_9 = 211;
                    continue block33;
                }
                case 3: {
                    var9_9 = 73;
                    continue block33;
                }
                case 18: {
                    var9_9 = 144;
                    continue block33;
                }
                case 14: {
                    var9_9 = 157;
                    continue block33;
                }
                case 29: {
                    var9_9 = 77;
                    continue block33;
                }
                case 19: {
                    var9_9 = 139;
                    continue block33;
                }
                case 10: 
            }
            var9_9 = 118;
        }
    }
}

