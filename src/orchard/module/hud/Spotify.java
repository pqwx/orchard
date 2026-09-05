/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIlIlI
 * Module         : Spotify  [HUD]
 * Description    : Shows the current Spotify song, album artwork, progress, and synced lyrics.   (client's own text)
 *
 * Recovered strings in this class:
 *   - ), 132.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII(
 *   - ), 18.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII(
 *   - Midnight city lights
 *   - Music Display
 *   - Unknown track
 *   - .getBytes(
 *   - Lyrics
 *   - FEAR.
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.Identifier
 */
package orchard.module.hud;

import java.awt.Color;
import java.util.Locale;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlI;
import orchard.internal.IIIllIII;
import orchard.internal.IlIIIIll;
import orchard.internal.lIIIlIII;
import orchard.internal.lIlIIlI;
import orchard.internal.ll;
import orchard.internal.llIIlIl;
import orchard.internal.llIll;
import orchard.internal.llIllIll;
import orchard.internal.lllIlIII;
import orchard.internal.lllIlll;
import orchard.module.iface.Interface;
import orchard.net.SpotifyBridge;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class Spotify
extends ModuleBase
implements lllIlIII {
    private String I = "";
    private final lIlIIlI l;
    private static final double II = 8.5;
    private long Il;
    private static final double lI = 12.0;
    private final llIll ll;
    private static final double III = 14.0;
    private static final double IIl = 14.0;
    private String IlI = "";
    private static final IIIllIII Ill;
    private static final double lII = 13.0;
    private final lIlIIlI lIl;
    private static final double llI = 88.0;
    private static final double lll = 0.62;
    private String IIII = "";
    private long IIIl;
    private static final double IIlI = 240.0;
    private static final double IIll = 68.0;
    private static final double IlII = 5.0;
    private static final double IlIl = 76.0;
    private static final double IllI = 0.8;
    private static final double Illl = 250.0;
    private final SpotifyBridge lIII = new SpotifyBridge();
    private static final double lIIl = 184.0;
    private double lIlI = 1.0;
    private static final long lIll = 10000L;
    private static final double llII = 158.0;
    private static final double llIl = 35.0;
    private final lIlIIlI lllI;
    private static final double llll = 127.0;
    private static final double IIIII = 210.0;
    private final IIIIIIIIl<llIIlIl> IIIIl = this.IIlllIl(new IIIIIIIIl<llIIlIl>(StringFactory.IIII("Mode"), llIIlIl.class, llIIlIl.I));
    private static final long IIIlI = 100000000L;
    private static final double IIIll = 40.0;
    private double IIlII = 76.0;
    private double IIlIl;
    private static final double IIllI = 0.82;
    private static final double IIlll = 105.0;
    private static final double IlIII = 24.0;
    private static final double IlIIl = 40.0;
    private static final int[] IlIlI;
    private static final String[] IlIll;
    private static final Object[] IllII;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String lI(String string, String string2) {
        String string3;
        if (string != null) {
            if (!string.isBlank()) {
                string3 = string;
                return string3;
            }
        }
        string3 = string2;
        return string3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(DrawContext drawContext, MinecraftClient minecraftClient, lllIlll lllIlll2, long l2, boolean bl, boolean bl2) {
        String string;
        int n;
        Color color;
        Color color2;
        TextRenderer textRenderer;
        block1: {
            block0: {
                textRenderer = minecraftClient.textRenderer;
                color2 = IlIIIIll.III();
                color = IlIIIIll.I();
                n = IlIIIIll.II(255);
                IlIIIIll.l(drawContext, Ill, 0.0, 0.0, 210.0, 250.0, bl2);
                int n2 = lIIIlIII.II(IlIIIIll.lIIl(255), 255);
                orchard.internal.IIIlI.Illl(drawContext, 0.0, 0.0, 210.0, 24.0, 8.0, n2);
                orchard.internal.IIIlI.lIIlll(drawContext, 0.0, 8.0, 210.0, 16.0, n2);
                if (!((Boolean)this.ll.lIl()).booleanValue()) break block0;
            }
            string = "";
            break block1;
            string = lllIlll2.IIIl().ll(bl ? lllIlll2.Ill() : lllIlll2.IIl(l2), lllIlll2.I());
        }
        String string2 = string;
        this.lII(string2, l2);
        String string3 = (Boolean)this.ll.lIl() != false && !string2.isBlank() ? string2 : Spotify.lI(lllIlll2.II(), "Music Display");
        String string4 = orchard.internal.IIIlI.llIIIl(textRenderer, string3, 194.0);
        orchard.internal.IIIlI.llIlll(drawContext, textRenderer, string4, 0.0, 1.0, 210.0, 24.0, n);
        orchard.internal.IIIlI.IlIlll(drawContext, 105.0, 128.0, 94.0, 3.0, 0x56000000);
        Identifier identifier = !bl ? this.lIII.IlIII(lllIlll2.lll()) : null;
        this.IlI(drawContext, identifier, lllIlll2);
        orchard.internal.IIIlI.IlIlll(drawContext, 105.0, 127.0, 92.0, 1.25, -1266777204);
        orchard.internal.IIIlI.IlIlll(drawContext, 105.0, 127.0, 14.0, 2.0, -427061096);
        long l3 = bl ? lllIlll2.Ill() : lllIlll2.IIl(l2);
        double d = bl ? lllIlll2.l(lllIlll2.lIl()) : lllIlll2.l(l2);
        double d2 = 235.0;
        orchard.internal.IIIlI.IlIIll(drawContext, textRenderer, Spotify.lIlI(l3), 8.0, d2, n);
        orchard.internal.IIIlI.IlIIIl(drawContext, textRenderer, Spotify.lIlI(lllIlll2.I()), 202.0, d2, n);
        double d3 = 114.0;
        double d4 = (210.0 - d3) * 0.5;
        Objects.requireNonNull(textRenderer);
        double d5 = d2 + (9.0 - 4.0) * 0.5;
        orchard.internal.IIIlI.Illl(drawContext, d4, d5, d3, 4.0, 2.0, 0x60000000);
        if (!(d > 0.0)) return;
        orchard.internal.IIIlI.IIlIIl(drawContext, d4, d5, d3 * d, 4.0, 2.0, color.getRGB(), color2.getRGB());
    }

    @Override
    public void ll() {
        this.lIII.IIIl((Boolean)this.ll.lIl());
        this.lIII.IIIll(MinecraftClient.getInstance());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IlI(DrawContext drawContext, Identifier identifier, lllIlll lllIlll2) {
        if (identifier == null) {
            orchard.internal.IIIlI.IIIIIl(drawContext, 105.0, 127.0, 92.0, lIIIlIII.II(IlIIIIll.lIIl(255), 255));
            orchard.internal.IIIlI.llIlll(drawContext, MinecraftClient.getInstance().textRenderer, String.valueOf('?'), 13.0, 35.0, 184.0, 184.0, IlIIIIll.II(255));
            return;
        }
        orchard.internal.IIIlI.lIlIIl(drawContext);
        try {
            orchard.internal.IIIlI.Ill(drawContext, 105.0, 127.0);
            orchard.internal.IIIlI.IIlII(drawContext, this.IIIll(lllIlll2));
            orchard.internal.IIIlI.Ill(drawContext, -105.0, -127.0);
            orchard.internal.IIIlI.llll(drawContext, identifier, 13.0, 35.0, 184.0, 184.0);
        }
        finally {
            orchard.internal.IIIlI.IlIllI(drawContext);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lII(String string, long l2) {
        block3: {
            double d;
            block8: {
                block6: {
                    block1: {
                        double d2;
                        block7: {
                            block4: {
                                block5: {
                                    block2: {
                                        block0: {
                                            String string2 = string == null ? "" : string;
                                            if (string2.equals(this.I)) break block0;
                                            this.IlI = this.I;
                                            this.I = string2;
                                            if (string2.isEmpty()) break block1;
                                            break block2;
                                        }
                                        if (!(this.lIlI < 1.0)) break block3;
                                        if (this.IIIl != 0L) break block4;
                                        break block5;
                                    }
                                    if (!this.IlI.isEmpty()) break block6;
                                    break block1;
                                }
                                d2 = 0.0;
                                break block7;
                            }
                            d2 = Math.min(0.25, Math.max(0.0, (double)(l2 - this.IIIl) / 1000.0));
                        }
                        double d3 = d2;
                        this.lIlI = Math.min(1.0, this.lIlI + d3 * 8.5);
                        break block3;
                    }
                    d = 1.0;
                    break block8;
                }
                d = 0.0;
            }
            this.lIlI = d;
        }
        this.IIIl = l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lllI(double d, double d2) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        double d3 = Double.MAX_VALUE;
        double d4 = Double.MAX_VALUE;
        if (minecraftClient != null && minecraftClient.getWindow() != null) {
            d3 = Math.max(0.0, (double)minecraftClient.getWindow().getScaledWidth() - this.III());
            d4 = Math.max(0.0, (double)minecraftClient.getWindow().getScaledHeight() - this.IIll());
        }
        this.lllI.lI(Math.max(0.0, Math.min(d, d3)));
        this.lIl.lI(Math.max(0.0, Math.min(d2, d4)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double lIl() {
        if (this.IIIIl.lIl() == llIIlIl.Il) return 200.0;
        double d = this.IIlII;
        return d;
    }

    private static lllIlll lll() {
        String string = "Midnight city lights";
        String string2 = StringFactory.IIl("o8QExkkHHkzHNd8=");
        return new lllIlll(true, StringFactory.IIl("iIZRihBSRw=="), "FEAR.", StringFactory.IIl("s5FamAteUxfXJJ5UDsE="), StringFactory.IIl("vLV5slc="), 232000L, 460000L, true, 0L, false, llIllIll.Il(string2 + string, "Midnight city lights"));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIII(DrawContext drawContext, MinecraftClient minecraftClient, lllIlll lllIlll2, long l2, boolean bl, boolean bl2) {
        double d;
        String string;
        int n;
        Color color;
        Color color2;
        TextRenderer textRenderer;
        block5: {
            long l3;
            llIllIll llIllIll2;
            block6: {
                block3: {
                    block4: {
                        block2: {
                            textRenderer = minecraftClient.textRenderer;
                            color2 = IlIIIIll.III();
                            color = IlIIIIll.I();
                            n = IlIIIIll.II(255);
                            if (!((Boolean)this.ll.lIl()).booleanValue()) break block2;
                            llIllIll2 = lllIlll2.IIIl();
                            if (!bl) break block3;
                            break block4;
                        }
                        string = "";
                        break block5;
                    }
                    l3 = lllIlll2.Ill();
                    break block6;
                }
                l3 = lllIlll2.IIl(l2);
            }
            string = llIllIll2.ll(l3, lllIlll2.I());
        }
        String string2 = string;
        this.lII(string2, l2);
        this.IIlII = !string2.isEmpty() ? 88.0 : 76.0;
        boolean bl3 = !string2.isEmpty();
        IlIIIIll.l(drawContext, Ill, 0.0, 0.0, 240.0, this.IIlII, bl2);
        double d2 = d = bl3 ? 11.0 : 10.0;
        if (!bl) {
            orchard.internal.IIIlI.Illl(drawContext, 13.0, d - 1.0, 42.0, 42.0, 6.0, 0x4C000000);
        }
        this.IIIII(drawContext, lllIlll2.lll(), bl, d);
        double d3 = bl3 ? 13.0 : 18.0;
        double d4 = bl3 ? 26.0 : 31.0;
        orchard.internal.IIIlI.IlIIll(drawContext, textRenderer, orchard.internal.IIIlI.llIIIl(textRenderer, Spotify.lI(lllIlll2.II(), "Unknown track"), 158.0), 68.0, d3, n);
        orchard.internal.IIIlI.IlIIll(drawContext, textRenderer, orchard.internal.IIIlI.llIIIl(textRenderer, Spotify.lI(lllIlll2.llI(), "Spotify"), 158.0), 68.0, d4, n);
        if (bl3 || this.lIlI < 1.0) {
            this.IIIlI(drawContext, textRenderer);
        }
        long l4 = bl ? lllIlll2.Ill() : lllIlll2.IIl(l2);
        double d5 = bl3 ? 64.0 : 52.0;
        orchard.internal.IIIlI.IlIIll(drawContext, textRenderer, Spotify.lIlI(l4), 14.0, d5, n);
        orchard.internal.IIIlI.IlIIIl(drawContext, textRenderer, Spotify.lIlI(lllIlll2.I()), 226.0, d5, n);
        double d6 = 212.0;
        double d7 = bl ? lllIlll2.l(lllIlll2.lIl()) : lllIlll2.l(l2);
        double d8 = bl3 ? 76.0 : 65.0;
        orchard.internal.IIIlI.Illl(drawContext, 14.0, d8, d6, 4.0, 2.0, 0x58000000);
        if (!(d7 > 0.0)) return;
        orchard.internal.IIIlI.IIlIIl(drawContext, 14.0, d8, d6 * d7, 4.0, 2.0, color.getRGB(), color2.getRGB());
    }

    @Override
    public double III() {
        return this.llIl() * this.lIll();
    }

    @Override
    public void lIII(DrawContext drawContext, int n, int n2, float f) {
        this.IllI(drawContext, false, false);
    }

    private void IIlI(DrawContext drawContext, MinecraftClient minecraftClient, lllIlll lllIlll2, long l2, boolean bl, boolean bl2) {
        switch (((llIIlIl)((Object)this.IIIIl.lIl())).ordinal()) {
            case 1: {
                this.lIIl(drawContext, minecraftClient, lllIlll2, l2, bl, bl2);
                break;
            }
            case 0: {
                this.IIII(drawContext, minecraftClient, lllIlll2, l2, bl, bl2);
                break;
            }
        }
    }

    @Override
    public double IIll() {
        return this.lIl() * this.lIll();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block38: {
            block40: {
                block37: {
                    block34: {
                        block39: {
                            block33: {
                                block30: {
                                    block36: {
                                        block31: {
                                            block35: {
                                                block32: {
                                                    block29: {
                                                        block28: {
                                                            break block34;
lbl1:
                                                            // 2 sources

                                                            while (true) {
                                                                continue;
                                                                break;
                                                            }
lbl3:
                                                            // 1 sources

                                                            while (true) {
                                                                if (++var10_10 < var8_8.length) break block28;
                                                                break block29;
                                                                break;
                                                            }
lbl6:
                                                            // 1 sources

                                                            while (true) {
                                                                break block30;
                                                                break;
                                                            }
                                                        }
lbl9:
                                                        // 2 sources

                                                        while (true) {
                                                            break block31;
                                                            break;
                                                        }
lbl11:
                                                        // 1 sources

                                                        while (true) {
                                                            continue;
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
                                                            v0 = 66;
                                                            break block32;
                                                            break;
                                                        }
                                                    }
                                                    var13_13 = 0;
                                                    break block35;
                                                }
lbl22:
                                                // 6 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
lbl24:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 106;
                                                    ** GOTO lbl22
                                                    break;
                                                }
lbl27:
                                                // 1 sources

                                                while (true) {
                                                    ** continue;
                                                    break;
                                                }
                                            }
lbl30:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl32:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                            var10_10 = 0;
                                            break block36;
                                        }
                                        var12_12 = var8_8[var10_10] ^ var6;
                                        var14_14 = var7_7.substring(var11_11, var11_11 + var12_12).toCharArray();
                                        var15_15 = 0;
                                        break block37;
lbl41:
                                        // 1 sources

                                        while (true) {
                                            v0 = 122;
                                            ** GOTO lbl22
                                            break;
                                        }
lbl44:
                                        // 1 sources

                                        while (true) {
                                            var11_11 += var12_12;
                                            ** continue;
                                            break;
                                        }
lbl47:
                                        // 1 sources

                                        while (true) {
                                            Spotify.IlIlI = new int[var1_2];
                                            ** continue;
                                            break;
                                        }
                                    }
                                    var11_11 = 0;
                                    break block38;
lbl53:
                                    // 1 sources

                                    while (true) {
                                        var3_4 += 4;
                                        if (++var4_5 < var1_2) ** GOTO lbl1
                                        break block33;
                                        break;
                                    }
lbl57:
                                    // 1 sources

                                    while (true) {
                                        v0 = 20;
                                        ** GOTO lbl22
                                        break;
                                    }
lbl60:
                                    // 1 sources

                                    while (true) {
                                        v0 = 32;
                                        ** GOTO lbl22
                                        break;
                                    }
                                    var8_8 = "\u4ece\u4ed6\u4ed2\u4ece\u4ed2\u4eca\u4ec6\u4ec6\u4ece\u4ed6\u4ed6\u4ed6\u4ebe\u4ed2\u4ed2\u4ede\u4ede\u4ede\u4ede\u4ed2\u4ede".toCharArray();
                                    break block39;
lbl65:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                if (var15_15 < var14_14.length) break block37;
                                break block40;
                                var3_4 = 0;
                                var4_5 = 0;
                                ** while (true)
                            }
                            Spotify.Ill = IIIllIII.I;
                            return;
                        }
                        var9_9 = new String[var8_8.length];
                        var13_13 = -1;
                        ** while (true)
                        var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                        Spotify.IlIlI[var4_5] = var5_6 ^= var2_3;
                        ** while (true)
lbl83:
                        // 1 sources

                        while (true) {
                            v0 = 115;
                            ** continue;
                            break;
                        }
lbl86:
                        // 1 sources

                        while (true) {
                            var1_2 = var0_1.length / 4;
                            ** continue;
                            break;
                        }
                    }
                    var6 = 20186;
                    var7_7 = "\ud693\ud690\ud68b\ud69e\ud6e9\ud689\ud686\ud697\ud6d5\ud690\ud6cc\ud6e4\ud6de\ud681\ud6f3\ud689\ud6bf\ud686\ud6d4\ud6fc\u58fa\u58f2\u5899\u58f6\u5898\u58c1\u58d7\u58e8\u5891\ua72d\u58c4\u589e\u1503\u152f\u1565\u1573\u1565\u152d\u1510\u156e\uf912\uf964\uf90b\uf931\uf966\uf918\uf913\uf914\uf97a\uf92e\uf95f\uf907\uf929\uf901\uf91a\uf91d\uf941\uf92a\uf95c\uf97c\u71c1\u71d7\u71b7\u71b1\u719c\u71e7\u71ce\u71a0\ue3b3\ue3ca\ue3df\ue3a4\ue3c0\ue38f\ue3b7\ue3ba\ue3c4\ue386\ue3c2\ue3aa\ue38c\ue39e\ue3b4\ue22c\u1958\u1946\u194d\u194a\u191f\u1944\u1966\u1953\u192f\u195a\u191c\u1954\u1965\u1937\u1938\u1953\u1908\u196c\u1974\u195d\u1916\u192e\u195f\u197d\u197b\u194b\u195a\u1926\ue683\ue681\ue696\ue691\ue6f8\ue6a7\ue6b1\ue688\ue688\ue681\ue6fb\ue697\ue6b2\ue6d4\ue6ff\ue684\ue6cf\ue6bf\ue6a7\ue68a\ue6cd\ue6cd\ue6b8\ue6aa\ue6a0\ue690\ue699\ue6f5\u21f0\u21f0\u21a4\u202d\u218d\u21d2\u21d8\u21e9\u218c\u21d7\u219b\u21c6\u21c3\u21da\u21fb\u21d0\u21a2\u21f9\u21b5\u219d\u02b5\u02d2\u02c2\u0295\u02bf\u02bc\u0284\u02bc\u02cd\u02a4\u0293\u02c9\u25e0\u2598\u25d4\u25bd\u25d4\u25b6\u2596\u25a8\u25c4\u25bf\u2581\u2585\u94df\u94bc\u94ac\u94fb\u94a5\u94d2\u94ea\u94d2\u94af\u94ce\u94f1\u94ab\u20c0\u2094\u2099\u20e0\u20ba\u20c6\u20d6\u20c7\u20b7\u20c0\u2080\u20da\u20e2\u20d1\u2099\u20c5\u209d\u20ea\u20ff\u20f9\u208c\u20c9\u20ab\u2f24\u20e9\u20ab\u20a8\u2f2f\u2082\u20b8\u20da\u20f8\u208f\u20eb\u20ba\u20cc\u2f1d\u20e6\u20a9\u2f2d\u20b8\u20fb\u20bd\u20c1\u2082\u20dc\u20b2\u20c1\u20ed\u20d9\u2085\u20d0\u2091\u20ee\u20f4\u20e5\u208c\u20dd\u20a0\u20d4\u20d5\u2094\u20eb\u20c7\u20ba\u20ff\u20c3\u20cb\u208f\u20ee\u20ad\u20d4\u20e0\u20a8\u20a5\u20de\u2090\u20d1\u20ed\u20fb\u20b5\u20be\u2091\u20c7\u20da\u20d1\u20aa\u20d0\u2f7e\u20cd\u20fe\u2f35\u20b5\u20eb\u209a\u2f25\u20db\u20d9\u20ab\u20d0\uaca6\uaca8\uacf0\uacb8\uaccf\uacb1\uab1d\uab35\u2187\u219c\u21aa\u2183\u21fd\u21e5\u2183\u2198\uc40d\uc417\uc415\uc472\u3402\u340a\u3442\u347f\uc30e\uc300\uc32a\uc34d\ub801\ub809\ub84d\ub87c\u6baa\u6bce\u6be3\u6bba\u6bd2\u6ba7\u6ba4\u6a36\u97b2\u97f8\u97e2\u9785";
                    ** while (true)
                }
                switch (var15_15 % 6) {
                    default: {
                        ** continue;
                    }
                    case 1: {
                        ** continue;
                    }
                    case 5: {
                        ** continue;
                    }
                    case 2: {
                        ** continue;
                    }
                    case 4: {
                        ** continue;
                    }
                    ** case 3:
lbl106:
                    // 1 sources

                    ** continue;
                }
            }
            var9_9[var10_10] = new String(var14_14).intern();
            ** while (true)
            var16_16 = v0;
            v1 = var15_15++;
            var14_14[v1] = (char)(var14_14[v1] ^ var16_16);
            ** while (true)
        }
        var12_12 = 0;
        ** while (var13_13 != 0)
lbl117:
        // 1 sources

        ** while (true)
        var2_3 = -1126514329;
        var0_1 = "'\u0003]\u00a4\u00f8\u00abR\u00b2\u00ee\u00e5-\u00e2x\u00c9\u0006\u00fa\u00b1\u00edW\u00e3X\\sx\u0094\u00c7+;,&\u00b8A\u00d7z\u00cc\u00db\u00a7\u00a5b_\u0080\u00ff@g\u00b2\u0010?\u00ea\u00e1\u00c9!+g\u008f\u00a1\u00a6Q\u00db\u00c2\u00bd`\u00be-\u00f8J,$\np\u009f=\u00b2\u00e9\u00ac\tU".getBytes("ISO-8859-1");
        ** while (true)
        Spotify.IlIll = var9_9;
        Spotify.IllII = new Object[var9_9.length];
        ** while (true)
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IllI(DrawContext drawContext, boolean bl, boolean bl2) {
        lllIlll lllIlll2;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (drawContext == null || minecraftClient == null || minecraftClient.textRenderer == null) {
            return;
        }
        lllIlll lllIlll3 = lllIlll2 = bl ? Spotify.lll() : this.lIII.llII();
        if (!lllIlll2.lI()) {
            return;
        }
        long l2 = System.currentTimeMillis();
        double d = this.lIll();
        orchard.internal.IIIlI.lIlIIl(drawContext);
        orchard.internal.IIIlI.Ill(drawContext, this.IlII(), this.IlIl());
        orchard.internal.IIIlI.IIlll(drawContext, d, d);
        try {
            this.IIlI(drawContext, minecraftClient, lllIlll2, l2, bl, bl2);
        }
        finally {
            orchard.internal.IIIlI.IlIllI(drawContext);
        }
    }

    @Override
    public boolean IlIlIII() {
        return orchard.internal.ll.IIl();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lIIl(DrawContext drawContext, MinecraftClient minecraftClient, lllIlll lllIlll2, long l2, boolean bl, boolean bl2) {
        orchard.internal.IIIlI.lIlIIl(drawContext);
        orchard.internal.IIIlI.IIlll(drawContext, 0.8, 0.8);
        try {
            this.IIl(drawContext, minecraftClient, lllIlll2, l2, bl, bl2);
        }
        finally {
            orchard.internal.IIIlI.IlIllI(drawContext);
        }
    }

    static String lIlI(long l2) {
        long l3 = Math.max(0L, l2) / 1000L;
        return String.format(Locale.ROOT, "%02d:%02d", l3 / 60L, l3 % 60L);
    }

    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        this.IllI(drawContext, false, false);
    }

    private double lIll() {
        return (Double)this.l.lIl() / 100.0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double llIl() {
        if (this.IIIIl.lIl() != llIIlIl.Il) return 240.0;
        return 168.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIII(DrawContext drawContext, Identifier identifier, boolean bl, double d) {
        if (bl || identifier == null) {
            orchard.internal.IIIlI.llIlll(drawContext, MinecraftClient.getInstance().textRenderer, String.valueOf('?'), 14.0, d, 40.0, 40.0, IlIIIIll.II(255));
            return;
        }
        orchard.internal.IIIlI.llll(drawContext, identifier, 14.0, d, 40.0, 40.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIIIl(TextRenderer textRenderer, String string, double d) {
        int n = Math.max(1, orchard.internal.IIIlI.IIIlll(textRenderer, string == null ? "" : string));
        double d2 = Math.min(0.82, d / (double)n);
        return Math.max(0.62, d2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Spotify(Interface interface_) {
        super(StringFactory.IIII("Spotify"), Category.I, StringFactory.IIII("Shows the current Spotify song, album artwork, progress, and synced lyrics."));
        this.ll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Lyrics"), true));
        this.lllI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("X"), 18.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII("px")));
        this.lIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Y"), 132.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII("px")));
        this.l = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Scale"), 100.0, 60.0, 200.0, 5.0).IIII(StringFactory.IIII("%")));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IIIlI(DrawContext drawContext, TextRenderer textRenderer) {
        String string = this.I;
        String string2 = this.IlI;
        if ((string == null || string.isBlank()) && this.lIlI >= 1.0) {
            return;
        }
        int n = IlIIIIll.IIll(235);
        double d = 1.0 - Math.pow(1.0 - Math.max(0.0, Math.min(1.0, this.lIlI)), 3.0);
        double d2 = 158.0;
        orchard.internal.IIIlI.llII(drawContext, 68.0, 38.0, 68.0 + d2, 54.0);
        try {
            if (string2 != null && !string2.isBlank() && d < 1.0) {
                this.IIlII(drawContext, textRenderer, string2, 40.0 - 12.0 * d, d2, n);
            }
            if (string != null && !string.isBlank()) {
                this.IIlII(drawContext, textRenderer, string, 40.0 + 12.0 * (1.0 - d), d2, n);
            }
        }
        finally {
            orchard.internal.IIIlI.lIllll(drawContext);
        }
    }

    @Override
    public void llll() {
        this.lIII.II(MinecraftClient.getInstance());
    }

    @Override
    public double IlIl() {
        return (Double)this.lIl.lIl();
    }

    @Override
    public void III() {
        this.lIII.IIIl((Boolean)this.ll.lIl());
        this.lIII.IIIll(MinecraftClient.getInstance());
    }

    @Override
    public void llII(DrawContext drawContext, int n, int n2, float f, boolean bl) {
        this.IllI(drawContext, true, bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIIll(lllIlll lllIlll2) {
        String string;
        long l2 = System.nanoTime();
        String string2 = string = lllIlll2 == null ? "" : lllIlll2.IlI();
        if (string.equals(this.IIII)) {
            if (this.Il == 0L) {
                this.Il = l2;
                return this.IIlIl;
            }
        } else {
            this.IIII = string;
            this.IIlIl = 0.0;
            this.Il = l2;
            return this.IIlIl;
        }
        long l3 = Math.max(0L, Math.min(100000000L, l2 - this.Il));
        this.Il = l2;
        if (lllIlll2 == null) return this.IIlIl;
        if (!lllIlll2.ll()) return this.IIlIl;
        double d = (double)l3 / 1000000.0;
        this.IIlIl = (this.IIlIl + d * 360.0 / 10000.0) % 360.0;
        return this.IIlIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean Illl(double d, double d2) {
        if (!(d >= this.IlII())) return false;
        if (!(d <= this.IlII() + this.III())) return false;
        if (!(d2 >= this.IlIl())) return false;
        if (!(d2 <= this.IlIl() + this.IIll())) return false;
        return true;
    }

    @Override
    public double IlII() {
        return (Double)this.lllI.lIl();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IIlII(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, int n) {
        double d3 = this.IIIIl(textRenderer, string, d2);
        String string2 = d3 <= 0.62 && (double)orchard.internal.IIIlI.IIIlll(textRenderer, string) * d3 > d2 ? orchard.internal.IIIlI.llIIIl(textRenderer, string, d2 / d3) : string;
        orchard.internal.IIIlI.lIlIIl(drawContext);
        try {
            orchard.internal.IIIlI.Ill(drawContext, 68.0, d);
            orchard.internal.IIIlI.IIlll(drawContext, d3, d3);
            orchard.internal.IIIlI.IlIIll(drawContext, textRenderer, string2, 0.0, 0.0, n);
        }
        finally {
            orchard.internal.IIIlI.IlIllI(drawContext);
        }
    }

    private static int IIlIl(int n, int n2) {
        return IlIlI[n ^ 0xD7F60715] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIllI(int n, char c, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xC5C5;
        char[] cArray = IlIll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IllII[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Spotify.IllII[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x66C;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0x47;
            n7 ^= 0x4362;
            n7 ^= 0x1B84;
            n7 -= 20476;
            n7 += 50753;
            n7 -= 54779;
            cArray[n6] = (char)((n7 -= 43975) ^ n4 ^ c ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

