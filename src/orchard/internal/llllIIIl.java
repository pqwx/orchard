/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllIIIl
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
final class llllIIIl
extends Enum<llllIIIl> {
    private static final /* synthetic */ llllIIIl[] I;
    public static final /* enum */ llllIIIl l;
    public static final /* enum */ llllIIIl II;
    private final boolean Il;
    public static final /* enum */ llllIIIl lI;
    private final boolean ll;
    private static final String[] III;
    private static final Object[] IIl;

    boolean I() {
        return this.Il;
    }

    boolean l() {
        return this.ll;
    }

    /*
     * Enabled aggressive block sorting
     */
    private llllIIIl(boolean bl, boolean bl2) {
        this.Il = bl;
        this.ll = bl2;
    }

    private static /* synthetic */ llllIIIl[] II() {
        return new llllIIIl[]{lI, l, II};
    }

    public static llllIIIl Il(String string) {
        return Enum.valueOf(llllIIIl.class, string);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 13355;
        var1_1 = "\uaa1f\uaa4e\uaa1f\uaa2b\uaa58\uaa6d\uaa4e\u5ba2\u580f\u5842\u5b42\u5b4d\u3c76\u3c27\u014b\u3c42\u3c4c\u0148";
        var2_2 = "\u342c\u342e\u342d".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        if (true) ** GOTO lbl16
        block6: while (true) {
            block11: {
                block12: {
                    var10_10 = v0;
                    v1 = var9_9++;
                    var8_8[v1] = (char)(var8_8[v1] ^ var10_10);
                    if (var9_9 < var8_8.length) break block11;
                    var3_3[var4_4] = new String(var8_8).intern();
                    var5_5 += var6_6;
                    if (++var4_4 < var2_2.length) break block12;
                    var7_7 = 0;
lbl16:
                    // 2 sources

                    var4_4 = 0;
                    var5_5 = 0;
                    var6_6 = 0;
                    if (var7_7 == 0) {
                        llllIIIl.III = var3_3;
                        llllIIIl.IIl = new Object[var3_3.length];
                        llllIIIl.lI = new llllIIIl(false, false);
                        llllIIIl.l = new llllIIIl(true, false);
                        llllIIIl.II = new llllIIIl(true, true);
                        llllIIIl.I = llllIIIl.II();
                        return;
                    }
                }
                var6_6 = var2_2[var4_4] ^ var0;
                var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                var9_9 = 0;
            }
            switch (var9_9 % 5) {
                case 4: {
                    v0 = 79;
                    continue block6;
                }
                case 3: {
                    v0 = 71;
                    continue block6;
                }
                default: {
                    v0 = 114;
                    continue block6;
                }
                case 2: {
                    v0 = 108;
                    continue block6;
                }
                case 1: 
            }
            v0 = 34;
        }
    }

    public static llllIIIl[] values() {
        return (llllIIIl[])I.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lI(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x34DE;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llllIIIl.IIl[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x585A;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x61D7;
            n6 += 34455;
            n6 ^= 0x8E69;
            n6 -= 13034;
            n6 -= 5295;
            n6 ^= 0x9C89;
            n6 -= 26246;
            n6 -= 55885;
            n6 ^= 0x1A33;
            cArray[n5] = (char)((n6 ^= 0x1ED0) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

