/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIllIll
 * Purpose not identified - name is the original obfuscated one.
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

import java.util.HashSet;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
final class IIlIllIll {
    private final Set<Integer> I = new HashSet<Integer>();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean I() {
        if (this.I.isEmpty()) return false;
        return true;
    }

    private IIlIllIll() {
    }

    boolean l(int n) {
        return this.I.contains(n);
    }

    void II(int n) {
        this.I.add(n);
    }
}

