/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlllll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - targetYaw;targetPitch
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

@Environment(value=EnvType.CLIENT)
record llIlllll(float I, float l) {
    private final float I;
    private final float l;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{llIlllll.class, "targetYaw;targetPitch", "I", "l"}, this, object);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{llIlllll.class, "targetYaw;targetPitch", "I", "l"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{llIlllll.class, "targetYaw;targetPitch", "I", "l"}, this);
    }

    public float I() {
        return this.l;
    }

    public float l() {
        return this.I;
    }
}

