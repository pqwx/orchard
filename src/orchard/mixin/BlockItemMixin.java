/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIIIlllll
 * Mixin target   : BlockItem
 *
 * Recovered strings in this class:
 *   - canPlace
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
 *  net.minecraft.block.BlockState
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.ItemPlacementContext
 *  net.minecraft.world.WorldView
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.world.WorldView;
import orchard.core.ClientEntrypoint;
import orchard.module.player.WebAssist;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={BlockItem.class})
public abstract class BlockItemMixin {
    @Shadow
    protected abstract boolean checkStatePlacement();

    @Inject(method={"canPlace"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(ItemPlacementContext itemPlacementContext, BlockState blockState, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        boolean bl;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null || clientEntrypoint.IlI() == null) {
            return;
        }
        WebAssist webAssist = clientEntrypoint.IlI().lIl();
        boolean bl2 = bl = webAssist != null && webAssist.IIIlIIl();
        if (bl) {
            callbackInfoReturnable.setReturnValue((Object)(!this.checkStatePlacement() || blockState.canPlaceAt((WorldView)itemPlacementContext.getWorld(), itemPlacementContext.getBlockPos()) ? 1 : 0));
        }
    }
}

