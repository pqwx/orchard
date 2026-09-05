/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIlIlll
 * Module         : Click Crystal  [COMBAT]
 * Description    : Speeds up repeated block placement without changing attacks or crystal interactions.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Obby Crystal Switch
 *   - .getBytes(
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
 *  net.minecraft.block.Blocks
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.Entity$RemovalReason
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.combat;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IlIlllI;
import orchard.internal.IlllIlI;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class ClickCrystal
extends ModuleBase {
    private static String[] I;
    private Vec3d l;
    private Direction II;
    private boolean Il;
    private boolean lI;
    private boolean ll;
    private HitResult III;
    private boolean IIl;
    private final IIIIIIIIl<IlllIlI> IlI = this.IIlllIl(new IIIIIIIIl<IlllIlI>(StringFactory.IIII("Mode"), IlllIlI.class, IlllIlI.II));
    private boolean Ill;
    private final llIll lII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Obby Crystal Switch"), false));
    private boolean lIl;
    private boolean llI;
    private int lll = Integer.MIN_VALUE;
    private BlockPos IIII;
    private int IIIl = Integer.MIN_VALUE;
    private static final int[] IIlI;
    private static final String[] IIll;
    private static final Object[] IlII;

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.crosshairTarget == null) return false;
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof BlockHitResult)) return false;
        BlockHitResult blockHitResult = (BlockHitResult)hitResult;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return false;
        if (this.IlIIl(blockHitResult.getBlockPos(), minecraftClient)) return true;
        return false;
    }

    private void IIl(MinecraftClient minecraftClient) {
        if (minecraftClient != null) {
            minecraftClient.crosshairTarget = this.III;
        }
        this.III = null;
        this.ll = false;
        this.llI = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IlI(BlockPos blockPos, Direction direction) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIIlIIl()) return false;
        if (!this.lll(minecraftClient)) return false;
        if (blockPos == null) return false;
        if (direction == null) return false;
        if (!this.IlIIl(blockPos, minecraftClient)) {
            return false;
        }
        minecraftClient.interactionManager.cancelBlockBreaking();
        if (!this.IIlII(minecraftClient)) {
            return true;
        }
        if (!this.IIIlI(minecraftClient.player, Items.END_CRYSTAL)) {
            return this.IIllI(minecraftClient);
        }
        if (!this.lIIlI(minecraftClient, blockPos, direction)) return true;
        this.IlIII(minecraftClient);
        lIIllllI.IlIlllI(minecraftClient, this, 0);
        return true;
    }

    @Override
    public void llll() {
        this.IIl(MinecraftClient.getInstance());
        this.lII();
        this.lIlII();
        this.IIIl = Integer.MIN_VALUE;
    }

    private void lII() {
        if (this.lI) {
            lIIllllI.llIll(MinecraftClient.getInstance());
            this.lI = false;
        }
        this.ll = false;
        this.llI = false;
        this.III = null;
        this.Il = false;
        this.lll = Integer.MIN_VALUE;
        this.lIl = false;
        this.Ill = false;
    }

    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        this.lllI(minecraftClient);
        this.IIIII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lIl(BlockPos blockPos, Direction direction) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.Illll(minecraftClient, blockPos, direction)) {
            return false;
        }
        if (this.IIlII(minecraftClient)) {
            boolean bl = this.lIIlI(minecraftClient, blockPos, direction);
            if (!bl) return bl;
            this.IlIII(minecraftClient);
            lIIllllI.IlIlllI(minecraftClient, this, 0);
            return bl;
        }
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block17: {
                block14: {
                    block18: {
                        block15: {
                            block16: {
                                block13: {
                                    break block16;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        continue;
lbl3:
                                        // 1 sources

                                        while (++var10_4 >= var8_2.length) {
                                            break block13;
                                        }
                                        break block14;
lbl6:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        break;
                                    }
lbl8:
                                    // 1 sources

                                    while (true) {
                                        var4_12 = 0;
                                        break block15;
                                        break;
                                    }
lbl11:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        ClickCrystal.I = new String[4];
                                        ClickCrystal.IlIll();
                                        return;
                                    }
                                }
                                var13_7 = 0;
                                ** GOTO lbl11
lbl20:
                                // 1 sources

                                while (true) {
                                    var3_11 = 0;
                                    ** continue;
                                    break;
                                }
lbl23:
                                // 1 sources

                                while (true) {
                                    continue;
lbl25:
                                    // 1 sources

                                    while (true) {
                                        var1_9 = var0_8.length / 4;
                                        ClickCrystal.IIlI = new int[var1_9];
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var6 = 10219;
                            break block17;
                            ClickCrystal.IlII = new Object[var9_3.length];
                            var2_10 = 521632202;
                            break block18;
lbl35:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl37:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                            var12_6 = 0;
                            if (var13_7 != 0) break block14;
                            break block19;
lbl42:
                            // 1 sources

                            while (true) {
                                ** GOTO lbl3
                                break;
                            }
                        }
lbl45:
                        // 2 sources

                        while (true) {
                            var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
                            ** continue;
                            break;
                        }
                    }
                    var0_8 = "\u008a\u00a2\u00edek\u00c1\u0002\u00e6R\u0087\b\u0000R]\u00c6\u0003\te\u00fbg!Z\u00f5\u00a0\u00b9_\u00f2\u0018~\u008eo\u00bf;\u0090i\u00cb\u00adV\u0090\u0089\u00bc\u0091p\u00e0\u00d5\u0092]\u001aG\u00be\"s[\u00f5K\u00e7".getBytes("ISO-8859-1");
                    ** while (true)
                    var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                    var11_5 += var12_6;
                    ** while (true)
                    ClickCrystal.IIlI[var4_12] = var5_13 ^= var2_10;
                    var3_11 += 4;
                    ** while (++var4_12 < var1_9)
lbl57:
                    // 1 sources

                    ** while (true)
                }
                var12_6 = var8_2[var10_4] ^ var6;
                ** while (true)
                var10_4 = 0;
                var11_5 = 0;
                ** while (true)
            }
            var7_1 = "\ua3d2\u2277\ueb4e\u3517\u1394\u544f\u2ece\ub01f\u107f\u78b7\ucba0\ue649\u4bb0\ub66e\ubb0e\u54b1\u4ae5\u0938\u0ac3\u76bd\u1d9d\u7eff\u2618\ud9d4\u4306\u34e4\ud26e\u5e73\u9eb8\ua100\u3ede\u4d4f\u5437\u19a2\u2efa\ubd5a\uf8c5\ub29b\u279c\u2e87\u28c8\u9997\u7944\u7d75\u535b\ud721\u5968\ua504\u818d\uec4a\u8c7e\ud5d8\uabbd\u32d7\u336e\u0b1e\u4e0c\u2005\ub5d4\u0959\u290f\u3710\u0462\u4294\u83c1\u1d69\udab9\uc415\u5244\u65a3\u8d79\u7978\u578c\u2631\u761f\ucbaf\u208e\u19f8\u8f33\ua89e\ufac8\u3b3a\ueb50\u1e9a\ua451\u57fd\u718a\ubc02\ue748\ue374\uc577\u8d72\ubb2f\u4003\ua101\u8f92\u6865\u941f\u24fc\uca63\u230c\ue06f\ue2f9\ua1c4\u5e8f\udb3e\ued07\uad6a\u82cf\u1fdf\u1a3b\u440b\u850d\u3074\uaff2\u2416\u0261\uab7d\ue23e\u16ab\u4c08\udc73\ued99\uf95f\u5c06\uc295\u89f2\u6f1b\u634b\u3040\u4fcc\ud8ca\u1f8d\u0454\ud929\u4628\u4d14\u858e\u8d31\u6dd0\ud283\uf79b\u8086\ubb6a\u4ab6\u0127\u4d74\u3d29\uc21f\u5cd7\u9f22\u80e5\ua87b\uba94\u0839\u7c78\u49ba\uc70a\u5631\u870c\ua72a\ua5bc\uf840\u7cd3\ub3a4\u2e2f\u5086\ufc8c";
            var8_2 = "\u27ff\u279b\u27e3\u27f7".toCharArray();
            ** while (true)
            var9_3 = new String[var8_2.length];
            var13_7 = -1;
            ** while (true)
        }
        ClickCrystal.IIll = var9_3;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    @Override
    public void llI(Entity entity, byte by) {
        if (!this.IllII(entity, by)) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.IIl(minecraftClient);
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        this.lII();
        this.lIlII();
    }

    private boolean IIlI(MinecraftClient minecraftClient, BlockHitResult blockHitResult) {
        if (!this.IlII(minecraftClient)) {
            return false;
        }
        return IlIlllI.llIlI(minecraftClient, 250, blockHitResult.getPos(), () -> {
            this.llI = true;
            try {
                boolean bl = lIIllllI.lIllll(minecraftClient, blockHitResult);
                return bl;
            }
            finally {
                this.llI = false;
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.IlI.lIl() == IlllIlI.II) return true;
        if (minecraftClient.player.age > this.IIIl) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.crosshairTarget == null) return false;
        if (this.lI(minecraftClient)) return true;
        if (this.IlllI(minecraftClient)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illl(MinecraftClient minecraftClient) {
        if (!this.lll(minecraftClient)) return false;
        if (minecraftClient.options == null) {
            return false;
        }
        if (!this.IIIlI(minecraftClient.player, Items.END_CRYSTAL)) {
            return false;
        }
        if (!this.lIlI(minecraftClient)) return false;
        if (this.IllI(minecraftClient)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.Il) return true;
        if (minecraftClient.player.isUsingItem()) {
            return true;
        }
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.useKey == null) return false;
        if (minecraftClient.options.useKey.isPressed()) return true;
        if (lIIllllI.IIl(minecraftClient.options.useKey) > 0) return true;
        return false;
    }

    private static String lIIl(char[] cArray, long l2, int n) {
        int n2 = 0x3F723538 ^ n;
        for (int i = 0; i < cArray.length; ++i) {
            n2 = n2 ^ (int)l2 ^ ~i;
            n2 ^= n - i * cArray.length;
            n2 = -n2 * n | i;
            cArray[i] = (char)(cArray[i] ^ n2);
            int n3 = i & 0xFF;
            n = n << n3 | n >>> -n3;
            l2 ^= (long)n3;
        }
        return new String(cArray);
    }

    public ClickCrystal() {
        super(StringFactory.IIII("Click Crystal"), Category.II, StringFactory.IIII("Speeds up repeated block placement without changing attacks or crystal interactions."));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIlI(MinecraftClient minecraftClient) {
        if (this.lIIll(minecraftClient)) return true;
        if (!this.lIlIl(minecraftClient)) return false;
        return true;
    }

    private void lIll(MinecraftClient minecraftClient) {
        if (minecraftClient != null && minecraftClient.options != null && minecraftClient.options.useKey != null) {
            lIIllllI.IIIlIlI(minecraftClient);
            lIIllllI.llIlIl(minecraftClient.options.useKey);
            minecraftClient.options.useKey.setPressed(false);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llII(BlockPos blockPos, Direction direction, Vec3d vec3d) {
        if (blockPos == null) return;
        if (direction != null) {
            this.IIII = blockPos.toImmutable();
            this.II = direction;
            this.l = vec3d;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int llIl(PlayerInventory playerInventory, Item item) {
        if (playerInventory == null) return -1;
        if (item == null) return -1;
        int n = 0;
        while (n < 9) {
            if (playerInventory.getStack(n).isOf(item)) return n;
            ++n;
        }
        return -1;
    }

    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        if (this.ll) {
            this.IIl(minecraftClient);
        }
    }

    private void lllI(MinecraftClient minecraftClient) {
        if (!this.lll(minecraftClient)) {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
            this.lII();
            this.lIlII();
            return;
        }
        this.lIIIl(minecraftClient);
        if (!this.Illl(minecraftClient)) {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
            this.lII();
            return;
        }
        if (this.IlllI(minecraftClient)) {
            if (this.lIII(minecraftClient)) {
                this.IIlll(minecraftClient);
                this.IIIIl(minecraftClient);
                return;
            }
            if (this.lll != Integer.MIN_VALUE && minecraftClient.player.age <= this.lll) {
                this.IIIIl(minecraftClient);
                return;
            }
            lIIllllI.llIll(minecraftClient);
            this.IIl = true;
            try {
                lIIllllI.lIIll(minecraftClient);
            }
            finally {
                this.IIl = false;
            }
            this.IIIIl(minecraftClient);
            return;
        }
        if (this.lI(minecraftClient)) {
            lIIllllI.llIll(minecraftClient);
            BlockHitResult blockHitResult = (BlockHitResult)minecraftClient.crosshairTarget;
            this.llII(blockHitResult.getBlockPos(), blockHitResult.getSide(), blockHitResult.getPos());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIII(MinecraftClient minecraftClient) {
        if (this.IIII == null) return false;
        if (this.II == null) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player != null) {
            if (!this.IlII(minecraftClient)) {
                return false;
            }
        } else {
            return false;
        }
        if (!this.IlIIl(this.IIII, minecraftClient)) {
            this.lIlII();
            return false;
        }
        if (!this.IIIlI(minecraftClient.player, Items.END_CRYSTAL)) {
            return false;
        }
        if (IlIlllI.IIll()) {
            return false;
        }
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.useKey == null) {
            return false;
        }
        if (IlIlllI.IIll()) {
            return false;
        }
        BlockHitResult blockHitResult = new BlockHitResult(this.l == null ? this.IlIlI(this.IIII, this.II) : this.l, this.II, this.IIII, false);
        this.III = minecraftClient.crosshairTarget;
        minecraftClient.crosshairTarget = blockHitResult;
        this.llI = true;
        this.ll = true;
        lIIllllI.IIIlIlI(minecraftClient);
        lIIllllI.llIlIl(minecraftClient.options.useKey);
        minecraftClient.options.useKey.setPressed(false);
        if (!lIIllllI.IlllIIl(minecraftClient)) {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
            this.IIl(minecraftClient);
            return false;
        }
        this.IlIII(minecraftClient);
        lIIllllI.IlIlllI(minecraftClient, this, 0);
        this.Il = true;
        this.lIlII();
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IIIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.options == null) return;
        lIIllllI.lllIII(minecraftClient, 1);
        this.lI = true;
        if (minecraftClient.options.attackKey != null) {
        } else {
            return;
        }
        lIIllllI.llIlIl(minecraftClient.options.attackKey);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIIlI(ClientPlayerEntity clientPlayerEntity, Item item) {
        if (clientPlayerEntity == null) return false;
        if (clientPlayerEntity.getMainHandStack().isEmpty()) return false;
        if (!clientPlayerEntity.getMainHandStack().isOf(item)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIIll(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (!this.lll(minecraftClient)) return false;
        if (this.llI) {
            return false;
        }
        if (!this.IIIlI(minecraftClient.player, Items.END_CRYSTAL)) return false;
        if (minecraftClient.options == null) {
            return false;
        }
        boolean bl = this.lIIll(minecraftClient);
        boolean bl2 = this.lIlIl(minecraftClient);
        if (bl) {
            if (bl2) return true;
        }
        if (!bl2) return false;
        if (this.IllI(minecraftClient)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlII(MinecraftClient minecraftClient) {
        if (this.lIl) {
            return false;
        }
        if (minecraftClient == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.attackKey == null) {
            return false;
        }
        boolean bl = this.lIIll(minecraftClient);
        boolean bl2 = lIIllllI.IIl(minecraftClient.options.attackKey) > 0;
        boolean bl3 = bl2 || bl && !this.Ill;
        this.Ill = bl;
        if (bl) return bl3;
        if (bl2) return bl3;
        this.lIl = false;
        return bl3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean IIlIl(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) return false;
        if (!(clientPlayerEntity.getAttributeValue(EntityAttributes.ATTACK_DAMAGE) > 0.0)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIllI(MinecraftClient minecraftClient) {
        if ((Boolean)this.lII.lIl() == false) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player != null) {
            int n = this.llIl(minecraftClient.player.getInventory(), Items.END_CRYSTAL);
            if (n < 0) {
                return false;
            }
            if (lIIllllI.IlllIII(minecraftClient, this, n)) {
                this.lII();
                return true;
            }
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlll(MinecraftClient minecraftClient) {
        this.lIll(minecraftClient);
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) {
            return;
        }
        boolean bl = minecraftClient.interactionManager != null && minecraftClient.player.isUsingItem();
        if (bl) {
            minecraftClient.interactionManager.stopUsingItem((PlayerEntity)minecraftClient.player);
        } else {
            lIIllllI.IIIlll(minecraftClient);
        }
        this.Il = false;
        this.lll = minecraftClient.player.age;
    }

    private void IlIII(MinecraftClient minecraftClient) {
        this.lIl = true;
        this.Ill = this.lIIll(minecraftClient);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIIl(BlockPos blockPos, MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.world.getBlockState(blockPos).isOf(Blocks.OBSIDIAN)) return true;
        if (!minecraftClient.world.getBlockState(blockPos).isOf(Blocks.BEDROCK)) return false;
        return true;
    }

    private Vec3d IlIlI(BlockPos blockPos, Direction direction) {
        Direction direction2 = direction == null ? Direction.UP : direction;
        return new Vec3d((double)blockPos.getX() + 0.5 + (double)direction2.getOffsetX() * 0.5, (double)blockPos.getY() + 0.5 + (double)direction2.getOffsetY() * 0.5, (double)blockPos.getZ() + 0.5 + (double)direction2.getOffsetZ() * 0.5);
    }

    private static void IlIll() {
        ClickCrystal.I[0] = ClickCrystal.lIIl(ClickCrystal.llIII(-899780588, -1699195362).toCharArray(), 66761L, -1559360701);
        ClickCrystal.I[1] = ClickCrystal.lIIl(ClickCrystal.llIII(-899780587, 96029319).toCharArray(), 17149L, 641311386);
        ClickCrystal.I[2] = ClickCrystal.lIIl(ClickCrystal.llIII(-899780586, -599641754).toCharArray(), 60306L, -727506730);
        ClickCrystal.I[3] = ClickCrystal.lIIl(ClickCrystal.llIII(-899780585, 945712550).toCharArray(), 31439L, -703483260);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllII(Entity entity, byte by) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (entity == null) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (entity == minecraftClient.player) return false;
        if (!(entity instanceof LivingEntity)) return false;
        LivingEntity livingEntity = (LivingEntity)entity;
        if (by == 3) return true;
        if (entity.isRemoved()) return true;
        if (!entity.isAlive()) return true;
        if (livingEntity.getHealth() <= 0.0f) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IlIIlI(Entity entity) {
        if (!(entity instanceof EndCrystalEntity)) return;
        EndCrystalEntity endCrystalEntity = (EndCrystalEntity)entity;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.isInSingleplayer()) return;
        if (endCrystalEntity.isRemoved()) return;
        if (!this.IIIlI(minecraftClient.player, Items.END_CRYSTAL)) return;
        if (!ClickCrystal.IIlIl(minecraftClient.player)) return;
        this.IIIl = minecraftClient.player.age;
        endCrystalEntity.remove(Entity.RemovalReason.KILLED);
        endCrystalEntity.onRemoved();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.crosshairTarget == null) {
            return false;
        }
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof EntityHitResult)) return false;
        EntityHitResult entityHitResult = (EntityHitResult)hitResult;
        hitResult = entityHitResult.getEntity();
        if (!(hitResult instanceof EndCrystalEntity)) return false;
        EndCrystalEntity endCrystalEntity = (EndCrystalEntity)hitResult;
        if (endCrystalEntity.isRemoved()) return false;
        return true;
    }

    @Override
    public void ll() {
        this.lII();
        this.lIlII();
        this.IIIl = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illll(MinecraftClient minecraftClient, BlockPos blockPos, Direction direction) {
        if (!this.IIIlIIl()) return false;
        if (!this.lll(minecraftClient)) return false;
        if (blockPos == null) return false;
        if (direction == null) {
            return false;
        }
        if (!this.IIIlI(minecraftClient.player, Items.END_CRYSTAL)) return false;
        if (!this.IlIIl(blockPos, minecraftClient)) return false;
        return true;
    }

    private void lIIIl(MinecraftClient minecraftClient) {
        boolean bl = this.lIIll(minecraftClient);
        if (!bl) {
            this.lIl = false;
            this.Ill = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIlI(MinecraftClient minecraftClient, BlockPos blockPos, Direction direction) {
        if (minecraftClient.player == null) return false;
        if (minecraftClient.interactionManager != null) {
            if (IlIlllI.IIll()) {
                return false;
            }
        } else {
            return false;
        }
        if (!IlIlllI.IIll()) {
            Vec3d vec3d = new Vec3d((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ());
            BlockHitResult blockHitResult = new BlockHitResult(vec3d, direction, blockPos, false);
            return this.IIlI(minecraftClient, blockHitResult);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.attackKey == null) return false;
        if (lIIllllI.IIllIII(minecraftClient, minecraftClient.options.attackKey)) return true;
        if (!minecraftClient.options.attackKey.isPressed()) return false;
        return true;
    }

    private void lIlII() {
        this.IIII = null;
        this.II = null;
        this.l = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.useKey == null) return false;
        if (lIIllllI.IIllIII(minecraftClient, minecraftClient.options.useKey)) return true;
        if (!minecraftClient.options.useKey.isPressed()) return false;
        return true;
    }

    private static int lIllI(int n, int n2) {
        return IIlI[n ^ 0x32526B0] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llIII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xCA5E7014;
        char[] cArray = IIll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlII[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            ClickCrystal.IlII[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x385D4C09;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 8 -> 7;
                case 28 -> 130;
                case 25 -> 182;
                case 10 -> 110;
                case 24 -> 65;
                case 16 -> 185;
                case 27 -> 43;
                case 29 -> 119;
                case 7 -> 247;
                case 30 -> 234;
                case 9 -> 136;
                case 6 -> 207;
                case 4 -> 161;
                case 5 -> 237;
                case 22 -> 39;
                case 14 -> 195;
                case 3 -> 55;
                case 1 -> 82;
                case 19 -> 212;
                case 21 -> 62;
                case 13 -> 82;
                case 20 -> 185;
                case 23 -> 253;
                case 11 -> 170;
                case 31 -> 185;
                case 17 -> 211;
                case 26 -> 32;
                case 2 -> 54;
                case 18 -> 203;
                case 12 -> 94;
                case 15 -> 112;
                default -> 118;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

