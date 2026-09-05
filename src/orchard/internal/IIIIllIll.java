/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIllIll
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
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.IIllIl;

@Environment(value=EnvType.CLIENT)
public final class IIIIllIll
extends IIllIl<String> {
    private final Runnable I;
    private static String[] l;
    private static final int[] II;

    public void I(String string) {
        super.II(string == null ? "" : string);
    }

    @Override
    public void l(JsonElement jsonElement) {
    }

    public IIIIllIll(Object object, String string) {
        this(object, string, null);
    }

    public IIIIllIll(Object object, String string, Runnable runnable) {
        super(object, string == null ? "" : string);
        this.I = runnable;
    }

    private static void Il() {
        IIIIllIll.l[0] = IIIIllIll.ll("".toCharArray(), 43902L, -1516000711);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 1096501309;
        byte[] byArray = "#0^FC\u0017;\b\u00fe/\u00dd\u0015".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        II = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IIIIllIll.II[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
        l = new String[1];
        IIIIllIll.Il();
    }

    public String lI() {
        return (String)this.lIl();
    }

    public IIIIllIll(Object object) {
        this(object, "", null);
    }

    private static String ll(char[] cArray, long l2, int n) {
        int n2 = 0x13A9F116 ^ n;
        for (int i = 0; i < cArray.length; ++i) {
            n2 = n2 ^ (int)l2 ^ ~i;
            n2 ^= n - i * cArray.length;
            n2 = -n2 * n | i;
            cArray[i] = (char)(cArray[i] ^ n2);
            int n3 = i & 0xFF;
            n = n << n3 | n >>> -n3;
            l2 ^= (long)n3;
        }
        return new String(cArray);
    }

    @Override
    public JsonElement III() {
        return JsonNull.INSTANCE;
    }

    public void IIl() {
        if (this.I != null) {
            this.I.run();
        }
    }

    private static int IlI(int n, int n2) {
        return II[n ^ 0xA185267A] ^ n2 ^ n;
    }
}

