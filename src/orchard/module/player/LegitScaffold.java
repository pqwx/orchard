/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIlIIl
 * Module         : Legit Scaffold  [PLAYER]
 * Description    : Sneaks at the edges of blocks   (client's own text)
 *
 * Recovered strings in this class:
 *   - Only When Moving Backwards
 *   - Only When Holding Blocks
 *   - Sneak Speed Multiplier
 *   - Only on Ground
 *   - .getBytes(
 *   - Length
 *   - ticks
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
 *  net.minecraft.item.BlockItem
 *  net.minecraft.util.math.BlockPos
 */
package orchard.module.player;

import java.util.concurrent.ThreadLocalRandom;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.util.math.BlockPos;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlIlIIl;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class LegitScaffold
extends ModuleBase {
    private boolean I;
    private final lIlIIlI l;
    private int II;
    private final IIIlIlIIl Il = this.IIlllIl(new IIIlIlIIl(StringFactory.IIII("Length"), 1.0, 1.0, 1.0, 4.0, 1.0).lII("ticks"));
    private final llIll lI;
    private boolean ll;
    private final llIll III;
    private final llIll IIl;
    private static String[] IlI;
    private int Ill;
    private static final int[] lII;
    private static final String[] lIl;
    private static final Object[] llI;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean I(MinecraftClient minecraftClient) {
        if (!this.IIIlIIl()) return false;
        if (!this.I) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 15297;
        String string = "\udd2f\u5d3a\u4aa8\u8713\uc2a5\u195f\u37e6\u8e94\u0f27\u27a5\u9176\u7035\ua408\u27be\udea4\u8b37\u5ea5\u7937\u92fc\ub58f\u2e03\uafd9\u4c27\u5b37\u16f5\u3ae0\u3fb3\u1152\uc6d3\u7357\ua649\udb24\u2737\ua4d0\ue74d\ud7e2\uacfa\u3f79\u174b\u70b4\u5e95\udfb5\u72c7\u3f43\u1121\uca02\u88c3\u2aed\ub6ce\ubc8a\uf7c2\uacc8\u6551\ufd92\ue189\u1ebd\ube82\uc7ac\ua9dd\u31d7\uac8b\u628a\ud306\uafa0\u749f\u5772\u71d7\u49dd\ue4bf\ue14c\uf28a\u05e5\uf49a\uc964\u4274\uc163\ucad9\uce50\u1300\u730c\ua946\u5a09\u1126\ue0c9\u81eb\u21db\uc98d\u47d9\ua014\u48c6\u38d1\u959f\ud690\u641c\ueda4\ud482\u772b\ubbc8\u88f1\u093f\ua355\u076d\u05ff\u0d24\uc29c\uec74\u1cf6\u00b1\ua11b\u576e\ua39c\uf02b\u11b1\ua180\ub3ea\u946c\u8a17\u526b\ufd9d\u726b\ub2b8\u8182\ua973\u0ecb\u10cf\ud31d\u8b11\ua294\ud848\uf585\u681e\ufa48\ua3bb\u1e08\u09a1\u49ea\uda13\u1100\udeca\u5cdd\ua746\u1cb7\uea7c\u7e9e\u8154\ue411\u318e\u2378\u5459\uf93a\u905a\u1112\u2fd6\ubd31\ue006\u5c11\uc72f\u0344\u84cc\u6284\uedd0\u3d81\ud8e9\ua9f5\u4ec2\ucff4\uefa9\u28e7\u4a00\ucde4\u8afb\u506d\uef7b\ua57d\ufdf7\ud877\uc45e\u9cfa\u3e5b\u3c36\udb38\ubc23\u51eb\uf0be\u169c\u2841\u2b4e\u62a8\u04f5\u5b19\u39a8\uc8aa\ue533\ub7db\u6b3c\uc46e";
        char[] cArray = "\u3be9\u3be5\u3bc9\u3be1\u3bd5\u3bc9\u3be1\u3bd5".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                lIl = stringArray;
                llI = new Object[stringArray.length];
                int n6 = -2081292969;
                byte[] byArray = "\u00a0\u00bb\u00d9xqa\u00b2\u00e4Y\u0084]\u00b5\u00f4\u008b\u00a5\u0086HJy,\u00ab\u00cd9F\u00c2\u0001&u\u00ee\u0019\u00fb\u009aq\u00bad\u00caIC\u0090\u00c2\u0090J\u00bd\u008cIl<a\u0087\u0013\u000b\u00e6a\u0000\u00d0\"d\u00b0\u00bf\u00d1".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                lII = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    LegitScaffold.lII[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                IlI = new String[8];
                LegitScaffold.IIl();
                return;
            }
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
            n2 = 0;
        }
    }

    private int l() {
        int n = Math.max(1, (int)Math.round(this.Il.IIIl()));
        int n2 = Math.max(n, (int)Math.round(this.Il.IIII()));
        return ThreadLocalRandom.current().nextInt(n, n2 + 1);
    }

    public LegitScaffold() {
        super(StringFactory.IIII("Legit Scaffold"), Category.IIl, StringFactory.IIII("Sneaks at the edges of blocks"));
        this.l = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Sneak Speed Multiplier"), 0.3, 0.2, 1.0, 0.05));
        this.IIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Only on Ground"), false));
        this.III = this.IIlllIl(new llIll((Object)StringFactory.IIII("Only When Holding Blocks"), false));
        this.lI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Only When Moving Backwards"), false));
    }

    private static String II(char[] cArray, long l2, int n) {
        int n2 = 0xF5D5E99F ^ n;
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

    private void lI() {
        this.I = false;
        this.Ill = 0;
        this.II = 0;
        this.ll = false;
    }

    private static void IIl() {
        LegitScaffold.IlI[0] = LegitScaffold.II(LegitScaffold.IIII('\uad57', 1399331187, 465).toCharArray(), 19558L, -824126326);
        LegitScaffold.IlI[1] = LegitScaffold.II(LegitScaffold.IIII('\uad56', 636449141, 65181).toCharArray(), 18068L, 1904003783);
        LegitScaffold.IlI[2] = LegitScaffold.II(LegitScaffold.IIII('\uad55', 441342114, 41066).toCharArray(), 57146L, 1601566052);
        LegitScaffold.IlI[3] = LegitScaffold.II(LegitScaffold.IIII('\uad54', -775408677, 40684).toCharArray(), 67864L, 1988839715);
        LegitScaffold.IlI[4] = LegitScaffold.II(LegitScaffold.IIII('\uad53', 699401329, 40095).toCharArray(), 56023L, -1058573033);
        LegitScaffold.IlI[5] = LegitScaffold.II(LegitScaffold.IIII('\uad52', 873094250, 5830).toCharArray(), 17931L, -1628321848);
        LegitScaffold.IlI[6] = LegitScaffold.II(LegitScaffold.IIII('\uad51', -24679794, 7185).toCharArray(), 64583L, -1423695852);
        LegitScaffold.IlI[7] = LegitScaffold.II(LegitScaffold.IIII('\uad50', 951717607, 27057).toCharArray(), 2143L, -1928456574);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IlI(MinecraftClient minecraftClient) {
        this.ll = false;
        if (this.IIIlIIl() && minecraftClient != null && minecraftClient.player != null && minecraftClient.world != null && minecraftClient.options != null && minecraftClient.player.isAlive()) {
            ClientPlayerEntity clientPlayerEntity = minecraftClient.player;
            if (((Boolean)this.III.lIl()).booleanValue() && !this.lII(clientPlayerEntity)) {
                this.I = false;
                this.Ill = 0;
                return false;
            }
            BlockPos blockPos = BlockPos.ofFloored((double)clientPlayerEntity.getX(), (double)(clientPlayerEntity.getY() - 1.0), (double)clientPlayerEntity.getZ());
            boolean bl = (Boolean)this.IIl.lIl() != false && !clientPlayerEntity.isOnGround();
            boolean bl2 = (Boolean)this.lI.lIl() != false && minecraftClient.options.forwardKey.isPressed();
            boolean bl3 = this.I = !bl && !bl2 && minecraftClient.world.getBlockState(blockPos).isAir();
            if (this.I) {
                this.II = this.l();
                ++this.Ill;
            } else {
                this.Ill = 0;
            }
            boolean bl4 = this.II > 0;
            --this.II;
            this.ll = this.II > 0 && this.Ill <= 2;
            return bl4;
        }
        this.lI();
        return false;
    }

    private boolean lII(ClientPlayerEntity clientPlayerEntity) {
        return clientPlayerEntity.getMainHandStack().getItem() instanceof BlockItem || clientPlayerEntity.getOffHandStack().getItem() instanceof BlockItem;
    }

    public boolean lIl(MinecraftClient minecraftClient) {
        return false;
    }

    @Override
    public void llll() {
        this.lI();
    }

    public double llI(MinecraftClient minecraftClient) {
        return !this.IIIlIIl() || !this.ll ? 1.0 : (Double)this.l.lIl();
    }

    private static int lll(int n, int n2) {
        return lII[n ^ 0x1950F57B] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIII(char c, int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = c ^ 0xAD57;
        char[] cArray = lIl[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llI[n3];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            LegitScaffold.llI[n3] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x759C;
        int n5 = 0;
        do {
            int n6 = n5++;
            int n7 = cArray[n6] + 10150;
            n7 ^= 0x93F3;
            n7 -= 17544;
            n7 ^= 0xA7EE;
            n7 += 22592;
            cArray[n6] = (char)((n7 ^= 0xDFDF) ^ n4 ^ n2 ^ n >> 16);
        } while (n5 < cArray.length);
        return new String(cArray).intern();
    }
}

