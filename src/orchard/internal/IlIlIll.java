/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - hashCode
 *   - toString
 *   - equals
 *   - III
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
import orchard.internal.IIlIIIIIl;

@Environment(value=EnvType.CLIENT)
public final class IlIlIll
extends Record {
    private final boolean I;
    private final int l;
    private final IIlIIIIIl II;
    private final int Il;
    private final int lI;
    private final boolean ll;
    private final int III;
    private static final int[] IIl;

    static IlIlIll I(int n) {
        return new IlIlIll(-1, n, Integer.MIN_VALUE, Integer.MAX_VALUE, false, false, null);
    }

    public int l() {
        return this.III;
    }

    public int II() {
        return this.lI;
    }

    public boolean Il() {
        return this.I;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlIlIll.class, "originalSlot;targetSlot;switchTick;earliestActionTick;switched;valid;handle", "l", "III", "Il", "lI", "ll", "I", "II"}, this, object);
    }

    public int lI() {
        return this.Il;
    }

    public IlIlIll(int n, int n2, int n3, int n4, boolean bl, boolean bl2, IIlIIIIIl iIlIIIIIl) {
        this.l = n;
        this.III = n2;
        this.Il = n3;
        this.lI = n4;
        this.ll = bl;
        this.I = bl2;
        this.II = iIlIIIIIl;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlIlIll.class, "originalSlot;targetSlot;switchTick;earliestActionTick;switched;valid;handle", "l", "III", "Il", "lI", "ll", "I", "II"}, this);
    }

    public boolean ll() {
        return this.ll;
    }

    public int III() {
        return this.l;
    }

    public IIlIIIIIl IIl() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlIlIll.class, "originalSlot;targetSlot;switchTick;earliestActionTick;switched;valid;handle", "l", "III", "Il", "lI", "ll", "I", "II"}, this);
    }

    private static int IlI(int n, int n2) {
        return IIl[n ^ 0x9D014A58] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 1122811583;
        byte[] byArray = "<)>\u00a2h\u00f6\u0019\u0091".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        IIl = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IlIlIll.IIl[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

