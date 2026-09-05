/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIIllI
 * Module         : Cosmetics  [RENDER]
 * Description    : Applies a cosmetic cape to your local player.   (client's own text)
 *
 * Recovered strings in this class:
 *   - textures/r8v4n2/
 *   - cape/native/
 *   - .getBytes(
 *   - cape/
 *   - Cape
 *   - cats
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.texture.AbstractTexture
 *  net.minecraft.client.texture.NativeImage
 *  net.minecraft.client.texture.NativeImageBackedTexture
 *  net.minecraft.client.texture.TextureManager
 *  net.minecraft.entity.player.PlayerSkinType
 *  net.minecraft.entity.player.SkinTextures
 *  net.minecraft.resource.Resource
 *  net.minecraft.util.AssetInfo$TextureAsset
 *  net.minecraft.util.AssetInfo$TextureAssetInfo
 *  net.minecraft.util.Identifier
 */
package orchard.module.render;

import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.texture.TextureManager;
import net.minecraft.entity.player.PlayerSkinType;
import net.minecraft.entity.player.SkinTextures;
import net.minecraft.resource.Resource;
import net.minecraft.util.AssetInfo;
import net.minecraft.util.Identifier;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIIll;
import orchard.internal.IlIlIlllI;

@Environment(value=EnvType.CLIENT)
public final class Cosmetics
extends ModuleBase {
    private static final int I = 32;
    private static final int l = 64;
    private SkinTextures II;
    private boolean Il;
    private static String[] lI;
    private static final int ll = 22;
    private String III = "";
    private static final Map<IIIIIll, AssetInfo.TextureAsset> IIl;
    private SkinTextures IlI;
    private static final int Ill = 17;
    private final IIIIIIIIl<IIIIIll> lII = this.IIlllIl(new IIIIIIIIl<IIIIIll>(StringFactory.IIII("Cape"), IIIIIll.class, IIIIIll.II));
    private IIIIIll lIl = IIIIIll.II;
    private static final int[] llI;
    private static final String[] lll;
    private static final Object[] IIII;

    @Override
    public String II() {
        return ((IIIIIll)((Object)this.lII.lIl())).lI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(GameProfile gameProfile) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.IIIlIIl()) return false;
        if (gameProfile == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.player.getGameProfile() == null) return false;
        if (IlIlIlllI.III(minecraftClient.player.getGameProfile()) == null) return false;
        if (IlIlIlllI.III(minecraftClient.player.getGameProfile()).equals(IlIlIlllI.III(gameProfile))) return true;
        return false;
    }

    private static AssetInfo.TextureAsset IIl(IIIIIll iIIIIll) {
        AssetInfo.TextureAssetInfo textureAssetInfo;
        block11: {
            String string = ".png";
            String string2 = iIIIIll.II();
            String string3 = "textures/r8v4n2/";
            Identifier identifier = Identifier.of((String)"cats", (String)(string3 + string2 + string));
            string = iIIIIll.II();
            string2 = "cape/";
            Identifier identifier2 = Identifier.of((String)"cats", (String)(string2 + string));
            MinecraftClient minecraftClient = MinecraftClient.getInstance();
            if (minecraftClient == null) {
                return new AssetInfo.TextureAssetInfo(identifier2, identifier);
            }
            TextureManager textureManager = minecraftClient.getTextureManager();
            if (textureManager == null || minecraftClient.getResourceManager() == null) {
                return new AssetInfo.TextureAssetInfo(identifier2, identifier);
            }
            String string4 = iIIIIll.II();
            string = "cape/native/";
            Identifier identifier3 = Identifier.of((String)"cats", (String)(string + string4));
            Optional optional = minecraftClient.getResourceManager().getResource(identifier);
            if (optional.isEmpty()) {
                return new AssetInfo.TextureAssetInfo(identifier2, identifier);
            }
            InputStream inputStream = ((Resource)optional.get()).getInputStream();
            try {
                NativeImage nativeImage = NativeImage.read((InputStream)inputStream);
                nativeImage = Cosmetics.lIl(nativeImage);
                textureManager.registerTexture(identifier3, (AbstractTexture)new NativeImageBackedTexture(() -> ((Identifier)identifier3).toString(), nativeImage));
                textureAssetInfo = new AssetInfo.TextureAssetInfo(identifier3, identifier3);
                if (inputStream == null) break block11;
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
                catch (IOException iOException) {
                    return new AssetInfo.TextureAssetInfo(identifier2, identifier);
                }
            }
            inputStream.close();
        }
        return textureAssetInfo;
    }

    @Override
    public void III() {
        this.IlII();
    }

    @Override
    public void ll() {
        this.IlII();
    }

    @Override
    public void llll() {
        this.IlI = null;
        this.Il = false;
    }

    private static long lII(long l2, long l3) {
        return (l2 + l3 - 1L) / l3;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static NativeImage lIl(NativeImage nativeImage) {
        int n = nativeImage.getWidth();
        int n2 = nativeImage.getHeight();
        int n3 = (int)Math.max(64L, Cosmetics.lII((long)n * 64L, 22L));
        int n4 = (int)Math.max(32L, Cosmetics.lII((long)n2 * 32L, 17L));
        int n5 = Math.max(n, (int)Math.ceil((double)n3 * 0.34375));
        int n6 = Math.max(n2, (int)Math.ceil((double)n4 * 0.53125));
        if (n3 < n5) {
            n3 = n5;
        }
        if (n4 < n6) {
            n4 = n6;
        }
        NativeImage nativeImage2 = new NativeImage(n3, n4, true);
        int n7 = Math.max(0, (n5 - n) / 2);
        int n8 = Math.max(0, (n6 - n2) / 2);
        int n9 = 0;
        boolean bl = true;
        block0: while (true) {
            if (!bl || (bl = false) || !true) {
                ++n9;
            }
            if (n9 >= n) {
                nativeImage.close();
                return nativeImage2;
            }
            int n10 = 0;
            while (true) {
                if (n10 >= n2) continue block0;
                nativeImage2.setColorArgb(n7 + n9, n8 + n10, nativeImage.getColorArgb(n9, n10));
                ++n10;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public Object lll(GameProfile gameProfile, Object object) {
        SkinTextures skinTextures;
        if (!this.lI(gameProfile)) {
            return object;
        }
        if (this.lII.lIl() == IIIIIll.II) {
            return object;
        }
        SkinTextures skinTextures2 = object instanceof SkinTextures ? (skinTextures = (SkinTextures)object) : this.II;
        if (skinTextures2 == null) {
            this.IlII();
            return object;
        }
        IIIIIll iIIIIll = (IIIIIll)((Object)this.lII.lIl());
        if (this.IlI != null && this.lIl == iIIIIll) {
            if (this.II == skinTextures2) return this.IlI;
        }
        this.II = skinTextures2;
        this.lIl = iIIIIll;
        this.IlI = Cosmetics.IIII(skinTextures2, iIIIIll);
        return this.IlI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static SkinTextures IIII(SkinTextures skinTextures, IIIIIll iIIIIll) {
        PlayerSkinType playerSkinType;
        if (skinTextures == null) return skinTextures;
        if (iIIIIll == IIIIIll.II) {
            return skinTextures;
        }
        AssetInfo.TextureAsset textureAsset = Cosmetics.lIII(iIIIIll);
        AssetInfo.TextureAsset textureAsset2 = skinTextures.body();
        AssetInfo.TextureAsset textureAsset3 = skinTextures.elytra();
        if (skinTextures.model() != null) {
            playerSkinType = skinTextures.model();
            return new SkinTextures(textureAsset2, textureAsset, textureAsset3, playerSkinType, skinTextures.secure());
        }
        playerSkinType = PlayerSkinType.WIDE;
        return new SkinTextures(textureAsset2, textureAsset, textureAsset3, playerSkinType, skinTextures.secure());
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 7593;
        String string = "\u43be\u0af5\u7146\u7570\u2605\ue70e\u0dbf\u4179\u9cc0\uc732\u382a\ud928\u8bab\u1486\u2f0c\u25af\u5721\ub97e\u0479\uc7a0\ud968\u3ec8\u1f4b\u2cac\u9d85\uef7a\ue85e\u9e90\udf1a\ubb21\uc74e\ucd9d\u8db5\ub616\u4487\ufd40\u0ecd\udd85\u0ab9\u9582\u24f6\uf4fd\uafd3\u4d51\u3da4\u5635\u8386\u8bd5\uba55\u29e7\u81ee\u0083\uc386\u8787\u9600\u032f\u92cc\ub64a\u2608\u38be\u31d5\u025f\u04e2\u88d6\u5576\u6b15\u7736\uf21b\u280a\u890d\ub67c\u47fb\u6489\u6971\ue057\u9f9d\u1a1c\u2a12\uc3bc\ufe7b\ua5aa\uea67\u2de5\u26d7\u0c5a\ubaac\u3c72\u0517\u4925\u6c1e\uc158\u5fac\u1f24\u7192\udf70\u90ca\u1bf9\u4e02\u7972\ufab1\u0469\u3d09\u7617\u67a3\u28a4\uf993\u8814\u2970\udbb2\uae4b\u8ec6\ufff7\u74d1\uc042\u4f23\u16fd\uca56\u4f93\ud18e\ud30e\ud0fd\u2c72\u739d\ufcfd\ue6be\uab82\ueab1\u143c\ua3b0\u1aaf\u17ea\ub404\u3151\uac59\ua290\uee24\u188c\u6f6c\u88ab\u9310\u010e\u472e\u96c1\u2eb7";
        char[] cArray = "\u1db1\u1db9\u1da1\u1da1\u1da1\u1da1\u1d95\u1da5".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
        lll = stringArray;
        IIII = new Object[stringArray.length];
        int n6 = 109986598;
        byte[] byArray = "F\u0013\u0007\u0010\u00c2\u00f5\u00dc\u008b\u00c5\u0017E6T\u00cb\u00d8\u001f\u00fa6q\u00fd\u00d7\u00b6NN\u00fa\u00f9\u008c\u0001\u0011\u00b5\u0014\u00f3\r\u00a3M<\u009cB\u000f\u00d9\u00be\u0011h\u00b2\u0018j\u00f4\u00ef\r&\u00fd\u00d4p\u008c]Tl\u00eeF\u00a8\u00fda\u00e3\u00a3\u00c1Im\u00de5\u00fa\u00dfn\u00e2\u00dd\u00c1|".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        llI = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            Cosmetics.llI[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        lI = new String[9];
        Cosmetics.Illl();
        IIl = new ConcurrentHashMap<IIIIIll, AssetInfo.TextureAsset>();
    }

    private static String IIlI(char[] cArray, long l2, int n) {
        int n2 = 0x88327EF5 ^ n;
        for (int i = 0; i < cArray.length; ++i) {
            n2 = n2 ^ (int)l2 ^ ~i;
            n2 ^= n - i * cArray.length;
            n2 = -n2 * n | i;
            cArray[i] = (char)(cArray[i] ^ n2);
            int n3 = i & 0xFF;
            n = n << n3 | n >>> -n3;
            l2 ^= (long)n3;
        }
        return new String(cArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlII() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player != null && minecraftClient.getSkinProvider() != null) {
            boolean bl;
            if (this.lII.lIl() == IIIIIll.II) {
                this.IlI = null;
                this.Il = false;
                return;
            }
            GameProfile gameProfile = minecraftClient.player.getGameProfile();
            String string = IlIlIlllI.III(gameProfile) == null ? IlIlIlllI.ll(gameProfile) : IlIlIlllI.III(gameProfile).toString();
            boolean bl2 = !string.equals(this.III);
            boolean bl3 = bl = this.lII.lIl() != this.lIl;
            if (bl2) {
                this.III = string;
                this.II = null;
                this.IlI = null;
            }
            if (bl && this.II != null) {
                this.lIl = (IIIIIll)((Object)this.lII.lIl());
                this.IlI = Cosmetics.IIII(this.II, this.lIl);
            }
            if (this.II != null) {
                if (!bl2) return;
            }
            if (this.Il) return;
            this.Il = true;
            minecraftClient.getSkinProvider().fetchSkinTextures(gameProfile).whenComplete((optional, throwable) -> minecraftClient.execute(() -> {
                Optional optional2;
                Optional optional3;
                Optional optional4;
                this.Il = false;
                if (throwable != null) {
                    return;
                }
                if (optional instanceof Optional) {
                    optional4 = optional;
                    optional3 = optional4.orElse(null);
                } else {
                    optional3 = optional;
                }
                if (!((optional2 = optional3) instanceof SkinTextures)) return;
                optional4 = (SkinTextures)optional2;
                this.II = optional4;
                this.lIl = (IIIIIll)((Object)((Object)((Object)this.lII.lIl())));
                this.IlI = Cosmetics.IIII((SkinTextures)optional4, this.lIl);
            }));
            return;
        }
        this.II = null;
        this.IlI = null;
        this.Il = false;
        this.III = "";
    }

    public void IllI() {
    }

    private static void Illl() {
        Cosmetics.lI[0] = Cosmetics.IIlI(Cosmetics.lIll('\ua5c6', '\ue3a5', -1497163823).toCharArray(), 42621L, 19654366);
        Cosmetics.lI[1] = Cosmetics.IIlI(Cosmetics.lIll('\uc234', '\ue3a4', -1310654168).toCharArray(), 38146L, -270305434);
        Cosmetics.lI[2] = Cosmetics.IIlI(Cosmetics.lIll('\uc783', '\ue3a7', -1626769284).toCharArray(), 64048L, -730599291);
        Cosmetics.lI[3] = Cosmetics.IIlI(Cosmetics.lIll('\u6121', '\ue3a6', 320948108).toCharArray(), 8893L, -2078236959);
        Cosmetics.lI[4] = Cosmetics.IIlI(Cosmetics.lIll('\uf85d', '\ue3a1', 1415476905).toCharArray(), 25291L, 2037851391);
        Cosmetics.lI[5] = Cosmetics.IIlI(Cosmetics.lIll('\u370f', '\ue3a0', 1619752140).toCharArray(), 29201L, -1878921304);
        Cosmetics.lI[6] = Cosmetics.IIlI("".toCharArray(), 90111L, 711253936);
        Cosmetics.lI[7] = Cosmetics.IIlI(Cosmetics.lIll('\u7af9', '\ue3a3', -228370433).toCharArray(), 17497L, 1565231975);
        Cosmetics.lI[8] = Cosmetics.IIlI(Cosmetics.lIll('\ue9c1', '\ue3a2', 1578704914).toCharArray(), 75661L, -1578337095);
    }

    private static AssetInfo.TextureAsset lIII(IIIIIll iIIIIll) {
        return IIl.computeIfAbsent(iIIIIll, Cosmetics::IIl);
    }

    public void lIIl(String string) {
    }

    public Cosmetics() {
        super(StringFactory.IIII("Cosmetics"), Category.l, StringFactory.IIII("Applies a cosmetic cape to your local player."));
    }

    private static int lIlI(int n, int n2) {
        return llI[n ^ 0x61CB8BBE] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIll(char c, char c2, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0xE3A5;
        char[] cArray = lll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIII[n2];
        if (stackTraceElementArray2 == null) {
            Cosmetics.IIII[n2] = stackTraceElementArray = new Throwable().getStackTrace();
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3396;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 22251;
            n6 ^= 0xBD63;
            n6 -= 7918;
            n6 -= 41116;
            n6 ^= 0xA1E1;
            n6 ^= 0xACD;
            n6 += 1036;
            n6 += 1876;
            cArray[n5] = (char)((n6 += 2862) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

