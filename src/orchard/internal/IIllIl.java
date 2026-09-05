/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.google.gson.JsonElement;
import java.util.Objects;
import java.util.function.BooleanSupplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.ClientEntrypoint;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
public abstract class IIllIl<T> {
    private static final BooleanSupplier lI = () -> true;
    private final IIIlIIIII ll;
    private boolean III = true;
    private T IIl;
    private BooleanSupplier IlI = lI;
    private final T Ill;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final void Illl() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        clientEntrypoint.I();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void II(T t) {
        boolean bl = !Objects.equals(this.IIl, t);
        this.IIl = t;
        if (bl) {
            this.Illl();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public <S extends IIllIl<T>> S lIII(BooleanSupplier booleanSupplier) {
        this.IlI = booleanSupplier == null ? lI : booleanSupplier;
        return (S)this;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected IIllIl(Object object, T t) {
        this.ll = StringFactory.IIIl(object);
        this.Ill = t;
        this.IIl = t;
    }

    public boolean lIIl() {
        return this.III;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean lIlI() {
        if (this.IlI == null) return true;
        if (!this.IlI.getAsBoolean()) return false;
        return true;
    }

    public abstract void l(JsonElement var1);

    public T ll() {
        return this.Ill;
    }

    public String llII() {
        return this.ll.IIII();
    }

    public abstract JsonElement III();

    public void Ill() {
        this.II(this.Ill);
    }

    public IIIlIIIII llIl() {
        return this.ll;
    }

    public long lllI() {
        return this.ll.llII();
    }

    public <S extends IIllIl<T>> S llll() {
        this.III = false;
        return (S)this;
    }

    protected IIllIl(String string, T t) {
        this((Object)string, t);
    }

    public T lIl() {
        return this.IIl;
    }
}

