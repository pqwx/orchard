/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllllI
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
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.AttackRangeComponent
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.attribute.EntityAttribute
 *  net.minecraft.entity.attribute.EntityAttributeInstance
 *  net.minecraft.entity.attribute.EntityAttributeModifier
 *  net.minecraft.entity.attribute.EntityAttributeModifier$Operation
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.Identifier
 */
package orchard.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.AttackRangeComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeInstance;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

@Environment(value=EnvType.CLIENT)
public final class lIllllI {
    private static final double I = 1.0E-6;
    private static final float l = 0.85f;
    private static final double II = 20.0;
    private static final double Il = 5.0;

    /*
     * Enabled aggressive block sorting
     */
    private static List<EntityAttributeModifier> I(ItemStack itemStack) {
        if (itemStack == null) return List.of();
        if (!itemStack.isEmpty()) {
            ArrayList<EntityAttributeModifier> arrayList = new ArrayList<EntityAttributeModifier>();
            itemStack.applyAttributeModifiers(EquipmentSlot.MAINHAND, (registryEntry, entityAttributeModifier) -> {
                if (registryEntry.equals((Object)EntityAttributes.ATTACK_SPEED)) {
                    arrayList.add((EntityAttributeModifier)entityAttributeModifier);
                }
            });
            return arrayList;
        }
        return List.of();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static double l(double d) {
        if (!Double.isFinite(d)) return Double.POSITIVE_INFINITY;
        if (!(d > 0.0)) return Double.POSITIVE_INFINITY;
        double d2 = 20.0 / d;
        return d2;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static double II(double d, Iterable<EntityAttributeModifier> iterable, Iterable<EntityAttributeModifier> iterable2, Iterable<EntityAttributeModifier> iterable3) {
        EntityAttributeModifier entityAttributeModifier;
        LinkedHashMap<Identifier, EntityAttributeModifier> linkedHashMap = new LinkedHashMap<Identifier, EntityAttributeModifier>();
        lIllllI.IlI(linkedHashMap, iterable);
        lIllllI.ll(linkedHashMap, iterable2);
        lIllllI.IlI(linkedHashMap, iterable3);
        double d2 = d;
        Iterator iterator = linkedHashMap.values().iterator();
        boolean bl = true;
        block0: while (true) {
            EntityAttributeModifier entityAttributeModifier2;
            if (!bl || (bl = false) || !true) {
                d2 += entityAttributeModifier2.value();
            }
            while (iterator.hasNext()) {
                entityAttributeModifier2 = (EntityAttributeModifier)iterator.next();
                if (entityAttributeModifier2.operation() != EntityAttributeModifier.Operation.ADD_VALUE) continue;
                continue block0;
            }
            break;
        }
        double d3 = d2;
        Iterator iterator2 = linkedHashMap.values().iterator();
        boolean bl2 = true;
        block2: while (true) {
            if (!bl2 || (bl2 = false) || !true) {
                d3 += d2 * entityAttributeModifier.value();
            }
            while (iterator2.hasNext()) {
                entityAttributeModifier = (EntityAttributeModifier)iterator2.next();
                if (entityAttributeModifier.operation() != EntityAttributeModifier.Operation.ADD_MULTIPLIED_BASE) continue;
                continue block2;
            }
            break;
        }
        iterator2 = linkedHashMap.values().iterator();
        while (iterator2.hasNext()) {
            entityAttributeModifier = (EntityAttributeModifier)iterator2.next();
            if (entityAttributeModifier.operation() != EntityAttributeModifier.Operation.ADD_MULTIPLIED_TOTAL) continue;
            d3 *= 1.0 + entityAttributeModifier.value();
        }
        return d3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean Il(ClientPlayerEntity clientPlayerEntity, ItemStack itemStack, float f) {
        if (clientPlayerEntity == null) return false;
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) {
            return false;
        }
        if (!clientPlayerEntity.getItemCooldownManager().isCoolingDown(itemStack)) {
            double d = lIllllI.l(lIllllI.IIl(clientPlayerEntity, itemStack));
            float f2 = ((Float)itemStack.getOrDefault(DataComponentTypes.MINIMUM_ATTACK_CHARGE, (Object)Float.valueOf(0.0f))).floatValue();
            return lIllllI.lIl(clientPlayerEntity.getAttackCooldownProgress(f), clientPlayerEntity.getAttackCooldownProgressPerTick(), d, f2);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean lI(float f, float f2, double d) {
        if (!Float.isFinite(f)) return false;
        if (!Float.isFinite(f2)) return false;
        if (!Double.isFinite(d)) return false;
        if (f2 <= 0.0f) return false;
        if (d <= 0.0) {
            return false;
        }
        double d2 = Math.max(0.0, Math.min(1.0, (double)f));
        double d3 = d2 * (double)f2;
        if (!(d3 + 1.0E-6 >= d * (double)0.85f)) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private static void ll(Map<Identifier, EntityAttributeModifier> var0, Iterable<EntityAttributeModifier> var1_1) {
        block2: {
            block1: {
                if (var1_1 != null) break block1;
                break block2;
lbl3:
                // 1 sources

                while (true) {
                    var3_3 = var2_2.next();
                    if (var3_3 == null) continue;
                    var0.remove(var3_3.id());
                    continue;
                    break;
                }
            }
            var2_2 = var1_1.iterator();
            ** while (var2_2.hasNext())
lbl12:
            // 1 sources

            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean III(ClientPlayerEntity clientPlayerEntity, ItemStack itemStack, float f) {
        if (clientPlayerEntity == null) return false;
        if (itemStack == null) return false;
        if (!itemStack.isEmpty()) {
            if (!clientPlayerEntity.getItemCooldownManager().isCoolingDown(itemStack)) {
                double d = lIllllI.l(lIllllI.IIl(clientPlayerEntity, itemStack));
                return lIllllI.lI(clientPlayerEntity.getAttackCooldownProgress(f), clientPlayerEntity.getAttackCooldownProgressPerTick(), d);
            }
            return false;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static double IIl(ClientPlayerEntity clientPlayerEntity, ItemStack itemStack) {
        if (clientPlayerEntity == null) return 0.0;
        if (itemStack == null) return 0.0;
        if (itemStack.isEmpty()) {
            return 0.0;
        }
        EntityAttributeInstance entityAttributeInstance = clientPlayerEntity.getAttributeInstance(EntityAttributes.ATTACK_SPEED);
        if (entityAttributeInstance == null) {
            return 0.0;
        }
        double d = lIllllI.II(entityAttributeInstance.getBaseValue(), entityAttributeInstance.getModifiers(), lIllllI.I(clientPlayerEntity.getMainHandStack()), lIllllI.I(itemStack));
        return ((EntityAttribute)EntityAttributes.ATTACK_SPEED.value()).clamp(d);
    }

    /*
     * Unable to fully structure code
     */
    private static void IlI(Map<Identifier, EntityAttributeModifier> var0, Iterable<EntityAttributeModifier> var1_1) {
        block4: {
            block5: {
                block6: {
                    if (var1_1 != null) break block5;
                    break block6;
lbl3:
                    // 1 sources

                    return;
lbl5:
                    // 1 sources

                    while (true) {
                        var0.put(var3_3.id(), var3_3);
                        break block4;
                        break;
                    }
lbl9:
                    // 1 sources

                    while (true) {
                        var3_3 = var2_2.next();
                        if (var3_3 != null) {
                            ** continue;
                        }
                        break block4;
                        break;
                    }
                }
                return;
            }
            var2_2 = var1_1.iterator();
        }
        ** while (!var2_2.hasNext())
lbl20:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static AttackRangeComponent Ill(ClientPlayerEntity clientPlayerEntity, ItemStack itemStack) {
        if (clientPlayerEntity == null) {
            return null;
        }
        AttackRangeComponent attackRangeComponent = AttackRangeComponent.defaultForEntity((LivingEntity)clientPlayerEntity);
        if (itemStack == null) return attackRangeComponent;
        if (!itemStack.isEmpty()) return (AttackRangeComponent)itemStack.getOrDefault(DataComponentTypes.ATTACK_RANGE, (Object)attackRangeComponent);
        return attackRangeComponent;
    }

    private lIllllI() {
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean lIl(float f, float f2, double d, float f3) {
        double d2;
        if (!Float.isFinite(f)) return false;
        if (!Float.isFinite(f2)) return false;
        if (!Double.isFinite(d)) return false;
        if (!Float.isFinite(f3)) return false;
        if (f2 <= 0.0f) return false;
        if (d <= 0.0) return false;
        double d3 = Math.max(0.0, Math.min(1.0, (double)f));
        double d4 = d3 * (double)f2;
        if (!(d4 + 5.0 + 1.0E-6 >= d * (d2 = Math.max(0.0, (double)f3)))) return false;
        return true;
    }
}

