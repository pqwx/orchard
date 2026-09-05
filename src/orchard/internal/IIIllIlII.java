/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllIlII
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
 *  net.minecraft.item.ItemStack
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.item.ItemStack;

@Environment(value=EnvType.CLIENT)
final class IIIllIlII
extends Record {
    private final int I;
    private final String l;
    private final int II;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIllIlII.class, "itemSignature;count;clickedAtTick", "l", "II", "I"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIllIlII.class, "itemSignature;count;clickedAtTick", "l", "II", "I"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIllIlII.class, "itemSignature;count;clickedAtTick", "l", "II", "I"}, this);
    }

    private IIIllIlII(String string, int n, int n2) {
        this.l = string;
        this.II = n;
        this.I = n2;
    }

    public String I() {
        return this.l;
    }

    public int l() {
        return this.II;
    }

    public int II() {
        return this.I;
    }

    boolean Il(ItemStack itemStack) {
        return this.II == itemStack.getCount() && this.l.equals(itemStack.getItem().toString());
    }
}

