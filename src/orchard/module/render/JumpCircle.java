/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIIIll
 * Module         : JumpCircle  [RENDER]
 * Description    : Draws a theme-colored circle where you jumped.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Line Width
 *   - .getBytes(
 *   - Duration
 *   - Radius
 *   - Alpha
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
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.render;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIIllIl;
import orchard.internal.IllIlI;
import orchard.internal.lIlIIlI;
import orchard.module.iface.Interface;

@Environment(value=EnvType.CLIENT)
public final class JumpCircle
extends ModuleBase {
    private boolean I;
    private final lIlIIlI l;
    private final lIlIIlI II;
    private static final double Il = 0.035;
    private final lIlIIlI lI;
    private static final int ll = 96;
    private double III;
    private final List<IIIIllIl> IIl;
    private static String[] IlI;
    private final lIlIIlI Ill = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Radius"), 1.15, 0.25, 3.0, 0.05).IIIl("m"));
    private static final int[] lII;
    private static final String[] lIl;
    private static final Object[] llI;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void ll() {
        this.IIl.clear();
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        ClientPlayerEntity clientPlayerEntity = minecraftClient == null ? null : minecraftClient.player;
        this.I = clientPlayerEntity != null && clientPlayerEntity.isOnGround();
        this.III = clientPlayerEntity == null ? 0.0 : clientPlayerEntity.getBoundingBox().minY;
    }

    public JumpCircle() {
        super(StringFactory.IIII("JumpCircle"), Category.l, StringFactory.IIII("Draws a theme-colored circle where you jumped."));
        this.l = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Duration"), 900.0, 250.0, 3000.0, 50.0).IIIl("ms"));
        this.II = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Line Width"), 2.2, 0.5, 5.0, 0.1));
        this.lI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Alpha"), 190.0, 25.0, 255.0, 1.0));
        this.IIl = new ArrayList<IIIIllIl>();
    }

    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0x14A15F29 ^ n;
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
     * Unable to fully structure code
     */
    private void IIl(long var1_1) {
        var3_2 = Math.max(1.0, (Double)this.l.lIl());
        var5_3 = this.IIl.iterator();
        if (true) ** GOTO lbl11
        while (true) {
            block2: {
                block3: {
                    if (!((double)(var1_1 - var5_3.next().I()) > var3_2)) break block2;
                    break block3;
                    return;
                }
                var5_3.remove();
            }
            if (!var5_3.hasNext()) ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color IlI() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        Interface interface_ = clientEntrypoint != null && clientEntrypoint.IlI() != null ? clientEntrypoint.IlI().lIIIII() : null;
        Color color = interface_ == null ? new Color(255, 78, 100, 255) : interface_.IIlll();
        int n = MathHelper.clamp((int)((int)Math.round((Double)this.lI.lIl())), (int)0, (int)255);
        return new Color(color.getRed(), color.getGreen(), color.getBlue(), n);
    }

    private static void lII() {
        JumpCircle.IlI[0] = JumpCircle.lI(JumpCircle.lll('\u5113', 559369102, '\u2a31').toCharArray(), 41877L, 2021130307);
        JumpCircle.IlI[1] = JumpCircle.lI(JumpCircle.lll('\u158b', -1314124513, '\u2a30').toCharArray(), 11373L, -1476747121);
        JumpCircle.IlI[2] = JumpCircle.lI(JumpCircle.lll('\uc20a', 748552962, '\u2a33').toCharArray(), 94975L, -1686084307);
        JumpCircle.IlI[3] = JumpCircle.lI(JumpCircle.lll('\u5e59', -1771013508, '\u2a32').toCharArray(), 89123L, 1830745474);
        JumpCircle.IlI[4] = JumpCircle.lI(JumpCircle.lll('\ufd53', -840824763, '\u2a35').toCharArray(), 3464L, -501911239);
        JumpCircle.IlI[5] = JumpCircle.lI(JumpCircle.lll('\ud14a', -1135772666, '\u2a34').toCharArray(), 53546L, -632439762);
        JumpCircle.IlI[6] = JumpCircle.lI(JumpCircle.lll('\ud747', 80105445, '\u2a37').toCharArray(), 19369L, 611834654);
        JumpCircle.IlI[7] = JumpCircle.lI(JumpCircle.lll('\udc8c', 1985759191, '\u2a36').toCharArray(), 78919L, -1388020146);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Ill(II iI) {
        if (!IllIlI.lIIll(iI)) {
            return;
        }
        long l2 = System.currentTimeMillis();
        this.IIl(l2);
        if (this.IIl.isEmpty()) {
            return;
        }
        Color color = this.IlI();
        double d = Math.max(1.0, (Double)this.l.lIl());
        double d2 = (Double)this.Ill.lIl();
        double d3 = (Double)this.lI.lIl();
        float f = ((Double)this.II.lIl()).floatValue();
        Iterator<IIIIllIl> iterator = this.IIl.iterator();
        while (iterator.hasNext()) {
            IIIIllIl iIIIllIl = iterator.next();
            double d4 = MathHelper.clamp((double)((double)(l2 - iIIIllIl.I()) / d), (double)0.0, (double)1.0);
            double d5 = 1.0 - Math.pow(1.0 - d4, 3.0);
            double d6 = d2 * (0.28 + d5 * 0.72);
            double d7 = d3 * Math.pow(1.0 - d4, 1.35);
            float f2 = Math.max(0.5f, (float)((double)f * (1.0 - d4 * 0.3)));
            IllIlI.IIl(iI, iIIIllIl.l(), d6, 96, color, d7, f2);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block28: {
            block26: {
                block27: {
                    block30: {
                        block29: {
                            block25: {
                                var6 = 16443;
                                break block29;
lbl3:
                                // 1 sources

                                while (true) {
                                    var4_15 = 0;
                                    break block25;
                                    break;
                                }
lbl6:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl8:
                                // 1 sources

                                while (var13_11 == 0) {
                                    break block26;
                                }
                                break block30;
lbl11:
                                // 1 sources

                                while (true) {
                                    v0 = 19;
                                    ** GOTO lbl92
                                    break;
                                }
lbl14:
                                // 1 sources

                                while (true) {
                                    v0 = 66;
                                    ** GOTO lbl92
                                    break;
                                }
lbl17:
                                // 1 sources

                                while (true) {
                                    var12_10 = 0;
                                    ** GOTO lbl8
                                    break;
                                }
lbl20:
                                // 2 sources

                                while (true) {
                                    var10_8 = 0;
                                    break block27;
                                    break;
                                }
                            }
                            while (true) {
                                var5_16 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                                ** GOTO lbl95
                                break;
                            }
                        }
                        var7_5 = "\uc8fd\u394b\u30db\u0d10\u6418\ud483\ue3dc\u37d9\u5663\u0c29\u6c5e\u8bcd\ufe84\u3342\ueb10\uf925\ua6b7\u7e5f\u2d49\u459e\u9887\u5a45\u835a\uc1ff\u1996\ue18b\uc987\uf5a1\u66fd\u7b4c\u6db1\u85b7\u9706\u8537\u0fd3\u17b9\uda06\u7090\u943a\u29c6\u93c4\u2b6a\uc9d9\u4c69\u8897\u69fa\u2f4f\u4392\u7644\u92cf\uaa2d\u3ef0\u6430\uc57f\uf895\u750a\u7acd\u6a06\udf4d\uafe0\u047c\u28d0\u4add\u62c8\u19f9\u0f9a\ue36f\u6c98\u9026\u9115\ucbd1\u1fef\u5abf\u63cc\ud2ea\u06ec\u9967\uf5fd\u9e90\ufdfe\u1d73\ufff3\u6140\ufc0e\uc086\u11b0\u6840\u89d6\uacbe\u754d\uc264\u11a6\u4b62\u1cd3\u3f99\u626b\u0c66\uf172\u9df7\uc895\u6f58\u6149\u2561\u2bb2\u71de\u2150\u5b73\ue0d2\ud2e6\ub231\u41ee\u8ff8\u0445\ue9a6\u110e\u00f7\u28f5\u7edf\u7d15\u45ae\ua6ef\ueeac\uff5c\u1df2\u33ac\u98ef\u0aa3\u8afd\ube2a\u905f\u2a8e\u4d40";
                        ** GOTO lbl86
                        var0_1 = "z\u00f9oP)azl\u0015oD\u0097D\u00cc?\u00f9\u001a\u00ba\u00bd56\u0010\u00e5$l\u0085\u00f4v\u00fa@Q]\u00a4\u0093\u00bf\u00d7\u0003\u00f5\u0095[\u00ae\u0085s\u0083\u00ef^\u00cd\u008fm\u00ac@Q%\u0092\u00ect\u00c0\u00b3\u0086\u00aa}F\u008a\u00ed\u00d6\u008c+|\u00f8in\u00c8\u0005F\u00c4\u00fd\u0088\u00e9\u008d\u0092v\u00fd\u001e(".getBytes("ISO-8859-1");
                        var1_2 = var0_1.length / 4;
                        ** GOTO lbl98
                    }
                    while (true) {
                        var12_10 = var8_6[var10_8] ^ var6;
                        ** GOTO lbl81
                        break;
                    }
                }
                var11_9 = 0;
                ** while (true)
lbl40:
                // 1 sources

                while (true) {
                    v1 = var15_13++;
                    var14_12[v1] = (char)(var14_12[v1] ^ var16_14);
                    if (true) ** GOTO lbl78
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    var3_4 += 4;
                    if (++var4_15 < var1_2) ** continue;
                    ** GOTO lbl89
                    break;
                }
lbl48:
                // 1 sources

                while (true) {
                    v0 = 115;
                    ** GOTO lbl92
                    break;
                }
            }
            JumpCircle.lIl = var9_7;
            JumpCircle.llI = new Object[var9_7.length];
            ** GOTO lbl84
lbl55:
            // 1 sources

            while (true) {
                var13_11 = -1;
                ** GOTO lbl20
                break;
            }
            block19: while (true) {
                switch (var15_13 % 5) {
                    case 2: {
                        ** continue;
                    }
                    case 4: {
                        ** continue;
                    }
                    default: {
                        ** continue;
                    }
lbl66:
                    // 1 sources

                    while (true) {
                        if (var15_13 < var14_12.length) continue block19;
                        ** GOTO lbl79
                        break;
                    }
lbl69:
                    // 1 sources

                    while (true) {
                        var13_11 = 0;
                        ** continue;
                        break;
                    }
lbl72:
                    // 1 sources

                    while (true) {
                        var11_9 += var12_10;
                        ** GOTO lbl97
                        break;
                    }
lbl75:
                    // 1 sources

                    while (true) {
                        if (++var10_8 < var8_6.length) ** continue;
                        ** continue;
                        break;
                    }
lbl78:
                    // 1 sources

                    ** continue;
lbl79:
                    // 1 sources

                    var9_7[var10_8] = new String(var14_12).intern();
                    ** continue;
lbl81:
                    // 1 sources

                    var14_12 = var7_5.substring(var11_9, var11_9 + var12_10).toCharArray();
                    var15_13 = 0;
                    continue block19;
lbl84:
                    // 1 sources

                    var2_3 = 757646424;
                    ** continue;
lbl86:
                    // 1 sources

                    var8_6 = "\u4033\u403f\u407b\u402b\u403f\u402b\u4033\u4037".toCharArray();
                    var9_7 = new String[var8_6.length];
                    ** continue;
lbl89:
                    // 1 sources

                    JumpCircle.IlI = new String[8];
                    JumpCircle.lII();
                    return;
lbl92:
                    // 5 sources

                    while (true) {
                        var16_14 = v0;
                        ** continue;
                        break;
                    }
lbl95:
                    // 1 sources

                    JumpCircle.lII[var4_15] = var5_16 ^= var2_3;
                    ** continue;
lbl97:
                    // 1 sources

                    ** continue;
lbl98:
                    // 1 sources

                    JumpCircle.lII = new int[var1_2];
                    break block28;
                    case 1: {
                        v0 = 106;
                        ** GOTO lbl92
                    }
                    case 3: 
                }
                break;
            }
            v0 = 86;
            ** while (true)
        }
        var3_4 = 0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        boolean bl;
        block3: {
            ClientPlayerEntity clientPlayerEntity;
            block2: {
                block1: {
                    MinecraftClient minecraftClient = MinecraftClient.getInstance();
                    clientPlayerEntity = minecraftClient == null ? null : minecraftClient.player;
                    if (clientPlayerEntity == null || minecraftClient.world == null) break block1;
                    bl = clientPlayerEntity.isOnGround();
                    if (!bl) break block2;
                    this.III = clientPlayerEntity.getBoundingBox().minY;
                    break block3;
                }
                this.IIl.clear();
                this.I = false;
                return;
            }
            if (this.I && clientPlayerEntity.getVelocity().y > 0.08) {
                this.IIl.add(new IIIIllIl(new Vec3d(clientPlayerEntity.getX(), this.III + 0.035, clientPlayerEntity.getZ()), System.currentTimeMillis()));
            }
        }
        this.I = bl;
        this.IIl(System.currentTimeMillis());
    }

    @Override
    public void llll() {
        this.IIl.clear();
        this.I = false;
        this.III = 0.0;
    }

    private static int lIl(int n, int n2) {
        return lII[n ^ 0x6740DD2B] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lll(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0x2A31;
        char[] cArray = lIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llI[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            JumpCircle.llI[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6D06;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 20364;
            n6 -= 24147;
            n6 += 21167;
            n6 -= 38521;
            n6 ^= 0x580C;
            n6 -= 42991;
            n6 -= 63329;
            cArray[n5] = (char)((n6 ^= 0xD918) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

