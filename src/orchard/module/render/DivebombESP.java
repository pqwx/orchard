/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIllIlI
 * Module         : DivebombESP  [RENDER]
 * Description    : Draws a three-block heatmap on the ground below every player.   (client's own text)
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
 *  net.minecraft.client.render.RenderLayers
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  org.joml.Matrix4fc
 */
package orchard.module.render;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IllIlI;
import orchard.internal.lIIllllI;
import org.joml.Matrix4fc;

@Environment(value=EnvType.CLIENT)
public final class DivebombESP
extends ModuleBase {
    private static final int I = 8;
    private static final double l = 3.0;
    private static String[] II;
    private static final double Il = 0.05;
    private static final int lI = 72;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0xE22FAC9A ^ n;
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

    private Vec3d l(Vec3d vec3d, double d, int n) {
        double d2 = Math.PI * 2 * (double)n / 72.0;
        return vec3d.add(Math.cos(d2) * d, 0.0, Math.sin(d2) * d);
    }

    private Color lI(Color color, Color color2, double d) {
        double d2 = Math.max(0.0, Math.min(1.0, d));
        int n = (int)Math.round((double)color.getRed() + (double)(color2.getRed() - color.getRed()) * d2);
        int n2 = (int)Math.round((double)color.getGreen() + (double)(color2.getGreen() - color.getGreen()) * d2);
        int n3 = (int)Math.round((double)color.getBlue() + (double)(color2.getBlue() - color.getBlue()) * d2);
        return new Color(n, n2, n3);
    }

    /*
     * Unable to fully structure code
     */
    private void IIl(II var1_1, Vec3d var2_2) {
        var3_3 = IllIlI.IllIl(var1_1);
        var4_4 = var1_1.Il().peek().getPositionMatrix();
        var5_5 = IllIlI.IIlIII(var1_1).getBuffer(RenderLayers.debugQuads());
        var6_6 = 0;
        if (true) ** GOTO lbl52
        block0: while (true) {
            block8: {
                block7: {
                    block5: {
                        block6: {
                            ++var25_21;
lbl8:
                            // 2 sources

                            while (var25_21 < 72) {
                                break block5;
                            }
                            break block6;
                            while (true) {
                                var7_7 = 3.0 * (double)var6_6 / 8.0;
                                var9_8 = 3.0 * (double)(var6_6 + 1) / 8.0;
                                var11_9 = 1.0 - (double)var6_6 / 8.0;
                                var13_10 = 1.0 - (double)(var6_6 + 1) / 8.0;
                                var15_11 = this.IlI(var11_9);
                                var16_12 = this.IlI(var13_10);
                                var17_13 = (float)var15_11.getRed() / 255.0f;
                                var18_14 = (float)var15_11.getGreen() / 255.0f;
                                var19_15 = (float)var15_11.getBlue() / 255.0f;
                                var20_16 = (float)((24.0 + var11_9 * 126.0) / 255.0);
                                var21_17 = (float)var16_12.getRed() / 255.0f;
                                var22_18 = (float)var16_12.getGreen() / 255.0f;
                                var23_19 = (float)var16_12.getBlue() / 255.0f;
                                var24_20 = (float)((24.0 + var13_10 * 126.0) / 255.0);
                                var25_21 = 0;
                                ** GOTO lbl8
                                break;
                            }
                        }
                        ++var6_6;
                        break block7;
lbl31:
                        // 1 sources

                        while (true) {
                            var28_24 = this.IlI(1.0);
                            var29_25 = (float)var28_24.getRed() / 255.0f;
                            var30_27 = (float)var28_24.getGreen() / 255.0f;
                            var31_28 = (float)var28_24.getBlue() / 255.0f;
                            var32_29 = 0.5882353f;
                            var5_5.vertex((Matrix4fc)var4_4, (float)(var2_2.x - var3_3.x), (float)(var2_2.y - var3_3.y), (float)(var2_2.z - var3_3.z)).color(var29_25, var30_27, var31_28, var32_29);
                            var5_5.vertex((Matrix4fc)var4_4, (float)(var26_22.x - var3_3.x), (float)(var26_22.y - var3_3.y), (float)(var26_22.z - var3_3.z)).color(var21_17, var22_18, var23_19, var24_20);
                            var5_5.vertex((Matrix4fc)var4_4, (float)(var27_23.x - var3_3.x), (float)(var27_23.y - var3_3.y), (float)(var27_23.z - var3_3.z)).color(var21_17, var22_18, var23_19, var24_20);
                            var5_5.vertex((Matrix4fc)var4_4, (float)(var2_2.x - var3_3.x), (float)(var2_2.y - var3_3.y), (float)(var2_2.z - var3_3.z)).color(var29_25, var30_27, var31_28, var32_29);
                            continue block0;
                            break;
                        }
                    }
                    var26_22 = this.l(var2_2, var9_8, var25_21);
                    var27_23 = this.l(var2_2, var9_8, var25_21 + 1);
                    if (var6_6 == 0) {
                        ** continue;
                    }
                    break block8;
                }
                if (var6_6 < 8) ** continue;
                return;
            }
            var28_24 = this.l(var2_2, var7_7, var25_21);
            var29_26 = this.l(var2_2, var7_7, var25_21 + 1);
            var5_5.vertex((Matrix4fc)var4_4, (float)(var28_24.x - var3_3.x), (float)(var28_24.y - var3_3.y), (float)(var28_24.z - var3_3.z)).color(var17_13, var18_14, var19_15, var20_16);
            var5_5.vertex((Matrix4fc)var4_4, (float)(var26_22.x - var3_3.x), (float)(var26_22.y - var3_3.y), (float)(var26_22.z - var3_3.z)).color(var21_17, var22_18, var23_19, var24_20);
            var5_5.vertex((Matrix4fc)var4_4, (float)(var27_23.x - var3_3.x), (float)(var27_23.y - var3_3.y), (float)(var27_23.z - var3_3.z)).color(var21_17, var22_18, var23_19, var24_20);
            var5_5.vertex((Matrix4fc)var4_4, (float)(var28_24.x - var3_3.x), (float)(var28_24.y - var3_3.y), (float)(var28_24.z - var3_3.z)).color(var17_13, var18_14, var19_15, var20_16);
            var5_5.vertex((Matrix4fc)var4_4, (float)(var28_24.x - var3_3.x), (float)(var28_24.y - var3_3.y), (float)(var28_24.z - var3_3.z)).color(var17_13, var18_14, var19_15, var20_16);
            var5_5.vertex((Matrix4fc)var4_4, (float)(var27_23.x - var3_3.x), (float)(var27_23.y - var3_3.y), (float)(var27_23.z - var3_3.z)).color(var21_17, var22_18, var23_19, var24_20);
            var5_5.vertex((Matrix4fc)var4_4, (float)(var29_26.x - var3_3.x), (float)(var29_26.y - var3_3.y), (float)(var29_26.z - var3_3.z)).color(var17_13, var18_14, var19_15, var20_16);
            var5_5.vertex((Matrix4fc)var4_4, (float)(var28_24.x - var3_3.x), (float)(var28_24.y - var3_3.y), (float)(var28_24.z - var3_3.z)).color(var17_13, var18_14, var19_15, var20_16);
        }
    }

    public DivebombESP() {
        super(StringFactory.IIII("DivebombESP"), Category.l, StringFactory.IIII("Draws a three-block heatmap on the ground below every player."));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 18168;
        String string = "\u2ef9\uf285\ue4a5\u2576\ud31a\u7317\u756e\u1118\u28da\ub5d4\u931c\uc4d8\ue1ea\uda4d\ua8e8\u9e05\ufe9c\u5f52\u4652\uf519\u4c98\uee72\u8c04\u8020\u3ea0\u5a49\u8e5a\ua826\u307f\u346e\uf024\u5c2b\u691f\u1ed7\u3b20\uf184\uf071\uf813\uc70f\u485c\uae5e\u9ead\u77d4\u1cff\udc5d\uf308\u43ba\uedea\u8c8d\u9fa5\u2a27\u8c4e\u69ce\u099a\u50f9\uff4b\ufb2e\u52f4\u97e6\ue398\u9da5\udf39\u2f19\u7a6f\ub5b7\ue629\u1031\udcba\u0d63\u87e7\u34d8\u2e58\u8ae6\udaf8\u78c6\ua9c5\uaf76\u1440\ua6e3\u70cc\u9c5e\u093d\uad28\udaa3\uf67e\uab73\u1a69\u6254\u10f7\u949d\u74a1\u84aa\u47f2\u4aaf\u5d63\u7a0e\u6639\u08d1\u69ed\u373e";
        char[] cArray = "\u46ac\u46e8".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            int n4;
            int n5;
            if (!bl || (bl = false) || !true) {
                n4 = cArray[n5] ^ n;
                stringArray[n5] = string.substring(n3, n3 + n4);
                n3 += n4;
                if (++n5 < cArray.length) continue;
                n2 = 0;
            }
            n5 = 0;
            n3 = 0;
            n4 = 0;
            if (n2 == 0) break;
        }
        III = stringArray;
        IIl = new Object[stringArray.length];
        int n6 = 48067187;
        byte[] byArray = "\u00f4<\u00db\u00c0M\u00e1\u0014\u00dc\u009a\u00dfuA)<%<C\u00dc\u0086\u0084\u00a6\u00142\u009cf7\u009cQ\u009cN#\u00c2\u009e\u00eed\u00f6\u00c6\u00a5a\u000b\u00eb\u00db\u00a1\u000bl\u0018\u001ff_\u001f\u00c4\u00a4<\u00b02\u00a8\u00fa\u0001\u00cd\u001d\u00fa~[\u0081\u00e2\u001bR\u00ae\u0005[g\u00a0".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        ll = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            DivebombESP.ll[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        II = new String[2];
        DivebombESP.lII();
    }

    private Color IlI(double d) {
        if (d >= 0.5) {
            double d2 = (d - 0.5) * 2.0;
            return this.lI(new Color(255, 145, 20), new Color(255, 35, 15), d2);
        }
        return this.lI(new Color(255, 225, 55), new Color(255, 145, 20), d * 2.0);
    }

    private static void lII() {
        DivebombESP.II[0] = DivebombESP.I(DivebombESP.IIII(-946204060, 55982, 58893).toCharArray(), 18808L, -1856932670);
        DivebombESP.II[1] = DivebombESP.I(DivebombESP.IIII(1443457951, 55983, 48301).toCharArray(), 75353L, 587191801);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void Ill(II var1_1) {
        block18: {
            block16: {
                block13: {
                    block14: {
                        block10: {
                            block12: {
                                block15: {
                                    if (!this.IIIlIIl()) break block15;
                                    break block16;
lbl3:
                                    // 1 sources

                                    while (true) {
                                        var5_5 = (PlayerEntity)var4_4.next();
                                        if (var5_5 != null) {
                                            break block10;
                                        }
                                        ** GOTO lbl32
                                        break;
                                    }
                                }
lbl9:
                                // 2 sources

                                return;
lbl11:
                                // 1 sources

                                while (true) {
                                    block11: {
                                        block17: {
                                            var2_2 = MinecraftClient.getInstance();
                                            if (var2_2 == null) break block11;
                                            break block17;
lbl15:
                                            // 1 sources

                                            while (var2_2.player == null) {
                                                break block11;
                                            }
                                            break block12;
                                        }
                                        if (var2_2.world == null) break block11;
                                        ** GOTO lbl15
                                        return;
                                    }
                                    return;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    if (var5_5.isRemoved()) ** GOTO lbl32
                                    break block13;
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var6_6 = IllIlI.IIlIlI((Entity)var5_5, var3_3);
                                    var7_7 = this.lIl(var2_2, var5_5, var6_6);
                                    if (var7_7 != null) break block14;
lbl32:
                                    // 8 sources

                                    while (true) {
                                        if (!var4_4.hasNext()) ** continue;
                                        ** continue;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var3_3 = lIIllllI.IlIIII(var2_2);
                            var4_4 = var2_2.world.getPlayers().iterator();
                            ** GOTO lbl32
                        }
                        if (!var5_5.isAlive()) ** GOTO lbl32
                        ** while (true)
                    }
                    this.IIl(var1_1, var7_7);
                    ** GOTO lbl32
                }
                if (!var5_5.isSpectator()) break block18;
                ** GOTO lbl32
            }
            ** while (IllIlI.lIIll((Object)var1_1))
lbl50:
            // 1 sources

            ** while (true)
        }
        ** while (var5_5 != var2_2.player)
lbl53:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d lIl(MinecraftClient minecraftClient, PlayerEntity playerEntity, Vec3d vec3d) {
        Vec3d vec3d2;
        Vec3d vec3d3 = vec3d.add(0.0, 1.0, 0.0);
        BlockHitResult blockHitResult = minecraftClient.world.raycast(new RaycastContext(vec3d3, vec3d2 = new Vec3d(vec3d.x, (double)minecraftClient.world.getBottomY() - 1.0, vec3d.z), RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, (Entity)playerEntity));
        if (blockHitResult == null) return null;
        if (blockHitResult.getType() != HitResult.Type.BLOCK) {
            return null;
        }
        Vec3d vec3d4 = blockHitResult.getPos();
        return new Vec3d(vec3d.x, vec3d4.y + 0.05, vec3d.z);
    }

    private static int lll(int n, int n2) {
        return ll[n ^ 0xF2051C46] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIII(int n, int n2, int n3) {
        StackTraceElement[] stackTraceElementArray;
        int n4 = n2 ^ 0xDAAE;
        char[] cArray = III[n4].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n4];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            DivebombESP.IIl[n4] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n5 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x284A;
        int n6 = 0;
        do {
            int n7 = n6++;
            int n8 = cArray[n7] - 47731;
            n8 -= 35263;
            n8 -= 47259;
            n8 += 14148;
            n8 ^= 0xB636;
            n8 ^= 0xF3EF;
            n8 -= 31524;
            n8 += 14921;
            n8 ^= 0x6DE6;
            cArray[n7] = (char)((n8 += 34117) ^ n5 ^ n3 ^ n >> 16);
        } while (n6 < cArray.length);
        return new String(cArray).intern();
    }
}

