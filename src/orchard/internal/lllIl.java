/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIl
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
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket$Handler
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.Vec3d
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Vec3d;
import orchard.internal.lIIllllI;

@Environment(value=EnvType.CLIENT)
class lllIl
implements PlayerInteractEntityC2SPacket.Handler {
    public void interact(Hand hand) {
    }

    public void interactAt(Hand hand, Vec3d vec3d) {
    }

    lllIl() {
    }

    public void attack() {
        lIIllllI.IIIlIll();
    }
}

