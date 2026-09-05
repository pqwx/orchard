/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIlIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Opponent
 *   - Everyone
 *   - Self
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
final class IlIIlIIl
extends Enum<IlIIlIIl> {
    public static final /* enum */ IlIIlIIl I;
    public static final /* enum */ IlIIlIIl l;
    public static final /* enum */ IlIIlIIl II;
    private final IIIlIIIII Il;
    private static final /* synthetic */ IlIIlIIl[] lI;
    private static final String[] ll;
    private static final Object[] III;

    private static /* synthetic */ IlIIlIIl[] I() {
        return new IlIIlIIl[]{I, II, l};
    }

    public static IlIIlIIl l(String string) {
        return Enum.valueOf(IlIIlIIl.class, string);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 2161;
        var1_1 = "\u6aa0\u6a31\u6a6d\u6a12\u95c3\u95cc\u95d6\u95b4\u977f\u9741\u959f\u95a4\u4e47\u30f7\u30a2\u4e58\u4e56\u4e79\u4e46\u4e6b\ue717\ue76c\ue72b\ue6d9\ue72c\ue733\ue727\ue77f\ue725\ue727\ue728\ue766\u61cc\u6360\u61a2\u6370\u6348\u61da\u61c3\u61f7\uaafd\uaabd\uaa67\uaabe\uaaf9\uaaf4\uaa91\uaabd\uaae9\uaac8\uaaf8\uaaaa";
        var2_2 = "\u0004\b\b\f\b\f".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        if (true) ** GOTO lbl13
        while (true) {
            block9: {
                block10: {
                    if (var9_9 < var8_8.length) break block9;
                    var3_3[var4_4] = new String(var8_8).intern();
                    var5_5 += var6_6;
                    if (++var4_4 < var2_2.length) break block10;
                    var7_7 = 0;
lbl13:
                    // 2 sources

                    var4_4 = 0;
                    var5_5 = 0;
                    var6_6 = '\u0000';
                    if (var7_7 == 0) break;
                }
                var6_6 = var2_2[var4_4];
                var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                var9_9 = 0;
            }
            switch (var9_9 % 6) {
                default: {
                    v0 = 18;
                    ** break;
                }
                case 4: {
                    v0 = 2;
                    ** break;
                }
                case 3: {
                    v0 = 13;
                    ** break;
                }
                case 5: {
                    v0 = 10;
                    ** break;
                }
                case 2: {
                    v0 = 124;
                    ** break;
                }
                case 1: 
            }
            v0 = 41;
            ** break;
lbl41:
            // 6 sources

            var10_10 = v0;
            v1 = var9_9++;
            var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
        }
        IlIIlIIl.ll = var3_3;
        IlIIlIIl.III = new Object[var3_3.length];
        IlIIlIIl.I = new IlIIlIIl(StringFactory.IIII("Self"));
        IlIIlIIl.II = new IlIIlIIl(StringFactory.IIII("Opponent"));
        IlIIlIIl.l = new IlIIlIIl(StringFactory.IIII("Everyone"));
        IlIIlIIl.lI = IlIIlIIl.I();
    }

    public String toString() {
        return this.Il.IIII();
    }

    private IlIIlIIl(IIIlIIIII iIIlIIIII) {
        this.Il = iIIlIIIII;
    }

    public static IlIIlIIl[] values() {
        return (IlIIlIIl[])lI.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(int n, short s, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0x1912;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIlIIl.III[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5595;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0x8415;
            n7 += 30137;
            n7 += 3533;
            n7 += 54968;
            n7 += 59984;
            n7 ^= 0xD548;
            n7 += 60067;
            n7 -= 29965;
            n7 += 25982;
            cArray[n6] = (char)((n7 ^= 0x2B56) ^ n4 ^ s ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

