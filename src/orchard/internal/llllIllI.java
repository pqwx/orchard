/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllIllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Failed to extract embedded Lunar assets
 *   - assets/cats/embedded/lunar/
 *   - texturesIndex.txt
 *   - Ilovcats/aaaaacp
 *   - cosmetics.json
 *   - launcher-cache
 *   - .lunarclient
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
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package orchard.internal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.List;
import java.util.stream.Collectors;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Environment(value=EnvType.CLIENT)
public final class llllIllI {
    private static volatile boolean I;
    private static final String l;
    private static final String II;
    private static final Logger Il;
    private static final String lI;
    private static final String ll;
    private static final String III;
    private static String[] IIl;
    private static final int[] IlI;
    private static final String[] Ill;
    private static final Object[] lII;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void I() {
        if (I) {
            return;
        }
        Class<llllIllI> clazz = llllIllI.class;
        synchronized (llllIllI.class) {
            if (I) {
                // ** MonitorExit[var0] (shouldn't be in output)
                return;
            }
            try (InputStream inputStream = llllIllI.lI(lI);){
                List list;
                if (inputStream == null) {
                    I = true;
                    // ** MonitorExit[var0] (shouldn't be in output)
                    return;
                }
                Path path = llllIllI.l();
                Files.createDirectories(path, new FileAttribute[0]);
                try (Object object = new BufferedReader(new InputStreamReader(inputStream));){
                    list = ((BufferedReader)object).lines().map(String::trim).filter(string -> !string.isEmpty()).collect(Collectors.toList());
                }
                object = list.iterator();
                while (object.hasNext()) {
                    String string2 = (String)object.next();
                    Path path2 = path.resolve(string2.replace('/', path.getFileSystem().getSeparator().charAt(0)));
                    if (Files.exists(path2, new LinkOption[0])) continue;
                    Files.createDirectories(path2.getParent(), new FileAttribute[0]);
                    String string3 = string2;
                    String string4 = III;
                    InputStream inputStream2 = llllIllI.lI(string4 + string3);
                    try {
                        if (inputStream2 == null) continue;
                        Files.copy(inputStream2, path2, new CopyOption[0]);
                    }
                    finally {
                        if (inputStream2 == null) continue;
                        inputStream2.close();
                    }
                }
                return;
            }
            catch (Exception exception) {
                Il.warn("Failed to extract embedded Lunar assets", (Throwable)exception);
            }
            finally {
                I = true;
            }
            // ** MonitorExit[var0] (shouldn't be in output)
            return;
        }
    }

    private static Path l() {
        return Paths.get(System.getProperty("user.home"), ".lunarclient", "textures", "assets", "lunar");
    }

    private llllIllI() {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static BufferedReader II() throws IOException {
        Path path = llllIllI.l().resolve("cosmetics.json");
        if (Files.exists(path, new LinkOption[0])) {
            return Files.newBufferedReader(path);
        }
        InputStream inputStream = llllIllI.lI(l);
        if (inputStream != null) return new BufferedReader(new InputStreamReader(inputStream));
        return null;
    }

    private static Path Il() {
        return Paths.get(System.getProperty("user.home"), ".lunarclient", "launcher-cache");
    }

    private static InputStream lI(String string) {
        return llllIllI.class.getClassLoader().getResourceAsStream(string);
    }

    private static String III(char[] cArray, long l2, int n) {
        int n2 = 0x4FAF0F02 ^ n;
        for (int i = 0; i < cArray.length; ++i) {
            n2 = n2 ^ (int)l2 ^ ~i;
            n2 ^= n - i * cArray.length;
            n2 = -n2 * n | i;
            cArray[i] = (char)(cArray[i] ^ n2);
            int n3 = i & 0xFF;
            n = n << n3 | n >>> -n3;
            l2 ^= (long)n3;
        }
        return new String(cArray);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var11 = 23568;
        var12_5 = "\uaa43\u76c2\ufa37\uca84\u0ae9\u1311\u6717\u6ce5\u1a38\u2990\u6a79\ud79c\uc3e0\u61b1\u2cc1\u47f1\ud184\u10b7\u3418\u0958\ue1fa\ua7fc\u402a\u681a\u7844\ue36e\u3fc0\u7517\ubf7b\u16c9\u537e\u1e7e\uadc8\ubc54\udaa8\ud7c5\uc99d\u9773\uba37\u1b0b\ue194\u1ca9\uf676\ufa0e\u0aea\u4acc\u998f\u8c5e\u5ee8\u4c49\u9000\u4c60\u08c1\u32a8\u2e3e\u2b3e\ufe25\ub0a3\u61d3\u4dee\u9429\u0b7a\u9b9c\u7ba4\uc9fa\u7d83\u3112\u24cc\u04d2\ua02c\ucb6a\u849e\u8ede\ub2a2\uc5e3\ua06c\ud361\u1759\u6511\u792f\u9103\u2a06\u3ad0\u4b2c\u36c2\uc49c\u8a43\ua5c6\u2d35\u0381\u4ab8\u0268\ubfc8\u74ae\ud00b\ub284\u4da5\u8e50\u9b20\uc6de\ue981\ub549\u4392\u4a64\u134a\u6146\uf2b6\u92b7\u7613\u87d4\u0935\u645c\u1b81\u815f\ua917\ua4a0\ue5e6\udfe2\u3952\u6e3a\uda16\uc9a6\uc3d4\u8d8a\u1229\u4ad7\ub7f3\uf92b\uc153\u18bd\ub316\ud8be\u84eb\u0478\u129a\u2ccb\u1abe\u66cb\uee9b\uc1ed\ua625\u24fd\u5cbf\u90bf\u0dd1\ueedd\u67af\u152d\uc957\u0cf9\u7b66\u3d6c\u8166\u4abd\uc5be\uf3b6\ub15d\udd4f\u0812\u68f3\ub109\u65d2\u9453\u823b\uff0d\u5722\ue42d\u72e9\uf2a8\u496f\u97dc\u15b2\u14d7\u66a6\u4376\uc1b2\ua245\u01e0\ue6e6\u2621\uda8d\u1691\u01b4\ud0ca\ufd71\ud3e8\uc75a\ud537\u1909\u20a5\u277d\u50bc\ucb37\uc1a7\u59a7\u72e1\u7bc8\uf295\uc794\uec0c\u19d7\uc9e1\u1940\u5a30\ub894\uc0d1\ucadb\u0248\u3db7\u648d\u02d8\u6f33\ucb89\u3d4e\u41ae\u7a90\u8eec\u2f32\ufff5\uaf11\ubbbb\ub976\ue440\u4cdc\ucd2a\u68f9\u1931\ucbed\u1e7d\u3a43\u953d\u54d6\u557c\u6329\ub2cb\u149e\u71ab\u08dc\u8193\ua861\u328a\u51a5\uc5f9\ueb3a\u7d6f\u4098\ud566\u3944\udec3\u3862\ub620\u0dc9\u26d8\ud41b\u4403\u2c10";
        var13_6 = "\u5c1c\u5c08\u5c1c\u5c18\u5c00\u5c18\u5c1c\u5c04\u5c04\u5c24\u5c08\u5c34\u5c1c".toCharArray();
        var14_7 = new String[var13_6.length];
        var18_11 = -1;
        ** GOTO lbl55
lbl7:
        // 1 sources

        while (true) {
            continue;
            break;
        }
lbl9:
        // 2 sources

        while (true) {
            var17_10 = var13_6[var15_8] ^ var11;
            var19_12 = var12_5.substring(var16_9, var16_9 + var17_10).toCharArray();
            var20_13 = 0;
            if (true) ** GOTO lbl61
            break;
        }
        llllIllI.Ill = var14_7;
        llllIllI.lII = new Object[var14_7.length];
        var2_3 = -1956893131;
        var0_1 = "\u00cfR\u00bf\u00a2\u00de\u00bdU\u008b\u00ee\u00cf\u0003\u0017\u0014\u00cd/\u0089$M\u009f\u00ea\u00a21|\u00c9v-\u00aaK\u00b5\u00f1\u001d\u0082@\u00a3\u00fe2q\u009bh\u00a7U\u00d9cC.\u00ad\u00b5*!\u0092\u00e7\u00a1c\u00be\u008d\u00fb\u00f0\u00fe\u00d2R\u0095\u00e4\u00e1\u00dc'j2,\u0003\u0087`\u00d5\u0085\u00eed\u001as\u0017\u001a=\u0094\u00c9O\u00a6\u00f9\u00cf\u0004\u0012\u0018\u00a8.\u00df\u00c3\u0006\u000bq\u00aa&\u0095\u00b7!\u0082?\u00a8JO\u00d5g_\u00f4!,\u00a8\u00ecR\u008f\u00ffR\u0016\u00bcY\u00d6\u00d4\u00ae\u0082!\u0013\u00a6\u00b7\u00bb\u0081m".getBytes("ISO-8859-1");
        var1_2 = var0_1.length / 4;
        llllIllI.IlI = new int[var1_2];
        var3_4 = 0;
        var4_15 = 0;
        do {
            var5_16 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
            llllIllI.IlI[var4_15] = var5_16 ^= var2_3;
            var3_4 += 4;
        } while (++var4_15 < var1_2);
        llllIllI.IIl = new String[13];
        llllIllI.IIl();
        llllIllI.Il = LoggerFactory.getLogger((String)"Ilovcats/aaaaacp");
        llllIllI.III = "assets/cats/embedded/lunar/";
        var7_17 = "index.txt";
        var6_18 = llllIllI.III;
        llllIllI.lI = var6_18 + var7_17;
        var8_19 = "cosmetics.json";
        var7_17 = llllIllI.III;
        llllIllI.l = var7_17 + var8_19;
        var9_20 = "jit_index";
        var8_19 = llllIllI.III;
        llllIllI.ll = var8_19 + var9_20;
        var10_21 = "texturesIndex.txt";
        var9_20 = llllIllI.III;
        llllIllI.II = var9_20 + var10_21;
        return;
lbl44:
        // 1 sources

        while (true) {
            var16_9 = 0;
            var17_10 = 0;
            if (var18_11 != 0) ** GOTO lbl9
            ** continue;
            break;
        }
        while (true) {
            var14_7[var15_8] = new String(var19_12).intern();
            var16_9 += var17_10;
            if (++var15_8 >= var13_6.length) ** break;
            ** continue;
            var18_11 = 0;
lbl55:
            // 2 sources

            var15_8 = 0;
            ** continue;
            break;
        }
        while (true) {
            v0 = var20_13++;
            var19_12[v0] = (char)(var19_12[v0] ^ var21_14);
            if (var20_13 >= var19_12.length) ** continue;
lbl61:
            // 2 sources

            switch (var20_13 % 5) {
                case 1: {
                    v1 = 92;
                    break;
                }
                default: {
                    v1 = 109;
                    break;
                }
                case 3: {
                    v1 = 85;
                    break;
                }
                case 2: {
                    v1 = 63;
                    break;
                }
                case 4: {
                    v1 = 64;
                }
            }
            var21_14 = v1;
        }
    }

    private static void IIl() {
        llllIllI.IIl[0] = llllIllI.III(llllIllI.lII(-1222901531, '\u8d40', (short)35051).toCharArray(), 86766L, -844037782);
        llllIllI.IIl[1] = llllIllI.III(llllIllI.lII(-1390275312, '\u8d41', (short)29108).toCharArray(), 15968L, 2100329431);
        llllIllI.IIl[2] = llllIllI.III(llllIllI.lII(-1322908497, '\u8d42', (short)15730).toCharArray(), 37098L, 1144782834);
        llllIllI.IIl[3] = llllIllI.III(llllIllI.lII(-857050454, '\u8d43', (short)64125).toCharArray(), 90835L, 768410501);
        llllIllI.IIl[4] = llllIllI.III(llllIllI.lII(175863233, '\u8d44', (short)42185).toCharArray(), 41792L, 1500685389);
        llllIllI.IIl[5] = llllIllI.III(llllIllI.lII(-1176605995, '\u8d45', (short)6928).toCharArray(), 73339L, 999295464);
        llllIllI.IIl[6] = llllIllI.III(llllIllI.lII(1429150072, '\u8d46', (short)55091).toCharArray(), 69793L, -1222203502);
        llllIllI.IIl[7] = llllIllI.III(llllIllI.lII(-1934016959, '\u8d47', (short)42839).toCharArray(), 10342L, -654141414);
        llllIllI.IIl[8] = llllIllI.III(llllIllI.lII(-1986302509, '\u8d48', (short)27379).toCharArray(), 98074L, 1742561244);
        llllIllI.IIl[9] = llllIllI.III(llllIllI.lII(-2143866640, '\u8d49', (short)58326).toCharArray(), 21714L, 193764769);
        llllIllI.IIl[10] = llllIllI.III(llllIllI.lII(-1546557170, '\u8d4a', (short)29530).toCharArray(), 41772L, 1471393360);
        llllIllI.IIl[11] = llllIllI.III(llllIllI.lII(-1374206339, '\u8d4b', (short)52530).toCharArray(), 79634L, -677593054);
        llllIllI.IIl[12] = llllIllI.III(llllIllI.lII(1324758513, '\u8d4c', (short)22549).toCharArray(), 7830L, 1179804866);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static BufferedReader IlI() throws IOException {
        Path path = llllIllI.l().resolve("jit_index");
        if (Files.exists(path, new LinkOption[0])) {
            return Files.newBufferedReader(path);
        }
        Path path2 = llllIllI.Il().resolve("texturesIndex.txt");
        if (Files.exists(path2, new LinkOption[0])) {
            return Files.newBufferedReader(path2);
        }
        InputStream inputStream = llllIllI.lI(ll);
        if (inputStream != null) {
            return new BufferedReader(new InputStreamReader(inputStream));
        }
        InputStream inputStream2 = llllIllI.lI(II);
        if (inputStream2 != null) return new BufferedReader(new InputStreamReader(inputStream2));
        return null;
    }

    private static int Ill(int n, int n2) {
        return IlI[n ^ 0x3B66E361] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lII(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x8D40;
        char[] cArray = Ill[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lII[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            llllIllI.lII[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4331;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 34687;
            n6 += 20092;
            n6 += 54747;
            cArray[n5] = (char)((n6 ^= 0xCC56) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

