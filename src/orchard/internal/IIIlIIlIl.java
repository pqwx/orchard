/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIIlIl
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
import orchard.internal.IIlIl;
import orchard.internal.IlIlIIIII;

@Environment(value=EnvType.CLIENT)
final class IIIlIIlIl
extends Record {
    private final int I;
    private final IIlIl l;
    private final int II;
    private final IlIlIIIII Il;
    private final boolean lI;
    private final int ll;

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIlIIlIl.class, "target;action;originalSlot;actionSlot;canFallbackToBlock;recoveries", "l", "Il", "ll", "I", "lI", "II"}, this);
    }

    public int I() {
        return this.ll;
    }

    public int l() {
        return this.I;
    }

    public int II() {
        return this.II;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIlIIlIl.class, "target;action;originalSlot;actionSlot;canFallbackToBlock;recoveries", "l", "Il", "ll", "I", "lI", "II"}, this);
    }

    public IIIlIIlIl Il(int n) {
        return new IIIlIIlIl(this.l, this.Il, this.ll, this.I, this.lI, n);
    }

    private IIIlIIlIl(IIlIl iIlIl, IlIlIIIII ilIlIIIII, int n, int n2, boolean bl, int n3) {
        this.l = iIlIl;
        this.Il = ilIlIIIII;
        this.ll = n;
        this.I = n2;
        this.lI = bl;
        this.II = n3;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIlIIlIl.class, "target;action;originalSlot;actionSlot;canFallbackToBlock;recoveries", "l", "Il", "ll", "I", "lI", "II"}, this, object);
    }

    public boolean lI() {
        return this.lI;
    }

    public IIlIl ll() {
        return this.l;
    }

    public IlIlIIIII III() {
        return this.Il;
    }
}

