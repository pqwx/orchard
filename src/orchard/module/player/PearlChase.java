/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIlIIl
 * Module         : PearlChase  [PLAYER]
 * Description    : Automatically throws a counter pearl towards an opponent's thrown ender pearl trajectory.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Rotation Mode
 *   - Health Check
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.entity.projectile.thrown.EnderPearlEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.player;

import java.util.HashSet;
import java.util.Set;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.projectile.thrown.EnderPearlEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIlIIIIl;
import orchard.internal.IlIlllI;
import orchard.internal.lIIllllI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class PearlChase
extends ModuleBase {
    private final llIll I;
    private static String[] l;
    private final IIIIIIIIl<IIlIIIIl> II = this.IIlllIl(new IIIIIIIIl<IIlIIIIl>(StringFactory.IIII("Rotation Mode"), IIlIIIIl.class, IIlIIIIl.I));
    private final Set<Integer> Il;
    private static final int[] lI;
    private static final String[] ll;
    private static final Object[] III;

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block9: {
            block10: {
                var6 = 20534;
                var7_2 = "\uff62\u5734\u9f36\u438c\u976f\uefb2\ue8b8\u29e3\u35d1\u6066\udc10\ud207\u0563\u75c1\u0cdc\u3b2c\ub9a8\ue7ce\u73f2\ub07c\u2cf1\u1119\u8d48\u496c\uf6e2\uf373\udf60\uc703\u2f00\uf7d4\ucad7\u8d56\u18ef\u145e\u8f68\u70f2\ucacf\uea3d\u6635\u6398\u6cd3\u3e0d\u1aaf\u169f\ub171\u8b07\uf237\u23d5\ub1b7\u6ce3\u14c5\uf21d\u6770\u0f6e\u99a6\u80ae\u7cd9\uda59\u1e04\u79c7\ubbef\ua18c\u1a7c\uef18\u8143\u5ae5\u3078\ub85f\ufbc6\ue5d2\ue26a\ucced\uc5bc\uc3ea\u434d\u9027\ua96d\uc085\u9ac2\u7b14\u3788\u544c\u3b4d\u680c\u4914\u8548\u4e91\ud97c\u55cf\ua67d\u1434\uf6b7\ud124\uc7be\ued7c\ua477\u5ae0\ub38c\u8141\u48a5\ueb6c\u1151\u79ef\ud8a7\u7be4\ua269\u62ea\u8006\u4f1a\ue71e\u9235\u6528\u8803\ubf49\u4283\ud21c\ubd3b\u9358\u4dfd\ufcd2\ub705\u5605\u5da0\u2715\u584f\ubf2a\u0bbe\ud346\ucd2e\u141c\u6bdf\u09f9\uaeed\u6e20\udff5\u317d\ubf36\u7134\ubf07\u7046\u82cc\u33f8\u2ae3\u7b4b\u6513\u35e1\u46a9\uc571\uf2b6\ua532\u423b\u5738\u2073\u03c1\uee98\uc5c4\u3763\uc7e9\u9373\u6409\u81f3\uada2\u8527\u0fc6\u36f0\u68f9\ub2f8\u2e06\u31a7\u9b9b\u53d3\u33a6";
                var8_3 = "\u504e\u5026\u5026\u5022".toCharArray();
                var9_4 = new String[var8_3.length];
                var13_8 = -1;
                break block10;
lbl7:
                // 1 sources

                while (true) {
                    PearlChase.ll = var9_4;
                    PearlChase.III = new Object[var9_4.length];
                    var2_11 = -2010218729;
                    var0_12 = "\u001c\u00c8\u00f0A\u00d1\u00b0\u00b7\u0097f\u009a\t^K\u00e3\u001c\u00aegP0IJ\u00dbD]\u0002\u0082^\u0099g\u0099\u00d8\n".getBytes("ISO-8859-1");
                    var1_13 = var0_12.length / 4;
                    PearlChase.lI = new int[var1_13];
                    var3_14 = 0;
                    var4_15 = 0;
                    do {
                        var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
                        PearlChase.lI[var4_15] = var5_16 ^= var2_11;
                        var3_14 += 4;
                    } while (++var4_15 < var1_13);
                    PearlChase.l = new String[4];
                    PearlChase.lll();
                    return;
                }
lbl24:
                // 2 sources

                while (true) {
                    var12_7 = var8_3[var10_5] ^ var6;
                    var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                    var15_10 = 0;
                    break block9;
                    break;
                }
                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                if (++var10_5 < var8_3.length) ** GOTO lbl24
                var13_8 = 0;
            }
            var10_5 = 0;
            var11_6 = 0;
            var12_7 = 0;
            if (var13_8 == 0) ** break;
            ** while (true)
            ** while (true)
        }
lbl41:
        // 2 sources

        switch (var15_10 % 5) {
            case 3: {
                v0 = 96;
                break;
            }
            default: {
                v0 = 105;
                break;
            }
            case 1: {
                v0 = 13;
                break;
            }
            case 2: {
                v0 = 71;
                break;
            }
            case 4: {
                v0 = 9;
            }
        }
        var16_1 = v0;
        v1 = var15_10++;
        var14_9[v1] = (char)(var14_9[v1] ^ var16_1);
        if (var15_10 < var14_9.length) ** GOTO lbl41
    }

    /*
     * Unable to fully structure code
     */
    private EnderPearlEntity IIl(MinecraftClient var1_1) {
        block7: {
            block8: {
                block6: {
                    block10: {
                        block9: {
                            if (var1_1.world == null) break block9;
                            break block10;
lbl3:
                            // 1 sources

                            while ((var5_5 = var4_4.getOwner()) != null && !var5_5.getUuid().equals(var1_1.player.getUuid())) {
                                break block6;
                            }
                            break block7;
lbl6:
                            // 1 sources

                            return null;
lbl8:
                            // 1 sources

                            while (true) {
                                var4_4 = (EnderPearlEntity)var3_3;
                                if (var4_4.isRemoved()) break block7;
                                break block8;
                                break;
                            }
lbl12:
                            // 1 sources

                            while (true) {
                                var3_3 = (Entity)var2_2.next();
                                if (var3_3 instanceof EnderPearlEntity) {
                                    ** continue;
                                }
                                break block7;
                                break;
                            }
                        }
lbl18:
                        // 2 sources

                        return null;
                    }
                    ** while (var1_1.player == null)
lbl22:
                    // 1 sources

                    var2_2 = var1_1.world.getEntities().iterator();
                    break block7;
                }
                return var4_4;
            }
            if (!this.Il.contains(var4_4.getId())) ** GOTO lbl3
        }
        ** while (!var2_2.hasNext())
lbl30:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        int n;
        EnderPearlEntity enderPearlEntity;
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (this.IIIlIIl() && minecraftClient.player != null && minecraftClient.world != null) {
            enderPearlEntity = this.IIl(minecraftClient);
            if (enderPearlEntity == null) {
                return;
            }
        } else {
            this.Il.clear();
            return;
        }
        Entity entity = enderPearlEntity.getOwner();
        if (((Boolean)this.I.lIl()).booleanValue() && entity instanceof LivingEntity) {
            LivingEntity livingEntity = (LivingEntity)entity;
            if (minecraftClient.player.getHealth() < livingEntity.getHealth()) {
                this.Il.add(enderPearlEntity.getId());
                return;
            }
        }
        if ((n = this.IlI(minecraftClient.player.getInventory(), Items.ENDER_PEARL)) < 0) {
            return;
        }
        this.Il.add(enderPearlEntity.getId());
        Vec3d vec3d = new Vec3d(enderPearlEntity.getX(), enderPearlEntity.getY(), enderPearlEntity.getZ());
        Vec3d vec3d2 = minecraftClient.player.getEyePos();
        Vec3d vec3d3 = vec3d.subtract(vec3d2);
        double d = Math.sqrt(vec3d3.x * vec3d3.x + vec3d3.z * vec3d3.z);
        float f = (float)(MathHelper.atan2((double)vec3d3.z, (double)vec3d3.x) * 57.29577951308232) - 90.0f;
        float f2 = (float)(-(MathHelper.atan2((double)vec3d3.y, (double)d) * 57.29577951308232));
        if (this.II.lIl() == IIlIIIIl.lI) {
            minecraftClient.player.setYaw(f);
            minecraftClient.player.setPitch(f2);
        }
        int n2 = n;
        IlIlllI.IlII(minecraftClient, 250, f, f2, () -> lIIllllI.IlIIIl(minecraftClient, this, n2, () -> {
            if (minecraftClient.player == null || !minecraftClient.player.getInventory().getStack(n2).isOf(Items.ENDER_PEARL)) return false;
            boolean bl = lIIllllI.llIIll(minecraftClient, Hand.MAIN_HAND);
            if (!bl) {
                return bl;
            }
            minecraftClient.player.swingHand(Hand.MAIN_HAND);
            return bl;
        }));
    }

    public PearlChase() {
        super(StringFactory.IIII("PearlChase"), Category.IIl, StringFactory.IIII("Automatically throws a counter pearl towards an opponent's thrown ender pearl trajectory."));
        this.I = this.IIlllIl(new llIll((Object)StringFactory.IIII("Health Check"), false));
        this.Il = new HashSet<Integer>();
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int IlI(PlayerInventory playerInventory, Item item) {
        int n;
        block4: {
            block3: {
                if (playerInventory == null) return -1;
                if (item == null) {
                    return -1;
                }
                n = 0;
                if (!true) break block3;
                if (n >= 9) return -1;
                if (playerInventory.getStack(n).isOf(item)) break block4;
            }
            do {
                ++n;
                if (n >= 9) return -1;
            } while (!playerInventory.getStack(n).isOf(item));
        }
        return n;
    }

    private static String lII(char[] cArray, long l2, int n) {
        int n2 = 0xA1069852 ^ n;
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

    private static void lll() {
        PearlChase.l[0] = PearlChase.lII(PearlChase.IIlI(179752880, 2035505770).toCharArray(), 39224L, 1645622533);
        PearlChase.l[1] = PearlChase.lII(PearlChase.IIlI(179752881, 99166889).toCharArray(), 68712L, 754608522);
        PearlChase.l[2] = PearlChase.lII(PearlChase.IIlI(179752882, -280881563).toCharArray(), 89665L, 1052211025);
        PearlChase.l[3] = PearlChase.lII(PearlChase.IIlI(179752883, 660289788).toCharArray(), 59986L, 1978022666);
    }

    @Override
    public void llll() {
        this.Il.clear();
    }

    private static int IIII(int n, int n2) {
        return lI[n ^ 0xBE2586E5] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IIlI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xAB6CFB0;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            PearlChase.III[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6708A48D;
        int n5 = 0;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 28 -> 88;
                case 18 -> 14;
                case 1 -> 71;
                case 14 -> 247;
                case 21 -> 20;
                case 30 -> 211;
                case 10 -> 102;
                case 12 -> 234;
                case 25 -> 69;
                case 6 -> 19;
                case 27 -> 55;
                case 16 -> 238;
                case 13 -> 20;
                case 26 -> 120;
                case 7 -> 102;
                case 19 -> 223;
                case 24 -> 151;
                case 17 -> 144;
                case 29 -> 218;
                case 9 -> 22;
                case 5 -> 196;
                case 23 -> 11;
                case 11 -> 246;
                case 31 -> 48;
                case 4 -> 59;
                case 22 -> 154;
                case 2 -> 247;
                case 8 -> 121;
                case 15 -> 46;
                default -> 123;
                case 20 -> 25;
                case 3 -> 176;
            }) ^ n2 >> 16 ^ n4;
        }
    }
}

