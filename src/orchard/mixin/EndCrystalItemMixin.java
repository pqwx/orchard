/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIIlIIIIl
 * Mixin target   : EndCrystalItem
 *
 * Recovered strings in this class:
 *   - useOnBlock
 *   - INVOKE
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.item.EndCrystalItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.ItemUsageContext
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.EndCrystalItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import orchard.core.ClientEntrypoint;
import orchard.module.render.NoBounce;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(value=EnvType.CLIENT)
@Mixin(value={EndCrystalItem.class})
public abstract class EndCrystalItemMixin {
    @Redirect(method={"useOnBlock"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1799;method_7934(I)V"))
    private void I(ItemStack itemStack, int n, ItemUsageContext itemUsageContext) {
        NoBounce noBounce;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        NoBounce noBounce2 = noBounce = clientEntrypoint == null || clientEntrypoint.IlI() == null ? null : clientEntrypoint.IlI().II(NoBounce.class);
        if (itemUsageContext.getWorld().isClient() && noBounce != null && noBounce.IIIlIIl()) {
            return;
        }
        itemStack.decrement(n);
    }
}

