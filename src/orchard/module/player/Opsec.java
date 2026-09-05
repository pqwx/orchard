/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIIlIl
 * Module         : Opsec  [PLAYER]
 * Description    : Your favourite opsec mod, just inside Orchard.   (client's own text)
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
package orchard.module.player;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;

@Environment(value=EnvType.CLIENT)
public final class Opsec
extends ModuleBase {
    private static final String[] I;
    private static final Object[] l;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public Opsec() {
        super(StringFactory.IIII("t4RHmRo="), Category.IIl, StringFactory.IIII("oZtBjllRUQqYHY1QG9aekYiHUZ9ZWl8Y20iVTBzHnpeWh12YHBd/DpQAnksLnQ=="));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block27: {
                block25: {
                    block30: {
                        block24: {
                            block29: {
                                block28: {
                                    block22: {
                                        block23: {
                                            break block28;
lbl1:
                                            // 1 sources

                                            while (++var4_4 >= var2_2.length) {
                                                break block22;
                                            }
                                            break block24;
lbl4:
                                            // 1 sources

                                            while (true) {
                                                v0 = 11;
                                                break block23;
                                                break;
                                            }
lbl7:
                                            // 1 sources

                                            while (true) {
                                                v0 = 86;
                                                break block23;
                                                break;
                                            }
lbl10:
                                            // 1 sources

                                            while (true) {
                                                v0 = 94;
                                                break block23;
                                                break;
                                            }
lbl13:
                                            // 1 sources

                                            while (true) {
                                                Opsec.l = new Object[var3_3.length];
                                                return;
                                            }
                                        }
lbl17:
                                        // 4 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl19:
                                        // 1 sources

                                        while (true) {
                                            var6_6 = 0;
                                            if (var7_7 != 0) break block24;
                                            break block25;
                                            break;
                                        }
                                    }
                                    var7_7 = 0;
lbl25:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl27:
                                    // 1 sources

                                    while (true) {
                                        break block26;
                                        break;
                                    }
lbl29:
                                    // 1 sources

                                    while (true) {
                                        v0 = 28;
                                        ** GOTO lbl17
                                        break;
                                    }
                                    var10_10 = v0;
                                    v1 = var9_9++;
                                    var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
                                    ** while (true)
                                }
                                var0 = 12859;
                                break block29;
lbl39:
                                // 1 sources

                                while (true) {
                                    var5_5 += var6_6;
                                    ** GOTO lbl1
                                    break;
                                }
                                var4_4 = 0;
                                var5_5 = 0;
                                ** while (true)
                            }
                            var1_1 = "\u5f9c\u5fcd\u5fb8\u5f80\u5f3f\u5fed\u5f77\u5fb4\u9374\u93d0\u93dd\u9399\u933b\u9360\u9377\u93e8\u93bc\u93aa\u93d0\u93d5\u93d3\u93d3\u9398\u93aa\u9386\u93b5\u936a\u937f\u9332\u9392\u9338\u93c4\u93fe\u93d0\u93e0\u9391\u93b6\u9360\u93a3\u93d3\u939b\u938b\u9338\u93ea\u93ff\u93d8\u9323\u9383\u933f\u938c\u936e\u93ed\u9331\u938a\u9393\u93d5\u93d3\u93d8\u932d\u93e4\u9385\u938c\u93fa\u93db\u9337\u9320\u93d2\u93c0\u9375\u93eb\u93e4\u93f6";
                            var2_2 = "\u3233\u327b".toCharArray();
                            break block30;
lbl49:
                            // 1 sources

                            while (true) {
                                var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                                var9_9 = 0;
                                break block27;
                                break;
                            }
                        }
                        var6_6 = var2_2[var4_4] ^ var0;
                        ** while (true)
lbl56:
                        // 1 sources

                        while (true) {
                            var3_3[var4_4] = new String(var8_8).intern();
                            ** continue;
                            break;
                        }
                    }
                    var3_3 = new String[var2_2.length];
                    var7_7 = -1;
                    ** while (true)
lbl63:
                    // 1 sources

                    while (true) {
                        v0 = 76;
                        ** GOTO lbl17
                        break;
                    }
                }
                Opsec.I = var3_3;
                ** while (true)
            }
lbl70:
            // 2 sources

            while (true) {
                switch (var9_9 % 6) {
                    case 5: {
                        ** continue;
                    }
                    case 4: {
                        ** continue;
                    }
                    case 2: {
                        ** continue;
                    }
                    default: {
                        ** continue;
                    }
                    case 3: {
                        ** continue;
                    }
                    case 1: 
                }
                v0 = 13;
                ** continue;
                break;
            }
        }
        ** while (var9_9 < var8_8.length)
lbl87:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lI(int n, int n2, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xEEE9;
        char[] cArray = I[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])l[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            Opsec.l[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2A63;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 46552;
            n7 ^= 0xDE65;
            n7 ^= 0x9508;
            n7 ^= 0x4F49;
            cArray[n6] = (char)((n7 += 44064) ^ n4 ^ s ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

