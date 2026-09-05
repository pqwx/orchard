/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IllIIllI
 * Module         : Nametags  [RENDER]
 * Description    : Renders detailed informative tags above players.   (client's own text)
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Opacity
 *   - Scale
 *   - Armor
 *   - Self
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
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.render;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIlI;
import orchard.internal.IIllIIl;
import orchard.internal.IIllllllI;
import orchard.internal.IlIIlIl;
import orchard.internal.IllIlI;
import orchard.internal.IlllI;
import orchard.internal.lIIIlIII;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;
import orchard.internal.llllIII;
import orchard.internal.lllllIII;
import orchard.internal.lllllIll;

@Environment(value=EnvType.CLIENT)
public final class Nametags
extends ModuleBase {
    private static final int I = 16;
    private final llIll l;
    private static final int II = 15;
    private final lIlIIlI Il = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Scale"), 1.0, 0.5, 2.0, 0.05));
    private static final int lI = 6;
    private static final int ll = 3;
    private final lIlIIlI III = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Opacity"), 200.0, 0.0, 255.0, 5.0));
    private final lllllIII<Integer> IIl;
    private static final int IlI = 2;
    private final llIll Ill = this.IIlllIl(new llIll((Object)StringFactory.IIII("Armor"), true));
    private final List<IlllI> lII;
    private static final int[] lIl;
    private static final String[] llI;
    private static final Object[] lll;

    /*
     * Unable to fully structure code
     */
    @Override
    public void Ill(II var1_1) {
        block14: {
            block12: {
                block15: {
                    block17: {
                        block16: {
                            block11: {
                                block13: {
                                    block10: {
                                        break block14;
                                        return;
lbl3:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl5:
                                        // 1 sources

                                        while (true) {
                                            if (var2_2.player == null) break block10;
                                            break block11;
                                            break;
                                        }
lbl8:
                                        // 1 sources

                                        while (true) {
                                            if (IllIlI.lIIll(var1_1)) break block12;
                                            break block13;
                                            break;
                                        }
                                        var7_7 = this.IllI(var1_1, var2_2, var6_6, var3_3);
                                        if (var7_7 == null) break block15;
                                        break block16;
lbl14:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
lbl17:
                                    // 2 sources

                                    return;
                                }
lbl20:
                                // 2 sources

                                return;
                            }
                            if (var2_2.world == null) {
                                ** continue;
                            }
                            break block17;
                        }
                        this.lII.add(this.llII(var7_7));
                        break block15;
lbl30:
                        // 1 sources

                        while (true) {
                            var6_6 = var5_5.next();
                            ** continue;
                            break;
                        }
                    }
                    var3_3 = lIIllllI.IlIIII(var2_2);
                    ** while (true)
                }
lbl37:
                // 2 sources

                while (true) {
                    if (!var5_5.hasNext()) ** continue;
                    ** continue;
                    break;
                }
            }
            var2_2 = MinecraftClient.getInstance();
            ** while (true)
            var4_4 = (Boolean)this.l.lIl();
            var5_5 = this.IIII(var2_2, var4_4).iterator();
            ** while (true)
        }
        this.lII.clear();
        ** while (!this.IIIlIIl())
lbl49:
        // 1 sources

        ** while (true)
    }

    /*
     * Unable to fully structure code
     */
    private IIllIIl I(II var1_1, Box var2_2) {
        block13: {
            block17: {
                block10: {
                    block18: {
                        block14: {
                            block15: {
                                block12: {
                                    block11: {
                                        block16: {
                                            break block16;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl3:
                                            // 1 sources

                                            return new IIllIIl(var18_5 / (double)var22_13, var20_12);
lbl5:
                                            // 1 sources

                                            while (Double.isFinite(var18_5)) {
                                                break block10;
                                            }
                                            break block17;
lbl8:
                                            // 1 sources

                                            while (true) {
                                                var18_5 = 0.0;
                                                ** continue;
                                                break;
                                            }
                                        }
                                        var3_3 = var2_2.minX;
                                        break block18;
lbl14:
                                        // 1 sources

                                        while (true) {
                                            var20_12 = Math.min(var20_12, var25_16.I());
                                            break block11;
                                            break;
                                        }
lbl17:
                                        // 1 sources

                                        while (true) {
                                            var23_14 = var17_4.iterator();
                                            break block12;
lbl20:
                                            // 1 sources

                                            while (var25_16 == null) {
                                                break block12;
                                            }
                                            break block13;
                                            break;
                                        }
lbl23:
                                        // 1 sources

                                        while (true) {
                                            continue;
lbl25:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
                                            var9_8 = var2_2.minZ;
                                            break block14;
                                            break;
                                        }
lbl29:
                                        // 1 sources

                                        while (true) {
                                            break block15;
                                            break;
                                        }
                                    }
                                    ++var22_13;
                                }
                                ** while (var23_14.hasNext())
lbl35:
                                // 1 sources

                                if (var22_13 == 0) break block17;
                                ** GOTO lbl5
                            }
                            var24_15 = var23_14.next();
                            var25_16 = IllIlI.llIll(var1_1, var24_15);
                            ** GOTO lbl20
                        }
                        var11_9 = (var2_2.minZ + var2_2.maxZ) * 0.5;
                        var13_10 = var2_2.maxZ;
                        ** while (true)
                    }
                    var5_6 = (var2_2.minX + var2_2.maxX) * 0.5;
                    var7_7 = var2_2.maxX;
                    ** while (true)
                }
                ** while (Double.isFinite((double)var20_12))
lbl51:
                // 1 sources

                break block17;
                var20_12 = Infinity;
                var22_13 = 0;
                ** while (true)
                var15_11 = var2_2.maxY + 0.4;
                var17_4 = List.of(new Vec3d(var5_6, var15_11, var11_9), new Vec3d(var3_3, var15_11, var9_8), new Vec3d(var3_3, var15_11, var11_9), new Vec3d(var3_3, var15_11, var13_10), new Vec3d(var5_6, var15_11, var9_8), new Vec3d(var5_6, var15_11, var13_10), new Vec3d(var7_7, var15_11, var9_8), new Vec3d(var7_7, var15_11, var11_9), new Vec3d(var7_7, var15_11, var13_10));
                ** while (true)
            }
            return null;
        }
        var18_5 += var25_16.l();
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean lI() {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return false;
        if (clientEntrypoint.IlI() == null) return false;
        Nametags nametags = clientEntrypoint.IlI().IllllI();
        if (nametags == null) return false;
        if (!nametags.IIIlIIl()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Nametags() {
        super(StringFactory.IIII("Nametags"), Category.l, StringFactory.IIII("Renders detailed informative tags above players."));
        this.l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Self"), false));
        this.IIl = new lllllIII();
        this.lII = new ArrayList<IlllI>();
    }

    private void IIl(DrawContext drawContext, TextRenderer textRenderer, IlIIlIl ilIIlIl, int n) {
        double d = ilIIlIl.II() + 3.0;
        IIIlI.IlIIll(drawContext, textRenderer, ilIIlIl.Il(), ilIIlIl.l(), d, lIIIlIII.II(0xFFFFFF, n));
    }

    private void IlI(PlayerEntity playerEntity, EquipmentSlot equipmentSlot, List<ItemStack> list) {
        block0: {
            ItemStack itemStack = playerEntity.getEquippedStack(equipmentSlot);
            if (itemStack.isEmpty()) break block0;
            list.add(itemStack);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lII(MinecraftClient minecraftClient, List<PlayerEntity> list, PlayerEntity playerEntity, boolean bl) {
        if (playerEntity == null) {
            return;
        }
        if (playerEntity == minecraftClient.player && !bl) {
            return;
        }
        if (playerEntity.isRemoved()) return;
        if (!playerEntity.isAlive()) {
            return;
        }
        if (playerEntity == minecraftClient.player || !IIllllllI.l(playerEntity)) {
            list.add(playerEntity);
            return;
        }
    }

    @Override
    public void III() {
        if (!this.IIIlIIl()) {
            this.IIl.IIl();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(DrawContext drawContext, MinecraftClient minecraftClient, IlllI illlI) {
        PlayerEntity playerEntity = illlI.lI();
        TextRenderer textRenderer = minecraftClient.textRenderer;
        double d = this.lll(playerEntity);
        double d2 = (Double)this.Il.lIl() * this.lIll(illlI.Il());
        int n = (int)Math.round((Double)this.III.lIl());
        IlIIlIl ilIIlIl = this.IIlI(textRenderer, playerEntity);
        IIIlI.lIlIIl(drawContext);
        IIIlI.Ill(drawContext, illlI.l(), illlI.II());
        IIIlI.IIlll(drawContext, d2, d2);
        this.Illl(drawContext, ilIIlIl, d, n);
        this.IIl(drawContext, textRenderer, ilIIlIl, n);
        if (((Boolean)this.Ill.lIl()).booleanValue()) {
            this.lIIl(drawContext, playerEntity, textRenderer, (int)(ilIIlIl.II() - 3.0 - 16.0), n);
        }
        IIIlI.IlIllI(drawContext);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double lll(PlayerEntity playerEntity) {
        float f = playerEntity.getMaxHealth() + playerEntity.getAbsorptionAmount();
        if (f <= 0.0f) {
            return 0.0;
        }
        double d = Math.max(0.0, Math.min(1.0, (double)((playerEntity.getHealth() + playerEntity.getAbsorptionAmount()) / f)));
        return d;
    }

    /*
     * Enabled aggressive block sorting
     */
    private List<PlayerEntity> IIII(MinecraftClient minecraftClient, boolean bl) {
        ArrayList<PlayerEntity> arrayList = new ArrayList<PlayerEntity>();
        Iterator iterator = minecraftClient.world.getPlayers().iterator();
        while (iterator.hasNext()) {
            PlayerEntity playerEntity = (PlayerEntity)iterator.next();
            this.lII(minecraftClient, arrayList, playerEntity, bl);
        }
        return arrayList;
    }

    @Override
    public void llll() {
        this.IIl.IIl();
        this.lII.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIIlIl IIlI(TextRenderer textRenderer, PlayerEntity playerEntity) {
        String string = playerEntity.getName().getString();
        int n = this.lIlI(textRenderer, string);
        double d = (double)n + 12.0;
        double d2 = -d / 2.0;
        double d3 = -10.0;
        return new IlIIlIl(string, d2, d3, d, d2 + 6.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private List<ItemStack> IlII(PlayerEntity playerEntity) {
        ArrayList<ItemStack> arrayList = new ArrayList<ItemStack>(4);
        this.IlI(playerEntity, EquipmentSlot.HEAD, arrayList);
        this.IlI(playerEntity, EquipmentSlot.CHEST, arrayList);
        this.IlI(playerEntity, EquipmentSlot.LEGS, arrayList);
        this.IlI(playerEntity, EquipmentSlot.FEET, arrayList);
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlllI IllI(II iI, MinecraftClient minecraftClient, PlayerEntity playerEntity, float f) {
        Vec3d vec3d = IllIlI.IIlIlI((Entity)playerEntity, f);
        Box box = playerEntity.getDimensions(playerEntity.getPose()).getBoxAt(vec3d);
        IIllIIl iIllIIl = this.I(iI, box);
        if (iIllIIl == null && !IllIlI.IIlII(minecraftClient, iI, (Entity)playerEntity, vec3d)) {
            return null;
        }
        if (iIllIIl != null) {
            IlllI illlI;
            illlI(playerEntity, iIllIIl.l(), iIllIIl.I(), minecraftClient.player.squaredDistanceTo(vec3d), iIllIIl.I());
            return illlI;
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void Illl(DrawContext drawContext, IlIIlIl ilIIlIl, double d, int n) {
        IIIlI.Illl(drawContext, ilIIlIl.lI(), ilIIlIl.II(), ilIIlIl.I(), 15.0, 3.0, lIIIlIII.II(1185824, Math.min(255, n)));
        int n2 = lIIIlIII.II(lIIIlIII.I(d).getRGB(), n);
        IIIlI.III(drawContext, ilIIlIl.lI() + 3.0, ilIIlIl.II() + 15.0 - 2.0, (ilIIlIl.I() - 6.0) * d, 1.0, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIII(DrawContext drawContext, ItemStack itemStack, int n, int n2, TextRenderer textRenderer, int n3) {
        IIIlI.II(drawContext, textRenderer, itemStack, n, n2);
        if (itemStack.getCount() <= 1) return;
        IIIlI.lIlIIl(drawContext);
        IIIlI.Ill(drawContext, (double)n + 14.0, (double)n2 + 14.0);
        IIIlI.IIlll(drawContext, 0.5, 0.5);
        IIIlI.IlIIll(drawContext, textRenderer, String.valueOf(itemStack.getCount()), 0.0, 0.0, lIIIlIII.II(0xFFFFFF, n3));
        IIIlI.IlIllI(drawContext);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIl(DrawContext drawContext, PlayerEntity playerEntity, TextRenderer textRenderer, int n, int n2) {
        List<ItemStack> list = this.IlII(playerEntity);
        int n3 = !list.isEmpty() ? list.size() * 16 + (list.size() - 1) * 2 : 0;
        int n4 = -n3 / 2;
        Iterator<ItemStack> iterator = list.iterator();
        while (iterator.hasNext()) {
            ItemStack itemStack = iterator.next();
            this.lIII(drawContext, itemStack, n4, n, textRenderer, n2);
            n4 += 18;
        }
        return;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int lIlI(TextRenderer textRenderer, String string) {
        int n;
        int n2 = llllIII.IIIl(string);
        if (n2 >= 0) {
            n = n2;
            return n;
        }
        n = textRenderer.getWidth(string);
        return n;
    }

    private double lIll(double d) {
        double d2 = Math.sqrt(d);
        return Math.max(0.6, Math.min(1.0, 1.0 - (d2 - 10.0) * 0.005));
    }

    private IlllI llII(IlllI illlI) {
        PlayerEntity playerEntity = illlI.lI();
        if (playerEntity == null) {
            return illlI;
        }
        lllllIll lllllIll2 = this.IIl.l(playerEntity.getId(), illlI.l(), illlI.II(), illlI.Il());
        return new IlllI(playerEntity, lllllIll2.I(), lllllIll2.l(), illlI.Il(), illlI.I());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean llIl(Entity entity) {
        if (!(entity instanceof PlayerEntity)) return false;
        if (!Nametags.lI()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        if (this.lII.isEmpty()) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.textRenderer == null) {
            return;
        }
        Iterator<IlllI> iterator = this.lII.iterator();
        while (iterator.hasNext()) {
            IlllI illlI = iterator.next();
            this.lIl(drawContext, minecraftClient, illlI);
        }
    }

    private static int lllI(int n, int n2) {
        return lIl[n ^ 0x22CB85D] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block30: {
            block25: {
                block31: {
                    block29: {
                        block27: {
                            block28: {
                                block24: {
                                    block26: {
                                        block23: {
                                            break block28;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                ** GOTO lbl21
lbl3:
                                                // 1 sources

                                                while (true) {
                                                    v0 = 60;
                                                    break block23;
                                                    break;
                                                }
                                                break;
                                            }
lbl6:
                                            // 1 sources

                                            while (true) {
                                                continue;
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
                                                var10_5 = 0;
                                                ** GOTO lbl43
                                                break;
                                            }
                                            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                                            var15_10 = 0;
                                            block11: while (true) {
                                                switch (var15_10 % 5) {
                                                    case 1: {
                                                        ** continue;
                                                    }
lbl19:
                                                    // 1 sources

                                                    while (true) {
                                                        continue;
                                                        break;
                                                    }
lbl21:
                                                    // 1 sources

                                                    if (var15_10 < var14_9.length) continue block11;
                                                    break;
                                                    case 4: {
                                                        v0 = 90;
                                                        break block11;
                                                    }
lbl26:
                                                    // 1 sources

                                                    return;
lbl28:
                                                    // 1 sources

                                                    while (true) {
                                                        var13_8 = -1;
                                                        ** GOTO lbl10
                                                        break;
                                                    }
lbl31:
                                                    // 1 sources

                                                    while (++var10_5 >= var8_3.length) {
                                                        break block24;
                                                    }
                                                    break block25;
                                                    case 3: {
                                                        v0 = 32;
                                                        break block11;
                                                    }
                                                    var3_14 = 0;
                                                    var4_15 = 0;
                                                    break block26;
lbl40:
                                                    // 1 sources

                                                    while (true) {
                                                        var12_7 = '\u0000';
                                                        break block27;
                                                        break;
                                                    }
lbl43:
                                                    // 1 sources

                                                    var11_6 = 0;
                                                    ** continue;
                                                }
                                                break;
                                            }
                                        }
lbl46:
                                        // 3 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl48:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl50:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                        {
                                            default: {
                                                v0 = 79;
                                                ** break;
                                            }
                                        }
                                        break block29;
                                    }
lbl57:
                                    // 2 sources

                                    while (true) {
                                        var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                                        ** continue;
                                        break;
                                    }
                                }
                                var13_8 = 0;
                                ** while (true)
                            }
                            var6 = 30222;
                            var7_2 = "\u61c4\u61bb\u6115\u6141\u61ca\u612b\u61f8\u6112\u614d\u61d0\u6190\u61fc\u4e20\u4e50\u4e5a\u4e7f\u4e11\u4e71\u4e68\u4e5a\u4e6f\u4e75\u4e18\u4e0c\u4e58\u4e17\u4e0a\u4e78\u4e02\u4e28\u4e2d\u4e04\u4e04\u4e6c\u4e3f\u4e60\u4e6f\u4e23\u4e71\u4e4d\u4e6e\u4e68\u4e63\u4e7c\u4e3d\u4e75\u4e7f\u4e69\u4e08\u4e5b\u4e2d\u4e7e\u4e5e\u4e2f\u4e33\u4e08\u4e75\u4e6d\u4e09\u4e3b\u4e02\u4e13\u4e6d\u4e0e\u4e4c\u4e07\u4e1b\u4e6c\u4e76\u4e31\u4e1f\u4e73\u4e1a\u4e7d\u4e69\u4e6f\uaf13\uaf3c\uaf2b\uaf05\uaf0c\uaf7e\uaf7e\uaf70\uee67\ue1d4\uee3e\uee6a\uee68\uee73\uee6a\uee20\uee69\uee1d\ue1ac\ue1df\uda1b\uda0c\uda4d\uda15\uda18\uda19\uda66\uda54\u0314\u032b\u035e\u0313\u0305\u0306\u0313\u0357";
                            ** while (true)
                        }
                        if (var13_8 != 0) break block25;
                        break block30;
                        {
                            ** case 2:
                        }
lbl71:
                        // 1 sources

                        v0 = 120;
                        ** while (true)
lbl73:
                        // 1 sources

                        while (true) {
                            ** GOTO lbl31
                            break;
                        }
                        var16_1 = v0;
                        v1 = var15_10++;
                        var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
                        ** while (true)
lbl79:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                        var8_3 = "\f@\b\f\b\b".toCharArray();
                        var9_4 = new String[var8_3.length];
                        ** while (true)
                    }
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    ** while (true)
                    Nametags.lll = new Object[var9_4.length];
                    break block31;
                    var1_12 = var0_11.length / 4;
                    Nametags.lIl = new int[var1_12];
                    ** while (true)
                    Nametags.lIl[var4_15] = var5_16 ^= var2_13;
                    var3_14 += 4;
                    ** while (++var4_15 < var1_12)
lbl96:
                    // 1 sources

                    ** while (true)
                }
                var2_13 = 2079288925;
                var0_11 = "!{4\u0088\u00fe\u008e\u0097\u00f9\u00c8\u00a4\u00f1%\u00b9\u00e9_4\b\u00a8Dg".getBytes("ISO-8859-1");
                ** while (true)
            }
            var12_7 = var8_3[var10_5];
            ** while (true)
        }
        Nametags.llI = var9_4;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIIII(char c, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = c ^ 0xCCE7;
        char[] cArray = llI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lll[n3];
        if (stackTraceElementArray2 == null) {
            Nametags.lll[n3] = stackTraceElementArray = new Throwable().getStackTrace();
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6179;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 34462;
            n7 -= 6014;
            n7 += 10819;
            n7 -= 41289;
            n7 -= 65250;
            cArray[n6] = (char)((n7 -= 28315) ^ n4 ^ n ^ n2 >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

