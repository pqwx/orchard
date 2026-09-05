/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIIII
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
final class lIIIIII
extends Enum<lIIIIII> {
    public static final /* enum */ lIIIIII I;
    public static final /* enum */ lIIIIII l;
    public static final /* enum */ lIIIIII II;
    public static final /* enum */ lIIIIII Il;
    private static final /* synthetic */ lIIIIII[] lI;
    public static final /* enum */ lIIIIII ll;
    private static final String[] III;
    private static final Object[] IIl;

    private static /* synthetic */ lIIIIII[] I() {
        return new lIIIIII[]{I, Il, l, II, ll};
    }

    public static lIIIIII[] values() {
        return (lIIIIII[])lI.clone();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 23154;
        String string = "\uc7fd\uc812\uc7fa\uc811\u0e2a\u0dbc\u0e2a\u0dc2\u0dbd\u0dc2\u0dc3\u0e2c\u0dd4\u0db9\u0e2e\u0e2a\u0db7\u0e25\u0dd4\u0e2a\u0e28\u0dbd\u0dc2\u0dbb\u0e2e\u1f49\u1f5e\u1f5a\u1f47\u1f55\u1f64\u1f5a\u1f58\u1f4d\u1f72\u1f74\u1f73\u1f64\u1f4a\u1f4e\u1f5e\u1f4e\u1f5e\u1f5d\u4540\u4536\u4540\u41a8\u4553\u41a8\u41ad\u41a6\u453e\u4536\u41a8\u41ad\u4543\u4542\u41a7\u4540\u4551\u41a6\u4544\u453e\u4540\u4542\u4553\u41a8\u4535\u4544\u0799\u07a3\u07a2\u0788\u078d\u07a4\u078b\u079e\u0789\u0787\u07b1\u078b\u078d\u0798\u07a3\u07a1\u07a2\u07b1\u079b\u0797\u0787\u0797\u0787\u0788";
        char[] cArray = "\u5a76\u5a67\u5a61\u5a68\u5a6a".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                n2 = 0;
            }
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
        }
        III = stringArray;
        IIl = new Object[stringArray.length];
        I = new lIIIIII();
        Il = new lIIIIII();
        l = new lIIIIII();
        II = new lIIIIII();
        ll = new lIIIIII();
        lI = lIIIIII.I();
    }

    public static lIIIIII l(String string) {
        return Enum.valueOf(lIIIIII.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String II(char c, int n, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xE020;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIIIIII.IIl[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4042;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 11432;
            n6 += 8675;
            n6 ^= 0xF942;
            n6 ^= 0x1F72;
            n6 -= 54022;
            n6 += 23570;
            cArray[n5] = (char)((n6 -= 10838) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

