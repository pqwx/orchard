/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllll
 * Module         : StashFinder  [RENDER]
 * Description    : Logs nearby clusters of storage containers.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Min Containers
 *   - Found Stashes
 *   -  containers
 *   - Stash Found
 *   - shulker_box
 *   - .getBytes(
 *   - barrel
 *   - chest
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
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.sound.PositionedSoundInstance
 *  net.minecraft.client.sound.SoundInstance
 *  net.minecraft.registry.Registries
 *  net.minecraft.sound.SoundEvent
 *  net.minecraft.sound.SoundEvents
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.World
 *  net.minecraft.world.chunk.ChunkStatus
 */
package orchard.module.render;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.sound.PositionedSoundInstance;
import net.minecraft.client.sound.SoundInstance;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.World;
import net.minecraft.world.chunk.ChunkStatus;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIlllIIIl;
import orchard.internal.IlIIlllll;
import orchard.internal.Illllll;
import orchard.internal.lIlIIlI;

@Environment(value=EnvType.CLIENT)
public final class StashFinder
extends ModuleBase {
    private static final int I = 36;
    private static final int l = 4;
    private final Illllll II;
    private static final int Il = 64;
    private static final int lI = 64;
    private static final int ll = 2048;
    private static final int III = 40;
    private final lIlIIlI IIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Min Containers"), 5.0, 2.0, 32.0, 1.0));
    private static String[] IlI;
    private int Ill;
    private final Set<String> lII;
    private static final int[] lIl;
    private static final String[] llI;
    private static final Object[] lll;

    /*
     * Enabled aggressive block sorting
     */
    private void I() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.getSoundManager() == null) {
            return;
        }
        minecraftClient.getSoundManager().play((SoundInstance)PositionedSoundInstance.ui((SoundEvent)((SoundEvent)SoundEvents.BLOCK_NOTE_BLOCK_BELL.value()), (float)1.25f, (float)0.9f));
    }

    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0x39420735 ^ n;
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

    private BlockPos II(List<BlockPos> list) {
        long l2 = 0L;
        long l3 = 0L;
        long l4 = 0L;
        Iterator<BlockPos> iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                int n = Math.max(1, list.size());
                return new BlockPos(Math.round((float)l2 / (float)n), Math.round((float)l3 / (float)n), Math.round((float)l4 / (float)n));
            }
            BlockPos blockPos = iterator.next();
            l2 += (long)blockPos.getX();
            l3 += (long)blockPos.getY();
            l4 += (long)blockPos.getZ();
        }
    }

    public StashFinder() {
        super(StringFactory.IIII("StashFinder"), Category.l, StringFactory.IIII("Logs nearby clusters of storage containers."));
        this.II = this.IIlllIl(new Illllll((Object)StringFactory.IIII("Found Stashes"), (Collection<?>)List.of()));
        this.lII = new HashSet<String>();
    }

    /*
     * Unable to fully structure code
     */
    private List<BlockPos> lI(BlockPos var1_1, Set<BlockPos> var2_2) {
        block9: {
            block5: {
                block7: {
                    block6: {
                        block8: {
                            var3_3 = new ArrayList<BlockPos>();
                            var4_4 = new ArrayDeque<BlockPos>();
                            var2_2.remove(var1_1);
                            var4_4.add(var1_1);
                            break block8;
lbl8:
                            // 1 sources

                            while (true) {
                                var8_8 = (BlockPos)var7_7.next();
                                var2_2.remove(var8_8);
                                var4_4.add(var8_8);
                                break block5;
                                break;
                            }
lbl15:
                            // 1 sources

                            while (true) {
                                var8_8 = var7_7.next();
                                if (!(var5_5.getSquaredDistance((Vec3i)var8_8) <= 36.0)) break block6;
                                break block7;
                                break;
                            }
                        }
lbl20:
                        // 2 sources

                        while (var4_4.isEmpty()) {
                            return var3_3;
                        }
                        break block9;
                        while (true) {
                            var7_7 = var6_6.iterator();
                            break block5;
                            break;
                        }
                    }
lbl27:
                    // 3 sources

                    while (true) {
                        if (!var7_7.hasNext()) ** continue;
                        ** continue;
                        break;
                    }
                }
                var6_6.add(var8_8);
                ** GOTO lbl27
            }
            if (!var7_7.hasNext()) ** GOTO lbl20
            ** while (true)
        }
        var5_5 = (BlockPos)var4_4.remove();
        var3_3.add(var5_5);
        var6_6 = new ArrayList<BlockPos>();
        var7_7 = var2_2.iterator();
        ** while (true)
    }

    @Override
    public void llll() {
        this.Ill = 0;
    }

    @Override
    public void ll() {
        this.Ill = 0;
        this.lII.clear();
        Iterator iterator = ((List)this.II.lIl()).iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            String string2 = this.lIl(string);
            if (string2.isEmpty()) continue;
            this.lII.add(string2);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        if (++this.Ill < 40) {
            return;
        }
        this.Ill = 0;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.world == null) {
            return;
        }
        List<BlockPos> list = this.lll(minecraftClient, (World)minecraftClient.world, minecraftClient.player.getBlockPos());
        if (list.isEmpty()) {
            return;
        }
        this.lII(list);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIl(BlockState blockState) {
        if (blockState == null) return false;
        if (blockState.isAir()) return false;
        Block block = blockState.getBlock();
        String string = Registries.BLOCK.getId((Object)block).getPath().toLowerCase(Locale.ROOT);
        if (string.endsWith("chest")) return true;
        if (string.endsWith("barrel")) return true;
        if (string.endsWith("shulker_box")) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI(List<BlockPos> list) {
        BlockPos blockPos = this.II(list);
        int n = blockPos.getZ();
        String string = ",";
        int n2 = blockPos.getY();
        String string2 = ",";
        int n3 = blockPos.getX();
        String string3 = n3 + string2 + n2 + string + n;
        if (!this.lII.add(string3)) {
            return;
        }
        String string4 = " containers";
        int n4 = list.size();
        String string5 = " - ";
        int n5 = blockPos.getZ();
        String string6 = " ";
        int n6 = blockPos.getY();
        String string7 = " ";
        int n7 = blockPos.getX();
        String string8 = n7 + string7 + n6 + string6 + n5 + string5 + n4 + string4;
        ArrayList<String> arrayList = new ArrayList<String>((Collection)this.II.lIl());
        arrayList.add(0, string8);
        while (true) {
            if (arrayList.size() <= 64) {
                this.II.IlII(arrayList);
                String string9 = " containers";
                int n8 = list.size();
                IIlllIIIl.ll().Il(IlIIlllll.III, "Stash Found", n8 + string9, 4500L);
                this.I();
                return;
            }
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /*
     * Unable to fully structure code
     */
    private void lII(List<BlockPos> var1_1) {
        var2_2 = new HashSet<BlockPos>(var1_1);
        var3_3 = Math.max(1, (int)Math.round((Double)this.IIl.lIl()));
        if (true) ** GOTO lbl6
        block0: while (true) {
            this.IlI(var5_5);
lbl6:
            // 2 sources

            while (true) {
                if (var2_2.isEmpty()) {
                    return;
                }
                var4_4 = (BlockPos)var2_2.iterator().next();
                var5_5 = this.lI(var4_4, var2_2);
                if (var5_5.size() >= var3_3) continue block0;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private String lIl(String string) {
        if (string == null) {
            return "";
        }
        String[] stringArray = string.trim().split("\\s+");
        if (stringArray.length >= 3) {
            String string2 = stringArray[2];
            String string3 = ",";
            String string4 = stringArray[1];
            String string5 = ",";
            String string6 = stringArray[0];
            return string6 + string5 + string4 + string3 + string2;
        }
        return "";
    }

    private static void llI() {
        StashFinder.IlI[0] = StashFinder.l("".toCharArray(), 13163L, 599331921);
        StashFinder.IlI[1] = StashFinder.l(StashFinder.IIlI(2004997660, 1982268308).toCharArray(), 4474L, -881363458);
        StashFinder.IlI[2] = StashFinder.l(StashFinder.IIlI(2004997661, 465766357).toCharArray(), 11080L, -192739882);
        StashFinder.IlI[3] = StashFinder.l(StashFinder.IIlI(2004997662, -1162988165).toCharArray(), 17668L, 818557694);
        StashFinder.IlI[4] = StashFinder.l(StashFinder.IIlI(2004997663, 1782521260).toCharArray(), 18656L, -785665367);
        StashFinder.IlI[5] = StashFinder.l(StashFinder.IIlI(2004997656, 374877731).toCharArray(), 20649L, -553084875);
        StashFinder.IlI[6] = StashFinder.l(StashFinder.IIlI(2004997657, 1520512175).toCharArray(), 70382L, 866312580);
        StashFinder.IlI[7] = StashFinder.l(StashFinder.IIlI(2004997658, -464301927).toCharArray(), 14957L, -974096914);
        StashFinder.IlI[8] = StashFinder.l(StashFinder.IIlI(2004997659, 528104810).toCharArray(), 93133L, -1517611010);
        StashFinder.IlI[9] = StashFinder.l(StashFinder.IIlI(2004997652, 859715683).toCharArray(), 3173L, 1906640248);
        StashFinder.IlI[10] = StashFinder.l(StashFinder.IIlI(2004997653, 1094202092).toCharArray(), 47933L, -20734421);
        StashFinder.IlI[11] = StashFinder.l(StashFinder.IIlI(2004997654, -1394463943).toCharArray(), 60517L, 250757812);
        StashFinder.IlI[12] = StashFinder.l(StashFinder.IIlI(2004997655, -1576917145).toCharArray(), 14718L, 1441747523);
        StashFinder.IlI[13] = StashFinder.l(StashFinder.IIlI(2004997648, -1225165331).toCharArray(), 11127L, -1972388041);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 2030;
        String string = "\u7a3c\ub5d7\u4a13\ue0de\u03ad\ue7e7\u0591\uffed\u7415\u4636\u57e3\u9a44\u2e7c\u0fc9\u96ad\u3115\u555e\ub95c\ub248\u3ee8\u30bd\u716f\uc004\ubdb3\uf2fa\u8050\u7d18\u123a\uad79\u3eba\u8d61\uc075\ueb06\u61c1\u22f3\ub0e3\uf5b0\u9e07\u8f61\ud985\u44a9\uc8d6\u298c\uf143\u381a\u75d6\ue05b\u3290\uec4b\u3255\ufafb\u4a1b\uadee\u76a7\u77ed\uff7c\uee95\uf661\uc51e\u6a36\ude4f\u9365\u2838\ua104\u9198\uce18\uefed\u0b3c\u9441\u0e30\u6785\u5e54\u8372\u7cc1\ue5d3\u4137\u6ebe\uaec5\u1034\uc52f\udd87\u92a7\u06b8\u853a\ud581\u1c32\uf63a\u7c16\u079e\u2bbd\uc114\ub786\u1df5\u1a54\u4aa6\uad0b\uc8e7\u22e7\u3f43\u2baf\u452d\u3c1f\ua4a1\ua040\u4762\ub620\u693e\u3a4c\u706e\u0830\u6038\u0edf\u6b7e\ua952\u64c8\uf5df\ub8d8\u0e8b\ub4be\u2093\u1e10\ud69c\u88a1\uadb5\u2a47\ue1f7\u4a9a\u55c8\u8f0a\uccd3\u422f\u6b81\udc73\u5e53\uf481\u371d\u76a2\u4630\u734d\u1015\ubc21\u67ba\u05bf\u098d\u2106\uddab\u01db\u8a62\u6a30\u965f\udaca\u3e93\u0764\ua50d\uc3f4\u88df\u6dad\u8a1a\udccf\u6135\uf970\u07fd\u68eb\u5fbd\u3849\u9d56\ua8d5\ua037\ue6e3\ubd14\ud60c\u0874\u9fda\ubeee\uc214\u4c92\u16b4\u74f4\uc2fa\u2362\uc89e\u4db3\u3702\u8dc0\ua701\u02eb\ub24a\ub312\u1a42\u04fa\u302b\uee85\ua5d6\u3243\uedcf\u199e";
        char[] cArray = "\u07ea\u07ea\u07e6\u07e6\u07fe\u07fe\u07ea\u07fe\u07ea\u07fa\u07fe\u07fa\u07d2".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                llI = stringArray;
                lll = new Object[stringArray.length];
                int n6 = -725236005;
                byte[] byArray = "\t\u00d9\u00b0\u00f6fh\r\u000e\u00d4.\u00ca\u00b1\u00fd\u0090\u007f\u00e3\u007f\u0000\u00b0C\u00c07\u00e9\u00c7\u00a4Yf\u0016\n\u00e4\u00c8\u00e4$\u00ad\u0001+v\\:^f\u0003\u00b6$u=\u0099X\u00c6\u00a3\n\u00ef)W\u00a5\u0085\u00b3\u0098\u000e7\u0018\\\u0089\u00bd\u00be\u0093.\u00ac\u0088[\u00a6M2\u00d6\"\u00e0\u00fcM\u00a9\u00d5\u00ed\u00a93\u00cdR,N\u00ec\u0096\u00ce\u00a7\u009c\u00f9\u00f3\u00a6\u009bJ\u00b7\u00b0xQ\u00b2\u00a2\\2\u0015\u00bb\u00a5p\u0012\u00c8\u0092\u00d8\u00b2\u00e9\u008a\u00c3T)\u00e9\u00a4o\u00bf\u00f2\u00b3D`\u0094\u008e]\u00c3{:\u00c93\u008b\u00faoV\u00daH\u00ac\u00fe\u009d\u00fbZ\u00ca1\u0084s\u00faTU\u00e8_\u00ea%\u008f~h\u00f9\u00eb\u00100\u00922E\u001b&\u00fey\u00a4PWG\u0011".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                lIl = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    StashFinder.lIl[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                IlI = new String[14];
                StashFinder.llI();
                return;
            }
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
    }

    /*
     * Unable to fully structure code
     */
    private List<BlockPos> lll(MinecraftClient var1_1, World var2_2, BlockPos var3_3) {
        block15: {
            block14: {
                block16: {
                    block13: {
                        block11: {
                            block12: {
                                block10: {
                                    var4_4 = new ArrayList<BlockPos>();
                                    var5_5 = var3_3.getX() >> 4;
                                    var6_6 = var3_3.getZ() >> 4;
                                    var7_7 = Math.max(var2_2.getBottomY(), var3_3.getY() - 64);
                                    var8_8 = Math.min(var2_2.getTopYInclusive(), var3_3.getY() + 64);
                                    var9_9 = new BlockPos.Mutable();
                                    var10_10 = -4;
                                    ** GOTO lbl33
                                    while (true) {
                                        var12_12 = var5_5 + var10_10;
                                        var13_13 = var6_6 + var11_11;
                                        var14_14 = var2_2.getChunk(var12_12, var13_13, ChunkStatus.FULL, false);
                                        if (var14_14 != null) break block10;
                                        break block11;
                                        break;
                                    }
lbl15:
                                    // 1 sources

                                    while (true) {
                                        ++var17_17;
                                        break block12;
                                        break;
                                    }
lbl18:
                                    // 1 sources

                                    while (true) {
                                        var20_20 = var16_16 + var19_19;
                                        var21_21 = var7_7;
                                        break block13;
                                        break;
                                    }
                                }
                                var15_15 = var12_12 << 4;
                                var16_16 = var13_13 << 4;
                                var17_17 = 0;
                            }
                            if (var17_17 < 16) break block16;
                        }
                        ++var11_11;
                        while (true) {
                            if (var11_11 <= 4) ** continue;
                            ++var10_10;
lbl33:
                            // 2 sources

                            if (var10_10 > 4) break;
                            var11_11 = -4;
                        }
lbl36:
                        // 2 sources

                        return var4_4;
                        while (true) {
                            ++var19_19;
                            break block14;
                            break;
                        }
                    }
lbl43:
                    // 2 sources

                    while (true) {
                        if (var21_21 > var8_8) ** continue;
                        var9_9.set(var18_18, var21_21, var20_20);
                        if (this.IIl(var14_14.getBlockState((BlockPos)var9_9))) {
                            var4_4.add(var9_9.toImmutable());
                            if (var4_4.size() >= 2048) {
                                ** continue;
                            }
                        }
                        break block15;
                        break;
                    }
                }
                var18_18 = var15_15 + var17_17;
                var19_19 = 0;
            }
            ** while (var19_19 >= 16)
lbl58:
            // 1 sources

            ** while (true)
        }
        ++var21_21;
        ** while (true)
    }

    private static int IIII(int n, int n2) {
        return lIl[n ^ 0x9F1A121B] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    private static String IIlI(int var0, int var1_1) {
        block46: {
            block45: {
                break block46;
lbl1:
                // 1 sources

                while (true) {
                    var9_9 = 245;
                    ** GOTO lbl103
                    break;
                }
lbl4:
                // 1 sources

                while (true) {
                    var9_9 = 166;
                    ** GOTO lbl103
                    break;
                }
lbl7:
                // 1 sources

                while (true) {
                    var9_9 = 194;
                    ** GOTO lbl103
                    break;
                }
lbl10:
                // 1 sources

                while (true) {
                    var9_9 = 65;
                    ** GOTO lbl103
                    break;
                }
lbl13:
                // 1 sources

                block37: while (true) {
                    block0 : switch (var8_8 & 31) {
                        case 16: {
                            ** continue;
                        }
                        case 11: {
                            ** continue;
                        }
                        case 29: {
                            ** continue;
                        }
                        case 6: {
                            ** continue;
                        }
                        case 30: {
                            var9_9 = 61;
                            ** GOTO lbl103
                        }
                        case 9: {
                            var9_9 = 125;
                            ** GOTO lbl103
                        }
                        case 4: {
                            var9_9 = 56;
                            ** GOTO lbl103
                        }
                        case 17: {
                            var9_9 = 213;
                            ** GOTO lbl103
                        }
                        case 31: {
                            var9_9 = 102;
                            ** GOTO lbl103
                        }
                        case 20: {
                            var9_9 = 188;
                            ** GOTO lbl103
                        }
                        case 19: {
                            var9_9 = 9;
                            ** GOTO lbl103
                        }
                        case 27: {
                            var9_9 = 85;
                            ** GOTO lbl103
                        }
                        case 12: {
                            var9_9 = 144;
                            ** GOTO lbl103
                        }
lbl50:
                        // 1 sources

                        while (var2_3 != null) {
                            ** GOTO lbl92
                        }
                        break;
                        default: {
                            var9_9 = 126;
                            ** GOTO lbl103
                        }
                        case 8: {
                            var9_9 = 49;
                            ** GOTO lbl103
                        }
                        case 23: {
                            var9_9 = 221;
                            ** GOTO lbl103
                        }
                        case 14: {
                            var9_9 = 129;
                            ** GOTO lbl103
                        }
lbl65:
                        // 2 sources

                        while (true) {
                            var6_6 = var5_5[1];
                            break block45;
                            break;
                        }
                        case 25: {
                            var9_9 = 224;
                            ** GOTO lbl103
                        }
                        case 10: {
                            var9_9 = 43;
                            ** GOTO lbl103
                        }
lbl74:
                        // 1 sources

                        while (true) {
                            StashFinder.lll[var3_2] = var5_5;
                            ** GOTO lbl65
                            break;
                        }
lbl77:
                        // 1 sources

                        while (true) {
                            if (++var8_8 < var4_4.length) continue block37;
                            ** GOTO lbl97
                            break;
                        }
                        case 21: {
                            var9_9 = 145;
                            ** GOTO lbl103
                        }
                        case 26: {
                            var9_9 = 68;
                            ** GOTO lbl103
                        }
                        case 18: {
                            var9_9 = 8;
                            ** GOTO lbl103
                        }
                        case 1: {
                            var9_9 = 184;
                            ** GOTO lbl103
                        }
lbl92:
                        // 1 sources

                        var5_5 = var2_3;
                        ** continue;
                        case 24: {
                            var9_9 = 83;
                            ** GOTO lbl103
                        }
lbl97:
                        // 1 sources

                        return new String(var4_4).intern();
                        case 3: {
                            var9_9 = 195;
                            ** GOTO lbl103
                        }
                        case 15: {
                            var9_9 = 123;
lbl103:
                            // 32 sources

                            while (true) {
                                var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
                                break block0;
                                break;
                            }
                        }
                    }
                    break;
                }
lbl106:
                // 1 sources

                while (true) {
                    var2_3 = (StackTraceElement[])StashFinder.lll[var3_2];
                    ** GOTO lbl50
                    break;
                }
                {
                    case 13: {
                        var9_9 = 48;
                        ** GOTO lbl103
                    }
                }
lbl112:
                // 1 sources

                while (true) {
                    var8_8 = 0;
                    ** continue;
                    break;
                }
            }
            var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -1721191432;
            ** while (true)
            {
                case 28: {
                    var9_9 = 207;
                    ** GOTO lbl103
                }
            }
            var5_5 = new Throwable().getStackTrace();
            ** while (true)
        }
        var3_2 = var0 ^ 2004997660;
        var4_4 = StashFinder.llI[var3_2].toCharArray();
        ** while (true)
        {
            case 2: {
                var9_9 = 215;
                ** GOTO lbl103
            }
            case 22: {
                var9_9 = 196;
                ** GOTO lbl103
            }
            case 7: {
                var9_9 = 189;
                ** GOTO lbl103
            }
        }
        ** while (true)
        {
            ** case 5:
        }
lbl138:
        // 1 sources

        var9_9 = 225;
        ** while (true)
    }
}

