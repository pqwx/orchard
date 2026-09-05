/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIllII
 * Module         : PopVisuals  [RENDER]
 * Description    : Renders a fading frozen player ghost when a charm pop is received.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Outline Color
 *   - Y Animation
 *   - Color Sync
 *   - Line Width
 *   - Fade Time
 *   - Self Pop
 *   - .getBytes(
 *   - Outline
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
 *  net.minecraft.client.network.OtherClientPlayerEntity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.render;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.OtherClientPlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IllIlI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlIllI;
import orchard.internal.llIlIIII;
import orchard.internal.llIlIlII;
import orchard.internal.llIll;
import orchard.internal.lllIIII;
import orchard.module.iface.Interface;

@Environment(value=EnvType.CLIENT)
public final class PopVisuals
extends ModuleBase {
    private final llIll I = this.IIlllIl(new llIll((Object)StringFactory.IIII("Fill"), true));
    private final llIll l;
    private final lIlIIlI II;
    private final lIlIIlI Il;
    private final llIlIlII lI;
    private final List<llIlIIII> ll;
    private final llIll III;
    private final llIll IIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Color Sync"), true));
    private static String[] IlI;
    private final lIlIIlI Ill;
    private final llIlIlII lII = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Color"), new Color(255, 45, 45, 80)));
    private static final int[] lIl;
    private static final String[] llI;
    private static final Object[] lll;

    @Override
    public void llll() {
        this.ll.clear();
    }

    private Color IIl(llIlIIII llIlIIII2, float f) {
        if (!((Boolean)this.IIl.lIl()).booleanValue()) {
            return (Color)this.lII.lIl();
        }
        Color color = this.lIII();
        Color color2 = lIlIllI.III(color, lllIIII.III, (double)llIlIIII2.I() * 1.1E-4 + (double)f);
        return lIlIllI.Ill(color2, 80);
    }

    private static String IlI(char[] cArray, long l2, int n) {
        int n2 = 0xE3EE6F48 ^ n;
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
    private void lII(II iI, llIlIIII llIlIIII2, long l2, long l3) {
        Color color;
        float f = Math.min(1.0f, (float)(l2 - llIlIIII2.I()) / (float)l3);
        float f2 = 1.0f - f;
        if (f2 <= 0.0f) {
            return;
        }
        double d = (Double)this.Ill.lIl() * (double)f;
        float f3 = llIlIIII2.Il().getWidth() * 0.5f;
        float f4 = llIlIIII2.Il().getHeight();
        if (f3 <= 0.0f) return;
        if (f4 <= 0.0f) {
            return;
        }
        Vec3d vec3d = new Vec3d(llIlIIII2.II(), llIlIIII2.ll() + d + (double)f4 * 0.5, llIlIIII2.l());
        if (((Boolean)this.I.lIl()).booleanValue()) {
            color = this.IIl(llIlIIII2, f);
            IllIlI.lllII(iI, vec3d, f3, f4, llIlIIII2.lI(), color, (int)((float)color.getAlpha() * f2));
        }
        if ((Boolean)this.III.lIl() == false) return;
        color = this.Illl(llIlIIII2, f);
        IllIlI.ll(iI, vec3d, f3, f4, llIlIIII2.lI(), color, (int)((float)color.getAlpha() * f2), ((Double)this.II.lIl()).floatValue());
    }

    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.world == null || minecraftClient.player == null) {
            this.ll.clear();
            return;
        }
        long l2 = System.currentTimeMillis();
        long l3 = this.IllI();
        this.ll.removeIf(llIlIIII2 -> {
            if (llIlIIII2.I() + l3 <= l2) return true;
            if (llIlIIII2.Il().getEntityWorld() == minecraftClient.world) return false;
            return true;
        });
    }

    private static void IIII() {
        PopVisuals.IlI[0] = PopVisuals.IlI(PopVisuals.lIlI('\u6c98', 878448686, '\u2109').toCharArray(), 61627L, -961809657);
        PopVisuals.IlI[1] = PopVisuals.IlI(PopVisuals.lIlI('\u6c99', -698088028, '\udd90').toCharArray(), 56124L, -1529104521);
        PopVisuals.IlI[2] = PopVisuals.IlI(PopVisuals.lIlI('\u6c9a', -322815613, '\ud7b7').toCharArray(), 98757L, 1845668061);
        PopVisuals.IlI[3] = PopVisuals.IlI(PopVisuals.lIlI('\u6c9b', 388000253, '\u356b').toCharArray(), 59058L, -1941960941);
        PopVisuals.IlI[4] = PopVisuals.IlI(PopVisuals.lIlI('\u6c9c', -2109201552, '\u771e').toCharArray(), 27463L, 802580765);
        PopVisuals.IlI[5] = PopVisuals.IlI(PopVisuals.lIlI('\u6c9d', -1799536881, '\ue10b').toCharArray(), 5452L, 644626271);
        PopVisuals.IlI[6] = PopVisuals.IlI(PopVisuals.lIlI('\u6c9e', -1058127349, '\ud6ab').toCharArray(), 9642L, 376011036);
        PopVisuals.IlI[7] = PopVisuals.IlI(PopVisuals.lIlI('\u6c9f', 1479507373, '\u83f6').toCharArray(), 90644L, -1027754567);
        PopVisuals.IlI[8] = PopVisuals.IlI(PopVisuals.lIlI('\u6c90', 210512638, '\ucd25').toCharArray(), 76800L, 490765041);
        PopVisuals.IlI[9] = PopVisuals.IlI(PopVisuals.lIlI('\u6c91', -640595417, '\u769d').toCharArray(), 76810L, 2060827954);
        PopVisuals.IlI[10] = PopVisuals.IlI(PopVisuals.lIlI('\u6c92', -1129698331, '\ue5e6').toCharArray(), 7827L, -2026039709);
        PopVisuals.IlI[11] = PopVisuals.IlI(PopVisuals.lIlI('\u6c93', -1938273007, '\u2b38').toCharArray(), 15748L, -706843124);
        PopVisuals.IlI[12] = PopVisuals.IlI(PopVisuals.lIlI('\u6c94', 1705409092, '\u7152').toCharArray(), 31709L, 174611370);
        PopVisuals.IlI[13] = PopVisuals.IlI("".toCharArray(), 28606L, -1607276812);
    }

    @Override
    public String II() {
        return "";
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIlI(PlayerEntity playerEntity) {
        if (!this.IIIlIIl()) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.world == null) return;
        if (minecraftClient.player == null) return;
        if (playerEntity == null) return;
        if (playerEntity.isRemoved()) return;
        if (!playerEntity.isAlive()) {
            return;
        }
        if (playerEntity == minecraftClient.player && !((Boolean)this.l.lIl()).booleanValue()) {
            return;
        }
        this.ll.add(this.IlII(playerEntity, minecraftClient));
    }

    private llIlIIII IlII(PlayerEntity playerEntity, MinecraftClient minecraftClient) {
        OtherClientPlayerEntity otherClientPlayerEntity = new OtherClientPlayerEntity(minecraftClient.world, playerEntity.getGameProfile());
        double d = playerEntity.getY() - (!playerEntity.isSneaking() ? 0.0 : 0.125);
        otherClientPlayerEntity.refreshPositionAndAngles(playerEntity.getX(), d, playerEntity.getZ(), playerEntity.getYaw(), playerEntity.getPitch());
        otherClientPlayerEntity.setHeadYaw(playerEntity.getHeadYaw());
        otherClientPlayerEntity.setPitch(playerEntity.getPitch());
        otherClientPlayerEntity.setPose(playerEntity.getPose());
        otherClientPlayerEntity.setSneaking(playerEntity.isSneaking());
        otherClientPlayerEntity.setNoGravity(playerEntity.hasNoGravity());
        otherClientPlayerEntity.setInvisible(playerEntity.isInvisible());
        otherClientPlayerEntity.handSwinging = playerEntity.handSwinging;
        return new llIlIIII(otherClientPlayerEntity, System.currentTimeMillis(), playerEntity.getX(), d, playerEntity.getZ(), lIIllllI.IllIlI((LivingEntity)playerEntity, 1.0f));
    }

    private long IllI() {
        return Math.max(50L, Math.round((Double)this.Il.lIl()));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 11994;
        var7_2 = "\u842d\u6572\u5939\u0b5c\udf3b\ueb6f\ua88a\ua3e0\u7368\u9893\u9a9d\uf8ba\ua5e1\u41a2\u75cf\u2862\u259c\ua6ed\u1273\u530d\u5797\ud340\u0bc4\ud86e\ucc9f\u4f4c\uecc4\ubd4a\u9923\u7c63\u6860\u1a18\ubc89\u2c8a\ud073\u36c8\ub633\u6a6b\uacb3\u1ea6\u8f8f\u952c\u1728\u8acf\u4259\u04a3\ua15d\ued13\ue88d\u8c1c\u595a\u5150\u61ab\u8e15\u2298\ue028\uf24e\u690e\u909d\uf005\uacc4\u72e7\u9f51\u919d\ub6b1\u4c45\u4c46\u0955\u1d46\u2f04\ue36f\ua68e\u3beb\uf46e\u1a20\u3158\u3941\u35af\u6596\u77c5\ub9ea\u3015\u6755\ua192\ub391\u3c4d\ud2f6\u6afb\uebbe\u934e\u7937\ue2df\ua2ba\u015b\u3177\u5bd6\ubec9\u2676\u2fb5\u992d\ueee6\ueda8\ubdc4\u428d\u55be\u77f0\u5c2c\uc9e3\ueaa8\ua1a8\u6b94\ub42f\u0af5\uaecd\ud6fe\udc9b\u6285\u4c1b\u367a\u22a8\ud217\uc724\u91ff\u59d1\u6433\u579f\uf4b9\u44fb\u3b4d\u9463\u6210\uddcf\u0091\ub3cb\ua3d4\u91e8\u904a\ub1d2\u3892\ubb5d\u567e\ub132\u10a9\u5ac2\u1d75\u9548\u4bbf\u7442\u3020\ufc31\u54a6\u4838\ub2b9\u5a05\u5139\u6a5f\u4a0d\uf78a\u3e31\u7c1d\u9f11\u89a0\uc466\u4f14\u767c\u96f3\u2f87\u397b\u36f7\ucff4\u162b\uc619\u484b\ud305\u3074\u2e99\ud4fc\ua0c8\u1eac\uaf4b\u2011\uf9c0\ueb4a\u48c1\u4aaf\u5ff7\u6a26\u3bfb\uc449\ue625\ubf3a\u6965\u5b68\u7fb6\u8d1a\u8a9e\uf9e7\u468a\uc42b\u1de5\ub27f\u0403\u98ac\u1951\ua874\u3ecf\u99fc\u0a57\u69cf\ub113\u00e4\ufca9\u37ad\ue78b\u7011\u9e45\u84b2\ub78d\u1c63\ue521\u8728\u6774\u3f82\u2d95\u582c\u7195\uaa57\udf48\ue795\ue389\u4607\u8b33";
        var8_3 = "\u2eca\u2ed6\u2ed2\u2ede\u2ede\u2e82\u2eca\u2ed6\u2ed6\u2eca\u2ece\u2ed2\u2eca".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
lbl6:
        // 2 sources

        while (true) {
            var10_5 = 0;
            var11_6 = 0;
            var12_7 = 0;
            if (var13_8 != 0) ** GOTO lbl37
            PopVisuals.llI = var9_4;
            PopVisuals.lll = new Object[var9_4.length];
            var2_13 = -1448605221;
            var0_11 = "\u009dzn\u009a6L\f\u00b6tshW\u00c6\u001b\u0003\u0085\u00d1Y \u0099\u00f65{\u00ec\u00edX\u0095\u00ae\u00a25~l\u00b6\u00bf\u00d4\u00c5m?\u009c\u00d0\u0006\u00a3\u00ca\u00c0\u00b5\u0096J\u009b\u0093;\u00ff\u00ae\u00fa\u00de\u00a6\u00a7p\u0085\u00ea\u001d\u00bfv>\u00b2\u00a4\u0015<'\u00bdEn2l\u008dh\u0097\u00a1\u00ab\u00d9]\u000b\t\u0001\u00c6\u007fC\u00c2\u00cc\u0081\u00fc\u00a9x\u0004\u00bbUZ\u00e4cb\u00e8\u00d4\u00ce\u008a\u00ac\u00d2\r\u00ef\u00ad]\u00b3\u0015\u00aa\u00c6\u00e8\u00abyk\u00a8\u00b4\u00d8\u00f7<\u00eb\"\u00d3\u00d6\u0098%\u00f6\u00fa\u00ea\u0085,\u00ff@n\u00d7V~ao\u00921n\u00f9\u0017/\u00ee\u00dc\u00d7[\u00b2\u00e5J\u00f5\u00e6\u00da \u0015/\u00b0\u0093V2\u00c45\u00a2Xk\u00a2\u00e4\u00e7\u0082\u0097V\u008c\u00fd}[!\u00934\u00fd\u00e9\u00d0\n\u0083\u009b".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            PopVisuals.lIl = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                PopVisuals.lIl[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            PopVisuals.IlI = new String[14];
            PopVisuals.IIII();
            return;
        }
lbl-1000:
        // 5 sources

        {
            block11: {
                var16_1 = v0;
                v1 = var15_10++;
                var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                if (var15_10 >= var14_9.length) {
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 >= var8_3.length) {
                        var13_8 = 0;
                        ** continue;
                    } else {
                        ** GOTO lbl37
                    }
                }
                break block11;
lbl37:
                // 3 sources

                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
            }
            switch (var15_10 % 5) {
                case 3: {
                    v0 = 3;
                    continue block8;
                }
                case 2: {
                    v0 = 43;
                    continue block8;
                }
                case 1: {
                    v0 = 102;
                    continue block8;
                }
                default: {
                    v0 = 81;
                    continue block8;
                }
                case 4: 
            }
            v0 = 45;
            ** while (true)
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void Ill(II var1_1) {
        block15: {
            block14: {
                block9: {
                    block13: {
                        block12: {
                            block11: {
                                block10: {
                                    if (!this.IIIlIIl()) break block10;
                                    break block11;
lbl3:
                                    // 1 sources

                                    while (var8_6.Il().getEntityWorld() != var2_2.world) {
                                        while (true) {
                                            var7_5.remove();
                                            break block9;
                                            break;
                                        }
                                    }
                                    break block12;
                                    while (true) {
                                        var3_3 = System.currentTimeMillis();
                                        var5_4 = this.IllI();
                                        var7_5 = this.ll.iterator();
                                        break block9;
                                        break;
                                    }
                                }
lbl14:
                                // 3 sources

                                return;
lbl16:
                                // 1 sources

                                while (true) {
                                    if ((var8_6 = var7_5.next()).I() + var5_4 <= var3_3) ** continue;
                                    ** GOTO lbl3
                                    break;
                                }
lbl19:
                                // 2 sources

                                while (true) {
                                    this.ll.clear();
                                    return;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    if (var1_1.I() != null) ** continue;
                                    ** GOTO lbl19
                                    break;
                                }
                            }
                            if (!((Boolean)this.I.lIl()).booleanValue() && !((Boolean)this.III.lIl()).booleanValue()) ** GOTO lbl14
                            break block13;
                        }
                        this.lII(var1_1, var8_6, var3_3, var5_4);
                        break block9;
                    }
                    if (!IllIlI.lIIll(var1_1)) {
                        ** continue;
                    }
                    break block14;
                }
                if (var7_5.hasNext()) {
                    ** continue;
                }
                break block15;
            }
            var2_2 = MinecraftClient.getInstance();
            if (var2_2.world != null && var2_2.player != null) ** break;
            ** while (true)
            ** while (true)
        }
    }

    public PopVisuals() {
        super(StringFactory.IIII("PopVisuals"), Category.l, StringFactory.IIII("Renders a fading frozen player ghost when a charm pop is received."));
        this.III = this.IIlllIl(new llIll((Object)StringFactory.IIII("Outline"), true));
        this.lI = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Outline Color"), new Color(255, 45, 45, 255)));
        this.II = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Line Width"), 1.5, 0.5, 6.0, 0.1));
        this.Il = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Fade Time"), 1500.0, 100.0, 5000.0, 50.0).IIIl("ms"));
        this.Ill = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Y Animation"), 0.0, -2.0, 2.0, 0.05).IIIl("m"));
        this.l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Self Pop"), false));
        this.ll = new ArrayList<llIlIIII>();
        this.lII.lIII(() -> {
            if ((Boolean)this.I.lIl() == false) return false;
            if ((Boolean)this.IIl.lIl() != false) return false;
            return true;
        });
        this.lI.lIII(() -> {
            if ((Boolean)this.III.lIl() == false) return false;
            if ((Boolean)this.IIl.lIl() != false) return false;
            return true;
        });
        this.II.lIII(this.III::lIl);
    }

    private Color Illl(llIlIIII llIlIIII2, float f) {
        if (!((Boolean)this.IIl.lIl()).booleanValue()) {
            return (Color)this.lI.lIl();
        }
        Color color = this.lIII();
        Color color2 = lIlIllI.III(color, lllIIII.ll, (double)llIlIIII2.I() * 1.3E-4 + (double)f);
        return lIlIllI.Ill(color2, 255);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Color lIII() {
        Color color;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        Interface interface_ = clientEntrypoint != null && clientEntrypoint.IlI() != null ? clientEntrypoint.IlI().lIIIII() : null;
        if (interface_ != null) {
            color = interface_.IIlll();
            return color;
        }
        color = new Color(255, 45, 45, 255);
        return color;
    }

    private static int lIIl(int n, int n2) {
        return lIl[n ^ 0x24F35F13] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIlI(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x6C98;
        char[] cArray = llI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lll[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            PopVisuals.lll[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6022;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xB26A;
            n6 += 56913;
            n6 += 7664;
            n6 ^= 0xC227;
            n6 ^= 0x3EC4;
            n6 -= 15497;
            cArray[n5] = (char)((n6 -= 7710) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

