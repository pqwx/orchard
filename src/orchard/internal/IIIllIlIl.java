/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllIlIl
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
 *  net.minecraft.text.Text
 */
package orchard.internal;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.text.Text;

@Environment(value=EnvType.CLIENT)
final class IIIllIlIl
extends Record {
    private final boolean I;
    private final boolean l;
    private final Text II;

    private IIIllIlIl(Text text, boolean bl, boolean bl2) {
        this.II = text;
        this.l = bl;
        this.I = bl2;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIllIlIl.class, "text;changed;continueStripping", "II", "l", "I"}, this);
    }

    public boolean I() {
        return this.l;
    }

    public Text l() {
        return this.II;
    }

    public boolean II() {
        return this.I;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIllIlIl.class, "text;changed;continueStripping", "II", "l", "I"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIllIlIl.class, "text;changed;continueStripping", "II", "l", "I"}, this);
    }
}

