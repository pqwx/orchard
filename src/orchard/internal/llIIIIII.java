/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIIIII
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

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import orchard.core.ModuleBase;
import orchard.internal.IllIIl;
import orchard.internal.lIIlIlIl;

@Environment(value=EnvType.CLIENT)
public final class llIIIIII {
    private static final Deque<IllIIl> I;
    private static final int[] l;

    /*
     * Enabled aggressive block sorting
     */
    public static boolean I(ModuleBase moduleBase) {
        IllIIl illIIl;
        if (moduleBase == null) {
            return false;
        }
        Iterator<IllIIl> iterator = I.iterator();
        do {
            if (!iterator.hasNext()) return false;
            illIIl = iterator.next();
        } while (illIIl.ll != moduleBase);
        return true;
    }

    public static boolean l(ModuleBase moduleBase, int n, boolean bl, int n2) {
        return llIIIIII.ll(moduleBase, n, bl, n2, true, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 965670265;
        byte[] byArray = "\u00b8\u00f2\u00f4K\u00a2a\u008e\u0001t\u00f9\u00b4C".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        l = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            llIIIIII.l[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
        I = new ArrayDeque<IllIIl>();
    }

    private static void II(ClientPlayerEntity clientPlayerEntity, int n, boolean bl) {
        if (clientPlayerEntity != null) {
            if (n >= 0) {
                if (n <= 8) {
                    clientPlayerEntity.getInventory().setSelectedSlot(n);
                    return;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int Il(ClientPlayerEntity clientPlayerEntity) {
        int n;
        if (clientPlayerEntity == null) {
            return -1;
        }
        IllIIl illIIl = I.peek();
        if (illIIl == null) {
            n = clientPlayerEntity.getInventory().getSelectedSlot();
            return n;
        }
        n = illIIl.Il;
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lI(ModuleBase moduleBase) {
        boolean bl;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (moduleBase == null) return;
        if (I.isEmpty()) return;
        if (minecraftClient.player == null) {
            return;
        }
        IllIIl illIIl = I.peek();
        if (illIIl == null) return;
        if (illIIl.ll != moduleBase) return;
        I.pop();
        IllIIl illIIl2 = I.peek();
        int n = illIIl2 != null ? illIIl2.Il : illIIl.l;
        boolean bl2 = bl = illIIl2 != null ? illIIl2.I : illIIl.III;
        if (illIIl.IIl) {
            llIIIIII.II(minecraftClient.player, n, bl);
        }
        if (illIIl.lI == null) return;
        illIIl.lI.run();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean ll(ModuleBase moduleBase, int n, boolean bl, int n2, boolean bl2, Runnable runnable) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (moduleBase == null) return false;
        if (minecraftClient.player != null) {
            if (n < 0) return false;
            if (n > 8) {
                return false;
            }
            IllIIl illIIl = I.peek();
            if (illIIl == null || illIIl.ll != moduleBase) {
                if (llIIIIII.I(moduleBase)) {
                    return false;
                }
                int n3 = llIIIIII.Il(minecraftClient.player);
                if (n3 == n) {
                    return false;
                }
                IllIIl illIIl2 = I.peekLast();
                int n4 = illIIl2 != null ? illIIl2.l : n3;
                boolean bl3 = illIIl2 != null ? illIIl2.III : bl;
                long l2 = n2 < 0 ? Long.MAX_VALUE : (long)(minecraftClient.player.age + n2);
                lIIlIlIl lIIlIlIl2 = n2 <= 0 ? lIIlIlIl.Il : lIIlIlIl.II;
                I.push(new IllIIl(moduleBase, n4, bl3, n, bl, bl2, l2, lIIlIlIl2, runnable));
                llIIIIII.II(minecraftClient.player, n, bl);
                return true;
            }
            illIIl.Il = n;
            illIIl.I = bl;
            illIIl.IIl = bl2;
            illIIl.IlI = n2 < 0 ? Long.MAX_VALUE : (long)(minecraftClient.player.age + n2);
        }
        return false;
        illIIl.II = n2 <= 0 ? lIIlIlIl.Il : lIIlIlIl.II;
        illIIl.lI = runnable;
        llIIIIII.II(minecraftClient.player, n, bl);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean III(ModuleBase moduleBase, int n, boolean bl, int n2, boolean bl2, Runnable runnable) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (moduleBase == null) return false;
        if (minecraftClient.player != null) {
            if (n < 0) return false;
            if (n > 8) {
                return false;
            }
            int n3 = llIIIIII.Il(minecraftClient.player);
            if (n3 != n) return llIIIIII.ll(moduleBase, n, bl, n2, bl2, runnable);
            if (llIIIIII.I(moduleBase)) return llIIIIII.ll(moduleBase, n, bl, n2, bl2, runnable);
            return true;
        }
        return false;
    }

    public static boolean IIl(ModuleBase moduleBase, int n, boolean bl) {
        return llIIIIII.ll(moduleBase, n, bl, 0, true, null);
    }

    private llIIIIII() {
    }

    private static int IlI(int n, int n2) {
        return l[n ^ 0x36BCC403] ^ n2 ^ n;
    }
}

