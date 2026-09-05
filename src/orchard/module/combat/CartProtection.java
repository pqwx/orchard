/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIII
 * Module         : CartProtection  [COMBAT]
 * Description    : Places a selected hotbar block between you and a foreign lethal TNT cart.   (client's own text)
 *
 * Recovered strings in this class:
 *   - [CartProtection] 
 *   - Diagnostics
 *   - .getBytes(
 *   - Slot
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.vehicle.TntMinecartEntity
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.BlockView
 */
package orchard.module.combat;

import java.lang.invoke.LambdaMetafactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.vehicle.TntMinecartEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.BlockView;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IIlIIlIIl;
import orchard.internal.IIllIllIl;
import orchard.internal.IlIIIlIlI;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlllI;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllll;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class CartProtection
extends ModuleBase {
    private static final double I = 10.0;
    private int l;
    private long II;
    private final lIlIIlI Il;
    private static final float lI = 11.5f;
    private final Set<Integer> ll;
    private final IlIlIlI III;
    private final Set<Integer> IIl;
    private long IlI;
    private final IIIlIlIIl Ill;
    private final Map<Integer, Boolean> lII;
    private final IIIIIIIIl<IIlIIlIIl> lIl;
    private final IIIlIlIIl llI;
    private static final float lll = 0.25f;
    private static final IIIlIIIII IIII;
    private int IIIl;
    private final llIll IIlI;
    private static final int IIll = 4;
    private final lIlIIlI IlII;
    private final lIlIIlI IlIl;
    private static final double IllI = 20.25;
    private boolean Illl;
    private static final int lIII = 6;
    private final Map<BlockPos, Integer> lIIl;
    private int lIlI;
    private final IIIIIIIIl<IlIIIlIlI> lIll;
    private long llII;
    private int llIl;
    private int lllI;
    private static final int[] llll;
    private static final String[] IIIII;
    private static final Object[] IIIIl;

    /*
     * Enabled aggressive block sorting
     */
    public CartProtection() {
        super(StringFactory.IIII("u5VGiClFXwiSC4tQAN0="), Category.II, StringFactory.IIII("qJhVnxxEEB3XG5pVCtDKm5zUXJMNVVEO1wqTVgzYnpydgEOZHFkQBZgd31gB156f2JJbjhxeVxLXBJpNB9LS3qy6YNwaVkII2Q=="));
        IIIlIlIIl iIIlIlIIl;
        lIlIIlI lIlIIlI2;
        IIIIIIIIl<IIlIIlIIl> iIIIIIIIl;
        iIIIIIIIl(StringFactory.IIII("qIZbiBxURBWYBt90ANfb"), IIlIIlIIl.class, IIlIIlIIl.I);
        this.lIl = this.IIlllIl(iIIIIIIIl);
        lIlIIlI2(StringFactory.IIII("u5xVkhpS"), 100.0, 0.0, 100.0, 1.0);
        this.IlII = this.IIlllIl(lIlIIlI2.IIII(StringFactory.IIII("3Q==")));
        this.Il = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Slot"), 9.0, 1.0, 9.0, 1.0));
        iIIlIlIIl(StringFactory.IIII("q4NdiBpfEDiSBJ5A"), 0.0, 0.0, 0.0, 300.0, 5.0);
        this.llI = this.IIlllIl(iIIlIlIIl.IIll(StringFactory.IIII("lYc=")));
        this.Ill = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("qJhVnxwXdBmbCYY="), 0.0, 0.0, 0.0, 500.0, 5.0).IIll(StringFactory.IIII("lYc=")));
        this.lIll = this.IIlllIl(new IIIIIIIIl<IlIIIlIlI>(StringFactory.IIII("qptAnQ1eXxLXJZBdCg=="), IlIIIlIlI.class, IlIIIlIlI.I));
        this.IlIl = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("uZ1Z3CpHVRmT"), 50.0, 1.0, 100.0, 1.0).lIII(() -> this.lIll.lIl() == IlIIIlIlI.II));
        this.IIlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Diagnostics"), false));
        this.III = new IlIlIlI();
        this.lIIl = new HashMap<BlockPos, Integer>();
        this.IIl = new HashSet<Integer>();
        this.ll = new HashSet<Integer>();
        this.lII = new HashMap<Integer, Boolean>();
        this.IIIl = Integer.MIN_VALUE;
        this.lIlI = Integer.MIN_VALUE;
        this.llII = Long.MIN_VALUE;
        this.IlI = Long.MIN_VALUE;
        this.lllI = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.llIl = Integer.MIN_VALUE;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ boolean I(TntMinecartEntity tntMinecartEntity) {
        if (!tntMinecartEntity.isAlive()) return false;
        if (tntMinecartEntity.isRemoved()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient, int n, int n2) {
        long l2 = System.currentTimeMillis();
        if (this.lIlI != n) {
            this.lIlI = n;
            boolean bl = lIIllllI.llIllI(minecraftClient) != n2;
            this.llII = l2 + (bl ? this.lIIl(this.llI) : 0L);
            this.IlI = Long.MIN_VALUE;
        }
        if (l2 < this.llII) {
            return false;
        }
        if (this.IlI == Long.MIN_VALUE) {
            this.IlI = l2 + this.lIIl(this.Ill);
        }
        if (l2 >= this.IlI) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(MinecraftClient minecraftClient, int n, int n2, float f) {
        int n3;
        block2: {
            block3: {
                block1: {
                    if ((Boolean)this.IIlI.lIl() == false) return;
                    if (minecraftClient == null) return;
                    if (minecraftClient.player == null) break block1;
                    n3 = minecraftClient.player.age;
                    if (this.lllI != n) break block2;
                    break block3;
                }
                return;
            }
            if (this.l == n2 && this.llIl != Integer.MIN_VALUE && n3 - this.llIl < 10) {
                return;
            }
        }
        this.lllI = n;
        this.l = n2;
        this.llIl = n3;
        float f2 = f;
        int n4 = n2;
        int n5 = n3;
        int n6 = n;
        String string = IIII.IIII();
        System.out.println(string + n6 + ":" + n5 + ":" + n4 + ":" + f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IlI(MinecraftClient minecraftClient) {
        int n = (int)Math.round((Double)this.Il.lIl()) - 1;
        if (!this.lIII(minecraftClient, n)) return -1;
        int n2 = n;
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        ++this.II;
        this.IlIll();
        this.III.IlIIIlI();
        this.III.III();
        lIIllllI.llIII(MinecraftClient.getInstance(), this, lIIlIllI.II);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean lII(float f, float f2, float f3) {
        if (!Float.isFinite(f)) return false;
        if (!(f >= Math.max(0.0f, f2) + Math.max(0.0f, f3))) return false;
        return true;
    }

    private float lIl(TntMinecartEntity tntMinecartEntity) {
        double d = tntMinecartEntity.getVelocity().horizontalLength();
        return (float)(4.0 + 1.5 * Math.min(d, 5.0));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llI(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) return false;
        if (minecraftClient.world.getBlockState(blockPos).isAir()) return true;
        if (minecraftClient.world.getBlockState(blockPos).isReplaceable()) return true;
        if (!lIIllllI.lIllI(minecraftClient.world.getBlockState(blockPos))) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll(MinecraftClient minecraftClient, int n, int n2, lIIllll lIIllll2) {
        TntMinecartEntity tntMinecartEntity;
        Entity entity = minecraftClient.world.getEntityById(n);
        if (entity instanceof TntMinecartEntity && !(tntMinecartEntity = (TntMinecartEntity)entity).isRemoved() && !this.IIl.contains(n) && this.lIII(minecraftClient, n2) && this.llI(minecraftClient, lIIllll2.I())) {
            if (lIIllllI.llIllI(minecraftClient) != n2) return lIIllllI.IlIIIl(minecraftClient, this, n2, () -> this.IIllI(minecraftClient, lIIllll2));
            return this.IIllI(minecraftClient, lIIllll2);
        }
        this.IIl(minecraftClient, 180, n, (float)n2 + 1.0f);
        return false;
    }

    @Override
    public void ll() {
        this.IlIll();
        this.III.lIlIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private ItemStack IIII(MinecraftClient minecraftClient) {
        ItemStack itemStack;
        int n = lIIllllI.llIllI(minecraftClient);
        if (n >= 0 && n < 9) {
            itemStack = minecraftClient.player.getInventory().getStack(n);
            return itemStack;
        }
        itemStack = ItemStack.EMPTY;
        return itemStack;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean IIlI(double d, double d2, double d3, double d4, double d5, double d6) {
        double d7 = d3 - d;
        double d8 = d4 - d2;
        double d9 = d5 - d;
        double d10 = d6 - d2;
        double d11 = d7 * d7 + d8 * d8;
        double d12 = d9 * d7 + d10 * d8;
        if (!(d11 > 1.0E-6)) return false;
        if (!(d12 > 0.0)) return false;
        if (!(d12 < d11)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private lIIllll IlII(MinecraftClient var1_1, TntMinecartEntity var2_2) {
        block15: {
            block16: {
                block17: {
                    block18: {
                        block14: {
                            block13: {
                                break block17;
lbl1:
                                // 1 sources

                                while (var14_14 < var7_7) {
                                    break block13;
                                }
                                break block14;
lbl4:
                                // 3 sources

                                return var6_6;
lbl6:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (true) {
                                    var6_6 = var13_13;
                                    break block14;
                                    break;
                                }
lbl11:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    var8_8 = this.IlIlI(var1_1, var2_2, null);
                                    ** continue;
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    continue;
                                    while (true) {
                                        if (var6_6 != null) ** GOTO lbl4
                                        break block15;
                                        break;
                                    }
                                    break;
                                }
lbl21:
                                // 1 sources

                                while (true) {
                                    this.IIl(var1_1, 132, var2_2.getId(), var8_8);
                                    ** GOTO lbl4
                                    break;
                                }
                            }
                            var7_7 = var14_14;
                            ** while (true)
                            var14_14 = this.IlIlI(var1_1, var2_2, var11_11);
                            if (var8_8 - var14_14 >= 0.25f) ** GOTO lbl1
                        }
lbl30:
                        // 4 sources

                        while (true) {
                            if (!var10_10.hasNext()) ** continue;
                            break block16;
                            break;
                        }
lbl33:
                        // 1 sources

                        while (!CartProtection.IIlI(var1_1.player.getX(), var1_1.player.getZ(), var2_2.getX(), var2_2.getZ(), var12_12.x, var12_12.z)) {
                            ** GOTO lbl30
                        }
                        break block18;
lbl36:
                        // 1 sources

                        while (true) {
                            var12_12 = Vec3d.ofCenter((Vec3i)var11_11);
                            ** GOTO lbl33
                            break;
                        }
                    }
                    var13_13 = this.lIIIl(var1_1, var11_11);
                    if (var13_13 == null) ** GOTO lbl30
                    var9_9 = true;
                    ** while (true)
lbl44:
                    // 1 sources

                    while (true) {
                        var5_5 = var3_3.offset(var4_4);
                        ** continue;
                        break;
                    }
                    var9_9 = false;
                    var10_10 = List.of(var5_5, var5_5.up()).iterator();
                    ** while (true)
                }
                var3_3 = var1_1.player.getBlockPos();
                var4_4 = CartProtection.llII(var2_2.getX() - var1_1.player.getX(), var2_2.getZ() - var1_1.player.getZ());
                ** while (true)
                var6_6 = null;
                var7_7 = Infinityf;
                ** while (true)
            }
            var11_11 = var10_10.next();
            ** while (true)
        }
        if (var9_9) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        block17: {
            var1_1 = MinecraftClient.getInstance();
            if (!this.lllI(var1_1)) {
                this.IIl(var1_1, 10, -1, NaNf);
                return;
            }
            this.llIl(var1_1);
            this.lIlI(var1_1);
            if (this.Illl) {
                if (var1_1.player.age - this.IIIl <= 4) {
                    this.IIl(var1_1, 20, -1, var1_1.player.age - this.IIIl);
                    return;
                }
                this.IIl(var1_1, 21, -1, var1_1.player.age - this.IIIl);
                ++this.II;
                this.Illl = false;
            }
            if (orchard.internal.IIlI.IIl(var1_1) || lIIllllI.llIlI()) {
                this.IIl(var1_1, 30, -1, lIIllllI.llIlI() != false ? 1.0f : 0.0f);
                this.IIIlI();
                return;
            }
            var2_2 = false;
            var3_3 = var1_1.player.getBoundingBox().expand(10.0);
            var4_4 = var1_1.world.getEntitiesByClass(TntMinecartEntity.class, var3_3, (Predicate<TntMinecartEntity>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, I(net.minecraft.entity.vehicle.TntMinecartEntity ), (Lnet/minecraft/entity/vehicle/TntMinecartEntity;)Z)());
            this.IIl(var1_1, var4_4.isEmpty() != false ? 100 : 101, -1, var4_4.size());
            var5_5 = var4_4.iterator();
            ** GOTO lbl70
lbl24:
            // 1 sources

            while (true) {
                var2_2 = true;
                if (this.lI(var1_1, var6_6.getId(), var10_10)) {
                    if (this.lIll.lIl() == IlIIIlIlI.II) {
                        this.IIl(var1_1, 150, var6_6.getId(), 0.0f);
                        this.IlIIl(var1_1, var6_6, var10_10, var9_9);
                        return;
                    }
                } else {
                    this.IIl(var1_1, 140, var6_6.getId(), 0.0f);
                    return;
                }
                if (this.IIlIl(var1_1, var6_6, var10_10, var9_9)) {
                    this.IIl(var1_1, 160, var6_6.getId(), (float)var10_10 + 1.0f);
                    this.IIIlI();
                    return;
                }
                this.IIl(var1_1, 161, var6_6.getId(), 0.0f);
                ** GOTO lbl70
                break;
            }
lbl40:
            // 1 sources

            while (true) {
                this.IIl(var1_1, 125, var6_6.getId(), ((Double)this.IlII.lIl()).floatValue());
                ** GOTO lbl70
                break;
            }
lbl43:
            // 1 sources

            while (!CartProtection.lII(var7_7, var1_1.player.getHealth(), var1_1.player.getAbsorptionAmount())) {
                this.IIl(var1_1, 121, var6_6.getId(), var1_1.player.getHealth() + var1_1.player.getAbsorptionAmount());
                ** GOTO lbl70
            }
            break block17;
            while (true) {
                block18: {
                    if (var9_9 != null) break block18;
                    this.IIl(var1_1, 131, var6_6.getId(), 0.0f);
                    ** GOTO lbl70
                }
                if (var9_9 == null || var10_10 < 0) ** GOTO lbl70
                ** continue;
                break;
            }
lbl54:
            // 1 sources

            while (true) {
                var9_9 = this.IlII(var1_1, var6_6);
                if ((var10_10 = this.IlI(var1_1)) >= 0) ** continue;
                this.IIl(var1_1, 130, var6_6.getId(), ((Double)this.Il.lIl()).floatValue());
                if (true) ** GOTO lbl70
                break;
            }
            while (true) {
                this.IIl(var1_1, 119, var6_6.getId(), var1_1.player.distanceTo((Entity)var6_6));
                var7_7 = Math.max(this.IlIlI(var1_1, var6_6, null), IIllIllIl.I((LivingEntity)var1_1.player, var6_6.getEntityPos(), this.IllII(var6_6)));
                this.IIl(var1_1, 120, var6_6.getId(), var7_7);
                if (this.lIl.lIl() == IIlIIlIIl.I) ** GOTO lbl43
                break;
            }
        }
        ** while (var8_8 = this.lII.computeIfAbsent((Integer)Integer.valueOf((int)var6_6.getId()), (Function<Integer, Boolean>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, IlIII(java.lang.Integer ), (Ljava/lang/Integer;)Ljava/lang/Boolean;)((CartProtection)this)).booleanValue())
lbl66:
        // 1 sources

        ** while (true)
        while (true) {
            if (!this.ll.contains(var6_6.getId())) ** continue;
            this.IIl(var1_1, 111, var6_6.getId(), 0.0f);
            while (var5_5.hasNext()) {
                var6_6 = (TntMinecartEntity)var5_5.next();
                if (!this.IIl.contains(var6_6.getId())) ** continue;
                this.IIl(var1_1, 110, var6_6.getId(), 0.0f);
            }
            break;
        }
        if (!var2_2) {
            this.IIIlI();
        }
        this.III.III();
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
        ItemStack itemStack = minecraftClient.player.getInventory().getStack(n);
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (!(itemStack.getItem() instanceof BlockItem)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private long lIIl(IIIlIlIIl iIIlIlIIl) {
        double d = iIIlIlIIl.IIIl();
        double d2 = iIIlIlIIl.IIII();
        if (d != d2) return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d, d2)));
        return Math.max(0L, Math.round(d));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void lIlI(MinecraftClient minecraftClient) {
        this.IIl.removeIf(n -> {
            if (minecraftClient.world.getEntityById(n.intValue()) != null) return false;
            return true;
        });
        this.ll.removeIf(n -> {
            if (minecraftClient.world.getEntityById(n.intValue()) != null) return false;
            return true;
        });
        this.lII.keySet().removeIf(n -> minecraftClient.world.getEntityById(n.intValue()) == null);
    }

    private boolean lIll() {
        return CartProtection.IIlll((Double)this.IlII.lIl(), ThreadLocalRandom.current().nextDouble(100.0));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Direction llII(double d, double d2) {
        Direction direction;
        if (Math.abs(d) >= Math.abs(d2)) {
            if (!(d >= 0.0)) {
                direction = Direction.WEST;
                return direction;
            }
        } else {
            Direction direction2;
            if (!(d2 >= 0.0)) {
                direction2 = Direction.NORTH;
                return direction2;
            }
            direction2 = Direction.SOUTH;
            return direction2;
        }
        direction = Direction.EAST;
        return direction;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void llIl(MinecraftClient minecraftClient) {
        Iterator<Map.Entry<BlockPos, Integer>> iterator = this.lIIl.entrySet().iterator();
        boolean bl = true;
        block0: while (true) {
            Map.Entry<BlockPos, Integer> entry;
            if (!bl || (bl = false) || !true) {
                Box box = new Box(entry.getKey()).expand(1.5);
                List list = minecraftClient.world.getEntitiesByClass(TntMinecartEntity.class, box, tntMinecartEntity -> {
                    if (!tntMinecartEntity.isAlive()) return false;
                    if (tntMinecartEntity.isRemoved()) return false;
                    if (this.IIl.contains(tntMinecartEntity.getId())) return false;
                    return true;
                });
                if (!list.isEmpty()) {
                    this.IIl.add(((TntMinecartEntity)list.get(0)).getId());
                    iterator.remove();
                }
            }
            while (true) {
                if (!iterator.hasNext()) {
                    return;
                }
                entry = iterator.next();
                if (minecraftClient.player.age - entry.getValue() <= 6) continue block0;
                iterator.remove();
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllI(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (minecraftClient.player.isAlive()) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IIIlI() {
        this.lIlI = Integer.MIN_VALUE;
        this.llII = Long.MIN_VALUE;
        this.IlI = Long.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlII(MinecraftClient minecraftClient, long l2, int n, int n2, lIIllll lIIllll2) {
        boolean bl;
        block1: {
            block0: {
                if (l2 != this.II || !this.Illl || !this.lllI(minecraftClient)) break block0;
                this.Illl = false;
                bl = this.lll(minecraftClient, n, n2, lIIllll2);
                if (!bl) break block1;
                this.ll.add(n);
                break block1;
            }
            this.IIl(minecraftClient, 170, n, l2 == this.II ? 1.0f : 0.0f);
            return false;
        }
        this.IIl(minecraftClient, bl ? 200 : 201, n, (float)n2 + 1.0f);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIl(MinecraftClient minecraftClient, TntMinecartEntity tntMinecartEntity, int n, lIIllll lIIllll2) {
        long l2 = ++this.II;
        int n2 = tntMinecartEntity.getId();
        float[] fArray = IlIlllI.IlIll(minecraftClient, lIIllll2.l());
        if (fArray == null) {
            this.IIl(minecraftClient, 162, n2, 0.0f);
            return false;
        }
        this.Illl = true;
        this.IIIl = minecraftClient.player.age;
        boolean bl = IlIlllI.IlI(minecraftClient, 400, fArray[0], fArray[1], () -> this.IIlII(minecraftClient, l2, n2, n, lIIllll2));
        if (bl) return true;
        this.IIl(minecraftClient, 163, n2, 0.0f);
        if (l2 != this.II) return false;
        this.Illl = false;
        this.IIIl = Integer.MIN_VALUE;
        return false;
    }

    private boolean IIllI(MinecraftClient minecraftClient, lIIllll lIIllll2) {
        return lIIllllI.lIllll(minecraftClient, lIIllll2.II());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean IIlll(double d, double d2) {
        if (d >= 100.0) {
            return true;
        }
        if (d <= 0.0) {
            return false;
        }
        if (!(d2 < d)) return false;
        return true;
    }

    private /* synthetic */ Boolean IlIII(Integer n) {
        return this.lIll();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIl(MinecraftClient minecraftClient, TntMinecartEntity tntMinecartEntity, int n, lIIllll lIIllll2) {
        BlockHitResult blockHitResult;
        HitResult hitResult;
        boolean bl;
        float f = this.III.llIIIl(minecraftClient, lIIllll2.II(), ((Double)this.IlIl.lIl()).floatValue());
        boolean bl2 = bl = f <= 1.0f || (hitResult = minecraftClient.crosshairTarget) instanceof BlockHitResult && (blockHitResult = (BlockHitResult)hitResult).getBlockPos().equals((Object)lIIllll2.II().getBlockPos()) && blockHitResult.getSide() == lIIllll2.II().getSide();
        if (bl) {
            this.III.III();
            if (!this.lll(minecraftClient, tntMinecartEntity.getId(), n, lIIllll2)) return;
            this.ll.add(tntMinecartEntity.getId());
            this.IIIlI();
            return;
        }
        this.IIl(minecraftClient, 151, tntMinecartEntity.getId(), f);
    }

    private float IlIlI(MinecraftClient minecraftClient, TntMinecartEntity tntMinecartEntity, BlockPos blockPos) {
        return IIllIllIl.Il((LivingEntity)minecraftClient.player, tntMinecartEntity.getEntityPos(), this.IllII(tntMinecartEntity), blockPos);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIll() {
        this.lIIl.clear();
        this.IIl.clear();
        this.ll.clear();
        this.lII.clear();
        this.Illl = false;
        this.IIIl = Integer.MIN_VALUE;
        this.IIIlI();
        this.lllI = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.llIl = Integer.MIN_VALUE;
        this.III.III();
    }

    private float IllII(TntMinecartEntity tntMinecartEntity) {
        return Math.max(11.5f, this.lIl(tntMinecartEntity));
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIl(Packet<?> packet) {
        if (!(packet instanceof PlayerInteractBlockC2SPacket)) return;
        PlayerInteractBlockC2SPacket playerInteractBlockC2SPacket = (PlayerInteractBlockC2SPacket)packet;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIIlIIl()) return;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) {
            return;
        }
        ItemStack itemStack = playerInteractBlockC2SPacket.getHand() == Hand.OFF_HAND ? minecraftClient.player.getOffHandStack() : this.IIII(minecraftClient);
        if (itemStack == null) return;
        if (!itemStack.isOf(Items.TNT_MINECART)) return;
        this.lIIl.put(playerInteractBlockC2SPacket.getBlockHitResult().getBlockPos().toImmutable(), minecraftClient.player.age);
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIllll lIIIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (!this.llI(minecraftClient, blockPos)) return null;
        if (!minecraftClient.world.getOtherEntities(null, new Box(blockPos)).isEmpty()) {
            return null;
        }
        Direction[] directionArray = Direction.values();
        int n = directionArray.length;
        int n2 = 0;
        while (n2 < n) {
            Direction direction = directionArray[n2];
            BlockPos blockPos2 = blockPos.offset(direction);
            BlockState blockState = minecraftClient.world.getBlockState(blockPos2);
            if (!blockState.isAir() && !blockState.getCollisionShape((BlockView)minecraftClient.world, blockPos2).isEmpty()) {
                Direction direction2 = direction.getOpposite();
                Vec3d vec3d = Vec3d.ofCenter((Vec3i)blockPos2).add(Vec3d.of((Vec3i)direction2.getVector()).multiply(0.5));
                if (!(minecraftClient.player.getEyePos().squaredDistanceTo(vec3d) > 20.25)) return new lIIllll(blockPos.toImmutable(), vec3d, new BlockHitResult(vec3d, direction2, blockPos2.toImmutable(), false));
            }
            ++n2;
        }
        return null;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block13: {
            var6 = 3612;
            var7_2 = "\u4de1\u4d5a\u4d0a\u4d69\u4daa\u4d13\u4d65\u4dde\u4d2f\u4dbd\u4dfa\u4dc1\u4df1\u4d75\u4d64\u4dfd\u4d5f\u4db3\u4d3c\u4d53\uc8ab\uc86b\uc87a\uc836\uc8e3\uc866\uc83f\uc893\uc87c\uc8c6\uc8ee\uc884\uc8bb\uc83a\uc82e\uc8b4\uc813\uc8c7\uc806\uc86b\uc837\uc865\uc88a\uc87c\uc8a8\uc824\uc89d\uc8d0\uc84d\uc80b\uc87e\uc806\uc88e\uc853\uc842\uc82b\uc89f\uc863\uc858\uc88a\uc876\uc8eb\uc8e0\uc8a2\uc8fe\uc84f\uc830\uc8a7\uc85c\uc8ef\uc84c\uc874\uc839\uc815\uc8d3\uc857\uc8a6\uc85a\uc896\uc8c3\uc86e\uc872\uc868\uc82a\uc8ac\uc871\uc83d\uc807\uc8c6\uc869\uc87b\uc8a9\uc80a\uc8f9\uc8b0\uc89b\uc8fa\uc85f\uc84b\uc8a9\uc833\uc895\uc84a\uc869\uc80c\uc824\uc8a8\uc800\uc8ed\uc83a\uc8c2\uc8fa\uc86c\uc829\uc836\uc81a\uc8e8\uc870\uc82f\uc85d\u8e6a\u8ea9\u8e89\u8ec3\u8e25\u8e9d\u8efe\u8e42\u8eaa\u8e07\u8e4b\u8e44\u8e7f\u8eba\u8ea6\u8e13\u8ed0\u8e3c\u8ee5\u8e83\u9819\u98a2\u98dc\u9880\u9850\u98c0\u9881\u9833\u59ee\u5977\u5928\u595a\u8cd6\u8c69\u8c07\u8c7f\u8c99\u8c22\u8c07\u8c96\u2cd7\u2c69\u2c20\u2c78\u2c98\u2c20\u2c4b\u2ccc\u2c00\u2cbc\u2cc8\u2cf3\u2cc2\u2c39\u2c17\u2cdf\uc70b\uc7c5\uc7cc\uc7e0\uaa28\uaae8\uaaf9\uaab5\uaa60\uaae5\uaab3\uaa0d\uaade\uaa45\uaa33\uaa3d\uaa3c\uaad5\uaa84\uaa5c\u7a5f\u7a91\u7a98\u7ab4\ua5bf\ua545\ua572\ua535\ua5f7\ua55b\ua562\ua5a7\ua575\ua5e8\ua585\ua590\ua5a2\ua541\ua508\ua592\ua507\ua5c0\ua56b\ua509\u49b2\u4966\u493e\u4927\u49a3\u4940\u492a\u4983\u4972\u49cb\u49ad\u4995\uf1f5\uf132\uf17a\uf16f\uf1b9\uf13f\uf17a\uf1d6\uf131\uf1aa\uf1ed\uf1e0\uf1e6\uf162\uf170\uf186\uad38\uad9b\uadfb\uadbb\uad6a\uadf4\uadfb\uad35\uade5\uad61\uad1f\uad15\uad35\uadd8\uadab\uad21\uad9f\uad4a\uadb5\uadfc\uadb8\uade4\uad1a\uad99";
            var8_3 = "\u0e08\u0e78\u0e08\u0e14\u0e18\u0e14\u0e0c\u0e18\u0e0c\u0e18\u0e08\u0e10\u0e0c\u0e04".toCharArray();
            var9_4 = new String[var8_3.length];
            var13_8 = -1;
            break block13;
lbl7:
            // 2 sources

            while (true) {
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl46
                break;
            }
        }
lbl13:
        // 2 sources

        while (true) {
            var10_5 = 0;
            var11_6 = 0;
            var12_7 = 0;
            if (var13_8 != 0) ** GOTO lbl7
            CartProtection.IIIII = var9_4;
            CartProtection.IIIIl = new Object[var9_4.length];
            var2_13 = -487704051;
            var0_11 = "\u000f\u00dd/\u00e2\u00b6\u0015s\u00947\u0016\u00d7\u00e7b\u0005){9G~\u00f9U\u001b\u00e6\u00a7)\u00ae\u000b`4\u00d9\u0099\u00da\u00bd\u008aP\u0011@R\u00e7\u00ff8\u0010x\u00d5E|>]\u00f8U;\u0099\u00bd\u0012\t!F\u00e8a\u00f9\u00b06|q%tK6\u00c0\u00be\u00a4\\\u00af'\u007f\u008eo\u00a9)~h\u0085!\u00e2DU\u0019\u00b4I\u0096\u00d9\u00ae\u00c7\u0092\u0012X\u00a3\u00f5\u009a\u0082U\u0086\u00d0(z3z^\u00e8$)\u0082\u00d9{m\u00f0\u008d\u00c6<Q\u0091!\u00bb\u00a3\u001e\u00c6\u00f4?\u00da;396`\u00e6\u009d\u00a5\u0012(\u00f0Wb\u00bal\u00888\u0016\u0084_\u0092I\u00b7\u00e2\u00d9\u00e4(\u00d04(UlV\u00bf\u00d3-M\u00d0t\u00de\u009d\b\u00a4".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            CartProtection.llll = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                CartProtection.llll[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            CartProtection.IIII = StringFactory.IIII("[CartProtection] ");
            return;
        }
lbl33:
        // 1 sources

        while (true) {
            var13_8 = 0;
            ** continue;
            break;
        }
        block11: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
            if (var15_10 >= var14_9.length) {
                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                if (++var10_5 >= var8_3.length) ** break;
                ** continue;
                ** continue;
            }
lbl46:
            // 3 sources

            switch (var15_10 % 6) {
                case 4: {
                    v0 = 92;
                    continue block11;
                }
                case 1: {
                    v0 = 81;
                    continue block11;
                }
                case 3: {
                    v0 = 84;
                    continue block11;
                }
                case 5: {
                    v0 = 75;
                    continue block11;
                }
                default: {
                    v0 = 24;
                    continue block11;
                }
                case 2: 
            }
            v0 = 125;
        }
    }

    private static int lIIlI(int n, int n2) {
        return llll[n ^ 0x7AAF01F] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String lIIll(int var0, int var1_1) {
        var3_2 = var0 ^ 472550661;
        var4_4 = CartProtection.IIIII[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])CartProtection.IIIIl[var3_2];
        if (var2_3 != null) {
            var5_5 = var2_3;
        } else {
            var5_5 = new Throwable().getStackTrace();
            CartProtection.IIIIl[var3_2] = var5_5;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 621852064;
        var8_8 = 0;
        if (true) ** GOTO lbl16
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) ** GOTO lbl101
lbl16:
            // 2 sources

            switch (var8_8 & 31) {
                case 2: {
                    var9_9 = 191;
                    continue block33;
                }
                case 1: {
                    var9_9 = 160;
                    continue block33;
                }
                case 28: {
                    var9_9 = 151;
                    continue block33;
                }
                case 8: {
                    var9_9 = 148;
                    continue block33;
                }
                case 20: {
                    var9_9 = 247;
                    continue block33;
                }
                case 17: {
                    var9_9 = 40;
                    continue block33;
                }
                case 15: {
                    var9_9 = 102;
                    continue block33;
                }
                default: {
                    var9_9 = 18;
                    continue block33;
                }
                case 31: {
                    var9_9 = 200;
                    continue block33;
                }
                case 22: {
                    var9_9 = 124;
                    continue block33;
                }
                case 29: {
                    var9_9 = 198;
                    continue block33;
                }
                case 19: {
                    var9_9 = 161;
                    continue block33;
                }
                case 27: {
                    var9_9 = 26;
                    continue block33;
                }
                case 6: {
                    var9_9 = 143;
                    continue block33;
                }
                case 30: {
                    var9_9 = 243;
                    continue block33;
                }
                case 18: {
                    var9_9 = 138;
                    continue block33;
                }
                case 11: {
                    var9_9 = 71;
                    continue block33;
                }
                case 25: {
                    var9_9 = 239;
                    continue block33;
                }
                case 24: {
                    var9_9 = 56;
                    continue block33;
                }
                case 21: {
                    var9_9 = 212;
                    continue block33;
                }
                case 9: {
                    var9_9 = 0;
                    continue block33;
                }
                case 5: {
                    var9_9 = 133;
                    continue block33;
                }
                case 16: {
                    var9_9 = 220;
                    continue block33;
                }
                case 12: {
                    var9_9 = 52;
                    continue block33;
                }
                case 13: {
                    var9_9 = 142;
                    continue block33;
                }
                case 14: {
                    var9_9 = 243;
                    continue block33;
                }
                case 3: {
                    var9_9 = 228;
                    continue block33;
                }
                case 4: {
                    var9_9 = 1;
                    continue block33;
                }
lbl101:
                // 1 sources

                return new String(var4_4).intern();
                case 10: {
                    var9_9 = 81;
                    continue block33;
                }
                case 26: {
                    var9_9 = 125;
                    continue block33;
                }
                case 7: {
                    var9_9 = 87;
                    continue block33;
                }
                case 23: 
            }
            var9_9 = 178;
        }
    }
}

