/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Corners
 *   - Box
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
final class llIIlI
extends Enum<llIIlI> {
    public static final /* enum */ llIIlI I;
    private static String[] l;
    private final IIIlIIIII II;
    public static final /* enum */ llIIlI Il;
    private static final /* synthetic */ llIIlI[] lI;
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 19180;
        var7_7 = "\uc338\u8416\ube14\u884d\ucffb\ua741\u617d\u962e\u2fe0\u6978\uc8bc\u134c\uf7c9\u0a94\u77ff?\ucc6b\ubaa4\u1722\ufa23\u7875\ua605\uf1aa\ud8b9\ueaa8\ud309";
        var8_8 = "\u4aef\u4ae0\u4ae8\u4aeb".toCharArray();
        var9_9 = new String[var8_8.length];
        var13_13 = -1;
        if (true) ** GOTO lbl58
lbl7:
        // 1 sources

        while (true) {
            var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
            llIIlI.ll[var4_5] = var5_6 ^= var2_3;
            var3_4 += 4;
            if (++var4_5 < var1_2) continue;
            llIIlI.l = new String[4];
            llIIlI.I();
            llIIlI.I = new llIIlI("Box");
            llIIlI.Il = new llIIlI("Corners");
            llIIlI.lI = llIIlI.l();
            return;
        }
        llIIlI.III = var9_9;
        llIIlI.IIl = new Object[var9_9.length];
        var2_3 = -1672396186;
        var0_1 = "H:BF\u0091\u00fc^\u00d7&\u0015\u00f3\u00fa\u0099\u0010h8RKW\u00cc\u0096\u0019\u00f69".getBytes("ISO-8859-1");
        var1_2 = var0_1.length / 4;
        llIIlI.ll = new int[var1_2];
        var3_4 = 0;
        var4_5 = 0;
        ** while (true)
        while (true) {
            var12_12 = var8_8[var10_10] ^ var6;
            var14_14 = var7_7.substring(var11_11, var11_11 + var12_12).toCharArray();
            var15_15 = 0;
            do {
                switch (var15_15 % 6) {
                    case 5: {
                        v0 = 90;
                        break;
                    }
                    case 4: {
                        v0 = 12;
                        break;
                    }
                    case 1: {
                        v0 = 106;
                        break;
                    }
                    case 2: {
                        v0 = 16;
                        break;
                    }
                    default: {
                        v0 = 57;
                        break;
                    }
                    case 3: {
                        v0 = 6;
                    }
                }
                var16_16 = v0;
                v1 = var15_15++;
                var14_14[v1] = (char)(var14_14[v1] ^ var16_16);
            } while (var15_15 < var14_14.length);
            var9_9[var10_10] = new String(var14_14).intern();
            var11_11 += var12_12;
            if (++var10_10 < var8_8.length) continue;
            var13_13 = 0;
lbl58:
            // 2 sources

            var10_10 = 0;
            var11_11 = 0;
            var12_12 = 0;
            if (var13_13 == 0) ** break;
        }
    }

    private static void I() {
        llIIlI.l[0] = llIIlI.Il(llIIlI.ll(-1824107459, '\ub4d8', (short)47383).toCharArray(), 810L, 1141274951);
        llIIlI.l[1] = llIIlI.Il(llIIlI.ll(-1136835648, '\ub4d9', (short)20601).toCharArray(), 86933L, 1042318763);
        llIIlI.l[2] = llIIlI.Il(llIIlI.ll(-897828469, '\ub4da', (short)13337).toCharArray(), 68794L, 1272206523);
        llIIlI.l[3] = llIIlI.Il(llIIlI.ll(1889153911, '\ub4db', (short)56388).toCharArray(), 33970L, -326160892);
    }

    private static /* synthetic */ llIIlI[] l() {
        return new llIIlI[]{I, Il};
    }

    private llIIlI(String string2) {
        this.II = StringFactory.lIl(string2);
    }

    public static llIIlI II(String string) {
        return Enum.valueOf(llIIlI.class, string);
    }

    public static llIIlI[] values() {
        return (llIIlI[])lI.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String Il(char[] cArray, long l2, int n) {
        int n2 = 0xC1105564 ^ n;
        int n3 = 0;
        while (n3 < cArray.length) {
            n2 = n2 ^ (int)l2 ^ ~n3;
            n2 ^= n - n3 * cArray.length;
            n2 = -n2 * n | n3;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            int n4 = n3 & 0xFF;
            n = n << n4 | n >>> -n4;
            l2 ^= (long)n4;
            ++n3;
        }
        return new String(cArray);
    }

    public String toString() {
        return this.II.IIII();
    }

    private static int lI(int n, int n2) {
        return ll[n ^ 0x20560484] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xB4D8;
        char[] cArray = III[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIIlI.IIl[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2B0A;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 41285;
            n6 += 29929;
            n6 ^= 0x7FB7;
            n6 += 33172;
            n6 += 57269;
            n6 ^= 0x8EB8;
            n6 += 16952;
            n6 += 23712;
            cArray[n5] = (char)((n6 -= 29985) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

