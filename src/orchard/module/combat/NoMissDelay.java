/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIllIlI
 * Module         : NoMissDelay  [COMBAT]
 * Description    : Removes the missed-hit attack delay based on chance.   (client's own text)
 *
 * Recovered strings in this class:
 *   - .getBytes(
 *   - Chance
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
 *  net.minecraft.util.hit.EntityHitResult
 *  net.minecraft.util.hit.HitResult
 */
package orchard.module.combat;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIllllllI;
import orchard.internal.lIlIIlI;
import orchard.mixin.MinecraftClientMixin2;

@Environment(value=EnvType.CLIENT)
public final class NoMissDelay
extends ModuleBase {
    private int I;
    private static String[] l;
    private boolean II;
    private final lIlIIlI Il = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Chance"), 100.0, 0.0, 100.0, 1.0).IIIl("%"));
    private static final int[] lI;
    private static final String[] ll;
    private static final Object[] III;

    @Override
    public void llll() {
        this.I = 0;
        this.II = false;
    }

    @Override
    public void ll() {
        this.I = 0;
        this.II = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void I(Entity entity) {
        this.II = entity != null;
    }

    public NoMissDelay() {
        super(StringFactory.IIII("NoMissDelay"), Category.II, StringFactory.IIII("Removes the missed-hit attack delay based on chance."));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lI() {
        double d = (Double)this.Il.lIl();
        if (d <= 0.0) return false;
        if (d >= 100.0) return true;
        if (!(ThreadLocalRandom.current().nextDouble(100.0) < d)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIl(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) {
            return false;
        }
        HitResult hitResult = minecraftClient.crosshairTarget;
        if (!(hitResult instanceof EntityHitResult)) return this.lI();
        EntityHitResult entityHitResult = (EntityHitResult)hitResult;
        hitResult = entityHitResult.getEntity();
        if (hitResult == null) return this.lI();
        if (hitResult == minecraftClient.player) return this.lI();
        if (!hitResult.isAlive()) return this.lI();
        if (hitResult.isRemoved()) return this.lI();
        if (hitResult.isSpectator()) return this.lI();
        if (IIllllllI.I((Entity)hitResult)) return this.lI();
        return false;
    }

    private static void IlI() {
        NoMissDelay.l[0] = NoMissDelay.lII(NoMissDelay.lll('\ud5c8', '\u5f5d', -465016045).toCharArray(), 22346L, -780247117);
        NoMissDelay.l[1] = NoMissDelay.lII(NoMissDelay.lll('\ud554', '\u5f5c', -1933946165).toCharArray(), 50727L, -298336400);
        NoMissDelay.l[2] = NoMissDelay.lII(NoMissDelay.lll('\ua696', '\u5f5f', -1625801526).toCharArray(), 41809L, -239500131);
        NoMissDelay.l[3] = NoMissDelay.lII(NoMissDelay.lll('\u8e45', '\u5f5e', 576600134).toCharArray(), 54158L, 80380881);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        int n;
        block6: {
            block4: {
                MinecraftClientMixin2 minecraftClientMixin2;
                block5: {
                    block3: {
                        MinecraftClient minecraftClient = MinecraftClient.getInstance();
                        if (minecraftClient == null || minecraftClient.player == null) {
                            this.I = 0;
                            this.II = false;
                            return;
                        }
                        minecraftClientMixin2 = (MinecraftClientMixin2)minecraftClient;
                        n = minecraftClientMixin2.ilovcats$getAttackCooldown();
                        if (n <= 0 || this.I > 0) break block3;
                        if (this.II) break block4;
                        break block5;
                    }
                    if (n <= 0 && this.I <= 0) {
                        this.II = false;
                    }
                    break block6;
                }
                if (this.lI()) {
                    minecraftClientMixin2.ilovcats$setAttackCooldown(0);
                    n = 0;
                }
            }
            this.II = false;
        }
        this.I = n;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block4: {
            var6 = 3409;
            var7_1 = "\uace3\u8a15\ud298\u76bf\u84dd\u0fb0\u423d\uabcc\ud16c\u50cc\uc87d\ua321\u617c\u4fb3\u970f\uce03\u22b4\u12ab\uf5a0\u5757\u2f2e\u6203\udb0c\uf61e\u2542\uab43\uc571\u8f32\u598b\u26fd\u9035\u2081\u4c85\u1acb\u421d\u5a52\u686a\u8b88\u681b\u1be9\uc0b5\ud7fb\ubdc5\u7156\ubcdf\u81d8\uab0b\uadcc\u35da\u09de\u8220\u4361\ubc1a\u666b\uff50\u67ae\u634e\u1adb\u04c2\u4625\u738b\ufa19\ue4b5\u6237\u81c7\ue149\uc93e\u198f\ud29c\u0120\u6a89\u470a\ubad2\u7cc5\u390b\u1100\ucea6\u3dfa\uc14f\uc85c\uf75a\u4ce9\u32ab\u33ad\ua44f\ufb62\u41d8\udbfc\ua6fe\u15a6\u62e7\u6275\u9fbf\ucb7f\u7dd0\u6182\u7788\u1137\ud94c\ua96b";
            var8_2 = "\u0d19\u0d41\u0d59\u0d55".toCharArray();
            var9_3 = new String[var8_2.length];
            var13_7 = -1;
            break block4;
            while (true) {
                NoMissDelay.ll = var9_3;
                NoMissDelay.III = new Object[var9_3.length];
                var2_10 = 1023912110;
                var0_8 = "B\u0093\u00a4\u00e8]\u00c4<\u00ce<\u0006\u00a1\u00db\u001a\u0095\u009c\u00aej\u000f\u00b8\f/\u001e{\u00d7".getBytes("ISO-8859-1");
                var1_9 = var0_8.length / 4;
                NoMissDelay.lI = new int[var1_9];
                var3_11 = 0;
                var4_12 = 0;
                do {
                    var5_13 = (var0_8[var3_11] & 255) << 24 | (var0_8[var3_11 + 1] & 255) << 16 | (var0_8[var3_11 + 2] & 255) << 8 | var0_8[var3_11 + 3] & 255;
                    NoMissDelay.lI[var4_12] = var5_13 ^= var2_10;
                    var3_11 += 4;
                } while (++var4_12 < var1_9);
                NoMissDelay.l = new String[4];
                NoMissDelay.IlI();
                return;
            }
        }
        while (true) {
            var10_4 = 0;
            var11_5 = 0;
            var12_6 = 0;
            if (var13_7 == 0) ** continue;
            do {
                var12_6 = var8_2[var10_4] ^ var6;
                var9_3[var10_4] = var7_1.substring(var11_5, var11_5 + var12_6);
                var11_5 += var12_6;
            } while (++var10_4 < var8_2.length);
            var13_7 = 0;
        }
    }

    private static String lII(char[] cArray, long l2, int n) {
        int n2 = 0x3B8BB5D1 ^ n;
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

    private static int lIl(int n, int n2) {
        return lI[n ^ 0xCD9CC580] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lll(char c, char c2, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0x5F5D;
        char[] cArray = ll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            NoMissDelay.III[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x591;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x8370;
            n6 += 34929;
            n6 += 29859;
            n6 -= 55995;
            n6 -= 14102;
            n6 ^= 0xB16B;
            cArray[n5] = (char)((n6 -= 15854) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

