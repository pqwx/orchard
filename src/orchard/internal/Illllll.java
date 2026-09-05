/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.Illllll
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
 *  com.google.gson.JsonPrimitive
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIllIl;
import orchard.internal.IlIIllI;

@Environment(value=EnvType.CLIENT)
public final class Illllll
extends IIllIl<List<String>> {
    private List<IIIlIIIII> I;
    private final IIIlIIIII l;
    private final List<IIIlIIIII> II;
    private static final String[] Il;
    private static final Object[] lII;

    /*
     * Enabled aggressive block sorting
     */
    private void I(List<IIIlIIIII> list) {
        List<IIIlIIIII> list2 = list == null ? List.of() : List.copyOf(list);
        if (Illllll.Il(this.I, list2)) return;
        this.I = list2;
        this.Illl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean Il(List<IIIlIIIII> list, List<IIIlIIIII> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null) return false;
        if (list2 == null) return false;
        if (list.size() != list2.size()) {
            return false;
        }
        int n = 0;
        while (n < list.size()) {
            if (!list.get(n).lllI(list2.get(n))) {
                return false;
            }
            ++n;
        }
        return true;
    }

    @Override
    public void Ill() {
        this.I(this.II);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void lI(int n, String string) {
        ArrayList<IIIlIIIII> arrayList = new ArrayList<IIIlIIIII>(this.I);
        if (n < 0) return;
        if (n < arrayList.size()) {
            String string2 = Illllll.IIlI(string);
            if (string2.isEmpty()) {
                arrayList.remove(n);
            } else {
                arrayList.set(n, StringFactory.lIl(string2));
            }
            this.I(arrayList);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void l(JsonElement jsonElement) {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            this.IlII(List.of());
            return;
        }
        if (!jsonElement.isJsonArray()) {
            if (!jsonElement.isJsonPrimitive()) return;
            this.IlII(IlIIllI.lIIl(jsonElement.getAsString(), this.l.IIII()));
            return;
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator iterator = jsonElement.getAsJsonArray().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.IlII(arrayList);
                return;
            }
            JsonElement jsonElement2 = (JsonElement)iterator.next();
            if (jsonElement2 == null || !jsonElement2.isJsonPrimitive()) continue;
            arrayList.add(jsonElement2.getAsString());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static List<String> IIl(List<IIIlIIIII> list) {
        if (list == null || list.isEmpty()) {
            return List.of();
        }
        ArrayList<String> arrayList = new ArrayList<String>(list.size());
        Iterator<IIIlIIIII> iterator = list.iterator();
        while (iterator.hasNext()) {
            IIIlIIIII iIIlIIIII = iterator.next();
            arrayList.add(iIIlIIIII.IIII());
        }
        return List.copyOf(arrayList);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void IlI(String string) {
        String string2 = Illllll.IIlI(string);
        if (string2.isEmpty()) {
            return;
        }
        ArrayList<IIIlIIIII> arrayList = new ArrayList<IIIlIIIII>(this.I);
        arrayList.add(StringFactory.lIl(string2));
        this.I(arrayList);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public JsonElement III() {
        JsonArray jsonArray = new JsonArray();
        Iterator<IIIlIIIII> iterator = this.I.iterator();
        while (iterator.hasNext()) {
            IIIlIIIII iIIlIIIII = iterator.next();
            jsonArray.add((JsonElement)new JsonPrimitive(iIIlIIIII.IIII()));
        }
        return jsonArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void llI(String string) {
        if (string == null) {
            return;
        }
        ArrayList<IIIlIIIII> arrayList = new ArrayList<IIIlIIIII>(this.I);
        if (!arrayList.removeIf(iIIlIIIII -> iIIlIIIII.Il(string))) return;
        this.I(arrayList);
    }

    public List<String> lll() {
        return Illllll.IIl(this.I);
    }

    /*
     * Unable to fully structure code
     */
    private static List<IIIlIIIII> IIII(Collection<?> var0) {
        block10: {
            block8: {
                block7: {
                    block14: {
                        block9: {
                            block11: {
                                block12: {
                                    block6: {
                                        block13: {
                                            if (var0 == null) break block12;
                                            break block13;
lbl3:
                                            // 1 sources

                                            while (true) {
                                                if (!(var3_3 instanceof IIIlIIIII)) break block6;
                                                break block7;
                                                break;
                                            }
lbl6:
                                            // 1 sources

                                            while (true) {
                                                break block8;
                                                break;
                                            }
lbl8:
                                            // 3 sources

                                            while (true) {
                                                if (!var2_2.hasNext()) break block9;
                                                break block10;
                                                break;
                                            }
lbl11:
                                            // 1 sources

                                            while (true) {
                                                v0 = var3_3.toString();
                                                break block11;
                                                break;
                                            }
                                        }
                                        ** while (!var0.isEmpty())
lbl16:
                                        // 1 sources

                                        break block12;
lbl17:
                                        // 2 sources

                                        while (true) {
                                            if (var4_4.lIlI()) ** GOTO lbl8
                                            var1_1.add(var4_4);
                                            ** GOTO lbl8
                                            break;
                                        }
                                    }
                                    ** while (var3_3 != null)
lbl24:
                                    // 1 sources

                                    break block14;
                                }
                                return List.of();
                            }
lbl28:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        return List.copyOf(var1_1);
                    }
                    v0 = null;
                    ** while (true)
                }
                var5_5 = (IIIlIIIII)var3_3;
                var4_4 = var5_5;
                ** GOTO lbl17
                var6_6 = Illllll.IIlI(v0);
                var4_4 = StringFactory.lIl(var6_6);
                ** while (true)
            }
            var1_1 = new ArrayList<IIIlIIIII>();
            var2_2 = var0.iterator();
            ** while (true)
        }
        var3_3 = var2_2.next();
        ** while (true)
    }

    public List<String> IIIl() {
        return Illllll.IIl(this.II);
    }

    private static String IIlI(String string) {
        return string != null ? string.trim() : "";
    }

    public Illllll(Object object, Collection<?> collection) {
        this(object, collection, StringFactory.IIII(";"));
    }

    public Illllll(String string, Collection<?> collection, String string2) {
        this((Object)string, collection, string2);
    }

    public List<IIIlIIIII> IIll() {
        return this.I;
    }

    public Illllll(Object object, Collection<?> collection, String string) {
        this(object, collection, (Object)string);
    }

    public void IlII(List<String> list) {
        this.I(Illllll.IIII(list));
    }

    public Illllll(String string, Collection<?> collection) {
        this((Object)string, collection, StringFactory.IIII(";"));
    }

    /*
     * Enabled aggressive block sorting
     */
    public Illllll(Object object, Collection<?> collection, Object object2) {
        IIIlIIIII iIIlIIIII;
        block3: {
            String string;
            block4: {
                block2: {
                    block1: {
                        block0: {
                            super(object, List.of());
                            this.II = Illllll.IIII(collection);
                            this.I = this.II;
                            if (object2 instanceof IIIlIIIII) break block0;
                            if (object2 != null && !object2.toString().isBlank()) break block1;
                            break block2;
                        }
                        IIIlIIIII iIIlIIIII2 = (IIIlIIIII)object2;
                        iIIlIIIII = iIIlIIIII2;
                        break block3;
                    }
                    string = object2.toString();
                    break block4;
                }
                string = ";";
            }
            iIIlIIIII = StringFactory.lIl(string);
        }
        this.l = iIIlIIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IlIl(String string, int n) {
        String string2 = Illllll.IIlI(string);
        if (string2.isEmpty()) {
            return;
        }
        ArrayList<IIIlIIIII> arrayList = new ArrayList<IIIlIIIII>(this.I);
        arrayList.add(0, StringFactory.lIl(string2));
        int n2 = Math.max(0, n);
        while (true) {
            if (arrayList.size() <= n2) {
                this.I(arrayList);
                return;
            }
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IllI(int n) {
        ArrayList<IIIlIIIII> arrayList = new ArrayList<IIIlIIIII>(this.I);
        if (n < 0) return;
        if (n < arrayList.size()) {
            arrayList.remove(n);
            this.I(arrayList);
            return;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            block11: {
                var0 = 32387;
                var1_1 = "\u5402\u5473\u54b2\u54cb\u238a\u23fb\u233a\u2343\u5e54\u5e25\u5ee4\u5e9d";
                var2_2 = "\u0004\u0004\u0004".toCharArray();
                var3_3 = new String[var2_2.length];
                var7_7 = -1;
                break block11;
                var3_3[var4_4] = new String(var8_8).intern();
                var5_5 += var6_6;
                if (++var4_4 < var2_2.length) break block12;
                var7_7 = 0;
            }
            var4_4 = 0;
            var5_5 = 0;
            var6_6 = '\u0000';
            if (var7_7 == 0) {
                Illllll.Il = var3_3;
                Illllll.lII = new Object[var3_3.length];
                return;
            }
        }
        var6_6 = var2_2[var4_4];
        var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
        var9_9 = 0;
lbl23:
        // 2 sources

        switch (var9_9 % 6) {
            default: {
                v0 = 126;
                break;
            }
            case 1: {
                v0 = 29;
                break;
            }
            case 4: {
                v0 = 65;
                break;
            }
            case 2: {
                v0 = 127;
                break;
            }
            case 3: {
                v0 = 91;
                break;
            }
            case 5: {
                v0 = 101;
            }
        }
        var10_10 = v0;
        v1 = var9_9++;
        var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
        if (var9_9 < var8_8.length) ** GOTO lbl23
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IIIII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xDA0B663F;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lII[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            Illllll.lII[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xC19DC33D;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 5: {
                    n6 = 143;
                    continue block33;
                }
                case 3: {
                    n6 = 31;
                    continue block33;
                }
                case 24: {
                    n6 = 193;
                    continue block33;
                }
                case 16: {
                    n6 = 221;
                    continue block33;
                }
                case 21: {
                    n6 = 25;
                    continue block33;
                }
                case 18: {
                    n6 = 239;
                    continue block33;
                }
                case 9: {
                    n6 = 166;
                    continue block33;
                }
                default: {
                    n6 = 185;
                    continue block33;
                }
                case 10: {
                    n6 = 125;
                    continue block33;
                }
                case 1: {
                    n6 = 171;
                    continue block33;
                }
                case 17: {
                    n6 = 45;
                    continue block33;
                }
                case 2: {
                    n6 = 66;
                    continue block33;
                }
                case 6: {
                    n6 = 48;
                    continue block33;
                }
                case 31: {
                    n6 = 13;
                    continue block33;
                }
                case 19: {
                    n6 = 147;
                    continue block33;
                }
                case 14: {
                    n6 = 52;
                    continue block33;
                }
                case 11: {
                    n6 = 108;
                    continue block33;
                }
                case 22: {
                    n6 = 240;
                    continue block33;
                }
                case 26: {
                    n6 = 20;
                    continue block33;
                }
                case 12: {
                    n6 = 73;
                    continue block33;
                }
                case 25: {
                    n6 = 53;
                    continue block33;
                }
                case 23: {
                    n6 = 28;
                    continue block33;
                }
                case 4: {
                    n6 = 77;
                    continue block33;
                }
                case 29: {
                    n6 = 225;
                    continue block33;
                }
                case 7: {
                    n6 = 47;
                    continue block33;
                }
                case 8: {
                    n6 = 192;
                    continue block33;
                }
                case 13: {
                    n6 = 107;
                    continue block33;
                }
                case 30: {
                    n6 = 53;
                    continue block33;
                }
                case 27: {
                    n6 = 235;
                    continue block33;
                }
                case 28: {
                    n6 = 137;
                    continue block33;
                }
                case 20: {
                    n6 = 194;
                    continue block33;
                }
                case 15: 
            }
            n6 = 7;
        }
        return new String(cArray).intern();
    }
}

