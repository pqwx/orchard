/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IlIlIIlll
 * Mixin target   : PlayerListHud
 *
 * Recovered strings in this class:
 *   - getPlayerName
 *   - render
 *   - RETURN
 *   - INVOKE
 *   - HEAD
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.hud.PlayerListHud
 *  net.minecraft.client.network.PlayerListEntry
 *  net.minecraft.text.StringVisitable
 *  net.minecraft.text.Text
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.Unique
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.Redirect
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package orchard.mixin;

import java.util.HashMap;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.PlayerListHud;
import net.minecraft.client.network.PlayerListEntry;
import net.minecraft.text.StringVisitable;
import net.minecraft.text.Text;
import orchard.internal.IIIII;
import orchard.internal.IIIIllIII;
import orchard.internal.IIlIllIII;
import orchard.internal.IlIIIIII;
import orchard.internal.IllIIlll;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={PlayerListHud.class})
public abstract class PlayerListHudMixin {
    @Unique
    private final Map<String, PlayerListEntry> I = new HashMap<String, PlayerListEntry>();

    @Shadow
    public abstract Text getPlayerName(PlayerListEntry var1);

    @Inject(method={"render"}, at={@At(value="RETURN")})
    private void I(CallbackInfo callbackInfo) {
        IlIIIIII.Il();
    }

    @Inject(method={"render"}, at={@At(value="HEAD")})
    private void l(CallbackInfo callbackInfo) {
        this.I.clear();
        IlIIIIII.II();
    }

    @Inject(method={"getPlayerName"}, at={@At(value="RETURN")}, cancellable=true)
    private void II(PlayerListEntry playerListEntry, CallbackInfoReturnable<Text> callbackInfoReturnable) {
        Text text = IIIIllIII.IIIl(playerListEntry, (Text)callbackInfoReturnable.getReturnValue());
        Text text2 = IllIIlll.l(playerListEntry, text = IIlIllIII.Il(playerListEntry, text));
        if (text2 != null) {
            this.I.put(text2.getString(), playerListEntry);
        }
        callbackInfoReturnable.setReturnValue((Object)text2);
    }

    @Redirect(method={"render"}, at=@At(value="INVOKE", target="Lnet/minecraft/class_332;drawTextWithShadow(Lnet/minecraft/class_327;Lnet/minecraft/class_2561;III)I"))
    private int Il(DrawContext drawContext, TextRenderer textRenderer, Text text, int n, int n2, int n3) {
        PlayerListEntry playerListEntry = this.I.remove(text.getString());
        int n4 = IIIII.II(drawContext, playerListEntry, textRenderer, n, n2);
        IlIIIIII.I(n - 10, n2 - 1, n + n4 + textRenderer.getWidth((StringVisitable)text) + 110, n2 + 8);
        drawContext.drawTextWithShadow(textRenderer, text, n + n4, n2, n3);
        return 0;
    }
}

