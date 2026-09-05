/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllII
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
final class IlllII
extends Record {
    private final int I;
    private final int l;
    private final String II;

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IlllII.class, "itemSignature;count;clickedAtTick", "II", "l", "I"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IlllII.class, "itemSignature;count;clickedAtTick", "II", "l", "I"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IlllII.class, "itemSignature;count;clickedAtTick", "II", "l", "I"}, this);
    }

    public int I() {
        return this.I;
    }

    public String l() {
        return this.II;
    }

    private IlllII(String string, int n, int n2) {
        this.II = string;
        this.l = n;
        this.I = n2;
    }

    boolean II(ItemStack itemStack) {
        return this.l == itemStack.getCount() && this.II.equals(itemStack.getItem().toString());
    }

    public int Il() {
        return this.l;
    }
}

