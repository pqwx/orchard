/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIIIl
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
final class IIIIIIIl
extends Enum<IIIIIIIl> {
    public static final /* enum */ IIIIIIIl I;
    private static final /* synthetic */ IIIIIIIl[] l;
    public static final /* enum */ IIIIIIIl II;
    private static final String[] Il;
    private static final Object[] lI;

    public static IIIIIIIl[] values() {
        return (IIIIIIIl[])l.clone();
    }

    private static /* synthetic */ IIIIIIIl[] I() {
        return new IIIIIIIl[]{I, II};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block24: {
            block26: {
                block25: {
                    block27: {
                        break block27;
lbl1:
                        // 1 sources

                        block7: while (true) {
                            block23: {
                                block28: {
                                    if (var7_7 != 0) break block28;
                                    ** GOTO lbl49
lbl4:
                                    // 1 sources

                                    while (true) {
                                        var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                                        var9_9 = 0;
                                        break block23;
                                        break;
                                    }
lbl8:
                                    // 1 sources

                                    while (true) {
                                        IIIIIIIl.l = IIIIIIIl.I();
                                        return;
                                    }
lbl11:
                                    // 1 sources

                                    while (true) {
                                        v0 = 122;
                                        break block7;
                                        break;
                                    }
lbl14:
                                    // 1 sources

                                    while (true) {
                                        v0 = 80;
                                        break block7;
                                        break;
                                    }
lbl17:
                                    // 1 sources

                                    while (true) {
                                        v0 = 23;
                                        break block7;
                                        break;
                                    }
                                }
lbl21:
                                // 2 sources

                                while (true) {
                                    var6_6 = var2_2[var4_4];
                                    ** continue;
                                    break;
                                }
                            }
lbl25:
                            // 2 sources

                            while (true) {
                                switch (var9_9 % 6) {
                                    case 3: {
                                        ** continue;
                                    }
                                    case 1: {
                                        ** continue;
                                    }
                                    default: {
                                        ** continue;
                                    }
lbl33:
                                    // 1 sources

                                    while (true) {
                                        break block24;
                                        break;
                                    }
lbl35:
                                    // 1 sources

                                    while (true) {
                                        IIIIIIIl.lI = new Object[var3_3.length];
                                        break block25;
                                        break;
                                    }
lbl38:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                    case 4: {
                                        v0 = 6;
                                        break block7;
                                    }
                                    case 5: {
                                        v0 = 28;
                                        break block7;
                                    }
                                    var2_2 = "\u0006\n".toCharArray();
                                    var3_3 = new String[var2_2.length];
                                    break block26;
lbl49:
                                    // 1 sources

                                    IIIIIIIl.Il = var3_3;
                                    ** continue;
lbl51:
                                    // 1 sources

                                    while (true) {
                                        var5_5 += var6_6;
                                        ** continue;
                                        break;
                                    }
                                }
                                break;
                            }
                            break;
                        }
lbl54:
                        // 6 sources

                        while (true) {
                            continue;
                            break;
                        }
                        {
                            ** case 2:
                        }
lbl57:
                        // 1 sources

                        v0 = 0;
                        ** while (true)
lbl59:
                        // 1 sources

                        while (true) {
                            var7_7 = 0;
lbl61:
                            // 2 sources

                            while (true) {
                                continue;
                                break;
                            }
                            break;
                        }
                    }
                    var0 = 10875;
                    var1_1 = "\u7929\u7961\u793a\u7913\u7969\u792e\u5fea\u5fa4\u5ffb\u5f57\u5f2e\u5f30\u5fe7\u5faf\u5f28\u5f81";
                    ** while (true)
                }
                IIIIIIIl.I = new IIIIIIIl();
                IIIIIIIl.II = new IIIIIIIl();
                ** while (true)
            }
            var7_7 = -1;
            ** while (true)
lbl74:
            // 1 sources

            while (true) {
                var3_3[var4_4] = new String(var8_8).intern();
                ** continue;
                break;
            }
        }
        ** while (++var4_4 < var2_2.length)
lbl79:
        // 1 sources

        ** while (true)
        var4_4 = 0;
        var5_5 = 0;
        var6_6 = '\u0000';
        ** while (true)
        var10_10 = v0;
        v1 = var9_9++;
        var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
        ** while (var9_9 < var8_8.length)
lbl88:
        // 1 sources

        ** while (true)
    }

    public static IIIIIIIl valueOf(String string) {
        return Enum.valueOf(IIIIIIIl.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xC722;
        char[] cArray = Il[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIIIIl.lI[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x279B;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x1D1F;
            n6 -= 19440;
            n6 ^= 0x392E;
            cArray[n5] = (char)((n6 -= 14353) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

