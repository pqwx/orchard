/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.Illlll
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
 *  net.minecraft.client.network.CookieStorage
 */
package orchard.internal;

import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.CookieStorage;

@Environment(value=EnvType.CLIENT)
public final class Illlll {
    public static CookieStorage I() {
        return new CookieStorage(Map.of(), Map.of(), false);
    }

    private Illlll() {
    }
}

