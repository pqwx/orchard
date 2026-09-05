/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIlllllII
 * Mixin target   : ClientConnection
 *
 * Recovered strings in this class:
 *   - addFlowControlHandler
 *   - ilovcats_ping_spoof
 *   - channelInactive
 *   - channelActive
 *   - RETURN
 *   - send
 *   - TAIL
 *   - HEAD
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPipeline
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.network.ClientConnection
 *  net.minecraft.network.NetworkSide
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.NetworkSide;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import orchard.core.ClientEntrypoint;
import orchard.internal.IIIlIIlll;
import orchard.internal.lIIIlIl;
import orchard.module.combat.AutoTotem;
import orchard.module.player.XCarry;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={ClientConnection.class})
public abstract class ClientConnectionMixin {
    @Shadow
    private Channel channel;
    @Unique
    private static final String I = "ilovcats_ping_spoof";
    @Shadow
    @Final
    private NetworkSide side;
    @Unique
    private lIIIlIl l;

    @Unique
    private boolean I() {
        return this.side == NetworkSide.CLIENTBOUND && this.channel != null;
    }

    @Inject(method={"addFlowControlHandler"}, at={@At(value="RETURN")})
    private void l(ChannelPipeline channelPipeline, CallbackInfo callbackInfo) {
        if (!this.I()) {
            return;
        }
        this.lI(channelPipeline);
    }

    @Inject(method={"send"}, at={@At(value="TAIL")})
    private void II(Packet<?> packet, CallbackInfo callbackInfo) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null && clientEntrypoint.IlI() != null) {
            clientEntrypoint.IlI().lIllII(packet);
        }
    }

    @Inject(method={"send"}, at={@At(value="HEAD")}, cancellable=true)
    private void Il(Packet<?> packet, CallbackInfo callbackInfo) {
        AutoTotem autoTotem;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (this.I()) {
            this.lI(this.channel.pipeline());
        }
        if (clientEntrypoint != null && clientEntrypoint.IlI() != null && (autoTotem = clientEntrypoint.IlI().IIlIlII()) != null && autoTotem.IIIIl(packet)) {
            callbackInfo.cancel();
            return;
        }
        if (clientEntrypoint != null && packet instanceof CloseHandledScreenC2SPacket) {
            autoTotem = (CloseHandledScreenC2SPacket)packet;
            XCarry xCarry = clientEntrypoint.IlI().IIIlI();
            if (xCarry != null && xCarry.IIl((CloseHandledScreenC2SPacket)autoTotem)) {
                callbackInfo.cancel();
                return;
            }
        }
        if (clientEntrypoint != null && clientEntrypoint.IlI() != null && clientEntrypoint.IlI().IlllIl() != null) {
            clientEntrypoint.IlI().IlllIl().lI(packet);
        }
        if (clientEntrypoint != null && clientEntrypoint.IlI() != null) {
            clientEntrypoint.IlI().llII(packet);
        }
        lIIIlIl.llIIl(packet);
    }

    @Unique
    private void lI(ChannelPipeline channelPipeline) {
        IIIlIIlll.II().Ill();
        Channel channel = channelPipeline.channel();
        Runnable runnable = () -> {
            if (this.channel != channel || !channel.isOpen()) {
                return;
            }
            ChannelHandler channelHandler = channelPipeline.get(I);
            if (channelHandler instanceof lIIIlIl) {
                lIIIlIl lIIIlIl2;
                this.l = lIIIlIl2 = (lIIIlIl)channelHandler;
                return;
            }
            if (channelHandler != null) {
                return;
            }
            ChannelHandlerContext channelHandlerContext = channelPipeline.context((ChannelHandler)this);
            lIIIlIl lIIIlIl3 = new lIIIlIl();
            if (channelHandlerContext != null) {
                channelPipeline.addBefore(channelHandlerContext.name(), I, (ChannelHandler)lIIIlIl3);
            } else {
                channelPipeline.addLast(I, (ChannelHandler)lIIIlIl3);
            }
            this.l = lIIIlIl3;
        };
        if (channel.eventLoop().inEventLoop()) {
            runnable.run();
            return;
        }
        try {
            channel.eventLoop().execute(runnable);
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
    }

    @Inject(method={"channelActive"}, at={@At(value="TAIL")})
    private void III(ChannelHandlerContext channelHandlerContext, CallbackInfo callbackInfo) {
        if (!this.I()) {
            return;
        }
        this.lI(channelHandlerContext.pipeline());
    }

    @Inject(method={"channelInactive"}, at={@At(value="HEAD")})
    private void IIl(ChannelHandlerContext channelHandlerContext, CallbackInfo callbackInfo) {
        IIIlIIlll.II().I();
        if (this.l != null) {
            this.l.IllI();
            this.l = null;
        }
    }
}

