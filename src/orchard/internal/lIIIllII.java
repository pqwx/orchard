/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIllII
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

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.IlllIll;
import orchard.internal.lIIIIl;
import orchard.internal.llIlIlI;

@Environment(value=EnvType.CLIENT)
final class lIIIllII
extends AbstractSet<String> {
    private final List<IlllIll> I;
    private final Set<Long> l;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean contains(Object object) {
        Long l2 = llIlIlI.I(object);
        if (l2 == null) return false;
        if (!this.II(l2)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof lIIIllII)) {
            return super.equals(object);
        }
        lIIIllII lIIIllII2 = (lIIIllII)object;
        return this.l.equals(lIIIllII2.l);
    }

    @Override
    public int size() {
        return this.l.size();
    }

    private Set<Long> I() {
        return this.l;
    }

    @Override
    public Iterator<String> iterator() {
        Iterator<Long> iterator = this.l.iterator();
        return new lIIIIl(this, iterator);
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIIllII(List<IlllIll> list, Collection<Long> collection) {
        this.I = List.copyOf(list);
        this.l = Collections.unmodifiableSet(new LinkedHashSet<Long>(collection));
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlllIll l(long l2) {
        IlllIll illlIll;
        Iterator<IlllIll> iterator = this.I.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while ((illlIll = iterator.next()).IIl() != l2);
        return illlIll;
    }

    private boolean II(long l2) {
        return this.l.contains(l2);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public int hashCode() {
        block5: {
            block6: {
                break block6;
lbl1:
                // 1 sources

                while (true) {
                    var1_1 += var5_4.I;
                    break block5;
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    if (var5_4 != null) {
                        ** continue;
                    }
                    break block5;
                    break;
                }
            }
            var1_1 = 0;
            var2_2 = this.l.iterator();
        }
        if (!var2_2.hasNext()) {
            return var1_1;
lbl14:
            // 1 sources

            while (true) {
                var5_4 = this.l(var3_3);
                ** continue;
                break;
            }
        }
        var3_3 = var2_2.next();
        ** while (true)
    }
}

