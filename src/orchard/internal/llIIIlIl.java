/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIIlIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - McPvP Club Default
 *   - PvPTiers Default
 *   - Uku Default
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
public final class llIIIlIl
extends Enum<llIIIlIl> {
    public static final /* enum */ llIIIlIl I;
    private static final /* synthetic */ llIIIlIl[] l;
    public static final /* enum */ llIIIlIl II;
    public static final /* enum */ llIIIlIl Il;
    private final IIIlIIIII lI;
    private static final String[] ll;
    private static final Object[] III;

    public String toString() {
        return this.lI.IIII();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 24343;
        String string = "\u4e27\u4e95\u4e27\u1624\u15dc\u15fb\u1634\u15e5\u1646\u15e3\u1645\u1650\u1622\u15e4\u1635\u1634\u164b\u1625\u15e7\u29a6\u2a14\u29a6\u2a0a\u29a7\u29a3\u29a0\u29a1\u07e9\u0801\u0806\u07df\u07e9\u07fe\u07fe\u0807\u0809\u07eb\u0893\u0810\u07f4\u0806\u07e8\u07e2\u080c\u07e7\u07de\u0807\u07e1\u07eb\u0825\u0825\u96a2\u96a0\u96af\u96a5\u96af\u96a0\u96ab\u969a\u96a1\u43fd\u440f\u43ed\u43e6\u43e0\u43e0\u43e6\u4411\u43de\u43f1\u43fe\u43fe\u43fe\u43fd\u4430\u4430\u43fe\u43fd\u4411\u43eb\u43e0\u443c\u440e\u43f8";
        char[] cArray = "\u5f14\u5f07\u5f1f\u5f0f\u5f1e\u5f0f".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            int n4;
            int n5;
            if (!bl || (bl = false) || !true) {
                n4 = cArray[n5] ^ n;
                stringArray[n5] = string.substring(n3, n3 + n4);
                n3 += n4;
                if (++n5 < cArray.length) continue;
                n2 = 0;
            }
            n5 = 0;
            n3 = 0;
            n4 = 0;
            if (n2 == 0) break;
        }
        ll = stringArray;
        III = new Object[stringArray.length];
        Il = new llIIIlIl(StringFactory.IIII("Uku Default"));
        I = new llIIIlIl(StringFactory.IIII("PvPTiers Default"));
        II = new llIIIlIl(StringFactory.IIII("McPvP Club Default"));
        l = llIIIlIl.II();
    }

    public static llIIIlIl[] values() {
        return (llIIIlIl[])l.clone();
    }

    private llIIIlIl(IIIlIIIII iIIlIIIII) {
        this.lI = iIIlIIIII;
    }

    public IIIlIIIII I() {
        return this.lI;
    }

    public static llIIIlIl l(String string) {
        return Enum.valueOf(llIIIlIl.class, string);
    }

    private static /* synthetic */ llIIIlIl[] II() {
        return new llIIIlIl[]{Il, I, II};
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Il(int n, short s, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xFC08;
        char[] cArray = ll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIIIlIl.III[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x3A87;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 42217;
            n6 ^= 0x7FC4;
            n6 -= 29107;
            n6 ^= 0x5B0A;
            cArray[n5] = (char)((n6 += 39028) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

