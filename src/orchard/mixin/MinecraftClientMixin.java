/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIllIIlIl
 * Mixin target   : MinecraftClient
 *
 * Recovered strings in this class:
 *   - handleInputEvents
 *   - doItemUse
 *   - doAttack
 *   - RETURN
 *   - stop
 *   - HEAD
 *   - TAIL
 *   - tick
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
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
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
import net.minecraft.client.option.KeyBinding;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import orchard.core.ClientEntrypoint;
import orchard.internal.IIlI;
import orchard.internal.IlIlllI;
import orchard.internal.lIIIlIl;
import orchard.internal.lIIllllI;
import orchard.module.combat.KnockbackDisplacement;
import orchard.module.iface.ClickSimulations;
import orchard.module.player.FastPlace;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={MinecraftClient.class})
public abstract class MinecraftClientMixin {
    @Unique
    private HitResult I;
    @Unique
    private boolean l;

    @Inject(method={"stop"}, at={@At(value="HEAD")})
    private void I(CallbackInfo callbackInfo) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null) {
            clientEntrypoint.IIII();
        }
    }

    @Inject(method={"handleInputEvents"}, at={@At(value="TAIL")})
    private void l(CallbackInfo callbackInfo) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        clientEntrypoint.IlI().lllIII(MinecraftClient.getInstance());
    }

    @Inject(method={"doItemUse"}, at={@At(value="RETURN")})
    private void II(CallbackInfo callbackInfo) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null || clientEntrypoint.IlI() == null) {
            return;
        }
        FastPlace fastPlace = clientEntrypoint.IlI().II(FastPlace.class);
        if (fastPlace != null) {
            fastPlace.lll(MinecraftClient.getInstance());
        }
    }

    @Inject(method={"doAttack"}, at={@At(value="RETURN")})
    private void Il(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        this.IlI(MinecraftClient.getInstance());
    }

    @Inject(method={"doAttack"}, at={@At(value="HEAD")}, cancellable=true)
    private void lI(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        Object object;
        HitResult hitResult;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) {
            return;
        }
        this.IlI(minecraftClient);
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (!lIIllllI.IIlllII() && !lIIllllI.llIlll() && (IIlI.IIl(minecraftClient) || lIIllllI.llIlI() || IlIlllI.lIl())) {
            callbackInfoReturnable.setReturnValue((Object)false);
            return;
        }
        if (!lIIllllI.IIlllII() && lIIllllI.lIIIlI(minecraftClient)) {
            callbackInfoReturnable.setReturnValue((Object)false);
            return;
        }
        if (clientEntrypoint == null || clientEntrypoint.IlI() == null) {
            return;
        }
        EntityHitResult entityHitResult = this.Ill(minecraftClient, clientEntrypoint);
        if (entityHitResult != null) {
            this.I = minecraftClient.crosshairTarget;
            this.l = true;
            minecraftClient.crosshairTarget = entityHitResult;
        }
        if ((hitResult = minecraftClient.crosshairTarget) instanceof EntityHitResult && lIIllllI.Il(minecraftClient, (object = (EntityHitResult)hitResult).getEntity())) {
            lIIllllI.lIl(minecraftClient);
            callbackInfoReturnable.setReturnValue((Object)false);
            return;
        }
        if (!lIIllllI.IIlllII() && (object = clientEntrypoint.IlI().IIllIIl()) != null && ((KnockbackDisplacement)object).lIII(minecraftClient)) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Inject(method={"doItemUse"}, at={@At(value="HEAD")}, cancellable=true)
    private void ll(CallbackInfo callbackInfo) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!lIIllllI.llIlll() && (IIlI.IIl(minecraftClient) || lIIllllI.llIlI() || IlIlllI.lIl())) {
            callbackInfo.cancel();
            return;
        }
        if (lIIllllI.lIIIlI(minecraftClient)) {
            callbackInfo.cancel();
        }
    }

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    private void III(CallbackInfo callbackInfo) {
        lIIIlIl.lIIIll();
    }

    @Inject(method={"handleInputEvents"}, at={@At(value="HEAD")})
    private void IIl(CallbackInfo callbackInfo) {
        KeyBinding keyBinding;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        ClickSimulations clickSimulations = clientEntrypoint.IlI().lIlII();
        if (clickSimulations != null) {
            clickSimulations.IlII(minecraftClient);
        }
        if (clientEntrypoint.IlI().IlIllI() != null && clientEntrypoint.IlI().IlIllI().IIIlIIl() && minecraftClient != null && minecraftClient.options != null && (keyBinding = minecraftClient.options.togglePerspectiveKey) != null) {
            lIIllllI.llIlIl(keyBinding);
            keyBinding.setPressed(false);
        }
        if (minecraftClient != null && minecraftClient.options != null) {
            lIIllllI.IlIlll(minecraftClient);
            if (!lIIllllI.llIlll() && (IIlI.IIl(minecraftClient) || lIIllllI.llIlI() || IlIlllI.lIl())) {
                if (minecraftClient.options.attackKey != null) {
                    lIIllllI.llIlIl(minecraftClient.options.attackKey);
                    minecraftClient.options.attackKey.setPressed(false);
                }
                if (minecraftClient.options.useKey != null) {
                    lIIllllI.llIlIl(minecraftClient.options.useKey);
                    minecraftClient.options.useKey.setPressed(false);
                }
            }
        }
        clientEntrypoint.IlI().lIlll(MinecraftClient.getInstance());
        if (clickSimulations != null) {
            clickSimulations.IlII(minecraftClient);
        }
        if (minecraftClient != null && minecraftClient.options != null) {
            if (lIIllllI.lIIIlI(minecraftClient)) {
                if (minecraftClient.options.attackKey != null) {
                    lIIllllI.llIlIl(minecraftClient.options.attackKey);
                    minecraftClient.options.attackKey.setPressed(false);
                }
                if (minecraftClient.options.useKey != null) {
                    lIIllllI.llIlIl(minecraftClient.options.useKey);
                    minecraftClient.options.useKey.setPressed(false);
                }
            } else if (!(minecraftClient.currentScreen != null || IIlI.IIl(minecraftClient) || lIIllllI.llIlI() || IlIlllI.lIl())) {
                if (minecraftClient.options.attackKey != null && !minecraftClient.options.attackKey.isPressed() && lIIllllI.IIllIII(minecraftClient, minecraftClient.options.attackKey)) {
                    minecraftClient.options.attackKey.setPressed(true);
                }
                if (minecraftClient.options.useKey != null && !minecraftClient.options.useKey.isPressed() && lIIllllI.IIllIII(minecraftClient, minecraftClient.options.useKey)) {
                    minecraftClient.options.useKey.setPressed(true);
                }
            }
        }
    }

    @Unique
    private void IlI(MinecraftClient minecraftClient) {
        if (!this.l) {
            return;
        }
        if (minecraftClient != null) {
            minecraftClient.crosshairTarget = this.I;
        }
        this.I = null;
        this.l = false;
    }

    @Unique
    private EntityHitResult Ill(MinecraftClient minecraftClient, ClientEntrypoint clientEntrypoint) {
        if (minecraftClient == null || clientEntrypoint == null || clientEntrypoint.IlI() == null) {
            return null;
        }
        return null;
    }
}

