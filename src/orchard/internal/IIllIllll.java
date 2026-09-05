/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIllll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - status;body
 *   - .getBytes(
 *   - toString
 *   - hashCode
 *   - equals
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

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class IIllIllll
extends Record {
    private final String I;
    private final int l;
    private static final int[] II;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIllIllll.class, "status;body", "l", "I"}, this, object);
    }

    public String I() {
        return this.I;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIllIllll.class, "status;body", "l", "I"}, this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean l() {
        if (this.l < 200) return false;
        if (this.l >= 300) return false;
        return true;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIllIllll.class, "status;body", "l", "I"}, this);
    }

    public int II() {
        return this.l;
    }

    private IIllIllll(int n, String string) {
        this.l = n;
        this.I = string;
    }

    private static int Il(int n, int n2) {
        return II[n ^ 0x41401DAE] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 625876226;
        byte[] byArray = "Q\u00c8\u00ab\u0010\u00b5\u009f\u00c7T".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        II = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IIllIllll.II[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

