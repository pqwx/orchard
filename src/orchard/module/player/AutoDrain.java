/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlII
 * Module         : AutoDrain  [PLAYER]
 * Description    : Picks up nearby liquid sources with a bucket.   (client's own text)
 *
 * Recovered strings in this class:
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
 *  net.minecraft.block.BlockState
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.fluid.Fluid
 *  net.minecraft.fluid.FluidState
 *  net.minecraft.fluid.Fluids
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package orchard.module.player;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.BlockView;
import net.minecraft.world.RaycastContext;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlIIlIl;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IIlIl;
import orchard.internal.IIllIIIIl;
import orchard.internal.IlIIIllll;
import orchard.internal.IlIlIIIII;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlIlII;
import orchard.internal.IlIlllI;
import orchard.internal.IllIllll;
import orchard.internal.IlllllI;
import orchard.internal.l;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class AutoDrain
extends ModuleBase {
    private static final Direction[] I;
    private final IIIlIlIIl l;
    private static final int II = 2;
    private BlockPos Il;
    private final Map<BlockPos, Integer> lI;
    private int ll;
    private long III;
    private int IIl;
    private long IlI;
    private static final double Ill = 4.5;
    private final IIIIIIIIl<IlIlIlII> lII;
    private long lIl;
    private final IIIIIIIIl<IlIIIllll> llI;
    private int lll;
    private static final int IIII = 2;
    private final llIll IIIl;
    private IlIlIIIII IIlI;
    private long IIll;
    private Object IlII;
    private IIIlIIlIl IlIl;
    private static final double IllI = 0.01;
    private int Illl;
    private static final double lIII = 9.0;
    private static final double lIIl = 20.25;
    private static final int lIlI = 120;
    private boolean lIll;
    private l llII;
    private final IIIlIlIIl llIl;
    private final IlIlIlI lllI;
    private int llll;
    private int IIIII;
    private Hand IIIIl;
    private int IIIlI;
    private boolean IIIll;
    private final IIIIIIIIl<IlllllI> IIlII = this.IIlllIl(new IIIIIIIIl<IlllllI>(StringFactory.IIII("tJ1FiRBTEDGYDJo="), IlllllI.class, IlllllI.II));
    private final lIlIIlI IIlIl;
    private static final double IIllI = 3.0;
    private IIlIl IIlll;
    private static final int[] IlIII;
    private static final String[] IlIIl;
    private static final Object[] IlIlI;

    public void lI(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult, ActionResult actionResult) {
        if (actionResult == ActionResult.PASS) {
            return;
        }
        this.lIlI(minecraftClient, hand, actionResult);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (blockPos == null) return false;
        if (minecraftClient.world == null) {
            return false;
        }
        FluidState fluidState = minecraftClient.world.getFluidState(blockPos);
        if (fluidState == null) return false;
        if (fluidState.isEmpty()) return false;
        return true;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private boolean IlI(MinecraftClient var1_1, BlockPos var2_2) {
        if (var2_2 == null) return false;
        if (this.lI.containsKey(var2_2)) {
            return false;
        }
        var3_3 = var1_1.world.getFluidState(var2_2);
        if (var3_3 == null) return false;
        if (!var3_3.isStill()) {
            return false;
        }
        switch (((IlllllI)this.IIlII.lIl()).ordinal()) {
            case 2: {
                if (var3_3.isOf((Fluid)Fluids.WATER) != false) return true;
                ** break;
            }
            case 0: {
                v0 = var3_3.isOf((Fluid)Fluids.LAVA);
                return v0;
            }
lbl15:
            // 1 sources

            if (var3_3.isOf((Fluid)Fluids.LAVA) == false) return false;
            return true;
            case 1: {
                v0 = var3_3.isOf((Fluid)Fluids.WATER);
                return v0;
            }
        }
        throw new MatchException(null, null);
    }

    private Vec3d lII(Vec3d vec3d, Direction direction) {
        block3: {
            block2: {
                if (vec3d == null) break block2;
                if (direction != null) break block3;
            }
            return vec3d;
        }
        return vec3d.subtract((double)direction.getOffsetX() * 0.01, (double)direction.getOffsetY() * 0.01, (double)direction.getOffsetZ() * 0.01);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(MinecraftClient minecraftClient) {
        if (this.IIl < 0) {
            return;
        }
        if (minecraftClient.player.age < this.Illl) {
            return;
        }
        int n = this.IIl;
        this.IIl = -1;
        this.Illl = 0;
        this.lllI(minecraftClient, n);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    private boolean lll(MinecraftClient minecraftClient, int n, IlIlIIIII ilIlIIIII) {
        boolean bl;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n >= 9) {
            return false;
        }
        ItemStack itemStack = minecraftClient.player.getInventory().getStack(n);
        switch (ilIlIIIII.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                bl = itemStack.isOf(Items.BUCKET);
                return bl;
            }
            case 1: 
        }
        bl = this.IIIlI(minecraftClient, itemStack);
        return bl;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 7877;
        var7_5 = "\ue3f1\ue3cf\ue3b3\ue3f8\ue3de\ue3bb\ue33d\ue3ca\ue382\ue3c9\ue3c2\ue39b\u2fa0\u2f93\u2ff3\u2fda\u2fce\u2f91\u2fa6\u2fe5\u2f92\u2fd5\u2ffc\u2fb0\u2ff1\u2fcd\u2fb4\u2fdd\u2faa\u2fac\u2fff\u2f95\u2ff1\u2ff2\u2fd7\u2fac\u2f81\u2fe2\u2f89\u2fd5\u2fd9\u2f90\u2ff0\u2fed\u2fb7\u2fa4\u2fb4\u2fba\u2f8e\u2ff4\u2fb2\u2fa5\u2ff0\u2f99\u2fa4\u2feb\u2f8d\u2fa8\u2ffc\u2fad\u2ffe\u2f9b\u2f80\u2fd7\u2fa7\u2fb6\u2f80\u2f99\u2fb7\u2fcf\u2fb5\u2fce\ud6f6\ud65a\ud2ba\ud691\ud684\ud6f7\ud638\ud6bc\ud6d6\ud693\ud66e\ud6fe\ud6c6\ud65a\ud6c0\ud2f8\uaba9\uab96\uab9e\uabdc\uabc2\uabaa\uaba6\uabe9\uab8a\uabc0\uaba7\uabb0\uabff\uabfe\uabf3\uabb5\u11f5\u119c\u11f9\u1190\u1185\u11ea\u11b5\u11b3\u11dd\u11bb\u1167\u11f1\u113c\u11a6\u11d7\u118f\u116e\u11e0\u11a1\u11cb\u7ba1\u7b84\u7be3\u7ba6\u7bf0\u7bbf\u7b9e\u7beb\u7b93\u7ba5\u7bd4\u7bca\u17f0\u1759\u17a6\u17d6\u17dd\u179e\u17f7\u17e7\u17bf\u17f6\u17dd\u17ad\u17a1\u17c3\u172f\u17f5\ue962\ue6d7\ue978\ue944\u1c2a\u1c6d\u1c37\u1c5f\u1c3c\u1c3b\u1c6f\u1c63\u1c13\u1c2f\u1c3f\u1c42\u948b\u94f2\u9491\u9491\uef3e\uef9b\ueffc\uef94\uef83\uefdc\uef3d\uefad\ueff1\uefb4\uefa2\uefef\uefec\uef98\uefcd\uefaf";
        var8_6 = "\f<\u0010\u0010\u0014\f\u0010\u0004\f\u0004\u0010".toCharArray();
        var9_7 = new String[var8_6.length];
        var13_11 = -1;
        if (true) ** GOTO lbl19
lbl7:
        // 1 sources

        while (true) {
            var4_15 = 0;
            do {
                var5_16 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                AutoDrain.IlIII[var4_15] = var5_16 ^= var2_3;
                var3_4 += 4;
            } while (++var4_15 < var1_2);
            AutoDrain.I = new Direction[]{Direction.DOWN, Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};
            return;
        }
        while (true) {
            if (++var10_8 < var8_6.length) ** GOTO lbl-1000
            var13_11 = 0;
lbl19:
            // 2 sources

            var10_8 = 0;
            var11_9 = 0;
            var12_10 = '\u0000';
            if (var13_11 != 0) lbl-1000:
            // 2 sources

            {
                var12_10 = var8_6[var10_8];
            } else {
                AutoDrain.IlIIl = var9_7;
                AutoDrain.IlIlI = new Object[var9_7.length];
                var2_3 = -849247223;
                var0_1 = "X\u00d0%\u0093O\u00c5\u0091\u008b\u00e1\u00cd\u00fd\u008e\u00fdl\u009d\u0097f\u00f0\u0019\u00f0m\u0080^i\u00f5\u00bb\u0086!\u001d\u00e3_\u00e28\u00e4{\u0096\u0094\u00eb\u00f0\u0093\u00e5*?\u000fe\u00ef\u0016\u00f6\u00bav\u00a6y".getBytes("ISO-8859-1");
                var1_2 = var0_1.length / 4;
                AutoDrain.IlIII = new int[var1_2];
                var3_4 = 0;
                ** continue;
            }
            var14_12 = var7_5.substring(var11_9, var11_9 + var12_10).toCharArray();
            var15_13 = 0;
            do {
                switch (var15_13 % 6) {
                    case 2: {
                        v0 = 109;
                        break;
                    }
                    case 5: {
                        v0 = 65;
                        break;
                    }
                    case 1: {
                        v0 = 20;
                        break;
                    }
                    default: {
                        v0 = 126;
                        break;
                    }
                    case 4: {
                        v0 = 43;
                        break;
                    }
                    case 3: {
                        v0 = 43;
                    }
                }
                var16_14 = v0;
                v1 = var15_13++;
                var14_12[v1] = (char)(var14_12[v1] ^ var16_14 ^ var6);
            } while (var15_13 < var14_12.length);
            var9_7[var10_8] = new String(var14_12).intern();
            var11_9 += var12_10;
        }
    }

    private int IlII(IIIlIlIIl iIIlIlIIl) {
        long l2 = this.llllI(iIIlIlIIl);
        return (int)Math.max(0L, (l2 + 25L) / 50L);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        this.IIIIlI(MinecraftClient.getInstance());
        this.IlI = 0L;
        this.III = 0L;
        this.IIIlI = -1;
        this.IIl = -1;
        this.Illl = 0;
        ++this.IIll;
        this.llII = null;
        this.IlIl = null;
        this.lllI.lIlIII();
        this.lIll = false;
        this.IIlll = null;
        this.IIlI = null;
        this.IIIll = false;
        this.IIIII = -1;
        this.ll = -1;
        this.lIlIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.options == null) {
            return;
        }
        minecraftClient.options.useKey.setPressed(false);
        IIllIIIIl.IIIII(minecraftClient, 4);
    }

    private Vec3d Illl(MinecraftClient minecraftClient) {
        return new Vec3d(minecraftClient.player.getX(), minecraftClient.player.getY(), minecraftClient.player.getZ());
    }

    /*
     * Enabled aggressive block sorting
     */
    public AutoDrain() {
        super(StringFactory.IIII("AutoDrain"), Category.IIl, StringFactory.IIII("Picks up nearby liquid sources with a bucket."));
        lIlIIlI lIlIIlI2;
        IIIIIIIIl<IlIIIllll> iIIIIIIIl;
        this.lII = this.IIlllIl(new IIIIIIIIl<IlIlIlII>(StringFactory.IIII("vIZVlRcXfROTDQ=="), IlIlIlII.class, IlIlIlII.l));
        iIIIIIIIl(StringFactory.IIII("qptAnQ1eXxLXJZBdCg=="), IlIIIllll.class, IlIIIllll.II);
        this.llI = this.IIlllIl(iIIIIIIIl);
        lIlIIlI2(StringFactory.IIII("q4BGmRdQRBQ="), 50.0, 1.0, 100.0, 1.0);
        this.IIlIl = this.IIlllIl((lIlIIlI)lIlIIlI2.lIII(() -> {
            if (this.llI.lIl() != IlIIIllll.Il) return false;
            return true;
        }));
        this.lllI = new IlIlIlI();
        this.IIIII = -1;
        this.ll = -1;
        this.l = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("q4NdiBpfEDiSBJ5A"), 55.0, 60.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.llIl = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("rYdR3D1SXB2O"), 10.0, 25.0, 0.0, 500.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.IIIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("q4NdiBpfED6WC5Q="), true));
        this.lI = new HashMap<BlockPos, Integer>();
        this.llll = Integer.MIN_VALUE;
        this.IIIlI = -1;
        this.IIl = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIII(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n >= 9) {
            return false;
        }
        long l2 = System.currentTimeMillis();
        if (this.IIIlI != n) {
            boolean bl = lIIllllI.llIllI(minecraftClient) != n;
            this.IIIlI = n;
            this.IlI = l2 + (bl ? this.llllI(this.l) : 0L);
            this.III = 0L;
        }
        if (l2 < this.IlI) {
            return false;
        }
        if (this.III == 0L) {
            this.III = l2 + this.llllI(this.llIl);
        }
        if (l2 < this.III) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIl(MinecraftClient minecraftClient, long l2, IIIlIIlIl iIIlIIlIl) {
        IIIlIIlIl iIIlIIlIl2;
        l l3 = this.llII;
        if (l3 == null) return false;
        if (l3.l() != l2) {
            return false;
        }
        this.llII = null;
        this.IlIl = null;
        boolean bl = this.IllII(minecraftClient, iIIlIIlIl);
        if (bl) {
            this.lI.remove(iIIlIIlIl.ll().ll());
        }
        if (bl || (iIIlIIlIl2 = this.IlIlI(minecraftClient, iIIlIIlIl)) == null) {
            this.IIIIll(minecraftClient, iIIlIIlIl.I());
            return bl;
        }
        this.IlIl = iIIlIIlIl2;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlI(MinecraftClient minecraftClient, Hand hand, ActionResult actionResult) {
        BlockPos blockPos = this.Il;
        Hand hand2 = this.IIIIl;
        if (blockPos == null) return;
        if (hand == null) return;
        if (hand != hand2) {
            return;
        }
        int n = this.llll;
        this.lIlIl();
        if (!this.lIIll(minecraftClient)) return;
        if (actionResult == null) return;
        if (!actionResult.isAccepted()) return;
        if (minecraftClient.player.age - n < 0) return;
        if (minecraftClient.player.age - n <= 10) {
            this.lI.put(blockPos, minecraftClient.player.age);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIll(MinecraftClient minecraftClient, BlockPos blockPos, BlockState blockState) {
        if (blockPos == null) return false;
        if (blockState == null) return false;
        if (blockState.isAir()) return false;
        if (blockState.isReplaceable()) return false;
        if (!blockState.isSolidBlock((BlockView)minecraftClient.world, blockPos)) return false;
        if (!blockState.getFluidState().isEmpty()) return false;
        if (!blockState.getCollisionShape((BlockView)minecraftClient.world, blockPos).isEmpty()) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IllIllll llII(MinecraftClient minecraftClient, BlockPos blockPos, Vec3d vec3d, double d, int n, int n2) {
        IIlIl iIlIl;
        if (n >= 0 && (iIlIl = this.lIIlI(minecraftClient, blockPos, vec3d, d)) != null) {
            IllIllll illIllll;
            illIllll(iIlIl, IlIlIIIII.l, n, n2 >= 0);
            return illIllll;
        }
        if (n2 < 0) return null;
        if (this.lIlII(minecraftClient, blockPos)) {
            return null;
        }
        iIlIl = this.IIIIl(minecraftClient, blockPos, d);
        if (iIlIl == null) return null;
        IllIllll illIllll = new IllIllll(iIlIl, IlIlIIIII.II, n2, false);
        return illIllll;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        ++this.IIll;
        this.llII = null;
        this.IlIl = null;
        lIIllllI.llIII(minecraftClient, this, (Boolean)this.IIIl.lIl() == false ? lIIlIllI.Il : lIIlIllI.II);
        this.IlI = 0L;
        this.III = 0L;
        this.IIIlI = -1;
        this.IIl = -1;
        this.Illl = 0;
        this.lllI.IlIIIlI();
        this.lIll = false;
        this.IIlll = null;
        this.IIlI = null;
        this.IIIll = false;
        this.IIIII = -1;
        this.ll = -1;
        this.lIlIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIl(MinecraftClient minecraftClient) {
        IIIlIIlIl iIIlIIlIl = this.IlIl;
        if (iIIlIIlIl != null) {
            if (!this.IlI(minecraftClient, iIIlIIlIl.ll().ll())) {
                this.IlIl = null;
                this.IIIIll(minecraftClient, iIIlIIlIl.I());
                return;
            }
            if (!this.lIII(minecraftClient, iIIlIIlIl.l())) {
                return;
            }
        } else {
            return;
        }
        if (!this.lll(minecraftClient, iIIlIIlIl.l(), iIIlIIlIl.III())) {
            this.IlIl = null;
            this.IIIIll(minecraftClient, iIIlIIlIl.I());
            return;
        }
        if (!this.llIll(minecraftClient, iIIlIIlIl.l(), iIIlIIlIl.III())) return;
        if (lIIllllI.IIIIIlI(minecraftClient) > 0) {
            return;
        }
        if (!this.llIlI(minecraftClient, iIIlIIlIl)) return;
        this.IlIl = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllI(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (n < 0) return;
        if (n < 9) {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
            int n2 = lIIllllI.lllI(minecraftClient.player.getInventory());
            if (n2 == n) {
                return;
            }
            lIIllllI.IIIIlII(minecraftClient, this, n, 0, true);
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private IIlIl IIIIl(MinecraftClient var1_1, BlockPos var2_2, double var3_3) {
        block12: {
            if (!this.lIlII(var1_1, var2_2)) {
                var5_4 = AutoDrain.I;
                var6_5 = var5_4.length;
                var7_6 = 0;
            } else {
                block11: {
                    block9: {
                        block10: {
                            return null;
lbl7:
                            // 1 sources

                            while (true) {
                                if (!this.IIIIIl(var1_1, var14_13)) break block9;
                                break block10;
                                break;
                            }
lbl10:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                            while (true) {
                                break block11;
                                break;
                            }
                        }
                        return var14_13;
                    }
lbl17:
                    // 2 sources

                    while (true) {
                        ++var7_6;
                        break block12;
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
                        var9_8 = var2_2.offset(var8_7);
                        ** continue;
                        break;
                    }
                }
                var11_10 = var8_7.getOpposite();
                var12_11 = Vec3d.ofCenter((Vec3i)var9_8).add((double)var11_10.getOffsetX() * 0.5, (double)var11_10.getOffsetY() * 0.5, (double)var11_10.getOffsetZ() * 0.5);
                ** continue;
                var10_9 = var1_1.world.getBlockState(var9_8);
                if (this.lIll(var1_1, var9_8, var10_9)) ** continue;
                ** continue;
                var13_12 = this.lII(var12_11, var11_10);
                var14_13 = new IIlIl(var2_2.toImmutable(), var12_11, var9_8.toImmutable(), var11_10, var13_12, var3_3);
                ** continue;
lbl35:
                // 1 sources

                return null;
            }
        }
        ** while (var7_6 >= var6_5)
lbl39:
        // 1 sources

        var8_7 = var5_4[var7_6];
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlI(MinecraftClient minecraftClient, ItemStack itemStack) {
        if (itemStack == null) return false;
        Item item = itemStack.getItem();
        if (!(item instanceof BlockItem)) return false;
        BlockItem blockItem = (BlockItem)item;
        item = blockItem.getBlock().getDefaultState();
        if (item == null) return false;
        if (item.isAir()) return false;
        if (!item.getFluidState().isEmpty()) return false;
        if (item.getCollisionShape((BlockView)minecraftClient.world, BlockPos.ORIGIN).isEmpty()) return false;
        return true;
    }

    public void IIIll(MinecraftClient minecraftClient, Hand hand, ActionResult actionResult) {
        this.lIlI(minecraftClient, hand, actionResult);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIlII(MinecraftClient minecraftClient, IIIlIIlIl iIIlIIlIl) {
        boolean bl;
        switch (iIIlIIlIl.III().ordinal()) {
            case 1: {
                bl = this.lllIl(minecraftClient, iIIlIIlIl.ll(), iIIlIIlIl.l());
                return bl;
            }
            default: {
                throw new MatchException(null, null);
            }
            case 0: 
        }
        bl = this.IlIII(minecraftClient, iIIlIIlIl.ll(), iIIlIIlIl.l());
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    private IllIllll IIlIl(MinecraftClient var1_1) {
        block43: {
            block40: {
                block29: {
                    block39: {
                        block33: {
                            block44: {
                                block31: {
                                    block37: {
                                        block42: {
                                            block34: {
                                                block41: {
                                                    block30: {
                                                        block32: {
                                                            block26: {
                                                                block28: {
                                                                    block38: {
                                                                        block36: {
                                                                            block27: {
                                                                                block35: {
                                                                                    if (this.lII.lIl() == IlIlIlII.lI) break block34;
                                                                                    break block35;
lbl3:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var10_10 = -var8_8;
                                                                                        break block26;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                v0 = true;
                                                                                break block36;
lbl9:
                                                                                // 1 sources

                                                                                while (var17_16.II().lI() < var9_9.II().lI()) {
                                                                                    break block27;
                                                                                }
                                                                                break block29;
lbl12:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    break block28;
                                                                                    break;
                                                                                }
lbl14:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            while (true) {
                                                                                var9_9 = var17_16;
                                                                                break block29;
                                                                                break;
                                                                            }
lbl20:
                                                                            // 1 sources

                                                                            while (var2_2) {
                                                                                break block30;
                                                                            }
                                                                            break block37;
lbl23:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
                                                                        }
lbl26:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                        var7_7.set(var6_6.getX() + var11_11, var6_6.getY() + var10_10, var6_6.getZ() + var12_12);
                                                                        var13_13 = var7_7.toImmutable();
                                                                        break block38;
                                                                        while (true) {
                                                                            break block31;
                                                                            break;
                                                                        }
lbl34:
                                                                        // 2 sources

                                                                        while (var11_11 <= var8_8) {
                                                                            break block32;
                                                                        }
                                                                        break block39;
                                                                    }
                                                                    ** while (this.IlI((MinecraftClient)var1_1, (BlockPos)var13_13))
lbl39:
                                                                    // 1 sources

                                                                    break block29;
lbl40:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                    return var9_9;
lbl44:
                                                                    // 1 sources

                                                                    return null;
                                                                }
                                                                var14_14 = Vec3d.ofCenter((Vec3i)var13_13);
                                                                var15_15 = this.Illl(var1_1).squaredDistanceTo(var14_14);
                                                                break block40;
lbl50:
                                                                // 2 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
lbl53:
                                                            // 2 sources

                                                            while (true) {
                                                                if (var10_10 > var8_8) ** continue;
                                                                break block33;
                                                                break;
                                                            }
                                                        }
                                                        var12_12 = -var8_8;
                                                        break block41;
lbl59:
                                                        // 2 sources

                                                        while (true) {
                                                            var3_3 = v1;
                                                            ** GOTO lbl20
                                                            break;
                                                        }
lbl62:
                                                        // 1 sources

                                                        while (true) {
                                                            if (var5_5 >= 0) ** GOTO lbl23
                                                            ** continue;
                                                            break;
                                                        }
lbl65:
                                                        // 1 sources

                                                        while (true) {
                                                            v2 = this.lllII(var1_1);
                                                            ** GOTO lbl50
                                                            break;
                                                        }
                                                        var5_5 = v2;
                                                        if (var4_4 < 0) ** break;
                                                        ** while (true)
                                                        ** while (true)
                                                        while (true) {
                                                            ++var11_11;
                                                            ** GOTO lbl34
                                                            break;
                                                        }
lbl75:
                                                        // 1 sources

                                                        while (true) {
                                                            v2 = -1;
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
                                                    v3 = this.lllll(var1_1.player);
                                                    break block42;
                                                }
lbl82:
                                                // 2 sources

                                                while (true) {
                                                    if (var12_12 > var8_8) ** continue;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            v0 = false;
                                            ** while (true)
lbl88:
                                            // 1 sources

                                            while (true) {
                                                if (var9_9 == null) ** continue;
                                                ** GOTO lbl9
                                                break;
                                            }
                                        }
lbl92:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        var6_6 = var1_1.player.getBlockPos();
                                        var7_7 = new BlockPos.Mutable();
                                        ** while (true)
                                        var8_8 = (int)Math.ceil(3.0);
                                        var9_9 = null;
                                        ** while (true)
lbl100:
                                        // 1 sources

                                        while (true) {
                                            if (!(var1_1.player.getEyePos().squaredDistanceTo(var14_14) > 20.25)) ** continue;
                                            break block29;
                                            break;
                                        }
                                    }
                                    v3 = -1;
                                    ** while (true)
                                    var2_2 = v0;
                                    if (this.lII.lIl() == IlIlIlII.l) break block43;
                                    break block44;
                                }
                                var17_16 = this.llII(var1_1, var13_13, var14_14, var15_15, var4_4, var5_5);
                                if (var17_16 != null) {
                                    ** continue;
                                }
                                break block29;
                            }
                            v1 = true;
                            ** GOTO lbl59
                        }
                        var11_11 = -var8_8;
                        ** GOTO lbl34
                        var4_4 = v3;
                        ** while (!var3_3)
lbl122:
                        // 1 sources

                        ** while (true)
                    }
                    ++var10_10;
                    ** while (true)
                }
lbl127:
                // 2 sources

                while (true) {
                    ++var12_12;
                    ** continue;
                    break;
                }
            }
            ** while (var15_15 > 9.0)
lbl132:
            // 1 sources

            ** while (true)
        }
        v1 = false;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIllI(MinecraftClient minecraftClient) {
        l l2 = this.llII;
        if (l2 != null) {
            if (minecraftClient.player.age < l2.II()) {
                return true;
            }
            this.llII = null;
            ++this.IIll;
            IIIlIIlIl iIIlIIlIl = l2.I();
            if (iIIlIIlIl.II() >= 2) {
                this.IIIIll(minecraftClient, iIIlIIlIl.I());
                return true;
            }
            this.IlIl = iIIlIIlIl.Il(iIIlIIlIl.II() + 1);
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlll(MinecraftClient minecraftClient, Vec3d vec3d, BlockPos blockPos) {
        RaycastContext raycastContext;
        if (vec3d == null) return false;
        if (blockPos == null) {
            return false;
        }
        raycastContext(minecraftClient.player.getEyePos(), vec3d, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.ANY, (Entity)minecraftClient.player);
        BlockHitResult blockHitResult = minecraftClient.world.raycast(raycastContext);
        if (blockHitResult == null) return false;
        if (blockHitResult.getBlockPos().equals((Object)blockPos)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIII(MinecraftClient minecraftClient, IIlIl iIlIl, int n) {
        if (!this.IIlll(minecraftClient, iIlIl.I(), iIlIl.ll())) {
            return false;
        }
        if (!this.lll(minecraftClient, n, IlIlIIIII.l)) {
            return false;
        }
        this.IllI(minecraftClient);
        ActionResult actionResult = lIIllllI.llllll(minecraftClient, Hand.MAIN_HAND);
        if (actionResult == null) return false;
        if (!actionResult.isAccepted()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockHitResult IlIIl(IIlIl iIlIl) {
        if (iIlIl == null) return null;
        if (iIlIl.Il() == null) return null;
        if (iIlIl.l() == null) return null;
        BlockHitResult blockHitResult = new BlockHitResult(iIlIl.I(), iIlIl.l(), iIlIl.Il(), false);
        return blockHitResult;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void III() {
        block41: {
            block44: {
                block55: {
                    block54: {
                        block40: {
                            block57: {
                                block52: {
                                    block46: {
                                        block53: {
                                            block43: {
                                                block56: {
                                                    block50: {
                                                        block42: {
                                                            block47: {
                                                                block36: {
                                                                    block49: {
                                                                        block45: {
                                                                            block51: {
                                                                                block39: {
                                                                                    block38: {
                                                                                        block37: {
                                                                                            block35: {
                                                                                                block48: {
                                                                                                    break block48;
lbl1:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        if (!this.llIll(var1_1, var4_6, var2_2.I())) break block35;
                                                                                                        break block36;
                                                                                                        break;
                                                                                                    }
lbl4:
                                                                                                    // 1 sources

                                                                                                    return;
lbl6:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        continue;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                var1_1 = MinecraftClient.getInstance();
                                                                                                if (!this.lIIll(var1_1)) break block49;
                                                                                                break block50;
                                                                                                while (true) {
                                                                                                    break block37;
                                                                                                    break;
                                                                                                }
lbl14:
                                                                                                // 3 sources

                                                                                                return;
                                                                                                while (true) {
                                                                                                    break block38;
                                                                                                    break;
                                                                                                }
                                                                                            }
lbl19:
                                                                                            // 2 sources

                                                                                            return;
lbl21:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                continue;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        this.IIIIlI(var1_1);
                                                                                        this.IIIIII(var1_1);
                                                                                        ** while (true)
lbl27:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            if (!this.IIllI(var1_1)) break block39;
                                                                                            break block40;
                                                                                            break;
                                                                                        }
lbl30:
                                                                                        // 1 sources

                                                                                        return;
lbl32:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            continue;
                                                                                            break;
                                                                                        }
lbl34:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            this.IlIl = var6_10;
                                                                                            ** GOTO lbl14
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    var6_9 = System.currentTimeMillis();
                                                                                    ** while (this.IIIlI != var4_6 || var6_9 >= this.III)
lbl40:
                                                                                    // 1 sources

                                                                                    break block51;
lbl41:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (!this.lIll) ** continue;
                                                                                        break block41;
                                                                                        break;
                                                                                    }
lbl44:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (var3_5 <= 0.5f) break block42;
                                                                                        break block43;
                                                                                        break;
                                                                                    }
lbl47:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        v0 = this.lllI.IllII(var1_1, this.IIlll.I(), ((Double)this.IIlIl.lIl()).floatValue());
                                                                                        break block44;
                                                                                        break;
                                                                                    }
lbl50:
                                                                                    // 1 sources

                                                                                    while (this.llI.lIl() == IlIIIllll.Il) {
                                                                                        break block45;
                                                                                    }
                                                                                    break block52;
lbl53:
                                                                                    // 1 sources

                                                                                    while (!this.llIlI(var1_1, var8_11)) {
                                                                                        break block46;
                                                                                    }
                                                                                    break block53;
lbl56:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl58:
                                                                                    // 1 sources

                                                                                    return;
                                                                                    this.lIl(var1_1);
                                                                                    if (this.IIl >= 0) {
                                                                                        ** continue;
lbl63:
                                                                                        // 1 sources

                                                                                        return;
                                                                                    }
                                                                                    break block54;
                                                                                }
                                                                                ** while (this.IlIl == null)
lbl68:
                                                                                // 1 sources

                                                                                break block55;
lbl69:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (this.lIII(var1_1, var4_6)) ** continue;
                                                                                    ** continue;
                                                                                    break;
                                                                                }
lbl72:
                                                                                // 1 sources

                                                                                return;
lbl74:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (this.llIlI(var1_1, var6_10)) ** GOTO lbl14
                                                                                    ** continue;
                                                                                    break;
                                                                                }
                                                                                while (true) {
                                                                                    break block47;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            return;
                                                                        }
                                                                        this.IIlll = var3_4;
                                                                        ** while (true)
                                                                    }
lbl85:
                                                                    // 2 sources

                                                                    return;
                                                                    while (true) {
                                                                        var3_4 = var2_2.II();
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                }
                                                                if (lIIllllI.IIIIIlI(var1_1) <= 0) ** GOTO lbl50
                                                                ** while (true)
                                                            }
                                                            var2_3 = this.Illll(var1_1, this.IIlll);
                                                            ** while (!var2_3)
lbl96:
                                                            // 1 sources

                                                            break block56;
                                                        }
lbl98:
                                                        // 3 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                        var4_6 = var2_2.l();
                                                        var5_8 = lIIllllI.lllI(var1_1.player.getInventory());
                                                        ** while (true)
lbl103:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl105:
                                                        // 1 sources

                                                        while (true) {
                                                            if (var2_2 != null) ** continue;
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
                                                    ** while (!orchard.internal.IIlI.IIl((MinecraftClient)var1_1))
lbl110:
                                                    // 1 sources

                                                    ** while (true)
                                                }
                                                v0 = 0.0f;
                                                break block44;
lbl114:
                                                // 1 sources

                                                while (true) {
                                                    v1(var3_4, var2_2.I(), var5_8, var4_6, var2_2.Il(), 0);
                                                    var8_11 = v1;
                                                    ** GOTO lbl53
                                                    break;
                                                }
                                            }
                                            if (var4_7 - this.lIl >= 1500L) ** break;
                                            ** while (true)
                                            ** GOTO lbl98
                                            this.IIlI = var2_2.I();
                                            break block57;
                                        }
lbl125:
                                        // 3 sources

                                        return;
                                    }
                                    this.IlIl = var8_11;
                                    ** GOTO lbl125
                                }
                                ** while (true)
                                var4_7 = System.currentTimeMillis();
                                if (!var2_3) ** break;
                                ** while (true)
                                ** while (true)
                                this.lIll = false;
                                var6_10 = new IIIlIIlIl(this.IIlll, this.IIlI, this.IIIII, this.ll, this.IIIll, 0);
                                ** while (true)
lbl139:
                                // 2 sources

                                while (true) {
                                    this.lIll = false;
                                    ** continue;
                                    break;
                                }
                            }
                            this.IIIll = var2_2.Il();
                            this.IIIII = var5_8;
                            ** while (true)
                        }
                        return;
                    }
                    var2_2 = this.IIlIl(var1_1);
                    ** while (true)
                }
                this.llIl(var1_1);
                ** while (true)
lbl154:
                // 1 sources

                while (true) {
                    this.lIl = System.currentTimeMillis();
                    ** continue;
                    break;
                }
lbl157:
                // 1 sources

                while (true) {
                    if (this.IIlI != null) ** continue;
                    ** GOTO lbl139
                    break;
                }
            }
            var3_5 = v0;
            ** while (true)
        }
        if (this.IIlll != null) ** break;
        ** while (true)
        ** while (true)
        this.ll = var4_6;
        this.lIll = true;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIIlIIlIl IlIlI(MinecraftClient minecraftClient, IIIlIIlIl iIIlIIlIl) {
        if (iIIlIIlIl == null) return null;
        if (!iIIlIIlIl.lI()) return null;
        if (iIIlIIlIl.III() != IlIlIIIII.l) return null;
        if (!this.lIIll(minecraftClient)) return null;
        int n = this.lllII(minecraftClient);
        if (n < 0) return null;
        IIlIl iIlIl = iIIlIIlIl.ll();
        IIlIl iIlIl2 = this.IIIIl(minecraftClient, iIlIl.ll(), iIlIl.lI());
        if (iIlIl2 != null) return new IIIlIIlIl(iIlIl2, IlIlIIIII.II, iIIlIIlIl.I(), n, false, 0);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IlIll(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult) {
        BlockPos blockPos;
        block4: {
            BlockPos blockPos2;
            block3: {
                block2: {
                    block1: {
                        this.lIlIl();
                        if (!this.lIIll(minecraftClient)) return;
                        if (hand == null) return;
                        if (blockHitResult == null) {
                            return;
                        }
                        this.IIIIlI(minecraftClient);
                        ItemStack itemStack = minecraftClient.player.getStackInHand(hand);
                        if (itemStack == null) return;
                        if (!itemStack.isOf(Items.WATER_BUCKET) && !itemStack.isOf(Items.LAVA_BUCKET)) break block1;
                        blockPos2 = blockHitResult.getBlockPos();
                        BlockState blockState = minecraftClient.world.getBlockState(blockPos2);
                        if (!blockState.isReplaceable()) break block2;
                        break block3;
                    }
                    return;
                }
                blockPos = blockPos2.offset(blockHitResult.getSide());
                break block4;
            }
            blockPos = blockPos2;
        }
        BlockPos blockPos3 = blockPos;
        this.Il = blockPos3.toImmutable();
        this.IIIIl = hand;
        this.llll = minecraftClient.player.age;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllII(MinecraftClient minecraftClient, IIIlIIlIl iIIlIIlIl) {
        if (iIIlIIlIl == null) return false;
        if (iIIlIIlIl.ll() != null) {
            if (this.lll(minecraftClient, iIIlIIlIl.l(), iIIlIIlIl.III())) {
                if (lIIllllI.llIllI(minecraftClient) != iIIlIIlIl.l()) return lIIllllI.IlIIIl(minecraftClient, this, iIIlIIlIl.l(), () -> this.IIlII(minecraftClient, iIIlIIlIl));
                return this.IIlII(minecraftClient, iIIlIIlIl);
            }
            return false;
        }
        return false;
    }

    private boolean Illll(MinecraftClient minecraftClient, IIlIl iIlIl) {
        return IlIlllI.lI(minecraftClient, this.IlIIl(iIlIl));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIIl(MinecraftClient minecraftClient, int n) {
        if (((Boolean)this.IIIl.lIl()).booleanValue() && minecraftClient != null && minecraftClient.player != null && n >= 0 && n < 9) {
            this.IIl = n;
            this.Illl = minecraftClient.player.age + 1;
            return;
        }
        this.IIl = -1;
        this.Illl = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private IIlIl lIIlI(MinecraftClient minecraftClient, BlockPos blockPos, Vec3d vec3d, double d) {
        if (!this.IIlll(minecraftClient, vec3d, blockPos)) return null;
        IIlIl iIlIl = new IIlIl(blockPos.toImmutable(), vec3d, null, null, null, d);
        return iIlIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        if (minecraftClient.player.isUsingItem()) return false;
        if (minecraftClient.player.isBlocking()) return false;
        if (lIIllllI.IllllI((LivingEntity)minecraftClient.player)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlII(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return true;
        if (minecraftClient.world == null) return true;
        if (blockPos == null) return true;
        Box box = new Box(blockPos);
        if (!minecraftClient.world.getOtherEntities(null, box, entity -> {
            if (entity.isSpectator()) return false;
            if (entity instanceof LivingEntity) return true;
            if (!entity.canHit()) return false;
            return true;
        }).isEmpty()) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void lIlIl() {
        this.Il = null;
        this.IIIIl = null;
        this.llll = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean llIII(BlockHitResult blockHitResult, BlockPos blockPos, Direction direction) {
        if (blockHitResult == null) return false;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return false;
        if (!blockHitResult.getBlockPos().equals((Object)blockPos)) return false;
        if (blockHitResult.getSide() != direction) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIlI(MinecraftClient minecraftClient, IIIlIIlIl iIIlIIlIl) {
        float f;
        float f2;
        IIlIl iIlIl = iIIlIIlIl == null ? null : iIIlIIlIl.ll();
        if (iIlIl == null) return false;
        if (!this.IlI(minecraftClient, iIlIl.ll())) return false;
        if (iIIlIIlIl.III() == IlIlIIIII.II) {
            if (!this.IIIIIl(minecraftClient, iIlIl)) return false;
        }
        if (!this.llIll(minecraftClient, iIIlIIlIl.l(), iIIlIIlIl.III())) return false;
        if (lIIllllI.IIIIIlI(minecraftClient) > 0) {
            return false;
        }
        boolean bl = this.Illll(minecraftClient, iIlIl);
        if (bl) {
            f2 = minecraftClient.player.getYaw();
            f = minecraftClient.player.getPitch();
        } else {
            float[] fArray = IlIlllI.IlIll(minecraftClient, iIlIl.I());
            if (fArray == null) {
                return false;
            }
            f2 = fArray[0];
            f = fArray[1];
        }
        ++this.IIll;
        long l2 = this.IIll++;
        boolean bl2 = IlIlllI.IlI(minecraftClient, 100, f2, f, () -> this.lIIl(minecraftClient, l2, iIIlIIlIl));
        if (bl2) {
            this.llII = new l(l2, iIIlIIlIl, minecraftClient.player.age + 2);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIll(MinecraftClient minecraftClient, int n, IlIlIIIII ilIlIIIII) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n >= 9) return false;
        if (this.lll(minecraftClient, n, ilIlIIIII)) return true;
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private int lllII(MinecraftClient var1_1) {
        block10: {
            block9: {
                block7: {
                    block6: {
                        block8: {
                            if (var1_1 == null) break block7;
                            break block8;
                            while (true) {
                                var2_2 = 0;
                                break block6;
                                break;
                            }
lbl6:
                            // 1 sources

                            while (true) {
                                ++var2_2;
                                break block6;
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
                                if (var1_1.world != null) ** continue;
                                break block7;
                                break;
                            }
                            var3_3 = var1_1.player.getInventory().getStack(var2_2);
                            ** while (!this.IIIlI((MinecraftClient)var1_1, (ItemStack)var3_3))
lbl16:
                            // 1 sources

                            break block9;
                        }
                        if (var1_1.player != null) {
                            ** continue;
                        }
                        break block7;
                    }
                    if (var2_2 < 9) {
                        ** continue;
                    }
                    break block10;
                }
                return -1;
            }
            return var2_2;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllIl(MinecraftClient minecraftClient, IIlIl iIlIl, int n) {
        if (!this.IIIIIl(minecraftClient, iIlIl)) {
            return false;
        }
        if (!this.lll(minecraftClient, n, IlIlIIIII.II)) {
            return false;
        }
        this.IllI(minecraftClient);
        ActionResult actionResult = lIIllllI.IllllIl(minecraftClient, Hand.MAIN_HAND, this.IlIIl(iIlIl));
        if (actionResult == null) return false;
        if (!actionResult.isAccepted()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private long llllI(IIIlIlIIl iIIlIlIIl) {
        if (iIIlIlIIl == null) {
            return 0L;
        }
        double d = iIIlIlIIl.IIIl();
        double d2 = iIIlIlIIl.IIII();
        if (!(d >= d2)) return Math.round(ThreadLocalRandom.current().nextDouble(d, d2));
        return Math.round(d);
    }

    /*
     * Unable to fully structure code
     */
    private int lllll(ClientPlayerEntity var1_1) {
        block6: {
            block7: {
                block9: {
                    block5: {
                        block8: {
                            if (var1_1 != null) break block8;
                            break block9;
lbl3:
                            // 1 sources

                            while (true) {
                                if (var3_3 != null) {
                                    break block5;
lbl6:
                                    // 1 sources

                                    return var2_2;
lbl8:
                                    // 2 sources

                                    while (var2_2 < 9) {
                                        break block6;
                                    }
                                    break block7;
                                }
lbl11:
                                // 3 sources

                                while (true) {
                                    ++var2_2;
                                    ** GOTO lbl8
                                    break;
                                }
                                break;
                            }
                        }
                        var2_2 = 0;
                        ** GOTO lbl8
                    }
                    ** while (!var3_3.isOf((Item)Items.BUCKET))
lbl19:
                    // 1 sources

                    ** while (true)
                }
                return -1;
            }
            return -1;
        }
        var3_3 = var1_1.getInventory().getStack(var2_2);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player != null) {
            int n = minecraftClient.player.age;
            this.lI.entrySet().removeIf(entry -> {
                if (n - (Integer)entry.getValue() > 120) return true;
                if (this.IIl(minecraftClient, (BlockPos)entry.getKey())) return false;
                return true;
            });
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIIl(MinecraftClient minecraftClient, IIlIl iIlIl) {
        if (!this.lIIll(minecraftClient)) return false;
        if (iIlIl == null) return false;
        if (iIlIl.Il() == null) return false;
        if (iIlIl.l() == null) return false;
        if (iIlIl.III() == null) return false;
        if (iIlIl.I() == null) return false;
        if (!iIlIl.Il().offset(iIlIl.l()).equals((Object)iIlIl.ll())) return false;
        if (!this.IlI(minecraftClient, iIlIl.ll())) return false;
        if (!minecraftClient.world.getBlockState(iIlIl.ll()).isReplaceable()) return false;
        if (!this.lIll(minecraftClient, iIlIl.Il(), minecraftClient.world.getBlockState(iIlIl.Il()))) return false;
        if (!this.lIlII(minecraftClient, iIlIl.ll())) {
            RaycastContext raycastContext;
            double d = Math.min(Math.sqrt(20.25), minecraftClient.player.getBlockInteractionRange());
            if (minecraftClient.player.getEyePos().squaredDistanceTo(iIlIl.I()) > d * d) {
                return false;
            }
            raycastContext(minecraftClient.player.getEyePos(), iIlIl.III(), RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)minecraftClient.player);
            BlockHitResult blockHitResult = minecraftClient.world.raycast(raycastContext);
            return AutoDrain.llIII(blockHitResult, iIlIl.Il(), iIlIl.l());
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIlI(MinecraftClient minecraftClient) {
        ClientWorld clientWorld;
        int n;
        block1: {
            block2: {
                block0: {
                    if (minecraftClient == null) return;
                    if (minecraftClient.player == null) break block0;
                    n = minecraftClient.player.hashCode();
                    clientWorld = minecraftClient.world;
                    if (n != this.lll) break block1;
                    break block2;
                }
                return;
            }
            if (clientWorld == this.IlII) return;
        }
        this.lll = n;
        this.IlII = clientWorld;
        this.lI.clear();
        this.IlI = 0L;
        this.III = 0L;
        this.IIIlI = -1;
        this.IIl = -1;
        this.Illl = 0;
        ++this.IIll;
        this.llII = null;
        this.IlIl = null;
        this.lIlIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIll(MinecraftClient minecraftClient, int n) {
        ++this.IIll;
        this.llII = null;
        this.IlIl = null;
        this.IlI = 0L;
        this.III = 0L;
        this.IIIlI = -1;
        if (((Boolean)this.IIIl.lIl()).booleanValue()) {
            if (n >= 0 && n < 9) {
                this.lIIIl(minecraftClient, n);
                return;
            }
        } else {
            this.IIl = -1;
            this.Illl = 0;
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
            return;
        }
        this.IIl = -1;
        this.Illl = 0;
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
    }

    private static int IIIlII(int n, int n2) {
        return IlIII[n ^ 0x1AE8436A] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIIlIl(int n, char c, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x92FF;
        char[] cArray = IlIIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlIlI[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            AutoDrain.IlIlI[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x354D;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 43005;
            n6 -= 57380;
            n6 ^= 0x11FC;
            n6 += 59119;
            cArray[n5] = (char)((n6 += 1533) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

