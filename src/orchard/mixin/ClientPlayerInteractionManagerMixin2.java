/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.y.IIllllII
 * Mixin target   : ClientPlayerInteractionManager
 *
 * Recovered strings in this class:
 *   - blockBreakingCooldown
 *   - syncSelectedSlot
 *   - lastSelectedSlot
 *   - selectedStack
 *   - breakingBlock
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.item.ItemStack
 *  org.spongepowered.asm.mixin.Mixin
 *  org.spongepowered.asm.mixin.gen.Accessor
 *  org.spongepowered.asm.mixin.gen.Invoker
 */
package orchard.mixin;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;
import org.spongepowered.asm.mixin.gen.Invoker;

@Environment(value=EnvType.CLIENT)
@Mixin(value={ClientPlayerInteractionManager.class})
public interface ClientPlayerInteractionManagerMixin2 {
    @Invoker(value="syncSelectedSlot")
    public void q96_invokeSyncSelectedSlot();

    @Accessor(value="lastSelectedSlot")
    public void q96_setLastSelectedSlot(int var1);

    @Accessor(value="blockBreakingCooldown")
    public void q96_setBbCooldown(int var1);

    @Accessor(value="blockBreakingCooldown")
    public int q96_getBbCooldown();

    @Accessor(value="selectedStack")
    public ItemStack q96_getSelectedStack();

    @Accessor(value="breakingBlock")
    public boolean q96_isBreakingBlock();

    @Accessor(value="lastSelectedSlot")
    public int q96_getLastSelectedSlot();

    @Accessor(value="selectedStack")
    public void q96_setSelectedStack(ItemStack var1);
}

