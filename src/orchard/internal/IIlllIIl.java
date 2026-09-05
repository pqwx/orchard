/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlllIIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - ilovcats_subversion
 *   - ilovcats_build
 *   - lZdriBhFVxmD
 *   - .getBytes(
 *   - REDACTED
 *   - ilovcats
 *   - unknown
 *   - NITRO
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParser
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.fabricmc.loader.api.metadata.CustomValue
 *  net.fabricmc.loader.api.metadata.ModMetadata
 */
package orchard.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.fabricmc.loader.api.metadata.CustomValue;
import net.fabricmc.loader.api.metadata.ModMetadata;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIlll;
import orchard.internal.IIllIIIII;
import orchard.internal.IIllIIIll;

@Environment(value=EnvType.CLIENT)
public final class IIlllIIl {
    static final IIIlIIIII I;
    static final boolean l = false;
    private volatile long II;
    private static final HttpClient Il;
    static final IIIlIIIII lI;
    private volatile CompletableFuture<Void> ll;
    private static final long III = 1800000L;
    private static final IIIlIIIII IIl;
    static final IIIlIIIII IlI;
    static final IIIlIIIII Ill;
    private volatile IIllIIIll lII;
    private static final int lIl = 16384;
    private static final Duration llI;
    private static final IIIlIIIII lll;
    private final IIllIIIII IIII = IIlllIIl.lII();
    private static final int[] IIIl;
    private static final String[] IIlI;
    private static final Object[] IIll;

    /*
     * Enabled aggressive block sorting
     */
    static String I(String string, int n) {
        String string2;
        String string3;
        String string4 = string3 = string != null && !string.isBlank() ? string.trim() : "unknown";
        if (n <= 0) {
            string2 = string3;
            return string2;
        }
        int n2 = n;
        String string5 = ".";
        String string6 = string3;
        string2 = string6 + string5 + n2;
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static IIIlIlll l(String string) {
        IIIlIlll iIIlIlll;
        JsonObject jsonObject = JsonParser.parseString((String)string).getAsJsonObject();
        iIIlIlll(IIlllIIl.lI(jsonObject, StringFactory.IIl("jpFGjxBYXg==")), IIlllIIl.III(jsonObject, StringFactory.IIl("moFdkB0="), -1), IIlllIIl.III(jsonObject, StringFactory.IIl("i4FWihxFQxWYBg=="), 0), IIlllIIl.lI(jsonObject, StringFactory.IIl("lZdriBhFVxmD")), IIlllIIl.lI(jsonObject, StringFactory.IIl("nJtDkhVYURioHY1V")), IIlllIIl.lI(jsonObject, StringFactory.IIl("lptAmQpoRQ6b")));
        return iIIlIlll;
    }

    String II() {
        return "NITRO";
    }

    void Il() {
        this.ll = null;
        this.lII = IIllIIIll.II(this.IIII);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lI(JsonObject jsonObject, String string) {
        if (jsonObject == null) {
            return "";
        }
        JsonElement jsonElement = jsonObject.get(string);
        JsonElement jsonElement2 = jsonElement;
        if (jsonElement2 == null) return "";
        if (jsonElement2.isJsonNull()) return "";
        String string2 = jsonElement2.getAsString().trim();
        return string2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String ll(String string) {
        String string2;
        if (string == null) return "unknown";
        if (string.isBlank()) {
            return "unknown";
        }
        int n = string.indexOf(43);
        if (n >= 0) {
            string2 = string.substring(0, n);
            return string2;
        }
        string2 = string;
        return string2;
    }

    private static int III(JsonObject jsonObject, String string, int n) {
        JsonElement jsonElement;
        JsonElement jsonElement2 = jsonElement = jsonObject == null ? null : jsonObject.get(string);
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return n;
        }
        try {
            return jsonElement.getAsInt();
        }
        catch (RuntimeException runtimeException) {
            try {
                return Integer.parseInt(jsonElement.getAsString().trim());
            }
            catch (RuntimeException runtimeException2) {
                return n;
            }
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 3762;
        String string = "\u656a\u6550\u654a\u65f5\u6510\u65b8\u65f4\u651e\u65e8\u65d9\u6513\u65d4\u6b70\u6b2c\u6b46\u6bef\u63f1\u63e1\u63e7\u634f\u638a\u6333\u6377\u639d\u6373\u6342\u6388\u634f\ucc5e\ucc56\ucc4f\uccc4\ucc23\ucca1\uccad\ucc51\u76a9\u76fe\u76bc\u7604\u76d2\u7678\u7616\u76d9\u7621\u7606\u76b9\u7670\u7651\u76ac\u76fd\u76f4\ua0e7\ua0db\ua0d5\ua06a\ua099\ua019\ua04d\ua092\ua06d\ua04d\ua0c8\ua026\u959b\u95b5\u95bb\u9522\u95e5\u954d\u950d\u95f3\u9510\u9519\u95b2\u9573\u956e\u95a7\u95c4\u95aa\uace2\uacf4\uacc0\uac5c\uac98\uac0f\uac50\uacbe\uac6c\uac61\uac96\uac05\u6df0\u6dfd\u6dd0\u6d7f\u6d8a\u5627\u561d\u5607\u56b8\u565d\u56f5\u56b9\u5653\u56a5\u5694\u565e\u5699\ud652\ud645\ud67e\ud6fc\ud660\ud690\ud6c0\ud649\uf69f\uf696\uf692\uf60a\uf6e3\uf66a\uf630\uf6db\uf63a\uf604\uf6a7\uf63a\u7751\u776a\u7768\u77cb\u7728\u7782\u77e4\u7732\u77d8\u77c5\u772c\u77ee\udc4b\udc5c\udc67\udce6\udc33\udcb4\udcff\udc2a\udcc3\udcdd\udc21\udce6\u5f62\u5f59\u5f5b\u5ff8\u5f1b\u5fb1\u5fd7\u5f01\u5feb\u5ff6\u5f0c\u5f8f\u5f99\u5f6d\u5f79\u5f51\u5f05\u5f4b\u5fe7\u5fa9\u2282\u22b9\u22bb\u2218\u22fb\u2251\u2237\u22e1\u220b\u2216\u22ec\u226f\u227d\u22d6\u2299\u2282\u22e3\u22f6\u2206\u2239\u22f5\u22fe\u2240\u2290\u22c7\u22f4\u22b6\u221e\ub814\ub82e\ub834\ub88b\ub86e\ub8c6\ub88a\ub860\ub896\ub8a7\ub86d\ub8aa";
        char[] cArray = "\u0ebe\u0eb6\u0ebe\u0eba\u0ea2\u0ebe\u0ea2\u0ebe\u0eb7\u0ebe\u0eba\u0ebe\u0ebe\u0ebe\u0ea6\u0eae\u0ebe".toCharArray();
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
        IIlI = stringArray;
        IIll = new Object[stringArray.length];
        int n6 = 147989594;
        byte[] byArray = "\u0010E\u000e\u0091\u00b4\u008d\u00bc\u001bT\u00cd[\u00e9\u00fb\u0080S\u00bc".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IIIl = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            IIlllIIl.IIIl[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        IlI = StringFactory.IIII("1.7.8");
        lI = StringFactory.IIII("REDACTED");
        I = StringFactory.IIII("ilovcats");
        Ill = StringFactory.IIII("1.21.11");
        lll = StringFactory.IIII("ilovcats_build");
        IIl = StringFactory.IIII("ilovcats_subversion");
        llI = Duration.ofSeconds(2L);
        Il = HttpClient.newBuilder().connectTimeout(llI).followRedirects(HttpClient.Redirect.NORMAL).build();
    }

    IIllIIIll IIl() {
        return this.lII;
    }

    public IIlllIIl() {
        this.lII = IIllIIIll.II(this.IIII);
    }

    private /* synthetic */ Void IlI(HttpResponse httpResponse, Throwable throwable) {
        if (throwable != null || httpResponse == null || httpResponse.statusCode() < 200 || httpResponse.statusCode() >= 300) {
            this.lII = IIllIIIll.lI(this.IIII);
            return null;
        }
        String string = (String)httpResponse.body();
        if (string == null || string.isBlank() || string.length() > 16384) {
            this.lII = IIllIIIll.lI(this.IIII);
            return null;
        }
        try {
            IIIlIlll iIIlIlll = IIlllIIl.l(string);
            this.lII = IIllIIIll.III(this.IIII, iIIlIlll, IIlllIIl.Ill(this.IIII, iIIlIlll));
        }
        catch (RuntimeException runtimeException) {
            this.lII = IIllIIIll.lI(this.IIII);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean Ill(IIllIIIII iIllIIIII, IIIlIlll iIIlIlll) {
        if (iIllIIIII == null) return false;
        if (iIIlIlll == null) return false;
        String string = iIIlIlll.II();
        if (string != null && !string.isBlank() && !Ill.lII(string.trim())) {
            return false;
        }
        if (iIIlIlll.l() > iIllIIIII.II()) {
            return true;
        }
        if (iIIlIlll.l() != iIllIIIII.II()) return false;
        if (iIIlIlll.Il() <= iIllIIIII.l()) return false;
        return true;
    }

    private static IIllIIIII lII() {
        try {
            Optional optional = FabricLoader.getInstance().getModContainer(I.IIII());
            if (optional.isPresent()) {
                ModMetadata modMetadata = ((ModContainer)optional.get()).getMetadata();
                return new IIllIIIII(IIlllIIl.ll(modMetadata.getVersion().getFriendlyString()), IIlllIIl.lIl(modMetadata, lll.IIII()), IIlllIIl.lIl(modMetadata, IIl.IIII()));
            }
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
        return new IIllIIIII("unknown", 0, 0);
    }

    private static int lIl(ModMetadata modMetadata, String string) {
        if (modMetadata == null || string == null || !modMetadata.containsCustomValue(string)) {
            return 0;
        }
        CustomValue customValue = modMetadata.getCustomValue(string);
        if (customValue == null) {
            return 0;
        }
        try {
            Number number = customValue.getAsNumber();
            return number == null ? 0 : number.intValue();
        }
        catch (RuntimeException runtimeException) {
            try {
                return Integer.parseInt(customValue.getAsString());
            }
            catch (RuntimeException runtimeException2) {
                return 0;
            }
        }
    }

    private static int llI(int n, int n2) {
        return IIIl[n ^ 0x55F88778] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String lll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xB696167D;
        char[] cArray = IIlI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIll[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIlllIIl.IIll[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x75EFB5AD;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 27 -> 163;
                case 21 -> 36;
                case 1 -> 99;
                case 6 -> 199;
                case 17 -> 18;
                case 2 -> 83;
                case 22 -> 135;
                case 25 -> 19;
                case 12 -> 186;
                case 18 -> 228;
                case 7 -> 54;
                case 11 -> 128;
                case 30 -> 130;
                case 29 -> 82;
                case 31 -> 130;
                case 23 -> 114;
                case 8 -> 217;
                case 3 -> 250;
                case 19 -> 244;
                case 16 -> 36;
                case 14 -> 105;
                case 28 -> 124;
                case 4 -> 18;
                default -> 105;
                case 24 -> 16;
                case 13 -> 98;
                case 26 -> 11;
                case 9 -> 215;
                case 5 -> 185;
                case 10 -> 71;
                case 15 -> 96;
                case 20 -> 31;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

