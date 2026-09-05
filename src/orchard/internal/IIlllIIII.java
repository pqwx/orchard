/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlllIIII
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
 *  net.minecraft.util.Identifier
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Identifier;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.llllIl;

@Environment(value=EnvType.CLIENT)
public final class IIlllIIII {
    private final IIIlIIIII I;
    private final float l;
    private final int II;
    private final IIIlIIIII Il;
    private final float lI;
    private final int ll;
    private final IIIlIIIII III;
    private final float IIl;
    private final float IlI;

    private IIlllIIII I(String string) {
        return new IIlllIIII(this.III(), string, this.I, this.II, this.ll, this.IlI, this.lI, this.l, this.IIl);
    }

    public Identifier l() {
        return Identifier.of((String)llllIl.I.IIII(), (String)this.I.IIII());
    }

    public int II() {
        return this.II;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIlllIIII(String string, String string2, IIIlIIIII iIIlIIIII, int n, int n2, float f, float f2, float f3, float f4) {
        this.III = StringFactory.lIl(string);
        this.Il = StringFactory.lIl(string2);
        this.I = iIIlIIIII == null ? StringFactory.lIl("") : iIIlIIIII;
        this.II = n;
        this.ll = n2;
        this.IlI = f;
        this.lI = f2;
        this.l = f3;
        this.IIl = f4;
    }

    public float Il(float f) {
        return f * ((float)this.II / (float)this.ll);
    }

    public IIIlIIIII lI() {
        return this.III;
    }

    public long ll() {
        return this.Il.llII();
    }

    public String III() {
        return this.III.IIII();
    }

    public int IIl() {
        return Math.max(0, Math.round(this.l + 2.0f));
    }

    public float IlI() {
        return this.l;
    }

    public float Ill() {
        return this.IIl;
    }

    public int lII() {
        return this.ll;
    }

    public float lIl() {
        return this.lI;
    }

    public int llI() {
        return Math.max(0, Math.round(this.IlI + 3.0f));
    }

    public String lll() {
        return this.Il.IIII();
    }

    public IIIlIIIII IIII() {
        return this.Il;
    }

    public float IIIl() {
        return this.IlI;
    }
}

