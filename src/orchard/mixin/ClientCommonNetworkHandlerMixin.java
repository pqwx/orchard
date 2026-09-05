/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IlIllIlII
 * Mixin target   : ClientCommonNetworkHandler
 *
 * Recovered strings in this class:
 *   - onResourcePackSend
 *   - HEAD
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
 *  net.minecraft.client.network.ClientCommonNetworkHandler
 *  net.minecraft.network.ClientConnection
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket
 *  net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket$Status
 *  net.minecraft.network.packet.s2c.common.ResourcePackSendS2CPacket
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientCommonNetworkHandler;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket;
import net.minecraft.network.packet.s2c.common.ResourcePackSendS2CPacket;
import orchard.internal.IlllIllI;
import orchard.net.PacketInterceptor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={ClientCommonNetworkHandler.class})
public abstract class ClientCommonNetworkHandlerMixin {
    @Shadow
    @Final
    protected ClientConnection connection;
    @Shadow
    @Final
    protected MinecraftClient client;

    @Inject(method={"onResourcePackSend"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(ResourcePackSendS2CPacket resourcePackSendS2CPacket, CallbackInfo callbackInfo) {
        if (!PacketInterceptor.IlII()) {
            return;
        }
        if (PacketInterceptor.IlIl(resourcePackSendS2CPacket.id())) {
            return;
        }
        callbackInfo.cancel();
        PacketInterceptor.I(resourcePackSendS2CPacket.url(), bl -> this.client.execute(() -> {
            if (IlllIllI.I() || !this.connection.isOpen()) {
                return;
            }
            if (!PacketInterceptor.IlII()) {
                this.onResourcePackSend(resourcePackSendS2CPacket);
                return;
            }
            if (!bl.booleanValue() || !PacketInterceptor.Il(resourcePackSendS2CPacket.url())) {
                this.connection.send((Packet)new ResourcePackStatusC2SPacket(resourcePackSendS2CPacket.id(), ResourcePackStatusC2SPacket.Status.INVALID_URL));
                PacketInterceptor.Ill(resourcePackSendS2CPacket.url());
                return;
            }
            PacketInterceptor.llIl(resourcePackSendS2CPacket.id());
            this.onResourcePackSend(resourcePackSendS2CPacket);
        }));
    }

    @Shadow
    public abstract void onResourcePackSend(ResourcePackSendS2CPacket var1);
}

