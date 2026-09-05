/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIllIll
 * Identified from direct evidence; see README.md
 *
 * Recovered strings in this class:
 *   - Orchard cloud config migration skipped invalid profile {}
 *   - Orchard cloud config migration failed to read profile {}
 *   - Orchard cloud config migration journal write failed
 *   - Orchard cloud config migration deferred profile {}
 *   - Feather Cosmetics
 *   - Client Cosmetics
 *   - Lunar Cosmetics
 *   - Crystal Render
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.GsonBuilder
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.util.Util
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package orchard.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileAttribute;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collections;
import java.util.HexFormat;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Util;
import orchard.config.LegacyConfigMigration;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IlIlIII;
import orchard.internal.IllIlIII;
import orchard.internal.lllIIlI;
import orchard.net.CloudConfigClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public final class CloudConfigManager {
    private static final long I;
    private static final long l;
    private static final long II;
    private final LegacyConfigMigration Il;
    private static final long lI;
    private static final long ll;
    private static final long III;
    private static final AtomicBoolean IIl;
    private static final long IlI;
    private static volatile boolean Ill;
    private static final int lII = 524288;
    private static final IIIlIIIII lIl;
    private static final long llI;
    private static volatile long lll;
    private static final long IIII;
    private static final Logger IIIl;
    private static final long IIlI;
    private static final long IIll;
    private static final long IlII;
    private static final IIIlIIIII IlIl;
    private static final long IllI;
    private static final IIIlIIIII Illl;
    private static final IIIlIIIII lIII;
    private static final IIIlIIIII lIIl;
    private static final long lIlI;
    private static final long lIll;
    private static final Gson llII;
    private static final long llIl;
    private static final long lllI;
    private static final long llll;
    private static final int IIIII = 20;
    private static final long IIIIl;
    private final CloudConfigClient IIIlI = new CloudConfigClient(() -> {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return null;
        String string = clientEntrypoint.IIIl();
        return string;
    });
    private static final int IIIll = 18432;
    private static final long IIlII;
    private static final Gson IIlIl;
    private static final long IIllI = 60000L;
    private static final long IIlll;
    private static final IIIlIIIII IlIII;
    private static final int[] IlIIl;
    private static final String[] IlIlI;
    private static final Object[] IlIll;

    public boolean I(String string, lllIIlI lllIIlI2) {
        if (this.IIIlI.lll() || ClientEntrypoint.lII() != null) {
            this.IIIII();
            String string2 = this.IIIlI.I(string);
            return string2 != null && this.IIIll(string2, lllIIlI2);
        }
        Path path = this.IlI();
        if (path == null) {
            return false;
        }
        String string3 = ".json";
        String string4 = string;
        Path path2 = path.resolve(string4 + string3);
        if (!Files.exists(path2, new LinkOption[0])) {
            return false;
        }
        try {
            if (Files.size(path2) > 524288L) {
                return false;
            }
            String string5 = Files.readString(path2);
            return this.IIIll(string5, lllIIlI2);
        }
        catch (IOException iOException) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static JsonObject II(JsonObject jsonObject, JsonObject jsonObject2, boolean bl) {
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("enabled", Boolean.valueOf(bl && CloudConfigManager.lII(jsonObject2, StringFactory.IIII("Use W-Tap").llII(), true)));
        CloudConfigManager.IllIl(jsonObject, jsonObject3);
        jsonObject3.add("settings", (JsonElement)new JsonObject());
        return jsonObject3;
    }

    public IlIlIII Il() {
        return new IllIlIII(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void lI(JsonObject jsonObject) {
        if (!LegacyConfigMigration.llIl(jsonObject, llI)) {
            return;
        }
        JsonObject jsonObject2 = LegacyConfigMigration.lllII(jsonObject, llI);
        if (jsonObject2 == null) return;
        if (jsonObject2.has("settings")) {
            JsonObject jsonObject3 = jsonObject2.getAsJsonObject("settings");
            long l2 = IlIII.llII();
            JsonElement jsonElement = ModuleBase.IIIIlIl(jsonObject3, l2);
            if (jsonElement == null) return;
            if (!jsonElement.isJsonPrimitive()) {
                return;
            }
            String string = jsonElement.getAsString();
            if ("SPEED_EQUIVALENT".equalsIgnoreCase(string)) {
                ModuleBase.lllIIl(jsonObject3, l2, (JsonElement)new JsonPrimitive("NORMAL"));
                return;
            }
            if (!"GRIM".equalsIgnoreCase(string)) {
                if (!"ROTATE".equalsIgnoreCase(string)) return;
            }
            ModuleBase.lllIIl(jsonObject3, l2, (JsonElement)new JsonPrimitive("LEGIT"));
            return;
        }
    }

    public List<String> ll() {
        if (this.IIIlI.lll() || ClientEntrypoint.lII() != null) {
            this.IIIII();
            return this.IIIlI.IIII(this.IlI());
        }
        Path path2 = this.IlI();
        if (path2 == null || !Files.isDirectory(path2, new LinkOption[0])) {
            return Collections.emptyList();
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        try (Stream<Path> stream = Files.list(path2);){
            stream.filter(path -> path.toString().endsWith(".json")).map(path -> {
                String string = path.getFileName().toString();
                return string.substring(0, string.length() - 5);
            }).sorted(String.CASE_INSENSITIVE_ORDER).forEach(arrayList::add);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return arrayList;
    }

    private boolean III(String string) {
        if (string == null || string.isBlank() || string.length() > 524288) {
            return false;
        }
        try {
            JsonObject jsonObject = (JsonObject)llII.fromJson(string, JsonObject.class);
            return jsonObject != null && jsonObject.has("modules") && jsonObject.get("modules").isJsonObject();
        }
        catch (Exception exception) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IIl(JsonObject jsonObject) {
        long l2;
        long l3;
        JsonObject jsonObject2;
        if (!LegacyConfigMigration.llIl(jsonObject, lI)) {
            return;
        }
        JsonObject jsonObject3 = LegacyConfigMigration.lllII(jsonObject, lI);
        if (jsonObject3 == null) return;
        if (jsonObject3.has("settings")) {
            jsonObject2 = jsonObject3.getAsJsonObject("settings");
            l3 = lIII.llII();
            l2 = lIIl.llII();
            if (ModuleBase.IIIIlIl(jsonObject2, l3) != null) {
                ModuleBase.lllIlI(jsonObject2, l2);
                return;
            }
        } else {
            return;
        }
        JsonElement jsonElement = ModuleBase.IIIIlIl(jsonObject2, l2);
        if (jsonElement == null) {
            return;
        }
        if (jsonElement != null && jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
            double d = jsonElement.getAsDouble();
            double d2 = Math.max(1.0, Math.min(100.0, 101.0 - d));
            ModuleBase.lllIIl(jsonObject2, l3, (JsonElement)new JsonPrimitive((Number)d2));
        }
        ModuleBase.lllIlI(jsonObject2, l2);
    }

    private Path IlI() {
        return this.Il.IlIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void Ill(JsonObject jsonObject) {
        if (LegacyConfigMigration.llIl(jsonObject, II)) {
            return;
        }
        JsonObject jsonObject2 = LegacyConfigMigration.lllII(jsonObject, III);
        JsonObject jsonObject3 = LegacyConfigMigration.lllII(jsonObject, IIlll);
        if (jsonObject2 == null && jsonObject3 == null) {
            return;
        }
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.addProperty("enabled", Boolean.valueOf(CloudConfigManager.lIlI(jsonObject2) || CloudConfigManager.lIlI(jsonObject3)));
        JsonElement jsonElement = CloudConfigManager.IIllI(jsonObject2, jsonObject3);
        if (jsonElement != null) {
            jsonObject4.add("keyBind", jsonElement);
        }
        JsonObject jsonObject5 = new JsonObject();
        ModuleBase.lllIIl(jsonObject5, StringFactory.IIII("u5hdmRdD").llII(), (JsonElement)new JsonPrimitive(CloudConfigManager.IlIl(jsonObject2, jsonObject3)));
        jsonObject4.add("settings", (JsonElement)jsonObject5);
        jsonObject4.add("featherSettings", (JsonElement)CloudConfigManager.lIII(jsonObject2));
        LegacyConfigMigration.Illll(jsonObject, II, (JsonElement)jsonObject4);
    }

    private static boolean lII(JsonObject jsonObject, long l2, boolean bl) {
        JsonElement jsonElement = ModuleBase.IIIIlIl(jsonObject, l2);
        if (jsonElement == null || !jsonElement.isJsonPrimitive()) {
            return bl;
        }
        try {
            return jsonElement.getAsBoolean();
        }
        catch (RuntimeException runtimeException) {
            return bl;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void lIl(JsonObject jsonObject) {
        if (!LegacyConfigMigration.llIl(jsonObject, IlII)) {
            return;
        }
        JsonObject jsonObject2 = LegacyConfigMigration.lllII(jsonObject, IlII);
        if (jsonObject2 == null) return;
        if (!jsonObject2.has("settings")) return;
        JsonObject jsonObject3 = jsonObject2.getAsJsonObject("settings");
        long l2 = Illl.llII();
        JsonElement jsonElement = ModuleBase.IIIIlIl(jsonObject3, l2);
        if (jsonElement == null) return;
        if (!jsonElement.isJsonPrimitive()) {
            return;
        }
        String string = jsonElement.getAsString();
        if (!"HORIZONTAL".equalsIgnoreCase(string)) {
            if (!"RAINBOW".equalsIgnoreCase(string)) return;
        }
        ModuleBase.lllIIl(jsonObject3, l2, (JsonElement)new JsonPrimitive("COLOR_SHIFT"));
    }

    private String llI(String string) {
        if (string == null || string.length() > 524288) {
            return null;
        }
        try {
            JsonObject jsonObject = (JsonObject)llII.fromJson(string, JsonObject.class);
            if (jsonObject == null || !jsonObject.has("modules") || !jsonObject.get("modules").isJsonObject()) {
                return null;
            }
            this.IlllI(jsonObject);
            return IIlIl.toJson((JsonElement)jsonObject);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public boolean lll(String string) {
        if (this.IIIlI.lll() || ClientEntrypoint.lII() != null) {
            return this.IIIlI.IIl(string);
        }
        Path path = this.IlI();
        if (path == null) {
            return false;
        }
        try {
            String string2 = ".json";
            String string3 = string;
            return Files.deleteIfExists(path.resolve(string3 + string2));
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public boolean IIII(String string, lllIIlI lllIIlI2) {
        if (string == null || string.isBlank() || string.length() > 20) {
            return false;
        }
        if (this.IIIlI.lll() || ClientEntrypoint.lII() != null) {
            this.IIIII();
            return this.IIIlI.IlII(string, this.llIl(lllIIlI2));
        }
        Path path = this.IlI();
        if (path == null) {
            return false;
        }
        try {
            Files.createDirectories(path, new FileAttribute[0]);
            String string2 = ".json";
            String string3 = string;
            Files.writeString(path.resolve(string3 + string2), (CharSequence)this.llIl(lllIIlI2), new OpenOption[0]);
            return true;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    private void IIIl(Path path) {
        if (path == null) {
            return;
        }
        try {
            Files.createDirectories(path, new FileAttribute[0]);
            Files.writeString(path.resolve(IlIl.IIII()), (CharSequence)"", new OpenOption[0]);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private void IIlI(Path path, JsonObject jsonObject) {
        if (path == null || jsonObject == null) {
            return;
        }
        Path path2 = path.resolve(lIl.IIII());
        String string = ".tmp";
        String string2 = String.valueOf(path2.getFileName());
        Path path3 = path2.resolveSibling(string2 + string);
        try {
            Files.createDirectories(path, new FileAttribute[0]);
            Files.writeString(path3, (CharSequence)IIlIl.toJson((JsonElement)jsonObject), new OpenOption[0]);
            try {
                Files.move(path3, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
            }
            catch (AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
                Files.move(path3, path2, StandardCopyOption.REPLACE_EXISTING);
            }
        }
        catch (IOException iOException) {
            IIIl.warn("Orchard cloud config migration journal write failed", (Throwable)iOException);
            try {
                Files.deleteIfExists(path3);
            }
            catch (IOException iOException2) {
                // empty catch block
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlII(Path path, JsonObject jsonObject) {
        if (path == null) {
            return;
        }
        jsonObject.addProperty("status", (Number)1);
        this.IIlI(path, jsonObject);
        Ill = this.Illl(path);
        this.IIIl(path);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlIl(JsonObject jsonObject, JsonObject jsonObject2) {
        boolean bl = CloudConfigManager.lIlI(jsonObject);
        boolean bl2 = CloudConfigManager.lIll(jsonObject);
        if (bl && bl2) {
            return "FEATHER";
        }
        if (bl2) {
            return "FEATHER";
        }
        if (!bl) return "NONE";
        return "FEATHER";
    }

    private boolean Illl(Path path) {
        try {
            JsonObject jsonObject = this.IIIIl(path);
            JsonElement jsonElement = jsonObject.get("status");
            return jsonElement != null && jsonElement.isJsonPrimitive() && jsonElement.getAsInt() == 1;
        }
        catch (RuntimeException runtimeException) {
            return false;
        }
    }

    private static JsonObject lIII(JsonObject jsonObject) {
        if (jsonObject == null || !jsonObject.has("settings")) {
            return new JsonObject();
        }
        return jsonObject.getAsJsonObject("settings").deepCopy();
    }

    private String lIIl(Path path) {
        String string;
        block9: {
            InputStream inputStream = Files.newInputStream(path, new OpenOption[0]);
            try {
                int n;
                MessageDigest messageDigest = MessageDigest.getInstance("sha256");
                byte[] byArray = new byte[8192];
                while ((n = inputStream.read(byArray)) >= 0) {
                    if (n <= 0) continue;
                    messageDigest.update(byArray, 0, n);
                }
                string = HexFormat.of().formatHex(messageDigest.digest());
                if (inputStream == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    return null;
                }
            }
            inputStream.close();
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lIlI(JsonObject jsonObject) {
        if (jsonObject == null) return false;
        if (!jsonObject.has("enabled")) return false;
        if (jsonObject.get("enabled").getAsBoolean()) return true;
        return false;
    }

    private static boolean lIll(JsonObject jsonObject) {
        if (jsonObject == null || !jsonObject.has("settings")) {
            return false;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("settings");
        for (String string : jsonObject2.keySet()) {
            if (!jsonObject2.get(string).isJsonPrimitive()) continue;
            try {
                String string2 = jsonObject2.get(string).getAsString();
                if (string2.isBlank()) continue;
                return true;
            }
            catch (UnsupportedOperationException unsupportedOperationException) {
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void llII(JsonObject jsonObject) {
        JsonObject jsonObject2;
        LegacyConfigMigration.Illl(jsonObject, ll);
        if (LegacyConfigMigration.llIl(jsonObject, IIlI)) {
            jsonObject2 = LegacyConfigMigration.lllII(jsonObject, IIlI);
            if (jsonObject2 == null) {
                LegacyConfigMigration.Illl(jsonObject, IIlI);
                return;
            }
        } else {
            return;
        }
        JsonObject jsonObject3 = jsonObject2.has("settings") ? jsonObject2.getAsJsonObject("settings") : new JsonObject();
        boolean bl = CloudConfigManager.lIlI(jsonObject2);
        if (!LegacyConfigMigration.llIl(jsonObject, IllI)) {
            LegacyConfigMigration.Illll(jsonObject, IllI, (JsonElement)CloudConfigManager.II(jsonObject2, jsonObject3, bl));
        }
        LegacyConfigMigration.Illl(jsonObject, IIlI);
    }

    /*
     * Enabled aggressive block sorting
     */
    private String llIl(lllIIlI lllIIlI2) {
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        Iterator<ModuleBase> iterator = lllIIlI2.IIIIIll().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                jsonObject.add("modules", (JsonElement)jsonObject2);
                return IIlIl.toJson((JsonElement)jsonObject);
            }
            ModuleBase moduleBase = iterator.next();
            jsonObject2.add(LegacyConfigMigration.IIlIl(moduleBase.IlIIllI()), (JsonElement)moduleBase.IlIl());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public CloudConfigManager(LegacyConfigMigration legacyConfigMigration) {
        this.Il = legacyConfigMigration;
    }

    public boolean llll(String string) {
        if (this.IIIlI.lll() || ClientEntrypoint.lII() != null) {
            String string2 = this.IIIlI.lIl(string);
            if (string2 == null || string2.isBlank()) {
                return false;
            }
            try {
                Util.getOperatingSystem().open(string2);
                return true;
            }
            catch (Exception exception) {
                return false;
            }
        }
        Path path = this.IlI();
        if (path == null) {
            return false;
        }
        String string3 = ".json";
        String string4 = string;
        Path path2 = path.resolve(string4 + string3);
        if (!Files.exists(path2, new LinkOption[0])) {
            return false;
        }
        try {
            Util.getOperatingSystem().open(path2);
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIII() {
        if (!this.IIIlI.lll()) return;
        if (Ill) {
            return;
        }
        Path path = this.IlI();
        if (path == null) {
            return;
        }
        if (!Files.isDirectory(path, new LinkOption[0])) {
            Ill = true;
            return;
        }
        long l2 = System.currentTimeMillis();
        if (l2 < lll) {
            return;
        }
        if (this.Illl(path)) {
            Ill = true;
            return;
        }
        if (!IIl.compareAndSet(false, true)) {
            return;
        }
        lll = l2 + 60000L;
        CompletableFuture.runAsync(this::IIlll);
    }

    private JsonObject IIIIl(Path path) {
        if (path == null) {
            return new JsonObject();
        }
        Path path2 = path.resolve(lIl.IIII());
        if (!Files.isRegularFile(path2, new LinkOption[0])) {
            return new JsonObject();
        }
        try {
            JsonObject jsonObject = (JsonObject)IIlIl.fromJson(Files.readString(path2), JsonObject.class);
            return jsonObject == null ? new JsonObject() : jsonObject;
        }
        catch (Exception exception) {
            return new JsonObject();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIIlI(String string, String string2) {
        if (!this.IIIlI.lll()) return false;
        if (string == null) return false;
        if (string.isBlank()) return false;
        if (string.length() > 20) return false;
        if (!this.III(string2)) return false;
        if (!this.IIIlI.IlII(string, string2)) return false;
        return true;
    }

    private boolean IIIll(String string, lllIIlI lllIIlI2) {
        if (string == null || string.length() > 524288) {
            return false;
        }
        try {
            JsonObject jsonObject = (JsonObject)llII.fromJson(string, JsonObject.class);
            if (jsonObject == null || !jsonObject.has("modules")) {
                return false;
            }
            JsonObject jsonObject2 = this.IlllI(jsonObject);
            for (ModuleBase moduleBase : lllIIlI2.IIIIIll()) {
                JsonObject jsonObject3 = LegacyConfigMigration.lllII(jsonObject2, moduleBase.IlIIllI());
                if (jsonObject3 == null) continue;
                moduleBase.IIllIl(jsonObject3);
                moduleBase.IIllIll(jsonObject3);
            }
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    private void IIlII(Path path) {
        if (path == null) {
            return;
        }
        try (Stream<Path> stream = Files.list(path);){
            for (Path path2 : stream.toList()) {
                try {
                    Files.deleteIfExists(path2);
                }
                catch (IOException iOException) {}
            }
        }
        catch (Exception exception) {
            return;
        }
        try {
            Files.deleteIfExists(path);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIlIl(lllIIlI lllIIlI2) {
        this.IIIlI.l();
        this.IIIII();
        this.Il.lIlI(lllIIlI2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static JsonElement IIllI(JsonObject jsonObject, JsonObject jsonObject2) {
        if (jsonObject == null || !jsonObject.has("keyBind")) {
            if (jsonObject2 == null) return null;
            if (!jsonObject2.has("keyBind")) return null;
            return jsonObject2.get("keyBind").deepCopy();
        }
        return jsonObject.get("keyBind").deepCopy();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IIlll() {
        try {
            Path path2 = this.IlI();
            if (path2 == null || !Files.isDirectory(path2, new LinkOption[0])) {
                Ill = true;
                return;
            }
            JsonObject jsonObject = this.IIIIl(path2);
            List<String> list = this.IIIlI.Illl();
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            try (Stream<Path> stream = Files.list(path2);){
                stream.filter(path -> path.toString().endsWith(".json")).map(path -> {
                    String string = path.getFileName().toString();
                    return string.substring(0, string.length() - 5);
                }).sorted(String.CASE_INSENSITIVE_ORDER).forEach(arrayList::add);
            }
            catch (IOException iOException) {
                IIl.set(false);
                return;
            }
            boolean bl = true;
            int n = 20 - list.size();
            for (String string : arrayList) {
                String string2;
                String string3 = ".json";
                String string4 = string;
                Path path3 = path2.resolve(string4 + string3);
                String string5 = this.lIIl(path3);
                if (string5 == null) {
                    bl = false;
                    IIIl.warn("Orchard cloud config migration failed to read profile {}");
                    continue;
                }
                if (jsonObject.has(string5)) continue;
                if (!this.IlIll(string)) {
                    jsonObject.addProperty(string5, (Number)2);
                    this.IIlI(path2, jsonObject);
                    IIIl.warn("Orchard cloud config migration skipped invalid profile {}");
                    continue;
                }
                if (this.IllII(list, string)) {
                    jsonObject.addProperty(string5, (Number)1);
                    this.IIlI(path2, jsonObject);
                    continue;
                }
                if (n <= 0) {
                    bl = false;
                    break;
                }
                try {
                    if (Files.size(path3) > 524288L) {
                        jsonObject.addProperty(string5, (Number)2);
                        this.IIlI(path2, jsonObject);
                        IIIl.warn("Orchard cloud config migration skipped invalid profile {}");
                        continue;
                    }
                    string2 = Files.readString(path3);
                }
                catch (IOException iOException) {
                    bl = false;
                    IIIl.warn("Orchard cloud config migration failed to read profile {}");
                    continue;
                }
                String string6 = this.llI(string2);
                if (string6 == null) {
                    jsonObject.addProperty(string5, (Number)2);
                    this.IIlI(path2, jsonObject);
                    IIIl.warn("Orchard cloud config migration skipped invalid profile {}");
                    continue;
                }
                if (string6.getBytes(StandardCharsets.UTF_8).length > 18432) {
                    jsonObject.addProperty(string5, (Number)2);
                    this.IIlI(path2, jsonObject);
                    IIIl.warn("Orchard cloud config migration skipped invalid profile {}");
                    continue;
                }
                if (this.IIIlI.IlII(string, string6)) {
                    --n;
                    list.add(string);
                    jsonObject.addProperty(string5, (Number)1);
                    this.IIlI(path2, jsonObject);
                    continue;
                }
                bl = false;
                IIIl.warn("Orchard cloud config migration deferred profile {}");
                break;
            }
            if (bl) {
                this.IlII(path2, jsonObject);
                this.IIlII(path2);
                Ill = true;
            }
        }
        catch (Exception exception) {
        }
        finally {
            IIl.set(false);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block59: {
            block56: {
                block58: {
                    block45: {
                        block53: {
                            block47: {
                                block54: {
                                    block55: {
                                        block51: {
                                            block57: {
                                                block50: {
                                                    block48: {
                                                        block49: {
                                                            block52: {
                                                                block46: {
                                                                    break block50;
lbl1:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        break block45;
                                                                        break;
                                                                    }
lbl3:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl5:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl7:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl9:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl11:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        CloudConfigManager.IIl = new AtomicBoolean();
                                                                        return;
                                                                    }
lbl14:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl16:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var3_14 += 4;
                                                                        if (++var4_15 < var1_12) break block46;
                                                                        ** continue;
                                                                        break;
                                                                    }
lbl20:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl22:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl24:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        v0 = 42;
                                                                        break block47;
                                                                        break;
                                                                    }
lbl27:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl29:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl31:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl33:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        CloudConfigManager.IlIIl[var4_15] = var5_16 ^= var2_13;
                                                                        ** continue;
                                                                        break;
                                                                    }
                                                                    CloudConfigManager.IlIll = new Object[var9_4.length];
                                                                    break block51;
lbl38:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        v0 = 79;
                                                                        break block47;
                                                                        break;
                                                                    }
                                                                }
lbl42:
                                                                // 2 sources

                                                                while (true) {
                                                                    var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl45:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
lbl47:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                                CloudConfigManager.IIIl = LoggerFactory.getLogger(CloudConfigManager.class);
                                                                break block52;
lbl51:
                                                                // 1 sources

                                                                while (true) {
                                                                    v0 = 66;
                                                                    break block47;
                                                                    break;
                                                                }
lbl54:
                                                                // 1 sources

                                                                while (true) {
                                                                    CloudConfigManager.IllI = StringFactory.IIII("SprintReset").llII();
                                                                    ** continue;
                                                                    break;
                                                                }
lbl57:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
lbl59:
                                                                // 1 sources

                                                                while (true) {
                                                                    CloudConfigManager.IlIlI = var9_4;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl62:
                                                                // 1 sources

                                                                while (true) {
                                                                    CloudConfigManager.IlIIl = new int[var1_12];
                                                                    ** continue;
                                                                    break;
                                                                }
lbl65:
                                                                // 1 sources

                                                                while (true) {
                                                                    break block48;
                                                                    break;
                                                                }
lbl67:
                                                                // 1 sources

                                                                while (true) {
                                                                    var1_12 = var0_11.length / 4;
                                                                    ** continue;
                                                                    break;
                                                                }
lbl70:
                                                                // 1 sources

                                                                while (true) {
                                                                    CloudConfigManager.lIII = StringFactory.IIII("Strength");
                                                                    ** continue;
                                                                    break;
                                                                }
lbl73:
                                                                // 1 sources

                                                                while (true) {
                                                                    var13_8 = 0;
                                                                    break block49;
                                                                    break;
                                                                }
                                                                var12_7 = var8_3[var10_5];
                                                                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                                                                var15_10 = 0;
                                                                break block53;
lbl80:
                                                                // 1 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                                CloudConfigManager.llI = StringFactory.IIII("Speed").llII();
                                                                break block54;
                                                            }
                                                            CloudConfigManager.llII = new GsonBuilder().setPrettyPrinting().create();
                                                            break block55;
                                                            CloudConfigManager.IIlII = StringFactory.IIII("CrystalVFX").llII();
                                                            break block56;
                                                        }
lbl90:
                                                        // 2 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
lbl92:
                                                        // 1 sources

                                                        while (true) {
                                                            CloudConfigManager.IIll = StringFactory.IIII("Player Glow").llII();
                                                            ** continue;
                                                            break;
                                                        }
                                                        var10_5 = 0;
                                                        break block57;
lbl97:
                                                        // 1 sources

                                                        while (true) {
                                                            v0 = 11;
                                                            break block47;
                                                            break;
                                                        }
                                                        CloudConfigManager.lIlI = StringFactory.IIII("Stray utils").llII();
                                                        CloudConfigManager.IIlI = StringFactory.IIII("Tapper").llII();
                                                        ** while (true)
lbl103:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
                                                    if (++var10_5 < var8_3.length) ** GOTO lbl9
                                                    ** while (true)
lbl108:
                                                    // 1 sources

                                                    while (true) {
                                                        var8_3 = "\b\f\f\f\f\f\u0018\b\b\b\b\f\f\f\f\f\f\b\f\u0014\f\f\u0010\f\u0010\f\f\b\b\bD\b\b\f\f\f\b\b\f\f\b\f\f\f\f\f\f\f\b\b\f\f\f\f\f\bLLLLLLD\u0018\u0014\u0018\u0010\u0014\u0010\u0010\u0014\f\u0010\u0010\b\u0010\u0010\u0014\u0010\u0010\b\u0010\b\u0010\u0010\u0010\b\f  \f\u0004\f\f\f\f".toCharArray();
                                                        ** continue;
                                                        break;
                                                    }
                                                    CloudConfigManager.IlI = StringFactory.IIII("No Jump Delay").llII();
                                                    CloudConfigManager.l = StringFactory.IIII("No Delay").llII();
                                                    ** while (true)
lbl114:
                                                    // 1 sources

                                                    while (true) {
                                                        CloudConfigManager.I = StringFactory.IIII("Player ESP").llII();
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                var6 = 30737;
                                                var7_2 = "\ud70b\ud605\ud726\ud600\ud678\ud654\ud610\ud72e\u4589\u46fc\u45be\u45c5\u45d0\u4587\u45c8\u469f\u45c5\u46e9\u46dc\u4695\u9290\u93ec\u9243\u93f4\u9396\u93bf\u939b\u92bc\u93ec\u92d9\u93d0\u93ff\u15d9\u14c4\u15e1\u1585\u1580\u15c4\u158d\u15cd\u15b4\u1596\u148a\u14cc\u85ea\u85f7\u85ee\u8596\u85b3\u85d3\u859a\u85fa\u859b\u8599\u85b9\u85ff\uf0be\uf0a3\uf7ba\uf7d2\uf0e7\uf797\uf7de\uf7ae\uf7cf\uf0f5\uf0ed\uf0bb\u8057\u8153\u8057\u8064\u8002\u807c\u815e\u8070\u8008\u802c\u8116\u8006\u804e\u8003\u800d\u811c\u8026\u8130\u8002\u8000\u8057\u8000\u80c2\u80a7\ub673\ub624\ub652\ub638\ub637\ub653\ub63e\ub613\u0491\u0598\u0584\u058c\u04d7\u05b0\u0585\u05ed\ud1c9\ud185\ud1e7\ud193\ud191\ud1eb\ud0c0\ud1f0\ua75e\ua72f\ua751\ua718\ua707\ua743\ua7ab\u9834\uf1e8\uf193\uf1e1\uf1e7\uf1b2\uf1a2\uf197\uf180\uf1e7\uf1a4\uf1b7\uf1fe\uf368\uf313\uf361\uf367\uf332\uf322\uf317\uf300\uf367\uf324\uf337\uf37e\ufb72\ufb7f\ufb66\ufb0e\ufb2b\ufb4b\ufb02\ufb02\ufb13\ufb21\ufc01\ufb77\u6e44\u6e61\u6e74\u6e18\u6e1d\u6e59\u6e10\u6e70\u6e01\u6e3f\u6e33\u6e79\u86e9\u869c\u86de\u86e5\u86b0\u86e7\u86e8\u86ff\u86e5\u8689\u86bc\u86f5\u62c7\u6128\u62d5\u62a8\u62fd\u62c6\u62b9\u62d9\u6280\u62b4\u6199\u61d0\u9673\u967a\u9659\u9600\u9622\u964e\u960d\u9605\u8a10\u8915\u8908\u896c\u8a49\u8925\u896c\u891c\u897d\u8a43\u895f\u896d\u9542\u9521\u957b\u950e\u9526\u9556\u9513\u9564\u9503\u9526\u953d\u950c\u9501\u951b\u9535\u9547\u951e\u955d\u9508\u957b\u13fa\u13e7\u13fe\u13e6\u13a3\u13a3\u13ea\u13ea\u138b\u13a9\u13a9\u13ef\u58ed\u58f0\u58ed\u5881\u58b4\u58c8\u5881\u5881\u5898\u58a2\u58be\u5fc8\u1124\u112c\u117c\u1102\u1104\u1144\u112e\u123c\u110b\u1113\u114a\u11aa\u114a\u1136\u124f\u1216\ud0fd\ud089\ud085\ud0f1\ud0a6\ud0e8\ud08b\ud7a3\ud09c\ud09a\ud0b9\ud0f0\u8d94\u8e9b\u8db2\u8e97\u8dd7\u8d88\u8dda\u8dbb\u8eec\u8ddc\u8eae\u8e9f\u8e9a\u8dd4\u8dd7\u8ecc\uaec2\uae99\uaecb\uae81\uaea4\uaec8\uae85\uaee6\uae81\uaeb2\uaeb1\uaef8\uebb3\uead4\ueb9a\ueadc\uebe9\uea95\uead0\ueab7\ueadc\uebe3\uebc4\ueb8d\ue80b\uf705\ue826\uf700\uf778\uf754\uf710\ue82e\u7b04\u7a0a\u7b21\u7a0f\u7a33\u7a7b\u7a3b\u7a19\ueb94\u149f\u14e0\u14ad\u1480\u14c4\uebc1\ueba9\u5675\u567c\u5602\u5665\u5634\u564b\u5638\u5666\u5613\u561e\u5642\u561f\u566a\u5617\u5612\u564e\u5605\u5617\u561d\u563c\u5674\u566a\u564b\u5618\u5678\u5623\u563c\u5602\u561c\u5634\u5674\u5622\u5650\u561e\u5637\u564d\u561f\u566b\u5601\u563c\u566f\u5630\u567d\u5665\u5631\u5656\u5623\u567d\u560c\u561e\u567c\u5613\u566d\u5671\u560f\u564b\u563b\u561b\u5605\u5600\u563a\u562c\u5615\u5665\u5634\u5653\u560e\u567b\u7844\u794a\u7861\u794f\u7873\u783b\u787b\u7859\u9616\u9518\u951e\u9577\u964f\u953e\u964c\u9623\u5318\u5355\u5209\u521d\u5340\u5226\u5261\u52c0\u5345\u535e\u525d\u5214\ueb09\ueb4c\uea18\uea0c\ueb51\uea3b\uea70\ueb31\uea74\ueb43\uea54\uea1d\u1347\u1302\u1356\u144e\u1313\u1375\u133e\u1373\u1336\u1301\u140e\u1447\ua6f5\ua6b2\ua6d4\ua6f3\ua6af\ua6da\ua6f7\ua69f\u159b\u1699\u15a3\u16ea\u15c2\u1583\u15c5\u169e\u4aea\u4af7\u4aee\u4a96\u4ab3\u4ad3\u4a9a\u4afa\u4a9b\u4a99\u4ab9\u4aff\u7e08\u7d6d\u7d10\u7d74\u7e51\u7d2d\u7d64\u7d14\u7e45\u7dbb\u7d57\u7d15\u6ac7\u692a\u6af9\u6a86\u6a8f\u6ac5\u6ae8\u6acf\ud061\ud1e4\ud0a6\ud1ed\ud038\ud09f\ud1e0\ud187\ud1ed\ud1e1\ud1d4\ud19d\u68a3\u68a6\u68e4\u68af\u68fa\u68dd\u68a2\u68c9\u68af\u68af\u6f92\u6fdb\u6dff\u6de2\u6dfb\u6d93\u6da6\u6dd6\u6d9f\u6def\u6d8e\u6db0\u6db0\u6dfa\u4884\u49a1\u48b4\u48d8\u48dd\u4899\u48d0\u48b0\u48c1\u49ff\u49f3\u49b9\ue7be\ue7a3\ue6ba\ue6d2\ue7e7\ue697\ue6de\ue6ae\ue6cf\ue7f5\ue7ed\ue7bb\u2919\u2804\u2921\u2945\u2940\u2904\u294d\u280d\u2874\u2956\u284a\u280c\u1c9e\u1dfd\u1ca7\u1ded\u1c38\u1dac\u1de1\u1d8a\u1ded\u1cde\u1dcd\u1d84\uf721\uf7ab\uf77c\uf76e\ue852\ue81a\ue85a\uf774\ufa3c\ufa32\ufa19\ufa17\ufa2b\ufa43\ufa23\ufb21\u0c77\u0c00\u0c4e\u0c10\u0c25\u0c51\u0c04\u0c73\u0c10\u0c37\u0c28\u0c61\u36b7\u36b8\u3545\u35d8\u36ed\u36b6\u3529\u35a9\u35d0\u35c4\u36e9\u36a0\u5751\u485e\u5747\u572a\u570f\u5754\u5723\u5763\u5732\u5732\u481f\u4856\u0ebe\u0ea5\u0db8\u0d25\u0ef0\u0ebf\u0ddc\u0dac\u0dcd\u0dc1\u0ef4\u0ebd\u5d44\u5d6f\u5d76\u5d1b\u5d3e\u5d41\u5d12\u5d72\u5d03\u5d03\u5d2e\u5d67\u176b\u1765\u1746\u17a0\u0858\u1734\u1770\u174e\ub385\ubc8c\ubc92\ubcf5\ub3c4\ubcbb\ub328\ubc96\ubce3\ubcee\ub392\ubcef\ubc9a\ub3c7\ubce2\ubcbe\ubcf5\ubce7\ubced\ub3cc\ub364\ubcfa\ub3bb\ubce8\ubce8\ubcb3\ub3cc\ubc92\ubcec\ub3c4\ub364\ub3d2\ub340\ubcee\ub3c7\ubcbd\ubcef\ubc9b\ubcf1\ub3cc\ub39f\ub3c0\ub343\ubcf7\ub3c6\ubca7\ub32b\ubc92\ub3c5\ubcf2\ub395\ubcff\ubc97\ubc96\ub3c5\ub39a\ub3d7\ub3bc\ub3dc\ubce4\ub364\ubc98\ubce6\ubcfa\ub3c4\ubcc6\ub3ca\ub3b4\ub320\ubce2\ub388\ubcf8\ubc8d\ub3cc\ubcef\ubcce\u754c\u7645\u754f\u7534\u757d\u7576\u7569\u755b\u752e\u7523\u754f\u7522\u7557\u753a\u752f\u7543\u753c\u762a\u752c\u7505\u755d\u7527\u7576\u7521\u7529\u756e\u7505\u754f\u752d\u757d\u755d\u751f\u7501\u7523\u757a\u7544\u7522\u7556\u7538\u7505\u7522\u7568\u7627\u7528\u757b\u756b\u752c\u7562\u7504\u7523\u7543\u752e\u755b\u752a\u7504\u755b\u756b\u7505\u752f\u7520\u7607\u7642\u762b\u7505\u7506\u7548\u7505\u7544\u7560\u753f\u756a\u752c\u755a\u7533\u7502\u757d\u042f\u0426\u0528\u054f\u046e\u04e1\u0472\u053c\u0549\u0544\u042c\u0559\u04c0\u055d\u04b8\u0518\u04ab\u0451\u0557\u0466\u043a\u0540\u0525\u0556\u0552\u0509\u0466\u0528\u054a\u046e\u043a\u0548\u041a\u0550\u0461\u0517\u0559\u04c5\u055b\u0466\u0435\u047f\u0450\u054b\u046c\u0510\u055b\u0539\u055f\u0544\u0518\u055d\u053c\u054d\u0463\u0500\u047c\u0416\u0554\u0547\u0474\u0439\u044c\u0552\u0465\u0433\u0466\u0533\u0473\u0548\u050d\u055b\u04c1\u04a0\u0559\u051a\u89c3\u88ca\u89f4\u8993\u89b2\u89cd\u89ae\u89f0\u89e5\u8988\u89f8\u89ed\u89ec\u8981\u8994\u89cc\u8987\u88a5\u899b\u89aa\u89e6\u899c\u89d1\u899a\u898e\u89d5\u898a\u89f4\u89e6\u89b2\u89e6\u89a4\u89c6\u89e4\u89b5\u89cb\u89ed\u89f1\u8997\u89aa\u89e9\u89b6\u89c9\u8991\u89b0\u89a1\u89a1\u89f4\u8983\u8984\u89f3\u899d\u89f5\u89fc\u89b7\u89f0\u89a5\u89ca\u89b6\u8992\u89e6\u89fe\u88a0\u8988\u89b2\u8884\u898c\u89d2\u89a2\u8994\u89c2\u899e\u89ff\u8986\u898d\u89bc\ued7d\ued74\ued7a\ued1d\ued3c\ued53\ued20\ued6e\ued1b\ued16\ued7a\ued17\ued72\ued0f\ued0a\ued46\ued1d\ued1f\ued65\ued34\ued6c\ued12\ued53\ued60\ued00\ued5b\ued34\ued7a\ued64\ued3c\ued6c\ued3a\ued48\ued66\ued3f\ued45\ued17\ued73\ued09\ued34\ued67\ued21\uee22\ued19\ued3e\ued5e\ued6d\ued67\ued0d\ued16\ued46\ued6b\ued6e\ued1f\ued35\ued6e\ued2e\ued44\ued1a\ued09\uee02\ued77\ued1e\ued0c\ued33\ued41\ued34\ued05\ued21\ued7a\ued5f\ued6d\ued6f\ued16\ued37\ued4c\ue3ba\ue3b3\ue241\ue2da\ue3eb\ue288\ue3e7\ue2ad\ue2d8\ue2d5\ue3bd\ue2d0\ue2a9\ue2d4\ue2d1\ue291\ue2ce\ue3d8\ue2d2\ue3f3\ue3af\ue229\ue384\ue2d3\ue2c7\ue260\ue3f3\ue241\ue2df\ue3eb\ue3af\ue3e1\ue38f\ue2d1\ue3e8\ue292\ue2d0\ue2a4\ue2ce\ue3f3\ue3b4\ue3fa\ue3d9\ue2de\ue3ed\ue299\ue2de\ue2b0\ue2ca\ue2d5\ue291\ue2dc\ue2ad\ue224\ue3f6\ue3a9\ue3fd\ue393\ue2dd\ue2d2\ue3f5\ue3b0\ue3dd\ue2d7\ue3f4\ue3b6\ue3f3\ue2b6\ue3f6\ue2c1\ue29c\ue2de\ue2a8\ue2c1\ue3f0\ue28f\u641f\u6316\u6318\u637f\u645e\u6331\u6442\u630c\u6379\u6374\u641c\u6449\u6310\u636d\u6368\u6328\u637b\u6301\u6447\u6456\u640a\u6370\u6435\u6446\u6362\u6339\u6456\u6318\u637a\u645e\u640a\u6458\u642a\u6440\u6451\u6327\u6449\u6315\u636b\u6456\u6405\u63aa\u63c5\u644b\u6453\u6407\u6367\u6307\u6376\u637d\u6329\u6449\u631a\u6368\u644b\u6414\u6443\u630c\u631f\u6377\u6322\u6315\u643c\u6454\u6457\u635f\u6443\u6379\u4fbb\u4ffc\u4eaa\u4edf\u4ff7\u4e87\u4ec2\u4eb9\u4ed2\u4fe8\u4fbe\u4fbc\u4ea6\u4fbd\u4fe4\u4e9a\u4ec1\u4f99\u4fef\u4ec4\u4fb3\u4ed7\u4f99\u4f86\u39ae\u38d0\u3841\u38c5\u39e1\u3891\u39fa\u38ab\u38c7\u39f3\u3897\u38d4\u3845\u38c8\u39eb\u3898\u382d\u398f\u38da\u38c1\u1e69\u1e60\u1e5f\u1e3e\u1e18\u1e48\u1e33\u1e7b\u1e1d\u1e03\u1e3f\u1e04\u1e7a\u1e6d\u1e79\u1e77\u1e12\u1e0c\u1e2c\u1e23\u1e40\u1e0c\u1e10\u1e75\u3f33\u3f66\u3f51\u3043\u3f62\u3f70\u3f72\u3f5b\u3056\u3054\u3f38\u3047\u3fc3\u3046\u3f35\u3f6c\u77fd\u7788\u76a3\u779d\u77bc\u7682\u77ac\u77cd\u77e7\u77a0\u77a0\u7784\u77f5\u77fa\u77b4\u77f4\u7780\u7783\u77f2\u77ef\u932d\u9451\u9317\u9450\u936f\u9410\u936f\u93c5\u93a5\u93bb\u9339\u937e\u943a\u9459\u9330\u9369\uf020\uf02c\uf066\uf005\uf01e\uf07d\uf01e\uf050\uf030\uf02a\uf024\uf004\uf04c\uf0a7\uf00b\uf11c\u3e6c\u3e21\u3e44\u3e0f\u3e35\u3e79\u3e39\u3e56\u3e03\u3e03\u3e6f\u3e27\u3e7d\u3e0a\u3e7b\u3e4f\u3e13\u3e58\u3e77\u3e6a\u748a\u74cf\u74a6\u75ed\u74d0\u75b8\u74c7\u74b9\u75ed\u75fc\u75a9\u7598\u4281\u42de\u42a0\u42da\u43ff\u429f\u422a\u4241\u42d6\u42c8\u4290\u43fb\u42b5\u4385\u42d9\u43fa\u32a6\u32af\u3284\u31d6\u31dd\u32a8\u32e5\u31b0\u32f3\u31d2\u3160\u31cc\u31b4\u31ce\u32b7\u32ee\u2ddf\u2daf\u2d85\u2db7\u2d86\u2dc6\u2cde\u2d83\uc648\uc634\uc66a\uc638\uc611\uc65f\uc63c\uc65d\uc621\uc63c\uc705\uc61c\uc65b\uc60e\uc74d\uc714\u6473\u647d\u6467\u641e\u642f\u6471\u6466\u6470\u640c\u6404\u646f\u6421\u647a\u641b\u6472\u642b\ufd6f\ufd79\ufd6b\ufd12\ufd23\ufd6d\ufd7a\ufd6c\ufd08\ufd07\ufd6b\ufd31\ufd01\ufd0e\ufd07\ufd40\ufd68\ufd50\ufd1b\ufd7e\u64d3\u7bd9\u64e3\u64b9\u648f\u64f3\u648a\u64cd\u64b7\u6484\u64d7\u64a3\u64e3\u6490\u648d\u64f8\ua1d5\ua0d3\ua1c9\ua1af\ua18d\ua1f5\ua1ac\ua1df\ua1bc\ua1ac\ua1cd\ua180\ua1c9\ua1a9\ua182\ua061\u6118\u6079\u601d\u606d\u6149\u6028\u6157\u600d\uada8\uada2\uaca4\uacde\uacda\uac85\uadf2\uacba\uacd4\uade6\uac84\uacd5\uacba\uacd4\uadff\uadf4\u7a1e\u7968\u791e\u797b\u7a53\u793f\u7914\u797b\u7d87\u7efb\u7db0\u7ef2\u7d3d\u7ebb\u7efa\u7db7\u7eef\u7eee\u7d92\u7e8e\u7e9a\u7e82\u7ddc\u7d9c\ufcea\ufceb\ufce7\ufc93\ufc9b\ufcda\ufcbd\ufcf7\ufc93\ufc81\ufcc3\ufc80\ufcf8\ufcb9\ufcb5\ufcf7\u642a\u6546\u6447\u654b\u6431\u6519\u6474\u653b\u6542\u6474\u650c\u6553\u653c\u6552\u642b\u6472\u26c8\u25c5\u2682\u2691\u2687\u26ca\u25c1\u26f8\ue53d\ue50b\ue631\ue657\ue570\ue5e0\ue57b\ue63c\ue5a4\ue649\ue61d\ue530\u0acb\u09c5\u09a9\u0af1\u09c7\u0994\u0aff\u0a84\u0aef\u093d\u0962\u09d2\u0a98\u0a83\u0ae7\u0aa5\u0afc\u09a9\u09d3\u0af1\u0961\u0a8e\u0a94\u0aec\u0af3\u098c\u0a85\u0a9f\u0ae3\u0939\u0aab\u0a86\u3bc9\u3ac3\u3aa7\u3bf3\u3a39\u3a92\u3bf1\u3b86\u3bed\u3a3b\u3a64\u3ad0\u3b9a\u3b81\u3ad9\u3ba7\u3bfe\u3aa7\u3ad1\u3bff\u3a63\u3b8c\u3b96\u3be2\u3bf5\u3a8a\u3b83\u3aa1\u3bf6\u3ac7\u3bd2\u3be2\ufb13\ufa74\ufb3a\ufa7c\ufb49\ufa35\ufa70\ufa17\ufa7c\ufb43\ufa24\ufa6d\ub81c\ub845\uc773\uc716\u85ae\u85b5\u84a8\u84d5\u85e0\u85af\u84cc\u84bc\u84dd\u84d1\u85c4\u858d\u3b1f\u3a00\u3a1d\u3b40\u3b55\u3b1e\u3a71\u3a11\u3a68\u3a6c\u3a51\u3a18\ue153\ue25c\ue149\ue134\ue101\ue152\ue125\ue165\ue13c\ue130\ue21d\ue254\ud982\ud9d9\uda8b\ud9c1\udae4\ud988\ud9c5\ud9a6\ud9c1\udaf2\udaf1\udab8";
                                                ** while (true)
                                                var9_4 = new String[var8_3.length];
                                                var13_8 = -1;
                                                ** while (true)
                                                CloudConfigManager.IIlll = StringFactory.IIII("Lunar Cosmetics").llII();
                                                CloudConfigManager.II = StringFactory.IIII("Client Cosmetics").llII();
                                                ** while (true)
lbl127:
                                                // 1 sources

                                                while (true) {
                                                    CloudConfigManager.lIIl = StringFactory.IIII("Smooth");
                                                    ** continue;
                                                    break;
                                                }
lbl130:
                                                // 1 sources

                                                while (true) {
                                                    v1 = var15_10++;
                                                    var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            var11_6 = 0;
                                            break block58;
                                        }
                                        var2_13 = -589923566;
                                        var0_11 = "\u00ec\u00e2\u00f0\u00b0H\u00ab\u00cd\u00ad\u00fc&\u00a1\u00a5\u00c3nd$\u00ea\u00a1\u0097\u001e\u00fb\u00fbx2Y\u000fQ\u00b3\u009d\u0090\u00e3*\u0014#\u00c1(\u00ebR\u00ebB\u00ab\u00b6\u00f9\u00b2Ip3\u00e4\u00a3\u00e2\u009e\u0002q\u0005.#\u0003\u0095\u00e8J.\u00ef\u0097GC\u00f4\u00f1o#\u00da\u0098\u00eaLu\u00b2\u008d\u00ad\u00ae\u00b4^\u000b\u00d0c\u009fO+\u00ca~\u00ee<\u0093_\u00f6\u00d5[\u00d6".getBytes("ISO-8859-1");
                                        ** while (true)
                                        CloudConfigManager.IlII = StringFactory.IIII("Module List").llII();
                                        CloudConfigManager.Illl = StringFactory.IIII("Color Mode");
                                        ** while (true)
                                    }
                                    CloudConfigManager.IIlIl = new Gson();
                                    CloudConfigManager.III = StringFactory.IIII("Feather Cosmetics").llII();
                                    ** while (true)
lbl148:
                                    // 1 sources

                                    while (true) {
                                        v0 = 82;
                                        break block47;
                                        break;
                                    }
                                }
                                CloudConfigManager.IlIII = StringFactory.IIII("Exploit Mode");
                                break block59;
                                CloudConfigManager.IIII = StringFactory.IIII("PopVFX").llII();
                                CloudConfigManager.lllI = StringFactory.IIII("PopVisuals").llII();
                                ** while (true)
                                CloudConfigManager.lIll = StringFactory.IIII("Nick Hider").llII();
                                CloudConfigManager.llll = StringFactory.IIII("Nick Switcher").llII();
                                ** while (true)
                            }
                            var16_1 = v0;
                            ** while (true)
                            var9_4[var10_5] = new String(var14_9).intern();
                            var11_6 += var12_7;
                            ** while (true)
                        }
lbl167:
                        // 2 sources

                        while (true) {
                            switch (var15_10 % 5) {
                                case 2: {
                                    ** continue;
                                }
                                case 3: {
                                    ** continue;
                                }
                                case 1: {
                                    ** continue;
                                }
                                default: {
                                    ** continue;
                                }
                                ** case 4:
lbl178:
                                // 1 sources

                                ** continue;
                            }
                            break;
                        }
                    }
                    ** while (var15_10 < var14_9.length)
lbl181:
                    // 1 sources

                    ** while (true)
                }
                var12_7 = '\u0000';
                if (var13_8 == 0) ** break;
                ** while (true)
                ** while (true)
                CloudConfigManager.IlIl = StringFactory.IIII(".orchard-cloud-migrated");
                CloudConfigManager.lIl = StringFactory.IIII(".orchard-cloud-migration");
                ** while (true)
            }
            CloudConfigManager.IIIIl = StringFactory.IIII("Crystal Render").llII();
            CloudConfigManager.llIl = StringFactory.IIII("Stray runner").llII();
            ** while (true)
        }
        CloudConfigManager.ll = StringFactory.IIII("Tapper Debug").llII();
        CloudConfigManager.lI = StringFactory.IIII("Aim Assist").llII();
        ** while (true)
        var3_14 = 0;
        var4_15 = 0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public String IlIIl(lllIIlI lllIIlI2) {
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        Iterator<ModuleBase> iterator = lllIIlI2.IIIIIll().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                jsonObject.add("modules", (JsonElement)jsonObject2);
                return Base64.getEncoder().encodeToString(IIlIl.toJson((JsonElement)jsonObject).getBytes());
            }
            ModuleBase moduleBase = iterator.next();
            jsonObject2.add(LegacyConfigMigration.IIlIl(moduleBase.IlIIllI()), (JsonElement)moduleBase.IlIl());
        }
    }

    public boolean IlIlI(String string, lllIIlI lllIIlI2) {
        try {
            String string2;
            String string3 = string2 = string == null ? "" : string.trim();
            if (string2.isEmpty() || string2.length() > 524288) {
                return false;
            }
            if (string2.startsWith("{")) {
                return this.IIIll(string2, lllIIlI2);
            }
            String string4 = new String(Base64.getDecoder().decode(string2), StandardCharsets.UTF_8);
            if (string4.length() > 524288) {
                return false;
            }
            return this.IIIll(string4, lllIIlI2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIll(String string) {
        if (string == null) return false;
        if (string.isEmpty()) return false;
        if (string.length() > 48) {
            return false;
        }
        boolean bl = string.length() == 1 && string.charAt(0) == '.';
        boolean bl2 = string.length() == 2 && string.charAt(0) == '.' && string.charAt(1) == '.';
        if (bl) return false;
        if (bl2) return false;
        int n = 0;
        while (n < string.length()) {
            char c = string.charAt(n);
            if (!(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || c == ' ' || c == '_' || c == '.')) {
                if (c != '-') return false;
            }
            boolean bl3 = true;
            boolean bl4 = bl3;
            if (!bl4) {
                return false;
            }
            ++n;
        }
        return true;
    }

    private boolean IllII(List<String> list, String string) {
        Iterator<String> iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                return false;
            }
            String string2 = iterator.next();
            if (string2.equalsIgnoreCase(string)) break;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IllIl(JsonObject jsonObject, JsonObject jsonObject2) {
        if (jsonObject == null) return;
        if (!jsonObject.has("keyBind")) return;
        jsonObject2.add("keyBind", jsonObject.get("keyBind").deepCopy());
    }

    /*
     * Enabled aggressive block sorting
     */
    private JsonObject IlllI(JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("modules");
        LegacyConfigMigration.IIlIII(jsonObject2, lIll, llll);
        LegacyConfigMigration.IIlIII(jsonObject2, I, IIll);
        LegacyConfigMigration.IIlIII(jsonObject2, IlI, l);
        LegacyConfigMigration.IIlIII(jsonObject2, IIII, lllI);
        LegacyConfigMigration.IIlIII(jsonObject2, IIlII, IIIIl);
        LegacyConfigMigration.IIlIII(jsonObject2, llIl, lIlI);
        CloudConfigManager.Ill(jsonObject2);
        CloudConfigManager.llII(jsonObject2);
        CloudConfigManager.lI(jsonObject2);
        CloudConfigManager.IIl(jsonObject2);
        CloudConfigManager.lIl(jsonObject2);
        return jsonObject2;
    }

    private static int Illll(int n, int n2) {
        return IlIIl[n ^ 0xBEDB8EE5] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIIII(int n, char c, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0x7DD4;
        char[] cArray = IlIlI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlIll[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            CloudConfigManager.IlIll[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xCAF;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 10492;
            n6 -= 19590;
            n6 -= 10910;
            n6 ^= 0x537A;
            cArray[n5] = (char)((n6 += 13403) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

