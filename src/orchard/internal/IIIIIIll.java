/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Refills low hotbar stacks from inventory.
 *   - Stack Refill
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
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIll;
import orchard.internal.lIlIllll;

@Environment(value=EnvType.CLIENT)
public final class IIIIIIll
extends IIIlIIll {
    private static String[] I;
    private static final int[] lIIl;
    private static final String[] lIll;
    private static final Object[] llII;

    private static void I() {
        IIIIIIll.I[0] = IIIIIIll.l(IIIIIIll.lIIll(-541450692, 27200, (short)23115).toCharArray(), 96988L, 1397742350);
        IIIIIIll.I[1] = IIIIIIll.l(IIIIIIll.lIIll(1861761563, 27201, (short)53022).toCharArray(), 57249L, -330496141);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 4450;
        var7_1 = "\uf582\u854f\u303b\u9da3\uda43\uf105\u6bf4\u8b49\u00b6\ue093\u5e7a\ubeb9\u5dc5\u9aef\u1617\u6d97\u4dba\u262e\ue891\uf655\u34b8\u0e30\u22ec\ub5f4\uaebf\u48b7\u22ac\u79da\u7c80\ub826\u5dac\u8038\u618a\u4a1f\u98b8\u9265\u34f2\u8956\u6959\u506b\ua666\ua6e5\u0f37\uc0d8\u8c08\u7e0c\u0643\u4ef2\u6378\ud647\ue051\u1daa\u0be7\u5461\u4a9b\u29e3\u7ad0\u9cfa\u3acb\ube89\u2483\uc61c\u9ef7\u50ef\u3d6c\uddbe\ub512\u4eb5\ua082\u460c\u7b08\uaee7";
        var8_2 = "\u00108".toCharArray();
        var9_4 = new String[var8_2.length];
        var13_8 = -1;
        if (true) ** GOTO lbl16
        block7: while (true) {
            block13: {
                block14: {
                    var16_3 = v0;
                    v1 = var15_10++;
                    var14_9[v1] = (char)(var14_9[v1] ^ var16_3 ^ var6);
                    if (var15_10 < var14_9.length) break block13;
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_2.length) break block14;
                    var13_8 = 0;
lbl16:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = '\u0000';
                    if (var13_8 == 0) {
                        IIIIIIll.lIll = var9_4;
                        IIIIIIll.llII = new Object[var9_4.length];
                        var2_13 = 1654708966;
                        var0_11 = "\u00b0\u001f\u0099\f\u0080Pt{\u00d5\u00ban\u0015\u008f\u00a3\u0000\u000f".getBytes("ISO-8859-1");
                        var1_12 = var0_11.length / 4;
                        IIIIIIll.lIIl = new int[var1_12];
                        var3_14 = 0;
                        var4_15 = 0;
                        do {
                            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                            IIIIIIll.lIIl[var4_15] = var5_16 ^= var2_13;
                            var3_14 += 4;
                        } while (++var4_15 < var1_12);
                        IIIIIIll.I = new String[2];
                        IIIIIIll.I();
                        return;
                    }
                }
                var12_7 = var8_2[var10_5];
                var14_9 = var7_1.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
            }
            switch (var15_10 % 6) {
                case 3: {
                    v0 = 88;
                    continue block7;
                }
                case 2: {
                    v0 = 65;
                    continue block7;
                }
                case 4: {
                    v0 = 107;
                    continue block7;
                }
                default: {
                    v0 = 9;
                    continue block7;
                }
                case 5: {
                    v0 = 6;
                    continue block7;
                }
                case 1: 
            }
            v0 = 36;
        }
    }

    public IIIIIIll() {
        super((Object)StringFactory.IIII("Stack Refill"), StringFactory.IIII("Refills low hotbar stacks from inventory."), lIlIllll.Il, true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(char[] cArray, long l2, int n) {
        int n2 = 0xE28440E9 ^ n;
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

    private static int lIIlI(int n, int n2) {
        return lIIl[n ^ 0xCAD9EEDC] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIIll(int n, int n2, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0x6A40;
        char[] cArray = lIll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llII[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIIIll.llII[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4112;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 7897;
            n7 -= 57487;
            n7 ^= 0xA620;
            n7 += 35558;
            cArray[n6] = (char)((n7 -= 57698) ^ n4 ^ s ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

