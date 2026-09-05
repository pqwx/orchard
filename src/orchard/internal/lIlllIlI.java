/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlllIlI
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
 *  net.minecraft.network.packet.Packet
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.network.packet.Packet;

@Environment(value=EnvType.CLIENT)
final class lIlllIlI {
    private final Packet<?> I;

    private lIlllIlI(Packet<?> packet) {
        this.I = packet;
    }

    public int hashCode() {
        return System.identityHashCode(this.I);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (!(object instanceof lIlllIlI)) return false;
        lIlllIlI lIlllIlI2 = (lIlllIlI)object;
        if (this.I != lIlllIlI2.I) return false;
        return true;
    }
}

