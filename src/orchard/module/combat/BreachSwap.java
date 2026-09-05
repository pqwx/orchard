/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIIIlII
 * Module         : BreachSwap  [COMBAT]
 * Description    : Automatically swaps to a Breach mace during sword attacks, then switches back.   (client's own text)
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - _sword
 *   - breach
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
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.MaceItem
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 */
package orchard.module.combat;

import java.util.Iterator;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MaceItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIlI;
import orchard.internal.IlIlllI;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;

@Environment(value=EnvType.CLIENT)
public final class BreachSwap
extends ModuleBase {
    private static final int I = 2;
    private LivingEntity l;
    private long II;
    private boolean Il;
    private final lIlIIlI lI;
    private static final double ll = 6.0;
    private int III;
    private int IIl;
    private static final float IlI = 4.0f;
    private static final int Ill = 9;
    private static final int[] lII;
    private static final String[] lIl;
    private static final Object[] llI;

    /*
     * Enabled aggressive block sorting
     */
    private EntityHitResult lI(MinecraftClient minecraftClient) {
        EntityHitResult entityHitResult;
        EntityHitResult entityHitResult2;
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (this.l == null) return null;
        HitResult hitResult = minecraftClient.crosshairTarget;
        EntityHitResult entityHitResult3 = entityHitResult2 = hitResult instanceof EntityHitResult ? (entityHitResult = (EntityHitResult)hitResult) : null;
        if (this.Illl(minecraftClient, entityHitResult2)) {
            return entityHitResult2;
        }
        entityHitResult = lIIllllI.lI(minecraftClient, 3.0);
        if (this.Illl(minecraftClient, entityHitResult)) {
            return entityHitResult;
        }
        if (!IlIlllI.lllII(minecraftClient, (Entity)this.l, 3.0)) return null;
        EntityHitResult entityHitResult4 = new EntityHitResult((Entity)this.l);
        return entityHitResult4;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IIIllIl(Entity entity, int n) {
        if (n != 0 && n != 3) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.lIII(minecraftClient)) return;
        if (!this.IlI(minecraftClient, entity)) {
            return;
        }
        if (!this.lII(minecraftClient, entity)) {
            return;
        }
        this.IllI(minecraftClient, entity);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIl(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (!(itemStack.getItem() instanceof MaceItem)) return false;
        if (!this.lllI(itemStack)) return false;
        return true;
    }

    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        this.lll(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(MinecraftClient minecraftClient, Entity entity) {
        if (minecraftClient == null) return false;
        if (entity == null) return false;
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof EntityHitResult)) return false;
        EntityHitResult entityHitResult = (EntityHitResult)hitResult;
        if (entityHitResult.getEntity() != entity) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lII(MinecraftClient minecraftClient, Entity entity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        if (minecraftClient.player.isUsingItem()) return false;
        if (!(minecraftClient.player.fallDistance <= 4.0)) return false;
        if (!this.lIIl(minecraftClient)) return false;
        if (IIlI.IIl(minecraftClient)) return false;
        if (!(entity instanceof LivingEntity)) return false;
        LivingEntity livingEntity = (LivingEntity)entity;
        if (livingEntity == minecraftClient.player) return false;
        if (!livingEntity.isAlive()) return false;
        if (!(livingEntity.squaredDistanceTo((Entity)minecraftClient.player) <= 36.0)) return false;
        return true;
    }

    @Override
    public int IIll() {
        return 2973;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean lIl(MinecraftClient minecraftClient) {
        EntityHitResult entityHitResult = this.lI(minecraftClient);
        if (!this.IIIlIIl() || this.l == null || entityHitResult == null || entityHitResult.getEntity() != this.l) {
            this.IIIII(minecraftClient);
            return false;
        }
        if (lIIllllI.Il(minecraftClient, (Entity)this.l)) {
            this.Il = false;
            this.IIl = Integer.MIN_VALUE;
            return false;
        }
        int n = this.III;
        boolean bl = false;
        lIIllllI.IllllII(true);
        try {
            bl = lIIllllI.IlIIIl(minecraftClient, this, n, () -> {
                lIIllllI.lIIIIl();
                try {
                    lIIllllI.IlIIIIl(minecraftClient);
                    boolean bl = lIIllllI.IIlllll(minecraftClient, entityHitResult);
                    return bl;
                }
                finally {
                    lIIllllI.IlIIlIl();
                }
            });
        }
        finally {
            lIIllllI.IllllII(false);
            this.IIIII(minecraftClient);
        }
        return bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lll(MinecraftClient minecraftClient) {
        if (this.l == null) {
            return;
        }
        if (this.Il) {
            if (minecraftClient != null && minecraftClient.player != null && minecraftClient.player.age <= this.IIl) {
                return;
            }
            this.Il = false;
            this.IIl = Integer.MIN_VALUE;
        }
        if (minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null && minecraftClient.interactionManager != null && minecraftClient.currentScreen == null && this.l.isAlive() && minecraftClient.world.getEntityById(this.l.getId()) == this.l) {
            EntityHitResult entityHitResult = this.lI(minecraftClient);
            if (entityHitResult == null) {
                this.IIIII(minecraftClient);
                return;
            }
            if (System.currentTimeMillis() < this.II) {
                return;
            }
            float[] fArray = IlIlllI.IlIll(minecraftClient, entityHitResult.getPos());
            if (fArray != null) {
                this.Il = IlIlllI.IIllll(minecraftClient, 250, fArray[0], fArray[1], () -> this.lIl(minecraftClient));
                this.IIl = this.Il ? minecraftClient.player.age + 2 : Integer.MIN_VALUE;
                return;
            }
            this.IIIII(minecraftClient);
            return;
        }
        this.IIIII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    public BreachSwap() {
        super(StringFactory.IIII("BreachSwap"), Category.II, StringFactory.IIII("uYFAkxRWRBWUCZNVFpPNiZmER9wNWBAd1yqNXA7Q1t6VlVeZWVNFDp4GmBkcxNGMnNRViA1WUxeERN9NB9bQ3ouDXYgaX1UP1wqeWgSd"));
        lIlIIlI lIlIIlI2;
        lIlIIlI2(StringFactory.IIII("vJFYnQA="), 0.0, 0.0, 500.0, 5.0);
        this.lI = this.IIlllIl(lIlIIlI2.IIII(StringFactory.IIII("ms")));
        this.III = -1;
        this.IIl = Integer.MIN_VALUE;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI(MinecraftClient minecraftClient, Entity entity) {
        if (this.l != null) {
            if (this.l == entity) return true;
            return false;
        }
        int n = this.lIlI(minecraftClient);
        if (n < 0) return false;
        this.III = n;
        this.l = (LivingEntity)entity;
        this.Il = false;
        this.IIl = Integer.MIN_VALUE;
        this.II = System.currentTimeMillis() + Math.round(Math.max(0.0, (Double)this.lI.lIl()));
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illl(MinecraftClient minecraftClient, EntityHitResult entityHitResult) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.l == null) return false;
        if (entityHitResult == null) return false;
        if (entityHitResult.getEntity() != this.l) return false;
        if (entityHitResult.getPos() == null) return false;
        if (!(minecraftClient.player.getEyePos().distanceTo(entityHitResult.getPos()) <= 3.0001)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.options.attackKey == null) return false;
        if (minecraftClient.options.attackKey.isPressed()) return true;
        if (lIIllllI.IIl(minecraftClient.options.attackKey) <= 0) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) {
            return false;
        }
        ItemStack itemStack = minecraftClient.player.getMainHandStack();
        if (itemStack == null) return false;
        if (!itemStack.isEmpty()) return Registries.ITEM.getId((Object)itemStack.getItem()).getPath().endsWith("_sword");
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int lIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return -1;
        if (minecraftClient.player == null) return -1;
        int n = lIIllllI.lllI(minecraftClient.player.getInventory());
        if (n >= 0 && n < 9) {
            if (this.IIl(minecraftClient.player.getInventory().getStack(n))) {
                return n;
            }
        }
        int n2 = 0;
        while (n2 < 9) {
            ItemStack itemStack = minecraftClient.player.getInventory().getStack(n2);
            if (this.IIl(itemStack)) return n2;
            ++n2;
        }
        return -1;
    }

    @Override
    public void llll() {
        this.IIIII(MinecraftClient.getInstance());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean lIll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        block3: {
            block2: {
                if (this.l == null) break block2;
                break block3;
            }
            if (this.lII(minecraftClient, (Entity)livingEntity)) return this.IllI(minecraftClient, (Entity)livingEntity);
            return false;
        }
        if (this.l != livingEntity) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean llII(LivingEntity livingEntity) {
        if (this.l == null) return false;
        if (livingEntity == null) return false;
        if (this.l == livingEntity) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean llIl() {
        if (this.l == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllI(ItemStack itemStack) {
        String string;
        RegistryEntry registryEntry;
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) {
            return false;
        }
        ItemEnchantmentsComponent itemEnchantmentsComponent = (ItemEnchantmentsComponent)itemStack.getOrDefault(DataComponentTypes.ENCHANTMENTS, (Object)ItemEnchantmentsComponent.DEFAULT);
        Iterator iterator = itemEnchantmentsComponent.getEnchantments().iterator();
        do {
            if (!iterator.hasNext()) return false;
        } while ((registryEntry = (RegistryEntry)iterator.next()) == null || !"breach".equals(string = registryEntry.getKey().map(registryKey -> registryKey.getValue().getPath()).orElse("")) || itemEnchantmentsComponent.getLevel(registryEntry) <= 0);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIII(MinecraftClient minecraftClient) {
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        this.l = null;
        this.III = -1;
        this.Il = false;
        this.IIl = Integer.MIN_VALUE;
        this.II = 0L;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIIIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (!this.IIIlIIl()) return false;
        if (livingEntity == null) return false;
        if (this.l == null) {
            if (this.lII(minecraftClient, (Entity)livingEntity)) return this.IllI(minecraftClient, (Entity)livingEntity);
            return false;
        }
        if (this.l != livingEntity) return false;
        return true;
    }

    private static int IIIlI(int n, int n2) {
        return lII[n ^ 0xAA2B77A7] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 31953;
        var7_2 = "\ucb52\ucbe0\ucb1a\ucbea\ucb0d\ucbf0\ucb79\ucba0\ucba4\ucb60\ucb38\ucb1b\ucba9\ucb7e\ucb9c\ucb96\ud514\ud590\ud540\ud5bf\ud54e\ud59c\ud51d\ud5d7\ud5e9\ud513\ud55c\ud55f\ud5eb\ud523\ud5a9\ud5bb\ud5a5\ud544\ud570\ud520\ud5dc\ud551\ud5a4\ud526\ud5d5\ud5cc\ud593\ud542\ud50a\ud53f\ud5cb\ud5ed\ud564\ud5af\ud514\ud5ef\ud56a\ud591\ud567\ud5b2\ud5d5\ud532\ud509\ud543\ud5a7\ud570\ud595\ud583\ud5ab\ud501\ud531\ud53f\ud5c5\ud564\ud59e\ud57b\ud5fd\ud583\ud590\ud50c\ud57a\ud524\ud5f9\ud5db\ud558\ud5c7\ud520\ud5c3\ud544\ud5f2\ud53e\ud5a3\ud585\ud521\ud539\ud50f\ud58e\ud55c\ud5d6\ud5f4\ud5e1\ud579\ud529\ud537\ud5d1\ud524\ud5c8\ud54c\ud5d7\ud5fb\ud5c3\ud519\ud56e\ud544\ud588\ud599\ud510\ud5ca\ud51c\ud593\ud525\ud5c3\ud568\ud58f\ue4b8\ue42c\ue4ef\ue408\ue4e4\ue41a\ue4a1\ue412\ubdc6\ubd5b\ubdae\ubd08\u1680\u166c\u16f3\u162b\u16df\u1602\u16aa\u1645\u3c21\u3c8b\u3c71\u3c81\u3c66\u3c9b\u3c12\u3ccb";
        var8_3 = "\u7cc1\u7cb9\u7cd9\u7cd5\u7cd9\u7cd9".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl12
        while (true) {
            block10: {
                block9: {
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_3.length) break block9;
                    var13_8 = 0;
lbl12:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = 0;
                    if (var13_8 == 0) break block10;
                }
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl41
            }
            BreachSwap.lIl = var9_4;
            BreachSwap.llI = new Object[var9_4.length];
            var2_11 = 344955444;
            var0_12 = "\u0093\u00c9\u009c\u00c5Dw@#:s\u00ad\u009f\u00df\u00dd\n4\u00ddq7|/\u00f6O@;w\u009a\u00ac\u00edqc\u00cbM\u0084\u00bf\u0088U\u00f3\u000e\u0010".getBytes("ISO-8859-1");
            var1_13 = var0_12.length / 4;
            BreachSwap.lII = new int[var1_13];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
                BreachSwap.lII[var4_15] = var5_16 ^= var2_11;
                var3_14 += 4;
            } while (++var4_15 < var1_13);
            return;
        }
        block8: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
            if (var15_10 >= var14_9.length) ** continue;
lbl41:
            // 2 sources

            switch (var15_10 % 5) {
                case 2: {
                    v0 = 18;
                    continue block8;
                }
                case 3: {
                    v0 = 121;
                    continue block8;
                }
                default: {
                    v0 = 38;
                    continue block8;
                }
                case 1: {
                    v0 = 102;
                    continue block8;
                }
                case 4: 
            }
            v0 = 113;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static String IIIll(int var0, int var1_1) {
        block51: {
            block50: {
                var3_2 = var0 ^ -635940351;
                ** GOTO lbl108
lbl3:
                // 1 sources

                while (true) {
                    block52: {
                        break block52;
lbl5:
                        // 1 sources

                        while (true) {
                            var9_9 = 122;
                            ** GOTO lbl138
                            break;
                        }
lbl8:
                        // 1 sources

                        while (true) {
                            var9_9 = 30;
                            ** GOTO lbl138
                            break;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            var9_9 = 35;
                            ** GOTO lbl138
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var9_9 = 185;
                            ** GOTO lbl138
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            var9_9 = 207;
                            ** GOTO lbl138
                            break;
                        }
lbl20:
                        // 1 sources

                        while (true) {
                            var9_9 = 58;
                            ** GOTO lbl138
                            break;
                        }
lbl23:
                        // 1 sources

                        while (true) {
                            var9_9 = 80;
                            ** GOTO lbl138
                            break;
                        }
                    }
                    if (++var8_8 < var4_4.length) break block50;
                    ** GOTO lbl80
lbl29:
                    // 1 sources

                    while (true) {
                        var9_9 = 241;
                        ** GOTO lbl138
                        break;
                    }
lbl32:
                    // 1 sources

                    while (true) {
                        var9_9 = 121;
                        ** GOTO lbl138
                        break;
                    }
                    break;
                }
lbl35:
                // 1 sources

                while (true) {
                    var5_5 = new Throwable().getStackTrace();
                    ** GOTO lbl119
                    break;
                }
            }
            block44: while (true) {
                switch (var8_8 & 31) {
                    case 1: {
                        ** continue;
                    }
                    case 15: {
                        ** continue;
                    }
                    case 24: {
                        ** continue;
                    }
                    case 11: {
                        ** continue;
                    }
                    case 23: {
                        ** continue;
                    }
                    case 31: {
                        ** continue;
                    }
                    case 16: {
                        ** continue;
                    }
                    case 28: {
                        ** continue;
                    }
                    case 30: {
                        ** continue;
                    }
                    case 6: {
                        var9_9 = 252;
                        ** GOTO lbl138
                    }
                    case 3: {
                        var9_9 = 82;
                        ** GOTO lbl138
                    }
                    case 18: {
                        var9_9 = 140;
                        ** GOTO lbl138
                    }
                    case 5: {
                        var9_9 = 23;
                        ** GOTO lbl138
                    }
                    case 20: {
                        var9_9 = 70;
                        ** GOTO lbl138
                    }
                    case 9: {
                        var9_9 = 245;
                        ** GOTO lbl138
                    }
                    case 27: {
                        var9_9 = 203;
                        ** GOTO lbl138
                    }
lbl80:
                    // 1 sources

                    return new String(var4_4).intern();
                    case 12: {
                        var9_9 = 111;
                        ** GOTO lbl138
                    }
                    case 8: {
                        var9_9 = 23;
                        ** GOTO lbl138
                    }
                    case 29: {
                        var9_9 = 217;
                        ** GOTO lbl138
                    }
                    case 4: {
                        var9_9 = 129;
                        ** GOTO lbl138
                    }
lbl93:
                    // 1 sources

                    while (true) {
                        var2_3 = (StackTraceElement[])BreachSwap.llI[var3_2];
                        break block44;
                        break;
                    }
                    case 21: {
                        var9_9 = 184;
                        ** GOTO lbl138
                    }
                    case 2: {
                        var9_9 = 193;
                        ** GOTO lbl138
                    }
                    case 25: {
                        var9_9 = 6;
                        ** GOTO lbl138
                    }
lbl105:
                    // 1 sources

                    while (true) {
                        var8_8 = 0;
                        continue block44;
                        break;
                    }
lbl108:
                    // 1 sources

                    var4_4 = BreachSwap.lIl[var3_2].toCharArray();
                    ** continue;
lbl110:
                    // 1 sources

                    while (true) {
                        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -1265911488;
                        ** continue;
                        break;
                    }
                    case 22: {
                        var9_9 = 14;
                        ** GOTO lbl138
                    }
                    case 19: {
                        var9_9 = 202;
                        ** GOTO lbl138
                    }
lbl119:
                    // 1 sources

                    BreachSwap.llI[var3_2] = var5_5;
                    break block51;
                    case 10: {
                        var9_9 = 248;
                        ** GOTO lbl138
                    }
                    default: {
                        var9_9 = 146;
                        ** GOTO lbl138
                    }
                    case 14: {
                        var9_9 = 67;
                        ** GOTO lbl138
                    }
lbl130:
                    // 1 sources

                    while (true) {
                        var5_5 = var2_3;
                        break block51;
                        break;
                    }
                    case 17: {
                        var9_9 = 243;
                        ** GOTO lbl138
                    }
                    case 26: {
                        var9_9 = 87;
lbl138:
                        // 32 sources

                        while (true) {
                            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
                            ** continue;
                            break;
                        }
                    }
                    case 7: {
                        var9_9 = 71;
                        ** GOTO lbl138
                    }
                }
                break;
            }
            ** while (var2_3 == null)
lbl145:
            // 1 sources

            ** while (true)
        }
        var6_6 = var5_5[1];
        ** while (true)
        {
            ** case 13:
        }
lbl150:
        // 1 sources

        var9_9 = 213;
        ** while (true)
    }
}

