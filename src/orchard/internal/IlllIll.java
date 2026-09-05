/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllIll
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
 *  com.google.gson.JsonPrimitive
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
public final class IlllIll {
    private final int I;
    private final long l;
    private final IIIlIIIII II;
    private final int Il;
    private final IIIlIIIII lI;
    private static final int[] ll;

    public IlllIll(String string, IIIlIIIII iIIlIIIII) {
        this((Object)string, (Object)iIIlIIIII);
    }

    public JsonElement I() {
        return new JsonPrimitive(this.l());
    }

    public String l() {
        return this.lI.IIII();
    }

    public IIIlIIIII II() {
        return this.II;
    }

    private static int Il(IIIlIIIII iIIlIIIII) {
        int[] nArray = new int[]{0};
        iIIlIIIII.llI(n -> {
            if (Character.isBmpCodePoint(n)) {
                nArray[0] = 31 * nArray[0] + n;
                return;
            }
            char[] cArray = Character.toChars(n);
            nArray[0] = 31 * nArray[0] + cArray[0];
            nArray[0] = 31 * nArray[0] + cArray[1];
        });
        return nArray[0];
    }

    public IIIlIIIII lI() {
        return this.lI;
    }

    public IlllIll(String string, Object object) {
        this((Object)string, object);
    }

    public String ll() {
        return this.II.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof IlllIll)) return false;
        IlllIll illlIll = (IlllIll)object;
        if (this.l != illlIll.l) return false;
        if (this.II.llII() != illlIll.II.llII()) return false;
        if (!this.l().equals(illlIll.l())) return false;
        if (this.ll().equals(illlIll.ll())) return true;
        return false;
    }

    public IlllIll(String string, String string2) {
        this(string, (Object)string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public IlllIll(Object object, Object object2) {
        this.lI = IlllIll.III(object);
        this.II = IlllIll.III(object2);
        this.l = this.lI.llII();
        this.I = IlllIll.Il(this.lI);
        this.Il = IlllIll.Il(this.II);
    }

    private static IIIlIIIII III(Object object) {
        return StringFactory.IIIl(object);
    }

    public int hashCode() {
        return 31 * this.I + this.Il;
    }

    public long IIl() {
        return this.l;
    }

    private static int Ill(int n, int n2) {
        return ll[n ^ 0xDD58ACCF] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 1975143965;
        byte[] byArray = "\u0097\u00a5J\u00df\u00be\u00b34\u00f9\u00dd\u00f4\u00b3t\u00a4_\u0018x".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        ll = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IlllIll.ll[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

