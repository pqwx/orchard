/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIl
 * Module         : FastCart  [COMBAT]
 * Description    : Places a minecart after you place a rail.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Cart Place Delay
 *   - Switch Delay
 *   - Switch Back
 *   - .getBytes(
 *   - Delay
 *   - 2A==
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
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
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
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
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
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IlIlIll;
import orchard.internal.IlIlllI;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.llIll;
import orchard.module.combat.AutoCart;
import orchard.module.combat.KeyXbow;

@Environment(value=EnvType.CLIENT)
public final class FastCart
extends ModuleBase {
    private final IIIlIlIIl I = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Switch Delay"), 0.0, 0.0, 0.0, 300.0, 5.0).lII("ms"));
    private static final int l = 9;
    private int II = -1;
    private final IIIlIlIIl Il = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Cart Place Delay"), 0.0, 0.0, 0.0, 300.0, 5.0).lII("ms"));
    private BlockPos lI;
    private int ll = -1;
    private int III;
    private static String[] IIl;
    private boolean IlI;
    private int Ill;
    private boolean lII;
    private BlockHitResult lIl;
    private long llI;
    private final llIll lll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Switch Back"), true));
    private static final double IIII = 20.25;
    private static final long IIIl = 50L;
    private long IIlI;
    private static final int IIll = 1;
    private int IlII = -1;
    private int IlIl;
    private int IllI;
    private static final double Illl = 4.5;
    private static final String lIII;
    private static final double lIIl = 0.125;
    private IlIlIll lIlI;
    private static final int lIll = 20;
    private boolean llII;
    private static final int[] llIl;
    private static final String[] lllI;
    private static final Object[] llll;

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (!this.IlIll(minecraftClient)) return false;
        if (blockPos == null) return false;
        HitResult hitResult = minecraftClient.player.raycast(4.5, 1.0f, false);
        if (!(hitResult instanceof BlockHitResult)) return false;
        BlockHitResult blockHitResult = (BlockHitResult)hitResult;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return false;
        if (!blockHitResult.getBlockPos().equals((Object)blockPos)) return false;
        if (blockHitResult.getSide() != Direction.UP) return false;
        if (this.lIlI(minecraftClient.world.getBlockState(blockPos))) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIl(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (itemStack.isOf(Items.RAIL)) return true;
        if (itemStack.isOf(Items.POWERED_RAIL)) return true;
        if (itemStack.isOf(Items.DETECTOR_RAIL)) return true;
        if (itemStack.isOf(Items.ACTIVATOR_RAIL)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI(MinecraftClient minecraftClient) {
        int n = this.ll >= 0 ? this.ll : this.II;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) {
            return;
        }
        if (((Boolean)this.lll.lIl()).booleanValue() && n >= 0 && n < 9) {
            lIIllllI.IlIlllI(minecraftClient, this, n);
            return;
        }
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockPos lII(MinecraftClient minecraftClient, BlockHitResult blockHitResult) {
        BlockPos blockPos;
        BlockPos blockPos2;
        if (minecraftClient == null) return null;
        if (minecraftClient.world == null) return null;
        if (blockHitResult != null) {
            blockPos2 = blockHitResult.getBlockPos();
            blockPos = blockPos2.offset(blockHitResult.getSide());
            if (this.lIlI(minecraftClient.world.getBlockState(blockPos))) {
                return blockPos.toImmutable();
            }
        } else {
            return null;
        }
        if (!this.lIlI(minecraftClient.world.getBlockState(blockPos2))) return blockPos.toImmutable();
        return blockPos2.toImmutable();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIl(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n >= 9) return false;
        if (!orchard.internal.IIlI.IIl(minecraftClient)) return this.llII(minecraftClient.player.getInventory().getStack(n));
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int lll(PlayerEntity playerEntity, Item item) {
        int n = 0;
        while (n < 9) {
            ItemStack itemStack = playerEntity.getInventory().getStack(n);
            if (itemStack.isOf(item)) return n;
            ++n;
        }
        return -1;
    }

    private void IIII() {
        this.Ill = Integer.MIN_VALUE;
        this.IIlI = Long.MIN_VALUE;
        this.lIl = null;
        this.II = -1;
    }

    private int IIlI(IIIlIlIIl iIIlIlIIl) {
        return Math.max(0, (int)Math.ceil((double)this.IlIII(iIIlIlIIl) / 50.0));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (!this.IlIll(minecraftClient)) return false;
        if (blockPos == null) return false;
        if (!this.lIlI(minecraftClient.world.getBlockState(blockPos))) return false;
        if (!(minecraftClient.player.getEyePos().squaredDistanceTo(this.IllI(blockPos)) <= 20.25)) return false;
        return true;
    }

    private Vec3d IllI(BlockPos blockPos) {
        return Vec3d.ofBottomCenter((Vec3i)blockPos).add(0.0, 0.125, 0.0);
    }

    public boolean Illl() {
        return this.llII;
    }

    private void lIII() {
        this.lI = null;
        this.ll = -1;
        this.IlII = -1;
        this.IlI = false;
        this.lIlI = null;
        this.llI = 0L;
        this.III = Integer.MIN_VALUE;
        this.IllI = Integer.MIN_VALUE;
        this.lII = false;
        this.IlIl = 0;
    }

    private void lIIl(MinecraftClient minecraftClient) {
        this.IlI(minecraftClient);
        this.IIII();
        this.lIII();
        this.llII = false;
    }

    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        this.llllll(jsonObject, lIII, this.I, this.Il);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlI(BlockState blockState) {
        if (blockState == null) return false;
        if (blockState.isOf(Blocks.RAIL)) return true;
        if (blockState.isOf(Blocks.POWERED_RAIL)) return true;
        if (blockState.isOf(Blocks.DETECTOR_RAIL)) return true;
        if (blockState.isOf(Blocks.ACTIVATOR_RAIL)) return true;
        return false;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block33: {
                block29: {
                    block32: {
                        block28: {
                            block27: {
                                block24: {
                                    block26: {
                                        block31: {
                                            block25: {
                                                break block31;
lbl1:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl3:
                                                // 1 sources

                                                while (true) {
                                                    var11_6 += var12_7;
                                                    break block24;
                                                    break;
                                                }
lbl6:
                                                // 1 sources

                                                while (true) {
                                                    var3_14 += 4;
                                                    if (++var4_15 < var1_12) ** GOTO lbl74
                                                    ** GOTO lbl60
                                                    break;
                                                }
lbl10:
                                                // 1 sources

                                                while (true) {
                                                    if (++var10_5 < var8_3.length) break block25;
                                                    break block26;
                                                    break;
                                                }
lbl13:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl15:
                                                // 1 sources

                                                while (true) {
                                                    if (var13_8 == 0) {
                                                        ** continue;
                                                    }
                                                    break block25;
                                                    break;
                                                }
                                                FastCart.lllI = var9_4;
                                                FastCart.llll = new Object[var9_4.length];
                                                ** while (true)
lbl22:
                                                // 1 sources

                                                while (true) {
                                                    if (var15_10 < var14_9.length) break block27;
                                                    break block28;
                                                    break;
                                                }
                                            }
                                            var12_7 = var8_3[var10_5] ^ var6;
                                            ** GOTO lbl71
                                        }
                                        var6 = 2681;
                                        break block32;
lbl31:
                                        // 1 sources

                                        while (true) {
                                            FastCart.llIl[var4_15] = var5_16 ^= var2_13;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    var13_8 = 0;
                                    break block29;
lbl37:
                                    // 1 sources

                                    while (true) {
                                        var13_8 = -1;
                                        break block29;
                                        break;
                                    }
                                }
                                ** while (true)
                            }
                            block15: while (true) {
                                switch (var15_10 % 5) {
                                    case 3: {
                                        v0 = 80;
                                        break block15;
                                    }
                                    default: {
                                        v0 = 14;
                                        break block15;
                                    }
lbl51:
                                    // 1 sources

                                    while (true) {
                                        var9_4 = new String[var8_3.length];
                                        ** continue;
                                        break;
                                    }
lbl54:
                                    // 1 sources

                                    while (true) {
                                        var4_15 = 0;
                                        ** GOTO lbl74
                                        break;
                                    }
lbl57:
                                    // 1 sources

                                    while (true) {
                                        var12_7 = 0;
                                        ** continue;
                                        break;
                                    }
lbl60:
                                    // 1 sources

                                    FastCart.IIl = new String[8];
                                    FastCart.IIIlI();
                                    FastCart.lIII = "Delay";
                                    return;
lbl64:
                                    // 1 sources

                                    while (true) {
                                        FastCart.llIl = new int[var1_12];
                                        var3_14 = 0;
                                        ** continue;
                                        break;
                                    }
lbl68:
                                    // 1 sources

                                    while (true) {
                                        var1_12 = var0_11.length / 4;
                                        ** continue;
                                        break;
                                    }
lbl71:
                                    // 1 sources

                                    var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                                    var15_10 = 0;
                                    continue block15;
lbl74:
                                    // 2 sources

                                    var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                                    ** continue;
lbl76:
                                    // 1 sources

                                    while (true) {
                                        v1 = var15_10++;
                                        var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                                        break block30;
                                        break;
                                    }
                                    case 2: {
                                        v0 = 47;
                                        break block15;
                                    }
                                    case 1: {
                                        v0 = 8;
                                        break block15;
                                    }
                                    case 4: {
                                        v0 = 85;
                                        break block15;
                                    }
                                }
                                break;
                            }
                            break block33;
lbl90:
                            // 1 sources

                            while (true) {
                                var11_6 = 0;
                                ** continue;
                                break;
                            }
                            var2_13 = 840374723;
                            var0_11 = "F\u00fa=\u00d9\u00edJ\u0086g\u0091\u0097\u00aaq!\u0000\u00bb\u0003<jS\u00e2\u00bf\u00a3q\u00a9Q\u008f0\u00cc\u00dd\u00a7'\u00e1\u00a95\u00b6\u00b3\u008c}\u00aag\u00e8\u00a985\u008b\u00c4s\u00b0\u00ab\u00d0>\u00f7\u008e\u00fa\u0093\u008d\u00100\u00de9\u00bfJ\u0087A\u00fc\u00d1L\u00db]s\u00fdFu\u008c\u00b7\u0004\u00d8\u00d9\u0089\u0010\u00b9\u000eM\u00f6 M\u000ee\u00b16\u00f0\u000boqZ\u00fc\u0013\u00b6!a<\u0004]\u001d'A\u0006\u00b2\u0018e\u0010\u00e0\u001d\u001d\u00af\u00dc\u00c4\u00e2'\u0082\u00e8\u00b6\u00aa\u00a5[:\u0091\u00b4\u0094\u008f\u0085+\u0019;\u00d5<\\\u00b7~\u00fc".getBytes("ISO-8859-1");
                            ** while (true)
                        }
                        var9_4[var10_5] = new String(var14_9).intern();
                        ** while (true)
                    }
                    var7_2 = "\uf253\uc213\u1542\u3d76\u4a84\u74fb\u951e\uc4ee\u7ff8\u5985\uc26c\ubd71\uf783\u8303\ubb04\u8d76\udf04\ucf42\u9fc9\ub2ac\uc049\u35ff\udef6\uc432\ue7b5\u17f7\u7973\u217f\u1d12\u5b10\u2362\u307e\uf395\u7cec\uc6d0\ufe7c\ub636\u9cd2\u0a08\u42a1\uf902\ub40a\ue2a9\u7220\u70ba\uda37\ubba1\ua0b8\u12cf\u6935\ufde2\ubabb\u62bd\u802a\u3937\u3d47\uc4bd\u02fa\ue6a9\u892b\u23e6\u0cbb\ua9d3\ud8eb\u0fe5\uc68d\u06e5\ued4a\ud5a3\u108a\u94d4\u2a8e\u9089\u052c\u360a\u9860\uec3b\u1aeb\u9d3b\uc51f\u35cb\u3c56\u498b\ube0e\u6374\uc827\u7da8\u17e4\ucf29\u55b1\uca76\u3dca\u314a\u8e35\udaa7\u80ff\u420c\u801f\ua99a\u1810\u37b8\uc9d1\udf70\u5f83\u6287\u6c1b\u64a1\u98f6\uf991\uc3f4\u9099\u6c31\u2c33\u4cca\u2fdb\u8f0f\u2247\u4214\uaa1f\u6c16\u82bf\ufc07\u6558\u017e\uaa49\ue0fe \u9561\u8500\u067b\u4e04\uc048\u2ed5\uddd8\ueaef\u58d8\ud38f\u349f\uae24\uf911\ufa89\u11dc\u5935\uadbe";
                    var8_3 = "\u0a75\u0a61\u0a69\u0a41\u0a7d\u0a69\u0a71\u0a71".toCharArray();
                    ** while (true)
                }
                var10_5 = 0;
                ** while (true)
            }
            var16_1 = v0;
            ** while (true)
        }
        ** while (true)
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean lIll(MinecraftClient minecraftClient, BlockPos blockPos) {
        ActionResult actionResult;
        this.III = Integer.MIN_VALUE;
        if (this.IIIII()) {
            this.lIIl(minecraftClient);
            return false;
        }
        if (!(this.lI != null && this.lI.equals((Object)blockPos) && !this.lII && this.IlII(minecraftClient, blockPos) && this.lI(minecraftClient, blockPos) && this.IlII >= 0 && this.llII(minecraftClient.player.getInventory().getStack(this.IlII)))) {
            this.IIlII(minecraftClient);
            return false;
        }
        BlockHitResult blockHitResult = new BlockHitResult(this.IllI(blockPos), Direction.UP, blockPos, false);
        if (lIIllllI.llIllI(minecraftClient) != this.IlII) {
            this.IIlII(minecraftClient);
            return false;
        }
        long l2 = lIIllllI.lIIllI();
        boolean bl = lIIllllI.lIIIIl();
        if (!bl) {
            this.IIlII(minecraftClient);
            return false;
        }
        try {
            this.llII = true;
            try {
                actionResult = minecraftClient.interactionManager.interactBlock(minecraftClient.player, Hand.MAIN_HAND, blockHitResult);
            }
            finally {
                this.llII = false;
            }
        }
        finally {
            lIIllllI.IlIIlIl();
        }
        if (actionResult != null && actionResult.isAccepted()) {
            minecraftClient.player.swingHand(Hand.MAIN_HAND);
        }
        boolean bl2 = this.lII = lIIllllI.lIIllI() != l2;
        if (!this.lII) {
            this.IIlII(minecraftClient);
            return false;
        }
        this.IlIIl(minecraftClient);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llII(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (!itemStack.isOf(Items.TNT_MINECART)) return false;
        return true;
    }

    public FastCart() {
        super(StringFactory.IIII("FastCart"), Category.II, StringFactory.IIII("Places a minecart after you place a rail."));
        this.Ill = Integer.MIN_VALUE;
        this.IIlI = Long.MIN_VALUE;
        this.III = Integer.MIN_VALUE;
        this.IllI = Integer.MIN_VALUE;
    }

    private void llIl(BlockPos blockPos, int n) {
        this.lI = blockPos.toImmutable();
        this.ll = n;
        this.IlII = -1;
        this.IlI = false;
        this.lIlI = null;
        this.IlIl = 0;
        this.III = Integer.MIN_VALUE;
        this.IllI = Integer.MIN_VALUE;
        this.lII = false;
        this.llI = System.currentTimeMillis() + this.IlIII(this.Il);
    }

    @Override
    public String II() {
        return null;
    }

    @Override
    public void llll() {
        this.IlI(MinecraftClient.getInstance());
        this.IIII();
        this.lIII();
        this.llII = false;
    }

    @Override
    public void III() {
        this.IIIll(MinecraftClient.getInstance());
    }

    private static String lllI(char[] cArray, long l2, int n) {
        int n2 = 0x9EB7C67B ^ n;
        int n3 = 0;
        while (n3 < cArray.length) {
            n2 = n2 ^ (int)l2 ^ ~n3;
            n2 ^= n - n3 * cArray.length;
            n2 = -n2 * n | n3;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            int n4 = n3 & 0xFF;
            n = n << n4 | n >>> -n4;
            l2 ^= (long)n4;
            ++n3;
        }
        return new String(cArray);
    }

    @Override
    public String IIIIlll() {
        String string;
        String string2 = this.II();
        if (string2 == null || string2.isBlank()) {
            string = this.IIIl();
        } else {
            String string3 = string2;
            String string4 = "2A==";
            String string5 = this.IIIl();
            string = string5 + string4 + string3;
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIII() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        AutoCart autoCart = clientEntrypoint.IlI().llIlll();
        if (autoCart == null || !autoCart.IIllII()) {
            KeyXbow keyXbow = clientEntrypoint.IlI().IIIl();
            if (keyXbow == null) return false;
            if (keyXbow.IlIlll()) return true;
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIl(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult) {
        if (!this.IIIlIIl()) return false;
        if (this.llII) return false;
        if (this.IIIII()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (hand != Hand.MAIN_HAND) return false;
        if (blockHitResult == null) return false;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return false;
        if (blockHitResult.getSide() != Direction.UP) return false;
        if (orchard.internal.IIlI.IIl(minecraftClient)) return false;
        if (!this.IIl(minecraftClient.player.getMainHandStack())) return false;
        return true;
    }

    private static void IIIlI() {
        FastCart.IIl[0] = FastCart.lllI(FastCart.IlllI(-1517751087, 1727095863).toCharArray(), 57630L, -963033543);
        FastCart.IIl[1] = FastCart.lllI(FastCart.IlllI(-1517751088, 10119248).toCharArray(), 65681L, -1902012758);
        FastCart.IIl[2] = FastCart.lllI(FastCart.IlllI(-1517751085, 1616273703).toCharArray(), 24309L, -461092643);
        FastCart.IIl[3] = FastCart.lllI(FastCart.IlllI(-1517751086, 1420696457).toCharArray(), 4172L, 809571232);
        FastCart.IIl[4] = FastCart.lllI(FastCart.IlllI(-1517751083, 1847795240).toCharArray(), 28656L, 863611461);
        FastCart.IIl[5] = FastCart.lllI(FastCart.IlllI(-1517751084, 249574608).toCharArray(), 42148L, -689345102);
        FastCart.IIl[6] = FastCart.lllI(FastCart.IlllI(-1517751081, 1279070905).toCharArray(), 39189L, -1172800710);
        FastCart.IIl[7] = FastCart.lllI(FastCart.IlllI(-1517751082, -262451675).toCharArray(), 61626L, -1897551008);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIll(MinecraftClient minecraftClient) {
        int n;
        BlockPos blockPos;
        block16: {
            block18: {
                block19: {
                    block17: {
                        if (this.lI == null) {
                            return;
                        }
                        if (this.IIIII()) {
                            this.lIIl(minecraftClient);
                            return;
                        }
                        if (!this.IlIll(minecraftClient)) {
                            this.IlI(minecraftClient);
                            this.lIII();
                            return;
                        }
                        if (this.IllI != Integer.MIN_VALUE) {
                            if (minecraftClient.player.age >= this.IllI) {
                                this.IlI(minecraftClient);
                                this.lIII();
                                return;
                            }
                            return;
                        }
                        if (this.III == Integer.MIN_VALUE) {
                            if (System.currentTimeMillis() < this.llI) {
                                return;
                            }
                            blockPos = this.lI;
                            if (!this.lIlI(minecraftClient.world.getBlockState(blockPos))) {
                                this.IIlII(minecraftClient);
                                return;
                            }
                            if (!this.IlII(minecraftClient, blockPos)) {
                                this.IlIIl(minecraftClient);
                                return;
                            }
                        } else {
                            if (minecraftClient.player.age <= this.III) {
                                return;
                            }
                            this.III = Integer.MIN_VALUE;
                            this.llI = System.currentTimeMillis() + 50L;
                            return;
                        }
                        if (this.IlII < 0) {
                            this.IlII = this.IIlll((PlayerEntity)minecraftClient.player);
                        }
                        if (this.IlI) break block16;
                        if (this.IlII < 0 || !this.lIl(minecraftClient, this.IlII)) break block17;
                        if (this.lIlI != null && lIIllllI.IlIllI(minecraftClient, this.lIlI) && this.lIlI.l() == this.IlII) break block18;
                        break block19;
                    }
                    this.IlIIl(minecraftClient);
                    return;
                }
                boolean bl = lIIllllI.llIllI(minecraftClient) != this.IlII;
                n = bl ? this.IIlI(this.I) : 0;
                this.lIlI = lIIllllI.IIIIlII(minecraftClient, this, this.IlII, n, true);
            }
            if (!this.lIlI.Il()) {
                this.lIlI = null;
                this.llI = System.currentTimeMillis() + 50L;
                return;
            }
            if (!lIIllllI.IIIllll(minecraftClient, this.lIlI)) {
                return;
            }
            this.lIlI = null;
            this.IlI = true;
        }
        if (this.lI(minecraftClient, blockPos)) {
            this.lIll(minecraftClient, blockPos);
            return;
        }
        float[] fArray = IlIlllI.IlIll(minecraftClient, this.IllI(blockPos));
        if (fArray != null) {
            this.III = minecraftClient.player.age + 1;
            n = IlIlllI.IlI(minecraftClient, 200, fArray[0], fArray[1], () -> this.lIll(minecraftClient, blockPos)) ? 1 : 0;
            if (n != 0) return;
            this.III = Integer.MIN_VALUE;
            this.llI = System.currentTimeMillis() + 50L;
            return;
        }
        this.IIlII(minecraftClient);
    }

    private void IIlII(MinecraftClient minecraftClient) {
        ++this.IlIl;
        if (this.IlIl > 20) {
            this.IlIIl(minecraftClient);
            return;
        }
        this.llI = System.currentTimeMillis() + 50L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void IIllI(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult, ActionResult actionResult) {
        if (this.Ill == Integer.MIN_VALUE) {
            return;
        }
        try {
            if (!this.IIIlIIl() || this.llII || this.IIIII() || actionResult == null || !actionResult.isAccepted() || minecraftClient == null || minecraftClient.player == null || minecraftClient.world == null || minecraftClient.interactionManager == null || hand != Hand.MAIN_HAND || minecraftClient.player.age != this.Ill || lIIllllI.lIIllI() <= this.IIlI) {
                return;
            }
            BlockHitResult blockHitResult2 = this.lIl != null ? this.lIl : blockHitResult;
            BlockPos blockPos = this.lII(minecraftClient, blockHitResult2);
            if (blockPos != null) {
                this.llIl(blockPos, this.II);
                this.IIIll(minecraftClient);
            }
        }
        finally {
            this.IIII();
        }
    }

    private int IIlll(PlayerEntity playerEntity) {
        return this.lll(playerEntity, Items.TNT_MINECART);
    }

    private long IlIII(IIIlIlIIl iIIlIlIIl) {
        double d;
        double d2 = iIIlIlIIl.IIIl();
        if (d2 >= (d = iIIlIlIIl.IIII())) {
            return Math.max(0L, Math.round(d2));
        }
        return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d2, d)));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIl(MinecraftClient minecraftClient) {
        if (!((Boolean)this.lll.lIl()).booleanValue() || this.ll < 0 || this.ll >= 9 || this.ll == this.IlII) {
            this.lIII();
            return;
        }
        this.IllI = minecraftClient.player.age + 1;
    }

    public void IlIlI(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult) {
        if (!this.IIIIl(minecraftClient, hand, blockHitResult)) {
            return;
        }
        this.IlI(minecraftClient);
        this.IIII();
        this.lIII();
        this.Ill = minecraftClient.player.age;
        this.IIlI = lIIllllI.lIIllI();
        this.lIl = blockHitResult;
        this.II = lIIllllI.lllI(minecraftClient.player.getInventory());
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIll(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    private static int IllII(int n, int n2) {
        return llIl[n ^ 0xF6519FC9] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IlllI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xA588F4D1;
        char[] cArray = lllI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            FastCart.llll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4CFB151D;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 25 -> 146;
                case 11 -> 112;
                case 14 -> 228;
                case 1 -> 249;
                case 8 -> 143;
                case 27 -> 213;
                case 26 -> 242;
                case 2 -> 226;
                case 9 -> 181;
                case 19 -> 254;
                case 16 -> 11;
                case 20 -> 9;
                case 3 -> 202;
                case 18 -> 70;
                case 23 -> 42;
                case 15 -> 99;
                case 29 -> 69;
                case 12 -> 212;
                case 24 -> 51;
                case 22 -> 113;
                case 7 -> 150;
                case 6 -> 111;
                case 5 -> 121;
                case 4 -> 210;
                case 10 -> 4;
                case 31 -> 42;
                case 17 -> 208;
                case 30 -> 33;
                case 13 -> 122;
                case 28 -> 66;
                default -> 146;
                case 21 -> 96;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

