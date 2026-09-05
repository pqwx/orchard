/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIlIIIl
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
import orchard.internal.IIIlIIIII;
import orchard.internal.IlIIlllll;

@Environment(value=EnvType.CLIENT)
public final class IIIIlIIIl
extends Record {
    private final IlIIlllll I;
    private final long l;
    private final IIIlIIIII II;
    private final IIIlIIIII Il;
    private final long lI;
    private final long ll;

    public long I() {
        return this.l + this.lI;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIIlIIIl.class, "id;type;sealedTitle;sealedDescription;createdAtMs;durationMs", "ll", "I", "Il", "II", "l", "lI"}, this);
    }

    public IIIlIIIII l() {
        return this.II;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIIlIIIl.class, "id;type;sealedTitle;sealedDescription;createdAtMs;durationMs", "ll", "I", "Il", "II", "l", "lI"}, this);
    }

    public long II() {
        return this.lI;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIIlIIIl.class, "id;type;sealedTitle;sealedDescription;createdAtMs;durationMs", "ll", "I", "Il", "II", "l", "lI"}, this, object);
    }

    public IIIlIIIII Il() {
        return this.Il;
    }

    public IIIlIIIII lI() {
        return this.Il;
    }

    public IIIlIIIII ll() {
        return this.II;
    }

    public String III() {
        return this.II.IIII();
    }

    public long IIl() {
        return this.ll;
    }

    public long IlI() {
        return this.l;
    }

    public IIIIlIIIl(long l2, IlIIlllll ilIIlllll, IIIlIIIII iIIlIIIII, IIIlIIIII iIIlIIIII2, long l3, long l4) {
        this.ll = l2;
        this.I = ilIIlllll;
        this.Il = iIIlIIIII;
        this.II = iIIlIIIII2;
        this.l = l3;
        this.lI = l4;
    }

    public IlIIlllll Ill() {
        return this.I;
    }

    public String lII() {
        return this.Il.IIII();
    }
}

