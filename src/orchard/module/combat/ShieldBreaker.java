/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIIIlI
 * Module         : ShieldBreaker  [COMBAT]
 * Description    : Switches to an axe and breaks shields on click.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Web Switch Delay
 *   - Web Rotate Delay
 *   - Web Place Delay
 *   - Holding Sword
 *   - Web Rotation
 *   - Switch Delay
 *   - Switch Back
 *   - Holding Axe
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.Blocks
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.world.ClientWorld
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket
 *  net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket
 *  net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.tag.ItemTags
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package orchard.module.combat;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.BlockUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.ChunkDeltaUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.EntityVelocityUpdateS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.BlockView;
import net.minecraft.world.RaycastContext;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIIllII;
import orchard.internal.IIIIlIIl;
import orchard.internal.IIIIllIlI;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIIlll;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlIll;
import orchard.internal.IlIlllI;
import orchard.internal.IlllIll;
import orchard.internal.IllllllI;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIlIlI;
import orchard.internal.llIll;
import orchard.module.combat.MaceSwap;

@Environment(value=EnvType.CLIENT)
public final class ShieldBreaker
extends ModuleBase {
    private static final double I = 3.0;
    private static final double II = 0.5;
    private boolean Il;
    private static final List<IlllIll> lI;
    private final llIll ll;
    private float III;
    private final IlIlIlI IIl;
    private int IlI;
    private static final double Ill = 0.55;
    private boolean lII;
    private final IIIIIIIIl<IllllllI> lIl = this.IIlllIl(new IIIIIIIIl<IllllllI>(StringFactory.IIII("Mode"), IllllllI.class, IllllllI.I));
    private static final IIIlIIIII llI;
    private final llIlIlI lll = this.IIlllIl(new llIlIlI(StringFactory.IIII("u5tamBBDWROZGw=="), lI, List.of(llI, lIIl)));
    private final llIll IIII;
    private boolean IIIl;
    private final lIlIIlI IIlI;
    private static final int IIll = 9;
    private static final long IlII = 175L;
    private Vec3d IlIl;
    private long IllI;
    private final IIIlIlIIl Illl;
    private long lIII;
    private static final IIIlIIIII lIIl;
    private int lIlI;
    private long lIll;
    private int llII;
    private IlIlIll llIl;
    private static final IIIlIIIII lllI;
    private static final double llll = 0.25;
    private Vec3d IIIII = null;
    private static final double IIIIl = 1.25;
    private BlockPos IIIlI;
    private static final double IIIll = 0.35;
    private float IIlII;
    private final IIIIIIIIl<IIIlll> IIlIl;
    private final llIll IIllI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Switch Back"), true));
    private static final double IIlll = 0.0;
    private final llIll IlIII = this.IIlllIl(new llIll((Object)StringFactory.IIII("AutoStun"), false));
    private long IlIIl;
    private final lIlIIlI IlIlI;
    private boolean IlIll = false;
    private final IIIlIlIIl IllII;
    private IIIIlIIl IllIl;
    private int IlllI;
    private long Illll;
    private static final long lIIII = 650L;
    private boolean lIIIl;
    private static final double lIIlI = 0.12;
    private static final double lIIll = 0.001;
    private int lIlII = -1;
    private static final double lIlIl = 0.42;
    private final IIIlIlIIl lIllI = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Stun Delay"), 0.0, 0.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
    private static final int lIlll = 20;
    private int llIII = -1;
    private static final int llIIl = 3;
    private int llIlI = -1;
    private LivingEntity llIll = null;
    private static final long lllII = 180L;
    private static final IIIlIIIII lllIl;
    private static final double llllI = 9.0;
    private int lllll = -1;
    private static final double IIIIII = 25.0;
    private boolean IIIIIl;
    private int IIIIlI = -1;
    private BlockPos IIIIll = null;
    private float IIIlII;
    private int IIIlIl = -1;
    private Object IIIllI;
    private BlockHitResult IIIlll = null;
    private static final int[] l;
    private static final String[] IIlIII;
    private static final Object[] IIlIIl;

    /*
     * Enabled aggressive block sorting
     */
    public ShieldBreaker() {
        super(StringFactory.IIII("ShieldBreaker"), Category.II, StringFactory.IIII("Switches to an axe and breaks shields on click."));
        this.ll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Auto Web"), false));
        this.IllII = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Web Delay"), 0.0, 0.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.Illl = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Swap Delay"), 55.0, 60.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.IIII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Prediction"), true));
        this.IIlIl = this.IIlllIl(new IIIIIIIIl<IIIlll>(StringFactory.IIII("Web Rotation"), IIIlll.class, orchard.internal.IIIlll.I));
        this.IlIlI = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("q4BGmRdQRBQ="), 50.0, 1.0, 100.0, 1.0).lIII(() -> {
            if ((Boolean)this.IlIII.lIl() == false) return false;
            if ((Boolean)this.ll.lIl() == false) return false;
            if (this.IIlIl.lIl() != orchard.internal.IIIlll.Il) return false;
            return true;
        }));
        this.IIl = new IlIlIlI();
        this.IIlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Web Chance"), 100.0, 0.0, 100.0, 1.0).IIII(StringFactory.IIII("%")));
        this.IllIl = IIIIlIIl.Ill;
        this.IlI = Integer.MIN_VALUE;
        this.IlIl = Vec3d.ZERO;
        this.lIlI = Integer.MIN_VALUE;
        this.lIllI.lIII(this.IlIII::lIl);
        this.ll.lIII(() -> true);
        this.IllII.lIII(this.ll::lIl);
        this.IIII.lIII(this.ll::lIl);
        this.IIlIl.lIII(this.ll::lIl);
        this.IIlI.lIII(this.ll::lIl);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block24: {
                block17: {
                    block25: {
                        block22: {
                            block20: {
                                block23: {
                                    block19: {
                                        block18: {
                                            break block21;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                var4_12 = 0;
                                                break block17;
                                                break;
                                            }
lbl4:
                                            // 1 sources

                                            while (true) {
                                                var3_4 += 4;
                                                if (++var4_12 < var1_2) break block17;
                                                break block18;
                                                break;
                                            }
lbl8:
                                            // 1 sources

                                            while (true) {
                                                var3_4 = 0;
                                                ** continue;
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
                                                ShieldBreaker.l = new int[var1_2];
                                                ** continue;
                                                break;
                                            }
lbl16:
                                            // 1 sources

                                            while (true) {
                                                ShieldBreaker.l[var4_12] = var5_13 ^= var2_3;
                                                ** continue;
                                                break;
                                            }
lbl19:
                                            // 1 sources

                                            while (true) {
                                                break block19;
                                                break;
                                            }
lbl21:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                        }
                                        ShieldBreaker.lllIl = StringFactory.IIII("Delay");
                                        break block22;
lbl26:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl28:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl30:
                                        // 1 sources

                                        while (true) {
                                            var13_11 = 0;
                                            break block20;
                                            break;
                                        }
lbl33:
                                        // 1 sources

                                        while (true) {
                                            ShieldBreaker.IIlIII = var9_7;
                                            ** continue;
                                            break;
                                        }
                                        ShieldBreaker.lIIl = StringFactory.IIII("Holding Axe");
                                        ShieldBreaker.lI = List.of(new IlllIll(ShieldBreaker.llI, (Object)ShieldBreaker.llI), new IlllIll(ShieldBreaker.lIIl, (Object)ShieldBreaker.lIIl));
                                        return;
                                        ShieldBreaker.IIlIIl = new Object[var9_7.length];
                                        break block23;
                                        var9_7 = new String[var8_6.length];
                                        var13_11 = -1;
                                        break block20;
lbl44:
                                        // 1 sources

                                        while (true) {
                                            var11_9 += var12_10;
                                            ** continue;
                                            break;
                                        }
                                    }
                                    if (++var10_8 >= var8_6.length) {
                                        ** continue;
lbl50:
                                        // 1 sources

                                        while (true) {
                                            var9_7[var10_8] = var7_5.substring(var11_9, var11_9 + var12_10);
                                            ** continue;
                                            break;
                                        }
                                    }
                                    break block24;
                                    var11_9 = 0;
                                    var12_10 = 0;
                                    if (var13_11 == 0) {
                                        ** continue;
                                    }
                                    break block24;
                                }
                                var2_3 = -1454275108;
                                break block25;
lbl62:
                                // 1 sources

                                while (true) {
                                    var8_6 = "\u39b5\u39e1\u39a9\u39b1\u39b1\u39ad\u39b1\u39a5\u39ad\u39ad\u39a5\u39b1\u39a5\u39b1\u39b1\u39ad\u39b1\u39a5\u39a9\u39ad\u39b5\u39b1\u39a9\u39b1\u39ad\u39b1\u39b9\u39b9\u39b5\u39ad\u39ad".toCharArray();
                                    ** continue;
                                    break;
                                }
                            }
                            var10_8 = 0;
                            ** while (true)
                        }
                        ShieldBreaker.lllI = StringFactory.IIII("Web Delay");
                        ShieldBreaker.llI = StringFactory.IIII("Holding Sword");
                        ** while (true)
                    }
                    var0_1 = "M\u00ef\b\u00f9y\u007f\u00d4\u00e5\u0015\u00ef\u00fb\u00b1\u00ae:/%x\u00e3\u00b9}\u00a9y1\u00c5\u00f9\u007f\ts\u0005YOn\u007fD\u00ab\n\u00a2\u00ee\u0095#\u00cf\u00dd\u00f4D\u0082D\u0094\\\u00e4\u00dc\u00f6\u00f1\u0083\u00e6\u0087)]\u00f9;)3\u00b9r9\u00db\u00b5M\u00b8S\u00b8\u008e\u0088".getBytes("ISO-8859-1");
                    var1_2 = var0_1.length / 4;
                    ** while (true)
                }
                var5_13 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                ** while (true)
            }
            var12_10 = var8_6[var10_8] ^ var6;
            ** while (true)
        }
        var6 = 14753;
        var7_5 = "\u7c8d\u7c51\u7c96\u7be2\u7be9\u7cb0\u7cb4\u7cb2\u7bdf\u7be3\u7c54\u7caf\u7c7f\u7cb8\u7cb0\u7bdf\u7c86\u7cad\u7c99\u7c99\u268e\u2651\u268b\u25e1\u25e6\u267f\u268d\u25e3\u26b3\u26ae\u26ac\u26b5\u2685\u2687\u267e\u26b7\u2681\u2691\u264f\u25e2\u25eb\u2651\u2680\u26af\u2683\u2687\u264d\u26b5\u26b2\u2695\u267e\u25e2\u25e5\u26ae\u264f\u25e2\u26b2\u25e5\u2696\u26b1\u2697\u26b7\u25de\u26af\u25e8\u26b3\u25e6\u26b6\u2680\u25e5\u25e1\u25e3\u2682\u2691\u25e0\u2689\u25e8\u264e\u267e\u268a\u264f\u2687\u267e\u269a\u1a6c\u18fe\u1a6c\u1907\u1913\u1907\u1923\u1923\u08e4\u09a4\u08e3\u0990\u08dc\u09ad\u09ad\u09b3\u0982\u097d\u097a\u0985\u09b2\u08e2\u09ac\u09ac\u8d72\u8dad\u8da7\u8d3d\u8d4a\u8da3\u8d71\u8d3f\u8d9e\u8d9d\u8daf\u8d50\u8da4\u8dae\u8d52\u8db6\ucd8d\ucd79\ucd80\ucd81\ucceb\uccd9\ucd92\ucd7e\ucdb4\ucdb4\ucd89\ucd55\ubde6\ubea9\ubeb7\ubeb7\ube90\ube91\ube91\ubddf\ube8b\ube87\ubeb8\ube8c\ube7a\ube86\ubea2\ubea2\u39ef\u3a24\u39ba\u3a00\u67c5\u6821\u67d8\u6819\u67f3\u6809\u67ee\u67f7\u6828\u682c\u6806\u67fd\u679c\u6795\u6748\u6777\u66db\u6746\u66d9\u673b\u6772\u674c\u66dc\u673f\u4a16\u4a09\u4a13\u4a25\ud96a\udc25\udc2f\udc07\udc13\udc37\udc0d\ud963\udc07\udc0b\udbfc\udc08\udc36\udc0a\udc1e\udc1e\u62b0\u61e3\u6279\u623f\udc1b\udbc3\udbf2\udbba\udc1f\udbca\udbca\udbf7\udbba\udbca\udbf5\udbf3\udbca\udc25\udc0f\udc0f\u07f3\u082e\u081f\u07d0\u0834\u0824\u07ed\u081a\u07d3\u0823\u0833\u081d\u0822\u081b\u0823\u0819\ub0e9\ub1a6\ub17c\ub1b7\ub18d\ub18c\ub196\ub189\ub18c\ub17c\ub189\ub19d\u131f\u1462\u12f3\u12c4\u1460\u12f1\u131d\u12d3\u12c2\u12bf\u12f8\u12c2\u12f1\u12be\u146a\u146a\u74e7\u7545\u74e1\u74e1\ufe0b\ufe0f\ufb5b\ufb5e\ufe33\ufb66\ufe16\ufdc2\ub2c9\ub308\ub2d5\ub326\ub30a\ub2d7\ub30c\ub32a\ub323\ub319\ub309\ub2ce\u9760\u9a37\u9761\u9a06\u975a\u9a2f\u9a2f\u9a07\u9a03\u9a1e\u9766\u9a18\u9a35\u9a22\u9a2f\u99f9\u9a30\u9764\u9a2a\u9a2a\u3031\u2d6a\u3030\u2d5b\u3007\u2d62\u2d62\u2d5a\u300e\u2ff3\u2ffb\u2ff2\u2d5f\u2d6a\u3005\u2ff7\uae01\uadbd\uae2d\uae0d\uadfc\uae00\uadfd\uab5d\u35b9\u3636\u3620\u35c6\u35c1\u362c\u35ba\u35c8\u3625\u3626\u35c1\u361b\u362c\u3624\u3635\u3629\u3dff\u3b6b\u3e0c\u3b62\u3dc1\u3e10\u3dc3\u3b61\u3b6c\u3e12\u3dc2\u3e15\ub828\ud56b\ub7f5\ub7f5\ub7ce\ub7d3\ub7d3\ub81d\ub7c9\ub7c5\ub7f6\ub7ca\ub7bc\ub7c8\ud564\ud564\u26ca\u2707\u26d6\u2725\u2709\u2719\u26cc\u271b\u2725\u272b\u26f3\u2727\u271b\u26ce\u2703\u2703\u2719\u26c8\u272d\u26f6\u26f4\u26c5\u26ff\u26ff\u335f\u3622\u3633\u3604\u3620\u3630\u3361\u3606\u35ff\u362f\u361f\u3631\u3631\u3611\u3626\u3626\u3630\u3361\u361c\u3613\u3615\u3364\u362a\u362a\u5ce1\u5da0\u5dad\u5d7e\u5da2\u5db2\u5d97\u5d91\u5d80\u5d81\u5d9a\u5d82\u5d82\u5db7\u5cdf\u5d92\u5db4\u5dac\u5db7\u5d7b\uc07a\uc03e\uc08f\uc092\uc07a\uc093\uc093\ubfeb\ubfdf\uc080\uc049\uc046\u5caf\u5c4b\u5bda\u5c97\u5caf\u5c96\u5c96\u5bde\u5bea\u5c89\u5c40\u5c43";
        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private IIIIIllII I(MinecraftClient var1_1, BlockPos var2_2) {
        block21: {
            block28: {
                block17: {
                    block20: {
                        block14: {
                            block23: {
                                block26: {
                                    block15: {
                                        block22: {
                                            block24: {
                                                block27: {
                                                    block19: {
                                                        block18: {
                                                            block16: {
                                                                block25: {
                                                                    if (var1_1 == null) break block17;
                                                                    break block25;
lbl3:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (this.IIlIll(var1_1, var9_8)) break block14;
                                                                        break block15;
                                                                        break;
                                                                    }
                                                                    while (true) {
                                                                        break block16;
                                                                        break;
                                                                    }
lbl8:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (this.IIIIIl(var1_1, var2_2)) ** continue;
                                                                        break block17;
                                                                        break;
                                                                    }
                                                                }
                                                                if (var1_1.player == null) break block17;
                                                                break block26;
                                                                while (true) {
                                                                    break block18;
                                                                    break;
                                                                }
lbl16:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (var13_12 == null) break block19;
                                                                    break block20;
                                                                    break;
                                                                }
lbl19:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (!(var1_1.player.getEyePos().squaredDistanceTo(var11_10) > var3_3 * var3_3)) break block21;
                                                                    break block15;
                                                                    break;
                                                                }
                                                            }
                                                            var3_3 = Math.max(0.0, var1_1.player.getBlockInteractionRange() - 0.1);
                                                            var5_4 = Direction.values();
                                                            var6_5 = var5_4.length;
                                                            var7_6 = 0;
                                                            break block27;
lbl28:
                                                            // 1 sources

                                                            while (true) {
                                                                v0(var1_1.player.getEyePos(), var12_11, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, (Entity)var1_1.player);
                                                                break block22;
                                                                break;
                                                            }
                                                        }
                                                        var8_7 = var5_4[var7_6];
                                                        var9_8 = var2_2.offset(var8_7);
                                                        ** while (true)
lbl35:
                                                        // 1 sources

                                                        while (var13_12.getType() == HitResult.Type.BLOCK) {
                                                            break block23;
                                                        }
                                                        break block15;
lbl38:
                                                        // 1 sources

                                                        while (true) {
                                                            if (!var2_2.equals((Object)var9_8.offset(var13_12.getSide()))) break block15;
                                                            break block24;
                                                            break;
                                                        }
lbl41:
                                                        // 2 sources

                                                        while (true) {
                                                            if (var13_12 == null) break block15;
                                                            ** GOTO lbl35
                                                            break;
                                                        }
                                                    }
lbl45:
                                                    // 2 sources

                                                    while (true) {
                                                        ** continue;
                                                        break;
                                                    }
                                                }
lbl48:
                                                // 2 sources

                                                while (true) {
                                                    if (var7_6 < var6_5) ** continue;
                                                    return null;
                                                }
                                            }
                                            return new IIIIIllII(var2_2.toImmutable(), var9_8.toImmutable(), var13_12.getPos(), var13_12);
                                        }
                                        var13_12 = var1_1.world.raycast(v0);
                                        ** GOTO lbl41
                                    }
lbl57:
                                    // 3 sources

                                    while (true) {
                                        ++var7_6;
                                        ** continue;
                                        break;
                                    }
                                }
                                if (var1_1.world != null && var2_2 != null) {
                                    ** continue;
                                }
                                break block17;
                            }
                            if (!var13_12.getBlockPos().equals((Object)var9_8)) ** GOTO lbl57
                            break block28;
                        }
                        var10_9 = var8_7.getOpposite();
                        var11_10 = Vec3d.ofCenter((Vec3i)var9_8).add(Vec3d.of((Vec3i)var10_9.getVector()).multiply(0.5));
                        ** while (true)
                    }
                    if (var13_12.getType() != HitResult.Type.BLOCK) ** break;
                    ** while (true)
                    ** while (true)
                }
                return null;
            }
            if (var13_12.getSide() == var10_9) ** break;
            ** while (true)
            ** while (true)
        }
        var12_11 = var11_10.subtract(Vec3d.of((Vec3i)var10_9.getVector()).multiply(0.001));
        var13_12 = lIIllllI.IIIIllI(var1_1, (Entity)var1_1.player, var1_1.player.getEyePos(), var12_11);
        ** while (true)
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean lI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.interactionManager == null || minecraftClient.getNetworkHandler() == null || livingEntity == null) {
            return false;
        }
        if (lIIllllI.Il(minecraftClient, (Entity)livingEntity)) {
            return false;
        }
        EntityHitResult entityHitResult = this.lllII(minecraftClient, livingEntity);
        if (entityHitResult == null) {
            return false;
        }
        lIIllllI.IllllII(true);
        lIIllllI.lIIIIl();
        try {
            lIIllllI.IlIIIIl(minecraftClient);
            boolean bl = lIIllllI.IIlllll(minecraftClient, entityHitResult);
            return bl;
        }
        finally {
            lIIllllI.IlIIlIl();
            lIIllllI.IllllII(false);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        int n;
        EntityHitResult entityHitResult;
        LivingEntity livingEntity;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        this.llII(minecraftClient);
        if (this.lIl.lIl() == IllllllI.II && this.IllIl == IIIIlIIl.Ill && !this.IIIIIl && this.IlII(minecraftClient) && this.IlIlII(minecraftClient, livingEntity = lIIllllI.IlIllII(minecraftClient, (HitResult)(entityHitResult = lIIllllI.lI(minecraftClient, 3.0)))) && !this.IlIll(minecraftClient, livingEntity) && (n = this.IlI(minecraftClient)) != -1) {
            this.lIl(minecraftClient, livingEntity, n);
        }
        if (!this.IIIIIl) {
            return;
        }
        if (this.IllIIl(minecraftClient)) {
            if (System.currentTimeMillis() < this.IlIIl) return;
            this.IlIIIl(minecraftClient);
            return;
        }
        this.IlllII(minecraftClient);
    }

    private void IIl() {
        this.IIIlIl = -1;
        this.Illll = 0L;
        this.Il = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return -1;
        if (minecraftClient.player == null) {
            return -1;
        }
        int n = 0;
        while (n < 9) {
            ItemStack itemStack = minecraftClient.player.getInventory().getStack(n);
            if (itemStack.getItem() instanceof AxeItem) return n;
            ++n;
        }
        return -1;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lII(BlockPos blockPos, boolean bl) {
        if (this.IIIlI == null) return;
        if (!this.IIIlI.equals((Object)blockPos)) return;
        this.lIIIl = bl;
        this.IIIl = !bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIl(MinecraftClient minecraftClient, LivingEntity livingEntity, int n) {
        if (!this.IIIIl(minecraftClient, livingEntity, n)) {
            return false;
        }
        this.lllIl(minecraftClient);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        this.llII(minecraftClient);
        if (this.IIIIIl) {
            if (!this.IllIIl(minecraftClient)) {
                this.IlllII(minecraftClient);
                return;
            }
        } else {
            return;
        }
        if (System.currentTimeMillis() < this.IlIIl) return;
        this.IlIIIl(minecraftClient);
    }

    public boolean IIII(LivingEntity livingEntity) {
        return lIIllllI.IllllI(livingEntity);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlI() {
        this.IllIl = IIIIlIIl.Ill;
        this.IllI = 0L;
        this.lIll = 0L;
        this.lIII = 0L;
        this.llIll = null;
        this.llIlI = -1;
        this.lIlII = -1;
        this.lllll = -1;
        this.lllll();
        this.IIIIIl = false;
        this.IlIIl = 0L;
        this.lIlI = Integer.MIN_VALUE;
        this.llIl = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        if (!this.IlIlI(minecraftClient)) {
            if (this.IIIII(minecraftClient)) return true;
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI(MinecraftClient minecraftClient, int n, BlockHitResult blockHitResult, BlockHitResult blockHitResult2) {
        if (!this.IIIlIIl()) return false;
        if (this.IllIl != IIIIlIIl.l) return false;
        if (this.IIIlll != blockHitResult) {
            return false;
        }
        this.lII = false;
        if (this.IIlIIl(minecraftClient, blockHitResult2) && IlIlllI.IIlI(minecraftClient, blockHitResult2, true) && minecraftClient.player.getInventory().getStack(n).isOf(Items.COBWEB)) {
            boolean bl = lIIllllI.IlIIIl(minecraftClient, this, n, () -> {
                this.IIIlI = blockHitResult2.getBlockPos().offset(blockHitResult2.getSide()).toImmutable();
                this.IIIllI = minecraftClient.world;
                this.llII = minecraftClient.player.age + 20;
                this.lIIIl = false;
                this.IIIl = false;
                return lIIllllI.lIllll(minecraftClient, blockHitResult2);
            });
            if (!bl) {
                this.IIIllI();
                this.lIll = System.currentTimeMillis() + 50L;
                return bl;
            }
            ++this.IlllI;
            return bl;
        }
        this.lIll = System.currentTimeMillis() + 50L;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void Illl(MinecraftClient minecraftClient, long l2) {
        if (!this.IlIlll(minecraftClient, this.llIll)) {
            this.IIIIll(l2);
            return;
        }
        if (lIIllllI.Il(minecraftClient, (Entity)this.llIll)) {
            return;
        }
        if (l2 - this.IllI > 1200L) {
            this.IIIIll(l2);
            return;
        }
        if (lIIllllI.IllllI(this.llIll)) {
            if (this.lIII == 0L && l2 - this.IllI < 175L) {
                this.lIll = l2;
                return;
            }
            this.IIIIll(l2);
            return;
        }
        if (this.lIII == 0L) {
            this.lIII = l2;
            this.lIll = l2;
            return;
        }
        if (l2 - this.lIII < 25L) {
            this.lIll = l2;
            return;
        }
        if (lIIllllI.IllllI(this.llIll)) {
            this.IIIIll(l2);
            return;
        }
        if (!this.IIlIII(minecraftClient, this.llIlI)) {
            this.lIll = l2;
            return;
        }
        if (!this.lI(minecraftClient, this.llIll)) {
            this.lIll = l2;
            return;
        }
        if (minecraftClient.player != null) {
            this.lIlI = minecraftClient.player.age;
        }
        if (((Boolean)this.ll.lIl()).booleanValue()) {
            this.IllIII(minecraftClient, this.llIll, l2);
            return;
        }
        this.IIIIll(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return true;
        if (minecraftClient.player == null) return true;
        if (this.lllll < 0) return true;
        if (this.lllll >= 9) return true;
        this.lIlIl(System.currentTimeMillis());
        if (!this.llII(minecraftClient)) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean lIIl(LivingEntity livingEntity) {
        if (livingEntity == null) return false;
        if (this.llIll != livingEntity) return false;
        if (this.IllIl == IIIIlIIl.Ill) return false;
        if (this.IllIl == IIIIlIIl.IIl) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lIlI(LivingEntity livingEntity) {
        if (livingEntity == null) return false;
        if (this.llIll != livingEntity) return false;
        if (this.IllIl == IIIIlIIl.Ill) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private long lIll(IIIlIlIIl iIIlIlIIl) {
        double d = iIIlIlIIl.IIIl();
        double d2 = iIIlIlIIl.IIII();
        if (d != d2) return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d, d2)));
        return Math.max(0L, Math.round(d));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llII(MinecraftClient minecraftClient) {
        if (this.IIIlIl < 0) return false;
        if (this.IIIlIl >= 9) return false;
        if (minecraftClient == null) return true;
        if (minecraftClient.player == null) {
            return true;
        }
        if (minecraftClient.player.age <= this.lIlI) {
            return true;
        }
        int n = lIIllllI.lllI(minecraftClient.player.getInventory());
        if (!this.Il && n != this.IIIlIl) {
            lIIllllI.lIIlI(minecraftClient, this, this.IIIlIl, 1);
            this.Il = true;
        }
        if (n == this.IIIlIl) {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
            this.IIl();
            return false;
        }
        if (System.currentTimeMillis() < this.Illll) return true;
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        this.IIl();
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        block5: {
            block9: {
                block7: {
                    block8: {
                        block6: {
                            if (livingEntity == null) return false;
                            if (minecraftClient == null) return false;
                            if (minecraftClient.player == null) return false;
                            if (minecraftClient.interactionManager == null) break block5;
                            if (!livingEntity.isAlive() || lIIllllI.IIllIl((Entity)livingEntity)) break block6;
                            if (this.llIII < 0 || lIIllllI.llIllI(minecraftClient) != this.llIII) break block7;
                            break block8;
                        }
                        this.IIIIll(System.currentTimeMillis());
                        return true;
                    }
                    if (lIIllllI.lll(minecraftClient, this.llIII)) break block9;
                }
                this.llIII = this.llIlI(minecraftClient);
            }
            if (this.llIII < 0) {
                return false;
            }
            IIIIIllII iIIIIllII = this.IlllI(minecraftClient, livingEntity);
            if (iIIIIllII == null) {
                this.lIIIl();
                return false;
            }
            this.IIIIll = iIIIIllII.l();
            this.IIIII = iIIIIllII.I();
            this.IIIlll = iIIIIllII.II();
            this.lII = this.IlIII(minecraftClient, this.IIIIll, this.IIIII);
            return this.lII;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllI(MinecraftClient minecraftClient, EntityHitResult entityHitResult, LivingEntity livingEntity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (entityHitResult == null) return false;
        if (entityHitResult.getEntity() != livingEntity) return false;
        if (!(minecraftClient.player.getEyePos().squaredDistanceTo(entityHitResult.getPos()) <= 9.0)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) {
            return false;
        }
        if (!this.lll.IIl(llI) && !this.lll.IIl(lIIl)) {
            return true;
        }
        ItemStack itemStack = minecraftClient.player.getMainHandStack();
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) {
            return false;
        }
        boolean bl = itemStack.isIn(ItemTags.SWORDS) || Registries.ITEM.getId((Object)itemStack.getItem()).getPath().endsWith("_sword");
        boolean bl2 = itemStack.getItem() instanceof AxeItem;
        if (this.lll.IIl(llI)) {
            if (bl) return true;
        }
        if (!this.lll.IIl(lIIl)) return false;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IIllIl(JsonObject jsonObject) {
        this.llIll(jsonObject);
        super.IIllIl(jsonObject);
        this.llllll(jsonObject, lllIl.IIII(), this.Illl, this.lIllI);
        this.llllll(jsonObject, lllI.IIII(), this.Illl, this.lIllI);
        this.llllll(jsonObject, "Switch Delay", this.Illl);
        this.llllll(jsonObject, "Axe Delay", this.lIllI);
        this.llllll(jsonObject, "Stun Delay", this.lIllI);
        this.llllll(jsonObject, "Web Switch Delay", this.Illl);
        this.llllll(jsonObject, "Web Rotate Delay", this.lIllI);
        this.llllll(jsonObject, "Web Place Delay", this.lIllI);
        if (this.Illl.IIIl() == 55.0 && this.Illl.IIII() == 60.0) {
            this.Illl.I(new double[]{0.0, 0.0});
        }
        if (this.lIllI.IIIl() != 10.0) return;
        if (this.lIllI.IIII() != 25.0) return;
        this.lIllI.I(new double[]{0.0, 0.0});
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIl(MinecraftClient minecraftClient, LivingEntity livingEntity, int n) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.getNetworkHandler() == null) return false;
        if (livingEntity == null) return false;
        if (n < 0) return false;
        if (n < 9) {
            this.llIll = livingEntity;
            this.llIlI = n;
            this.lllll = lIIllllI.lllI(minecraftClient.player.getInventory());
            long l2 = System.currentTimeMillis();
            this.IllIl = IIIIlIIl.ll;
            this.IllI = l2;
            boolean bl = lIIllllI.llIllI(minecraftClient) != n;
            this.lIll = bl ? l2 + this.lIll(this.Illl) : l2;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIIlI() {
        if (!this.IIIlIIl()) return false;
        if ((Boolean)this.ll.lIl() == false) return false;
        if (this.IllIl == IIIIlIIl.IlI) return true;
        if (this.IllIl == IIIIlIIl.II) return true;
        if (this.IllIl == IIIIlIIl.l) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean IIIll(BlockHitResult blockHitResult, BlockHitResult blockHitResult2) {
        if (blockHitResult == null) return false;
        if (blockHitResult2 == null) return false;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return false;
        if (blockHitResult2.getType() != HitResult.Type.BLOCK) return false;
        if (!blockHitResult.getBlockPos().equals((Object)blockHitResult2.getBlockPos())) return false;
        if (blockHitResult.getSide() != blockHitResult2.getSide()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlII(MinecraftClient minecraftClient, long l2) {
        if (!this.IlIlII(minecraftClient, this.llIll)) {
            this.IIIIll(l2);
            return;
        }
        if (lIIllllI.Il(minecraftClient, (Entity)this.llIll)) {
            return;
        }
        if (!this.IIlIII(minecraftClient, this.llIlI)) {
            if (l2 - this.IllI <= 650L) {
                this.lIll = l2;
                return;
            }
        } else {
            boolean bl = this.lI(minecraftClient, this.llIll);
            if (bl && minecraftClient.player != null) {
                this.lIlI = minecraftClient.player.age;
            }
            if (bl) {
                if (this.IlIIll(minecraftClient, l2)) {
                    return;
                }
                if (((Boolean)this.ll.lIl()).booleanValue()) {
                    this.IllIII(minecraftClient, this.llIll, l2);
                    return;
                }
            }
            this.IIIIll(l2);
            return;
        }
        this.IIIIll(l2);
    }

    private void IIlIl(MinecraftClient minecraftClient) {
        this.IlllII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIllI() {
        double d = (Double)this.IIlI.lIl();
        if (d >= 100.0) {
            return true;
        }
        if (d <= 0.0) {
            return false;
        }
        if (ThreadLocalRandom.current().nextDouble(100.0) < d) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        EntityHitResult entityHitResult;
        LivingEntity livingEntity;
        block9: {
            boolean bl;
            block10: {
                block7: {
                    block5: {
                        block8: {
                            block6: {
                                if (!this.IIIlIIl() || minecraftClient == null || minecraftClient.player == null || minecraftClient.options == null) break block5;
                                if (!this.IlIlI(minecraftClient)) break block6;
                                this.IIlIl(minecraftClient);
                                if (minecraftClient.options.attackKey == null || !minecraftClient.options.attackKey.isPressed()) break block7;
                                break block8;
                            }
                            if (this.IllIl != IIIIlIIl.Ill) {
                                this.lllIl(minecraftClient);
                                lIIllllI.llIlIl(minecraftClient.options.attackKey);
                                return;
                            }
                            if (this.llII(minecraftClient)) {
                                return;
                            }
                            break block9;
                        }
                        bl = true;
                        break block10;
                    }
                    this.IlIll = false;
                    return;
                }
                bl = false;
            }
            this.IlIll = bl;
            return;
        }
        if (this.IIIIIl) {
            return;
        }
        boolean bl = this.lIl.lIl() == IllllllI.II;
        boolean bl2 = minecraftClient.options.attackKey.isPressed();
        boolean bl3 = bl2 && !this.IlIll;
        this.IlIll = bl2;
        if (!bl && !bl3) {
            if (lIIllllI.IIl(minecraftClient.options.attackKey) <= 0) return;
        }
        if (!this.IlIlII(minecraftClient, livingEntity = lIIllllI.IlIllII(minecraftClient, (HitResult)(entityHitResult = lIIllllI.lI(minecraftClient, 3.0))))) return;
        if (this.IlIll(minecraftClient, livingEntity)) {
            return;
        }
        int n = this.IlI(minecraftClient);
        if (n == -1) return;
        if (!this.lIl(minecraftClient, livingEntity, n)) return;
        if (bl) return;
        lIIllllI.llIlIl(minecraftClient.options.attackKey);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity == null) return false;
        Vec3d vec3d = minecraftClient.player.getEyePos();
        Box box = livingEntity.getBoundingBox();
        double d = Math.max(box.minX, Math.min(vec3d.x, box.maxX));
        double d2 = Math.max(box.minY, Math.min(vec3d.y, box.maxY));
        double d3 = Math.max(box.minZ, Math.min(vec3d.z, box.maxZ));
        if (vec3d.squaredDistanceTo(d, d2, d3) > 9.0) {
            return false;
        }
        EntityHitResult entityHitResult = lIIllllI.lI(minecraftClient, 3.0);
        if (entityHitResult == null) return false;
        if (entityHitResult.getEntity() != livingEntity) return false;
        if (!(vec3d.squaredDistanceTo(entityHitResult.getPos()) <= 9.0)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIII(MinecraftClient minecraftClient, BlockPos blockPos, Vec3d vec3d) {
        BlockHitResult blockHitResult;
        HitResult hitResult;
        float f;
        int n;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (blockPos == null) return false;
        if (vec3d == null) {
            return false;
        }
        int n2 = n = this.llIII >= 0 ? this.llIII : this.llIlI(minecraftClient);
        if (n < 0) {
            return false;
        }
        BlockHitResult blockHitResult2 = this.IIIlll;
        if (blockHitResult2 == null) return false;
        if (!blockPos.equals((Object)blockHitResult2.getBlockPos())) return false;
        if (!this.IIlIIl(minecraftClient, blockHitResult2)) return false;
        if (this.IIlIl.lIl() == orchard.internal.IIIlll.Il) {
            f = this.IIl.llIIIl(minecraftClient, blockHitResult2, ((Double)this.IlIlI.lIl()).floatValue());
            if (f == Float.MAX_VALUE) {
                return false;
            }
        } else {
            float[] fArray;
            if (this.IIlIl.lIl() == orchard.internal.IIIlll.II && (fArray = IlIlllI.IlIll(minecraftClient, vec3d)) != null) {
                lIIllllI.IIlII(minecraftClient, fArray[0], fArray[1]);
            }
            ClientWorld clientWorld = minecraftClient.world;
            return IlIlllI.llIlI(minecraftClient, 200, blockHitResult2.getPos(), () -> {
                if (minecraftClient.world != clientWorld) return false;
                if (!this.IllI(minecraftClient, n, blockHitResult2, blockHitResult2)) return false;
                return true;
            });
        }
        boolean bl = f <= 2.5f || (hitResult = minecraftClient.crosshairTarget) instanceof BlockHitResult && ShieldBreaker.IIIll(blockHitResult = (BlockHitResult)hitResult, blockHitResult2);
        if (!bl) return false;
        this.IIl.III();
        HitResult hitResult2 = minecraftClient.crosshairTarget;
        blockHitResult = !(hitResult2 instanceof BlockHitResult) || !ShieldBreaker.IIIll((BlockHitResult)(hitResult = (BlockHitResult)hitResult2), blockHitResult2) ? blockHitResult2 : hitResult;
        return this.IllI(minecraftClient, n, blockHitResult2, blockHitResult);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return true;
        if (minecraftClient.player != null) return lIIllllI.IllllI((LivingEntity)minecraftClient.player);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        this.IIl();
        this.IIlI();
        this.IIl.lIlIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint != null) {
            MaceSwap maceSwap = clientEntrypoint.IlI().IlIIIIl();
            if (maceSwap == null) return false;
            if (!maceSwap.IIIlIIl()) return false;
            if (maceSwap.IlIllI(livingEntity)) return true;
            if (!maceSwap.lIIIll(minecraftClient, livingEntity)) return false;
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IllII() {
        if (this.IllIl != IIIIlIIl.Ill) return true;
        if (!this.IIIIIl) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIIIIllII IlllI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        IIIIIllII iIIIIllII;
        if (!((Boolean)this.IIII.lIl()).booleanValue() || (iIIIIllII = this.IIlllI(minecraftClient, this.IIllII(minecraftClient, livingEntity))) == null) {
            return this.IIlllI(minecraftClient, List.of(livingEntity.getBlockPos()));
        }
        return iIIIIllII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illll(MinecraftClient minecraftClient) {
        if (!this.IIlIlI(minecraftClient)) {
            return false;
        }
        if (this.IIlIl.lIl() != orchard.internal.IIIlll.I) {
            lIIllllI.IIlII(minecraftClient, this.IIIlII, this.III);
            return true;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIIl() {
        this.IIIIll = null;
        this.IIIII = null;
        this.IIIlll = null;
        this.IIIlII = 0.0f;
        this.III = 0.0f;
    }

    public boolean lIIlI() {
        return this.IIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIll(MinecraftClient minecraftClient) {
        if (!this.IIlIlI(minecraftClient)) {
            return false;
        }
        if (lIIllllI.llIllI(minecraftClient) != this.llIII) {
            return this.IIlIII(minecraftClient, this.llIII);
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean lIlII(LivingEntity livingEntity) {
        if (livingEntity == null) return false;
        if (this.llIll != livingEntity) return false;
        if (this.IllIl == IIIIlIIl.ll) return true;
        if (this.IllIl != IIIIlIIl.Il) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlIl(long l2) {
        if (this.lllll < 0) return;
        if (this.lllll >= 9) {
            return;
        }
        if (this.IIIlIl != this.lllll) {
            this.IIIlIl = this.lllll;
            this.Illll = l2 + 180L;
            this.Il = false;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d lIllI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        Vec3d vec3d;
        Vec3d vec3d2;
        if (livingEntity == null) {
            return Vec3d.ZERO;
        }
        Vec3d vec3d3 = vec3d2 = this.IIIIlI != livingEntity.getId() || this.IlI == Integer.MIN_VALUE || minecraftClient.player.age - this.IlI > 3 ? livingEntity.getVelocity() : this.IlIl;
        if (vec3d2 == null) {
            vec3d = Vec3d.ZERO;
            return vec3d;
        }
        vec3d = new Vec3d(vec3d2.x, 0.0, vec3d2.z);
        return vec3d;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void l(Packet<?> packet) {
        BlockUpdateS2CPacket blockUpdateS2CPacket;
        ChunkDeltaUpdateS2CPacket chunkDeltaUpdateS2CPacket;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!(packet instanceof BlockUpdateS2CPacket)) {
            if (packet instanceof ChunkDeltaUpdateS2CPacket) {
                chunkDeltaUpdateS2CPacket = (ChunkDeltaUpdateS2CPacket)packet;
                chunkDeltaUpdateS2CPacket.visitUpdates((blockPos, blockState) -> this.IlIIII(minecraftClient, (BlockPos)blockPos, (BlockState)blockState));
            }
        } else {
            blockUpdateS2CPacket = (BlockUpdateS2CPacket)packet;
            this.IlIIII(minecraftClient, blockUpdateS2CPacket.getPos(), blockUpdateS2CPacket.getState());
        }
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (this.IIIIlI < 0) return;
        if (!(packet instanceof EntityVelocityUpdateS2CPacket)) return;
        blockUpdateS2CPacket = (EntityVelocityUpdateS2CPacket)packet;
        if (blockUpdateS2CPacket.getEntityId() == this.IIIIlI) {
            chunkDeltaUpdateS2CPacket = blockUpdateS2CPacket.getVelocity();
            if (chunkDeltaUpdateS2CPacket == null) return;
            this.IlIl = chunkDeltaUpdateS2CPacket;
            this.IlI = minecraftClient.player.age;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d llIII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        Vec3d vec3d;
        float f = this.IIIIlI == livingEntity.getId() ? this.IIlII : minecraftClient.player.getYaw();
        float f2 = (float)Math.toRadians(f);
        Vec3d vec3d2 = new Vec3d(-Math.sin(f2), 0.0, Math.cos(f2));
        Vec3d vec3d3 = new Vec3d(livingEntity.getX() - minecraftClient.player.getX(), 0.0, livingEntity.getZ() - minecraftClient.player.getZ());
        if (!(vec3d2.lengthSquared() < 1.0E-6)) {
            vec3d2 = vec3d2.normalize();
            if (!(vec3d3.lengthSquared() > 1.0E-6)) return vec3d2;
            if (!(vec3d2.dotProduct(vec3d3.normalize()) <= 0.0)) return vec3d2;
            return vec3d3.normalize();
        }
        if (vec3d3.lengthSquared() < 1.0E-6) {
            vec3d = Vec3d.ZERO;
            return vec3d;
        }
        vec3d = vec3d3.normalize();
        return vec3d;
    }

    /*
     * Unable to fully structure code
     */
    private int llIlI(MinecraftClient var1_1) {
        block8: {
            block6: {
                block7: {
                    block10: {
                        block9: {
                            if (var1_1 == null) break block9;
                            break block10;
                            return var2_2;
lbl5:
                            // 1 sources

                            while (true) {
                                if (var3_3.isOf(Items.COBWEB)) ** continue;
                                break block6;
                                break;
                            }
lbl8:
                            // 1 sources

                            while (true) {
                                if (var3_3 != null) {
                                    ** continue;
                                }
                                break block6;
                                break;
                            }
                        }
lbl13:
                        // 2 sources

                        return -1;
lbl15:
                        // 2 sources

                        while (true) {
                            if (var2_2 >= 9) break block7;
                            break block8;
                            break;
                        }
                    }
                    ** while (var1_1.player == null)
lbl20:
                    // 1 sources

                    var2_2 = 0;
                    ** GOTO lbl15
                }
                return -1;
            }
            ++var2_2;
            ** while (true)
        }
        var3_3 = var1_1.player.getInventory().getStack(var2_2);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIll(JsonObject jsonObject) {
        if (jsonObject == null) return;
        if (!jsonObject.has("settings")) return;
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("settings");
        if (jsonObject2 == null) return;
        JsonElement jsonElement = ShieldBreaker.IIIIIIl(jsonObject2, this.lll.lllI());
        if (jsonElement == null) return;
        if (!jsonElement.isJsonPrimitive()) return;
        if (!jsonElement.getAsJsonPrimitive().isBoolean()) return;
        ShieldBreaker.lllIlI(jsonObject2, this.lll.lllI());
    }

    /*
     * Enabled aggressive block sorting
     */
    private EntityHitResult lllII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        EntityHitResult entityHitResult;
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (livingEntity == null) return null;
        if (!this.IIlll(minecraftClient, livingEntity)) {
            return null;
        }
        HitResult hitResult = minecraftClient.crosshairTarget;
        EntityHitResult entityHitResult2 = hitResult instanceof EntityHitResult ? (entityHitResult = (EntityHitResult)hitResult) : null;
        EntityHitResult entityHitResult3 = entityHitResult2;
        if (!this.lllI(minecraftClient, entityHitResult2, livingEntity)) {
            entityHitResult2 = lIIllllI.lI(minecraftClient, 3.0);
        }
        if (!this.lllI(minecraftClient, entityHitResult2, livingEntity)) {
            return null;
        }
        EntityHitResult entityHitResult4 = entityHitResult2;
        return entityHitResult4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllIl(MinecraftClient minecraftClient) {
        block37: {
            long l2;
            block38: {
                block21: {
                    block39: {
                        block33: {
                            block36: {
                                block35: {
                                    block31: {
                                        block34: {
                                            block32: {
                                                block24: {
                                                    BlockHitResult blockHitResult;
                                                    HitResult hitResult;
                                                    float f;
                                                    block27: {
                                                        block30: {
                                                            block28: {
                                                                block25: {
                                                                    block29: {
                                                                        block23: {
                                                                            block26: {
                                                                                block22: {
                                                                                    if (this.IllIl == IIIIlIIl.Ill) {
                                                                                        return;
                                                                                    }
                                                                                    if (minecraftClient == null || minecraftClient.player == null) break block21;
                                                                                    l2 = System.currentTimeMillis();
                                                                                    if (this.IllIl == IIIIlIIl.ll) {
                                                                                        if (!this.IlIlII(minecraftClient, this.llIll)) {
                                                                                            this.IIIIll(l2);
                                                                                            return;
                                                                                        }
                                                                                        if (!this.IIlIII(minecraftClient, this.llIlI)) {
                                                                                            if (l2 - this.IllI <= 650L) return;
                                                                                            this.IlllII(minecraftClient);
                                                                                            return;
                                                                                        }
                                                                                        if (l2 < this.lIll) return;
                                                                                        this.IllIl = IIIIlIIl.Il;
                                                                                        this.IllI = l2;
                                                                                        this.lIll = l2 + this.lIll(this.lIllI);
                                                                                        if (l2 < this.lIll) return;
                                                                                        this.IIlII(minecraftClient, l2);
                                                                                        return;
                                                                                    }
                                                                                    if (this.IllIl == IIIIlIIl.Il) {
                                                                                        if (l2 < this.lIll) return;
                                                                                        this.IIlII(minecraftClient, l2);
                                                                                        return;
                                                                                    }
                                                                                    if (this.IllIl == IIIIlIIl.III) {
                                                                                        this.IIlII(minecraftClient, l2);
                                                                                        return;
                                                                                    }
                                                                                    if (this.IllIl == IIIIlIIl.lI) {
                                                                                        if (l2 < this.lIll) return;
                                                                                        this.Illl(minecraftClient, l2);
                                                                                        return;
                                                                                    }
                                                                                    if (this.IllIl != IIIIlIIl.IlI) break block22;
                                                                                    if (l2 < this.lIll) return;
                                                                                    if (this.lIIll(minecraftClient)) {
                                                                                        this.IllIl = IIIIlIIl.II;
                                                                                        this.IllI = l2;
                                                                                        this.lIll = l2 + this.lIll(this.Illl);
                                                                                        return;
                                                                                    }
                                                                                    break block23;
                                                                                }
                                                                                if (this.IllIl != IIIIlIIl.II) break block24;
                                                                                if (lIIllllI.llIllI(minecraftClient) != this.llIII) break block25;
                                                                                if (this.IIlIl.lIl() != orchard.internal.IIIlll.Il) break block26;
                                                                                if (l2 - this.IllI >= 1500L) {
                                                                                    this.IllIl = IIIIlIIl.l;
                                                                                    this.IllI = l2;
                                                                                    this.lIll = l2 + this.lIll(this.IllII);
                                                                                    return;
                                                                                }
                                                                                f = this.IIl.llIIIl(minecraftClient, this.IIIlll, ((Double)this.IlIlI.lIl()).floatValue());
                                                                                if (f != Float.MAX_VALUE) break block27;
                                                                                break block28;
                                                                            }
                                                                            if (l2 < this.lIll) return;
                                                                            if (this.Illll(minecraftClient)) {
                                                                                this.IllIl = IIIIlIIl.l;
                                                                                this.IllI = l2;
                                                                                this.lIll = l2 + this.lIll(this.IllII);
                                                                                return;
                                                                            }
                                                                            break block29;
                                                                        }
                                                                        if (l2 - this.IllI <= 650L) {
                                                                            this.lIll = l2;
                                                                            return;
                                                                        }
                                                                        break block30;
                                                                    }
                                                                    this.IIIIll(l2);
                                                                    return;
                                                                }
                                                                this.IllIl = IIIIlIIl.IlI;
                                                                this.IllI = l2;
                                                                this.lIll = l2;
                                                                return;
                                                            }
                                                            this.lIIIl();
                                                            this.IllIl = IIIIlIIl.l;
                                                            this.IllI = l2;
                                                            this.lIll = l2;
                                                            return;
                                                        }
                                                        this.IIIIll(l2);
                                                        return;
                                                    }
                                                    boolean bl = f <= 2.5f || (hitResult = minecraftClient.crosshairTarget) instanceof BlockHitResult && ShieldBreaker.IIIll(blockHitResult = (BlockHitResult)hitResult, this.IIIlll);
                                                    if (!bl) return;
                                                    this.IllIl = IIIIlIIl.l;
                                                    this.IllI = l2;
                                                    this.lIll = l2 + this.lIll(this.IllII);
                                                    return;
                                                }
                                                if (this.IllIl != IIIIlIIl.l) break block31;
                                                if (this.IIIlI == null) break block32;
                                                if (minecraftClient.world != this.IIIllI) break block33;
                                                break block34;
                                            }
                                            if (this.llII(minecraftClient)) {
                                                this.lIll = l2;
                                                return;
                                            }
                                            if (this.lII) {
                                                if (l2 - this.IllI <= 650L) return;
                                                this.IIIIll(l2);
                                                return;
                                            }
                                            break block35;
                                        }
                                        if (this.lIIIl) break block33;
                                        break block36;
                                    }
                                    if (this.IllIl != IIIIlIIl.IIl) return;
                                    if (l2 < this.lIll) return;
                                    if (!((Boolean)this.IIllI.lIl()).booleanValue()) {
                                        lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
                                        this.IIlI();
                                        return;
                                    }
                                    this.lIlIl(l2);
                                    if (!this.llII(minecraftClient)) break block37;
                                    break block38;
                                }
                                if (l2 < this.lIll) return;
                                if (this.llIl(minecraftClient, this.llIll)) return;
                                if (l2 - this.IllI <= 650L) {
                                    this.lIll = l2 + 15L;
                                    return;
                                }
                                this.IIIIll(l2);
                                return;
                            }
                            if (minecraftClient.player.age <= this.llII) break block39;
                        }
                        this.IIIIll(l2);
                        return;
                    }
                    if (!this.IIIl) return;
                    this.IIIllI();
                    this.lII = false;
                    if (this.IlllI >= 3) {
                        this.IIIIll(l2);
                        return;
                    }
                    this.lIll = l2 + 50L;
                    return;
                }
                this.IIlI();
                return;
            }
            if (l2 - this.IllI <= 650L) {
                this.lIll = l2;
                return;
            }
        }
        this.IlllII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llllI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity == null) {
            return false;
        }
        Vec3d vec3d = livingEntity.getRotationVec(1.0f);
        Vec3d vec3d2 = new Vec3d(vec3d.x, 0.0, vec3d.z);
        Vec3d vec3d3 = new Vec3d(minecraftClient.player.getX() - livingEntity.getX(), minecraftClient.player.getY() - livingEntity.getY(), minecraftClient.player.getZ() - livingEntity.getZ());
        Vec3d vec3d4 = new Vec3d(vec3d3.x, 0.0, vec3d3.z);
        if (vec3d2.lengthSquared() < 1.0E-6) return true;
        if (vec3d4.lengthSquared() < 1.0E-6) {
            return true;
        }
        if (!(vec3d2.normalize().dotProduct(vec3d4.normalize()) > 0.0)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllll() {
        this.IIIllI();
        this.IlllI = 0;
        this.llIII = -1;
        this.lIIIl();
        this.IIIIlI = -1;
        this.IlI = Integer.MIN_VALUE;
        this.IIlII = 0.0f;
        this.IlIl = Vec3d.ZERO;
        this.lII = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) return false;
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (!blockState.getFluidState().isEmpty()) return false;
        if (blockState.isOf(Blocks.WATER)) return false;
        if (blockState.isOf(Blocks.LAVA)) return false;
        if (blockState.isAir()) return true;
        if (blockState.isReplaceable()) return true;
        if (lIIllllI.lIllI(blockState)) return true;
        if (blockState.isOf(Blocks.FIRE)) return true;
        if (blockState.isOf(Blocks.SOUL_FIRE)) return true;
        return false;
    }

    public void IIIIlI(MinecraftClient minecraftClient) {
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIll(long l2) {
        this.lllll();
        this.IllIl = IIIIlIIl.IIl;
        this.IllI = l2;
        this.lIll = l2 + this.lIll(this.Illl);
        this.IIIlIl = this.lllll;
        this.llIl = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlII(MinecraftClient minecraftClient, Vec3d vec3d, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (vec3d == null) return false;
        if (blockPos == null) {
            return false;
        }
        BlockHitResult blockHitResult = minecraftClient.world.raycast(new RaycastContext(minecraftClient.player.getEyePos(), vec3d, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, (Entity)minecraftClient.player));
        if (blockHitResult == null) return false;
        if (!blockHitResult.getBlockPos().equals((Object)blockPos)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if ((Boolean)this.ll.lIl() == false) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (livingEntity == null) {
            return false;
        }
        if (lIIllllI.IIllIl((Entity)livingEntity)) {
            return false;
        }
        if (!this.IIllI()) {
            return false;
        }
        int n = this.llIlI(minecraftClient);
        if (n < 0) {
            return false;
        }
        IIIIIllII iIIIIllII = this.IlllI(minecraftClient, livingEntity);
        if (iIIIIllII == null) {
            return false;
        }
        float[] fArray = IlIlllI.IlIll(minecraftClient, iIIIIllII.I());
        if (fArray != null) {
            this.llIII = n;
            this.IIIIll = iIIIIllII.l();
            this.IIIII = iIIIIllII.I();
            this.IIIlll = iIIIIllII.II();
            this.IIIlII = fArray[0];
            this.III = fArray[1];
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIllI() {
        this.IIIlI = null;
        this.IIIllI = null;
        this.llII = Integer.MIN_VALUE;
        this.lIIIl = false;
        this.IIIl = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockPos IIIlll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        IIIIIllII iIIIIllII = this.IlllI(minecraftClient, livingEntity);
        if (iIIIIllII == null) return null;
        BlockPos blockPos = iIIIIllII.Il();
        return blockPos;
    }

    @Override
    public void llll() {
        this.IIlIl(MinecraftClient.getInstance());
        this.IIl.IlIIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIII(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n >= 9) {
            return false;
        }
        if (lIIllllI.llIllI(minecraftClient) == n && lIIllllI.lll(minecraftClient, n)) {
            this.llIl = null;
            return true;
        }
        if (this.llIl == null || this.llIl.l() != n) {
            this.llIl = lIIllllI.IIIIlII(minecraftClient, this, n, 0, true);
        }
        if (lIIllllI.IIIllll(minecraftClient, this.llIl)) {
            this.llIl = null;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIIl(MinecraftClient minecraftClient, BlockHitResult blockHitResult) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockHitResult == null) return false;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) return false;
        if (!this.IIlIll(minecraftClient, blockHitResult.getBlockPos())) return false;
        if (!this.IIIIIl(minecraftClient, blockHitResult.getBlockPos().offset(blockHitResult.getSide()))) {
            return false;
        }
        double d = Math.max(0.0, minecraftClient.player.getBlockInteractionRange() - 0.1);
        Vec3d vec3d = minecraftClient.player.getEyePos();
        if (vec3d.squaredDistanceTo(blockHitResult.getPos()) > d * d) {
            return false;
        }
        Vec3d vec3d2 = blockHitResult.getPos().subtract(Vec3d.of((Vec3i)blockHitResult.getSide().getVector()).multiply(0.01));
        BlockHitResult blockHitResult2 = lIIllllI.IIIIllI(minecraftClient, (Entity)minecraftClient.player, vec3d, vec3d2);
        if (blockHitResult2 != null) {
            if (blockHitResult2.getType() == HitResult.Type.BLOCK) return ShieldBreaker.IIIll(blockHitResult2, blockHitResult);
        }
        blockHitResult2 = minecraftClient.world.raycast(new RaycastContext(vec3d, vec3d2, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, (Entity)minecraftClient.player));
        return ShieldBreaker.IIIll(blockHitResult2, blockHitResult);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIlI(MinecraftClient minecraftClient) {
        if ((Boolean)this.ll.lIl() == false) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (this.llIII < 0) return false;
        if (this.llIII >= 9) return false;
        if (this.IIIIll == null) return false;
        if (this.IIIII == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIll(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) {
            return false;
        }
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (blockState == null) return false;
        if (blockState.isAir()) return false;
        if (!blockState.getFluidState().isEmpty()) return false;
        if (blockState.isOf(Blocks.WATER)) return false;
        if (blockState.isOf(Blocks.LAVA)) return false;
        if (blockState.getCollisionShape((BlockView)minecraftClient.world, blockPos).isEmpty()) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private List<BlockPos> IIllII(MinecraftClient var1_1, LivingEntity var2_2) {
        block42: {
            block48: {
                block47: {
                    block37: {
                        block38: {
                            block39: {
                                block41: {
                                    block36: {
                                        block43: {
                                            block32: {
                                                block44: {
                                                    block45: {
                                                        block35: {
                                                            block33: {
                                                                block46: {
                                                                    block30: {
                                                                        block31: {
                                                                            block29: {
                                                                                block27: {
                                                                                    block34: {
                                                                                        block40: {
                                                                                            block28: {
                                                                                                break block40;
lbl1:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    var26_24 = var16_14;
                                                                                                    break block27;
                                                                                                    break;
                                                                                                }
lbl4:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    continue;
                                                                                                    break;
                                                                                                }
lbl6:
                                                                                                // 1 sources

                                                                                                while (var5_5.lengthSquared() < 1.0E-6) {
                                                                                                    break block28;
                                                                                                }
                                                                                                break block41;
lbl9:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    if (!var7_7) break block29;
                                                                                                    break block30;
                                                                                                    break;
                                                                                                }
lbl12:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    break block31;
                                                                                                    break;
                                                                                                }
lbl14:
                                                                                                // 3 sources

                                                                                                while (true) {
                                                                                                    v0 = false;
                                                                                                    break block32;
                                                                                                    break;
                                                                                                }
lbl17:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    ++var24_22;
                                                                                                    break block33;
                                                                                                    break;
                                                                                                }
lbl20:
                                                                                                // 1 sources

                                                                                                while (var1_1.player.isSprinting()) {
                                                                                                    break block34;
                                                                                                }
                                                                                                break block42;
lbl23:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    var25_23 = var22_20[var24_22];
                                                                                                    ** continue;
                                                                                                    break;
                                                                                                }
lbl26:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    continue;
                                                                                                    break;
                                                                                                }
lbl28:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    continue;
                                                                                                    break;
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
lbl34:
                                                                                                // 1 sources

                                                                                                return List.of(var2_2.getBlockPos());
lbl36:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    if (!(Math.abs(var2_2.getVelocity().y) > 0.08)) break block35;
                                                                                                    break block36;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            if (var6_6.lengthSquared() < 1.0E-6) {
                                                                                                ** continue;
                                                                                            }
                                                                                            break block41;
                                                                                            var18_16 = (int)Math.floor(Math.min(Math.min(var3_3.minZ, var13_11.minZ), var14_12.minZ)) - 1;
                                                                                            break block43;
                                                                                        }
                                                                                        var3_3 = var2_2.getBoundingBox();
                                                                                        var4_4 = (int)Math.floor(var3_3.minY + 1.0E-4);
                                                                                        break block44;
lbl49:
                                                                                        // 1 sources

                                                                                        while (true) {
                                                                                            var27_25 = var18_16;
                                                                                            break block37;
                                                                                            break;
                                                                                        }
lbl52:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            continue;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    v1 = 0.28;
                                                                                    break block45;
                                                                                    var16_14 = (int)Math.floor(Math.min(Math.min(var3_3.minX, var13_11.minX), var14_12.minX)) - 1;
                                                                                    var17_15 = (int)Math.floor(Math.max(Math.max(var3_3.maxX, var13_11.maxX), var14_12.maxX) - 1.0E-7) + 1;
                                                                                    ** while (true)
lbl60:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        ++var26_24;
                                                                                        break block27;
                                                                                        break;
                                                                                    }
lbl63:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if (var1_1.player.age - this.IlI > 3) ** GOTO lbl14
                                                                                        break block38;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                ** while (var26_24 > var17_15)
lbl68:
                                                                                // 1 sources

                                                                                ** while (true)
                                                                            }
                                                                            v2 = var6_6.multiply(1.2).add(var5_5.multiply(0.65 + var8_8));
                                                                            break block46;
                                                                        }
                                                                        var20_18.sort(Comparator.comparingDouble((ToDoubleFunction<IIIIllIlI>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, l(), (Lorchard/internal/IIIIllIlI;)D)()).reversed().thenComparingDouble((ToDoubleFunction<IIIIllIlI>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, I(), (Lorchard/internal/IIIIllIlI;)D)()));
                                                                        return var20_18.stream().map((Function<IIIIllIlI, BlockPos>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, II(), (Lorchard/internal/IIIIllIlI;)Lnet/minecraft/util/math/BlockPos;)()).toList();
                                                                    }
                                                                    v2 = var6_6.multiply(1.8);
                                                                    break block46;
                                                                    var21_19 = v3;
                                                                    var22_20 = var21_19;
                                                                    var23_21 = var22_20.length;
                                                                    var24_22 = 0;
                                                                    break block33;
                                                                }
                                                                var10_9 = v2;
                                                                ** while (true)
                                                            }
                                                            ** while (var24_22 >= var23_21)
lbl88:
                                                            // 1 sources

                                                            ** while (true)
                                                        }
                                                        v4 = new int[1];
                                                        v3 = v4;
                                                        v4[0] = var4_4;
                                                        ** GOTO lbl30
                                                    }
lbl95:
                                                    // 2 sources

                                                    while (true) {
                                                        var8_8 = v1;
                                                        ** continue;
                                                        break;
                                                    }
lbl98:
                                                    // 2 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl100:
                                                    // 1 sources

                                                    while (true) {
                                                        var15_13 = new Vec3d(var2_2.getX(), (double)var4_4 + 0.5, var2_2.getZ()).add(var10_9);
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                var5_5 = this.llIII(var1_1, var2_2);
                                                var6_6 = this.lIllI(var1_1, var2_2);
                                                ** GOTO lbl6
lbl107:
                                                // 1 sources

                                                while (true) {
                                                    if (var25_23 == var4_4) ** GOTO lbl98
                                                    break block39;
                                                    break;
                                                }
                                            }
lbl111:
                                            // 2 sources

                                            while (true) {
                                                var7_7 = v0;
                                                ** GOTO lbl20
                                                break;
                                            }
                                            var20_18.add(new IIIIllIlI(var28_26, var29_27, Vec3d.ofCenter((Vec3i)var28_26).squaredDistanceTo(var15_13)));
                                            ++var27_25;
                                            break block37;
                                        }
                                        var19_17 = (int)Math.floor(Math.max(Math.max(var3_3.maxZ, var13_11.maxZ), var14_12.maxZ) - 1.0E-7) + 1;
                                        break block47;
lbl121:
                                        // 1 sources

                                        while (true) {
                                            if (this.IlI == -2147483648) ** GOTO lbl14
                                            ** continue;
                                            break;
                                        }
                                    }
lbl125:
                                    // 2 sources

                                    while (true) {
                                        v5 = new int[3];
                                        v5[0] = var4_4;
                                        v5[1] = var4_4 - 1;
                                        v3 = v5;
                                        v5[2] = var4_4 + 1;
                                        ** continue;
                                        break;
                                    }
                                }
                                if (this.IIIIlI == var2_2.getId()) ** break;
                                ** while (true)
                                ** while (true)
                            }
                            var29_27 *= 0.8;
                            ** while (true)
                            var11_10 = var10_9.length();
                            if (!(var11_10 > 2.2)) ** GOTO lbl52
                            break block48;
                        }
                        v0 = true;
                        ** while (true)
                        var13_11 = var3_3.offset(var10_9.x * 0.5, 0.0, var10_9.z * 0.5);
                        var14_12 = var3_3.offset(var10_9.x, 0.0, var10_9.z);
                        ** while (true)
                    }
                    ** while (var27_25 > var19_17)
lbl150:
                    // 1 sources

                    ** while (true)
                }
                var20_18 = new ArrayList<IIIIllIlI>();
                ** while (!var2_2.isOnGround())
lbl154:
                // 1 sources

                ** while (true)
                var28_26 = new BlockPos(var26_24, var25_23, var27_25);
                var29_27 = Math.max(ShieldBreaker.IlIllI(var14_12, var28_26), Math.max(ShieldBreaker.IlIllI(var13_11, var28_26) * 0.95, ShieldBreaker.IlIllI(var3_3, var28_26) * 0.85));
                ** while (true)
            }
            var10_9 = var10_9.multiply(2.2 / var11_10);
            ** while (true)
        }
        v1 = 0.0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIIIIllII IIlllI(MinecraftClient minecraftClient, List<BlockPos> list) {
        BlockPos blockPos;
        IIIIIllII iIIIIllII;
        Iterator<BlockPos> iterator = list.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while ((iIIIIllII = this.I(minecraftClient, blockPos = iterator.next())) == null);
        return iIIIIllII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIII(MinecraftClient minecraftClient, BlockPos blockPos, BlockState blockState) {
        if (!this.IIIlIIl()) return;
        if (minecraftClient == null) return;
        if (minecraftClient.world != this.IIIllI) return;
        if (this.IIIlI == null) return;
        if (blockState == null) return;
        this.lII(blockPos, blockState.isOf(Blocks.COBWEB));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIIl(MinecraftClient minecraftClient) {
        if (((Boolean)this.IIllI.lIl()).booleanValue()) {
            this.lIlIl(System.currentTimeMillis());
        }
        this.llII(minecraftClient);
        this.IIIIIl = false;
        this.IlIIl = 0L;
        this.llIll = null;
        this.IllIl = IIIIlIIl.Ill;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIIll(MinecraftClient minecraftClient, long l2) {
        if ((Boolean)this.IlIII.lIl() == false) return false;
        if (this.IlIlll(minecraftClient, this.llIll)) {
            this.lIlII = this.llIlI;
            this.IllIl = IIIIlIIl.lI;
            this.IllI = l2;
            this.lIll = l2 + this.lIll(this.lIllI);
            this.lIII = 0L;
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIlII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (!this.IIIII(minecraftClient)) {
            return false;
        }
        if (!(livingEntity instanceof PlayerEntity)) return false;
        if (livingEntity == minecraftClient.player) return false;
        if (!livingEntity.isAlive()) return false;
        if (!livingEntity.isBlocking()) return false;
        if (!lIIllllI.lllIlI(livingEntity, minecraftClient.player)) return false;
        if (this.IIlll(minecraftClient, livingEntity)) return true;
        return false;
    }

    private static double IlIllI(Box box, BlockPos blockPos) {
        double d = Math.max(0.0, Math.min(box.maxX, (double)blockPos.getX() + 1.0) - Math.max(box.minX, (double)blockPos.getX()));
        double d2 = Math.max(0.0, Math.min(box.maxZ, (double)blockPos.getZ() + 1.0) - Math.max(box.minZ, (double)blockPos.getZ()));
        return d * d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIlll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (!(livingEntity instanceof PlayerEntity)) return false;
        if (livingEntity == minecraftClient.player) return false;
        if (!livingEntity.isAlive()) return false;
        if (!this.IIlll(minecraftClient, livingEntity)) return false;
        if (!this.llllI(minecraftClient, livingEntity)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllIII(MinecraftClient minecraftClient, LivingEntity livingEntity, long l2) {
        int n;
        block2: {
            block3: {
                IIIIIllII iIIIIllII;
                block5: {
                    block6: {
                        block4: {
                            if (!((Boolean)this.ll.lIl()).booleanValue() || minecraftClient == null || minecraftClient.player == null || livingEntity == null || !livingEntity.isAlive() || lIIllllI.IIllIl((Entity)livingEntity) || !this.IIllI()) break block3;
                            n = this.llIlI(minecraftClient);
                            if (n < 0) break block4;
                            this.lllll();
                            this.llIll = livingEntity;
                            this.llIII = n;
                            this.IIIIlI = livingEntity.getId();
                            this.IIlII = minecraftClient.player.getYaw();
                            this.IlIl = Vec3d.ZERO;
                            this.IlI = Integer.MIN_VALUE;
                            iIIIIllII = this.IlllI(minecraftClient, livingEntity);
                            if (iIIIIllII != null) break block5;
                            break block6;
                        }
                        this.IIIIll(l2);
                        return;
                    }
                    this.lIIIl();
                    this.IIIIll(l2);
                    return;
                }
                this.IIIIll = iIIIIllII.l();
                this.IIIII = iIIIIllII.I();
                this.IIIlll = iIIIIllII.II();
                if (((Boolean)this.IIllI.lIl()).booleanValue()) {
                    this.lIlIl(l2);
                    break block2;
                } else {
                    lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
                }
                break block2;
            }
            this.IIIIll(l2);
            return;
        }
        this.llIl = null;
        boolean bl = lIIllllI.llIllI(minecraftClient) != n;
        this.IllIl = !bl ? IIIIlIIl.II : IIIIlIIl.IlI;
        this.IllI = l2;
        this.lIll = l2 + this.lIll(this.IllII);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IllIlI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (!this.IlII(minecraftClient)) return false;
        if (!this.IlIlII(minecraftClient, livingEntity)) {
            return false;
        }
        if (this.IlIll(minecraftClient, livingEntity)) {
            return false;
        }
        int n = this.IlI(minecraftClient);
        if (n == -1) return false;
        return this.lIl(minecraftClient, livingEntity, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlllII(MinecraftClient minecraftClient) {
        lIIlIllI lIIlIllI2 = (Boolean)this.IIllI.lIl() != false ? lIIlIllI.II : lIIlIllI.Il;
        lIIllllI.llIII(minecraftClient, this, lIIlIllI2);
        this.IIl();
        this.llIl = null;
        this.IIlI();
    }

    private static int IllllI(int n, int n2) {
        return l[n ^ 0xC742D512] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Illlll(int n, int n2, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = c ^ 0x3B6A;
        char[] cArray = IIlIII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIlIIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            ShieldBreaker.IIlIIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7AE1;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 20525;
            n7 += 34569;
            n7 -= 13437;
            n7 -= 20951;
            n7 -= 17285;
            n7 += 44100;
            n7 ^= 0xCEA0;
            n7 -= 24034;
            cArray[n6] = (char)((n7 += 36814) ^ n4 ^ n2 ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

