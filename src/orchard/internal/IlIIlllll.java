/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIlllll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Gmin
 *   - Gmih
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

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;

@Environment(value=EnvType.CLIENT)
public final class IlIIlllll
extends Enum<IlIIlllll> {
    public static final /* enum */ IlIIlllll I;
    public static final /* enum */ IlIIlllll l;
    private final Color II;
    public static final /* enum */ IlIIlllll Il;
    private static final /* synthetic */ IlIIlllll[] lI;
    private final IIIlIIIII ll;
    public static final /* enum */ IlIIlllll III;
    private static final int[] IIl;
    private static final String[] IlI;
    private static final Object[] Ill;

    public IIIlIIIII I() {
        return this.ll;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 1291;
        String string = "\uce42\ucee4\uced4\uce33\uceb8\uce4b\ucef2\u3bf9\u3b73\u3b51\u3bb1\u91d4\u9179\u9145\u91b0\u913e\u91d5\u9165\uafc7\uaf4d\uaf6f\uaf89\u758e\u7529\u7507\u75e9\ud137\ud1ad\ud1e7\ud100\u583f\u5889\u58bc\u5847\u58cd\u582f\u589f\u8d1f\u8ddc\u8d96\u8d71";
        char[] cArray = "\u050c\u050f\u050c\u050f\u050f\u050f\u050c\u050f".toCharArray();
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
        IlI = stringArray;
        Ill = new Object[stringArray.length];
        int n6 = 847556522;
        byte[] byArray = "\u00a8B\u00d4\u00ed \f\u00b3W\u0086\u00c4\u00f9Q\"\u0000 B\u00f4#\u00c4e\u00c2\u00e9M=".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IIl = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            IlIIlllll.IIl[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        l = new IlIIlllll(new Color(20, 250, 90), StringFactory.IIII("Gmin"));
        Il = new IlIIlllll(new Color(255, 30, 30), StringFactory.IIII("Gmih"));
        III = new IlIIlllll(Color.WHITE, StringFactory.IIII("i"));
        I = new IlIIlllll(Color.YELLOW, StringFactory.IIII("!"));
        lI = IlIIlllll.lI();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private IlIIlllll(Color color, IIIlIIIII iIIlIIIII) {
        this.II = color;
        this.ll = iIIlIIIII;
    }

    public static IlIIlllll l(String string) {
        return Enum.valueOf(IlIIlllll.class, string);
    }

    public static IlIIlllll[] values() {
        return (IlIIlllll[])lI.clone();
    }

    public String II() {
        return this.ll.IIII();
    }

    public Color Il() {
        return this.II;
    }

    private static /* synthetic */ IlIIlllll[] lI() {
        return new IlIIlllll[]{l, Il, III, I};
    }

    private static int ll(int n, int n2) {
        return IIl[n ^ 0x68ADFA38] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String III(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xFDA4E6BE;
        char[] cArray = IlI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Ill[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IlIIlllll.Ill[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xE41B432F;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 15 -> 207;
                case 23 -> 89;
                case 24 -> 130;
                case 13 -> 108;
                case 3 -> 38;
                case 17 -> 187;
                case 18 -> 180;
                case 7 -> 50;
                case 21 -> 60;
                case 27 -> 179;
                case 28 -> 147;
                case 30 -> 255;
                case 2 -> 193;
                case 22 -> 64;
                case 25 -> 56;
                case 10 -> 106;
                case 26 -> 46;
                case 5 -> 78;
                case 31 -> 3;
                case 14 -> 189;
                case 1 -> 231;
                case 19 -> 115;
                case 12 -> 230;
                case 9 -> 188;
                case 4 -> 171;
                case 6 -> 247;
                case 11 -> 78;
                case 8 -> 121;
                default -> 71;
                case 20 -> 118;
                case 16 -> 238;
                case 29 -> 104;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

