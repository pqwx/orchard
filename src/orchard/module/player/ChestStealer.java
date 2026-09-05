/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIlIIlI
 * Module         : ChestStealer  [PLAYER]
 * Description    : Randomly quick-moves items from open chest containers into inventory.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Only Valuables
 *   - .getBytes(
 *   - ChestAura
 *   - Shulkers
 *   - Hoppers
 *   - Delay
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.Blocks
 *  net.minecraft.block.ShulkerBoxBlock
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.HandledScreen
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.screen.GenericContainerScreenHandler
 *  net.minecraft.screen.HopperScreenHandler
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.ShulkerBoxScreenHandler
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package orchard.module.player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ShulkerBoxBlock;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.HopperScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.ShulkerBoxScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.RaycastContext;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIIllIlII;
import orchard.internal.IIlI;
import orchard.internal.IlIIlIlII;
import orchard.internal.IlIlllI;
import orchard.internal.IlllIIII;
import orchard.internal.lIIllllI;
import orchard.internal.llIll;
import orchard.module.player.AutoDeposit;
import orchard.module.player.InventoryCleaner;

@Environment(value=EnvType.CLIENT)
public final class ChestStealer
extends ModuleBase {
    private final llIll I;
    private int l;
    private final Set<BlockPos> II;
    private boolean Il;
    private final Map<Integer, IIIllIlII> lI;
    private int ll;
    private final llIll III;
    private long IIl;
    private long IlI;
    private static final double Ill = 1.0E-4;
    private static final long lII = 1000L;
    private long lIl;
    private static final double llI = 20.25;
    private final llIll lll;
    private BlockPos IIII;
    private final IIIlIlIIl IIIl = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Delay"), 85.0, 165.0, 0.0, 1000.0, 5.0).lII("ms"));
    private int IIlI;
    private static String[] IIll;
    private long IlII;
    private boolean IlIl = false;
    private static final int IllI = 8;
    private final llIll Illl;
    private static final int[] lIII;
    private static final String[] lIIl;
    private static final Object[] lIlI;

    /*
     * Unable to fully structure code
     */
    private IlIIlIlII I(MinecraftClient var1_1, ScreenHandler var2_2, int var3_3) {
        block13: {
            block10: {
                block12: {
                    block9: {
                        block7: {
                            block11: {
                                block8: {
                                    var4_4 = new ArrayList<Integer>();
                                    var5_5 = 0;
                                    var6_6 = Math.min(var3_3, var2_2.slots.size());
                                    var7_7 = 0;
                                    ** GOTO lbl22
lbl6:
                                    // 1 sources

                                    while (var8_8.canTakeItems((PlayerEntity)var1_1.player) && (var9_9 = var8_8.getStack()) != null) {
                                        break block7;
                                    }
                                    break block9;
lbl9:
                                    // 1 sources

                                    while (var8_8.id >= 0) {
                                        break block8;
                                    }
                                    break block9;
lbl12:
                                    // 2 sources

                                    while (true) {
                                        ++var5_5;
                                        if (this.lI.containsKey(var8_8.id)) break block9;
                                        break block10;
                                        break;
                                    }
                                }
                                if (!var8_8.hasStack()) break block9;
                                ** GOTO lbl6
lbl19:
                                // 1 sources

                                while (true) {
                                    if (this.IIllI(var9_9)) ** GOTO lbl12
                                    break block9;
lbl22:
                                    // 2 sources

                                    while (var7_7 < var6_6) {
                                        break block11;
                                    }
                                    break block12;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (this.lIll(var1_1, var9_9)) {
                                    break block9;
                                }
                                break block13;
                            }
                            var8_8 = (Slot)var2_2.slots.get(var7_7);
                            if (var8_8 == null) break block9;
                            ** GOTO lbl9
                        }
                        if (!var9_9.isEmpty()) ** GOTO lbl25
                    }
lbl35:
                    // 2 sources

                    while (true) {
                        ++var7_7;
                        ** GOTO lbl22
                        break;
                    }
                }
                return new IlIIlIlII(var4_4, var5_5);
            }
            var4_4.add(var8_8.id);
            ** while (true)
        }
        if (((Boolean)this.III.lIl()).booleanValue()) ** break;
        ** while (true)
        ** while (true)
    }

    public ChestStealer() {
        super(StringFactory.IIII("ChestStealer"), Category.IIl, StringFactory.IIII("Randomly quick-moves items from open chest containers into inventory."));
        this.I = this.IIlllIl(new llIll((Object)StringFactory.IIII("Shulkers"), true));
        this.lll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Hoppers"), false));
        this.Illl = this.IIlllIl(new llIll((Object)StringFactory.IIII("ChestAura"), false));
        this.III = this.IIlllIl(new llIll((Object)StringFactory.IIII("Only Valuables"), false));
        this.l = Integer.MIN_VALUE;
        this.ll = Integer.MIN_VALUE;
        this.IIlI = Integer.MIN_VALUE;
        this.lI = new HashMap<Integer, IIIllIlII>();
        this.II = new HashSet<BlockPos>();
    }

    private void lI() {
        this.l = Integer.MIN_VALUE;
        this.ll = Integer.MIN_VALUE;
        this.IIlI = Integer.MIN_VALUE;
        this.lI.clear();
        this.lIII();
    }

    private long IIl() {
        double d;
        double d2 = this.IIIl.IIIl();
        if (d2 == (d = this.IIIl.IIII())) {
            return Math.round(d2);
        }
        return Math.round(ThreadLocalRandom.current().nextDouble(d2, d));
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IlI(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (!this.lIIl(minecraftClient)) return false;
        Screen screen = minecraftClient.currentScreen;
        if (!(screen instanceof HandledScreen)) return false;
        HandledScreen handledScreen = (HandledScreen)screen;
        if (this.IllI(minecraftClient)) {
            return false;
        }
        screen = handledScreen.getScreenHandler();
        if (this.IIII((ScreenHandler)screen) <= 0) return false;
        if (screen.getCursorStack() != null) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lII(MinecraftClient minecraftClient) {
        block9: {
            long l2;
            boolean bl;
            float f;
            float f2;
            long l3;
            block8: {
                l3 = System.currentTimeMillis();
                if (!this.Il) break block8;
                if (l3 - this.lIl <= 1000L) break block9;
                this.lIII();
            }
            if (l3 - this.IIl < this.IlI) {
                return;
            }
            IlllIIII illlIIII = this.llII(minecraftClient);
            if (illlIIII == null) {
                return;
            }
            Vec3d vec3d = illlIIII.I().getPos();
            if (IlIlllI.III(minecraftClient, illlIIII.I(), false)) {
                f2 = minecraftClient.player.getYaw();
                f = minecraftClient.player.getPitch();
            } else {
                float[] fArray = IlIlllI.IlIll(minecraftClient, vec3d);
                if (fArray == null) {
                    return;
                }
                f2 = fArray[0];
                f = fArray[1];
            }
            if (!(bl = IlIlllI.IlI(minecraftClient, 175, f2, f, () -> this.IlIII(l2 = ++this.IlII, minecraftClient, illlIIII)))) return;
            this.Il = true;
            this.lIl = l3;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIl(ClientPlayerEntity clientPlayerEntity, Vec3d vec3d) {
        if (clientPlayerEntity == null) return false;
        if (vec3d == null) return false;
        if (!(clientPlayerEntity.getEyePos().squaredDistanceTo(vec3d) <= 20.25)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private BlockHitResult lll(MinecraftClient minecraftClient, BlockPos blockPos) {
        BlockHitResult blockHitResult;
        Direction direction;
        Vec3d vec3d;
        Object object;
        if (!this.lIIl(minecraftClient)) return null;
        if (blockPos == null) return null;
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (hitResult instanceof BlockHitResult && (object = (BlockHitResult)hitResult).getType() == HitResult.Type.BLOCK) {
            if (object.getBlockPos().equals((Object)blockPos) && this.lIl(minecraftClient.player, object.getPos())) return object;
        }
        object = new ArrayList<Direction>(Arrays.asList(Direction.values()));
        hitResult = minecraftClient.player.getEyePos();
        Vec3d vec3d2 = Vec3d.ofCenter((Vec3i)blockPos);
        object.sort(Comparator.comparingDouble(arg_0 -> this.IIIIl(vec3d2, (Vec3d)hitResult, arg_0)));
        Iterator iterator = object.iterator();
        do {
            if (!iterator.hasNext()) return null;
        } while (!this.lIl(minecraftClient.player, vec3d = this.IIlII(vec3d2, direction = (Direction)iterator.next())) || (blockHitResult = minecraftClient.world.raycast(new RaycastContext((Vec3d)hitResult, vec3d, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, (Entity)minecraftClient.player))) == null || blockHitResult.getType() == HitResult.Type.MISS || !blockHitResult.getBlockPos().equals((Object)blockPos));
        return blockHitResult;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIII(ScreenHandler screenHandler) {
        if (screenHandler instanceof GenericContainerScreenHandler) {
            GenericContainerScreenHandler genericContainerScreenHandler = (GenericContainerScreenHandler)screenHandler;
            return genericContainerScreenHandler.getRows() * 9;
        }
        if (((Boolean)this.I.lIl()).booleanValue() && screenHandler instanceof ShulkerBoxScreenHandler) {
            return 27;
        }
        if ((Boolean)this.lll.lIl() == false) return 0;
        if (!(screenHandler instanceof HopperScreenHandler)) return 0;
        return 5;
    }

    private static void IlII() {
        ChestStealer.IIll[0] = ChestStealer.IIlll(ChestStealer.IlIll(-1561807006, 531838635).toCharArray(), 319L, 1531995212);
        ChestStealer.IIll[1] = ChestStealer.IIlll(ChestStealer.IlIll(-1561807005, 1078215601).toCharArray(), 89649L, -930119117);
        ChestStealer.IIll[2] = ChestStealer.IIlll(ChestStealer.IlIll(-1561807008, -2039056759).toCharArray(), 7942L, -413120039);
        ChestStealer.IIll[3] = ChestStealer.IIlll(ChestStealer.IlIll(-1561807007, 2074875860).toCharArray(), 85072L, -1004797734);
        ChestStealer.IIll[4] = ChestStealer.IIlll(ChestStealer.IlIll(-1561807002, -1631639081).toCharArray(), 25906L, -653843850);
        ChestStealer.IIll[5] = ChestStealer.IIlll(ChestStealer.IlIll(-1561807001, 2035375454).toCharArray(), 39484L, -1223089635);
        ChestStealer.IIll[6] = ChestStealer.IIlll(ChestStealer.IlIll(-1561807004, -2098766400).toCharArray(), 838L, 1229023934);
        ChestStealer.IIll[7] = ChestStealer.IIlll(ChestStealer.IlIll(-1561807003, -1832044965).toCharArray(), 86930L, 243658884);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI(MinecraftClient minecraftClient) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        AutoDeposit autoDeposit = clientEntrypoint.IlI().llll();
        if (autoDeposit == null) return false;
        if (autoDeposit.IIIlI(minecraftClient)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illl(MinecraftClient minecraftClient, IlllIIII illlIIII) {
        if (illlIIII == null) return false;
        if (!this.IIIlI(minecraftClient, illlIIII.l())) {
            return false;
        }
        BlockHitResult blockHitResult = this.lll(minecraftClient, illlIIII.l());
        if (blockHitResult == null) {
            blockHitResult = illlIIII.I();
        }
        if (this.lIl(minecraftClient.player, blockHitResult.getPos())) {
            lIIllllI.IIIlIlI(minecraftClient);
            ActionResult actionResult = minecraftClient.interactionManager.interactBlock(minecraftClient.player, Hand.MAIN_HAND, blockHitResult);
            if (actionResult == null) return false;
            if (!actionResult.isAccepted()) return false;
            this.IIII = illlIIII.l().toImmutable();
            this.II.add(this.IIII);
            minecraftClient.player.swingHand(Hand.MAIN_HAND);
            return true;
        }
        return false;
    }

    private void lIII() {
        this.Il = false;
        this.lIl = 0L;
        ++this.IlII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    private void lIlI(MinecraftClient minecraftClient, ScreenHandler screenHandler, int n) {
        int n2 = minecraftClient.player.age;
        this.lI.entrySet().removeIf(entry -> {
            if (n2 - ((IIIllIlII)entry.getValue()).I >= 8) {
                return true;
            }
            Slot slot = this.IIIll(screenHandler, n, (Integer)entry.getKey());
            if (slot == null) return true;
            if (!slot.hasStack()) {
                return true;
            }
            ItemStack itemStack = slot.getStack();
            if (itemStack == null) return true;
            if (itemStack.isEmpty()) return true;
            if (!((IIIllIlII)entry.getValue()).Il(itemStack)) return true;
            return false;
        });
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void III() {
        block31: {
            block27: {
                block32: {
                    block21: {
                        block39: {
                            block34: {
                                block36: {
                                    block37: {
                                        block22: {
                                            block33: {
                                                block35: {
                                                    block38: {
                                                        block29: {
                                                            block30: {
                                                                block25: {
                                                                    block28: {
                                                                        block26: {
                                                                            block23: {
                                                                                block24: {
                                                                                    var1_1 = MinecraftClient.getInstance();
                                                                                    if (!this.lIIl(var1_1)) break block32;
                                                                                    break block33;
lbl4:
                                                                                    // 2 sources

                                                                                    while (var5_4) {
                                                                                        break block21;
                                                                                    }
                                                                                    break block34;
lbl7:
                                                                                    // 4 sources

                                                                                    while (true) {
                                                                                        this.lI();
                                                                                        break block22;
                                                                                        break;
                                                                                    }
lbl10:
                                                                                    // 1 sources

                                                                                    return;
                                                                                    while (true) {
                                                                                        this.ll = -2147483648;
                                                                                        if (var7_6.II()) break block23;
                                                                                        break block24;
                                                                                        break;
                                                                                    }
lbl16:
                                                                                    // 1 sources

                                                                                    while (var3_2.getCursorStack() != null) {
                                                                                        break block25;
lbl18:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            var5_4 = false;
                                                                                            var6_10 = Math.min(var4_3, var3_2.slots.size());
                                                                                            var7_5 = 0;
                                                                                            break block26;
lbl23:
                                                                                            // 1 sources

                                                                                            while (var8_7.hasStack()) {
                                                                                                break block27;
                                                                                            }
                                                                                            break block28;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    break block35;
                                                                                }
                                                                                return;
lbl29:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    this.lI();
                                                                                    return;
                                                                                }
lbl32:
                                                                                // 1 sources

                                                                                while ((var4_3 = this.IIII((ScreenHandler)(var3_2 = var2_9.getScreenHandler()))) > 0) {
                                                                                    ** GOTO lbl16
                                                                                }
                                                                                break block35;
lbl35:
                                                                                // 1 sources

                                                                                return;
lbl37:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (!((Boolean)this.Illl.lIl()).booleanValue()) ** GOTO lbl7
                                                                                    break block29;
                                                                                    break;
                                                                                }
                                                                            }
                                                                            var8_8 = System.currentTimeMillis();
                                                                            if (var8_8 - this.IIl >= this.IlI) break block36;
                                                                            break block37;
                                                                        }
lbl45:
                                                                        // 2 sources

                                                                        while (var7_5 < var6_10) {
                                                                            var8_7 = (Slot)var3_2.slots.get(var7_5);
                                                                            if (var8_7 == null) break block28;
                                                                            ** GOTO lbl23
                                                                        }
                                                                        ** GOTO lbl4
lbl50:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var5_4 = true;
                                                                            ** GOTO lbl4
                                                                            break;
                                                                        }
lbl53:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
                                                                    }
lbl56:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        ++var7_5;
                                                                        ** GOTO lbl45
                                                                        break;
                                                                    }
lbl59:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (var3_2.syncId == this.l) ** GOTO lbl18
                                                                        break block30;
                                                                        break;
                                                                    }
                                                                }
                                                                if (var3_2.getCursorStack().isEmpty()) break block38;
                                                                break block35;
                                                            }
                                                            this.l = var3_2.syncId;
                                                            this.IlIl = false;
                                                            this.IIl = 0L;
                                                            this.IlI = this.IIl();
                                                            this.ll = -2147483648;
                                                            this.IIlI = -2147483648;
                                                            this.lI.clear();
                                                            ** while (true)
                                                            var2_9 = (HandledScreen)var3_2;
                                                            if (!this.IllI(var1_1)) ** GOTO lbl32
                                                            ** while (true)
                                                        }
                                                        if (var1_1.currentScreen != null) ** GOTO lbl7
                                                        break block39;
lbl80:
                                                        // 1 sources

                                                        while (true) {
                                                            if (!this.lIIl(var1_1)) ** GOTO lbl7
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
                                                    ** while (this.IIlI != var3_2.syncId)
lbl85:
                                                    // 1 sources

                                                    ** while (true)
                                                }
                                                return;
                                            }
                                            var3_2 = var1_1.currentScreen;
                                            if (var3_2 instanceof HandledScreen) {
                                                ** continue;
                                            }
                                            break block32;
                                        }
lbl94:
                                        // 2 sources

                                        return;
lbl96:
                                        // 1 sources

                                        while (true) {
                                            this.IIlIl((ScreenHandler)var3_2, var4_3, var10_11, var1_1.player.age);
                                            var1_1.interactionManager.clickSlot(var3_2.syncId, var10_11, 0, SlotActionType.QUICK_MOVE, (PlayerEntity)var1_1.player);
                                            this.IIl = System.currentTimeMillis();
                                            this.IlI = this.IIl();
                                            orchard.internal.IIlI.Illl(var1_1);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                var10_11 = var7_6.Il();
                                ** while (orchard.internal.IIlI.l((MinecraftClient)var1_1))
lbl108:
                                // 1 sources

                                ** while (true)
                            }
lbl110:
                            // 2 sources

                            while (true) {
                                this.lIlI(var1_1, (ScreenHandler)var3_2, var4_3);
                                if ((var7_6 = this.I(var1_1, (ScreenHandler)var3_2, var4_3)).I()) ** continue;
                                break block31;
                                break;
                            }
                        }
                        this.lII(var1_1);
                        ** while (true)
                    }
                    this.IlIl = true;
                    ** while (true)
                }
                if (this.IIIlIIl()) ** break;
                ** while (true)
                ** while (true)
            }
            ** while (var8_7.getStack().isEmpty())
lbl126:
            // 1 sources

            ** while (true)
        }
        this.llIl(var1_1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIll(MinecraftClient minecraftClient, ItemStack itemStack) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) {
            return false;
        }
        InventoryCleaner inventoryCleaner = clientEntrypoint.IlI().IlIIIll();
        if (inventoryCleaner == null) return false;
        if (!inventoryCleaner.IIIlIIl()) return false;
        if (inventoryCleaner.lI(minecraftClient.player, itemStack)) return true;
        return false;
    }

    @Override
    public void ll() {
        this.IIl = 0L;
        this.IlI = this.IIl();
        this.l = Integer.MIN_VALUE;
        this.ll = Integer.MIN_VALUE;
        this.IIlI = Integer.MIN_VALUE;
        this.lI.clear();
        this.II.clear();
        this.IIII = null;
        this.IlIl = false;
        this.lIII();
    }

    /*
     * Unable to fully structure code
     */
    private IlllIIII llII(MinecraftClient var1_1) {
        block12: {
            block15: {
                block8: {
                    block11: {
                        block13: {
                            block10: {
                                block14: {
                                    block9: {
                                        var2_2 = var1_1.player.getBlockPos();
                                        var3_3 = null;
                                        var4_4 = 1.7976931348623157E308;
                                        var6_5 = -2;
                                        break block9;
lbl6:
                                        // 1 sources

                                        while ((var10_9 = this.lll(var1_1, var9_8)) == null) {
                                            break block8;
                                        }
                                        break block13;
lbl9:
                                        // 1 sources

                                        while (true) {
                                            ++var6_5;
                                            break block9;
                                            break;
                                        }
lbl12:
                                        // 1 sources

                                        while (true) {
                                            var8_7 = -4;
                                            break block10;
                                            break;
                                        }
                                    }
                                    if (var6_5 > 2) break block14;
                                    var7_6 = -4;
                                    break block15;
lbl19:
                                    // 1 sources

                                    while (!this.IIIlI(var1_1, var9_8)) {
                                        break block8;
                                    }
                                    ** GOTO lbl6
lbl22:
                                    // 1 sources

                                    while (true) {
                                        var4_4 = var11_10;
                                        var3_3 = new IlllIIII(var9_8.toImmutable(), var10_9);
                                        break block8;
                                        break;
                                    }
                                }
                                return var3_3;
                            }
lbl29:
                            // 2 sources

                            while (true) {
                                if (var8_7 > 4) break block11;
                                break block12;
                                break;
                            }
                        }
                        var11_10 = var1_1.player.getEyePos().squaredDistanceTo(var10_9.getPos());
                        if (var11_10 < var4_4) {
                            ** continue;
                        }
                        break block8;
                    }
                    ++var7_6;
                    break block15;
                }
lbl41:
                // 2 sources

                while (true) {
                    ++var8_7;
                    ** continue;
                    break;
                }
            }
            ** while (var7_6 > 4)
lbl46:
            // 1 sources

            ** while (true)
        }
        var9_8 = var2_2.add(var7_6, var6_5, var8_7);
        if (!this.II.contains(var9_8)) ** GOTO lbl19
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIl(MinecraftClient minecraftClient) {
        if (!this.lI.isEmpty()) {
            this.ll = Integer.MIN_VALUE;
            return;
        }
        if (this.ll == Integer.MIN_VALUE) {
            this.ll = minecraftClient.player.age;
            return;
        }
        int n = this.IlIl ? 0 : 20;
        if (minecraftClient.player.age - this.ll < n) return;
        this.IIIII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllI(BlockState blockState) {
        if (blockState.isOf(Blocks.CHEST)) return true;
        if (blockState.isOf(Blocks.TRAPPED_CHEST)) return true;
        if (blockState.isOf(Blocks.BARREL)) return true;
        if (blockState.isOf(Blocks.ENDER_CHEST)) {
            return true;
        }
        if (((Boolean)this.I.lIl()).booleanValue() && blockState.getBlock() instanceof ShulkerBoxBlock) {
            return true;
        }
        if ((Boolean)this.lll.lIl() == false) return false;
        if (!blockState.isOf(Blocks.HOPPER)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player != null) {
            if (this.IIlI != this.l) {
                this.IIlI = this.l;
                minecraftClient.player.closeHandledScreen();
                minecraftClient.setScreen(null);
                this.ll = Integer.MIN_VALUE;
                this.lI.clear();
                if (this.IIII == null) return;
                this.II.add(this.IIII);
                this.IIII = null;
                this.IlIl = false;
                return;
            }
            return;
        }
    }

    private /* synthetic */ double IIIIl(Vec3d vec3d, Vec3d vec3d2, Direction direction) {
        return this.IIlII(vec3d, direction).squaredDistanceTo(vec3d2);
    }

    @Override
    public void llll() {
        this.IIl = 0L;
        this.IlI = 0L;
        this.l = Integer.MIN_VALUE;
        this.ll = Integer.MIN_VALUE;
        this.IIlI = Integer.MIN_VALUE;
        this.lI.clear();
        this.II.clear();
        this.IIII = null;
        this.IlIl = false;
        this.lIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlI(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (!this.lIIl(minecraftClient)) return false;
        if (blockPos == null) {
            return false;
        }
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (!this.lllI(blockState)) return false;
        if (this.lll(minecraftClient, blockPos) != null) return true;
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private Slot IIIll(ScreenHandler var1_1, int var2_2, int var3_3) {
        var4_4 = Math.min(var2_2, var1_1.slots.size());
        var5_5 = 0;
        if (true) ** GOTO lbl16
        return var6_6;
        while (true) {
            block3: {
                block4: {
                    var6_6 = (Slot)var1_1.slots.get(var5_5);
                    if (var6_6 == null) break block3;
                    break block4;
                    return null;
                }
                if (var6_6.id == var3_3) ** continue;
            }
            ++var5_5;
lbl16:
            // 2 sources

            if (var5_5 >= var4_4) ** continue;
        }
    }

    private Vec3d IIlII(Vec3d vec3d, Direction direction) {
        Vec3i vec3i = direction.getVector();
        return vec3d.add((double)vec3i.getX() * 0.4999, (double)vec3i.getY() * 0.4999, (double)vec3i.getZ() * 0.4999);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIl(ScreenHandler screenHandler, int n, int n2, int n3) {
        Slot slot = this.IIIll(screenHandler, n, n2);
        if (slot == null) return;
        if (!slot.hasStack()) {
            return;
        }
        ItemStack itemStack = slot.getStack();
        if (itemStack == null) return;
        if (itemStack.isEmpty()) {
            return;
        }
        this.lI.put(n2, new IIIllIlII(this.IlIIl(itemStack), itemStack.getCount(), n3));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIllI(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) {
            return false;
        }
        if (itemStack.isDamageable()) {
            return true;
        }
        if (itemStack.getComponents().contains(DataComponentTypes.FOOD)) {
            return true;
        }
        if (itemStack.isOf(Blocks.OBSIDIAN.asItem())) return true;
        if (itemStack.isOf(Items.ENDER_PEARL)) return true;
        if (itemStack.isOf(Items.END_CRYSTAL)) return true;
        if (itemStack.isOf(Items.EXPERIENCE_BOTTLE)) return true;
        if (itemStack.isOf(Items.TOTEM_OF_UNDYING)) return true;
        if (itemStack.isOf(Items.GOLDEN_APPLE)) return true;
        if (itemStack.isOf(Items.ENCHANTED_GOLDEN_APPLE)) return true;
        if (itemStack.isOf(Items.POTION)) return true;
        if (itemStack.isOf(Items.SPLASH_POTION)) return true;
        if (itemStack.isOf(Items.LINGERING_POTION)) return true;
        if (itemStack.isOf(Blocks.RESPAWN_ANCHOR.asItem())) return true;
        if (itemStack.isOf(Items.GLOWSTONE)) return true;
        if (itemStack.isOf(Items.ARROW)) return true;
        if (!itemStack.isOf(Blocks.COBWEB.asItem())) return false;
        return true;
    }

    private static String IIlll(char[] cArray, long l2, int n) {
        int n2 = 0x1D822A00 ^ n;
        int n3 = 0;
        while (n3 < cArray.length) {
            n2 = n2 ^ (int)l2 ^ ~n3;
            n2 ^= n - n3 * cArray.length;
            n2 = -n2 * n | n3;
            cArray[n3] = (char)(cArray[n3] ^ n2);
            int n4 = n3 & 0xFF;
            n = n << n4 | n >>> -n4;
            l2 ^= (long)n4;
            ++n3;
        }
        return new String(cArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean IlIII(long l2, MinecraftClient minecraftClient, IlllIIII illlIIII) {
        if (!this.Il) return false;
        if (l2 == this.IlII) {
            boolean bl = this.Illl(minecraftClient, illlIIII);
            this.Il = false;
            this.lIl = 0L;
            if (!bl) return bl;
            this.IIl = System.currentTimeMillis();
            this.IlI = this.IIl();
            return bl;
        }
        return false;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 17994;
        String string = "\uade5\u7291\ubf17\u92d7\uddb2\u9f8c\ua1b1\u81a3\uace7\uc59b\ud613\u880f\uf219\u97a5\u10bf\uf6a3\u61d2\u8cfc\uf767\u272a\u12cc\ube7d\u66ac\u48dd\uc0d8\u1d65\u0574\u8120\ue733\u19bf\ue9bf\uc4e8\u9bfd\ufce3\u8850\ud19c\u3e07\u50a9\u5fa2\u6aef\ueb89\u4faa\ueaa5\ub07a\ue0ac\u7c22\u47c4\ufc0c\ubc71\u9952\ub9fa\ua5c7\u0ce9\u51b3\u4579\u4441\u9f02\u45b7\ubb48\u86fd\u319c\u30fb\uc31d\ufa84\uda6e\u6d77\u1c97\uc6d6\ud6f4\u22da\ud4d9\u527a\u2c49\u4d1c\u8f2f\uf8ff\ucf2a\u7292\ua85b\ud1b9\u6e49\u9d09\u7431\u6bbc\uae3f\u9671\u10c5\u2126\ua46c\u08ed\u0ed9\u5d47\u5504\u7f27\u1b67\uefe0\u7a41\u1e78\u7db0\uf724\u08e0\uf1a4\u9846\u42df\u8a86\u53b0\ue2bb\u30ff\u354b\u067a\u03ad\u68c2\u6ac2\u7c01\u97d1\uada0\u54d9\ue3a7\u6abb\uacde\u8215\u6f12\u803d\u77c4\uf3d3\u8928\u27ce\u1958\u216b\ued57\u6cde\u24d6\u9471\u9c77\u2ba8\uec0c\u4149\udd60\ufbf3\uf61e\ufe6d\u2564\u0774\u667b\uef01\ue27e\u27f9\uadbf\u07aa\u358f\ue3a8\ue152\u8db5\ue75c\udfb4\u3d1d\u40ad\u77d2\uf480\u11d7\u2469\uee97\uc447\u0309\u8852\uf3cb\ua8e3\uf785\ud553\uba51\uf036\ua14e\udeaa\u7747\u7b10\u7e7d";
        char[] cArray = "\u4642\u4646\u465a\u4646\u464e\u4616\u465e\u4646".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                n2 = 0;
            }
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
        }
        lIIl = stringArray;
        lIlI = new Object[stringArray.length];
        int n6 = 894095763;
        byte[] byArray = "2\u00a2\u00f6\u009e\u00c5\u0099g\u0005\u00a7M\u00eb\u00a7\u0019\u00f6[8{\u00c4\u00c4\u00c03\u00e7\u00e3\u00f4\u00e5\t<\u0010\u0097B[\u00d3\u0005'\u001cdqz\u0000\u00e7%\u00bf\u00b3\u009f<\u0000Zy\u00a0\u0018g\u0092p\u00cc\u00824\u00e3F\n\u00fb\u00e7\u00beL\u0092\u00c2\u00f9+\u00e1FM\"S\u00f2W8=C\u009b\u000f +\u0013q{\u00d9}#\u00f6\u00dd\u00efR\u00e3T\u0098\u00ca\u00eb\u00e4i+\u00b3\r{W\u00e8*\u00f2\u0017\u00ea V\u00d6\u00af\u00a70^\u00e5 \u0085\u00a9\u00c6\u00a2\u00a88 \u0017\u008d]4\u00e9U\u00c0sD\u0012h\u0002C\u00deK#:;\u0003\u0088\u00fc\u00f9?v\u0095\u0004Wr\u00fc\u00d4\u00b5^\u00ebe\u00a2\u00b9\u008cl\u00f9\u00fe".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        lIII = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            ChestStealer.lIII[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        IIll = new String[8];
        ChestStealer.IlII();
    }

    private String IlIIl(ItemStack itemStack) {
        return itemStack.getItem().toString();
    }

    private static int IlIlI(int n, int n2) {
        return lIII[n ^ 0xFB7328FF] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IlIll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xA2E8B762;
        char[] cArray = lIIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIlI[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            ChestStealer.lIlI[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x48EC7599;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 9: {
                    n6 = 254;
                    continue block33;
                }
                case 29: {
                    n6 = 68;
                    continue block33;
                }
                case 13: {
                    n6 = 88;
                    continue block33;
                }
                default: {
                    n6 = 42;
                    continue block33;
                }
                case 25: {
                    n6 = 173;
                    continue block33;
                }
                case 21: {
                    n6 = 143;
                    continue block33;
                }
                case 6: {
                    n6 = 79;
                    continue block33;
                }
                case 15: {
                    n6 = 131;
                    continue block33;
                }
                case 19: {
                    n6 = 110;
                    continue block33;
                }
                case 20: {
                    n6 = 46;
                    continue block33;
                }
                case 4: {
                    n6 = 75;
                    continue block33;
                }
                case 8: {
                    n6 = 132;
                    continue block33;
                }
                case 28: {
                    n6 = 22;
                    continue block33;
                }
                case 2: {
                    n6 = 90;
                    continue block33;
                }
                case 5: {
                    n6 = 251;
                    continue block33;
                }
                case 10: {
                    n6 = 176;
                    continue block33;
                }
                case 7: {
                    n6 = 8;
                    continue block33;
                }
                case 17: {
                    n6 = 26;
                    continue block33;
                }
                case 26: {
                    n6 = 39;
                    continue block33;
                }
                case 14: {
                    n6 = 194;
                    continue block33;
                }
                case 30: {
                    n6 = 69;
                    continue block33;
                }
                case 1: {
                    n6 = 231;
                    continue block33;
                }
                case 31: {
                    n6 = 162;
                    continue block33;
                }
                case 16: {
                    n6 = 159;
                    continue block33;
                }
                case 18: {
                    n6 = 117;
                    continue block33;
                }
                case 23: {
                    n6 = 112;
                    continue block33;
                }
                case 11: {
                    n6 = 156;
                    continue block33;
                }
                case 3: {
                    n6 = 164;
                    continue block33;
                }
                case 22: {
                    n6 = 135;
                    continue block33;
                }
                case 24: {
                    n6 = 152;
                    continue block33;
                }
                case 12: {
                    n6 = 14;
                    continue block33;
                }
                case 27: 
            }
            n6 = 39;
        }
    }
}

