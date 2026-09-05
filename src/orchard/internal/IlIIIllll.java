/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIllll
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
final class IlIIIllll
extends Enum<IlIIIllll> {
    private final IIIlIIIII I;
    private static final /* synthetic */ IlIIIllll[] l;
    public static final /* enum */ IlIIIllll II;
    public static final /* enum */ IlIIIllll Il;
    private static final String[] lI;
    private static final Object[] ll;

    public String toString() {
        return this.I.IIII();
    }

    private static /* synthetic */ IlIIIllll[] I() {
        return new IlIIIllll[]{Il, II};
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 27666;
        String string = "\u6e8d\u6ea1\u6e52\u6e44\u6ebe\u6e1c\u0868\u087b\u0899\u0882\u084c\u08de\u0887\u08ee\uf569\uf55e\uf5b5\uf5b5\uf548\uf5fd\u52dc\u52b5\u525f\u523e\u52fc\u526c\u5262\u5226";
        char[] cArray = "\u6c14\u6c1a\u6c14\u6c1a".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            char[] cArray2;
            int n3;
            block14: {
                int n4;
                int n5;
                int n6;
                block15: {
                    block13: {
                        if (bl && !(bl = false) && true) break block13;
                        if (n3 < cArray2.length) break block14;
                        stringArray[n5] = new String(cArray2).intern();
                        n4 += n6;
                        if (++n5 < cArray.length) break block15;
                        n2 = 0;
                    }
                    n5 = 0;
                    n4 = 0;
                    n6 = 0;
                    if (n2 != 0) {
                    } else {
                        lI = stringArray;
                        ll = new Object[stringArray.length];
                        Il = new IlIIIllll(StringFactory.IIII("Legit"));
                        II = new IlIIIllll(StringFactory.IIII("Silent"));
                        l = IlIIIllll.I();
                        return;
                    }
                }
                n6 = cArray[n5] ^ n;
                cArray2 = string.substring(n4, n4 + n6).toCharArray();
                n3 = 0;
            }
            int n7 = switch (n3 % 6) {
                case 5 -> 72;
                case 1 -> 69;
                case 2 -> 22;
                default -> 73;
                case 4 -> 48;
                case 3 -> 45;
            };
            int n8 = n3++;
            cArray2[n8] = (char)(cArray2[n8] ^ n7);
        }
    }

    public static IlIIIllll[] values() {
        return (IlIIIllll[])l.clone();
    }

    private IlIIIllll(IIIlIIIII iIIlIIIII) {
        this.I = iIIlIIIII;
    }

    public static IlIIIllll l(String string) {
        return Enum.valueOf(IlIIIllll.class, string);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xF31A57FF;
        char[] cArray = lI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIIllll.ll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xD7274258;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 5: {
                    n6 = 253;
                    continue block33;
                }
                case 9: {
                    n6 = 230;
                    continue block33;
                }
                case 21: {
                    n6 = 233;
                    continue block33;
                }
                case 7: {
                    n6 = 172;
                    continue block33;
                }
                case 11: {
                    n6 = 40;
                    continue block33;
                }
                case 6: {
                    n6 = 196;
                    continue block33;
                }
                case 13: {
                    n6 = 20;
                    continue block33;
                }
                case 4: {
                    n6 = 42;
                    continue block33;
                }
                case 27: {
                    n6 = 60;
                    continue block33;
                }
                case 29: {
                    n6 = 214;
                    continue block33;
                }
                case 16: {
                    n6 = 217;
                    continue block33;
                }
                case 3: {
                    n6 = 193;
                    continue block33;
                }
                case 19: {
                    n6 = 205;
                    continue block33;
                }
                case 22: {
                    n6 = 68;
                    continue block33;
                }
                case 15: {
                    n6 = 21;
                    continue block33;
                }
                case 18: {
                    n6 = 191;
                    continue block33;
                }
                case 30: {
                    n6 = 31;
                    continue block33;
                }
                case 26: {
                    n6 = 227;
                    continue block33;
                }
                case 24: {
                    n6 = 112;
                    continue block33;
                }
                default: {
                    n6 = 111;
                    continue block33;
                }
                case 12: {
                    n6 = 192;
                    continue block33;
                }
                case 8: {
                    n6 = 252;
                    continue block33;
                }
                case 20: {
                    n6 = 18;
                    continue block33;
                }
                case 10: {
                    n6 = 206;
                    continue block33;
                }
                case 17: {
                    n6 = 146;
                    continue block33;
                }
                case 2: {
                    n6 = 243;
                    continue block33;
                }
                case 14: {
                    n6 = 67;
                    continue block33;
                }
                case 28: {
                    n6 = 70;
                    continue block33;
                }
                case 23: {
                    n6 = 143;
                    continue block33;
                }
                case 31: {
                    n6 = 232;
                    continue block33;
                }
                case 25: {
                    n6 = 143;
                    continue block33;
                }
                case 1: 
            }
            n6 = 78;
        }
        return new String(cArray).intern();
    }
}

