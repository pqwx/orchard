/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIlIII
 * Identified from direct evidence; see README.md
 *
 * Recovered strings in this class:
 *   -  is not supported on 
 *   - Unsupported platform
 *   - Switch Back
 *   - .getBytes(
 *   - settings
 *   - keyBind
 *   - enabled
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.entity.Entity
 *  net.minecraft.network.packet.Packet
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package orchard.core;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.ToIntFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.Entity;
import net.minecraft.network.packet.Packet;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIIllIll;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlIIlIl;
import orchard.internal.IIllIl;
import orchard.internal.IIlllIIIl;
import orchard.internal.IlIIllI;
import orchard.internal.IlIIlllll;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllII;
import orchard.internal.lIIllllI;
import orchard.internal.ll;
import orchard.internal.lllIlIII;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public abstract class ModuleBase {
    private static final Logger IlIlIIl;
    private volatile long IlIlIlI;
    private boolean IlIlIll;
    private InputUtil.Key IlIllII;
    private InputUtil.Key IlIllIl;
    private final Category IlIlllI;
    private List<Object> IlIllll;
    private final List<IIllIl<?>> IllIIII = new ArrayList();
    private boolean IllIIIl;
    private static final long IllIIlI;
    private final IIIlIIIII IllIIll;
    private final IIIlIIIII IllIlII;
    private boolean IllIlIl;
    private final boolean IllIllI;
    private volatile boolean IllIlll;
    private static final long IlllIII;
    private static final long IlllIIl;
    private boolean IlllIlI;
    private static final int[] IlllIll;
    private static final String[] IllllII;
    private static final Object[] IllllIl;

    public String llIlll() {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void lllIII(boolean bl) {
        if (!this.IllIllI) return;
        if (this.IllIlIl != bl) {
            boolean bl2 = this.IIIlIIl();
            boolean bl3 = this.IllIlIl;
            if (bl) {
                this.IllIlll = false;
            }
            this.IllIlIl = bl;
            if (this.IIlIlII(bl2)) return;
            this.IllIlIl = bl3;
            return;
        }
    }

    public void llI(Entity entity, byte by) {
    }

    static void lllIIl(JsonObject jsonObject, long l2, JsonElement jsonElement) {
        if (jsonObject != null) {
            jsonObject.add(ModuleBase.IIIlIll(l2), jsonElement);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static void lllIlI(JsonObject jsonObject, long l2) {
        if (jsonObject == null) {
            return;
        }
        jsonObject.remove(ModuleBase.IIIlIll(l2));
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator iterator = jsonObject.keySet().iterator();
        while (true) {
            String string;
            if (iterator.hasNext()) {
                string = (String)iterator.next();
                if (StringFactory.I(string) != l2) continue;
            } else {
                iterator = arrayList.iterator();
                while (iterator.hasNext()) {
                    string = (String)iterator.next();
                    jsonObject.remove(string);
                }
                return;
            }
            arrayList.add(string);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void lllIll(JsonObject jsonObject, String string) {
        if (this.IIIIIII()) return;
        if (jsonObject == null) return;
        if (string == null) return;
        if (!jsonObject.has(StringFactory.IIl("i5FAiBBZVw8="))) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("settings");
        long l2 = StringFactory.I(string);
        JsonElement jsonElement = ModuleBase.IIIIlIl(jsonObject2, l2);
        if (jsonElement == null) return;
        this.IlIllIl = lIIllllI.lIIlIl(jsonElement);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public boolean llllII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) {
            return false;
        }
        if (this.IlIIIIl() && this.IIIIIII() && lIIllllI.llI(minecraftClient, this.IIIllII()) && lIIllllI.IIlIII(minecraftClient, this.IIIllII())) {
            return true;
        }
        Iterator<IIllIl<?>> iterator = this.IllIIII.iterator();
        boolean bl = true;
        while (true) {
            IIllIl<?> iIllIl;
            InputUtil.Key key;
            if (!bl || (bl = false) || !true) {
                if (!lIIllllI.IlIIlll(key) && lIIllllI.llI(minecraftClient, key) && lIIllllI.IIlIII(minecraftClient, key)) {
                    return true;
                }
            }
            do {
                if (!iterator.hasNext()) return false;
            } while (!((iIllIl = iterator.next()) instanceof lIIllII));
            lIIllII lIIllII2 = (lIIllII)iIllIl;
            key = (InputUtil.Key)lIIllII2.lIl();
        }
    }

    protected ModuleBase(Object object, Category category, Object object2) {
        this(object, category, object2, true);
    }

    /*
     * Unable to fully structure code
     */
    public List<IIllIl<?>> IlIlIl() {
        block9: {
            block7: {
                block8: {
                    block5: {
                        block6: {
                            var1_1 = new ArrayList<IIllIl<?>>(this.IllIIII.size());
                            break block6;
                            while (true) {
                                break block5;
                                break;
                            }
                        }
                        var2_2 = this.IllIIII.iterator();
                        break block7;
                    }
                    var3_3 = var2_2.next();
                    if (var3_3.lIlI()) break block8;
                    break block7;
lbl12:
                    // 1 sources

                    return Collections.unmodifiableList(var1_1);
                }
                if (!this.IIIlIII(var3_3)) break block9;
            }
lbl17:
            // 2 sources

            while (true) {
                if (var2_2.hasNext()) ** continue;
                var1_1.sort(Comparator.comparingInt((ToIntFunction<IIllIl>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)I, IIllIlI(orchard.internal.IIllIl ), (Lorchard/internal/IIllIl;)I)((ModuleBase)this)));
                ** continue;
                break;
            }
        }
        var1_1.add(var3_3);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void llllIl() {
        this.IIlIIll(!this.IlIlIll);
    }

    public boolean lllllI() {
        return this.IllIllI;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected final void llllll(JsonObject jsonObject, String string, IIIlIlIIl ... iIIlIlIIlArray) {
        if (jsonObject == null) return;
        if (string == null) return;
        if (iIIlIlIIlArray == null) return;
        if (!jsonObject.has(StringFactory.IIl("i5FAiBBZVw8="))) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("settings");
        JsonElement jsonElement = ModuleBase.IIIIlIl(jsonObject2, StringFactory.I(string));
        if (jsonElement == null) {
            return;
        }
        IIIlIlIIl[] iIIlIlIIlArray2 = iIIlIlIIlArray;
        int n = iIIlIlIIlArray2.length;
        int n2 = 0;
        while (n2 < n) {
            IIIlIlIIl iIIlIlIIl = iIIlIlIIlArray2[n2];
            if (iIIlIlIIl != null && ModuleBase.IIIIIIl(jsonObject2, iIIlIlIIl.lllI()) == null) {
                iIIlIlIIl.l(jsonElement);
            }
            ++n2;
        }
    }

    public void ll() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIIIIII() {
        if (lIIllllI.IlIIlll(this.IlIllIl)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static JsonElement IIIIIIl(JsonObject jsonObject, long l2) {
        Map.Entry entry;
        if (jsonObject == null) {
            return null;
        }
        String string = ModuleBase.IIIlIll(l2);
        if (jsonObject.has(string)) {
            return jsonObject.get(string);
        }
        Iterator iterator = jsonObject.entrySet().iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while (StringFactory.I((String)(entry = (Map.Entry)iterator.next()).getKey()) != l2);
        return (JsonElement)entry.getValue();
    }

    final synchronized void IIIIIlI(int n, Throwable throwable) {
        if (this.IllIlll) {
            return;
        }
        this.IllIlll = true;
        long l2 = ++this.IlIlIlI;
        this.IIIlIlI(n, throwable);
        if (!this.IllIllI) {
            return;
        }
        boolean bl = this.IIIlIIl();
        this.IlIlIll = false;
        this.IllIlIl = false;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        Runnable runnable = () -> this.IIlIIIl(minecraftClient, bl, l2);
        if (minecraftClient != null && !minecraftClient.isOnThread()) {
            try {
                minecraftClient.execute(runnable);
            }
            catch (LinkageError | RuntimeException throwable2) {
                this.IIIlIlI(3, throwable2);
                this.IIlIIII();
            }
        } else {
            runnable.run();
        }
    }

    protected boolean llIIl() {
        return true;
    }

    public void Ill(II iI) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIIIIll(InputUtil.Key key) {
        InputUtil.Key key2;
        InputUtil.Key key3 = key2 = key == null ? InputUtil.UNKNOWN_KEY : key;
        if (Objects.equals(this.IlIllIl, key2)) {
            return;
        }
        this.IlIllIl = key2;
        this.IlIIIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Object IIIIlII(Object object) {
        if (object instanceof double[]) {
            double[] dArray = (double[])object;
            return dArray.clone();
        }
        if (object instanceof int[]) {
            int[] nArray = (int[])object;
            return nArray.clone();
        }
        if (object instanceof long[]) {
            long[] lArray = (long[])object;
            return lArray.clone();
        }
        if (object instanceof byte[]) {
            byte[] byArray = (byte[])object;
            return byArray.clone();
        }
        if (!(object instanceof Object[])) {
            if (!(object instanceof List)) return object;
            List list = (List)object;
            return new ArrayList(list);
        }
        Object[] objectArray = (Object[])object;
        return objectArray.clone();
    }

    /*
     * Unable to fully structure code
     */
    static JsonElement IIIIlIl(JsonObject var0, long var1_1) {
        block18: {
            block19: {
                block11: {
                    block14: {
                        block15: {
                            block16: {
                                block13: {
                                    block17: {
                                        block12: {
                                            if (var0 != null) break block16;
                                            break block17;
lbl3:
                                            // 1 sources

                                            while (true) {
                                                if (var4_3 == null) {
                                                    break block11;
                                                    while (true) {
                                                        break block12;
                                                        break;
                                                    }
                                                }
lbl8:
                                                // 3 sources

                                                while (true) {
                                                    var5_4.add(var8_7);
                                                    ** GOTO lbl14
                                                    break;
                                                }
                                                break;
                                            }
lbl12:
                                            // 1 sources

                                            while (true) {
                                                var6_5 = var0.entrySet().iterator();
lbl14:
                                                // 4 sources

                                                while (true) {
                                                    if (var6_5.hasNext()) ** continue;
                                                    if (var4_3 == null) break block13;
                                                    break block14;
                                                    break;
                                                }
                                                break;
                                            }
lbl18:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        var7_6 = (Map.Entry)var6_5.next();
                                        break block18;
                                    }
                                    return null;
lbl25:
                                    // 1 sources

                                    while (true) {
                                        var0.remove((String)var7_6);
                                        break block15;
                                        break;
                                    }
                                }
lbl30:
                                // 2 sources

                                while (true) {
                                    var6_5 = var5_4.iterator();
                                    break block15;
lbl33:
                                    // 1 sources

                                    return var4_3;
                                }
                            }
                            var3_2 = ModuleBase.IIIlIll(var1_1);
                            ** while (true)
                        }
                        ** while (!var6_5.hasNext())
lbl40:
                        // 1 sources

                        break block19;
                        var4_3 = var0.get(var3_2);
                        var5_4 = new ArrayList<String>();
                        ** while (true)
                    }
                    var0.add(var3_2, var4_3);
                    ** while (true)
                }
                var4_3 = (JsonElement)var7_6.getValue();
                ** while (true)
lbl50:
                // 1 sources

                while (true) {
                    if (StringFactory.I(var8_7) != var1_1) ** GOTO lbl14
                    ** continue;
                    break;
                }
            }
            var7_6 = (String)var6_5.next();
            ** while (true)
        }
        var8_7 = (String)var7_6.getKey();
        if (!var3_2.equals(var8_7)) ** break;
        ** while (true)
        ** while (true)
    }

    public void IllIll(MinecraftClient minecraftClient) {
    }

    /*
     * Enabled aggressive block sorting
     */
    protected ModuleBase(Object object, Category category, Object object2, boolean bl) {
        this.IlIllII = InputUtil.UNKNOWN_KEY;
        this.IlIllIl = InputUtil.UNKNOWN_KEY;
        this.IllIlII = StringFactory.IIIl(object);
        this.IlIlllI = category;
        this.IllIIll = StringFactory.IIIl(object2);
        this.IllIllI = bl;
        this.IlIlIll = !bl;
    }

    public void IIIIllI(Packet<?> packet) {
    }

    public void I(Entity entity) {
    }

    public void IlIIlI(Entity entity) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public String IIIIlll() {
        String string = this.IIIl();
        String string2 = this.lIlll();
        if (string2 == null) return string;
        if (!string2.isBlank()) {
            String string3 = "]";
            String string4 = string2;
            String string5 = " [";
            String string6 = string;
            return string6 + string5 + string4 + string3;
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlIII(IIllIl<?> iIllIl) {
        if (!(this instanceof lllIlIII)) {
            return false;
        }
        long l2 = iIllIl.lllI();
        if (l2 == IllIIlI) return true;
        if (l2 == IlllIIl) return true;
        return false;
    }

    public void lIIII(MinecraftClient minecraftClient) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIIlIIl() {
        if (this.IlIlIll) return true;
        if (!this.IllIlIl) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlIlI(int n, Throwable throwable) {
        IlIlIIl.error(StringFactory.IIl("t4ZXlBhFVFyaB5tMA9aenZmYWJ4YVFtckQmWVQrXhN6Vm1CJFVINB4pIj1EOwNvDg4k="), new Object[]{this.getClass().getName(), n, throwable});
    }

    public void llll() {
    }

    protected ModuleBase(String string, Category category, String string2, boolean bl) {
        this((Object)string, category, (Object)string2, bl);
    }

    static String IIIlIll(long l2) {
        String string;
        String string2 = string = Long.toUnsignedString(l2, 16);
        String string3 = "s0000000000000000".substring(0, 17 - string.length());
        return string3 + string2;
    }

    public InputUtil.Key IIIllII() {
        return this.IlIllIl;
    }

    public void IIIllIl(Entity entity, int n) {
    }

    public void l(Packet<?> packet) {
    }

    public void III() {
    }

    public IIIlIIIII IIIlllI() {
        return this.IllIlII;
    }

    public String lIlll() {
        return this.II();
    }

    /*
     * Unable to fully structure code
     */
    public void IIIllll() {
        block24: {
            block21: {
                block17: {
                    block26: {
                        block13: {
                            block25: {
                                block27: {
                                    block23: {
                                        block20: {
                                            block19: {
                                                block16: {
                                                    block14: {
                                                        block18: {
                                                            block22: {
                                                                block15: {
                                                                    if (!this.IllIIIl) break block22;
                                                                    break block23;
lbl3:
                                                                    // 1 sources

                                                                    while (!(var3_5 instanceof IIIIllIll)) {
                                                                        break block13;
                                                                    }
                                                                    break block24;
                                                                    while (true) {
                                                                        break block14;
                                                                        break;
                                                                    }
lbl8:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var2_4 = var1_2;
                                                                        break block15;
                                                                        break;
                                                                    }
lbl11:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        v0 = false;
                                                                        break block16;
                                                                        break;
                                                                    }
                                                                }
lbl15:
                                                                // 2 sources

                                                                while (true) {
                                                                    if (var2_4 >= this.IllIIII.size()) ** continue;
                                                                    break block17;
                                                                    break;
                                                                }
lbl18:
                                                                // 1 sources

                                                                while (true) {
                                                                    var2_4 = 0;
                                                                    break block18;
                                                                    break;
                                                                }
lbl21:
                                                                // 1 sources

                                                                while (true) {
                                                                    v0 = true;
                                                                    break block16;
                                                                    break;
                                                                }
lbl24:
                                                                // 1 sources

                                                                while (var2_3 instanceof IIIIllIll) {
                                                                    break block19;
                                                                }
                                                                break block25;
lbl27:
                                                                // 2 sources

                                                                while (true) {
                                                                    ++var2_4;
                                                                    break block18;
                                                                    break;
                                                                }
lbl30:
                                                                // 1 sources

                                                                while (true) {
                                                                    var2_3 = var1_1.next();
                                                                    ** GOTO lbl24
                                                                    break;
                                                                }
                                                            }
                                                            var1_1 = this.IllIIII.iterator();
                                                            break block19;
lbl36:
                                                            // 1 sources

                                                            while (true) {
                                                                if (var3_5 instanceof IIIIllIll) ** GOTO lbl27
                                                                break block20;
                                                                break;
                                                            }
                                                        }
                                                        ** while (var2_4 >= var1_2)
lbl41:
                                                        // 1 sources

                                                        break block26;
                                                    }
                                                    this.IIIIIll(this.IlIllII);
                                                    break block27;
                                                }
                                                this.IIlIIll(v0);
                                                return;
                                            }
lbl49:
                                            // 2 sources

                                            while (true) {
                                                if (var1_1.hasNext()) {
                                                    ** continue;
                                                }
                                                break block21;
                                                break;
                                            }
                                        }
                                        ModuleBase.IlIIlIl(var3_5, this.IlIllll.get(var2_4));
                                        ** while (true)
                                    }
                                    var1_2 = Math.min(this.IllIIII.size(), this.IlIllll.size());
                                    ** while (true)
                                }
                                this.IIlIIll(this.IlllIlI);
                                return;
                            }
                            var2_3.Ill();
                            ** while (true)
                        }
                        var3_5.Ill();
                        break block24;
                    }
                    var3_5 = this.IllIIII.get(var2_4);
                    ** while (true)
                }
                var3_5 = this.IllIIII.get(var2_4);
                ** GOTO lbl3
            }
            this.IIIIIll(InputUtil.UNKNOWN_KEY);
            ** while (this.IllIllI)
lbl77:
            // 1 sources

            ** while (true)
        }
        ++var2_4;
        ** while (true)
    }

    private void IIlIIII() {
        try {
            this.IlIIIII();
        }
        catch (LinkageError | RuntimeException throwable) {
            this.IIIlIlI(4, throwable);
        }
    }

    private void IIlIIIl(MinecraftClient minecraftClient, boolean bl, long l2) {
        if (!this.IllIlll || this.IlIlIlI != l2) {
            return;
        }
        if (bl) {
            try {
                this.llll();
            }
            catch (LinkageError | RuntimeException throwable) {
                this.IIIlIlI(2, throwable);
            }
        }
        this.IlIIIlI(minecraftClient);
        this.IIlIIII();
    }

    public void IllIl(Packet<?> packet) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIlIIlI(IIllIl<?> iIllIl) {
        if (iIllIl == null) return false;
        if (iIllIl.lllI() != IlllIII) return false;
        return true;
    }

    public void IIlIIll(boolean bl) {
        if (!this.IllIllI) {
            this.IlIlIll = true;
            return;
        }
        if (this.IlIlIll == bl) {
            return;
        }
        if (bl) {
            this.IllIlll = false;
            try {
                if (!this.IlIlIII()) {
                    this.IIlllII();
                    return;
                }
                if (!this.llIIl()) {
                    return;
                }
            }
            catch (LinkageError | RuntimeException throwable) {
                this.IlIIlII();
                this.IIIlIlI(0, throwable);
                return;
            }
        }
        boolean bl2 = this.IIIlIIl();
        boolean bl3 = this.IlIlIll;
        this.IlIlIll = bl;
        if (!this.IIlIlII(bl2)) {
            this.IlIlIll = bl3;
            return;
        }
        try {
            IIlllIIIl.ll().III(this, bl);
        }
        catch (LinkageError | RuntimeException throwable) {
            this.IIIlIlI(5, throwable);
        }
        this.IIlIIII();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean IIlIlII(boolean bl) {
        boolean bl2 = this.IIIlIIl();
        if (bl == bl2) {
            return true;
        }
        if (bl2) {
            try {
                this.ll();
                return true;
            }
            catch (LinkageError | RuntimeException throwable) {
                this.IlIIlII();
                this.IIIlIlI(1, throwable);
                try {
                    this.llll();
                }
                catch (LinkageError | RuntimeException throwable2) {
                    this.IIIlIlI(2, throwable2);
                }
                finally {
                    this.IlIIIlI(MinecraftClient.getInstance());
                }
                return false;
            }
        }
        try {
            this.llll();
        }
        catch (LinkageError | RuntimeException throwable) {
            this.IlIIlII();
            this.IIIlIlI(2, throwable);
        }
        finally {
            this.IlIIIlI(MinecraftClient.getInstance());
        }
        return true;
    }

    public boolean IIlIlIl(double d, double d2, int n) {
        return false;
    }

    public void IIlIllI(Packet<?> packet) {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 732;
        var7_1 = "\u991c\u9a6d\u992a\u991f\u992c\u993a\u990d\u9950\u991a\u99c9\u9a13\u9a17\uea83\ue99a\ueb79\ueb50\ueab3\ueb49\ueb7e\ueac3\uea89\uea9a\ue9cc\ue9c0\u7643\u755a\u7639\u7610\u7673\u7609\u763e\u7603\u7649\u765a\u750c\u7500\ucfca\ud07b\ucf00\ucf29\ucffa\ucf28\ucf1f\ucf62\ucf10\ucf3f\ud009\ud061\udc1b\udd09\udc1e\udcc1\uceb7\ucec5\ucdef\ucddf\u19f4\u1ae1\u19a1\u19fb\u19fc\u1995\u19c0\u19eb\u19b5\u1995\u19c7\u19e8\u19a2\u1ade\u19ef\u1988\u198f\u1a80\u19df\u198e\u19dd\u1991\u19f3\u19e0\u19ad\u1adf\u1aaf\u19fc\u199e\u1989\u19f4\u1994\u19b2\u1984\u19f3\u199a\u19ae\u19fa\u19e9\u19fb\u19f0\u1991\u1a8e\u19fb\u19d8\u1aa4\u1991\u1abd\u19be\u19fb\u19bc\u198d\u1992\u1a83\u19c8\u19f2\u19b1\u1aa4\u198b\u1992\u19cd\u19f3\u19d5\u198f\u19ed\u1a83\u19a9\u1ae6\u819b\u80a1\u8188\u824c\u81be\u8250\u819d\u8231\u8278\u824c\u81be\u8253\u8279\u822a\u80ef\u8255\u81a4\u80c7\u8261\u8234\u8195\u819e\u8259\u80f8\u3d13\u3e05\u3d19\u3dcb\u3dcb\u3d31\u3d1c\u3d9f\u3d1c\u3d2b\u3e0a\u3d2e\u3d05\u3e02\u3d28\u3e04\u6770\u677b\u66f1\u66c1\u4051\u4016\u3fe4\u3fd4\ubaef\ubb70\uba27\uba1f\ubadc\uba25\uba30\uba4d\uba17\uba32\ubb0d\ubb0a\u66fc\u4fd7\u66b4\u66fc\u66ef\u66c2\u66ab\u66f6\u66a4\u6685\u505a\u505d\u4cc6\u4de7\u4ca4\u4c95\u4cf6\u4c8c\u4cbb\u4c86\u4cb4\u4ce3\u4d85\u4dad\ueb52\ueab3\ueb68\ueb71\ueb62\ueb40\ueb77\ueb0a\ueb58\ueb07\uead1\ueac9\ua429\ua400\ua450\ua47a\ua419\ua474\ua451\ua47b\ua44a\ua40f\ua300\ua307\u5b8b\u5c2a\u5c72\u5c48\u5bbb\u5b86\u5c63\u5c35\u5c78\u5c51\u62ee\u62e9\u2da2\u2dff\u2da3\u2ddb\u2de7\u2de8\u2ddc\u2da5\u2ddb\u2d96\u2f4e\u2dc3\u2df4\u2dff\u2dba\u2d81\u2dc0\u2f50\u2e95\u2dfb\u2dcc\u2d93\u2f4e\u2de5\u2dc2\u2ded\u2dd0\u2f48\u8774\u876d\u8731\u8707\u8744\u8745\u872c\u8772\u8737\u8712\u862d\u862a\ua10b\ua27c\ua10b\ua1c3\ua130\ua139\ua11c\ua1b1\ua1fb\ua13e\ua271\ua276\u787c\u774d\u784a\u787f\u784c\u781a\u782d\u7870\u783a\u7869\u7733\u7737\u51ef\u5212\u5109\u5202\u51d8\u5268\u523d\u520f\u5254\u5270\u520a\u5269\u5229\u520f\u51e1\u526c\u5272\u5271\u5229\u5215\u523d\u51c5\u5267\u5279\u5274\u51bb\u525c\u525c\u4791\u3eee\u478e\u47be";
        var8_2 = "\u02d0\u02d0\u02d0\u02d0\u02d8\u02d8\u0298\u02c4\u02cc\u02d8\u02d8\u02d0\u02d0\u02d0\u02d0\u02d0\u02d0\u02c0\u02d0\u02d0\u02d0\u02c0\u02d8".toCharArray();
        var9_3 = new String[var8_2.length];
        var13_8 = -1;
        if (true) ** GOTO lbl13
        while (true) {
            block10: {
                block11: {
                    if (var15_10 < var14_9.length) break block10;
                    var9_3[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_2.length) break block11;
                    var13_8 = 0;
lbl13:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = 0;
                    if (var13_8 != 0) break block11;
                    ModuleBase.IllllII = var9_3;
                    ModuleBase.IllllIl = new Object[var9_3.length];
                    var2_11 = -1867159215;
                    ** GOTO lbl42
                }
                var12_7 = var8_2[var10_5] ^ var6;
                var14_9 = var7_1.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
            }
            switch (var15_10 % 6) {
                case 2: {
                    v0 = 112;
                    break;
                }
                case 3: {
                    v0 = 64;
                    break;
                }
                case 4: {
                    v0 = 91;
                    break;
                }
                default: {
                    v0 = 107;
                    break;
                }
                case 5: {
                    v0 = 92;
                    break;
                }
lbl42:
                // 1 sources

                var0_12 = ":\u00c6\u00f1\"\u000eN8P".getBytes("ISO-8859-1");
                var1_13 = var0_12.length / 4;
                ModuleBase.IlllIll = new int[var1_13];
                var3_14 = 0;
                var4_15 = 0;
                if (true) ** GOTO lbl63
                case 1: {
                    v0 = 62;
                }
            }
            var16_4 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_4);
        }
        while (true) {
            ModuleBase.IlllIll[var4_15] = var5_16 ^= var2_11;
            var3_14 += 4;
            if (++var4_15 >= var1_13) {
                ModuleBase.IlIlIIl = LoggerFactory.getLogger(ModuleBase.class);
                ModuleBase.IlllIII = StringFactory.IIII("Switch Back").llII();
                ModuleBase.IllIIlI = StringFactory.IIII("X").llII();
                ModuleBase.IlllIIl = StringFactory.IIII("Y").llII();
                return;
            }
lbl63:
            // 3 sources

            var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
        }
    }

    final boolean IIlIlll() {
        return this.IllIlll;
    }

    /*
     * Enabled aggressive block sorting
     */
    final void IIllIII() {
        if (this.IllIIIl) return;
        this.IlIllll = new ArrayList<Object>(this.IllIIII.size());
        Iterator<IIllIl<?>> iterator = this.IllIIII.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.IlIllII = this.IlIllIl;
                this.IlllIlI = this.IlIlIll;
                this.IllIIIl = true;
                return;
            }
            IIllIl<?> iIllIl = iterator.next();
            this.IlIllll.add(ModuleBase.IIIIlII(iIllIl.lIl()));
        }
    }

    public IIIlIIIII IIllIIl() {
        return IIlIIlIl.l(this.IIIlllI(), this.IllIIll);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private /* synthetic */ int IIllIlI(IIllIl iIllIl) {
        if (!this.IIlIIlI(iIllIl)) return 0;
        return 1;
    }

    /*
     * Unable to fully structure code
     */
    public void IIllIl(JsonObject var1_1) {
        block20: {
            block18: {
                block13: {
                    block19: {
                        block17: {
                            block15: {
                                block11: {
                                    block16: {
                                        block12: {
                                            block14: {
                                                block10: {
                                                    this.IlIllIl = InputUtil.UNKNOWN_KEY;
                                                    break block18;
lbl3:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var4_4 instanceof IIIIllIll) break block10;
                                                        break block11;
                                                        break;
                                                    }
lbl6:
                                                    // 1 sources

                                                    while (true) {
                                                        var2_2 = var1_1.getAsJsonObject("settings");
                                                        break block12;
                                                        break;
                                                    }
lbl9:
                                                    // 1 sources

                                                    while (true) {
                                                        var3_3.Ill();
                                                        break block13;
                                                        break;
                                                    }
                                                }
lbl13:
                                                // 5 sources

                                                while (var3_3.hasNext()) {
                                                    break block14;
                                                }
                                                break block19;
lbl16:
                                                // 1 sources

                                                while (true) {
                                                    var5_5 = ModuleBase.IIIIlIl(var2_2, var4_4.lllI());
                                                    if (var5_5 == null) ** GOTO lbl13
                                                    break block15;
                                                    break;
                                                }
                                            }
                                            var4_4 = (IIllIl)var3_3.next();
                                            ** while (true)
lbl23:
                                            // 1 sources

                                            while (!(var3_3 instanceof IIIIllIll)) {
                                                break block16;
                                            }
                                            break block13;
lbl26:
                                            // 1 sources

                                            while (var1_1.has("keyBind")) {
                                                break block17;
                                            }
                                            break block20;
                                        }
                                        var3_3 = this.IllIIII.iterator();
                                        ** GOTO lbl13
                                    }
                                    ** while (var3_3.lIIl())
lbl34:
                                    // 1 sources

                                    break block13;
                                }
                                ** while (var4_4.lIIl())
lbl37:
                                // 1 sources

                                ** GOTO lbl13
                            }
                            var4_4.l(var5_5);
                            ** GOTO lbl13
                        }
                        this.IlIllIl = lIIllllI.lIIlIl(var1_1.get("keyBind"));
                        break block20;
lbl44:
                        // 1 sources

                        while (true) {
                            var3_3 = var2_2.next();
                            ** GOTO lbl23
                            break;
                        }
                    }
                    return;
lbl49:
                    // 1 sources

                    return;
                }
lbl52:
                // 2 sources

                while (var2_2.hasNext()) {
                    ** continue;
lbl54:
                    // 1 sources

                    ** GOTO lbl44
                }
                ** GOTO lbl26
            }
            var2_2 = this.IllIIII.iterator();
            ** GOTO lbl52
        }
        ** while (var1_1.has((String)"settings"))
lbl61:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIllIll(JsonObject jsonObject) {
        if (!this.IllIllI) return;
        if (jsonObject == null) return;
        if (!jsonObject.has("enabled")) {
            return;
        }
        boolean bl = jsonObject.get("enabled").getAsBoolean();
        if (bl && !this.IlIlIII()) {
            this.IlIlIll = false;
            return;
        }
        this.IIlIIll(bl);
    }

    public String II() {
        return "";
    }

    public String IIIl() {
        return this.IIllllI();
    }

    protected ModuleBase(String string, Category category, String string2) {
        this(string, category, string2, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected void IIlllII() {
        IIlllIIIl.ll().Il(IlIIlllll.I, "Unsupported platform", this.IlIIlll(), 3200L);
    }

    protected <T extends IIllIl<?>> T IIlllIl(T t) {
        this.IllIIII.add(t);
        return t;
    }

    public String IIllllI() {
        return this.IllIlII.IIII();
    }

    public String IIlllll() {
        return this.IIllIIl().IIII();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IlIIIII() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return;
        }
        clientEntrypoint.I();
    }

    public boolean IlIIIIl() {
        return false;
    }

    /*
     * Unable to fully structure code
     */
    public JsonObject IlIl() {
        block11: {
            block12: {
                break block12;
lbl1:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
lbl3:
                // 1 sources

                while (true) {
                    block13: {
                        if (IlIIllI.lllI(var5_5.lIl(), var5_5.ll())) break block13;
                        ** GOTO lbl23
lbl6:
                        // 1 sources

                        return var1_1;
                    }
                    var3_3.add(ModuleBase.IIIlIll(var5_5.lllI()), var5_5.III());
                    ** GOTO lbl23
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    block10: {
                        block14: {
                            var1_1.add("keyBind", var2_2);
                            break block14;
lbl14:
                            // 1 sources

                            while (true) {
                                var4_4 = this.IllIIII.iterator();
                                break block10;
                                break;
                            }
lbl17:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
lbl20:
                        // 2 sources

                        while (true) {
                            var3_3 = new JsonObject();
                            ** continue;
                            break;
                        }
                    }
lbl24:
                    // 3 sources

                    while (true) {
                        if (var4_4.hasNext()) {
                            ** continue;
                        }
                        break block11;
                        break;
                    }
                    break;
                }
            }
            var1_1 = new JsonObject();
            var1_1.addProperty("enabled", Boolean.valueOf(this.IlIlIll));
            ** while (true)
            var2_2 = lIIllllI.IllIIII(this.IlIllIl);
            ** while (var2_2 == null)
lbl34:
            // 1 sources

            ** while (true)
        }
        var1_1.add("settings", (JsonElement)var3_3);
        ** while (true)
lbl38:
        // 1 sources

        while (true) {
            if (!var5_5.lIIl()) ** GOTO lbl24
            ** continue;
            break;
        }
        var5_5 = var4_4.next();
        if (!(var5_5 instanceof IIIIllIll)) ** break;
        ** while (true)
        ** while (true)
    }

    private void IlIIIlI(MinecraftClient minecraftClient) {
        try {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        }
        catch (LinkageError | RuntimeException throwable) {
            this.IlIIlII();
            this.IIIlIlI(3, throwable);
        }
    }

    public void Il(DrawContext drawContext, int n, int n2, float f) {
    }

    public IIIlIIIII IlIIIll() {
        return this.IllIlII;
    }

    public int IIll() {
        return 0;
    }

    private synchronized void IlIIlII() {
        this.IllIlll = true;
        ++this.IlIlIlI;
    }

    private static void IlIIlIl(IIllIl iIllIl, Object object) {
        iIllIl.II(ModuleBase.IIIIlII(object));
    }

    public long IlIIllI() {
        return this.IllIlII.llII();
    }

    public String IlIIlll() {
        String string = ".";
        String string2 = ll.l().I();
        String string3 = " is not supported on ";
        String string4 = this.IIIl();
        return string4 + string3 + string2 + string;
    }

    public boolean IlIlIII() {
        return true;
    }

    public Category IlIlIIl() {
        return this.IlIlllI;
    }

    public boolean IlIlIlI(MinecraftClient minecraftClient) {
        return false;
    }

    public void IlIlIll(MinecraftClient minecraftClient) {
    }

    private static int IlIllll(int n, int n2) {
        return IlllIll[n ^ 0x89AB394D] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IllIIIl(int n, char c, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = c ^ 0xB9AD;
        char[] cArray = IllllII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IllllIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            ModuleBase.IllllIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5946;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 30734;
            n7 += 52407;
            n7 ^= 0x348B;
            n7 -= 11606;
            n7 -= 17516;
            n7 ^= 0x857;
            cArray[n6] = (char)((n7 ^= 0xEC57) ^ n4 ^ n2 ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

