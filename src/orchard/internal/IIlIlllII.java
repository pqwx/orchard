/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIlllII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Modern Compact
 *   - Xylon
 *   - Old
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
final class IIlIlllII
extends Enum<IIlIlllII> {
    public static final /* enum */ IIlIlllII I;
    private final IIIlIIIII l;
    public static final /* enum */ IIlIlllII II;
    public static final /* enum */ IIlIlllII Il;
    private static final /* synthetic */ IIlIlllII[] lI;
    private static final String[] ll;
    private static final Object[] III;

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block15: {
                block14: {
                    block9: {
                        block13: {
                            block10: {
                                block12: {
                                    break block12;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        IIlIlllII.lI = IIlIlllII.l();
                                        return;
                                    }
lbl4:
                                    // 1 sources

                                    while (true) {
                                        continue;
lbl6:
                                        // 1 sources

                                        while (++var4_4 >= var2_2.length) {
                                            break block9;
                                        }
                                        break block10;
                                        break;
                                    }
lbl9:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                var0 = 6780;
                                var1_1 = "\u73c3\u73c6\u73d7\u73ac\u73a9\u8445\u8467\u846f\u8477\u8459\u862a\u8451\u8493\u55ca\u55c9\u55c1\u3e56\u3e93\u3e52\u3e77\u61f3\u61f5\u61ce\u61cb\u61f4\u61f8\u61e5\u61c1\u61f5\u61f3\u61f2\u61cf\u61c1\u61fe\u020c\u01ee\u020c\u0215\u0231\u0215\u020c\u01ee\u0219\u021c\u01fb\u01ed\u0206\u01ed\u01cd\u01ed\u021c\u0211\u0223\u01c1";
                                ** while (true)
lbl15:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl17:
                                // 1 sources

                                while (true) {
                                    if (var7_7 != 0) break block10;
                                    break block11;
lbl20:
                                    // 1 sources

                                    while (true) {
                                        ** GOTO lbl6
                                        break;
                                    }
                                    break;
                                }
lbl22:
                                // 1 sources

                                while (true) {
                                    IIlIlllII.II = new IIlIlllII(StringFactory.IIII("Modern Compact"));
                                    ** continue;
                                    break;
                                }
                                IIlIlllII.III = new Object[var3_3.length];
                                break block13;
lbl27:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var6_6 = var2_2[var4_4] ^ var0;
                            ** while (true)
                            var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                            var5_5 += var6_6;
                            ** while (true)
                            var5_5 = 0;
                            var6_6 = 0;
                            ** while (true)
                            var2_2 = "\u1a79\u1a74\u1a7f\u1a78\u1a72\u1a68".toCharArray();
                            break block14;
                        }
                        IIlIlllII.Il = new IIlIlllII(StringFactory.IIII("Xylon"));
                        IIlIlllII.I = new IIlIlllII(StringFactory.IIII("Old"));
                        ** while (true)
                    }
                    var7_7 = 0;
                    break block15;
                }
                var3_3 = new String[var2_2.length];
                var7_7 = -1;
            }
            var4_4 = 0;
            ** while (true)
        }
        IIlIlllII.ll = var3_3;
        ** while (true)
    }

    public static IIlIlllII I(String string) {
        return Enum.valueOf(IIlIlllII.class, string);
    }

    public static IIlIlllII[] values() {
        return (IIlIlllII[])lI.clone();
    }

    private static /* synthetic */ IIlIlllII[] l() {
        return new IIlIlllII[]{Il, I, II};
    }

    public String toString() {
        return this.l.IIII();
    }

    private IIlIlllII(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, int n2, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xA447;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIlIlllII.III[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4E22;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 4929;
            n7 ^= 0x4E9;
            n7 += 9066;
            n7 -= 42530;
            n7 += 13997;
            n7 ^= 0xA4D7;
            cArray[n6] = (char)((n7 ^= 0xBF1E) ^ n4 ^ c ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

