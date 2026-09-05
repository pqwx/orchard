/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IlIIII
 * Mixin target   : Entity
 *
 * Recovered strings in this class:
 *   - changeLookDirection
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
 *  net.minecraft.entity.Entity
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import orchard.core.ClientEntrypoint;
import orchard.internal.Ill;
import orchard.internal.lIIlllIl;
import orchard.module.combat.AimAssist;
import orchard.module.render.Freecam;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={Entity.class})
public abstract class EntityMixin3 {
    @Unique
    private static final int I = 2;
    @Unique
    private int l;
    @Unique
    private static final int II = 0;
    @Unique
    private float Il;
    @Unique
    private float lI;
    @Unique
    private static final int ll = 1;
    @Unique
    private Ill III = Ill.I;
    @Unique
    private static final int IIl = 3;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Inject(method={"changeLookDirection"}, at={@At(value="TAIL")})
    private void I(double d, double d2, CallbackInfo callbackInfo) {
        if (this.l == 0) {
            return;
        }
        Entity entity = (Entity)this;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        try {
            if (entity != minecraftClient.player) {
                return;
            }
            float f = entity.getYaw();
            float f2 = entity.getPitch();
            if (clientEntrypoint != null && this.l == 1) {
                Freecam freecam = clientEntrypoint.IlI().IlIllI();
                if (freecam != null) {
                    freecam.IlI(this.lI, this.Il, f, f2);
                }
            } else if (clientEntrypoint != null && this.l == 2) {
                AimAssist aimAssist = clientEntrypoint.IlI().IllIII();
                if (aimAssist != null) {
                    aimAssist.IIlllI(this.lI, this.Il, f, f2);
                }
            } else if (this.l == 3) {
                lIIlllIl.l(this.III, this.lI, this.Il, f, f2);
            }
        }
        finally {
            if (entity == minecraftClient.player) {
                entity.setYaw(this.lI);
                entity.setPitch(this.Il);
            }
            this.l = 0;
            this.III = Ill.I;
        }
    }

    @Inject(method={"changeLookDirection"}, at={@At(value="HEAD")})
    private void l(double d, double d2, CallbackInfo callbackInfo) {
        this.l = 0;
        this.III = Ill.I;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        Entity entity = (Entity)this;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (clientEntrypoint == null || entity != minecraftClient.player) {
            return;
        }
        Freecam freecam = clientEntrypoint.IlI().IlIllI();
        AimAssist aimAssist = clientEntrypoint.IlI().IllIII();
        Ill ill = lIIlllIl.II();
        if (freecam != null && freecam.IIIlIIl()) {
            this.l = 1;
        } else if (aimAssist != null && aimAssist.lIlllI()) {
            this.l = 2;
        } else if (ill != Ill.I) {
            this.l = 3;
            this.III = ill;
        } else {
            return;
        }
        this.lI = entity.getYaw();
        this.Il = entity.getPitch();
    }
}

