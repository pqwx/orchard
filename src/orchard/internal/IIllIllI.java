/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIllI
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
 *  net.minecraft.client.network.ClientPlayNetworkHandler
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.query.QueryPingC2SPacket
 *  net.minecraft.network.packet.s2c.query.PingResultS2CPacket
 */
package orchard.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayNetworkHandler;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.query.QueryPingC2SPacket;
import net.minecraft.network.packet.s2c.query.PingResultS2CPacket;
import orchard.core.StringFactory;
import orchard.internal.IlllIIlI;
import orchard.internal.llIIIII;
import orchard.internal.lllIIll;

@Environment(value=EnvType.CLIENT)
public final class IIllIllI {
    private boolean I;
    private volatile int l;
    private final Map<Long, lllIIll> II;
    private long Il;
    private IlllIIlI lI;
    private static final IIllIllI ll;
    private volatile boolean III = true;
    private int IIl;
    private static final int IlI = 32;
    private volatile boolean Ill = true;
    private static final double lII = 0.07;
    private static final long lIl = 1000L;
    private volatile boolean llI;
    private volatile boolean lll;
    private static final long IIII = 30000L;
    private int IIIl;
    private static final long IIlI = 150L;
    private static final int IIll = 2;
    private long IlII;
    private long IlIl;
    private volatile boolean IllI;
    private static final double Illl = 25.0;
    private volatile boolean lIII;
    private final int[] lIIl;
    private static final long lIlI = 2L;
    private volatile llIIIII lIll = llIIIII.I;
    private double llII;
    private double llIl;
    private long lllI;
    private static final long llll = 1500L;
    private static final int IIIII = 5;
    private int IIIIl;
    private static final int[] IIIlI;
    private static final String[] IIIll;
    private static final Object[] IIlII;

    public boolean I() {
        return this.IllI;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static boolean l(Packet<?> packet) {
        if (packet == null) return false;
        if (!IIllIllI.IIllI(packet.getClass().getName())) return false;
        return true;
    }

    public int II() {
        return this.IIlIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void Il(PingResultS2CPacket pingResultS2CPacket) {
        long l2;
        long l3;
        if (pingResultS2CPacket == null) {
            return;
        }
        lllIIll lllIIll2 = this.II.remove(pingResultS2CPacket.startTime());
        if (lllIIll2 == null) {
            return;
        }
        long l4 = System.currentTimeMillis();
        long l5 = lllIIll2.Il > 0L ? lllIIll2.Il : l4;
        long l6 = Math.max(0L, l5 - pingResultS2CPacket.startTime());
        long l7 = Math.max(0L, l6 - (l3 = (l2 = lllIIll2.I + lllIIll2.l) > 0L ? l2 : lllIIll2.II));
        int n = this.lllI((int)l7);
        if (n <= 0) {
            this.I = false;
            return;
        }
        this.IIl = n;
        double d = n;
        if (this.llIl > 0.0) {
            double d2 = this.llIl - 25.0;
            double d3 = this.llIl + 25.0;
            d = Math.max(d2, Math.min(d3, d));
        }
        this.llIl = this.llIl == 0.0 ? d : this.llIl * 0.9299999999999999 + d * 0.07;
        this.IlII = l4;
        this.I = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lI() {
        this.II.clear();
        this.I = false;
        this.lllI = 0L;
        this.IIl = 0;
        this.llIl = 0.0;
        this.IlII = 0L;
        this.IIIIl = 0;
        this.IIIl = 0;
    }

    public synchronized void III(boolean bl, boolean bl2) {
        this.Ill = bl;
        this.III = bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 32628;
        String string = "\u1870\u1889\u1867\u188d\u1867\u1891\u1877\u187d\u1898\u1881\u1886\u187c\u1880\u1898\u186b\u1890\u1880\u1885\u18b2\u1878\u186a\u1899\u185c\u185d\u1899\u18b7\u18ab\u18ad\u1899\u18b0\u187c\u185d\u1865\u1880\u18b1\u1883\u6e0f\u6de3\u6e4e\u6de5\u6e07\u6e15\u6df3\u6df3\u6df5\u6e05\u6e0a\u6df2\u6de5\u6de4\u6e10\u6de9\u6de9\u6de8\u6ded\u6dff\u6e07\u6df3\u6de8\u6deb\u6dee\u6dde\u6e5a\u6e5a\u39dd\u3a17\u39dd\u39fd\u39f5\u39ff\u39ed\u39e7\u39fc\u3a02\u3a38\u39fe\u3a0f\u3a1e\u3a0b\u3a09\u3a10\u39dd\u3a0d\u3a18\u39df\u39f0\u39e2\u3a20\u3a07\u3a17\u3a21\u39f2\u3a09\u3a0b\u39fe\u3a1a\ue6bb\ue6b6\ue6d4\ue6a2\ue6d4\ue69e\ue6c4\ue6b2\ue6a3\ue6d4\ue6d7\ue6af\ue6b1\ue6b6\ue67f\ue6b9\ue6ab\ue6cf\ue6ad\ue6b7\ue6c2\ue6cb\ue6d3\ue6a2\ue6a2\ue67f\ue6cd\ue6cd\ue69b\ue6c1\ue687\ue687\uc3f1\uc430\uc411\uc415\uc3e8\uc40f\uc409\uc414\uc412\uc40d\uc406\uc3e6\uc412\uc3ed\uc3f3\uc3eb\uc3ff\uc3ef\uc3ff\uc411\uc3e8\uc42f\uc3f2\uc438\u6e43\u6e09\u6e38\u6e24\u6e4c\u6e3a\u6e4e\u6e54\u6e27\u6e25\u6e45\u6e23\u6e2f\u6dfe\u6e05\u6e08\u6e26\u6dfd\u6e32\u6e5a\u6e52\u6e1c\u6e04\u6e35\ueee2\uef22\ueee1\uef03\ueef4\ueefb\uef03\uef03\uef06\uef0b\uef00\uef03\uef11\uef1f\ueee0\uef19\uef19\uef18\ueefd\ueeef\ueef7\uef03\uef18\ueefb\ueefe\uef0e\uef2a\uef2a\ude37\ude42\uddf7\ude27\ude1b\ude2f\ude34\ude59\ude57\ude35\ude1b\ude2a\ude40\ude41\ude35\ude3c\ude3c\ude3d\ude58\ude26\ude1e\ude52\ude3d\ude5a\ude57\ude47\uddeb\uddeb\uadf5\uae34\uae15\uae11\uaddc\uae13\uae19\uae1a\uae18\uadf6\uae22\uae16\uae03\uae34\uadf7\uadf8\uae0f\uade5\uae03\uadf4\uaddd\uae34\uadf4\uade5\uae14\uae10\uade6\uae2c\u716a\u7192\u717f\u7177\u716e\u7171\u7197\u7177\u7183\u7187\u7198\u7188\u7194\u71a5\u7161\u71a3\u7197\u71a2\u718d\u7190\u7168\u71a6\u71a7\u7191\u7187\u71a6\u71a9\u7176\u7186\u716e\u718b\u718c\u7165\u7195\u7172\u7176\u7184\u7174\u7185\u7184\u7162\u7174\u719e\u719e\ucb58\ucb18\ucb4b\ucb39\ucb3c\ucb27\ucb35\ucb36\ucb34\ucb5a\ucafe\ucb3a\ucb27\ucb18\ucb53\ucb54\ucb2b\ucb49\ucb27\ucb58\ucb41\ucb18\ucb58\ucb49\ucb38\ucb2c\ucb4a\ucb10\ubc72\ubc87\ubc69\ubc8b\ubc69\ubc90\ubc71\ubc9a\ubc8f\ubc8f\ubc88\ubc8d\ubc84\ubcb9\ubcb2\ubcab\ubc91\ubcba\ubc85\ubc5d\ubc65\ubc97\ubcaf\ubc82\uddd9\udda0\uddc2\uddb4\uddc2\uddb7\uddda\uddb1\uddb8\uddb8\udd9f\uddb6\udd9e\uddbb\udd99\uddb3\udda9\uddd4\uddc8\uddb9\uddc1\uddda\udda3\udda9\uddb6\uddc9\udd91\udd9e\uddc6\udda3\udda9\uddc6\uddbe\udda9\udd9b\uddc9\uddb6\uddb9\udd8d\udd8d";
        char[] cArray = "\u7f50\u7f68\u7f54\u7f54\u7f6c\u7f6c\u7f68\u7f68\u7f68\u7f58\u7f68\u7f6c\u7f5c".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 != 0) {
                do {
                    n5 = cArray[n3] ^ n;
                    stringArray[n3] = string.substring(n4, n4 + n5);
                    n4 += n5;
                } while (++n3 < cArray.length);
            } else {
                IIIll = stringArray;
                IIlII = new Object[stringArray.length];
                int n6 = -1450647311;
                byte[] byArray = "\u00d9Rc\u00c1=\u007f\u00d1\u0010".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                IIIlI = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    IIllIllI.IIIlI[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                ll = new IIllIllI();
                return;
            }
            n2 = 0;
        }
    }

    public void IIl(long l2) {
        block0: {
            lllIIll lllIIll2 = this.II.get(l2);
            if (lllIIll2 == null) break block0;
            lllIIll2.lI = System.currentTimeMillis();
        }
    }

    public synchronized void IlI() {
        this.llIl(true);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void Ill(MinecraftClient minecraftClient) {
        int n;
        if (!this.lll) {
            this.Il = 0L;
            return;
        }
        if (this.lIll == llIIIII.II) {
            this.llII = this.l;
            this.Il = IIllIllI.IlII(this.llII);
            return;
        }
        if (minecraftClient == null) {
            minecraftClient = MinecraftClient.getInstance();
        }
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) {
            return;
        }
        ClientPlayNetworkHandler clientPlayNetworkHandler = minecraftClient.getNetworkHandler();
        if (clientPlayNetworkHandler == null) {
            return;
        }
        long l2 = System.currentTimeMillis();
        this.llII(clientPlayNetworkHandler, false);
        if (!this.IlIl(l2)) {
            if (this.IIl > 0) return;
            n = this.IIIlI(minecraftClient);
            if (n <= 0) return;
            this.lIl(n);
        }
        n = this.IIlIl();
        long l3 = Math.max(0, this.l - n);
        this.IIII(l3);
        this.Illl(l2, IIllIllI.IlII(this.llII));
    }

    public boolean lII() {
        return this.lll;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(int n) {
        if (n <= 0) {
            return;
        }
        long l2 = System.currentTimeMillis();
        this.IIl = Math.max(this.IIl, n);
        this.llIl = !(this.llIl <= 0.0) ? Math.max(this.llIl, (double)n) : (double)n;
        this.IlII = l2;
    }

    public int llI() {
        return (int)this.Il;
    }

    public int lll() {
        return this.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIII(long l2) {
        double d = (double)l2 - this.llII;
        double d2 = Math.abs(d);
        if (d2 < 0.01) {
            this.llII = l2;
            return;
        }
        boolean bl = d < 0.0;
        double d3 = bl ? 0.25 : 0.5;
        double d4 = bl ? 16.0 : 60.0;
        double d5 = Math.min(d2 / 20.0, 1.0);
        double d6 = !bl ? 0.3 + 0.7 * d5 : 0.15 + 0.45 * d5;
        double d7 = d2 * d6;
        d7 = Math.min(d2, Math.max(d3, Math.min(d7, d4)));
        this.llII += Math.copySign(d7, d);
        if (!(Math.abs((double)l2 - this.llII) < 0.5)) return;
        this.llII = l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIIl(long l2) {
        if (!this.lll) {
            return;
        }
        long l3 = System.currentTimeMillis();
        this.IlIII(l3);
        lllIIll lllIIll2 = new lllIIll();
        lllIIll2.II = this.Il;
        lllIIll2.I = this.llll();
        lllIIll2.l = this.IIIll();
        this.II.put(l2, lllIIll2);
        this.lllI = l3;
        this.I = true;
    }

    public boolean IIlI() {
        return this.llI;
    }

    public boolean IIll() {
        return this.III;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static long IlII(double d) {
        if (d <= 0.0) {
            return 0L;
        }
        long l2 = Math.round(d);
        long l3 = 1L;
        long l4 = (l2 + l3) / 2L * 2L;
        return Math.max(0L, l4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIl(long l2) {
        if (this.IIl <= 0) return false;
        if (l2 - this.IlII > 1500L) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized boolean IllI() {
        if (this.IIIIl().l()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void Illl(long l2, long l3) {
        boolean bl;
        long l4;
        block1: {
            l4 = Math.abs(l3 - this.Il);
            if (l4 == 0L) break block1;
        }
        return;
        boolean bl2 = l4 >= 6L;
        boolean bl3 = l4 >= 2L;
        boolean bl4 = bl = l2 - this.IlIl >= 150L;
        if (!bl2) {
            if (!bl3) return;
            if (!bl) return;
        }
        this.Il = l3;
        this.IlIl = l2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public synchronized void lIII() {
        this.lI = this.lI.II(this.Ill, this.III);
        this.llI = !this.lI.l();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lIIl(String string) {
        if (string == null) {
            return false;
        }
        if (string.endsWith("PlayerPositionLookS2CPacket")) return true;
        if (string.endsWith(StringFactory.IIl("vJ1HnxZZXhmUHKwLLOPfnZORQA=="))) return true;
        if (string.endsWith(StringFactory.IIl("tJtTlRdzWQ+UB5FXCtDKrcq3ZJ0aXFUI"))) return true;
        if (string.endsWith(StringFactory.IIl("qJhVhRxFYhmEGJ5OAeCMvaiVV5ccQw=="))) return true;
        if (string.endsWith(StringFactory.IIl("v5VZmTNYWRKkWrxpDtDVm4w="))) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized void lIlI(boolean bl, llIIIII llIIIII2, int n) {
        boolean bl2;
        boolean bl3;
        block3: {
            block4: {
                block2: {
                    bl3 = this.lll;
                    llIIIII llIIIII3 = llIIIII2 != null ? llIIIII2 : llIIIII.I;
                    int n2 = Math.max(0, n);
                    bl2 = this.l != n2 || this.lIll != llIIIII3;
                    this.lll = bl;
                    this.lIll = llIIIII3;
                    this.l = n2;
                    if (!bl) break block2;
                    if (bl3 && !bl2) break block3;
                    break block4;
                }
                this.Il = 0L;
                this.llII = 0.0;
                return;
            }
            this.lI();
        }
        if (this.lIll == llIIIII.II) {
            this.llII = this.l;
            this.Il = IIllIllI.IlII(this.llII);
            this.IlIl = System.currentTimeMillis();
            return;
        }
        if (bl3) {
            if (!bl2) return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        int n3 = this.IIIlI(minecraftClient);
        if (n3 <= 0) return;
        this.lIl(n3);
        double d = Math.max(0, this.l - n3);
        this.llII = d;
        this.Il = IIllIllI.IlII(this.llII);
        this.IlIl = System.currentTimeMillis();
    }

    public boolean lIll() {
        return this.Ill;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llII(ClientPlayNetworkHandler clientPlayNetworkHandler, boolean bl) {
        long l2 = System.currentTimeMillis();
        this.IlIII(l2);
        if (!bl) {
            if (this.IlIl(l2)) {
                return;
            }
            if (this.I && l2 - this.lllI < 1000L) {
                return;
            }
        }
        clientPlayNetworkHandler.sendPacket((Packet)new QueryPingC2SPacket(l2));
    }

    /*
     * Enabled aggressive block sorting
     */
    public synchronized void llIl(boolean bl) {
        if (bl) {
            this.lI = this.lI.II(this.Ill, this.III);
        }
        this.IllI = false;
        this.Ill = true;
        this.III = true;
        this.lIII = false;
        this.lll = false;
        this.l = 0;
        this.Il = 0L;
        this.llII = 0.0;
        this.lI();
        this.llI = !this.lI.l();
    }

    /*
     * Enabled aggressive block sorting
     */
    private int lllI(int n) {
        if (n <= 0) {
            return -1;
        }
        this.lIIl[this.IIIl] = n;
        this.IIIl = (this.IIIl + 1) % 5;
        if (this.IIIIl < 5) {
            ++this.IIIIl;
        }
        int[] nArray = Arrays.copyOf(this.lIIl, this.IIIIl);
        Arrays.sort(nArray);
        return nArray[this.IIIIl / 2];
    }

    public long llll() {
        return this.Il / 2L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIllIllI() {
        this.lI = IlllIIlI.II;
        this.lIIl = new int[5];
        this.II = new ConcurrentHashMap<Long, lllIIll>();
    }

    public static IIllIllI IIIII() {
        return ll;
    }

    public synchronized IlllIIlI IIIIl() {
        IlllIIlI illlIIlI = this.lI;
        this.lI = IlllIIlI.II;
        this.llI = false;
        return illlIIlI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIIlI(MinecraftClient minecraftClient) {
        int n = this.IIlIl();
        if (minecraftClient == null) return n;
        if (minecraftClient.player == null) return n;
        if (minecraftClient.getNetworkHandler() == null) {
            return n;
        }
        PlayerListEntry playerListEntry = minecraftClient.getNetworkHandler().getPlayerListEntry(minecraftClient.player.getUuid());
        if (playerListEntry == null) return n;
        if (playerListEntry.getLatency() <= 0) return n;
        return Math.max(n, playerListEntry.getLatency());
    }

    public long IIIll() {
        return this.Il - this.llll();
    }

    public boolean IIlII() {
        return this.lIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIlIl() {
        double d = this.llIl > 0.0 ? this.llIl : (double)this.IIl;
        return (int)Math.round(d);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIllI(String string) {
        if (string == null) {
            return false;
        }
        if (string.endsWith("KeepAliveS2CPacket")) return true;
        if (string.endsWith(StringFactory.IIl("u5tZkRZZYBWZD6wLLOPfnZORQA=="))) return true;
        if (string.endsWith(StringFactory.IIl("qJ1amytSQwmbHKwLLOPfnZORQA=="))) return true;
        if (string.endsWith(StringFactory.IIl("v5VZmTRSQw+WD5pqXfDun5ufUYg="))) return true;
        if (string.endsWith("ProfilelessChatMessageS2CPacket")) return true;
        if (string.endsWith(StringFactory.IIl("u5xViDRSQw+WD5pqXfDun5ufUYg="))) return true;
        if (string.endsWith(StringFactory.IIl("qJhVhSpYRRKTO816P9LdlZ2A"))) return true;
        if (string.endsWith(StringFactory.IIl("qJhVhSpYRRKTLo1WAvbQipGATa9LdGAdlAOaTQ=="))) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIlll(long l2) {
        lllIIll lllIIll2 = this.II.get(l2);
        if (lllIIll2 != null) {
            lllIIll2.Il = System.currentTimeMillis();
        }
    }

    private void IlIII(long l2) {
        this.II.entrySet().removeIf(entry -> l2 - (Long)entry.getKey() > 30000L);
        if (this.II.size() <= 32) {
            return;
        }
        List list = this.II.keySet().stream().sorted().limit(this.II.size() - 32).toList();
        Map<Long, lllIIll> map = this.II;
        Objects.requireNonNull(map);
        list.forEach(map::remove);
    }

    public void IlIIl(boolean bl) {
        this.lIII = bl;
    }

    public synchronized void IlIlI(boolean bl) {
        this.IllI = bl;
    }

    public void IlIll(long l2, long l3) {
        block0: {
            lllIIll lllIIll2 = this.II.get(l2);
            if (lllIIll2 == null) break block0;
            lllIIll2.l = l3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void IllII(long l2, long l3) {
        lllIIll lllIIll2 = this.II.get(l2);
        if (lllIIll2 == null) {
            return;
        }
        lllIIll2.I = l3;
    }

    private static int IllIl(int n, int n2) {
        return IIIlI[n ^ 0x98EB04F6] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlllI(char c, int n, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x241B;
        char[] cArray = IIIll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIlII[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIllIllI.IIlII[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x5192;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 59068;
            n6 -= 58515;
            n6 -= 55975;
            cArray[n5] = (char)((n6 -= 18277) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

