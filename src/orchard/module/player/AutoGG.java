/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIllllII
 * Module         : AutoGG  [PLAYER]
 * Description    : Automatically sends a message in chat when you kill someone.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Maybe this client would have saved you <3
 *   - .getBytes(
 *   - Message
 *   - Delay
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
 */
package orchard.module.player;

import java.util.List;
import java.util.Random;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IlIlIlIII;
import orchard.internal.Illllll;
import orchard.internal.lIlIIlI;
import orchard.internal.lIllIlIl;
import orchard.internal.llllllI;

@Environment(value=EnvType.CLIENT)
public final class AutoGG
extends ModuleBase {
    private static String[] I;
    private long l = 0L;
    private LivingEntity II;
    private int Il;
    private final IIIIIIIIl<llllllI> lI;
    private final Random ll;
    private final IlIlIlIII III;
    private int IIl = 0;
    private String IlI = null;
    private int Ill;
    private final lIlIIlI lII;
    private final Illllll lIl = this.IIlllIl(new Illllll((Object)StringFactory.IIII("Message"), lIllIlIl.IIIll("Maybe this client would have saved you <3", ";"), ";"));
    private long llI = 0L;
    private static final long lll = 10000L;
    private static final int[] IIII;
    private static final String[] IIIl;
    private static final Object[] IIlI;

    public AutoGG(IlIlIlIII ilIlIlIII) {
        super(StringFactory.IIII("AutoGG"), Category.IIl, StringFactory.IIII("Automatically sends a message in chat when you kill someone."));
        this.lII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Delay"), 500.0, 0.0, 5000.0, 50.0).IIIl("ms"));
        this.lI = this.IIlllIl(new IIIIIIIIl<llllllI>(StringFactory.IIII("Mode"), llllllI.class, llllllI.I));
        this.ll = new Random();
        this.Ill = Integer.MIN_VALUE;
        this.Il = Integer.MIN_VALUE;
        this.III = ilIlIlIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lI(LivingEntity livingEntity) {
        String string;
        List list;
        long l2 = System.currentTimeMillis();
        int n = livingEntity == null ? Integer.MIN_VALUE : livingEntity.getId();
        if (n != Integer.MIN_VALUE) {
            if (this.IlI != null && this.Ill == n) {
                return;
            }
            if (this.Il == n && l2 - this.llI < 10000L) {
                return;
            }
        }
        if ((list = (List)this.lIl.lIl()).isEmpty()) {
            return;
        }
        if (this.lI.lIl() == llllllI.I) {
            string = (String)list.get(this.ll.nextInt(list.size()));
        } else {
            if (this.IIl >= list.size()) {
                this.IIl = 0;
            }
            string = (String)list.get(this.IIl);
            this.IIl = (this.IIl + 1) % list.size();
        }
        if (string == null) return;
        if (string.isBlank()) return;
        this.IlI = string.trim();
        this.l = l2 + (long)((Double)this.lII.lIl()).doubleValue();
        this.Ill = n;
        this.Il = n;
        this.llI = l2;
    }

    @Override
    public void llll() {
        this.II = null;
        this.IlI = null;
        this.l = 0L;
        this.Ill = Integer.MIN_VALUE;
        this.Il = Integer.MIN_VALUE;
        this.llI = 0L;
    }

    private static void IIl() {
        AutoGG.I[0] = AutoGG.IlI(AutoGG.lll('\u1061', -1014273918, '\u2631').toCharArray(), 16570L, -790353596);
        AutoGG.I[1] = AutoGG.IlI(AutoGG.lll('\ud1ae', 1148454296, '\u2630').toCharArray(), 50977L, 1924772236);
        AutoGG.I[2] = AutoGG.IlI(AutoGG.lll('\u1ec2', 447355078, '\u2633').toCharArray(), 91546L, 1308096747);
        AutoGG.I[3] = AutoGG.IlI(AutoGG.lll('\u3325', -2004066891, '\u2632').toCharArray(), 63480L, 594509098);
        AutoGG.I[4] = AutoGG.IlI(AutoGG.lll('\uad7c', -1333773551, '\u2635').toCharArray(), 71680L, 313909155);
        AutoGG.I[5] = AutoGG.IlI(AutoGG.lll('\u6bd4', 1423469613, '\u2634').toCharArray(), 1145L, -1595751641);
        AutoGG.I[6] = AutoGG.IlI(AutoGG.lll('\u5234', -1987228784, '\u2637').toCharArray(), 65068L, 59093846);
        AutoGG.I[7] = AutoGG.IlI(AutoGG.lll('\u2582', 565473030, '\u2636').toCharArray(), 39333L, -1905988470);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 7137;
        String string = "\u8724\u391b\u9560\uf553\udcea\ufe9d\u25bd\u82a7\ua128\u0098\u85a5\ufaf1\u1bff\u0774\u22c5\u93e3\ude68\ub172\u3b19\ub526\ud0eb\u87c0\u4ce0\u5326\u04c4\ufd77\u8dcb\u3553\u0fd1\u891b\u063a\u207b\ub761\uf815\u43d8\u9e02\uf6f9\u8d8e\u5bf3\ued73\u3545\u3ae9\u4b00\u3d44\udd34\u87df\u41d4\u83c7\uee77\ua9f3\ub66b\ud964\u6a03\uc258\u126c\ud188\u9549\u7850\u98c8\u9fc9\u687a\ua276\u0448\u50bf\u823b\u8eba\u7a36\uc596\u0d78\u8850\u204f\u79ef\u4300\uc7eb\u9703\ub77b\u4249\ue124\u187b\ud7e7\ud623\u2948\u13be\ue6f0\u0f0f\u5421\u878f\ufd3d\uf8a5\u0970\u6536\u694f\u2272\u7795\ufbc4\u25d3\u9366\ub2d3\ude17\u1e35\uc73a\u1381\ueeef\u58d6\u36a1\u4c20\u4f9d\u63da\ubaba\ua72e\u0f68\u5eb7\u92fd\u29c0\u76a8\u6fce\u6e6a\ue3e6\ub339\u7c1e\ud5c1\uebc8\u9388\u4898\u14ff\u898c\u621d\ucba3\u6a2d\u73f4\ua447\u8baa\ub305\u9b4f\u3f5d\ud855\u6d90\u0473\ue673\uc29f\ue52f\u34da\u8e75\u04ee\uf5b2\u19bc\ub56d\u418e\u450a\u1c39\uf4f0\u6c09\u3f0f\u3ee8\ua444\u3ead\u5e1d\ua437\u83e1\u963d\u81de\u69a5\u4b5e\u891e\u3b6f\u68b0\u9d59\uf39e\u97a5\u023e\u04e6\u8d94\u8ea1\ub6a6\u454f\ub2cf\u7497\u686d\ub454\u4e13";
        char[] cArray = "\u1be5\u1bb1\u1be9\u1bd9\u1be5\u1be9\u1be9\u1bed".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                IIIl = stringArray;
                IIlI = new Object[stringArray.length];
                int n6 = 1129321610;
                byte[] byArray = "{\u009c\u0084\u00fa\u001f~\u00c9Q\"6F=Q\u00ec\u0006\u00f8EM\u00ce\u00ca\u00f5\u0001\u0016\u00dd\u008cN\u0096\u0088\u00de\u009a\u0013\u00dd\u008d\u00c0\u00de;\u00ed \u00fe,}\u00d9\u00cc\u00e3\u00b4\u001f9\u00b3\b\u0019\u001bf~\u0098\u0080\u0080\u00fb\u0080gb?\u00bc\u00dc\u00ba\u00ac\u0093\u00d7XB\u0093\u00cc\u0018\u00dd\t|]\u0093XqA\u00a3\u00a6\u00dex\u0095\u00f8@P".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                IIII = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    AutoGG.IIII[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                I = new String[8];
                AutoGG.IIl();
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

    /*
     * Enabled aggressive block sorting
     */
    private static String IlI(char[] cArray, long l2, int n) {
        int n2 = 0x356CE9DC ^ n;
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

    private void lII(MinecraftClient minecraftClient, String string) {
        try {
            minecraftClient.getNetworkHandler().sendChatMessage(string);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        LivingEntity livingEntity;
        if (!this.IIIlIIl()) {
            return;
        }
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player == null) return;
        if (minecraftClient.getNetworkHandler() == null) {
            return;
        }
        long l2 = System.currentTimeMillis();
        if (this.IlI != null && l2 >= this.l) {
            this.lII(minecraftClient, this.IlI);
            this.IlI = null;
            this.l = 0L;
            this.Ill = Integer.MIN_VALUE;
        }
        if ((livingEntity = this.III.lIl()) != null) {
            this.II = livingEntity;
            return;
        }
        if (this.II == null) return;
        if ((!this.II.isAlive() || this.II.isRemoved()) && minecraftClient.player.distanceTo((Entity)this.II) < 20.0f) {
            this.lI(this.II);
        }
        this.II = null;
    }

    private static int lIl(int n, int n2) {
        return IIII[n ^ 0xA9B2647C] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lll(char c, int n, char c2) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c2 ^ 0x2631;
        char[] cArray = IIIl[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIlI[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            AutoGG.IIlI[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x4060;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] - 24656;
            n6 += 17269;
            n6 += 36318;
            n6 ^= 0xD71E;
            n6 += 38615;
            n6 += 44530;
            n6 ^= 0xFD9C;
            n6 ^= 0x8382;
            cArray[n5] = (char)((n6 += 62085) ^ n3 ^ c ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

