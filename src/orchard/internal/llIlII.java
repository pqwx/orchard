/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlII
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
 *  net.minecraft.item.ItemStack
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.ItemStack;

@Environment(value=EnvType.CLIENT)
final class llIlII
extends Record {
    private final ItemStack I;
    private final int l;
    private final float II;
    private final int Il;

    private llIlII(int n, int n2, float f, ItemStack itemStack) {
        this.l = n;
        this.Il = n2;
        this.II = f;
        this.I = itemStack;
    }

    public int I() {
        return this.Il;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{llIlII.class, "slot;score;healingAmount;stack", "l", "Il", "II", "I"}, this);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{llIlII.class, "slot;score;healingAmount;stack", "l", "Il", "II", "I"}, this);
    }

    public ItemStack l() {
        return this.I;
    }

    public int II() {
        return this.l;
    }

    public float Il() {
        return this.II;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{llIlII.class, "slot;score;healingAmount;stack", "l", "Il", "II", "I"}, this, object);
    }
}

