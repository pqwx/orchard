/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIIll
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Only Inventory Open
 *   - Action Batches
 *   - Only No Screen
 *   - Use XCarry
 *   - Slot Mode
 *   - .getBytes(
 *   - Threshold
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
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.ingame.InventoryScreen
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.item.PotionItem
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 */
package orchard.internal;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.PotionItem;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IlIIIIlII;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlIllll;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
abstract class IIIlIIll
extends ModuleBase {
    private final llIll l;
    private int II = Integer.MIN_VALUE;
    private final IIIIIIIIl<IlIIIIlII> Il;
    private long lI;
    private boolean ll;
    private int III = -1;
    private int IIl = -1;
    private final IIIlIlIIl IlI;
    private boolean Ill;
    private int lII;
    private final lIlIIlI lIl;
    private final ItemStack[] llI = new ItemStack[9];
    private final lIlIIlI lll;
    private long IIII;
    private final llIll IIIl;
    private final lIlIllll IIlI;
    private static String[] IIll;
    private static final int IlII = 9;
    private boolean IlIl;
    private final llIll IllI;
    private static final int Illl = 36;
    private final int[] lIII = new int[9];
    private static final int[] lIlI;
    private static final String[] llIl;
    private static final Object[] lllI;

    private int lI() {
        return Math.max(1, Math.min(9, (int)Math.round((Double)this.lll.lIl())));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIl(MinecraftClient minecraftClient) {
        boolean bl;
        switch ((IlIIIIlII)((Object)this.Il.lIl())) {
            default: {
                throw new MatchException(null, null);
            }
            case I: {
                bl = orchard.internal.IIlI.IlII(minecraftClient);
                return bl;
            }
            case II: {
                bl = orchard.internal.IIlI.IllI(minecraftClient);
                return bl;
            }
            case Il: 
        }
        bl = orchard.internal.IIlI.l(minecraftClient);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(MinecraftClient minecraftClient, ItemStack itemStack, int n) {
        if (!itemStack.isEmpty()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (!(minecraftClient.currentScreen instanceof InventoryScreen)) return false;
        if (this.IlIl) return false;
        if (n < 0) return false;
        if (n >= 9) return false;
        if (this.lIII[n] < minecraftClient.player.age) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void III() {
        block76: {
            block75: {
                block78: {
                    block85: {
                        block45: {
                            block81: {
                                block74: {
                                    block48: {
                                        block55: {
                                            block68: {
                                                block63: {
                                                    block70: {
                                                        block80: {
                                                            block50: {
                                                                block52: {
                                                                    block84: {
                                                                        block66: {
                                                                            block72: {
                                                                                block82: {
                                                                                    block83: {
                                                                                        block62: {
                                                                                            block67: {
                                                                                                block59: {
                                                                                                    block73: {
                                                                                                        block51: {
                                                                                                            block71: {
                                                                                                                block47: {
                                                                                                                    block49: {
                                                                                                                        block69: {
                                                                                                                            block58: {
                                                                                                                                block46: {
                                                                                                                                    block64: {
                                                                                                                                        block79: {
                                                                                                                                            block56: {
                                                                                                                                                block65: {
                                                                                                                                                    block54: {
                                                                                                                                                        block77: {
                                                                                                                                                            block60: {
                                                                                                                                                                block61: {
                                                                                                                                                                    block57: {
                                                                                                                                                                        block53: {
                                                                                                                                                                            var1_1 = MinecraftClient.getInstance();
                                                                                                                                                                            if (var1_1.player == null) break block77;
                                                                                                                                                                            break block78;
lbl4:
                                                                                                                                                                            // 2 sources

                                                                                                                                                                            while (true) {
                                                                                                                                                                                var5_3 = this.lIIIl(var1_1, var4_2, this.IIl, this.III);
                                                                                                                                                                                this.lI = System.currentTimeMillis();
                                                                                                                                                                                this.IIII = this.IlIIl();
                                                                                                                                                                                if (!this.IlIl) break block45;
                                                                                                                                                                                break block46;
                                                                                                                                                                                break;
                                                                                                                                                                            }
lbl10:
                                                                                                                                                                            // 1 sources

                                                                                                                                                                            return;
lbl12:
                                                                                                                                                                            // 1 sources

                                                                                                                                                                            while (true) {
                                                                                                                                                                                if (var6_8 != 0) break block47;
                                                                                                                                                                                break block48;
                                                                                                                                                                                break;
                                                                                                                                                                            }
lbl15:
                                                                                                                                                                            // 1 sources

                                                                                                                                                                            while (true) {
                                                                                                                                                                                var8_12 = var4_2.getInventory().getStack(var7_10);
                                                                                                                                                                                if (!this.IlI(var1_1, var8_12, var7_10)) break block49;
                                                                                                                                                                                break block50;
                                                                                                                                                                                break;
                                                                                                                                                                            }
lbl19:
                                                                                                                                                                            // 1 sources

                                                                                                                                                                            while (true) {
                                                                                                                                                                                v0 = true;
                                                                                                                                                                                break block51;
                                                                                                                                                                                break;
                                                                                                                                                                            }
lbl22:
                                                                                                                                                                            // 1 sources

                                                                                                                                                                            while (true) {
                                                                                                                                                                                if (var4_2.age >= this.II) break block52;
                                                                                                                                                                                break block53;
                                                                                                                                                                                break;
                                                                                                                                                                            }
lbl25:
                                                                                                                                                                            // 1 sources

                                                                                                                                                                            return;
lbl27:
                                                                                                                                                                            // 1 sources

                                                                                                                                                                            return;
                                                                                                                                                                        }
                                                                                                                                                                        return;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            if (var1_1.player.playerScreenHandler.getCursorStack().isEmpty()) break block54;
                                                                                                                                                                            break block55;
                                                                                                                                                                            break;
                                                                                                                                                                        }
lbl34:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        return;
lbl36:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            if (!((Boolean)this.l.lIl()).booleanValue()) break block56;
                                                                                                                                                                            break block57;
                                                                                                                                                                            break;
                                                                                                                                                                        }
lbl39:
                                                                                                                                                                        // 6 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            ++var6_9;
                                                                                                                                                                            break block58;
                                                                                                                                                                            break;
                                                                                                                                                                        }
lbl42:
                                                                                                                                                                        // 2 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            v0 = false;
                                                                                                                                                                            break block51;
                                                                                                                                                                            break;
                                                                                                                                                                        }
lbl45:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (var5_4 = var1_1.currentScreen instanceof InventoryScreen) {
                                                                                                                                                                            break block59;
                                                                                                                                                                        }
                                                                                                                                                                        break block79;
lbl48:
                                                                                                                                                                        // 1 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            ++var6_8;
                                                                                                                                                                            break block50;
                                                                                                                                                                            break;
                                                                                                                                                                        }
lbl51:
                                                                                                                                                                        // 2 sources

                                                                                                                                                                        while (true) {
                                                                                                                                                                            if (var6_8 <= 0) break block60;
                                                                                                                                                                            break block61;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    if (var1_1.currentScreen == null) break block56;
                                                                                                                                                                    break block80;
lbl57:
                                                                                                                                                                    // 1 sources

                                                                                                                                                                    while (true) {
                                                                                                                                                                        if (var1_1.currentScreen instanceof InventoryScreen) break block62;
                                                                                                                                                                        break block63;
                                                                                                                                                                        break;
                                                                                                                                                                    }
lbl60:
                                                                                                                                                                    // 1 sources

                                                                                                                                                                    return;
                                                                                                                                                                }
                                                                                                                                                                this.lI = System.currentTimeMillis();
                                                                                                                                                                this.IIII = this.IlIIl();
                                                                                                                                                                break block60;
lbl66:
                                                                                                                                                                // 1 sources

                                                                                                                                                                while (true) {
                                                                                                                                                                    this.IIlI(var1_1);
                                                                                                                                                                    break block45;
                                                                                                                                                                    break;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            return;
lbl71:
                                                                                                                                                            // 1 sources

                                                                                                                                                            while (true) {
                                                                                                                                                                this.IIlIl();
                                                                                                                                                                return;
                                                                                                                                                            }
lbl74:
                                                                                                                                                            // 1 sources

                                                                                                                                                            while (true) {
                                                                                                                                                                var7_11 = var4_2.getInventory().getStack(var6_9);
                                                                                                                                                                var8_13 = this.IIlII(var6_9, var7_11);
                                                                                                                                                                if (var8_13.isEmpty()) ** GOTO lbl39
                                                                                                                                                                break block64;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                        }
lbl80:
                                                                                                                                                        // 3 sources

                                                                                                                                                        while (true) {
                                                                                                                                                            this.IIlIl();
                                                                                                                                                            this.ll = false;
                                                                                                                                                            this.lII = 0;
                                                                                                                                                            return;
                                                                                                                                                        }
lbl85:
                                                                                                                                                        // 1 sources

                                                                                                                                                        while (true) {
                                                                                                                                                            if (!this.IlIl) ** GOTO lbl42
                                                                                                                                                            break block65;
                                                                                                                                                            break;
                                                                                                                                                        }
lbl88:
                                                                                                                                                        // 1 sources

                                                                                                                                                        while (true) {
                                                                                                                                                            if (!this.Illll(var8_13)) ** GOTO lbl39
                                                                                                                                                            break block66;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    if (System.currentTimeMillis() - this.lI >= this.IIII) ** GOTO lbl45
                                                                                                                                                    ** while (true)
lbl94:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (true) {
                                                                                                                                                        if (var3_6) break block67;
                                                                                                                                                        break block68;
                                                                                                                                                        break;
                                                                                                                                                    }
lbl97:
                                                                                                                                                    // 1 sources

                                                                                                                                                    while (!(var1_1.currentScreen instanceof InventoryScreen)) {
                                                                                                                                                        ** continue;
lbl99:
                                                                                                                                                        // 1 sources

                                                                                                                                                        ** GOTO lbl71
                                                                                                                                                    }
                                                                                                                                                    break block74;
                                                                                                                                                }
                                                                                                                                                if (var1_1.currentScreen instanceof InventoryScreen) ** break;
                                                                                                                                                ** while (true)
                                                                                                                                                ** while (true)
lbl105:
                                                                                                                                                // 1 sources

                                                                                                                                                return;
lbl107:
                                                                                                                                                // 1 sources

                                                                                                                                                while (true) {
                                                                                                                                                    this.IllII(var1_1, var1_1.player);
                                                                                                                                                    return;
                                                                                                                                                }
lbl110:
                                                                                                                                                // 1 sources

                                                                                                                                                return;
lbl112:
                                                                                                                                                // 1 sources

                                                                                                                                                return;
lbl114:
                                                                                                                                                // 1 sources

                                                                                                                                                while (true) {
                                                                                                                                                    if (var1_1.world != null) break block69;
                                                                                                                                                    ** GOTO lbl80
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                            }
lbl118:
                                                                                                                                            // 3 sources

                                                                                                                                            while (true) {
                                                                                                                                                if (var1_1.currentScreen == null) break block67;
                                                                                                                                                break block70;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        var6_9 = 0;
                                                                                                                                        break block58;
lbl124:
                                                                                                                                        // 1 sources

                                                                                                                                        while (true) {
                                                                                                                                            if (var3_7.IIlll()) {
                                                                                                                                                ** continue;
                                                                                                                                            }
                                                                                                                                            break block71;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (!this.IIIIl(var7_11, var8_13)) ** GOTO lbl39
                                                                                                                                    ** while (true)
lbl131:
                                                                                                                                    // 1 sources

                                                                                                                                    while (true) {
                                                                                                                                        var10_16 = this.IlIll(var4_2, var9_14);
                                                                                                                                        if (var10_16 >= 0) break block72;
                                                                                                                                        break block50;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (var5_3) {
                                                                                                                                    ** continue;
                                                                                                                                }
                                                                                                                                break block45;
                                                                                                                            }
                                                                                                                            ** while (var6_9 >= 9)
lbl141:
                                                                                                                            // 1 sources

                                                                                                                            ** while (true)
                                                                                                                        }
                                                                                                                        var2_5 = ClientEntrypoint.lII();
                                                                                                                        if (var2_5 == null) break block71;
                                                                                                                        break block81;
                                                                                                                    }
                                                                                                                    var9_14 = this.IIlII(var7_10, var8_12);
                                                                                                                    if (var9_14.isEmpty()) break block50;
                                                                                                                    break block82;
lbl150:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        if (this.lll(var1_1)) ** GOTO lbl4
                                                                                                                        break block73;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
                                                                                                                ** while (this.lIIIl((MinecraftClient)var1_1, (ClientPlayerEntity)var4_2, (int)var10_16, (int)var11_18))
lbl155:
                                                                                                                // 1 sources

                                                                                                                ** while (true)
                                                                                                            }
lbl157:
                                                                                                            // 2 sources

                                                                                                            while (true) {
                                                                                                                if (!((Boolean)this.IllI.lIl()).booleanValue()) break block74;
                                                                                                                ** GOTO lbl97
                                                                                                                break;
                                                                                                            }
lbl160:
                                                                                                            // 1 sources

                                                                                                            while (!this.lll(var1_1)) {
                                                                                                                ** continue;
lbl162:
                                                                                                                // 1 sources

                                                                                                                ** GOTO lbl112
                                                                                                            }
                                                                                                            break block83;
                                                                                                            while (true) {
                                                                                                                var10_17 = 36 + var6_9;
                                                                                                                if (!((Boolean)this.IllI.lIl()).booleanValue()) ** GOTO lbl160
                                                                                                                ** GOTO lbl39
                                                                                                                break;
                                                                                                            }
                                                                                                        }
                                                                                                        var3_6 = v0;
                                                                                                        if (((Boolean)this.IllI.lIl()).booleanValue()) ** GOTO lbl118
                                                                                                        ** while (true)
                                                                                                    }
                                                                                                    return;
                                                                                                }
                                                                                                var6_8 = 0;
                                                                                                var7_10 = 0;
                                                                                                break block84;
                                                                                            }
lbl179:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                var4_2 = var1_1.player;
                                                                                                this.lIll(var4_2);
                                                                                                if (!this.IIIlI()) ** continue;
                                                                                                break block75;
                                                                                                break;
                                                                                            }
                                                                                        }
lbl185:
                                                                                        // 2 sources

                                                                                        while (true) {
                                                                                            if (!this.Ill) ** break;
                                                                                            ** continue;
                                                                                            ** continue;
                                                                                            break;
                                                                                        }
                                                                                    }
                                                                                    this.lIIl(var9_15, var10_17, var4_2, var1_1);
                                                                                    return;
lbl192:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        if ((var9_15 = this.IlIll(var4_2, var8_13)) >= 0) ** continue;
                                                                                        ** GOTO lbl39
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                if (!this.IIIIl(var8_12, var9_14)) break block50;
                                                                                break block85;
                                                                            }
                                                                            var11_18 = 36 + var7_10;
                                                                            ** while (this.lll((MinecraftClient)var1_1))
lbl201:
                                                                            // 1 sources

                                                                            ** while (true)
                                                                        }
                                                                        ** while (this.IlllI((ItemStack)var8_13))
lbl204:
                                                                        // 1 sources

                                                                        ** while (true)
                                                                    }
lbl206:
                                                                    // 2 sources

                                                                    while (true) {
                                                                        if (var7_10 >= 9) ** GOTO lbl51
                                                                        break block76;
                                                                        break;
                                                                    }
                                                                }
                                                                ** while (this.lll((MinecraftClient)var1_1))
lbl211:
                                                                // 1 sources

                                                                ** while (true)
                                                            }
lbl213:
                                                            // 2 sources

                                                            while (true) {
                                                                ++var7_10;
                                                                ** continue;
                                                                break;
                                                            }
                                                        }
                                                        if (!var3_6) ** break;
                                                        ** while (true)
                                                        ** while (true)
                                                    }
                                                    ** while (var1_1.currentScreen instanceof InventoryScreen)
lbl222:
                                                    // 1 sources

                                                    ** while (true)
                                                }
                                                this.IIlIl();
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    this.lIIl(var10_16, var11_18, var4_2, var1_1);
                                    return;
                                }
                                ** while (!this.IIlll())
lbl235:
                                // 1 sources

                                ** while (true)
                            }
                            ** while ((var3_7 = var2_5.IlI().lllIll()) == null)
lbl238:
                            // 1 sources

                            ** while (true)
                        }
                        this.IIlIl();
                        return;
                    }
                    ** while (this.Illll((ItemStack)var9_14))
lbl244:
                    // 1 sources

                    ** while (true)
                }
                if (var1_1.interactionManager != null) ** break;
                ** while (true)
                ** while (true)
            }
            ** while (!this.Ill)
lbl251:
            // 1 sources

            ** while (true)
        }
        ** while (var1_1.player.playerScreenHandler.getCursorStack().isEmpty())
lbl254:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private boolean lIl(MinecraftClient var1_1, ClientPlayerEntity var2_2) {
        block10: {
            block9: {
                block7: {
                    block6: {
                        block5: {
                            block8: {
                                var3_3 = 0;
                                break block8;
lbl3:
                                // 1 sources

                                while (this.IIIIl(var4_4, var5_5)) {
                                    break block5;
                                }
                                break block9;
                            }
lbl7:
                            // 2 sources

                            while (true) {
                                if (var3_3 >= 9) break block6;
                                break block7;
                                break;
                            }
                        }
                        if (this.Illll(var5_5)) break block10;
                        break block9;
                    }
                    return false;
lbl15:
                    // 1 sources

                    return true;
lbl17:
                    // 1 sources

                    while (!(var5_5 = this.IIlII(var3_3, var4_4)).isEmpty()) {
                        ** GOTO lbl3
                    }
                    break block9;
                }
                var4_4 = var2_2.getInventory().getStack(var3_3);
                if (!this.IlI(var1_1, var4_4, var3_3)) ** GOTO lbl17
            }
lbl24:
            // 2 sources

            while (true) {
                ++var3_3;
                ** continue;
                break;
            }
        }
        ** while (this.IlIll((ClientPlayerEntity)var2_2, (ItemStack)var5_5) < 0)
lbl29:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lll(MinecraftClient minecraftClient) {
        boolean bl;
        boolean bl2 = bl = minecraftClient != null && minecraftClient.currentScreen instanceof InventoryScreen;
        if (this.IIlll()) {
            if (this.Il.lIl() == IlIIIIlII.II) {
                if (orchard.internal.IIlI.IllI(minecraftClient)) {
                    orchard.internal.IIlI.Illl(minecraftClient);
                    return true;
                }
                return false;
            }
        } else {
            if (!orchard.internal.IIlI.IIll(minecraftClient)) {
                return false;
            }
            if (!bl && !orchard.internal.IIlI.lllI(minecraftClient)) {
                return false;
            }
            if (!orchard.internal.IIlI.II(minecraftClient)) {
                return false;
            }
            orchard.internal.IIlI.Illl(minecraftClient);
            return true;
        }
        if (!this.llII(minecraftClient)) return false;
        if (this.IIl(minecraftClient)) {
            orchard.internal.IIlI.Illl(minecraftClient);
            return true;
        }
        return false;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private boolean IIII(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity) {
        int n;
        ItemStack itemStack;
        ItemStack itemStack2;
        int n2 = 0;
        boolean bl = true;
        do {
            if (!bl || (bl = false) || !true) {
                ++n2;
            }
            if (n2 < 9) continue;
            return false;
        } while (this.IlI(minecraftClient, itemStack2 = clientPlayerEntity.getInventory().getStack(n2), n2) || (itemStack = this.IIlII(n2, itemStack2)).isEmpty() || !this.IIIIl(itemStack2, itemStack) || !this.Illll(itemStack) || (n = this.IlIll(clientPlayerEntity, itemStack)) < 0);
        this.lIIl(n, 36 + n2, clientPlayerEntity, minecraftClient);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlI(MinecraftClient minecraftClient) {
        if (!this.IlIl) {
            return;
        }
        if (minecraftClient != null && minecraftClient.currentScreen instanceof InventoryScreen) {
            minecraftClient.setScreen(null);
        }
        this.IlIl = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIII(ItemStack itemStack, ItemStack itemStack2) {
        if (!ItemStack.areItemsAndComponentsEqual((ItemStack)itemStack, (ItemStack)itemStack2)) return false;
        if (itemStack.getCount() <= 0) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIl(int n, int n2, ClientPlayerEntity clientPlayerEntity, MinecraftClient minecraftClient) {
        this.IIl = n;
        this.III = n2;
        this.II = clientPlayerEntity.age + 1;
        this.Ill = true;
        if (this.Il.lIl() == IlIIIIlII.II) {
            orchard.internal.IIlI.IlIl(minecraftClient);
            return;
        }
        if (this.Il.lIl() != IlIIIIlII.Il) return;
        orchard.internal.IIlI.I(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlI(ItemStack itemStack) {
        if (itemStack.getItem() instanceof PotionItem) return false;
        if (this.IIIll(itemStack)) return false;
        if (itemStack.isOf(Items.TNT_MINECART)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private void lIll(ClientPlayerEntity var1_1) {
        var2_2 = 0;
        while (true) {
            block6: {
                block4: {
                    block3: {
                        block5: {
                            if (var2_2 >= 9) {
                                return;
                            }
                            var3_3 = var1_1.getInventory().getStack(var2_2);
                            if (var3_3.isEmpty()) break block4;
                            break block5;
lbl8:
                            // 1 sources

                            while (this.lIII[var2_2] == -2147483648) {
                                break block3;
                            }
                            break block6;
                        }
                        this.llI[var2_2] = var3_3.copy();
                        this.lIII[var2_2] = -2147483648;
                        break block6;
                    }
                    this.lIII[var2_2] = var1_1.age;
                    break block6;
                }
                if (!this.llI[var2_2].isEmpty()) ** GOTO lbl8
            }
            ++var2_2;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean llII(MinecraftClient minecraftClient) {
        boolean bl;
        switch ((IlIIIIlII)((Object)this.Il.lIl())) {
            default: {
                throw new MatchException(null, null);
            }
            case I: {
                bl = orchard.internal.IIlI.Il(minecraftClient);
                return bl;
            }
            case II: {
                return true;
            }
            case Il: 
        }
        bl = orchard.internal.IIlI.lIII(minecraftClient);
        return bl;
    }

    @Override
    public void llll() {
        this.IIlI(MinecraftClient.getInstance());
        this.IIlIl();
        this.ll = false;
        this.lII = 0;
        this.IIII = 0L;
        this.IIllI();
    }

    private void llIl(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity) {
        if (minecraftClient.currentScreen instanceof InventoryScreen) {
            this.IlIl = false;
            return;
        }
        minecraftClient.setScreen((Screen)new InventoryScreen((PlayerEntity)clientPlayerEntity));
        this.IlIl = true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int lllI(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity) {
        int n = 0;
        int n2 = 0;
        while (n2 < 9) {
            ItemStack itemStack;
            ItemStack itemStack2 = clientPlayerEntity.getInventory().getStack(n2);
            if (!this.IlI(minecraftClient, itemStack2, n2) && !(itemStack = this.IIlII(n2, itemStack2)).isEmpty() && this.IIIIl(itemStack2, itemStack) && this.Illll(itemStack) && this.IlIll(clientPlayerEntity, itemStack) >= 0) {
                ++n;
            }
            ++n2;
        }
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIII(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity) {
        this.lIll(clientPlayerEntity);
        if (!clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty()) {
            return;
        }
        this.ll = false;
        this.lII = 0;
        if (System.currentTimeMillis() - this.lI < this.IIII) {
            return;
        }
        if (!this.lIl(minecraftClient, clientPlayerEntity)) {
            return;
        }
        if (!orchard.internal.IIlI.IlI(minecraftClient)) {
            return;
        }
        int n = 0;
        int n2 = 0;
        while (n2 < 9 && clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty()) {
            int n3;
            ItemStack itemStack;
            ItemStack itemStack2 = clientPlayerEntity.getInventory().getStack(n2);
            if (!this.IlI(minecraftClient, itemStack2, n2) && !(itemStack = this.IIlII(n2, itemStack2)).isEmpty() && this.IIIIl(itemStack2, itemStack) && this.Illll(itemStack) && (n3 = this.IlIll(clientPlayerEntity, itemStack)) >= 0) {
                if (!this.lIIIl(minecraftClient, clientPlayerEntity, n3, 36 + n2)) break;
                ++n;
            }
            ++n2;
        }
        if (n > 0) {
            this.lI = System.currentTimeMillis();
            this.IIII = this.IlIIl();
            orchard.internal.IIlI.Illl(minecraftClient);
        }
        orchard.internal.IIlI.lII(minecraftClient);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 3040;
        var7_3 = "\u81c5\ubd79\u32b8\u6e50\u4de3\u2e22\u8d1f\uc83e\ubad4\u31cb\u26f3\u1801\ufeec\ud78a\u10c0\u95d1\u9b95\u9f16\ub194\u281f\u6ab0\u8f89\ue57c\u4d25\u2264\uece1\uabe4\u1414\u41cd\u8dee\ua3bc\u0f82\u1cc4\u2f1b\u57ae\uc01e\u5264\u8aed\u81ad\u255f\ude20\uc9e8\u6f5a\ue6c0\uc4f0\u8c7b\u124b\u3095\u927c\u6c50\ueee1\uc790\u819d\uc412\ua00c\ubdb2\u1b90\u0cda\u0e00\u53af\uf683\ud047\ud361\uf0d6\uaaa2\u921c\u7be5\ucf99\uefe8\u8ac7\u89f2\u84ed\u185b\u44a0\u2e89\ue080\u0471\ua5ac\uf305\u33d4\u293e\uab62\ud7c5\u36ae\u4b20\ud0ac\u6568\u2504\u87d9\u1ae2\ua875\u91a9\u59b9\u76ec\uf379\ub899\uf291\uc017\ude57\u895a\u461f\u0a22\uc257\u802b\u9fef\u5cc8\uf0ed\u3bb7\u29fb\ue968\ueeaf\uc7de\u9de9\u9ed3\udc67\u52aa\u2f43\u2dcb\u38c3\u0d8a";
        var8_4 = "\u001c\b\f\u0010\u0014\u0014\u0004\f".toCharArray();
        var9_5 = new String[var8_4.length];
        var13_9 = -1;
        if (true) ** GOTO lbl13
        while (true) {
            block10: {
                block11: {
                    if (var15_11 < var14_10.length) break block10;
                    var9_5[var10_6] = new String(var14_10).intern();
                    var11_7 += var12_8;
                    if (++var10_6 < var8_4.length) break block11;
                    var13_9 = 0;
lbl13:
                    // 2 sources

                    var10_6 = 0;
                    var11_7 = 0;
                    var12_8 = '\u0000';
                    if (var13_9 == 0) break;
                }
                var12_8 = var8_4[var10_6];
                var14_10 = var7_3.substring(var11_7, var11_7 + var12_8).toCharArray();
                var15_11 = 0;
            }
            switch (var15_11 % 5) {
                case 1: {
                    v0 = 10;
                    break;
                }
                default: {
                    v0 = 54;
                    break;
                }
                case 3: {
                    v0 = 37;
                    break;
                }
                case 2: {
                    v0 = 101;
                    break;
                }
                case 4: {
                    v0 = 98;
                }
            }
            var16_1 = v0;
            v1 = var15_11++;
            var14_10[v1] = (char)(var14_10[v1] ^ var16_1 ^ var6);
        }
        IIIlIIll.llIl = var9_5;
        IIIlIIll.lllI = new Object[var9_5.length];
        var2_2 = 1098135475;
        var0_12 = "^{\u00d0\u00ec\u00d6\u001eM\u00f0\u00c3\u00dd\u00e8_\f\u001f\u0085\u00e1\u008aM\u00a1e\u00bb\u00c3\u00ddl30T\u00a9\u009f\u009f\u00deeR\u00aa\u009d\u00b2Xj\u00ae\u00c0\u00df\u00c5\u00ed\u0083)\u0094\u00e9\u00c8\u00eal\u00d3\u00af\u00b1C\u0007<\u0013\u00ca\u00c4\u000f\u00a8A\b\u000b:\u00fd`G\u00dd4\u00abb@U\u00f3\u0013\u0004\u009f\u0017A\u00ca\u008a\u0001\u00cb3\u00a7\u00b9\u00a9\u000f\u00a6h\u0092s\u00b2\u00df\u0084\u00bfS\u0002\u00e7e\u00ca]\u00c3\u0085\u0084\u00fe\u009bs#\u0016\u00b7\u00fa \u00829\fA\u00ebW\u00d0$\r\u00ba\\B\u009a\u00d1\u00d3\u00c4E)\u0099\u0003\u0086\u00d35E\u00e8\u00ee\u00e1-\u0006@\u00ccR\u00aa]f\u00ebH\u00ae!n\u00c7\u0086}\u00f9\u00c9\u00c6\u00f1\u00df\u00d2.\u00d6\u0096\u00df\u00d5".getBytes("ISO-8859-1");
        var1_13 = var0_12.length / 4;
        IIIlIIll.lIlI = new int[var1_13];
        var3_14 = 0;
        var4_15 = 0;
        do {
            var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
            IIIlIIll.lIlI[var4_15] = var5_16 ^= var2_2;
            var3_14 += 4;
        } while (++var4_15 < var1_13);
        IIIlIIll.IIll = new String[9];
        IIIlIIll.IlIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIl(ItemStack itemStack, ItemStack itemStack2) {
        if (itemStack2.isEmpty()) return false;
        if (!this.Illll(itemStack2)) {
            return false;
        }
        if (this.IIlI != lIlIllll.Il) {
            return itemStack.isEmpty();
        }
        if (itemStack.isEmpty()) {
            if (itemStack2.getMaxCount() <= 0) return false;
            return true;
        }
        if (!itemStack.isStackable()) return false;
        if (itemStack.getMaxCount() <= 1) {
            return false;
        }
        if (itemStack.getCount() >= itemStack.getMaxCount()) {
            return false;
        }
        int n = Math.min((int)Math.round((Double)this.lIl.lIl()), itemStack.getMaxCount() - 1);
        if (itemStack.getCount() <= n) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected IIIlIIll(Object object, Object object2, lIlIllll lIlIllll2, boolean bl) {
        super(object, Category.IIl, object2);
        llIll llIll2;
        this.IIlI = lIlIllll2;
        this.lIl = bl ? this.IIlllIl(new lIlIIlI(StringFactory.IIII("Threshold"), 10.0, 1.0, 63.0, 1.0)) : null;
        this.IlI = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Delay"), 75.0, 75.0, 0.0, 500.0, 5.0).lII("ms"));
        this.Il = this.IIlllIl(new IIIIIIIIl<IlIIIIlII>(StringFactory.IIII("Slot Mode"), IlIIIIlII.class, IlIIIIlII.Il));
        this.lll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Action Batches"), 1.0, 1.0, 9.0, 1.0));
        this.IIIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Use XCarry"), true));
        llIll2((Object)StringFactory.IIII("Only Inventory Open"), lIlIllll2 != lIlIllll.lI);
        this.IllI = this.IIlllIl(llIll2);
        this.l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Only No Screen"), true));
        this.l.lIII(() -> {
            if ((Boolean)this.IllI.lIl() != false) return false;
            return true;
        });
        this.lll.lIII(() -> {
            if ((Boolean)this.IllI.lIl() != false) return false;
            if (this.Il.lIl() != IlIIIIlII.Il) return false;
            return true;
        });
        this.Il.lIII(() -> (Boolean)this.IllI.lIl() == false);
        this.IIIl.lIII(() -> {
            if ((Boolean)this.IllI.lIl() != false) return false;
            return true;
        });
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIIlI() {
        if (this.IIl < 0) return false;
        if (this.III < 0) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIIll(ItemStack itemStack) {
        if (itemStack.isEmpty()) return false;
        if (itemStack.getItem() != Items.TOTEM_OF_UNDYING) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private ItemStack IIlII(int n, ItemStack itemStack) {
        ItemStack itemStack2;
        if (!itemStack.isEmpty()) {
            return itemStack;
        }
        ItemStack itemStack3 = this.llI[n];
        if (itemStack3 == null) {
            itemStack2 = ItemStack.EMPTY;
            return itemStack2;
        }
        itemStack2 = itemStack3;
        return itemStack2;
    }

    private void IIlIl() {
        this.IIl = -1;
        this.III = -1;
        this.II = Integer.MIN_VALUE;
        this.Ill = false;
        this.IlIl = false;
    }

    private void IIllI() {
        int n = 0;
        while (n < this.llI.length) {
            this.llI[n] = ItemStack.EMPTY;
            this.lIII[n] = Integer.MIN_VALUE;
            ++n;
        }
        return;
    }

    private boolean IIlll() {
        return (Boolean)this.IllI.lIl() == false;
    }

    private static void IlIII() {
        IIIlIIll.IIll[0] = IIIlIIll.IlIlI("".toCharArray(), 9455L, -892410045);
        IIIlIIll.IIll[1] = IIIlIIll.IlIlI(IIIlIIll.llIII(196240406, '\uc6fc', '\u914d').toCharArray(), 95179L, 125634720);
        IIIlIIll.IIll[2] = IIIlIIll.IlIlI(IIIlIIll.llIII(248211098, '\u5143', '\u914c').toCharArray(), 11184L, -412516197);
        IIIlIIll.IIll[3] = IIIlIIll.IlIlI(IIIlIIll.llIII(-853993292, '\u791c', '\u914f').toCharArray(), 75910L, -1775031781);
        IIIlIIll.IIll[4] = IIIlIIll.IlIlI(IIIlIIll.llIII(1665235905, '\u2418', '\u914e').toCharArray(), 40842L, 1521498855);
        IIIlIIll.IIll[5] = IIIlIIll.IlIlI(IIIlIIll.llIII(-1266920855, '\u0fd5', '\u9149').toCharArray(), 21170L, -362419891);
        IIIlIIll.IIll[6] = IIIlIIll.IlIlI(IIIlIIll.llIII(1325558107, '\u4560', '\u9148').toCharArray(), 14346L, -750551097);
        IIIlIIll.IIll[7] = IIIlIIll.IlIlI(IIIlIIll.llIII(-326872698, '\uc32b', '\u914b').toCharArray(), 30085L, -1634776555);
        IIIlIIll.IIll[8] = IIIlIIll.IlIlI(IIIlIIll.llIII(-641309195, '\u2531', '\u914a').toCharArray(), 93211L, 587350682);
    }

    private long IlIIl() {
        double d;
        double d2 = this.IlI.IIIl();
        if (d2 == (d = this.IlI.IIII())) {
            return Math.round(d2);
        }
        return Math.round(ThreadLocalRandom.current().nextDouble(d2, d));
    }

    private static String IlIlI(char[] cArray, long l2, int n) {
        int n2 = 0x5C73A23 ^ n;
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
     * Unable to fully structure code
     */
    private int IlIll(ClientPlayerEntity var1_1, ItemStack var2_2) {
        block17: {
            block14: {
                block15: {
                    block16: {
                        block12: {
                            block13: {
                                block11: {
                                    var3_3 = -1;
                                    var4_4 = 0;
                                    var5_5 = 9;
                                    break block16;
lbl5:
                                    // 5 sources

                                    return var3_3;
lbl7:
                                    // 1 sources

                                    while (true) {
                                        var7_8 = 1;
                                        ** GOTO lbl24
lbl10:
                                        // 1 sources

                                        while (true) {
                                            if (!this.lIII(var8_9, var2_2)) break block11;
                                            break block12;
                                            break;
                                        }
                                        break;
                                    }
lbl13:
                                    // 1 sources

                                    while (true) {
                                        var6_7 = ((Slot)var1_1.playerScreenHandler.slots.get(var5_5)).getStack();
                                        if (var6_7.isEmpty()) break block13;
                                        break block14;
lbl17:
                                        // 1 sources

                                        while (true) {
                                            var5_6 = ClientEntrypoint.lII();
                                            if (!((Boolean)this.IIIl.lIl()).booleanValue()) ** GOTO lbl5
                                            break block15;
                                            break;
                                        }
                                        break;
                                    }
                                }
lbl22:
                                // 3 sources

                                while (true) {
                                    ++var7_8;
lbl24:
                                    // 2 sources

                                    if (var7_8 > 4) ** GOTO lbl5
                                    var8_9 = ((Slot)var1_1.playerScreenHandler.slots.get(var7_8)).getStack();
                                    if (var8_9.isEmpty()) continue;
                                    ** continue;
                                    break;
                                }
lbl28:
                                // 1 sources

                                while (true) {
                                    var3_3 = var7_8;
                                    var4_4 = var8_9.getCount();
                                    ** GOTO lbl22
                                    break;
                                }
                            }
lbl33:
                            // 4 sources

                            while (true) {
                                ++var5_5;
                                break block16;
                                break;
                            }
                        }
                        ** while (var8_9.getCount() > var4_4)
lbl38:
                        // 1 sources

                        ** while (true)
                    }
                    ** while (var5_5 >= 36)
lbl41:
                    // 1 sources

                    ** while (true)
                    while (true) {
                        var3_3 = var5_5;
                        var4_4 = var6_7.getCount();
                        ** GOTO lbl33
                        break;
                    }
                }
                if (var5_6 == null) ** GOTO lbl5
                break block17;
lbl49:
                // 1 sources

                while (true) {
                    if (var6_7.getCount() > var4_4) ** continue;
                    ** GOTO lbl33
                    break;
                }
            }
            if (this.lIII((ItemStack)var6_7, var2_2)) ** break;
            ** while (true)
            ** while (true)
lbl56:
            // 1 sources

            while (true) {
                if (!var6_7.lI()) ** GOTO lbl5
                ** continue;
                break;
            }
        }
        var6_7 = var5_6.IlI().IIIlI();
        if (var6_7 != null) ** break;
        ** while (true)
        ** while (true)
    }

    @Override
    public String II() {
        return this.lIl != null ? String.valueOf(Math.round((Double)this.lIl.lIl())) : "";
    }

    @Override
    public void ll() {
        this.lI = 0L;
        this.IIII = this.IlIIl();
        this.IIlIl();
        this.ll = false;
        this.lII = 0;
        this.IIllI();
    }

    /*
     * Unable to fully structure code
     */
    private void IllII(MinecraftClient var1_1, ClientPlayerEntity var2_2) {
        block62: {
            block43: {
                block59: {
                    block56: {
                        block45: {
                            block66: {
                                block61: {
                                    block58: {
                                        block35: {
                                            block42: {
                                                block67: {
                                                    block52: {
                                                        block60: {
                                                            block65: {
                                                                block64: {
                                                                    block49: {
                                                                        block50: {
                                                                            block37: {
                                                                                block57: {
                                                                                    block51: {
                                                                                        block40: {
                                                                                            block39: {
                                                                                                block63: {
                                                                                                    block53: {
                                                                                                        block46: {
                                                                                                            block47: {
                                                                                                                block48: {
                                                                                                                    block38: {
                                                                                                                        block36: {
                                                                                                                            block41: {
                                                                                                                                block44: {
                                                                                                                                    block55: {
                                                                                                                                        block54: {
                                                                                                                                            if (this.Il.lIl() != IlIIIIlII.II) break block54;
                                                                                                                                            break block55;
lbl3:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                this.ll = false;
                                                                                                                                                this.lII = 0;
                                                                                                                                                return;
                                                                                                                                            }
lbl7:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                this.ll = false;
                                                                                                                                                this.lII = 0;
                                                                                                                                                this.IIII = 0L;
                                                                                                                                                break block35;
                                                                                                                                                break;
                                                                                                                                            }
lbl12:
                                                                                                                                            // 3 sources

                                                                                                                                            while (var5_3 > 0) {
                                                                                                                                                break block36;
                                                                                                                                            }
                                                                                                                                            break block56;
lbl15:
                                                                                                                                            // 1 sources

                                                                                                                                            while (System.currentTimeMillis() - this.lI < this.IIII) {
                                                                                                                                                break block37;
                                                                                                                                            }
                                                                                                                                            break block57;
                                                                                                                                        }
                                                                                                                                        this.lIll(var2_2);
                                                                                                                                        var3_4 = var1_1.currentScreen instanceof InventoryScreen;
                                                                                                                                        if (!((Boolean)this.IllI.lIl()).booleanValue()) break block58;
                                                                                                                                        break block59;
lbl23:
                                                                                                                                        // 1 sources

                                                                                                                                        while (true) {
                                                                                                                                            var10_11 = 36 + var6_7;
                                                                                                                                            if (this.lIIIl(var1_1, var2_2, var9_10, var10_11)) break block38;
                                                                                                                                            ** GOTO lbl12
                                                                                                                                            break;
                                                                                                                                        }
lbl27:
                                                                                                                                        // 1 sources

                                                                                                                                        while (true) {
                                                                                                                                            this.IIlIl();
                                                                                                                                            this.ll = false;
                                                                                                                                            this.lII = 0;
                                                                                                                                            return;
                                                                                                                                        }
lbl32:
                                                                                                                                        // 1 sources

                                                                                                                                        while (var2_2.age < this.II) {
                                                                                                                                            break block39;
                                                                                                                                        }
                                                                                                                                        break block60;
lbl35:
                                                                                                                                        // 1 sources

                                                                                                                                        while (true) {
                                                                                                                                            this.ll = true;
                                                                                                                                            this.lII = Math.min(var4_5, this.lI());
                                                                                                                                            break block40;
                                                                                                                                            break;
                                                                                                                                        }
lbl39:
                                                                                                                                        // 1 sources

                                                                                                                                        while (true) {
                                                                                                                                            if (var1_1.currentScreen == null) break block41;
                                                                                                                                            break block42;
                                                                                                                                            break;
                                                                                                                                        }
lbl42:
                                                                                                                                        // 1 sources

                                                                                                                                        while (!this.ll) {
                                                                                                                                            ** GOTO lbl15
                                                                                                                                        }
                                                                                                                                        break block57;
lbl45:
                                                                                                                                        // 1 sources

                                                                                                                                        while (true) {
                                                                                                                                            this.lI = System.currentTimeMillis();
                                                                                                                                            this.IIII = this.IlIIl();
                                                                                                                                            this.lII = Math.max(0, this.lII - 1);
                                                                                                                                            if (this.lII != 0) break block35;
                                                                                                                                            break block43;
                                                                                                                                            break;
                                                                                                                                        }
lbl51:
                                                                                                                                        // 1 sources

                                                                                                                                        return;
lbl53:
                                                                                                                                        // 2 sources

                                                                                                                                        return;
                                                                                                                                    }
                                                                                                                                    this.IIIII(var1_1, var2_2);
                                                                                                                                    return;
lbl58:
                                                                                                                                    // 1 sources

                                                                                                                                    while (this.IIIIl(var7_8, var8_9)) {
                                                                                                                                        break block44;
                                                                                                                                    }
                                                                                                                                    break block52;
lbl61:
                                                                                                                                    // 2 sources

                                                                                                                                    while (!var2_2.playerScreenHandler.getCursorStack().isEmpty()) {
                                                                                                                                        break block45;
                                                                                                                                    }
                                                                                                                                    break block61;
lbl64:
                                                                                                                                    // 2 sources

                                                                                                                                    while (true) {
                                                                                                                                        if (this.Il.lIl() != IlIIIIlII.Il) break block46;
                                                                                                                                        if (!this.IIIlI()) break block46;
                                                                                                                                        ** GOTO lbl32
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
                                                                                                                                if (this.Illll(var8_9)) break block62;
                                                                                                                                break block52;
lbl71:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    if (this.ll) break block47;
                                                                                                                                    break block48;
                                                                                                                                    break;
                                                                                                                                }
lbl74:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    this.ll = false;
                                                                                                                                    this.lII = 0;
                                                                                                                                    break block49;
                                                                                                                                    break;
                                                                                                                                }
lbl78:
                                                                                                                                // 1 sources

                                                                                                                                while (!var3_4) {
                                                                                                                                    break block50;
                                                                                                                                }
                                                                                                                                ** GOTO lbl61
                                                                                                                            }
lbl82:
                                                                                                                            // 4 sources

                                                                                                                            while (var1_1.currentScreen != null) {
                                                                                                                                ** GOTO lbl78
                                                                                                                            }
                                                                                                                            ** GOTO lbl61
                                                                                                                        }
                                                                                                                        this.lI = System.currentTimeMillis();
                                                                                                                        this.IIII = this.IlIIl();
                                                                                                                        orchard.internal.IIlI.Illl(var1_1);
                                                                                                                        break block56;
                                                                                                                    }
                                                                                                                    ++var5_3;
                                                                                                                    break block52;
                                                                                                                }
                                                                                                                return;
lbl95:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    if (this.IIl(var1_1)) break block51;
                                                                                                                    ** GOTO lbl53
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
lbl99:
                                                                                                            // 2 sources

                                                                                                            while (!this.ll) {
                                                                                                                ** continue;
lbl101:
                                                                                                                // 1 sources

                                                                                                                ** GOTO lbl35
                                                                                                            }
                                                                                                            break block40;
lbl103:
                                                                                                            // 1 sources

                                                                                                            while (this.IlI(var1_1, var7_8 = var2_2.getInventory().getStack(var6_7), var6_7)) {
                                                                                                                break block52;
                                                                                                            }
                                                                                                            break block63;
                                                                                                        }
                                                                                                        if (this.Il.lIl() != IlIIIIlII.Il) break block57;
                                                                                                        ** GOTO lbl42
lbl109:
                                                                                                        // 2 sources

                                                                                                        while (var6_7 < 9) {
                                                                                                            break block53;
                                                                                                        }
                                                                                                        ** GOTO lbl12
lbl112:
                                                                                                        // 1 sources

                                                                                                        while (System.currentTimeMillis() - this.lI < this.IIII) {
                                                                                                            ** continue;
lbl114:
                                                                                                            // 1 sources

                                                                                                            ** GOTO lbl71
                                                                                                        }
                                                                                                        ** GOTO lbl99
                                                                                                    }
                                                                                                    if (var2_2.playerScreenHandler.getCursorStack().isEmpty()) ** GOTO lbl103
                                                                                                    ** GOTO lbl12
lbl119:
                                                                                                    // 1 sources

                                                                                                    while (this.Il.lIl() == IlIIIIlII.Il) {
                                                                                                        ** GOTO lbl112
                                                                                                    }
                                                                                                    break block64;
lbl122:
                                                                                                    // 1 sources

                                                                                                    while (true) {
                                                                                                        this.ll = false;
                                                                                                        this.lII = 0;
                                                                                                        this.IIlIl();
                                                                                                        ** GOTO lbl64
                                                                                                        break;
                                                                                                    }
                                                                                                }
                                                                                                var8_9 = this.IIlII(var6_7, var7_8);
                                                                                                if (var8_9.isEmpty()) break block52;
                                                                                                ** GOTO lbl58
                                                                                            }
                                                                                            return;
                                                                                        }
                                                                                        if (!this.IIII(var1_1, var2_2)) {
                                                                                            ** continue;
                                                                                        }
                                                                                        break block49;
                                                                                    }
                                                                                    var5_3 = 0;
                                                                                    var6_7 = 0;
                                                                                    ** GOTO lbl109
                                                                                }
                                                                                if ((var4_5 = this.lllI(var1_1, var2_2)) > 0) ** GOTO lbl119
                                                                                break block65;
lbl144:
                                                                                // 1 sources

                                                                                return;
                                                                            }
                                                                            return;
                                                                        }
                                                                        this.ll = false;
                                                                        this.lII = 0;
                                                                        return;
                                                                    }
                                                                    return;
                                                                }
                                                                if (System.currentTimeMillis() - this.lI < this.IIII) {
                                                                    ** continue;
                                                                }
                                                                break block66;
                                                            }
                                                            this.ll = false;
                                                            this.lII = 0;
                                                            return;
                                                        }
                                                        if (!this.lll(var1_1)) {
                                                            ** continue;
                                                        }
                                                        break block67;
                                                    }
lbl167:
                                                    // 2 sources

                                                    while (true) {
                                                        ++var6_7;
                                                        ** GOTO lbl109
                                                        break;
                                                    }
                                                }
                                                var4_6 = this.lIIIl(var1_1, var2_2, this.IIl, this.III);
                                                this.IIlIl();
                                                ** while (!var4_6)
lbl174:
                                                // 1 sources

                                                ** while (true)
                                            }
                                            if (var3_4) ** GOTO lbl82
                                            ** while (true)
lbl178:
                                            // 1 sources

                                            while (((Boolean)this.l.lIl()).booleanValue()) {
                                                ** continue;
lbl180:
                                                // 1 sources

                                                ** GOTO lbl39
                                            }
                                            ** GOTO lbl82
                                        }
lbl183:
                                        // 2 sources

                                        return;
                                    }
lbl186:
                                    // 2 sources

                                    while (!((Boolean)this.IllI.lIl()).booleanValue()) {
                                        ** GOTO lbl178
                                    }
                                    ** GOTO lbl82
                                }
                                if (this.Il.lIl() != IlIIIIlII.Il) ** break;
                                ** while (true)
                                ** while (true)
                            }
                            if (this.llII(var1_1)) ** break;
                            ** while (true)
                            ** while (true)
                        }
                        return;
                    }
                    return;
                }
                if (var3_4) ** GOTO lbl186
                ** while (true)
            }
            this.ll = false;
            ** while (true)
        }
        ** while ((var9_10 = this.IlIll((ClientPlayerEntity)var2_2, (ItemStack)var8_9)) >= 0)
lbl209:
        // 1 sources

        ** while (true)
    }

    private boolean IlllI(ItemStack itemStack) {
        return System.currentTimeMillis() - this.lI >= this.IIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illll(ItemStack itemStack) {
        boolean bl;
        if (itemStack.isEmpty()) {
            return false;
        }
        switch (this.IIlI.ordinal()) {
            case 2: {
                bl = itemStack.isOf(Items.TNT_MINECART);
                return bl;
            }
            default: {
                throw new MatchException(null, null);
            }
            case 0: {
                bl = itemStack.getItem() instanceof PotionItem;
                return bl;
            }
            case 1: 
        }
        bl = this.lIlI(itemStack);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIIl(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity, int n, int n2) {
        if (n < 0) return false;
        if (n2 < 0) return false;
        if (n == n2) return false;
        if (!clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty()) {
            return false;
        }
        int n3 = clientPlayerEntity.playerScreenHandler.syncId;
        minecraftClient.interactionManager.clickSlot(n3, n, 0, SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity);
        minecraftClient.interactionManager.clickSlot(n3, n2, 0, SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity);
        if (clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty()) return clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty();
        minecraftClient.interactionManager.clickSlot(n3, n, 0, SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity);
        return clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty();
    }

    private static int lIlIl(int n, int n2) {
        return lIlI[n ^ 0xEEB96EEE] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llIII(int n, char c, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0x914D;
        char[] cArray = llIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lllI[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIlIIll.lllI[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x346A;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x4FAE;
            n6 -= 38871;
            n6 ^= 0xB1D9;
            n6 += 9920;
            cArray[n5] = (char)((n6 -= 47846) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

