/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllIl
 * Module         : NoInteract  [PLAYER]
 * Description    : Blocks right-click interactions with storage blocks.   (client's own text)
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
 *  net.minecraft.block.Block
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.util.hit.BlockHitResult
 */
package orchard.module.player;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.hit.BlockHitResult;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;

@Environment(value=EnvType.CLIENT)
public final class NoInteract
extends ModuleBase {
    private static String[] I;
    private static final int[] l;
    private static final String[] II;
    private static final Object[] Il;

    private static void I() {
        NoInteract.I[0] = NoInteract.lI(NoInteract.IlI('\u6212', -1002021169, (short)30583).toCharArray(), 83952L, 570503440);
        NoInteract.I[1] = NoInteract.lI(NoInteract.IlI('\u6213', 2146901423, (short)17818).toCharArray(), 87464L, -1028066651);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean l(MinecraftClient minecraftClient, BlockHitResult blockHitResult) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockHitResult == null) return false;
        Block block = minecraftClient.world.getBlockState(blockHitResult.getBlockPos()).getBlock();
        if (block == Blocks.CHEST) return true;
        if (block == Blocks.TRAPPED_CHEST) return true;
        if (block == Blocks.ENDER_CHEST) return true;
        if (block == Blocks.BARREL) return true;
        if (block instanceof ShulkerBoxBlock) return true;
        return false;
    }

    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0x2E657C02 ^ n;
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

    public NoInteract() {
        super(StringFactory.IIII("NoInteract"), Category.IIl, StringFactory.IIII("Blocks right-click interactions with storage blocks."));
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 23996;
        var7_2 = "\u14bf\u3918\u5046\u7286\u5387\u4927\u1183\u727e\uec9f\u1287\uea58\u81e1\u2884\u91ad\ud237\u0363\u7b21\ucda1\uf3a7\u1d2d\u0a1c\uc307\u1d05\u2e4a\ubb12\uf295\ubf06\u5aad\u6cd6\ud501\u3f0d\uab1f\u324d\uc19b\ucb88\u435d\u51b8\ud360\ued6f\udd84\u81b6\u888c\u1b90\uf7e8\u3d4f\uff5c\u8e7c\udc76\u99bc\u4e2d\u6108\u7eb1\u467b\u13d2\u2ee4\uf797\u1cd8\u6db5\ude53\u65e4\ue968\u6350\ucfc7\u0736\uc8ae\u5830\uf096\uac39\uf381\u90df\u11dd\u9505\uce79\u5cd8\u904e\u5447\u0c7c\u34aa\u1ae6\u645c\u0cc2\ufb6e\uccc0\u6b49\u9325\u4bd7\u3700\u67ea";
        var8_3 = "\u5df4\u5dac".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl16
        block6: while (true) {
            block12: {
                block13: {
                    var16_1 = v0;
                    v1 = var15_10++;
                    var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                    if (var15_10 < var14_9.length) break block12;
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_3.length) break block13;
                    var13_8 = 0;
lbl16:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = 0;
                    if (var13_8 == 0) {
                        NoInteract.II = var9_4;
                        NoInteract.Il = new Object[var9_4.length];
                        var2_13 = -481270992;
                        var0_11 = "\u0088\u00aa\u0093\u00e67\u00f0\u00ac\u00bd\u00b30\u0097\"6k\u001f\u009e".getBytes("ISO-8859-1");
                        var1_12 = var0_11.length / 4;
                        NoInteract.l = new int[var1_12];
                        var3_14 = 0;
                        var4_15 = 0;
                        do {
                            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                            NoInteract.l[var4_15] = var5_16 ^= var2_13;
                            var3_14 += 4;
                        } while (++var4_15 < var1_12);
                        NoInteract.I = new String[2];
                        NoInteract.I();
                        return;
                    }
                }
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
            }
            switch (var15_10 % 5) {
                case 1: {
                    v0 = 125;
                    continue block6;
                }
                case 4: {
                    v0 = 127;
                    continue block6;
                }
                case 3: {
                    v0 = 103;
                    continue block6;
                }
                case 2: {
                    v0 = 126;
                    continue block6;
                }
            }
            v0 = 86;
        }
    }

    private static int IIl(int n, int n2) {
        return l[n ^ 0xCD1A3841] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlI(char c, int n, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x6212;
        char[] cArray = II[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            NoInteract.Il[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5DCD;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x459;
            n6 += 2538;
            n6 ^= 0x9A9;
            n6 ^= 0x1896;
            n6 -= 2765;
            n6 ^= 0x3D04;
            n6 += 25734;
            n6 += 53016;
            n6 += 30252;
            cArray[n5] = (char)((n6 -= 18226) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

