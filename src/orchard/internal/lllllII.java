/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllllII
 * Purpose not identified - name is the original obfuscated one.
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
 *  net.minecraft.util.math.MathHelper
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.MathHelper;

@Environment(value=EnvType.CLIENT)
public final class lllllII {
    private float I;
    private boolean l;
    private float II;
    private float Il;
    private float lI;
    private boolean ll;

    /*
     * Enabled aggressive block sorting
     */
    private void I(MinecraftClient minecraftClient, boolean bl) {
        block1: {
            block2: {
                block0: {
                    if (!this.ll) return;
                    if (!bl) break block0;
                    if (minecraftClient == null || minecraftClient.player == null) break block1;
                    break block2;
                }
                return;
            }
            minecraftClient.player.setYaw(this.I);
            minecraftClient.player.setPitch(lllllII.ll(this.Il));
        }
        this.ll = false;
    }

    public void l(MinecraftClient minecraftClient, boolean bl) {
        this.IlI(minecraftClient, bl, true);
    }

    public boolean II() {
        return this.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void Il(float f, float f2, float f3, float f4) {
        if (this.l || this.ll) {
            this.lI = this.I;
            this.II = this.Il;
            this.I = MathHelper.wrapDegrees((float)(this.I + MathHelper.wrapDegrees((float)(f3 - f))));
            this.Il = lllllII.ll(this.Il + f4 - f2);
            return;
        }
    }

    public float lI(float f) {
        return MathHelper.lerp((float)f, (float)this.II, (float)this.Il);
    }

    private static float ll(float f) {
        return MathHelper.clamp((float)f, (float)-90.0f, (float)90.0f);
    }

    public float III(float f) {
        return MathHelper.lerpAngleDegrees((float)f, (float)this.lI, (float)this.I);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIl() {
        if (this.l) return true;
        if (!this.ll) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IlI(MinecraftClient minecraftClient, boolean bl, boolean bl2) {
        if (bl) {
            if (this.l) return;
            if (minecraftClient == null) return;
            if (minecraftClient.player == null) return;
            this.l = true;
            this.ll = false;
            this.I = minecraftClient.player.getYaw();
            this.Il = lllllII.ll(minecraftClient.player.getPitch());
            this.lI = this.I;
            this.II = this.Il;
            return;
        }
        if (!this.l) {
            this.I(minecraftClient, bl2);
            return;
        }
        this.l = false;
        if (bl2 && minecraftClient != null && minecraftClient.player != null) {
            this.ll = false;
            minecraftClient.player.setYaw(this.I);
            minecraftClient.player.setPitch(lllllII.ll(this.Il));
            return;
        }
        this.ll = true;
    }
}

