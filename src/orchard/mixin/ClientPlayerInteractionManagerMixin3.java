/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IlIIllIl
 * Mixin target   : ClientPlayerInteractionManager
 *
 * Recovered strings in this class:
 *   - syncSelectedSlot
 *   - interactBlock
 *   - attackEntity
 *   - interactItem
 *   - attackBlock
 *   - RETURN
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
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import orchard.core.ClientEntrypoint;
import orchard.internal.lIIllllI;
import orchard.module.combat.AirAnchor;
import orchard.module.combat.AutoSafeAnchor;
import orchard.module.combat.AutoTotem;
import orchard.module.combat.ClickCrystal;
import orchard.module.combat.FastAnchor;
import orchard.module.combat.FastCart;
import orchard.module.player.AutoDrain;
import orchard.module.player.AutoTool;
import orchard.module.player.NoInteract;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={ClientPlayerInteractionManager.class})
public abstract class ClientPlayerInteractionManagerMixin3 {
    @Unique
    private int I;

    @Inject(method={"attackEntity"}, at={@At(value="RETURN")})
    private void I(PlayerEntity playerEntity, Entity entity, CallbackInfo callbackInfo) {
        this.Il();
    }

    @Inject(method={"interactBlock"}, at={@At(value="HEAD")}, cancellable=true)
    private void l(ClientPlayerEntity clientPlayerEntity, Hand hand, BlockHitResult blockHitResult, CallbackInfoReturnable<ActionResult> callbackInfoReturnable) {
        ClickCrystal clickCrystal;
        AutoDrain autoDrain;
        boolean bl;
        AutoSafeAnchor autoSafeAnchor;
        FastAnchor fastAnchor;
        ClientEntrypoint clientEntrypoint;
        if (lIIllllI.lIIIIl()) {
            ++this.I;
        }
        if ((clientEntrypoint = ClientEntrypoint.lII()) == null) {
            return;
        }
        AutoTotem autoTotem = clientEntrypoint.IlI().IIlIlII();
        if (autoTotem != null && autoTotem.lIl(MinecraftClient.getInstance())) {
            this.Il();
            callbackInfoReturnable.setReturnValue((Object)ActionResult.FAIL);
            return;
        }
        NoInteract noInteract = clientEntrypoint.IlI().II(NoInteract.class);
        if (noInteract != null && noInteract.l(MinecraftClient.getInstance(), blockHitResult)) {
            this.Il();
            callbackInfoReturnable.setReturnValue((Object)ActionResult.FAIL);
            return;
        }
        AirAnchor airAnchor = clientEntrypoint.IlI().IIlIIll();
        if (airAnchor != null) {
            airAnchor.lll(MinecraftClient.getInstance(), hand, blockHitResult);
        }
        if ((fastAnchor = clientEntrypoint.IlI().IlIIlI()) != null) {
            fastAnchor.lIlII(MinecraftClient.getInstance(), hand, blockHitResult);
        }
        if (!((autoSafeAnchor = clientEntrypoint.IlI().Ill()) == null || airAnchor != null && airAnchor.lII())) {
            autoSafeAnchor.IlII(MinecraftClient.getInstance(), hand, blockHitResult);
        }
        FastAnchor fastAnchor2 = clientEntrypoint.IlI().IlIIlI();
        boolean bl2 = airAnchor != null && airAnchor.lII() || autoSafeAnchor != null && autoSafeAnchor.IIIII();
        boolean bl3 = bl = !bl2 && (autoSafeAnchor == null || !autoSafeAnchor.IIIIlI()) && fastAnchor2 != null && fastAnchor2.lIIll(MinecraftClient.getInstance(), hand, blockHitResult);
        if (bl) {
            if (airAnchor != null) {
                airAnchor.lIl(MinecraftClient.getInstance(), hand, blockHitResult);
            }
            if (autoSafeAnchor != null) {
                autoSafeAnchor.IIllII();
                autoSafeAnchor.IIlIIl();
            }
            this.Il();
            callbackInfoReturnable.setReturnValue((Object)ActionResult.FAIL);
            return;
        }
        FastCart fastCart = clientEntrypoint.IlI().IIIIl();
        if (fastCart != null && !fastCart.Illl()) {
            fastCart.IlIlI(MinecraftClient.getInstance(), hand, blockHitResult);
        }
        if ((autoDrain = clientEntrypoint.IlI().IIIIIl()) != null) {
            autoDrain.IlIll(MinecraftClient.getInstance(), hand, blockHitResult);
        }
        if ((clickCrystal = clientEntrypoint.IlI().IIllIll()) == null || !clickCrystal.IIIlIIl()) {
            return;
        }
        if (clickCrystal.IIIll(MinecraftClient.getInstance())) {
            this.Il();
            callbackInfoReturnable.setReturnValue((Object)ActionResult.FAIL);
        }
    }

    @Inject(method={"syncSelectedSlot"}, at={@At(value="HEAD")}, cancellable=true)
    private void II(CallbackInfo callbackInfo) {
        if (lIIllllI.lllIIl()) {
            callbackInfo.cancel();
        }
    }

    @Unique
    private void Il() {
        if (this.I > 0) {
            --this.I;
            lIIllllI.IlIIlIl();
        }
    }

    @Inject(method={"interactBlock"}, at={@At(value="RETURN")})
    private void lI(ClientPlayerEntity clientPlayerEntity, Hand hand, BlockHitResult blockHitResult, CallbackInfoReturnable<ActionResult> callbackInfoReturnable) {
        FastCart fastCart;
        AutoDrain autoDrain;
        AutoSafeAnchor autoSafeAnchor;
        this.Il();
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        AirAnchor airAnchor = clientEntrypoint.IlI().IIlIIll();
        if (airAnchor != null) {
            airAnchor.lIIl(MinecraftClient.getInstance(), hand, blockHitResult, (ActionResult)callbackInfoReturnable.getReturnValue());
        }
        if ((autoSafeAnchor = clientEntrypoint.IlI().Ill()) != null) {
            autoSafeAnchor.llIll(MinecraftClient.getInstance(), hand, blockHitResult, (ActionResult)callbackInfoReturnable.getReturnValue());
        }
        if ((autoDrain = clientEntrypoint.IlI().IIIIIl()) != null) {
            autoDrain.lI(MinecraftClient.getInstance(), hand, blockHitResult, (ActionResult)callbackInfoReturnable.getReturnValue());
        }
        if ((fastCart = clientEntrypoint.IlI().IIIIl()) != null) {
            fastCart.IIllI(MinecraftClient.getInstance(), hand, blockHitResult, (ActionResult)callbackInfoReturnable.getReturnValue());
        }
    }

    @Inject(method={"attackEntity"}, at={@At(value="HEAD")})
    private void ll(PlayerEntity playerEntity, Entity entity, CallbackInfo callbackInfo) {
        if (lIIllllI.lIIIIl()) {
            ++this.I;
        }
    }

    @Inject(method={"interactItem"}, at={@At(value="RETURN")})
    private void III(PlayerEntity playerEntity, Hand hand, CallbackInfoReturnable<ActionResult> callbackInfoReturnable) {
        this.Il();
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        AutoDrain autoDrain = clientEntrypoint.IlI().IIIIIl();
        if (autoDrain != null) {
            autoDrain.IIIll(MinecraftClient.getInstance(), hand, (ActionResult)callbackInfoReturnable.getReturnValue());
        }
    }

    @Inject(method={"attackBlock"}, at={@At(value="HEAD")}, cancellable=true)
    private void IIl(BlockPos blockPos, Direction direction, CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        AutoTool autoTool = clientEntrypoint.IlI().II(AutoTool.class);
        boolean bl = autoTool != null && autoTool.IllI(MinecraftClient.getInstance(), blockPos, direction);
        AutoTotem autoTotem = clientEntrypoint.IlI().IIlIlII();
        if (autoTotem != null && autoTotem.lIl(MinecraftClient.getInstance())) {
            callbackInfoReturnable.setReturnValue((Object)false);
            return;
        }
        if (bl) {
            callbackInfoReturnable.setReturnValue((Object)false);
            return;
        }
        ClickCrystal clickCrystal = clientEntrypoint.IlI().IIllIll();
        if (clickCrystal == null) {
            return;
        }
        if (clickCrystal.IlI(blockPos, direction)) {
            callbackInfoReturnable.setReturnValue((Object)true);
        }
    }

    @Inject(method={"interactItem"}, at={@At(value="HEAD")}, cancellable=true)
    private void IlI(PlayerEntity playerEntity, Hand hand, CallbackInfoReturnable<ActionResult> callbackInfoReturnable) {
        ClientEntrypoint clientEntrypoint;
        if (lIIllllI.lIIIIl()) {
            ++this.I;
        }
        if ((clientEntrypoint = ClientEntrypoint.lII()) == null) {
            return;
        }
        AutoTotem autoTotem = clientEntrypoint.IlI().IIlIlII();
        if (autoTotem != null && autoTotem.lIl(MinecraftClient.getInstance())) {
            this.Il();
            callbackInfoReturnable.setReturnValue((Object)ActionResult.FAIL);
        }
    }
}

