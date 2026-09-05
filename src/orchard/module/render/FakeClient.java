/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIllII
 * Module         : Fake Client  [RENDER]
 * Description    : Spoofs client brand and channels for Fabric, Feather, or Lunar.   (client's own text)
 *
 * Recovered strings in this class:
 *   - [Lunar] 
 *   - .getBytes(
 *   - Client
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.entity.player.PlayerEntity
 */
package orchard.module.render;

import com.mojang.authlib.GameProfile;
import java.util.UUID;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.entity.player.PlayerEntity;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIllIII;
import orchard.internal.IIIIlllIl;
import orchard.internal.IIlllIIII;
import orchard.internal.IlIlIlllI;

@Environment(value=EnvType.CLIENT)
public final class FakeClient
extends ModuleBase {
    private final IIIIIIIIl<IIIIlllIl> I = this.IIlllIl(new IIIIIIIIl<IIIIlllIl>(StringFactory.IIII("Client"), IIIIlllIl.class, IIIIlllIl.l));
    private static String[] l;
    private static final int[] II;
    private static final String[] Il;
    private static final Object[] lI;

    public boolean I() {
        return false;
    }

    public IIIIlllIl l() {
        return (IIIIlllIl)((Object)this.I.lIl());
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        IIIIllIII.Illl(this.IIIlIIl() ? this : null);
    }

    @Override
    public String II() {
        return ((IIIIlllIl)((Object)this.I.lIl())).II();
    }

    public boolean lI(UUID uUID) {
        return IIIIllIII.lI(uUID);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IIl(GameProfile gameProfile) {
        if (gameProfile == null) return false;
        if (!this.lI(IlIlIlllI.III(gameProfile))) return false;
        return true;
    }

    public String IlI() {
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean lII(PlayerEntity playerEntity) {
        if (playerEntity == null) return false;
        if (!this.lI(playerEntity.getUuid())) return false;
        return true;
    }

    public FakeClient() {
        super(StringFactory.IIII("Fake Client"), Category.l, StringFactory.IIII("Spoofs client brand and channels for Fabric, Feather, or Lunar."));
    }

    @Override
    public void llll() {
        IIIIllIII.Illl(null);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIl(char[] cArray, long l2, int n) {
        int n2 = 0x439AE406 ^ n;
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

    private static void llI() {
        FakeClient.l[0] = FakeClient.lIl(FakeClient.IlII(-1982000044, -1322957591).toCharArray(), 54532L, 1722656614);
        FakeClient.l[1] = FakeClient.lIl(FakeClient.IlII(-1982000043, 54360684).toCharArray(), 43413L, 604691400);
        FakeClient.l[2] = FakeClient.lIl(FakeClient.IlII(-1982000042, -1056767099).toCharArray(), 47005L, 1649688708);
        FakeClient.l[3] = FakeClient.lIl("".toCharArray(), 12201L, 109721569);
        FakeClient.l[4] = FakeClient.lIl(FakeClient.IlII(-1982000041, 1030753377).toCharArray(), 60108L, -1199974356);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 24590;
        var7_2 = "\ue35c\uf2b3\ub08f\u3ca7\uc8fb\u970d\u02fd\ua3cd\ua3ca\u77ce\u47a9\u573f\u36fb\u8554\u793f\ufb01\u8689\ucb9c\uf3da\u45c9\u29d5\u06df\uf49f\u6eec\uae02\ua851\u12cb\ubfa4\ucd63\u2802\u70d7\ub7d6\u9774\uc590\u037d\ud77f\ub050\u6124\uedf6\u6c08\u08b0\ub1b5\u58ed\u379e\ud02d\u4e0f\u3f4c\u51ca\u8b7c\u6034\ucedb\u3d6a\u6213\u3532\u6520\u5690\ue3cf\u1af1\uf820\u4e26\uacb1\ub526\ub55c\ufbb9\udda2\u8b44\ub06c\u2954\ub396\u61da\u2664\u5dc9\ueb04\uc627\u5316\u42b0\ua129\u2f94\ue6e3\uf3e2\u9b3f\u5d03\u309e\u5a67\u1ad1\ud8e3\u7807\ufbef\u12a6\u2a09\u19c9\u93f8\u1b6f\uafa0\uf178\u69c2\ud493\u7e49\u6974\uce5c\uf33c\u5974\u5e27\udd2b\ua450\uff01\uc106\ud172\uc1c1\ue279\u150c\u091a\u430d\uf9e2\ua059\u51cb\u21a8\u140b\u41d4\ua441";
        var8_3 = "T\u0010\b\f".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl12
        while (true) {
            block11: {
                block10: {
                    var9_4[var10_5] = new String(var14_9).intern();
                    var11_6 += var12_7;
                    if (++var10_5 < var8_3.length) break block10;
                    var13_8 = 0;
lbl12:
                    // 2 sources

                    var10_5 = 0;
                    var11_6 = 0;
                    var12_7 = '\u0000';
                    if (var13_8 == 0) break block11;
                }
                var12_7 = var8_3[var10_5];
                var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
                var15_10 = 0;
                if (true) ** GOTO lbl43
            }
            FakeClient.Il = var9_4;
            FakeClient.lI = new Object[var9_4.length];
            var2_13 = 781769257;
            var0_11 = "\u00e2y\u008f\u00b1\t;g\u00ads\u0013b-\u0097\u00ea@C\u00f1\u00e3p\u00b3\u00d6\u00a19\u00e0\u0089\u00eb\u00ab\b".getBytes("ISO-8859-1");
            var1_12 = var0_11.length / 4;
            FakeClient.II = new int[var1_12];
            var3_14 = 0;
            var4_15 = 0;
            do {
                var5_16 = (var0_11[var3_14] & 255) << 24 | (var0_11[var3_14 + 1] & 255) << 16 | (var0_11[var3_14 + 2] & 255) << 8 | var0_11[var3_14 + 3] & 255;
                FakeClient.II[var4_15] = var5_16 ^= var2_13;
                var3_14 += 4;
            } while (++var4_15 < var1_12);
            FakeClient.l = new String[5];
            FakeClient.llI();
            return;
        }
        block8: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
            if (var15_10 >= var14_9.length) ** continue;
lbl43:
            // 2 sources

            switch (var15_10 % 5) {
                case 4: {
                    v0 = 32;
                    continue block8;
                }
                case 2: {
                    v0 = 111;
                    continue block8;
                }
                case 1: {
                    v0 = 118;
                    continue block8;
                }
                case 3: {
                    v0 = 124;
                    continue block8;
                }
            }
            v0 = 3;
        }
    }

    @Override
    public void ll() {
        IIIIllIII.Illl(this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public String lll() {
        switch (((IIIIlllIl)((Object)this.I.lIl())).ordinal()) {
            case 0: {
                return "";
            }
            case 2: {
                return "[Lunar] ";
            }
            default: {
                throw new MatchException(null, null);
            }
            case 1: 
        }
        return "";
    }

    public IIlllIIII IIII() {
        return null;
    }

    private static int IIlI(int n, int n2) {
        return II[n ^ 0xD8E07E8A] ^ n2 ^ n;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static String IlII(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x89DD1454;
        char[] cArray = Il[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])lI[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            FakeClient.lI[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x98EF0CC2;
        int n5 = 0;
        boolean bl = true;
        block33: while (true) {
            int n6;
            if (!bl || (bl = false) || !true) {
                cArray[n5] = cArray[n5] ^ n6 ^ n2 >> 16 ^ n4;
                if (++n5 >= cArray.length) {
                    return new String(cArray).intern();
                }
            }
            switch (n5 & 0x1F) {
                case 25: {
                    n6 = 208;
                    continue block33;
                }
                case 9: {
                    n6 = 240;
                    continue block33;
                }
                case 31: {
                    n6 = 41;
                    continue block33;
                }
                case 21: {
                    n6 = 33;
                    continue block33;
                }
                case 13: {
                    n6 = 232;
                    continue block33;
                }
                case 6: {
                    n6 = 209;
                    continue block33;
                }
                case 5: {
                    n6 = 228;
                    continue block33;
                }
                case 20: {
                    n6 = 190;
                    continue block33;
                }
                case 18: {
                    n6 = 209;
                    continue block33;
                }
                case 11: {
                    n6 = 181;
                    continue block33;
                }
                case 12: {
                    n6 = 127;
                    continue block33;
                }
                case 27: {
                    n6 = 156;
                    continue block33;
                }
                case 19: {
                    n6 = 12;
                    continue block33;
                }
                case 4: {
                    n6 = 226;
                    continue block33;
                }
                case 10: {
                    n6 = 234;
                    continue block33;
                }
                case 26: {
                    n6 = 1;
                    continue block33;
                }
                case 23: {
                    n6 = 83;
                    continue block33;
                }
                case 7: {
                    n6 = 173;
                    continue block33;
                }
                case 14: {
                    n6 = 132;
                    continue block33;
                }
                case 8: {
                    n6 = 74;
                    continue block33;
                }
                case 22: {
                    n6 = 222;
                    continue block33;
                }
                case 29: {
                    n6 = 252;
                    continue block33;
                }
                case 2: {
                    n6 = 17;
                    continue block33;
                }
                case 24: {
                    n6 = 94;
                    continue block33;
                }
                case 17: {
                    n6 = 76;
                    continue block33;
                }
                case 1: {
                    n6 = 225;
                    continue block33;
                }
                case 15: {
                    n6 = 96;
                    continue block33;
                }
                case 30: {
                    n6 = 141;
                    continue block33;
                }
                default: {
                    n6 = 41;
                    continue block33;
                }
                case 28: {
                    n6 = 2;
                    continue block33;
                }
                case 3: {
                    n6 = 159;
                    continue block33;
                }
                case 16: 
            }
            n6 = 22;
        }
    }
}

