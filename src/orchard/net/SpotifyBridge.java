/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlll
 * Identified from direct evidence; see README.md
 *
 * Recovered strings in this class:
 *   - Missing Spotify bridge resource
 *   - Virel Spotify bridge
 *   -  feat
 *   - https://lrclib.net/api/get?
 *   - /assets/cats/r4q8/v2.ps1
 *   - spotify/album_art
 *   - spotify/disc_art
 *   - -NonInteractive
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
 *  com.google.gson.JsonParser
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.texture.AbstractTexture
 *  net.minecraft.client.texture.NativeImage
 *  net.minecraft.client.texture.NativeImageBackedTexture
 *  net.minecraft.util.Identifier
 */
package orchard.net;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.invoke.LambdaMetafactory;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.util.Identifier;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIllIIIl;
import orchard.internal.IIlIIIlII;
import orchard.internal.llIllIll;
import orchard.internal.lllIlll;

@Environment(value=EnvType.CLIENT)
final class SpotifyBridge {
    private static final IIIlIIIII I;
    private static final IIIlIIIII l;
    private static final IIIlIIIII II;
    private static final IIIlIIIII Il;
    private static final IIIlIIIII lI;
    private static final IIIlIIIII ll;
    private boolean III;
    private volatile boolean IIl;
    private static final IIIlIIIII IlI;
    private volatile lllIlll Ill;
    private static final IIIlIIIII lII;
    private static final IIIlIIIII lIl;
    private static final ExecutorService llI;
    private static final IIIlIIIII lll;
    private static final IIIlIIIII IIII;
    private static final IIIlIIIII IIIl;
    private static final IIIlIIIII IIlI;
    private static final int IIll = 0x200000;
    private static final long IlII = 400L;
    private static final IIIlIIIII IlIl;
    private static final HttpClient IllI;
    private static final IIIlIIIII Illl;
    private static final long lIII = 2000L;
    private static final IIIlIIIII lIIl;
    private final Map<String, llIllIll> lIlI = new IIlIIIlII(this, 32, 0.75f, true);
    private static final IIIlIIIII lIll;
    private static final IIIlIIIII llII;
    private static final IIIlIIIII llIl;
    private volatile boolean lllI;
    private static final IIIlIIIII llll;
    private static final IIIlIIIII IIIII;
    private static final IIIlIIIII IIIIl;
    private static final IIIlIIIII IIIlI;
    private static final IIIlIIIII IIIll;
    private static final IIIlIIIII IIlII;
    private static final IIIlIIIII IIlIl;
    private static final IIIlIIIII IIllI;
    private static final IIIlIIIII IIlll;
    private static final IIIlIIIII IlIII;
    private static final IIIlIIIII IlIIl;
    private static final IIIlIIIII IlIlI;
    private volatile boolean IlIll = true;
    private static final int IllII = 32;
    private volatile CompletableFuture<?> IllIl;
    private static final IIIlIIIII IlllI;
    private static final IIIlIIIII Illll;
    private static final IIIlIIIII lIIII;
    private static final IIIlIIIII lIIIl;
    private static final IIIlIIIII lIIlI;
    private volatile String lIIll;
    private volatile Process lIlII;
    private static final int[] lIlIl;
    private static final String[] lIllI;
    private static final Object[] lIlll;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String I(String string) {
        String string2;
        if (string == null) {
            string2 = SpotifyBridge.IIIII();
            return string2;
        }
        string2 = string.strip();
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void l(MinecraftClient minecraftClient, lllIlll lllIlll2) {
        if (!this.IlIll) return;
        if (minecraftClient == null) return;
        if (!lllIlll2.lI()) return;
        if (!lllIlll2.IlI().equals(this.lIIll)) {
            llIllIll llIllIll3 = this.lIlI.get(lllIlll2.IlI());
            if (llIllIll3 == null) {
                this.lIIll = lllIlll2.IlI();
                this.IllIl = ((CompletableFuture)SpotifyBridge.Ill(lllIlll2).exceptionally(throwable -> llIllIll.I)).thenAccept(llIllIll2 -> minecraftClient.execute(() -> {
                    this.IlIlI(lllIlll2.IlI(), (llIllIll)llIllIll2);
                    lllIlll lllIlll3 = this.Ill;
                    if (lllIlll3.IlI().equals(lllIlll2.IlI())) {
                        this.Ill = lllIlll3.III((llIllIll)llIllIll2);
                    }
                }));
                return;
            }
            this.Ill = lllIlll2.III(llIllIll3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    void II(MinecraftClient minecraftClient) {
        this.IIl = false;
        Process process = this.lIlII;
        if (process != null) {
            process.destroy();
        }
        this.Ill = lllIlll.lII();
        this.lIIll = SpotifyBridge.IIIII();
        this.lIlI.clear();
        CompletableFuture<?> completableFuture = this.IllIl;
        if (completableFuture != null) {
            completableFuture.cancel(true);
        }
        if (minecraftClient == null) return;
        if (!this.III) return;
        minecraftClient.execute(() -> {
            if (this.III && minecraftClient.getTextureManager() != null) {
                minecraftClient.getTextureManager().destroyTexture(SpotifyBridge.IIIIl());
                minecraftClient.getTextureManager().destroyTexture(SpotifyBridge.Illll());
                this.III = false;
            }
        });
    }

    private static NativeImage Il(byte[] byArray) {
        NativeImage nativeImage;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        try {
            nativeImage = NativeImage.read((InputStream)byteArrayInputStream);
        }
        catch (Throwable throwable) {
            try {
                try {
                    byteArrayInputStream.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException iOException) {
                return null;
            }
        }
        byteArrayInputStream.close();
        return nativeImage;
    }

    /*
     * Enabled aggressive block sorting
     */
    SpotifyBridge() {
        this.Ill = lllIlll.lII();
        this.lIIll = SpotifyBridge.IIIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(String string) {
        if (string == null) return "";
        if (!string.isBlank()) {
            String string2 = string;
            int n = string2.indexOf(44);
            if (n > 0) {
                string2 = string2.substring(0, n);
            }
            int n2 = string2.toLowerCase().indexOf(IIIII.IIII());
            if (n2 <= 0) return string2.trim();
            string2 = string2.substring(0, n2);
            return string2.trim();
        }
        return "";
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIl(NativeImage nativeImage) {
        if (nativeImage == null) return false;
        if (nativeImage.getWidth() < 8) return false;
        if (nativeImage.getHeight() < 8) return false;
        if (nativeImage.getWidth() > 2048) return false;
        if (nativeImage.getHeight() > 2048) return false;
        return true;
    }

    private static double IlI(JsonObject jsonObject, IIIlIIIII iIIlIIIII) {
        JsonElement jsonElement = jsonObject.get(iIIlIIIII.IIII());
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return 0.0;
        }
        try {
            return jsonElement.getAsDouble();
        }
        catch (RuntimeException runtimeException) {
            return 0.0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static CompletableFuture<llIllIll> Ill(lllIlll lllIlll2) {
        long l2 = lllIlll2.I();
        String string = lllIlll2.II();
        String string2 = lllIlll2.llI();
        String string3 = SpotifyBridge.IllI(string);
        String string4 = SpotifyBridge.ll(string2);
        long l3 = Math.max(0L, Math.round((double)l2 / 1000.0));
        String string5 = Illl.IIII();
        String string6 = SpotifyBridge.IIII(lllIlll2.Il());
        String string7 = IIIl.IIII();
        String string8 = SpotifyBridge.IIII(string2);
        String string9 = IlIII.IIII();
        String string10 = SpotifyBridge.IIII(string);
        String string11 = IlIlI.IIII();
        String string12 = string11 + string10 + string9 + string8 + string7 + string6 + string5 + l3;
        string9 = string12;
        string10 = lII.IIII();
        URI uRI = URI.create(string10 + string9);
        return SpotifyBridge.lllI(uRI, false, l2).thenCompose(llIllIll2 -> {
            if (llIllIll2.lI()) {
                String string5 = SpotifyBridge.IIII(string2);
                String string6 = IlIII.IIII();
                String string7 = SpotifyBridge.IIII(string);
                String string8 = IIIll.IIII();
                URI uRI = URI.create(string8 + string7 + string6 + string5);
                return SpotifyBridge.lllI(uRI, true, l2).thenCompose(llIllIll3 -> {
                    block5: {
                        block4: {
                            if (!llIllIll3.lI()) return CompletableFuture.completedFuture(llIllIll3);
                            if (!string3.equalsIgnoreCase(string)) break block4;
                            if (string4.equalsIgnoreCase(string2)) break block5;
                        }
                        String string5 = SpotifyBridge.IIII(string4);
                        String string6 = IlIII.IIII();
                        String string7 = SpotifyBridge.IIII(string3);
                        String string8 = IIIll.IIII();
                        URI uRI = URI.create(string8 + string7 + string6 + string5);
                        return SpotifyBridge.lllI(uRI, true, l2).thenCompose(llIllIll2 -> {
                            if (!llIllIll2.lI()) {
                                return CompletableFuture.completedFuture(llIllIll2);
                            }
                            String string2 = SpotifyBridge.IIII(string3);
                            String string3 = IIIll.IIII();
                            URI uRI = URI.create(string3 + string2);
                            return SpotifyBridge.lllI(uRI, true, l2);
                        });
                    }
                    String string9 = SpotifyBridge.IIII(string3);
                    String string10 = IIIll.IIII();
                    URI uRI = URI.create(string10 + string9);
                    return SpotifyBridge.lllI(uRI, true, l2);
                });
            }
            return CompletableFuture.completedFuture(llIllIll2);
        });
    }

    private static long lII(JsonObject jsonObject, IIIlIIIII iIIlIIIII) {
        JsonElement jsonElement = jsonObject.get(iIIlIIIII.IIII());
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return 0L;
        }
        try {
            return jsonElement.getAsLong();
        }
        catch (RuntimeException runtimeException) {
            return 0L;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llI(MinecraftClient minecraftClient) {
        if (!this.III) return;
        if (minecraftClient == null) return;
        if (minecraftClient.getTextureManager() == null) {
            return;
        }
        minecraftClient.getTextureManager().destroyTexture(SpotifyBridge.IIIIl());
        minecraftClient.getTextureManager().destroyTexture(SpotifyBridge.Illll());
        this.III = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String IIII(String string) {
        String string2;
        if (string == null) {
            string2 = SpotifyBridge.IIIII();
            return URLEncoder.encode(string2, StandardCharsets.UTF_8);
        }
        string2 = string;
        return URLEncoder.encode(string2, StandardCharsets.UTF_8);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void IIIl(boolean bl) {
        this.IlIll = bl;
        lllIlll lllIlll2 = this.Ill;
        if (!(bl && lllIlll2.lI() && lllIlll2.IIIl().lI())) {
            return;
        }
        this.l(MinecraftClient.getInstance(), lllIlll2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIl(MinecraftClient minecraftClient, byte[] byArray) {
        if (minecraftClient == null) return false;
        if (minecraftClient.getTextureManager() == null) return false;
        if (byArray.length == 0) return false;
        if (byArray.length <= 0x200000) {
            NativeImage nativeImage = SpotifyBridge.Il(byArray);
            NativeImage nativeImage2 = SpotifyBridge.Il(byArray);
            if (!SpotifyBridge.IIl(nativeImage) || !SpotifyBridge.IIl(nativeImage2)) {
                SpotifyBridge.llIl(nativeImage);
                SpotifyBridge.llIl(nativeImage2);
                return false;
            }
            SpotifyBridge.IIlIl(nativeImage);
            SpotifyBridge.IIlII(nativeImage2);
            if (this.III) {
                minecraftClient.getTextureManager().destroyTexture(SpotifyBridge.IIIIl());
                minecraftClient.getTextureManager().destroyTexture(SpotifyBridge.Illll());
            }
            Identifier identifier = SpotifyBridge.IIIIl();
            Identifier identifier2 = SpotifyBridge.Illll();
            minecraftClient.getTextureManager().registerTexture(identifier, (AbstractTexture)new NativeImageBackedTexture(() -> ((Identifier)identifier).toString(), nativeImage));
            minecraftClient.getTextureManager().registerTexture(identifier2, (AbstractTexture)new NativeImageBackedTexture(() -> ((Identifier)identifier2).toString(), nativeImage2));
            this.III = true;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IllI(String string) {
        if (string == null) return "";
        if (string.isBlank()) {
            return "";
        }
        String string2 = string;
        string2 = string2.replaceAll(lIIIl.IIII(), "");
        string2 = string2.replaceAll(lll.IIII(), "");
        string2 = string2.replaceAll(IIIlI.IIII(), "");
        string2 = string2.replaceAll(llIl.IIII(), "");
        return string2.trim();
    }

    private static /* synthetic */ Thread Illl(Runnable runnable) {
        Thread thread = new Thread(runnable, lIIII.IIII());
        thread.setDaemon(true);
        return thread;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 22609;
        var7_2 = "\u2828\u28d9\u2827\u28a1\u2806\u283c\u28d6\u2879\u468f\u467b\u4680\u4621\u46a6\u46aa\u460a\u46b5\u4669\u4693\u469e\u4676\u4699\u46ac\u46cd\u4607\u46dc\u467e\u461f\u46d9\u4620\u462b\u466d\u4652\u4a75\u4a81\u4a7a\u4adb\u4a5c\u4a50\u4af0\u4a4f\u4a93\u4a69\u4a64\u4a8f\u4a60\u4a45\u4a7e\u4ad1\u4a2a\u4abf\u4ad3\u4a08\u4ad9\u4aff\u4add\u4aa8\u719c\u7137\u71eb\u710c\u71aa\u71b2\u7115\u71b7\u716b\u71ba\u71a0\u7170\u719b\u71a4\u71ae\u7124\u71d3\u7173\u713d\u71d4\u7128\u7120\u7155\u7136\u71e1\u717c\u71e2\u719a\u83cc\u8346\u83e5\u8344\u83e1\u83fa\u837f\u83e1\u832e\u83c4\u83ff\u8300\u83da\u83eb\u83f9\u836a\u8398\u8371\u837f\u83c1\uab6a\uab90\uab1f\uab9c\uab00\uab14\uab81\uab03\uabd1\uab10\uab3b\uabfe\uab22\uab0a\uab7c\uabca\ucf14\ucfee\ucf61\ucfe2\ucf67\ucf41\ucfc9\ucf7e\ucfab\ucf44\ucf7f\ucfa4\ucf5b\ucf7f\ucf47\ucfc7\ucf1c\ucfbb\ucffe\ucf1e\uff58\uffa2\uff39\uffae\uff2b\uff35\uff95\uff3f\uffed\uff22\uff39\uff93\ub6ee\ub627\ub6d6\ub647\u6e94\u6e39\u6ec7\u6e48\u6ee6\u6ed3\u6e73\u6ee0\u6e28\u6eb7\u6edd\u6e37\u6edb\u6efc\u6ecb\u6e42\u6e8f\u6e05\u6e61\u6eb7\u6e63\u6e19\u6e1d\u6e4e\u6eae\u6e71\u6ef7\u6eb4\u6e1d\u6ec6\u6eb4\u6e1b\ucd05\ucd82\ucd74\ucd9c\ucd32\ucd07\ucd9d\ucd2a\ucdfb\ucd63\ucd3f\ucddd\ucd0b\ucd3b\ucd29\ucd93\ucd48\ucde8\ucdaa\ucd60\ucdee\ucd85\ucdfc\ucdbf\ucd73\ucd8c\ucd71\ucd5d\ucdce\ucd4a\ucd6f\ucdce\ucd03\ucd88\ucd51\ucddc\ucd15\ucd24\ucdd4\ucd40\ucdc6\ucd3c\ucd62\ucdb3\u852e\u85a4\u852a\u85b7\u8503\u8532\u85a0\u852a\u85c0\u850f\u8541\u85e2\u853d\u8527\u8517\u85d5\udb9e\udb74\udbcf\udb4f\udbed\udbe1\udb41\udbe9\udb23\udbcd\udbd5\udb30\udbd3\udbf7\udbfd\udb62\udb83\udb27\udb13\udbc9\u5f9c\u5f76\u5fcd\u5f53\u5fe8\u5fc6\u5f79\u5fcf\u5f11\u5ff4\u5fd3\u5f3f\u5fd0\u5ff5\u5fda\u5f46\u38fa\u3810\u38bf\u382e\u388a\u38af\u380f\u388c\u3842\u38b8\u38b1\u3854\u38a2\u3898\u38ee\u3858\u1bc8\u1b43\u1bd5\u1b47\u1be0\u1bec\u1b62\u1bec\u1b37\u1bb1\u1bdb\u1b06\u1bd9\u1bd3\u1bc1\u1b59\u1b9a\u1b3a\u1b67\u1bab\u1b64\u1b6d\u1b6d\u1b6b\u1bbe\u1b31\u1bf4\u1ba0\u1b11\u1b98\u1bc4\u1b31\u1bd1\u1b5a\u1b8c\u1b1e\u95d1\u955a\u95cc\u955e\u95f9\u95f5\u957b\u95f5\u952e\u95a8\u95c2\u951f\u95c0\u95ca\u95d8\u9540\u9583\u9523\u957e\u95b2\u957d\u9574\u9574\u9572\u95a7\u9528\u95ed\u95b9\u9508\u9581\u95dd\u951a\u95c8\u954c\u9582\u9508\u95dd\u95ca\u9549\u9597\u9546\u95ef\u95ed\u951f\u958a\u95d2\u9592\u9565\u95bf\u9507\u953a\u959e\u9548\u9565\u9548\u9557\u374e\u37cc\u376c\u37cb\u377f\u375e\u37c0\u370f\u37b6\u3767\u3766\u37a1\u3749\u377d\u371b\u37ad\u19ad\u1906\u19da\u193d\u199b\u1983\u1924\u19bf\u195a\u198b\u1991\u1941\u19aa\u1995\u199f\u1915\u19e2\u1942\u196b\u19b4\u1902\u196c\u1959\u1934\u19c7\u191c\u19f2\u19dc\u9173\u9187\u911f\u91de\u915d\u916c\u91cc\u914f\u91a0\u9178\u917a\u919b\u9166\u9140\u9178\u91fd\u737d\u73f7\u7348\u73e7\u7351\u7348\u73de\u7322\u739b\u7366\u7315\u73b6\u736a\u7320\u7379\u7385\u252d\u25b0\u253e\u25b3\u2505\u251c\u25b8\u2516\u25c9\u250b\u2534\u25d4\ue64c\ue6d3\ue652\ue6d4\ue665\ue67c\ue6e6\ue60a\ue6aa\ue642\ue62a\ue6da\u6544\u65cd\u652b\u65ca\u656c\u6562\u65f7\u6512\u4a9f\u4a02\u4a9c\u4a16\u4ab7\u4aad\u4a2c\u4ab7\u860f\u8692\u860c\u8686\u8622\u8614\u8696\u8625\u86e9\u8636\u8668\u8698\uc39c\uc302\uc3ad\uc303\uc3b1\uc3ad\uc30e\uc3cd\u49ac\u4926\u4985\u4928\u4980\u499a\u495a\u49a1\u4941\u499e\u49b9\u4934\u49bf\u49b2\u49e2\u4954\u33d3\u335d\u33cf\u335f\u33fa\u33e2\u3322\u33d9\u3339\u33e6\u33c1\u334c\u33c7\u33ca\u339a\u332c\u7be3\u7b6d\u7bff\u7b6f\u7bca\u7bd2\u7b12\u7be9\u7b09\u7bd6\u7bf3\u7b77\ua57c\ua5f6\ua549\ua5e6\ua554\ua549\ua5f9\ua54e\ua59f\ua541\ua51f\ua5ef\u1e22\u1ef6\u1e52\u1ed3\u1e0a\u1e4f\u1eea\u1e56\u1e89\u1e58\u1e61\u1eb3\u1e62\u1e24\u1e46\u1ef5\u1e24\u1ed4\u1ed5\u1e21\u1e8f\u1edb\u1e88\u1ef8\u1e1d\u1ec5\u1e1e\u1e02\u1ea9\u1e73\u1e35\u1eb1\u1e62\u1ef4\u1e71\u1e8f\u1e75\u1e47\u1ef2\u1e35\u1eed\u1e62\u1e59\u1eba\u1e25\u1e7b\u1e78\u1eeb\u1e14\u1edb\u1e86\u1e0b\u1ef1\u1ecf\u1ef8\u1ef2\u1e3b\u1eeb\u1e18\u1e02\u1e96\u1e28\u1e00\u1e98\u1e1a\u1e94\u1e6e\u1eca\u1d6e\u1dba\u1d1e\u1d9f\u1d46\u1d03\u1da6\u1d1a\u1dc5\u1d14\u1d2a\u1dea\u1d2e\u1d68\u1d0a\u1db9\u1d68\u1d98\u1d99\u1d6d\u1dc3\u1d97\u1dc4\u1db4\u1d51\u1d89\u1d52\u1d4e\u1de5\u1d3f\u1d79\u1dfd\u1d2e\u1db8\u1d3d\u1dc3\u1d39\u1d0b\u1dbe\u1d79\u1da1\u1d2e\u1d15\u1df6\u1d69\u1d37\u1d34\u1da7\u1d58\u1d97\u1dca\u1d47\u1dbd\u1d83\u1db4\u1dbe\u1d77\u1da7\u1d54\u1d4e\u1dda\u1d64\u1d4c\u1dd4\u1d56\u1ddd\u1d79\u1d86\u2c3e\u2cea\u2c4e\u2ccf\u2c16\u2c53\u2cf6\u2c4a\u2c95\u2c41\u2c7e\u2cbb\u2c74\u2c37\u2c41\u2cf0\u2c3d\u2c87\u2cef\u2c03\u2ccc\u2cbe\u2c87\u2cc6\u2c01\u2cf0\u2c5d\u2c24\u2cb1\u2c6d\u2c26\u2cb1\u2c7c\u2cf8\u2c0c\u2c97\u2c6d\u2c71\u2cee\u2c39\u2cf1\u2c7d\u2c6b\u2ca4\u2c3c\u2c02\u2c46\u2ce1\u2c0f\u2cd7\u2c82\u2c1c\u2cfc\u2cf8\u2ca7\u2c96\u2c7e\u2c81\u2c26\u2c6a\u2c8f\u2c37\u2c39\u2c85\u2c1b\u2cb6\u2c36\u2c8a\u2c6f\u2c29\u2cae\u2c2f\u2cc0\u2c4d\u2c77\u2cff\u2c08\u2c7b\u2c67\u2c9c\u2c56\u2cef\u2cfe\u2c38\u2cb3\u2c84\u2cfb\u2c85\u2c22\u2c8b\u2c63\u2c67\u2cf5\u2c4d\u2c6c\u2cce\u2c5c\u2cb5\u2c35\u2ce0\u2c0c\u2c0b\u2c88\u2c28\u2cc7\u2c6c\u2c0c\u2cd2\u232d\u23f9\u235d\u23dc\u2305\u2340\u23e5\u2359\u2386\u2357\u236e\u23bc\u2371\u2354\u2336\u23d2\u2327\u2384\u23d2\u230a\u23d8\u23e9\u23d3\u23d3\u2312\u23e0\u231d\u2312\u23a5\u2318\u2317\u23bf\u2368\u23e4\u233d\u23ad\u2375\u2348\u23b8\u232d\u23a8\u2357\u2356\u23ad\u232a\u2311\u2377\u23e7\u2319\u23d7\u2389\u2307\u23ed\u2398\u23e3\u2383\u2333\u2392\u2303\u2357\u23c3\u2322\u230c\u23bc\u230c\u23e3\u2339\u2396\u237a\u233d\u239f\u232d\u23e3\u2359\u2307\u2386\ufff4\uff25\uffb8\uff31\uff81\uff99\uff58\ufffa";
        var8_3 = "\u5859\u5849\u5849\u584d\u5845\u5841\u5845\u585d\u5855\u5871\u587d\u5841\u5845\u5841\u5841\u5875\u5869\u5841\u584d\u5841\u5841\u585d\u585d\u5859\u5859\u585d\u5859\u5841\u5841\u585d\u585d\u5815\u5815\u583d\u581d\u5859".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl13
        while (true) {
            block12: {
                block13: {
                    if (var15_10 < var14_9.length) break block12;
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_3.length) break block13;
                    var13_8 = 0;
lbl13:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = 0;
                    if (var13_8 == 0) {
                        SpotifyBridge.lIllI = var9_4;
                        SpotifyBridge.lIlll = new Object[var9_4.length];
                        var2_13 = -1741947139;
                        var0_11 = "\u00fe%$\u00b0$\f\u00ef\u00fdF\u00f7Q\u00af\u00eb{?z\u00cfc\u00c3S\u00fb@\u00db]\u00d5p.\u000e`\u00d6\r\u00a3\u00cf\u00a9n\u008bR*-W0\u00af\u00dcC\u0011\u00cd\u001c\u00b2J<\u00d5yuv,\u007f".getBytes("ISO-8859-1");
                        var1_12 = var0_11.length / 4;
                        SpotifyBridge.lIlIl = new int[var1_12];
                        var3_14 = 0;
                        var4_15 = 0;
                        do {
                            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                            SpotifyBridge.lIlIl[var4_15] = var5_16 ^= var2_13;
                            var3_14 += 4;
                        } while (++var4_15 < var1_12);
                        SpotifyBridge.IIllI = StringFactory.IIII("cats");
                        SpotifyBridge.llll = StringFactory.IIII("spotify/album_art");
                        SpotifyBridge.IIII = StringFactory.IIII("spotify/disc_art");
                        SpotifyBridge.lIIII = StringFactory.IIII("Virel Spotify bridge");
                        SpotifyBridge.Il = StringFactory.IIII("powershell.exe");
                        SpotifyBridge.IlIIl = StringFactory.IIII("-NoProfile");
                        SpotifyBridge.IlIl = StringFactory.IIII("-NonInteractive");
                        SpotifyBridge.IIlI = StringFactory.IIII("-Command");
                        SpotifyBridge.IIlIl = StringFactory.IIII("-");
                        SpotifyBridge.llII = StringFactory.IIII("/assets/cats/r4q8/v2.ps1");
                        SpotifyBridge.l = StringFactory.IIII("Missing Spotify bridge resource");
                        SpotifyBridge.IlIlI = StringFactory.IIII("track_name=");
                        SpotifyBridge.IlIII = StringFactory.IIII("&artist_name=");
                        SpotifyBridge.IIIl = StringFactory.IIII("&album_name=");
                        SpotifyBridge.Illl = StringFactory.IIII("&duration=");
                        SpotifyBridge.lII = StringFactory.IIII("https://lrclib.net/api/get?");
                        SpotifyBridge.IIIll = StringFactory.IIII("https://lrclib.net/api/search?track_name=");
                        SpotifyBridge.IIlll = StringFactory.IIII("User-Agent");
                        SpotifyBridge.lIIl = StringFactory.IIII("Virel-Spotify-HUD/1.0");
                        SpotifyBridge.I = StringFactory.IIII("syncedLyrics");
                        SpotifyBridge.lI = StringFactory.IIII("plainLyrics");
                        SpotifyBridge.IlllI = StringFactory.IIII("available");
                        SpotifyBridge.IIIIl = StringFactory.IIII("mediaId");
                        SpotifyBridge.lIl = StringFactory.IIII("title");
                        SpotifyBridge.Illll = StringFactory.IIII("artist");
                        SpotifyBridge.IIlII = StringFactory.IIII("artwork");
                        SpotifyBridge.IlI = StringFactory.IIII("album");
                        SpotifyBridge.II = StringFactory.IIII("positionMs");
                        SpotifyBridge.lIll = StringFactory.IIII("durationMs");
                        SpotifyBridge.lIIlI = StringFactory.IIII("duration");
                        SpotifyBridge.ll = StringFactory.IIII("playing");
                        SpotifyBridge.lIIIl = StringFactory.IIII("(?i)\\s*\\([\\s\\S]*?(feat\\.|featuring|with)[\\s\\S]*?\\)");
                        SpotifyBridge.lll = StringFactory.IIII("(?i)\\s*\\[[\\s\\S]*?(feat\\.|featuring|with)[\\s\\S]*?\\]");
                        SpotifyBridge.IIIlI = StringFactory.IIII("(?i)\\s*-\\s*(remastered|remaster|live|radio edit|bonus track|instrumental)[\\s\\S]*$");
                        SpotifyBridge.llIl = StringFactory.IIII("(?i)\\s*\\((remastered|remaster|live|radio edit)[\\s\\S]*?\\)");
                        SpotifyBridge.IIIII = StringFactory.IIII(" feat");
                        SpotifyBridge.llI = Executors.newSingleThreadExecutor((ThreadFactory)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Runnable;)Ljava/lang/Thread;, Illl(java.lang.Runnable ), (Ljava/lang/Runnable;)Ljava/lang/Thread;)());
                        SpotifyBridge.IllI = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).followRedirects(HttpClient.Redirect.NORMAL).build();
                        return;
                    }
                }
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
            }
            switch (var15_10 % 5) {
                case 1: {
                    v0 = 28;
                    break;
                }
                case 2: {
                    v0 = 100;
                    break;
                }
                case 4: {
                    v0 = 5;
                    break;
                }
                default: {
                    v0 = 125;
                    break;
                }
                case 3: {
                    v0 = 36;
                }
            }
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIl(MinecraftClient minecraftClient, IIIllIIIl iIIllIIIl) {
        lllIlll lllIlll2;
        long l2;
        long l3;
        boolean bl;
        boolean bl2;
        block8: {
            block7: {
                if (!this.IIl) {
                    return;
                }
                if (!iIIllIIIl.lI()) {
                    this.Ill = lllIlll.lII();
                    this.llI(minecraftClient);
                    return;
                }
                bl2 = !iIIllIIIl.III().equals(this.Ill.IlI());
                boolean bl3 = bl = !bl2 && this.III;
                if (iIIllIIIl.ll() == null) break block7;
                if (this.IlIl(minecraftClient, iIIllIIIl.ll())) {
                    bl = true;
                    break block8;
                } else if (bl2) {
                    this.llI(minecraftClient);
                }
                break block8;
            }
            if (bl2) {
                this.llI(minecraftClient);
            }
        }
        llIllIll llIllIll2 = this.lIlI.getOrDefault(iIIllIIIl.III(), llIllIll.I);
        long l4 = System.currentTimeMillis();
        long l5 = Math.max(0L, iIIllIIIl.II());
        if (!bl2 && this.Ill.lI() && this.Ill.ll() && iIIllIIIl.IlI() && (l3 = Math.abs((l2 = this.Ill.IIl(l4)) - l5)) < 400L) {
            l5 = l2;
        }
        lllIlll2(true, iIIllIIIl.III(), SpotifyBridge.I(iIIllIIIl.I()), SpotifyBridge.I(iIIllIIIl.Il()), SpotifyBridge.I(iIIllIIIl.l()), l5, Math.max(0L, iIIllIIIl.Ill()), iIIllIIIl.IlI(), l4, bl, llIllIll2);
        lllIlll lllIlll3 = lllIlll2;
        this.Ill = lllIlll3;
        if (!this.IlIll) return;
        if (!llIllIll2.lI()) return;
        this.l(minecraftClient, lllIlll3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lIll(MinecraftClient minecraftClient) {
        while (this.IIl) {
            try {
                Object object;
                Process process = new ProcessBuilder(Il.IIII(), IlIIl.IIII(), IlIl.IIII(), IIlI.IIII(), IIlIl.IIII()).redirectErrorStream(true).start();
                try (Closeable closeable = SpotifyBridge.class.getResourceAsStream(llII.IIII());){
                    object = process.getOutputStream();
                    try {
                        if (closeable == null) {
                            throw new IOException(l.IIII());
                        }
                        ((InputStream)closeable).transferTo((OutputStream)object);
                    }
                    finally {
                        if (object != null) {
                            ((OutputStream)object).close();
                        }
                    }
                }
                this.lIlII = process;
                try {
                    closeable = new BufferedReader(new InputStreamReader(process.getInputStream(), StandardCharsets.UTF_8));
                    try {
                        while (this.IIl && (object = ((BufferedReader)closeable).readLine()) != null) {
                            IIIllIIIl iIIllIIIl = SpotifyBridge.IIlll((String)object);
                            if (iIIllIIIl == null) continue;
                            minecraftClient.execute(() -> this.lIIl(minecraftClient, iIIllIIIl));
                        }
                    }
                    finally {
                        ((BufferedReader)closeable).close();
                    }
                }
                finally {
                    process.destroy();
                    if (!process.waitFor(500L, TimeUnit.MILLISECONDS)) {
                        process.destroyForcibly();
                    }
                }
            }
            catch (Exception exception) {
            }
            finally {
                this.lIlII = null;
            }
            if (!this.IIl) continue;
            try {
                Thread.sleep(2000L);
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }

    lllIlll llII() {
        return this.Ill;
    }

    private static void llIl(NativeImage nativeImage) {
        if (nativeImage != null) {
            nativeImage.close();
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static CompletableFuture<llIllIll> lllI(URI uRI, boolean bl, long l2) {
        HttpRequest httpRequest = HttpRequest.newBuilder(uRI).timeout(Duration.ofSeconds(8L)).header(IIlll.IIII(), lIIl.IIII()).GET().build();
        return ((CompletableFuture)IllI.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8)).thenApply(httpResponse -> {
            if (httpResponse.statusCode() < 200 || httpResponse.statusCode() >= 300 || httpResponse.body() == null || ((String)httpResponse.body()).length() > 2000000) {
                return llIllIll.I;
            }
            try {
                JsonObject jsonObject;
                JsonElement jsonElement = JsonParser.parseString((String)((String)httpResponse.body()));
                if (bl) {
                    JsonArray jsonArray = jsonElement.getAsJsonArray();
                    if (jsonArray.isEmpty()) {
                        return llIllIll.I;
                    }
                    jsonObject = SpotifyBridge.llll(jsonArray, l2);
                    if (jsonObject == null) {
                        return llIllIll.I;
                    }
                } else {
                    jsonObject = jsonElement.getAsJsonObject();
                    if (!SpotifyBridge.IllIl(jsonObject, l2)) {
                        return llIllIll.I;
                    }
                }
                return llIllIll.Il(SpotifyBridge.IlIIl(jsonObject, I), SpotifyBridge.IlIIl(jsonObject, lI));
            }
            catch (RuntimeException runtimeException) {
                return llIllIll.I;
            }
        })).exceptionally(throwable -> llIllIll.I);
    }

    /*
     * Unable to fully structure code
     */
    private static JsonObject llll(JsonArray var0, long var1_1) {
        block32: {
            block34: {
                block35: {
                    block26: {
                        block24: {
                            block19: {
                                block23: {
                                    block25: {
                                        block22: {
                                            block31: {
                                                block33: {
                                                    block29: {
                                                        block27: {
                                                            block20: {
                                                                block30: {
                                                                    block21: {
                                                                        block28: {
                                                                            break block28;
lbl1:
                                                                            // 1 sources

                                                                            while (!var11_8.isBlank()) {
                                                                                break block19;
                                                                            }
                                                                            break block29;
lbl4:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                if (!(var15_11 > 15.0)) break block20;
                                                                                break block21;
                                                                                break;
                                                                            }
                                                                        }
                                                                        var3_2 = null;
                                                                        var4_3 = 1.7976931348623157E308;
                                                                        break block30;
lbl11:
                                                                        // 3 sources

                                                                        return v0;
lbl13:
                                                                        // 1 sources

                                                                        while (var11_8.isBlank()) {
                                                                            break block22;
                                                                        }
                                                                        break block31;
                                                                    }
                                                                    var17_12 += 50000.0;
                                                                    break block20;
lbl19:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var8_5 = var0.iterator();
                                                                        break block23;
                                                                        break;
                                                                    }
lbl22:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        v0 = var0.get(0).getAsJsonObject();
                                                                        ** GOTO lbl11
                                                                        break;
                                                                    }
                                                                }
                                                                if (var1_1 <= 0L) break block32;
                                                                v1 = (double)var1_1 / 1000.0;
                                                                break block33;
lbl29:
                                                                // 1 sources

                                                                while (true) {
                                                                    v0 = var3_2;
                                                                    ** GOTO lbl11
                                                                    break;
                                                                }
lbl32:
                                                                // 2 sources

                                                                while (true) {
                                                                    v2 = 0.0;
                                                                    break block24;
                                                                    break;
                                                                }
                                                            }
lbl36:
                                                            // 2 sources

                                                            while (var17_12 < var4_3) {
                                                                break block25;
                                                            }
                                                            break block23;
lbl39:
                                                            // 1 sources

                                                            while (true) {
                                                                if (!var9_6.isJsonObject()) break block23;
                                                                break block26;
                                                                break;
                                                            }
lbl42:
                                                            // 1 sources

                                                            while (true) {
                                                                v0 = null;
                                                                ** continue;
                                                                break;
                                                            }
lbl45:
                                                            // 1 sources

                                                            while (var3_2 != null) {
                                                                ** continue;
lbl47:
                                                                // 1 sources

                                                                ** GOTO lbl29
                                                            }
                                                            break block34;
lbl49:
                                                            // 1 sources

                                                            while (true) {
                                                                if (!(var6_4 > 0.0)) ** GOTO lbl32
                                                                break block27;
                                                                break;
                                                            }
lbl52:
                                                            // 1 sources

                                                            while (true) {
                                                                var12_9 = SpotifyBridge.IlIIl(var10_7, SpotifyBridge.lI);
                                                                ** GOTO lbl13
                                                                break;
                                                            }
                                                        }
                                                        if (var13_10 > 0.0) ** break;
                                                        ** while (true)
                                                        break block35;
lbl59:
                                                        // 1 sources

                                                        while (true) {
                                                            var17_12 = var15_11;
                                                            ** GOTO lbl1
                                                            break;
                                                        }
                                                    }
lbl63:
                                                    // 2 sources

                                                    while (var6_4 > 10.0) {
                                                        ** continue;
lbl65:
                                                        // 1 sources

                                                        ** GOTO lbl4
                                                    }
                                                    ** GOTO lbl36
                                                }
lbl68:
                                                // 2 sources

                                                while (true) {
                                                    var6_4 = v1;
                                                    ** continue;
                                                    break;
                                                }
                                            }
lbl72:
                                            // 2 sources

                                            while (true) {
                                                var13_10 = SpotifyBridge.IlI(var10_7, SpotifyBridge.lIIlI);
                                                ** continue;
                                                break;
                                            }
                                        }
                                        ** while (!var12_9.isBlank())
lbl77:
                                        // 1 sources

                                        break block23;
                                    }
                                    var4_3 = var17_12;
                                    var3_2 = var10_7;
                                }
                                if (!var8_5.hasNext()) ** GOTO lbl45
                                var9_6 = (JsonElement)var8_5.next();
                                ** while (true)
                            }
                            var17_12 -= 10000.0;
                            ** GOTO lbl63
                        }
lbl89:
                        // 2 sources

                        while (true) {
                            var15_11 = v2;
                            ** continue;
                            break;
                        }
                    }
                    var10_7 = var9_6.getAsJsonObject();
                    var11_8 = SpotifyBridge.IlIIl(var10_7, SpotifyBridge.I);
                    ** while (true)
                }
                v2 = Math.abs(var13_10 - var6_4);
                ** while (true)
            }
            ** while (!var0.isEmpty())
lbl101:
            // 1 sources

            ** while (true)
        }
        v1 = 0.0;
        ** while (true)
    }

    private static String IIIII() {
        return String.valueOf(new char[0]);
    }

    private static Identifier IIIIl() {
        return Identifier.of((String)IIllI.IIII(), (String)llll.IIII());
    }

    /*
     * Enabled aggressive block sorting
     */
    void IIIll(MinecraftClient minecraftClient) {
        this.IIl = true;
        if (this.lllI) return;
        if (minecraftClient == null) {
            return;
        }
        this.lllI = true;
        CompletableFuture.runAsync(() -> this.lIll(minecraftClient), llI).whenComplete((void_, throwable) -> {
            this.lllI = false;
        });
    }

    /*
     * Unable to fully structure code
     */
    private static void IIlII(NativeImage var0) {
        block11: {
            block14: {
                block13: {
                    block12: {
                        block15: {
                            break block15;
lbl1:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var1_1 = var0.getWidth();
                        var2_2 = var0.getHeight();
                        ** while (true)
lbl7:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl9:
                        // 2 sources

                        while (true) {
                            ++var16_10;
                            break block11;
                            break;
                        }
lbl12:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        var3_3 = (double)var1_1 * 0.5;
                        var5_4 = (double)var2_2 * 0.5;
                        ** while (true)
lbl17:
                        // 1 sources

                        while (true) {
                            ++var15_9;
lbl19:
                            // 2 sources

                            while (var15_9 < var2_2) {
                                break block12;
                            }
                            break block13;
                            break;
                        }
lbl22:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        var11_7 = (double)Math.min(var1_1, var2_2) * 0.07608695652173914;
                        var13_8 = var11_7 * var11_7;
                        var15_9 = 0;
                        ** GOTO lbl19
                    }
                    var16_10 = 0;
                    break block11;
lbl31:
                    // 1 sources

                    while (true) {
                        var19_12 = (double)var15_9 + 0.5 - var5_4;
                        ** continue;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        if (!(var21_13 < var13_8)) ** GOTO lbl9
                        break block14;
                        break;
                    }
                }
                return;
                var21_13 = var17_11 * var17_11 + var19_12 * var19_12;
                if (!(var21_13 > var9_6)) {
                    ** continue;
                }
                break block14;
                var7_5 = (double)Math.min(var1_1, var2_2) * 0.5;
                var9_6 = var7_5 * var7_5;
                ** while (true)
            }
            var0.setColorArgb(var16_10, var15_9, var0.getColorArgb(var16_10, var15_9) & 0xFFFFFF);
            ** while (true)
lbl49:
            // 1 sources

            while (true) {
                var17_11 = (double)var16_10 + 0.5 - var3_3;
                ** continue;
                break;
            }
        }
        ** while (var16_10 >= var1_1)
lbl54:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private static void IIlIl(NativeImage var0) {
        block12: {
            block8: {
                block11: {
                    block9: {
                        block7: {
                            block10: {
                                break block10;
lbl1:
                                // 1 sources

                                while (true) {
                                    var0.setColorArgb(var6_5, var5_4, var0.getColorArgb(var6_5, var5_4) & 0xFFFFFF);
                                    ** GOTO lbl7
lbl4:
                                    // 1 sources

                                    while (true) {
                                        var9_7 = Math.min((double)var5_4 + 0.5, (double)(var2_2 - var5_4) - 0.5);
                                        if (!(var7_6 >= var3_3)) break block7;
lbl7:
                                        // 4 sources

                                        while (true) {
                                            ++var6_5;
                                            if (true) ** GOTO lbl12
                                            block3: while (true) {
                                                var6_5 = 0;
lbl12:
                                                // 2 sources

                                                if (var6_5 < var1_1) break block8;
                                                ++var5_4;
lbl14:
                                                // 2 sources

                                                while (var5_4 < var2_2) {
                                                    continue block3;
                                                }
                                                break block9;
                                                break;
                                            }
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
                            }
                            var1_1 = var0.getWidth();
                            break block11;
                        }
                        if (!(var9_7 >= var3_3)) break block12;
                        ** GOTO lbl7
lbl24:
                        // 1 sources

                        while (true) {
                            var5_4 = 0;
                            ** GOTO lbl14
                            break;
                        }
                    }
                    return;
                }
                var2_2 = var0.getHeight();
                var3_3 = Math.max(2.0, (double)Math.min(var1_1, var2_2) * 0.105);
                ** while (true)
lbl33:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var7_6 = Math.min((double)var6_5 + 0.5, (double)(var1_1 - var6_5) - 0.5);
            ** while (true)
            var13_9 = var3_3 - var9_7;
            if (var11_8 * var11_8 + var13_9 * var13_9 > var3_3 * var3_3) ** break;
            ** while (true)
            ** while (true)
        }
        var11_8 = var3_3 - var7_6;
        ** while (true)
    }

    static IIIllIIIl IIlll(String string) {
        if (string == null || string.isBlank() || string.length() > 3000000) {
            return null;
        }
        try {
            JsonObject jsonObject = JsonParser.parseString((String)string).getAsJsonObject();
            boolean bl = SpotifyBridge.IllII(jsonObject, IlllI);
            if (!bl) {
                return IIIllIIIl.IIl();
            }
            String string2 = SpotifyBridge.IlIIl(jsonObject, IIIIl);
            String string3 = SpotifyBridge.IlIIl(jsonObject, lIl);
            String string4 = SpotifyBridge.IlIIl(jsonObject, Illll);
            if (string2.isBlank() || string3.isBlank()) {
                return null;
            }
            byte[] byArray = null;
            String string5 = SpotifyBridge.IlIIl(jsonObject, IIlII);
            if (!string5.isBlank() && string5.length() <= 0x2AAAB2) {
                try {
                    byArray = Base64.getDecoder().decode(string5);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    byArray = null;
                }
            }
            return new IIIllIIIl(true, string2, string3, string4, SpotifyBridge.IlIIl(jsonObject, IlI), SpotifyBridge.lII(jsonObject, II), SpotifyBridge.lII(jsonObject, lIll), SpotifyBridge.IllII(jsonObject, ll), byArray);
        }
        catch (RuntimeException runtimeException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    Identifier IlIII(Identifier identifier) {
        if (identifier == null) return null;
        if (!this.III) {
            return null;
        }
        Identifier identifier2 = SpotifyBridge.Illll();
        return identifier2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlIIl(JsonObject jsonObject, IIIlIIIII iIIlIIIII) {
        String string;
        JsonElement jsonElement = jsonObject.get(iIIlIIIII.IIII());
        if (jsonElement != null && !jsonElement.isJsonNull()) {
            string = jsonElement.getAsString();
            return string;
        }
        string = SpotifyBridge.IIIII();
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIlI(String string, llIllIll llIllIll2) {
        this.lIlI.put(string, llIllIll2 == null ? llIllIll.I : llIllIll2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IllII(JsonObject jsonObject, IIIlIIIII iIIlIIIII) {
        JsonElement jsonElement = jsonObject.get(iIIlIIIII.IIII());
        if (jsonElement == null) return false;
        if (jsonElement.isJsonNull()) return false;
        if (!jsonElement.getAsBoolean()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean IllIl(JsonObject jsonObject, long l2) {
        double d = l2 > 0L ? (double)l2 / 1000.0 : 0.0;
        double d2 = SpotifyBridge.IlI(jsonObject, lIIlI);
        if (d <= 10.0) return true;
        if (d2 <= 0.0) return true;
        if (Math.abs(d2 - d) <= 15.0) return true;
        return false;
    }

    static void IlllI() {
        llI.shutdownNow();
    }

    private static Identifier Illll() {
        return Identifier.of((String)IIllI.IIII(), (String)IIII.IIII());
    }

    private static int lIIII(int n, int n2) {
        return lIlIl[n ^ 0xE266AC69] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String lIIIl(int var0, int var1_1) {
        var3_2 = var0 ^ -1810183391;
        var4_4 = SpotifyBridge.lIllI[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])SpotifyBridge.lIlll[var3_2];
        if (var2_3 == null) {
            var5_5 = new Throwable().getStackTrace();
            SpotifyBridge.lIlll[var3_2] = var5_5;
        } else {
            var5_5 = var2_3;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -4563806;
        var8_8 = 0;
        if (true) ** GOTO lbl17
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) {
                return new String(var4_4).intern();
            }
lbl17:
            // 3 sources

            switch (var8_8 & 31) {
                case 12: {
                    var9_9 = 183;
                    continue block33;
                }
                case 23: {
                    var9_9 = 67;
                    continue block33;
                }
                case 10: {
                    var9_9 = 164;
                    continue block33;
                }
                case 26: {
                    var9_9 = 149;
                    continue block33;
                }
                case 31: {
                    var9_9 = 2;
                    continue block33;
                }
                case 20: {
                    var9_9 = 63;
                    continue block33;
                }
                case 9: {
                    var9_9 = 200;
                    continue block33;
                }
                case 8: {
                    var9_9 = 22;
                    continue block33;
                }
                case 27: {
                    var9_9 = 195;
                    continue block33;
                }
                case 25: {
                    var9_9 = 52;
                    continue block33;
                }
                default: {
                    var9_9 = 147;
                    continue block33;
                }
                case 3: {
                    var9_9 = 111;
                    continue block33;
                }
                case 16: {
                    var9_9 = 137;
                    continue block33;
                }
                case 24: {
                    var9_9 = 177;
                    continue block33;
                }
                case 30: {
                    var9_9 = 204;
                    continue block33;
                }
                case 2: {
                    var9_9 = 190;
                    continue block33;
                }
                case 22: {
                    var9_9 = 118;
                    continue block33;
                }
                case 5: {
                    var9_9 = 157;
                    continue block33;
                }
                case 28: {
                    var9_9 = 32;
                    continue block33;
                }
                case 6: {
                    var9_9 = 92;
                    continue block33;
                }
                case 15: {
                    var9_9 = 63;
                    continue block33;
                }
                case 19: {
                    var9_9 = 178;
                    continue block33;
                }
                case 29: {
                    var9_9 = 184;
                    continue block33;
                }
                case 17: {
                    var9_9 = 103;
                    continue block33;
                }
                case 1: {
                    var9_9 = 91;
                    continue block33;
                }
                case 14: {
                    var9_9 = 241;
                    continue block33;
                }
                case 13: {
                    var9_9 = 202;
                    continue block33;
                }
                case 4: {
                    var9_9 = 194;
                    continue block33;
                }
                case 11: {
                    var9_9 = 53;
                    continue block33;
                }
                case 21: {
                    var9_9 = 118;
                    continue block33;
                }
                case 18: {
                    var9_9 = 73;
                    continue block33;
                }
                case 7: 
            }
            var9_9 = 139;
        }
    }
}

