/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIlIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - hashCode
 *   - toString
 *   - equals
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

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIlllIIII;

@Environment(value=EnvType.CLIENT)
final class IIlIlIIll
extends Record {
    private final IIlllIIII I;
    private final List<IIlllIIII> l;
    private final Map<Long, IIlllIIII> II;

    public List<IIlllIIII> I() {
        return this.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    private List<String> l() {
        ArrayList<String> arrayList = new ArrayList<String>(this.l.size() + 1);
        arrayList.add("");
        Iterator<IIlllIIII> iterator = this.l.iterator();
        while (iterator.hasNext()) {
            IIlllIIII iIlllIIII = iterator.next();
            arrayList.add(iIlllIIII.lll());
        }
        return List.copyOf(arrayList);
    }

    public IIlllIIII II() {
        return this.I;
    }

    public Map<Long, IIlllIIII> Il() {
        return this.II;
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{IIlIlIIll.class, "specs;byOptionHash;firstBadge", "l", "II", "I"}, this);
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIlllIIII lI(String string) {
        IIlllIIII iIlllIIII;
        if (string == null) return null;
        if (string.isBlank()) {
            return null;
        }
        IIlllIIII iIlllIIII2 = this.II.get(StringFactory.I(string));
        if (iIlllIIII2 != null && iIlllIIII2.IIII().lII(string)) return iIlllIIII2;
        Iterator<IIlllIIII> iterator = this.l.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while (!(iIlllIIII = iterator.next()).IIII().lII(string));
        return iIlllIIII;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{IIlIlIIll.class, "specs;byOptionHash;firstBadge", "l", "II", "I"}, this, object);
    }

    private IIlIlIIll(List<IIlllIIII> list, Map<Long, IIlllIIII> map, IIlllIIII iIlllIIII) {
        this.l = list;
        this.II = map;
        this.I = iIlllIIII;
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{IIlIlIIll.class, "specs;byOptionHash;firstBadge", "l", "II", "I"}, this);
    }
}

