/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIIIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - consumer
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

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.IntConsumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIlIllII;

@Environment(value=EnvType.CLIENT)
public final class IIIlIIIII {
    private static final IIIlIIIII I;
    private final List<IIlIllII> l;
    private static final int[] II;
    private static final String[] Il;
    private static final Object[] lI;

    private int[] I() {
        int[] nArray = new int[this.IIll()];
        int[] nArray2 = new int[]{0};
        this.llI(n -> {
            int n2 = nArray2[0];
            nArray2[0] = n2 + 1;
            nArray[n2] = n;
        });
        return nArray;
    }

    public static IIIlIIIII l(String string) {
        IIlIllII iIlIllII = IIIlIIIII.Illl(string);
        return iIlIllII != null ? new IIIlIIIII(List.of(iIlIllII)) : I;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public IIIlIIIII II(int n) {
        if (n <= 0 || this.l.isEmpty()) {
            return I;
        }
        if (n >= this.IIll()) {
            return this;
        }
        ArrayList<IIlIllII> arrayList = new ArrayList<IIlIllII>(this.l.size());
        int n2 = n;
        for (IIlIllII iIlIllII : this.l) {
            if (n2 <= 0) break;
            if (n2 >= iIlIllII.II) {
                arrayList.add(iIlIllII);
                n2 -= iIlIllII.II;
                continue;
            }
            byte[] byArray = iIlIllII.lI();
            try {
                int n3 = StringFactory.Ill(byArray, n2);
                if (n3 <= 0) break;
                arrayList.add(IIlIllII.II(byArray, 0, n3));
                break;
            }
            finally {
                Arrays.fill(byArray, (byte)0);
            }
        }
        return arrayList.isEmpty() ? I : new IIIlIIIII(List.copyOf(arrayList));
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean Il(CharSequence charSequence) {
        if (charSequence == null) return false;
        if (this.IIll() != StringFactory.Il(charSequence)) {
            return false;
        }
        int[] nArray = new int[]{0};
        boolean[] blArray = new boolean[]{true};
        this.llI(n -> {
            if (!blArray[0]) {
                return;
            }
            int n2 = Character.codePointAt(charSequence, nArray[0]);
            if (StringFactory.II(n, n2)) {
                nArray[0] = nArray[0] + Character.charCount(n2);
                return;
            }
            blArray[0] = false;
        });
        return blArray[0];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean IIl(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int n2 = this.IIll();
        if (n2 == 0) {
            return true;
        }
        if (n2 > StringFactory.Il(charSequence)) {
            return false;
        }
        int[] nArray = new int[n2];
        int[] nArray2 = new int[]{0};
        this.llI(n -> {
            int n2 = nArray2[0];
            nArray2[0] = n2 + 1;
            nArray[n2] = n;
        });
        try {
            int n3;
            int n4;
            for (n3 = 0; n3 < charSequence.length(); n3 += Character.charCount(n4)) {
                int n5;
                int n6 = n3;
                for (n5 = 0; n5 < nArray.length && n6 < charSequence.length() && nArray[n5] == (n4 = Character.codePointAt(charSequence, n6)); n6 += Character.charCount(n4), ++n5) {
                }
                if (n5 == nArray.length) {
                    n4 = 1;
                    return n4 != 0;
                }
                n4 = Character.codePointAt(charSequence, n3);
            }
            n3 = 0;
            return n3 != 0;
        }
        finally {
            Arrays.fill(nArray, 0);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static IIIlIIIII IlI(List<String> var0) {
        block7: {
            block6: {
                block5: {
                    block9: {
                        block8: {
                            if (var0 == null) break block8;
                            if (!var0.isEmpty()) break block9;
                        }
                        return IIIlIIIII.I;
lbl5:
                        // 1 sources

                        while (true) {
                            if (!var1_1.isEmpty()) break block5;
                            break block6;
                            break;
                        }
lbl8:
                        // 1 sources

                        while (var4_4 != null) {
                            var1_1.add(var4_4);
                            break block7;
                        }
                        break block7;
lbl13:
                        // 1 sources

                        while (true) {
                            var4_4 = IIIlIIIII.Illl(var3_3);
                            ** GOTO lbl8
                            break;
                        }
                    }
                    var1_1 = new ArrayList<IIlIllII>(var0.size());
                    var2_2 = var0.iterator();
                    break block7;
                }
                v0 = new IIIlIIIII(List.copyOf(var1_1));
lbl22:
                // 2 sources

                return v0;
            }
            v0 = IIIlIIIII.I;
            ** while (true)
lbl27:
            // 1 sources

            while (true) {
                var3_3 = var2_2.next();
                ** continue;
                break;
            }
        }
        ** while (!var2_2.hasNext())
lbl32:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public List<String> Ill() {
        if (this.l.isEmpty()) {
            return List.of();
        }
        ArrayList<String> arrayList = new ArrayList<String>(this.l.size());
        Iterator<IIlIllII> iterator = this.l.iterator();
        while (iterator.hasNext()) {
            IIlIllII iIlIllII = iterator.next();
            arrayList.add(iIlIllII.I());
        }
        return Collections.unmodifiableList(arrayList);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lII(CharSequence charSequence) {
        if (charSequence == null) return false;
        if (this.IIll() == StringFactory.Il(charSequence)) {
            int[] nArray = new int[]{0};
            boolean[] blArray = new boolean[]{true};
            this.llI(n -> {
                if (!blArray[0]) {
                    return;
                }
                int n2 = Character.codePointAt(charSequence, nArray[0]);
                if (n == n2) {
                    nArray[0] = nArray[0] + Character.charCount(n2);
                    return;
                }
                blArray[0] = false;
            });
            return blArray[0];
        }
        return false;
    }

    private IIIlIIIII(List<IIlIllII> list) {
        this.l = list;
    }

    public long lIl() {
        long[] lArray = new long[]{-3750763034362895579L};
        this.llI(n -> {
            int n2 = n == 32 ? 95 : Character.toLowerCase(n);
            lArray[0] = lArray[0] ^ (long)n2;
            lArray[0] = lArray[0] * 1099511628211L;
        });
        return lArray[0];
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void llI(IntConsumer intConsumer) {
        Objects.requireNonNull(intConsumer, "consumer");
        for (IIlIllII iIlIllII : this.l) {
            byte[] byArray = iIlIllII.lI();
            try {
                StringFactory.lll(byArray, 0, byArray.length, intConsumer);
            }
            finally {
                Arrays.fill(byArray, (byte)0);
            }
        }
    }

    public boolean lll() {
        return this.l.isEmpty();
    }

    /*
     * Enabled aggressive block sorting
     */
    public String IIII() {
        if (this.l.isEmpty()) {
            return "";
        }
        if (this.l.size() == 1) {
            return this.l.get(0).I();
        }
        StringBuilder stringBuilder = new StringBuilder();
        Iterator<IIlIllII> iterator = this.l.iterator();
        while (iterator.hasNext()) {
            IIlIllII iIlIllII = iterator.next();
            stringBuilder.append(iIlIllII.I());
        }
        return stringBuilder.toString();
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 8632;
        var7_7 = "\u0e69\u0ec3\u0e18\u0e10\u0e5a\u0e1a\u0e5c\u0ec3";
        var8_8 = "\b".toCharArray();
        var9_9 = new String[var8_8.length];
        var13_13 = -1;
        if (true) ** GOTO lbl23
lbl7:
        // 1 sources

        while (true) {
            var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
            IIIlIIIII.II[var4_5] = var5_6 ^= var2_3;
            var3_4 += 4;
            if (++var4_5 < var1_2) continue;
            IIIlIIIII.I = new IIIlIIIII(List.of());
            return;
        }
        block8: while (true) {
            block13: {
                block14: {
                    var16_16 = v0;
                    v1 = var15_15++;
                    var14_14[v1] = (char)(var14_14[v1] ^ var16_16 ^ var6);
                    if (var15_15 < var14_14.length) break block13;
                    var9_9[var10_10] = new String(var14_14).intern();
                    var11_11 += var12_12;
                    if (++var10_10 < var8_8.length) break block14;
                    var13_13 = 0;
lbl23:
                    // 2 sources

                    var10_10 = 0;
                    var11_11 = 0;
                    var12_12 = '\u0000';
                    if (var13_13 == 0) {
                        IIIlIIIII.Il = var9_9;
                        IIIlIIIII.lI = new Object[var9_9.length];
                        var2_3 = 408078598;
                        var0_1 = "A\u009f\u0089Q\u00c5\u0002\u0089\u0018".getBytes("ISO-8859-1");
                        var1_2 = var0_1.length / 4;
                        IIIlIIIII.II = new int[var1_2];
                        var3_4 = 0;
                        var4_5 = 0;
                        ** continue;
                    }
                }
                var12_12 = var8_8[var10_10];
                var14_14 = var7_7.substring(var11_11, var11_11 + var12_12).toCharArray();
                var15_15 = 0;
            }
            switch (var15_15 % 6) {
                case 3: {
                    v0 = 8;
                    continue block8;
                }
                case 2: {
                    v0 = 84;
                    continue block8;
                }
                case 1: {
                    v0 = 29;
                    continue block8;
                }
                case 4: {
                    v0 = 66;
                    continue block8;
                }
                default: {
                    v0 = 62;
                    continue block8;
                }
                case 5: 
            }
            v0 = 34;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public int IIll() {
        int n = 0;
        Iterator<IIlIllII> iterator = this.l.iterator();
        while (iterator.hasNext()) {
            IIlIllII iIlIllII = iterator.next();
            n += iIlIllII.II;
        }
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean IllI(IIIlIIIII iIIlIIIII) {
        if (iIIlIIIII == null) {
            return false;
        }
        int n = this.IIll();
        int n2 = iIIlIIIII.IIll();
        if (n2 > n) {
            return false;
        }
        int[] nArray = this.I();
        int[] nArray2 = iIIlIIIII.I();
        try {
            int n3;
            int n4 = nArray.length - nArray2.length;
            for (n3 = 0; n3 < nArray2.length; ++n3) {
                if (nArray[n4 + n3] == nArray2[n3]) continue;
                boolean bl = false;
                return bl;
            }
            n3 = 1;
            return n3 != 0;
        }
        finally {
            Arrays.fill(nArray, 0);
            Arrays.fill(nArray2, 0);
        }
    }

    private static IIlIllII Illl(String string) {
        if (string == null || string.isEmpty()) {
            return null;
        }
        byte[] byArray = string.getBytes(StandardCharsets.UTF_8);
        try {
            IIlIllII iIlIllII = IIlIllII.II(byArray, 0, byArray.length);
            return iIlIllII;
        }
        finally {
            Arrays.fill(byArray, (byte)0);
        }
    }

    private static IIIlIIIII lIII(byte[] byArray) {
        if (byArray.length == 0) {
            return I;
        }
        return new IIIlIIIII(List.of(IIlIllII.II(byArray, 0, byArray.length)));
    }

    public boolean lIlI() {
        if (this.l.isEmpty()) {
            return true;
        }
        boolean[] blArray = new boolean[]{true};
        this.llI(n -> {
            if (!Character.isWhitespace(n)) {
                blArray[0] = false;
            }
        });
        return blArray[0];
    }

    public long lIll() {
        long[] lArray = new long[]{-3750763034362895579L};
        this.llI(n -> {
            lArray[0] = lArray[0] ^ (long)Character.toLowerCase(n);
            lArray[0] = lArray[0] * 1099511628211L;
        });
        return lArray[0];
    }

    public long llII() {
        long[] lArray = new long[]{-3750763034362895579L};
        this.llI(n -> {
            lArray[0] = lArray[0] ^ (long)n;
            lArray[0] = lArray[0] * 1099511628211L;
        });
        return lArray[0];
    }

    /*
     * Enabled aggressive block sorting
     */
    public IIIlIIIII llIl(IIIlIIIII iIIlIIIII) {
        if (iIIlIIIII == null) return this;
        if (!iIIlIIIII.lll()) {
            if (!this.lll()) {
                ArrayList<IIlIllII> arrayList = new ArrayList<IIlIllII>(this.l.size() + iIIlIIIII.l.size());
                arrayList.addAll(this.l);
                arrayList.addAll(iIIlIIIII.l);
                return new IIIlIIIII(List.copyOf(arrayList));
            }
            return iIIlIIIII;
        }
        return this;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean lllI(IIIlIIIII iIIlIIIII) {
        if (iIIlIIIII == null || this.IIll() != iIIlIIIII.IIll()) {
            return false;
        }
        int[] nArray = this.I();
        int[] nArray2 = iIIlIIIII.I();
        try {
            boolean bl = Arrays.equals(nArray, nArray2);
            return bl;
        }
        finally {
            Arrays.fill(nArray, 0);
            Arrays.fill(nArray2, 0);
        }
    }

    private static int llll(int n, int n2) {
        return II[n ^ 0x626F37CF] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIIII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x69A1F741;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIlIIIII.lI[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6D8FC459;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                default -> 94;
                case 24 -> 183;
                case 9 -> 65;
                case 14 -> 216;
                case 8 -> 213;
                case 30 -> 110;
                case 17 -> 250;
                case 26 -> 29;
                case 1 -> 219;
                case 4 -> 7;
                case 19 -> 39;
                case 21 -> 123;
                case 6 -> 109;
                case 10 -> 82;
                case 22 -> 225;
                case 7 -> 198;
                case 2 -> 72;
                case 27 -> 195;
                case 15 -> 80;
                case 29 -> 20;
                case 25 -> 65;
                case 11 -> 3;
                case 23 -> 12;
                case 31 -> 194;
                case 28 -> 56;
                case 5 -> 63;
                case 20 -> 63;
                case 12 -> 224;
                case 16 -> 229;
                case 3 -> 1;
                case 13 -> 44;
                case 18 -> 81;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

