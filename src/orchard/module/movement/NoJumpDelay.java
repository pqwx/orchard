/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIlIIll
 * Module         : NoJumpDelay  [MOVEMENT]
 * Description    : Removes the vanilla jump cooldown.   (client's own text)
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
 */
package orchard.module.movement;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.mixin.LivingEntityMixin3;

@Environment(value=EnvType.CLIENT)
public final class NoJumpDelay
extends ModuleBase {
    private static String[] I;
    private static final int[] l;
    private static final String[] II;
    private static final Object[] Il;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        ((LivingEntityMixin3)minecraftClient.player).ilovcats$setJumpingCooldown(0);
    }

    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0x2CBACDC5 ^ n;
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

    private static void IIl() {
        NoJumpDelay.I[0] = NoJumpDelay.lI(NoJumpDelay.lII('\ud450', '\u718d', 1759583651).toCharArray(), 40281L, 1798808033);
        NoJumpDelay.I[1] = NoJumpDelay.lI(NoJumpDelay.lII('\uff54', '\u718c', -943831999).toCharArray(), 92984L, 1183957449);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 21176;
        var7_2 = "\u6ecf\u8f05\udd39\u1bad\ua317\uc7f5\ua7ea\u994d\ubebb\u14e0\u3614\u3433\ubdcc\u2ded\u0b02\u1386\u0943\u3db0\u2797\u3bbc\ud7d3\u326e\u830d\ub41a\u391e\u459c\ua3c8\u1eb2\uaafb\ue6a3\uff30\u7c16\u1fb2\u29d0\ue574\ue929\u74ee\udd0f\u55b2\uc171\u6bcd\u7016\ubd4a\u54b4\uaafe\u820d\u88f6\uba87\ue102\uf98c\u6120\u1b7f\u875f\u32e1\u374b\u25bd\u9aa3\u4a52\u4cdf\uaeb6\u643a\u42fb\u265e\uf01a";
        var8_3 = "0\u0010".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl12
        while (true) {
            block10: {
                block9: {
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_3.length) break block9;
                    var13_8 = 0;
lbl12:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = '\u0000';
                    if (var13_8 == 0) break block10;
                }
                var12_7 = var8_3[var10_5];
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl43
            }
            NoJumpDelay.II = var9_4;
            NoJumpDelay.Il = new Object[var9_4.length];
            var2_11 = 1561399964;
            var0_12 = "\u0018\u001b9\u00e1:FN\u00c8\u00baP\u00e8]\u00feC\u009b\u00f4".getBytes("ISO-8859-1");
            var1_13 = var0_12.length / 4;
            NoJumpDelay.l = new int[var1_13];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
                NoJumpDelay.l[var4_15] = var5_16 ^= var2_11;
                var3_14 += 4;
            } while (++var4_15 < var1_13);
            NoJumpDelay.I = new String[2];
            NoJumpDelay.IIl();
            return;
        }
        block8: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
            if (var15_10 >= var14_9.length) ** continue;
lbl43:
            // 2 sources

            switch (var15_10 % 5) {
                case 2: {
                    v0 = 12;
                    continue block8;
                }
                case 4: {
                    v0 = 127;
                    continue block8;
                }
                case 1: {
                    v0 = 77;
                    continue block8;
                }
                case 3: {
                    v0 = 37;
                    continue block8;
                }
            }
            v0 = 14;
        }
    }

    public NoJumpDelay() {
        super(StringFactory.IIII("NoJumpDelay"), Category.ll, StringFactory.IIII("Removes the vanilla jump cooldown."));
    }

    private static int IlI(int n, int n2) {
        return l[n ^ 0xCCAB5FE0] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lII(char c, char c2, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0x718D;
        char[] cArray = II[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Il[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            NoJumpDelay.Il[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2031;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xC866;
            n6 -= 40101;
            n6 += 57500;
            cArray[n5] = (char)((n6 -= 13577) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

