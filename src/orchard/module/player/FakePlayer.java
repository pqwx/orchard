/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllllIlI
 * Module         : FakePlayer  [PLAYER]
 * Description    : Spawns a fake player for testing combat and render modules.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Copy Inventory
 *   - Extra Spawn
 *   - Testificate_
 *   - .getBytes(
 *   - Invisible
 *   - Health
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
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.entity.player.PlayerEntity
 */
package orchard.module.player;

import java.util.ArrayDeque;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.player.PlayerEntity;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIllIlll;
import orchard.internal.lIIllII;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class FakePlayer
extends ModuleBase {
    private boolean I;
    private final ArrayDeque<IIIllIlll> l;
    private final lIIllII II = this.IIlllIl(new lIIllII(StringFactory.IIII("Extra Spawn")));
    private final llIll Il = this.IIlllIl(new llIll((Object)StringFactory.IIII("Copy Inventory"), true));
    private final lIlIIlI lI;
    private final llIll ll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Invisible"), false));
    private static String[] III;
    private static final int[] IIl;
    private static final String[] IlI;
    private static final Object[] Ill;

    private static void lI() {
        FakePlayer.III[0] = FakePlayer.IlI(FakePlayer.lIl(-977897316, '\u7b11', '\uf22b').toCharArray(), 98389L, -1678000209);
        FakePlayer.III[1] = FakePlayer.IlI(FakePlayer.lIl(-739410671, '\u80ea', '\uf22a').toCharArray(), 28673L, 928689736);
        FakePlayer.III[2] = FakePlayer.IlI(FakePlayer.lIl(1505576308, '\u3bea', '\uf229').toCharArray(), 98778L, 867837643);
        FakePlayer.III[3] = FakePlayer.IlI(FakePlayer.lIl(-1248317492, '\u4279', '\uf228').toCharArray(), 53560L, -1649872677);
        FakePlayer.III[4] = FakePlayer.IlI(FakePlayer.lIl(-2122174704, '\ue34c', '\uf22f').toCharArray(), 26821L, -50893693);
        FakePlayer.III[5] = FakePlayer.IlI(FakePlayer.lIl(1669881528, '\uc0df', '\uf22e').toCharArray(), 69489L, -1019590638);
        FakePlayer.III[6] = FakePlayer.IlI(FakePlayer.lIl(-1285075404, '\u5526', '\uf22d').toCharArray(), 25441L, 1462766579);
        FakePlayer.III[7] = FakePlayer.IlI(FakePlayer.lIl(-926253172, '\u7174', '\uf22c').toCharArray(), 86091L, 344517891);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(String string) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player != null && minecraftClient.world != null) {
            IIIllIlll iIIllIlll = new IIIllIlll((PlayerEntity)minecraftClient.player, string, ((Double)this.lI.lIl()).floatValue(), (Boolean)this.Il.lIl(), (Boolean)this.ll.lIl());
            iIIllIlll.I();
            this.l.add(iIIllIlll);
            return;
        }
        this.IIlIIll(false);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block15: {
                block16: {
                    block17: {
                        block14: {
                            block13: {
                                break block15;
lbl1:
                                // 1 sources

                                while (true) {
                                    continue;
lbl3:
                                    // 1 sources

                                    while (true) {
                                        var13_7 = 0;
                                        break block12;
                                        break;
                                    }
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

                                while (true) {
                                    continue;
                                    break;
                                }
lbl10:
                                // 2 sources

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
                                    break block13;
                                    break;
                                }
lbl16:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl18:
                                // 1 sources

                                while (true) {
                                    var13_7 = -1;
                                    break block12;
                                    break;
                                }
lbl21:
                                // 1 sources

                                while (true) {
                                    var3_11 += 4;
                                    if (++var4_12 < var1_10) ** GOTO lbl10
                                    break block14;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var4_12 = 0;
                                    ** continue;
                                    break;
                                }
                                var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                                var11_5 += var12_6;
                                ** while (true)
                                FakePlayer.Ill = new Object[var9_3.length];
                                var2_8 = -583196297;
                                ** while (true)
                                var12_6 = 0;
                                if (var13_7 != 0) break block16;
                                break block17;
                                var0_9 = "\u0085\u00a9\u00cc\u00ab\n\u0007\u0084mn\fm\u00ac\u0089dC7le\u00fd\u00fc\u00ce\u00c6O\u00f1\u000f\u00d2\u001c\u00c2S\u0006\u00f3\u00c1|\u001cE3\u001d\r\u0017\u0004\u00f5\u00e8\u00c4\u00c8[\u009a\u0099\u00fd\u0095(\u00df-\u00e2\u00d1\u00f3Z\u00ebE\u00f3=".getBytes("ISO-8859-1");
                                var1_10 = var0_9.length / 4;
                                ** while (true)
                            }
                            if (++var10_4 >= var8_2.length) {
                                ** continue;
                            }
                            break block16;
                        }
                        FakePlayer.III = new String[8];
                        FakePlayer.lI();
                        return;
                    }
                    FakePlayer.IlI = var9_3;
                    ** while (true)
                    FakePlayer.IIl = new int[var1_10];
                    var3_11 = 0;
                    ** while (true)
                }
                var12_6 = var8_2[var10_4] ^ var6;
                ** while (true)
            }
            var6 = 13299;
            var7_1 = "\ub976\udb4e\u5bd0\u87fe\uba3e\u6e88\ue950\u9fb0\u16a0\ufa7e\ue7cd\u1c21\u2277\uc158\u993e\ud24b\u942b\ufc55\u543f\u5af7\ucdd3\u9dca\u0b49\u9c62\uee88\u1ba0\u55f8\uc3b8\u7d22\u2622\uf32d\u8dc1\u6de9\udeb8\ube8f\u651b\u2ae6\u0c7d\u2ef7\u440b\ud8b9\udd2a\uafa3\u5fb1\u7dbd\u5305\u14ae\u6141\u5f6f\u7c9b\u5e23\ua635\u684d\udda9\u0bac\uf83b\u7140\ubd04\ua625\u1d0b\uff58\u79f5\ue25d\u9239\u8ba1\ucbfa\u1fb2\ucd6f\uabaf\u5c01\u8661\u8405\u107b\u4a70\u883b\u3fe1\uaf09\u4b58\ucfdd\u09a8\ueaed\u598a\uad73\u4052\u58de\ucf7e\uda9c\u66f4\u7730\uadc8\u9022\u04a3\uc1f0\u3d1e\ub131\u8656\u7a33\u865e\u0a72\u5481\ud7f2\uf3d8\u581b\u1051\u1d36\ucf66\u7cd3\ueaec\uba44\ud79d\ud7ee\uaafc\u4884\ue224\u9dc7\uc42d\uca4a\u2d0a\ucd5a\u9f97\ua4f8\u0b60\ue4dc\u6daf\u8ca3\ue136\u461d\uc237\ud08d\u7511\ud1a3\uf300\u68f0\u69a5\u41c1\ua477\udb07\ub4f0\uac46\ue5b5\u924c\u9de6\u2209\u7e92\uc520\u6864\udc30\u0f9f\ub1f9\u6b53\u132b\u9483\u4e7e\ub6fe\u9b28\u7752\u6b83\u076e\u2761\uce51\u1e74\u44d7\u3a62\ue29b\ud4b0\u307b\u3c0d\u5c85\u4205\u25da\ued16\ube14\ue9ec\ubb21\u997c\u7a8f\u59db\u694f\ua891\u6ef9\ub108\u74df\ue028\udee1\uf819\u5856\ua3bf\ubc65";
            var8_2 = "\u33e7\u33e3\u33e7\u33ff\u33e3\u33a3\u33e3\u33fb".toCharArray();
            var9_3 = new String[var8_2.length];
            ** while (true)
            var5_13 = (var0_9[var3_11] & 255) << 24 | (var0_9[var3_11 + 1] & 255) << 16 | (var0_9[var3_11 + 2] & 255) << 8 | var0_9[var3_11 + 3] & 255;
            FakePlayer.IIl[var4_12] = var5_13 ^= var2_8;
            ** while (true)
        }
        var10_4 = 0;
        var11_5 = 0;
        ** while (true)
    }

    private static String IlI(char[] cArray, long l2, int n) {
        int n2 = 0x6B1C20CF ^ n;
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

    @Override
    public void llll() {
        while (true) {
            IIIllIlll iIIllIlll;
            if (!this.l.isEmpty()) {
                iIIllIlll = this.l.pollFirst();
                if (iIIllIlll == null) continue;
            } else {
                this.I = false;
                return;
            }
            iIIllIlll.Il();
        }
    }

    @Override
    public void ll() {
        this.l.clear();
        this.IIl("Testificate_0");
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        InputUtil.Key key = (InputUtil.Key)this.II.lIl();
        boolean bl = this.IIIlIIl() && !lIIllllI.IlIIlll(key) && lIIllllI.llI(MinecraftClient.getInstance(), key);
        if (bl && !this.I) {
            int n = this.l.size();
            String string = "Testificate_";
            this.IIl(string + n);
        }
        this.I = bl;
    }

    public FakePlayer() {
        super(StringFactory.IIII("FakePlayer"), Category.IIl, StringFactory.IIII("Spawns a fake player for testing combat and render modules."));
        this.lI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Health"), 20.0, 1.0, 40.0, 1.0));
        this.l = new ArrayDeque();
    }

    private static int lII(int n, int n2) {
        return IIl[n ^ 0x69E4754A] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIl(int n, char c, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0xF22B;
        char[] cArray = IlI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Ill[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            FakePlayer.Ill[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x494A;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xB79;
            n6 += 15449;
            n6 -= 47879;
            n6 ^= 0x84D0;
            n6 ^= 0x5F57;
            n6 ^= 0xC30D;
            n6 ^= 0x6FF3;
            n6 ^= 0x5AF0;
            n6 ^= 0xED51;
            cArray[n5] = (char)((n6 += 47816) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

