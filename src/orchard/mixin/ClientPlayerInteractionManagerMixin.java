/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIIlllIll
 * Mixin target   : ClientPlayerInteractionManager
 *
 * Recovered strings in this class:
 *   - attackEntity
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
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import orchard.core.ClientEntrypoint;
import orchard.internal.lIIllllI;
import orchard.module.combat.AutoTotem;
import orchard.module.combat.BreachSwap;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={ClientPlayerInteractionManager.class})
public abstract class ClientPlayerInteractionManagerMixin {
    @Inject(method={"attackEntity"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(PlayerEntity playerEntity, Entity entity, CallbackInfo callbackInfo) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null) {
            AutoTotem autoTotem = clientEntrypoint.IlI().IIlIlII();
            if (autoTotem != null && autoTotem.lIl(MinecraftClient.getInstance())) {
                callbackInfo.cancel();
                return;
            }
            BreachSwap breachSwap = clientEntrypoint.IlI().l();
            if (breachSwap != null && breachSwap.IIIlIIl() && !lIIllllI.IIIlIIl() && entity instanceof LivingEntity) {
                LivingEntity livingEntity = (LivingEntity)entity;
                breachSwap.IIIIl(MinecraftClient.getInstance(), livingEntity);
            }
            clientEntrypoint.IlI().IlIl(entity);
        }
    }

    @Inject(method={"attackEntity"}, at={@At(value="TAIL")})
    private void l(PlayerEntity playerEntity, Entity entity, CallbackInfo callbackInfo) {
        lIIllllI.IlIIllI();
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null) {
            clientEntrypoint.IlI().IIllll(entity);
        }
    }
}

