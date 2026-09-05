/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIlllI
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
final class IlIIlllI
extends Enum<IlIIlllI> {
    public static final /* enum */ IlIIlllI I;
    public static final /* enum */ IlIIlllI l;
    private static final /* synthetic */ IlIIlllI[] II;
    public static final /* enum */ IlIIlllI Il;
    private static final String[] lI;
    private static final Object[] ll;

    public static IlIIlllI[] values() {
        return (IlIIlllI[])II.clone();
    }

    private static /* synthetic */ IlIIlllI[] I() {
        return new IlIIlllI[]{l, Il, I};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block15: {
            block11: {
                block16: {
                    block10: {
                        block13: {
                            block14: {
                                block12: {
                                    block9: {
                                        break block12;
lbl1:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl3:
                                        // 1 sources

                                        while (true) {
                                            break block9;
                                            break;
                                        }
lbl5:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    if (++var4_4 < var2_3.length) break block10;
                                    break block13;
                                }
                                var0 = 7183;
                                var1_1 = "\ue7d1\ue7dc\ue7d4\ue7dd\u486c\u4876\u486e\u486b\u486e\u4875\u487c\ue5dc\ue5da\ue5c9\ue5d4\ue5c7\ue5d8";
                                break block14;
                                IlIIlllI.I = new IlIIlllI();
                                IlIIlllI.II = IlIIlllI.I();
                                return;
                            }
                            var2_3 = "\u1c0b\u1c08\u1c09".toCharArray();
                            break block15;
lbl20:
                            // 1 sources

                            while (true) {
                                var5_5 += var6_6;
                                ** continue;
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                IlIIlllI.Il = new IlIIlllI();
                                ** continue;
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var3_2[var4_4] = var1_1.substring(var5_5, var5_5 + var6_6);
                                ** continue;
                                break;
                            }
lbl29:
                            // 1 sources

                            while (true) {
                                if (var7_7 != 0) break block10;
                                break block11;
                                break;
                            }
                            IlIIlllI.ll = new Object[var3_2.length];
                            IlIIlllI.l = new IlIIlllI();
                            ** while (true)
                        }
                        var7_7 = 0;
                        break block16;
                    }
                    var6_6 = var2_3[var4_4] ^ var0;
                    ** while (true)
lbl41:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
lbl44:
                // 2 sources

                while (true) {
                    var4_4 = 0;
                    ** continue;
                    break;
                }
            }
            IlIIlllI.lI = var3_2;
            ** while (true)
        }
        var3_2 = new String[var2_3.length];
        var7_7 = -1;
        ** while (true)
        var5_5 = 0;
        var6_6 = 0;
        ** while (true)
    }

    public static IlIIlllI l(String string) {
        return Enum.valueOf(IlIIlllI.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xE2DC;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIlllI.ll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7AD2;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 5945;
            n6 += 62970;
            n6 += 3521;
            cArray[n5] = (char)((n6 ^= 0xC537) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

