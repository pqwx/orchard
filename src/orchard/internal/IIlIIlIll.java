/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIlIll
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
 *  net.minecraft.util.math.Vec3d
 */
package orchard.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.Vec3d;
import orchard.internal.IllIll;
import orchard.internal.llIIllll;

@Environment(value=EnvType.CLIENT)
class IIlIIlIll
extends LinkedHashMap<IllIll, Vec3d> {
    final /* synthetic */ llIIllll I;
    private static final int[] l;

    IIlIIlIll(llIIllll llIIllll2, int n, float f, boolean bl) {
        this.I = llIIllll2;
        super(n, f, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected boolean removeEldestEntry(Map.Entry<IllIll, Vec3d> entry) {
        if (this.size() <= 32) return false;
        return true;
    }

    private static int I(int n, int n2) {
        return l[n ^ 0x23E02ED0] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 464016279;
        byte[] byArray = "\u00ea6h\u00f7".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        l = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IIlIIlIll.l[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

