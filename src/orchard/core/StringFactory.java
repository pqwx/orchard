/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllIIII
 * Identified from direct evidence; see README.md
 *
 * Recovered strings in this class:
 *   - .getBytes(
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
package orchard.core;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.function.IntConsumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
public final class StringFactory {
    private static final byte[] I;
    private static final SecureRandom l;
    private static final int[] II;

    /*
     * Enabled aggressive block sorting
     */
    public static long I(String string) {
        long l2 = -3750763034362895579L;
        if (string == null) {
            return l2;
        }
        int n = 0;
        while (n < string.length()) {
            int n2 = string.codePointAt(n);
            l2 ^= (long)n2;
            l2 *= 1099511628211L;
            n += Character.charCount(n2);
        }
        return l2;
    }

    private static boolean l(byte by) {
        return (by & 0xC0) == 128;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean II(int n, int n2) {
        if (n == n2) {
            return true;
        }
        int n3 = Character.toUpperCase(n);
        int n4 = Character.toUpperCase(n2);
        if (n3 == n4) return true;
        if (Character.toLowerCase(n3) == Character.toLowerCase(n4)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int Il(CharSequence charSequence) {
        int n = 0;
        int n2 = 0;
        while (n2 < charSequence.length()) {
            int n3 = Character.codePointAt(charSequence, n2);
            n2 += Character.charCount(n3);
            ++n;
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int lI(byte[] byArray, int n, int n2) {
        int n3;
        int n4 = byArray[n] & 0xFF;
        if (n4 < 128) {
            return 1;
        }
        if (n4 >= 194 && n4 <= 223 && n + 1 < n2 && StringFactory.l(byArray[n + 1])) {
            return 2;
        }
        if (n4 >= 224 && n4 <= 239 && n + 2 < n2 && StringFactory.l(byArray[n + 1]) && StringFactory.l(byArray[n + 2])) {
            n3 = byArray[n + 1] & 0xFF;
            if (n4 != 224 || n3 >= 160) {
                if (n4 != 237) return 3;
                if (n3 <= 159) {
                    return 3;
                }
            }
        }
        if (n4 < 240) return 1;
        if (n4 > 244) return 1;
        if (n + 3 >= n2) return 1;
        if (!StringFactory.l(byArray[n + 1])) return 1;
        if (!StringFactory.l(byArray[n + 2])) return 1;
        if (!StringFactory.l(byArray[n + 3])) return 1;
        n3 = byArray[n + 1] & 0xFF;
        if (n4 == 240) {
            if (n3 < 144) return 1;
        }
        if (n4 != 244) return 4;
        if (n3 > 143) return 1;
        return 4;
    }

    private static IIIlIIIII ll(String string) {
        byte[] byArray = Base64.getDecoder().decode(string);
        try {
            for (int i = 0; i < byArray.length; ++i) {
                int n = i;
                byArray[n] = (byte)(byArray[n] ^ I[i & 0xF]);
            }
            IIIlIIIII iIIlIIIII = IIIlIIIII.lIII(byArray);
            return iIIlIIIII;
        }
        finally {
            Arrays.fill(byArray, (byte)0);
        }
    }

    private static int III(byte[] byArray, int n, int n2) {
        int n3 = 0;
        int n4 = n;
        while (n4 < n2) {
            n4 += StringFactory.lI(byArray, n4, n2);
            ++n3;
        }
        return n3;
    }

    public static String IIl(String string) {
        if (string != null) {
            if (!string.isEmpty()) {
                return StringFactory.IIII(string).IIII();
            }
        }
        return "";
    }

    public static boolean IlI(String string) {
        if (string == null || string.isEmpty()) {
            return false;
        }
        try {
            byte[] byArray = Base64.getDecoder().decode(string);
            if (byArray.length == 0) {
                return false;
            }
            for (int i = 0; i < byArray.length; ++i) {
                int n = i;
                byArray[n] = (byte)(byArray[n] ^ I[i & 0xF]);
            }
            CharsetDecoder charsetDecoder = StandardCharsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
            CharBuffer charBuffer = charsetDecoder.decode(ByteBuffer.wrap(byArray));
            if (charBuffer.length() == 0) {
                return false;
            }
            for (int i = 0; i < charBuffer.length(); ++i) {
                char c = charBuffer.charAt(i);
                if (c != '\ufffd' && (!Character.isISOControl(c) || c == '\n' || c == '\r' || c == '\t')) continue;
                return false;
            }
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int Ill(byte[] byArray, int n) {
        int n2 = 0;
        int n3 = n;
        while (n2 < byArray.length && n3 > 0) {
            n2 += StringFactory.lI(byArray, n2, byArray.length);
            --n3;
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static byte[] lII() {
        int n = 1513827357;
        byte[] byArray = new byte[16];
        int n2 = 0;
        while (n2 < byArray.length) {
            n = n * 22695477 + 1;
            byArray[n2] = (byte)(n >> 8);
            ++n2;
        }
        return byArray;
    }

    private StringFactory() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 686403968;
        byte[] byArray = "h\u00fc-\u001c:\u000b\u00cd\rO~\u00aca:\u0097n\u0095\u00f3\u00b1\u00cf\u0081[ \u0094f\u008a\u00a4(\u0002\u00d3Q\u0004\u008c\u00c1/l\u00b5\u009a\u00d5\u00bd\u00e5.\u00ab\u00b8\u00a21_\u00f8\u00d3\u00e6\u0099\u0004\u00a7\u008a\u00d9\u0097\u00aeQ\u0019\u00a6X(\u00c4\u009f\u0091\u008b\u00faD\u00f8oW=\u0017Y\u00bf \u00cb\u00d3p\u00ad\u00ef\b\u00d6\u009a\u00fd\u00d2\u00b7+\u001c6\u0088\u009d\u0016q\u00e6\u00f3\u00d2\r\u0004\u0013\u00fa[\u008d\u00a9\u00aej\u001d\u00ec\u00c8\u00c0\u00bc\"\u000e\u00f9\u0083\u00cbQa@\u00d1\u001a\u00fd\u00e6\u001e\u00c4\u00a4\u00e93Ne\u00d6A\u001cPu\u0000\u00c0\u00bf\u0084\u00a0\u00b5\u00b2\u000fw\u00d5=\u0093B\u00b44\u00bcdB\u0086\u008b3\u008e\u00c53\u00aa\u00f8\u0001\u00d9\u00f4/\u0090>\u0083-M\u00de&\u00b1e\u0019i\u00f1\u00c6\u0088\u0084\u00e2\u0092\u00ba\bOgc{P\u00c2@\u00c6#".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        II = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            StringFactory.II[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
        I = StringFactory.lII();
        l = new SecureRandom();
    }

    public static IIIlIIIII lIl(String string) {
        return IIIlIIIII.l(string);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static long llI(String string) {
        long l2 = -3750763034362895579L;
        if (string != null) {
            int n = 0;
            while (n < string.length()) {
                int n2 = string.codePointAt(n);
                l2 ^= (long)Character.toLowerCase(n2);
                l2 *= 1099511628211L;
                n += Character.charCount(n2);
            }
            return l2;
        }
        return l2;
    }

    /*
     * Unable to fully structure code
     */
    private static void lll(byte[] var0, int var1_1, int var2_2, IntConsumer var3_3) {
        block12: {
            block9: {
                block11: {
                    block10: {
                        block8: {
                            var4_4 = var1_1;
lbl2:
                            // 2 sources

                            while (true) {
                                if (var4_4 < var2_2) break block8;
                                return;
                                while (true) {
                                    v0 = 65533;
                                    break block9;
                                    break;
                                }
                                break;
                            }
lbl8:
                            // 1 sources

                            while (true) {
                                var7_7 = (var6_6 & 7) << 18 | (var0[var4_4 + 1] & 63) << 12 | (var0[var4_4 + 2] & 63) << 6 | var0[var4_4 + 3] & 63;
                                break block10;
                                break;
                            }
lbl11:
                            // 1 sources

                            while (true) {
                                block13: {
                                    block14: {
                                        if (var5_5 != 1) break block13;
                                        break block14;
lbl14:
                                        // 1 sources

                                        while (true) {
                                            var7_7 = (var6_6 & 31) << 6 | var0[var4_4 + 1] & 63;
                                            break block10;
                                            break;
                                        }
                                    }
                                    if (var6_6 >= 128) ** continue;
                                    break block11;
                                }
                                if (var5_5 != 2) break block12;
                                ** continue;
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                var7_7 = (var6_6 & 15) << 12 | (var0[var4_4 + 1] & 63) << 6 | var0[var4_4 + 2] & 63;
                                break block10;
                                break;
                            }
                        }
                        var5_5 = StringFactory.lI(var0, var4_4, var2_2);
                        var6_6 = var0[var4_4] & 255;
                        ** while (true)
lbl30:
                        // 1 sources

                        while (true) {
                            var4_4 += var5_5;
                            ** continue;
                            break;
                        }
                    }
lbl34:
                    // 2 sources

                    while (true) {
                        var3_3.accept(var7_7);
                        ** continue;
                        break;
                    }
                }
                v0 = var6_6;
            }
            var7_7 = v0;
            ** while (true)
        }
        ** while (var5_5 != 3)
lbl44:
        // 1 sources

        ** while (true)
    }

    public static IIIlIIIII IIII(String string) {
        if (string != null) {
            if (!string.isEmpty()) {
                return StringFactory.ll(string);
            }
        }
        return IIIlIIIII.I;
    }

    public static IIIlIIIII IIIl(Object object) {
        if (object instanceof IIIlIIIII) {
            IIIlIIIII iIIlIIIII = (IIIlIIIII)object;
            return iIIlIIIII;
        }
        if (object == null) {
            return IIIlIIIII.I;
        }
        String string = object.toString();
        if (string.isEmpty()) {
            return IIIlIIIII.I;
        }
        if (StringFactory.IlI(string)) {
            try {
                return StringFactory.IIII(string);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return IIIlIIIII.l(string);
    }

    private static int IIlI(int n, int n2) {
        return II[n ^ 0x5A9EA349] ^ n2 ^ n;
    }
}

