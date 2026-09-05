/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIll
 * Module         : Radar  [HUD]
 * Description    : Clean entity radar with player and mob dots.   (client's own text)
 *
 * Recovered strings in this class:
 *   - ), 126.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII(
 *   - ), 18.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII(
 *   - Background
 *   - .getBytes(
 *   - Players
 *   - Range
 *   - Scale
 *   - Size
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
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.entity.Entity
 *  net.minecraft.entity.LivingEntity
 *  net.minecraft.entity.mob.MobEntity
 *  net.minecraft.entity.player.PlayerEntity
 *  net.minecraft.util.math.MathHelper
 */
package orchard.module.hud;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.MathHelper;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlI;
import orchard.internal.IIIllIII;
import orchard.internal.IlIIIIll;
import orchard.internal.IllIlI;
import orchard.internal.lIIIlIII;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;
import orchard.internal.lllIlII;
import orchard.internal.lllIlIII;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Environment(value=EnvType.CLIENT)
public final class Radar
extends ModuleBase
implements lllIlIII {
    private final llIll I;
    private final llIll l;
    private final lIlIIlI II;
    private final lIlIIlI Il;
    private static final double lI = 108.0;
    private final lIlIIlI ll = this.IIlllIl(new lIlIIlI(StringFactory.IIII("X"), 18.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII("px")));
    private static final double III = 5.0;
    private final lIlIIlI IIl;
    private final lIlIIlI IlI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Y"), 126.0, 0.0, 4000.0, 1.0).IIII(StringFactory.IIII("px")));
    private volatile List<lllIlII> Ill;
    private static final IIIllIII lII;
    private final llIll lIl;
    private static final int[] llI;
    private static final String[] lll;
    private static final Object[] IIII;

    /*
     * Enabled aggressive block sorting
     */
    private void lI(DrawContext drawContext, double d) {
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = d;
        double d5 = d2 + d4 * 0.5;
        double d6 = d3 + d4 * 0.5;
        int n = IlIIIIll.IllI();
        IIIlI.Illlll(drawContext, d2 + 5.0, d6, d2 + d4 - 5.0, d6, 1.0, n);
        IIIlI.Illlll(drawContext, d5, d3 + 5.0, d5, d3 + d4 - 5.0, 1.0, n);
    }

    @Override
    public void lIII(DrawContext drawContext, int n, int n2, float f) {
        this.IIl(drawContext, false, f);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Radar() {
        super(StringFactory.IIII("qpVQnQs="), Category.I, StringFactory.IIII("u5hRnRcXVRKDAYtAT8HfmpmGFIsQQ1hchwSeQArBnp+WkBSRFlUQGJgcjBc="));
        this.Il = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Size"), 108.0, 72.0, 180.0, 2.0).IIII(StringFactory.IIII("px")));
        this.II = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Range"), 36.0, 8.0, 128.0, 1.0).IIII(StringFactory.IIII("m")));
        this.IIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Scale"), 100.0, 60.0, 200.0, 5.0).IIII(StringFactory.IIII("%")));
        this.l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Players"), true));
        this.lIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Mobs"), true));
        this.I = this.IIlllIl(new llIll((Object)StringFactory.IIII("Background"), true));
        this.Ill = List.of();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IIl(DrawContext drawContext, boolean bl, float f) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (drawContext == null || minecraftClient == null || minecraftClient.player == null || minecraftClient.world == null || minecraftClient.textRenderer == null) {
            return;
        }
        double d = this.IlI();
        double d2 = (Double)this.Il.lIl();
        double d3 = this.IlII();
        double d4 = this.IlIl();
        IIIlI.lIlIIl(drawContext);
        IIIlI.Ill(drawContext, d3, d4);
        IIIlI.IIlll(drawContext, d, d);
        try {
            this.IIII(drawContext, d2, bl);
            this.lI(drawContext, d2);
            this.lll(drawContext, minecraftClient, d2, f);
        }
        finally {
            IIIlI.IlIllI(drawContext);
        }
    }

    @Override
    public double IlII() {
        return (Double)this.ll.lIl();
    }

    private double IlI() {
        return (Double)this.IIl.lIl() / 100.0;
    }

    @Override
    public double IIll() {
        return (Double)this.Il.lIl() * this.IlI();
    }

    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        this.IIl(drawContext, false, f);
    }

    private Color lII() {
        return new Color(91, 224, 151);
    }

    @Override
    public void llII(DrawContext drawContext, int n, int n2, float f, boolean bl) {
        this.IIl(drawContext, bl, f);
    }

    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null || minecraftClient.player == null || minecraftClient.world == null) {
            this.Ill = List.of();
            return;
        }
        double d = minecraftClient.player.getX();
        double d2 = minecraftClient.player.getZ();
        ArrayList<lllIlII> arrayList = new ArrayList<lllIlII>();
        try {
            for (Entity entity : minecraftClient.world.getEntities()) {
                try {
                    LivingEntity livingEntity;
                    if (!(entity instanceof LivingEntity) || !this.lIl(minecraftClient, livingEntity = (LivingEntity)entity)) continue;
                    double d3 = livingEntity.getX() - d;
                    double d4 = livingEntity.getZ() - d2;
                    if (!Double.isFinite(d3) || !Double.isFinite(d4)) continue;
                    arrayList.add(new lllIlII(d3, d4, livingEntity instanceof PlayerEntity));
                }
                catch (LinkageError | RuntimeException throwable) {}
            }
            this.Ill = List.copyOf(arrayList);
        }
        catch (LinkageError | RuntimeException throwable) {
            this.Ill = List.of();
        }
    }

    @Override
    public double IlIl() {
        return (Double)this.IlI.lIl();
    }

    @Override
    public double III() {
        return (Double)this.Il.lIl() * this.IlI();
    }

    @Override
    public void llll() {
        this.Ill = List.of();
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public boolean Illl(double d, double d2) {
        if (!(d >= this.IlII())) return false;
        if (!(d <= this.IlII() + this.III())) return false;
        if (!(d2 >= this.IlIl())) return false;
        if (!(d2 <= this.IlIl() + this.IIll())) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIl(MinecraftClient minecraftClient, LivingEntity livingEntity) {
        if (!(livingEntity instanceof PlayerEntity)) {
            if ((Boolean)this.lIl.lIl() == false) return false;
            if (!(livingEntity instanceof MobEntity)) return false;
            if (!IllIlI.llIIl(minecraftClient, (Entity)livingEntity)) return false;
            return true;
        }
        PlayerEntity playerEntity = (PlayerEntity)livingEntity;
        if ((Boolean)this.l.lIl() == false) return false;
        if (IllIlI.IIIII(minecraftClient, playerEntity)) return true;
        return false;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 11160;
        String string = "\u587d\u586e\u58dd\u581e\u581b\u5853\u5861\u58c3\uf0fb\uf0a9\uf061\uf09f\uf099\uf0d2\uf0f3\uf024\uf0ce\uf031\uf0e0\uf04c\uf030\uf03b\uf0a4\uf0d6\uf019\uf090\uf0f4\uf03d\uf042\uf091\uf0d7\uf08e\uf0b3\uf0b4\uf0a2\uf009\uf08d\uf09f\uf0bb\uf0f2\uf0e6\uf0eb\uf05a\uf0a8\uf0a6\uf0c1\uf0e2\uf03e\uf0f6\uf013\uf080\uf05f\uf01a\uf020\uf083\uf0c5\uf00b\uf0c4\uf0e9\uf00a\uf068\uf0ab\uf0dd\uf0aa\uf09f\uf0bf\uf0b2\uf065\u819f\u81a3\u814a\u818e\u17c4\u17f6\u175d\u17d3\u87ec\u87c0\u8739\u87fd\u470c\u473e\u4795\u471b\u4372\u4324\u43b5\u430f\u4317\u435c\u4320\u43cc\u0e4e\u0e7c\u0ed7\u0e59\ue597\ue584\ue537\ue5c4\ue5f2\ue590\ue58f\ue529\ueb2c\ueb03\uebfa\ueb3e\u553e\u5568\u55ac\u555a\u555d\u5503\u5526\u5580\u78de\u78ae\u7857\u7893\u3e43\u3e6a\u3edd\u3e27\u3e23\u3e6e\u3e54\u3e86\u3e75\u3ea8\u3e2a\u3e89\uddb6\udd8a\udd31\uddd6\uddd1\uddbb\udde1\udd0d\u8ee3\u8ef4\u8e47\u8e8d\u8e83\u8ee0\u8ebd\u8e22\u8ed8\u8e0c\u8ede\u8e4a\u8e2d\u8e3b\u8ef5\u8eb2";
        char[] cArray = "\u2b90\u2ba4\u2b9c\u2b9c\u2b9c\u2b9c\u2b90\u2b9c\u2b90\u2b9c\u2b90\u2b9c\u2b94\u2b90\u2b88".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        boolean bl = true;
        while (true) {
            if (!bl || (bl = false) || !true) {
                n2 = 0;
            }
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) break;
            do {
                n5 = cArray[n3] ^ n;
                stringArray[n3] = string.substring(n4, n4 + n5);
                n4 += n5;
            } while (++n3 < cArray.length);
        }
        lll = stringArray;
        IIII = new Object[stringArray.length];
        int n6 = -969985865;
        byte[] byArray = "\u0012&\u00ad\u00c4\u001b\u00b3\u00a3\b-\u001c<\u0013\u00c2&\u0000\u000e\u00cdS\u00c4\u00de".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        llI = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            Radar.llI[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        lII = IIIllIII.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    private int lll(DrawContext drawContext, MinecraftClient minecraftClient, double d, float f) {
        double d2 = 0.0;
        double d3 = 0.0;
        double d4 = d;
        double d5 = d2 + d4 * 0.5;
        double d6 = d3 + d4 * 0.5;
        double d7 = d4 * 0.5 - 5.0;
        double d8 = Math.max(1.0, (Double)this.II.lIl());
        double d9 = Math.toRadians(minecraftClient.player.getYaw());
        double d10 = Math.sin(d9);
        double d11 = Math.cos(d9);
        int n = 0;
        Iterator<lllIlII> iterator = this.Ill.iterator();
        while (iterator.hasNext()) {
            double d12;
            lllIlII lllIlII2 = iterator.next();
            double d13 = lllIlII2.II();
            double d14 = Math.hypot(d13, d12 = lllIlII2.l());
            if (!Double.isFinite(d14) || d14 > d8) continue;
            double d15 = -(d13 * d11 + d12 * d10);
            double d16 = -d13 * d10 + d12 * d11;
            double d17 = d15 / d8 * d7;
            double d18 = -d16 / d8 * d7;
            d17 = MathHelper.clamp((double)d17, (double)(-d7), (double)d7);
            d18 = MathHelper.clamp((double)d18, (double)(-d7), (double)d7);
            int n2 = !lllIlII2.I() ? lIIIlIII.II(this.lII().getRGB(), 224) : IlIIIIll.IIII(IlIIIIll.III(), 238);
            double d19 = lllIlII2.I() ? 3.2 : 2.6;
            IIIlI.Illl(drawContext, d5 + d17 - d19 * 0.5, d6 + d18 - d19 * 0.5, d19, d19, 1.2, n2);
            ++n;
        }
        return n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IIII(DrawContext drawContext, double d, boolean bl) {
        if (!((Boolean)this.I.lIl()).booleanValue()) {
            if (!bl) {
                return;
            }
        }
        IlIIIIll.l(drawContext, lII, 0.0, 0.0, d, d, bl);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void lllI(double d, double d2) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        double d3 = Double.MAX_VALUE;
        double d4 = Double.MAX_VALUE;
        if (minecraftClient != null && minecraftClient.getWindow() != null) {
            d3 = Math.max(0.0, (double)minecraftClient.getWindow().getScaledWidth() - this.III());
            d4 = Math.max(0.0, (double)minecraftClient.getWindow().getScaledHeight() - this.IIll());
        }
        this.ll.lI(Math.max(0.0, Math.min(d, d3)));
        this.IlI.lI(Math.max(0.0, Math.min(d2, d4)));
    }

    private static int IIlI(int n, int n2) {
        return llI[n ^ 0x219B619A] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IllI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x9D90FB6E;
        char[] cArray = lll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIII[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Radar.IIII[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xBBB4AB62;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 9 -> 217;
                case 3 -> 119;
                case 30 -> 105;
                case 22 -> 0;
                case 10 -> 17;
                case 4 -> 77;
                case 7 -> 198;
                case 18 -> 6;
                case 2 -> 179;
                case 6 -> 42;
                case 15 -> 45;
                case 23 -> 115;
                case 31 -> 43;
                case 16 -> 247;
                case 8 -> 34;
                case 20 -> 149;
                case 12 -> 203;
                case 27 -> 226;
                case 17 -> 18;
                case 24 -> 79;
                case 11 -> 178;
                case 26 -> 107;
                case 13 -> 216;
                case 14 -> 106;
                case 5 -> 58;
                case 29 -> 20;
                case 25 -> 71;
                case 21 -> 91;
                default -> 52;
                case 28 -> 102;
                case 19 -> 225;
                case 1 -> 38;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

