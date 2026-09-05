/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIlIll
 * Module         : Backtrack  [COMBAT]
 * Description    : Delays an attacked player's movement packets so their recent position remains hittable.   (client's own text)
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.network.packet.BundlePacket
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.common.CommonPingS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityPositionSyncS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket
 *  net.minecraft.network.packet.s2c.play.ExplosionS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.combat;

import java.awt.Color;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicBoolean;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.BundlePacket;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.common.CommonPingS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityPositionSyncS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ExplosionS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIllIIlII;
import orchard.internal.IIllIllI;
import orchard.internal.IIllllllI;
import orchard.internal.IlIIIIll;
import orchard.internal.IllIlI;
import orchard.internal.lIIIlIl;
import orchard.internal.lIIllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIIIII;
import orchard.internal.llIIlIII;
import orchard.internal.llIll;
import orchard.mixin.EntityS2CPacketMixin2;
import orchard.module.combat.PlayerFreeze;

@Environment(value=EnvType.CLIENT)
public final class Backtrack
extends ModuleBase
implements llIIlIII {
    private final lIlIIlI I;
    private static final long l = 500L;
    private volatile PlayerEntity II;
    private final AtomicBoolean Il;
    private final lIlIIlI lI;
    private static final double ll = 0.0025;
    private volatile double III;
    private final llIll IIl;
    private final lIlIIlI IlI;
    private static final float Ill = 2.4f;
    private volatile int lII;
    private volatile Packet<?> lIl;
    private volatile boolean llI;
    private volatile long lll;
    private volatile int IIII;
    private static final double IIIl = 0.32;
    private volatile long IIlI;
    private final lIlIIlI IIll;
    private final AtomicBoolean IlII;
    private final lIlIIlI IlIl;
    private volatile Vec3d IllI;
    private static final long Illl = 150L;
    private final llIll lIII;
    private static final double lIIl = 0.18;
    private volatile boolean lIlI;
    private static final double lIll = 0.15;
    private volatile long llII;
    private long llIl;
    private static final long lllI = 25L;
    private volatile Vec3d llll;
    private Vec3d IIIII;
    private static final String[] IIIIl;
    private static final Object[] IIIlI;

    /*
     * Enabled aggressive block sorting
     */
    private boolean I(Packet<?> packet) {
        if (packet instanceof BundlePacket) {
            Packet packet2;
            BundlePacket bundlePacket = (BundlePacket)packet;
            Iterator iterator = bundlePacket.getPackets().iterator();
            do {
                if (!iterator.hasNext()) return false;
            } while (!this.I(packet2 = (Packet)iterator.next()));
            return true;
        }
        if (Backtrack.IlIII(packet)) return true;
        if (Backtrack.lIlI(packet, this.IIII)) return true;
        if (PlayerFreeze.IIllI(packet, (Entity)this.II)) return true;
        if (IIllIllI.lIIl(packet.getClass().getName())) return true;
        if ((Boolean)this.lIII.lIl() == false) return false;
        if (!(packet instanceof EntityDamageS2CPacket)) return false;
        EntityDamageS2CPacket entityDamageS2CPacket = (EntityDamageS2CPacket)packet;
        if (entityDamageS2CPacket.entityId() != this.IIII) return false;
        return true;
    }

    @Override
    public String II() {
        String string = "ms";
        long l2 = Math.round((Double)this.IIll.lIl());
        return l2 + string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean l() {
        if (!this.lIlI) return false;
        if (!this.llI) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double lI(Vec3d vec3d, Box box) {
        double d = Math.max(box.minX, Math.min(vec3d.x, box.maxX));
        double d2 = Math.max(box.minY, Math.min(vec3d.y, box.maxY));
        double d3 = Math.max(box.minZ, Math.min(vec3d.z, box.maxZ));
        return vec3d.squaredDistanceTo(d, d2, d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        block7: {
            MinecraftClient minecraftClient = MinecraftClient.getInstance();
            if (!this.IIIll(minecraftClient)) {
                this.IllI();
                return;
            }
            this.llll = minecraftClient.player.getEyePos();
            this.III = Backtrack.lllI(minecraftClient.player.getEntityInteractionRange(), (Double)this.I.lIl());
            this.IIII = minecraftClient.player.getId();
            if (!this.llI) {
                return;
            }
            IIllIllI iIllIllI = IIllIllI.IIIII();
            if (iIllIllI.lII() && iIllIllI.I() && iIllIllI.IIll() && iIllIllI.IIlII()) {
                PlayerEntity playerEntity;
                Entity entity = minecraftClient.world.getEntityById(this.lII);
                if (entity instanceof PlayerEntity && this.llI(minecraftClient, (Entity)(playerEntity = (PlayerEntity)entity)) && !this.IIIIl(minecraftClient, playerEntity) && System.currentTimeMillis() - this.IIlI <= this.llIl()) {
                    this.II = playerEntity;
                    if (!this.Il.getAndSet(false)) {
                        if (this.IlII.getAndSet(false)) {
                            this.IIl();
                        }
                        if (!this.lIlI) return;
                        lIIIlIl.IIIllI(this.llII);
                        if (Backtrack.IIII(System.currentTimeMillis(), this.lll, this.llII)) return;
                        this.IIl();
                        return;
                    }
                    break block7;
                } else {
                    this.IllI();
                    return;
                }
            }
            this.IIlIl();
            return;
        }
        this.IllI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl() {
        IIllIllI iIllIllI = IIllIllI.IIIII();
        lIIIlIl.IIllIII();
        iIllIllI.IlIIl(true);
        iIllIllI.lIII();
        lIIIlIl.IIIIlll();
        lIIIlIl.IlIlI();
        this.lIlI = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(Vec3d vec3d) {
        PlayerEntity playerEntity = this.II;
        if (vec3d == null) return false;
        if (playerEntity == null) return false;
        if (PlayerFreeze.lIllI(this.llll, playerEntity.getDimensions(playerEntity.getPose()).getBoxAt(vec3d), this.III)) return true;
        return false;
    }

    @Override
    public void ll() {
        this.IIlIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Ill(II iI) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if ((Boolean)this.IIl.lIl() == false) return;
        if (iI == null) return;
        if (this.IIlll(minecraftClient)) {
            Box box = this.IIlII();
            if (box == null) return;
            Color color = IlIIIIll.III();
            double d = Math.max(0.0, Math.min(255.0, (Double)this.IlIl.lIl()));
            IllIlI.IIIlll(iI, box, color, d * 0.18);
            IllIlI.IlIl(iI, box, color, d, 2.4f);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIl(Packet<?> packet) {
        if (packet instanceof EntityPositionSyncS2CPacket) {
            EntityPositionSyncS2CPacket entityPositionSyncS2CPacket = (EntityPositionSyncS2CPacket)packet;
            if (entityPositionSyncS2CPacket.id() == this.lII) return true;
            return false;
        }
        if (packet instanceof EntityPositionS2CPacket) {
            EntityPositionS2CPacket entityPositionS2CPacket = (EntityPositionS2CPacket)packet;
            if (entityPositionS2CPacket.entityId() == this.lII) return true;
            return false;
        }
        if (!(packet instanceof EntityS2CPacket)) return false;
        EntityS2CPacket entityS2CPacket = (EntityS2CPacket)packet;
        if (((EntityS2CPacketMixin2)entityS2CPacket).ilovcats$getId() != this.lII) return false;
        return true;
    }

    @Override
    public void llll() {
        this.IllI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llI(MinecraftClient minecraftClient, Entity entity) {
        if (!this.IIIll(minecraftClient)) return false;
        if (!(entity instanceof PlayerEntity)) return false;
        PlayerEntity playerEntity = (PlayerEntity)entity;
        if (entity == minecraftClient.player) return false;
        if (!entity.isAlive()) return false;
        if (entity.isRemoved()) return false;
        if (playerEntity.isSpectator()) return false;
        if (playerEntity.isGliding()) return false;
        if (IIllllllI.l(playerEntity)) {
            return false;
        }
        if (!PlayerFreeze.lIllI(minecraftClient.player.getEyePos(), entity.getBoundingBox(), (Double)this.I.lIl())) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private long lll() {
        long l2 = Math.round((Double)this.IIll.lIl());
        long l3 = Math.max(0L, Math.round((Double)this.IlI.lIl()));
        long l4 = l3 != 0L ? ThreadLocalRandom.current().nextLong(-l3, l3 + 1L) : 0L;
        return Backtrack.llII(l2, l4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean IIII(long l2, long l3, long l4) {
        if (l3 <= 0L) return false;
        if (l2 - l3 > Math.max(0L, l4) + 150L) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlI(MinecraftClient minecraftClient, PlayerEntity playerEntity, long l2) {
        IIllIllI iIllIllI = IIllIllI.IIIII();
        if (iIllIllI.I()) {
            return;
        }
        this.II = playerEntity;
        this.lII = playerEntity.getId();
        this.IIII = minecraftClient.player.getId();
        this.llll = minecraftClient.player.getEyePos();
        this.III = Backtrack.lllI(minecraftClient.player.getEntityInteractionRange(), (Double)this.I.lIl());
        this.IllI = this.lIII((Entity)playerEntity);
        this.IIIII = this.IllI;
        this.IIlI = l2;
        this.llII = this.lll();
        this.llI = true;
        iIllIllI.III(false, true);
        iIllIllI.IlIIl(true);
        iIllIllI.lIlI(true, llIIIII.II, 0);
        lIIIlIl.IIlIIIl(this::IlIll, packet -> {}, this::lIll);
        iIllIllI.IlIlI(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIllI IlII(Packet<?> packet, Vec3d vec3d) {
        lIIllI lIIllI2;
        if (packet instanceof BundlePacket) {
            BundlePacket bundlePacket = (BundlePacket)packet;
            Vec3d vec3d2 = vec3d;
            boolean bl = false;
            Iterator iterator = bundlePacket.getPackets().iterator();
            while (iterator.hasNext()) {
                Packet packet2 = (Packet)iterator.next();
                lIIllI lIIllI3 = this.IlII(packet2, vec3d2);
                vec3d2 = lIIllI3.l();
                bl |= lIIllI3.I();
            }
            return new lIIllI(vec3d2, bl);
        }
        Vec3d vec3d3 = this.IIllI(packet, vec3d);
        if (vec3d3 == null) {
            return new lIIllI(vec3d, false);
        }
        lIIllI2(vec3d3, this.IlI(vec3d3) || this.lIlI && !this.Illl(vec3d, vec3d3));
        return lIIllI2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IllI() {
        if (!this.llI) {
            this.IIlIl();
            return;
        }
        lIIIlIl.IIllIII();
        lIIIlIl.IlIllI();
        IIllIllI iIllIllI = IIllIllI.IIIII();
        iIllIllI.IlIlI(false);
        iIllIllI.lIII();
        lIIIlIl.IIIIlll();
        lIIIlIl.IlIlI();
        iIllIllI.llIl(false);
        this.IIlIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illl(Vec3d vec3d, Vec3d vec3d2) {
        if (vec3d == null) return false;
        if (vec3d2 == null) {
            return false;
        }
        Vec3d vec3d3 = this.llll;
        if (vec3d3 == null) {
            return false;
        }
        PlayerEntity playerEntity = this.II;
        if (playerEntity != null) return Backtrack.IlIlI(vec3d3, playerEntity.getDimensions(playerEntity.getPose()).getBoxAt(vec3d), playerEntity.getDimensions(playerEntity.getPose()).getBoxAt(vec3d2));
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d lIII(Entity entity) {
        Vec3d vec3d;
        Vec3d vec3d2 = entity.getTrackedPosition().getPos();
        if (vec3d2 == null) {
            vec3d = entity.getEntityPos();
            return vec3d;
        }
        vec3d = vec3d2;
        return vec3d;
    }

    private void lIIl() {
        this.IlII.set(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean lIlI(Packet<?> packet, int n) {
        if (packet == null) {
            return false;
        }
        if (!(packet instanceof BundlePacket)) {
            if (packet instanceof PlayerPositionLookS2CPacket) {
                return true;
            }
        } else {
            Packet packet2;
            BundlePacket bundlePacket = (BundlePacket)packet;
            Iterator iterator = bundlePacket.getPackets().iterator();
            do {
                if (!iterator.hasNext()) return false;
            } while (!Backtrack.lIlI(packet2 = (Packet)iterator.next(), n));
            return true;
        }
        if (!(packet instanceof EntityVelocityUpdateS2CPacket)) {
            if (!(packet instanceof ExplosionS2CPacket)) return false;
            ExplosionS2CPacket explosionS2CPacket = (ExplosionS2CPacket)packet;
            if (explosionS2CPacket.playerKnockback().filter(vec3d -> vec3d.lengthSquared() > 1.0E-8).isPresent()) return true;
            return false;
        }
        EntityVelocityUpdateS2CPacket entityVelocityUpdateS2CPacket = (EntityVelocityUpdateS2CPacket)packet;
        if (n < 0) return false;
        if (entityVelocityUpdateS2CPacket.getEntityId() != n) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private synchronized boolean lIll(Packet<?> packet) {
        if (!this.llI) return false;
        if (packet == null) {
            return false;
        }
        lIIllI lIIllI2 = this.IlII(packet, this.IllI);
        boolean bl = this.I(packet);
        if (!bl && !lIIllI2.I()) {
            return false;
        }
        this.IllI = lIIllI2.l();
        this.lIl = packet;
        this.lIlI = false;
        this.IlII.set(false);
        if (!bl) return true;
        if (!this.IlIIl(packet)) return true;
        this.Il.set(true);
        return true;
    }

    static long llII(long l2, long l3) {
        return Math.max(25L, Math.min(500L, l2 + l3));
    }

    private long llIl() {
        return Math.max(250L, Math.min(3000L, Math.round((Double)this.lI.lIl())));
    }

    static double lllI(double d, double d2) {
        double d3 = Math.max(0.0, d - 0.15);
        return Math.min(Math.max(0.0, d2), d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIl(MinecraftClient minecraftClient, PlayerEntity playerEntity) {
        Vec3d vec3d = this.IllI;
        if (vec3d == null) return false;
        if (!PlayerFreeze.lIllI(minecraftClient.player.getEyePos(), playerEntity.getDimensions(playerEntity.getPose()).getBoxAt(vec3d), this.III)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean IIIlI(Entity entity) {
        if (entity == null) return false;
        if (entity.getId() != this.lII) return false;
        if (!this.l()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIll(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.getNetworkHandler() == null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Box IIlII() {
        long l2;
        PlayerEntity playerEntity = this.II;
        Vec3d vec3d = this.IllI;
        if (playerEntity == null) return null;
        if (vec3d != null) {
            l2 = System.nanoTime();
        } else {
            return null;
        }
        double d = this.llIl != 0L ? Math.max(0.0, (double)(l2 - this.llIl) / 1.0E9) : 0.016666666666666666;
        this.llIl = l2;
        double d2 = IIllIIlII.I(0.32, d);
        this.IIIII = PlayerFreeze.lIIll(this.IIIII, vec3d, d2);
        return playerEntity.getDimensions(playerEntity.getPose()).getBoxAt(this.IIIII);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIl() {
        this.llI = false;
        this.II = null;
        this.lII = -1;
        this.IIII = -1;
        this.lIl = null;
        this.llll = null;
        this.IllI = null;
        this.IIIII = null;
        this.lIlI = false;
        this.llII = 0L;
        this.IIlI = 0L;
        this.lll = 0L;
        this.III = 3.0;
        this.llIl = 0L;
        this.IlII.set(false);
        this.Il.set(false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IIllI(Packet<?> packet, Vec3d vec3d) {
        EntityPositionSyncS2CPacket entityPositionSyncS2CPacket;
        if (packet instanceof EntityPositionSyncS2CPacket && (entityPositionSyncS2CPacket = (EntityPositionSyncS2CPacket)packet).id() == this.lII && entityPositionSyncS2CPacket.values() != null) {
            return entityPositionSyncS2CPacket.values().position();
        }
        if (packet instanceof EntityPositionS2CPacket && (entityPositionSyncS2CPacket = (EntityPositionS2CPacket)packet).entityId() == this.lII && entityPositionSyncS2CPacket.change() != null) {
            return PlayerFreeze.IIlIl(vec3d, entityPositionSyncS2CPacket.change().position(), entityPositionSyncS2CPacket.relatives());
        }
        if (!(packet instanceof EntityS2CPacket)) return null;
        entityPositionSyncS2CPacket = (EntityS2CPacket)packet;
        if (((EntityS2CPacketMixin2)entityPositionSyncS2CPacket).ilovcats$getId() != this.lII) return null;
        if ((long)entityPositionSyncS2CPacket.getDeltaX() != 0L) return PlayerFreeze.IIIIl(vec3d, entityPositionSyncS2CPacket.getDeltaX(), entityPositionSyncS2CPacket.getDeltaY(), entityPositionSyncS2CPacket.getDeltaZ());
        if ((long)entityPositionSyncS2CPacket.getDeltaY() != 0L) return PlayerFreeze.IIIIl(vec3d, entityPositionSyncS2CPacket.getDeltaX(), entityPositionSyncS2CPacket.getDeltaY(), entityPositionSyncS2CPacket.getDeltaZ());
        if ((long)entityPositionSyncS2CPacket.getDeltaZ() == 0L) return null;
        return PlayerFreeze.IIIIl(vec3d, entityPositionSyncS2CPacket.getDeltaX(), entityPositionSyncS2CPacket.getDeltaY(), entityPositionSyncS2CPacket.getDeltaZ());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IlIIlI(Entity entity) {
        long l2;
        PlayerEntity playerEntity;
        MinecraftClient minecraftClient;
        block2: {
            block3: {
                block1: {
                    minecraftClient = MinecraftClient.getInstance();
                    if (!this.llI(minecraftClient, entity)) break block1;
                    playerEntity = (PlayerEntity)entity;
                    l2 = System.currentTimeMillis();
                    if (playerEntity.getId() != this.lII) break block2;
                    break block3;
                }
                return;
            }
            if (this.llI) {
                this.II = playerEntity;
                this.IIlI = l2;
                return;
            }
        }
        this.IllI();
        this.IIlI(minecraftClient, playerEntity, l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Backtrack() {
        super(StringFactory.IIII("upVXlw1FUR+c"), Category.II, StringFactory.IIII("vJFYnQBEEB2ZSJ5NG9LdlZ2QFIwVVkkZhU+MGQLcyJuVkVqIWUdRH5wNi0pPwNHejJxRlQsXQhmUDZFNT8PRjZGAXZMXF0IZmgmWVxyT1peMgFWeFVIe"));
        llIll llIll2;
        lIlIIlI lIlIIlI2;
        lIlIIlI2(StringFactory.IIII("qJ1am1l2XROCBos="), 150.0, 25.0, 500.0, 5.0);
        this.IIll = this.IIlllIl(lIlIIlI2.IIII(StringFactory.IIII("lYc=")));
        this.IlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("sp1AiBxF"), 20.0, 0.0, 100.0, 5.0).IIII(StringFactory.IIII("lYc=")));
        this.I = this.IIlllIl(new lIlIIlI(StringFactory.IIII("tZVM3CtWXhuS"), 6.0, 3.0, 8.0, 0.1).IIII(StringFactory.IIII("mphbnxJE")));
        this.lI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("rJVGmxxDECieBZpWGsc="), 1250.0, 250.0, 3000.0, 50.0).IIII(StringFactory.IIII("lYc=")));
        this.lIII = this.IIlllIl(new llIll((Object)StringFactory.IIII("qpFYmRhEVVy4Bt99Dt7fmZ0="), true));
        llIll2((Object)StringFactory.IIII("sZpQlRpWRBOF"), true);
        this.IIl = this.IIlllIl(llIll2);
        this.IlIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("sZpQlRpWRBOFSLBJDtDXioE="), 215.0, 80.0, 255.0, 5.0));
        this.IlII = new AtomicBoolean();
        this.Il = new AtomicBoolean();
        this.lII = -1;
        this.IIII = -1;
        this.III = 3.0;
        this.IlIl.lIII(this.IIl::lIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlll(MinecraftClient minecraftClient) {
        if (!this.IIIll(minecraftClient)) return false;
        if (!this.l()) return false;
        if (this.II == null) return false;
        if (!this.II.isAlive()) return false;
        if (System.currentTimeMillis() - this.lll > this.llII + 150L) return false;
        return true;
    }

    static boolean IlIII(Packet<?> packet) {
        return packet instanceof CommonPingS2CPacket;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIIl(Packet<?> packet) {
        if (packet instanceof BundlePacket) {
            Packet packet2;
            BundlePacket bundlePacket = (BundlePacket)packet;
            Iterator iterator = bundlePacket.getPackets().iterator();
            do {
                if (!iterator.hasNext()) return false;
            } while (!this.IlIIl(packet2 = (Packet)iterator.next()));
            return true;
        }
        if (packet instanceof PlayerPositionLookS2CPacket) return true;
        if (PlayerFreeze.IIllI(packet, (Entity)this.II)) return true;
        if (IIllIllI.lIIl(packet.getClass().getName())) {
            return true;
        }
        if ((Boolean)this.lIII.lIl() == false) return false;
        if (Backtrack.lIlI(packet, this.IIII)) return true;
        if (!(packet instanceof EntityDamageS2CPacket)) return false;
        EntityDamageS2CPacket entityDamageS2CPacket = (EntityDamageS2CPacket)packet;
        if (entityDamageS2CPacket.entityId() != this.IIII) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean IlIlI(Vec3d vec3d, Box box, Box box2) {
        if (vec3d == null) return false;
        if (box == null) return false;
        if (box2 == null) {
            return false;
        }
        if (!(Backtrack.lI(vec3d, box2) > Backtrack.lI(vec3d, box) + 0.0025)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private synchronized boolean IlIll(Packet<?> packet) {
        Vec3d vec3d;
        Vec3d vec3d2;
        if (!this.llI) return false;
        if (this.lII < 0) return false;
        if (packet == null) {
            return false;
        }
        if (packet == this.lIl) {
            this.lIl = null;
            return false;
        }
        if (packet instanceof BundlePacket) {
            BundlePacket bundlePacket = (BundlePacket)packet;
            boolean bl = false;
            Iterator iterator = bundlePacket.getPackets().iterator();
            while (iterator.hasNext()) {
                Packet packet2 = (Packet)iterator.next();
                bl |= this.IlIll(packet2);
            }
            return bl;
        }
        if (PlayerFreeze.IIllI(packet, (Entity)this.II) || IIllIllI.lIIl(packet.getClass().getName())) {
            this.Il.set(true);
            return true;
        }
        if (!((Boolean)this.lIII.lIl()).booleanValue() || !PlayerFreeze.IIIll(packet, this.IIII, this.lII, this.IIlI)) {
            vec3d2 = this.IllI;
            vec3d = this.IIllI(packet, vec3d2);
            if (vec3d == null) {
                if (!this.lIlI) return false;
                if (!this.lIl(packet)) return false;
                this.lll = System.currentTimeMillis();
                return true;
            }
        } else {
            this.Il.set(true);
            return true;
        }
        this.IllI = vec3d;
        long l2 = System.currentTimeMillis();
        if (!this.Illl(vec3d2, vec3d)) {
            if (!this.lIlI) return false;
            this.lIIl();
            return true;
        }
        if (!this.lIlI) {
            this.llII = this.lll();
        }
        this.lIlI = true;
        this.lll = l2;
        return true;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 14837;
        var1_1 = "\u220a\u22f4\u2224\u2207\ue71d\ue73b\ue7bb\ue724\ue7b6\ue727\ue87c\ue7cb\ue7af\ue744\ue71b\ue706\u896e\u882f\u8819\u895d\u886a\u8967\u8947\u8974\u8961\u891e\u88c2\u897f\u895a\u8808\u88af\u8966\u882c\u8828\u8972\u8854\u8800\u897f\u88c5\u8975\u8872\u881f\u895c\u8949\u895c\u8859\u8835\u897f\u8833\u8971\u8899\u881b\u882c\u8960\u8972\u8861\u896f\u882f\u8804\u895c\u8859\u894e\u8832\u8818\u895b\u890f\u8838\u8957\u8813\u88d1\u8905\u8966\u880a\u88bb\u88ee\u8930\u8969\u8953\u8813\u8801\u8856\u881a\u8951\u8965\u8812\u890b\u88fd\u8971\u8960\u8826\u8857\u8963\u882d\u894d\u880c\u890a\u8948\u8811\u895b\u8970\u8856\u894a\u882c\u8970\u8956\u8926\u881b\u8971\u8819\u88ae\u8873\u894a\u880e\u883e\u8829\u8925\u894e\u8951\u8968\u895a\u88ab\u88fc\u8826\u881c\u882b\u8872\u8949\u8826\u8819\u895c\u8873\u8813\u9a41\u9bbd\u9b86\u9ba3\u9a51\u9b81\u9a77\u9b87\u9a4c\u9bcc\u9ba7\u9bbe\u9b97\u9a55\u9a17\u9b8d\u0138\u3e52\u0132\u01d1\uf5b2\uf582\uf4eb\uf42e\uf5e8\uf43d\uf46a\uf5ae\u4137\u411d\u4121\u7e4e\uf0aa\uf0bd\uf083\uf0bf\uf387\uf35b\uf09f\uf088\uf09c\uf312\uf0a5\uf0be\u438d\u42c3\u43b9\u4392\u43e0\u42ee\u43ad\u4392\ubcec\ubcd1\ubdbf\ubd91\ubcbd\ubd9a\ubdaf\ubce9\ubcfb\ubdeb\ubcc5\ubcfc\ubc7b\ubda6\ubc9e\ubd93\ubdb6\ubcf0\ubcf5\ubdcd\ubfe7\ubc8d\ubfd1\ubcbe\u224e\u227c\u2910\u2664\u2976\u2903\u2654\u2915\u2915\u296b\u2256\u2928\u2914\u264f\u297a\u2916\u2938\u265a\u290e\u261b\u291a\u265e\u290e\u2918\uca2d\ucacf\uca2b\ucac5\uca7c\ucad2\uca19\ucafe\ucac0\ucaae\uca31\uca1b\ucba7\ucb91\ucba5\uca2f\ucbca\uca3c\ucb97\uca44\uca2e\uca20\uca7b\uca4d\uca40\uca54\uca20\uca74\uca4b\ucb89\uca6c\ucbc6\uca55\uca6e\uca7e\ucac3";
        var2_2 = "\u39f1\u39f9\u3981\u39e5\u39f1\u39fd\u39f1\u39f9\u39fd\u39e1\u39f1\u39ed\u39f9\u39ed".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        if (true) ** GOTO lbl13
        while (true) {
            block12: {
                block13: {
                    if (var9_9 < var8_8.length) break block12;
                    var3_3[var4_4] = new String(var8_8).intern();
                    var5_5 += var6_6;
                    if (++var4_4 < var2_2.length) break block13;
                    var7_7 = 0;
lbl13:
                    // 2 sources

                    var4_4 = 0;
                    var5_5 = 0;
                    var6_6 = 0;
                    if (var7_7 != 0) {
                    } else {
                        Backtrack.IIIIl = var3_3;
                        Backtrack.IIIlI = new Object[var3_3.length];
                        return;
                    }
                }
                var6_6 = var2_2[var4_4] ^ var0;
                var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                var9_9 = 0;
            }
            switch (var9_9 % 5) {
                case 3: {
                    v0 = 102;
                    break;
                }
                case 2: {
                    v0 = 115;
                    break;
                }
                case 1: {
                    v0 = 65;
                    break;
                }
                default: {
                    v0 = 116;
                    break;
                }
                case 4: {
                    v0 = 24;
                }
            }
            var10_10 = v0;
            v1 = var9_9++;
            var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IllII(int n, int n2, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = c ^ 0xBA24;
        char[] cArray = IIIIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIIlI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Backtrack.IIIlI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3B13;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0x2108;
            n7 += 63038;
            n7 ^= 0x6A6D;
            n7 ^= 0x36CC;
            n7 -= 25400;
            n7 += 14264;
            n7 += 22936;
            n7 ^= 0xA1EB;
            cArray[n6] = (char)((n7 += 55029) ^ n4 ^ n ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

