/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIlIl
 * Purpose not identified - name is the original obfuscated one.
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

@Environment(value=EnvType.CLIENT)
final class IIllIlIl
extends Enum<IIllIlIl> {
    public static final /* enum */ IIllIlIl I;
    public static final /* enum */ IIllIlIl l;
    private static final /* synthetic */ IIllIlIl[] II;
    private static final String[] Il;
    private static final Object[] lI;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block11: {
            block10: {
                var0 = 9365;
                var1_1 = "\ud730\ud7dc\ud71e\ud759\ud76a\u851d\u85f4\u8531\u857c\u8557\u85ae";
                var2_2 = "\u2490\u2493".toCharArray();
                var3_3 = new String[var2_2.length];
                var7_7 = -1;
                break block10;
                var3_3[var4_4] = new String(var8_8).intern();
                var5_5 += var6_6;
                if (++var4_4 < var2_2.length) break block11;
                var7_7 = 0;
            }
            var4_4 = 0;
            var5_5 = 0;
            var6_6 = 0;
            if (var7_7 == 0) {
                IIllIlIl.Il = var3_3;
                IIllIlIl.lI = new Object[var3_3.length];
                IIllIlIl.l = new IIllIlIl();
                IIllIlIl.I = new IIllIlIl();
                IIllIlIl.II = IIllIlIl.l();
                return;
            }
        }
        var6_6 = var2_2[var4_4] ^ var0;
        var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
        var9_9 = 0;
lbl26:
        // 2 sources

        switch (var9_9 % 5) {
            default: {
                v0 = 21;
                break;
            }
            case 1: {
                v0 = 34;
                break;
            }
            case 2: {
                v0 = 122;
                break;
            }
            case 4: {
                v0 = 46;
                break;
            }
            case 3: {
                v0 = 45;
            }
        }
        var10_10 = v0;
        v1 = var9_9++;
        var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
        if (var9_9 < var8_8.length) ** GOTO lbl26
    }

    public static IIllIlIl I(String string) {
        return Enum.valueOf(IIllIlIl.class, string);
    }

    private static /* synthetic */ IIllIlIl[] l() {
        return new IIllIlIl[]{l, I};
    }

    public static IIllIlIl[] values() {
        return (IIllIlIl[])II.clone();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xDD86BD4C;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIllIlIl.lI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2B584A3B;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 19: {
                    n6 = 78;
                    continue block33;
                }
                case 25: {
                    n6 = 101;
                    continue block33;
                }
                case 8: {
                    n6 = 110;
                    continue block33;
                }
                case 20: {
                    n6 = 120;
                    continue block33;
                }
                case 1: {
                    n6 = 122;
                    continue block33;
                }
                case 12: {
                    n6 = 229;
                    continue block33;
                }
                case 16: {
                    n6 = 90;
                    continue block33;
                }
                case 14: {
                    n6 = 13;
                    continue block33;
                }
                case 23: {
                    n6 = 114;
                    continue block33;
                }
                case 11: {
                    n6 = 72;
                    continue block33;
                }
                case 24: {
                    n6 = 213;
                    continue block33;
                }
                case 30: {
                    n6 = 248;
                    continue block33;
                }
                case 28: {
                    n6 = 72;
                    continue block33;
                }
                case 29: {
                    n6 = 0;
                    continue block33;
                }
                case 7: {
                    n6 = 37;
                    continue block33;
                }
                case 15: {
                    n6 = 177;
                    continue block33;
                }
                case 6: {
                    n6 = 79;
                    continue block33;
                }
                case 9: {
                    n6 = 201;
                    continue block33;
                }
                default: {
                    n6 = 189;
                    continue block33;
                }
                case 2: {
                    n6 = 237;
                    continue block33;
                }
                case 22: {
                    n6 = 171;
                    continue block33;
                }
                case 18: {
                    n6 = 246;
                    continue block33;
                }
                case 13: {
                    n6 = 236;
                    continue block33;
                }
                case 3: {
                    n6 = 255;
                    continue block33;
                }
                case 31: {
                    n6 = 223;
                    continue block33;
                }
                case 26: {
                    n6 = 250;
                    continue block33;
                }
                case 5: {
                    n6 = 14;
                    continue block33;
                }
                case 4: {
                    n6 = 201;
                    continue block33;
                }
                case 27: {
                    n6 = 185;
                    continue block33;
                }
                case 17: {
                    n6 = 221;
                    continue block33;
                }
                case 21: {
                    n6 = 44;
                    continue block33;
                }
                case 10: 
            }
            n6 = 2;
        }
    }
}

