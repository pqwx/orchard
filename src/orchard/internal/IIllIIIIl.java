/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIIIIl
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
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.ItemStack
 *  net.minecraft.network.packet.s2c.play.EntityS2CPacket
 *  net.minecraft.screen.slot.Slot
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.s2c.play.EntityS2CPacket;
import net.minecraft.screen.slot.Slot;
import orchard.mixin.ClientPlayerEntityMixin2;
import orchard.mixin.ClientPlayerInteractionManagerMixin2;
import orchard.mixin.EntityS2CPacketMixin2;
import orchard.mixin.HandledScreenMixin;
import orchard.mixin.KeyBindingMixin;
import orchard.mixin.LivingEntityMixin3;
import orchard.mixin.MinecraftClientMixin2;
import orchard.mixin.PlayerInventoryMixin2;

@Environment(value=EnvType.CLIENT)
public final class IIllIIIIl {
    public static void I(ClientPlayerEntity clientPlayerEntity, int n) {
        ((ClientPlayerEntityMixin2)clientPlayerEntity).virel$setTicksSinceLastPositionPacketSent(n);
    }

    public static InputUtil.Key l(KeyBinding keyBinding) {
        return ((KeyBindingMixin)keyBinding).virel$getBoundKey();
    }

    public static void II(ClientPlayerInteractionManager clientPlayerInteractionManager) {
        ((ClientPlayerInteractionManagerMixin2)clientPlayerInteractionManager).q96_invokeSyncSelectedSlot();
    }

    public static boolean Il(MinecraftClient minecraftClient) {
        return ((MinecraftClientMixin2)minecraftClient).q96_doAttack();
    }

    public static void lI(ClientPlayerEntity clientPlayerEntity, double d) {
        ((ClientPlayerEntityMixin2)clientPlayerEntity).virel$setLastXClient(d);
    }

    public static int ll(KeyBinding keyBinding) {
        return ((KeyBindingMixin)keyBinding).virel$getTimesPressed();
    }

    public static void III(MinecraftClient minecraftClient) {
        ((MinecraftClientMixin2)minecraftClient).q96_doItemUse();
    }

    public static boolean IIl(ClientPlayerInteractionManager clientPlayerInteractionManager) {
        return ((ClientPlayerInteractionManagerMixin2)clientPlayerInteractionManager).q96_isBreakingBlock();
    }

    public static double IlI(ClientPlayerEntity clientPlayerEntity) {
        return ((ClientPlayerEntityMixin2)clientPlayerEntity).virel$getLastXClient();
    }

    public static float Ill(ClientPlayerEntity clientPlayerEntity) {
        return ((ClientPlayerEntityMixin2)clientPlayerEntity).virel$getLastYawClient();
    }

    public static void lII(MinecraftClient minecraftClient, int n) {
        ((MinecraftClientMixin2)minecraftClient).q96_setAtkCd(n);
    }

    public static void lIl(LivingEntity livingEntity, int n) {
        ((LivingEntityMixin3)livingEntity).virel$setJumpingCooldown(n);
    }

    public static int llI(PlayerInventory playerInventory) {
        return ((PlayerInventoryMixin2)playerInventory).q96_getSelectedSlot();
    }

    public static int lll(ClientPlayerEntity clientPlayerEntity) {
        return ((ClientPlayerEntityMixin2)clientPlayerEntity).virel$getTicksSinceLastPositionPacketSent();
    }

    public static int IIII(MinecraftClient minecraftClient) {
        return ((MinecraftClientMixin2)minecraftClient).q96_getUseCd();
    }

    public static void IIIl(ClientPlayerEntity clientPlayerEntity, float f) {
        ((ClientPlayerEntityMixin2)clientPlayerEntity).virel$setLastPitchClient(f);
    }

    public static double IIlI(ClientPlayerEntity clientPlayerEntity) {
        return ((ClientPlayerEntityMixin2)clientPlayerEntity).virel$getLastZClient();
    }

    public static float IIll(ClientPlayerEntity clientPlayerEntity) {
        return ((ClientPlayerEntityMixin2)clientPlayerEntity).virel$getLastPitchClient();
    }

    public static int IlII(ClientPlayerInteractionManager clientPlayerInteractionManager) {
        return ((ClientPlayerInteractionManagerMixin2)clientPlayerInteractionManager).q96_getBbCooldown();
    }

    public static void IlIl(ClientPlayerEntity clientPlayerEntity, double d) {
        ((ClientPlayerEntityMixin2)clientPlayerEntity).virel$setLastZClient(d);
    }

    public static void IllI(ClientPlayerInteractionManager clientPlayerInteractionManager, ItemStack itemStack) {
        ((ClientPlayerInteractionManagerMixin2)clientPlayerInteractionManager).q96_setSelectedStack(itemStack);
    }

    public static ItemStack Illl(ClientPlayerInteractionManager clientPlayerInteractionManager) {
        return ((ClientPlayerInteractionManagerMixin2)clientPlayerInteractionManager).q96_getSelectedStack();
    }

    public static double lIII(ClientPlayerEntity clientPlayerEntity) {
        return ((ClientPlayerEntityMixin2)clientPlayerEntity).virel$getLastYClient();
    }

    public static void lIIl(ClientPlayerInteractionManager clientPlayerInteractionManager, int n) {
        ((ClientPlayerInteractionManagerMixin2)clientPlayerInteractionManager).q96_setBbCooldown(n);
    }

    public static Slot lIlI(HandledScreen<?> handledScreen) {
        return ((HandledScreenMixin)handledScreen).q96fbb2be();
    }

    public static void lIll(ClientPlayerEntity clientPlayerEntity, float f) {
        ((ClientPlayerEntityMixin2)clientPlayerEntity).virel$setLastYawClient(f);
    }

    public static int llII(MinecraftClient minecraftClient) {
        return ((MinecraftClientMixin2)minecraftClient).q96_getAtkCd();
    }

    public static void llIl(PlayerInventory playerInventory, int n) {
        ((PlayerInventoryMixin2)playerInventory).q96_setSelectedSlot(n);
    }

    public static void lllI(ClientPlayerInteractionManager clientPlayerInteractionManager, int n) {
        ((ClientPlayerInteractionManagerMixin2)clientPlayerInteractionManager).q96_setLastSelectedSlot(n);
    }

    public static int llll(EntityS2CPacket entityS2CPacket) {
        return ((EntityS2CPacketMixin2)entityS2CPacket).ilovcats$getId();
    }

    public static void IIIII(MinecraftClient minecraftClient, int n) {
        ((MinecraftClientMixin2)minecraftClient).q96_setUseCd(n);
    }

    private IIllIIIIl() {
    }

    public static void IIIIl(MinecraftClient minecraftClient, int n) {
        ((MinecraftClientMixin2)minecraftClient).q96_setUseCd(n);
    }

    public static void IIIlI(KeyBinding keyBinding, int n) {
        ((KeyBindingMixin)keyBinding).virel$setTimesPressed(n);
    }

    public static int IIIll(ClientPlayerInteractionManager clientPlayerInteractionManager) {
        return ((ClientPlayerInteractionManagerMixin2)clientPlayerInteractionManager).q96_getLastSelectedSlot();
    }

    public static void IIlII(ClientPlayerEntity clientPlayerEntity, double d) {
        ((ClientPlayerEntityMixin2)clientPlayerEntity).virel$setLastYClient(d);
    }
}

