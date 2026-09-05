/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.lIlIIlll
 * Mixin target   : ClientPlayerEntity
 *
 * Recovered strings in this class:
 *   - canStartSprinting
 *   - tickMovement
 *   - INVOKE
 *   - TAIL
 *   - tick
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
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.util.PlayerInput
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.At$Shift
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.core.ClientEntrypoint;
import orchard.internal.IIIIlII;
import orchard.internal.IIlI;
import orchard.internal.IlIIllI;
import orchard.internal.IlIlllI;
import orchard.internal.lIIIllll;
import orchard.internal.lIIllllI;
import orchard.internal.lIllIIlI;
import orchard.internal.lIllll;
import orchard.module.combat.AutoTotem;
import orchard.module.movement.JumpReset;
import orchard.module.movement.MoveFix;
import orchard.module.movement.Parkour;
import orchard.module.movement.PerfectWindcharge;
import orchard.module.movement.Speed;
import orchard.module.movement.Sprint;
import orchard.module.movement.SprintReset2;
import orchard.module.player.LegitScaffold;
import orchard.module.render.Freecam;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={ClientPlayerEntity.class})
public abstract class ClientPlayerEntityMixin {
    @Unique
    private boolean I;
    @Unique
    private boolean l;
    @Unique
    private boolean II;
    @Unique
    private float Il;
    @Unique
    private boolean lI;
    @Unique
    private boolean ll;
    @Unique
    private boolean III;
    @Unique
    private boolean IIl;
    @Unique
    private boolean IlI;
    @Unique
    private boolean Ill;
    @Shadow
    public Input input;
    @Unique
    private boolean lII;
    @Unique
    private boolean lIl;
    @Unique
    private boolean llI;
    @Unique
    private float lll;
    @Unique
    private boolean IIII;
    @Unique
    private boolean IIIl;
    @Unique
    private boolean IIlI;
    @Unique
    private boolean IIll;
    @Unique
    private boolean IlII;
    @Unique
    private boolean IlIl;
    @Unique
    private boolean IllI;
    @Unique
    private boolean Illl;
    @Unique
    private boolean lIII;
    @Unique
    private boolean lIIl;

    @Unique
    private void I(ClientEntrypoint clientEntrypoint, MinecraftClient minecraftClient, KeyBinding keyBinding) {
        IIIIlII iIIIlII = IIIIlII.IlI();
        if (iIIIlII != null) {
            iIIIlII.ll(this, minecraftClient, keyBinding);
        } else {
            keyBinding.setPressed(this.lI(minecraftClient, keyBinding));
        }
    }

    @Inject(method={"tickMovement"}, at={@At(value="TAIL")}, require=0)
    private void l(CallbackInfo callbackInfo) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.IIlI(minecraftClient);
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = (ClientPlayerEntity)this;
        if (minecraftClient.player == null) {
            return;
        }
        Parkour parkour = clientEntrypoint.IlI().IIIllII();
        if (parkour != null && parkour.IlI() && !clientPlayerEntity.isOnGround()) {
            Vec3d vec3d = clientPlayerEntity.getVelocity();
            double d = Math.sqrt(vec3d.x * vec3d.x + vec3d.z * vec3d.z);
            if (d > 0.001) {
                float f = parkour.lll();
                float f2 = (float)Math.toDegrees(Math.atan2(-vec3d.x, vec3d.z));
                float f3 = MathHelper.wrapDegrees((float)(f - f2));
                Vec3d vec3d2 = new Vec3d(vec3d.x, 0.0, vec3d.z).rotateY(-((float)Math.toRadians(f3)));
                clientPlayerEntity.setVelocity(vec3d2.x, vec3d.y, vec3d2.z);
            }
        }
        lIIllllI.IIlIIll(minecraftClient, clientPlayerEntity.getYaw());
    }

    @Unique
    private void II(ClientEntrypoint clientEntrypoint, MinecraftClient minecraftClient, KeyBinding keyBinding, boolean bl) {
        IIIIlII iIIIlII;
        if (minecraftClient.options != null) {
            if (keyBinding == minecraftClient.options.forwardKey) {
                this.lIl = true;
            } else if (keyBinding == minecraftClient.options.backKey) {
                this.IIl = true;
            } else if (keyBinding == minecraftClient.options.leftKey) {
                this.lIII = true;
            } else if (keyBinding == minecraftClient.options.rightKey) {
                this.IlI = true;
            } else if (keyBinding == minecraftClient.options.sprintKey) {
                this.Illl = true;
            } else if (keyBinding == minecraftClient.options.sneakKey) {
                this.IlIl = true;
            } else if (keyBinding == minecraftClient.options.jumpKey) {
                this.IIIl = true;
            }
        }
        if ((iIIIlII = IIIIlII.IlI()) != null) {
            iIIIlII.Il(this, minecraftClient, keyBinding, bl);
        } else {
            keyBinding.setPressed(bl);
        }
    }

    @Unique
    private void Il(MinecraftClient minecraftClient, float f, float f2) {
        if (minecraftClient == null || minecraftClient.options == null) {
            return;
        }
        this.lll = f;
        this.Il = f2;
        this.IllI = true;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        this.II(clientEntrypoint, minecraftClient, minecraftClient.options.forwardKey, f > 0.0f);
        this.II(clientEntrypoint, minecraftClient, minecraftClient.options.backKey, f < 0.0f);
        this.II(clientEntrypoint, minecraftClient, minecraftClient.options.leftKey, f2 > 0.0f);
        this.II(clientEntrypoint, minecraftClient, minecraftClient.options.rightKey, f2 < 0.0f);
        this.ll = true;
    }

    @Unique
    private boolean lI(MinecraftClient minecraftClient, KeyBinding keyBinding) {
        return keyBinding != null && lIIllllI.IIllIII(minecraftClient, keyBinding);
    }

    @Unique
    private void ll(MinecraftClient minecraftClient) {
        if (minecraftClient == null || minecraftClient.options == null) {
            return;
        }
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        this.I(clientEntrypoint, minecraftClient, minecraftClient.options.forwardKey);
        this.I(clientEntrypoint, minecraftClient, minecraftClient.options.backKey);
        this.I(clientEntrypoint, minecraftClient, minecraftClient.options.leftKey);
        this.I(clientEntrypoint, minecraftClient, minecraftClient.options.rightKey);
        this.I(clientEntrypoint, minecraftClient, minecraftClient.options.sprintKey);
        this.I(clientEntrypoint, minecraftClient, minecraftClient.options.sneakKey);
        this.I(clientEntrypoint, minecraftClient, minecraftClient.options.jumpKey);
    }

    @Unique
    private void III(MinecraftClient minecraftClient, float f) {
        float f2 = ((ClientPlayerEntity)this).getYaw();
        lIIIllll lIIIllll2 = IlIIllI.I(this.IIII, this.III, this.l, this.IIlI, f2, f);
        if (lIIIllll2.l() == 0.0f && lIIIllll2.I() == 0.0f) {
            return;
        }
        this.Il(minecraftClient, lIIIllll2.l(), lIIIllll2.I());
    }

    @Unique
    private boolean IIl(MinecraftClient minecraftClient, KeyBinding keyBinding) {
        IIIIlII iIIIlII = IIIIlII.IlI();
        return iIIIlII == null ? this.lI(minecraftClient, keyBinding) : iIIIlII.lIl(minecraftClient, keyBinding);
    }

    private void IlI(MinecraftClient minecraftClient, double d) {
        float f;
        if (minecraftClient == null || minecraftClient.options == null || d >= 0.999) {
            return;
        }
        float f2 = (this.IIII ? 1.0f : 0.0f) - (this.III ? 1.0f : 0.0f);
        float f3 = MathHelper.sqrt((float)(f2 * f2 + (f = (this.l ? 1.0f : 0.0f) - (this.IIlI ? 1.0f : 0.0f)) * f));
        if (f3 <= 1.0E-4f) {
            return;
        }
        if (f3 > 1.0f) {
            f2 /= f3;
            f /= f3;
        }
        float f4 = (float)d;
        this.lll = f2 * f4;
        this.Il = f * f4;
        this.IllI = true;
    }

    @Inject(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_746;method_3136()V")}, require=0)
    private void Ill(CallbackInfo callbackInfo) {
        AutoTotem autoTotem;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        lIIllllI.IlIIl(minecraftClient);
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null && (autoTotem = clientEntrypoint.IlI().IIlIlII()) != null) {
            autoTotem.lll(minecraftClient);
        }
        IlIlllI.llIIl(minecraftClient);
    }

    @Unique
    private void lII(MinecraftClient minecraftClient, float f) {
        float f2 = ((ClientPlayerEntity)this).getYaw();
        lIIIllll lIIIllll2 = IlIIllI.I(this.IIII, this.III, this.l, this.IIlI, f2 + f, f2);
        if (lIIIllll2.l() == 0.0f && lIIIllll2.I() == 0.0f) {
            return;
        }
        this.Il(minecraftClient, lIIIllll2.l(), lIIIllll2.I());
    }

    @Inject(method={"tickMovement"}, at={@At(value="HEAD")}, require=0)
    private void lIl(CallbackInfo callbackInfo) {
        boolean bl;
        MoveFix moveFix;
        LegitScaffold legitScaffold;
        boolean bl2;
        Speed speed;
        PerfectWindcharge perfectWindcharge;
        Parkour parkour;
        JumpReset jumpReset;
        Sprint sprint;
        boolean bl3;
        lIllIIlI lIllIIlI2;
        Screen screen;
        this.llI = false;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.options == null) {
            return;
        }
        if (orchard.internal.IIlI.llIl(minecraftClient)) {
            this.ll(minecraftClient);
        }
        boolean bl4 = (screen = minecraftClient.currentScreen) instanceof lIllIIlI && (lIllIIlI2 = (lIllIIlI)screen).IIIIIII();
        boolean bl5 = bl3 = minecraftClient.currentScreen != null && !bl4;
        if (this.II && !bl3) {
            this.IIII(minecraftClient);
        }
        this.II = bl3;
        if (bl3) {
            this.Illl(minecraftClient);
            return;
        }
        if (bl4 && !orchard.internal.IIlI.lIl(minecraftClient)) {
            this.IIII(minecraftClient);
        }
        this.ll = false;
        this.lIIl = false;
        this.IllI = false;
        this.lll = 0.0f;
        this.Il = 0.0f;
        this.lIl = false;
        this.IIl = false;
        this.lIII = false;
        this.IlI = false;
        this.Illl = false;
        this.IlIl = false;
        this.IIIl = false;
        screen = clientEntrypoint.IlI() != null ? clientEntrypoint.IlI().IIIIIII() : null;
        boolean bl6 = screen != null && screen.lll();
        boolean bl7 = this.IIII = !bl6 && this.IIl(minecraftClient, minecraftClient.options.forwardKey);
        this.III = bl6 ? screen.IIlI() == lIllll.Il || this.IIl(minecraftClient, minecraftClient.options.backKey) : this.IIl(minecraftClient, minecraftClient.options.backKey);
        this.l = this.IIl(minecraftClient, minecraftClient.options.leftKey);
        this.IIlI = this.IIl(minecraftClient, minecraftClient.options.rightKey);
        this.lII = !bl6 && this.IIl(minecraftClient, minecraftClient.options.sprintKey);
        this.Ill = this.IIl(minecraftClient, minecraftClient.options.sneakKey);
        this.IIll = this.IIl(minecraftClient, minecraftClient.options.jumpKey);
        Freecam freecam = clientEntrypoint.IlI().IlIllI();
        if (freecam != null && freecam.IIIlIIl()) {
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.forwardKey, false);
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.backKey, false);
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.leftKey, false);
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.rightKey, false);
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.sprintKey, false);
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.sneakKey, false);
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.jumpKey, false);
            if (this.input != null) {
                lIIllllI.lIII(this.input, 0.0f, 0.0f);
            }
            this.ll = true;
        }
        if ((sprint = clientEntrypoint.IlI().lII()) != null && sprint.lI()) {
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.sprintKey, true);
            this.ll = true;
        }
        if ((jumpReset = clientEntrypoint.IlI().IIIIlll()) != null) {
            jumpReset.lII(minecraftClient, jumpReset.lI(minecraftClient));
        }
        if ((parkour = clientEntrypoint.IlI().IIIllII()) != null && parkour.lIl(minecraftClient)) {
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.jumpKey, true);
            this.ll = true;
        }
        if (parkour != null && parkour.lII(minecraftClient)) {
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.sprintKey, true);
            this.ll = true;
        }
        if ((perfectWindcharge = clientEntrypoint.IlI().lIIlIl()) != null && perfectWindcharge.lII(minecraftClient)) {
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.jumpKey, true);
            this.ll = true;
        }
        if ((speed = clientEntrypoint.IlI().IIlIIIl()) != null && speed.IIIlIIl()) {
            if (speed.lI(minecraftClient)) {
                this.II(clientEntrypoint, minecraftClient, minecraftClient.options.sprintKey, true);
                this.ll = true;
            }
            if (speed.IllI(minecraftClient)) {
                this.II(clientEntrypoint, minecraftClient, minecraftClient.options.jumpKey, true);
                this.ll = true;
            }
        }
        boolean bl8 = bl2 = (legitScaffold = clientEntrypoint.IlI().llIlI()) != null && legitScaffold.IlI(minecraftClient);
        if (bl2) {
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.sneakKey, true);
            this.IlI(minecraftClient, legitScaffold.llI(minecraftClient));
            this.ll = true;
        }
        if (legitScaffold != null && legitScaffold.I(minecraftClient)) {
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.sprintKey, false);
            this.ll = true;
        }
        boolean bl9 = (moveFix = clientEntrypoint.IlI().lIIlll()) != null && moveFix.lII();
        boolean bl10 = moveFix != null && moveFix.IIII();
        boolean bl11 = IlIlllI.Illll();
        boolean bl12 = bl = (bl9 || bl11) && IlIlllI.lIlII(minecraftClient);
        if (!bl6 && !this.IllI && bl && (bl10 || bl11)) {
            this.llI(minecraftClient);
            this.III(minecraftClient, IlIlllI.IIIlII());
        }
        float f = IlIlllI.IIIll(minecraftClient);
        if (!bl6 && !this.IllI && Float.isFinite(f)) {
            this.llI(minecraftClient);
            this.lII(minecraftClient, f);
        }
        if (orchard.internal.IIlI.lIIl(minecraftClient)) {
            this.IIII = this.lI(minecraftClient, minecraftClient.options.forwardKey);
            this.III = this.lI(minecraftClient, minecraftClient.options.backKey);
            this.l = this.lI(minecraftClient, minecraftClient.options.leftKey);
            this.IIlI = this.lI(minecraftClient, minecraftClient.options.rightKey);
            this.lII = this.lI(minecraftClient, minecraftClient.options.sprintKey);
            this.Ill = this.lI(minecraftClient, minecraftClient.options.sneakKey);
            this.IIll = this.lI(minecraftClient, minecraftClient.options.jumpKey);
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.forwardKey, false);
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.backKey, false);
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.leftKey, false);
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.rightKey, false);
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.sprintKey, false);
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.sneakKey, false);
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.jumpKey, false);
            if (this.input != null) {
                lIIllllI.lIII(this.input, 0.0f, 0.0f);
            }
            this.ll = true;
        }
        orchard.internal.IIlI.lI(minecraftClient);
        AutoTotem autoTotem = clientEntrypoint.IlI().IIlIlII();
        if (autoTotem != null && autoTotem.lIl(minecraftClient)) {
            orchard.internal.IIlI.Illl(minecraftClient);
        }
        if (orchard.internal.IIlI.IIlI(minecraftClient)) {
            this.IlII = this.lI(minecraftClient, minecraftClient.options.attackKey);
            this.lI = this.lI(minecraftClient, minecraftClient.options.useKey);
            minecraftClient.options.attackKey.setPressed(false);
            minecraftClient.options.useKey.setPressed(false);
            this.I = true;
            this.ll = true;
        }
        boolean bl13 = this.llI = clientEntrypoint.IlI().llIIIl() != null && clientEntrypoint.IlI().llIIIl().IIlIII(minecraftClient) || clientEntrypoint.IlI().IlIIIII() != null && clientEntrypoint.IlI().IlIIIII().llIlI(minecraftClient);
        if (this.llI) {
            this.II(clientEntrypoint, minecraftClient, minecraftClient.options.sprintKey, false);
            this.ll = true;
        }
    }

    @Unique
    private void llI(MinecraftClient minecraftClient) {
        if (minecraftClient == null || minecraftClient.options == null) {
            return;
        }
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        SprintReset2 sprintReset2 = clientEntrypoint != null && clientEntrypoint.IlI() != null ? clientEntrypoint.IlI().IIIIIII() : null;
        boolean bl = sprintReset2 != null && sprintReset2.lll();
        boolean bl2 = this.IIII = !bl && this.IIl(minecraftClient, minecraftClient.options.forwardKey);
        this.III = bl ? sprintReset2.IIlI() == lIllll.Il || this.IIl(minecraftClient, minecraftClient.options.backKey) : this.IIl(minecraftClient, minecraftClient.options.backKey);
        this.l = this.IIl(minecraftClient, minecraftClient.options.leftKey);
        this.IIlI = this.IIl(minecraftClient, minecraftClient.options.rightKey);
    }

    @Inject(method={"canStartSprinting"}, at={@At(value="HEAD")}, cancellable=true)
    private void lll(CallbackInfoReturnable<Boolean> callbackInfoReturnable) {
        if (ClientEntrypoint.lII() != null && this.llI) {
            callbackInfoReturnable.setReturnValue((Object)false);
        }
    }

    @Unique
    private void IIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null || minecraftClient.options == null) {
            return;
        }
        this.IIll(minecraftClient, minecraftClient.options.forwardKey);
        this.IIll(minecraftClient, minecraftClient.options.backKey);
        this.IIll(minecraftClient, minecraftClient.options.leftKey);
        this.IIll(minecraftClient, minecraftClient.options.rightKey);
        this.IIll(minecraftClient, minecraftClient.options.sprintKey);
        this.IIll(minecraftClient, minecraftClient.options.sneakKey);
        this.IIll(minecraftClient, minecraftClient.options.jumpKey);
    }

    @Inject(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_746;method_3136()V", shift=At.Shift.AFTER)}, require=0)
    private void IIIl(CallbackInfo callbackInfo) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        lIIllllI.IIlIlll();
        IlIlllI.lIIIl(minecraftClient);
        orchard.internal.IIlI.lII(minecraftClient);
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        clientEntrypoint.IlI().llI(minecraftClient);
    }

    @Unique
    private void IIlI(MinecraftClient minecraftClient) {
        ClientEntrypoint clientEntrypoint;
        if (minecraftClient == null || minecraftClient.options == null || !this.ll && !this.IllI) {
            return;
        }
        if (this.IllI && this.input != null) {
            lIIllllI.lIII(this.input, this.lll, this.Il);
        }
        SprintReset2 sprintReset2 = (clientEntrypoint = ClientEntrypoint.lII()) != null && clientEntrypoint.IlI() != null ? clientEntrypoint.IlI().IIIIIII() : null;
        boolean bl = sprintReset2 != null && sprintReset2.lll();
        boolean bl2 = this.ll;
        if (bl2) {
            if (!orchard.internal.IIlI.lIl(minecraftClient)) {
                if (this.lIl && !bl) {
                    this.I(clientEntrypoint, minecraftClient, minecraftClient.options.forwardKey);
                }
                if (this.IIl && !bl) {
                    this.I(clientEntrypoint, minecraftClient, minecraftClient.options.backKey);
                }
                if (this.lIII) {
                    this.I(clientEntrypoint, minecraftClient, minecraftClient.options.leftKey);
                }
                if (this.IlI) {
                    this.I(clientEntrypoint, minecraftClient, minecraftClient.options.rightKey);
                }
                if (this.Illl && !bl) {
                    this.I(clientEntrypoint, minecraftClient, minecraftClient.options.sprintKey);
                }
                if (this.IlIl) {
                    this.I(clientEntrypoint, minecraftClient, minecraftClient.options.sneakKey);
                }
            }
            if (this.IIIl) {
                this.I(clientEntrypoint, minecraftClient, minecraftClient.options.jumpKey);
            }
        }
        if (this.I) {
            minecraftClient.options.attackKey.setPressed(this.IlII);
            minecraftClient.options.useKey.setPressed(this.lI);
            this.I = false;
        }
        if (clientEntrypoint != null && bl2 && !orchard.internal.IIlI.lIl(minecraftClient) && !bl) {
            this.IlII(minecraftClient, clientEntrypoint);
        }
        this.ll = false;
        this.IllI = false;
    }

    @Unique
    private void IIll(MinecraftClient minecraftClient, KeyBinding keyBinding) {
        if (keyBinding == null) {
            return;
        }
        boolean bl = this.lI(minecraftClient, keyBinding);
        keyBinding.setPressed(bl);
        InputUtil.Key key = lIIllllI.IlllllI(keyBinding);
        if (!lIIllllI.IlIIlll(key)) {
            KeyBinding.setKeyPressed((InputUtil.Key)key, (boolean)bl);
        }
    }

    @Unique
    private void IlII(MinecraftClient minecraftClient, ClientEntrypoint clientEntrypoint) {
        boolean bl;
        if (this.llI) {
            return;
        }
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.options == null || clientEntrypoint == null) {
            return;
        }
        if (clientEntrypoint.IlI() != null && clientEntrypoint.IlI().IIIIIII() != null && clientEntrypoint.IlI().IIIIIII().lll()) {
            return;
        }
        if (minecraftClient.player.isSprinting() || !minecraftClient.player.isAlive() || minecraftClient.player.isSneaking() || minecraftClient.player.isUsingItem()) {
            return;
        }
        Parkour parkour = clientEntrypoint.IlI().IIIllII();
        boolean bl2 = parkour != null && parkour.lII(minecraftClient);
        Sprint sprint = clientEntrypoint.IlI().lII();
        boolean bl3 = sprint != null && sprint.lI();
        Speed speed = clientEntrypoint.IlI().IIlIIIl();
        boolean bl4 = speed != null && speed.lI(minecraftClient);
        boolean bl5 = bl = this.lII || minecraftClient.options.sprintKey.isPressed() || lIIllllI.IIllIII(minecraftClient, minecraftClient.options.sprintKey);
        if (!(bl2 || bl3 || bl4 || bl)) {
            return;
        }
        if (!(bl2 || minecraftClient.options.forwardKey.isPressed() && !minecraftClient.options.backKey.isPressed())) {
            return;
        }
        minecraftClient.player.setSprinting(true);
    }

    @Unique
    private void IlIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null || minecraftClient.options == null) {
            return;
        }
        this.IIII = this.lI(minecraftClient, minecraftClient.options.forwardKey);
        this.III = this.lI(minecraftClient, minecraftClient.options.backKey);
        this.l = this.lI(minecraftClient, minecraftClient.options.leftKey);
        this.IIlI = this.lI(minecraftClient, minecraftClient.options.rightKey);
    }

    @Inject(method={"tickMovement"}, at={@At(value="INVOKE", target="Lnet/minecraft/class_1156;method_4909(Lnet/minecraft/class_744;)V")}, require=0)
    private void IllI(CallbackInfo callbackInfo) {
        lIllIIlI lIllIIlI2;
        boolean bl;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.options == null) {
            return;
        }
        Screen screen = minecraftClient.currentScreen;
        boolean bl2 = bl = screen instanceof lIllIIlI && (lIllIIlI2 = (lIllIIlI)screen).IIIIIII();
        if (minecraftClient.currentScreen != null && !bl) {
            this.Illl(minecraftClient);
            return;
        }
        this.IIlI(minecraftClient);
        if (this.llI && minecraftClient.player != null) {
            if (this.input != null) {
                lIllIIlI2 = this.input.playerInput;
                this.input.playerInput = new PlayerInput(lIllIIlI2.forward(), lIllIIlI2.backward(), lIllIIlI2.left(), lIllIIlI2.right(), lIllIIlI2.jump(), lIllIIlI2.sneak(), false);
            }
            minecraftClient.player.setSprinting(false);
        }
    }

    @Unique
    private void Illl(MinecraftClient minecraftClient) {
        if (minecraftClient == null || minecraftClient.options == null) {
            return;
        }
        minecraftClient.options.forwardKey.setPressed(false);
        minecraftClient.options.backKey.setPressed(false);
        minecraftClient.options.leftKey.setPressed(false);
        minecraftClient.options.rightKey.setPressed(false);
        minecraftClient.options.sprintKey.setPressed(false);
        minecraftClient.options.sneakKey.setPressed(false);
        minecraftClient.options.jumpKey.setPressed(false);
        if (this.input != null) {
            this.input.playerInput = new PlayerInput(false, false, false, false, false, false, false);
            lIIllllI.lIII(this.input, 0.0f, 0.0f);
        }
    }

    @Inject(method={"tickMovement"}, at={@At(value="TAIL")}, require=0)
    private void lIII(CallbackInfo callbackInfo) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        IlIlllI.IIIIlI(minecraftClient);
    }
}

