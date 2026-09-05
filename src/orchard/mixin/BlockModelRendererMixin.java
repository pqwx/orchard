/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IlIIlllIl
 * Mixin target   : BlockModelRenderer
 *
 * Recovered strings in this class:
 *   - shouldDrawFace
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
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.render.block.BlockModelRenderer
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.world.BlockRenderView
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.block.BlockModelRenderer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockRenderView;
import orchard.core.ClientEntrypoint;
import orchard.module.render.Xray;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={BlockModelRenderer.class})
public abstract class BlockModelRendererMixin {
    @Inject(method={"shouldDrawFace"}, at={@At(value="HEAD")}, cancellable=true)
    private static void I(BlockRenderView blockRenderView, BlockState blockState, boolean bl, Direction direction, BlockPos blockPos, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) {
            return;
        }
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null || clientEntrypoint.IlI() == null) {
            return;
        }
        Xray xray = Xray.IIII();
        if (xray == null || !xray.IIIlIIl()) {
            return;
        }
        BlockPos blockPos2 = minecraftClient.player.getBlockPos();
        int n = (Integer)minecraftClient.options.getViewDistance().getValue();
        int n2 = Math.max(1, Math.min(n, 8));
        BlockPos blockPos3 = blockPos.offset(direction.getOpposite());
        int n3 = Math.abs((blockPos3.getX() >> 4) - (blockPos2.getX() >> 4));
        int n4 = Math.abs((blockPos3.getZ() >> 4) - (blockPos2.getZ() >> 4));
        if (n3 <= n2 && n4 <= n2) {
            if (xray.lIII(blockState)) {
                callbackInfoReturnable.setReturnValue((Object)true);
            } else {
                callbackInfoReturnable.setReturnValue((Object)false);
            }
        }
    }
}

