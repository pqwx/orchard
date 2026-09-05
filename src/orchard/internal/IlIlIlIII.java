/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIlIII
 * Purpose not identified - name is the original obfuscated one.
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
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import orchard.internal.IIlIllll;
import orchard.internal.IIllllllI;

@Environment(value=EnvType.CLIENT)
public final class IlIlIlIII {
    private boolean I;
    private static final double l = 0.25;
    private long II;
    private double Il;
    private final IIlIllll lI;
    private double ll;
    private double III;
    private static final double IIl = 0.125;
    private final IIlIllll IlI = new IIlIllll();
    private LivingEntity Ill;
    private long lII;
    private double lIl;
    private double llI;
    private LivingEntity lll;

    public double I() {
        return this.IIII() + this.llIl() * 1.35;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean l(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (livingEntity == null) return true;
        if (!livingEntity.isAlive()) return true;
        if (livingEntity.isRemoved()) return true;
        if (IIllllllI.II(livingEntity)) return true;
        if (minecraftClient.player.distanceTo((Entity)livingEntity) > 16.0f) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void II() {
        this.Ill();
        this.lll = null;
        this.II = 0L;
        this.IlI.lI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private int Il(MinecraftClient minecraftClient, Entity entity) {
        if (!(entity instanceof PlayerEntity)) return 0;
        PlayerEntity playerEntity = (PlayerEntity)entity;
        if (minecraftClient.getNetworkHandler() == null) {
            return 0;
        }
        PlayerListEntry playerListEntry = minecraftClient.getNetworkHandler().getPlayerListEntry(playerEntity.getUuid());
        if (playerListEntry == null) return 0;
        int n = playerListEntry.getLatency();
        return n;
    }

    public double lI() {
        return this.III;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int ll(MinecraftClient minecraftClient) {
        int n;
        int n2 = this.IlI.Il();
        if (n2 <= 0) {
            n = this.Il(minecraftClient, (Entity)minecraftClient.player);
            return n;
        }
        n = n2;
        return n;
    }

    public double III(double d) {
        return this.IlI.II(d);
    }

    public double IIl() {
        return this.lIl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IlI(double d, double d2) {
        double d3 = Math.max(0.0, d2);
        if (!(d >= 0.0)) return false;
        if (!(d <= d3 * d3)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void Ill() {
        this.Ill = null;
        this.lII = 0L;
        this.ll = 0.0;
        this.III = 0.0;
        this.lIl = 0.0;
        this.I = false;
        this.lI.lI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lII(LivingEntity livingEntity) {
        if (livingEntity == null) return true;
        if (!livingEntity.isAlive()) return true;
        if (livingEntity.isRemoved()) return true;
        if (IIllllllI.II(livingEntity)) return true;
        return false;
    }

    public LivingEntity lIl() {
        return this.Ill;
    }

    public double llI() {
        return this.ll;
    }

    public long lll() {
        return this.II;
    }

    public double IIII() {
        return this.lI.l();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIIl(MinecraftClient minecraftClient, double d) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (this.Ill == null) return false;
        if (!this.Ill.isAlive()) return false;
        if (this.Ill.isRemoved()) return false;
        if (minecraftClient.world.getEntityById(this.Ill.getId()) == this.Ill) return IlIlIlIII.IlI(minecraftClient.player.squaredDistanceTo((Entity)this.Ill), d);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIlI(Entity entity) {
        if (!(entity instanceof LivingEntity)) return;
        LivingEntity livingEntity = (LivingEntity)entity;
        if (IIllllllI.II(livingEntity)) return;
        this.llII(livingEntity);
        this.lll = livingEntity;
        this.II = System.currentTimeMillis();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long IIll(long l2) {
        if (this.II <= 0L) {
            return Long.MAX_VALUE;
        }
        long l3 = Math.max(0L, l2 - this.II);
        return l3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlII(MinecraftClient minecraftClient) {
        double d;
        if (minecraftClient.player == null) return;
        if (this.Ill != null) {
            d = minecraftClient.player.distanceTo((Entity)this.Ill);
            this.III = this.I ? this.ll - d : 0.0;
        }
        return;
        this.ll = d;
        double d2 = this.Ill.getX() - this.Il;
        double d3 = this.Ill.getZ() - this.llI;
        this.lIl = !this.I ? 0.0 : Math.sqrt(d2 * d2 + d3 * d3);
        this.Il = this.Ill.getX();
        this.llI = this.Ill.getZ();
        this.I = true;
    }

    public double IlIl() {
        return this.IlI.ll();
    }

    public double IllI() {
        return this.IIII() * 0.7 + this.lIlI() * 0.25 + this.llIl() * 1.6 + this.IlIl() * 0.7;
    }

    public IlIlIlIII() {
        this.lI = new IIlIllll();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void Illl(MinecraftClient minecraftClient) {
        EntityHitResult entityHitResult;
        HitResult hitResult;
        if (minecraftClient.player == null || minecraftClient.world == null) {
            this.Ill();
            return;
        }
        this.IlI.I(this.Il(minecraftClient, (Entity)minecraftClient.player));
        if (this.Ill != null && this.l(minecraftClient, this.Ill)) {
            this.Ill();
        }
        if (this.lll != null && this.lII(this.lll)) {
            this.lll = null;
            this.II = 0L;
        }
        if ((hitResult = minecraftClient.crosshairTarget) instanceof EntityHitResult && (hitResult = (entityHitResult = (EntityHitResult)hitResult).getEntity()) instanceof LivingEntity) {
            LivingEntity livingEntity = (LivingEntity)hitResult;
            if (hitResult != minecraftClient.player && !IIllllllI.II(livingEntity)) {
                this.llII(livingEntity);
            }
        }
        if (this.Ill != null && System.currentTimeMillis() - this.lII > 2500L) {
            this.Ill();
            return;
        }
        if (this.Ill == null) return;
        this.lI.I(this.Il(minecraftClient, (Entity)this.Ill));
        this.IlII(minecraftClient);
    }

    public double lIII(double d) {
        return this.lI.II(d);
    }

    public int lIIl(MinecraftClient minecraftClient) {
        int n = this.lI.Il();
        if (n <= 0) {
            return this.Il(minecraftClient, (Entity)this.Ill);
        }
        return n;
    }

    public double lIlI() {
        return this.IlI.l();
    }

    public LivingEntity lIll() {
        return this.lll;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llII(LivingEntity livingEntity) {
        if (this.Ill != livingEntity) {
            this.Ill = livingEntity;
            this.I = false;
            this.ll = 0.0;
            this.III = 0.0;
            this.lIl = 0.0;
            this.lI.lI();
        }
        this.lII = System.currentTimeMillis();
    }

    public double llIl() {
        return this.lI.ll();
    }
}

