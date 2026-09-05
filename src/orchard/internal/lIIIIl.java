/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIIl
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

import java.util.Iterator;
import java.util.NoSuchElementException;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.IlllIll;
import orchard.internal.lIIIllII;

@Environment(value=EnvType.CLIENT)
class lIIIIl
implements Iterator<String> {
    final /* synthetic */ lIIIllII I;
    final /* synthetic */ Iterator l;

    /*
     * Enabled aggressive block sorting
     */
    public String I() {
        if (!this.l.hasNext()) {
            throw new NoSuchElementException();
        }
        IlllIll illlIll = this.I.l((Long)this.l.next());
        if (illlIll != null) return illlIll.l();
        throw new NoSuchElementException();
    }

    @Override
    public boolean hasNext() {
        return this.l.hasNext();
    }

    lIIIIl(lIIIllII lIIIllII2, Iterator iterator) {
        this.l = iterator;
        this.I = lIIIllII2;
    }
}

