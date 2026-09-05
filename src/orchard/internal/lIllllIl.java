/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllllIl
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
import orchard.internal.IIIIIIl;
import orchard.internal.IIlIlllI;

@Environment(value=EnvType.CLIENT)
class lIllllIl {
    static final /* synthetic */ int[] I;
    static final /* synthetic */ int[] l;
    private static final int[] II;

    static {
        int n = -480555620;
        byte[] byArray = "\u00ec\u00ceU\u00d15\u00d7R\u0088".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        II = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            lIllllIl.II[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
        I = new int[IIlIlllI.values().length];
        try {
            lIllllIl.I[IIlIlllI.l.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            lIllllIl.I[IIlIlllI.Il.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            lIllllIl.I[IIlIlllI.II.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            lIllllIl.I[IIlIlllI.lI.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            lIllllIl.I[IIlIlllI.III.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            lIllllIl.I[IIlIlllI.IIl.ordinal()] = 6;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            lIllllIl.I[IIlIlllI.IlI.ordinal()] = 7;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        l = new int[IIIIIIl.values().length];
        try {
            lIllllIl.l[IIIIIIl.ll.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            lIllllIl.l[IIIIIIl.lI.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            lIllllIl.l[IIIIIIl.l.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }

    private static int I(int n, int n2) {
        return II[n ^ 0x1DAD10A2] ^ n2 ^ n;
    }
}

