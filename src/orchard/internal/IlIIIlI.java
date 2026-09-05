/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - controlPanelScroll
 *   - selectedModule
 *   - moduleScroll
 *   - configScroll
 *   - themeScroll
 *   - selectedHud
 *   - themeFilter
 *   - bindScroll
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.core.Theme;
import orchard.internal.Illl;
import orchard.internal.IlllIlIl;
import orchard.internal.lIIIIlll;

@Environment(value=EnvType.CLIENT)
final class IlIIIlI {
    private boolean I;
    Illl l;
    private static final double II = 420.0;
    private static final double Il = 382.0;
    double lI;
    private static final double ll = 0.36;
    double III;
    double IIl;
    private final EnumMap<Category, Double> IlI;
    private boolean Ill;
    private static final double lII = 1.75;
    lIIIIlll lIl;
    double llI;
    private long lll;
    double IIII;
    private long IIIl;
    double IIlI;
    Theme IIll;
    Category IlII = Category.II;
    private final Set<Long> IlIl;
    double IllI;
    double Illl;
    private static final double lIII = 620.0;
    double lIIl;
    private boolean lIlI;
    private static final double lIll = 382.0;
    double llII;
    double llIl;
    double lllI;
    private static final int[] llll;
    private static final String[] IIIII;
    private static final Object[] IIIIl;

    /*
     * Enabled aggressive block sorting
     */
    boolean I(ModuleBase moduleBase) {
        if (moduleBase == null) return false;
        if (!this.I) return false;
        if (this.IIIl == moduleBase.IlIIllI()) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    void l(ModuleBase moduleBase) {
        this.I = moduleBase != null;
        this.IIIl = moduleBase != null ? moduleBase.IlIIllI() : 0L;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean II(ModuleBase moduleBase) {
        if (moduleBase == null) return false;
        if (!this.IlIl.contains(moduleBase.IlIIllI())) return false;
        return true;
    }

    private static Long Il(String string) {
        if (string == null || string.isBlank()) {
            return null;
        }
        if (string.length() == 17 && string.charAt(0) == 'h') {
            try {
                return Long.parseUnsignedLong(string.substring(1), 16);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return StringFactory.I(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean lI(long l2) {
        if (!this.lIlI) return false;
        if (this.lll != l2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    IlIIIlI() {
        this.l = orchard.internal.Illl.Il;
        this.IIll = Theme.Illl;
        this.lIl = lIIIIlll.lI;
        this.IlI = new EnumMap(Category.class);
        this.IlIl = new HashSet<Long>();
        Category[] categoryArray = Category.values();
        int n = categoryArray.length;
        int n2 = 0;
        while (n2 < n) {
            Category category = categoryArray[n2];
            this.IlI.put(category, 0.0);
            ++n2;
        }
        return;
    }

    void ll() {
        this.lIlI = false;
    }

    void III(long l2) {
        this.lIlI = true;
        this.lll = l2;
    }

    void IIl(JsonObject jsonObject) {
        if (jsonObject == null) {
            return;
        }
        this.Ill = jsonObject.has("panelX");
        this.IllI = IlIIIlI.IlI(jsonObject, "panelX", this.IllI);
        this.III = IlIIIlI.IlI(jsonObject, "panelY", this.III);
        this.llI = IlIIIlI.IlI(jsonObject, "panelW", this.llI);
        this.IIl = IlIIIlI.IlI(jsonObject, "panelH", this.IIl);
        this.IIlI = IlIIIlI.IlI(jsonObject, "dockX", this.IIlI);
        this.lIIl = IlIIIlI.IlI(jsonObject, "dockY", this.lIIl);
        this.Illl = IlIIIlI.IlI(jsonObject, "moduleScroll", this.Illl);
        this.llII = IlIIIlI.IlI(jsonObject, "bindScroll", this.llII);
        this.lI = IlIIIlI.IlI(jsonObject, "configScroll", this.lI);
        this.lllI = IlIIIlI.IlI(jsonObject, "themeScroll", this.lllI);
        this.llIl = IlIIIlI.IlI(jsonObject, "hudScroll", this.llIl);
        this.IIII = IlIIIlI.IlI(jsonObject, "controlPanelScroll", this.IIII);
        Long l2 = IlIIIlI.lIlI(jsonObject, "selectedModule");
        this.I = l2 != null;
        this.IIIl = l2 == null ? 0L : l2;
        Long l3 = IlIIIlI.lIlI(jsonObject, "selectedHud");
        this.lIlI = l3 != null;
        this.lll = l3 == null ? 0L : l3;
        this.IlII = (Category)IlIIIlI.IlII((JsonObject)jsonObject, (String)"category", (Enum[])Category.values(), (Enum)this.IlII);
        this.IIll = (Theme)IlIIIlI.IlII((JsonObject)jsonObject, (String)"theme", (Enum[])Theme.values(), (Enum)this.IIll);
        this.lIl = IlIIIlI.lIIl(jsonObject, "themeFilter", this.lIl);
        JsonElement jsonElement = jsonObject.get("scrolls");
        if (jsonElement != null && jsonElement.isJsonArray()) {
            var5_5 = jsonElement.getAsJsonArray();
            JsonElement jsonElement2 = Category.values();
            for (int i = 0; i < ((Category[])jsonElement2).length && i < var5_5.size(); ++i) {
                try {
                    this.lII(jsonElement2[i], var5_5.get(i).getAsDouble());
                    continue;
                }
                catch (RuntimeException runtimeException) {
                    // empty catch block
                }
            }
        } else if (jsonElement != null && jsonElement.isJsonObject()) {
            var5_5 = jsonElement.getAsJsonObject();
            for (Category category : Category.values()) {
                this.lII(category, IlIIIlI.IIlI((JsonObject)var5_5, category, this.llI(category)));
            }
        }
        if (jsonObject.has("expanded") && jsonObject.get("expanded").isJsonArray()) {
            this.IlIl.clear();
            for (JsonElement jsonElement2 : jsonObject.getAsJsonArray("expanded")) {
                Long l4;
                if (jsonElement2 == null || !jsonElement2.isJsonPrimitive() || (l4 = IlIIIlI.Il(jsonElement2.getAsString())) == null) continue;
                this.IlIl.add(l4);
            }
        }
    }

    private static double IlI(JsonObject jsonObject, String string, double d) {
        if (!jsonObject.has(string) || !jsonObject.get(string).isJsonPrimitive()) {
            return d;
        }
        try {
            return jsonObject.get(string).getAsDouble();
        }
        catch (RuntimeException runtimeException) {
            return d;
        }
    }

    private static String Ill(JsonObject jsonObject, String string, String string2) {
        if (!jsonObject.has(string) || !jsonObject.get(string).isJsonPrimitive()) {
            return string2;
        }
        try {
            return jsonObject.get(string).getAsString();
        }
        catch (RuntimeException runtimeException) {
            return string2;
        }
    }

    void lII(Category category, double d) {
        this.IlI.put(category, Math.max(0.0, d));
    }

    /*
     * Enabled aggressive block sorting
     */
    void lIl(int n, int n2) {
        this.llI = IlIIIlI.Illl(!(this.llI <= 0.0) ? this.llI : this.llII(n), 420.0, Math.max(420.0, (double)n - 12.0));
        this.IIl = IlIIIlI.Illl(this.IIl <= 0.0 ? this.IlIl(n2) : this.IIl, 382.0, Math.max(382.0, (double)n2 - 48.0));
        this.lIII(n, n2);
        this.IllI = Math.max(4.0, ((double)n - this.llI) * 0.5);
        this.III = Math.max(4.0, ((double)n2 - this.IIl) * 0.36);
        this.IIlI = Math.max(4.0, ((double)n - 348.0) * 0.5);
        this.lIIl = Math.max(4.0, (double)n2 - 42.0);
        this.Ill = true;
        this.lll(n, n2);
    }

    double llI(Category category) {
        return this.IlI.getOrDefault((Object)category, 0.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    void lll(int n, int n2) {
        this.llI = IlIIIlI.Illl(this.llI, 420.0, Math.max(420.0, (double)n - 12.0));
        this.IIl = IlIIIlI.Illl(this.IIl, 382.0, Math.max(382.0, (double)n2 - 48.0));
        this.IllI = IlIIIlI.Illl(this.IllI, 4.0, Math.max(4.0, (double)n - this.llI - 4.0));
        this.III = IlIIIlI.Illl(this.III, 4.0, Math.max(4.0, (double)n2 - this.IIl - 8.0));
        this.IIlI = IlIIIlI.Illl(this.IIlI, 4.0, Math.max(4.0, (double)n - 356.0));
        this.lIIl = IlIIIlI.Illl(this.lIIl, 4.0, Math.max(4.0, (double)n2 - 34.0));
    }

    void IIII() {
        this.IlIl.clear();
        this.I = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    void IIIl(int n, int n2) {
        if (!this.Ill) {
            this.llI = this.llII(n);
            this.IIl = this.IlIl(n2);
            this.IllI = Math.max(8.0, ((double)n - this.llI) * 0.5);
            this.III = Math.max(10.0, ((double)n2 - this.IIl) * 0.36);
            this.IIlI = Math.max(8.0, ((double)n - 348.0) * 0.5);
            this.lIIl = Math.max(8.0, (double)n2 - 42.0);
            this.Ill = true;
        }
        this.lll(n, n2);
    }

    private static double IIlI(JsonObject jsonObject, Enum<?> enum_, double d) {
        if (enum_ instanceof IlllIlIl) {
            IlllIlIl illlIlIl = (IlllIlIl)((Object)enum_);
            long l2 = illlIlIl.l();
            for (Map.Entry entry : jsonObject.entrySet()) {
                if (StringFactory.I((String)entry.getKey()) != l2 || !((JsonElement)entry.getValue()).isJsonPrimitive()) continue;
                try {
                    return ((JsonElement)entry.getValue()).getAsDouble();
                }
                catch (RuntimeException runtimeException) {
                    return d;
                }
            }
            return d;
        }
        return IlIIIlI.IlI(jsonObject, enum_.name(), d);
    }

    void IIll(ModuleBase moduleBase) {
        if (moduleBase != null) {
            this.IlIl.remove(moduleBase.IlIIllI());
        }
    }

    private static <E extends Enum<E>> E IlII(JsonObject jsonObject, String string, E[] EArray, E e) {
        JsonElement jsonElement = jsonObject.get(string);
        if (jsonElement == null || !jsonElement.isJsonPrimitive()) {
            return e;
        }
        try {
            int n = jsonElement.getAsInt();
            if (n >= 0 && n < EArray.length) {
                return EArray[n];
            }
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        String string2 = jsonElement.getAsString();
        for (E e2 : EArray) {
            if (!IlllIlIl.I(e2, string2)) continue;
            return e2;
        }
        return e;
    }

    private double IlIl(int n) {
        return IlIIIlI.Illl(382.0, 382.0, Math.max(382.0, (double)n - 54.0));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IllI(long l2) {
        String string = Long.toUnsignedString(l2, 16);
        StringBuilder stringBuilder = new StringBuilder(17).append('h');
        int n = string.length();
        while (n < 16) {
            stringBuilder.append('0');
            ++n;
        }
        return stringBuilder.append(string).toString();
    }

    private static double Illl(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIII(int n, int n2) {
        double d = Math.max(420.0, (double)n - 12.0);
        double d2 = Math.max(382.0, (double)n2 - 48.0);
        this.llI = Math.min(620.0, d);
        this.IIl = Math.min(382.0, d2);
        if (this.IIl <= 0.0) return;
        if (!(this.llI / this.IIl <= 1.75)) {
            this.llI = IlIIIlI.Illl(this.IIl * 1.75, 420.0, d);
            if (!(this.llI / this.IIl > 1.75)) return;
            this.IIl = IlIIIlI.Illl(this.llI / 1.75, 382.0, d2);
            return;
        }
    }

    private static lIIIIlll lIIl(JsonObject jsonObject, String string, lIIIIlll lIIIIlll2) {
        JsonElement jsonElement = jsonObject.get(string);
        if (jsonElement == null || !jsonElement.isJsonPrimitive()) {
            return lIIIIlll2;
        }
        try {
            int n = jsonElement.getAsInt();
            lIIIIlll[] lIIIIlllArray = lIIIIlll.values();
            if (n >= 0 && n < lIIIIlllArray.length) {
                return lIIIIlllArray[n];
            }
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        return lIIIIlll.Il(jsonElement.getAsString());
    }

    private static Long lIlI(JsonObject jsonObject, String string) {
        JsonElement jsonElement = jsonObject.get(string);
        return jsonElement != null && jsonElement.isJsonPrimitive() ? IlIIIlI.Il(jsonElement.getAsString()) : null;
    }

    /*
     * Enabled aggressive block sorting
     */
    void lIll(ModuleBase moduleBase) {
        if (moduleBase == null) {
            return;
        }
        long l2 = moduleBase.IlIIllI();
        if (this.IlIl.remove(l2)) return;
        this.IlIl.add(l2);
        this.IIIl = l2;
        this.I = true;
    }

    private double llII(int n) {
        return IlIIIlI.Illl(620.0, 420.0, Math.max(420.0, (double)n - 16.0));
    }

    /*
     * Enabled aggressive block sorting
     */
    JsonObject llIl() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("panelX", (Number)this.IllI);
        jsonObject.addProperty("panelY", (Number)this.III);
        jsonObject.addProperty("panelW", (Number)this.llI);
        jsonObject.addProperty("panelH", (Number)this.IIl);
        jsonObject.addProperty("dockX", (Number)this.IIlI);
        jsonObject.addProperty("dockY", (Number)this.lIIl);
        jsonObject.addProperty("category", (Number)this.IlII.ordinal());
        jsonObject.addProperty("theme", (Number)this.IIll.ordinal());
        jsonObject.addProperty("themeFilter", (Number)this.lIl.ordinal());
        jsonObject.addProperty("moduleScroll", (Number)this.Illl);
        jsonObject.addProperty("bindScroll", (Number)this.llII);
        jsonObject.addProperty("configScroll", (Number)this.lI);
        jsonObject.addProperty("themeScroll", (Number)this.lllI);
        jsonObject.addProperty("hudScroll", (Number)this.llIl);
        jsonObject.addProperty("controlPanelScroll", (Number)this.IIII);
        if (this.I) {
            jsonObject.addProperty("selectedModule", IlIIIlI.IllI(this.IIIl));
        }
        if (this.lIlI) {
            jsonObject.addProperty("selectedHud", IlIIIlI.IllI(this.lll));
        }
        JsonArray jsonArray = new JsonArray();
        for (Category category : Category.values()) {
            jsonArray.add((Number)this.llI(category));
        }
        jsonObject.add("scrolls", (JsonElement)jsonArray);
        JsonArray jsonArray2 = new JsonArray();
        Iterator<Long> iterator = this.IlIl.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                jsonObject.add("expanded", (JsonElement)jsonArray2);
                return jsonObject;
            }
            long l2 = iterator.next();
            jsonArray2.add(IlIIIlI.IllI(l2));
        }
    }

    private static int lllI(int n, int n2) {
        return llll[n ^ 0x930645B2] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block20: {
            block18: {
                block19: {
                    block17: {
                        block15: {
                            block16: {
                                break block19;
lbl1:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl3:
                                // 1 sources

                                while (true) {
                                    var9_5 = new String[var8_4.length];
                                    break block15;
                                    break;
                                }
lbl6:
                                // 1 sources

                                while (true) {
                                    var11_7 += var12_8;
                                    break block16;
                                    break;
                                }
lbl9:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl11:
                                // 1 sources

                                return;
                            }
                            while (++var10_6 >= var8_4.length) {
                                break block17;
                            }
                            break block20;
lbl17:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                var9_5[var10_6] = var7_3.substring(var11_7, var11_7 + var12_8);
                                ** continue;
                                break;
                            }
lbl22:
                            // 2 sources

                            while (true) {
                                var10_6 = 0;
                                ** continue;
                                break;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var3_11 += 4;
                                if (++var4_12 < var1_10) ** GOTO lbl17
                                ** continue;
                                break;
                            }
lbl29:
                            // 1 sources

                            while (true) {
                                var8_4 = "\u485f\u485f\u485f\u485f\u485f\u485f\u485f\u4847\u4847\u4847\u4847\u485b\u484f\u4843\u4847\u485b\u485f\u4847\u485b\u485b\u485b\u485b\u485f\u485f\u485f\u485f\u485f\u485f\u485b\u485f\u4847\u4847\u4847\u4847\u4847\u485b\u484f\u4843\u4847\u485b\u485b".toCharArray();
                                ** continue;
                                break;
                            }
lbl32:
                            // 1 sources

                            while (var13_9 == 0) {
                                break block18;
                            }
                            break block20;
                        }
                        var13_9 = -1;
                        ** GOTO lbl22
lbl38:
                        // 1 sources

                        while (true) {
                            var0_1 = "G3\u0010\u00a1\u0085\u0015\u0082\u00be(\u00cbS\\D\u0018\u009b\u0010\u009d0l\u00b8WY\u00f3\u00f8\u00c2x\u00fa\n5\u0095C\u00f7".getBytes("ISO-8859-1");
                            ** continue;
                            break;
                        }
lbl41:
                        // 1 sources

                        while (true) {
                            IlIIIlI.IIIIl = new Object[var9_5.length];
                            var2_2 = -305679942;
                            ** continue;
                            break;
                        }
lbl45:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        var5_13 = (var0_1[var3_11] & 255) << 24 | (var0_1[var3_11 + 1] & 255) << 16 | (var0_1[var3_11 + 2] & 255) << 8 | var0_1[var3_11 + 3] & 255;
                        IlIIIlI.llll[var4_12] = var5_13 ^= var2_2;
                        ** while (true)
                    }
                    var13_9 = 0;
                    ** while (true)
                    var1_10 = var0_1.length / 4;
                    IlIIIlI.llll = new int[var1_10];
                    ** while (true)
                    var11_7 = 0;
                    var12_8 = 0;
                    ** GOTO lbl32
                    var3_11 = 0;
                    var4_12 = 0;
                    ** while (true)
                }
                var6 = 18519;
                var7_3 = "\u2ff1\u2fbb\u2f65\u2f14\u2ffd\u2f9f\u2f19\u2f67\u1ddc\u1d96\u1d48\u1d39\u1dd0\u1db2\u1d34\u1d4a\u1890\u18da\u1804\u1875\u189c\u18fe\u1878\u1805\u9648\u9602\u96dc\u96ad\u9644\u9626\u96a0\u96cf\u1fd5\u1f9f\u1f41\u1f30\u1fd9\u1fbb\u1f3d\u1f1a\u710f\u7142\u71be\u71d4\u7105\u714d\u71f3\u71d5\u3aaf\u3ae2\u3a1e\u3a74\u3aa5\u3aed\u3a57\u3a75\u8ca7\u8cf8\u8c14\u8c77\u8caa\u8ccc\u8c4a\u8c11\u8c79\u8c39\u8cac\u8cfd\u8c78\u8cef\u8c78\u8c09\ua68b\ua6ff\ua67c\ua66a\ua683\ua6f0\ua641\ua63a\ua65c\ua604\ua6e5\ua6f4\ua655\ua6b6\ua626\ua64f\ub9a3\ub992\ub911\ub942\ub9ab\ub9f3\ub95b\ub916\ub97c\ub93c\ub9a9\ub9f8\ub97d\ub9ea\ub97d\ub90c\ub8a7\ub8ee\ub81e\ub872\ub8ae\ub8ca\ub862\ub82f\ub873\ub830\ub8b7\ub8e4\ub87e\ub896\ub87d\ub864\u5c89\u5cc2\u5c0f\u5c5e\u5c98\u5ccf\u5c45\u5c2d\u5c51\u5c10\u5ced\u5cf0\ub918\ub929\ub9aa\ub9f9\ub914\ub961\ub9d6\ub9a5\ub9c6\ub9bc\ub940\ub952\ub9c6\ub914\ub9f8\ub9b7\ub93a\ub947\ub9e3\ub979\ub91a\ub907\ub993\ub9c2\u1d48\u1d7d\u1dcc\u1d95\u1d44\u1d26\u1d86\u1dec\u1d9c\u1df9\u1d04\u1d67\u1d92\u1d05\u1da8\u1df8\u1d7f\u1d64\u1daa\u1d5d\ued38\ued0d\uedbc\uede5\ued34\ued56\uedf6\ued9c\uedec\ued89\ued74\ued0e\uede8\ued1a\ueddf\uedf8\uf246\uf277\uf2d6\uf287\uf24e\uf22c\uf2c9\uf2fb\uf291\uf2c6\uf232\uf266\u7506\u754f\u75bf\u75d3\u750f\u756b\u75cc\u75d8\ueefa\ueeb3\uee43\uee2f\ueef3\uee97\uee3f\uee61\uee2c\uee48\uee9f\ueea4\uee25\ueed8\uee5d\uee39\u62a1\u6294\u6207\u6262\u62ab\u62e5\u6249\u6223\u6272\u6235\u62b9\u6285\ubc8a\ubcd4\ubc37\ubc4c\ubc82\ubce3\ubc57\ubc39\ubc59\ubc3c\ubccf\ubca9\u06b2\u06ec\u060f\u0674\u06ba\u06db\u066f\u0601\u0661\u0604\u06f7\u0691\u3b88\u3bd6\u3b35\u3b4e\u3b80\u3be1\u3b55\u3b3b\u3b5b\u3b3e\u3bcd\u3bab\u1016\u105c\u1082\u10f3\u101a\u1078\u10fe\u1080\uedc0\ued8a\ued54\ued25\uedcc\uedae\ued28\ued55\u40d9\u4093\u404d\u403c\u40d5\u40b7\u4031\u405e\u8898\u88d2\u880c\u887d\u8894\u88f6\u8870\u8857\u5c8f\u5cc2\u5c3e\u5c54\u5c85\u5ccd\u5c73\u5c55\ucc8c\uccc1\ucc3d\ucc57\ucc86\uccce\ucc74\ucc56\ua608\ua639\ua698\ua6c9\ua600\ua662\ua687\ua6b5\ua6df\ua688\ua67c\ua628\ua550\ua519\ua5e9\ua585\ua559\ua53d\ua59a\ua58e\ucfe0\ucfa9\ucf59\ucf35\ucfe9\ucf8d\ucf25\ucf7b\ucf36\ucf52\ucf85\ucfbe\ucf3f\ucfc2\ucf47\ucf23\u2c6d\u2c32\u2cde\u2cbd\u2c60\u2c06\u2c80\u2cdb\u2cb3\u2cf3\u2c66\u2c37\u2cb2\u2c25\u2cb2\u2cc3\ub486\ub4f2\ub471\ub467\ub48e\ub4fd\ub44c\ub437\ub451\ub409\ub4e8\ub4f9\ub458\ub4bb\ub42b\ub442\u87f7\u87c6\u8745\u8716\u87ff\u87a7\u870f\u8742\u8728\u8768\u87fd\u87ac\u8729\u87be\u8729\u8758\u6779\u6730\u67c0\u67ac\u6770\u6714\u67bc\u67f1\u67ad\u67ee\u6769\u673a\u67a0\u6748\u67a3\u67ba\u216e\u2125\u21e8\u21b9\u217f\u2128\u21a2\u21ca\u21b6\u21f7\u210a\u2117\u8f34\u8f05\u8f86\u8fd5\u8f38\u8f4d\u8ffa\u8f89\u8fea\u8f90\u8f6c\u8f7e\u8fea\u8f38\u8fd4\u8f9b\u8f16\u8f6b\u8fcf\u8f55\u8f36\u8f2b\u8fbf\u8fee\u1faa\u1f9f\u1f2e\u1f77\u1fa6\u1fc4\u1f64\u1f0e\u1f7e\u1f1b\u1fe6\u1f85\u1f70\u1fe7\u1f4a\u1f1a\u1f9d\u1f86\u1f48\u1fbf\u63aa\u639f\u632e\u6377\u63a6\u63c4\u6364\u630e\u637e\u631b\u63e6\u639c\u637a\u6388\u634d\u636a\ue4fc\ue4c9\ue45a\ue43f\ue4f6\ue4b8\ue414\ue47e\ue42f\ue468\ue4e4\ue4d8\u5c13\u5c4d\u5cae\u5cd5\u5c1b\u5c7a\u5cce\u5ca0\u5cc0\u5ca5\u5c56\u5c30";
                ** while (true)
            }
            IlIIIlI.IIIII = var9_5;
            ** while (true)
        }
        var12_8 = var8_4[var10_6] ^ var6;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xD54D46E2;
        char[] cArray = IIIII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIIIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIIlI.IIIIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x81447561;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 16 -> 60;
                case 27 -> 24;
                case 20 -> 39;
                case 12 -> 210;
                case 15 -> 183;
                case 21 -> 11;
                case 22 -> 150;
                case 23 -> 205;
                case 17 -> 95;
                case 13 -> 50;
                case 28 -> 61;
                case 4 -> 43;
                case 31 -> 80;
                case 3 -> 206;
                case 1 -> 74;
                case 25 -> 147;
                case 10 -> 111;
                case 26 -> 111;
                case 14 -> 222;
                case 19 -> 98;
                case 30 -> 215;
                case 24 -> 178;
                case 29 -> 232;
                case 2 -> 136;
                default -> 35;
                case 6 -> 244;
                case 7 -> 170;
                case 11 -> 83;
                case 5 -> 118;
                case 8 -> 200;
                case 18 -> 241;
                case 9 -> 169;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

