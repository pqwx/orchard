/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - forward;sprint;jump
 *   - toString
 *   - hashCode
 *   - equals
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class lllII
extends Record {
    private final boolean I;
    private final boolean l;
    private static final lllII II = new lllII(false, false, false);
    private final boolean Il;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lllII.class, "forward;sprint;jump", "Il", "l", "I"}, this);
    }

    public lllII(boolean bl, boolean bl2, boolean bl3) {
        this.Il = bl;
        this.l = bl2;
        this.I = bl3;
    }

    public boolean I() {
        return this.I;
    }

    public boolean l() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lllII.class, "forward;sprint;jump", "Il", "l", "I"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lllII.class, "forward;sprint;jump", "Il", "l", "I"}, this);
    }

    public boolean II() {
        return this.Il;
    }
}

