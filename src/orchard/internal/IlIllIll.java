/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIllIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Density
 *   - Breach
 *   - Smart
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
public final class IlIllIll
extends Enum<IlIllIll> {
    public static final /* enum */ IlIllIll I;
    private final IIIlIIIII l;
    private static final /* synthetic */ IlIllIll[] II;
    public static final /* enum */ IlIllIll Il;
    public static final /* enum */ IlIllIll lI;
    private static final String[] ll;
    private static final Object[] III;

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            block11: {
                block12: {
                    block16: {
                        block14: {
                            block13: {
                                break block13;
lbl1:
                                // 1 sources

                                while (true) {
                                    var7_7 = 0;
                                    break block11;
                                    break;
                                }
lbl4:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var0 = 22038;
                            break block14;
lbl9:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                            IlIllIll.III = new Object[var3_3.length];
                            break block15;
lbl13:
                            // 1 sources

                            while (++var4_4 >= var2_2.length) {
                                ** continue;
lbl15:
                                // 1 sources

                                ** GOTO lbl1
                            }
                            break block16;
lbl17:
                            // 1 sources

                            while (true) {
                                var6_6 = 0;
                                break block12;
                                break;
                            }
                            IlIllIll.lI = new IlIllIll(StringFactory.IIII("Breach"));
                            IlIllIll.II = IlIllIll.I();
                            return;
lbl23:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
                        }
                        var1_1 = "\ued7f\ued71\ued75\uecc4\uecc6\uf468\uf424\uf487\uf3c5\uf491\uf492\uf423\uf45c\ua770\ua76b\ua776\ua77d\ua76f\ua780\ua77f\u722f\u725b\u725f\u7286\u723b\u7231\u7223\u7225\u7258\u7256\u726a\u726a\u3b82\u3b32\u3b83\u3b3f\u3b85\u3b3c\u1329\u134b\u133c\u1384\u1350\u1384\u1322\u1358";
                        var2_2 = "\u5613\u561e\u5611\u561a\u5610\u561e".toCharArray();
                        ** while (true)
lbl29:
                        // 1 sources

                        while (true) {
                            var5_5 += var6_6;
                            ** GOTO lbl13
                            break;
                        }
lbl32:
                        // 1 sources

                        while (true) {
                            var5_5 = 0;
                            ** continue;
                            break;
                        }
lbl35:
                        // 1 sources

                        while (true) {
                            var3_3[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                            ** continue;
                            break;
                        }
                    }
lbl39:
                    // 2 sources

                    while (true) {
                        var6_6 = var2_2[var4_4] ^ var0;
                        ** continue;
                        break;
                    }
                }
                ** while (var7_7 != 0)
lbl44:
                // 1 sources

                IlIllIll.ll = var3_3;
                ** while (true)
            }
lbl47:
            // 2 sources

            while (true) {
                var4_4 = 0;
                ** continue;
                break;
            }
            var3_3 = new String[var2_2.length];
            var7_7 = -1;
            ** while (true)
        }
        IlIllIll.Il = new IlIllIll(StringFactory.IIII("Smart"));
        IlIllIll.I = new IlIllIll(StringFactory.IIII("Density"));
        ** while (true)
    }

    public static IlIllIll[] values() {
        return (IlIllIll[])II.clone();
    }

    public String toString() {
        return this.l.IIII();
    }

    private IlIllIll(IIIlIIIII iIIlIIIII) {
        this.l = iIIlIIIII;
    }

    private static /* synthetic */ IlIllIll[] I() {
        return new IlIllIll[]{Il, I, lI};
    }

    public static IlIllIll valueOf(String string) {
        return Enum.valueOf(IlIllIll.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(int n, short s, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x49AC;
        char[] cArray = ll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIllIll.III[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xAC5;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 37154;
            n6 ^= 0x45E0;
            n6 ^= 0x25BD;
            n6 -= 7271;
            n6 -= 64246;
            n6 -= 53532;
            cArray[n5] = (char)((n6 ^= 0xEF99) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

