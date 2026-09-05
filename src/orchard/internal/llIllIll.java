/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIllIll
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

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIl;

@Environment(value=EnvType.CLIENT)
final class llIllIll {
    static final llIllIll I;
    private static final IIIlIIIII l;
    private static final IIIlIIIII II;
    private final List<IIIlIl> Il;
    private final List<String> lI;
    private static final String[] ll;
    private static final Object[] III;

    /*
     * Enabled aggressive block sorting
     */
    private static List<String> I(String string) {
        if (string == null) return List.of();
        if (string.isBlank()) {
            return List.of();
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] stringArray = string.split(II.IIII());
        int n = stringArray.length;
        int n2 = 0;
        while (n2 < n) {
            String string2 = stringArray[n2];
            String string3 = string2.trim();
            if (!string3.isEmpty()) {
                arrayList.add(string3);
            }
            ++n2;
        }
        return arrayList;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var0 = 14366;
        var1_1 = "\u877a\u8788\u86d8\u8720\u870f\u87e8\u86c2\u87b1\u8782\u870a\u87ee\u879e\u8746\u8723\u87a1\u87ee\u8765\u86cf\u86e4\u8709\u8752\u8730\u8725\u879d\u87b4\u874e\u8765\u87bb\u8783\u8717\u877e\u8760\u871a\u8773\u87a4\u87e2\u879d\u8745\u8741\u87b1\u8750\u86fa\u87ac\u879b\u8711\u8718\u86c0\u8716\u8775\u870d\u8749\u86c6\u6d76\u6ccc\u6c99\u6cc2";
        var2_2 = "4\u0004".toCharArray();
        var3_3 = new String[var2_2.length];
        var7_7 = -1;
lbl6:
        // 2 sources

        while (true) {
            var4_4 = 0;
            var5_5 = 0;
            var6_6 = '\u0000';
            if (var7_7 != 0) ** GOTO lbl24
            llIllIll.ll = var3_3;
            llIllIll.III = new Object[var3_3.length];
            llIllIll.l = StringFactory.IIII("\\[(\\d{1,3}):(\\d{2})(?:[.:](\\d{1,3}))?]");
            llIllIll.II = StringFactory.IIII("\\R");
            llIllIll.I = new llIllIll(List.of(), List.of());
            return;
        }
lbl-1000:
        // 1 sources

        {
            block10: {
                if (var9_9 >= var8_8.length) {
                    var3_3[var4_4] = new String(var8_8).intern();
                    var5_5 += var6_6;
                    if (++var4_4 >= var2_2.length) {
                        var7_7 = 0;
                        ** continue;
                    } else {
                        ** GOTO lbl24
                    }
                }
                break block10;
lbl24:
                // 3 sources

                var6_6 = var2_2[var4_4];
                var8_8 = var1_1.substring(var5_5, var5_5 + var6_6).toCharArray();
                var9_9 = 0;
            }
            switch (var9_9 % 5) {
                case 2: {
                    v0 = 0;
                    ** break;
                }
                case 4: {
                    v0 = 28;
                    ** break;
                }
                case 1: {
                    v0 = 39;
                    ** break;
                }
                default: {
                    v0 = 90;
                    ** break;
                }
                case 3: 
            }
            v0 = 55;
lbl43:
            // 5 sources

            var10_10 = v0;
            v1 = var9_9++;
            var8_8[v1] = (char)(var8_8[v1] ^ var10_10 ^ var0);
            ** while (true)
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static long l(String string) {
        long l2;
        if (string == null) return 0L;
        if (string.isEmpty()) {
            return 0L;
        }
        long l3 = llIllIll.II(string);
        switch (string.length()) {
            case 2: {
                l2 = l3 * 10L;
                return l2;
            }
            default: {
                l2 = l3;
                return l2;
            }
            case 1: 
        }
        l2 = l3 * 100L;
        return l2;
    }

    private static long II(String string) {
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            return 0L;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static llIllIll Il(String string, String string2) {
        List<IIIlIl> list = llIllIll.III(string);
        List<String> list2 = llIllIll.I(string2);
        if (!list.isEmpty()) return new llIllIll(list, list2);
        if (!list2.isEmpty()) return new llIllIll(list, list2);
        return I;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    boolean lI() {
        if (!this.Il.isEmpty()) return false;
        if (!this.lI.isEmpty()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private llIllIll(List<IIIlIl> list, List<String> list2) {
        this.Il = List.copyOf(list);
        this.lI = List.copyOf(list2);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    String ll(long l2, long l3) {
        long l4 = Math.max(0L, l2);
        if (this.Il.isEmpty()) {
            if (!this.lI.isEmpty()) return "";
            return "";
        }
        int n = 0;
        int n2 = this.Il.size() - 1;
        int n3 = -1;
        boolean bl = true;
        block0: while (true) {
            int n4;
            if (!bl || (bl = false) || !true) {
                n3 = n4;
                n = n4 + 1;
            }
            while (true) {
                if (n <= n2) {
                    n4 = n + n2 >>> 1;
                    if (this.Il.get(n4).l() <= l4) {
                        continue block0;
                    }
                } else {
                    if (n3 < 0) {
                        return "";
                    }
                    String string = this.Il.get(n3).I();
                    return string;
                }
                n2 = n4 - 1;
            }
            break;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static List<IIIlIl> III(String string) {
        if (string == null) return List.of();
        if (string.isBlank()) {
            return List.of();
        }
        ArrayList<IIIlIl> arrayList = new ArrayList<IIIlIl>();
        Pattern pattern = Pattern.compile(l.IIII());
        String[] stringArray = string.split(II.IIII());
        int n = stringArray.length;
        int n2 = 0;
        boolean bl = true;
        block0: while (true) {
            long l2;
            int n3;
            String string2;
            ArrayList<Long> arrayList2;
            if (!bl || (bl = false) || !true) {
                if (!arrayList2.isEmpty()) {
                    String string3 = string2.substring(Math.min(n3, string2.length())).trim();
                    Iterator iterator = arrayList2.iterator();
                    while (iterator.hasNext()) {
                        l2 = (Long)iterator.next();
                        arrayList.add(new IIIlIl(l2, string3));
                    }
                }
                ++n2;
            }
            if (n2 >= n) {
                arrayList.sort(Comparator.comparingLong(IIIlIl::l));
                return arrayList;
            }
            string2 = stringArray[n2];
            Matcher matcher = pattern.matcher(string2);
            arrayList2 = new ArrayList<Long>();
            n3 = 0;
            while (true) {
                if (!matcher.find()) continue block0;
                long l3 = llIllIll.II(matcher.group(1));
                l2 = llIllIll.II(matcher.group(2));
                long l4 = llIllIll.l(matcher.group(3));
                arrayList2.add(Math.max(0L, l3 * 60000L + l2 * 1000L + l4));
                n3 = matcher.end();
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIl(int n, char c, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x3D5C;
        char[] cArray = ll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIllIll.III[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7655;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x2A27;
            n6 -= 27257;
            n6 -= 42270;
            n6 ^= 0x4A26;
            n6 -= 23018;
            n6 -= 14160;
            n6 += 4989;
            n6 += 639;
            n6 += 43233;
            cArray[n5] = (char)((n6 ^= 0xFD2B) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

