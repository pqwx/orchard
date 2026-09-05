/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIlIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - chunkX;chunkZ;distanceSq
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
record IIllIlIll(int I, int l, int II) {
    private final int I;
    private final int l;
    private final int II;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIllIlIll.class, "chunkX;chunkZ;distanceSq", "I", "II", "l"}, this, object);
    }

    public int I() {
        return this.II;
    }

    public int l() {
        return this.I;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIllIlIll.class, "chunkX;chunkZ;distanceSq", "I", "II", "l"}, this);
    }

    private IIllIlIll(int n, int n2, int n3) {
        this.I = n;
        this.II = n2;
        this.l = n3;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIllIlIll.class, "chunkX;chunkZ;distanceSq", "I", "II", "l"}, this);
    }

    public int II() {
        return this.l;
    }
}

