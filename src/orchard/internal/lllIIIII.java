/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIIIII
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
public final class lllIIIII
extends Enum<lllIIIII> {
    public static final /* enum */ lllIIIII I;
    public static final /* enum */ lllIIIII l;
    public static final /* enum */ lllIIIII II;
    private static final /* synthetic */ lllIIIII[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 2637;
        var1_1 = "\uf9ac\uf9b9\uf9aa\uf9a5\uf9d7\uf9b2\uf99f\uf99e\uf9a1\uf9b0\uf9b6\uf98c\uf9ac\uf9ae\uf9db\uf9ac\uf98e\ueadc\ueae9\ueada\uead5\ueaa7\ueac2\ueaef\ueace\uead1\ueaa0\ueac6\uea4f\uea65\uea7c\ue609\ue1dc\ue1ef\ue1c4\ue672\ue1fb\ue1d6\ue1fb\ue1e8\ue199\ue1d7\ue460\ue454\ue44d";
        var2_2 = "\u0011\u000e\u000e".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        ** GOTO lbl15
lbl7:
        // 1 sources

        while (true) {
            lllIIIII.I = new lllIIIII();
            lllIIIII.l = new lllIIIII();
            lllIIIII.II = new lllIIIII();
            lllIIIII.Il = lllIIIII.l();
            return;
        }
lbl13:
        // 1 sources

        while (true) {
            var7_7 = 0;
lbl15:
            // 2 sources

            var4_4 = 0;
            var5_5 = 0;
            var6_6 = '\u0000';
            if (var7_7 == 0) {
                lllIIIII.lI = var3_3;
                lllIIIII.ll = new Object[var3_3.length];
                ** continue;
            }
            while (true) {
                var6_6 = var2_2[var4_4];
                var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                var9_9 = 0;
                if (true) ** GOTO lbl37
                break;
            }
            break;
        }
        while (true) {
            var3_3[var4_4] = new String(var8_8).intern();
            var5_5 += var6_6;
            if (++var4_4 < var2_2.length) ** continue;
            ** continue;
            break;
        }
        block10: while (true) {
            var10_10 = v0;
            v1 = var9_9++;
            var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
            if (var9_9 >= var8_8.length) ** continue;
lbl37:
            // 2 sources

            switch (var9_9 % 5) {
                case 4: {
                    v0 = 47;
                    continue block10;
                }
                case 2: {
                    v0 = 94;
                    continue block10;
                }
                case 1: {
                    v0 = 121;
                    continue block10;
                }
                default: {
                    v0 = 84;
                    continue block10;
                }
                case 3: 
            }
            v0 = 71;
        }
    }

    public static lllIIIII[] values() {
        return (lllIIIII[])Il.clone();
    }

    public static lllIIIII I(String string) {
        return Enum.valueOf(lllIIIII.class, string);
    }

    private static /* synthetic */ lllIIIII[] l() {
        return new lllIIIII[]{I, l, II};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0x94E7;
        char[] cArray = lI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lllIIIII.ll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6E9C;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xD7EC;
            n6 -= 56772;
            n6 -= 9015;
            n6 ^= 0xBF08;
            n6 ^= 0x24E;
            cArray[n5] = (char)((n6 -= 11492) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

