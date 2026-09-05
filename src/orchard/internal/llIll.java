/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonPrimitive
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.IIllIl;

@Environment(value=EnvType.CLIENT)
public final class llIll
extends IIllIl<Boolean> {
    public llIll(Object object, boolean bl) {
        super(object, Boolean.valueOf(bl));
    }

    @Override
    public void l(JsonElement jsonElement) {
        if (jsonElement != null && jsonElement.isJsonPrimitive()) {
            this.II(jsonElement.getAsBoolean());
        }
    }

    @Override
    public JsonElement III() {
        return new JsonPrimitive((Boolean)this.lIl());
    }

    public llIll(String string, boolean bl) {
        this((Object)string, bl);
    }
}

