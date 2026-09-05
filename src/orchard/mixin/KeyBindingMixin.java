/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIIIllll
 * Mixin target   : KeyBinding
 *
 * Recovered strings in this class:
 *   - timesPressed
 *   - boundKey
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.util.InputUtil$Key
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(value=EnvType.CLIENT)
@Mixin(value={KeyBinding.class})
public interface KeyBindingMixin {
    @Accessor(value="timesPressed")
    public void virel$setTimesPressed(int var1);

    @Accessor(value="timesPressed")
    public int virel$getTimesPressed();

    @Accessor(value="boundKey")
    public InputUtil.Key virel$getBoundKey();
}

