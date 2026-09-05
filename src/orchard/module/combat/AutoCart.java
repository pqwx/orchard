/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIlIIl
 * Module         : AutoCart  [COMBAT]
 * Description    : Automatically places a rail and minecart at a flaming arrow impact point.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Switch Delay
 *   - .getBytes(
 *   - Delay
 *   - flame
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
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.projectile.PersistentProjectileEntity
 *  net.minecraft.entity.vehicle.TntMinecartEntity
 *  net.minecraft.item.BowItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Direction
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
import java.lang.invoke.LambdaMetafactory;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.vehicle.TntMinecartEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.entry.RegistryEntry;
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
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlIll;
import orchard.internal.IlIlllI;
import orchard.internal.lIIIlI;
import orchard.internal.lIIlIIll;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlllll;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class AutoCart
extends ModuleBase {
    private int I;
    private float l;
    private final lIlIIlI II;
    private static final double Il = 0.05;
    private static final double lI = 0.0625;
    private static final double ll = 0.125;
    private static final int III = 2;
    private final IlIlIlI IIl;
    private boolean IlI;
    private int Ill;
    private ClientPlayerEntity lII;
    private boolean lIl;
    private float llI;
    private static final double lll = 4.5;
    private long IIII;
    private static final int IIIl = 20;
    private final lIIlIIll IIlI;
    private final IIIIIIIIl<lIIIlI> IIll = this.IIlllIl(new IIIIIIIIl<lIIIlI>(StringFactory.IIII("qptAnQ1eXxLXJZBdCg=="), lIIIlI.class, lIIIlI.l));
    private final Set<UUID> IlII;
    private boolean IlIl;
    private long IllI = 0L;
    private final IIIlIlIIl Illl;
    private static final int lIII = 20;
    private static final int lIIl = 8;
    private static final int lIlI = 320;
    private static final long lIll = 1500L;
    private static final float llII = 0.1f;
    private int llIl;
    private int lllI;
    private boolean llll;
    private IlIlIll IIIII;
    private int IIIIl;
    private int IIIlI;
    private int IIIll;
    private final Set<UUID> IIlII;
    private BlockPos IIlIl;
    private boolean IIllI;
    private int IIlll;
    private int IlIII;
    private long IlIIl;
    private int IlIlI;
    private lIlllll IlIll;
    private int IllII;
    private static final double IllIl = 0.99;
    private float IlllI;
    private int Illll;
    private ClientWorld lIIII;
    private static final double lIIIl = 20.25;
    private final llIll lIIlI;
    private static final int[] lIIll;
    private static final String[] lIlII;
    private static final Object[] lIlIl;

    /*
     * Unable to fully structure code
     */
    private void lI(MinecraftClient var1_1) {
        block36: {
            block42: {
                block38: {
                    block46: {
                        block43: {
                            block39: {
                                block28: {
                                    block45: {
                                        block34: {
                                            block37: {
                                                block40: {
                                                    block30: {
                                                        block35: {
                                                            block32: {
                                                                block41: {
                                                                    block29: {
                                                                        block44: {
                                                                            block33: {
                                                                                block31: {
                                                                                    block24: {
                                                                                        block25: {
                                                                                            block27: {
                                                                                                block26: {
                                                                                                    if (var1_1 == null) break block33;
                                                                                                    break block40;
lbl3:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        continue;
                                                                                                        break;
                                                                                                    }
lbl5:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        if (var6_6.age > 3) break block24;
                                                                                                        break block25;
                                                                                                        break;
                                                                                                    }
lbl8:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        this.IlII.clear();
                                                                                                        break block26;
                                                                                                        break;
                                                                                                    }
lbl11:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        this.lIIIl(var1_1);
                                                                                                        break block27;
                                                                                                        break;
                                                                                                    }
                                                                                                    this.IlllI = BowItem.getPullProgress((int)var2_2.getItemUseTime());
                                                                                                    if (!(this.IlllI >= 0.1f)) break block41;
                                                                                                    break block42;
                                                                                                }
lbl18:
                                                                                                // 3 sources

                                                                                                return;
                                                                                            }
                                                                                            while (true) {
                                                                                                if (!this.IIllI) ** GOTO lbl18
                                                                                                break block28;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        if (!(var7_7 < 9.0)) break block24;
                                                                                        break block43;
lbl27:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            this.IIllll(var6_6.getUuid());
                                                                                            break block29;
                                                                                            break;
                                                                                        }
lbl30:
                                                                                        // 1 sources

                                                                                        while (var2_2.isUsingItem()) {
                                                                                            break block30;
                                                                                        }
                                                                                        break block44;
lbl33:
                                                                                        // 1 sources

                                                                                        return;
lbl35:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            break block31;
                                                                                            break;
                                                                                        }
                                                                                    }
lbl38:
                                                                                    // 10 sources

                                                                                    while (true) {
                                                                                        if (var4_4.hasNext()) ** break;
                                                                                        ** continue;
                                                                                        break block32;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var2_2 = var1_1.player;
                                                                                var3_3 = var2_2.getActiveItem();
                                                                                ** GOTO lbl30
lbl46:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (var1_1.world == null) break block33;
                                                                                    break block34;
                                                                                    break;
                                                                                }
lbl49:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    this.IIllI = false;
                                                                                    ** continue;
                                                                                    break;
                                                                                }
                                                                            }
lbl53:
                                                                            // 3 sources

                                                                            while (true) {
                                                                                continue;
                                                                                break;
                                                                            }
lbl55:
                                                                            // 1 sources

                                                                            while (var6_6.getOwner() != var2_2) {
                                                                                break block35;
                                                                            }
                                                                            break block43;
                                                                        }
lbl59:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            if (!this.llll) ** continue;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    this.IIIIl(var1_1);
                                                                    ** while (true)
lbl65:
                                                                    // 1 sources

                                                                    return;
lbl67:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (!(var7_7 < 25.0)) ** GOTO lbl38
                                                                        ** GOTO lbl55
                                                                        break;
                                                                    }
                                                                    this.IIIlll();
                                                                    this.IIllI = false;
                                                                    ** while (true)
lbl73:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (this.IlII.contains(var6_6.getUuid())) ** GOTO lbl38
                                                                        break block36;
                                                                        break;
                                                                    }
lbl76:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (!var6_6.isOnFire()) ** GOTO lbl38
                                                                        ** continue;
                                                                        break;
                                                                    }
lbl79:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (this.IIlIl == null) break block37;
                                                                        break block38;
                                                                        break;
                                                                    }
                                                                }
                                                                v0 = false;
                                                                break block45;
lbl85:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (!(var5_5 instanceof PersistentProjectileEntity)) ** GOTO lbl38
                                                                    break block39;
                                                                    break;
                                                                }
lbl88:
                                                                // 1 sources

                                                                return;
                                                            }
                                                            var5_5 = (Entity)var4_4.next();
                                                            ** while (true)
                                                        }
                                                        if (var6_6.getOwner() != null) ** GOTO lbl38
                                                        ** while (true)
                                                    }
                                                    ** while (!this.IIlllI((ItemStack)var3_3))
lbl98:
                                                    // 1 sources

                                                    ** while (true)
                                                }
                                                if (var1_1.player == null) ** GOTO lbl53
                                                ** while (true)
                                            }
                                            var4_4 = var1_1.world.getEntities().iterator();
                                            ** GOTO lbl38
                                        }
                                        ** while (var1_1.interactionManager != null)
lbl107:
                                        // 1 sources

                                        ** while (true)
                                    }
lbl109:
                                    // 2 sources

                                    while (true) {
                                        this.llll = v0;
                                        ** continue;
                                        break;
                                    }
                                }
                                ++this.IIlll;
                                break block46;
                            }
                            var6_6 = (PersistentProjectileEntity)var5_5;
                            if (var6_6.age > 10) ** GOTO lbl38
                            ** while (true)
                        }
                        if (!this.IIIIIl(var1_1, new Vec3d(var6_6.getX(), var6_6.getY(), var6_6.getZ()), var6_6.getVelocity())) ** GOTO lbl38
                        ** while (true)
                    }
                    ** while (this.IIlll <= 20)
                }
                this.IIllI = false;
                ** while (true)
            }
            v0 = true;
            ** while (true)
        }
        if (!this.IIlII.contains(var6_6.getUuid())) ** break;
        ** while (true)
        var7_7 = var6_6.squaredDistanceTo((Entity)var2_2);
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player != this.lII) return false;
        if (minecraftClient.world != this.lIIII) return false;
        return true;
    }

    private BlockHitResult IlI(BlockPos blockPos) {
        if (blockPos == null) {
            return null;
        }
        return new BlockHitResult(this.IIlIl(blockPos), Direction.UP, blockPos.down(), false);
    }

    private int lII(PlayerEntity playerEntity) {
        int n = 0;
        while (true) {
            block2: {
                block3: {
                    block1: {
                        if (n >= 9) break block1;
                        ItemStack itemStack = playerEntity.getInventory().getStack(n);
                        if (!this.lll(itemStack)) break block2;
                        break block3;
                    }
                    return -1;
                }
                return n;
            }
            ++n;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(MinecraftClient minecraftClient, boolean bl) {
        if (bl) {
            this.lIIlI(minecraftClient);
        }
        if (minecraftClient != null && minecraftClient.player != null) {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        }
        this.IlIll = null;
        this.IlIlI = 0;
        this.I = Integer.MIN_VALUE;
        this.IlIl = false;
        this.IlIlll();
        this.IlIlI();
        this.IIIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (itemStack.isOf(Items.RAIL)) return true;
        if (itemStack.isOf(Items.POWERED_RAIL)) return true;
        if (itemStack.isOf(Items.DETECTOR_RAIL)) return true;
        if (!itemStack.isOf(Items.ACTIVATOR_RAIL)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIII(MinecraftClient minecraftClient, Vec3d vec3d, BlockPos blockPos) {
        BlockHitResult blockHitResult = minecraftClient.world.raycast(new RaycastContext(minecraftClient.player.getEyePos(), vec3d, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, (Entity)minecraftClient.player));
        if (blockHitResult == null) return false;
        if (blockHitResult.getBlockPos().equals((Object)blockPos)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIlI(PlayerEntity playerEntity, Item item) {
        int n = 0;
        while (n < 9) {
            ItemStack itemStack = playerEntity.getInventory().getStack(n);
            if (itemStack.isOf(item)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient, BlockPos blockPos) {
        Box box;
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) {
            return false;
        }
        box((double)blockPos.getX() + 0.2, (double)blockPos.getY() - 0.25, (double)blockPos.getZ() + 0.2, (double)blockPos.getX() + 0.8, (double)blockPos.getY() + 1.25, (double)blockPos.getZ() + 0.8);
        Box box2 = box;
        if (minecraftClient.world.getEntitiesByClass(TntMinecartEntity.class, box2, tntMinecartEntity -> {
            if (!tntMinecartEntity.isAlive()) return false;
            if (tntMinecartEntity.isRemoved()) return false;
            if (!AutoCart.IllI(blockPos, tntMinecartEntity.getEntityPos())) return false;
            return true;
        }).isEmpty()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean IllI(BlockPos blockPos, Vec3d vec3d) {
        if (blockPos == null) return false;
        if (vec3d == null) {
            return false;
        }
        double d = (double)blockPos.getX() + 0.5;
        double d2 = (double)blockPos.getZ() + 0.5;
        if (!(Math.abs(vec3d.x - d) <= 0.3)) return false;
        if (!(Math.abs(vec3d.z - d2) <= 0.3)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illl() {
        if (this.IlIll != null) return true;
        if (this.IIlIl != null) return true;
        if (this.IIIll >= 0) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIII(MinecraftClient minecraftClient) {
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
    private void lIIl(MinecraftClient minecraftClient, lIlllll lIlllll2) {
        if (this.IlIll != lIlllll2) {
            return;
        }
        ++this.IlIlI;
        this.IIIIlI();
        if (this.IlIlI <= 20) return;
        this.IlIll = null;
        this.I = Integer.MIN_VALUE;
        this.lIIlI(minecraftClient);
        this.lIll(minecraftClient, lIlllll2.II());
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlI(MinecraftClient minecraftClient) {
        int n;
        block12: {
            block15: {
                boolean bl;
                float f;
                float[] fArray;
                boolean bl2;
                boolean bl3;
                long l2;
                BlockPos blockPos;
                block20: {
                    block21: {
                        block18: {
                            block17: {
                                block19: {
                                    block16: {
                                        block14: {
                                            block13: {
                                                if (this.IIlIl == null) return;
                                                if (minecraftClient == null) return;
                                                if (minecraftClient.player == null) return;
                                                if (minecraftClient.player.age < this.IlIII) return;
                                                if (minecraftClient.player.age < this.llIl) {
                                                    return;
                                                }
                                                blockPos = this.IIlIl;
                                                n = this.Ill;
                                                l2 = this.IIII;
                                                if (minecraftClient == null || minecraftClient.player == null || minecraftClient.world == null || minecraftClient.interactionManager == null) break block12;
                                                if (this.IllII != Integer.MIN_VALUE) {
                                                    if (minecraftClient.player.age <= this.IllII) {
                                                        return;
                                                    }
                                                    this.IllII = Integer.MIN_VALUE;
                                                    this.IIIIl = Integer.MIN_VALUE;
                                                }
                                                if (!this.lIl) break block13;
                                                if (this.IlII(minecraftClient, blockPos)) break block14;
                                                if (minecraftClient.player.age <= this.lllI) {
                                                    return;
                                                }
                                                break block15;
                                            }
                                            if (!this.llIl(minecraftClient.world.getBlockState(blockPos))) {
                                                if (minecraftClient.player.age - this.IlIII > 20) {
                                                    this.lIIlI(minecraftClient);
                                                    this.lIll(minecraftClient, n);
                                                    this.IlIlll();
                                                    return;
                                                }
                                                return;
                                            }
                                            break block16;
                                        }
                                        this.IIIIII(minecraftClient, n);
                                        return;
                                    }
                                    if (this.IlII(minecraftClient, blockPos)) {
                                        this.IIIIII(minecraftClient, n);
                                        return;
                                    }
                                    if (!this.llIII(minecraftClient, blockPos)) {
                                        this.IlllII(minecraftClient, n);
                                        return;
                                    }
                                    int n2 = this.IIIll((PlayerEntity)minecraftClient.player);
                                    if (n2 < 0) break block17;
                                    bl3 = this.IlIII(minecraftClient, n2);
                                    boolean bl4 = bl2 = minecraftClient.player.age == this.IIIIl;
                                    if (this.lIlIl(minecraftClient, blockPos)) break block18;
                                    fArray = IlIlllI.IlIll(minecraftClient, this.IIlIlI(blockPos));
                                    if (fArray == null) {
                                        this.IlllII(minecraftClient, n);
                                        return;
                                    }
                                    if (this.IIll.lIl() != lIIIlI.II) break block19;
                                    if (this.IllI != 0L) break block20;
                                    break block21;
                                }
                                if (bl3) {
                                    this.IlIIl(minecraftClient, l2, blockPos, n, fArray[0], fArray[1], bl2);
                                    return;
                                }
                                return;
                            }
                            this.IlllII(minecraftClient, n);
                            return;
                        }
                        if (!bl3) return;
                        this.IlIIl(minecraftClient, l2, blockPos, n, minecraftClient.player.getYaw(), minecraftClient.player.getPitch(), bl2);
                        return;
                    }
                    this.IllI = System.currentTimeMillis();
                }
                float f2 = f = (bl = this.lIlIl(minecraftClient, blockPos)) ? 0.0f : this.IIl.llIIIl(minecraftClient, this.IIIllI(blockPos), ((Double)this.II.lIl()).floatValue());
                if (!bl3) {
                    return;
                }
                if (!bl && !(f <= 0.5f)) {
                    if (System.currentTimeMillis() - this.IllI < 1500L) return;
                    this.lIIlI(minecraftClient);
                    this.lIll(minecraftClient, n);
                    this.IlIlll();
                    return;
                }
                float f3 = bl ? minecraftClient.player.getYaw() : fArray[0];
                float f4 = bl ? minecraftClient.player.getPitch() : fArray[1];
                if (!this.IlIIl(minecraftClient, l2, blockPos, n, f3, f4, bl2)) return;
                this.IllI = 0L;
                return;
            }
            this.lIl = false;
            this.lllI = Integer.MIN_VALUE;
            this.IlllII(minecraftClient, n);
            return;
        }
        this.lIll(minecraftClient, n);
        this.IlIlll();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIll(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (n < 0) return;
        if (n < 9) {
            if (!((Boolean)this.lIIlI.lIl()).booleanValue()) {
                lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
                this.IlIlI();
                this.IIIIlI();
                return;
            }
            this.IIIIlI();
            this.IIIll = n;
        }
        return;
        this.Illll = minecraftClient.player.age + (this.IIll.lIl() == lIIIlI.II ? 1 : 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d llII(MinecraftClient minecraftClient, float f, float f2) {
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
    private boolean llIl(BlockState blockState) {
        if (blockState == null) return false;
        if (blockState.isOf(Blocks.RAIL)) return true;
        if (blockState.isOf(Blocks.POWERED_RAIL)) return true;
        if (blockState.isOf(Blocks.DETECTOR_RAIL)) return true;
        if (!blockState.isOf(Blocks.ACTIVATOR_RAIL)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void lllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null || minecraftClient.player == null) {
            return;
        }
        this.llIl = Math.max(this.llIl, lIIllllI.IlIIIlI(minecraftClient));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIII(MinecraftClient minecraftClient) {
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
        this.IIIlll();
        this.IIllI = false;
        this.IIlll = 0;
        this.IlII.clear();
        this.IIlII.clear();
        this.IlIll = null;
        this.IlIlI = 0;
        this.I = Integer.MIN_VALUE;
        this.IlIl = false;
        this.IlIlll();
        this.IlIlI();
        this.IIIIlI();
        this.IlI = false;
        this.llIl = Integer.MIN_VALUE;
        this.lII = null;
        this.lIIII = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIl(MinecraftClient minecraftClient) {
        boolean bl;
        float f;
        boolean bl2;
        lIlllll lIlllll2;
        block13: {
            block14: {
                block11: {
                    block12: {
                        if (this.IlIll == null) {
                            return;
                        }
                        lIlllll2 = this.IlIll;
                        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.world == null || minecraftClient.interactionManager == null) break block11;
                        if (minecraftClient.player.age < this.llIl) {
                            return;
                        }
                        if (this.I != Integer.MIN_VALUE) {
                            if (minecraftClient.player.age <= this.I) {
                                return;
                            }
                            this.I = Integer.MIN_VALUE;
                        }
                        if (!this.lllll(minecraftClient, lIlllll2.I())) {
                            this.IlIll = null;
                            this.lIll(minecraftClient, lIlllll2.II());
                            return;
                        }
                        int n = this.lII((PlayerEntity)minecraftClient.player);
                        if (n < 0) {
                            this.IlIll = null;
                            this.lIll(minecraftClient, lIlllll2.II());
                            return;
                        }
                        bl2 = this.IlIII(minecraftClient, n);
                        if (this.IIll.lIl() != lIIIlI.II) break block12;
                        if (this.IllI != 0L) break block13;
                        break block14;
                    }
                    if (!bl2) {
                        return;
                    }
                    if (this.IIll.lIl() == lIIIlI.l) {
                        this.I = minecraftClient.player.age;
                        boolean bl3 = IlIlllI.IlI(minecraftClient, 200, lIlllll2.l(), lIlllll2.Il(), () -> this.IIIIll(minecraftClient, lIlllll2));
                        if (bl3) return;
                        this.I = Integer.MIN_VALUE;
                        return;
                    }
                    this.I = minecraftClient.player.age;
                    if (IlIlllI.IlI(minecraftClient, 200, lIlllll2.l(), lIlllll2.Il(), () -> this.IIIIll(minecraftClient, lIlllll2))) return;
                    this.I = Integer.MIN_VALUE;
                    return;
                }
                this.IlIll = null;
                this.I = Integer.MIN_VALUE;
                return;
            }
            this.IllI = System.currentTimeMillis();
        }
        float f2 = f = (bl = this.IlllIl(minecraftClient, lIlllll2.I())) ? 0.0f : this.IIl.llIIIl(minecraftClient, this.IlI(lIlllll2.I()), ((Double)this.II.lIl()).floatValue());
        if (!bl2) {
            return;
        }
        if (!bl && !(f <= 0.5f)) {
            if (System.currentTimeMillis() - this.IllI < 1500L) return;
            this.IlIll = null;
            this.IllI = 0L;
            this.lIIlI(minecraftClient);
            this.lIll(minecraftClient, lIlllll2.II());
            return;
        }
        float f3 = bl ? minecraftClient.player.getYaw() : lIlllll2.l();
        float f4 = !bl ? lIlllll2.Il() : minecraftClient.player.getPitch();
        this.I = minecraftClient.player.age + 2;
        boolean bl4 = IlIlllI.IlI(minecraftClient, 200, f3, f4, () -> this.IIIIll(minecraftClient, lIlllll2));
        if (!bl4) {
            this.I = Integer.MIN_VALUE;
            return;
        }
        this.IllI = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlI(MinecraftClient minecraftClient, BlockPos blockPos, int n) {
        this.IIlIl = blockPos.toImmutable();
        this.Ill = n;
        this.IlIII = minecraftClient.player.age;
        this.IIIlI = 0;
        this.IllII = Integer.MIN_VALUE;
        this.IIIIl = minecraftClient.player.age;
        this.IIII = ++this.IlIIl;
        this.lIl = false;
        int n2 = this.IIIll((PlayerEntity)minecraftClient.player);
        if (n2 < 0) return;
        this.IlIII(minecraftClient, n2);
    }

    private int IIIll(PlayerEntity playerEntity) {
        return this.IIlI(playerEntity, Items.TNT_MINECART);
    }

    private Vec3d IIlIl(BlockPos blockPos) {
        return Vec3d.ofBottomCenter((Vec3i)blockPos);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIllI(MinecraftClient minecraftClient) {
        if (this.IIll.lIl() != lIIIlI.II) return;
        if (this.IlI) return;
        if (minecraftClient == null) return;
        if (minecraftClient.player != null) {
            this.l = minecraftClient.player.getYaw();
            this.llI = minecraftClient.player.getPitch();
            this.IlI = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlll(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) return false;
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        BlockPos blockPos2 = blockPos.down();
        Vec3d vec3d = this.IIlIl(blockPos);
        if (!minecraftClient.world.getWorldBorder().contains(blockPos)) return false;
        if (!minecraftClient.world.getWorldBorder().contains(blockPos2)) return false;
        if (!blockState.isAir()) {
            if (!blockState.isReplaceable()) return false;
        }
        if (!this.llIlI(minecraftClient, blockPos2)) return false;
        if (!(minecraftClient.player.getEyePos().squaredDistanceTo(vec3d) <= 20.25)) return false;
        if (!this.IIII(minecraftClient, this.IlIll(blockPos), blockPos2)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIII(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n < 9) {
            if (this.IIlI.Il(n)) return this.IIlI.lI(n, System.currentTimeMillis());
        }
        return false;
        boolean bl = lIIllllI.llIllI(minecraftClient) != n;
        long l2 = !bl ? 0L : this.lIIll(this.Illl);
        this.IIlI.II(n, System.currentTimeMillis(), l2);
        return this.IIlI.lI(n, System.currentTimeMillis());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.IIlIIl(minecraftClient);
        this.lIIlI(minecraftClient);
        this.IIIlll();
        this.IlIll = null;
        this.IlIlI = 0;
        this.I = Integer.MIN_VALUE;
        this.IlIlll();
        this.IlIlI();
        this.IIIIlI();
        this.IIllI = false;
        this.IIlll = 0;
        this.IlII.clear();
        this.IIlII.clear();
        this.IIl.IlIIIlI();
        this.IllI = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIIl(MinecraftClient minecraftClient, long l2, BlockPos blockPos, int n, float f, float f2, boolean bl) {
        this.IllII = minecraftClient.player.age;
        if (!this.llIII(minecraftClient, blockPos)) {
            this.IllII = Integer.MIN_VALUE;
            return false;
        }
        boolean bl2 = IlIlllI.IlI(minecraftClient, 200, f, f2, () -> this.IlIIII(minecraftClient, l2, blockPos, n));
        if (bl2) return bl2;
        this.IllII = Integer.MIN_VALUE;
        this.IIIIl = Integer.MIN_VALUE;
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        if (!this.IllIIl(minecraftClient)) {
            return;
        }
        if (this.IIllI || this.Illl()) {
            this.lllI(minecraftClient);
        }
        this.IIIIl(minecraftClient);
        this.lIlI(minecraftClient);
        this.lIllI(minecraftClient);
    }

    private void IlIlI() {
        this.IIIll = -1;
        this.Illll = 0;
    }

    private Vec3d IlIll(BlockPos blockPos) {
        return this.IIlIl(blockPos).subtract(0.0, 0.0625, 0.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public AutoCart() {
        super(StringFactory.IIII("AutoCart"), Category.II, StringFactory.IIII("Automatically places a rail and minecart at a flaming arrow impact point."));
        IIIlIlIIl iIIlIlIIl;
        this.II = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("q4BGmRdQRBQ="), 50.0, 1.0, 100.0, 1.0).lIII(() -> this.IIll.lIl() == lIIIlI.II));
        this.IIl = new IlIlIlI();
        this.lIIlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("q4NdiBpfED6WC5Q="), true));
        iIIlIlIIl(StringFactory.IIII("q4NdiBpfEDiSBJ5A"), 0.0, 0.0, 0.0, 300.0, 5.0);
        this.Illl = this.IIlllIl(iIIlIlIIl.IIll(StringFactory.IIII("ms")));
        this.IlII = new HashSet<UUID>();
        this.IIlII = new HashSet<UUID>();
        this.I = Integer.MIN_VALUE;
        this.Ill = -1;
        this.IlIII = Integer.MIN_VALUE;
        this.IllII = Integer.MIN_VALUE;
        this.IIIIl = Integer.MIN_VALUE;
        this.lllI = Integer.MIN_VALUE;
        this.IIII = Long.MIN_VALUE;
        this.llIl = Integer.MIN_VALUE;
        this.IIIll = -1;
        this.IIlI = new lIIlIIll();
    }

    private int IllII(IIIlIlIIl iIIlIlIIl) {
        return lIIlIIll.I(this.lIIll(iIIlIlIIl));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIIl(MinecraftClient minecraftClient) {
        float f = this.IlllI > 0.0f ? this.IlllI : 1.0f;
        this.llll = false;
        this.IlllI = 0.0f;
        this.lIl(minecraftClient, true);
        this.IlIllI(minecraftClient);
        if (minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null) {
            Vec3d vec3d;
            float f2 = f * 3.0f;
            Vec3d vec3d2 = minecraftClient.player.getRotationVec(1.0f);
            Vec3d vec3d3 = minecraftClient.player.getEyePos().subtract(0.0, (double)0.1f, 0.0);
            if (this.IIIIIl(minecraftClient, vec3d3, vec3d = vec3d2.multiply((double)f2))) {
                this.IIIIl(minecraftClient);
                this.IIllI = false;
                return;
            }
        }
        this.IIllI = true;
        this.IIlll = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIlI(MinecraftClient minecraftClient) {
        if (!this.IlI) {
            return;
        }
        if (this.IIll.lIl() == lIIIlI.II && minecraftClient != null && minecraftClient.player != null) {
            lIIllllI.IIlII(minecraftClient, this.l, this.llI);
        }
        this.IlI = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private long lIIll(IIIlIlIIl iIIlIlIIl) {
        double d = iIIlIlIIl.IIIl();
        double d2 = iIIlIlIIl.IIII();
        if (d != d2) return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d, d2)));
        return Math.max(0L, Math.round(d));
    }

    private static /* synthetic */ String lIlII(RegistryKey registryKey) {
        return registryKey.getValue().getPath();
    }

    private boolean lIlIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        return IlIlllI.lI(minecraftClient, this.IIIllI(blockPos));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIllI(MinecraftClient minecraftClient) {
        if (this.IIIll < 0) {
            return;
        }
        if (minecraftClient != null && minecraftClient.player != null) {
            if (minecraftClient.player.age >= this.Illll) {
                int n = this.IIIll;
                lIIllllI.lIIlI(minecraftClient, this, n, 0);
                this.IlIlI();
                return;
            }
            return;
        }
        this.IlIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        this.llllll(jsonObject, "Delay", this.Illl);
        this.llllll(jsonObject, "Switch Delay", this.Illl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIII(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) return false;
        if (!this.llIl(minecraftClient.world.getBlockState(blockPos))) return false;
        if (!this.lllIl(minecraftClient, blockPos)) return false;
        if (!this.IlII(minecraftClient, blockPos)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIl(Packet<?> packet) {
        MinecraftClient minecraftClient;
        PlayerActionC2SPacket playerActionC2SPacket;
        if (packet instanceof PlayerActionC2SPacket && (playerActionC2SPacket = (PlayerActionC2SPacket)packet).getAction() == PlayerActionC2SPacket.Action.RELEASE_USE_ITEM && (minecraftClient = MinecraftClient.getInstance()) != null && minecraftClient.player != null && this.llll) {
            this.lIIIl(minecraftClient);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIlI(MinecraftClient minecraftClient, BlockPos blockPos) {
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (blockState == null) return false;
        if (blockState.isAir()) return false;
        if (!blockState.getFluidState().isEmpty()) return false;
        if (!blockState.getCollisionShape((BlockView)minecraftClient.world, blockPos).isEmpty()) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIll(MinecraftClient minecraftClient, BlockPos blockPos) {
        int n = this.IIIll((PlayerEntity)minecraftClient.player);
        if (!this.llIII(minecraftClient, blockPos)) return false;
        if (n >= 0) {
            this.lIl = this.lllII(minecraftClient, n, this.IIIllI(blockPos));
            return this.lIl;
        }
        return false;
    }

    private boolean lllII(MinecraftClient minecraftClient, int n, BlockHitResult blockHitResult) {
        return lIIllllI.IlIIIl(minecraftClient, this, n, () -> {
            this.lIII(minecraftClient);
            boolean bl = lIIllllI.lIIIIl();
            try {
                boolean bl2 = lIIllllI.lIllll(minecraftClient, blockHitResult);
                return bl2;
            }
            finally {
                if (bl) {
                    lIIllllI.IlIIlIl();
                }
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) return false;
        if (!minecraftClient.world.getWorldBorder().contains(blockPos)) return false;
        if (minecraftClient.player.getEyePos().squaredDistanceTo(this.IIlIlI(blockPos)) <= 20.25) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllll(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (!this.IIlll(minecraftClient, blockPos)) return false;
        if (!this.lllIl(minecraftClient, blockPos)) return false;
        if (this.IlII(minecraftClient, blockPos)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIII(MinecraftClient minecraftClient, int n) {
        this.IIIIlI();
        this.IlI = false;
        this.lIll(minecraftClient, n);
        this.IlIlll();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIIl(MinecraftClient minecraftClient, Vec3d vec3d, Vec3d vec3d2) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.lII((PlayerEntity)minecraftClient.player) < 0) return false;
        if (this.IIIll((PlayerEntity)minecraftClient.player) < 0) return false;
        BlockPos blockPos = this.IlIIIl(minecraftClient, vec3d, vec3d2);
        if (blockPos == null) return false;
        if (!this.lllll(minecraftClient, blockPos)) {
            return false;
        }
        Vec3d vec3d3 = this.IIlIl(blockPos);
        float[] fArray = IlIlllI.IlIll(minecraftClient, vec3d3);
        if (fArray == null) {
            return false;
        }
        this.IIllI(minecraftClient);
        int n = this.IlIll != null ? this.IlIll.II() : lIIllllI.lllI(minecraftClient.player.getInventory());
        this.IlIll = new lIlllll(blockPos.toImmutable(), n, fArray[0], fArray[1]);
        this.IlIlI = 0;
        this.I = Integer.MIN_VALUE;
        this.IlIl = false;
        return true;
    }

    private void IIIIlI() {
        this.IIIII = null;
        this.IIlI.l();
    }

    @Override
    public void ll() {
        this.IIl.lIlIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIll(MinecraftClient minecraftClient, lIlllll lIlllll2) {
        if (this.IlIll != lIlllll2) {
            return false;
        }
        this.I = Integer.MIN_VALUE;
        if (this.IIIlIl(minecraftClient, lIlllll2.I())) {
            this.IIIIlI();
            this.IlIll = null;
            this.IlIlI = 0;
            this.IIIlI(minecraftClient, lIlllll2.I(), lIlllll2.II());
            this.lIlI(minecraftClient);
            return true;
        }
        this.lIIl(minecraftClient, lIlllll2);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (this.IlIl) {
            return true;
        }
        int n = this.lII((PlayerEntity)minecraftClient.player);
        if (!this.lllll(minecraftClient, blockPos)) return false;
        if (n >= 0) {
            this.IlIl = this.lllII(minecraftClient, n, this.IlI(blockPos));
            return this.IlIl;
        }
        return false;
    }

    private BlockHitResult IIIllI(BlockPos blockPos) {
        return blockPos != null ? new BlockHitResult(this.IIlIlI(blockPos), Direction.UP, blockPos, false) : null;
    }

    private void IIIlll() {
        this.llll = false;
        this.IlllI = 0.0f;
    }

    /*
     * Enabled aggressive block sorting
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
        if (minecraftClient.player != null) {
            if (!((Boolean)this.lIIlI.lIl()).booleanValue()) {
                lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
                return;
            }
        } else {
            return;
        }
        int n = this.IIIll;
        if (n < 0 && this.Ill >= 0) {
            n = this.Ill;
        }
        if (n < 0 && this.IlIll != null) {
            n = this.IlIll.II();
        }
        if (n >= 0 && n < 9) {
            lIIllllI.IlIlllI(minecraftClient, this, n);
            return;
        }
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
    }

    private Vec3d IIlIlI(BlockPos blockPos) {
        return Vec3d.ofBottomCenter((Vec3i)blockPos).add(0.0, 0.125, 0.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    boolean IIllII() {
        if (!this.IIIlIIl()) return false;
        if (this.IIllI) return true;
        if (!this.Illl()) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private boolean IIlllI(ItemStack var1_1) {
        block12: {
            block11: {
                block13: {
                    block9: {
                        block10: {
                            if (var1_1 == null) ** GOTO lbl15
                            break block12;
lbl3:
                            // 1 sources

                            return true;
lbl5:
                            // 1 sources

                            while ("flame".equals(var5_5)) {
                                break block9;
                            }
                            break block13;
lbl8:
                            // 1 sources

                            return false;
lbl10:
                            // 1 sources

                            while (true) {
                                var4_4 = (RegistryEntry)var3_3.next();
                                break block10;
                                break;
                            }
lbl13:
                            // 1 sources

                            while (true) {
                                if (var1_1.getItem() instanceof BowItem) break block11;
lbl15:
                                // 3 sources

                                return false;
                            }
                        }
                        var5_5 = var4_4.getKey().map((Function<RegistryKey, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lIlII(net.minecraft.registry.RegistryKey ), (Lnet/minecraft/registry/RegistryKey;)Ljava/lang/String;)()).orElse("");
                        ** GOTO lbl5
                    }
                    if (var2_2.getLevel(var4_4) > 0) {
                        ** continue;
lbl23:
                        // 1 sources

                        while (true) {
                            var3_3 = var2_2.getEnchantments().iterator();
                            break;
                        }
                    }
                }
                ** while (!var3_3.hasNext())
lbl27:
                // 1 sources

                ** while (true)
            }
            var2_2 = (ItemEnchantmentsComponent)var1_1.getOrDefault(DataComponentTypes.ENCHANTMENTS, (Object)ItemEnchantmentsComponent.DEFAULT);
            ** while (true)
        }
        ** while (var1_1.isEmpty())
lbl33:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIllll(UUID uUID) {
        if (uUID == null) {
            return;
        }
        if (this.IIlII.size() >= 128) {
            this.IIlII.clear();
        }
        this.IIlII.add(uUID);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIIII(MinecraftClient minecraftClient, long l2, BlockPos blockPos, int n) {
        if (l2 != this.IIII) return false;
        if (this.IIlIl == null) return false;
        if (!this.IIlIl.equals((Object)blockPos)) {
            return false;
        }
        this.IllII = Integer.MIN_VALUE;
        if (this.IlII(minecraftClient, blockPos)) {
            this.IIIIII(minecraftClient, n);
            return true;
        }
        if (!this.llIll(minecraftClient, blockPos)) {
            this.IlllII(minecraftClient, n);
            return false;
        }
        this.IIIIlI();
        this.lllI = minecraftClient.player.age + 8;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private BlockPos IlIIIl(MinecraftClient var1_1, Vec3d var2_2, Vec3d var3_3) {
        block7: {
            block5: {
                block6: {
                    block3: {
                        block4: {
                            break block5;
                            while (true) {
                                break block3;
                                break;
                            }
lbl3:
                            // 1 sources

                            while (var8_8 != null) {
                                break block4;
                            }
                            break block6;
lbl6:
                            // 2 sources

                            while (true) {
                                if (var6_6 < 320) ** continue;
                                return null;
                            }
                        }
                        if (var8_8.getType() != HitResult.Type.BLOCK) break block6;
                        break block7;
                    }
                    var7_7 = var4_4.add(var5_5);
                    var8_8 = var1_1.world.raycast(new RaycastContext(var4_4, var7_7, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)var1_1.player));
                    ** GOTO lbl3
                }
                var4_4 = var7_7;
                var5_5 = var5_5.multiply(0.99).subtract(0.0, 0.05, 0.0);
                ++var6_6;
                ** GOTO lbl6
            }
            var4_4 = var2_2;
            var5_5 = var3_3;
            var6_6 = 0;
            ** while (true)
        }
        return this.IllIII(var1_1, var8_8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIIll(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) return false;
        HitResult hitResult = minecraftClient.player.raycast(4.5, 1.0f, false);
        if (!(hitResult instanceof BlockHitResult)) return false;
        BlockHitResult blockHitResult = (BlockHitResult)hitResult;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return false;
        if (!blockHitResult.getBlockPos().equals((Object)blockPos)) return false;
        if (blockHitResult.getSide() != Direction.UP) return false;
        if (!this.llIl(minecraftClient.world.getBlockState(blockPos))) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient;
        block1: {
            block2: {
                block0: {
                    minecraftClient = MinecraftClient.getInstance();
                    if (!this.IllIIl(minecraftClient)) break block0;
                    this.lI(minecraftClient);
                    if (!this.IIllI && !this.Illl()) break block1;
                    break block2;
                }
                return;
            }
            this.lllI(minecraftClient);
        }
        this.lIlI(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockPos[] IlIlII(BlockHitResult blockHitResult) {
        BlockPos blockPos = blockHitResult.getBlockPos();
        Direction direction = blockHitResult.getSide();
        if (direction == Direction.UP) {
            return new BlockPos[]{blockPos.up(), blockPos.north().up(), blockPos.south().up(), blockPos.east().up(), blockPos.west().up()};
        }
        if (!direction.getAxis().isHorizontal()) {
            return new BlockPos[]{blockPos.offset(direction), blockPos.up()};
        }
        return new BlockPos[]{blockPos.offset(direction), blockPos.up(), blockPos.offset(direction).up(), blockPos.offset(direction.rotateYClockwise()).up(), blockPos.offset(direction.rotateYCounterclockwise()).up()};
    }

    /*
     * Unable to fully structure code
     */
    private void IlIllI(MinecraftClient var1_1) {
        block10: {
            block6: {
                block7: {
                    block8: {
                        block9: {
                            break block8;
lbl1:
                            // 1 sources

                            while (var3_3 instanceof PersistentProjectileEntity) {
                                break block6;
                            }
                            break block9;
lbl4:
                            // 1 sources

                            while (true) {
                                var3_3 = (Entity)var2_2.next();
                                ** GOTO lbl1
                                break;
                            }
                        }
lbl8:
                        // 3 sources

                        while (true) {
                            if (var2_2.hasNext()) {
                                ** continue;
                            }
                            break block7;
                            break;
                        }
                    }
                    this.IlII.clear();
                    if (var1_1 != null) break block10;
lbl15:
                    // 2 sources

                    return;
lbl17:
                    // 1 sources

                    while (true) {
                        var2_2 = var1_1.world.getEntities().iterator();
                        ** GOTO lbl8
                        break;
                    }
                }
                return;
            }
            var4_4 = (PersistentProjectileEntity)var3_3;
            this.IlII.add(var4_4.getUuid());
            ** while (true)
        }
        ** while (var1_1.world != null)
lbl29:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIlll() {
        this.IIlIl = null;
        this.Ill = -1;
        this.IlIII = Integer.MIN_VALUE;
        this.IIIlI = 0;
        this.IllII = Integer.MIN_VALUE;
        this.IIIIl = Integer.MIN_VALUE;
        this.lllI = Integer.MIN_VALUE;
        this.IIII = Long.MIN_VALUE;
        this.lIl = false;
        this.IllI = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockPos IllIII(MinecraftClient minecraftClient, BlockHitResult blockHitResult) {
        BlockPos[] blockPosArray = this.IlIlII(blockHitResult);
        int n = blockPosArray.length;
        int n2 = 0;
        while (n2 < n) {
            BlockPos blockPos = blockPosArray[n2];
            if (this.lllll(minecraftClient, blockPos)) {
                return blockPos.toImmutable();
            }
            ++n2;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllIIl(MinecraftClient minecraftClient) {
        if (minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null) {
            if (this.lII != null || this.lIIII != null) {
                if (this.IIl(minecraftClient)) return true;
                this.IIIII(minecraftClient);
                this.lII = minecraftClient.player;
                this.lIIII = minecraftClient.world;
                return false;
            }
            this.lII = minecraftClient.player;
            this.lIIII = minecraftClient.world;
            return true;
        }
        if (this.lII == null) {
            if (this.lIIII == null) return false;
        }
        this.IIIII(minecraftClient);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlllII(MinecraftClient minecraftClient, int n) {
        ++this.IIIlI;
        this.IIIIlI();
        if (this.IIIlI > 20) {
            this.lIIlI(minecraftClient);
            this.lIll(minecraftClient, n);
            this.IlIlll();
        }
    }

    private boolean IlllIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        return IlIlllI.lI(minecraftClient, this.IlI(blockPos));
    }

    private static int IllllI(int n, int n2) {
        return lIIll[n ^ 0x8A4CE2DD] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block15: {
                    block16: {
                        block17: {
                            block13: {
                                block14: {
                                    break block16;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl3:
                                    // 1 sources

                                    while (true) {
                                        var9_9 = new String[var8_8.length];
                                        break block13;
                                        break;
                                    }
lbl6:
                                    // 1 sources

                                    while (true) {
                                        if (var13_13 != 0) break block14;
                                        break block15;
lbl9:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        break;
                                    }
lbl11:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
lbl14:
                                // 2 sources

                                while (true) {
                                    var12_12 = var8_8[var10_10] ^ var6;
                                    ** continue;
                                    break;
                                }
                            }
                            var13_13 = -1;
                            break block17;
lbl20:
                            // 1 sources

                            while (true) {
                                var8_8 = "\u5533\u555b\u552b\u5533\u552f\u552f\u553b\u5537\u552f\u5537".toCharArray();
                                ** continue;
                                break;
                            }
                        }
lbl24:
                        // 2 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var6 = 21823;
                    var7_7 = "\u3414\u3423\u347b\u3468\u3447\u34d7\u34ee\u3462\u34d7\u347d\u3402\u346d\u53da\u53ed\u53b5\u53a6\u5389\u531b\u5302\u53ac\u531a\u5396\u53fc\u53cb\u53f7\u532b\u53c1\u5366\u53db\u5382\u5375\u53d1\u53d2\u5376\u5341\u5317\u53da\u53b2\u5388\u539b\u537f\u53e1\u5338\u53dc\u53c3\u53d3\u53b4\u53b3\u53a5\u5332\u5367\u539f\u537a\u53a0\u539d\u53c8\u53da\u5327\u53fe\u536a\u53da\u539e\u537f\u53dd\u53fa\u5348\u534f\u5305\u53e6\u5393\u53da\u538e\u5342\u53b0\u5310\u53c0\u53c2\u53ee\u539f\u5383\u5389\u530b\u5364\u53a3\u531d\u5385\u539d\u53d8\u53f6\u5345\u53e8\u536a\u53df\u5386\u5312\u53d1\u53d7\u5333\u5359\u530e\u53c9\u53a2\u53c6\u5396\u5371\u53e5\u534d\u53da\u539d\u53e5\u53ce\u53da\u26bb\u26a1\u26e2\u26c3\u26e9\u2657\u2604\u26fb\u2675\u26c9\u2682\u26a3\u269b\u264e\u26a8\u2631\u26bb\u26f0\u267d\u26c6\u36eb\u36b5\u3684\u3695\u36ba\u3604\u3601\u369f\u362f\u36a3\u36cf\u3696\u7a1d\u7a43\u7a7e\u7a40\u7a48\u7ae2\u7ae3\u7a5e\u7ace\u7a53\u7a5e\u7a0a\u7a34\u7a87\u7a1d\u7ace\u3902\u395c\u3961\u395f\u3957\u39fd\u39fc\u3941\u39d1\u394c\u391e\u3911\u392a\u39e7\u3966\u39ad\u2535\u251b\u2566\u252c\u04f9\u04de\u0495\u049e\u04ac\u0412\u0431\u04e6\u532c\u5372\u534f\u5371\u5379\u53d3\u53d2\u536f\u53ff\u5362\u5330\u533f\u5304\u53c9\u5348\u5383\u1552\u1557\u1508\u1522\u151a\u15a2\u15b4\u1555";
                    ** while (true)
lbl32:
                    // 1 sources

                    while (true) {
                        var12_12 = 0;
                        ** continue;
                        break;
                    }
lbl35:
                    // 2 sources

                    while (true) {
                        var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                        ** continue;
                        break;
                    }
                    AutoCart.lIIll[var4_5] = var5_6 ^= var2_3;
                    var3_4 += 4;
                    if (++var4_5 < var1_2) ** GOTO lbl35
                    break block18;
lbl42:
                    // 1 sources

                    while (true) {
                        var13_13 = 0;
                        ** continue;
                        break;
                    }
                    var9_9[var10_10] = var7_7.substring(var11_11, var11_11 + var12_12);
                    var11_11 += var12_12;
                    break block19;
lbl48:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                AutoCart.lIlII = var9_9;
                AutoCart.lIlIl = new Object[var9_9.length];
                ** while (true)
                var1_2 = var0_1.length / 4;
                AutoCart.lIIll = new int[var1_2];
                ** while (true)
            }
            return;
            var3_4 = 0;
            var4_5 = 0;
            ** while (true)
            var2_3 = 666697472;
            var0_1 = "9\u00e6aip\u008e\u00c99<80\u00a098\u0086\u00fa\u00fa\u00e2V\u0099PK\u0087k\bc_\u00ce\u00b2\u00ca\u00ea*2\u00c3\t\u0098'\u00c3\u0003G?l\u000e*\u00c8=\u00e9\u001a\u0096\u0019\u00b7\u0013\u0011\u0095P\u00d1\u00b5C3\u00ce>E@\u0016D<\u00ba<\u00f2\u0014\u0095\u00dd\u00bbJ%j\u0085\u00a9\\\u0090-GCO\u0003\u0017\u0090E\u00c6U#p\u0014xW\u00dd\r,\u00ae\u0093\u009c\u008b8T\u008b\u00e9t\u0014\n\u00abD\u0094\u00ab\u0018:EFJ\u00e6/\u00c3X\u00b6\u0088c\f\u008d?;+\u00b4jW\u00b5\u0096\u00fc\u00edF\u00fe\u00e9\u0000\u0092`\u000f\u00e0q\u0016xq^h\u00bfb\u0086|\u00f7lF\u00d1\u0013\u00aa\u00cc\u00f8F\u00a2\u00a7)lwT\u008a\u00b4\u00b4\u0007\u0084H\u0012\u00e9\u00e3;[\u00a9\u008c&\nj<\u00d0\u008e\u00fe\u00c2\u00ab\u008e\u00e8\u0090\u0006".getBytes("ISO-8859-1");
            ** while (true)
            var10_10 = 0;
            var11_11 = 0;
            ** while (true)
        }
        ** while (++var10_10 < var8_8.length)
lbl70:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Illlll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xBE11D307;
        char[] cArray = lIlII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIlIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            AutoCart.lIlIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xB6FFFFB1;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 14 -> 10;
                case 5 -> 230;
                case 31 -> 22;
                case 8 -> 205;
                case 6 -> 213;
                case 29 -> 12;
                case 1 -> 49;
                case 30 -> 252;
                case 23 -> 202;
                case 25 -> 110;
                case 22 -> 169;
                case 21 -> 131;
                case 10 -> 46;
                case 26 -> 52;
                default -> 42;
                case 9 -> 81;
                case 4 -> 103;
                case 28 -> 172;
                case 19 -> 27;
                case 13 -> 244;
                case 16 -> 24;
                case 7 -> 126;
                case 3 -> 98;
                case 17 -> 119;
                case 11 -> 27;
                case 2 -> 118;
                case 20 -> 60;
                case 24 -> 10;
                case 27 -> 68;
                case 12 -> 49;
                case 18 -> 160;
                case 15 -> 181;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

