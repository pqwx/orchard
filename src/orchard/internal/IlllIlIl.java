/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllIlIl
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

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;

@Environment(value=EnvType.CLIENT)
public interface IlllIlIl {
    /*
     * Enabled aggressive block sorting
     */
    public static boolean I(Enum<?> enum_, String string) {
        if (enum_ == null) return false;
        if (string == null) return false;
        if (!(enum_ instanceof IlllIlIl)) return enum_.name().equals(string);
        IlllIlIl illlIlIl = (IlllIlIl)((Object)enum_);
        if (illlIlIl.l() == StringFactory.I(string)) return true;
        return false;
    }

    public long l();
}

