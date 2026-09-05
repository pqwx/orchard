/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIlll
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

@Environment(value=EnvType.CLIENT)
final class IIIlIlll
extends Record {
    private final String I;
    private final int l;
    private final String II;
    private final String Il;
    private final int lI;
    private final String ll;

    public String I() {
        return this.II;
    }

    IIIlIlll(String string, int n, int n2, String string2, String string3, String string4) {
        this.Il = string;
        this.l = n;
        this.lI = n2;
        this.I = string2;
        this.ll = string3;
        this.II = string4;
    }

    public int l() {
        return this.l;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIIlIlll.class, "version;build;subversion;mcTarget;downloadUrl;notesUrl", "Il", "l", "lI", "I", "ll", "II"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIIlIlll.class, "version;build;subversion;mcTarget;downloadUrl;notesUrl", "Il", "l", "lI", "I", "ll", "II"}, this);
    }

    public String II() {
        return this.I;
    }

    public int Il() {
        return this.lI;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIIlIlll.class, "version;build;subversion;mcTarget;downloadUrl;notesUrl", "Il", "l", "lI", "I", "ll", "II"}, this, object);
    }

    public String lI() {
        return this.ll;
    }

    public String ll() {
        return this.Il;
    }
}

