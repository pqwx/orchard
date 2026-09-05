/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIlI
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
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIllIl;

@Environment(value=EnvType.CLIENT)
public final class lllIlI
extends IIllIl<String> {
    private final IIIlIIIII I;
    private IIIlIIIII l;

    public String I() {
        return this.l.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void Il(String string) {
        this.lII(StringFactory.lIl(string == null ? "" : string));
    }

    public IIIlIIIII lI() {
        return this.l;
    }

    public lllIlI(String string, String string2) {
        this((Object)string, (Object)string2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public lllIlI(Object object, Object object2) {
        super(object, "");
        this.I = lllIlI.IlI(object2);
        this.l = this.I;
    }

    public String IIl() {
        return this.I.IIII();
    }

    public lllIlI(Object object, String string) {
        this(object, (Object)string);
    }

    @Override
    public JsonElement III() {
        return new JsonPrimitive(this.I());
    }

    private static IIIlIIIII IlI(Object object) {
        return StringFactory.IIIl(object);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void l(JsonElement jsonElement) {
        if (jsonElement == null) return;
        if (!jsonElement.isJsonPrimitive()) return;
        this.Il(jsonElement.getAsString());
    }

    @Override
    public void Ill() {
        this.lII(this.I);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void lII(IIIlIIIII iIIlIIIII) {
        IIIlIIIII iIIlIIIII2 = iIIlIIIII == null ? StringFactory.lIl("") : iIIlIIIII;
        if (this.l.lllI(iIIlIIIII2)) return;
        this.l = iIIlIIIII2;
        this.Illl();
    }
}

