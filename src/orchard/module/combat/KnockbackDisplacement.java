/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIIIlI
 * Module         : Knockback Displacement  [COMBAT]
 * Description    : Silently displaces knockback direction on hit.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Direction Mode
 *   - Detect Cobweb
 *   - Custom Pitch
 *   - Hazard Range
 *   - Minimum Drop
 *   - Hazard Only
 *   - Detect Void
 *   - Detect Lava
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.Blocks
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.BlockPos$Mutable
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.World
 */
package orchard.module.combat;

import java.util.LinkedHashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIlIllllI;
import orchard.internal.IIllIllII;
import orchard.internal.IlIlllI;
import orchard.internal.IllllIII;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class KnockbackDisplacement
extends ModuleBase {
    private final llIll I;
    private final IIIIIIIIl<IIlIllllI> l = this.IIlllIl(new IIIIIIIIl<IIlIllllI>(StringFactory.IIII("Direction Mode"), IIlIllllI.class, IIlIllllI.l));
    private boolean II;
    private static String[] Il;
    private static final double lI = 0.5;
    private int ll;
    private final llIll III;
    private static final int IIl = 4;
    private final llIll IlI;
    private int Ill;
    private final lIlIIlI lII;
    private final lIlIIlI lIl;
    private static final int llI = 12;
    private int lll = -1;
    private final lIlIIlI IIII;
    private final llIll IIIl;
    private final lIlIIlI IIlI;
    private final lIlIIlI IIll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Custom Yaw"), 0.0, -180.0, 180.0, 1.0));
    private static final int[] IlII;
    private static final String[] IlIl;
    private static final Object[] IllI;

    @Override
    public void llll() {
        this.Ill = 0;
        this.lIIl();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private IllllIII lI(MinecraftClient minecraftClient, Entity entity, double d, double d2) {
        int n = Math.max(1, (int)Math.floor((Double)this.IIlI.lIl() / 0.5));
        int n2 = 0;
        double d3 = Double.POSITIVE_INFINITY;
        int n3 = 1;
        boolean bl = true;
        while (true) {
            double d4;
            double d5;
            double d6;
            block6: {
                block5: {
                    if (!bl || (bl = false) || !true) {
                        ++n3;
                    }
                    if (n3 > n) break block5;
                    d6 = (double)n3 * 0.5;
                    double d7 = d * d6;
                    double d8 = d2 * d6;
                    d5 = entity.getX() + d7;
                    d4 = entity.getZ() + d8;
                    Box box = entity.getBoundingBox().offset(d7, 0.0, d8);
                    if (minecraftClient.world.isSpaceEmpty(entity, box)) break block6;
                }
                if (n2 == 0) return null;
                IllllIII illllIII = new IllllIII(n2, d3);
                return illllIII;
            }
            if (!this.lIl(minecraftClient, d5, entity.getY(), d4)) continue;
            ++n2;
            d3 = Math.min(d3, d6);
        }
    }

    /*
     * Unable to fully structure code
     */
    private IIllIllII IIl(MinecraftClient var1_1, Entity var2_2, Float var3_3) {
        block10: {
            var4_4 = var2_2.getX() - var1_1.player.getX();
            var6_5 = var2_2.getZ() - var1_1.player.getZ();
            var8_6 = (float)(Math.toDegrees(Math.atan2(var6_5, var4_4)) - 90.0);
            block0 : switch (((IIlIllllI)this.l.lIl()).ordinal()) {
                case 5: {
                    var9_7 = var1_1.player.getYaw() + ((Double)this.IIll.lIl()).floatValue();
                    var10_8 = var1_1.player.getPitch() + ((Double)this.lIl.lIl()).floatValue();
                    ** GOTO lbl12
                }
                case 3: {
                    var9_7 = var8_6;
                    var10_8 = var1_1.player.getPitch();
lbl12:
                    // 6 sources

                    while (true) {
                        if (var3_3 == null) break block0;
                        break block10;
                        break;
                    }
                }
                case 2: {
                    var9_7 = var8_6;
                    var10_8 = -70.0f;
                    ** GOTO lbl12
                }
                case 4: {
                    var9_7 = var8_6 + 180.0f;
                    var10_8 = var1_1.player.getPitch();
                    ** GOTO lbl12
                }
            }
lbl23:
            // 2 sources

            while (true) {
                var11_9 = this.lIlI(var1_1);
                var9_7 = (float)Math.round(var9_7 / var11_9) * var11_9;
                var10_8 = (float)Math.round(var10_8 / var11_9) * var11_9;
                return new IIllIllII(MathHelper.wrapDegrees((float)var9_7), MathHelper.clamp((float)var10_8, (float)-90.0f, (float)90.0f));
            }
        }
        var9_7 = var3_3.floatValue();
        var10_8 = var1_1.player.getPitch();
        ** while (true)
        {
            case 1: {
                var9_7 = var8_6 + 90.0f;
                var10_8 = var1_1.player.getPitch();
                ** GOTO lbl12
            }
            case 0: {
                var9_7 = var8_6 - 90.0f;
                var10_8 = var1_1.player.getPitch();
                ** continue;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        if (this.Ill > 0) {
            --this.Ill;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.II) return;
        if (minecraftClient.player != null) {
            if (minecraftClient.player.age <= this.ll) return;
        }
        this.lIIl();
    }

    public KnockbackDisplacement() {
        super(StringFactory.IIII("Knockback Displacement"), Category.II, StringFactory.IIII("Silently displaces knockback direction on hit."));
        this.lIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Custom Pitch"), 0.0, -90.0, 90.0, 1.0));
        this.IIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Cooldown"), 15.0, 0.0, 40.0, 1.0).IIIl("t"));
        this.III = this.IIlllIl(new llIll((Object)StringFactory.IIII("Hazard Only"), false));
        this.IIlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Hazard Range"), 5.0, 1.0, 8.0, 0.25));
        this.lII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Minimum Drop"), 4.0, 2.0, 12.0, 1.0));
        this.IlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Detect Void"), true));
        this.IIIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Detect Lava"), true));
        this.I = this.IIlllIl(new llIll((Object)StringFactory.IIII("Detect Cobweb"), true));
        this.ll = Integer.MIN_VALUE;
        this.IIll.lIII(() -> this.l.lIl() == IIlIllllI.Il);
        this.lIl.lIII(() -> {
            if (this.l.lIl() != IIlIllllI.Il) return false;
            return true;
        });
        this.IIlI.lIII(this.III::lIl);
        this.lII.lIII(this.III::lIl);
        this.IlI.lIII(this.III::lIl);
        this.IIIl.lIII(this.III::lIl);
        this.I.lIII(this.III::lIl);
    }

    private static void lII() {
        KnockbackDisplacement.Il[0] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627064, -1930682891).toCharArray(), 31803L, 458501685);
        KnockbackDisplacement.Il[1] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627065, 1679632957).toCharArray(), 32257L, 127023446);
        KnockbackDisplacement.Il[2] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627066, 1736905150).toCharArray(), 67231L, -1943933956);
        KnockbackDisplacement.Il[3] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627067, 1854498842).toCharArray(), 52432L, 2039437523);
        KnockbackDisplacement.Il[4] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627068, 1824130522).toCharArray(), 62937L, 262663451);
        KnockbackDisplacement.Il[5] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627069, -318614559).toCharArray(), 44534L, 1663610672);
        KnockbackDisplacement.Il[6] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627070, -159249186).toCharArray(), 73762L, -541569062);
        KnockbackDisplacement.Il[7] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627071, -2103165057).toCharArray(), 29020L, 995757177);
        KnockbackDisplacement.Il[8] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627056, -5881526).toCharArray(), 69427L, -194637086);
        KnockbackDisplacement.Il[9] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627057, -646489666).toCharArray(), 81534L, -1275721235);
        KnockbackDisplacement.Il[10] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627058, 512953952).toCharArray(), 86253L, 689919795);
        KnockbackDisplacement.Il[11] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627059, 1209151955).toCharArray(), 19385L, 1660532711);
        KnockbackDisplacement.Il[12] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627060, 688090568).toCharArray(), 79448L, 682755809);
        KnockbackDisplacement.Il[13] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627061, -1676313781).toCharArray(), 88356L, -355286737);
        KnockbackDisplacement.Il[14] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627062, -1848895270).toCharArray(), 92041L, 1018888188);
        KnockbackDisplacement.Il[15] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627063, 1543384746).toCharArray(), 996L, -956624733);
        KnockbackDisplacement.Il[16] = KnockbackDisplacement.Illl(KnockbackDisplacement.lllI(1607627048, 780274129).toCharArray(), 91260L, -853887739);
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean lIl(MinecraftClient minecraftClient, double d, double d2, double d3) {
        if (((Boolean)this.IlI.lIl()).booleanValue()) {
            if (this.lll((World)minecraftClient.world, d, d2, d3)) return true;
        }
        int n = MathHelper.floor((double)d);
        int n2 = MathHelper.floor((double)d3);
        int n3 = MathHelper.floor((double)(d2 + 1.0));
        int n4 = Math.max(minecraftClient.world.getBottomY(), MathHelper.floor((double)d2) - 1);
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        int n5 = n3;
        while (n5 >= n4) {
            mutable.set(n, n5, n2);
            BlockState blockState = minecraftClient.world.getBlockState((BlockPos)mutable);
            if (((Boolean)this.IIIl.lIl()).booleanValue()) {
                if (blockState.isOf(Blocks.LAVA)) return true;
            }
            if (((Boolean)this.I.lIl()).booleanValue() && blockState.isOf(Blocks.COBWEB)) {
                return true;
            }
            if (!blockState.getCollisionShape((BlockView)minecraftClient.world, (BlockPos)mutable).isEmpty()) {
                return false;
            }
            --n5;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll(World world, double d, double d2, double d3) {
        int n = MathHelper.floor((double)d);
        int n2 = MathHelper.floor((double)d3);
        int n3 = MathHelper.floor((double)d2) - 1;
        int n4 = ((Double)this.lII.lIl()).intValue();
        BlockPos.Mutable mutable = new BlockPos.Mutable();
        int n5 = 0;
        while (n5 < n4) {
            int n6 = n3 - n5;
            if (n6 >= world.getBottomY()) {
                mutable.set(n, n6, n2);
                BlockState blockState = world.getBlockState((BlockPos)mutable);
                if (!blockState.getCollisionShape((BlockView)world, (BlockPos)mutable).isEmpty()) {
                    return false;
                }
            }
            ++n5;
        }
        return true;
    }

    public boolean IIII() {
        return false;
    }

    private /* synthetic */ boolean IIlI(MinecraftClient minecraftClient, Entity entity) {
        return this.llII(minecraftClient, entity);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block18: {
                block19: {
                    block15: {
                        block13: {
                            block16: {
                                block14: {
                                    break block16;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        break block13;
                                        break;
                                    }
lbl3:
                                    // 2 sources

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
                                        KnockbackDisplacement.IlII = new int[var1_9];
                                        ** continue;
                                        break;
                                    }
lbl10:
                                    // 1 sources

                                    while (true) {
                                        var3_11 += 4;
                                        if (++var4_12 < var1_9) ** GOTO lbl3
                                        break block14;
                                        break;
                                    }
                                    var3_11 = 0;
                                    var4_12 = 0;
                                    ** while (true)
lbl17:
                                    // 1 sources

                                    while (true) {
                                        var13_7 = -1;
lbl19:
                                        // 2 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                KnockbackDisplacement.Il = new String[17];
                                KnockbackDisplacement.lII();
                                return;
lbl25:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl27:
                                // 1 sources

                                while (true) {
                                    if (var13_7 != 0) ** GOTO lbl25
                                    break block15;
lbl30:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl32:
                                    // 1 sources

                                    while (true) {
                                        var2_10 = -357042234;
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var6 = 2174;
                            break block17;
                            var10_4 = 0;
                            break block18;
lbl40:
                            // 1 sources

                            while (true) {
                                var9_3 = new String[var8_2.length];
                                ** continue;
                                break;
                            }
                            var0_8 = "\u00f4\u00ec+\u00ff\u0089\u008a\u00d1\u0004\u00e7\u000e=W\u00abs\u00ad\u00bf_\u00bb\u0093 k\u000e\u00b6\u0091\u00e6\u00d5\u00e0\u00c1\u009f\u00e7Sc\u00a7}\u00f9\u0003Z\u0000x\u00e7.\u00a17\u00c3\u00c6\u0093\u00ecj|\u00b5q\u00b6\u0095\u00d8\u00a6\u00db\u00ca\u00b6\u00b0\u0099\u0087\u00dc\u00a3\u0016|\u00a7\u00f5\u0007\u00fb\u00af\u00e6\u0082\u008e\u001e#\u0012\u00e5\u00fd\u00cd}\u00e43\u00d6\u008a\u00a0kQ>\u0003\u00bc\u00b6yvjx@\u00b6#\u008dX\u00a6\u009d\u00a1\u00a5\u00f1\u00c6\u00c7\u0080\u00a2\fF@\u0096\u0085{\u00eak\u00b0|\u00ea\u00b7\u00adbvW\u001a\u00b3\u0092\u0082\u00f0\u001b\u00ca\u00fe\u001d\u00caU\u0017\u00db\u0013J\u00b8\u00f2\u00fb1\u00d7(\u00e0\u0094\u00d4\u00c3\u0090\u00ef\u00b8\u00f0\u00c8\u00e7\f\u00db\u009c\u00c0\u00afI\u00f6{\u001b\u0083\u009b\u00a7\u0016\u00f8\t\u00e3*\u0085\r\u00d3\b9}\u0015\u0089j&d".getBytes("ISO-8859-1");
                            var1_9 = var0_8.length / 4;
                            ** while (true)
                        }
                        if (++var10_4 >= var8_2.length) ** break;
                        ** while (true)
                        break block19;
lbl50:
                        // 1 sources

                        while (true) {
                            var11_5 += var12_6;
                            ** continue;
                            break;
                        }
                    }
                    KnockbackDisplacement.IlIl = var9_3;
                    KnockbackDisplacement.IllI = new Object[var9_3.length];
                    ** while (true)
                }
                var13_7 = 0;
                ** while (true)
            }
            var11_5 = 0;
            var12_6 = 0;
            ** while (true)
            var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
            KnockbackDisplacement.IlII[var4_12] = var5_13 ^= var2_10;
            ** while (true)
            var12_6 = var8_2[var10_4] ^ var6;
            var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
            ** while (true)
        }
        var7_1 = "\u0e01\udbee\u4c4f\ubc18\u3a92\u625c\u804a\u75cc\uaef7\ue078\u5a81\uf5ac\u8e95\uc8ac\uf6d5\uca29\ucea4\u9e17\uf375\u3df9\u22e8\u238d\u45c0\u5db2\ub7ff\udecf\u93de\ucea0\uf03b\u9a0d\uf453\u2fff\u1271\ud6dc\u9cb9\uff1f\u769a\u7add\u4f57\u78b8\u45fc\u3280\ubfbb\ubb31\ub7cf\u11ad\u0d16\ue393\u7318\ufe5c\u8e57\u591c\u21dc\u0b32\uf55b\uee08\ucc17\u9882\u6e58\u2d2f\u83b6\u76ed\u8a04\ubfbe\u2296\ucb92\uabad\u996d\uf520\ud21c\u1954\u94e4\u5c13\u8f67\uf18f\u0959\ubec5\ub6a5\u723f\uc96e\u07fe\u87a3\u01ba\u8a23\ua377\u1475\u870c\uee09\u1e1f\u2799\ua1fa\u3335\ub72f\ube7a\ue0d5\ubcbb\u39e6\u314f\ue5e5\u7fd4\ud238\u351b\ud077\u2deb\u9458\uffba\u4650\u05f2\u221c\u2ab1\u030b\uea44\ud6a3\ua086\ua176\u6e1e\u4edd\u231a\u5da7\u620d\u3d7c\u6b3f\u440f\ua5dd\u7905\uebe2\uc9c3\ub3f8\ubd1e\u30cd\ue5f4\u672d\ud2cc\u6e22\u950c\uab97\u17c5\ufe90\u61ed\u666f\u187e\u074c\uc25c\ueb8c\u9fb0\u6a83\ub168\uf388\u3259\u6912\u3611\ub9ff\u9641\uf955\u08f0\uf9ea\u5775\u63f9\udcf0\u5b7e\udb0c\ud10a\u2f56\u83e8\ud66d\ud881\u9762\u3bf5\ueb51\u5b24\u6ffd\u28f6\ud9af\ud7a9\u7601\ude20\u1aa2\ucaa3\uae7f\u6af8\u4883\u1654\u14ef\uc2de\u8fb1\u92be\u65bb\uba19\u47a2\u4660\u4759\u35c1\u34ab\u7f29\ub145\udcaa\u9d1f\u9035\u4cc0\u7786\ua9ab\u5783\u7c64\uab95\u2e82\udc0f\ue8ab\u8d48\u4263\u3691\u1c98\u77d3\u330a\u62a9\u7ac7\u3cdf\ucfc6\ub5ee\u995c\ud877\ub3cd\u589c\u178d\u2d28\u2faa\uad21\u2dbf\u52f1\u4364\u13ef\u659b\u5874\ue7ae\u5c22\ua496\u369c\u7064\u9ceb\ue292\ucaf5\u1382\u4ed1\u96c5\u73df\ubbce\u3ee0\ub6d1\u579e\ud606\ua1e5\u2243\u7eaa\u3b4a\u07d9\u368d\ud9e9\ub8e1\uaec6\ua764\u0bae\ucbf5\uba24\u93f4\ue111\u953a\u947e\ud6ff\uf0ea\ua37e\u60bf\ud3c8\u15af\ue600\u3a9b\u74d8\ucf12\ub87f\u20e0\ub05e\uc018\u752b\u2f6f\u5f5c\ub5d2\u6d33\u457e\ufe52\uba20\ua5b3\ub68d\u3266\u4f51\u986f\uc150\u5835\uca96\u28e6\ubc9d\u0589\u198c\u6764\u8a06\ud258\u0c0d\u4647\u8d0a\u7c70\u0a9a\ud657\ufc95\u745b\u53f5";
        var8_2 = "\u086e\u086e\u083e\u086e\u086e\u085e\u086e\u087a\u086a\u086a\u0872\u086e\u086e\u0872\u0876\u086e\u0872".toCharArray();
        ** while (true)
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private Float IlII(MinecraftClient minecraftClient, Entity entity) {
        IllllIII illllIII = null;
        double d = 0.0;
        double d2 = 0.0;
        int n = 0;
        boolean bl = true;
        while (true) {
            double d3;
            if (!bl || (bl = false) || !true) {
                ++n;
            }
            if (n >= 12) {
                if (illllIII != null) return Float.valueOf((float)Math.toDegrees(Math.atan2(-d, d2)));
                return null;
            }
            double d4 = Math.PI * 2 * (double)n / 12.0;
            double d5 = Math.cos(d4);
            IllllIII illllIII2 = this.lI(minecraftClient, entity, d5, d3 = Math.sin(d4));
            if (illllIII2 == null || !illllIII2.II(illllIII)) continue;
            illllIII = illllIII2;
            d = d5;
            d2 = d3;
        }
    }

    private static String Illl(char[] cArray, long l2, int n) {
        int n2 = 0x4BC44D56 ^ n;
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
    public boolean lIII(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.currentScreen != null) {
            return false;
        }
        if (this.II) {
            return true;
        }
        if (this.Ill > 0) return false;
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof EntityHitResult)) return false;
        EntityHitResult entityHitResult = (EntityHitResult)hitResult;
        hitResult = entityHitResult.getEntity();
        if (hitResult == null) return false;
        if (hitResult.isAlive()) {
            Float f;
            if (lIIllllI.lIlI(minecraftClient, (Entity)hitResult)) {
                lIIllllI.lIl(minecraftClient);
                return true;
            }
            Float f2 = f = (Boolean)this.III.lIl() != false ? this.IlII(minecraftClient, (Entity)hitResult) : null;
            if (((Boolean)this.III.lIl()).booleanValue() && f == null) {
                return false;
            }
            IIllIllII iIllIllII = this.IIl(minecraftClient, (Entity)hitResult, f);
            if (iIllIllII == null) {
                return false;
            }
            boolean bl = IlIlllI.IIllll(minecraftClient, 400, iIllIllII.l(), iIllIllII.I(), () -> this.IIlI(minecraftClient, (Entity)hitResult));
            if (bl) {
                this.II = true;
                this.lll = hitResult.getId();
                this.ll = minecraftClient.player.age + 4;
                return true;
            }
            return false;
        }
        return false;
    }

    private void lIIl() {
        this.II = false;
        this.lll = -1;
        this.ll = Integer.MIN_VALUE;
    }

    private float lIlI(MinecraftClient minecraftClient) {
        double d = (Double)minecraftClient.options.getMouseSensitivity().getValue();
        double d2 = d * 0.6 + 0.2;
        float f = (float)(d2 * d2 * d2 * 1.2);
        return !(f < 0.001f) ? f : 0.15f;
    }

    public Map<String, Object> lIll() {
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<String, Object>();
        linkedHashMap.put("enabled", this.IIIlIIl());
        linkedHashMap.put("mode", ((IIlIllllI)((Object)this.l.lIl())).toString());
        linkedHashMap.put("hazardOnly", this.III.lIl());
        linkedHashMap.put("cooldown", this.Ill);
        return linkedHashMap;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llII(MinecraftClient minecraftClient, Entity entity) {
        if (this.IIIlIIl() && this.II && minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null && minecraftClient.interactionManager != null && entity != null && entity.getId() == this.lll && entity.isAlive() && minecraftClient.world.getEntityById(entity.getId()) == entity) {
            if (lIIllllI.lIlI(minecraftClient, entity)) {
                this.lIIl();
                lIIllllI.lIl(minecraftClient);
                return false;
            }
            minecraftClient.interactionManager.attackEntity((PlayerEntity)minecraftClient.player, entity);
            minecraftClient.player.swingHand(Hand.MAIN_HAND);
            this.Ill = ((Double)this.IIII.lIl()).intValue();
            this.lIIl();
            return true;
        }
        this.lIIl();
        return false;
    }

    private static int llIl(int n, int n2) {
        return IlII[n ^ 0x736E5DB5] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lllI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x5FD27138;
        char[] cArray = IlIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IllI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            KnockbackDisplacement.IllI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xAB4489B;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 10 -> 186;
                case 3 -> 146;
                case 23 -> 132;
                case 5 -> 105;
                case 8 -> 191;
                case 26 -> 51;
                case 1 -> 15;
                case 14 -> 32;
                case 27 -> 223;
                case 25 -> 100;
                case 9 -> 11;
                case 6 -> 38;
                case 12 -> 54;
                case 4 -> 224;
                case 16 -> 183;
                default -> 43;
                case 29 -> 103;
                case 15 -> 116;
                case 2 -> 16;
                case 24 -> 56;
                case 19 -> 126;
                case 31 -> 74;
                case 30 -> 101;
                case 20 -> 61;
                case 17 -> 67;
                case 7 -> 56;
                case 18 -> 16;
                case 21 -> 4;
                case 11 -> 101;
                case 28 -> 14;
                case 22 -> 228;
                case 13 -> 217;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

