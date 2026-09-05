/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIlIIII
 * Mixin target   : ClientPlayNetworkHandler
 *
 * Recovered strings in this class:
 *   - onEntityAnimation
 *   - sendChatMessage
 *   - onEntityStatus
 *   - onEntityDamage
 *   - HEAD
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
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket
 *  net.minecraft.world.World
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.packet.s2c.play.EntityAnimationS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityDamageS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityStatusS2CPacket;
import net.minecraft.world.World;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.module.combat.AutoTotem;
import orchard.module.movement.JumpReset;
import orchard.module.render.PopVisuals;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={ClientPlayNetworkHandler.class})
public abstract class ClientPlayNetworkHandlerMixin {
    @Inject(method={"onEntityAnimation"}, at={@At(value="HEAD")})
    private void I(EntityAnimationS2CPacket entityAnimationS2CPacket, CallbackInfo callbackInfo) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null || clientEntrypoint.IlI() == null) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.world == null) {
            return;
        }
        Entity entity = minecraftClient.world.getEntityById(entityAnimationS2CPacket.getEntityId());
        if (entity != null) {
            clientEntrypoint.IlI().IlI(entity, entityAnimationS2CPacket.getAnimationId());
        }
    }

    @Inject(method={"onEntityStatus"}, at={@At(value="TAIL")})
    private void l(EntityStatusS2CPacket entityStatusS2CPacket, CallbackInfo callbackInfo) {
        ModuleBase moduleBase;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.world == null) {
            return;
        }
        Entity entity = entityStatusS2CPacket.getEntity((World)minecraftClient.world);
        if (entity != null && clientEntrypoint.IlI() != null) {
            clientEntrypoint.IlI().Illl(entity, entityStatusS2CPacket.getStatus());
        }
        if (entityStatusS2CPacket.getStatus() != 35) {
            return;
        }
        if (minecraftClient.player != null && entity != null && entity.getId() == minecraftClient.player.getId() && (moduleBase = clientEntrypoint.IlI().IIlIlII()) != null) {
            ((AutoTotem)moduleBase).IIII();
        }
        if ((moduleBase = clientEntrypoint.IlI().IlIlIII()) != null && moduleBase.IIIlIIl() && entity instanceof AbstractClientPlayerEntity) {
            AbstractClientPlayerEntity abstractClientPlayerEntity = (AbstractClientPlayerEntity)entity;
            ((PopVisuals)moduleBase).IIlI((PlayerEntity)abstractClientPlayerEntity);
        }
    }

    @Inject(method={"sendChatMessage"}, at={@At(value="HEAD")}, cancellable=true)
    private void II(String string, CallbackInfo callbackInfo) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null && clientEntrypoint.IlI() != null && clientEntrypoint.IlI().lIlIIl(string)) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"onEntityDamage"}, at={@At(value="TAIL")})
    private void Il(EntityDamageS2CPacket entityDamageS2CPacket, CallbackInfo callbackInfo) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null || clientEntrypoint.IlI() == null) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null || minecraftClient.world == null || entityDamageS2CPacket.entityId() != minecraftClient.player.getId()) {
            return;
        }
        JumpReset jumpReset = clientEntrypoint.IlI().IIIIlll();
        if (jumpReset != null && jumpReset.IIIlIIl()) {
            jumpReset.I(entityDamageS2CPacket.createDamageSource((World)minecraftClient.world));
        }
    }
}

