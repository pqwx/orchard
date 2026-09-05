/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIllIII
 * Module         : Auto Play  [MOVEMENT]
 * Description    : Finds the nearest valid player, approaches safely and hands combat to Kill Aura.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Require Line of Sight
 *   - Jump Frozen Targets
 *   - Pause While Using
 *   - Strafe Obstacles
 *   - Jump Obstacles
 *   - Aim Prediction
 *   - Paper Action
 *   - Avoid Edges
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.Items
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package orchard.module.movement;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlI;
import orchard.internal.IlIIIlIl;
import orchard.internal.IllIlI;
import orchard.internal.lIIllIll;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIIIIll;
import orchard.internal.llIIlIII;
import orchard.internal.llIll;
import orchard.internal.lllII;
import orchard.module.combat.KillAura;

@Environment(value=EnvType.CLIENT)
public final class AutoPlay
extends ModuleBase {
    private final lIlIIlI I;
    private double l;
    private static final double II = 0.42;
    private boolean Il;
    private final lIlIIlI lI;
    private final llIll ll;
    private boolean III;
    private boolean IIl;
    private final llIll IlI;
    private final lIlIIlI Ill;
    private int lII;
    private final lIlIIlI lIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("uZdAlQ9WRBWYBt99Ct/fhw=="), 5.0, 0.0, 15.0, 0.5).IIII(StringFactory.IIII("s")));
    private long llI;
    private double lll;
    private static final long IIII = 220000000L;
    private long IIIl;
    private final llIll IIlI;
    private static final long IIll = 55L;
    private boolean IlII;
    private final llIll IlIl;
    private final lIlIIlI IllI;
    private final llIll Illl;
    private int lIII;
    private boolean lIIl;
    private boolean lIlI;
    private final lIlIIlI lIll;
    private static final int llII = 7;
    private final lIlIIlI llIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("rJVGmxxDEC6WBphc"), 72.0, 4.0, 128.0, 1.0).IIII(StringFactory.IIII("m")));
    private boolean lllI;
    private final llIll llll;
    private boolean IIIII;
    private int IIIIl;
    private boolean IIIlI;
    private final llIll IIIll;
    private PlayerEntity IIlII;
    private long IIlIl;
    private int IIllI;
    private boolean IIlll;
    private final lIlIIlI IlIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("q4BbjFlzWQ+DCZFaCg=="), 2.35, 1.0, 6.0, 0.05).IIII(StringFactory.IIII("m")));
    private final IIIIIIIIl<llIIIIll> IlIIl;
    private long IlIlI;
    private final llIll IlIll;
    private static final int[] IllII;
    private static final String[] IllIl;
    private static final Object[] IlllI;

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) {
            return false;
        }
        KillAura killAura = clientEntrypoint.IlI().llIIIl();
        KillAura killAura2 = killAura;
        if (killAura2 == null) return false;
        if (killAura2.llIl(minecraftClient, (LivingEntity)playerEntity)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public AutoPlay() {
        super(StringFactory.IIII("Auto Play"), Category.ll, StringFactory.IIII("vp1amAoXRBSSSJFcDsHbjYzUQp0VXlRchwSeQArBkt6ZhESOFlZTFJIb30oO1duSgdRVkh0XWB2ZDIwZDNzTnJmAFIgWF3sVmwTfeBrB39A="));
        lIlIIlI lIlIIlI2;
        lIlIIlI lIlIIlI3;
        lIlIIlI lIlIIlI4;
        IIIIIIIIl<llIIIIll> iIIIIIIIl;
        iIIIIIIIl(StringFactory.IIII("uYREjhZWUxTXJZBdCg=="), llIIIIll.class, llIIIIll.I);
        this.IlIIl = this.IIlllIl(iIIIIIIIl);
        lIlIIlI4(StringFactory.IIII("q4RGlRdDEC6WBphc"), 3.0, 1.0, 12.0, 0.1);
        this.lI = this.IIlllIl((lIlIIlI)lIlIIlI4.IIII(StringFactory.IIII("m")).lIII(() -> {
            if (this.IlIIl.lIl() == llIIIIll.lI) return false;
            return true;
        }));
        this.I = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("q4RGlRdDEDaCBY8ZPdLQmZ0="), 4.5, 1.0, 16.0, 0.1).IIII(StringFactory.IIII("m")).lIII(() -> {
            if (this.IlIIl.lIl() != llIIIIll.I) return false;
            return true;
        }));
        this.IlIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Jump Obstacles"), true));
        this.ll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Strafe Obstacles"), true));
        this.Illl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Jump Frozen Targets"), true));
        lIlIIlI lIlIIlI5 = new lIlIIlI(StringFactory.IIII("voZbhhxZEDaCBY8ZPdLQmZ0="), 2.0, 0.5, 3.0, 0.05).IIII(StringFactory.IIII("m"));
        llIll llIll2 = this.Illl;
        Objects.requireNonNull(llIll2);
        this.lIll = this.IIlllIl((lIlIIlI)lIlIIlI5.lIII(llIll2::lIl));
        this.IIIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Require Line of Sight"), false));
        this.IlIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Avoid Edges"), true));
        this.llll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Pause While Using"), true));
        this.IlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Aim Prediction"), true));
        lIlIIlI3(StringFactory.IIII("uZ1Z3CpHVRmT"), 100.0, 20.0, 200.0, 5.0);
        this.Ill = this.IIlllIl(lIlIIlI3.IIII(StringFactory.IIII("%")));
        this.IIlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Paper Action"), true));
        lIlIIlI2(StringFactory.IIII("tZ1alRRCXVy/HZFeCsE="), 6.0, 0.0, 20.0, 1.0);
        this.IllI = this.IIlllIl(lIlIIlI2);
        this.lII = 1;
        this.lIII = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        if (!this.lIIl) return;
        if (!this.IIlI(minecraftClient)) return;
        if (minecraftClient.currentScreen != null) return;
        this.IIlII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IlI(PlayerEntity playerEntity, double d, boolean bl) {
        Vec3d vec3d;
        Vec3d vec3d2 = playerEntity.getBoundingBox().getCenter();
        vec3d(vec3d2.x, playerEntity.getBoundingBox().minY + (double)playerEntity.getHeight() * 0.62, vec3d2.z);
        Vec3d vec3d3 = vec3d;
        if (bl) return vec3d3;
        if (!((Boolean)this.IlI.lIl()).booleanValue()) {
            return vec3d3;
        }
        Vec3d vec3d4 = playerEntity.getVelocity();
        double d2 = Math.hypot(vec3d4.x, vec3d4.z);
        if (!Double.isFinite(d2)) return vec3d3;
        if (d2 > 1.4) {
            return vec3d3;
        }
        double d3 = MathHelper.clamp((double)(d / 6.0), (double)0.6, (double)3.2);
        return vec3d3.add(vec3d4.x * d3, 0.0, vec3d4.z * d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lII(MinecraftClient minecraftClient) {
        this.lIlI = false;
        this.IIIII = false;
        this.IlII = false;
        boolean bl = this.lll(minecraftClient, 0.0, 1.0);
        boolean bl2 = this.lll(minecraftClient, 0.0, -1.0);
        if (!bl && !bl2) {
            this.III = false;
            this.IIlll = false;
            return;
        }
        if (bl != bl2) {
            this.lII = bl ? 1 : -1;
        }
        this.III = this.lII > 0 && bl;
        this.IIlll = this.lII < 0 && bl2;
        this.IIIIl = Math.max(this.IIIIl, 7);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll(MinecraftClient minecraftClient, double d, double d2) {
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (!clientPlayerEntity.isOnGround()) return true;
        double d3 = Math.toRadians(clientPlayerEntity.getYaw());
        double d4 = -Math.sin(d3) * d - Math.cos(d3) * d2;
        double d5 = Math.cos(d3) * d - Math.sin(d3) * d2;
        double d6 = Math.hypot(d4, d5);
        if (d6 < 1.0E-4) return true;
        if (IlIIIlIl.ll((World)minecraftClient.world, clientPlayerEntity, d4 / d6 * 0.42, d5 / d6 * 0.42)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIII(MinecraftClient minecraftClient, Vec3d vec3d, double d, boolean bl) {
        Vec3d vec3d2 = minecraftClient.player.getEyePos();
        double d2 = vec3d.x - vec3d2.x;
        double d3 = vec3d.y - vec3d2.y;
        double d4 = vec3d.z - vec3d2.z;
        double d5 = Math.hypot(d2, d4);
        if (d5 < 1.0E-4) {
            this.IIlIl = 0L;
            return;
        }
        long l2 = System.nanoTime();
        float f = this.IIlIl == 0L ? 0.008333334f : MathHelper.clamp((float)((float)(l2 - this.IIlIl) / 1.0E9f), (float)0.004166667f, (float)0.05f);
        this.IIlIl = l2;
        float f2 = (float)(Math.toDegrees(Math.atan2(d4, d2)) - 90.0);
        float f3 = (float)(-Math.toDegrees(Math.atan2(d3, d5)));
        float f4 = minecraftClient.player.getYaw();
        float f5 = minecraftClient.player.getPitch();
        float f6 = MathHelper.wrapDegrees((float)(f2 - f4));
        float f7 = f3 - f5;
        float f8 = ((Double)this.Ill.lIl()).floatValue() / 100.0f;
        float f9 = (bl ? 9.0f : (d > 12.0 ? 6.0f : 7.5f)) * f8;
        float f10 = (bl ? 8.0f : 6.0f) * f8;
        float f11 = (!bl ? (d > 18.0 ? 100.0f : (d > 8.0 ? 125.0f : 145.0f)) : 150.0f) * f8 * f;
        float f12 = (bl ? 110.0f : 85.0f) * f8 * f;
        float f13 = MathHelper.clamp((float)(f6 * (float)(1.0 - Math.exp(-f9 * f))), (float)(-f11), (float)f11);
        float f14 = MathHelper.clamp((float)(f7 * (float)(1.0 - Math.exp(-f10 * f))), (float)(-f12), (float)f12);
        lIIllllI.IIlII(minecraftClient, f4 + (!(Math.abs(f6) < 0.03f) ? f13 : f6), MathHelper.clamp((float)(f5 + (Math.abs(f7) < 0.03f ? f7 : f14)), (float)-90.0f, (float)90.0f));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient) {
        boolean bl;
        int n = this.IllII(minecraftClient);
        boolean bl2 = bl = n >= 0;
        if (!bl && !this.IIIlI) {
            this.lllI = false;
        }
        if (!lIIllIll.I(bl, this.lllI, this.IIIlI)) {
            return this.IIIlI;
        }
        if (!lIIllllI.llIlI()) {
            this.lllI = true;
            this.IIIlI = true;
            this.lIII = n;
            lIIllllI.IIIIIII(minecraftClient, n, true);
            long l2 = this.IlIlI;
            ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
            CompletableFuture.runAsync(() -> minecraftClient.execute(() -> this.IIIlI(minecraftClient, (PlayerEntity)clientPlayerEntity, n, l2)), CompletableFuture.delayedExecutor(55L, TimeUnit.MILLISECONDS));
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        ++this.IlIlI;
        this.lIIl = false;
        this.llI = 0L;
        this.IIIl = System.nanoTime() + Math.max(0L, Math.round((Double)this.lIl.lIl() * 1.0E9));
        this.IIlII = null;
        this.IlIIl();
        this.lllI = false;
        this.IIIlI = false;
        this.lIII = this.IIlll(MinecraftClient.getInstance());
        this.lIIl();
        this.Il = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI(MinecraftClient minecraftClient, PlayerEntity playerEntity, double d) {
        if (!IllIlI.IIIII(minecraftClient, playerEntity)) return false;
        if (playerEntity.getAbilities().creativeMode) return false;
        if (playerEntity.isRemoved()) return false;
        if (minecraftClient.world.getEntityById(playerEntity.getId()) != playerEntity) return false;
        if (((Boolean)this.IIIll.lIl()).booleanValue()) {
            if (!minecraftClient.player.canSee((Entity)playerEntity)) return false;
        }
        if (!(minecraftClient.player.squaredDistanceTo((Entity)playerEntity) <= d * d)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean Illl(MinecraftClient minecraftClient, KeyBinding keyBinding) {
        if (keyBinding == null) return false;
        if (!lIIllllI.IIllIII(minecraftClient, keyBinding)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private PlayerEntity lIII(MinecraftClient var1_1) {
        block4: {
            block6: {
                block5: {
                    break block6;
lbl1:
                    // 1 sources

                    while (true) {
                        var7_6 = var1_1.player.squaredDistanceTo((Entity)var6_5);
                        if (!(v0 >= var3_3)) break block4;
lbl4:
                        // 4 sources

                        while (true) {
                            if (var5_4.hasNext()) break block5;
                            return var2_2;
                        }
                        break;
                    }
lbl7:
                    // 1 sources

                    while (true) {
                        var5_4 = var1_1.world.getPlayers().iterator();
                        ** GOTO lbl4
                        break;
                    }
lbl10:
                    // 1 sources

                    while (true) {
                        if (!this.IllI(var1_1, var6_5, (Double)this.llIl.lIl())) ** GOTO lbl4
                        ** continue;
                        break;
                    }
                }
                var6_5 = (PlayerEntity)var5_4.next();
                ** while (true)
            }
            var2_2 = null;
            var3_3 = Infinity;
            ** while (true)
        }
        var2_2 = var6_5;
        var3_3 = var7_6;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIl() {
        this.lIlI = false;
        this.III = false;
        this.IIlll = false;
        this.IIIII = false;
        this.IlII = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlI(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        block3: {
            boolean bl;
            ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
            double d = Math.sqrt(clientPlayerEntity.squaredDistanceTo((Entity)playerEntity));
            boolean bl2 = this.IIlIl(playerEntity);
            boolean bl3 = bl2 && d <= Math.min(3.0, (Double)this.lIll.lIl()) && clientPlayerEntity.canSee((Entity)playerEntity);
            boolean bl4 = (Boolean)this.IlIl.lIl() == false || this.lll(minecraftClient, 1.0, 0.0);
            llIIIIll llIIIIll2 = (llIIIIll)((Object)this.IlIIl.lIl());
            boolean bl5 = llIIIIll2 != llIIIIll.lI && this.lllI(clientPlayerEntity) && bl4;
            boolean bl6 = llIIIIll2 == llIIIIll.I && bl5;
            lllII lllII2 = lIIllIll.Il(d, bl3, clientPlayerEntity.isOnGround(), bl5, bl6, (Double)this.IlIII.lIl(), (Double)this.lI.lIl(), (Double)this.I.lIl(), (Boolean)this.Illl.lIl());
            this.lIlI = lllII2.II();
            this.IIIII = lllII2.l();
            this.IlII = lllII2.I();
            this.III = false;
            this.IIlll = false;
            boolean bl7 = bl = (Boolean)this.IlIll.lIl() != false && this.lIlI && clientPlayerEntity.isOnGround() && clientPlayerEntity.horizontalCollision && bl4;
            if (bl) {
                this.IIIII = false;
                this.IlII = true;
            }
            this.IlllI(clientPlayerEntity, this.lIlI);
            if (((Boolean)this.ll.lIl()).booleanValue() && (!bl && clientPlayerEntity.horizontalCollision && this.IIIIl <= 0 || this.IIllI >= 7)) {
                this.IIIII(minecraftClient);
            }
            if (((Boolean)this.IlIl.lIl()).booleanValue() && this.lIlI && clientPlayerEntity.isOnGround() && !this.lll(minecraftClient, 1.0, 0.0)) {
                this.lII(minecraftClient);
                return;
            }
            if (!((Boolean)this.ll.lIl()).booleanValue() || this.IIIIl <= 0 || bl3) break block3;
        }
        if ((Boolean)this.ll.lIl() != false) return;
        this.IIIIl = 0;
        return;
        this.III = this.lII > 0;
        this.IIlll = this.lII < 0;
        --this.IIIIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.options == null) {
            return false;
        }
        if (this.Illl(minecraftClient, minecraftClient.options.forwardKey)) return true;
        if (this.Illl(minecraftClient, minecraftClient.options.backKey)) return true;
        if (this.Illl(minecraftClient, minecraftClient.options.leftKey)) return true;
        if (this.Illl(minecraftClient, minecraftClient.options.rightKey)) return true;
        if (this.Illl(minecraftClient, minecraftClient.options.jumpKey)) return true;
        if (this.Illl(minecraftClient, minecraftClient.options.sneakKey)) return true;
        if (this.Illl(minecraftClient, minecraftClient.options.sprintKey)) return true;
        if (this.Illl(minecraftClient, minecraftClient.options.attackKey)) return true;
        if (this.Illl(minecraftClient, minecraftClient.options.useKey)) {
            return true;
        }
        if (minecraftClient.options.hotbarKeys == null) return false;
        KeyBinding[] keyBindingArray = minecraftClient.options.hotbarKeys;
        int n = keyBindingArray.length;
        int n2 = 0;
        while (n2 < n) {
            KeyBinding keyBinding = keyBindingArray[n2];
            if (this.Illl(minecraftClient, keyBinding)) {
                return true;
            }
            ++n2;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public PlayerEntity llII(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return null;
        if (!this.lIIl) return null;
        if (!this.IIlI(minecraftClient)) {
            return null;
        }
        PlayerEntity playerEntity = this.lIII(minecraftClient);
        return playerEntity;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllI(ClientPlayerEntity clientPlayerEntity) {
        if (!clientPlayerEntity.isAlive()) return false;
        if (clientPlayerEntity.isUsingItem()) return false;
        if (clientPlayerEntity.isSneaking()) return false;
        if (clientPlayerEntity.isTouchingWater()) return false;
        if (clientPlayerEntity.isSubmergedInWater()) return false;
        if (clientPlayerEntity.isInLava()) return false;
        if (clientPlayerEntity.isClimbing()) return false;
        if (clientPlayerEntity.hasVehicle()) return false;
        if (clientPlayerEntity.getAbilities().flying) return false;
        if (!((double)clientPlayerEntity.getHungerManager().getFoodLevel() >= (Double)this.IllI.lIl())) return false;
        return true;
    }

    @Override
    public int IIll() {
        return -1000;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIII(MinecraftClient minecraftClient) {
        boolean bl;
        this.IIllI = 0;
        this.IIIIl = 14;
        boolean bl2 = this.lll(minecraftClient, 0.35, 1.0);
        this.lII = bl2 != (bl = this.lll(minecraftClient, 0.35, -1.0)) ? (bl2 ? 1 : -1) : -this.lII;
    }

    private void IIIIl(MinecraftClient minecraftClient, KeyBinding keyBinding) {
        if (keyBinding != null) {
            keyBinding.setPressed(lIIllllI.IIllIII(minecraftClient, keyBinding));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlI(MinecraftClient minecraftClient, PlayerEntity playerEntity, int n, long l2) {
        if (l2 == this.IlIlI && this.IIIlIIl() && this.lIIl && this.IIlI(minecraftClient) && minecraftClient.player == playerEntity && minecraftClient.currentScreen == null && minecraftClient.player.getInventory().getStack(n).isOf(Items.PAPER)) {
            lIIllllI.IIIIIII(minecraftClient, n, true);
            lIIllllI.IIIIIll(minecraftClient);
            lIIllllI.IIllIll(minecraftClient, Hand.MAIN_HAND);
            this.lIII = n;
            this.IIIlI = false;
            return;
        }
        this.IIIlI = false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null || minecraftClient.getWindow() == null) {
            return;
        }
        this.IlIII(minecraftClient);
        double d = (double)minecraftClient.getWindow().getScaledWidth() * 0.5;
        double d2 = (double)minecraftClient.getWindow().getScaledHeight() * 0.5 + 16.0;
        orchard.internal.IIIlI.lIlIIl(drawContext);
        try {
            orchard.internal.IIIlI.Ill(drawContext, d, d2);
            orchard.internal.IIIlI.IIlll(drawContext, 1.7, 1.7);
            orchard.internal.IIIlI.lllIII(true, () -> orchard.internal.IIIlI.lIIIll(drawContext, minecraftClient.textRenderer, this.IIIl(), 0.0, 0.0, -1));
        }
        finally {
            orchard.internal.IIIlI.IlIllI(drawContext);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIll(MinecraftClient minecraftClient) {
        if (!this.Il) return;
        if (minecraftClient == null) return;
        if (minecraftClient.options == null) {
            return;
        }
        this.IIIIl(minecraftClient, minecraftClient.options.forwardKey);
        this.IIIIl(minecraftClient, minecraftClient.options.backKey);
        this.IIIIl(minecraftClient, minecraftClient.options.leftKey);
        this.IIIIl(minecraftClient, minecraftClient.options.rightKey);
        this.IIIIl(minecraftClient, minecraftClient.options.sprintKey);
        this.IIIIl(minecraftClient, minecraftClient.options.jumpKey);
        if (minecraftClient.player != null && !this.Illl(minecraftClient, minecraftClient.options.sprintKey)) {
            minecraftClient.player.setSprinting(false);
        }
        this.Il = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.options != null) {
            this.Il = true;
            this.IlIll(minecraftClient, minecraftClient.options.forwardKey, this.lIlI);
            this.IlIll(minecraftClient, minecraftClient.options.backKey, false);
            this.IlIll(minecraftClient, minecraftClient.options.leftKey, this.III);
            this.IlIll(minecraftClient, minecraftClient.options.rightKey, this.IIlll);
            this.IlIll(minecraftClient, minecraftClient.options.sprintKey, this.IIIII);
            this.IlIll(minecraftClient, minecraftClient.options.jumpKey, this.IlII);
            if (minecraftClient.player == null) return;
            minecraftClient.player.setSprinting(this.IIIII);
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    private boolean IIlIl(PlayerEntity var1_1) {
        block7: {
            block8: {
                block9: {
                    block5: {
                        break block5;
                        {
                            block6: {
                                var4_4 = var3_3.next();
                                break block6;
                                return false;
                            }
                            if (var4_4.IIIlIIl() && var4_4 instanceof llIIlIII) break;
lbl7:
                            // 3 sources

                            while (true) {
                                if (!var3_3.hasNext()) ** continue;
                                continue block0;
                                break;
                            }
                        }
                        break block7;
                    }
                    var2_2 = ClientEntrypoint.lII();
                    if (var2_2 == null) break block8;
                    break block9;
lbl15:
                    // 1 sources

                    return true;
lbl17:
                    // 1 sources

                    while (true) {
                        var3_3 = var2_2.IlI().IIIIIll().iterator();
                        ** GOTO lbl7
                        break;
                    }
                }
                ** while (var2_2.IlI() != null)
            }
            return false;
        }
        var5_5 = (llIIlIII)var4_4;
        if (var5_5.IIIlI((Entity)var1_1)) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIlll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return -1;
        if (minecraftClient.player == null) return -1;
        int n = lIIllllI.lllI(minecraftClient.player.getInventory());
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        int n;
        MinecraftClient minecraftClient;
        block9: {
            block8: {
                block10: {
                    block7: {
                        long l2;
                        block6: {
                            minecraftClient = MinecraftClient.getInstance();
                            if (!this.IIlI(minecraftClient)) {
                                this.lIIl();
                                this.IIIll(minecraftClient);
                                this.IIlII = null;
                                return;
                            }
                            l2 = System.nanoTime();
                            if (this.lIIl) break block6;
                            if (l2 < this.IIIl) break block7;
                            this.lIIl = true;
                            this.llI = l2 + 220000000L;
                            this.lIII = this.IIlll(minecraftClient);
                        }
                        if (l2 >= this.llI && this.lIll(minecraftClient)) break block8;
                        n = this.IIlll(minecraftClient);
                        if (this.lIII < 0 || n == this.lIII || this.IIIlI) break block9;
                        break block10;
                    }
                    return;
                }
                if (!lIIllllI.llIlI()) {
                    this.IIlIIll(false);
                    return;
                }
                break block9;
            }
            this.IIlIIll(false);
            return;
        }
        this.lIII = n;
        if (minecraftClient.currentScreen == null && !minecraftClient.player.isDead()) {
            if (((Boolean)this.IIlI.lIl()).booleanValue() && this.IlII(minecraftClient)) {
                this.lIIl();
                this.IIlII(minecraftClient);
                return;
            }
            if (((Boolean)this.llll.lIl()).booleanValue() && minecraftClient.player.isUsingItem()) {
                this.lIIl();
                this.IIlII(minecraftClient);
                return;
            }
            this.IIlII = this.lIII(minecraftClient);
            if (this.IIlII != null) {
                this.lIlI(minecraftClient, this.IIlII);
                this.IIlII(minecraftClient);
                return;
            }
            this.lIIl();
            this.IIlII(minecraftClient);
            this.IlIIl();
            return;
        }
        this.lIIl();
        this.IIIll(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        ++this.IlIlI;
        this.lIIl = false;
        this.IIIl = 0L;
        this.IIlII = null;
        this.IIIlI = false;
        this.lllI = false;
        this.lIIl();
        this.IIIll(MinecraftClient.getInstance());
        this.IlIIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIII(MinecraftClient minecraftClient) {
        if (this.lIIl && this.IIlI(minecraftClient) && minecraftClient.currentScreen == null && this.IIlII != null && this.IllI(minecraftClient, this.IIlII, (Double)this.llIl.lIl()) && !this.lI(minecraftClient, this.IIlII)) {
            double d = Math.sqrt(minecraftClient.player.squaredDistanceTo((Entity)this.IIlII));
            boolean bl = this.IIlIl(this.IIlII);
            boolean bl2 = (Boolean)this.Illl.lIl() != false && bl && d <= Math.min(3.0, (Double)this.lIll.lIl()) && minecraftClient.player.canSee((Entity)this.IIlII);
            this.IIII(minecraftClient, this.IlI(this.IIlII, d, bl), d, bl2);
            return;
        }
        this.IIlIl = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIl() {
        this.IIl = false;
        this.IIllI = 0;
        this.IIIIl = 0;
        this.lll = 0.0;
        this.l = 0.0;
        this.IIlIl = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IlIlI(double d, double d2) {
        if (!this.IIIlIIl()) return;
        if (Math.abs(d) + Math.abs(d2) < 0.01) return;
        if (this.lIIl) {
            MinecraftClient minecraftClient = MinecraftClient.getInstance();
            if (!this.IIlI(minecraftClient)) return;
            if (minecraftClient.currentScreen != null) return;
            if (System.nanoTime() < this.llI) return;
            this.IIlIIll(false);
            return;
        }
    }

    @Override
    public String llIlll() {
        return "This module may get you banned on some servers, only use if you know what you're doing.";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IlIll(MinecraftClient minecraftClient, KeyBinding keyBinding, boolean bl) {
        if (keyBinding == null) {
            return;
        }
        keyBinding.setPressed(bl);
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int IllII(MinecraftClient minecraftClient) {
        int n;
        block4: {
            block3: {
                if (minecraftClient == null) return -1;
                if (minecraftClient.player == null) {
                    return -1;
                }
                n = 0;
                if (!true) break block3;
                if (n >= 9) return -1;
                if (minecraftClient.player.getInventory().getStack(n).isOf(Items.PAPER)) break block4;
            }
            do {
                ++n;
                if (n >= 9) return -1;
            } while (!minecraftClient.player.getInventory().getStack(n).isOf(Items.PAPER));
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlllI(ClientPlayerEntity clientPlayerEntity, boolean bl) {
        double d = clientPlayerEntity.getX();
        double d2 = clientPlayerEntity.getZ();
        if (!(this.IIl && bl && clientPlayerEntity.isOnGround())) {
            if (!bl) {
                this.IIllI = 0;
            }
        } else {
            double d3 = d - this.lll;
            double d4 = d2 - this.l;
            this.IIllI = d3 * d3 + d4 * d4 < 4.0E-4 ? this.IIllI + 1 : Math.max(0, this.IIllI - 2);
        }
        this.lll = d;
        this.l = d2;
        this.IIl = true;
    }

    private static int lIIIl(int n, int n2) {
        return IllII[n ^ 0xB4C60B63] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 21767;
        String string = "\u116d\u1142\u1111\u11b2\u112f\u11b2\u1117\u110c\u114b\u11cc\u11ee\u1103\u553e\u553b\u5536\u55c2\u5579\u5592\u5544\u556a\u5511\u559c\u55df\u554f\u559c\u5547\u55d7\u5593\u55f6\u559c\u55db\u55c4\u555c\u55f9\u5558\u5521\u5545\u555d\u55b7\u55dd\u5534\u55d4\u5591\u5523\u5520\u553c\u5554\u55c6\u5545\u5592\u5559\u5570\u5528\u55aa\u55ba\u5546\u55a7\u5548\u55c2\u55bf\u55f4\u5583\u55c9\u55f2\u5570\u55ea\u556b\u5516\u5527\u551d\u55e8\u55c4\u555d\u55dc\u55b6\u5513\u552f\u552f\u5555\u55f5\u557f\u55bb\u551b\u556a\u5514\u559c\u55be\u5546\u558b\u5544\u55e6\u55aa\u55f6\u55a1\u55e9\u55f2\u5558\u55ea\u554f\u5535\u5552\u5564\u55e0\u55dc\u552a\u558b\u55b0\u5516\u5525\u553c\u5553\u55c5\u5571\u5591\u5559\u5570\u5570\u55e7\u55cd\u5521\u9319\u9335\u9347\u93c6\u935c\u93a6\u9336\u9341\u9335\u93b8\u93ff\u9361\u93a9\u935d\u938c\u93ed\u93d5\u93bf\u9398\u93e4\u937a\u93f3\u933b\u936d\u65e6\u65fb\u65fd\u6559\ud486\ud4bd\ud4ed\ud458\ud4c5\ud417\ud4ef\ud4ca\ud4ba\ud421\ud406\ud4f7\ud431\ud4c1\ud445\ud42f\u43a0\u439e\u43be\u431a\ua5b1\ua5f7\ua5cd\ua549\ua5f6\ua51d\ua5cf\ua5c0\ua59c\ua507\ua52f\ua5d0\ua504\ua5df\ua55f\ua519\ua579\ua500\ua526\ua513\u5287\u52b9\u5299\u523d\u2ce8\u2cc7\u2c80\u2c33\u2cab\u2c6e\u2ca4\u2cb0\u2cc3\u2c73\u2c0d\u2c91\u2c50\u2c82\u2c06\u2c41\u2c24\u2c5d\u2c7b\u2c4e\u800b\u804d\u8067\u80d6\u804a\u80b3\u807d\u8044\u8034\u80af\u8088\u8079\u80bf\u804f\u80cb\u80a1\u59c5\u59fb\u59db\u597f\ucd2a\ucd6c\ucd46\ucdf7\ucd6b\ucd92\ucd5c\ucd65\ucd15\ucd89\ucdfe\ucd4c\ucd9e\ucd47\ucdba\ucdb9\ucdf1\ucd98\ucdcc\ucde4\ucd48\ucde9\ucd01\ucd5a\u8d5f\u8d61\u8d41\u8de5\u434c\u4353\u4336\u438e\u4309\u43e2\u4330\u4371\u4361\u43ce\u43d0\u432f\u43fb\u4320\u439e\u43d1\u4386\u43eb\u43a5\u43ec\u5e2d\u5e6b\u5e51\u5ef0\u5e6e\u5e95\u5e06\u5e75\u5e12\u5e8e\u5ed7\u5e5e\u5e9c\u5e2d\u5ef1\u5ebd\u5ee2\u5eb5\u5ea8\u5ed0\u5e48\u5ee5\u5e0b\u5e5d\u3772\u376d\u3708\u37b0\u3737\u37dc\u370e\u3703\u375b\u37ff\u378a\u371b\u37c2\u371e\u379d\u37e3\u37b4\u379f\u3796\u37a2\u3712\u37b3\u3759\u377c\u370f\u3713\u37f3\u37ff\uac65\uac7f\uac06\uac9a\uac27\uace0\uac08\uac33\uac5d\uacc1\uacb6\uac04\uacd6\uac0f\uacf2\uacf1\uacb9\uacd0\uac84\uacac\uac00\uaca1\uac49\uac12\u7f99\u7fa7\u7f87\u7f23\u63fc\u63fe\u6384\u6320\u63b8\u6344\u63ac\u63b1\u63d0\u634d\u6330\u63ee\u634b\u6392\u6312\u6356\u6323\u6313\u632c\u633a\u63c0\u6314\u6392\u63d5\u6384\u63dd\u6313\u6300\u3f5c\u3f73\u3f2c\u3fa0\u3f19\u3fe0\u3f7a\u3f0b\u3f46\u3fed\u3f84\u3f2c\u3fea\u3f35\u3f87\u3fac\u937a\u9342\u9312\u93a2\u933d\u93e8\u931f\u9329\u935a\u93e5\u939c\u933a\u93ce\u9304\u93bd\u93e9\u93be\u93df\u9394\u93bd\u931e\u93a9\u9359\u930a\ubb61\ubb4d\ubb6a\ubba5\ubb7b\ubbcc\ubb1b\ubb28\ubb49\ubbd0\ubbb9\ubb25\ubbd0\ubb65\ubbb9\ubbfd\ubbaf\ubbfd\ubbff\ubbc7\uf15c\uf170\uf157\uf198\uf146\uf1f1\uf13a\uf11b\uf174\uf1ed\uf180\uf129\uc629\uc648\uc668\uc6cc\u86ed\u86d5\u8685\u8632\u86ad\u8656\u868c\u86be\u86f4\u8658\u8673\u868c\u865a\u8683\u8607\u867c\ua235\ua218\ua23f\ua2cb\ua271\ua288\ua270\ua278\ua212\ua281\ua2fc\ua23a\ua28e\ua25e\ua2de\ua29c\ua2f8\ua295\ua2df\ua292\u0d9b\u0da0\u0dde\u0d66\u0ddf\u0d43\u0de6\u0df2\u0dba\u0d07\u0d44\u0dfe\u0d2c\u0de6\u0d5f\u0d0b\u0d52\u0d3a\u0d7e\u0d4f\u0da4\u0d71\u0da8\u0d87\u0de4\u0dc2\u0d51\u0d6b\u0d9a\u0d5c\u0d34\u0d82\u0d85\u0dbb\u0dcb\u0d50\u0de3\u0d05\u0df8\u0dcb\u0d8c\u0d0f\u0d6a\u0dea\u0d5f\u0de9\u0d55\u0d05\u0d55\u0d08\u0d7b\u0d56\u0dd3\u0d34\u0dca\u0db4\u0ddc\u0dda\u0d51\u0d4e\u0dba\u0d53\u0d2e\u0d84\u0d85\u0ddf\u0dd6\u0d5b\u0ddd\u0d24\u0de6\u0dd0\u0db3\u0d07\u0d43\u0de5\u0d2f\u0df6\u0d5b\u0d0b\u0d55\u0d3a\u0d48\u0d4b\u0da4\u0d71\u0dcc\u0db4\u0de2\u0db8\u0d52\u0d70\u0d9c\u0d5f\u0d05\u0d85\u0d8e\u0dda\u0dcf\u0d45\u0de3\u0d1a\u0dfb\u0dc6\u0d98\u0d35\u0d5b\u0de4\u0d05\u0dea\u0d45\u0d07\u0d55\u0d7f\u0d73\u0d62";
        char[] cArray = "\u550b\u556b\u551f\u5503\u5517\u5503\u5513\u5503\u5513\u5517\u5503\u551f\u5503\u5513\u551f\u551b\u551f\u5503\u551b\u5517\u551f\u5513\u550b\u5503\u5517\u5513\u5573".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 != 0) {
                do {
                    n5 = cArray[n3] ^ n;
                    stringArray[n3] = string.substring(n4, n4 + n5);
                    n4 += n5;
                } while (++n3 < cArray.length);
            } else {
                IllIl = stringArray;
                IlllI = new Object[stringArray.length];
                int n6 = 498837462;
                byte[] byArray = "\u001c\u009f{\u001bSU\u00d4\u00a08\u00ef\u00cd\u00a6\u0000\u00c8[\u009c\u00e1\u001f\u0012W".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                IllII = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    AutoPlay.IllII[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                return;
            }
            n2 = 0;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lIIlI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x1A511F26;
        char[] cArray = IllIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlllI[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            AutoPlay.IlllI[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x11DDC76B;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 31: {
                    n6 = 234;
                    continue block33;
                }
                case 28: {
                    n6 = 198;
                    continue block33;
                }
                case 30: {
                    n6 = 105;
                    continue block33;
                }
                default: {
                    n6 = 226;
                    continue block33;
                }
                case 1: {
                    n6 = 225;
                    continue block33;
                }
                case 2: {
                    n6 = 173;
                    continue block33;
                }
                case 16: {
                    n6 = 24;
                    continue block33;
                }
                case 26: {
                    n6 = 45;
                    continue block33;
                }
                case 18: {
                    n6 = 57;
                    continue block33;
                }
                case 10: {
                    n6 = 38;
                    continue block33;
                }
                case 15: {
                    n6 = 90;
                    continue block33;
                }
                case 13: {
                    n6 = 167;
                    continue block33;
                }
                case 23: {
                    n6 = 222;
                    continue block33;
                }
                case 14: {
                    n6 = 59;
                    continue block33;
                }
                case 21: {
                    n6 = 10;
                    continue block33;
                }
                case 8: {
                    n6 = 233;
                    continue block33;
                }
                case 17: {
                    n6 = 69;
                    continue block33;
                }
                case 25: {
                    n6 = 135;
                    continue block33;
                }
                case 6: {
                    n6 = 129;
                    continue block33;
                }
                case 12: {
                    n6 = 101;
                    continue block33;
                }
                case 27: {
                    n6 = 33;
                    continue block33;
                }
                case 7: {
                    n6 = 152;
                    continue block33;
                }
                case 11: {
                    n6 = 182;
                    continue block33;
                }
                case 5: {
                    n6 = 121;
                    continue block33;
                }
                case 20: {
                    n6 = 156;
                    continue block33;
                }
                case 24: {
                    n6 = 190;
                    continue block33;
                }
                case 9: {
                    n6 = 116;
                    continue block33;
                }
                case 3: {
                    n6 = 9;
                    continue block33;
                }
                case 19: {
                    n6 = 12;
                    continue block33;
                }
                case 22: {
                    n6 = 136;
                    continue block33;
                }
                case 4: {
                    n6 = 190;
                    continue block33;
                }
                case 29: 
            }
            n6 = 18;
        }
        return new String(cArray).intern();
    }
}

