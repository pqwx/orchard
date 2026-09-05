/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIIllllI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - MIDDLE MOUSE
 *   - RIGHT MOUSE
 *   - LEFT MOUSE
 *   - MOUSE 
 *   - KEY 
 *   - movementSideways
 *   - syncSelectedSlot
 *   - getSelectedSlot
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.Blocks
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gl.Framebuffer
 *  net.minecraft.client.input.Input
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.network.ClientPlayerInteractionManager
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.render.RenderTickCounter
 *  net.minecraft.client.texture.NativeImage
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.client.util.InputUtil$Type
 *  net.minecraft.client.util.Window
 *  net.minecraft.component.ComponentType
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.WeaponComponent
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.entity.projectile.ProjectileUtil
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.network.packet.Packet
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket$Action
 *  net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket$Handler
 *  net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket
 *  net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket$PositionAndOnGround
 *  net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket
 *  net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket
 *  net.minecraft.registry.Registries
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.ActionResult$Success
 *  net.minecraft.util.ActionResult$SwingSource
 *  net.minecraft.util.Hand
 *  net.minecraft.util.PlayerInput
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec2f
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  org.lwjgl.glfw.GLFW
 */
package orchard.internal;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.image.BufferedImage;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.input.Input;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerInteractionManager;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.RenderTickCounter;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.util.InputUtil;
import net.minecraft.client.util.Window;
import net.minecraft.component.ComponentType;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.WeaponComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.PlayerActionC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractBlockC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractEntityC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.s2c.play.EntityPositionS2CPacket;
import net.minecraft.registry.Registries;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.PlayerInput;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import net.minecraft.world.RaycastContext;
import orchard.core.ClientEntrypoint;
import orchard.internal.IIIIlIl;
import orchard.internal.IIIlllIlI;
import orchard.internal.IIlIIIIIl;
import orchard.internal.IIlIll;
import orchard.internal.IIllIIIIl;
import orchard.internal.IIllllll;
import orchard.internal.IIllllllI;
import orchard.internal.IlIlIll;
import orchard.internal.IlIlllI;
import orchard.internal.IllIllI;
import orchard.internal.lIIIlIl;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIlIlll;
import orchard.internal.lllIl;
import orchard.internal.llllIll;
import orchard.mixin.KeyBindingMixin;
import orchard.module.combat.AutoCrystal;
import orchard.module.combat.AutoHitCrystal;
import orchard.module.iface.ClickSimulations;
import org.lwjgl.glfw.GLFW;

@Environment(value=EnvType.CLIENT)
public final class lIIllllI {
    private static final boolean[] I;
    private static boolean l;
    private static int II;
    private static int Il;
    private static final Field ll;
    private static final Method III;
    private static final Method IIl;
    private static long IlI;
    private static int Ill;
    private static final Method lII;
    private static final Field lIl;
    private static final Field llI;
    private static int lll;
    private static final Method IIII;
    private static int IIIl;
    private static volatile ComponentType<?> IIlI;
    private static final Field IIll;
    private static final llllIll IlII;
    private static boolean IlIl;
    private static int IllI;
    private static final Method Illl;
    private static final Method lIII;
    private static final Method lIIl;
    private static int lIlI;
    private static final IllIllI lIll;
    private static final Field llII;
    private static long llIl;
    private static final Field lllI;
    private static final Field llll;
    private static final ConcurrentLinkedQueue<IIlIll> IIIII;
    private static final Method IIIIl;
    private static int IIIlI;
    private static boolean IIIll;
    private static long IIlII;
    private static boolean IIlIl;
    private static final Field IIllI;
    private static final Method IIlll;
    private static int IlIII;
    private static int IlIIl;
    private static final Field IlIlI;
    private static int IlIll;
    private static long IllII;
    private static boolean IllIl;
    public static final double IlllI = 0.9;
    private static final boolean[] Illll;
    private static IIIlllIlI lIIII;
    private static boolean lIIIl;
    private static boolean lIIlI;
    private static int lIIll;
    private static boolean lIlII;
    private static final Method lIlIl;
    private static int lIllI;
    private static int lIlll;
    private static long llIII;
    private static int llIIl;
    private static long llIlI;
    private static final int[] lI;
    private static final String[] llIll;
    private static final Object[] lllII;

    /*
     * Enabled aggressive block sorting
     */
    public static void I(MinecraftClient minecraftClient, int n) {
        if (minecraftClient != null && minecraftClient.player != null && n > 0) {
            IllI = Math.max(IllI, minecraftClient.player.age + n);
        }
    }

    public static void l(PlayerInventory playerInventory, int n) {
        if (playerInventory != null) {
            IIllIIIIl.llIl(playerInventory, n);
            return;
        }
    }

    public static boolean II(MinecraftClient minecraftClient, IlIlIll ilIlIll) {
        return lIIllllI.IIIllll(minecraftClient, ilIlIll) && lIIllllI.IIllIIl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean Il(MinecraftClient minecraftClient, Entity entity) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        if (clientEntrypoint.IlI().IIlIl() == null) return false;
        if (!clientEntrypoint.IlI().IIlIl().IIIII(minecraftClient, entity)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static EntityHitResult lI(MinecraftClient minecraftClient, double d) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (minecraftClient.world == null) {
            return null;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.getCameraEntity() != null ? minecraftClient.getCameraEntity() : minecraftClient.player;
        Vec3d vec3d = clientPlayerEntity.getCameraPosVec(1.0f);
        Vec3d vec3d2 = clientPlayerEntity.getRotationVec(1.0f);
        Vec3d vec3d3 = vec3d.add(vec3d2.multiply(d));
        Box box = clientPlayerEntity.getBoundingBox().stretch(vec3d2.multiply(d)).expand(1.0, 1.0, 1.0);
        EntityHitResult entityHitResult = ProjectileUtil.raycast((Entity)clientPlayerEntity, (Vec3d)vec3d, (Vec3d)vec3d3, (Box)box, entity -> {
            if (entity.isSpectator()) return false;
            if (!(entity instanceof LivingEntity)) return false;
            if (IIllllllI.I(entity)) return false;
            return true;
        }, (double)(d * d));
        if (entityHitResult == null) return entityHitResult;
        HitResult hitResult = clientPlayerEntity.raycast(d, 1.0f, false);
        if (hitResult == null) return entityHitResult;
        if (hitResult.getType() == HitResult.Type.MISS) return entityHitResult;
        if (!(vec3d.squaredDistanceTo(hitResult.getPos()) < vec3d.squaredDistanceTo(entityHitResult.getPos()))) return entityHitResult;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void ll() {
        lIIllllI.IlIlI();
        lIllI = -1;
        lll = Integer.MIN_VALUE;
        IllII = Long.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void III(Packet<?> packet) {
        if (!(packet instanceof UpdateSelectedSlotC2SPacket)) return;
        UpdateSelectedSlotC2SPacket updateSelectedSlotC2SPacket = (UpdateSelectedSlotC2SPacket)packet;
        int n = updateSelectedSlotC2SPacket.getSelectedSlot();
        lIllI = n;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        lll = minecraftClient.player.age;
        IllII = System.nanoTime();
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (!lIIllllI.llllI()) return;
        if (clientEntrypoint == null) return;
        if (clientEntrypoint.IlI() == null) return;
        if (clientEntrypoint.IlI().IIIlII() == null) return;
        if (!clientEntrypoint.IlI().IIIlII().IIIlIIl()) return;
        int n2 = IIllIIIIl.llI(minecraftClient.player.getInventory());
        if (n == n2) return;
        clientEntrypoint.IlI().IIIlII().IlI(n);
    }

    public static int IIl(KeyBinding keyBinding) {
        if (keyBinding == null) {
            return 0;
        }
        return Math.max(0, IIllIIIIl.ll(keyBinding));
    }

    public static void IlI(MinecraftClient minecraftClient, float f, float f2) {
        if (minecraftClient == null || minecraftClient.player == null) {
            return;
        }
        float[] fArray = IlIlllI.IIIlll(minecraftClient, f, f2);
        if (fArray == null) {
            return;
        }
        f = fArray[0];
        minecraftClient.player.setYaw(f);
        minecraftClient.player.setPitch(fArray[1]);
        minecraftClient.player.setHeadYaw(f);
        try {
            minecraftClient.player.getClass().getMethod("setBodyYaw", Float.TYPE).invoke((Object)minecraftClient.player, Float.valueOf(f));
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            lIIllllI.lllIll(lllI, minecraftClient.player, f);
        }
    }

    public static Vec3d Ill(EntityPositionS2CPacket entityPositionS2CPacket) {
        return lIIllllI.IllIlII(entityPositionS2CPacket);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float lII(Packet<?> packet) {
        Float f = lIIllllI.lIlIlI(packet, "getPitch", "pitch");
        if (f == null) return Float.NaN;
        float f2 = f.floatValue();
        return f2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.attackKey != null) {
            lIIllllI.llIlIl(minecraftClient.options.attackKey);
            KeyBinding keyBinding = minecraftClient.options.attackKey;
            IIllIIIIl.IIIlI(keyBinding, IIllIIIIl.ll(keyBinding) + 1);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean llI(MinecraftClient minecraftClient, InputUtil.Key key) {
        if (minecraftClient == null) return false;
        if (minecraftClient.getWindow() == null) return false;
        if (lIIllllI.IlIIlll(key)) return false;
        long l2 = minecraftClient.getWindow().getHandle();
        switch (key.getCategory()) {
            case KEYSYM: 
            case SCANCODE: {
                boolean bl = lIIllllI.IlllIlI(minecraftClient, key.getCode());
                return bl;
            }
            default: {
                throw new MatchException(null, null);
            }
            case MOUSE: 
        }
        if (GLFW.glfwGetMouseButton((long)l2, (int)key.getCode()) != 1) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lll(MinecraftClient minecraftClient, int n) {
        if (lIIllllI.IllIllI(minecraftClient, n)) return true;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (IIIIlIl.Ill() != n) return false;
        return true;
    }

    public static void IIII() {
        IllIl = false;
    }

    private static void IIIl(KeyBinding keyBinding, InputUtil.Key key) {
        block14: {
            if (keyBinding == null || lIIllllI.IlIIlll(key)) {
                return;
            }
            try {
                keyBinding.setPressed(true);
                if (IIl != null) {
                    IIl.invoke(null, key, true);
                }
                if (Illl == null) break block14;
                Illl.invoke(null, key);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                keyBinding.setPressed(false);
                if (IIl != null) {
                    try {
                        IIl.invoke(null, key, false);
                    }
                    catch (ReflectiveOperationException reflectiveOperationException2) {}
                }
            }
            catch (Throwable throwable) {
                keyBinding.setPressed(false);
                if (IIl != null) {
                    try {
                        IIl.invoke(null, key, false);
                    }
                    catch (ReflectiveOperationException reflectiveOperationException) {
                        // empty catch block
                    }
                }
                throw throwable;
            }
        }
        keyBinding.setPressed(false);
        if (IIl != null) {
            try {
                IIl.invoke(null, key, false);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {}
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIlI(MinecraftClient minecraftClient) {
        IIlIll iIlIll;
        block4: {
            block3: {
                if (minecraftClient == null || minecraftClient.player == null) {
                    lIIllllI.IlIlI();
                    return;
                }
                while (true) {
                    iIlIll = IIIII.peek();
                    if (iIlIll == null) return;
                    if (minecraftClient.player.age < iIlIll.Il()) break block3;
                    IIIII.poll();
                    if (iIlIll.II() != minecraftClient.player) continue;
                    int n = lIIllllI.lllI(minecraftClient.player.getInventory());
                    if (n == iIlIll.l()) {
                        if (n == iIlIll.I()) continue;
                        lIIllllI.IIIIIII(minecraftClient, iIlIll.I(), false);
                        continue;
                    }
                    if (lIIllllI.IlllI(iIlIll, n)) break;
                }
                break block4;
            }
            return;
        }
        IIIII.offer(iIlIll);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean IIll(MinecraftClient minecraftClient, HitResult hitResult) {
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.interactionManager == null) {
            return false;
        }
        lIIllllI.IllIl(minecraftClient);
        HitResult hitResult2 = minecraftClient.crosshairTarget;
        minecraftClient.crosshairTarget = hitResult;
        try {
            IIllIIIIl.III(minecraftClient);
            boolean bl = true;
            return bl;
        }
        finally {
            minecraftClient.crosshairTarget = hitResult2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlII(MinecraftClient minecraftClient, int n) {
        InputUtil.Key key;
        if (minecraftClient == null) return;
        if (minecraftClient.options == null) return;
        if (n < 0) return;
        if (n > 8) {
            return;
        }
        KeyBinding[] keyBindingArray = minecraftClient.options.hotbarKeys;
        if (keyBindingArray != null && n < keyBindingArray.length && keyBindingArray[n] != null && !lIIllllI.IlIIlll(key = lIIllllI.IlllllI(keyBindingArray[n]))) {
            lIIllllI.IIlll(keyBindingArray[n]);
            return;
        }
        lIIllllI.IIIIIII(minecraftClient, n, true);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Enabled aggressive block sorting
     */
    public static String IlIl(InputUtil.Key key) {
        String string;
        if (lIIllllI.IlIIlll(key)) {
            return "None";
        }
        String string2 = key.getLocalizedText().getString();
        if (string2 != null && !string2.isBlank()) {
            return string2.toUpperCase(Locale.ROOT);
        }
        if (key.getCategory() == InputUtil.Type.MOUSE) {
            switch (key.getCode()) {
                case 2: {
                    return "MIDDLE MOUSE";
                }
                default: {
                    int n = key.getCode() + 1;
                    String string3 = "MOUSE ";
                    String string4 = string3 + n;
                    return string4;
                }
                case 1: {
                    return "RIGHT MOUSE";
                }
                case 0: 
            }
            return "LEFT MOUSE";
        }
        String string5 = GLFW.glfwGetKeyName((int)key.getCode(), (int)0);
        if (string5 == null) {
            int n = key.getCode();
            String string6 = "KEY ";
            string = string6 + n;
            return string;
        }
        string = string5.toUpperCase(Locale.ROOT);
        return string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IllI(int n) {
        if (n < 0) return false;
        if (n >= Illll.length) return false;
        if (!Illll[n]) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void Illl(MinecraftClient minecraftClient, IIllllll iIllllll) {
        if (minecraftClient == null || minecraftClient.player == null) {
            return;
        }
        IlII.IIIlI(new lIIlIlll(minecraftClient), iIllllll);
    }

    public static void lIII(Input input, float f, float f2) {
        if (input == null) {
            return;
        }
        try {
            if (ll != null && IIll != null) {
                ll.setFloat(input, f);
                IIll.setFloat(input, f2);
            } else if (llII != null) {
                llII.set(input, new Vec2f(f2, f));
            }
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        if (input.playerInput != null) {
            boolean bl = f > 0.0f;
            boolean bl2 = f < 0.0f;
            boolean bl3 = f2 > 0.0f;
            boolean bl4 = f2 < 0.0f;
            input.playerInput = new PlayerInput(bl, bl2, bl3, bl4, input.playerInput.jump(), input.playerInput.sneak(), input.playerInput.sprint());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lIIl(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) {
            return false;
        }
        ComponentType<?> componentType = lIIllllI.lllllI();
        if (componentType == null) {
            return false;
        }
        ComponentType<?> componentType2 = componentType;
        WeaponComponent weaponComponent = (WeaponComponent)itemStack.get(componentType2);
        if (weaponComponent == null) return false;
        if (!(weaponComponent.disableBlockingForSeconds() > 0.0f)) return false;
        return true;
    }

    public static boolean lIlI(MinecraftClient minecraftClient, Entity entity) {
        return lIIllllI.Il(minecraftClient, entity);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ActionResult lIll(MinecraftClient minecraftClient, Hand hand) {
        if (minecraftClient == null) return ActionResult.FAIL;
        if (minecraftClient.player == null) return ActionResult.FAIL;
        if (minecraftClient.interactionManager == null) return ActionResult.FAIL;
        if (hand != null) {
            lIIllllI.IllIl(minecraftClient);
            return minecraftClient.interactionManager.interactItem((PlayerEntity)minecraftClient.player, hand);
        }
        return ActionResult.FAIL;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float llII(LivingEntity livingEntity, float f) {
        if (livingEntity == null) {
            return 0.0f;
        }
        float f2 = lIIllllI.lIlIIl(llll, livingEntity, livingEntity.getYaw());
        float f3 = lIIllllI.lIlIIl(IlIlI, livingEntity, f2);
        return MathHelper.lerpAngleDegrees((float)f, (float)f3, (float)f2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean llIl(int n) {
        if (n < 0) return false;
        if (n >= I.length) return false;
        if (!I[n]) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int lllI(PlayerInventory playerInventory) {
        if (playerInventory == null) {
            return 0;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return IIllIIIIl.llI(playerInventory);
        if (minecraftClient.player == null) return IIllIIIIl.llI(playerInventory);
        if (minecraftClient.player.getInventory() != playerInventory) return IIllIIIIl.llI(playerInventory);
        if (!IlII.IIll()) return IIllIIIIl.llI(playerInventory);
        return IlII.IIII(new lIIlIlll(minecraftClient));
    }

    public static void llll() {
        llIIl = Math.max(0, llIIl - 1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean IIIII(MinecraftClient minecraftClient, Object object, int n, BooleanSupplier booleanSupplier) {
        ++IlIll;
        try {
            boolean bl = lIIllllI.IlIIIl(minecraftClient, object, n, booleanSupplier);
            return bl;
        }
        finally {
            IlIll = Math.max(0, IlIll - 1);
            ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
            if (clientEntrypoint != null && clientEntrypoint.IlI() != null && clientEntrypoint.IlI().IIIlII() != null) {
                clientEntrypoint.IlI().IIIlII().lI();
            }
        }
    }

    public static void IIIIl(MinecraftClient minecraftClient, double d, double d2, double d3, boolean bl) {
        if (minecraftClient == null || minecraftClient.getNetworkHandler() == null) {
            return;
        }
        try {
            Class<PlayerMoveC2SPacket.PositionAndOnGround> clazz = PlayerMoveC2SPacket.PositionAndOnGround.class;
            try {
                Constructor constructor = clazz.getConstructor(Double.TYPE, Double.TYPE, Double.TYPE, Boolean.TYPE, Boolean.TYPE);
                minecraftClient.getNetworkHandler().sendPacket((Packet)constructor.newInstance(d, d2, d3, bl, false));
                return;
            }
            catch (NoSuchMethodException noSuchMethodException) {
                Constructor constructor = clazz.getConstructor(Double.TYPE, Double.TYPE, Double.TYPE, Boolean.TYPE);
                minecraftClient.getNetworkHandler().sendPacket((Packet)constructor.newInstance(d, d2, d3, bl));
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static IIlIIIIIl IIIlI(MinecraftClient minecraftClient, Object object, int n, IllIllI illIllI, int n2, boolean bl, Runnable runnable) {
        if (minecraftClient != null) {
            if (minecraftClient.player != null) {
                return IlII.IIl(new lIIlIlll(minecraftClient), object, n, illIllI, n2, bl, runnable);
            }
        }
        return new IIlIIIIIl(0L, object);
    }

    public static void IIIll(MinecraftClient minecraftClient, int n) {
        lIIllllI.IIIIIII(minecraftClient, n, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIlII(MinecraftClient minecraftClient, float f, float f2) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) {
            return;
        }
        float[] fArray = IlIlllI.IIIlll(minecraftClient, f, f2);
        if (fArray == null) {
            return;
        }
        float f3 = minecraftClient.player.getYaw();
        float f4 = MathHelper.clamp((float)minecraftClient.player.getPitch(), (float)-90.0f, (float)90.0f);
        float f5 = MathHelper.wrapDegrees((float)(fArray[0] - f3));
        float f6 = fArray[1] - f4;
        if (!Float.isFinite(f5)) return;
        if (!Float.isFinite(f6)) {
            return;
        }
        float f7 = f3 + MathHelper.clamp((float)f5, (float)-45.0f, (float)45.0f);
        float f8 = MathHelper.clamp((float)(f4 + MathHelper.clamp((float)f6, (float)-45.0f, (float)45.0f)), (float)-90.0f, (float)90.0f);
        minecraftClient.player.setYaw(f7);
        minecraftClient.player.setPitch(f8);
        lIIllllI.IIlIIll(minecraftClient, f7);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIlIl(Object object) {
        if (object == null) {
            return;
        }
        IIIlllIlI iIIlllIlI = lIIII;
        if (iIIlllIlI != null && iIIlllIlI.l().I() == object) {
            lIIII = null;
            IIIll = false;
        }
        IlII.l(object);
    }

    public static long IIllI() {
        return llIlI;
    }

    public static void IIlll(KeyBinding keyBinding) {
        InputUtil.Key key = lIIllllI.IlllllI(keyBinding);
        if (keyBinding == null || lIIllllI.IlIIlll(key)) {
            return;
        }
        try {
            if (Illl != null) {
                Illl.invoke(null, key);
                return;
            }
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        KeyBinding.onKeyPressed((InputUtil.Key)key);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IlIII(MinecraftClient minecraftClient, Object object, int n, IllIllI illIllI, int n2, boolean bl, Runnable runnable) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        IIlIIIIIl iIlIIIIIl = IlII.lllI(new lIIlIlll(minecraftClient), object, n, illIllI, n2, bl, runnable);
        if (iIlIIIIIl.II() == 0L) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlIIl(MinecraftClient minecraftClient) {
        IIIlllIlI iIIlllIlI = lIIII;
        if (iIIlllIlI == null) return;
        if (!IIIll) return;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) {
            return;
        }
        lIIII = null;
        IIIll = false;
        if (iIIlllIlI.I() != minecraftClient.player) {
            return;
        }
        IlII.lI(new lIIlIlll(minecraftClient), iIIlllIlI.l(), lIIlIllI.II);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlIlI() {
        lIIlI = false;
        IIIII.clear();
        IlII.IllI();
        lIllI = -1;
        lll = Integer.MIN_VALUE;
        IllII = Long.MIN_VALUE;
        IIIIlIl.lII();
        lIlI = 0;
        lIIll = 0;
        llIIl = 0;
        IlIll = 0;
        lIlII = false;
        l = false;
        lIIII = null;
        IIIll = false;
        IIIlI = -1;
        IlIl = false;
        IllIl = false;
    }

    public static void IlIll(MinecraftClient minecraftClient, int n) {
        lIIllllI.IllIII(minecraftClient, n, 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static float IllII(Packet<?> packet) {
        Float f = lIIllllI.lIlIlI(packet, "getYaw", "yaw");
        if (f == null) return Float.NaN;
        float f2 = f.floatValue();
        return f2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IllIl(MinecraftClient minecraftClient) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return;
        if (clientEntrypoint.IlI() != null) {
            ClickSimulations clickSimulations = clientEntrypoint.IlI().lIlII();
            if (clickSimulations == null) return;
            if (!clickSimulations.IIIlIIl()) return;
            if (!clickSimulations.IlIlIII()) return;
            clickSimulations.lIll(minecraftClient);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IlllI(IIlIll iIlIll, int n) {
        IIlIll iIlIll2;
        Iterator<IIlIll> iterator = IIIII.iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while ((iIlIll2 = iterator.next()).II() != iIlIll.II() || iIlIll2.l() != n || iIlIll2.I() != iIlIll.l());
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static IlIlIll Illll(MinecraftClient minecraftClient, Object object, int n, IllIllI illIllI, int n2, boolean bl) {
        int n3;
        if (minecraftClient == null) return IlIlIll.I(n);
        if (minecraftClient.player == null) return IlIlIll.I(n);
        if (object == null) return IlIlIll.I(n);
        if (n < 0) return IlIlIll.I(n);
        if (n > 8) return IlIlIll.I(n);
        if (lIIII != null) return IlIlIll.I(n);
        if (!l) {
            n3 = minecraftClient.player.age;
        }
        return IlIlIll.I(n);
        int n4 = IlII.IIII(new lIIlIlll(minecraftClient));
        boolean bl2 = n4 != n;
        IIlIIIIIl iIlIIIIIl = IlII.IIl(new lIIlIlll(minecraftClient), object, n, illIllI, -1, true, null);
        if (iIlIIIIIl.II() == 0L) {
            return IlIlIll.I(n);
        }
        if (bl && n2 <= 0) {
            lIIllllI.IIlIlII(minecraftClient);
        }
        int n5 = bl2 ? n3 + Math.max(0, n2) : n3;
        return new IlIlIll(n4, n, n3, n5, bl2, true, iIlIIIIIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIIII(MinecraftClient minecraftClient) {
        if (!lIIlI) {
            return;
        }
        lIIlI = false;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.getNetworkHandler() == null) {
            return;
        }
        int n = IIllIIIIl.llI(minecraftClient.player.getInventory());
        if (n < 0) return;
        if (n <= 8) {
            new lIIlIlll(minecraftClient).I(IllIllI.II, n);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean lIIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.player.age != IIIl) return false;
        if (System.identityHashCode(minecraftClient.player) != IlIIl) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void lIIlI(MinecraftClient minecraftClient, Object object, int n, int n2) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (object == null) {
            return;
        }
        if (IlII.Ill(object, minecraftClient.player.age, n2, null)) return;
        lIIllllI.llIII(minecraftClient, object, lIIlIllI.II);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lIIll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.interactionManager != null) {
            lIIllllI.IllIll(minecraftClient);
            Entity entity = lIIllllI.llIlII(minecraftClient);
            if (!lIIllllI.Il(minecraftClient, entity)) return lIIllllI.IIIlIl(minecraftClient);
            return false;
        }
        return false;
    }

    public static boolean lIlII(Object object) {
        return IlII.llII(object);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean lIlIl(MinecraftClient minecraftClient, EntityHitResult entityHitResult) {
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.interactionManager == null || entityHitResult == null) {
            return false;
        }
        Entity entity = entityHitResult.getEntity();
        if (entity == null) {
            return false;
        }
        if (lIIllllI.lIIIl(minecraftClient)) {
            return false;
        }
        lIIllllI.IllIll(minecraftClient);
        if (lIIllllI.Il(minecraftClient, entity)) {
            return false;
        }
        ++Il;
        try {
            lIIllllI.llIll(minecraftClient);
            ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
            clientPlayerEntity.swingHand(Hand.MAIN_HAND);
            minecraftClient.interactionManager.attackEntity((PlayerEntity)clientPlayerEntity, entity);
            boolean bl = true;
            return bl;
        }
        finally {
            Il = Math.max(0, Il - 1);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lIllI(BlockState blockState) {
        if (blockState == null) return true;
        if (blockState.isAir()) return true;
        if (blockState.isOf(Blocks.FIRE)) return true;
        if (blockState.isOf(Blocks.SOUL_FIRE)) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean lIlll(InputUtil.Key key) {
        if (key == null) return false;
        if (key.getCategory() != InputUtil.Type.MOUSE) return false;
        if (lIIllllI.IlIIlll(key)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void llIII(MinecraftClient minecraftClient, Object object, lIIlIllI lIIlIllI2) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (object == null) return;
        lIIlIllI lIIlIllI3 = lIIlIllI2 == null ? lIIlIllI.II : lIIlIllI2;
        IIIlllIlI iIIlllIlI = lIIII;
        if (iIIlllIlI != null && iIIlllIlI.l().I() == object) {
            if (lIIlIllI3 != lIIlIllI.II) {
                lIIII = null;
                IIIll = false;
            } else {
                return;
            }
        }
        int n = lIIlIllI3 != lIIlIllI.Il || IlII.I(object) != IllIllI.II ? -1 : IlII.Illl(object);
        IlII.IIIl(new lIIlIlll(minecraftClient), object, lIIlIllI3);
        if (n < 0) return;
        if (n >= 9) return;
        IIllIIIIl.llIl(minecraftClient.player.getInventory(), n);
        if (minecraftClient.interactionManager == null) return;
        IIllIIIIl.lllI(minecraftClient.interactionManager, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ItemStack llIIl(ClientPlayerEntity clientPlayerEntity) {
        ItemStack itemStack;
        int n;
        if (clientPlayerEntity == null) {
            return ItemStack.EMPTY;
        }
        PlayerInventory playerInventory = clientPlayerEntity.getInventory();
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        int n2 = n = minecraftClient == null || clientPlayerEntity != minecraftClient.player ? IIllIIIIl.llI(playerInventory) : lIIllllI.IIllIlI(playerInventory);
        if (n >= 0 && n < 9) {
            itemStack = playerInventory.getStack(n);
            return itemStack;
        }
        itemStack = ItemStack.EMPTY;
        return itemStack;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean llIlI() {
        if (IIIlI >= 0) return true;
        if (IlIl) return true;
        if (IlII.lII()) return true;
        if (lIIII != null) return true;
        if (lIlI > 0) return true;
        if (llIIl > 0) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void llIll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.interactionManager != null) {
            IIllIIIIl.lIIl(minecraftClient.interactionManager, 0);
            IIllIIIIl.lII(minecraftClient, 0);
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static InputUtil.Key lllII(int n) {
        InputUtil.Key key;
        block1: {
            if (n >= 0) break block1;
            key = InputUtil.UNKNOWN_KEY;
            return key;
        }
        key = InputUtil.Type.MOUSE.createFromCode(n);
        return key;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean lllIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null || minecraftClient.player == null) {
            return false;
        }
        lIIllllI.IllIll(minecraftClient);
        HitResult hitResult = minecraftClient.crosshairTarget;
        Vec3d vec3d = minecraftClient.player.getEyePos();
        Vec3d vec3d2 = minecraftClient.player.getRotationVec(1.0f);
        Vec3d vec3d3 = vec3d.add(vec3d2.multiply(3.0));
        minecraftClient.crosshairTarget = BlockHitResult.createMissed((Vec3d)vec3d3, (Direction)Direction.UP, (BlockPos)BlockPos.ORIGIN);
        try {
            boolean bl = lIIllllI.lIIIIII(minecraftClient);
            return bl;
        }
        finally {
            minecraftClient.crosshairTarget = hitResult;
        }
    }

    private static boolean llllI() {
        return IlIll <= 0;
    }

    public static Entity lllll(MinecraftClient minecraftClient) {
        if (minecraftClient == null || lIlIl == null) {
            return null;
        }
        try {
            return (Entity)lIlIl.invoke((Object)minecraftClient, new Object[0]);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return null;
        }
    }

    public static void IIIIII(MinecraftClient minecraftClient, int n) {
        lIIllllI.IIIIIIl(minecraftClient, n, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIIIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.hotbarKeys == null) {
            return false;
        }
        KeyBinding[] keyBindingArray = minecraftClient.options.hotbarKeys;
        int n = keyBindingArray.length;
        int n2 = 0;
        while (n2 < n) {
            KeyBinding keyBinding = keyBindingArray[n2];
            if (keyBinding != null) {
                KeyBindingMixin keyBindingMixin;
                if (keyBinding.isPressed()) return true;
                if (keyBinding instanceof KeyBindingMixin && (keyBindingMixin = (KeyBindingMixin)keyBinding).virel$getTimesPressed() > 0) {
                    return true;
                }
            }
            ++n2;
        }
        return false;
    }

    public static void IIIIlI() {
        ++llIIl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int IIIIll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) {
            return 0;
        }
        int n = IIllIIIIl.llII(minecraftClient);
        return n;
    }

    public static int IIIlII(Packet<?> packet) {
        try {
            return (Integer)packet.getClass().getMethod("id", new Class[0]).invoke(packet, new Object[0]);
        }
        catch (Exception exception) {
            try {
                return (Integer)packet.getClass().getMethod("entityId", new Class[0]).invoke(packet, new Object[0]);
            }
            catch (Exception exception2) {
                try {
                    return (Integer)packet.getClass().getMethod("getEntityId", new Class[0]).invoke(packet, new Object[0]);
                }
                catch (Exception exception3) {
                    return -1;
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IIIlIl(MinecraftClient minecraftClient) {
        EntityHitResult entityHitResult;
        long l2 = IlI;
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (hitResult instanceof EntityHitResult && (entityHitResult = (EntityHitResult)hitResult).getEntity() instanceof EndCrystalEntity) {
            lIIllllI.IIllll(minecraftClient);
        }
        boolean bl = IIllIIIIl.Il(minecraftClient);
        if (bl) return true;
        if (IlI != l2) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIIllI(MinecraftClient minecraftClient) {
        ++IIlII;
        l = lIIllllI.IIIIIl(minecraftClient);
        if (l) {
            lIIllllI.IlIlIlI();
        }
        lIIllllI.Illl(minecraftClient, IIllllll.Il);
        IllIl = true;
        lIIllllI.IIlIlII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIIlll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.getNetworkHandler() == null) {
            return false;
        }
        minecraftClient.getNetworkHandler().sendPacket((Packet)new PlayerActionC2SPacket(PlayerActionC2SPacket.Action.RELEASE_USE_ITEM, BlockPos.ORIGIN, Direction.DOWN));
        return true;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    public static boolean IIlIII(MinecraftClient minecraftClient, InputUtil.Key key) {
        KeyBinding keyBinding;
        int n;
        int n2;
        KeyBinding[] keyBindingArray;
        if (minecraftClient == null) return false;
        if (minecraftClient.options == null) return false;
        if (lIIllllI.IlIIlll(key)) return false;
        if (minecraftClient.options.hotbarKeys != null) {
            keyBindingArray = minecraftClient.options.hotbarKeys;
            n2 = keyBindingArray.length;
            n = 0;
            if (true) {
                if (n >= n2) return false;
                keyBinding = keyBindingArray[n];
            }
        } else {
            return false;
        }
        while (keyBinding == null || !key.equals((Object)lIIllllI.IlllllI(keyBinding))) {
            ++n;
            if (n >= n2) return false;
            keyBinding = keyBindingArray[n];
        }
        return true;
    }

    private static ComponentType<?> IIlIIl() {
        ComponentType componentType = IIlI;
        if (componentType != null) {
            return componentType;
        }
        try {
            Field field = DataComponentTypes.class.getField("BLOCKS_ATTACKS");
            componentType = (ComponentType)field.get(null);
        }
        catch (Throwable throwable) {
            componentType = null;
        }
        IIlI = componentType;
        return componentType;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIlIlI(long l2, int n, int n2) {
        if (n < 0) return;
        if (n < Illll.length) {
            if (n2 == 1) {
                lIIllllI.Illll[n] = true;
                lIIllllI.I[n] = true;
                return;
            }
            if (n2 != 0) return;
            lIIllllI.Illll[n] = false;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static IlIlIll IIlIll(MinecraftClient minecraftClient, int n, int n2, boolean bl) {
        int n3;
        boolean bl2;
        int n4;
        PlayerInventory playerInventory;
        int n5;
        block5: {
            block3: {
                block4: {
                    block2: {
                        if (minecraftClient == null) return IlIlIll.I(n);
                        if (minecraftClient.player == null) return IlIlIll.I(n);
                        if (n < 0) return IlIlIll.I(n);
                        if (n > 8) break block2;
                        n5 = minecraftClient.player.age;
                        playerInventory = minecraftClient.player.getInventory();
                        n4 = lIIllllI.lllI(playerInventory);
                        if (n4 == n) break block3;
                        break block4;
                    }
                    return IlIlIll.I(n);
                }
                bl2 = true;
                break block5;
            }
            bl2 = false;
        }
        boolean bl3 = bl2;
        lIIllllI.IIIIIII(minecraftClient, n, bl);
        if (bl && n2 <= 0) {
            lIIllllI.IIlIlII(minecraftClient);
        }
        if ((n3 = lIIllllI.lllI(playerInventory)) == n) {
            int n6 = bl3 ? n5 + Math.max(0, n2) : n5;
            return new IlIlIll(n4, n, n5, n6, bl3, true, null);
        }
        return IlIlIll.I(n);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        void var14_49;
        int n = 17835;
        String string = "\u05cb\u052f\u05a6\u0543\u0582\u051d\u0500\u05f3\u052e\u05cc\u051c\u050f\u0515\u058d\u0535\u05c8\ueba8\ueb4b\uebc2\ueb27\uebe2\ueb53\ueb7c\ueb87\ueb4c\ueb83\ueb7e\ueb01\ua6b0\ua62b\ua6aa\ua638\ua6e1\ua676\ua664\ua6e1\uf153\uf1ef\uf111\uf1e6\uf11c\uf1a1\uf1e2\uf11f\uaf9d\uaf1d\uafed\uaf30\uafce\uaf78\uaf7d\uafda\uaf50\uafad\uaf6d\uaf78\uaf5a\uafe0\uaf7e\uaf83\u5e9b\u5e20\u5e99\u5e30\u5ec8\u5e7e\u5e22\u5eb7\u5e53\u5e83\u5e4c\u5e79\u5e5a\u5e85\u5e2f\u5e80\uf7f6\uf758\uf7f1\uf755\uf7a1\uf711\uf72c\uf7fe\uf718\uf7fb\uf72c\uf74c\uf72d\uf7bb\uf750\uf7ed\u1fb4\u1f1a\u1ff6\u1f08\u1fe4\u1f6d\u1f4f\u1f9d\u08de\u0822\u08a9\u0879\u08c8\u083b\u0868\u0895\ufb0c\ufbef\ufb66\ufb83\ufb44\ufbe7\ufbf2\ufb26\u09bb\u093e\u09c8\u0938\u6d04\u6d8d\u6d6c\u6df2\u7b26\u7baa\u7b7a\u7ba9\u7b72\u7bce\u7b81\u7b02\u7bf2\u7b27\u7bc6\u7b8f\ucc83\ucc60\ucce9\ucc0c\uccce\ucc68\ucc71\uccac\ucc65\ucc81\ucc6d\ucc58\ucc5b\uccef\ucc34\ucc87\u461f\u46a0\u4640\u46fd\u464a\u46c7\u46d8\u4604\u46d7\u462d\u46b1\u46fa\u46c5\u467e\u46f5\u460b\u464b\u4682\u4695\u4645\u45c4\u4561\u459f\u454b\u4594\u4516\u4560\u4594\u4520\u45c5\u4515\u456e\u9862\u9881\u9808\u98ed\u9828\u98a3\u988c\u986b\u9885\u9863\u98ce\u98b2\u98b7\u980e\u98d2\u982a\u9826\u9892\u98c8\u9855\u2f68\u2f8c\u2f05\u2ff8\u2f3a\u2f84\u2f89\u2f40\u2f88\u2f6e\u2f81\u2f90\u2fbc\u2f13\u2fe9\u2f18\u1f81\u1f65\u1fec\u1f11\u1fd3\u1f6d\u1f60\u1fa9\u1f61\u1f87\u1f68\u1f79\u1f55\u1ffa\u1f00\u1ff1\uc81d\uc893\uc847\uc892\uc84a\uc8f4\uc8db\uc827\uc8f6\uc82b\uc8f1\uc8f3\uc8cc\uc81d\uc8ea\uc869\uc85e\uc8a5\uc887\uc802\u68b9\u6837\u68e3\u6836\u68ee\u6850\u687f\u6883\u6852\u688f\u6855\u6844\u686b\u68d7\u680b\u68e1\u68f9\u683c\u6827\u688f\u682f\u6807\u6874\u68d8\u1d35\u1dbb\u1d6f\u1dba\u1d62\u1ddc\u1df3\u1d0f\u1dde\u1d03\u1dd9\u1dcb\u1de2\u1d5b\u1d8b\u1d40\u1d73\u1db3\u1da2\u1d76\ube39\ubeb7\ube63\ubeb6\ube6e\ubed0\ubeff\ube03\ubed2\ube0f\ubed5\ubec7\ubeee\ube57\ube87\ube4c\ube7f\ubebf\ubeae\ube7a\u99de\u9978\u99c3\u9942\u998d\u9925\u9979\u99da\u992e\u99bd\u9901\u9902\u9917\u99b9\u9927\u99da\uddd2\udd37\uddc8\udd7a\udd83\udd15\udd33\udded\udd3c\uddc4\udd3f\udd14\udd0c\udda9\udd61\udd88\udd80\udd52\udd2a\uddfb\udd42\udd5f\udd1a\uddb6\u23bc\u235d\u23e2\u235f\u23eb\u2356\u236a\u23bb\u235e\u2385\u2354\u236f\u2368\u23bd\u230a\u23e3\u0a58\u0abc\u0a35\u0ad0\u0a13\u0a9e\u0ab1\u0a7b\u0ab7\u0a4d\u0aee\u0a98\u0a89\u0a5d\u0ae3\u0a05\u0a19\u0ae1\u0ab2\u0a1e\u11c0\u1124\u11ad\u1148\u1189\u1106\u1139\u11cd\u1120\u11c5\u1176\u1104\u111a\u11ab\u1145\u11b0\u1180\u117d\u1171\u11f3\ue250\ue2b3\ue23a\ue2df\ue21e\ue291\ue2ae\ue25a\ue2b7\ue252\ue2e1\ue293\ue28d\ue23c\ue2d2\ue227\ue217\ue2ea\ue2e6\ue264\uc3b0\uc315\uc3eb\uc32c\uc3e3\uc359\uc367\uc38f\uc350\uc397\uc309\uc31a\ueb20\uebb8\ueb51\uebbb\ueb76\uebf4\uebc5\ueb15\uebc0\ueb35\uebf7\uebc6\uebf5\ueb48\ueb84\ueb23\u46dc\u4644\u46ad\u4647\u468a\u4608\u460b\u46e3\u463f\u46da\u4635\u463a\u4609\u46b4\u4678\u46df\uae89\uae17\uaef1\uae0d\uaeda\uae76\uae5b\uaeb3\uae6f\uae8a\uae65\uae6a\uae59\uaee4\uae28\uae8f\u47e4\u4740\u478c\u4769\u47ee\u4737\u4722\u47e8\u470f\u47dd\u470c\u4727\u4730\u47a0\u4717\u47b9\u47a4\u471a\u4705\u47fe\u4773\u477b\u4753\u47ea\u47b6\u477b\u4742\u4759\u47cc\u471c\u4783\u47a2\u47a3\u4753\u47d0\u4719\u47b4\u4726\u4705\u4789\u471e\u47c2\u471f\u472f\u475f\u47c5\u472c\u47d4\u4795\u470f\u473a\u479d\u4726\u477d\u477c\u47e4\u47ca\u472c\u4722\u477e\uc087\uc01f\uc0f9\uc02b\uc0d6\uc069\uc065\uc0bd\uc063\uc0b8\uc069\uc044\uc050\uc0da\uc03f\uc0e8\uc0c7\uc007\uc030\uc0c2\u4a5c\u4ac4\u4a22\u4af0\u4a0d\u4ab2\u4abe\u4a66\u4ab8\u4a63\u4ab2\u4a9f\u4a8b\u4a01\u4ae4\u4a33\u4a1c\u4adc\u4aeb\u4a19\u98b0\u9828\u98ce\u981c\u98e1\u985e\u9852\u988a\u9854\u988f\u985e\u9873\u9867\u98ed\u9808\u98df\u98f0\u9830\u9807\u98f5\u2c2c\u2ca6\u2c61\u2cc8\u2c7c\u2cc1\u2cfd\u2c2c\u2cc9\u2c12\u2cc3\u2cf8\u2cff\u2c2a\u2c9d\u2c74\u740b\u74f7\u7409\u7483\u7441\u74ff\u74e6\u743b\u74e0\u7405\u74c0\u74d9\u74cd\u7468\u74e1\u7474\u7459\u7487\u7494\u7423\u7480\u74b3\u748b\u742b\u7441\u74d3\u74e8\u7492\u743e\u74b4\u744b\u7452\u7451\u74c3\u7435\u74fe\u7447\u74fe\u74b6\u746d\u74a7\u7471\u7498\u74da\u74a4\u7427\u74d9\u740c\u746a\u74a0\u74e9\u746a\u74d2\u74f1\u74e3\u7415\u7466\u7486\u74f2\u74f6\u7461\u74f0\u7413\u7431\u742e\u74a3\u7428\u74da\u743e\u74a9\u74d3\u743b\u74bb\u7456\u74bf\u7491\u74fa\u745c\u74e5\u7424\u742d\u74a6\u748f\u7434\u74c1\u749f\u74f0\u7459\ucbd9\ucb53\ucb94\ucb6b\ucb8a\ucb37\ucb1c\ucbd5\ucb09\ucbe7\ucb18\ucb07\ucb0c\ucbb0\ucb5e\ucb80\ud482\ud408\ud4cf\ud433\ud4d4\ud47c\ud453\ud4b8\ud461\ud486\ud44b\ud442\u95a4\u9530\u95e0\u9533\u95e8\u9554\u951b\u9598\u9554\u95ad\u9574\u956d\u956c\u95d3\u950c\u95d4\u95f8\u953b\u955f\u95b4\u952a\u9564\u952f\u95ba\u95e1\u9576\u9544\u956d\u959d\u951c\u95cd\u95c8\u95fa\u9578\u95d9\u957c\uf74c\uf7d7\uf755\uf7c3\uf71d\uf7a0\uf7e3\uf71e\uae05\uaee5\uae5e\uae99\uae53\uaeee\uaead\uae50\ue6a3\ue638\ue6ba\ue62c\ue6f2\ue64f\ue60c\ue6f1\ua1ce\ua12e\ua195\ua152\ua198\ua125\ua166\ua19b\uc9e4\uc946\uc99a\uc977\uc9b1\uc90b\uc90e\uc9ce\ue68d\ue66d\ue6da\ue616\ue6dd\ue65f\ue62d\ue6b6\ud454\ud4cf\ud40b\ud4d5\ud407\ud4bb\ud4f4\ud45d\ud4ba\ud478\ud49d\ud4fa\u6212\u6289\u624d\u6293\u4fbb\u4f27\u4fd1\u4f2c\u4fea\u4f40\u4f4a\u4fed\u70ad\u7036\u70ee\u7032\u70fa\u7041\u7044\u7087\u707e\u70ab\u7066\u7076\u7073\u70c5\u701d\u70ae\u0926\u0980\u097e\u09af\u0977\u09e7\u09d8\u090b\u09c1\u0934\u099c\u098f\u4b57\u4bf2\u4b2e\u4bc2\u4b00\u4b9a\u4bf7\u4b68\u4bb4\u4b6f\u4bb4\u4bfd\ud4ca\ud454\ud4a2\ud455\ud499\ud430\ud463\ud49e\u3e7d\u3edc\u3e67\u3ee0\u3e2e\u3e82\u3edc\u3e2c\ub9b6\ub92e\ub9c7\ub92d\ub9e3\ub97f\ub957\ub9bf\ub958\ub98a\ub943\ub95d\ub962\ub9b3\ub944\ub9c7\ub9f0\ub90b\ub929\ub9ac\uddc9\udd51\uddb8\udd52\udd9c\udd00\udd28\uddc0\udd27\uddf5\udd3c\udd6b\udd1c\udda2\udd72\udda4\uec3d\ueca5\uec4c\ueca6\uec68\uecf4\uecdc\uec34\uecd3\uec01\uecc8\uec99\uecef\uec56\uec92\uec4d\u7589\u7511\u75f8\u7512\u75dc\u7540\u7568\u7580\u7567\u75b5\u757c\u7576\u755e\u75e2\u7522\u75e5\u75cc\u7530\u7563\u75cf\u3d48\u3dac\u3d1b\u3de5\u3d1a\u3da4\u3d8f\u3d70\u6988\u696c\u69e5\u6900\u69c1\u695e\u6943\u69b0\u696d\u698f\u695f\u694c\u6956\u69ce\u6976\u698b\ua910\ua9f3\ua97a\ua99f\ua958\ua9e8\ua9bb\ua946\u96ce\u9650\u96d6\u9634\u5f74\u5f97\u5f1e\u5ffb\u5f3c\u5f9c\u5fdf\u5f22\ubb42\ubbcc\ubb5a\ubbb8\u1d3d\u1dde\u1d57\u1db2\u1d75\u1de3\u1d96\u1d6b\u50a6\u501e\u50be\u505c\u0011\u009dM\u009eE\u00f9\u00b65\u00c5\u0010\u00f1\u00b8\uecbb\uec58\uecd1\uec34\uecf6\uec50\uec49\uec94\uec5d\uecb9\uec55\uec60\uec63\uecd7\uec0c\uecbf\u9a38\u9aa3\u9a21\u9ab7\u9a69\u9ad4\u9a97\u9a6a\uccdc\ucc3c\ucc87\ucc40\ucc8a\ucc37\ucc74\ucc89\u2394\u2374\u23cf\u231c\u23c7\u237d\u236d\u2399\u2375\u2386\u237d\u2361\u2341\u2396\u2366\u23e2\u23d1\u2310\u2302\u23d6\u06ac\u0622\u06d4\u0606\u06fb\u0644\u0654\u06a0\u064c\u06bf\u0644\u0658\u0674\u06c1\u065b\u06db\u06ef\u0614\u0611\u06ef\u46d0\u4630\u468b\u4658\u4683\u4639\u4629\u46dd\u4631\u46c2\u4639\u4625\u4605\u46d2\u4622\u4688\u4695\u4657\u4646\u4692\u78b3\u7853\u78e8\u783b\u78e0\u785a\u784a\u78be\u7852\u78a1\u785a\u7846\u7866\u78b1\u7841\u78eb\u78f6\u7834\u7825\u78f1\u1466\u1485\u140c\u14e9\u1428\u14a7\u14aa\u146f\u148f\u1442\u14d7\u14c0\u14b0\u1420\u14ca\u143d\u765f\u76fd\u7621\u76cc\u760a\u76b0\u76b5\u7675\ud46c\ud48c\ud43b\ud4f7\ud43c\ud4be\ud4cc\ud457\u8cbe\u8c25\u8ce1\u8c3f\u8ced\u8c51\u8c1e\u8cb7\u8c50\u8c92\u8c77\u8c10\u3964\u39ff\u393b\u39e5\u2308\u2394\u2362\u239f\u2359\u23f3\u23f9\u235e";
        char[] cArray = "\u45bb\u45a7\u45a3\u45a3\u45bb\u45bb\u45bb\u45a3\u45a3\u45a3\u45af\u45af\u45a7\u45bb\u45bf\u45a7\u45bf\u45bb\u45bb\u45bf\u45b3\u45bf\u45bf\u45bb\u45b3\u45bb\u45bf\u45bf\u45bf\u45a7\u45bb\u45bb\u45bb\u4597\u45bf\u45bf\u45bf\u45bb\u45f3\u45bb\u45a7\u458f\u45a3\u45a3\u45a3\u45a3\u45a3\u45a3\u45a7\u45af\u45a3\u45bb\u45a7\u45a7\u45a3\u45a3\u45bf\u45bb\u45bb\u45bf\u45a3\u45bb\u45a3\u45af\u45a3\u45af\u45a3\u45af\u45a7\u45bb\u45a3\u45a3\u45bf\u45bf\u45bf\u45bf\u45bb\u45a3\u45a3\u45a7\u45af\u45a3".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            int n4;
            int n5;
            if (!bl || (bl = false) || !true) {
                n4 = cArray[n5] ^ n;
                char[] cArray2 = string.substring(n3, n3 + n4).toCharArray();
                int n6 = 0;
                do {
                    int n7 = switch (n6 % 6) {
                        default -> 65;
                        case 1 -> 0;
                        case 2 -> 7;
                        case 3 -> 83;
                        case 4 -> 124;
                        case 5 -> 17;
                    };
                    int n8 = n6++;
                    cArray2[n8] = (char)(cArray2[n8] ^ n7);
                } while (n6 < cArray2.length);
                stringArray[n5] = new String(cArray2).intern();
                n3 += n4;
                if (++n5 < cArray.length) continue;
                n2 = 0;
            }
            n5 = 0;
            n3 = 0;
            n4 = 0;
            if (n2 == 0) break;
        }
        llIll = stringArray;
        lllII = new Object[stringArray.length];
        int n9 = 968422092;
        byte[] byArray = "\u00d5\u00f6\u00a2.\u00e0F\u00c0\u00b9w\u00caCd%\u00f2\u00cbSl\u00c4\u0013UN\u00e6i\t\u0088\u00f9\u00ad<\u00c3\u0005\u008d\u00a3\u00ed\u008f\u00e3\u00ed\u00c2^/\u00d5\"\u0092\u009cvr\u00d6\u0095\u00bf0\u00d5!\u00bfP\u00fd%\u00f5\u0013Pl\u00fe\u00ff\"\u00b8\u00d2\u00de\u0088]\u0080\u00bfL7\u00ab\u00f9\u00ddY\u00a7q\u00a3P*\u0091x\u0081I\u001d\u00e8\u00f9\u00a4e\u00f6\u00f3\u00faja\u00b1@`\u009b\u00d4+\u0017\u00f4\u00c3\u00f57\u00af\u00fa\"\u0080\u0092y\u0016`\u0088\u00ca\u00db{6B\u0016\u00cb\u00f9G\u00ed\u00ef+=\u00e7\u00b0\u00ce\u00df\u00ad\u000f\u00ea\u00d2\u00c3\u00cf\u00a3\u00beIVZ\u0018\u00c3\u007f3\u0013H\u00ca5\u00a4L".getBytes("ISO-8859-1");
        int n10 = byArray.length / 4;
        lI = new int[n10];
        int n11 = 0;
        int n12 = 0;
        do {
            int n13 = (byArray[n11] & 0xFF) << 24 | (byArray[n11 + 1] & 0xFF) << 16 | (byArray[n11 + 2] & 0xFF) << 8 | byArray[n11 + 3] & 0xFF;
            lIIllllI.lI[n12] = n13 ^= n9;
            n11 += 4;
        } while (++n12 < n10);
        lIIIl = false;
        IIIII = new ConcurrentLinkedQueue();
        IllIl = false;
        IlIl = false;
        IIIlI = -1;
        Il = 0;
        llIII = Long.MIN_VALUE;
        IlIII = Integer.MIN_VALUE;
        IIIl = Integer.MIN_VALUE;
        IllI = Integer.MIN_VALUE;
        IlII = new llllIll();
        Illll = new boolean[64];
        I = new boolean[64];
        lIlll = Integer.MIN_VALUE;
        II = 0;
        lIll = IllIllI.II;
        lIllI = -1;
        lll = Integer.MIN_VALUE;
        IllII = Long.MIN_VALUE;
        lIlI = 0;
        lIIll = 0;
        llIIl = 0;
        IlIll = 0;
        Field field = null;
        try {
            field = KeyBinding.class.getDeclaredField("boundKey");
            field.setAccessible(true);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        lIl = field;
        Field field2 = null;
        Method method = null;
        try {
            method = PlayerInventory.class.getMethod("getSelectedSlot", new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            // empty catch block
        }
        try {
            field2 = PlayerInventory.class.getField("selectedSlot");
        }
        catch (NoSuchFieldException noSuchFieldException) {
            try {
                field2 = PlayerInventory.class.getDeclaredField("selectedSlot");
                field2.setAccessible(true);
            }
            catch (NoSuchFieldException noSuchFieldException2) {
                // empty catch block
            }
        }
        llI = field2;
        IIII = method;
        Field field3 = null;
        Field field4 = null;
        Field field5 = null;
        try {
            field3 = Input.class.getField("movementForward");
            field4 = Input.class.getField("movementSideways");
        }
        catch (NoSuchFieldException noSuchFieldException) {
            try {
                field5 = Input.class.getDeclaredField("movementVector");
                field5.setAccessible(true);
            }
            catch (NoSuchFieldException noSuchFieldException3) {
                try {
                    field5 = Input.class.getDeclaredField("movementVector");
                    field5.setAccessible(true);
                }
                catch (NoSuchFieldException noSuchFieldException4) {
                    try {
                        field5 = Input.class.getDeclaredField("field_3905");
                        field5.setAccessible(true);
                    }
                    catch (NoSuchFieldException noSuchFieldException5) {
                        // empty catch block
                    }
                }
            }
        }
        ll = field3;
        IIll = field4;
        llII = field5;
        Method method2 = null;
        try {
            method2 = ClientPlayerInteractionManager.class.getDeclaredMethod("syncSelectedSlot", new Class[0]);
            method2.setAccessible(true);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        IIIIl = method2;
        Method method3 = null;
        Method method4 = null;
        try {
            method3 = KeyBinding.class.getMethod("onKeyPressed", InputUtil.Key.class);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        try {
            method4 = KeyBinding.class.getMethod("setKeyPressed", InputUtil.Key.class, Boolean.TYPE);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        Illl = method3;
        IIl = method4;
        Method method5 = null;
        Method method6 = null;
        try {
            method5 = MinecraftClient.class.getMethod("setCameraEntity", Entity.class);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        try {
            method6 = MinecraftClient.class.getMethod("getCameraEntity", new Class[0]);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
        IIlll = method5;
        lIlIl = method6;
        lllI = lIIllllI.lIllIl(LivingEntity.class, "bodyYaw");
        IIllI = lIIllllI.lIllIl(LivingEntity.class, "prevBodyYaw");
        IlIlI = lIIllllI.lIllIl(LivingEntity.class, "prevHeadYaw");
        llll = lIIllllI.lIllIl(LivingEntity.class, "lastHeadYaw");
        Method method7 = null;
        Method method8 = null;
        Method method9 = null;
        try {
            Class<?> clazz = Class.forName("net.minecraft.client.util.ScreenshotRecorder");
            try {
                method7 = clazz.getMethod("takeScreenshot", Framebuffer.class);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                // empty catch block
            }
            try {
                method8 = clazz.getMethod("takeScreenshot", Framebuffer.class, Consumer.class);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                // empty catch block
            }
            try {
                method9 = clazz.getMethod("takeScreenshot", Framebuffer.class, Integer.TYPE, Consumer.class);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {}
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        lII = method7;
        III = method8;
        lIIl = method9;
        Object var14_47 = null;
        for (Method method10 : InputUtil.class.getMethods()) {
            Class<?>[] classArray = method10.getParameterTypes();
            if (!method10.getName().equals("isKeyPressed") || classArray.length != 2 || classArray[1] != Integer.TYPE || classArray[0] != Long.TYPE && classArray[0].isPrimitive()) continue;
            Method method11 = method10;
            break;
        }
        lIII = var14_49;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIllII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (llIII != lIIIlIl.lIllI()) return false;
        if (System.identityHashCode(minecraftClient.player) != Ill) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIllIl(Entity entity) {
        BlockPos blockPos;
        if (entity == null) return false;
        if (entity.getEntityWorld() == null) {
            return false;
        }
        Box box = entity.getBoundingBox();
        BlockPos blockPos2 = BlockPos.ofFloored((double)box.minX, (double)box.minY, (double)box.minZ);
        BlockPos blockPos3 = BlockPos.ofFloored((double)(box.maxX - 1.0E-7), (double)(box.maxY - 1.0E-7), (double)(box.maxZ - 1.0E-7));
        Iterator iterator = BlockPos.iterate((BlockPos)blockPos2, (BlockPos)blockPos3).iterator();
        do {
            if (!iterator.hasNext()) return false;
            blockPos = (BlockPos)iterator.next();
        } while (!entity.getEntityWorld().getBlockState(blockPos).isOf(Blocks.COBWEB));
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIlllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.player.age != IlIII) return false;
        if (System.identityHashCode(minecraftClient.player) != Ill) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IIllll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) {
            return;
        }
        II = System.identityHashCode(minecraftClient.player);
        lIlll = minecraftClient.player.age;
    }

    public static float IlIIII(MinecraftClient minecraftClient) {
        return lIIllllI.IIIllIl(minecraftClient.getRenderTickCounter(), true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean IlIIIl(MinecraftClient minecraftClient, Object object, int n, BooleanSupplier booleanSupplier) {
        lIIlIlll lIIlIlll2;
        IIlIIIIIl iIlIIIIIl;
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.getNetworkHandler() == null || object == null || booleanSupplier == null || n < 0 || n > 8 || l) {
            return false;
        }
        if (!minecraftClient.isOnThread()) {
            throw new IllegalStateException("Silent hotbar transactions must run on the Minecraft client thread");
        }
        IIIlllIlI iIIlllIlI = lIIII;
        if (iIIlllIlI != null) {
            if (iIIlllIlI.I() != minecraftClient.player || iIIlllIlI.l().I() != object || !IlII.llII(object)) {
                return false;
            }
            lIIII = null;
            IIIll = false;
        }
        if ((iIlIIIIIl = IlII.lllI(lIIlIlll2 = new lIIlIlll(minecraftClient), object, n, IllIllI.II, -1, true, null)).II() == 0L) {
            return false;
        }
        ++lIlI;
        ++llIIl;
        try {
            if (minecraftClient.player.getInventory().getStack(n).isOf(Items.END_CRYSTAL)) {
                lIIllllI.IIllll(minecraftClient);
            }
            boolean bl = booleanSupplier.getAsBoolean();
            return bl;
        }
        finally {
            llIIl = Math.max(0, llIIl - 1);
            lIlI = Math.max(0, lIlI - 1);
            if (iIlIIIIIl.l()) {
                lIIII = new IIIlllIlI(minecraftClient.player, iIlIIIIIl);
                IIIll = false;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlIIlI(Packet<?> packet) {
        if (packet instanceof PlayerInteractBlockC2SPacket) {
            ++llIl;
            return;
        }
        if (!(packet instanceof PlayerInteractItemC2SPacket)) {
            if (!(packet instanceof PlayerInteractEntityC2SPacket)) return;
            PlayerInteractEntityC2SPacket playerInteractEntityC2SPacket = (PlayerInteractEntityC2SPacket)packet;
            playerInteractEntityC2SPacket.handle((PlayerInteractEntityC2SPacket.Handler)new lllIl());
            return;
        }
        ++llIlI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IlIIll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return true;
        if (minecraftClient.player == null) return true;
        if (lIIllllI.lIIIl(minecraftClient)) return false;
        if (lIIllllI.IIlllI(minecraftClient)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IlIlII(MinecraftClient minecraftClient, Hand hand, ActionResult actionResult) {
        ActionResult.Success success;
        if (minecraftClient != null && minecraftClient.player != null && actionResult instanceof ActionResult.Success && (success = (ActionResult.Success)actionResult).swingSource() == ActionResult.SwingSource.CLIENT) {
            minecraftClient.player.swingHand(hand);
        }
    }

    public static void IlIlIl(MinecraftClient minecraftClient, Entity entity) {
        block3: {
            block2: {
                if (minecraftClient == null || minecraftClient.player == null) break block2;
                if (minecraftClient.interactionManager != null && entity != null) break block3;
            }
            return;
        }
        lIIllllI.llIIII(minecraftClient, entity);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IlIllI(MinecraftClient minecraftClient, IlIlIll ilIlIll) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (ilIlIll == null) return false;
        if (!ilIlIll.Il()) {
            return false;
        }
        IIlIIIIIl iIlIIIIIl = ilIlIll.IIl();
        if (iIlIIIIIl != null) {
            if (iIlIIIIIl.II() >= 0L) return IlII.Il(iIlIIIIIl);
            return new lIIlIlll(minecraftClient).lI(IllIllI.II, ilIlIll.l());
        }
        if (lIIllllI.lllI(minecraftClient.player.getInventory()) == ilIlIll.l()) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlIlll(MinecraftClient minecraftClient) {
        IIlIl = minecraftClient != null && minecraftClient.options != null && minecraftClient.options.attackKey != null && minecraftClient.options.useKey != null && lIIllllI.IIllIII(minecraftClient, minecraftClient.options.attackKey) && lIIllllI.IIllIII(minecraftClient, minecraftClient.options.useKey);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IllIII(MinecraftClient minecraftClient, int n, int n2) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (n < 0) return;
        if (n > 8) return;
        int n3 = lIIllllI.lllI(minecraftClient.player.getInventory());
        if (n3 == n) return;
        IIIII.add(new IIlIll(minecraftClient.player, n, n3, minecraftClient.player.age + Math.max(1, n2)));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ActionResult IllIIl(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult) {
        if (minecraftClient == null) return ActionResult.FAIL;
        if (minecraftClient.player == null) return ActionResult.FAIL;
        if (minecraftClient.interactionManager == null) return ActionResult.FAIL;
        if (hand == null) return ActionResult.FAIL;
        if (blockHitResult == null) {
            return ActionResult.FAIL;
        }
        lIIllllI.IllIl(minecraftClient);
        return minecraftClient.interactionManager.interactBlock(minecraftClient.player, hand, blockHitResult);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static float IllIlI(LivingEntity livingEntity, float f) {
        if (livingEntity == null) {
            return 0.0f;
        }
        float f2 = lIIllllI.lIlIIl(lllI, livingEntity, livingEntity.getYaw());
        float f3 = lIIllllI.lIlIIl(IIllI, livingEntity, f2);
        return MathHelper.lerpAngleDegrees((float)f, (float)f3, (float)f2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IllIll(MinecraftClient minecraftClient) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return;
        if (clientEntrypoint.IlI() == null) {
            return;
        }
        ClickSimulations clickSimulations = clientEntrypoint.IlI().lIlII();
        if (clickSimulations == null) return;
        if (!clickSimulations.IIIlIIl()) return;
        if (!clickSimulations.IlIlIII()) return;
        clickSimulations.lII(minecraftClient);
    }

    public static boolean IlllII(LivingEntity livingEntity) {
        if (livingEntity == null) {
            return false;
        }
        try {
            return (Boolean)livingEntity.getClass().getMethod("isFallFlying", new Class[0]).invoke((Object)livingEntity, new Object[0]);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            try {
                return (Boolean)livingEntity.getClass().getMethod("isGliding", new Class[0]).invoke((Object)livingEntity, new Object[0]);
            }
            catch (ReflectiveOperationException reflectiveOperationException2) {
                return false;
            }
        }
    }

    public static boolean IlllIl(Packet<?> packet) {
        return packet.getClass().getName().contains("EntityPositionSyncS2CPacket");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IllllI(LivingEntity livingEntity) {
        if (livingEntity == null) {
            return false;
        }
        if (livingEntity.isBlocking()) {
            return true;
        }
        if (!livingEntity.isUsingItem()) return false;
        if (!lIIllllI.IIIlIII(livingEntity.getActiveItem())) return false;
        return true;
    }

    public static boolean Illlll(MinecraftClient minecraftClient, EntityHitResult entityHitResult) {
        lIIllllI.IllIll(minecraftClient);
        return lIIllllI.lIIIIII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static BufferedImage lIIIII(NativeImage nativeImage) {
        BufferedImage bufferedImage = new BufferedImage(nativeImage.getWidth(), nativeImage.getHeight(), 2);
        int[] nArray = lIIllllI.IllIIlI(nativeImage);
        if (nArray == null) return bufferedImage;
        if (nArray.length >= nativeImage.getWidth() * nativeImage.getHeight()) {
            bufferedImage.setRGB(0, 0, nativeImage.getWidth(), nativeImage.getHeight(), nArray, 0, nativeImage.getWidth());
            return bufferedImage;
        }
        return bufferedImage;
    }

    public static boolean lIIIIl() {
        lIIllllI.IIIIlI();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lIIIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) {
            return false;
        }
        if (minecraftClient.player.age == lIlll && System.identityHashCode(minecraftClient.player) == II) {
            return true;
        }
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        AutoHitCrystal autoHitCrystal = clientEntrypoint.IlI().lIll();
        if (autoHitCrystal != null) {
            if (autoHitCrystal.IllIl(minecraftClient)) return true;
        }
        AutoCrystal autoCrystal = clientEntrypoint.IlI().IIIll();
        if (autoCrystal == null) return false;
        if (autoCrystal.IIIlIIl()) {
            HitResult hitResult = minecraftClient.crosshairTarget;
            if (!(hitResult instanceof EntityHitResult)) return false;
            EntityHitResult entityHitResult = (EntityHitResult)hitResult;
            hitResult = entityHitResult.getEntity();
            if (!(hitResult instanceof EndCrystalEntity)) return false;
            EndCrystalEntity endCrystalEntity = (EndCrystalEntity)hitResult;
            if (endCrystalEntity.isRemoved()) return false;
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean lIIIll(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.player.age > IllI) return false;
        return true;
    }

    public static IlIlIll lIIlII(MinecraftClient minecraftClient, Object object, int n) {
        return lIIllllI.IIIIlII(minecraftClient, object, n, 0, true);
    }

    public static InputUtil.Key lIIlIl(JsonElement jsonElement) {
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return InputUtil.UNKNOWN_KEY;
        }
        try {
            if (jsonElement.isJsonPrimitive()) {
                return lIIllllI.IlIIIll(jsonElement.getAsInt());
            }
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            if (!jsonObject.has("type") || !jsonObject.has("code")) {
                return InputUtil.UNKNOWN_KEY;
            }
            JsonElement jsonElement2 = jsonObject.get("type");
            InputUtil.Type type = jsonElement2.isJsonPrimitive() && jsonElement2.getAsJsonPrimitive().isNumber() ? (jsonElement2.getAsInt() == 1 ? InputUtil.Type.MOUSE : InputUtil.Type.KEYSYM) : InputUtil.Type.valueOf((String)jsonElement2.getAsString());
            return type.createFromCode(jsonObject.get("code").getAsInt());
        }
        catch (Exception exception) {
            return InputUtil.UNKNOWN_KEY;
        }
    }

    public static long lIIllI() {
        return llIl;
    }

    private static void lIIlll(MinecraftClient minecraftClient) {
        block1: {
            if (minecraftClient == null) break block1;
            if (minecraftClient.player != null) {
                IIIl = minecraftClient.player.age;
                IlIIl = System.identityHashCode(minecraftClient.player);
            }
        }
    }

    public static Vec3d lIlIII(Packet<?> packet) {
        return lIIllllI.IllIlII(packet);
    }

    private static float lIlIIl(Field field, Object object, float f) {
        if (field == null || object == null) {
            return f;
        }
        try {
            return field.getFloat(object);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return f;
        }
    }

    private static Float lIlIlI(Object object, String string, String string2) {
        if (object == null) {
            return null;
        }
        Float f = lIIllllI.IlIllIl(object, string, string2);
        if (f != null) {
            return f;
        }
        for (String string3 : new String[]{"values", "change", "position", "pos", "delta"}) {
            try {
                Object object2 = object.getClass().getMethod(string3, new Class[0]).invoke(object, new Object[0]);
                Float f2 = lIIllllI.IlIllIl(object2, string, string2);
                if (f2 == null) continue;
                return f2;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                // empty catch block
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean lIlIll(MinecraftClient minecraftClient, IlIlIll ilIlIll) {
        if (!lIIllllI.IIIllll(minecraftClient, ilIlIll)) return false;
        if (!lIIllllI.IlllIIl(minecraftClient)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int lIllII(PlayerInventory playerInventory) {
        if (!IlII.lII()) return -1;
        if (playerInventory == null) return -1;
        if (llIIl <= 0 && !lIlII) {
            return -1;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return -1;
        if (minecraftClient.player == null) return -1;
        if (minecraftClient.player.getInventory() == playerInventory) return IlII.IIII(new lIIlIlll(minecraftClient));
        return -1;
    }

    private static Field lIllIl(Class<?> clazz, String string) {
        for (Class<?> clazz2 = clazz; clazz2 != null; clazz2 = clazz2.getSuperclass()) {
            try {
                Field field = clazz2.getDeclaredField(string);
                field.setAccessible(true);
                return field;
            }
            catch (NoSuchFieldException noSuchFieldException) {
                continue;
            }
        }
        return null;
    }

    public static EntityHitResult lIlllI(MinecraftClient minecraftClient, LivingEntity livingEntity, double d) {
        return lIIllllI.IIIllII(minecraftClient, livingEntity, d, true);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean lIllll(MinecraftClient minecraftClient, BlockHitResult blockHitResult) {
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.interactionManager == null || blockHitResult == null) {
            return false;
        }
        if (!lIIllllI.IlIIll(minecraftClient)) {
            return false;
        }
        if (lIIllllI.IIIIIlI(minecraftClient) > 0) {
            lIIllllI.IIIlIlI(minecraftClient);
        }
        try {
            boolean bl;
            ActionResult actionResult = lIIllllI.IllllIl(minecraftClient, Hand.MAIN_HAND, blockHitResult);
            boolean bl2 = bl = actionResult != null && actionResult.isAccepted();
            if (bl) {
                lIIllllI.lIIlll(minecraftClient);
            }
            boolean bl3 = bl;
            return bl3;
        }
        finally {
            lIIllllI.IIIlIlI(minecraftClient);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean llIIII(MinecraftClient minecraftClient, Entity entity) {
        if (minecraftClient == null || minecraftClient.player == null) {
            return false;
        }
        EntityHitResult entityHitResult = entity == null ? null : new EntityHitResult(entity);
        lIIllllI.IllIll(minecraftClient);
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (entity != null) {
            minecraftClient.crosshairTarget = entityHitResult;
        }
        try {
            boolean bl = lIIllllI.lIIIIII(minecraftClient);
            return bl;
        }
        finally {
            minecraftClient.crosshairTarget = hitResult;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void llIIIl(int[] nArray) {
        if (nArray == null) {
            return;
        }
        int n = 0;
        while (n < nArray.length) {
            int n2 = nArray[n];
            int n3 = n2 >> 24 & 0xFF;
            int n4 = n2 >> 16 & 0xFF;
            int n5 = n2 >> 8 & 0xFF;
            int n6 = n2 & 0xFF;
            nArray[n] = n3 << 24 | n6 << 16 | n5 << 8 | n4;
            ++n;
        }
    }

    public static boolean llIIlI(MinecraftClient minecraftClient, int n) {
        IlIlIll ilIlIll = lIIllllI.IIlIll(minecraftClient, n, 0, true);
        return lIIllllI.II(minecraftClient, ilIlIll);
    }

    public static boolean llIIll(MinecraftClient minecraftClient, Hand hand) {
        return lIIllllI.IIllIll(minecraftClient, hand);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Entity llIlII(MinecraftClient minecraftClient) {
        HitResult hitResult;
        if (minecraftClient == null || !((hitResult = minecraftClient.crosshairTarget) instanceof EntityHitResult)) {
            return null;
        }
        EntityHitResult entityHitResult = (EntityHitResult)hitResult;
        return entityHitResult.getEntity();
    }

    public static void llIlIl(KeyBinding keyBinding) {
        if (keyBinding != null) {
            IIllIIIIl.IIIlI(keyBinding, 0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int llIllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return 0;
        if (minecraftClient.player != null) return IlII.IIII(new lIIlIlll(minecraftClient));
        return 0;
    }

    public static boolean llIlll() {
        return IIlIl;
    }

    public static void lllIII(MinecraftClient minecraftClient, int n) {
        IIllIIIIl.lII(minecraftClient, Math.max(0, n));
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lllIIl() {
        if (llIIl <= 0) {
            if (!lIlII) return false;
        }
        if (IlII.lII()) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lllIlI(LivingEntity livingEntity, ClientPlayerEntity clientPlayerEntity) {
        if (livingEntity == null) return false;
        if (clientPlayerEntity == null) return false;
        if (!lIIllllI.IllllI(livingEntity)) return false;
        double d = clientPlayerEntity.getX() - livingEntity.getX();
        double d2 = clientPlayerEntity.getZ() - livingEntity.getZ();
        double d3 = d * d + d2 * d2;
        if (d3 < 1.0E-5) return true;
        double d4 = 1.0 / Math.sqrt(d3);
        double d5 = d * d4;
        double d6 = d2 * d4;
        float f = livingEntity.getYaw(1.0f);
        float f2 = -f * ((float)Math.PI / 180);
        double d7 = Math.sin(f2);
        double d8 = Math.cos(f2);
        if (!(d7 * d5 + d8 * d6 > 0.0)) return false;
        return true;
    }

    private static void lllIll(Field field, Object object, float f) {
        if (field == null || object == null) {
            return;
        }
        try {
            field.setFloat(object, f);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
    }

    public static IlIlIll llllIl(MinecraftClient minecraftClient, int n) {
        return lIIllllI.IIlIll(minecraftClient, n, 0, true);
    }

    private static ComponentType<?> lllllI() {
        try {
            return DataComponentTypes.WEAPON;
        }
        catch (Throwable throwable) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ActionResult llllll(MinecraftClient minecraftClient, Hand hand) {
        if (minecraftClient == null) return ActionResult.FAIL;
        if (minecraftClient.player == null) return ActionResult.FAIL;
        if (minecraftClient.interactionManager == null) return ActionResult.FAIL;
        if (hand == null) {
            return ActionResult.FAIL;
        }
        if (lIIllllI.IlIIll(minecraftClient)) {
            lIIllllI.IllIl(minecraftClient);
            ActionResult actionResult = minecraftClient.interactionManager.interactItem((PlayerEntity)minecraftClient.player, hand);
            if (actionResult == null) return actionResult;
            if (!actionResult.isAccepted()) return actionResult;
            lIIllllI.lIIlll(minecraftClient);
            return actionResult;
        }
        return ActionResult.FAIL;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIIIIII(MinecraftClient minecraftClient, int n, boolean bl) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (n < 0) return;
        if (n <= 8) {
            boolean bl2;
            PlayerInventory playerInventory = minecraftClient.player.getInventory();
            int n2 = lIIllllI.lllI(playerInventory);
            boolean bl3 = bl2 = n2 != n;
            if (bl2) {
                lIIllllI.l(playerInventory, n);
                if (!bl) {
                    IIIlI = -1;
                    IlIl = true;
                    return;
                }
                lIIllllI.IIIlllI(minecraftClient, n);
                return;
            }
            if (!bl) return;
            if (!IlIl) return;
            lIIllllI.IIIlllI(minecraftClient, n);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIIIIIl(MinecraftClient minecraftClient, int n, boolean bl) {
        InputUtil.Key key;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.options == null) return;
        if (n < 0) return;
        if (n > 8) {
            return;
        }
        KeyBinding[] keyBindingArray = minecraftClient.options.hotbarKeys;
        KeyBinding keyBinding = null;
        if (keyBindingArray != null && n < keyBindingArray.length) {
            keyBinding = keyBindingArray[n];
        }
        if (keyBinding != null && !lIIllllI.IlIIlll(key = lIIllllI.IlllllI(keyBinding))) {
            lIIllllI.IIIl(keyBinding, key);
        }
        lIIllllI.IIIIIII(minecraftClient, n, bl);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static int IIIIIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return 0;
        int n = IIllIIIIl.IIII(minecraftClient);
        return n;
    }

    public static boolean IIIIIll(MinecraftClient minecraftClient) {
        if (minecraftClient != null) {
            if (minecraftClient.interactionManager != null) {
                IIllIIIIl.II(minecraftClient.interactionManager);
                return true;
            }
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static IlIlIll IIIIlII(MinecraftClient minecraftClient, Object object, int n, int n2, boolean bl) {
        int n3;
        if (minecraftClient == null) return IlIlIll.I(n);
        if (minecraftClient.player == null) return IlIlIll.I(n);
        if (object == null) return IlIlIll.I(n);
        if (n < 0) return IlIlIll.I(n);
        if (n > 8) return IlIlIll.I(n);
        if (lIIII != null) return IlIlIll.I(n);
        if (!l) {
            n3 = minecraftClient.player.age;
        }
        return IlIlIll.I(n);
        int n4 = IlII.IIII(new lIIlIlll(minecraftClient));
        boolean bl2 = n4 != n;
        IllIllI illIllI = lIll;
        IIlIIIIIl iIlIIIIIl = IlII.lllI(new lIIlIlll(minecraftClient), object, n, illIllI, -1, true, null);
        if (iIlIIIIIl.II() == 0L) {
            return IlIlIll.I(n);
        }
        if (bl && n2 <= 0 && illIllI == IllIllI.II) {
            lIIllllI.IIlIlII(minecraftClient);
        }
        int n5 = bl2 ? n3 + Math.max(0, n2) : n3;
        return new IlIlIll(n4, n, n3, n5, bl2, true, iIlIIIIIl);
    }

    public static boolean IIIIlIl(MinecraftClient minecraftClient) {
        if (minecraftClient.player == null || minecraftClient.player.input == null) {
            return false;
        }
        try {
            Field field = minecraftClient.player.input.getClass().getField("playerInput");
            Object object = field.get(minecraftClient.player.input);
            return (Boolean)object.getClass().getMethod("forward", new Class[0]).invoke(object, new Object[0]) != false || (Boolean)object.getClass().getMethod("backward", new Class[0]).invoke(object, new Object[0]) != false || (Boolean)object.getClass().getMethod("left", new Class[0]).invoke(object, new Object[0]) != false || (Boolean)object.getClass().getMethod("right", new Class[0]).invoke(object, new Object[0]) != false;
        }
        catch (Exception exception) {
            try {
                return minecraftClient.player.input.getClass().getField("pressingForward").getBoolean(minecraftClient.player.input) || minecraftClient.player.input.getClass().getField("pressingBack").getBoolean(minecraftClient.player.input) || minecraftClient.player.input.getClass().getField("pressingLeft").getBoolean(minecraftClient.player.input) || minecraftClient.player.input.getClass().getField("pressingRight").getBoolean(minecraftClient.player.input);
            }
            catch (Exception exception2) {
                return false;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static BlockHitResult IIIIllI(MinecraftClient minecraftClient, Entity entity, Vec3d vec3d, Vec3d vec3d2) {
        Vec3d vec3d3;
        BlockHitResult blockHitResult;
        if (minecraftClient == null) return null;
        if (minecraftClient.world == null) return null;
        if (entity == null) {
            return null;
        }
        Vec3d vec3d4 = vec3d;
        int n = 8;
        do {
            if (n-- <= 0) return null;
            blockHitResult = minecraftClient.world.raycast(new RaycastContext(vec3d4, vec3d2, RaycastContext.ShapeType.COLLIDER, RaycastContext.FluidHandling.NONE, entity));
            if (blockHitResult == null) return blockHitResult;
            if (blockHitResult.getType() == HitResult.Type.MISS) {
                return blockHitResult;
            }
            BlockState blockState = minecraftClient.world.getBlockState(blockHitResult.getBlockPos());
            if (!(blockState.isOf(Blocks.COBWEB) || blockState.isOf(Blocks.WATER) || blockState.isAir() || blockState.isReplaceable())) {
                if (!blockState.getCollisionShape((BlockView)minecraftClient.world, blockHitResult.getBlockPos()).isEmpty()) return blockHitResult;
            }
            vec3d3 = vec3d2.subtract(vec3d4).normalize();
        } while (!((vec3d4 = blockHitResult.getPos().add(vec3d3.multiply(0.01))).squaredDistanceTo(vec3d) >= vec3d2.squaredDistanceTo(vec3d)));
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIIIlll(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n > 8) {
            return false;
        }
        PlayerInventory playerInventory = minecraftClient.player.getInventory();
        lIIllllI.IIIIIII(minecraftClient, n, true);
        if (!IllIl) {
            return false;
        }
        lIIllllI.IIlIlII(minecraftClient);
        if (lIIllllI.lllI(playerInventory) != n) return false;
        if (IIIlI >= 0) return false;
        if (IlIl) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIIlIII(ItemStack itemStack) {
        block2: {
            ComponentType<?> componentType;
            block3: {
                block1: {
                    if (itemStack == null) return false;
                    if (itemStack.isEmpty()) break block1;
                    componentType = lIIllllI.IIlIIl();
                    if (componentType == null) break block2;
                    break block3;
                }
                return false;
            }
            if (itemStack.contains(componentType)) {
                return true;
            }
        }
        String string = Registries.ITEM.getId((Object)itemStack.getItem()).getPath();
        return string.equals("shield");
    }

    public static boolean IIIlIIl() {
        return lIIIl;
    }

    public static void IIIlIlI(MinecraftClient minecraftClient) {
        IIllIIIIl.IIIII(minecraftClient, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IIIlIll() {
        ++IlI;
        llIII = lIIIlIl.lIllI();
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        IlIII = minecraftClient.player.age;
        Ill = System.identityHashCode(minecraftClient.player);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static EntityHitResult IIIllII(MinecraftClient minecraftClient, LivingEntity livingEntity, double d, boolean bl) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (livingEntity == null) {
            return null;
        }
        EntityHitResult entityHitResult = lIIllllI.lI(minecraftClient, d);
        if (entityHitResult != null && entityHitResult.getEntity() == livingEntity) {
            return entityHitResult;
        }
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof EntityHitResult)) return null;
        EntityHitResult entityHitResult2 = (EntityHitResult)hitResult;
        if (entityHitResult2.getEntity() != livingEntity) return null;
        double d2 = d * d;
        if (!(minecraftClient.player.getEyePos().squaredDistanceTo(entityHitResult2.getPos()) <= d2)) return null;
        return entityHitResult2;
    }

    public static float IIIllIl(RenderTickCounter renderTickCounter, boolean bl) {
        if (renderTickCounter == null) {
            return 0.0f;
        }
        return renderTickCounter.getTickProgress(bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IIIlllI(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.interactionManager == null) return;
        if (n < 0) return;
        if (n > 8) {
            return;
        }
        if (IllIl && IIllIIIIl.IlII(minecraftClient.interactionManager) <= 0) {
            IIllIIIIl.II(minecraftClient.interactionManager);
            IIIlI = -1;
            IlIl = false;
            return;
        }
        IIIlI = n;
        IlIl = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIIllll(MinecraftClient minecraftClient, IlIlIll ilIlIll) {
        boolean bl;
        int n;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (ilIlIll == null) return false;
        if (!ilIlIll.Il()) {
            return false;
        }
        if (ilIlIll.IIl() != null && ilIlIll.IIl().II() != 0L) {
            lIIlIlll lIIlIlll2 = new lIIlIlll(minecraftClient);
            IllIllI illIllI = IlII.I(ilIlIll.IIl().I());
            if (illIllI == null) {
                illIllI = lIll;
            }
            if (illIllI == IllIllI.l || illIllI == IllIllI.Il) {
                if (!IlII.IIlI(lIIlIlll2, ilIlIll.IIl(), ilIlIll.l(), illIllI, ilIlIll.II())) {
                    return false;
                }
                if (minecraftClient.player.age < ilIlIll.II()) return false;
                if (lIIllllI.lllI(minecraftClient.player.getInventory()) == ilIlIll.l()) return true;
                return false;
            }
            if (!IlII.IIlI(lIIlIlll2, ilIlIll.IIl(), ilIlIll.l(), IllIllI.II, ilIlIll.II())) {
                return false;
            }
            if (!ilIlIll.IIl().l()) {
                return true;
            }
            n = Math.max(0, ilIlIll.II() - ilIlIll.lI());
        }
        if (lIll != IllIllI.l) {
            if (IIIlI >= 0) return false;
            if (IlIl) {
                return false;
            }
        }
        if (minecraftClient.player.age < ilIlIll.II()) return false;
        if (lIIllllI.lllI(minecraftClient.player.getInventory()) != ilIlIll.l()) return false;
        return true;
        boolean bl2 = lIllI == ilIlIll.l();
        boolean bl3 = bl = IIIIlIl.Ill() == ilIlIll.l();
        if (!bl2) {
            if (n != 0) return false;
            if (!bl) return false;
        }
        long l2 = bl2 ? (long)lll : (long)ilIlIll.lI();
        long l3 = l2 + (long)n;
        if ((long)minecraftClient.player.age < Math.max((long)ilIlIll.II(), l3)) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static BufferedImage IIlIIII(MinecraftClient minecraftClient) {
        NativeImage nativeImage;
        if (minecraftClient == null) {
            return null;
        }
        Framebuffer framebuffer = minecraftClient.getFramebuffer();
        if (framebuffer == null) {
            return null;
        }
        try (NativeImage nativeImage2 = null;){
            Object object;
            if (lII != null) {
                object = lII.invoke(null, framebuffer);
                if (object instanceof NativeImage) {
                    nativeImage2 = nativeImage = (NativeImage)object;
                }
            } else {
                object = new AtomicReference();
                nativeImage = arg_0 -> object.set(arg_0);
                if (III != null) {
                    III.invoke(null, framebuffer, nativeImage);
                } else if (lIIl != null) {
                    lIIl.invoke(null, framebuffer, 1, nativeImage);
                }
                nativeImage2 = (NativeImage)((AtomicReference)object).get();
            }
            if (nativeImage2 == null) {
                object = null;
                return object;
            }
            object = lIIllllI.lIIIII(nativeImage2);
            return object;
        }
    }

    public static boolean IIlIIIl() {
        return IllIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIlIIlI(MinecraftClient minecraftClient, double d, boolean bl) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        float f = minecraftClient.player.getAttackCooldownProgress(0.0f);
        if (!bl || !(f < 1.0f)) {
            if (f >= (float)d) return true;
            return false;
        }
        return false;
    }

    public static void IIlIIll(MinecraftClient minecraftClient, float f) {
        if (minecraftClient == null || minecraftClient.player == null) {
            return;
        }
        minecraftClient.player.setHeadYaw(f);
        lIIllllI.lllIll(IlIlI, minecraftClient.player, f);
        lIIllllI.lllIll(llll, minecraftClient.player, f);
        try {
            minecraftClient.player.getClass().getMethod("setBodyYaw", Float.TYPE).invoke((Object)minecraftClient.player, Float.valueOf(f));
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            lIIllllI.lllIll(lllI, minecraftClient.player, f);
        }
        lIIllllI.lllIll(IIllI, minecraftClient.player, f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIlIlII(MinecraftClient minecraftClient) {
        if (minecraftClient != null && minecraftClient.player != null && minecraftClient.interactionManager != null) {
            if (!IllIl) return;
            if (IIIlI < 0 && !IlIl) return;
            if (IIllIIIIl.IlII(minecraftClient.interactionManager) > 0) {
                return;
            }
            IIllIIIIl.II(minecraftClient.interactionManager);
            IIIlI = -1;
            IlIl = false;
            return;
        } else {
            IIIlI = -1;
            IlIl = false;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIlIlIl() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        AutoHitCrystal autoHitCrystal = clientEntrypoint.IlI().lIll();
        if (autoHitCrystal == null) return false;
        if (autoHitCrystal.IllIl(MinecraftClient.getInstance())) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Vec3d IIlIllI(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Vec3d) {
            return (Vec3d)object;
        }
        Double d = lIIllllI.IllIIIl(object, "getX", "x");
        Double d2 = lIIllllI.IllIIIl(object, "getY", "y");
        Double d3 = lIIllllI.IllIIIl(object, "getZ", "z");
        if (d == null) return null;
        if (d2 == null) return null;
        if (d3 == null) return null;
        return new Vec3d(d.doubleValue(), d2.doubleValue(), d3.doubleValue());
    }

    private lIIllllI() {
    }

    public static void IIlIlll() {
        if (lIIII != null) {
            IIIll = true;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIllIII(MinecraftClient minecraftClient, KeyBinding keyBinding) {
        if (minecraftClient == null) return false;
        if (keyBinding == null) return false;
        if (minecraftClient.getWindow() == null) {
            return false;
        }
        InputUtil.Key key = IIllIIIIl.l(keyBinding);
        if (key != null) return lIIllllI.llI(minecraftClient, key);
        return keyBinding.isPressed();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IIllIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.attackKey != null) {
            if (lIIllllI.IlIIlll(lIIllllI.IlllllI(minecraftClient.options.attackKey))) {
                return false;
            }
        } else {
            return false;
        }
        lIIllllI.IlIIIIl(minecraftClient);
        return lIIllllI.lIIll(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int IIllIlI(PlayerInventory playerInventory) {
        if (playerInventory == null) {
            return 0;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) return IIllIIIIl.llI(playerInventory);
        if (minecraftClient.player == null) return IIllIIIIl.llI(playerInventory);
        if (minecraftClient.player.getInventory() != playerInventory) return IIllIIIIl.llI(playerInventory);
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return IIllIIIIl.llI(playerInventory);
        if (clientEntrypoint.IlI() == null) return IIllIIIIl.llI(playerInventory);
        if (clientEntrypoint.IlI().IIIlII() == null) return IIllIIIIl.llI(playerInventory);
        if (!clientEntrypoint.IlI().IIIlII().IIIlIIl()) return IIllIIIIl.llI(playerInventory);
        if (!IlII.IIll()) {
            int n = clientEntrypoint.IlI().IIIlII().lII(minecraftClient.player.age);
            if (n < 0) return IIllIIIIl.llI(playerInventory);
            if (n >= 9) return IIllIIIIl.llI(playerInventory);
            return n;
        }
        return IlII.IIII(new lIIlIlll(minecraftClient));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean IIllIll(MinecraftClient minecraftClient, Hand hand) {
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.interactionManager == null || hand == null) {
            return false;
        }
        if (!lIIllllI.IlIIll(minecraftClient)) {
            return false;
        }
        if (lIIllllI.IIIIIlI(minecraftClient) > 0) {
            lIIllllI.IIIlIlI(minecraftClient);
        }
        try {
            boolean bl;
            ActionResult actionResult = lIIllllI.llllll(minecraftClient, hand);
            boolean bl2 = bl = actionResult != null && actionResult.isAccepted();
            if (bl) {
                lIIllllI.lIIlll(minecraftClient);
            }
            boolean bl3 = bl;
            return bl3;
        }
        finally {
            lIIllllI.IIIlIlI(minecraftClient);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IIlllII() {
        if (Il <= 0) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean IIlllIl(MinecraftClient minecraftClient, EntityHitResult entityHitResult) {
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.interactionManager == null || entityHitResult == null || !IlIlllI.lllll()) {
            return false;
        }
        Entity entity = entityHitResult.getEntity();
        if (entity == null || lIIllllI.Il(minecraftClient, entity)) {
            return false;
        }
        lIIllllI.IllIll(minecraftClient);
        HitResult hitResult = minecraftClient.crosshairTarget;
        minecraftClient.crosshairTarget = entityHitResult;
        ++Il;
        try {
            boolean bl = lIIllllI.IIIlIl(minecraftClient);
            return bl;
        }
        finally {
            Il = Math.max(0, Il - 1);
            minecraftClient.crosshairTarget = hitResult;
        }
    }

    public static boolean IIllllI(MinecraftClient minecraftClient) {
        if (minecraftClient != null && minecraftClient.player != null) {
            if (minecraftClient.interactionManager != null) {
                return lIIllllI.IIll(minecraftClient, minecraftClient.crosshairTarget);
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean IIlllll(MinecraftClient minecraftClient, EntityHitResult entityHitResult) {
        if (minecraftClient == null || minecraftClient.player == null || entityHitResult == null) {
            return false;
        }
        lIIllllI.IllIll(minecraftClient);
        HitResult hitResult = minecraftClient.crosshairTarget;
        minecraftClient.crosshairTarget = entityHitResult;
        try {
            boolean bl = lIIllllI.lIIIIII(minecraftClient);
            return bl;
        }
        finally {
            minecraftClient.crosshairTarget = hitResult;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IlIIIII() {
        if (lIlI > 0) return true;
        if (lIIII == null) return false;
        return true;
    }

    public static void IlIIIIl(MinecraftClient minecraftClient) {
        IIllIIIIl.lII(minecraftClient, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int IlIIIlI(MinecraftClient minecraftClient) {
        int n;
        if (minecraftClient == null) return Integer.MAX_VALUE;
        if (minecraftClient.player == null) {
            return Integer.MAX_VALUE;
        }
        if (minecraftClient.options != null) {
            if (minecraftClient.options.attackKey != null) {
                lIIllllI.llIlIl(minecraftClient.options.attackKey);
                minecraftClient.options.attackKey.setPressed(false);
            }
            if (minecraftClient.options.useKey != null) {
                lIIllllI.llIlIl(minecraftClient.options.useKey);
                minecraftClient.options.useKey.setPressed(false);
            }
        }
        boolean bl = false;
        if (minecraftClient.interactionManager != null) {
            if (IIllIIIIl.IIl(minecraftClient.interactionManager)) {
                minecraftClient.interactionManager.cancelBlockBreaking();
                bl = true;
            }
            if (minecraftClient.player.isUsingItem()) {
                minecraftClient.interactionManager.stopUsingItem((PlayerEntity)minecraftClient.player);
                bl = true;
            }
        }
        if (bl) {
            n = minecraftClient.player.age + 1;
            return n;
        }
        n = minecraftClient.player.age;
        return n;
    }

    public static InputUtil.Key IlIIIll(int n) {
        return n == -1 ? InputUtil.UNKNOWN_KEY : InputUtil.Type.KEYSYM.createFromCode(n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IlIIlII(Packet<?> packet) {
        if (!(packet instanceof UpdateSelectedSlotC2SPacket)) return;
        UpdateSelectedSlotC2SPacket updateSelectedSlotC2SPacket = (UpdateSelectedSlotC2SPacket)packet;
        IIIIlIl.lI(updateSelectedSlotC2SPacket.getSelectedSlot());
        if (lIIll != 0) return;
        lIIllllI.IlIlIlI();
    }

    public static void IlIIlIl() {
        lIIllllI.llll();
    }

    public static void IlIIllI() {
        lIIllllI.IIIlIll();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IlIIlll(InputUtil.Key key) {
        if (key == null) return true;
        if (key.equals((Object)InputUtil.UNKNOWN_KEY)) return true;
        if (key.getCode() < 0) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IlIlIII(MinecraftClient minecraftClient, int n) {
        KeyBinding[] keyBindingArray;
        if (minecraftClient == null) return false;
        if (minecraftClient.options == null) return false;
        if (n < 0) return false;
        if (n <= 8) {
            keyBindingArray = minecraftClient.options.hotbarKeys;
            if (keyBindingArray == null) return false;
            if (n >= keyBindingArray.length) {
                return false;
            }
        } else {
            return false;
        }
        KeyBinding keyBinding = keyBindingArray[n];
        if (keyBinding == null) {
            return false;
        }
        InputUtil.Key key = lIIllllI.IlllllI(keyBinding);
        if (lIIllllI.IlIIlll(key)) {
            return false;
        }
        lIIllllI.IIlll(keyBinding);
        return true;
    }

    public static void IlIlIIl(MinecraftClient minecraftClient, Entity entity) {
        if (minecraftClient == null || IIlll == null) {
            return;
        }
        try {
            IIlll.invoke((Object)minecraftClient, entity);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            // empty catch block
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private static void IlIlIlI() {
        lIIlI |= IlII.lII();
        lIIII = null;
        IIIll = false;
        lIlI = 0;
        llIIl = 0;
        IlIll = 0;
        lIlII = false;
        IlII.IllI();
        IlIlllI.l();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IlIlIll() {
        if (!IllIl) return false;
        if (!IIIIlIl.IIII(IIlII)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static LivingEntity IlIllII(MinecraftClient minecraftClient, HitResult hitResult) {
        if (!(hitResult instanceof EntityHitResult)) return null;
        EntityHitResult entityHitResult = (EntityHitResult)hitResult;
        Entity entity = entityHitResult.getEntity();
        if (!(entity instanceof LivingEntity)) return null;
        LivingEntity livingEntity = (LivingEntity)entity;
        if (!IIllllllI.II(livingEntity)) return livingEntity;
        return null;
    }

    private static Float IlIllIl(Object object, String string, String string2) {
        if (object == null) {
            return null;
        }
        try {
            return Float.valueOf(((Number)object.getClass().getMethod(string, new Class[0]).invoke(object, new Object[0])).floatValue());
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            try {
                return Float.valueOf(((Number)object.getClass().getMethod(string2, new Class[0]).invoke(object, new Object[0])).floatValue());
            }
            catch (ReflectiveOperationException reflectiveOperationException2) {
                try {
                    Field field = object.getClass().getDeclaredField(string2);
                    field.setAccessible(true);
                    return Float.valueOf(((Number)field.get(object)).floatValue());
                }
                catch (ReflectiveOperationException reflectiveOperationException3) {
                    return null;
                }
            }
        }
    }

    public static void IlIlllI(MinecraftClient minecraftClient, Object object, int n) {
        lIIllllI.lIIlI(minecraftClient, object, n, 1);
    }

    public static int IlIllll(EntityPositionS2CPacket entityPositionS2CPacket) {
        try {
            return (Integer)entityPositionS2CPacket.getClass().getMethod("entityId", new Class[0]).invoke((Object)entityPositionS2CPacket, new Object[0]);
        }
        catch (Exception exception) {
            try {
                return (Integer)entityPositionS2CPacket.getClass().getMethod("getEntityId", new Class[0]).invoke((Object)entityPositionS2CPacket, new Object[0]);
            }
            catch (Exception exception2) {
                return 0;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static JsonElement IllIIII(InputUtil.Key key) {
        if (lIIllllI.IlIIlll(key)) {
            return null;
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", (Number)(key.getCategory() != InputUtil.Type.MOUSE ? 0 : 1));
        jsonObject.addProperty("code", (Number)key.getCode());
        return jsonObject;
    }

    private static Double IllIIIl(Object object, String string, String string2) {
        try {
            return ((Number)object.getClass().getMethod(string, new Class[0]).invoke(object, new Object[0])).doubleValue();
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            try {
                return ((Number)object.getClass().getMethod(string2, new Class[0]).invoke(object, new Object[0])).doubleValue();
            }
            catch (ReflectiveOperationException reflectiveOperationException2) {
                try {
                    Field field = object.getClass().getDeclaredField(string2);
                    field.setAccessible(true);
                    return ((Number)field.get(object)).doubleValue();
                }
                catch (ReflectiveOperationException reflectiveOperationException3) {
                    return null;
                }
            }
        }
    }

    private static int[] IllIIlI(NativeImage nativeImage) {
        for (String string : new String[]{"copyPixelsArgb", "makePixelArray", "copyPixelsAbgr"}) {
            try {
                Method method = nativeImage.getClass().getDeclaredMethod(string, new Class[0]);
                method.setAccessible(true);
                int[] nArray = (int[])method.invoke((Object)nativeImage, new Object[0]);
                if ("copyPixelsAbgr".equals(string)) {
                    lIIllllI.llIIIl(nArray);
                }
                return nArray;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
            }
        }
        try {
            Method method = nativeImage.getClass().getDeclaredMethod("getColorArgb", Integer.TYPE, Integer.TYPE);
            method.setAccessible(true);
            int[] nArray = new int[nativeImage.getWidth() * nativeImage.getHeight()];
            for (int i = 0; i < nativeImage.getHeight(); ++i) {
                for (int j = 0; j < nativeImage.getWidth(); ++j) {
                    nArray[i * nativeImage.getWidth() + j] = (Integer)method.invoke((Object)nativeImage, j, i);
                }
            }
            return nArray;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void IllIIll() {
        IllIl = false;
        lIlII = false;
        l = false;
        IIlIl = false;
    }

    private static Vec3d IllIlII(Object object) {
        if (object == null) {
            return null;
        }
        Vec3d vec3d = lIIllllI.IIlIllI(object);
        if (vec3d != null) {
            return vec3d;
        }
        for (String string : new String[]{"values", "change", "position", "pos", "delta"}) {
            try {
                Object object2 = object.getClass().getMethod(string, new Class[0]).invoke(object, new Object[0]);
                Vec3d vec3d2 = lIIllllI.IIlIllI(object2);
                if (vec3d2 == null) continue;
                return vec3d2;
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                // empty catch block
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean IllIlIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.player.isUsingItem()) {
            return true;
        } else {
            if (IIllIIIIl.IIII(minecraftClient) <= 0) return false;
            return true;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IllIllI(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n >= 9) return false;
        if (lIllI >= 0) {
            if (lIllI == n) return true;
            return false;
        }
        if (IIIIlIl.Ill() >= 0) return false;
        if (IIllIIIIl.llI(minecraftClient.player.getInventory()) != n) return false;
        if (IIIlI >= 0) return false;
        if (!IlIl) return true;
        return false;
    }

    public static void IllIlll(Packet<?> packet) {
        if (packet instanceof UpdateSelectedSlotC2SPacket) {
            UpdateSelectedSlotC2SPacket updateSelectedSlotC2SPacket = (UpdateSelectedSlotC2SPacket)packet;
            IIIIlIl.IlI(updateSelectedSlotC2SPacket.getSelectedSlot());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IlllIII(MinecraftClient minecraftClient, Object object, int n) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (object == null) return false;
        if (n < 0) return false;
        if (n > 8) return false;
        if (lIIII != null) return false;
        if (l) return false;
        lIIlIlll lIIlIlll2 = new lIIlIlll(minecraftClient);
        IllIllI illIllI = lIll;
        IIlIIIIIl iIlIIIIIl = IlII.lllI(lIIlIlll2, object, n, illIllI, -1, true, null);
        if (iIlIIIIIl.II() == 0L) {
            return false;
        }
        if (illIllI == IllIllI.II) {
            lIIllllI.IIlIlII(minecraftClient);
        }
        boolean bl = iIlIIIIIl.II() < 0L ? lIIlIlll2.lI(illIllI, n) : IlII.lIlI(lIIlIlll2, iIlIIIIIl, minecraftClient.player.age);
        if (!bl) return bl;
        if (!IllIl) return bl;
        if (illIllI != IllIllI.II) return bl;
        lIlII = true;
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean IlllIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.useKey != null) {
            if (!lIIllllI.IlIIlll(lIIllllI.IlllllI(minecraftClient.options.useKey))) {
                lIIllllI.IIIlIlI(minecraftClient);
                lIIllllI.IIllllI(minecraftClient);
                return true;
            }
            return false;
        }
        return false;
    }

    private static boolean IlllIlI(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null || minecraftClient.getWindow() == null) {
            return false;
        }
        if (lIII != null) {
            try {
                Class<?> clazz = lIII.getParameterTypes()[0];
                Window window = clazz == Long.TYPE ? Long.valueOf(minecraftClient.getWindow().getHandle()) : minecraftClient.getWindow();
                return (Boolean)lIII.invoke(null, window, n);
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                // empty catch block
            }
        }
        return GLFW.glfwGetKey((long)minecraftClient.getWindow().getHandle(), (int)n) == 1;
    }

    public static boolean IlllIll(MinecraftClient minecraftClient, int n) {
        IlIlIll ilIlIll = lIIllllI.IIlIll(minecraftClient, n, 0, true);
        return lIIllllI.lIlIll(minecraftClient, ilIlIll);
    }

    public static void IllllII(boolean bl) {
        lIIIl = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static ActionResult IllllIl(MinecraftClient minecraftClient, Hand hand, BlockHitResult blockHitResult) {
        if (minecraftClient == null) return ActionResult.FAIL;
        if (minecraftClient.player == null) return ActionResult.FAIL;
        if (minecraftClient.interactionManager == null) return ActionResult.FAIL;
        if (hand == null) return ActionResult.FAIL;
        if (blockHitResult == null) {
            return ActionResult.FAIL;
        }
        if (!lIIllllI.IlIIll(minecraftClient)) {
            return ActionResult.FAIL;
        }
        lIIllllI.IllIl(minecraftClient);
        ActionResult actionResult = minecraftClient.interactionManager.interactBlock(minecraftClient.player, hand, blockHitResult);
        if (actionResult == null) return actionResult;
        if (!actionResult.isAccepted()) return actionResult;
        lIIllllI.IlIlII(minecraftClient, hand, actionResult);
        lIIllllI.lIIlll(minecraftClient);
        return actionResult;
    }

    public static InputUtil.Key IlllllI(KeyBinding keyBinding) {
        InputUtil.Key key;
        Object object;
        if (keyBinding == null) {
            return InputUtil.UNKNOWN_KEY;
        }
        if (lIl != null) {
            try {
                object = lIl.get(keyBinding);
                if (object instanceof InputUtil.Key && !lIIllllI.IlIIlll(key = (InputUtil.Key)object)) {
                    return key;
                }
            }
            catch (ReflectiveOperationException reflectiveOperationException) {
                // empty catch block
            }
        }
        try {
            object = keyBinding.getBoundKeyTranslationKey();
            if (object != null && !((String)object).isBlank() && !lIIllllI.IlIIlll(key = InputUtil.fromTranslationKey((String)object))) {
                return key;
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return InputUtil.UNKNOWN_KEY;
    }

    public static boolean Illllll(MinecraftClient minecraftClient) {
        lIIllllI.IllIll(minecraftClient);
        return lIIllllI.lIIIIII(minecraftClient);
    }

    private static boolean lIIIIII(MinecraftClient minecraftClient) {
        ++Il;
        try {
            if (minecraftClient == null || minecraftClient.player == null || minecraftClient.interactionManager == null) {
                boolean bl = false;
                return bl;
            }
            if (lIIllllI.lIIIl(minecraftClient)) {
                boolean bl = false;
                return bl;
            }
            Entity entity = lIIllllI.llIlII(minecraftClient);
            if (lIIllllI.Il(minecraftClient, entity)) {
                boolean bl = false;
                return bl;
            }
            boolean bl = lIIllllI.IIIlIl(minecraftClient);
            return bl;
        }
        finally {
            Il = Math.max(0, Il - 1);
        }
    }

    private static int lIIIIIl(int n, int n2) {
        return lI[n ^ 0x3F1F5A02] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIIIIlI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xD13551D5;
        char[] cArray = llIll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lllII[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIIllllI.lllII[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x76982994;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 29 -> 78;
                case 21 -> 112;
                case 10 -> 53;
                case 2 -> 229;
                case 24 -> 136;
                case 1 -> 24;
                case 8 -> 120;
                case 15 -> 164;
                case 27 -> 122;
                case 3 -> 83;
                case 28 -> 201;
                case 25 -> 60;
                case 31 -> 220;
                case 30 -> 187;
                case 26 -> 5;
                case 17 -> 22;
                case 11 -> 75;
                case 13 -> 248;
                case 23 -> 129;
                default -> 225;
                case 16 -> 183;
                case 22 -> 64;
                case 7 -> 165;
                case 4 -> 138;
                case 18 -> 95;
                case 20 -> 55;
                case 14 -> 13;
                case 12 -> 30;
                case 5 -> 102;
                case 9 -> 206;
                case 6 -> 25;
                case 19 -> 178;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

