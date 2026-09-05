/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlI
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
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ClientPlayerEntity
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import orchard.core.ClientEntrypoint;
import orchard.internal.lIIllllI;

@Environment(value=EnvType.CLIENT)
public final class IIlI {
    private static final double I = 0.01;
    private static int l;
    private static int II;
    private static int Il;
    private static int lI;
    private static int ll;
    private static int III;
    private static int IIl;
    private static int IlI;
    private static final int Ill = 4;
    private static final int[] lII;

    public static void I(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        l = Math.max(l, clientPlayerEntity.age + 1);
        II = Math.max(II, clientPlayerEntity.age + 4);
        IlI = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean l(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return false;
        }
        if (IIlI.IIIII(minecraftClient)) {
            if (!IIlI.IIl(minecraftClient)) return true;
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean II(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return false;
        }
        if (!IIlI.IIIII(minecraftClient)) {
            return false;
        }
        int n = minecraftClient.player.age;
        if (III == n) return false;
        if (!IIlI.IIl(minecraftClient)) {
            III = n;
            return true;
        }
        return false;
    }

    public static boolean Il(MinecraftClient minecraftClient) {
        return IIlI.llI(minecraftClient);
    }

    public static void lI(MinecraftClient minecraftClient) {
    }

    public static void ll(MinecraftClient minecraftClient, int n) {
        if (!IIlI.IIIl(minecraftClient)) {
            return;
        }
        int n2 = Math.max(1, n);
        lI = Math.max(lI, minecraftClient.player.age + n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean III(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) return false;
        if (IIl != minecraftClient.player.age) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IIl(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) return false;
        if (lI == Integer.MIN_VALUE) return false;
        if (minecraftClient.player.age > lI) return false;
        return true;
    }

    public static boolean IlI(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return false;
        }
        if (IIl != minecraftClient.player.age) {
            IIlI.IlIl(minecraftClient);
            return false;
        }
        return true;
    }

    public static boolean Ill(MinecraftClient minecraftClient) {
        return IIlI.lllI(minecraftClient);
    }

    public static void lII(MinecraftClient minecraftClient) {
    }

    public static boolean lIl(MinecraftClient minecraftClient) {
        return IIlI.IIIl(minecraftClient) && II != Integer.MIN_VALUE && minecraftClient.player.age <= II;
    }

    private IIlI() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean llI(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return false;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        double d = clientPlayerEntity.getVelocity().x;
        double d2 = clientPlayerEntity.getVelocity().z;
        double d3 = Math.sqrt(d * d + d2 * d2);
        if (d3 > 0.01) {
            return false;
        }
        if (minecraftClient.options == null) {
            return true;
        }
        if (minecraftClient.options.forwardKey.isPressed()) return false;
        if (minecraftClient.options.backKey.isPressed()) return false;
        if (minecraftClient.options.leftKey.isPressed()) return false;
        if (minecraftClient.options.rightKey.isPressed()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lll(MinecraftClient minecraftClient, int n) {
        if (!IIlI.IIIl(minecraftClient)) {
            return false;
        }
        if (!IIlI.IIIII(minecraftClient)) {
            return false;
        }
        int n2 = minecraftClient.player.age;
        if (III != n2) {
            III = n2;
            IIlI.ll(minecraftClient, n);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.options != null) {
            if (minecraftClient.options.forwardKey.isPressed()) return true;
            if (minecraftClient.options.backKey.isPressed()) return true;
            if (minecraftClient.options.leftKey.isPressed()) return true;
            if (minecraftClient.options.rightKey.isPressed()) return true;
            if (minecraftClient.options.jumpKey.isPressed()) return true;
            if (!minecraftClient.options.sneakKey.isPressed()) return lIIllllI.IIIIlIl(minecraftClient);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIIl(MinecraftClient minecraftClient) {
        if (minecraftClient != null && minecraftClient.player != null && minecraftClient.player.isAlive()) {
            int n = System.identityHashCode(minecraftClient.player);
            if (Il == n) return true;
            Il = n;
            IIlI.llll();
            return true;
        }
        IIlI.llll();
        Il = 0;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIlI(MinecraftClient minecraftClient) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        boolean bl = clientEntrypoint != null && clientEntrypoint.IlI() != null && clientEntrypoint.IlI().lIll() != null && clientEntrypoint.IlI().lIll().Illll();
        boolean bl2 = clientEntrypoint != null && clientEntrypoint.IlI() != null && clientEntrypoint.IlI().IIlIlll() != null && clientEntrypoint.IlI().IIlIlll().IIlll();
        if (!IIlI.IIIl(minecraftClient)) return false;
        if (ll != Integer.MIN_VALUE) {
            if (minecraftClient.player.age <= ll) return true;
        }
        if (bl) return true;
        if (!bl2) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IIll(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return false;
        }
        int n = minecraftClient.player.age;
        if (III == n) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = -1425122588;
        byte[] byArray = "3\u00a1\u00cc\u00ea\u00e8\u00c0c\u00a0#\u00d4=\t\u00df\u009b\u00d8~\u00007s~j5\u00b7o\u00db\u00f3\u00ba\u00a9\u00d3\u00c9=.u&\u001f\u00c5\u00ef~\u0015\u0002\u0010\u00ee\u00c0.X\u00e1\u00da\u00ce\u00c0\u00c5\u00ceZ\u0090W\u00c7\u001f\u0017\u00f2\u0084n\u00de\u0095\u0013\u00efO\u00c0c\u00fc\u00ae\u00af\u00fdR.\u0016\u00dd\u00b3d\u00aa$\u0091\u0086~xY\u0089E\u0001\u00b1\u00ca;k\u0087\u0014\u00cc\u00d3\u0099\u00ff\u00f5\u00d2j\u008a7T\u00c7".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        lII = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IIlI.lII[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
        III = Integer.MIN_VALUE;
        l = Integer.MIN_VALUE;
        IIl = Integer.MIN_VALUE;
        II = Integer.MIN_VALUE;
        IlI = Integer.MIN_VALUE;
        lI = Integer.MIN_VALUE;
        ll = Integer.MIN_VALUE;
        Il = 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IlII(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return false;
        }
        if (IIlI.IIl(minecraftClient)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlIl(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return;
        }
        int n = minecraftClient.player.age + 1;
        l = Math.max(l, n);
        if (II != Integer.MIN_VALUE) {
            if (II >= n) return;
        }
        IlI = Math.max(IlI, n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IllI(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return false;
        }
        if (IIlI.IIl(minecraftClient)) return false;
        return true;
    }

    public static void Illl(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return;
        }
        ll = Math.max(ll, minecraftClient.player.age);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lIII(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return false;
        }
        if (IIl == minecraftClient.player.age) {
            return true;
        }
        IIlI.I(minecraftClient);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lIIl(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return false;
        }
        if (l == Integer.MIN_VALUE) {
            return false;
        }
        if (minecraftClient.player.age < l) {
            return false;
        }
        if (minecraftClient.player.age < l) return false;
        boolean bl = IlI == minecraftClient.player.age;
        l = Integer.MIN_VALUE;
        IIl = minecraftClient.player.age;
        II = !bl || II != Integer.MIN_VALUE && II >= minecraftClient.player.age ? Math.max(II, minecraftClient.player.age + 4) : Integer.MIN_VALUE;
        IlI = Integer.MIN_VALUE;
        return true;
    }

    public static boolean lIlI(MinecraftClient minecraftClient, int n) {
        if (IIlI.IIIl(minecraftClient)) {
            int n2 = minecraftClient.player.age;
            if (III == n2) {
                return false;
            }
            III = n2;
            IIlI.ll(minecraftClient, n);
            return true;
        }
        return false;
    }

    public static void lIll(MinecraftClient minecraftClient) {
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean llII(MinecraftClient minecraftClient, int n) {
        if (!IIlI.IIIl(minecraftClient)) {
            return false;
        }
        if (!IIlI.IIIII(minecraftClient)) {
            return false;
        }
        int n2 = minecraftClient.player.age;
        if (III != n2) {
            III = n2;
            IIlI.ll(minecraftClient, n);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean llIl(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) return false;
        if (II != Integer.MIN_VALUE) {
            if (minecraftClient.player.age > II) {
                II = Integer.MIN_VALUE;
                return true;
            }
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lllI(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return false;
        }
        if (IIl != minecraftClient.player.age) {
            IIlI.I(minecraftClient);
            return false;
        }
        return true;
    }

    private static void llll() {
        III = Integer.MIN_VALUE;
        l = Integer.MIN_VALUE;
        IIl = Integer.MIN_VALUE;
        II = Integer.MIN_VALUE;
        IlI = Integer.MIN_VALUE;
        lI = Integer.MIN_VALUE;
        ll = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIIII(MinecraftClient minecraftClient) {
        if (!IIlI.IIIl(minecraftClient)) {
            return false;
        }
        if (!IIlI.IIII(minecraftClient)) {
            return true;
        }
        if (IIl == minecraftClient.player.age) {
            return true;
        }
        IIlI.I(minecraftClient);
        return false;
    }

    private static int IIIIl(int n, int n2) {
        return lII[n ^ 0xE735EC49] ^ n2 ^ n;
    }
}

