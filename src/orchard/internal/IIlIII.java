/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIII
 * Purpose not identified - name is the original obfuscated one.
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
 *  net.minecraft.client.gui.screen.Screen
 */
package orchard.internal;

import java.awt.image.BufferedImage;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import orchard.internal.IlIllIIIl;
import orchard.internal.lIIllllI;

@Environment(value=EnvType.CLIENT)
public final class IIlIII {
    private static int I = -1;
    private static long l;
    private static Screen II;
    private static int Il;
    private static final long lI = 50L;
    private static BufferedImage ll;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static IlIllIIIl I() {
        if (ll == null) return null;
        IlIllIIIl ilIllIIIl = new IlIllIIIl(ll, I, Il, l);
        return ilIllIIIl;
    }

    public static void l(MinecraftClient minecraftClient) {
        IIlIII.II(minecraftClient, 50L);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void II(MinecraftClient minecraftClient, long l2) {
        BufferedImage bufferedImage;
        long l3;
        int n;
        int n2;
        Screen screen;
        block3: {
            block4: {
                block2: {
                    if (minecraftClient == null) return;
                    if (minecraftClient.getWindow() == null) return;
                    if (minecraftClient.world == null) break block2;
                    screen = minecraftClient.currentScreen;
                    n2 = minecraftClient.getWindow().getScaledWidth();
                    n = minecraftClient.getWindow().getScaledHeight();
                    long l4 = Math.max(0L, l2);
                    l3 = System.currentTimeMillis();
                    if (l3 - l >= l4 || screen != II || n2 != I) break block3;
                    break block4;
                }
                return;
            }
            if (n == Il) {
                return;
            }
        }
        if ((bufferedImage = lIIllllI.IIlIIII(minecraftClient)) == null) {
            return;
        }
        ll = bufferedImage;
        II = screen;
        I = n2;
        Il = n;
        l = l3;
    }

    private IIlIII() {
    }

    public static void Il() {
        ll = null;
        II = null;
        I = -1;
        Il = -1;
        l = 0L;
    }

    static {
        Il = -1;
    }
}

