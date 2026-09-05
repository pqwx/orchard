/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIIIll
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
import orchard.internal.IIIlIlll;
import orchard.internal.IIllIIIII;

@Environment(value=EnvType.CLIENT)
final class IIllIIIll
extends Record {
    private final boolean I;
    private final boolean l;
    private final IIllIIIII II;
    private final IIIlIlll Il;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIllIIIll.class, "local;remote;checked;outdated", "II", "Il", "I", "l"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIllIIIll.class, "local;remote;checked;outdated", "II", "Il", "I", "l"}, this);
    }

    public boolean I() {
        return this.I;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIllIIIll.class, "local;remote;checked;outdated", "II", "Il", "I", "l"}, this);
    }

    public IIllIIIII l() {
        return this.II;
    }

    static IIllIIIll II(IIllIIIII iIllIIIII) {
        return new IIllIIIll(iIllIIIII, null, false, false);
    }

    public boolean Il() {
        return this.l;
    }

    static IIllIIIll lI(IIllIIIII iIllIIIII) {
        return new IIllIIIll(iIllIIIII, null, true, false);
    }

    IIllIIIll(IIllIIIII iIllIIIII, IIIlIlll iIIlIlll, boolean bl, boolean bl2) {
        this.II = iIllIIIII;
        this.Il = iIIlIlll;
        this.I = bl;
        this.l = bl2;
    }

    public IIIlIlll ll() {
        return this.Il;
    }

    static IIllIIIll III(IIllIIIII iIllIIIII, IIIlIlll iIIlIlll, boolean bl) {
        return new IIllIIIll(iIllIIIII, iIIlIlll, true, bl);
    }
}

