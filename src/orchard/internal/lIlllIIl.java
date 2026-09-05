/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlllIIl
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

import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
final class lIlllIIl {
    private final Map<Long, IIIlIIIII> I = new HashMap<Long, IIIlIIIII>();

    private lIlllIIl() {
    }

    private IIIlIIIII I(long l2) {
        return this.I.get(l2);
    }

    private void l(String string, String string2) {
        this.I.put(StringFactory.IIII(string).llII(), StringFactory.IIII(string2));
    }
}

