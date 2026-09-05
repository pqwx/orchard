/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IlIIIllIl
 * Mixin target   : ChatHud
 *
 * Recovered strings in this class:
 *   - addMessage
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
 *  net.minecraft.client.gui.hud.ChatHud
 *  net.minecraft.text.Text
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.gui.hud.ChatHud;
import net.minecraft.text.Text;
import orchard.core.ClientEntrypoint;
import orchard.internal.IIlIllIII;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyVariable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={ChatHud.class})
public abstract class ChatHudMixin {
    @ModifyVariable(method={"addMessage"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0, require=0)
    private Text I(Text text) {
        return IIlIllIII.ll(text);
    }

    @Inject(method={"addMessage"}, at={@At(value="HEAD")}, require=0)
    private void l(Text text, CallbackInfo callbackInfo) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null || clientEntrypoint.IlI() == null || text == null) {
            return;
        }
        clientEntrypoint.IlI().IlIIlll(text.getString());
    }
}

