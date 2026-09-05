/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIlIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
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
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import orchard.core.ClientEntrypoint;
import orchard.internal.IIIIlIl;
import orchard.internal.IIllIIIIl;
import orchard.internal.IllIIlI;
import orchard.internal.IllIllI;
import orchard.internal.lIIllllI;

@Environment(value=EnvType.CLIENT)
final class lIIlIlll
implements IllIIlI {
    private final MinecraftClient I;
    private static final int[] l;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void I(IllIllI illIllI, int n) {
        switch (illIllI) {
            case Il: {
                lIIllllI.IIIIIII(this.I, n, true);
                break;
            }
            case l: {
                lIIllllI.IlIlIII(this.I, n);
                lIIllllI.IIIIIII(this.I, n, false);
                break;
            }
            case II: {
                int n2 = IIIIlIl.Ill();
                if (n2 != n && (n2 >= 0 || this.Il() != n)) {
                    IIIIlIl.lI(n);
                    ++lIIllllI.lIIll;
                    try {
                        this.I.getNetworkHandler().sendPacket((Packet)new UpdateSelectedSlotC2SPacket(n));
                    }
                    finally {
                        lIIllllI.lIIll = Math.max(0, lIIllllI.lIIll - 1);
                    }
                } else {
                    IIIIlIl.lI(n);
                }
                ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
                if (!lIIllllI.llllI() || clientEntrypoint == null || clientEntrypoint.IlI() == null || clientEntrypoint.IlI().IIIlII() == null || !clientEntrypoint.IlI().IIIlII().IIIlIIl()) break;
                clientEntrypoint.IlI().IIIlII().IlI(n);
            }
        }
    }

    @Override
    public int l() {
        return IIllIIIIl.llI(this.I.player.getInventory());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int II() {
        if (this.I == null) return 0;
        if (this.I.player == null) {
            return 0;
        }
        int n = this.I.player.age;
        return n;
    }

    private lIIlIlll(MinecraftClient minecraftClient) {
        this.I = minecraftClient;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public int Il() {
        int n;
        block3: {
            block2: {
                if (lIIllllI.lIllI < 0) break block2;
                if (lIIllllI.lIllI < 9) break block3;
            }
            n = this.l();
            return n;
        }
        n = lIIllllI.lIllI;
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean lI(IllIllI illIllI, int n) {
        if (illIllI == IllIllI.II) {
            if (this.Il() == n) return true;
            if (IIIIlIl.Ill() == n) return true;
            if (IIIIlIl.Ill() == n) return false;
            this.I(illIllI, n);
            return false;
        }
        if (this.l() != n) return false;
        return true;
    }

    private static int ll(int n, int n2) {
        return l[n ^ 0xC8764C0] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 1806584612;
        byte[] byArray = ";\u00a7\u008a\u00c1".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        l = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            lIIlIlll.l[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

