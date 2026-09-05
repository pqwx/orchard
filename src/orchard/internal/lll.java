/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Places and picks up a water bucket just before fall impact.
 *   - Fall Distance
 *   - Switch Delay
 *   - Rotate Mode
 *   - .getBytes(
 *   - AutoMLG
 *   - Mode
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.block.BlockState
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Direction$Axis
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.util.shape.VoxelShape
 *  net.minecraft.world.BlockView
 */
package orchard.internal;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIII;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIlII;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IIlIlIlII;
import orchard.internal.IIllIlIl;
import orchard.internal.IlIIIllII;
import orchard.internal.IlIlIl;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlllI;
import orchard.internal.lIIII;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIIIIIl;
import orchard.internal.lllIllIl;
import orchard.internal.llllIIII;

@Environment(value=EnvType.CLIENT)
public final class lll
extends ModuleBase {
    private int I = -1;
    private static final int l = 1;
    private int II;
    private final IIIIIIIIl<IlIIIllII> Il;
    private static final double lI = 3.0;
    private static final double ll = 20.25;
    private float III;
    private static final double IIl = 1.5;
    private lllIllIl IlI;
    private static final double Ill = 2.9;
    private IIlIlIlII lII;
    private boolean lIl;
    private llllIIII llI;
    private static final int lll = 1;
    private static final int IIII = 8;
    private boolean IIIl;
    private static final int IIlI = 9;
    private static final double IIll = 4.5;
    private final lIlIIlI IlII;
    private final lIlIIlI IlIl;
    private static final int IllI = 1;
    private final IlIlIlI Illl;
    private int lIII;
    private static final double lIIl = 2.9;
    private final IIIIIIIIl<IIIIII> lIlI = this.IIlllIl(new IIIIIIIIl<IIIIII>("Mode", IIIIII.class, IIIIII.Il));
    private long lIll;
    private final IIIlIlIIl llII;
    private BlockPos llIl;
    private int lllI = -1;
    private static final int llll = 40;
    private static final float IIIII = 0.5f;
    private static final int IIIIl = 80;
    private int IIIlI;
    private Vec3d IIIll;
    private static final int IIlII = 2;
    private float IIlIl;
    private static final int IIllI = 2;
    private llIIIIIl IIlll;
    private static final int[] IlIII;
    private static final String[] IlIIl;
    private static final Object[] IlIlI;

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient, llllIIII llllIIII2) {
        block14: {
            block12: {
                Vec3d vec3d;
                float[] fArray;
                ClientPlayerEntity clientPlayerEntity;
                block15: {
                    block10: {
                        block13: {
                            ItemStack itemStack;
                            block11: {
                                block9: {
                                    if (llllIIII2 == null) return false;
                                    if (!this.IIIIl(minecraftClient)) {
                                        return false;
                                    }
                                    clientPlayerEntity = minecraftClient.player;
                                    itemStack = clientPlayerEntity.getInventory().getStack(this.I);
                                    if (this.IIlll != llIIIIIl.l) break block9;
                                    if (itemStack == null) return false;
                                    if (!itemStack.isOf(Items.WATER_BUCKET)) break block10;
                                }
                                if (this.IIlll != llIIIIIl.lI) break block11;
                                if (itemStack == null) return false;
                                if (!itemStack.isOf(Items.WIND_CHARGE)) break block12;
                            }
                            if (this.IIlll == llIIIIIl.Il) {
                                if (itemStack == null) return false;
                                if (!itemStack.isOf(Items.COBWEB)) return false;
                                if (this.llIl == null) {
                                    return false;
                                }
                            }
                            if (this.IIlll != llIIIIIl.II) break block13;
                            if (itemStack == null) return false;
                            if (!itemStack.isOf(Items.SCAFFOLDING)) return false;
                            if (this.llIl == null) break block14;
                        }
                        if (!(this.IIlll != llIIIIIl.Il && this.IIlll != llIIIIIl.II || this.IIllI(minecraftClient, this.llIl))) {
                            return false;
                        }
                        break block15;
                    }
                    return false;
                }
                if (lIIllllI.IIIIIlI(minecraftClient) > 0) {
                    return false;
                }
                if (this.Il.lIl() != IlIIIllII.II) {
                    if (this.IIlll == llIIIIIl.Il) return false;
                    if (this.IIlll != llIIIIIl.II) return false;
                    return false;
                }
                if (this.IIlll == llIIIIIl.II) {
                    this.IlIII(minecraftClient);
                }
                float f = clientPlayerEntity.getYaw();
                float f2 = 90.0f;
                if (this.IIlll != llIIIIIl.Il) {
                    if (this.IIlll != llIIIIIl.II) return this.IlIIl(minecraftClient, llllIIII2, f, f2);
                }
                if ((fArray = IlIlllI.IlIll(minecraftClient, vec3d = Vec3d.ofCenter((Vec3i)this.llIl).add(0.0, 0.5, 0.0))) == null) {
                    return false;
                }
                f = fArray[0];
                f2 = fArray[1];
                return this.IlIIl(minecraftClient, llllIIII2, f, f2);
            }
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(MinecraftClient minecraftClient) {
        llllIIII llllIIII2 = this.llI;
        if (llllIIII2 == null) {
            return;
        }
        if (llllIIII2.Il() == IIllIlIl.l && !this.IIIIl(minecraftClient)) {
            this.lIlIl(minecraftClient);
            return;
        }
        if (llllIIII2.Il() == IIllIlIl.I && !this.lIIIl(minecraftClient)) {
            this.llI = null;
            this.lII = IIlIlIlII.IlI;
            this.II = minecraftClient.player.age;
            return;
        }
        boolean bl = llllIIII2.Il() == IIllIlIl.l ? (llllIIII2.l() ? this.lIl(minecraftClient, llllIIII2) : this.lI(minecraftClient, llllIIII2)) : this.IIlll(minecraftClient, llllIIII2);
        if (!bl) return;
        this.llI = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (blockPos == null) return false;
        if (!lIIllllI.lIllI(minecraftClient.world.getBlockState(blockPos))) return false;
        if (minecraftClient.world.getBlockState(blockPos.down()).getCollisionShape((BlockView)minecraftClient.world, blockPos.down()).isEmpty()) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void lII(MinecraftClient minecraftClient, boolean bl) {
        block3: {
            block2: {
                IIIIlII iIIIlII;
                block1: {
                    iIIIlII = this.lIll();
                    if (iIIIlII != null) break block1;
                    if (minecraftClient == null || minecraftClient.options == null || minecraftClient.options.sneakKey == null) break block2;
                    break block3;
                }
                iIIIlII.Il(this, minecraftClient, minecraftClient.options.sneakKey, bl);
            }
            return;
        }
        minecraftClient.options.sneakKey.setPressed(bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIl(MinecraftClient minecraftClient, llllIIII llllIIII2) {
        if (llllIIII2 == null) return false;
        if (!this.IIIIl(minecraftClient)) {
            return false;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        ItemStack itemStack = clientPlayerEntity.getInventory().getStack(this.I);
        if (this.IIlll == llIIIIIl.l) {
            if (itemStack == null) return false;
            if (!itemStack.isOf(Items.WATER_BUCKET)) {
                return false;
            }
        }
        if (this.IIlll == llIIIIIl.lI) {
            if (itemStack == null) return false;
            if (!itemStack.isOf(Items.WIND_CHARGE)) {
                return false;
            }
        }
        if (this.IIlll == llIIIIIl.Il) {
            if (itemStack == null) return false;
            if (!itemStack.isOf(Items.COBWEB)) return false;
            if (this.llIl == null) {
                return false;
            }
        }
        if (this.IIlll == llIIIIIl.II) {
            if (itemStack == null) return false;
            if (!itemStack.isOf(Items.SCAFFOLDING)) return false;
            if (this.llIl == null) {
                return false;
            }
        }
        if (!(this.IIlll != llIIIIIl.Il && this.IIlll != llIIIIIl.II || this.IIllI(minecraftClient, this.llIl))) {
            return false;
        }
        if (lIIllllI.IIIIIlI(minecraftClient) > 0) {
            return false;
        }
        float f = clientPlayerEntity.getYaw();
        float f2 = MathHelper.clamp((float)clientPlayerEntity.getPitch(), (float)-90.0f, (float)90.0f);
        if (this.IIlll != llIIIIIl.Il && this.IIlll != llIIIIIl.II) {
            f2 = 90.0f;
            return this.IlIIl(minecraftClient, llllIIII2, f, f2);
        }
        Vec3d vec3d = Vec3d.ofCenter((Vec3i)this.llIl).add(0.0, 0.5, 0.0);
        float[] fArray = IlIlllI.IlIll(minecraftClient, vec3d);
        if (fArray != null) {
            f = fArray[0];
            f2 = fArray[1];
            return this.IlIIl(minecraftClient, llllIIII2, f, f2);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIII(MinecraftClient minecraftClient, int n) {
        lllIllIl lllIllIl2 = this.IlI;
        if (lllIllIl2 == null) {
            return false;
        }
        if (n < lllIllIl2.l()) {
            return true;
        }
        this.IlI = null;
        ++this.lIll;
        llllIIII llllIIII2 = lllIllIl2.II();
        if (llllIIII2.II() < 2) {
            this.llI = llllIIII2.I(llllIIII2.II() + 1);
            return false;
        }
        if (llllIIII2.Il() != IIllIlIl.l) {
            this.lII = IIlIlIlII.IlI;
            this.II = n;
            return true;
        }
        this.lIlIl(minecraftClient);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlI(MinecraftClient minecraftClient) {
        if (!this.IIIl) {
            return;
        }
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) {
            return;
        }
        IlIlllI.IIIlIl(minecraftClient, this.IIlIl, this.III);
        this.IIIl = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlII(IIIIII iIIIII, IIIIII iIIIII2) {
        if (iIIIII == IIIIII.Il) return true;
        if (iIIIII != iIIIII2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void Illl(MinecraftClient minecraftClient, lIIII lIIII2, int n) {
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        this.lllI = lIIllllI.lllI(clientPlayerEntity.getInventory());
        this.I = lIIII2.II();
        this.IIlll = lIIII2.l();
        this.llIl = lIIII2.I();
        this.III = clientPlayerEntity.getPitch();
        this.IIlIl = clientPlayerEntity.getYaw();
        this.lIII = n + this.IIIII(this.llII);
        this.lII = IIlIlIlII.lI;
        this.II = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.IIlI(minecraftClient);
        this.IIIlI(minecraftClient);
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        this.Illl.IlIIIlI();
        this.lIIll();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIII(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) return false;
        if (this.I < 0) return false;
        if (this.I >= 9) return false;
        if (!clientPlayerEntity.getInventory().getStack(this.I).isOf(Items.BUCKET)) return false;
        return true;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private IlIlIl lIlI(MinecraftClient minecraftClient) {
        VoxelShape voxelShape;
        BlockPos blockPos;
        double d;
        block3: {
            BlockState blockState;
            int n;
            double d2;
            double d3;
            int n2;
            block2: {
                ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
                d = clientPlayerEntity.getBoundingBox().minY;
                int n3 = (int)Math.floor(d - 1.0E-4);
                n2 = Math.max(minecraftClient.world.getBottomY(), n3 - 8);
                d3 = clientPlayerEntity.getX();
                d2 = clientPlayerEntity.getZ();
                n = n3;
                if (!true) break block2;
                if (n < n2) return new IlIlIl(null, Double.POSITIVE_INFINITY);
                if (!lIIllllI.lIllI(blockState = minecraftClient.world.getBlockState(blockPos = BlockPos.ofFloored((double)d3, (double)n, (double)d2))) && !(voxelShape = blockState.getCollisionShape((BlockView)minecraftClient.world, blockPos)).isEmpty()) break block3;
            }
            do {
                --n;
                if (n < n2) return new IlIlIl(null, Double.POSITIVE_INFINITY);
            } while (lIIllllI.lIllI(blockState = minecraftClient.world.getBlockState(blockPos = BlockPos.ofFloored((double)d3, (double)n, (double)d2))) || (voxelShape = blockState.getCollisionShape((BlockView)minecraftClient.world, blockPos)).isEmpty());
        }
        double d4 = (double)blockPos.getY() + voxelShape.getMax(Direction.Axis.Y);
        return new IlIlIl(blockPos.toImmutable(), Math.max(0.0, d - d4));
    }

    private IIIIlII lIll() {
        return IIIIlII.IlI();
    }

    private void llII(MinecraftClient minecraftClient) {
        block3: {
            block2: {
                if (minecraftClient == null) break block2;
                if (minecraftClient.options != null && minecraftClient.options.sneakKey != null) break block3;
            }
            return;
        }
        this.IlIII(minecraftClient);
        this.lIl = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIII llIl(MinecraftClient minecraftClient) {
        int n;
        IIIIII iIIIII;
        IlIlIl ilIlIl;
        ClientPlayerEntity clientPlayerEntity;
        block9: {
            int n2;
            block10: {
                block8: {
                    clientPlayerEntity = minecraftClient.player;
                    if (clientPlayerEntity.isOnGround()) return null;
                    if (clientPlayerEntity.isClimbing()) return null;
                    if (clientPlayerEntity.isTouchingWater()) return null;
                    if (!clientPlayerEntity.isInLava()) {
                        if (clientPlayerEntity.getVelocity().y >= -0.08) {
                            return null;
                        }
                        if (clientPlayerEntity.fallDistance < (double)((Double)this.IlII.lIl()).floatValue()) {
                            return null;
                        }
                    } else {
                        return null;
                    }
                    ilIlIl = this.lIlI(minecraftClient);
                    if (ilIlIl == null) return null;
                    if (!Double.isFinite(ilIlIl.l())) break block8;
                    iIIIII = (IIIIII)((Object)this.lIlI.lIl());
                    int n3 = n2 = this.IlII(iIIIII, IIIIII.III) ? this.IIIll(clientPlayerEntity, Items.WATER_BUCKET) : -1;
                    if (n2 < 0) break block9;
                    break block10;
                }
                return null;
            }
            if (ilIlIl.l() <= 1.5) {
                return new lIIII(llIIIIIl.l, n2, null);
            }
        }
        int n4 = n = this.IlII(iIIIII, IIIIII.II) ? this.IIIll(clientPlayerEntity, Items.WIND_CHARGE) : -1;
        if (n < 0 || !(ilIlIl.l() <= 3.0)) {
        } else {
            return new lIIII(llIIIIIl.lI, n, null);
        }
        int n5 = this.IlII(iIIIII, IIIIII.ll) ? this.IIIll(clientPlayerEntity, Items.COBWEB) : -1;
        if (n5 >= 0 && ilIlIl.l() <= 2.9 && this.IlI(minecraftClient, ilIlIl.I().up()) && this.IIllI(minecraftClient, ilIlIl.I())) {
            return new lIIII(llIIIIIl.Il, n5, ilIlIl.I());
        }
        int n6 = this.IlII(iIIIII, IIIIII.I) ? this.IIIll(clientPlayerEntity, Items.SCAFFOLDING) : -1;
        if (n6 < 0) return null;
        if (!(ilIlIl.l() <= 2.9)) return null;
        if (!this.IlI(minecraftClient, ilIlIl.I().up())) return null;
        if (!this.IIllI(minecraftClient, ilIlIl.I())) return null;
        return new lIIII(llIIIIIl.II, n6, ilIlIl.I());
    }

    private long lllI(IIIlIlIIl iIIlIlIIl) {
        double d;
        double d2 = iIIlIlIIl.IIIl();
        if (d2 != (d = iIIlIlIIl.IIII())) {
            return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d2, d)));
        }
        return Math.max(0L, Math.round(d2));
    }

    private int IIIII(IIIlIlIIl iIIlIlIIl) {
        return Math.max(0, (int)Math.ceil((double)this.lllI(iIIlIlIIl) / 50.0));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.I < 0) return false;
        if (this.I >= 9) return false;
        if (lIIllllI.IIIIIlI(minecraftClient) > 0) {
            return false;
        }
        ItemStack itemStack = minecraftClient.player.getInventory().getStack(this.I);
        if (itemStack == null) {
            return false;
        }
        switch (this.IIlll.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 3: {
                if (!itemStack.isOf(Items.SCAFFOLDING)) return false;
                if (this.llIl == null) return false;
                if (this.IIllI(minecraftClient, this.llIl)) return true;
                return false;
            }
            case 0: {
                boolean bl = itemStack.isOf(Items.WATER_BUCKET);
                return bl;
            }
            case 1: {
                boolean bl = itemStack.isOf(Items.WIND_CHARGE);
                return bl;
            }
            case 2: 
        }
        if (!itemStack.isOf(Items.COBWEB)) return false;
        if (this.llIl == null) return false;
        if (!this.IIllI(minecraftClient, this.llIl)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlI(MinecraftClient minecraftClient) {
        if (!this.lIl) {
            return;
        }
        IIIIlII iIIIlII = this.lIll();
        if (iIIIlII == null) {
            if (minecraftClient != null && minecraftClient.options != null && minecraftClient.options.sneakKey != null) {
                minecraftClient.options.sneakKey.setPressed(lIIllllI.IIllIII(minecraftClient, minecraftClient.options.sneakKey));
            }
        } else {
            iIIIlII.II(this, minecraftClient);
        }
        this.lIl = false;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int IIIll(ClientPlayerEntity clientPlayerEntity, Item item) {
        int n;
        block3: {
            ItemStack itemStack;
            block2: {
                n = 0;
                if (!true) break block2;
                if (n >= 9) return -1;
                if ((itemStack = clientPlayerEntity.getInventory().getStack(n)) != null && itemStack.isOf(item)) break block3;
            }
            do {
                ++n;
                if (n >= 9) return -1;
            } while ((itemStack = clientPlayerEntity.getInventory().getStack(n)) == null || !itemStack.isOf(item));
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIl(MinecraftClient minecraftClient) {
        if (!this.lIllI(minecraftClient)) {
            this.lIlIl(minecraftClient);
            return;
        }
        if (orchard.internal.IIlI.IIl(minecraftClient)) {
            this.lIlIl(minecraftClient);
            return;
        }
        int n = minecraftClient.player.age;
        if (this.lII != IIlIlIlII.I) {
            this.IlIll(minecraftClient, n);
            return;
        }
        lIIII lIIII2 = this.llIl(minecraftClient);
        if (lIIII2 != null) {
            this.Illl(minecraftClient, lIIII2, n);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIllI(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (blockPos == null) return false;
        Vec3d vec3d = Vec3d.ofCenter((Vec3i)blockPos).add(0.0, 0.5, 0.0);
        if (!(minecraftClient.player.getEyePos().squaredDistanceTo(vec3d) <= 20.2501)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlll(MinecraftClient minecraftClient, llllIIII llllIIII2) {
        if (llllIIII2 == null) return false;
        if (!this.lIIIl(minecraftClient)) return false;
        if (lIIllllI.IIIIIlI(minecraftClient) <= 0) {
            ++this.lIll;
            long l2 = this.lIll++;
            boolean bl = IlIlllI.IlII(minecraftClient, 250, minecraftClient.player.getYaw(), 90.0f, () -> this.llIlI(minecraftClient, l2, llllIIII2));
            if (!bl) {
                return false;
            }
            this.IlI = new lllIllIl(l2, llllIIII2, minecraftClient.player.age + 1);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.options == null) {
            return;
        }
        IIIIlII iIIIlII = this.lIll();
        if (iIIIlII != null) {
            iIIIlII.Il(this, minecraftClient, minecraftClient.options.forwardKey, false);
            iIIIlII.Il(this, minecraftClient, minecraftClient.options.backKey, false);
            iIIIlII.Il(this, minecraftClient, minecraftClient.options.leftKey, false);
            iIIIlII.Il(this, minecraftClient, minecraftClient.options.rightKey, false);
            iIIIlII.Il(this, minecraftClient, minecraftClient.options.sprintKey, false);
            iIIIlII.Il(this, minecraftClient, minecraftClient.options.jumpKey, false);
            iIIIlII.Il(this, minecraftClient, minecraftClient.options.sneakKey, true);
            return;
        }
        if (minecraftClient.options.forwardKey != null) {
            minecraftClient.options.forwardKey.setPressed(false);
        }
        if (minecraftClient.options.backKey != null) {
            minecraftClient.options.backKey.setPressed(false);
        }
        if (minecraftClient.options.leftKey != null) {
            minecraftClient.options.leftKey.setPressed(false);
        }
        if (minecraftClient.options.rightKey != null) {
            minecraftClient.options.rightKey.setPressed(false);
        }
        if (minecraftClient.options.sprintKey != null) {
            minecraftClient.options.sprintKey.setPressed(false);
        }
        if (minecraftClient.options.jumpKey != null) {
            minecraftClient.options.jumpKey.setPressed(false);
        }
        if (minecraftClient.options.sneakKey == null) return;
        minecraftClient.options.sneakKey.setPressed(true);
    }

    @Override
    public void ll() {
        this.lIIll();
        this.Illl.lIlIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIIl(MinecraftClient minecraftClient, llllIIII llllIIII2, float f, float f2) {
        boolean bl;
        long l2 = ++this.lIll;
        boolean bl2 = bl = this.IIlll != llIIIIIl.l && this.IIlll != llIIIIIl.lI ? IlIlllI.IlI(minecraftClient, 250, f, f2, () -> this.llIlI(minecraftClient, l2, llllIIII2)) : IlIlllI.IlII(minecraftClient, 250, f, f2, () -> this.llIlI(minecraftClient, l2, llllIIII2));
        if (!bl) {
            ++this.lIll;
            return false;
        }
        this.IlI = new lllIllIl(l2, llllIIII2, minecraftClient.player.age + 2);
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void IlIll(MinecraftClient var1_1, int var2_2) {
        var3_3 = var1_1.player;
        if (this.IIII(var1_1, var2_2)) {
            return;
        }
        if (this.llI != null) {
            this.IIl(var1_1);
            return;
        }
        if (this.IIIl && this.lII != IIlIlIlII.IlI && this.lII != IIlIlIlII.III) {
            var3_3.setPitch(90.0f);
        }
        if (this.IIlll == llIIIIIl.II && this.lII != IIlIlIlII.IlI) {
            this.IlIII(var1_1);
        }
        switch (this.lII.ordinal()) {
            case 6: {
                if (var2_2 - this.II < 1) return;
                this.lII = IIlIlIlII.IlI;
                this.II = var2_2;
                return;
            }
            case 2: {
                if (var2_2 - this.II >= 40) {
                    this.llIll(var1_1, var2_2);
                    return;
                }
                if (this.IIIll == null) {
                    this.llIll(var1_1, var2_2);
                    return;
                }
                var4_4 = new BlockHitResult(this.IIIll, Direction.UP, this.llIl, false);
                var5_6 = this.Illl.llIIIl(var1_1, var4_4, ((Double)this.IlIl.lIl()).floatValue());
                ++this.IIIlI;
                if (!(var5_6 <= 0.5f)) {
                    if (this.IIIlI < 40) return;
                }
                this.llIll(var1_1, var2_2);
                return;
            }
            case 7: {
                this.IIlI(var1_1);
                if (this.lllI < 0 || this.lllI >= 9) ** GOTO lbl69
                lIIllllI.IlIlllI(var1_1, this, this.lllI);
                ** GOTO lbl70
            }
            case 3: {
                if (var2_2 - this.II < 1) return;
                if (this.IIlll == llIIIIIl.l) ** GOTO lbl77
                if (this.IIlll == llIIIIIl.II) {
                    this.llII(var1_1);
                    this.lII = IIlIlIlII.II;
                } else {
                    this.lII = IIlIlIlII.IlI;
                }
                ** GOTO lbl78
            }
            case 4: {
                if (this.IIlll == llIIIIIl.II) {
                    this.llII(var1_1);
                }
                if (!var3_3.isOnGround()) {
                    if (var2_2 - this.II < 80) return;
                    this.IIIlI(var1_1);
                    this.lII = IIlIlIlII.IlI;
                    this.II = var2_2;
                    return;
                }
                if (this.IIlll != llIIIIIl.II) {
                    this.lII = IIlIlIlII.IIl;
                    this.II = var2_2;
                    return;
                }
                this.IIIlI(var1_1);
                this.lII = IIlIlIlII.IlI;
                this.II = var2_2;
                return;
            }
            case 5: {
                if (var2_2 - this.II < 1) return;
                if (this.IIlll == llIIIIIl.l && this.lIII(var3_3)) {
                } else {
                    this.lII = IIlIlIlII.IlI;
                    this.II = var2_2;
                    return;
                }
            }
lbl69:
            // 1 sources

            lIIllllI.llIII(var1_1, this, lIIlIllI.II);
lbl70:
            // 2 sources

            if (var2_2 - this.II < 1) return;
            this.lIIll();
            ** GOTO lbl80
            {
                var4_5 = new llllIIII(IIllIlIl.I, this.Il.lIl() == IlIIIllII.l, 0);
            }
            if (this.IIlll(var1_1, var4_5) != false) return;
            this.llI = var4_5;
            return;
lbl77:
            // 1 sources

            this.lII = IIlIlIlII.II;
lbl78:
            // 3 sources

            this.II = var2_2;
            return;
lbl80:
            // 2 sources

            default: {
                return;
            }
            case 1: 
        }
        if (var2_2 >= this.lIII) {
            this.lIIlI(var1_1, var2_2);
            return;
        }
    }

    private Vec3d IlllI(MinecraftClient minecraftClient) {
        block1: {
            block2: {
                block0: {
                    if (this.IIlll != llIIIIIl.Il && this.IIlll != llIIIIIl.II) break block0;
                    if (this.llIl != null) break block1;
                    break block2;
                }
                return minecraftClient.player.getEyePos().add(0.0, -1.0, 0.0);
            }
            return minecraftClient.player.getEyePos().add(0.0, -1.0, 0.0);
        }
        return Vec3d.ofCenter((Vec3i)this.llIl).add(0.0, 0.5, 0.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illll(MinecraftClient minecraftClient) {
        if (!this.IIIIl(minecraftClient)) {
            return false;
        }
        if (this.IIlll != llIIIIIl.II) return lIIllllI.IlIIIl(minecraftClient, this, this.I, () -> {
            ActionResult actionResult = this.IIlll != llIIIIIl.l && this.IIlll != llIIIIIl.lI ? this.llIII(minecraftClient) : lIIllllI.llllll(minecraftClient, Hand.MAIN_HAND);
            if (actionResult == null) return false;
            if (!actionResult.isAccepted()) return false;
            return true;
        });
        this.IlIII(minecraftClient);
        return lIIllllI.IlIIIl(minecraftClient, this, this.I, () -> {
            ActionResult actionResult = this.IIlll != llIIIIIl.l && this.IIlll != llIIIIIl.lI ? this.llIII(minecraftClient) : lIIllllI.llllll(minecraftClient, Hand.MAIN_HAND);
            if (actionResult == null) return false;
            if (!actionResult.isAccepted()) return false;
            return true;
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.IIlll != llIIIIIl.l) return false;
        if (this.I < 0) return false;
        if (this.I >= 9) return false;
        if (!this.lIII(minecraftClient.player)) return false;
        return true;
    }

    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.IIlIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIlI(MinecraftClient minecraftClient, int n) {
        if (this.Il.lIl() == IlIIIllII.l) {
            this.IIIl = true;
            this.IIIll = this.IlllI(minecraftClient);
            this.IIIlI = 0;
            this.lII = IIlIlIlII.III;
            this.II = n;
            return;
        }
        llllIIII llllIIII2 = new llllIIII(IIllIlIl.l, false, 0);
        if (this.lI(minecraftClient, llllIIII2)) return;
        this.llI = llllIIII2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIll() {
        ++this.lIll;
        this.IlI = null;
        this.llI = null;
        this.lII = IIlIlIlII.I;
        this.II = 0;
        this.I = -1;
        this.lllI = -1;
        this.IIlll = llIIIIIl.l;
        this.llIl = null;
        this.IIIl = false;
        this.lIl = false;
        this.lIII = 0;
        this.IIIlI = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public lll() {
        super("AutoMLG", Category.ll, "Places and picks up a water bucket just before fall impact.");
        this.Il = this.IIlllIl(new IIIIIIIIl<IlIIIllII>("Rotate Mode", IlIIIllII.class, IlIIIllII.II));
        this.IlII = this.IIlllIl(new lIlIIlI("Fall Distance", 8.0, 4.0, 64.0, 1.0).IIIl("b"));
        this.IlIl = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIl("q4BGmRdQRBQ="), 50.0, 1.0, 100.0, 1.0).lIII(() -> {
            if (this.Il.lIl() != IlIIIllII.l) return false;
            return true;
        }));
        this.llII = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Switch Delay"), 0.0, 0.0, 0.0, 300.0, 5.0).lII("ms"));
        this.Illl = new IlIlIlI();
        this.lII = IIlIlIlII.I;
        this.IIlll = llIIIIIl.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlII(MinecraftClient minecraftClient) {
        if (!this.lIIIl(minecraftClient)) return false;
        if (lIIllllI.IIIIIlI(minecraftClient) <= 0) return lIIllllI.IlIIIl(minecraftClient, this, this.I, () -> {
            ActionResult actionResult = lIIllllI.llllll(minecraftClient, Hand.MAIN_HAND);
            if (actionResult == null) return false;
            if (actionResult.isAccepted()) return true;
            return false;
        });
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlIl(MinecraftClient minecraftClient) {
        this.IIlI(minecraftClient);
        this.IIIlI(minecraftClient);
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        this.lIIll();
    }

    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        this.IIlIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private ActionResult llIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return ActionResult.FAIL;
        if (minecraftClient.player == null) return ActionResult.FAIL;
        if (minecraftClient.interactionManager == null) return ActionResult.FAIL;
        if (this.llIl != null) {
            Vec3d vec3d = Vec3d.ofCenter((Vec3i)this.llIl).add(0.0, 0.5, 0.0);
            BlockHitResult blockHitResult = new BlockHitResult(vec3d, Direction.UP, this.llIl, false);
            return lIIllllI.IllllIl(minecraftClient, Hand.MAIN_HAND, blockHitResult);
        }
        return ActionResult.FAIL;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIlI(MinecraftClient minecraftClient, long l2, llllIIII llllIIII2) {
        lllIllIl lllIllIl2 = this.IlI;
        if (lllIllIl2 == null) return false;
        if (lllIllIl2.I() == l2) {
            this.IlI = null;
            this.llI = null;
        }
        return false;
        boolean bl = llllIIII2.Il() == IIllIlIl.l ? this.Illll(minecraftClient) : this.lIlII(minecraftClient);
        int n = minecraftClient.player.age;
        if (!bl) {
            if (llllIIII2.Il() == IIllIlIl.l) {
                this.lIlIl(minecraftClient);
                return false;
            }
            this.lII = IIlIlIlII.IlI;
            this.II = n;
            return false;
        }
        this.lII = llllIIII2.Il() == IIllIlIl.l ? IIlIlIlII.Il : IIlIlIlII.ll;
        this.II = n;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void llIll(MinecraftClient minecraftClient, int n) {
        llllIIII llllIIII2 = new llllIIII(IIllIlIl.l, true, 0);
        if (this.lIl(minecraftClient, llllIIII2)) {
            return;
        }
        this.llI = llllIIII2;
    }

    private static int lllII(int n, int n2) {
        return IlIII[n ^ 0x38973AE8] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 29575;
        String string = "\u0a3e\u0a33\u0a8e\u0a0e\u0aa9\u0aac\u0a1e\u0af3\u0aaa\u0aff\u0a9d\u0aef\u915c\u9146\u91c6\u917f\u91ca\u91c8\u9152\u91e7\u91ed\u91ac\u91f4\u91ee\u913c\u91d2\u91de\u91b0\u91a0\u91e8\u91d7\u9132\u9124\u9144\u9113\u91ce\u914b\u910c\u919f\u910e\u9175\u91e9\u9168\u916d\u914a\u917b\u919c\u9167\u91e3\u91e1\u9119\u91e5\u919b\u91b4\u9191\u91d0\u911f\u91de\u91b4\u91ad\u91a6\u91d9\u91c1\u9121\u9116\u916a\u912f\u91c2\u9174\u9114\u91b1\u9133\u9102\u91a9\u913d\u9150\u9140\u9156\u91c6\u9170\u9197\u91f2\u9168\u91c3\u91f9\u91ac\u91f4\u91e1\u9130\u91d2\u91a2\u91c7\u5533\u553c\u55b0\u5512\u55a3\u558b\u557d\u55f5\u5f02\u5f22\u5f84\u5f36\u5f94\u5fbf\u5f45\u5faf\u5fb3\u5ff4\u5fdf\u5fb3\u5f62\u5f88\u5fd6\u5f99\u5594\u55b3\u5537\u55bf\u5500\u5539\u5589\u5517\u5530\u5570\u5522\u553f\u55f4\u5509\u556e\u5554\u556e\u5534\u5561\u5596\ue3ac\ue387\ue37f\ue3f8\u049d\u04f9\u042d\u04af\u0408\u0423\u048f\u0432\u043b\u046d\u0456\u0448\uc22a\uc24e\uc296\uc23b\uc2bb\uc284\uc22c\uc2b2\uc29b\uc2dc\uc2d9\uc291\uc24c\uc2a0\uc2a4\uc2cd\u2753\u2747\u27df\u2706";
        char[] cArray = "\u738b\u73d7\u738f\u7397\u7393\u7383\u738b\u7397\u7383".toCharArray();
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
        IlIIl = stringArray;
        IlIlI = new Object[stringArray.length];
        int n6 = 2064583988;
        byte[] byArray = "\u00db\u00ad\u00bb\u00b1\u00baw\u0004\u0019\u00c4\u00bbB\u0096\u00fe\u00d3\u00f2\u00d3\u0007\u00c2\u00c4\u0095\u0090\u0098t \u00f4\u0010\fc\u0005>\u00a3A\u00be\u0007H\u00ab\u00abS-\u0003\u00ce5|\\9\u00d8=\u00e2".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IlIII = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            orchard.internal.lll.IlIII[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lllIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x8400BD4F;
        char[] cArray = IlIIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlIlI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            orchard.internal.lll.IlIlI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1478BA8B;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 26: {
                    n6 = 123;
                    continue block33;
                }
                case 17: {
                    n6 = 15;
                    continue block33;
                }
                case 18: {
                    n6 = 0;
                    continue block33;
                }
                case 3: {
                    n6 = 186;
                    continue block33;
                }
                case 29: {
                    n6 = 74;
                    continue block33;
                }
                case 16: {
                    n6 = 113;
                    continue block33;
                }
                case 31: {
                    n6 = 154;
                    continue block33;
                }
                case 9: {
                    n6 = 125;
                    continue block33;
                }
                case 6: {
                    n6 = 185;
                    continue block33;
                }
                case 23: {
                    n6 = 31;
                    continue block33;
                }
                case 4: {
                    n6 = 55;
                    continue block33;
                }
                case 21: {
                    n6 = 179;
                    continue block33;
                }
                case 30: {
                    n6 = 152;
                    continue block33;
                }
                case 24: {
                    n6 = 138;
                    continue block33;
                }
                case 27: {
                    n6 = 196;
                    continue block33;
                }
                case 15: {
                    n6 = 105;
                    continue block33;
                }
                case 14: {
                    n6 = 116;
                    continue block33;
                }
                case 20: {
                    n6 = 221;
                    continue block33;
                }
                default: {
                    n6 = 190;
                    continue block33;
                }
                case 13: {
                    n6 = 15;
                    continue block33;
                }
                case 7: {
                    n6 = 49;
                    continue block33;
                }
                case 2: {
                    n6 = 61;
                    continue block33;
                }
                case 11: {
                    n6 = 39;
                    continue block33;
                }
                case 12: {
                    n6 = 235;
                    continue block33;
                }
                case 19: {
                    n6 = 247;
                    continue block33;
                }
                case 28: {
                    n6 = 160;
                    continue block33;
                }
                case 10: {
                    n6 = 85;
                    continue block33;
                }
                case 8: {
                    n6 = 59;
                    continue block33;
                }
                case 22: {
                    n6 = 233;
                    continue block33;
                }
                case 5: {
                    n6 = 35;
                    continue block33;
                }
                case 25: {
                    n6 = 209;
                    continue block33;
                }
                case 1: 
            }
            n6 = 159;
        }
        return new String(cArray).intern();
    }
}

