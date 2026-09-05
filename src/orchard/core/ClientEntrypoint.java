/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIlIIl
 * Identified from direct evidence; see README.md
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.ClientModInitializer
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
 *  net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.screen.ChatScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.AbstractSignEditScreen
 *  net.minecraft.client.gui.screen.ingame.BookEditScreen
 *  net.minecraft.client.gui.widget.TextFieldWidget
 *  net.minecraft.client.util.InputUtil$Key
 */
package orchard.core;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ChatScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.AbstractSignEditScreen;
import net.minecraft.client.gui.screen.ingame.BookEditScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.util.InputUtil;
import orchard.config.CloudConfigManager;
import orchard.config.LegacyConfigMigration;
import orchard.internal.II;
import orchard.internal.IIIIllIII;
import orchard.internal.IIlllIIl;
import orchard.internal.IlIlIlIII;
import orchard.internal.Illl;
import orchard.internal.IlllIllI;
import orchard.internal.lIIlI;
import orchard.internal.lIIllllI;
import orchard.internal.lIllIIlI;
import orchard.internal.llIl;
import orchard.internal.lllIIlI;
import orchard.module.render.StreamerMode;
import orchard.net.AuthClient;

@Environment(value=EnvType.CLIENT)
public final class ClientEntrypoint
implements ClientModInitializer {
    private final LegacyConfigMigration I;
    private boolean l;
    private final IIlllIIl II;
    private Thread Il;
    private final CloudConfigManager lI;
    private final lllIIlI ll;
    private boolean III;
    private final IlIlIlIII IIl = new IlIlIlIII();
    private static ClientEntrypoint IlI;
    private final AuthClient Ill;

    public void I() {
    }

    public void l() {
        this.IIl.II();
        Thread thread = this.Il;
        this.Il = null;
        if (thread != null) {
            try {
                Runtime.getRuntime().removeShutdownHook(thread);
            }
            catch (IllegalStateException illegalStateException) {
                // empty catch block
            }
        }
        if (IlI == this) {
            IlI = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void II(MinecraftClient minecraftClient) {
        Object object;
        boolean bl;
        block7: {
            block8: {
                if (IlllIllI.I()) {
                    return;
                }
                if (!this.Ill.lIll(minecraftClient)) {
                    if (!this.Ill.IlII()) return;
                    IlllIllI.l(minecraftClient, this.ll);
                    return;
                }
                if (!this.l) {
                    this.l = true;
                    this.lI.IIlIl(this.ll);
                }
                this.IIl.Illl(minecraftClient);
                this.ll.IIlIIII();
                this.ll.IlIIlII(minecraftClient);
                bl = false;
                if (minecraftClient.currentScreen == null) break block7;
                if (minecraftClient.currentScreen instanceof ChatScreen || minecraftClient.currentScreen instanceof AbstractSignEditScreen || minecraftClient.currentScreen instanceof BookEditScreen) break block8;
                Screen screen = minecraftClient.currentScreen;
                if (!(screen instanceof lIllIIlI) || ((lIllIIlI)((Object)(object = (lIllIIlI)screen))).IIIIIII()) {
                    screen = minecraftClient.currentScreen.getFocused();
                    if (screen instanceof TextFieldWidget) {
                        bl = true;
                    }
                    break block7;
                } else {
                    bl = true;
                }
                break block7;
            }
            bl = true;
        }
        object = this.I.IlIll();
        boolean bl2 = !bl && !this.ll.lIIIl((InputUtil.Key)object) && lIIllllI.llI(minecraftClient, (InputUtil.Key)object);
        if (bl2 && !this.III) {
            this.III();
        }
        this.III = bl2;
    }

    public IlIlIlIII lI() {
        return this.IIl;
    }

    public void ll() {
        this.IIll(Illl.lI);
    }

    public void III() {
        this.IIll(Illl.Il);
    }

    public LegacyConfigMigration IIl() {
        return this.I;
    }

    public lllIIlI IlI() {
        return this.ll;
    }

    /*
     * Enabled aggressive block sorting
     */
    public ClientEntrypoint() {
        this.ll = new lllIIlI(this.IIl);
        this.I = new LegacyConfigMigration();
        this.II = new IIlllIIl();
        this.lI = new CloudConfigManager(this.I);
        this.Ill = new AuthClient();
        this.I.III(this.lI.Il());
        this.I.llll();
    }

    public void Ill() {
        this.IIll(Illl.I);
    }

    public static ClientEntrypoint lII() {
        return IlI;
    }

    public void llI() {
        this.IIll(Illl.ll);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onInitializeClient() {
        IlI = this;
        IIIIllIII.II();
        this.I.IIl(this.ll);
        this.IIII();
        ClientTickEvents.START_CLIENT_TICK.register(this::II);
        HudRenderCallback.EVENT.register((drawContext, renderTickCounter) -> {
            if (IlllIllI.I()) {
                return;
            }
            if (this.Ill.IIl()) {
                StreamerMode streamerMode = this.ll.IIIlIIl();
                if (streamerMode.IlI()) return;
                DrawContext drawContext2 = streamerMode.lI(drawContext);
                llIl.lI(this.ll, drawContext2, 0, 0, lIIllllI.IIIllIl(renderTickCounter, true));
                return;
            }
        });
        lIIlI.l.I(this::lll);
        this.Il = new Thread(() -> {
            if (!IlllIllI.I()) {
                this.IIII();
            }
        });
        Runtime.getRuntime().addShutdownHook(this.Il);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lll(II iI) {
        if (IlllIllI.I()) {
            return;
        }
        StreamerMode streamerMode = this.ll.IIIlIIl();
        if (streamerMode.IlI()) return;
        streamerMode.I(iI, this.ll::IIIllI);
    }

    public void IIII() {
        if (IlllIllI.I()) {
            return;
        }
        this.I.lIllI(this.ll);
    }

    public String IIIl() {
        return this.Ill.lIII();
    }

    public void IIlI() {
        this.III = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIll(Illl illl) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) {
            return;
        }
        Screen screen = minecraftClient.currentScreen;
        if (screen instanceof lIllIIlI) {
            lIllIIlI lIllIIlI2 = (lIllIIlI)screen;
            lIllIIlI2.lIllII(illl);
            if (illl != Illl.Il) return;
            lIllIIlI2.close();
            return;
        }
        if (minecraftClient.player == null) return;
        if (minecraftClient.world != null) {
            this.IIlI();
            minecraftClient.setScreen((Screen)new lIllIIlI(this, illl));
            return;
        }
    }

    public void IlII() {
        this.IIlI();
    }

    public IIlllIIl IlIl() {
        return this.II;
    }
}

