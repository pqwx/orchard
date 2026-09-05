/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllI
 * Module         : FastAnchor  [COMBAT]
 * Description    : Automatically explodes interracted & placed anchors.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Explode Delay
 *   - Action Delay
 *   - Switch Delay
 *   - Charge Delay
 *   - Explode Slot
 *   - Only Charge
 *   - Own Anchors
 *   - Swap Delay
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
 *  net.minecraft.block.RespawnAnchorBlock
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.state.property.Property
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 */
package orchard.module.combat;

import com.google.gson.JsonObject;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RespawnAnchorBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlIlIlI;
import orchard.internal.llIll;
import orchard.internal.llIlllII;

@Environment(value=EnvType.CLIENT)
public final class FastAnchor
extends ModuleBase {
    private boolean I;
    private BlockHitResult l;
    private final llIll II;
    private BlockHitResult Il;
    private boolean lI;
    private BlockPos ll;
    private static final long III = 5000L;
    private int IIl;
    private final IIIlIlIIl IlI;
    private int Ill;
    private int lII;
    private BlockPos lIl;
    private final llIll llI;
    private int lll = -1;
    private int IIII;
    private final Map<BlockPos, Long> IIIl;
    private long IIlI;
    private final lIlIIlI IIll;
    private int IlII = -1;
    private int IlIl;
    private final IIIIIIIIl<llIlllII> IllI = this.IIlllIl(new IIIIIIIIl<llIlllII>(StringFactory.IIII("q4NdiBpfEA=="), llIlllII.class, llIlllII.I));
    private long Illl;
    private final IIIlIlIIl lIII;
    private Object lIIl;
    private static final int lIlI = 12;
    private int lIll = 0;
    private int llII = 0;
    private lIlIlIlI llIl;
    private final IIIlIlIIl lllI;
    private static final double llll = 0.8;
    private int IIIII = -1;
    private int IIIIl = -1;
    private boolean IIIlI = false;
    private final lIlIIlI IIIll;
    private boolean IIlII = false;
    private long IIlIl;
    private final llIll IIllI;
    private BlockPos IIlll;
    private long IlIII = 0L;
    private BlockHitResult IlIIl;
    private static final int[] IlIlI;
    private static final String[] IlIll;
    private static final Object[] IllII;

    private boolean lI(MinecraftClient minecraftClient) {
        return orchard.internal.IIlI.IIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(MinecraftClient minecraftClient) {
        int n = System.identityHashCode(minecraftClient.player);
        if (this.llII != n) {
            this.llII = n;
            this.IlII();
            return;
        }
    }

    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.IIlI(minecraftClient);
        this.IIIII(minecraftClient);
    }

    @Override
    public String IIIl() {
        return super.IIIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI(MinecraftClient minecraftClient) {
        if (minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null && this.lIl != null) {
            lIlIlIlI lIlIlIlI2;
            if (!minecraftClient.world.getBlockState(this.lIl).isOf(Blocks.RESPAWN_ANCHOR)) {
                this.lll();
                return;
            }
            int n = this.IIllI(minecraftClient, this.lIl);
            if (n < this.IIIIl) {
                if (minecraftClient.player.age <= this.Ill) return;
                this.lI = false;
                this.IIIIl = -1;
                this.Ill = Integer.MIN_VALUE;
                this.IlIII(lIlIlIlI.Il);
                return;
            }
            this.lI = false;
            this.IIIIl = -1;
            this.Ill = Integer.MIN_VALUE;
            this.lIll = Math.max(0, this.lIll - 1);
            if (this.lIll <= 0) {
                lIlIlIlI2 = (Boolean)this.llI.lIl() != false ? lIlIlIlI.lI : lIlIlIlI.III;
            }
            lIlIlIlI2 = lIlIlIlI.Il;
            this.IlIII(lIlIlIlI2);
            return;
        }
        this.lll();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        this.llllll(jsonObject, "Action Delay", this.lllI);
        this.llllll(jsonObject, "Switch Delay", this.lllI);
        this.llllll(jsonObject, "Charge Delay", this.lllI);
        this.llllll(jsonObject, "Explode Delay", this.lllI);
        if (this.lllI.IIIl() != 55.0) return;
        if (this.lllI.IIII() != 60.0) return;
        this.lllI.I(new double[]{0.0, 0.0});
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockHitResult lII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return null;
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof BlockHitResult)) return null;
        BlockHitResult blockHitResult = (BlockHitResult)hitResult;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return null;
        return blockHitResult;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(MinecraftClient minecraftClient) {
        BlockHitResult blockHitResult = this.IllII(minecraftClient);
        if (blockHitResult == null) return;
        if (this.llIl == lIlIlIlI.l && this.lIll <= 0) {
            if (!this.IlIIl(minecraftClient, blockHitResult, this.lll)) return;
            this.lIIl(minecraftClient, blockHitResult);
            return;
        } else {
            if (this.llIl != lIlIlIlI.l && this.llIl != lIlIlIlI.IIl && this.llIl != lIlIlIlI.Il) {
                if (this.llIl != lIlIlIlI.III) {
                    if (this.llIl != lIlIlIlI.ll) return;
                }
                if (!this.IlIIl(minecraftClient, blockHitResult, this.lll)) return;
                this.lIIl(minecraftClient, blockHitResult);
                return;
            }
            if (this.lIll <= 0) {
                lIIllllI.llIlIl(minecraftClient.options.useKey);
                this.IlIII(lIlIlIlI.III);
                return;
            }
            int n = this.IIllI(minecraftClient, this.lIl);
            if (!this.IlIIl(minecraftClient, blockHitResult, this.IlII)) return;
            this.lI = true;
            this.IIIIl = Math.min(4, Math.max(0, n) + 1);
            this.Ill = minecraftClient.player.age + 12;
            this.IlIII(lIlIlIlI.Il);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        this.lll();
        this.IIlII = false;
        this.IIIlI = false;
        this.llII = 0;
        this.IIIl.clear();
        this.IIlll = null;
        this.IlIl = Integer.MIN_VALUE;
        this.lIIl = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lll() {
        this.llIl = lIlIlIlI.I;
        this.IIlII = false;
        this.IlII = -1;
        this.lll = -1;
        this.IIIII = -1;
        this.lIll = 0;
        this.IlIII = 0L;
        this.lIl = null;
        this.l = null;
        this.lI = false;
        this.IIIIl = -1;
        this.Ill = Integer.MIN_VALUE;
        this.I = false;
        this.lII = Integer.MIN_VALUE;
        this.Il = null;
        this.IlllI();
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int IIII(PlayerEntity playerEntity, Item item) {
        int n;
        block3: {
            block2: {
                n = 0;
                if (!true) break block2;
                if (n >= 9) return -1;
                if (playerEntity.getInventory().getStack(n).isOf(item)) break block3;
            }
            do {
                ++n;
                if (n >= 9) return -1;
            } while (!playerEntity.getInventory().getStack(n).isOf(item));
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlI(MinecraftClient minecraftClient) {
        ClientWorld clientWorld;
        ClientWorld clientWorld2 = clientWorld = minecraftClient == null ? null : minecraftClient.world;
        if (clientWorld != this.lIIl) {
            this.IIIl.clear();
            this.IIlll = null;
            this.IlIl = Integer.MIN_VALUE;
            this.lIIl = clientWorld;
            return;
        }
        if (minecraftClient == null) return;
        if (minecraftClient.world == null) return;
        if (!this.IIIl.isEmpty()) {
            this.IIIl.keySet().removeIf(blockPos -> !minecraftClient.world.getBlockState(blockPos).isOf(Blocks.RESPAWN_ANCHOR));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlII() {
        this.llIl = lIlIlIlI.I;
        this.IIlII = false;
        this.IIIlI = false;
        this.IlII = -1;
        this.lll = -1;
        this.IIIII = -1;
        this.lIll = 0;
        this.IlIII = 0L;
        this.lIl = null;
        this.l = null;
        this.lI = false;
        this.IIIIl = -1;
        this.Ill = Integer.MIN_VALUE;
        this.I = false;
        this.lII = Integer.MIN_VALUE;
        this.Il = null;
        this.IlllI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllI(MinecraftClient minecraftClient) {
        if (this.lIll > 0) {
            this.IlIII(lIlIlIlI.IIl);
        } else {
            this.IlIII(lIlIlIlI.III);
        }
        this.lIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.options != null) {
            lIIllllI.llIlIl(minecraftClient.options.useKey);
            this.IIlII = true;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.world == null) return;
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof BlockHitResult)) return;
        BlockHitResult blockHitResult = (BlockHitResult)hitResult;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) {
            return;
        }
        this.lIlII(minecraftClient, Hand.MAIN_HAND, blockHitResult);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIl(MinecraftClient minecraftClient, BlockHitResult blockHitResult) {
        this.I = true;
        this.lII = minecraftClient.player.age + 12;
        this.Il = blockHitResult;
        this.IlIII(lIlIlIlI.ll);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlI(ItemStack itemStack) {
        if (itemStack == null) return true;
        if (itemStack.isEmpty()) return true;
        if (!itemStack.isOf(Items.GLOWSTONE)) return true;
        return false;
    }

    private void lIll(MinecraftClient minecraftClient) {
        this.lll();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llII(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) return false;
        if (!minecraftClient.world.getBlockState(blockPos).isOf(Blocks.RESPAWN_ANCHOR)) return false;
        if ((Boolean)this.II.lIl() == false) return true;
        if (this.IIIll(minecraftClient, blockPos)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private long llIl(lIlIlIlI lIlIlIlI2) {
        long l2;
        IIIlIlIIl iIIlIlIIl;
        if (lIlIlIlI2 == lIlIlIlI.I) return 0L;
        if (lIlIlIlI2 == lIlIlIlI.l) {
            return 0L;
        }
        switch (lIlIlIlI2.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 2: 
            case 4: {
                IIIlIlIIl iIIlIlIIl2 = null;
                break;
            }
            case 0: 
            case 1: {
                IIIlIlIIl iIIlIlIIl2 = this.lllI;
                break;
            }
            case 3: 
            case 5: 
            case 6: {
                IIIlIlIIl iIIlIlIIl2 = iIIlIlIIl = null;
            }
        }
        if (lIlIlIlI2 != lIlIlIlI.IIl) {
            long l3;
            long l4;
            if (lIlIlIlI2 == lIlIlIlI.Il) {
                return this.lIIlI(this.IlI);
            }
            if (lIlIlIlI2 == lIlIlIlI.III) {
                l4 = this.lIIlI(this.lIII);
                if (this.IIlll(this.lll)) {
                    l3 = this.lIIlI(this.lllI);
                    return l4 + l3;
                }
            } else {
                if (iIIlIlIIl == null) return 0L;
                long l5 = this.lIIlI(iIIlIlIIl);
                return l5;
            }
            l3 = 0L;
            return l4 + l3;
        }
        long l6 = this.lIIlI(this.IlI);
        if (!this.IIlll(this.IlII)) {
            l2 = 0L;
            return l6 + l2;
        }
        l2 = this.lIIlI(this.lllI);
        return l6 + l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllI(MinecraftClient minecraftClient, boolean bl) {
        block4: {
            block5: {
                block3: {
                    if (this.ll == null) return false;
                    if (minecraftClient == null) return false;
                    if (minecraftClient.player == null) return false;
                    if (minecraftClient.world == null) break block3;
                    if (minecraftClient.player.age <= this.IIl && minecraftClient.world.getBlockState(this.ll).isOf(Blocks.RESPAWN_ANCHOR)) break block4;
                    break block5;
                }
                return false;
            }
            this.IlllI();
            return false;
        }
        long l2 = lIIllllI.lIIllI();
        if (l2 != this.IIlI) {
            this.IIlI = l2;
            this.IIII = minecraftClient.player.age + 1;
            return false;
        }
        if (bl) return false;
        if (minecraftClient.player.age < this.IIII) return false;
        if (this.lI(minecraftClient)) {
            return false;
        }
        BlockPos blockPos = this.ll;
        this.l = this.IlIIl;
        if (this.IIlIl(minecraftClient, blockPos, this.IIllI(minecraftClient, blockPos))) {
            this.IlllI();
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIII(MinecraftClient minecraftClient) {
        if (this.IIlll == null) return;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.world != null) {
            if (!minecraftClient.world.getBlockState(this.IIlll).isOf(Blocks.RESPAWN_ANCHOR)) {
                if (minecraftClient.player.age <= this.IlIl) return;
                this.IIlll = null;
                this.IlIl = Integer.MIN_VALUE;
                return;
            }
            BlockPos blockPos = this.IIlll.toImmutable();
            this.IIIl.put(blockPos, System.currentTimeMillis());
            this.IIlll = null;
            this.IlIl = Integer.MIN_VALUE;
            if (this.IllI.lIl() != llIlllII.lI) return;
            if (this.llIl != lIlIlIlI.I) return;
            this.ll = blockPos;
            this.IlIIl = this.IIlII(minecraftClient, blockPos);
            this.IIII = minecraftClient.player.age + 1;
            this.IIl = minecraftClient.player.age + 40;
            this.IIlI = lIIllllI.lIIllI();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public FastAnchor() {
        super(StringFactory.IIII("vpVHiDhZUxSYGg=="), Category.II, StringFactory.IIII("uYFAkxRWRBWUCZNVFpPbhoiYW5gcRBAVmRyaSx3S3YqdkBTaWUdcHZQNmxkO3d2Wl4ZH0g=="));
        this.IIll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Charges"), 1.0, 1.0, 4.0, 1.0));
        this.lllI = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Swap Delay"), 0.0, 0.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.IlI = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Charge Delay"), 0.0, 0.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.lIII = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Explode Delay"), 0.0, 0.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.IIIll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Explode Slot"), 0.0, 0.0, 9.0, 1.0));
        this.llI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Only Charge"), false));
        this.IIllI = this.IIlllIl(new llIll((Object)StringFactory.IIII("While Use"), false));
        this.II = this.IIlllIl(new llIll((Object)StringFactory.IIII("Own Anchors"), true));
        this.llIl = lIlIlIlI.I;
        this.Ill = Integer.MIN_VALUE;
        this.lII = Integer.MIN_VALUE;
        this.IIIl = new HashMap<BlockPos, Long>();
        this.IlIl = Integer.MIN_VALUE;
        this.IIII = Integer.MIN_VALUE;
        this.IIl = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIIlI(PlayerEntity playerEntity, int n) {
        int n2;
        int n3 = (int)Math.round((Double)this.IIIll.lIl()) - 1;
        if (n3 < 0) {
            int n4 = this.IIII(playerEntity, Items.TOTEM_OF_UNDYING);
            if (n4 != -1) {
                return n4;
            }
            ItemStack itemStack = playerEntity.getInventory().getStack(n);
            if (this.lIlI(itemStack)) {
                return n;
            }
            int n5 = this.IIII(playerEntity, Items.RESPAWN_ANCHOR);
            if (n5 != -1) {
                return n5;
            }
        } else {
            if (!this.lIlI(playerEntity.getInventory().getStack(n3))) return -1;
            int n6 = n3;
            return n6;
        }
        int n7 = this.lIIIl(playerEntity);
        if (n7 == -1) {
            n2 = n;
            return n2;
        }
        n2 = n7;
        return n2;
    }

    @Override
    public String lIlll() {
        return "";
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        this.lll();
        this.IIlII = false;
        this.IIIlI = false;
        this.IIIl.clear();
        this.IIlll = null;
        this.IlIl = Integer.MIN_VALUE;
        this.lIIl = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIll(MinecraftClient minecraftClient, BlockPos blockPos) {
        BlockPos blockPos2 = blockPos.toImmutable();
        if (this.IIIl.containsKey(blockPos2)) {
            if (minecraftClient.world != null) {
                if (minecraftClient.world.getBlockState(blockPos2).isOf(Blocks.RESPAWN_ANCHOR)) return true;
            }
            this.IIIl.remove(blockPos2);
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockHitResult IIlII(MinecraftClient minecraftClient, BlockPos blockPos) {
        BlockHitResult blockHitResult = this.lII(minecraftClient);
        if (blockHitResult == null) return new BlockHitResult(Vec3d.ofCenter((Vec3i)blockPos), Direction.UP, blockPos, false);
        if (!blockPos.equals((Object)blockHitResult.getBlockPos())) return new BlockHitResult(Vec3d.ofCenter((Vec3i)blockPos), Direction.UP, blockPos, false);
        return blockHitResult;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String II() {
        String string;
        long l2 = Math.round(this.lllI.IIIl() * 0.8);
        long l3 = Math.round(this.lllI.IIII() * 0.8);
        if (l2 != l3) {
            String string2 = "ms";
            long l4 = l3;
            String string3 = "-";
            long l5 = l2;
            string = l5 + string3 + l4 + string2;
            return string;
        }
        String string4 = "ms";
        long l6 = l2;
        string = l6 + string4;
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIl(MinecraftClient minecraftClient, BlockPos blockPos, int n) {
        int n2;
        int n3;
        int n4;
        if (minecraftClient.player == null) return false;
        if (this.lI(minecraftClient)) return false;
        if (this.llII(minecraftClient, blockPos)) {
            n4 = lIIllllI.lllI(minecraftClient.player.getInventory());
            n3 = this.IIIlI((PlayerEntity)minecraftClient.player, n4);
            if (n3 == -1) {
                return false;
            }
            int n5 = (int)((Double)this.IIll.lIl()).doubleValue();
            n5 = Math.max(1, Math.min(4, n5));
            n2 = Math.max(0, n5 - Math.max(0, n));
            if (((Boolean)this.llI.lIl()).booleanValue() && n2 <= 0) {
                return this.Illl(minecraftClient);
            }
        } else {
            return false;
        }
        int n6 = n2 > 0 ? this.IIII((PlayerEntity)minecraftClient.player, Items.GLOWSTONE) : -1;
        if (n2 <= 0 || n6 != -1) {
            this.lIl = blockPos == null ? null : blockPos.toImmutable();
            this.IlII = n6;
            this.lll = n3;
            this.IIIII = n4;
            this.lIll = n2;
            this.Illl = System.currentTimeMillis();
            lIIllllI.llIlIl(minecraftClient.options.useKey);
            this.IIIlI = true;
            this.IlIII(lIlIlIlI.l);
            this.IlIll(minecraftClient);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIllI(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return 0;
        if (minecraftClient.world == null) return 0;
        if (blockPos == null) {
            return 0;
        }
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (blockState.isOf(Blocks.RESPAWN_ANCHOR)) return (Integer)blockState.get((Property)RespawnAnchorBlock.CHARGES);
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlll(int n) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n >= 9) return false;
        if (lIIllllI.llIllI(minecraftClient) == n) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IlIII(lIlIlIlI lIlIlIlI2) {
        this.llIl = lIlIlIlI2;
        this.IIlIl = System.currentTimeMillis();
        this.IlIII = this.llIl(lIlIlIlI2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIIl(MinecraftClient minecraftClient, BlockHitResult blockHitResult, int n) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (blockHitResult == null) return false;
        if (n < 0) return false;
        if (n < 9) return lIIllllI.IIIII(minecraftClient, this, n, () -> {
            lIIllllI.IIIlIlI(minecraftClient);
            ActionResult actionResult = lIIllllI.IllllIl(minecraftClient, Hand.MAIN_HAND, blockHitResult);
            if (actionResult == null) return false;
            if (actionResult.isAccepted()) return true;
            return false;
        });
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void IlIll(MinecraftClient var1_1) {
        if (this.llIl == lIlIlIlI.I) {
            return;
        }
        if (var1_1 == null || var1_1.player == null || var1_1.world == null) ** GOTO lbl37
        var2_2 = System.currentTimeMillis();
        if (var2_2 - this.Illl > 5000L) ** GOTO lbl35
        if (this.lI) {
            this.IlI(var1_1);
            return;
        }
        if (this.I) ** GOTO lbl33
        var4_3 = var2_2 - this.IIlIl;
        var6_4 = this.IlIII;
        switch (this.llIl.ordinal()) {
            default: {
                return;
            }
            case 5: {
                if (var4_3 < var6_4) return;
                ** GOTO lbl31
            }
            case 4: {
                if (var4_3 < var6_4) return;
                ** break;
            }
            case 6: {
                if (var4_3 < var6_4) return;
                this.lIll(var1_1);
                return;
            }
            case 3: {
                if (var4_3 < var6_4) return;
                this.lIl(var1_1);
                return;
            }
lbl29:
            // 1 sources

            this.lIl(var1_1);
            return;
lbl31:
            // 1 sources

            this.lIl(var1_1);
            return;
lbl33:
            // 1 sources

            this.lIlIl(var1_1);
            return;
lbl35:
            // 1 sources

            this.lll();
            return;
lbl37:
            // 1 sources

            this.lll();
            return;
            case 1: {
                this.IllI(var1_1);
                return;
            }
            case 2: 
        }
        if (var4_3 < var6_4) return;
        this.lIl(var1_1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockHitResult IllII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return null;
        if (minecraftClient.world == null) {
            return null;
        }
        BlockHitResult blockHitResult = this.lII(minecraftClient);
        if (blockHitResult != null && this.lIl != null && this.lIl.equals((Object)blockHitResult.getBlockPos()) && minecraftClient.world.getBlockState(blockHitResult.getBlockPos()).isOf(Blocks.RESPAWN_ANCHOR)) {
            this.l = blockHitResult;
            return blockHitResult;
        }
        if (this.l == null) return null;
        if (this.lIl == null) return null;
        if (!this.lIl.equals((Object)this.l.getBlockPos())) return null;
        if (!minecraftClient.world.getBlockState(this.lIl).isOf(Blocks.RESPAWN_ANCHOR)) return null;
        BlockHitResult blockHitResult2 = this.l;
        return blockHitResult2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlllI() {
        this.ll = null;
        this.IlIIl = null;
        this.IIII = Integer.MIN_VALUE;
        this.IIl = Integer.MIN_VALUE;
        this.IIlI = 0L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean Illll() {
        if (this.llIl == lIlIlIlI.I) return false;
        return true;
    }

    private int lIIIl(PlayerEntity playerEntity) {
        int n = 0;
        while (true) {
            if (n < 9) {
                if (this.lIlI(playerEntity.getInventory().getStack(n))) {
                    return n;
                }
            } else {
                return -1;
            }
            ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private long lIIlI(IIIlIlIIl iIIlIlIIl) {
        double d = iIIlIlIIl.IIIl();
        double d2 = iIIlIlIIl.IIII();
        if (d != d2) return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d, d2) * 0.8));
        return Math.max(0L, Math.round(d * 0.8));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        boolean bl;
        block11: {
            block8: {
                block10: {
                    block9: {
                        block7: {
                            if (this.IIIlIIl() && minecraftClient.player != null && minecraftClient.player.isAlive()) {
                                this.IIl(minecraftClient);
                                this.IIlI(minecraftClient);
                                this.IIIII(minecraftClient);
                                bl = minecraftClient.options.useKey.isPressed();
                                if (this.llIl == lIlIlIlI.I && this.IllI.lIl() == llIlllII.lI && this.lllI(minecraftClient, bl)) {
                                    return;
                                }
                            } else {
                                this.IlII();
                                return;
                            }
                            if (!this.lI(minecraftClient)) break block7;
                            if (this.llIl == lIlIlIlI.I) break block8;
                            break block9;
                        }
                        if (this.llIl != lIlIlIlI.I) {
                            lIIllllI.IIIlIlI(minecraftClient);
                            this.IlIll(minecraftClient);
                            return;
                        }
                        break block10;
                    }
                    this.lll();
                    this.IIlII = true;
                    break block8;
                }
                if (this.IIlII || this.IIIlI) {
                    if (bl) {
                        lIIllllI.llIlIl(minecraftClient.options.useKey);
                        return;
                    }
                    this.IIlII = false;
                    this.IIIlI = false;
                }
                break block11;
            }
            lIIllllI.llIlIl(minecraftClient.options.useKey);
            return;
        }
        if (this.IllI.lIl() != llIlllII.l) {
            if ((Boolean)this.IIllI.lIl() == false) return;
            if (!bl) return;
            if (!minecraftClient.player.isUsingItem()) return;
            BlockHitResult blockHitResult = this.lII(minecraftClient);
            if (blockHitResult == null) return;
            if (!this.llII(minecraftClient, blockHitResult.getBlockPos())) return;
            this.IIlIl(minecraftClient, blockHitResult.getBlockPos(), this.IIllI(minecraftClient, blockHitResult.getBlockPos()));
            return;
        }
        BlockHitResult blockHitResult = this.lII(minecraftClient);
        if (blockHitResult == null) return;
        if (!this.llII(minecraftClient, blockHitResult.getBlockPos())) return;
        this.IIlIl(minecraftClient, blockHitResult.getBlockPos(), this.IIllI(minecraftClient, blockHitResult.getBlockPos()));
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lIIll(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult) {
        if (!this.IIIlIIl()) return false;
        if (this.llIl != lIlIlIlI.I) return false;
        if (this.lI(minecraftClient)) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world != null) {
            if (hand != Hand.MAIN_HAND) return false;
            if (blockHitResult == null) return false;
            if (blockHitResult.getType() != HitResult.Type.BLOCK) {
                return false;
            }
        } else {
            return false;
        }
        if (this.IIlII) return false;
        if (this.IIIlI) return false;
        if (this.llII(minecraftClient, blockHitResult.getBlockPos())) return this.IIlIl(minecraftClient, blockHitResult.getBlockPos(), this.IIllI(minecraftClient, blockHitResult.getBlockPos()));
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void lIlII(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult) {
        if (this.IIlll != null) return;
        if (!this.IIIlIIl()) return;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.world == null) return;
        if (hand == null) return;
        if (blockHitResult == null) return;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return;
        if (!minecraftClient.player.getStackInHand(hand).isOf(Items.RESPAWN_ANCHOR)) {
            return;
        }
        BlockPos blockPos = blockHitResult.getBlockPos();
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (blockState.isOf(Blocks.RESPAWN_ANCHOR)) {
            return;
        }
        BlockPos blockPos2 = blockState.isReplaceable() ? blockPos : blockPos.offset(blockHitResult.getSide());
        if (!minecraftClient.world.getBlockState(blockPos2).isReplaceable()) return;
        this.IIlll = blockPos2.toImmutable();
        this.IlIl = minecraftClient.player.age + 20;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.world == null) return;
        if (minecraftClient.options == null) return;
        if (minecraftClient.options.useKey != null) {
            this.IIIII(minecraftClient);
            if (!minecraftClient.options.useKey.isPressed()) {
                if (lIIllllI.IIl(minecraftClient.options.useKey) <= 0) return;
            }
            this.lIII(minecraftClient);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.world == null || this.lIl == null) {
            this.lll();
            return;
        }
        if (minecraftClient.world.getBlockState(this.lIl).isOf(Blocks.RESPAWN_ANCHOR)) {
            if (minecraftClient.player.age <= this.lII) return;
            this.I = false;
            this.lII = Integer.MIN_VALUE;
            this.Il = null;
            this.IlIII(lIlIlIlI.III);
            return;
        }
        BlockHitResult blockHitResult = this.Il;
        this.I = false;
        this.lII = Integer.MIN_VALUE;
        this.Il = null;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (blockHitResult != null && clientEntrypoint != null && clientEntrypoint.IlI() != null && clientEntrypoint.IlI().IIlIIll() != null) {
            clientEntrypoint.IlI().IIlIIll().lIlI(minecraftClient, blockHitResult);
        }
        this.IlIII(lIlIlIlI.lI);
    }

    private static int lIllI(int n, int n2) {
        return IlIlI[n ^ 0x9E5BDEBF] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 18225;
        String string = "\u9bd6\u9c07\u9cc5\u9bf2\u9ccd\u9bff\u9c07\u9c07\u9be6\u9be5\u9bda\u9c00\u9bef\u9bf7\u9c16\u9bf2\uc5e8\uc61b\uc5e5\uc6cb\uc6d0\uc5f9\uc5e7\uc6cd\uc5ec\uc5eb\uc6d0\uc60a\uc5f9\uc5f1\uc61c\uc5f8\u01dc\u021c\u01df\u01fd\u02d1\u02cf\u021c\u020a\u01ec\u01eb\u02d0\u020a\u01f9\u01f1\u021c\u01f8\ue567\ue576\ue555\ue57a\ude44\ue56b\ue573\ue589\ue587\ue587\ue556\ue553\ue579\ue573\ue56f\ue576\ue577\ue558\ue5a2\ue5a2\u383f\u3835\u381f\u380d\u382e\u3811\u382d\u381b\u3822\u383d\u3814\u381e\u3810\u3830\u380a\u380a\u1ecf\u1deb\u1e02\u1df3\u1ddd\u1ecc\u1de6\u1df1\u1de6\u1df6\u1df1\u1def\u1df5\u1dee\u1e0a\u1df2\u1e02\u1ec4\u1de4\u1dd6\u1ddc\u1de9\u1ddb\u1deb\u1df1\u1e0f\u1de1\u1dd5\u1de6\u1df6\u1df3\u1df2\u1de7\u1de6\u1ecb\u1dd3\u1de5\u1ecc\u1e05\u1de5\u1e05\u1deb\u1ec3\u1de0\u1ddd\u1df6\u1df0\u1dd3\u1df1\u1def\u1de0\u1dd5\u1dfc\u1dee\u1de3\u1e0a\u1de7\u1ecc\u1ddd\u1e09\u1e05\u1de0\u1e06\u1df1\u1de8\u1e10\u1dee\u1dfc\u1e04\u1de1\u1e17\u1e17\u69d4\u6a1f\u69f9\u6acf\u6acc\u69e5\u69d3\u6ad1\u69f0\u69e4\u6a28\u6a28\ue451\ue391\ue44e\ue370\ue35c\ue35e\ue391\ue363\ue365\ue44f\ue399\ue399\u136a\u139d\u1363\u137b\u144f\u136b\u1445\u135f\u137b\u1387\u1378\u137c\u136e\u138a\u1396\u1396\ub4fd\ub4da\ub500\ub52e\u4bda\u4c1a\u4cc5\u4bf7\u4bd3\u4bd5\u4c1a\u4bec\u4c0a\u4c09\u4bd6\u4bec\u4bfb\u4bf3\u4c1a\u4bfe\u172d\u172a\u1730\u16fe\u68de\u68ff\u68e0\u68eb\u69d1\u68fa\u6902\u68fc\u68fe\u68fe\u68df\u68e2\u68ec\u6902\u68e6\u68ff\u68ee\u69cd\u6913\u6913\uef71\uef56\uef6c\uefc2\u709c\u70c1\u70a2\u70ad\u708f\u70b8\u70c0\u70be\u70bc\u70bc\u70a1\u708f\u70b8\u70b0\u70b8\u70a4\ud95f\ud9a0\ud953\ud97c\ud24b\ud981\ud957\ud993\ud982\ud965\ud995\ud971\ud96f\ud9a0\ud95a\ud9a8\u78d7\u790e\u79d1\u78dd\u78e0\u7907\u79cc\u78f1\u78ef\u78fa\u7920\u78f8\u9154\u9194\u916e\uaa4f\u91a1\u9164\u9158\u918a\u9173\u9168\u9181\u9187\u9165\uaa4d\u9155\u919b\uc0bd\uc09a\uc0c0\uc06e\u033c\u02dc\u0340\u0340\u2922\u2925\u291b\u29d1";
        char[] cArray = "\u4721\u4721\u4721\u4725\u4721\u4779\u473d\u473d\u4721\u4735\u4721\u4735\u4725\u4735\u4721\u4721\u473d\u4721\u4735\u4735\u4735".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                IlIll = stringArray;
                IllII = new Object[stringArray.length];
                int n6 = -685500569;
                byte[] byArray = "\u00a6\u00ad\t\u0001\u0095\u0093\u00d6\u00d7\u0098U\u00a1J\u00c7b\u00ee0X\u00ac\u00b2\u0013$\u00d5\u0098\u00bc\u00cc\u0003,\u0080\u001f\u00fe~\u009f_\u00ea\u00b9+\u00bd\u0090\u0092\u00ab\u00b09z\"7\u0010%\u00a7\u00a6\u0087<\u00f8\u00d5\u0099\u00b2\u00b2)\u0010U/:\u00b1\ni\u009f)^x\u008dy\u00ac\u00ed-\u0016\u0013A\u00b7u\u00b3`C\u00ff\u00f7w+\u009c\u00b4\u00db\u00a0\u00ca\u00c8\u00dd\u00d2&\u00db\u00c2\u0091\u00efM\u00db\u00ebi\u0080(\u009a\u00d9\u00cf\u00ff\u0097\u00d04#".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                IlIlI = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    FastAnchor.IlIlI[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
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
    private static String llIII(int n, char c, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0x9E06;
        char[] cArray = IlIll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IllII[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            FastAnchor.IllII[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7EB3;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 64979;
            n6 ^= 0xC7A;
            n6 -= 59916;
            n6 ^= 0x9C91;
            cArray[n5] = (char)((n6 ^= 0x43EE) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

