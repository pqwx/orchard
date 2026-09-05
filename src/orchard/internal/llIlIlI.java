/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIllIl;
import orchard.internal.IlllIll;
import orchard.internal.lIIIllII;

@Environment(value=EnvType.CLIENT)
public final class llIlIlI
extends IIllIl<Set<String>> {
    private final List<IlllIll> I;

    /*
     * Enabled aggressive block sorting
     */
    private static Long I(Object object) {
        if (object instanceof String) {
            String string = (String)object;
            return StringFactory.I(string);
        }
        if (object instanceof IIIlIIIII) {
            IIIlIIIII iIIlIIIII = (IIIlIIIII)object;
            return iIIlIIIII.llII();
        }
        if (!(object instanceof IlllIll)) return null;
        IlllIll illlIll = (IlllIll)object;
        return illlIll.IIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    public llIlIlI(Object object, List<IlllIll> list, Collection<?> collection) {
        super(object, llIlIlI.IIll(collection, list));
        this.I = List.copyOf(list);
        this.lIl(collection);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void l(JsonElement var1_1) {
        block11: {
            block12: {
                block7: {
                    block8: {
                        block9: {
                            block10: {
                                if (var1_1 == null) break block9;
                                break block10;
lbl3:
                                // 1 sources

                                return;
lbl5:
                                // 1 sources

                                while (true) {
                                    var3_3 = var1_1.getAsJsonArray().iterator();
                                    break block7;
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (var1_1.isJsonArray()) {
                                    ** continue;
lbl10:
                                    // 1 sources

                                    ** GOTO lbl5
                                }
                                break block11;
                            }
                            if (!var1_1.isJsonNull()) break block12;
                            break block9;
lbl15:
                            // 1 sources

                            while (var4_4.isJsonPrimitive()) {
                                break block8;
                            }
                            break block7;
lbl18:
                            // 3 sources

                            while (true) {
                                this.IlI(var2_2);
                                ** continue;
                                break;
                            }
                        }
                        return;
lbl23:
                        // 1 sources

                        while (true) {
                            if (var4_4 == null) break block7;
                            ** GOTO lbl15
                            break;
                        }
                    }
                    var2_2.add(var4_4.getAsString());
                    break block7;
lbl30:
                    // 1 sources

                    while (true) {
                        var2_2.add(var1_1.getAsString());
                        ** GOTO lbl18
                        break;
                    }
                }
                if (!var3_3.hasNext()) ** GOTO lbl18
                var4_4 = (JsonElement)var3_3.next();
                ** while (true)
            }
            var2_2 = new ArrayList<String>();
            ** GOTO lbl8
        }
        if (var1_1.isJsonPrimitive()) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static lIIIllII Il(Set<String> set, List<IlllIll> list) {
        lIIIllII lIIIllII2;
        lIIIllII lIIIllII3;
        block2: {
            block1: {
                if (!(set instanceof lIIIllII)) break block1;
                break block2;
            }
            lIIIllII3 = llIlIlI.IIll(set, list);
            return lIIIllII3;
        }
        lIIIllII3 = lIIIllII2 = (lIIIllII)set;
        return lIIIllII3;
    }

    public boolean lI(String string) {
        return string != null && this.IIlI().II(StringFactory.I(string));
    }

    public llIlIlI(String string, List list, Collection collection) {
        this((Object)string, (List<IlllIll>)list, collection);
    }

    @Override
    public Set<String> ll() {
        return llIlIlI.lII(this.IIlI());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIl(IIIlIIIII iIIlIIIII) {
        if (iIIlIIIII == null) return false;
        if (!this.IIlI().II(iIIlIIIII.llII())) return false;
        return true;
    }

    public void IlI(Collection<String> collection) {
        this.lIl(collection);
    }

    public void Ill(Set<String> set) {
        this.lIl(set);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Set<String> lII(lIIIllII lIIIllII2) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        Iterator<String> iterator = lIIIllII2.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            linkedHashSet.add(string);
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private void lIl(Collection<?> collection) {
        super.II(llIlIlI.IIll(collection, this.I));
    }

    public Set<String> llI() {
        return llIlIlI.lII(llIlIlI.Il((Set)this.ll(), this.I));
    }

    /*
     * Enabled aggressive block sorting
     */
    public void lll(IlllIll illlIll) {
        LinkedHashSet<Long> linkedHashSet;
        if (illlIll == null) return;
        if (this.I.contains(illlIll)) {
            linkedHashSet = new LinkedHashSet<Long>(this.IIlI().I());
            if (!linkedHashSet.remove(illlIll.IIl())) {
                linkedHashSet.add(illlIll.IIl());
            }
        } else {
            return;
        }
        super.II(new lIIIllII(this.I, linkedHashSet));
    }

    public boolean IIII(IlllIll illlIll) {
        return illlIll != null && this.IIlI().II(illlIll.IIl());
    }

    public List<IlllIll> IIIl() {
        return this.I;
    }

    private lIIIllII IIlI() {
        return llIlIlI.Il((Set)super.lIl(), this.I);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public JsonElement III() {
        JsonArray jsonArray = new JsonArray();
        Iterator<String> iterator = this.IIlI().iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            jsonArray.add(string);
        }
        return jsonArray;
    }

    /*
     * Unable to fully structure code
     */
    private static lIIIllII IIll(Collection<?> var0, List<IlllIll> var1_1) {
        block12: {
            block13: {
                block14: {
                    block11: {
                        block19: {
                            block17: {
                                block15: {
                                    block18: {
                                        block9: {
                                            block16: {
                                                block10: {
                                                    break block15;
lbl1:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl3:
                                                    // 1 sources

                                                    while (var0 instanceof lIIIllII) {
                                                        break block9;
                                                    }
                                                    break block16;
lbl6:
                                                    // 2 sources

                                                    while (true) {
                                                        if (!var4_4.hasNext()) break block10;
                                                        break block11;
                                                        break;
                                                    }
lbl9:
                                                    // 1 sources

                                                    while (true) {
                                                        var4_4.add(var8_10);
                                                        break block12;
                                                        break;
                                                    }
lbl13:
                                                    // 1 sources

                                                    while (var8_10 != null) {
                                                        break block13;
                                                    }
                                                    break block12;
                                                }
                                                var4_4 = new LinkedHashSet<E>();
                                                ** GOTO lbl3
                                            }
                                            if (var0 == null) break block17;
                                            break block18;
lbl22:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl24:
                                            // 1 sources

                                            while (true) {
                                                var6_7 = var5_5.I().iterator();
                                                break block14;
                                                break;
                                            }
                                        }
                                        var5_5 = (lIIIllII)var0;
                                        ** while (true)
                                    }
                                    var6_6 = var0.iterator();
                                    break block12;
                                    var7_8 = var6_6.next();
                                    var8_10 = llIlIlI.I(var7_8);
                                    ** GOTO lbl13
lbl36:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = var2_2.iterator();
                                        ** GOTO lbl6
                                        break;
                                    }
                                }
                                var2_2 = List.copyOf(var1_1);
                                var3_3 = new LinkedHashSet<Long>();
                                ** while (true)
                                var7_9 = var6_7.next();
                                if (!var3_3.contains(var7_9)) break block14;
                                break block19;
                            }
lbl47:
                            // 3 sources

                            return new lIIIllII(var2_2, (Collection<Long>)var4_4);
                        }
                        var4_4.add(var7_9);
                        break block14;
                    }
                    var5_5 = var4_4.next();
                    var3_3.add(var5_5.IIl());
                    ** while (true)
                }
                if (!var6_7.hasNext()) ** GOTO lbl47
                ** while (true)
            }
            ** while (var3_3.contains((Object)var8_10))
        }
        if (var6_6.hasNext()) ** break;
        ** while (true)
        ** while (true)
    }
}

