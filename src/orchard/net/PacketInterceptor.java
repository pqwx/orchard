/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIlIllIl
 * Identified from direct evidence; see README.md
 *
 * Recovered strings in this class:
 *   - Blocked translation probe
 *   - Blocked channel probe
 *   - Blocked SSRF probe
 *   - lunarclient:v2.15.0
 *   - .localhost
 *   - .getBytes(
 *   - localhost
 *   - vanilla
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
 *  net.minecraft.network.packet.BrandCustomPayload
 *  net.minecraft.network.packet.CustomPayload
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket
 */
package orchard.net;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.BrandCustomPayload;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.common.CustomPayloadC2SPacket;
import orchard.core.ClientEntrypoint;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIlllIIIl;
import orchard.internal.IlIIlllll;
import orchard.internal.IllIIll;
import orchard.module.player.Opsec;
import orchard.module.render.FakeClient;

@Environment(value=EnvType.CLIENT)
public final class PacketInterceptor {
    private static final ExecutorService I;
    private static final IIIlIIIII l;
    private static final IIIlIIIII II;
    private static final Map<String, Long> Il;
    private static final byte[][] lI;
    private static final int ll = 16;
    private static final long III = 2500L;
    private static final AtomicInteger IIl;
    private static final IIIlIIIII IlI;
    private static final int Ill = 100000;
    private static final int lII = 4;
    private static final IIIlIIIII lIl;
    private static final Set<UUID> llI;
    private static final int[] lll;
    private static final String[] IIII;
    private static final Object[] IIIl;

    public static void I(String string, Consumer<Boolean> consumer) {
        IllIIll illIIll = PacketInterceptor.IIlI(string);
        if (illIIll == null) {
            consumer.accept(false);
            return;
        }
        int n = IIl.incrementAndGet();
        if (n > 4) {
            IIl.decrementAndGet();
            consumer.accept(false);
            return;
        }
        try {
            CompletableFuture.supplyAsync(() -> PacketInterceptor.lIl(illIIll.I()), I).orTimeout(3L, TimeUnit.SECONDS).whenComplete((bl, throwable) -> {
                IIl.decrementAndGet();
                consumer.accept(throwable == null && Boolean.TRUE.equals(bl));
            });
        }
        catch (RuntimeException runtimeException) {
            IIl.decrementAndGet();
            consumer.accept(false);
        }
    }

    /*
     * Enabled aggressive exception aggregation
     */
    private static byte[][] l() {
        try (InputStream inputStream = PacketInterceptor.class.getResourceAsStream("/assets/cats/p4z8m1/q7v6x2.bin");){
            byte[][] byArray;
            int n;
            DataInputStream dataInputStream;
            block18: {
                if (inputStream == null) {
                    byte[][] byArrayArray = new byte[][]{};
                    return byArrayArray;
                }
                dataInputStream = new DataInputStream(inputStream);
                n = dataInputStream.readInt();
                if (n >= 1 && n <= 100000) break block18;
                byte[][] byArrayArray = new byte[][]{};
                dataInputStream.close();
                return byArrayArray;
            }
            try {
                byte[][] byArray2;
                for (byte[] byArray3 : byArray2 = new byte[n][16]) {
                    dataInputStream.readFully(byArray3);
                }
                byArray = byArray2;
            }
            catch (Throwable throwable) {
                try {
                    dataInputStream.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            dataInputStream.close();
            return byArray;
        }
        catch (Exception exception) {
            return new byte[0][];
        }
    }

    public static boolean Il(String string) {
        IllIIll illIIll = PacketInterceptor.IIlI(string);
        return illIIll != null && PacketInterceptor.lIl(illIIll.I());
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean ll(byte by, byte by2, byte by3, byte by4) {
        int n = Byte.toUnsignedInt(by);
        int n2 = Byte.toUnsignedInt(by2);
        if (n == 0) return true;
        if (n == 10) return true;
        if (n == 127) return true;
        if (n == 169) {
            if (n2 == 254) return true;
        }
        if (n == 172 && n2 >= 16) {
            if (n2 <= 31) return true;
        }
        if (n != 192) return false;
        if (n2 == 168) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean III(String string) {
        long l2 = System.currentTimeMillis();
        Long l3 = Il.get(string);
        if (l3 != null) {
            if (l2 - l3 < 2500L) {
                return true;
            }
        }
        Il.put(string, l2);
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IlI(InetAddress inetAddress) {
        if (inetAddress == null) return true;
        if (inetAddress.isAnyLocalAddress()) return true;
        if (inetAddress.isLoopbackAddress()) return true;
        if (inetAddress.isLinkLocalAddress()) return true;
        if (inetAddress.isSiteLocalAddress()) return true;
        if (inetAddress.isMulticastAddress()) return true;
        byte[] byArray = inetAddress.getAddress();
        if (byArray.length == 16) {
            boolean bl;
            if ((byArray[0] & 0xFE) == 252) return true;
            boolean bl2 = true;
            for (int i = 0; i < 10; bl2 &= bl, ++i) {
                if (byArray[i] == 0) {
                    bl = true;
                    continue;
                }
                bl = false;
            }
            if (bl2 &= byArray[10] == -1 && byArray[11] == -1) {
                return PacketInterceptor.ll(byArray[12], byArray[13], byArray[14], byArray[15]);
            }
        }
        if (byArray.length != 4) return false;
        if (!PacketInterceptor.ll(byArray[0], byArray[1], byArray[2], byArray[3])) return false;
        return true;
    }

    public static void Ill(String string) {
        if (PacketInterceptor.III("Blocked SSRF probe")) {
            return;
        }
        PacketInterceptor.IllI(l, IlI);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void lII(String string) {
        if (PacketInterceptor.III("Blocked channel probe")) {
            return;
        }
        PacketInterceptor.IllI(l, lIl);
    }

    private static boolean lIl(String string) {
        try {
            InetAddress[] inetAddressArray = InetAddress.getAllByName(string);
            if (inetAddressArray.length == 0) {
                return false;
            }
            for (InetAddress inetAddress : inetAddressArray) {
                if (!PacketInterceptor.IlI(inetAddress)) continue;
                return false;
            }
            return true;
        }
        catch (Exception exception) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static Packet<?> llI(Packet<?> packet, boolean bl) {
        if (!bl) {
            return packet;
        }
        if (!(packet instanceof CustomPayloadC2SPacket)) return packet;
        CustomPayloadC2SPacket customPayloadC2SPacket = (CustomPayloadC2SPacket)packet;
        CustomPayload customPayload = customPayloadC2SPacket.payload();
        if (customPayload instanceof BrandCustomPayload) return new CustomPayloadC2SPacket((CustomPayload)new BrandCustomPayload(PacketInterceptor.lll()));
        return packet;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String lll() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return "vanilla";
        if (clientEntrypoint.IlI() == null) return "vanilla";
        FakeClient fakeClient = clientEntrypoint.IlI().IIIlIII();
        if (fakeClient == null) return "vanilla";
        if (!fakeClient.IIIlIIl()) return "vanilla";
        switch (fakeClient.l()) {
            case I: {
                return "vanilla";
            }
            case lI: {
                return "lunarclient:v2.15.0";
            }
            case l: {
                return "Feather";
            }
        }
        throw new MatchException(null, null);
    }

    public static boolean IIII(Packet<?> packet) {
        return PacketInterceptor.IIll(packet, PacketInterceptor.IlII());
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    public static boolean IIIl(String string) {
        block9: {
            int n;
            int n2;
            int n3;
            int n4;
            byte[] byArray;
            block8: {
                if (string == null) {
                    return false;
                }
                if (string.startsWith("debug.")) {
                    return true;
                }
                if (lI.length == 0) {
                    return false;
                }
                byArray = PacketInterceptor.Illl(string);
                if (byArray == null) {
                    return false;
                }
                n4 = 0;
                n3 = lI.length - 1;
                if (!true) break block8;
                if (n4 > n3) return false;
                if ((n2 = PacketInterceptor.lIIl(lI[n = n4 + n3 >>> 1], byArray)) == 0) break block9;
            }
            do {
                if (n2 < 0) {
                    n4 = n + 1;
                } else {
                    n3 = n - 1;
                }
                if (n4 > n3) return false;
            } while ((n2 = PacketInterceptor.lIIl(lI[n = n4 + n3 >>> 1], byArray)) != 0);
        }
        return true;
    }

    private static IllIIll IIlI(String string) {
        if (string == null || string.isBlank()) {
            return null;
        }
        try {
            URI uRI = URI.create(string);
            String string2 = uRI.getScheme();
            if (string2 == null || !string2.equalsIgnoreCase("http") && !string2.equalsIgnoreCase("https") || uRI.getRawUserInfo() != null || uRI.getPort() == 0 || uRI.getPort() > 65535) {
                return null;
            }
            String string3 = uRI.getHost();
            if (string3 == null || string3.isBlank()) {
                return null;
            }
            String string4 = IDN.toASCII(string3).toLowerCase(Locale.ROOT);
            if (string4.equals("localhost") || string4.endsWith(".localhost")) {
                return null;
            }
            return new IllIIll(string4);
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean IIll(Packet<?> packet, boolean bl) {
        if (!bl) {
            return false;
        }
        if (!(packet instanceof CustomPayloadC2SPacket)) return false;
        CustomPayloadC2SPacket customPayloadC2SPacket = (CustomPayloadC2SPacket)packet;
        if (!(customPayloadC2SPacket.payload() instanceof BrandCustomPayload)) {
            PacketInterceptor.lII(customPayloadC2SPacket.payload().getId().id().toString());
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IlII() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        Opsec opsec = clientEntrypoint.IlI().IIIIlIl();
        if (opsec == null) return false;
        if (!opsec.IIIlIIl()) return false;
        return true;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 2316;
        String string = "\u565e\u5604\u56ef\u5626\u5619\u5665\u560e\u560f\u5665\u564f\u5647\u564d\u5608\u561a\u56f7\u5635\u5629\u5673\u566d\u56f7\u5606\u5622\u567c\u5661\u56a9\u5627\u5637\u56b2\u56fe\u5648\u56a7\u5610\u5605\u5600\u56cb\u563c\u5624\u566a\u5614\u562f\uc493\uc4c8\uc458\uc485\uc494\uc4ec\uc4b5\uc491\uc4eb\uc4b1\uc4f8\uc4fa\uc48d\uc4fc\uc43b\uc4d8\uc4a5\uc48f\uc4fb\uc478\uc48c\uc4bc\uc4c7\uc4e0\u9e0e\u9e55\u9ec5\u9e18\u9e09\u9e71\u9e28\u9e0c\u9e76\u9e2c\u9e65\u9e59\u9e1e\u9e1d\u9ea2\u9e32\u9e2d\u9e4e\u9e54\u9efb\u9e49\u9e14\u9e42\u9e68\u9ea8\u9e62\u9e5a\u9e8c\u93ac\u93e8\u9346\u93a6\u93b6\u93e6\u9389\u9380\u93c8\u9386\u939c\u938c\u11ce\u1196\u1128\u11ef\u11cd\u1188\u11e7\u11cf\u11b2\u11ce\u11e2\u11f2\u4656\u462d\u46aa\u465a\u4648\u4619\u4657\u464b\u4639\u4669\u460a\u461e\u465c\u4679\u46a5\u466f\u466a\u4632\u4630\u46b8\u4641\u4602\u4659\u460f\u46fc\u4657\u4612\u4693\u3615\u3651\u36ff\u361f\u360f\u365f\u3630\u3639\u3671\u363f\u3625\u3635\u362c\u3656\u36d2\u3614\u3637\u3662\u366f\u363c\ub47a\ub406\ub485\ub451\ub467\ub422\ub435\ub408\u114c\u1130\u11b3\u1167\u1151\u1114\u1151\u113e\u0cf8\u0c80\u0c36\u0ccd\u0ce6\u0cb4\u0cdb\u0cd6\u0c97\u0cf2\u0cd8\u0ca7\u4c7a\u4c65\u4cf5\u4c28\u4c39\u4c41\u4c3a\u4c0d\u4c47\u4c18\u4c63\u4c79\u4c27\u4c26\u4c9a\u4c67\u57f8\u57e6\u5708\u57e3\u57fd\u57ac\u57fa\u5795\u983c\u9867\u98f7\u982a\u983b\u9843\u981a\u983e\u9844\u981e\u9857\u9855\u9822\u9853\u9894\u9877\u980a\u9820\u9854\u98d7\u9823\u9813\u9868\u984f\u07b3\u07e8\u0778\u07a5\u07b4\u07cc\u0795\u07b1\u07cb\u0791\u07d8\u07f5\u07a5\u079a\u071f\u078f\u0799\u07d9\u07a4\u0773\u07ae\u07b6\u07d1\u07f0\u0715\u079e\u07a4\u0718\u0744\u07f2\u076c\u0797\u07ad\u07ff\u072d\u07fa\ud744\ud71f\ud78f\ud752\ud743\ud73b\ud762\ud746\ud73c\ud766\ud72f\ud713\ud754\ud757\ud7e8\ud778\ud767\ud704\ud71e\ud7b1\ud703\ud75e\ud708\ud722\ud7e2\ud728\ud710\ud7c6\ufa35\ufa2d\ufaea\ufa74\ufa68\ufa63\ufa2e\ufa23\ufa5d\ufa32\ufa1e\ufa0e\uaeb7\uaeec\uae7c\uaea1\uaeb0\uaec8\uae91\uaeb5\uaecf\uae95\uaedc\uaef1\uaea1\uae9e\uae1b\uae8b\uae9d\uaedd\uaea0\uae77\uaeaa\uaeb2\uaed5\uaef4\uae11\uae9a\uaea0\uae1c\uae40\uaef6\uae68\uae93\uaea9\uaefb\uae29\uaefe";
        char[] cArray = "\u0924\u0914\u0910\u0900\u0900\u0910\u0900\u0904\u0904\u0904\u0900\u091c\u0904\u0914\u0928\u0910\u0900\u0928".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                n2 = 0;
            }
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
        }
        IIII = stringArray;
        IIIl = new Object[stringArray.length];
        int n6 = 1114872302;
        byte[] byArray = "y[\u0003i\u00ecJ\u00d7\u0080^\u00ad#\u00c9\u009b\u00e1\u0012i5\"]\u0081\u00ad0\u00f2\bk\u0001C\u00d5\u0085,y\u0096\"\u001e%\u00f7\u00e1\rW}\u009e*ep28n\u001b\u00e9\u0003\u00b9\u00f8\u0085#\u00f3\u00d0\u00df\u00e5\u0092q\u00fb\u00ac\u00883r\u0018[\u009d\u00a2\u00af_\u00d7\u00fd\u00ee\u00d3\u00ec\u00c1\rp\u00a2\u00bdv\u00c8\u00ebjz\u008bR\u0093\u00cf\u00c1\u0015\u0097O\u001f\u0093".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        lll = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            PacketInterceptor.lll[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        l = StringFactory.IIII("OpSec");
        IlI = StringFactory.IIII("Blocked SSRF probe");
        II = StringFactory.IIII("Blocked translation probe");
        lIl = StringFactory.IIII("Blocked channel probe");
        llI = ConcurrentHashMap.newKeySet();
        Il = new ConcurrentHashMap<String, Long>();
        IIl = new AtomicInteger();
        I = Executors.newFixedThreadPool(2, runnable -> {
            Thread thread = new Thread(runnable);
            thread.setDaemon(true);
            return thread;
        });
        lI = PacketInterceptor.l();
    }

    private PacketInterceptor() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IlIl(UUID uUID) {
        if (uUID == null) return false;
        if (!llI.remove(uUID)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IllI(IIIlIIIII iIIlIIIII, IIIlIIIII iIIlIIIII2) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null) {
            minecraftClient.execute(() -> {
                block0: {
                    IIlllIIIl iIlllIIIl = IIlllIIIl.ll();
                    if (iIlllIIIl == null) break block0;
                    iIlllIIIl.II(IlIIlllll.I, iIIlIIIII, iIIlIIIII2, 4000L);
                }
            });
            return;
        }
    }

    private static byte[] Illl(String string) {
        try {
            return Arrays.copyOf(MessageDigest.getInstance("SHA-256").digest(string.getBytes(StandardCharsets.UTF_8)), 16);
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private static int lIIl(byte[] byArray, byte[] byArray2) {
        int n;
        block3: {
            int n2;
            block2: {
                n2 = 0;
                if (!true) break block2;
                if (n2 >= 16) return 0;
                if ((n = Byte.toUnsignedInt(byArray[n2]) - Byte.toUnsignedInt(byArray2[n2])) != 0) break block3;
            }
            do {
                ++n2;
                if (n2 >= 16) return 0;
            } while ((n = Byte.toUnsignedInt(byArray[n2]) - Byte.toUnsignedInt(byArray2[n2])) == 0);
        }
        return n;
    }

    public static Packet<?> lIlI(Packet<?> packet) {
        return PacketInterceptor.llI(packet, PacketInterceptor.IlII());
    }

    public static void lIll(String string) {
        if (!PacketInterceptor.III("Blocked translation probe")) {
            PacketInterceptor.IllI(l, II);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void llII() {
        llI.clear();
        IIl.set(0);
        Il.clear();
        I.shutdownNow();
    }

    public static void llIl(UUID uUID) {
        if (uUID != null) {
            llI.add(uUID);
        }
    }

    private static int lllI(int n, int n2) {
        return lll[n ^ 0x57A0EC77] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String llll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xB81D0F2D;
        char[] cArray = IIII[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            PacketInterceptor.IIIl[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x38EF9301;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 12: {
                    n6 = 5;
                    continue block33;
                }
                case 19: {
                    n6 = 242;
                    continue block33;
                }
                case 14: {
                    n6 = 205;
                    continue block33;
                }
                case 6: {
                    n6 = 56;
                    continue block33;
                }
                case 7: {
                    n6 = 5;
                    continue block33;
                }
                case 13: {
                    n6 = 13;
                    continue block33;
                }
                case 28: {
                    n6 = 241;
                    continue block33;
                }
                case 4: {
                    n6 = 61;
                    continue block33;
                }
                case 18: {
                    n6 = 108;
                    continue block33;
                }
                case 25: {
                    n6 = 13;
                    continue block33;
                }
                case 3: {
                    n6 = 32;
                    continue block33;
                }
                case 16: {
                    n6 = 54;
                    continue block33;
                }
                case 10: {
                    n6 = 70;
                    continue block33;
                }
                case 1: {
                    n6 = 127;
                    continue block33;
                }
                case 11: {
                    n6 = 86;
                    continue block33;
                }
                default: {
                    n6 = 33;
                    continue block33;
                }
                case 2: {
                    n6 = 247;
                    continue block33;
                }
                case 23: {
                    n6 = 117;
                    continue block33;
                }
                case 31: {
                    n6 = 21;
                    continue block33;
                }
                case 9: {
                    n6 = 48;
                    continue block33;
                }
                case 8: {
                    n6 = 122;
                    continue block33;
                }
                case 27: {
                    n6 = 181;
                    continue block33;
                }
                case 17: {
                    n6 = 112;
                    continue block33;
                }
                case 20: {
                    n6 = 32;
                    continue block33;
                }
                case 26: {
                    n6 = 52;
                    continue block33;
                }
                case 21: {
                    n6 = 33;
                    continue block33;
                }
                case 5: {
                    n6 = 83;
                    continue block33;
                }
                case 15: {
                    n6 = 48;
                    continue block33;
                }
                case 22: {
                    n6 = 113;
                    continue block33;
                }
                case 30: {
                    n6 = 179;
                    continue block33;
                }
                case 24: {
                    n6 = 165;
                    continue block33;
                }
                case 29: 
            }
            n6 = 67;
        }
    }
}

