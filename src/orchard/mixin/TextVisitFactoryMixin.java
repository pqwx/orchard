/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIlllII
 * Mixin target   : TextVisitFactory
 *
 * Recovered strings in this class:
 *   - visitBackwards
 *   - visitFormatted
 *   - visitForwards
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
 *  net.minecraft.text.TextVisitFactory
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.injection.At
 *  org.spongepowered.asm.mixin.injection.ModifyVariable
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.text.TextVisitFactory;
import orchard.internal.IIlIllIII;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyVariable;

@Environment(value=EnvType.CLIENT)
@Mixin(value={TextVisitFactory.class})
public abstract class TextVisitFactoryMixin {
    @ModifyVariable(method={"visitForwards", "visitBackwards", "visitFormatted", "visitFormatted", "visitFormatted"}, at=@At(value="HEAD"), argsOnly=true, ordinal=0)
    private static String I(String string) {
        return IIlIllIII.lI(string);
    }
}

