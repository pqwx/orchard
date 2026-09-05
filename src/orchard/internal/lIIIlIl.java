/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIIlIl
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Discarded across player respawn
 *   - Packet-order queue is full
 *   - getParameter
 *   - .getBytes(
 *   - parameter
 *   - Screen
 *   - getId
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelDuplexHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPromise
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.common.CommonPongC2SPacket
 *  net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket
 *  net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket
 *  net.minecraft.network.packet.c2s.play.AcknowledgeChunksC2SPacket
 *  net.minecraft.network.packet.c2s.play.AcknowledgeReconfigurationC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket
 *  net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket$Mode
 *  net.minecraft.network.packet.c2s.play.ClientTickEndC2SPacket
 *  net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket
 *  net.minecraft.network.packet.c2s.play.HandSwingC2SPacket
 *  net.minecraft.network.packet.c2s.play.MessageAcknowledgmentC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 *  net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket
 *  net.minecraft.network.packet.c2s.query.QueryPingC2SPacket
 *  net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket
 *  net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket
 *  net.minecraft.network.packet.s2c.query.PingResultS2CPacket
 */
package orchard.internal;

import io.netty.channel.ChannelDuplexHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPromise;
import java.lang.invoke.LambdaMetafactory;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.channels.ClosedChannelException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.common.CommonPongC2SPacket;
import net.minecraft.network.packet.c2s.common.KeepAliveC2SPacket;
import net.minecraft.network.packet.c2s.common.ResourcePackStatusC2SPacket;
import net.minecraft.network.packet.c2s.play.AcknowledgeChunksC2SPacket;
import net.minecraft.network.packet.c2s.play.AcknowledgeReconfigurationC2SPacket;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientCommandC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientStatusC2SPacket;
import net.minecraft.network.packet.c2s.play.ClientTickEndC2SPacket;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;
import net.minecraft.network.packet.c2s.play.MessageAcknowledgmentC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInputC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.VehicleMoveC2SPacket;
import net.minecraft.network.packet.c2s.query.QueryPingC2SPacket;
import net.minecraft.network.packet.s2c.play.HealthUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerRespawnS2CPacket;
import net.minecraft.network.packet.s2c.query.PingResultS2CPacket;
import orchard.core.ClientEntrypoint;
import orchard.core.StringFactory;
import orchard.internal.IIIIlIl;
import orchard.internal.IIllIIll;
import orchard.internal.IIllIll;
import orchard.internal.IIllIllI;
import orchard.internal.IIlllIIIl;
import orchard.internal.IlIIIlIII;
import orchard.internal.IlIlllI;
import orchard.internal.IlllIIlI;
import orchard.internal.lI;
import orchard.internal.lIIIIIIl;
import orchard.internal.lIIIIll;
import orchard.internal.lIIllllI;
import orchard.internal.lIlllIlI;
import orchard.internal.lIllllII;
import orchard.internal.llIlIIIl;
import orchard.internal.lllIIlI;
import orchard.internal.lllIIlll;
import orchard.internal.lllIll;
import orchard.module.player.PingSpoof;

@Environment(value=EnvType.CLIENT)
public final class lIIIlIl
extends ChannelDuplexHandler {
    private static final int I = 256;
    private static volatile boolean l;
    private static volatile boolean II;
    private final AtomicBoolean Il;
    private static volatile long lI;
    private final AtomicLong ll;
    private final Set<IIllIll> III;
    private volatile long IIl;
    private final ConcurrentLinkedQueue<lI> IlI = new ConcurrentLinkedQueue();
    private static volatile int Ill;
    private final AtomicBoolean lII;
    private static final long lIl;
    private final ConcurrentLinkedQueue<IIllIll> llI;
    private static volatile boolean lll;
    private static final long IIII;
    private volatile long IIIl;
    private final ConcurrentLinkedQueue<IIllIIll> IIlI;
    private static final int IIll = 16;
    private static final Object IlII;
    private static volatile long IlIl;
    private static final long IllI;
    private volatile boolean Illl;
    private static final int lIII = 512;
    private volatile boolean lIIl;
    private static final long lIlI = 2500L;
    private volatile ChannelHandlerContext lIll;
    private static final long llII = 60000L;
    private static volatile int llIl;
    private final AtomicBoolean lllI;
    private volatile boolean llll;
    private final ConcurrentLinkedQueue<lIllllII> IIIII;
    private static volatile boolean IIIIl;
    private final AtomicBoolean IIIlI;
    private static final int IIIll = 10;
    private static volatile long IIlII;
    private static final Set<lIIIlIl> IIlIl;
    private static volatile boolean IIllI;
    private static final int IIlll = 32;
    private volatile long IlIII;
    private volatile int IlIIl = -1;
    private static long IlIlI;
    private final ConcurrentLinkedQueue<lI> IlIll = new ConcurrentLinkedQueue();
    private static volatile lIIIIIIl IllII;
    private static volatile llIlIIIl IllIl;
    private static volatile IlIIIlIII IlllI;
    private volatile boolean Illll;
    private static final int lIIII = 4;
    private final ConcurrentLinkedQueue<lllIIlll> lIIIl;
    private static volatile lllIll lIIlI;
    private volatile long lIIll;
    private static volatile boolean lIlII;
    private static final ConcurrentHashMap<lIlllIlI, Boolean> lIlIl;
    private volatile boolean lIllI;
    private static volatile lllIll lIlll;
    private static final int llIII = 1024;
    private final AtomicBoolean llIIl;
    private static volatile llIlIIIl llIlI;
    private final ConcurrentLinkedQueue<lIllllII> llIll;
    private static final int lllII = 1024;
    private static final int[] lllIl;
    private static final String[] llllI;
    private static final Object[] lllll;

    /*
     * Enabled aggressive block sorting
     */
    private void I(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) throws Exception {
        if (this.lIIl && !this.IlIll.isEmpty()) {
            this.lIllI = false;
            this.lllll(channelHandlerContext);
        }
        this.llIllI(channelHandlerContext, object, channelPromise);
        this.Illl = false;
        this.lIIl = false;
    }

    private void l(ChannelHandlerContext channelHandlerContext) {
        try {
            boolean bl;
            lIllllII lIllllII2 = this.llIll.peek();
            boolean bl2 = bl = lIllllII2 != null && lIllllII2.l == lllIll.Il ? this.IIIII(channelHandlerContext) : this.IllIlI(channelHandlerContext);
            if (bl && channelHandlerContext.channel().isOpen()) {
                channelHandlerContext.flush();
                this.lIIll = System.nanoTime();
            }
            this.llIIl.set(false);
            if (!this.llIll.isEmpty()) {
                this.lIlIII(channelHandlerContext, this.lIlI(this.llIll.peek()));
            } else {
                this.llll = false;
                lIIIlIl.lIlIlI();
            }
        }
        catch (Exception exception) {
            this.llIIl.set(false);
            throw exception;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void II() {
        Runnable runnable;
        ChannelHandlerContext channelHandlerContext = this.lIll;
        if (channelHandlerContext != null) {
            runnable = () -> {
                try {
                    IIllIll iIllIll;
                    this.lII.set(false);
                    boolean bl = false;
                    while ((iIllIll = this.llI.poll()) != null) {
                        this.III.remove(iIllIll);
                        bl |= this.IIllIl(channelHandlerContext, iIllIll.I, iIllIll.lI);
                        this.IIlllI(iIllIll);
                    }
                    if (bl && channelHandlerContext.channel().isOpen()) {
                        channelHandlerContext.flush();
                    }
                }
                catch (Exception exception) {
                    this.lII.set(false);
                }
            };
            if (!channelHandlerContext.executor().inEventLoop()) {
                channelHandlerContext.executor().execute(runnable);
                return;
            }
        } else {
            this.llIIll(new ClosedChannelException());
            this.lII.set(false);
            return;
        }
        runnable.run();
    }

    private void Il(ChannelHandlerContext channelHandlerContext) {
        try {
            if (lIIIlIl.IlIIII() == lIIIIIIl.II) {
                this.lIIIIl(channelHandlerContext);
                return;
            }
            IIllIll iIllIll = this.llI.peek();
            if (iIllIll == null) {
                this.lII.set(false);
                return;
            }
            long l2 = this.IlIl(iIllIll.Il, this.lIlII(iIllIll));
            if (l2 > 0L) {
                this.lII.set(false);
                this.IlII(channelHandlerContext, l2);
                return;
            }
            this.llI.poll();
            this.III.remove(iIllIll);
            if (this.IIllIl(channelHandlerContext, iIllIll.I, iIllIll.lI)) {
                channelHandlerContext.flush();
            }
            this.IIlllI(iIllIll);
            this.lII.set(false);
            if (!this.llI.isEmpty()) {
                this.IllIIl(channelHandlerContext);
            }
        }
        catch (Exception exception) {
            this.lII.set(false);
            throw exception;
        }
    }

    public static void lI(Predicate<Packet<?>> predicate, Consumer<Packet<?>> consumer) {
        lIIIlIl.IIlIIIl(predicate, consumer, packet -> false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean ll(Object object) {
        if (lIIllllI.llIlll() && lIIIlIl.IIlIlI(object) && !lIIllllI.lIIIlI(MinecraftClient.getInstance())) {
            return false;
        }
        if (IIIIl) {
            return true;
        }
        boolean bl = false;
        if (lll && object instanceof Packet) {
            Packet packet = (Packet)object;
            boolean bl2 = bl = lIlIl.remove(new lIlllIlI(packet)) != null;
            if (lIlIl.isEmpty()) {
                lll = false;
            }
        }
        if (bl) return true;
        if (object instanceof UpdateSelectedSlotC2SPacket) return true;
        if (lIIllllI.llIlI()) return true;
        if (IlIlllI.lIl()) return true;
        if (!this.IlIll.isEmpty()) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Integer III(Object object) {
        if (!(object instanceof Packet)) return null;
        Packet packet = (Packet)object;
        return lIIIlIl.lIllIl(packet);
    }

    /*
     * Enabled aggressive block sorting
     */
    private long IIl(Object object) {
        if (!(object instanceof Packet)) return 0L;
        Packet packet = (Packet)object;
        if (packet instanceof ResourcePackStatusC2SPacket) return 0L;
        long l2 = 0L;
        IIllIllI iIllIllI = IIllIllI.IIIII();
        if (iIllIllI.lII()) {
            if (iIllIllI.lIll() && !packet.transitionsNetworkState()) {
                l2 = Math.max(l2, iIllIllI.llll());
            }
        }
        PingSpoof pingSpoof = this.IIlIllI();
        if (!(packet instanceof KeepAliveC2SPacket)) return l2;
        if (pingSpoof == null) return l2;
        return Math.max(l2, pingSpoof.llII());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlI(lllIIlll lllIIlll2) {
        if (this.lIIIl.size() >= 512) {
            return false;
        }
        this.lIIIl.offer(lllIIlll2);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Ill(Object object) {
        IIllIllI iIllIllI = IIllIllI.IIIII();
        if (!iIllIllI.lII()) return false;
        if (!iIllIllI.I()) return false;
        if (!iIllIllI.IIll()) return false;
        if (iIllIllI.lIll()) return false;
        if (!(object instanceof Packet)) return false;
        Packet packet = (Packet)object;
        if (packet instanceof CommonPongC2SPacket) return true;
        if (packet instanceof KeepAliveC2SPacket) return true;
        if (packet instanceof AcknowledgeChunksC2SPacket) return true;
        if (packet instanceof AcknowledgeReconfigurationC2SPacket) return true;
        if (packet instanceof MessageAcknowledgmentC2SPacket) return true;
        if (lIIIlIl.llllIl(packet)) return true;
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean lIl(llIlIIIl llIlIIIl2, lllIll lllIll2) {
        if (llIlIIIl2 == null) {
            return false;
        }
        lllIll lllIll3 = lllIll2 == null ? lllIll.lI : lllIll2;
        Object object = IlII;
        synchronized (object) {
            if (IIllI) {
                return IllIl == llIlIIIl2 && lIIlI == lllIll3;
            }
            if (llIlI != null) {
                return false;
            }
            IllIl = llIlIIIl2;
            lIIlI = lllIll3;
            IIllI = true;
            return true;
        }
    }

    private void llI() {
        ChannelHandlerContext channelHandlerContext = this.lIll;
        if (channelHandlerContext == null) {
            this.IIllIIl(new ClosedChannelException());
            this.llIIl.set(false);
            this.lII.set(false);
            this.IIIlI.set(false);
            this.llll = false;
            return;
        }
        Runnable runnable = () -> {
            try {
                lI lI2;
                IIllIll iIllIll;
                lIllllII lIllllII2;
                this.llIIl.set(false);
                this.lII.set(false);
                this.IIIlI.set(false);
                ArrayList<lIIIIll> arrayList = new ArrayList<lIIIIll>();
                while ((lIllllII2 = this.llIll.poll()) != null) {
                    arrayList.add(new lIIIIll(lIllllII2.lI, lIllllII2.II, lIllllII2.Il, null));
                }
                while ((lIllllII2 = this.IIIII.poll()) != null) {
                    arrayList.add(new lIIIIll(lIllllII2.lI, lIllllII2.II, lIllllII2.Il, null));
                }
                while ((iIllIll = this.llI.poll()) != null) {
                    this.III.remove(iIllIll);
                    arrayList.add(new lIIIIll(iIllIll.I, iIllIll.lI, iIllIll.II, iIllIll));
                }
                while ((lI2 = this.IlI.poll()) != null) {
                    arrayList.add(new lIIIIll(lI2.l, lI2.I, lI2.Il, null));
                }
                arrayList.sort(Comparator.comparingLong(lIIIIll::I));
                for (lIIIIll lIIIIll2 : arrayList) {
                    this.IIllIl(channelHandlerContext, lIIIIll2.I, lIIIIll2.II);
                    if (lIIIIll2.l == null) continue;
                    this.IIlllI(lIIIIll2.l);
                }
                if (channelHandlerContext.channel().isOpen()) {
                    channelHandlerContext.flush();
                }
                this.llll = false;
                lIIIlIl.lIlIlI();
            }
            catch (Exception exception) {
                // empty catch block
            }
        };
        if (channelHandlerContext.executor().inEventLoop()) {
            runnable.run();
        } else {
            try {
                channelHandlerContext.executor().submit(runnable).sync();
            }
            catch (InterruptedException interruptedException) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIl(Throwable throwable) {
        lIIIlIl.IlIllI();
        IIlllIIIl.ll().IIl();
        this.IIllIIl(throwable);
        this.lIIIl.clear();
        this.IIlI.clear();
        this.III.clear();
        this.IlllIl();
        lIIIlIl.IIIlllI();
        this.IIIlI.set(false);
        this.lII.set(false);
        this.lllI.set(false);
        this.llIIl.set(false);
        this.Il.set(false);
        this.llll = false;
        this.IIIl = 0L;
        this.IlIII = 0L;
        this.lIIll = 0L;
        this.IIl = 0L;
        II = false;
        l = false;
        this.IlIIl = -1;
        lIIIlIl.IlIIlI();
        IIllIllI iIllIllI = IIllIllI.IIIII();
        iIllIllI.IlIlI(false);
        iIllIllI.IIIIl();
        if (ClientEntrypoint.lII() == null) return;
        lIIllllI.IlIlI();
        IlIlllI.l();
    }

    private void IIlI(ChannelHandlerContext channelHandlerContext) {
        try {
            lI lI2 = this.IlI.peek();
            if (lI2 == null) {
                this.IIIlI.set(false);
                return;
            }
            long l2 = this.IlIl(lI2.II, this.IllIll(lI2));
            if (l2 > 0L) {
                this.IIIlI.set(false);
                this.IIIll(channelHandlerContext, l2);
                return;
            }
            this.IlI.poll();
            if (this.IIllIl(channelHandlerContext, lI2.l, lI2.I)) {
                channelHandlerContext.flush();
                this.IIIl = System.nanoTime();
            }
            this.IIIlI.set(false);
            if (!this.IlI.isEmpty()) {
                this.lIIII(channelHandlerContext);
            }
        }
        catch (Exception exception) {
            this.IIIlI.set(false);
            throw exception;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean IIll() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return false;
        if (minecraftClient.currentScreen == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlII(ChannelHandlerContext channelHandlerContext, long l2) {
        if (!this.lII.compareAndSet(false, true)) {
            return;
        }
        Runnable runnable = () -> this.Il(channelHandlerContext);
        if (l2 > 0L) {
            channelHandlerContext.executor().schedule(runnable, Math.max(l2, lIl), TimeUnit.NANOSECONDS);
            return;
        }
        if (!channelHandlerContext.executor().inEventLoop()) {
            channelHandlerContext.executor().execute(runnable);
            return;
        }
        runnable.run();
    }

    private long IlIl(long l2, long l3) {
        if (l3 <= 0L) {
            return 0L;
        }
        return l2 + TimeUnit.MILLISECONDS.toNanos(l3) - System.nanoTime();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IllI() {
        lIIIlIl.IlIllI();
        this.IIllIIl(new ClosedChannelException());
        this.lIIIl.clear();
        this.IIlI.clear();
        this.III.clear();
        this.Illl = false;
        this.lIIl = false;
        this.Illll = false;
        this.lIllI = false;
        this.IIIlI.set(false);
        this.lII.set(false);
        this.lllI.set(false);
        this.llIIl.set(false);
        this.Il.set(false);
        this.llll = false;
        this.IIIl = 0L;
        this.IlIII = 0L;
        this.lIIll = 0L;
        this.IIl = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean lIII(Packet<?> packet, boolean bl, boolean bl2) {
        if (packet == null) return false;
        if (packet instanceof UpdateSelectedSlotC2SPacket) return true;
        if (bl) return true;
        if (!bl2) return false;
        return true;
    }

    private void lIIl(ConcurrentLinkedQueue<lI> concurrentLinkedQueue, Throwable throwable) {
        lI lI2;
        while ((lI2 = concurrentLinkedQueue.poll()) != null) {
            lI2.I.tryFailure(throwable);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private long lIlI(lIllllII lIllllII2) {
        long l2;
        block2: {
            if (lIllllII2 == null) break block2;
            if (lIllllII2.l == lllIll.Il) {
                l2 = IIII;
                return l2;
            }
        }
        l2 = IllI;
        return l2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean lIll(llIlIIIl llIlIIIl2, boolean bl) {
        if (llIlIIIl2 == null) {
            return false;
        }
        Iterator<lIIIlIl> iterator = IlII;
        synchronized (iterator) {
            if (!IIllI || IllIl != llIlIIIl2) {
                return false;
            }
            IIllI = false;
            IllIl = null;
            llIlI = llIlIIIl2;
            lIlll = lIIlI;
        }
        for (lIIIlIl lIIIlIl2 : IIlIl) {
            if (bl) {
                lIIIlIl2.llII();
                continue;
            }
            lIIIlIl2.llll();
        }
        lIIIlIl.lIlIlI();
        return true;
    }

    private void llII() {
        ChannelHandlerContext channelHandlerContext = this.lIll;
        if (channelHandlerContext == null) {
            this.IIlIIlI(this.llIll, new ClosedChannelException());
            this.llIIl.set(false);
            this.llll = false;
            lIIIlIl.lIlIlI();
            return;
        }
        Runnable runnable = () -> this.lIlll(channelHandlerContext);
        if (channelHandlerContext.executor().inEventLoop()) {
            runnable.run();
            return;
        }
        try {
            channelHandlerContext.executor().submit(runnable).sync();
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            this.IIlIIlI(this.llIll, interruptedException);
            this.llIIl.set(false);
            this.llll = false;
            lIIIlIl.lIlIlI();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIl(ChannelHandlerContext channelHandlerContext, long l2, lllIll lllIll2, long l3) {
        if (!this.llIIl.compareAndSet(false, true)) {
            return;
        }
        Runnable runnable = () -> this.llIlII(channelHandlerContext, l2, lllIll2);
        if (l3 > 0L) {
            channelHandlerContext.executor().schedule(runnable, Math.max(l3, lIl), TimeUnit.NANOSECONDS);
            return;
        }
        if (channelHandlerContext.executor().inEventLoop()) {
            runnable.run();
            return;
        }
        channelHandlerContext.executor().execute(runnable);
    }

    public static int lllI() {
        return Ill;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llll() {
        ChannelHandlerContext channelHandlerContext;
        block0: {
            channelHandlerContext = this.lIll;
            if (channelHandlerContext == null) break block0;
        }
        this.IIlIIlI(this.llIll, new ClosedChannelException());
        this.llll = false;
        lIIIlIl.lIlIlI();
        return;
        this.llll = this.llIll.peek() != null && this.llIll.peek().l == lllIll.Il;
        this.lIlIII(channelHandlerContext, 0L);
    }

    /*
     * Unable to fully structure code
     */
    private boolean IIIII(ChannelHandlerContext var1_1) {
        block17: {
            block23: {
                block16: {
                    block21: {
                        block20: {
                            block22: {
                                block14: {
                                    block19: {
                                        block15: {
                                            block13: {
                                                block18: {
                                                    block12: {
                                                        break block21;
lbl1:
                                                        // 1 sources

                                                        while (true) {
                                                            var7_7 = var4_4.iterator();
                                                            ** GOTO lbl15
                                                            break;
                                                        }
lbl4:
                                                        // 1 sources

                                                        while (true) {
                                                            if (!(var5_5.lI instanceof PlayerInputC2SPacket)) break block12;
                                                            break block13;
                                                            break;
                                                        }
lbl7:
                                                        // 1 sources

                                                        while (true) {
                                                            ++var2_2;
                                                            break block14;
                                                            break;
                                                        }
lbl10:
                                                        // 1 sources

                                                        while (true) {
                                                            var4_4 = new ArrayList<lIllllII>(32);
                                                            break block15;
                                                            break;
                                                        }
lbl13:
                                                        // 1 sources

                                                        while (true) {
                                                            var6_6 |= this.IIllIl(var1_1, var8_8.lI, var8_8.II);
lbl15:
                                                            // 2 sources

                                                            if (!var7_7.hasNext()) break block16;
                                                            break block17;
                                                            break;
                                                        }
lbl17:
                                                        // 1 sources

                                                        while (true) {
                                                            var5_5 = this.llIll.peek();
                                                            if (var5_5 == null) break block18;
                                                            break block19;
                                                            break;
                                                        }
lbl21:
                                                        // 1 sources

                                                        while (true) {
                                                            if (!(var5_5.lI instanceof ClientTickEndC2SPacket)) break block15;
                                                            break block18;
                                                            break;
                                                        }
lbl24:
                                                        // 1 sources

                                                        while (true) {
                                                            var3_3 = true;
                                                            break block12;
                                                            break;
                                                        }
lbl27:
                                                        // 2 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                    }
lbl30:
                                                    // 2 sources

                                                    while (true) {
                                                        break block20;
                                                        break;
                                                    }
                                                }
lbl33:
                                                // 4 sources

                                                while (true) {
                                                    var6_6 = false;
                                                    ** continue;
                                                    break;
                                                }
                                            }
                                            ** while (!var3_3)
lbl38:
                                            // 1 sources

                                            break block22;
                                        }
lbl40:
                                        // 3 sources

                                        while (true) {
                                            if (var2_2 >= 32) ** GOTO lbl33
                                            ** continue;
                                            break;
                                        }
                                    }
                                    if (var5_5.l == lllIll.Il) ** GOTO lbl27
                                    break block23;
                                }
                                ** while (var5_5.l != lllIll.Il)
lbl48:
                                // 1 sources

                                ** while (true)
                            }
                            var5_5.II.trySuccess();
                            ** GOTO lbl40
                        }
                        var4_4.add(var5_5);
                        if (var5_5.l == lllIll.Il) ** break;
                        ** while (true)
                        ** while (true)
                    }
                    var2_2 = 0;
                    var3_3 = false;
                    ** while (true)
                    var5_5 = this.llIll.poll();
                    ** while (var5_5 != null)
lbl65:
                    // 1 sources

                    ** GOTO lbl33
                }
                return var6_6;
            }
            if (var2_2 > 0) ** break;
            ** while (true)
            ** while (true)
        }
        var8_8 = (lIllllII)var7_7.next();
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlI(long l2, lllIll lllIll2) {
        lIllllII lIllllII2 = this.llIll.peek();
        if (lIllllII2 == null) return false;
        if (lllIll2 != null) {
            if (lIllllII2.l != lllIll2) return false;
        }
        if (lIllllII2.I <= l2) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIll(ChannelHandlerContext channelHandlerContext, long l2) {
        if (!this.IIIlI.compareAndSet(false, true)) {
            return;
        }
        Runnable runnable = () -> this.IIlI(channelHandlerContext);
        if (l2 > 0L) {
            channelHandlerContext.executor().schedule(runnable, Math.max(l2, lIl), TimeUnit.NANOSECONDS);
            return;
        }
        if (!channelHandlerContext.executor().inEventLoop()) {
            channelHandlerContext.executor().execute(runnable);
            return;
        }
        runnable.run();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlII(IlllIIlI illlIIlI) {
        ChannelHandlerContext channelHandlerContext;
        block5: {
            Runnable runnable;
            block7: {
                block6: {
                    block3: {
                        block4: {
                            block2: {
                                channelHandlerContext = this.lIll;
                                if (channelHandlerContext != null) break block2;
                                if (!illlIIlI.Il()) break block3;
                                break block4;
                            }
                            if (!illlIIlI.Il()) break block5;
                            runnable = () -> this.lllIlI(channelHandlerContext);
                            if (!channelHandlerContext.executor().inEventLoop()) break block6;
                            break block7;
                        }
                        this.IIlIIlI(this.IIIII, new ClosedChannelException());
                    }
                    if (!illlIIlI.I()) return;
                    this.IIlI.clear();
                    return;
                }
                channelHandlerContext.executor().execute(runnable);
                break block5;
            }
            runnable.run();
        }
        if (illlIIlI.Il() && !this.IlI.isEmpty()) {
            this.IIIlI.set(false);
            this.lIIII(channelHandlerContext);
        }
        if (illlIIlI.I()) {
            this.IlIII();
        }
        if (!illlIIlI.I()) return;
        if (this.lIIIl.isEmpty()) return;
        this.lllI.set(false);
        this.IIIllII(channelHandlerContext);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IIlIl(llIlIIIl llIlIIIl2) {
        if (llIlIIIl2 == null) return false;
        if (!IIllI) return false;
        if (IllIl != llIlIIIl2) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIllI(ChannelHandlerContext channelHandlerContext) {
        IIllIllI iIllIllI = IIllIllI.IIIII();
        if (lIlII) return;
        if (iIllIllI.lII() || iIllIllI.IIlI()) {
            lIIIlIl.IIIllll();
            return;
        }
    }

    private lIllllII IIlll(Object object, ChannelPromise channelPromise, lllIll lllIll2) {
        return new lIllllII(object, channelPromise, lllIll2, System.nanoTime(), this.ll.incrementAndGet());
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIII() {
        ChannelHandlerContext channelHandlerContext = this.lIll;
        if (channelHandlerContext != null) {
            this.IllllI(channelHandlerContext, 0L);
            return;
        }
        this.IIlI.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int IlIIl() {
        long l2 = 0L;
        for (lIIIlIl lIIIlIl2 : IIlIl) {
            l2 += (long)lIIIlIl2.llIll.size();
        }
        if (l2 > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        int n = (int)l2;
        return n;
    }

    public static void IlIlI() {
        IlllIIlI illlIIlI = IIllIllI.IIIII().IIIIl();
        try {
            for (lIIIlIl lIIIlIl2 : IIlIl) {
                lIIIlIl2.llIll(illlIIlI);
            }
        }
        finally {
            lIlII = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IlIll(Object object, lllIll lllIll2) {
        if (lllIll2 == null) return false;
        if (!(object instanceof Packet)) return false;
        Packet packet = (Packet)object;
        if (packet instanceof ResourcePackStatusC2SPacket) return false;
        if (lllIll2 == lllIll.lI) {
            return true;
        }
        if (lllIll2 != lllIll.II) {
            if (lllIll2 == lllIll.Il) {
                return lIIIlIl.lIlIIl(packet);
            }
        } else {
            if (packet instanceof PlayerMoveC2SPacket) return true;
            if (packet instanceof VehicleMoveC2SPacket) return true;
            if (packet instanceof ClientTickEndC2SPacket) return true;
            return false;
        }
        String string = packet.getClass().getName();
        if (string.contains("PlayerMoveC2SPacket")) return true;
        if (string.contains(StringFactory.IIl("rpFclRpbVTGYHpp6XeDun5ufUYg="))) return true;
        if (string.contains(StringFactory.IIl("qJhVhRxFeRKHHYt6XeDun5ufUYg="))) return true;
        if (string.contains(StringFactory.IIl("u5hdmRdDcxOaBZ5XC/CMraiVV5ccQw=="))) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IllIl() {
        Iterator<lIIIlIl> iterator = IIlIl.iterator();
        while (iterator.hasNext()) {
            lIIIlIl lIIIlIl2 = iterator.next();
            lIIIlIl2.II();
        }
        return;
    }

    private static Integer IlllI(Packet<?> packet, String ... stringArray) {
        for (String string : stringArray) {
            Object object;
            AccessibleObject accessibleObject;
            try {
                accessibleObject = packet.getClass().getMethod(string, new Class[0]);
                object = ((Method)accessibleObject).invoke(packet, new Object[0]);
                if (object instanceof Number) {
                    Number number = (Number)object;
                    return number.intValue();
                }
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                // empty catch block
            }
            try {
                accessibleObject = packet.getClass().getDeclaredField(string);
                ((Field)accessibleObject).setAccessible(true);
                object = ((Field)accessibleObject).get(packet);
                if (!(object instanceof Number)) continue;
                Number number = (Number)object;
                return number.intValue();
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                // empty catch block
            }
        }
        return null;
    }

    private void lIIII(ChannelHandlerContext channelHandlerContext) {
        this.IIIll(channelHandlerContext, 0L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIIl(ChannelHandlerContext channelHandlerContext, long l2) {
        if (!this.lllI.compareAndSet(false, true)) {
            return;
        }
        Runnable runnable = () -> this.IIIIlII(channelHandlerContext);
        if (l2 > 0L) {
            channelHandlerContext.executor().schedule(runnable, Math.max(l2, lIl), TimeUnit.NANOSECONDS);
            return;
        }
        if (!channelHandlerContext.executor().inEventLoop()) {
            channelHandlerContext.executor().execute(runnable);
            return;
        }
        runnable.run();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIll(Object object) {
        if (!(object instanceof Packet)) return false;
        Packet packet = (Packet)object;
        if (packet instanceof ResourcePackStatusC2SPacket) return false;
        IIllIllI iIllIllI = IIllIllI.IIIII();
        if (!iIllIllI.lII()) return false;
        if (!iIllIllI.I()) return false;
        if (!iIllIllI.lIll()) return false;
        if (packet.transitionsNetworkState()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private long lIlII(IIllIll iIllIll) {
        long l2 = this.IIlIlII(iIllIll.I);
        if (l2 > 0L) {
            if (this.llI.size() > 256) {
                return 0L;
            }
            if (lIIIlIl.IlIIII() == lIIIIIIl.II && this.III.contains(iIllIll)) {
                l2 = Math.min(60000L, l2 + lIIIlIl.lIIlll());
            }
        } else {
            return 0L;
        }
        long l3 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - iIllIll.Il);
        if (l3 < 60000L) return Math.min(l2, 60000L);
        return l3;
    }

    public static void lIlIl() {
        II = true;
        l = true;
    }

    public static long lIllI() {
        return IlIlI;
    }

    private void lIlll(ChannelHandlerContext channelHandlerContext) {
        try {
            lIllllII lIllllII2;
            boolean bl = false;
            ArrayList<lIllllII> arrayList = new ArrayList<lIllllII>();
            this.llIIl.set(false);
            while ((lIllllII2 = this.llIll.poll()) != null) {
                if (lIllllII2.l == lllIll.Il && lIllllII2.lI instanceof PlayerInputC2SPacket) {
                    if (bl) {
                        lIllllII2.II.trySuccess();
                        continue;
                    }
                    bl = true;
                }
                arrayList.add(lIllllII2);
                if (lIllllII2.l != lllIll.Il || !(lIllllII2.lI instanceof ClientTickEndC2SPacket)) continue;
                bl = false;
            }
            boolean bl2 = false;
            for (lIllllII lIllllII3 : arrayList) {
                bl2 |= this.IIllIl(channelHandlerContext, lIllllII3.lI, lIllllII3.II);
            }
            if (bl2 && channelHandlerContext.channel().isOpen()) {
                channelHandlerContext.flush();
                this.lIIll = System.nanoTime();
            }
            this.llll = false;
            lIIIlIl.lIlIlI();
        }
        catch (Exception exception) {
            this.llIIl.set(false);
            throw exception;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void llIIl(Packet<?> packet) {
        if (!lIIllllI.llIlll() || !lIIIlIl.IIlIlI(packet) || lIIllllI.lIIIlI(MinecraftClient.getInstance())) {
            if (ClientEntrypoint.lII() == null) return;
            if (lIIIlIl.lIII(packet, lIIllllI.llIlI(), IlIlllI.lIl())) {
                lIlIl.put(new lIlllIlI(packet), Boolean.TRUE);
                lll = true;
                return;
            }
            return;
        }
    }

    public static long llIlI() {
        return IlIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIll(IlllIIlI illlIIlI) {
        ChannelHandlerContext channelHandlerContext = this.lIll;
        if (channelHandlerContext != null) {
            Runnable runnable = () -> {
                if (illlIIlI.Il()) {
                    this.lllIlI(channelHandlerContext);
                }
                if (!illlIIlI.I()) return;
                this.Il.set(false);
                this.IIIlIl(channelHandlerContext);
            };
            if (channelHandlerContext.executor().inEventLoop()) {
                runnable.run();
                return;
            }
            channelHandlerContext.executor().submit(runnable).syncUninterruptibly();
            return;
        }
        if (illlIIlI.Il()) {
            this.IIlIIlI(this.IIIII, new ClosedChannelException());
        }
        if (!illlIIlI.I()) return;
        this.IIlI.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    private long lllII(Object object) {
        if (!(object instanceof Packet)) return 0L;
        Packet packet = (Packet)object;
        IIllIllI iIllIllI = IIllIllI.IIIII();
        if (!iIllIllI.lII()) return 0L;
        if (!iIllIllI.IIll()) return 0L;
        if (!packet.transitionsNetworkState()) return Math.max(0L, iIllIllI.IIIll());
        return 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lllIl() {
        Iterator<lIIIlIl> iterator = IIlIl.iterator();
        while (iterator.hasNext()) {
            lIIIlIl lIIIlIl2 = iterator.next();
            lIIIlIl2.llI();
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llllI(IIllIIll iIllIIll) {
        if (this.IIlI.size() >= 1024) {
            return false;
        }
        this.IIlI.offer(iIllIIll);
        if (iIllIIll == null) return true;
        if (iIllIIll.I() == null) return true;
        lIIIlIl.IIlllII(iIllIIll.I());
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllll(ChannelHandlerContext channelHandlerContext) throws Exception {
        lI lI2;
        while ((lI2 = this.IlIll.poll()) != null) {
            this.llIllI(channelHandlerContext, lI2.l(), lI2.II());
            if (!lIIIlIl.IIlIlI(lI2.l())) continue;
            this.Illl = true;
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 5840;
        String string = "\u2b8c\u2b96\u2bed\u2b79\u2bb7\u2be0\u2bd7\u2bfc\u2bf1\u2b0b\u2b41\u2b5a\u2b16\u2b39\u2b9a\u2be4\u2ba4\u2b9e\u2bf9\u2b43\u2b6f\u2bbc\u2b1d\u2bb6\u2b98\u2ba4\u2bd9\u2b9b\u8755\u8776\u8719\u8796\u8769\u873a\u8705\u8702\u871b\u87d7\u8793\u879b\u87c0\u87f1\u8747\u8744\u8776\u876e\u8737\u878a\u87b5\u8709\u87fd\u8758\u8746\u8766\u8759\u8741\u3bce\u3bd4\u3baf\u3b3b\u3bf5\u3ba2\u3b95\u3bbe\u3bb0\u3b49\u3b07\u3b12\u3b58\u3b40\u3bdb\u3bdc\u3bee\u3bf6\u3baf\u3b12\u3b2d\u3b91\u3b65\u3bc0\u3bde\u3bfe\u3bc1\u3bd9\u606b\u600a\u600e\u60a8\u6051\u6003\u6028\u601d\u6017\u60c2\u60a2\u609a\u60f3\u60e2\u603b\u6013\u6054\u601d\u6009\u608b\u6090\u6064\u60d8\u6051\u607c\u6033\u6064\u6026\u6053\u6054\u6013\u6087\u4154\u4131\u4139\u41b0\u416a\u4138\u410f\u4138\u3e32\u3e53\u3e57\u3ef1\u3e0b\u3e70\u3e5f\u3e6b\u3e75\u3ea1\u3efb\u3ee6\uff20\uff45\uff41\uffe1\uff1a\uff5d\uff7b\uff5e\uff6d\uffb7\uff90\ufff0\uffba\uffa6\uff7c\uff39\u18d0\u18d8\u18ab\u1832\u18ec\u18be\u1895\u18a0\u1891\u1870\u1866\u1809\u1843\u183d\u1882\u18c0\u040c\u046d\u0469\u04c9\u0431\u044e\u0453\u0411\u0446\u048f\u04c1\u04c8\u0494\u0495\u0419\u0448\u0420\u041b\u0469\u04ec\u04e8\u0457\u04e4\u0401\uc9f4\uc9e9\uc9cb\uc918\uc9ce\uc9b5\uc9b8\uc983\uc9be\uc964\uc91c\uc933\uc97e\uc96e\uc9a7\uc9b6\uc9c3\uc9ca\uc9ac\uc914\uc914\uc9fd\uc944\uc9de\uc9e1\uc9d0\uc9ab\uc998\uc9cb\uc9d4\uc9f8\uc945\uc9ea\uc9f2\uc9c8\uc91d\uc9f3\uc99c\uc9e7\uc980\uc9d8\uc967\uc94c\uc95a\u1b8e\u1b93\u1bb1\u1b62\u1bb4\u1bcf\u1bc2\u1bf9\u1bc4\u1b1e\u1b66\u1b49\u1b04\u1b14\u1bdd\u1bcc\u1bb9\u1bb0\u1bd6\u1b6e\u1b6e\u1b87\u1b3e\u1ba4\u1b9b\u1baa\u1bd1\u1be2\u1bb1\u1bae\u1b82\u1b3f\u1b95\u1bae\u1bc7\u1b70\u1b82\u1bf6\u1bd0\u1bf4\u1ba1\u1b06\u1b40\u1b79\u1b66\u1b1b\u1bab\u1be2\u1bb6\u1b92\u1bc0\u1b64\u1b42\u1bba\u1b1a\u1ba3\u1ba7\u1ba6\u1b82\u1b9e\u6d31\u6d3e\u6d7b\u6ddf\u6d0d\u6d72\u6d7f\u6d53\u6d79\u6db5\u6d84\u6df5\u6dab\u6dd6\u6d13\u6d47\u6d0b\u6d27\u6d3e\u6dff\u6dd4\u6d2e\u6dc1\u6d06\u6d24\u6d07\u6d15\u6d50\u6d3d\u6d39\u6d3c\u6d97\u6d35\u6d13\u6d50\u6df4\u6d32\u6d6d\u6d65\u6d4a\uf86d\uf80c\uf814\uf890\uf851\uf805\uf810\uf805\uf82b\uf8fe\uf8a4\uf8a7\uf8f3\uf889\uf87f\uf801\uf841\uf87b\uf81c\uf8a6\uf88a\uf859\uf8f8\uf853\uf87d\uf841\uf83c\uf87e\u8991\u89f1\u89bc\u8910\u89e9\u89bd\u89a0\u89be\u8992\u8968\u891a\u8978\u1920\u193a\u195d\u19e2\u191e\u1964\u196c\u1950\u1962\u198c\u19db\u19e3\u19bd\u19c2\u1913\u1967\u191f\u190a\u1938\u19b4\u8bfb\u8be1\u8bc3\u8b39\u8bc5\u8bbc\u8bac\u8b9e\u8bb1\u8b59\u8b14\u8b0d\u8b6d\u8b60\u8bed\u8b93\u8bd3\u8be9\u8b8e\u8b34\u8b18\u8bcb\u8b6a\u8bc1\u8bef\u8bd3\u8bae\u8bec\uf25e\uf25c\uf219\uf2a2\uf27b\uf22a\uf237\uf223\uf20f\uf2d1\uf2a9\uf294\u5dd5\u5dc5\u5d87\u5d51\u12ed\u1297\u12bd\u1210\u12d3\u128e\u12b9\u1282\u12bc\u1275\u1237\u1235\u1264\u126f\u12e3\u129a\u647a\u6400\u642a\u6487\u6442\u6409\u6476\u646e\u16d4\u16ce\u168b\u162f\u16eb\u1692\u168f\u16a6\u1687\u1653\u1619\u1606\u164e\u1649\u16c5\u16bc\u16f8\u16b1\u16bd\u1631\u1634\u168a\u1638\u16ee\u16d7\u16f7\u16e9\u16b5\u16ff\u16a9\u16cc\u164b\u16c8\u16f3\u168c\u164a";
        char[] cArray = "\u16cc\u16cc\u16cc\u16f0\u16d8\u16dc\u16c0\u16c0\u16c8\u16fc\u16ec\u16f8\u16cc\u16dc\u16c4\u16cc\u16dc\u16d4\u16c0\u16d8\u16f4".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                llllI = stringArray;
                lllll = new Object[stringArray.length];
                int n6 = -1889989336;
                byte[] byArray = "\u00e8_\t\u00d5.\u0005\u0084\u00e6\u0006\u009a\u00bc\u0094k\u00b9G\u00d3\u00ff\u000f\"\u0085\u00a3\u0092K\u00cap\u00aa\u00b6\u00bd\u00f5Pd\u00c6\u00a4\u008c\u00f5W\u0010U\u00de)\u00b5\u00a5\u0098\u0081\u0089\u00a5\u001e\u0099-!\u00a3T\u0089\u001c\u00b7V".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                lllIl = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    lIIIlIl.lllIl[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                lIl = TimeUnit.MILLISECONDS.toNanos(1L);
                IllI = TimeUnit.MILLISECONDS.toNanos(12L);
                IIII = TimeUnit.MILLISECONDS.toNanos(25L);
                IIlIl = ConcurrentHashMap.newKeySet();
                IlII = new Object();
                IIllI = false;
                II = false;
                l = false;
                lIlII = false;
                lIIlI = lllIll.lI;
                IllII = lIIIIIIl.l;
                lI = 500L;
                lIlIl = new ConcurrentHashMap();
                return;
            }
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
    }

    static void IIIIII() {
        lIIIlIl.IlIIlI();
    }

    private boolean IIIIlI(lI lI2) {
        if (this.IlI.size() >= 4) {
            return false;
        }
        this.IlI.offer(lI2);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIIIll() {
        Iterator<lIIIlIl> iterator = IIlIl.iterator();
        while (iterator.hasNext()) {
            lIIIlIl lIIIlIl2 = iterator.next();
            lIIIlIl2.lIIlII();
        }
        return;
    }

    static void IIIlII(boolean bl) {
        IIIIl = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlIl(ChannelHandlerContext channelHandlerContext) {
        while (true) {
            IIllIIll iIllIIll;
            if ((iIllIIll = this.IIlI.poll()) == null) {
                this.Il.set(false);
                return;
            }
            if (!channelHandlerContext.channel().isOpen()) continue;
            lIIIlIl.llIIIl(channelHandlerContext, iIllIIll.I);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIIllI(long l2) {
        long l3 = System.currentTimeMillis() - Math.max(0L, l2);
        Iterator<lIIIlIl> iterator = IIlIl.iterator();
        while (iterator.hasNext()) {
            lIIIlIl lIIIlIl2 = iterator.next();
            lIIIlIl2.IIlIIII(l3);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIIlll(Object object) {
        if (object == null) {
            return false;
        }
        String string = object.getClass().getSimpleName();
        if (string.contains("Screen")) return true;
        if (string.contains(StringFactory.IIl("u5hdnxJkXBOD"))) return true;
        if (string.contains(StringFactory.IIl("q5hbiCxHVB2DDQ=="))) return true;
        if (string.contains(StringFactory.IIl("sZpCmRdDXw6OO816"))) return true;
        if (string.contains(StringFactory.IIl("u5hbjxx/URKTBJpdPNDMm52a"))) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIII(Object object) {
        if (!(object instanceof Packet)) return false;
        Packet packet = (Packet)object;
        IIllIllI iIllIllI = IIllIllI.IIIII();
        if (!iIllIllI.lII()) return false;
        if (!iIllIllI.I()) return false;
        if (!iIllIllI.IIll()) return false;
        if (packet.transitionsNetworkState()) {
            return false;
        }
        if (!iIllIllI.IIlII()) return true;
        if (lIIIlIl.IIlIIl(packet)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void write(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) throws Exception {
        block14: {
            block12: {
                block13: {
                    block11: {
                        block9: {
                            block10: {
                                block8: {
                                    channelPromise = this.lllIII(channelHandlerContext, object, channelPromise);
                                    if (lIIIlIl.llllII(object)) break block8;
                                    if (!(object instanceof ClickSlotC2SPacket) && !(object instanceof CloseHandledScreenC2SPacket)) break block9;
                                    break block10;
                                }
                                this.IIIl(new CancellationException("Discarded across player respawn"));
                                this.IIIlIlI(channelHandlerContext, object, channelPromise);
                                return;
                            }
                            if (lIIIlIl.IIll()) {
                                this.Illll = false;
                                this.lIllI = false;
                                this.Illl = false;
                                if (!this.IlIll.isEmpty()) {
                                    this.lllll(channelHandlerContext);
                                }
                            }
                        }
                        if (object instanceof PlayerMoveC2SPacket) {
                            this.I(channelHandlerContext, object, channelPromise);
                            this.Illll = true;
                            this.lIllI = true;
                            return;
                        }
                        if (object instanceof ClientTickEndC2SPacket) {
                            this.llIlIl(channelHandlerContext, object, channelPromise);
                            return;
                        }
                        if ((this.Illll || this.lIllI) && lIIIlIl.IIlIlI(object) && this.ll(object)) {
                            this.IIIlIll(object, channelPromise);
                            return;
                        }
                        if (!this.IlIll.isEmpty() && !lIIIlIl.lIllII(object)) break block11;
                        if (!(object instanceof UpdateSelectedSlotC2SPacket) || !this.Illl && !this.Illll && !this.lIllI) break block12;
                        break block13;
                    }
                    this.IIIlIll(object, channelPromise);
                    return;
                }
                if (this.ll(object)) break block14;
            }
            this.llIllI(channelHandlerContext, object, channelPromise);
            if (!lIIIlIl.IIlIlI(object)) return;
            this.Illl = true;
            return;
        }
        this.IIIlIll(object, channelPromise);
    }

    private static boolean IIlIIl(Packet<?> packet) {
        if (packet == null) {
            return false;
        }
        IlIIIlIII ilIIIlIII = IlllI;
        if (ilIIIlIII == null) {
            return false;
        }
        try {
            return ilIIIlIII.l().test(packet);
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIlIlI(Object object) {
        if (object instanceof PlayerInteractEntityC2SPacket) return true;
        if (object instanceof PlayerInteractBlockC2SPacket) return true;
        if (object instanceof PlayerInteractItemC2SPacket) return true;
        if (object instanceof PlayerActionC2SPacket) return true;
        if (object instanceof HandSwingC2SPacket) return true;
        if (object instanceof ClientCommandC2SPacket) return true;
        if (object instanceof ClientStatusC2SPacket) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIlIll(Packet<?> packet) {
        if (packet instanceof UpdateSelectedSlotC2SPacket) return true;
        if (packet instanceof PlayerMoveC2SPacket) {
            return true;
        }
        if (!(packet instanceof PlayerInteractEntityC2SPacket)) {
            return false;
        }
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        lllIIlI lllIIlI2 = clientEntrypoint.IlI();
        lllIIlI lllIIlI3 = lllIIlI2;
        if (lllIIlI3 == null) return false;
        if (!lllIIlI3.IIlllII(packet)) return false;
        return true;
    }

    private static /* synthetic */ void IIllII(lIIIlIl lIIIlIl2, ChannelHandlerContext channelHandlerContext) {
        lIIIlIl2.lllIll(channelHandlerContext);
    }

    private boolean IIllIl(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) {
        ChannelPromise channelPromise2;
        if (channelHandlerContext == null || !channelHandlerContext.channel().isOpen()) {
            channelPromise.tryFailure((Throwable)new ClosedChannelException());
            return false;
        }
        if (object instanceof UpdateSelectedSlotC2SPacket) {
            channelPromise2 = (UpdateSelectedSlotC2SPacket)object;
            int n = channelPromise2.getSelectedSlot();
            if (n == this.IlIIl) {
                channelPromise.trySuccess();
                return true;
            }
            this.IlIIl = n;
        }
        channelPromise2 = channelPromise;
        if (object instanceof Packet) {
            Packet packet = (Packet)object;
            boolean bl = packet instanceof QueryPingC2SPacket;
            boolean bl2 = lIIIlIl.IIlIll(packet);
            if (bl || bl2) {
                channelPromise2 = channelPromise.isVoid() ? channelHandlerContext.newPromise() : channelPromise;
                channelPromise2.addListener(future -> {
                    if (!future.isSuccess()) {
                        return;
                    }
                    if (bl) {
                        this.IIlIlIl(packet);
                    }
                    if (!bl2) return;
                    this.lIlIll(packet);
                });
            }
        }
        try {
            channelHandlerContext.write(object, channelPromise2);
            return true;
        }
        catch (Error | RuntimeException throwable) {
            channelPromise2.tryFailure(throwable);
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlllI(IIllIll iIllIll) {
        if (iIllIll == null) {
            return;
        }
        long l2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - iIllIll.I());
        long l3 = IlIl;
        IlIl = l3 > 0L ? (long)((double)l3 * 0.85 + (double)l2 * 0.15) : l2;
        IIlII = System.currentTimeMillis();
        Ill = this.llI.size();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static boolean IIllll() {
        if (llIlI != null && lIlll == lllIll.Il) {
            return true;
        }
        Iterator<lIIIlIl> iterator = IIlIl.iterator();
        boolean bl = true;
        while (true) {
            Iterator<lIllllII> iterator2;
            if (!bl || (bl = false) || !true) {
                if (iterator2.hasNext()) {
                    lIllllII lIllllII2 = iterator2.next();
                    if (lIllllII2.l != lllIll.Il) continue;
                    return true;
                }
            }
            if (!iterator.hasNext()) return false;
            lIIIlIl lIIIlIl2 = iterator.next();
            if (lIIIlIl2.llll) {
                return true;
            }
            iterator2 = lIIIlIl2.llIll.iterator();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        Packet packet;
        if (lIIIlIl.IlIIll(object)) {
            this.IIIl(new CancellationException(StringFactory.IIl("vJ1HnxhFVBmTSJ5aHdzNjdiEWJ0AUkJcmwGZXAzK3ZKd1ECOGFlDFYMBkFc=")));
            lIIIlIl.llIIIl(channelHandlerContext, object);
            return;
        }
        if (lIIIlIl.IIIlll(object)) {
            lIIIlIl.llIIIl(channelHandlerContext, object);
            return;
        }
        if (object instanceof Packet && lIIIlIl.IlIlll(packet = (Packet)object)) {
            this.IIIlIl(channelHandlerContext);
        }
        if (object instanceof Packet && IIllIllI.l(packet = (Packet)object) && !lIIIlIl.IIlIIl(packet)) {
            lIIIlIl.llIIIl(channelHandlerContext, object);
            return;
        }
        if (lIlII) {
            if (this.llllI(new IIllIIll(object, System.currentTimeMillis()))) return;
            this.IIIlIl(channelHandlerContext);
            lIIIlIl.llIIIl(channelHandlerContext, object);
            return;
        }
        this.IIllI(channelHandlerContext);
        if (this.IIlIII(object)) {
            if (this.llllI(new IIllIIll(object, System.currentTimeMillis()))) return;
            this.IIIlIl(channelHandlerContext);
            lIIIlIl.llIIIl(channelHandlerContext, object);
            return;
        }
        if (II) {
            if (this.llllI(new IIllIIll(object, System.currentTimeMillis()))) return;
            this.IIIlIl(channelHandlerContext);
            lIIIlIl.llIIIl(channelHandlerContext, object);
            return;
        }
        long l2 = this.lllII(object);
        if (l2 <= 0L) {
            lIIIlIl.llIIIl(channelHandlerContext, object);
            return;
        }
        if (object instanceof PingResultS2CPacket) {
            PingResultS2CPacket pingResultS2CPacket = (PingResultS2CPacket)object;
            IIllIllI.IIIII().IlIll(pingResultS2CPacket.startTime(), l2);
        }
        if (this.IlI(new lllIIlll(object, System.nanoTime()))) {
            this.IIIllII(channelHandlerContext);
            return;
        }
        lIIIlIl.llIIIl(channelHandlerContext, object);
    }

    public static lIIIIIIl IlIIII() {
        return IllII;
    }

    public static boolean IlIIIl() {
        return IIllI;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void IlIIlI() {
        Object object = IlII;
        synchronized (object) {
            IIllI = false;
            IllIl = null;
            llIlI = null;
            lIlll = null;
            lIIlI = lllIll.lI;
            lIlII = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IlIIll(Object object) {
        if (object instanceof PlayerRespawnS2CPacket) return true;
        if (!(object instanceof HealthUpdateS2CPacket)) return false;
        HealthUpdateS2CPacket healthUpdateS2CPacket = (HealthUpdateS2CPacket)object;
        if (!(healthUpdateS2CPacket.getHealth() <= 0.0f)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IlIlII(Runnable runnable) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null && !minecraftClient.isOnThread()) {
            minecraftClient.execute(runnable);
            return;
        }
        runnable.run();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIlIl(int n) {
        Iterator<IIllIll> iterator = this.llI.iterator();
        while (iterator.hasNext()) {
            IIllIll iIllIll = iterator.next();
            if (iIllIll.l >= n) continue;
            this.III.add(iIllIll);
        }
        return;
    }

    public static void IlIllI() {
        IlllI = null;
    }

    private static boolean IlIlll(Packet<?> packet) {
        if (packet == null) {
            return false;
        }
        IlIIIlIII ilIIIlIII = IlllI;
        if (ilIIIlIII == null) {
            return false;
        }
        try {
            return ilIIIlIII.I().test(packet);
        }
        catch (Throwable throwable) {
            return false;
        }
    }

    private void IllIIl(ChannelHandlerContext channelHandlerContext) {
        this.IlII(channelHandlerContext, 0L);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllIlI(ChannelHandlerContext channelHandlerContext) {
        lIllllII lIllllII2;
        ArrayList<lIllllII> arrayList = new ArrayList<lIllllII>(10);
        while (arrayList.size() < 10 && (lIllllII2 = this.llIll.poll()) != null) {
            arrayList.add(lIllllII2);
        }
        boolean bl = false;
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            lIllllII lIllllII3 = (lIllllII)iterator.next();
            bl |= this.IIllIl(channelHandlerContext, lIllllII3.lI, lIllllII3.II);
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private long IllIll(lI lI2) {
        long l2 = this.IIl(lI2.l);
        if (l2 <= 0L) {
            return 0L;
        }
        if (this.IlI.size() <= 4) {
            long l3 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - lI2.II);
            if (l3 < 2500L) return Math.min(l2, 2500L);
            return l3;
        }
        return 0L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void IlllII(llIlIIIl llIlIIIl2, long l2) {
        lllIll lllIll2;
        Object object = IlII;
        synchronized (object) {
            if (!IIllI || llIlIIIl2 == null || IllIl != llIlIIIl2) {
                return;
            }
            lllIll2 = lIIlI;
        }
        long l3 = Math.max(0L, l2);
        long l4 = System.nanoTime() - TimeUnit.MILLISECONDS.toNanos(l3);
        for (lIIIlIl lIIIlIl2 : IIlIl) {
            lIIIlIl2.lIIllI(l4, lllIll2);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlllIl() {
        this.Illl = false;
        this.lIIl = false;
        this.Illll = false;
        this.lIllI = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllllI(ChannelHandlerContext channelHandlerContext, long l2) {
        if (!this.Il.compareAndSet(false, true)) {
            return;
        }
        Runnable runnable = () -> this.lIIlIl(channelHandlerContext);
        if (l2 > 0L) {
            channelHandlerContext.executor().schedule(runnable, Math.max(l2, lIl), TimeUnit.NANOSECONDS);
            return;
        }
        if (channelHandlerContext.executor().inEventLoop()) {
            runnable.run();
            return;
        }
        channelHandlerContext.executor().execute(runnable);
    }

    /*
     * Unable to fully structure code
     */
    private void lIIIIl(ChannelHandlerContext var1_1) {
        block23: {
            block26: {
                block29: {
                    block33: {
                        block32: {
                            block31: {
                                block27: {
                                    block24: {
                                        block22: {
                                            block30: {
                                                block28: {
                                                    block25: {
                                                        break block30;
lbl1:
                                                        // 2 sources

                                                        while (true) {
                                                            continue;
                                                            break;
                                                        }
                                                        block1: while (var6_5.l > var2_2.l) lbl-1000:
                                                        // 3 sources

                                                        {
                                                            while (true) {
                                                                var2_2 = var6_5;
                                                                break block22;
                                                                break;
                                                            }
lbl7:
                                                            // 1 sources

                                                            while (true) {
                                                                if (var2_2 == null) ** GOTO lbl-1000
                                                                continue block1;
                                                                break;
                                                            }
                                                        }
                                                        break block31;
                                                        while (true) {
                                                            break block23;
                                                            break;
                                                        }
lbl13:
                                                        // 1 sources

                                                        while (true) {
                                                            this.lII.set(false);
                                                            if (!this.llI.isEmpty()) break block24;
lbl16:
                                                            // 2 sources

                                                            return;
                                                        }
lbl18:
                                                        // 1 sources

                                                        while (true) {
                                                            this.IllIIl(var1_1);
                                                            break block25;
                                                            break;
                                                        }
lbl21:
                                                        // 1 sources

                                                        while (true) {
                                                            if (this.llI.remove(var2_2)) ** continue;
                                                            break block26;
                                                            break;
                                                        }
lbl24:
                                                        // 1 sources

                                                        while (true) {
                                                            this.IllIIl(var1_1);
                                                            break block27;
                                                            break;
                                                        }
                                                        while (true) {
                                                            var3_3 = Math.min(var3_3, var7_6);
                                                            break block22;
                                                            break;
                                                        }
                                                    }
                                                    return;
lbl33:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var7_6 > 0L) ** continue;
                                                        ** continue;
                                                        break;
                                                    }
lbl36:
                                                    // 1 sources

                                                    while (true) {
                                                        var6_5 = var5_4.next();
                                                        var7_6 = this.IlIl(var6_5.Il, this.lIlII(var6_5));
                                                        ** continue;
                                                        break;
                                                    }
lbl40:
                                                    // 1 sources

                                                    while (true) {
                                                        v0 = 0L;
                                                        break block28;
                                                        break;
                                                    }
lbl43:
                                                    // 1 sources

                                                    while (true) {
                                                        if (var6_5.Il <= var2_2.Il) break block22;
                                                        ** continue;
                                                        break;
                                                    }
lbl46:
                                                    // 1 sources

                                                    while (true) {
                                                        v0 = var3_3;
                                                        break block28;
                                                        break;
                                                    }
lbl49:
                                                    // 1 sources

                                                    while (true) {
                                                        if (!this.llI.isEmpty()) {
                                                            ** continue;
                                                        }
                                                        break block27;
                                                        break;
                                                    }
                                                }
                                                this.IlII(var1_1, v0);
                                                ** while (true)
                                            }
                                            var2_2 = null;
                                            break block32;
                                        }
lbl60:
                                        // 3 sources

                                        while (var5_4.hasNext()) {
                                            ** continue;
lbl62:
                                            // 1 sources

                                            ** GOTO lbl36
                                        }
                                        break block33;
                                    }
                                    ** while (var3_3 != 0x7FFFFFFFFFFFFFFFL)
lbl66:
                                    // 1 sources

                                    ** while (true)
lbl67:
                                    // 1 sources

                                    while (true) {
                                        if (!this.IIllIl(var1_1, var2_2.I, var2_2.lI)) ** GOTO lbl1
                                        break block29;
                                        break;
                                    }
                                }
                                return;
                            }
                            if (var6_5.l != var2_2.l) ** GOTO lbl60
                            ** while (true)
                            this.IIlllI(var2_2);
                            this.lII.set(false);
                            ** while (true)
                        }
                        var3_3 = 0x7FFFFFFFFFFFFFFFL;
                        var5_4 = this.llI.iterator();
                        ** GOTO lbl60
                    }
                    ** while (var2_2 != null)
lbl84:
                    // 1 sources

                    ** while (true)
                }
                var1_1.flush();
                ** while (true)
lbl89:
                // 1 sources

                while (true) {
                    if (this.llI.isEmpty()) ** continue;
                    ** continue;
                    break;
                }
            }
            this.lII.set(false);
            ** while (true)
        }
        this.IlIlIl(var2_2.l);
        this.III.remove(var2_2);
        ** while (true)
    }

    private lI lIIIlI(Object object, ChannelPromise channelPromise) {
        return new lI(object, channelPromise, System.nanoTime(), this.ll.incrementAndGet());
    }

    /*
     * Unable to fully structure code
     */
    public static void lIIIll() {
        block8: {
            block5: {
                block7: {
                    block4: {
                        block6: {
                            ++lIIIlIl.IlIlI;
                            break block7;
lbl3:
                            // 1 sources

                            while (true) {
                                if (var2_2 != null) break block4;
                                break block5;
                                break;
                            }
                            while (true) {
                                break block6;
                                break;
                            }
lbl8:
                            // 1 sources

                            while (true) {
                                var2_2.executor().execute(var3_3);
                                break block5;
                                break;
                            }
                        }
                        var1_1 = var0.next();
                        var2_2 = var1_1.lIll;
                        ** while (true)
                    }
                    var3_3 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, IIllII(orchard.internal.lIIIlIl io.netty.channel.ChannelHandlerContext ), ()V)((lIIIlIl)var1_1, (ChannelHandlerContext)var2_2);
                    ** while (!var2_2.executor().inEventLoop())
lbl18:
                    // 1 sources

                    break block8;
                }
                var0 = lIIIlIl.IIlIl.iterator();
            }
lbl22:
            // 2 sources

            while (true) {
                if (var0.hasNext()) ** continue;
                return;
            }
        }
        var3_3.run();
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIlII() {
        ChannelHandlerContext channelHandlerContext = this.lIll;
        if (channelHandlerContext == null) {
            return;
        }
        Runnable runnable = () -> {
            if (!this.IlI.isEmpty()) {
                this.IIIlI.set(false);
                this.lIIII(channelHandlerContext);
            }
            if (!this.llI.isEmpty()) {
                this.lII.set(false);
                this.IllIIl(channelHandlerContext);
            }
            if (this.lIIIl.isEmpty()) return;
            this.lllI.set(false);
            this.IIIllII(channelHandlerContext);
        };
        if (channelHandlerContext.executor().inEventLoop()) {
            runnable.run();
            return;
        }
        channelHandlerContext.executor().execute(runnable);
    }

    private void lIIlIl(ChannelHandlerContext channelHandlerContext) {
        try {
            IIllIIll iIllIIll;
            int n;
            long l2 = System.nanoTime();
            long l3 = this.IIllIll(this.IIl, IllI, l2);
            if (l3 > 0L) {
                this.Il.set(false);
                this.IllllI(channelHandlerContext, l3);
                return;
            }
            for (n = 0; n < 10 && (iIllIIll = this.IIlI.poll()) != null; ++n) {
                if (!channelHandlerContext.channel().isOpen()) continue;
                lIIIlIl.llIIIl(channelHandlerContext, iIllIIll.I);
            }
            if (n > 0) {
                this.IIl = System.nanoTime();
            }
            this.Il.set(false);
            if (!this.IIlI.isEmpty()) {
                this.IllllI(channelHandlerContext, IllI);
            }
        }
        catch (Exception exception) {
            this.Il.set(false);
            throw exception;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIllI(long l2, lllIll lllIll2) {
        ChannelHandlerContext channelHandlerContext = this.lIll;
        if (channelHandlerContext == null) return;
        if (this.llIll.isEmpty()) {
            return;
        }
        this.llIl(channelHandlerContext, l2, lllIll2, 0L);
    }

    public static long lIIlll() {
        return lI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlIII(ChannelHandlerContext channelHandlerContext, long l2) {
        if (!this.llIIl.compareAndSet(false, true)) {
            return;
        }
        Runnable runnable = () -> this.l(channelHandlerContext);
        if (l2 > 0L) {
            channelHandlerContext.executor().schedule(runnable, Math.max(l2, lIl), TimeUnit.NANOSECONDS);
            return;
        }
        if (channelHandlerContext.executor().inEventLoop()) {
            runnable.run();
            return;
        }
        channelHandlerContext.executor().execute(runnable);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lIlIIl(Packet<?> packet) {
        if (packet instanceof PlayerMoveC2SPacket) return true;
        if (packet instanceof VehicleMoveC2SPacket) return true;
        if (packet instanceof ClientTickEndC2SPacket) return true;
        if (packet instanceof PlayerInteractEntityC2SPacket) return true;
        if (packet instanceof PlayerActionC2SPacket) return true;
        if (packet instanceof PlayerInteractBlockC2SPacket) return true;
        if (packet instanceof PlayerInteractItemC2SPacket) return true;
        if (packet instanceof HandSwingC2SPacket) return true;
        if (packet instanceof UpdateSelectedSlotC2SPacket) return true;
        if (packet instanceof ClientCommandC2SPacket) return true;
        if (packet instanceof PlayerInputC2SPacket) return true;
        if (packet instanceof ClickSlotC2SPacket) return true;
        if (packet instanceof CloseHandledScreenC2SPacket) return true;
        if (packet instanceof ClientStatusC2SPacket) {
            return true;
        }
        if (lIIIlIl.llllIl(packet)) return true;
        if (packet.getClass().getName().endsWith("MessageAcknowledgmentC2SPacket")) return true;
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void lIlIlI() {
        Object object = IlII;
        synchronized (object) {
            if (llIlI == null) {
                return;
            }
            for (lIIIlIl lIIIlIl2 : IIlIl) {
                if (lIIIlIl2.llIll.isEmpty()) continue;
                return;
            }
            llIlI = null;
            lIlll = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlIll(Packet<?> packet) {
        Runnable runnable = () -> {
            ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
            lllIIlI lllIIlI2 = clientEntrypoint == null ? null : clientEntrypoint.IlI();
            if (lllIIlI2 == null) return;
            lllIIlI2.lllII(packet);
        };
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null || minecraftClient.isOnThread()) {
            runnable.run();
            return;
        }
        minecraftClient.execute(runnable);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean lIllII(Object object) {
        if (object instanceof KeepAliveC2SPacket) return true;
        if (object instanceof CommonPongC2SPacket) return true;
        if (object instanceof ResourcePackStatusC2SPacket) return true;
        if (object instanceof QueryPingC2SPacket) return true;
        if (object instanceof MessageAcknowledgmentC2SPacket) return true;
        if (object instanceof AcknowledgeChunksC2SPacket) return true;
        if (object instanceof AcknowledgeReconfigurationC2SPacket) return true;
        if (object instanceof VehicleMoveC2SPacket) return true;
        if (object instanceof ClickSlotC2SPacket) return true;
        if (object instanceof CloseHandledScreenC2SPacket) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Integer lIllIl(Packet<?> packet) {
        String string = packet.getClass().getName();
        if (!(string.endsWith("CommonPongC2SPacket") || string.contains(StringFactory.IIl("1pdbkRRYXlI=")) && string.endsWith("PongC2SPacket"))) {
            if (!string.endsWith(StringFactory.IIl("qJ1amytSQwmbHLwLPOPfnZORQA=="))) return null;
        }
        boolean bl = true;
        boolean bl2 = bl;
        if (!bl2) return null;
        Integer n = lIIIlIl.IlllI(packet, "parameter", "id", "getParameter", "getId");
        if (n == null) return null;
        if (n >= 0) return null;
        if (n == (short)n.intValue()) return n;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIlllI(lIIIIIIl lIIIIIIl2) {
        lIIIIIIl lIIIIIIl3 = lIIIIIIl2 == null ? lIIIIIIl.l : lIIIIIIl2;
        if (IllII == lIIIIIIl3) {
            return;
        }
        IllII = lIIIIIIl3;
        lIIIlIl.IIIIll();
    }

    public static boolean lIllll() {
        return II;
    }

    private boolean llIIII(lIllllII lIllllII2) {
        if (this.llIll.size() >= 1024) {
            return false;
        }
        this.llIll.offer(lIllllII2);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void llIIIl(ChannelHandlerContext channelHandlerContext, Object object) {
        lIIIlIl.IIlIlll(object);
        channelHandlerContext.fireChannelRead(object);
        lIIIlIl.IIIlIII(object);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean llIIlI(lIllllII lIllllII2) {
        if (this.IIIII.size() >= 1024) {
            return false;
        }
        this.IIIII.offer(lIllllII2);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIIll(Throwable throwable) {
        IIllIll iIllIll;
        while ((iIllIll = this.llI.poll()) != null) {
            this.III.remove(iIllIll);
            iIllIll.lI.tryFailure(throwable);
        }
        return;
    }

    private void llIlII(ChannelHandlerContext channelHandlerContext, long l2, lllIll lllIll2) {
        try {
            lIllllII lIllllII2;
            long l3 = lllIll2 == lllIll.Il ? IIII : IllI;
            long l4 = System.nanoTime();
            long l5 = this.IIllIll(this.lIIll, l3, l4);
            if (l5 > 0L) {
                this.llIIl.set(false);
                this.llIl(channelHandlerContext, l2, lllIll2, l5);
                return;
            }
            int n = lllIll2 == lllIll.Il ? 16 : 10;
            boolean bl = false;
            ArrayList<lIllllII> arrayList = new ArrayList<lIllllII>(n);
            while (arrayList.size() < n && (lIllllII2 = this.llIll.peek()) != null && (lllIll2 == null || lIllllII2.l == lllIll2) && lIllllII2.I <= l2 && (lIllllII2 = this.llIll.poll()) != null) {
                if (lIllllII2.l == lllIll.Il && lIllllII2.lI instanceof PlayerInputC2SPacket) {
                    if (bl) {
                        lIllllII2.II.trySuccess();
                        continue;
                    }
                    bl = true;
                }
                arrayList.add(lIllllII2);
                if (lIllllII2.l != lllIll.Il || !(lIllllII2.lI instanceof ClientTickEndC2SPacket)) continue;
            }
            boolean bl2 = false;
            for (lIllllII lIllllII3 : arrayList) {
                bl2 |= this.IIllIl(channelHandlerContext, lIllllII3.lI, lIllllII3.II);
            }
            if (bl2 && channelHandlerContext.channel().isOpen()) {
                channelHandlerContext.flush();
                this.lIIll = System.nanoTime();
            }
            this.llIIl.set(false);
            if (llIlI != null && !this.llIll.isEmpty()) {
                this.llll = this.llIll.peek() != null && this.llIll.peek().l == lllIll.Il;
                this.lIlIII(channelHandlerContext, this.lIlI(this.llIll.peek()));
            } else if (this.IIIlI(l2, lllIll2)) {
                this.llIl(channelHandlerContext, l2, lllIll2, l3);
            }
        }
        catch (Exception exception) {
            this.llIIl.set(false);
            throw exception;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIlIl(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) throws Exception {
        if (this.lIIl && !this.IlIll.isEmpty()) {
            this.lIllI = false;
            this.lllll(channelHandlerContext);
        }
        this.llIllI(channelHandlerContext, object, channelPromise);
        this.Illll = false;
        this.lIllI = false;
        this.Illl = false;
        this.lIIl = !this.IlIll.isEmpty();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIllI(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) throws Exception {
        lllIll lllIll2;
        this.IIllI(channelHandlerContext);
        if (this.Ill(object)) {
            this.IIllIl(channelHandlerContext, object, channelPromise);
            return;
        }
        if (this.lIIll(object)) {
            if (this.llIIlI(this.IIlll(object, channelPromise, lllIll.lI))) return;
            channelPromise.tryFailure((Throwable)new IllegalStateException());
            return;
        }
        if (object instanceof QueryPingC2SPacket) {
            lllIll2 = (QueryPingC2SPacket)object;
            IIllIllI.IIIII().IIIl(lllIll2.getStartTime());
        }
        if ((lllIll2 = lIIIlIl.IIIIIlI(object)) != null) {
            if (!this.llIIII(this.IIlll(object, channelPromise, lllIll2))) {
                channelPromise.tryFailure((Throwable)new IllegalStateException());
                return;
            }
            if (llIlI == null) return;
            this.llll();
            return;
        }
        long l2 = this.IIl(object);
        if (l2 <= 0L) {
            this.IIllIl(channelHandlerContext, object, channelPromise);
            return;
        }
        if (object instanceof QueryPingC2SPacket) {
            QueryPingC2SPacket queryPingC2SPacket = (QueryPingC2SPacket)object;
            IIllIllI.IIIII().IllII(queryPingC2SPacket.getStartTime(), l2);
        }
        if (!this.IIIIlI(this.lIIIlI(object, channelPromise))) {
            channelPromise.tryFailure((Throwable)new IllegalStateException());
            return;
        }
        this.lIIII(channelHandlerContext);
    }

    /*
     * Enabled aggressive block sorting
     */
    public lIIIlIl() {
        this.llI = new ConcurrentLinkedQueue();
        this.lIIIl = new ConcurrentLinkedQueue();
        this.llIll = new ConcurrentLinkedQueue();
        this.IIIII = new ConcurrentLinkedQueue();
        this.IIlI = new ConcurrentLinkedQueue();
        this.III = ConcurrentHashMap.newKeySet();
        this.IIIlI = new AtomicBoolean();
        this.lII = new AtomicBoolean();
        this.lllI = new AtomicBoolean();
        this.llIIl = new AtomicBoolean();
        this.Il = new AtomicBoolean();
        this.ll = new AtomicLong();
    }

    public void handlerAdded(ChannelHandlerContext channelHandlerContext) {
        this.lIll = channelHandlerContext;
        IIlIl.add(this);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIlll(ChannelHandlerContext channelHandlerContext, long l2) {
        IIllIIll iIllIIll;
        while ((iIllIIll = this.IIlI.peek()) != null && iIllIIll.l <= l2) {
            iIllIIll = this.IIlI.poll();
            if (iIllIIll == null || !channelHandlerContext.channel().isOpen()) continue;
            lIIIlIl.llIIIl(channelHandlerContext, iIllIIll.I);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private ChannelPromise lllIII(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) {
        if (!(object instanceof UpdateSelectedSlotC2SPacket)) return channelPromise;
        UpdateSelectedSlotC2SPacket updateSelectedSlotC2SPacket = (UpdateSelectedSlotC2SPacket)object;
        ChannelPromise channelPromise2 = !channelPromise.isVoid() ? channelPromise : channelHandlerContext.newPromise();
        channelPromise2.addListener(future -> {
            if (!future.isSuccess()) {
                IIIIlIl.IlI(updateSelectedSlotC2SPacket.getSelectedSlot());
            }
        });
        return channelPromise2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lllIIl(long l2) {
        long l3 = Math.max(0L, Math.min(l2, 60000L));
        if (lI != l3) {
            lI = l3;
            lIIIlIl.IIIIll();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllIlI(ChannelHandlerContext channelHandlerContext) {
        boolean bl = false;
        while (true) {
            lIllllII lIllllII2;
            if ((lIllllII2 = this.IIIII.poll()) == null) {
                if (!bl) return;
                if (!channelHandlerContext.channel().isOpen()) return;
                channelHandlerContext.flush();
                return;
            }
            bl |= this.IIllIl(channelHandlerContext, lIllllII2.lI, lIllllII2.II);
        }
    }

    private void lllIll(ChannelHandlerContext channelHandlerContext) {
        try {
            if (!this.IlIll.isEmpty()) {
                this.lllll(channelHandlerContext);
            }
        }
        catch (Exception exception) {
            this.lIIl(this.IlIll, exception);
        }
        finally {
            this.IlllIl();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean llllII(Object object) {
        if (!(object instanceof ClientStatusC2SPacket)) return false;
        ClientStatusC2SPacket clientStatusC2SPacket = (ClientStatusC2SPacket)object;
        if (clientStatusC2SPacket.getMode() == ClientStatusC2SPacket.Mode.PERFORM_RESPAWN) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean llllIl(Packet<?> packet) {
        if (lIIIlIl.lIllIl(packet) == null) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static lllIll IIIIIlI(Object object) {
        if (!IIllI && llIlI == null) {
            return null;
        }
        Object object2 = IlII;
        synchronized (object2) {
            if (IIllI && lIIIlIl.IlIll(object, lIIlI)) {
                return lIIlI;
            }
            if (llIlI != null && lIIIlIl.IlIll(object, lIlll)) {
                return lIlll;
            }
            return null;
        }
    }

    private void IIIIlII(ChannelHandlerContext channelHandlerContext) {
        try {
            lllIIlll lllIIlll2 = this.lIIIl.peek();
            if (lllIIlll2 == null) {
                this.lllI.set(false);
                return;
            }
            long l2 = this.IlIl(lllIIlll2.l, this.lllII(lllIIlll2.I));
            if (l2 > 0L) {
                this.lllI.set(false);
                this.lIIIl(channelHandlerContext, l2);
                return;
            }
            this.lIIIl.poll();
            if (channelHandlerContext.channel().isOpen()) {
                lIIIlIl.llIIIl(channelHandlerContext, lllIIlll2.I);
                this.IlIII = System.nanoTime();
            }
            this.lllI.set(false);
            if (!this.lIIIl.isEmpty()) {
                this.IIIllII(channelHandlerContext);
            }
        }
        catch (Exception exception) {
            this.lllI.set(false);
            throw exception;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIlIl() {
        int n = this.llI.size();
        Ill = n;
        llIl = Math.max(llIl, n);
    }

    public static long IIIIllI() {
        return IIlII;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIIIlll() {
        l = false;
        II = false;
        Iterator<lIIIlIl> iterator = IIlIl.iterator();
        while (iterator.hasNext()) {
            lIIIlIl lIIIlIl2 = iterator.next();
            lIIIlIl2.IlIII();
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IIIlIII(Object object) {
        if (!(object instanceof PlayerPositionLookS2CPacket)) {
            if (!(object instanceof PlayerRespawnS2CPacket)) return;
        }
        if (!(object instanceof Packet)) return;
        Packet packet = (Packet)object;
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return;
        if (clientEntrypoint.IlI() == null) return;
        clientEntrypoint.IlI().IIIlIl(packet);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlIlI(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) {
        ChannelPromise channelPromise2 = channelPromise.isVoid() ? channelHandlerContext.newPromise() : channelPromise;
        channelPromise2.addListener(future -> {
            if (future.isSuccess() || !channelHandlerContext.channel().isOpen()) {
                return;
            }
            channelHandlerContext.executor().execute(() -> {
                if (channelHandlerContext.channel().isOpen()) {
                    channelHandlerContext.writeAndFlush(object, channelHandlerContext.newPromise());
                }
            });
        });
        this.IIllIl(channelHandlerContext, object, channelPromise2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlIll(Object object, ChannelPromise channelPromise) {
        if (this.IlIll.size() >= 1024) {
            channelPromise.tryFailure((Throwable)new IllegalStateException("Packet-order queue is full"));
            return;
        }
        boolean bl = this.IlIll.isEmpty();
        this.IlIll.offer(this.lIIIlI(object, channelPromise));
        if (!bl) return;
        this.lIIl = false;
    }

    private void IIIllII(ChannelHandlerContext channelHandlerContext) {
        this.lIIIl(channelHandlerContext, 0L);
    }

    private static void IIIlllI() {
        lIlIl.clear();
        lll = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIIllll() {
        IlllIIlI illlIIlI = IIllIllI.IIIII().IIIIl();
        if (!illlIIlI.l()) {
            Iterator<lIIIlIl> iterator = IIlIl.iterator();
            while (iterator.hasNext()) {
                lIIIlIl lIIIlIl2 = iterator.next();
                lIIIlIl2.IIlII(illlIIlI);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) {
        this.lIll = null;
        IIlIl.remove((Object)this);
        this.IllI();
        if (!IIlIl.isEmpty()) return;
        lIIIlIl.IlIIlI();
        lIIIlIl.IIIlllI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIIII(long l2) {
        ChannelHandlerContext channelHandlerContext = this.lIll;
        if (channelHandlerContext == null) {
            this.IIlI.clear();
            return;
        }
        Runnable runnable = () -> this.llIlll(channelHandlerContext, l2);
        if (channelHandlerContext.executor().inEventLoop()) {
            runnable.run();
            return;
        }
        channelHandlerContext.executor().execute(runnable);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIlIIIl(Predicate<Packet<?>> predicate, Consumer<Packet<?>> consumer, Predicate<Packet<?>> predicate2) {
        IlIIIlIII ilIIIlIII;
        if (predicate == null || consumer == null) {
            IlllI = null;
            return;
        }
        ilIIIlIII(predicate, consumer, predicate2 != null ? predicate2 : packet -> false);
        IlllI = ilIIIlIII;
    }

    private void IIlIIlI(ConcurrentLinkedQueue<lIllllII> concurrentLinkedQueue, Throwable throwable) {
        lIllllII lIllllII2;
        while ((lIllllII2 = concurrentLinkedQueue.poll()) != null) {
            lIllllII2.II.tryFailure(throwable);
        }
    }

    private long IIlIlII(Object object) {
        return 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIlIl(Object object) {
        if (object instanceof QueryPingC2SPacket) {
            QueryPingC2SPacket queryPingC2SPacket = (QueryPingC2SPacket)object;
            IIllIllI.IIIII().IIl(queryPingC2SPacket.getStartTime());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private PingSpoof IIlIllI() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return null;
        }
        PingSpoof pingSpoof = clientEntrypoint.IlI().IIlllIl();
        if (pingSpoof == null) return null;
        if (!pingSpoof.IIIlIIl()) {
            return null;
        }
        if (!pingSpoof.IllI()) {
            return null;
        }
        PingSpoof pingSpoof2 = pingSpoof;
        return pingSpoof2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IIlIlll(Object object) {
        if (!(object instanceof PingResultS2CPacket)) return;
        PingResultS2CPacket pingResultS2CPacket = (PingResultS2CPacket)object;
        IIllIllI iIllIllI = IIllIllI.IIIII();
        iIllIllI.IIlll(pingResultS2CPacket.startTime());
        iIllIllI.Il(pingResultS2CPacket);
    }

    public static void IIllIII() {
        lIlII = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIllIIl(Throwable throwable) {
        this.lIIl(this.IlIll, throwable);
        this.lIIl(this.IlI, throwable);
        this.llIIll(throwable);
        this.IIlIIlI(this.llIll, throwable);
        this.IIlIIlI(this.IIIII, throwable);
    }

    public static int IIllIlI() {
        return llIl;
    }

    private long IIllIll(long l2, long l3, long l4) {
        if (l2 <= 0L) {
            return 0L;
        }
        return Math.max(0L, l2 + l3 - l4);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static void IIlllII(Object object) {
        if (!(object instanceof Packet)) {
            return;
        }
        Packet packet = (Packet)object;
        IlIIIlIII ilIIIlIII = IlllI;
        if (ilIIIlIII == null) {
            return;
        }
        lIIIlIl.IlIlII(() -> {
            if (IlllI != ilIIIlIII) {
                return;
            }
            try {
                ilIIIlIII.II().accept(packet);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        });
    }

    private static int IIlllIl(int n, int n2) {
        return lllIl[n ^ 0x501F3ACC] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IIllllI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x21017398;
        char[] cArray = llllI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lllll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIIIlIl.lllll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x58DFFA7A;
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
                case 25: {
                    n6 = 152;
                    continue block33;
                }
                case 16: {
                    n6 = 137;
                    continue block33;
                }
                case 27: {
                    n6 = 219;
                    continue block33;
                }
                case 9: {
                    n6 = 36;
                    continue block33;
                }
                case 1: {
                    n6 = 161;
                    continue block33;
                }
                case 24: {
                    n6 = 180;
                    continue block33;
                }
                case 31: {
                    n6 = 36;
                    continue block33;
                }
                case 14: {
                    n6 = 144;
                    continue block33;
                }
                case 3: {
                    n6 = 82;
                    continue block33;
                }
                case 29: {
                    n6 = 189;
                    continue block33;
                }
                case 22: {
                    n6 = 47;
                    continue block33;
                }
                case 30: {
                    n6 = 176;
                    continue block33;
                }
                case 11: {
                    n6 = 101;
                    continue block33;
                }
                default: {
                    n6 = 128;
                    continue block33;
                }
                case 10: {
                    n6 = 115;
                    continue block33;
                }
                case 7: {
                    n6 = 199;
                    continue block33;
                }
                case 17: {
                    n6 = 172;
                    continue block33;
                }
                case 8: {
                    n6 = 234;
                    continue block33;
                }
                case 26: {
                    n6 = 153;
                    continue block33;
                }
                case 12: {
                    n6 = 47;
                    continue block33;
                }
                case 15: {
                    n6 = 213;
                    continue block33;
                }
                case 2: {
                    n6 = 248;
                    continue block33;
                }
                case 6: {
                    n6 = 210;
                    continue block33;
                }
                case 28: {
                    n6 = 156;
                    continue block33;
                }
                case 4: {
                    n6 = 162;
                    continue block33;
                }
                case 18: {
                    n6 = 212;
                    continue block33;
                }
                case 19: {
                    n6 = 88;
                    continue block33;
                }
                case 5: {
                    n6 = 207;
                    continue block33;
                }
                case 20: {
                    n6 = 124;
                    continue block33;
                }
                case 13: {
                    n6 = 38;
                    continue block33;
                }
                case 21: {
                    n6 = 155;
                    continue block33;
                }
                case 23: 
            }
            n6 = 153;
        }
    }
}

