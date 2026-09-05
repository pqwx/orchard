/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - , lllIlIII2.IlII()), this.IlIlII(jsonObject, 
 *   - Range setting requires [min, max] array
 *   - Inventory Presets module is unavailable
 *   - Config name cannot exceed 20 characters
 *   - Keybind updates require keybind body
 *   - Could not create ClickGUI backup: 
 *   - Enum setting has no current value
 *   - Unsupported setting type
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
 *  net.minecraft.client.network.ServerInfo
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.client.util.InputUtil$Type
 */
package orchard.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ServerInfo;
import net.minecraft.client.util.InputUtil;
import orchard.config.CloudConfigManager;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIllIll;
import orchard.internal.IIIIllllI;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlIII;
import orchard.internal.IIllIl;
import orchard.internal.IIlllIll;
import orchard.internal.IIlllllIl;
import orchard.internal.IlllIll;
import orchard.internal.Illllll;
import orchard.internal.lIIllII;
import orchard.internal.lIIlll;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIlIlI;
import orchard.internal.llIlIlII;
import orchard.internal.llIll;
import orchard.internal.lllIlI;
import orchard.internal.lllIlIII;
import orchard.module.combat.KnockbackDisplacement;
import orchard.module.iface.Interface;

@Environment(value=EnvType.CLIENT)
final class IIlIIIIlI {
    private boolean I;
    private final ClientEntrypoint l;
    private final CloudConfigManager II;
    private static final int[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    /*
     * Enabled aggressive block sorting
     */
    private Object I(Object object) {
        if (object instanceof Color) {
            Color color = (Color)object;
            return this.IlIllI(color);
        }
        if (object instanceof Enum) {
            Enum enum_ = (Enum)object;
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
            linkedHashMap.put("name", Integer.toString(enum_.ordinal(), 36));
            linkedHashMap.put("label", enum_.toString());
            return linkedHashMap;
        }
        if (!(object instanceof InputUtil.Key)) return object;
        InputUtil.Key key = (InputUtil.Key)object;
        return this.lIII(key);
    }

    Map<String, Object> l(JsonObject jsonObject) {
        return this.IlII(() -> this.lII().IllI(this.Il(jsonObject, "name")));
    }

    Map<String, Object> II(boolean bl) {
        return this.IlII(() -> this.lIlll(bl));
    }

    /*
     * Enabled aggressive block sorting
     */
    private String Il(JsonObject jsonObject, String string) {
        if (jsonObject == null) return null;
        if (!jsonObject.has(string)) return null;
        if (jsonObject.get(string).isJsonNull()) {
            return null;
        }
        String string2 = jsonObject.get(string).getAsString();
        return string2;
    }

    Map<String, Object> lI() {
        return this.IlII(() -> this.lII().IIlII());
    }

    /*
     * Unable to fully structure code
     */
    private void ll(IIllIl<?> var1_1, JsonElement var2_2) {
        block69: {
            block75: {
                block43: {
                    block55: {
                        block48: {
                            block46: {
                                block60: {
                                    block71: {
                                        block74: {
                                            block52: {
                                                block57: {
                                                    block42: {
                                                        block73: {
                                                            block64: {
                                                                block72: {
                                                                    block49: {
                                                                        block62: {
                                                                            block58: {
                                                                                block63: {
                                                                                    block47: {
                                                                                        block65: {
                                                                                            block61: {
                                                                                                block54: {
                                                                                                    block66: {
                                                                                                        block56: {
                                                                                                            block44: {
                                                                                                                block68: {
                                                                                                                    block70: {
                                                                                                                        block50: {
                                                                                                                            block53: {
                                                                                                                                block45: {
                                                                                                                                    block51: {
                                                                                                                                        block59: {
                                                                                                                                            block67: {
                                                                                                                                                block41: {
                                                                                                                                                    if (!(var1_1 instanceof llIll)) break block65;
                                                                                                                                                    break block66;
lbl3:
                                                                                                                                                    // 1 sources

                                                                                                                                                    return;
lbl5:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        if (!var2_2.isJsonArray()) break block41;
                                                                                                                                                        break block42;
                                                                                                                                                        break;
                                                                                                                                                    }
lbl8:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (var2_2 != null) {
                                                                                                                                                        break block43;
                                                                                                                                                    }
                                                                                                                                                    break block67;
lbl11:
                                                                                                                                                    // 2 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        v0 = false;
                                                                                                                                                        break block44;
lbl14:
                                                                                                                                                        // 1 sources

                                                                                                                                                        return;
                                                                                                                                                    }
lbl16:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        if (!var6_18.isJsonPrimitive()) break block45;
                                                                                                                                                        break block46;
                                                                                                                                                        break;
                                                                                                                                                    }
lbl19:
                                                                                                                                                    // 4 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        if (!var5_17.hasNext()) break block47;
                                                                                                                                                        break block48;
                                                                                                                                                        break;
                                                                                                                                                    }
lbl22:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        continue;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    throw new IllegalArgumentException("Unsupported setting type");
lbl26:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        var5_17 = var2_2.getAsJsonArray().iterator();
                                                                                                                                                        ** GOTO lbl19
                                                                                                                                                        break;
                                                                                                                                                    }
lbl29:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        if (var2_2 == null) break block49;
                                                                                                                                                        break block50;
                                                                                                                                                        break;
                                                                                                                                                    }
lbl32:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        if (var3_7.lIl() != null) break block51;
                                                                                                                                                        break block52;
                                                                                                                                                        break;
                                                                                                                                                    }
lbl35:
                                                                                                                                                    // 2 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        continue;
                                                                                                                                                        break;
                                                                                                                                                    }
lbl37:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        continue;
                                                                                                                                                        break;
                                                                                                                                                    }
lbl39:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (!(var1_1 instanceof llIlIlI)) {
                                                                                                                                                        if (!(var1_1 instanceof IIIIIIIIl)) break block53;
                                                                                                                                                        break block54;
                                                                                                                                                    }
                                                                                                                                                    break block68;
lbl43:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        if (var4_14.size() >= 2) break block55;
                                                                                                                                                        break block56;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    var3_5.l(var2_2);
                                                                                                                                                    return;
lbl48:
                                                                                                                                                    // 1 sources

                                                                                                                                                    return;
lbl50:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        continue;
                                                                                                                                                        break;
                                                                                                                                                    }
lbl52:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        var3_4 = (IIIlIlIIl)var1_1;
                                                                                                                                                        ** GOTO lbl8
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                }
lbl56:
                                                                                                                                                // 3 sources

                                                                                                                                                while (true) {
                                                                                                                                                    continue;
                                                                                                                                                    break;
                                                                                                                                                }
lbl58:
                                                                                                                                                // 1 sources

                                                                                                                                                while (true) {
                                                                                                                                                    var3_8.Il(this.IIIlll(var2_2.getAsJsonObject()));
                                                                                                                                                    ** continue;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                while (true) {
                                                                                                                                                    if (!(var1_1 instanceof lIIllII)) ** continue;
                                                                                                                                                    break block57;
                                                                                                                                                    break;
                                                                                                                                                }
lbl64:
                                                                                                                                                // 1 sources

                                                                                                                                                while (true) {
                                                                                                                                                    var4_13.add(var6_19.getAsString());
                                                                                                                                                    ** GOTO lbl19
                                                                                                                                                    break;
                                                                                                                                                }
lbl68:
                                                                                                                                                // 1 sources

                                                                                                                                                while (true) {
                                                                                                                                                    if (var2_2 == null) break block58;
                                                                                                                                                    break block59;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
lbl72:
                                                                                                                                            // 2 sources

                                                                                                                                            throw new IllegalArgumentException("Range setting requires [min, max] array");
                                                                                                                                        }
                                                                                                                                        if (var2_2.isJsonObject()) {
                                                                                                                                            ** continue;
                                                                                                                                        }
                                                                                                                                        break block58;
                                                                                                                                    }
                                                                                                                                    var4_15 = var3_7.I(var2_2.getAsString());
                                                                                                                                    if (var4_15 != null) break block69;
                                                                                                                                    break block70;
lbl82:
                                                                                                                                    // 1 sources

                                                                                                                                    while (true) {
                                                                                                                                        if (var2_2.isJsonPrimitive()) {
                                                                                                                                            ** continue;
                                                                                                                                        }
                                                                                                                                        break block47;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
lbl87:
                                                                                                                                // 4 sources

                                                                                                                                while (true) {
                                                                                                                                    if (!var5_16.hasNext()) ** GOTO lbl56
                                                                                                                                    break block60;
                                                                                                                                    break;
                                                                                                                                }
lbl90:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    v0 = true;
                                                                                                                                    break block44;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            }
                                                                                                                            if (!(var1_1 instanceof lllIlI)) break block71;
                                                                                                                            break block72;
                                                                                                                            var3_3.IlI(var4_12);
                                                                                                                            return;
                                                                                                                        }
                                                                                                                        if (var2_2.isJsonArray()) {
                                                                                                                            ** continue;
                                                                                                                        }
                                                                                                                        break block49;
                                                                                                                    }
                                                                                                                    throw new IllegalArgumentException("Enum setting has no current value");
lbl104:
                                                                                                                    // 1 sources

                                                                                                                    return;
lbl106:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        var4_14 = var2_2.getAsJsonArray();
                                                                                                                        ** continue;
                                                                                                                        break;
                                                                                                                    }
lbl109:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        if (!var2_2.isJsonNull()) break block61;
                                                                                                                        break block62;
                                                                                                                        break;
                                                                                                                    }
lbl112:
                                                                                                                    // 1 sources

                                                                                                                    while (var1_1 instanceof IIIlIlIIl) {
                                                                                                                        ** continue;
lbl114:
                                                                                                                        // 1 sources

                                                                                                                        ** GOTO lbl52
                                                                                                                    }
                                                                                                                    ** GOTO lbl39
                                                                                                                }
                                                                                                                var3_3 = (llIlIlI)var1_1;
                                                                                                                ** while (true)
                                                                                                            }
                                                                                                            var3_9.II(v0);
                                                                                                            ** while (true)
                                                                                                        }
                                                                                                        throw new IllegalArgumentException("Range setting requires [min, max] array");
                                                                                                    }
                                                                                                    var3_9 = (llIll)var1_1;
                                                                                                    if (var2_2 == null) ** GOTO lbl11
                                                                                                    break block73;
                                                                                                }
                                                                                                var3_7 = (IIIIIIIIl)var1_1;
                                                                                                ** while (true)
lbl131:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    continue;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            v1 = var2_2.getAsString();
                                                                                            ** GOTO lbl35
lbl136:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var3_10.lI(var2_2.getAsDouble());
                                                                                                break block63;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        if (!(var1_1 instanceof lIlIIlI)) ** GOTO lbl112
                                                                                        break block74;
                                                                                        var4_12 = new ArrayList<String>();
                                                                                        if (var2_2 != null) ** break;
                                                                                        ** while (true)
                                                                                        ** while (true)
lbl146:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            if (!(var1_1 instanceof llIlIlII)) ** continue;
                                                                                            break block64;
                                                                                            break;
                                                                                        }
                                                                                    }
lbl150:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var3_5.IlII(var4_13);
                                                                                        ** continue;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                return;
                                                                            }
                                                                            throw new IllegalArgumentException("Keybind updates require keybind body");
                                                                        }
                                                                        while (true) {
                                                                            v1 = "";
                                                                            ** continue;
                                                                            break;
                                                                        }
lbl161:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            if (var2_2 == null) ** continue;
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    ** while (var2_2 == null)
lbl166:
                                                                    // 1 sources

                                                                    ** while (true)
                                                                }
                                                                var3_11 = (lllIlI)var1_1;
                                                                ** while (true)
                                                            }
                                                            var3_6 = (llIlIlII)var1_1;
                                                            ** while (true)
                                                        }
                                                        if (var2_2.getAsBoolean()) ** break;
                                                        ** while (true)
                                                        ** while (true)
                                                    }
                                                    var5_16 = var2_2.getAsJsonArray().iterator();
                                                    ** GOTO lbl87
                                                }
                                                var3_8 = (lIIllII)var1_1;
                                                ** while (true)
                                                var3_5 = (Illllll)var1_1;
                                                var4_13 = new ArrayList<String>();
                                                ** while (true)
                                            }
                                            throw new IllegalArgumentException("Enum setting has no current value");
                                        }
                                        var3_10 = (lIlIIlI)var1_1;
                                        ** while (true)
                                    }
                                    ** while (!(var1_1 instanceof Illllll))
lbl193:
                                    // 1 sources

                                    ** while (true)
                                }
                                var6_18 = (JsonElement)var5_16.next();
                                if (var6_18 == null) ** GOTO lbl87
                                ** while (true)
                            }
                            var4_12.add(var6_18.getAsString());
                            ** while (true)
                            var3_6.II(this.lllIl(var2_2));
                            return;
                        }
                        var6_19 = (JsonElement)var5_17.next();
                        if (var6_19 == null) ** GOTO lbl19
                        break block75;
                    }
                    var3_4.I(new double[]{var4_14.get(0).getAsDouble(), var4_14.get(1).getAsDouble()});
                    return;
                }
                ** while (var2_2.isJsonArray())
lbl213:
                // 1 sources

                ** while (true)
            }
            if (var6_19.isJsonPrimitive()) ** break;
            ** while (true)
            ** while (true)
            var3_11.Il(v1);
            return;
        }
        var3_7.lII(var4_15);
        ** while (true)
    }

    Map<String, Object> IlI(String string) {
        return this.IlII(() -> {
            ModuleBase moduleBase = this.llll(string);
            LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
            linkedHashMap.put("ok", true);
            linkedHashMap.put("module", this.lll(moduleBase, true));
            return linkedHashMap;
        });
    }

    Map<String, Object> Ill(JsonObject jsonObject) {
        return this.llIl("before-clickgui-bind-update", () -> {
            this.l.IIl().llIII(this.IIIlll(jsonObject));
            this.l.IIII();
            return this.IIlllI("clickGuiBind", this.lIII(this.l.IIl().IlIll()));
        });
    }

    private IIlllIll lII() {
        IIlllIll iIlllIll = this.l.IlI().IllI();
        if (iIlllIll != null) {
            return iIlllIll;
        }
        throw new IllegalStateException("Inventory Presets module is unavailable");
    }

    Map<String, Object> lIl() {
        return this.IlII(() -> {
            LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
            ArrayList arrayList = new ArrayList();
            Iterator<ModuleBase> iterator = this.l.IlI().IIIIIll().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    linkedHashMap.put("ok", true);
                    linkedHashMap.put("clickGuiBind", this.lIII(this.l.IIl().IlIll()));
                    linkedHashMap.put("modules", arrayList);
                    return linkedHashMap;
                }
                ModuleBase moduleBase = iterator.next();
                LinkedHashMap<String, Object> linkedHashMap2 = new LinkedHashMap<String, Object>();
                linkedHashMap2.put("name", moduleBase.IIllllI());
                linkedHashMap2.put("label", moduleBase.IIIl());
                linkedHashMap2.put("category", IIlIIIIlI.IIII(moduleBase.IlIlIIl()));
                linkedHashMap2.put("keyBind", this.lIII(moduleBase.IIIllII()));
                arrayList.add(linkedHashMap2);
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private int llI(JsonObject jsonObject, String string, int n) {
        int n2;
        if (jsonObject == null || !jsonObject.has(string) || jsonObject.get(string).isJsonNull()) {
            n2 = n;
            return n2;
        }
        n2 = jsonObject.get(string).getAsInt();
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Map<String, Object> lll(ModuleBase moduleBase, boolean bl) {
        Object object;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put("name", moduleBase.IIllllI());
        linkedHashMap.put("label", moduleBase.IIIl());
        linkedHashMap.put("displayName", moduleBase.IIIIlll());
        linkedHashMap.put("displayValue", moduleBase.lIlll());
        linkedHashMap.put("category", IIlIIIIlI.IIII(moduleBase.IlIlIIl()));
        linkedHashMap.put("description", moduleBase.IIlllll());
        linkedHashMap.put("enabled", moduleBase.IIIlIIl());
        linkedHashMap.put("toggleable", moduleBase.lllllI());
        linkedHashMap.put("keyBind", this.lIII(moduleBase.IIIllII()));
        if (!(moduleBase instanceof IIlllIll)) {
            if (moduleBase instanceof IIlllllIl) {
                linkedHashMap.put("customPanel", "bodyAim");
            }
        } else {
            linkedHashMap.put("customPanel", "inventoryPresets");
        }
        List<IIllIl<?>> list = moduleBase.IlIlIl();
        linkedHashMap.put("hasSettings", !list.isEmpty());
        if (moduleBase instanceof lllIlIII) {
            object = (lllIlIII)((Object)moduleBase);
            linkedHashMap.put("hud", this.lIllI((lllIlIII)object));
        }
        if (bl) {
            object = new ArrayList();
            for (IIllIl<?> iIllIl : list) {
                object.add(this.IIIll(iIllIl));
            }
            linkedHashMap.put("settings", object);
        }
        return linkedHashMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIII(Enum<?> enum_) {
        if (enum_ == null) {
            return "";
        }
        String string = new StringBuilder(4).append('e').append(Integer.toString(enum_.ordinal(), 36)).toString();
        return string;
    }

    Map<String, Object> IIIl(JsonObject jsonObject) {
        return this.llIl("before-profile-delete", () -> {
            String string = this.lIIlI(this.lIlII(jsonObject, "name"));
            boolean bl = this.II.lll(string);
            if (bl) return this.Illl();
            throw new IllegalStateException("Could not delete profile");
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private String IIll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null) {
            ServerInfo serverInfo = minecraftClient.getCurrentServerEntry();
            if (serverInfo != null && serverInfo.address != null && !serverInfo.address.isBlank()) {
                return serverInfo.address;
            }
        } else {
            return "not connected";
        }
        if (!minecraftClient.isInSingleplayer()) return "not connected";
        return "singleplayer";
    }

    private <T> T IlII(Supplier<T> supplier) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) {
            return supplier.get();
        }
        if (minecraftClient.isOnThread()) {
            return supplier.get();
        }
        CompletableFuture completableFuture = new CompletableFuture();
        minecraftClient.execute(() -> {
            try {
                completableFuture.complete(supplier.get());
            }
            catch (Throwable throwable) {
                completableFuture.completeExceptionally(throwable);
            }
        });
        try {
            return completableFuture.get(3L, TimeUnit.SECONDS);
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception.getMessage(), exception);
        }
    }

    private String IlIl(String string) {
        String string2 = string.toLowerCase(Locale.ROOT);
        String string3 = string2.substring(1);
        String string4 = string2.substring(0, 1).toUpperCase(Locale.ROOT);
        return string4 + string3;
    }

    Map<String, Object> IllI(JsonObject jsonObject) {
        return this.IlII(() -> {
            this.IllII("before-profile-import");
            boolean bl = this.II.IlIlI(this.lIlII(jsonObject, "value"), this.l.IlI());
            if (!bl) {
                throw new IllegalStateException("Could not import profile");
            }
            this.l.IIII();
            return this.Illl();
        });
    }

    private Map<String, Object> Illl() {
        Map<String, Object> map = this.IIlllI("profiles", this.II.ll());
        map.put("export", this.II.IlIIl(this.l.IlI()));
        return map;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Map<String, Object> lIII(InputUtil.Key key) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        boolean bl = lIIllllI.IlIIlll(key);
        linkedHashMap.put("unknown", bl);
        linkedHashMap.put("label", bl ? "" : lIIllllI.IlIl(key));
        linkedHashMap.put("type", bl ? "unknown" : (key.getCategory() == InputUtil.Type.MOUSE ? "mouse" : "keysym"));
        linkedHashMap.put("code", bl ? -1 : key.getCode());
        return linkedHashMap;
    }

    Map<String, Object> lIlI() {
        return this.IlII(() -> {
            LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
            KnockbackDisplacement knockbackDisplacement = this.l.IlI().IIllIIl();
            linkedHashMap.put("ok", true);
            linkedHashMap.put("altMask", null);
            linkedHashMap.put("altMaskLog", List.of());
            linkedHashMap.put("altMaskLogFile", null);
            linkedHashMap.put("altMaskProgress", Map.of("running", false, "progress", 0, "message", "Idle", "splash", ""));
            linkedHashMap.put("kbDisplacement", knockbackDisplacement == null ? Map.of("available", false) : knockbackDisplacement.lIll());
            return linkedHashMap;
        });
    }

    private static int lIll(int n) {
        return Math.max(0, Math.min(255, n));
    }

    Map<String, Object> llII(JsonObject jsonObject) {
        return this.llIl("before-hud-mutation", () -> {
            lllIlIII lllIlIII2 = this.IIllI(this.lIlII(jsonObject, "module"));
            lllIlIII2.lllI(this.IlIlII(jsonObject, "x", lllIlIII2.IlII()), this.IlIlII(jsonObject, "y", lllIlIII2.IlIl()));
            this.l.IIII();
            return this.lIlll(false);
        });
    }

    private Map<String, Object> llIl(String string, Supplier<Map<String, Object>> supplier) {
        return this.IlII(() -> {
            this.lIIIl(string);
            return (Map)supplier.get();
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private ModuleBase llll(String string) {
        ModuleBase moduleBase;
        if (string == null) throw new IllegalArgumentException("Missing module");
        if (string.isBlank()) throw new IllegalArgumentException("Missing module");
        Iterator<ModuleBase> iterator = this.l.IlI().IIIIIll().iterator();
        do {
            if (iterator.hasNext()) continue;
            String string2 = string;
            String string3 = "Unknown module: ";
            throw new IllegalArgumentException(string3 + string2);
        } while (!(moduleBase = iterator.next()).IIllllI().equalsIgnoreCase(string));
        return moduleBase;
    }

    /*
     * Enabled aggressive block sorting
     */
    private List<Map<String, Object>> IIIII(IIIIIIIIl<?> iIIIIIIIl) {
        Enum[] enumArray;
        ArrayList<Map<String, Object>> arrayList = new ArrayList<Map<String, Object>>();
        Enum enum_ = (Enum)iIIIIIIIl.lIl();
        Enum[] enumArray2 = enumArray = enum_ != null ? (Enum[])enum_.getDeclaringClass().getEnumConstants() : new Enum[]{};
        if (enumArray == null) {
            return arrayList;
        }
        Enum[] enumArray3 = enumArray;
        int n = enumArray3.length;
        int n2 = 0;
        while (n2 < n) {
            Object object;
            Enum enum_2 = enumArray3[n2];
            if (!(enum_2 instanceof lIIlll) || (object = (lIIlll)((Object)enum_2)).l()) {
                object = new LinkedHashMap();
                object.put("name", iIIIIIIIl.IlI(enum_2));
                object.put("label", enum_2.toString());
                arrayList.add((Map<String, Object>)object);
            }
            ++n2;
        }
        return arrayList;
    }

    Map<String, Object> IIIlI() {
        return this.IlII(this::Illl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Map<String, Object> IIIll(IIllIl<?> iIllIl) {
        Object obj;
        IIllIl iIllIl2;
        Object obj2;
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put("name", iIllIl.llII());
        linkedHashMap.put("type", this.Illll(iIllIl));
        linkedHashMap.put("visible", iIllIl.lIlI());
        if (iIllIl instanceof llIlIlI) {
            llIlIlI llIlIlI2 = (llIlIlI)iIllIl;
            v0 = llIlIlI2.ll();
        } else {
            v0 = obj2 = iIllIl.lIl();
        }
        if (iIllIl instanceof llIlIlI) {
            iIllIl2 = (llIlIlI)iIllIl;
            v1 = ((llIlIlI)iIllIl2).llI();
        } else {
            v1 = obj = iIllIl.ll();
        }
        if (!(iIllIl instanceof IIIIIIIIl)) {
            linkedHashMap.put("value", this.I(obj2));
            linkedHashMap.put("defaultValue", this.I(obj));
        } else {
            iIllIl2 = (IIIIIIIIl)iIllIl;
            linkedHashMap.put("value", this.IIIIII((IIIIIIIIl<?>)iIllIl2, (Enum)obj2));
            linkedHashMap.put("defaultValue", this.IIIIII((IIIIIIIIl<?>)iIllIl2, (Enum)obj));
        }
        if (iIllIl instanceof lIlIIlI) {
            iIllIl2 = (lIlIIlI)iIllIl;
            linkedHashMap.put("min", ((lIlIIlI)iIllIl2).Ill());
            linkedHashMap.put("max", ((lIlIIlI)iIllIl2).Il());
            linkedHashMap.put("step", ((lIlIIlI)iIllIl2).lIl());
            linkedHashMap.put("unit", ((lIlIIlI)iIllIl2).llI());
            return linkedHashMap;
        }
        if (iIllIl instanceof IIIlIlIIl) {
            IIIlIlIIl iIIlIlIIl = (IIIlIlIIl)iIllIl;
            linkedHashMap.put("min", iIIlIlIIl.IIIl());
            linkedHashMap.put("max", iIIlIlIIl.IIII());
            linkedHashMap.put("limitMin", iIIlIlIIl.IIlI());
            linkedHashMap.put("limitMax", iIIlIlIIl.IlI());
            linkedHashMap.put("step", iIIlIlIIl.IIl());
            linkedHashMap.put("unit", iIIlIlIIl.Il());
            return linkedHashMap;
        }
        if (iIllIl instanceof IIIIIIIIl) {
            IIIIIIIIl iIIIIIIIl = (IIIIIIIIl)iIllIl;
            linkedHashMap.put("options", this.IIIII(iIIIIIIIl));
            return linkedHashMap;
        }
        if (iIllIl instanceof llIlIlI) {
            llIlIlI llIlIlI3 = (llIlIlI)iIllIl;
            linkedHashMap.put("options", this.IlllII(llIlIlI3));
            return linkedHashMap;
        }
        if (iIllIl instanceof lIIllII) {
            lIIllII lIIllII2 = (lIIllII)iIllIl;
            linkedHashMap.put("bind", this.lIII((InputUtil.Key)lIIllII2.lIl()));
            return linkedHashMap;
        }
        if (iIllIl instanceof llIlIlII) {
            llIlIlII llIlIlII2 = (llIlIlII)iIllIl;
            linkedHashMap.put("color", this.IlIllI((Color)llIlIlII2.lIl()));
            return linkedHashMap;
        }
        if (iIllIl instanceof Illllll) {
            Illllll illllll = (Illllll)iIllIl;
            linkedHashMap.put("items", illllll.lll());
            return linkedHashMap;
        }
        if (!(iIllIl instanceof IIIIllIll)) return linkedHashMap;
        IIIIllIll iIIIllIll = (IIIIllIll)iIllIl;
        linkedHashMap.put("buttonLabel", iIIIllIll.lI());
        return linkedHashMap;
    }

    /*
     * Unable to fully structure code
     */
    private lllIlIII IIllI(String var1_1) {
        block5: {
            block4: {
                var2_2 = this.l.IlI().IIlIlI().iterator();
                break block4;
lbl3:
                // 1 sources

                while (true) {
                    if (!(var3_3 instanceof ModuleBase)) break block4;
                    break block5;
                    break;
                }
lbl6:
                // 1 sources

                return var3_3;
            }
lbl9:
            // 2 sources

            while (true) {
                if (var2_2.hasNext()) {
                    var3_3 = var2_2.next();
                    ** continue;
                }
                var6_5 = var1_1;
                var5_6 = "Unknown HUD element: ";
                throw new IllegalArgumentException(var5_6 + var6_5);
            }
        }
        ** while (!(var4_4 = (ModuleBase)var3_3).IIllllI().equalsIgnoreCase((String)var1_1))
lbl18:
        // 1 sources

        ** while (true)
    }

    Map<String, Object> IIlll() {
        return this.IlII(() -> {
            this.l.IIII();
            return this.IIlllI("saved", true);
        });
    }

    Map<String, Object> IlIII(int n) {
        return this.IlII(() -> {
            LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
            linkedHashMap.put("ok", true);
            linkedHashMap.put("port", n);
            linkedHashMap.put("webEnabled", true);
            linkedHashMap.put("nativeFallbackAvailable", false);
            linkedHashMap.put("clickGuiBind", this.lIII(this.l.IIl().IlIll()));
            Path path = this.l.IIl().IllIIl();
            linkedHashMap.put("backupDirectory", path == null ? null : path.toString());
            linkedHashMap.put("selectedCategory", IIlIIIIlI.IIII(this.l.IIl().IllIII()));
            linkedHashMap.put("selectedModule", this.l.IIl().IIIIIl());
            linkedHashMap.put("serverAddress", this.IIll());
            Interface interface_ = this.l.IlI() == null ? null : this.l.IlI().IlIlIl();
            if (interface_ == null) return linkedHashMap;
            linkedHashMap.put("clickGuiTheme", this.IIIllI(interface_));
            return linkedHashMap;
        });
    }

    Map<String, Object> IlIIl(String string) {
        return this.IlII(() -> {
            Path path = this.IllII(string);
            return this.IIlllI("backup", path.toString());
        });
    }

    private Path IllII(String string) {
        try {
            this.l.IIII();
            Path path = this.l.IIl().II(string == null || string.isBlank() ? "manual" : string);
            this.I = true;
            return path;
        }
        catch (Exception exception) {
            String string2 = exception.getMessage();
            String string3 = "Could not create ClickGUI backup: ";
            throw new IllegalStateException(string3 + string2, exception);
        }
    }

    Map<String, Object> IllIl(JsonObject jsonObject) {
        return this.IlII(() -> this.lII().lIIl(this.lIlII(jsonObject, "id"), this.IIIlll(jsonObject)));
    }

    Map<String, Object> IlllI(JsonObject jsonObject) {
        return this.llIl("before-module-toggle", () -> {
            ModuleBase moduleBase = this.llll(this.lIlII(jsonObject, "module"));
            if (moduleBase.lllllI()) {
                if (jsonObject.has("enabled")) {
                    moduleBase.IIlIIll(jsonObject.get("enabled").getAsBoolean());
                } else {
                    moduleBase.llllIl();
                }
                this.l.IIII();
                return this.IIlllI("module", this.lll(moduleBase, true));
            }
            throw new IllegalArgumentException("Module is not toggleable");
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private String Illll(IIllIl<?> iIllIl) {
        if (iIllIl instanceof llIll) {
            return "boolean";
        }
        if (iIllIl instanceof lIlIIlI) {
            return "number";
        }
        if (iIllIl instanceof IIIlIlIIl) {
            return "range";
        }
        if (iIllIl instanceof IIIIIIIIl) {
            return "enum";
        }
        if (iIllIl instanceof llIlIlI) {
            return "multiselect";
        }
        if (iIllIl instanceof lIIllII) {
            return "keybind";
        }
        if (iIllIl instanceof llIlIlII) {
            return "color";
        }
        if (iIllIl instanceof lllIlI) {
            return "text";
        }
        if (iIllIl instanceof Illllll) {
            return "text-list";
        }
        if (!(iIllIl instanceof IIIIllIll)) return "unknown";
        return "action";
    }

    Map<String, Object> lIIII(JsonObject jsonObject) {
        return this.IlII(() -> {
            this.IllII("before-profile-load");
            String string = this.lIIlI(this.lIlII(jsonObject, "name"));
            boolean bl = this.II.I(string, this.l.IlI());
            if (!bl) {
                throw new IllegalStateException("Could not load profile");
            }
            this.l.IIII();
            return this.Illl();
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIIl(String string) {
        if (this.I) {
            return;
        }
        this.IllII(string == null ? "before-web-mutation" : string);
        this.I = true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String lIIlI(String string) {
        if (string == null) {
            return "";
        }
        String string2 = string.replaceAll("[^a-zA-Z0-9 _\\\\-]", "").trim();
        if (string2.length() <= 20) return string2;
        return string2.substring(0, 20);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Map<String, Object> lIIll(Category category) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put("name", IIlIIIIlI.IIII(category));
        linkedHashMap.put("label", IIlIIIIlI.IlIIlI(category));
        String string = ".png";
        String string2 = IIlIIIIlI.IllIlI(category);
        String string3 = "/asset/assets/virel/textures/w6t2c8/categories/";
        linkedHashMap.put("icon", string3 + string2 + string);
        return linkedHashMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    private String lIlII(JsonObject jsonObject, String string) {
        String string2 = this.Il(jsonObject, string);
        if (string2 != null && !string2.isBlank()) {
            return string2;
        }
        String string3 = string;
        String string4 = "Missing ";
        throw new IllegalArgumentException(string4 + string3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Map<String, Object> lIllI(lllIlIII lllIlIII2) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        if (lllIlIII2 instanceof ModuleBase) {
            ModuleBase moduleBase = (ModuleBase)((Object)lllIlIII2);
            linkedHashMap.put("module", moduleBase.IIllllI());
            linkedHashMap.put("label", moduleBase.IIIl());
            linkedHashMap.put("category", IIlIIIIlI.IIII(moduleBase.IlIlIIl()));
            linkedHashMap.put("enabled", moduleBase.IIIlIIl());
            linkedHashMap.put("toggleable", moduleBase.lllllI());
        } else {
            linkedHashMap.put("module", lllIlIII2.getClass().getSimpleName());
            linkedHashMap.put("label", lllIlIII2.getClass().getSimpleName());
            linkedHashMap.put("category", IIlIIIIlI.IIII(Category.I));
            linkedHashMap.put("enabled", true);
            linkedHashMap.put("toggleable", false);
        }
        linkedHashMap.put("x", lllIlIII2.IlII());
        linkedHashMap.put("y", lllIlIII2.IlIl());
        linkedHashMap.put("width", lllIlIII2.III());
        linkedHashMap.put("height", lllIlIII2.IIll());
        return linkedHashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    IIlIIIIlI(ClientEntrypoint clientEntrypoint) {
        this.l = clientEntrypoint;
        this.II = new CloudConfigManager(clientEntrypoint.IIl());
    }

    /*
     * Unable to fully structure code
     */
    private Map<String, Object> lIlll(boolean var1_1) {
        block33: {
            block36: {
                block35: {
                    block31: {
                        block34: {
                            block30: {
                                block26: {
                                    block32: {
                                        block29: {
                                            block28: {
                                                block27: {
                                                    break block33;
lbl1:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl3:
                                                    // 1 sources

                                                    while (var2_2.getWindow() != null) {
                                                        break block26;
                                                    }
                                                    break block27;
lbl6:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var2_2 == null) break block27;
                                                        ** GOTO lbl3
lbl9:
                                                        // 2 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                        break;
                                                    }
lbl11:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var16_12 != var8_8) break block28;
                                                        break block29;
                                                        break;
                                                    }
                                                    while (true) {
                                                        break block30;
                                                        break;
                                                    }
                                                }
lbl17:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl19:
                                                // 2 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl21:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl23:
                                                // 1 sources

                                                while (true) {
                                                    v0 = null;
                                                    break block31;
                                                    break;
                                                }
lbl26:
                                                // 1 sources

                                                while (true) {
                                                    var21_14 = var6_6.Il();
                                                    var20_15 = "/api/hud/preview.png?t=";
                                                    v0 = var20_15 + var21_14;
                                                    break block31;
                                                    break;
                                                }
lbl31:
                                                // 1 sources

                                                while (true) {
                                                    v1 = var6_6.Il();
                                                    ** GOTO lbl9
                                                    break;
                                                }
lbl34:
                                                // 1 sources

                                                while (true) {
                                                    v2 = true;
                                                    ** GOTO lbl19
                                                    break;
                                                }
                                            }
lbl38:
                                            // 2 sources

                                            while (true) {
                                                var7_7.lllI(var16_12, var18_13);
                                                break block32;
                                                break;
                                            }
lbl41:
                                            // 3 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl43:
                                            // 2 sources

                                            while (true) {
                                                if (!var6_6.hasNext()) ** continue;
                                                ** continue;
                                                break;
                                            }
lbl46:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl48:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        if (var18_13 == var10_9) break block32;
                                        ** while (true)
lbl53:
                                        // 1 sources

                                        return var7_7;
lbl55:
                                        // 1 sources

                                        while (var6_6 != null) {
                                            ** continue;
lbl57:
                                            // 1 sources

                                            ** GOTO lbl34
                                        }
                                        break block34;
lbl59:
                                        // 1 sources

                                        while (true) {
                                            var16_12 = Math.max(0.0, Math.min(var8_8, var12_10));
                                            var18_13 = Math.max(0.0, Math.min(var10_9, var14_11));
                                            ** continue;
                                            break;
                                        }
lbl63:
                                        // 1 sources

                                        while (true) {
                                            var7_7.put("viewportHeight", var4_4);
                                            ** GOTO lbl55
                                            break;
                                        }
                                        var7_7 = var6_6.next();
                                        if (var2_2 == null) break block32;
                                        break block35;
                                        var7_7.put("previewCapturedAt", v1);
                                        ** while (var6_6 != null)
lbl73:
                                        // 1 sources

                                        ** while (true)
                                        var7_7.put("ok", true);
                                        var7_7.put("viewportWidth", var3_3);
                                        ** while (true)
                                    }
lbl80:
                                    // 2 sources

                                    while (true) {
                                        var5_5.add(this.lIllI((lllIlIII)var7_7));
                                        ** GOTO lbl43
                                        break;
                                    }
lbl84:
                                    // 1 sources

                                    while (true) {
                                        IIlIII.II(var2_2, 0L);
                                        ** GOTO lbl41
                                        break;
                                    }
                                    var12_10 = Math.max(0.0, (double)var3_3 - var7_7.III());
                                    var14_11 = Math.max(0.0, (double)var4_4 - var7_7.IIll());
                                    ** while (true)
                                }
                                var3_3 = var2_2.getWindow().getScaledWidth();
                                var4_4 = var2_2.getWindow().getScaledHeight();
                                ** while (true)
                                var7_7.put("previewAvailable", v2);
                                ** while (var6_6 != null)
lbl97:
                                // 1 sources

                                break block36;
lbl98:
                                // 1 sources

                                while (true) {
                                    if (var2_2 == null) ** GOTO lbl41
                                    ** continue;
                                    break;
                                }
                            }
                            var6_6 = IIlIII.I();
                            var7_7 = new LinkedHashMap<K, V>();
                            ** while (true)
lbl105:
                            // 1 sources

                            while (true) {
                                var7_7.put("elements", var5_5);
                                ** continue;
                                break;
                            }
                        }
                        v2 = false;
                        ** while (true)
                    }
                    var7_7.put("previewUrl", v0);
                    ** while (true)
                }
                ** while (var2_2.getWindow() == null)
lbl118:
                // 1 sources

                ** while (true)
            }
            v1 = 0L;
            ** while (true)
            var8_8 = var7_7.IlII();
            var10_9 = var7_7.IlIl();
            ** while (true)
        }
        var2_2 = MinecraftClient.getInstance();
        if (var1_1) ** break;
        ** while (true)
        ** while (true)
        var5_5 = new ArrayList<Map<String, Object>>();
        var6_6 = this.l.IlI().IIlIlI().iterator();
        ** while (true)
        var3_3 = 854;
        var4_4 = 480;
        ** while (true)
    }

    Map<String, Object> llIII(JsonObject jsonObject) {
        return this.llIl("before-keybind-update", () -> {
            ModuleBase moduleBase = this.llll(this.lIlII(jsonObject, "module"));
            InputUtil.Key key = this.IIIlll(jsonObject);
            String string = this.Il(jsonObject, "setting");
            if (string != null && !string.isBlank()) {
                IIllIl<?> iIllIl = this.IIllII(moduleBase, string);
                if (!(iIllIl instanceof lIIllII)) throw new IllegalArgumentException("Setting is not a keybind");
                lIIllII lIIllII2 = (lIIllII)iIllIl;
                lIIllII2.Il(key);
                this.l.IIII();
                return this.IIlllI("setting", this.IIIll(iIllIl));
            }
            moduleBase.IIIIIll(key);
            this.l.IIII();
            return this.IIlllI("module", this.lll(moduleBase, true));
        });
    }

    Map<String, Object> llIIl(JsonObject jsonObject) {
        return this.llIl("before-action-press", () -> {
            ModuleBase moduleBase = this.llll(this.lIlII(jsonObject, "module"));
            IIllIl<?> iIllIl = this.IIllII(moduleBase, this.lIlII(jsonObject, "setting"));
            if (!(iIllIl instanceof IIIIllIll)) throw new IllegalArgumentException("Setting is not an action");
            IIIIllIll iIIIllIll = (IIIIllIll)iIllIl;
            iIIIllIll.IIl();
            this.l.IIII();
            return this.IIlllI("setting", this.IIIll(iIllIl));
        });
    }

    Map<String, Object> llIlI() {
        return this.IlII(() -> {
            LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
            ArrayList<Map<String, Object>> arrayList = new ArrayList<Map<String, Object>>();
            for (Category category : Category.values()) {
                arrayList.add(this.lIIll(category));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator<ModuleBase> iterator = this.l.IlI().IIIIIll().iterator();
            while (true) {
                if (!iterator.hasNext()) {
                    linkedHashMap.put("ok", true);
                    linkedHashMap.put("categories", arrayList);
                    linkedHashMap.put("modules", arrayList2);
                    return linkedHashMap;
                }
                ModuleBase moduleBase = iterator.next();
                arrayList2.add(this.lll(moduleBase, true));
            }
        });
    }

    Map<String, Object> lllII() {
        return this.IlII(() -> {
            try {
                this.l.IIII();
                this.l.IIl().II("before-web-restore");
                Path path = this.l.IIl().IIlIIl(this.l.IlI());
                this.l.IIII();
                this.I = true;
                return this.IIlllI("restored", path.toString());
            }
            catch (Exception exception) {
                throw new IllegalStateException(exception.getMessage(), exception);
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color lllIl(JsonElement jsonElement) {
        if (jsonElement == null) return new Color(255, 255, 255, 255);
        if (jsonElement.isJsonNull()) {
            return new Color(255, 255, 255, 255);
        }
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            int n = this.llI(jsonObject, "r", 255);
            int n2 = this.llI(jsonObject, "g", 255);
            int n3 = this.llI(jsonObject, "b", 255);
            int n4 = this.llI(jsonObject, "a", 255);
            return new Color(IIlIIIIlI.lIll(n), IIlIIIIlI.lIll(n2), IIlIIIIlI.lIll(n3), IIlIIIIlI.lIll(n4));
        }
        String string = jsonElement.getAsString().trim();
        if (string.startsWith("#")) {
            string = string.substring(1);
        }
        long l2 = Long.parseLong(string, 16);
        if (string.length() <= 6) return new Color((int)l2 | 0xFF000000, true);
        return new Color((int)l2, true);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    Map<String, Object> llllI() {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put("ok", false);
        linkedHashMap.put("error", "Native ClickGUI fallback has been removed; web ClickGUI cannot be disabled from the UI.");
        return linkedHashMap;
    }

    Map<String, Object> lllll(JsonObject jsonObject) {
        return this.llIl("before-setting-update", () -> {
            ModuleBase moduleBase = this.llll(this.lIlII(jsonObject, "module"));
            IIllIl<?> iIllIl = this.IIllII(moduleBase, this.lIlII(jsonObject, "setting"));
            this.ll(iIllIl, jsonObject.get("value"));
            this.l.IIII();
            return this.IIlllI("setting", this.IIIll(iIllIl));
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private Map<String, Object> IIIIII(IIIIIIIIl<?> iIIIIIIIl, Enum<?> enum_) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put("name", iIIIIIIIl.IlI(enum_));
        linkedHashMap.put("label", enum_ != null ? enum_.toString() : "");
        return linkedHashMap;
    }

    Map<String, Object> IIIIIl(JsonObject jsonObject) {
        return this.IlII(() -> this.lII().IlIlI(this.lIlII(jsonObject, "id")));
    }

    Map<String, Object> IIIIlI() {
        return this.IlII(() -> this.IIlllI("export", this.II.IlIIl(this.l.IlI())));
    }

    Map<String, Object> IIIlIl(JsonObject jsonObject) {
        return this.llIl("before-profile-save", () -> {
            String string = this.lIlII(jsonObject, "name");
            if (string != null && string.trim().length() > 20) throw new IllegalArgumentException("Config name cannot exceed 20 characters");
            String string2 = this.lIIlI(string);
            if (string2.isBlank()) throw new IllegalArgumentException("Missing profile name");
            if (string2.length() > 20) throw new IllegalArgumentException("Missing profile name");
            boolean bl = this.II.IIII(string2, this.l.IlI());
            if (bl) return this.Illl();
            throw new IllegalStateException("Could not save profile");
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private Map<String, Object> IIIllI(Interface interface_) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        IIIIllllI iIIIllllI = interface_.IlI();
        linkedHashMap.put("style", iIIIllllI == null ? "CUSTOM" : IIlIIIIlI.IIII(iIIIllllI));
        linkedHashMap.put("label", iIIIllllI == null ? "Custom" : iIIIllllI.toString());
        linkedHashMap.put("accent", this.IlIllI(interface_.lIlI()));
        linkedHashMap.put("customAccent", this.IlIllI(interface_.llllI()));
        linkedHashMap.put("accent2", this.IlIllI(interface_.IIlII()));
        linkedHashMap.put("accentSoft", this.IlIllI(interface_.lIIl()));
        linkedHashMap.put("panel", this.IlIllI(interface_.IlIIl()));
        linkedHashMap.put("panelDark", this.IlIllI(interface_.IIIllI()));
        linkedHashMap.put("background", this.IlIllI(interface_.IlIlI()));
        linkedHashMap.put("glass", this.IlIllI(interface_.IIIlll()));
        return linkedHashMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    private InputUtil.Key IIIlll(JsonObject jsonObject) {
        String string = this.Il(jsonObject, "inputType");
        if (string == null) {
            string = this.Il(jsonObject, "type");
        }
        int n = this.llI(jsonObject, "code", -1);
        if (n < 0) return InputUtil.UNKNOWN_KEY;
        if (string == null) return InputUtil.UNKNOWN_KEY;
        if ("unknown".equalsIgnoreCase(string)) return InputUtil.UNKNOWN_KEY;
        if (!"none".equalsIgnoreCase(string)) {
            if (!"mouse".equalsIgnoreCase(string)) return lIIllllI.IlIIIll(n);
            return lIIllllI.lllII(n);
        }
        return InputUtil.UNKNOWN_KEY;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIllIl<?> IIllII(ModuleBase moduleBase, String string) {
        IIllIl<?> iIllIl;
        if (string == null) throw new IllegalArgumentException("Missing setting");
        if (string.isBlank()) {
            throw new IllegalArgumentException("Missing setting");
        }
        Iterator<IIllIl<?>> iterator = moduleBase.IlIlIl().iterator();
        do {
            if (iterator.hasNext()) continue;
            String string2 = string;
            String string3 = "Unknown setting: ";
            throw new IllegalArgumentException(string3 + string2);
        } while (!(iIllIl = iterator.next()).llII().equalsIgnoreCase(string));
        return iIllIl;
    }

    private Map<String, Object> IIlllI(String string, Object object) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put("ok", true);
        linkedHashMap.put(string, object);
        return linkedHashMap;
    }

    Map<String, Object> IlIIIl(JsonObject jsonObject) {
        return this.IlII(() -> this.lII().lIIIl(this.lIlII(jsonObject, "id")));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String IlIIlI(Category category) {
        switch (category) {
            case lI: {
                return "Interface";
            }
            default: {
                throw new MatchException(null, null);
            }
            case II: {
                return "Combat";
            }
            case l: {
                return "Render";
            }
            case I: {
                return "Hud";
            }
            case ll: {
                return "Movement";
            }
            case IIl: 
        }
        return "Player";
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IlIlII(JsonObject jsonObject, String string, double d) {
        double d2;
        if (jsonObject != null && jsonObject.has(string) && !jsonObject.get(string).isJsonNull()) {
            d2 = jsonObject.get(string).getAsDouble();
            return d2;
        }
        d2 = d;
        return d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Map<String, Object> IlIllI(Color color) {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        Color color2 = color == null ? new Color(255, 255, 255, 255) : color;
        linkedHashMap.put("r", color2.getRed());
        linkedHashMap.put("g", color2.getGreen());
        linkedHashMap.put("b", color2.getBlue());
        linkedHashMap.put("a", color2.getAlpha());
        linkedHashMap.put("hex", String.format("#%02X%02X%02X", color2.getRed(), color2.getGreen(), color2.getBlue()));
        return linkedHashMap;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String IllIlI(Category category) {
        switch (category) {
            case II: {
                return "combat";
            }
            case l: {
                return "render";
            }
            case IIl: {
                return "player";
            }
            default: {
                throw new MatchException(null, null);
            }
            case I: {
                return "hud";
            }
            case lI: {
                return "interface";
            }
            case ll: 
        }
        return "movement";
    }

    /*
     * Enabled aggressive block sorting
     */
    private List<Map<String, Object>> IlllII(llIlIlI llIlIlI2) {
        ArrayList<Map<String, Object>> arrayList = new ArrayList<Map<String, Object>>();
        Iterator<IlllIll> iterator = llIlIlI2.IIIl().iterator();
        while (iterator.hasNext()) {
            IlllIll illlIll = iterator.next();
            LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
            linkedHashMap.put("name", illlIll.l());
            linkedHashMap.put("label", illlIll.ll());
            arrayList.add(linkedHashMap);
        }
        return arrayList;
    }

    private static int IlllIl(int n, int n2) {
        return Il[n ^ 0xFED9B425] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            block13: {
                block12: {
                    block14: {
                        block17: {
                            block16: {
                                break block16;
lbl1:
                                // 1 sources

                                while (true) {
                                    var3_4 += 4;
                                    if (++var4_5 >= var1_2) break block12;
lbl4:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    break;
                                }
lbl6:
                                // 1 sources

                                while (true) {
                                    var11_11 += var12_12;
                                    break block13;
                                    break;
                                }
lbl9:
                                // 1 sources

                                while (true) {
                                    continue;
lbl11:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    break;
                                }
lbl13:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl15:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl17:
                                // 1 sources

                                while (true) {
                                    IIlIIIIlI.Il = new int[var1_2];
                                    ** continue;
                                    break;
                                }
                                var3_4 = 0;
                                var4_5 = 0;
                                ** while (true)
                            }
                            var6 = 25998;
                            var7_7 = "\uf908\uf8f4\uf912\uf91e\uf907\uf913\uf937\uf937\u3cf9\u3d1b\u3d1f\u3d20\u3cfa\u3d23\u3d22\u3d4a\u34ee\u34ed\u34c7\u34de\u34d2\u34e5\u34e8\u34c5\u34ce\u34e5\u34d2\u34b9\u34b5\u34b3\u34c3\u34c5\u34bc\u34b3\u34cd\u34b2\u34d2\u34a9\u34d2\u34bb\u34c5\u34c6\u34a9\u34dc\u34cb\u34bb\u34be\u34cf\u34d2\u34d8\u34b8\u34cb\u34b7\u34ca\u3490\u34da\u34ac\u34a9\u34de\u34d1\u34ae\u34b7\u34c8\u34b0\u34bc\u34ae\u34c3\u34b3\ub103\ub104\ub122\ub0f3\ub0f7\ub10c\ub101\ub12c\ub123\ub10c\ub0f7\ub110\ub11c\ub11e\ub12e\ub12c\ub115\ub11e\ub124\ub117\ub0f7\ub140\ub0f7\ub116\ub12c\ub12b\ub140\ub0f5\ub126\ub116\ub113\ub0fa\ub0f7\ub0f1\ub111\ub126\ub112\ub11f\ub139\ub0ef\ub145\ub140\ub0f3\ub0f8\ub143\ub112\ub121\ub119\ub115\ub143\ub12e\ub11e\udfbe\udfd2\udfb8\udfea\udfc1\udfde\udfc4\udfeb\udfde\udfd7\udfbf\udfec\udfe7\udfd2\udfee\udfcb\udfdc\udf6f\udfbe\udfce\udfc2\udfcc\udfbf\udfc7\udfdd\udf6f\udfbd\udfc7\udfd7\udfc1\udfdf\udfe5\udfc1\udfcd\udfc7\udfe4\udfed\udfda\udfc6\udfd9\udf78\udfc5\udfbb\udfcc\ue2c3\ue2e7\ue2c1\ue2cf\ue2b8\ue2e3\ue2bd\ue2d6\ue2e3\ue2e2\ue2ba\ue2d5\ue2d2\ue2e7\ue2d3\ue2b6\ue2e5\ue28a\ue2c3\ue2b3\ue2b7\ue2b5\ue2ba\ue2b2\ue2e4\ue28a\ue2c4\ue2b2\ue2e2\ue2b8\ue2da\ue2dc\ue2b8\ue2b4\ue2b2\ue2dd\ue2d4\ue2df\ue2bb\ue2e0\ue281\ue2bc\ue2c6\ue2b5\u53c3\u5381\u53d0\u53d8\u53b8\u53be\u53d4\u53ec\u53e0\u53d0\u53cd\u53d3\u53cf\u53dc\u53c2\u53ed\u53cf\u538d\u53b4\u53d8\u5383\u53b7\u53c5\u53e4\u53e4\u53ed\u53bb\u53e5\u53e4\u53e0\u53e0\u53b3\u53b8\u53d5\u5384\u53cf\u53df\u53bf\u53b4\u53b2\u5384\u53c2\u5380\u53b5\u53b9\u5385\u53d3\u53d0\u8490\u8478\u8492\u848a\u84a9\u8471\u84ae\u848a\u847a\u8493\u84d4\u8486\u8486\u8478\u848f\u8478\u848a\u848c\u84a0\u8487\u84a9\u8492\u8483\u84a1\u8475\u84d9\u8493\u848c\u8476\u84a7\u8481\u8478\uedc1\uedd3\uedb9\uedde\uedc6\ueddb\uedd7\ueddc\u4b33\u4b51\u4b0d\u4b0d\u3672\u36a4\u36c8\u36c8\u66c2\u66d3\u66b4\u66e7\u66c5\u66b9\u66b8\u66e8\ue5d6\ue5e9\ue5bb\ue5c8\ue5d0\ue5ec\ue5ed\ue5c8\ue5b1\ue5c7\ue590\ue5d7\ue5ba\ue5bf\ue5e1\ue5c8\ue5b8\ue5b6\ue5d7\ue5c1\ue5a9\ue5ae\ue5ea\ue5dd\ue5cc\ue5e9\ue5d1\ue5ce\ue5ca\ue5d0\ue5ba\ue5c2\ue5d5\ue5d1\ue5e2\ue5da\ua2fc\ua313\ua2fd\ua32c\ua302\ua31b\ua309\ua329\ua315\ua2f8\ua337\ua320\ua31c\ua324\ua336\ua321\ua32c\ua2fc\ua329\ua30b\ua306\ua300\ua2f7\ua31a\ua318\ua313\ua322\ua309\ua31e\ua301\ua2f8\ua313\ua33e\ua2f8\ua328\ua322\ua328\ua31b\ua2fb\ua309\ua33c\ua339\ua306\ua313\ua2ff\ua317\ua306\ua309\ua328\ua33e\ua2f9\ua317\u1d2d\u1d11\u1cf3\u1cf7\u1d2e\u1cf2\u1d5e\u1d5e\ub60a\ub62c\ub610\ub60f\ub609\ub614\ub611\ub639\uc314\uc2f0\uc369\uc2f2\uc310\uc2f8\uc30c\uc30b\uc307\uc30e\uc2ef\uc30b\uc2f8\uc300\uc313\uc365\u6d9f\u6d83\u6dde\u6d85\u6da3\u6d8b\u6d77\u6d78\u6d7c\u6d7c\u6d9e\u6d78\u6d8b\u6d86\u6d9d\u6dac\uc862\uc81a\uc837\uc84e\uc862\uc83b\uc81a\uc836\uc83e\uc868\uc83a\uc812\u5c51\u5c35\u5c39\u5c33\u5c51\u5c6a\u5c67\u5c58\u5c4c\u5c3c\u5c54\u5c58\u5c3d\u5c28\u5c38\u5c20\u49ee\u49ba\u49d0\u49b6\u49ee\u49e8\u49b6\u49b1\u49b6\u49bf\u499b\u499b\u6f43\u6f63\u6f39\u6f59\u6f42\u6f35\u6f57\u6f5c\u6f5a\u6f5b\u6ef7\u6f4b\u6f69\u6f5e\u6ef2\u6ef2\u4646\u45f8\u4669\u4661\u4639\u4643\u466d\u4655\u4659\u466c\u45f0\u45f0\u7c78\u7cbf\u7c91\u7c9b\u7c7c\u7c95\u7cad\u7c74\u7cac\u7c95\u7cc5\u7cad\u7c8f\u7cad\u7c98\u7cc8\ua029\u9ffa\ua010\ua001\ua02b\u9ff2\ua024\ua004\u9ff8\ua015\ua056\ua00d\ua00d\ua007\ua04f\ua021\ua008\ua00e\ua022\ua009\ua02a\u9fef\ua05b\ua05b\u7569\u7512\u7540\u754e\u756d\u7544\u753c\u7565\u753d\u7544\u7514\u753c\u7542\u753c\u7549\u7519\u3673\u3688\u368c\u36a7\u3670\u36ac\u3670\u367b\u36a0\u36a7\u36c3\u36c3\u7edd\u7ebe\u7ec2\u7ebc\u7ee6\u7eec\u7eec\u7eb0\u7ec6\u7eb6\u7ec1\u7ece\u7eb0\u7ea0\u7ee1\u7ea7\uafc6\uafe4\uafe9\uafdc\u3640\u35fc\u366d\u3668\u3640\u3669\u3669\u3651\u365d\u363e\u35ef\u35f4\u77ff\u77fc\u782a\u781d\u7805\u77f9\u77f8\u781d\u7824\u781b\u77f3\u782a\u782e\u7837\u7800\u781b\u782b\u7833\u780b\u7818\u77ff\u77fc\u783e\u7813\u7817\u7813\u7809\u780d\u5f57\u5f63\u5f5f\u5f34\u5f26\u5f35\u5f63\u5f4c\u5f4b\u5f5b\u5f3e\u5f46\u5f36\u5f1f\u5f5f\u5f56\u5f36\u5f62\u5f28\u5f28\ud79d\ud7e1\ud7e5\ud795\ud799\ud7ae\ud780\ud783\ud785\ud774\ud773\ud77f\ud771\ud78c\ud7a6\ud77a\ud132\ud14e\ud14a\ud15d\ud10b\ud15c\ud14e\ud165\ud166\ud136\ud153\ud16b\ud15b\ud10a\ud14a\ud13b\ud15b\ud147\ud101\ud101\ub435\ub455\ub464\ub43c\ub431\ub436\ub45c\ub43c\ub468\ub46d\ub406\ub401\u9f1a\u9f0b\u9f2c\u9eef\u9f1d\u9f21\u9f20\u9ef0\u2277\u22a7\u2281\u2273\u2278\u2279\u22a7\u2292\u22a9\u2274\u22ce\u22ce\udfd4\udfb2\udfce\udfcd\udfd3\udfca\udfcb\udfa3\u8234\u8255\u820d\u8259\u8231\u826d\u8201\u8201\u3d00\u3d10\u3cfa\u3d0c\u3cff\u3d02\u3d10\u3d29\u3d12\u3d0b\u3d35\u3d35\udde4\uddb2\udddc\uddca\udde2\uddd0\udddd\udd93\ua362\ua31c\ua34d\ua345\ua361\ua35e\ua349\ua368\u12a1\u12d9\u129a\u127d\u12a1\u127d\u12d1\u12d1\ud426\ud45d\ud452\ud455\u7c3f\u7c62\u7c3c\u7c6d\u7c3f\u7c67\u7bf3\u7bf3\u672b\u6752\u66ff\u66f0\u6712\u66f3\u6721\u66f0\u66f2\u672d\u6704\u66f4\u6701\u6706\u675a\u675a\u2b47\u2b33\u2b51\u2b64\u2b47\u2b54\u2afc\u2b56\u2b3f\u2b4b\u2af5\u2b45\u2b65\u2b6d\u2af4\u2b5c\u2b5f\u2b69\u2b4d\u2b0a\u2b4c\u2b6d\u2b48\u2b3f\u2b52\u2b6d\u2af3\u2b45\u2b52\u2af4\u2b50\u2af8\udee6\ude9e\udee1\udeed\udee3\uded1\udebf\udedc\udeb7\udeb7\udebc\ude9a\udeca\udeaf\udecb\udeed\u7125\u711a\u70fc\u70f2\u7126\u711b\u7112\u7102\u712e\u7108\u70fb\u710c\u710e\u70f0\u7112\u7104\u7109\u7105\u7102\u7102\u4536\u450a\u4557\u4566\u4532\u456b\u454d\u4559\u4567\u456b\u4536\u450d\u455c\u4566\u4549\u453c\u455c\u454f\u4543\u4552\u4535\u4548\u4502\u4502\uab30\uab0c\uab5d\uab60\uab34\uab69\uab47\uab5b\uab6d\uab69\uab30\uab0d\uab59\uab0c\uab4b\uab54\uab58\uab00\uab60\uab04\ud0f9\ud145\ud114\ud113\ud0f9\ud0fa\ud10a\ud114\ud0ef\ud120\ud0f9\ud126\ud113\ud102\ud102\ud117\ud11a\ud111\ud14d\ud14d\ueb5c\ueb24\ueb57\ueb53\ueb5d\ueb67\ueb39\ueb66\ueb41\ueb41\ueb46\ueb59\ueb30\ueb39\ueb5f\ueb44\ueb32\ueb56\ueb2c\ueb2c\u33f6\u3409\u341b\u3428\u33f0\u340c\u340d\u3428\u3411\u3427\u3428\u3418\u341d\u3413\u340f\u342e\u341c\u3408\u33fb\u33fb\u33f2\u3409\u341c\u33f7\u342c\u33fc\u3446\u3446\u7616\u75f8\u7651\u760a\u7628\u761a\u7600\u75f8\u75f4\u7651\u7619\u7621\u7600\u7655\u7616\u760d\u7601\u7659\u75f9\u765d\u19c8\u19e0\u19ca\u19bc\u19af\u19b2\u19e0\u19d9\u19e2\u19b6\u19c1\u19b9\u19d8\u198d\u19ce\u19d5\u19d9\u1981\u19b9\u19dd\u1987\u19bb\u1985\u1985\u6e62\u6e5e\u6e38\u6e34\u6e61\u6e3d\u6e11\u6e11\u8a83\u8aa1\u8a9d\u8a9e\u8a84\u8a99\u8a9c\u8ab4\ueb32\ueb09\ueb06\ueb01\u5528\u5550\u54f1\u5504\u5528\u54f5\u5550\u54fc\u54f4\u552b\u54f2\u54f6\u5502\u5512\u5558\u5558\ue058\ue04e\ue060\ue043\ue05b\ue046\ue042\ue045\ue043\ue061\ue027\ue027\ufffd\u0001#'\ufffe\"NN\u7c3a\u7c57\u7bff\u7c53\u7c3b\u7c5f\u7c0b\u7c0b\uadd3\uaded\uadae\uadb5\uadd1\uadcb\uade9\uaddb\uadc7\uadce\uada2\uada2\uaedb\uaee5\uaebf\uaece\uaede\uaec3\uaee0\uaeaa\u4417\u43fb\u43ef\u4404\u4417\u4406\u442d\u4413\u4403\u43f4\u4426\u4400\u43f3\u43fe\u4425\u4414\u32c1\u32b7\u32dd\u32d0\u32c0\u32d9\u32be\u3274\u875e\u873a\u8736\u8741\u875e\u873f\u8768\u8752\u8742\u8731\u875f\u8745\u8732\u8737\u8760\u8751^H!Q\u7999\u798b\u797f\u797a\u870d\u8732\u8724\u8714\u870c\u8725\u8739\u8739\u3327\u32f7\u3311\u3325\u332a\u3302\u335e\u335e\ud8a0\ud876\ud8db\ud8ab\u3ede\u3ec8\u3ec4\u3ebd\ua66a\ua64c\ua615\ua63c\ua66a\ua635\ua615\ua610\ua62f\ua634\ua64d\ua619\u75f1\u7613\u764e\u7623\u75f1\u762e\u764e\u7647\u762a\u762e\u762e\u7642\ua3e6\ua399\ua3cb\ua3bb\ua3e3\ua3ce\ua392\ua392\u0ace\u0ade\u0ab4\u0ac0\u0acb\u0ae3\u0a77\u0a77\u500e\u5036\u5010\u5021\u500e\u5010\u5018\u5018\u5011\u4ff3\u503d\u503d\ueff6\uf04e\uf028\uf019\ueff6\uf028\uf020\uf020\uf029\uf00b\uf045\uf045\u4667\u4654\u4613\u4663\u4667\u4643\u4617\u4617\uc05e\uc026\uc065\uc04a\uc058\uc064\uc060\uc02e\uebb4\uebe6\uebdb\uebeb\uebb4\uebee\uebb0\ueb82\u1457\u1459\u1432\u1433\u145b\u1436\u144e\u144e\u1452\u1436\u1426\u1442\u1430\u144e\u1437\u1427\uf951\uf96e\uf938\uf94b\uf953\uf967\uf96a\uf94b\uf936\uf94d\uf965\uf938\uf93c\uf929\uf952\uf94d\uf93d\uf925\uf95d\uf94a\uf952\uf929\uf947\uf939\uf947\uf92a\uf92a\uf930\u291b\u2925\u28ff\u290e\u291e\u2903\u2920\u296a\ue992\ue9d2\ue991\ue983\ue9ac\ue983\ue9d5\ue97d\ue97d\ue9ad\ue988\ue981\ue974\ue98b\ue97b\ue972\ue98d\ue9de\ue99b\ue98a\ue9ae\ue991\ue9ae\ue982\ue973\ue995\ue98a\ue99f\ue97d\ue9a9\ue990\ue97b\ubcf3\ubd07\ubd2d\ubd21\ubcf4\ubd28\ubd44\ubd44\uee39\uee5b\uee5f\uee60\uee3a\uee63\uee62\uee0a\ua202\ua23a\ua217\ua22e\ua202\ua21b\ua23a\ua216\ua21e\ua208\ua21a\ua232\u963a\u9604\u9655\u965d\u9645\u9637\u9651\u9669\u9665\u9650\u960c\u960c\ufe97\ufee0\ufeeb\ufee8\ud93e\ud906\ud939\ud935\ud93b\ud949\ud957\ud944\ud95f\ud95f\ud964\ud902\ud952\ud967\ud953\ud935\ud624\ud5f2\ud61c\ud5f7\ud61f\ud5fa\ud5fe\ud5f9\ud5f7\ud61d\ud653\ud653\u875d\u8735\u875b\u8769\u8766\u8763\u8735\u874c\u8733\u875f\u8754\u8722\u873b\u876d\u875e\u8735\u874e\u8757\u8722\u876d\u8766\u8718\u871d\u876c\u873c\u8740\u8735\u8735\u2afd\u2b01\u2b23\u2b27\u2afe\u2b22\u2b4e\u2b4e\u9432\u93f2\u9431\u9463\u944c\u9463\u93f5\u945d\u945d\u944d\u9468\u9461\u9454\u946b\u9431\u9444\u9466\u93fe\u9443\u946c\u944a\u93fe\u944e\u9462\u9453\u9435\u946a\u943f\u945d\u9449\u9430\u945b\u9f75\u9f89\u9fab\u9f9f\u9f76\u9faa\u9fc6\u9fc6\u375f\u371f\u3760\u3753\u3757\u375c\u3736\u3743\u372f\u3736\u373d\u3741\u3736\u374e\u3759\u374e\u3730\u373a\u3738\u3743\u375d\u373e\u374f\u3733\u3732\u373e\u375d\u3736\u3742\u3732\u373f\u374e\u375d\u3724\u375e\u373a\u3735\u373f\u3719\u3743\u3723\u3764\u371d\u373d\u3758\u3742\u374f\u373b\u373c\u372f\u3742\u3730\u8eb2\u8edc\u8e75\u8eee\u8ecc\u8ebe\u8ee4\u8edc\u8ed0\u8e75\u8ebd\u8eee\u8edf\u8eb6\u8ee4\u8ec0\u8ee4\u8eb2\u8e87\u8ec4\u8e73\u8eb6\u8ec5\u8ed0\u8ecf\u8edc\u8ecb\u8e79\u1d20\u1d60\u1d1f\u1cf5\u1d1e\u1cf5\u1d63\u1d0b\u1d0b\u1d1b\u1cfa\u1cef\u1d06\u1cfc\u1d2b\u1d0c\u1cf2\u1d0f\u1d14\u1d10\u1d1d\u1d1a\u1d24\u1d15\u1d00\u1d23\u1d00\u1d01\u1d00\u1d12\u1d68\u1d68\u4508\u451e\u4512\u4503\u450b\u4516\u450c\u4506\ubee0\ubea0\ubedf\ubeb5\ubede\ubeb5\ubea3\ubecb\ubecb\ubedb\ubeba\ubeaf\ubec6\ubebd\ubeeb\ubeb7\ubeb6\ubedf\ubeb7\ubebe\ubed8\ubeac\ubedc\ubea6\ubec2\ubebd\ubec0\ubed4\ubecb\ubebb\ubed6\ubee3\ubee1\ubede\ubedc\ubecf\ubec2\ubeb4\ubeed\ubecc\ubeec\ube9f\ubea2\ubeb6\ubea4\ubeb4\ubea8\ubea8\u9888\u9873\u98a1\u9896\u988e\u9872\u986f\u9896\u98ab\u9895\u98a2\u989c\u989f\u98ac\u9873\u9891\u98a6\u9873\u98b2\u98ae\u988e\u989d\u98ce\u988f\u9892\u98ad\u988e\u98b8\u759a\u75a5\u75a1\u7593\u759c\u7573\u75ad\u7580\u758d\u7590\u75ea\u75ea\u7239\u7238\u724f\u726b\u7237\u723d\u724d\u724f\u9211\u922a\u920c\u9219\u9215\u9222\u922b\u9265\u1d32\u1d66\u1d4c\u1d5e\u1d35\u1d6b\u1cff\u1cff\u9046\u9051\u906c\u9051\u9041\u9068\u9068\u906d\u905c\u9058\u9067\u9057\u9067\u8ffe\u9037\u8ff5\u030f\u036d\u02fc\u02f4\u0314\u0312\u02f8\u0300\u030c\u02f9\u0365\u0365\u70f8\u7140\u70ff\u712c\u70fe\u7102\u7106\u7148\u362d\u360d\u3601\u3608\u362c\u3604\u3658\u3658\u1609\u1629\u1625\u162c\u1608\u1625\u1611\u1601\u1616\u1610\u164a\u1623\u0115\u0100\u011e\u00f9\u0116\u0108\u0100\u0100\uac9f\uac6f\uac99\uacab\uaca0\uaca1\uac6f\uac8a\uac71\uacac\uacd6\uacd6\ue1a3\ue198\ue18e\ue179\ue1a1\ue19d\ue19c\ue179\ue180\ue177\ue19b\ue179\ue189\ue19c\ue182\ue17b\ue18d\ue199\ue1ae\ue1ae\ue19f\ue198\ue18d\ue1aa\ue17d\ue1ad\ue1d3\ue1d3\u4800\u4837\u47fd\u4817\u483d\u481e\u481f\u483b\u4825\u481c\u480b\u4825\u481b\u480c\u4816\u4813\u4822\u4820\u4840\u4806\u483d\u4837\u481a\u4832\u62aa\u6296\u6270\u627c\u62a9\u6275\u62d9\u62d9\ubdcd\ubde7\ubdd3\ubdd4\ubdce\ubdcf\ubdd6\ubd7e\u94c6\u94d5\u94c7\u94cd\u94c6\u94ca\u9470\u9470\u27e4\u27e0\u2781\u277b\u279d\u27ab\u27ab\u276f\u277b\u27ab\u27e5\u2770\u2772\u27e0\u27a3\u2779\u277b\u277d\u27ad\u277c\u2797\u27df\u27a4\u2785\u2782\u2779\u2778\u2779\u2780\u279e\u2792\u277c\u2792\u279b\u27a4\u2794\u2786\u279e\u276f\u2770\u279c\u277c\u27a5\u277e\u2797\u27a2\u27ad\u277f\u2772\u2797\u278d\u2770\u2772\u278d\u2774\u277b\u279d\u2781\u2774\u277e\u27a2\u277d\u2770\u27e8\udf4e\udef0\udf2b\udefe\udef2\udf08\udf42\udf42\u7216\u71f8\u7251\u720a\u7228\u721a\u7200\u71f8\u71f4\u7251\u7213\u725d\ufb8e\ufb72\ufb94\ufb98\ufb8d\ufb91\ufbbd\ufbbd\u0088\u009ep\u0093\u008b\u0096\u0092\u0095\u4c68\u4c4e\u4c32\u4c31\u4c67\u4c36\u4c2f\u4c17\ubbb4\ubb8c\ubbed\ubbd8\ubbb4\ubbe9\ubb8c\ubbe0\ubbe8\ubbbe\ubbec\ubb84\u868f\u8683\u86ad\u8687\u868f\u8695\u8687\u868c\u8687\u867e\u86e2\u86e2\u4e97\u4e77\u4ea5\u4e85\u4e9e\u4ea9\u4e83\u4e80\u4e86\u4e7f\u4ee3\u4e8f\u4e75\u4e82\u4eee\u4eee\u1087\u109d\u106f\u1094\u108c\u1095\u1091\u1096\u4b91\u4b73\u4b87\u4b88\u4b92\u4b8b\u4b8a\u4be2\u6440\u63f8\u6459\u646c\u6440\u645d\u63f8\u6454\u645c\u644a\u6458\u63f0\ub381\ub395\ub37b\ub399\ub381\ub383\ub399\ub39e\ub399\ub3ac\ub3b0\ub3b0\udc61\udc41\udc5b\udc3b\udc64\udc4f\udc3d\udc3a\udc3c\udc39\udc1d\udc69\udc4b\udc38\udc14\udc14\uf0cd\uf0e7\uf073\uf073\ub4c7\ub4dd\ub471\ub471\u1363\u131a\u131e\u133e\u1366\u134b\u134a\u1312\ua741\ua762\ua76e\ua74c\ua743\ua730\ua76e\ua76c\ua022\ua059\ua056\ua051\u742f\u7449\u740a\u7467\u7432\u744c\u7435\u7462\u746a\u743c\u7432\u743c\u745a\u745f\u744d\u7453\u7457\u744c\u7406\u7406\ud362\ud358\ud317\ud33a\ud35f\ud35d\ud364\ud32f\ud337\ud36d\ud35f\ud325\ud34c\ud332\ud332\ud36b\ud34a\ud310\ud369\ud313\ud36f\ud38f\ud3a2\ud3aa\ud36f\ud370\ud39a\ud3a9\ud3aa\ud382\ud3ca\ud39a\ud399\ud3a2\ud3a2\ud3ae\ud39c\ud38c\ud390\ud3a9\ud373\ud38d\ud3c3\ud3c3\u0f47\u0f67\u0f5a\u0f52\u0f47\u0f48\u0f62\u0f51\u0f52\u0f3a\u0f09\u0f55\u0f65\u0f67\u0f34\u0f6b\u0f68\u0f44\u0f42\u0f3f\u0f36\u0ef4\u0f35\u0efb\ub2ce\ub2ee\ub2db\ub2d3\ub2ce\ub2cd\ub2e3\ub2d4\ub2d3\ub2be\ub2ca\ub2df\ub2e3\ub2e6\ub27a\ub27a\uf3f1\uf3f5\uf454\uf465\uf44e\uf454\uf458\uf444\uf450\uf450\uf448\uf459\uf463\uf469\uf3f1\uf43f\uf463\uf446\uf430\uf440\uf449\uf446\uf441\uf465\uf453\uf432\uf436\uf463\uf451\uf433\uf3f2\uf3fd\u58f4\u5920\u58f2\u5928\u58ef\u5928\u5902\u5920\u5928\u5919\u5942\u5945\uf611\uf62e\uf5f8\uf60b\uf613\uf627\uf62a\uf60b\uf5f6\uf60c\uf619\uf60b\uf5f9\uf604\uf66d\uf60d\uf5fd\uf61a\uf619\uf60a\uf615\uf66a\uf615\uf60d\uf608\uf605\uf617\uf61b\u48f4\u4907\u491d\u492a\u48f2\u490e\u490b\u492a\u490f\u4929\u4949\u492c\u490f\u4911\u4921\u492e\u4918\u4921\u494e\u4916\u48f1\u4911\u4949\u490f\u4929\u490e\u4944\u4944\u9ade\u9acd\u9ab4\u9aa8\ub185\ub187\ub1b1\ub1b1\ub340\ub337\ub2f1\ub2f1\uec2a\uec20\uec5a\uec5a\u4193\u4187\u41e3\u41e3\u89da\u899d\u89d3\u89d3\u1fb4\u1f8b\u1f80\u1f83\uce03\uce12\uce0f\uce2c\uce00\ucdfc\ucdf8\uce36\u16ff\u1703\u1721\u1714\u16f7\u1724\u174c\u1726\u1710\u170f\u173e\u16f5\u1714\u172d\u170b\u1726\u171e\u171a\u16f5\u1746\u1746\u1703\u1741\u1721\u1722\u171d\u1714\u16f5\u1721\u16f7\u1718\u172b\u1744\u1702\u1716\u16f0\u1726\u16fe\u173a\u1725\u1745\u1740\u1700\u1722\u1744\u1710\u16f4\u172d\u1711\u1711\u16fb\u1712\u1712\u172d\u1719\u171f\u1746\u1743\u173f\u171e\u1743\u172d\u1741\u174c\u16f7\u171d\u1744\u172b\u16f7\u170d\u1740\u16fc\u16f0\u1721\u170c\u1720\u1716\u172d\u1711\u172b\u1714\u1718\u16f0\u16f0\u16f9\u171d\u1746\u1720\u1720\u171d\u1720\u171e\u1721\u16f7\u171c\u1724\u16fe\u16f2\u170d\u16f1\u172b\u170b\u1746\u16f6\u1743\u174c\u1741\u1718\u16f9\u1711\u171b\u16f6\u1717\u171b\u173f\u16f0\u3714\u3727\u36fd\u370a\u3712\u372e\u372b\u370a\u36ef\u3708\u3752\u370a\u36ef\u36f0\u372b\u3708\u36f8\u371b\u370a\u370b\u3710\u376b\u3710\u3708\u370d\u3700\u371e\u371a\ud6a8\ud694\ud672\ud67e\ud6a7\ud673\ud6d7\ud6d7\u2de0\u2dc6\u2dba\u2db9\u2ddf\u2dbe\u2db7\u2d8f\u2ebd\u2ee7\u2ec5\u2ee2\u2eba\u2edf\u2ee3\u2ee0\ufc1b\ufbf1\ufc1b\ufbf8\ufc20\ufbf9\ufbfd\ufbfa\ufc0c\ufc09\ufbfe\ufc0c\ufbfa\ufc01\ufc0d\ufbfe\ufc0e\ufc5c\ufbf7\ufc02\ufc22\ufbf1\ufc62\ufbfb\ufbfe\ufc01\ufc22\ufbf0\ufbfd\ufbfd\ufc1e\ufbf1\u9d9a\u9d8e\u9da4\u9d82\u9d9a\u9d9c\u9d82\u9d85\u9d82\u9d73\u9de7\u9de7\u09b5\u09e1\u09c7\u09ed\u09b5\u09af\u09ed\u09ea\u09ed\u09d8\u0984\u0984\u9df6\u9e20\u9e0e\u9e29\u9df1\u9e28\u9e2c\u9e27\u4329\u42fb\u4311\u42f6\u432e\u42f3\u42ef\u42f4\uc051\uc02d\uc03c\uc039\uc051\uc038\uc038\uc040\uc04c\uc06b\uc025\uc025\ud22e\ud1f8\ud216\ud1f1\ud229\ud1f0\ud1f4\ud1ef\ud327\ud36b\ud2fe\ud2f7\ud30f\ud2fa\ud2fa\ud302\ud30e\ud367\ud31f\ud31b\ud2fd\ud35f\ud35f\ud300\ud2f7\ud2f3\ud31b\ud31b\ud316\ud35f\ud30f\ud31e\ud30b\ud2ff\ud30b\ud31a\ud300\ud314\ud36c\ud2ff\uf598\uf5e4\uf575\uf570\uf598\uf571\uf571\uf589\uf585\uf5a6\uf5ec\uf5ec\u17d1\u17ee\u17b8\u17cb\u17d3\u17e7\u17ea\u17cb\u17b6\u17cd\u17e5\u17b8\u17bc\u17a9\u17d2\u17cd\u17bd\u17a5\u17dd\u17ca\u17d4\u17c4\u17d1\u17bb\u17c9\u17cd\u17a1\u17a1\u868d\u86b2\u86a4\u86a8\u868b\u86a4\u866f\u86b9\u6698\u66d9\u6689\u66a1\u669c\u6687\u6675\u66d9\u3991\u3973\u3987\u3988\u3992\u398b\u398a\u39e23\ufff4fhGbZ?\uec23\uebf2\uec2c\uebf0\uec23\uebfa\uec2c\uec0c\ub640\ub5f7\ub669\ub663\ub644\ub66d\ub655\ub64c\ub64e\ub65d\ub606\ub658\ub667\ub655\ub669\ub661\u11fc\u1229\u11f3\u1227\u11fc\u1221\u11f3\u1213\u1210\u11f6\u124c\u124c\uaa20\ua9f5\uaa27\ua9f3\uaa20\ua9fd\uaa27\uaa07\ua9f4\uaa13\uaa02\ua9fd\uaa03\uaa0c\uaa50\uaa50\u18f3\u1916\u192a\u18fb\u18ef\u192e\u1927\u193f\u5ffe\u601b\u601f\u5ff6\u5ffa\u6023\u601f\u600b\u6022\u6026\u603f\u5ff4\u0fad\u0f92\u0f74\u0f7a\u0fae\u0f9a\u0fd5\u0f84\u0f7a\u0f93\u0fad\u0f78\u0f86\u0f81\u0fdd\u0fdd\u1644\u15fd\u1642\u165c\u1640\u163b\u1643\u15f5\u3b78\u3ba7\u3b81\u3b96\u3b7a\u3ba2\u3bc2\u3b77\u3ba0\u3ba2\u3b8a\u3ba0\u8fcc\u8fed\u8f75\u8fe1\u8fc9\u8fd5\u8f79\u8f79\u22f3\u234b\u230c\u2327\u22f3\u2327\u2343\u2343\ucf83\ucf93\ucf7d\ucf87\ucf84\ucf85\ucf93\ucfae\ucf95\ucf88\ucfb2\ucfb2\u98ca\u98b6\u98b2\u98c5\u98c9\u98d5\u9879\u9879\u1dc6\u1dd0\u1dbe\u1de8\u1dc0\u1db2\u1dbb\u1d75\u1dff\u1e38\u1e33\u1e30\u7737\u776d\u773f\u7764\u773c\u7765\u7761\u7766\uef4b\uef5c\uef65\ueef9\uc938\uc8ff\uc90c\uc907\ub9aa\ub97b\ub9ad\ub986\ub994\ub973\ub9ad\ub982\ub970\ub990\ub9da\ub9da\ud837\ud86e\ud83c\ud853\ud845\ud866\ud83c\ud84f\ud861\ud84e\ud855\ud86b\ud850\ud841\ud807\ud807\ud902\ud913\ud905\ud92e\ud8fc\ud91b\ud905\ud92a\ud918\ud8f3\ud92c\ud916\ud929\ud938\ud901\ud91e\ud92e\ud936\ud916\ud932\u1c31\u1c64\u1c36\u1c5d\u1c4b\u1c6c\u1c36\u1c59\u1c67\u1c45\u1c45\u1c58\u1c5c\u1c09\u1c36\u1c52\u1c5b\u1c4b\u1c5a\u1c50\u90b2\u90b4\u90db\u90ba\u90b0\u90b1\u90d7\u90df\u90eb\u90cc\u9086\u9086\ub797\ub777\ub78a\ub792\ub79b\ub7a5\ub7a4\ub781\ub77f\ub7a5\ub7e8\ub7eb\u9985\u998f\u99ab\u99a1\u997f\u9971\u9981\u999a\u999b\u999a\u99b6\u99b6\u2482\u24a9\u2491\u24a8\u247c\u24a0\u24cc\u24cc\u340a\u3435\u340f\u341a\u340b\u3412\u33f1\u3403\ubc19\ubc63\ubc0a\ubc25\ubc1c\ubbff\ubc20\ubbf8\ubc08\ubbf2\ubc62\ubc03\ubbf4\ubc0a\ubbfa\ubc11\ubbef\ubc11\ubc11\ubc6b\uc05b\uc047\uc03a\uc046\uc05c\uc042\uc046\uc045\uc043\uc058\uc031\uc041\ue961\ue95e\ue948\ue93b\ue963\ue957\ue95a\ue93b\ue946\ue93d\ue959\ue93b\ue94b\ue95a\ue944\ue942\ue94b\ue95b\ue94a\ue943\ue963\ue935\ue95d\ue93c\u3b84\u3b7b\u3ba9\u3ba3\u3b84\u3bad\u3b95\u3ba9\u3b99\u3b9d\u3b8a\u3bb0\u3725\u3707\u3762\u36f9\u3717\u3729\u36ef\u3707\u3703\u3762\u372a\u36f6\u36f5\u370a\u3725\u36fb\u36ef\u3725\u3760\u3707\uebd1\uebb9\uebcf\uebe5\uebea\uebe7\uebb9\uebc0\uebb7\uebeb\uebd8\uebc4\uebc3\uebb8\uebd3\uebcd\uebc1\uebd3\ueb92\uebb9\uebd7\uebcd\uebe6\ueb9c\uf7ff\uf838\uf833\uf830\u85a6\u8570\u859e\u8579\u85a1\u8578\u857c\u8577\ud09e\ud0e2\ud06f\ud076\ud09e\ud073\ud073\ud08b\ud07f\ud0a0\ud0ea\ud0ea\u33ec\u33d6\u33b0\u33bd\u33ed\u33b4\u33cf\u3399\udf26\udf5a\udf07\udf0e\udf26\udf0b\udf0b\udef3\udef7\udf18\udf52\udf52\u3ca8\u3c93\u3c81\u3c76\u3cae\u3c92\u3c8f\u3c76\u3c8b\u3c74\u3c9c\u3c81\u3c85\u3cd0\u3ca7\u3c74\u3c84\u3cdc\u3ca4\u3c6f\u3cae\u3c93\u3ca0\u3c71\u3c70\u3c84\u3cd8\u3cd8\u211c\u2120\u2106\u210a\u211b\u20ff\u216b\u216b\u4975\u49b5\u4976\u49a0\u4987\u49a0\u49b2\u499a\u499a\u498a\u49ab\u49a6\u498f\u49a8\u49ac\u4993\u49a6\u4976\u4985\u4985\u4988\u498b\u4971\u4980\u4995\u4972\u4995\u4994\u4995\u4983\u49bd\u49bd\u7d53\u7d4e\u7d6c\u7d32\u7d6c\u7d36\u7d5c\u7d42\u248f\u24cf\u2490\u247e\u24aa\u24ac\u24ac\u2480\u1ea4\u1e8a\u1ea4\u1e71\u1e9b\u1e82\u1e82\u1e81\u1e88\u1e95\u1e95\u1eeb\ucaf0\ucaef\ucb25\ucb00\ucb0c\ucb21\ucaf7\ucb25\u8e1b\u8e05\u8e08\u8dfd\u3307\u3320\u330a\u3319\u32f5\u3329\u330e\u3328\u332d\u3328\u332f\u3327\u7726\u76f0\u771e\u76f9\u7721\u76f8\u76fc\u76f7\u3a9e\u3ae2\u3a6f\u3a76\u3a9e\u3a73\u3a73\u3a8b\u3a7f\u3aa0\u3aea\u3aea\ucc0a\ucc4e\ucc1b\ucc1a\ucbf2\ucc17\ucc17\ucc1f\ucc2b\ucc4a\ucc02\ucbfe\ucc1c\ucc42\ucc42\ucc21\ucc1a\ucc16\ucbfe\ucbfe\ucbf3\ucc4e\ucbf7\ucc2e\ucc2b\ucc1f\ucc41\ucc13\ucc21\ucbf5\ucc41\ucc28\uf3a5\uf3d9\uf388\uf38d\uf3a5\uf38c\uf38c\uf374\uf378\uf397\uf3d1\uf3d1\uc70e\uc700\uc73a\uc73a\u1c0d\u1bf6\u1c3c\u1c3c\u0585\u058b\u05b5\u05b5\ueab8\ueae4\uea88\uea88\u9a32\u9a51\u9a5d\u9a54\udd80\udd89\uddd5\uddd5\uddc8\uddb9\uddd5\udddf\uddd1\uddd5\udd84\uddc4\udde6\uddaf\udd8a\uddde\udddc\uddc3\udd8d\udd8d\ub3d3\ub3a7\ub3ca\ub3bd\ub3cf\ub3ce\ub3ac\ub39f\u12bf\u12d0\u12e9\u1275\u4ef9\u4f06\u4f20\u4f2e\u4efa\u4eff\u4f0e\u4f1e\u9d4b\u9d6e\u9d4c\u9d52\u9d4c\u9d56\u9d3c\u9d62\u6073\u60cb\u608c\u60a2\u6076\u6070\u6070\u609c\uea7f\uea95\uea77\ueaae\uea80\uea9d\uea9d\uea9e\uea93\uea8a\uea8a\ueab0\ua78d\ua776\ua7a0\ua785\ua789\ua7a4\ua77e\ua7a0\uc87c\uc89e\uc88f\uc8a6\u05d4\u05c3\u05ed\u05be\u05d2\u05ce\u05e9\u05cb\u05ca\u05cb\u0594\u05cc\ubd3e\ubd06\ubd39\ubd35\ubd3b\ubd49\ubd57\ubd44\ubd5f\ubd5f\ubd64\ubd02\ubd52\ubd67\ubd53\ubd35\ud60b\ud5ef\ud615\ud619\ud60c\ud610\ud63c\ud63c\ud15a\ud13c\ud140\ud13f\ud159\ud144\ud141\ud129";
                            ** while (true)
                            var12_12 = 0;
                            if (var13_13 != 0) break block14;
                            break block17;
lbl30:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl32:
                            // 1 sources

                            while (true) {
                                var9_9[var10_10] = var7_7.substring(var11_11, var11_11 + var12_12);
                                ** continue;
                                break;
                            }
                            var0_1 = "\u00a3F@\b4\u00af\u00ad\u0097Lp\u00ddp .K\u00c5\u00e6Y\u001b\u00da\u00e8M.\u0097(\u00f3\u00d0\u00ac>Q\u0012\u0082\u00ea\u008a\u0018\u00de0/\u00f1]\u00c5\u0016\u00d6\u00e5\u00aa\u00105\u0005\u00e9T+K\u0093\u0002m~\t\u00adB\u000b\u0083\u007f\u0088!\rt\u008a\u0091V\u00e6\u00d5@\u00b9:\u00f3]\u001a\u00c3a+\u009fE \r\u00b3\u00fd\f\u00fd\u00b9\u0083\u0004\u00ff\u00ba\u001c\u00ae\u00ae\u00dd\u00a0\u00ea\u00c4".getBytes("ISO-8859-1");
                            var1_2 = var0_1.length / 4;
                            ** while (true)
                            IIlIIIIlI.ll = new Object[var9_9.length];
                            var2_3 = -1704090140;
                            ** while (true)
lbl41:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl43:
                            // 1 sources

                            while (true) {
                                if (++var10_10 < var8_8.length) break block14;
                                break block15;
                                break;
                            }
                            var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                            IIlIIIIlI.Il[var4_5] = var5_6 ^= var2_3;
                            ** while (true)
                        }
                        IIlIIIIlI.lI = var9_9;
                        ** while (true)
                    }
                    var12_12 = var8_8[var10_10] ^ var6;
                    ** while (true)
                    var10_10 = 0;
                    var11_11 = 0;
                    ** while (true)
                    var8_8 = "\u6586\u6586\u65ba\u65ba\u65a2\u65a2\u65be\u65ae\u6586\u658a\u658a\u6586\u65aa\u65ba\u6586\u6586\u659e\u659e\u6582\u659e\u6582\u659e\u6582\u659e\u6596\u659e\u6582\u659e\u658a\u6582\u6592\u659a\u659e\u659a\u6582\u6586\u6582\u6586\u6586\u6582\u6586\u6586\u6586\u658a\u6586\u659e\u65ae\u659e\u659a\u6596\u659a\u659a\u659a\u6592\u659a\u6596\u6586\u6586\u658a\u659e\u6582\u6586\u6586\u6582\u6586\u659e\u6586\u659e\u658a\u658a\u6586\u6586\u658a\u658a\u6582\u6582\u6586\u6586\u6582\u6582\u6586\u6586\u6586\u659e\u6592\u6586\u65ae\u6586\u6586\u6582\u6582\u658a\u659e\u6582\u6592\u6586\u65ae\u6586\u65ba\u6592\u65ae\u6586\u65be\u6592\u6582\u6586\u6586\u6586\u659e\u6582\u6586\u6586\u6582\u6586\u6582\u6592\u6596\u6586\u6586\u6586\u65ce\u6586\u6582\u6586\u6586\u6586\u6582\u6582\u659e\u6586\u6586\u6582\u6582\u659e\u658a\u658a\u6586\u6586\u658a\u659a\u659a\u6596\u6596\u659e\u65ae\u6582\u6592\u6592\u658a\u658a\u658a\u658a\u658a\u658a\u658a\u6586\u65fa\u6592\u6586\u6586\u6586\u65ae\u6582\u6582\u6586\u6586\u6582\u6586\u65ae\u6582\u6592\u6586\u6586\u6586\u6586\u6586\u659e\u6582\u659e\u6586\u6582\u659e\u6586\u6582\u6586\u6586\u6582\u6586\u6586\u658a\u6586\u658a\u658a\u6582\u659e\u659a\u659a\u6582\u6582\u6582\u6586\u6586\u659a\u6582\u6596\u6582\u659a\u6596\u658a\u6586\u6582\u6586\u6582\u6592\u6586\u65ae\u6586\u6586\u6582\u6586\u658a\u6582\u6586\u6582\u65ae\u6582\u658a\u658a\u658a\u658a\u658a\u659a\u6586\u658a\u6586\u6586\u6586\u6582\u6586\u658a\u6582\u659e\u6586\u6586".toCharArray();
                    var9_9 = new String[var8_8.length];
                    var13_13 = -1;
                    ** GOTO lbl41
                }
                return;
            }
            ** while (true)
        }
        var13_13 = 0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IllllI(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x53F6;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 == null) {
            IIlIIIIlI.ll[n2] = stackTraceElementArray = new Throwable().getStackTrace();
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2CE5;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 4404;
            n6 += 16970;
            n6 += 17909;
            n6 += 15027;
            n6 -= 14514;
            n6 -= 56574;
            n6 -= 58522;
            n6 += 64710;
            cArray[n5] = (char)((n6 += 16239) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

