/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIIIIl
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
import orchard.internal.IIllIl;
import orchard.internal.IlllIlIl;
import orchard.internal.lIIlll;

@Environment(value=EnvType.CLIENT)
public final class IIIIIIIIl<E extends Enum<E>>
extends IIllIl<E> {
    private final Class<E> I;
    private static final int[] l;

    public E I(String string) {
        if (string == null || string.isBlank()) {
            return null;
        }
        Enum[] enumArray = (Enum[])this.I.getEnumConstants();
        if (string.length() > 1 && string.charAt(0) == 'e') {
            try {
                int n = Integer.parseInt(string.substring(1), 36);
                if (n >= 0 && n < enumArray.length) {
                    return (E)enumArray[n];
                }
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        for (Enum enum_ : enumArray) {
            if (!IlllIlIl.I(enum_, string)) continue;
            return (E)enum_;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void l(JsonElement jsonElement) {
        if (jsonElement == null) return;
        if (!jsonElement.isJsonPrimitive()) return;
        E e = this.I(jsonElement.getAsString());
        if (e == null) return;
        this.lII(e);
    }

    private E Il(E e) {
        if (e instanceof lIIlll) {
            lIIlll lIIlll2 = (lIIlll)e;
            return (E)lIIlll2.I();
        }
        return e;
    }

    public IIIIIIIIl(String string, Class<E> clazz, E e) {
        this((Object)string, clazz, e);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lI(E e) {
        if (!(e instanceof lIIlll)) return true;
        lIIlll lIIlll2 = (lIIlll)e;
        if (!lIIlll2.l()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIl() {
        int n;
        Enum[] enumArray;
        block2: {
            enumArray = (Enum[])this.I.getEnumConstants();
            n = ((Enum)this.lIl()).ordinal();
            int n2 = 0;
            while (n2 < enumArray.length) {
                n = (n + 1) % enumArray.length;
                if (!this.lI(enumArray[n])) {
                    ++n2;
                    continue;
                }
                break block2;
            }
            return;
        }
        this.lII(enumArray[n]);
    }

    public String IlI(Enum<?> enum_) {
        if (enum_ != null && this.I.isInstance(enum_)) {
        } else {
            return "";
        }
        return new StringBuilder(4).append('e').append(Integer.toString(enum_.ordinal(), 36)).toString();
    }

    public IIIIIIIIl(Object object, Class<E> clazz, E e) {
        super(object, e);
        this.I = clazz;
    }

    @Override
    public JsonElement III() {
        return new JsonPrimitive(this.IlI((Enum)this.lIl()));
    }

    public void lII(E e) {
        super.II(this.Il(e));
    }

    private static int llI(int n, int n2) {
        return l[n ^ 0x1D037C67] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -150007305;
        byte[] byArray = "\u009ap<Jr\u00d2-\u00d5\u0098-D\u00bb\u00ed9\u0011\u00ae".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        l = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IIIIIIIIl.l[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

