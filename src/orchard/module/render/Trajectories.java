/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIllll
 * Module         : Trajectories  [RENDER]
 * Description    : Renders predicted projectile paths for held and in-flight projectiles.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Decompilation failed
 *   - In-Flight Color
 *   - Show Landing
 *   - Max Ticks
 *   - .getBytes(
 *   - In-Flight
 *   - :landing
 *   - entity:
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
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.client.render.Camera
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.ChargedProjectilesComponent
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.projectile.ArrowEntity
 *  net.minecraft.entity.projectile.FireballEntity
 *  net.minecraft.entity.projectile.FireworkRocketEntity
 *  net.minecraft.entity.projectile.FishingBobberEntity
 *  net.minecraft.entity.projectile.PersistentProjectileEntity
 *  net.minecraft.entity.projectile.ProjectileEntity
 *  net.minecraft.entity.projectile.SpectralArrowEntity
 *  net.minecraft.entity.projectile.TridentEntity
 *  net.minecraft.entity.projectile.WindChargeEntity
 *  net.minecraft.entity.projectile.thrown.EggEntity
 *  net.minecraft.entity.projectile.thrown.EnderPearlEntity
 *  net.minecraft.entity.projectile.thrown.ExperienceBottleEntity
 *  net.minecraft.entity.projectile.thrown.PotionEntity
 *  net.minecraft.entity.projectile.thrown.SnowballEntity
 *  net.minecraft.item.BowItem
 *  net.minecraft.item.CrossbowItem
 *  net.minecraft.item.EggItem
 *  net.minecraft.item.EnderPearlItem
 *  net.minecraft.item.ExperienceBottleItem
 *  net.minecraft.item.FishingRodItem
 *  net.minecraft.item.Item
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.item.SnowballItem
 *  net.minecraft.item.SplashPotionItem
 *  net.minecraft.item.TridentItem
 *  net.minecraft.item.WindChargeItem
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.world.RaycastContext
 *  net.minecraft.world.RaycastContext$FluidHandling
 *  net.minecraft.world.RaycastContext$ShapeType
 *  net.minecraft.world.World
 */
package orchard.module.render;

import java.awt.Color;
import java.lang.invoke.LambdaMetafactory;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.Camera;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ChargedProjectilesComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.projectile.ArrowEntity;
import net.minecraft.entity.projectile.FireballEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.SpectralArrowEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.entity.projectile.WindChargeEntity;
import net.minecraft.entity.projectile.thrown.EggEntity;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.entity.projectile.thrown.ExperienceBottleEntity;
import net.minecraft.entity.projectile.thrown.PotionEntity;
import net.minecraft.entity.projectile.thrown.SnowballEntity;
import net.minecraft.item.BowItem;
import net.minecraft.item.CrossbowItem;
import net.minecraft.item.EggItem;
import net.minecraft.item.EnderPearlItem;
import net.minecraft.item.ExperienceBottleItem;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.SnowballItem;
import net.minecraft.item.SplashPotionItem;
import net.minecraft.item.TridentItem;
import net.minecraft.item.WindChargeItem;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.II;
import orchard.internal.IIIlI;
import orchard.internal.IIIlIlllI;
import orchard.internal.IIlIIIlI;
import orchard.internal.IIlIIllIl;
import orchard.internal.IIlIlIIl;
import orchard.internal.IIllIIII;
import orchard.internal.IIllllIll;
import orchard.internal.IlIIIIl;
import orchard.internal.IlIIIl;
import orchard.internal.IllIlI;
import orchard.internal.lIIlIII;
import orchard.internal.lIIllIl;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlll;
import orchard.internal.llIlIlII;
import orchard.internal.llIll;
import orchard.internal.lllllIII;
import orchard.internal.lllllIll;

@Environment(value=EnvType.CLIENT)
public final class Trajectories
extends ModuleBase {
    private final lllllIII<String> I;
    private final lIlIIlI l = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Max Ticks"), 120.0, 30.0, 300.0, 10.0));
    private static final double II = 1.5;
    private final List<IIIlIlllI> Il;
    private final List<IIlIIllIl> lI;
    private static final double ll = 1.35;
    private final Map<Integer, IIlIlIIl> III;
    private static final IIllllIll IIl;
    private static final IIllllIll IlI;
    private final llIll Ill = this.IIlllIl(new llIll((Object)StringFactory.IIII("Show Landing"), true));
    private static final double lII = 4.0;
    private final llIlIlII lIl;
    private static final double llI = 0.18;
    private final llIll lll = this.IIlllIl(new llIll((Object)StringFactory.IIII("In-Flight"), true));
    private static String[] IIII;
    private static final int IIIl = 10;
    private final List<IIlIIIlI> IIlI;
    private final llIlIlII IIll = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Color"), new Color(100, 200, 255, 200)));
    private static final int[] IlII;
    private static final String[] IlIl;
    private static final Object[] IllI;

    @Override
    public void llll() {
        this.Il.clear();
        this.IIlI.clear();
        this.lI.clear();
        this.I.IIl();
        this.III.clear();
    }

    private List<Vec3d> lI(Box box) {
        return List.of(new Vec3d(box.minX, box.minY, box.minZ), new Vec3d(box.maxX, box.minY, box.minZ), new Vec3d(box.minX, box.maxY, box.minZ), new Vec3d(box.maxX, box.maxY, box.minZ), new Vec3d(box.minX, box.minY, box.maxZ), new Vec3d(box.maxX, box.minY, box.maxZ), new Vec3d(box.minX, box.maxY, box.maxZ), new Vec3d(box.maxX, box.maxY, box.maxZ));
    }

    private Vec3d IIl(float f, float f2) {
        double d = Math.toRadians(f);
        double d2 = Math.toRadians(-f2);
        double d3 = Math.cos(d);
        Vec3d vec3d = new Vec3d(Math.sin(d2) * d3, -Math.sin(d), Math.cos(d2) * d3);
        return vec3d.lengthSquared() > 1.0E-6 ? vec3d.normalize() : Vec3d.ZERO;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlI(char[] cArray, long l2, int n) {
        int n2 = 0x1AE62CFE ^ n;
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

    private int lII(Color color, double d) {
        int n = Math.max(0, Math.min(255, (int)Math.round((double)color.getAlpha() * d)));
        return n << 24 | color.getRGB() & 0xFFFFFF;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIIIl lIl(Entity entity) {
        if (entity instanceof TridentEntity) {
            return new IlIIIl(0.05, 0.99, 0.99, 0.05, false, IIl);
        }
        if (entity instanceof PersistentProjectileEntity) return new IlIIIl(0.05, 0.99, 0.6, 0.05, false, IIl);
        if (entity instanceof ArrowEntity) return new IlIIIl(0.05, 0.99, 0.6, 0.05, false, IIl);
        if (entity instanceof SpectralArrowEntity) {
            return new IlIIIl(0.05, 0.99, 0.6, 0.05, false, IIl);
        }
        if (entity instanceof SnowballEntity) return new IlIIIl(0.03, 0.99, 0.8, 0.03, false, IIl);
        if (entity instanceof EggEntity) return new IlIIIl(0.03, 0.99, 0.8, 0.03, false, IIl);
        if (entity instanceof EnderPearlEntity) {
            return new IlIIIl(0.03, 0.99, 0.8, 0.03, false, IIl);
        }
        if (entity instanceof ExperienceBottleEntity) {
            return new IlIIIl(0.07, 0.99, 0.8, 0.07, false, IIl);
        }
        if (entity instanceof PotionEntity) {
            return new IlIIIl(0.05, 0.99, 0.8, 0.05, false, IIl);
        }
        if (entity instanceof WindChargeEntity) {
            return new IlIIIl(0.0, 0.95, 0.8, 0.0, false, IIl);
        }
        if (entity instanceof FishingBobberEntity) {
            return new IlIIIl(0.03, 0.92, 0.92, 0.03, true, IlI);
        }
        if (!(entity instanceof FireballEntity)) {
            if (!(entity instanceof FireworkRocketEntity)) return null;
            return new IlIIIl(0.07, 0.99, 0.8, 0.07, false, IIl);
        }
        return new IlIIIl(0.0, 1.0, 1.0, 0.0, false, IIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIllIIII lll(Vec3d vec3d, II iI) {
        Camera camera = iI.IIl() != null ? iI.IIl() : MinecraftClient.getInstance().gameRenderer.getCamera();
        float f = camera.getPitch();
        float f2 = camera.getYaw();
        float f3 = MathHelper.sin((double)((float)Math.toRadians(-f2) - (float)Math.PI));
        float f4 = MathHelper.cos((double)((float)Math.toRadians(-f2) - (float)Math.PI));
        float f5 = -MathHelper.cos((double)((float)Math.toRadians(-f)));
        float f6 = MathHelper.sin((double)((float)Math.toRadians(-f)));
        Vec3d vec3d2 = new Vec3d((double)(-f4), (double)MathHelper.clamp((float)(-(f6 / f5)), (float)-5.0f, (float)5.0f), (double)(-f3));
        double d = vec3d2.length();
        if (!(d > 1.0E-6)) return new IIllIIII(vec3d, vec3d2, new IlIIIl(0.03, 0.92, 0.92, 0.03, true, IlI));
        double d2 = 0.6 / d + 0.5;
        vec3d2 = vec3d2.multiply(d2);
        return new IIllIIII(vec3d, vec3d2, new IlIIIl(0.03, 0.92, 0.92, 0.03, true, IlI));
    }

    private Vec3d IIII(Vec3d vec3d, Vec3d vec3d2, Vec3d vec3d3, Vec3d vec3d4, double d) {
        double d2 = d * d;
        double d3 = d2 * d;
        double d4 = 0.5 * (2.0 * vec3d2.x + (-vec3d.x + vec3d3.x) * d + (2.0 * vec3d.x - 5.0 * vec3d2.x + 4.0 * vec3d3.x - vec3d4.x) * d2 + (-vec3d.x + 3.0 * vec3d2.x - 3.0 * vec3d3.x + vec3d4.x) * d3);
        double d5 = 0.5 * (2.0 * vec3d2.y + (-vec3d.y + vec3d3.y) * d + (2.0 * vec3d.y - 5.0 * vec3d2.y + 4.0 * vec3d3.y - vec3d4.y) * d2 + (-vec3d.y + 3.0 * vec3d2.y - 3.0 * vec3d3.y + vec3d4.y) * d3);
        double d6 = 0.5 * (2.0 * vec3d2.z + (-vec3d.z + vec3d3.z) * d + (2.0 * vec3d.z - 5.0 * vec3d2.z + 4.0 * vec3d3.z - vec3d4.z) * d2 + (-vec3d.z + 3.0 * vec3d2.z - 3.0 * vec3d3.z + vec3d4.z) * d3);
        return new Vec3d(MathHelper.clamp((double)d4, (double)Math.min(vec3d2.x, vec3d3.x), (double)Math.max(vec3d2.x, vec3d3.x)), MathHelper.clamp((double)d5, (double)Math.min(vec3d2.y, vec3d3.y), (double)Math.max(vec3d2.y, vec3d3.y)), MathHelper.clamp((double)d6, (double)Math.min(vec3d2.z, vec3d3.z), (double)Math.max(vec3d2.z, vec3d3.z)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ boolean IIlI(MinecraftClient minecraftClient, Integer n) {
        if (minecraftClient.world.getEntityById(n.intValue()) != null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlII(II iI, List<Vec3d> list, IlIIIIl ilIIIIl, Color color, boolean bl, String string, Set<String> set) {
        String string2;
        String string3;
        Record record;
        if (list.size() < 2) {
            return;
        }
        set.add(string);
        List<Vec3d> list2 = this.llIl(list);
        if (bl) {
            this.lIIl(iI, list2, color.getRGB());
        }
        if (((Boolean)this.Ill.lIl()).booleanValue() && ilIIIIl.l() && (record = IllIlI.llIll(iI, list.get(list.size() - 1))) != null) {
            string3 = ":landing";
            String string4 = string;
            string2 = string4 + string3;
            set.add(string2);
            lllllIll lllllIll2 = this.I.l(string2, ((lIlll)record).l(), ((lIlll)record).I(), 1.0);
            this.IIlI.add(new IIlIIIlI(lllllIll2.I(), lllllIll2.l(), this.lII(color, 0.6)));
        }
        if (ilIIIIl.I() == null) return;
        record = IllIlI.IlllI(iI, this.lI(ilIIIIl.I().getBoundingBox().expand((double)ilIIIIl.I().getTargetingMargin())));
        if (record == null) return;
        int n = ilIIIIl.I().getId();
        string3 = "hit:";
        string2 = string3 + n;
        set.add(string2);
        record = this.I.I(string2, (lIIllIl)record, 1.0);
        this.lI.add(new IIlIIllIl(((lIIllIl)record).I(), ((lIIllIl)record).l(), ((lIIllIl)record).III() - ((lIIllIl)record).I(), ((lIIllIl)record).Il() - ((lIIllIl)record).l(), this.lII(color, 0.9)));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI(Entity entity, Entity entity2) {
        Entity entity3;
        Entity entity4;
        if (!entity2.canBeHitByProjectile()) {
            return false;
        }
        if (entity instanceof ProjectileEntity) {
            ProjectileEntity projectileEntity = (ProjectileEntity)entity;
            entity4 = projectileEntity.getOwner();
        } else {
            entity4 = entity;
        }
        if ((entity3 = entity4) == null) return true;
        if (!entity3.isConnectedThroughVehicle(entity2)) return true;
        return false;
    }

    /*
     * Exception decompiling
     */
    private IlIIIIl Illl(World var1_1, Entity var2_2, Vec3d var3_3, Vec3d var4_4, IlIIIl var5_5, boolean var6_6) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    private void lIIl(II var1_1, List<Vec3d> var2_2, int var3_3) {
        block4: {
            var4_4 = null;
            var5_5 = var2_2.iterator();
            ** GOTO lbl9
lbl4:
            // 1 sources

            while (true) {
                var4_4 = null;
                ** GOTO lbl9
                break;
            }
lbl7:
            // 2 sources

            while (true) {
                var4_4 = var7_7;
lbl9:
                // 3 sources

                if (!var5_5.hasNext()) {
                    return;
                }
                var6_6 = var5_5.next();
                var7_7 = IllIlI.llIll(var1_1, var6_6);
                if (var7_7 != null) break block4;
                ** continue;
                break;
            }
lbl15:
            // 1 sources

            while (true) {
                this.Il.add(new IIIlIlllI(var4_4.l(), var4_4.I(), var7_7.l(), var7_7.I(), var3_3));
                ** GOTO lbl7
                break;
            }
        }
        if (var4_4 != null) ** break;
        ** while (true)
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Ill(II iI) {
        block2: {
            HashSet<String> hashSet;
            block3: {
                block1: {
                    this.Il.clear();
                    this.IIlI.clear();
                    this.lI.clear();
                    if (!this.IIIlIIl() || !IllIlI.lIIll(iI)) break block1;
                    MinecraftClient minecraftClient = MinecraftClient.getInstance();
                    if (minecraftClient.player == null || minecraftClient.world == null) break block2;
                    hashSet = new HashSet<String>();
                    this.IIIII(iI, minecraftClient, hashSet);
                    if (((Boolean)this.lll.lIl()).booleanValue()) {
                        this.lllI(iI, minecraftClient, hashSet);
                    }
                    break block3;
                }
                this.I.IIl();
                this.III.clear();
                return;
            }
            this.I.III(hashSet);
            return;
        }
        this.I.IIl();
        this.III.clear();
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d lIlI(ClientPlayerEntity clientPlayerEntity) {
        Vec3d vec3d;
        Vec3d vec3d2 = clientPlayerEntity.getVelocity();
        vec3d(vec3d2.x, !clientPlayerEntity.isOnGround() ? vec3d2.y : 0.0, vec3d2.z);
        return vec3d;
    }

    /*
     * Enabled aggressive block sorting
     */
    private List<IIllIIII> lIll(ItemStack itemStack, ClientPlayerEntity clientPlayerEntity, Vec3d vec3d, Vec3d vec3d2, II iI) {
        ArrayList<IIllIIII> arrayList;
        Item item;
        block17: {
            double d;
            double d2;
            Vec3d vec3d3;
            ChargedProjectilesComponent chargedProjectilesComponent;
            block16: {
                block14: {
                    block13: {
                        block15: {
                            block11: {
                                block12: {
                                    block10: {
                                        item = itemStack.getItem();
                                        arrayList = new ArrayList<IIllIIII>();
                                        if (!(item instanceof BowItem)) break block10;
                                        if (!clientPlayerEntity.isUsingItem()) {
                                            return arrayList;
                                        }
                                        break block11;
                                    }
                                    if (!(item instanceof CrossbowItem)) break block12;
                                    if (!CrossbowItem.isCharged((ItemStack)itemStack)) {
                                        return arrayList;
                                    }
                                    break block13;
                                }
                                if (!(item instanceof TridentItem)) break block14;
                                if (!clientPlayerEntity.isUsingItem()) return arrayList;
                                if (clientPlayerEntity.getItemUseTime() < 10) {
                                    return arrayList;
                                }
                                break block15;
                            }
                            float f = BowItem.getPullProgress((int)clientPlayerEntity.getItemUseTime());
                            if (f < 0.1f) return arrayList;
                            arrayList.add(new IIllIIII(vec3d, vec3d2.multiply(3.0 * (double)f), new IlIIIl(0.05, 0.99, 0.6, 0.05, false, IIl)));
                            return arrayList;
                        }
                        arrayList.add(new IIllIIII(vec3d, vec3d2.multiply(2.5), new IlIIIl(0.05, 0.99, 0.99, 0.05, false, IIl)));
                        return arrayList;
                    }
                    chargedProjectilesComponent = (ChargedProjectilesComponent)itemStack.get(DataComponentTypes.CHARGED_PROJECTILES);
                    vec3d3 = vec3d2.multiply(3.15);
                    d2 = 0.05;
                    d = 0.6;
                    if (chargedProjectilesComponent == null || !chargedProjectilesComponent.contains(Items.FIREWORK_ROCKET)) break block16;
                    vec3d3 = vec3d2.multiply(1.6);
                    d2 = 0.0;
                    d = 0.99;
                    break block16;
                }
                if (item instanceof SnowballItem) {
                    arrayList.add(new IIllIIII(vec3d, vec3d2.multiply(1.5), new IlIIIl(0.03, 0.99, 0.8, 0.03, false, IIl)));
                    return arrayList;
                }
                if (item instanceof EggItem) {
                    arrayList.add(new IIllIIII(vec3d, vec3d2.multiply(1.5), new IlIIIl(0.03, 0.99, 0.8, 0.03, false, IIl)));
                    return arrayList;
                }
                if (item instanceof EnderPearlItem) {
                    arrayList.add(new IIllIIII(vec3d, vec3d2.multiply(1.5), new IlIIIl(0.03, 0.99, 0.8, 0.03, false, IIl)));
                    return arrayList;
                }
                if (item instanceof WindChargeItem) {
                    arrayList.add(new IIllIIII(vec3d, vec3d2, new IlIIIl(0.0, 0.95, 0.8, 0.0, false, IIl)));
                    return arrayList;
                }
                if (item instanceof SplashPotionItem) {
                    Vec3d vec3d4 = this.IIIlI(iI, -20.0f);
                    arrayList.add(new IIllIIII(vec3d, vec3d4.multiply(0.5), new IlIIIl(0.05, 0.99, 0.8, 0.05, false, IIl)));
                    return arrayList;
                }
                if (item instanceof ExperienceBottleItem) {
                    Vec3d vec3d5 = this.IIIlI(iI, -20.0f);
                    arrayList.add(new IIllIIII(vec3d, vec3d5.normalize().multiply(0.7), new IlIIIl(0.07, 0.99, 0.8, 0.07, false, IIl)));
                    return arrayList;
                }
                break block17;
            }
            IlIIIl ilIIIl = new IlIIIl(d2, 0.99, d, d2, false, IIl);
            arrayList.add(new IIllIIII(vec3d, vec3d3, ilIIIl));
            if (chargedProjectilesComponent == null) return arrayList;
            if (chargedProjectilesComponent.getProjectiles().size() <= 1) return arrayList;
            arrayList.add(new IIllIIII(vec3d, vec3d3.rotateY((float)Math.toRadians(10.0)), ilIIIl));
            arrayList.add(new IIllIIII(vec3d, vec3d3.rotateY((float)Math.toRadians(-10.0)), ilIIIl));
            return arrayList;
        }
        if (!(item instanceof FishingRodItem)) return arrayList;
        if (clientPlayerEntity.fishHook != null) return arrayList;
        arrayList.add(this.lll(vec3d, iI));
        return arrayList;
    }

    private BlockHitResult llII(World world, Entity entity, Vec3d vec3d, Vec3d vec3d2, RaycastContext.FluidHandling fluidHandling) {
        return world.raycast(new RaycastContext(vec3d, vec3d2, RaycastContext.ShapeType.COLLIDER, fluidHandling, entity));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private List<Vec3d> llIl(List<Vec3d> list) {
        if (list.size() < 3) {
            return list;
        }
        ArrayList<Vec3d> arrayList = new ArrayList<Vec3d>(list.size() * 4);
        arrayList.add(list.get(0));
        int n = 0;
        boolean bl = true;
        while (true) {
            Vec3d vec3d;
            Vec3d vec3d2;
            Vec3d vec3d3;
            Vec3d vec3d4;
            int n2;
            int n3;
            if (!bl || (bl = false) || !true) {
                if (n3 <= n2) {
                    arrayList.add(this.IIII(vec3d4, vec3d3, vec3d2, vec3d, (double)n3 / (double)n2));
                    ++n3;
                    continue;
                }
                ++n;
            }
            if (n >= list.size() - 1) {
                arrayList.set(arrayList.size() - 1, list.get(list.size() - 1));
                return arrayList;
            }
            vec3d4 = list.get(Math.max(0, n - 1));
            vec3d3 = list.get(n);
            vec3d2 = list.get(n + 1);
            vec3d = list.get(Math.min(list.size() - 1, n + 2));
            n2 = Math.max(2, Math.min(10, (int)Math.ceil(vec3d3.distanceTo(vec3d2) / 0.18)));
            n3 = 1;
        }
    }

    /*
     * Unable to fully structure code
     */
    private void lllI(II var1_1, MinecraftClient var2_2, Set<String> var3_3) {
        block11: {
            block12: {
                block13: {
                    block10: {
                        block9: {
                            var4_4 = (Color)this.lIl.lIl();
                            var5_5 = var2_2.world.getTime();
                            var7_6 = (int)Math.round((Double)this.l.lIl());
                            var8_7 = var2_2.world.getEntities().iterator();
                            break block11;
lbl6:
                            // 2 sources

                            while (true) {
                                var14_13 = this.Illl((World)var2_2.world, var9_8, var12_11, var10_9, var11_10, true);
                                this.III.put(var9_8.getId(), new IIlIlIIl((World)var2_2.world, var5_5, var12_11, var10_9, var11_10, var7_6, var14_13));
                                break block9;
                                break;
                            }
lbl11:
                            // 1 sources

                            while (true) {
                                var10_9 = var9_8.getVelocity();
                                if (!(var10_9.lengthSquared() < 1.0E-6)) break block10;
                                break block11;
                                break;
                            }
                            while (true) {
                                var16_15 = var9_8.getId();
                                var15_14 = "entity:";
                                this.IlII(var1_1, var14_13.II(), var14_13, var4_4, true, var15_14 + var16_15, var3_3);
                                break block11;
                                break;
                            }
lbl20:
                            // 1 sources

                            while (true) {
                                var12_11 = new Vec3d(var9_8.getX(), var9_8.getY(), var9_8.getZ());
                                var13_12 = this.III.get(var9_8.getId());
                                if (var13_12 == null) ** GOTO lbl6
                                break block12;
                                break;
                            }
                        }
lbl26:
                        // 2 sources

                        while (true) {
                            if (var14_13.II().size() >= 2) ** continue;
                            break block11;
                            break;
                        }
                        while (true) {
                            if (!var9_8.isAlive()) break block11;
                            break block13;
                            while (true) {
                                this.III.keySet().removeIf((Predicate<Integer>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, IIlI(net.minecraft.client.MinecraftClient java.lang.Integer ), (Ljava/lang/Integer;)Z)((MinecraftClient)var2_2));
                                return;
                            }
                            break;
                        }
                    }
                    ** while ((var11_10 = this.lIl((Entity)var9_8)) != null)
lbl38:
                    // 1 sources

                    break block11;
lbl39:
                    // 1 sources

                    while (true) {
                        var14_13 = var13_12.I();
                        ** continue;
                        break;
                    }
                }
                ** while (!var9_8.isRemoved())
lbl44:
                // 1 sources

                break block11;
            }
            if (var13_12.II((World)var2_2.world, var5_5, var12_11, var10_9, var11_10, var7_6)) ** break;
            ** while (true)
            ** while (true)
        }
        while (true) {
            if (!var8_7.hasNext()) ** continue;
            if ((var9_8 = (Entity)var8_7.next()) instanceof ProjectileEntity || var9_8 instanceof FishingBobberEntity) ** continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        if (!this.IIIlIIl()) {
            return;
        }
        for (IIIlIlllI iIIlIlllI : this.Il) {
            IIIlI.Illlll(drawContext, iIIlIlllI.Il(), iIIlIlllI.I(), iIIlIlllI.l(), iIIlIlllI.II(), 1.35, iIIlIlllI.lI());
        }
        for (IIlIIIlI iIlIIIlI : this.IIlI) {
            IIIlI.IlIlll(drawContext, iIlIIIlI.I(), iIlIIIlI.II(), 4.0, 1.35, iIlIIIlI.l());
        }
        Iterator<Record> iterator = this.lI.iterator();
        while (iterator.hasNext()) {
            IIlIIllIl iIlIIllIl = (IIlIIllIl)iterator.next();
            IIIlI.lIlIlI(drawContext, iIlIIllIl.II(), iIlIIllIl.I(), iIlIIllIl.Il(), iIlIIllIl.l(), 1.5, iIlIIllIl.lI());
        }
    }

    public Trajectories() {
        super(StringFactory.IIII("Trajectories"), Category.l, StringFactory.IIII("Renders predicted projectile paths for held and in-flight projectiles."));
        this.lIl = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("In-Flight Color"), new Color(255, 160, 80, 180)));
        this.I = new lllllIII();
        this.Il = new ArrayList<IIIlIlllI>();
        this.IIlI = new ArrayList<IIlIIIlI>();
        this.lI = new ArrayList<IIlIIllIl>();
        this.III = new HashMap<Integer, IIlIlIIl>();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIII(II iI, MinecraftClient minecraftClient, Set<String> set) {
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        ItemStack itemStack = clientPlayerEntity.getMainHandStack();
        Vec3d vec3d = clientPlayerEntity.getRotationVec(1.0f);
        Vec3d vec3d2 = new Vec3d(clientPlayerEntity.getX(), clientPlayerEntity.getEyeY() - 0.1, clientPlayerEntity.getZ());
        Vec3d vec3d3 = this.lIlI(clientPlayerEntity);
        List<IIllIIII> list = this.lIll(itemStack, clientPlayerEntity, vec3d2, vec3d, iI);
        if (list.isEmpty()) {
            itemStack = clientPlayerEntity.getOffHandStack();
            list = this.lIll(itemStack, clientPlayerEntity, vec3d2, vec3d, iI);
        }
        if (list.isEmpty()) {
            return;
        }
        Color color = (Color)this.IIll.lIl();
        int n = 0;
        Iterator<IIllIIII> iterator = list.iterator();
        while (iterator.hasNext()) {
            IIllIIII iIllIIII = iterator.next();
            IlIIIIl ilIIIIl = this.Illl((World)minecraftClient.world, (Entity)clientPlayerEntity, iIllIIII.II(), iIllIIII.I().add(vec3d3), iIllIIII.l(), true);
            if (ilIIIIl.II().size() < 2) continue;
            int n2 = n++;
            String string = "held:";
            this.IlII(iI, ilIIIIl.II(), ilIIIIl, color, true, string + n2, set);
        }
    }

    private static void IIIIl() {
        Trajectories.IIII[0] = Trajectories.IlI(Trajectories.IIlIl((short)33278, '\u3d84', 1345545596).toCharArray(), 5516L, 90372365);
        Trajectories.IIII[1] = Trajectories.IlI(Trajectories.IIlIl((short)37078, '\u3d85', -1604880059).toCharArray(), 90126L, 1978337729);
        Trajectories.IIII[2] = Trajectories.IlI(Trajectories.IIlIl((short)59460, '\u3d86', 671840860).toCharArray(), 17995L, -1524928741);
        Trajectories.IIII[3] = Trajectories.IlI(Trajectories.IIlIl((short)18227, '\u3d87', 657009292).toCharArray(), 10493L, 72896372);
        Trajectories.IIII[4] = Trajectories.IlI(Trajectories.IIlIl((short)50636, '\u3d80', -225308293).toCharArray(), 57483L, 819882661);
        Trajectories.IIII[5] = Trajectories.IlI(Trajectories.IIlIl((short)60039, '\u3d81', -1951699748).toCharArray(), 47101L, -1741168697);
        Trajectories.IIII[6] = Trajectories.IlI(Trajectories.IIlIl((short)53866, '\u3d82', -1977786416).toCharArray(), 70345L, -1924952061);
        Trajectories.IIII[7] = Trajectories.IlI(Trajectories.IIlIl((short)56146, '\u3d83', 1488479085).toCharArray(), 67935L, 48901124);
        Trajectories.IIII[8] = Trajectories.IlI(Trajectories.IIlIl((short)8871, '\u3d8c', -62947342).toCharArray(), 937L, 1767368555);
        Trajectories.IIII[9] = Trajectories.IlI(Trajectories.IIlIl((short)45556, '\u3d8d', -2101394243).toCharArray(), 86092L, -517266993);
        Trajectories.IIII[10] = Trajectories.IlI(Trajectories.IIlIl((short)45665, '\u3d8e', 943998065).toCharArray(), 60053L, -838004375);
    }

    /*
     * Enabled aggressive block sorting
     */
    private Vec3d IIIlI(II iI, float f) {
        Camera camera = iI.IIl() != null ? iI.IIl() : MinecraftClient.getInstance().gameRenderer.getCamera();
        return this.IIl(camera.getPitch() + f, camera.getYaw());
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIIlIII IIIll(World world, Entity entity, Vec3d vec3d, Vec3d vec3d2, double d) {
        Box box = new Box(vec3d, vec3d2).expand(1.0);
        Entity entity3 = null;
        Vec3d vec3d3 = null;
        double d2 = Double.MAX_VALUE;
        Iterator iterator = world.getOtherEntities(entity, box, entity2 -> this.IllI(entity, (Entity)entity2)).iterator();
        while (true) {
            double d3;
            Vec3d vec3d4;
            Entity entity4;
            if (iterator.hasNext()) {
                entity4 = (Entity)iterator.next();
                vec3d4 = entity4.getBoundingBox().expand(d).raycast(vec3d, vec3d2).orElse(null);
                if (vec3d4 == null || (d3 = vec3d.squaredDistanceTo(vec3d4)) >= d2) {
                    continue;
                }
            } else {
                if (entity3 == null) return null;
                if (vec3d3 == null) return null;
                lIIlIII lIIlIII2 = new lIIlIII(entity3, vec3d3, d2);
                return lIIlIII2;
            }
            entity3 = entity4;
            vec3d3 = vec3d4;
            d2 = d3;
        }
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 20870;
        var7_2 = "\ufaab\ucafc\u0f26\ue8bc\u0d85\u85b8\u2b94\u51b4\ub46f\u6892\ufecd\u11fb\u90ba\u84c4\u8838\u7d2c\u0bd8\ua86a\udb1c\uc85a\u31a9\u5120\u1df3\u90f3\ud5a1\u8ce1\uf835\u3f2c\ud392\u859f\u9322\u1a0d\ub000\ubaf1\u7a98\u2615\u9d9d\u2731\uc3dd\u5f0f\u7980\uf902\u4827\uc3b8\udbba\u654f\u9959\u3e4d\u7e7e\u9064\u9fcd\u4701\u3fc2\uc370\u39d6\ub3db\u8062\u0eff\u345f\ub56a\ue9ce\ufec0\udce1\uf945\u73df\ua42a\ucff4\ud5b7\u0c70\u2756\u25a9\u942b\u15cb\u1413\u12b2\u9789\u691c\ub507\u8f09\u41bf\u2dd4\u17e9\ua5c2\u4ddc\u65c6\u05d3\u0cf1\ua71c\ub99f\ue5dd\u6c98\u8cf2\u3385\u4d99\u89ad\u0841\u91fc\u1fcd\uf75e\ue157\u21fc\ub98a\u60a7\uff1e\u3582\ua587\u66c0\u25ba\ud53a\u724c\u3a85\u31e9\u439d\u9bde\u8bc0\ua1a7\u3b22\u82c3\u0b18\ua0ca\ud18b\u04c0\u11c8\uf358\u0a8f\u1580\u6b0b\u5428\ue90d\ua3a9\uad87\ua65b\uef73\u3fc8\u2976\u5be0\u8513\u8a63\ue0d9\ub4fd\ucc7f\ud6b1\u96e8\u8d1c\u4b25\u6ed9\u8227\u4484\u337a\ufc04\u1158\u972c\uf57a\u5e8d]\u0716\u1d79\uf002\u0537\uc431\u4b45\u8606\ua941\u02cd\ua96d\udf48\u7e2e\u16a0\u28a0\u8091\u6dea\ub92a\u4ade\ud02a\u4721\uf34f\ucb3c\u5795\u6249\uc0c6\udcce\ue5a5\uf431\u6c74\u1849\u4236\u5838\uc5b4\ud6b9\u9e6b\u1da1\ubf5f\u07d7\u3b67\u341c\u5523\u1b8c\u55dd\uc72c\ucb79\u7d2a\u1a32\ud8b8\u9565\u1b6f\u80aa\u2b68\u5951\uf354\ub500\ua127\ue03d\ubec7\u4435\u3b70\u9d75\uecbd\u34f2\ud985\ue8b6";
        var8_3 = "\u518a\u518e\u518a\u518e\u5196\u5192\u5196\u518a\u518a\u518e\u51e6".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        if (true) ** GOTO lbl16
        block6: while (true) {
            block10: {
                block11: {
                    var16_1 = v0;
                    v1 = var15_10++;
                    var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
                    if (var15_10 < var14_9.length) break block10;
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_3.length) break block11;
                    var13_8 = 0;
lbl16:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = 0;
                    if (var13_8 == 0) break;
                }
                var12_7 = var8_3[var10_5] ^ var6;
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
            }
            switch (var15_10 % 5) {
                default: {
                    v0 = 78;
                    continue block6;
                }
                case 3: {
                    v0 = 20;
                    continue block6;
                }
                case 2: {
                    v0 = 126;
                    continue block6;
                }
                case 4: {
                    v0 = 126;
                    continue block6;
                }
                case 1: 
            }
            v0 = 107;
        }
        Trajectories.IlIl = var9_4;
        Trajectories.IllI = new Object[var9_4.length];
        var2_13 = 56144073;
        var0_11 = "\u00f0\u00bb\u0011\u009f\u0082\u00dc\u00f4]\u00df\u0013s\u00eb=\u00d7D}8!\u0096\"\u00e5\u00ac\u009doC\u00d3/\u0000\u001e\u00ef\u00aa\u00c3\u00a9f\u00e5\u0097oV7<S\u00e5\u00fd\u00d5+\bpK\u00c8O\u00fc\u0004\u00978\u0080\u00bb\u001f }\u0003\u00b7\u00cax%&\u0000*H\u009b\u00f0\u00c2\u00e1\u00ae\u00a5z\u000b\u00bc\u00b1\u00a4a0\u0015\u0084\u00c3\u00d0k\u00d0>r\u00a1^\f\u0094\u00ac\u0007\u009cX\u008fq\u00bf\u00e3\u00a1c\u0006\u00b4\u00e1`nh\u008fn\u009e\rme2\u00b81\u00cfy\u00cf \u00f4k\bX\u00f1\u007fp\u0084\u00ff\u0087\u00ae\u008a\u009f\u00aa\u00a6\u00d2\u00b8:\u00ad\u001bS\u009c\u00f8j.Z\u00e0\u00eb2\u0098".getBytes("ISO-8859-1");
        var1_12 = var0_11.length / 4;
        Trajectories.IlII = new int[var1_12];
        var3_14 = 0;
        var4_15 = 0;
        do {
            var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
            Trajectories.IlII[var4_15] = var5_16 ^= var2_13;
            var3_14 += 4;
        } while (++var4_15 < var1_12);
        Trajectories.IIII = new String[11];
        Trajectories.IIIIl();
        Trajectories.IIl = IIllllIll.II;
        Trajectories.IlI = IIllllIll.Il;
    }

    private static int IIlII(int n, int n2) {
        return IlII[n ^ 0x456FD88C] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlIl(short s, char c, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0x3D84;
        char[] cArray = IlIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IllI[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            Trajectories.IllI[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7259;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 4116;
            n6 ^= 0x261A;
            n6 -= 60043;
            cArray[n5] = (char)((n6 ^= 0x5311) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

