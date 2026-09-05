/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIlIlIl
 * Module         : AutoDeposit  [PLAYER]
 * Description    : Automatically deposits selected inventory items into an ender chest.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Auto Enderchest
 *   - Take off armor
 *   - Switch Delay
 *   - Action Delay
 *   - Custom Items
 *   - Auto Place
 *   - fire_aspect
 *   - unbreaking
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
 *  net.minecraft.component.type.AttributeModifiersComponent
 *  net.minecraft.component.type.AttributeModifiersComponent$Entry
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.BlockItem
 *  net.minecraft.item.BundleItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.screen.GenericContainerScreenHandler
 *  net.minecraft.screen.ScreenHandler
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 *  net.minecraft.text.TextContent
 *  net.minecraft.text.TranslatableTextContent
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Direction
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 *  net.minecraft.world.BlockView
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 */
package orchard.module.player;

import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.ToDoubleFunction;
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
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.BundleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.ScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.TextContent;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import net.minecraft.world.BlockView;
import net.minecraft.world.RaycastContext;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IIlIIlllI;
import orchard.internal.IIlll;
import orchard.internal.IlIIIlll;
import orchard.internal.IlIlIlI;
import orchard.internal.IlIlIll;
import orchard.internal.IlIlllI;
import orchard.internal.IlllII;
import orchard.internal.lIIIlIIl;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class AutoDeposit
extends ModuleBase {
    private boolean I;
    private int l;
    private static final int II = 2;
    private static final int Il = 4;
    private final llIll lI;
    private final IIIlIlIIl ll;
    private long III;
    private final llIll IIl;
    private final lIlIIlI IlI;
    private static final int Ill = 8;
    private boolean lII;
    private IlIlIll lIl;
    private boolean llI;
    private final llIll lll;
    private static final int IIII = 27;
    private final llIll IIIl;
    private int IIlI;
    private lIIIlIIl IIll;
    private boolean IlII;
    private int IlIl;
    private final llIll IllI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Auto Enderchest"), false));
    private final llIll Illl;
    private final llIll lIII;
    private int lIIl;
    private BlockPos lIlI;
    private static final int lIll = 36;
    private static final double llII = 0.0625;
    private final IlIlIlI llIl;
    private final IIIIIIIIl<IIlIIlllI> lllI = this.IIlllIl(new IIIIIIIIl<IIlIIlllI>(StringFactory.IIII("tZtQmQ=="), IIlIIlllI.class, IIlIIlllI.II));
    private static final double llll = 20.25;
    private static final int IIIII = 8;
    private static final int IIIIl = 2;
    private final IIIlIlIIl IIIlI;
    private BlockPos IIIll;
    private final Map<Integer, IlllII> IIlII;
    private BlockPos IIlIl;
    private int IIllI;
    private long IIlll;
    private boolean IlIII;
    private int IlIIl = -1;
    private long IlIlI;
    private final llIll IlIll;
    private final IIIlIlIIl IllII;
    private static final int[] IllIl;
    private static final String[] IlllI;
    private static final Object[] Illll;

    /*
     * Enabled aggressive block sorting
     */
    private double I(ItemStack itemStack) {
        if (!itemStack.isDamageable()) return 100.0;
        if (itemStack.getMaxDamage() > 0) return 100.0 * (double)(itemStack.getMaxDamage() - itemStack.getDamage()) / (double)itemStack.getMaxDamage();
        return 100.0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean l(ClientPlayerEntity clientPlayerEntity, BlockPos blockPos) {
        if (clientPlayerEntity == null) return false;
        if (!clientPlayerEntity.getBoundingBox().intersects(Box.from((Vec3d)Vec3d.of((Vec3i)blockPos)).offset(0.5, 0.5, 0.5).expand(0.49))) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private long lI(IIIlIlIIl iIIlIlIIl) {
        double d = iIIlIlIIl.IIIl();
        double d2 = iIIlIlIIl.IIII();
        if (d != d2) return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d, d2)));
        return Math.max(0L, Math.round(d));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIl() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null && minecraftClient.player != null) {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        }
        this.IlIlI();
        this.lIlI = null;
        this.IIlIl = null;
        this.IlIlI = 0L;
        this.l = Integer.MIN_VALUE;
        this.IlII = false;
        this.IIllI = Integer.MIN_VALUE;
        this.lII = false;
        this.lIIl = Integer.MIN_VALUE;
        this.llI = false;
        this.I = false;
        this.lIl = null;
    }

    private boolean IlI(MinecraftClient minecraftClient, lIIIlIIl lIIIlIIl2) {
        return IlIlllI.lI(minecraftClient, this.lIIlI(lIIIlIIl2));
    }

    private boolean lII(ItemStack itemStack) {
        return this.lIlII(itemStack) != null;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient;
        block6: {
            block7: {
                block8: {
                    block5: {
                        minecraftClient = MinecraftClient.getInstance();
                        if (!this.lIIIl(minecraftClient)) break block5;
                        if (!this.IIIIl(minecraftClient)) break block6;
                        this.IlII = false;
                        this.IIllI = Integer.MIN_VALUE;
                        this.lII = false;
                        this.lIIl = Integer.MIN_VALUE;
                        if (!((Boolean)this.IlIll.lIl()).booleanValue() || !this.IlIll(minecraftClient.player)) break block7;
                        break block8;
                    }
                    this.IIl();
                    return;
                }
                BlockPos blockPos = this.IIlIll(minecraftClient);
                if (blockPos != null && this.IIlIIl(minecraftClient.player)) {
                    this.lIlI = blockPos;
                    this.llI = true;
                    minecraftClient.player.closeHandledScreen();
                    minecraftClient.setScreen(null);
                    this.IlIlI();
                    return;
                }
            }
            this.llI = false;
            this.llIIl(minecraftClient, (HandledScreen)minecraftClient.currentScreen);
            return;
        }
        this.IlIlI();
        if (minecraftClient.currentScreen != null) return;
        if (orchard.internal.IIlI.IIl(minecraftClient)) return;
        if (minecraftClient.player.age < this.l) {
            return;
        }
        if ((((Boolean)this.IllI.lIl()).booleanValue() || this.llI) && ((Boolean)this.IlIll.lIl()).booleanValue() && this.IlIll(minecraftClient.player) && this.IIlIIl(minecraftClient.player) && this.lIl(minecraftClient)) {
            return;
        }
        if (!this.Illll(minecraftClient.player)) {
            return;
        }
        if (((Boolean)this.IllI.lIl()).booleanValue() || this.llI) {
            this.lIlI(minecraftClient);
            return;
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private boolean lIl(MinecraftClient minecraftClient) {
        int n;
        block4: {
            Slot slot;
            block3: {
                if (!this.IIlIIl(minecraftClient.player)) return false;
                if (!orchard.internal.IIlI.l(minecraftClient)) {
                    return false;
                }
                n = 5;
                if (!true) break block3;
                if (n > 8) return false;
                if ((slot = (Slot)minecraftClient.player.playerScreenHandler.slots.get(n)) != null && slot.hasStack() && slot.canTakeItems((PlayerEntity)minecraftClient.player)) break block4;
            }
            do {
                ++n;
                if (n > 8) return false;
            } while ((slot = (Slot)minecraftClient.player.playerScreenHandler.slots.get(n)) == null || !slot.hasStack() || !slot.canTakeItems((PlayerEntity)minecraftClient.player));
        }
        minecraftClient.interactionManager.clickSlot(minecraftClient.player.playerScreenHandler.syncId, n, 0, SlotActionType.QUICK_MOVE, (PlayerEntity)minecraftClient.player);
        orchard.internal.IIlI.Illl(minecraftClient);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llI(ItemStack itemStack) {
        String string = Registries.ITEM.getId((Object)itemStack.getItem()).getPath();
        if (string.endsWith("_helmet")) return true;
        if (string.endsWith(StringFactory.IIl("p5dcmQpDQBCWHJo="))) return true;
        if (string.endsWith(StringFactory.IIl("p5hRmx5eXhuE"))) return true;
        if (string.endsWith("_boots")) return true;
        if (string.equals(StringFactory.IIl("nZhNiAtW"))) return true;
        return false;
    }

    /*
     * Unable to fully structure code
     */
    private double IIII(ItemStack var1_1) {
        block9: {
            block8: {
                block10: {
                    block12: {
                        block7: {
                            break block10;
lbl1:
                            // 1 sources

                            while (true) {
                                var2_2 += var6_5.modifier().value() * 45.0;
                                ** GOTO lbl14
lbl4:
                                // 1 sources

                                while (var6_5.attribute().equals((Object)EntityAttributes.ARMOR)) {
                                    var2_2 += var6_5.modifier().value() * 80.0;
                                    ** GOTO lbl14
                                }
                                break block7;
                                break;
                            }
lbl8:
                            // 1 sources

                            while (true) {
                                block11: {
                                    if (!var6_5.attribute().equals((Object)EntityAttributes.ATTACK_SPEED)) break block11;
                                    break block8;
lbl11:
                                    // 1 sources

                                    while (true) {
                                        var6_5 = (AttributeModifiersComponent.Entry)var5_4.next();
                                        ** GOTO lbl4
                                        break;
                                    }
                                }
lbl15:
                                // 4 sources

                                while (var5_4.hasNext()) {
                                    ** continue;
lbl17:
                                    // 1 sources

                                    ** GOTO lbl11
                                }
                                break block9;
                                break;
                            }
lbl19:
                            // 1 sources

                            while (true) {
                                var2_2 += var6_5.modifier().value() * 65.0;
                                ** GOTO lbl15
                                break;
                            }
                        }
                        if (!var6_5.attribute().equals((Object)EntityAttributes.ARMOR_TOUGHNESS)) break block12;
                        ** while (true)
lbl25:
                        // 1 sources

                        while (true) {
                            var5_4 = var4_3.modifiers().iterator();
                            ** GOTO lbl15
                            break;
                        }
                    }
                    ** while (!var6_5.attribute().equals((Object)EntityAttributes.ATTACK_DAMAGE))
lbl30:
                    // 1 sources

                    ** while (true)
                }
                var2_2 = 0.0;
                var4_3 = (AttributeModifiersComponent)var1_1.getOrDefault(DataComponentTypes.ATTRIBUTE_MODIFIERS, (Object)AttributeModifiersComponent.DEFAULT);
                ** while (true)
            }
            var2_2 += var6_5.modifier().value() * 10.0;
            ** GOTO lbl15
        }
        return var2_2;
    }

    /*
     * Unable to fully structure code
     */
    private Slot IIlI(ScreenHandler var1_1, int var2_2) {
        block5: {
            block4: {
                block3: {
                    var3_3 = var1_1.slots.iterator();
                    ** GOTO lbl-1000
lbl3:
                    // 1 sources

                    while (var4_4 == null) lbl-1000:
                    // 3 sources

                    {
                        while (true) {
                            if (!var3_3.hasNext()) break block3;
                            break block4;
                            break;
                        }
                    }
                    break block5;
lbl8:
                    // 1 sources

                    return var4_4;
                }
                return null;
            }
            var4_4 = (Slot)var3_3.next();
            ** GOTO lbl3
        }
        ** while (var4_4.id != var2_2)
lbl17:
        // 1 sources

        ** while (true)
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean IlII(MinecraftClient minecraftClient, lIIIlIIl lIIIlIIl2, int n) {
        boolean bl = false;
        try {
            if (!this.llllI(minecraftClient) || !this.lllII(minecraftClient, lIIIlIIl2.I())) {
                boolean bl2 = false;
                return bl2;
            }
            lIIllllI.IIIlIlI(minecraftClient);
            ActionResult actionResult = lIIllllI.IllllIl(minecraftClient, Hand.MAIN_HAND, this.lIIlI(lIIIlIIl2));
            boolean bl3 = bl = actionResult != null && actionResult.isAccepted();
            if (bl) {
                this.lIlI = lIIIlIIl2.I();
                this.l = minecraftClient.player.age + 2;
                boolean bl4 = true;
                return bl4;
            }
            boolean bl5 = false;
            return bl5;
        }
        finally {
            this.IlII = false;
            this.IIllI = Integer.MIN_VALUE;
            this.lllI();
            this.IIIlIl(minecraftClient, n);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lIII(ItemStack itemStack, IlIIIlll ilIIIlll) {
        if (!ilIIIlll.I) {
            return 0.0;
        }
        double d = this.IIIlll(itemStack) + this.IIII(itemStack) + this.lIllI(itemStack) + this.I(itemStack);
        if (ilIIIlll != IlIIIlll.IIl) return d;
        if (itemStack.getComponentChanges().get(DataComponentTypes.CUSTOM_MODEL_DATA) != null) {
            d += 180.0;
        }
        if (itemStack.getComponentChanges().get(DataComponentTypes.ITEM_MODEL) != null) {
            d += 140.0;
        }
        return d += (double)Math.min(64, itemStack.getCount());
    }

    @Override
    public void llll() {
        this.IIl();
        this.llIl.IlIIIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (!this.llllI(minecraftClient)) return false;
        if (blockPos == null) return false;
        if (!minecraftClient.world.getBlockState(blockPos).isOf(Blocks.ENDER_CHEST)) return false;
        Vec3d vec3d = Vec3d.ofCenter((Vec3i)blockPos);
        if (!this.IIllll(minecraftClient.player, vec3d)) return false;
        if (this.llIII(minecraftClient, vec3d, blockPos)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlI(MinecraftClient minecraftClient) {
        boolean bl;
        int n;
        lIIIlIIl lIIIlIIl2;
        int n2;
        block31: {
            boolean bl2;
            block29: {
                float[] fArray;
                block30: {
                    float[] fArray2;
                    BlockPos blockPos;
                    float f;
                    boolean bl3;
                    block28: {
                        float[] fArray3;
                        float f2;
                        block27: {
                            this.llIll(minecraftClient);
                            if (this.I) break block27;
                            if (this.IlII) return;
                            if (this.lII) {
                                return;
                            }
                            break block28;
                        }
                        if (this.IlIII) {
                        } else {
                            if (this.IIll == null) {
                                this.I = false;
                                return;
                            }
                            bl3 = this.IlI(minecraftClient, this.IIll);
                            float f3 = f = !bl3 ? this.llIl.llIIIl(minecraftClient, this.lIIlI(this.IIll), ((Double)this.IlI.lIl()).floatValue()) : 0.0f;
                        }
                        if (this.IIIll == null) {
                            this.I = false;
                            return;
                        }
                        boolean bl4 = this.IIlllI(minecraftClient, this.IIIll);
                        float f4 = f2 = bl4 ? 0.0f : this.llIl.IllII(minecraftClient, Vec3d.ofCenter((Vec3i)this.IIIll), ((Double)this.IlI.lIl()).floatValue());
                        if (!bl4 && !(f2 <= 0.5f)) {
                            if (System.currentTimeMillis() - this.IIlll < 1500L) return;
                        }
                        this.I = false;
                        if (!bl4) {
                            fArray3 = IlIlllI.IlIll(minecraftClient, Vec3d.ofCenter((Vec3i)this.IIIll));
                        } else {
                            float[] fArray4 = new float[2];
                            fArray4[0] = minecraftClient.player.getYaw();
                            fArray3 = fArray4;
                            fArray4[1] = minecraftClient.player.getPitch();
                        }
                        fArray = fArray3;
                        bl2 = false;
                        if (fArray == null) break block29;
                        break block30;
                    }
                    if (this.lIlI != null) {
                        if (minecraftClient.world.getBlockState(this.lIlI).isOf(Blocks.ENDER_CHEST)) {
                            if (!this.IIlIl(this.lIlI)) return;
                            this.lIlIl(minecraftClient, this.lIlI);
                            return;
                        }
                        this.lIlI = null;
                        this.IIlIl = null;
                        this.IlIlI = 0L;
                    }
                    if ((blockPos = this.IIlIll(minecraftClient)) == null) {
                        if (!((Boolean)this.IIl.lIl()).booleanValue()) {
                            return;
                        }
                        n2 = this.lIll(minecraftClient.player);
                        lIIIlIIl2 = this.lllll(minecraftClient);
                        if (n2 < 0) return;
                        if (lIIIlIIl2 == null) {
                            return;
                        }
                        break block31;
                    } else {
                        this.lIlI = blockPos;
                        if (!this.IIlIl(blockPos)) return;
                        this.lIlIl(minecraftClient, blockPos);
                        return;
                    }
                    if (!bl3 && !(f <= 0.5f)) {
                        if (System.currentTimeMillis() - this.IIlll < 1500L) return;
                    }
                    this.I = false;
                    if (bl3) {
                        float[] fArray5 = new float[2];
                        fArray5[0] = minecraftClient.player.getYaw();
                        fArray2 = fArray5;
                        fArray5[1] = minecraftClient.player.getPitch();
                    } else {
                        fArray2 = IlIlllI.IlIll(minecraftClient, this.IIll.II());
                    }
                    float[] fArray6 = fArray2;
                    boolean bl5 = false;
                    if (fArray6 != null) {
                        this.IlII = true;
                        this.IIllI = minecraftClient.player.age + 2;
                        bl5 = IlIlllI.IlI(minecraftClient, 175, fArray6[0], fArray6[1], () -> this.IlII(minecraftClient, this.IIll, this.IlIIl));
                    }
                    if (bl5) return;
                    this.IlII = false;
                    this.IIllI = Integer.MIN_VALUE;
                    return;
                }
                this.lII = true;
                this.lIIl = minecraftClient.player.age + 2;
                bl2 = IlIlllI.IlI(minecraftClient, 175, fArray[0], fArray[1], () -> this.lllIl(minecraftClient, this.IIIll, Vec3d.ofCenter((Vec3i)this.IIIll)));
            }
            if (bl2) return;
            this.lII = false;
            this.lIIl = Integer.MIN_VALUE;
            return;
        }
        int n3 = n = this.lIl != null ? this.lIl.III() : lIIllllI.lllI(minecraftClient.player.getInventory());
        if (!this.IIllI(minecraftClient, n2)) {
            return;
        }
        if (!this.IIlIl(lIIIlIIl2.I())) {
            return;
        }
        float[] fArray = IlIlllI.IlIll(minecraftClient, lIIIlIIl2.II());
        if (fArray == null) {
            this.IIIlIl(minecraftClient, n);
            return;
        }
        if (this.lllI.lIl() == IIlIIlllI.II) {
            this.IlII = true;
            this.IIllI = minecraftClient.player.age + 2;
            bl = IlIlllI.IlI(minecraftClient, 175, fArray[0], fArray[1], () -> this.IlII(minecraftClient, lIIIlIIl2, n));
        } else if (this.lllI.lIl() == IIlIIlllI.l) {
            this.IIll = lIIIlIIl2;
            this.IlIIl = n;
            this.IlIII = false;
            this.I = true;
            this.IIlll = System.currentTimeMillis();
            bl = true;
        } else {
            this.IlII = true;
            this.IIllI = minecraftClient.player.age + 2;
            bl = IlIlllI.IlI(minecraftClient, 175, fArray[0], fArray[1], () -> this.IlII(minecraftClient, lIIIlIIl2, n));
        }
        if (bl) return;
        this.IlII = false;
        this.IIllI = Integer.MIN_VALUE;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private int lIll(ClientPlayerEntity clientPlayerEntity) {
        int n = 0;
        boolean bl = true;
        do {
            if (!bl || (bl = false) || !true) {
                ++n;
            }
            if (n < 9) continue;
            return -1;
        } while (!clientPlayerEntity.getInventory().getStack(n).isOf(Items.ENDER_CHEST));
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public AutoDeposit() {
        super(StringFactory.IIII("uYFAkz1SQBOEAYs="), Category.IIl, StringFactory.IIII("uYFAkxRWRBWUCZNVFpPam4ibR5UNRBAPkgSaWhvW2t6RmkKZF0NfDo5Ilk0K3s3ekZpAk1lWXlySBptcHZPdlp2HQNI="));
        this.IlI = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("q4BGmRdQRBQ="), 50.0, 1.0, 100.0, 1.0).lIII(() -> {
            if (this.lllI.lIl() != IIlIIlllI.l) return false;
            return true;
        }));
        this.llIl = new IlIlIlI();
        this.IIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Auto Place"), true));
        this.IIIlI = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Delay"), 25.0, 50.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")));
        this.IllII = this.IIlllIl((IIIlIlIIl)new IIIlIlIIl(StringFactory.IIII("Switch Delay"), 55.0, 60.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")).lIII(() -> false));
        this.ll = this.IIlllIl((IIIlIlIIl)new IIIlIlIIl(StringFactory.IIII("Action Delay"), 10.0, 25.0, 0.0, 300.0, 5.0).IIll(StringFactory.IIII("ms")).lIII(() -> false));
        this.IlIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Take off armor"), false));
        this.IIIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Tools"), true));
        this.lll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Custom Items"), true));
        this.lI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Armor"), true));
        this.lIII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Shulkers"), true));
        this.Illl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Bundles"), true));
        this.IIlII = new HashMap<Integer, IlllII>();
        this.IIlI = Integer.MIN_VALUE;
        this.IlIl = Integer.MIN_VALUE;
        this.l = Integer.MIN_VALUE;
        this.IIllI = Integer.MIN_VALUE;
        this.lIIl = Integer.MIN_VALUE;
        this.lllI.lIII(this.IllI::lIl);
        this.IIl.lIII(this.IllI::lIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllI() {
        this.IIlIl = null;
        this.IlIlI = 0L;
        this.lIl = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIl(MinecraftClient minecraftClient) {
        Screen screen = minecraftClient.currentScreen;
        if (!(screen instanceof HandledScreen)) return false;
        HandledScreen handledScreen = (HandledScreen)screen;
        screen = handledScreen.getScreenHandler();
        if (!(screen instanceof GenericContainerScreenHandler)) return false;
        GenericContainerScreenHandler genericContainerScreenHandler = (GenericContainerScreenHandler)screen;
        if (genericContainerScreenHandler.getRows() != 3) {
            return false;
        }
        TextContent textContent = handledScreen.getTitle().getContent();
        if (!(textContent instanceof TranslatableTextContent)) return false;
        screen = (TranslatableTextContent)textContent;
        if (!StringFactory.IIl("m5taiBheXhmFRppXC9bMnZCRR4g=").equals(screen.getKey())) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIIlI(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (!this.IIIIl(minecraftClient)) return false;
        return true;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private int IIIll(ScreenHandler screenHandler, List<IIlll> list) {
        int n = 0;
        int n2 = 0;
        int n3 = 27;
        boolean bl = true;
        while (true) {
            ItemStack itemStack;
            IlIIIlll ilIIIlll;
            if (!bl || (bl = false) || !true) {
                ++n3;
            }
            if (n3 >= screenHandler.slots.size()) {
                return n;
            }
            Slot slot = (Slot)screenHandler.slots.get(n3);
            if (slot == null || slot.id < 0 || !slot.hasStack() || (ilIIIlll = this.lIlII(itemStack = slot.getStack())) == null) continue;
            ++n;
            if (!this.IIlII.containsKey(slot.id)) {
                list.add(new IIlll(slot.id, ilIIIlll, this.lIII(itemStack, ilIIIlll), n2));
            }
            ++n2;
        }
    }

    private void IIlII(MinecraftClient minecraftClient, ScreenHandler screenHandler) {
        int n = minecraftClient.player.age;
        this.IIlII.entrySet().removeIf(entry -> {
            if (n - ((IlllII)entry.getValue()).I() >= 8) {
                return true;
            }
            Slot slot = this.IIlI(screenHandler, (Integer)entry.getKey());
            if (slot == null) return true;
            if (!slot.hasStack()) {
                return true;
            }
            ItemStack itemStack = slot.getStack();
            if (itemStack == null) return true;
            if (itemStack.isEmpty()) return true;
            if (!((IlllII)entry.getValue()).II(itemStack)) return true;
            return false;
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIl(BlockPos blockPos) {
        long l2 = System.currentTimeMillis();
        if (blockPos != null) {
            if (this.IIlIl != null && this.IIlIl.equals((Object)blockPos)) {
                if (l2 >= this.IlIlI) return true;
                return false;
            }
            this.IIlIl = blockPos.toImmutable();
            this.IlIlI = l2 + this.lI(this.IIIlI);
            if (l2 >= this.IlIlI) return true;
            return false;
        }
        this.IIlIl = null;
        this.IlIlI = 0L;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIllI(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n < 9) {
            if (this.lIl != null) {
                if (this.lIl.l() == n) return lIIllllI.IIIllll(minecraftClient, this.lIl);
            }
        } else {
            return false;
        }
        boolean bl = lIIllllI.llIllI(minecraftClient) != n;
        int n2 = !bl ? 0 : this.IlllI(this.IIIlI);
        this.lIl = lIIllllI.IIIIlII(minecraftClient, this, n, n2, true);
        return lIIllllI.IIIllll(minecraftClient, this.lIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIII(ScreenHandler screenHandler, int n, int n2) {
        Slot slot = this.IIlI(screenHandler, n);
        if (slot == null) return;
        if (!slot.hasStack()) {
            return;
        }
        ItemStack itemStack = slot.getStack();
        if (itemStack == null) return;
        if (itemStack.isEmpty()) return;
        this.IIlII.put(n, new IlllII(itemStack.getItem().toString(), itemStack.getCount(), n2));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIIl(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (!(itemStack.getItem() instanceof BundleItem)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIlI() {
        this.IIlI = Integer.MIN_VALUE;
        this.IlIl = Integer.MIN_VALUE;
        this.IIlII.clear();
    }

    /*
     * Unable to fully structure code
     */
    private boolean IlIll(ClientPlayerEntity var1_1) {
        block8: {
            block6: {
                block7: {
                    if (var1_1 == null) break block7;
                    break block8;
lbl3:
                    // 1 sources

                    return true;
lbl5:
                    // 2 sources

                    while (true) {
                        ++var2_2;
                        ** GOTO lbl19
                        break;
                    }
                }
lbl9:
                // 2 sources

                return false;
lbl11:
                // 1 sources

                while (true) {
                    if (var3_3 == null) ** GOTO lbl5
                    break block6;
                    break;
                }
                while (true) {
                    var3_3 = (Slot)var1_1.playerScreenHandler.slots.get(var2_2);
                    ** continue;
                    break;
                }
lbl17:
                // 1 sources

                while (true) {
                    var2_2 = 5;
lbl19:
                    // 2 sources

                    if (var2_2 <= 8) ** continue;
                    return false;
                }
            }
            if (var3_3.hasStack()) ** break;
            ** while (true)
            ** while (true)
        }
        ** while (var1_1.playerScreenHandler != null)
lbl27:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllIl(ItemStack itemStack) {
        Item item = itemStack.getItem();
        if (!(item instanceof BlockItem)) return false;
        BlockItem blockItem = (BlockItem)item;
        if (!(blockItem.getBlock() instanceof ShulkerBoxBlock)) return false;
        return true;
    }

    private int IlllI(IIIlIlIIl iIIlIlIIl) {
        return Math.max(0, (int)Math.ceil((double)this.lI(iIIlIlIIl) / 50.0));
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private boolean Illll(ClientPlayerEntity clientPlayerEntity) {
        block3: {
            int n;
            int n2;
            block2: {
                n2 = Math.min(36, clientPlayerEntity.getInventory().size());
                n = 0;
                if (!true) break block2;
                if (n >= n2) return false;
                if (this.lII(clientPlayerEntity.getInventory().getStack(n))) break block3;
            }
            do {
                ++n;
                if (n >= n2) return false;
            } while (!this.lII(clientPlayerEntity.getInventory().getStack(n)));
        }
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIIIl(MinecraftClient minecraftClient) {
        if (!this.llllI(minecraftClient)) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    private BlockHitResult lIIlI(lIIIlIIl lIIIlIIl2) {
        return lIIIlIIl2 == null ? null : new BlockHitResult(lIIIlIIl2.II(), Direction.UP, lIIIlIIl2.l(), false);
    }

    private static /* synthetic */ double lIIll(MinecraftClient minecraftClient, BlockPos blockPos) {
        return minecraftClient.player.getEyePos().squaredDistanceTo(Vec3d.ofCenter((Vec3i)blockPos));
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIIIlll lIlII(ItemStack itemStack) {
        block9: {
            block10: {
                block7: {
                    block8: {
                        block4: {
                            block5: {
                                block6: {
                                    block3: {
                                        if (itemStack == null) return null;
                                        if (itemStack.isEmpty()) return null;
                                        if (!this.IllIl(itemStack)) break block3;
                                        if (((Boolean)this.lIII.lIl()).booleanValue()) break block4;
                                        break block5;
                                    }
                                    if (!this.IlIIl(itemStack)) break block6;
                                    if (((Boolean)this.Illl.lIl()).booleanValue()) break block7;
                                    break block8;
                                }
                                if (!((Boolean)this.lI.lIl()).booleanValue() && !((Boolean)this.IlIll.lIl()).booleanValue()) break block9;
                                break block10;
                            }
                            if ((Boolean)this.lll.lIl() == false) return null;
                            if (!this.IIlIII(itemStack)) return null;
                        }
                        IlIIIlll ilIIIlll = IlIIIlll.Il;
                        return ilIIIlll;
                    }
                    if ((Boolean)this.lll.lIl() == false) return null;
                    if (!this.IIlIII(itemStack)) {
                        return null;
                    }
                }
                IlIIIlll ilIIIlll = IlIIIlll.lI;
                return ilIIIlll;
            }
            if (this.llI(itemStack)) {
                return IlIIIlll.III;
            }
        }
        if (((Boolean)this.IIIl.lIl()).booleanValue() && this.IIIIII(itemStack)) {
            return IlIIIlll.l;
        }
        if ((Boolean)this.lll.lIl() == false) return null;
        if (!this.IIlIII(itemStack)) return null;
        return IlIIIlll.IIl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlIl(MinecraftClient minecraftClient, BlockPos blockPos) {
        boolean bl;
        if (!this.lIIl(minecraftClient, blockPos)) {
            this.lIlI = null;
            return;
        }
        Vec3d vec3d = Vec3d.ofCenter((Vec3i)blockPos);
        float[] fArray = IlIlllI.IlIll(minecraftClient, vec3d);
        if (fArray == null) {
            return;
        }
        if (this.lllI.lIl() == IIlIIlllI.II) {
            this.lII = true;
            this.lIIl = minecraftClient.player.age + 2;
            bl = IlIlllI.IlI(minecraftClient, 175, fArray[0], fArray[1], () -> this.lllIl(minecraftClient, blockPos, vec3d));
        } else if (this.lllI.lIl() == IIlIIlllI.l) {
            this.IIIll = blockPos;
            this.IlIII = true;
            this.I = true;
            this.IIlll = System.currentTimeMillis();
            bl = true;
        } else {
            this.lII = true;
            this.lIIl = minecraftClient.player.age + 2;
            bl = IlIlllI.IlI(minecraftClient, 175, fArray[0], fArray[1], () -> this.lllIl(minecraftClient, blockPos, vec3d));
        }
        if (bl) return;
        this.lII = false;
        this.lIIl = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lIllI(ItemStack itemStack) {
        ItemEnchantmentsComponent itemEnchantmentsComponent = (ItemEnchantmentsComponent)itemStack.getOrDefault(DataComponentTypes.ENCHANTMENTS, (Object)ItemEnchantmentsComponent.DEFAULT);
        double d = 0.0;
        Iterator iterator = itemEnchantmentsComponent.getEnchantments().iterator();
        while (iterator.hasNext()) {
            RegistryEntry registryEntry = (RegistryEntry)iterator.next();
            String string = registryEntry.getKey().map(registryKey -> registryKey.getValue().getPath()).orElse("");
            int n = itemEnchantmentsComponent.getLevel(registryEntry);
            d += (double)n * this.IIIlII(string);
        }
        return d;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIII(MinecraftClient minecraftClient, Vec3d vec3d, BlockPos blockPos) {
        BlockHitResult blockHitResult = minecraftClient.world.raycast(new RaycastContext(minecraftClient.player.getEyePos(), vec3d, RaycastContext.ShapeType.OUTLINE, RaycastContext.FluidHandling.NONE, (Entity)minecraftClient.player));
        if (blockHitResult == null) return false;
        if (blockHitResult.getType() == HitResult.Type.MISS) return false;
        if (!blockHitResult.getBlockPos().equals((Object)blockPos)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIIl(MinecraftClient minecraftClient, HandledScreen<?> handledScreen) {
        ScreenHandler screenHandler = handledScreen.getScreenHandler();
        if (!(screenHandler instanceof GenericContainerScreenHandler)) return;
        GenericContainerScreenHandler genericContainerScreenHandler = (GenericContainerScreenHandler)screenHandler;
        if (genericContainerScreenHandler.getRows() != 3) return;
        if (screenHandler.getCursorStack() == null) return;
        if (screenHandler.getCursorStack().isEmpty()) {
            if (screenHandler.syncId != this.IIlI) {
                this.IIlI = screenHandler.syncId;
                this.IlIl = Integer.MIN_VALUE;
                this.IIlII.clear();
            }
        } else {
            return;
        }
        this.IIlII(minecraftClient, screenHandler);
        ArrayList<IIlll> arrayList = new ArrayList<IIlll>();
        int n = this.IIIll(screenHandler, arrayList);
        if (n == 0) {
            this.IIllII(minecraftClient);
            return;
        }
        this.IlIl = Integer.MIN_VALUE;
        long l2 = System.currentTimeMillis();
        if (l2 - this.III < this.lI(this.IIIlI)) {
            return;
        }
        if (arrayList.isEmpty()) return;
        if (!orchard.internal.IIlI.l(minecraftClient)) {
            return;
        }
        this.III = l2;
        arrayList.sort(this.llIlI());
        int n2 = Math.min(8, arrayList.size());
        int n3 = 0;
        while (true) {
            if (n3 >= n2) {
                orchard.internal.IIlI.Illl(minecraftClient);
                return;
            }
            int n4 = ((IIlll)arrayList.get(n3)).l();
            this.IlIII(screenHandler, n4, minecraftClient.player.age);
            minecraftClient.interactionManager.clickSlot(screenHandler.syncId, n4, 0, SlotActionType.QUICK_MOVE, (PlayerEntity)minecraftClient.player);
            ++n3;
        }
    }

    private Comparator<IIlll> llIlI() {
        return Comparator.comparingInt(iIlll -> iIlll.Il().II).thenComparing((iIlll, iIlll2) -> {
            if (!iIlll.Il().I) return 0;
            int n = Double.compare(iIlll2.I(), iIlll.I());
            return n;
        }).thenComparingInt(IIlll::II);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIll(MinecraftClient minecraftClient) {
        int n;
        block2: {
            block3: {
                block1: {
                    if (minecraftClient == null) return;
                    if (minecraftClient.player == null) break block1;
                    n = minecraftClient.player.age;
                    if (!this.IlII) break block2;
                    break block3;
                }
                return;
            }
            if (this.IIllI != Integer.MIN_VALUE && n >= this.IIllI) {
                this.IlII = false;
                this.IIllI = Integer.MIN_VALUE;
            }
        }
        if (!this.lII) return;
        if (this.lIIl == Integer.MIN_VALUE) return;
        if (n < this.lIIl) return;
        this.lII = false;
        this.lIIl = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllII(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (!this.llllI(minecraftClient)) return false;
        if (blockPos == null) {
            return false;
        }
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        BlockPos blockPos2 = blockPos.down();
        BlockState blockState2 = minecraftClient.world.getBlockState(blockPos2);
        if (!blockState.isAir()) {
            if (!blockState.isReplaceable()) return false;
        }
        if (this.l(minecraftClient.player, blockPos)) return false;
        if (blockState2 == null) return false;
        if (blockState2.isAir()) return false;
        if (!blockState2.getFluidState().isEmpty()) return false;
        if (!blockState2.getCollisionShape((BlockView)minecraftClient.world, blockPos2).isEmpty()) return true;
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean lllIl(MinecraftClient minecraftClient, BlockPos blockPos, Vec3d vec3d) {
        try {
            boolean bl;
            if (!this.lIIl(minecraftClient, blockPos)) {
                this.lIlI = null;
                boolean bl2 = false;
                return bl2;
            }
            lIIllllI.IIIlIlI(minecraftClient);
            BlockHitResult blockHitResult = new BlockHitResult(vec3d, Direction.UP, blockPos, false);
            ActionResult actionResult = lIIllllI.IllllIl(minecraftClient, Hand.MAIN_HAND, blockHitResult);
            boolean bl3 = bl = actionResult != null && actionResult.isAccepted();
            if (bl) {
                this.l = minecraftClient.player.age + 4;
                this.llI = false;
            }
            boolean bl4 = bl;
            return bl4;
        }
        finally {
            this.lII = false;
            this.lIIl = Integer.MIN_VALUE;
            this.lllI();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private lIIIlIIl lllll(MinecraftClient var1_1) {
        block23: {
            block17: {
                block14: {
                    block18: {
                        break block18;
lbl1:
                        // 1 sources

                        block0: while (true) {
                            block20: {
                                block22: {
                                    block15: {
                                        block19: {
                                            block16: {
                                                if (var6_8 > 2) break block19;
                                                break block20;
lbl4:
                                                // 1 sources

                                                return new lIIIlIIl(var5_7.toImmutable(), var6_9.toImmutable(), var7_11);
lbl6:
                                                // 1 sources

                                                while (this.llIII(var1_1, var7_11, var6_9)) {
                                                    ** continue;
lbl8:
                                                    // 1 sources

                                                    ** GOTO lbl4
                                                }
                                                break block14;
lbl10:
                                                // 1 sources

                                                while (true) {
                                                    block21: {
                                                        var5_7 = (BlockPos)var4_5.next();
                                                        break block21;
lbl13:
                                                        // 1 sources

                                                        while (this.IIllll(var1_1.player, var7_11)) {
                                                            ** GOTO lbl6
                                                        }
                                                        break block14;
                                                    }
                                                    if (this.lllII(var1_1, var5_7)) break block15;
                                                    break block14;
                                                    break;
                                                }
lbl19:
                                                // 2 sources

                                                while (true) {
                                                    if (var5_6 > 2) break block16;
                                                    break block17;
                                                    break;
                                                }
lbl22:
                                                // 1 sources

                                                while (true) {
                                                    var4_5 = var3_3.iterator();
                                                    break block14;
                                                    break;
                                                }
lbl25:
                                                // 2 sources

                                                while (true) {
                                                    ++var6_8;
                                                    continue block0;
                                                    break;
                                                }
lbl28:
                                                // 2 sources

                                                while (true) {
                                                    var3_3.add(var2_2.add(var5_6, var4_4, var6_8));
                                                    ** GOTO lbl25
                                                    break;
                                                }
lbl32:
                                                // 1 sources

                                                while (true) {
                                                    if (var6_8 != 0) ** GOTO lbl28
                                                    ** continue;
                                                    break;
                                                }
                                                while (true) {
                                                    var3_3.sort(Comparator.comparingDouble((ToDoubleFunction<BlockPos>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)D, lIIll(net.minecraft.client.MinecraftClient net.minecraft.util.math.BlockPos ), (Lnet/minecraft/util/math/BlockPos;)D)((MinecraftClient)var1_1)));
                                                    ** continue;
                                                    break;
                                                }
lbl38:
                                                // 1 sources

                                                while (true) {
                                                    var5_6 = -2;
                                                    ** GOTO lbl19
                                                    break;
                                                }
                                            }
                                            ++var4_4;
                                            break block22;
                                        }
                                        ++var5_6;
                                        ** continue;
                                    }
                                    var6_9 = var5_7.down();
                                    var7_11 = Vec3d.ofCenter((Vec3i)var6_9).add(0.0, 0.4375, 0.0);
                                    ** GOTO lbl13
                                }
lbl52:
                                // 2 sources

                                while (true) {
                                    if (var4_4 > 1) ** continue;
                                    ** continue;
                                    break;
                                }
                            }
                            if (var5_6 == 0) ** break;
                            ** continue;
                            ** continue;
                            break;
                        }
                    }
                    var2_2 = var1_1.player.getBlockPos();
                    break block23;
lbl62:
                    // 1 sources

                    return null;
                }
                ** while (!var4_5.hasNext())
lbl66:
                // 1 sources

                ** while (true)
            }
            var6_8 = -2;
            ** while (true)
        }
        var3_3 = new ArrayList<BlockPos>();
        var4_4 = -1;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIII(ItemStack itemStack) {
        String string = Registries.ITEM.getId((Object)itemStack.getItem()).getPath();
        if (string.endsWith("_sword")) return true;
        if (string.endsWith(StringFactory.IIl("p4RdnxJWSBk="))) return true;
        if (string.endsWith(StringFactory.IIl("p5VMmQ=="))) return true;
        if (string.endsWith(StringFactory.IIl("p4dckw9SXA=="))) return true;
        if (string.endsWith(StringFactory.IIl("p5xbmQ=="))) return true;
        if (string.endsWith(StringFactory.IIl("p4dEmRhF"))) return true;
        if (string.equals(StringFactory.IIl("i5xRnQtE"))) return true;
        if (string.equals(StringFactory.IIl("np1HlBBZVyOFB5s="))) return true;
        if (string.equals(StringFactory.IIl("nphdkg1oURKTN4xNCtbS"))) return true;
        if (string.equals(StringFactory.IIl("moZBjxE="))) return true;
        if (string.equals(StringFactory.IIl("lZVXmQ=="))) return true;
        if (string.equals(StringFactory.IIl("jIZdmBxZRA=="))) return true;
        if (string.equals(StringFactory.IIl("mptD"))) return true;
        if (string.equals(StringFactory.IIl("m4ZbjwpVXws="))) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIIlII(String string) {
        if (string.equals("mending")) {
            return 36.0;
        }
        if (string.equals("unbreaking")) {
            return 22.0;
        }
        if (string.equals("protection")) {
            return 26.0;
        }
        if (string.equals("sharpness")) return 24.0;
        if (string.equals(StringFactory.IIl("nZJSlRpeVRKUEQ=="))) return 24.0;
        if (string.equals(StringFactory.IIl("iJtDmQs="))) {
            return 24.0;
        }
        if (string.equals("fortune")) return 20.0;
        if (string.equals(StringFactory.IIl("lJtbiBBZVw=="))) return 20.0;
        if (string.equals(StringFactory.IIl("i51YlyZDXwmUAA=="))) return 20.0;
        if (string.equals(StringFactory.IIl("kZpSlRdeRAU="))) {
            return 20.0;
        }
        if (string.equals("fire_aspect")) return 14.0;
        if (string.equals(StringFactory.IIl("nphVkRw="))) return 14.0;
        if (string.equals(StringFactory.IIl("iIFanxE="))) return 14.0;
        if (string.equals(StringFactory.IIl("k5pbnxJVUR+c"))) return 14.0;
        if (string.equals(StringFactory.IIl("i4NRmQleXhuoDZteCg=="))) return 14.0;
        if (string.equals(StringFactory.IIl("nJFajxBDSQ=="))) return 14.0;
        if (string.equals(StringFactory.IIl("moZRnRpf"))) return 14.0;
        if (!string.equals(StringFactory.IIl("j51amCZVRQ6EHA=="))) return 8.0;
        return 14.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlIl(MinecraftClient minecraftClient, int n) {
        if (this.llllI(minecraftClient) && n >= 0 && n < 9) {
            lIIllllI.IlIlllI(minecraftClient, this, n);
        }
        this.lIl = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIIlll(ItemStack itemStack) {
        String string = Registries.ITEM.getId((Object)itemStack.getItem()).getPath();
        if (string.startsWith("netherite_")) {
            return 700.0;
        }
        if (string.startsWith("diamond_")) {
            return 600.0;
        }
        if (string.startsWith("iron_")) {
            return 500.0;
        }
        if (string.startsWith("chainmail_")) {
            return 440.0;
        }
        if (string.startsWith("copper_")) {
            return 420.0;
        }
        if (string.startsWith("stone_")) {
            return 350.0;
        }
        if (string.startsWith("golden_")) {
            return 310.0;
        }
        if (string.startsWith("wooden_")) {
            return 220.0;
        }
        if (!string.startsWith("leather_")) return 300.0;
        return 180.0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIlIII(ItemStack itemStack) {
        if (itemStack.getComponentChanges().get(DataComponentTypes.CUSTOM_MODEL_DATA) != null) return true;
        if (itemStack.getComponentChanges().get(DataComponentTypes.ITEM_MODEL) == null) return false;
        return true;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private boolean IIlIIl(ClientPlayerEntity clientPlayerEntity) {
        block4: {
            int n;
            block3: {
                if (clientPlayerEntity == null) {
                    return false;
                }
                n = 0;
                if (!true) break block3;
                if (n >= 36) return false;
                if (clientPlayerEntity.getInventory().getStack(n).isEmpty()) break block4;
            }
            do {
                ++n;
                if (n >= 36) return false;
            } while (!clientPlayerEntity.getInventory().getStack(n).isEmpty());
        }
        return true;
    }

    @Override
    public void ll() {
        this.IIl();
        this.llIl.lIlIII();
    }

    /*
     * Unable to fully structure code
     */
    private BlockPos IIlIll(MinecraftClient var1_1) {
        block17: {
            block15: {
                block13: {
                    block14: {
                        block10: {
                            block16: {
                                block12: {
                                    block11: {
                                        block9: {
                                            var2_2 = var1_1.player.getBlockPos();
                                            break block16;
                                            while (true) {
                                                break block9;
                                                break;
                                            }
lbl5:
                                            // 1 sources

                                            while (true) {
                                                var8_7 = -4;
                                                break block10;
                                                break;
                                            }
lbl8:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl10:
                                            // 2 sources

                                            while (true) {
                                                if (var6_5 > 2) break block11;
                                                break block12;
                                                break;
                                            }
                                        }
                                        var10_9 = var1_1.player.getEyePos().squaredDistanceTo(Vec3d.ofCenter((Vec3i)var9_8));
                                        if (!(var10_9 < var4_4)) break block13;
                                        break block17;
lbl17:
                                        // 1 sources

                                        while (true) {
                                            ++var6_5;
                                            ** GOTO lbl10
                                            break;
                                        }
                                    }
                                    return var3_3;
                                }
                                var7_6 = -4;
                                break block14;
lbl25:
                                // 1 sources

                                while (true) {
                                    if (this.lIIl(var1_1, var9_8)) ** continue;
                                    break block13;
                                    while (true) {
                                        ++var7_6;
                                        break block14;
                                        break;
                                    }
                                    break;
                                }
                            }
                            var3_3 = null;
                            ** while (true)
                        }
lbl35:
                        // 2 sources

                        while (true) {
                            if (var8_7 > 4) ** continue;
                            break block15;
                            break;
                        }
                    }
                    ** while (var7_6 > 4)
lbl40:
                    // 1 sources

                    ** while (true)
                }
lbl42:
                // 2 sources

                while (true) {
                    ++var8_7;
                    ** continue;
                    break;
                }
            }
            var9_8 = var2_2.add(var7_6, var6_5, var8_7);
            ** while (true)
        }
        var4_4 = var10_9;
        var3_3 = var9_8.toImmutable();
        ** while (true)
        var4_4 = 1.7976931348623157E308;
        var6_5 = -2;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIllII(MinecraftClient minecraftClient) {
        if (!this.IIlII.isEmpty()) {
            this.IlIl = Integer.MIN_VALUE;
            return;
        }
        if (this.IlIl == Integer.MIN_VALUE) {
            this.IlIl = minecraftClient.player.age;
            return;
        }
        if (minecraftClient.player.age - this.IlIl < 2) return;
        minecraftClient.player.closeHandledScreen();
        minecraftClient.setScreen(null);
        this.IlIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlllI(MinecraftClient minecraftClient, BlockPos blockPos) {
        BlockHitResult blockHitResult;
        if (blockPos == null) return false;
        blockHitResult(Vec3d.ofCenter((Vec3i)blockPos), Direction.UP, blockPos, false);
        if (IlIlllI.III(minecraftClient, blockHitResult, false)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIllll(ClientPlayerEntity clientPlayerEntity, Vec3d vec3d) {
        if (clientPlayerEntity == null) return false;
        if (vec3d == null) return false;
        if (clientPlayerEntity.getEyePos().squaredDistanceTo(vec3d) <= 20.25) return true;
        return false;
    }

    private static int IlIIII(int n, int n2) {
        return IllIl[n ^ 0xA165215A] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                break block10;
lbl1:
                // 2 sources

                while (true) {
                    continue;
                    break;
                }
lbl3:
                // 2 sources

                while (true) {
                    continue;
lbl5:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                    break;
                }
lbl7:
                // 1 sources

                return;
lbl9:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
                var10_10 = 0;
                var11_11 = 0;
                ** while (true)
lbl14:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    AutoDeposit.IllIl = new int[var1_2];
                    ** continue;
                    break;
                }
lbl19:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
                var3_4 = 0;
                var4_5 = 0;
                ** GOTO lbl1
                var9_9 = new String[var8_8.length];
                var13_13 = -1;
                ** GOTO lbl3
lbl27:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var6 = 23158;
            var7_7 = "\ub6c0\ub639\ub669\ub6f2\ub6d7\ub60c\ub686\ub6f1\ub689\ub690\ub679\ub688\u72e7\u721e\u7252\u72e4\u72f6\u7238\u7283\u72c1\u72ad\u72b4\u7220\u72c5\u72b8\u723a\u72d5\u72d3\u237c\u2385\u23c5\u234e\u236d\u238a\u235d\u237b\u233f\u2305\u238d\u234c\u7a3b\u7ac2\u7ab0\u7a39\u7a2c\u7ac2\u7a1e\u7a1c\ueb2c\ueba4\ueb8b\ueb1c\ueb27\uebfd\ueb52\ueb07\u7e8c\u7e1c\u7e1e\u7ea8\u7e9e\u7e7d\u7eac\u7eb8\u7ec3\u7eda\u7e42\u7eb9\u7edf\u7e47\u7ea7\u7ebd\u643e\u64ae\u64ac\u641a\u642c\u64cd\u647d\u640e\u6472\u6468\u64e8\u641b\u646f\u64f6\u6428\u6464\u6413\u644e\u64c8\u6406\u642d\u64a6\u644e\u6486\u6439\u6489\u64b5\u64e2\u648c\u64c6\u64a8\u64f3\u6420\u6490\u64b9\u643a\u6410\u64dd\u6459\u640e\u6412\u645e\u6489\u641c\u6441\u64c7\u642d\u6468\u6413\u640e\u64d6\u6401\u6404\u64fd\u6412\u64ad\u6407\u64d7\u64d0\u64e7\u64ed\u64f7\u64da\u64c6\u6420\u64ad\u649a\u641a\u642c\u6484\u6443\u640e\u6478\u6446\u64c6\u641d\u646e\u64dc\u6412\u6451\u641d\u6464\u64c8\u6403\u642c\u64e2\u6415\u64ac\u643a\u64f2\u64a9\u6491\ud5e8\ud578\ud57a\ud5cc\ud5fa\ud552\ud595\ud5f6\ud5ae\ud594\ud500\ud5cb\ud5bd\ud50a\ud5c8\ud5b6\ud5c0\ud59b\ud50a\ud5fa\u0e8c\u0e1e\u0e2d\u0eb9\u0e99\u0e57\u0ea1\u0ed7\u4574\u458d\u45e6\u4552\u4564\u45a9\u4505\u4546\u453c\u4526\u45a0\u453d\uf36f\uf3ff\uf3fd\uf34b\uf37d\uf3d5\uf312\uf366\uf329\uf339\uf3dc\uf34a\uf339\uf3ac\uf30a\uf35e\u67d1\u6751\u6740\u67ee\u67c5\u6708\u6782\u6788\u5939\u59b0\u5997\u5978\u1472\u148b\u14ec\u1477\u1466\u14bf\u1417\u1477\u142d\u1426\u149e\u1455\u1426\u14ae\u141b\u143b\ubbe6\ubb6f\ubb48\ubba7\ue33f\ue3ac\ue38f\ue31b\ue32a\ue3e6\ue374\ue302\ue364\ue36f\ue3d7\ue31c\ue36f\ue3e7\ue352\ue372\u6d50\u6dd9\u6dfe\u6d11\u2cd5\u2c51\u2c50\u2cd1\u2cc6\u2c0f\u2caf\u2cec\u2c9a\u2cae\u2c21\u2cfa\u2c83\u2c19\u2cbb\u2c8b\u2cf8\u2c9f\u2c31\u2cb6\ufe14\ufe90\ufeb3\ufe14\ufe01\ufed9\ufe6d\ufe49\ue91b\ue9e6\ue989\ue936\ue90b\ue9d2\ue950\ue91d\ue940\ue94b\ue9cd\ue92f\ue94d\ue9d3\ue909\ue95c\u4e70\u4ee0\u4efe\u4e4f\u4e62\u4e8c\u4e12\u4e2a\ud48e\ud476\ud426\ud4ad\ud498\ud443\ud4d1\ud4be\ud4c5\ud4f9\ud433\ud4c7\u4087\u4021\u4015\u4083\u4093\u404e\u40c0\u40b3\u40c8\u40e4\u403b\u40ca\ub958\ub9bc\ub9e0\ub944\ub950\ub989\ub939\ub942\ub906\ub93c\ub9ac\ub976\ub900\ub9a2\ub968\ub914\ub968\ub979\ub984\ub954\ub950\ub9b6\ub91a\ub9c8\ub947\ub9f6\ub9f9\ub9ef\u5022\u50da\u5097\u5006\u5035\u50db\u5042\u5014\u227b\u2283\u22f8\u227f\u2269\u228d\u2225\u224e\u2233\u2228\u2294\u2233\u294b\u29b2\u29cc\u2966\u295a\u2994\u2962\u2914\u5d6c\u5d94\u5dd9\u5d6f\u5d7b\u5d95\u5d41\u5d5d\u5d2f\u5d3c\u5dd5\u5d24\ua37d\ua384\ua3d4\ua37f\ua36c\ua3a2\ua354\ua322\u2cec\u2c14\u2c59\u2cc9\u2cfd\u2c30\u2c90\u2cc8\u871f\u87ff\u87af\u8734\u8714\u87d9\u8766\u8721\ud835\ud897\ud8cb\ud803\ud83b\ud8e7\ud87d\ud813\ud866\ud843\ud8e0\ud818\ud87e\ud889\ud805\ud81f\u6411\u64b3\u64b6\u640b\u6418\u64e6\u642a\u6402\u6441\u644c\u64c0\u642e\u6456\u64ac\u642a\u6448\u6422\u647e\u64ce\u6400\u84e8\u8456\u847e\u84d7\u84e3\u8403\u84a4\u84aa\u7d30\u7dba\u7dab\u7d14\u7d3d\u7df3\u7d05\u7d73\u5c5f\u5cc0\u5cce\u5c41\u5c54\u5c89\u5c29\u5c7d\u5c0c\u5c15\u5cfc\u5c0d\uc219\uc2b8\uc2a1\uc220\u3ffa\u3f1f\u3f6c\u3fe5\u3ff1\u3f1e\u3f83\u3fd3\u3fa4\u3f81\u3f10\u3faf\u56f0\u567a\u567b\u56ed\u56fd\u5620\u56ba\u56d4\u56a1\u568a\u5655\u56a4\uad23\uadaf\uad98\uad0e\uad2f\uaddf\uad55\uad0c\uad75\uad50\uadea\uad16\uad6a\uadd9\uad59\uad0d\uc499\uc405\uc40b\uc482\uc495\uc44c\uc4ec\uc4b7\uc4c9\uc4d3\uc453\uc4ac\uc4d5\uc470\uc4e0\uc4b4\ue50d\ue5ed\ue5bd\ue522\ue502\ue5fd\ue56c\ue52c\ue559\ue554\ue5bb\ue524\uc181\uc109\uc104\uc1ac\uc18f\uc143\uc1fb\uc198\uc1d2\uc1dc\uc150\uc1bf\uc1cd\uc159\uc1ff\uc1ab\u37c6\u3759\u377a\u37fb\u37ce\u3700\u37b8\u3780\u246a\u24c8\u24d1\u2453\u2461\u24bb\u2418\u244c\u2439\u2434\u24cd\u243c\ub314\ub38e\ub3ad\ub30a\ub31d\ub3c4\ub35e\ub330\ub345\ub36e\ub3b1\ub340\ue178\ue198\ue181\ue158\ue171\ue196\ue12f\ue147\ue122\ue107\ue188\ue141\ue137\ue1b7\ue101\ue155\u25d8\u2555\u2562\u25f0\u25d3\u251f\u25b3\u25c4\u258a\u2593\u2512\u258b\u2be2\u2b40\u2b1c\u2bdb\u2bed\u2b21\u2bb2\u2bc9\u2bb6\u2b9a\u2b01\u2bda\u2ba8\u2b5f\u2bd2\u2bc8\ud609\ud6ab\ud6ae\ud621\ud600\ud6cb\ud674\ud648\u6ba0\u6b3c\u6b2e\u6bb8\u6bab\u6b4f\u6be8\u6be6\u45f9\u451b\u4543\u45e0\u45f0\u4514\u45bc\u45d6\u45ac\u45a1\u454d\u45f4\u4d6d\u4d8c\u4deb\u4d46\u4d65\u4dab\u4d0c\u4d73\u4d37\u4d0d\u4d85\u4d6e\u4d27\u4db9\u4d5d\u4d18\u4d59\u4d16\u4dea\u4d15\u9e45\u9edd\u9ecc\u9e5a\u9e4d\u9ead\u9e0d\u9e7d\u9e13\u9e1b\u9ee2\u9e13\ub3fb\ub345\ub36d\ub3d4\ub3f4\ub33a\ub382\ub3e2\ucab7\uca54\uca4d\ucaac\ucabc\uca60\ucae3\uca99\ucae4\ucaed\uca1f\uca9d\ucaf2\uca7b\ucacd\uca99\u610f\u61af\u6184\u6132\u6103\u61df\u617f\u6137\u615f\u6153\u61fe\u6135\u614a\u61f3\u6173\u6127\u3525\u35bd\u35db\u350d\u352c\u35e7\u3575\u3503\u3576\u3569\u35f2\u3573\udf84\udf0a\udf14\udf9d\udf88\udf78\udfd2\udfc0\u67af\u674b\u671b\u6784\u67a2\u676e\u67c2\u67b1\u67fc\u67f1\u6761\u67a5\u67eb\u6752\u67d2\u6786\uf22c\uf2c8\uf294\uf214\uf227\uf2fd\uf25d\uf215\uf248\uf257\uf288\uf279\uea06\ueae7\uea8c\uea1d\uea08\ueaf9\uea73\uea12\u97b3\u9754\u9708\u9794\u97bc\u9761\u97c1\u9795\u97d4\u97cb\u9714\u97e5\u9a64\u9a87\u9adb\u9a7c\u9a6f\u9ab2\u9a12\u9a46\u9a07\u9a18\u9ac7\u9a36\uedcb\ued51\ued40\uede1\uedc2\ued1b\ued85\uede6\ued9d\uedaf\ued1e\ued9f";
            var8_8 = "\u5a7a\u5a66\u5a7a\u5a7e\u5a7e\u5a66\u5a2a\u5a62\u5a7e\u5a7a\u5a66\u5a7e\u5a72\u5a66\u5a72\u5a66\u5a72\u5a62\u5a7e\u5a66\u5a7e\u5a7a\u5a7a\u5a6a\u5a7e\u5a7a\u5a7e\u5a7a\u5a7e\u5a7e\u5a7e\u5a66\u5a62\u5a7e\u5a7e\u5a7a\u5a72\u5a7a\u5a7a\u5a66\u5a66\u5a7a\u5a66\u5a7e\u5a7a\u5a7a\u5a66\u5a7a\u5a66\u5a7e\u5a7e\u5a7a\u5a62\u5a7a\u5a7e\u5a66\u5a66\u5a7a\u5a7e\u5a66\u5a7a\u5a7e\u5a7a\u5a7a\u5a7a".toCharArray();
            ** while (true)
lbl34:
            // 2 sources

            while (true) {
                continue;
                break;
            }
            AutoDeposit.IlllI = var9_9;
            AutoDeposit.Illll = new Object[var9_9.length];
            ** while (true)
            var2_3 = 1628830550;
            var0_1 = "o\u00b8fE\u00b0\u0015k4\u00ed\u00ebL\u00a2b\u0000Dt\u00fd\t\u009e\u00be\u0081\u00a8\u00c3\u00b6\u00bf\u00b90-x\u00e7\u00fb\"\u00ef\u0006UD\u00c2\u00fc\u008e}d\u0004\u000b\u00c8\u00c3[}\u0005\u00a9\u00e6\u00b1\u00ecpw\u00f3\u00d4\u001ae\u00190\u00bd\u0015~\u00fcH\u00e7\u001c\u0082].\u0010\u00d6S\u00c8\b\u0086\u0092\u000bD@RP0\r\u00dc\u00e1\u00fc\u0013\tj\u0011\u00b0\u00e9)\u0012\u00c0\u00bd`\u0081\u00c5\u00f8\u00d2\u00af\u00d9\u00c6\u00c5\u0006A\b\u0007\u00e0\u008cKh\u00c3w3!\u00d6\u00c9\u0080\u0001b\u00bav-T\u00b9\u00d3\u00114\u00ad\u00c6\u00cf\u00ec\u001bo+'\u000f\u009f`)V\u000b6p3\u00b9\u001dp\u009aP\u00f6\u008dZ[\u00falH~k\u00d7j\n\f\u00be`f \u00f8B\u0086/\u00f5<\u0088R\u00cb\u00c7\u008c=Gv\u0093\u000e\u00f5\r\u00e41\u00c7\u00b6\u00f7\u0081\u00d2\u00e3\u00c2\u00b9y\u00c6\u0080\u00c9k\u000e^\u00d2\u00ce\u00capb\tu".getBytes("ISO-8859-1");
            var1_2 = var0_1.length / 4;
            ** while (true)
            var12_12 = var8_8[var10_10] ^ var6;
            var9_9[var10_10] = var7_7.substring(var11_11, var11_11 + var12_12);
            var11_11 += var12_12;
            break block11;
            var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
            AutoDeposit.IllIl[var4_5] = var5_6 ^= var2_3;
            var3_4 += 4;
            if (++var4_5 >= var1_2) ** break;
            ** while (true)
            ** while (true)
            var12_12 = 0;
            if (var13_13 != 0) ** GOTO lbl34
            ** while (true)
        }
        if (++var10_10 >= var8_8.length) ** break;
        ** while (true)
        var13_13 = 0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlIIIl(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xC7C54876;
        char[] cArray = IlllI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Illll[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            AutoDeposit.Illll[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xB7C87021;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 29 -> 50;
                case 8 -> 150;
                case 21 -> 36;
                case 27 -> 26;
                case 17 -> 136;
                case 9 -> 156;
                case 30 -> 95;
                case 7 -> 239;
                case 2 -> 92;
                case 19 -> 209;
                case 10 -> 9;
                case 3 -> 237;
                case 6 -> 153;
                case 31 -> 21;
                case 14 -> 208;
                case 15 -> 132;
                case 4 -> 241;
                case 5 -> 3;
                case 25 -> 10;
                case 23 -> 82;
                case 16 -> 227;
                case 26 -> 86;
                case 1 -> 65;
                case 12 -> 154;
                case 24 -> 221;
                default -> 253;
                case 20 -> 246;
                case 18 -> 46;
                case 28 -> 104;
                case 22 -> 145;
                case 13 -> 26;
                case 11 -> 248;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

