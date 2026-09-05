/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIlIlI
 * Module         : AutoHitCrystal  [COMBAT]
 * Description    : Places an obsidian & a crystal when hitting the ground   (client's own text)
 *
 * Recovered strings in this class:
 *   - Crystal Place Delay
 *   - Obby Place Delay
 *   - Explode Delay
 *   - Action Delay
 *   - Switch Delay
 *   - Sword Start
 *   - .getBytes(
 *   - _sword
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
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.registry.Registries
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 */
package orchard.module.combat;

import com.google.gson.JsonObject;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IIllIIIIl;
import orchard.internal.IlIlllI;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.llIIII;
import orchard.internal.llIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class AutoHitCrystal
extends ModuleBase {
    private long I;
    private int l;
    private static final double II = 0.1;
    private final llIll Il;
    private BlockHitResult lI;
    private boolean ll;
    private long III;
    private int IIl;
    private final llIll IlI;
    private boolean Ill;
    private long lII;
    private boolean lIl;
    private HitResult llI;
    private long lll;
    private static final int IIII = 1;
    private final IIIlIlIIl IIIl;
    private boolean IIlI;
    private static final long IIll = 1000L;
    private BlockHitResult IlII;
    private final IIIIIIIIl<llIIII> IlIl;
    private long IllI;
    private BlockPos Illl;
    private final llIll lIII;
    private final IIIlIlIIl lIIl;
    private static final int lIlI = 9;
    private llIlIIlI lIll;
    private final llIll llII;
    private long llIl;
    private static final IIIlIIIII lllI;
    private int llll;
    private int IIIII;
    private static final int[] IIIIl;
    private static final String[] IIIlI;
    private static final Object[] IIIll;

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 1783;
        String string = "\u8b34\u8b89\u8bea\u8b5a\u8b1e\u8b93\u8b1f\u8be9\u8b15\u8b59\u8b79\u8b61\u8b6f\u8baf\u8bb6\u8bd0\ufe23\ufef4\ufed3\ufe6c\ufe08\ufe90\ufe26\ufec6\ufe06\ufe4a\ufe6a\ufe72\ufe7c\ufebc\ufea5\ufec3\ud6d7\ud604\ud636\ud6ae\ud6f8\ud675\ud6cb\ud63f\ud6ea\ud6bd\ud6c0\ud685\ud68b\ud663\ud658\ud64a\ud6b9\ud6f3\ud6d6\ud676\ud6e9\ud648\ud6b1\ud65c\ua3c2\ua311\ua322\ua3a3\ua3ee\ua340\ua382\ua312\ua3fe\ua3ad\ua39f\ua3aa\ua399\ua359\ua340\ua306\ua3ad\ua3e3\ua3bd\ua332\ua3f8\ua31e\ua3cb\ua323\ua31a\ua3df\ua399\ua330\u1f4e\u1ff3\u1f8f\u1f27\u1f60\u1ffa\u1f66\u1f9e\u1f7f\u1f32\u1f10\u1f31\u1f10\u1fc6\u1fb4\u1fb1\u1f27\u1f7b\u1f5f\u1fb6\ue721\ue7f7\ue7fa\ue74f\ue709\ue7a6\ue721\ue7f7\ud2ce\ud270\ud232\ud2a0\ud2e3\ud241\ud2f9\ud22c\ud2f8\ud2a3\ud2c1\ud28e\ud292\ud246\ud201\ud225\ud2a6\ud2eb\ud2d9\ud235\ubb3f\ubb96\ubbe9\ubb42\ubb13\ubbb6\ubb32\ubbf9\ubb1a\ubb50\ubb2d\ubb67\ubb71\ubba0\ubbce\ubbfc\ubb5f\ubb24\ubb66\ubb9c\ubb00\ubbe7\ubb0c\ubbed\ubbf1\ubb39\ubb2d\ubbae\ubbe7\ubbd6\ubbad\ubb1b\ubb26\ubb8e\ubbc6\ubb59\ubb29\ubb9f\ubb7d\ubbda\ubb31\ubb7d\ubb72\ubb6c\ubb49\ubbbc\ubbfe\ubbfd\ubb52\ubb3c\ubb21\ubbb8\ubb2f\ubb98\ubb55\ubbcb\ubbda\ubb35\ubb36\ubb96\ubb83\ubb87\ubb9a\ubb18\ubb20\ubbe8\ubbdb\ubb76\ubb14\ubb9c\ubb2e\ubbe8\ufb76\ufbdf\ufb91\ufb3a\ufb5a\ufbfc\ufb35\ufba5\ufb44\ufb34\ufb2c\ufb41\ufb2a\ufb95\ufbb2\ufbb7\ue28d\ue25a\ue27d\ue2f0\ue2a5\ue23a\ue294\ue274\ue2bb\ue2f2\ue2ee\ue2d8\ue2d5\ue209\ue203\ue211\u3a37\u3a90\u3af7\u3a3c\u7944\u79ed\u7992\u7939\u7968\u79cd\u7946\u799f\u7940\u792b\u7909\u7924\u791a\u79c8\u79ae\u79d8\ub1fb\ub15c\ub13b\ub1f0\ua4ab\ua478\ua460\ua4dc\ua484\ua409\ua4b7\ua419\ua496\ua4ef\ua4f7\ua4db\ua4f4\ua40b\ua45f\ua442\ua4c7\ua49f\ua4e6\ua451\u601b\u60b1\u60d2\u6072\u6037\u60bb\u603c\u60c3\u6021\u6042\u6051\u604d\u6042\u60a2\u60d8\u6084\u4c1f\u4cc8\u4cef\u4c56\u4c37\u4c86\u4c5a\u4cc4\u4c26\u4c45\u4c56\u4c4a\u4c45\u4ca5\u4cdf\u4c83\uf71e\uf7a0\uf7e2\uf770\uf733\uf7da\uf703\uf7e0\uf729\uf776\uf743\uf77a\uf745\uf7fa\uf7dd\uf7d8";
        char[] cArray = "\u06e7\u06e7\u06ef\u06eb\u06e3\u06ff\u06e3\u06bf\u06e7\u06e7\u06f3\u06e7\u06f3\u06e3\u06e7\u06e7\u06e7".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
        IIIlI = stringArray;
        IIIll = new Object[stringArray.length];
        int n6 = 278178738;
        byte[] byArray = "|X\u000bRSY\u009b\u00be\u009bh\u00ef\u00cc\u00d3\u0082n\u0094\u00c4\u00d5-\u00a5\u00db-\u00a6\u0085".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IIIIl = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            AutoHitCrystal.IIIIl[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        lllI = StringFactory.IIII("Action Delay");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static Vec3d I(Vec3d vec3d, Box box) {
        return new Vec3d(MathHelper.clamp((double)vec3d.x, (double)box.minX, (double)box.maxX), MathHelper.clamp((double)vec3d.y, (double)box.minY, (double)box.maxY), MathHelper.clamp((double)vec3d.z, (double)box.minZ, (double)box.maxZ));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean l(MinecraftClient minecraftClient) {
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
    private void lI(MinecraftClient minecraftClient) {
        if (this.Illl != null && minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null) {
            if (this.IlIIl(minecraftClient, this.Illl)) {
                this.lIll = llIlIIlI.lI;
                this.lI = this.IlIII(this.Illl);
                this.III = System.currentTimeMillis();
                this.IIl(minecraftClient);
                if (this.lIll != llIlIIlI.III) return;
                this.lIll(minecraftClient);
                return;
            }
            if (minecraftClient.player.age <= this.l) return;
            this.IIIlI();
            return;
        }
        this.IIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(MinecraftClient minecraftClient) {
        if (this.Illl != null && this.llll >= 0) {
            this.lI = this.IlIII(this.Illl);
        }
        this.IIIlI();
        return;
        this.IIlI = lIIllllI.lllI(minecraftClient.player.getInventory()) != this.llll;
        this.III = System.currentTimeMillis() + (!this.IIlI ? 0L : this.IIlII(this.IIIl)) + this.IIlII(this.lIIl);
        this.lIll = llIlIIlI.III;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.options == null) {
            return;
        }
        if (minecraftClient.options.attackKey != null) {
            lIIllllI.llIlIl(minecraftClient.options.attackKey);
            minecraftClient.options.attackKey.setPressed(false);
        }
        if (minecraftClient.options.useKey == null) return;
        lIIllllI.llIlIl(minecraftClient.options.useKey);
        minecraftClient.options.useKey.setPressed(false);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lII(MinecraftClient minecraftClient, BlockPos blockPos) {
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (blockState.isOf(Blocks.OBSIDIAN)) return false;
        if (blockState.isOf(Blocks.BEDROCK)) return false;
        if (blockState.isOf(Blocks.RESPAWN_ANCHOR)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIl() {
        if (lIIllllI.lIIllI() != this.lII) return true;
        if (lIIllllI.IIllI() != this.IllI) return true;
        if (!lIIllllI.IIlllI(MinecraftClient.getInstance())) return false;
        return true;
    }

    private long llI() {
        return 1000L + 2L * this.lIII(this.IIIl) + 3L * this.lIII(this.lIIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private EndCrystalEntity lll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return null;
        if (minecraftClient.world == null) return null;
        if (this.Illl == null) {
            return null;
        }
        Box box = new Box(this.Illl.up()).expand(1.0);
        EndCrystalEntity endCrystalEntity = null;
        double d = Double.MAX_VALUE;
        Vec3d vec3d = Vec3d.ofCenter((Vec3i)this.Illl.up());
        Iterator iterator = minecraftClient.world.getOtherEntities(null, box, entity -> entity instanceof EndCrystalEntity).iterator();
        while (iterator.hasNext()) {
            double d2;
            EndCrystalEntity endCrystalEntity2;
            Entity entity2 = (Entity)iterator.next();
            if (!(entity2 instanceof EndCrystalEntity) || (endCrystalEntity2 = (EndCrystalEntity)entity2).isRemoved() || !((d2 = endCrystalEntity2.getBoundingBox().getCenter().squaredDistanceTo(vec3d)) < d)) continue;
            d = d2;
            endCrystalEntity = endCrystalEntity2;
        }
        return endCrystalEntity;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IIII(MinecraftClient minecraftClient, EndCrystalEntity endCrystalEntity) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (endCrystalEntity == null) return null;
        if (endCrystalEntity.isRemoved()) {
            return null;
        }
        Vec3d vec3d = this.IllII(minecraftClient);
        Box box = endCrystalEntity.getBoundingBox();
        Vec3d vec3d2 = AutoHitCrystal.I(vec3d, box);
        double d = minecraftClient.player.getEntityInteractionRange();
        double d2 = d - 0.1;
        if (d2 <= 0.0) return null;
        if (!(vec3d.squaredDistanceTo(vec3d2) > d2 * d2)) return vec3d2.lerp(box.getCenter(), 1.0E-4);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlI(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) {
            return false;
        }
        ItemStack itemStack = clientPlayerEntity.getMainHandStack();
        if (itemStack.isEmpty()) {
            return true;
        }
        if (itemStack.isOf(Items.END_CRYSTAL)) return true;
        if (itemStack.isOf(Items.OBSIDIAN)) {
            return true;
        }
        if (((Boolean)this.lIII.lIl()).booleanValue() && this.llIl(clientPlayerEntity)) {
            return true;
        }
        if ((Boolean)this.Il.lIl() == false) return false;
        if (!itemStack.isOf(Items.TOTEM_OF_UNDYING)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        this.lllI(minecraftClient);
        if (this.lIll != llIlIIlI.ll) {
            return;
        }
        this.IIIlI();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlII(MinecraftClient minecraftClient, BlockPos blockPos) {
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (!blockState.isAir()) {
            if (!blockState.isReplaceable()) return false;
        }
        if (!minecraftClient.world.getOtherEntities(null, new Box(blockPos)).isEmpty()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IllI(PlayerInventory playerInventory, Item item) {
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
    private void Illl(MinecraftClient minecraftClient) {
        if (!this.IlIlI(minecraftClient)) {
            return;
        }
        BlockHitResult blockHitResult = (BlockHitResult)minecraftClient.crosshairTarget;
        boolean bl = this.IlIIl(minecraftClient, blockHitResult.getBlockPos());
        BlockPos blockPos = bl ? blockHitResult.getBlockPos().toImmutable() : blockHitResult.getBlockPos().offset(blockHitResult.getSide()).toImmutable();
        PlayerInventory playerInventory = minecraftClient.player.getInventory();
        int n = bl ? -1 : this.IllI(playerInventory, Items.OBSIDIAN);
        int n2 = this.IllI(playerInventory, Items.END_CRYSTAL);
        this.IlI(minecraftClient);
        if (minecraftClient.player != null && minecraftClient.player.isUsingItem()) {
            minecraftClient.player.stopUsingItem();
        }
        this.llll = n2;
        this.Illl = blockPos;
        this.lI = this.IlIII(blockPos);
        this.IlII = !bl ? blockHitResult : null;
        this.I = System.currentTimeMillis();
        this.llIl = Long.MIN_VALUE;
        if (bl) {
            this.IIl(minecraftClient);
            if (this.lIll != llIlIIlI.III) return;
            this.lIll(minecraftClient);
            return;
        }
        this.IIl = n;
        this.ll = lIIllllI.lllI(minecraftClient.player.getInventory()) != n;
        this.llIl = System.currentTimeMillis() + (!this.ll ? 0L : this.IIlII(this.IIIl)) + this.IIlII(this.lIIl);
        this.lIll = llIlIIlI.I;
        this.IIllI(minecraftClient);
    }

    private long lIII(IIIlIlIIl iIIlIlIIl) {
        return Math.max(0L, Math.round(Math.max(iIIlIlIIl.IIIl(), iIIlIlIIl.IIII())));
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockHitResult lIIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        HitResult hitResult;
        if (minecraftClient == null || blockPos == null || !((hitResult = minecraftClient.crosshairTarget) instanceof BlockHitResult)) return null;
        BlockHitResult blockHitResult = (BlockHitResult)hitResult;
        if (blockHitResult.getType() != HitResult.Type.BLOCK || !blockPos.equals((Object)blockHitResult.getBlockPos())) return null;
        return blockHitResult;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlI(MinecraftClient minecraftClient, BlockPos blockPos) {
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (blockState.isAir()) return true;
        if (blockState.isReplaceable()) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIll(MinecraftClient minecraftClient) {
        if (IlIlllI.IIll()) return;
        if (this.lIl()) return;
        if (this.Illl == null) return;
        if (System.currentTimeMillis() < this.III) {
            return;
        }
        BlockHitResult blockHitResult = this.lI;
        if (blockHitResult == null) return;
        if (!this.lIl && !this.IlIIl(minecraftClient, blockHitResult.getBlockPos())) return;
        boolean[] blArray = new boolean[]{false};
        boolean bl = lIIllllI.IlIIIl(minecraftClient, this, this.llll, () -> {
            blArray[0] = true;
            return lIIllllI.lIllll(minecraftClient, blockHitResult);
        });
        if (!blArray[0]) {
            return;
        }
        if (!bl) {
            this.IIIlI();
            return;
        }
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
        if (((Boolean)this.IlI.lIl()).booleanValue()) {
            this.lIll = llIlIIlI.IIl;
            this.IIIII = minecraftClient.player.age + 1;
            this.lll = System.currentTimeMillis();
            return;
        }
        this.lIll = llIlIIlI.ll;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean llII() {
        if (this.lIll == llIlIIlI.Il) return false;
        return true;
    }

    @Override
    public void ll() {
        this.IIIlI();
    }

    @Override
    public void llll() {
        this.lllI(MinecraftClient.getInstance());
        this.IIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        if (!this.l(minecraftClient)) {
            this.lllI(minecraftClient);
            this.IIIlI();
            return;
        }
        this.lII = lIIllllI.lIIllI();
        this.IllI = lIIllllI.IIllI();
        if (((Boolean)this.llII.lIl()).booleanValue() && !minecraftClient.player.isOnGround()) {
            this.lllI(minecraftClient);
            this.IIIlI();
            return;
        }
        if (this.lIll == llIlIIlI.Il) {
            this.Illl(minecraftClient);
            return;
        }
        this.IlI(minecraftClient);
        if (minecraftClient.player != null && minecraftClient.player.isUsingItem()) {
            minecraftClient.player.stopUsingItem();
        }
        long l2 = System.currentTimeMillis();
        if (this.lIll != llIlIIlI.I) {
            if (this.lIll == llIlIIlI.l) {
                this.lI(minecraftClient);
                return;
            }
            if (this.lIll != llIlIIlI.lI || l2 < this.III) {
                if (this.lIll != llIlIIlI.III) {
                    if (this.lIll != llIlIIlI.IIl) return;
                    if (l2 < this.lll) return;
                    if (minecraftClient.player.age < this.IIIII) return;
                    this.IlllI(minecraftClient);
                    return;
                }
                this.lIll(minecraftClient);
                return;
            }
            this.IIl(minecraftClient);
            return;
        }
        this.IIllI(minecraftClient);
    }

    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        this.llllll(jsonObject, lllI.IIII(), this.IIIl, this.lIIl);
        this.llllll(jsonObject, "Switch Delay", this.IIIl);
        this.llllll(jsonObject, "Obby Place Delay", this.lIIl);
        this.llllll(jsonObject, "Crystal Place Delay", this.lIIl);
        this.llllll(jsonObject, "Explode Delay", this.lIIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIl(ClientPlayerEntity clientPlayerEntity) {
        ItemStack itemStack = clientPlayerEntity == null ? ItemStack.EMPTY : clientPlayerEntity.getMainHandStack();
        if (itemStack.isEmpty()) return false;
        if (!Registries.ITEM.getId((Object)itemStack.getItem()).getPath().endsWith("_sword")) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllI(MinecraftClient minecraftClient) {
        if (this.Ill && minecraftClient != null) {
            minecraftClient.crosshairTarget = this.llI;
        }
        this.llI = null;
        this.Ill = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlI() {
        this.lIll = llIlIIlI.Il;
        this.llIl = Long.MIN_VALUE;
        this.III = 0L;
        this.lll = 0L;
        this.I = 0L;
        this.IIIII = Integer.MIN_VALUE;
        this.llll = -1;
        this.Illl = null;
        this.IIl = -1;
        this.ll = false;
        this.lIl = false;
        this.l = Integer.MIN_VALUE;
        this.IIlI = false;
        this.IlII = null;
        this.lI = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIll(MinecraftClient minecraftClient) {
        BlockPos blockPos;
        if (orchard.internal.IIlI.IIl(minecraftClient)) return false;
        if (!this.IIlI(minecraftClient.player)) return false;
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof BlockHitResult)) return false;
        BlockHitResult blockHitResult = (BlockHitResult)hitResult;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) {
            return false;
        }
        boolean bl = this.IlIIl(minecraftClient, blockHitResult.getBlockPos());
        if (!bl && !this.lII(minecraftClient, blockHitResult.getBlockPos())) {
            return false;
        }
        BlockPos blockPos2 = blockPos = bl ? blockHitResult.getBlockPos().toImmutable() : blockHitResult.getBlockPos().offset(blockHitResult.getSide()).toImmutable();
        if (bl) {
            if (!this.IIlIl(minecraftClient, blockPos)) {
                return false;
            }
        } else {
            if (!this.lIlI(minecraftClient, blockPos)) return false;
            if (!this.IIlIl(minecraftClient, blockPos)) {
                return false;
            }
        }
        PlayerInventory playerInventory = minecraftClient.player.getInventory();
        if (!bl) {
            if (this.IllI(playerInventory, Items.OBSIDIAN) < 0) return false;
        }
        if (this.IllI(playerInventory, Items.END_CRYSTAL) >= 0) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private long IIlII(IIIlIlIIl iIIlIlIIl) {
        long l2;
        double d;
        double d2 = iIIlIlIIl.IIIl();
        if (d2 != (d = iIIlIlIIl.IIII())) {
            l2 = Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d2, d)));
            return l2;
        }
        l2 = Math.max(0L, Math.round(d2));
        return l2;
    }

    private boolean IIlIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        return this.IlII(minecraftClient, blockPos.up());
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void IIllI(MinecraftClient minecraftClient) {
        BlockHitResult blockHitResult;
        long l2 = System.currentTimeMillis();
        if (l2 < this.llIl) {
            return;
        }
        if (IlIlllI.IIll()) return;
        if (this.lIl()) return;
        BlockHitResult blockHitResult2 = this.IlII != null ? this.IlII : (blockHitResult = this.lIIl(minecraftClient, this.IlII == null ? null : this.IlII.getBlockPos()));
        if (blockHitResult != null) {
            if (this.IIl >= 0) {
                boolean[] blArray = new boolean[]{false};
                boolean bl = lIIllllI.IlIIIl(minecraftClient, this, this.IIl, () -> {
                    blArray[0] = true;
                    return lIIllllI.lIllll(minecraftClient, blockHitResult);
                });
                if (!blArray[0]) return;
                if (!bl) {
                    this.IIIlI();
                    return;
                }
                this.lIl = true;
                this.l = minecraftClient.player.age + 8;
                this.lIll = llIlIIlI.l;
                this.lI(minecraftClient);
                return;
            }
        }
        this.IIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlll(MinecraftClient minecraftClient, HitResult hitResult) {
        if (minecraftClient == null) return;
        if (hitResult != null) {
            if (!this.Ill) {
                this.llI = minecraftClient.crosshairTarget;
            }
            minecraftClient.crosshairTarget = hitResult;
            this.Ill = true;
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private BlockHitResult IlIII(BlockPos blockPos) {
        if (blockPos == null) {
            return null;
        }
        Vec3d vec3d = new Vec3d((double)blockPos.getX() + 0.5, (double)blockPos.getY() + 1.0, (double)blockPos.getZ() + 0.5);
        return new BlockHitResult(vec3d, Direction.UP, blockPos, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) return false;
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (blockState.isOf(Blocks.OBSIDIAN)) return true;
        if (blockState.isOf(Blocks.BEDROCK)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IlIlI(MinecraftClient minecraftClient) {
        if (!this.l(minecraftClient)) return false;
        if (this.lIll != llIlIIlI.Il) return false;
        if (((Boolean)this.llII.lIl()).booleanValue() && !minecraftClient.player.isOnGround()) {
            return false;
        }
        boolean bl = minecraftClient.options.attackKey.isPressed() || lIIllllI.IIl(minecraftClient.options.attackKey) > 0;
        boolean bl2 = minecraftClient.options.useKey.isPressed() || lIIllllI.IIl(minecraftClient.options.useKey) > 0;
        llIIII llIIII2 = (llIIII)((Object)this.IlIl.lIl());
        if (llIIII2 != llIIII.Il) {
            if (bl2) return this.IIIll(minecraftClient);
            return false;
        }
        if (bl) return this.IIIll(minecraftClient);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (this.lIll == llIlIIlI.Il) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (this.l(minecraftClient)) {
            if (l2 - this.I <= this.llI()) return;
        }
        this.IIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    public AutoHitCrystal() {
        super(StringFactory.IIII("AutoHitCrystal"), Category.II, StringFactory.IIII("Places an obsidian & a crystal when hitting the ground"));
        llIll llIll2;
        llIll llIll3;
        IIIlIlIIl iIIlIlIIl;
        IIIIIIIIl<llIIII> iIIIIIIIl;
        iIIIIIIIl(StringFactory.IIII("rIZdmx5SQly6B5tc"), llIIII.class, llIIII.l);
        this.IlIl = this.IIlllIl(iIIIIIIIl);
        iIIlIlIIl(StringFactory.IIII("q4NVjFlzVRCWEQ=="), 0.0, 0.0, 0.0, 300.0, 5.0);
        this.IIIl = this.IIlllIl(iIIlIlIIl.IIll(StringFactory.IIII("ms")));
        this.lIIl = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("qJhVnxwXdBmbCYY="), 0.0, 0.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.llII = this.IIlllIl(new llIll((Object)StringFactory.IIII("t5pYhVl4XlywGpBMAdc="), true));
        llIll3((Object)StringFactory.IIII("rJtAmRQXYwiWGos="), true);
        this.Il = this.IIlllIl(llIll3);
        this.lIII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Sword Start"), true));
        llIll2((Object)StringFactory.IIII("uYFAk1lySAybB5tc"), true);
        this.IlI = this.IIlllIl(llIll2);
        this.lIll = llIlIIlI.Il;
        this.llIl = Long.MIN_VALUE;
        this.IIIII = Integer.MIN_VALUE;
        this.llll = -1;
        this.IIl = -1;
        this.l = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IllII(MinecraftClient minecraftClient) {
        Vec3d vec3d;
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        Vec3d vec3d2 = clientPlayerEntity.getEyePos();
        Vec3d vec3d3 = new Vec3d(clientPlayerEntity.getX(), clientPlayerEntity.getY(), clientPlayerEntity.getZ());
        vec3d(IIllIIIIl.IlI(clientPlayerEntity), IIllIIIIl.lIII(clientPlayerEntity), IIllIIIIl.IIlI(clientPlayerEntity));
        return vec3d.add(vec3d2.subtract(vec3d3));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IllIl(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (this.Illll()) return true;
        if (!this.IlIlI(minecraftClient)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlllI(MinecraftClient minecraftClient) {
        block4: {
            EntityHitResult entityHitResult;
            block6: {
                HitResult hitResult;
                block7: {
                    HitResult hitResult2;
                    block5: {
                        if (minecraftClient == null) return;
                        if (minecraftClient.player == null) {
                            return;
                        }
                        EndCrystalEntity endCrystalEntity = this.lll(minecraftClient);
                        if (endCrystalEntity == null || endCrystalEntity.isRemoved()) {
                            this.lll = System.currentTimeMillis();
                            return;
                        }
                        hitResult2 = minecraftClient.crosshairTarget;
                        if (hitResult2 instanceof EntityHitResult && (entityHitResult = (EntityHitResult)hitResult2).getEntity() != endCrystalEntity) break block4;
                        entityHitResult = null;
                        hitResult = minecraftClient.crosshairTarget;
                        if (hitResult instanceof EntityHitResult && (hitResult2 = (EntityHitResult)hitResult).getEntity() == endCrystalEntity) break block5;
                        hitResult = lIIllllI.lI(minecraftClient, minecraftClient.player.getEntityInteractionRange());
                        if (hitResult == null || hitResult.getEntity() != endCrystalEntity) break block6;
                        break block7;
                    }
                    entityHitResult = hitResult2;
                    break block6;
                }
                entityHitResult = hitResult;
            }
            if (entityHitResult == null) {
                this.lll = System.currentTimeMillis();
                return;
            }
            this.lll = System.currentTimeMillis();
            if (!lIIllllI.IIlllll(minecraftClient, entityHitResult)) {
                this.IIIII = minecraftClient.player.age + 1;
                return;
            }
            this.IIIlI();
            return;
        }
        this.lll = System.currentTimeMillis();
    }

    public boolean Illll() {
        return this.llII();
    }

    private static int lIIIl(int n, int n2) {
        return IIIIl[n ^ 0x1A065506] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lIIlI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xEAEB3E9A;
        char[] cArray = IIIlI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIIll[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            AutoHitCrystal.IIIll[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2BF759D3;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 29 -> 46;
                default -> 222;
                case 19 -> 109;
                case 6 -> 218;
                case 25 -> 231;
                case 3 -> 132;
                case 1 -> 76;
                case 2 -> 17;
                case 17 -> 250;
                case 30 -> 124;
                case 18 -> 132;
                case 14 -> 28;
                case 20 -> 252;
                case 7 -> 44;
                case 23 -> 28;
                case 15 -> 14;
                case 5 -> 94;
                case 28 -> 33;
                case 4 -> 237;
                case 21 -> 66;
                case 9 -> 130;
                case 13 -> 122;
                case 27 -> 100;
                case 24 -> 39;
                case 12 -> 178;
                case 10 -> 143;
                case 22 -> 241;
                case 31 -> 237;
                case 26 -> 205;
                case 16 -> 135;
                case 8 -> 207;
                case 11 -> 173;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

