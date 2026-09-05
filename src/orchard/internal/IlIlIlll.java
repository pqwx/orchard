/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIlll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - McPvP Club
 *   - Tier-Tagger
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
public final class IlIlIlll
extends Enum<IlIlIlll> {
    private final IIIlIIIII I;
    private static final /* synthetic */ IlIlIlll[] l;
    public static final /* enum */ IlIlIlll II;
    public static final /* enum */ IlIlIlll Il;
    private static final String[] lI;
    private static final Object[] ll;

    public String toString() {
        return this.I.IIII();
    }

    private IlIlIlll(IIIlIIIII iIIlIIIII) {
        this.I = iIIlIIIII;
    }

    private static /* synthetic */ IlIlIlll[] I() {
        return new IlIlIlll[]{Il, II};
    }

    public IIIlIIIII l() {
        return this.I;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 21555;
        String string = "\u7f26\u7f65\u7fcb\u7f6a\u7f25\u7f0a\u7ff0\u7ffd\u7fef\u7f30\uf63b\uf65d\uf684\uf651\uf620\uf61c\uf6de\uf6eb\uf6c4\uf60b\uf647\uf6cc\uf63f\uf632\uf652\uf641\ud024\ud074\ud0c5\ud075\ud03a\ud013\ud0e0\ud0f4\ud0f3\u1aa0\u1ad0\u1a4c\u1af5\u1abe\u1a84\u1a7a\u1a44\u1a6f\u1abc\u1aec\u1a43\u1aa5\u1a91\u1ac2\u1adc";
        char[] cArray = "\u5439\u5423\u543a\u5423".toCharArray();
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
        Il = new IlIlIlll(StringFactory.IIII("Tier-Tagger"));
        II = new IlIlIlll(StringFactory.IIII("McPvP Club"));
        l = IlIlIlll.I();
    }

    public static IlIlIlll II(String string) {
        return Enum.valueOf(IlIlIlll.class, string);
    }

    public static IlIlIlll[] values() {
        return (IlIlIlll[])l.clone();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String Il(int var0, int var1_1) {
        var3_2 = var0 ^ 235607282;
        var4_4 = IlIlIlll.lI[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])IlIlIlll.ll[var3_2];
        if (var2_3 != null) {
            var5_5 = var2_3;
        } else {
            var5_5 = new Throwable().getStackTrace();
            IlIlIlll.ll[var3_2] = var5_5;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -279878153;
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
                case 31: {
                    var9_9 = 132;
                    continue block33;
                }
                case 20: {
                    var9_9 = 187;
                    continue block33;
                }
                default: {
                    var9_9 = 168;
                    continue block33;
                }
                case 26: {
                    var9_9 = 124;
                    continue block33;
                }
                case 4: {
                    var9_9 = 171;
                    continue block33;
                }
                case 15: {
                    var9_9 = 157;
                    continue block33;
                }
                case 27: {
                    var9_9 = 107;
                    continue block33;
                }
                case 13: {
                    var9_9 = 138;
                    continue block33;
                }
                case 14: {
                    var9_9 = 131;
                    continue block33;
                }
                case 1: {
                    var9_9 = 246;
                    continue block33;
                }
                case 21: {
                    var9_9 = 58;
                    continue block33;
                }
                case 6: {
                    var9_9 = 109;
                    continue block33;
                }
                case 10: {
                    var9_9 = 211;
                    continue block33;
                }
                case 19: {
                    var9_9 = 246;
                    continue block33;
                }
                case 11: {
                    var9_9 = 124;
                    continue block33;
                }
                case 17: {
                    var9_9 = 105;
                    continue block33;
                }
                case 22: {
                    var9_9 = 167;
                    continue block33;
                }
                case 30: {
                    var9_9 = 25;
                    continue block33;
                }
                case 24: {
                    var9_9 = 4;
                    continue block33;
                }
                case 7: {
                    var9_9 = 96;
                    continue block33;
                }
                case 12: {
                    var9_9 = 154;
                    continue block33;
                }
                case 18: {
                    var9_9 = 240;
                    continue block33;
                }
                case 28: {
                    var9_9 = 134;
                    continue block33;
                }
                case 2: {
                    var9_9 = 84;
                    continue block33;
                }
                case 23: {
                    var9_9 = 208;
                    continue block33;
                }
                case 3: {
                    var9_9 = 226;
                    continue block33;
                }
                case 25: {
                    var9_9 = 206;
                    continue block33;
                }
                case 5: {
                    var9_9 = 145;
                    continue block33;
                }
                case 29: {
                    var9_9 = 219;
                    continue block33;
                }
                case 9: {
                    var9_9 = 184;
                    continue block33;
                }
                case 16: {
                    var9_9 = 216;
                    continue block33;
                }
                case 8: 
            }
            var9_9 = 112;
        }
    }
}

