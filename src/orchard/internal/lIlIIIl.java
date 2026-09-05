/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Silent
 *   - Legit
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
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
final class lIlIIIl
extends Enum<lIlIIIl> {
    private final IIIlIIIII I;
    public static final /* enum */ lIlIIIl l;
    private static final /* synthetic */ lIlIIIl[] II;
    public static final /* enum */ lIlIIIl Il;
    private static final String[] lI;
    private static final Object[] ll;

    private lIlIIIl(IIIlIIIII iIIlIIIII) {
        this.I = iIIlIIIII;
    }

    public String toString() {
        return this.I.IIII();
    }

    private static /* synthetic */ lIlIIIl[] I() {
        return new lIlIIIl[]{l, Il};
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 18992;
        var1_1 = "U\u00ca[\u0094\u00b4A\u1f6e\u1fce\u1f4e\u1f8c\u1f98\u1f5d\u1fc9\u1f2d\ubc88\ubc0c\ubc85\ubc5c\ubc7b\ubc99\uc3c8\uc312\uc39a\uc322\uc33a\uc3fd\uc33e\uc3f7";
        var2_2 = "\u4a36\u4a38\u4a36\u4a38".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        if (true) ** GOTO lbl16
        block7: while (true) {
            block8: {
                block9: {
                    var10_10 = v0;
                    v1 = var9_9++;
                    var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
                    if (var9_9 < var8_8.length) break block8;
                    var3_3[var4_4] = new String(var8_8).intern();
                    var5_5 += var6_6;
                    if (++var4_4 < var2_2.length) break block9;
                    var7_7 = 0;
lbl16:
                    // 2 sources

                    var4_4 = 0;
                    var5_5 = 0;
                    var6_6 = 0;
                    if (var7_7 == 0) ** GOTO lbl41
                }
                var6_6 = var2_2[var4_4] ^ var0;
                var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                var9_9 = 0;
            }
            switch (var9_9 % 6) {
                case 3: {
                    v0 = 94;
                    continue block7;
                }
                case 1: {
                    v0 = 38;
                    continue block7;
                }
                case 4: {
                    v0 = 5;
                    continue block7;
                }
                default: {
                    v0 = 87;
                    continue block7;
                }
                case 2: {
                    v0 = 36;
                    continue block7;
                }
lbl41:
                // 1 sources

                lIlIIIl.lI = var3_3;
                lIlIIIl.ll = new Object[var3_3.length];
                lIlIIIl.l = new lIlIIIl(StringFactory.IIII("Legit"));
                lIlIIIl.Il = new lIlIIIl(StringFactory.IIII("Silent"));
                break block7;
                case 5: 
            }
            v0 = 21;
        }
        lIlIIIl.II = lIlIIIl.I();
    }

    public static lIlIIIl[] values() {
        return (lIlIIIl[])II.clone();
    }

    public static lIlIIIl l(String string) {
        return Enum.valueOf(lIlIIIl.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x2E0C89BE;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIlIIIl.ll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7D2760D;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 28 -> 194;
                case 22 -> 53;
                case 1 -> 163;
                case 19 -> 233;
                case 7 -> 55;
                case 16 -> 100;
                case 24 -> 227;
                case 2 -> 45;
                case 17 -> 175;
                default -> 76;
                case 10 -> 67;
                case 5 -> 24;
                case 6 -> 175;
                case 8 -> 230;
                case 25 -> 177;
                case 30 -> 31;
                case 9 -> 170;
                case 23 -> 30;
                case 4 -> 240;
                case 26 -> 57;
                case 15 -> 195;
                case 18 -> 232;
                case 12 -> 33;
                case 20 -> 116;
                case 29 -> 141;
                case 21 -> 130;
                case 3 -> 135;
                case 13 -> 17;
                case 27 -> 231;
                case 11 -> 86;
                case 14 -> 98;
                case 31 -> 79;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

