/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIlIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - toString
 *   - hashCode
 *   - equals
 *   - IIl
 *   - Ill
 *   - III
 *   - IlI
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
import orchard.internal.IIIllIIll;

@Environment(value=EnvType.CLIENT)
final class lllIlIl
extends Record {
    private final boolean I;
    private final IIIllIIll l;
    private final boolean II;
    private final long Il;
    private final boolean lI;
    private final boolean ll;
    private final boolean III;
    private final boolean IIl;
    private final boolean IlI;
    private final boolean Ill;

    public boolean I() {
        return this.III;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lllIlIl.class, "mode;rosterCheck;pingCheck;identityCheck;invisibilityCheck;positionCheck;airMovementCheck;duplicateIdentityCheck;entityIdCheck;gracePeriodBits", "l", "IIl", "Ill", "ll", "III", "I", "lI", "II", "IlI", "Il"}, this, object);
    }

    public boolean l() {
        return this.IIl;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lllIlIl.class, "mode;rosterCheck;pingCheck;identityCheck;invisibilityCheck;positionCheck;airMovementCheck;duplicateIdentityCheck;entityIdCheck;gracePeriodBits", "l", "IIl", "Ill", "ll", "III", "I", "lI", "II", "IlI", "Il"}, this);
    }

    public boolean II() {
        return this.I;
    }

    public long Il() {
        return this.Il;
    }

    public boolean lI() {
        return this.II;
    }

    public IIIllIIll ll() {
        return this.l;
    }

    public boolean III() {
        return this.lI;
    }

    public boolean IIl() {
        return this.Ill;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lllIlIl.class, "mode;rosterCheck;pingCheck;identityCheck;invisibilityCheck;positionCheck;airMovementCheck;duplicateIdentityCheck;entityIdCheck;gracePeriodBits", "l", "IIl", "Ill", "ll", "III", "I", "lI", "II", "IlI", "Il"}, this);
    }

    private lllIlIl(IIIllIIll iIIllIIll, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7, boolean bl8, long l2) {
        this.l = iIIllIIll;
        this.IIl = bl;
        this.Ill = bl2;
        this.ll = bl3;
        this.III = bl4;
        this.I = bl5;
        this.lI = bl6;
        this.II = bl7;
        this.IlI = bl8;
        this.Il = l2;
    }

    public boolean IlI() {
        return this.ll;
    }

    public boolean Ill() {
        return this.IlI;
    }
}

