/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIIlIl
 * Module         : Auto Crystal  [COMBAT]
 * Description    : Automatically places & breaks crystals   (client's own text)
 *
 * Recovered strings in this class:
 *   - Obby Crystal Switch
 *   - Safe Explode Only
 *   - Disable On Kill
 *   - Only On Ground
 *   - Place Delay
 *   - Break Delay
 *   - Activation
 *   - .getBytes(
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.block.BlockState
 *  net.minecraft.block.Blocks
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.decoration.EndCrystalEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.entity.player.PlayerInventory
 *  net.minecraft.item.Item
 *  net.minecraft.item.Items
 *  net.minecraft.util.hit.BlockHitResult
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 *  net.minecraft.util.hit.HitResult$Type
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 *  net.minecraft.util.math.Vec3d
 *  net.minecraft.util.math.Vec3i
 */
package orchard.module.combat;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.decoration.EndCrystalEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.Vec3i;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIIIlIl;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIllIIIIl;
import orchard.internal.IIllIllIl;
import orchard.internal.lIIlIllI;
import orchard.internal.lIIllllI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class AutoCrystal
extends ModuleBase {
    private final llIll I;
    private static final int l = 1;
    private static final long II = 8000L;
    private int Il;
    private int lI = -1;
    private Vec3d ll;
    private final IIIlIlIIl III;
    private static String[] IIl;
    private final IIIlIlIIl IlI;
    private int Ill;
    private long lII;
    private final IIIIIIIIl<IIIIIIlIl> lIl = this.IIlllIl(new IIIIIIIIl<IIIIIIlIl>(StringFactory.IIII("Activation"), IIIIIIlIl.class, IIIIIIlIl.ll));
    private int llI;
    private static final double lll = 4.0;
    private final llIll IIII;
    private final llIll IIIl;
    private static final int IIlI = 1;
    private BlockHitResult IIll;
    private final llIll IlII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Only On Ground"), false));
    private static final int[] IlIl;
    private static final String[] IllI;
    private static final Object[] Illl;

    private void lI() {
        this.ll = null;
        this.lII = 0L;
    }

    private void IIl(MinecraftClient minecraftClient) {
        lIIllllI.llIII(minecraftClient, this, lIIlIllI.II);
        this.lllI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlI(MinecraftClient minecraftClient, BlockPos blockPos) {
        if (minecraftClient == null) return false;
        if (minecraftClient.world == null) return false;
        if (blockPos == null) {
            return false;
        }
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (!blockState.isOf(Blocks.OBSIDIAN) && !blockState.isOf(Blocks.BEDROCK)) {
            return false;
        }
        if (this.IIIlI(minecraftClient, blockPos.up())) {
            Vec3d vec3d = Vec3d.ofCenter((Vec3i)blockPos.up());
            if ((Boolean)this.I.lIl() == false) return true;
            if (minecraftClient.player == null) return true;
            float f = IIllIllIl.IIl((LivingEntity)minecraftClient.player, vec3d, 6.0f);
            float f2 = minecraftClient.player.getHealth() + minecraftClient.player.getAbsorptionAmount();
            if (!(f2 < 4.0f)) return true;
            if (!(f >= f2)) return true;
            return false;
        }
        return false;
    }

    private void lII(JsonObject jsonObject, String string, IIIlIlIIl iIIlIlIIl) {
        if (jsonObject == null || string == null || !jsonObject.has("settings")) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("settings");
        JsonElement jsonElement = jsonObject2.get(string);
        if (jsonElement == null || jsonElement.isJsonNull()) {
            return;
        }
        try {
            if (jsonElement.isJsonArray()) {
                JsonArray jsonArray = jsonElement.getAsJsonArray();
                if (jsonArray.size() >= 2) {
                    double d = AutoCrystal.lIl(jsonArray.get(0).getAsDouble());
                    double d2 = AutoCrystal.lIl(jsonArray.get(1).getAsDouble());
                    iIIlIlIIl.I(new double[]{d, d2});
                }
            } else if (jsonElement.isJsonPrimitive()) {
                double d = AutoCrystal.lIl(jsonElement.getAsDouble());
                iIIlIlIIl.I(new double[]{d, d});
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
    }

    private static double lIl(double d) {
        if (d > 4.0) {
            return Math.max(1.0, Math.min(4.0, (double)Math.round(d / 50.0)));
        }
        return Math.max(1.0, Math.min(4.0, d));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lll(MinecraftClient minecraftClient) {
        int n = minecraftClient.player.age;
        if (this.Il <= n && this.Ill <= n + 4 && this.llI <= n + 4) {
            return;
        }
        this.IIl(minecraftClient);
        this.IIlI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIII(MinecraftClient minecraftClient) {
        block5: {
            EntityHitResult entityHitResult;
            block7: {
                EndCrystalEntity endCrystalEntity;
                EntityHitResult entityHitResult2;
                block9: {
                    EndCrystalEntity endCrystalEntity2;
                    block8: {
                        HitResult hitResult;
                        block6: {
                            if (minecraftClient == null) return;
                            if (minecraftClient.player == null) break block5;
                            if (minecraftClient.player.age < this.llI) {
                                return;
                            }
                            entityHitResult = null;
                            hitResult = minecraftClient.crosshairTarget;
                            if (hitResult instanceof EntityHitResult && (hitResult = (entityHitResult2 = (EntityHitResult)hitResult).getEntity()) instanceof EndCrystalEntity) break block6;
                            hitResult = minecraftClient.targetedEntity;
                            if (!(hitResult instanceof EndCrystalEntity) || (endCrystalEntity2 = (EndCrystalEntity)hitResult).isRemoved()) break block7;
                            break block8;
                        }
                        endCrystalEntity = (EndCrystalEntity)hitResult;
                        if (endCrystalEntity.isRemoved()) break block7;
                        break block9;
                    }
                    if (endCrystalEntity2.isAlive()) {
                        entityHitResult = new EntityHitResult((Entity)endCrystalEntity2);
                    }
                    break block7;
                }
                if (endCrystalEntity.isAlive()) {
                    entityHitResult = entityHitResult2;
                }
            }
            if (entityHitResult == null) {
                return;
            }
            if (!this.llII(minecraftClient, entityHitResult)) {
                this.llI = minecraftClient.player.age + 1;
                return;
            }
            this.llI = this.IIIll(minecraftClient, this.IlI);
            return;
        }
    }

    private void IIlI() {
        this.Ill = 0;
        this.llI = 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlII(MinecraftClient minecraftClient) {
        block6: {
            boolean bl;
            BlockHitResult blockHitResult;
            int n;
            block5: {
                block4: {
                    if (this.lI < 0 || this.IIll == null) break block4;
                    if (minecraftClient == null) return;
                    if (minecraftClient.player == null) return;
                    if (minecraftClient.player.age < this.Il) {
                        return;
                    }
                    BlockHitResult blockHitResult2 = this.IIll;
                    n = this.lI;
                    HitResult hitResult = minecraftClient.crosshairTarget;
                    if (hitResult instanceof BlockHitResult && (blockHitResult = (BlockHitResult)hitResult).getType() == HitResult.Type.BLOCK && blockHitResult2.getBlockPos().equals((Object)blockHitResult.getBlockPos()) && this.IlI(minecraftClient, blockHitResult.getBlockPos())) break block5;
                    break block6;
                }
                this.lllI();
                return;
            }
            if (!minecraftClient.player.getInventory().getStack(n).isOf(Items.END_CRYSTAL)) {
                this.IIl(minecraftClient);
                this.Ill = minecraftClient.player.age + 1;
                return;
            }
            int n2 = lIIllllI.lllI(minecraftClient.player.getInventory());
            if (n2 != n) {
                lIIllllI.IIIIIII(minecraftClient, n, true);
                lIIllllI.IIlIlII(minecraftClient);
            }
            if (bl = lIIllllI.lIllll(minecraftClient, blockHitResult)) {
                this.IIIII(Vec3d.ofCenter((Vec3i)blockHitResult.getBlockPos().up()));
                this.Ill = this.IIIll(minecraftClient, this.III);
                this.lllI();
                return;
            }
            this.Ill = minecraftClient.player.age + 1;
            this.lllI();
            return;
        }
        this.lllI();
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 17192;
        String string = "\u3eab\u3e9d\u3ec4\u3eb2\u3eef\u5e56\u5e44\u5b21\u5b67\u5b2a\ua0f7\u9c94\u9cd2\u9c9d\u9bff\ua0ed\u9c9f\u9cd4\ua0e6\u9cc6\u9c8e\u9c80\u9be4\ua0f3\ua0b1\ua0f6\u9c9c\uc7b2\u5f2f\u3596\u5442\u5934\u0d49\ub8f2\u7ca1\ua500\u40a3\ueada\u3487\u1389\u0cd3\u4415\u3bda\u8e76\u403e\uf437\uf68b\uff1f\u8fa1\u7e13\u958f\ue280\u5aab\u74c4\u7a8f\u4f23\ub8f4\u8a0e\ud22c\uc3a9\u91ca\ud61d\ufe20\u4274\u1950\ufd11\ue251\u4dfe\u8706\u276e\u593c\ub2fc\u4efd\u4372\u63ea\u2f9a\u3e87\u4525\u0762\ub404\u9d2a\u3710\u168f\ufeff\u04e7\u470e\u8583\ud069\ud431\ub9aa\u4ef9\ud83f\ud2c2\u58a3\u3e31\u624a\u1e1a\u1d83\u0939\u6103\u20ea\u6b71\ue0ab\u9e02\u86b4\u67d9\u829e\uf430\u7b11\uae11\u24e0\uba53\ucaf1\u0b14\u753f\u895d\ua751\udc6d\u666b\ub4ba\uae69\u4039\u4303\uaebf\ue72d\u90ed\ua206\u45c3\uc74a\uc2a5\u4373\u00a7\u2ec6\u4cb8\u1a7c\u4fc9\u2d1c\u1608\ua9f0\ud35c\u2212\u168b\ub9dc\u7ee6\u996b\ue151\u1909\u9103\u49c9\u8cec\u375a\u7117\u0e67\u571f\u8fdb\uaf6c\u77f0\u92ad\u3abb\u10f6\u803f\udb41\uc207\uca10\u0370\ufe17\u4b7e\u1aa1\uf435\ue142\ub508\u6209\u7f85\uea75\ub6c7\u6f73\uab9c\uf32c\ud3f3\uc210\uf0b9\u6f9e\u3a97\u07b3\u08f6\u008d\u18f2\u1fdf\u9388\ud5ac\uf1fe\u14ea\u0c08\u7f33\u5cae\u1fbe\u95e2\u7115\uca3e\u9679\ueddf\ue330\ua023\u9a46\u170f\ude15\u75a3\u6665\uee88\u5bf9\u7647\uf60b\ub688\u2162\u4176\u8d21\u2f33\u3d10\uebe0\u4b16\u2ede\u99d8\u4a8f\ue89f\u567a\u2f56\u9c06";
        char[] cArray = "\u432d\u432d\u4339\u4324\u4338\u4338\u431c\u432c\u4334\u433c\u4338\u4338\u433c".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        block6: while (true) {
            int n3;
            int n4;
            block11: {
                int n5;
                int n6;
                int n7;
                char[] cArray2;
                block12: {
                    block10: {
                        if (bl && !(bl = false) && true) break block10;
                        int n8 = n4;
                        int n9 = n3++;
                        cArray2[n9] = (char)(cArray2[n9] ^ n8);
                        if (n3 < cArray2.length) break block11;
                        stringArray[n6] = new String(cArray2).intern();
                        n5 += n7;
                        if (++n6 < cArray.length) break block12;
                        n2 = 0;
                    }
                    n6 = 0;
                    n5 = 0;
                    n7 = 0;
                    if (n2 == 0) break;
                }
                n7 = cArray[n6] ^ n;
                cArray2 = string.substring(n5, n5 + n7).toCharArray();
                n3 = 0;
            }
            switch (n3 % 5) {
                case 3: {
                    n4 = 21;
                    continue block6;
                }
                case 4: {
                    n4 = 64;
                    continue block6;
                }
                case 1: {
                    n4 = 8;
                    continue block6;
                }
                default: {
                    n4 = 5;
                    continue block6;
                }
                case 2: 
            }
            n4 = 91;
        }
        IllI = stringArray;
        Illl = new Object[stringArray.length];
        int n10 = -431611925;
        byte[] byArray = "SK|\u00cc\u00ad@/8\u00b7;\u0000\u0099\u000fJ\u00f4\u000e\u0099\u00ac\u00dd\u0011'\u00f9^\u00eeZ~}\u00f99\u0016\u0080Q+T\u00bb\u00f6\u0083\u00a6\u00a5\u00e8Q\u0084\u0004\u00ae\u00d8\u00c8\u008c\u00b5\u00ca\n1\u00a1\u0002\u00ad\u0019\u0099\u0003V\u00ee\u00ffy\u00e8[@\u00a9\u001e\u00ae\u008fQ\u0083\u00e97\u00bd4>\u00da\u0087\u00d2\u00e3\u00de#z\u00a4gJ\u00e8\u00bdF\u00af\u00cf\u0091\u00ce\u00c8\u00a5]\u008d\u00e9e?\u00adF\u0081n\u0010r\u0010h\u00c5".getBytes("ISO-8859-1");
        int n11 = byArray.length / 4;
        IlIl = new int[n11];
        int n12 = 0;
        int n13 = 0;
        do {
            int n14 = (byArray[n12] & 0xFF) << 24 | (byArray[n12 + 1] & 0xFF) << 16 | (byArray[n12 + 2] & 0xFF) << 8 | byArray[n12 + 3] & 0xFF;
            AutoCrystal.IlIl[n13] = n14 ^= n10;
            n12 += 4;
        } while (++n13 < n11);
        IIl = new String[10];
        AutoCrystal.IIlII();
    }

    private static String IllI(char[] cArray, long l2, int n) {
        int n2 = 0x5B8DCBC1 ^ n;
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

    @Override
    public void ll() {
        this.IIlI();
        this.lI();
    }

    @Override
    public void III() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private void Illl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.world != null) {
            if (minecraftClient.player.age < this.Ill) {
                return;
            }
            HitResult hitResult = minecraftClient.crosshairTarget;
            if (!(hitResult instanceof BlockHitResult)) return;
            BlockHitResult blockHitResult = (BlockHitResult)hitResult;
            if (blockHitResult.getType() == HitResult.Type.BLOCK) {
                if (!this.IlI(minecraftClient, blockHitResult.getBlockPos())) {
                    return;
                }
                int n = this.IIIIl(minecraftClient);
                if (n >= 0) {
                    this.IIll = blockHitResult;
                    this.lI = n;
                    this.Il = minecraftClient.player.age;
                    this.IlII(minecraftClient);
                    return;
                }
                return;
            }
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int lIII(IIIlIlIIl iIIlIlIIl) {
        int n;
        double d;
        block2: {
            double d2;
            block1: {
                d = iIIlIlIIl.IIIl();
                if (d != (d2 = iIIlIlIIl.IIII())) break block1;
                break block2;
            }
            n = Math.max(1, (int)Math.round(ThreadLocalRandom.current().nextDouble(d, d2)));
            return n;
        }
        n = Math.max(1, (int)Math.round(d));
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private int lIlI(PlayerInventory var1_1, Item var2_2) {
        block4: {
            block3: {
                if (var1_1 == null) break block3;
                if (var2_2 == null) break block3;
                var3_3 = 0;
lbl4:
                // 2 sources

                while (var3_3 >= 9) {
                    return -1;
                }
                break block4;
            }
            return -1;
lbl9:
            // 1 sources

            while (true) {
                ++var3_3;
                ** GOTO lbl4
                break;
            }
lbl12:
            // 1 sources

            return var3_3;
        }
        ** while (!var1_1.getStack((int)var3_3).isOf((Item)var2_2))
lbl16:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIll() {
        if (this.ll == null) return false;
        if (System.currentTimeMillis() - this.lII > 8000L) return false;
        return true;
    }

    private boolean llII(MinecraftClient minecraftClient, EntityHitResult entityHitResult) {
        if (((Boolean)this.I.lIl()).booleanValue() && !(IIllIllIl.Ill((LivingEntity)minecraftClient.player, entityHitResult.getEntity().method_19538(), 6.0f) < minecraftClient.player.getHealth() + minecraftClient.player.getAbsorptionAmount())) {
            return false;
        }
        return lIIllllI.IIlllll(minecraftClient, entityHitResult);
    }

    public AutoCrystal() {
        super(StringFactory.IIII("Auto Crystal"), Category.II, StringFactory.IIII("Automatically places & breaks crystals"));
        this.III = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Place Delay"), 1.0, 1.0, 1.0, 4.0, 1.0).lII("ticks"));
        this.IlI = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Break Delay"), 1.0, 1.0, 1.0, 4.0, 1.0).lII("ticks"));
        this.IIIl = new llIll((Object)StringFactory.IIII("Disable On Kill"), true);
        this.IIII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Obby Crystal Switch"), true));
        this.Il = Integer.MIN_VALUE;
        this.I = this.IIlllIl(new llIll("Safe Explode Only", false));
    }

    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        this.lII(jsonObject, "Place Delay", this.III);
        this.lII(jsonObject, "Break Delay", this.IlI);
    }

    /*
     * Unable to fully structure code
     */
    public boolean llIl(MinecraftClient var1_1) {
        block14: {
            block15: {
                if (var1_1 == null) break block15;
                ** GOTO lbl35
lbl3:
                // 2 sources

                while (true) {
                    v0 = true;
                    ** GOTO lbl37
                    break;
                }
lbl6:
                // 2 sources

                while (true) {
                    v0 = true;
                    ** GOTO lbl37
                    break;
                }
lbl9:
                // 1 sources

                while (true) {
                    if (var1_1.options.attackKey != null && var1_1.options.attackKey.isPressed()) ** GOTO lbl6
                    if (true) ** GOTO lbl27
                    break;
                }
lbl12:
                // 1 sources

                while (true) {
                    v0 = true;
                    ** GOTO lbl37
                    break;
                }
            }
lbl16:
            // 2 sources

            return false;
            block10: while (true) {
                switch (((IIIIIIlIl)this.lIl.lIl()).ordinal()) {
                    case 1: {
                        ** continue;
                    }
                    case 0: {
                        ** continue;
                    }
                    while (true) {
                        v0 = false;
                        ** GOTO lbl37
                        break;
                    }
lbl27:
                    // 1 sources

                    if (!lIIllllI.IIllIII(var1_1, var1_1.options.attackKey)) break block10;
                    ** continue;
lbl29:
                    // 2 sources

                    while (true) {
                        if (!lIIllllI.IIllIII(var1_1, var1_1.options.useKey)) ** continue;
                        ** GOTO lbl3
                        break;
                    }
                    case 2: {
                        if (var1_1.options.useKey == null) ** GOTO lbl29
                        break block14;
                    }
lbl35:
                    // 1 sources

                    if (var1_1.options != null) continue block10;
                    ** continue;
lbl37:
                    // 5 sources

                    return v0;
                    default: {
                        throw new MatchException(null, null);
                    }
                }
                break;
            }
            v0 = false;
            ** while (true)
        }
        if (!var1_1.options.useKey.isPressed()) ** break;
        ** while (true)
        ** while (true)
    }

    private void lllI() {
        this.IIll = null;
        this.lI = -1;
        this.Il = Integer.MIN_VALUE;
    }

    private void IIIII(Vec3d vec3d) {
        this.ll = vec3d;
        this.lII = System.currentTimeMillis();
    }

    @Override
    public void llll() {
        this.IIlI();
        this.lI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IIIIl(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return -1;
        if (minecraftClient.player != null) {
            PlayerInventory playerInventory = minecraftClient.player.getInventory();
            int n = IIllIIIIl.llI(playerInventory);
            if (n < 0 || n >= 9 || !playerInventory.getStack(n).isOf(Items.END_CRYSTAL)) {
                if ((Boolean)this.IIII.lIl() != false) return this.lIlI(playerInventory, Items.END_CRYSTAL);
                return -1;
            }
            return n;
        }
        return -1;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIIlI(MinecraftClient minecraftClient, BlockPos blockPos) {
        BlockState blockState = minecraftClient.world.getBlockState(blockPos);
        if (!blockState.isAir()) {
            if (!blockState.isReplaceable()) return false;
        }
        if (!minecraftClient.world.getOtherEntities(null, new Box(blockPos)).isEmpty()) return false;
        return true;
    }

    @Override
    public void llI(Entity entity, byte by) {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private int IIIll(MinecraftClient minecraftClient, IIIlIlIIl iIIlIlIIl) {
        int n = this.lIII(iIIlIlIIl);
        if (minecraftClient == null) return 0;
        if (minecraftClient.player == null) return 0;
        int n2 = minecraftClient.player.age + n;
        return n2;
    }

    private static void IIlII() {
        AutoCrystal.IIl[0] = AutoCrystal.IllI(AutoCrystal.IIlll(-1419874963, 61960, '\u898c').toCharArray(), 69953L, 1568014647);
        AutoCrystal.IIl[1] = AutoCrystal.IllI(AutoCrystal.IIlll(-1539178293, 44288, '\u898b').toCharArray(), 6431L, -1482400246);
        AutoCrystal.IIl[2] = AutoCrystal.IllI(AutoCrystal.IIlll(940451089, 44810, '\u898a').toCharArray(), 55377L, 523717262);
        AutoCrystal.IIl[3] = AutoCrystal.IllI(AutoCrystal.IIlll(47203786, 55974, '\u8989').toCharArray(), 6525L, 1831361321);
        AutoCrystal.IIl[4] = AutoCrystal.IllI(AutoCrystal.IIlll(-733329487, 59912, '\u8988').toCharArray(), 21558L, 469273900);
        AutoCrystal.IIl[5] = AutoCrystal.IllI(AutoCrystal.IIlll(1313879144, 17119, '\u8987').toCharArray(), 57832L, -736994598);
        AutoCrystal.IIl[6] = AutoCrystal.IllI(AutoCrystal.IIlll(-1029412435, 55376, '\u8986').toCharArray(), 72906L, -547289593);
        AutoCrystal.IIl[7] = AutoCrystal.IllI(AutoCrystal.IIlll(-1254787370, 40339, '\u8985').toCharArray(), 51882L, 615726898);
        AutoCrystal.IIl[8] = AutoCrystal.IllI(AutoCrystal.IIlll(1458725563, 2383, '\u8984').toCharArray(), 63814L, 419351425);
        AutoCrystal.IIl[9] = AutoCrystal.IllI(AutoCrystal.IIlll(1324558881, 17002, '\u8983').toCharArray(), 82326L, 85560844);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        if (lIIllllI.IIlIlIl()) {
            this.IIlI();
            return;
        }
        if (!this.lIIl(minecraftClient)) {
            this.IIl(minecraftClient);
            this.IIlI();
            return;
        }
        this.lll(minecraftClient);
        if (!this.llIl(minecraftClient)) {
            this.IIl(minecraftClient);
            return;
        }
        if (((Boolean)this.IlII.lIl()).booleanValue() && !minecraftClient.player.isOnGround()) {
            this.IIl(minecraftClient);
            this.IIlI();
            return;
        }
        this.IIII(minecraftClient);
        this.Illl(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIlIl(PlayerEntity playerEntity) {
        if (playerEntity == null) return Double.POSITIVE_INFINITY;
        if (this.ll == null) {
            return Double.POSITIVE_INFINITY;
        }
        Vec3d vec3d = new Vec3d(playerEntity.getX(), playerEntity.getY(), playerEntity.getZ());
        return Math.sqrt(vec3d.squaredDistanceTo(this.ll));
    }

    private static int IIllI(int n, int n2) {
        return IlIl[n ^ 0xE1E18613] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlll(int n, int n2, char c) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = c ^ 0x898F;
        char[] cArray = IllI[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])Illl[n3];
        if (stackTraceElementArray2 == null) {
            AutoCrystal.Illl[n3] = stackTraceElementArray = new Throwable().getStackTrace();
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x55B6;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] - 23230;
            n7 ^= 0x4188;
            n7 += 45025;
            n7 ^= 0xCC67;
            n7 += 15956;
            n7 -= 12725;
            n7 ^= 0xC7DA;
            n7 -= 14900;
            cArray[n6] = (char)((n7 -= 44783) ^ n4 ^ n2 ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

