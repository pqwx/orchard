/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIlllII
 * Module         : PingSpoof  [PLAYER]
 * Description    : Spoofs network latency for manual or opponent-matched ping.   (client's own text)
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Opponent
 *   - Mode
 *   - Ping
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 */
package orchard.module.player;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IlIlIlIII;
import orchard.internal.lIIIlIl;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlIlII;

@Environment(value=EnvType.CLIENT)
public final class PingSpoof
extends ModuleBase {
    private volatile int I;
    private static String[] l;
    private static final double II = 4.0;
    private volatile long Il;
    private volatile boolean lI;
    private volatile long ll;
    private volatile int III;
    private static final double IIl = 0.35;
    private final IIIIIIIIl<lIlIlII> IlI = this.IIlllIl(new IIIIIIIIl<lIlIlII>(StringFactory.IIII("Mode"), lIlIlII.class, lIlIlII.I));
    private double Ill;
    private final lIlIIlI lII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Ping"), 150.0, 0.0, 1000.0, 5.0).IIIl("ms"));
    private double lIl;
    private long llI;
    private final IlIlIlIII lll;
    private boolean IIII;
    private volatile int IIIl;
    private static final int[] IIlI;
    private static final String[] IIll;
    private static final Object[] IlII;

    @Override
    public void llll() {
        this.lIl();
        lIIIlIl.IIIIll();
    }

    public PingSpoof(IlIlIlIII ilIlIlIII) {
        super(StringFactory.IIII("PingSpoof"), Category.IIl, StringFactory.IIII("Spoofs network latency for manual or opponent-matched ping."));
        this.lll = ilIlIlIII;
        this.lII.lIII(() -> {
            if (this.IlI.lIl() != lIlIlII.I) return false;
            return true;
        });
    }

    public int lI() {
        return this.IIIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl(int n) {
        if (n <= 0) {
            return;
        }
        double d = Math.max(0.0, (double)((long)n - this.llI));
        if (!this.IIII) {
            this.Ill = d;
            this.IIII = true;
            return;
        }
        this.Ill += (d - this.Ill) * 0.35;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI() {
        boolean bl = this.lI || this.Il != 0L || this.ll != 0L;
        this.lIl();
        if (!bl) return;
        lIIIlIl.IIIIll();
    }

    private String lII(double d) {
        String string = "ms";
        int n = (int)Math.round(d);
        return n + string;
    }

    private void lIl() {
        this.IIIl = 0;
        this.I = 0;
        this.III = 0;
        this.Il = 0L;
        this.ll = 0L;
        this.lI = false;
        this.lIl = 0.0;
        this.Ill = 0.0;
        this.IIII = false;
        this.llI = 0L;
    }

    private int lll(double d) {
        return (int)Math.round(Math.max(0.0, Math.min(1000.0, d)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public String II() {
        switch (((lIlIlII)((Object)this.IlI.lIl())).ordinal()) {
            case 1: {
                return "Opponent";
            }
            case 0: {
                String string = this.lII((Double)this.lII.lIl());
                return string;
            }
        }
        throw new MatchException(null, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        long l2;
        long l3;
        long l4;
        int n;
        int n2;
        int n3;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player != null && minecraftClient.world != null && minecraftClient.getNetworkHandler() != null) {
            if (!this.lll.IIIl(minecraftClient, 4.0)) {
                this.IlI();
                return;
            }
            n3 = Math.max(0, this.lll.ll(minecraftClient));
            n2 = Math.max(0, this.lll.lIIl(minecraftClient));
            this.IIl(n3);
            this.lIl = this.llIl(n3, n2);
            int n4 = this.lIIl(n3);
            n = this.lIII(n4);
            l4 = Math.max(0L, (long)(n - n4));
            l3 = 0L;
            l2 = l4;
        }
        this.IlI();
        return;
        boolean bl = l4 > 0L;
        boolean bl2 = this.Il != l3 || this.ll != l2 || this.lI != bl;
        this.IIIl = n3;
        this.I = n2;
        this.III = n;
        this.Il = l3;
        this.ll = l2;
        this.lI = bl;
        this.llI = l4;
        if (!bl2) return;
        lIIIlIl.IIIIll();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IlIIlI(Entity entity) {
        if (this.IlI.lIl() != lIlIlII.lI) return;
        if (!(entity instanceof LivingEntity)) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) return;
        if (minecraftClient.getNetworkHandler() != null) {
            int n = Math.max(0, this.lll.lIIl(minecraftClient));
            if (n <= 0) return;
            this.lIl = n;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 23925;
        String string = "\uc74c\u5044\udaac\u9125\ucad2\u391d\u029c\ua475\u0fef\ufa89\ud038\u201e\uff20\ub4f2\u09e6\ube9a\u2d45\ud491\ubf75\uceeb\ud940\u72e4\u2619\uda3a\u8d06\u12d9\u3380\ub0f5\u817c\ub81b\ua7c4\u4424\u5c29\u7c9c\u60d1\ue3fe\u67f7\ua7f4\u7955\u02bb\uce03\u109e\uf250\uc480\ue743\u0448\u9046\u1e29\ub0ea\u6671\u7b99\ue90b\u845d\udc5d\ub19f\uce4b\ud3aa\ua38e\u12e0\u5cb3\uc5e5\u8326\udeb9\u325c\u00d7\u49cc\uf754\u6b5e\u9339\u00ec\u6ddf\ud0bd\u9e7b\u91a8\u493a\u6ba3\ua438\u5b76\u2e28\u968e\u7bc5\ue855\ud37b\uc6da\u8e16\ub18e\uc950\u0827\ub812\u36d9\uf05c\u193c\u7bb0\u916b\u4f29\u4a4e\uac90\u1eb6\u86c3\u21dd\u6573\u629a\u6215\u90f2\u77fe\uf4d6\u8005\u8221\u0205\u853d\u9a22\udb54\u2e31\u197d\uda88\ua6b6\u628e\u364e\u1166\u253d\ua25e\u0664\ufb5d\u9b93";
        char[] cArray = "\u5d79\u5d71\u5d25\u5d79\u5d7d\u5d7d".toCharArray();
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
        IIll = stringArray;
        IlII = new Object[stringArray.length];
        int n6 = 262404788;
        byte[] byArray = "+\u00dd&\u0002\u00e2\u00a6wG\u009a\u0098O\u00cd\u0004pV\u00ffyUA\u009e@\u00ba\u0080\u0093H\u0085Go\u0018\u00c9\u001d%f2\u009b\u00d2".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IIlI = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            PingSpoof.IIlI[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        l = new String[6];
        PingSpoof.IIII();
    }

    private static void IIII() {
        PingSpoof.l[0] = PingSpoof.lIlI(PingSpoof.IIIII(1576820865, -238671811).toCharArray(), 77643L, 1506704759);
        PingSpoof.l[1] = PingSpoof.lIlI(PingSpoof.IIIII(1576820864, -412022775).toCharArray(), 47542L, 476822302);
        PingSpoof.l[2] = PingSpoof.lIlI(PingSpoof.IIIII(1576820867, 1873235037).toCharArray(), 34926L, -1005370017);
        PingSpoof.l[3] = PingSpoof.lIlI(PingSpoof.IIIII(1576820866, -178106211).toCharArray(), 51758L, 499214103);
        PingSpoof.l[4] = PingSpoof.lIlI(PingSpoof.IIIII(1576820869, -627873879).toCharArray(), 51585L, 446922010);
        PingSpoof.l[5] = PingSpoof.lIlI(PingSpoof.IIIII(1576820868, -571069710).toCharArray(), 24169L, 1393548823);
    }

    public int IlII() {
        return this.III;
    }

    public boolean IllI() {
        return this.lI;
    }

    public long Illl() {
        return !this.lI ? 0L : this.Il;
    }

    private int lIII(int n) {
        int n2 = this.lll(this.lIl);
        return Math.max(n, n2);
    }

    private int lIIl(int n) {
        if (this.IIII) {
            return this.lll(this.Ill);
        }
        return Math.max(0, n);
    }

    private static String lIlI(char[] cArray, long l2, int n) {
        int n2 = 0x5BDF251B ^ n;
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

    public int lIll() {
        return this.I;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public long llII() {
        if (!this.lI) return 0L;
        long l2 = this.ll;
        return l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double llIl(int n, int n2) {
        switch (((lIlIlII)((Object)this.IlI.lIl())).ordinal()) {
            case 0: {
                double d = this.lll((Double)this.lII.lIl());
                return d;
            }
            case 1: {
                double d;
                if (n2 <= 0) {
                    d = Math.max(n, this.lIIl(n));
                    return d;
                }
                d = n2;
                return d;
            }
        }
        throw new MatchException(null, null);
    }

    private static int lllI(int n, int n2) {
        return IIlI[n ^ 0x9CD418AD] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIIII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x5DFC6081;
        char[] cArray = IIll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlII[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            PingSpoof.IlII[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xBEA2AE1C;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 6 -> 167;
                case 4 -> 15;
                case 8 -> 139;
                case 12 -> 24;
                case 13 -> 46;
                case 3 -> 99;
                case 9 -> 231;
                case 29 -> 92;
                case 19 -> 137;
                case 16 -> 217;
                case 1 -> 241;
                case 23 -> 236;
                case 27 -> 223;
                case 24 -> 143;
                case 7 -> 177;
                case 11 -> 40;
                default -> 223;
                case 15 -> 29;
                case 14 -> 3;
                case 28 -> 139;
                case 21 -> 240;
                case 31 -> 246;
                case 5 -> 8;
                case 25 -> 90;
                case 10 -> 212;
                case 2 -> 252;
                case 22 -> 103;
                case 20 -> 224;
                case 30 -> 248;
                case 26 -> 66;
                case 18 -> 231;
                case 17 -> 132;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

