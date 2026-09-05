/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IlIIlIllI
 * Mixin target   : ClientPlayNetworkHandler
 *
 * Recovered strings in this class:
 *   - onChunkDeltaUpdate
 *   - onBlockUpdate
 *   - TAIL
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket
 *  net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import orchard.core.ClientEntrypoint;
import orchard.module.combat.ShieldBreaker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={ClientPlayNetworkHandler.class})
public abstract class ClientPlayNetworkHandlerMixin2 {
    @Inject(method={"onBlockUpdate"}, at={@At(value="TAIL")}, require=1)
    private void I(BlockUpdateS2CPacket blockUpdateS2CPacket, CallbackInfo callbackInfo) {
        this.II((Packet<?>)blockUpdateS2CPacket);
    }

    @Inject(method={"onChunkDeltaUpdate"}, at={@At(value="TAIL")}, require=1)
    private void l(ChunkDeltaUpdateS2CPacket chunkDeltaUpdateS2CPacket, CallbackInfo callbackInfo) {
        this.II((Packet<?>)chunkDeltaUpdateS2CPacket);
    }

    @Unique
    private void II(Packet<?> packet) {
        ShieldBreaker shieldBreaker;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        ShieldBreaker shieldBreaker2 = shieldBreaker = clientEntrypoint == null || clientEntrypoint.IlI() == null ? null : clientEntrypoint.IlI().IIIIlI();
        if (shieldBreaker != null && shieldBreaker.lIIlI()) {
            shieldBreaker.l(packet);
        }
    }
}

