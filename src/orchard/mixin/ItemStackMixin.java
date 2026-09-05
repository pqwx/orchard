/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IllIlll
 * Mixin target   : ItemStack
 *
 * Recovered strings in this class:
 *   - getBobbingAnimationTime
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
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import orchard.core.ClientEntrypoint;
import orchard.module.render.NoBounce;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={ItemStack.class})
public abstract class ItemStackMixin {
    @Inject(method={"getBobbingAnimationTime"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(CallbackInfoReturnable<Integer> callbackInfoReturnable) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (minecraftClient.player == null || clientEntrypoint == null || clientEntrypoint.IlI() == null) {
            return;
        }
        NoBounce noBounce = clientEntrypoint.IlI().II(NoBounce.class);
        ItemStack itemStack = (ItemStack)this;
        if (noBounce != null && noBounce.IIIlIIl() && itemStack.isOf(Items.END_CRYSTAL)) {
            callbackInfoReturnable.setReturnValue((Object)0);
        }
    }
}

