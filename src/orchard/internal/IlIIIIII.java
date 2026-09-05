/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIIII
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
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import orchard.internal.lIIllllI;
import orchard.internal.lllIlIII;

@Environment(value=EnvType.CLIENT)
public final class IlIIIIII {
    private static long I;
    private static double l;
    private static final long II = 250L;
    private static double Il;
    private static boolean lI;
    private static boolean ll;
    private static double III;
    private static double IIl;

    /*
     * Enabled aggressive block sorting
     */
    public static void I(int n, int n2, int n3, int n4) {
        if (!lI) {
            return;
        }
        int n5 = Math.min(n, n3);
        int n6 = Math.max(n, n3);
        int n7 = Math.min(n2, n4);
        int n8 = Math.max(n2, n4);
        if (n6 <= n5) return;
        if (n8 > n7) {
            III = Math.min(III, (double)n5);
            Il = Math.min(Il, (double)n7);
            l = Math.max(l, (double)n6);
            IIl = Math.max(IIl, (double)n8);
            ll = true;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean l(MinecraftClient minecraftClient, lllIlIII lllIlIII2) {
        if (!IlIIIIII.lI(minecraftClient)) return false;
        if (lllIlIII2 == null) {
            return false;
        }
        double d = 2.0;
        double d2 = lllIlIII2.IlII();
        double d3 = lllIlIII2.IlIl();
        double d4 = d2 + lllIlIII2.III();
        double d5 = d3 + lllIlIII2.IIll();
        if (!(d4 > III - d)) return false;
        if (!(d2 < l + d)) return false;
        if (!(d5 > Il - d)) return false;
        if (!(d3 < IIl + d)) return false;
        return true;
    }

    private IlIIIIII() {
    }

    public static void II() {
        lI = true;
        ll = false;
        III = Double.POSITIVE_INFINITY;
        Il = Double.POSITIVE_INFINITY;
        l = Double.NEGATIVE_INFINITY;
        IIl = Double.NEGATIVE_INFINITY;
    }

    public static void Il() {
        lI = false;
        if (ll) {
            I = System.currentTimeMillis();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lI(MinecraftClient minecraftClient) {
        if (!ll) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.playerListKey == null) {
            return false;
        }
        if (System.currentTimeMillis() - I > 250L) {
            return false;
        }
        if (minecraftClient.options.playerListKey.isPressed()) return true;
        if (lIIllllI.IIllIII(minecraftClient, minecraftClient.options.playerListKey)) return true;
        return false;
    }
}

