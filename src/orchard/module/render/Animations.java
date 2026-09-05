/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIlIlI
 * Module         : Animations  [RENDER]
 * Description    : Custom first-person item animations.   (client's own text)
 *
 * Recovered strings in this class:
 *   - Offhand Swing Rotation X
 *   - Offhand Swing Rotation Y
 *   - Offhand Swing Rotation Z
 *   - Offhand Swing Strength
 *   - Offhand Holding Mode
 *   - Offhand Equip Smooth
 *   - Offhand Swing Mode
 *   - Offhand Spin Speed
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.minecraft.util.Arm
 *  net.minecraft.util.Hand
 */
package orchard.module.render;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIIIl;
import orchard.internal.IIlIlllI;
import orchard.internal.IIllIlll;
import orchard.internal.IlIIlIll;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;

@Environment(value=EnvType.CLIENT)
public final class Animations
extends ModuleBase {
    private final lIlIIlI I;
    private final IIIIIIIIl<IIlIlllI> l;
    private final IIIIIIIIl<IIlIlllI> II;
    private static String[] Il;
    private final lIlIIlI lI;
    private final IIIIIIIIl<IIIIIIl> ll;
    private final lIlIIlI III;
    private final lIlIIlI IIl;
    private final llIll IlI;
    private final lIlIIlI Ill;
    private final lIlIIlI lII;
    private final lIlIIlI lIl;
    private long llI;
    private final IIIIIIIIl<IlIIlIll> lll;
    private final lIlIIlI IIII;
    private final lIlIIlI IIIl;
    private final lIlIIlI IIlI;
    private final lIlIIlI IIll;
    private final lIlIIlI IlII;
    private final lIlIIlI IlIl;
    private final lIlIIlI IllI;
    private final lIlIIlI Illl;
    private final lIlIIlI lIII;
    private final lIlIIlI lIIl;
    private final llIll lIlI;
    private final lIlIIlI lIll;
    private final llIll llII;
    private final lIlIIlI llIl;
    private final lIlIIlI lllI;
    private final lIlIIlI llll;
    private final llIll IIIII;
    private final lIlIIlI IIIIl;
    private final lIlIIlI IIIlI;
    private final lIlIIlI IIIll;
    private final lIlIIlI IIlII;
    private final lIlIIlI IIlIl;
    private float IIllI;
    private final lIlIIlI IIlll;
    private final lIlIIlI IlIII;
    private float IlIIl;
    private final lIlIIlI IlIlI;
    private final IIIIIIIIl<IIIIIIl> IlIll = this.IIlllIl(new IIIIIIIIl<IIIIIIl>(StringFactory.IIII("Holding Mode"), IIIIIIl.class, IIIIIIl.l));
    private static final int[] IllII;
    private static final String[] IllIl;
    private static final Object[] IlllI;

    public boolean IIl() {
        return (Boolean)this.IIIII.lIl();
    }

    public float IlI(Hand hand, float f) {
        return this.IIII(hand).IIl(f);
    }

    public float lII(Hand hand, float f) {
        return this.IIII(hand).II(f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public float lIl(Hand hand) {
        float f;
        this.IlIIl();
        if (!this.IIl() || hand != Hand.OFF_HAND) {
            f = this.IlIIl;
            return f;
        }
        f = this.IIllI;
        return f;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lll(char[] cArray, long l2, int n) {
        int n2 = 0xAD04D9E5 ^ n;
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
    public IIllIlll IIII(Hand hand) {
        boolean bl = this.IIl() && hand == Hand.OFF_HAND;
        IIIIIIl iIIIIIl = bl ? (IIIIIIl)((Object)this.ll.lIl()) : (IIIIIIl)((Object)this.IlIll.lIl());
        IIlIlllI iIlIlllI = bl ? (IIlIlllI)((Object)this.l.lIl()) : (IIlIlllI)((Object)this.II.lIl());
        IlIIlIll ilIIlIll = iIlIlllI == IIlIlllI.IlI ? IlIIlIll.Il : (IlIIlIll)((Object)this.lll.lIl());
        return new IIllIlll(iIIIIIl, iIlIlllI, ilIIlIll, this.IIlI(bl, this.IllI, this.Ill), this.IIlI(bl, this.IIl, this.lI), this.IIlI(bl, this.IIlll, this.IlIlI), this.IIlI(bl, this.IIIIl, this.III), this.IIlI(bl, this.lIl, this.IIIl), this.IIlI(bl, this.Illl, this.lllI), this.IIlI(bl, this.lII, this.IlII), this.IIlI(bl, this.IIlI, this.IlIl), this.IIlI(bl, this.IIll, this.lIII), this.IIlI(bl, this.I, this.IIIlI), this.IIlI(bl, this.IlIII, this.IIII), this.IIlI(bl, this.IIlIl, this.llll), this.IIlI(bl, this.IIIll, this.llIl), this.IIlI(bl, this.lIIl, this.lIll));
    }

    /*
     * Enabled aggressive block sorting
     */
    private float IIlI(boolean bl, lIlIIlI lIlIIlI2, lIlIIlI lIlIIlI3) {
        lIlIIlI lIlIIlI4 = bl ? lIlIIlI3 : lIlIIlI2;
        return ((Double)lIlIIlI4.lIl()).floatValue();
    }

    private static void IlII() {
        Animations.Il[0] = Animations.lll(Animations.IlllI(346212514, 1367301760).toCharArray(), 18254L, 564322176);
        Animations.Il[1] = Animations.lll(Animations.IlllI(346212515, 409173406).toCharArray(), 35761L, 104807102);
        Animations.Il[2] = Animations.lll(Animations.IlllI(346212512, 22563242).toCharArray(), 62985L, -1749716038);
        Animations.Il[3] = Animations.lll(Animations.IlllI(346212513, -623294912).toCharArray(), 54977L, 1510112979);
        Animations.Il[4] = Animations.lll(Animations.IlllI(346212518, -463317843).toCharArray(), 69649L, -1104327223);
        Animations.Il[5] = Animations.lll(Animations.IlllI(346212519, -754500093).toCharArray(), 6772L, 2082949007);
        Animations.Il[6] = Animations.lll(Animations.IlllI(346212516, -1137567100).toCharArray(), 79155L, -539721877);
        Animations.Il[7] = Animations.lll(Animations.IlllI(346212517, -1535630598).toCharArray(), 1972L, -329330420);
        Animations.Il[8] = Animations.lll(Animations.IlllI(346212522, -1933828886).toCharArray(), 36324L, 1963783705);
        Animations.Il[9] = Animations.lll(Animations.IlllI(346212523, 1260671867).toCharArray(), 82815L, 529519568);
        Animations.Il[10] = Animations.lll(Animations.IlllI(346212520, -396099206).toCharArray(), 21246L, -2008116946);
        Animations.Il[11] = Animations.lll(Animations.IlllI(346212521, 2091350521).toCharArray(), 67397L, 1922603387);
        Animations.Il[12] = Animations.lll(Animations.IlllI(346212526, 375871254).toCharArray(), 44111L, 1430211070);
        Animations.Il[13] = Animations.lll(Animations.IlllI(346212527, -1178788309).toCharArray(), 94998L, -1123551491);
        Animations.Il[14] = Animations.lll(Animations.IlllI(346212524, -189179469).toCharArray(), 46994L, 1142909297);
        Animations.Il[15] = Animations.lll(Animations.IlllI(346212525, 1649482767).toCharArray(), 10189L, -1720105493);
        Animations.Il[16] = Animations.lll(Animations.IlllI(346212530, 583414586).toCharArray(), 99402L, 2018711693);
        Animations.Il[17] = Animations.lll(Animations.IlllI(346212531, -618581371).toCharArray(), 37801L, -299080852);
        Animations.Il[18] = Animations.lll(Animations.IlllI(346212528, 1974089458).toCharArray(), 33812L, -404562812);
        Animations.Il[19] = Animations.lll(Animations.IlllI(346212529, -1353639833).toCharArray(), 70658L, -1471558408);
        Animations.Il[20] = Animations.lll(Animations.IlllI(346212534, 344616919).toCharArray(), 21741L, -487078884);
        Animations.Il[21] = Animations.lll(Animations.IlllI(346212535, -995340851).toCharArray(), 7899L, -2083243999);
        Animations.Il[22] = Animations.lll(Animations.IlllI(346212532, -1740616891).toCharArray(), 61672L, 146613779);
        Animations.Il[23] = Animations.lll(Animations.IlllI(346212533, -979992854).toCharArray(), 16714L, -2141089038);
        Animations.Il[24] = Animations.lll(Animations.IlllI(346212538, -310739643).toCharArray(), 75298L, -285945735);
        Animations.Il[25] = Animations.lll(Animations.IlllI(346212539, 830734576).toCharArray(), 82974L, -803827049);
        Animations.Il[26] = Animations.lll(Animations.IlllI(346212536, -1997126681).toCharArray(), 89277L, -1398690857);
        Animations.Il[27] = Animations.lll(Animations.IlllI(346212537, 414403644).toCharArray(), 2178L, -1066464571);
        Animations.Il[28] = Animations.lll(Animations.IlllI(346212542, -1567220979).toCharArray(), 84785L, -1215364148);
        Animations.Il[29] = Animations.lll(Animations.IlllI(346212543, -1602275270).toCharArray(), 5075L, -1487243688);
        Animations.Il[30] = Animations.lll(Animations.IlllI(346212540, 309274342).toCharArray(), 13024L, -110271408);
        Animations.Il[31] = Animations.lll(Animations.IlllI(346212541, 30243118).toCharArray(), 8712L, 810210952);
        Animations.Il[32] = Animations.lll(Animations.IlllI(346212482, 1328166725).toCharArray(), 13994L, 822344622);
        Animations.Il[33] = Animations.lll(Animations.IlllI(346212483, 818286736).toCharArray(), 19311L, -1007057342);
        Animations.Il[34] = Animations.lll(Animations.IlllI(346212480, 716782477).toCharArray(), 66364L, 1228425630);
        Animations.Il[35] = Animations.lll(Animations.IlllI(346212481, 861929826).toCharArray(), 90L, 703367888);
        Animations.Il[36] = Animations.lll(Animations.IlllI(346212486, -1002503188).toCharArray(), 55529L, 1021302211);
        Animations.Il[37] = Animations.lll(Animations.IlllI(346212487, 1692272266).toCharArray(), 9614L, 892074097);
        Animations.Il[38] = Animations.lll(Animations.IlllI(346212484, -1238747601).toCharArray(), 14424L, 101312008);
        Animations.Il[39] = Animations.lll(Animations.IlllI(346212485, -357752500).toCharArray(), 3347L, -2066301939);
        Animations.Il[40] = Animations.lll(Animations.IlllI(346212490, 1120824924).toCharArray(), 29014L, -971295801);
        Animations.Il[41] = Animations.lll(Animations.IlllI(346212491, 924998742).toCharArray(), 32314L, -78378837);
        Animations.Il[42] = Animations.lll(Animations.IlllI(346212488, 1983139837).toCharArray(), 54986L, -1396906215);
        Animations.Il[43] = Animations.lll(Animations.IlllI(346212489, 1383690421).toCharArray(), 53335L, -1771806269);
        Animations.Il[44] = Animations.lll(Animations.IlllI(346212494, -1430620433).toCharArray(), 18585L, 324027250);
        Animations.Il[45] = Animations.lll(Animations.IlllI(346212495, -541056142).toCharArray(), 79649L, -1742413624);
        Animations.Il[46] = Animations.lll(Animations.IlllI(346212492, -1127870448).toCharArray(), 84104L, -1930691903);
    }

    @Override
    public void IIllIl(JsonObject jsonObject) {
        super.IIllIl(jsonObject);
        this.IlIII(jsonObject);
    }

    public boolean lIII() {
        return this.IIIlIIl();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean lIlI() {
        if (!this.IIIlIIl()) return false;
        if (!(Math.abs((Double)this.IIlII.lIl() - 1.0) > 1.0E-4)) return false;
        return true;
    }

    @Override
    public void llll() {
        this.llI = 0L;
        this.IlIIl = 0.0f;
        this.IIllI = 0.0f;
    }

    public int lIll(int n) {
        return Math.max(1, (int)Math.round((double)Math.max(1, n) / (Double)this.IIlII.lIl()));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean llII(Hand hand) {
        if (!this.IIIlIIl()) return false;
        if ((hand == Hand.OFF_HAND ? (Boolean)this.llII.lIl() : (Boolean)this.lIlI.lIl()) == false) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public float IIIII(Hand hand, Arm arm) {
        float f = this.IIII(hand).Ill();
        if (this.IIl()) return f;
        if (arm != Arm.LEFT) return f;
        return -f;
    }

    public Animations() {
        super(StringFactory.IIII("Animations"), Category.l, StringFactory.IIII("Custom first-person item animations."));
        this.II = this.IIlllIl(new IIIIIIIIl<IIlIlllI>(StringFactory.IIII("Swing Mode"), IIlIlllI.class, IIlIlllI.IlI));
        this.IIlII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Swing Speed"), 1.0, 0.05, 6.0, 0.01).IIIl("x"));
        this.lll = this.IIlllIl(new IIIIIIIIl<IlIIlIll>(StringFactory.IIII("Swing Curve"), IlIIlIll.class, IlIIlIll.ll));
        this.IIIII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Separate Hands"), false));
        this.IlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Render Left Hand"), true));
        this.lIlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Disable Swap Main"), true));
        this.llII = this.IIlllIl(new llIll((Object)StringFactory.IIII("Disable Swap Off"), true));
        this.IllI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Equip Smooth"), 0.65, 0.0, 1.0, 0.05));
        this.IIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Swing Strength"), 1.0, 0.25, 2.0, 0.05));
        this.IIlll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Swing Rotation X"), 0.0, -180.0, 180.0, 1.0).IIIl("deg"));
        this.IIIIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Swing Rotation Y"), 90.0, -180.0, 180.0, 1.0).IIIl("deg"));
        this.lIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Swing Rotation Z"), 10.0, -180.0, 180.0, 1.0).IIIl("deg"));
        this.Illl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Spin Speed"), 180.0, 30.0, 1080.0, 15.0).IIIl("deg"));
        this.lII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Scale"), 1.0, 0.7, 1.4, 0.01));
        this.IIlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("X Offset"), 0.0, -2.0, 0.4, 0.01));
        this.IIll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Y Offset"), 0.0, -2.0, 0.4, 0.01));
        this.I = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Z Offset"), 0.0, -2.0, 0.4, 0.01));
        this.IlIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Tilt"), 0.0, -45.0, 45.0, 1.0).IIIl("deg"));
        this.IIlIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Rotation X"), 0.0, -180.0, 180.0, 1.0).IIIl("deg"));
        this.IIIll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Rotation Y"), 0.0, -180.0, 180.0, 1.0).IIIl("deg"));
        this.lIIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Rotation Z"), 0.0, -180.0, 180.0, 1.0).IIIl("deg"));
        this.ll = this.IIlllIl(new IIIIIIIIl<IIIIIIl>(StringFactory.IIII("Offhand Holding Mode"), IIIIIIl.class, IIIIIIl.l));
        this.l = this.IIlllIl(new IIIIIIIIl<IIlIlllI>(StringFactory.IIII("Offhand Swing Mode"), IIlIlllI.class, IIlIlllI.IlI));
        this.Ill = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand Equip Smooth"), 0.65, 0.0, 1.0, 0.05));
        this.lI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand Swing Strength"), 1.0, 0.25, 2.0, 0.05));
        this.IlIlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand Swing Rotation X"), 0.0, -180.0, 180.0, 1.0).IIIl("deg"));
        this.III = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand Swing Rotation Y"), 90.0, -180.0, 180.0, 1.0).IIIl("deg"));
        this.IIIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand Swing Rotation Z"), 10.0, -180.0, 180.0, 1.0).IIIl("deg"));
        this.lllI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand Spin Speed"), 180.0, 30.0, 1080.0, 15.0).IIIl("deg"));
        this.IlII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand Scale"), 1.0, 0.7, 1.4, 0.01));
        this.IlIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand X Offset"), 0.0, -2.0, 0.4, 0.01));
        this.lIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand Y Offset"), 0.0, -2.0, 0.4, 0.01));
        this.IIIlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand Z Offset"), 0.0, -2.0, 0.4, 0.01));
        this.IIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand Tilt"), 0.0, -45.0, 45.0, 1.0).IIIl("deg"));
        this.llll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand Rotation X"), 0.0, -180.0, 180.0, 1.0).IIIl("deg"));
        this.llIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand Rotation Y"), 0.0, -180.0, 180.0, 1.0).IIIl("deg"));
        this.lIll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Offhand Rotation Z"), 0.0, -180.0, 180.0, 1.0).IIIl("deg"));
        this.lll.lIII(() -> {
            if (this.II.lIl() != IIlIlllI.IlI) return true;
            if ((Boolean)this.IIIII.lIl() == false) return false;
            if (this.l.lIl() == IIlIlllI.IlI) return false;
            return true;
        });
        this.IIl.lIII(() -> ((IIlIlllI)((Object)((Object)this.II.lIl()))).lI());
        this.IIlll.lIII(() -> this.II.lIl() == IIlIlllI.IIl);
        this.IIIIl.lIII(() -> {
            if (this.II.lIl() != IIlIlllI.IIl) return false;
            return true;
        });
        this.lIl.lIII(() -> this.II.lIl() == IIlIlllI.IIl);
        this.Illl.lIII(() -> {
            if (this.IlIll.lIl() != IIIIIIl.lI) return false;
            return true;
        });
        this.ll.lIII(this.IIIII::lIl);
        this.l.lIII(this.IIIII::lIl);
        this.Ill.lIII(this.IIIII::lIl);
        this.lI.lIII(() -> {
            if ((Boolean)this.IIIII.lIl() == false) return false;
            if (!((IIlIlllI)((Object)((Object)this.l.lIl()))).lI()) return false;
            return true;
        });
        this.IlIlI.lIII(() -> {
            if ((Boolean)this.IIIII.lIl() == false) return false;
            if (this.l.lIl() != IIlIlllI.IIl) return false;
            return true;
        });
        this.III.lIII(() -> {
            if ((Boolean)this.IIIII.lIl() == false) return false;
            if (this.l.lIl() != IIlIlllI.IIl) return false;
            return true;
        });
        this.IIIl.lIII(() -> {
            if ((Boolean)this.IIIII.lIl() == false) return false;
            if (this.l.lIl() != IIlIlllI.IIl) return false;
            return true;
        });
        this.lllI.lIII(() -> {
            if ((Boolean)this.IIIII.lIl() == false) return false;
            if (this.ll.lIl() != IIIIIIl.lI) return false;
            return true;
        });
        this.IlII.lIII(this.IIIII::lIl);
        this.IlIl.lIII(this.IIIII::lIl);
        this.lIII.lIII(this.IIIII::lIl);
        this.IIIlI.lIII(this.IIIII::lIl);
        this.IIII.lIII(this.IIIII::lIl);
        this.llll.lIII(this.IIIII::lIl);
        this.llIl.lIII(this.IIIII::lIl);
        this.lIll.lIII(this.IIIII::lIl);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String II() {
        if (((Boolean)this.IIIII.lIl()).booleanValue()) {
            return "Split";
        }
        IIIIIIl iIIIIIl = (IIIIIIl)((Object)this.IlIll.lIl());
        IIlIlllI iIlIlllI = (IIlIlllI)((Object)this.II.lIl());
        if (iIIIIIl == IIIIIIl.l && iIlIlllI == IIlIlllI.IlI) {
            return IIIIIIl.l.toString();
        }
        if (iIlIlllI == IIlIlllI.IlI) {
            return iIIIIIl.toString();
        }
        if (iIIIIIl != IIIIIIl.l) {
            String string = String.valueOf((Object)iIlIlllI);
            String string2 = " / ";
            String string3 = String.valueOf((Object)iIIIIIl);
            return string3 + string2 + string;
        }
        return iIlIlllI.toString();
    }

    public boolean IIIIl() {
        return (Boolean)this.IlI.lIl();
    }

    public IIIIIIl IIIlI(Hand hand) {
        return this.IIII(hand).Il();
    }

    public float IIllI(Hand hand) {
        return this.IIII(hand).lI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIII(JsonObject jsonObject) {
        if (jsonObject == null) return;
        if (!jsonObject.has("settings")) {
            return;
        }
        JsonObject jsonObject2 = jsonObject.getAsJsonObject("settings");
        JsonElement jsonElement = jsonObject2.get("Slow Swing");
        if (jsonElement == null) return;
        if (!jsonElement.getAsBoolean()) {
            return;
        }
        JsonElement jsonElement2 = jsonObject2.get("Swing Ticks");
        double d = jsonElement2 == null ? 12.0 : Math.max(1.0, jsonElement2.getAsDouble());
        this.IIlII.lI(6.0 * (Double)this.IIlII.lIl() / d);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIl() {
        long l2 = System.nanoTime();
        if (this.llI == 0L) {
            this.llI = l2;
            return;
        }
        float f = Math.min((float)(l2 - this.llI) / 1.0E9f, 0.1f);
        this.llI = l2;
        this.IlIIl = (this.IlIIl + f * ((Double)this.Illl.lIl()).floatValue()) % 360.0f;
        float f2 = this.IIl() ? ((Double)this.lllI.lIl()).floatValue() : ((Double)this.Illl.lIl()).floatValue();
        this.IIllI = (this.IIllI + f * f2) % 360.0f;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 20820;
        String string = "\u0b84\u472e\u2a05\uee6d\u3594\u0af3\ub1ed\u710e\u799e\ubfae\u1966\u71b1\ubbd2\ue33c\ubaeb\uec44\u7760\uf3c8\u1fd9\u768b\u570f\ubeab\u553f\u163e\u3d20\u047d\u7958\u5adb\u3889\u1323\u917c\u8e02\u0eb7\u0867\u5100\u6b32\u2439\u7823\u5405\u92f4\uc2a2\ucf9a\u6865\uffcc\u4123\u75f8\u40b6\ue2d6\u649f\u9d68\ub903\u5d28\u1b47\ubfe9\u3527\u5bd0\u1df6\ua2b4\u2b6c\u04e3\ua53e\u4df4\uccf0\u41f6\ua6fb\u825a\u1d64\u6ede\u9efd\u2627\uf957\u3d9c\uc77a\udf44\ufef6\u17c8\ud6db\u5c55\u1f2f\u4841\u013f\u224c\ubfd7\u9307\u347b\u29b3\u95ff\u1b1d\u6ced\udd56\u8df6\u32e1\u1f6d\ubbea\ue4dd\u76c5\u5eae\uba08\uf317\u2a57\uc9eb\uc372\u1e0c\u5e54\u94d7\u24a9\ufcea\u7cf8\u61a0\ub7e8\u45c0\u91b5\ue134\ud2b1\u9df5\ubb7f\u6a08\u1d8d\u74c2\u1c9d\u6822\u74ee\uaaeb\u3987\u8944\ued2b\ub52a\ud2ab\ufc5f\u1cc5\ub70c\u7486\u06e8\ue125\u09fb\ua1b8\u3e2f\u0542\u0722\ua3ec\u2b74\u4f40\u24c1\uf7d6\u395e\u774c\u69e2\u6048\udc6f\u6d6c\u358e\u0ae5\u6142\u3a01\u78b0\ub946\u010c\u9a45\u8985\u95e3\u6cbd\ud0ed\ue971\u8ebb\uc652\u0aa0\u033f\uf4f1\u7ed7\ub72b\u88f2\uc8e4\u6537\u8656\ub98e\ue098\uc9c1\ud390\uc002\u15f4\ude7e\u5f77\uef76\ua86e\u3a76\u0005\ue6e9\u8988\u438d\u8ea6\u7706\uff6d\u15c1\u0b4b\uf8f0\u29fe\u1cc7\uf79b\u0129\ubd8c\ufe1c\uf6d4\u3e37\ud5a2\u5f2b\u9863\u7b6d\u7523\ub0c4\u3258\u149a\u203b\u1a47\ue85d\u0948\ubf04\u673d\u1b86\u158e\u57c2\u3c18\ub3fa\u019f\u2c54\u7850\u032b\ua7fa\u118a\ue088\u60c0\ubada\u6758\u9bea\u00e3\ude42\u5164\ue429\u39e6\u483f\ua798\u3472\ud281\u55cb\u995a\uedea\u6982\u3b9a\u1658\ue898\ua917\u1272\u8534\ua279\u959e\u3f69\uff6f\uab86\u4b90\u5921\ube89\u8fae\u43f4\uca42\ud684\u7b9a\u32ef\u9759\uec6e\u7ea0\ub59d\u989f\u93b8\uf4a5\ud4bc\uf8f5\u4ed3\u9f8f\u6952\u1940\u7535\u9ae0\uada9\u79ca\u4f4f\u70da\u837a\u91f0\uaf1d\u08da\u32db\u3cc7\u2662\udd1d\ub21c\ua493\uf5e4\ud2ee\u0e3c\ue2af\u656e\u4e13\u9a01\ude76\u3408\u40c6\u83dc\u485d\u6cdb\u94f4\u578a\ud4e9\ua20e\u45c1\u8b40\u1a6d\uef46\ue1d3\u618b\u1e77\u073c\u94d0\ua0c6\u695f\uf9e7\u4bcc\ubbd7\ud0c8\u56df\uea7a\u5f8b\u4993\ude23\ufaf5\ue818\ufe31\u539c\ub4b9\u3d72\ue71e\u435b\ue8c1\uc496\u3df1\u82c9\u11bb\u0559\u24bd\ub270\u39f7\u32fe\uc07f\u71ca\u4389\u4153\ud06f\u700f\u6d83\u805c\ua7fc\ufb0f\u6ef4\ua81d\u550e\u05c8\u6989\u02f5\u80b7\u4814\u25be\u5484\ufed3\u7bd5\u472f\uac12\u4d2f\ud629\u1102\u5fcc\u5c20\u13cd\u9e2d\u210b\ud4e0\u26fd\u8775\u0d9e\u3e23\ub33f\u3c2b\u01dc\u3469\u2ac1\ub5e8\uce02\ub5ba\ud3e6\u8132\uf49f\ue7ec\u131e\u7375\u0c1a\uf69e\ub387\uebe1\u0875\u6e83\ubee9\u3497\u3548\ue51d\uaba3\u0c27\ua0ff\u6f47\u0b88\u470d\u7967\u3b93\u3486\ub480\u3cb8\ufc19\udf3c\u7fa8\u5823\u58cf\u1d02\u79cb\u2d28\u3cbd\u4199\udf6a\ud78d\u1b20\u4353\uaa5c\u7c4f\u301c\ua7fa\uc352\ud7ee\u166f\uf4ed\u6e69\u792b\u7700\u50a6\u2609\u0ca3\uec25\ucd7a\uf58d\ub205\udb96\ufea4\uc24a\u7104\u3c7d\u7f79\u1b6d\u30d2\u0f9f\u8114\uc8b0\ub8eb\uf82e\u46e1\u744c\u1b57\u11fd\ubd2d\u9d94\ua438\u1657\u283e\u0317\ud77c\u4600\u4e5f\u6f73\u6de1\u411a\uec84\u74e0\u4679\uda0b\uc29a\ub2ae\uf954\u71b5\u3440\u0438\u3739\u3937\u0b13\u32f5\u977d\u3028\ub8e9\uf811\u57d9\ue863\u4040\ucadc\u7b1d\ud032\ued08\u573c\u1653\u7717\u6ed2\uf473\u62b8\uc5f6\u43fe\u70a3\ud834\u8f78\uc52b\u3fde\uf19c\ue244\uc0aa\ua6d2\u20f0\u738d\u82b7\u88ad\u65ab\u8449\u3b6c\u60d6\u07cb\u7256\uc376\u7c7a\u61fe\u744f\u24d2\uf750\u87ab\u1c9c\ud695\u5d5f\ucbcf\u10a7\ue543\u4431\uf33c\u43a0\ud2c6\u52cb\uc8b4\u538d\ua4a7\u159b\u5819\u5d83\u265c\u6461\u8509\u7cee\ub74b\u2795\ua709\u7e11\ud476\u0c73\u9df9\u34a4\u7da4\ub842\u19c3\ud3ee\u4bb8\uc25a\ued52\u9334\u4210\ue424\ua300\u25f3\u3f49\u48b3\ud38e\uac43\ua555\uab75\u7ff0\u9d0d\u4d46\u9aa3\u3fa8\u754a\u87ea\u1f8b\u33f5\ufb7c\u01a1\ubb59\uecf2\u7c13\u07fb\u102f\u01ee\u304d\uaae6\u4409\uf566\u85a4\u48ed\ue5d9\udeab\u8ab9\u7dde\u27ab\u5cb8\u2580\u47a7\u3cd7\u97bf\u2876\u2ea0\u0d29\u8f93\u3f63\ua212\u39e9\u5c28\u5026\u4212\u75c1\u714c\u940e\ucc28\uc9f1\uaa16\u8869\ud453\uabd3\u9971\uea4a\ufe0c\uccf1\ub83d\u0b1e\u77be\u2184\u0576\u2741\udd3c\u4c03\ub69b\u1a68\ue30b\ufcf5\ud52f\udc57\u19e9\u3ca6\ua6c3\u2672\ub331\u66d1\u6116\u89ff\ub823\u146b\u625e\u0989\uaea1\u73ac\u71d3\ue894\uc3d8\u79c2\uff4c\u02df\ub03a\u2f80\uc78f\ub7ba\uc1de\u2880\u39af\uf426\ua7e1\u8905\u57f9\ud801\ud832\u4bf7\u4f1a\ub501\uf030\u741c\uf69c\u700d\u7455\uca02\ub8b8\ub1f2\u8947\u1b62\ub2fd\u9a88\ube3b\uf111\u3ee6\udc62\uf689\ua2fc\uc5ac\u6141\u9e38\ub684\ubb6c\u3aa0\u6e7b\ud4fc\u7549\u4b31\u564f\u446d\u064c\ued3f\ub91d\u2939\u90d7\u52c1\ufef2\u8e40\ua618\u98da\ufa65\u4e08\u4850\ue467\uaa07\u7547\u087d\u473c\uf519\u44f5\u49bc\ubaf7\u73bf\ufe94\ucfd7\u7e81\uc64c\u513f\u91da\ub254\uc6c6\u3d8b\u33b8\u74a9\u06e9\u1f93\uc0ba\uede0\ue4c7\u04a2\u0843\u42ca\u581c\u789c\u07b3\u21a3\u8f52\u2e69\u02d3\uf0fd\u4f18\u4447\uc83e\u1d4f\u1a8a\uf37b\u24d8\u2eab\u210a\u073e\u78d5\udce8\u1270\uadb3\ud45d\uf1f2\u0eb2\uc5e6\ufbfb\u2531\ufc3d\uf439\u8204\u1287\u1455\ud44a\uab09\u53e9\ub378\u6432\u9b7a\uf290\u3e3a\uaec7\u310b\u65fa\u9adc\u6282\u6ac0\u8680\uf0d7\uc2ae\u2a92\uc494\u7a18\ud08c\u38f4\ub9a6\ufa65\uf86f\ue0a7\ufcbc\u3078\u322c\u6af1\u0dd7\u637d\ucdc6\ubefb\uf440\u1a24\u03ed\u2599\ufdc6\u131e\u543d\ue515\ua281\u3ded\u51bb\u606a\uf67a\ue5cd\u6564\u63d9\ufc02\u6805\uf27e\u5aed\u06ec\udb98\ud781\u1ce8\u81cb\u9103\u02b1\u51e0\u3a0f\ufe6f\ucd60\u3c21\uc942\u9806\u9397\u26a1\u8314\u0144\ud8ae\u73bd\u63b3\u6526\udc05\u28c5\ufc2a\u3a57\u14dc\u58bd\u2236\ub87a\ub05b\ud516\u51a7\u6f8b\ucb1e\u9cc7\u4c41\u58a7\u5af4\ue786\u5f96\u4c66\u51f2\uf7be\u2df2\ufca1\uf9fb\u9cfb\ueac9\u0397\ueefe\u592a\ue1af\u97a9\u46cc\uf8e7\ud377\u187b\uf06f\u7986\ubde4\ua0bd\uc38f\ucc89\uc74d\uc5d9";
        char[] cArray = "\u5150\u514c\u514c\u514c\u5144\u514c\u515c\u514c\u514c\u5144\u5174\u5144\u5144\u5144\u5174\u514c\u5158\u5140\u5148\u514c\u5174\u514c\u5158\u514c\u514c\u5150\u5144\u515c\u5144\u5140\u5158\u5144\u5140\u5148\u5144\u5164\u5174\u514c\u514c\u514c\u5144\u5144\u5144\u5158\u5144\u515c\u5150".toCharArray();
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
        IllIl = stringArray;
        IlllI = new Object[stringArray.length];
        int n6 = 1678018945;
        byte[] byArray = "\u00e6)h\u00e1UY\u009b<\t\u0082,rZt\u0001o\nW\u00d4\u00dd\u0003Y\u00ba\u00b7\u00c4\n\u0003\u00cb\u0092\u0019\u0095m\rS\u00db\u00b2\u008d\u008f\u00f2\u0017'\u0091\u0014\u00c5%\u00b0\u007fH\u0084\u009fr\u00fe\u00db\u00eap\u00ee\u00ca\u00a4z\u00ee\u007f[\u00d7?\u00fa\u00b4\u0093CfZ\u0011\u008fe\u0012!Z\u001b\u00b6E\u00b3\u00d9\u00caZU\u0097\u0093\u00a0\u00be\u00a0\u009b\u00bc\u001f+\u00a6.\u00df\u007fh\u00de_\u00c0\u00177\u0083\u009b\u0016w&4\u0083#\u00aeH\u000f_i\u00e2\"4n\u009ef8\u00cd\u00a4\u00cbz\u00cd\u00af\u0080\u0004\u008cz\u00a8\u0011\u009a|^\u0018\u00cf\u007f\u00e5\u00f7\u00e1\u00de\u00ebD\u00b2\u00d9\u0094!\u00c5@\u0006\u00cbe\u00eb\u00fe\u00bf\u00d8\u009c\u0001\u00d6j,\u001b\u00fd[\u00c5\u00c0k\u001d\u00cf,\u00d2\u0012I\u0005XQ\u007f\u001d\u00a6q\u008f\u0014\u00a4\u00dd`\u00e1\u001a\u00fd/0s\u00f8\u00ab\u001fA\u0093v\u00c6\u00f4\u00d8\u00980IteNu\u0093:\u00da\u00a4\u0088\u0003v\u001cp\u0098\u00ef\u00b1\u00e6\u0083Z\u00ca\u00c3\u0085=\u00a3M\u00fc\u00f9\u008dHC\u00d9HH\u00a8\u009f\u0087\u0007\u00a0\u00a6YSl!K\u00eb6\u00e5\u00cfL\u0004\u00be3l\u000e\u00a3b\u00ceGUF\u0080I\u00c1M\u00fe&\u0098\u00d8c\u001a\u00d1_>D\u00d8\u00bf7\u008f\u00ee\u0013\\\u00e2\u00c7\u00f2\u00db\u009d\u00be\u0088\u0090\u00f8\u00cf\u0095\u00f7\u00f1\u00ee\u00b0\u00f3\u00b8\u00a2[\u00fc\u00c9\u00f6\u0084\u00e5}\u00b5\u00f2\u0003\u00fd\u00e4\u0001a<T\u00ealk(\u001fDd\u0083\u0099\u001b\u00bc\u00f0\u008b\u007fy_!\u0013t\t\u0099\u0094\n6:0\\\u0014\u00f73hC T\u0018\u00e7u\u00b0\u00924\u009b\u0094\u001a\u009f\u0013:\u00d7\u00cf@\u000e{\u00c1\u00f9\u009e\u00f4z\u000e\u00a6\u00f8\u00bc=\u00f2a\u0012\u0089\u0002)\u0012AlP\u00b4K\u00a1\u00eb\u0088\u00e0\u00b2\u00c1\u00cd:CDUm7PT\u00c3\u0019\u0093hJ\u001b+\u00c4\u00d8\u0017\u00cbx\u00c5\u000f\u00f8\u0000\u00d3\u00e07E\u0010\u00a4LM8!\u0014\u00c6\u009a\u001c\u00a4\u00c3\u001b\u00be\u0015a\u009d%P\u0006\u009a\u00ac j\u0092kU\u00e8\u008a\u0086.\u00c3\u00f9\u00dd\u00b2_Dp?r\u00b7]\u00cfHh\u0084\u00ef\b\u00bdq\u00d5\"\u00e7\u00a6\u00dc\u009d\u0097t\u00d2\u00a0g\u00beIzSBh\u00f9\u008b\u00b4J\u00e4\u00f8\u00c5e\u00a4\u00afG>]\u00f9%\u00e0\u0002\u000e:%\u00d2\u00a4s\u0085\u00e7\n\u00a8 \u00fe\u008a\u00a0\u00f1N\u00afD".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IllII = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            Animations.IllII[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        Il = new String[47];
        Animations.IlII();
    }

    public IIlIlllI IlIll(Hand hand) {
        return this.IIII(hand).IIII();
    }

    @Override
    public void ll() {
        this.llI = System.nanoTime();
    }

    private static int IllII(int n, int n2) {
        return IllII[n ^ 0xE494B529] ^ n2 ^ n;
    }

    /*
     * Unable to fully structure code
     */
    private static String IlllI(int var0, int var1_1) {
        block69: {
            block68: {
                var3_2 = var0 ^ 346212514;
                ** GOTO lbl175
lbl3:
                // 1 sources

                while (true) {
                    var9_9 = 153;
                    ** GOTO lbl170
                    break;
                }
lbl6:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
lbl8:
                // 1 sources

                while (true) {
                    Animations.IlllI[var3_2] = var5_5;
                    break block68;
                    break;
                }
lbl11:
                // 1 sources

                while (true) {
                    var9_9 = 94;
                    ** GOTO lbl170
                    break;
                }
lbl14:
                // 1 sources

                while (true) {
                    var9_9 = 192;
                    ** GOTO lbl170
                    break;
                }
lbl17:
                // 1 sources

                while (true) {
                    var9_9 = 112;
                    ** GOTO lbl170
                    break;
                }
lbl20:
                // 1 sources

                while (true) {
                    var9_9 = 45;
                    ** GOTO lbl170
                    break;
                }
lbl23:
                // 1 sources

                while (true) {
                    var9_9 = 212;
                    ** GOTO lbl170
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_9 = 0;
                    ** GOTO lbl170
                    break;
                }
lbl29:
                // 1 sources

                while (true) {
                    var9_9 = 25;
                    ** GOTO lbl170
                    break;
                }
lbl32:
                // 1 sources

                while (true) {
                    var9_9 = 33;
                    ** GOTO lbl170
                    break;
                }
lbl35:
                // 1 sources

                while (true) {
                    var9_9 = 176;
                    ** GOTO lbl170
                    break;
                }
                var7_7 = (var6_6.getClassName().hashCode() ^ var6_6.getMethodName().hashCode()) >> 16 ^ 1529355157;
                var8_8 = 0;
                break block69;
lbl41:
                // 1 sources

                while (true) {
                    var9_9 = 190;
                    ** GOTO lbl170
                    break;
                }
lbl44:
                // 1 sources

                while (true) {
                    var9_9 = 144;
                    ** GOTO lbl170
                    break;
                }
lbl47:
                // 1 sources

                return new String(var4_4).intern();
lbl49:
                // 1 sources

                while (true) {
                    var9_9 = 211;
                    ** GOTO lbl170
                    break;
                }
lbl52:
                // 1 sources

                while (true) {
                    if (++var8_8 < var4_4.length) break block69;
                    ** continue;
lbl55:
                    // 1 sources

                    while (true) {
                        var9_9 = 169;
                        ** GOTO lbl170
                        break;
                    }
lbl58:
                    // 1 sources

                    while (true) {
                        var9_9 = 163;
                        ** GOTO lbl170
                        break;
                    }
lbl61:
                    // 1 sources

                    while (true) {
                        var9_9 = 126;
                        ** GOTO lbl170
                        break;
                    }
lbl64:
                    // 1 sources

                    while (true) {
                        var9_9 = 153;
                        ** GOTO lbl170
                        break;
                    }
lbl67:
                    // 1 sources

                    while (true) {
                        var9_9 = 150;
                        ** GOTO lbl170
                        break;
                    }
lbl70:
                    // 1 sources

                    while (true) {
                        var9_9 = 229;
                        ** GOTO lbl170
                        break;
                    }
lbl73:
                    // 1 sources

                    while (true) {
                        var9_9 = 245;
                        ** GOTO lbl170
                        break;
                    }
lbl76:
                    // 1 sources

                    while (true) {
                        var9_9 = 241;
                        ** GOTO lbl170
                        break;
                    }
lbl79:
                    // 1 sources

                    while (true) {
                        var9_9 = 99;
                        ** GOTO lbl170
                        break;
                    }
                    break;
                }
            }
lbl83:
            // 2 sources

            while (true) {
                var6_6 = var5_5[1];
                ** continue;
                break;
            }
lbl86:
            // 1 sources

            while (true) {
                var9_9 = 73;
                ** GOTO lbl170
                break;
            }
lbl89:
            // 1 sources

            while (true) {
                var9_9 = 249;
                ** GOTO lbl170
                break;
            }
lbl92:
            // 1 sources

            while (true) {
                var9_9 = 200;
                ** GOTO lbl170
                break;
            }
lbl95:
            // 1 sources

            while (true) {
                continue;
                break;
            }
lbl97:
            // 1 sources

            while (true) {
                var9_9 = 90;
                ** GOTO lbl170
                break;
            }
            var2_3 = (StackTraceElement[])Animations.IlllI[var3_2];
            if (var2_3 != null) ** GOTO lbl173
            var5_5 = new Throwable().getStackTrace();
            ** while (true)
lbl104:
            // 1 sources

            while (true) {
                var9_9 = 56;
                ** GOTO lbl170
                break;
            }
lbl107:
            // 1 sources

            while (true) {
                var9_9 = 236;
                ** GOTO lbl170
                break;
            }
        }
        block0 : switch (var8_8 & 31) {
            case 3: {
                ** continue;
            }
            case 13: {
                ** continue;
            }
            case 31: {
                ** continue;
            }
            case 20: {
                ** continue;
            }
            case 30: {
                ** continue;
            }
            case 9: {
                ** continue;
            }
            case 19: {
                ** continue;
            }
            case 28: {
                ** continue;
            }
            case 26: {
                ** continue;
            }
            case 25: {
                ** continue;
            }
            case 10: {
                ** continue;
            }
            case 17: {
                ** continue;
            }
            case 7: {
                ** continue;
            }
            case 4: {
                ** continue;
            }
            case 14: {
                ** continue;
            }
            case 1: {
                ** continue;
            }
            case 16: {
                ** continue;
            }
            case 23: {
                ** continue;
            }
            case 15: {
                ** continue;
            }
            case 22: {
                ** continue;
            }
            default: {
                ** continue;
            }
            case 18: {
                ** continue;
            }
            case 24: {
                ** continue;
            }
            case 8: {
                ** continue;
            }
            case 21: {
                ** continue;
            }
            case 2: {
                ** continue;
            }
            case 12: {
                ** continue;
            }
            case 11: {
                ** continue;
            }
            case 6: {
                var9_9 = 150;
lbl170:
                // 32 sources

                while (true) {
                    var4_4[var8_8] = var4_4[var8_8] ^ var9_9 ^ var1_1 >> 16 ^ var7_7;
                    break block0;
                    break;
                }
            }
lbl173:
            // 1 sources

            var5_5 = var2_3;
            ** continue;
lbl175:
            // 1 sources

            var4_4 = Animations.IllIl[var3_2].toCharArray();
            ** continue;
            case 29: {
                var9_9 = 204;
                ** GOTO lbl170
            }
        }
        ** while (true)
        {
            case 5: {
                var9_9 = 214;
                ** GOTO lbl170
            }
            ** case 27:
        }
lbl185:
        // 1 sources

        var9_9 = 85;
        ** while (true)
    }
}

