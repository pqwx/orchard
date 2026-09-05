/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIIIII
 * Purpose not identified - name is the original obfuscated one.
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
package orchard.internal;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class IIIIIIIII {
    private static final Map<UUID, Integer> I;
    private static volatile int l;
    private static final Map<UUID, Integer> II;
    private static final Map<UUID, Integer> Il;
    private static final int[] lI;

    /*
     * Enabled aggressive block sorting
     */
    public static int I(UUID uUID) {
        int n;
        if (uUID == null) {
            return l;
        }
        Integer n2 = II.get(uUID);
        if (n2 != null) {
            return n2;
        }
        Integer n3 = I.get(uUID);
        if (n3 != null) {
            return n3;
        }
        Integer n4 = Il.get(uUID);
        if (n4 != null) {
            n = n4;
            return n;
        }
        n = l;
        return n;
    }

    public static void l(UUID uUID) {
        if (uUID != null) {
            Il.put(uUID, l);
        }
    }

    public static void II(UUID uUID, int n) {
        if (uUID != null) {
            II.put(uUID, n);
        }
    }

    public static void Il(UUID uUID, int n) {
        if (uUID != null) {
            I.put(uUID, n);
        }
    }

    public static void lI(int n) {
        l = n;
    }

    public static int ll() {
        return l;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean III(UUID uUID) {
        if (uUID == null) return false;
        if (Il.containsKey(uUID)) return true;
        if (II.containsKey(uUID)) return true;
        if (!I.containsKey(uUID)) return false;
        return true;
    }

    private IIIIIIIII() {
    }

    public static void IIl() {
        II.clear();
    }

    public static void IlI() {
        I.clear();
    }

    public static void Ill() {
        Il.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 1948601728;
        byte[] byArray = "\u00b6?\u001f3".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        lI = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IIIIIIIII.lI[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
        Il = new ConcurrentHashMap<UUID, Integer>();
        II = new ConcurrentHashMap<UUID, Integer>();
        I = new ConcurrentHashMap<UUID, Integer>();
        l = -52686;
    }

    private static int lII(int n, int n2) {
        return lI[n ^ 0x757AF3E1] ^ n2 ^ n;
    }
}

