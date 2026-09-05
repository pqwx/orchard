/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIIIl
 * Module         : InventoryCleaner  [PLAYER]
 * Description    : Drops junk and weak duplicate armor/tools while inventory is open or NoMove is stationary.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Only Inventory Open
 *   - Clean Custom Models
 *   - Clean Armor
 *   - Clean Tools
 *   - Drop Junk
 *   - enchanted_golden_apple
 *   - tool:flint_and_steel
 *   - lily_of_the_valley
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
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.AttributeModifiersComponent
 *  net.minecraft.component.type.AttributeModifiersComponent$Entry
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 */
package orchard.module.player;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IIlIllIll;
import orchard.internal.IlIIIIlII;
import orchard.internal.llIll;
import orchard.internal.llllIlll;
import orchard.module.player.ChestStealer;

@Environment(value=EnvType.CLIENT)
public final class InventoryCleaner
extends ModuleBase {
    private static final int I = 6;
    private static final int[] l;
    private static final int II = 9;
    private final llIll Il;
    private final IIIIIIIIl<IlIIIIlII> lI = this.IIlllIl(new IIIIIIIIl<IlIIIIlII>(StringFactory.IIII("Mode"), IlIIIIlII.class, IlIIIIlII.I));
    private final llIll ll;
    private final llIll III;
    private static final int IIl = 7;
    private static String[] IlI;
    private long Ill;
    private static final Set<String> lII;
    private final IIIlIlIIl lIl = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Delay"), 70.0, 120.0, 0.0, 1000.0, 5.0).lII("ms"));
    private static final int llI = 36;
    private long lll;
    private static final int IIII = 45;
    private static final int IIIl = 5;
    private static final int IIlI = 8;
    private final llIll IIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Only Inventory Open"), false));
    private final llIll IlII;
    private static final int[] IlIl;
    private static final String[] IllI;
    private static final Object[] Illl;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        int n;
        MinecraftClient minecraftClient;
        block11: {
            minecraftClient = MinecraftClient.getInstance();
            if (!this.IIlII(minecraftClient)) {
                return;
            }
            boolean bl = minecraftClient.currentScreen instanceof InventoryScreen;
            if (((Boolean)this.IIll.lIl()).booleanValue() && !bl) {
                return;
            }
            if (!((Boolean)this.IIll.lIl()).booleanValue() && minecraftClient.currentScreen != null && !bl) {
                return;
            }
            if (!bl && !this.IllII(minecraftClient)) {
                return;
            }
            if (this.IlIII(minecraftClient)) {
                return;
            }
            if (!minecraftClient.player.playerScreenHandler.getCursorStack().isEmpty()) {
                return;
            }
            long l2 = System.currentTimeMillis();
            if (l2 - this.lll < this.Ill) {
                return;
            }
            IIlIllIll iIlIllIll = this.IIl(minecraftClient.player);
            if (iIlIllIll == null) {
                return;
            }
            int[] nArray = l;
            int n2 = nArray.length;
            int n3 = 0;
            while (n3 < n2) {
                n = nArray[n3];
                if (iIlIllIll.l(n)) {
                    if (!this.lIII(minecraftClient, bl)) {
                        return;
                    }
                    break block11;
                }
                ++n3;
            }
            return;
        }
        if (!this.IIlll(minecraftClient, minecraftClient.player, n)) return;
        this.lll = System.currentTimeMillis();
        this.Ill = this.IIIll();
        orchard.internal.IIlI.Illl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lI(ClientPlayerEntity clientPlayerEntity, ItemStack itemStack) {
        if (clientPlayerEntity == null) return false;
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (this.IlllI(itemStack)) {
            return false;
        }
        if (((Boolean)this.III.lIl()).booleanValue() && this.IlIIl(itemStack)) {
            return true;
        }
        String string = this.IIIlI(itemStack);
        llllIlll llllIlll2 = new llllIlll(-1, this.lIll(itemStack), Integer.MIN_VALUE);
        if (string == null) {
            if (itemStack.isStackable()) return false;
            if (this.lIlI(itemStack)) {
                return false;
            }
            llllIlll llllIlll3 = this.lll(clientPlayerEntity, this.IIlIl(itemStack));
            if (llllIlll3 == null) return false;
            if (llllIlll3.II(llllIlll2)) return true;
            return false;
        }
        llllIlll llllIlll4 = this.lllI(clientPlayerEntity, string);
        if (llllIlll4 == null) return false;
        if (!llllIlll4.II(llllIlll2)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private IIlIllIll IIl(ClientPlayerEntity var1_1) {
        block38: {
            block41: {
                block43: {
                    block40: {
                        block44: {
                            block45: {
                                block33: {
                                    block29: {
                                        block36: {
                                            block42: {
                                                block28: {
                                                    block39: {
                                                        block21: {
                                                            block30: {
                                                                block35: {
                                                                    block32: {
                                                                        block34: {
                                                                            block37: {
                                                                                block27: {
                                                                                    block26: {
                                                                                        block31: {
                                                                                            block23: {
                                                                                                block25: {
                                                                                                    block22: {
                                                                                                        block24: {
                                                                                                            var2_2 = new HashMap<String, llllIlll>();
                                                                                                            var3_3 = InventoryCleaner.l;
                                                                                                            var4_4 = ((int[])var3_3).length;
                                                                                                            var5_6 = 0;
                                                                                                            break block38;
                                                                                                            while (true) {
                                                                                                                var4_5 = new IIlIllIll();
                                                                                                                var5_7 = InventoryCleaner.l;
                                                                                                                var6_8 = var5_7.length;
                                                                                                                var7_9 = 0;
                                                                                                                break block21;
                                                                                                                break;
                                                                                                            }
lbl12:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                if (var11_16.II == var8_13) break block22;
                                                                                                                break block23;
                                                                                                                break;
                                                                                                            }
lbl15:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                if (var11_16.II == var8_13) break block22;
                                                                                                                break block24;
                                                                                                                break;
                                                                                                            }
lbl18:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                var8_13 = var5_7[var7_9];
                                                                                                                var9_14 = this.IlI(var1_1, var8_13);
                                                                                                                if (!var9_14.isEmpty()) break block25;
                                                                                                                break block22;
                                                                                                                break;
                                                                                                            }
lbl23:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                if (!this.IlIIl((ItemStack)var9_14)) break block26;
                                                                                                                break block27;
                                                                                                                break;
                                                                                                            }
lbl26:
                                                                                                            // 2 sources

                                                                                                            while (true) {
                                                                                                                if (var6_8 >= var5_6) ** continue;
                                                                                                                break block28;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        var4_5.II(var8_13);
                                                                                                        break block22;
lbl32:
                                                                                                        // 2 sources

                                                                                                        while (true) {
                                                                                                            var3_3.put(var9_14, var10_15);
                                                                                                            break block29;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
lbl37:
                                                                                                    // 9 sources

                                                                                                    while (true) {
                                                                                                        ++var7_9;
                                                                                                        break block21;
                                                                                                        break;
                                                                                                    }
lbl40:
                                                                                                    // 1 sources

                                                                                                    while ((var8_12 = this.IIIlI(var7_11)) == null) {
                                                                                                        break block30;
                                                                                                    }
                                                                                                    break block39;
lbl43:
                                                                                                    // 1 sources

                                                                                                    while (this.IlllI((ItemStack)var9_14)) {
                                                                                                        ** GOTO lbl37
                                                                                                    }
                                                                                                    break block40;
lbl46:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        var11_16 = (llllIlll)var3_3.get(this.IIlIl((ItemStack)var9_14));
                                                                                                        if (var11_16 == null) ** GOTO lbl37
                                                                                                        ** continue;
                                                                                                        break;
                                                                                                    }
lbl50:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        var6_8 = var3_3[var5_6];
                                                                                                        var7_11 = this.IlI(var1_1, var6_8);
                                                                                                        if (!var7_11.isEmpty()) break block31;
                                                                                                        break block30;
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                if (!InventoryCleaner.Illl(var8_13)) ** GOTO lbl43
                                                                                                ** GOTO lbl37
lbl58:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    if (this.lIlI((ItemStack)var8_12)) break block29;
                                                                                                    break block32;
                                                                                                    break;
                                                                                                }
lbl61:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    if (var8_12.isStackable()) break block29;
                                                                                                    break block33;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            var4_5.II(var8_13);
                                                                                            ** GOTO lbl37
lbl67:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                if (!var9_14.II((llllIlll)var10_15)) break block30;
                                                                                                break block34;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        if (!this.IlllI(var7_11)) ** GOTO lbl40
                                                                                        break block30;
lbl73:
                                                                                        // 1 sources

                                                                                        while (var4_5.I()) {
                                                                                            break block35;
lbl75:
                                                                                            // 2 sources

                                                                                            return v0;
                                                                                        }
                                                                                        break block41;
                                                                                    }
lbl79:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        var10_15 = this.IIIlI((ItemStack)var9_14);
                                                                                        if (var10_15 == null) break block36;
                                                                                        break block37;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                var4_5.II(var8_13);
                                                                                ** GOTO lbl37
                                                                            }
                                                                            var11_16 = (llllIlll)var2_2.get(var10_15);
                                                                            if (var11_16 == null) ** GOTO lbl37
                                                                            ** while (true)
                                                                        }
lbl91:
                                                                        // 2 sources

                                                                        while (true) {
                                                                            var2_2.put(var8_12, (llllIlll)var9_14);
                                                                            break block30;
                                                                            break;
                                                                        }
lbl95:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var3_3 = new HashMap<K, V>();
                                                                            var4_5 = InventoryCleaner.l;
                                                                            var5_6 = ((int[])var4_5).length;
                                                                            var6_8 = 0;
                                                                            ** GOTO lbl26
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (!this.IlIIl((ItemStack)var8_12)) break block42;
                                                                    break block29;
                                                                }
                                                                v0 = var4_5;
                                                                ** GOTO lbl75
                                                            }
                                                            ++var5_6;
                                                            break block38;
                                                        }
                                                        if (var7_9 >= var6_8) ** GOTO lbl73
                                                        ** while (true)
                                                    }
                                                    var9_14 = new llllIlll(var6_8, this.lIll(var7_11), this.IlII(var6_8));
                                                    ** while ((var10_15 = (llllIlll)var2_2.get((Object)var8_12)) == null)
lbl116:
                                                    // 1 sources

                                                    ** while (true)
                                                }
                                                var7_10 = var4_5[var6_8];
                                                var8_12 = this.IlI(var1_1, var7_10);
                                                if (var8_12.isEmpty()) break block29;
                                                break block43;
                                            }
                                            var9_14 = this.IIlIl((ItemStack)var8_12);
                                            var10_15 = new llllIlll(var7_10, this.lIll((ItemStack)var8_12), this.IlII(var7_10));
                                            var11_16 = (llllIlll)var3_3.get(var9_14);
                                            if (var11_16 == null) ** GOTO lbl32
                                            break block44;
                                        }
                                        if (var9_14.isStackable()) ** GOTO lbl37
                                        break block45;
                                    }
lbl132:
                                    // 4 sources

                                    while (true) {
                                        ++var6_8;
                                        ** continue;
                                        break;
                                    }
                                }
                                if (this.IIIlI((ItemStack)var8_12) != null) ** GOTO lbl132
                                ** while (true)
                            }
                            if (!this.lIlI((ItemStack)var9_14)) ** break;
                            ** while (true)
                            ** while (true)
                        }
                        if (!var10_15.II(var11_16)) ** GOTO lbl132
                        ** while (true)
                    }
                    ** while (!((Boolean)this.III.lIl()).booleanValue())
lbl147:
                    // 1 sources

                    ** while (true)
                }
                if (!this.IlllI((ItemStack)var8_12)) ** break;
                ** while (true)
                ** while (true)
            }
            v0 = null;
            ** while (true)
        }
        ** while (var5_6 >= var4_4)
lbl157:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private ItemStack IlI(ClientPlayerEntity clientPlayerEntity, int n) {
        if (clientPlayerEntity == null) return ItemStack.EMPTY;
        if (n < 0) return ItemStack.EMPTY;
        if (n < clientPlayerEntity.playerScreenHandler.slots.size()) return ((Slot)clientPlayerEntity.playerScreenHandler.slots.get(n)).getStack();
        return ItemStack.EMPTY;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lII(ItemStack itemStack) {
        ItemEnchantmentsComponent itemEnchantmentsComponent = (ItemEnchantmentsComponent)itemStack.getOrDefault(DataComponentTypes.ENCHANTMENTS, (Object)ItemEnchantmentsComponent.DEFAULT);
        double d = 0.0;
        Iterator iterator = itemEnchantmentsComponent.getEnchantments().iterator();
        while (iterator.hasNext()) {
            RegistryEntry registryEntry = (RegistryEntry)iterator.next();
            String string = registryEntry.getKey().map(registryKey -> registryKey.getValue().getPath()).orElse("");
            int n = itemEnchantmentsComponent.getLevel(registryEntry);
            d += (double)n * this.lIl(string);
        }
        return d;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private double lIl(String var1_1) {
        var2_2 = var1_1;
        var3_3 = -1;
        switch (var2_2.hashCode()) {
            case -1571105471: {
                if (!var2_2.equals("sharpness")) break;
                ** GOTO lbl30
            }
            case 620514517: {
                if (!var2_2.equals("silk_touch")) break;
                ** GOTO lbl35
            }
            case 976288699: {
                if (!var2_2.equals("knockback")) break;
                ** break;
            }
            case 1603571740: {
                if (!var2_2.equals("unbreaking")) break;
                ** GOTO lbl51
            }
            case 107028782: {
                if (!var2_2.equals("punch")) break;
                ** GOTO lbl49
            }
            case 961218153: {
                if (!var2_2.equals("efficiency")) break;
                ** GOTO lbl68
            }
lbl22:
            // 1 sources

            var3_3 = 13;
            break;
            case 1552717032: {
                if (!var2_2.equals("density")) break;
                ** GOTO lbl66
            }
            case -1056264474: {
                if (!var2_2.equals("sweeping_edge")) break;
                ** GOTO lbl47
            }
lbl30:
            // 1 sources

            var3_3 = 3;
            break;
            case 173173288: {
                if (!var2_2.equals("infinity")) break;
                ** GOTO lbl41
            }
lbl35:
            // 1 sources

            var3_3 = 8;
            break;
            case -1380923823: {
                if (!var2_2.equals("breach")) break;
                var3_3 = 16;
                break;
            }
lbl41:
            // 1 sources

            var3_3 = 9;
            break;
            case 97513267: {
                if (!var2_2.equals("flame")) break;
                var3_3 = 11;
                break;
            }
lbl47:
            // 1 sources

            var3_3 = 14;
            break;
lbl49:
            // 1 sources

            var3_3 = 12;
            break;
lbl51:
            // 1 sources

            var3_3 = 1;
            break;
            case 350056506: {
                if (!var2_2.equals("looting")) break;
                ** GOTO lbl64
            }
            case -1684858151: {
                if (!var2_2.equals("protection")) break;
                var3_3 = 2;
                break;
            }
            case 106858757: {
                if (!var2_2.equals("power")) break;
                var3_3 = 5;
                break;
            }
lbl64:
            // 1 sources

            var3_3 = 7;
            break;
lbl66:
            // 1 sources

            var3_3 = 15;
            break;
lbl68:
            // 1 sources

            var3_3 = 4;
            break;
            case -720514431: {
                if (!var2_2.equals("fire_aspect")) break;
                var3_3 = 10;
                break;
            }
            case 949868500: {
                if (!var2_2.equals("mending")) break;
                var3_3 = 0;
                break;
            }
            case -677216191: {
                if (!var2_2.equals("fortune")) break;
                var3_3 = 6;
                break;
            }
            case 1386075689: {
                if (!var2_2.equals("wind_burst")) break;
                var3_3 = 17;
            }
        }
        switch (var3_3) {
            case 6: 
            case 7: 
            case 8: 
            case 9: {
                return 20.0;
            }
            case 3: 
            case 4: 
            case 5: {
                return 24.0;
            }
            default: {
                return 8.0;
            }
            case 10: 
            case 11: 
            case 12: 
            case 13: 
            case 14: 
            case 15: 
            case 16: 
            case 17: {
                return 14.0;
            }
            case 0: {
                return 36.0;
            }
            case 1: {
                return 22.0;
            }
            case 2: 
        }
        return 26.0;
    }

    /*
     * Unable to fully structure code
     */
    private llllIlll lll(ClientPlayerEntity var1_1, String var2_2) {
        block7: {
            block8: {
                var3_3 = null;
                var4_4 = InventoryCleaner.l;
                var5_5 = var4_4.length;
                var6_6 = 0;
                break block7;
lbl6:
                // 1 sources

                while (this.IIIlI(var8_8) != null || this.lIlI(var8_8)) lbl-1000:
                // 6 sources

                {
                    while (true) {
                        ++var6_6;
                        break block7;
                        break;
                    }
                }
                break block8;
lbl11:
                // 1 sources

                while (true) {
                    if (!var9_9.II(var3_3)) ** GOTO lbl-1000
                    while (true) {
                        var3_3 = var9_9;
                        ** GOTO lbl-1000
                        break;
                    }
                    break;
                }
lbl16:
                // 1 sources

                while (true) {
                    if (!var2_2.equals(this.IIlIl(var8_8))) ** GOTO lbl-1000
                    var9_9 = new llllIlll(var7_7, this.lIll(var8_8), this.IlII(var7_7));
                    if (var3_3 == null) ** continue;
                    ** continue;
                    break;
                }
lbl21:
                // 1 sources

                while (true) {
                    var7_7 = var4_4[var6_6];
                    var8_8 = this.IlI(var1_1, var7_7);
                    if (var8_8.isEmpty() || this.IlllI(var8_8) || var8_8.isStackable()) ** GOTO lbl-1000
                    ** GOTO lbl6
                    break;
                }
lbl26:
                // 1 sources

                return var3_3;
            }
            if (!this.IlIIl(var8_8)) ** break;
            ** while (true)
            ** while (true)
        }
        ** while (var6_6 >= var5_5)
lbl34:
        // 1 sources

        ** while (true)
    }

    @Override
    public void ll() {
        this.lll = 0L;
        this.Ill = this.IIIll();
    }

    private static String IIlI(ItemStack itemStack) {
        return Registries.ITEM.getId((Object)itemStack.getItem()).getPath();
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IlII(int n) {
        if (n >= 5 && n <= 8) return 400;
        if (n >= 36 && n < 45) {
            return 300 - (n - 36);
        }
        if (n == 45) return 250;
        return 100 - n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IllI(String string) {
        if (string.startsWith("netherite_")) {
            return 700.0;
        }
        if (string.startsWith("diamond_")) {
            return 600.0;
        }
        if (string.startsWith("iron_")) {
            return 500.0;
        }
        if (string.startsWith("golden_")) {
            return 440.0;
        }
        if (string.startsWith("copper_")) {
            return 420.0;
        }
        if (string.startsWith("stone_")) {
            return 310.0;
        }
        if (string.startsWith("wooden_")) {
            return 180.0;
        }
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
    private static boolean Illl(int n) {
        if (n >= 5) {
            if (n <= 8) return true;
        }
        if (n != 45) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIII(MinecraftClient minecraftClient, boolean bl) {
        if (bl || this.lIIl(minecraftClient)) {
            if (!this.llIl(minecraftClient)) {
                return false;
            }
            orchard.internal.IIlI.Illl(minecraftClient);
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIIl(MinecraftClient minecraftClient) {
        switch ((IlIIIIlII)((Object)this.lI.lIl())) {
            case II: {
                boolean bl = orchard.internal.IIlI.IlI(minecraftClient);
                return bl;
            }
            case Il: {
                boolean bl = orchard.internal.IIlI.lIII(minecraftClient);
                return bl;
            }
            case I: {
                boolean bl = orchard.internal.IIlI.Il(minecraftClient);
                return bl;
            }
        }
        throw new MatchException(null, null);
    }

    public InventoryCleaner() {
        super(StringFactory.IIII("InventoryCleaner"), Category.IIl, StringFactory.IIII("Drops junk and weak duplicate armor/tools while inventory is open or NoMove is stationary."));
        this.III = this.IIlllIl(new llIll((Object)StringFactory.IIII("Drop Junk"), true));
        this.IlII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Clean Armor"), true));
        this.Il = this.IIlllIl(new llIll((Object)StringFactory.IIII("Clean Tools"), true));
        this.ll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Clean Custom Models"), false));
        this.lI.lIII(() -> !((Boolean)this.IIll.lIl()).booleanValue());
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlI(ItemStack itemStack) {
        if (itemStack.isEmpty()) {
            return true;
        }
        String string = InventoryCleaner.IIlI(itemStack);
        if (string.contains("potion")) return true;
        if (string.equals("enchanted_book")) return true;
        if (string.equals("written_book")) return true;
        if (string.equals("writable_book")) return true;
        if (string.equals("filled_map")) return true;
        if (string.equals("map")) return true;
        String string2 = "tem_of_undying";
        String string3 = "to";
        if (string.equals(string3 + string2)) return true;
        if (string.equals("end_crystal")) return true;
        if (string.equals("experience_bottle")) return true;
        if (string.equals("golden_apple")) return true;
        if (string.equals("enchanted_golden_apple")) return true;
        if (string.equals("firework_rocket")) return true;
        if (string.equals("ender_pearl")) return true;
        if (string.equals("goat_horn")) return true;
        if (string.equals("bundle")) return true;
        if (string.equals("mushroom_stew")) return true;
        if (string.equals("suspicious_stew")) return true;
        if (string.equals("rabbit_stew")) return true;
        if (string.equals("beetroot_soup")) return true;
        if (string.endsWith("_bucket")) return true;
        if (string.endsWith("_shulker_box")) return true;
        if (string.endsWith("_banner")) return true;
        if (string.endsWith("_bed")) return true;
        if (string.endsWith("_boat")) return true;
        if (string.endsWith("_minecart")) return true;
        if (string.startsWith("music_disc_")) return true;
        if (string.endsWith("_head")) return true;
        if (string.endsWith("_skull")) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lIll(ItemStack itemStack) {
        String string = InventoryCleaner.IIlI(itemStack);
        double d = this.IllI(string) + this.IIIIl(itemStack) + this.lII(itemStack);
        d = !itemStack.isDamageable() || itemStack.getMaxDamage() <= 0 ? (d += 100.0) : (d += 100.0 * ((double)(itemStack.getMaxDamage() - itemStack.getDamage()) / (double)itemStack.getMaxDamage()));
        if (!string.equals("elytra")) return d;
        return d += 450.0;
    }

    private static String llII(char[] cArray, long l2, int n) {
        int n2 = 0xCD3B36E6 ^ n;
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
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean llIl(MinecraftClient minecraftClient) {
        boolean bl;
        switch ((IlIIIIlII)((Object)this.lI.lIl())) {
            case I: {
                bl = orchard.internal.IIlI.IlII(minecraftClient);
                return bl;
            }
            case Il: {
                bl = orchard.internal.IIlI.l(minecraftClient);
                return bl;
            }
            default: {
                throw new MatchException(null, null);
            }
            case II: 
        }
        bl = orchard.internal.IIlI.IllI(minecraftClient);
        return bl;
    }

    /*
     * Unable to fully structure code
     */
    private llllIlll lllI(ClientPlayerEntity var1_1, String var2_2) {
        block5: {
            block8: {
                block7: {
                    block6: {
                        block9: {
                            var3_3 = null;
                            var4_4 = InventoryCleaner.l;
                            var5_5 = var4_4.length;
                            var6_6 = 0;
                            break block9;
lbl6:
                            // 2 sources

                            while (true) {
                                var3_3 = var9_9;
                                break block5;
                                break;
                            }
lbl9:
                            // 1 sources

                            while (true) {
                                if (var2_2.equals(this.IIIlI(var8_8))) break block6;
                                break block5;
                                break;
                            }
                        }
lbl13:
                        // 2 sources

                        while (true) {
                            if (var6_6 >= var5_5) break block7;
                            break block8;
                            break;
                        }
                    }
                    var9_9 = new llllIlll(var7_7, this.lIll(var8_8), this.IlII(var7_7));
                    if (var3_3 == null) ** GOTO lbl6
                    if (var9_9.II(var3_3)) {
                        ** continue;
                    }
                    break block5;
                }
                return var3_3;
lbl24:
                // 1 sources

                while (!this.IlllI(var8_8)) {
                    ** continue;
lbl26:
                    // 1 sources

                    ** GOTO lbl9
                }
                break block5;
            }
            var7_7 = var4_4[var6_6];
            var8_8 = this.IlI(var1_1, var7_7);
            if (!var8_8.isEmpty()) ** GOTO lbl24
        }
        ++var6_6;
        ** while (true)
    }

    private static void IIIII() {
        InventoryCleaner.IlI[0] = InventoryCleaner.llII(InventoryCleaner.lIIIl(13762, -1338308671, '\ubbff').toCharArray(), 47314L, 1171585109);
        InventoryCleaner.IlI[1] = InventoryCleaner.llII(InventoryCleaner.lIIIl(23884, 549154958, '\ubbfe').toCharArray(), 7234L, 119686465);
        InventoryCleaner.IlI[2] = InventoryCleaner.llII(InventoryCleaner.lIIIl(21725, -1338480541, '\ubbfd').toCharArray(), 31113L, 900596852);
        InventoryCleaner.IlI[3] = InventoryCleaner.llII(InventoryCleaner.lIIIl(1358, 1334596349, '\ubbfc').toCharArray(), 58391L, 900676957);
        InventoryCleaner.IlI[4] = InventoryCleaner.llII(InventoryCleaner.lIIIl(43173, -2109655427, '\ubbfb').toCharArray(), 66711L, 1384708692);
        InventoryCleaner.IlI[5] = InventoryCleaner.llII(InventoryCleaner.lIIIl(38848, -108120991, '\ubbfa').toCharArray(), 9335L, -1201426844);
        InventoryCleaner.IlI[6] = InventoryCleaner.llII(InventoryCleaner.lIIIl(8862, 946479603, '\ubbf9').toCharArray(), 81557L, -121917540);
        InventoryCleaner.IlI[7] = InventoryCleaner.llII(InventoryCleaner.lIIIl(64085, -564301367, '\ubbf8').toCharArray(), 35456L, -1268157812);
        InventoryCleaner.IlI[8] = InventoryCleaner.llII(InventoryCleaner.lIIIl(52822, 107959123, '\ubbf7').toCharArray(), 77827L, 337639489);
        InventoryCleaner.IlI[9] = InventoryCleaner.llII(InventoryCleaner.lIIIl(50561, -1164224364, '\ubbf6').toCharArray(), 331L, 824175257);
        InventoryCleaner.IlI[10] = InventoryCleaner.llII(InventoryCleaner.lIIIl(30024, -147300332, '\ubbf5').toCharArray(), 58982L, 320478275);
        InventoryCleaner.IlI[11] = InventoryCleaner.llII(InventoryCleaner.lIIIl(46549, 227685222, '\ubbf4').toCharArray(), 54861L, 152210006);
        InventoryCleaner.IlI[12] = InventoryCleaner.llII(InventoryCleaner.lIIIl(45067, 63455746, '\ubbf3').toCharArray(), 17062L, -1421100298);
        InventoryCleaner.IlI[13] = InventoryCleaner.llII(InventoryCleaner.lIIIl(31839, -1818225598, '\ubbf2').toCharArray(), 93590L, -1347389944);
        InventoryCleaner.IlI[14] = InventoryCleaner.llII(InventoryCleaner.lIIIl(3656, 648364711, '\ubbf1').toCharArray(), 73672L, 750202262);
        InventoryCleaner.IlI[15] = InventoryCleaner.llII(InventoryCleaner.lIIIl(12595, 276328797, '\ubbf0').toCharArray(), 3012L, -637796538);
        InventoryCleaner.IlI[16] = InventoryCleaner.llII(InventoryCleaner.lIIIl(24314, -897823165, '\ubbef').toCharArray(), 64339L, -812968068);
        InventoryCleaner.IlI[17] = InventoryCleaner.llII(InventoryCleaner.lIIIl(4941, -1555071197, '\ubbee').toCharArray(), 78970L, -1852715258);
        InventoryCleaner.IlI[18] = InventoryCleaner.llII(InventoryCleaner.lIIIl(56588, 1075972972, '\ubbed').toCharArray(), 20306L, -66062084);
        InventoryCleaner.IlI[19] = InventoryCleaner.llII(InventoryCleaner.lIIIl(29478, -1951575762, '\ubbec').toCharArray(), 6623L, -431252778);
        InventoryCleaner.IlI[20] = InventoryCleaner.llII(InventoryCleaner.lIIIl(1353, 155739409, '\ubbeb').toCharArray(), 45103L, 308248104);
        InventoryCleaner.IlI[21] = InventoryCleaner.llII(InventoryCleaner.lIIIl(21189, -1475472888, '\ubbea').toCharArray(), 27259L, -1534376331);
        InventoryCleaner.IlI[22] = InventoryCleaner.llII(InventoryCleaner.lIIIl(64999, 1303662818, '\ubbe9').toCharArray(), 9913L, 1457583868);
        InventoryCleaner.IlI[23] = InventoryCleaner.llII(InventoryCleaner.lIIIl(29588, -111515837, '\ubbe8').toCharArray(), 40762L, 1173109253);
        InventoryCleaner.IlI[24] = InventoryCleaner.llII(InventoryCleaner.lIIIl(40148, 190413839, '\ubbe7').toCharArray(), 12849L, -1275189651);
        InventoryCleaner.IlI[25] = InventoryCleaner.llII(InventoryCleaner.lIIIl(43613, -1477027987, '\ubbe6').toCharArray(), 78261L, 36022124);
        InventoryCleaner.IlI[26] = InventoryCleaner.llII(InventoryCleaner.lIIIl(4353, -1515977619, '\ubbe5').toCharArray(), 82695L, -894448616);
        InventoryCleaner.IlI[27] = InventoryCleaner.llII(InventoryCleaner.lIIIl(13833, -1544460903, '\ubbe4').toCharArray(), 63896L, 789045008);
        InventoryCleaner.IlI[28] = InventoryCleaner.llII(InventoryCleaner.lIIIl(47399, 1153437241, '\ubbe3').toCharArray(), 96499L, 608240307);
        InventoryCleaner.IlI[29] = InventoryCleaner.llII(InventoryCleaner.lIIIl(44817, -1121311738, '\ubbe2').toCharArray(), 10158L, 337277426);
        InventoryCleaner.IlI[30] = InventoryCleaner.llII(InventoryCleaner.lIIIl(18987, 14172012, '\ubbe1').toCharArray(), 46048L, 184816315);
        InventoryCleaner.IlI[31] = InventoryCleaner.llII(InventoryCleaner.lIIIl(37457, 1311194047, '\ubbe0').toCharArray(), 54273L, 271287316);
        InventoryCleaner.IlI[32] = InventoryCleaner.llII(InventoryCleaner.lIIIl(58726, 324035304, '\ubbdf').toCharArray(), 92109L, 850374854);
        InventoryCleaner.IlI[33] = InventoryCleaner.llII(InventoryCleaner.lIIIl(39247, -1537985488, '\ubbde').toCharArray(), 62928L, 678392801);
        InventoryCleaner.IlI[34] = InventoryCleaner.llII(InventoryCleaner.lIIIl(25884, 1067459058, '\ubbdd').toCharArray(), 20109L, 996972125);
        InventoryCleaner.IlI[35] = InventoryCleaner.llII(InventoryCleaner.lIIIl(30874, 1256593664, '\ubbdc').toCharArray(), 67689L, -1363108138);
        InventoryCleaner.IlI[36] = InventoryCleaner.llII(InventoryCleaner.lIIIl(47875, -1886094103, '\ubbdb').toCharArray(), 52398L, 1985272831);
        InventoryCleaner.IlI[37] = InventoryCleaner.llII(InventoryCleaner.lIIIl(22920, 69535176, '\ubbda').toCharArray(), 42339L, -89722489);
        InventoryCleaner.IlI[38] = InventoryCleaner.llII(InventoryCleaner.lIIIl(26412, 342583326, '\ubbd9').toCharArray(), 60925L, 536342929);
        InventoryCleaner.IlI[39] = InventoryCleaner.llII(InventoryCleaner.lIIIl(43234, -1309131794, '\ubbd8').toCharArray(), 10860L, -391026213);
        InventoryCleaner.IlI[40] = InventoryCleaner.llII(InventoryCleaner.lIIIl(36836, -607960080, '\ubbd7').toCharArray(), 35627L, 83273428);
        InventoryCleaner.IlI[41] = InventoryCleaner.llII(InventoryCleaner.lIIIl(24834, -17883730, '\ubbd6').toCharArray(), 94043L, -432396211);
        InventoryCleaner.IlI[42] = InventoryCleaner.llII(InventoryCleaner.lIIIl(64517, 1587283583, '\ubbd5').toCharArray(), 89374L, 644059433);
        InventoryCleaner.IlI[43] = InventoryCleaner.llII(InventoryCleaner.lIIIl(54621, -1093060899, '\ubbd4').toCharArray(), 27812L, -1529832245);
        InventoryCleaner.IlI[44] = InventoryCleaner.llII(InventoryCleaner.lIIIl(62835, 1691156948, '\ubbd3').toCharArray(), 61506L, 1421621877);
        InventoryCleaner.IlI[45] = InventoryCleaner.llII(InventoryCleaner.lIIIl(25854, -1668923797, '\ubbd2').toCharArray(), 81871L, 1093575787);
        InventoryCleaner.IlI[46] = InventoryCleaner.llII(InventoryCleaner.lIIIl(44228, -39355811, '\ubbd1').toCharArray(), 31026L, -353139726);
        InventoryCleaner.IlI[47] = InventoryCleaner.llII(InventoryCleaner.lIIIl(39646, 1992299543, '\ubbd0').toCharArray(), 65103L, -1744873278);
        InventoryCleaner.IlI[48] = InventoryCleaner.llII(InventoryCleaner.lIIIl(13686, 1809924894, '\ubbcf').toCharArray(), 16429L, -1011637506);
        InventoryCleaner.IlI[49] = InventoryCleaner.llII(InventoryCleaner.lIIIl(38715, -1168702885, '\ubbce').toCharArray(), 82774L, 466583686);
        InventoryCleaner.IlI[50] = InventoryCleaner.llII(InventoryCleaner.lIIIl(62360, 1326805101, '\ubbcd').toCharArray(), 52114L, -78189457);
        InventoryCleaner.IlI[51] = InventoryCleaner.llII(InventoryCleaner.lIIIl(26653, 145490526, '\ubbcc').toCharArray(), 92573L, -1991935500);
        InventoryCleaner.IlI[52] = InventoryCleaner.llII(InventoryCleaner.lIIIl(39875, -885250461, '\ubbcb').toCharArray(), 76402L, -700323193);
        InventoryCleaner.IlI[53] = InventoryCleaner.llII(InventoryCleaner.lIIIl(65248, 619718073, '\ubbca').toCharArray(), 91774L, -1413958589);
        InventoryCleaner.IlI[54] = InventoryCleaner.llII(InventoryCleaner.lIIIl(15343, -721860789, '\ubbc9').toCharArray(), 81771L, -1263356771);
        InventoryCleaner.IlI[55] = InventoryCleaner.llII(InventoryCleaner.lIIIl(13586, 1362627137, '\ubbc8').toCharArray(), 70914L, 1436575342);
        InventoryCleaner.IlI[56] = InventoryCleaner.llII(InventoryCleaner.lIIIl(14807, -617265253, '\ubbc7').toCharArray(), 97264L, 119098052);
        InventoryCleaner.IlI[57] = InventoryCleaner.llII(InventoryCleaner.lIIIl(13886, 2040923248, '\ubbc6').toCharArray(), 47404L, -503607708);
        InventoryCleaner.IlI[58] = InventoryCleaner.llII(InventoryCleaner.lIIIl(60539, 1255284841, '\ubbc5').toCharArray(), 52995L, 1152947128);
        InventoryCleaner.IlI[59] = InventoryCleaner.llII(InventoryCleaner.lIIIl(19399, 1993565589, '\ubbc4').toCharArray(), 46534L, -572715612);
        InventoryCleaner.IlI[60] = InventoryCleaner.llII(InventoryCleaner.lIIIl(7108, 1727427051, '\ubbc3').toCharArray(), 52035L, -474561058);
        InventoryCleaner.IlI[61] = InventoryCleaner.llII(InventoryCleaner.lIIIl(6105, -2147150182, '\ubbc2').toCharArray(), 18141L, -1074362135);
        InventoryCleaner.IlI[62] = InventoryCleaner.llII(InventoryCleaner.lIIIl(13303, 381096956, '\ubbc1').toCharArray(), 44454L, -1419587225);
        InventoryCleaner.IlI[63] = InventoryCleaner.llII(InventoryCleaner.lIIIl(29303, -346457965, '\ubbc0').toCharArray(), 81788L, 539226301);
        InventoryCleaner.IlI[64] = InventoryCleaner.llII(InventoryCleaner.lIIIl(47409, -1079300253, '\ubbbf').toCharArray(), 56081L, -1658618017);
        InventoryCleaner.IlI[65] = InventoryCleaner.llII(InventoryCleaner.lIIIl(38425, 842147687, '\ubbbe').toCharArray(), 96098L, 354023391);
        InventoryCleaner.IlI[66] = InventoryCleaner.llII(InventoryCleaner.lIIIl(60772, 308021489, '\ubbbd').toCharArray(), 82659L, 1161994512);
        InventoryCleaner.IlI[67] = InventoryCleaner.llII(InventoryCleaner.lIIIl(51765, -378266021, '\ubbbc').toCharArray(), 45769L, 1301148865);
        InventoryCleaner.IlI[68] = InventoryCleaner.llII(InventoryCleaner.lIIIl(673, 120783561, '\ubbbb').toCharArray(), 67671L, -1739422159);
        InventoryCleaner.IlI[69] = InventoryCleaner.llII(InventoryCleaner.lIIIl(10409, 343147994, '\ubbba').toCharArray(), 96058L, 53689957);
        InventoryCleaner.IlI[70] = InventoryCleaner.llII(InventoryCleaner.lIIIl(9821, 1726694657, '\ubbb9').toCharArray(), 90568L, -1212629684);
        InventoryCleaner.IlI[71] = InventoryCleaner.llII(InventoryCleaner.lIIIl(59680, 1419004764, '\ubbb8').toCharArray(), 40501L, 1330086781);
        InventoryCleaner.IlI[72] = InventoryCleaner.llII(InventoryCleaner.lIIIl(56320, -824834021, '\ubbb7').toCharArray(), 44293L, 1923918804);
        InventoryCleaner.IlI[73] = InventoryCleaner.llII(InventoryCleaner.lIIIl(45353, -1361347090, '\ubbb6').toCharArray(), 85594L, -1201728890);
        InventoryCleaner.IlI[74] = InventoryCleaner.llII(InventoryCleaner.lIIIl(39488, -331648206, '\ubbb5').toCharArray(), 59336L, 675211628);
        InventoryCleaner.IlI[75] = InventoryCleaner.llII(InventoryCleaner.lIIIl(64588, -482932508, '\ubbb4').toCharArray(), 56234L, -1713473387);
        InventoryCleaner.IlI[76] = InventoryCleaner.llII(InventoryCleaner.lIIIl(34235, 857544550, '\ubbb3').toCharArray(), 25213L, -1025269203);
        InventoryCleaner.IlI[77] = InventoryCleaner.llII(InventoryCleaner.lIIIl(4890, -1674242326, '\ubbb2').toCharArray(), 28285L, -1546886943);
        InventoryCleaner.IlI[78] = InventoryCleaner.llII(InventoryCleaner.lIIIl(65185, -626567128, '\ubbb1').toCharArray(), 8344L, 554195940);
        InventoryCleaner.IlI[79] = InventoryCleaner.llII(InventoryCleaner.lIIIl(41193, -890230080, '\ubbb0').toCharArray(), 55914L, 586905842);
        InventoryCleaner.IlI[80] = InventoryCleaner.llII(InventoryCleaner.lIIIl(47635, 136450032, '\ubbaf').toCharArray(), 85252L, 281720079);
        InventoryCleaner.IlI[81] = InventoryCleaner.llII(InventoryCleaner.lIIIl(13144, 408119185, '\ubbae').toCharArray(), 20079L, 259843292);
        InventoryCleaner.IlI[82] = InventoryCleaner.llII(InventoryCleaner.lIIIl(61310, 1391406700, '\ubbad').toCharArray(), 56256L, -1773171766);
        InventoryCleaner.IlI[83] = InventoryCleaner.llII(InventoryCleaner.lIIIl(29203, -617516885, '\ubbac').toCharArray(), 30565L, 457274440);
        InventoryCleaner.IlI[84] = InventoryCleaner.llII(InventoryCleaner.lIIIl(36445, -1101194982, '\ubbab').toCharArray(), 7985L, -1797207208);
        InventoryCleaner.IlI[85] = InventoryCleaner.llII(InventoryCleaner.lIIIl(58860, -981529289, '\ubbaa').toCharArray(), 92352L, -839443821);
        InventoryCleaner.IlI[86] = InventoryCleaner.llII(InventoryCleaner.lIIIl(18106, -490073607, '\ubba9').toCharArray(), 44442L, -2130084098);
        InventoryCleaner.IlI[87] = InventoryCleaner.llII("".toCharArray(), 87617L, 1692839815);
        InventoryCleaner.IlI[88] = InventoryCleaner.llII(InventoryCleaner.lIIIl(56247, 757730329, '\ubba8').toCharArray(), 21271L, -598110918);
        InventoryCleaner.IlI[89] = InventoryCleaner.llII(InventoryCleaner.lIIIl(13709, -28299787, '\ubba7').toCharArray(), 58261L, -1021386175);
        InventoryCleaner.IlI[90] = InventoryCleaner.llII(InventoryCleaner.lIIIl(49373, 550986374, '\ubba6').toCharArray(), 55490L, -564737849);
        InventoryCleaner.IlI[91] = InventoryCleaner.llII(InventoryCleaner.lIIIl(59546, -263168104, '\ubba5').toCharArray(), 26460L, -497110578);
        InventoryCleaner.IlI[92] = InventoryCleaner.llII(InventoryCleaner.lIIIl(13448, -1779279794, '\ubba4').toCharArray(), 23622L, 775456616);
        InventoryCleaner.IlI[93] = InventoryCleaner.llII(InventoryCleaner.lIIIl(921, -701276711, '\ubba3').toCharArray(), 4413L, -418955979);
        InventoryCleaner.IlI[94] = InventoryCleaner.llII(InventoryCleaner.lIIIl(36090, -781951987, '\ubba2').toCharArray(), 38310L, -2009113342);
        InventoryCleaner.IlI[95] = InventoryCleaner.llII(InventoryCleaner.lIIIl(52024, -1925754959, '\ubba1').toCharArray(), 37006L, -805888736);
        InventoryCleaner.IlI[96] = InventoryCleaner.llII(InventoryCleaner.lIIIl(9804, 2070152416, '\ubba0').toCharArray(), 44660L, 959934260);
        InventoryCleaner.IlI[97] = InventoryCleaner.llII(InventoryCleaner.lIIIl(35362, -1177854670, '\ubb9f').toCharArray(), 64642L, -1398004135);
        InventoryCleaner.IlI[98] = InventoryCleaner.llII(InventoryCleaner.lIIIl(61804, -114545784, '\ubb9e').toCharArray(), 23421L, 1835082206);
        InventoryCleaner.IlI[99] = InventoryCleaner.llII(InventoryCleaner.lIIIl(43157, -165128620, '\ubb9d').toCharArray(), 6304L, 1646877656);
        InventoryCleaner.IlI[100] = InventoryCleaner.llII(InventoryCleaner.lIIIl(31753, -1144438251, '\ubb9c').toCharArray(), 90319L, 87412507);
        InventoryCleaner.IlI[101] = InventoryCleaner.llII(InventoryCleaner.lIIIl(2481, -1427176252, '\ubb9b').toCharArray(), 76903L, -1293051562);
        InventoryCleaner.IlI[102] = InventoryCleaner.llII(InventoryCleaner.lIIIl(19434, -25674559, '\ubb9a').toCharArray(), 7747L, -73982123);
        InventoryCleaner.IlI[103] = InventoryCleaner.llII(InventoryCleaner.lIIIl(55389, -1185534584, '\ubb99').toCharArray(), 36355L, 1809447338);
        InventoryCleaner.IlI[104] = InventoryCleaner.llII(InventoryCleaner.lIIIl(21477, 591219305, '\ubb98').toCharArray(), 36826L, 605024481);
        InventoryCleaner.IlI[105] = InventoryCleaner.llII(InventoryCleaner.lIIIl(25180, 552154861, '\ubb97').toCharArray(), 98006L, -743746608);
        InventoryCleaner.IlI[106] = InventoryCleaner.llII(InventoryCleaner.lIIIl(45635, -714727476, '\ubb96').toCharArray(), 66745L, -326897347);
        InventoryCleaner.IlI[107] = InventoryCleaner.llII(InventoryCleaner.lIIIl(1884, 1036597025, '\ubb95').toCharArray(), 33433L, 773138861);
        InventoryCleaner.IlI[108] = InventoryCleaner.llII(InventoryCleaner.lIIIl(10677, 1760959937, '\ubb94').toCharArray(), 38899L, -1411579298);
        InventoryCleaner.IlI[109] = InventoryCleaner.llII(InventoryCleaner.lIIIl(2527, 1392980768, '\ubb93').toCharArray(), 78780L, 1187511613);
        InventoryCleaner.IlI[110] = InventoryCleaner.llII(InventoryCleaner.lIIIl(23179, 1463643255, '\ubb92').toCharArray(), 65114L, -1279347165);
        InventoryCleaner.IlI[111] = InventoryCleaner.llII(InventoryCleaner.lIIIl(3841, 524102260, '\ubb91').toCharArray(), 9146L, 445857973);
        InventoryCleaner.IlI[112] = InventoryCleaner.llII(InventoryCleaner.lIIIl(12871, -230393295, '\ubb90').toCharArray(), 65051L, 168786225);
        InventoryCleaner.IlI[113] = InventoryCleaner.llII(InventoryCleaner.lIIIl(15903, -855476296, '\ubb8f').toCharArray(), 3667L, -1251092993);
        InventoryCleaner.IlI[114] = InventoryCleaner.llII(InventoryCleaner.lIIIl(54902, -1100405302, '\ubb8e').toCharArray(), 48773L, -1493145147);
        InventoryCleaner.IlI[115] = InventoryCleaner.llII(InventoryCleaner.lIIIl(6838, -1716513013, '\ubb8d').toCharArray(), 6935L, -471917544);
        InventoryCleaner.IlI[116] = InventoryCleaner.llII(InventoryCleaner.lIIIl(31691, -1310962979, '\ubb8c').toCharArray(), 16568L, 2143723073);
        InventoryCleaner.IlI[117] = InventoryCleaner.llII(InventoryCleaner.lIIIl(35988, 1702444919, '\ubb8b').toCharArray(), 32654L, 818767753);
        InventoryCleaner.IlI[118] = InventoryCleaner.llII(InventoryCleaner.lIIIl(7676, 56057800, '\ubb8a').toCharArray(), 46563L, 2042632828);
        InventoryCleaner.IlI[119] = InventoryCleaner.llII(InventoryCleaner.lIIIl(56683, 1079521294, '\ubb89').toCharArray(), 20212L, 1583773316);
        InventoryCleaner.IlI[120] = InventoryCleaner.llII(InventoryCleaner.lIIIl(53794, -1412730375, '\ubb88').toCharArray(), 87655L, 2017159245);
        InventoryCleaner.IlI[121] = InventoryCleaner.llII(InventoryCleaner.lIIIl(19520, 446385057, '\ubb87').toCharArray(), 26755L, -674030885);
        InventoryCleaner.IlI[122] = InventoryCleaner.llII(InventoryCleaner.lIIIl(29731, 2049205514, '\ubb86').toCharArray(), 79638L, -1521611055);
        InventoryCleaner.IlI[123] = InventoryCleaner.llII(InventoryCleaner.lIIIl(42623, -1647033855, '\ubb85').toCharArray(), 99083L, 1443080469);
        InventoryCleaner.IlI[124] = InventoryCleaner.llII(InventoryCleaner.lIIIl(20092, 246754289, '\ubb84').toCharArray(), 64847L, -567270313);
        InventoryCleaner.IlI[125] = InventoryCleaner.llII(InventoryCleaner.lIIIl(53662, 1516391232, '\ubb83').toCharArray(), 23389L, 1876663331);
        InventoryCleaner.IlI[126] = InventoryCleaner.llII(InventoryCleaner.lIIIl(63943, -339061060, '\ubb82').toCharArray(), 81993L, 1061849611);
        InventoryCleaner.IlI[127] = InventoryCleaner.llII(InventoryCleaner.lIIIl(64984, -1525255575, '\ubb81').toCharArray(), 78267L, 1918109771);
    }

    /*
     * Unable to fully structure code
     */
    private double IIIIl(ItemStack var1_1) {
        block6: {
            block7: {
                block5: {
                    block4: {
                        var2_2 = 0.0;
                        var4_3 = (AttributeModifiersComponent)var1_1.getOrDefault(DataComponentTypes.ATTRIBUTE_MODIFIERS, (Object)AttributeModifiersComponent.DEFAULT);
                        var5_4 = var4_3.modifiers().iterator();
lbl4:
                        // 6 sources

                        while (true) {
                            if (!var5_4.hasNext()) {
                                return var2_2;
                            }
                            var6_5 = (AttributeModifiersComponent.Entry)var5_4.next();
                            if (!var6_5.attribute().equals((Object)EntityAttributes.ARMOR)) break block4;
                            break block5;
                            break;
                        }
lbl10:
                        // 1 sources

                        while (true) {
                            var2_2 += var6_5.modifier().value() * 10.0;
                            ** GOTO lbl4
                            break;
                        }
                    }
                    if (!var6_5.attribute().equals((Object)EntityAttributes.ARMOR_TOUGHNESS)) break block6;
                    break block7;
                }
                var2_2 += var6_5.modifier().value() * 80.0;
                ** GOTO lbl4
lbl19:
                // 1 sources

                while (true) {
                    var2_2 += var6_5.modifier().value() * 65.0;
                    ** GOTO lbl4
                    break;
                }
            }
            var2_2 += var6_5.modifier().value() * 45.0;
            ** GOTO lbl4
        }
        ** while (var6_5.attribute().equals((Object)EntityAttributes.ATTACK_DAMAGE))
lbl27:
        // 1 sources

        if (var6_5.attribute().equals((Object)EntityAttributes.ATTACK_SPEED)) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private String IIIlI(ItemStack itemStack) {
        String string;
        if (itemStack.isEmpty()) {
            return null;
        }
        String string2 = InventoryCleaner.IIlI(itemStack);
        if (((Boolean)this.IlII.lIl()).booleanValue() && (string = this.IIllI(string2)) != null) {
            return string;
        }
        if (!((Boolean)this.Il.lIl()).booleanValue()) {
            return null;
        }
        if (string2.endsWith("_sword")) {
            return "tool:sword";
        }
        if (string2.endsWith("_axe")) {
            return "tool:axe";
        }
        if (string2.endsWith("_pickaxe")) {
            return "tool:pickaxe";
        }
        if (string2.endsWith("_shovel")) {
            return "tool:shovel";
        }
        if (string2.endsWith("_hoe")) {
            return "tool:hoe";
        }
        if (string2.endsWith("_spear")) {
            return "tool:spear";
        }
        if (string2.equals("bow")) {
            return "tool:bow";
        }
        if (string2.equals("trident")) {
            return "tool:trident";
        }
        if (string2.equals("crossbow")) {
            return "tool:crossbow";
        }
        if (string2.endsWith("_sword")) {
            return "tool:sword";
        }
        if (string2.endsWith("_axe")) {
            return "tool:axe";
        }
        if (string2.endsWith("_pickaxe")) {
            return "tool:pickaxe";
        }
        if (string2.endsWith("_shovel")) {
            return "tool:shovel";
        }
        if (string2.endsWith("_hoe")) {
            return "tool:hoe";
        }
        if (string2.endsWith("_spear")) {
            return "tool:spear";
        }
        if (string2.equals("mace")) {
            return "tool:mace";
        }
        if (string2.equals("bow")) {
            return "tool:bow";
        }
        if (string2.equals("crossbow")) {
            return "tool:crossbow";
        }
        if (string2.equals("trident")) {
            return "tool:trident";
        }
        if (string2.equals("shield")) {
            return "tool:shield";
        }
        if (string2.equals("fishing_rod")) {
            return "tool:fishing_rod";
        }
        if (string2.equals("shears")) {
            return "tool:shears";
        }
        if (string2.equals("flint_and_steel")) {
            return "tool:flint_and_steel";
        }
        if (!string2.equals("brush")) return null;
        return "tool:brush";
    }

    private long IIIll() {
        double d;
        double d2 = this.lIl.IIIl();
        if (d2 == (d = this.lIl.IIII())) {
            return Math.round(d2);
        }
        return Math.round(ThreadLocalRandom.current().nextDouble(d2, d));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block19: {
                block18: {
                    block15: {
                        block13: {
                            block17: {
                                block16: {
                                    break block16;
lbl1:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl3:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl5:
                                    // 2 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl7:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
lbl9:
                                    // 1 sources

                                    while (true) {
                                        var3_11 += 4;
                                        if (++var4_12 < var1_9) ** GOTO lbl3
                                        break block13;
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        InventoryCleaner.IlIl = new int[var1_9];
                                        ** continue;
                                        break;
                                    }
                                    var3_11 = 0;
                                    var4_12 = 0;
                                    ** while (true)
                                }
                                var6 = 13905;
                                break block17;
lbl22:
                                // 1 sources

                                while (true) {
                                    var13_7 = -1;
                                    ** GOTO lbl5
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
lbl27:
                                // 1 sources

                                while (++var10_4 >= var8_2.length) {
                                    break block14;
                                }
                                break block15;
lbl30:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var7_1 = "\u4df0\uff35\uea71\u94c9\u32c5\ue9ca\uf3f9\uc305\u832c\u9a1a\u2472\u835d\u865c\u7004\u2775\ua61d\u8454\u8ec9\u0b2c\u8647\u5158\u672f\u3f59\u0954\uf43f\u5a50\u453a\ud665\uc4bf\u6b6c\u866a\u3125\u7c36\u87a1\ucfc5\ube02\u7f98\u80ad\u6dc1\ucfda\u640a\u57fa\u2b9b\u6421\uf565\u2681\u844f\ufc6f\u4126\u802a\u9106\u9900\u9fd9\u1fca\ub305\ue1e9\u5f15\u3bf5\ue570\u0254\u82fc\u852f\u8bdb\uab2e\u8cca\u5baa\u3bf4\u83b5\u6773\u1db9\u9a7e\u383e\u2fe6\u9c34\uf77c\uc488\ub713\uefa0\u5937\u636f\u018b\u67f4\ud0a0\ue877\uce88\ue05d\uf3cf\u3a64\u9426\u46e0\ub77e\u3dd6\u2e11\u7f2e\u820d\ue141\ub329\ud9b2\uf76e\u506d\u42be\u74f7\u60ac\ua0c4\ubc75\u8b7a\ud3ef\uc62c\u8409\u6396\u2572\u0d4d\ua462\u3fe8\u3d8d\ue3f1\uaaad\ucaf1\u74c9\u3312\u78fb\ud4d9\u7dcd\ucf50\u7e17\ud8ab\uc005\uf116\u7f3a\ue3a3\u1a97\u0edb\u5270\ua3cf\ua61a\u07a3\u2f17\u050c\u8b61\u6ba0\u50a4\ub1de\u4256\ua8e9\u38df\ua3d8\u399d\u94f9\uc3c4\u11cf\u436b\u9316\u39d2\u15ba\uc4fb\u0fa8\ucec7\u86c1\u9cff\u2b28\ucde0\u1778\u2b4a\u2cdb\uffb4\uf131\u7272\uc24d\u04a3\u681f\ubc7d\u9e19\u8d98\udc54\uadfd\u2344\ud2b6\u6bfe\u38e3\u29ee\u35c6\uaf12\u232b\ufdb7\ua1e1\u1642\uf851\u47b6\u75f4\u3c10\ueb81\u04d8\uba5d\u7f9e\u0a36\u839e\uf925\u6e5f\u4ed1\ue4bf\ue254\ub989\u87f7\u7010\u72de\u909b\u7702\ub6cc\u7612\u8db5\uf64c\u5e6c\uc14c\ud99f\ud18a\u7685\u73f5\u8b32\u3189\u404c\ubd5b\u98a6\u3b0b\u8932\u1610\u29b2\u7f40\u30b5\u99b8\u802e\u7489\u581d\uf88e\u3a01\u7a30\uadd7\uda91\uf47b\u7483\u55c4\u0531\u9ba7\ua5dd\uff69\u2dbe\u07c1\u6489\ube82\u60df\uc2f6\uc2e5\ubaac\uade3\ucc11\uaa32\u81a0\u7c45\u4991\uba22\u9272\ud5aa\ub6ec\u2b74\u501f\u17ee\u5497\u763c\ub6ac\u08c6\u20fa\ub8bd\udd7e\udf53\ub383\u0b40\ufc69\u3609\u0201\u5a60\ufa12\ue1c2\ud94f\ua577\u3bd8\ubd02\uac8f\uc148\u4760\ua581\uf43c\uae8c\u34ef\ue964\u74a4\ue1ba\u611d\uae21\ucde4\udb1c\uf114\u18ca\ud18f\uf39d\u94db\u3b26\u5e24\u97ee\u984d\u156b\u286c\u4fa2\u3c1a\u47b1\ue514\ue552\uf144\u8e6d\u03c8\ue4a5\uf9a2\uac03\ud1d9\ud34d\u5b1b\ua406\ue26e\u986c\u4ff5\u9185\u4483\ubcdd\ue3b0\u8e3c\u531d\u44b7\ub158\ue74d\ud2f5\u0e57\u921c\uaecc\u3967\ub0dc\u8cb4\uebd5\u9821\ubf18\u3bed\u0e42\u57ae\ud833\u23a9\u5e1f\u0626\u892f\ub6aa\ucffd\u7d97\u1978\u9726\uff4f\u4bd8\ue178\ua9c7\u918d\u282c\ucdc6\ue5c9\u13a2\u6a82\ubf95\u6f86\ube0f\uc460\ubc8c\uf3fb\u950e\u7c7d\uc151\ue3d1\u36c7\u3d46\ub16e\ub0c0\uab50\u92b3\ub213\uc229\u0c6f\u8b79\u5689\ud8a6\u7bd3\ue5a7\ub0d1\u7d31\u4d42\ueefe\uebaa\ud4e7\u1b1b\u7767\u5fec\uf596\uf439\u8b89\uf33d\ucb5c\u268f\u00db\u5c2f\u25d0\u5fd3\uabde\u5065\u20e5\uec74\u3376\u16e9\u755c\u970a\u2fa5\ue21c\u59d6\u8bb6\u093e\ud1cd\u530d\uc431\u6de7\u9ddf\u01c0\ue2fb\u4c77\u9866\ue3d9\ua764\uee8c\ucd41\u0f04\u9dbc\ua12a\uc98b\udb54\uc81c\u574c\ua426\udbe9\ue029\uc023\ufb89\udc32\ueed3\ubd86\u0d07\u9c41\u8028\u7642\uf3d0\u4335\uc674\u2c3e\u129d\uf0e6\ueee8\ud71f\u69d4\ub5c8\uf105\u2a87\u951a\udc40\ue159\ub3de\u0be6\u974e\u151e\u306a\u615f\ubded\u62d5\uc4e7\u10a6\u772d\u329b\u4166\u647c\u0ff0\uc46a\ub03c\u6524\u02aa\u76ff\uf2f2\u8a6e\u3f94\uf890\uaf86\u6083\ub4a8\ua05a\uf93b\u6d0b\ua632\u4853\ube19\u27da\u62d6\ue95c\u6788\u432e\ufd06\ua6a9\u96a9\u1cfe\u4329\u9530\u52be\u186c\ufc2d\ud251\ue055\u7164\ua8b3\uca74\u5813\u7c44\uc34f\u7abb\u8eb2\udf3a\u87bb\u9d0d\u8369\u4239\u45ce\uc788\ue20f\uf792\uab05\u4486\u6f76\ua4f8\ud05f\u4ac9\uf008\ud3c3\uff44\uf494\ue39e\u3958\u2ff0\ud121\ub777\uf81e\u848c\u31c7\u5fe9\u691b\ud241\u34c8\ued64\u8c35\u9699\u1b65\u213f\ucd51\uf9d4\u361b\u3224\u9c79\u3c92\u654e\u2145\ubf1d\u4540\u38f8\u08bf\u9c7c\u47c2\u17f3\u3595\u5938\u2b58\u39a8\u5367\u9655\u2c08\u74dd\uec16\u241a\u66e9\u4bd6\u190a\ua090\ua294\ude4d\uef85\u5892\uc4cd\u5698\uee90\udc92\u3b62\uf7e6\u2ec6\u7590\u6bed\u96ec\ubd2c\u9f64\u7d0e\u57af\u14dc\u8785\u463a\u10af\u5e8f\u52f0\u3837\ub3b1\uca0d\ue92a\uef44\ub2ff\ub841\ub148\u87c5\uf123\u65fa\u230f\u5526\ue77c\u4d14\u780f\u689c\udd81\uf264\uc99a\ue3a6\u780c\u1633\uc6ae\ue003\udb49\u9f5e\u1971\u4a36\u0b65\u3a1a\u676e\u0961\u823f\ue7fa\u758c\u6a58\u6b12\u814f\u9079\u6035\uf6c5\ucfbc\ua2a5\u35a8\u319a\ub593\ucabe\ub53d\u139e\ucc0e\ufdb5\ud873\ucb3d\u7b41\ub939\u4f3b\u17de\u716e\u81da\u279a\uef6b\u4534\u2a1c\u8f5c\u0a90\ue170\u61b4\ua223\u9e5a\u8a7b\udc12\u5e8d\u589b\uf25b\u0b42\ufb0c\ud10c\u83f0\u4704\u7658\u1d20\u01b5\u724e\uc5d4\ud0a6\u107a\u290a\u81df\uf659\u8b0a\u35e7\u5bfe\u225d\ufa42\uee3c\u7e84\u4143\ufc07\ubbf4\u5718\ud866\u9fe1\ue871\uea06\u1844\u43e5\u688a\u2fdc\ub9df\u951a\u4623\uca51\u5c93\u040e\u7f53\uad65\ubf44\u679c\uc5bb\u21c9\u18de\ua400\u4b5b\uf016\ubae2\uedf0\ucc24\u4d14\u60b3\ub9dd\u0ef5\ua0d0\ua8f2\u1290\u0688\u5ba3\uccf3\u2f6e\u9f81\u517b\ucd82\uef63\ubb81\uab63\u4841\u7152\uc478\ue104\u9bb3\u44d3\u4e67\ud972\u3a30\ucf5b\uf0c8\u373b\u116c\ud72b\uab20\ua5e1\u8dc8\u053a\u2f42\u9d0b\u7806\u8980\u6766\u86fa\uf18b\ub87f\ueacf\u086b\ufcb3\ub7ca\ucf34\ufb72\u196c\uab90\u3115\ue4d8\uce19\udd4b\u8d13\u2eaf\ucd5a\ud2ef\u8340\ud865\u8e48\u7ca4\u8008\ucdf5\u45e5\u646f\u1c60\u2fbd\u6db5\u9610\u29ec\u76b2\uc5d0\u5bd3\uabbd\u40e9\uc6c9\ua386\u867e\u945b\ud493\uc563\u5764\u9917\u45fe\u7352\u5dab\u2cb9\u836f\u7418\u368d\uc64d\u2469\u0ce3\u7187\uc6cb\u7a52\u5df9\uf21f\u018c\udaa9\ub00a\u0782\u198b\uab31\ud331\ud83d\u1e96\uc52b\u6ed1\u6dde\udff3\u6c5f\u4824\ua567\u76a7\u355e\u8a5c\ueb28\u3ddf\u8b0a\ua646\u32cd\u9cf5\u8071\u089e\u8570\u80ed\u06b2\uc17d\u064c\u8e28\u600f\uf30d\u7f69\ued59\u1414\u4e2f\u00bc\u9562\u137b\u0f6c\u71f9\ua164\ubce7\ufa13\uf983\ua8d0\u1125\u1107\u6459\u10a9\u848a\u7825\u3edc\uf540\u5f9a\u8cf9\uae09\u5340\u4cf9\u57ac\u39a4\ud613\u6bd6\u1a17\u63aa\ub3ec\u0b6c\u1857\uc48b\ud7be\u0bb6\u44d3\ud243\ueabe\u114b\uc31a\uc16b\u3e4a\ude63\u5f94\ud1b8\u80de\udb23\u274d\udb69\uaa2e\ucaa5\uc0d2\u202d\ua814\ud33f\uffa8\uda44\ue909\u1766\u87ae\u9411\u5b9d\u43e0\ua7dd\u3e40\u0016\ufcfc\u953a\u7ccc\u7029\u6ca6\u17bc\u5518\uba8f\u2e91\ue2b6\u7131\uc81a\u038f\u4727\u5dce\u237c\ue29a\u6dbb\u8234\u629f\u8bae\u6298\u729c\u3f5d\u1768\u9072\u6220\ud1e6\u6093\ucfeb\u7f4d\ua8c6\udcb1\u669b\u596b\uc041\ubb7a\u8da6\uabd8\u4d16\u6012\u9021\u2a51\uf0e6\u6f46\ud340\u17d6\u4fb1\u873f\uf59b\u413d\u1565\ub8ac\u7ede\u4e11\uc126\u5725\u4c4c\u4b03\ue33c\u3c9f\ua531\ub33b\u32d5\uf1a0\u0126\ua436\u21b9\uc9e0\uf876\uf9e9\ub228\u637b\ue305\u7138\u5251\u90ea\ue23e\u5b5d\u5575\ub3f6\u245c\u3d3b\ufb76\ue85e\u14ee\ue100\uf2b4\u90bb\u6ee5\ub2ff\ue455\u834f\u8b17\u1c2d\ub40e\uc284\u45ca\uc9ac\u2fe7\u140b\ub495\u7102\u33d7\u7eed\u1cfd\u1244\u4405\u9e96\u7ac4\ue924\u1ac7\u9260\ub50c\u15e7\ucf49\u2a15\u52d5\u9a8d\u0795\ud6e3\u67ce\ufb79\ud22d\u024f\u0e0a\u313a\u50c9\u3df9\u9603\ua21c\u7b21\u2baf\u4bdd\u01b2\u915b\u6399\u6c66\u38be\u71a8\u4d15\u0ec1\ucf1d\u8696\ud25b\u3a5a\uf359\u1bcc\ua03e\u4d49\u3265\uf22a\ua017\u0311\ubd27\u130f\u4e0f\u3c15\ue9be\ubec4\u5d85\uf964\u668d\u5804\u3c96\u4e51\u53bf\u23a1\u7e46\u6850\ub512\uf245\ub718\u6960\ua424\u5f61\uab9c\ud3aa\u4b94\udfed\u14ab\ua150\u4a5a\u2a37\uc761\u0003\u27a0\uf1e2\ud019\u2fe3\u9111\u38d8\ue63b\uc227\uc202\ue683\u3bd0\u3a1b\uf8ea\ub754\uf7e2\uee68\uf1b5\u4655\ua7bf\uddcb\ue30a\ufe25\u603e\u2a0d\u34db\u1857\u5067\u76bb\u40a2\ua6a4\uf9d6\ud898\ub43d\u488a\ua824\uac2e\ud006\ud629\ud1e8\ub44f\u2dd6\u2a7d\u4e1a\ua99b\u125d\uf6ae\uaf83\ueab2\u7938\u8618\ud573\ubcf0\u7d98\u18fb\u2ec6\ub8be\ucd1b\u404a\ub1e9\uf29d\ucc06\u2c7e\u0bd9\u3958\u5457\u5f80\u202d\ubbf9\u7fb7\u4274\ue840\u2e39\uc03d\u9363\uf2e6\u193a\ucbfb\u0de1\ued1f\udc5d\u2b28\u242b\ufb8a\u92b9\u977f\u8633\u1cec\uc04c\u4a45\ue37e\ub503\u5bb9\u45a4\u6fa4\u7c07\u9dd4\u32b7\u4593\uc0b6\u9a3d\u8022\u122d\u1c9c\u60b1\ub8c5\u2f7f\u5f45\ub12e\u3252\u3080\u586c\u48ec\ub126\u698a\u82e5\ua864\u9883\u257c\u4e91\u245f\u690e\u4c0e\u797f\uf112\u8509\u8561\uc9e2\u32df\u7e4a\u3b08\u2822\u2f64\u4880\uf8c3\uaa06\u484f\u690b\uc201\uadf3\ue9cd\u7a1e\u97a4\u6639\uac88\ue669\u5150\u3e03\u6158\uc011\u5454\ue379\u7835\u8a86\udff6\u7ff8\u4281\u0b9b\ub34d\ufd34\u46e3\ua136\u1427\u3226\uf52b\u5e20\ubad8\u8b9c\ub807\ud53c\ua6a3\u2006\u1648\ucff5\u00c5\ud037\u230d\uba3e\ufdee\u2c5d\ua7ae\u6656\ub53e\ua197\u8ca2\u7be6\u84be\u2cef\u96bb\ua1cf\u6ea4\ud285\u21b6\ubb06\u767f\u0ccc\u5d78\uf5a2\u3fd5\u1f5f\ua297\u662e\ue525\ue8ea\u53ca\ua025\u7fc5\u5ab2\uecc9\ubac7\uca6d\u6933\ua0a0\u671f\u68cb\u36f0\u657f\u8514\u2b3e\u1e79\u3013\ub809\u70d7\u279f\u2861\u9457\ubb5a\uc405\u65cc\ub1ba\u0eb1\ueefd\u8a8c\u9a98\u01ed\u5cb0\u8ff6\u3ebe\uea09\u6b92\u769b\uee57\uf163\u37f2\u8102\ufbf3\ub10a\u75eb\u488d\u4728\u9100\u80e9\u8c66\u790d\u6c43\u16d9\u602f\u5d43\ub748\ueaab\u065d\ub6bf\u9849\u7993\u8ec4\ubbf1\u3ab4\u9aef\ub703\u9adc\u3038\u3ca6\uedc6\u94f7\uaf96\ucc81\u10e4\u5c42\uf5c8\uac31\u35f1\ub5f4\uab60\u3410\u85f3\u08e5\u3e9e\uf2d3\u9e09\ud944\ufc94\u3262\uc141\ue9b7\u8679\u9fb4\ue4d5\u91bc\ue2e7\uac82\u0d6f\u956b\u4544\udd8d\uf1b3\u782a\u5a6a\ua3e2\u1548\ua2cb\u6991\u4f90\u09b2\u7641\ue80d\u5412\u588e\u5d6a\ua758\ub6ce\ube01\u5a5e\u95f8\uf00c\ue146\u2b05\u4060\ua535\u4dc2\uc8ee\ued01\u60ac\uf305\u8322\ua830\u7eda\ub15a\u0de8\u769a\u69a5\u377c\ue252\u38ea\u4fea\u0aaa\ub0bd\u0e1d\u1cf3\u59c9\ued12\uaddf\u8b93\ub392\u13e7\u1664\u9bcf\uef18\u5808\u3f30\u217e\u61a3\ue461\ud148\u3d65\u1968\ubb38\u5916\u29fb\u2711\u10db\uca45\uce9e\u1c58\u5fba\u00e9\u2de0\u7cb3\ued1d\u03f7\u5b48\u1226\uf8f7\u542c\u4200\u05a1\ua8ae\u9ca7\u4315\u281c\u2cff\u1e71\u94e0\uce14\ua13d\u9932\uc82d\u268c\ubd94\ub3bf\ub1d2\u7550\u3227\u426d\u48c2\ud422\u499d\uf604\ufacf\u987e\u5eab\u3dd4\u4727\ub20f\uc733\ubf71\u7c15\u844d\u7f76\u35f9\ub3af\ue4e7\ubf1f\ued0e\u825f\u6e2f\uec01\udcae\ue02b\u862d\u618b\u0096\uf48d\u9b22\u54df\u0c4a\u025c\uafd8\u8049\u2511\ud9f5\u5971\u8b4b\u41eb\u2428\u6784\ucabe\u26c9\u787d\uf4f1\u07c6\u2bac\ufd73\ud17c\uc6ff\u7d67\u6986\u6019\u9424\u4ec5\u81dc\ua7b7\udc2e\ubf01\u7b27\u2a8d\u5037\u4dae\u4583\u0cd7\u00a7\ueb24\ueec8\u47ef\u67bf\u80e3\u911a\uddfc\u815b\u2ac6\u5864\u0f0c\u2e47\u5b4a\u9525\ua23a\u9810\ud631\u4c3d\u2b22\udeaa\udea4\u2288\ub9c5\u9a81\u2148\u507e\u9c0c\u4a77\ua382\u51ad\u6efd\u03bb\u61ee\uadb5\ubcc1\u224f\u1335\uf7c6\uace8\uffe2\uf821\u2508\u5670\ua852\ud9ef\u8f8e\u3b53\u1304\ufafe\u85bc\ue750\uf055\u280c\uce1d\u9e76\u4918\uffd9\u2c5b\ua012\u5327\ub5ab\u6b39\u2cb6\u9244\ub212\u8b2b\u322e\u5592\ueeae\u934e\u1031\u6ccb\uc61b\u6933\ua8c2\u893a\u7d27\uc137\ub1a1\u788f\u38ac\ua157\ud0be\ubc8b\ua1b4\uf249\u6148\u61f2\u628e\u2c44\u15b8\ua548\u5765\ucf4a\uda3c\u205c\u636b\u7fb1\u7650\u0dcf\u11a4\u68d5\udd37\u3227\u0168\u9dd1\u84b3\u6e49\u11cc\u4148\u80d1\ua222\u1422\u5848\u4253\ubb33\ufd69\uf7d3\uf28b\u926f\u1d41\u2c9c\ua91a\ueaa6\ucc20\u73f6\u2175\ub093\u294e\ufb51\ub9cb\u4c88\u7453\u8795\ub03b\u742b\u2934\u9c78\u0aac\u4e98\uf173\u2851\ue375\u1d71\ub442\ufad9\u5124\u5c90\u5e05\u3a33\ue21e\u9162\u23b6\u3a3e\uc495\ue51f\u256f\u5f47\u9c64\uabeb\u5ec3\ud7af\u1e89\ubc1a\ue614\u13c0\ufe0f\u970d\u72d9\uc951\u6040\u2b35\u5a04\u31e6\ua51b\ud0cc\u164a\udb94\u3852\ufe8f\u9799\u037b\ue47f\u5b7e\uc4cf\u1d83\ubf02\ued3a\ude19\u7704\uacd3\u8608\u458d\u3873\u453d\ucd69\uf943\uffa7\u060e\u5a51\uce5e\u7cda\ucc87\ud2a8\u62f5\ua04a";
                            break block18;
                            var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
                            InventoryCleaner.IlIl[var4_12] = var5_13 ^= var2_10;
                            ** while (true)
lbl38:
                            // 1 sources

                            while (true) {
                                ** GOTO lbl27
                                break;
                            }
                            InventoryCleaner.IllI = var9_3;
                            break block19;
                        }
                        InventoryCleaner.IlI = new String[128];
                        InventoryCleaner.IIIII();
                        InventoryCleaner.l = InventoryCleaner.IlIlI();
                        InventoryCleaner.lII = Set.of(new String[]{"rotten_flesh", "poisonous_potato", "spider_eye", "bowl", "stick", "dead_bush", "wheat_seeds", "beetroot_seeds", "melon_seeds", "pumpkin_seeds", "dandelion", "poppy", "azure_bluet", "oxeye_daisy", "cornflower", "lily_of_the_valley", "orange_tulip", "pink_tulip", "red_tulip", "white_tulip"});
                        return;
lbl48:
                        // 1 sources

                        while (true) {
                            if (var13_7 == 0) {
                                ** continue;
                            }
                            break block15;
                            break;
                        }
                        var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                        var11_5 += var12_6;
                        ** while (true)
                    }
                    var12_6 = var8_2[var10_4] ^ var6;
                    ** while (true)
                }
                var8_2 = "\u3645\u365d\u3641\u3641\u365d\u3641\u3641\u3641\u3659\u3659\u3641\u365d\u3641\u3671\u3645\u3659\u3641\u365d\u3645\u3659\u3659\u3645\u365d\u3641\u3659\u3641\u3641\u3641\u3641\u3659\u3659\u365d\u3645\u3655\u3645\u3641\u3655\u3649\u3645\u3645\u3641\u3659\u365d\u3641\u365d\u3659\u365d\u365d\u365d\u3659\u3656\u365a\u3657\u365b\u3658\u3656\u365b\u365b\u3654\u365c\u365b\u3656\u3654\u3658\u3656\u3654\u365b\u3641\u3645\u3641\u3659\u3641\u3641\u3649\u365d\u3641\u3659\u3641\u3641\u365d\u3649\u3645\u3641\u365d\u3641\u3641\u3659\u3641\u3641\u365d\u3659\u365d\u365d\u365d\u3641\u3641\u3641\u3645\u3641\u365d\u3659\u3659\u3659\u3641\u365d\u365d\u3659\u3659\u3659\u3641\u365d\u3659\u3645\u3655\u364d\u3649\u3641\u364d\u365d\u3641\u3629\u364d\u3649\u3641\u3655\u3659\u3659".toCharArray();
                var9_3 = new String[var8_2.length];
                ** while (true)
                var10_4 = 0;
                var11_5 = 0;
                var12_6 = 0;
                ** while (true)
                var0_8 = "y\u00fd\u00d3 )\u00ef<\u001d\u00dd1\u00eeC\u009eGJj\u00c1\u009a\u0080\u00f0\u009c\u00b5\u00c2\u00b8\u00f3h\u00bd\u0098\u00b2{\u00b0\u0087\u00be\u00f4\u00ffiw\t\u00d8y\u00cc\u00f2\u00b2\u00ea\u00ca\u00bd\u00ea\u00c6\u0098\u00de\u0095\u00b5\u00c6uR,\u00b0\u00b1\u00e4\u00c8K\u00b9\u0082\u00bf\n\u00141-\u000bd\u00aa+\u00c4\u00fej\u0012\u0010w\u0003xw\u000f\u00a7G\u00ef\u00c0\u00c5\u00df\u00a7\u00b9S\u0091=\u0095\u00a0\u00e8\b\u00bf%\u00da\u00fb\u00f2\u0093v\u00847J\u00d8\u00c01\u00dak\u00ce\u00ebM]C\u00de\u00b8\u00e1/\u00b9&\u00cePE\u0084\u008c\u00bb\u00b7\u00b7\u0093\u00be\u00cc[D\u001cm\u00ca\u00b9\u00c5\u008f\u009f2\u0091\u0089\u00fbM\u0086t~\u0001\u0012\u00ee\u0000n\u00cd\u0085\u001b\u00cdN\u0018b\u008d\u0084'\u00d4\u000f\u00fcM\u00bc\u0001\u00d7QBL\u0096}\u00ee?\u0091\u0013\u001f\u00a5\u00bdR\u0089\u009e\u00cfx \u00cc\u00afy\u00e7c\u00bb5\u00f5\u0004a\u0087\u00a6>\u00c7\u00f9'\u00d9\u0098\u0013\u009d\n\u001c5\u0080\u00c6\u00c9\u007f\u008eq\u0015\u008a\u00c6\u00b7\u00fdg\u00b4n'X\u008f\u0081\u0096\u00f7.\u00db\u008f\u0001\u0006kG ;t\u009fdL\u00d6TF\u00ca\u008e\u0014\u001b\u00fd\u00b4\u00ecb-\u00f2#~\u0084\u00deP\u009f\u00fa::\u00d7%Q\u00ad\u00e5\u00c4\u0098\u00fb\u00dc\u0081O\r\u0099o\u00b2\u00f7\u00d3\u00f4\u00ddSfj\u00ea\u0089Z:|\u009bL\u00d8\u00ec\u00b0\u009c\u0017\u00e9\u0018X\u00c1\u00a2\u00ac]\\K>V8Ss~\u001a\u008d\u00bbNv\u00f0r5\u00b6\u00f0\u0092\u00ca\u00f7\u008f\u00f9\u00f42\u00d0\u0017\u009d\u00bb\u00e0\u00e1w\u00f9\u0080ZXJf\u00c2\u00d4\u00a2\u0094\u00bcVo\ndV\u00b5\u000eA\u00eb&\u00c39\u00974\u0018\u00e0|f^T\u0005\u00c6^\u008d\u007f/\u00a3[DSrM\u0004\u00df\u00fa\u008a\u00f0\u00d1\u0082\u008ff\u00a3x ^\u00e3\u00fa\u009bMT\u000f\u00d0\u00eb\u00dc\u00d1\u009d\u00d688\u00c4\u0014\u00e26\u008a\u0014\u0082\u00d9\u0012M\u00c9\u008e\u0093\u0087\u00dd\\;\u00ff42%\u0000\u00aa\u00c9T\u00f3m\u0093!\u00a1K\u009e\u0010\u0014\u001e*0\u00ff\u001d\u00174\u0000\u00f6\u008c\u00ab\u00e9\u00a5\u00d57\u00c1\u00aa\u00f8\u00d4@\r\u008c\u00b9M\u00af\u00ab_\u0089\u00ad\u000eyN\u008b\u00a0j\u00cc\u00ce$$\u0092\u00c1T\u00f8\u00e0m:VW\u00fe\u00dc\u00ceX<\u009c\u00ee\u00d9u%\u00c4F\u00d2\u00fa\b\u00e7;\u009b\u0093-\u00810ON\u00a6\u00cb\u001f`\u000b\u00c91\u008bQ\u0005\u00d5\u00cd\u00cea\r\u0019%\u00b9\u00fa\u0002\u00ec\u0091\u00e9\u0095\u0094\u00c9o\u00db\u0004\u00a2l2\u0091\u0012\u0090s\u00e2p\u00a7\u00d9\u00b6\u00e6D\u00ae\f\u00be\u00db\u00af\u00a9\u00a1\u00b6\u00c1\u00afb\u009dq\u00c7h\u00e9\u0016.B\u00c2=\u00de\u0005\u00d5\u00a8\u00f1k\u00c5\u0019A\u009a\u00eb\u00e4\u0091\u00e2\u0004\u00c0\u00f1\u00d1\u0093\u00f1]Y\u0004\u00f3'\u00fe\u00a8\u001a\u008dX}\u00cc\u00cel\u0004K\u00b0\u00ed\u00da\u001a\u00d9\u00f8\u00a2\u0089\u00f8\u00e7\u00cf\u0003\u008e\u001dC\u0016'\u00d8\u00f7\u00e7\u00ab\u00fe\u0084\u00c6X\u009f\u00e7\u0085\u0083Yea`\u00bc\u00fa\u008c\u0085\u00ec!5\u00c3\u00ce\u00b6\u00de\u0096\u00cc\u00b3L\u00b7\u0013vS\u00f1:\u0093\u00e5\u00ac\u00f2\u0095\u00b1!_\u00fd\u00e4>Y\u00a0\u00d1B\u00bckaw\u001c\u00f5eY\u00a53\u0080V\u0095\u00adyNt4\u00dc'!\u0093\u00e6\u00f08{\u001d\u0016\u0093\tS\u00cf\u0096\u00d1\u00f0\u00cd\u00e9\u008e\u00b5\u00d9{\u00e2\u00d3%\u0018 I\u00d0\u00ff\u001f\u00ba\u0019\u0099\u00fb\u0000\u00f3\u00b7\u001ei\u00aa\u00d6\u00cf\u00ee\u00edQe\u00e9#'\u00dc\u00c2B\b\r R}a\u00c4\u0005A*\u00a0\u0095[\u0018d\u0015Kl\u00c0\u00ab+g\u00a7\u00d84E\u00a9)\u009ag2'C\u00bce\b\u0088\u001e(@\u00d2\u001aL\u0011\u00cf\u00cct.\u000e\u001f\u009d\u00f1\u00de\u00ef\u00d9s8\u008e\u008c\u009b\u00de\u0004\u00e1i\u000f\\\u00d2\u00e0\u0013\u00da(l\u001c\u00d2\u00a1\u001a\u008a\u00f5\u00c6\u00fc\u000b6n\u008d(_Yx\u00b0\u0004\u000f(c\u0016*\u0012\t!\u0099;t1R\u0086\u0018\u009a\u00b1\u00c8lV\u00ae-A|13\u00b1\u00da6\u008f99\u00f3\u00b5\u001a\u00acQ8\u00b3WWEU\u0018\u00dag9\u00bd\u0002s\u00b1\u00b8\u00a3bj\u00b7\u0010w\u00bbY\u00e5\u00f5\u00d5\u0014\u0093qs\u0094\u00ebY\u0089\u0013\u001cP\u0086\u008a\u0080[O\u0081tS\u00b6\u00b8\u008c\tg\u00d6/\u0091`%\u00af@E%\u00d5(\u00f2\u00be(bd\u0015\u00bf\u0000\u00c4\u00cfn\u009a\u0013\u001f\u0099\r&7:\u00ee\u00d7\u0002A'm\u00bb\u00a3\u00be\u0099r\u00fb\u00de\u000fI\u00a2\u000e\u00a9\u0091OR\u00a9\u0098\u008d.\u0007=AwG\u00a4<F\u00e0\u00f3(yI8\u0016\u00f5bH\u00d2\u00d2\u0080/\u00f2I\u0080\u00ca\u0080~\u00a9\u00ccr\u00f3\u0083\u00ff\u00e8L\u00f8\u00da9\u0015&H\u00a2,\u00dc[d\u00c5c\u009eD*^\u00f9\u00a2\u00c8\u00af\u0089\u00b2N\u00f899S6G\u00ab\u00de\u00eb\u00c4\u00cc{6\u00d7z\u0006\u00d8\u00c8\u00dcu\u000b\u00a0\u0003\u0002\u00e8\u0098\u0015\u0087\u00b5\u00a9\u0016r\u001b\u00b57\u000fw\u00008m\u009e\u00f1\u00fa\u0005]\u0096\u00c5u\u0015\u0012\u0080\u00f0E\u008a\u00ae'\u00cd\u0006\u0017]~P8\u0017`Y5\u00ea\u00ccE\u009a\u0080\u0014\u00ed\u00ba\u0011+\u00df8[\u0099\ng\u009a\u00812\u0000~\u00dau\n\u00b7~\u00d8\u00fc\u00027\u0086l\u0016m\u00d0\u00a1:\u009f \u008a\u00e8\u0080(~\u00c3[t7l\u0084\u00e3\u00bf\u00af\u00a6Q\u007f\u00a2\u0096F~\u00f5\u0000\u00e6,\u00b6\u00ee\u00c6\u008dP\b{N\u00b3\u007f\u00a6\u00b9\u00f0\u00d5;\u000b\u0017\u0086\u00d4\u0082\u00d9\u00b4g\u00db/Y\u00eb\u00bd\bb_}\u0085\u008fa\u00e5iZS\u0093K\u001c\u0019\u00df\u00150\u001a\u0001\u0007\u00db\u00e8\u00d4\u001c\u00b8\u00f1\u00b7\u0092\u001c\u0085A\u00a2t\u00fd\u00f4\\\u000b\u0010\u0086\u00ed\u0096\u009f(\u0084\u00a3\u0013npSY\u00bc\u009a\u00e8Z}{\u008f\u0095\u00b5\u00b6\u0085\u00d59\u00e7W@\u001eO32Q\u0083\u00a8*\u00d2r\u00b2\u00de$\u0007K\u0091\u00de\u0010\u00ea\u00ad\u000et\u00b0\u00827\u00b93\u00a8\u0087.7\u00d7\u00caXnz$\u00c0\\\u00f2\u00ac\u00bb\u00da>\u00149\u008f\u00d0\u008e\u00cc\u00adc\u00f6]\u0096\u0002\u00fbh\u00c5\u00a6\u000e\u00a24\u00d6\u00a0\u00bc\u0001X\u00a9\u00d0\u0084:,Q\u0019j\u00c1\u009bi\u0012\u001a\u00b9\u00fd\u00f6\u00d7\u009b3\t\u0010hQ\u00c7\u00b7\"\u0016I\u000e\u00bbA\u00bd\u00fcX\u0017\u00c9\u00b7\u0089E\u00168\u00b56\u00f2\u00d3\r0WX\u00ad\u00e0\u0080ov\u001aA\u0095\u00d7\u00f8\u00a1\"\u0088\u00e1\u00ddP\u00c3\u00b1\u001f\u0083\u00f4\u0097b\u00e8l\f\u00bb\u00d2\u001d\u001f\u007f\u0094\u000eV:o\u008a\u007f?7\u00fa\u001ew]N.\u00b9\u008a\u0087\u00cd\u00e1\u0005\u00b5\u0081i\u00c7\u00e9Q\"\u001cBv\u0085\u00cd\u00fby\u00dd\u001b0gd\u00a0\u000f\u00e9\u0002\u00b7Z\u001a\u00a0\u0000\u00f5\"\u00ce^\u0093\u008f\u00df\u00f9\u000bX\u00de\u0081\u0091\u007fn\u0090\u0000}\u00eb\u00ad\u00a1\u00fb\u00ed=\u00fa\u00ccZ|N>\u00121\u000b\u001b\u009f\u008b\u0091\u00d7K1\u0010\u0017\u00e0\u00c0}\u0005\u00bd\u00f4c\u009d\u007fw\u00e2\u00a9\u00b3R\u00fc\u0097\u0089\t6k\u00d5Y\u0099\u00a1\u00f7\u00eb\u00c2\u001e\u009f2m\u00bd\u000f)#\u00fa\u00d2S2\u0086\u00e4z>$\u000f\u00f7/\u00bc\u00d3\u00f3\u00167\u0081\u0087\u0003\u00ec\u00f4\r\u0099\u00afH\u0097 \u00cc\u00e6\u00b7\u00fc*&{E\u00ed\u00a5\u00bd\u0011\u001eD\u00a0Q\u00c0\n\u009e\u00a0\u00de\u00ed\u00f4\u00ab`'#G(\u00ac|~\u00ca{\u00bd\u008fV\u00ed\u008a?kncq5)\u0007\u000b\u00f4|l{\t\u00cea\u00a3\u0084Nc\u00d4\u00f6\u007fl\u00a7\"b\u00b4_T\u00ef#I\u0000o#\u00c9\u009f7\u00c5\u0012l\u0094\u00e0\u0085\u00e9\u0093\u00b0e\u00a1\u0015O\u00e8J\u00fdI6/\u00ee<b\u0006\u0018O\r\u0011\u00b6\u001b\u00f8\u00bc7E\u00cf\u00ecSk\u009cE4\u0002\u000f\u00d5\f\u0083z>Z?b\u00ec\u00d8\u0089\u0086\u00fbtk\u001a\u0094\u00c7\u001boDN\u0001\u001d\u00d8\u00031\u0015\u0005\u00ca\u00aa\u00e3\u00c5\u00f9\u0003n\u00ed\u00079a\u00d7f\u0007\u008b\u0018\u0000f\u007f\u00aa\r\u00c6Z\u00cf\u001d\"\u0093\u00aa\u00cf\u00e8\u00d1\u009d\u00a7\u00d1\u00cb\u00fdD\u0000\u009b\u0096\r\u00ee\u00fa\u00bc4\u00e0\u0089u=\u00eaC\u00b6\u0011\n\u00d7\u0098\u00ec*\u00b6G\u0004\u00e3\u009c\u0003\u0088T\u00888".getBytes("ISO-8859-1");
                var1_9 = var0_8.length / 4;
                ** while (true)
            }
            InventoryCleaner.Illl = new Object[var9_3.length];
            var2_10 = -876251356;
            ** while (true)
        }
        var13_7 = 0;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.player.playerScreenHandler == null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    private String IIlIl(ItemStack itemStack) {
        return Registries.ITEM.getId((Object)itemStack.getItem()).toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    private String IIllI(String string) {
        if (string.equals("elytra")) {
            return "armor:elytra";
        }
        if (string.equals("turtle_helmet")) return "armor:head";
        if (!string.endsWith("_helmet")) {
            if (string.endsWith("_chestplate")) {
                return "armor:chest";
            }
            if (string.endsWith("_leggings")) {
                return "armor:legs";
            }
        } else {
            return "armor:head";
        }
        if (!string.endsWith("_boots")) return null;
        return "armor:feet";
    }

    @Override
    public void llll() {
        this.lll = 0L;
        this.Ill = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlll(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity, int n) {
        if (InventoryCleaner.Illl(n)) return false;
        if (n < 0) return false;
        if (n < clientPlayerEntity.playerScreenHandler.slots.size()) {
            if (((Slot)clientPlayerEntity.playerScreenHandler.slots.get(n)).getStack().isEmpty()) {
                return false;
            }
        } else {
            return false;
        }
        minecraftClient.interactionManager.clickSlot(clientPlayerEntity.playerScreenHandler.syncId, n, 1, SlotActionType.THROW, (PlayerEntity)clientPlayerEntity);
        return clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIII(MinecraftClient minecraftClient) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) {
            return false;
        }
        ChestStealer chestStealer = clientEntrypoint.IlI().IIII();
        if (chestStealer == null) return false;
        if (!chestStealer.IlI(minecraftClient)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIIl(ItemStack itemStack) {
        if (itemStack.isEmpty()) return false;
        if (!lII.contains(InventoryCleaner.IIlI(itemStack))) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int[] IlIlI() {
        int n = 41;
        int[] nArray = new int[n];
        int n2 = 0;
        nArray[n2++] = 5;
        nArray[n2++] = 6;
        nArray[n2++] = 7;
        nArray[n2++] = 8;
        int n3 = 9;
        while (n3 < 36) {
            nArray[n2++] = n3++;
        }
        n3 = 0;
        while (true) {
            if (n3 >= 9) {
                nArray[n2] = 45;
                return nArray;
            }
            nArray[n2++] = 36 + n3;
            ++n3;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IllII(MinecraftClient minecraftClient) {
        if (minecraftClient.currentScreen != null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlllI(ItemStack itemStack) {
        if ((Boolean)this.ll.lIl() != false) return false;
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) {
            return false;
        }
        if (itemStack.getComponentChanges().get(DataComponentTypes.CUSTOM_MODEL_DATA) != null) return true;
        if (itemStack.getComponentChanges().get(DataComponentTypes.ITEM_MODEL) != null) return true;
        return false;
    }

    private static int Illll(int n, int n2) {
        return IlIl[n ^ 0xFF2BE71] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIIIl(int n, int n2, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = c ^ 0xBBFF;
        char[] cArray = IllI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Illl[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            InventoryCleaner.Illl[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x52EB;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] ^ 0x4D0D;
            n7 += 17875;
            n7 -= 28577;
            n7 -= 48847;
            cArray[n6] = (char)((n7 -= 33730) ^ n4 ^ n ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

