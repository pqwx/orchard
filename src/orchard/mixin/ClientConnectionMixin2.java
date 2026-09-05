/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IlIIlIlIl
 * Mixin target   : ClientConnection
 *
 * Recovered strings in this class:
 *   - }, at={@At(value=
 *   - }, at=@At(value=
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelFutureListener
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.network.ClientConnection
 *  net.minecraft.network.packet.Packet
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import io.netty.channel.ChannelFutureListener;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.packet.Packet;
import orchard.net.PacketInterceptor;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={ClientConnection.class})
public abstract class ClientConnectionMixin2 {
    @ModifyVariable(method={"method_52906(Lnet/minecraft/class_2596;Lio/netty/channel/ChannelFutureListener;Z)V"}, at=@At(value="HEAD"), argsOnly=true)
    private Packet<?> I(Packet<?> packet) {
        return PacketInterceptor.lIlI(packet);
    }

    @Inject(method={"method_52906(Lnet/minecraft/class_2596;Lio/netty/channel/ChannelFutureListener;Z)V"}, at={@At(value="HEAD")}, cancellable=true)
    private void l(Packet<?> packet, ChannelFutureListener channelFutureListener, boolean bl, CallbackInfo callbackInfo) {
        if (PacketInterceptor.IIII(packet)) {
            callbackInfo.cancel();
        }
    }
}

