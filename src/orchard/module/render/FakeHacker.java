/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIlll
 * Module         : FakeHacker  [RENDER]
 * Description    : Makes a named player look at you and swing client-side.   (client's own text)
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Target
 *   - blocks
 *   - Range
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
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.lIlIIlI;
import orchard.internal.lllIlI;

@Environment(value=EnvType.CLIENT)
public final class FakeHacker
extends ModuleBase {
    private static final float I = 4.5f;
    private static final float l = 6.0f;
    private int II;
    private static final float Il = 75.0f;
    private static final float lI = 32.0f;
    private int ll = -1;
    private static final float III = 7.5f;
    private static final int IIl = 2;
    private final lllIlI IlI = this.IIlllIl(new lllIlI((Object)StringFactory.IIII("Target"), ""));
    private static String[] Ill;
    private int lII;
    private final lIlIIlI lIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Range"), 8.0, 1.0, 64.0, 0.5).IIIl("blocks"));
    private static final float llI = 8.0f;
    private static final int lll = 12;
    private static final int[] IIII;
    private static final String[] IIIl;
    private static final Object[] IIlI;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null && minecraftClient.world != null && minecraftClient.player != null) {
            PlayerEntity playerEntity = this.l(minecraftClient);
            if (playerEntity == null) {
                this.II = 0;
                this.ll = -1;
                this.lII = 0;
                return;
            }
            if (this.ll != playerEntity.getId()) {
                this.ll = playerEntity.getId();
                this.lII = 2;
            }
            this.lI((PlayerEntity)minecraftClient.player, playerEntity);
            if (++this.II < 12) return;
            this.II = 0;
            playerEntity.swingHand(Hand.MAIN_HAND);
            return;
        }
        this.II = 0;
    }

    public FakeHacker() {
        super(StringFactory.IIII("FakeHacker"), Category.l, StringFactory.IIII("Makes a named player look at you and swing client-side."));
    }

    private float I(float f, float f2, float f3) {
        float f4 = MathHelper.wrapDegrees((float)(f2 - f));
        if (Math.abs(f4) <= f3) {
            return f2;
        }
        return f + Math.copySign(f3, f4);
    }

    /*
     * Unable to fully structure code
     */
    private PlayerEntity l(MinecraftClient var1_1) {
        block6: {
            block7: {
                block5: {
                    block4: {
                        var2_2 = ((String)this.IlI.lIl()).trim();
                        if (!var2_2.isEmpty()) break block6;
                        break block7;
lbl4:
                        // 1 sources

                        while (var6_5.getName().getString().equalsIgnoreCase(var2_2) && var6_5.squaredDistanceTo((Entity)var1_1.player) <= var3_3) {
                            break block4;
                        }
                        break block5;
lbl7:
                        // 1 sources

                        while ((var6_5 = (PlayerEntity)var5_4.next()) == var1_1.player) {
                            break block5;
                        }
                        ** GOTO lbl4
                    }
                    return var6_5;
                    return null;
                }
lbl15:
                // 2 sources

                while (true) {
                    if (!var5_4.hasNext()) ** continue;
                    ** GOTO lbl7
                    break;
                }
            }
            return null;
        }
        var3_3 = (Double)this.lIl.lIl() * (Double)this.lIl.lIl();
        var5_4 = var1_1.world.getPlayers().iterator();
        ** while (true)
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 18485;
        var7_5 = "\u0489\u1ee6\u5135\u084f\u27d8\ue6c1\u0d91\ua071\u1f8f\u9cec\u4869\u9f00\ucf53\uf957\u7ff7\u7c0b\ua72d\u2a93\u1170\uf558\u592e\u6100\u4bee\ubfc4\u0d40\u1bb6\u3afc\u0d9a\uefc9\u771f\u4190\u5987\u08f0\u4a54\u945f\u3c5c\u7cf5\ue299\uc52f\u29f6\u9415\uf237\u18cc\u0520\ub0aa\u605f\u73a9\ue0c9\u1c66\ue3c4\u4e83\u4085\ud781\u8dea\ubfde\u6695\u2463\uf32e\ubf51\u2565\u44ee\u365b\uba5a\u1060\u7336\u31b1\u78ef\ucdd3\u6ed6\uf787\uca2f\u4eef\u249a\u190b\u625b\u52bb\u5cf8\uf068\udd78\udfad\u1fa9\u7e64\u95b7\ub84d\ucb33\u5bda\u330b\ufdbe\u3948\u5e95\uf976\u45f7\u6838\ud842\ud7c6\u8000\ubccf\uc88a\u6e23\u4644\uab15\u8011\u0a95\u3cc5\u2d83\u6848\u4fbc\u6b71\u9b8b\uc82e\ucb70\ueeae\ud8ae\ucd29\u3ebf\ue493";
        var8_6 = "\b\b\u0010\bL".toCharArray();
        var9_7 = new String[var8_6.length];
        var13_11 = -1;
        if (true) ** GOTO lbl15
        while (true) {
            block9: {
                block10: {
                    v0 = var15_13++;
                    var14_12[v0] = (char)(var14_12[v0] ^ var16_14 ^ var6);
                    if (var15_13 < var14_12.length) break block9;
                    var9_7[var10_8] = new String(var14_12).intern();
                    var11_9 += var12_10;
                    if (++var10_8 < var8_6.length) break block10;
                    var13_11 = 0;
lbl15:
                    // 2 sources

                    var10_8 = 0;
                    var11_9 = 0;
                    var12_10 = '\u0000';
                    if (var13_11 == 0) break;
                }
                var12_10 = var8_6[var10_8];
                var14_12 = var7_5.substring(var11_9, var11_9 + var12_10).toCharArray();
                var15_13 = 0;
            }
            switch (var15_13 % 5) {
                default: {
                    v1 = 113;
                    break;
                }
                case 1: {
                    v1 = 10;
                    break;
                }
                case 3: {
                    v1 = 51;
                    break;
                }
                case 4: {
                    v1 = 17;
                    break;
                }
                case 2: {
                    v1 = 16;
                }
            }
            var16_14 = v1;
        }
        FakeHacker.IIIl = var9_7;
        FakeHacker.IIlI = new Object[var9_7.length];
        var2_3 = 29037860;
        var0_1 = "\u00b1C_|P\u00a6\u00a5\u00d7\u00c8n\u00ff\u0013S\u0093\u000b\u00a1!\u0091z0\u009e\u001fc\u00de}\u001a\u00c5\u008f\u009a\u009ahO3\u00c9'\u00a2\u00b3\u0003\u00a1b".getBytes("ISO-8859-1");
        var1_2 = var0_1.length / 4;
        FakeHacker.IIII = new int[var1_2];
        var3_4 = 0;
        var4_15 = 0;
        do {
            var5_16 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
            FakeHacker.IIII[var4_15] = var5_16 ^= var2_3;
            var3_4 += 4;
        } while (++var4_15 < var1_2);
        FakeHacker.Ill = new String[6];
        FakeHacker.II();
    }

    private static void II() {
        FakeHacker.Ill[0] = FakeHacker.IIl(FakeHacker.lII('\u1693', -787324541, '\u8e9d').toCharArray(), 37168L, 966293686);
        FakeHacker.Ill[1] = FakeHacker.IIl(FakeHacker.lII('\u1692', -1025020940, '\ufa2e').toCharArray(), 76373L, 335765292);
        FakeHacker.Ill[2] = FakeHacker.IIl(FakeHacker.lII('\u1691', 1472226881, '\ue686').toCharArray(), 57301L, 6614282);
        FakeHacker.Ill[3] = FakeHacker.IIl(FakeHacker.lII('\u1690', -1916060372, '\u8954').toCharArray(), 87456L, -1870159555);
        FakeHacker.Ill[4] = FakeHacker.IIl(FakeHacker.lII('\u1697', 1910777695, '\u2f7e').toCharArray(), 25637L, 1452071272);
        FakeHacker.Ill[5] = FakeHacker.IIl("".toCharArray(), 48624L, -2034576694);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lI(PlayerEntity playerEntity, PlayerEntity playerEntity2) {
        float f;
        float f2;
        Vec3d vec3d = playerEntity2.getEyePos();
        Vec3d vec3d2 = playerEntity.getEyePos();
        double d = vec3d2.x - vec3d.x;
        double d2 = vec3d2.y - vec3d.y;
        double d3 = vec3d2.z - vec3d.z;
        double d4 = Math.sqrt(d * d + d3 * d3);
        float f3 = (float)(MathHelper.atan2((double)d3, (double)d) * 57.2957763671875) - 90.0f;
        float f4 = (float)(-(MathHelper.atan2((double)d2, (double)d4) * 57.2957763671875));
        if (this.lII > 0) {
            --this.lII;
            return;
        }
        float f5 = playerEntity2.bodyYaw;
        float f6 = MathHelper.clamp((float)MathHelper.wrapDegrees((float)(f3 - f5)), (float)-75.0f, (float)75.0f);
        float f7 = f5 + f6;
        float f8 = this.I(playerEntity2.headYaw, f7, 8.0f);
        float f9 = MathHelper.wrapDegrees((float)(f8 - (f2 = f5)));
        if (Math.abs(f9) > 32.0f) {
            f2 = this.I(f2, f3, 4.5f);
            f9 = MathHelper.wrapDegrees((float)(f8 - f2));
        }
        if (Math.abs(f9) > 75.0f) {
            f = f8 - Math.copySign(75.0f, f9);
            f2 = this.I(f2, f, 7.5f);
            f9 = MathHelper.wrapDegrees((float)(f8 - f2));
        }
        if (Math.abs(f9) > 75.0f) {
            f8 = f2 + Math.copySign(75.0f, f9);
        }
        f = this.I(playerEntity2.getPitch(), f4, 6.0f);
        playerEntity2.setYaw(f2);
        playerEntity2.bodyYaw = f2;
        playerEntity2.headYaw = f8;
        playerEntity2.setPitch(f);
    }

    private static String IIl(char[] cArray, long l2, int n) {
        int n2 = 0x9A6E2E7 ^ n;
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

    private static int IlI(int n, int n2) {
        return IIII[n ^ 0xBF1977B8] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lII(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x1693;
        char[] cArray = IIIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIlI[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            FakeHacker.IIlI[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1B4D;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 19759;
            n6 ^= 0x60D3;
            n6 -= 49280;
            n6 ^= 0x9B87;
            n6 += 5100;
            n6 += 37662;
            n6 ^= 0xCD9;
            cArray[n5] = (char)((n6 -= 61726) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

