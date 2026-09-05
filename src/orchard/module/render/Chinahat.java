/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIIIl
 * Module         : Chinahat  [RENDER]
 * Description    : Draws a cone hat on player heads.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Outline Color
 *   - Outline Alpha
 *   - Head Offset
 *   - Show Others
 *   - Color Sync
 *   - Fill Color
 *   - Fill Alpha
 *   - Line Width
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
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.render;

import java.awt.Color;
import java.util.Iterator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.core.Theme;
import orchard.internal.II;
import orchard.internal.IllIlI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlIllI;
import orchard.internal.llIlIlII;
import orchard.internal.llIll;
import orchard.internal.lllIIII;

@Environment(value=EnvType.CLIENT)
public final class Chinahat
extends ModuleBase {
    private final llIll I;
    private final llIlIlII l;
    private final lIlIIlI II;
    private final lIlIIlI Il;
    private final lIlIIlI lI;
    private final llIll ll;
    private final lIlIIlI III;
    private final lIlIIlI IIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Radius"), 0.55, 0.25, 1.2, 0.01).IIIl("m"));
    private static String[] IlI;
    private final llIlIlII Ill;
    private final lIlIIlI lII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Height"), 0.31, 0.05, 0.8, 0.01).IIIl("m"));
    private final llIll lIl;
    private static final int[] llI;
    private static final String[] lll;
    private static final Object[] IIII;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Ill(II iI) {
        if (!this.IIIlIIl()) return;
        if (!IllIlI.lIIll(iI)) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.world == null) return;
        if (minecraftClient.player == null) {
            return;
        }
        float f = lIIllllI.IlIIII(minecraftClient);
        if (((Boolean)this.I.lIl()).booleanValue() && !minecraftClient.options.getPerspective().isFirstPerson()) {
            this.IlI(iI, (PlayerEntity)minecraftClient.player, f, 0.0);
        }
        if ((Boolean)this.ll.lIl() == false) return;
        Iterator iterator = minecraftClient.world.getPlayers().iterator();
        while (iterator.hasNext()) {
            PlayerEntity playerEntity = (PlayerEntity)iterator.next();
            if (playerEntity == minecraftClient.player || !IllIlI.IIIII(minecraftClient, playerEntity)) continue;
            this.IlI(iI, playerEntity, f, (double)playerEntity.getId() * 0.113);
        }
    }

    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0x720BDAD4 ^ n;
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

    private Vec3d IIl(Vec3d vec3d, double d, int n, int n2) {
        double d2 = Math.PI * 2 * (double)n / (double)n2;
        return vec3d.add(Math.cos(d2) * d, 0.0, Math.sin(d2) * d);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI(II iI, PlayerEntity playerEntity, float f, double d) {
        if (playerEntity == null) return;
        if (!playerEntity.isAlive()) return;
        if (playerEntity.isSpectator()) {
            return;
        }
        Vec3d vec3d = IllIlI.IIlIlI((Entity)playerEntity, f).add(0.0, (double)playerEntity.getStandingEyeHeight() + (Double)this.II.lIl() - (playerEntity.isSneaking() ? 0.08 : 0.0), 0.0);
        double d2 = (Double)this.IIl.lIl();
        double d3 = (Double)this.lII.lIl();
        Vec3d vec3d2 = vec3d.add(0.0, d3, 0.0);
        int n = 96;
        Color color = this.lIl(d);
        Color color2 = this.lII(d + 0.17);
        Vec3d vec3d3 = this.IIl(vec3d, d2, 0, n);
        int n2 = 1;
        while (n2 <= n) {
            Vec3d vec3d4 = this.IIl(vec3d, d2, n2, n);
            if ((Double)this.Il.lIl() > 0.0) {
                IllIlI.IIllll(iI, vec3d2, vec3d3, vec3d4, color, color.getAlpha());
            }
            if ((Double)this.lI.lIl() > 0.0) {
                IllIlI.IIllII(iI, vec3d3, vec3d4, color2, color2.getAlpha(), ((Double)this.III.lIl()).floatValue());
                if (n2 % 8 == 0) {
                    IllIlI.IIllII(iI, vec3d2, vec3d4, color2, (double)color2.getAlpha() * 0.62, ((Double)this.III.lIl()).floatValue());
                }
            }
            vec3d3 = vec3d4;
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color lII(double d) {
        Color color;
        boolean bl = ((Boolean)this.lIl.lIl()).booleanValue() || ClientEntrypoint.lII().IlI().IlIlIl().lIll() != Theme.Illl;
        Color color2 = bl ? ClientEntrypoint.lII().IlI().IlIlIl().lIIl() : (Color)this.Ill.lIl();
        int n = MathHelper.clamp((int)((int)Math.round((Double)this.lI.lIl())), (int)0, (int)255);
        if (bl) {
            color = lIlIllI.Ill(color2, n);
            return color;
        }
        color = lIlIllI.Ill(lIlIllI.III(color2, lllIIII.ll, d), n);
        return color;
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color lIl(double d) {
        Color color;
        boolean bl = (Boolean)this.lIl.lIl() != false || ClientEntrypoint.lII().IlI().IlIlIl().lIll() != Theme.Illl;
        Color color2 = bl ? ClientEntrypoint.lII().IlI().IlIlIl().lIlI() : (Color)this.l.lIl();
        int n = MathHelper.clamp((int)((int)Math.round((Double)this.Il.lIl())), (int)0, (int)255);
        if (!bl) {
            color = lIlIllI.Ill(lIlIllI.III(color2, lllIIII.III, d), n);
            return color;
        }
        color = lIlIllI.Ill(color2, n);
        return color;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 21116;
        String string = "\u3c0d\u6fa5\u2169\u77a2\u96e1\uad77\ua273\ufe5c\ub7dc\u32c7\u0a81\u0830\ueb98\uf6e0\u621c\u828c\ue21f\u992d\u97f0\u5b20\u3241\u065a\u9913\ud08c\uaf2e\uf675\u969e\u90a4\u2774\uf46c\u033b\u51c1\u4172\u44d7\u4959\ufb18\u919a\u0e14\ufa08\ud2ee\uc6b3\uf23a\u821c\u9c6f\u0d22\u312a\u0d20\u5e6c\ubf9e\u648a\u7115\u8200\u84d1\u86a3\u6586\ud3f4\ua95f\uffb0\u5aff\u5c12\u9ca5\u3ba1\u6e0f\u094f\ub9ae\u73ee\u56f1\u7caa\u4701\u0a4f\u0885\uaf6c\uace7\u2608\ua1e3\u34a7\uc872\ufc97\u7332\u6ba7\ua5b6\u3023\u8ba8\ubfcd\u013d\u0750\u3475\u146e\uc531\u34ea\u1dee\u52ec\uc564\u7cc8\uc648\ub4b6\uc1ae\u46c2\u385a\u11e9\ube2d\u9ac2\u1f18\ub22e\u1462\u91d6\u0180\u2aeb\uc492\ubcff\u8b82\u9053\ud929\ubc00\u76d8\u0e52\u0bcf\u0862\u766e\u8b59\u8bee\ua21d\uf7ba\uaa00\ub28a\ud69c\ua185\u6553\u31d1\u90c3\u01d7\udc72\u3c30\u4629\uf790\u68c2\u92be\u0823\u422a\u466a\u9170\u0f04\ue3fb\uf11d\u0716\u0811\u5b59\u3b2f\ud7b1\ua318\u46b5\ud6ea\u284f\u5e3a\uea1f\u2a42\udc02\u7bb7\uc50c\u430d\u17ab&\u6020\u79b0\uc6df\uf1e2\u138d\u6d42\ud762\uc099\u3f92\ufc7e\uf503\ue7ce\u4bab\ud257\u27d4\u2d1e\ue136\u0830\u6ca7\u0ccc\u8e64\u8aea\u1a9d\uedfc\u4c43\u7115\u5948\ucb99\u48a3\u5e39\ub215\u3c01\u2ad0\ucf69\ub60b\u5ada\ufe76\uc192\ubed4\u1163\ub6cc\u2484\ud851\u6eb3\uf36c\uff28\u70ad\ud52f\uae1f\u8e4c\u617a\ube4b\uc3b0\u6b92\ud24c\ua294\ufdd4\u34a1\udf12\u6ec0\u0013\ue71b";
        char[] cArray = "\b\u0010\u0014\u0004\u0010\b,\u0014\u0010\u0010\u0010\u0010\f\f".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            char c = '\u0000';
            if (n2 == 0) {
                lll = stringArray;
                IIII = new Object[stringArray.length];
                int n5 = 1504529464;
                byte[] byArray = "t\u00a5\u0012PrYG\u008c\u009f\tZ\u00b1\u009dH-\u001f\u008f4r/\u00f8\u00b5\u001e\u0004\\\u00c9\u000b)\u0084\u00a4\u00db\u00ea\u0095\u000e\u00f2U\u0093\u00fcL\u00b9\u0015{\u00ef\u00af\u0086O*\u00a8\u00a7\u00b5\u00f4\u0015\u00e4\u0086\u0007>C\"\u0097>\u00d4\u009b\u00dc\u00f8Q\u00deN\u00cc\u0086\u00db\u00b0\u0089\u00f0\u00c8\u00a0:\\\u00b3\u00fa\u00e0\u00d4\u001a?Q\u0099\u0006\u00a1\u00ca\u00f5\u0004\u00dap\u00ad\u00ba\u00d7dS\u0085T#\u00a7B\u00cb\u0006\u00d8\"\u008a\u0094\t\u00dd\u009eO\u00b3\\\u0084\u0096\u0094\u00c2\u00fd\u00b6\u0004\u00aa\u00ce\u0000\u00f3`\u009dUI\u0011\rJKHs\u00de7\u0016q7\r\u00e4\u00fc\u0083\u0001#*&f\u00a7@*mH\u0010\u00f6a\u009a\u009dU\u0003\u00c1)\u00f5+q\u00ad\u00c1\u001e\u00ed\u00ef\t`\"Z\u00cb\u00bf\u0017\u00e3\u00b9".getBytes("ISO-8859-1");
                int n6 = byArray.length / 4;
                llI = new int[n6];
                int n7 = 0;
                int n8 = 0;
                do {
                    int n9 = (byArray[n7] & 0xFF) << 24 | (byArray[n7 + 1] & 0xFF) << 16 | (byArray[n7 + 2] & 0xFF) << 8 | byArray[n7 + 3] & 0xFF;
                    Chinahat.llI[n8] = n9 ^= n5;
                    n7 += 4;
                } while (++n8 < n6);
                IlI = new String[14];
                Chinahat.llI();
                return;
            }
            do {
                c = cArray[n3];
                char[] cArray2 = string.substring(n4, n4 + c).toCharArray();
                int n10 = 0;
                do {
                    int n11 = switch (n10 % 5) {
                        case 1 -> 83;
                        case 3 -> 62;
                        case 4 -> 63;
                        default -> 86;
                        case 2 -> 8;
                    };
                    int n12 = n10++;
                    cArray2[n12] = (char)(cArray2[n12] ^ n11 ^ n);
                } while (n10 < cArray2.length);
                stringArray[n3] = new String(cArray2).intern();
                n4 += c;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
    }

    private static void llI() {
        Chinahat.IlI[0] = Chinahat.lI(Chinahat.IIII(-1307347120, 1230851457).toCharArray(), 2253L, 666430856);
        Chinahat.IlI[1] = Chinahat.lI(Chinahat.IIII(-1307347119, -257987523).toCharArray(), 79933L, -1743348745);
        Chinahat.IlI[2] = Chinahat.lI(Chinahat.IIII(-1307347118, 713515315).toCharArray(), 91937L, -1261591838);
        Chinahat.IlI[3] = Chinahat.lI(Chinahat.IIII(-1307347117, -280277234).toCharArray(), 4422L, -1456602180);
        Chinahat.IlI[4] = Chinahat.lI(Chinahat.IIII(-1307347116, -1606654098).toCharArray(), 65939L, -816475388);
        Chinahat.IlI[5] = Chinahat.lI(Chinahat.IIII(-1307347115, -194241657).toCharArray(), 66819L, -524092360);
        Chinahat.IlI[6] = Chinahat.lI(Chinahat.IIII(-1307347114, -1093438978).toCharArray(), 87066L, 1625129181);
        Chinahat.IlI[7] = Chinahat.lI(Chinahat.IIII(-1307347113, 1814958301).toCharArray(), 80920L, -1773024524);
        Chinahat.IlI[8] = Chinahat.lI(Chinahat.IIII(-1307347112, -1646708007).toCharArray(), 78843L, 2056890858);
        Chinahat.IlI[9] = Chinahat.lI(Chinahat.IIII(-1307347111, -72281172).toCharArray(), 10041L, 63981803);
        Chinahat.IlI[10] = Chinahat.lI(Chinahat.IIII(-1307347110, -701939269).toCharArray(), 14430L, 895633636);
        Chinahat.IlI[11] = Chinahat.lI(Chinahat.IIII(-1307347109, 1556175185).toCharArray(), 7204L, -1150582116);
        Chinahat.IlI[12] = Chinahat.lI(Chinahat.IIII(-1307347108, 1582969904).toCharArray(), 40648L, 453914642);
        Chinahat.IlI[13] = Chinahat.lI(Chinahat.IIII(-1307347107, -514432532).toCharArray(), 99568L, -991428036);
    }

    public Chinahat() {
        super(StringFactory.IIII("Chinahat"), Category.l, StringFactory.IIII("Draws a cone hat on player heads."));
        this.II = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Head Offset"), 0.24, -0.3, 0.5, 0.01).IIIl("m"));
        this.lIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Color Sync"), true));
        this.l = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Fill Color"), new Color(92, 236, 255, 145)));
        this.Ill = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Outline Color"), new Color(255, 255, 255, 235)));
        this.Il = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Fill Alpha"), 145.0, 0.0, 255.0, 1.0));
        this.lI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Outline Alpha"), 235.0, 0.0, 255.0, 1.0));
        this.III = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Line Width"), 1.2, 0.5, 4.0, 0.1));
        this.I = this.IIlllIl(new llIll((Object)StringFactory.IIII("Show Self"), true));
        this.ll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Show Others"), false));
        this.l.lIII(() -> !((Boolean)this.lIl.lIl()).booleanValue());
        this.Ill.lIII(() -> {
            if ((Boolean)this.lIl.lIl() != false) return false;
            return true;
        });
    }

    private static int lll(int n, int n2) {
        return llI[n ^ 0xA095DDC3] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IIII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xB2137750;
        char[] cArray = lll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIII[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            Chinahat.IIII[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x8C92C240;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 28 -> 243;
                case 22 -> 53;
                case 3 -> 238;
                case 23 -> 87;
                case 13 -> 126;
                case 9 -> 95;
                case 31 -> 14;
                case 27 -> 26;
                case 19 -> 44;
                case 2 -> 177;
                case 1 -> 235;
                case 15 -> 190;
                case 10 -> 23;
                case 7 -> 202;
                case 18 -> 222;
                default -> 254;
                case 17 -> 64;
                case 5 -> 3;
                case 20 -> 204;
                case 6 -> 34;
                case 29 -> 123;
                case 16 -> 172;
                case 14 -> 88;
                case 21 -> 186;
                case 4 -> 250;
                case 12 -> 112;
                case 24 -> 148;
                case 8 -> 42;
                case 26 -> 138;
                case 11 -> 138;
                case 25 -> 85;
                case 30 -> 191;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

