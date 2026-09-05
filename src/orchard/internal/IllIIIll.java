/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Color Shift
 *   - Breathing
 *   - Gradient
 *   - Rainbow
 *   - Solid
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
import orchard.internal.lIIlll;

@Environment(value=EnvType.CLIENT)
final class IllIIIll
extends Enum<IllIIIll>
implements lIIlll {
    public static final /* enum */ IllIIIll I;
    public static final /* enum */ IllIIIll l;
    public static final /* enum */ IllIIIll II;
    private static final /* synthetic */ IllIIIll[] Il;
    public static final /* enum */ IllIIIll lI;
    public static final /* enum */ IllIIIll ll;
    private final boolean III;
    private final IIIlIIIII IIl;
    private static final String[] IlI;
    private static final Object[] Ill;

    private static /* synthetic */ IllIIIll[] II() {
        return new IllIIIll[]{l, lI, ll, I, II};
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 2250;
        String string = "\u602e\u607b\u60e8\u60ab\u60bd\u6061\u603c\u60d6\u601f\u60fe\u605c\ubfac\ubfb5\ubf64\ubf09\ubf30\ubffd\ubfa8\ubf72\ubfbb\ubf74\ubfef\ubf71\ubfe9\ubfa5\ubf39\ubfbf\uf784\uf7c1\uf752\uf717\uf711\ue135\ue128\ue1f9\ue194\ue1aa\ue145\ue176\ue18a\u2d1c\u2d50\u2dd3\u2d96\u2d90\u2d4d\u2d17\u2dfc\u13ee\u13f5\u130b\u1347\u1377\u1389\u13d8\u1338\u13fb\u132a\u139a\u1368\ua5cb\ua595\ua518\ua543\ua55b\ua59f\ua5cf\ua524\ua5f9\ua51a\ub7af\ub7ec\ub749\ub701\ub736\ub7d8\ub7e9\ub74f\ub7b6\ub75d\ub7f4\ub746\u5793\u57d9\u5741\u5706\u5701\u57dd\u5794\u62b8\u62e0\u6256\u6224\u6220\u62f2\u62bf\u6263\u62a0\u626b\u6291\u6239";
        char[] cArray = "\u08c1\u08da\u08cf\u08c2\u08c2\u08c6\u08c0\u08c6\u08cd\u08c6".toCharArray();
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
        IlI = stringArray;
        Ill = new Object[stringArray.length];
        l = new IllIIIll(StringFactory.IIII("Color Shift"));
        lI = new IllIIIll(StringFactory.IIII("Solid"));
        ll = new IllIIIll(StringFactory.IIII("Gradient"));
        I = new IllIIIll(StringFactory.IIII("Breathing"));
        II = new IllIIIll(StringFactory.IIII("Rainbow"), false);
        Il = IllIIIll.II();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private IllIIIll(IIIlIIIII iIIlIIIII, boolean bl) {
        this.IIl = iIIlIIIII;
        this.III = bl;
    }

    public static IllIIIll[] values() {
        return (IllIIIll[])Il.clone();
    }

    private IllIIIll(IIIlIIIII iIIlIIIII) {
        this(iIIlIIIII, true);
    }

    public static IllIIIll Il(String string) {
        return Enum.valueOf(IllIIIll.class, string);
    }

    public String toString() {
        return this.IIl.IIII();
    }

    @Override
    public boolean l() {
        return this.III;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public Enum<?> I() {
        IllIIIll illIIIll;
        block2: {
            block1: {
                if (this != II) break block1;
                break block2;
            }
            illIIIll = this;
            return illIIIll;
        }
        illIIIll = I;
        return illIIIll;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x8DF40F50;
        char[] cArray = IlI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Ill[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IllIIIll.Ill[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x53185FFE;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 24: {
                    n6 = 4;
                    continue block33;
                }
                case 29: {
                    n6 = 134;
                    continue block33;
                }
                case 16: {
                    n6 = 208;
                    continue block33;
                }
                case 28: {
                    n6 = 128;
                    continue block33;
                }
                case 13: {
                    n6 = 120;
                    continue block33;
                }
                case 4: {
                    n6 = 233;
                    continue block33;
                }
                case 9: {
                    n6 = 190;
                    continue block33;
                }
                case 3: {
                    n6 = 226;
                    continue block33;
                }
                case 11: {
                    n6 = 166;
                    continue block33;
                }
                case 18: {
                    n6 = 120;
                    continue block33;
                }
                default: {
                    n6 = 107;
                    continue block33;
                }
                case 31: {
                    n6 = 228;
                    continue block33;
                }
                case 23: {
                    n6 = 135;
                    continue block33;
                }
                case 1: {
                    n6 = 50;
                    continue block33;
                }
                case 22: {
                    n6 = 172;
                    continue block33;
                }
                case 19: {
                    n6 = 119;
                    continue block33;
                }
                case 30: {
                    n6 = 77;
                    continue block33;
                }
                case 8: {
                    n6 = 80;
                    continue block33;
                }
                case 5: {
                    n6 = 56;
                    continue block33;
                }
                case 21: {
                    n6 = 117;
                    continue block33;
                }
                case 27: {
                    n6 = 2;
                    continue block33;
                }
                case 2: {
                    n6 = 162;
                    continue block33;
                }
                case 14: {
                    n6 = 248;
                    continue block33;
                }
                case 15: {
                    n6 = 48;
                    continue block33;
                }
                case 26: {
                    n6 = 189;
                    continue block33;
                }
                case 10: {
                    n6 = 14;
                    continue block33;
                }
                case 12: {
                    n6 = 31;
                    continue block33;
                }
                case 25: {
                    n6 = 203;
                    continue block33;
                }
                case 6: {
                    n6 = 105;
                    continue block33;
                }
                case 17: {
                    n6 = 142;
                    continue block33;
                }
                case 20: {
                    n6 = 40;
                    continue block33;
                }
                case 7: 
            }
            n6 = 152;
        }
        return new String(cArray).intern();
    }
}

