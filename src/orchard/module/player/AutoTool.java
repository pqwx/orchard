/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlllII
 * Module         : AutoTool  [PLAYER]
 * Description    : Automatically switches to the best mining tool and optional weapon slot.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Axes Are Weapons
 *   - Switch Weapons
 *   - Switch Tools
 *   - Switch Delay
 *   - Switch Back
 *   - .getBytes(
 *   - netherite
 *   - diamond
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
 *  net.minecraft.block.Blocks
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.item.MaceItem
 *  net.minecraft.registry.Registries
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 */
package orchard.module.player;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MaceItem;
import net.minecraft.registry.Registries;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIllIIIIl;
import orchard.internal.lIIllllI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class AutoTool
extends ModuleBase {
    private BlockPos I;
    private final llIll l;
    private static final int II = 3;
    private int Il;
    private int lI = -1;
    private int ll;
    private long III;
    private int IIl = -1;
    private long IlI;
    private Direction Ill;
    private boolean lII;
    private final llIll lIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Switch Tools"), true));
    private boolean llI;
    private int lll = -1;
    private BlockPos IIII;
    private long IIIl;
    private final IIIlIlIIl IIlI;
    private final llIll IIll;
    private long IlII;
    private final llIll IlIl;
    private static final int[] IllI;
    private static final String[] Illl;
    private static final Object[] lIII;

    /*
     * Unable to fully structure code
     */
    public static int lI(MinecraftClient var0, BlockState var1_1) {
        block8: {
            block7: {
                block6: {
                    block9: {
                        if (var0.player != null) break block8;
                        break block9;
lbl3:
                        // 1 sources

                        block0: while (true) {
                            block10: {
                                ++var4_4;
                                break block10;
lbl6:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (true) {
                                    if (!(var5_5 > var3_3)) continue block0;
                                    ** continue;
                                    break;
                                }
                            }
lbl12:
                            // 2 sources

                            while (var4_4 < 9) {
                                break block6;
                            }
                            break block7;
                            break;
                        }
                    }
                    return -1;
                }
                var5_5 = AutoTool.lII(var0, var1_1, var4_4);
                ** while (true)
                var3_3 = var5_5;
                var2_2 = var4_4;
                ** while (true)
lbl23:
                // 1 sources

                while (true) {
                    var4_4 = 0;
                    ** GOTO lbl12
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var3_3 = AutoTool.lII(var0, var1_1, var2_2);
                    ** continue;
                    break;
                }
            }
            return var2_2;
        }
        var2_2 = lIIllllI.lllI(var0.player.getInventory());
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIl(MinecraftClient minecraftClient) {
        HitResult hitResult;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.attackKey == null) return false;
        if (!minecraftClient.options.attackKey.isPressed()) {
            if (lIIllllI.IIl(minecraftClient.options.attackKey) <= 0) return false;
        }
        if (!((hitResult = minecraftClient.crosshairTarget) instanceof BlockHitResult)) return false;
        BlockHitResult blockHitResult = (BlockHitResult)hitResult;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI() {
        this.IIl = -1;
        this.lll = -1;
        this.IlI = 0L;
        this.IIIl = 0L;
        this.III = 0L;
        this.IlII = 0L;
        this.IIII = null;
        this.ll = 0;
        this.IIIIl();
    }

    public static float lII(MinecraftClient minecraftClient, BlockState blockState, int n) {
        if (minecraftClient.player != null) {
            ItemStack itemStack = minecraftClient.player.getInventory().getStack(n);
            return itemStack.getMiningSpeedMultiplier(blockState);
        }
        return 0.0f;
    }

    @Override
    public void ll() {
        this.IlI();
    }

    @Override
    public void llll() {
        this.Illl(MinecraftClient.getInstance(), true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lIl(MinecraftClient minecraftClient) {
        boolean bl;
        BlockHitResult blockHitResult;
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.world == null || minecraftClient.interactionManager == null || this.I == null || this.Ill == null) {
            this.IIIIl();
            return;
        }
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof BlockHitResult) || (blockHitResult = (BlockHitResult)hitResult).getType() != HitResult.Type.BLOCK || !blockHitResult.getBlockPos().equals((Object)this.I)) {
            this.IIIIl();
            return;
        }
        if (lIIllllI.lIllI(minecraftClient.world.getBlockState(this.I))) {
            this.IIIIl();
            return;
        }
        if (IIllIIIIl.IIl(minecraftClient.interactionManager)) {
            return;
        }
        if (!(this.IIl(minecraftClient) || minecraftClient.options != null && minecraftClient.options.attackKey != null && lIIllllI.IIllIII(minecraftClient, minecraftClient.options.attackKey))) {
            this.IIIIl();
            return;
        }
        IIllIIIIl.IllI(minecraftClient.interactionManager, minecraftClient.player.getMainHandStack());
        IIllIIIIl.lIIl(minecraftClient.interactionManager, 0);
        this.llI = true;
        try {
            bl = minecraftClient.interactionManager.attackBlock(this.I, this.Ill);
        }
        finally {
            this.llI = false;
        }
        if (!bl) {
            this.IIIIl();
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private int lll(PlayerEntity playerEntity) {
        float f = 0.0f;
        int n = -1;
        int n2 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                ++n2;
            }
            if (n2 >= 9) {
                return n;
            }
            ItemStack itemStack = playerEntity.getInventory().getStack(n2);
            float f2 = this.lIlI(itemStack);
            if (!(f2 > f)) continue;
            f = f2;
            n = n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIII(MinecraftClient minecraftClient) {
        if ((Boolean)this.lIl.lIl() == false) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (AutoTool.llIl(minecraftClient)) return false;
        if (!IIllIIIIl.IIl(minecraftClient.interactionManager)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlI(MinecraftClient minecraftClient, int n, boolean bl) {
        lIIllllI.IIIIIII(minecraftClient, n, true);
        this.lll = n;
        if (!bl) return;
        this.lIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private long IlII() {
        double d = this.IIlI.IIIl();
        double d2 = this.IIlI.IIII();
        if (d != d2) return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d, d2)));
        return Math.max(0L, Math.round(d));
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IllI(MinecraftClient minecraftClient, BlockPos blockPos, Direction direction) {
        if (this.llI) return false;
        if (!this.IIIlIIl()) return false;
        if (((Boolean)this.lIl.lIl()).booleanValue()) {
            if (minecraftClient.player == null) return false;
            if (minecraftClient.world == null) {
                return false;
            }
            BlockState blockState = minecraftClient.world.getBlockState(blockPos);
            int n = AutoTool.lI(minecraftClient, blockState);
            int n2 = lIIllllI.lllI(minecraftClient.player.getInventory());
            if (n < 0) return false;
            if (n == n2) return false;
            if (this.IIl == -1) {
                this.IIl = n2;
            }
            this.lllI(minecraftClient, blockPos, direction, n);
            long l2 = System.currentTimeMillis();
            this.IlI = l2;
            this.IIIl = this.IlII();
            this.III = l2;
            this.IlII = this.IlII();
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void Illl(MinecraftClient minecraftClient, boolean bl) {
        if (bl && ((Boolean)this.l.lIl()).booleanValue() && this.IIl >= 0 && this.IIl < 9 && minecraftClient != null && minecraftClient.player != null && lIIllllI.lllI(minecraftClient.player.getInventory()) != this.IIl) {
            lIIllllI.IlIll(minecraftClient, this.IIl);
        }
        this.IlI();
    }

    private boolean lIII(MinecraftClient minecraftClient) {
        boolean bl;
        if (!this.lII) {
            return false;
        }
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.world == null || minecraftClient.interactionManager == null || this.I == null || this.Ill == null || this.lI < 0 || this.lI >= 9) {
            this.IIIIl();
            return false;
        }
        if (this.Il != Integer.MIN_VALUE && minecraftClient.player.age - this.Il > 20) {
            this.IIIIl();
            return false;
        }
        if (lIIllllI.lIllI(minecraftClient.world.getBlockState(this.I))) {
            this.IIIIl();
            return false;
        }
        if (lIIllllI.llIllI(minecraftClient) != this.lI || !lIIllllI.lll(minecraftClient, this.lI)) {
            return true;
        }
        IIllIIIIl.IllI(minecraftClient.interactionManager, minecraftClient.player.getMainHandStack());
        IIllIIIIl.lIIl(minecraftClient.interactionManager, 0);
        this.llI = true;
        try {
            bl = minecraftClient.interactionManager.attackBlock(this.I, this.Ill);
        }
        finally {
            this.llI = false;
        }
        this.lII = false;
        if (!bl) {
            this.IIIIl();
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIl(MinecraftClient minecraftClient) {
        BlockHitResult blockHitResult;
        BlockPos blockPos;
        HitResult hitResult = minecraftClient.crosshairTarget;
        BlockPos blockPos2 = blockPos = !(hitResult instanceof BlockHitResult) || (blockHitResult = (BlockHitResult)hitResult).getType() != HitResult.Type.BLOCK ? null : blockHitResult.getBlockPos();
        if (blockPos != null && blockPos.equals((Object)this.IIII)) {
            ++this.ll;
            return;
        }
        this.IIII = blockPos;
        this.ll = blockPos != null ? 1 : 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private float lIlI(ItemStack itemStack) {
        if (itemStack.isEmpty()) {
            return 0.0f;
        }
        if (itemStack.getItem() instanceof MaceItem) {
            return 7.0f;
        }
        if (itemStack.getItem() instanceof AxeItem) {
            if ((Boolean)this.IlIl.lIl() != false) return 6.0f;
            return 0.0f;
        }
        String string = Registries.ITEM.getId((Object)itemStack.getItem()).getPath();
        if (!string.endsWith("_sword")) {
            return 0.0f;
        }
        if (string.contains("netherite")) {
            return 8.0f;
        }
        if (string.contains("diamond")) {
            return 7.0f;
        }
        if (string.contains("iron")) {
            return 6.0f;
        }
        if (string.contains("stone")) return 5.0f;
        if (!string.contains("golden")) return 3.0f;
        return 4.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIll(MinecraftClient minecraftClient, BlockPos blockPos, Direction direction) {
        if (minecraftClient != null && blockPos != null && direction != null) {
            this.I = blockPos.toImmutable();
            this.Ill = direction;
            return;
        }
        this.IIIIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void I(Entity entity) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (lIIllllI.IIIlIIl()) return;
        if ((Boolean)this.IIll.lIl() == false) return;
        if (minecraftClient.player == null) return;
        if (!(entity instanceof PlayerEntity)) return;
        int n = this.lll((PlayerEntity)minecraftClient.player);
        if (n < 0) return;
        if (this.IIl == -1) {
            this.IIl = lIIllllI.lllI(minecraftClient.player.getInventory());
        }
        this.llII(minecraftClient, n);
        this.III = System.currentTimeMillis();
        this.IlII = this.IlII();
    }

    /*
     * Enabled aggressive block sorting
     */
    public AutoTool() {
        super(StringFactory.IIII("uYFAky1YXxA="), Category.IIl, StringFactory.IIII("uYFAkxRWRBWUCZNVFpPNiZGAV5QcRBAImEiLUQqT3JuLgBSREFlZEpBIi1YA356flpAUkwlDWROZCZMZGNbfjpeaFI8VWERS"));
        this.l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Switch Back"), true));
        this.IIlI = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Switch Delay"), 45.0, 55.0, 0.0, 250.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.IIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Switch Weapons"), false));
        this.IlIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Axes Are Weapons"), false));
        this.Il = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        BlockHitResult blockHitResult;
        HitResult hitResult;
        long l2;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player != null && minecraftClient.world != null && minecraftClient.interactionManager != null) {
            if (lIIllllI.lIIIlI(minecraftClient)) {
                return;
            }
            if (this.lIII(minecraftClient)) {
                return;
            }
        } else {
            this.Illl(minecraftClient, false);
            return;
        }
        this.lIl(minecraftClient);
        this.lIIl(minecraftClient);
        if (this.IIII(minecraftClient)) {
            l2 = System.currentTimeMillis();
            if (this.IlI != 0L && l2 - this.IlI < this.IIIl) {
                return;
            }
            if (this.ll < 3) {
                return;
            }
            hitResult = minecraftClient.crosshairTarget;
            if (!(hitResult instanceof BlockHitResult)) return;
            blockHitResult = (BlockHitResult)hitResult;
            if (blockHitResult.getType() != HitResult.Type.BLOCK) {
                return;
            }
        } else {
            this.IIIIl();
            this.IIIII(minecraftClient);
            return;
        }
        hitResult = minecraftClient.world.getBlockState(blockHitResult.getBlockPos());
        int n = AutoTool.lI(minecraftClient, (BlockState)hitResult);
        int n2 = lIIllllI.lllI(minecraftClient.player.getInventory());
        if (n < 0) return;
        if (n == n2) return;
        if (this.IIl == -1) {
            this.IIl = n2;
        }
        this.IIlI(minecraftClient, n, true);
        this.IlI = l2;
        this.IIIl = this.IlII();
        this.III = l2;
        this.IlII = this.IlII();
    }

    private void llII(MinecraftClient minecraftClient, int n) {
        this.IIlI(minecraftClient, n, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean llIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) {
            return false;
        }
        ItemStack itemStack = minecraftClient.player.getMainHandStack();
        if (itemStack.isEmpty()) return false;
        if (!itemStack.isOf(Items.END_CRYSTAL)) {
            return false;
        }
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof BlockHitResult)) return false;
        BlockHitResult blockHitResult = (BlockHitResult)hitResult;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) {
            return false;
        }
        hitResult = minecraftClient.world.getBlockState(blockHitResult.getBlockPos());
        if (hitResult.isOf(Blocks.OBSIDIAN)) return true;
        if (hitResult.isOf(Blocks.BEDROCK)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllI(MinecraftClient minecraftClient, BlockPos blockPos, Direction direction, int n) {
        this.lIll(minecraftClient, blockPos, direction);
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.interactionManager == null) {
            return;
        }
        this.lI = n;
        this.lII = true;
        this.Il = minecraftClient.player.age;
        this.IIlI(minecraftClient, n, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIII(MinecraftClient minecraftClient) {
        if (this.IIl < 0) return;
        if (minecraftClient.player != null) {
            if (!((Boolean)this.l.lIl()).booleanValue()) {
                this.IlI();
                return;
            }
            long l2 = System.currentTimeMillis();
            if (this.III != 0L && l2 - this.III < this.IlII) {
                return;
            }
        } else {
            return;
        }
        if (this.lll >= 0 && lIIllllI.lllI(minecraftClient.player.getInventory()) != this.lll) {
            this.IlI();
            return;
        }
        lIIllllI.IlIll(minecraftClient, this.IIl);
        this.IlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIl() {
        this.I = null;
        this.Ill = null;
        this.lI = -1;
        this.lII = false;
        this.Il = Integer.MIN_VALUE;
    }

    private static int IIIlI(int n, int n2) {
        return IllI[n ^ 0xD0DE8669] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 3510;
        var7_2 = "\u974f\u9702\u973f\u97f5\u977e\u9755\u9753\u97a2\u4a0e\u4a23\u4a18\u4a37\u4a02\u4a7b\u4a3a\u4a75\u4a67\u4a47\u4a05\u4a0c\u2568\u251d\u2529\u2566\u257f\u252f\u253c\u252d\u254c\u2553\u2555\u2542\u4d36\u4d75\u4d19\u4d6b\u4d3a\u4d21\u4d40\u4d51\u68ba\u68d4\u68eb\u68e1\u68b4\u68a2\u6884\u68df\ua7b0\ua3d8\ua7f6\ua7b3\ua7bd\ua787\ua786\ua7f5\u7547\u75a2\u752e\u750d\u7571\u7548\u750b\u75a2\u75d0\u751a\u7557\u7514\ue71d\ue720\ue770\ue75f\ue76b\ue709\ue738\ue712\ue744\ue75e\ue70f\ue726\ue70f\ue721\ue778\ue76a\ue700\ue701\ue73a\ue715\ue71d\ue766\ue71f\ue712\ue73c\ue74c\ue745\ue739\ue734\ue713\ue709\ue710\ue719\ue75b\ue76d\ue71d\ue73d\ue728\ue765\ue768\ue753\ue71b\ue71d\ue717\ue70f\ue75e\ue733\ue723\ue70d\ue71d\ue71a\ue766\ue701\ue701\ue708\ue710\ue71d\ue70f\ue73d\ue712\ue75f\ue74c\ue720\ue73a\ue76a\ue701\ue709\ue72c\ue71b\ue735\ue76a\ue715\ue703\ue729\ue777\ue766\ue703\ue72b\ue705\ue721\ue76f\ue752\ue764\ue777\ue760\ue70b\ue711\ue73f\ue700\ue71a\ue752\ue72d\ue77f\ue75b\ue734\ue724\u3fda\u238c\u3fb7\u3e7b\u3e2e\u3fd4\u3fd9\u3e22\u3fb2\u3f9e\u3e2e\u3fe9\u3fcf\u238f\u3fb7\u3f96\ue115\ue143\ue174\ue134\ue161\ue11f\ue116\ue171\ue17d\ue154\ue15c\ue12c\ue10b\ue140\ue149\ue10f\ub5c8\ub982\ub5a9\ub595\ub5fc\ub5c2\ub5cf\ub5ec\ub5a0\ub475\ub5fc\ub431\ub5d9\ub5c0\ub9f0\ub58e\u6bf1\u6a37\u6b80\u6fd4\u100c\u105e\u106d\u1069\u1038\u1006\u1013\u1028\u1064\u1048\u1004\u1075\u101e\u1075\u1038\u103c\u1010\u1025\u101c\u1051\udb24\ud8d9\udb53\ud897\ud8d5\ud8fb\udb23\ud8f0\ud8bc\ud889\ud8d1\ud8d4\ud8c7\ud8f5\udb5b\ud89e\ud8f3\ud8f3\udb29\ud8d1\ud8a5\ud896\ud8e0\ud8f7";
        var8_3 = "\u0dbe\u0dba\u0dba\u0dbe\u0dbe\u0dbe\u0dba\u0dd6\u0da6\u0da6\u0da6\u0db2\u0da2\u0dae".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl16
lbl7:
        // 1 sources

        while (true) {
            var1_13 = var0_11.length / 4;
            AutoTool.IllI = new int[var1_13];
            var3_14 = 0;
            var4_15 = 0;
            if (true) ** GOTO lbl61
            break;
        }
        block8: while (true) {
            block16: {
                if (++var10_5 < var8_3.length) break block16;
                var13_8 = 0;
lbl16:
                // 2 sources

                var10_5 = 0;
                var11_6 = 0;
                var12_7 = 0;
                if (var13_8 == 0) {
                    AutoTool.Illl = var9_4;
                    AutoTool.lIII = new Object[var9_4.length];
                    var2_12 = -1801395547;
                    var0_11 = "\u0095W\u00d8\u008b\ttV\u00ac\"*V\u00d7u\u00b2\u00146;,\u00d3\u00cc\u00ae:\u008c\u008bd\u0094\u0092\u00e6hs\u00dd\u00c1".getBytes("ISO-8859-1");
                    ** continue;
                }
            }
            var12_7 = var8_3[var10_5] ^ var6;
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
            if (true) ** GOTO lbl35
            block9: while (true) {
                var16_1 = v0;
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                if (var15_10 >= var14_9.length) ** GOTO lbl51
lbl35:
                // 2 sources

                switch (var15_10 % 6) {
                    case 3: {
                        v0 = 118;
                        continue block9;
                    }
                    case 2: {
                        v0 = 92;
                        continue block9;
                    }
                    default: {
                        v0 = 32;
                        continue block9;
                    }
                    case 4: {
                        v0 = 44;
                        continue block9;
                    }
                    case 1: {
                        v0 = 49;
                        continue block9;
                    }
lbl51:
                    // 1 sources

                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    continue block8;
                    case 5: 
                }
                v0 = 59;
            }
            break;
        }
        while (true) {
            var3_14 += 4;
            if (++var4_15 >= var1_13) {
                return;
            }
lbl61:
            // 3 sources

            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
            AutoTool.IllI[var4_15] = var5_16 ^= var2_12;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIIll(char c, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = c ^ 0x1DD;
        char[] cArray = Illl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIII[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            AutoTool.lIII[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4E32;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0xD102;
            n7 -= 18120;
            n7 ^= 0x8946;
            n7 ^= 0x8B8;
            n7 += 49476;
            cArray[n6] = (char)((n7 += 47237) ^ n4 ^ n2 ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

