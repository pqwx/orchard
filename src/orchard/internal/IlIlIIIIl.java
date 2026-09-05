/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIIIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Ease Out
 *   - Normal
 *   - Linear
 *   - Smooth
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
public final class IlIlIIIIl
extends Enum<IlIlIIIIl> {
    private final IIIlIIIII I;
    public static final /* enum */ IlIlIIIIl l;
    private static final /* synthetic */ IlIlIIIIl[] II;
    public static final /* enum */ IlIlIIIIl Il;
    public static final /* enum */ IlIlIIIIl lI;
    public static final /* enum */ IlIlIIIIl ll;
    public static final /* enum */ IlIlIIIIl III;
    private static final String[] IIl;
    private static final Object[] IlI;

    private static /* synthetic */ IlIlIIIIl[] I() {
        return new IlIlIIIIl[]{ll, Il, l, III, lI};
    }

    public String toString() {
        return this.I.IIII();
    }

    public static IlIlIIIIl l(String string) {
        return Enum.valueOf(IlIlIIIIl.class, string);
    }

    public static IlIlIIIIl[] values() {
        return (IlIlIIIIl[])II.clone();
    }

    private IlIlIIIIl(IIIlIIIII iIIlIIIII) {
        this.I = iIIlIIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 26852;
        String string = "\u9741\u972d\u973f\u97bf\u978b\u9722\u5a69\u5a00\u5a0b\u5aa7\u5ab3\u5a2e\u5ad1\u5aea\u4027\u404f\u4047\u40d3\u40ef\u4058\u8b43\u8b10\u8b64\u8bab\u8b9f\u8b04\u8bfb\u8be4\u87c2\u87b1\u87bc\u8723\u8700\u87b8\uc643\uc66a\uc63c\uc6ad\uc69c\uc624\uc6a7\uc6c1\u41b3\u41d7\u41da\u414b\u416e\u61bf\u61ec\u61ef\u6162\u6162\u61fb\u615f\u6163\ub809\ub860\ub87d\ub8f4\ub8d6\ub862\ub8bd\ub88d\ubf5b\ubf1a\ubf19\ubf98\ubf85\ubf1a\ubfe5\ubf8c\ubf33\ubf3c\ubf20\ubf32";
        char[] cArray = "\u68e2\u68ec\u68e2\u68ec\u68e2\u68ec\u68e1\u68ec\u68ec\u68e8".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
        IIl = stringArray;
        IlI = new Object[stringArray.length];
        ll = new IlIlIIIIl(StringFactory.IIII("Normal"));
        Il = new IlIlIIIIl(StringFactory.IIII("Linear"));
        l = new IlIlIIIIl(StringFactory.IIII("Smooth"));
        III = new IlIlIIIIl(StringFactory.IIII("Legit"));
        lI = new IlIlIIIIl(StringFactory.IIII("Ease Out"));
        II = IlIlIIIIl.I();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String II(int var0, int var1_1) {
        var3_2 = var0 ^ 163008544;
        var4_4 = IlIlIIIIl.IIl[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])IlIlIIIIl.IlI[var3_2];
        if (var2_3 == null) {
            var5_5 = new Throwable().getStackTrace();
            IlIlIIIIl.IlI[var3_2] = var5_5;
        } else {
            var5_5 = var2_3;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -451557829;
        var8_8 = 0;
        if (true) ** GOTO lbl17
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) {
                return new String(var4_4).intern();
            }
lbl17:
            // 3 sources

            switch (var8_8 & 31) {
                case 27: {
                    var9_9 = 9;
                    continue block33;
                }
                case 2: {
                    var9_9 = 204;
                    continue block33;
                }
                case 25: {
                    var9_9 = 38;
                    continue block33;
                }
                case 23: {
                    var9_9 = 225;
                    continue block33;
                }
                case 28: {
                    var9_9 = 121;
                    continue block33;
                }
                case 11: {
                    var9_9 = 140;
                    continue block33;
                }
                default: {
                    var9_9 = 174;
                    continue block33;
                }
                case 3: {
                    var9_9 = 83;
                    continue block33;
                }
                case 1: {
                    var9_9 = 195;
                    continue block33;
                }
                case 20: {
                    var9_9 = 188;
                    continue block33;
                }
                case 17: {
                    var9_9 = 219;
                    continue block33;
                }
                case 8: {
                    var9_9 = 226;
                    continue block33;
                }
                case 16: {
                    var9_9 = 206;
                    continue block33;
                }
                case 31: {
                    var9_9 = 105;
                    continue block33;
                }
                case 5: {
                    var9_9 = 207;
                    continue block33;
                }
                case 29: {
                    var9_9 = 195;
                    continue block33;
                }
                case 19: {
                    var9_9 = 149;
                    continue block33;
                }
                case 6: {
                    var9_9 = 10;
                    continue block33;
                }
                case 9: {
                    var9_9 = 238;
                    continue block33;
                }
                case 24: {
                    var9_9 = 181;
                    continue block33;
                }
                case 14: {
                    var9_9 = 161;
                    continue block33;
                }
                case 26: {
                    var9_9 = 129;
                    continue block33;
                }
                case 12: {
                    var9_9 = 123;
                    continue block33;
                }
                case 21: {
                    var9_9 = 3;
                    continue block33;
                }
                case 10: {
                    var9_9 = 196;
                    continue block33;
                }
                case 15: {
                    var9_9 = 200;
                    continue block33;
                }
                case 30: {
                    var9_9 = 79;
                    continue block33;
                }
                case 7: {
                    var9_9 = 59;
                    continue block33;
                }
                case 13: {
                    var9_9 = 147;
                    continue block33;
                }
                case 4: {
                    var9_9 = 107;
                    continue block33;
                }
                case 18: {
                    var9_9 = 162;
                    continue block33;
                }
                case 22: 
            }
            var9_9 = 212;
        }
    }
}

