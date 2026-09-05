/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlll
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
import orchard.internal.IlIIIlll;

@Environment(value=EnvType.CLIENT)
final class IIlll
extends Record {
    private final double I;
    private final int l;
    private final IlIIIlll II;
    private final int Il;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIlll.class, "slotId;category;qualityScore;inventoryOrder", "l", "II", "I", "Il"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIlll.class, "slotId;category;qualityScore;inventoryOrder", "l", "II", "I", "Il"}, this);
    }

    public double I() {
        return this.I;
    }

    public int l() {
        return this.l;
    }

    private IIlll(int n, IlIIIlll ilIIIlll, double d, int n2) {
        this.l = n;
        this.II = ilIIIlll;
        this.I = d;
        this.Il = n2;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIlll.class, "slotId;category;qualityScore;inventoryOrder", "l", "II", "I", "Il"}, this);
    }

    public int II() {
        return this.Il;
    }

    public IlIIIlll Il() {
        return this.II;
    }
}

