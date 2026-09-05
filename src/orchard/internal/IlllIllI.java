/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlllIllI
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
 *  net.minecraft.client.util.InputUtil
 */
package orchard.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.InputUtil;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.internal.IIIII;
import orchard.internal.IIIIllIII;
import orchard.internal.IIlIII;
import orchard.internal.IIllIllI;
import orchard.internal.IIlllIIIl;
import orchard.internal.IlIl;
import orchard.internal.IlIlllI;
import orchard.internal.IllIIlll;
import orchard.internal.lIIIlIl;
import orchard.internal.lIIllllI;
import orchard.internal.llIl;
import orchard.internal.llIlIIIl;
import orchard.internal.lllIIlI;
import orchard.internal.llllIII;
import orchard.internal.llllIl;
import orchard.module.movement.NoPush;
import orchard.module.render.NickSwitcher;
import orchard.module.render.PlayerHider;
import orchard.net.PacketInterceptor;
import orchard.net.SpotifyBridge;

@Environment(value=EnvType.CLIENT)
public final class IlllIllI {
    private static final AtomicBoolean I = new AtomicBoolean();

    public static boolean I() {
        return I.get();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean l(MinecraftClient minecraftClient, lllIIlI lllIIlI2) {
        if (!I.compareAndSet(false, true)) {
            return false;
        }
        IlllIllI.II(minecraftClient, lllIIlI2);
        return true;
    }

    private static void II(MinecraftClient minecraftClient, lllIIlI lllIIlI2) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (minecraftClient != null) {
            try {
                lIIllllI.IllIIll();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                lIIllllI.IlIlI();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                IlIlllI.l();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                llIl.lll();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                IIllIllI.IIIII().llIl(true);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        if (lllIIlI2 != null) {
            try {
                lllIIlI2.lIlIl().lll(minecraftClient);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                lllIIlI2.IIIlII().lI();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            try {
                lllIIlI2.lIlII().lI(minecraftClient);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            for (ModuleBase moduleBase : List.copyOf(lllIIlI2.IIIIIll())) {
                try {
                    if (moduleBase.IIIlIIl()) {
                        moduleBase.IIlIIll(false);
                    }
                    moduleBase.lllIII(false);
                    moduleBase.IIIIIll(InputUtil.UNKNOWN_KEY);
                }
                catch (Throwable throwable) {}
            }
        }
        if (minecraftClient != null) {
            try {
                minecraftClient.setScreen(null);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        try {
            IlIl.l();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            IIlllIIIl.ll().IIl();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            llllIl.ll();
            llllIII.ll();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            lIIIlIl.lIll(llIlIIIl.I, true);
            lIIIlIl.IIIIlll();
            lIIIlIl.IlIlI();
            lIIIlIl.IllIl();
            lIIIlIl.lllIl();
            lIIIlIl.IlIllI();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        try {
            IIlIII.Il();
            SpotifyBridge.IlllI();
            PacketInterceptor.llII();
            IIIII.lIlI();
            IIIIllIII.IlIl();
            IllIIlll.II();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        NickSwitcher.IIllll();
        NoPush.lII();
        PlayerHider.IIl();
        if (clientEntrypoint != null) {
            clientEntrypoint.l();
        }
        try {
            System.gc();
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private IlllIllI() {
    }
}

