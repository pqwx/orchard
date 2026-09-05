/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - os.name
 *   - darwin
 *   - win
 *   - mac
 *   - nux
 *   - nix
 *   - aix
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 */
package orchard.internal;

import java.util.Locale;
import orchard.internal.IllIllII;

public final class IlIIll {
    private static final IllIllII I;
    private static String[] l;
    private static final int[] II;
    private static final String[] Il;
    private static final Object[] lI;

    public static IllIllII I() {
        return I;
    }

    private static void l() {
        IlIIll.l[0] = IlIIll.Il(IlIIll.IlI(-1757701593, 168318009).toCharArray(), 65711L, -443965980);
        IlIIll.l[1] = IlIIll.Il("".toCharArray(), 92566L, -224524157);
        IlIIll.l[2] = IlIIll.Il(IlIIll.IlI(-1757701594, 1708794595).toCharArray(), 52851L, 790132921);
        IlIIll.l[3] = IlIIll.Il(IlIIll.IlI(-1757701595, 1471689898).toCharArray(), 68278L, -965446167);
        IlIIll.l[4] = IlIIll.Il(IlIIll.IlI(-1757701596, -926520244).toCharArray(), 76852L, 284999384);
        IlIIll.l[5] = IlIIll.Il(IlIIll.IlI(-1757701597, 286987851).toCharArray(), 35907L, -50895231);
        IlIIll.l[6] = IlIIll.Il(IlIIll.IlI(-1757701598, -104783388).toCharArray(), 74818L, 163457474);
        IlIIll.l[7] = IlIIll.Il(IlIIll.IlI(-1757701599, 374296438).toCharArray(), 28829L, -535651157);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean II() {
        if (I != IllIllII.II) return false;
        return true;
    }

    private static String Il(char[] cArray, long l2, int n) {
        int n2 = 0xED0728DC ^ n;
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

    private IlIIll() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private static IllIllII lI(String string) {
        String string2 = string == null ? "" : string.toLowerCase(Locale.ROOT);
        if (string2.contains("win")) {
            return IllIllII.ll;
        }
        if (string2.contains("mac")) return IllIllII.lI;
        if (string2.contains("darwin")) {
            return IllIllII.lI;
        }
        if (string2.contains("nux")) return IllIllII.II;
        if (string2.contains("nix")) return IllIllII.II;
        if (!string2.contains("aix")) return IllIllII.III;
        return IllIllII.II;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 10488;
        String string = "\uef71\ue154\ue33c\u8a3f\ubd69\uc178\u3e0c\ucd89\u3df9\u1137\u8bbc\u8b97\u9ec2\u356c\u0ddd\ua315\ua3f2\u4d81\u3398\uf18b\u1477\uf4b8\u89fe\u26f0\u6b90\u0b19\u80fe\u8cf6\u8f92\u9b83\u433c\u53e9\u3096\u2b6d\u419a\ud8b2\uf476\ube14\u281d\u932c";
        char[] cArray = "\u28f4\u28fc\u28fc\u28fc\u28f0\u28fc\u28fc".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
        Il = stringArray;
        lI = new Object[stringArray.length];
        int n6 = 831710154;
        byte[] byArray = "\u0012\u00fc\u0005\u00df:\u00fe\u0090_\u00c8a\u0015\u00fc%\u00f4\u00aeDG\u00cd\u0094\u00d8\u00e8h\u0015S\u00ec\u00e4\n\u00be\u00c4\u0081\u00a0k\u009a\u00d2\u00a9\u0091}\u0093v\\QxJA\u00fex{\u00ff\u00be\u00bd8iY!f\u0084)\u00ae\b\u0094".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        II = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            IlIIll.II[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        l = new String[8];
        IlIIll.l();
        I = IlIIll.lI(System.getProperty("os.name", ""));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean ll() {
        if (I != IllIllII.ll) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean III() {
        if (I != IllIllII.lI) return false;
        return true;
    }

    private static int IIl(int n, int n2) {
        return II[n ^ 0x4412B1FB] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IlI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x973B9A27;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIll.lI[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xFB41A3B2;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 12: {
                    n6 = 45;
                    continue block33;
                }
                case 19: {
                    n6 = 181;
                    continue block33;
                }
                case 30: {
                    n6 = 96;
                    continue block33;
                }
                case 17: {
                    n6 = 148;
                    continue block33;
                }
                case 27: {
                    n6 = 129;
                    continue block33;
                }
                case 14: {
                    n6 = 32;
                    continue block33;
                }
                case 18: {
                    n6 = 141;
                    continue block33;
                }
                case 21: {
                    n6 = 72;
                    continue block33;
                }
                case 10: {
                    n6 = 197;
                    continue block33;
                }
                case 4: {
                    n6 = 135;
                    continue block33;
                }
                case 28: {
                    n6 = 127;
                    continue block33;
                }
                case 8: {
                    n6 = 206;
                    continue block33;
                }
                case 11: {
                    n6 = 58;
                    continue block33;
                }
                case 23: {
                    n6 = 102;
                    continue block33;
                }
                case 3: {
                    n6 = 46;
                    continue block33;
                }
                case 26: {
                    n6 = 170;
                    continue block33;
                }
                case 24: {
                    n6 = 206;
                    continue block33;
                }
                case 2: {
                    n6 = 63;
                    continue block33;
                }
                case 9: {
                    n6 = 134;
                    continue block33;
                }
                case 22: {
                    n6 = 170;
                    continue block33;
                }
                case 31: {
                    n6 = 157;
                    continue block33;
                }
                case 16: {
                    n6 = 227;
                    continue block33;
                }
                case 29: {
                    n6 = 224;
                    continue block33;
                }
                case 1: {
                    n6 = 214;
                    continue block33;
                }
                case 5: {
                    n6 = 12;
                    continue block33;
                }
                case 7: {
                    n6 = 100;
                    continue block33;
                }
                default: {
                    n6 = 70;
                    continue block33;
                }
                case 25: {
                    n6 = 129;
                    continue block33;
                }
                case 15: {
                    n6 = 203;
                    continue block33;
                }
                case 6: {
                    n6 = 121;
                    continue block33;
                }
                case 20: {
                    n6 = 214;
                    continue block33;
                }
                case 13: 
            }
            n6 = 235;
        }
        return new String(cArray).intern();
    }
}

