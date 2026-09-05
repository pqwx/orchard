/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllIlll
 * Module         : PlayerFreeze  [COMBAT]
 * Description    : After hitting a player, holds packets for a fixed time and then flushes them.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Cooldown ms
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
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EntityType
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.network.packet.BundlePacket
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityPositionSyncS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket
 *  net.minecraft.network.packet.s2c.play.PositionFlag
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.World
 */
package orchard.module.combat;

import java.awt.Color;
import java.util.Iterator;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.BundlePacket;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.EntitiesDestroyS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityPositionSyncS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityS2CPacket;
import net.minecraft.network.packet.s2c.play.EntitySpawnS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PositionFlag;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlI;
import orchard.internal.IIllI;
import orchard.internal.IIllIIlII;
import orchard.internal.IIllIllI;
import orchard.internal.IIllllllI;
import orchard.internal.IlIIIIll;
import orchard.internal.IlIlIlIII;
import orchard.internal.IllIlI;
import orchard.internal.lIIIlIII;
import orchard.internal.lIIIlIl;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlll;
import orchard.internal.lIllllll;
import orchard.internal.llIIIII;
import orchard.internal.llIIlIII;
import orchard.internal.llIll;
import orchard.mixin.EntityS2CPacketMixin2;
import orchard.module.combat.Backtrack;

@Environment(value=EnvType.CLIENT)
public final class PlayerFreeze
extends ModuleBase
implements llIIlIII {
    private long I;
    private static final double l = 2.0;
    private final lIlIIlI II;
    private static final double Il = 64.0;
    private static final int lI = 10;
    private long ll;
    private static final double III = 16.0;
    private long IIl;
    private final llIll IlI;
    private final lIlIIlI Ill;
    private static final double lII = 6.0;
    private final IIIIIIIIl<lIllllll> lIl;
    private static final double llI = 2.0;
    private volatile boolean lll;
    private long IIII;
    private static final long IIIl = 10000L;
    private static final double IIlI = 8.0;
    private int IIll;
    private final lIlIIlI IlII;
    private final llIll IlIl;
    private double IllI;
    private static final double Illl = 3.0;
    private final llIll lIII;
    private static final double lIIl = 8.0;
    private final llIll lIlI;
    private volatile Entity lIll;
    private static final double llII = 0.18;
    private volatile Vec3d llIl;
    private static final double lllI = Math.PI * 2;
    private static final long llll = 100L;
    private final lIlIIlI IIIII;
    private long IIIIl;
    private static final int IIIlI = 26;
    private static final long IIIll = 10000L;
    private static final double IIlII = 0.32;
    private static final double IIlIl = 4.0;
    private final IIIIIIIIl<IIllI> IIllI;
    private static final int IIlll = 20;
    private static final long IlIII = 1000L;
    private static final float IlIIl = 2.4f;
    private double IlIlI;
    private Vec3d IlIll;
    private long IllII;
    private final llIll IllIl;
    private final lIlIIlI IlllI;
    private final lIlIIlI Illll;
    private long lIIII;
    private static final int[] lIIIl;
    private static final String[] lIIlI;
    private static final Object[] lIIll;

    private long lI() {
        return Math.max(1000L, Math.min(10000L, Math.round((Double)this.Illll.lIl())));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIl(MinecraftClient minecraftClient, Entity entity) {
        boolean bl;
        if (!this.lIIlI()) {
            bl = this.llII(minecraftClient, entity);
            return bl;
        }
        bl = this.IlIlI(minecraftClient, entity, this.lIlIl());
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IlIIlI(Entity entity) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IlI(minecraftClient)) return;
        if (!this.llIII(minecraftClient)) {
            if (this.lIl.lIl() != lIllllll.II) {
                return;
            }
            if (!(entity instanceof PlayerEntity)) return;
            if (entity == minecraftClient.player) {
                return;
            }
        } else {
            return;
        }
        if (!this.IIl(minecraftClient, entity)) return;
        if (!this.IlIll()) {
            return;
        }
        if (this.IIll >= 0 && entity.getId() != this.IIll) {
            return;
        }
        long l2 = System.currentTimeMillis();
        this.ll = l2;
        if (this.lll) return;
        if (!this.IIIIIl(l2)) return;
        this.IllI(entity, l2);
        this.lIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.getNetworkHandler() == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Box lII() {
        Entity entity = this.lIll;
        Vec3d vec3d = this.llIl;
        if (entity == null) return null;
        if (vec3d != null) return entity.getDimensions(entity.getPose()).getBoxAt(vec3d);
        return null;
    }

    private void lIl() {
        this.IllII = 0L;
        this.IIll = -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        this.IIIIII();
        this.llIlI();
        this.lIl();
        IIllIllI.IIIII().llIl(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private PlayerEntity lll(MinecraftClient minecraftClient) {
        if (this.IIll < 0) return null;
        if (minecraftClient == null) return null;
        if (minecraftClient.world == null) {
            return null;
        }
        Entity entity = minecraftClient.world.getEntityById(this.IIll);
        if (!(entity instanceof PlayerEntity)) return null;
        PlayerEntity playerEntity = (PlayerEntity)entity;
        if (playerEntity == minecraftClient.player) return null;
        if (playerEntity.isSpectator()) return null;
        if (this.Illl((Entity)playerEntity)) return null;
        if (IIllllllI.l(playerEntity)) return null;
        if (this.IIl(minecraftClient, (Entity)playerEntity)) return playerEntity;
        return null;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void IIII(DrawContext drawContext, double d, double d2) {
        double d3 = (Double)this.IlII.lIl();
        double d4 = Math.max(1.6, d3 * 0.22);
        double d5 = (double)System.nanoTime() / 1.0E9 * (Math.PI * 2) * 1.35;
        int n = Math.max(0, Math.min(255, (int)Math.round((Double)this.II.lIl())));
        int n2 = IlIIIIll.III().getRGB();
        int n3 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                ++n3;
            }
            if (n3 >= 26) {
                return;
            }
            double d6 = (double)n3 / 26.0;
            double d7 = (double)(n3 + 1) / 26.0;
            double d8 = d5 + d6 * Math.PI;
            double d9 = d5 + d7 * Math.PI;
            double d10 = 0.35 + 0.65 * d7;
            int n4 = Math.max(20, Math.min(255, (int)Math.round((double)n * d10)));
            int n5 = lIIIlIII.II(n2, n4);
            double d11 = d + Math.cos(d8) * d3;
            double d12 = d2 + Math.sin(d8) * d3;
            double d13 = d + Math.cos(d9) * d3;
            double d14 = d2 + Math.sin(d9) * d3;
            orchard.internal.IIIlI.Illlll(drawContext, d11, d12, d13, d14, d4, n5);
            if (n3 != 0 && n3 != 25) continue;
            orchard.internal.IIIlI.IIIIIl(drawContext, n3 == 0 ? d11 : d13, n3 == 0 ? d12 : d14, d4 * 0.5, n5);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIlI(Packet<?> packet) {
        int n;
        Entity entity = this.lIll;
        if (!this.lll) return false;
        if (entity == null) return false;
        if (packet == null) {
            return false;
        }
        if (!(packet instanceof BundlePacket)) {
            n = entity.getId();
            if (PlayerFreeze.IIllI(packet, entity)) return true;
            if (IIllIllI.lIIl(packet.getClass().getName())) return true;
            if (PlayerFreeze.lIll(packet, n)) {
                return true;
            }
            if (packet instanceof EntityPositionSyncS2CPacket) {
                EntityPositionSyncS2CPacket entityPositionSyncS2CPacket = (EntityPositionSyncS2CPacket)packet;
                if (entityPositionSyncS2CPacket.id() != n) return false;
                return true;
            }
        } else {
            Packet packet2;
            BundlePacket bundlePacket = (BundlePacket)packet;
            Iterator iterator = bundlePacket.getPackets().iterator();
            do {
                if (!iterator.hasNext()) return false;
            } while (!this.IIlI(packet2 = (Packet)iterator.next()));
            return true;
        }
        if (packet instanceof EntityPositionS2CPacket) {
            EntityPositionS2CPacket entityPositionS2CPacket = (EntityPositionS2CPacket)packet;
            if (entityPositionS2CPacket.entityId() != n) return false;
            return true;
        }
        if (!(packet instanceof EntityS2CPacket)) return false;
        EntityS2CPacket entityS2CPacket = (EntityS2CPacket)packet;
        if (((EntityS2CPacketMixin2)entityS2CPacket).ilovcats$getId() != n) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static double IlII(IIllI iIllI, boolean bl, double d) {
        if (iIllI == orchard.internal.IIllI.II) {
            return 6.0;
        }
        if (iIllI != orchard.internal.IIllI.Il) {
            if (iIllI != orchard.internal.IIllI.lI) return Double.POSITIVE_INFINITY;
            if (!bl) return Double.POSITIVE_INFINITY;
            return Math.max(2.0, Math.min(16.0, d));
        }
        return 8.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllI(Entity entity, long l2) {
        if (this.Illl(entity)) {
            return;
        }
        this.IIIIII();
        IIllIllI iIllIllI = IIllIllI.IIIII();
        iIllIllI.III(false, true);
        iIllIllI.IlIIl(false);
        iIllIllI.lIlI(true, llIIIII.II, 0);
        this.I = l2 + this.lI();
        this.lIll = entity;
        this.llIl = PlayerFreeze.Illll(entity);
        this.IlIll = this.llIl;
        this.IIII = 0L;
        this.lll = true;
        lIIIlIl.lI(this::IIlI, this::lllI);
        iIllIllI.IlIlI(true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean Illl(Entity entity) {
        if (!(entity instanceof PlayerEntity)) return false;
        PlayerEntity playerEntity = (PlayerEntity)entity;
        if (!playerEntity.isGliding()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIII(int n) {
        int n2 = PlayerFreeze.IlIII((lIllllll)((Object)this.lIl.lIl()));
        this.llIlI();
        IIllIllI.IIIII().llIl(false);
        this.IIll = n;
        this.IllII = this.IIIIl + (long)n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Ill(II iI) {
        lIlll lIlll2;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!((Boolean)this.IllIl.lIl()).booleanValue() || iI == null || !this.IlIIl(minecraftClient, System.currentTimeMillis())) {
            this.IIl = 0L;
            return;
        }
        if (!this.llII(minecraftClient, this.lIll)) {
            this.IIl = 0L;
            return;
        }
        Box box = this.IIIIlI();
        if (box != null) {
            this.llllI(iI, box);
        }
        if ((lIlll2 = IllIlI.llIll(iI, this.lIIIl(this.lIll.getBoundingBox()))) != null) {
            this.IlIlI = lIlll2.l();
            this.IllI = lIlll2.I();
            this.IIl = System.currentTimeMillis();
            return;
        }
        this.IIl = 0L;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void III() {
        block29: {
            block26: {
                block20: {
                    block24: {
                        block28: {
                            block27: {
                                block31: {
                                    block23: {
                                        block25: {
                                            block19: {
                                                block30: {
                                                    block18: {
                                                        block21: {
                                                            block22: {
                                                                ++this.IIIIl;
                                                                break block27;
lbl3:
                                                                // 1 sources

                                                                while (!this.IlI(var1_1)) {
                                                                    this.llIlI();
                                                                    break block18;
                                                                }
                                                                break block28;
                                                                while (true) {
                                                                    break block19;
                                                                    break;
                                                                }
lbl9:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (var2_3.I()) ** continue;
                                                                    break block20;
                                                                    break;
                                                                }
lbl12:
                                                                // 1 sources

                                                                while (!this.llIII(var1_1)) {
                                                                    break block21;
                                                                }
                                                                break block29;
                                                                while (true) {
                                                                    v0 = false;
                                                                    break block22;
                                                                    break;
                                                                }
lbl18:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
lbl21:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
                                                            this.lllll(var1_1);
                                                            return;
                                                        }
                                                        if (var6_4) break block29;
                                                        break block30;
lbl28:
                                                        // 1 sources

                                                        while (true) {
                                                            this.lIl();
                                                            break block23;
                                                            break;
                                                        }
lbl31:
                                                        // 2 sources

                                                        while (true) {
                                                            v1 = false;
                                                            break block24;
                                                            break;
                                                        }
lbl34:
                                                        // 1 sources

                                                        while (true) {
                                                            if (!var2_3.lII()) break block20;
                                                            ** continue;
                                                            break;
                                                        }
lbl37:
                                                        // 1 sources

                                                        while (true) {
                                                            if (!PlayerFreeze.lIllI(var1_1.player.getEyePos(), this.lII(), this.lIlIl())) ** GOTO lbl31
                                                            break block25;
                                                            break;
                                                        }
lbl40:
                                                        // 1 sources

                                                        while (!var5_5) {
                                                            ** GOTO lbl12
                                                        }
                                                        break block29;
                                                    }
                                                    IIllIllI.IIIII().llIl(false);
                                                    return;
                                                }
                                                if (var3_2 < this.I) break block31;
                                                break block29;
                                            }
                                            var3_2 = System.currentTimeMillis();
                                            if (this.lIIlI()) ** break;
                                            ** while (true)
                                            ** while (true)
                                            while (true) {
                                                var2_3 = IIllIllI.IIIII();
                                                ** continue;
                                                break;
                                            }
                                        }
                                        v1 = true;
                                        break block24;
                                    }
lbl61:
                                    // 2 sources

                                    while (true) {
                                        if (this.lll) ** continue;
                                        ** continue;
                                        break;
                                    }
lbl64:
                                    // 1 sources

                                    while (true) {
                                        if (this.llII(var1_1, this.lIll)) ** continue;
                                        break block26;
                                        break;
                                    }
                                }
lbl68:
                                // 2 sources

                                return;
lbl70:
                                // 1 sources

                                return;
                            }
                            var1_1 = MinecraftClient.getInstance();
                            ** GOTO lbl3
                        }
                        ** while (this.IlllI())
lbl77:
                        // 1 sources

                        ** while (true)
                    }
                    var5_5 = v1;
                    ** while (true)
                    var6_4 = v0;
                    if (this.Illl(this.lIll)) break block29;
                    ** GOTO lbl40
lbl84:
                    // 1 sources

                    while (true) {
                        IIllIllI.IIIII().llIl(false);
                        ** continue;
                        break;
                    }
                }
                this.llIlI();
                var2_3.llIl(false);
                ** while (true)
            }
            v0 = true;
            ** while (true)
        }
        this.llIlI();
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean lIll(Packet<?> packet, int n) {
        if (!(packet instanceof EntitySpawnS2CPacket)) return false;
        EntitySpawnS2CPacket entitySpawnS2CPacket = (EntitySpawnS2CPacket)packet;
        if (entitySpawnS2CPacket.getEntityType() != EntityType.FIREWORK_ROCKET) return false;
        if (entitySpawnS2CPacket.getEntityData() != n) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llII(MinecraftClient minecraftClient, Entity entity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (entity == null) return false;
        if (!entity.isAlive()) return false;
        if (entity.isRemoved()) return false;
        if (minecraftClient.world.getEntityById(entity.getId()) != entity) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void lllI(Packet<?> packet) {
        block16: {
            Vec3d vec3d;
            block14: {
                EntityS2CPacket entityS2CPacket;
                Vec3d vec3d2;
                int n;
                block15: {
                    int n2;
                    if (!this.lll) return;
                    if (this.lIll == null) return;
                    if (packet == null) break block14;
                    if (!(packet instanceof BundlePacket)) {
                        if (PlayerFreeze.IIllI(packet, this.lIll)) {
                            this.lIl();
                            this.lIlII();
                            return;
                        }
                    } else {
                        BundlePacket bundlePacket = (BundlePacket)packet;
                        Iterator iterator = bundlePacket.getPackets().iterator();
                        do {
                            if (!iterator.hasNext()) return;
                            Packet packet2 = (Packet)iterator.next();
                            this.lllI(packet2);
                        } while (this.lll);
                        return;
                    }
                    n = this.lIll.getId();
                    MinecraftClient minecraftClient = MinecraftClient.getInstance();
                    int n3 = n2 = minecraftClient == null || minecraftClient.player == null ? -1 : minecraftClient.player.getId();
                    if (this.IlllI() && n2 >= 0 && PlayerFreeze.IIIll(packet, n2, n, this.ll)) {
                        this.lIII(n);
                        return;
                    }
                    if (IIllIllI.lIIl(packet.getClass().getName()) || PlayerFreeze.lIll(packet, n)) {
                        this.lIlII();
                        return;
                    }
                    if (this.llIl == null) {
                        this.llIl = PlayerFreeze.Illll(this.lIll);
                    }
                    if (!(packet instanceof EntityPositionSyncS2CPacket)) break block15;
                    EntityPositionSyncS2CPacket entityPositionSyncS2CPacket = (EntityPositionSyncS2CPacket)packet;
                    if (entityPositionSyncS2CPacket.id() == n) {
                        Vec3d vec3d3 = vec3d = entityPositionSyncS2CPacket.values() == null ? null : entityPositionSyncS2CPacket.values().position();
                    }
                    break block16;
                }
                if (packet instanceof EntityPositionS2CPacket) {
                    EntityPositionS2CPacket entityPositionS2CPacket = (EntityPositionS2CPacket)packet;
                    if (entityPositionS2CPacket.entityId() == n) {
                        Vec3d vec3d4 = vec3d2 = entityPositionS2CPacket.change() == null ? null : PlayerFreeze.IIlIl(this.llIl, entityPositionS2CPacket.change().position(), entityPositionS2CPacket.relatives());
                    }
                    break block16;
                } else if (packet instanceof EntityS2CPacket && ((EntityS2CPacketMixin2)(entityS2CPacket = (EntityS2CPacket)packet)).ilovcats$getId() == n) {
                    this.llIl = PlayerFreeze.IIIIl(this.llIl, entityS2CPacket.getDeltaX(), entityS2CPacket.getDeltaY(), entityS2CPacket.getDeltaZ());
                }
                break block16;
                if (vec3d2 != null) {
                    this.llIl = vec3d2;
                }
                break block16;
            }
            return;
            if (vec3d != null) {
                this.llIl = vec3d;
            }
        }
        this.llIll();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIIII(MinecraftClient minecraftClient, Entity entity) {
        if (!this.IIIlIIl()) return false;
        if (!this.lll) {
            return false;
        }
        if (entity == null) return false;
        if (this.lIll == null) return false;
        if (entity.getId() != this.lIll.getId()) {
            this.llIlI();
            IIllIllI.IIIII().llIl(false);
            return true;
        }
        return false;
    }

    static Vec3d IIIIl(Vec3d vec3d, long l2, long l3, long l4) {
        if (vec3d == null) {
            return null;
        }
        return new Vec3d(vec3d.x + (double)l2 / 4096.0, vec3d.y + (double)l3 / 4096.0, vec3d.z + (double)l4 / 4096.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean IIIll(Packet<?> packet, int n, int n2, long l2) {
        if (packet == null) return false;
        if (n < 0) return false;
        if (packet instanceof EntityDamageS2CPacket) {
            EntityDamageS2CPacket entityDamageS2CPacket = (EntityDamageS2CPacket)packet;
            if (entityDamageS2CPacket.entityId() != n) return false;
            if (n2 >= 0) {
                if (entityDamageS2CPacket.sourceCauseId() == n2) return true;
                if (entityDamageS2CPacket.sourceDirectId() == n2) return true;
                return false;
            }
            if (entityDamageS2CPacket.sourceCauseId() < 0) return false;
            if (entityDamageS2CPacket.sourceCauseId() == n) return false;
            return true;
        }
        if (!(packet instanceof EntityVelocityUpdateS2CPacket)) return false;
        EntityVelocityUpdateS2CPacket entityVelocityUpdateS2CPacket = (EntityVelocityUpdateS2CPacket)packet;
        if (entityVelocityUpdateS2CPacket.getEntityId() != n) {
            return false;
        }
        long l3 = System.currentTimeMillis();
        if (l3 - l2 < 400L) {
            return false;
        }
        Vec3d vec3d = entityVelocityUpdateS2CPacket.getVelocity();
        if (vec3d == null) return false;
        double d = vec3d.x;
        double d2 = vec3d.y;
        double d3 = vec3d.z;
        double d4 = d * d + d3 * d3;
        double d5 = d4 + d2 * d2;
        if (d2 >= 0.1) return true;
        if (d4 >= 0.0484) return true;
        if (d5 >= 0.0625) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean IIlII(long l2, long l3, boolean bl) {
        if (!bl) return true;
        if (l2 < l3) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static Vec3d IIlIl(Vec3d vec3d, Vec3d vec3d2, Set<PositionFlag> set) {
        Vec3d vec3d3;
        if (vec3d2 == null) {
            return vec3d;
        }
        if (vec3d == null) return vec3d2;
        if (set == null) return vec3d2;
        if (set.isEmpty()) {
            return vec3d2;
        }
        vec3d3(!set.contains(PositionFlag.X) ? vec3d2.x : vec3d.x + vec3d2.x, set.contains(PositionFlag.Y) ? vec3d.y + vec3d2.y : vec3d2.y, set.contains(PositionFlag.Z) ? vec3d.z + vec3d2.z : vec3d2.z);
        return vec3d3;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean IIIlI(Entity entity) {
        if (entity == null) return false;
        if (entity != this.lIll) return false;
        if (!this.l()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean IIllI(Packet<?> packet, Entity entity) {
        if (packet == null) return false;
        if (entity == null) {
            return false;
        }
        if (packet instanceof EntitiesDestroyS2CPacket) {
            EntitiesDestroyS2CPacket entitiesDestroyS2CPacket = (EntitiesDestroyS2CPacket)packet;
            return entitiesDestroyS2CPacket.getEntityIds().contains(entity.getId());
        }
        if (!(packet instanceof EntityStatusS2CPacket)) return false;
        EntityStatusS2CPacket entityStatusS2CPacket = (EntityStatusS2CPacket)packet;
        if (entityStatusS2CPacket.getStatus() != 3) {
            return false;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (entityStatusS2CPacket.getEntity((World)minecraftClient.world) != entity) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static int IlIII(lIllllll lIllllll2) {
        if (lIllllll2 != lIllllll.l) return 10;
        return 20;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIIl(MinecraftClient minecraftClient, long l2) {
        if (!this.lll) return false;
        if (l2 >= this.I) return false;
        if (this.lIll == null) return false;
        if (!IIllIllI.IIIII().I()) return false;
        if (!IIllIllI.IIIII().IIll()) return false;
        if (!this.llII(minecraftClient, this.lIll)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIlI(MinecraftClient minecraftClient, Entity entity, double d) {
        if (!this.llII(minecraftClient, entity)) return false;
        if (!IlIlIlIII.IlI(minecraftClient.player.squaredDistanceTo(entity), d)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if ((Boolean)this.IllIl.lIl() == false) return;
        if (drawContext == null) return;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.options.hudHidden) return;
        if (!this.IlIIl(minecraftClient, System.currentTimeMillis())) return;
        if (System.currentTimeMillis() - this.IIl <= 100L) {
            this.IIII(drawContext, this.IlIlI, this.IllI);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public PlayerFreeze() {
        super(StringFactory.IIII("qJhVhRxFdg6SDYVc"), Category.II, StringFactory.IIII("uZJAmQsXWBWDHJZXCJPf3oiYVYUcRRxcnweTXRyTzp+bn1GIChdWE4VInhkJ2sabnNRAlRRSEB2ZDN9NB9bQ3p6YQY8RUkNcgwCaVEE="));
        lIlIIlI lIlIIlI2;
        llIll llIll2;
        lIlIIlI lIlIIlI3;
        llIll llIll3;
        IIIIIIIIl<lIllllll> iIIIIIIIl;
        IIIIIIIIl<IIllI> iIIIIIIIl2;
        iIIIIIIIl2(StringFactory.IIII("tZtQmQ=="), IIllI.class, orchard.internal.IIllI.I);
        this.IIllI = this.IIlllIl(iIIIIIIIl2);
        iIIIIIIIl(StringFactory.IIII("uZdAlQ9WRBWYBg=="), lIllllll.class, lIllllll.II);
        this.lIl = this.IIlllIl(iIIIIIIIl);
        this.IIIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("uYREjhZWUxTXOp5XCNY="), 3.0, 2.0, 4.0, 0.1).IIII(StringFactory.IIII("mg==")));
        llIll3((Object)StringFactory.IIII("qpVamxwXcxSSC5Q="), true);
        this.lIlI = this.IIlllIl(llIll3);
        this.IlllI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("tZVM3CtWXhuS"), 8.0, 2.0, 16.0, 0.1).IIII(StringFactory.IIII("mg==")));
        this.IlIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("rZpSjhxSShnXJ5EZK9LTn5+R"), true));
        lIlIIlI3(StringFactory.IIII("vJFYnQA="), 1000.0, 1000.0, 10000.0, 50.0);
        this.Illll = this.IIlllIl(lIlIIlI3.IIII(StringFactory.IIII("lYc=")));
        this.lIII = this.IIlllIl(new llIll((Object)StringFactory.IIII("u5tbkB1YRxI="), false));
        this.Ill = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Cooldown ms"), 1000.0, 0.0, 10000.0, 50.0).IIII(StringFactory.IIII("lYc=")));
        llIll2((Object)StringFactory.IIII("r5VAmQsXcxSSC5Q="), true);
        this.IlI = this.IIlllIl(llIll2);
        this.IllIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("sZpQlRpWRBOF"), true));
        this.IlII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("sZpQlRpWRBOFSKxQFdY="), 9.0, 5.0, 16.0, 1.0).IIII(StringFactory.IIII("iIw=")));
        lIlIIlI2(StringFactory.IIII("sZpQlRpWRBOFSLBJDtDXioE="), 215.0, 80.0, 255.0, 5.0);
        this.II = this.IIlllIl(lIlIIlI2);
        this.IIll = -1;
        this.IIIII.lIII(() -> {
            if (this.lIl.lIl() != lIllllll.l) return false;
            return true;
        });
        this.lIlI.lIII(() -> this.IIllI.lIl() == orchard.internal.IIllI.lI);
        this.IlllI.lIII(() -> this.IIllI.lIl() == orchard.internal.IIllI.lI && (Boolean)this.lIlI.lIl() != false);
        this.IlIl.lIII(() -> {
            if (this.IIllI.lIl() != orchard.internal.IIllI.lI) return false;
            return true;
        });
        this.Ill.lIII(this.lIII::lIl);
        this.IlII.lIII(this.IllIl::lIl);
        this.II.lIII(this.IllIl::lIl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIll() {
        if (this.IIIIl < this.IllII) return false;
        return true;
    }

    static boolean IllII(Packet<?> packet, int n) {
        return PlayerFreeze.IIIll(packet, n, -1, 0L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlllI() {
        if (this.IIllI.lIl() == orchard.internal.IIllI.Il) return true;
        if (this.IIllI.lIl() != orchard.internal.IIllI.lI) return false;
        if ((Boolean)this.IlIl.lIl() == false) return false;
        return true;
    }

    @Override
    public String II() {
        return ((IIllI)((Object)this.IIllI.lIl())).toString();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Vec3d Illll(Entity entity) {
        Vec3d vec3d;
        if (entity == null) return null;
        Vec3d vec3d2 = entity.getTrackedPosition().getPos();
        if (vec3d2 == null) {
            vec3d = entity.getEntityPos();
            return vec3d;
        }
        vec3d = vec3d2;
        return vec3d;
    }

    private Vec3d lIIIl(Box box) {
        return new Vec3d((box.minX + box.maxX) * 0.5, (box.minY + box.maxY) * 0.5, (box.minZ + box.maxZ) * 0.5);
    }

    private boolean lIIlI() {
        return Double.isFinite(this.lIlIl());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean l() {
        if (!this.lll) return false;
        if (!IIllIllI.IIIII().I()) return false;
        if (IIllIllI.IIIII().IIll()) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static Vec3d lIIll(Vec3d vec3d, Vec3d vec3d2, double d) {
        if (vec3d2 == null) {
            return null;
        }
        if (vec3d == null) return vec3d2;
        if (!(vec3d.squaredDistanceTo(vec3d2) > 64.0)) return vec3d.lerp(vec3d2, Math.max(0.0, Math.min(1.0, d)));
        return vec3d2;
    }

    private void lIlII() {
        this.llIlI();
        IIllIllI.IIIII().llIl(false);
    }

    private double lIlIl() {
        return PlayerFreeze.IlII((IIllI)((Object)this.IIllI.lIl()), (Boolean)this.lIlI.lIl(), (Double)this.IlllI.lIl());
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean lIllI(Vec3d vec3d, Box box, double d) {
        if (vec3d == null) return false;
        if (box == null) {
            return false;
        }
        double d2 = Math.max(box.minX, Math.min(vec3d.x, box.maxX));
        double d3 = Math.max(box.minY, Math.min(vec3d.y, box.maxY));
        double d4 = Math.max(box.minZ, Math.min(vec3d.z, box.maxZ));
        double d5 = vec3d.x - d2;
        double d6 = vec3d.y - d3;
        double d7 = vec3d.z - d4;
        double d8 = Math.max(0.0, d);
        if (d5 * d5 + d6 * d6 + d7 * d7 > d8 * d8) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIII(MinecraftClient minecraftClient) {
        if ((Boolean)this.IlI.lIl() == false) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.player.isTouchingWater()) return true;
        if (minecraftClient.player.isSubmergedInWater()) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIlI() {
        if (!this.lll) {
            lIIIlIl.IlIllI();
            this.IlIll = null;
            this.IIII = 0L;
            this.IIl = 0L;
            return;
        }
        IIllIllI iIllIllI = IIllIllI.IIIII();
        lIIIlIl.IIllIII();
        lIIIlIl.IlIllI();
        iIllIllI.IlIlI(false);
        iIllIllI.lIII();
        lIIIlIl.IIIIlll();
        lIIIlIl.IlIlI();
        this.lll = false;
        this.I = 0L;
        this.lIIII = (Boolean)this.lIII.lIl() != false ? System.currentTimeMillis() + this.lllII() : 0L;
        this.lIll = null;
        this.llIl = null;
        this.IlIll = null;
        this.IIII = 0L;
        this.IIl = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        this.IIIIII();
        this.I = 0L;
        this.lIIII = 0L;
        this.lll = false;
        this.lIll = null;
        this.llIl = null;
        this.IlIll = null;
        this.IIII = 0L;
        this.IIl = 0L;
        this.IIIIl = 0L;
        this.lIl();
        lIIIlIl.IlIllI();
        IIllIllI.IIIII().llIl(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIll() {
        if (!this.lll) return;
        if (!this.lIIlI()) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (PlayerFreeze.lIllI(minecraftClient.player.getEyePos(), this.lII(), this.lIlIl() + 0.35)) {
            this.lIlII();
            return;
        }
    }

    private long lllII() {
        return Math.max(0L, Math.min(10000L, Math.round((Double)this.Ill.lIl())));
    }

    /*
     * Unable to fully structure code
     */
    private PlayerEntity lllIl(MinecraftClient var1_1, double var2_2) {
        block14: {
            block12: {
                block13: {
                    block15: {
                        block18: {
                            block11: {
                                block10: {
                                    if (var1_1 == null) break block13;
                                    break block14;
lbl3:
                                    // 1 sources

                                    while (var13_9 <= var9_6) {
                                        break block10;
                                    }
                                    break block12;
lbl6:
                                    // 1 sources

                                    while (this.llII(var1_1, (Entity)var12_8)) {
                                        break block11;
                                    }
                                    break block12;
lbl9:
                                    // 1 sources

                                    while (true) {
                                        var9_6 = var13_9;
                                        break block12;
                                        break;
                                    }
lbl12:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl14:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl16:
                                    // 1 sources

                                    while (IIllllllI.l(var12_8)) {
                                        break block12;
                                    }
                                    break block15;
lbl19:
                                    // 1 sources

                                    while (true) {
                                        block16: {
                                            block17: {
                                                if (!this.lIIlI()) break block16;
                                                break block17;
lbl22:
                                                // 2 sources

                                                while (true) {
                                                    var4_3 = v0;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            v0 = Math.min(var2_2, this.lIlIl());
                                            ** GOTO lbl22
                                        }
                                        v0 = var2_2;
                                        ** continue;
                                        break;
                                    }
                                }
                                var8_5 = var12_8;
                                ** while (true)
                                var6_4 = var4_3 * var4_3;
                                break block18;
                            }
                            if (var12_8.isSpectator()) break block12;
                            if (this.Illl((Entity)var12_8)) break block12;
                            ** GOTO lbl16
                        }
                        var8_5 = null;
                        var9_6 = var6_4;
                        var11_7 = var1_1.world.getPlayers().iterator();
                        break block12;
                    }
                    var13_9 = var1_1.player.squaredDistanceTo((Entity)var12_8);
                    ** GOTO lbl3
                }
lbl49:
                // 2 sources

                return null;
                var12_8 = (PlayerEntity)var11_7.next();
                if (var12_8 == var1_1.player) break block12;
                ** GOTO lbl6
lbl54:
                // 1 sources

                return var8_5;
            }
            ** while (!var11_7.hasNext())
lbl58:
            // 1 sources

            ** while (true)
        }
        ** while (var1_1.player != null && var1_1.world != null)
lbl61:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llllI(II iI, Box box) {
        Color color = IlIIIIll.III();
        double d = Math.max(0.0, Math.min(255.0, (Double)this.II.lIl()));
        IllIlI.IIIlll(iI, box, color, d * 0.18);
        IllIlI.IlIl(iI, box, color, d, 2.4f);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllll(MinecraftClient minecraftClient) {
        PlayerEntity playerEntity;
        block1: {
            block2: {
                block0: {
                    if (this.lIl.lIl() != lIllllll.l) return;
                    if (this.llIII(minecraftClient)) return;
                    if (!this.IlIll()) return;
                    if (!this.IIIIIl(System.currentTimeMillis())) break block0;
                    playerEntity = this.lll(minecraftClient);
                    if (playerEntity != null) break block1;
                    break block2;
                }
                return;
            }
            this.IIll = -1;
            playerEntity = this.lllIl(minecraftClient, (Double)this.IIIII.lIl());
        }
        if (playerEntity == null) return;
        this.IllI((Entity)playerEntity, System.currentTimeMillis());
        this.lIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIII() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        Backtrack backtrack = clientEntrypoint == null || clientEntrypoint.IlI() == null ? null : clientEntrypoint.IlI().IlII();
        if (backtrack == null) return;
        backtrack.IllI();
    }

    private boolean IIIIIl(long l2) {
        return PlayerFreeze.IIlII(l2, this.lIIII, (Boolean)this.lIII.lIl());
    }

    /*
     * Enabled aggressive block sorting
     */
    private Box IIIIlI() {
        Entity entity = this.lIll;
        Vec3d vec3d = this.llIl;
        if (entity == null) return null;
        if (vec3d != null) {
            long l2 = System.nanoTime();
            long l3 = this.IIII;
            this.IIII = l2;
            double d = l3 == 0L ? 0.016666666666666666 : Math.max(0.0, (double)(l2 - l3) / 1.0E9);
            double d2 = IIllIIlII.I(0.32, d);
            this.IlIll = PlayerFreeze.lIIll(this.IlIll, vec3d, d2);
            return entity.getDimensions(entity.getPose()).getBoxAt(this.IlIll);
        }
        return null;
    }

    private static int IIIIll(int n, int n2) {
        return lIIIl[n ^ 0xCDC0E637] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 1814;
        String string = "\u2c19\u2ce7\u2c7b\u2c7d\u2c65\u2c24\u2ccd\u2c63\u2cc7\u2cbd\u2c2b\u2cce\u2c70\u2c00\u2c9e\u2c0b\uf116\uf1fc\uf152\uf161\uf16b\uf12c\uf1cd\uf176\uf1ff\uf193\uf141\uf1d2\uf177\uf118\uf199\uf13b\uf164\uf1ec\uf15d\uf1cc\uf176\uf1e5\uf133\uf115\uf152\uf1b4\uf13e\uf1b3\uf18d\uf1c0\uf1d1\uf11d\uf10d\uf1d1\uf17d\uf174\uf15e\uf12f\uf1c7\uf17a\uf1d2\uf1a1\uf13d\uf1f4\uf151\uf163\uf184\uf12a\uf164\uf1ce\uf169\uf1fd\uf100\uf1be\uf10c\uf105\uf16a\uf185\uf100\uf19a\uf1ed\uf1e1\uf1c8\uf11c\uf10d\uf1e8\uf14a\uf161\uf16a\uf12f\uf1ec\uf17d\uf1ed\uf193\uf124\uf1cc\uf17b\uf11c\uf1fa\uf12d\uf165\uf19f\uf16f\uf1fb\uf176\uf1fa\uf16c\uf115\uf155\uf1b4\uf153\uf182\uf18a\uf1f9\uf1e7\uf11d\uf104\uf1d1\uf15b\uf141\uf150\uf138\uf1fb\uf113\u6062\u6089\u6019\u6004\u601e\u6059\u60f6\u6066\u46e7\u460d\u468d\u4690\u469b\u46dd\u4676\u4688\u460b\u4662\u46b0\u463e\u468c\u46c4\u460f\u46af\u4827\u48ce\u487b\u4854\u485d\u4824\u48d5\u4848\u48cc\u4898\u4873\u48ff\u4841\u4813\u48c7\u480a\u4855\u48d9\u4865\u48a6\u0ddd\u0d12\u0df6\u0dce\u700b\u70cf\u7057\u7058\u7072\u701c\u70d0\u706f\u70d2\u70b0\u705c\u70dc\u7065\u707e\u708b\u7047\u428f\u4264\u42d6\u42f5\u42ad\u42a6\u4252\u42e1\u4268\u4221\u42fb\u425d\u5111\u51de\u513a\u5102\u0c11\u0cfc\u0c68\u0c73\u0c6c\u0c15\u0cc6\u0c7d\u0cfb\u0cb9\u0c78\u0cce\u0c75\u0c67\u0c86\u0c39\u0c6c\u0c9f\u0c41\u0cfe\u0c2b\u0cbf\u0c71\u0c1e\u99c3\u993a\u9988\u99af\u99be\u99fa\u9929\u99c5\u6f78\u6f88\u6f0c\u6f6a\u75d3\u7556\u75a9\u7587\u75a8\u75fa\u754a\u75b2\u753f\u756c\u759a\u756e\ua2cf\ua24a\ua2b5\ua29b\ua2b4\ua2e6\ua256\ua2ae\ua223\ua270\ua283\ua217\ua2a4\ua2d2\ua26d\ua287\u3a78\u3a88\u3a0c\u3a6a\uc1db\uc159\uc184\uc1ab\uc1a1\uc1e6\uc107\uc1bc\uc101\uc163\uc18f\uc10f\uc1b6\uc1ad\uc158\uc194\u7b93\u7b7f\u7beb\u7bf2\u7be9\u7bac\u7b4d\u7bfa\u7b79\u7b10\u7bda\u7b53\uf9b8\uf954\uf9c0\uf9d9\uf9c2\uf987\uf966\uf9d1\uf952\uf93b\uf9f1\uf978\uf9c4\uf9b1\uf913\uf99a\uf9c9\uf96a\uf9fc\uf93f\ue362\ue387\ue307\ue375\u1f50\u1fbc\u1f28\u1f31\u1f2a\u1f6f\u1f8e\u1f39\u1fba\u1fd3\u1f19\u1f90\u1f2c\u1f5e\u1fc1\u1f69\u1f23\u1f92\u1f09\u1fb2\u1f6c\u1fa5\u1f5f\u1f31";
        char[] cArray = "\u0706\u077e\u071e\u0706\u0702\u0712\u0706\u071a\u0712\u070e\u071e\u0712\u071a\u0706\u0712\u0706\u071a\u0702\u0712\u070e".toCharArray();
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
        lIIlI = stringArray;
        lIIll = new Object[stringArray.length];
        int n6 = 1709001616;
        byte[] byArray = "\u00a2<\u009b*\u008c\u00bb0O\u00b0\u00b0-m(\n\u00d1\u00ea\u0019\u00b1\u00fd%\u00bbJ\u00dd\u009f\u0095\u009a\u00f4\u0084".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        lIIIl = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            PlayerFreeze.lIIIl[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String IIIlII(int var0, int var1_1) {
        var3_2 = var0 ^ 558394323;
        var4_4 = PlayerFreeze.lIIlI[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])PlayerFreeze.lIIll[var3_2];
        if (var2_3 == null) {
            var5_5 = new Throwable().getStackTrace();
            PlayerFreeze.lIIll[var3_2] = var5_5;
        } else {
            var5_5 = var2_3;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -436521416;
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
                    var9_9 = 105;
                    break;
                }
                case 14: {
                    var9_9 = 3;
                    break;
                }
                case 8: {
                    var9_9 = 104;
                    break;
                }
                default: {
                    var9_9 = 163;
                    break;
                }
                case 24: {
                    var9_9 = 196;
                    break;
                }
                case 25: {
                    var9_9 = 45;
                    break;
                }
                case 26: {
                    var9_9 = 171;
                    break;
                }
                case 12: {
                    var9_9 = 255;
                    break;
                }
                case 15: {
                    var9_9 = 163;
                    break;
                }
                case 21: {
                    var9_9 = 74;
                    break;
                }
                case 20: {
                    var9_9 = 133;
                    break;
                }
                case 2: {
                    var9_9 = 216;
                    break;
                }
                case 17: {
                    var9_9 = 102;
                    break;
                }
                case 13: {
                    var9_9 = 146;
                    break;
                }
                case 10: {
                    var9_9 = 214;
                    break;
                }
                case 29: {
                    var9_9 = 82;
                    break;
                }
                case 16: {
                    var9_9 = 231;
                    break;
                }
                case 7: {
                    var9_9 = 238;
                    break;
                }
                case 27: {
                    var9_9 = 16;
                    break;
                }
                case 4: {
                    var9_9 = 198;
                    break;
                }
                case 18: {
                    var9_9 = 205;
                    break;
                }
                case 23: {
                    var9_9 = 140;
                    break;
                }
                case 19: {
                    var9_9 = 106;
                    break;
                }
                case 3: {
                    var9_9 = 224;
                    break;
                }
                case 1: {
                    var9_9 = 102;
                    break;
                }
                case 22: {
                    var9_9 = 154;
                    break;
                }
                case 31: {
                    var9_9 = 190;
                    break;
                }
                case 9: {
                    var9_9 = 17;
                    break;
                }
                case 28: {
                    var9_9 = 31;
                    break;
                }
                case 5: {
                    var9_9 = 189;
                    break;
                }
                case 11: {
                    var9_9 = 86;
                    break;
                }
                case 6: {
                    var9_9 = 126;
                }
            }
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
        }
    }
}

