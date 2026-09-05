/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIIl
 * Module         : KeyXbow  [COMBAT]
 * Description    : Automatically preforms a Xbow explosion when looking at the ground.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Action Delay
 *   - Switch Delay
 *   - Action Bind
 *   - .getBytes(
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
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.Blocks
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.ChargedProjectilesComponent
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.entity.vehicle.TntMinecartEntity
 *  net.minecraft.item.CrossbowItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Position
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package orchard.module.combat;

import com.google.gson.JsonObject;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.vehicle.TntMinecartEntity;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Position;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.BlockView;
import net.minecraft.world.RaycastContext;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIlIlII;
import orchard.internal.IIIlIII;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIIIl;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIllII;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlIll;
import orchard.internal.IlIlllI;
import orchard.internal.lIIl;
import orchard.internal.lIIlIIll;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIIl;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlllIII;
import orchard.internal.llIll;
import orchard.internal.llllIIl;

@Environment(value=EnvType.CLIENT)
public final class KeyXbow
extends ModuleBase {
    private final lIIlIIll I;
    private int l;
    private float II;
    private static final int Il = 9;
    private int lI;
    private long ll;
    private boolean III;
    private int IIl;
    private static final long IlI = 50L;
    private float Ill;
    private static final IIIlIIIII lII;
    private final IIIlIlIIl lIl;
    private final IIIIIIIIl<lIlllIII> llI;
    private int lll;
    private int IIII;
    private int IIIl;
    private static final double IIlI = 4.5;
    private IIllII IIll;
    private float IlII;
    private static final int IlIl = 1;
    private final lIlIIlI IllI;
    private static final double Illl = 1.0;
    private static final int lIII = 70;
    private final IlIlIlI lIIl;
    private float lIlI;
    private static final double lIll = 0.99;
    private static final long llII = 3000L;
    private float llIl;
    private static final double lllI = 0.0;
    private BlockPos llll;
    private IlIlIll IIIII;
    private static final int IIIIl = 2;
    private static final double IIIlI = 0.125;
    private float IIIll;
    private static final long IIlII = 50L;
    private static final double IIlIl = 0.58;
    private int IIllI;
    private static final double IIlll = 0.0625;
    private static final double IlIII = 0.38;
    private IIllII IlIIl;
    private IIIlIII IlIlI;
    private boolean IlIll;
    private static final double IllII = 3.15;
    private BlockPos IllIl;
    private long IlllI;
    private final IIIIIIIIl<lIlIIIl> Illll = this.IIlllIl(new IIIIIIIIl<lIlIIIl>(StringFactory.IIII("qptAnQ1eXxLXJZBdCg=="), lIlIIIl.class, lIlIIIl.Il));
    private Hand lIIII;
    private float lIIIl;
    private static final double lIIlI = 0.22;
    private static final double lIIll = 0.05;
    private float lIlII;
    private static final int lIlIl = 10;
    private final llIll lIllI;
    private static final double lIlll = 0.0;
    private static final double llIII = 0.08;
    private static final long llIIl = 2500L;
    private static final double llIlI = 1.6;
    private static final double llIll = 20.25;
    private boolean lllII;
    private static final int lllIl = 6;
    private static final IIIlIIIII llllI;
    private static final int[] lllll;
    private static final String[] IIIIII;
    private static final Object[] IIIIIl;

    private BlockHitResult lI(BlockPos blockPos) {
        return new BlockHitResult(this.llIlI(blockPos), Direction.UP, blockPos.down(), false);
    }

    private Vec3d IIl(BlockPos blockPos) {
        return Vec3d.ofBottomCenter((Vec3i)blockPos);
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IlI(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3) {
        if (vec3d3 == null) {
            return Double.NaN;
        }
        double d = vec3d2.x - vec3d.x;
        double d2 = vec3d2.y - vec3d.y;
        double d3 = vec3d2.z - vec3d.z;
        double d4 = Math.abs(d);
        double d5 = Math.abs(d2);
        double d6 = Math.abs(d3);
        if (d4 >= d5 && d4 >= d6 && d4 > 1.0E-7) {
            return (vec3d3.x - vec3d.x) / d;
        }
        if (d5 >= d4 && d5 >= d6 && d5 > 1.0E-7) {
            return (vec3d3.y - vec3d.y) / d2;
        }
        if (!(d6 > 1.0E-7)) return Double.NaN;
        return (vec3d3.z - vec3d.z) / d3;
    }

    private Vec3d lII(BlockPos blockPos) {
        return this.IIl(blockPos).subtract(0.0, 0.0625, 0.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll(MinecraftClient minecraftClient, IIllII iIllII, IIllII iIllII2, BooleanSupplier booleanSupplier) {
        if (this.IlIIl != iIllII) return false;
        if (this.IIll == iIllII) {
            this.IIIll();
            this.IIlll(minecraftClient);
            boolean bl = this.IllIIl(booleanSupplier);
            if (!bl) {
                this.ll = System.currentTimeMillis() + 50L;
                return bl;
            }
            this.IIIlII(iIllII2, minecraftClient);
            return bl;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIII(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) {
            return false;
        }
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        BlockState blockState2 = minecraftClient.world.getBlockState(blockPos.down());
        if (!blockState.isAir()) {
            if (!blockState.isReplaceable()) return false;
        }
        if (blockState2 == null) return false;
        if (blockState2.isAir()) return false;
        if (!blockState2.getFluidState().isEmpty()) return false;
        if (blockState2.getCollisionShape((BlockView)minecraftClient.world, blockPos.down()).isEmpty()) return false;
        if (!(minecraftClient.player.getEyePos().squaredDistanceTo(this.llIlI(blockPos)) <= 20.25)) return false;
        if (!this.lIll(minecraftClient, this.lIIllI(blockPos), blockPos.down())) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlI(MinecraftClient minecraftClient) {
        if (this.lIlIIl(minecraftClient, this.llll) && this.IIIIl(minecraftClient.world.getBlockState(this.IllIl)) && this.IIIIII(minecraftClient, this.IllIl) && this.IIIlI(minecraftClient, this.IllIl)) {
            if (!this.IlIllIl(minecraftClient.player.getInventory(), this.IIIl, this.IlIlI)) return;
            if (!this.IlIlI(minecraftClient, this.IIIl)) return;
            BlockHitResult blockHitResult = this.IIlIl(this.llll);
            this.IIIII(minecraftClient, IIllII.l, IIllII.Il, this.II, this.IIIll, blockHitResult, () -> this.lIlIll(minecraftClient, this.IIIl, blockHitResult));
            return;
        } else {
            this.llIIII(minecraftClient);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int IlII(PlayerInventory playerInventory) {
        int n = 0;
        while (n < 9) {
            ItemStack itemStack = playerInventory.getStack(n);
            if (itemStack.isOf(Items.RAIL)) return n;
            if (itemStack.isOf(Items.POWERED_RAIL)) return n;
            if (itemStack.isOf(Items.DETECTOR_RAIL)) return n;
            if (itemStack.isOf(Items.ACTIVATOR_RAIL)) return n;
            ++n;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllI(MinecraftClient minecraftClient) {
        if (this.lllII) {
            return;
        }
        if (this.lIIll(minecraftClient) && this.IIIIII(minecraftClient, this.IllIl) && this.lIlllI(minecraftClient, this.llll)) {
            boolean bl;
            if (!this.IIlIlI(minecraftClient)) {
                this.llIIII(minecraftClient);
                return;
            }
            if (this.lIIII == Hand.MAIN_HAND && !this.IlIlI(minecraftClient, this.IIII)) {
                return;
            }
            if (this.Illll.lIl() == lIlIIIl.Il) {
                this.lllII = true;
                this.l = minecraftClient.player.age + 1;
                boolean bl2 = IlIlllI.IIllll(minecraftClient, 200, this.Ill, this.lIlII, () -> this.llIlII(minecraftClient));
                if (bl2) return;
                this.lllII = false;
                this.l = Integer.MIN_VALUE;
                this.ll = System.currentTimeMillis();
                return;
            }
            float f = this.lIIl.IllII(minecraftClient, this.lllII(minecraftClient, this.Ill, this.lIlII), ((Double)this.IllI.lIl()).floatValue());
            long l2 = System.currentTimeMillis();
            if (!(f <= 0.5f)) {
                if (l2 - this.IlllI < 1500L) return;
            }
            if (!(bl = this.lIllII(minecraftClient))) {
                this.llIIII(minecraftClient);
                return;
            }
            this.IIIlII(IIllII.IIl, minecraftClient);
            return;
        }
        this.llIIII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIII(BlockPos blockPos, BlockPos blockPos2) {
        if (blockPos == null) return false;
        if (blockPos2 == null) return false;
        if (blockPos.getY() != blockPos2.getY()) {
            return false;
        }
        int n = Math.abs(blockPos.getX() - blockPos2.getX());
        int n2 = Math.abs(blockPos.getZ() - blockPos2.getZ());
        if (n + n2 != 1) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIl(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (!(itemStack.getItem() instanceof CrossbowItem)) return false;
        if (!CrossbowItem.isCharged((ItemStack)itemStack)) return false;
        ChargedProjectilesComponent chargedProjectilesComponent = (ChargedProjectilesComponent)itemStack.get(DataComponentTypes.CHARGED_PROJECTILES);
        if (chargedProjectilesComponent == null) return false;
        if (chargedProjectilesComponent.isEmpty()) return false;
        if (chargedProjectilesComponent.contains(Items.FIREWORK_ROCKET)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIll(MinecraftClient minecraftClient, Vec3d vec3d, BlockPos blockPos) {
        RaycastContext raycastContext;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (vec3d == null) return false;
        if (blockPos == null) {
            return false;
        }
        raycastContext(minecraftClient.player.getEyePos(), vec3d, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, (Entity)minecraftClient.player);
        BlockHitResult blockHitResult = minecraftClient.world.raycast(raycastContext);
        if (blockHitResult == null) return false;
        if (!blockHitResult.getBlockPos().equals((Object)blockPos)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llII(MinecraftClient minecraftClient) {
        if (!this.IIIIl(minecraftClient.world.getBlockState(this.IllIl))) {
            this.llIIII(minecraftClient);
            return;
        }
        if (this.IIIIII(minecraftClient, this.IllIl)) {
            this.IIIlII(IIllII.l, minecraftClient);
            return;
        }
        this.ll = System.currentTimeMillis() + 50L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean llIl(BlockHitResult blockHitResult) {
        if (blockHitResult == null) return false;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllI(MinecraftClient minecraftClient) {
        float[] fArray;
        float[] fArray2;
        float[] fArray3;
        llllIIl llllIIl2;
        lIIl lIIl2;
        int n;
        int n2;
        IIIlIIIl iIIlIIIl;
        PlayerInventory playerInventory;
        block4: {
            block3: {
                block2: {
                    if (minecraftClient.currentScreen != null) {
                        return false;
                    }
                    playerInventory = minecraftClient.player.getInventory();
                    iIIlIIIl = this.lIIlll(playerInventory);
                    n2 = this.IlII(playerInventory);
                    n = this.IlIII(playerInventory, Items.TNT_MINECART);
                    lIIl2 = this.IIIllI(minecraftClient);
                    if (iIIlIIIl == null) return false;
                    if (n2 < 0) return false;
                    if (n < 0) return false;
                    if (lIIl2 == null) break block2;
                    llllIIl2 = this.lIIlII(minecraftClient, lIIl2.II());
                    if (llllIIl2 == null) return false;
                    if (!this.lIIIII(minecraftClient, llllIIl2.II(), llllIIl2.I())) break block3;
                    fArray3 = IlIlllI.IlIll(minecraftClient, this.IIl(llllIIl2.II()));
                    fArray2 = IlIlllI.IlIll(minecraftClient, this.llIlI(llllIIl2.I()));
                    fArray = IlIlllI.IlIll(minecraftClient, this.IllIII(llllIIl2.I()));
                    if (fArray3 == null) return false;
                    if (fArray2 == null) return false;
                    if (fArray == null) {
                        return false;
                    }
                    break block4;
                }
                return false;
            }
            return false;
        }
        this.IIllI = lIIllllI.lllI(playerInventory);
        this.IIIl = iIIlIIIl.I();
        this.IlIlI = iIIlIIIl.l();
        this.lll = n2;
        this.lI = n;
        this.IIII = lIIl2.l();
        this.lIIII = lIIl2.I();
        this.llll = llllIIl2.II();
        this.IllIl = llllIIl2.I();
        this.II = fArray3[0];
        this.IIIll = fArray3[1];
        this.lIIIl = fArray2[0];
        this.lIlI = fArray2[1];
        this.llIl = fArray[0];
        this.IlII = fArray[1];
        this.Ill = llllIIl2.Il();
        this.lIlII = llllIIl2.l();
        this.IlIIl = IIllII.IlI;
        this.IlllI = System.currentTimeMillis();
        this.ll = this.IlllI + Math.max(0L, this.IllIlI(IIllII.IlI) - 50L);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIII(MinecraftClient minecraftClient, IIllII iIllII, IIllII iIllII2, float f, float f2, BlockHitResult blockHitResult, BooleanSupplier booleanSupplier) {
        if (this.Illll.lIl() == lIlIIIl.Il) {
            this.IIll = iIllII;
            this.IIl = minecraftClient.player.age + 2;
            boolean bl = IlIlllI.lI(minecraftClient, blockHitResult);
            boolean bl2 = IlIlllI.IlI(minecraftClient, 200, bl ? minecraftClient.player.getYaw() : f, bl ? minecraftClient.player.getPitch() : f2, () -> this.lll(minecraftClient, iIllII, iIllII2, booleanSupplier));
            if (bl2) return;
            this.IIIll();
            this.ll = System.currentTimeMillis();
            return;
        }
        boolean bl = IlIlllI.lI(minecraftClient, blockHitResult);
        float f3 = bl ? 0.0f : this.lIIl.llIIIl(minecraftClient, blockHitResult, ((Double)this.IllI.lIl()).floatValue());
        long l2 = System.currentTimeMillis();
        if (!bl && !(f3 <= 0.5f)) {
            if (l2 - this.IlllI < 1500L) return;
        }
        if (!bl) {
            lIIllllI.IIlII(minecraftClient, f, f2);
        }
        this.IIlll(minecraftClient);
        if (this.IllIIl(booleanSupplier)) {
            this.IIIlII(iIllII2, minecraftClient);
            return;
        }
        this.ll = System.currentTimeMillis() + 50L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIl(BlockState blockState) {
        if (blockState == null) return false;
        if (blockState.isOf(Blocks.RAIL)) return true;
        if (blockState.isOf(Blocks.POWERED_RAIL)) return true;
        if (blockState.isOf(Blocks.DETECTOR_RAIL)) return true;
        if (!blockState.isOf(Blocks.ACTIVATOR_RAIL)) return false;
        return true;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 7949;
        String string = "\ufd1d\ufd02\ufdff\ufdd0\ufd6a\ufd4c\ufd6a\ufd03\ufd65\ufd10\ufd4d\ufde6\ufde6\ufddb\ufdef\ufd5f\ue2b6\ue2a9\ue254\ue27b\ue2c1\ue2e7\ue2c1\ue2a8\ue2ce\ue2bb\ue2b9\ue27b\ue24d\ue24a\ue202\ue288\u2fdd\u2fab\u2f1b\u2f19\u2fb0\u2f9a\u2f82\u2fc6\u2fb4\u2fe5\u2f80\u2f78\uad07\uad1b\uadc7\uadca\uad77\uad7c\uad78\uad14\uad68\uad0c\uad36\uadcc\uadfd\uadeb\uadc8\uad2e\uadac\uad00\uad64\uad5c\uad94\uad1e\uad08\uadd0\uadde\uada6\uada3\uad2e\uad46\uad1f\uad59\uad44\uad43\uad38\uadc2\uadef\uad4a\uad6c\uad43\uad17\uad08\uad7a\uad00\uadd0\uadd3\uadf7\uadf3\uad28\uadaf\uad36\uad5c\uad76\uada6\uad1d\uad7b\uadc2\uade4\uadfe\uadf3\uad2b\uad27\uad64\uad5f\uad72\uad19\uad77\uadb0\uadea\uad71\uad35\uad46\uad14\uad68\uad08\uad18\uaddd\uadff\uadfb\uade9\uad22\uada9\uad3d\uad7c\uad41\uad97\uad61\uad5b\uadd2\uadce\uadf5\uadaa\uad46\uf055\uf064\uf0a3\uf09c\uf024\uf003\uf04d\uf070\uf034\uf060\uf07b\uf097\uf0a2\uf0bd\uf092\uf04a\uf0ff\uf041\uf05f\uf078\uabb7\uabae\uab79\uab5c\uabc6\uabe3\uabad\uab90\uabd4\uab80\uab9b\uab77\uab42\uab5d\uab72\uabaa\uab1f\uaba1\uabbf\uab98\u10db\u10ae\u101b\u1014\u10a9\u108e\u1096\u10ca\u10b0\u10d4\u10e8\u107c\u2a5e\u2a2b\u2a92\u2a80\u2a2b\u2a1f\u2a1b\u2a64\u2a31\u2a41\u2a7f\u2a93\u2aa6\u2abd\u2ae6\u2a18\uae93\uae96\uae6f\uae3b\u3adb\u3aae\u3a17\u3a37\u3aad\u3a9e\u3a82\u3afd\u3aa7\u3ad2\u3a8f\u3a16\u3a25\u3a5c\u3a0f\u3a9d\ub5c1\ub5b4\ub50d\ub52d\ub5b7\ub584\ub598\ub5e7\ub5bd\ub5c8\ub5ca\ub508\ub53e\ub539\ub571\ub5fb";
        char[] cArray = "\u1f1d\u1f1d\u1f01\u1f51\u1f19\u1f19\u1f01\u1f1d\u1f09\u1f1d\u1f1d".toCharArray();
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
        IIIIII = stringArray;
        IIIIIl = new Object[stringArray.length];
        int n6 = 1535255336;
        byte[] byArray = "n\u00f7\u00e2\u00db\u00aa\u007f\u0095 d\u008a=\u000eWsuSv\u00b5#\u00a1\u0089\u0091!\u00fe\u0087\u00f2G\u00e9\n\u00a1v\u0086v\u00c4-X\u00e9\u0093MD&\u00b1\\e\u00f7\u009c\u00f7\u00a7\u00ec\u0005\u00de/\\b\u00f5S\u0097^0t\u00c8w,\u00f8]\u008e~[$\u007f\u00ed\u00b5\u001agX;+\u00a1mw\u00c2\u0015\u0019\u00bb\u00ea\u00b0\u00b8\u00f3\u00b9A+\u00e9o\u00b8\u00e7\u00e5\u00f4\u00d5S^\u00b4\u00fa\u0084\u000e,\u00e0\u00fc\u001c\u00a0\\\u0094\u00b1Dy\u0080p".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        lllll = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            KeyXbow.lllll[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        llllI = StringFactory.IIII("Action Bind");
        lII = StringFactory.IIII("Action Delay");
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlI(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (blockPos == null) return false;
        if (!(minecraftClient.player.getEyePos().squaredDistanceTo(this.IllIII(blockPos)) <= 20.25)) return false;
        return true;
    }

    private void IIIll() {
        this.IIll = IIllII.lI;
        this.IIl = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        this.IIlIIl(MinecraftClient.getInstance());
        this.IlIll = false;
        this.III = false;
        this.lIIlI();
        this.lIIl.IlIIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlII(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n >= 9) {
            return false;
        }
        if (this.I.Il(n)) return this.I.lI(n, System.currentTimeMillis());
        boolean bl = lIIllllI.llIllI(minecraftClient) != n;
        long l2 = bl ? this.llIlIl(this.lIl) : 0L;
        this.I.II(n, System.currentTimeMillis(), l2);
        return this.I.lI(n, System.currentTimeMillis());
    }

    /*
     * Enabled aggressive block sorting
     */
    public KeyXbow() {
        super(StringFactory.IIII("s5FNpBtYRw=="), Category.II, StringFactory.IIII("uYFAkxRWRBWUCZNVFpPOjJ2SW44URBAd1zCdVhiT24aImFuPEFheXIAAmldP39GRk51am1lWRFyDAJoZCMHRi5aQGg=="));
        llIll llIll2;
        IIIlIlIIl iIIlIlIIl;
        this.llI = this.IIlllIl(new IIIIIIIIl<lIlllIII>(StringFactory.IIII("sZNalQ1eXxLXJZBdCg=="), lIlllIII.class, lIlllIII.II));
        this.IllI = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("q4BGmRdQRBQ="), 50.0, 1.0, 100.0, 1.0).lIII(() -> {
            if (this.Illll.lIl() != lIlIIIl.l) return false;
            return true;
        }));
        this.lIIl = new IlIlIlI();
        iIIlIlIIl(StringFactory.IIII("q4NVjFlzVRCWEQ=="), 45.0, 45.0, 0.0, 300.0, 5.0);
        this.lIl = this.IIlllIl(iIIlIlIIl.IIll(StringFactory.IIII("ms")));
        llIll2((Object)StringFactory.IIII("q4NdiBpfED6WC5Q="), true);
        this.lIllI = this.IIlllIl(llIll2);
        this.IlIIl = IIllII.lI;
        this.IIllI = -1;
        this.IIIl = -1;
        this.IlIlI = IIIlIII.I;
        this.lll = -1;
        this.lI = -1;
        this.IIII = -1;
        this.lIIII = Hand.MAIN_HAND;
        this.IIll = IIllII.lI;
        this.IIl = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.I = new lIIlIIll();
    }

    private BlockHitResult IIlIl(BlockPos blockPos) {
        return new BlockHitResult(this.IIl(blockPos), Direction.UP, blockPos.down(), false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.options == null) return;
        if (minecraftClient.options.useKey != null) {
            lIIllllI.llIlIl(minecraftClient.options.useKey);
            minecraftClient.options.useKey.setPressed(false);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IlIII(PlayerInventory playerInventory, Item item) {
        int n = 0;
        while (n < 9) {
            if (playerInventory.getStack(n).isOf(item)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockPos[] IlIIl(BlockPos blockPos, Direction direction) {
        Direction direction2 = direction.getOpposite();
        return new BlockPos[]{blockPos.offset(direction2), blockPos.offset(direction2).offset(direction2), blockPos.offset(direction2.rotateYClockwise()), blockPos.offset(direction2.rotateYCounterclockwise())};
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIlI(MinecraftClient minecraftClient, int n) {
        if (minecraftClient != null && minecraftClient.player != null && n >= 0) {
            if (n < 9) return this.IIlII(minecraftClient, n);
        }
        this.llIIII(minecraftClient);
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private BlockHitResult IlIll(BlockPos blockPos) {
        if (blockPos == null) {
            return null;
        }
        BlockHitResult blockHitResult = new BlockHitResult(this.IllIII(blockPos), Direction.UP, blockPos, false);
        return blockHitResult;
    }

    /*
     * Enabled aggressive block sorting
     */
    private llllIIl IllII(MinecraftClient minecraftClient, IIIIlIlII iIIIlIlII, float f, float f2) {
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof BlockHitResult)) return null;
        BlockHitResult blockHitResult = (BlockHitResult)hitResult;
        if (blockHitResult.getType() == HitResult.Type.BLOCK) return this.lIlIlI(minecraftClient, iIIIlIlII, blockHitResult, f, f2);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlllI(MinecraftClient minecraftClient) {
        if (!this.IIIlI(minecraftClient, this.IllIl)) {
            this.llIIII(minecraftClient);
            return;
        }
        if (!this.IIIIl(minecraftClient.world.getBlockState(this.IllIl))) {
            long l2 = System.currentTimeMillis();
            if (l2 - this.IlllI <= 2500L) {
                this.ll = l2 + 50L;
                return;
            }
        } else {
            if (!this.IlIlI(minecraftClient, this.lI)) {
                return;
            }
            this.IlllII(minecraftClient);
            return;
        }
        this.llIIII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d Illll(float f, float f2) {
        Vec3d vec3d;
        double d = Math.toRadians(f);
        double d2 = Math.toRadians(f2);
        double d3 = Math.cos(d2);
        vec3d(-Math.sin(d) * d3, -Math.sin(d2), Math.cos(d) * d3);
        return vec3d.normalize();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player != null) {
            if (!((Boolean)this.lIllI.lIl()).booleanValue()) {
                lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
                return true;
            }
            if (this.IIllI >= 0 && this.IIllI < 9) {
                lIIllllI.IlIlllI(minecraftClient, this, this.IIllI);
                return true;
            }
        } else {
            return false;
        }
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIlI() {
        this.IlIIl = IIllII.lI;
        this.llll = null;
        this.IllIl = null;
        this.IIllI = -1;
        this.IIIl = -1;
        this.IlIlI = IIIlIII.I;
        this.lll = -1;
        this.lI = -1;
        this.IIII = -1;
        this.lIIII = Hand.MAIN_HAND;
        this.IlllI = 0L;
        this.ll = 0L;
        this.II = 0.0f;
        this.IIIll = 0.0f;
        this.lIIIl = 0.0f;
        this.lIlI = 0.0f;
        this.llIl = 0.0f;
        this.IlII = 0.0f;
        this.Ill = 0.0f;
        this.lIlII = 0.0f;
        this.IIIll();
        this.lllII = false;
        this.l = Integer.MIN_VALUE;
        this.IIIII = null;
        this.I.l();
    }

    private boolean lIIll(MinecraftClient minecraftClient) {
        block1: {
            block2: {
                block0: {
                    if (minecraftClient == null) break block0;
                    if (minecraftClient.player == null) break block0;
                    if (this.lIIII != Hand.OFF_HAND) break block1;
                    break block2;
                }
                return false;
            }
            return this.lIIl(minecraftClient.player.getOffHandStack());
        }
        return this.llIIIl(minecraftClient.player.getInventory(), this.IIII);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int lIlII(PlayerInventory playerInventory) {
        int n;
        block3: {
            block2: {
                n = 0;
                if (!true) break block2;
                if (n >= 9) return -1;
                if (this.lIIl(playerInventory.getStack(n))) break block3;
            }
            do {
                ++n;
                if (n >= 9) return -1;
            } while (!this.lIIl(playerInventory.getStack(n)));
        }
        return n;
    }

    private int lIlIl(IIIlIlIIl iIIlIlIIl) {
        return Math.max(0, (int)Math.ceil((double)this.llIlIl(iIIlIlIIl) / 50.0));
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockHitResult lIllI(MinecraftClient minecraftClient, Vec3d vec3d, Vec3d vec3d2) {
        if (minecraftClient == null) return null;
        if (minecraftClient.world != null) return minecraftClient.world.raycast(new RaycastContext(vec3d, vec3d2, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)minecraftClient.player));
        return null;
    }

    private Vec3d llIlI(BlockPos blockPos) {
        return Vec3d.ofBottomCenter((Vec3i)blockPos);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        this.lllIll(jsonObject, llllI.IIII());
        this.llllll(jsonObject, lII.IIII(), this.lIl);
        this.llllll(jsonObject, "Switch Delay", this.lIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d lllII(MinecraftClient minecraftClient, float f, float f2) {
        float f3 = f * ((float)Math.PI / 180);
        float f4 = f2 * ((float)Math.PI / 180);
        float f5 = MathHelper.cos((double)f4);
        float f6 = MathHelper.sin((double)f4);
        float f7 = MathHelper.cos((double)f3);
        float f8 = MathHelper.sin((double)f3);
        Vec3d vec3d = new Vec3d((double)(-f8 * f5), (double)(-f6), (double)(f7 * f5));
        return minecraftClient.player.getEyePos().add(vec3d.multiply(5.0));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllll() {
        this.IlIll = false;
        if (this.IIIIIII()) return;
        if (!this.IIIlIIl()) return;
        this.IIlIIll(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIII(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) return false;
        Box box = new Box(blockPos).expand(0.75, 0.6, 0.75);
        if (minecraftClient.world.getOtherEntities(null, box, entity -> {
            if (!(entity instanceof TntMinecartEntity)) return false;
            if (entity.isRemoved()) return false;
            return true;
        }).isEmpty()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIIIIl(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3) {
        if (vec3d == null) return Double.POSITIVE_INFINITY;
        if (vec3d2 == null) return Double.POSITIVE_INFINITY;
        if (vec3d3 == null) {
            return Double.POSITIVE_INFINITY;
        }
        Vec3d vec3d4 = vec3d2.subtract(vec3d);
        double d = vec3d4.lengthSquared();
        if (!(d < 1.0E-7)) {
            double d2 = vec3d3.subtract(vec3d).dotProduct(vec3d4) / d;
            d2 = Math.max(0.0, Math.min(1.0, d2));
            return vec3d.add(vec3d4.multiply(d2)).squaredDistanceTo(vec3d3);
        }
        return vec3d.squaredDistanceTo(vec3d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIlI(MinecraftClient minecraftClient) {
        if (this.IlIIl == IIllII.ll && this.IIlIll(minecraftClient, this.IllIl) && this.IIlIII(minecraftClient.player.getInventory().getStack(this.lI))) {
            this.IIIll();
            boolean bl = this.lIlIll(minecraftClient, this.lI, this.IlIll(this.IllIl));
            if (bl) {
                this.IIIlII(IIllII.I, minecraftClient);
                return bl;
            }
            this.IlIllII();
            return bl;
        }
        this.IlIllII();
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.interactionManager == null) {
            return false;
        }
        if (this.lIIII != Hand.MAIN_HAND || this.llIIIl(minecraftClient.player.getInventory(), this.IIII)) {
            if (this.lIIII != Hand.OFF_HAND) return lIIllllI.IlIIIl(minecraftClient, this, this.IIII, () -> {
                this.IIlll(minecraftClient);
                return this.IllIIl(() -> lIIllllI.IIllIll(minecraftClient, Hand.MAIN_HAND));
            });
            this.IIlll(minecraftClient);
            return this.IllIIl(() -> lIIllllI.IIllIll(minecraftClient, this.lIIII));
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlII(IIllII iIllII, MinecraftClient minecraftClient) {
        this.IIIII = null;
        this.I.l();
        this.IlIIl = iIllII;
        long l2 = System.currentTimeMillis();
        this.IlllI = l2;
        this.ll = l2 + Math.max(0L, this.IllIlI(iIllII) - 50L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private llllIIl IIIlIl(MinecraftClient minecraftClient, IIIIlIlII iIIIlIlII, BlockPos blockPos, BlockPos blockPos2, float f, float f2) {
        if (!this.lIII(blockPos, blockPos2)) {
            return null;
        }
        if (this.lIIIII(minecraftClient, blockPos, blockPos2)) {
            float[] fArray = this.IlIlII(minecraftClient, iIIIlIlII, blockPos, blockPos2, f, f2);
            if (fArray != null) return new llllIIl(blockPos.toImmutable(), blockPos2.toImmutable(), fArray[0], fArray[1]);
            return null;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIl IIIllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) {
            return null;
        }
        PlayerInventory playerInventory = minecraftClient.player.getInventory();
        int n = lIIllllI.lllI(playerInventory);
        ItemStack itemStack = minecraftClient.player.getMainHandStack();
        if (this.lIIl(itemStack)) {
            return new lIIl(Hand.MAIN_HAND, n, itemStack);
        }
        ItemStack itemStack2 = minecraftClient.player.getOffHandStack();
        if (this.lIIl(itemStack2)) {
            return new lIIl(Hand.OFF_HAND, -1, itemStack2);
        }
        int n2 = 0;
        while (n2 < 9) {
            ItemStack itemStack3 = playerInventory.getStack(n2);
            if (this.lIIl(itemStack3)) {
                return new lIIl(Hand.MAIN_HAND, n2, itemStack3);
            }
            ++n2;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlll(MinecraftClient minecraftClient) {
        if (this.IIll != IIllII.lI) {
            if (minecraftClient.player.age <= this.IIl) {
                return true;
            }
            this.IIIll();
            this.ll = System.currentTimeMillis();
        }
        if (!this.lllII) return false;
        if (minecraftClient.player.age <= this.l) {
            return true;
        }
        this.lllII = false;
        this.l = Integer.MIN_VALUE;
        this.ll = System.currentTimeMillis();
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIlIII(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (!itemStack.isOf(Items.TNT_MINECART)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) {
            return;
        }
        if (!((Boolean)this.lIllI.lIl()).booleanValue()) {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
            return;
        }
        if (this.IIllI >= 0 && this.IIllI < 9) {
            lIIllllI.IlIlllI(minecraftClient, this, this.IIllI);
            return;
        }
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.llll == null) return false;
        if (this.IllIl == null) return false;
        ItemStack itemStack = this.IIllll(minecraftClient);
        if (!this.lIIl(itemStack)) return false;
        IIIIlIlII iIIIlIlII = this.llIIlI(itemStack);
        float[] fArray = this.IlIlII(minecraftClient, iIIIlIlII, this.llll, this.IllIl, this.Ill, this.lIlII);
        if (fArray == null) return false;
        this.Ill = fArray[0];
        this.lIlII = fArray[1];
        return this.IlIIIl(minecraftClient, iIIIlIlII, this.llll, this.IllIl, this.Ill, this.lIlII);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIll(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) return false;
        if (!this.IIIIl(minecraftClient.world.getBlockState(blockPos))) return false;
        if (!this.IIIlI(minecraftClient, blockPos)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private double IIllII(MinecraftClient var1_1, IIIIlIlII var2_2, BlockPos var3_3, BlockPos var4_4, float var5_5, float var6_6) {
        block24: {
            block17: {
                block29: {
                    block26: {
                        block23: {
                            block21: {
                                block25: {
                                    block22: {
                                        block27: {
                                            block16: {
                                                block19: {
                                                    block20: {
                                                        block28: {
                                                            block18: {
                                                                if (var1_1 == null) break block24;
                                                                break block25;
lbl3:
                                                                // 2 sources

                                                                while (this.lIIIIl(var13_13)) {
                                                                    break block16;
                                                                }
                                                                break block26;
lbl6:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
lbl8:
                                                                // 1 sources

                                                                while (var14_14 > var16_15) {
                                                                    break block17;
                                                                }
                                                                break block27;
lbl11:
                                                                // 1 sources

                                                                return NaN;
lbl13:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (!this.IlllIl(var13_13, var7_7, var12_12, var16_15)) break block18;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl16:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
lbl18:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            if (var9_9) break block27;
                                                            break block28;
lbl23:
                                                            // 1 sources

                                                            while (true) {
                                                                var8_8 = var8_8.multiply(var2_2.II()).subtract(0.0, var2_2.l(), 0.0);
                                                                break block19;
lbl26:
                                                                // 2 sources

                                                                while (true) {
                                                                    if (var11_11 >= 70) break block20;
                                                                    ** continue;
                                                                    break;
                                                                }
                                                                break;
                                                            }
                                                            while (true) {
                                                                break block21;
                                                                break;
                                                            }
lbl31:
                                                            // 1 sources

                                                            while (!Double.isNaN(var14_14)) {
                                                                break block22;
                                                            }
                                                            ** GOTO lbl3
                                                        }
                                                        if (Double.isNaN(var14_14)) break block17;
                                                        ** GOTO lbl8
lbl37:
                                                        // 1 sources

                                                        while (var1_1.world != null) {
                                                            break block23;
                                                        }
                                                        break block24;
                                                    }
                                                    return NaN;
lbl42:
                                                    // 1 sources

                                                    while (true) {
                                                        ++var11_11;
                                                        ** GOTO lbl26
                                                        break;
                                                    }
                                                }
                                                ** while (!(var7_7.y < (double)var1_1.world.getBottomY() - 20.0))
lbl47:
                                                // 1 sources

                                                break block29;
                                            }
                                            return NaN;
                                        }
                                        return this.IIIIIl(var7_7, var12_12, var10_10);
                                    }
                                    var9_9 = true;
                                    ** GOTO lbl3
                                }
                                if (var1_1.player == null) break block24;
                                ** GOTO lbl37
                                var14_14 = this.IlIllI(var7_7, var12_12, var3_3, 0.08, 0.0, 1.0);
                                var16_15 = this.IlIllI(var7_7, var12_12, var4_4, 0.08, 0.22, 0.58);
                                if (Double.isNaN(var16_15)) ** GOTO lbl31
                                ** while (true)
lbl62:
                                // 1 sources

                                while (true) {
                                    var11_11 = 0;
                                    ** continue;
                                    break;
                                }
                                var9_9 = false;
                                var10_10 = this.IIlllI(var4_4);
                                ** while (true)
                            }
                            var7_7 = var1_1.player.getEyePos();
                            var8_8 = this.Illll(var5_5, var6_6).multiply(var2_2.I()).add(var1_1.player.getVelocity());
                            ** while (true)
lbl72:
                            // 1 sources

                            while (true) {
                                if (var4_4 != null) ** continue;
                                break block24;
                                break;
                            }
                        }
                        if (var2_2 != null && var3_3 != null) {
                            ** continue;
                        }
                        break block24;
                        var12_12 = var7_7.add(var8_8);
                        var13_13 = this.lIllI(var1_1, var7_7, var12_12);
                        ** while (true)
                    }
                    var7_7 = var12_12;
                    ** while (true)
                }
                return NaN;
            }
            return NaN;
        }
        return NaN;
    }

    private Vec3d IIlllI(BlockPos blockPos) {
        return new Vec3d((double)blockPos.getX() + 0.5, (double)blockPos.getY() + 0.38, (double)blockPos.getZ() + 0.5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private ItemStack IIllll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return ItemStack.EMPTY;
        if (minecraftClient.player != null) {
            if (this.lIIII != Hand.OFF_HAND) {
                if (this.IIII < 0) return ItemStack.EMPTY;
                if (this.IIII < 9) return minecraftClient.player.getInventory().getStack(this.IIII);
                return ItemStack.EMPTY;
            }
            return minecraftClient.player.getOffHandStack();
        }
        return ItemStack.EMPTY;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIIIl(MinecraftClient minecraftClient, IIIIlIlII iIIIlIlII, BlockPos blockPos, BlockPos blockPos2, float f, float f2) {
        if (Double.isNaN(this.IIllII(minecraftClient, iIIIlIlII, blockPos, blockPos2, f, f2))) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private float[] IlIlII(MinecraftClient var1_1, IIIIlIlII var2_2, BlockPos var3_3, BlockPos var4_4, float var5_5, float var6_6) {
        block41: {
            block42: {
                block54: {
                    block47: {
                        block46: {
                            block55: {
                                block52: {
                                    block56: {
                                        block45: {
                                            block39: {
                                                block40: {
                                                    block53: {
                                                        block51: {
                                                            block43: {
                                                                block50: {
                                                                    block44: {
                                                                        block38: {
                                                                            block48: {
                                                                                block49: {
                                                                                    if (var1_1 == null) break block48;
                                                                                    break block49;
lbl3:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl5:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl7:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (var1_1.player == null) break block48;
                                                                                break block50;
lbl12:
                                                                                // 1 sources

                                                                                return null;
lbl14:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var20_22 = -1.0;
                                                                                    ** GOTO lbl21
                                                                                    break;
                                                                                }
lbl17:
                                                                                // 3 sources

                                                                                while (true) {
                                                                                    var22_26 += 0.25;
lbl19:
                                                                                    // 2 sources

                                                                                    while (!(var22_26 <= 1.001)) {
                                                                                        var20_22 += 0.25;
lbl21:
                                                                                        // 2 sources

                                                                                        if (!(var20_22 <= 1.001)) lbl-1000:
                                                                                        // 2 sources

                                                                                        {
                                                                                            return var13_13;
                                                                                        }
                                                                                        break block38;
                                                                                    }
                                                                                    break block39;
                                                                                    break;
                                                                                }
                                                                            }
lbl27:
                                                                            // 4 sources

                                                                            return null;
lbl29:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var20_23 = -8.0;
                                                                                break block40;
                                                                                break;
                                                                            }
lbl32:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
lbl34:
                                                                            // 1 sources

                                                                            return new float[]{var5_5, var6_6};
lbl36:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
lbl38:
                                                                            // 1 sources

                                                                            while (!Double.isNaN(var24_33)) {
                                                                                break block41;
                                                                            }
                                                                            break block45;
                                                                            while (true) {
                                                                                break block42;
                                                                                break;
                                                                            }
lbl43:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var10_10 = var8_8[1];
                                                                                ** continue;
                                                                                break;
                                                                            }
lbl46:
                                                                            // 3 sources

                                                                            while (true) {
                                                                                ++var24_30;
                                                                                break block43;
                                                                                break;
                                                                            }
                                                                        }
                                                                        var22_26 = -1.0;
                                                                        ** GOTO lbl19
lbl52:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (var4_4 != null) ** continue;
                                                                            ** GOTO lbl27
                                                                            break;
                                                                        }
                                                                        var26_35 = this.IIllII(var1_1, var2_2, var3_3, var4_4, var21_24, var25_34);
                                                                        if (Double.isNaN(var26_35)) ** GOTO lbl46
                                                                        break block51;
lbl58:
                                                                        // 1 sources

                                                                        while (!Double.isNaN(var16_15)) {
                                                                            ** continue;
lbl60:
                                                                            // 1 sources

                                                                            ** GOTO lbl34
                                                                        }
                                                                        break block52;
lbl62:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var18_18 = -4.0;
                                                                            break block44;
                                                                            break;
                                                                        }
lbl65:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var13_13 = null;
                                                                            ** continue;
                                                                            break;
                                                                        }
lbl68:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var13_13 = new float[]{var22_27, var23_29};
                                                                            break block45;
                                                                            break;
                                                                        }
                                                                        while (true) {
                                                                            var25_34 = var22_25[var24_30];
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                        while (true) {
                                                                            var18_18 += 1.0;
                                                                            break block44;
                                                                            break;
                                                                        }
lbl77:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (!(var26_35 < var14_14)) ** GOTO lbl17
                                                                            break block46;
                                                                            break;
                                                                        }
lbl80:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var18_18 <= 4.001) {
                                                                        ** continue;
                                                                    }
                                                                    break block53;
                                                                }
                                                                if (var2_2 == null) ** GOTO lbl27
                                                                break block54;
                                                            }
lbl90:
                                                            // 2 sources

                                                            while (true) {
                                                                if (var24_30 < var23_28) ** continue;
                                                                ++var20_21;
                                                                break block47;
                                                                break;
                                                            }
                                                            var14_14 = var26_35;
                                                            var13_13 = new float[]{var21_24, var25_34};
                                                            ** GOTO lbl46
                                                        }
                                                        if (var26_35 < var14_14) ** break;
                                                        ** while (true)
                                                        ** while (true)
lbl101:
                                                        // 1 sources

                                                        while (true) {
                                                            var22_25 = var12_12;
                                                            var23_28 = var22_25.length;
                                                            var24_30 = 0;
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
                                                    ** while (var13_13 == null)
lbl108:
                                                    // 1 sources

                                                    break block55;
                                                    var14_14 = Infinity;
                                                    var16_15 = this.IIllII(var1_1, var2_2, var3_3, var4_4, var5_5, var6_6);
                                                    ** GOTO lbl58
lbl112:
                                                    // 1 sources

                                                    while (true) {
                                                        var22_27 = (float)((double)var9_9 + var18_18);
                                                        ** continue;
                                                        break;
                                                    }
                                                }
lbl116:
                                                // 2 sources

                                                while (true) {
                                                    if (!(var20_23 <= 10.001)) ** continue;
                                                    ** continue;
                                                    break;
                                                }
                                                var23_29 = (float)((double)var10_10 + var20_23);
                                                var24_33 = this.IIllII(var1_1, var2_2, var3_3, var4_4, var22_27, var23_29);
                                                ** GOTO lbl38
                                                var25_34 = (float)((double)var19_20 + var22_26);
                                                var26_35 = this.IIllII(var1_1, var2_2, var3_3, var4_4, var24_31, var25_34);
                                                break block56;
                                            }
                                            var24_31 = (float)((double)var18_17 + var20_22);
                                            ** while (true)
                                        }
lbl129:
                                        // 2 sources

                                        while (true) {
                                            var20_23 += 1.0;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    if (Double.isNaN(var26_35)) ** GOTO lbl17
                                    ** while (true)
                                }
                                var18_16 = var11_11;
                                var19_19 = var18_16.length;
                                var20_21 = 0;
                                break block47;
                            }
                            var18_17 = var13_13[0];
                            var19_20 = var13_13[1];
                            ** while (true)
lbl144:
                            // 1 sources

                            while (true) {
                                var21_24 = var18_16[var20_21];
                                ** continue;
                                break;
                            }
lbl147:
                            // 1 sources

                            while (true) {
                                var13_13 = new float[]{var24_31, var25_34};
                                ** continue;
                                break;
                            }
                            while (true) {
                                var9_9 = var8_8[0];
                                ** continue;
                                break;
                            }
                        }
                        var14_14 = var26_35;
                        ** while (true)
                    }
                    ** while (var20_21 >= var19_19)
lbl158:
                    // 1 sources

                    ** while (true)
                    var11_11 = new float[]{var5_5, var9_9};
                    var12_12 = new float[]{var6_6, var10_10, var10_10 + 1.0f, var10_10 + 2.0f, var10_10 - 1.0f, var10_10 - 2.0f, var10_10 + 3.5f, var10_10 - 3.5f};
                    ** while (true)
lbl162:
                    // 1 sources

                    while (true) {
                        if (var8_8 != null) ** continue;
                        ** continue;
                        break;
                    }
                }
                if (var3_3 != null) ** break;
                ** while (true)
                ** while (true)
lbl169:
                // 1 sources

                while (true) {
                    var14_14 = var24_33;
                    ** continue;
                    break;
                }
            }
            var7_7 = this.IIlllI(var4_4);
            var8_8 = IlIlllI.IlIll(var1_1, var7_7);
            ** while (true)
        }
        ** while (!(var24_33 < var14_14))
lbl178:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IlIllI(Vec3d vec3d, Vec3d vec3d2, BlockPos blockPos, double d, double d2, double d3) {
        double d4 = (double)blockPos.getX() - d;
        double d5 = (double)blockPos.getX() + 1.0 + d;
        double d6 = (double)blockPos.getY() + d2 - d;
        double d7 = (double)blockPos.getY() + d3 + d;
        double d8 = (double)blockPos.getZ() - d;
        double d9 = (double)blockPos.getZ() + 1.0 + d;
        double d10 = vec3d2.x - vec3d.x;
        double d11 = vec3d2.y - vec3d.y;
        double d12 = vec3d2.z - vec3d.z;
        double d13 = 0.0;
        double d14 = 1.0;
        double[] dArray = this.lIIlIl(vec3d.x, d10, d4, d5, d13, d14);
        if (dArray != null) {
            d13 = dArray[0];
            d14 = dArray[1];
            if ((dArray = this.lIIlIl(vec3d.y, d11, d6, d7, d13, d14)) != null) {
                d13 = dArray[0];
                d14 = dArray[1];
                dArray = this.lIIlIl(vec3d.z, d12, d8, d9, d13, d14);
                if (dArray != null) return dArray[0];
                return Double.NaN;
            }
            return Double.NaN;
        }
        return Double.NaN;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean IlIlll() {
        if (!this.IlIll) return false;
        if (this.IlIIl == IIllII.lI) return false;
        return true;
    }

    private Vec3d IllIII(BlockPos blockPos) {
        return Vec3d.ofBottomCenter((Vec3i)blockPos).add(0.0, 0.125, 0.0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean IllIIl(BooleanSupplier booleanSupplier) {
        boolean bl = lIIllllI.lIIIIl();
        try {
            boolean bl2 = booleanSupplier.getAsBoolean();
            return bl2;
        }
        finally {
            if (bl) {
                lIIllllI.IlIIlIl();
            }
        }
    }

    private long IllIlI(IIllII iIllII) {
        return 50L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlllII(MinecraftClient minecraftClient) {
        boolean bl;
        block3: {
            long l2;
            block4: {
                float f;
                boolean bl2;
                block2: {
                    block0: {
                        block1: {
                            if (this.Illll.lIl() != lIlIIIl.Il) break block0;
                            this.IIll = IIllII.ll;
                            this.IIl = minecraftClient.player.age + 2;
                            bl2 = IlIlllI.lI(minecraftClient, this.IlIll(this.IllIl));
                            if (!bl2) break block1;
                            f = minecraftClient.player.getYaw();
                            break block2;
                        }
                        f = this.llIl;
                        break block2;
                    }
                    bl = IlIlllI.lI(minecraftClient, this.IlIll(this.IllIl));
                    float f2 = bl ? 0.0f : this.lIIl.llIIIl(minecraftClient, this.IlIll(this.IllIl), ((Double)this.IllI.lIl()).floatValue());
                    l2 = System.currentTimeMillis();
                    if (bl || f2 <= 0.5f) break block3;
                    break block4;
                }
                boolean bl3 = IlIlllI.IlI(minecraftClient, 200, f, bl2 ? minecraftClient.player.getPitch() : this.IlII, () -> this.IIIIlI(minecraftClient));
                if (bl3) return;
                this.IIIll();
                this.ll = System.currentTimeMillis();
                return;
            }
            if (l2 - this.IlllI < 1500L) return;
        }
        this.IIll = IIllII.ll;
        this.IIl = minecraftClient.player.age + 2;
        boolean bl4 = IlIlllI.IlI(minecraftClient, 200, !bl ? this.llIl : minecraftClient.player.getYaw(), bl ? minecraftClient.player.getPitch() : this.IlII, () -> this.IIIIlI(minecraftClient));
        if (bl4) return;
        this.IIIll();
        this.ll = System.currentTimeMillis();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlllIl(BlockHitResult blockHitResult, Vec3d vec3d, Vec3d vec3d2, double d) {
        if (!this.llIl(blockHitResult)) return false;
        double d2 = this.IlI(vec3d, vec3d2, blockHitResult.getPos());
        if (Double.isNaN(d2)) return true;
        if (!(d2 < d)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockPos[] Illlll(BlockHitResult blockHitResult, Direction direction) {
        BlockPos blockPos = blockHitResult.getBlockPos();
        Direction direction2 = blockHitResult.getSide();
        if (direction2 == Direction.UP) {
            return new BlockPos[]{blockPos.up(), blockPos.offset(direction).up(), blockPos.offset(direction.getOpposite()).up()};
        }
        if (!direction2.getAxis().isHorizontal()) {
            return new BlockPos[]{blockPos.up()};
        }
        return new BlockPos[]{blockPos.offset(direction2), blockPos.up(), blockPos.offset(direction).up()};
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIIIII(MinecraftClient minecraftClient, BlockPos blockPos, BlockPos blockPos2) {
        if (!this.lIlIIl(minecraftClient, blockPos)) return false;
        if (!this.IIII(minecraftClient, blockPos2)) return false;
        if (!this.IIIlI(minecraftClient, blockPos2)) return false;
        return true;
    }

    private boolean lIIIIl(BlockHitResult blockHitResult) {
        return this.llIl(blockHitResult);
    }

    @Override
    public boolean IlIIIIl() {
        return this.IIIIIII();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient var1_1) {
        block21: {
            block22: {
                block20: {
                    if (!this.lIllIl(var1_1)) break block20;
                    if (this.IlIIl != IIllII.lI) break block21;
                    break block22;
                }
                this.lIIlI();
                this.lllll();
                return;
            }
            if (!this.IIIIIII()) {
                if (this.IlIll) {
                    return;
                }
            } else {
                var2_2 = (int)lIIllllI.llI(var1_1, this.IIIllII());
                var3_3 = var2_2 != 0 && this.III == false;
                this.III = var2_2;
                if (var2_2 == 0) {
                    this.IlIll = false;
                }
                if (var3_3 == false) return;
                if (this.IlIll) {
                    return;
                }
            }
            this.IlIll = true;
            if (!this.lllI(var1_1)) {
                this.lllll();
                return;
            }
        }
        var2_2 = 0;
        while (var2_2 < 6) {
            block23: {
                var3_4 = System.currentTimeMillis();
                if (var3_4 - this.IlllI > 3000L) {
                    this.llIIII(var1_1);
                    return;
                }
                if (this.IIIlll(var1_1) != false) return;
                if (var3_4 < this.ll) {
                    return;
                }
                var5_5 = this.IlIIl;
                switch (var5_5.ordinal()) {
                    case 2: {
                        this.IlllI(var1_1);
                        break block23;
                    }
                    case 6: {
                        this.IllI(var1_1);
                        break block23;
                    }
                    case 5: {
                        this.lIIIll(var1_1);
                        break block23;
                    }
                    case 3: {
                        this.llII(var1_1);
                        break block23;
                    }
                    case 7: {
                        if (this.lIIIl(var1_1)) {
                            this.lIIlI();
                            this.lllll();
                            ** break;
                        }
                        ** GOTO lbl57
                    }
                    case 1: {
                        this.lIllll(var1_1);
                    }
lbl57:
                    // 4 sources

                    default: {
                        break block23;
                    }
                    case 4: 
                }
                this.IIlI(var1_1);
            }
            if (this.IlIIl == var5_5) return;
            if (this.IlIIl == IIllII.lI) {
                return;
            }
            ++var2_2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIIll(MinecraftClient minecraftClient) {
        if (!this.IIIIII(minecraftClient, this.IllIl)) {
            this.llIIII(minecraftClient);
            return;
        }
        if (this.lIlllI(minecraftClient, this.llll)) {
            this.IIIlII(IIllII.III, minecraftClient);
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 - this.IlllI <= 2500L) {
            this.ll = l2 + 50L;
            return;
        }
        this.llIIII(minecraftClient);
    }

    /*
     * Unable to fully structure code
     */
    private llllIIl lIIlII(MinecraftClient var1_1, ItemStack var2_2) {
        block36: {
            block21: {
                block31: {
                    block30: {
                        block34: {
                            block33: {
                                block29: {
                                    block35: {
                                        block25: {
                                            block32: {
                                                block26: {
                                                    block23: {
                                                        block24: {
                                                            block20: {
                                                                block27: {
                                                                    block28: {
                                                                        block22: {
                                                                            if (var1_1 == null) break block26;
                                                                            break block27;
lbl3:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
lbl5:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var13_13 = 1;
                                                                                break block20;
                                                                                break;
                                                                            }
lbl8:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                continue;
lbl10:
                                                                                // 1 sources

                                                                                return null;
                                                                            }
lbl12:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
lbl14:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var10_10 = 0;
                                                                                break block21;
                                                                                break;
                                                                            }
lbl17:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                if (var6_6 == null) break block22;
                                                                                break block23;
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
                                                                                var12_12 = this.lIllI(var1_1, var7_7, var11_11);
                                                                                ** continue;
                                                                                break;
                                                                            }
                                                                        }
                                                                        var7_7 = var1_1.player.getEyePos();
                                                                        ** while (true)
                                                                        var16_16 = var7_7.lerp(var11_11, var14_15);
                                                                        break block28;
lbl30:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (var7_7.y < (double)var1_1.world.getBottomY() - 20.0) {
                                                                                ** continue;
                                                                            }
                                                                            break block24;
                                                                            break;
                                                                        }
                                                                    }
                                                                    var17_17 = BlockPos.ofFloored((Position)var16_16);
                                                                    if (var9_9 == null) break block29;
                                                                    break block30;
lbl38:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        ++var13_13;
                                                                        break block20;
                                                                        break;
                                                                    }
                                                                }
                                                                if (var1_1.player == null) break block26;
                                                                break block31;
                                                            }
                                                            if (var13_13 > 10) break block32;
                                                            break block33;
lbl47:
                                                            // 1 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
                                                        ++var10_10;
                                                        break block21;
                                                    }
                                                    return var6_6;
lbl54:
                                                    // 1 sources

                                                    while (true) {
                                                        break block25;
                                                        break;
                                                    }
                                                }
lbl57:
                                                // 2 sources

                                                return null;
                                            }
                                            if (this.llIl(var12_12)) {
                                                ** continue;
                                            }
                                            break block34;
                                            var8_8 = this.Illll(var4_4, var5_5).multiply(var3_3.I()).add(var1_1.player.getVelocity());
                                            var9_9 = null;
                                            ** while (true)
                                        }
                                        var3_3 = this.llIIlI(var2_2);
                                        var4_4 = var1_1.player.getYaw();
                                        ** while (true)
                                        var18_18 = this.IIIlIl(var1_1, var3_3, var9_9, var17_17, var4_4, var5_5);
                                        if (var18_18 == null) break block29;
                                        break block35;
lbl73:
                                        // 1 sources

                                        while (true) {
                                            var8_8 = var8_8.multiply(var3_3.II()).subtract(0.0, var3_3.l(), 0.0);
                                            ** continue;
                                            break;
                                        }
                                    }
                                    return var18_18;
lbl78:
                                    // 1 sources

                                    while (true) {
                                        var11_11 = var7_7.add(var8_8);
                                        ** continue;
                                        break;
                                    }
                                }
lbl82:
                                // 2 sources

                                while (true) {
                                    var9_9 = var17_17;
                                    ** continue;
                                    break;
                                }
                            }
                            var14_15 = (double)var13_13 / 10.0;
                            ** while (true)
                        }
                        var7_7 = var11_11;
                        ** while (true)
                    }
                    ** while (var9_9.equals((Object)var17_17))
lbl93:
                    // 1 sources

                    ** while (true)
                }
                ** while (var1_1.world != null)
lbl96:
                // 1 sources

                ** while (true)
                var5_5 = var1_1.player.getPitch();
                var6_6 = this.IllII(var1_1, var3_3, var4_4, var5_5);
                ** while (true)
            }
            if (var10_10 < 70) {
                ** continue;
            }
            break block36;
            var13_14 = this.lIlIlI(var1_1, var3_3, var12_12, var4_4, var5_5);
            return var13_14;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double[] lIIlIl(double d, double d2, double d3, double d4, double d5, double d6) {
        if (Math.abs(d2) < 1.0E-7) {
            if (!(d >= d3)) return null;
            if (!(d <= d4)) {
                return null;
            }
            double[] dArray = new double[2];
            dArray[0] = d5;
            double[] dArray2 = dArray;
            dArray[1] = d6;
            return dArray2;
        }
        double d7 = (d3 - d) / d2;
        double d8 = (d4 - d) / d2;
        if (d7 > d8) {
            double d9 = d7;
            d7 = d8;
            d8 = d9;
        }
        d5 = Math.max(d5, d7);
        d6 = Math.min(d6, d8);
        if (!(d5 <= d6)) return null;
        double[] dArray = new double[2];
        dArray[0] = d5;
        double[] dArray3 = dArray;
        dArray[1] = d6;
        return dArray3;
    }

    private Vec3d lIIllI(BlockPos blockPos) {
        return this.llIlI(blockPos).subtract(0.0, 0.0625, 0.0);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private IIIlIIIl lIIlll(PlayerInventory playerInventory) {
        IIIlIIIl iIIlIIIl;
        int n = this.IlIII(playerInventory, Items.FLINT_AND_STEEL);
        int n2 = this.IlIII(playerInventory, Items.LAVA_BUCKET);
        switch (((lIlllIII)((Object)this.llI.lIl())).ordinal()) {
            case 2: {
                if (n >= 0) {
                    iIIlIIIl = new IIIlIIIl(n, IIIlIII.I);
                    return iIIlIIIl;
                }
                if (n2 >= 0) break;
                return null;
            }
            case 0: {
                if (n < 0) return null;
                iIIlIIIl = new IIIlIIIl(n, IIIlIII.I);
                return iIIlIIIl;
            }
            case 1: {
                if (n2 < 0) return null;
                iIIlIIIl = new IIIlIIIl(n2, IIIlIII.l);
                return iIIlIIIl;
            }
        }
        iIIlIIIl = new IIIlIIIl(n2, IIIlIII.l);
        return iIIlIIIl;
        throw new MatchException(null, null);
    }

    private Direction lIlIII(float f) {
        return Direction.fromHorizontalDegrees((double)f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlIIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) {
            return false;
        }
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        BlockState blockState2 = minecraftClient.world.getBlockState(blockPos.down());
        if (!blockState.isAir()) {
            if (!blockState.isReplaceable()) return false;
        }
        if (blockState2 == null) return false;
        if (blockState2.isAir()) return false;
        if (!blockState2.getFluidState().isEmpty()) return false;
        if (blockState2.getCollisionShape((BlockView)minecraftClient.world, blockPos.down()).isEmpty()) return false;
        if (!(minecraftClient.player.getEyePos().squaredDistanceTo(this.IIl(blockPos)) <= 20.25)) return false;
        if (this.lIll(minecraftClient, this.lII(blockPos), blockPos.down())) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        this.IlIll = false;
        this.III = false;
        this.lIIlI();
        this.lIIl.lIlIII();
    }

    /*
     * Unable to fully structure code
     */
    private llllIIl lIlIlI(MinecraftClient var1_1, IIIIlIlII var2_2, BlockHitResult var3_3, float var4_4, float var5_5) {
        block7: {
            block9: {
                block8: {
                    block11: {
                        block10: {
                            if (var3_3 == null) break block9;
                            break block10;
lbl3:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl5:
                            // 1 sources

                            while (true) {
                                var7_7 = this.Illlll(var3_3, var6_6);
                                var8_8 = var7_7.length;
                                var9_9 = 0;
                                break block7;
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                if (var15_15 == null) {
                                    ++var13_13;
                                    break block8;
lbl14:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                return var15_15;
                            }
                        }
                        if (var3_3.getType() == HitResult.Type.BLOCK) break block11;
                        break block9;
                        var10_10 = var7_7[var9_9];
                        var11_11 = this.IlIIl(var10_10, var6_6);
                        var12_12 = var11_11.length;
                        var13_13 = 0;
                        break block8;
                    }
                    var6_6 = this.lIlIII(var4_4);
                    ** while (true)
                }
                if (var13_13 < var12_12) {
                    ** continue;
lbl31:
                    // 1 sources

                    return null;
                }
                ++var9_9;
                break block7;
            }
            return null;
        }
        ** while (var9_9 >= var8_8)
lbl39:
        // 1 sources

        ** while (true)
        var14_14 = var11_11[var13_13];
        var15_15 = this.IIIlIl(var1_1, var2_2, var14_14, var10_10, var4_4, var5_5);
        ** while (true)
    }

    private boolean lIlIll(MinecraftClient minecraftClient, int n, BlockHitResult blockHitResult) {
        return lIIllllI.IlIIIl(minecraftClient, this, n, () -> {
            this.IIlll(minecraftClient);
            return this.IllIIl(() -> lIIllllI.lIllll(minecraftClient, blockHitResult));
        });
    }

    private boolean lIllII(MinecraftClient minecraftClient) {
        lIIllllI.IIlII(minecraftClient, this.Ill, this.lIlII);
        return this.IIIIll(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIllIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.options == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlllI(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) {
            return false;
        }
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (blockState.isOf(Blocks.FIRE)) return true;
        if (blockState.isOf(Blocks.SOUL_FIRE)) return true;
        if (blockState.isOf(Blocks.LAVA)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIllll(MinecraftClient minecraftClient) {
        if (this.IIII(minecraftClient, this.IllIl) && this.IIIlI(minecraftClient, this.IllIl)) {
            if (!this.IlIlI(minecraftClient, this.lll)) {
                return;
            }
            BlockHitResult blockHitResult = this.lI(this.IllIl);
            this.IIIII(minecraftClient, IIllII.IlI, IIllII.ll, this.lIIIl, this.lIlI, blockHitResult, () -> this.lIlIll(minecraftClient, this.lll, blockHitResult));
            return;
        }
        this.llIIII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean IlIlIlI(MinecraftClient minecraftClient) {
        if (this.IlIll) return true;
        if (this.III) return true;
        if (!this.IIIIIII()) return false;
        if (minecraftClient == null) return false;
        if (lIIllllI.llI(minecraftClient, this.IIIllII())) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIIII(MinecraftClient minecraftClient) {
        if (this.lIIIl(minecraftClient)) {
            this.lIIlI();
            this.lllll();
            return;
        }
        this.IlIIl = IIllII.IIl;
        this.IlllI = System.currentTimeMillis();
        this.ll = this.IlllI;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean llIIIl(PlayerInventory playerInventory, int n) {
        if (playerInventory == null) return false;
        if (n < 0) return false;
        if (n >= 9) return false;
        if (!this.lIIl(playerInventory.getStack(n))) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIIIlIlII llIIlI(ItemStack itemStack) {
        IIIIlIlII iIIIlIlII;
        boolean bl;
        ChargedProjectilesComponent chargedProjectilesComponent = itemStack == null ? null : (ChargedProjectilesComponent)itemStack.get(DataComponentTypes.CHARGED_PROJECTILES);
        boolean bl2 = bl = chargedProjectilesComponent != null && chargedProjectilesComponent.contains(Items.FIREWORK_ROCKET);
        if (!bl) {
            iIIIlIlII = new IIIIlIlII(3.15, 0.99, 0.05);
            return iIIIlIlII;
        }
        iIIIlIlII = new IIIIlIlII(1.6, 0.99, 0.0);
        return iIIIlIlII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIlII(MinecraftClient minecraftClient) {
        this.lllII = false;
        this.l = Integer.MIN_VALUE;
        if (this.lIIll(minecraftClient) && this.IIIIII(minecraftClient, this.IllIl) && this.lIlllI(minecraftClient, this.llll)) {
            boolean bl = this.IIIIll(minecraftClient);
            if (bl) {
                this.IIIlII(IIllII.IIl, minecraftClient);
                return bl;
            }
            this.llIIII(minecraftClient);
            return bl;
        }
        this.llIIII(minecraftClient);
        return false;
    }

    @Override
    public void III() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private long llIlIl(IIIlIlIIl iIIlIlIIl) {
        double d;
        double d2 = iIIlIlIIl.IIIl();
        if (d2 >= (d = iIIlIlIIl.IIII())) {
            return Math.max(0L, Math.round(d2));
        }
        return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d2, d)));
    }

    private void IlIllII() {
        this.IIIll();
        this.ll = System.currentTimeMillis() + 50L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIllIl(PlayerInventory playerInventory, int n, IIIlIII iIIlIII) {
        boolean bl;
        ItemStack itemStack;
        if (playerInventory == null) return false;
        if (n < 0) return false;
        if (n >= 9) return false;
        if (iIIlIII != null) {
            itemStack = playerInventory.getStack(n);
            if (iIIlIII != IIIlIII.I) {
                bl = itemStack.isOf(Items.LAVA_BUCKET);
                return bl;
            }
        } else {
            return false;
        }
        bl = itemStack.isOf(Items.FLINT_AND_STEEL);
        return bl;
    }

    private static int IlIlllI(int n, int n2) {
        return lllll[n ^ 0x638BADE0] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IllIIII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x9EB1E246;
        char[] cArray = IIIIII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIIIIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            KeyXbow.IIIIIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2F24481A;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 5: {
                    n6 = 91;
                    continue block33;
                }
                case 25: {
                    n6 = 205;
                    continue block33;
                }
                case 20: {
                    n6 = 161;
                    continue block33;
                }
                case 21: {
                    n6 = 11;
                    continue block33;
                }
                case 17: {
                    n6 = 47;
                    continue block33;
                }
                case 14: {
                    n6 = 217;
                    continue block33;
                }
                case 2: {
                    n6 = 222;
                    continue block33;
                }
                case 10: {
                    n6 = 62;
                    continue block33;
                }
                case 8: {
                    n6 = 101;
                    continue block33;
                }
                case 13: {
                    n6 = 238;
                    continue block33;
                }
                case 18: {
                    n6 = 107;
                    continue block33;
                }
                case 26: {
                    n6 = 200;
                    continue block33;
                }
                case 4: {
                    n6 = 67;
                    continue block33;
                }
                case 24: {
                    n6 = 214;
                    continue block33;
                }
                case 15: {
                    n6 = 39;
                    continue block33;
                }
                case 31: {
                    n6 = 127;
                    continue block33;
                }
                case 9: {
                    n6 = 17;
                    continue block33;
                }
                case 22: {
                    n6 = 101;
                    continue block33;
                }
                case 28: {
                    n6 = 75;
                    continue block33;
                }
                case 3: {
                    n6 = 212;
                    continue block33;
                }
                case 23: {
                    n6 = 220;
                    continue block33;
                }
                case 19: {
                    n6 = 76;
                    continue block33;
                }
                case 6: {
                    n6 = 117;
                    continue block33;
                }
                case 16: {
                    n6 = 181;
                    continue block33;
                }
                case 7: {
                    n6 = 28;
                    continue block33;
                }
                default: {
                    n6 = 45;
                    continue block33;
                }
                case 11: {
                    n6 = 198;
                    continue block33;
                }
                case 12: {
                    n6 = 225;
                    continue block33;
                }
                case 27: {
                    n6 = 36;
                    continue block33;
                }
                case 1: {
                    n6 = 29;
                    continue block33;
                }
                case 29: {
                    n6 = 2;
                    continue block33;
                }
                case 30: 
            }
            n6 = 71;
        }
    }
}

