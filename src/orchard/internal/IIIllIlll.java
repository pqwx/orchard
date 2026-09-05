/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.OtherClientPlayerEntity
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.Entity$RemovalReason
 *  net.minecraft.entity.player.PlayerEntity
 *  org.jetbrains.annotations.Nullable
 */
package orchard.internal;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import org.jetbrains.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class IIIllIlll
extends OtherClientPlayerEntity {
    private static final MinecraftClient I = MinecraftClient.getInstance();
    private final int l;
    @Nullable
    private PlayerListEntry II;

    public void I() {
        if (IIIllIlll.I.world == null) {
            return;
        }
        this.unsetRemoved();
        this.noClip = false;
        IIIllIlll.I.world.addEntity((Entity)this);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Nullable
    protected PlayerListEntry getPlayerListEntry() {
        if (this.II != null) return this.II;
        if (I.getNetworkHandler() == null) return this.II;
        if (IIIllIlll.I.player == null) return this.II;
        this.II = I.getNetworkHandler().getPlayerListEntry(IIIllIlll.I.player.getUuid());
        return this.II;
    }

    public int l() {
        return this.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static GameProfile II(PlayerEntity playerEntity, String string) {
        String string2 = string != null && !string.isEmpty() ? string : playerEntity.getName().getString();
        return new GameProfile(UUID.randomUUID(), string2);
    }

    public void Il() {
        if (IIIllIlll.I.world == null) {
            return;
        }
        IIIllIlll.I.world.removeEntity(this.getId(), Entity.RemovalReason.DISCARDED);
        this.setRemoved(Entity.RemovalReason.DISCARDED);
    }

    /*
     * Enabled aggressive block sorting
     */
    public IIIllIlll(PlayerEntity playerEntity, String string, float f, boolean bl, boolean bl2) {
        super(IIIllIlll.I.world, IIIllIlll.II(playerEntity, string));
        if (IIIllIlll.I.world != null && playerEntity != null) {
            this.copyPositionAndRotation((Entity)playerEntity);
            this.lastX = playerEntity.lastX;
            this.lastY = playerEntity.lastY;
            this.lastZ = playerEntity.lastZ;
            this.headYaw = playerEntity.headYaw;
            this.bodyYaw = playerEntity.bodyYaw;
            this.setVelocity(playerEntity.getVelocity());
            this.setOnGround(playerEntity.isOnGround());
            this.setSneaking(playerEntity.isSneaking());
            this.setSprinting(playerEntity.isSprinting());
            this.setSwimming(playerEntity.isSwimming());
            this.setAir(playerEntity.getAir());
            this.setFireTicks(playerEntity.getFireTicks());
            this.getAttributes().setFrom(playerEntity.getAttributes());
            this.setPose(playerEntity.getPose());
            this.noClip = false;
            if (f <= 20.0f) {
                this.setHealth(Math.max(1.0f, f));
            } else {
                this.setHealth(20.0f);
                this.setAbsorptionAmount(f - 20.0f);
            }
            if (bl2) {
                this.setInvisible(true);
            }
            if (bl) {
                this.getInventory().clone(playerEntity.getInventory());
            }
        } else {
            this.l = 0;
            return;
        }
        this.II = I.getNetworkHandler() == null ? null : I.getNetworkHandler().getPlayerListEntry(playerEntity.getUuid());
        this.l = this.II == null ? 0 : this.II.getLatency();
    }
}

