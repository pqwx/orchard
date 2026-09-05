/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIllIII
 * Purpose not identified - name is the original obfuscated one.
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.text.Text
 */
package orchard.internal;

import com.mojang.authlib.GameProfile;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.Text;
import orchard.core.ClientEntrypoint;
import orchard.module.render.Cosmetics;
import orchard.module.render.NickSwitcher;

@Environment(value=EnvType.CLIENT)
public final class IIlIllIII {
    /*
     * Enabled aggressive block sorting
     */
    public static Object I(GameProfile gameProfile) {
        Object object;
        Object object2;
        NickSwitcher nickSwitcher = NickSwitcher.IIlIIl();
        Object object3 = object2 = nickSwitcher == null ? null : nickSwitcher.IIIll(gameProfile);
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) {
            return object2;
        }
        Cosmetics cosmetics = clientEntrypoint.IlI().IIl();
        if (cosmetics == null) {
            object = object2;
            return object;
        }
        object = cosmetics.lll(gameProfile, object2);
        return object;
    }

    private static boolean l() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        return minecraftClient.player != null && minecraftClient.world != null;
    }

    private IIlIllIII() {
    }

    public static boolean II() {
        return NickSwitcher.IIlIIl() != null;
    }

    public static Text Il(PlayerListEntry playerListEntry, Text text) {
        if (playerListEntry == null) {
            return text;
        }
        return IIlIllIII.III(playerListEntry.getProfile(), text);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String lI(String string) {
        NickSwitcher nickSwitcher = NickSwitcher.IIlIIl();
        if (nickSwitcher != null && IIlIllIII.l() && nickSwitcher.IIlIl()) {
            return nickSwitcher.IllIl(string);
        }
        return string;
    }

    public static Text ll(Text text) {
        NickSwitcher nickSwitcher = NickSwitcher.IIlIIl();
        if (nickSwitcher != null) {
            if (IIlIllIII.l() && nickSwitcher.IIlIl()) {
                return nickSwitcher.IlIIl(text);
            }
        }
        return text;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Text III(GameProfile gameProfile, Text text) {
        Text text2;
        block2: {
            NickSwitcher nickSwitcher;
            block1: {
                nickSwitcher = NickSwitcher.IIlIIl();
                if (nickSwitcher != null) break block1;
                break block2;
            }
            text2 = nickSwitcher.llIII(gameProfile, text);
            return text2;
        }
        text2 = text;
        return text2;
    }
}

