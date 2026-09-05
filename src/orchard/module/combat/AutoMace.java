/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllIIl
 * Module         : AutoMace  [COMBAT]
 * Description    : Aims and lands a mace smash on nearby opponents while falling.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Min Fall Distance
 *   - .getBytes(
 *   - _sword
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
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.MaceItem
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package orchard.module.combat;

import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MaceItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIlIlll;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIIlII;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IIlIlIll;
import orchard.internal.IIlllIIIl;
import orchard.internal.IIlllIlII;
import orchard.internal.IlIIlllll;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlIll;
import orchard.internal.IlIllIll;
import orchard.internal.IlIlllI;
import orchard.internal.lIIIlIl;
import orchard.internal.lIIlIlI;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIllIl;
import orchard.internal.llIll;
import orchard.internal.lllllII;
import orchard.module.combat.KillAura;
import orchard.module.combat.PlayerFreeze;

@Environment(value=EnvType.CLIENT)
public final class AutoMace
extends ModuleBase {
    private boolean I;
    private final IIIIIIIIl<IIlllIlII> l;
    private static final long II = 1000L;
    private int Il;
    private IIIIlIlll lI;
    private static final double ll = 0.9;
    private final lIlIIlI III;
    private EntityHitResult IIl;
    private final llIll IlI;
    private long Ill;
    private long lII;
    private int lIl;
    private static final double llI = 1.0E-4;
    private long lll;
    private boolean IIII;
    private boolean IIIl;
    private final lIlIIlI IIlI;
    private PlayerEntity IIll;
    private static final long IlII = 500L;
    private long IlIl;
    private PlayerEntity IllI;
    private long Illl;
    private static final long lIII = 1500L;
    private final lIlIIlI lIIl;
    private int lIlI;
    private IlIlIll lIll;
    private final IIIlIlIIl llII;
    private boolean llIl;
    private IIlIlIll lllI;
    private static final double llll = 3.0;
    private long IIIII;
    private double IIIIl;
    private final IIIIIIIIl<lIIlIlI> IIIlI;
    private final llIll IIIll;
    private final lllllII IIlII;
    private final lIlIIlI IIlIl;
    private boolean IIllI;
    private static final double IIlll = 3.0;
    private long IlIII;
    private boolean IlIIl;
    private final IIIIIIIIl<IlIllIll> IlIlI;
    private static final long IlIll = 2500L;
    private boolean IllII;
    private static final int IllIl = 9;
    private final IIIlIlIIl IlllI;
    private double Illll;
    private long lIIII;
    private final llIll lIIIl;
    private final IlIlIlI lIIlI;
    private int lIIll;
    private static final int[] lIlII;
    private static final String[] lIlIl;
    private static final Object[] lIllI;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean I(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.lIIII != lIIIlIl.lIllI()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void l(MinecraftClient minecraftClient, long l2, IIIIlIlll iIIIlIlll) {
        long l3;
        if (l2 == this.Illl && this.IlIIIl(minecraftClient)) {
            this.lI = null;
            this.IIl = null;
            l3 = System.currentTimeMillis();
        }
        this.IIlll(minecraftClient, l2, iIIIlIlll, false);
        return;
        this.IlIIll(iIIIlIlll != IIIIlIlll.II ? IIlIlIll.I : IIlIlIll.II, l3);
        this.lll = l3 + 50L;
    }

    /*
     * Unable to fully structure code
     */
    private int lI(MinecraftClient var1_1) {
        block18: {
            block13: {
                block14: {
                    block15: {
                        block16: {
                            block11: {
                                block10: {
                                    block17: {
                                        block12: {
                                            block9: {
                                                if (var1_1 == null) break block15;
                                                break block16;
lbl3:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl5:
                                                // 1 sources

                                                while (true) {
                                                    var4_4 = var6_6;
                                                    ** GOTO lbl12
                                                    break;
                                                }
lbl8:
                                                // 1 sources

                                                while (true) {
                                                    break block9;
                                                    break;
                                                }
lbl10:
                                                // 1 sources

                                                while (true) {
                                                    if (var7_7.getItem() instanceof MaceItem) break block10;
lbl12:
                                                    // 4 sources

                                                    while (true) {
                                                        ++var6_6;
                                                        break block11;
                                                        break;
                                                    }
lbl15:
                                                    // 1 sources

                                                    while (var6_6 != var3_3) {
                                                        v0 = 0;
                                                        break block12;
                                                    }
                                                    break block13;
                                                    break;
                                                }
                                            }
                                            var2_2 = this.IIIIII(var1_1.player);
                                            break block17;
                                        }
lbl23:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var3_3 = lIIllllI.lllI(var1_1.player.getInventory());
                                    var4_4 = -1;
                                    ** while (true)
                                }
                                var8_8 = this.IIIlll(var7_7, var2_2.lI);
                                var9_9 = this.IIIlll(var7_7, var2_2.l);
                                ** GOTO lbl15
                            }
lbl34:
                            // 2 sources

                            while (true) {
                                if (var6_6 >= 9) {
                                    return var4_4;
                                }
                                break block14;
                                break;
                            }
                        }
                        ** while (var1_1.player != null)
                    }
                    return -1;
                    var10_10 = var8_8 * 1000 + var9_9 * 100 + v0;
                    if (var10_10 <= var5_5) ** GOTO lbl12
                    break block18;
                }
                var7_7 = var1_1.player.getInventory().getStack(var6_6);
                if (var7_7 != null) ** break;
                ** while (true)
                ** while (true)
            }
            v0 = 1;
            ** while (true)
        }
        var5_5 = var10_10;
        ** while (true)
        var5_5 = -2147483648;
        var6_6 = 0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIl(MinecraftClient minecraftClient, long l2, IIIIlIlll iIIIlIlll) {
        Vec3d vec3d;
        if (l2 == this.Illl && this.lllI == IIlIlIll.Il && this.lI == iIIIlIlll && this.IlIIIl(minecraftClient) && this.IlIlII(minecraftClient, iIIIlIlll) && IlIlllI.lllll()) {
            if (this.I(minecraftClient)) {
                this.l(minecraftClient, l2, iIIIlIlll);
                return false;
            }
        } else {
            this.IIlll(minecraftClient, l2, iIIIlIlll, false);
            return false;
        }
        if (this.IllIII(minecraftClient, (Entity)this.IIll)) {
            this.IIlll(minecraftClient, l2, iIIIlIlll, false);
            return false;
        }
        if (!this.IIlIll(minecraftClient, iIIIlIlll)) {
            this.l(minecraftClient, l2, iIIIlIlll);
            return false;
        }
        if (!this.llIII(minecraftClient, (Entity)this.IIll, this.Illl())) {
            this.l(minecraftClient, l2, iIIIlIlll);
            return false;
        }
        EntityHitResult entityHitResult = lIIllllI.IIIllII(minecraftClient, (LivingEntity)this.IIll, this.Illl(), true);
        if (entityHitResult == null && this.IIl != null && this.IIl.getEntity() == this.IIll && this.IlllII(minecraftClient, this.IIll)) {
            entityHitResult = this.IIl;
        }
        if (entityHitResult == null) {
            entityHitResult = this.lllII(minecraftClient, this.IIll);
        }
        if (entityHitResult == null && (vec3d = this.llllI(minecraftClient, this.IIll, this.Illl())) != null) {
            entityHitResult = new EntityHitResult((Entity)this.IIll, vec3d);
        }
        if (entityHitResult == null) {
            this.l(minecraftClient, l2, iIIIlIlll);
            return false;
        }
        boolean bl = lIIllllI.IIlllIl(minecraftClient, entityHitResult);
        if (bl) {
            this.llIlI(minecraftClient);
        }
        this.IIlll(minecraftClient, l2, iIIIlIlll, bl);
        return bl;
    }

    public float IlI(float f) {
        return this.IIlII.III(f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lII(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) {
            this.lIIl();
            return;
        }
        long l2 = clientPlayerEntity.age;
        if (l2 == this.IIIII) {
            if (!(clientPlayerEntity.getVelocity().y < 0.0)) return;
            if (Double.isNaN(this.Illll)) return;
            this.IIIIl = Math.max(this.IIIIl, this.Illll - clientPlayerEntity.getY());
            return;
        }
        this.IIIII = l2;
        if (!(clientPlayerEntity.isOnGround() || clientPlayerEntity.isClimbing() || clientPlayerEntity.isTouchingWater() || clientPlayerEntity.isGliding() || clientPlayerEntity.isRiding())) {
            double d = clientPlayerEntity.getY();
            if (!(clientPlayerEntity.getVelocity().y < 0.0)) {
                this.Illll = d;
                this.IIIIl = 0.0;
                this.IlIII = 0L;
                this.llIl = false;
                return;
            }
            ++this.IlIII;
            if (Double.isNaN(this.Illll) || d > this.Illll) {
                this.Illll = d;
            }
            this.IIIIl = Math.max(this.IIIIl, this.Illll - d);
            return;
        }
        this.lIIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private float[] lIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) {
            return null;
        }
        if (this.IllII() && minecraftClient.gameRenderer != null && minecraftClient.gameRenderer.getCamera() != null) {
            return new float[]{minecraftClient.gameRenderer.getCamera().getYaw(), minecraftClient.gameRenderer.getCamera().getPitch()};
        }
        return new float[]{minecraftClient.player.getYaw(), minecraftClient.player.getPitch()};
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llI(MinecraftClient minecraftClient, int n) {
        block9: {
            block10: {
                block8: {
                    this.IIII = false;
                    if (minecraftClient == null) return false;
                    if (minecraftClient.player == null) return false;
                    if (n < 0) return false;
                    if (n >= 9) {
                        return false;
                    }
                    if (this.lIll == null && this.I(minecraftClient)) {
                        return false;
                    }
                    if (this.lIll == null && lIIllllI.IIllII(minecraftClient)) {
                        return false;
                    }
                    if (this.lIll == null) break block8;
                    if (this.lIll.l() != n) break block9;
                    break block10;
                }
                int n2 = lIIllllI.llIllI(minecraftClient);
                if ((n2 == n || lIIllllI.lllI(minecraftClient.player.getInventory()) == n) && lIIllllI.lll(minecraftClient, n)) {
                    return true;
                }
                this.lIll = lIIllllI.IIIIlII(minecraftClient, this, n, 0, true);
                if (this.lIll != null && this.lIll.Il()) {
                    if (!lIIllllI.IIIllll(minecraftClient, this.lIll)) {
                        return false;
                    }
                    this.IIII = this.lIll.ll();
                    this.lIll = null;
                    this.IlIIl = lIIllllI.lIlII(this);
                    return lIIllllI.lll(minecraftClient, n);
                }
                this.lIll = null;
                return false;
            }
            if (this.lIll.Il()) {
                if (lIIllllI.IIIllll(minecraftClient, this.lIll)) {
                    this.IIII = this.lIll.ll();
                    this.lIll = null;
                    this.IlIIl = lIIllllI.lIlII(this);
                    return lIIllllI.lll(minecraftClient, n);
                }
                return false;
            }
        }
        this.lIll = null;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lll(MinecraftClient minecraftClient, long l2) {
        if (l2 < this.lll) {
            return;
        }
        if (!this.IlIlII(minecraftClient, IIIIlIlll.II)) {
            this.IlIIll(IIlIlIll.l, l2);
            return;
        }
        if (!this.IIlIll(minecraftClient, IIIIlIlll.II)) {
            return;
        }
        EntityHitResult entityHitResult = this.lllII(minecraftClient, this.IIll);
        if (entityHitResult != null) {
            this.lIIIl(minecraftClient);
            if (this.IIllll(minecraftClient, IIIIlIlll.II, entityHitResult, l2)) {
                return;
            }
            if (this.lIlIl(minecraftClient, IIIIlIlll.II, entityHitResult)) {
                return;
            }
            this.IlIIll(IIlIlIll.ll, l2);
            this.llII(minecraftClient, l2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIII(MinecraftClient minecraftClient, PlayerEntity playerEntity, EntityHitResult entityHitResult) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (playerEntity == null) return false;
        if (entityHitResult == null) return false;
        if (entityHitResult.getEntity() != playerEntity) return false;
        if (entityHitResult.getPos() == null) {
            return false;
        }
        double d = this.Illl() + 1.0E-4;
        Vec3d vec3d = minecraftClient.player.getEyePos();
        if (!(vec3d.squaredDistanceTo(entityHitResult.getPos()) <= d * d)) return false;
        if (!this.IIlI(minecraftClient, vec3d, entityHitResult.getPos())) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlI(MinecraftClient minecraftClient, Vec3d vec3d, Vec3d vec3d2) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (vec3d == null) return false;
        if (vec3d2 == null) {
            return false;
        }
        BlockHitResult blockHitResult = minecraftClient.world.raycast(new RaycastContext(vec3d, vec3d2, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)minecraftClient.player));
        if (blockHitResult == null) return true;
        if (blockHitResult.getType() == HitResult.Type.MISS) return true;
        if (vec3d.squaredDistanceTo(blockHitResult.getPos()) + 1.0E-4 >= vec3d.squaredDistanceTo(vec3d2)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) return true;
        if (clientPlayerEntity.isUsingItem()) return true;
        if (clientPlayerEntity.isGliding()) return true;
        if (clientPlayerEntity.isRiding()) return true;
        if (clientPlayerEntity.isTouchingWater()) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IllI(Entity entity) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return false;
        if (entity != minecraftClient.player) return false;
        if (!this.IllII()) return false;
        return true;
    }

    private double Illl() {
        return MathHelper.clamp((double)((Double)this.lIIl.lIl()), (double)1.0, (double)3.0);
    }

    public float lIII(float f) {
        return this.IIlII.lI(f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIl() {
        this.IIIII = Long.MIN_VALUE;
        this.IlIII = 0L;
        this.Illll = Double.NaN;
        this.IIIIl = 0.0;
        this.llIl = false;
        this.lII = 0L;
    }

    /*
     * Unable to fully structure code
     */
    private PlayerEntity lIlI(MinecraftClient var1_1, PlayerEntity var2_2) {
        block12: {
            block8: {
                block9: {
                    if (!this.IIIII(var1_1, var2_2)) break block9;
                    return var2_2;
lbl3:
                    // 1 sources

                    while (true) {
                        block11: {
                            block10: {
                                if (var1_1.player != null) break block10;
lbl5:
                                // 3 sources

                                return null;
lbl7:
                                // 1 sources

                                while (!this.lIIlI(var1_1, var6_6, (Double)this.III.lIl())) {
                                    break block8;
                                }
                                break block11;
lbl10:
                                // 1 sources

                                while (true) {
                                    var6_6 = (PlayerEntity)var5_5.next();
                                    ** GOTO lbl7
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var4_4 = var7_7;
                                    var3_3 = var6_6;
                                    break block8;
                                    break;
                                }
lbl17:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl19:
                                // 1 sources

                                return var3_3;
                            }
                            var3_3 = null;
                            ** continue;
                            var4_4 = null;
                            var5_5 = var1_1.world.getPlayers().iterator();
                            break block8;
                        }
                        var7_7 = this.IlllI(var1_1, var6_6);
                        if (this.llIl(var7_7, var4_4)) {
                            ** continue;
                        }
                        break block8;
                        break;
                    }
                }
                if (var1_1 == null) ** GOTO lbl5
                break block12;
            }
            ** while (!var5_5.hasNext())
lbl37:
            // 1 sources

            ** while (true)
        }
        if (var1_1.world != null) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean lIll() {
        if (this.lllI == IIlIlIll.lI) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llII(MinecraftClient minecraftClient, long l2) {
        block12: {
            block10: {
                block11: {
                    block9: {
                        block8: {
                            block7: {
                                if (l2 < this.lll) {
                                    return;
                                }
                                int n = this.lI(minecraftClient);
                                if (n >= 0) {
                                    this.Il = n;
                                }
                                if (this.Il >= 0 && this.IlIll(minecraftClient, this.Il, MaceItem.class)) break block7;
                                this.Il = this.lI(minecraftClient);
                                if (this.Il < 0) break block8;
                            }
                            if (!this.llI(minecraftClient, this.Il)) {
                                if (l2 - this.IlIl <= 500L) return;
                                this.IIlIII(minecraftClient, true);
                                return;
                            }
                            break block9;
                        }
                        if (!this.I) break block10;
                        break block11;
                    }
                    this.IlIIll(IIlIlIll.I, l2);
                    this.lll = this.IIIllI(l2, this.IIII);
                    return;
                }
                if (this.lIlI >= 0) break block12;
            }
            this.IIlIII(minecraftClient, true);
            return;
        }
        this.IlIIll(IIlIlIll.l, l2);
        this.lllI(minecraftClient, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIl(IIIlIIlII iIIlIIlII, IIIlIIlII iIIlIIlII2) {
        if (iIIlIIlII2 == null) {
            return true;
        }
        switch (((lIIlIlI)((Object)this.IIIlI.lIl())).ordinal()) {
            case 2: {
                boolean bl = AutoMace.IIIIIl(iIIlIIlII.II(), iIIlIIlII.l(), iIIlIIlII.Il(), iIIlIIlII2.II(), iIIlIIlII2.l(), iIIlIIlII2.Il());
                return bl;
            }
            case 1: {
                boolean bl = AutoMace.IIIIIl(iIIlIIlII.Il(), iIIlIIlII.II(), iIIlIIlII.l(), iIIlIIlII2.Il(), iIIlIIlII2.II(), iIIlIIlII2.l());
                return bl;
            }
            case 0: {
                boolean bl = AutoMace.IIIIIl(iIIlIIlII.l(), iIIlIIlII.II(), iIIlIIlII.Il(), iIIlIIlII2.l(), iIIlIIlII2.II(), iIIlIIlII2.Il());
                return bl;
            }
        }
        throw new MatchException(null, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllI(MinecraftClient minecraftClient, long l2) {
        if (this.I && this.lIlI >= 0) {
            if (l2 < this.lll) {
                return;
            }
            if (!this.llI(minecraftClient, this.lIlI)) {
                if (l2 - this.IlIl <= 500L) return;
                this.IlIIll(IIlIlIll.ll, l2);
                return;
            }
            this.IlIIll(IIlIlIll.II, l2);
            this.lll = this.IIIllI(l2, this.IIII);
            return;
        }
        this.IlIIll(IIlIlIll.ll, l2);
        this.llII(minecraftClient, l2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIIII(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        if (playerEntity == null) return false;
        if (!this.lIIlI(minecraftClient, playerEntity, (Double)this.III.lIl())) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (lIIllllI.IIIIll(minecraftClient) > 0) return false;
        if (!lIIllllI.IIlIIlI(minecraftClient, 0.9, false)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIll(MinecraftClient minecraftClient) {
        long l2 = System.currentTimeMillis();
        if (l2 < this.lII) return;
        if (!this.IIllII(minecraftClient.player)) return;
        if (orchard.internal.IIlI.IIl(minecraftClient)) return;
        if (this.IlII(minecraftClient.player)) {
            return;
        }
        if (((Boolean)this.IIIll.lIl()).booleanValue() && !this.IllIl(minecraftClient.player.getMainHandStack())) {
            return;
        }
        PlayerEntity playerEntity = this.lIlI(minecraftClient, this.IllI);
        if (playerEntity == null) return;
        if (!this.IlllII(minecraftClient, playerEntity)) {
            return;
        }
        Vec3d vec3d = this.llllI(minecraftClient, playerEntity, this.Illl());
        if (vec3d != null) {
            this.IIll = playerEntity;
            this.IllI = playerEntity;
            this.Il = this.lI(minecraftClient);
            if (this.Il < 0) {
                this.IIll = null;
                return;
            }
        } else {
            return;
        }
        boolean bl = lIIllllI.lllIlI((LivingEntity)playerEntity, minecraftClient.player);
        this.lIlI = !bl || (Boolean)this.lIIIl.lIl() == false ? -1 : this.IlIIII(minecraftClient);
        this.I = this.lIlI >= 0;
        this.lIl = lIIllllI.lllI(minecraftClient.player.getInventory());
        this.IllII = false;
        this.Ill = l2 + (!this.I ? 2500L : 1500L) + (this.IIlIl() + this.IlIllI()) * 2L;
        this.IlIIll(this.I ? IIlIlIll.l : IIlIlIll.ll, l2);
        this.IIIIlI(minecraftClient);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIlII(LivingEntity livingEntity) {
        if (livingEntity == null) return false;
        if (livingEntity != this.IIll) return false;
        if (this.lllI == IIlIlIll.lI) return false;
        return true;
    }

    private long IIlIl() {
        return this.lIllI(this.IlllI);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIllI(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        float[] fArray;
        if (!this.lIIlI(minecraftClient, playerEntity, (Double)this.III.lIl())) {
            return;
        }
        Vec3d vec3d = this.llllI(minecraftClient, playerEntity, (Double)this.III.lIl());
        if (vec3d == null && playerEntity != null) {
            vec3d = playerEntity.getBoundingBox().getCenter();
        }
        if ((fArray = IlIlllI.IlIll(minecraftClient, vec3d)) == null) {
            return;
        }
        this.lIIlI.lIlllI(minecraftClient, vec3d, ((Double)this.IIlIl.lIl()).floatValue(), playerEntity.getId());
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlll(MinecraftClient minecraftClient, long l2, IIIIlIlll iIIIlIlll, boolean bl) {
        if (l2 != this.Illl) {
            return;
        }
        long l3 = System.currentTimeMillis();
        this.IIl = null;
        if (!bl) {
            this.IIlIII(minecraftClient, true);
            return;
        }
        if (iIIIlIlll != IIIIlIlll.II) {
            this.IIlIIl(l3);
            this.IllII = true;
            this.llIl = true;
            this.IIlIII(minecraftClient, true);
            return;
        }
        this.IIIl = true;
        this.Ill = l3 + 1500L;
        this.lIIll = minecraftClient.player.age;
        this.IlIIll(IIlIlIll.ll, l3);
        this.llII(minecraftClient, l3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIII() {
        this.lllI = IIlIlIll.lI;
        this.lI = null;
        this.IIl = null;
        this.IlIl = 0L;
        this.lll = 0L;
        this.Ill = 0L;
        this.lIIII = Long.MIN_VALUE;
        this.IIll = null;
        this.lIl = -1;
        this.lIlI = -1;
        this.Il = -1;
        this.I = false;
        this.IIIl = false;
        this.lIIll = Integer.MIN_VALUE;
        this.IllII = false;
        this.lIll = null;
        this.IIII = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIIl(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (minecraftClient.player.isSpectator()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIlI(MinecraftClient minecraftClient, long l2) {
        block10: {
            block11: {
                block12: {
                    block8: {
                        block9: {
                            if (l2 < this.lll) {
                                return;
                            }
                            if (!this.I && !this.IIllII(minecraftClient.player)) break block8;
                            int n = this.lI(minecraftClient);
                            if (n < 0) {
                                this.IIlIII(minecraftClient, true);
                                return;
                            }
                            if (n != this.Il) {
                                this.Il = n;
                                this.IlIIll(IIlIlIll.ll, l2);
                                this.llII(minecraftClient, l2);
                                return;
                            }
                            if (this.IlIlII(minecraftClient, IIIIlIlll.l)) break block9;
                            if (!this.I) break block10;
                            break block11;
                        }
                        if (!this.IIlIll(minecraftClient, IIIIlIlll.l)) {
                            return;
                        }
                        break block12;
                    }
                    this.IIlIII(minecraftClient, true);
                    return;
                }
                EntityHitResult entityHitResult = this.lllII(minecraftClient, this.IIll);
                if (entityHitResult == null) return;
                this.lIIIl(minecraftClient);
                if (this.IIllll(minecraftClient, IIIIlIlll.l, entityHitResult, l2)) {
                    return;
                }
                if (this.lIlIl(minecraftClient, IIIIlIlll.l, entityHitResult)) return;
                this.IIlIII(minecraftClient, true);
                return;
            }
            if (lIIllllI.lllIlI((LivingEntity)this.IIll, minecraftClient.player) && this.lIlI >= 0) {
                this.IlIIll(IIlIlIll.l, l2);
                this.lllI(minecraftClient, l2);
                return;
            }
        }
        this.IlIIll(IIlIlIll.ll, l2);
        this.llII(minecraftClient, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIll(MinecraftClient minecraftClient, int n, Class<?> clazz) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n < 9) {
            ItemStack itemStack = minecraftClient.player.getInventory().getStack(n);
            if (itemStack == null) return false;
            if (clazz.isInstance(itemStack.getItem())) return lIIllllI.lll(minecraftClient, n);
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        this.lII(minecraftClient == null ? null : minecraftClient.player);
        if (this.IlIIl(minecraftClient)) {
            if (this.lllI == IIlIlIll.lI) {
                this.IIIll(minecraftClient);
            }
            if (this.lllI == IIlIlIll.lI) return;
            this.lIIIl(minecraftClient);
            this.IIIIlI(minecraftClient);
            return;
        }
        if (this.lllI == IIlIlIll.lI) return;
        this.IIlIII(minecraftClient, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IllII() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIIlIIl()) return false;
        if (this.l.lIl() != IIlllIlII.Il) return false;
        if (!this.IIlII.IIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.currentScreen == null) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllIl(ItemStack itemStack) {
        if (itemStack == null) return false;
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
    private IIIlIIlII IlllI(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        Vec3d vec3d = minecraftClient.player.getEyePos();
        Vec3d vec3d2 = this.llllI(minecraftClient, playerEntity, (Double)this.III.lIl());
        Vec3d vec3d3 = vec3d2 != null ? vec3d2 : AutoMace.lllIl(vec3d, playerEntity.getBoundingBox());
        double d = vec3d.distanceTo(vec3d3);
        float[] fArray = IlIlllI.IlIll(minecraftClient, vec3d3);
        float[] fArray2 = this.lIl(minecraftClient);
        double d2 = fArray != null && fArray2 != null ? Math.hypot(MathHelper.wrapDegrees((float)(fArray[0] - fArray2[0])), fArray[1] - fArray2[1]) : 180.0;
        return new IIIlIIlII(playerEntity, d, d2, playerEntity.getHealth());
    }

    private void lIIIl(MinecraftClient minecraftClient) {
        if (minecraftClient != null) {
            if (minecraftClient.options != null && minecraftClient.options.attackKey != null) {
                minecraftClient.options.attackKey.setPressed(false);
                return;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIlI(MinecraftClient minecraftClient, PlayerEntity playerEntity, double d) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (playerEntity == null) return false;
        if (playerEntity == minecraftClient.player) return false;
        if (!playerEntity.isAlive()) return false;
        if (playerEntity.isSpectator()) return false;
        if (playerEntity.isCreative()) return false;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null) {
            if (clientEntrypoint.IlI() != null && clientEntrypoint.IlI().lIIllI() != null && clientEntrypoint.IlI().lIIllI().lll(playerEntity)) {
                return false;
            }
        }
        if (this.llllI(minecraftClient, playerEntity, d) != null) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIll(MinecraftClient minecraftClient, IIIIlIlll iIIIlIlll) {
        if (iIIIlIlll != IIIIlIlll.l) return false;
        if (!this.I) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.lIIll == Integer.MIN_VALUE) return false;
        if (minecraftClient.player.age - this.lIIll > 1) return false;
        if (!this.llIII(minecraftClient, (Entity)this.IIll, this.Illl())) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.lIIlI.IlIIIlI();
        ++this.Illl;
        if (this.IIllI && ((Boolean)this.IlI.lIl()).booleanValue()) {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        } else {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
        }
        this.IIllI = false;
        this.IIIlIl(minecraftClient, false);
        this.lIIl();
        this.IlIlll();
        this.IlIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lIlII(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) {
            return 0.0;
        }
        double d = Double.isNaN(this.Illll) ? 0.0 : Math.max(0.0, this.Illll - clientPlayerEntity.getY());
        return Math.max(this.IIIIl, d);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlIl(MinecraftClient minecraftClient, IIIIlIlll iIIIlIlll, EntityHitResult entityHitResult) {
        if (!this.IlIIIl(minecraftClient)) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) {
            return false;
        }
        long l2 = ++this.Illl;
        long l3 = System.currentTimeMillis();
        int n = iIIIlIlll != IIIIlIlll.II ? this.Il : this.lIlI;
        if (n < 0) return false;
        if (n >= 9) {
            return false;
        }
        if (!this.IlIlII(minecraftClient, iIIIlIlll)) {
            return false;
        }
        this.IlIIl = lIIllllI.lIlII(this);
        this.lI = iIIIlIlll;
        this.IIl = entityHitResult;
        this.IlIIll(IIlIlIll.Il, l3);
        float[] fArray = IlIlllI.IlIll(minecraftClient, entityHitResult.getPos());
        if (fArray == null) {
            this.IIlll(minecraftClient, l2, iIIIlIlll, false);
            return false;
        }
        boolean bl = this.lIIll(minecraftClient, iIIIlIlll);
        if (bl) {
            this.lIIll = Integer.MIN_VALUE;
        }
        boolean bl2 = bl ? IlIlllI.IlII(minecraftClient, 300, fArray[0], fArray[1], () -> this.IIl(minecraftClient, l2, iIIIlIlll)) : IlIlllI.IIl(minecraftClient, 300, fArray[0], fArray[1], () -> this.IIl(minecraftClient, l2, iIIIlIlll));
        if (bl2) return true;
        this.lI = null;
        this.IIl = null;
        this.IlIIll(iIIIlIlll != IIIIlIlll.II ? IIlIlIll.I : IIlIlIll.II, l3);
        this.lll = l3 + 50L;
        return true;
    }

    private long lIllI(IIIlIlIIl iIIlIlIIl) {
        double d;
        double d2 = iIIlIlIIl.IIIl();
        if (d2 != (d = iIIlIlIIl.IIII())) {
            return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d2, d)));
        }
        return Math.max(0L, Math.round(d2));
    }

    private boolean llIII(MinecraftClient minecraftClient, Entity entity, double d) {
        return IlIlllI.lllII(minecraftClient, entity, d);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    protected boolean llIIl() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return true;
        if (clientEntrypoint.IlI() == null) return true;
        KillAura killAura = clientEntrypoint.IlI().llIIIl();
        if (killAura == null) return true;
        if (!killAura.IIIlIIl()) return true;
        IIlllIIIl.ll().Il(IlIIlllll.I, StringFactory.IIl("sZpXkxRHUQiWCpNcT97Rmo2YUY8="), "", 3200L);
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void llIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null || minecraftClient.player == null) {
            return;
        }
        this.lIIII = lIIIlIl.lIllI();
    }

    public void llIll(float f, float f2, float f3, float f4) {
        this.IIlII.Il(f, f2, f3, f4);
    }

    /*
     * Enabled aggressive block sorting
     */
    private EntityHitResult lllII(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        if (!this.IlllII(minecraftClient, playerEntity)) {
            return null;
        }
        EntityHitResult entityHitResult = lIIllllI.lI(minecraftClient, this.Illl());
        if (this.IIII(minecraftClient, playerEntity, entityHitResult)) {
            return entityHitResult;
        }
        Vec3d vec3d = this.llllI(minecraftClient, playerEntity, this.Illl());
        if (vec3d == null) return null;
        EntityHitResult entityHitResult2 = new EntityHitResult((Entity)playerEntity, vec3d);
        return entityHitResult2;
    }

    private static Vec3d lllIl(Vec3d vec3d, Box box) {
        return new Vec3d(MathHelper.clamp((double)vec3d.x, (double)box.minX, (double)box.maxX), MathHelper.clamp((double)vec3d.y, (double)box.minY, (double)box.maxY), MathHelper.clamp((double)vec3d.z, (double)box.minZ, (double)box.maxZ));
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d llllI(MinecraftClient minecraftClient, PlayerEntity playerEntity, double d) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (playerEntity == null) {
            return null;
        }
        Vec3d vec3d = minecraftClient.player.getEyePos();
        Box box = playerEntity.getBoundingBox();
        double d2 = d + 1.0E-4;
        double d3 = d2 * d2;
        Vec3d vec3d2 = AutoMace.IIIlII(vec3d, box);
        if (vec3d.squaredDistanceTo(vec3d2) <= d3 && this.IIlI(minecraftClient, vec3d, vec3d2)) {
            return vec3d2;
        }
        Vec3d vec3d3 = box.getCenter();
        if (vec3d.squaredDistanceTo(vec3d3) <= d3 && this.IIlI(minecraftClient, vec3d, vec3d3)) {
            return vec3d3;
        }
        Vec3d vec3d4 = playerEntity.getEyePos();
        if (!(vec3d.squaredDistanceTo(vec3d4) <= d3) || !this.IIlI(minecraftClient, vec3d, vec3d4)) {
            Vec3d vec3d5 = new Vec3d(vec3d3.x, vec3d4.y - 0.35, vec3d3.z);
            if (!(vec3d.squaredDistanceTo(vec3d5) <= d3)) return null;
            if (!this.IIlI(minecraftClient, vec3d, vec3d5)) return null;
            return vec3d5;
        }
        return vec3d4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllll(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) return false;
        if (clientPlayerEntity.isOnGround()) return false;
        if (clientPlayerEntity.isClimbing()) return false;
        if (clientPlayerEntity.isTouchingWater()) return false;
        if (clientPlayerEntity.isGliding()) return false;
        if (clientPlayerEntity.isRiding()) return false;
        if (!(clientPlayerEntity.getVelocity().y < -0.08)) return false;
        if (this.lIlII(clientPlayerEntity) > 0.0) return true;
        if (this.IlIII < 1L) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private lIllIl IIIIII(ClientPlayerEntity var1_1) {
        block7: {
            block6: {
                switch (((IlIllIll)this.IlIlI.lIl()).ordinal()) {
                    case 2: {
                        v0 = lIllIl.Il;
                        break block6;
                    }
                    case 0: {
                        if (!(this.IIlIlI(var1_1) > 3.0)) break;
                        break block7;
                    }
                    default: {
                        throw new MatchException(null, null);
                    }
                }
                v0 = lIllIl.Il;
            }
lbl12:
            // 3 sources

            return v0;
        }
        v0 = lIllIl.II;
        ** GOTO lbl12
        {
            ** case 1:
        }
lbl18:
        // 1 sources

        v0 = lIllIl.II;
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean IIIIIl(double d, double d2, double d3, double d4, double d5, double d6) {
        block1: {
            block2: {
                if (Math.abs(d - d4) > 1.0E-4) break block1;
                if (!(Math.abs(d2 - d5) > 1.0E-4)) break block2;
                if (!(d2 < d5)) return false;
                return true;
            }
            if (!(d3 < d6)) return false;
            return true;
        }
        if (!(d < d4)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIlI(MinecraftClient minecraftClient) {
        long l2 = System.currentTimeMillis();
        if (this.lllI != IIlIlIll.lI) {
            if (this.IlIIIl(minecraftClient) && l2 <= this.Ill) {
                if (this.lllI == IIlIlIll.Il) {
                    if (l2 - this.IlIl <= 1000L) return;
                    ++this.Illl;
                    this.IIlIII(minecraftClient, true);
                    return;
                }
                this.IIllI(minecraftClient, this.IIll);
                switch (this.lllI.ordinal()) {
                    case 1: {
                        this.lllI(minecraftClient, l2);
                        return;
                    }
                    case 4: {
                        this.IlIlI(minecraftClient, l2);
                        return;
                    }
                    case 3: {
                        this.llII(minecraftClient, l2);
                        return;
                    }
                    case 2: {
                        this.lll(minecraftClient, l2);
                        return;
                    }
                }
                return;
            }
        } else {
            return;
        }
        this.IIlIII(minecraftClient, true);
    }

    private boolean IIIIll(MinecraftClient minecraftClient) {
        lIIllllI.IIIIlI();
        try {
            boolean bl = this.IIIIl(minecraftClient);
            return bl;
        }
        finally {
            lIIllllI.llll();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Vec3d IIIlII(Vec3d vec3d, Box box) {
        Vec3d vec3d2 = AutoMace.lllIl(vec3d, box);
        if (!box.contains(vec3d)) return vec3d2;
        double d = vec3d.x - box.minX;
        double d2 = box.maxX - vec3d.x;
        double d3 = vec3d.y - box.minY;
        double d4 = box.maxY - vec3d.y;
        double d5 = vec3d.z - box.minZ;
        double d6 = box.maxZ - vec3d.z;
        double d7 = Math.min(Math.min(Math.min(d, d2), Math.min(d3, d4)), Math.min(d5, d6));
        if (d7 == d) {
            return new Vec3d(box.minX, vec3d.y, vec3d.z);
        }
        if (d7 == d2) {
            return new Vec3d(box.maxX, vec3d.y, vec3d.z);
        }
        if (d7 == d3) {
            return new Vec3d(vec3d.x, box.minY, vec3d.z);
        }
        if (d7 == d4) return new Vec3d(vec3d.x, box.maxY, vec3d.z);
        if (d7 != d5) return new Vec3d(vec3d.x, vec3d.y, box.maxZ);
        return new Vec3d(vec3d.x, vec3d.y, box.minZ);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlIl(MinecraftClient minecraftClient, boolean bl) {
        boolean bl2 = bl && this.IIIlIIl() && this.l.lIl() == IIlllIlII.Il && minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null && minecraftClient.currentScreen == null;
        boolean bl3 = !IlIlIlI.IIIIlIl() && !IlIlllI.IIll();
        this.IIlII.IlI(minecraftClient, bl2, bl3);
    }

    @Override
    public String II() {
        return ((IlIllIll)((Object)this.IlIlI.lIl())).toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private long IIIllI(long l2, boolean bl) {
        long l3;
        block2: {
            block1: {
                if (bl) break block1;
                l3 = 0L;
                break block2;
            }
            l3 = this.IIlIl();
        }
        long l4 = l3;
        return l2 + l4 + this.IlIllI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIIlll(ItemStack itemStack, IIIlIIIII iIIlIIIII) {
        RegistryEntry registryEntry;
        String string;
        if (itemStack == null) return 0;
        if (iIIlIIIII == null) {
            return 0;
        }
        ItemEnchantmentsComponent itemEnchantmentsComponent = (ItemEnchantmentsComponent)itemStack.getOrDefault(DataComponentTypes.ENCHANTMENTS, (Object)ItemEnchantmentsComponent.DEFAULT);
        Iterator iterator = itemEnchantmentsComponent.getEnchantments().iterator();
        do {
            if (!iterator.hasNext()) return 0;
            registryEntry = (RegistryEntry)iterator.next();
            string = registryEntry.getKey().map(registryKey -> registryKey.getValue().getPath()).orElse("");
        } while (!iIIlIIIII.IIII().equalsIgnoreCase(string));
        return itemEnchantmentsComponent.getLevel(registryEntry);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIII(MinecraftClient minecraftClient, boolean bl) {
        ++this.Illl;
        this.IlIIl = false;
        if (bl && ((Boolean)this.IlI.lIl()).booleanValue() && this.I(minecraftClient)) {
            this.IIllI = true;
            this.IlIII();
            return;
        }
        lIIlIllI lIIlIllI2 = !bl || (Boolean)this.IlI.lIl() == false ? lIIlIllI.Il : lIIlIllI.II;
        lIIllllI.llIII(minecraftClient, this, lIIlIllI2);
        this.IlIII();
    }

    private void IIlIIl(long l2) {
        this.lII = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.lIIlI.lIlIII();
        this.IIIlIl(minecraftClient, false);
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        this.lIIl();
        this.IlIlll();
        this.IlIII();
    }

    private double IIlIlI(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) {
            return 0.0;
        }
        return this.lIlII(clientPlayerEntity);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIll(MinecraftClient minecraftClient, IIIIlIlll iIIIlIlll) {
        if (iIIIlIlll != IIIIlIlll.l) return this.IIIIll(minecraftClient);
        if (!this.IIlllI()) return this.IIIIll(minecraftClient);
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (lIIllllI.IIIIll(minecraftClient) <= 0) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIllII(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) return false;
        if (this.llIl) return false;
        double d = Math.max(1.5, (Double)this.IIlI.lIl());
        if (!this.lllll(clientPlayerEntity)) return false;
        if (!(this.lIlII(clientPlayerEntity) >= d)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlllI() {
        if (!this.I) return false;
        if (!this.IIIl) return false;
        if (this.IllII) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean IIllll(MinecraftClient minecraftClient, IIIIlIlll iIIIlIlll, EntityHitResult entityHitResult, long l2) {
        boolean bl;
        if (!this.IlIIIl(minecraftClient) || !this.IlIlII(minecraftClient, iIIIlIlll) || entityHitResult == null || this.I(minecraftClient) || this.IllIII(minecraftClient, (Entity)this.IIll)) {
            return false;
        }
        EntityHitResult entityHitResult2 = lIIllllI.IIIllII(minecraftClient, (LivingEntity)this.IIll, this.Illl(), true);
        if (entityHitResult2 == null || !this.IIlIll(minecraftClient, iIIIlIlll)) {
            return false;
        }
        lIIllllI.IIIIlI();
        try {
            bl = lIIllllI.IIlllll(minecraftClient, entityHitResult2);
        }
        finally {
            lIIllllI.llll();
        }
        if (!bl) {
            return false;
        }
        this.llIlI(minecraftClient);
        if (iIIIlIlll == IIIIlIlll.II) {
            this.IIIl = true;
            this.Ill = l2 + 1500L;
            this.lIIll = minecraftClient.player.age;
            this.IlIIll(IIlIlIll.ll, l2);
            this.llII(minecraftClient, l2);
            return true;
        }
        this.IIlIIl(l2);
        this.IllII = true;
        this.llIl = true;
        this.IIlIII(minecraftClient, true);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IlIIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return -1;
        if (minecraftClient.player == null) {
            return -1;
        }
        int n = 0;
        while (n < 9) {
            ItemStack itemStack = minecraftClient.player.getInventory().getStack(n);
            if (itemStack != null && itemStack.getItem() instanceof AxeItem) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        MinecraftClient minecraftClient;
        block0: {
            minecraftClient = MinecraftClient.getInstance();
            if (!this.IlIIl(minecraftClient)) return;
            if (!this.lllll(minecraftClient.player)) return;
            if (this.llIl) break block0;
        }
        return;
        PlayerEntity playerEntity = this.lllI == IIlIlIll.lI ? this.IllI : this.IIll;
        if (playerEntity == null) return;
        if (!this.lIIlI(minecraftClient, playerEntity, (Double)this.III.lIl())) return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIIIl(MinecraftClient minecraftClient) {
        if (!this.IlIIl(minecraftClient)) return false;
        if (this.IIll == null) return false;
        if (!this.IIll.isAlive()) return false;
        if (this.IIll.isRemoved()) {
            return false;
        }
        if (this.llIl) return false;
        if (this.IlII(minecraftClient.player)) return false;
        if (!this.IIlllI() && !this.lllll(minecraftClient.player)) {
            return false;
        }
        if (!this.I) return this.IlllII(minecraftClient, this.IIll);
        return this.lIIlI(minecraftClient, this.IIll, (Double)this.III.lIl());
    }

    /*
     * Enabled aggressive block sorting
     */
    public AutoMace() {
        super(StringFactory.IIII("uYFAkzRWUxk="), Category.II, StringFactory.IIII("uZ1Zj1lWXhjXBJ5XC8Cen9iZVZ8cF0MRlhuXGQDdnpCdlUaeABdfDIcHkVwBx83ej5xdkBwXVh2bBJZXCJ0="));
        IIIlIlIIl iIIlIlIIl;
        llIll llIll2;
        llIll llIll3;
        lIlIIlI lIlIIlI2;
        lIlIIlI lIlIIlI3;
        IIIIIIIIl<lIIlIlI> iIIIIIIIl;
        iIIIIIIIl(StringFactory.IIII("rJVGmxxDWRKQSLJWC9Y="), lIIlIlI.class, lIIlIlI.I);
        this.IIIlI = this.IIlllIl(iIIIIIIIl);
        lIlIIlI3(StringFactory.IIII("uZ1Z3CpHVRmT"), 70.0, 1.0, 150.0, 1.0);
        this.IIlIl = this.IIlllIl(lIlIIlI3.IIII(StringFactory.IIII("%")));
        lIlIIlI2(StringFactory.IIII("uZ1Z3CtWXhuS"), 5.0, 1.0, 8.0, 0.1);
        this.III = this.IIlllIl(lIlIIlI2.IIII(StringFactory.IIII("m")));
        this.lIIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("uYBAnRpcEC6WBphc"), 2.8, 1.0, 3.0, 0.05).IIII(StringFactory.IIII("m")));
        this.l = this.IIlllIl(new IIIIIIIIl<IIlllIlII>(StringFactory.IIII("tZtQmQ=="), IIlllIlII.class, IIlllIlII.l));
        this.IIlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Min Fall Distance"), 1.5, 1.5, 12.0, 0.25).IIII(StringFactory.IIII("m")));
        this.IlIlI = this.IIlllIl(new IIIIIIIIl<IlIllIll>(StringFactory.IIII("tZVXmVl6XxiS"), IlIllIll.class, IlIllIll.Il));
        llIll3((Object)StringFactory.IIII("q4BBkipbURE="), false);
        this.lIIIl = this.IIlllIl(llIll3);
        llIll2((Object)StringFactory.IIII("q4NdiBpfED6WC5Q="), true);
        this.IlI = this.IIlllIl(llIll2);
        this.IIIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("r5FVjBZZEDOZBIY="), false));
        iIIlIlIIl(StringFactory.IIII("q4NdiBpfEDiSBJ5A"), 0.0, 0.0, 0.0, 300.0, 5.0);
        this.IlllI = this.IIlllIl(iIIlIlIIl.IIll(StringFactory.IIII("ms")));
        this.llII = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("sJ1A3D1SXB2O"), 0.0, 0.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.lIIlI = new IlIlIlI();
        this.IIlII = new lllllII();
        this.lllI = IIlIlIll.lI;
        this.lIIII = Long.MIN_VALUE;
        this.lIl = -1;
        this.lIlI = -1;
        this.Il = -1;
        this.lIIll = Integer.MIN_VALUE;
        this.IIIII = Long.MIN_VALUE;
        this.Illll = Double.NaN;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IlIIll(IIlIlIll iIlIlIll, long l2) {
        this.lllI = iIlIlIll;
        this.IlIl = l2;
        this.lll = l2;
    }

    private boolean IlIlII(MinecraftClient minecraftClient, IIIIlIlll iIIIlIlll) {
        return iIIIlIlll != IIIIlIlll.II ? this.IlIll(minecraftClient, this.Il, MaceItem.class) : this.IlIll(minecraftClient, this.lIlI, AxeItem.class);
    }

    private long IlIllI() {
        return this.lIllI(this.llII);
    }

    private void IlIlll() {
        this.lIIlI.III();
        this.IllI = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllIII(MinecraftClient minecraftClient, Entity entity) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        PlayerFreeze playerFreeze = clientEntrypoint.IlI().IIlIl();
        if (playerFreeze == null) return false;
        if (!playerFreeze.IIIII(minecraftClient, entity)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        if (this.lllI == IIlIlIll.lI) return;
        this.lIIIl(minecraftClient);
        this.IIIIlI(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.lII(minecraftClient == null ? null : minecraftClient.player);
        if (this.IIllI && minecraftClient != null && minecraftClient.player != null) {
            this.IIllI = false;
            lIIllllI.llIII(minecraftClient, this, (Boolean)this.IlI.lIl() == false ? lIIlIllI.Il : lIIlIllI.II);
        }
        if (!this.IlIIl(minecraftClient)) {
            this.IIIlIl(minecraftClient, false);
            if (this.lllI != IIlIlIll.lI) {
                this.IIlIII(minecraftClient, true);
            }
            this.IllI = null;
            return;
        }
        if (this.IlIIl && !lIIllllI.lIlII(this)) {
            this.IIIlIl(minecraftClient, false);
            this.IIlIII(minecraftClient, false);
            return;
        }
        if (this.lllI != IIlIlIll.lI) {
            if (!this.IlIIIl(minecraftClient)) {
                this.IIIlIl(minecraftClient, false);
                this.IIlIII(minecraftClient, true);
                return;
            }
        } else {
            if (!this.IllIlI(minecraftClient)) {
                this.IIIlIl(minecraftClient, false);
                this.IllI = null;
                this.IlIlll();
                return;
            }
            this.IllI = this.lIlI(minecraftClient, this.IllI);
            if (this.IllI != null) {
                this.IIIlIl(minecraftClient, true);
                this.IIllI(minecraftClient, this.IllI);
                return;
            }
            this.IIIlIl(minecraftClient, false);
            this.IlIlll();
            return;
        }
        this.IIIlIl(minecraftClient, this.IIll != null);
        this.IIIIlI(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IllIlI(MinecraftClient minecraftClient) {
        if (!this.IlIIl(minecraftClient)) return false;
        if (!this.IIllII(minecraftClient.player)) return false;
        if (((Boolean)this.IIIll.lIl()).booleanValue()) {
            if (!this.IllIl(minecraftClient.player.getMainHandStack())) return false;
        }
        if (this.lI(minecraftClient) < 0) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlllII(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (playerEntity == null) return false;
        Vec3d vec3d = minecraftClient.player.getEyePos();
        double d = this.Illl() + 1.0E-4;
        if (vec3d.squaredDistanceTo(AutoMace.lllIl(vec3d, playerEntity.getBoundingBox())) <= d * d) return true;
        return false;
    }

    private static int IlllIl(int n, int n2) {
        return lIlII[n ^ 0xC8ECBE2B] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 20951;
        var7_2 = "\ufb75\ufb3c\ufb71\ufb10\ufba6\ufbd0\ufb1c\ufb31\uade5\uadc1\uadf6\uad9f\uad35\uad4c\uada9\uadbe\uad99\uad9e\uadb1\uadee\uadc4\uad6c\uad61\uad6f\uad81\uad74\uadd9\uad57\uad67\uad36\uad9a\uad93\uadd4\uad99\uadae\uadc5\uf24f\uf26e\uf26c\uf22a\uf299\uf2e2\uf205\uf20d\uf235\uf21b\uf21f\uf228\u3bba\u3b98\u3bee\u3bc4\u3b6d\u3b5c\u3bce\u3bf8\u3bcd\u3bfe\u3beb\u3bb8\u3b9c\u3b0f\u3b43\u3b0d\u3bcf\u3b2c\u3bf4\u3b39\u3b3d\u3b39\u3b98\u3bc9\u3b8e\u3bc3\u3bf7\u3bc2\u3b0d\u3b3a\u3bb4\u3bdb\u3b8f\u3bfe\u3b9f\u3b9b\u3b50\u3b10\u3bb2\u3bfe\u3ba6\u3bf6\u3bee\u3bd0\u3b87\u3b4d\u3b07\u3b1c\u3b99\u3b63\u3b8e\u3b2a\u3b3b\u3b1d\u3ba7\u3b86\u3ba3\u3be3\u3bec\u3bd6\u3b6e\u3b22\u3be6\u3bb8\u3bbc\u3bfe\u3b82\u3b8b\u3b28\u3b36\u3bdc\u3bd2\u3bb2\u3bba\u3baa\u3b8b\u3bb9\u3b7e\u3b68\u3b14\u3bc6\u3b7b\u3bf6\u3b25\u9cff\u9cca\u9ccb\u9c9b\u9c28\u9c57\u9c98\u9ca9\u9c80\u9c86\u9c88\u9cf3\u9ccf\u9c4b\u9c7e\u9c40\u9c8d\u9c6f\u9cac\u9c23\uacf0\uacd2\uaca4\uac8e\uac7e\uac64\uac98\uacad\uac89\uac8e\uaca6\uacfe\u6bff\u6b90\u6be1\u6ba0\ub08b\ub0a9\ub0df\ub0f5\ub005\ub01f\ub0e7\ub0c9\ub0fc\ub0cf\ub0c5\ub082\u738c\u73bc\u73cd\u738c\u42ff\u42de\u42d8\u429a\u422c\u427a\u4297\u4289\u4295\u4290\u42f2\u42f2\u42d9\u4270\u425b\u4273\ufd50\ufd60\ufd11\ufd50\ueefc\ueedf\ueeec\uee88\uee2d\uee7b\ueed8\ueed5\u6763\u6740\u6736\u6727\u67ec\u67f1\u6743\u6720\u6715\u670c\u671d\u6760\u674a\u67d7\u67f4\u67c6\u6713\u67f5\u6723\u67d5\u67e5\u6782\u6719\u6776\u17d2\u17e2\u1793\u17d2\u7729\u770a\u771b\u7754\u77f8\u77a9\u775c\u770b\u775f\u777c\u777a\u7721\u8615\u865d\u8636\u8677\u86c7\u86af\u8679\u8666\u866b\u866f\u866f\u8676\u2914\u295c\u293b\u2950\u29c4\u2985\u2978\u2963\u297a\u2978\u291d\u291d\u2937\u29da\u298d\u29c2\u61db\u6191\u61ff\u61ae\u610b\u6149\u619e\u6193\u61b6\u61b4\u61a8\u61dc\u61fa\u616a\u6149\u610e\u1342\u130a\u136d\u1306\u1392\u13d3\u132e\u1335\u132c\u132e\u1314\u134f\u1360\u13f3\u13bf\u13e8\u848d\u84b5\u8492\u848d\ud5e3\ud5d7\ud5b1\ud580\ud56b\ud576\ud5cc\ud5a3\ud592\ud58b\ud5ec\ud5f0\u37e3\u37db\u37fc\u37e3";
        var8_3 = "\u51df\u51cb\u51db\u5183\u51c3\u51db\u51d3\u51db\u51d3\u51c7\u51d3\u51df\u51cf\u51d3\u51db\u51db\u51c7\u51c7\u51c7\u51d3\u51db\u51d3".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl16
        block6: while (true) {
            block13: {
                block14: {
                    var16_1 = v0;
                    v1 = var15_10++;
                    var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                    if (var15_10 < var14_9.length) break block13;
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_3.length) break block14;
                    var13_8 = 0;
lbl16:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = 0;
                    if (var13_8 == 0) {
                        AutoMace.lIlIl = var9_4;
                        AutoMace.lIllI = new Object[var9_4.length];
                        var2_11 = -38205384;
                        var0_12 = "W\u00edmhI\u00a0u\u00c3\u00ba\u001dt\u00f8ZLB\u00c7\u0017<aK\u00ab\u0096:;y\u0086s\u0096\u00c5}3\u00fb\u00bb\u00a1V\u00ef\u00f8\u00a6\u00ce\u00f4r\u00ae\u00f3z\u00cdn\u00cb\u007f\u00cd\u0082\u000bB\u009a\u00fd<\u0080".getBytes("ISO-8859-1");
                        var1_13 = var0_12.length / 4;
                        AutoMace.lIlII = new int[var1_13];
                        var3_14 = 0;
                        var4_15 = 0;
                        do {
                            var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
                            AutoMace.lIlII[var4_15] = var5_16 ^= var2_11;
                            var3_14 += 4;
                        } while (++var4_15 < var1_13);
                        return;
                    }
                }
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
            }
            switch (var15_10 % 5) {
                case 3: {
                    v0 = 82;
                    continue block6;
                }
                case 2: {
                    v0 = 35;
                    continue block6;
                }
                default: {
                    v0 = 15;
                    continue block6;
                }
                case 4: {
                    v0 = 22;
                    continue block6;
                }
                case 1: 
            }
            v0 = 6;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IllllI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x4960CBE7;
        char[] cArray = lIlIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIllI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            AutoMace.lIllI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x9A6D8411;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 2 -> 173;
                case 1 -> 149;
                case 8 -> 150;
                case 6 -> 245;
                case 21 -> 87;
                case 20 -> 13;
                case 11 -> 183;
                case 29 -> 77;
                case 18 -> 180;
                case 25 -> 199;
                case 4 -> 64;
                case 16 -> 219;
                case 13 -> 70;
                case 24 -> 159;
                case 12 -> 172;
                case 23 -> 144;
                case 15 -> 11;
                case 9 -> 209;
                case 14 -> 49;
                case 5 -> 51;
                case 27 -> 211;
                case 3 -> 157;
                case 19 -> 27;
                case 7 -> 221;
                case 10 -> 223;
                case 22 -> 131;
                case 31 -> 222;
                case 28 -> 72;
                default -> 145;
                case 26 -> 152;
                case 30 -> 167;
                case 17 -> 102;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

