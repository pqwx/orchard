/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IllIIII
 * Mixin target   : LivingEntity
 *
 * Recovered strings in this class:
 *   - getEffectFadeFactor
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
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.registry.entry.RegistryEntry
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntry;
import orchard.core.ClientEntrypoint;
import orchard.module.render.NoEffectView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={LivingEntity.class})
public abstract class LivingEntityMixin {
    @Inject(method={"getEffectFadeFactor"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(RegistryEntry<StatusEffect> registryEntry, float f, CallbackInfoReturnable<Float> callbackInfoReturnable) {
        if (this.l(registryEntry)) {
            callbackInfoReturnable.setReturnValue((Object)Float.valueOf(0.0f));
        }
    }

    private boolean l(RegistryEntry<StatusEffect> registryEntry) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.player != this) {
            return false;
        }
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return false;
        }
        NoEffectView noEffectView = clientEntrypoint.IlI().II(NoEffectView.class);
        return noEffectView != null && noEffectView.IlI(registryEntry);
    }
}

