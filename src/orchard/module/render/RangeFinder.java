/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllIIIl
 * Module         : RangeFinder  [RENDER]
 * Description    : Draws a 3 block foot circle and warns when opponents enter it.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Distance Mode
 *   - .getBytes(
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.render;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IlIlIIl;
import orchard.internal.IllIlI;
import orchard.internal.lIIllllI;
import orchard.internal.lIllIlIl;
import orchard.module.iface.Interface;

@Environment(value=EnvType.CLIENT)
public final class RangeFinder
extends ModuleBase {
    private static final int I = 96;
    private static String[] l;
    private static final double II = 3.0;
    private final IIIIIIIIl<IlIlIIl> Il = this.IIlllIl(new IIIIIIIIl<IlIlIIl>((Object)"Distance Mode", IlIlIIl.class, IlIlIIl.l));
    private static final int[] lI;
    private static final String[] ll;
    private static final Object[] III;

    /*
     * Unable to fully structure code
     */
    private boolean I(MinecraftClient var1_1, Vec3d var2_2, float var3_3) {
        block8: {
            block13: {
                block10: {
                    block9: {
                        block6: {
                            block7: {
                                block12: {
                                    block11: {
                                        if (ClientEntrypoint.lII() != null) break block11;
                                        break block12;
lbl3:
                                        // 2 sources

                                        while (true) {
                                            var4_4 = v0;
                                            var5_5 = var1_1.world.getPlayers().iterator();
                                            break block6;
                                            break;
                                        }
                                    }
                                    v0 = ClientEntrypoint.lII().IlI().IIllIII();
                                    ** GOTO lbl3
                                    while (true) {
                                        var7_7 = IllIlI.IIlIlI((Entity)var6_6, var3_3);
                                        var8_8 = var6_6.getBoundingBox().offset(var7_7.x - var6_6.getX(), var7_7.y - var6_6.getY(), var7_7.z - var6_6.getZ());
                                        if (this.Il.lIl() != IlIlIIl.l) break block7;
                                        break block8;
                                        break;
                                    }
lbl15:
                                    // 2 sources

                                    while (true) {
                                        var9_9 = v1;
                                        if (!var9_9) break block6;
                                        break block9;
lbl19:
                                        // 1 sources

                                        while (true) {
                                            if (var4_4 == null || !var4_4.I(var6_6)) ** continue;
                                            break block6;
                                            break;
                                        }
                                        break;
                                    }
                                }
                                v0 = null;
                                ** while (true)
lbl25:
                                // 1 sources

                                while (true) {
                                    var6_6 = (PlayerEntity)var5_5.next();
                                    if (var6_6 == var1_1.player) break block6;
                                    break block10;
                                    break;
                                }
                            }
                            v1 = lIllIlIl.IllI(var2_2.x, var2_2.z, 3.0, var7_7.x, var7_7.z);
                            ** GOTO lbl15
                        }
lbl33:
                        // 2 sources

                        while (var5_5.hasNext()) {
                            ** continue;
lbl35:
                            // 1 sources

                            ** GOTO lbl25
                        }
                        break block13;
                    }
                    return true;
                }
                ** while (var6_6.isAlive())
lbl41:
                // 1 sources

                ** GOTO lbl33
            }
            return false;
        }
        v1 = lIllIlIl.lII(var2_2.x, var2_2.z, 3.0, var8_8.minX, var8_8.minZ, var8_8.maxX, var8_8.maxZ);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color lI() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        Interface interface_ = clientEntrypoint != null && clientEntrypoint.IlI() != null ? clientEntrypoint.IlI().lIIIII() : null;
        Color color = interface_ == null ? new Color(10, 132, 255) : interface_.lIlI();
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), 255);
    }

    private static void IIl() {
        RangeFinder.l[0] = RangeFinder.IlI(RangeFinder.IIII(-698647737, 1909850848).toCharArray(), 27216L, -958947812);
        RangeFinder.l[1] = RangeFinder.IlI(RangeFinder.IIII(-698647738, 103951940).toCharArray(), 91072L, -227835624);
        RangeFinder.l[2] = RangeFinder.IlI(RangeFinder.IIII(-698647739, 834882978).toCharArray(), 14820L, 832374360);
    }

    private static String IlI(char[] cArray, long l2, int n) {
        int n2 = 0xBE50A935 ^ n;
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
    public void Ill(II iI) {
        Vec3d vec3d;
        Vec3d vec3d2;
        float f;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.world == null) return;
        if (IllIlI.lIIll(iI)) {
            f = lIIllllI.IlIIII(minecraftClient);
            vec3d2 = IllIlI.IIlIlI((Entity)minecraftClient.player, f);
            vec3d = new Vec3d(vec3d2.x, vec3d2.y + 0.04, vec3d2.z);
        } else {
            return;
        }
        boolean bl = this.I(minecraftClient, vec3d2, f);
        Color color = bl ? this.lII() : this.lI();
        IllIlI.IIl(iI, vec3d, 3.0, 96, color, 235.0, 3.0f);
        IllIlI.lIlII(iI, vec3d, 3.0, 96, color, 235.0, 3.0f, false, n -> true);
    }

    private Color lII() {
        Color color = this.lI();
        return new Color(255 - color.getRed(), 255 - color.getGreen(), 255 - color.getBlue());
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 28866;
        var7_2 = "\udef6\u524e\u5a88\u3b13\u559e\u2853\u8a0f\u94f6\ubb06\u9795\u0661\u6901\u6e1e\ua70d\u3900\uffa9\u88d8\ue509\uc633\u2553\ue9c4\u4707\u7ff3\u6506\ua020\uf38b\u7315\u9024\uc847\u506c\u1ba2\u90da\u84eb\u3403\uf3c0\u63b2\ue03c\u0e97\u50a8\uff97\u6d7f\uaa63\u1abd\u666f\uce07\u3b9c\ueb54\ubcac\u8b45\uafba\ueac1\u8005\uec61\u3122\uf411\u4115\uf087\u4cba\uca1b\u1c49\u347b\u3117\ucbde\u989b\u1753\u1afc\uea13\u070a\ud2e6\u60b0\u56cd\uc72c\u4985\u629f\u8f97\u66d6\u05db\ucdbd\ua133\u18cb\ua05f\ud463\u0149\u64c3\u072a\u28c1\udfc7\u6e8d\u5351\ucf40\uea34\u5f40\uaa02\ua099\ufba5\uc92c\ub163\u6c7b\u6e47\ua47f\u89bd\ub426\uc7ee\u3354\u79fc\u7f4a\u739d\u0e25\u27f4\ufc83\ub285\uf2a3\u16e5\u1542\u3d15\u5531\u34af\uca3b\u3c74\u3b97";
        var8_3 = "\u7096\u70d6\u70d2".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl54
        while (true) {
            var12_7 = 0;
            if (var13_8 == 0) {
                RangeFinder.ll = var9_4;
                RangeFinder.III = new Object[var9_4.length];
                var2_12 = 376872244;
                var0_11 = "\u0007\u009ea\u00d3\u00dcK\u00b1o4\u0006\u00f0\u00ecr\u001f\u00b2'P\u00ec\u0004t3\u001b\u0092n\u00b2k2lP}[\u008e\u009c\u00cc\u00de\u00bf\u00ad\u00c9\u00b7\b\u00cedq\u0096#T}\u00c9\t\u00df\u001a\u0083xq\u00d9\u00af".getBytes("ISO-8859-1");
                var1_13 = var0_11.length / 4;
                RangeFinder.lI = new int[var1_13];
                var3_14 = 0;
                var4_15 = 0;
                do {
                    var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                    RangeFinder.lI[var4_15] = var5_16 ^= var2_12;
                    var3_14 += 4;
                } while (++var4_15 < var1_13);
                RangeFinder.l = new String[3];
                RangeFinder.IIl();
                return;
            }
            do {
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                do {
                    switch (var15_10 % 5) {
                        case 2: {
                            v0 = 53;
                            break;
                        }
                        case 3: {
                            v0 = 123;
                            break;
                        }
                        case 4: {
                            v0 = 64;
                            break;
                        }
                        default: {
                            v0 = 37;
                            break;
                        }
                        case 1: {
                            v0 = 36;
                        }
                    }
                    var16_1 = v0;
                    v1 = var15_10++;
                    var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                } while (var15_10 < var14_9.length);
                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
            } while (++var10_5 < var8_3.length);
            var13_8 = 0;
lbl54:
            // 2 sources

            var10_5 = 0;
            var11_6 = 0;
        }
    }

    public RangeFinder() {
        super(StringFactory.IIII("RangeFinder"), Category.l, StringFactory.IIII("Draws a 3 block foot circle and warns when opponents enter it."));
    }

    private static int lll(int n, int n2) {
        return lI[n ^ 0x51DA9BCC] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String IIII(int var0, int var1_1) {
        var3_2 = var0 ^ -698647737;
        var4_4 = RangeFinder.ll[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])RangeFinder.III[var3_2];
        if (var2_3 == null) {
            var5_5 = new Throwable().getStackTrace();
            RangeFinder.III[var3_2] = var5_5;
        } else {
            var5_5 = var2_3;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 1498151120;
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
                case 17: {
                    var9_9 = 182;
                    continue block33;
                }
                case 22: {
                    var9_9 = 243;
                    continue block33;
                }
                case 29: {
                    var9_9 = 226;
                    continue block33;
                }
                case 5: {
                    var9_9 = 11;
                    continue block33;
                }
                case 15: {
                    var9_9 = 48;
                    continue block33;
                }
                case 24: {
                    var9_9 = 125;
                    continue block33;
                }
                case 21: {
                    var9_9 = 241;
                    continue block33;
                }
                case 6: {
                    var9_9 = 71;
                    continue block33;
                }
                case 19: {
                    var9_9 = 79;
                    continue block33;
                }
                case 18: {
                    var9_9 = 175;
                    continue block33;
                }
                case 2: {
                    var9_9 = 44;
                    continue block33;
                }
                case 14: {
                    var9_9 = 58;
                    continue block33;
                }
                case 25: {
                    var9_9 = 86;
                    continue block33;
                }
                case 12: {
                    var9_9 = 82;
                    continue block33;
                }
                case 30: {
                    var9_9 = 135;
                    continue block33;
                }
                case 3: {
                    var9_9 = 148;
                    continue block33;
                }
                case 8: {
                    var9_9 = 130;
                    continue block33;
                }
                case 20: {
                    var9_9 = 248;
                    continue block33;
                }
                default: {
                    var9_9 = 152;
                    continue block33;
                }
                case 28: {
                    var9_9 = 67;
                    continue block33;
                }
                case 7: {
                    var9_9 = 9;
                    continue block33;
                }
                case 16: {
                    var9_9 = 212;
                    continue block33;
                }
                case 31: {
                    var9_9 = 91;
                    continue block33;
                }
                case 10: {
                    var9_9 = 193;
                    continue block33;
                }
                case 4: {
                    var9_9 = 189;
                    continue block33;
                }
                case 23: {
                    var9_9 = 221;
                    continue block33;
                }
                case 26: {
                    var9_9 = 150;
                    continue block33;
                }
                case 11: {
                    var9_9 = 234;
                    continue block33;
                }
                case 27: {
                    var9_9 = 65;
                    continue block33;
                }
                case 9: {
                    var9_9 = 75;
                    continue block33;
                }
                case 1: {
                    var9_9 = 79;
                    continue block33;
                }
                case 13: 
            }
            var9_9 = 132;
        }
    }
}

