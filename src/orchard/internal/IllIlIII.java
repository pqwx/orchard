/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIlIII
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
import orchard.config.CloudConfigManager;
import orchard.internal.IlIlIII;

@Environment(value=EnvType.CLIENT)
class IllIlIII
implements IlIlIII {
    final /* synthetic */ CloudConfigManager I;

    IllIlIII(CloudConfigManager cloudConfigManager) {
        this.I = cloudConfigManager;
    }

    @Override
    public String l() {
        return this.I.IIIlI.IIll();
    }

    @Override
    public boolean I() {
        return this.I.IIIlI.lll();
    }

    @Override
    public boolean II(String string) {
        return this.I.IIIlI.III(string);
    }
}

