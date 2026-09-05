/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlI
 * Module         : Storage ESP  [RENDER]
 * Description    : Highlights storage containers with colored boxes.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Ender chest color
 *   - Furnace color
 *   - Shulker color
 *   - Spawner color
 *   - Barrel color
 *   - Hopper color
 *   - Ender Chests
 *   - Chest color
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.block.entity.BarrelBlockEntity
 *  net.minecraft.block.entity.BlockEntity
 *  net.minecraft.block.entity.ChestBlockEntity
 *  net.minecraft.block.entity.EnderChestBlockEntity
 *  net.minecraft.block.entity.FurnaceBlockEntity
 *  net.minecraft.block.entity.HopperBlockEntity
 *  net.minecraft.block.entity.MobSpawnerBlockEntity
 *  net.minecraft.block.entity.ShulkerBoxBlockEntity
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 */
package orchard.module.render;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.entity.BarrelBlockEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.ChestBlockEntity;
import net.minecraft.block.entity.EnderChestBlockEntity;
import net.minecraft.block.entity.FurnaceBlockEntity;
import net.minecraft.block.entity.HopperBlockEntity;
import net.minecraft.block.entity.MobSpawnerBlockEntity;
import net.minecraft.block.entity.ShulkerBoxBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IllIlI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlIllI;
import orchard.internal.llI;
import orchard.internal.llIlIlII;
import orchard.internal.llIll;
import orchard.internal.lllIIII;

@Environment(value=EnvType.CLIENT)
public final class StorageESP
extends ModuleBase {
    private final llIll I;
    private static final Color l;
    private final llIll II;
    private final llIll Il;
    private static final int lI = 8;
    private final llIll ll;
    private final llIlIlII III;
    private static final Color IIl;
    private static final Color IlI;
    private static String[] Ill;
    private final IIIIIIIIl<llI> lII;
    private final llIlIlII lIl;
    private final llIlIlII llI;
    private final llIlIlII lll;
    private final llIll IIII;
    private final llIll IIIl;
    private final llIlIlII IIlI;
    private final llIll IIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Fill"), true));
    private final lIlIIlI IlII;
    private final llIlIlII IlIl;
    private final llIlIlII IllI;
    private final llIll Illl;
    private static final Color lIII;
    private static final Color lIIl;
    private final llIll lIlI;
    private static final Color lIll;
    private static final Color llII;
    private static final int[] llIl;
    private static final String[] lllI;
    private static final Object[] llll;

    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0xDCF9D850 ^ n;
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

    @Override
    public void llll() {
    }

    public StorageESP() {
        super(StringFactory.IIII("Storage ESP"), Category.l, StringFactory.IIII("Highlights storage containers with colored boxes."));
        this.IIII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Outline"), true));
        this.IlII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Opacity"), 30.0, 0.0, 100.0, 1.0).IIIl("3Q=="));
        this.lII = this.IIlllIl(new IIIIIIIIl<llI>(StringFactory.IIII("Style"), llI.class, orchard.internal.llI.ll));
        this.II = this.IIlllIl(new llIll((Object)StringFactory.IIII("Chests"), true));
        this.IlIl = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Chest color"), lIll));
        this.Illl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Barrels"), true));
        this.IllI = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Barrel color"), lIIl));
        this.lIlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Hoppers"), true));
        this.lll = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Hopper color"), lIII));
        this.Il = this.IIlllIl(new llIll((Object)StringFactory.IIII("Furnaces"), true));
        this.lIl = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Furnace color"), IIl));
        this.I = this.IIlllIl(new llIll((Object)StringFactory.IIII("Shulkers"), true));
        this.llI = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Shulker color"), IlI));
        this.ll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Ender Chests"), true));
        this.III = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Ender chest color"), llII));
        this.IIIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Spawners"), true));
        this.IIlI = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Spawner color"), l));
    }

    @Override
    public void Ill(II iI) {
        this.IlI(iI);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color lI(BlockEntity blockEntity) {
        if (blockEntity instanceof ChestBlockEntity && ((Boolean)this.II.lIl()).booleanValue()) {
            return (Color)this.IlIl.lIl();
        }
        if (blockEntity instanceof BarrelBlockEntity && ((Boolean)this.Illl.lIl()).booleanValue()) {
            return (Color)this.IllI.lIl();
        }
        if (blockEntity instanceof HopperBlockEntity && ((Boolean)this.lIlI.lIl()).booleanValue()) {
            return (Color)this.lll.lIl();
        }
        if (!(blockEntity instanceof FurnaceBlockEntity) || !((Boolean)this.Il.lIl()).booleanValue()) {
            if (blockEntity instanceof ShulkerBoxBlockEntity && ((Boolean)this.I.lIl()).booleanValue()) {
                return (Color)this.llI.lIl();
            }
            if (blockEntity instanceof EnderChestBlockEntity && ((Boolean)this.ll.lIl()).booleanValue()) {
                return (Color)this.III.lIl();
            }
            if (!(blockEntity instanceof MobSpawnerBlockEntity)) return null;
            if ((Boolean)this.IIIl.lIl() == false) return null;
            return (Color)this.IIlI.lIl();
        }
        return (Color)this.lIl.lIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(Object object, Box box, Color color, double d) {
        if (((Boolean)this.IIll.lIl()).booleanValue()) {
            if (this.lII.lIl() == orchard.internal.llI.III) {
                IllIlI.IIIlll(object, box.expand(0.035), lIlIllI.l(color, 0.78), d * 0.78);
            }
            IllIlI.IIIlll(object, box, color, d);
        }
        if ((Boolean)this.IIII.lIl() == false) return;
        if (this.lII.lIl() == orchard.internal.llI.III) {
            IllIlI.IlIl(object, box.expand(0.035), lIlIllI.l(color, 0.72), 165.0, 3.0f);
        }
        IllIlI.IlIl(object, box, color, 255.0, this.lII.lIl() == orchard.internal.llI.III ? 2.4f : 2.0f);
    }

    /*
     * Unable to fully structure code
     */
    public void IlI(Object var1_1) {
        block23: {
            block22: {
                block20: {
                    block24: {
                        block17: {
                            block19: {
                                block18: {
                                    block21: {
                                        block15: {
                                            block16: {
                                                block14: {
                                                    if (!this.IIIlIIl()) break block16;
                                                    break block21;
                                                    while (true) {
                                                        var13_12 = var11_10.getBlockEntities().values().iterator();
                                                        break block14;
                                                        break;
                                                    }
                                                    return;
lbl8:
                                                    // 2 sources

                                                    return;
lbl10:
                                                    // 2 sources

                                                    while (true) {
                                                        if (IllIlI.lIIll(var1_1)) break block15;
                                                        break block16;
                                                        break;
                                                    }
                                                }
lbl14:
                                                // 4 sources

                                                while (true) {
                                                    if (!var13_12.hasNext()) break block17;
                                                    break block18;
                                                    break;
                                                }
                                            }
                                            return;
lbl20:
                                            // 1 sources

                                            while (var2_2.world == null) {
                                                ** GOTO lbl8
                                            }
                                            break block22;
lbl23:
                                            // 2 sources

                                            while (true) {
                                                if (var10_9 > var8_7 + var6_5) break block19;
                                                break block20;
                                                break;
                                            }
lbl26:
                                            // 1 sources

                                            while (true) {
                                                var10_9 = var8_7 - var6_5;
                                                ** GOTO lbl23
                                                break;
                                            }
lbl29:
                                            // 1 sources

                                            while (true) {
                                                if (!((Boolean)this.IIII.lIl()).booleanValue()) ** continue;
                                                ** GOTO lbl10
                                                break;
                                            }
                                        }
                                        var2_2 = MinecraftClient.getInstance();
                                        if (var2_2.player != null) ** break;
                                        ** while (true)
                                        ** GOTO lbl20
lbl37:
                                        // 1 sources

                                        while (true) {
                                            if (IllIlI.lllll(var1_1, var12_11 = new Box((double)(var9_8 << 4), (double)var2_2.world.getBottomY(), (double)(var10_9 << 4), (double)(var9_8 << 4) + 16.0, (double)var2_2.world.getTopYInclusive() + 1.0, (double)(var10_9 << 4) + 16.0))) ** continue;
                                            break block17;
                                            break;
                                        }
                                    }
                                    if (!((Boolean)this.IIll.lIl()).booleanValue()) ** break;
                                    ** while (true)
                                    ** while (true)
                                }
                                var14_13 = (BlockEntity)var13_12.next();
                                var15_14 = var14_13.getPos();
                                var16_15 = new Box((double)var15_14.getX(), (double)var15_14.getY(), (double)var15_14.getZ(), (double)var15_14.getX() + 1.0, (double)var15_14.getY() + 1.0, (double)var15_14.getZ() + 1.0);
                                if (IllIlI.lllll(var1_1, var16_15)) break block23;
                                ** GOTO lbl14
                            }
                            ++var9_8;
                            break block24;
                        }
lbl54:
                        // 2 sources

                        while (true) {
                            ++var10_9;
                            ** continue;
                            break;
                        }
                    }
lbl58:
                    // 2 sources

                    while (true) {
                        if (var9_8 > var7_6 + var6_5) ** continue;
                        ** continue;
                        break;
                    }
                }
                ** while ((var11_10 = var2_2.world.getChunkManager().getWorldChunk((int)var9_8, (int)var10_9)) != null)
lbl63:
                // 1 sources

                ** while (true)
lbl64:
                // 1 sources

                while (true) {
                    var18_17 = this.lIl(var17_16, var15_14);
                    this.IIl(var1_1, var16_15, var18_17, var3_3);
                    ** GOTO lbl14
                    break;
                }
            }
            var3_3 = (Double)this.IlII.lIl() / 100.0 * 255.0;
            var5_4 = (Integer)var2_2.options.getViewDistance().getValue();
            var6_5 = Math.max(1, Math.min(var5_4, 8));
            var7_6 = var2_2.player.getBlockPos().getX() >> 4;
            var8_7 = var2_2.player.getBlockPos().getZ() >> 4;
            var9_8 = var7_6 - var6_5;
            ** while (true)
        }
        ** while ((var17_16 = this.lI((BlockEntity)var14_13)) != null)
lbl78:
        // 1 sources

        ** while (true)
    }

    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
    }

    private static void lII() {
        StorageESP.Ill[0] = StorageESP.I(StorageESP.IIII(43693, -1217391343, (short)56672).toCharArray(), 61674L, 2092652759);
        StorageESP.Ill[1] = StorageESP.I(StorageESP.IIII(43692, 1872652833, (short)31612).toCharArray(), 34604L, -1092320033);
        StorageESP.Ill[2] = StorageESP.I(StorageESP.IIII(43695, -346073116, (short)6709).toCharArray(), 42615L, 1437909505);
        StorageESP.Ill[3] = StorageESP.I(StorageESP.IIII(43694, 182218013, (short)25022).toCharArray(), 35619L, -802803020);
        StorageESP.Ill[4] = StorageESP.I(StorageESP.IIII(43689, 1982295704, (short)4400).toCharArray(), 22128L, 521237073);
        StorageESP.Ill[5] = StorageESP.I(StorageESP.IIII(43688, -1706941600, (short)50622).toCharArray(), 44814L, -1243087686);
        StorageESP.Ill[6] = StorageESP.I(StorageESP.IIII(43691, -569356702, (short)53479).toCharArray(), 81305L, -725466638);
        StorageESP.Ill[7] = StorageESP.I(StorageESP.IIII(43690, -1005317478, (short)40735).toCharArray(), 8968L, 796200009);
        StorageESP.Ill[8] = StorageESP.I(StorageESP.IIII(43685, 730749958, (short)17279).toCharArray(), 66237L, -1965836551);
        StorageESP.Ill[9] = StorageESP.I(StorageESP.IIII(43684, 89415404, (short)11953).toCharArray(), 75342L, 652979378);
        StorageESP.Ill[10] = StorageESP.I(StorageESP.IIII(43687, 1557488486, (short)6972).toCharArray(), 52411L, -579343844);
        StorageESP.Ill[11] = StorageESP.I(StorageESP.IIII(43686, -912836548, (short)64734).toCharArray(), 57916L, -968156822);
        StorageESP.Ill[12] = StorageESP.I(StorageESP.IIII(43681, 440683506, (short)28727).toCharArray(), 68255L, -2134051274);
        StorageESP.Ill[13] = StorageESP.I(StorageESP.IIII(43680, 1337793094, (short)24953).toCharArray(), 7903L, 620766706);
        StorageESP.Ill[14] = StorageESP.I(StorageESP.IIII(43683, -1641582418, (short)44754).toCharArray(), 32250L, -1475940037);
        StorageESP.Ill[15] = StorageESP.I(StorageESP.IIII(43682, -1529121735, (short)20758).toCharArray(), 2457L, -1157809638);
        StorageESP.Ill[16] = StorageESP.I(StorageESP.IIII(43709, -1696917420, (short)40624).toCharArray(), 72511L, -1576063936);
        StorageESP.Ill[17] = StorageESP.I(StorageESP.IIII(43708, -517975766, (short)63923).toCharArray(), 62003L, -1267047875);
        StorageESP.Ill[18] = StorageESP.I(StorageESP.IIII(43711, 2048032503, (short)23265).toCharArray(), 39847L, -1882252882);
        StorageESP.Ill[19] = StorageESP.I(StorageESP.IIII(43710, -1273809620, (short)5320).toCharArray(), 65614L, 1127547856);
        StorageESP.Ill[20] = StorageESP.I(StorageESP.IIII(43705, 391841856, (short)63492).toCharArray(), 84333L, -1715011621);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Color lIl(Color color, BlockPos blockPos) {
        Color color2;
        double d = (double)blockPos.getX() * 0.061 + (double)blockPos.getY() * 0.021 + (double)blockPos.getZ() * 0.043;
        switch (((llI)((Object)this.lII.lIl())).ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 3: {
                color2 = lIlIllI.III(color, lllIIII.II, d);
                return color2;
            }
            case 0: {
                color2 = color;
                return color2;
            }
            case 1: {
                color2 = lIlIllI.III(color, lllIIII.ll, d);
                return color2;
            }
            case 2: 
        }
        color2 = lIlIllI.III(color, lllIIII.III, d);
        return color2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block18: {
                block14: {
                    block13: {
                        block17: {
                            block12: {
                                block15: {
                                    break block15;
lbl1:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl3:
                                    // 1 sources

                                    while (true) {
                                        var9_9 = new String[var8_8.length];
                                        var13_13 = -1;
                                        break block12;
                                        break;
                                    }
                                }
                                var6 = 19894;
                                break block16;
lbl10:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl12:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    StorageESP.lllI = var9_9;
                                    break block13;
                                    break;
                                }
lbl17:
                                // 1 sources

                                while (var13_13 == 0) {
                                    ** continue;
lbl19:
                                    // 1 sources

                                    ** GOTO lbl14
                                }
                                break block17;
                            }
lbl22:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                            var9_9[var10_10] = var7_7.substring(var11_11, var11_11 + var12_12);
                            var11_11 += var12_12;
                            break block18;
lbl27:
                            // 1 sources

                            while (true) {
                                var3_4 += 4;
                                if (++var4_5 < var1_2) ** GOTO lbl1
                                break block14;
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
                                var12_12 = 0;
                                ** GOTO lbl17
                                break;
                            }
                        }
lbl37:
                        // 2 sources

                        while (true) {
                            var12_12 = var8_8[var10_10] ^ var6;
                            ** continue;
                            break;
                        }
                    }
                    StorageESP.llll = new Object[var9_9.length];
                    ** while (true)
                }
                StorageESP.Ill = new String[21];
                StorageESP.lII();
                StorageESP.lIll = new Color(255, 220, 50);
                StorageESP.lIIl = new Color(255, 160, 40);
                StorageESP.lIII = new Color(160, 160, 160);
                StorageESP.IIl = new Color(160, 160, 160);
                StorageESP.IlI = new Color(255, 110, 180);
                StorageESP.llII = new Color(140, 50, 200);
                StorageESP.l = new Color(100, 200, 255);
                return;
            }
            ** while (++var10_10 < var8_8.length)
lbl56:
            // 1 sources

            var13_13 = 0;
            ** while (true)
lbl58:
            // 1 sources

            while (true) {
                continue;
                break;
            }
            var10_10 = 0;
            var11_11 = 0;
            ** while (true)
            var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
            StorageESP.llIl[var4_5] = var5_6 ^= var2_3;
            ** while (true)
            var2_3 = -757437121;
            var0_1 = "\u009f\u001er\u00b1W\u00b8\u00a0\u0010[5(\u0014\u00b27K+\u0019r\u00ea>\u00e4\u00dc\\\u00da\u00d2\u00d6\u00f23\u001a\u00cf\u00b8\u00af\u0002\u00da\n9h\u00a0\u00acDI\u0098Qn\u00b2\u00eb0\u00ab\u00f9A\u001c\u00e3\u0099%\u00e9{\u00c6\u00b2\u00fea\t\u0014\u0010N\u00c8\u001b\u0017\u00f3\u001bLy?\u0007\u00b7D\u00c9Y\u0088\u00abB\u00bb\u00f9\u00bd\u00a2\u001e2\u00d0_}<$\u0086\u00d6\u00a0t\u0082\u00ff\b\u00e9\u00df)\u00d4\u001c \u00a6\u000e\u001e\u00f3\u00c5\u00fe/z\u0004Z\u0092\u0010s\u0099_\u00e0\u009d\u00b7\u00fc\u0083\u0096+\u00cd\u00bf\u00f0\u00aar\u00cdk(\u0083\u00c4$\u00a6YQ\u008fm\\\u0081\u001b\u00ce\u0084\u0082>\u00b8)\u00e1\u00b3u5\u00b6$0\u0096\u00b7\u0093H\u00c3\u008b+\u00b7\u00edpT}u\u00ab\u00faj\u00bf8g\u00f4\u00a37\u00d9\u00af\u00ed\u0091\u009e\u00a8c\u00fb!-*\u00d6N\u00ac\u00ea\u0085V\u00bepJ[Tf\u0085\tj\u00b2\u00fcx\u009e\u00d2\u00bcr!\u0013}\u0092\u00f7\u007fB\u0002W\u00c1\u00f4\u0005!\u00feA\u00f6a\u00b7\u00ad\u0085\u00dd\u00c8+N\u00e0\u00daka\u009c\u0091\u00a9\u001a2\u00b8\u009c\u0005\u00be\u007f\u00d2\u008fR\u00ba\u00f2\u00d5\u00a7<\u00f4\u001fZ\u00bf\u0094F\u00b0\u008e\u00c0\u00c9\u00ca\u00ac\u0097\u00a7\u00904{\u00c6+CK\u008f\u0005\u00b7I\u0002\u00aa[\u00e9\u0080\u008a\u00b5!\u00abub\u00f1\u00bcg\u00f7\u0087JR+\u0084".getBytes("ISO-8859-1");
            ** while (true)
            var1_2 = var0_1.length / 4;
            StorageESP.llIl = new int[var1_2];
            ** while (true)
        }
        var7_7 = "\u2d1a\uc256\u361e\u4ebf\uf81b\uf8bb\u35ba\ua917\u8adf\u7b7a\u8931\ua6a1\u6d96\u61de\u5f25\uc882\uff39\u3d57\udbac\u8095\u2722\ubf9a\u16ef\u0446\u5520\u6420\u3d61\u79db\u3642\u8bbe\u7ef4\u8035\u9f33\u6701\ue657\ua2bf\uac65\u3d91\ub230\ub6d5\u2572\u87f7\ufa48\u874a\u27c8\u7f90\ub2fe\u367b\ueb0a\u5a32\u63ec\ud109\ucdfd\uec27\ufad2\ue0c7\u9dc5\uae8f\u9d5d\udbf9\uf541\ue996\ue58e\ua9ba\u0142\ud647\u269c\ua1c0\u88eb\uca4d\ue4a5\u8f74\u8644\u834e\u1b86\u525e\ubb32\u3d6e\ua2c5\u3a0c\u3fc4\u1fce\u53bf\ufbcf\uc09a\uac5c\u781f\u35e0\ud001\ue340\u75a4\u145b\ub9ff\u7c84\u7b01\u1c7e\ub3df\ue39d\u29cf\ua53f\u7ca4\u4777\ud521\ua2d4\u34de\u65ad\u0635\u4df0\u3433\u21cd\u36d1\u0240\ub34a\ueba9\u1c76\u9637\u20d8\u010b\u41ac\u9ab6\uf6cf\uf600\u76d8\u3984\u7263\u08ff\uf51e\u0f8d\u41c9\uf6c6\u1e62\u0c82\u9447\u4139\u093c\uce89\u7382\uaa61\u95cd\ua5be\u5db9\ue7a4\uc003\uc821\ue82b\u9f9b\u815d\u10c8\uff53\ubf7c\u724e\u2e4e\ud348\uc9e2\u28a0\ud73c\uf810\udfbd\u2a4e\uebe2\u9512\uffbc\u922a\u22fa\u2293\ub10c\u9771\u5ce3\ua328\ue952\u5dad\udb3c\u99c1\u5402\ucd81\ud663\u1624\ufc42\u9671\u4f2c\u3197\ubc8b\uc262\ubb6f\uc664\uffbb\ue77c\u8024\u1e0a\uf149\u3432\u6021\u02c4\uf7a4\u842f\u7ec2\ubf27\u6349\u2cf2\u9ed7\u819e\ue649\u42a8\u156e\u4282\u702d\ufbd0\u1533\ue5d5\ub2ea\u4e07\u20d4\ub029\ue196\ufa38\u286e\u0ba8\u0b30\uba54\u6439\u6b0c\u0149\u6197\u363c\u4d33\u3e16\uc552\uf483\u28be\u54c8\ucd7b\ua282\u0bd9\u5739\ue60a\uba6b\u35c7\u5ca9\u4386\ub62a\uda8e\u2c91\u192c\u2db5\u3b74\u85bf\u97ef\u3f49\ude26\ufcaf\u8be2\uaf26\u4f75\u66b0\u1070\u8d22\ufe37\ufcba\u0a36\ufdad\ud3fb\u3f94\u15aa\u82ae\uc648\u7061\u04f5\uee60\ue777\u2096\u733e\udf15\ue205\u6b99\ufa46\u3872\u7f9f\uce0f\uf52c\ufbae\u6922\u778b\uca17\u305b\u6e32\u7605\u2ac3\u3ff9\u69a9\u5904\u6870\u9aec\u7843\ua10d\uc31b\u7352\ua6c0\uf1d5\u7cf5\ue3f3\u7ba9\u6389\u3916\u2c40\u2f4e\u79e5\uf0fb\ub9e1\u6dcb\u739e\u087c\u58e3\uc580\ufcc4\ubca8\u9755\uddd6\u749b\u499b\u7203\u3965\u4b6f\u6b80\u6844\ud552\u38f3\u8a81\u6b44\u2e15\u884c\u96aa\u60e1\ub5df\ud399\uc7e3\u2642\ueb43\u0c63\u75df\u07c7\u66e4\u4751\u0c87\ubf6a\ubd4f\u95f4\u5afb\u7648";
        var8_8 = "\u4dbe\u4dba\u4da2\u4da2\u4da2\u4da6\u4da6\u4dba\u4dbe\u4dbe\u4dba\u4dba\u4dbe\u4dba\u4dba\u4df2\u4da6\u4dba\u4da6\u4da6\u4dae".toCharArray();
        ** while (true)
        var3_4 = 0;
        var4_5 = 0;
        ** while (true)
    }

    private static int lll(int n, int n2) {
        return llIl[n ^ 0xCD2157F] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIII(int n, int n2, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xAAAD;
        char[] cArray = lllI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            StorageESP.llll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4813;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 17889;
            n7 ^= 0x4925;
            n7 += 21498;
            n7 -= 7351;
            n7 += 22039;
            n7 -= 54436;
            n7 -= 6884;
            n7 -= 5194;
            cArray[n6] = (char)((n7 += 44615) ^ n4 ^ s ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

