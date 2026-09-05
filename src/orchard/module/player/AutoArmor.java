/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIllIlI
 * Module         : AutoArmor  [PLAYER]
 * Description    : Automatically equips the best armor from your inventory.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Only Inventory Open
 *   - Prefer Elytra
 *   - Slot Mode
 *   - feather_falling
 *   - depth_strider
 *   - swift_sneak
 *   - respiration
 *   - .getBytes(
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
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.AttributeModifiersComponent
 *  net.minecraft.component.type.AttributeModifiersComponent$Entry
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.registry.RegistryKey
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.screen.slot.Slot
 *  net.minecraft.screen.slot.SlotActionType
 */
package orchard.module.player;

import java.lang.invoke.LambdaMetafactory;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.ingame.InventoryScreen;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttributeModifiersComponent;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
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
import orchard.internal.IlIIIIlII;
import orchard.internal.llIll;
import orchard.module.player.ChestStealer;

@Environment(value=EnvType.CLIENT)
public final class AutoArmor
extends ModuleBase {
    private final llIll I;
    private int l;
    private long II;
    private static String[] Il;
    private final llIll lI;
    private long ll;
    private final IIIIIIIIl<IlIIIIlII> III;
    private static final int IIl = 8;
    private int IlI = -1;
    private boolean Ill;
    private int lII = -1;
    private static final int lIl = 5;
    private boolean llI;
    private static final int lll = 6;
    private static final int IIII = 7;
    private final IIIlIlIIl IIIl = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Delay"), 75.0, 75.0, 0.0, 500.0, 5.0).lII("ms"));
    private static final int[] IIlI;
    private static final String[] IIll;
    private static final Object[] IlII;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private int I(ClientPlayerEntity clientPlayerEntity, Slot slot) {
        int n = -1;
        double d = -1.0;
        int n2 = 9;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                ++n2;
            }
            if (n2 >= 45) {
                return n;
            }
            ItemStack itemStack = ((Slot)clientPlayerEntity.playerScreenHandler.slots.get(n2)).getStack();
            if (!this.lIll(itemStack) || !slot.canInsert(itemStack)) continue;
            double d2 = this.IIlI(itemStack);
            if (n >= 0 && !(d2 > d)) continue;
            n = n2;
            d = d2;
        }
    }

    private boolean lI() {
        return this.IlI >= 0 && this.lII >= 0;
    }

    @Override
    public void ll() {
        this.II = 0L;
        this.ll = this.lIIl();
        this.lIlI();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 8455;
        String string = "\u7952\u3868\uf5ad\u7aed\ua3e2\uf256\u3b84\u7c70\uaf65\u5b4f\uf40c\u5109\u4f5a\ube0b\u353d\ue7fa\u9c27\udc1e\ufd64\u74ff\ufb70\u9c22\ufe8a\u662e\u6240\u6b18\u6766\u48fd\u7a33\u0cee\u4029\ucacb\u56ca\u51b8\ua1b2\u2fd7\u26c3\u641e\u2f14\ubeea\u53b1\ud497\uac14\u8e8e\ub3c6\u0647\u53bd\u00c3\u9a7b\u8f0d\u0c39\u0cac\ub02c\uc69b\ud9a0\uaaac\u022b\u626a\uf86f\ua39b\u5646\ufd22\u3ef6\u2a7f\u92a7\ufd53\u6324\ucdf9\u092f\ub89f\uff24\ua373\u593b\u2387\u8c07\u9c96\u4196\ub0b5\uabfa\ud9c0\u8c18\u92cf\uf132\u3f1f\uf1d0\u3c11\u31fc\u8d59\uee65\uf8ca\u3bac\uefd7\uc049\ubcda\uad87\u7441\u3b1a\uc43b\u142e\ua927\u09d5\ucbb7\u9ee6\u41b8\u83aa\ud46e\uc3d4\uf6ae\ufdc4\uf63d\u53f5\uf992\u3e7a\u4f19\u2c67\ud404\ud975\uaa95\u1601\ude87\ue336\u8a1b\ua2d2\u380c\u26b2\u8cb1\u4ca6\u9c4c\u192e\u9160\u1e3f\u49aa\u04b1\u887e\uba4d\u72c9\ubdc1\u3704\u435c\ub2c4\u3c51\u47d1\ub441\ue43d\u475a\ue722\u49fc\ue89f\u5e79\uc084\u8859\u27ea\u18fe\udbd2\u5828\ue0c9\u5191\uc336\u4e54\u8a1d\ua784\uad9a\ub6e4\uc4ab\u276b\ufa21\uafc9\u7bce\u5453\ue1c4\u21cf\ua0b0\u4fa0\u3438\ud717\uf80b\u60d5\u4fd3\ubfe3\u392d\ue8a3\uf0ec\ua50e\u4c15\u0ff6\u29d1\u2938\u27bf\u0c53\uad3d\uec36\u67a3\u08c1\u86b3\uedb9\ue65f\u1423\u14b3\uf787\u8b6e\u5003\uf028\uadcd\uabc9\ufbe5\u29af\ud5c9\u35f3\ub67d\u9874\u3460\uadda\u2d95\u9093\u72aa\u0ef2\ua345\u9bc0\u66a3\ucdc0\udff6\u4af6\ua056\ue51d\ua58c\ue7d9\u1244\u71d3\u09dd\u026c\ue2f7\u0ce3\u970d\u035b\ue375\u42cc\u5d48\u9590\u44d1\u9865\uf415\uaf98\u2426\ufc28\u20aa\u01a1\uebf3\u582f\udde5\ud7ff\u5a05\u7c9f\u6576\u49ba\u532f\u0beb\u01ff\u3d36\ub92c\u82d3\u1477\u0eae\u2ca2\u24d7\u73f2\u494b\u99d9\u24e2\u9d03\ud585\u5be3\u24bb\u1ba7\u6873\u5c7f\u2b4c\u6588\u0fd8\ue2a7\ud9ec\u4db1\u4683\u0e8c\ub00c\u154b\u3722\uda2c\u0642\u6469\ubd47\ua4f1\u56da\u2829\u12dc\uc295\u4b59\ud5a2\ua723\ua92c\u5a6a";
        char[] cArray = "\u211b\u210b\u214b\u210f\u2103\u2113\u210b\u2117\u210b\u2117\u2113\u2117\u2117\u2117\u210f\u2113".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            int n3;
            int n4;
            int n5;
            if (!bl || (bl = false) || !true) {
                n4 = cArray[n5] ^ n;
                stringArray[n5] = string.substring(n3, n3 + n4);
                n3 += n4;
                if (++n5 < cArray.length) continue;
                n2 = 0;
            }
            n5 = 0;
            n3 = 0;
            n4 = 0;
            if (n2 == 0) break;
        }
        IIll = stringArray;
        IlII = new Object[stringArray.length];
        int n6 = -1294902421;
        byte[] byArray = "?\u00e97#\u00d6\u00d9;\u00a7\u00c4@\u00fc\u00e9\u00d6A<\u0092y\u0018\u00dcL\u00a7JZ\u00a2\u00d0\u00beQ\u00dbJ[y~\u0005\u00cd\u0093: \u0098\u00b5:\u00fd\u0083J\u0005\u00dca\u00c4\u0096Gq\u0015&\u008dW\u0088\u00da\u0080Ik\u00d6\u00f0?\u008b\u0002\u00f6?\u00e2\u0011j)\u00af\u00b8\u0001\u00ff\u0015\u00a4\u00a0i\u000e\u0085\u009e\u00b6o~\u00de\u00b1\u00e3=\u00b1\u00d4\u00d8\u00f5\u0097\u008eX\u00e36\u0010\u00dc.,\u0003\u0019\u00b1r\u0007\u00b67\u001a\u009fPYX\u00b0*\u0094L\u00e5\u0004a\u00c2b\u00822\u00cf\u00a1{x\u009e\u00a7z~\u000bMa\u00c30\u00e9O\u00be,\u00a6wT\u0081\u001a\u00c4\u00c5X\u00bej2ah\u00b9F\u00f91\u00a7\u00d8W\u00c1\u0016\u00fb$\u00a4\u0005\u00aajz\u00f3%\u0010P\u00ef\u0086.\u00ca\u00c7\u0010\u00b224\u00c6@\u000e\u0007v\u00e7\u00e3:\u00a3\u00b0\u00ce\u00ed\u009cv-d\u00bb\u00c0\u00fd=P\u00c5\u0092\u00e1\u00e7\u001aiY\u0085".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IIlI = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            AutoArmor.IIlI[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        Il = new String[17];
        AutoArmor.IIl();
    }

    private static void IIl() {
        AutoArmor.Il[0] = AutoArmor.IIII(AutoArmor.IIlII(-1563862104, 411593341).toCharArray(), 18814L, -2119797895);
        AutoArmor.Il[1] = AutoArmor.IIII(AutoArmor.IIlII(-1563862103, 480914040).toCharArray(), 88282L, -1257710657);
        AutoArmor.Il[2] = AutoArmor.IIII(AutoArmor.IIlII(-1563862102, -1741743012).toCharArray(), 98475L, 201411804);
        AutoArmor.Il[3] = AutoArmor.IIII(AutoArmor.IIlII(-1563862101, 590493856).toCharArray(), 97743L, 553805299);
        AutoArmor.Il[4] = AutoArmor.IIII(AutoArmor.IIlII(-1563862100, 16065423).toCharArray(), 47005L, -1126289545);
        AutoArmor.Il[5] = AutoArmor.IIII(AutoArmor.IIlII(-1563862099, -185317424).toCharArray(), 8861L, 2079763527);
        AutoArmor.Il[6] = AutoArmor.IIII(AutoArmor.IIlII(-1563862098, 288117673).toCharArray(), 34318L, 2101540123);
        AutoArmor.Il[7] = AutoArmor.IIII(AutoArmor.IIlII(-1563862097, 1836263435).toCharArray(), 93038L, -72289351);
        AutoArmor.Il[8] = AutoArmor.IIII(AutoArmor.IIlII(-1563862112, 1558463411).toCharArray(), 26486L, 1934102470);
        AutoArmor.Il[9] = AutoArmor.IIII("".toCharArray(), 81201L, -445167040);
        AutoArmor.Il[10] = AutoArmor.IIII(AutoArmor.IIlII(-1563862111, -802078757).toCharArray(), 35564L, 790300584);
        AutoArmor.Il[11] = AutoArmor.IIII(AutoArmor.IIlII(-1563862110, 1731594167).toCharArray(), 50775L, 1393947217);
        AutoArmor.Il[12] = AutoArmor.IIII(AutoArmor.IIlII(-1563862109, 2009924721).toCharArray(), 21122L, 1186964467);
        AutoArmor.Il[13] = AutoArmor.IIII(AutoArmor.IIlII(-1563862108, -821854940).toCharArray(), 70698L, 1555149727);
        AutoArmor.Il[14] = AutoArmor.IIII(AutoArmor.IIlII(-1563862107, 421732151).toCharArray(), 53948L, 1704644586);
        AutoArmor.Il[15] = AutoArmor.IIII(AutoArmor.IIlII(-1563862106, -200657670).toCharArray(), 98287L, 945224734);
        AutoArmor.Il[16] = AutoArmor.IIII(AutoArmor.IIlII(-1563862105, 1997166374).toCharArray(), 14075L, -914881517);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI(int n, int n2, ClientPlayerEntity clientPlayerEntity, MinecraftClient minecraftClient) {
        this.IlI = n;
        this.lII = n2;
        this.l = clientPlayerEntity.age + 1;
        this.llI = true;
        if (this.III.lIl() == IlIIIIlII.II) {
            orchard.internal.IIlI.IlIl(minecraftClient);
            return;
        }
        if (this.III.lIl() != IlIIIIlII.Il) return;
        orchard.internal.IIlI.I(minecraftClient);
    }

    @Override
    public void llll() {
        this.lllI(MinecraftClient.getInstance());
        this.lIlI();
    }

    private void lII(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity) {
        if (minecraftClient.currentScreen instanceof InventoryScreen) {
            this.Ill = false;
            return;
        }
        minecraftClient.setScreen((Screen)new InventoryScreen((PlayerEntity)clientPlayerEntity));
        this.Ill = true;
    }

    private boolean lIl(MinecraftClient minecraftClient) {
        return switch ((IlIIIIlII)((Object)this.III.lIl())) {
            case IlIIIIlII.I -> orchard.internal.IIlI.Il(minecraftClient);
            case IlIIIIlII.II -> orchard.internal.IIlI.IlI(minecraftClient);
            default -> throw new MatchException(null, null);
            case IlIIIIlII.Il -> orchard.internal.IIlI.lIII(minecraftClient);
        };
    }

    /*
     * Unable to fully structure code
     */
    private void lll(MinecraftClient var1_1, ClientPlayerEntity var2_2, int var3_3) {
        block21: {
            block15: {
                block20: {
                    block17: {
                        block18: {
                            block16: {
                                block19: {
                                    block13: {
                                        block14: {
                                            var4_4 = (Slot)var2_2.playerScreenHandler.slots.get(var3_3);
                                            var5_5 = var4_4.getStack();
                                            if (var3_3 != 6) break block19;
                                            break block20;
lbl5:
                                            // 1 sources

                                            while (var13_12 == var8_8) {
                                                break block13;
                                            }
                                            break block15;
                                            while (true) {
                                                var13_12 = this.IllI(var12_11);
                                                if (var13_12 > 0) break block14;
                                                break block15;
                                                break;
                                            }
lbl12:
                                            // 1 sources

                                            while ((var6_6 = this.I(var2_2, var4_4)) >= 0) {
                                                break block16;
                                            }
                                            break block19;
lbl15:
                                            // 1 sources

                                            return;
lbl17:
                                            // 1 sources

                                            while (this.lIll(var5_5)) {
                                                ** continue;
lbl19:
                                                // 1 sources

                                                ** GOTO lbl15
                                            }
                                            ** GOTO lbl12
lbl21:
                                            // 2 sources

                                            while (true) {
                                                var8_8 = var13_12;
                                                var9_9 = var14_13;
                                                var7_7 = var11_10;
                                                break block15;
                                                break;
                                            }
lbl26:
                                            // 1 sources

                                            while (true) {
                                                var14_13 = this.IIlI(var12_11);
                                                if (var13_12 > var8_8) ** GOTO lbl21
                                                ** GOTO lbl5
                                                break;
                                            }
                                        }
                                        ** while (var13_12 > var6_6)
lbl32:
                                        // 1 sources

                                        break block15;
                                    }
                                    if (var14_13 > var9_9) {
                                        ** continue;
lbl36:
                                        // 1 sources

                                        while (true) {
                                            if (var4_4.canInsert(var12_11)) ** continue;
                                            break block15;
                                            break;
                                        }
lbl39:
                                        // 2 sources

                                        while (true) {
                                            if (var11_10 >= 45) break block17;
                                            break block18;
                                            break;
                                        }
                                    }
                                    break block15;
                                }
lbl44:
                                // 2 sources

                                while (true) {
                                    var6_6 = this.IllI(var5_5);
                                    var7_7 = -1;
                                    var8_8 = var6_6;
                                    var9_9 = -1.0;
                                    var11_10 = 9;
                                    ** GOTO lbl39
                                    break;
                                }
                            }
                            this.IIIIl(var1_1, var2_2, var6_6, var3_3);
                            return;
                        }
                        ** while (!(var12_11 = ((Slot)var2_2.playerScreenHandler.slots.get((int)var11_10)).getStack()).isEmpty())
lbl57:
                        // 1 sources

                        break block15;
lbl58:
                        // 1 sources

                        return;
                    }
                    if (var7_7 < 0) {
                        ** continue;
                    }
                    break block21;
                }
                ** while (!((Boolean)this.I.lIl()).booleanValue())
lbl66:
                // 1 sources

                ** GOTO lbl17
            }
            ++var11_10;
            ** while (true)
        }
        this.IIIIl(var1_1, var2_2, var7_7, var3_3);
    }

    private static String IIII(char[] cArray, long l2, int n) {
        int n2 = 0x4C5C911A ^ n;
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
    private double IIlI(ItemStack itemStack) {
        if (itemStack.isEmpty()) return 1.0;
        if (!itemStack.isDamageable()) return 1.0;
        if (itemStack.getMaxDamage() > 0) return (double)(itemStack.getMaxDamage() - itemStack.getDamage()) / (double)itemStack.getMaxDamage();
        return 1.0;
    }

    /*
     * Unable to fully structure code
     */
    private int IllI(ItemStack var1_1) {
        block26: {
            block24: {
                block23: {
                    block18: {
                        block25: {
                            block29: {
                                block15: {
                                    block17: {
                                        block16: {
                                            block22: {
                                                block19: {
                                                    block20: {
                                                        block21: {
                                                            block27: {
                                                                block28: {
                                                                    if (!var1_1.isEmpty()) break block27;
                                                                    break block28;
lbl3:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var6_6 = (RegistryEntry)var5_5.next();
                                                                        var7_7 = var6_6.getKey().map((Function<RegistryKey, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, llII(net.minecraft.registry.RegistryKey ), (Lnet/minecraft/registry/RegistryKey;)Ljava/lang/String;)()).orElse("");
                                                                        var8_8 = var4_4.getLevel(var6_6);
                                                                        if (!var7_7.equals("protection")) break block15;
                                                                        break block16;
                                                                        break;
                                                                    }
lbl9:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (!var7_7.equals("thorns")) break block17;
                                                                        break block18;
                                                                        break;
                                                                    }
lbl12:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var2_2 += (int)(var5_5.modifier().value() * 10.0);
                                                                        break block19;
                                                                        break;
                                                                    }
lbl15:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        var2_2 += var8_8 * 2;
                                                                        ** GOTO lbl54
                                                                        break;
                                                                    }
                                                                }
                                                                return -1;
lbl20:
                                                                // 1 sources

                                                                while (true) {
                                                                    if (var7_7.equals("depth_strider") || var7_7.equals("soul_speed")) break block20;
                                                                    break block21;
                                                                    break;
                                                                }
                                                            }
                                                            var2_2 = 0;
                                                            var3_3 = (AttributeModifiersComponent)var1_1.getOrDefault(DataComponentTypes.ATTRIBUTE_MODIFIERS, (Object)AttributeModifiersComponent.DEFAULT);
                                                            var4_4 = var3_3.modifiers().iterator();
                                                            break block19;
                                                        }
                                                        if (!var7_7.equals("swift_sneak")) ** GOTO lbl54
                                                        break block20;
                                                        return var2_2;
                                                    }
                                                    var2_2 += var8_8;
                                                    ** GOTO lbl54
lbl36:
                                                    // 1 sources

                                                    while (true) {
                                                        if (!var7_7.equals("unbreaking")) break block22;
                                                        break block23;
                                                        break;
                                                    }
lbl39:
                                                    // 1 sources

                                                    while (true) {
                                                        var2_2 += var8_8 * 2;
                                                        ** GOTO lbl54
                                                        break;
                                                    }
lbl42:
                                                    // 1 sources

                                                    while (true) {
                                                        var2_2 += 2;
                                                        ** GOTO lbl54
                                                        break;
                                                    }
                                                }
lbl46:
                                                // 3 sources

                                                while (true) {
                                                    if (!var4_4.hasNext()) break block24;
                                                    break block25;
                                                    break;
                                                }
                                            }
                                            if (!var7_7.equals("mending")) break block29;
                                            ** while (true)
lbl52:
                                            // 1 sources

                                            while (true) {
                                                var2_2 += var8_8 * 2;
lbl54:
                                                // 10 sources

                                                while (true) {
                                                    if (!var5_5.hasNext()) ** continue;
                                                    ** continue;
                                                    break;
                                                }
                                                break;
                                            }
lbl57:
                                            // 1 sources

                                            while (true) {
                                                var4_4 = (ItemEnchantmentsComponent)var1_1.getOrDefault(DataComponentTypes.ENCHANTMENTS, (Object)ItemEnchantmentsComponent.DEFAULT);
                                                var5_5 = var4_4.getEnchantments().iterator();
                                                ** GOTO lbl54
                                                break;
                                            }
                                        }
                                        var2_2 += var8_8 * 3;
                                        ** GOTO lbl54
                                    }
                                    ** while (!var7_7.equals((Object)"respiration"))
lbl66:
                                    // 1 sources

                                    ** while (true)
                                }
                                ** while (!var7_7.contains((CharSequence)"protection"))
lbl69:
                                // 1 sources

                                ** while (true)
                            }
                            ** while (!var7_7.equals((Object)"feather_falling"))
lbl72:
                            // 1 sources

                            ** while (true)
lbl73:
                            // 1 sources

                            while (true) {
                                if (!var5_5.attribute().equals((Object)EntityAttributes.ARMOR_TOUGHNESS)) ** GOTO lbl46
                                break block26;
                                break;
                            }
                        }
                        ** while (!(var5_5 = (AttributeModifiersComponent.Entry)var4_4.next()).attribute().equals((Object)EntityAttributes.ARMOR))
lbl78:
                        // 1 sources

                        ** while (true)
                    }
                    var2_2 += var8_8;
                    ** GOTO lbl54
                }
                var2_2 += var8_8;
                ** while (true)
lbl85:
                // 1 sources

                return -1;
            }
            ** while (var2_2 != 0)
lbl89:
            // 1 sources

            ** while (true)
        }
        var2_2 += (int)(var5_5.modifier().value() * 5.0);
        ** while (true)
    }

    private void Illl(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity, int n, int n2) {
        int n3 = clientPlayerEntity.playerScreenHandler.syncId;
        minecraftClient.interactionManager.clickSlot(n3, n, 0, SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity);
        minecraftClient.interactionManager.clickSlot(n3, n2, 0, SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity);
        if (!clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty()) {
            minecraftClient.interactionManager.clickSlot(n3, n, 0, SlotActionType.PICKUP, (PlayerEntity)clientPlayerEntity);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        ClientPlayerEntity clientPlayerEntity;
        MinecraftClient minecraftClient;
        block13: {
            block16: {
                block15: {
                    block14: {
                        boolean bl;
                        minecraftClient = MinecraftClient.getInstance();
                        if (minecraftClient.player == null || minecraftClient.interactionManager == null || minecraftClient.world == null) {
                            this.lIlI();
                            return;
                        }
                        boolean bl2 = bl = this.Ill && minecraftClient.currentScreen instanceof InventoryScreen;
                        if (((Boolean)this.lI.lIl()).booleanValue() && !(minecraftClient.currentScreen instanceof InventoryScreen)) {
                            this.lIlI();
                            return;
                        }
                        if (!(((Boolean)this.lI.lIl()).booleanValue() || minecraftClient.currentScreen == null || bl || minecraftClient.currentScreen instanceof InventoryScreen)) {
                            return;
                        }
                        if (this.lIII(minecraftClient)) {
                            return;
                        }
                        clientPlayerEntity = minecraftClient.player;
                        if (!this.lI()) break block13;
                        if (!this.llI) break block14;
                        if (clientPlayerEntity.age < this.l) break block15;
                        if (!this.IIIII(minecraftClient)) {
                            return;
                        }
                        break block16;
                    }
                    if (!(minecraftClient.currentScreen instanceof InventoryScreen)) {
                        this.lIlI();
                        return;
                    }
                    break block16;
                }
                return;
            }
            if (!this.llI && !this.IIIII(minecraftClient)) {
                return;
            }
            this.Illl(minecraftClient, clientPlayerEntity, this.IlI, this.lII);
            this.II = System.currentTimeMillis();
            this.ll = this.lIIl();
            if (this.Ill) {
                this.lllI(minecraftClient);
            }
            this.lIlI();
            return;
        }
        if (!clientPlayerEntity.playerScreenHandler.getCursorStack().isEmpty()) {
            return;
        }
        if (System.currentTimeMillis() - this.II < this.ll) {
            return;
        }
        this.lll(minecraftClient, clientPlayerEntity, 5);
        if (this.lI()) {
            return;
        }
        this.lll(minecraftClient, clientPlayerEntity, 6);
        if (this.lI()) {
            return;
        }
        this.lll(minecraftClient, clientPlayerEntity, 7);
        if (this.lI()) {
            return;
        }
        this.lll(minecraftClient, clientPlayerEntity, 8);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIII(MinecraftClient minecraftClient) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) {
            return false;
        }
        ChestStealer chestStealer = clientEntrypoint.IlI().IIII();
        if (chestStealer == null) return false;
        if (chestStealer.IlI(minecraftClient)) return true;
        return false;
    }

    private long lIIl() {
        double d;
        double d2 = this.IIIl.IIIl();
        if (d2 == (d = this.IIIl.IIII())) {
            return Math.round(d2);
        }
        return Math.round(ThreadLocalRandom.current().nextDouble(d2, d));
    }

    private void lIlI() {
        this.IlI = -1;
        this.lII = -1;
        this.l = Integer.MIN_VALUE;
        this.llI = false;
        this.Ill = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIll(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (!itemStack.isOf(Items.ELYTRA)) return false;
        return true;
    }

    private static /* synthetic */ String llII(RegistryKey registryKey) {
        return registryKey.getValue().getPath();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean llIl(MinecraftClient minecraftClient) {
        boolean bl;
        switch ((IlIIIIlII)((Object)this.III.lIl())) {
            case Il: {
                bl = orchard.internal.IIlI.l(minecraftClient);
                return bl;
            }
            default: {
                throw new MatchException(null, null);
            }
            case II: {
                bl = orchard.internal.IIlI.IllI(minecraftClient);
                return bl;
            }
            case I: 
        }
        bl = orchard.internal.IIlI.IlII(minecraftClient);
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lllI(MinecraftClient minecraftClient) {
        if (!this.Ill) {
            return;
        }
        if (minecraftClient != null && minecraftClient.currentScreen instanceof InventoryScreen) {
            minecraftClient.setScreen(null);
        }
        this.Ill = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIII(MinecraftClient minecraftClient) {
        if (this.IIIlI()) {
            if (this.lIl(minecraftClient)) return this.llIl(minecraftClient);
            return false;
        }
        if (orchard.internal.IIlI.lllI(minecraftClient)) return orchard.internal.IIlI.II(minecraftClient);
        return false;
    }

    public AutoArmor() {
        super(StringFactory.IIII("AutoArmor"), Category.IIl, StringFactory.IIII("Automatically equips the best armor from your inventory."));
        this.III = this.IIlllIl(new IIIIIIIIl<IlIIIIlII>(StringFactory.IIII("Slot Mode"), IlIIIIlII.class, IlIIIIlII.Il));
        this.lI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Only Inventory Open"), false));
        this.I = this.IIlllIl(new llIll((Object)StringFactory.IIII("Prefer Elytra"), false));
        this.l = Integer.MIN_VALUE;
        this.III.lIII(() -> (Boolean)this.lI.lIl() == false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIl(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity, int n, int n2) {
        if (!(minecraftClient.currentScreen instanceof InventoryScreen)) {
            if (((Boolean)this.lI.lIl()).booleanValue()) {
                return false;
            }
        } else {
            if (this.IIIII(minecraftClient)) {
                this.IlI(n, n2, clientPlayerEntity, minecraftClient);
                return true;
            }
            return false;
        }
        if (!this.IIIII(minecraftClient)) {
            return false;
        }
        this.IlI(n, n2, clientPlayerEntity, minecraftClient);
        return true;
    }

    private boolean IIIlI() {
        return (Boolean)this.lI.lIl() == false;
    }

    private static int IIIll(int n, int n2) {
        return IIlI[n ^ 0xCB7C8440] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xA2C95BA8;
        char[] cArray = IIll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlII[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            AutoArmor.IlII[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x231A3B7F;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 17 -> 108;
                case 3 -> 239;
                case 24 -> 234;
                case 7 -> 80;
                case 25 -> 32;
                case 30 -> 94;
                case 5 -> 73;
                case 2 -> 163;
                case 13 -> 175;
                case 9 -> 229;
                case 12 -> 176;
                case 18 -> 235;
                case 10 -> 7;
                case 20 -> 91;
                case 11 -> 129;
                case 16 -> 178;
                case 4 -> 10;
                case 28 -> 161;
                case 6 -> 138;
                case 22 -> 113;
                case 29 -> 82;
                case 31 -> 117;
                default -> 95;
                case 27 -> 27;
                case 8 -> 160;
                case 23 -> 71;
                case 21 -> 40;
                case 14 -> 19;
                case 26 -> 197;
                case 19 -> 233;
                case 15 -> 38;
                case 1 -> 56;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

