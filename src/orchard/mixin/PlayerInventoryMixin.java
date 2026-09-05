/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IlIIllII
 * Mixin target   : PlayerInventory
 *
 * Recovered strings in this class:
 *   - getSelectedStack
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
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.ItemStack
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import orchard.internal.lIIllllI;
import orchard.mixin.PlayerInventoryMixin2;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={PlayerInventory.class})
public abstract class PlayerInventoryMixin {
    @Inject(method={"getSelectedStack"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(CallbackInfoReturnable<ItemStack> callbackInfoReturnable) {
        PlayerInventory playerInventory = (PlayerInventory)this;
        int n = lIIllllI.lIllII(playerInventory);
        int n2 = ((PlayerInventoryMixin2)playerInventory).ilovcats$getSelectedSlot();
        if (n >= 0 && n < 9 && n != n2) {
            callbackInfoReturnable.setReturnValue((Object)playerInventory.getStack(n));
        }
    }
}

