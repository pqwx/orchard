/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllllll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Approach
 *   - Hit
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
public final class lIllllll
extends Enum<lIllllll> {
    private final IIIlIIIII I;
    public static final /* enum */ lIllllll l;
    public static final /* enum */ lIllllll II;
    private static final /* synthetic */ lIllllll[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    public String toString() {
        return this.I.IIII();
    }

    private lIllllll(IIIlIIIII iIIlIIIII) {
        this.I = iIIlIIIII;
    }

    public static lIllllll valueOf(String string) {
        return Enum.valueOf(lIllllll.class, string);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 23183;
        String string = "\u097a\u099c\u0935\u2b5f\u2b81\u2b4e\u2bef\u80d7\u8021\u8095\u8046\u8031\u805f\u804b\u802c\u43f4\u433f\u4380\u4346\u4303\u4361\u4345\u4324\u435c\u436f\u4378\u4334";
        char[] cArray = "\u5a8c\u5a8b\u5a87\u5a83".toCharArray();
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
        lI = stringArray;
        ll = new Object[stringArray.length];
        II = new lIllllll(StringFactory.IIII("Hit"));
        l = new lIllllll(StringFactory.IIII("Approach"));
        Il = lIllllll.I();
    }

    private static /* synthetic */ lIllllll[] I() {
        return new lIllllll[]{II, l};
    }

    public static lIllllll[] values() {
        return (lIllllll[])Il.clone();
    }

    /*
     * Unable to fully structure code
     */
    private static String l(int var0, int var1_1) {
        block46: {
            block49: {
                block47: {
                    block48: {
                        break block48;
lbl1:
                        // 1 sources

                        while (true) {
                            var9_9 = 11;
                            break block46;
                            break;
                        }
lbl4:
                        // 1 sources

                        while (true) {
                            var9_9 = 180;
                            break block46;
                            break;
                        }
lbl7:
                        // 1 sources

                        while (true) {
                            var9_9 = 148;
                            break block46;
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            continue;
lbl12:
                            // 1 sources

                            while (true) {
                                var9_9 = 46;
                                break block46;
                                break;
                            }
                            break;
                        }
lbl15:
                        // 1 sources

                        while (true) {
                            if (++var8_8 < var4_4.length) break block47;
                            ** GOTO lbl99
                            break;
                        }
lbl18:
                        // 1 sources

                        while (var2_3 != null) {
                            ** GOTO lbl130
                        }
                        break block49;
lbl21:
                        // 1 sources

                        while (true) {
                            var9_9 = 83;
                            break block46;
                            break;
                        }
                    }
                    var3_2 = var0 ^ 1930895780;
                    var4_4 = lIllllll.lI[var3_2].toCharArray();
                    ** GOTO lbl53
                    var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 436641539;
                    var8_8 = 0;
                    break block47;
lbl31:
                    // 1 sources

                    while (true) {
                        var9_9 = 208;
                        break block46;
                        break;
                    }
lbl34:
                    // 1 sources

                    while (true) {
                        var9_9 = 176;
                        break block46;
                        break;
                    }
                }
                switch (var8_8 & 31) {
                    case 2: {
                        ** continue;
                    }
                    case 13: {
                        ** continue;
                    }
                    case 19: {
                        ** continue;
                    }
                    case 14: {
                        ** continue;
                    }
                    case 28: {
                        ** continue;
                    }
                    case 8: {
                        ** continue;
                    }
                    case 4: {
                        ** continue;
                    }
lbl53:
                    // 1 sources

                    var2_3 = (StackTraceElement[])lIllllll.ll[var3_2];
                    ** GOTO lbl18
                    case 24: {
                        var9_9 = 78;
                        break;
                    }
                    case 7: {
                        var9_9 = 170;
                        break;
                    }
                    case 1: {
                        var9_9 = 191;
                        break;
                    }
                    case 23: {
                        var9_9 = 231;
                        break;
                    }
                    case 6: {
                        var9_9 = 198;
                        break;
                    }
lbl70:
                    // 1 sources

                    while (true) {
                        ** continue;
                        break;
                    }
                    case 31: {
                        var9_9 = 223;
                        break;
                    }
                    case 12: {
                        var9_9 = 148;
                        break;
                    }
                    case 21: {
                        var9_9 = 58;
                        break;
                    }
lbl81:
                    // 2 sources

                    while (true) {
                        var6_6 = var5_5[1];
                        ** continue;
                        break;
                    }
                    case 10: {
                        var9_9 = 240;
                        break;
                    }
                    case 27: {
                        var9_9 = 73;
                        break;
                    }
                    case 9: {
                        var9_9 = 206;
                        break;
                    }
lbl93:
                    // 1 sources

                    while (true) {
                        lIllllll.ll[var3_2] = var5_5;
                        ** GOTO lbl81
                        break;
                    }
                    case 20: {
                        var9_9 = 211;
                        break;
                    }
lbl99:
                    // 1 sources

                    return new String(var4_4).intern();
                    case 11: {
                        var9_9 = 208;
                        break;
                    }
                    case 15: {
                        var9_9 = 191;
                        break;
                    }
                    default: {
                        var9_9 = 88;
                        break;
                    }
                    case 18: {
                        var9_9 = 196;
                        break;
                    }
                    case 16: {
                        var9_9 = 223;
                        break;
                    }
                    case 29: {
                        var9_9 = 225;
                        break;
                    }
                    case 26: {
                        var9_9 = 239;
                        break;
                    }
                    case 3: {
                        var9_9 = 218;
                        break;
                    }
                    case 17: {
                        var9_9 = 154;
                        break;
                    }
                    case 25: {
                        var9_9 = 102;
                        break;
                    }
lbl130:
                    // 1 sources

                    var5_5 = var2_3;
                    ** continue;
                    case 30: {
                        var9_9 = 50;
                        break;
                    }
                    case 5: {
                        var9_9 = 208;
                        break;
                    }
                    case 22: {
                        var9_9 = 174;
                        break;
                    }
                }
                break block46;
            }
            var5_5 = new Throwable().getStackTrace();
            ** while (true)
        }
        var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
        ** while (true)
    }
}

