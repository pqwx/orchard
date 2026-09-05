/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllIIII
 * Module         : HitWeb  [COMBAT]
 * Description    : Places a cobweb under players after you hit them.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Prediction
 *   - .getBytes(
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
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
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
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
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
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.I;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIlI;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlllI;
import orchard.internal.IllIII;
import orchard.internal.IllIIIII;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIlIIl;
import orchard.internal.llIll;
import orchard.module.combat.ShieldBreaker;

@Environment(value=EnvType.CLIENT)
public final class HitWeb
extends ModuleBase {
    private boolean I;
    private float l;
    private static final int II = 8;
    private int Il;
    private boolean lI;
    private int ll;
    private final llIll III;
    private int IIl;
    private Vec3d IlI;
    private int Ill;
    private int lII;
    private boolean lIl;
    private static final int llI = 3;
    private final IIIIIIIIl<IllIIIII> lll;
    private static final int IIII = 9;
    private final lIlIIlI IIIl;
    private boolean IIlI;
    private final IlIlIlI IIll;
    private int IlII;
    private int IlIl;
    private final lIlIIlI IllI;
    private static final int[] Illl;
    private static final String[] lIII;
    private static final Object[] lIIl;

    private /* synthetic */ boolean I(MinecraftClient minecraftClient, int n, llIlIIl llIlIIl2, int n2) {
        boolean bl = lIIllllI.IlIIIl(minecraftClient, this, n, () -> this.IllI(minecraftClient, llIlIIl2));
        this.lllI(minecraftClient, n2, bl);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void l(Packet<?> packet) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (this.IIl < 0) return;
        if (!(packet instanceof EntityVelocityUpdateS2CPacket)) return;
        EntityVelocityUpdateS2CPacket entityVelocityUpdateS2CPacket = (EntityVelocityUpdateS2CPacket)packet;
        if (entityVelocityUpdateS2CPacket.getEntityId() == this.IIl) {
            Vec3d vec3d = entityVelocityUpdateS2CPacket.getVelocity();
            if (vec3d == null) return;
            this.IlI = vec3d;
            this.IlIl = minecraftClient.player.age;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) return false;
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (!blockState.getFluidState().isEmpty()) return false;
        if (blockState.isOf(Blocks.WATER)) return false;
        if (blockState.isOf(Blocks.LAVA)) {
            return false;
        }
        if (blockState.isAir()) return true;
        if (blockState.isReplaceable()) return true;
        if (lIIllllI.lIllI(blockState)) return true;
        if (blockState.isOf(Blocks.FIRE)) return true;
        if (blockState.isOf(Blocks.SOUL_FIRE)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl() {
        this.lIl = false;
        this.IIl = -1;
        this.Il = Integer.MIN_VALUE;
        this.Ill = Integer.MIN_VALUE;
        this.lII = Integer.MIN_VALUE;
        this.IlIl = Integer.MIN_VALUE;
        this.l = 0.0f;
        this.IlI = Vec3d.ZERO;
        this.IIlI = false;
        this.lI = false;
        this.IlII = -1;
        this.ll = Integer.MIN_VALUE;
        this.IIll.III();
    }

    @Override
    public String II() {
        String string = "%";
        long l2 = Math.round((Double)this.IIIl.lIl());
        return l2 + string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lII(MinecraftClient minecraftClient) {
        LivingEntity livingEntity;
        if (minecraftClient.player.age > this.ll) {
            this.IIl();
            return;
        }
        Entity entity = this.IlII >= 0 ? minecraftClient.world.getEntityById(this.IlII) : null;
        if (entity instanceof LivingEntity && (livingEntity = (LivingEntity)entity).isAlive()) {
            Vec3d vec3d = livingEntity.getEyePos();
            float f = this.IIll.IllII(minecraftClient, vec3d, ((Double)this.IllI.lIl()).floatValue());
            if (!(f <= 4.0f)) return;
            this.IIl();
            return;
        }
        this.IIl();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean lIl(MinecraftClient minecraftClient, BlockHitResult blockHitResult) {
        this.I = true;
        try {
            lIIllllI.IIIlIlI(minecraftClient);
            ActionResult actionResult = lIIllllI.IllllIl(minecraftClient, Hand.MAIN_HAND, blockHitResult);
            boolean bl = actionResult != null && actionResult.isAccepted();
            return bl;
        }
        finally {
            this.I = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llI(PlayerEntity playerEntity) {
        if (this.lIl) {
            return false;
        }
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) {
            return false;
        }
        ShieldBreaker shieldBreaker = clientEntrypoint.IlI().IIIIlI();
        ShieldBreaker shieldBreaker2 = shieldBreaker;
        if (shieldBreaker2 == null) return false;
        if (!shieldBreaker2.IIIlIIl()) return false;
        if (!shieldBreaker2.lIlI((LivingEntity)playerEntity)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public HitWeb() {
        super(StringFactory.IIII("sJ1AqxxV"), Category.II, StringFactory.IIII("qJhVnxxEEB3XC5BbGNbc3o2aUJkLF0AQlhGaSxyT35iMkUbcAFhFXJ8Bixkb29uT1g=="));
        lIlIIlI lIlIIlI2;
        IIIIIIIIl<IllIIIII> iIIIIIIIl;
        lIlIIlI lIlIIlI3;
        lIlIIlI3(StringFactory.IIII("u5xVkhpS"), 100.0, 0.0, 100.0, 1.0);
        this.IIIl = this.IIlllIl(lIlIIlI3.IIII(StringFactory.IIII("%")));
        this.III = this.IIlllIl(new llIll((Object)StringFactory.IIII("Prediction"), true));
        iIIIIIIIl(StringFactory.IIII("qptAnQ1eXxLXJZBdCg=="), IllIIIII.class, IllIIIII.II);
        this.lll = this.IIlllIl(iIIIIIIIl);
        lIlIIlI2(StringFactory.IIII("uZ1Z3CpHVRmT"), 50.0, 1.0, 100.0, 1.0);
        this.IllI = this.IIlllIl((lIlIIlI)lIlIIlI2.lIII(() -> {
            if (this.lll.lIl() != IllIIIII.l) return false;
            return true;
        }));
        this.IIll = new IlIlIlI();
        this.IIl = -1;
        this.Il = Integer.MIN_VALUE;
        this.Ill = Integer.MIN_VALUE;
        this.lII = Integer.MIN_VALUE;
        this.IlIl = Integer.MIN_VALUE;
        this.IlI = Vec3d.ZERO;
        this.IlII = -1;
        this.ll = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll() {
        double d = (Double)this.IIIl.lIl();
        if (d >= 100.0) return true;
        if (!(d > 0.0)) return false;
        if (!(ThreadLocalRandom.current().nextDouble(100.0) < d)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private void IIII(MinecraftClient var1_1) {
        block72: {
            block60: {
                block83: {
                    block66: {
                        block68: {
                            block46: {
                                block84: {
                                    block80: {
                                        block52: {
                                            block82: {
                                                block67: {
                                                    block53: {
                                                        block71: {
                                                            block64: {
                                                                block47: {
                                                                    block55: {
                                                                        block78: {
                                                                            block59: {
                                                                                block58: {
                                                                                    block81: {
                                                                                        block73: {
                                                                                            block51: {
                                                                                                block76: {
                                                                                                    block79: {
                                                                                                        block74: {
                                                                                                            block69: {
                                                                                                                block70: {
                                                                                                                    block77: {
                                                                                                                        block65: {
                                                                                                                            block48: {
                                                                                                                                block49: {
                                                                                                                                    block63: {
                                                                                                                                        block56: {
                                                                                                                                            block62: {
                                                                                                                                                block75: {
                                                                                                                                                    block57: {
                                                                                                                                                        block61: {
                                                                                                                                                            block50: {
                                                                                                                                                                block45: {
                                                                                                                                                                    block54: {
                                                                                                                                                                        if (this.IIl < 0) break block60;
                                                                                                                                                                        break block70;
lbl3:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            if (!var10_7) break block45;
                                                                                                                                                                            break block46;
                                                                                                                                                                            break;
                                                                                                                                                                        }
lbl6:
                                                                                                                                                                        // 4 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            continue;
                                                                                                                                                                            break;
                                                                                                                                                                        }
lbl8:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (var12_10.getType() == HitResult.Type.BLOCK) {
                                                                                                                                                                            break block47;
                                                                                                                                                                        }
                                                                                                                                                                        break block71;
lbl11:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        return;
lbl13:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            this.IIll.IllII(var1_1, var5_2.getEyePos(), ((Double)this.IllI.lIl()).floatValue());
                                                                                                                                                                            break block48;
                                                                                                                                                                            break;
                                                                                                                                                                        }
lbl17:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (var3_12 != null) {
                                                                                                                                                                            break block49;
                                                                                                                                                                        }
                                                                                                                                                                        break block72;
lbl20:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            if (!lIIllllI.IIllIl((Entity)var5_2)) break block50;
                                                                                                                                                                            break block51;
                                                                                                                                                                            break;
                                                                                                                                                                        }
lbl23:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (var1_1.currentScreen == null) {
                                                                                                                                                                            break block52;
                                                                                                                                                                        }
                                                                                                                                                                        break block60;
lbl26:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            this.Il = var1_1.player.age + 1;
                                                                                                                                                                            break block53;
                                                                                                                                                                            break;
                                                                                                                                                                        }
lbl29:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            if (!var5_2.isAlive()) break block54;
                                                                                                                                                                            break block55;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        while (true) {
                                                                                                                                                                            break block56;
                                                                                                                                                                            break;
                                                                                                                                                                        }
lbl34:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            var12_10 = (BlockHitResult)var13_15;
                                                                                                                                                                            ** GOTO lbl8
                                                                                                                                                                            break;
                                                                                                                                                                        }
lbl37:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            var12_10 = var1_1.crosshairTarget;
                                                                                                                                                                            if (!(var12_10 instanceof BlockHitResult)) break block57;
                                                                                                                                                                            break block58;
                                                                                                                                                                            break;
                                                                                                                                                                        }
lbl41:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (orchard.internal.IIlI.IIl(var1_1)) {
                                                                                                                                                                            ** GOTO lbl6
                                                                                                                                                                        }
                                                                                                                                                                        break block73;
                                                                                                                                                                    }
lbl45:
                                                                                                                                                                    // 2 sources

                                                                                                                                                                    while (true) {
                                                                                                                                                                        this.IIll.III();
                                                                                                                                                                        break block48;
                                                                                                                                                                        break;
                                                                                                                                                                    }
lbl48:
                                                                                                                                                                    // 1 sources

                                                                                                                                                                    while (true) {
                                                                                                                                                                        continue;
                                                                                                                                                                        break;
                                                                                                                                                                    }
lbl50:
                                                                                                                                                                    // 1 sources

                                                                                                                                                                    while (var1_1.player != null) {
                                                                                                                                                                        break block59;
lbl52:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (var1_1.interactionManager != null) {
                                                                                                                                                                            ** GOTO lbl23
                                                                                                                                                                        }
                                                                                                                                                                        break block60;
                                                                                                                                                                    }
                                                                                                                                                                    break block60;
lbl56:
                                                                                                                                                                    // 1 sources

                                                                                                                                                                    while (true) {
                                                                                                                                                                        break block61;
                                                                                                                                                                        break;
                                                                                                                                                                    }
lbl58:
                                                                                                                                                                    // 1 sources

                                                                                                                                                                    while (true) {
                                                                                                                                                                        if (var9_14 == null) {
                                                                                                                                                                            ** continue;
                                                                                                                                                                        }
                                                                                                                                                                        break block62;
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                    this.Il = var1_1.player.age + 1;
                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                this.Il = var1_1.player.age;
                                                                                                                                                                break block48;
lbl67:
                                                                                                                                                                // 1 sources

                                                                                                                                                                while (true) {
                                                                                                                                                                    continue;
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            if (!(var5_2 instanceof PlayerEntity)) break block74;
                                                                                                                                                            break block75;
                                                                                                                                                        }
                                                                                                                                                        this.IIlI = true;
                                                                                                                                                        break block76;
lbl75:
                                                                                                                                                        // 1 sources

                                                                                                                                                        while (true) {
                                                                                                                                                            continue;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                    }
lbl78:
                                                                                                                                                    // 4 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        v0 = false;
                                                                                                                                                        break block63;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                                var6_4 = (PlayerEntity)var5_2;
                                                                                                                                                if (this.llI(var6_4)) {
                                                                                                                                                    ** continue;
                                                                                                                                                }
                                                                                                                                                break block74;
                                                                                                                                            }
                                                                                                                                            var10_8 = IlIlllI.IlI(var1_1, 175, var9_14[0], var9_14[1], (IllIII)LambdaMetafactory.metafactory(null, null, null, ()Z, I(net.minecraft.client.MinecraftClient int orchard.internal.llIlIIl int ), ()Z)((HitWeb)this, (MinecraftClient)var1_1, (int)var6_3, (llIlIIl)var7_5, (int)var8_6));
                                                                                                                                            break block77;
                                                                                                                                        }
                                                                                                                                        var9_13 = this.IIll.llIIIl(var1_1, var7_5.II(), ((Double)this.IllI.lIl()).floatValue());
                                                                                                                                        if (var9_13 <= 2.5f) break block78;
                                                                                                                                        ** while (true)
lbl93:
                                                                                                                                        // 1 sources

                                                                                                                                        while (true) {
                                                                                                                                            if (lIIllllI.llIlI()) ** GOTO lbl6
                                                                                                                                            ** GOTO lbl41
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
lbl97:
                                                                                                                                    // 2 sources

                                                                                                                                    while (true) {
                                                                                                                                        var10_7 = v0;
                                                                                                                                        ** continue;
                                                                                                                                        break;
                                                                                                                                    }
lbl100:
                                                                                                                                    // 1 sources

                                                                                                                                    while (var7_5.l().equals((Object)var12_10.getBlockPos().offset(var12_10.getSide()))) {
                                                                                                                                        break block64;
                                                                                                                                    }
                                                                                                                                    break block71;
lbl103:
                                                                                                                                    // 1 sources

                                                                                                                                    while (true) {
                                                                                                                                        if (!(var4_16 instanceof LivingEntity)) break block51;
                                                                                                                                        break block65;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var3_12.lIll()) ** GOTO lbl6
                                                                                                                                break block72;
                                                                                                                                this.IIl();
                                                                                                                                return;
lbl111:
                                                                                                                                // 1 sources

                                                                                                                                return;
lbl113:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    continue;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            return;
lbl117:
                                                                                                                            // 2 sources

                                                                                                                            while (true) {
                                                                                                                                var3_12 = v1;
                                                                                                                                ** GOTO lbl17
                                                                                                                                break;
                                                                                                                            }
lbl120:
                                                                                                                            // 1 sources

                                                                                                                            while (var11_9.getSide() != var7_5.II().getSide()) {
                                                                                                                                break block66;
                                                                                                                            }
                                                                                                                            break block78;
lbl123:
                                                                                                                            // 1 sources

                                                                                                                            while (var6_3 < 0) {
                                                                                                                                break block67;
                                                                                                                            }
                                                                                                                            break block79;
                                                                                                                        }
                                                                                                                        var5_2 = (LivingEntity)var4_16;
                                                                                                                        if (var5_2.isAlive()) {
                                                                                                                            ** continue;
lbl130:
                                                                                                                            // 1 sources

                                                                                                                            while (true) {
                                                                                                                                if (var7_5 == null) {
                                                                                                                                    ** continue;
                                                                                                                                }
                                                                                                                                break block68;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        break block51;
                                                                                                                        this.IIll.III();
                                                                                                                        this.Il = var1_1.player.age + 1;
                                                                                                                        ** while (true)
lbl138:
                                                                                                                        // 1 sources

                                                                                                                        while (true) {
                                                                                                                            break block69;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    ** while (var10_8)
lbl142:
                                                                                                                    // 1 sources

                                                                                                                    break block80;
                                                                                                                }
                                                                                                                if (var1_1 == null) break block60;
                                                                                                                ** GOTO lbl50
                                                                                                                this.IlII = var8_6;
                                                                                                                this.ll = var1_1.player.age + 15;
                                                                                                                ** while (true)
                                                                                                            }
                                                                                                            var2_17 = ClientEntrypoint.lII();
                                                                                                            if (var2_17 == null) break block81;
                                                                                                            break block82;
                                                                                                        }
                                                                                                        var6_3 = this.IIIII(var1_1);
                                                                                                        ** GOTO lbl123
                                                                                                    }
                                                                                                    v2 = this.lIll(var1_1, var5_2);
                                                                                                    break block83;
                                                                                                }
                                                                                                this.lII = var1_1.player.age;
                                                                                                return;
                                                                                            }
                                                                                            this.IIl();
                                                                                            ** while (true)
lbl165:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                if (this.lll.lIl() == IllIIIII.l) ** continue;
                                                                                                var9_14 = IlIlllI.IlIll(var1_1, var7_5.I());
                                                                                                ** continue;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var4_16 = var1_1.world.getEntityById(this.IIl);
                                                                                        ** while (true)
                                                                                    }
lbl173:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        v1 = null;
                                                                                        ** GOTO lbl117
                                                                                        break;
                                                                                    }
lbl176:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (!var11_9.getBlockPos().equals((Object)var7_5.Il())) ** GOTO lbl78
                                                                                        ** GOTO lbl120
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var11_9 = (BlockHitResult)var12_10;
                                                                                if (var11_9.getType() != HitResult.Type.BLOCK) ** GOTO lbl78
                                                                                ** while (true)
                                                                            }
                                                                            if (var1_1.world == null) break block60;
                                                                            ** GOTO lbl52
                                                                        }
lbl187:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            v0 = true;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    this.lI = true;
                                                                    ** while (true)
                                                                }
                                                                if (!var12_10.getBlockPos().equals((Object)var7_5.Il())) break block71;
                                                                ** GOTO lbl100
                                                            }
                                                            v3 = var12_10;
lbl198:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                        }
lbl201:
                                                        // 2 sources

                                                        while (true) {
                                                            v3 = var7_5.II();
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
                                                    return;
                                                    var11_9 = v3;
                                                    var12_11 = lIIllllI.IlIIIl(var1_1, this, var6_3, (BooleanSupplier)LambdaMetafactory.metafactory(null, null, null, ()Z, lIII(net.minecraft.client.MinecraftClient net.minecraft.util.hit.BlockHitResult ), ()Z)((HitWeb)this, (MinecraftClient)var1_1, (BlockHitResult)var11_9));
                                                    ** while (true)
                                                }
                                                v2 = null;
                                                break block83;
                                            }
                                            if (var2_17.IlI() == null) {
                                                ** continue;
                                            }
                                            break block84;
                                        }
                                        ** while (var1_1.player.age >= this.Il)
lbl218:
                                        // 1 sources

                                        break block60;
                                    }
                                    this.Il = var1_1.player.age + 1;
                                    return;
                                }
                                v1 = var2_17.IlI().IIIlllI();
                                ** while (true)
                            }
                            ** while (!((var13_15 = var1_1.crosshairTarget) instanceof BlockHitResult))
lbl227:
                            // 1 sources

                            ** while (true)
                            this.lllI(var1_1, var8_6, var12_11);
                            ** while (!var12_11)
lbl230:
                            // 1 sources

                            ** while (true)
                        }
                        var8_6 = this.IIl;
                        ** while (true)
                    }
                    if (var7_5.l().equals((Object)var11_9.getBlockPos().offset(var11_9.getSide()))) ** break;
                    ** while (true)
                    ** while (true)
                }
                var7_5 = v2;
                ** while (true)
            }
            return;
        }
        if (!IlIlllI.IIll()) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private List<BlockPos> IIlI(MinecraftClient var1_1, LivingEntity var2_2) {
        block52: {
            block53: {
                block38: {
                    block45: {
                        block35: {
                            block32: {
                                block51: {
                                    block46: {
                                        block44: {
                                            block49: {
                                                block31: {
                                                    block39: {
                                                        block43: {
                                                            block48: {
                                                                block50: {
                                                                    block41: {
                                                                        block30: {
                                                                            block40: {
                                                                                block34: {
                                                                                    block37: {
                                                                                        block42: {
                                                                                            block36: {
                                                                                                block33: {
                                                                                                    block47: {
                                                                                                        break block47;
lbl1:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            var22_20 = var21_19;
                                                                                                            var23_21 = var22_20.length;
                                                                                                            var24_22 = 0;
                                                                                                            break block30;
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
                                                                                                            continue;
                                                                                                            break;
                                                                                                        }
lbl10:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            if (!(var11_10 > 2.2)) break block31;
                                                                                                            break block32;
lbl13:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                continue;
                                                                                                                break;
                                                                                                            }
                                                                                                            break;
                                                                                                        }
lbl15:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            if (!(var6_6.lengthSquared() < 1.0E-6)) break block33;
                                                                                                            break block34;
                                                                                                            break;
                                                                                                        }
lbl18:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            v0 = new int[3];
                                                                                                            v0[0] = var4_4;
                                                                                                            v0[1] = var4_4 - 1;
                                                                                                            v1 = v0;
                                                                                                            v0[2] = var4_4 + 1;
                                                                                                            break block35;
                                                                                                            break;
                                                                                                        }
lbl25:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            ++var27_25;
                                                                                                            break block36;
                                                                                                            break;
                                                                                                        }
lbl28:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            continue;
                                                                                                            break;
                                                                                                        }
lbl30:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            v2 = var6_6.multiply(1.2).add(var5_5.multiply(0.65 + var8_8));
                                                                                                            break block37;
                                                                                                            break;
                                                                                                        }
lbl33:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            v3 = true;
                                                                                                            break block38;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    var3_3 = var2_2.getBoundingBox();
                                                                                                    break block48;
lbl39:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        if (!var2_2.isOnGround()) ** GOTO lbl18
                                                                                                        break block39;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                while (true) {
                                                                                                    if (this.IlIl == -2147483648) break block40;
                                                                                                    break block41;
                                                                                                    break;
                                                                                                }
                                                                                            }
lbl47:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                if (var27_25 > var19_17) break block42;
                                                                                                ** continue;
                                                                                                break;
                                                                                            }
lbl50:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                continue;
                                                                                                break;
                                                                                            }
                                                                                            while (true) {
                                                                                                var20_18.sort(Comparator.comparingDouble((ToDoubleFunction<I>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, II(), (Lorchard/internal/I;)D)()).reversed().thenComparingDouble((ToDoubleFunction<I>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, I(), (Lorchard/internal/I;)D)()));
                                                                                                break block43;
                                                                                                break;
                                                                                            }
lbl55:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                if (var26_24 > var17_15) break block44;
                                                                                                break block45;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        ++var26_24;
                                                                                        ** GOTO lbl55
lbl61:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var29_27 *= 0.8;
                                                                                            break block46;
                                                                                            break;
                                                                                        }
lbl64:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            continue;
                                                                                            break;
                                                                                        }
                                                                                    }
lbl67:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
                                                                                    var28_26 = new BlockPos(var26_24, var25_23, var27_25);
                                                                                    break block49;
                                                                                    var19_17 = (int)Math.floor(Math.max(Math.max(var3_3.maxZ, var13_11.maxZ), var14_12.maxZ) - 1.0E-7) + 1;
                                                                                    var20_18 = new ArrayList<I>();
                                                                                    ** while (true)
                                                                                    var14_12 = var3_3.offset(var10_9.x, 0.0, var10_9.z);
                                                                                    var15_13 = new Vec3d(var2_2.getX(), (double)var4_4 + 0.5, var2_2.getZ()).add(var10_9);
                                                                                    ** while (true)
                                                                                }
                                                                                return List.of(var2_2.getBlockPos());
                                                                            }
lbl80:
                                                                            // 2 sources

                                                                            while (true) {
                                                                                v3 = false;
                                                                                break block38;
                                                                                break;
                                                                            }
                                                                        }
lbl84:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            if (var24_22 >= var23_21) ** continue;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                        var16_14 = (int)Math.floor(Math.min(Math.min(var3_3.minX, var13_11.minX), var14_12.minX)) - 1;
                                                                        break block50;
lbl89:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (!(var5_5.lengthSquared() < 1.0E-6)) ** continue;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    ** while (var1_1.player.age - this.IlIl > 3)
lbl94:
                                                                    // 1 sources

                                                                    ** while (true)
                                                                }
                                                                var17_15 = (int)Math.floor(Math.max(Math.max(var3_3.maxX, var13_11.maxX), var14_12.maxX) - 1.0E-7) + 1;
                                                                var18_16 = (int)Math.floor(Math.min(Math.min(var3_3.minZ, var13_11.minZ), var14_12.minZ)) - 1;
                                                                ** while (true)
                                                            }
                                                            var4_4 = (int)Math.floor(var3_3.minY + 1.0E-4);
                                                            break block51;
                                                            while (true) {
                                                                v4 = 0.0;
                                                                ** GOTO lbl50
                                                                break;
                                                            }
                                                        }
                                                        return var20_18.stream().map((Function<I, BlockPos>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, l(), (Lorchard/internal/I;)Lnet/minecraft/util/math/BlockPos;)()).toList();
                                                    }
                                                    if (Math.abs(var2_2.getVelocity().y) > 0.08) {
                                                        ** continue;
                                                    }
                                                    break block52;
                                                }
lbl112:
                                                // 2 sources

                                                while (true) {
                                                    var13_11 = var3_3.offset(var10_9.x * 0.5, 0.0, var10_9.z * 0.5);
                                                    ** continue;
                                                    break;
                                                }
                                                var10_9 = v2;
                                                var11_10 = var10_9.length();
                                                ** while (true)
lbl118:
                                                // 1 sources

                                                while (true) {
                                                    v4 = 0.28;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            var29_27 = Math.max(this.lIIl(var14_12, var28_26), Math.max(this.lIIl(var13_11, var28_26) * 0.95, this.lIIl(var3_3, var28_26) * 0.85));
                                            if (var25_23 != var4_4) {
                                                ** continue;
                                            }
                                            break block46;
                                        }
                                        ++var24_22;
                                        ** while (true)
                                    }
                                    var20_18.add(new I(var28_26, var29_27, Vec3d.ofCenter((Vec3i)var28_26).squaredDistanceTo(var15_13)));
                                    ** while (true)
                                }
                                var5_5 = this.llII(var1_1, var2_2);
                                var6_6 = this.IIIlI(var1_1, var2_2);
                                ** while (true)
                            }
                            var10_9 = var10_9.multiply(2.2 / var11_10);
                            ** while (true)
                            var8_8 = v4;
                            ** while (!var7_7)
lbl142:
                            // 1 sources

                            break block53;
                        }
lbl144:
                        // 2 sources

                        while (true) {
                            var21_19 = v1;
                            ** continue;
                            break;
                        }
                    }
                    var27_25 = var18_16;
                    ** while (true)
lbl150:
                    // 1 sources

                    while (true) {
                        if (!var1_1.player.isSprinting()) ** continue;
                        ** continue;
                        break;
                    }
                }
                var7_7 = v3;
                ** while (true)
                var25_23 = var22_20[var24_22];
                var26_24 = var16_14;
                ** while (true)
            }
            v2 = var6_6.multiply(1.8);
            ** while (true)
        }
        v5 = new int[1];
        v1 = v5;
        v5[0] = var4_4;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient, BlockPos blockPos) {
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (blockState.isAir()) return false;
        if (!blockState.getFluidState().isEmpty()) return false;
        if (blockState.isOf(Blocks.WATER)) return false;
        if (blockState.isOf(Blocks.LAVA)) return false;
        if (blockState.getCollisionShape((BlockView)minecraftClient.world, blockPos).isEmpty()) return false;
        return true;
    }

    private boolean IllI(MinecraftClient minecraftClient, llIlIIl llIlIIl2) {
        return this.lIl(minecraftClient, llIlIIl2.II());
    }

    @Override
    public void ll() {
        this.IIll.lIlIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        this.IIl();
        this.IIll.IlIIIlI();
        this.IIll.III();
        this.I = false;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IlIIlI(Entity entity) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!(entity instanceof PlayerEntity)) return;
        PlayerEntity playerEntity = (PlayerEntity)entity;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.world == null) return;
        if (!playerEntity.isAlive()) return;
        if (lIIllllI.IIllIl((Entity)playerEntity)) return;
        if (this.llI(playerEntity)) return;
        if (this.IIlI) return;
        if (this.lll()) {
            this.IIl = playerEntity.getId();
            this.Il = minecraftClient.player.age;
        } else {
            return;
        }
        this.Ill = minecraftClient.player.age + (this.lll.lIl() == IllIIIII.l ? 30 : 8);
        this.l = minecraftClient.player.getYaw();
        this.IlI = Vec3d.ZERO;
        this.IlIl = Integer.MIN_VALUE;
        this.lI = false;
        this.IlII = -1;
        this.IIII(minecraftClient);
    }

    private /* synthetic */ boolean lIII(MinecraftClient minecraftClient, BlockHitResult blockHitResult) {
        return this.lIl(minecraftClient, blockHitResult);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double lIIl(Box box, BlockPos blockPos) {
        double d = Math.max(0.0, Math.min(box.maxX, (double)blockPos.getX() + 1.0) - Math.max(box.minX, (double)blockPos.getX()));
        double d2 = Math.max(0.0, Math.min(box.maxZ, (double)blockPos.getZ() + 1.0) - Math.max(box.minZ, (double)blockPos.getZ()));
        return d * d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private llIlIIl lIlI(MinecraftClient minecraftClient, List<BlockPos> list) {
        BlockPos blockPos;
        llIlIIl llIlIIl2;
        Iterator<BlockPos> iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while ((llIlIIl2 = this.IIIll(minecraftClient, blockPos = iterator.next())) == null);
        return llIlIIl2;
    }

    private llIlIIl lIll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (((Boolean)this.III.lIl()).booleanValue()) {
            llIlIIl llIlIIl2 = this.lIlI(minecraftClient, this.IIlI(minecraftClient, livingEntity));
            if (llIlIIl2 != null) {
                return llIlIIl2;
            }
        }
        return this.lIlI(minecraftClient, List.of(livingEntity.getBlockPos()));
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d llII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        Vec3d vec3d;
        Vec3d vec3d2;
        float f = (float)Math.toRadians(this.IIl == livingEntity.getId() ? (double)this.l : (double)minecraftClient.player.getYaw());
        Vec3d vec3d3 = new Vec3d(-Math.sin(f), 0.0, Math.cos(f));
        vec3d2(livingEntity.getX() - minecraftClient.player.getX(), 0.0, livingEntity.getZ() - minecraftClient.player.getZ());
        Vec3d vec3d4 = vec3d2;
        if (!(vec3d3.lengthSquared() < 1.0E-6)) {
            Vec3d vec3d5;
            vec3d3 = vec3d3.normalize();
            if (vec3d4.lengthSquared() > 1.0E-6 && vec3d3.dotProduct(vec3d4.normalize()) <= 0.0) {
                vec3d5 = vec3d4.normalize();
                return vec3d5;
            }
            vec3d5 = vec3d3;
            return vec3d5;
        }
        if (vec3d4.lengthSquared() < 1.0E-6) {
            vec3d = Vec3d.ZERO;
            return vec3d;
        }
        vec3d = vec3d4.normalize();
        return vec3d;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void llIl(MinecraftClient minecraftClient, PlayerEntity playerEntity, float f) {
        if (playerEntity == null) return;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.world == null) return;
        if (!playerEntity.isAlive()) return;
        if (lIIllllI.IIllIl((Entity)playerEntity)) return;
        if (!this.IIlI) {
            this.lIl = true;
            this.IIl = playerEntity.getId();
            this.Il = minecraftClient.player.age;
            this.Ill = minecraftClient.player.age + (this.lll.lIl() != IllIIIII.l ? 8 : 30);
            this.l = f;
            this.IlI = Vec3d.ZERO;
            this.IlIl = Integer.MIN_VALUE;
            this.lI = false;
            this.IlII = -1;
            this.IIII(minecraftClient);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllI(MinecraftClient minecraftClient, int n, boolean bl) {
        this.IIlI = false;
        this.lII = Integer.MIN_VALUE;
        if (n != this.IIl) {
            return;
        }
        if (bl) {
            this.IIl();
            return;
        }
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        this.Il = minecraftClient.player.age + 1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIIII(MinecraftClient minecraftClient) {
        int n = 0;
        while (n < 9) {
            ItemStack itemStack = minecraftClient.player.getInventory().getStack(n);
            if (itemStack.isOf(Items.COBWEB)) {
                return n;
            }
            ++n;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIIIl() {
        if (!this.IIIlIIl()) return false;
        if (this.I) return true;
        if (this.lI) return true;
        if (this.IIl >= 0) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IIIlI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        Vec3d vec3d;
        Vec3d vec3d2;
        Vec3d vec3d3 = vec3d2 = this.IIl == livingEntity.getId() && this.IlIl != Integer.MIN_VALUE && minecraftClient.player.age - this.IlIl <= 3 ? this.IlI : livingEntity.getVelocity();
        if (vec3d2 != null) {
            vec3d = new Vec3d(vec3d2.x, 0.0, vec3d2.z);
            return vec3d;
        }
        vec3d = Vec3d.ZERO;
        return vec3d;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private llIlIIl IIIll(MinecraftClient var1_1, BlockPos var2_2) {
        if (var1_1 == null) return null;
        if (var1_1.player == null) return null;
        if (var1_1.world == null) return null;
        if (var2_2 == null) return null;
        if (!this.lI(var1_1, var2_2)) {
            return null;
        }
        var3_3 = Math.max(0.0, var1_1.player.getBlockInteractionRange() - 0.1);
        var5_4 = Direction.values();
        var6_5 = var5_4.length;
        var7_6 = 0;
        if (true) ** GOTO lbl17
        block0: while (true) {
            var13_12 = var1_1.world.raycast(new RaycastContext(var1_1.player.getEyePos(), var12_11, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, (Entity)var1_1.player));
            while (var13_12 == null || !var13_12.getBlockPos().equals((Object)var9_8) || !var2_2.equals((Object)var9_8.offset(var13_12.getSide()))) {
                while (true) {
                    ++var7_6;
lbl17:
                    // 2 sources

                    if (var7_6 >= var6_5) return null;
                    var8_7 = var5_4[var7_6];
                    var9_8 = var2_2.offset(var8_7);
                    if (!this.IlII(var1_1, var9_8)) continue;
                    var10_9 = var8_7.getOpposite();
                    var11_10 = Vec3d.ofCenter((Vec3i)var9_8).add(Vec3d.of((Vec3i)var10_9.getVector()).multiply(0.5));
                    if (!(var1_1.player.getEyePos().squaredDistanceTo(var11_10) > var3_3 * var3_3)) break;
                }
                var12_11 = var11_10.subtract(Vec3d.of((Vec3i)var10_9.getVector()).multiply(0.001));
                var13_12 = lIIllllI.IIIIllI(var1_1, (Entity)var1_1.player, var1_1.player.getEyePos(), var12_11);
                if (var13_12 == null || var13_12.getType() != HitResult.Type.BLOCK) continue block0;
            }
            break;
        }
        return new llIlIIl(var2_2.toImmutable(), var9_8.toImmutable(), var11_10, var13_12);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player != null) {
            if (this.lI) {
                this.lII(minecraftClient);
                return;
            }
            if (this.IIl < 0) {
                return;
            }
            if (minecraftClient.player.age > this.Ill) {
                this.IIl();
                return;
            }
            if (this.IIlI) {
                if (minecraftClient.player.age - this.lII <= 3) {
                    return;
                }
                this.IIlI = false;
                this.Il = minecraftClient.player.age;
            }
            this.IIII(minecraftClient);
            return;
        }
    }

    private static int IIlII(int n, int n2) {
        return Illl[n ^ 0x85250365] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 4852;
        String string = "\u8bd6\u8c5c\u8bd8\u8bd8\uf07f\uf068\uefb9\uf049\uf079\uef92\uef92\uf05c\u0d58\u0d09\u0d2f\u0d2d\u0d45\u0d3f\u0d3f\u0d24\u0d24\u0d21\u0d12\u0d1f\u0d22\u0d14\u0d21\u0d41\u0d1e\u0d25\u0d41\u0d42\u0d12\u0d46\u0d11\u0d48\u0d34\u0d09\u0d2a\u0d0b\u0d1d\u0d17\u0d28\u0d38\u0d2b\u0d2f\u0d1e\u0d48\u0d32\u0d3f\u0d40\u0d33\u0d12\u0d14\u0d30\u0d0c\u0d2a\u0d34\u0d41\u0d42\u0d28\u0d1d\u0d2f\u0d1d\u0d1f\u0d09\ufdff\u0d21\u0d30\u0d3f\u0d2a\u0d41\u0d11\ufe00\u0d54\u0d33\u0d18\u0d3e\ufdfc\ufdfc\u649a\u655a\u64ad\u64bf\u64a4\u649d\u64b5\u64bc\u8deb\u1d25\u8e01\u8e01\u4c84\u4c5c\u4c65\u4c5d\u4c80\u4c6d\u4c6d\u4c68\u4c5d\u4c6d\u4c62\u4c4c\u4c6d\u4b92\u4bb0\u4bb0\u4858\u4857\u4853\u4828\u4845\u4838\u4818\u4844\u481f\u483f\u480b\u481f\u4809\u4819\u4821\u4843\u4822\u483e\u48fc\u48fc\ub8fa\ub8f3\ub856\ub8f3\ub83c\ub8cc\ub815\ub8dd\ub8df\ub8db\ub902\ub8d9";
        char[] cArray = "\u12f0\u12fc\u12b0\u12fc\u12f0\u12e4\u12e0\u12f8".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                n2 = 0;
            }
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
        }
        lIII = stringArray;
        lIIl = new Object[stringArray.length];
        int n6 = -237089266;
        byte[] byArray = "\u00ef\u0012s'\u00eaS\u00ff\u0099|d\u0013\u00f9\u00feB\u00cbL\u0001\u00ef \u009du\u0096\u0016\u00a5\u00bb\u008a\u00e3\u008c\u00ed\u00b0\u0088\u000b\u009bjX\u001c&\u00f7\u00fa\u00e0\u00cd\u0096\u00b17#kb\u00a3v\u00ad\u00ed\u00d6\u00b1\u000eO)\u00d8\u00cd\u00d0Y\u00ac\u008d\u00d1\u00f8\u0010\u0094l\u00bd?\u00f1\u00d6\u007f\u001e\u00ba=~\u00f7\u00b6\u0016!\u00d7w\u001d\u00a2\u00ec9\u00a6\u00dd".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        Illl = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            HitWeb.Illl[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlIl(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x4021;
        char[] cArray = lIII[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIIl[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            HitWeb.lIIl[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x342A;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 49425;
            n6 += 8101;
            n6 -= 61890;
            n6 += 32621;
            n6 -= 17652;
            n6 -= 31956;
            n6 ^= 0x478C;
            n6 -= 62049;
            cArray[n5] = (char)((n6 -= 13417) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

