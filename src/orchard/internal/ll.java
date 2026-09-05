/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.ll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - os.version
 *   - android
 *   - os.name
 *   - darwin
 *   - 2ok=
 *   - win
 *   - mac
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

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.llllIIlI;

@Environment(value=EnvType.CLIENT)
public final class ll {
    private static final String I;
    private static final llllIIlI l;
    private static final String II;
    private static final boolean Il;
    private static final int[] lI;
    private static final String[] ll;
    private static final Object[] III;

    public static boolean I() {
        return Il;
    }

    private ll() {
    }

    public static llllIIlI l() {
        return l;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String II(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string.trim().toLowerCase(Locale.ROOT);
        if (string2.length() != 16) {
            return null;
        }
        int n = 0;
        while (n < string2.length()) {
            if (Character.digit(string2.charAt(n), 16) < 0) {
                return null;
            }
            ++n;
        }
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean Il() {
        if (l != llllIIlI.I) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lI(String string, String string2) {
        String string3 = string == null ? "" : string.toLowerCase(Locale.ROOT);
        String string4 = string2 != null ? string2.toLowerCase(Locale.ROOT) : "";
        String string5 = "android";
        if (string3.contains(string5)) return true;
        if (string4.contains(string5)) return true;
        return false;
    }

    public static String ll(String string, String string2) {
        if (string2 != null && !string2.isBlank()) {
            if (string != null) {
                if (string.endsWith("\"}")) {
                    String string3 = StringFactory.IIl("2ok=");
                    String string4 = string2;
                    String string5 = StringFactory.IIl("1NZcixBTEkbV");
                    String string6 = string.substring(0, string.length() - 1);
                    return string6 + string5 + string4 + string3;
                }
            }
        }
        return string;
    }

    public static boolean III() {
        return l == llllIIlI.ll;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IIl() {
        if (l != llllIIlI.lI) return false;
        return true;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 6029;
        var7_7 = "\ue70d\ue7be\ue7de\ue774\ue761\ue785\ue726\ue77d\ue72e\ue7aa\ue797\ue740\u7401\u74d8\u7496\u744b\u3a22\u3ad9\u3a87\u3a35\u3a11\u3ae6\u3a4d\u3a3f\u3a4e\u3af3\u3abb\u3a58\uc319\uc3c0\uc38e\uc353\u6b9f\u6b43\u6b5e\u6bd7\u6bf3\u6b16\u6b87\u6bea\u6bbd\u6b29\u6b04\u6bd3\ub2f8\ub224\ub239\ub2b0\ub296\ub271\ub2f0\ub2aa\ub2dd\ub267\ub209\ub2d0\ub214\ub2ae\ub2e7\ub290\ueebf\uee46\uee35\ueeae\ueed5\uee54\ueed5\uee84\ueed6\uee42\uee0d\ueedd\uee0e\ueeb6\uee8b\ueed0\uee06\uee59\uee93\uee56\uee0a\uee9c\uee5a\uee41\ueed4\uee5d\ueee4\ueed6\uee34\uee20\ueea2\ueee8\ueecc\uee70\uee2e\uee86\ueeb5\uee76\ueef0\ueeba\ueec8\uee6e\uee01\ueee2\uee17\uee8a\ueead\ueeed\uee0a\uee4a\uee8b\uee53\uee0f\ueead\uee72\uee7a\ueee7\uee7a\ueef6\ueecd\uee19\uee23\ueefe\ueed1\ueeae\uee4c\uee51\ueea0\ueeec\uee5e\ueec1\uee86\ueef7\uee79\uee0c\ueeea\uee18\ueecc\ueedd\ueed5\uee36\uee53\uee85\uee03\u3919\u39c2\u398c\u3957\u23d5\u2367\u2321\u23a4\uac23\uac83\uacd5\uac4f\uac4f\uacb8\uac13\uac6f\u2a43\u2ac4\u2aa7\u2a27\uba94\uba0c\uba07\ubaf0\u0e3d\u0e8e\u0eaf\u0e58";
        var8_8 = "\f\u0004\f\u0004\f\u0010T\u0004\u0004\b\u0004\u0004\u0004".toCharArray();
        var9_9 = new String[var8_8.length];
        var13_13 = -1;
        if (true) ** GOTO lbl34
        while (true) {
            block13: {
                switch (var15_15 % 6) {
                    case 3: {
                        v0 = 1;
                        break;
                    }
                    default: {
                        v0 = 52;
                        break;
                    }
                    case 5: {
                        v0 = 8;
                        break;
                    }
                    case 2: {
                        v0 = 28;
                        break;
                    }
                    case 1: {
                        v0 = 46;
                        break;
                    }
                    case 4: {
                        v0 = 36;
                    }
                }
                var16_16 = v0;
                v1 = var15_15++;
                var14_14[v1] = (char)(var14_14[v1] ^ var16_16 ^ var6);
                if (var15_15 < var14_14.length) continue;
                var9_9[var10_10] = new String(var14_14).intern();
                var11_11 += var12_12;
                if (++var10_10 < var8_8.length) break block13;
                var13_13 = 0;
lbl34:
                // 2 sources

                var10_10 = 0;
                var11_11 = 0;
                var12_12 = '\u0000';
                if (var13_13 == 0) {
                    orchard.internal.ll.ll = var9_9;
                    orchard.internal.ll.III = new Object[var9_9.length];
                    var2_3 = 949450982;
                    var0_1 = "\u0094\u00c4\u0010\u00f4\u0003[)\u0017".getBytes("ISO-8859-1");
                    var1_2 = var0_1.length / 4;
                    orchard.internal.ll.lI = new int[var1_2];
                    var3_4 = 0;
                    var4_5 = 0;
                    do {
                        var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                        orchard.internal.ll.lI[var4_5] = var5_6 ^= var2_3;
                        var3_4 += 4;
                    } while (++var4_5 < var1_2);
                    orchard.internal.ll.I = System.getProperty("os.name", "");
                    orchard.internal.ll.II = System.getProperty("os.version", "");
                    orchard.internal.ll.l = orchard.internal.ll.Ill(orchard.internal.ll.I);
                    orchard.internal.ll.Il = orchard.internal.ll.lI(orchard.internal.ll.I, orchard.internal.ll.II);
                    return;
                }
            }
            var12_12 = var8_8[var10_10];
            var14_14 = var7_7.substring(var11_11, var11_11 + var12_12).toCharArray();
            var15_15 = 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String IlI(String string) {
        if (string == null) return null;
        if (string.isBlank()) {
            return null;
        }
        Pattern pattern = Pattern.compile("(?i)([0-9a-f]{32}|[0-9a-f]{8}(?:-[0-9a-f]{4}){3}-[0-9a-f]{12})");
        Matcher matcher = pattern.matcher(string);
        if (!matcher.find()) {
            return null;
        }
        String string2 = matcher.group(1).toLowerCase(Locale.ROOT);
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static llllIIlI Ill(String string) {
        String string2 = string == null ? "" : string.toLowerCase(Locale.ROOT);
        if (!string2.contains("win")) {
            if (string2.contains("mac")) return llllIIlI.ll;
            if (string2.contains("darwin")) {
                return llllIIlI.ll;
            }
            if (string2.contains("nux")) return llllIIlI.I;
            if (string2.contains("nix")) return llllIIlI.I;
            if (!string2.contains("aix")) return llllIIlI.II;
            return llllIIlI.I;
        }
        return llllIIlI.lI;
    }

    private static int lII(int n, int n2) {
        return lI[n ^ 0xBC72B60E] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x5BDD1B44;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            orchard.internal.ll.III[n3] = stackTraceElementArray = new Throwable().getStackTrace();
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x8C4C7E0E;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 3 -> 177;
                case 26 -> 250;
                case 13 -> 134;
                case 5 -> 112;
                case 12 -> 3;
                case 4 -> 186;
                case 30 -> 170;
                case 2 -> 39;
                case 17 -> 88;
                case 16 -> 21;
                case 7 -> 163;
                case 6 -> 221;
                case 27 -> 248;
                case 28 -> 46;
                case 18 -> 180;
                case 20 -> 22;
                case 11 -> 224;
                case 21 -> 174;
                case 24 -> 248;
                case 31 -> 238;
                case 22 -> 83;
                case 23 -> 122;
                case 1 -> 95;
                case 8 -> 241;
                case 14 -> 167;
                case 19 -> 76;
                case 29 -> 62;
                case 9 -> 127;
                default -> 193;
                case 10 -> 27;
                case 25 -> 49;
                case 15 -> 205;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

