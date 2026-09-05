/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIlIlI
 * Module         : PlayerLocator  [RENDER]
 * Description    : Highlights selected players with outlines visible through walls.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Xylone_ | Ih8devs
 *   - .getBytes(
 *   - Targets
 *   - Color
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
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIIIIIII;
import orchard.internal.IllIlI;
import orchard.internal.Illllll;
import orchard.internal.lIIllllI;
import orchard.internal.lIllIlIl;
import orchard.internal.llIlIlII;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class PlayerLocator
extends ModuleBase {
    private static final String I;
    private final llIll l;
    private static String[] II;
    private final llIlIlII Il = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Color"), new Color(255, 50, 50, 180)));
    private final Illllll lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    /*
     * Unable to fully structure code
     */
    @Override
    public void III() {
        block9: {
            block8: {
                block5: {
                    block6: {
                        block4: {
                            block7: {
                                var1_1 = MinecraftClient.getInstance();
                                if (var1_1.player == null) break block6;
                                break block7;
                                while (!PlayerLocator.IIl(var6_6.getName().getString(), var3_3)) {
                                    ** GOTO lbl-1000
lbl6:
                                    // 1 sources

                                    while (!IllIlI.IIIII(var1_1, var6_6 = (PlayerEntity)var5_5)) lbl-1000:
                                    // 5 sources

                                    {
                                        while (true) {
                                            if (!var4_4.hasNext()) break block4;
                                            break block5;
                                            break;
                                        }
                                    }
                                }
                                break block8;
                            }
                            if (var1_1.world != null) break block9;
                            break block6;
                        }
                        return;
                    }
                    return;
                }
                var5_5 = (Entity)var4_4.next();
                if (!(var5_5 instanceof PlayerEntity)) ** GOTO lbl-1000
                ** GOTO lbl6
lbl23:
                // 1 sources

                return;
            }
            IIIIIIIII.l(var6_6.getUuid());
            ** GOTO lbl-1000
        }
        IIIIIIIII.Ill();
        var2_2 = (Color)this.Il.lIl();
        IIIIIIIII.lI(var2_2.getRGB());
        var3_3 = this.lII();
        ** while (var3_3.isEmpty())
lbl34:
        // 1 sources

        var4_4 = var1_1.world.getEntities().iterator();
        ** while (true)
    }

    private static void lI() {
        PlayerLocator.II[0] = PlayerLocator.lIl("".toCharArray(), 10023L, -414346058);
        PlayerLocator.II[1] = PlayerLocator.lIl(PlayerLocator.IIII('\u75cf', (short)10515, -1008642931).toCharArray(), 78009L, 1691747640);
        PlayerLocator.II[2] = PlayerLocator.lIl(PlayerLocator.IIII('\u75ce', (short)62544, -778809619).toCharArray(), 53541L, 1131352504);
        PlayerLocator.II[3] = PlayerLocator.lIl(PlayerLocator.IIII('\u75cd', (short)22890, -1500899003).toCharArray(), 1891L, -610320570);
        PlayerLocator.II[4] = PlayerLocator.lIl(PlayerLocator.IIII('\u75cc', (short)13528, -147764098).toCharArray(), 54224L, -870599436);
        PlayerLocator.II[5] = PlayerLocator.lIl(PlayerLocator.IIII('\u75cb', (short)58948, -1942268630).toCharArray(), 26984L, 425494649);
        PlayerLocator.II[6] = PlayerLocator.lIl(PlayerLocator.IIII('\u75ca', (short)12654, -1010804512).toCharArray(), 93105L, 319807064);
        PlayerLocator.II[7] = PlayerLocator.lIl(PlayerLocator.IIII('\u75c9', (short)34554, 246159679).toCharArray(), 59282L, -339830235);
        PlayerLocator.II[8] = PlayerLocator.lIl(PlayerLocator.IIII('\u75c8', (short)42341, 947470553).toCharArray(), 19497L, 864380925);
        PlayerLocator.II[9] = PlayerLocator.lIl(PlayerLocator.IIII('\u75c7', (short)2203, 1441671964).toCharArray(), 19529L, 1155074015);
    }

    private static boolean IIl(String string, Set<String> set) {
        return set.contains(string.toLowerCase());
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void Ill(II var1_1) {
        block9: {
            block14: {
                block7: {
                    block8: {
                        block10: {
                            block13: {
                                block12: {
                                    block11: {
                                        if (!this.IIIlIIl()) break block11;
                                        break block12;
                                        while (true) {
                                            var8_8 = IllIlI.IIlIlI((Entity)var7_7, var3_3);
                                            if (!((Boolean)this.l.lIl()).booleanValue()) break block7;
                                            break block8;
                                            break;
                                        }
                                        while (true) {
                                            if (this.IlI(var2_2, var1_1, (Entity)var7_7, var3_3)) ** continue;
                                            break block7;
                                            break;
                                        }
                                        while (true) {
                                            var6_6 = (Entity)var5_5.next();
                                            if (!(var6_6 instanceof PlayerEntity)) break block7;
                                            break block9;
                                            break;
                                        }
                                    }
lbl15:
                                    // 2 sources

                                    return;
                                }
                                if (IllIlI.lIIll(var1_1)) break block13;
                                ** while (true)
lbl20:
                                // 1 sources

                                while (var2_2.world == null) {
                                    break block10;
                                }
                                break block14;
                            }
                            var2_2 = MinecraftClient.getInstance();
                            if (var2_2.player == null) break block10;
                            ** GOTO lbl20
lbl27:
                            // 1 sources

                            while (true) {
                                if (IIIIIIIII.III(var7_7.getUuid())) ** continue;
                                break block7;
                                break;
                            }
                        }
                        return;
                    }
                    var9_9 = var7_7.getName().getString();
                    var10_10 = (int)Math.ceil(var7_7.getHealth());
                    var16_16 = "HP]";
                    var15_15 = var10_10;
                    var14_14 = " [";
                    var13_13 = var9_9;
                    var11_11 = var13_13 + var14_14 + var15_15 + var16_16;
                    var12_12 = var8_8.add(0.0, (double)var7_7.getHeight() + 0.3, 0.0);
                    IllIlI.lllIl(var1_1, var11_11, var12_12, var4_4, 1.0, false);
                }
lbl43:
                // 3 sources

                while (true) {
                    if (var5_5.hasNext()) ** continue;
                    return;
                }
            }
            var3_3 = lIIllllI.IlIIII(var2_2);
            var4_4 = (Color)this.Il.lIl();
            var5_5 = var2_2.world.getEntities().iterator();
            ** GOTO lbl43
        }
        ** while (IllIlI.IIIII((MinecraftClient)var2_2, (PlayerEntity)(var7_7 = (PlayerEntity)var6_6)))
lbl53:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block26: {
                block27: {
                    block23: {
                        block22: {
                            block25: {
                                block21: {
                                    var6 = 31476;
                                    ** GOTO lbl52
lbl3:
                                    // 1 sources

                                    block6: while (true) {
                                        switch (var15_10 % 5) {
                                            case 1: {
                                                v0 = 42;
                                                ** GOTO lbl64
                                            }
lbl8:
                                            // 1 sources

                                            while (true) {
                                                PlayerLocator.II = new String[10];
                                                PlayerLocator.lI();
                                                PlayerLocator.I = "Xylone_ | Ih8devs";
                                                return;
                                            }
lbl13:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                            case 2: {
                                                v0 = 87;
                                                ** GOTO lbl64
                                            }
lbl18:
                                            // 1 sources

                                            while (true) {
                                                if (var13_8 != 0) ** GOTO lbl28
                                                ** GOTO lbl26
                                                break;
                                            }
lbl21:
                                            // 2 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                            default: {
                                                v0 = 119;
                                                ** GOTO lbl64
                                            }
lbl26:
                                            // 1 sources

                                            PlayerLocator.III = var9_4;
                                            break block21;
lbl28:
                                            // 2 sources

                                            while (true) {
                                                var12_7 = var8_3[var10_5];
                                                break block22;
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
                                                var8_3 = "\u0018\u0010\f\b\u0014X\f\u0004\u0004".toCharArray();
                                                break block23;
                                                break;
                                            }
lbl36:
                                            // 1 sources

                                            while (true) {
                                                var4_15 = 0;
                                                ** GOTO lbl21
                                                break;
                                            }
lbl39:
                                            // 1 sources

                                            while (true) {
                                                var12_7 = '\u0000';
                                                ** continue;
                                                break;
                                            }
                                            v1 = var15_10++;
                                            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
                                            if (var15_10 < var14_9.length) continue block6;
                                            break block24;
                                            var1_13 = var0_11.length / 4;
                                            PlayerLocator.ll = new int[var1_13];
                                            break block25;
lbl49:
                                            // 1 sources

                                            while (true) {
                                                if (++var10_5 < var8_3.length) ** continue;
                                                ** GOTO lbl60
                                                break;
                                            }
lbl52:
                                            // 1 sources

                                            var7_2 = "\u206c\u3790\u5f28\u6f9e\ubd9a\uf302\u00ad\ub409\uddbc\u317d\u9798\ua615\u2ccc\u9e81\u48f4\u05b2\u5a62\u6d41\u8e5c\u353c\ub0cc\u60d4\u509a\ufe6e\ue5a6\u96ab\u6b51\u4c9a\ue2ac\u78f8\ud677\ue1b2\ucae4\u51cd\u4685\u8b4c\u7d50\ub958\uda07\uc199\u97f3\u67a7\u1ce8\u7a61\u0d08\ub099\u353c\uad1f\u639c\u3baf\u13de\ub880\u52b7\u7fe9\u9446\u9763\u732a\u19d6\u257e\u143e\u9562\u4d78\u0d00\u6e74\ue0e8\ue79f\u7df5\ue5b9\u5b80\u7631\ua635\u3659\u65ff\ud7af\ueeda\uf1da\u4a37\u1466\u57f6\ub7d6\ucdac\uff01\u311c\u4009\u68ff\ue248\u1857\udf8b\u3532\u95fe\u110d\u6aa9\u1b64\u372c\ucbee\ueff5\ua623\u00b0\u2c2f\u39cc\u4279\u82ea\u9fb7\u5707\u2884\u0000\ufa97\u5e02\udb2d\u4083\ube14\uee07\u74c6\ua081\u1949\u5ac3\u7fdf\u81d8\u9fc4\u07f1\u4472\ua035\u707e\u517a\u2f82\ue668\udca7\uabe7\u4dd4\ubd7c\u5de8\u68fe\u4e22\u1ee4\u9078\u2f7f\u15bf\u2faa\uc416\udab3\ue36f\u5777\uea10\u3be4\u8799\u8afe\u2f3c\uae53\u20b8\ub9e3\u86e4\uf35a\u87ff\u3447\u5f05\ub3da\u8d25\uc0d5\u05be\ue909\ucff8\ud896\u53e6\u17d7\uf439\udcdf\uc00e\ua173\u57d6\u07b3\uaaf5\u2f08\u9cf4\u91b6\ude22\ub6cc\ue76b\u98dd\u05f4\u0156\u4f23\u6530\u2075\u6a74\u852f\ubfc9\u56f4\u924c";
                                            ** continue;
                                            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                                            PlayerLocator.ll[var4_15] = var5_16 ^= var2_12;
                                            var3_14 += 4;
                                            if (++var4_15 >= var1_13) ** break;
                                            ** continue;
                                            ** continue;
lbl60:
                                            // 1 sources

                                            var13_8 = 0;
                                            break block26;
                                            case 4: {
                                                v0 = 25;
lbl64:
                                                // 5 sources

                                                while (true) {
                                                    var16_1 = v0;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }
lbl67:
                                    // 1 sources

                                    while (true) {
                                        var11_6 += var12_7;
                                        break block27;
                                        break;
                                    }
lbl70:
                                    // 1 sources

                                    while (true) {
                                        var0_11 = "\u00fcg\u00d9\b\u0016\u00a8n\u00aa2\u0092m\u0004&+/S\u00c3\u00c7\u00fd\u00e7\n\u000b`g7]\u0004<\u00c7\u00f7\u00ab\u00b1\u00dd\u00d7\u00f0\u00d2\u00f6\u0015`\u00b6\u00b1\u00b9\u00bd*\u00d1\u00d8nV]4\u0091B}:\tG;!\u00fa\u00fc\u001fz\u008b\u00d9\u00df\u00e3+R\u0003V\u00e9\u0014KNF+-\u00cb+3e\u00c5u\u00b4\u008e\u0018I\u00c5\u00b66\u00b1\u00ccB\u00e5\u0082\u001a\u0088#Z\u00d0".getBytes("ISO-8859-1");
                                        ** continue;
                                        break;
                                    }
                                }
                                PlayerLocator.IIl = new Object[var9_4.length];
                                var2_12 = 1015365783;
                                ** while (true)
lbl77:
                                // 1 sources

                                while (true) {
                                    var13_8 = -1;
                                    break block26;
                                    break;
                                }
                            }
                            var3_14 = 0;
                            ** while (true)
                        }
                        var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                        var15_10 = 0;
                        ** while (true)
                    }
                    var9_4 = new String[var8_3.length];
                    ** while (true)
                }
                ** while (true)
            }
            var10_5 = 0;
            var11_6 = 0;
            ** while (true)
            {
                ** case 3:
            }
lbl97:
            // 1 sources

            v0 = 94;
            ** while (true)
        }
        var9_4[var10_5] = new String(var14_9).intern();
        ** while (true)
    }

    private boolean IlI(MinecraftClient minecraftClient, II iI, Entity entity, float f) {
        Vec3d vec3d = IllIlI.IIlIlI(entity, f);
        return IllIlI.IIlII(minecraftClient, iI, entity, vec3d);
    }

    @Override
    public void llll() {
        IIIIIIIII.Ill();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Set<String> lII() {
        HashSet<String> hashSet = new HashSet<String>();
        for (String string : (List)this.lI.lIl()) {
            String string2 = string == null ? "" : string.trim();
            if (string2.isEmpty()) continue;
            hashSet.add(string2.toLowerCase());
        }
        return hashSet;
    }

    public PlayerLocator() {
        super(StringFactory.IIII("PlayerLocator"), Category.l, StringFactory.IIII("Highlights selected players with outlines visible through walls."));
        this.l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Nametags"), true));
        this.lI = this.IIlllIl(new Illllll((Object)StringFactory.IIII("Targets"), lIllIlIl.IIIll(I, "[\\r\\n|,;]+"), "[\\r\\n|,;]+"));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIl(char[] cArray, long l2, int n) {
        int n2 = 0x2318B690 ^ n;
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

    private static int lll(int n, int n2) {
        return ll[n ^ 0xC441EC95] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIII(char c, short s, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x75CF;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            PlayerLocator.IIl[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4B03;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 38375;
            n6 += 61045;
            n6 -= 21896;
            n6 -= 16393;
            n6 -= 36863;
            n6 -= 60121;
            n6 ^= 0xD3C;
            cArray[n5] = (char)((n6 += 34364) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

