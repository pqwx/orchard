/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Partial
 *   - Full
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
public final class IlIll
extends Enum<IlIll> {
    private final IIIlIIIII I;
    public static final /* enum */ IlIll l;
    public static final /* enum */ IlIll II;
    private static final /* synthetic */ IlIll[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    public String toString() {
        return this.I.IIII();
    }

    public static IlIll valueOf(String string) {
        return Enum.valueOf(IlIll.class, string);
    }

    private static /* synthetic */ IlIll[] I() {
        return new IlIll[]{II, l};
    }

    private IlIll(IIIlIIIII iIIlIIIII) {
        this.I = iIIlIIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 11136;
        String string = "\ud2e4\ud2ff\ud295\ud2eb\ud20e\ud2b5\ud2fd\u513b\u510a\u516f\u5106\u51d0\u5148\u510d\u51f8\u51ed\u5171\u5186\u513e\u99b5\u99ac\u99cc\u99b4\ucc4e\ucc5d\ucc0d\ucc6a\ucca0\ucc39\ucc00\ucce0";
        char[] cArray = "\u2b87\u2b8c\u2b84\u2b88".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                lI = stringArray;
                ll = new Object[stringArray.length];
                II = new IlIll(StringFactory.IIII("Partial"));
                l = new IlIll(StringFactory.IIII("Full"));
                Il = IlIll.I();
                return;
            }
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
    }

    public static IlIll[] values() {
        return (IlIll[])Il.clone();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String l(int var0, int var1_1) {
        var3_2 = var0 ^ -1038121307;
        var4_4 = IlIll.lI[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])IlIll.ll[var3_2];
        if (var2_3 == null) {
            var5_5 = new Throwable().getStackTrace();
            IlIll.ll[var3_2] = var5_5;
        } else {
            var5_5 = var2_3;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -1041114539;
        var8_8 = 0;
        if (true) ** GOTO lbl16
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) break;
lbl16:
            // 2 sources

            switch (var8_8 & 31) {
                case 14: {
                    var9_9 = 124;
                    continue block33;
                }
                case 28: {
                    var9_9 = 127;
                    continue block33;
                }
                case 5: {
                    var9_9 = 81;
                    continue block33;
                }
                case 31: {
                    var9_9 = 4;
                    continue block33;
                }
                case 3: {
                    var9_9 = 26;
                    continue block33;
                }
                case 29: {
                    var9_9 = 175;
                    continue block33;
                }
                case 8: {
                    var9_9 = 238;
                    continue block33;
                }
                case 9: {
                    var9_9 = 107;
                    continue block33;
                }
                case 1: {
                    var9_9 = 27;
                    continue block33;
                }
                case 13: {
                    var9_9 = 217;
                    continue block33;
                }
                case 26: {
                    var9_9 = 144;
                    continue block33;
                }
                default: {
                    var9_9 = 17;
                    continue block33;
                }
                case 25: {
                    var9_9 = 38;
                    continue block33;
                }
                case 12: {
                    var9_9 = 137;
                    continue block33;
                }
                case 27: {
                    var9_9 = 127;
                    continue block33;
                }
                case 7: {
                    var9_9 = 244;
                    continue block33;
                }
                case 18: {
                    var9_9 = 203;
                    continue block33;
                }
                case 24: {
                    var9_9 = 65;
                    continue block33;
                }
                case 30: {
                    var9_9 = 152;
                    continue block33;
                }
                case 20: {
                    var9_9 = 81;
                    continue block33;
                }
                case 16: {
                    var9_9 = 150;
                    continue block33;
                }
                case 10: {
                    var9_9 = 224;
                    continue block33;
                }
                case 6: {
                    var9_9 = 20;
                    continue block33;
                }
                case 15: {
                    var9_9 = 238;
                    continue block33;
                }
                case 23: {
                    var9_9 = 105;
                    continue block33;
                }
                case 19: {
                    var9_9 = 12;
                    continue block33;
                }
                case 4: {
                    var9_9 = 226;
                    continue block33;
                }
                case 21: {
                    var9_9 = 233;
                    continue block33;
                }
                case 17: {
                    var9_9 = 40;
                    continue block33;
                }
                case 2: {
                    var9_9 = 98;
                    continue block33;
                }
                case 22: {
                    var9_9 = 52;
                    continue block33;
                }
                case 11: 
            }
            var9_9 = 88;
        }
        return new String(var4_4).intern();
    }
}

