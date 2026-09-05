/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIII
 * Module         : AirAnchor  [COMBAT]
 * Description    : Attempts to place another respawn anchor in the exploded anchor position.   (client's own text)
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Chance
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
 *  net.minecraft.block.RespawnAnchorBlock
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.state.property.Property
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.World
 */
package orchard.module.combat;

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
import net.minecraft.item.Items;
import net.minecraft.state.property.Property;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIlI;
import orchard.internal.IIllIIIIl;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.module.combat.FastAnchor;

@Environment(value=EnvType.CLIENT)
public final class AirAnchor
extends ModuleBase {
    private static final int I = 20;
    private BlockHitResult l;
    private int II;
    private BlockPos Il;
    private boolean lI;
    private BlockPos ll;
    private final lIlIIlI III = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Chance"), 100.0, 0.0, 100.0, 1.0).IIII(StringFactory.IIII("%")));
    private static final int IIl = 4;
    private int IlI;
    private static final int[] Ill;
    private static final String[] lII;
    private static final Object[] lIl;

    /*
     * Enabled aggressive block sorting
     */
    public AirAnchor() {
        super(StringFactory.IIII("uZ1GvRdUWBOF"), Category.II, StringFactory.IIII("uYBAmRRHRA/XHJAZH9/fnZ3UVZIWQ1gZhUiNXBzD34mW1FWSGl9fDtcBkRkb29venYxEkBZTVRjXCZFaB9zM3oibR5UNXl8S2Q=="));
        this.II = Integer.MIN_VALUE;
        this.IlI = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIl() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        FastAnchor fastAnchor = clientEntrypoint.IlI().IlIIlI();
        FastAnchor fastAnchor2 = fastAnchor;
        if (fastAnchor2 == null) return false;
        if (!fastAnchor2.Illll()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(MinecraftClient minecraftClient, BlockPos blockPos, BlockHitResult blockHitResult) {
        block2: {
            block3: {
                if (!this.Illl(minecraftClient)) return false;
                if (blockPos == null) break block2;
                BlockState blockState = minecraftClient.world.getBlockState(blockPos);
                if (!blockState.isAir() && !blockState.isReplaceable()) break block3;
            }
            return false;
        }
        return false;
        int n = minecraftClient.player.getMainHandStack().isOf(Items.RESPAWN_ANCHOR) ? lIIllllI.lllI(minecraftClient.player.getInventory()) : this.lIII((PlayerEntity)minecraftClient.player, Items.RESPAWN_ANCHOR);
        if (n < 0) return false;
        if (n >= 9) {
            return false;
        }
        BlockHitResult blockHitResult2 = this.llII(minecraftClient, blockPos, blockHitResult);
        if (blockHitResult2 != null) {
            if (n != lIIllllI.lllI(minecraftClient.player.getInventory())) return lIIllllI.IlIIIl(minecraftClient, this, n, () -> this.IIlI(minecraftClient, blockHitResult2));
            return this.IIlI(minecraftClient, blockHitResult2);
        }
        return false;
    }

    public boolean lII() {
        return this.lI;
    }

    public void lIl(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public void lll(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult) {
        this.ll = null;
        if (this.lI) return;
        if (!this.IIIlIIl()) return;
        if (!this.Illl(minecraftClient)) return;
        if (hand == null) return;
        if (blockHitResult == null) return;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return;
        if (minecraftClient.world.getRegistryKey().equals(World.NETHER)) return;
        if (this.IIl()) return;
        BlockPos blockPos = blockHitResult.getBlockPos();
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (!blockState.isOf(Blocks.RESPAWN_ANCHOR)) return;
        if ((Integer)blockState.get((Property)RespawnAnchorBlock.CHARGES) <= 0) return;
        if (minecraftClient.player.getStackInHand(hand).isOf(Items.GLOWSTONE)) return;
        this.ll = blockPos.toImmutable();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIII(MinecraftClient minecraftClient, BlockPos blockPos, BlockState blockState) {
        if (blockPos == null) return false;
        if (blockState == null) return false;
        if (blockState.isAir()) {
            return false;
        }
        if (!blockState.isSolidBlock((BlockView)minecraftClient.world, blockPos)) return false;
        if (!blockState.getFluidState().isEmpty()) return false;
        if (blockState.getCollisionShape((BlockView)minecraftClient.world, blockPos).isEmpty()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        this.ll = null;
        this.IlII();
        this.lI = false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean IIlI(MinecraftClient minecraftClient, BlockHitResult blockHitResult) {
        boolean bl;
        int n = lIIllllI.IIIIIlI(minecraftClient);
        this.lI = true;
        boolean bl2 = false;
        try {
            bl = bl2 = lIIllllI.lIllll(minecraftClient, blockHitResult);
            IIllIIIIl.IIIII(minecraftClient, bl2 ? Math.max(n, 4) : n);
        }
        catch (Throwable throwable) {
            IIllIIIIl.IIIII(minecraftClient, bl2 ? Math.max(n, 4) : n);
            this.lI = false;
            throw throwable;
        }
        this.lI = false;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlII() {
        this.Il = null;
        this.l = null;
        this.II = Integer.MIN_VALUE;
        this.IlI = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI() {
        double d = Math.max(0.0, Math.min(100.0, (Double)this.III.lIl()));
        if (d >= 100.0) return true;
        if (!(d > 0.0)) return false;
        if (ThreadLocalRandom.current().nextDouble(100.0) < d) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.getNetworkHandler() == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        if (IIlI.IIl(minecraftClient)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private int lIII(PlayerEntity var1_1, Item var2_2) {
        block8: {
            block6: {
                block5: {
                    block7: {
                        if (var1_1 == null) break block7;
                        break block8;
lbl3:
                        // 1 sources

                        return -1;
lbl5:
                        // 1 sources

                        return var3_3;
                    }
lbl8:
                    // 2 sources

                    return -1;
lbl10:
                    // 1 sources

                    while (true) {
                        if (!var1_1.getInventory().getStack(var3_3).isOf(var2_2)) break block5;
                        ** continue;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (true) {
                        var3_3 = 0;
                        break block6;
                        break;
                    }
                }
                ++var3_3;
            }
            ** while (var3_3 >= 9)
lbl20:
            // 1 sources

            ** while (true)
        }
        ** while (var1_1.getInventory() != null)
lbl23:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (this.IIIlIIl() && this.Illl(minecraftClient)) {
            if (this.l == null) return;
            if (minecraftClient.player.age > this.IlI) {
                this.IlII();
                return;
            }
            if (minecraftClient.player.age < this.II) return;
            BlockPos blockPos = this.Il;
            BlockHitResult blockHitResult = this.l;
            if (!this.IlI(minecraftClient, blockPos, blockHitResult)) {
                this.II = minecraftClient.player.age + 1;
                return;
            }
            this.IlII();
            return;
        }
        this.IlII();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void lIIl(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult, ActionResult actionResult) {
        BlockPos blockPos = this.ll;
        this.ll = null;
        if (blockPos != null && blockHitResult != null && blockPos.equals((Object)blockHitResult.getBlockPos()) && actionResult != null && (actionResult.isAccepted() || actionResult == ActionResult.SUCCESS)) {
            this.lIll(minecraftClient, hand, blockHitResult);
        }
    }

    @Override
    public String II() {
        return String.valueOf(Math.round((Double)this.III.lIl()));
    }

    public void lIlI(MinecraftClient minecraftClient, BlockHitResult blockHitResult) {
        this.lIll(minecraftClient, Hand.MAIN_HAND, blockHitResult);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIll(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult) {
        if (this.lI) return;
        if (!this.IIIlIIl()) return;
        if (!this.Illl(minecraftClient)) return;
        if (blockHitResult == null) return;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return;
        if (!minecraftClient.world.getRegistryKey().equals(World.NETHER)) {
            BlockPos blockPos;
            int n = minecraftClient.player.getMainHandStack().isOf(Items.RESPAWN_ANCHOR) ? lIIllllI.lllI(minecraftClient.player.getInventory()) : this.lIII((PlayerEntity)minecraftClient.player, Items.RESPAWN_ANCHOR);
            if (n < 0) return;
            if (n < 9) {
                blockPos = blockHitResult.getBlockPos();
                BlockState blockState = minecraftClient.world.getBlockState(blockPos);
                if (blockState.isOf(Blocks.RESPAWN_ANCHOR) && (Integer)blockState.get((Property)RespawnAnchorBlock.CHARGES) <= 0) {
                    return;
                }
                if (!this.IllI()) {
                    return;
                }
            } else {
                return;
            }
            this.Il = blockPos;
            this.l = blockHitResult;
            this.II = minecraftClient.player.age + 1;
            this.IlI = minecraftClient.player.age + 20;
            return;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private BlockHitResult llII(MinecraftClient minecraftClient, BlockPos blockPos, BlockHitResult blockHitResult) {
        Vec3d vec3d;
        Direction direction;
        Direction direction2;
        BlockState blockState;
        BlockPos blockPos2;
        BlockState blockState2;
        if (minecraftClient == null) return null;
        if (minecraftClient.world == null) return null;
        if (blockPos == null) {
            return null;
        }
        ClientWorld clientWorld = minecraftClient.world;
        BlockPos blockPos3 = blockPos.down();
        if (this.IIII(minecraftClient, blockPos3, blockState2 = clientWorld.getBlockState(blockPos3))) {
            Vec3d vec3d2;
            vec3d2((double)blockPos.getX() + 0.5, (double)blockPos.getY(), (double)blockPos.getZ() + 0.5);
            Vec3d vec3d3 = vec3d2;
            return new BlockHitResult(vec3d3, Direction.UP, blockPos3, false);
        }
        Direction[] directionArray = new Direction[]{Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST, Direction.UP};
        Direction[] directionArray2 = directionArray;
        int n = directionArray2.length;
        int n2 = 0;
        boolean bl = true;
        do {
            if (!bl || (bl = false) || !true) {
                ++n2;
            }
            if (n2 >= n) return null;
            direction2 = directionArray2[n2];
            blockPos2 = blockPos.offset(direction2);
            blockState = clientWorld.getBlockState(blockPos2);
            direction = direction2.getOpposite();
        } while (!this.IIII(minecraftClient, blockPos2, blockState));
        vec3d((double)blockPos.getX() + 0.5 + (double)direction2.getOffsetX() * 0.5, (double)blockPos.getY() + 0.5 + (double)direction2.getOffsetY() * 0.5, (double)blockPos.getZ() + 0.5 + (double)direction2.getOffsetZ() * 0.5);
        Vec3d vec3d4 = vec3d;
        return new BlockHitResult(vec3d4, direction, blockPos2, false);
    }

    private static int llIl(int n, int n2) {
        return Ill[n ^ 0x1C226152] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 26355;
        String string = "\u17e5\u171a\u17ed\u17a9\u1763\u1759\u17fc\u17b6\u17ba\u1706\u175f\u1791\u4b6e\u4b92\u4b15\u4b24\u4bf3\u4bd2\u4b41\u4b20\u4b34\u4b8e\u4bb4\u4b04\u4bcc\u4b41\u4bec\u4bb3\u4baa\u4b48\u4b84\u4b4e\u4bb5\u4bb9\u4bc2\u4b98\u4bc0\u4b73\u4b90\u4b05\u4b2c\u4bcd\u4b82\u4bda\u4b73\u4b9e\u4b3e\u4b2b\u4bc6\u4bc2\u4b69\u4b2c\u4b55\u4bfb\u4bf6\u4b0b\u4bb5\u4b4d\u4bfa\u4bba\u4ba5\u4b1d\u4b92\u4b4e\u4b9f\u4b97\u4b92\u4b8f\u4bfd\u4b7b\u4bb2\u4b30\u4b4f\u4bc5\u4b93\u4be5\u4b75\u4b92\u4b2f\u4b20\u4bf5\u4bc2\u4b49\u4b3c\u4b30\u4b9d\u4bf1\u4b04\u4bc7\u4b51\u4beb\u4b88\u4ba0\u4b48\u4bd1\u4b65\u4be8\u4b8c\u4b98\u4baf\u4bc4\u4b1c\u4b8c\u4b1c\u4b25\u4b90\u4bdd\u4bd3\u4b29\u4b9a\u4b6a\u4b58\u06d0\u0640\u0691\u068d\u064b\u0656\u06dd\u0685\ua6c9\ua67b\ua68b\ua6b9";
        char[] cArray = "\u66ff\u6697\u66fb\u66f7".toCharArray();
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
        lII = stringArray;
        lIl = new Object[stringArray.length];
        int n6 = 1204321256;
        byte[] byArray = "\u00f8.qQl\u00f4i\u00dePv\u00da\u00e9\u00b8@L\u00f6\u00bf\u00ef7\u009d\u00da\u00fc\u00ca\u0095\u00cf)0,\u00f9\u00e1{\u008c".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        Ill = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            AirAnchor.Ill[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lllI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x6716D607;
        char[] cArray = lII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            AirAnchor.lIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xB6A9077;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 21 -> 240;
                case 27 -> 65;
                case 1 -> 216;
                case 4 -> 141;
                case 16 -> 241;
                case 7 -> 123;
                case 15 -> 250;
                case 10 -> 136;
                case 22 -> 226;
                case 3 -> 118;
                case 30 -> 246;
                case 23 -> 222;
                case 8 -> 117;
                case 17 -> 98;
                case 26 -> 202;
                case 14 -> 190;
                case 28 -> 110;
                case 18 -> 184;
                case 9 -> 220;
                case 29 -> 239;
                case 5 -> 147;
                default -> 8;
                case 20 -> 200;
                case 24 -> 133;
                case 2 -> 68;
                case 6 -> 0;
                case 31 -> 147;
                case 25 -> 58;
                case 19 -> 59;
                case 11 -> 79;
                case 13 -> 24;
                case 12 -> 151;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

