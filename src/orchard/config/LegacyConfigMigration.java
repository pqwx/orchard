/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlllIlI
 * Identified from direct evidence; see README.md
 *
 * Recovered strings in this class:
 *   - No config file exists to back up
 *   - No backup directory is available
 *   - No ClickGUI backup is available
 *   - No config file is available
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
 *  net.fabricmc.loader.api.FabricLoader
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.client.util.InputUtil$Key
 */
package orchard.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.net.URI;
import java.nio.file.CopyOption;
import java.nio.file.FileSystem;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.DosFileAttributeView;
import java.nio.file.attribute.FileAttribute;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.util.InputUtil;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIlIllIl;
import orchard.internal.IlIlIII;
import orchard.internal.IlllIlIl;
import orchard.internal.lIIllllI;
import orchard.internal.lllIIlI;

@Environment(value=EnvType.CLIENT)
public final class LegacyConfigMigration {
    private static final long I;
    private static final IIIlIIIII l;
    private static final IIIlIIIII II;
    private static final IIIlIIIII Il;
    private static final IIIlIIIII lI;
    private static final IIIlIIIII ll;
    private static final IIIlIIIII III;
    private static final long IIl;
    private boolean IlI;
    private static final IIIlIIIII Ill;
    private static final IIIlIIIII lII;
    private JsonObject lIl;
    private static final long llI;
    private static final long lll;
    private static final IIIlIIIII IIII;
    private static final long IIIl;
    private static final IIIlIIIII IIlI;
    private static final IIIlIIIII IIll;
    private static final IIIlIIIII IlII;
    private static final IIIlIIIII IlIl;
    private static final long IllI;
    private static final long Illl;
    private static final long lIII;
    private static final long lIIl;
    private static final IIIlIIIII lIlI;
    private static final IIIlIIIII lIll;
    private static final IIIlIIIII llII;
    private static final IIIlIIIII llIl;
    private static final long lllI;
    private static final long llll;
    private Category IIIII;
    private final Path IIIIl = FabricLoader.getInstance().getGameDir();
    private static final Gson IIIlI;
    private static final IIIlIIIII IIIll;
    private static final long IIlII;
    private static final IIIlIIIII IIlIl;
    private static final IIIlIIIII IIllI;
    private static final IIIlIIIII IIlll;
    private final Path IlIII = FabricLoader.getInstance().getConfigDir();
    private static final IIIlIIIII IlIIl;
    private boolean IlIlI;
    private static final long IlIll;
    private static final IIIlIIIII IllII;
    private static final IIIlIIIII IllIl;
    private static final IIIlIIIII IlllI;
    private static final long Illll;
    private static final long lIIII;
    private InputUtil.Key lIIIl;
    private static final long lIIlI;
    private static final long lIIll;
    private static final Gson lIlII;
    private static final IIIlIIIII lIlIl;
    private static final long lIllI;
    private static final IIIlIIIII lIlll;
    private static final long llIII;
    private volatile IlIlIII llIIl;
    private static final long llIlI;
    private long llIll;
    private static final IIIlIIIII lllII;
    private static final long lllIl;
    private InputUtil.Key llllI;
    private static final long lllll;
    private static final IIIlIIIII IIIIII;
    private static final long IIIIIl;
    private boolean IIIIlI;
    private static final long IIIIll;
    private static final long IIIlII;
    private FileSystem IIIlIl;
    private static final long IIIllI;
    private static final IIIlIIIII IIIlll;
    private static final IIIlIIIII IIlIII;
    private IIlIllIl IIlIIl;
    private static final int[] IIlIlI;
    private static final String[] IIlIll;
    private static final Object[] IIllII;

    private Path I() {
        return LegacyConfigMigration.llIll(lIlIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void l(JsonObject jsonObject) {
        if (!LegacyConfigMigration.llIl(jsonObject, lll)) {
            return;
        }
        JsonObject jsonObject2 = LegacyConfigMigration.lllII(jsonObject, lll);
        if (jsonObject2 == null) return;
        if (!jsonObject2.has("settings")) {
            return;
        }
        JsonObject jsonObject3 = jsonObject2.getAsJsonObject("settings");
        long l2 = IIll.llII();
        long l3 = lllII.llII();
        if (ModuleBase.IIIIlIl(jsonObject3, l2) == null) {
            JsonElement jsonElement = ModuleBase.IIIIlIl(jsonObject3, l3);
            if (jsonElement == null) {
                return;
            }
            if (jsonElement != null && jsonElement.isJsonPrimitive() && jsonElement.getAsJsonPrimitive().isNumber()) {
                double d = jsonElement.getAsDouble();
                double d2 = Math.max(1.0, Math.min(100.0, 101.0 - d));
                ModuleBase.lllIIl(jsonObject3, l2, (JsonElement)new JsonPrimitive((Number)d2));
            }
            ModuleBase.lllIlI(jsonObject3, l3);
            return;
        }
        ModuleBase.lllIlI(jsonObject3, l3);
    }

    /*
     * Unable to fully structure code
     */
    public Path II(String var1_1) throws IOException {
        block11: {
            block8: {
                block9: {
                    block7: {
                        block10: {
                            break block9;
lbl1:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl3:
                            // 1 sources

                            while (true) {
                                if (!Files.exists(var2_2, new LinkOption[0])) lbl-1000:
                                // 2 sources

                                {
                                    throw new IOException("No config file exists to back up");
                                }
                                var3_3 = this.IllIIl();
                                if (var3_3 == null) break block7;
                                break block8;
                                break;
                            }
lbl10:
                            // 2 sources

                            while (true) {
                                v0 = "manual";
                                ** GOTO lbl1
                                break;
                            }
                            var4_4 = v0;
                            break block10;
lbl15:
                            // 1 sources

                            return var6_6;
                        }
                        var5_5 = LocalDateTime.now().format(DateTimeFormatter.ofPattern(LegacyConfigMigration.IllII.IIII()));
                        var12_7 = ".bak";
                        var11_8 = var4_4;
                        var10_9 = ".";
                        var9_10 = var5_5;
                        var8_11 = ".";
                        var7_12 = String.valueOf(var2_2.getFileName());
                        var6_6 = var3_3.resolve(var7_12 + var8_11 + var9_10 + var10_9 + var11_8 + var12_7);
                        Files.copy(var2_2, var6_6, new CopyOption[]{StandardCopyOption.REPLACE_EXISTING});
                        ** while (true)
lbl29:
                        // 1 sources

                        while (var1_1.isBlank()) {
                            ** GOTO lbl10
                        }
                        break block11;
                    }
                    throw new IOException("No backup directory is available");
                }
                var2_2 = this.lIIII();
                ** while (var2_2 == null)
lbl37:
                // 1 sources

                ** while (true)
            }
            Files.createDirectories(var3_3, new FileAttribute[0]);
            if (var1_1 != null) ** break;
            ** while (true)
            ** GOTO lbl29
        }
        v0 = var1_1.replaceAll("[^A-Za-z0-9_.-]", "_");
        ** while (true)
    }

    private static String lI() {
        return "riseClickGuiLayout";
    }

    public InputUtil.Key ll() {
        return this.lIIIl;
    }

    public void III(IlIlIII ilIlIII) {
        this.llIIl = ilIlIII;
    }

    public void IIl(lllIIlI lllIIlI2) {
        Path path = this.lIIII();
        if (path == null || !Files.exists(path, new LinkOption[0])) {
            return;
        }
        try {
            JsonElement jsonElement = (JsonElement)lIlII.fromJson(Files.readString(path), JsonElement.class);
            if (jsonElement == null || !jsonElement.isJsonObject()) {
                return;
            }
            this.IlIIII(jsonElement.getAsJsonObject(), lllIIlI2);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static JsonElement Ill(JsonObject jsonObject, JsonObject jsonObject2) {
        if (jsonObject != null && jsonObject.has("keyBind")) {
            return jsonObject.get("keyBind").deepCopy();
        }
        if (jsonObject2 == null) return null;
        if (!jsonObject2.has("keyBind")) return null;
        return jsonObject2.get("keyBind").deepCopy();
    }

    private IIlIllIl lII(String string) {
        IIlIllIl[] iIlIllIlArray = IIlIllIl.values();
        try {
            int n = Integer.parseInt(string);
            if (n >= 0 && n < iIlIllIlArray.length) {
                return iIlIllIlArray[n];
            }
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        for (IIlIllIl iIlIllIl : iIlIllIlArray) {
            if (!IlllIlIl.I(iIlIllIl, string)) continue;
            return iIlIllIl;
        }
        return null;
    }

    private long lIl(Path path) {
        try {
            return Files.getLastModifiedTime(path, new LinkOption[0]).toMillis();
        }
        catch (IOException iOException) {
            return 0L;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void llI(JsonObject jsonObject, JsonObject jsonObject2) {
        if (jsonObject != null && jsonObject.has("keyBind")) {
            jsonObject2.add("keyBind", jsonObject.get("keyBind").deepCopy());
        }
    }

    private String lll(IIlIllIl iIlIllIl) {
        return (iIlIllIl != IIlIllIl.lI ? ll : lI).IIII();
    }

    private Path IIII() {
        return FabricLoader.getInstance().getModContainer("ilovcats").map(modContainer -> (Path)modContainer.getOrigin().getPaths().get(0)).orElse(null);
    }

    public static Path IIIl() {
        return LegacyConfigMigration.llIll(IIlIII);
    }

    private void IIlI() {
        try {
            Files.deleteIfExists(this.IIIIl.resolve(IIllI.IIII()));
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    private static boolean IIll(JsonObject jsonObject, long l2, boolean bl) {
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Path IlII() {
        Path path = this.llllI(IIlIllIl.lI);
        if (path == null) return null;
        Path path2 = path.resolve(Il.IIII());
        return path2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public JsonObject IlIl(lllIIlI lllIIlI2) {
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonObject jsonObject = new JsonObject();
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("category", (Number)this.IIIII.ordinal());
        if (this.IlI) {
            jsonObject2.addProperty("module", LegacyConfigMigration.IIlIl(this.llIll));
        }
        if ((jsonElement2 = lIIllllI.IllIIII(this.llllI)) != null) {
            jsonObject2.add("bind", jsonElement2);
        }
        if ((jsonElement = lIIllllI.IllIIII(this.lIIIl)) != null) {
            jsonObject2.add("clickGuiBind", jsonElement);
        }
        jsonObject.add("panel", (JsonElement)jsonObject2);
        jsonObject.add(LegacyConfigMigration.IlIIIl(), (JsonElement)(this.lIl != null ? this.lIl.deepCopy() : new JsonObject()));
        JsonObject jsonObject3 = new JsonObject();
        List<ModuleBase> list = lllIIlI2.IIIIIll();
        Iterator<ModuleBase> iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                jsonObject.add("modules", (JsonElement)jsonObject3);
                return jsonObject;
            }
            ModuleBase moduleBase = iterator.next();
            jsonObject3.add(LegacyConfigMigration.IIlIl(moduleBase.IlIIllI()), (JsonElement)moduleBase.IlIl());
        }
    }

    private Path IllI() {
        return LegacyConfigMigration.IIIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    static void Illl(JsonObject jsonObject, long l2) {
        jsonObject.remove(LegacyConfigMigration.IIlIl(l2));
        String string = null;
        for (String string2 : jsonObject.keySet()) {
            if (StringFactory.I(string2) != l2) continue;
            string = string2;
            break;
        }
        if (string == null) return;
        jsonObject.remove(string);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean lIII(JsonObject jsonObject) {
        if (jsonObject == null) return false;
        if (!jsonObject.has("enabled")) return false;
        if (!jsonObject.get("enabled").getAsBoolean()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void lIIl(JsonObject jsonObject) {
        JsonPrimitive jsonPrimitive;
        if (LegacyConfigMigration.llIl(jsonObject, IIIlII)) {
            return;
        }
        JsonObject jsonObject2 = LegacyConfigMigration.lllII(jsonObject, lIII);
        JsonObject jsonObject3 = LegacyConfigMigration.lllII(jsonObject, llll);
        if (jsonObject2 == null && jsonObject3 == null) {
            return;
        }
        JsonObject jsonObject4 = new JsonObject();
        jsonObject4.addProperty("enabled", Boolean.valueOf(LegacyConfigMigration.lIII(jsonObject2) || LegacyConfigMigration.lIII(jsonObject3)));
        JsonElement jsonElement = LegacyConfigMigration.Ill(jsonObject2, jsonObject3);
        if (jsonElement != null) {
            jsonObject4.add("keyBind", jsonElement);
        }
        JsonObject jsonObject5 = new JsonObject();
        jsonPrimitive(LegacyConfigMigration.IllIll(jsonObject2, jsonObject3));
        ModuleBase.lllIIl(jsonObject5, StringFactory.IIII("u5hdmRdD").llII(), (JsonElement)jsonPrimitive);
        jsonObject4.add("settings", (JsonElement)jsonObject5);
        jsonObject4.add("featherSettings", (JsonElement)LegacyConfigMigration.llII(jsonObject2));
        LegacyConfigMigration.Illll(jsonObject, IIIlII, (JsonElement)jsonObject4);
    }

    public void lIlI(lllIIlI lllIIlI2) {
        IlIlIII ilIlIII = this.llIIl;
        if (ilIlIII == null || this.IIIIlI || !ilIlIII.I()) {
            return;
        }
        this.IIIIlI = true;
        String string = ilIlIII.l();
        if (string == null) {
            Path path = this.lIIII();
            if (path != null && Files.isRegularFile(path, new LinkOption[0])) {
                try {
                    JsonElement jsonElement = (JsonElement)IIIlI.fromJson(Files.readString(path), JsonElement.class);
                    if (jsonElement != null && jsonElement.isJsonObject() && ilIlIII.II(IIIlI.toJson(jsonElement))) {
                        this.IIllIl();
                        this.IIIIlI = true;
                    }
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            return;
        }
        this.IIIIlI = true;
        try {
            JsonElement jsonElement = (JsonElement)IIIlI.fromJson(string, JsonElement.class);
            if (jsonElement != null && jsonElement.isJsonObject()) {
                this.IlIIII(jsonElement.getAsJsonObject(), lllIIlI2);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.IIllIl();
    }

    private Category lIll(String string) {
        Category[] categoryArray = Category.values();
        try {
            int n = Integer.parseInt(string);
            if (n >= 0 && n < categoryArray.length) {
                return categoryArray[n];
            }
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        if ("CLIENT".equalsIgnoreCase(string)) {
            return Category.lI;
        }
        for (Category category : categoryArray) {
            if (!IlllIlIl.I(category, string)) continue;
            return category;
        }
        return Category.IIl;
    }

    private static JsonObject llII(JsonObject jsonObject) {
        if (jsonObject != null) {
            if (jsonObject.has("settings")) {
                return jsonObject.getAsJsonObject("settings").deepCopy();
            }
        }
        return new JsonObject();
    }

    static boolean llIl(JsonObject jsonObject, long l2) {
        return LegacyConfigMigration.IIllll(jsonObject, l2) != null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static long lllI(long l2) {
        if (l2 == IIIIIl) {
            return lllll;
        }
        if (l2 == I) {
            return lllI;
        }
        if (l2 == lIII) return IIIlII;
        if (l2 == llll) {
            return IIIlII;
        }
        if (l2 == lIIll) {
            return lIIl;
        }
        if (l2 == llI) {
            return IIlII;
        }
        if (l2 == lIIII) {
            return lIllI;
        }
        if (l2 == Illl) {
            return llIII;
        }
        if (l2 != lIIlI) {
            if (l2 != IIIl) return l2;
            return llIlI;
        }
        return IlIll;
    }

    public void llll() {
        if (this.llIIl == null) {
            return;
        }
        for (Path path : new Path[]{this.IlIII(), this.IlII()}) {
            if (path == null || !Files.isDirectory(path, new LinkOption[0])) continue;
            try (Stream<Path> stream = Files.list(path);){
                if (!stream.findAny().isEmpty()) continue;
                Files.deleteIfExists(path);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public void IIIII() {
        if (this.IIIlIl != null && this.IIIlIl.isOpen()) {
            if (this.IlIlI) {
                try {
                    this.IIIlIl.close();
                }
                catch (IOException iOException) {
                    // empty catch block
                }
            }
            this.IIIlIl = null;
            this.IlIlI = false;
        }
    }

    private Path IIIIl() {
        FileSystem fileSystem = this.IIlIll();
        if (fileSystem != null) {
            return fileSystem.getPath(l.IIII(), new String[0]);
        }
        return null;
    }

    private void IIIll() {
        Path path;
        Path path2 = this.IIlllI();
        if (path2 == null || !Files.exists(path2, new LinkOption[0])) {
            path = this.I();
            Path path3 = path2 = path == null ? null : path.resolve(lII.IIII());
        }
        if (!(path2 != null && Files.exists(path2, new LinkOption[0]) || Files.exists(path2 = this.IIIIl.resolve(IIllI.IIII()), new LinkOption[0]))) {
            return;
        }
        try {
            path = (JsonElement)lIlII.fromJson(Files.readString(path2), JsonElement.class);
            if (path == null || !path.isJsonObject()) {
                return;
            }
            JsonObject jsonObject = path.getAsJsonObject();
            if (!jsonObject.has("storageLocation")) {
                return;
            }
            this.IIlIIl = this.lII(jsonObject.get("storageLocation").getAsString());
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private boolean IIlII(Path path, Path path2, boolean bl) {
        if (path == null || path2 == null || !Files.isRegularFile(path, new LinkOption[0])) {
            return false;
        }
        if (path.toAbsolutePath().normalize().equals(path2.toAbsolutePath().normalize())) {
            return false;
        }
        boolean bl2 = false;
        try {
            Files.createDirectories(path2.getParent(), new FileAttribute[0]);
            if (!Files.exists(path2, new LinkOption[0])) {
                if (path.getFileSystem().equals(path2.getFileSystem())) {
                    Files.copy(path, path2, new CopyOption[0]);
                } else {
                    Files.writeString(path2, (CharSequence)Files.readString(path), new OpenOption[0]);
                }
                bl2 = true;
            }
            if (bl && bl2) {
                Files.deleteIfExists(path);
            }
        }
        catch (IOException iOException) {
            return false;
        }
        return bl2;
    }

    static String IIlIl(long l2) {
        String string;
        String string2 = string = Long.toUnsignedString(l2, 16);
        String string3 = "m0000000000000000".substring(0, 17 - string.length());
        return string3 + string2;
    }

    private String IIllI(IIlIllIl iIlIllIl) {
        return (iIlIllIl != IIlIllIl.lI ? IIIIII : IlII).IIII();
    }

    private void IIlll() {
        Path path = this.IIlllI();
        if (path == null) {
            return;
        }
        JsonObject jsonObject = new JsonObject();
        if (this.IIlIIl != null) {
            jsonObject.addProperty("storageLocation", (Number)this.IIlIIl.ordinal());
        }
        try {
            Files.createDirectories(path.getParent(), new FileAttribute[0]);
            Files.writeString(path, (CharSequence)lIlII.toJson((JsonElement)jsonObject), new OpenOption[0]);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Path IlIII() {
        Path path = this.llllI(IIlIllIl.lI);
        if (path == null) {
            return null;
        }
        Path path2 = path.resolve(IlII.IIII());
        return path2;
    }

    private Path IlIIl() throws IOException {
        Path path2 = this.IllIIl();
        if (path2 == null || !Files.isDirectory(path2, new LinkOption[0])) {
            return null;
        }
        try (Stream<Path> stream = Files.list(path2);){
            Path path3 = stream.filter(path -> Files.isRegularFile(path, new LinkOption[0])).filter(path -> path.getFileName().toString().endsWith(".bak")).filter(path -> !path.getFileName().toString().contains(".before-web-restore.")).max(Comparator.comparingLong(this::lIl)).orElse(null);
            return path3;
        }
    }

    private void IlIlI(Path path3, Path path4, boolean bl) {
        if (path3 == null || path4 == null || !Files.isDirectory(path3, new LinkOption[0])) {
            return;
        }
        try {
            Files.createDirectories(path4, new FileAttribute[0]);
            try (Stream<Path> stream = Files.list(path3);){
                stream.filter(path -> Files.isRegularFile(path, new LinkOption[0])).forEach(path2 -> this.IIlII((Path)path2, path4.resolve(path2.getFileName()), bl));
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    public InputUtil.Key IlIll() {
        return this.llllI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllII(Path path) {
        if (path == null) return;
        if (Files.isDirectory(path, new LinkOption[0])) {
            this.lIIIl(path);
            this.IllllI(path, ll, IIIIII, true);
            this.lIlll(path, true);
            this.IlllIl(path);
            return;
        }
    }

    private static long IllIl(String string) {
        if (string != null && string.length() == 17 && string.charAt(0) == 'm') {
            try {
                return Long.parseUnsignedLong(string.substring(1), 16);
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        return StringFactory.I(string);
    }

    public boolean IlllI() {
        return false;
    }

    static void Illll(JsonObject jsonObject, long l2, JsonElement jsonElement) {
        jsonObject.add(LegacyConfigMigration.IIlIl(l2), jsonElement);
    }

    public Path lIIII() {
        return this.lIlII(IIlIllIl.lI);
    }

    /*
     * Enabled aggressive block sorting
     */
    public LegacyConfigMigration() {
        this.IIIII = Category.IIl;
        this.llllI = lIIllllI.IlIIIll(344);
        this.lIIIl = InputUtil.UNKNOWN_KEY;
        this.lIl = new JsonObject();
        this.IIIll();
        this.IIIIII();
        this.IIIIlI();
        this.IIlIIl = IIlIllIl.lI;
        this.IIlll();
        this.IIlI();
        this.IIIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIIl(Path path) {
        Path path2 = this.IllI();
        if (path == null) return;
        if (path2 == null) {
            return;
        }
        if (!path.toAbsolutePath().normalize().equals(path2.toAbsolutePath().normalize())) {
            this.IIlII(path.resolve(lI.IIII()), this.lIlII(IIlIllIl.lI), true);
            this.IlIlI(path.resolve(IlII.IIII()), this.IlIII(), true);
            this.IlIlI(path.resolve(lIlll.IIII()), this.IlIII(), true);
            this.IlIlI(path.resolve(lIll.IIII()), this.llIIl(), true);
            this.IlIlI(path.resolve(IlII.IIII()).resolve(lIll.IIII()), this.llIIl(), true);
            this.IlIlI(path.resolve(Il.IIII()), this.IlII(), true);
            this.IlIlI(path.resolve(llIl.IIII()), this.IlII(), true);
            this.IIlII(path.resolve(IlIl.IIII()), this.IIlllI(), true);
            this.IlllIl(path.resolve(IlII.IIII()).resolve(lIll.IIII()));
            this.IlllIl(path.resolve(IlII.IIII()));
            this.IlllIl(path.resolve(lIlll.IIII()));
            this.IlllIl(path.resolve(lIll.IIII()));
            this.IlllIl(path.resolve(Il.IIII()));
            this.IlllIl(path.resolve(llIl.IIII()));
            this.IlllIl(path);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public JsonObject lIIlI() {
        JsonObject jsonObject;
        if (this.lIl != null) {
            jsonObject = this.lIl.deepCopy();
            return jsonObject;
        }
        jsonObject = new JsonObject();
        return jsonObject;
    }

    private static boolean lIIll(JsonObject jsonObject) {
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Path lIlII(IIlIllIl iIlIllIl) {
        Path path = this.llllI(iIlIllIl);
        if (path == null) {
            return null;
        }
        Path path2 = path.resolve(this.lll(iIlIllIl));
        return path2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void lIlIl(JsonObject jsonObject) {
        LegacyConfigMigration.Illl(jsonObject, IIIIll);
        if (!LegacyConfigMigration.llIl(jsonObject, IIIllI)) {
            return;
        }
        JsonObject jsonObject2 = LegacyConfigMigration.lllII(jsonObject, IIIllI);
        if (jsonObject2 == null) {
            LegacyConfigMigration.Illl(jsonObject, IIIllI);
            return;
        }
        JsonObject jsonObject3 = jsonObject2.has("settings") ? jsonObject2.getAsJsonObject("settings") : new JsonObject();
        boolean bl = LegacyConfigMigration.lIII(jsonObject2);
        if (!LegacyConfigMigration.llIl(jsonObject, Illll)) {
            LegacyConfigMigration.Illll(jsonObject, Illll, (JsonElement)LegacyConfigMigration.IllIlI(jsonObject2, jsonObject3, bl));
        }
        LegacyConfigMigration.Illl(jsonObject, IIIllI);
    }

    public void lIllI(lllIIlI lllIIlI2) {
        Path path;
        JsonObject jsonObject = this.IlIl(lllIIlI2);
        IlIlIII ilIlIII = this.llIIl;
        if (ilIlIII != null) {
            if (!ilIlIII.I()) {
                return;
            }
            if (ilIlIII.II(IIIlI.toJson((JsonElement)jsonObject))) {
                this.IIllIl();
                return;
            }
        }
        if ((path = this.lIIII()) == null) {
            return;
        }
        try {
            Files.createDirectories(path.getParent(), new FileAttribute[0]);
            Files.writeString(path, (CharSequence)lIlII.toJson((JsonElement)jsonObject), new OpenOption[0]);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlll(Path path3, boolean bl) {
        if (path3 == null) {
            return;
        }
        Path path4 = this.lIlII(IIlIllIl.lI);
        if (path4 == null) return;
        if (!Files.exists(path4, new LinkOption[0])) {
            Stream<String> stream = Stream.of(IIlll.IIII(), IIlIl.IIII(), StringFactory.IIl("kZhbihpWRA/ZAoxWAQ=="));
            Path path5 = path3;
            Objects.requireNonNull(path5);
            stream.map(path5::resolve).filter(path -> Files.isRegularFile(path, new LinkOption[0])).max(Comparator.comparingLong(this::lIl)).ifPresent(path2 -> this.IIlII((Path)path2, path4, bl));
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void llIII(InputUtil.Key key) {
        this.llllI = key == null ? InputUtil.UNKNOWN_KEY : key;
    }

    public Path llIIl() {
        Path path = this.llllI(IIlIllIl.lI);
        return path != null ? path.resolve(lIll.IIII()) : null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void llIlI(InputUtil.Key key) {
        this.lIIIl = key != null ? key : InputUtil.UNKNOWN_KEY;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Path llIll(IIIlIIIII iIIlIIIII) {
        block3: {
            String string;
            block2: {
                string = System.getenv(Ill.IIII());
                if (string != null && !string.isBlank()) break block2;
                string = System.getProperty(III.IIII());
                if (string == null) return null;
                if (string.isBlank()) break block3;
            }
            return Path.of(string, iIIlIIIII.IIII());
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static JsonObject lllII(JsonObject jsonObject, long l2) {
        JsonElement jsonElement = LegacyConfigMigration.IIllll(jsonObject, l2);
        if (jsonElement == null) return null;
        if (!jsonElement.isJsonObject()) {
            return null;
        }
        JsonObject jsonObject2 = jsonElement.getAsJsonObject();
        return jsonObject2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Path llllI(IIlIllIl iIlIllIl) {
        if (iIlIllIl == null) {
            return null;
        }
        switch (iIlIllIl.ordinal()) {
            case 2: {
                Path path = this.IIIIl();
                return path;
            }
            case 1: {
                Path path = this.IIIIl.resolve(IIIll.IIII());
                return path;
            }
            case 3: {
                Path path = this.IllI();
                return path;
            }
            case 0: {
                Path path = this.IlIII;
                return path;
            }
        }
        throw new MatchException(null, null);
    }

    public IIlIllIl lllll() {
        return this.IIlIIl;
    }

    private void IIIIII() {
        try {
            Path path;
            Path path2 = this.llllI(IIlIllIl.lI);
            if (path2 == null) {
                return;
            }
            Files.createDirectories(path2, new FileAttribute[0]);
            DosFileAttributeView dosFileAttributeView = Files.getFileAttributeView(path2, DosFileAttributeView.class, new LinkOption[0]);
            if (dosFileAttributeView != null) {
                dosFileAttributeView.setHidden(false);
                dosFileAttributeView.setSystem(false);
            }
            if (this.llIIl == null) {
                Path path3;
                path = this.IlIII();
                if (path != null) {
                    Files.createDirectories(path, new FileAttribute[0]);
                }
                if ((path3 = this.IlII()) != null) {
                    Files.createDirectories(path3, new FileAttribute[0]);
                }
            }
            if ((path = this.llIIl()) != null) {
                Files.createDirectories(path, new FileAttribute[0]);
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String IIIIIl() {
        if (!this.IlI) return null;
        String string = LegacyConfigMigration.IIlIl(this.llIll);
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIlI() {
        this.IllllI(this.llllI(IIlIllIl.Il), ll, IIIIII, true);
        this.lIlll(this.IlIII, true);
        this.IllllI(this.IIIIl.resolve(llII.IIII()), ll, IIIIII, true);
        this.IllllI(this.llllI(IIlIllIl.I), ll, IIIIII, true);
        this.IllII(this.IlIII.resolve(IllIl.IIII()));
        this.IllII(this.IlIII.resolve(IlllI.IIII()));
        this.IllII(this.IIIIl.resolve(IllIl.IIII()));
        this.IllII(this.IIIIl.resolve(IlllI.IIII()));
        this.IllllI(this.IIIIl(), ll, IIIIII, false);
        this.IlIIll();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IIIIll(JsonObject jsonObject) {
        if (!LegacyConfigMigration.llIl(jsonObject, lIIl)) {
            return;
        }
        JsonObject jsonObject2 = LegacyConfigMigration.lllII(jsonObject, lIIl);
        if (jsonObject2 == null) return;
        if (!jsonObject2.has("settings")) {
            return;
        }
        JsonObject jsonObject3 = jsonObject2.getAsJsonObject("settings");
        long l2 = lIlI.llII();
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

    /*
     * Enabled aggressive block sorting
     */
    public String IIIlII(IIlIllIl iIlIllIl) {
        if (iIlIllIl == IIlIllIl.II) {
            Path path = this.IIII();
            if (path == null) {
                return "JAR not found";
            }
            String string = l.IIII();
            String string2 = ":";
            String string3 = path.getFileName().toString();
            String string4 = string3 + string2 + string;
            return string4;
        }
        Path path = this.llllI(iIlIllIl);
        if (path == null) return "Unavailable";
        String string = path.toAbsolutePath().normalize().toString();
        return string;
    }

    public Path IIIlIl() {
        return this.IlIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    public Path IIIllI(IIlIllIl iIlIllIl) {
        Path path = this.llllI(iIlIllIl);
        if (path == null) return null;
        Path path2 = path.resolve(this.IIllI(iIlIllIl));
        return path2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static void IIlIII(JsonObject jsonObject, long l2, long l3) {
        JsonElement jsonElement = LegacyConfigMigration.IIllll(jsonObject, l2);
        if (jsonElement != null && !LegacyConfigMigration.llIl(jsonObject, l3)) {
            LegacyConfigMigration.Illll(jsonObject, l3, jsonElement);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public Path IIlIIl(lllIIlI lllIIlI2) throws IOException {
        Path path = this.IlIIl();
        if (path != null) {
            Path path2 = this.lIIII();
            if (path2 == null) {
                throw new IOException("No config file is available");
            }
            Files.createDirectories(path2.getParent(), new FileAttribute[0]);
            Files.copy(path, path2, StandardCopyOption.REPLACE_EXISTING);
            this.IIl(lllIIlI2);
            return path;
        }
        throw new IOException("No ClickGUI backup is available");
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIlIlI(JsonObject jsonObject) {
        this.lIl = jsonObject == null ? new JsonObject() : jsonObject.deepCopy();
    }

    private FileSystem IIlIll() {
        if (this.IIIlIl != null && this.IIIlIl.isOpen()) {
            return this.IIIlIl;
        }
        Path path = this.IIII();
        if (path == null || !Files.exists(path, new LinkOption[0])) {
            return null;
        }
        try {
            String string = String.valueOf(path.toUri());
            String string2 = "jar:";
            URI uRI = URI.create(string2 + string);
            try {
                this.IIIlIl = FileSystems.newFileSystem(uRI, Map.of("create", "true"));
                this.IlIlI = true;
            }
            catch (FileSystemAlreadyExistsException fileSystemAlreadyExistsException) {
                this.IIIlIl = FileSystems.getFileSystem(uRI);
                this.IlIlI = false;
            }
            return this.IIIlIl;
        }
        catch (Exception exception) {
            return null;
        }
    }

    private void IIllIl() {
        Path path = this.lIIII();
        if (path == null) {
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Path IIlllI() {
        Path path = this.IllI();
        if (path == null) {
            return null;
        }
        Path path2 = path.resolve(IlIl.IIII());
        return path2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static JsonElement IIllll(JsonObject jsonObject, long l2) {
        if (jsonObject == null) {
            return null;
        }
        String string = LegacyConfigMigration.IIlIl(l2);
        if (!jsonObject.has(string)) {
            Map.Entry entry;
            Iterator iterator = jsonObject.entrySet().iterator();
            do {
                if (!iterator.hasNext()) return null;
            } while (StringFactory.I((String)(entry = (Map.Entry)iterator.next()).getKey()) != l2);
            return (JsonElement)entry.getValue();
        }
        return jsonObject.get(string);
    }

    private void IlIIII(JsonObject jsonObject, lllIIlI lllIIlI2) {
        try {
            JsonObject jsonObject2;
            if (jsonObject.has("panel") || jsonObject.has("clickGui")) {
                JsonObject jsonObject3 = jsonObject2 = jsonObject.has("panel") ? jsonObject.getAsJsonObject("panel") : jsonObject.getAsJsonObject("clickGui");
                if (jsonObject2.has("category")) {
                    this.IIIII = this.lIll(jsonObject2.get("category").getAsString());
                }
                if (jsonObject2.has("module")) {
                    this.llIll = LegacyConfigMigration.lllI(LegacyConfigMigration.IllIl(jsonObject2.get("module").getAsString()));
                    this.IlI = true;
                }
                if (jsonObject2.has("bind")) {
                    this.llllI = lIIllllI.lIIlIl(jsonObject2.get("bind"));
                } else if (jsonObject2.has("keyCode")) {
                    this.llllI = lIIllllI.IlIIIll(jsonObject2.get("keyCode").getAsInt());
                }
                if (jsonObject2.has("clickGuiBind")) {
                    this.lIIIl = lIIllllI.lIIlIl(jsonObject2.get("clickGuiBind"));
                }
            }
            if (jsonObject.has(LegacyConfigMigration.IlIIIl()) && jsonObject.get(LegacyConfigMigration.IlIIIl()).isJsonObject()) {
                this.lIl = jsonObject.getAsJsonObject(LegacyConfigMigration.IlIIIl()).deepCopy();
            } else if (jsonObject.has(LegacyConfigMigration.lI()) && jsonObject.get(LegacyConfigMigration.lI()).isJsonObject()) {
                this.lIl = jsonObject.getAsJsonObject(LegacyConfigMigration.lI()).deepCopy();
            }
            if (jsonObject.has("modules")) {
                jsonObject2 = jsonObject.getAsJsonObject("modules");
                LegacyConfigMigration.IIlIII(jsonObject2, lllIl, IIl);
                LegacyConfigMigration.IIlIII(jsonObject2, IIIIIl, lllll);
                LegacyConfigMigration.IIlIII(jsonObject2, I, lllI);
                LegacyConfigMigration.IIlIII(jsonObject2, lIIll, lIIl);
                LegacyConfigMigration.IIlIII(jsonObject2, llI, IIlII);
                LegacyConfigMigration.IIlIII(jsonObject2, lIIII, lIllI);
                LegacyConfigMigration.IIlIII(jsonObject2, Illl, llIII);
                LegacyConfigMigration.IIlIII(jsonObject2, lIIlI, IlIll);
                LegacyConfigMigration.IIlIII(jsonObject2, IIIl, llIlI);
                LegacyConfigMigration.lIIl(jsonObject2);
                LegacyConfigMigration.lIlIl(jsonObject2);
                LegacyConfigMigration.IlllII(jsonObject2);
                LegacyConfigMigration.l(jsonObject2);
                LegacyConfigMigration.IIIIll(jsonObject2);
                for (ModuleBase moduleBase : lllIIlI2.IIIIIll()) {
                    JsonObject jsonObject4 = LegacyConfigMigration.lllII(jsonObject2, moduleBase.IlIIllI());
                    if (jsonObject4 == null) continue;
                    moduleBase.IIllIl(jsonObject4);
                    moduleBase.IIllIll(jsonObject4);
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private static String IlIIIl() {
        return "clickGuiLayout";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String IlIIlI(IIlIllIl iIlIllIl) {
        switch (iIlIllIl.ordinal()) {
            case 3: {
                String string = IIlIII.IIII();
                return string;
            }
            case 2: {
                return "Inside JAR";
            }
            case 1: {
                return "Client folder";
            }
            default: {
                throw new MatchException(null, null);
            }
            case 0: 
        }
        return ".minecraft/config";
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIll() {
        this.lIIIl(LegacyConfigMigration.llIll(IIlI));
        this.lIIIl(LegacyConfigMigration.llIll(IIIlll));
        this.IllII(LegacyConfigMigration.llIll(IllIl));
        this.IllII(LegacyConfigMigration.llIll(IlllI));
        Path path = this.I();
        Path path2 = this.IllI();
        if (path == null) return;
        if (path2 != null) {
            boolean bl = path.toAbsolutePath().normalize().equals(path2.toAbsolutePath().normalize());
            this.IllllI(path, IIII, IlIIl, true);
            this.IIlII(path.resolve(lII.IIII()), this.IIlllI(), true);
            if (bl) return;
            this.IlllIl(path);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IlIlII(IIlIllIl iIlIllIl, lllIIlI lllIIlI2) {
        this.IIlIIl = iIlIllIl;
        if (this.IIlIIl != IIlIllIl.lI) {
            this.IIlIIl = IIlIllIl.lI;
        }
        this.IIlll();
        Path path = this.lIIII();
        if (path == null || !Files.exists(path, new LinkOption[0])) {
            this.lIllI(lllIIlI2);
            return;
        }
        this.IIl(lllIIlI2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 15406;
        String string = "\uc0e5\uc089\ubffa\ubffd\uc0e5\ubffe\ubffe\uc0b6\uc0aa\uc0cb\uc094\uc091\u2c4d\u2c21\u3232\u3235\u2c4d\u3236\u3236\u2d7e\u3242\u2c63\u2c5c\u2c59\u258a\u258e\u258d\u256b\u25a0\u2596\u2574\u2574\u2568\u25e6\u2569\u256f\u256d\u2584\u25a2\u256f\u25bf\u25d7\u25df\u25db\u25a3\u25ca\u25bd\u25da\u256c\u25ca\u25d9\u2585\u25b8\u25ce\u256f\u256a\u25cf\u2589\u258f\u25db\u2569\u25d9\u256d\u256a\u2597\u25ca\u25ca\u25d3\ua586\uaa42\uaa41\ua5a7\uaa2c\uaa2a\uaa2a\ua5a7\ua465\uaa45\uaa2f\ua44a\ua461\ua448\ua586\ua463\ua44a\uaa36\uaa30\uaa36\uaa2b\uaa42\uaa37\ua455\ua5a6\uaa36\uaa45\ua463\ua460\ua450\ua453\uaa36\uaa35\ua463\uaa2f\ua465\ua464\ua463\ua405\ua460\ua402\uaa42\uaa41\ua43f\u8d2e\u8c98\u8f64\u8d33\u8d2b\u8f60\u8d2a\u8d30\uc0cd\uc0a4\uc0e2\uc0a3\uc0a2\uc0c1\uc0ac\uc0c5\uc0aa\uc0c3\uc0d0\uc0aa\uc0c0\uc0d1\ubff8\uc0cf\uc0c3\ubff8\uc0a5\uc0c8\u2f02\u2f05\u2c7f\u2c7f\u4e2b\u483d\u4e37\u4e37\ucc5e\ucc48\ucc22\ucc22\ua549\ua508\ua4f2\ua4ee\ua524\ua50f\ua555\ua555\udb21\udb60\ud87a\ud942\udb4d\udb48\ud87a\ud936\ud886\ud886\ud937\ud931\ud934\ud87a\udb20\ud945\ud928\udb54\udb52\ud92e\udb49\udb60\udb55\ud937\ud945\udb54\ud929\udb5d\u996d\u9984\u99c5\u998c\u9969\u99a0\u9984\u9976\u99a3\u99e6\u99af\u9977\u9988\u99c0\u9984\u99a5\u998d\u98fd\u9988\u998c\u996f\u99dd\u9906\u9995\u6503\u6b2d\u655e\u6566\u64ee\u6500\u655a\u6512\u650e\u6559\u6b35\u6b35\u91ef\u9041\u9212\u920a\u9202\u91ec\u9216\u925e\u9222\u9215\u9379\u9379\uc368\uc306\uc395\uc38d\uc385\uc36b\uc391\uc3d9\uc3a5\uc392\uc2fe\uc2fe\u1c81\u1caf\u1cdc\u1ca4\u1c6c\u1c82\u1cd8\u1c90\u1c8c\u1cdb\u1cb7\u1cb7\u0e63\u0e0d\u0f7e\u0f86\u0e4e\u0e60\u0f7a\u0c32\u0c2e\u0f79\u0e15\u0e15\u1b8f\u1be1\u1b72\u1b6a\u1ba2\u1b8c\u1b76\u1bbe\u1b82\u1b75\u1b19\u1b19\u1b33\u153d\u154e\u1556\u1a7e\u1b30\u154a\u1562\u1a9e\u1549\u1505\u1505\ue33c\ue30d\ue33f\ue305\ue33e\ue33f\ue2f7\ue310\ue315\ue366\ue12f\ue12a\u9096\u901e\u90bd\u906a\u9096\u90b9\u901e\u9082\u90ba\u908c\u90be\u9026\ufd8d\ufdbb\ufda5\ufd80\ufd88\ufd83\ufdc7\ufd82\u34ab\u3406\u34c7\u34b7\u34ab\u34d7\u34bb\u34bb\u2560\u2508\u2565\u2a99\u2563\u2555\u2a87\u254a\u2b2f\u2b2f\u2b2a\u250c\u2a7c\u2b37\u2a7b\u2a99\u63c3\u63e0\u63cc\u62fb\u6307\u63c8\u63cf\u6377\u633c\u630a\u62f4\u6311\u6339\u6312\u6316\u6313\u6311\u62f7\u612d\u612d\u2b0d\u2b39\u2b23\u2b05\u2b0d\u2b0b\u2b05\u2b00\u2b05\u2af2\u289e\u289e\u3c31\u3e65\u3f7f\u3f99\u3c31\u3c37\u3f99\u3f9c\u3f99\u3e4e\u3e02\u3e02\u150a\u153e\u1524\u1502\u150a\u150c\u1502\u1547\u1502\u14f5\u1a99\u1a99\uff0e\uff60\ufef3\ufeeb\uff23\uff0d\ufef7\uff3f\uff03\ufef4\ufc98\ufc98\ub23b\ub37b\ub1f6\ub1ea\ub1f3\ub25c\ub1ea\ub20a\u2bd8\u2bd4\u2bc7\u2b80\u2bd8\u2b83\u2b83\u2b6b\u2b77\u2b96\u2bc9\u2bcc\u6ba5\u6b8b\u6bbd\u6b6d\u6ba2\u6bb9\u6bbd\u6b68\u6b6a\u6ba2\u6be0\u6b68\u6b83\u6b82\u6b8f\u6b6a\u6bba\u6bdf\u6b6f\u6b85\u38b3\u3871\u37fe\u386f\u38b3\u38d2\u38c2\u37fc\ue0eb\ue687\ue114\ue113\ue0eb\ue110\ue110\ue158\ue124\ue105\ue67a\ue67f\u8159\u8155\u8146\u8101\u8159\u8102\u8102\u80ea\u80f6\u8117\u8148\u814d\uf8bc\uf8b1\uf8e7\uf8c7\uf8bf\uf8bd\uf8bd\uf894\uf893\uf891\uf8e6\uf88c\uf8e6\uf8b0\uf8b0\uf8db\uf8e7\uf871\uf86f\uf894\u2794\u2719\u276f\u278f\u2797\u2795\u2795\u27bc\u27bb\u27b9\u276e\u2784\u276e\u2718\u2718\u2773\u276f\u27d9\u27e7\u27bc\u3088\u3097\u3085\u3071\u30de\u3071\u308f\u306c\u3075\u3071\u30de\u306c\u3083\u3069\u301c\u306e\u30bc\u30e0\u306b\u306b\u30de\u30e7\u3093\u3019\u4616\u479b\u45ed\u460d\u4615\u4617\u4617\u463e\u4639\u463b\u45ec\u4646\u45ec\u479a\u479a\u45f1\u45ed\u465b\u4625\u463e\u39f0\u3b7c\u3a0f\u3a08\u39f0\u3a0b\u3a0b\u3a23\u3a5f\u3a3e\u3841\u3844\uce4d\uce21\ucc32\ucc35\uce4d\ucc36\ucc36\ucf7e\ucc42\uce63\uce5c\uce59\u57dc\u57d0\u5783\u5784\u57dc\u57c7\u57c7\u576f\u5773\u5792\u57cd\u57c8\u59fc\u5a70\u5ae3\u5ae4\u59fc\u5a27\u5a27\u5acf\u5ad3\u5ab2\u5a6d\u5a68\uaa89\uaab8\uaa8a\uaa90\uaa8b\uaa8a\uaaa2\uaa85\uaa80\uaa73\uaacd\uaab8\uaa73\uaa8d\uaada\uaa85\uaa73\uaa83\uaa1f\uaa1f\u92ba\u92b6\u92a5\u92a2\u92ba\u92a1\u92a1\u9289\u9295\u9274\u92ab\u92ae\u9745\u90e9\u969a\u969d\u9745\u969e\u969e\u9156\u914a\u972b\u90f4\u90f1\u2b3f\u2b10\u2b38\u2af1\u2b38\u2b5f\u2b12\u2878\u2aea\u2af5\u2af5\u287e\u2b16\u2b0d\u2941\u2941\udb68\udb6b\udb8f\udbb0\udb6a\udb83\udb6d\udbad\udb93\udb6e\udbb4\udbb4\u8517\u8555\u8516\u8556\u8511\u850b\u8516\u855d\u84eb\u8508\u84f1\u8a99\u853e\u8513\u8511\u854f\u7099\u7349\u7323\u7323\uf033\uf032\uf256\uf37d\uf1f3\uf262\uf044\uf249\uf252\uf3a6\uf029\uf252\uf262\uf1f4\uf030\uf248\uf263\uf037\uf1ed\uf1ed\u0017\uffef\u0015\ufff3\\]] \uffedGW\ufff3G?ZH\ue489\ue48d\ue48e\ue468\ue48b\ue495\ue46b\ue4d8\ue468\ue495\ue4d8\ue48a\ue46d\ue4df\ue474\ue477\ue4b9\ue4d9\ue481\ue4d9\ue4a1\ue474\ue4cf\ue4b8\ue4bb\ue4c7\ue468\ue4c6\ue4bb\ue4cc\ue4b8\ue4c6\ue4a1\ue4da\ue4ba\ue469\ue46a\ue4bc\ue4ce\ue4db\ue4cf\ue48a\ue4d0\ue4d0\uaef5\uaef1\uaef2\uaf14\uaf3f\uaee9\uaf0b\uaf0b\uaf17\uaf39\uaf16\uaf10\uaf12\uaf5b\uaf3d\uaf10\uaf20\uad28\uaf00\uaf04\uaf3d\uad35\uaef7\uaf14\uaf17\uaf08\uaf3e\uaf08\uaf09\uaf3d\uaef6\uaf05\uaf3d\uaf10\uaf12\uaf00\ufc66\ufc0d\ufbeb\ufc3a\ufc15\ufc5a\ufc50\ufc50\u099e\u0817\u0e29\u0e31\u099d\u0e32\u0812\u0e30\uc9e7\uc984\uc977\uc9bf\uc9a0\uc96c\uc9d0\uc9d0\u0364\u0325\u033f\u0303\u0309\u0322\u0098\u0098\u82ef\u830c\u8320\u82f7\u82eb\u8324\u8323\u807b\u5a7f\u54f7\u5a7a\u5a86\u5a7c\u5b2a\u5a98\u5b35\u5550\u5550\u5557\u54ef\uf360\uf143\uf12f\uf098\uf364\uf12b\uf12c\uf314\u213b\u2158\u2114\u2103\u213f\u2110\u2117\u272f\u9064\u900c\u9061\ub19d\ub1a7\u9051\ub643\u904e\ub62b\ub62b\ub62c\u9014\u67a2\u67ca\u6769\u67be\u67a2\u676d\u67ca\u6776\u676e\u67d8\u676a\u67d2\u1a64\u1a0c\u182f\u1b78\u1a64\u182b\u1a0c\u1830\u1828\u1b9e\u182c\u1a14\u0c7a\u0f4c\u0d32\u0f57\u0c7f\u0f54\u0f50\u0f55\u3ca5\u3c73\u3c8d\u3c68\u3ca0\u3c6b\u3c6f\u3c6a\u9ad4\u9a19\u9ad8\u9ac8\u9ad4\u9aa8\u9aa4\u9aa4\u5353\u509e\u535f\u534f\u5353\u512f\u5323\u5323\uc69f\uc111\uc742\uc67a\uc152\uc14c\uc72e\uc730\uc732\uc735\uc109\uc109\udc5d\udc53\udc00\udc38\udc10\udc0e\udbec\udbf2\udbf0\udbf7\udc4b\udc4b\u6512\u6a9a\u6517\u650b\u6511\u6567\u64f5\u6558\u653d\u653d\u6538\u6a9e\u64ee\u6505\u64e9\u650b\ub43b\uba33\ub43e\ub402\ub438\ub3ee\ub45c\ub3f1\ub414\ub414\ub411\uba37\ub467\ub40c\ub420\ub402\u6649\u677f\u6661\u6444\u664c\u6787\u6443\u6786\u6444\u6662\u6658\u6658\ua285\ua293\ua26d\ua288\ua280\ua28b\ua28f\ua28a\ua288\ua26e\ua2b4\ua2b4\u50ae\u50c6\u50ab\u50b7\u50ad\u4ffb\u50c9\u50c4\u50e1\u50e1\u50e4\u5084\u50d0\u501a\u5019\u50e4\u50d4\u50c0\u50b0\u50be\ua3ab\ua36a\ua3c6\ua3be\ua381\ua382\ua372\ua38f\ua38b\ua382\ua3a8\ua388\ua3a2\ua3a4\ua3d8\ua3bb\ua3db\ua3a4\ua3a9\ua393\ua3c6\ua3af\ua3b2\ua3b7\u06d6\u0696\u061b\u0627\u061e\u06b1\u0627\u0607\u0606\u06c1\u06d2\u06aa\u06c1\u05f9\u06d7\u06e0\u05fb\u06b2\u068e\u068e\u8011\u7fe8\u8012\u803a\u805e\u7ff0\u8053\u7ff1\u8047\u8046\u8023\u8050\u803d\u8025\u804f\u804f\u0955\u0e9f\u095e\u0f28\u0952\u0e7d\u0e7a\u094e\u0e7a\u0ea7\u0f2c\u094a\u0f2b\u0f45\u0f29\u0f31\u0e7e\u094b\u0951\u0f31\u0954\u0f45\u0e86\u0922\udc0c\udc66\udda7\udbf1\udc0b\udc04\udc03\udc17\udc47\udbf7\udc60\udc05\udbf1\udc63\udc66\udbe8\udbee\udbf7\udd9b\udd9b\u0d63\u0d0b\u1328\u127f\u0d64\u0d49\u0d13\u0d13\u282e\u2a4e\u2b9d\u2a65\u282d\u2b7f\u2b7f\u2a53\u2ba6\u2840\u2a3a\u2a3a\u6855\u6815\u6998\u6864\u699d\u6e32\u6864\u6e44\uad52\uad54\ub342\ub332\ub29d\ub286\ub342\ub337\ub335\ub298\uad4d\uad14\ub286\uad10\uad4c\ub331\ub287\uad57\uad62\ub32c\ub29a\ub32d\uad57\uad09\ue9c8\ue9c5\ue8fa\ue91d\ue9e2\ue9ad\ue9cf\ue9b4\ue91f\ue9d4\ue9c3\ue8f9\ue8fe\ue9b6\ue9cc\ue9c2\ue8fe\ue9c8\ue8f8\ue9c2\uad48\uad08\uad65\ub299\uad60\ub32f\ub299\ub279\ub278\ub279\uad66\ub334\ub27a\uad08\ub287\ub29e\ub27a\uad14\uad4f\ub299\ub2a7\ub32c\uad10\uad10\ud232\ud236\ucbf7\ucc4e\ucd7a\ucbf7\ucd7a\ucc39\ucc51\ucc54\ucd7f\ucc55\ucc61\ud241\ucbeb\ucbeb\u9edb\u9edf\u9e1e\u9ec7\u9e93\u9e1e\u9e93\u9e94\u9ebd\u9ee7\u9eb8\u9e6b\u9e6c\u9e1a\u9e8b\u9e8c\u9e77\u9ebe\u9ee2\u9ee2\u678a\u6781\u67a3\u676d\u67a3\u6769\u6793\u67bd\u67be\u67bf\u67e6\u67a0\u6784\u67ba\u67d6\u67d6\u6c2b\u6e60\u6c42\u6e4c\u6c42\u6e48\u6c32\u6f9c\u6f9f\u6f9e\u6c2f\u6f78\u6f98\u6dee\u6f7d\u6df7\ue6b7\ue6e3\ue5fe\ue61c\ue5fa\ue6cb\ue6cb\ue6cc\ue61b\ue6c8\ue684\ue684\u4a5f\u4a01\u4a5f\u4a3a\u4a12\u4a39\u4a3d\u4a38\u49ee\u49ef\u49e8\u4a0e\u49ec\u4b9f\u4a58\u4ba6\u1955\u1915\u1954\u5f29\u5e9b\u1957\u1953\u5f28\u5ea6\u5f32\u5e7f\u5f34\u5f44\u5f31\u190d\u190d\u9229\u922d\u922e\u8c48\u9229\u8d7a\u9235\u8d7c\u8c4c\u8d9b\u9234\u9237\u8d99\u8c57\u8c63\u8c54\u8d9b\u8d7a\u8bf0\u8bf0\u3390\u3394\u3397\u3371\u3391\u33c6\u338c\u33e6\u3371\u3375\u3371\u33c9\ueafb\uebd0\ueafe\uebcf\ueafb\uebb0\ueb83\ueafc\u6ab6\u6a1d\u6ab3\u6ae2\u6ab6\u69ff\u6ae5\u6ae2\u6ad5\u6ad5\u6a75\u6ac5\u6ae0\u6ab0\u6a6a\u6a6a'\u00e6\ufff8\u00ac\u00c8\u00e5\u00a3\u00c5\ufffa\u00b1\u00e3\u001a\u00af\u00b3\u00df\u00df\ub6d1\ub690\ub6ae\ub5fa\ub61e\ub6d3\ub695\ub6b3\ub6ac\ub6c2\ub6cd\ub618\ub6c0\ub6ae\ub6c2\ub6e0\ub607\ub6d7\ub6c1\ub689\u59fb\u5abe\u5ac8\u5acd\u5ab4\u5a1b\u5acb\u5ae2\u5a1b\u5aad\u5ab7\u5ae0\u5ac8\u59fa\u59fa\u5ad6\u014b\u010e\u0678\u067d\u0164\u072b\u067b\u0732\u0728\u072b\u0163\u069f\u0678\u0743\u014d\u0117373\u01f2\u037b\u02567\u0262C\u0265\u037aE\u0264\u024e\u024e\u01ea\u8db4\u8db0\u8d26\u8de3\u8cfd\u8dd1\u8db4\u8d76\u8dd7\u8dd1\u8dbb\u8de5\u22fb\u23d3\u231f\u23cc\u23b3\u23cb\u23c1\u23cf\u1085\u10c0\u10e6\u1093\u1068\u10e6\u1070\u1090\u10dd\u106c\u1069\u1091\u1090\u10dd\u10c7\u0ff9\u2191\u21d4\u2172\u2172\u21dd\u2172\u21d0\u21cd\ubca8\ubcd7\ubcb6\ubc1b\ubcc5\ubc1c\ubcd4\ubbfb\ubccc\ubc18\ubcb7\ubc68\ubc1c\ubc6b\ubcaa\ubbfd\ue0ae\ue026\ue0ca\ue019\ue006\ue01e\ue0b4\ue01a\ue019\ue018\ue0c5\ue0cf\ue01f\ue0c3\ue0ac\udff9\uf8fe\uf9e1\uf9ba\uf9e1\uf9b8\uf9cf\uf9b3\uf9ce\uf91a\uf9c3\uf91c\uf9ce\uf9d3\uf9ca\uf9c6\uf9c6\u939e\u9041\u9248\u937e\u9256\u9029\u9263\u902f\u937d\u9379\u9210\u902f\u9029\u925f\u925b\u9266\uf3d5\uf3e2\uf3e3\uf3b5\uf3d5\uf3c2\uf3c8\uf3c4\uf3b6\uf3b2\uf3db\uf3c4\uf3c2\uf394\uf390\uf38d\u2de9\u2c2d\u2e04\u2e3a\u2e03\u2def\u2c29\u2e3e\u41e1\u41a4\u41b2\u41b7\u41cd\u41c2\u41d4\u41c1\u41c2\u41b2\u41c1\u41dd\u8590\u8595\u84fb\u85e5\u851b\u8519\u85c9\u85e3\u84f9\u85b3\u85da\u85a8\u85c3\u85d1\u851d\u85b0\u85c2\u85c0\u858c\u858c\u9302\u9359\u9312\u92f4\u92eb\u9312\u9312\u9314\u9323\u9321\u907d\u907d\u7038\u6feb\u7008\u1643\u7039\u7009\u6ff5\u1187\u39b6\u39be\u391d\u39ca\u060a\u0662\u063c\u063e\u060a\u05f4\u060e\u05f0\u0600\u05f7\u079b\u079b\uf9a1\uf9e1\uf9bf\uf9bd\uf989\uf977\uf98d\uf973\uf983\uf974\uf918\uf918\ue6e2\ue68a\ue6b4\ue6b6\ue6e2\ue5fc\ue626\ue5f8\ue6a8\ue5f8\ue6c5\ue61a\ue5f9\ue68b\ue5fc\ue6b6\u6390\u6318\u63c6\u6384\u6390\u636e\u6394\u636a\u63ba\u636a\u636b\u63b9\u636e\u6376\u63c6\u638f\u636d\u638f\u6389\u63bd\u6390\u6375\u63d9\u638e\u63bb\u638b\u63e1\u63e1\u41fd\u4275\u42d3\u42e0\u41fd\u42d3\u42d3\u42c4\u42d0\u42a9\u41ff\u42cb\u42e0\u41fe\u42a9\u42d6\u42e0\u42d0\u426c\u426c\u49e1\u4989\u49af\u48fc\u49e1\u49af\u49af\u4918\u49ac\u49d5\u49e3\u491c\u48fa\u49c4\u498c\u491e\u49c5\u49c3\u491f\u4906\u4927\u49ac\u4990\u4990\ud797\ud71f\ud7b9\ud76a\ud797\ud7b9\ud7b9\ud78e\ud7ba\ud7a3\ud795\ud781\ud768\ud7db\ud769\ud7bc\ud76c\ud7e3\ud76f\ud770\ud791\ud771\ud796\ud76e\u6485\u64aa\u64d9\u6488\u64af\u648d\u646f\u64bd\u6488\u648d\u64c4\u64bc\u64db\u64ab\u646f\u648e\u648e\u646b\u64e7\u64b9\u6481\u6495\u64a0\u64dd\u648d\u64e6\u64b7\u64b2\ub402\uba2a\ub409\ub45e\ub405\ub3e8\uba32\uba32\ue86b\ue8c3\ue882\ue877\ue86b\ue86e\ue894\ue8e7\ue88e\ue86e\ue877\ue893\ue894\ue8c3\ue893\ue7fb\u3369\u3389\u33da\u3372\u336d\u3368\u3392\u3372\u33e6\u33a1\u32f8\u32fd\ua7dc\ua76d\ua797\ua784\ua7da\ua775\ua7a3\ua783\ua76f\ua790\ua7d1\ua7b8\ua775\ua76e\ua7ce\ua7bb\ua784\ua794\ua783\ua7a5\ua7de\ua7d8\ua794\ua7ca\ue466\ue44b\ue43d\ue45d\ue425\ue467\ue467\ue3ee\ue3e9\ue3e9\ue404\ue45b\ue438\ue44a\ue43d\ue3f7\u8c77\u8cba\u8cdc\u8ca2\u8c76\u8cbd\u8c82\u8c92\u8cdb\u8cbd\u8c07\u8c07\u5be3\u5bd7\u5bc4\u5bcd\u5be3\u5bb2\u5bce\u5bcc\u5bd5\u5b07\u5bdb\u5bdb\u8a7f\u854c\u8b41\u8557\u8a7f\u8a79\u8b41\u8b43\u854d\u8b2d\u8562\u8556\u4940\u492a\u4aeb\u489d\u4887\u4b48\u4b4f\u487b\u4b4f\u4942\u4b65\u4b53\u4b62\u4b63\u4932\u4b64\u4b62\u487e\u48a6\u4b65\u4aea\u4b60\u4b61\u4b62\u4b4d\u4aef\u4b63\u4af7\uc6c8\uc606\uc6de\uc6b1\uc6d7\uc5fb\uc5fd\uc6d9\uc5f9\uc6ad\uc6d5\uc6ce\uc6b6\uc6b3\uc6cb\uc5fa\uc6ae\uc61c\uc6ab\uc6b1\u7de9\u7e5d\u7e47\u7e21\u7de9\u7def\u7e21\u7e24\u7e21\u7e16\u7f7a\u7f7a\u76dd\u76c6\u768b\u76bd\u761c\u766c\u761b\u768e\u7685\u766d\u761d\u7677\ua797\ua71b\ua768\ua76f\ua797\ua76c\ua76c\ua784\ua7b8\ua7d9\ua726\ua7e3\uc180\uc184\uc190\uc107\uc1c7\uc192\uc190\uc1bf\uc1df\uc171\uc0fb\uc0fb\u0865\u0861\u0e35\u0822\u0862\u0e37\u0e35\u099a\u097a\u0854\u085e\u085e\ue90b\ue90f\ue93b\ue94c\ue90c\ue939\ue93b\ue914\ue8f4\ue95a\ue950\ue950\u8d64\u8d62\u8d64\u8d66\u8d65\u9341\u8d5d\u8d5d\u8936\u8b3a\u8b49\u8b4e\u8936\u8b4d\u8b4d\u8b65\u8899\u8878\u8b47\u8b02\u04d0\u04dc\u04af\u04a8\u04d0\u04ab\u04ab\u04c3\u03ff\u041e\u04a1\u04a4\u2511\u2556\u24f2\u2508\u2515\u24f4\u2551\u255f\u2524\u24f3\u2552\u2559\u2539\u2521\u255c\u2554\u2539\u2a9f\u2522\u2517\u2511\u2567\u254d\u254d\uddf1\uddf7\uddf1\ude38\uddf6\ude11\ude3d\udc32\u6321\u6361\u633d\u609e\u6324\u6346\u609a\u609a\ub0f4\ub0f7\ub0f1\ub102\ub0f3\ub116\ub734\ub0ec\u6cbf\u6c97\u6c8d\u6c81\u6cbf\u6cd8\u6bfb\u6c06";
        char[] cArray = "\u3c22\u3c22\u3c02\u3c02\u3c26\u3c3a\u3c2a\u3c2a\u3c2a\u3c26\u3c32\u3c36\u3c22\u3c22\u3c22\u3c22\u3c22\u3c22\u3c22\u3c22\u3c22\u3c26\u3c26\u3c3e\u3c26\u3c22\u3c22\u3c22\u3c22\u3c22\u3c26\u3c22\u3c3a\u3c26\u3c22\u3c22\u3c3a\u3c3a\u3c36\u3c3a\u3c22\u3c22\u3c22\u3c22\u3c3a\u3c22\u3c22\u3c3e\u3c22\u3c3e\u3c2a\u3c3a\u3c3e\u3c02\u3c0a\u3c26\u3c26\u3c26\u3c26\u3c26\u3c22\u3c26\u3c26\u3c22\u3c22\u3c22\u3c26\u3c26\u3c26\u3c26\u3c22\u3c22\u3c3e\u3c3e\u3c22\u3c22\u3c3a\u3c36\u3c3a\u3c3e\u3c36\u3c3a\u3c26\u3c22\u3c26\u3c36\u3c3a\u3c36\u3c3e\u3c3a\u3c3e\u3c3e\u3c22\u3c3e\u3c3e\u3c3a\u3c22\u3c26\u3c3e\u3c3e\u3c3a\u3c3e\u3c3e\u3c3e\u3c22\u3c26\u3c3e\u3c26\u3c3e\u3c3e\u3c3e\u3c3e\u3c3e\u3c26\u3c22\u3c3a\u3c22\u3c26\u3c2a\u3c22\u3c22\u3c3e\u3c32\u3c3a\u3c36\u3c36\u3c32\u3c26\u3c3e\u3c22\u3c36\u3c3e\u3c22\u3c22\u3c22\u3c32\u3c3a\u3c22\u3c22\u3c22\u3c22\u3c22\u3c22\u3c26\u3c22\u3c22\u3c36\u3c26\u3c26\u3c26\u3c26".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                IIlIll = stringArray;
                IIllII = new Object[stringArray.length];
                int n6 = 189554518;
                byte[] byArray = "\u00f0\u00fe\u00e4J\u0019MK]\f\"V\u00a3P\u00d8\u00b4\u0096\u0015\u0099\u00fa\u00c8=\u0004\u00eft".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                IIlIlI = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    LegacyConfigMigration.IIlIlI[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                break;
            }
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
        lIlII = new GsonBuilder().setPrettyPrinting().create();
        ll = StringFactory.IIII("virel-client.json");
        IIIIII = StringFactory.IIII("virel-presets");
        IIIll = StringFactory.IIII("cats");
        lIlll = StringFactory.IIII("presets");
        llII = StringFactory.IIII("Client");
        lIII = StringFactory.IIII("Feather Cosmetics").llII();
        llll = StringFactory.IIII("Lunar Cosmetics").llII();
        IIIlII = StringFactory.IIII("Client Cosmetics").llII();
        IIIIIl = StringFactory.IIII("Nick Hider").llII();
        lllll = StringFactory.IIII("Nick Switcher").llII();
        I = StringFactory.IIII("Player ESP").llII();
        lllI = StringFactory.IIII("Player Glow").llII();
        lIIll = StringFactory.IIII("eh List").llII();
        lIIl = StringFactory.IIII("Module List").llII();
        lIlI = StringFactory.IIII("Color Mode");
        llI = StringFactory.IIII("No Jump Delay").llII();
        IIlII = StringFactory.IIII("No Delay").llII();
        lIIII = StringFactory.IIII("PopVFX").llII();
        lIllI = StringFactory.IIII("PopVisuals").llII();
        Illl = StringFactory.IIII("CrystalVFX").llII();
        llIII = StringFactory.IIII("Crystal Render").llII();
        lIIlI = StringFactory.IIII("Stray runner").llII();
        IlIll = StringFactory.IIII("Stray utils").llII();
        IIIl = StringFactory.IIII("NoMissDelay").llII();
        llIlI = StringFactory.IIII("NeverMiss").llII();
        IIIllI = StringFactory.IIII("Tapper").llII();
        Illll = StringFactory.IIII("SprintReset").llII();
        IllI = StringFactory.IIII("Speed").llII();
        II = StringFactory.IIII("Exploit Mode");
        IIIIll = StringFactory.IIII("Tapper Debug").llII();
        lll = StringFactory.IIII("Aim Assist").llII();
        lllIl = StringFactory.IIII("Ac detector").llII();
        IIl = StringFactory.IIII("AC Detector").llII();
        lllII = StringFactory.IIII("Smooth");
        IIll = StringFactory.IIII("Strength");
        l = StringFactory.IIII("/virel-config");
        lIlIl = StringFactory.IIII("Utility");
        IIIlll = StringFactory.IIII("UTILS");
        IIlI = StringFactory.IIII("cat");
        IllIl = StringFactory.IIII("orchard");
        IlllI = StringFactory.IIII("Orchard");
        IIlll = StringFactory.IIII("orchard.json");
        IIlIl = StringFactory.IIII("orchard-client.json");
        IIII = StringFactory.IIII("optimise.json");
        IlIIl = StringFactory.IIII("optimise-presets");
        lII = StringFactory.IIII("optimise.bootstrap");
        llIl = StringFactory.IIII("web-clickgui-backups");
        IIlIII = StringFactory.IIII("cats");
        lI = StringFactory.IIII("config.json");
        IlII = StringFactory.IIII("profiles");
        lIll = StringFactory.IIII("inventory-presets");
        IlIl = StringFactory.IIII("storage.json");
        Il = StringFactory.IIII("backups");
        Ill = StringFactory.IIII("APPDATA");
        III = StringFactory.IIII("user.home");
        IIllI = StringFactory.IIII("virel-bootstrap.json");
        IllII = StringFactory.IIII("yyyyMMdd-HHmmss");
        IIIlI = new Gson();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IlIllI(Category category, ModuleBase moduleBase) {
        this.IIIII = category == null ? Category.IIl : category;
        this.IlI = moduleBase != null;
        this.llIll = moduleBase == null ? 0L : moduleBase.IlIIllI();
    }

    public Category IllIII() {
        return this.IIIII;
    }

    public Path IllIIl() {
        return this.IlII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static JsonObject IllIlI(JsonObject jsonObject, JsonObject jsonObject2, boolean bl) {
        JsonObject jsonObject3 = new JsonObject();
        jsonObject3.addProperty("enabled", Boolean.valueOf(bl && LegacyConfigMigration.IIll(jsonObject2, StringFactory.IIII("Use W-Tap").llII(), true)));
        LegacyConfigMigration.llI(jsonObject, jsonObject3);
        jsonObject3.add("settings", (JsonElement)new JsonObject());
        return jsonObject3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IllIll(JsonObject jsonObject, JsonObject jsonObject2) {
        boolean bl = LegacyConfigMigration.lIII(jsonObject);
        boolean bl2 = LegacyConfigMigration.lIIll(jsonObject);
        if (!bl || !bl2) {
            if (bl2) {
                return "FEATHER";
            }
            if (!bl) return "NONE";
            return "FEATHER";
        }
        return "FEATHER";
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IlllII(JsonObject jsonObject) {
        if (!LegacyConfigMigration.llIl(jsonObject, IllI)) {
            return;
        }
        JsonObject jsonObject2 = LegacyConfigMigration.lllII(jsonObject, IllI);
        if (jsonObject2 == null) return;
        if (!jsonObject2.has("settings")) {
            return;
        }
        JsonObject jsonObject3 = jsonObject2.getAsJsonObject("settings");
        long l2 = II.llII();
        JsonElement jsonElement = ModuleBase.IIIIlIl(jsonObject3, l2);
        if (jsonElement == null) return;
        if (jsonElement.isJsonPrimitive()) {
            String string = jsonElement.getAsString();
            if (!"SPEED_EQUIVALENT".equalsIgnoreCase(string)) {
                if (!"GRIM".equalsIgnoreCase(string)) {
                    if (!"ROTATE".equalsIgnoreCase(string)) return;
                }
                ModuleBase.lllIIl(jsonObject3, l2, (JsonElement)new JsonPrimitive("LEGIT"));
                return;
            }
        } else {
            return;
        }
        ModuleBase.lllIIl(jsonObject3, l2, (JsonElement)new JsonPrimitive("NORMAL"));
    }

    private void IlllIl(Path path) {
        if (path == null || !Files.isDirectory(path, new LinkOption[0])) {
            return;
        }
        try (Stream<Path> stream = Files.list(path);){
            if (stream.findAny().isEmpty()) {
                Files.deleteIfExists(path);
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllllI(Path path, IIIlIIIII iIIlIIIII, IIIlIIIII iIIlIIIII2, boolean bl) {
        if (path == null) {
            return;
        }
        this.IIlII(path.resolve(iIIlIIIII.IIII()), this.lIlII(IIlIllIl.lI), bl);
        Path path2 = path.resolve(iIIlIIIII2.IIII());
        this.IlIlI(path2, this.IlIII(), bl);
        this.IlIlI(path2.resolve(lIll.IIII()), this.llIIl(), bl);
        this.IlIlI(path.resolve(llIl.IIII()), this.IlII(), bl);
        Path path3 = path.resolve(lIlll.IIII());
        this.IlIlI(path3, this.IlIII(), bl);
        if (!bl) return;
        this.IlllIl(path2.resolve(lIll.IIII()));
        this.IlllIl(path2);
        this.IlllIl(path3);
        this.IlllIl(path.resolve(llIl.IIII()));
    }

    private static int Illlll(int n, int n2) {
        return IIlIlI[n ^ 0x4F7DEA5F] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIIIII(short s, char c, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x577E;
        char[] cArray = IIlIll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIllII[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            LegacyConfigMigration.IIllII[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6D94;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 18714;
            n6 += 64254;
            n6 ^= 0xDDB7;
            n6 += 19545;
            n6 += 41286;
            n6 += 51575;
            n6 ^= 0x70E1;
            cArray[n5] = (char)((n6 -= 56278) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

