/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlllIIl
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

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.Category;

@Environment(value=EnvType.CLIENT)
class IIIlllIIl {
    static final /* synthetic */ int[] I;
    private static final int[] l;

    static {
        int n = 1705720092;
        byte[] byArray = "\u0006\u00b0\u0082\u00c4".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        l = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IIIlllIIl.l[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
        I = new int[Category.values().length];
        try {
            IIIlllIIl.I[Category.IIl.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IIIlllIIl.I[Category.II.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IIIlllIIl.I[Category.ll.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IIIlllIIl.I[Category.l.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IIIlllIIl.I[Category.I.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IIIlllIIl.I[Category.lI.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }

    private static int I(int n, int n2) {
        return l[n ^ 0x50D936D3] ^ n2 ^ n;
    }
}

