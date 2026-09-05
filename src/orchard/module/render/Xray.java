/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIllI
 * Module         : Xray  [RENDER]
 * Description    : Highlights searby ore blocks through walls.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Raw Blocks Color
 *   - Other Ores Color
 *   - Redstone Color
 *   - Ancient Debris
 *   - Diamond Color
 *   - Emerald Color
 *   - Block Filter
 *   - Copper Color
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.block.Block
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.Blocks
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.registry.Registries
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Box
 *  net.minecraft.world.chunk.WorldChunk
 */
package orchard.module.render;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.registry.Registries;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.world.chunk.WorldChunk;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIllIlIll;
import orchard.internal.IlIIIlIIl;
import orchard.internal.IllIlI;
import orchard.internal.Illllll;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlIllI;
import orchard.internal.lIllIII;
import orchard.internal.llIlIlII;
import orchard.internal.llIll;
import orchard.internal.lllIIII;

@Environment(value=EnvType.CLIENT)
public final class Xray
extends ModuleBase {
    private int I;
    private Object l;
    private final llIlIlII II;
    private final llIlIlII Il;
    private int lI;
    private final llIlIlII ll;
    private final llIll III;
    private final IIIIIIIIl<IlIIIlIIl> IIl;
    private final llIll IlI;
    private final llIlIlII Ill;
    private final llIll lII;
    private static final int lIl = 2;
    private int llI;
    private final lIlIIlI lll;
    private static String[] IIII;
    private final llIll IIIl;
    private final llIlIlII IIlI;
    private final llIlIlII IIll;
    private static volatile Xray IlII;
    private final llIll IlIl;
    private final llIll IllI;
    private final llIlIlII Illl;
    private final llIll lIII;
    private final Illllll lIIl;
    private static final int lIlI = 20;
    private final Map<Long, List<lIllIII>> lIll;
    private final llIll llII;
    private static final int llIl = 64;
    private final ArrayDeque<IIllIlIll> lllI;
    private final llIll llll;
    private final llIlIlII IIIII;
    private final llIll IIIIl;
    private static final int IIIlI = 8;
    private final llIlIlII IIIll;
    private final llIll IIlII;
    private final llIlIlII IIlIl;
    private final llIll IIllI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Fill"), false));
    private final llIll IIlll;
    private final llIlIlII IlIII;
    private static final int[] IlIIl;
    private static final String[] IlIlI;
    private static final Object[] IlIll;

    public Xray() {
        super(StringFactory.IIII("Xray"), Category.l, StringFactory.IIII("Highlights searby ore blocks through walls."));
        this.IllI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Outline"), true));
        this.lll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Opacity"), 35.0, 0.0, 100.0, 1.0).IIIl("3Q=="));
        this.IIl = this.IIlllIl(new IIIIIIIIl<IlIIIlIIl>(StringFactory.IIII("Style"), IlIIIlIIl.class, IlIIIlIIl.l));
        this.lIIl = this.IIlllIl(new Illllll((Object)StringFactory.IIII("Block Filter"), List.of(), ","));
        this.IlIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Coal"), true));
        this.ll = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Coal Color"), new Color(85, 92, 108, 255)));
        this.lII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Copper"), true));
        this.Ill = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Copper Color"), new Color(255, 145, 95, 255)));
        this.IIlII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Diamond"), true));
        this.IIlIl = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Diamond Color"), new Color(64, 235, 255, 255)));
        this.lIII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Emerald"), true));
        this.II = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Emerald Color"), new Color(64, 255, 116, 255)));
        this.IlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Gold"), true));
        this.IIlI = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Gold Color"), new Color(255, 214, 70, 255)));
        this.III = this.IIlllIl(new llIll((Object)StringFactory.IIII("Iron"), true));
        this.Illl = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Iron Color"), new Color(220, 190, 150, 255)));
        this.llll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Lapis"), true));
        this.IlIII = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Lapis Color"), new Color(70, 112, 255, 255)));
        this.IIIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Redstone"), true));
        this.Il = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Redstone Color"), new Color(255, 62, 70, 255)));
        this.IIlll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Ancient Debris"), true));
        this.IIIII = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Debris Color"), new Color(165, 82, 65, 255)));
        this.llII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Raw Blocks"), true));
        this.IIIll = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Raw Blocks Color"), new Color(230, 170, 115, 255)));
        this.IIIIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Other Ores"), true));
        this.IIll = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Other Ores Color"), new Color(255, 255, 255, 255)));
        this.lllI = new ArrayDeque();
        this.lIll = new HashMap<Long, List<lIllIII>>();
        this.I = Integer.MIN_VALUE;
        this.lI = Integer.MIN_VALUE;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block2: {
            var6 = 27584;
            var7_1 = "\ude93\ud1b4\uc1c6\u8db4\ud376\u469c\u9ad8\ude84\u1a3b\uee8d\u4b1f\u7c78\u6021\uf28d\u8f48\ued2b\u803d\u6a86\u6e39\ubf6f\uc004\u8d0d\ua9de\u7ad1\u121a\u1a2f\u3403\ud917\ue387\u3b8a\uc772\u9407\u93f0\uae4c\u0b6a\u23cc\u52a0\u14d5\u76b2\u6764\uf0c4\ua8c5\u209e\u50ea\u3f92\u54db\u043d\u85e2\u2776\u6223\ue688\uae6b\u6bea\u88c7\ue2b4\ueffa\u55cc\uf555\u9ef8\u486e\uc14d\ud16e\u569b\u3938\ud591\ub1c4\ueea2\uead6\ud089\ufb76\u69f6\u585b\uea7d\u676d\u380e\u55b6\u4c99\u4a46\ua979\ub053\u1f07\ub064\uaddc\u806c\u4a7e\ua9af\ua50d\u231e\u4315\ua95f\u6861\ue002\ue024\u02e6\ud0a0\udd80\uef7b\uc9a2\uf47b\u3044\ubd4e\uc233\uce50\u3d29\u0a4c\u7974\u2b47\ued77\uc336\ua38f\u3180\u561e\ubfc7\ue382\u7ead\u9b1f\u7daf\ucc96\uf1d1\u5fc1\u3d08\u8a5d\u2a4d\u7778\u019d\uc80c\ucff0\uc699\ubd3d\u0ec9\udbc2\u8529\ua6f0\ud638\u2516\ue2dc\u38aa\u2de8\u2e61\u1f19\uecde\u1908\ue3a7\u890f\uf821\u46bf\ud209\u57e1\u4f67\uda85\u271b\ud4ff\uf78c\u808a\ue581\u357f\u7294\u049e\uf4af\ua1c8\ub538\u162f\uc9fb\uf553\ue83c\uff5b\u0ad9\u825a\u2ebb\u161d\u845e\ue71a\u8ffb\u1615\ua5d8\u0e89\u1857\u71c0%\u1fec\ud478\ud0a3\ue2b8\ufc4f\u929e\uc805\u87bc\ubd8a\u7c1f\u50b9\u7e62\u914f\u4d6e\u0b59\uf4ce\u7a5e\uef76\u3300\ue21c\u7404\u9fb9\u72f7\u1acd\uc95c\u9f38\u7f2b\u86f6\ua9b8\u3a87\ud143\ua5f7\u1083\uc155\u9e5a\uc733\u61d1\uf564\u1971\uea01\ucdd0\u841e\u5433\uf16f\u019a\udacf\u6eab\ubfe2\ub376\u3669\u9b31\u6bcd\ufdfd\ufd73\ubc96\u6cc0\u2668\u4c20\u7965\ud30a\ud2c3\u53ac\u9ac6\u6925\uacfd\u937e\u0292\ud04e\u3c09\u189f\ufaed\u243a\ubecb\u35cc\uee97\u0c48\ubd57\u79de\u1579\u05e8\ue649\uf303\u5bca\u9148\u74cb\ucafa\u51f3\u2a38\u77d2\u3fe2\u2a51\u00a9\u19ce\u309e\u311c\u73a5\uc15a\u5e67\u0d1a\u86a1\u85b8\u4c56\u8008\ua6ee\ue848\uca48\uf962\uaca6\u0c60\uc8c4\u4f81\ua716\u5796\u5515\ue33d\u4a7f\u2eca\uf415\u2379\uef7c\u5e54\uc622\u98be\u04ba\uc5f7\u4964\u371d\uaed4\uc688\ufacb\ua3c3\ub91f\u6959\uaf23\uaac6\u5035\ua523\u4426\u3d4d\ufa62\u4932\u7439\uf841\uc2f8\u5143\uba19\u96ee\u55bc\u404f\udafc\ue156\u0668\u4bc1\uaa89\u35c0\u3aa6\u4342\u7c8c\u4cd3\ub517\u729d\u1bb6\u114f\u394a\u0289\u8056\u0588\uc795\u961e\uc7b3\ud3f0\ub539\u1941\u75b6\u83ef\u9f31\u1c0b\u1ca5\u92f0\u2af1\u35c3\uceb4\ua18c\u907e\u0ade\uee89\u16c7\u02a1\u21fd\u9b2b\u4ae4\u1078\u7272\uc743\uf3be\u4682\ue2bc\uaf19\ucf13\u7b74\ud47b\u78a7\u0e77\u2d13\uf95d\u3de5\uad12\udff7\u8355\uf4d1\u5c91\u333f\ua338\uc4d4\uab4f\uc405\u6389\ucd4e\u8182\uc5c8\u1fe3\uc3f4\u692f\u7d4e\u6472\u6f9b\u5515\ubc32\uf3c0\ue56c\u5b8d\u45a0\ue3bb\udb9d\u28be\uc707\u274d\ucd9b\ub01e\u0c37\uc384\ub865\u585a\u6d2b\u3cc1\u16f1\u6fc6\u2782\u9b6a\u8c30\u3b91\u4c88\ud50b\uf652\u99a3\u6eb8\u9dde\ufb8c\u83c1\u507b\u1ed3\u7af8\u3aa5\uf4b1\uade7\u8c9a\uee88\u1430\u25c6\u9589\u9ac5\u3394\u60ca\ufa88\u4d94\u14de\uba35\u71b8\u08e1\u166e\ub3bd\u911d\uc5bf\ucbae\uf5e2\u16d8\ubdd3\ua0e8\u54cd\ud9b7\ud790\u5dd4\u3c5c\u233b\u033e\ua22e\u27e0\u7ee3\u3707\u3f96\u554c\u38ca\u6ef2\u4858\u036c\u226b\u6703\u7c84\u2191\u8bdd\u8162\u5f65\u63a6\u382e\u133a\u5efd\uf0dc\u7828\u9e85\uc791\uce60";
            var8_2 = "\u6bc4\u6bd8\u6bd0\u6bd8\u6bcc\u6bd4\u6bcc\u6bc8\u6bc8\u6bc8\u6bcc\u6bd0\u6bd0\u6bc8\u6bc8\u6bd0\u6bc8\u6bd0\u6bd4\u6bcc\u6bd0\u6bc8\u6bd4\u6bc8\u6bd4\u6bfc\u6bc8\u6bc4\u6bd0\u6bd0\u6bcc\u6bd0\u6bd4\u6bc8".toCharArray();
            var9_3 = new String[var8_2.length];
            var13_7 = -1;
            break block2;
            var13_7 = 0;
        }
        var10_4 = 0;
        var11_5 = 0;
        var12_6 = 0;
        if (var13_7 == 0) {
            Xray.IlIlI = var9_3;
            Xray.IlIll = new Object[var9_3.length];
            var2_10 = 1041148180;
            var0_8 = "\u00b7\u00052\t\u00f0'\u00ce\t\u00b9\u00ab\u009e4\u00b0\u0089r1[/N\u00ac\u00ff;=M\u00f6\u0088\u00f9\u00ee-6\u00e6!,C\u0084d\u00cd\u001e\u00f1iu4\u00a5\u00f0\u009f\u00d3\u00f2OH\u0086\u00fb\u00ab\u00d5\u00ec7F\u0085'\u00d8!\u00fbpY\u00ee\u0083\u00e3\u00bdT\u0016\u00c8\\\u0083\u000e\u00f2\u007f\u00ee\u0006\n{\u0006\u001ff}\u009a\u0085\u007fE\u009fD\u00e6\u00d8<\u00d4p\u000b&\u00a6p\u00a2\r\u001c\u008a\nX\u00f9\"kW\u000f\"c\u00fe\u0087b5!4\u00f3\u00b0\u009a\u008c\u0084,\u009b\u00ca?\u0083y\u00dea'\u00aa:\u009d\u00fd{\u00e5\u007fJ\u0001\u00f4a\u00f5\u001a\u00a2\u00b1\u008f\u00d3C\u00a1\u0013\u001c\u00bf\u0096Q\u009a\u00d8X\u0083\u0084a\u0015t+w\u00e1n\"%\u00fd\u001aJ\u0011\u001e\u00c5\u00bf\u0082N\u00c6\u00c0C\u00d0R\u00cd\u00e3\u009dH\u00ae\u0086(V\u0082\u007f\u0084\u000f?\u00136\u00e7\u008d\u0097\u00acI\u0085\u00fdvO9\u00cd!m\u00ac\u0014\u0092\u0011\u00a8\u00ce\u00ef\u0014\u00f3\u00a4+?\u00ce=\u00e1\u00cdr\u00a9\u00bc\u0099PIN\u008d\u0013\u00c4n\u001c\u009c\u000bR\u00b6\b\u00bb\u001b^n\u00d3\u0004!\u00c8\u00e5\u008dT\u00e8\u00a7A\u00e8'-=\u00ce\u00f8\u00d9a\u0019 \u0098\u0085\u0093\u00b5I\u0092\u00b4\u008dg9\u00eb\u0004\u00a6S\u00d1\u0081\u00ca%\"\u00fb\u00c7l\u0091\u00f9S\u00932\u00d2I\u00ec\t\u00fc\u0097M\u00e8R8\u00f4\u00cb\u00b2\u00e5!\u00d6\u00a8Td\u001b\u00ef5\u001aE\u00dd\u001d\u00fbmE\u00ec\u009b~X\u00efT\u0084\u00b6M\u001d\u0098\u00d2/\u00b4v\b@\u00dc\u000f\u00ef`\u00f5\u00c4\u00eeg\u00d7\u0080B7\u0097\u00e4\u00eb\u00ba9\u00ce\u00e3\u00b0\u00d3\u00c6x\u00dc\u00c7\u001d\u00c2\u00a2\u00d8g\u00bf4e\u008c\u008d\u0014\u00f6\u00be\u008b\u00bdz\u00c3e\u0097\u00af\u00c3\u008e\r\u009e\u0084\u00a5\u00eb\u00c99\u0005;{\u00d4\u00d2\u0095v\\\u0005X\u009c\u001f\u0087*\u00f2e)\u00b2\f\u00d1\u00d1\u00e4\u00d0:\u00c8OK\u00dcEls3\u00c9\u00ab!F.\u00c7\f\u0084$\u0097&\u00e8 \u0086A`\u00f7\u0093\u0093!I\u00aao\r\u00deo\u00cc\u008f\u00b0\u00d2w\u00fc\u00a2\u00c4\br#\u0019YI\u0092\u00e5q\u008f\u0010E\u00fb!c\u00a9F\u00ab\u00bd?C)#\u00a2\u00d7\u00b9X\u00ba\u00ee\u00a7U\fP \u0012\u00dd\u001a\u0090\fQ6\u008a\u00ba\u0015\u001a\u00c9\u00f8\u0082\u00a8\u00ed\u00eb$rh/\u0010\u0014\u00ec\u00b9\u00c9\u00a8k\u00b0\u00ceJ\u0007\u00ea\u00ed\u00ef]X\u00a3\u00f9\u00f9+Z\u0084>\u00d2\u0016\u0015\u00da\u0091+\u00fdw\u00e0^\u00a7\u00a8\u00b55\u00a4\u0094Y\u00cbtg\u007f\u000b\u00c3,o\u00f1\u00ee1O\u0086T\u007f\u0003yi\u00e3\u00eb\u00db8N\u00ce\u00f2\u00c8\u00d17\u0091v\u0012\u00ec-<\u009f\u0016\u00af\u00f9\u00d6\u00a1\u00b37\u00cc9z4\u00dc\u009c\u00bf\u00b0\u00149\u00f7\u00c2\u00dd\u009f\u00e8#\u00f4\u00d0A\u00db\n\u00ec\u00cdQ%\u00d7\u0014\u00c6\u00fff\u0087e:\u0090".getBytes("ISO-8859-1");
            var1_9 = var0_8.length / 4;
            Xray.IlIIl = new int[var1_9];
            var3_11 = 0;
            var4_12 = 0;
            do {
                var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
                Xray.IlIIl[var4_12] = var5_13 ^= var2_10;
                var3_11 += 4;
            } while (++var4_12 < var1_9);
            Xray.IIII = new String[35];
            Xray.llII();
            return;
        }
lbl29:
        // 3 sources

        var12_6 = var8_2[var10_4] ^ var6;
        var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
        var11_5 += var12_6;
        if (++var10_4 < var8_2.length) ** GOTO lbl29
    }

    @Override
    public void Ill(II iI) {
        this.lllI(iI);
    }

    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0xE08E3598 ^ n;
        int n3 = 0;
        while (n3 < cArray.length) {
            n2 = n2 ^ (int)l2 ^ ~n3;
            n2 ^= n - n3 * cArray.length;
            n2 = -n2 * n | n3;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            int n4 = n3 & 0xFF;
            n = n << n4 | n >>> -n4;
            l2 ^= (long)n4;
            ++n3;
        }
        return new String(cArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        block5: {
            BlockPos blockPos;
            MinecraftClient minecraftClient;
            block4: {
                int n;
                int n2;
                block3: {
                    boolean bl;
                    minecraftClient = MinecraftClient.getInstance();
                    if (!this.IIIlIIl()) {
                        return;
                    }
                    boolean bl2 = this.l != minecraftClient.world;
                    if (bl2) {
                        this.Illl();
                        this.l = minecraftClient.world;
                    }
                    if (minecraftClient.player == null) return;
                    if (minecraftClient.world == null) {
                        return;
                    }
                    blockPos = minecraftClient.player.getBlockPos();
                    n2 = blockPos.getX() >> 4;
                    n = blockPos.getZ() >> 4;
                    boolean bl3 = n2 == this.I && n == this.lI ? false : (bl = true);
                    if (bl2 || bl) break block3;
                    if (!this.lllI.isEmpty()) break block4;
                    if (this.llI++ < 20) break block5;
                    this.IlI(minecraftClient, n2, n);
                    break block4;
                }
                this.IlI(minecraftClient, n2, n);
            }
            this.IIIIl(minecraftClient, blockPos);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(Object object, Box box, Color color, double d) {
        if (((Boolean)this.IIllI.lIl()).booleanValue()) {
            if (this.IIl.lIl() == IlIIIlIIl.Il) {
                IllIlI.IIIlll(object, box.expand(0.035), lIlIllI.l(color, 0.78), d * 0.78);
            }
            IllIlI.IIIlll(object, box, color, d);
        }
        if ((Boolean)this.IllI.lIl() == false) return;
        if (this.IIl.lIl() == IlIIIlIIl.Il) {
            IllIlI.IlIl(object, box.expand(0.035), lIlIllI.l(color, 0.72), 165.0, 3.0f);
        }
        IllIlI.IlIl(object, box, color, 255.0, this.IIl.lIl() == IlIIIlIIl.Il ? 2.4f : 2.0f);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void IlI(MinecraftClient minecraftClient, int n, int n2) {
        this.lllI.clear();
        this.I = n;
        this.lI = n2;
        this.llI = 0;
        int n3 = (Integer)minecraftClient.options.getViewDistance().getValue();
        int n4 = Math.max(1, Math.min(n3, 8));
        int n5 = n4 * 2 + 1;
        ArrayList<IIllIlIll> arrayList = new ArrayList<IIllIlIll>(n5 * n5);
        int n6 = n - n4;
        boolean bl = true;
        while (true) {
            int n7;
            if (!bl || (bl = false) || !true) {
                if (n7 <= n2 + n4) {
                    int n8 = n6 - n;
                    int n9 = n7 - n2;
                    arrayList.add(new IIllIlIll(n6, n7, n8 * n8 + n9 * n9));
                    ++n7;
                    continue;
                }
                ++n6;
            }
            if (n6 > n + n4) {
                arrayList.sort(Comparator.comparingInt(IIllIlIll::II));
                this.lllI.addAll(arrayList);
                this.lIll.keySet().removeIf(l2 -> {
                    long l3 = (long)Xray.lII(l2) - (long)n;
                    long l4 = (long)Xray.llIl(l2) - (long)n2;
                    if (l3 < (long)(-n4)) return true;
                    if (l3 > (long)n4) return true;
                    if (l4 < (long)(-n4)) return true;
                    if (l4 > (long)n4) return true;
                    return false;
                });
                return;
            }
            n7 = n2 - n4;
        }
    }

    private static int lII(long l2) {
        return (int)l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null && minecraftClient.worldRenderer != null) {
            minecraftClient.worldRenderer.reload();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color lll(Block block) {
        if ((block == Blocks.DIAMOND_ORE || block == Blocks.DEEPSLATE_DIAMOND_ORE) && ((Boolean)this.IIlII.lIl()).booleanValue()) {
            return (Color)this.IIlIl.lIl();
        }
        if ((block == Blocks.EMERALD_ORE || block == Blocks.DEEPSLATE_EMERALD_ORE) && ((Boolean)this.lIII.lIl()).booleanValue()) {
            return (Color)this.II.lIl();
        }
        if ((block == Blocks.GOLD_ORE || block == Blocks.DEEPSLATE_GOLD_ORE || block == Blocks.NETHER_GOLD_ORE) && ((Boolean)this.IlI.lIl()).booleanValue()) {
            return (Color)this.IIlI.lIl();
        }
        if ((block == Blocks.IRON_ORE || block == Blocks.DEEPSLATE_IRON_ORE) && ((Boolean)this.III.lIl()).booleanValue()) {
            return (Color)this.Illl.lIl();
        }
        if ((block == Blocks.REDSTONE_ORE || block == Blocks.DEEPSLATE_REDSTONE_ORE) && ((Boolean)this.IIIl.lIl()).booleanValue()) {
            return (Color)this.Il.lIl();
        }
        if ((block == Blocks.LAPIS_ORE || block == Blocks.DEEPSLATE_LAPIS_ORE) && ((Boolean)this.llll.lIl()).booleanValue()) {
            return (Color)this.IlIII.lIl();
        }
        if ((block == Blocks.COAL_ORE || block == Blocks.DEEPSLATE_COAL_ORE) && ((Boolean)this.IlIl.lIl()).booleanValue()) {
            return (Color)this.ll.lIl();
        }
        if ((block == Blocks.COPPER_ORE || block == Blocks.DEEPSLATE_COPPER_ORE) && ((Boolean)this.lII.lIl()).booleanValue()) {
            return (Color)this.Ill.lIl();
        }
        if (block == Blocks.ANCIENT_DEBRIS && ((Boolean)this.IIlll.lIl()).booleanValue()) {
            return (Color)this.IIIII.lIl();
        }
        if (block != Blocks.RAW_COPPER_BLOCK && block != Blocks.RAW_IRON_BLOCK) {
            if (block != Blocks.RAW_GOLD_BLOCK) return (Color)this.IIll.lIl();
        }
        if ((Boolean)this.llII.lIl() == false) return (Color)this.IIll.lIl();
        return (Color)this.IIIll.lIl();
    }

    public static Xray IIII() {
        return IlII;
    }

    private static long IlII(int n, int n2) {
        return (long)n & 0xFFFFFFFFL | (long)n2 << 32;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IllI(Block block) {
        if (block == null) return false;
        if (block.getDefaultState().isAir()) {
            return false;
        }
        if (this.lIll(block)) return true;
        if (!this.IIIlI(block)) return false;
        return true;
    }

    private void Illl() {
        this.lllI.clear();
        this.lIll.clear();
        this.l = null;
        this.I = Integer.MIN_VALUE;
        this.lI = Integer.MIN_VALUE;
        this.llI = 0;
    }

    public boolean lIII(BlockState blockState) {
        if (blockState != null) {
            if (!blockState.isAir()) {
                return this.IllI(blockState.getBlock());
            }
        }
        return false;
    }

    @Override
    public void llll() {
        if (IlII == this) {
            IlII = null;
        }
        this.Illl();
        this.lIl();
    }

    private double lIIl(BlockPos blockPos) {
        return (double)blockPos.getX() * 0.061 + (double)blockPos.getY() * 0.021 + (double)blockPos.getZ() * 0.043;
    }

    /*
     * Unable to fully structure code
     */
    private void lIlI(MinecraftClient var1_1, BlockPos var2_2, IIllIlIll var3_3, WorldChunk var4_4) {
        block8: {
            block11: {
                block9: {
                    block10: {
                        var5_5 = (Integer)var1_1.options.getViewDistance().getValue();
                        var6_6 = Math.max(1, Math.min(var5_5, 8));
                        var7_7 = var6_6 * 16;
                        var8_8 = var7_7 * var7_7;
                        var9_9 = Math.max(var1_1.world.getBottomY(), var2_2.getY() - 64);
                        var10_10 = Math.min(var1_1.world.getTopYInclusive(), var2_2.getY() + 64);
                        var11_11 = var3_3.l() << 4;
                        var12_12 = var3_3.I() << 4;
                        var13_13 = new BlockPos.Mutable();
                        var14_14 = new ArrayList<lIllIII>();
                        var15_15 = 0;
                        break block10;
lbl13:
                        // 1 sources

                        while (true) {
                            var19_19 = var12_12 + var18_18;
                            var20_20 = var19_19 - var2_2.getZ();
                            if (var17_17 * var17_17 + var20_20 * var20_20 <= var8_8) break block8;
                            ** GOTO lbl44
                            break;
                        }
                    }
lbl19:
                    // 2 sources

                    while (var15_15 >= 16) {
                        this.lIll.put(Xray.IlII(var3_3.l(), var3_3.I()), List.copyOf(var14_14));
                        return;
                    }
                    break block11;
lbl24:
                    // 1 sources

                    while (true) {
                        var14_14.add(new lIllIII(new BlockPos(var16_16, var21_21, var19_19), var22_22.getBlock()));
                        while (true) {
                            ++var21_21;
                            break block9;
                            break;
                        }
                        break;
                    }
                    while (true) {
                        ++var15_15;
                        ** GOTO lbl19
                        break;
                    }
                    while (true) {
                        var13_13.set(var16_16, var21_21, var19_19);
                        if (!this.lIII(var22_22 = var4_4.getBlockState((BlockPos)var13_13))) ** continue;
                        ** continue;
                        break;
                    }
lbl38:
                    // 2 sources

                    while (true) {
                        if (var18_18 >= 16) ** continue;
                        ** continue;
                        break;
                    }
                }
lbl42:
                // 2 sources

                while (true) {
                    if (var21_21 <= var10_10) ** continue;
lbl44:
                    // 2 sources

                    ++var18_18;
                    ** GOTO lbl38
                    break;
                }
            }
            var16_16 = var11_11 + var15_15;
            var17_17 = var16_16 - var2_2.getX();
            var18_18 = 0;
            ** while (true)
        }
        var21_21 = var9_9;
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean lIll(Block block) {
        String string = Registries.BLOCK.getId((Object)block).toString().toLowerCase(Locale.ROOT);
        String string2 = Registries.BLOCK.getId((Object)block).getPath().toLowerCase(Locale.ROOT);
        Iterator iterator = ((List)this.lIIl.lIl()).iterator();
        boolean bl = true;
        while (true) {
            String string3;
            if (!bl || (bl = false) || !true) {
                String string4 = string3;
                if (!string4.isEmpty()) {
                    if (string.equals(string4)) return true;
                    if (string2.equals(string4)) return true;
                    String string5 = string4;
                    String string6 = ":";
                    if (string.endsWith(string6 + string5)) {
                        return true;
                    }
                }
            }
            if (!iterator.hasNext()) return false;
            String string7 = (String)iterator.next();
            if (string7 == null) {
                string3 = "";
                continue;
            }
            string3 = string7.trim().toLowerCase(Locale.ROOT);
        }
    }

    private static void llII() {
        Xray.IIII[0] = Xray.lI(Xray.IIlII(-1601335086, 15929742).toCharArray(), 34744L, -1597848614);
        Xray.IIII[1] = Xray.lI("".toCharArray(), 17830L, 136634814);
        Xray.IIII[2] = Xray.lI(Xray.IIlII(-1601335085, 1202348804).toCharArray(), 26199L, 1114820002);
        Xray.IIII[3] = Xray.lI(Xray.IIlII(-1601335088, -1946916640).toCharArray(), 64601L, 701750821);
        Xray.IIII[4] = Xray.lI(Xray.IIlII(-1601335087, -452243567).toCharArray(), 83635L, 2004163304);
        Xray.IIII[5] = Xray.lI(Xray.IIlII(-1601335082, 1961626460).toCharArray(), 97769L, 1373111550);
        Xray.IIII[6] = Xray.lI(Xray.IIlII(-1601335081, 479471871).toCharArray(), 84259L, 419109222);
        Xray.IIII[7] = Xray.lI(Xray.IIlII(-1601335084, 569711827).toCharArray(), 76331L, 523847728);
        Xray.IIII[8] = Xray.lI(Xray.IIlII(-1601335083, -251371981).toCharArray(), 74495L, 986462323);
        Xray.IIII[9] = Xray.lI(Xray.IIlII(-1601335078, -1939048431).toCharArray(), 68547L, -38139375);
        Xray.IIII[10] = Xray.lI(Xray.IIlII(-1601335077, 1484863490).toCharArray(), 97157L, -684669536);
        Xray.IIII[11] = Xray.lI(Xray.IIlII(-1601335080, -169985137).toCharArray(), 90607L, -1663296401);
        Xray.IIII[12] = Xray.lI(Xray.IIlII(-1601335079, -182621641).toCharArray(), 64172L, 860323246);
        Xray.IIII[13] = Xray.lI(Xray.IIlII(-1601335074, -1038988918).toCharArray(), 30459L, -553552908);
        Xray.IIII[14] = Xray.lI(Xray.IIlII(-1601335073, 853821035).toCharArray(), 28291L, 1962680383);
        Xray.IIII[15] = Xray.lI(Xray.IIlII(-1601335076, 1042495182).toCharArray(), 49804L, -382344152);
        Xray.IIII[16] = Xray.lI(Xray.IIlII(-1601335075, -762554670).toCharArray(), 69450L, -850323402);
        Xray.IIII[17] = Xray.lI(Xray.IIlII(-1601335102, -927127999).toCharArray(), 36425L, 1423702547);
        Xray.IIII[18] = Xray.lI(Xray.IIlII(-1601335101, -1398399961).toCharArray(), 14135L, -1054282476);
        Xray.IIII[19] = Xray.lI(Xray.IIlII(-1601335104, 1236213323).toCharArray(), 53131L, 171707993);
        Xray.IIII[20] = Xray.lI(Xray.IIlII(-1601335103, -1392965068).toCharArray(), 63037L, -29468582);
        Xray.IIII[21] = Xray.lI(Xray.IIlII(-1601335098, 563552082).toCharArray(), 45842L, -25802518);
        Xray.IIII[22] = Xray.lI(Xray.IIlII(-1601335097, 1226520866).toCharArray(), 14527L, -297454175);
        Xray.IIII[23] = Xray.lI(Xray.IIlII(-1601335100, 1062022577).toCharArray(), 77915L, 1008824793);
        Xray.IIII[24] = Xray.lI(Xray.IIlII(-1601335099, 1091526565).toCharArray(), 96424L, 1971137710);
        Xray.IIII[25] = Xray.lI(Xray.IIlII(-1601335094, -1504889012).toCharArray(), 67705L, -355839002);
        Xray.IIII[26] = Xray.lI(Xray.IIlII(-1601335093, 1963161112).toCharArray(), 16716L, -2034219489);
        Xray.IIII[27] = Xray.lI(Xray.IIlII(-1601335096, 1438987792).toCharArray(), 98111L, -1396862523);
        Xray.IIII[28] = Xray.lI(Xray.IIlII(-1601335095, -1085263439).toCharArray(), 55971L, -379863488);
        Xray.IIII[29] = Xray.lI(Xray.IIlII(-1601335090, -2134614953).toCharArray(), 41159L, -782162413);
        Xray.IIII[30] = Xray.lI(Xray.IIlII(-1601335089, -1767349068).toCharArray(), 93925L, 1504301072);
        Xray.IIII[31] = Xray.lI(Xray.IIlII(-1601335092, -1765929852).toCharArray(), 71368L, -1945175987);
        Xray.IIII[32] = Xray.lI(Xray.IIlII(-1601335091, 692219035).toCharArray(), 50056L, -1178847119);
        Xray.IIII[33] = Xray.lI(Xray.IIlII(-1601335054, -27387709).toCharArray(), 60404L, -814196487);
        Xray.IIII[34] = Xray.lI(Xray.IIlII(-1601335053, 1697986818).toCharArray(), 91505L, 1304901895);
    }

    @Override
    public void ll() {
        IlII = this;
        this.Illl();
        this.lIl();
    }

    private static int llIl(long l2) {
        return (int)(l2 >> 32);
    }

    /*
     * Unable to fully structure code
     */
    public void lllI(Object var1_1) {
        block22: {
            block21: {
                block13: {
                    block18: {
                        block20: {
                            block15: {
                                block17: {
                                    block14: {
                                        block19: {
                                            block12: {
                                                block11: {
                                                    block16: {
                                                        if (!this.IIIlIIl()) break block16;
                                                        break block17;
lbl3:
                                                        // 1 sources

                                                        while (true) {
                                                            if (var2_2.world != null) break block11;
                                                            break block12;
                                                            break;
                                                        }
                                                    }
lbl7:
                                                    // 3 sources

                                                    return;
lbl9:
                                                    // 1 sources

                                                    while (!this.IllI(var20_19.I())) {
                                                        ** GOTO lbl15
                                                    }
                                                    break block18;
lbl12:
                                                    // 1 sources

                                                    while (true) {
                                                        var25_24 = this.IIIII(this.lll(var20_19.I()), this.lIIl(var21_20));
                                                        this.IIl(var1_1, var24_23, var25_24, var4_4);
lbl15:
                                                        // 7 sources

                                                        while (true) {
                                                            if (var19_18.hasNext()) break block13;
lbl17:
                                                            // 3 sources

                                                            while (var12_11.hasNext()) {
                                                                break block14;
                                                            }
                                                            break block15;
                                                            break;
                                                        }
                                                        break;
                                                    }
                                                }
                                                if (this.l != var2_2.world) break block19;
                                                var3_3 = var2_2.player.getBlockPos();
                                                var4_4 = (Double)this.lll.lIl() / 100.0 * 255.0;
                                                var6_5 = (Integer)var2_2.options.getViewDistance().getValue();
                                                var7_6 = Math.max(1, Math.min(var6_5, 8));
                                                var8_7 = var7_6 * 16;
                                                var9_8 = var8_7 * var8_7;
                                                var10_9 = Math.max(var2_2.world.getBottomY(), var3_3.getY() - 64);
                                                var11_10 = Math.min(var2_2.world.getTopYInclusive(), var3_3.getY() + 64);
                                                var12_11 = this.lIll.entrySet().iterator();
                                                ** GOTO lbl17
                                            }
lbl33:
                                            // 2 sources

                                            return;
                                        }
                                        this.Illl();
                                        return;
lbl38:
                                        // 1 sources

                                        while (true) {
                                            var19_18 = var13_12.getValue().iterator();
                                            ** GOTO lbl15
                                            break;
                                        }
                                    }
                                    ** while (IllIlI.lllll((Object)var1_1, (Box)(var18_17 = new Box((double)((double)(var16_15 = (var14_13 = Xray.lII((long)(var13_12 = var12_11.next()).getKey().longValue())) << 4)), (double)((double)var10_9), (double)((double)(var17_16 = (var15_14 = Xray.llIl((long)var13_12.getKey().longValue())) << 4)), (double)((double)var16_15 + 16.0), (double)((double)var11_10 + 1.0), (double)((double)var17_16 + 16.0)))))
lbl43:
                                    // 1 sources

                                    ** GOTO lbl17
                                }
                                if (((Boolean)this.IIllI.lIl()).booleanValue()) break block20;
                                break block21;
                            }
                            return;
                            while (true) {
                                if (var21_20.getY() > var11_10) ** GOTO lbl15
                                ** GOTO lbl9
                                break;
                            }
                        }
lbl53:
                        // 2 sources

                        while (!IllIlI.lIIll(var1_1)) {
                            ** GOTO lbl7
                        }
                        break block22;
lbl56:
                        // 1 sources

                        while (true) {
                            if (var21_20.getY() >= var10_9) ** continue;
                            ** GOTO lbl15
                            break;
                        }
                    }
                    ** while (IllIlI.lllll((Object)var1_1, (Box)(var24_23 = new Box((BlockPos)var21_20))))
lbl61:
                    // 1 sources

                    ** GOTO lbl15
                }
                var20_19 = var19_18.next();
                var21_20 = var20_19.l();
                var22_21 = var21_20.getX() - var3_3.getX();
                if (var22_21 * var22_21 + (var23_22 = var21_20.getZ() - var3_3.getZ()) * var23_22 <= var9_8) ** break;
                ** while (true)
                ** while (true)
            }
            if (((Boolean)this.IllI.lIl()).booleanValue()) ** break;
            ** while (true)
            ** GOTO lbl53
        }
        var2_2 = MinecraftClient.getInstance();
        ** while (var2_2.player == null)
lbl76:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Color IIIII(Color color, double d) {
        Color color2;
        switch (((IlIIIlIIl)((Object)this.IIl.lIl())).ordinal()) {
            case 3: {
                color2 = lIlIllI.III(color, lllIIII.II, d);
                return color2;
            }
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                color2 = color;
                return color2;
            }
            case 2: {
                color2 = lIlIllI.III(color, lllIIII.III, d);
                return color2;
            }
            case 1: 
        }
        color2 = lIlIllI.III(color, lllIIII.ll, d);
        return color2;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void IIIIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        boolean bl = !this.lllI.isEmpty();
        int n = 0;
        boolean bl2 = true;
        block0: while (true) {
            long l2;
            if (!bl2 || (bl2 = false) || !true) {
                this.lIll.remove(l2);
            }
            while (true) {
                if (n >= 2 || this.lllI.isEmpty()) {
                    if (!bl) return;
                    if (!this.lllI.isEmpty()) return;
                    this.llI = 1;
                    return;
                }
                IIllIlIll iIllIlIll = this.lllI.removeFirst();
                l2 = Xray.IlII(iIllIlIll.l(), iIllIlIll.I());
                WorldChunk worldChunk = minecraftClient.world.getChunkManager().getWorldChunk(iIllIlIll.l(), iIllIlIll.I());
                if (worldChunk == null) continue block0;
                this.lIlI(minecraftClient, blockPos, iIllIlIll, worldChunk);
                ++n;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlI(Block block) {
        if ((block == Blocks.DIAMOND_ORE || block == Blocks.DEEPSLATE_DIAMOND_ORE) && ((Boolean)this.IIlII.lIl()).booleanValue()) {
            return true;
        }
        if ((block == Blocks.EMERALD_ORE || block == Blocks.DEEPSLATE_EMERALD_ORE) && ((Boolean)this.lIII.lIl()).booleanValue()) {
            return true;
        }
        if ((block == Blocks.GOLD_ORE || block == Blocks.DEEPSLATE_GOLD_ORE || block == Blocks.NETHER_GOLD_ORE) && ((Boolean)this.IlI.lIl()).booleanValue()) {
            return true;
        }
        if ((block == Blocks.IRON_ORE || block == Blocks.DEEPSLATE_IRON_ORE) && ((Boolean)this.III.lIl()).booleanValue()) {
            return true;
        }
        if ((block == Blocks.REDSTONE_ORE || block == Blocks.DEEPSLATE_REDSTONE_ORE) && ((Boolean)this.IIIl.lIl()).booleanValue()) {
            return true;
        }
        if ((block == Blocks.LAPIS_ORE || block == Blocks.DEEPSLATE_LAPIS_ORE) && ((Boolean)this.llll.lIl()).booleanValue()) {
            return true;
        }
        if ((block == Blocks.COAL_ORE || block == Blocks.DEEPSLATE_COAL_ORE) && ((Boolean)this.IlIl.lIl()).booleanValue()) {
            return true;
        }
        if ((block == Blocks.COPPER_ORE || block == Blocks.DEEPSLATE_COPPER_ORE) && ((Boolean)this.lII.lIl()).booleanValue()) {
            return true;
        }
        if (block == Blocks.ANCIENT_DEBRIS && ((Boolean)this.IIlll.lIl()).booleanValue()) {
            return true;
        }
        if ((block == Blocks.RAW_COPPER_BLOCK || block == Blocks.RAW_IRON_BLOCK || block == Blocks.RAW_GOLD_BLOCK) && ((Boolean)this.llII.lIl()).booleanValue()) {
            return true;
        }
        String string = Registries.BLOCK.getId((Object)block).getPath().toLowerCase(Locale.ROOT);
        if ((Boolean)this.IIIIl.lIl() == false) return false;
        if (string.endsWith("_ore")) return true;
        if (!string.equals("ancient_debris")) return false;
        return true;
    }

    private static int IIIll(int n, int n2) {
        return IlIIl[n ^ 0x7C9D4862] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IIlII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xA08D90D2;
        char[] cArray = IlIlI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlIll[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Xray.IlIll[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xED5660B9;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 15: {
                    n6 = 150;
                    continue block33;
                }
                case 21: {
                    n6 = 129;
                    continue block33;
                }
                case 27: {
                    n6 = 220;
                    continue block33;
                }
                case 24: {
                    n6 = 63;
                    continue block33;
                }
                case 20: {
                    n6 = 220;
                    continue block33;
                }
                case 17: {
                    n6 = 196;
                    continue block33;
                }
                case 12: {
                    n6 = 20;
                    continue block33;
                }
                case 11: {
                    n6 = 67;
                    continue block33;
                }
                case 9: {
                    n6 = 24;
                    continue block33;
                }
                case 18: {
                    n6 = 114;
                    continue block33;
                }
                case 30: {
                    n6 = 246;
                    continue block33;
                }
                case 23: {
                    n6 = 45;
                    continue block33;
                }
                case 1: {
                    n6 = 103;
                    continue block33;
                }
                case 7: {
                    n6 = 61;
                    continue block33;
                }
                case 10: {
                    n6 = 249;
                    continue block33;
                }
                case 19: {
                    n6 = 32;
                    continue block33;
                }
                case 6: {
                    n6 = 28;
                    continue block33;
                }
                case 13: {
                    n6 = 194;
                    continue block33;
                }
                case 3: {
                    n6 = 179;
                    continue block33;
                }
                case 26: {
                    n6 = 54;
                    continue block33;
                }
                case 4: {
                    n6 = 12;
                    continue block33;
                }
                case 5: {
                    n6 = 172;
                    continue block33;
                }
                case 31: {
                    n6 = 133;
                    continue block33;
                }
                case 28: {
                    n6 = 40;
                    continue block33;
                }
                case 29: {
                    n6 = 49;
                    continue block33;
                }
                case 2: {
                    n6 = 108;
                    continue block33;
                }
                case 25: {
                    n6 = 83;
                    continue block33;
                }
                case 8: {
                    n6 = 7;
                    continue block33;
                }
                case 14: {
                    n6 = 111;
                    continue block33;
                }
                case 16: {
                    n6 = 11;
                    continue block33;
                }
                default: {
                    n6 = 55;
                    continue block33;
                }
                case 22: 
            }
            n6 = 177;
        }
        return new String(cArray).intern();
    }
}

