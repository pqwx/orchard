/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IllII
 * Mixin target   : PlayerInventory
 *
 * Recovered strings in this class:
 *   - selectedSlot
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.entity.player.PlayerInventory
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.player.PlayerInventory;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Environment(value=EnvType.CLIENT)
@Mixin(value={PlayerInventory.class})
public interface PlayerInventoryMixin2 {
    @Accessor(value="selectedSlot")
    public int q96_getSelectedSlot();

    @Accessor(value="selectedSlot")
    public void ilovcats$setSelectedSlot(int var1);

    @Accessor(value="selectedSlot")
    public void q96_setSelectedSlot(int var1);

    @Accessor(value="selectedSlot")
    public int ilovcats$getSelectedSlot();
}

