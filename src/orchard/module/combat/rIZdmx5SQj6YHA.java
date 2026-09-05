/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIIIIl
 * Module         : rIZdmx5SQj6YHA==  [COMBAT]
 * Description    : uYFAkxRWRBWUCZNVFpPfioyVV5cQWVdcmBiPVgHW0IqL1E2TDBBCGdcEkFYE2tCZ2JVA   (client's own text)
 *
 * Recovered strings in this class:
 *   - Hit Invisible Players
 *   - Range Variability
 *   - Holding Bind Only
 *   - Sword Cooldown
 *   - Ignore Shields
 *   - Reaction Time
 *   - Axe Cooldown
 *   - Players Only
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
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.MaceItem
 *  net.minecraft.registry.Registries
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 */
package orchard.module.combat;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MaceItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IIlIIIII;
import orchard.internal.IIllllllI;
import orchard.internal.IlI;
import orchard.internal.IlIIllI;
import orchard.internal.IlIlIlIII;
import orchard.internal.IlllllIl;
import orchard.internal.lIIIII;
import orchard.internal.lIIllII;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;
import orchard.mixin.ClientPlayerEntityMixin2;
import orchard.module.combat.BreachSwap;
import orchard.module.combat.MaceSwap;
import orchard.module.combat.ShieldBreaker;
import orchard.module.player.ElytraSwap;

@Environment(value=EnvType.CLIENT)
public final class rIZdmx5SQj6YHA
extends ModuleBase {
    private long I;
    private final IlIlIlIII l;
    private final llIll II;
    private int Il;
    private final llIll lI;
    private final IIIlIlIIl ll;
    private boolean III;
    private final lIlIIlI IIl;
    private final IIIIIIIIl<IIlIIIII> IlI = this.IIlllIl(new IIIIIIIIl<IIlIIIII>("Target Mode", IIlIIIII.class, IIlIIIII.II));
    private boolean Ill;
    private boolean lII;
    private final llIll lIl = this.IIlllIl(new llIll("Range Variability", false));
    private final IIIlIlIIl llI;
    private IlI lll;
    private double IIII;
    private final IIIlIlIIl IIIl;
    private final IIIIIIIIl<lIIIII> IIlI;
    private int IIll;
    private static final long IlII = 325L;
    private final lIlIIlI IlIl;
    private final llIll IllI;
    private final llIll Illl;
    private final lIIllII lIII;
    private final llIll lIIl;
    private double lIlI;
    private double lIll;
    private final IIIlIlIIl llII;
    private final lIlIIlI llIl;
    private final llIll lllI;
    private long llll;
    private int IIIII = -1;
    private Object IIIIl;
    private final llIll IIIlI;
    private static final int[] IIIll;
    private static final String[] IIlII;
    private static final Object[] IIlIl;

    /*
     * Enabled aggressive block sorting
     */
    private void lI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient.player == null) return;
        if (minecraftClient.interactionManager == null) return;
        if (livingEntity == null) {
            return;
        }
        this.III = true;
        this.Ill = this.lllII(minecraftClient) && this.Illll(minecraftClient);
        lIIllllI.I(minecraftClient, 3);
        this.lIllI(minecraftClient);
        minecraftClient.interactionManager.stopUsingItem((PlayerEntity)minecraftClient.player);
        this.lll = orchard.internal.IlI.l;
        this.Il = livingEntity.getId();
        this.I = System.currentTimeMillis() + 325L;
    }

    @Override
    public void llll() {
        this.lIll();
    }

    public boolean IIl() {
        return lIIllllI.IIIlIIl();
    }

    private boolean IlI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (!lIIllllI.lllIlI(livingEntity, minecraftClient.player) || ((Boolean)this.lIIl.lIl()).booleanValue()) {
            return this.IIlll(minecraftClient, livingEntity);
        }
        return this.IlII(minecraftClient, null, livingEntity);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (livingEntity == minecraftClient.player) return false;
        if (livingEntity.isAlive()) {
            if (livingEntity.isInvisible()) {
                if ((Boolean)this.lllI.lIl() == false) return false;
                if (!(livingEntity instanceof PlayerEntity)) {
                    return false;
                }
            }
            if (IIllllllI.II(livingEntity)) {
                return false;
            }
            if (!((Boolean)this.II.lIl()).booleanValue() || livingEntity instanceof PlayerEntity) {
                if ((Boolean)this.IllI.lIl() == false) return true;
                if (this.lllll(minecraftClient.player.getMainHandStack())) return true;
                return false;
            }
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) return false;
        if (clientPlayerEntity.isOnGround()) return false;
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
     * Enabled aggressive block sorting
     */
    private void IIII(MinecraftClient minecraftClient) {
        block14: {
            block29: {
                EntityHitResult entityHitResult;
                EntityHitResult entityHitResult2;
                block31: {
                    block30: {
                        block28: {
                            double d;
                            double d2;
                            double d3;
                            double d4;
                            block27: {
                                block20: {
                                    double d5;
                                    HitResult hitResult;
                                    block26: {
                                        block25: {
                                            block22: {
                                                block24: {
                                                    block23: {
                                                        block21: {
                                                            block19: {
                                                                block18: {
                                                                    EntityHitResult entityHitResult3;
                                                                    block17: {
                                                                        block16: {
                                                                            block15: {
                                                                                if (!this.IIIlIIl()) {
                                                                                    return;
                                                                                }
                                                                                if (minecraftClient.player == null || minecraftClient.world == null || minecraftClient.currentScreen != null || minecraftClient.interactionManager == null) break block14;
                                                                                if (this.IIIIlI(minecraftClient)) {
                                                                                    return;
                                                                                }
                                                                                if (minecraftClient.player.isUsingItem()) {
                                                                                    this.lllIl();
                                                                                    return;
                                                                                }
                                                                                if (((Boolean)this.Illl.lIl()).booleanValue() && !this.llII(minecraftClient)) break block15;
                                                                                d4 = this.IIIIII();
                                                                                d3 = Math.max(d4, this.ll.IIIl());
                                                                                d2 = Math.max(d3, this.ll.IIII());
                                                                                hitResult = minecraftClient.crosshairTarget;
                                                                                if (!(hitResult instanceof EntityHitResult)) break block16;
                                                                                break block17;
                                                                            }
                                                                            this.lllIl();
                                                                            return;
                                                                        }
                                                                        entityHitResult3 = null;
                                                                        break block18;
                                                                    }
                                                                    entityHitResult3 = entityHitResult2 = (entityHitResult = (EntityHitResult)hitResult);
                                                                }
                                                                if (entityHitResult2 == null && d4 > 3.0) {
                                                                    entityHitResult2 = lIIllllI.lI(minecraftClient, d4);
                                                                }
                                                                if (entityHitResult2 != null) break block19;
                                                                if (!((Double)this.IlIl.lIl() > 0.0) || this.IIlI.lIl() != lIIIII.I) break block20;
                                                                break block21;
                                                            }
                                                            entityHitResult = lIIllllI.IlIllII(minecraftClient, (HitResult)entityHitResult2);
                                                            if (entityHitResult == null) break block22;
                                                            break block23;
                                                        }
                                                        entityHitResult = lIIllllI.lI(minecraftClient, d2);
                                                        if (entityHitResult == null) break block20;
                                                        break block24;
                                                    }
                                                    if (this.lII(minecraftClient, (LivingEntity)entityHitResult)) break block25;
                                                    break block22;
                                                }
                                                hitResult = lIIllllI.IlIllII(minecraftClient, (HitResult)entityHitResult);
                                                if (hitResult == null) break block20;
                                                break block26;
                                            }
                                            this.lllIl();
                                            return;
                                        }
                                        if (!this.lIlIl((LivingEntity)entityHitResult)) {
                                            this.lllIl();
                                            return;
                                        }
                                        break block27;
                                    }
                                    if (this.lII(minecraftClient, (LivingEntity)hitResult) && this.lIlIl((LivingEntity)hitResult) && (d5 = minecraftClient.player.getEyePos().distanceTo(entityHitResult.getPos())) >= d3 && d5 <= d2 && this.IIIIIl((LivingEntity)hitResult) && this.lIlI(minecraftClient, (LivingEntity)hitResult) && ThreadLocalRandom.current().nextDouble(0.0, 100.0) < (Double)this.IlIl.lIl()) {
                                        this.Illl(minecraftClient);
                                        return;
                                    }
                                }
                                this.lllIl();
                                return;
                            }
                            if (this.IllI(minecraftClient, entityHitResult2, (LivingEntity)entityHitResult, d4)) break block28;
                            if (!((Double)this.IlIl.lIl() > 0.0) || this.IIlI.lIl() != lIIIII.I || !((d = minecraftClient.player.getEyePos().distanceTo(entityHitResult2.getPos())) >= d3) || !(d <= d2)) break block29;
                            break block30;
                        }
                        if (minecraftClient.player.isUsingItem()) {
                            return;
                        }
                        break block31;
                    }
                    if (this.IIIIIl((LivingEntity)entityHitResult) && this.lIlI(minecraftClient, (LivingEntity)entityHitResult) && ThreadLocalRandom.current().nextDouble(0.0, 100.0) < (Double)this.IlIl.lIl()) {
                        this.Illl(minecraftClient);
                        return;
                    }
                    break block29;
                }
                boolean bl = lIIllllI.lllIlI((LivingEntity)entityHitResult, minecraftClient.player);
                if (!this.IIIIIl((LivingEntity)entityHitResult)) {
                    return;
                }
                if (!this.lIlI(minecraftClient, (LivingEntity)entityHitResult)) {
                    return;
                }
                if (this.IlIlI(minecraftClient, (LivingEntity)entityHitResult)) {
                    return;
                }
                if (bl && !((Boolean)this.lIIl.lIl()).booleanValue()) {
                    this.IlII(minecraftClient, entityHitResult2, (LivingEntity)entityHitResult);
                    return;
                }
                if (this.IlIll(minecraftClient, (LivingEntity)entityHitResult)) {
                    return;
                }
                if (this.IlI(minecraftClient, (LivingEntity)entityHitResult)) {
                    this.IIIIll(minecraftClient);
                    return;
                }
                this.lIIlI(minecraftClient, entityHitResult2, (LivingEntity)entityHitResult);
                return;
            }
            this.lllIl();
            return;
        }
        this.IIlI();
    }

    private void IIlI() {
        this.IlIIl(MinecraftClient.getInstance());
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient, EntityHitResult entityHitResult, LivingEntity livingEntity) {
        ClientEntrypoint clientEntrypoint;
        block5: {
            MaceSwap maceSwap;
            block6: {
                block4: {
                    clientEntrypoint = ClientEntrypoint.lII();
                    if (clientEntrypoint == null) return false;
                    if (minecraftClient == null) return false;
                    if (minecraftClient.player == null) return false;
                    if (livingEntity == null) break block4;
                    maceSwap = clientEntrypoint.IlI().IlIIIIl();
                    if (maceSwap == null) break block5;
                    break block6;
                }
                return false;
            }
            if (maceSwap.IIIlIIl()) {
                if (maceSwap.IlIllI(livingEntity)) {
                    return true;
                }
                if (maceSwap.IIII(minecraftClient, livingEntity)) {
                    return true;
                }
            }
        }
        ShieldBreaker shieldBreaker = clientEntrypoint.IlI().IIIIlI();
        if (shieldBreaker == null) return false;
        if (!shieldBreaker.IIIlIIl()) return false;
        if (shieldBreaker.lIlI(livingEntity)) {
            return true;
        }
        if (!shieldBreaker.IllIlI(minecraftClient, livingEntity)) return false;
        if (entityHitResult == null) return true;
        if (!shieldBreaker.lIlII(livingEntity)) return true;
        if (!(minecraftClient.player.getEyePos().squaredDistanceTo(entityHitResult.getPos()) <= 9.0)) return true;
        this.lIIlI(minecraftClient, entityHitResult, livingEntity);
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IllI(MinecraftClient minecraftClient, EntityHitResult entityHitResult, LivingEntity livingEntity, double d) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (entityHitResult == null) return false;
        if (livingEntity == null) {
            return false;
        }
        if (!(minecraftClient.player.getEyePos().distanceTo(entityHitResult.getPos()) <= d + 1.0E-4)) return false;
        return true;
    }

    private void Illl(MinecraftClient minecraftClient) {
        if (minecraftClient == null || minecraftClient.player == null) {
            return;
        }
        lIIllllI.IllllII(true);
        try {
            lIIllllI.lllIl(minecraftClient);
        }
        finally {
            lIIllllI.IllllII(false);
        }
        this.IIIIll(minecraftClient);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIII() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        ShieldBreaker shieldBreaker = clientEntrypoint.IlI().IIIIlI();
        if (shieldBreaker == null) return false;
        if (!shieldBreaker.IIIlIIl()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIl() {
        double d;
        if (!((Boolean)this.lIl.lIl()).booleanValue()) {
            this.IIII = (Double)this.IIl.lIl();
            return;
        }
        double d2 = this.IIIl.IIIl();
        this.IIII = d2 != (d = this.IIIl.IIII()) ? ThreadLocalRandom.current().nextDouble(d2, d) : d2;
    }

    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.llIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (lIIllllI.IIIIIlI(minecraftClient) > 0) return false;
        if (lIIllllI.IIIIll(minecraftClient) > 0) {
            return false;
        }
        ItemStack itemStack = minecraftClient.player.getMainHandStack();
        float f = minecraftClient.player.getAttackCooldownProgress(0.5f);
        float f2 = (float)this.llIll(itemStack);
        if (f < f2) return false;
        if (this.IllII(itemStack)) {
            if (!this.IlllI(minecraftClient, f)) return true;
            return false;
        }
        if (!((Boolean)this.IIIlI.lIl()).booleanValue() || ((Boolean)this.lIIl.lIl()).booleanValue() || !lIIllllI.lllIlI(livingEntity, minecraftClient.player)) {
            if (!this.lIIll(minecraftClient, livingEntity, f)) return true;
            return false;
        }
        if (!this.lll(minecraftClient.player)) return true;
        if (IlIIllI.IIlI(minecraftClient.player.fallDistance)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIll() {
        this.IIIIl = null;
        this.lII = false;
        this.IIIII = -1;
        this.lllIl();
        this.IIlI();
        this.lIIl();
        this.IIllI();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean llII(MinecraftClient minecraftClient) {
        block2: {
            block1: {
                if (!((Boolean)this.Illl.lIl()).booleanValue()) break block1;
                if (minecraftClient != null && minecraftClient.getWindow() != null) break block2;
            }
            if ((Boolean)this.Illl.lIl() != false) return false;
            return true;
        }
        if (this.lIII.ll()) return lIIllllI.llI(minecraftClient, (InputUtil.Key)this.lIII.lIl());
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIl(MinecraftClient minecraftClient) {
        ClientWorld clientWorld;
        ClientWorld clientWorld2 = clientWorld = minecraftClient != null ? minecraftClient.world : null;
        if (this.lII && this.IIIIl == clientWorld) {
            return;
        }
        this.lIll();
        this.IIIIl = clientWorld;
        this.lII = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double lllI(IIIlIlIIl iIIlIlIIl) {
        double d = iIIlIlIIl.IIIl();
        double d2 = iIIlIlIIl.IIII();
        return d == d2 ? d : ThreadLocalRandom.current().nextDouble(d, d2);
    }

    private LivingEntity IIIII(MinecraftClient minecraftClient) {
        if (minecraftClient.world != null) {
            if (this.Il != Integer.MIN_VALUE) {
                LivingEntity livingEntity;
                Entity entity = minecraftClient.world.getEntityById(this.Il);
                if (!(entity instanceof LivingEntity && this.lII(minecraftClient, livingEntity = (LivingEntity)entity) && this.lIlIl(livingEntity))) {
                    return null;
                }
                return livingEntity;
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIIIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (this.lll != orchard.internal.IlI.l) return false;
        return true;
    }

    @Override
    public String II() {
        return "";
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.options == null) return false;
        return true;
    }

    @Override
    public void ll() {
        this.lIll();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlII(LivingEntity livingEntity) {
        if (this.l == null) return false;
        if (livingEntity == null) return false;
        LivingEntity livingEntity2 = this.l.lIll();
        if (!(livingEntity2 instanceof PlayerEntity)) return false;
        if (!livingEntity2.isAlive()) return false;
        if (livingEntity2.isRemoved()) return false;
        if (livingEntity2.getUuid().equals(livingEntity.getUuid())) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.interactionManager == null) {
            return;
        }
        lIIllllI.I(minecraftClient, 3);
        this.lIllI(minecraftClient);
        if (!lIIllllI.IllllI((LivingEntity)minecraftClient.player)) {
            if (!minecraftClient.player.isUsingItem()) return;
        }
        minecraftClient.interactionManager.stopUsingItem((PlayerEntity)minecraftClient.player);
    }

    private void IIllI() {
        this.lIll = this.lllI(this.llII);
        this.lIlI = this.lllI(this.llI);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        BreachSwap breachSwap;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity == null) {
            return false;
        }
        MaceSwap maceSwap = clientEntrypoint.IlI().IlIIIIl();
        if (maceSwap == null || !maceSwap.IIIlIIl() || !IlllllIl.Il(maceSwap.IlIllI(livingEntity), () -> maceSwap.IIII(minecraftClient, livingEntity))) {
            breachSwap = clientEntrypoint.IlI().l();
            if (breachSwap == null) return false;
            if (!breachSwap.IIIlIIl()) return false;
            if (breachSwap.llIl()) {
                return true;
            }
        } else {
            return true;
        }
        if (!breachSwap.lIll(minecraftClient, livingEntity)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.options == null) return;
        if (minecraftClient.options.useKey != null) {
            lIIllllI.IIIlIlI(minecraftClient);
            lIIllllI.llIlIl(minecraftClient.options.useKey);
            if (!lIIllllI.IIllIII(minecraftClient, minecraftClient.options.useKey)) {
                minecraftClient.options.useKey.setPressed(false);
                return;
            }
            minecraftClient.options.useKey.setPressed(true);
            if (this.Illll(minecraftClient)) {
                lIIllllI.IIllllI(minecraftClient);
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIl(MinecraftClient minecraftClient) {
        if (this.III) {
            this.III = false;
        }
        if (this.Ill && minecraftClient != null && minecraftClient.player != null && this.Illll(minecraftClient)) {
            this.IlIII(minecraftClient);
        }
        this.lll = orchard.internal.IlI.lI;
        this.Il = Integer.MIN_VALUE;
        this.I = 0L;
        this.Ill = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIlI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        if (clientEntrypoint.IlI().IIlIl() != null) return clientEntrypoint.IlI().IIlIl().IIIII(minecraftClient, (Entity)livingEntity);
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return;
        if (!this.IIIll(minecraftClient)) {
            return;
        }
        this.IIII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity == null) return false;
        ElytraSwap elytraSwap = clientEntrypoint.IlI().IlIlll();
        if (elytraSwap == null) return false;
        if (!elytraSwap.lII(minecraftClient, livingEntity)) return false;
        return true;
    }

    private boolean IllII(ItemStack itemStack) {
        return itemStack != null && !itemStack.isEmpty() && itemStack.getItem() instanceof MaceItem;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlllI(MinecraftClient minecraftClient, float f) {
        if ((Boolean)this.IIIlI.lIl() == false) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (clientPlayerEntity.isOnGround()) return false;
        if (clientPlayerEntity.isGliding()) {
            return false;
        }
        if (MaceItem.shouldDealAdditionalDamage((LivingEntity)clientPlayerEntity)) {
            return false;
        }
        if (!(clientPlayerEntity.fallDistance >= 1.5)) return false;
        if (clientPlayerEntity.getVelocity().y < 0.0) return true;
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private boolean Illll(MinecraftClient var1_1) {
        block6: {
            block7: {
                block8: {
                    if (var1_1 == null) break block7;
                    break block8;
lbl3:
                    // 1 sources

                    return true;
lbl5:
                    // 1 sources

                    while (true) {
                        var2_2 = Hand.values();
                        var3_3 = var2_2.length;
                        var4_4 = 0;
                        if (true) ** GOTO lbl20
                        break;
                    }
                }
                ** while (var1_1.player != null)
lbl12:
                // 1 sources

                break block7;
                return false;
                block3: while (true) {
                    var6_6 = var1_1.player.getStackInHand(var5_5);
                    if (!var6_6.isEmpty()) break block6;
lbl18:
                    // 2 sources

                    while (true) {
                        ++var4_4;
lbl20:
                        // 2 sources

                        if (var4_4 >= var3_3) ** continue;
                        var5_5 = var2_2[var4_4];
                        continue block3;
                        break;
                    }
                    break;
                }
            }
            return false;
        }
        ** while (!lIIllllI.IIIlIII((ItemStack)var6_6))
lbl27:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIIl(MinecraftClient minecraftClient, LivingEntity livingEntity, boolean bl) {
        if (!this.lIlI(minecraftClient, livingEntity)) {
            return;
        }
        if (this.IlIlI(minecraftClient, livingEntity)) {
            return;
        }
        boolean bl2 = lIIllllI.IllllI((LivingEntity)minecraftClient.player) || minecraftClient.player.isUsingItem();
        boolean bl3 = (Boolean)this.lI.lIl();
        if (!bl3 || !bl2) {
            if (!bl) return;
            if ((Boolean)this.lIIl.lIl() != false) return;
            this.IlII(minecraftClient, null, livingEntity);
            return;
        }
        this.lI(minecraftClient, livingEntity);
    }

    /*
     * Enabled aggressive block sorting
     */
    public rIZdmx5SQj6YHA(IlIlIlIII ilIlIlIII) {
        super(StringFactory.IIl("rIZdmx5SQj6YHA=="), Category.II, StringFactory.IIl("uYFAkxRWRBWUCZNVFpPfioyVV5cQWVdcmBiPVgHW0IqL1E2TDBBCGdcEkFYE2tCZ2JVA"));
        this.IIl = this.IIlllIl(new lIlIIlI("Range", 3.0, 1.0, 3.0, 0.01).IIIl("m"));
        this.IIIl = this.IIlllIl(new IIIlIlIIl(StringFactory.IIl("qpVamxwXZh2FAZ5bBt/XioE="), 2.7, 3.0, 1.0, 3.0, 0.01).lII("m"));
        this.llII = this.IIlllIl(new IIIlIlIIl("Sword Cooldown", 0.89, 0.93, 0.8, 1.0, 0.01));
        this.llI = this.IIlllIl(new IIIlIlIIl("Axe Cooldown", 0.89, 0.93, 0.8, 1.0, 0.01));
        this.llIl = this.IIlllIl(new lIlIIlI("Reaction Time", 0.0, 0.0, 500.0, 5.0).IIIl("ms"));
        this.IlIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Miss Chance"), 0.0, 0.0, 50.0, 1.0).IIII(StringFactory.IIII("%")));
        this.IIlI = this.IIlllIl((IIIIIIIIl)new IIIIIIIIl<lIIIII>(StringFactory.IIII("Miss Mode"), lIIIII.class, lIIIII.I).lIII(() -> false));
        this.ll = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Miss Range"), 3.0, 3.5, 3.0, 5.0, 0.05).IIll(StringFactory.IIII("m")));
        this.IIIlI = this.IIlllIl(new llIll("Smart Crits", true));
        this.lI = this.IIlllIl((llIll)new llIll("Unshield", true).lIII(() -> false));
        this.lIIl = this.IIlllIl(new llIll("Ignore Shields", false));
        this.II = this.IIlllIl(new llIll("Players Only", true));
        this.lllI = this.IIlllIl(new llIll("Hit Invisible Players", false));
        this.IllI = this.IIlllIl(new llIll("Weapon Only", false));
        this.Illl = this.IIlllIl(new llIll("Holding Bind Only", false));
        this.lIII = this.IIlllIl(new lIIllII("Hold Bind"));
        this.lll = orchard.internal.IlI.lI;
        this.Il = Integer.MIN_VALUE;
        this.IIll = Integer.MIN_VALUE;
        this.l = ilIlIlIII;
        this.IIl.lIII(() -> {
            if ((Boolean)this.lIl.lIl() != false) return false;
            return true;
        });
        this.IIIl.lIII(this.lIl::lIl);
        this.lIII.lIII(this.Illl::lIl);
        this.ll.lIII(() -> {
            if (!((Double)this.IlIl.lIl() > 0.0)) return false;
            return true;
        });
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lIIlI(MinecraftClient minecraftClient, EntityHitResult entityHitResult, LivingEntity livingEntity) {
        lIIllllI.IllllII(true);
        try {
            if (!lIIllllI.IIlllll(minecraftClient, entityHitResult)) {
                return;
            }
        }
        finally {
            lIIllllI.IllllII(false);
        }
        this.IIIIll(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIll(MinecraftClient minecraftClient, LivingEntity livingEntity, float f) {
        if ((Boolean)this.IIIlI.lIl() == false) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (!this.lll(clientPlayerEntity)) {
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
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) {
            return;
        }
        this.llIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlIl(LivingEntity livingEntity) {
        if (this.IlI.lIl() != IIlIIIII.I) {
            return true;
        }
        if (this.l == null) {
            return true;
        }
        LivingEntity livingEntity2 = this.l.lIll();
        if (livingEntity2 == null) return false;
        if (!livingEntity2.isAlive()) return false;
        if (!livingEntity2.isRemoved()) return this.IIlII(livingEntity);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.options == null) return;
        if (minecraftClient.options.useKey != null) {
            minecraftClient.options.useKey.setPressed(false);
            return;
        }
    }

    public void llIII(MinecraftClient minecraftClient) {
        this.IllIll(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean llIlI(MinecraftClient minecraftClient) {
        EntityHitResult entityHitResult;
        EntityHitResult entityHitResult2;
        if (!this.IIIlIIl()) return false;
        if ((Boolean)this.IIIlI.lIl() == false) return false;
        if (!this.IIIll(minecraftClient)) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!this.lll(minecraftClient.player)) return false;
        if (orchard.internal.IIlI.IIl(minecraftClient)) return false;
        if (lIIllllI.llIlI()) return false;
        if (orchard.internal.IIlI.IIlI(minecraftClient)) return false;
        if (((Boolean)this.Illl.lIl()).booleanValue()) {
            if (!this.llII(minecraftClient)) return false;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        ItemStack itemStack = clientPlayerEntity.getMainHandStack();
        if (this.IllII(itemStack)) return false;
        if (lIIllllI.IIIIIlI(minecraftClient) > 0) return false;
        if (lIIllllI.IIIIll(minecraftClient) > 0) return false;
        if (!IlIIllI.lll(clientPlayerEntity.getVelocity().y, clientPlayerEntity.getAttackCooldownProgress(0.5f), this.llIll(itemStack))) {
            return false;
        }
        double d = this.IIIIII();
        HitResult hitResult = minecraftClient.crosshairTarget;
        EntityHitResult entityHitResult3 = entityHitResult2 = !(hitResult instanceof EntityHitResult) ? null : (entityHitResult = (EntityHitResult)hitResult);
        if (entityHitResult2 == null && d > 3.0) {
            entityHitResult2 = lIIllllI.lI(minecraftClient, d);
        }
        entityHitResult = entityHitResult2 == null ? null : lIIllllI.IlIllII(minecraftClient, (HitResult)entityHitResult2);
        if (entityHitResult == null) return false;
        if (!this.lII(minecraftClient, (LivingEntity)entityHitResult)) return false;
        if (!this.lIlIl((LivingEntity)entityHitResult)) return false;
        if (!this.IllI(minecraftClient, entityHitResult2, (LivingEntity)entityHitResult, d)) return false;
        if (!((Boolean)this.lIIl.lIl()).booleanValue()) {
            if (lIIllllI.lllIlI((LivingEntity)entityHitResult, clientPlayerEntity)) return false;
        }
        double d2 = (Double)this.llIl.lIl();
        if (d2 <= 0.0) return true;
        if (this.IIll != entityHitResult.getId()) return false;
        if ((double)(System.currentTimeMillis() - this.llll) >= d2) return true;
        return false;
    }

    private double llIll(ItemStack itemStack) {
        if (itemStack == null || itemStack.isEmpty() || !(itemStack.getItem() instanceof AxeItem)) {
            return this.lIll;
        }
        return this.lIlI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.useKey == null) return false;
        if (lIIllllI.IIllIII(minecraftClient, minecraftClient.options.useKey)) return true;
        if (!minecraftClient.options.useKey.isPressed()) return false;
        return true;
    }

    private void lllIl() {
        this.IIll = Integer.MIN_VALUE;
        this.llll = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllll(ItemStack itemStack) {
        if (itemStack.isEmpty()) {
            return false;
        }
        if (itemStack.getItem() instanceof AxeItem) return true;
        if (!(itemStack.getItem() instanceof MaceItem)) {
            String string = Registries.ITEM.getId((Object)itemStack.getItem()).getPath();
            return string.endsWith("_sword");
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public double IIIIII() {
        double d;
        if (((Boolean)this.lIl.lIl()).booleanValue()) {
            d = this.IIII;
            return d;
        }
        d = (Double)this.IIl.lIl();
        return d;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIIl(LivingEntity livingEntity) {
        int n;
        block6: {
            block4: {
                long l2;
                block5: {
                    block3: {
                        block2: {
                            l2 = Math.max(0L, Math.round((Double)this.llIl.lIl()));
                            if (l2 > 0L) break block2;
                            if (livingEntity == null) break block3;
                            break block4;
                        }
                        if (livingEntity == null) {
                            this.lllIl();
                            return false;
                        }
                        break block5;
                    }
                    n = Integer.MIN_VALUE;
                    break block6;
                }
                long l3 = System.currentTimeMillis();
                if (this.IIll != livingEntity.getId()) {
                    this.IIll = livingEntity.getId();
                    this.llll = l3;
                    return false;
                }
                if (l3 - this.llll < l2) return false;
                return true;
            }
            n = livingEntity.getId();
        }
        this.IIll = n;
        this.llll = System.currentTimeMillis();
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean IIIIlI(MinecraftClient var1_1) {
        block22: {
            block24: {
                block26: {
                    block25: {
                        block23: {
                            if (this.lll == orchard.internal.IlI.lI) {
                                return false;
                            }
                            if (var1_1.player != null && var1_1.world != null && var1_1.interactionManager != null && var1_1.currentScreen == null) {
                                if (((Boolean)this.Illl.lIl()).booleanValue() && !this.llII(var1_1)) {
                                    this.IIlI();
                                    return true;
                                }
                            } else {
                                this.IIlI();
                                return true;
                            }
                            var2_2 = System.currentTimeMillis();
                            if (var2_2 > this.I) break block22;
                            var4_3 = this.IIIII(var1_1);
                            if (var4_3 == null) {
                                this.IlIIl(var1_1);
                                return true;
                            }
                            switch (this.lll.ordinal()) {
                                default: {
                                    return true;
                                }
                                case 1: {
                                    this.IIlIl(var1_1);
                                    if (lIIllllI.IllllI((LivingEntity)var1_1.player) != false) return true;
                                    if (var1_1.player.isUsingItem() != false) return true;
                                    this.lll = orchard.internal.IlI.II;
                                    this.I = var2_2 + 325L;
                                    return true;
                                }
                                case 3: {
                                    this.IlIIl(var1_1);
                                    return true;
                                }
                                case 2: 
                            }
                            if (!lIIllllI.IllllI((LivingEntity)var1_1.player)) {
                                ** break;
lbl32:
                                // 1 sources

                                if (!var1_1.player.isUsingItem()) {
                                    var5_5 = this.IIIIII();
                                }
                            }
                            this.IIlIl(var1_1);
                            return true;
                            var9_8 = var1_1.crosshairTarget;
                            var7_4 = var9_8 instanceof EntityHitResult != false ? (var8_6 = (EntityHitResult)var9_8) : null;
                            if (var7_4 == null && var5_5 > 3.0) {
                                var7_4 = lIIllllI.lI(var1_1, var5_5);
                            }
                            if (var7_4 != null && var7_4.getEntity() == var4_3) {
                                if (!this.IllI(var1_1, var7_4, var4_3, var5_5)) {
                                    this.IIlI();
                                    return true;
                                }
                                if (!this.lIlI(var1_1, var4_3)) {
                                    return true;
                                }
                            } else {
                                this.IIlI();
                                return true;
                            }
                            if (this.IlIlI(var1_1, var4_3)) {
                                return true;
                            }
                            var8_7 = lIIllllI.lllIlI(var4_3, var1_1.player);
                            if (!var8_7 || ((Boolean)this.lIIl.lIl()).booleanValue()) {
                                if (this.IlIll(var1_1, var4_3)) {
                                    return true;
                                }
                            } else {
                                this.IlII(var1_1, var7_4, var4_3);
                                return true;
                            }
                            if (!this.IlI(var1_1, var4_3)) break block23;
                            this.IIIIll(var1_1);
                            if (!this.Ill) break block24;
                            if (!this.Illll(var1_1)) break block24;
                            break block25;
                        }
                        this.lIIlI(var1_1, var7_4, var4_3);
                        if (this.Ill && this.Illll(var1_1)) {
                            this.lll = orchard.internal.IlI.Il;
                            this.I = var2_2 + 325L;
                            return true;
                        }
                        break block26;
                    }
                    this.lll = orchard.internal.IlI.Il;
                    this.I = var2_2 + 325L;
                    return true;
                }
                this.IlIIl(var1_1);
                return true;
            }
            this.IlIIl(var1_1);
            return true;
        }
        this.IIlI();
        return true;
    }

    private void IIIIll(MinecraftClient minecraftClient) {
        this.lIIl();
        this.IIllI();
    }

    private static int IIIlIl(int n, int n2) {
        return IIIll[n ^ 0x3F33ACE6] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 6539;
        var7_3 = "\u18d6\u184a\u1862\u183f\u181c\u185a\u18b5\u18e9\u18f6\u18be\u18f3\u1800\u1852\u18cd\u185a\u1878\u7849\u78c2\u78e6\u7882\u7882\u78c2\u784a\u7875\u786d\u780e\u780a\u7894\u78c1\u784e\u78b1\u788b\u7813\u7884\u7860\u7861\u7807\u7895\u785f\u7883\u78dd\u7809\u7872\u78b9\u78e6\u7895\u782c\u78cb\u7818\u7889\u7889\u78b3\u78c6\u7894\u7800\u7835\u782f\u787c\u7865\u78dd\u78f3\u7871\u78b4\u78c0\u7841\u78f6\u7852\u783d\u7860\u78ce\u7805\u78b0\u7899\u7833\u7818\u78ed\u78a3\u78ce\u7842\u78a2\u7807\u78a1\u78cf\u78eb\uad05\uad9a\uadbd\uadcf\uadcf\uad89\uad2b\uad2d\uad31\uad43\uad51\uadd3\uad8d\uad15\uaddb\uadab\u9582\u9524\u9539\u956d\u954b\u950d\u95a0\u95b5\u95aa\u95eb\u95a0\u9548\u950c\u9581\u9505\u9570\u95d8\u954f\u95d0\u9590\u95c8\u955a\u95ac\u9527\uc482\uc424\uc439\uc46d\uc44b\uc40d\uc4a0\uc4d0\u5c51\u5ccb\u5c9c\u5cff\u1d90\u1d36\u1d2b\u1d7f\u1d59\u1d1f\u1db2\u1da7\u1db8\u1df9\u1db2\u1d5a\u1d1e\u1d93\u1d17\u1d62\u1dca\u1d5d\u1dc2\u1d82\u1dda\u1d48\u1dbe\u1d35\u8ce5\u8c7f\u8c28\u8c4b\u6ffd\u6f1f\u6f5e\u6f11\u6f33\u6f62\u6f98\u6fca\u6fec\u6f84\u6fa2\u6f28\u6f70\u6fee\u6f3b\u6f3a\u6fa2\u6f0a\u6fb0\u6f8a\u0fdb\u0f50\u0f4a\u0f03\u0f48\u0f6c\u0ffa\u0fe9\u0ff5\u0fa6\u0f8c\u0f07\u0f52\u0fb2\u0f05\u0f17\u8d64\u8dc2\u8dcf\u8dbc\u8dae\u8de4\u8d00\u8d6e\u8d4e\u8d1d\u8d38\u8db0\u8dfb\u8d77\u8d8c\u8da1\u8d3f\u8dba\u8d24\u8d13\u2a55\u2ac7\u2ac6\u2afb\u297c\u29f5\u29a5\u29bf\u29b7\u29bf\u2940\u2926\u295c\u293a\u295b\u29af\u29f5\u2915\u29a4\u29d4\uf31a\uf3df\uf388\uf3eb\u4a77\u4afe\u4aae\u4ab4\u4abc\u4ab4\u4a4b\u4a2b\u4a58\u4a0b\u4a0b\u4aad\ubc5c\ubcd5\ubc85\ubc9f\ubc97\ubc9f\ubc60\ubc5a\ubc7e\ubc0a\ubc02\ubc84\ubcd2\ubc51\ubcd6\ubcf4\uf50a\uf590\uf5c7\uf5a4\u1121\u11c2\u11a0\u11f9\u11ef\u11b1\u1144\u1116\u1130\u1157\u1107\u11c8\u11a6\u1131\u11e4\u118c\u0529\u05a6\u05b7\u05ec\u05e2\u059f\u053d\u0516\u0500\u0569\u055d\u059b\udd95\udd1b\udd34\udd78\udd58\udd17\uddb6\uddab\udda0\uddd5\uddac\udd7d\udd19\udd94\udd55\udd51\uddcc\udd16\uddab\udde0\u7615\u7689\u7690\u76cd\u76d9\u76b0\u7638\u763c\u7636\u7625\u767c\u76ad\u7698\u763c\u76e9\u76c4\u14e3\u147d\u143d\u142e\u1476\u1452\u14f6\u14d4\u14c1\u1488\u14a6\u1428\u146f\u14e2\u1462\u1427\u14ba\u1428\u14cc\u14de\u14a9\u1426\u14e7\u1437\u1472\u14c9\u1489\u140f\u1cc5\u1c25\u1c6d\u1c1e\u1c08\u1c73\u1cc9\u1cf3\u1cf1\u1c83\u1c99\u1c10\u1c4b\u1cd6\u1c2d\u1c6b\u7628\u76b6\u76b3\u76fd\u76e3\u769f\u763d\u761f\u760e\u761a\u7643\u7697\u76a4\u7629\u76de\u76de\u7666\u76bc\u762d\u7631\u7662\u76f2\u7604\u768f\uc8ec\uc872\uc877\uc839\uc827\uc85f\uc8d7\uc8b0\uc8cb\uc8bd\uc8b5\uc836\u761b\u76f8\u7693\u76d0\u76d5\u769a\u763b\u7621";
        var8_4 = "\u199b\u19cf\u199b\u1993\u1983\u198f\u1993\u198f\u199f\u199b\u199f\u198f\u199b\u198f\u1987\u199b\u198f\u199b\u1987\u199f\u199b\u1997\u199b\u1993\u1987\u1983".toCharArray();
        var9_5 = new String[var8_4.length];
        var13_9 = -1;
        ** GOTO lbl28
lbl7:
        // 1 sources

        while (true) {
            var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
            rIZdmx5SQj6YHA.IIIll[var4_15] = var5_16 ^= var2_2;
            var3_14 += 4;
            if (++var4_15 < var1_13) continue;
            return;
        }
lbl13:
        // 1 sources

        while (true) {
            var11_7 = 0;
            var12_8 = 0;
            if (var13_9 != 0) ** GOTO lbl37
            rIZdmx5SQj6YHA.IIlII = var9_5;
            rIZdmx5SQj6YHA.IIlIl = new Object[var9_5.length];
            var2_2 = -1455134563;
            var0_12 = "i\u0003\u00a5\u00e5\u00f2\u00f3A\u00f0f\u001e\u0001;1\u009d\n!\u00a2\u0080\u00c3\u00f7\u0097\u00ce2H".getBytes("ISO-8859-1");
            var1_13 = var0_12.length / 4;
            rIZdmx5SQj6YHA.IIIll = new int[var1_13];
            var3_14 = 0;
            var4_15 = 0;
            ** continue;
            break;
        }
        while (true) {
            var13_9 = 0;
lbl28:
            // 2 sources

            var10_6 = 0;
            ** continue;
            break;
        }
lbl-1000:
        // 5 sources

        {
            block12: {
                var16_1 = v0;
                v1 = var15_11++;
                var14_10[v1] = (char)(var14_10[v1] ^ var16_1);
                if (var15_11 < var14_10.length) break block12;
                var9_5[var10_6] = new String(var14_10).intern();
                var11_7 += var12_8;
                if (++var10_6 >= var8_4.length) ** continue;
lbl37:
                // 2 sources

                var12_8 = var8_4[var10_6] ^ var6;
                var14_10 = var7_3.substring(var11_7, var11_7 + var12_8).toCharArray();
                var15_11 = 0;
            }
            switch (var15_11 % 5) {
                case 4: {
                    v0 = 38;
                    continue block9;
                }
                case 1: {
                    v0 = 95;
                    continue block9;
                }
                case 3: {
                    v0 = 15;
                    continue block9;
                }
                case 2: {
                    v0 = 102;
                    continue block9;
                }
            }
            v0 = 47;
            ** while (true)
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IIIllI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x1DAB833C;
        char[] cArray = IIlII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIlIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            rIZdmx5SQj6YHA.IIlIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x327509F4;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 11: {
                    n6 = 10;
                    continue block33;
                }
                case 18: {
                    n6 = 171;
                    continue block33;
                }
                case 1: {
                    n6 = 80;
                    continue block33;
                }
                case 12: {
                    n6 = 112;
                    continue block33;
                }
                case 4: {
                    n6 = 91;
                    continue block33;
                }
                case 3: {
                    n6 = 88;
                    continue block33;
                }
                case 21: {
                    n6 = 49;
                    continue block33;
                }
                case 15: {
                    n6 = 102;
                    continue block33;
                }
                case 29: {
                    n6 = 113;
                    continue block33;
                }
                case 20: {
                    n6 = 213;
                    continue block33;
                }
                case 28: {
                    n6 = 42;
                    continue block33;
                }
                case 6: {
                    n6 = 211;
                    continue block33;
                }
                default: {
                    n6 = 135;
                    continue block33;
                }
                case 17: {
                    n6 = 6;
                    continue block33;
                }
                case 24: {
                    n6 = 57;
                    continue block33;
                }
                case 9: {
                    n6 = 254;
                    continue block33;
                }
                case 7: {
                    n6 = 208;
                    continue block33;
                }
                case 2: {
                    n6 = 82;
                    continue block33;
                }
                case 13: {
                    n6 = 143;
                    continue block33;
                }
                case 22: {
                    n6 = 212;
                    continue block33;
                }
                case 19: {
                    n6 = 181;
                    continue block33;
                }
                case 31: {
                    n6 = 99;
                    continue block33;
                }
                case 14: {
                    n6 = 77;
                    continue block33;
                }
                case 30: {
                    n6 = 243;
                    continue block33;
                }
                case 8: {
                    n6 = 164;
                    continue block33;
                }
                case 16: {
                    n6 = 158;
                    continue block33;
                }
                case 25: {
                    n6 = 135;
                    continue block33;
                }
                case 27: {
                    n6 = 26;
                    continue block33;
                }
                case 5: {
                    n6 = 1;
                    continue block33;
                }
                case 26: {
                    n6 = 218;
                    continue block33;
                }
                case 23: {
                    n6 = 78;
                    continue block33;
                }
                case 10: 
            }
            n6 = 230;
        }
        return new String(cArray).intern();
    }
}

