/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIllll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
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
final class IllIllll
extends Record {
    private final int I;
    private final IlIlIIIII l;
    private final boolean II;
    private final IIlIl Il;

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IllIllll.class, "target;action;actionSlot;canFallbackToBlock", "Il", "l", "I", "II"}, this);
    }

    private IllIllll(IIlIl iIlIl, IlIlIIIII ilIlIIIII, int n, boolean bl) {
        this.Il = iIlIl;
        this.l = ilIlIIIII;
        this.I = n;
        this.II = bl;
    }

    public IlIlIIIII I() {
        return this.l;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IllIllll.class, "target;action;actionSlot;canFallbackToBlock", "Il", "l", "I", "II"}, this, object);
    }

    public int l() {
        return this.I;
    }

    public IIlIl II() {
        return this.Il;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IllIllll.class, "target;action;actionSlot;canFallbackToBlock", "Il", "l", "I", "II"}, this);
    }

    public boolean Il() {
        return this.II;
    }
}

