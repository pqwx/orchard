/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIlIll
 * Module         : MaceSwap  [COMBAT]
 * Description    : Swaps to your best mace before falling attacks.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Min Fall Distance
 *   - Density Above
 *   - Switch Delay
 *   - Breach Swap
 *   - Switch Back
 *   - .getBytes(
 *   - StunSlam
 *   - _sword
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
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.component.DataComponentTypes
 *  net.minecraft.component.type.ItemEnchantmentsComponent
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.attribute.EntityAttributes
 *  net.minecraft.item.AxeItem
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.MaceItem
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.util.Hand
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.combat;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Consumer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.item.AxeItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.MaceItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IIllllllI;
import orchard.internal.IlIIIIlI;
import orchard.internal.IlIlIll;
import orchard.internal.IlllllIl;
import orchard.internal.lIIIlIl;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIlllIl;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class MaceSwap
extends ModuleBase {
    private int I;
    private boolean l;
    private int II;
    private final lIlIIlI Il;
    private final IIIlIlIIl lI;
    private double ll;
    private boolean III;
    private double IIl;
    private static final long IlI = 350L;
    private IlIIIIlI Ill;
    private boolean lII;
    private final llIll lIl;
    private LivingEntity llI;
    private long lll;
    private long IIII;
    private boolean IIIl;
    private int IIlI = -1;
    private Consumer<Boolean> IIll;
    private int IlII = -1;
    private boolean IlIl;
    private static String[] IllI;
    private long Illl;
    private final lIlIIlI lIII;
    private static final long lIIl = 1000L;
    private long lIlI;
    private final llIll lIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("StunSlam"), true));
    private int llII = -1;
    private boolean llIl;
    private lIlllIl lllI;
    private long llll;
    private boolean IIIII;
    private static final long IIIIl = 1L;
    private HitResult IIIlI;
    private static final double IIIll = 3.0;
    private static final int IIlII = 9;
    private boolean IIlIl;
    private static final long IIllI = 1500L;
    private long IIlll;
    private IlIlIll IlIII;
    private long IlIIl;
    private static final int IlIlI = 3;
    private final llIll IlIll;
    private static final int[] IllII;
    private static final String[] IllIl;
    private static final Object[] IlllI;

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient, int n) {
        if (this.IlIII == null) return true;
        if (this.IlIII.l() != n) return true;
        if (lIIllllI.IIIllll(minecraftClient, this.IlIII)) return true;
        return false;
    }

    private int IIl(MinecraftClient minecraftClient, lIlllIl lIlllIl2, boolean bl) {
        return !this.IIIII(minecraftClient, lIlllIl2, bl) ? this.IllIIl(minecraftClient, lIlllIl2) : this.lIIlII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(ClientPlayerEntity clientPlayerEntity) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (clientPlayerEntity == null) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player != clientPlayerEntity) return false;
        if ((Boolean)this.lIl.lIl() == false) return false;
        if (this.llI != null) {
            if (this.IIllI(this.llI)) return false;
        }
        if (!this.IIlIl(minecraftClient)) return false;
        if (this.lIIlII(minecraftClient) < 0) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lII(MinecraftClient minecraftClient, int n, boolean bl) {
        boolean bl2;
        boolean bl3;
        if (this.lIl()) {
            return false;
        }
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n >= 9) return false;
        ItemStack itemStack = minecraftClient.player.getInventory().getStack(n);
        if (!bl) {
            bl3 = itemStack.getItem() instanceof MaceItem;
        } else {
            if (!(itemStack.getItem() instanceof AxeItem)) return false;
            if (!lIIllllI.lIIl(itemStack)) return false;
            bl3 = true;
        }
        if (!(bl2 = bl3)) {
            return false;
        }
        boolean bl4 = lIIllllI.llIllI(minecraftClient) != n;
        int n2 = bl4 ? this.IlIIII(this.lI) : 0;
        this.IlIII = lIIllllI.IIIIlII(minecraftClient, this, n, n2, true);
        if (this.IlIII == null) return false;
        if (!this.IlIII.Il()) return false;
        if (lIIllllI.llIllI(minecraftClient) != n) return false;
        if (lIIllllI.IIlIIIl()) return true;
        if (!lIIllllI.IllIllI(minecraftClient, n)) return false;
        return true;
    }

    private boolean lIl() {
        return this.IlIIl == lIIIlIl.lIllI();
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (this.Ill != IlIIIIlI.II) {
        } else {
            this.llI = livingEntity;
            if (this.lIIIII(minecraftClient)) {
                this.llII(minecraftClient);
                return true;
            }
            boolean bl = this.IIllI(livingEntity);
            boolean bl2 = bl ? this.IIlIII(minecraftClient, livingEntity) : this.IIIIIl(minecraftClient, livingEntity);
            boolean bl3 = bl2;
            if (!bl2) {
                this.llI = null;
                return false;
            }
            if (this.lIIl(minecraftClient, livingEntity) != null) {
                boolean bl4 = this.lIIll(minecraftClient, livingEntity);
                if (!bl4) return bl4;
                this.IIlIlI(minecraftClient);
                if (this.IIIl) return bl4;
                this.llII(minecraftClient);
                return bl4;
            }
            this.llI = null;
            return false;
        }
        boolean bl = livingEntity != null && livingEntity == this.llI;
        if (!bl) return bl;
        this.llII(minecraftClient);
        return bl;
    }

    private boolean IIlI(MinecraftClient minecraftClient) {
        return this.llIlI(minecraftClient, this.IlII);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient, EntityHitResult entityHitResult, LivingEntity livingEntity) {
        Vec3d vec3d;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (livingEntity == null) return false;
        if (livingEntity == minecraftClient.player) return false;
        if (!livingEntity.isAlive()) return false;
        if (livingEntity.isRemoved()) return false;
        if (minecraftClient.world.getEntityById(livingEntity.getId()) != livingEntity) return false;
        if (entityHitResult == null) return false;
        if (entityHitResult.getEntity() != livingEntity) return false;
        if (entityHitResult.getPos() == null) {
            return false;
        }
        Vec3d vec3d2 = minecraftClient.player.getEyePos();
        if (!(vec3d2.squaredDistanceTo(vec3d = entityHitResult.getPos()) <= 9.0)) return false;
        if (!this.lIII(minecraftClient, vec3d2, vec3d)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.llII < 0) return false;
        if (this.llII >= 9) return false;
        if (lIIllllI.llIllI(minecraftClient) != this.llII) return false;
        if (!lIIllllI.IllIllI(minecraftClient, this.llII)) return false;
        if (!(minecraftClient.player.getInventory().getStack(this.llII).getItem() instanceof AxeItem)) return false;
        if (!lIIllllI.lIIl(minecraftClient.player.getInventory().getStack(this.llII))) return false;
        if (this.lI(minecraftClient, this.llII)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private EntityHitResult Illl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (minecraftClient.world == null) return null;
        if (livingEntity != null) {
            Vec3d vec3d = minecraftClient.player.getEyePos();
            Box box = livingEntity.getBoundingBox();
            Vec3d vec3d2 = new Vec3d(MaceSwap.IlIIl(vec3d.x, box.minX, box.maxX), MaceSwap.IlIIl(vec3d.y, box.minY, box.maxY), MaceSwap.IlIIl(vec3d.z, box.minZ, box.maxZ));
            if (vec3d.squaredDistanceTo(vec3d2) > 9.0001) return null;
            if (this.lIII(minecraftClient, vec3d, vec3d2)) return new EntityHitResult((Entity)livingEntity, vec3d2);
            return null;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIII(MinecraftClient minecraftClient, Vec3d vec3d, Vec3d vec3d2) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (vec3d == null) return false;
        if (vec3d2 == null) return false;
        BlockHitResult blockHitResult = lIIllllI.IIIIllI(minecraftClient, (Entity)minecraftClient.player, vec3d, vec3d2);
        if (blockHitResult == null) return true;
        if (blockHitResult.getType() == HitResult.Type.MISS) {
            return true;
        }
        if (!(vec3d.squaredDistanceTo(blockHitResult.getPos()) + 1.0E-4 >= vec3d.squaredDistanceTo(vec3d2))) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private EntityHitResult lIIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (livingEntity != null) {
            EntityHitResult entityHitResult = lIIllllI.lI(minecraftClient, 3.0);
            if (!this.IlII(minecraftClient, entityHitResult, livingEntity)) {
                HitResult hitResult = minecraftClient.crosshairTarget;
                if (!(hitResult instanceof EntityHitResult)) return this.Illl(minecraftClient, livingEntity);
                EntityHitResult entityHitResult2 = (EntityHitResult)hitResult;
                if (entityHitResult2.getEntity() != livingEntity) return this.Illl(minecraftClient, livingEntity);
                if (!this.IlII(minecraftClient, entityHitResult2, livingEntity)) return this.Illl(minecraftClient, livingEntity);
                return entityHitResult2;
            }
            return entityHitResult;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llII(MinecraftClient minecraftClient) {
        if (minecraftClient != null && minecraftClient.options != null && minecraftClient.options.attackKey != null) {
            lIIllllI.llIlIl(minecraftClient.options.attackKey);
            minecraftClient.options.attackKey.setPressed(false);
            return;
        }
    }

    private void llIl(long l2) {
        if (this.Ill == IlIIIIlI.lI) {
            return;
        }
        this.Ill = IlIIIIlI.Il;
        this.IIII = l2;
        this.llll = l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllI(ClientPlayerEntity clientPlayerEntity) {
        if (!this.IlIIll(clientPlayerEntity)) return false;
        if (clientPlayerEntity.getVelocity().y < -0.01) return true;
        if (!(clientPlayerEntity.fallDistance > 0.0)) return false;
        return true;
    }

    @Override
    public void llll() {
        this.IIllII(MinecraftClient.getInstance(), true);
        this.lII = false;
        this.lll = 0L;
        this.lIIIIl();
        this.IIIIll();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIII(MinecraftClient minecraftClient, lIlllIl lIlllIl2, boolean bl) {
        if ((Boolean)this.lIl.lIl() == false) return false;
        if (bl) return false;
        if (lIlllIl2 != lIlllIl.l) return false;
        if (this.IIlIl(minecraftClient)) return true;
        return false;
    }

    @Override
    public void ll() {
        lIIllllI.llIII(MinecraftClient.getInstance(), this, lIIlIllI.Il);
        this.lII = false;
        this.lll = 0L;
        this.lIIIIl();
        this.IIIIll();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block17: {
                block22: {
                    block14: {
                        block15: {
                            block16: {
                                block20: {
                                    block19: {
                                        block12: {
                                            block13: {
                                                block18: {
                                                    break block18;
lbl1:
                                                    // 1 sources

                                                    while (true) {
                                                        MaceSwap.IllII[var4_5] = var5_6 ^= var2_3;
                                                        break block12;
                                                        break;
                                                    }
                                                }
                                                var6 = 17790;
                                                break block19;
lbl7:
                                                // 1 sources

                                                while (true) {
                                                    if (var13_13 != 0) break block13;
                                                    break block14;
                                                    break;
                                                }
lbl10:
                                                // 1 sources

                                                while (true) {
                                                    continue;
                                                    break;
                                                }
                                            }
                                            while (true) {
                                                break block15;
                                                break;
                                            }
                                        }
                                        var3_4 += 4;
                                        if (++var4_5 < var1_2) break block20;
                                        break block21;
lbl19:
                                        // 1 sources

                                        while (true) {
                                            var11_11 += var12_12;
                                            break block16;
                                            break;
                                        }
lbl22:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var7_7 = "\u554b\u6eff\u5270\u94a6\ue247\u9f36\u0f30\u5e94\u3ef8\u7f96\u0a77\uba95\uafb2\u930e\uf0a1\u9640\u647a\ub77f\u78c8\uf88b\u1516\u90e5\ufed5\udecf\u6645\ud7fe\u2c06\u92e0\u2222\u914a\uede9\uff68\ued32\u7b3a\u0ded\uee3f\ua1b3\u8507\u5f3c\u5697\u0e33\ub8de\uc6a3\u89ab\u6a47\uf9d2\u71ad\u52e7\uba38\u6b1b\u7db0\u142a\ufa2c\u76c6\u6802\ud11f\uc367\ufac9\u28b8\u2d26\ub467\u97b2\ubdf1\u402a\u0433\u0a66\uc188\ue16a\u1ba3\u7e02\ucfcb\u22f4\ue9f9\ueb19\uc516\u114b\u01fa\u558b\uc1ba\t\u6a14\ubeee\u7d96\u67c0\u537b\u4a75\u8b89\u54f0\u0551\u8df4\u59dc\uecaa\u37db\u4be3\u71dc\u82a5\u4daf\u20e0\uaec0\u0a18\u8f4b\ud80c\u5e21\u680f\ua3b1\u3470\u786f\u0e39\u42f5\u6984\u264b\u7483\u741a\u418c\u78f8\u8c38\ud19a\u5a99\ucb1e\u3f4e\u84c1\u2beb\u3ac4\ua787\ueb8c\u9fc6\u0a12\u53e1\ue805\udb22\u02e2\ua926\u6e60\u1a66\u2815\u8041\ucdf3\u7405\udda2\ub31e\ue635\uc264\ub408\u1f9d\u56d2\u14c3\ubad8\ue06d\uad34\ucb39\u5a1c\ube2a\u20d9\ub846\ucf82\u834c\u3463\u2540\uf33c\u9c8b\uafe5\u0c20\u1a07\ub261\ucf75\ua6b9\u873b\uee3a\u43e3\u6f7e\ud9ff\u7c0f\u4b43\u0aa4\uaf39\u0ff3\u3f0d\u7f0b\u410f\uc0ae\ucdf9\udfad\u2623\ub517\u9320\uc78c\u5f9f\u73ae\ud473\u9236\u15c3\u0859\u63f5\u8375\ua2b3\ua757\ua390\ufedf\u4f9d\u41be\uca3d\u0d41\u78d0\uecbe";
                                    break block22;
                                }
lbl28:
                                // 2 sources

                                while (true) {
                                    var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                                    ** continue;
                                    break;
                                }
lbl31:
                                // 2 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                                MaceSwap.IllII = new int[var1_2];
                                var3_4 = 0;
                                var4_5 = 0;
                                ** while (true)
lbl37:
                                // 1 sources

                                while (true) {
                                    if (++var10_10 < var8_8.length) ** continue;
                                    break block17;
                                    break;
                                }
lbl40:
                                // 1 sources

                                while (true) {
                                    var13_13 = -1;
                                    ** GOTO lbl31
                                    break;
                                }
lbl43:
                                // 1 sources

                                while (true) {
                                    var12_12 = 0;
                                    ** continue;
                                    break;
                                }
                            }
                            ** while (true)
lbl48:
                            // 1 sources

                            while (true) {
                                MaceSwap.IlllI = new Object[var9_9.length];
                                ** continue;
                                break;
                            }
                            var2_3 = -661672412;
                            var0_1 = "\u0012UZ?\u00b0N\u00c8\u00e9\u001ci\u00d4\u0096\u008a\u0014\u00074g\u00a4\u008a\u00824\u00d6\u00bb\u00a6L\u00f560\u00c3\u00fa\u0005\u0012hng\u00ca\u00c4S\u007f\u0090\u00fd\u00f4\u00b0\u00b3%\u0085\u00e5\u0017\u00d7\u001f\u00ea\u00d4h&<\u000b\u00a1\u00b7\u00a2\u00c0\u008a>\u008a\u0090\u009c6q.;\u0091)\u00bd\u0003F\u00fb\u00c3\u0098\f9f\u00b3\u00f1F\u0001\u0087{\u00c8\u0085\u008a]\u009f\u00f7\u00f5\u0095\u00dd]\u00de\u0018Ra7\u0099\u00069TR\u007f\u001c\\u\u00b3\u0019\u0092\u00d8\u001b\u0084\u00faV\u00d9@(u\u009a\u00c6P\u0099\u009f\u00e8\u00c4\u00b1\u0082\u00ce~f2\b\u00fb\u00cb\u00e2\u00a9\u00a2/]\u00f4\u00a4\u00d3\u00b7\u00d5l\u00a4\u0089\u00d8\u0094\u00e5u\u009f\u00a0\b%WYH\u00cb\u00ee=\u0096h\u00eeA{$\u0010n^\u00a0A\u00c6\u00a3\u00bc\u00e2\u008a\u00d4\u00d7\u0007N\u0000\u009d\u00be\u00cc\u00a7\u00e9\u0012<+\u00ed\u00b0".getBytes("ISO-8859-1");
                            var1_2 = var0_1.length / 4;
                            ** while (true)
                        }
                        var12_12 = var8_8[var10_10] ^ var6;
                        var9_9[var10_10] = var7_7.substring(var11_11, var11_11 + var12_12);
                        ** while (true)
                    }
                    MaceSwap.IllIl = var9_9;
                    ** while (true)
                    var10_10 = 0;
                    var11_11 = 0;
                    ** while (true)
                }
                var8_8 = "\u4576\u4576\u4566\u456e\u453e\u456e\u4572\u4572\u457a\u457a\u456e\u456a".toCharArray();
                var9_9 = new String[var8_8.length];
                ** while (true)
            }
            var13_13 = 0;
            ** while (true)
        }
        MaceSwap.IllI = new String[13];
        MaceSwap.IIIllI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIl(MinecraftClient minecraftClient) {
        if (this.IIIII && minecraftClient != null) {
            minecraftClient.crosshairTarget = this.IIIlI;
        }
        this.IIIII = false;
        this.IIIlI = null;
        lIIllllI.IllllII(false);
    }

    private static void IIIlI(MinecraftClient minecraftClient, Object object, lIIlIllI lIIlIllI2) {
        if (((MaceSwap)object).lIl()) {
            lIIllllI.lIIlI(minecraftClient, object, -1, 1);
            return;
        }
        lIIllllI.llIII(minecraftClient, object, lIIlIllI2);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        LivingEntity livingEntity;
        if (this.IIIlIIl() && minecraftClient != null && minecraftClient.player != null && minecraftClient.options != null) {
            this.IlIII(minecraftClient.player);
            this.IIIl = false;
            if (this.Ill != IlIIIIlI.II) {
                this.IIlIlI(minecraftClient);
                if (this.IIIl) return;
                this.llII(minecraftClient);
                return;
            }
            if (this.lIIIII(minecraftClient)) {
                this.llII(minecraftClient);
                this.lII = false;
                return;
            }
        } else {
            this.lII = false;
            this.IlIII(null);
            return;
        }
        boolean bl = minecraftClient.options.attackKey.isPressed();
        boolean bl2 = bl && !this.lII;
        this.lII = bl;
        if (!bl2 && lIIllllI.IIl(minecraftClient.options.attackKey) <= 0) {
            return;
        }
        EntityHitResult entityHitResult = this.lllII(minecraftClient);
        this.llI = livingEntity = lIIllllI.IlIllII(minecraftClient, (HitResult)entityHitResult);
        if (livingEntity != null && this.IlII(minecraftClient, entityHitResult, livingEntity) && this.IIIIIl(minecraftClient, livingEntity)) {
            if (this.lIIll(minecraftClient, livingEntity)) {
                this.IIlIlI(minecraftClient);
                this.llII(minecraftClient);
                return;
            }
            this.llI = null;
            return;
        }
        this.llI = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private EntityHitResult IIIll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        EntityHitResult entityHitResult;
        block1: {
            if (minecraftClient == null) return null;
            if (minecraftClient.player == null) return null;
            if (livingEntity == null) break block1;
        }
        return null;
        HitResult hitResult = minecraftClient.crosshairTarget;
        EntityHitResult entityHitResult2 = hitResult instanceof EntityHitResult ? (entityHitResult = (EntityHitResult)hitResult) : null;
        EntityHitResult entityHitResult3 = entityHitResult2;
        if (!this.IlII(minecraftClient, entityHitResult2, livingEntity)) {
            entityHitResult2 = lIIllllI.lI(minecraftClient, 3.0);
        }
        if (!this.IlII(minecraftClient, entityHitResult2, livingEntity)) return this.Illl(minecraftClient, livingEntity);
        return entityHitResult2;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        if (this.IIIlIIl() && minecraftClient != null && minecraftClient.player != null && minecraftClient.options != null) {
            this.IlIII(minecraftClient.player);
            if (this.Ill != IlIIIIlI.II) {
                this.llII(minecraftClient);
            }
            this.IIIl = false;
            return;
        }
        this.IIIl = false;
    }

    private int IIlII(ItemStack itemStack, lIlllIl lIlllIl2, boolean bl) {
        int n = this.lIlII(itemStack, lIlllIl2.II);
        int n2 = this.lIlII(itemStack, lIlllIl2.ll);
        return n * 1000 + n2 * 100 + (!bl ? 0 : 1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIlIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        ItemStack itemStack = minecraftClient.player.getMainHandStack();
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) {
            return false;
        }
        String string = Registries.ITEM.getId((Object)itemStack.getItem()).getPath();
        if (string.endsWith("sword")) return true;
        if (!string.endsWith("_sword")) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIllI(LivingEntity livingEntity) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if ((Boolean)this.lIll.lIl() == false) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity == null) return false;
        if (!this.IIIlll(minecraftClient, livingEntity)) return false;
        if (this.IIIlIl(minecraftClient) < 0) return false;
        return true;
    }

    private boolean IIlll(MinecraftClient minecraftClient, EntityHitResult entityHitResult, int n) {
        return this.Illlll(minecraftClient, entityHitResult, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIII(ClientPlayerEntity clientPlayerEntity) {
        long l2;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (clientPlayerEntity == null || minecraftClient == null || minecraftClient.world == null) {
            this.lIIIIl();
            return;
        }
        if (Double.isNaN(this.IIl)) {
            this.IIl = clientPlayerEntity.getY();
        }
        if ((l2 = minecraftClient.world.getTime()) == this.Illl) {
            if (!this.IlIIll(clientPlayerEntity)) {
                this.lIlI = 0L;
                this.ll = 0.0;
                this.IIl = clientPlayerEntity.getY();
                this.IlIl = false;
                return;
            }
        } else {
            this.Illl = l2;
        }
        this.IIl = Math.max(this.IIl, clientPlayerEntity.getY());
        this.ll = Math.max(this.ll, this.IlIlII(clientPlayerEntity));
        if (this.lllI(clientPlayerEntity)) return;
        this.lIlI = 0L;
        return;
        boolean bl = this.IlIIll(clientPlayerEntity);
        boolean bl2 = bl && this.lllI(clientPlayerEntity);
        boolean bl3 = bl2;
        if (!bl) {
            this.lIlI = 0L;
            this.ll = 0.0;
            this.IIl = clientPlayerEntity.getY();
            this.IlIl = false;
            return;
        }
        this.IIl = Math.max(this.IIl, clientPlayerEntity.getY());
        if (!bl2) {
            this.lIlI = 0L;
            if (!(clientPlayerEntity.getVelocity().y > 0.0)) {
                this.ll = Math.max(this.ll, this.IlIlII(clientPlayerEntity));
                return;
            }
            this.IlIl = false;
            this.ll = 0.0;
            this.IIl = Math.max(Double.isNaN(this.IIl) ? clientPlayerEntity.getY() : this.IIl, clientPlayerEntity.getY());
            return;
        }
        if (this.lIlI == 0L && this.IlIl) {
            this.IlIl = false;
            this.ll = 0.0;
            this.IIl = clientPlayerEntity.getY();
        }
        ++this.lIlI;
        this.ll = Math.max(this.ll, this.IlIlII(clientPlayerEntity));
    }

    private static double IlIIl(double d, double d2, double d3) {
        return Math.max(d2, Math.min(d3, d));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIlI(MinecraftClient minecraftClient) {
        if (!this.IIlIIl(minecraftClient)) {
            return false;
        }
        if (this.llIl) {
            return this.IIlI(minecraftClient);
        }
        if (!this.llIlI(minecraftClient, this.IlII)) return false;
        if (!this.lIIIl(minecraftClient)) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double IlIll(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) {
            return 0.0;
        }
        double d = IlllllIl.IIlI(this.lIIlI(clientPlayerEntity), clientPlayerEntity.getVelocity().y);
        return d;
    }

    private EntityHitResult IllII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        EntityHitResult entityHitResult = this.IIIll(minecraftClient, livingEntity);
        return entityHitResult != null ? entityHitResult : this.Illl(minecraftClient, livingEntity);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlllI(MinecraftClient minecraftClient, boolean bl) {
        if (this.IIIlIIl() && minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null && minecraftClient.interactionManager != null && minecraftClient.currentScreen == null && this.llI != null && this.llI != minecraftClient.player && this.llI.isAlive() && !IIllllllI.II(this.llI) && !orchard.internal.IIlI.IIl(minecraftClient) && System.currentTimeMillis() >= this.lll) {
            if (!lIIllllI.IllllI(this.llI) || ((Boolean)this.lIll.lIl()).booleanValue() && this.IIIlIl(minecraftClient) >= 0) {
                if (bl && !this.IlIIll(minecraftClient.player)) {
                    return false;
                }
                boolean bl2 = !this.IlllIl(minecraftClient.player);
                if (bl2) return bl2;
                this.llI = null;
                return bl2;
            }
            this.llI = null;
            return false;
        }
        this.llI = null;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illll(MinecraftClient minecraftClient, LivingEntity livingEntity, int n, int n2, boolean bl, lIlllIl lIlllIl2, int n3) {
        this.llI = livingEntity;
        this.llII = n2;
        this.IlII = n;
        this.IIlIl = bl;
        this.lllI = lIlllIl2;
        this.llIl = this.IIIII(minecraftClient, lIlllIl2, bl);
        this.III = false;
        this.I = 0;
        this.II = Integer.MIN_VALUE;
        this.l = false;
        this.IIlI = n3;
        boolean bl2 = false;
        if (n2 < 0 && !this.llIl && lIIllllI.lllI(minecraftClient.player.getInventory()) != n) {
            bl2 = true;
            this.llIlI(minecraftClient, n);
        }
        long l2 = System.currentTimeMillis();
        this.Ill = n2 >= 0 ? IlIIIIlI.III : IlIIIIlI.l;
        this.IIII = l2;
        this.llll = l2;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.IlII < 0) return false;
        if (this.IlII >= 9) return false;
        if (lIIllllI.llIllI(minecraftClient) != this.IlII) return false;
        if (!lIIllllI.IllIllI(minecraftClient, this.IlII)) return false;
        if (!(minecraftClient.player.getInventory().getStack(this.IlII).getItem() instanceof MaceItem)) return false;
        if (this.llIl) {
            if (this.lIlII(minecraftClient.player.getInventory().getStack(this.IlII), lIlllIl.l.II) <= 0) return false;
        }
        if (!this.lI(minecraftClient, this.IlII)) return false;
        return true;
    }

    private double lIIlI(ClientPlayerEntity clientPlayerEntity) {
        return Math.max(this.ll, this.IlIlII(clientPlayerEntity));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        this.llI = livingEntity;
        lIlllIl lIlllIl2 = this.IIllll(minecraftClient.player);
        if (lIlllIl2 == null) {
            this.llI = null;
            return false;
        }
        int n = lIIllllI.lllI(minecraftClient.player.getInventory());
        int n2 = this.IIl(minecraftClient, lIlllIl2, this.IIllI(livingEntity));
        if (n2 < 0) {
            this.llI = null;
            return false;
        }
        boolean bl = this.IIllI(livingEntity);
        int n3 = -1;
        if (!bl || (n3 = this.IIIlIl(minecraftClient)) >= 0) {
            if (this.IIIII(minecraftClient, lIlllIl2, bl) && !this.IlIlll(minecraftClient, n2)) {
                lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
                this.IlIII = null;
                this.llI = null;
                return false;
            }
            return this.Illll(minecraftClient, livingEntity, n2, n3, bl, lIlllIl2, n);
        }
        this.llI = null;
        return false;
    }

    private int lIlII(ItemStack itemStack, String string) {
        ItemEnchantmentsComponent itemEnchantmentsComponent = (ItemEnchantmentsComponent)itemStack.getOrDefault(DataComponentTypes.ENCHANTMENTS, (Object)ItemEnchantmentsComponent.DEFAULT);
        for (RegistryEntry registryEntry : itemEnchantmentsComponent.getEnchantments()) {
            String string2 = registryEntry.getKey().map(registryKey -> registryKey.getValue().getPath()).orElse("");
            if (!string.equals(string2)) continue;
            return itemEnchantmentsComponent.getLevel(registryEntry);
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIllI(MinecraftClient minecraftClient, long l2) {
        if (this.III) {
            this.llIl(l2);
            return;
        }
        if (minecraftClient != null && minecraftClient.player != null && this.IlIIll(minecraftClient.player)) {
            if (minecraftClient.player.age < this.II) {
                return;
            }
        } else {
            this.llIl(l2);
            return;
        }
        if (lIIllllI.lIlI(minecraftClient, (Entity)this.llI)) {
            return;
        }
        if (!this.IIlIIl(minecraftClient)) {
            if (!this.IllllI(l2)) return;
            this.lllIl(minecraftClient, l2);
            this.llIl(l2);
            return;
        }
        if (!this.lII(minecraftClient, this.IlII, false)) {
            if (l2 - this.IIII <= 350L) return;
            this.lllIl(minecraftClient, l2);
            this.llIl(l2);
            return;
        }
        EntityHitResult entityHitResult = this.IllII(minecraftClient, this.llI);
        if (entityHitResult != null) {
            this.IIll = bl -> {
                long l2 = System.currentTimeMillis();
                if (bl.booleanValue()) {
                    this.III = true;
                    this.IlIl = true;
                    this.lll = l2 + 0L;
                    this.llIl(l2);
                    return;
                }
                if (this.I++ < 3 && this.IlIIll(minecraftClient.player) && !this.IllllI(l2)) {
                    this.Ill = IlIIIIlI.I;
                    this.llll = l2;
                    return;
                }
                this.llIl(l2);
            };
            if (this.IIlll(minecraftClient, entityHitResult, this.IlII)) return;
            this.IIll = null;
            if (!this.IllllI(l2)) return;
            this.lllIl(minecraftClient, l2);
            this.llIl(l2);
            return;
        }
        if (!this.IllllI(l2)) return;
        this.lllIl(minecraftClient, l2);
        this.llIl(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIII(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (!(itemStack.getItem() instanceof MaceItem)) return false;
        if (this.lIlII(itemStack, lIlllIl.l.II) <= 0) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIlI(MinecraftClient minecraftClient, int n) {
        if (this.lIl()) {
            return false;
        }
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n >= 9) {
            return false;
        }
        if (lIIllllI.llIllI(minecraftClient) == n && lIIllllI.IllIllI(minecraftClient, n)) {
            this.IlIII = null;
            return true;
        }
        if (this.IlIII == null || !this.IlIII.Il() || !lIIllllI.IlIllI(minecraftClient, this.IlIII) || this.IlIII.l() != n) {
            this.IlIII = lIIllllI.IIIIlII(minecraftClient, this, n, 0, true);
        }
        if (!lIIllllI.IIIllll(minecraftClient, this.IlIII)) return false;
        if (lIIllllI.IllIllI(minecraftClient, n)) {
            this.IlIII = null;
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean llIll(ClientPlayerEntity clientPlayerEntity) {
        this.IlIII(clientPlayerEntity);
        if (!this.lllI(clientPlayerEntity)) return false;
        if (this.lIlI < 1L) {
            return false;
        }
        if (!MaceItem.shouldDealAdditionalDamage((LivingEntity)clientPlayerEntity)) return false;
        if (!(Math.max(0.0, clientPlayerEntity.fallDistance) >= Math.max(1.5, (Double)this.Il.lIl()))) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private EntityHitResult lllII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return null;
        if (minecraftClient.player != null) {
            EntityHitResult entityHitResult = lIIllllI.lI(minecraftClient, 3.0);
            LivingEntity livingEntity = lIIllllI.IlIllII(minecraftClient, (HitResult)entityHitResult);
            if (livingEntity == null || !this.IlII(minecraftClient, entityHitResult, livingEntity)) {
                HitResult hitResult = minecraftClient.crosshairTarget;
                if (!(hitResult instanceof EntityHitResult)) return null;
                EntityHitResult entityHitResult2 = (EntityHitResult)hitResult;
                hitResult = entityHitResult2.getEntity();
                if (!(hitResult instanceof LivingEntity)) return null;
                LivingEntity livingEntity2 = (LivingEntity)hitResult;
                if (!this.IlII(minecraftClient, entityHitResult2, livingEntity2)) return null;
                return entityHitResult2;
            }
            return entityHitResult;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lllIl(MinecraftClient minecraftClient, long l2) {
        if (this.III) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (this.llI != null) {
            if (!this.IlIIll(minecraftClient.player)) {
                return false;
            }
        } else {
            return false;
        }
        if (!this.IlIlI(minecraftClient)) {
            return false;
        }
        EntityHitResult entityHitResult = this.IIlIl ? this.IllII(minecraftClient, this.llI) : this.IIIll(minecraftClient, this.llI);
        if (entityHitResult == null) {
            entityHitResult = this.Illl(minecraftClient, this.llI);
        }
        if (entityHitResult == null) {
            return false;
        }
        this.IIll = bl -> {
            long l2 = System.currentTimeMillis();
            if (!bl.booleanValue()) {
                this.llIl(l2);
                return;
            }
            this.III = true;
            this.IlIl = true;
            this.lll = l2 + 0L;
            this.llIl(l2);
        };
        boolean bl2 = this.IIlIl ? this.IIlll(minecraftClient, entityHitResult, this.IlII) : this.IllIII(minecraftClient, entityHitResult);
        if (bl2) return true;
        this.IIll = null;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llllI(MinecraftClient minecraftClient, long l2) {
        if (this.llII < 0 || !this.IlllI(minecraftClient, false)) {
            this.llIl(l2);
            return;
        }
        if (lIIllllI.lIlI(minecraftClient, (Entity)this.llI)) {
            return;
        }
        EntityHitResult entityHitResult = this.IIIll(minecraftClient, this.llI);
        if (entityHitResult == null) {
            if (!this.IllllI(l2)) return;
            this.llIl(l2);
            return;
        }
        this.llII(minecraftClient);
        if (this.lII(minecraftClient, this.llII, true)) {
            this.IIll = bl -> {
                long l2 = System.currentTimeMillis();
                if (!bl.booleanValue()) {
                    this.llIl(l2);
                    return;
                }
                this.II = minecraftClient.player.age + 1;
                this.Ill = IlIIIIlI.I;
                this.IIII = l2;
                if (this.IIlIIl(minecraftClient) && !this.lIIIl(minecraftClient)) {
                    this.llIlI(minecraftClient, this.IlII);
                }
                this.llll = l2;
            };
            boolean bl2 = this.IIlll(minecraftClient, entityHitResult, this.llII);
            if (bl2) return;
            this.IIll = null;
            this.llIl(l2);
            return;
        }
        this.llll = l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIIIII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        block1: {
            boolean bl;
            boolean bl2;
            block4: {
                block3: {
                    block2: {
                        if (this.Ill != IlIIIIlI.II) break block1;
                        this.llI = livingEntity;
                        if (this.lIIIII(minecraftClient)) {
                            return true;
                        }
                        boolean bl3 = this.IIllI(livingEntity);
                        boolean bl4 = bl3 ? this.IIlIII(minecraftClient, livingEntity) : this.IIIIIl(minecraftClient, livingEntity);
                        boolean bl5 = bl4;
                        if (!bl4 || this.lIIl(minecraftClient, livingEntity) == null) break block2;
                        lIlllIl lIlllIl2 = this.IIllll(minecraftClient.player);
                        if (lIlllIl2 == null || this.IIl(minecraftClient, lIlllIl2, bl3) < 0) break block3;
                        if (bl3 && !this.IlllII(minecraftClient, livingEntity, lIlllIl2)) break block3;
                        bl2 = true;
                        break block4;
                    }
                    this.llI = null;
                    return false;
                }
                bl2 = false;
            }
            if (bl = bl2) return bl;
            this.llI = null;
            return bl;
        }
        if (livingEntity == null) return false;
        if (livingEntity == this.llI) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        this.llI = livingEntity;
        if (this.IIIlIIl() && minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null && minecraftClient.interactionManager != null && minecraftClient.currentScreen == null && livingEntity != null && livingEntity != minecraftClient.player && livingEntity.isAlive() && !IIllllllI.II(livingEntity) && !orchard.internal.IIlI.IIl(minecraftClient) && System.currentTimeMillis() >= this.lll) {
            if (!this.llIll(minecraftClient.player)) {
                this.llI = null;
                return false;
            }
        } else {
            this.llI = null;
            return false;
        }
        if (!lIIllllI.IllllI(livingEntity) || ((Boolean)this.lIll.lIl()).booleanValue() && this.IIIlIl(minecraftClient) >= 0) {
            boolean bl = !this.IlllIl(minecraftClient.player);
            if (bl) return bl;
            this.llI = null;
            return bl;
        }
        this.llI = null;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient != null) {
            this.IlIII(minecraftClient.player);
            if (this.Ill != IlIIIIlI.II) {
                this.IIlIlI(minecraftClient);
            }
        }
    }

    @Override
    public String II() {
        return "";
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIlI(long l2, boolean bl) {
        if (l2 != this.IIlll) return;
        if (this.Ill != IlIIIIlI.lI) {
            return;
        }
        Consumer<Boolean> consumer = this.IIll;
        this.IIll = null;
        this.Ill = IlIIIIlI.l;
        if (consumer == null) {
            this.llIl(System.currentTimeMillis());
            return;
        }
        consumer.accept(bl);
    }

    private void IIIIll() {
        this.Ill = IlIIIIlI.II;
        this.IIII = 0L;
        this.llll = 0L;
        this.llII = -1;
        this.IlII = -1;
        this.IIlI = -1;
        this.llI = null;
        this.IIlIl = false;
        this.lllI = null;
        this.III = false;
        this.I = 0;
        this.II = Integer.MIN_VALUE;
        this.l = false;
        this.llIl = false;
        this.IlIII = null;
        this.IIll = null;
    }

    private long IIIlII(IIIlIlIIl iIIlIlIIl) {
        double d;
        double d2 = iIIlIlIIl.IIIl();
        if (d2 == (d = iIIlIlIIl.IIII())) {
            return Math.max(0L, Math.round(d2));
        }
        return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d2, d)));
    }

    /*
     * Unable to fully structure code
     */
    private int IIIlIl(MinecraftClient var1_1) {
        block8: {
            block11: {
                block10: {
                    block7: {
                        block9: {
                            if (var1_1 == null) break block9;
                            break block10;
                            return var2_2;
lbl5:
                            // 1 sources

                            while (true) {
                                var2_2 = 0;
                                break block7;
lbl8:
                                // 3 sources

                                while (true) {
                                    ++var2_2;
                                    break block7;
                                    break;
                                }
                                break;
                            }
lbl11:
                            // 1 sources

                            while (true) {
                                if (lIIllllI.lIIl(var3_3)) ** continue;
                                ** GOTO lbl8
                                break;
                            }
lbl14:
                            // 1 sources

                            while (true) {
                                var3_3 = var1_1.player.getInventory().getStack(var2_2);
                                if (var3_3.isEmpty()) ** GOTO lbl8
                                break block8;
                                break;
                            }
                        }
lbl19:
                        // 2 sources

                        return -1;
                    }
                    if (var2_2 < 9) {
                        ** continue;
                    }
                    break block11;
                }
                ** while (var1_1.player != null)
lbl27:
                // 1 sources

                ** while (true)
            }
            return -1;
        }
        if (var3_3.getItem() instanceof AxeItem) ** break;
        ** while (true)
        ** while (true)
    }

    private static void IIIllI() {
        MaceSwap.IllI[0] = MaceSwap.lIIIlI(MaceSwap.lIIllI(-123043681, 1263080497).toCharArray(), 76032L, 71336336);
        MaceSwap.IllI[1] = MaceSwap.lIIIlI(MaceSwap.lIIllI(-123043682, -1943242814).toCharArray(), 7371L, 1789699503);
        MaceSwap.IllI[2] = MaceSwap.lIIIlI("".toCharArray(), 69747L, 93401421);
        MaceSwap.IllI[3] = MaceSwap.lIIIlI(MaceSwap.lIIllI(-123043683, -785821209).toCharArray(), 43099L, -734487131);
        MaceSwap.IllI[4] = MaceSwap.lIIIlI(MaceSwap.lIIllI(-123043684, -1803009982).toCharArray(), 76776L, -1875567778);
        MaceSwap.IllI[5] = MaceSwap.lIIIlI(MaceSwap.lIIllI(-123043685, 1566800977).toCharArray(), 81051L, 1577864247);
        MaceSwap.IllI[6] = MaceSwap.lIIIlI(MaceSwap.lIIllI(-123043686, 1333165679).toCharArray(), 38437L, -88469616);
        MaceSwap.IllI[7] = MaceSwap.lIIIlI(MaceSwap.lIIllI(-123043687, 363136137).toCharArray(), 58116L, 1822317967);
        MaceSwap.IllI[8] = MaceSwap.lIIIlI(MaceSwap.lIIllI(-123043688, 2133270483).toCharArray(), 85700L, -66026505);
        MaceSwap.IllI[9] = MaceSwap.lIIIlI(MaceSwap.lIIllI(-123043689, 1437797319).toCharArray(), 81398L, -223374212);
        MaceSwap.IllI[10] = MaceSwap.lIIIlI(MaceSwap.lIIllI(-123043690, -1018148130).toCharArray(), 40301L, -798466451);
        MaceSwap.IllI[11] = MaceSwap.lIIIlI(MaceSwap.lIIllI(-123043691, 247228602).toCharArray(), 52511L, 1016410540);
        MaceSwap.IllI[12] = MaceSwap.lIIIlI(MaceSwap.lIIllI(-123043692, -1780215659).toCharArray(), 88140L, 134046208);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity == null) return false;
        if (!lIIllllI.IllllI(livingEntity)) return false;
        Vec3d vec3d = new Vec3d(minecraftClient.player.getX() - livingEntity.getX(), minecraftClient.player.getY() - livingEntity.getY(), minecraftClient.player.getZ() - livingEntity.getZ());
        Vec3d vec3d2 = livingEntity.getRotationVec(1.0f);
        double d = Math.hypot(vec3d.x, vec3d.z);
        if (d <= 1.0E-5) {
            return true;
        }
        if (!((vec3d2.x * vec3d.x + vec3d2.z * vec3d.z) / d > 0.0)) return false;
        return true;
    }

    private boolean IIlIII(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        return this.IIIIIl(minecraftClient, livingEntity) && this.IIllI(livingEntity);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) {
            return false;
        }
        lIlllIl lIlllIl2 = this.lllI != null ? this.lllI : this.IIllll(minecraftClient.player);
        lIlllIl lIlllIl3 = lIlllIl2;
        if (lIlllIl2 == null) {
            return false;
        }
        int n = this.llIl ? this.lIIlII(minecraftClient) : this.IllIIl(minecraftClient, lIlllIl2);
        if (n < 0) {
            this.IlII = -1;
            return false;
        }
        this.IlII = n;
        ItemStack itemStack = minecraftClient.player.getInventory().getStack(this.IlII);
        if (!(itemStack.getItem() instanceof MaceItem)) return false;
        if (!this.llIl) return true;
        if (this.lIlII(itemStack, lIlllIl.l.II) > 0) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIlI(MinecraftClient minecraftClient) {
        long l2;
        block8: {
            block7: {
                block5: {
                    block6: {
                        if (this.Ill == IlIIIIlI.II) {
                            return;
                        }
                        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.world == null || minecraftClient.interactionManager == null || minecraftClient.currentScreen != null) break block5;
                        l2 = System.currentTimeMillis();
                        if (this.Ill == IlIIIIlI.lI) {
                            if (l2 - this.IIII <= 1000L) return;
                            this.IIll = null;
                            this.Ill = IlIIIIlI.l;
                            this.llIl(l2);
                            return;
                        }
                        if (this.Ill == IlIIIIlI.III) {
                            if (l2 < this.llll) return;
                            this.llllI(minecraftClient, l2);
                            return;
                        }
                        if (this.Ill != IlIIIIlI.I) break block6;
                        if (l2 < this.llll) return;
                        if (!this.IIlIl) {
                            this.IlIIIl(minecraftClient, l2);
                            return;
                        }
                        break block7;
                    }
                    if (this.Ill == IlIIIIlI.l) {
                        if (l2 < this.llll) return;
                        this.IlIIIl(minecraftClient, l2);
                        return;
                    }
                    break block8;
                }
                this.IIllII(minecraftClient, true);
                this.IIIIll();
                return;
            }
            this.lIllI(minecraftClient, l2);
            return;
        }
        if (this.Ill != IlIIIIlI.Il) return;
        if (l2 < this.llll) return;
        if (!this.IIllII(minecraftClient, true)) return;
        this.IIIIll();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIlIll() {
        if (this.Ill == IlIIIIlI.II) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIllII(MinecraftClient minecraftClient, boolean bl) {
        boolean bl2 = bl && minecraftClient != null && minecraftClient.player != null && (Boolean)this.IlIll.lIl() != false && this.IIlI >= 0 && this.IIlI < 9;
        if (!bl2) {
            lIIllllI.llIII(minecraftClient, this, lIIlIllI.Il);
            this.IlIII = null;
            this.l = false;
            return true;
        }
        if (!this.l) {
            MaceSwap.IIIlI(minecraftClient, this, lIIlIllI.II);
            this.IlIII = null;
            this.l = true;
        }
        int n = lIIllllI.lllI(minecraftClient.player.getInventory());
        if (lIIllllI.lIlII(this)) return false;
        if (lIIllllI.IllIllI(minecraftClient, n)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private EntityHitResult IIlllI(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        EntityHitResult entityHitResult;
        if (minecraftClient == null) return null;
        if (minecraftClient.player == null) return null;
        if (livingEntity == null) return null;
        HitResult hitResult = minecraftClient.crosshairTarget;
        EntityHitResult entityHitResult2 = hitResult instanceof EntityHitResult ? (entityHitResult = (EntityHitResult)hitResult) : null;
        if (!this.IlII(minecraftClient, entityHitResult2, livingEntity)) {
            entityHitResult2 = lIIllllI.lI(minecraftClient, 3.0);
        }
        if (!this.IlII(minecraftClient, entityHitResult2, livingEntity)) return null;
        EntityHitResult entityHitResult3 = entityHitResult2;
        return entityHitResult3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIlllIl IIllll(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) {
            return null;
        }
        if (this.Ill == IlIIIIlI.II || this.lllI == null) {
            lIlllIl lIlllIl2;
            if (this.IlI(clientPlayerEntity)) {
                return lIlllIl.l;
            }
            double d = this.IlIll(clientPlayerEntity);
            if (!IlllllIl.lII(d, (Double)this.lIII.lIl())) {
                lIlllIl2 = lIlllIl.l;
                return lIlllIl2;
            }
            lIlllIl2 = lIlllIl.I;
            return lIlllIl2;
        }
        return this.lllI;
    }

    private int IlIIII(IIIlIlIIl iIIlIlIIl) {
        return Math.max(0, (int)Math.ceil((double)this.IIIlII(iIIlIlIIl) / 50.0));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIIl(MinecraftClient minecraftClient, long l2) {
        block16: {
            EntityHitResult entityHitResult;
            block18: {
                block17: {
                    block15: {
                        block13: {
                            block14: {
                                block12: {
                                    block10: {
                                        block11: {
                                            block9: {
                                                if (this.III) {
                                                    this.llIl(l2);
                                                    return;
                                                }
                                                if (lIIllllI.lIlI(minecraftClient, (Entity)this.llI)) {
                                                    return;
                                                }
                                                if (this.IlllI(minecraftClient, true)) break block9;
                                                if (this.IIlIl) {
                                                    if (!this.IllllI(l2)) return;
                                                }
                                                break block10;
                                            }
                                            if (this.IIlIIl(minecraftClient)) break block11;
                                            if (this.IIlIl) {
                                                if (!this.IllllI(l2)) return;
                                            }
                                            break block12;
                                        }
                                        if (this.IlIlI(minecraftClient)) break block13;
                                        if (l2 - this.IIII > 350L) {
                                            this.lllIl(minecraftClient, l2);
                                            this.llIl(l2);
                                            return;
                                        }
                                        break block14;
                                    }
                                    this.lllIl(minecraftClient, l2);
                                    this.llIl(l2);
                                    return;
                                }
                                this.lllIl(minecraftClient, l2);
                                this.llIl(l2);
                                return;
                            }
                            if (!this.llIlI(minecraftClient, this.IlII)) {
                                return;
                            }
                        }
                        if (!this.llIl && !this.lIIIl(minecraftClient)) {
                            return;
                        }
                        entityHitResult = this.IIlIl ? this.IllII(minecraftClient, this.llI) : this.IIIll(minecraftClient, this.llI);
                        if (entityHitResult == null) {
                            entityHitResult = this.Illl(minecraftClient, this.llI);
                        }
                        if (entityHitResult != null) break block15;
                        if (!this.IIlIl) break block16;
                        break block17;
                    }
                    this.IIll = bl -> {
                        long l2 = System.currentTimeMillis();
                        if (!bl.booleanValue()) {
                            this.llIl(l2);
                            return;
                        }
                        this.III = true;
                        this.IlIl = true;
                        this.lll = l2 + 0L;
                        this.llIl(l2);
                    };
                    break block18;
                }
                if (!this.IllllI(l2)) return;
                break block16;
            }
            boolean bl2 = this.IIlIl ? this.IIlll(minecraftClient, entityHitResult, this.IlII) : this.IllIII(minecraftClient, entityHitResult);
            if (bl2) return;
            this.IIll = null;
            if (this.IIlIl) {
                if (!this.IllllI(l2)) return;
            }
            this.lllIl(minecraftClient, l2);
            this.llIl(l2);
            return;
        }
        this.lllIl(minecraftClient, l2);
        this.llIl(l2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIIll(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) return false;
        if (clientPlayerEntity.isOnGround()) return false;
        if (clientPlayerEntity.isGliding()) return false;
        if (clientPlayerEntity.isTouchingWater()) return false;
        if (clientPlayerEntity.isSubmergedInWater()) return false;
        if (clientPlayerEntity.isInLava()) return false;
        if (clientPlayerEntity.isClimbing()) return false;
        if (clientPlayerEntity.hasVehicle()) return false;
        if (clientPlayerEntity.getAbilities().flying) return false;
        if (lIIllllI.IIllIl((Entity)clientPlayerEntity)) return false;
        return true;
    }

    private double IlIlII(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) {
            return 0.0;
        }
        double d = Double.isNaN(this.IIl) ? 0.0 : Math.max(0.0, this.IIl - clientPlayerEntity.getY());
        return Math.max(clientPlayerEntity.fallDistance, d);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IlIllI(LivingEntity livingEntity) {
        if (this.Ill == IlIIIIlI.II) return false;
        if (this.llI == null) return false;
        if (livingEntity == null) return true;
        if (livingEntity != this.llI) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIlll(MinecraftClient minecraftClient, int n) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (n < 0) return false;
        if (n < 9) {
            ItemStack itemStack = minecraftClient.player.getInventory().getStack(n);
            if (this.llIII(itemStack)) return this.lII(minecraftClient, n, false);
            return false;
        }
        return false;
    }

    private boolean IllIII(MinecraftClient minecraftClient, EntityHitResult entityHitResult) {
        block3: {
            block2: {
                if (!this.llIl) break block2;
                if (!this.IIlI(minecraftClient)) break block3;
                lIIllllI.IIIlIlI(minecraftClient);
            }
            return this.Illlll(minecraftClient, entityHitResult, this.IlII);
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private int IllIIl(MinecraftClient var1_1, lIlllIl var2_2) {
        block10: {
            block12: {
                if (var1_1 == null) return -1;
                if (var1_1.player == null) {
                    return -1;
                }
                var3_3 = lIIllllI.lllI(var1_1.player.getInventory());
                if (this.llI == null) ** GOTO lbl31
                var4_5 = this.IlIll(var1_1.player);
                var6_8 = this.llI.getAttributeValue(EntityAttributes.ARMOR);
                var8_11 = this.llI.getAttributeValue(EntityAttributes.ARMOR_TOUGHNESS);
                var10_13 = -1;
                var11_14 = -Infinity;
                var13_15 = 0;
                break block12;
lbl13:
                // 1 sources

                while (true) {
                    if (!(var8_10.getItem() instanceof MaceItem)) ** GOTO lbl36
                    if (var6_7 < 0 || var7_9 == var3_3) {
                        var6_7 = var7_9;
                    }
                    if ((var9_12 = this.IIlII(var8_10, var2_2, var7_9 == var3_3)) <= var5_6) ** GOTO lbl36
                    var5_6 = var9_12;
                    var4_4 = var7_9;
                    ** GOTO lbl36
                    break;
                }
lbl21:
                // 2 sources

                while (true) {
                    var11_14 = var15_17;
                    var10_13 = var13_15;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (var13_15 == var3_3) {
                    ** GOTO lbl21
                }
                break block10;
                while (true) {
                    block11: {
                        if (var10_13 >= 0) {
                            return var10_13;
                        }
lbl31:
                        // 3 sources

                        var4_4 = -1;
                        var5_6 = -2147483648;
                        var6_7 = -1;
                        var7_9 = 0;
                        ** GOTO lbl38
lbl36:
                        // 3 sources

                        do {
                            ++var7_9;
lbl38:
                            // 2 sources

                            if (var7_9 >= 9) break block11;
                        } while ((var8_10 = var1_1.player.getInventory().getStack(var7_9)).isEmpty());
                        ** continue;
                    }
                    if (var4_4 < 0) {
                        v0 = var6_7;
                        return v0;
                    }
                    v0 = var4_4;
                    return v0;
                }
            }
lbl48:
            // 2 sources

            while (true) {
                if (var13_15 >= 9) ** continue;
                var14_16 = var1_1.player.getInventory().getStack(var13_15);
                if (var14_16.isEmpty() || !(var14_16.getItem() instanceof MaceItem)) break;
                var15_17 = IlllllIl.ll(var4_5, this.lIlII(var14_16, lIlllIl.l.II), this.lIlII(var14_16, lIlllIl.I.II), var6_8, var8_11);
                if (!(var15_17 > var11_14)) ** break;
                ** continue;
                if (Double.compare(var15_17, var11_14) == 0) ** GOTO lbl25
                break;
            }
        }
        ++var13_15;
        ** while (true)
    }

    private void IllIlI(boolean bl) {
        if (bl) {
            this.IlIIl = lIIIlIl.lIllI();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlllII(MinecraftClient minecraftClient, LivingEntity livingEntity, lIlllIl lIlllIl2) {
        if (!this.IIllI(livingEntity)) return false;
        if (lIlllIl2 == null) return false;
        if (this.IllIIl(minecraftClient, lIlllIl2) < 0) return false;
        if (this.IIIlIl(minecraftClient) < 0) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlllIl(ClientPlayerEntity clientPlayerEntity) {
        if (lIIllllI.IllllI((LivingEntity)clientPlayerEntity)) {
            return true;
        }
        if (!clientPlayerEntity.isUsingItem()) {
            return false;
        }
        if (clientPlayerEntity.getActiveHand() == Hand.OFF_HAND) {
            return true;
        }
        ItemStack itemStack = clientPlayerEntity.getActiveItem();
        if (itemStack == null) return false;
        if (lIIllllI.IIIlIII(itemStack)) return true;
        return false;
    }

    private boolean IllllI(long l2) {
        return l2 - this.IIII > 1500L;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean Illlll(MinecraftClient minecraftClient, EntityHitResult entityHitResult, int n) {
        EntityHitResult entityHitResult2;
        boolean bl;
        ItemStack itemStack;
        boolean bl2;
        if (this.lIl()) {
            return false;
        }
        if (minecraftClient == null || minecraftClient.player == null || entityHitResult == null || n < 0 || n >= 9) {
            return false;
        }
        if (lIIllllI.lIlI(minecraftClient, (Entity)this.llI) || lIIllllI.lIlI(minecraftClient, entityHitResult.getEntity())) {
            return false;
        }
        boolean bl3 = n == this.llII && this.IIlIl;
        boolean bl4 = bl2 = this.IIlIl && (n == this.llII || n == this.IlII);
        boolean bl5 = bl2 ? this.lII(minecraftClient, n, bl3) : this.llIlI(minecraftClient, n) && lIIllllI.IllIllI(minecraftClient, n);
        ItemStack itemStack2 = itemStack = bl5 ? minecraftClient.player.getInventory().getStack(n) : ItemStack.EMPTY;
        boolean bl6 = !itemStack.isEmpty() && (bl3 ? itemStack.getItem() instanceof AxeItem && lIIllllI.lIIl(itemStack) : itemStack.getItem() instanceof MaceItem) ? true : (bl = false);
        EntityHitResult entityHitResult3 = bl && this.IlII(minecraftClient, entityHitResult, this.llI) ? entityHitResult : (entityHitResult2 = bl ? this.IIlllI(minecraftClient, this.llI) : null);
        if (entityHitResult2 == null) {
            return false;
        }
        long l2 = ++this.IIlll;
        this.Ill = IlIIIIlI.lI;
        this.IIII = System.currentTimeMillis();
        this.llll = 0L;
        this.IIIl = true;
        boolean bl7 = false;
        boolean bl8 = lIIllllI.lIIIIl();
        lIIllllI.IllllII(true);
        try {
            lIIllllI.IlIIIIl(minecraftClient);
            boolean bl9 = lIIllllI.Illlll(minecraftClient, entityHitResult2);
            this.IllIlI(bl9);
            bl7 = bl9;
        }
        finally {
            lIIllllI.IllllII(false);
            if (bl8) {
                lIIllllI.IlIIlIl();
            }
        }
        this.IIIIlI(l2, bl7);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIIII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.Ill == IlIIIIlI.II) return false;
        if (!this.IlIl) return false;
        if (!this.IlIIll(minecraftClient.player)) return false;
        if (System.currentTimeMillis() >= this.lll) return false;
        return true;
    }

    private void lIIIIl() {
        this.Illl = Long.MIN_VALUE;
        this.lIlI = 0L;
        this.ll = 0.0;
        this.IIl = Double.NaN;
        this.IlIl = false;
    }

    private static String lIIIlI(char[] cArray, long l2, int n) {
        int n2 = 0x82E2836B ^ n;
        for (int i = 0; i < cArray.length; ++i) {
            n2 = n2 ^ (int)l2 ^ ~i;
            n2 ^= n - i * cArray.length;
            n2 = -n2 * n | i;
            cArray[i] = (char)(cArray[i] ^ n2);
            int n3 = i & 0xFF;
            n = n << n3 | n >>> -n3;
            l2 ^= (long)n3;
        }
        return new String(cArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lIIIll(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (this.Ill == IlIIIIlI.II) {
            this.llI = livingEntity;
            if (!this.IIlIII(minecraftClient, livingEntity)) {
                this.llI = null;
                return false;
            }
            lIlllIl lIlllIl2 = this.IIllll(minecraftClient.player);
            boolean bl = this.IlllII(minecraftClient, livingEntity, lIlllIl2);
            if (bl) return bl;
            this.llI = null;
            return bl;
        }
        if (!this.IIlIl) return false;
        if (livingEntity == null) return false;
        if (livingEntity != this.llI) return false;
        return true;
    }

    public MaceSwap() {
        super(StringFactory.IIII("MaceSwap"), Category.II, StringFactory.IIII("Swaps to your best mace before falling attacks."));
        this.lIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Breach Swap"), true));
        this.lI = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Switch Delay"), 55.0, 60.0, 0.0, 300.0, 5.0).lII("ms"));
        this.Il = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Min Fall Distance"), 1.5, 1.5, 12.0, 0.25).IIIl("m"));
        this.lIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Density Above"), 1.5, 0.0, 12.0, 0.25).IIIl("m"));
        this.IlIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Switch Back"), true));
        this.Illl = Long.MIN_VALUE;
        this.IIl = Double.NaN;
        this.Ill = IlIIIIlI.II;
        this.II = Integer.MIN_VALUE;
        this.IlIIl = Long.MIN_VALUE;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int lIIlII(MinecraftClient minecraftClient) {
        int n;
        block7: {
            ItemStack itemStack;
            block6: {
                block4: {
                    int n2;
                    block5: {
                        block3: {
                            if (minecraftClient == null) return -1;
                            if (minecraftClient.player == null) break block3;
                            n2 = lIIllllI.lllI(minecraftClient.player.getInventory());
                            if (n2 < 0 || n2 >= 9) break block4;
                            break block5;
                        }
                        return -1;
                    }
                    if (minecraftClient.player.getInventory().getStack(n2).getItem() instanceof MaceItem && this.lIlII(minecraftClient.player.getInventory().getStack(n2), lIlllIl.l.II) > 0) {
                        return n2;
                    }
                }
                n = 0;
                if (!true) break block6;
                if (n >= 9) return -1;
                if ((itemStack = minecraftClient.player.getInventory().getStack(n)) != null && !itemStack.isEmpty() && itemStack.getItem() instanceof MaceItem && this.lIlII(itemStack, lIlllIl.l.II) > 0) break block7;
            }
            do {
                ++n;
                if (n >= 9) return -1;
            } while ((itemStack = minecraftClient.player.getInventory().getStack(n)) == null || itemStack.isEmpty() || !(itemStack.getItem() instanceof MaceItem) || this.lIlII(itemStack, lIlllIl.l.II) <= 0);
        }
        return n;
    }

    private static int lIIlIl(int n, int n2) {
        return IllII[n ^ 0x7990824] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    private static String lIIllI(int var0, int var1_1) {
        block56: {
            block53: {
                block55: {
                    block54: {
                        var3_2 = var0 ^ -123043681;
                        ** GOTO lbl75
                        while (true) {
                            break block53;
                            break;
                        }
lbl5:
                        // 1 sources

                        while (true) {
                            var9_9 = 1;
                            ** GOTO lbl96
                            break;
                        }
lbl8:
                        // 1 sources

                        while (true) {
                            var9_9 = 136;
                            ** GOTO lbl96
                            break;
                        }
lbl11:
                        // 1 sources

                        while (true) {
                            var9_9 = 200;
                            ** GOTO lbl96
                            break;
                        }
lbl14:
                        // 1 sources

                        while (true) {
                            var9_9 = 25;
                            ** GOTO lbl96
                            break;
                        }
lbl17:
                        // 1 sources

                        while (true) {
                            var9_9 = 127;
                            ** GOTO lbl96
                            break;
                        }
lbl20:
                        // 1 sources

                        while (true) {
                            var9_9 = 148;
                            ** GOTO lbl96
                            break;
                        }
lbl23:
                        // 1 sources

                        while (true) {
                            var9_9 = 23;
                            ** GOTO lbl96
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var9_9 = 141;
                            ** GOTO lbl96
                            break;
                        }
lbl29:
                        // 1 sources

                        while (true) {
                            break block54;
                            break;
                        }
lbl31:
                        // 1 sources

                        while (true) {
                            if (var2_3 == null) ** continue;
                            break block55;
                            break;
                        }
lbl34:
                        // 1 sources

                        while (true) {
                            var9_9 = 196;
                            ** GOTO lbl96
                            break;
                        }
lbl37:
                        // 1 sources

                        while (true) {
                            var2_3 = (StackTraceElement[])MaceSwap.IlllI[var3_2];
                            ** continue;
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var9_9 = 70;
                            ** GOTO lbl96
                            break;
                        }
lbl43:
                        // 1 sources

                        while (true) {
                            var9_9 = 127;
                            ** GOTO lbl96
                            break;
                        }
lbl46:
                        // 1 sources

                        while (true) {
                            var9_9 = 68;
                            ** GOTO lbl96
                            break;
                        }
lbl49:
                        // 2 sources

                        while (true) {
                            switch (var8_8 & 31) {
                                case 12: {
                                    ** continue;
                                }
                                default: {
                                    ** continue;
                                }
                                case 28: {
                                    ** continue;
                                }
                                case 1: {
                                    ** continue;
                                }
                                case 14: {
                                    ** continue;
                                }
                                case 16: {
                                    ** continue;
                                }
                                case 24: {
                                    ** continue;
                                }
                                case 18: {
                                    ** continue;
                                }
                                case 25: {
                                    ** continue;
                                }
                                case 23: {
                                    ** continue;
                                }
                                case 15: {
                                    ** continue;
                                }
                                case 7: {
                                    ** continue;
                                }
lbl75:
                                // 1 sources

                                var4_4 = MaceSwap.IllIl[var3_2].toCharArray();
                                ** continue;
lbl77:
                                // 1 sources

                                return new String(var4_4).intern();
                                case 11: {
                                    var9_9 = 32;
                                    ** GOTO lbl96
                                }
                                case 2: {
                                    var9_9 = 5;
                                    ** GOTO lbl96
                                }
                                case 5: {
                                    var9_9 = 167;
                                    ** GOTO lbl96
                                }
                                case 20: {
                                    var9_9 = 144;
                                    ** GOTO lbl96
                                }
                                case 27: {
                                    var9_9 = 223;
                                    ** GOTO lbl96
                                }
                                case 8: {
                                    var9_9 = 240;
lbl96:
                                    // 32 sources

                                    while (true) {
                                        var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
                                        ** continue;
                                        break;
                                    }
                                }
                                case 9: {
                                    var9_9 = 244;
                                    ** GOTO lbl96
                                }
                                case 17: {
                                    var9_9 = 101;
                                    ** GOTO lbl96
                                }
                            }
                            break;
                        }
                    }
                    if (++var8_8 < var4_4.length) ** GOTO lbl49
                    ** while (true)
                    {
                        case 6: {
                            var9_9 = 81;
                            ** GOTO lbl96
                        }
                        case 26: {
                            var9_9 = 49;
                            ** GOTO lbl96
                        }
                    }
lbl114:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                    {
                        case 10: {
                            var9_9 = 154;
                            ** GOTO lbl96
                        }
                        case 21: {
                            var9_9 = 177;
                            ** GOTO lbl96
                        }
                    }
                }
                var5_5 = var2_3;
                break block56;
                {
                    case 30: {
                        var9_9 = 184;
                        ** GOTO lbl96
                    }
                    case 3: {
                        var9_9 = 18;
                        ** GOTO lbl96
                    }
                }
            }
            var5_5 = new Throwable().getStackTrace();
            MaceSwap.IlllI[var3_2] = var5_5;
            break block56;
            {
                case 19: {
                    var9_9 = 2;
                    ** GOTO lbl96
                }
            }
        }
        var6_6 = var5_5[1];
        ** while (true)
        {
            case 22: {
                var9_9 = 233;
                ** GOTO lbl96
            }
            case 29: {
                var9_9 = 53;
                ** GOTO lbl96
            }
            case 4: {
                var9_9 = 56;
                ** GOTO lbl96
            }
            case 31: {
                var9_9 = 21;
                ** GOTO lbl96
            }
            ** case 13:
        }
lbl154:
        // 1 sources

        var9_9 = 60;
        ** while (true)
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ -1810364967;
        var8_8 = 0;
        ** while (true)
    }
}

