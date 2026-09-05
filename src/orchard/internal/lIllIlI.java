/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllIlI
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
import orchard.module.render.NickSwitcher;

@Environment(value=EnvType.CLIENT)
class lIllIlI
extends LinkedHashMap<String, String> {
    final /* synthetic */ NickSwitcher I;
    private static final int[] l;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<String, String> entry) {
        if (this.size() <= 512) return false;
        return true;
    }

    lIllIlI(NickSwitcher nickSwitcher, int n, float f, boolean bl) {
        this.I = nickSwitcher;
        super(n, f, bl);
    }

    private static int I(int n, int n2) {
        return l[n ^ 0x2E9FD113] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1647845816;
        byte[] byArray = "Dr\u00e7#".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        l = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            lIllIlI.l[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

