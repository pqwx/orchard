/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIIIlIlIl
 * Mixin target   : HeldItemRenderer
 *
 * Recovered strings in this class:
 *   - renderFirstPersonItem
 *   - updateHeldItems
 *   - swingArm
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
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.AbstractClientPlayerEntity
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.entity.state.Lancing
 *  net.minecraft.client.render.item.HeldItemRenderer
 *  net.minecraft.client.util.math.MatrixStack
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.Arm
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.MathHelper
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.gen.Invoker
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.state.Lancing;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import orchard.core.ClientEntrypoint;
import orchard.internal.Ill;
import orchard.internal.lIIlllIl;
import orchard.internal.llIIlll;
import orchard.module.render.Animations;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.gen.Invoker;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={HeldItemRenderer.class})
public abstract class HeldItemRendererMixin {
    @Unique
    private boolean I;
    @Shadow
    private ItemStack offHand;
    @Shadow
    private ItemStack mainHand;
    @Shadow
    private float equipProgressOffHand;
    @Unique
    private float l;
    @Shadow
    private float equipProgressMainHand;
    @Unique
    private float II;

    @Inject(method={"updateHeldItems"}, at={@At(value="TAIL")}, require=0)
    private void I(CallbackInfo callbackInfo) {
        Animations animations = llIIlll.l();
        if (animations == null || !animations.IIIlIIl()) {
            this.III();
            return;
        }
        if (!this.I) {
            this.III();
            return;
        }
        this.II = this.lI(this.II, this.equipProgressMainHand, animations.IIllI(Hand.MAIN_HAND));
        this.l = this.lI(this.l, this.equipProgressOffHand, animations.IIllI(Hand.OFF_HAND));
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (animations.llII(Hand.MAIN_HAND)) {
            this.II = 1.0f;
            if (minecraftClient != null && minecraftClient.player != null) {
                this.mainHand = minecraftClient.player.getMainHandStack();
            }
        }
        if (animations.llII(Hand.OFF_HAND)) {
            this.l = 1.0f;
            if (minecraftClient != null && minecraftClient.player != null) {
                this.offHand = minecraftClient.player.getOffHandStack();
            }
        }
        this.equipProgressMainHand = this.II;
        this.equipProgressOffHand = this.l;
    }

    @Inject(method={"renderFirstPersonItem"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_759;method_3233(Lnet/minecraft/class_1309;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V")}, require=1)
    private void l(AbstractClientPlayerEntity abstractClientPlayerEntity, float f, float f2, Hand hand, float f3, ItemStack itemStack, float f4, MatrixStack matrixStack, OrderedRenderCommandQueue orderedRenderCommandQueue, int n, CallbackInfo callbackInfo) {
        llIIlll.I(abstractClientPlayerEntity, hand, itemStack, f, f3, matrixStack);
    }

    @Redirect(method={"renderFirstPersonItem"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_759;method_65816(FLnet/minecraft/class_4587;ILnet/minecraft/class_1306;)V"), require=1)
    private void II(HeldItemRenderer heldItemRenderer, float f, MatrixStack matrixStack, int n, Arm arm, AbstractClientPlayerEntity abstractClientPlayerEntity, float f2, float f3, Hand hand, float f4, ItemStack itemStack, float f5, MatrixStack matrixStack2, OrderedRenderCommandQueue orderedRenderCommandQueue, int n2) {
        if (!llIIlll.lI(hand)) {
            this.ilovcats$invokeSwingArm(f, matrixStack, n, arm);
        }
    }

    @Redirect(method={"renderFirstPersonItem"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_12152;method_75391(FLnet/minecraft/class_4587;ILnet/minecraft/class_1306;)V"), require=1)
    private void Il(float f, MatrixStack matrixStack, int n, Arm arm, AbstractClientPlayerEntity abstractClientPlayerEntity, float f2, float f3, Hand hand, float f4, ItemStack itemStack, float f5, MatrixStack matrixStack2, OrderedRenderCommandQueue orderedRenderCommandQueue, int n2) {
        if (!llIIlll.lI(hand)) {
            Lancing.method_75391((float)f, (MatrixStack)matrixStack, (int)n, (Arm)arm);
        }
    }

    @Unique
    private float lI(float f, float f2, float f3) {
        if (f3 <= 0.0f) {
            return f2;
        }
        float f4 = MathHelper.clamp((float)(1.0f - f3 * 0.82f), (float)0.16f, (float)1.0f);
        return f + (f2 - f) * f4;
    }

    @ModifyVariable(method={"renderFirstPersonItem"}, at=@At(value="HEAD"), argsOnly=true, ordinal=1)
    private float ll(float f) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null || clientEntrypoint.IlI() == null) {
            return f;
        }
        Ill ill = lIIlllIl.II();
        if (ill == Ill.I) {
            return f;
        }
        return lIIlllIl.Il(ill, 1.0f);
    }

    @Unique
    private void III() {
        this.I = true;
        this.II = this.equipProgressMainHand;
        this.l = this.equipProgressOffHand;
    }

    @Invoker(value="swingArm")
    protected abstract void ilovcats$invokeSwingArm(float var1, MatrixStack var2, int var3, Arm var4);

    @Inject(method={"renderFirstPersonItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void IIl(AbstractClientPlayerEntity abstractClientPlayerEntity, float f, float f2, Hand hand, float f3, ItemStack itemStack, float f4, MatrixStack matrixStack, OrderedRenderCommandQueue orderedRenderCommandQueue, int n, CallbackInfo callbackInfo) {
        if (!llIIlll.II(abstractClientPlayerEntity, hand)) {
            callbackInfo.cancel();
        }
    }
}

