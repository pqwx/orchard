/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIl
 * Module         : FastXP  [PLAYER]
 * Description    : Automatically throws experience bottles to repair equipped gear.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Target durability
 *   - Start durability
 *   - Switch Delay
 *   - Auto (
 *   - .getBytes(
 *   - Automatic
 *   - mending
 *   - Delay
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
 *  net.minecraft.entity.EquipmentSlot
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.item.ItemStack
 *  net.minecraft.item.Items
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.util.ActionResult
 *  net.minecraft.util.Hand
 */
package orchard.module.player;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIlI;
import orchard.internal.IIllIIIIl;
import orchard.internal.IIlllIII;
import orchard.internal.IlIlIll;
import orchard.internal.IlIlllI;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.lIllIlIl;
import orchard.internal.llIll;
import orchard.internal.llllllll;
import orchard.mixin.MinecraftClientMixin2;

@Environment(value=EnvType.CLIENT)
public final class FastXP
extends ModuleBase {
    private final IIIlIlIIl I;
    private final llIll l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Automatic"), false));
    private boolean II;
    private Runnable Il;
    private ClientPlayerEntity lI;
    private boolean ll;
    private int III;
    private long IIl;
    private static final int IlI = 9;
    private IlIlIll Ill = null;
    private static final int lII = 1;
    private final lIlIIlI lIl;
    private final IIIlIlIIl llI = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Delay"), 1.0, 4.0, 1.0, 4.0, 1.0).lII("t"));
    private int lll = -1;
    private int IIII = -1;
    private final lIlIIlI IIIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Start durability"), 65.0, 1.0, 100.0, 1.0).IIIl("%"));
    private Runnable IIlI;
    private static String[] IIll;
    private int IlII;
    private boolean IlIl;
    private long IllI;
    private long Illl;
    private static final int[] lIII;
    private static final String[] lIIl;
    private static final Object[] lIlI;

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(ItemStack itemStack) {
        if (itemStack == null) return false;
        if (itemStack.isEmpty()) return false;
        if (itemStack.isOf(Items.EXPERIENCE_BOTTLE)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void IllIll(MinecraftClient minecraftClient) {
        this.lll(minecraftClient, false);
        if (!this.IlII(minecraftClient) || minecraftClient.options == null || minecraftClient.options.useKey == null) {
            this.IllI = 0L;
            this.IIIIl();
            return;
        }
        if (minecraftClient.options.useKey.isPressed() && this.lII(minecraftClient.player)) {
            if (this.ll) {
                return;
            }
            long l2 = System.currentTimeMillis();
            if (l2 < this.IllI) {
                IIllIIIIl.IIIIl(minecraftClient, 1);
                return;
            }
            this.III = this.lIlI(minecraftClient.player);
            this.ll = true;
            long l3 = (long)this.IIlIl() * 50L;
            this.Il = new IIlllIII(this, l3);
            lIIllllI.IIIlIlI(minecraftClient);
            return;
        }
        this.IIIIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lIIII(MinecraftClient minecraftClient) {
        if (!this.ll) {
            return;
        }
        boolean bl = this.IlII(minecraftClient) && (lIIllllI.IIIIIlI(minecraftClient) > 0 || this.lIlI(minecraftClient.player) < this.III);
        Runnable runnable = this.Il;
        this.IIIIl();
        if (!bl) return;
        if (runnable == null) return;
        runnable.run();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI(long l2, boolean bl) {
        Runnable runnable;
        if (l2 != this.IIl) return;
        if (this.II) {
            runnable = this.IIlI;
            this.II = false;
            this.IlII = Integer.MIN_VALUE;
            this.IIlI = null;
            if (!bl || runnable == null) {
                this.Illl = 0L;
                return;
            }
        } else {
            return;
        }
        runnable.run();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lII(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) return false;
        if (this.lI(clientPlayerEntity.getMainHandStack())) return true;
        if (!this.lI(clientPlayerEntity.getOffHandStack())) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(MinecraftClient minecraftClient) {
        if (!this.lIII()) {
            this.IIlII(minecraftClient);
            this.IIII();
            return;
        }
        if (!this.IlII(minecraftClient)) {
            this.IIlII(minecraftClient);
            this.IIII();
            return;
        }
        if (orchard.internal.IIlI.IIl(minecraftClient)) {
            return;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (this.IlIl && this.lI != clientPlayerEntity) {
            this.IIII();
        }
        double d = this.lIIl(clientPlayerEntity);
        double d2 = Math.max((Double)this.IIIl.lIl(), (Double)this.lIl.lIl());
        if (!this.IlIl) {
            if (!lIllIlIl.lI(d, (Double)this.IIIl.lIl())) {
                return;
            }
            this.lll = this.IllI(clientPlayerEntity);
            if (this.lll < 0) {
                return;
            }
            this.IIII = lIIllllI.lllI(clientPlayerEntity.getInventory());
            this.lI = clientPlayerEntity;
            this.IlIl = true;
        }
        if (lIllIlIl.IlII(d, d2)) {
            this.IIlII(minecraftClient);
            this.IIII();
            return;
        }
        if (!this.lI(clientPlayerEntity.getInventory().getStack(this.lll))) {
            this.lll = this.IllI(clientPlayerEntity);
            if (this.lll < 0) {
                this.IIlII(minecraftClient);
                this.IIII();
                return;
            }
        }
        if (this.Ill == null || !this.Ill.Il() || !lIIllllI.IlIllI(minecraftClient, this.Ill) || this.Ill.l() != this.lll) {
            boolean bl = lIIllllI.llIllI(minecraftClient) != this.lll;
            int n = bl ? this.Illl(this.I) : 0;
            this.Ill = lIIllllI.IIIIlII(minecraftClient, this, this.lll, n, true);
            if (this.Ill != null && this.Ill.Il()) {
                this.Illl = Long.MAX_VALUE;
            } else {
                this.Ill = null;
                this.Illl = 0L;
                return;
            }
        }
        if (!lIIllllI.IIIllll(minecraftClient, this.Ill)) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (this.II) {
            if (clientPlayerEntity.age <= this.IlII) return;
            ++this.IIl;
            this.II = false;
            this.IlII = Integer.MIN_VALUE;
            this.IIlI = null;
            this.Illl = 0L;
            return;
        }
        if (this.Illl == Long.MAX_VALUE) {
            this.Illl = l2;
        }
        if (l2 < this.Illl) {
            return;
        }
        long l3 = (long)this.IIlIl() * 50L;
        if (!this.llII(minecraftClient)) return;
        this.II = true;
        this.IlII = clientPlayerEntity.age + 1;
        this.IIlI = new llllllll(this, l3);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String II() {
        String string;
        String string2;
        String string3;
        int n;
        int n2 = (int)Math.round(this.llI.IIIl());
        if (n2 == (n = (int)Math.round(this.llI.IIII()))) {
            v0 = Integer.toString(n2);
        } else {
            int n3 = n;
            string3 = "-";
            int n4 = n2;
            v0 = string2 = n4 + string3 + n3;
        }
        if (((Boolean)this.l.lIl()).booleanValue()) {
            String string4 = "t)";
            String string5 = string2;
            string3 = "Auto (";
            string = string3 + string5 + string4;
            return string;
        }
        String string6 = "t";
        String string7 = string2;
        string = string7 + string6;
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lll(MinecraftClient minecraftClient, boolean bl) {
        if (!this.IIIlIIl()) return;
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (!this.lII(minecraftClient.player)) {
            return;
        }
        MinecraftClientMixin2 minecraftClientMixin2 = (MinecraftClientMixin2)minecraftClient;
        int n = this.IIlIl();
        if (!bl) {
            if (minecraftClientMixin2.ilovcats$getUseCd() <= n) return;
        }
        minecraftClientMixin2.ilovcats$setUseCd(n);
    }

    private void IIII() {
        ++this.IIl;
        this.IlIl = false;
        this.lI = null;
        this.IIII = -1;
        this.lll = -1;
        this.Illl = 0L;
        this.Ill = null;
        this.II = false;
        this.IlII = Integer.MIN_VALUE;
        this.IIlI = null;
    }

    public FastXP() {
        super(StringFactory.IIII("FastXP"), Category.IIl, StringFactory.IIII("Automatically throws experience bottles to repair equipped gear."));
        this.lIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Target durability"), 95.0, 1.0, 100.0, 1.0).IIIl("%"));
        this.I = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Switch Delay"), 55.0, 60.0, 0.0, 300.0, 5.0).lII("ms"));
        this.IlII = Integer.MIN_VALUE;
        this.IIIl.lIII(this::lIII);
        this.lIl.lIII(this::lIII);
    }

    private boolean IIlI(ItemStack itemStack) {
        block2: {
            ItemEnchantmentsComponent itemEnchantmentsComponent = (ItemEnchantmentsComponent)itemStack.getOrDefault(DataComponentTypes.ENCHANTMENTS, (Object)ItemEnchantmentsComponent.DEFAULT);
            for (RegistryEntry registryEntry : itemEnchantmentsComponent.getEnchantments()) {
                String string = registryEntry.getKey().map(registryKey -> registryKey.getValue().getPath()).orElse("");
                if (!"mending".equals(string)) {
                    continue;
                }
                break block2;
            }
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlII(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.interactionManager == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (!minecraftClient.player.isAlive()) return false;
        return true;
    }

    /*
     * Handled impossible loop by duplicating code
     * Enabled aggressive block sorting
     */
    private int IllI(ClientPlayerEntity clientPlayerEntity) {
        int n;
        block4: {
            block3: {
                if (clientPlayerEntity == null) {
                    return -1;
                }
                n = 0;
                if (!true) break block3;
                if (n >= 9) return -1;
                if (this.lI(clientPlayerEntity.getInventory().getStack(n))) break block4;
            }
            do {
                ++n;
                if (n >= 9) return -1;
            } while (!this.lI(clientPlayerEntity.getInventory().getStack(n)));
        }
        return n;
    }

    private int Illl(IIIlIlIIl iIIlIlIIl) {
        return Math.max(0, (int)Math.ceil((double)this.lIll(iIIlIlIIl) / 50.0));
    }

    private boolean lIII() {
        return (Boolean)this.l.lIl();
    }

    @Override
    public void III() {
        this.lll(MinecraftClient.getInstance(), false);
        this.lIl(MinecraftClient.getInstance());
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lIIl(ClientPlayerEntity clientPlayerEntity) {
        double d = 100.0;
        boolean bl = false;
        for (EquipmentSlot equipmentSlot : new EquipmentSlot[]{EquipmentSlot.HEAD, EquipmentSlot.CHEST, EquipmentSlot.LEGS, EquipmentSlot.FEET}) {
            ItemStack itemStack = clientPlayerEntity.getEquippedStack(equipmentSlot);
            if (itemStack == null || itemStack.isEmpty() || !lIllIlIl.IIlIl(itemStack.isDamageable(), this.IIlI(itemStack))) continue;
            bl = true;
            d = Math.min(d, lIllIlIl.l(itemStack.getMaxDamage(), itemStack.getDamage()));
        }
        if (!bl) {
            return 100.0;
        }
        double d2 = d;
        return d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int lIlI(ClientPlayerEntity clientPlayerEntity) {
        if (clientPlayerEntity == null) {
            return 0;
        }
        int n = this.lI(clientPlayerEntity.getMainHandStack()) ? clientPlayerEntity.getMainHandStack().getCount() : 0;
        if (!this.lI(clientPlayerEntity.getOffHandStack())) return n;
        return n += clientPlayerEntity.getOffHandStack().getCount();
    }

    private long lIll(IIIlIlIIl iIIlIlIIl) {
        double d;
        double d2 = iIIlIlIIl.IIIl();
        if (d2 == (d = iIIlIlIIl.IIII())) {
            return Math.max(0L, Math.round(d2));
        }
        return Math.max(0L, Math.round(ThreadLocalRandom.current().nextDouble(d2, d)));
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llII(MinecraftClient minecraftClient) {
        if (!this.IlII(minecraftClient)) return false;
        if (!this.IIIlI(minecraftClient)) return false;
        if (lIIllllI.IIIIIlI(minecraftClient) <= 0) {
            float f = minecraftClient.player.getYaw();
            long l2 = ++this.IIl;
            return IlIlllI.IlIII(minecraftClient, 299, f, 90.0f, () -> {
                if (!this.II) return false;
                if (l2 != this.IIl) return false;
                if (!this.IIIlI(minecraftClient)) {
                    return false;
                }
                ActionResult actionResult = minecraftClient.interactionManager.interactItem((PlayerEntity)minecraftClient.player, Hand.MAIN_HAND);
                boolean bl = actionResult != null && actionResult.isAccepted();
                this.IlI(l2, bl);
                return bl;
            });
        }
        return false;
    }

    private static String llIl(char[] cArray, long l2, int n) {
        int n2 = 0xFFBE7222 ^ n;
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
    static {
        int n = 28674;
        String string = "\u1a6a\u9172\u4b86\ud2bf\uc9da7\u54a9\u5fc7\u5daa\uf24d\u8def\ufcf0\u5447\ud186\u845b\u45b0\ue316\u9e84\u9e80\u2f96\u409e\ufba2\uf50a\uce0e\u9339\u5579\ucaf5\u7a26\ue646\u4566\uf348\uce7f\u0adf\u8c9a\uc9a9\u673c\u75c6\u9cf6\u3f0a\ud529\u2f45\u8d07\u94fe\u1003\uf40e\udfb5\u259b\u8f83\u4320\u905d\uf319\uad5b\u4d76\u7a3b\u9c91\ucc6e\ucde3\u83c0\u72e0\u5234\u4af2\u1e3c\u3a41\u6e27\u21aa\ue5a7\u9b62\ueb48\u99a6\u6729\u0d02\u4b84\u12a8\uf096\u9518\u67fc\uf171\u50d0\ud67f\u6535\u8fc3\u1f27\u4def\u34c7\ub144\u8e2a\u250b\u9b64\uf1bd\u1992\u9b71\u4e7c\u61fc\ubcef\ufbd3\u7387\u376f\u242b\ufe0a\u41c5\u9adf\u7f4d\uc1bc\u5721\u14f0\u3e45\u9b57\ucfe2\ue09a\uaa41\udb55\u129b\u8843\ua408\u515f\ub413\u9d5a\u9e42\ucdd6\ubfab\u9d15\ue554\u504b\u805b\u154a\u3ec1\u7c67\u6885\u0b69\ub44f\ub780\ufa50\ub9dd\ud99f\u65d0\u32b4\u2ef2\u8125\u27d0\u7897\u6a68\u66c9\u1a65\uded7\u8920\ua7c4\u93a1\u0561\u5923\u8dfe\u3efc\u7597\u08f8\u8956\u60ed\uecfa\ubfe0\u3941\u3d1f\ua9d8\u0535\uaa11\u02a5\uf7bf\ua2d9\uada5\u6c86\u2f20\u6471\u1bd6\u2b83\ub028\uecb0\ud753\ue242\ufcf7\u04c6\u5694\uc527\uf0a6\u8207\u0fcc\ud39d\u1ffd\ud04d\ue353\ue6b0\u9b46\ue662\uc428u\u9034\u3228\u0912\ud3b2\u024d\u503b\u0873\u59b1\ub219\u81b4\u56c4\u66f8\u1a70\u860f\uaf99\u9408\u7a39\u983a\u5a74\u92dd\u06ef\u94d7\ue2cf\u23ef\u6c22\u9a8d\u1829\u1e97\u667d";
        char[] cArray = "\u700e\u7006\u7006\u700a\u7006\u700e\u7006\u701a\u705a\u7006\u701a\u700a\u7012\u700a".toCharArray();
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
        lIIl = stringArray;
        lIlI = new Object[stringArray.length];
        int n6 = 1018559467;
        byte[] byArray = "\u001d\u0005 \u00f9W%\u00c8w&\u00d9~\u00186\u000eZ;\u00fe\u009f\u0083C)\u0005\u00f58~\u00aa\u0080\u001f\t\u00e8\u009a\u00a2j49\u0000\u0014e\u0086!\u0012ha=\u009a\u0084\u00f0\u0085\u00a6@\u00a5\u00ca5\u00b7\u00be!\u00f9 $\u00a7\b\u00c1\u0014\u00b8\u000e\u0002\u00b0\u0083\u007f\u000e\u00bbz\u00c0$\u008bI\u00ba\u00d7K/k\n<\u0092\t\u0087?F\u00ec\u00a7\\Sy'z\u0097\u00bc\u00cb\u0019\u00b7\u000bYWn\u001bt\u00e2\u0010@\u00ca>\u00bf\u00c7\u00cf=\u00dd\u009f\u00fa+\u0093w\u00a4\u0015|\u00e5\u00d0\u0099\f\u00de\u009f\u00c4nS|fS'\u0082\u00b0@r$\u00b83\u00b0\t\u00d06\u007f\u00a1\u00c5+\u0084\u00ff\u00ab;J\u0000\u0086\u0001\u009a\f\u0091+G\u00d0\u00cdX)T\u00e3\u001c\u00b4`@n\u0003\u0007\u0092\u00a7".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        lIII = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            FastXP.lIII[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        IIll = new String[15];
        FastXP.IIIII();
    }

    private static void IIIII() {
        FastXP.IIll[0] = FastXP.llIl(FastXP.IIlll(1292303773, -1910957037).toCharArray(), 2548L, -241135168);
        FastXP.IIll[1] = FastXP.llIl("".toCharArray(), 48613L, -694598398);
        FastXP.IIll[2] = FastXP.llIl(FastXP.IIlll(1292303772, 1364079162).toCharArray(), 93025L, -855309665);
        FastXP.IIll[3] = FastXP.llIl(FastXP.IIlll(1292303775, -72590921).toCharArray(), 2704L, 1094216156);
        FastXP.IIll[4] = FastXP.llIl(FastXP.IIlll(1292303774, -639892056).toCharArray(), 24901L, -1329515711);
        FastXP.IIll[5] = FastXP.llIl(FastXP.IIlll(1292303769, 608008703).toCharArray(), 58432L, 1603582682);
        FastXP.IIll[6] = FastXP.llIl(FastXP.IIlll(1292303768, -836616587).toCharArray(), 94278L, -1507574645);
        FastXP.IIll[7] = FastXP.llIl(FastXP.IIlll(1292303771, -1642252005).toCharArray(), 51680L, -1903390880);
        FastXP.IIll[8] = FastXP.llIl(FastXP.IIlll(1292303770, 399652348).toCharArray(), 98439L, 27776538);
        FastXP.IIll[9] = FastXP.llIl(FastXP.IIlll(1292303765, -1742313991).toCharArray(), 98089L, -542466397);
        FastXP.IIll[10] = FastXP.llIl(FastXP.IIlll(1292303764, 1887261500).toCharArray(), 88297L, 1713659155);
        FastXP.IIll[11] = FastXP.llIl(FastXP.IIlll(1292303767, 737161738).toCharArray(), 17655L, -1181605370);
        FastXP.IIll[12] = FastXP.llIl(FastXP.IIlll(1292303766, 1446978184).toCharArray(), 60529L, -411874455);
        FastXP.IIll[13] = FastXP.llIl(FastXP.IIlll(1292303761, 729441351).toCharArray(), 29202L, -698254945);
        FastXP.IIll[14] = FastXP.llIl(FastXP.IIlll(1292303760, 1565786812).toCharArray(), 49934L, 1040765586);
    }

    private void IIIIl() {
        this.ll = false;
        this.III = 0;
        this.Il = null;
    }

    @Override
    public void llll() {
        this.IllI = 0L;
        this.IIIIl();
        this.IIlII(MinecraftClient.getInstance());
        this.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIlI(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (this.lll < 0) return false;
        if (this.lll >= 9) {
            return false;
        }
        if (lIIllllI.lllI(minecraftClient.player.getInventory()) != this.lll) return false;
        if (!this.lI(minecraftClient.player.getInventory().getStack(this.lll))) return false;
        return true;
    }

    public void IIIll(MinecraftClient minecraftClient) {
        if (!this.ll) {
            return;
        }
        this.lll(minecraftClient, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlII(MinecraftClient minecraftClient) {
        if (minecraftClient == null) return;
        if (minecraftClient.player == null) return;
        if (minecraftClient.player != this.lI) return;
        if (this.IIII < 0) return;
        if (this.IIII < 9) {
            if (this.IIII == lIIllllI.lllI(minecraftClient.player.getInventory())) return;
            lIIllllI.IlIlllI(minecraftClient, this, this.IIII);
            return;
        }
    }

    private int IIlIl() {
        int n;
        double d = Math.min(this.llI.IIIl(), this.llI.IIII());
        double d2 = Math.max(this.llI.IIIl(), this.llI.IIII());
        int n2 = (int)Math.round(d);
        if (n2 >= (n = (int)Math.round(d2))) {
            return Math.max(0, n2);
        }
        return ThreadLocalRandom.current().nextInt(n2, n + 1);
    }

    private static int IIllI(int n, int n2) {
        return lIII[n ^ 0x44B42379] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IIlll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x4D06FD9D;
        char[] cArray = lIIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lIlI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            FastXP.lIlI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x9A2529DC;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) break;
            }
            switch (n5 & 0x1F) {
                case 17: {
                    n6 = 57;
                    continue block33;
                }
                case 7: {
                    n6 = 169;
                    continue block33;
                }
                case 13: {
                    n6 = 11;
                    continue block33;
                }
                case 25: {
                    n6 = 68;
                    continue block33;
                }
                case 30: {
                    n6 = 129;
                    continue block33;
                }
                case 5: {
                    n6 = 35;
                    continue block33;
                }
                case 27: {
                    n6 = 224;
                    continue block33;
                }
                case 15: {
                    n6 = 217;
                    continue block33;
                }
                case 1: {
                    n6 = 82;
                    continue block33;
                }
                case 18: {
                    n6 = 50;
                    continue block33;
                }
                case 28: {
                    n6 = 208;
                    continue block33;
                }
                case 24: {
                    n6 = 34;
                    continue block33;
                }
                case 31: {
                    n6 = 87;
                    continue block33;
                }
                case 26: {
                    n6 = 72;
                    continue block33;
                }
                case 22: {
                    n6 = 25;
                    continue block33;
                }
                default: {
                    n6 = 189;
                    continue block33;
                }
                case 3: {
                    n6 = 94;
                    continue block33;
                }
                case 11: {
                    n6 = 13;
                    continue block33;
                }
                case 14: {
                    n6 = 110;
                    continue block33;
                }
                case 4: {
                    n6 = 168;
                    continue block33;
                }
                case 23: {
                    n6 = 254;
                    continue block33;
                }
                case 19: {
                    n6 = 172;
                    continue block33;
                }
                case 21: {
                    n6 = 51;
                    continue block33;
                }
                case 9: {
                    n6 = 152;
                    continue block33;
                }
                case 16: {
                    n6 = 161;
                    continue block33;
                }
                case 8: {
                    n6 = 207;
                    continue block33;
                }
                case 2: {
                    n6 = 25;
                    continue block33;
                }
                case 29: {
                    n6 = 29;
                    continue block33;
                }
                case 6: {
                    n6 = 166;
                    continue block33;
                }
                case 10: {
                    n6 = 87;
                    continue block33;
                }
                case 12: {
                    n6 = 205;
                    continue block33;
                }
                case 20: 
            }
            n6 = 104;
        }
        return new String(cArray).intern();
    }
}

