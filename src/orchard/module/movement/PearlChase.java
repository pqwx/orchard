/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llllllIl
 * Module         : PearlChase  [MOVEMENT]
 * Description    : Throws an ender pearl to follow escaping opponents.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Health Check
 *   - .getBytes(
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
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.entity.projectile.thrown.EnderPearlEntity
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.movement;

import java.util.HashSet;
import java.util.Iterator;
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
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IlIlllI;
import orchard.internal.IllIIIlI;
import orchard.internal.lIIllllI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class PearlChase
extends ModuleBase {
    private final IIIIIIIIl<IllIIIlI> I = this.IIlllIl(new IIIIIIIIl<IllIIIlI>(StringFactory.IIII("Mode"), IllIIIlI.class, IllIIIlI.II));
    private final Set<Integer> l;
    private final llIll II = this.IIlllIl(new llIll((Object)StringFactory.IIII("Health Check"), false));
    private static final int[] Il;
    private static final String[] lI;
    private static final Object[] ll;

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private EnderPearlEntity I(MinecraftClient minecraftClient) {
        if (minecraftClient.world == null) return null;
        if (minecraftClient.player == null) {
            return null;
        }
        Iterator iterator = minecraftClient.world.getEntities().iterator();
        boolean bl = true;
        while (true) {
            Entity entity;
            EnderPearlEntity enderPearlEntity;
            if (!bl || (bl = false) || !true) {
                Entity entity2;
                if (!enderPearlEntity.isRemoved() && !this.l.contains(enderPearlEntity.getId()) && (entity2 = enderPearlEntity.getOwner()) != null) {
                    if (!entity2.getUuid().equals(minecraftClient.player.getUuid())) return enderPearlEntity;
                }
            }
            do {
                if (!iterator.hasNext()) return null;
            } while (!((entity = (Entity)iterator.next()) instanceof EnderPearlEntity));
            enderPearlEntity = (EnderPearlEntity)entity;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public PearlChase() {
        super(StringFactory.IIII("qJFVjhV0WB2EDQ=="), Category.ll, StringFactory.IIII("rJxGkw5EEB2ZSJpXC9bM3oiRVY4VF0QT1w6QVQPcyd6dh1edCV5eG9cHj0kA3duQjIca"));
        this.l = new HashSet<Integer>();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        float f;
        float f2;
        int n;
        MinecraftClient minecraftClient;
        block6: {
            block7: {
                block5: {
                    EnderPearlEntity enderPearlEntity;
                    block3: {
                        Entity entity;
                        block4: {
                            block2: {
                                minecraftClient = MinecraftClient.getInstance();
                                if (!this.IIIlIIl() || minecraftClient.player == null || minecraftClient.world == null) break block2;
                                enderPearlEntity = this.I(minecraftClient);
                                if (enderPearlEntity == null) {
                                    return;
                                }
                                entity = enderPearlEntity.getOwner();
                                if (!((Boolean)this.II.lIl()).booleanValue()) break block3;
                                if (!(entity instanceof LivingEntity)) break block3;
                                break block4;
                            }
                            this.l.clear();
                            return;
                        }
                        LivingEntity livingEntity = (LivingEntity)entity;
                        if (minecraftClient.player.getHealth() < livingEntity.getHealth()) {
                            this.l.add(enderPearlEntity.getId());
                            return;
                        }
                    }
                    if ((n = this.IlI(minecraftClient.player.getInventory(), Items.ENDER_PEARL)) < 0) break block5;
                    this.l.add(enderPearlEntity.getId());
                    Vec3d vec3d = new Vec3d(enderPearlEntity.getX(), enderPearlEntity.getY(), enderPearlEntity.getZ());
                    Vec3d vec3d2 = minecraftClient.player.getEyePos();
                    Vec3d vec3d3 = vec3d.subtract(vec3d2);
                    double d = Math.sqrt(vec3d3.x * vec3d3.x + vec3d3.z * vec3d3.z);
                    f2 = (float)(MathHelper.atan2((double)vec3d3.z, (double)vec3d3.x) * 57.29577951308232) - 90.0f;
                    f = (float)(-(MathHelper.atan2((double)vec3d3.y, (double)d) * 57.29577951308232));
                    if (this.I.lIl() != IllIIIlI.I) break block6;
                    break block7;
                }
                return;
            }
            minecraftClient.player.setYaw(f2);
            minecraftClient.player.setPitch(f);
        }
        IlIlllI.IlII(minecraftClient, 250, f2, f, () -> {
            lIIllllI.IlIIIl(minecraftClient, this, n, () -> {
                if (minecraftClient.player == null) return false;
                if (!minecraftClient.player.getInventory().getStack(n).isOf(Items.ENDER_PEARL)) return false;
                ActionResult actionResult = lIIllllI.llllll(minecraftClient, Hand.MAIN_HAND);
                boolean bl = actionResult.isAccepted();
                if (!bl) return bl;
                minecraftClient.player.swingHand(Hand.MAIN_HAND);
                return bl;
            });
            return true;
        });
    }

    @Override
    public void llll() {
        this.l.clear();
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

    private static int lII(int n, int n2) {
        return Il[n ^ 0x8F056AD5] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 21793;
        String string = "\u285b\u29a4\u2990\u29a0\u2844\u2842\u29a0\u299a\u29a1\u29ac\u299c\u29af\u29ae\u29bb\u2997\u2997\uea94\ueaec\uea9a\ueae9\uea8d\uea99\ued57\ueae7\ueae7\ueae4\ued54\ueafc\ueaf5\ueaec\uea92\ueafa\ueae5\ued5b\uea84\ueaef\ued55\ueaf1\uea8b\ueaf4\ueaf8\ueafb\ued56\ueaf8\ueae8\ued52\ueaf3\ueaf6\ued53\uea99\ued58\ueaf3\ueaf8\ueaf3\ueaf2\uea85\uea9b\uea86\ued58\uea86\uea8a\ued53\uea87\uea86\ueae5\ueaf8\ued57\uea87\ueae9\ued5b\uea85\ueaea\uea8c\ued52\uea8d\ueae3\ued55\uea86\uea97\ueaf3\uea8c\ueaeb\uea85\uea83\u9436\u94dc\u9436\u94d3\u942f\u94d3\u947f\u947f\u4a5a\u4ba3\u4baf\u4bbf\u4a42\u4bac\u4b9c\u4a4f\u4b90\u4b91\u4b82\u4a4f\u4b91\u4bb3\u4a55\u4bba";
        char[] cArray = "\u5531\u5565\u5529\u5531".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
        lI = stringArray;
        ll = new Object[stringArray.length];
        int n6 = -631146071;
        byte[] byArray = "\u0000\u00d3\u00fe:\u00a4G\u00baA".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        Il = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            PearlChase.Il[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIl(int n, int n2, int n3) {
        StackTraceElement[] stackTraceElementArray;
        int n4 = n ^ 0xC5B2;
        char[] cArray = lI[n4].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])ll[n4];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            PearlChase.ll[n4] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n5 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x40FE;
        int n6 = 0;
        do {
            int n7 = n6++;
            int n8 = cArray[n7] ^ 0x6EB1;
            n8 += 18876;
            n8 -= 63518;
            cArray[n7] = (char)((n8 ^= 0xD015) ^ n5 ^ n3 ^ n2 >> 16);
        } while (n6 < cArray.length);
        return new String(cArray).intern();
    }
}

