/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIIlII
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
 */
package orchard.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.llIllIll;
import orchard.net.SpotifyBridge;

@Environment(value=EnvType.CLIENT)
class IIlIIIlII
extends LinkedHashMap<String, llIllIll> {
    final /* synthetic */ SpotifyBridge I;
    private static final int[] l;

    IIlIIIlII(SpotifyBridge spotifyBridge, int n, float f, boolean bl) {
        this.I = spotifyBridge;
        super(n, f, bl);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<String, llIllIll> entry) {
        return this.size() > 32;
    }

    private static int I(int n, int n2) {
        return l[n ^ 0xBA002790] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 1944458504;
        byte[] byArray = "-u\u0004{".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        l = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IIlIIIlII.l[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

