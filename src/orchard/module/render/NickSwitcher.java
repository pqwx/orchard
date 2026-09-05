/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIII
 * Module         : Nick Switcher  [RENDER]
 * Description    : Replaces either your visible name or your tracked opponent's visible name and can copy another player's skin.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Tier Color Style
 *   - Opponent Filter
 *   - Divider Style
 *   - Tagger Style
 *   - Skin Source
 *   - Icon Style
 *   - Copy Skin
 *   - Show Icon
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.properties.Property
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.client.texture.AbstractTexture
 *  net.minecraft.client.texture.NativeImage
 *  net.minecraft.client.texture.NativeImageBackedTexture
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.player.PlayerSkinType
 *  net.minecraft.entity.player.SkinTextures
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.PlainTextContent
 *  net.minecraft.text.Style
 *  net.minecraft.text.Text
 *  net.minecraft.text.TextContent
 *  net.minecraft.util.AssetInfo$TextureAsset
 *  net.minecraft.util.AssetInfo$TextureAssetInfo
 *  net.minecraft.util.Identifier
 */
package orchard.module.render;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.properties.Property;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.LambdaMetafactory;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.BiConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerSkinType;
import net.minecraft.entity.player.SkinTextures;
import net.minecraft.text.MutableText;
import net.minecraft.text.PlainTextContent;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextContent;
import net.minecraft.util.AssetInfo;
import net.minecraft.util.Identifier;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIIlllI;
import orchard.internal.IIIIlI;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIll;
import orchard.internal.IIIllllI;
import orchard.internal.IIlIIlIII;
import orchard.internal.IlIIIIIl;
import orchard.internal.IlIIlIIl;
import orchard.internal.IlIlIlll;
import orchard.internal.IlIlIlllI;
import orchard.internal.lIIlIIIl;
import orchard.internal.lIllIlI;
import orchard.internal.llIIIlIl;
import orchard.internal.llIll;
import orchard.internal.lllIlI;
import orchard.internal.llllII;

@Environment(value=EnvType.CLIENT)
public final class NickSwitcher
extends ModuleBase {
    private long I;
    private String l = "";
    private final lllIlI II;
    private String Il = "";
    private final Map<String, CompletableFuture<Object>> lI;
    private final IIIIIIIIl<IlIlIlll> ll;
    private volatile Object III;
    private final llIll IIl;
    private static final int IlI = 64;
    private String Ill = "";
    private static final int lII = 512;
    private UUID lIl;
    private final AtomicInteger llI;
    private static final int lll = 262144;
    private final IIIIIIIIl<IIIlIll> IIII;
    private static final int IIIl = 512;
    private static final IIIlIIIII IIlI;
    private Pattern IIll;
    private String IlII = "";
    private static final IIIlIIIII IlIl;
    private String IllI = "";
    private volatile boolean Illl;
    private String lIII = "";
    private final lllIlI lIIl;
    private static volatile NickSwitcher lIlI;
    private String lIll = "";
    private final IIIIIIIIl<llllII> llII;
    private final IIIIIIIIl<llIIIlIl> llIl;
    private final llIll lllI;
    private final IIIIIIIIl<IIIIIlllI> llll;
    private static final IIIlIIIII IIIII;
    private volatile Map<String, String> IIIIl;
    private String IIIlI = "";
    private final IIIIIIIIl<IlIIlIIl> IIIll = this.IIlllIl(new IIIIIIIIl<IlIIlIIl>(StringFactory.IIII("Target"), IlIIlIIl.class, IlIIlIIl.I));
    private static final HttpClient IIlII;
    private static final IIIlIIIII IIlIl;
    private final Map<UUID, Integer> IIllI;
    private volatile Pattern IIlll;
    private final IIIIIIIIl<IlIIIIIl> IlIII;
    private final Map<String, String> IlIIl;
    private final IIIIIIIIl<IIIllllI> IlIlI;
    private static final int[] IlIll;
    private static final String[] IllII;
    private static final Object[] IllIl;

    /*
     * Enabled aggressive block sorting
     */
    public String I() {
        String string = this.lIIl.I().trim();
        if (string.isEmpty()) return "You";
        String string2 = string;
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lI(Map<UUID, GameProfile> map, GameProfile gameProfile) {
        UUID uUID = this.IIIIl(gameProfile);
        String string = IlIlIlllI.ll(gameProfile);
        if (uUID == null) return;
        if (string == null) return;
        if (!string.isBlank()) {
            map.putIfAbsent(uUID, gameProfile);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIlIIIl lII(Text text) {
        Text text2;
        PlainTextContent plainTextContent;
        TextContent textContent = text.getContent();
        boolean bl = false;
        Style style = text.getStyle();
        if (textContent instanceof PlainTextContent) {
            String string;
            Object object;
            plainTextContent = (PlainTextContent)textContent;
            if (!this.IIIlIl(style) && !((String)(object = plainTextContent.string())).equals(string = this.IllIl((String)object))) {
                textContent = PlainTextContent.of((String)string);
                bl = true;
            }
        }
        plainTextContent = MutableText.of((TextContent)textContent).setStyle(style);
        for (String string : text.getSiblings()) {
            lIIlIIIl lIIlIIIl2 = this.lII((Text)string);
            plainTextContent.append(lIIlIIIl2.I());
            bl |= lIIlIIIl2.l();
        }
        if (bl) {
            text2 = plainTextContent;
            return new lIIlIIIl(text2, bl);
        }
        text2 = text;
        return new lIIlIIIl(text2, bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Object lIl(Object object) {
        Object object2 = object;
        if (!(object2 instanceof Optional)) {
            return object2;
        }
        Optional optional = (Optional)object2;
        return optional.orElse(null);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void llll() {
        this.lI.clear();
        this.IIIII();
        this.Ill = "";
        this.lIl = null;
        this.IlII = "";
        this.IllI = "";
        this.I = 0L;
        this.IIllI.clear();
        this.llI.set(0);
        this.l = "";
        this.llI();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void llI() {
        this.lIII = "";
        this.IIlll = null;
        this.IIIIl = Map.of();
        Map<String, String> map = this.IlIIl;
        synchronized (map) {
            this.IlIIl.clear();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private CompletableFuture<GameProfile> lll(GameProfile gameProfile) {
        GameProfile gameProfile2 = gameProfile;
        String string = IlIlIlllI.III(gameProfile2).toString().replace("-", "");
        String string2 = string;
        String string3 = IIIII.IIII();
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create(string3 + string2)).timeout(Duration.ofSeconds(5L)).header(IIlI.IIII(), IIlIl.IIII()).GET().build();
        return ((CompletableFuture)IIlII.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString()).thenApply(arg_0 -> NickSwitcher.IlIlII(gameProfile2, arg_0))).exceptionally(throwable -> gameProfile2);
    }

    private CompletableFuture<Object> IIIl(MinecraftClient minecraftClient, String string) {
        HttpRequest httpRequest;
        try {
            httpRequest = HttpRequest.newBuilder(URI.create(string)).timeout(Duration.ofSeconds(8L)).header(IIlI.IIII(), IIlIl.IIII()).GET().build();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return CompletableFuture.completedFuture(null);
        }
        return ((CompletableFuture)IIlII.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofByteArray()).thenCompose(httpResponse -> {
            if (httpResponse.statusCode() < 200 || httpResponse.statusCode() >= 300 || httpResponse.body() == null || ((byte[])httpResponse.body()).length == 0 || ((byte[])httpResponse.body()).length > 262144) {
                return CompletableFuture.completedFuture(null);
            }
            CompletableFuture<Object> completableFuture = new CompletableFuture<Object>();
            try {
                minecraftClient.execute(() -> {
                    try {
                        completableFuture.complete(this.IIllIl(string, (byte[])httpResponse.body()));
                    }
                    catch (LinkageError | RuntimeException throwable) {
                        completableFuture.complete(null);
                        this.IIIIIlI(61, throwable);
                    }
                });
            }
            catch (LinkageError | RuntimeException throwable) {
                completableFuture.complete(null);
            }
            return completableFuture;
        })).exceptionally(throwable -> null);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IIlI(MinecraftClient minecraftClient) {
        ArrayList<IIlIIlIII> arrayList = new ArrayList<IIlIIlIII>();
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<String, String>();
        StringBuilder stringBuilder = new StringBuilder();
        for (GameProfile object2 : this.IIlII(minecraftClient)) {
            String string;
            String string2 = IlIlIlllI.ll(object2);
            if (string2 == null || string2.isBlank() || (string = this.IIIlI(object2)) == null || string.isBlank() || string2.equals(string)) continue;
            linkedHashMap.put(string2, string);
            arrayList.add(new IIlIIlIII(string2, string));
        }
        arrayList.sort((iIlIIlIII, iIlIIlIII2) -> Integer.compare(iIlIIlIII2.I().length(), iIlIIlIII.I().length()));
        for (IIlIIlIII iIlIIlIII3 : arrayList) {
            stringBuilder.append(iIlIIlIII3.I()).append('\u0000').append(iIlIIlIII3.l()).append('\u0001');
        }
        String string = stringBuilder.toString();
        if (string.equals(this.lIII)) {
            return;
        }
        this.lIII = string;
        this.IIIIl = Map.copyOf(linkedHashMap);
        this.IIlll = this.lIII(arrayList);
        Map<String, String> map = this.IlIIl;
        synchronized (map) {
            this.IlIIl.clear();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String IIll() {
        String string;
        String string2 = this.II.I().trim();
        if (string2.isEmpty()) {
            string = this.I();
            return string;
        }
        string = string2;
        return string;
    }

    /*
     * Unable to fully structure code
     */
    private Iterable<PlayerEntity> IlII(MinecraftClient var1_1) {
        block4: {
            break block4;
lbl1:
            // 1 sources

            while (true) {
                var5_5 = (PlayerEntity)var4_4;
                var2_2.add(var5_5);
                ** GOTO lbl15
                break;
            }
        }
        var2_2 = new ArrayList<PlayerEntity>();
        var3_3 = var1_1.world.getEntities().iterator();
        if (true) ** GOTO lbl15
        while (true) {
            if (var4_4 instanceof PlayerEntity) {
                ** continue;
                return var2_2;
            }
lbl15:
            // 4 sources

            if (!var3_3.hasNext()) ** continue;
            var4_4 = (Entity)var3_3.next();
        }
    }

    @Override
    public JsonObject IlIl() {
        JsonObject jsonObject = super.IlIl();
        return jsonObject;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illl(GameProfile gameProfile) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) return false;
        if (this.IIIll.lIl() == IlIIlIIl.II) {
            PlayerEntity playerEntity = this.IIIlll(minecraftClient);
            if (playerEntity != null) {
                String string = IlIlIlllI.ll(playerEntity.getGameProfile());
                if (playerEntity.getUuid().equals(IlIlIlllI.III(gameProfile))) return true;
                if (string.isBlank()) return false;
                if (!string.equalsIgnoreCase(IlIlIlllI.ll(gameProfile))) return false;
                return true;
            }
        } else {
            String string = IlIlIlllI.ll(minecraftClient.player.getGameProfile());
            if (minecraftClient.player.getUuid().equals(IlIlIlllI.III(gameProfile))) return true;
            if (string.isBlank()) return false;
            if (string.equalsIgnoreCase(IlIlIlllI.ll(gameProfile))) return true;
            return false;
        }
        if (this.lIl != null) {
            if (this.lIl.equals(IlIlIlllI.III(gameProfile))) return true;
        }
        if (this.IlII.isBlank()) return false;
        if (this.IlII.equalsIgnoreCase(IlIlIlllI.ll(gameProfile))) return true;
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private Pattern lIII(List<IIlIIlIII> var1_1) {
        block4: {
            block6: {
                block3: {
                    block7: {
                        block5: {
                            if (var1_1.isEmpty()) break block5;
                            break block6;
lbl3:
                            // 1 sources

                            while (var2_2.length() > 0) {
                                break block3;
                            }
                            break block7;
                        }
                        return null;
lbl8:
                        // 2 sources

                        while (true) {
                            if (!var3_3.hasNext()) break block4;
                            var4_4 = var3_3.next();
                            ** GOTO lbl3
                            break;
                        }
                    }
lbl13:
                    // 2 sources

                    while (true) {
                        var2_2.append(Pattern.quote(var4_4.I()));
                        ** GOTO lbl8
                        break;
                    }
                }
                var2_2.append('|');
                ** while (true)
            }
            var2_2 = new StringBuilder();
            var3_3 = var1_1.iterator();
            ** while (true)
        }
        var9_5 = "(?![A-Za-z0-9_])";
        var8_6 = ")";
        var7_7 = String.valueOf(var2_2);
        var6_8 = StringFactory.IIl("0MsIihBFVRC5AZxSIdLTm8Y=");
        var5_9 = StringFactory.IIl("0Mtd1VEIDF2sKdJjDp7EztXNa6FQ");
        return Pattern.compile(var5_9 + var6_8 + var7_7 + var8_6 + var9_5);
    }

    private String lIIl() {
        return this.Ill;
    }

    /*
     * Enabled aggressive block sorting
     */
    private PlayerListEntry lIll(MinecraftClient minecraftClient, String string) {
        if (minecraftClient != null && minecraftClient.getNetworkHandler() != null && string != null && !string.isBlank()) {
            return minecraftClient.getNetworkHandler().getCaseInsensitivePlayerInfo(string);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private PlayerEntity llII(MinecraftClient minecraftClient) {
        PlayerEntity playerEntity;
        if (this.lIl == null) {
            return null;
        }
        Iterator<PlayerEntity> iterator = this.IlII(minecraftClient).iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while (!(playerEntity = iterator.next()).getUuid().equals(this.lIl));
        this.lIlIl(playerEntity);
        return playerEntity;
    }

    /*
     * Unable to fully structure code
     */
    private PlayerEntity llIl(MinecraftClient var1_1) {
        block10: {
            block12: {
                block11: {
                    block7: {
                        block8: {
                            block6: {
                                break block8;
lbl1:
                                // 1 sources

                                while (true) {
                                    block9: {
                                        var6_5 = var5_4.next();
                                        break block9;
                                        return var2_2;
lbl6:
                                        // 1 sources

                                        while (var6_5.isAlive()) {
                                            break block6;
                                        }
                                        break block7;
                                    }
                                    if (var6_5 == var1_1.player) break block7;
                                    ** GOTO lbl6
                                    break;
                                }
lbl12:
                                // 1 sources

                                while (true) {
                                    var2_2 = var6_5;
                                    break block7;
                                    break;
                                }
                            }
                            if (!var6_5.isRemoved()) break block10;
                            break block11;
                        }
                        var2_2 = null;
                        break block12;
lbl21:
                        // 1 sources

                        while (true) {
                            var3_3 = var7_6;
                            ** continue;
                            break;
                        }
                    }
                }
lbl26:
                // 3 sources

                while (true) {
                    if (!var5_4.hasNext()) ** continue;
                    ** continue;
                    break;
                }
            }
            var3_3 = 1.7976931348623157E308;
            var5_4 = this.IlII(var1_1).iterator();
            ** GOTO lbl26
        }
        var7_6 = var1_1.player.squaredDistanceTo((Entity)var6_5);
        if (var7_6 < var3_3) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private String lllI() {
        if (this.IIIll.lIl() != IlIIlIIl.l) {
            return this.I();
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null) {
            if (minecraftClient.player != null) return this.IIIlI(minecraftClient.player.getGameProfile());
        }
        String string = this.I();
        return string + "1";
    }

    private void IIIII() {
        this.III = null;
        this.Illl = false;
        this.lIll = "";
    }

    /*
     * Enabled aggressive block sorting
     */
    private UUID IIIIl(GameProfile gameProfile) {
        if (gameProfile == null) {
            return null;
        }
        UUID uUID = IlIlIlllI.III(gameProfile);
        if (uUID != null) {
            return uUID;
        }
        String string = IlIlIlllI.ll(gameProfile);
        if (string == null) return null;
        if (string.isBlank()) return null;
        UUID uUID2 = UUID.nameUUIDFromBytes(string.toLowerCase(Locale.ROOT).getBytes(StandardCharsets.UTF_8));
        return uUID2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public NickSwitcher() {
        super(StringFactory.IIII("tp1Xl1lkRxWDC5dcHQ=="), Category.l, StringFactory.IIII("qpFEkBhUVQ/XDZZNB9bM3oGbQY5ZQVkPngqTXE/d35Od1FuOWU5fCYVIi0sO0NWbnNRbjAlYXhmZHNhKT8XXjZGWWJlZWVERkkieVwuT3Z+W1FeTCU4QHZkHi1EKwZ6OlJVNmQsQQ1yEA5ZXQQ=="));
        this.IIII = this.IIlllIl(new IIIIIIIIl<IIIlIll>(StringFactory.IIII("Opponent Filter"), IIIlIll.class, IIIlIll.Il));
        this.lIIl = this.IIlllIl(new lllIlI((Object)StringFactory.IIII("Alias"), StringFactory.IIII("You")));
        this.lllI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Copy Skin"), false));
        this.II = this.IIlllIl(new lllIlI((Object)StringFactory.IIII("Skin Source"), ""));
        this.llll = this.IIlllIl(new IIIIIIIIl<IIIIIlllI>(StringFactory.IIII("Tier"), IIIIIlllI.class, IIIIIlllI.llI));
        this.llII = this.IIlllIl(new IIIIIIIIl<llllII>(StringFactory.IIII("Mode"), llllII.class, llllII.Illl));
        this.IIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Show Icon"), true));
        this.IlIlI = this.IIlllIl(new IIIIIIIIl<IIIllllI>(StringFactory.IIII("Tagger Style"), IIIllllI.class, IIIllllI.I));
        this.IlIII = this.IIlllIl(new IIIIIIIIl<IlIIIIIl>(StringFactory.IIII("Icon Style"), IlIIIIIl.class, IlIIIIIl.I));
        this.llIl = this.IIlllIl(new IIIIIIIIl<llIIIlIl>(StringFactory.IIII("Tier Color Style"), llIIIlIl.class, llIIIlIl.Il));
        this.ll = this.IIlllIl(new IIIIIIIIl<IlIlIlll>(StringFactory.IIII("Divider Style"), IlIlIlll.class, IlIlIlll.Il));
        this.lI = new ConcurrentHashMap<String, CompletableFuture<Object>>();
        this.IIllI = new ConcurrentHashMap<UUID, Integer>();
        this.llI = new AtomicInteger();
        this.IlIIl = new lIllIlI(this, 128, 0.75f, true);
        this.IIIIl = Map.of();
        this.IIII.lIII(() -> this.IIIll.lIl() == IlIIlIIl.II);
        this.lllI.lIII(() -> {
            if (this.IIIll.lIl() == IlIIlIIl.l) return false;
            return true;
        });
        this.II.lIII(() -> {
            if (this.IIIll.lIl() == IlIIlIIl.l) return false;
            if ((Boolean)this.lllI.lIl() == false) return false;
            return true;
        });
        this.llII.lIII(() -> {
            if (this.llll.lIl() == IIIIIlllI.llI) return false;
            return true;
        });
        this.IIl.lIII(() -> {
            if (this.llll.lIl() == IIIIIlllI.llI) return false;
            return true;
        });
        this.IlIlI.lIII(() -> {
            if (this.llll.lIl() == IIIIIlllI.llI) return false;
            return true;
        });
        this.IlIII.lIII(() -> {
            if (this.llll.lIl() == IIIIIlllI.llI) return false;
            if ((Boolean)this.IIl.lIl() == false) return false;
            return true;
        });
        this.llIl.lIII(() -> {
            if (this.llll.lIl() == IIIIIlllI.llI) return false;
            return true;
        });
        this.ll.lIII(() -> {
            if (this.llll.lIl() == IIIIIlllI.llI) return false;
            return true;
        });
        lIlI = this;
    }

    /*
     * Enabled aggressive block sorting
     */
    private String IIIlI(GameProfile gameProfile) {
        Integer n2;
        block3: {
            UUID uUID;
            block4: {
                block2: {
                    this.IIIIlI();
                    uUID = this.IIIIl(gameProfile);
                    if (uUID == null) {
                        return this.I();
                    }
                    MinecraftClient minecraftClient = MinecraftClient.getInstance();
                    if (minecraftClient != null && minecraftClient.player != null && minecraftClient.player.getUuid().equals(uUID)) break block2;
                    this.llI.updateAndGet(n -> Math.max(n, 1));
                    n2 = this.IIllI.get(uUID);
                    if (n2 != null) break block3;
                    break block4;
                }
                this.IIllI.putIfAbsent(uUID, 1);
                this.llI.updateAndGet(n -> Math.max(n, 1));
                String string = this.I();
                return string + "1";
            }
            n2 = this.llI.incrementAndGet();
            Integer n3 = this.IIllI.putIfAbsent(uUID, n2);
            if (n3 != null) {
                n2 = n3;
            }
        }
        Integer n4 = n2;
        String string = this.I();
        return string + n4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Object IIIll(GameProfile gameProfile) {
        if (!this.IIIlIIl()) return null;
        if ((Boolean)this.lllI.lIl() == false) return null;
        if (gameProfile == null) return null;
        if (!this.Illl(gameProfile)) {
            return null;
        }
        Object object = this.III;
        return object;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private List<GameProfile> IIlII(MinecraftClient var1_1) {
        block17: {
            block14: {
                block10: {
                    block15: {
                        block18: {
                            block13: {
                                block11: {
                                    block9: {
                                        block16: {
                                            block12: {
                                                block19: {
                                                    if (var1_1 != null) break block18;
                                                    break block19;
lbl3:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var4_4 /* !! */  == null) break block9;
                                                        this.lI(var2_2, var4_4 /* !! */ .getGameProfile());
                                                        break block9;
lbl7:
                                                        // 2 sources

                                                        while (true) {
                                                            var3_3 = new ArrayList<V>(var2_2.values());
                                                            if (var1_1.player != null) break block10;
                                                            break block11;
                                                            break;
                                                        }
                                                        break;
                                                    }
lbl11:
                                                    // 2 sources

                                                    while (true) {
                                                        if (var1_1.world == null) break block12;
                                                        break block13;
                                                        break;
                                                    }
lbl14:
                                                    // 2 sources

                                                    while (true) {
                                                        var4_4 /* !! */  = v0;
                                                        break block14;
                                                        break;
                                                    }
lbl17:
                                                    // 3 sources

                                                    while (true) {
                                                        if (!var3_3.hasNext()) ** GOTO lbl7
                                                        break block15;
                                                        break;
                                                    }
                                                }
                                                return List.of();
                                            }
                                            while (true) {
                                                if (var1_1.getNetworkHandler() != null) ** break;
                                                ** continue;
                                                break block16;
                                                break;
                                            }
lbl27:
                                            // 1 sources

                                            while (true) {
                                                this.lI(var2_2, var1_1.player.getGameProfile());
                                                ** GOTO lbl11
                                                break;
                                            }
                                        }
                                        var3_3 = var1_1.getNetworkHandler().getPlayerList().iterator();
                                        ** GOTO lbl17
                                    }
lbl34:
                                    // 2 sources

                                    while (true) {
                                        if (!var3_3.hasNext()) ** continue;
                                        break block17;
                                        break;
                                    }
lbl37:
                                    // 1 sources

                                    while (true) {
                                        this.lI(var2_2, var4_4 /* !! */ .getProfile());
                                        ** GOTO lbl17
                                        break;
                                    }
                                }
                                v0 = null;
                                ** GOTO lbl14
                            }
                            var3_3 = var1_1.world.getPlayers().iterator();
                            ** while (true)
                        }
                        var2_2 = new LinkedHashMap<UUID, GameProfile>();
                        if (var1_1.player != null) ** break;
                        ** while (true)
                        ** while (true)
                    }
                    var4_4 /* !! */  = (PlayerListEntry)var3_3.next();
                    if (var4_4 /* !! */  != null) ** break;
                    ** while (true)
                    ** while (true)
                }
                v0 = var1_1.player.getUuid();
                ** while (true)
            }
            var3_3.sort((Comparator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)I, lllll(java.util.UUID com.mojang.authlib.GameProfile com.mojang.authlib.GameProfile ), (Lcom/mojang/authlib/GameProfile;Lcom/mojang/authlib/GameProfile;)I)((NickSwitcher)this, (UUID)var4_4 /* !! */ ));
            return var3_3;
        }
        var4_4 /* !! */  = (PlayerEntity)var3_3.next();
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIlIl() {
        if (this.IIIll.lIl() == IlIIlIIl.l) {
            return true;
        }
        if (this.Ill.isBlank()) return false;
        return true;
    }

    private CompletableFuture<Object> IIlll(MinecraftClient minecraftClient, String string2) {
        String string3 = string2.trim();
        this.IlIll(string3);
        return this.lI.computeIfAbsent(string3, string -> {
            CompletableFuture<Object> completableFuture = this.IIIl(minecraftClient, (String)string);
            completableFuture.thenAccept(object -> {
                if (object == null) {
                    this.lI.remove(string, completableFuture);
                }
            });
            return completableFuture;
        });
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block12: {
            block11: {
                var6 = 18445;
                var7_1 = "\u7d2a\u7d72\u7d62\u7dcd\u6e63\u6e6e\u6e3c\u6ea5\u784e\u785e\u7859\u78d0\u78f1\u78e3\u78f1\u7823\u78d9\u78de\u7839\u785c\u78b1\u78d3\u7877\u78e0\u7897\u7866\u785f\u78c1\u78b2\u7846\u7850\u7817\u78eb\u7883\u78dd\u78de\u7dad\u7dbd\u7dbd\u7d1e\u7d4a\u7d3e\u7d15\u7dcf\u7d28\u7d29\u7dab\u7df9\u7d58\u7d0e\u7da6\u7d3a\u7d79\u7d91\u7dc7\u7d33\u7d46\u7de9\u7db2\u7d87\u5675\u5679\u562b\u56b2\u40ec\u40fc\u40fc\u4040\u4012\u406d\u4071\u40a9\u405e\u4052\u409a\u40ec\u401d\u4066\u40a7\u407d\u4027\u40c1\u40b0\u404c\u405b\u40e7\u4097\u40c6\u1bba\u1bd3\u1bac\u1b5c\u1b1c\u1b34\u1b68\u1bb1\u1b7f\u1b50\u1bec\u1bdb\u1b09\u1b32\u1be9\u1b59\u1b2b\u1bf7\u1be5\u1b09\ue603\ue66f\ue667\ue6fd\ue6a7\ue6fb\ue6d0\ue633\ue6c7\ue6c5\ue628\ue67b\ue6b2\ue6e1\ue66b\ue6c8\ue69d\ue623\ue606\ue6c5\ue6f7\ue651\ue643\ue637\ue6d7\ue6e0\ue6a2\ue6d9\ue664\ue659\ue6da\ue689\ue670\ue63b\ue66b\ue6e3\ue6c3\ue6b0\ue6fb\ue641\ue699\ue6ae\ue61f\ue60b\ue6ab\ue6be\ue67f\ue6c6\ue6df\ue603\ue63d\ue6ad\ue6bc\ue668\ue605\ue650\ue683\ue6ca\ue6df\ue6c3\ue652\ue60d\ue68a\ue6f8\ue64b\ue61d\ue61f\ue699\ue69d\ue6f7\ue683\ue673\ue6a5\ue6bf\ue651\ue676\ue6e9\ue6b9\ue635\ue68e\ue6b0\ue62d\ue66b\ue69c\ue6c2\ue627\ue678\ue60d\ue686\ue6bf\ue697\ue69a\ue659\ue656\ue6a3\ue6c7\ue619\ue674\ue648\ue6dd\ue69a\ue6ce\ue6cd\ue632\ue6a2\ue6ce\ue62c\ue674\ue6c7\ue6fd\ue654\ue6d2\ue69c\ue64f\ue650\ue6d9\ue68c\ue664\ue66f\ue61d\ue6ef\ue688\ue6d2\ue6c8\ue642\ue655\ue687\ue696\ue672\ue616\ue64c\ue6f9\ue6f6\ue6a4\ue6a7\ue674\ue6fb\ue6aa\ue629\ue62a\ue6db\ue6cd\ue650\ue6d1\ue6d9\ue607\ue635\ue6f6\u8aa4\u8af1\u8ad3\u8a5b\u8a05\u8a65\u8a64\u8a86\ua036\ua01b\ua043\ua0cd\ua097\ua0f1\ua0ec\ua005\ua0f9\ua0c3\ua05d\ua04b\ua08a\ua0fb\ua05b\ua0e0\ua0a8\ua013\ua036\ua0f5\u3a3a\u3a78\u3a74\u3ae1\u3a9f\u3ad5\u3aea\u3a66\u2d9d\u2dc5\u2dd5\u2d7a\u730f\u7322\u735d\u73f5\u73ac\u73e7\u73dc\u7305\u73ce\u73e4\u7358\u7371\u5373\u535a\u5368\u53ac\u53d7\u53a5\u53a4\u537d\u53b9\u5393\u531a\u5315\u53c5\u53fe\u532e\u53cb\uc7ad\uc7f8\uc7bd\uc747\uc70b\uc773\uc728\uc7f6\u69a7\u69e4\u69f4\u6948\u6900\u6949\u6924\u69fa\u910b\u9122\u9151\u91d2\u91ad\u9180\u91dc\u9145\u91cc\u91e4\u9140\u9171\uf029\uf07c\uf05e\uf0c5\uf088\uf0e8\uf0e9\uf009\uf0fd\uf0fe\uf005\uf04e\uf09a\uf0c8\uf056\uf0cc\u2abf\u2afb\u2afb\u2a64\u2a19\u2a6b\u2a6a\u2ab3\u2a7d\u2a6b\u2aee\u2aff\u2a0c\u2a54\u2ab2\u2a05\u4a84\u4ad1\u4a94\u4a6e\u4a22\u4a51\u4a50\u4ad2\u4a4d\u4a68\u4ac0\u4afe\u4a35\u4a4b\u4a8c\u4a73\u4a1c\u4aa6\u4a92\u4a5f\u4a2d\u4acd\u4abd\u4aec\u6613\u6642\u6607\u66ec\u66b7\u66fc\u669e\u6622\u66d7\u66ef\u6669\u665f\u66a9\u66e5\u667c\u66c7\u668b\u666a\u664e\u66a2\u6d87\u6dc8\u6dfd\u6d67\u6d38\u6d66\u6d49\u6db6\u6d47\u6d3b\u6dd6\u6dea\u6d2f\u6d6f\u6df6\u6d40\u6d00\u6df0\u6d80\u6d43\u6d34\u6d95\u6dfb\u6d9f\u6d5f\u6d57\u6d31\u6d4a\u6dfc\u6df9\u6d17\u6d0d\u6de8\u6d83\u6db6\u6d67\u6d56\u6d00\u6d0e\u6dff\u6d4e\u6d4f\u6d89\u6d94\u6d6a\u6d30\u6dfd\u6d4d\u6d55\u6da0\u6dfe\u6d31\u6d27\u6df5\u6da6\u6dc9\u6d1a\u6d21\u6d41\u6d5d\u6dcd\u6dbe\u6d31\u6d56\u80ff\u80b0\u8085\u801f\u8040\u801e\u8031\u80ce\u803f\u8043\u80ae\u8080\u8054\u8004\u80af\u802b\u807b\u8088\u80f8\u803f\u8048\u8082\u80d0\u80f4\u8031\u802f\u801a\u8029\u8094\u80bf\u8067\u806b\u8096\u80eb\u8091\u8003\u8025\u8078\u807a\u8092\u807c\u8027\u80e6\u80d1\u8014\u802f\u80ab\u803f\u802d\u80dc\u80db\u804b\u805c\u80a3\u80d2\u80b9\u8060\u8070\u8029\u8021\u80b4\u80e8\u8042\u801a\u80ad\u80da\u80ea\u807f\u807b\u8011\u807d\u8095\u804d\u8059\u808d\u80a8\u8003\u8075\u80fa\u801e\u368a\u36c8\u36c8\u366d\u362c\u3665\u3659\u36af\u71f0\u71a9\u719c\u7112\u7148\u7114\u7115\u71dc\u712b\u712a\u7181\u71a9\u715b\u7161\u719b\u713e\u7172\u7196\u71cf\u7135\u7140\u7190\u71d6\u7187\u9aa7\u9ab7\u9ab0\u9a39\u9a18\u9a0a\u9a18\u9aca\u9a30\u9a37\u9ad0\u9ab5\u9a58\u9a3a\u9a9e\u9a09\u9a7e\u9a8f\u9ab6\u9a28\u9a5b\u9aaf\u9ab9\u9afe\u9a02\u9a6a\u9a34\u9a37\ub798\ub788\ub788\ub734\ub766\ub719\ub705\ub7dd\ub72a\ub726\ub7ee\ub798\ub769\ub712\ub7d3\ub709\ub753\ub7b5\ub7c4\ub738\ub72f\ub793\ub7e3\ub7b2\ue41b\ue46c\ue413\ue4fc\ue4a2\ue4e8\ue4ed\ue450\ue4c5\ue4c5\ue42f\ue443\ue4bf\ue4c8\ue407\ue4d0\ue49f\ue47e\ue45a\ue4b6\u79fe\u79a2\u7987\u7962\ufcf7\ufc86\ufc9e\ufc0b\ufc48\ufc01\ufc6c\ufcb2\u5da3\u5dff\u5dda\u5d3f\ud71b\ud76a\ud772\ud7e7\ud7a4\ud7ed\ud780\ud75e\u1fd0\u1fdd\u1f8f\u1f16\u6edb\u6ed6\u6e84\u6e1d\uef46\uef4b\uef19\uef80\u3319\u3314\u3346\u33df\ubfcc\ubff9\ubfa4\ubf2a\ubf75\ubf1d\ubf56\ubf88\ud13e\ud14f\ud130\ud1c0\ud180\ud1ee\ud1e8\ud107\ud1e6\ud1e5\ud14e\ud156\ud197\ud1d1\ud161\ud1ea\ud1ae\ud177\ud100\ud1fe\ud188\ud12b\ud145\ud13d\ud1e1\ud1ee\ud18a\ud19e\ue052\ue05f\ue00d\ue094\u8cfd\u8cb6\u8cf4\u8c6d\uc24e\uc203\uc22e\uc28f\uc2f3\uc2ae\uc295\uc275\uc296\uc283\uc205\uc225\uc2e4\uc299\uc259\uc2ee\u6f51\u6f1c\u6f31\u6f90\u6fec\u6fb1\u6f8a\u6f6a\u6f89\u6f9c\u6f1a\u6f3a\u6ffb\u6f86\u6f46\u6ff1\ub5fe\ub58f\ub597\ub502\ub541\ub508\ub565\ub5bb\u3d54\u3d23\u3d3b\u3dad\u3de9\u3da7\u3d83\u3d17\u9626\u9657\u964f\u96da\u9699\u96d0\u96bd\u9663\u4fa2\u4fd5\u4fcd\u4f5b\u4f1f\u4f51\u4f75\u4fe1\u146a\u145b\u1461\u149d\u14d6\u14a0\u14a1\u1453\u14b2\u14b4\u1440\u1401\ue7f6\ue7c7\ue7fd\ue701\ue74a\ue73c\ue73d\ue7cf\ue72e\ue728\ue7dc\ue79d\ufe8e\ufec1\ufef4\ufe6e\ufe31\ufe6f\ufe12\ufecc\u17a4\u17eb\u17de\u1744\u171b\u1745\u176a\u17e6";
                var8_2 = "\u0004\u0004\u001c\u0018\u0004\u0018\u0014\u0094\b\u0014\b\u0004\f\u0010\b\b\f\u0010\u0010\u0018\u0014@P\b\u0018\u001c\u0018\u0014\u0004\b\u0004\b\u0004\u0004\u0004\u0004\b\u001c\u0004\u0004\u0010\u0010\b\b\b\b\f\f\b\b".toCharArray();
                var9_3 = new String[var8_2.length];
                var13_13 = -1;
                break block11;
lbl7:
                // 1 sources

                while (true) {
                    NickSwitcher.IllII = var9_3;
                    NickSwitcher.IllIl = new Object[var9_3.length];
                    var2_6 = -1714633266;
                    var0_4 = "\u00af\u0086\u000f\u00c4\u00baL\u00cft\u00be\u00e4\u008f\u0014\u007f\"\u00e9\u00ee\u0017_\u009f\u00c9y\u00c79\u0098?8B\u00d8(l%E0\u00eb\u00ddn\u000e\u00846{\u00ef\\\u00e6\u00c0+\u00e9v\u001bi\u0080\u00a4\u00c2\u0000y\u001cgx\u00d4\u00b6\u009eF\"\u00e8\u0092F \u00db3<\u0096\u00f9p\u0007\u00d7\u0010\f\u007f\u00e5Q\u00c4\u00b2\u00ba\u00a1\fP\u0090\u00e9 2\u00ae\u00f8\u00d6".getBytes("ISO-8859-1");
                    var1_5 = var0_4.length / 4;
                    NickSwitcher.IlIll = new int[var1_5];
                    var3_7 = 0;
                    var4_8 = 0;
                    do {
                        var5_9 = (var0_4[var3_7] & 255) << 24 | (var0_4[var3_7 + 1] & 255) << 16 | (var0_4[var3_7 + 2] & 255) << 8 | var0_4[var3_7 + 3] & 255;
                        NickSwitcher.IlIll[var4_8] = var5_9 ^= var2_6;
                        var3_7 += 4;
                    } while (++var4_8 < var1_5);
                    NickSwitcher.IlIl = StringFactory.IIII("https://api.mojang.com/users/profiles/minecraft/");
                    NickSwitcher.IIIII = StringFactory.IIII("https://sessionserver.mojang.com/session/minecraft/profile/");
                    NickSwitcher.IIlI = StringFactory.IIII("Accept");
                    NickSwitcher.IIlIl = StringFactory.IIII("application/json");
                    NickSwitcher.IIlII = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).followRedirects(HttpClient.Redirect.NORMAL).build();
                    return;
                }
                var9_3[var10_10] = new String(var14_14).intern();
                var11_11 += var12_12;
                if (++var10_10 < var8_2.length) break block12;
                var13_13 = 0;
            }
            var10_10 = 0;
            var11_11 = 0;
            var12_12 = '\u0000';
            ** while (var13_13 == 0)
        }
        var12_12 = var8_2[var10_10];
        var14_14 = var7_1.substring(var11_11, var11_11 + var12_12).toCharArray();
        var15_15 = 0;
lbl40:
        // 2 sources

        switch (var15_15 % 6) {
            case 4: {
                v0 = 4;
                break;
            }
            case 2: {
                v0 = 63;
                break;
            }
            case 1: {
                v0 = 112;
                break;
            }
            case 3: {
                v0 = 51;
                break;
            }
            case 5: {
                v0 = 60;
                break;
            }
            default: {
                v0 = 83;
            }
        }
        var16_16 = v0;
        v1 = var15_15++;
        var14_14[v1] = (char)(var14_14[v1] ^ var16_16 ^ var6);
        if (var15_15 < var14_14.length) ** GOTO lbl40
    }

    /*
     * Enabled aggressive block sorting
     */
    public Text IlIIl(Text text) {
        Text text2;
        if (!this.IIIlIIl()) return text;
        if (text != null) {
            if (this.IIIll.lIl() == IlIIlIIl.l) {
                return this.IlIIll(text);
            }
        } else {
            return text;
        }
        lIIlIIIl lIIlIIIl2 = this.lII(text);
        if (!lIIlIIIl2.l()) {
            text2 = text;
            return text2;
        }
        text2 = lIIlIIIl2.I();
        return text2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIll(String string) {
        if (this.lI.size() < 64) return;
        if (!this.lI.containsKey(string)) {
            Iterator<String> iterator = this.lI.keySet().iterator();
            if (!iterator.hasNext()) return;
            this.lI.remove(iterator.next());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public String IllIl(String string) {
        if (!this.IIIlIIl()) return string;
        if (string == null) return string;
        if (string.isEmpty()) {
            return string;
        }
        if (this.IIIll.lIl() == IlIIlIIl.l) {
            return this.IIlIlI(string);
        }
        String string2 = this.Ill;
        String string3 = this.lllI();
        if (string2.isBlank()) return string;
        if (string3.isBlank()) return string;
        if (string2.equalsIgnoreCase(string3)) {
            return string;
        }
        if (string2.equals(this.IIIlI) && string3.equals(this.Il)) {
            if (this.IIll != null) return this.IIll.matcher(string).replaceAll(Matcher.quoteReplacement(string3));
        }
        this.IIIlI = string2;
        this.Il = string3;
        String string4 = "(?![A-Za-z0-9_])";
        String string5 = Pattern.quote(string2);
        String string6 = StringFactory.IIl("0Mtd1VEIDF2sKdJjDp7EztXNa6FQ");
        this.IIll = Pattern.compile(string6 + string5 + string4);
        return this.IIll.matcher(string).replaceAll(Matcher.quoteReplacement(string3));
    }

    /*
     * Enabled aggressive block sorting
     */
    private String Illll(String string, Pattern pattern, Map<String, String> map) {
        Matcher matcher = pattern.matcher(string);
        StringBuffer stringBuffer = null;
        while (true) {
            String string2;
            block7: {
                block6: {
                    block5: {
                        block4: {
                            if (!matcher.find()) break block4;
                            string2 = map.get(matcher.group("virelNickName"));
                            if (string2 == null) {
                                continue;
                            }
                            break block5;
                        }
                        if (stringBuffer == null) {
                            return string;
                        }
                        break block6;
                    }
                    if (stringBuffer == null) {
                        stringBuffer = new StringBuffer(string.length());
                    }
                    break block7;
                }
                matcher.appendTail(stringBuffer);
                return stringBuffer.toString();
            }
            matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(string2));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private CompletableFuture<Object> lIIII(MinecraftClient minecraftClient, String string) {
        if (this.IlIlll(string)) {
            return this.IIlll(minecraftClient, string);
        }
        PlayerListEntry playerListEntry = this.lIll(minecraftClient, string);
        if (playerListEntry != null) {
            return CompletableFuture.completedFuture(playerListEntry.getSkinTextures());
        }
        PlayerEntity playerEntity = this.IlIIIl(minecraftClient, string);
        if (playerEntity == null) return this.lllII(string).thenCompose(gameProfile -> {
            if (gameProfile == null) {
                return CompletableFuture.completedFuture(null);
            }
            return minecraftClient.getSkinProvider().fetchSkinTextures(gameProfile).thenApply(this::lIl);
        });
        return minecraftClient.getSkinProvider().fetchSkinTextures(playerEntity.getGameProfile()).thenApply(optional -> this.lIl(optional));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void lIlII(MinecraftClient minecraftClient) {
        Integer n;
        if (this.IIIll.lIl() != IlIIlIIl.l) {
            this.llI();
            return;
        }
        this.IIIIlI();
        int n3 = 0;
        Iterator<Integer> iterator = this.IIllI.values().iterator();
        boolean bl = true;
        block0: while (true) {
            if (!bl || (bl = false) || !true) {
                if (n > n3) {
                    n3 = n;
                }
            }
            while (iterator.hasNext()) {
                n = iterator.next();
                if (n == null) continue;
                continue block0;
            }
            break;
        }
        if (minecraftClient != null && minecraftClient.player != null) {
            this.IIllI.putIfAbsent(minecraftClient.player.getUuid(), 1);
            n3 = Math.max(n3, 1);
        }
        iterator = this.IIlII(minecraftClient).iterator();
        boolean bl2 = true;
        while (true) {
            UUID uUID;
            if (!bl2 || (bl2 = false) || !true) {
                if (!(uUID == null || minecraftClient != null && minecraftClient.player != null && minecraftClient.player.getUuid().equals(uUID) || this.IIllI.containsKey(uUID))) {
                    this.IIllI.putIfAbsent(uUID, ++n3);
                }
            }
            if (!iterator.hasNext()) {
                int n4 = n3;
                this.llI.updateAndGet(n2 -> Math.max(n2, n4));
                this.IIlI(minecraftClient);
                return;
            }
            n = (GameProfile)iterator.next();
            uUID = this.IIIIl((GameProfile)n);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlIl(PlayerEntity playerEntity) {
        if (playerEntity == null) {
            return;
        }
        this.lIl = playerEntity.getUuid();
        this.IlII = IlIlIlllI.ll(playerEntity.getGameProfile());
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIlIIIl lIllI(Text text, String string, String string2) {
        lIIlIIIl lIIlIIIl2;
        PlainTextContent plainTextContent;
        TextContent textContent = text.getContent();
        boolean bl = false;
        Style style = text.getStyle();
        if (textContent instanceof PlainTextContent) {
            String string3;
            Object object;
            plainTextContent = (PlainTextContent)textContent;
            if (!this.IIIlIl(style) && (object = plainTextContent.string()) != null && ((String)object).contains(string) && !((String)object).equals(string3 = ((String)object).replace(string, string2))) {
                textContent = PlainTextContent.of((String)string3);
                bl = true;
            }
        }
        plainTextContent = MutableText.of((TextContent)textContent).setStyle(style);
        for (Text text2 : text.getSiblings()) {
            lIIlIIIl lIIlIIIl3 = this.lIllI(text2, string, string2);
            plainTextContent.append(lIIlIIIl3.I());
            bl |= lIIlIIIl3.l();
        }
        lIIlIIIl2((Text)(bl ? plainTextContent : text), bl);
        return lIIlIIIl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Text llIII(GameProfile gameProfile, Text text) {
        String string;
        String string2;
        block5: {
            block6: {
                block3: {
                    block4: {
                        block2: {
                            if (!this.IIIlIIl()) return text;
                            if (text == null) return text;
                            if (gameProfile == null) break block2;
                            if (this.IIIll.lIl() != IlIIlIIl.l) break block3;
                            string2 = IlIlIlllI.ll(gameProfile);
                            if (string2 == null) return text;
                            if (string2.isBlank()) {
                                return text;
                            }
                            break block4;
                        }
                        return text;
                    }
                    string = this.IIIlI(gameProfile);
                    if (!this.lIIl.lI().lIlI()) break block5;
                    break block6;
                }
                if (!this.Illl(gameProfile)) {
                    return text;
                }
                if (this.llll.lIl() == IIIIIlllI.llI) return this.IlIIl(text);
                String string3 = IlIlIlllI.ll(gameProfile);
                String string4 = this.lIIl.lI().lIlI() ? string3 : this.lllI();
                return IIIIlI.I(string4, (IIIIIlllI)((Object)this.llll.lIl()), (llllII)((Object)this.llII.lIl()), (IIIllllI)((Object)this.IlIlI.lIl()), (IlIIIIIl)((Object)this.IlIII.lIl()), (llIIIlIl)((Object)this.llIl.lIl()), (IlIlIlll)((Object)this.ll.lIl()), (Boolean)this.IIl.lIl());
            }
            string = string2;
        }
        if (this.llll.lIl() == IIIIIlllI.llI) return this.IlIIII(text, string2, string);
        return IIIIlI.I(string, (IIIIIlllI)((Object)this.llll.lIl()), (llllII)((Object)this.llII.lIl()), (IIIllllI)((Object)this.IlIlI.lIl()), (IlIIIIIl)((Object)this.IlIII.lIl()), (llIIIlIl)((Object)this.llIl.lIl()), (IlIlIlll)((Object)this.ll.lIl()), (Boolean)this.IIl.lIl());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private CompletableFuture<GameProfile> llIlI(String string) {
        String string2 = URLEncoder.encode(string, StandardCharsets.UTF_8);
        String string3 = string2;
        String string4 = IlIl.IIII();
        HttpRequest httpRequest = HttpRequest.newBuilder(URI.create(string4 + string3)).timeout(Duration.ofSeconds(5L)).header(IIlI.IIII(), IIlIl.IIII()).GET().build();
        return ((CompletableFuture)IIlII.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString()).thenApply(httpResponse -> {
            if (httpResponse.statusCode() != 200) return null;
            if (httpResponse.body() == null) return null;
            if (((String)httpResponse.body()).isBlank()) {
                return null;
            }
            JsonObject jsonObject = JsonParser.parseString((String)((String)httpResponse.body())).getAsJsonObject();
            if (!jsonObject.has("id")) return null;
            if (!jsonObject.has("name")) {
                return null;
            }
            UUID uUID = this.IIllII(jsonObject.get("id").getAsString());
            if (uUID != null) return new GameProfile(uUID, jsonObject.get("name").getAsString());
            return null;
        })).exceptionally(throwable -> null);
    }

    /*
     * Enabled aggressive block sorting
     */
    private String llIll(MinecraftClient minecraftClient) {
        if (minecraftClient.player == null) {
            return "";
        }
        if (this.IIIll.lIl() != IlIIlIIl.II) return IlIlIlllI.ll(minecraftClient.player.getGameProfile());
        PlayerEntity playerEntity = this.IIIlll(minecraftClient);
        if (playerEntity == null) return this.IlII;
        this.lIlIl(playerEntity);
        return IlIlIlllI.ll(playerEntity.getGameProfile());
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void III() {
        block17: {
            block13: {
                block16: {
                    block18: {
                        block14: {
                            block19: {
                                block12: {
                                    block15: {
                                        var1_1 = MinecraftClient.getInstance();
                                        break block15;
lbl3:
                                        // 1 sources

                                        return;
lbl5:
                                        // 1 sources

                                        while (true) {
                                            this.III = null;
                                            break block12;
lbl8:
                                            // 1 sources

                                            return;
                                        }
lbl10:
                                        // 1 sources

                                        while (var4_2.equalsIgnoreCase(var2_3)) {
                                            ** GOTO lbl-1000
                                        }
                                        break block16;
lbl13:
                                        // 1 sources

                                        while (true) {
                                            var2_3 = this.llIll(var1_1);
                                            break block13;
                                            break;
                                        }
lbl16:
                                        // 1 sources

                                        while (this.Illl) {
                                            break block14;
                                        }
                                        break block17;
lbl19:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        return;
                                    }
                                    ** while (var1_1.player != null)
lbl25:
                                    // 1 sources

                                    ** while (true)
lbl26:
                                    // 1 sources

                                    while (var4_2.isBlank()) lbl-1000:
                                    // 4 sources

                                    {
                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    break block18;
                                }
                                this.Illl = true;
                                break block19;
lbl33:
                                // 1 sources

                                while (true) {
                                    if (System.currentTimeMillis() - this.I < 5000L) ** continue;
lbl35:
                                    // 2 sources

                                    while (true) {
                                        if (var4_2.equalsIgnoreCase(this.lIll)) break block14;
                                        ** GOTO lbl16
                                        break;
                                    }
                                    break;
                                }
                            }
                            this.lIIII(var1_1, var4_2).whenComplete((BiConsumer)(BiConsumer<Object, Throwable>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, IIIllI(net.minecraft.client.MinecraftClient java.lang.String java.lang.Object java.lang.Throwable ), (Ljava/lang/Object;Ljava/lang/Throwable;)V)((NickSwitcher)this, (MinecraftClient)var1_1, (String)var4_2));
                            ** while (true)
                            var4_2 = var3_4;
                            if (!((Boolean)this.lllI.lIl()).booleanValue()) ** GOTO lbl-1000
                            ** GOTO lbl26
                        }
                        return;
                    }
                    if (!var2_3.isBlank()) ** break;
                    ** while (true)
                    ** GOTO lbl10
                }
                ** while (!var4_2.equalsIgnoreCase((String)this.IllI))
lbl53:
                // 1 sources

                ** while (true)
            }
            this.Ill = var2_3;
            this.lIlII(var1_1);
            var3_4 = this.IIll();
            ** while (true)
            this.IIIII();
            return;
        }
        this.lIll = var4_2;
        ** while (true)
    }

    private CompletableFuture<GameProfile> lllII(String string) {
        return this.llIlI(string).thenCompose(gameProfile -> {
            if (gameProfile == null) {
                return CompletableFuture.completedFuture(null);
            }
            return this.lll((GameProfile)gameProfile);
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ int lllll(UUID uUID, GameProfile gameProfile, GameProfile gameProfile2) {
        UUID uUID2 = this.IIIIl(gameProfile);
        UUID uUID3 = this.IIIIl(gameProfile2);
        boolean bl = uUID != null && uUID.equals(uUID2);
        boolean bl2 = uUID != null && uUID.equals(uUID3);
        if (bl == bl2) return IlIlIlllI.ll(gameProfile).compareToIgnoreCase(IlIlIlllI.ll(gameProfile2));
        if (!bl) return 1;
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIlIIIl IIIIIl(Text text) {
        lIIlIIIl lIIlIIIl2;
        PlainTextContent plainTextContent;
        TextContent textContent = text.getContent();
        boolean bl = false;
        Style style = text.getStyle();
        if (textContent instanceof PlainTextContent) {
            plainTextContent = (PlainTextContent)textContent;
            if (!this.IIIlIl(style)) {
                String string = plainTextContent.string();
                String string2 = this.IIlIlI(string);
                if (string != null && string2 != null && !string.equals(string2)) {
                    textContent = PlainTextContent.of((String)string2);
                    bl = true;
                }
            }
        }
        plainTextContent = MutableText.of((TextContent)textContent).setStyle(style);
        for (String string2 : text.getSiblings()) {
            lIIlIIIl lIIlIIIl3 = this.IIIIIl((Text)string2);
            plainTextContent.append(lIIlIIIl3.I());
            bl |= lIIlIIIl3.l();
        }
        lIIlIIIl2((Text)(bl ? plainTextContent : text), bl);
        return lIIlIIIl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        this.lI.clear();
        this.lIll = "";
        this.IIIlI = "";
        this.Il = "";
        this.IIll = null;
        this.Ill = "";
        this.IllI = "";
        this.I = 0L;
        this.lIl = null;
        this.IlII = "";
        this.IIllI.clear();
        this.llI.set(0);
        this.l = "";
        this.llI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIlI() {
        String string = this.I();
        if (string.equals(this.l)) return;
        this.IIllI.clear();
        this.llI.set(0);
        this.l = string;
        this.llI();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIIlIl(Style style) {
        if (style == null) return false;
        if (style.getFont() == null) return false;
        return true;
    }

    private /* synthetic */ void IIIllI(MinecraftClient minecraftClient, String string, Object object, Throwable throwable) {
        minecraftClient.execute(() -> {
            this.Illl = false;
            if (!string.equalsIgnoreCase(this.lIll)) return;
            if (((Boolean)this.lllI.lIl()).booleanValue()) {
                if (throwable == null && object != null) {
                    this.III = object;
                    this.IllI = "";
                    this.I = 0L;
                    return;
                }
            } else {
                return;
            }
            this.III = null;
            this.IllI = string;
            this.I = System.currentTimeMillis();
            this.lIll = "";
        });
    }

    private PlayerEntity IIIlll(MinecraftClient minecraftClient) {
        block2: {
            block1: {
                block0: {
                    if (minecraftClient.player == null) break block0;
                    if (minecraftClient.world == null) break block0;
                    if (this.IIII.lIl() != IIIlIll.Il) break block1;
                    break block2;
                }
                return null;
            }
            return this.llII(minecraftClient);
        }
        return this.llIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static NickSwitcher IIlIIl() {
        NickSwitcher nickSwitcher = lIlI;
        if (nickSwitcher == null) return null;
        if (!nickSwitcher.IIIlIIl()) return null;
        NickSwitcher nickSwitcher2 = nickSwitcher;
        return nickSwitcher2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String IIlIlI(String string) {
        Object object;
        Object object2;
        Pattern pattern = this.IIlll;
        Map<String, String> map = this.IIIIl;
        if (pattern == null || map.isEmpty() || string == null || string.isEmpty()) {
            return string;
        }
        if (string.length() <= 512) {
            object2 = this.IlIIl;
            synchronized (object2) {
                object = this.IlIIl.get(string);
                if (object != null) {
                    return object;
                }
            }
        }
        object2 = this.Illll(string, pattern, map);
        if (string.length() <= 512) {
            object = this.IlIIl;
            synchronized (object) {
                this.IlIIl.put(string, (String)object2);
            }
        }
        return object2;
    }

    private UUID IIllII(String string) {
        if (string == null || string.length() != 32) {
            return null;
        }
        String string2 = string.substring(20);
        String string3 = "-";
        String string4 = string.substring(16, 20);
        String string5 = "-";
        String string6 = string.substring(12, 16);
        String string7 = "-";
        String string8 = string.substring(8, 12);
        String string9 = "-";
        String string10 = string.substring(0, 8);
        String string11 = string10 + string9 + string8 + string7 + string6 + string5 + string4 + string3 + string2;
        try {
            return UUID.fromString(string11);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    private Object IIllIl(String string, byte[] byArray) {
        NativeImage nativeImage;
        ByteArrayInputStream byteArrayInputStream;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null || minecraftClient.getTextureManager() == null) {
            return null;
        }
        try {
            byteArrayInputStream = new ByteArrayInputStream(byArray);
            try {
                nativeImage = NativeImage.read((InputStream)byteArrayInputStream);
            }
            finally {
                byteArrayInputStream.close();
            }
        }
        catch (IOException iOException) {
            return null;
        }
        if (!this.IlIlIl(nativeImage)) {
            nativeImage.close();
            return null;
        }
        int n = nativeImage.getHeight();
        String string2 = "x";
        int n2 = nativeImage.getWidth();
        String string3 = "-";
        String string4 = Integer.toUnsignedString(string.hashCode());
        String string5 = "nickswitcher/skins/";
        byteArrayInputStream = Identifier.of((String)"cats", (String)(string5 + string4 + string3 + n2 + string2 + n));
        minecraftClient.getTextureManager().registerTexture((Identifier)byteArrayInputStream, (AbstractTexture)new NativeImageBackedTexture(() -> ((Identifier)byteArrayInputStream).toString(), nativeImage));
        AssetInfo.TextureAssetInfo textureAssetInfo = new AssetInfo.TextureAssetInfo((Identifier)byteArrayInputStream, (Identifier)byteArrayInputStream);
        return new SkinTextures((AssetInfo.TextureAsset)textureAssetInfo, null, null, PlayerSkinType.WIDE, false);
    }

    public static void IIllll() {
        lIlI = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Text IlIIII(Text text, String string, String string2) {
        if (text == null) return text;
        if (string == null) return text;
        if (string.isBlank()) return text;
        if (string2 != null) {
            lIIlIIIl lIIlIIIl2 = this.lIllI(text, string, string2);
            if (!lIIlIIIl2.l()) return Text.literal((String)string2).setStyle(text.getStyle());
            return lIIlIIIl2.I();
        }
        return text;
    }

    /*
     * Unable to fully structure code
     */
    private PlayerEntity IlIIIl(MinecraftClient var1_1, String var2_2) {
        block10: {
            block13: {
                block7: {
                    block11: {
                        block9: {
                            block12: {
                                block8: {
                                    if (var1_1 == null) break block9;
                                    break block11;
lbl3:
                                    // 1 sources

                                    while (true) {
                                        if (var4_4 == null) break block7;
                                        break block8;
                                        break;
                                    }
lbl6:
                                    // 1 sources

                                    while (true) {
                                        if (var2_2 == null) break block9;
                                        break block10;
                                        break;
                                    }
                                }
                                if (var4_4.getGameProfile() != null) break block12;
                                break block7;
lbl12:
                                // 1 sources

                                return var4_4;
lbl14:
                                // 1 sources

                                while (!var5_5.isBlank() && var5_5.equalsIgnoreCase(var2_2)) {
                                    ** continue;
lbl16:
                                    // 1 sources

                                    ** GOTO lbl12
                                }
                                break block7;
                            }
                            var5_5 = IlIlIlllI.ll(var4_4.getGameProfile());
                            ** GOTO lbl14
                        }
lbl22:
                        // 3 sources

                        return null;
                    }
                    if (var1_1.world == null) ** GOTO lbl22
                    ** while (true)
                }
lbl28:
                // 2 sources

                while (var3_3.hasNext()) {
                    var4_4 = (PlayerEntity)var3_3.next();
                    ** continue;
lbl31:
                    // 1 sources

                    ** GOTO lbl3
                }
                break block13;
lbl33:
                // 1 sources

                while (true) {
                    var3_3 = var1_1.world.getPlayers().iterator();
                    ** GOTO lbl28
                    break;
                }
            }
            return null;
        }
        ** while (!var2_2.isBlank())
lbl40:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IlIIlI(Entity entity) {
        if (!(entity instanceof PlayerEntity)) return;
        PlayerEntity playerEntity = (PlayerEntity)entity;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) return;
        if (playerEntity == minecraftClient.player) {
            return;
        }
        this.lIl = playerEntity.getUuid();
        this.IlII = IlIlIlllI.ll(playerEntity.getGameProfile());
        if (this.IIIll.lIl() != IlIIlIIl.II) return;
        if (this.IIII.lIl() != IIIlIll.I) return;
        this.Ill = this.IlII;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Text IlIIll(Text text) {
        Text text2;
        if (this.IIlll == null) return text;
        if (this.IIIIl.isEmpty()) return text;
        lIIlIIIl lIIlIIIl2 = this.IIIIIl(text);
        if (!lIIlIIIl2.l()) {
            text2 = text;
            return text2;
        }
        text2 = lIIlIIIl2.I();
        return text2;
    }

    /*
     * Unable to fully structure code
     */
    private static /* synthetic */ GameProfile IlIlII(GameProfile var0, HttpResponse var1_1) {
        block18: {
            block12: {
                block11: {
                    block16: {
                        block17: {
                            block15: {
                                block14: {
                                    block13: {
                                        break block16;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            var4_4 = var3_3.getAsJsonArray("properties").iterator();
                                            break block11;
                                            break;
                                        }
lbl4:
                                        // 1 sources

                                        while (true) {
                                            if (var1_1.body() != null && !((String)var1_1.body()).isBlank()) break block12;
                                            break block13;
                                            break;
                                        }
                                        return var2_2;
                                    }
lbl10:
                                    // 2 sources

                                    return var2_2;
lbl12:
                                    // 1 sources

                                    while (true) {
                                        var2_2 = IlIlIlllI.I(var2_2, var7_7, new Property(var7_7, var8_8, var6_6.get("signature").getAsString()));
                                        break block11;
                                        break;
                                    }
lbl15:
                                    // 1 sources

                                    while (var6_6.has("name")) {
                                        break block14;
                                    }
                                    break block11;
lbl18:
                                    // 1 sources

                                    while (true) {
                                        if (!var6_6.has("signature")) break block15;
                                        ** continue;
                                        break;
                                    }
lbl21:
                                    // 1 sources

                                    return var2_2;
lbl23:
                                    // 1 sources

                                    while (true) {
                                        var6_6 = var5_5.getAsJsonObject();
                                        ** GOTO lbl15
                                        break;
                                    }
lbl26:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                if (var6_6.has("value")) break block17;
                                break block11;
                                var5_5 = (JsonElement)var4_4.next();
                                ** while (var5_5.isJsonObject())
lbl33:
                                // 1 sources

                                break block11;
                            }
                            var2_2 = IlIlIlllI.I(var2_2, var7_7, new Property(var7_7, var8_8));
                            break block11;
                        }
                        var7_7 = var6_6.get("name").getAsString();
                        break block18;
                    }
                    var2_2 = var0;
                    ** while (var1_1.statusCode() != 200)
lbl43:
                    // 1 sources

                    ** while (true)
                }
lbl45:
                // 2 sources

                while (true) {
                    if (!var4_4.hasNext()) ** continue;
                    ** continue;
                    break;
                }
            }
            var3_3 = JsonParser.parseString((String)((String)var1_1.body())).getAsJsonObject();
            ** while (var3_3.has((String)"properties"))
lbl51:
            // 1 sources

            ** while (true)
        }
        var8_8 = var6_6.get("value").getAsString();
        ** while (!var8_8.isBlank())
lbl55:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIlIl(NativeImage nativeImage) {
        if (nativeImage == null) {
            return false;
        }
        int n = nativeImage.getWidth();
        int n2 = nativeImage.getHeight();
        if (n != 64) return false;
        if (n2 == 32) return true;
        if (n2 == 64) return true;
        return false;
    }

    private boolean IlIlll(String string) {
        if (string == null || string.isBlank()) {
            return false;
        }
        try {
            URI uRI = URI.create(string.trim());
            String string2 = uRI.getScheme();
            return ("http".equalsIgnoreCase(string2) || "https".equalsIgnoreCase(string2)) && uRI.getHost() != null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    private static int IllIII(int n, int n2) {
        return IlIll[n ^ 0x8BB0FAA4] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IllIIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xEEF39E97;
        char[] cArray = IllII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IllIl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            NickSwitcher.IllIl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x44D794E1;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 16: {
                    n6 = 47;
                    continue block33;
                }
                case 27: {
                    n6 = 68;
                    continue block33;
                }
                case 14: {
                    n6 = 250;
                    continue block33;
                }
                case 3: {
                    n6 = 127;
                    continue block33;
                }
                case 8: {
                    n6 = 90;
                    continue block33;
                }
                case 28: {
                    n6 = 197;
                    continue block33;
                }
                case 7: {
                    n6 = 226;
                    continue block33;
                }
                case 13: {
                    n6 = 63;
                    continue block33;
                }
                case 18: {
                    n6 = 195;
                    continue block33;
                }
                case 22: {
                    n6 = 244;
                    continue block33;
                }
                case 20: {
                    n6 = 15;
                    continue block33;
                }
                case 26: {
                    n6 = 92;
                    continue block33;
                }
                case 31: {
                    n6 = 93;
                    continue block33;
                }
                case 17: {
                    n6 = 210;
                    continue block33;
                }
                case 5: {
                    n6 = 113;
                    continue block33;
                }
                case 23: {
                    n6 = 157;
                    continue block33;
                }
                case 15: {
                    n6 = 65;
                    continue block33;
                }
                case 10: {
                    n6 = 247;
                    continue block33;
                }
                case 29: {
                    n6 = 199;
                    continue block33;
                }
                case 9: {
                    n6 = 83;
                    continue block33;
                }
                case 11: {
                    n6 = 235;
                    continue block33;
                }
                case 30: {
                    n6 = 22;
                    continue block33;
                }
                case 2: {
                    n6 = 234;
                    continue block33;
                }
                case 6: {
                    n6 = 31;
                    continue block33;
                }
                case 1: {
                    n6 = 155;
                    continue block33;
                }
                case 24: {
                    n6 = 33;
                    continue block33;
                }
                case 19: {
                    n6 = 12;
                    continue block33;
                }
                default: {
                    n6 = 213;
                    continue block33;
                }
                case 4: {
                    n6 = 60;
                    continue block33;
                }
                case 25: {
                    n6 = 61;
                    continue block33;
                }
                case 21: {
                    n6 = 249;
                    continue block33;
                }
                case 12: 
            }
            n6 = 81;
        }
    }
}

