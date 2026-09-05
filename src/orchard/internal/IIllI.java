/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Normal
 *   - Custom
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
public final class IIllI
extends Enum<IIllI> {
    public static final /* enum */ IIllI I;
    private static final /* synthetic */ IIllI[] l;
    public static final /* enum */ IIllI II;
    public static final /* enum */ IIllI Il;
    public static final /* enum */ IIllI lI;
    private final IIIlIIIII ll;
    private static final String[] III;
    private static final Object[] IIl;

    public String toString() {
        return this.ll.IIII();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 9847;
        var1_1 = "\u1fb2\u1f4c\u1f8c\u1f74\u1f38\u1f25\udcd8\udc23\udcfa\udc2e\udc42\udc6b\udcf5\udc9d\u2bdb\u2b24\u2bf7\u587c\u5895\u5846\u58fe\u2fd6\u2f2f\u2ff4\u2f0b\u2f52\u8829\u88ec\u8830\u88f6\u88a9\u888e\u880e\u8836\u674f\u67a6\u677d\u679d\u67c6\u67d4\u1965\u19db\u1974\u199d\u19fc\u19c7\u197b\u1922";
        var2_2 = "\u0006\b\u0003\u0004\u0005\b\u0006\b".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
        if (true) ** GOTO lbl40
        while (true) {
            IIllI.III = var3_3;
            IIllI.IIl = new Object[var3_3.length];
            IIllI.I = new IIllI(StringFactory.IIII("Normal"));
            IIllI.II = new IIllI(StringFactory.IIII("MMC"));
            IIllI.Il = new IIllI(StringFactory.IIII("PVPHQ"));
            IIllI.lI = new IIllI(StringFactory.IIII("Custom"));
            IIllI.l = IIllI.I();
            return;
        }
        while (true) {
            block10: {
                switch (var9_9 % 5) {
                    case 3: {
                        v0 = 83;
                        break;
                    }
                    case 4: {
                        v0 = 114;
                        break;
                    }
                    default: {
                        v0 = 123;
                        break;
                    }
                    case 1: {
                        v0 = 34;
                        break;
                    }
                    case 2: {
                        v0 = 43;
                    }
                }
                var10_10 = v0;
                v1 = var9_9++;
                var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
                if (var9_9 < var8_8.length) continue;
                var3_3[var4_4] = new String(var8_8).intern();
                var5_5 += var6_6;
                if (++var4_4 < var2_2.length) break block10;
                var7_7 = 0;
lbl40:
                // 2 sources

                var4_4 = 0;
                var5_5 = 0;
                var6_6 = '\u0000';
                if (var7_7 == 0) ** continue;
            }
            var6_6 = var2_2[var4_4];
            var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
            var9_9 = 0;
        }
    }

    public static IIllI[] values() {
        return (IIllI[])l.clone();
    }

    private static /* synthetic */ IIllI[] I() {
        return new IIllI[]{I, II, Il, lI};
    }

    private IIllI(IIIlIIIII iIIlIIIII) {
        this.ll = iIIlIIIII;
    }

    public static IIllI valueOf(String string) {
        return Enum.valueOf(IIllI.class, string);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String l(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xA9151BD7;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIllI.IIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xD288A5A;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 1 -> 214;
                case 15 -> 86;
                case 30 -> 181;
                case 19 -> 157;
                case 12 -> 23;
                case 17 -> 236;
                case 24 -> 211;
                default -> 112;
                case 5 -> 229;
                case 11 -> 245;
                case 2 -> 2;
                case 7 -> 115;
                case 28 -> 206;
                case 22 -> 182;
                case 26 -> 102;
                case 10 -> 113;
                case 29 -> 159;
                case 6 -> 24;
                case 8 -> 35;
                case 18 -> 152;
                case 20 -> 162;
                case 25 -> 176;
                case 27 -> 186;
                case 16 -> 149;
                case 23 -> 111;
                case 31 -> 62;
                case 4 -> 252;
                case 14 -> 188;
                case 21 -> 78;
                case 3 -> 157;
                case 13 -> 35;
                case 9 -> 6;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

