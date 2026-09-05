/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIlIl
 * Module         : AutoSafeAnchor  [COMBAT]
 * Description    : Places glowstone on the floor beside a newly placed anchor, toward the player.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Charge Glowstone
 *   - Explode unsafe
 *   - Action Delay
 *   - Auto Explode
 *   - Switch Delay
 *   - Charge Delay
 *   - Auto Target
 *   - Switch Back
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
 *  net.minecraft.block.ShapeContext
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
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
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Direction$Axis
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package orchard.module.combat;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RespawnAnchorBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
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
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.BlockView;
import net.minecraft.world.RaycastContext;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIlIIlI;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IIllIllIl;
import orchard.internal.IlII;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIllIlI;
import orchard.internal.IlIlllI;
import orchard.internal.IllIII;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllIIl;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIII;
import orchard.internal.llIll;
import orchard.module.combat.AntiBot;
import orchard.module.combat.FastAnchor;
import orchard.module.iface.Friends;
import orchard.module.player.Teams;

@Environment(value=EnvType.CLIENT)
public final class AutoSafeAnchor
extends ModuleBase {
    private static final int I = 3;
    private final llIll l;
    private long II;
    private boolean Il;
    private final IIIIIIIIl<IlIllIlI> lI;
    private final lIlIIlI ll;
    private int III;
    private final lIlIIlI IIl;
    private final lIlIIlI IlI;
    private static final int Ill = 3;
    private boolean lII;
    private boolean lIl;
    private boolean llI;
    private int lll;
    private BlockPos IIII;
    private int IIIl;
    private final llIll IIlI;
    private final lIlIIlI IIll;
    private final lIlIIlI IlII;
    private boolean IlIl;
    private final IlIlIlI IllI;
    private static final IIIlIIIII Illl;
    private static final int lIII = 2;
    private int lIIl;
    private final llIll lIlI;
    private static final int lIll = 2;
    private BlockPos llII;
    private int llIl;
    private static final long lllI = 25L;
    private final IIIlIlIIl llll;
    private llIII IIIII;
    private final Set<Long> IIIIl;
    private final llIll IIIlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Auto Target"), true));
    private long IIIll;
    private BlockPos IIlII;
    private int IIlIl;
    private int IIllI;
    private llIII IIlll;
    private int IlIII;
    private final IIIIIIIIl<IIIIlIIlI> IlIIl;
    private boolean IlIlI;
    private final IIIlIlIIl IlIll;
    private static final int IllII = 8;
    private static final Direction[] IllIl;
    private static final int IlllI = 9;
    private long Illll;
    private int lIIII;
    private boolean lIIIl;
    private BlockPos lIIlI;
    private int lIIll;
    private int lIlII;
    private final llIll lIlIl;
    private int lIllI;
    private static final int[] lIlll;
    private static final String[] llIII;
    private static final Object[] llIIl;

    /*
     * Enabled aggressive block sorting
     */
    private llIII I(MinecraftClient minecraftClient) {
        llIII llIII2;
        block9: {
            llIII llIII3;
            block8: {
                llIII llIII4;
                block6: {
                    llIII llIII5;
                    block7: {
                        block4: {
                            block5: {
                                block2: {
                                    llIII llIII6;
                                    block3: {
                                        block1: {
                                            if (!this.lIl) break block1;
                                            llIII6 = this.lIIll(minecraftClient, this.IIlII);
                                            if (llIII6 == null) break block2;
                                            break block3;
                                        }
                                        if (!this.IlIl) break block4;
                                        llIII4 = this.lIIll(minecraftClient, this.IIlII);
                                        if (llIII4 == null) break block5;
                                        break block6;
                                    }
                                    llIII5 = llIII6;
                                    break block7;
                                }
                                llIII5 = this.IllIlI(this.IIlII);
                                break block7;
                            }
                            llIII3 = this.IllIlI(this.IIlII);
                            break block8;
                        }
                        if (this.IlIll(minecraftClient, this.IIII)) {
                            return null;
                        }
                        llIII llIII7 = this.llII(minecraftClient, this.IIII);
                        llIII2 = llIII7 == null ? this.IIlll : llIII7;
                        break block9;
                    }
                    llIII2 = llIII5;
                    break block9;
                }
                llIII3 = llIII4;
            }
            llIII2 = llIII3;
        }
        if (!this.lIlIl(minecraftClient, llIII2)) return null;
        llIII llIII8 = llIII2;
        return llIII8;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean l(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) return false;
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (!blockState.isOf(Blocks.RESPAWN_ANCHOR)) return this.IIIlll(blockState);
        if ((Integer)blockState.get((Property)RespawnAnchorBlock.CHARGES) >= 4) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient) {
        if (this.Il) {
            int n = this.IllIl(minecraftClient, this.IIlII);
            if (n < this.IIIl) {
                if (minecraftClient.player.age > this.lIIII) {
                    this.Il = false;
                    this.IIIl = -1;
                    this.lIIII = Integer.MIN_VALUE;
                    this.IIllI = 0;
                    this.lll = Math.max(0, this.lll - 1);
                    this.IlIlll(minecraftClient);
                    return true;
                }
                return true;
            }
            this.Il = false;
            this.IIIl = -1;
            this.lIIII = Integer.MIN_VALUE;
            this.IIllI = 0;
            this.lll = Math.max(0, this.lll - 1);
            this.IlIlll(minecraftClient);
            return true;
        }
        if (!this.lIIIl) return false;
        if (this.IIlII != null && minecraftClient.world.getBlockState(this.IIlII).isOf(Blocks.RESPAWN_ANCHOR)) {
            if (minecraftClient.player.age <= this.lIIII) {
                return true;
            }
        } else {
            this.lIIIl = false;
            this.lIIII = Integer.MIN_VALUE;
            this.IIllI = 0;
            this.IllIII(minecraftClient);
            return true;
        }
        this.lIIIl = false;
        this.lIIII = Integer.MIN_VALUE;
        if (++this.IIllI > 3) {
            this.IllIII(minecraftClient);
            return true;
        }
        this.IIIll = System.currentTimeMillis() + 15L;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double IIl(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3) {
        double d = vec3d3.x - vec3d2.x;
        double d2 = vec3d3.z - vec3d2.z;
        double d3 = d * d + d2 * d2;
        if (d3 <= 1.0E-9) {
            double d4 = vec3d.x - vec3d2.x;
            double d5 = vec3d.z - vec3d2.z;
            return d4 * d4 + d5 * d5;
        }
        double d6 = ((vec3d.x - vec3d2.x) * d + (vec3d.z - vec3d2.z) * d2) / d3;
        d6 = Math.max(0.0, Math.min(1.0, d6));
        double d7 = vec3d2.x + d * d6;
        double d8 = vec3d2.z + d2 * d6;
        double d9 = vec3d.x - d7;
        double d10 = vec3d.z - d8;
        return d9 * d9 + d10 * d10;
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockHitResult IlI(MinecraftClient minecraftClient, Vec3d vec3d, Vec3d vec3d2) {
        BlockHitResult blockHitResult = lIIllllI.IIIIllI(minecraftClient, (Entity)minecraftClient.player, vec3d, vec3d2);
        if (blockHitResult == null || blockHitResult.getType() != HitResult.Type.BLOCK || lIIllllI.lIllI(minecraftClient.world.getBlockState(blockHitResult.getBlockPos()))) {
            blockHitResult = minecraftClient.world.raycast(AutoSafeAnchor.IlIII(vec3d, vec3d2, ShapeContext.of((Entity)minecraftClient.player)));
        }
        if (blockHitResult == null) return null;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return null;
        BlockHitResult blockHitResult2 = blockHitResult;
        return blockHitResult2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private llIII lII(MinecraftClient var1_1, BlockPos var2_2, BlockPos var3_3, Direction var4_4) {
        block11: {
            block10: {
                block8: {
                    block9: {
                        block7: {
                            if (var1_1 == null) return null;
                            if (var1_1.world == null) return null;
                            if (var1_1.player == null) break block7;
                            var5_5 = var1_1.player.getEyePos();
                            var9_9 = this.IlI(var1_1, var5_5, var8_8 = (var7_7 = (var6_6 = Vec3d.ofCenter((Vec3i)var3_3)).add(Vec3d.of((Vec3i)var4_4.getVector()).multiply(0.5))).subtract(Vec3d.of((Vec3i)var4_4.getVector()).multiply(0.01)));
                            if (var9_9 == null || var9_9.getType() != HitResult.Type.BLOCK || !var9_9.getBlockPos().equals((Object)var3_3) || var9_9.getSide() != var4_4) break block8;
                            break block9;
                        }
                        return null;
                    }
                    if (var2_2.equals((Object)var3_3.offset(var9_9.getSide()))) {
                        return new llIII(var2_2.toImmutable(), var9_9.getPos(), var9_9);
                    }
                }
                var10_10 = Vec3d.of((Vec3i)var4_4.getVector());
                if (var4_4.getAxis() == Direction.Axis.Y) {
                    var11_11 = new Vec3d(1.0, 0.0, 0.0);
                    var12_12 = new Vec3d(0.0, 0.0, 1.0);
                } else if (var4_4.getAxis() == Direction.Axis.X) {
                    var11_11 = new Vec3d(0.0, 1.0, 0.0);
                    var12_12 = new Vec3d(0.0, 0.0, 1.0);
                } else {
                    var11_11 = new Vec3d(1.0, 0.0, 0.0);
                    var12_12 = new Vec3d(0.0, 1.0, 0.0);
                }
                var13_13 = var5_5.subtract(var7_7);
                var14_15 = MathHelper.clamp((double)(var13_13.dotProduct(var11_11) * 0.5), (double)-0.3, (double)0.3);
                var16_16 = MathHelper.clamp((double)(var13_13.dotProduct(var12_12) * 0.5), (double)-0.3, (double)0.3);
                var18_17 = new Vec3d[]{var11_11.multiply(var14_15).add(var12_12.multiply(var16_16)), var11_11.multiply(0.25).add(var12_12.multiply(0.25)), var11_11.multiply(-0.25).add(var12_12.multiply(0.25)), var11_11.multiply(0.25).add(var12_12.multiply(-0.25)), var11_11.multiply(-0.25).add(var12_12.multiply(-0.25))};
                var19_18 = var18_17;
                var20_19 = var19_18.length;
                var21_20 = 0;
                break block10;
lbl33:
                // 1 sources

                while (var25_14.getSide() == var4_4 && var2_2.equals((Object)var3_3.offset(var25_14.getSide()))) {
                    return new llIII(var2_2.toImmutable(), var25_14.getPos(), var25_14);
                }
                break block11;
            }
lbl37:
            // 2 sources

            while (true) {
                if (var21_20 >= var20_19) return null;
                var22_21 = var19_18[var21_20];
                var23_22 = var7_7.add(var22_21);
                var24_23 = var23_22.subtract(var10_10.multiply(0.01));
                var25_14 = this.IlI(var1_1, var5_5, var24_23);
                if (var25_14 != null && var25_14.getType() == HitResult.Type.BLOCK && var25_14.getBlockPos().equals((Object)var3_3)) ** GOTO lbl33
                break;
            }
        }
        ++var21_20;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIl(MinecraftClient minecraftClient, BlockPos blockPos, Vec3d vec3d) {
        Box box;
        if (minecraftClient == null) return true;
        if (minecraftClient.player == null) {
            return true;
        }
        box((double)blockPos.getX(), (double)blockPos.getY(), (double)blockPos.getZ(), (double)blockPos.getX() + 1.0, (double)blockPos.getY() + 1.0, (double)blockPos.getZ() + 1.0);
        Box box2 = box;
        Box box3 = minecraftClient.player.getBoundingBox();
        if (!box2.intersects(box3)) {
            if (vec3d == null) return false;
            Vec3d vec3d2 = minecraftClient.player.getEntityPos();
            Vec3d vec3d3 = vec3d.subtract(vec3d2);
            if (!(vec3d3.lengthSquared() > 0.0025)) return false;
            Box box4 = box3.offset(vec3d3);
            if (!box2.intersects(box4)) return false;
            return true;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        if (orchard.internal.IIlI.IIl(minecraftClient)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Direction IIII(MinecraftClient minecraftClient, BlockPos blockPos) {
        Direction direction;
        Vec3d vec3d = Vec3d.ofCenter((Vec3i)blockPos);
        Vec3d vec3d2 = this.IllII(minecraftClient);
        double d = vec3d2.x - vec3d.x;
        double d2 = vec3d2.z - vec3d.z;
        if (Math.abs(d) >= Math.abs(d2)) {
            Direction direction2;
            if (d >= 0.0) {
                direction2 = Direction.EAST;
                return direction2;
            }
            direction2 = Direction.WEST;
            return direction2;
        }
        if (!(d2 >= 0.0)) {
            direction = Direction.NORTH;
            return direction;
        }
        direction = Direction.SOUTH;
        return direction;
    }

    @Override
    public String IIIl() {
        return super.IIIl();
    }

    @Override
    public String II() {
        String string = "%";
        long l2 = Math.round((Double)this.IIl.lIl());
        return l2 + string;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private llIII IIlI(MinecraftClient var1_1, BlockPos var2_2) {
        block25: {
            block29: {
                block21: {
                    block19: {
                        block30: {
                            block18: {
                                block28: {
                                    block24: {
                                        block22: {
                                            block17: {
                                                block23: {
                                                    block20: {
                                                        block26: {
                                                            block27: {
                                                                if (var1_1 == null) break block26;
                                                                break block27;
lbl3:
                                                                // 2 sources

                                                                return this.lII(var1_1, var2_2, var10_4, var9_3);
lbl5:
                                                                // 2 sources

                                                                while (true) {
                                                                    if (!this.IlIll(var1_1, var2_2)) break block17;
                                                                    break block18;
                                                                    break;
                                                                }
lbl8:
                                                                // 1 sources

                                                                while (true) {
                                                                    var6_8 = var5_7;
                                                                    var7_9 = var6_8.length;
                                                                    var8_10 = 0;
                                                                    break block19;
                                                                    break;
                                                                }
                                                            }
                                                            if (var1_1.world == null) break block26;
                                                            break block28;
lbl16:
                                                            // 1 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
lbl18:
                                                            // 1 sources

                                                            while (true) {
                                                                if (this.IIlII == null) break block20;
                                                                break block21;
                                                                break;
                                                            }
lbl21:
                                                            // 1 sources

                                                            while (true) {
                                                                if (var1_1.world.getBlockState(var2_2).isReplaceable()) ** GOTO lbl5
                                                                break block22;
lbl24:
                                                                // 1 sources

                                                                return null;
                                                            }
                                                        }
lbl27:
                                                        // 2 sources

                                                        return null;
lbl29:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
lbl31:
                                                            // 1 sources

                                                            return null;
                                                        }
lbl33:
                                                        // 1 sources

                                                        return var4_6 /* !! */ ;
lbl35:
                                                        // 1 sources

                                                        while (true) {
                                                            v0[2] = var4_6 /* !! */ .rotateYClockwise();
                                                            break block23;
                                                            break;
                                                        }
lbl38:
                                                        // 1 sources

                                                        while (true) {
                                                            if (this.IIlII == null) ** GOTO lbl3
                                                            break block24;
                                                            break;
                                                        }
                                                    }
lbl42:
                                                    // 2 sources

                                                    while (true) {
                                                        var4_6 /* !! */  = this.lII(var1_1, var2_2, var3_5, Direction.UP);
                                                        break block25;
                                                        break;
                                                    }
                                                }
                                                v0[3] = var4_6 /* !! */ .rotateYCounterclockwise();
                                                var5_7 = v0;
                                                ** while (true)
lbl49:
                                                // 2 sources

                                                while (true) {
                                                    ++var8_10;
                                                    break block19;
                                                    break;
                                                }
                                            }
                                            var3_5 = var2_2.down();
                                            if (this.lIlII(var1_1, var3_5)) {
                                                ** continue;
                                            }
                                            break block29;
                                        }
                                        if (!this.IIIlll(var1_1.world.getBlockState(var2_2))) ** break;
                                        ** while (true)
                                        ** while (true)
                                        v0 = new Direction[4];
                                        v0[0] = var4_6 /* !! */ ;
                                        v0[1] = var4_6 /* !! */ .getOpposite();
                                        ** while (true)
                                    }
                                    if (var10_4.equals((Object)this.IIlII)) ** break;
                                    ** while (true)
                                    ** GOTO lbl49
                                }
                                ** while (var2_2 != null)
lbl71:
                                // 1 sources

                                ** while (true)
                                var9_3 = var6_8[var8_10];
                                break block30;
                            }
                            return null;
                        }
                        var10_4 = var2_2.offset(var9_3.getOpposite());
                        ** while (this.lIlII((MinecraftClient)var1_1, (BlockPos)var10_4))
lbl79:
                        // 1 sources

                        ** while (true)
                    }
                    ** while (var8_10 >= var7_9)
lbl82:
                    // 1 sources

                    ** while (true)
                }
                ** while (!var3_5.equals((Object)this.IIlII))
            }
lbl86:
            // 2 sources

            while (true) {
                var4_6 /* !! */  = this.IIII(var1_1, var2_2);
                ** continue;
                break;
            }
        }
        ** while (var4_6 /* !! */  == null)
lbl91:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private PlayerEntity IIll(MinecraftClient var1_1) {
        block17: {
            block13: {
                block15: {
                    block12: {
                        block18: {
                            block14: {
                                block16: {
                                    if (var1_1 == null) break block15;
                                    break block16;
lbl3:
                                    // 1 sources

                                    while (true) {
                                        if (!this.IIlIl(var15_11, var3_3)) ** GOTO lbl-1000
                                        break block12;
                                        break;
                                    }
lbl6:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl8:
                                    // 1 sources

                                    while (!this.IllIIl(var1_1, var7_6)) lbl-1000:
                                    // 6 sources

                                    {
                                        while (true) {
                                            if (!var6_5.hasNext()) {
                                                return var2_2;
                                            }
                                            break block13;
                                            break;
                                        }
                                    }
                                    break block17;
                                    while (true) {
                                        break block14;
                                        break;
                                    }
lbl16:
                                    // 1 sources

                                    while (true) {
                                        var15_11 = new IlII(var7_6, var10_8, var12_9, var14_10);
                                        ** continue;
                                        break;
                                    }
lbl19:
                                    // 1 sources

                                    while (true) {
                                        if (var1_1.player != null) ** continue;
                                        break block15;
                                        break;
                                    }
lbl22:
                                    // 2 sources

                                    while (true) {
                                        var14_10 = var7_6.getHealth() + var7_6.getAbsorptionAmount();
                                        ** continue;
                                        break;
                                    }
lbl25:
                                    // 1 sources

                                    while (true) {
                                        if (!(var12_9 > (Double)this.IlII.lIl() * 0.5)) ** GOTO lbl22
                                        ** GOTO lbl-1000
                                        break;
                                    }
                                }
                                if (var1_1.world != null) {
                                    ** continue;
                                }
                                break block15;
                            }
                            var2_2 = null;
                            var3_3 = null;
                            var4_4 = (Double)this.IlI.lIl() * (Double)this.IlI.lIl();
                            break block18;
                            var12_9 = this.Illll(var1_1, (Entity)var7_6);
                            if ((Double)this.IlII.lIl() < 180.0) ** break;
                            ** while (true)
                            ** while (true)
lbl41:
                            // 1 sources

                            while (true) {
                                var10_8 = Math.sqrt(var8_7);
                                ** continue;
                                break;
                            }
                        }
                        var6_5 = var1_1.world.getPlayers().iterator();
                        ** GOTO lbl-1000
                    }
                    var3_3 = var15_11;
                    var2_2 = var7_6;
                    ** GOTO lbl-1000
                }
                return null;
            }
            var7_6 = (PlayerEntity)var6_5.next();
            ** GOTO lbl8
        }
        ** while (!((var8_7 = var1_1.player.squaredDistanceTo((Entity)var7_6)) > var4_4))
lbl58:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IlII(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult) {
        block3: {
            block6: {
                BlockPos blockPos;
                FastAnchor fastAnchor;
                block7: {
                    block5: {
                        block4: {
                            if (this.llI) {
                                return;
                            }
                            this.IIlIIl();
                            if (!this.IIIlIIl()) return;
                            if (!this.llI(minecraftClient)) return;
                            if (hand != Hand.MAIN_HAND) return;
                            if (blockHitResult == null) return;
                            if (blockHitResult.getType() != HitResult.Type.BLOCK) return;
                            if (!minecraftClient.player.getMainHandStack().isOf(Items.RESPAWN_ANCHOR)) break block3;
                            ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
                            if (clientEntrypoint == null || (fastAnchor = clientEntrypoint.IlI().IlIIlI()) == null || !fastAnchor.IIIlIIl()) break block4;
                            if (fastAnchor.Illll()) break block5;
                            blockPos = minecraftClient.world.getBlockState(blockHitResult.getBlockPos());
                            if (blockPos.isOf(Blocks.RESPAWN_ANCHOR)) break block6;
                        }
                        if ((fastAnchor = minecraftClient.world.getBlockState(blockHitResult.getBlockPos())).isOf(Blocks.RESPAWN_ANCHOR)) {
                            return;
                        }
                        break block7;
                    }
                    return;
                }
                BlockPos blockPos2 = blockPos = !fastAnchor.isReplaceable() && !this.IIIlll((BlockState)fastAnchor) ? blockHitResult.getBlockPos().offset(blockHitResult.getSide()) : blockHitResult.getBlockPos();
                if (!this.IIIlll(minecraftClient.world.getBlockState(blockPos))) {
                    return;
                }
                this.lIllI = minecraftClient.player.age;
                this.lIIlI = blockPos.toImmutable();
                return;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.useKey == null) return false;
        if (!minecraftClient.player.getMainHandStack().isOf(Items.GLOWSTONE)) {
            return false;
        }
        if (this.IIII != null) return true;
        if (minecraftClient.player.age <= this.lIIll) return true;
        return false;
    }

    public void Illl(MinecraftClient minecraftClient) {
        this.IIlIIl();
        this.IIllII();
    }

    private int lIII() {
        return Math.max(1, this.IIllI(this.IlIll) + this.IIllI(this.llll) + 1);
    }

    private int lIIl(IIIlIlIIl iIIlIlIIl) {
        return Math.max(0, (int)Math.ceil((double)this.IIIIl(iIIlIlIIl) / 50.0));
    }

    /*
     * Unable to fully structure code
     */
    private void lIll(MinecraftClient var1_1, boolean var2_2) {
        block44: {
            block40: {
                block48: {
                    block47: {
                        block35: {
                            block45: {
                                block42: {
                                    block41: {
                                        block37: {
                                            block39: {
                                                block32: {
                                                    block46: {
                                                        block33: {
                                                            block30: {
                                                                block38: {
                                                                    block36: {
                                                                        block34: {
                                                                            block43: {
                                                                                block31: {
                                                                                    if (var1_1 == null) break block33;
                                                                                    break block42;
lbl3:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var15_5 = v0;
                                                                                        break block30;
                                                                                        break;
                                                                                    }
lbl6:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        v0 = 0;
                                                                                        ** GOTO lbl3
                                                                                        break;
                                                                                    }
lbl9:
                                                                                    // 1 sources

                                                                                    while (!(var18_16 > var5_7)) {
                                                                                        break block31;
                                                                                    }
                                                                                    break block37;
lbl12:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
lbl14:
                                                                                        // 4 sources

                                                                                        while (true) {
                                                                                            v0 = 1;
                                                                                            ** continue;
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    }
lbl17:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
                                                                                    while (true) {
                                                                                        ++var15_5;
                                                                                        break block32;
                                                                                        break;
                                                                                    }
lbl22:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (var1_1.world == null) break block33;
                                                                                        break block34;
                                                                                        break;
                                                                                    }
lbl25:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var15_5 = -var7_8;
                                                                                        break block32;
                                                                                        break;
                                                                                    }
lbl28:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (this.lIIl == -2147483648) ** GOTO lbl14
                                                                                        break block35;
                                                                                        break;
                                                                                    }
lbl31:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (this.llII == null) ** GOTO lbl14
                                                                                        break block36;
                                                                                        break;
                                                                                    }
                                                                                    this.IIIIl.addAll(var10_11);
                                                                                    var14_3 = var11_12;
                                                                                    if (var14_3 == null) ** GOTO lbl6
                                                                                    ** while (true)
                                                                                    var11_12 = null;
                                                                                    break block43;
                                                                                }
                                                                                if (var1_1.world.getBlockState(var17_15).isOf(Blocks.RESPAWN_ANCHOR)) break block44;
                                                                                break block37;
lbl44:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
lbl46:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
lbl48:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var12_13 = Infinity;
                                                                            var14_4 = -var7_8;
                                                                            break block45;
lbl54:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                if (this.IIIIl.contains(var20_17)) break block37;
                                                                                break block38;
                                                                                break;
                                                                            }
lbl57:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var10_11 = new HashSet<Long>();
                                                                                ** continue;
                                                                                break;
                                                                            }
lbl60:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var18_16 = var8_9.squaredDistanceTo(Vec3d.ofCenter((Vec3i)var17_15));
                                                                                ** GOTO lbl9
                                                                                break;
                                                                            }
                                                                        }
                                                                        var3_6 = Math.max(0.0, var1_1.player.getBlockInteractionRange() + 0.75);
                                                                        var5_7 = var3_6 * var3_6;
                                                                        break block46;
lbl67:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!this.llII.equals(var14_3)) ** GOTO lbl14
                                                                    ** while (true)
                                                                    this.IIlIIl();
                                                                    this.llIlI(var1_1, var14_3);
                                                                    break block41;
                                                                }
                                                                if (var18_16 < var12_13) {
                                                                    ** continue;
lbl78:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var16_14 = -var7_8;
                                                                        break block39;
                                                                        break;
                                                                    }
                                                                }
                                                                break block37;
                                                            }
                                                            if (!var2_2) break block41;
                                                            break block47;
lbl85:
                                                            // 1 sources

                                                            while (true) {
                                                                var17_15 = var9_10.add(var14_4, var15_5, var16_14);
                                                                ** continue;
                                                                break;
                                                            }
lbl88:
                                                            // 1 sources

                                                            while (this.IIIIIl()) {
                                                                ** continue;
lbl90:
                                                                // 1 sources

                                                                ** GOTO lbl46
                                                            }
                                                            break block41;
lbl92:
                                                            // 1 sources

                                                            while (this.IIIII == null) {
                                                                ** GOTO lbl88
                                                            }
                                                            break block41;
                                                        }
lbl96:
                                                        // 2 sources

                                                        while (true) {
                                                            break block40;
                                                            break;
                                                        }
                                                    }
                                                    var7_8 = (int)Math.ceil(var3_6);
                                                    ** while (true)
                                                }
                                                ** while (var15_5 <= var7_8)
lbl103:
                                                // 1 sources

                                                ++var14_4;
                                                break block45;
lbl105:
                                                // 1 sources

                                                while (true) {
                                                    if (this.IIII != null) break block41;
                                                    ** GOTO lbl92
                                                    break;
                                                }
                                                var11_12 = var17_15.toImmutable();
                                                var12_13 = var18_16;
                                                break block37;
                                            }
lbl112:
                                            // 2 sources

                                            while (true) {
                                                if (var16_14 > var7_8) ** continue;
                                                ** continue;
                                                break;
                                            }
                                            var8_9 = var1_1.player.getEyePos();
                                            var9_10 = var1_1.player.getBlockPos();
                                            ** while (true)
                                        }
lbl119:
                                        // 2 sources

                                        while (true) {
                                            ++var16_14;
                                            ** continue;
                                            break;
                                        }
                                    }
lbl123:
                                    // 2 sources

                                    return;
                                }
                                ** while (var1_1.player == null)
lbl127:
                                // 1 sources

                                ** while (true)
                            }
                            if (var14_4 <= var7_8) {
                                ** continue;
                            }
                            break block48;
                        }
                        if (var1_1.player.age - this.lIIl >= 8) ** break;
                        ** while (true)
                        ** while (true)
lbl136:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    ** while (var15_5 == 0)
lbl140:
                    // 1 sources

                    ** while (true)
                }
                this.IIIIl.clear();
                ** while (true)
            }
            this.IIIIl.clear();
            return;
            this.llII = var14_3.toImmutable();
            this.lIIl = var1_1.player.age;
            ** while (true)
        }
        var20_17 = var17_15.asLong();
        ** while (true)
        var10_11.add(var20_17);
        ** while (!var2_2)
lbl156:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private llIII llII(MinecraftClient minecraftClient, BlockPos blockPos) {
        BlockHitResult blockHitResult = this.IIIlII(minecraftClient);
        if (blockHitResult == null) return null;
        if (blockPos == null) return null;
        if (minecraftClient == null) return null;
        if (minecraftClient.world == null) {
            return null;
        }
        if (!minecraftClient.world.getBlockState(blockPos).isReplaceable() && !this.IIIlll(minecraftClient.world.getBlockState(blockPos))) {
            return null;
        }
        BlockPos blockPos2 = blockHitResult.getBlockPos();
        if (this.IIlII != null) {
            if (blockPos2.equals((Object)this.IIlII)) return null;
        }
        BlockPos blockPos3 = blockPos2.offset(blockHitResult.getSide());
        if (!blockPos.equals((Object)blockPos3)) return null;
        if (!this.lIlII(minecraftClient, blockPos2)) {
            return null;
        }
        llIII llIII2 = new llIII(blockPos.toImmutable(), blockHitResult.getPos(), blockHitResult);
        if (!this.lIlIl(minecraftClient, llIII2)) {
            return null;
        }
        llIII llIII3 = llIII2;
        return llIII3;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int lllI(PlayerEntity playerEntity, Item item) {
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

    public boolean IIIII() {
        return this.llI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private long IIIIl(IIIlIlIIl iIIlIlIIl) {
        double d = Math.max(0.0, Math.min(iIIlIlIIl.IIIl(), iIIlIlIIl.IIII()));
        double d2 = Math.max(d, Math.max(iIIlIlIIl.IIIl(), iIIlIlIIl.IIII()));
        if (d != d2) return Math.round(ThreadLocalRandom.current().nextDouble(d, d2));
        return Math.round(d);
    }

    /*
     * Enabled aggressive block sorting
     */
    private long IIIlI(MinecraftClient minecraftClient, int n) {
        long l2 = System.currentTimeMillis();
        boolean bl = minecraftClient != null && minecraftClient.player != null && n >= 0 && n < 9 && lIIllllI.llIllI(minecraftClient) != n;
        long l3 = bl ? this.IIIIl(this.IlIll) : 0L;
        return l2 + l3 + this.IIIIl(this.llll);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (this.IIlII == null) return false;
        if (!this.lIl) {
            if (!this.IlIl) return false;
        }
        if (minecraftClient.world.getBlockState(this.IIlII).isOf(Blocks.RESPAWN_ANCHOR)) return false;
        if (minecraftClient.player.age <= this.IIlIl) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlII() {
        block11: {
            block19: {
                MinecraftClient minecraftClient;
                block23: {
                    block21: {
                        block22: {
                            block15: {
                                block20: {
                                    block18: {
                                        block17: {
                                            block16: {
                                                Object object;
                                                block13: {
                                                    block14: {
                                                        block12: {
                                                            block10: {
                                                                minecraftClient = MinecraftClient.getInstance();
                                                                if (!this.IIIlIIl() || !this.llI(minecraftClient)) break block10;
                                                                ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
                                                                if (clientEntrypoint != null && (object = clientEntrypoint.IlI().IlIIlI()) != null && ((ModuleBase)object).IIIlIIl() && ((FastAnchor)object).Illll()) break block11;
                                                                if (System.currentTimeMillis() < this.IIIll) {
                                                                    return;
                                                                }
                                                                if (this.lI(minecraftClient)) {
                                                                    return;
                                                                }
                                                                break block12;
                                                            }
                                                            this.IIllII();
                                                            return;
                                                        }
                                                        if (this.IlIl || this.lllll(minecraftClient, this.llIl)) {
                                                            if (this.lI.lIl() == IlIllIlI.II && !this.IlIlI) {
                                                                this.IlIlI = true;
                                                                this.Illll = System.currentTimeMillis();
                                                            }
                                                        } else {
                                                            if (((Boolean)this.IIlI.lIl()).booleanValue() && ((Boolean)this.l.lIl()).booleanValue() && this.IIlII != null) {
                                                                this.IIIlIl(minecraftClient);
                                                                return;
                                                            }
                                                            this.IIllII();
                                                            return;
                                                        }
                                                        if (!this.IlIlI) {
                                                            this.IlIIll(minecraftClient);
                                                            return;
                                                        }
                                                        object = this.I(minecraftClient);
                                                        if (object != null) break block13;
                                                        this.IllI.III();
                                                        if (this.IIIll(minecraftClient)) break block14;
                                                        if (!((Boolean)this.IIlI.lIl()).booleanValue() || !((Boolean)this.l.lIl()).booleanValue() || this.IIlII == null) break block15;
                                                        break block16;
                                                    }
                                                    return;
                                                }
                                                boolean bl = this.IIllll(minecraftClient, (llIII)object);
                                                if (bl) break block17;
                                                float f = this.IllI.llIIIl(minecraftClient, ((llIII)object).II(), ((Double)this.IIll.lIl()).floatValue());
                                                if (f == Float.MAX_VALUE) break block18;
                                                if (System.currentTimeMillis() - this.Illll < 1500L) return;
                                                this.IlIlI = false;
                                                if (!((Boolean)this.IIlI.lIl()).booleanValue()) break block19;
                                                break block20;
                                            }
                                            if (!this.IlIl) {
                                                this.IlIlI = false;
                                                this.IIIlIl(minecraftClient);
                                                return;
                                            }
                                            break block15;
                                        }
                                        this.IlIlI = false;
                                        this.IllI.III();
                                        this.IlIIll(minecraftClient);
                                        return;
                                    }
                                    this.IlIlI = false;
                                    if (!((Boolean)this.IIlI.lIl()).booleanValue() || !((Boolean)this.l.lIl()).booleanValue()) break block21;
                                    break block22;
                                }
                                if (!((Boolean)this.l.lIl()).booleanValue()) break block19;
                                break block23;
                            }
                            this.IIllII();
                            return;
                        }
                        if (this.IIlII != null && !this.IlIl) {
                            this.IIIlIl(minecraftClient);
                            return;
                        }
                    }
                    this.IIllII();
                    return;
                }
                if (this.IIlII != null && !this.IlIl) {
                    this.IIIlIl(minecraftClient);
                    return;
                }
            }
            this.IIllII();
            return;
        }
        this.IIllII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIl(IlII ilII, IlII ilII2) {
        boolean bl;
        if (ilII2 == null) {
            return true;
        }
        switch (((IIIIlIIlI)((Object)this.IlIIl.lIl())).ordinal()) {
            case 2: {
                bl = AutoSafeAnchor.llIIl(ilII.II(), ilII.I(), ilII.l(), ilII2.II(), ilII2.I(), ilII2.l());
                return bl;
            }
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                bl = AutoSafeAnchor.llIIl(ilII.I(), ilII.II(), ilII.l(), ilII2.I(), ilII2.II(), ilII2.l());
                return bl;
            }
            case 1: 
        }
        bl = AutoSafeAnchor.llIIl(ilII.l(), ilII.II(), ilII.I(), ilII2.l(), ilII2.II(), ilII2.I());
        return bl;
    }

    private int IIllI(IIIlIlIIl iIIlIlIIl) {
        double d = Math.max(0.0, Math.max(iIIlIlIIl.IIIl(), iIIlIlIIl.IIII()));
        return Math.max(0, (int)Math.ceil(d / 50.0));
    }

    static RaycastContext IlIII(Vec3d vec3d, Vec3d vec3d2, ShapeContext shapeContext) {
        return new lIIllIIl(vec3d, vec3d2, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, shapeContext);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IlIIl(PlayerEntity playerEntity, int n) {
        int n2;
        int n3 = this.lllI(playerEntity, Items.TOTEM_OF_UNDYING);
        if (n3 != -1) return n3;
        ItemStack itemStack = playerEntity.getInventory().getStack(n);
        if (this.IIlIlI(itemStack)) return n;
        int n4 = this.lllI(playerEntity, Items.RESPAWN_ANCHOR);
        if (n4 != -1) return n4;
        int n5 = this.llllI(playerEntity);
        if (n5 != -1) {
            n2 = n5;
            return n2;
        }
        n2 = n;
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIll(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return true;
        if (minecraftClient.world == null) return true;
        if (blockPos == null) return true;
        Box box = new Box(blockPos);
        if (minecraftClient.world.getOtherEntities(null, box, entity -> {
            if (entity.isSpectator()) return false;
            if (entity.isRemoved()) return false;
            if (entity instanceof LivingEntity) return true;
            if (entity.canHit()) return true;
            return false;
        }).isEmpty()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IllII(MinecraftClient minecraftClient) {
        block0: {
            if (minecraftClient == null) return Vec3d.ZERO;
            if (minecraftClient.player == null) break block0;
        }
        return Vec3d.ZERO;
        int n = this.llIl >= 0 ? this.llIl : this.IIIIll(minecraftClient);
        boolean bl = n >= 0 && lIIllllI.llIllI(minecraftClient) != n;
        double d = !bl ? 0.0 : (this.IlIll.IIIl() + this.IlIll.IIII()) / 2.0;
        double d2 = (this.llll.IIIl() + this.llll.IIII()) / 2.0;
        double d3 = d + d2;
        double d4 = Math.max(1.0, Math.min(10.0, d3 / 50.0));
        Vec3d vec3d = minecraftClient.player.getVelocity();
        Vec3d vec3d2 = new Vec3d(minecraftClient.player.getX(), minecraftClient.player.getY(), minecraftClient.player.getZ());
        return vec3d2.add(vec3d.multiply(d4));
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IllIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return 0;
        if (minecraftClient.world == null) return 0;
        if (blockPos == null) {
            return 0;
        }
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (!blockState.isOf(Blocks.RESPAWN_ANCHOR)) {
            return 0;
        }
        int n = (Integer)blockState.get((Property)RespawnAnchorBlock.CHARGES);
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        this.IIlIIl();
        this.IIllII();
        this.llI = false;
        this.lIIll = Integer.MIN_VALUE;
        this.II = 0L;
        this.IIIIl.clear();
        this.llII = null;
        this.lIIl = Integer.MIN_VALUE;
        this.IIIII = null;
        this.IlIII = -1;
        this.IllI.IlIIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlllI(MinecraftClient minecraftClient) {
        block3: {
            int n;
            block4: {
                block2: {
                    if (minecraftClient == null || minecraftClient.player == null || minecraftClient.world == null || this.lIIlI == null) break block2;
                    n = minecraftClient.player.age - this.lIllI;
                    if (n < 0) break block3;
                    break block4;
                }
                this.IIlIIl();
                return;
            }
            if (n <= 10) {
                if (!minecraftClient.world.getBlockState(this.lIIlI).isOf(Blocks.RESPAWN_ANCHOR)) {
                    return;
                }
                BlockPos blockPos = this.lIIlI.toImmutable();
                this.IIlIIl();
                if (!this.IIIIIl()) return;
                this.llIlI(minecraftClient, blockPos);
                return;
            }
        }
        this.IIlIIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private double Illll(MinecraftClient minecraftClient, Entity entity) {
        if (minecraftClient == null) return 180.0;
        if (minecraftClient.player == null) return 180.0;
        if (entity == null) return 180.0;
        Vec3d vec3d = entity.getBoundingBox().getCenter();
        float[] fArray = IlIlllI.IlIll(minecraftClient, vec3d);
        if (fArray == null) return 180.0;
        float f = MathHelper.wrapDegrees((float)(fArray[0] - minecraftClient.player.getYaw()));
        float f2 = fArray[1] - minecraftClient.player.getPitch();
        return Math.hypot(f, f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    private void lIIII(MinecraftClient minecraftClient) {
        llIII llIII2;
        if ((Boolean)this.IIIlI.lIl() == false) return;
        if (!this.IIIIIl()) {
            return;
        }
        PlayerEntity playerEntity = this.IIll(minecraftClient);
        if (playerEntity == null) {
            this.II = System.currentTimeMillis() - 25L + 25L;
            return;
        }
        BlockPos blockPos = this.IIlIII(minecraftClient, playerEntity);
        if (blockPos != null) {
            this.llIlI(minecraftClient, blockPos);
            this.II = System.currentTimeMillis();
            if (this.IIIll > System.currentTimeMillis()) return;
            this.IIlII();
            return;
        }
        int n = this.llIII(minecraftClient);
        int n2 = this.IIIIll(minecraftClient);
        if (n >= 0 && n2 >= 0) {
            llIII2 = this.lIIlI(minecraftClient, playerEntity);
            if (llIII2 == null) {
                this.II = System.currentTimeMillis() - 25L + 25L;
                return;
            }
        } else {
            this.II = System.currentTimeMillis() - 25L + 25L;
            return;
        }
        this.II = System.currentTimeMillis();
        if (this.lI.lIl() != IlIllIlI.II) {
            this.lllII(minecraftClient, llIII2, n);
            return;
        }
        this.IIIII = llIII2;
        this.IlIII = n;
        this.IlIlI = true;
        this.Illll = System.currentTimeMillis();
        this.IIIIII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIIl(MinecraftClient minecraftClient) {
        lIIllllI.llIlIl(minecraftClient.options.useKey);
        minecraftClient.options.useKey.setPressed(false);
        lIIllllI.IIIlIlI(minecraftClient);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block8: {
            var6 = 959;
            var7_2 = "\u4725\u47c1\u475d\u47a6\u9d6d\u9dc4\u9d0a\u9dd4\u9d72\u9db9\u9de7\u9d37\u9d05\u9dc7\u9dc8\u9d66\u9d69\u9df0\u9d01\u9d8a\ud37c\ud3d6\ud339\ud3c5\ud364\ud383\ud3dc\ud32b\ud307\ud3fa\ud3dd\ud316\ud378\ud3db\ud35d\ud388\ud3bf\ud30a\ud306\ud366\ue414\ue4a9\ue47b\ue4be\ue40d\ue4ee\ue4b8\ue455\ue478\ue4bc\ue4a9\ue42a\ue414\ue4f3\ue421\ue4fd\ue4d5\ue412\ue455\ue466\ue409\ue452\ue439\ue43b\ue4d9\ue4fe\ue4f0\ue45e\ue47a\ue4d4\ue4c9\ue48f\ue447\ue4d6\ue422\ue4fe\ue43d\ue4b7\ue496\ue426\ue449\ue4bc\ue4e0\ue460\ue45a\ue4d6\ue402\ue4a5\ue4a1\ue41f\ue431\ue46e\ue468\ue47f\ue47b\ue478\ue4ed\ue4f3\ue4a1\ue422\ue412\ue4d4\ue49d\ue4ee\ue423\ue4f5\ue43f\ue4b7\ue43c\ue4ff\ue48b\ue420\ue466\ue4ea\ue4a4\ue432\ue47b\ue4bd\ue468\ue4c7\ue4f6\ue478\ue45b\ue411\ue421\ue47c\ue44b\ue406\ue4a4\ue4e8\ue4c3\ue428\ue479\ue4e1\ue4f5\ue482\ue42b\ue4fe\ue470\ue4c3\ue410\ue4f7\ue498\ue47a\u09a0\u090a\u09e5\u0919\u09b8\u0917\u091c\u09ca\u09d8\u091f\u095a\u09a9\u09a2\u092e\u098a\u093b\uc035\uc08b\uc067\uc08d\uc02c\uc0cc\uc09a\uc076\uc05a\uc098\uc0b9\uc033\uc030\uc0af\uc004\uc0a9\u1c72\u1ccc\u1c20\u1cca\u1c6b\u1c8b\u1cdd\u1c31\u1c1d\u1cd8\u1c8f\u1c7a\u1c71\u1cd2\u1c44\u1cb0\u5cd2\u5c69\u5cf5\u5c0e\u7d4e\u7dcc\u7d3a\u7ddc\ub70a\ub7a8\ub754\ub7bd\u25aa\u252d\u25d9\u2517\u25b3\u2579\u254f\u25cb\u25db\u2538\u252e\u25ae\u25a2\u2523\u25b5\u256c\u256f\u25f2\u25ac\u25b4\u1366\u13a5\u1323\u13dd\u137c\u13b6\u13d6\u1333\u131d\u13ce\u13ff\u1307\u00acj\u00d7\u0002\u00b4B\f\u00ff\u6fdd\u6f39\u6fa5\u6f5e\u88db\u881d\u88a0\u8875\u88c2\u8835\u883e\u8888\u88b3\u8871\u8862\u88e1\u88df\u8838\u88ea\u8836\u881e\u88d9\u889e\u88ad\u88c2\u88d7\u88a6\u88af\u9dce\u9d08\u9db5\u9d60\u9dd7\u9d20\u9d2b\u9d9d\u9db2\u9d57\u9d3f\u9dab\uc0bc\uc016\uc0f9\uc005\uc0a4\uc00b\uc000\uc0c5\uc0c2\uc013\uc009\uc086\uc0b8\uc05e\uc091\uc079\u0ebe\u0e17\u0ec6\u0e00\u0ea5\u0e79\u0e37\u0ee9\u0ec6\u0e05\u0e08\u0ea6\u0eb9\u0e05\u0e9c\u0e42\u0e7c\u0ee2\u0edb\u0ea7\ud4e6\ud425\ud4af\ud44c\ud4fb\ud422\ud45e\ud498\ud499\ud45e\ud46d\ud4ed\ud4e1\ud464\ud486\ud479\uc925\uc996\uc95c\uc9f9\u578d\u5730\u57e2\u5727\u5794\u5777\u572e\u57d1\u57c0\u5725\u5728\u57b3\u578c\u5707\u5789\u5712\ue42d\ue49e\ue454\ue4f1\u75c7\u7504\u758e\u755f\u75d9\u7507\u7563\u75a5\u75ab\u7569\u7539\u75cc\u75c6\u7521\u75cb\u7558\u1393\u1350\u13da\u130b\u138d\u1353\u1337\u13f1\u13ff\u133d\u1332\u139c\u1393\u130a\u13fb\u1370\u482c\u48ea\u4857\u4882\u4835\u48c2\u48c9\u487f\u4844\u4886\u4889\u4827\u4828\u48b1\u4840\u48cb\u0176\u01cb\u0119\u01dc\u016f\u018c\u01d5\u012a\u013b\u01de\u01d3\u0148\u0177\u01fc\u0172\u01e9";
            var8_3 = "\u03bb\u03af\u03ab\u03d7\u03af\u03af\u03af\u03bb\u03bb\u03bb\u03ab\u03b3\u03b7\u03bb\u03a7\u03b3\u03af\u03ab\u03af\u03bb\u03af\u03bb\u03af\u03af\u03af\u03af".toCharArray();
            var9_4 = new String[var8_3.length];
            var13_8 = -1;
            ** GOTO lbl9
lbl7:
            // 1 sources

            while (true) {
                var13_8 = 0;
lbl9:
                // 2 sources

                var10_5 = 0;
                var11_6 = 0;
                var12_7 = 0;
                if (var13_8 != 0) break block8;
                AutoSafeAnchor.llIII = var9_4;
                AutoSafeAnchor.llIIl = new Object[var9_4.length];
                var2_13 = 1940359950;
                var0_11 = "\u000e\u00e1\u00a1\u00db\u00d0\u00a5\u00b9w \u001f\u00a9\u00c0Q\u0003\u0094\u00c0\u00ef\u00f8Z\u00ebcsb\u001f\u00e1\u00db\u0003\u00d4\u0098=Bq\u0084?>C\u001dC\\\u00e5\u0095\u00ca\u009c\u0087\u00c7\u0098\u00d1\u00eb\u00aa{0\u001f\u00be\u00e6\u008dn\u001e\u00fcm5\t\u00df\r^\u00c6^\u00df\u00c6\u0005mM\u00aa5\u00f3F\u0098S\u0005J\u00dd{\u00d8H\u00ac0\u00ea\u008cz\u000eyM\u00aaq\u00b5ILQ\u009a\u001dEy\u00ca\b\u0019t2\u00f1\u00d8S\u0097~\u0090r\u008d\"\rS\u001a\u00b3\u001d\u00c9\b\u00f3\u0091\u00bc^\u000f\u008f*\u00f3k\u00d7\u0018\u00cb\u0011\u00df\u0080\u0019\u000e1\u00f5\u00b8~\u00b7\u0015\u00df9C".getBytes("ISO-8859-1");
                var1_12 = var0_11.length / 4;
                AutoSafeAnchor.lIlll = new int[var1_12];
                var3_14 = 0;
                var4_15 = 0;
                do {
                    var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                    AutoSafeAnchor.lIlll[var4_15] = var5_16 ^= var2_13;
                    var3_14 += 4;
                } while (++var4_15 < var1_12);
                AutoSafeAnchor.IllIl = new Direction[]{Direction.NORTH, Direction.SOUTH, Direction.WEST, Direction.EAST};
                AutoSafeAnchor.Illl = StringFactory.IIII("Action Delay");
                return;
            }
            var9_4[var10_5] = new String(var14_9).intern();
            var11_6 += var12_7;
            ** while (++var10_5 >= var8_3.length)
        }
        var12_7 = var8_3[var10_5] ^ var6;
        var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
        var15_10 = 0;
lbl36:
        // 2 sources

        switch (var15_10 % 5) {
            case 2: {
                v0 = 23;
                break;
            }
            default: {
                v0 = 94;
                break;
            }
            case 3: {
                v0 = 25;
                break;
            }
            case 4: {
                v0 = 117;
                break;
            }
            case 1: {
                v0 = 125;
            }
        }
        var16_1 = v0;
        v1 = var15_10++;
        var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
        if (var15_10 < var14_9.length) ** GOTO lbl36
    }

    /*
     * Unable to fully structure code
     */
    private llIII lIIlI(MinecraftClient var1_1, PlayerEntity var2_2) {
        block37: {
            block27: {
                block38: {
                    block29: {
                        block32: {
                            block30: {
                                block28: {
                                    block40: {
                                        block31: {
                                            block26: {
                                                block39: {
                                                    block35: {
                                                        block34: {
                                                            block36: {
                                                                block33: {
                                                                    if (var1_1 == null) break block33;
                                                                    break block34;
lbl3:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        if (var12_10 > 2) break block26;
                                                                        break block27;
                                                                        return var9_7;
                                                                    }
lbl8:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl10:
                                                                    // 1 sources

                                                                    while (!(var19_17 > var10_8)) lbl-1000:
                                                                    // 10 sources

                                                                    {
                                                                        while (true) {
                                                                            ++var13_11;
                                                                            break block28;
                                                                            break;
                                                                        }
                                                                    }
                                                                    break block35;
lbl15:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        if (var11_9 > 3) ** continue;
                                                                        break block29;
                                                                        break;
                                                                    }
                                                                    while (true) {
                                                                        v0 = IIllIllIl.IlI((LivingEntity)var1_1.player, var14_12, null, this.IllII(var1_1));
lbl20:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                        break;
                                                                    }
lbl22:
                                                                    // 1 sources

                                                                    while (!this.IIIlll(var1_1.world.getBlockState(var14_12))) {
                                                                        ** GOTO lbl-1000
                                                                    }
                                                                    break block36;
lbl25:
                                                                    // 1 sources

                                                                    while (var7_5.squaredDistanceTo(Vec3d.ofCenter((Vec3i)var14_12)) > var5_4) {
                                                                        ** GOTO lbl-1000
                                                                    }
                                                                    ** GOTO lbl22
                                                                }
lbl29:
                                                                // 4 sources

                                                                return null;
lbl31:
                                                                // 2 sources

                                                                while (true) {
                                                                    var19_17 = var16_14 * 2.0f - var18_16;
                                                                    ** GOTO lbl10
                                                                    break;
                                                                }
lbl34:
                                                                // 1 sources

                                                                while (var2_2 == null) {
                                                                    ** GOTO lbl29
                                                                }
                                                                break block37;
lbl37:
                                                                // 1 sources

                                                                while (true) {
                                                                    var11_9 = -3;
                                                                    ** GOTO lbl15
                                                                    break;
                                                                }
lbl40:
                                                                // 1 sources

                                                                while (!((Boolean)this.IIlI.lIl()).booleanValue()) {
                                                                    ** GOTO lbl-1000
                                                                }
                                                                break block38;
lbl43:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (var17_15 == null) ** continue;
                                                                    break block30;
                                                                    break;
                                                                }
                                                                while (true) {
                                                                    ++var12_10;
                                                                    ** GOTO lbl3
                                                                    break;
                                                                }
lbl49:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (var1_1.player == null) ** GOTO lbl29
                                                                    ** GOTO lbl34
                                                                    break;
                                                                }
lbl52:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (var15_13 == null) ** GOTO lbl-1000
                                                                    break block31;
                                                                    break;
                                                                }
lbl55:
                                                                // 1 sources

                                                                while (true) {
                                                                    var9_7 = var15_13;
                                                                    ** GOTO lbl-1000
                                                                    break;
                                                                }
                                                            }
                                                            if (this.IlIll(var1_1, var14_12)) ** GOTO lbl-1000
                                                            break block39;
                                                            var18_16 = v0;
                                                            if (var17_15 != null) break block38;
                                                            ** GOTO lbl40
lbl64:
                                                            // 1 sources

                                                            while (true) {
                                                                var17_15 = this.IlllII(var1_1, var14_12);
                                                                ** continue;
                                                                break;
                                                            }
                                                        }
                                                        if (var1_1.world != null) ** break;
                                                        ** while (true)
                                                        ** while (true)
lbl71:
                                                        // 1 sources

                                                        while (true) {
                                                            if (((Boolean)this.IIlI.lIl()).booleanValue()) ** GOTO lbl31
                                                            ** GOTO lbl-1000
                                                            break;
                                                        }
                                                    }
                                                    var10_8 = var19_17;
                                                    ** while (true)
lbl77:
                                                    // 1 sources

                                                    while (true) {
                                                        var16_14 = IIllIllIl.IlI((LivingEntity)var2_2, var14_12, null, var2_2.getEntityPos());
                                                        ** continue;
                                                        break;
                                                    }
lbl80:
                                                    // 1 sources

                                                    while (true) {
                                                        var8_6 = var2_2.getBlockPos();
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                if (!this.lIl(var1_1, var14_12, var1_1.player.getEntityPos())) break block40;
                                                ** GOTO lbl-1000
lbl86:
                                                // 1 sources

                                                while (true) {
                                                    var7_5 = var1_1.player.getEyePos();
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            ++var11_9;
                                            ** while (true)
                                        }
                                        ** while (this.lIlIl((MinecraftClient)var1_1, (llIII)var15_13))
lbl94:
                                        // 1 sources

                                        ** while (true)
                                    }
                                    var15_13 = this.IlllIl(var1_1, var14_12);
                                    ** while (true)
                                }
lbl99:
                                // 2 sources

                                while (true) {
                                    if (var13_11 > 3) ** continue;
                                    break block32;
                                    break;
                                }
                            }
                            v0 = IIllIllIl.IlI((LivingEntity)var1_1.player, var14_12, var17_15.l(), this.IllII(var1_1));
                            ** while (true)
                        }
                        var14_12 = var8_6.add(var11_9, var12_10, var13_11);
                        ** GOTO lbl25
                    }
                    var12_10 = -2;
                    ** while (true)
                    var9_7 = null;
                    var10_8 = -Infinityf;
                    ** while (true)
                }
                if (var18_16 >= var16_14) ** break;
                ** while (true)
                ** while (true)
            }
            var13_11 = -3;
            ** while (true)
        }
        var3_3 = Math.max(0.0, var1_1.player.getBlockInteractionRange() - 0.1);
        var5_4 = var3_3 * var3_3;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private llIII lIIll(MinecraftClient minecraftClient, BlockPos blockPos) {
        BlockHitResult blockHitResult = this.IIIlII(minecraftClient);
        if (blockHitResult == null) return null;
        if (blockPos == null) return null;
        if (!blockPos.equals((Object)blockHitResult.getBlockPos())) return null;
        llIII llIII2 = new llIII(blockPos.toImmutable(), blockHitResult.getPos(), blockHitResult);
        if (!this.lIlIl(minecraftClient, llIII2)) return null;
        llIII llIII3 = llIII2;
        return llIII3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlII(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) {
            return false;
        }
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (this.IIIlll(blockState)) return false;
        if (blockState.getCollisionShape((BlockView)minecraftClient.world, blockPos).isEmpty()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlIl(MinecraftClient minecraftClient, llIII llIII2) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (llIII2 == null) return false;
        double d = Math.max(0.0, minecraftClient.player.getBlockInteractionRange() - 0.1);
        Vec3d vec3d = minecraftClient.player.getEyePos();
        if (vec3d.squaredDistanceTo(llIII2.I()) > d * d) return false;
        Vec3d vec3d2 = Vec3d.of((Vec3i)llIII2.II().getSide().getVector());
        Vec3d vec3d3 = llIII2.I().subtract(vec3d2.multiply(0.03125));
        BlockHitResult blockHitResult = this.IlI(minecraftClient, vec3d, vec3d3);
        if (blockHitResult == null) return false;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return false;
        if (!blockHitResult.getBlockPos().equals((Object)llIII2.II().getBlockPos())) return false;
        if (blockHitResult.getSide() != llIII2.II().getSide()) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private llIII lIllI(MinecraftClient var1_1, BlockPos var2_2, List<BlockPos> var3_3, Vec3d var4_4, double var5_5, double var7_6, double var9_7) {
        block20: {
            block22: {
                block17: {
                    block18: {
                        block14: {
                            block21: {
                                block16: {
                                    block15: {
                                        block19: {
                                            break block19;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl3:
                                            // 1 sources

                                            while (true) {
                                                var24_20 = (var21_16.x * var5_5 + var21_16.z * var7_6) / Math.max(0.1, var22_17);
                                                break block14;
                                                break;
                                            }
                                            block2: while (var21_16 == null) {
                                                break block15;
lbl8:
                                                // 2 sources

                                                while (true) {
                                                    var21_16 = this.IIlI(var1_1, var20_15);
                                                    continue block2;
                                                    break;
                                                }
lbl11:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            break block20;
lbl14:
                                            // 1 sources

                                            while (true) {
                                                var12_9 = var22_18;
                                                break block16;
                                                return var11_8;
                                            }
                                        }
                                        var11_8 = null;
                                        break block21;
                                    }
lbl23:
                                    // 8 sources

                                    while (true) {
                                        if (!var19_14.hasNext()) ** continue;
                                        ** continue;
                                        break;
                                    }
                                    var15_11 = Infinity;
                                    break block22;
lbl28:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl30:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl32:
                                    // 1 sources

                                    while (true) {
                                        var19_14 = var3_3.iterator();
                                        ** GOTO lbl23
                                        break;
                                    }
                                    var21_16 = Vec3d.ofCenter((Vec3i)var20_15).subtract(var17_12);
                                    var22_17 = Math.sqrt(var21_16.x * var21_16.x + var21_16.z * var21_16.z);
                                    ** while (true)
                                }
                                var13_10 = var23_19;
                                var15_11 = var25_21;
                                ** GOTO lbl23
lbl42:
                                // 1 sources

                                while (true) {
                                    if (!this.IlIllI(var22_18, var23_19, var25_21, var12_9, var13_10, var15_11)) ** GOTO lbl23
                                    break block17;
                                    break;
                                }
lbl45:
                                // 1 sources

                                while (true) {
                                    if (!(var18_13 > 1.0f)) ** GOTO lbl30
                                    ** GOTO lbl23
                                    break;
                                }
                                var23_19 = AutoSafeAnchor.IIl(Vec3d.ofCenter((Vec3i)var20_15), var17_12, var4_4);
                                var25_21 = var1_1.player.getEyePos().squaredDistanceTo(var21_16.I());
                                ** while (true)
                            }
                            var12_9 = Infinityf;
                            var13_10 = Infinity;
                            ** while (true)
lbl55:
                            // 1 sources

                            while (true) {
                                if (!this.lIl(var1_1, var20_15, var4_4)) break block18;
                                ** GOTO lbl23
                                break;
                            }
                        }
                        if (!(var24_20 < 0.55)) ** GOTO lbl8
                        ** GOTO lbl23
                    }
                    var22_18 = IIllIllIl.IlI((LivingEntity)var1_1.player, var2_2, var20_15, var4_4);
                    if (var22_18 > var18_13 - 0.05f) ** break;
                    ** while (true)
                    ** while (true)
                    var20_15 = var19_14.next();
                    if (var9_7 > 1.0E-4) ** break;
                    ** while (true)
                    ** while (true)
                }
                var11_8 = var21_16;
                ** while (true)
            }
            var17_12 = Vec3d.ofCenter((Vec3i)var2_2);
            var18_13 = IIllIllIl.IlI((LivingEntity)var1_1.player, var2_2, null, var4_4);
            ** while (true)
        }
        ** while (this.lIlIl((MinecraftClient)var1_1, (llIII)var21_16))
lbl79:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public AutoSafeAnchor() {
        super(StringFactory.IIII("uYFAkypWVhm2BpxRAME="), Category.II, StringFactory.IIII("qJhVnxxEEBubB4hKG9zQm9ibWtwNX1VckQSQVh2T3JuLnVCZWVYQEpIfk0BPw9Kfm5FQ3BhZUxSYGtMZG9zJn4qQFIgRUhAMmwmGXB2d"));
        IIIlIlIIl iIIlIlIIl;
        lIlIIlI lIlIIlI2;
        IIIIIIIIl<IlIllIlI> iIIIIIIIl;
        IIIIIIIIl<IIIIlIIlI> iIIIIIIIl2 = new IIIIIIIIl<IIIIlIIlI>(StringFactory.IIII("rJVGmxxDEDGYDJo="), IIIIlIIlI.class, IIIIlIIlI.Il);
        llIll llIll2 = this.IIIlI;
        Objects.requireNonNull(llIll2);
        this.IlIIl = this.IIlllIl((IIIIIIIIl)iIIIIIIIl2.lIII(llIll2::lIl));
        lIlIIlI lIlIIlI3 = new lIlIIlI(StringFactory.IIII("rJVGmxxDEC6WBphc"), 8.0, 2.0, 15.0, 0.5).IIII(StringFactory.IIII("lQ=="));
        llIll llIll3 = this.IIIlI;
        Objects.requireNonNull(llIll3);
        this.IlI = this.IIlllIl((lIlIIlI)lIlIIlI3.lIII(llIll3::lIl));
        this.IlII = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("vrti"), 180.0, 10.0, 180.0, 5.0).IIII(StringFactory.IIII("nJFT")).lIII(() -> false));
        iIIIIIIIl(StringFactory.IIII("qptAnQ1eXxLXJZBdCg=="), IlIllIlI.class, IlIllIlI.I);
        this.lI = this.IIlllIl(iIIIIIIIl);
        lIlIIlI2(StringFactory.IIII("q4BGmRdQRBQ="), 72.0, 1.0, 100.0, 1.0);
        this.IIll = this.IIlllIl((lIlIIlI)lIlIIlI2.lIII(() -> this.lI.lIl() == IlIllIlI.II));
        this.IllI = new IlIlIlI();
        this.IlIII = -1;
        this.IIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Chance"), 100.0, 0.0, 100.0, 1.0).IIII(StringFactory.IIII("%")));
        this.lIlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Charge Glowstone"), true));
        this.ll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Charges"), 1.0, 1.0, 4.0, 1.0));
        this.l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Auto Explode"), true));
        this.IIlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Explode unsafe"), true));
        iIIlIlIIl(StringFactory.IIII("q4NVjFlzVRCWEQ=="), 0.0, 0.0, 0.0, 300.0, 5.0);
        this.IlIll = this.IIlllIl(iIIlIlIIl.IIll(StringFactory.IIII("ms")));
        this.llll = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("qJhVnxwXdBmbCYY="), 0.0, 0.0, 0.0, 500.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.lIlIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Switch Back"), true));
        this.lIllI = Integer.MIN_VALUE;
        this.llIl = -1;
        this.III = -1;
        this.IIIll = Long.MIN_VALUE;
        this.IIlIl = Integer.MIN_VALUE;
        this.lIIll = Integer.MIN_VALUE;
        this.IIIl = -1;
        this.lIIII = Integer.MIN_VALUE;
        this.lIlII = Integer.MIN_VALUE;
        this.IIIIl = new HashSet<Long>();
        this.lIIl = Integer.MIN_VALUE;
        this.ll.lIII(this.lIlI::lIl);
        this.l.lIII(this.lIlI::lIl);
        this.IIlI.lIII(this.l::lIl);
    }

    @Override
    public String lIlll() {
        return this.II();
    }

    /*
     * Unable to fully structure code
     */
    private int llIII(MinecraftClient var1_1) {
        block12: {
            block13: {
                block11: {
                    block16: {
                        block10: {
                            block15: {
                                block14: {
                                    if (var1_1 == null) break block14;
                                    break block15;
lbl3:
                                    // 1 sources

                                    while (var2_2 == null) lbl-1000:
                                    // 2 sources

                                    {
                                        while (true) {
                                            var3_3 = 0;
                                            break block10;
                                            break;
                                        }
                                    }
                                    break block16;
lbl8:
                                    // 1 sources

                                    while (true) {
                                        var2_2 = var1_1.player.getMainHandStack();
                                        ** GOTO lbl3
                                        break;
                                    }
                                }
lbl12:
                                // 2 sources

                                return -1;
lbl14:
                                // 1 sources

                                return var3_3;
                                return -1;
lbl18:
                                // 1 sources

                                return lIIllllI.lllI(var1_1.player.getInventory());
lbl20:
                                // 1 sources

                                while (true) {
                                    if (var4_4 == null) break block11;
                                    break block12;
                                    break;
                                }
                            }
                            ** while (var1_1.player != null)
lbl25:
                            // 1 sources

                            ** while (true)
                        }
lbl27:
                        // 2 sources

                        while (true) {
                            if (var3_3 >= 9) ** continue;
                            break block13;
                            break;
                        }
                    }
                    ** while (!var2_2.isOf((Item)Items.RESPAWN_ANCHOR))
lbl32:
                    // 1 sources

                    ** while (true)
                }
lbl34:
                // 2 sources

                while (true) {
                    ++var3_3;
                    ** continue;
                    break;
                }
            }
            var4_4 = var1_1.player.getInventory().getStack(var3_3);
            ** while (true)
        }
        ** while (!var4_4.isOf((Item)Items.RESPAWN_ANCHOR))
lbl42:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean llIIl(double d, double d2, double d3, double d4, double d5, double d6) {
        if (Math.abs(d - d4) > 1.0E-4) {
            if (d < d4) return true;
            return false;
        }
        if (Math.abs(d2 - d5) > 1.0E-4) {
            if (d2 < d5) return true;
            return false;
        }
        if (d3 < d6) return true;
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private void llIlI(MinecraftClient var1_1, BlockPos var2_2) {
        block42: {
            block43: {
                block45: {
                    block34: {
                        block35: {
                            block36: {
                                block46: {
                                    block37: {
                                        block41: {
                                            block39: {
                                                block44: {
                                                    block30: {
                                                        block40: {
                                                            block32: {
                                                                block33: {
                                                                    block31: {
                                                                        block29: {
                                                                            block38: {
                                                                                if (this.IIII == null) break block35;
                                                                                break block36;
lbl3:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    v0 = true;
lbl5:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
lbl7:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
lbl9:
                                                                                // 1 sources

                                                                                return;
lbl11:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
lbl13:
                                                                                // 3 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
                                                                                this.III = lIIllllI.lllI(var1_1.player.getInventory());
                                                                                if (!var7_5) break block37;
                                                                                break block38;
lbl18:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    this.IIIlIl(var1_1);
lbl20:
                                                                                    // 4 sources

                                                                                    return;
                                                                                }
lbl22:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    var5_9 = this.IllIl(var1_1, var2_2);
                                                                                    break block29;
lbl25:
                                                                                    // 3 sources

                                                                                    while (true) {
                                                                                        v0 = false;
                                                                                        ** continue;
                                                                                        break;
                                                                                    }
                                                                                    break;
                                                                                }
                                                                            }
                                                                            v1 = var2_2.toImmutable();
                                                                            ** GOTO lbl13
lbl31:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
lbl33:
                                                                            // 1 sources

                                                                            while (var7_5) {
                                                                                break block30;
                                                                            }
                                                                            break block39;
lbl36:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                if (!((Boolean)this.l.lIl()).booleanValue()) break block31;
                                                                                break block32;
lbl39:
                                                                                // 1 sources

                                                                                return;
                                                                            }
lbl41:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
lbl43:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                v1 = var2_2.toImmutable();
                                                                                ** GOTO lbl13
                                                                                break;
                                                                            }
                                                                        }
                                                                        var6_4 = Math.max(0, var4_8 - Math.max(0, var5_9));
                                                                        break block40;
lbl49:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (var8_6 != null) ** GOTO lbl7
                                                                            break block33;
                                                                            break;
                                                                        }
lbl52:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            this.IIIlIl(var1_1);
                                                                            ** continue;
                                                                            break;
                                                                        }
lbl55:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
lbl57:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (!this.l(var1_1, var2_2)) ** GOTO lbl25
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                        this.III = lIIllllI.lllI(var1_1.player.getInventory());
                                                                        this.IIlII = var2_2.toImmutable();
                                                                        ** while (true)
                                                                        this.IlIl = false;
                                                                        this.IIIll = this.IIIlI(var1_1, var3_3);
                                                                        ** while (true)
lbl66:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            this.lll = v2;
                                                                            ** GOTO lbl33
                                                                            break;
                                                                        }
                                                                    }
lbl70:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        this.IIlII = null;
                                                                        ** continue;
                                                                        break;
                                                                    }
lbl73:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var8_6 = this.IlllII(var1_1, var2_2);
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                }
                                                                if (!var7_5) ** break;
                                                                ** while (true)
                                                                break block41;
                                                                this.lIIll = var1_1.player.age + this.lIII() + 2;
                                                                return;
                                                            }
                                                            this.III = lIIllllI.lllI(var1_1.player.getInventory());
                                                            ** while (true)
lbl85:
                                                            // 1 sources

                                                            while (var7_5) {
                                                                break block34;
                                                            }
                                                            break block42;
                                                        }
                                                        if (!((Boolean)this.lIlI.lIl()).booleanValue()) ** GOTO lbl25
                                                        break block43;
lbl91:
                                                        // 1 sources

                                                        while (true) {
                                                            this.llIl = var3_3;
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
                                                    v3 = this.IllIlI(var2_2);
                                                    break block44;
lbl97:
                                                    // 1 sources

                                                    while (true) {
                                                        if (!((Boolean)this.l.lIl()).booleanValue()) ** GOTO lbl20
                                                        ** continue;
                                                        break;
                                                    }
                                                }
lbl101:
                                                // 2 sources

                                                while (true) {
                                                    this.IIlll = v3;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            v3 = var8_6;
                                            ** while (true)
                                        }
                                        ** while (!((Boolean)this.IIlI.lIl()).booleanValue())
lbl109:
                                        // 1 sources

                                        ** while (true)
                                        var7_5 = v0;
                                        break block45;
                                    }
                                    ** while (var8_6 == null)
lbl114:
                                    // 1 sources

                                    break block46;
lbl115:
                                    // 1 sources

                                    while (true) {
                                        var4_8 = Math.max(1, Math.min(4, (int)((Double)this.ll.lIl()).doubleValue()));
                                        ** continue;
                                        break;
                                    }
                                }
                                v1 = var8_6.II().getBlockPos().offset(var8_6.II().getSide()).toImmutable();
                                ** while (true)
                                this.IIII = v1;
                                this.lIl = var7_5;
                                ** GOTO lbl85
lbl124:
                                // 1 sources

                                while (true) {
                                    if (!((Boolean)this.IIlI.lIl()).booleanValue()) ** GOTO lbl20
                                    ** continue;
                                    break;
                                }
                            }
                            return;
                        }
                        var3_3 = this.IIIIll(var1_1);
                        ** while (var3_3 >= 0)
lbl132:
                        // 1 sources

                        ** while (true)
                        var4_7 = this.IllIl(var1_1, var2_2);
                        if (var4_7 > 0) ** break;
                        ** while (true)
                        ** while (true)
                    }
                    v2 = var6_4;
                    ** GOTO lbl66
                }
                this.IIlII = var2_2.toImmutable();
                this.IIlIl = var1_1.player.age + 8;
                ** while (true)
            }
            if (var6_4 > 0) ** break;
            ** while (true)
            ** while (true)
        }
        v2 = 0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void llIll(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult, ActionResult actionResult) {
        if (this.lIllI == Integer.MIN_VALUE) return;
        if (this.llI) return;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null) {
            FastAnchor fastAnchor = clientEntrypoint.IlI().IlIIlI();
            if (fastAnchor != null && fastAnchor.IIIlIIl() && fastAnchor.Illll()) {
                this.IIlIIl();
                return;
            }
        }
        int n = minecraftClient.player.age - this.lIllI;
        if (this.IIIlIIl() && this.llI(minecraftClient) && hand == Hand.MAIN_HAND && n >= 0 && n <= 10 && this.lIIlI != null) {
            if (actionResult == null) return;
            if (!actionResult.isAccepted()) return;
            BlockPos blockPos = this.lIIlI.toImmutable();
            this.IIlIIl();
            if (!this.IIIIIl()) return;
            this.llIlI(minecraftClient, blockPos);
            return;
        } else {
            this.IIlIIl();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllII(MinecraftClient minecraftClient, llIII llIII2, int n) {
        this.IIIII = null;
        this.IlIII = -1;
        this.IlIlI = false;
        if (n < 0) return;
        if (n >= 9) return;
        if (this.IlIlIl(minecraftClient, llIII2)) {
            IllIII illIII = () -> {
                if (!this.IlIlIl(minecraftClient, llIII2)) {
                    return false;
                }
                if (this.lI.lIl() == IlIllIlI.I && !IlIlllI.IIlI(minecraftClient, llIII2.II(), false)) {
                    this.IIIII = llIII2;
                    this.IlIII = n;
                    return false;
                }
                boolean bl = lIIllllI.IlIIIl(minecraftClient, this, n, () -> {
                    this.llI = true;
                    try {
                        boolean bl = lIIllllI.lIllll(minecraftClient, llIII2.II());
                        return bl;
                    }
                    finally {
                        this.llI = false;
                    }
                });
                if (!bl) {
                    this.IIIII = llIII2;
                    this.IlIII = n;
                    this.II = System.currentTimeMillis() - 25L + 25L;
                    return bl;
                }
                this.llIlI(minecraftClient, llIII2.l());
                this.II = System.currentTimeMillis();
                return bl;
            };
            if (this.lI.lIl() != IlIllIlI.I || IlIlllI.IIlI(minecraftClient, llIII2.II(), false)) {
                illIII.run();
                return;
            }
            if (IlIlllI.llIlI(minecraftClient, 175, llIII2.I(), illIII)) return;
            this.IIIII = llIII2;
            this.IlIII = n;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private llIII lllIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        BlockHitResult blockHitResult = this.IIIlII(minecraftClient);
        if (blockHitResult == null) return null;
        if (blockPos == null) return null;
        if (minecraftClient == null) return null;
        if (minecraftClient.world == null) return null;
        if (!this.IIIlll(minecraftClient.world.getBlockState(blockPos))) {
            return null;
        }
        BlockPos blockPos2 = blockHitResult.getBlockPos();
        BlockPos blockPos3 = blockPos2.offset(blockHitResult.getSide());
        if (!blockPos.equals((Object)blockPos3)) return null;
        if (!this.lIlII(minecraftClient, blockPos2)) {
            return null;
        }
        llIII llIII2 = new llIII(blockPos.toImmutable(), blockHitResult.getPos(), blockHitResult);
        if (!this.lIlIl(minecraftClient, llIII2)) return null;
        llIII llIII3 = llIII2;
        return llIII3;
    }

    private int llllI(PlayerEntity playerEntity) {
        int n = 0;
        while (true) {
            if (n < 9) {
                if (this.IIlIlI(playerEntity.getInventory().getStack(n))) {
                    break;
                }
            } else {
                return -1;
            }
            ++n;
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllll(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n >= 9) return false;
        if (minecraftClient.player.getInventory().getStack(n).isOf(Items.GLOWSTONE)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIII(MinecraftClient minecraftClient) {
        if (this.IIIlIIl() && this.llI(minecraftClient) && this.IIIII != null) {
            if (this.lI.lIl() != IlIllIlI.II) {
                this.lllII(minecraftClient, this.IIIII, this.IlIII);
                return;
            }
            if (!this.IlIlIl(minecraftClient, this.IIIII)) {
                this.IIIII = null;
                this.IlIII = -1;
                this.IlIlI = false;
                this.IllI.III();
                return;
            }
            llIII llIII2 = this.lllIl(minecraftClient, this.IIIII.l());
            if (llIII2 == null) {
                this.IllI.llIIIl(minecraftClient, this.IIIII.II(), ((Double)this.IIll.lIl()).floatValue());
                if (System.currentTimeMillis() - this.Illll < 1500L) return;
                this.IIIII = null;
                this.IlIII = -1;
                this.IlIlI = false;
                this.IllI.III();
                return;
            }
            this.IlIlI = false;
            this.IllI.III();
            this.lllII(minecraftClient, llIII2, this.IlIII);
            return;
        }
        this.IIIII = null;
        this.IlIII = -1;
        this.IlIlI = false;
        this.IllI.III();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIIl() {
        double d = Math.max(0.0, Math.min(100.0, (Double)this.IIl.lIl()));
        if (d >= 100.0) return true;
        if (!(d > 0.0)) return false;
        if (!(ThreadLocalRandom.current().nextDouble(100.0) < d)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIIIlI() {
        if (!this.IIIlIIl()) return false;
        if (this.lIIlI == null) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private int IIIIll(MinecraftClient var1_1) {
        var2_2 = 0;
        if (true) ** GOTO lbl6
        while (true) {
            block4: {
                block6: {
                    block7: {
                        block5: {
                            if (var3_3 == null) break block5;
                            break block6;
lbl6:
                            // 2 sources

                            while (var2_2 < 9) {
                                break block4;
                            }
                            break block7;
lbl9:
                            // 1 sources

                            return var2_2;
                        }
                        while (true) {
                            ++var2_2;
                            ** GOTO lbl6
                            break;
                        }
                    }
                    return -1;
                }
                if (!var3_3.isOf(Items.GLOWSTONE)) ** continue;
                ** continue;
            }
            var3_3 = var1_1.player.getInventory().getStack(var2_2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockHitResult IIIlII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return null;
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof BlockHitResult)) return null;
        BlockHitResult blockHitResult = (BlockHitResult)hitResult;
        if (blockHitResult.getType() == HitResult.Type.BLOCK && minecraftClient.world != null && minecraftClient.player != null && lIIllllI.lIllI(minecraftClient.world.getBlockState(blockHitResult.getBlockPos()))) {
            hitResult = minecraftClient.player.getEyePos();
            blockHitResult = this.IlI(minecraftClient, (Vec3d)hitResult, hitResult.add(minecraftClient.player.getRotationVec(1.0f).multiply(minecraftClient.player.getBlockInteractionRange())));
        }
        if (blockHitResult == null) return null;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) {
            return null;
        }
        BlockHitResult blockHitResult2 = blockHitResult;
        return blockHitResult2;
    }

    @Override
    public void ll() {
        this.IllI.lIlIII();
        this.lIll(MinecraftClient.getInstance(), false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlIl(MinecraftClient minecraftClient) {
        int n;
        if (this.IIlII != null && minecraftClient != null && minecraftClient.player != null) {
            int n2 = lIIllllI.lllI(minecraftClient.player.getInventory());
            n = this.IlIIl((PlayerEntity)minecraftClient.player, n2);
            if (n < 0) {
                this.IllIII(minecraftClient);
                return;
            }
        } else {
            this.IllIII(minecraftClient);
            return;
        }
        this.IlIlI = false;
        this.IIII = this.IIlII.toImmutable();
        this.IIlll = this.IllIlI(this.IIlII);
        this.lIl = false;
        this.IlIl = true;
        this.IIllI = 0;
        this.llIl = n;
        this.IIIll = this.IIIlI(minecraftClient, n);
        this.lIIll = minecraftClient.player.age + this.lIII() + 2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient;
        block7: {
            minecraftClient = MinecraftClient.getInstance();
            if (!this.IIIlIIl()) return;
            if (this.llI(minecraftClient)) {
                if (IlIlllI.IIll()) return;
                if (!lIIllllI.llIlI() || lIIllllI.lIlII(this)) {
                    this.lIll(minecraftClient, false);
                    if (this.IIIII == null) {
                        FastAnchor fastAnchor;
                        if (this.IIII != null) {
                            this.IIlII();
                            return;
                        }
                        if (this.lIIlI != null) {
                            this.IlllI(minecraftClient);
                            return;
                        }
                        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
                        if (clientEntrypoint == null || (fastAnchor = clientEntrypoint.IlI().IlIIlI()) == null || !fastAnchor.IIIlIIl() || !fastAnchor.Illll()) {
                            if ((Boolean)this.IIIlI.lIl() == false) return;
                            if (System.currentTimeMillis() - this.II < 25L) return;
                            this.lIIII(minecraftClient);
                            return;
                        }
                        return;
                    }
                    break block7;
                } else {
                    return;
                }
            }
            return;
        }
        this.IIIIII(minecraftClient);
    }

    public boolean IIIllI() {
        return this.llI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlll(BlockState blockState) {
        if (blockState == null) return false;
        if (blockState.isAir()) return true;
        if (blockState.isReplaceable()) return true;
        if (lIIllllI.lIllI(blockState)) return true;
        if (blockState.isOf(Blocks.FIRE)) return true;
        if (blockState.isOf(Blocks.SOUL_FIRE)) return true;
        if (!blockState.isOf(Blocks.SNOW)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private BlockPos IIlIII(MinecraftClient var1_1, PlayerEntity var2_2) {
        block43: {
            block41: {
                block31: {
                    block34: {
                        block29: {
                            block38: {
                                block37: {
                                    block33: {
                                        block30: {
                                            block44: {
                                                block40: {
                                                    block36: {
                                                        block26: {
                                                            block35: {
                                                                block28: {
                                                                    block42: {
                                                                        block32: {
                                                                            block27: {
                                                                                block39: {
                                                                                    if (var1_1 == null) break block31;
                                                                                    break block39;
lbl3:
                                                                                    // 1 sources

                                                                                    while (!var16_14.isOf(Blocks.RESPAWN_ANCHOR)) {
                                                                                        break block26;
                                                                                    }
                                                                                    break block40;
lbl6:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl8:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var8_6 = var1_1.player.getBlockPos();
                                                                                        ** continue;
                                                                                        break;
                                                                                    }
lbl11:
                                                                                    // 2 sources

                                                                                    while (var13_11 <= var11_9) {
                                                                                        break block27;
                                                                                    }
                                                                                    break block41;
                                                                                    while (true) {
                                                                                        break block28;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (var1_1.world == null) break block31;
                                                                                break block42;
lbl19:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    if (var12_10 > var11_9) break block29;
                                                                                    break block30;
                                                                                    break;
                                                                                }
lbl22:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (var2_2 != null) ** continue;
                                                                                    break block31;
                                                                                    break;
                                                                                }
lbl25:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (((Boolean)this.IIlI.lIl()).booleanValue()) break block32;
                                                                                    break block26;
                                                                                    break;
                                                                                }
lbl28:
                                                                                // 1 sources

                                                                                while (var17_15 == 0) {
                                                                                    break block33;
                                                                                }
                                                                                break block43;
                                                                            }
                                                                            var14_12 = -var11_9;
                                                                            break block36;
                                                                        }
lbl35:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            if (!(var20_18 >= var18_16)) break block34;
                                                                            break block35;
                                                                            break;
                                                                        }
lbl38:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var7_5 = var1_1.player.getEyePos();
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                        while (true) {
                                                                            var16_14 = var1_1.world.getBlockState(var15_13);
                                                                            ** GOTO lbl3
                                                                            break;
                                                                        }
lbl44:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (!(var7_5.squaredDistanceTo(Vec3d.ofCenter((Vec3i)var15_13)) > var5_4)) ** continue;
                                                                            break block26;
                                                                            break;
                                                                        }
lbl47:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var12_10 = -var11_9;
                                                                            ** GOTO lbl19
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (var1_1.player != null) {
                                                                        ** continue;
                                                                    }
                                                                    break block31;
                                                                }
                                                                var3_3 = Math.max(0.0, var1_1.player.getBlockInteractionRange() - 0.1);
                                                                var5_4 = var3_3 * var3_3;
                                                                ** while (true)
lbl58:
                                                                // 1 sources

                                                                while (true) {
                                                                    var11_9 = (int)Math.ceil(var3_3);
                                                                    ** continue;
                                                                    break;
                                                                }
                                                            }
                                                            if (((Boolean)this.IIlI.lIl()).booleanValue()) break block34;
                                                            break block26;
lbl64:
                                                            // 1 sources

                                                            while (true) {
                                                                ++var13_11;
                                                                ** GOTO lbl11
                                                                break;
                                                            }
                                                        }
lbl68:
                                                        // 6 sources

                                                        while (true) {
                                                            ++var14_12;
                                                            break block36;
                                                            break;
                                                        }
                                                        var9_7 = null;
                                                        var10_8 = 0.0f;
                                                        ** while (true)
                                                    }
                                                    ** while (var14_12 > var11_9)
lbl76:
                                                    // 1 sources

                                                    break block44;
                                                }
                                                var17_15 = (Integer)var16_14.get((Property)RespawnAnchorBlock.CHARGES);
                                                ** GOTO lbl28
lbl80:
                                                // 1 sources

                                                while (true) {
                                                    v0 = IIllIllIl.IlI((LivingEntity)var1_1.player, var15_13, var19_17.l(), this.IllII(var1_1));
                                                    break block37;
                                                    break;
                                                }
lbl83:
                                                // 1 sources

                                                while (true) {
                                                    if (this.IIIIll(var1_1) < 0) ** GOTO lbl68
                                                    break;
                                                }
                                                break block43;
lbl86:
                                                // 1 sources

                                                while (true) {
                                                    var9_7 = var15_13;
                                                    ** GOTO lbl68
                                                    break;
                                                }
                                            }
                                            var15_13 = var8_6.add(var12_10, var13_11, var14_12);
                                            ** while (true)
lbl92:
                                            // 1 sources

                                            while (true) {
                                                if (var19_17 != null) {
                                                    ** continue;
                                                }
                                                break block38;
                                                break;
                                            }
                                        }
                                        var13_11 = -var11_9;
                                        ** GOTO lbl11
                                    }
                                    if (!((Boolean)this.lIlI.lIl()).booleanValue()) ** GOTO lbl68
                                    ** while (true)
                                }
lbl103:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            v0 = IIllIllIl.IlI((LivingEntity)var1_1.player, var15_13, null, this.IllII(var1_1));
                            ** while (true)
                        }
                        return var9_7;
lbl110:
                        // 1 sources

                        while (true) {
                            var10_8 = var18_16;
                            ** continue;
                            break;
                        }
                    }
                    if (!(var18_16 > var10_8)) ** GOTO lbl68
                    ** while (true)
                    var20_18 = v0;
                    ** while (var19_17 != null)
lbl118:
                    // 1 sources

                    ** while (true)
                }
                return null;
lbl121:
                // 1 sources

                while (true) {
                    var19_17 = this.IlllII(var1_1, var15_13);
                    ** continue;
                    break;
                }
            }
            ++var12_10;
            ** while (true)
        }
        var18_16 = IIllIllIl.IlI((LivingEntity)var2_2, var15_13, null, var2_2.getEntityPos());
        ** while (!(var18_16 <= 0.0f))
lbl130:
        // 1 sources

        ** while (true)
    }

    public void IIlIIl() {
        this.lIllI = Integer.MIN_VALUE;
        this.lIIlI = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIlI(ItemStack itemStack) {
        if (itemStack == null) return true;
        if (itemStack.isEmpty()) return true;
        if (!itemStack.isOf(Items.GLOWSTONE)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockPos IIlIll(MinecraftClient minecraftClient, BlockPos blockPos) {
        Vec3d vec3d = Vec3d.ofCenter((Vec3i)blockPos);
        Vec3d vec3d2 = this.IllII(minecraftClient);
        double d = vec3d2.x - vec3d.x;
        double d2 = vec3d2.z - vec3d.z;
        BlockPos blockPos2 = blockPos.offset(this.IIII(minecraftClient, blockPos));
        if (!(Math.abs(d) > 0.5)) return blockPos2;
        if (!(Math.abs(d2) > 0.5)) return blockPos2;
        return blockPos.add((int)Math.signum(d), 0, (int)Math.signum(d2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIllII() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (this.III >= 0 && this.III < 9 && minecraftClient != null && minecraftClient.player != null) {
            if (((Boolean)this.lIlIl.lIl()).booleanValue()) {
                lIIllllI.IlIlllI(minecraftClient, this, this.III);
            } else {
                lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
            }
        }
        this.IIlII = null;
        this.IIII = null;
        this.llIl = -1;
        this.III = -1;
        this.IIIll = Long.MIN_VALUE;
        this.IIlIl = Integer.MIN_VALUE;
        this.lIl = false;
        this.lll = 0;
        this.IlIl = false;
        this.IIlll = null;
        this.lII = false;
        this.Il = false;
        this.lIIIl = false;
        this.IIIl = -1;
        this.lIIII = Integer.MIN_VALUE;
        this.lIlII = Integer.MIN_VALUE;
        this.IIllI = 0;
        this.lIIll = Integer.MIN_VALUE;
        this.IIIII = null;
        this.IlIII = -1;
        this.IlIlI = false;
        this.IllI.III();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        this.llllll(jsonObject, Illl.IIII(), this.llll);
        this.llllll(jsonObject, "Switch Delay", this.IlIll);
        this.llllll(jsonObject, "Charge Delay", this.llll);
        this.llllll(jsonObject, "Place Delay", this.llll);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIllll(MinecraftClient minecraftClient, llIII llIII2) {
        if (llIII2 == null) {
            return false;
        }
        if (!this.lIl && !this.IlIl) {
            if (this.llII(minecraftClient, this.IIII) == null) return false;
            return true;
        }
        BlockHitResult blockHitResult = this.IIIlII(minecraftClient);
        if (blockHitResult == null) return false;
        if (this.IIlII == null) return false;
        if (!this.IIlII.equals((Object)blockHitResult.getBlockPos())) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockPos IlIIII(MinecraftClient minecraftClient, BlockPos blockPos) {
        Vec3d vec3d = Vec3d.ofCenter((Vec3i)blockPos);
        Vec3d vec3d2 = this.IllII(minecraftClient);
        double d = vec3d2.x - vec3d.x;
        double d2 = vec3d2.z - vec3d.z;
        if (!(Math.abs(d) > 0.5)) return blockPos.offset(this.IIII(minecraftClient, blockPos)).subtract((Vec3i)blockPos);
        if (!(Math.abs(d2) > 0.5)) return blockPos.offset(this.IIII(minecraftClient, blockPos)).subtract((Vec3i)blockPos);
        return new BlockPos((int)Math.signum(d), 0, (int)Math.signum(d2));
    }

    private boolean IlIIIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        return this.IIlI(minecraftClient, blockPos) != null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIll(MinecraftClient minecraftClient) {
        block9: {
            block10: {
                boolean bl;
                boolean bl2;
                boolean bl3;
                int n;
                llIII llIII2;
                block8: {
                    block5: {
                        block6: {
                            block7: {
                                if (minecraftClient.player != null && minecraftClient.player.age == this.lIlII) break block5;
                                llIII2 = this.I(minecraftClient);
                                if (llIII2 == null) break block6;
                                n = this.llIl;
                                if (n < 0 || n >= 9) break block7;
                                bl3 = this.lIl;
                                bl2 = this.IlIl;
                                boolean bl4 = bl = this.lI.lIl() == IlIllIlI.I;
                                break block8;
                            }
                            if (!((Boolean)this.IIlI.lIl()).booleanValue() || !((Boolean)this.l.lIl()).booleanValue()) break block9;
                            break block10;
                        }
                        if (this.IIIll(minecraftClient)) {
                            return;
                        }
                        if (((Boolean)this.IIlI.lIl()).booleanValue() && ((Boolean)this.l.lIl()).booleanValue() && this.IIlII != null && !this.IlIl) {
                            this.IIIlIl(minecraftClient);
                            return;
                        }
                        this.IllIII(minecraftClient);
                        return;
                    }
                    return;
                }
                int n2 = !bl3 ? -1 : this.IllIl(minecraftClient, this.IIlII);
                if (minecraftClient.player != null) {
                    this.lIIll = minecraftClient.player.age + 2;
                }
                IllIII illIII = () -> {
                    if (bl && !IlIlllI.IIlI(minecraftClient, llIII2.II(), false)) {
                        this.IlIlI = false;
                        this.IIIll = System.currentTimeMillis() + 15L;
                        return false;
                    }
                    if (!(bl3 || bl2 || this.IlIlIl(minecraftClient, llIII2))) {
                        this.IlIlI = false;
                        this.IIIll = System.currentTimeMillis() + 15L;
                        return false;
                    }
                    boolean bl4 = lIIllllI.IlIIIl(minecraftClient, this, n, () -> {
                        this.llI = true;
                        try {
                            boolean bl = lIIllllI.lIllll(minecraftClient, llIII2.II());
                            return bl;
                        }
                        finally {
                            this.llI = false;
                        }
                    });
                    if (!bl4) {
                        this.IlIlI = false;
                        if (++this.IIllI > 3) {
                            this.IllIII(minecraftClient);
                            return false;
                        }
                        this.IIIll = System.currentTimeMillis() + 15L;
                        return false;
                    }
                    this.lIlII = minecraftClient.player.age;
                    if (bl3) {
                        this.lII = true;
                        this.IlIlI = false;
                        this.IIIl = Math.min(4, Math.max(0, n2) + 1);
                        this.Il = true;
                        this.lIIII = minecraftClient.player.age + 3;
                        return true;
                    }
                    if (bl2) {
                        this.IlIlI = false;
                        this.lIIIl = true;
                        this.lIIII = minecraftClient.player.age + 3;
                        return bl4;
                    }
                    this.IlIlI = false;
                    if (((Boolean)this.l.lIl()).booleanValue()) {
                        this.IIIlIl(minecraftClient);
                        return true;
                    }
                    this.IllIII(minecraftClient);
                    return true;
                };
                if (this.lI.lIl() == IlIllIlI.I && !IlIlllI.IIlI(minecraftClient, llIII2.II(), false)) {
                    if (IlIlllI.llIlI(minecraftClient, 175, llIII2.I(), illIII)) return;
                    return;
                }
                illIII.run();
                return;
            }
            if (this.IIlII != null && !this.IlIl) {
                this.IIIlIl(minecraftClient);
                return;
            }
        }
        this.IllIII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIlIl(MinecraftClient minecraftClient, llIII llIII2) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (llIII2 == null) return false;
        if (llIII2.II() == null) {
            return false;
        }
        BlockHitResult blockHitResult = llIII2.II();
        if (!this.IIIlll(minecraftClient.world.getBlockState(llIII2.l()))) return false;
        if (this.IlIll(minecraftClient, llIII2.l())) return false;
        if (!llIII2.l().equals((Object)blockHitResult.getBlockPos().offset(blockHitResult.getSide()))) return false;
        if (!this.lIlII(minecraftClient, blockHitResult.getBlockPos())) return false;
        if (!this.lIlIl(minecraftClient, llIII2)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIllI(float f, double d, double d2, float f2, double d3, double d4) {
        if (d < d3 - 0.05) {
            return true;
        }
        if (d > d3 + 0.05) {
            return false;
        }
        if (f < f2 - 0.001f) {
            return true;
        }
        if (Math.abs(f - f2) > 0.001f) {
            return false;
        }
        if (d2 < d4) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIlll(MinecraftClient minecraftClient) {
        if (this.lll > 0) {
            this.IIIll = this.IIIlI(minecraftClient, this.llIl);
            return;
        }
        llIII llIII2 = this.IlllII(minecraftClient, this.IIlII);
        if (llIII2 == null) {
            if (!((Boolean)this.l.lIl()).booleanValue()) {
                this.IllIII(minecraftClient);
                return;
            }
            this.IIIlIl(minecraftClient);
            return;
        }
        this.lIl = false;
        this.IIlll = llIII2;
        this.IIII = llIII2.l().toImmutable();
        this.IIIll = this.IIIlI(minecraftClient, this.llIl);
    }

    private void IllIII(MinecraftClient minecraftClient) {
        if (((Boolean)this.IIIlI.lIl()).booleanValue()) {
            this.II = System.currentTimeMillis();
        }
        this.IIllII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllIIl(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        Teams teams;
        ClientEntrypoint clientEntrypoint;
        block4: {
            Friends friends;
            block5: {
                block3: {
                    if (playerEntity == null) return false;
                    if (minecraftClient.player == null) return false;
                    if (playerEntity == minecraftClient.player) break block3;
                    if (!playerEntity.isAlive()) return false;
                    if (playerEntity.isSpectator()) return false;
                    if (playerEntity.isCreative()) {
                        return false;
                    }
                    clientEntrypoint = ClientEntrypoint.lII();
                    if (clientEntrypoint == null) return true;
                    if (clientEntrypoint.IlI() == null) return true;
                    friends = clientEntrypoint.IlI().IIllIII();
                    if (friends == null || !friends.IIIlIIl()) break block4;
                    break block5;
                }
                return false;
            }
            if (friends.I(playerEntity)) {
                return false;
            }
        }
        if ((teams = clientEntrypoint.IlI().IIllIl()) != null && teams.IIIlIIl() && teams.lII(playerEntity)) {
            return false;
        }
        AntiBot antiBot = clientEntrypoint.IlI().lIIllI();
        if (antiBot == null) return true;
        if (!antiBot.IIIlIIl()) return true;
        if (!antiBot.lll(playerEntity)) return true;
        return false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private llIII IllIlI(BlockPos var1_1) {
        block55: {
            block52: {
                block47: {
                    block53: {
                        block44: {
                            block36: {
                                block33: {
                                    block50: {
                                        block54: {
                                            block48: {
                                                block37: {
                                                    block40: {
                                                        block46: {
                                                            block38: {
                                                                block43: {
                                                                    block51: {
                                                                        block41: {
                                                                            block42: {
                                                                                block49: {
                                                                                    block39: {
                                                                                        block35: {
                                                                                            block34: {
                                                                                                block45: {
                                                                                                    if (var1_1 != null) break block44;
                                                                                                    break block45;
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
                                                                                                        var15_15 = var14_14;
                                                                                                        var16_16 = var15_15.length;
                                                                                                        var17_17 = 0;
                                                                                                        break block33;
                                                                                                        break;
                                                                                                    }
lbl12:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        continue;
lbl14:
                                                                                                        // 1 sources

                                                                                                        return var21_21;
                                                                                                    }
lbl16:
                                                                                                    // 3 sources

                                                                                                    while (true) {
                                                                                                        continue;
                                                                                                        break;
                                                                                                    }
lbl18:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        v0 = new Vec3d(1.0, 0.0, 0.0);
                                                                                                        break block34;
                                                                                                        break;
                                                                                                    }
lbl21:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        continue;
                                                                                                        break;
                                                                                                    }
lbl23:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        if (!var3_3.getBlockPos().equals((Object)var1_1)) ** GOTO lbl16
                                                                                                        ** continue;
                                                                                                        break;
                                                                                                    }
                                                                                                    while (true) {
                                                                                                        if (var9_9.getAxis() != Direction.Axis.Y) break block35;
                                                                                                        ** continue;
                                                                                                        break;
                                                                                                    }
lbl29:
                                                                                                    // 2 sources

                                                                                                    while (var8_8 < var7_7) {
                                                                                                        break block36;
                                                                                                    }
                                                                                                    break block46;
lbl32:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        v0 = new Vec3d(1.0, 0.0, 0.0);
                                                                                                        break block34;
                                                                                                        break;
                                                                                                    }
lbl35:
                                                                                                    // 1 sources

                                                                                                    return var4_4 /* !! */ ;
                                                                                                }
                                                                                                return null;
                                                                                            }
lbl40:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                continue;
                                                                                                break;
                                                                                            }
lbl42:
                                                                                            // 1 sources

                                                                                            while (var12_12 != null) {
                                                                                                break block37;
                                                                                            }
                                                                                            break block47;
lbl45:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                if (var2_2 == null) break block38;
                                                                                                break block39;
                                                                                                break;
                                                                                            }
lbl48:
                                                                                            // 1 sources

                                                                                            while (var20_20.getSide() == var9_9) {
                                                                                                ** continue;
lbl50:
                                                                                                // 1 sources

                                                                                                ** GOTO lbl21
                                                                                            }
                                                                                            break block41;
lbl52:
                                                                                            // 1 sources

                                                                                            while (var2_2.player == null) {
                                                                                                break block38;
                                                                                            }
                                                                                            break block48;
lbl55:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                v1 = new Vec3d(0.0, 1.0, 0.0);
                                                                                                break block40;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        ** while (var9_9.getAxis() != Direction.Axis.X)
lbl60:
                                                                                        // 1 sources

                                                                                        break block49;
lbl61:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            continue;
                                                                                            break;
                                                                                        }
lbl63:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            ++var8_8;
                                                                                            ** GOTO lbl29
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    if (var2_2.world == null) break block38;
                                                                                    ** GOTO lbl52
                                                                                }
                                                                                v0 = new Vec3d(0.0, 1.0, 0.0);
                                                                                ** while (true)
lbl72:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (var20_20.getType() != HitResult.Type.BLOCK) break block41;
                                                                                    break block42;
                                                                                    break;
                                                                                }
                                                                                var12_12 = v0;
                                                                                if (var9_9.getAxis() != Direction.Axis.Y) break block50;
                                                                                break block51;
lbl78:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
lbl80:
                                                                                // 1 sources

                                                                                while (var12_12.getBlockPos().equals((Object)var1_1)) {
                                                                                    break block43;
                                                                                }
                                                                                break block47;
lbl83:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    v1 = new Vec3d(0.0, 0.0, 1.0);
                                                                                    break block40;
                                                                                    break;
                                                                                }
                                                                                var18_18 = var15_15[var17_17];
                                                                                var19_19 = var11_11.add(var18_18).subtract(var10_10.multiply(0.01));
                                                                                ** while (true)
                                                                            }
                                                                            if (var20_20.getBlockPos().equals((Object)var1_1)) ** GOTO lbl48
                                                                        }
lbl92:
                                                                        // 3 sources

                                                                        while (true) {
                                                                            ++var17_17;
                                                                            break block33;
                                                                            break;
                                                                        }
                                                                        var4_4 /* !! */  = var2_2.player.getEyePos();
                                                                        break block52;
lbl97:
                                                                        // 1 sources

                                                                        return var13_13;
lbl99:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var12_12 = this.IlI(var2_2, var4_4 /* !! */ , var11_11);
                                                                            ** GOTO lbl42
                                                                            break;
                                                                        }
                                                                    }
                                                                    v1 = new Vec3d(0.0, 0.0, 1.0);
                                                                    break block40;
lbl105:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var6_6 = Direction.values();
                                                                        var7_7 = var6_6.length;
                                                                        var8_8 = 0;
                                                                        ** GOTO lbl29
                                                                        break;
                                                                    }
lbl110:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                if (var12_12.getSide() != var9_9) break block47;
                                                                break block53;
                                                            }
                                                            return null;
                                                            v2 = new Vec3d[4];
                                                            break block54;
                                                            var21_21 = new llIII(var1_1.toImmutable(), var20_20.getPos(), var20_20);
                                                            if (!this.lIlIl(var2_2, var21_21)) ** GOTO lbl92
                                                            ** while (true)
                                                            var20_20 = this.IlI(var2_2, var4_4 /* !! */ , var19_19);
                                                            if (var20_20 != null) ** break;
                                                            ** while (true)
                                                            ** while (true)
                                                            var10_10 = var5_5.add(Vec3d.of((Vec3i)var9_9.getVector()).multiply(0.5));
                                                            var11_11 = var10_10.subtract(Vec3d.of((Vec3i)var9_9.getVector()).multiply(0.01));
                                                            ** while (true)
                                                        }
                                                        return null;
lbl131:
                                                        // 1 sources

                                                        while (true) {
                                                            if (!(var4_4 /* !! */ .subtract(var11_11).dotProduct(var10_10) <= 0.0)) ** continue;
                                                            ** GOTO lbl63
                                                            break;
                                                        }
                                                    }
                                                    var13_13 = v1;
                                                    ** while (true)
                                                }
                                                if (var12_12.getType() != HitResult.Type.BLOCK) break block47;
                                                ** GOTO lbl80
lbl140:
                                                // 1 sources

                                                while (true) {
                                                    var10_10 = Vec3d.of((Vec3i)var9_9.getVector());
                                                    var11_11 = var5_5.add(var10_10.multiply(0.5));
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            var3_3 = this.IIIlII(var2_2);
                                            if (var3_3 == null) ** GOTO lbl16
                                            ** while (true)
                                        }
                                        v2[0] = var12_12.multiply(0.25).add(var13_13.multiply(0.25));
                                        v2[1] = var12_12.multiply(-0.25).add(var13_13.multiply(0.25));
                                        ** while (true)
                                    }
                                    ** while (var9_9.getAxis() != Direction.Axis.X)
lbl154:
                                    // 1 sources

                                    ** while (true)
                                    v2[2] = var12_12.multiply(0.25).add(var13_13.multiply(-0.25));
                                    v2[3] = var12_12.multiply(-0.25).add(var13_13.multiply(-0.25));
                                    var14_14 = v2;
                                    ** while (true)
                                }
                                if (var17_17 < var16_16) ** break;
                                ** while (true)
                                ** while (true)
                                var4_4 /* !! */  = new llIII(var1_1.toImmutable(), var3_3.getPos(), var3_3);
                                if (this.lIlIl(var2_2, (llIII)var4_4 /* !! */ )) ** break;
                                ** while (true)
                                ** while (true)
                            }
                            var9_9 = var6_6[var8_8];
                            ** while (true)
lbl170:
                            // 1 sources

                            while (true) {
                                var9_9 = var6_6[var8_8];
                                ** continue;
                                break;
                            }
                        }
                        var2_2 = MinecraftClient.getInstance();
                        ** while (true)
                    }
                    var13_13 = new llIII(var1_1.toImmutable(), var12_12.getPos(), var12_12);
                    ** while (this.lIlIl((MinecraftClient)var2_2, (llIII)var13_13))
                }
                ++var8_8;
                break block55;
            }
            var5_5 = Vec3d.ofCenter((Vec3i)var1_1);
            var6_6 = Direction.values();
            var7_7 = var6_6.length;
            var8_8 = 0;
        }
        ** while (var8_8 >= var7_7)
lbl189:
        // 1 sources

        ** while (true)
    }

    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        if (this.IllI(minecraftClient)) {
            this.lIIIl(minecraftClient);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private llIII IlllII(MinecraftClient var1_1, BlockPos var2_2) {
        block53: {
            block64: {
                block59: {
                    block69: {
                        block70: {
                            block72: {
                                block50: {
                                    block68: {
                                        block74: {
                                            block67: {
                                                block71: {
                                                    block76: {
                                                        block73: {
                                                            block75: {
                                                                block47: {
                                                                    block63: {
                                                                        block56: {
                                                                            block52: {
                                                                                block66: {
                                                                                    block54: {
                                                                                        block62: {
                                                                                            block49: {
                                                                                                block58: {
                                                                                                    block61: {
                                                                                                        block60: {
                                                                                                            block57: {
                                                                                                                block55: {
                                                                                                                    block65: {
                                                                                                                        block48: {
                                                                                                                            block51: {
                                                                                                                                if (var1_1 == null) break block65;
                                                                                                                                break block66;
lbl3:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    break block47;
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
                                                                                                                                    var18_13.add(var2_2.offset(var15_10, 2));
                                                                                                                                    break block48;
                                                                                                                                    break;
                                                                                                                                }
lbl11:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    continue;
                                                                                                                                    break;
                                                                                                                                }
lbl13:
                                                                                                                                // 2 sources

                                                                                                                                while (true) {
                                                                                                                                    ++var21_17;
                                                                                                                                    break block49;
                                                                                                                                    break;
                                                                                                                                }
lbl16:
                                                                                                                                // 1 sources

                                                                                                                                while (var9_7 > 1.0E-4) {
                                                                                                                                    break block50;
                                                                                                                                }
                                                                                                                                break block67;
lbl19:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    var20_16.add(var25_24);
                                                                                                                                    break block51;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                while (true) {
                                                                                                                                    v0 = Direction.NORTH;
                                                                                                                                    break block52;
                                                                                                                                    break;
                                                                                                                                }
lbl26:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    continue;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                while (true) {
                                                                                                                                    var20_16.add(var2_2.offset(var15_10, 1).offset(var16_11, 1));
                                                                                                                                    ** continue;
                                                                                                                                    break;
                                                                                                                                }
lbl32:
                                                                                                                                // 2 sources

                                                                                                                                while (true) {
                                                                                                                                    continue;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            }
lbl35:
                                                                                                                            // 2 sources

                                                                                                                            while (true) {
                                                                                                                                ++var23_22;
                                                                                                                                break block53;
                                                                                                                                break;
                                                                                                                            }
lbl38:
                                                                                                                            // 1 sources

                                                                                                                            while (true) {
                                                                                                                                v1 = Direction.EAST;
                                                                                                                                break block54;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            while (true) {
                                                                                                                                var3_3 = this.IllII(var1_1);
                                                                                                                                ** continue;
                                                                                                                                break;
                                                                                                                            }
lbl44:
                                                                                                                            // 1 sources

                                                                                                                            while (true) {
                                                                                                                                v2 = 0.0;
                                                                                                                                break block55;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        if (var17_12) {
                                                                                                                            ** continue;
                                                                                                                        }
                                                                                                                        break block68;
                                                                                                                    }
lbl52:
                                                                                                                    // 4 sources

                                                                                                                    return null;
lbl54:
                                                                                                                    // 2 sources

                                                                                                                    while (true) {
                                                                                                                        v3 = false;
                                                                                                                        break block56;
                                                                                                                        break;
                                                                                                                    }
lbl57:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        if (!(var7_6 > 0.0)) break block57;
                                                                                                                        break block58;
lbl60:
                                                                                                                        // 1 sources

                                                                                                                        while (true) {
                                                                                                                            if (!(var7_6 > 0.0)) ** continue;
                                                                                                                            break block59;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
lbl64:
                                                                                                                // 2 sources

                                                                                                                while (true) {
                                                                                                                    continue;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            v1 = Direction.NORTH;
                                                                                                            break block54;
lbl69:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                var18_13.add(var2_2.offset(var16_11, 2));
                                                                                                                break block60;
                                                                                                                break;
                                                                                                            }
                                                                                                            var20_16.add(var2_2.offset(var15_10, 1).offset(var16_11.getOpposite(), 1));
                                                                                                            var20_16.add(var2_2.offset(var16_11, 1));
                                                                                                            break block62;
lbl78:
                                                                                                            // 1 sources

                                                                                                            return var19_14 /* !! */ ;
lbl80:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                break block61;
                                                                                                                break;
                                                                                                            }
lbl82:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                var20_16.add(var2_2.offset(var16_11, 1));
                                                                                                                break block62;
                                                                                                                break;
                                                                                                            }
lbl86:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                continue;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
lbl89:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            var19_14 /* !! */  = AutoSafeAnchor.IllIl;
                                                                                                            var20_15 = var19_14 /* !! */ .length;
                                                                                                            var21_17 = 0;
                                                                                                            break block49;
                                                                                                            break;
                                                                                                        }
lbl94:
                                                                                                        // 1 sources

                                                                                                        while (var5_5 > 0.0) {
                                                                                                            ** continue;
lbl96:
                                                                                                            // 1 sources

                                                                                                            ** GOTO lbl38
                                                                                                        }
                                                                                                        break block69;
lbl98:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            continue;
                                                                                                            break;
                                                                                                        }
                                                                                                        var13_9 = v2;
                                                                                                        if (!(var9_7 > 1.0E-4)) break block70;
                                                                                                        break block71;
lbl103:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            if (var2_2 != null) ** continue;
                                                                                                            ** GOTO lbl52
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    var19_14 /* !! */  = this.lIllI(var1_1, var2_2, var18_13, var3_3, var11_8, var13_9, var9_7);
                                                                                                    ** while (var19_14 /* !! */  == null)
lbl109:
                                                                                                    // 1 sources

                                                                                                    ** while (true)
                                                                                                }
                                                                                                v1 = Direction.SOUTH;
                                                                                                break block54;
lbl113:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    if (!var17_12) ** continue;
                                                                                                    break block63;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            ** while (var21_17 >= var20_15)
lbl118:
                                                                                            // 1 sources

                                                                                            break block72;
                                                                                        }
                                                                                        var21_18 = AutoSafeAnchor.IllIl;
                                                                                        var22_20 = var21_18.length;
                                                                                        var23_22 = 0;
                                                                                        break block53;
                                                                                    }
lbl125:
                                                                                    // 3 sources

                                                                                    while (true) {
                                                                                        continue;
lbl127:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            v0 = Direction.WEST;
                                                                                            break block52;
lbl130:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                if (!(var9_7 > 1.0E-4)) ** GOTO lbl54
                                                                                                break block64;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        }
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (var1_1.player == null) ** GOTO lbl52
                                                                                break block73;
                                                                            }
lbl137:
                                                                            // 4 sources

                                                                            while (true) {
                                                                                var16_11 = v0;
                                                                                ** continue;
                                                                                break;
                                                                            }
                                                                            var7_6 = var3_3.z - var4_4.z;
                                                                            var9_7 = Math.sqrt(var5_5 * var5_5 + var7_6 * var7_6);
                                                                            ** GOTO lbl16
lbl143:
                                                                            // 1 sources

                                                                            return this.lIllI(var1_1, var2_2, var20_16, var3_3, var11_8, var13_9, var9_7);
lbl145:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var18_13.add(var2_2.offset(var16_11, 2));
                                                                                ** continue;
                                                                                break;
                                                                            }
                                                                            var4_4 = Vec3d.ofCenter((Vec3i)var2_2);
                                                                            var5_5 = var3_3.x - var4_4.x;
                                                                            ** while (true)
                                                                        }
lbl153:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    var20_16.add(var2_2.offset(var15_10, 1).offset(var16_11, 1));
                                                                    ** while (true)
lbl159:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        v2 = var7_6 / var9_7;
                                                                        ** continue;
                                                                        break;
                                                                    }
lbl162:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var18_13.add(var23_21);
                                                                        ** GOTO lbl13
                                                                        break;
                                                                    }
                                                                    var15_10 = v1;
                                                                    if (!(var9_7 > 1.0E-4)) break block74;
                                                                    break block75;
lbl169:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var18_13.add(var2_2.offset(var15_10, 1).offset(var16_11, 2));
                                                                        ** continue;
                                                                        break;
                                                                    }
lbl173:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        v0 = Direction.EAST;
                                                                        ** GOTO lbl137
                                                                        break;
                                                                    }
                                                                }
                                                                var20_16 = new ArrayList<BlockPos>();
                                                                var20_16.add(var2_2.offset(var15_10, 1));
                                                                ** while (true)
                                                            }
                                                            if (Math.abs(var5_5) >= Math.abs(var7_6)) {
                                                                ** continue;
                                                            }
                                                            break block76;
                                                        }
                                                        if (var1_1.world != null) ** break;
                                                        ** while (true)
                                                        ** while (true)
                                                        var11_8 = v4;
                                                        ** while (!(var9_7 > 1.0E-4))
lbl191:
                                                        // 1 sources

                                                        ** while (true)
lbl192:
                                                        // 1 sources

                                                        while (true) {
                                                            if (!var18_13.contains(var23_21)) ** break;
                                                            ** continue;
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
                                                    ** while (!(var5_5 > 0.0))
lbl198:
                                                    // 1 sources

                                                    ** while (true)
                                                }
                                                ** while (!(Math.abs((double)var5_5) >= Math.abs((double)var7_6)))
lbl201:
                                                // 1 sources

                                                ** GOTO lbl94
                                            }
                                            v4 = 0.0;
                                            ** GOTO lbl32
                                        }
                                        v0 = Direction.EAST;
                                        ** GOTO lbl137
lbl208:
                                        // 1 sources

                                        while (true) {
                                            var23_21 = var2_2.offset(var22_19, 2);
                                            ** continue;
                                            break;
                                        }
                                        var18_13.add(var2_2.offset(var15_10, 1).offset(var16_11, 1));
                                        var18_13.add(var2_2.offset(var15_10, 2).offset(var16_11, 1));
                                        ** while (true)
                                    }
                                    var18_13.add(var2_2.offset(var15_10, 1).offset(var16_11, 1));
                                    var18_13.add(var2_2.offset(var15_10, 1).offset(var16_11.getOpposite(), 1));
                                    ** while (true)
                                }
                                v4 = var5_5 / var9_7;
                                ** while (true)
lbl225:
                                // 1 sources

                                while (true) {
                                    var24_23 = var21_18[var23_22];
                                    ** continue;
                                    break;
                                }
lbl228:
                                // 1 sources

                                while (true) {
                                    v3 = true;
                                    ** continue;
                                    break;
                                }
                            }
                            var22_19 = var19_14 /* !! */ [var21_17];
                            ** while (true)
                        }
                        v1 = Direction.NORTH;
                        ** GOTO lbl125
                    }
                    v1 = Direction.WEST;
                    ** while (true)
                }
                v0 = Direction.SOUTH;
                ** while (true)
            }
            if (Math.min(Math.abs(var5_5), Math.abs(var7_6)) / var9_7 > 0.3) ** break;
            ** while (true)
            ** while (true)
            var25_24 = var2_2.offset(var24_23, 1);
            ** while (var20_16.contains((Object)var25_24))
lbl249:
            // 1 sources

            ** while (true)
            var17_12 = v3;
            var18_13 = new ArrayList<BlockPos>();
            ** while (true)
        }
        ** while (var23_22 >= var22_20)
lbl255:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private llIII IlllIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        llIII llIII2;
        if (minecraftClient == null) return null;
        if (minecraftClient.world == null) return null;
        if (blockPos != null) {
            if (!this.IIIlll(minecraftClient.world.getBlockState(blockPos))) {
                return null;
            }
        } else {
            return null;
        }
        if (this.IlIll(minecraftClient, blockPos)) {
            return null;
        }
        BlockPos blockPos2 = blockPos.down();
        if (this.lIlII(minecraftClient, blockPos2) && (llIII2 = this.lII(minecraftClient, blockPos, blockPos2, Direction.UP)) != null) {
            return llIII2;
        }
        Direction direction = this.IIII(minecraftClient, blockPos);
        Direction[] directionArray = new Direction[]{direction, direction.getOpposite(), direction.rotateYClockwise(), direction.rotateYCounterclockwise(), Direction.DOWN};
        Direction[] directionArray2 = directionArray;
        int n = directionArray2.length;
        int n2 = 0;
        while (n2 < n) {
            Direction direction2 = directionArray2[n2];
            BlockPos blockPos3 = blockPos.offset(direction2.getOpposite());
            if (this.lIlII(minecraftClient, blockPos3)) return this.lII(minecraftClient, blockPos, blockPos3, direction2);
            ++n2;
        }
        return null;
    }

    private static int IllllI(int n, int n2) {
        return lIlll[n ^ 0x3B7274F9] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String Illlll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xAD74E7FE;
        char[] cArray = llIII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llIIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            AutoSafeAnchor.llIIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x86C5451E;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 4 -> 13;
                case 23 -> 91;
                case 24 -> 224;
                case 18 -> 45;
                case 27 -> 28;
                case 9 -> 144;
                case 25 -> 207;
                case 12 -> 90;
                case 7 -> 28;
                case 26 -> 225;
                case 6 -> 166;
                case 15 -> 243;
                case 19 -> 89;
                case 31 -> 138;
                case 5 -> 211;
                case 16 -> 244;
                case 21 -> 13;
                case 13 -> 197;
                case 29 -> 139;
                case 14 -> 39;
                case 20 -> 33;
                case 10 -> 153;
                case 28 -> 32;
                default -> 32;
                case 22 -> 92;
                case 1 -> 133;
                case 17 -> 39;
                case 3 -> 234;
                case 2 -> 31;
                case 11 -> 46;
                case 30 -> 218;
                case 8 -> 63;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

