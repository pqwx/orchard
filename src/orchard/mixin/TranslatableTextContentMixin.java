/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIlIIlII
 * Mixin target   : TranslatableTextContent
 *
 * Recovered strings in this class:
 *   - updateTranslations
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
 *  net.minecraft.text.StringVisitable
 *  net.minecraft.text.TranslatableTextContent
 *  net.minecraft.util.Language
 *  org.spongepowered.asm.mixin.Final
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.Shadow
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.Inject
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package orchard.mixin;

import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.text.StringVisitable;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.Language;
import orchard.net.PacketInterceptor;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Environment(value=EnvType.CLIENT)
@Mixin(value={TranslatableTextContent.class})
public abstract class TranslatableTextContentMixin {
    @Shadow
    private Language languageCache;
    @Shadow
    @Final
    private String key;
    @Shadow
    private List<StringVisitable> translations;

    @Inject(method={"updateTranslations"}, at={@At(value="HEAD")}, cancellable=true)
    private void I(CallbackInfo callbackInfo) {
        if (!PacketInterceptor.IlII()) {
            return;
        }
        if (PacketInterceptor.IIIl(this.key)) {
            return;
        }
        Language language = Language.getInstance();
        if (this.languageCache != language) {
            this.languageCache = language;
            this.translations = List.of(StringVisitable.plain((String)this.key));
        }
        PacketInterceptor.lIll(this.key);
        callbackInfo.cancel();
    }
}

