/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIIIllI
 * Module         : Move Fix  [MOVEMENT]
 * Description    : Keeps movement physics correct while modules use silent rotations   (client's own text)
 *
 * Recovered strings in this class:
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
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.util.math.MathHelper
 *  net.minecraft.util.math.Vec3d
 */
package orchard.module.movement;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IlIlllI;
import orchard.internal.llIlllI;

@Environment(value=EnvType.CLIENT)
public final class MoveFix
extends ModuleBase {
    private static String[] I;
    private final IIIIIIIIl<llIlllI> l = this.IIlllIl(new IIIIIIIIl<llIlllI>(StringFactory.IIII("Mode"), llIlllI.class, llIlllI.l));
    private static final int[] II;
    private static final String[] Il;
    private static final Object[] lI;

    private static String lI(char[] cArray, long l2, int n) {
        int n2 = 0xD2854CA5 ^ n;
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

    private static void IIl() {
        MoveFix.I[0] = MoveFix.lI(MoveFix.IlII(-1115084158, '\u598b', '\uef36').toCharArray(), 17689L, -576267093);
        MoveFix.I[1] = MoveFix.lI(MoveFix.IlII(1330522410, '\u5f1a', '\uef37').toCharArray(), 27503L, -1143528574);
        MoveFix.I[2] = MoveFix.lI(MoveFix.IlII(-1086882267, '\u40af', '\uef34').toCharArray(), 39769L, -1260829077);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        block2: {
            var6 = 14967;
            var7_7 = "\u0ffb\u1605\u7887\uf148\udb43\u2ee5\u162b\uc377\u2379\u1a28\u7f3b\u0192\ua493\ued80\u69bb\u8147\u3a0a\u5692\ue366\u9575\ud5d6\u0fbf\u6947\u38af\u67b8\u3223\ubfa2\ue4ea\u90fb\u2a82\u6ee4\u25a4\u3304\u8f73\u16fa\u331f\ue10a\u17c8\u60d4\u0084\u11ca\u6e05\u3284\u08ff\ue003\u0713\ubf3d\ua30b\u2022\u679c\u04f3\u1355\u0336\ue676\u55bd\u0164\u01c0\u6159\u7b4d\u49a3\u7cd1\u3a17\u43a9\u133f\u79df\u32ec\ufea4\u84d8\u83c7\ub2c0\uf4e8\u6115\ub1f2\ub56a\u602b\uda7b\u5cc2\u6734\uca05\ub43d\u2bcb\uf65d\u6ddd\u972b\u1dc8\u1e2b\u71dd\ubf2b\ua0fa\u55b9\u00a8\ud2ac\udff9\u80f4\u2dcf\u802f\udb05\ub81a\uf44a\uf268\u91bd\u05b7\u803d\u1728\u5beb\uc97e\u770d\uc6ec";
            var8_8 = "\u3a7b\u3a2f\u3a7f".toCharArray();
            var9_9 = new String[var8_8.length];
            var13_13 = -1;
            break block2;
lbl7:
            // 1 sources

            while (true) {
                var5_6 = (var0_1[var3_4] & 255) << 24 | (var0_1[var3_4 + 1] & 255) << 16 | (var0_1[var3_4 + 2] & 255) << 8 | var0_1[var3_4 + 3] & 255;
                MoveFix.II[var4_5] = var5_6 ^= var2_3;
                var3_4 += 4;
                if (++var4_5 < var1_2) continue;
                MoveFix.I = new String[3];
                MoveFix.IIl();
                return;
            }
            var13_13 = 0;
        }
        var10_10 = 0;
        var11_11 = 0;
        var12_12 = 0;
        if (var13_13 == 0) {
            MoveFix.Il = var9_9;
            MoveFix.lI = new Object[var9_9.length];
            var2_3 = -1393171763;
            var0_1 = "\u00a6\u00cd\u00fbG\u00dej4\u00ff81\u00ef:\u00b4\u0015\u00eb\u0093\u00d4\u00f6\u00e5\u00d0".getBytes("ISO-8859-1");
            var1_2 = var0_1.length / 4;
            MoveFix.II = new int[var1_2];
            var3_4 = 0;
            var4_5 = 0;
            ** continue;
        }
lbl30:
        // 3 sources

        var12_12 = var8_8[var10_10] ^ var6;
        var9_9[var10_10] = var7_7.substring(var11_11, var11_11 + var12_12);
        var11_11 += var12_12;
        if (++var10_10 < var8_8.length) ** GOTO lbl30
    }

    public llIlllI IlI() {
        return (llIlllI)((Object)this.l.lIl());
    }

    public MoveFix() {
        super(StringFactory.IIII("Move Fix"), Category.ll, StringFactory.IIII("Keeps movement physics correct while modules use silent rotations"), false);
    }

    public boolean lII() {
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (!this.lII()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (livingEntity != minecraftClient.player) return false;
        if (!IlIlllI.IlIIl(minecraftClient)) {
            return false;
        }
        float f = Math.abs(MathHelper.wrapDegrees((float)(IlIlllI.IlIl() - minecraftClient.player.getYaw())));
        float f2 = Math.abs(IlIlllI.IIlIII() - minecraftClient.player.getPitch());
        if (f > 0.001f) return true;
        if (f2 > 0.001f) return true;
        return false;
    }

    public Vec3d lll(LivingEntity livingEntity) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (!this.lIl(minecraftClient, livingEntity)) {
            return livingEntity.getRotationVector();
        }
        return Vec3d.fromPolar((float)IlIlllI.IIlIII(), (float)IlIlllI.IlIl());
    }

    public boolean IIII() {
        return this.IlI() != llIlllI.l;
    }

    @Override
    public String II() {
        return this.IlI().toString();
    }

    private static int IIlI(int n, int n2) {
        return II[n ^ 0x52E5646F] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlII(int n, char c, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0xEF36;
        char[] cArray = Il[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            MoveFix.lI[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x2E36;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xDCA3;
            n6 ^= 0xA367;
            n6 += 19013;
            n6 ^= 0x32D1;
            n6 ^= 0x41A6;
            n6 ^= 0x2818;
            cArray[n5] = (char)((n6 += 18383) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

