/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIIlI
 * Module         : Auto Head Web  [COMBAT]
 * Description    : Places a cobweb at an opponent head when a reachable support block is adjacent.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Switch Delay
 *   - Falling Only
 *   - Web Delay
 *   - Prediction
 *   - .getBytes(
 *   - blocks
 *   - Range
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package orchard.module.combat;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BooleanSupplier;
import java.util.function.ToDoubleFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
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
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IIllllllI;
import orchard.internal.IlIIIllI;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIll;
import orchard.internal.IlIlllI;
import orchard.internal.IllIII;
import orchard.internal.IlllllII;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class AutoHeadWeb
extends ModuleBase {
    private int I = -1;
    private final lIlIIlI l;
    private long II;
    private final llIll Il;
    private final IIIlIlIIl lI;
    private final IIIlIlIIl ll;
    private long III;
    private final llIll IIl;
    private final lIlIIlI IlI;
    private final IlIlIlI Ill;
    private final IIIIIIIIl<IlIll> lII = this.IIlllIl(new IIIIIIIIl<IlIll>(StringFactory.IIII("r5FW3DRYVBk="), IlIll.class, IlIll.l));
    private final IIIIIIIIl<IlIIIllI> lIl = this.IIlllIl(new IIIIIIIIl<IlIIIllI>(StringFactory.IIII("qptAnQ1eXxLXJZBdCg=="), IlIIIllI.class, IlIIIllI.II));
    private int llI = -1;
    private static final int[] lll;
    private static final String[] IIII;
    private static final Object[] IIIl;

    @Override
    public void ll() {
        this.lllI();
        this.Ill.lIlIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean I(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        if (IIlI.IIl(minecraftClient)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private long l(IIIlIlIIl iIIlIlIIl) {
        double d = iIIlIlIIl.IIIl();
        double d2 = iIIlIlIIl.IIII();
        if (d != d2) return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d, d2)));
        return Math.max(0L, Math.round(d));
    }

    /*
     * Unable to fully structure code
     */
    private PlayerEntity lI(MinecraftClient var1_1) {
        block13: {
            block11: {
                block12: {
                    block10: {
                        block9: {
                            block14: {
                                break block14;
lbl1:
                                // 1 sources

                                while (var9_7 < var5_4) {
                                    var4_3 = var8_6;
                                    var5_4 = var9_7;
                                    break block9;
                                }
                                break block9;
lbl6:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var2_2 = (Double)this.l.lIl() * (Double)this.l.lIl();
                            var4_3 = null;
                            ** while (true)
lbl12:
                            // 1 sources

                            do {
                                if (((Boolean)this.IIl.lIl()).booleanValue()) break block10;
lbl14:
                                // 2 sources

                            } while (!((var9_7 = var1_1.player.squaredDistanceTo((Entity)var8_6)) <= var2_2));
                            ** GOTO lbl1
                        }
lbl17:
                        // 7 sources

                        block4: while (true) {
                            if (var7_5.hasNext()) {
                                break block11;
lbl20:
                                // 1 sources

                                while (true) {
                                    if (var8_6 == var1_1.player) continue block4;
                                    break block12;
                                    break;
                                }
                            }
                            return var4_3;
                        }
                    }
                    if (this.IlI(var8_6)) ** GOTO lbl14
                    ** GOTO lbl17
lbl27:
                    // 1 sources

                    while (true) {
                        if (var8_6.isCreative()) ** GOTO lbl17
                        break block13;
                        break;
                    }
lbl30:
                    // 1 sources

                    while (true) {
                        if (var8_6.isSpectator()) ** GOTO lbl17
                        ** continue;
                        break;
                    }
                    var5_4 = Infinity;
                    var7_5 = var1_1.world.getPlayers().iterator();
                    ** GOTO lbl17
                }
                if (!var8_6.isAlive()) ** GOTO lbl17
                ** while (true)
            }
            var8_6 = (PlayerEntity)var7_5.next();
            ** while (true)
        }
        ** while (!IIllllllI.l((PlayerEntity)var8_6))
lbl44:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIl(Box box, BlockPos blockPos) {
        double d = Math.max(box.minY, box.maxY - 0.8);
        double d2 = Math.max(0.0, Math.min(box.maxX, (double)blockPos.getX() + 1.0) - Math.max(box.minX, (double)blockPos.getX()));
        double d3 = Math.max(0.0, Math.min(box.maxY, (double)blockPos.getY() + 1.0) - Math.max(d, (double)blockPos.getY()));
        double d4 = Math.max(0.0, Math.min(box.maxZ, (double)blockPos.getZ() + 1.0) - Math.max(box.minZ, (double)blockPos.getZ()));
        return d2 * d3 * d4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(PlayerEntity playerEntity) {
        if (playerEntity == null) {
            return false;
        }
        if (playerEntity.isOnGround()) return false;
        if (playerEntity.isClimbing()) return false;
        if (playerEntity.isTouchingWater()) return false;
        if (playerEntity.isInLava()) return false;
        if (playerEntity.isGliding()) return false;
        if (playerEntity.fallDistance > 0.0) return true;
        if (playerEntity.getVelocity().y < -0.05) return true;
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        block8: {
            block7: {
                block6: {
                    block5: {
                        var1_1 = MinecraftClient.getInstance();
                        if (!this.I(var1_1)) break block5;
                        if (!IlIlllI.IIll() && !lIIllllI.llIlI()) break block6;
                        break block7;
                    }
                    return;
                }
                var2_10 = this.lI(var1_1);
                var3_2 = this.llII(var1_1);
                if (var2_10 == null) ** GOTO lbl-1000
                break block8;
            }
            this.lllI();
            return;
        }
        if (var3_2 >= 0) {
            var4_3 = this.lIIl(var1_1, var2_10);
            if (var4_3 == null) {
                this.lllI();
                this.Ill.III();
                return;
            }
            if (!this.Illl(var1_1, var2_10.getId(), var3_2)) {
                this.Ill.III();
                return;
            }
            if (this.lIl.lIl() != IlIIIllI.Il) {
                var5_8 = IlIlllI.llIlI(var1_1, 200, var4_3.I(), (IllIII)LambdaMetafactory.metafactory(null, null, null, ()Z, IIII(net.minecraft.client.MinecraftClient int orchard.internal.IlllllII ), ()Z)((AutoHeadWeb)this, (MinecraftClient)var1_1, (int)var3_2, (IlllllII)var4_3));
                return;
            }
        } else lbl-1000:
        // 2 sources

        {
            this.lllI();
            this.Ill.III();
            return;
        }
        var5_7 = this.Ill.llIIIl(var1_1, var4_3.l(), ((Double)this.IlI.lIl()).floatValue());
        var6_4 = var5_7 <= 1.0f || (var8_9 = var1_1.crosshairTarget) instanceof BlockHitResult != false && (var7_5 = (BlockHitResult)var8_9).getBlockPos().equals((Object)var4_3.l().getBlockPos()) != false && var7_5.getSide() == var4_3.l().getSide();
        if (var6_4 == false) return;
        this.Ill.III();
        var7_6 = lIIllllI.IlIIIl(var1_1, this, var3_2, (BooleanSupplier)LambdaMetafactory.metafactory(null, null, null, ()Z, IlII(net.minecraft.client.MinecraftClient orchard.internal.IlllllII ), ()Z)((MinecraftClient)var1_1, (IlllllII)var4_3));
        if (var7_6 == false) return;
        this.lllI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIl(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        BlockPos blockPos;
        Iterator<BlockPos> iterator = this.lIII(playerEntity).iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while (!minecraftClient.world.getBlockState(blockPos = iterator.next()).isOf(Blocks.COBWEB));
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private IlllllII lll(MinecraftClient var1_1, BlockPos var2_2) {
        block24: {
            block25: {
                block19: {
                    block28: {
                        block26: {
                            block18: {
                                block21: {
                                    block22: {
                                        block27: {
                                            block17: {
                                                block20: {
                                                    block16: {
                                                        block15: {
                                                            block23: {
                                                                var3_3 = var1_1.world.getBlockState(var2_2);
                                                                break block23;
lbl3:
                                                                // 1 sources

                                                                while (var2_2.equals((Object)var8_8.offset(var13_13.getSide()))) {
                                                                    break block15;
                                                                }
                                                                break block18;
lbl6:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
lbl8:
                                                                // 4 sources

                                                                return null;
lbl10:
                                                                // 1 sources

                                                                while (!var9_9.isOf(Blocks.WATER)) {
                                                                    break block16;
                                                                }
                                                                break block18;
lbl13:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (this.lIlI(var1_1, var11_11)) break block17;
                                                                    break block18;
                                                                    return null;
                                                                }
lbl18:
                                                                // 1 sources

                                                                while (var9_9.getCollisionShape((BlockView)var1_1.world, var8_8).isEmpty()) {
                                                                    break block18;
                                                                }
                                                                break block24;
                                                            }
                                                            if (!var3_3.getFluidState().isEmpty()) ** GOTO lbl8
                                                            break block25;
lbl24:
                                                            // 1 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
lbl26:
                                                            // 1 sources

                                                            while (true) {
                                                                if (var3_3.isOf(Blocks.LAVA)) ** GOTO lbl8
                                                                break block19;
                                                                break;
                                                            }
                                                            var13_13 = lIIllllI.IIIIllI(var1_1, (Entity)var1_1.player, var1_1.player.getEyePos(), var12_12);
                                                            if (var13_13 == null) break block26;
                                                            break block27;
                                                        }
                                                        return new IlllllII(var13_13.getPos(), var13_13);
                                                    }
                                                    if (var9_9.isOf(Blocks.LAVA)) break block18;
                                                    ** GOTO lbl18
lbl37:
                                                    // 2 sources

                                                    while (true) {
                                                        if (var6_6 >= var5_5) ** continue;
                                                        break block20;
                                                        break;
                                                    }
lbl40:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_4 = Direction.values();
                                                        var5_5 = var4_4.length;
                                                        var6_6 = 0;
                                                        ** GOTO lbl37
                                                        break;
                                                    }
                                                }
                                                var7_7 = var4_4[var6_6];
                                                ** while (true)
                                            }
                                            var12_12 = var11_11.subtract(Vec3d.of((Vec3i)var10_10.getVector()).multiply(0.01));
                                            ** while (true)
lbl51:
                                            // 1 sources

                                            while (true) {
                                                if (var9_9.isReplaceable()) break block18;
                                                break block21;
                                                break;
                                            }
lbl54:
                                            // 1 sources

                                            while (true) {
                                                if (var13_13.getType() != HitResult.Type.BLOCK) break block18;
                                                break block22;
                                                break;
                                            }
                                        }
                                        if (var13_13.getType() == HitResult.Type.BLOCK) break block28;
                                        break block26;
                                    }
                                    if (!var13_13.getBlockPos().equals((Object)var8_8)) break block18;
                                    ** GOTO lbl3
                                }
                                if (var9_9.getFluidState().isEmpty()) ** GOTO lbl10
                            }
lbl66:
                            // 3 sources

                            while (true) {
                                ++var6_6;
                                ** continue;
                                break;
                            }
                        }
                        var13_13 = var1_1.world.raycast(new RaycastContext(var1_1.player.getEyePos(), var12_12, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, (Entity)var1_1.player));
                        break block28;
lbl72:
                        // 1 sources

                        while (true) {
                            if (var9_9.isAir()) ** GOTO lbl66
                            ** continue;
                            break;
                        }
                    }
                    if (var13_13 != null) ** break;
                    ** while (true)
                    ** while (true)
                    var8_8 = var2_2.offset(var7_7);
                    var9_9 = var1_1.world.getBlockState(var8_8);
                    ** while (true)
                }
                ** while (var3_3.isReplaceable())
lbl84:
                // 1 sources

                ** GOTO lbl8
            }
            if (!var3_3.isOf(Blocks.WATER)) ** break;
            ** while (true)
            ** while (true)
        }
        var10_10 = var7_7.getOpposite();
        var11_11 = Vec3d.ofCenter((Vec3i)var8_8).add(Vec3d.of((Vec3i)var10_10.getVector()).multiply(0.5));
        ** while (true)
    }

    private /* synthetic */ boolean IIII(MinecraftClient minecraftClient, int n, IlllllII illlllII) {
        return lIIllllI.IlIIIl(minecraftClient, this, n, () -> {
            boolean bl = lIIllllI.lIllll(minecraftClient, illlllII.l());
            if (!bl) {
                return bl;
            }
            this.lllI();
            return bl;
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private Box IIlI(PlayerEntity playerEntity, Box box) {
        Box box2;
        boolean bl;
        Vec3d vec3d = playerEntity.getVelocity();
        double d = Math.hypot(vec3d.x, vec3d.z);
        boolean bl2 = !((Boolean)this.Il.lIl()).booleanValue() || !(d > 0.04) && !(Math.abs(vec3d.y) > 0.05) ? false : (bl = true);
        if (bl) {
            box2 = box.offset(vec3d.x * Math.min(1.8, d * 2.5), vec3d.y * Math.min(1.2, Math.abs(vec3d.y) * 2.0), vec3d.z * Math.min(1.8, d * 2.5));
            return box2;
        }
        box2 = box;
        return box2;
    }

    private static /* synthetic */ boolean IlII(MinecraftClient minecraftClient, IlllllII illlllII) {
        return lIIllllI.lIllll(minecraftClient, illlllII.l());
    }

    private static /* synthetic */ double IllI(Vec3d vec3d, BlockPos blockPos) {
        return Vec3d.ofCenter((Vec3i)blockPos).squaredDistanceTo(vec3d);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illl(MinecraftClient minecraftClient, int n, int n2) {
        long l2 = System.currentTimeMillis();
        if (this.llI != n || this.I != n2) {
            this.llI = n;
            this.I = n2;
            boolean bl = lIIllllI.llIllI(minecraftClient) != n2;
            this.III = l2 + (!bl ? 0L : this.l(this.ll));
            this.II = Long.MIN_VALUE;
        }
        if (l2 < this.III) {
            return false;
        }
        if (this.II == Long.MIN_VALUE) {
            this.II = l2 + this.l(this.lI);
        }
        if (l2 < this.II) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private List<BlockPos> lIII(PlayerEntity var1_1) {
        block19: {
            block22: {
                block21: {
                    block23: {
                        block16: {
                            block20: {
                                block17: {
                                    block15: {
                                        block18: {
                                            break block21;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl3:
                                            // 2 sources

                                            while (true) {
                                                if (var14_13 == var3_3) break block15;
                                                break block16;
                                                while (true) {
                                                    break block17;
                                                    break;
                                                }
                                                break;
                                            }
lbl8:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl10:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl12:
                                            // 2 sources

                                            while (true) {
                                                if (var16_15 > var11_11) break block18;
                                                break block19;
                                                break;
                                            }
                                            var7_7 = var6_6.getCenter();
                                            break block22;
                                        }
                                        ++var15_14;
lbl19:
                                        // 2 sources

                                        while (true) {
                                            if (var15_14 > var9_9) ** continue;
                                            break block20;
                                            break;
                                        }
lbl22:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
lbl25:
                                    // 3 sources

                                    while (true) {
                                        ++var16_15;
                                        ** GOTO lbl12
                                        break;
                                    }
                                }
                                var5_5.sort(Comparator.comparingDouble((ToDoubleFunction<BlockPos>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, IllI(net.minecraft.util.math.Vec3d net.minecraft.util.math.BlockPos ), (Lnet/minecraft/util/math/BlockPos;)D)((Vec3d)var7_7)));
                                return var5_5;
                                var10_10 = (int)Math.floor(Math.min(var2_2.minZ, var6_6.minZ));
                                var11_11 = (int)Math.floor(Math.max(var2_2.maxZ, var6_6.maxZ) - 1.0E-7);
                                ** while (true)
lbl34:
                                // 1 sources

                                while (true) {
                                    var5_5.add(var18_17);
                                    ** GOTO lbl25
                                    break;
                                }
lbl38:
                                // 1 sources

                                while (true) {
                                    if (!var5_5.contains(var18_17)) ** break;
                                    ** continue;
                                    ** continue;
                                    break;
                                }
                                var12_12 = var2_2.maxY - var1_1.getEyeY();
                                break block23;
lbl44:
                                // 1 sources

                                while (true) {
                                    var5_5.add(var17_16);
                                    ** GOTO lbl3
                                    break;
                                }
                            }
                            var16_15 = var10_10;
                            ** while (true)
lbl51:
                            // 1 sources

                            while (true) {
                                var6_6 = this.IIlI(var1_1, var2_2);
                                ** continue;
                                break;
                            }
                        }
                        var18_17 = new BlockPos(var15_14, var14_13, var16_15);
                        ** while (true)
lbl57:
                        // 1 sources

                        while (true) {
                            var5_5.add(var4_4);
                            ** continue;
                            break;
                        }
                    }
                    var14_13 = (int)Math.floor(var6_6.maxY - var12_12);
                    var15_14 = var8_8;
                    ** while (true)
                }
                var2_2 = var1_1.getBoundingBox();
                var3_3 = (int)Math.floor(var1_1.getEyeY());
                ** while (true)
                var4_4 = BlockPos.ofFloored((double)var1_1.getX(), (double)var3_3, (double)var1_1.getZ());
                var5_5 = new ArrayList<BlockPos>();
                ** while (true)
lbl72:
                // 1 sources

                while (true) {
                    if (!var5_5.contains(var17_16)) ** break;
                    ** continue;
                    ** continue;
                    break;
                }
            }
            var8_8 = (int)Math.floor(Math.min(var2_2.minX, var6_6.minX));
            var9_9 = (int)Math.floor(Math.max(var2_2.maxX, var6_6.maxX) - 1.0E-7);
            ** while (true)
        }
        var17_16 = new BlockPos(var15_14, var3_3, var16_15);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlllllII lIIl(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        BlockPos blockPos;
        IlllllII illlllII;
        if (this.lII.lIl() == IlIll.II) {
            if (!this.lIl(minecraftClient, playerEntity)) return this.llIl(minecraftClient, playerEntity);
            return null;
        }
        Iterator<BlockPos> iterator = this.lIII(playerEntity).iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while ((illlllII = this.lll(minecraftClient, blockPos = iterator.next())) == null);
        return illlllII;
    }

    private boolean lIlI(MinecraftClient minecraftClient, Vec3d vec3d) {
        double d = Math.max(0.0, minecraftClient.player.getBlockInteractionRange() - 0.1);
        return minecraftClient.player.getEyePos().squaredDistanceTo(vec3d) <= d * d;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lIll(PlayerEntity playerEntity, BlockPos blockPos) {
        Box box = playerEntity.getBoundingBox();
        Box box2 = this.IIlI(playerEntity, box);
        double d = this.IIl(box, blockPos);
        if (box2 == box) return d;
        return d += this.IIl(box2, blockPos);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int llII(MinecraftClient minecraftClient) {
        int n = 0;
        while (n < 9) {
            ItemStack itemStack = minecraftClient.player.getInventory().getStack(n);
            if (itemStack != null && itemStack.isOf(Items.COBWEB)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void llll() {
        this.lllI();
        this.Ill.IlIIIlI();
        this.Ill.III();
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlllllII llIl(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        IlllllII illlllII = null;
        double d = -1.0;
        Iterator<BlockPos> iterator = this.lIII(playerEntity).iterator();
        while (iterator.hasNext()) {
            double d2;
            BlockPos blockPos = iterator.next();
            IlllllII illlllII2 = this.lll(minecraftClient, blockPos);
            if (illlllII2 == null || !((d2 = this.lIll(playerEntity, blockPos)) > d)) continue;
            illlllII = illlllII2;
            d = d2;
        }
        return illlllII;
    }

    private void lllI() {
        this.llI = -1;
        this.I = -1;
        this.III = Long.MIN_VALUE;
        this.II = Long.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public AutoHeadWeb() {
        super(StringFactory.IIII("Auto Head Web"), Category.II, StringFactory.IIII("Places a cobweb at an opponent head when a reachable support block is adjacent."));
        this.IlI = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("uZ1Z3CpHVRmT"), 50.0, 1.0, 100.0, 1.0).lIII(() -> {
            if (this.lIl.lIl() != IlIIIllI.Il) return false;
            return true;
        }));
        this.l = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Range"), 4.5, 1.0, 6.0, 0.1).IIII(StringFactory.IIII("blocks")));
        this.ll = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Switch Delay"), 0.0, 0.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.lI = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Web Delay"), 50.0, 75.0, 0.0, 500.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.Il = this.IIlllIl(new llIll((Object)StringFactory.IIII("Prediction"), true));
        this.IIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Falling Only"), false));
        this.Ill = new IlIlIlI();
        this.III = Long.MIN_VALUE;
        this.II = Long.MIN_VALUE;
    }

    private static int IIIII(int n, int n2) {
        return lll[n ^ 0x7089033F] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block33: {
            block32: {
                block31: {
                    block30: {
                        block28: {
                            block29: {
                                block27: {
                                    block26: {
                                        block25: {
                                            break block31;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                var3_4 += 4;
                                                if (++var4_5 < var1_2) break block25;
                                                break block26;
                                                break;
                                            }
lbl5:
                                            // 1 sources

                                            while (true) {
                                                var13_13 = -1;
                                                break block27;
                                                break;
                                            }
lbl8:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl10:
                                            // 1 sources

                                            while (true) {
                                                v0 = 35;
                                                break block28;
                                                break;
                                            }
lbl13:
                                            // 1 sources

                                            while (true) {
                                                continue;
lbl15:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                                v1 = var15_15++;
                                                var14_14[v1] = (char)(var14_14[v1] ^ var16_16);
                                                break block29;
                                                break;
                                            }
                                        }
lbl21:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl23:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    return;
lbl27:
                                    // 1 sources

                                    while (++var10_10 >= var8_8.length) {
                                        break block30;
                                    }
                                    break block32;
lbl30:
                                    // 1 sources

                                    while (true) {
                                        v0 = 33;
                                        break block28;
                                        break;
                                    }
                                    var9_9[var10_10] = new String(var14_14).intern();
                                    var11_11 += var12_12;
                                    ** GOTO lbl27
lbl36:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl38:
                                    // 1 sources

                                    while (true) {
                                        v0 = 35;
                                        break block28;
                                        break;
                                    }
lbl41:
                                    // 1 sources

                                    while (true) {
                                        v0 = 9;
                                        break block28;
                                        break;
                                    }
lbl44:
                                    // 1 sources

                                    while (true) {
                                        var9_9 = new String[var8_8.length];
                                        ** continue;
                                        break;
                                    }
                                    var1_2 = var0_1.length / 4;
                                    AutoHeadWeb.lll = new int[var1_2];
                                    ** while (true)
lbl50:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl52:
                                    // 2 sources

                                    while (true) {
                                        switch (var15_15 % 5) {
                                            default: {
                                                ** continue;
                                            }
                                            case 2: {
                                                ** continue;
                                            }
                                            case 3: {
                                                ** continue;
                                            }
                                            case 4: {
                                                ** continue;
                                            }
                                            case 1: 
                                        }
                                        v0 = 47;
                                        break block28;
                                        break;
                                    }
                                }
lbl66:
                                // 2 sources

                                while (true) {
                                    var10_10 = 0;
                                    var11_11 = 0;
                                    ** continue;
                                    break;
                                }
lbl70:
                                // 1 sources

                                while (true) {
                                    var8_8 = "\u0f86\u0ffe\u0f9e\u0f86\u0f9e\u0f9a\u0f9a\u0f82\u0f96\u0f9e\u0f96\u0f82\u0f82".toCharArray();
                                    ** continue;
                                    break;
                                }
                            }
                            if (var15_15 < var14_14.length) ** GOTO lbl52
                            ** while (true)
                            var12_12 = 0;
                            if (var13_13 != 0) break block32;
                            break block33;
                        }
                        var16_16 = v0;
                        ** while (true)
                    }
                    var13_13 = 0;
                    ** while (true)
                    var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                    AutoHeadWeb.lll[var4_5] = var5_6 ^= var2_3;
                    ** while (true)
                    var2_3 = 1777063670;
                    var0_1 = "\u00b0\u009b\u00ca\u00f5\u00cdF\u0004\u00c9".getBytes("ISO-8859-1");
                    ** while (true)
lbl91:
                    // 1 sources

                    while (true) {
                        AutoHeadWeb.IIIl = new Object[var9_9.length];
                        ** continue;
                        break;
                    }
                }
                var6 = 3986;
                var7_7 = "\u69ed\u69a3\u69f1\u69f1\u69a2\u699c\u6988\u6927\u69c8\u6972\u6913\u69b5\u690b\u6905\u69a9\u69ba\u69fb\u6900\u69c5\u69b4\ub015\ub04c\ub023\ub01a\ub05b\ub029\ub060\ub0b1\ub027\ub09e\ub0ee\ub045\ub0e7\ub087\ub07f\ub047\ub004\ub0e3\ub066\ub016\ub0ab\ub059\ub05c\ub0c7\ub0ed\ub05b\ub0d1\ub0d2\ub05e\ub0d0\ub0d7\ub0ec\ub00e\ub07d\ub006\ub01e\ub04b\ub012\ub05c\ub094\ub00c\ub08a\ub0be\ub075\ub0e0\ub0e4\ub05f\ub044\ub00b\ub0e9\ub03d\ub005\ub0df\ub051\ub07a\ub0cc\ub0be\ub023\ub09e\ub0e9\ub028\ub0b3\ub0df\ub0fa\ub023\ub050\ub01f\ub017\ub072\ub02d\ub078\ub0bf\ub032\ub0a7\ub08e\ub059\ub0e8\ub084\ub026\ub041\ub01b\ub09a\ub04e\ub00c\ub0d9\ub07f\ub04a\ub0e2\ub0c7\ub071\ub0b8\ub0cf\ub05c\ub0fa\ub080\ub0f4\ub006\ub059\ub024\ub005\ub047\ub01c\ub05e\ub0be\ub023\ub0b7\ub0ec\ub02e\u0a18\u0a3d\u0a03\u0a15\u0a08\u0a1b\u0a44\u0aa3\u0a3a\u0a90\u0ab8\u0a2e\u18f0\u1893\u18da\u18e8\u18be\u18e5\u18cc\u1874\u18df\u1841\u1874\u18a0\u180b\u180d\u189a\u18a4\u18e5\u182f\u18dc\u18ad\u2c4c\u2c01\u2c27\u2c4b\u2c5b\u2c4f\u2c35\u2ce1\u2c69\u2cd3\u2ced\u2c14\u1cbd\u1cde\u1cb5\u1c85\u1cf0\u1c81\u1cc7\u1c61\uc1ed\uc192\uc1c7\uc1ca\uc1bf\uc1cd\uc1b6\uc155\uf052\uf075\uf042\uf06f\uf01b\uf054\uf02f\uf0d5\uf060\uf0df\uf0f3\uf009\uf0a1\uf0bf\uf04f\uf023\u853a\u856d\u851a\u8543\u7d07\u7d22\u7d1c\u7d0a\u7d17\u7d04\u7d38\u7db6\u7d2b\u7d8f\u7dfe\u7d43\u7496\u74c1\u74b6\u74ef\u5f76\u5f2c\u5f72\u5f7d\u5f3b\u5f70\u5f39\u5fc2\u5f53\u5ffd\u5fe9\u5f27\u5f85\u5fb6\u5f63\u5f7b\u85a5\u85c1\u85aa\u85a2\u85e9\u85a4\u85ed\u8519\u8583\u855a\u8513\u859e\u8551\u8575\u85c4\u85d3";
                ** while (true)
                var3_4 = 0;
                var4_5 = 0;
                ** while (true)
            }
            var12_12 = var8_8[var10_10] ^ var6;
            var14_14 = var7_7.substring(var11_11, var11_11 + var12_12).toCharArray();
            var15_15 = 0;
            ** while (true)
        }
        AutoHeadWeb.IIII = var9_9;
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String IIIIl(int var0, int var1_1) {
        var3_2 = var0 ^ -823039314;
        var4_4 = AutoHeadWeb.IIII[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])AutoHeadWeb.IIIl[var3_2];
        if (var2_3 != null) {
            var5_5 = var2_3;
        } else {
            var5_5 = new Throwable().getStackTrace();
            AutoHeadWeb.IIIl[var3_2] = var5_5;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -627661738;
        var8_8 = 0;
        if (true) ** GOTO lbl16
        while (true) {
            if (++var8_8 >= var4_4.length) {
                return new String(var4_4).intern();
            }
lbl16:
            // 3 sources

            switch (var8_8 & 31) {
                case 30: {
                    var9_9 = 50;
                    break;
                }
                case 25: {
                    var9_9 = 204;
                    break;
                }
                case 13: {
                    var9_9 = 111;
                    break;
                }
                case 27: {
                    var9_9 = 85;
                    break;
                }
                case 18: {
                    var9_9 = 217;
                    break;
                }
                case 17: {
                    var9_9 = 114;
                    break;
                }
                case 20: {
                    var9_9 = 69;
                    break;
                }
                case 15: {
                    var9_9 = 248;
                    break;
                }
                case 3: {
                    var9_9 = 145;
                    break;
                }
                case 23: {
                    var9_9 = 91;
                    break;
                }
                case 6: {
                    var9_9 = 201;
                    break;
                }
                case 24: {
                    var9_9 = 92;
                    break;
                }
                case 21: {
                    var9_9 = 248;
                    break;
                }
                case 7: {
                    var9_9 = 43;
                    break;
                }
                case 12: {
                    var9_9 = 123;
                    break;
                }
                case 19: {
                    var9_9 = 130;
                    break;
                }
                case 26: {
                    var9_9 = 48;
                    break;
                }
                case 10: {
                    var9_9 = 0;
                    break;
                }
                case 5: {
                    var9_9 = 140;
                    break;
                }
                default: {
                    var9_9 = 185;
                    break;
                }
                case 29: {
                    var9_9 = 22;
                    break;
                }
                case 2: {
                    var9_9 = 148;
                    break;
                }
                case 28: {
                    var9_9 = 197;
                    break;
                }
                case 16: {
                    var9_9 = 146;
                    break;
                }
                case 1: {
                    var9_9 = 215;
                    break;
                }
                case 8: {
                    var9_9 = 191;
                    break;
                }
                case 4: {
                    var9_9 = 194;
                    break;
                }
                case 11: {
                    var9_9 = 204;
                    break;
                }
                case 14: {
                    var9_9 = 202;
                    break;
                }
                case 22: {
                    var9_9 = 238;
                    break;
                }
                case 9: {
                    var9_9 = 43;
                    break;
                }
                case 31: {
                    var9_9 = 112;
                }
            }
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
        }
    }
}

