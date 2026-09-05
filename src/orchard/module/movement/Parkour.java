/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllII
 * Module         : Parkour  [MOVEMENT]
 * Description    : Automatically jumps when you reach the edge of a block.   (client's own text)
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
 *  net.minecraft.client.network.ClientPlayerEntity
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.util.math.BlockPos
 *  net.minecraft.util.math.Box
 */
package orchard.module.movement;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IlIIIlIl;
import orchard.internal.lIIIIllI;
import orchard.internal.lIIllllI;

@Environment(value=EnvType.CLIENT)
public final class Parkour
extends ModuleBase {
    private static final int I = 2;
    private boolean l;
    private int II;
    private static String[] Il;
    private static final int[] lI;
    private static final String[] ll;
    private static final Object[] III;

    private static void I() {
        Parkour.Il[0] = Parkour.IIl(Parkour.IllI(-61341328, '\u6ca0', 34773).toCharArray(), 55335L, 1738603736);
        Parkour.Il[1] = Parkour.IIl(Parkour.IllI(1752393809, '\ube1f', 34772).toCharArray(), 87585L, 502754240);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lI(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity) {
        if (!clientPlayerEntity.isOnGround()) {
            return false;
        }
        BlockPos blockPos = BlockPos.ofFloored((double)clientPlayerEntity.getX(), (double)(clientPlayerEntity.getY() - 0.5), (double)clientPlayerEntity.getZ());
        if (minecraftClient.world.getBlockState(blockPos).isAir()) {
            return true;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        if (minecraftClient.options.forwardKey.isPressed()) {
            f += 1.0f;
        }
        if (minecraftClient.options.backKey.isPressed()) {
            f -= 1.0f;
        }
        if (minecraftClient.options.leftKey.isPressed()) {
            f2 += 1.0f;
        }
        if (minecraftClient.options.rightKey.isPressed()) {
            f2 -= 1.0f;
        }
        if (f == 0.0f && f2 == 0.0f) {
            return false;
        }
        double d = Math.sqrt(f * f + f2 * f2);
        float f3 = (float)Math.toRadians(clientPlayerEntity.getYaw());
        double d2 = Math.sin(f3);
        double d3 = Math.cos(f3);
        double d4 = -d2 * (double)(f /= (float)d) - d3 * (double)(f2 /= (float)d);
        double d5 = d3 * (double)f - d2 * (double)f2;
        Object object = new double[]{0.05, 0.15, 0.25, 0.35};
        int n = ((double[])object).length;
        int n2 = 0;
        while (true) {
            if (n2 >= n) {
                object = IlIIIlIl.IlI(minecraftClient, clientPlayerEntity);
                if (!((lIIIIllI)object).Il()) return false;
                if (((lIIIIllI)object).I()) return true;
                return false;
            }
            double d6 = object[n2];
            double d7 = clientPlayerEntity.getX() + d4 * d6;
            double d8 = clientPlayerEntity.getZ() + d5 * d6;
            BlockPos blockPos2 = BlockPos.ofFloored((double)d7, (double)(clientPlayerEntity.getY() - 0.5), (double)d8);
            if (minecraftClient.world.getBlockState(blockPos2).isAir()) {
                return true;
            }
            Box box = clientPlayerEntity.getBoundingBox().offset(d4 * d6, -0.5, d5 * d6);
            if (!minecraftClient.world.getBlockCollisions((Entity)clientPlayerEntity, box).iterator().hasNext()) {
                return true;
            }
            ++n2;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 26156;
        String string = "\u0397\ub401\u9a4c\ub66c\u9922\u3375\u23e4\u678c\u5ebd\u58c4\ud605\uc946\u159f\ub814\ub4d8\u0ed6\u715f\ua561\uc207\ud974\u652a\u414b\ue187\ud87e\uc0e9\u0f8f\u787c\ua29b\u73a8\u294f\ua8e9\u67ca\u09b7\ucbae\udd73\u50a6\u2d30\ubbd6\ub6b0\udce8\uf152\ub94a\u4a6e\uc110\ub181\u15dd\ucd5f\ud922\uddbe\ubaf6\ud36b\u82f7\u73f0\u179e\u9f03\udb17\u2496\u0979\u6dd0\u0b62\u49e3\u2775\u7cba\ub632\ufe25\u7ec9\ua9e6\u5af1\u4fff\u26ff\u3708\uc97a\u57a9\u052f\u52a4\u58db\uf1e6\u37ed\u9494\u8e9e\ubd1f\u2821\ubf29\uf770\u18c8\u81f0\udfd1\u7b86";
        char[] cArray = "\u6620\u6660".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 != 0) {
                do {
                    n5 = cArray[n3] ^ n;
                    stringArray[n3] = string.substring(n4, n4 + n5);
                    n4 += n5;
                } while (++n3 < cArray.length);
            } else {
                ll = stringArray;
                III = new Object[stringArray.length];
                int n6 = 872330787;
                byte[] byArray = "\u0019\u00b6c\u0093\u001d\u0004\u00a4*r\u00e5\u00b6\"\u0007\u00dd\u00d3\u0019".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                lI = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    Parkour.lI[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                break;
            }
            n2 = 0;
        }
        Il = new String[2];
        Parkour.I();
    }

    private static String IIl(char[] cArray, long l2, int n) {
        int n2 = 0xA34B428B ^ n;
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

    public boolean IlI() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lII(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (minecraftClient == null) return false;
        if (minecraftClient.player == null) return false;
        if (minecraftClient.world == null) return false;
        if (minecraftClient.options == null) return false;
        if (minecraftClient.currentScreen != null) {
            return false;
        }
        ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
        if (!clientPlayerEntity.isAlive()) return false;
        if (clientPlayerEntity.getAbilities().flying) return false;
        if (clientPlayerEntity.isSneaking()) return false;
        if (clientPlayerEntity.isUsingItem()) return false;
        if (clientPlayerEntity.isClimbing()) return false;
        if (clientPlayerEntity.isTouchingWater()) return false;
        if (clientPlayerEntity.isSubmergedInWater()) return false;
        if (lIIllllI.IlllII((LivingEntity)clientPlayerEntity)) return false;
        if (!minecraftClient.options.forwardKey.isPressed()) return false;
        if (minecraftClient.options.backKey.isPressed()) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean lIl(MinecraftClient minecraftClient) {
        if (this.IIIlIIl() && minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null && minecraftClient.currentScreen == null) {
            ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
            if (!this.llI(minecraftClient, clientPlayerEntity)) {
                this.IIlI();
                return false;
            }
            if (this.lI(minecraftClient, clientPlayerEntity)) {
                this.l = true;
                this.II = 2;
                return true;
            }
        } else {
            this.IIlI();
            return false;
        }
        if (this.l && this.II > 0) {
            --this.II;
            return true;
        }
        this.IIlI();
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llI(MinecraftClient minecraftClient, ClientPlayerEntity clientPlayerEntity) {
        if (!clientPlayerEntity.isAlive()) return false;
        if (clientPlayerEntity.getAbilities().flying) return false;
        if (clientPlayerEntity.isSneaking()) return false;
        if (minecraftClient.options.jumpKey.isPressed()) return false;
        if (clientPlayerEntity.isClimbing()) return false;
        if (clientPlayerEntity.isTouchingWater()) return false;
        if (clientPlayerEntity.isSubmergedInWater()) return false;
        if (lIIllllI.IlllII((LivingEntity)clientPlayerEntity)) return false;
        if (!this.IIII(minecraftClient)) return false;
        return true;
    }

    public Parkour() {
        super(StringFactory.IIII("Parkour"), Category.ll, StringFactory.IIII("Automatically jumps when you reach the edge of a block."));
    }

    public float lll() {
        return 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIII(MinecraftClient minecraftClient) {
        if (minecraftClient.options.forwardKey.isPressed()) return true;
        if (minecraftClient.options.backKey.isPressed()) return true;
        if (minecraftClient.options.rightKey.isPressed()) return true;
        if (minecraftClient.options.leftKey.isPressed()) return true;
        return false;
    }

    @Override
    public void llll() {
        this.IIlI();
    }

    private void IIlI() {
        this.l = false;
        this.II = 0;
    }

    private static int IlII(int n, int n2) {
        return lI[n ^ 0x58F56F07] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IllI(int n, char c, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n2 ^ 0x87D5;
        char[] cArray = ll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])III[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Parkour.III[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x72C9;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 33939;
            n7 ^= 0x675E;
            n7 += 62190;
            n7 -= 8031;
            n7 += 12100;
            n7 ^= 0x188B;
            n7 += 31167;
            n7 -= 47531;
            cArray[n6] = (char)((n7 += 30869) ^ n4 ^ c ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

