/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.lIIIIlII
 * Mixin target   : StatusEffectFogModifier
 *
 * Recovered strings in this class:
 *   - shouldApply
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
 *  net.minecraft.block.enums.CameraSubmersionType
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.render.fog.StatusEffectFogModifier
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffects
 *  net.minecraft.registry.entry.RegistryEntry
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.enums.CameraSubmersionType;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.fog.StatusEffectFogModifier;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.registry.entry.RegistryEntry;
import orchard.core.ClientEntrypoint;
import orchard.module.render.NoEffectView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={StatusEffectFogModifier.class})
public abstract class StatusEffectFogModifierMixin {
    @Shadow
    public abstract RegistryEntry<StatusEffect> getStatusEffect();

    private boolean I(Entity entity) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null || minecraftClient.player == null || entity != minecraftClient.player) {
            return false;
        }
        RegistryEntry<StatusEffect> registryEntry = this.getStatusEffect();
        if (!StatusEffects.BLINDNESS.equals(registryEntry) && !StatusEffects.DARKNESS.equals(registryEntry)) {
            return false;
        }
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return false;
        }
        NoEffectView noEffectView = clientEntrypoint.IlI().II(NoEffectView.class);
        return noEffectView != null && noEffectView.IlI(registryEntry);
    }

    @Inject(method={"shouldApply"}, at={@At(value="HEAD")}, cancellable=true)
    private void l(CameraSubmersionType cameraSubmersionType, Entity entity, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (this.I(entity)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }
}

