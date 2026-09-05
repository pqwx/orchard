/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlllll
 * Module         : Click Simulations  [IFACE]
 * Description    : Simulates mouse clicks for module actions.   (client's own text)
 *
 * Recovered strings in this class:
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
 *  net.minecraft.client.option.KeyBinding
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 */
package orchard.module.iface;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIllIIIIl;
import orchard.internal.IIllllIIl;
import orchard.internal.lIIllllI;

@Environment(value=EnvType.CLIENT)
public final class ClickSimulations
extends ModuleBase {
    private int I = Integer.MIN_VALUE;
    private boolean l;
    private InputUtil.Key II;
    private InputUtil.Key Il;
    private int lI;
    private int ll = Integer.MIN_VALUE;
    private static final int III = 2;
    private boolean IIl;
    private int IlI;
    private static final int[] Ill;
    private static final String[] lII;
    private static final Object[] lIl;

    /*
     * Enabled aggressive block sorting
     */
    public ClickSimulations() {
        super(StringFactory.IIII("u5hdnxIXYxWaHZNYG9rRkIs="), Category.lI, StringFactory.IIII("q51ZiRVWRBmESJJWGsDb3puYXZ8SRBAamBrfVADXy5Kd1FWfDV5fEoRG"));
        IIllllIIl.III();
    }

    @Override
    public void llll() {
        this.IIII(MinecraftClient.getInstance());
    }

    public void lI(MinecraftClient minecraftClient) {
        this.IIII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void IIl(MinecraftClient minecraftClient) {
        ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
        if (clientEntrypoint == null) return;
        if (clientEntrypoint.IlI() == null) return;
        if (clientEntrypoint.IlI().lIlII() == null) return;
        clientEntrypoint.IlI().lIlII().lII(minecraftClient);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IlI(InputUtil.Key key) {
        if (key == null) return false;
        if (key.equals((Object)this.II)) return true;
        if (!key.equals((Object)this.Il)) return false;
        return true;
    }

    public boolean lII(MinecraftClient minecraftClient) {
        return this.llII(minecraftClient, true);
    }

    public boolean lIl() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lll(MinecraftClient minecraftClient, boolean bl) {
        int n;
        InputUtil.Key key = bl ? this.II : this.Il;
        if (key == null) {
            return;
        }
        KeyBinding keyBinding = bl ? minecraftClient.options.attackKey : minecraftClient.options.useKey;
        int n2 = bl ? this.I : this.ll;
        int n3 = n = bl ? this.lI : this.IlI;
        if (minecraftClient.player.age > n2) {
            this.lIlI(minecraftClient, bl);
            return;
        }
        if (keyBinding == null) return;
        if (!key.equals((Object)lIIllllI.IlllllI(keyBinding))) return;
        if (n <= 0) return;
        if (lIIllllI.IIl(keyBinding) <= 0) return;
        int n4 = lIIllllI.IIl(keyBinding);
        int n5 = Math.min(n4, n);
        IIllIIIIl.IIIlI(keyBinding, n4 - n5);
        if (bl) {
            this.lI -= n5;
        } else {
            this.IlI -= n5;
        }
        keyBinding.setPressed(lIIllllI.IIllIII(minecraftClient, keyBinding));
        if ((!bl ? this.IlI : this.lI) != 0) return;
        this.lIlI(minecraftClient, bl);
    }

    private void IIII(MinecraftClient minecraftClient) {
        this.lIlI(minecraftClient, true);
        this.lIlI(minecraftClient, false);
    }

    public boolean IIlI(MinecraftClient minecraftClient, HitResult hitResult) {
        if (hitResult == null) {
            return lIIllllI.IIllllI(minecraftClient);
        }
        return lIIllllI.IIll(minecraftClient, hitResult);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IlII(MinecraftClient minecraftClient) {
        this.IIIIl(minecraftClient);
        if (minecraftClient != null && minecraftClient.player != null && minecraftClient.options != null) {
            this.lll(minecraftClient, true);
            this.lll(minecraftClient, false);
            return;
        }
        this.IIII(minecraftClient);
    }

    @Override
    public void III() {
        this.IIIIl(MinecraftClient.getInstance());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean IllI(MinecraftClient minecraftClient, HitResult hitResult) {
        if (hitResult instanceof EntityHitResult) {
            EntityHitResult entityHitResult = (EntityHitResult)hitResult;
            return lIIllllI.IIlllll(minecraftClient, entityHitResult);
        }
        if (minecraftClient == null) {
            return false;
        }
        HitResult hitResult2 = minecraftClient.crosshairTarget;
        if (hitResult != null) {
            minecraftClient.crosshairTarget = hitResult;
        }
        try {
            boolean bl = lIIllllI.lIIll(minecraftClient);
            return bl;
        }
        finally {
            minecraftClient.crosshairTarget = hitResult2;
        }
    }

    public void Illl() {
        this.lllI();
    }

    public void lIII() {
        this.IIIII();
    }

    public boolean lIIl() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlI(MinecraftClient minecraftClient, boolean bl) {
        this.IIIlI(minecraftClient, bl);
        if (bl) {
            if (this.IIl) {
                return;
            }
        } else {
            if (!this.l) {
                this.Il = null;
                this.ll = Integer.MIN_VALUE;
                this.IlI = 0;
                return;
            }
            return;
        }
        this.II = null;
        this.I = Integer.MIN_VALUE;
        this.lI = 0;
    }

    public boolean lIll(MinecraftClient minecraftClient) {
        return this.llII(minecraftClient, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llII(MinecraftClient minecraftClient, boolean bl) {
        boolean bl2;
        if (!this.llIl(minecraftClient)) {
            return false;
        }
        boolean bl3 = bl2 = bl ? this.IIl : this.l;
        if (!bl2) {
            InputUtil.Key key;
            KeyBinding keyBinding;
            KeyBinding keyBinding2 = bl ? minecraftClient.options.attackKey : minecraftClient.options.useKey;
            InputUtil.Key key2 = lIIllllI.IlllllI(keyBinding2);
            if (lIIllllI.IlIIlll(key2)) return false;
            if (lIIllllI.IIllIII(minecraftClient, keyBinding2)) {
                return false;
            }
            KeyBinding keyBinding3 = keyBinding = bl ? minecraftClient.options.useKey : minecraftClient.options.attackKey;
            if (key2.equals((Object)lIIllllI.IlllllI(keyBinding))) {
                return false;
            }
            InputUtil.Key key3 = key = bl ? this.II : this.Il;
            if (key != null && !key.equals((Object)key2)) {
                return false;
            }
            int n = minecraftClient.player.age + 2;
            if (!bl) {
                this.Il = key2;
                this.ll = n;
            } else {
                this.II = key2;
                this.I = n;
            }
            if (!IIllllIIl.ll(minecraftClient, key2, true, false)) {
                if (key != null) return false;
                this.lIlI(minecraftClient, bl);
                return false;
            }
            if (bl) {
                ++this.lI;
            } else {
                ++this.IlI;
            }
            if (bl) {
                this.IIl = true;
            } else {
                this.l = true;
            }
            boolean bl4 = IIllllIIl.ll(minecraftClient, key2, false, true);
            if (!bl4) return bl4;
            if (!bl) {
                this.l = false;
                return bl4;
            }
            this.IIl = false;
            return bl4;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIl(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.currentScreen != null) return false;
        if (minecraftClient.options == null) return false;
        if (!minecraftClient.isWindowFocused()) return false;
        if (IIllllIIl.lI()) return true;
        return false;
    }

    public boolean lllI() {
        return lIIllllI.lIIll(MinecraftClient.getInstance());
    }

    public boolean IIIII() {
        return lIIllllI.IIllllI(MinecraftClient.getInstance());
    }

    @Override
    public boolean IlIlIII() {
        return IIllllIIl.lI();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void IIIIl(MinecraftClient minecraftClient) {
        this.IIIlI(minecraftClient, true);
        this.IIIlI(minecraftClient, false);
        if (this.II != null && this.lI == 0 && !this.IIl) {
            this.lIlI(minecraftClient, true);
        }
        if (this.Il != null && this.IlI == 0 && !this.l) {
            this.lIlI(minecraftClient, false);
        }
        if (minecraftClient != null && minecraftClient.player != null) {
            if (this.II != null && minecraftClient.player.age > this.I) {
                this.lIlI(minecraftClient, true);
            }
            if (this.Il == null) return;
            if (minecraftClient.player.age <= this.ll) return;
            this.lIlI(minecraftClient, false);
            return;
        }
        this.IIII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlI(MinecraftClient minecraftClient, boolean bl) {
        InputUtil.Key key = bl ? this.II : this.Il;
        boolean bl2 = !bl ? this.l : this.IIl;
        if (!bl2) return;
        if (key == null) return;
        if (!IIllllIIl.ll(minecraftClient, key, false, true)) {
            return;
        }
        if (!bl) {
            this.l = false;
            return;
        }
        this.IIl = false;
    }

    private static int IIIll(int n, int n2) {
        return Ill[n ^ 0x4AE0B639] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 17901;
        String string = "\uf8ca\uf88f\uf88f\uf8b9\uf85f\uf85d\uf85e\uf886\uf88c\uf8c8\uf817\uf874\uf875\uf82a\uf814\uf86b\uf8a5\uf8d7\uf8cd\uf8d7\uf8bf\uf80a\uf8f8\uf865\u2f2a\u2f6b\u2f32\u2f63\u2fbc\u2f93\u2fa5\u2f6d\u2f63\u2f16\u2fc9\u2fb4\u2f8a\u2fde\u2ff4\u2f81\u2f41\u2f79\u2f1f\u2f03\u2f03\u2fd7\u2f1a\u2fe5\u2f09\u2f95\u2fb5\u2fd6\u2f04\u2f3e\u2f61\u2f4e\u2f36\u2f1c\u2f71\u2f5f\u2f83\u2f80\u2fb7\u2f62\u2f48\u2f61\u2fef\u2f95\u2fe8\u2fd2\u2fe9\u2fb0\u2f42\u2f5c\u2f6e\u2f07\u2f75\u2fc8\u2f3d\u2ffb";
        char[] cArray = "\u45f5\u45d5".toCharArray();
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
        lII = stringArray;
        lIl = new Object[stringArray.length];
        int n6 = 1782923169;
        byte[] byArray = "\u00d6<\u00d2\u00c2\u00a4?\u00d1n\u0002\u0097\u00ca&{!\u0010\u0006".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        Ill = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            ClickSimulations.Ill[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static String IIlII(int var0, int var1_1) {
        var3_2 = var0 ^ 1969282494;
        var4_4 = ClickSimulations.lII[var3_2].toCharArray();
        var2_3 = (StackTraceElement[])ClickSimulations.lIl[var3_2];
        if (var2_3 != null) {
            var5_5 = var2_3;
        } else {
            var5_5 = new Throwable().getStackTrace();
            ClickSimulations.lIl[var3_2] = var5_5;
        }
        var6_6 = var5_5[1];
        var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 1109869034;
        var8_8 = 0;
        if (true) ** GOTO lbl16
        block33: while (true) {
            var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
            if (++var8_8 >= var4_4.length) break;
lbl16:
            // 2 sources

            switch (var8_8 & 31) {
                case 10: {
                    var9_9 = 188;
                    continue block33;
                }
                case 9: {
                    var9_9 = 76;
                    continue block33;
                }
                case 22: {
                    var9_9 = 119;
                    continue block33;
                }
                case 27: {
                    var9_9 = 157;
                    continue block33;
                }
                case 16: {
                    var9_9 = 30;
                    continue block33;
                }
                case 1: {
                    var9_9 = 70;
                    continue block33;
                }
                case 11: {
                    var9_9 = 233;
                    continue block33;
                }
                case 28: {
                    var9_9 = 78;
                    continue block33;
                }
                case 21: {
                    var9_9 = 191;
                    continue block33;
                }
                case 25: {
                    var9_9 = 215;
                    continue block33;
                }
                case 30: {
                    var9_9 = 56;
                    continue block33;
                }
                default: {
                    var9_9 = 67;
                    continue block33;
                }
                case 18: {
                    var9_9 = 67;
                    continue block33;
                }
                case 6: {
                    var9_9 = 235;
                    continue block33;
                }
                case 29: {
                    var9_9 = 100;
                    continue block33;
                }
                case 24: {
                    var9_9 = 73;
                    continue block33;
                }
                case 23: {
                    var9_9 = 164;
                    continue block33;
                }
                case 20: {
                    var9_9 = 40;
                    continue block33;
                }
                case 17: {
                    var9_9 = 18;
                    continue block33;
                }
                case 7: {
                    var9_9 = 34;
                    continue block33;
                }
                case 8: {
                    var9_9 = 41;
                    continue block33;
                }
                case 5: {
                    var9_9 = 217;
                    continue block33;
                }
                case 26: {
                    var9_9 = 149;
                    continue block33;
                }
                case 3: {
                    var9_9 = 33;
                    continue block33;
                }
                case 2: {
                    var9_9 = 27;
                    continue block33;
                }
                case 19: {
                    var9_9 = 121;
                    continue block33;
                }
                case 31: {
                    var9_9 = 55;
                    continue block33;
                }
                case 12: {
                    var9_9 = 193;
                    continue block33;
                }
                case 13: {
                    var9_9 = 140;
                    continue block33;
                }
                case 14: {
                    var9_9 = 166;
                    continue block33;
                }
                case 15: {
                    var9_9 = 206;
                    continue block33;
                }
                case 4: 
            }
            var9_9 = 205;
        }
        return new String(var4_4).intern();
    }
}

