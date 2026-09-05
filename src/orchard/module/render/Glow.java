/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIIIII
 * Module         : Glow  [RENDER]
 * Description    : Applies a glowing outline to players using the current client theme.   (client's own text)
 *
 * Recovered strings in this class:
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
 */
package orchard.module.render;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIII;
import orchard.internal.IllIlI;
import orchard.internal.lIlIllI;
import orchard.internal.lllIIII;

@Environment(value=EnvType.CLIENT)
public final class Glow
extends ModuleBase {
    private static String[] I;
    private static final int[] l;
    private static final String[] II;
    private static final Object[] Il;

    /*
     * Enabled aggressive block sorting
     */
    private Color lI(PlayerEntity playerEntity) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null || clientEntrypoint.IlI() == null || clientEntrypoint.IlI().IlIlIl() == null) {
            return Color.WHITE;
        }
        Color color = clientEntrypoint.IlI().IlIlIl().IIlll();
        double d = playerEntity == null ? 0.0 : (double)playerEntity.getId() * 0.173;
        return lIlIllI.III(color, lllIIII.III, d);
    }

    @Override
    public void llll() {
        IIIIIIIII.IlI();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 26640;
        var7_2 = "\u40a0\u7b55\udb38\u8314\ude89\u6782\u56b1\ud829\uf4be\ubab4\ubffe\udd49\uf129\ua132\u56c6\u450b\u28d3\udad3\u2e9b\ud3fe\uc6ff\u87cd\u687c\ue5ef\u42c6\uf118\uf4f9\u222f\u8636\u8b69\u7080\ub219\u1c33\uf668\u0c02\u54aa\u89ef\u00ab\u45d9\ua359\u5b85\u4cf4\uaa3c\u65b8\u6727\ua88a\ue9ea\u181a\u3245\u7e07\ub0f8\u7ca1\u3d9f\u60aa\u0f80\u0c12\uce0f\u71eb\ue52b\u537e\ubcd8\u1718\u98b0\u6d39\u7477\uf305\ue315\uefd9\u5b92\u1aed\u35ef\u8b76\u84e7\u82a8\ufa29\u2b5b\ub0eb\ub092\u6e0b\uc852\ua338\ua2b4\ua497\u271d\u02f5\u2d78\u7f4c\u54d7\ub8f4\u9778\u5b0e\u5ff3\ue3fa\u4b00\ucde7\ud83a\u3904\ua870\u8d23\ua11a";
        var8_3 = "\\\b".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl12
        while (true) {
            block15: {
                block14: {
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 >= var8_3.length) {
                        var13_8 = 0;
lbl12:
                        // 2 sources

                        var10_5 = 0;
                        var11_6 = 0;
                    } else {
                        while (true) {
                            break block14;
                            break;
                        }
                    }
                    var12_7 = '\u0000';
                    if (var13_8 != 0) ** continue;
                    break block15;
                }
                var12_7 = var8_3[var10_5];
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl40
            }
            Glow.II = var9_4;
            Glow.Il = new Object[var9_4.length];
            var2_13 = -1231942272;
            var0_11 = "-kQ_Q\u00f9\u00dd\u00b0\u00baJ\u00a7\u0015\u00af\u00b9@K".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            Glow.l = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            if (true) ** GOTO lbl65
            break;
        }
        block9: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
            if (var15_10 >= var14_9.length) ** continue;
lbl40:
            // 2 sources

            switch (var15_10 % 6) {
                default: {
                    v0 = 119;
                    continue block9;
                }
                case 4: {
                    v0 = 7;
                    continue block9;
                }
                case 3: {
                    v0 = 56;
                    continue block9;
                }
                case 2: {
                    v0 = 98;
                    continue block9;
                }
                case 5: {
                    v0 = 103;
                    continue block9;
                }
                case 1: 
            }
            v0 = 55;
        }
        while (true) {
            var3_14 += 4;
            if (++var4_15 >= var1_12) {
                Glow.I = new String[2];
                Glow.IIl();
                return;
            }
lbl65:
            // 3 sources

            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
            Glow.l[var4_15] = var5_16 ^= var2_13;
        }
    }

    private static void IIl() {
        Glow.I[0] = Glow.IlI(Glow.lIl('\u2cb5', 59484, 1814374803).toCharArray(), 24992L, 1862312848);
        Glow.I[1] = Glow.IlI(Glow.lIl('\u1ba8', 59485, -364550674).toCharArray(), 28434L, -1801426518);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void III() {
        block5: {
            block6: {
                block7: {
                    IIIIIIIII.IlI();
                    var1_1 = MinecraftClient.getInstance();
                    if (var1_1 == null) break block6;
                    break block7;
lbl5:
                    // 1 sources

                    while (true) {
                        var5_5 = this.lI(var4_4).getRGB();
                        IIIIIIIII.Il(var4_4.getUuid(), var5_5);
                        break block5;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var4_4 = (PlayerEntity)var3_3;
                        if (!IllIlI.IIIII(var1_1, var4_4)) break block5;
                        ** continue;
                        break;
                    }
lbl13:
                    // 1 sources

                    while (var1_1.world != null) {
                        var2_2 = var1_1.world.getEntities().iterator();
                        break block5;
                    }
                    break block6;
                }
                if (var1_1.player != null) ** GOTO lbl13
            }
            return;
            return;
        }
        do {
            if (!var2_2.hasNext()) ** continue;
        } while (!((var3_3 = (Entity)var2_2.next()) instanceof PlayerEntity));
        ** while (true)
    }

    private static String IlI(char[] cArray, long l2, int n) {
        int n2 = 0x4BA7037B ^ n;
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

    public Glow() {
        super(StringFactory.IIII("Glow"), Category.l, StringFactory.IIII("Applies a glowing outline to players using the current client theme."));
    }

    private static int lII(int n, int n2) {
        return l[n ^ 0x5A89F7E3] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIl(char c, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xE85C;
        char[] cArray = II[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            Glow.Il[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4261;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 57220;
            n7 ^= 0x5A15;
            n7 += 55241;
            n7 ^= 0x91BF;
            n7 += 57605;
            n7 -= 2212;
            n7 ^= 0x7AB8;
            cArray[n6] = (char)((n7 += 47680) ^ n4 ^ c ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

