/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlllll
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
 *  net.minecraft.util.math.BlockPos
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.math.BlockPos;

@Environment(value=EnvType.CLIENT)
final class lIlllll
extends Record {
    private final float I;
    private final BlockPos l;
    private final int II;
    private final float Il;

    public BlockPos I() {
        return this.l;
    }

    private lIlllll(BlockPos blockPos, int n, float f, float f2) {
        this.l = blockPos;
        this.II = n;
        this.Il = f;
        this.I = f2;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{lIlllll.class, "railPos;restoreSlot;yaw;pitch", "l", "II", "Il", "I"}, this);
    }

    public float l() {
        return this.Il;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{lIlllll.class, "railPos;restoreSlot;yaw;pitch", "l", "II", "Il", "I"}, this, object);
    }

    public int II() {
        return this.II;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{lIlllll.class, "railPos;restoreSlot;yaw;pitch", "l", "II", "Il", "I"}, this);
    }

    public float Il() {
        return this.I;
    }
}

