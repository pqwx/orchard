/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlIlIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - id;name;bindLabel;slots
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
public final class llIlIlIl
extends Record {
    private final int I;
    private final String l;
    private final String II;
    private final String Il;

    public int I() {
        return this.I;
    }

    public String l() {
        return this.l;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{llIlIlIl.class, "id;name;bindLabel;slots", "Il", "II", "l", "I"}, this);
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{llIlIlIl.class, "id;name;bindLabel;slots", "Il", "II", "l", "I"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{llIlIlIl.class, "id;name;bindLabel;slots", "Il", "II", "l", "I"}, this);
    }

    public String II() {
        return this.II;
    }

    public llIlIlIl(String string, String string2, String string3, int n) {
        this.Il = string;
        this.II = string2;
        this.l = string3;
        this.I = n;
    }

    public String Il() {
        return this.Il;
    }
}

