/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
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
import orchard.internal.lllIlllI;

@Environment(value=EnvType.CLIENT)
final class lIllIIll
extends Record {
    private final long I;
    private final Object l;
    private final lllIlllI II;
    private final long Il;
    private final int lI;
    private final int ll;

    public long I() {
        return this.Il;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIllIIll.class, "owner;axeSlot;maceSlot;inputGeneration;attackSerialAtStart;stage", "l", "ll", "lI", "Il", "I", "II"}, this);
    }

    public long l() {
        return this.I;
    }

    lIllIIll(Object object, int n, int n2, long l2, long l3, lllIlllI lllIlllI2) {
        this.l = object;
        this.ll = n;
        this.lI = n2;
        this.Il = l2;
        this.I = l3;
        this.II = lllIlllI2;
    }

    public Object II() {
        return this.l;
    }

    public int Il() {
        return this.lI;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIllIIll.class, "owner;axeSlot;maceSlot;inputGeneration;attackSerialAtStart;stage", "l", "ll", "lI", "Il", "I", "II"}, this, object);
    }

    public lllIlllI lI() {
        return this.II;
    }

    public int ll() {
        return this.ll;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIllIIll.class, "owner;axeSlot;maceSlot;inputGeneration;attackSerialAtStart;stage", "l", "ll", "lI", "Il", "I", "II"}, this);
    }
}

