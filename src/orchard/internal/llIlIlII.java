/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIlIlII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - ).getAsInt(), jsonObject.get(
 *   - .getBytes(
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.internal.IIllIl;

@Environment(value=EnvType.CLIENT)
public final class llIlIlII
extends IIllIl<Color> {
    private static final Color I;
    private static String[] l;
    private static final int[] II;
    private static final String[] Il;
    private static final Object[] lII;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 18332;
        var7_2 = "\u75d3\udd2e\ud066\ub270\u3b58\ued36\u6b6b\u41e6\uf3fd\u77e9\uee78\u9f5d\u4061\u9cd5\u2d9a\u6d7b";
        var8_3 = "\u0004\u0004\u0004\u0004".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        block6: while (true) {
            var10_5 = 0;
            var11_6 = 0;
            var12_7 = '\u0000';
            if (var13_8 != 0) ** GOTO lbl35
            llIlIlII.Il = var9_4;
            llIlIlII.lII = new Object[var9_4.length];
            var2_12 = 1018556226;
            var0_11 = "\u00d96I\u00c0\u00d7A\u00ff\u00c5\u00b9\u00ee\u00f0=\u00ed\u00a4\u00eaA\u00b8\u00a7\u0097\u00f9S\u00f7\u0094\\\u00c2m)\u0015\u00adbX~I\u0083\u0014u\u0088\u00fbn\u00d4".getBytes("ISO-8859-1");
            var1_13 = var0_11.length / 4;
            llIlIlII.II = new int[var1_13];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                llIlIlII.II[var4_15] = var5_16 ^= var2_12;
                var3_14 += 4;
            } while (++var4_15 < var1_13);
            llIlIlII.l = new String[4];
            llIlIlII.I();
            llIlIlII.I = new Color(255, 255, 255, 255);
            return;
lbl-1000:
            // 5 sources

            {
                block9: {
                    var16_1 = v0;
                    v1 = var15_10++;
                    var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
                    if (var15_10 < var14_9.length) break block9;
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 >= var8_3.length) ** GOTO lbl52
lbl35:
                    // 2 sources

                    var12_7 = var8_3[var10_5];
                    var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                    var15_10 = 0;
                }
                switch (var15_10 % 5) {
                    case 4: {
                        v0 = 120;
                        continue block8;
                    }
                    case 3: {
                        v0 = 39;
                        continue block8;
                    }
                    case 2: {
                        v0 = 117;
                        continue block8;
                    }
                    default: {
                        v0 = 88;
                        continue block8;
                    }
lbl52:
                    // 1 sources

                    var13_8 = 0;
                    continue block6;
                    case 1: 
                }
                v0 = 7;
                ** while (true)
            }
            break;
        }
    }

    public llIlIlII(Object object, Color color) {
        super(object, color != null ? color : I);
    }

    private static void I() {
        llIlIlII.l[0] = llIlIlII.Il(llIlIlII.IlI(1756917140, '\u43b8', (short)24609).toCharArray(), 85701L, -1704310470);
        llIlIlII.l[1] = llIlIlII.Il(llIlIlII.IlI(-1432983808, '\u43b9', (short)63965).toCharArray(), 17625L, 1944201513);
        llIlIlII.l[2] = llIlIlII.Il(llIlIlII.IlI(1206205901, '\u43ba', (short)61411).toCharArray(), 58424L, -1297352930);
        llIlIlII.l[3] = llIlIlII.Il(llIlIlII.IlI(1813723697, '\u43bb', (short)3919).toCharArray(), 30153L, 1033975566);
    }

    @Override
    public void l(JsonElement jsonElement) {
        if (jsonElement == null || !jsonElement.isJsonObject()) {
            return;
        }
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        this.lI(new Color(jsonObject.get("r").getAsInt(), jsonObject.get("g").getAsInt(), jsonObject.get("b").getAsInt(), jsonObject.get("a").getAsInt()));
    }

    public llIlIlII(String string, Color color) {
        this((Object)string, color);
    }

    private static String Il(char[] cArray, long l2, int n) {
        int n2 = 0xBF424B02 ^ n;
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

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public JsonElement III() {
        Color color = (Color)this.lIl();
        Color color2 = color == null ? (Color)this.ll() : color;
        if (color2 == null) {
            color2 = I;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("r", (Number)color2.getRed());
        jsonObject.addProperty("g", (Number)color2.getGreen());
        jsonObject.addProperty("b", (Number)color2.getBlue());
        jsonObject.addProperty("a", (Number)color2.getAlpha());
        return jsonObject;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void lI(Color color) {
        Color color2 = (Color)this.ll();
        super.II(color == null ? (color2 != null ? color2 : I) : color);
    }

    private static int IIl(int n, int n2) {
        return II[n ^ 0xAC5AB08C] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlI(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x43B8;
        char[] cArray = Il[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lII[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llIlIlII.lII[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7699;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 17181;
            n6 += 45294;
            n6 -= 27625;
            n6 += 41459;
            n6 -= 36277;
            n6 += 5940;
            n6 -= 45149;
            cArray[n5] = (char)((n6 += 40910) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

