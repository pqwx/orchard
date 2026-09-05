/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.lIIIllIl
 * Mixin target   : InGameHud
 *
 * Recovered strings in this class:
 *   - renderHotbar
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
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.hud.InGameHud
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.ItemStack
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Redirect
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import orchard.internal.lIIllllI;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Environment(value=EnvType.CLIENT)
@Mixin(value={InGameHud.class})
public abstract class InGameHudMixin {
    @Redirect(method={"renderHotbar"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1661;method_67532()I"))
    private int I(PlayerInventory playerInventory) {
        return lIIllllI.IIllIlI(playerInventory);
    }

    @Redirect(method={"method_1748()V"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_1661;method_7391()Lnet/minecraft/class_1799;"))
    private ItemStack l(PlayerInventory playerInventory) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null && minecraftClient.player != null && minecraftClient.player.getInventory() == playerInventory) {
            return lIIllllI.llIIl(minecraftClient.player);
        }
        return playerInventory.getSelectedStack();
    }
}

