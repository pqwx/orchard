/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIIlII
 * Module         : ItemESP  [RENDER]
 * Description    : Highlights dropped items through walls.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Max Distance
 *   - Line Width
 *   - .getBytes(
 *   - Names
 *   - Color
 *   - Mode
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
 *  net.minecraft.client.render.Camera
 *  net.minecraft.client.render.command.OrderedRenderCommandQueue
 *  net.minecraft.client.render.entity.EntityRenderer
 *  net.minecraft.client.render.entity.ItemEntityRenderer
 *  net.minecraft.client.render.entity.state.ItemEntityRenderState
 *  net.minecraft.client.render.state.CameraRenderState
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.ItemEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.render;

import java.awt.Color;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.ItemEntityRenderer;
import net.minecraft.client.render.entity.state.ItemEntityRenderState;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIIIIII;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIIllI;
import orchard.internal.IIIlI;
import orchard.internal.IllIlI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIlIlII;
import orchard.internal.llIll;
import orchard.internal.lllllIII;

@Environment(value=EnvType.CLIENT)
public final class ItemESP
extends ModuleBase {
    private final lIlIIlI I;
    private final llIlIlII l;
    private final List<IIIIIllI> II;
    private static boolean Il;
    private final lIlIIlI lI;
    private static String[] ll;
    private static Field III;
    private final llIll IIl;
    private final IIIIIIIIl<IIIIIIII> IlI = this.IIlllIl(new IIIIIIIIl<IIIIIIII>(StringFactory.IIII("Mode"), IIIIIIII.class, IIIIIIII.I));
    private final lllllIII<Integer> Ill;
    private static final int[] lII;
    private static final String[] lIl;
    private static final Object[] llI;

    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0xDF6410B7 ^ n;
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
    @Override
    public void Ill(II var1_1) {
        block17: {
            block11: {
                block19: {
                    block16: {
                        block18: {
                            block12: {
                                block15: {
                                    block13: {
                                        block14: {
                                            this.II.clear();
                                            if (!this.IIIlIIl()) break block17;
                                            break block18;
lbl4:
                                            // 1 sources

                                            while (true) {
                                                var9_8.add(var12_11.getId());
                                                var17_16 = var12_11.squaredDistanceTo((Entity)var2_2.player);
                                                var19_17 = this.Ill.l(var12_11.getId(), var16_15.l(), var16_15.I(), var17_16);
                                                this.II.add(new IIIIIllI(this.IlI(var13_12), var19_17.I(), var19_17.l()));
                                                break block11;
                                                break;
                                            }
lbl12:
                                            // 1 sources

                                            while ((var13_12 = var12_11.getStack()) != null) {
                                                break block12;
                                            }
                                            break block11;
lbl15:
                                            // 1 sources

                                            while (true) {
                                                if (var2_2.world != null) break block13;
                                                break block14;
                                                break;
                                            }
lbl18:
                                            // 1 sources

                                            while (true) {
                                                var14_13 = IllIlI.IIlIlI((Entity)var12_11, var6_6);
                                                if (var4_4 != IIIIIIII.I) break block15;
                                                break block16;
                                                break;
                                            }
                                        }
                                        while (true) {
                                            this.Ill.IIl();
                                            return;
                                        }
                                    }
                                    var3_3 = (Color)this.l.lIl();
                                    var4_4 = (IIIIIIII)this.IlI.lIl();
                                    var5_5 = (float)((Double)this.lI.lIl()).doubleValue();
                                    var6_6 = lIIllllI.IlIIII(var2_2);
                                    var7_7 = (Double)this.I.lIl() * (Double)this.I.lIl();
                                    var9_8 = new HashSet<Integer>();
                                    var10_9 = var2_2.world.getEntities().iterator();
                                    break block11;
                                }
                                this.IIII(var1_1, var2_2, var12_11, var6_6, var14_13);
                                break block19;
lbl38:
                                // 1 sources

                                while (true) {
                                    this.Ill.III(var9_8);
                                    return;
                                }
lbl41:
                                // 1 sources

                                while (var12_11.squaredDistanceTo((Entity)var2_2.player) > var7_7) {
                                    break block11;
                                }
                                ** GOTO lbl12
lbl44:
                                // 1 sources

                                while (!(var12_11 = (ItemEntity)var11_10).isAlive()) {
                                    break block11;
                                }
                                ** GOTO lbl41
lbl47:
                                // 1 sources

                                while (true) {
                                    var2_2 = MinecraftClient.getInstance();
                                    if (var2_2.player == null) ** continue;
                                    ** continue;
                                    break;
                                }
lbl51:
                                // 1 sources

                                while ((var16_15 = IllIlI.llIll(var1_1, (Vec3d)(var15_14 = var14_13.add(0.0, (double)var12_11.getHeight() + 0.45, 0.0)))) != null) {
                                    ** continue;
lbl53:
                                    // 1 sources

                                    ** GOTO lbl4
                                }
                                break block11;
                            }
                            ** while (!var13_12.isEmpty())
lbl57:
                            // 1 sources

                            break block11;
                        }
                        ** while (IllIlI.lIIll((Object)var1_1))
lbl60:
                        // 1 sources

                        break block17;
lbl61:
                        // 1 sources

                        while (true) {
                            var11_10 = (Entity)var10_9.next();
                            if (!(var11_10 instanceof ItemEntity)) break block11;
                            ** GOTO lbl44
                            break;
                        }
                    }
                    var15_14 = this.lll(var12_11, var14_13);
                    IllIlI.IlIl(var1_1, var15_14, var3_3, var3_3.getAlpha(), var5_5);
                }
                if (((Boolean)this.IIl.lIl()).booleanValue()) ** GOTO lbl51
            }
            ** while (!var10_9.hasNext())
lbl72:
            // 1 sources

            ** while (true)
        }
        this.Ill.IIl();
    }

    private String IlI(ItemStack itemStack) {
        String string = itemStack.getName().getString();
        if (itemStack.getCount() > 1) {
            int n = itemStack.getCount();
            String string2 = " x";
            String string3 = string;
            string = string3 + string2 + n;
        }
        return string;
    }

    private static void lII() {
        ItemESP.ll[0] = ItemESP.lI(ItemESP.IllI(-788565930, 404491792).toCharArray(), 64034L, 703964317);
        ItemESP.ll[1] = ItemESP.lI(ItemESP.IllI(-788565929, -261673055).toCharArray(), 11685L, -1645818527);
        ItemESP.ll[2] = ItemESP.lI(ItemESP.IllI(-788565932, 449577320).toCharArray(), 72366L, 2024137322);
        ItemESP.ll[3] = ItemESP.lI(ItemESP.IllI(-788565931, -841343384).toCharArray(), 95880L, 2078421049);
        ItemESP.ll[4] = ItemESP.lI(ItemESP.IllI(-788565934, -325234690).toCharArray(), 15993L, -62162589);
        ItemESP.ll[5] = ItemESP.lI(ItemESP.IllI(-788565933, 1704465574).toCharArray(), 138L, -1687456879);
        ItemESP.ll[6] = ItemESP.lI(ItemESP.IllI(-788565936, -974905931).toCharArray(), 44083L, -646979122);
        ItemESP.ll[7] = ItemESP.lI(ItemESP.IllI(-788565935, 1753837067).toCharArray(), 54107L, -1864530618);
        ItemESP.ll[8] = ItemESP.lI(ItemESP.IllI(-788565922, 1785923002).toCharArray(), 90164L, 1814276539);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        if (!this.IIIlIIl()) return;
        if ((Boolean)this.IIl.lIl() == false) return;
        if (drawContext == null) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) return;
        if (minecraftClient.world == null) return;
        if (minecraftClient.getWindow() == null) {
            return;
        }
        TextRenderer textRenderer = minecraftClient.textRenderer;
        if (textRenderer == null) {
            return;
        }
        Iterator<IIIIIllI> iterator = this.II.iterator();
        while (iterator.hasNext()) {
            IIIIIllI iIIIIllI = iterator.next();
            String string = iIIIIllI.l();
            int n3 = IIIlI.IIIlll(textRenderer, string);
            IIIlI.lllll(drawContext, textRenderer, string, iIIIIllI.II() - (double)n3 / 2.0, iIIIIllI.I(), ((Color)this.l.lIl()).getRGB());
        }
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private static Field lIl() {
        Field field;
        block4: {
            int n;
            int n2;
            Field[] fieldArray;
            block3: {
                if (Il) {
                    return III;
                }
                Il = true;
                fieldArray = MinecraftClient.getInstance().worldRenderer.getClass().getDeclaredFields();
                n2 = fieldArray.length;
                n = 0;
                if (!true) break block3;
                if (n >= n2) return III;
                if (OrderedRenderCommandQueue.class.isAssignableFrom((field = fieldArray[n]).getType())) break block4;
            }
            do {
                ++n;
                if (n >= n2) return III;
            } while (!OrderedRenderCommandQueue.class.isAssignableFrom((field = fieldArray[n]).getType()));
        }
        field.setAccessible(true);
        III = field;
        return III;
    }

    private Box lll(ItemEntity itemEntity, Vec3d vec3d) {
        if (itemEntity != null) {
            if (vec3d != null) {
                return itemEntity.getDimensions(itemEntity.getPose()).getBoxAt(vec3d);
            }
        }
        return Box.from((Vec3d)Vec3d.ZERO);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IIII(II iI, MinecraftClient minecraftClient, ItemEntity itemEntity, float f, Vec3d vec3d) {
        OrderedRenderCommandQueue orderedRenderCommandQueue = this.IIlI(minecraftClient);
        if (orderedRenderCommandQueue == null || iI.Il() == null || itemEntity == null || vec3d == null) {
            return;
        }
        EntityRenderer entityRenderer = minecraftClient.getEntityRenderDispatcher().getRenderer((Entity)itemEntity);
        if (!(entityRenderer instanceof ItemEntityRenderer)) {
            return;
        }
        ItemEntityRenderer itemEntityRenderer = (ItemEntityRenderer)entityRenderer;
        ItemEntityRenderState itemEntityRenderState = itemEntityRenderer.createRenderState();
        itemEntityRenderer.updateRenderState(itemEntity, itemEntityRenderState, f);
        itemEntityRenderState.light = 0xF000F0;
        Camera camera = iI.IIl() != null ? iI.IIl() : minecraftClient.gameRenderer.getCamera();
        Vec3d vec3d2 = camera.getCameraPos();
        CameraRenderState cameraRenderState = new CameraRenderState();
        cameraRenderState.pos = vec3d2;
        cameraRenderState.blockPos = camera.getBlockPos();
        cameraRenderState.orientation = camera.getRotation();
        cameraRenderState.initialized = true;
        iI.Il().push();
        try {
            iI.Il().translate(vec3d.x - vec3d2.x, vec3d.y - vec3d2.y, vec3d.z - vec3d2.z);
            itemEntityRenderer.render(itemEntityRenderState, iI.Il(), orderedRenderCommandQueue, cameraRenderState);
        }
        finally {
            iI.Il().pop();
        }
    }

    @Override
    public void llll() {
        this.II.clear();
        this.Ill.IIl();
    }

    public ItemESP() {
        super(StringFactory.IIII("ItemESP"), Category.l, StringFactory.IIII("Highlights dropped items through walls."), true);
        this.IIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Names"), true));
        this.l = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Color"), new Color(120, 200, 255, 220)));
        this.I = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Max Distance"), 96.0, 8.0, 256.0, 4.0).IIIl("m"));
        this.lI = this.IIlllIl((lIlIIlI)new lIlIIlI(StringFactory.IIII("Line Width"), 1.5, 0.5, 4.0, 0.1).lIII(() -> {
            if (this.IlI.lIl() != IIIIIIII.I) return false;
            return true;
        }));
        this.Ill = new lllllIII();
        this.II = new ArrayList<IIIIIllI>();
    }

    private OrderedRenderCommandQueue IIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null || minecraftClient.worldRenderer == null) {
            return null;
        }
        try {
            OrderedRenderCommandQueue orderedRenderCommandQueue;
            Field field = ItemESP.lIl();
            if (field == null) {
                return null;
            }
            Object object = field.get(minecraftClient.worldRenderer);
            return object instanceof OrderedRenderCommandQueue ? (orderedRenderCommandQueue = (OrderedRenderCommandQueue)object) : null;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return null;
        }
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 19584;
        String string = "\u067b\u3c29\ube4e\u040b\u086f\uaf1f\u1d65\u4bf3\u40cd\u9aca\ue0df\udaab\u5806\uc143\u37c4\u521a\u6b79\ub738\u052a\u4a7d\uf5e1\u5d3d\u0b50\u4b3f\ud396\u97eb\u0859\u93f1\uabb6\u3a16\uf8ac\u7ef3\ud535\u07cf\ua5cf\u3306\uf03f\u46de\u1c4e\ud8cd\ue3d5\u15c4\uc26d\ua2c3\u9d81\ub7b0\u61ed\u89ec\uece9\ub0be\uf21f\u6936\u8a63\u81d9\uc439\u3aaf\u05b9\uabcd\u9c7d\u0b35\u1d49\u1ed9\u2f26\u1949\u6d61\u84db\ucabe\uc36b\u0fef\uf804\u5f60\u8bc8\u3773\u8c31\u28a2\u7b45\ue202\uff1e\uf46e\ua356\u5c37\u3bdd\ub61f\u00f5\uf609\uac6a\u76ec\u2b21\ucc6c\ud24c\u9707\u1bea\u8318\u84e0\u69d6\ub99f\u7a65\u0bbe\u4c96\uf541\ud38b\u9894\u90d1\u741b\ub663\u7c06\ue4a0\udd70\u30de\ufac0\u82c6\u1009\ua9cc\u9ea7\u6966\u096e\uf9e3\ub277\udd55\u6d30\u63ac\uc842\u553a\u645f\ud5c0\ua52f\uee98\ub7a7";
        char[] cArray = "\u4c88\u4c90\u4cb4\u4c88\u4c88\u4c8c\u4c84\u4c90\u4c84".toCharArray();
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
        lIl = stringArray;
        llI = new Object[stringArray.length];
        int n6 = -1925940944;
        byte[] byArray = "\u00f1Va\u00be\u00f81v\u00dd\u00e8'S+\u0084\u00b2\u0012\u00a0n\u00f9\u008cV\u00ea>\u00cc\u00f4\u001d*\u008e\u0087\u00da\u009bn|)\r\u00a2\u0086\u007f\u0005G\u0098\u00d3\u00d0\u0019\u00cf!\u00dd\u0015\u009a\u00e2\u00d0}67\u00eeC\u00be\u00dd\u00e4\u007fI\u001d\u009c\u001b\u001c\u00a3\u00e2\u008c[T7\u00f0L\u00eakh\u0098\u0011sy/{HwU\u0084\u00c3w\u00aa\u00b1\u00e5\u00ccU".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        lII = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            ItemESP.lII[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        ll = new String[9];
        ItemESP.lII();
    }

    private static int IlII(int n, int n2) {
        return lII[n ^ 0xACBE8946] ^ n2 ^ n;
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String IllI(int var0, int var1_1) {
        var3_2 = var0 ^ -788565930;
        var4_4 = ItemESP.lIl[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])ItemESP.llI[var3_2];
        if (var2_3 == null) {
            var5_5 = new Throwable().getStackTrace();
            ItemESP.llI[var3_2] = var5_5;
        } else {
            var5_5 = var2_3;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 0x8083838;
        var8_8 = 0;
        if (true) ** GOTO lbl17
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) {
                return new String(var4_4).intern();
            }
lbl17:
            // 3 sources

            switch (var8_8 & 31) {
                case 25: {
                    var9_9 = 86;
                    continue block33;
                }
                case 21: {
                    var9_9 = 104;
                    continue block33;
                }
                case 11: {
                    var9_9 = 114;
                    continue block33;
                }
                case 20: {
                    var9_9 = 40;
                    continue block33;
                }
                case 4: {
                    var9_9 = 17;
                    continue block33;
                }
                case 26: {
                    var9_9 = 175;
                    continue block33;
                }
                case 3: {
                    var9_9 = 57;
                    continue block33;
                }
                case 9: {
                    var9_9 = 147;
                    continue block33;
                }
                case 30: {
                    var9_9 = 232;
                    continue block33;
                }
                case 7: {
                    var9_9 = 86;
                    continue block33;
                }
                case 28: {
                    var9_9 = 244;
                    continue block33;
                }
                case 24: {
                    var9_9 = 200;
                    continue block33;
                }
                case 10: {
                    var9_9 = 221;
                    continue block33;
                }
                case 12: {
                    var9_9 = 26;
                    continue block33;
                }
                case 31: {
                    var9_9 = 255;
                    continue block33;
                }
                case 14: {
                    var9_9 = 54;
                    continue block33;
                }
                case 29: {
                    var9_9 = 87;
                    continue block33;
                }
                case 17: {
                    var9_9 = 110;
                    continue block33;
                }
                case 27: {
                    var9_9 = 248;
                    continue block33;
                }
                case 18: {
                    var9_9 = 190;
                    continue block33;
                }
                case 16: {
                    var9_9 = 58;
                    continue block33;
                }
                case 6: {
                    var9_9 = 235;
                    continue block33;
                }
                case 23: {
                    var9_9 = 213;
                    continue block33;
                }
                case 1: {
                    var9_9 = 243;
                    continue block33;
                }
                default: {
                    var9_9 = 158;
                    continue block33;
                }
                case 8: {
                    var9_9 = 148;
                    continue block33;
                }
                case 15: {
                    var9_9 = 73;
                    continue block33;
                }
                case 5: {
                    var9_9 = 166;
                    continue block33;
                }
                case 22: {
                    var9_9 = 118;
                    continue block33;
                }
                case 2: {
                    var9_9 = 145;
                    continue block33;
                }
                case 19: {
                    var9_9 = 40;
                    continue block33;
                }
                case 13: 
            }
            var9_9 = 229;
        }
    }
}

