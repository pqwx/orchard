/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.llIIlIll
 * Mixin target   : GameRenderer
 *
 * Recovered strings in this class:
 *   - render
 *   - INVOKE
 *   - TAIL
 *   - HEAD
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.buffers.GpuBufferSlice
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.gui.render.GuiRenderer
 *  net.minecraft.client.render.GameRenderer
 *  net.minecraft.client.render.RenderTickCounter
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.render.GuiRenderer;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.client.render.RenderTickCounter;
import orchard.internal.llIl;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={GameRenderer.class})
public abstract class GameRendererMixin {
    @Redirect(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_11228;method_70890(Lcom/mojang/blaze3d/buffers/GpuBufferSlice;)V"), require=1)
    private void I(GuiRenderer guiRenderer, GpuBufferSlice gpuBufferSlice) {
        guiRenderer.render(gpuBufferSlice);
        llIl.IIll(guiRenderer, gpuBufferSlice);
    }

    @Inject(method={"render"}, at={@At(value="TAIL")})
    private void l(RenderTickCounter renderTickCounter, boolean bl, CallbackInfo callbackInfo) {
        llIl.ll();
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void II(RenderTickCounter renderTickCounter, boolean bl, CallbackInfo callbackInfo) {
        llIl.IIIl();
    }
}

