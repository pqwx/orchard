/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.lIlIl
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
 *  net.minecraft.block.Blocks
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
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.world.WorldView;
import orchard.core.ClientEntrypoint;
import orchard.module.combat.AutoHeadWeb;
import orchard.module.combat.HitWeb;
import orchard.module.combat.ShieldBreaker;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={BlockItem.class})
public abstract class BlockItemMixin2 {
    @Inject(method={"canPlace"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(ItemPlacementContext itemPlacementContext, BlockState blockState, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        ShieldBreaker shieldBreaker;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        AutoHeadWeb autoHeadWeb = clientEntrypoint == null || clientEntrypoint.IlI() == null ? null : clientEntrypoint.IlI().llIII();
        HitWeb hitWeb = clientEntrypoint == null || clientEntrypoint.IlI() == null ? null : clientEntrypoint.IlI().lllIl();
        ShieldBreaker shieldBreaker2 = shieldBreaker = clientEntrypoint == null || clientEntrypoint.IlI() == null ? null : clientEntrypoint.IlI().IIIIlI();
        if (blockState.isOf(Blocks.COBWEB) && (autoHeadWeb != null && autoHeadWeb.IIIlIIl() || hitWeb != null && hitWeb.IIIIl() || shieldBreaker != null && shieldBreaker.lIIlI())) {
            callbackInfoReturnable.setReturnValue((Object)(!this.checkStatePlacement() || blockState.canPlaceAt((WorldView)itemPlacementContext.getWorld(), itemPlacementContext.getBlockPos()) ? 1 : 0));
        }
    }

    @Shadow
    protected abstract boolean checkStatePlacement();
}

