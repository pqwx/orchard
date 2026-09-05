/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllllllI
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import orchard.core.ClientEntrypoint;
import orchard.module.combat.AntiBot;
import orchard.module.iface.Friends;
import orchard.module.player.Teams;

@Environment(value=EnvType.CLIENT)
public final class IIllllllI {
    private IIllllllI() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean I(Entity entity) {
        if (!(entity instanceof PlayerEntity)) return false;
        PlayerEntity playerEntity = (PlayerEntity)entity;
        if (!IIllllllI.l(playerEntity)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean l(PlayerEntity playerEntity) {
        if (playerEntity == null) {
            return false;
        }
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        Friends friends = clientEntrypoint.IlI().IIllIII();
        if (friends != null && friends.IIlI(playerEntity)) {
            return true;
        }
        Teams teams = clientEntrypoint.IlI().IIllIl();
        if (teams != null && teams.lII(playerEntity)) {
            return true;
        }
        AntiBot antiBot = clientEntrypoint.IlI().II(AntiBot.class);
        if (antiBot == null) return false;
        if (antiBot.lll(playerEntity)) return true;
        return false;
    }

    public static boolean II(LivingEntity livingEntity) {
        PlayerEntity playerEntity;
        return livingEntity instanceof PlayerEntity && IIllllllI.l(playerEntity = (PlayerEntity)livingEntity);
    }
}

