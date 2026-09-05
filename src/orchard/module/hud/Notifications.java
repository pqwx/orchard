/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIlIlIIl
 * Module         : Notifications  [HUD]
 * Description    : Displays toggle and client notifications.   (client's own text)
 *
 * Recovered strings in this class:
 *   - ) && !string.endsWith(
 *   - Unexpected value: 
 *   - Time on Screen
 *   - Toggle Sound
 *   - Show Toggle
 *   - Only Title
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
 *  net.minecraft.client.font.TextRenderer
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.math.MathHelper
 */
package orchard.module.hud;

import java.awt.Color;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIlIIIl;
import orchard.internal.IIIlI;
import orchard.internal.IIIlIIllI;
import orchard.internal.IIIllIII;
import orchard.internal.IIlIIIll;
import orchard.internal.IIllIIlII;
import orchard.internal.IIlllIIIl;
import orchard.internal.IlIIIIll;
import orchard.internal.IlIIlll;
import orchard.internal.IlIIlllll;
import orchard.internal.IlIlIlIII;
import orchard.internal.lIIIlIII;
import orchard.internal.lIlIIlI;
import orchard.internal.llIll;
import orchard.internal.llIlllIl;

@Environment(value=EnvType.CLIENT)
public final class Notifications
extends ModuleBase {
    private final IIIIIIIIl<IIlIIIll> I = this.IIlllIl(new IIIIIIIIl<IIlIIIll>(StringFactory.IIII("Mode"), IIlIIIll.class, IIlIIIll.l));
    private final Map<Long, Double> l;
    private static final float II = 1000.0f;
    private static final double Il = 0.9;
    private static final IIIllIII lI;
    private final llIll ll;
    private static final Identifier III;
    private static final Identifier IIl;
    private final llIll IlI;
    private final llIll Ill = this.IIlllIl(new llIll((Object)StringFactory.IIII("Only Title"), false));
    private static final Identifier lII;
    private final lIlIIlI lIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Time on Screen"), 2.0, 1.0, 10.0, 0.5).IIIl("s"));
    private static String[] llI;
    private long lll;
    private static final double IIII = 0.28;
    private static final double IIIl = 1.14;
    private static final int[] IIlI;
    private static final String[] IIll;
    private static final Object[] IlII;

    public IIlIIIll I() {
        return (IIlIIIll)((Object)this.I.lIl());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lI(DrawContext drawContext, MinecraftClient minecraftClient, List<IIIIlIIIl> list) {
        IIIlIIllI.IlIll(drawContext);
        IIIlIIllI.Illll(drawContext, 0.0, 0.0, 1000.0);
        IIlIIIll iIlIIIll = (IIlIIIll)((Object)this.I.lIl());
        if (iIlIIIll == IIlIIIll.I) {
            return;
        }
        long l3 = System.currentTimeMillis();
        double d = this.IIlll(l3);
        double d2 = 0.0;
        int n = minecraftClient.getWindow().getScaledWidth();
        int n2 = minecraftClient.getWindow().getScaledHeight();
        HashSet<Long> hashSet = new HashSet<Long>();
        try {
            for (IIIIlIIIl iIIIlIIIl : list) {
                double d3 = this.lIIl(iIIIlIIIl, l3, iIlIIIll.Il());
                if (d3 <= 0.01) continue;
                long l4 = this.IIl(iIIIlIIIl);
                hashSet.add(l4);
                IlIIlll ilIIlll = this.Illll(minecraftClient.textRenderer, iIIIlIIIl, iIlIIIll, n);
                double d4 = this.IllII(iIIIlIIIl, l3, iIlIIIll.Il());
                double d5 = (double)n2 - (d2 + 18.0 + ilIIlll.l());
                double d6 = this.IlIII(l4, d5, d3, d);
                double d7 = this.IIII(iIIIlIIIl, l3, iIlIIIll.Il());
                switch (iIlIIIll.ordinal()) {
                    case 0: {
                        double d8 = (double)n - ilIIlll.I() - 5.0 + (1.0 - d4) * 34.0;
                        this.IIllI(drawContext, d8, d6, ilIIlll, d7, () -> IIIlI.lllIII(true, () -> this.IlllI(drawContext, minecraftClient.textRenderer, iIIIlIIIl, ilIIlll, d8, d6, d3)));
                        break;
                    }
                    case 1: {
                        double d8 = (double)n - ilIIlll.I() - 5.0 + (1.0 - d4) * 20.0;
                        this.IIllI(drawContext, d8, d6, ilIIlll, d7, () -> IIIlI.lllIII(true, () -> this.llI(drawContext, minecraftClient.textRenderer, iIIIlIIIl, ilIIlll, d8, d6, d3)));
                        break;
                    }
                    default: {
                        String string = String.valueOf((Object)iIlIIIll);
                        String string2 = "Unexpected value: ";
                        throw new IllegalStateException(string2 + string);
                    }
                }
                d2 += ilIIlll.l() + iIlIIIll.ll();
            }
            this.l.keySet().removeIf(l2 -> {
                if (hashSet.contains(l2)) return false;
                return true;
            });
        }
        finally {
            IIIlIIllI.lllI(drawContext);
        }
    }

    @Override
    public void llll() {
        IIlllIIIl.ll().IIl();
        this.l.clear();
        this.lll = 0L;
    }

    public Notifications(IlIlIlIII ilIlIlIII) {
        super(StringFactory.IIII("Notifications"), Category.I, StringFactory.IIII("Displays toggle and client notifications."));
        this.ll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Show Toggle"), true));
        this.IlI = this.IIlllIl(new llIll((Object)StringFactory.IIII("Toggle Sound"), true));
        this.l = new HashMap<Long, Double>();
        this.Ill.lIII(() -> {
            if (this.I.lIl() != IIlIIIll.l) return false;
            return true;
        });
        this.ll.lIII(() -> this.I.lIl() != IIlIIIll.I);
        this.IIlIIll(true);
    }

    private long IIl(IIIIlIIIl iIIIlIIIl) {
        return iIIIlIIIl.IIl();
    }

    private double IlI(IIIIlIIIl iIIIlIIIl, long l2, long l3) {
        return this.IIIlI((double)(iIIIlIIIl.I() - l2) / (double)l3);
    }

    private double lII(TextRenderer textRenderer, String string, double d) {
        return (double)IIIlI.IIIlll(textRenderer, string == null ? "" : string) * d;
    }

    public long lIl() {
        return Math.max(250L, Math.round((Double)this.lIl.lIl() * 1000.0));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llI(DrawContext drawContext, TextRenderer textRenderer, IIIIlIIIl iIIIlIIIl, IlIIlll ilIIlll, double d, double d2, double d3) {
        double d4 = ilIIlll.l() * d3 <= 6.0 ? 0.0 : ilIIlll.l() * d3;
        double d5 = d4;
        if (d5 <= 0.0) {
            return;
        }
        double d6 = d2 + ilIIlll.l() - d5;
        int n = lIIIlIII.II(0xFFFFFF, (int)Math.round(255.0 * Math.max(0.0, d3 - 0.5)));
        this.lll(drawContext, d, d6, ilIIlll.I(), d5, d3);
        if ((n >>> 24 & 0xFF) <= 0) return;
        IIIlI.llIlll(drawContext, textRenderer, this.IIlIl(iIIIlIIIl), d, d6, ilIIlll.I(), d5, n);
    }

    private void lll(DrawContext drawContext, double d, double d2, double d3, double d4, double d5) {
        IlIIIIll.IlI(drawContext, lI, d, d2, d3, d4, false, d5);
    }

    private double IIII(IIIIlIIIl iIIIlIIIl, long l2, long l3) {
        double d = this.IllII(iIIIlIIIl, l2, l3);
        double d2 = this.IlI(iIIIlIIIl, l2, l3);
        return (0.9 + 0.1 * d) * (0.96 + 0.04 * d2);
    }

    private static String IIlI(char[] cArray, long l2, int n) {
        int n2 = 0x7F7D0603 ^ n;
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

    private double IlII(double d) {
        return IIllIIlII.IIl(d);
    }

    private Identifier IllI(IIIIlIIIl iIIIlIIIl) {
        return switch (iIIIlIIIl.Ill()) {
            case IlIIlllll.l -> III;
            case IlIIlllll.Il -> IIl;
            default -> null;
        };
    }

    private double lIII(TextRenderer textRenderer, double d) {
        Objects.requireNonNull(textRenderer);
        return 9.0 * d;
    }

    private double lIIl(IIIIlIIIl iIIIlIIIl, long l2, long l3) {
        double d = this.IllII(iIIIlIIIl, l2, l3);
        double d2 = this.IlI(iIIIlIIIl, l2, l3);
        return Math.min(d, d2);
    }

    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.getWindow() != null) {
            if (minecraftClient.textRenderer != null) {
                ClientEntrypoint clientEntrypoint = ClientEntrypoint.lII();
                List<IIIIlIIIl> list = IIlllIIIl.ll().I();
                if (list.isEmpty()) {
                    return;
                }
                this.lI(drawContext, minecraftClient, list);
                return;
            }
        }
    }

    private void lIll(DrawContext drawContext, TextRenderer textRenderer, IIIIlIIIl iIIIlIIIl, double d, double d2, double d3, double d4) {
        Identifier identifier = this.IllI(iIIIlIIIl);
        int n = lIIIlIII.II(this.IIIIl(iIIIlIIIl).getRGB(), (int)Math.round(255.0 * d4));
        if (identifier != null) {
            IIIlI.lIllIl(drawContext, identifier, d, d2, d3, d3, n);
            return;
        }
        IIIlI.llIlll(drawContext, textRenderer, iIIIlIIIl.Ill().II(), d - 1.0, d2 - 1.0, d3 + 2.0, d3 + 2.0, n);
    }

    private double llII(IIIIlIIIl iIIIlIIIl, long l2) {
        return this.lIIlI((double)(iIIIlIIIl.I() - l2) / (double)Math.max(1L, iIIIlIIIl.II()));
    }

    public boolean lllI() {
        return (Boolean)this.IlI.lIl();
    }

    private static void IIIII() {
        Notifications.llI[0] = Notifications.IIlI("".toCharArray(), 79822L, -409465678);
        Notifications.llI[1] = Notifications.IIlI(Notifications.lIllI(-1937898178, 1747603932).toCharArray(), 61533L, -1551313294);
        Notifications.llI[2] = Notifications.IIlI(Notifications.lIllI(-1937898177, -557900970).toCharArray(), 14522L, 2033710411);
        Notifications.llI[3] = Notifications.IIlI(Notifications.lIllI(-1937898180, 316080146).toCharArray(), 4768L, -395736549);
        Notifications.llI[4] = Notifications.IIlI(Notifications.lIllI(-1937898179, 1939225746).toCharArray(), 14071L, -560395575);
        Notifications.llI[5] = Notifications.IIlI(Notifications.lIllI(-1937898182, 1665140758).toCharArray(), 90499L, 1090527194);
        Notifications.llI[6] = Notifications.IIlI(Notifications.lIllI(-1937898181, 1677201124).toCharArray(), 80635L, 1307011585);
        Notifications.llI[7] = Notifications.IIlI(Notifications.lIllI(-1937898184, 169439273).toCharArray(), 17758L, -802438571);
        Notifications.llI[8] = Notifications.IIlI(Notifications.lIllI(-1937898183, 1340224675).toCharArray(), 1681L, -492034739);
        Notifications.llI[9] = Notifications.IIlI(Notifications.lIllI(-1937898186, -1876656860).toCharArray(), 66000L, 1328332284);
        Notifications.llI[10] = Notifications.IIlI(Notifications.lIllI(-1937898185, -1618862355).toCharArray(), 72473L, 1213103570);
        Notifications.llI[11] = Notifications.IIlI(Notifications.lIllI(-1937898188, -607038295).toCharArray(), 31206L, 2117163512);
        Notifications.llI[12] = Notifications.IIlI(Notifications.lIllI(-1937898187, 1299204513).toCharArray(), 8594L, -1174426414);
        Notifications.llI[13] = Notifications.IIlI(Notifications.lIllI(-1937898190, -58453865).toCharArray(), 80666L, 1526746282);
        Notifications.llI[14] = Notifications.IIlI(Notifications.lIllI(-1937898189, 979256301).toCharArray(), 9198L, -1488585346);
        Notifications.llI[15] = Notifications.IIlI(Notifications.lIllI(-1937898192, -1997335560).toCharArray(), 78960L, -527062119);
        Notifications.llI[16] = Notifications.IIlI(Notifications.lIllI(-1937898191, -1796119125).toCharArray(), 90515L, 1492011269);
        Notifications.llI[17] = Notifications.IIlI(Notifications.lIllI(-1937898194, 1730240212).toCharArray(), 96959L, -1323167038);
    }

    private Color IIIIl(IIIIlIIIl iIIIlIIIl) {
        return iIIIlIIIl.Ill().Il();
    }

    private double IIIlI(double d) {
        return IIllIIlII.lI(d);
    }

    /*
     * Enabled aggressive block sorting
     */
    private String IIlIl(IIIIlIIIl iIIIlIIIl) {
        String string = iIIIlIIIl.lII();
        String string2 = iIIIlIIIl.III();
        if (string2 != null && !string2.isBlank()) {
            if (string == null) return string2;
            if (string.isBlank()) {
                return string2;
            }
        } else {
            if (string == null) {
                return "";
            }
            String string3 = string;
            return string3;
        }
        String string4 = string2;
        String string5 = !string.endsWith(".") && !string.endsWith("/") ? ". " : " ";
        String string6 = string;
        return string6 + string5 + string4;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IIllI(DrawContext drawContext, double d, double d2, IlIIlll ilIIlll, double d3, Runnable runnable) {
        double d4 = d + ilIIlll.I() * 0.5;
        double d5 = d2 + ilIIlll.l() * 0.5;
        IIIlIIllI.IlIll(drawContext);
        try {
            IIIlIIllI.Illl(drawContext, d4, d5);
            IIIlIIllI.IIlIl(drawContext, d3, d3);
            IIIlIIllI.Illl(drawContext, -d4, -d5);
            runnable.run();
        }
        finally {
            IIIlIIllI.lllI(drawContext);
        }
    }

    private double IIlll(long l2) {
        if (this.lll == 0L) {
            this.lll = l2;
            return 1.0;
        }
        long l3 = Math.max(1L, Math.min(80L, l2 - this.lll));
        this.lll = l2;
        return IIllIIlII.I(0.28, (double)l3 / 1000.0);
    }

    private double IlIII(long l2, double d, double d2, double d3) {
        double d4;
        Double d5 = this.l.get(l2);
        if (d5 == null) {
            d4 = 18.0 * (1.0 - d2);
            d5 = d + d4;
        }
        d4 = MathHelper.lerp((double)MathHelper.clamp((double)d3, (double)0.0, (double)1.0), (double)d5, (double)d);
        this.l.put(l2, d4);
        return d4;
    }

    public boolean IlIIl() {
        return (Boolean)this.ll.lIl();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient.player != null) {
            if (minecraftClient.world != null) {
                return;
            }
        }
        IIlllIIIl.ll().IIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIlI(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, int n, double d3) {
        if (string == null) return;
        if (string.isBlank()) {
            return;
        }
        if (!(Math.abs(d3 - 1.0) < 0.001)) {
            IIIlI.lIlIIl(drawContext);
            IIIlI.Ill(drawContext, d, d2);
            IIIlI.IIlll(drawContext, d3, d3);
            IIIlI.IlIIll(drawContext, textRenderer, string, 0.0, 0.0, n);
            IIIlI.IlIllI(drawContext);
            return;
        }
        IIIlI.IlIIll(drawContext, textRenderer, string, d, d2, n);
    }

    private double IllII(IIIIlIIIl iIIIlIIIl, long l2, long l3) {
        return this.IlII((double)(l2 - iIIIlIIIl.IlI()) / (double)l3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlllI(DrawContext drawContext, TextRenderer textRenderer, IIIIlIIIl iIIIlIIIl, IlIIlll ilIIlll, double d, double d2, double d3) {
        int n = llIlllIl.ll(IlIIIIll.II(250), d3);
        int n2 = llIlllIl.ll(IlIIIIll.IIll(210), d3);
        int n3 = llIlllIl.ll(IlIIIIll.II(250), d3);
        double d4 = d + 29.0;
        IlIIIIll.IlI(drawContext, lI, d, d2, ilIIlll.I(), ilIIlll.l(), false, d3);
        IIIlI.IIIlI(drawContext, lII, d + 10.0, d2 + (ilIIlll.l() - 12.0) * 0.5, 12.0, 12.0, n3);
        String string = iIIIlIIIl.III();
        if (!((Boolean)this.Ill.lIl()).booleanValue() && string != null && !string.isBlank()) {
            this.lIIIl(drawContext, textRenderer, iIIIlIIIl.lII(), d4, d2 + 4.0, ilIIlll.I() - 37.0, n);
            this.lIIIl(drawContext, textRenderer, iIIIlIIIl.III(), d4, d2 + 17.0, ilIIlll.I() - 37.0, n2);
            return;
        }
        double d5 = this.lIII(textRenderer, 1.14);
        double d6 = this.lII(textRenderer, iIIIlIIIl.lII(), 1.14);
        double d7 = Math.max(0.0, ilIIlll.I() - 37.0);
        double d8 = d4 + Math.max(0.0, (d7 - d6) * 0.5);
        double d9 = d2 + (ilIIlll.l() - d5) / 2.0;
        if (!(d6 > d7)) {
            this.IlIlI(drawContext, textRenderer, iIIIlIIIl.lII(), d8, d9, n, 1.14);
            return;
        }
        this.lIIIl(drawContext, textRenderer, iIIIlIIIl.lII(), d4, d9, d7, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIIlll Illll(TextRenderer textRenderer, IIIIlIIIl iIIIlIIIl, IIlIIIll iIlIIIll, int n) {
        IlIIlll ilIIlll;
        double d = this.lII(textRenderer, iIIIlIIIl.lII(), 1.14);
        double d2 = IIIlI.IIIlll(textRenderer, iIIIlIIIl.lII() == null ? "" : iIIIlIIIl.lII());
        double d3 = IIIlI.IIIlll(textRenderer, iIIIlIIIl.III() == null ? "" : iIIIlIIIl.III());
        double d4 = Math.max(136.0, (double)n - 12.0);
        switch (iIlIIIll.ordinal()) {
            default: {
                throw new MatchException(null, null);
            }
            case 2: {
                ilIIlll = new IlIIlll(0.0, 0.0);
                return ilIIlll;
            }
            case 1: {
                ilIIlll = new IlIIlll(Math.min(d4, (double)IIIlI.IIIlll(textRenderer, this.IIlIl(iIIIlIIIl)) + 8.0), 16.0);
                return ilIIlll;
            }
            case 0: 
        }
        if (!((Boolean)this.Ill.lIl()).booleanValue()) {
            ilIIlll = new IlIIlll(Math.max(136.0, Math.min(d4, Math.max(d2, d3) + 37.0)), 30.0);
            return ilIIlll;
        }
        ilIIlll = new IlIIlll(Math.max(118.0, Math.min(d4, d + 37.0)), 30.0);
        return ilIIlll;
    }

    private void lIIIl(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, double d3, int n) {
        if (string == null || string.isBlank() || d3 <= 0.0) {
            return;
        }
        IIIlI.IlIIll(drawContext, textRenderer, IIIlI.llIIIl(textRenderer, string, d3), d, d2, n);
    }

    private double lIIlI(double d) {
        return Math.max(0.0, Math.min(1.0, d));
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 8453;
        String string = "\u56c4\u1781\u3737\u50bf\ua262\u0ae8\u08f7\u63b6\u993b\ucbbe\uefbf\uff7a\u6f6b\u36b2\u0553\u027f\ubf79\u1d92\u308d\u80ae\u10b5\u996e\u300d\u066c\u7f61\u76e4\u1d68\u9b26\u9d06\u0889\ue45b\uaeb9\u3f4e\u045e\udec0\ue9d6\u2b2c\u8996\u812d\u72d8\u2be4\ude49\u20d1\u6495\u857d\uc5db\u040c\u9dc5\u3079\ufb8a\u8be0\u308f\u5c8e\uebec\uda07\u6f5c\u8ed7\uf1f4\u7df5\u1c68\u3a35\u6c3f\u481a\u8438\ubcae\uae96\ueadf\u70bf\u7198\u8bef\u0a07\ub746\ue052\u2f8d\ue45f\u8c46\ub673\uaf70\u54f0\u4608\u9ed8\u5171\u6ebb\u44ec\ubda6\u1e96\u05fe\ufa4d\ueb8f\ua8ab\u4794\ua638\u0f66\u4ba6\ua4e5\ube38\u0cbf\u8e30\u2448\ubc28\u6a56\u01e8\u20ac\u58f1\ueb29\u8c47\uf726\uf65d\uaae8\u2be8\uc027\ue16a\ue344\ub92e\u36f1\uc323\ud687\u58d2\u4ee8\u17c7\u6ab8\u8f32\u44c1\uc994\ufb48\u02cc\uab46\ud577\udda0\u5493\u488e\u2834\u8e41\u0956\u07e3\u854b\u6911\ue3c7\u82bb\u13e0\u3b35\u2469\u8f94\u81c7\udca3\u141f\u1042\u6843\uc600\ub049\ue730\u4fa5\u19e4\uac3d\u8298\u9304\uf6b0\ue3ef\u39b5\u9f2b\ude57\u1040\u7249\u52cc\u8c80\u4c1d\ud0e7\ue55c\u9eb6\ua206\uf17a\uf15c\u2728\u3daf\u27e4\ue3bd\ua923\ub49c\udcac\ufafe\u3e24\u28f5\u5749\uc2ca\ub80a\u41a9\ud9dc\u9d3a\u6cf6\u3837\u7617\ue2fe\u8969\u04d4\u6352\u9d03\uc586\u0199\u48e9\ub36f\uf4a0\u6b86\uf18a\u3bdc\u355c\u4303\uef80\u90fa\u0ad7\u6215\ubb32\ub452\u0454\ue443\u3b09\ud57b\ufd78\uf10c\ue3bd\u5454\u48ca\u20f5\u963e\u5aaa\ua600\ub8cf\ud195\ub8a6\u0160\ud982\u41c1\u92ea\u0cdc\u12c5\uf84d\u4c64\u3bfd\ue5b8\u653d\u4bdd\u5255\u6a4d\u0faa\u0671\ud4df\u27d7\u327e\u1530\u6887\u4e7f\u0539\u74f0\ud101\u8f13\u5c6a\u1e69\u0192\u645e\ua71b\u33a2\u5d87\u36c8\u30aa\u303f\u76e8\u28be\u6d45\ub1e0\ube87\udda7\u8c5a\u6c46\ubddd\u89b5\ud4a0\uf5c6\ufb20\uf195\u60db\u685e\ueb1e\u4083\u9060\ub7fa\uf085\ufef8\u87fb\u73e9\ua8e0\u0e63\u82bb\u00b0\uaabd\uae5f\u1f89\u3a00\u5375\u9241\ua18f\u2be9\u759b\u291e\u912f\u5b86\u1d19\u22e5\ub4c1\u8bfc\udbd2\ua25d\ucd47\u1b1c\u09f4\uafd2\ucd93\uee9c\u584e\u4197\u60cf\u5918\u29ba\u20b0\uea9c\u6397\uc74f\u745d\u4729\u602b";
        char[] cArray = "\u2101\u2101\u2101\u2101\u211d\u2115\u2101\u2115\u213d\u2111\u210d\u2115\u2111\u210d\u212d\u2129\u212d".toCharArray();
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
        IIll = stringArray;
        IlII = new Object[stringArray.length];
        int n6 = 2082723431;
        byte[] byArray = "^\u0000\u00d9\n\u0016\u0004.g\u00b9\u008ca\u00cet\u00f8\u008bq6\u000e\u00e2\u007f\u0080|\u00bb\u00a5\u0090\u00bc>x\u00f9k[\u000f7\u00ac7a\u000e\u00b1}9n\u00acj\u00cbk\u00ae\u00bfa~\b'2._n_FQrk\u00f9\u00df\u0086\u00b5\u0014Q!\\\u00d6\te\u00d3a\u009a\u0010\r\u0097\u0098\u00a0\u009e\u00a2^\u0007,m\u001d\u00fe\u0014-\u001e\u00f4\u0011{wA\u00d6\u00d32h~\u00e8m\u00b7\u007f\u00c3\u0015\u0087}\b \u00c1\u00cdl\u0087I%\b\u0017a\u00a6\u00a4\u00fc\u0088\u0019\u00c2\u009f\u0095b\u00c7w\u0011\u0002\u00f0Q\u0085\u0091Q\u001a\u00e4E]\u00ed\u00e6|\u00cc\u00a0\u00efH\u00fe\u00cc\u0014\u00c2\u0091\u0087\u00ef\u00bc\u00c0\u00ec\u0084\u008f\u00bd\u00ab\u00b2;\u00be*K\u00af\u00c9\np\u0082\u00dbn\u0082\u00f7|\u00a6%\u00b1\u00eb\u00a9\u00c8\u00f8\u008b+\u008dX`%\u0084!\u009cG\u00de\u00c2\u00f4\r\u00d0\u001d\u00ad\u0099\u0014\u00c9\u0084\u0019\u008cz\u00c26h\u00c0".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IIlI = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            Notifications.IIlI[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        llI = new String[18];
        Notifications.IIIII();
        lI = IIIllIII.l;
        III = Identifier.of((String)"cats", (String)"textures/w6t2c8/icon_check.png");
        IIl = Identifier.of((String)"cats", (String)"textures/w6t2c8/icon_close.png");
        lII = Identifier.of((String)"cats", (String)"textures/k3p9x1/3grhefooyyue.png");
    }

    private void lIlII(DrawContext drawContext, TextRenderer textRenderer, IIIIlIIIl iIIIlIIIl, IlIIlll ilIIlll, double d, double d2, long l2, boolean bl) {
        Color color = this.IIIIl(iIIIlIIIl);
        int n = color.getRGB();
        double d3 = 12.0;
        double d4 = d + 3.0;
        double d5 = d2 + (ilIIlll.l() - d3) / 2.0;
        double d6 = d + 18.0;
        double d7 = ilIIlll.I() * this.llII(iIIIlIIIl, l2);
        double d8 = d + ilIIlll.I() - d7;
        IlIIIIll.l(drawContext, lI, d, d2, ilIIlll.I(), ilIIlll.l(), false);
        this.lIll(drawContext, textRenderer, iIIIlIIIl, d4, d5, d3, 1.0);
        double d9 = d2 + 3.0;
        double d10 = d2 + ilIIlll.l() - 3.0 - this.lIII(textRenderer, 0.9);
        this.IlIlI(drawContext, textRenderer, iIIIlIIIl.lII(), d6, d9, -1, 1.14);
        this.IlIlI(drawContext, textRenderer, iIIIlIIIl.III(), d6, d10, -1, 0.9);
        if (!bl) {
            IIIlI.lIIlll(drawContext, d8, d2 + ilIIlll.l() - 1.0, d + ilIIlll.I(), d2 + ilIIlll.l(), n);
        } else {
            IIIlI.Illl(drawContext, d8, d2 + ilIIlll.l() - 1.0, d7, 1.0, 1.0, n);
        }
    }

    private static int lIlIl(int n, int n2) {
        return IIlI[n ^ 0xD0363BE9] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIllI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x8C7E053E;
        char[] cArray = IIll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IlII[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Notifications.IlII[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6E995867;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 31 -> 193;
                case 25 -> 132;
                case 6 -> 186;
                default -> 12;
                case 22 -> 234;
                case 7 -> 125;
                case 18 -> 169;
                case 5 -> 159;
                case 11 -> 3;
                case 21 -> 102;
                case 14 -> 145;
                case 15 -> 75;
                case 16 -> 203;
                case 8 -> 99;
                case 2 -> 18;
                case 20 -> 234;
                case 29 -> 16;
                case 17 -> 206;
                case 12 -> 129;
                case 30 -> 234;
                case 13 -> 87;
                case 28 -> 216;
                case 27 -> 246;
                case 4 -> 84;
                case 23 -> 143;
                case 26 -> 184;
                case 10 -> 22;
                case 3 -> 26;
                case 9 -> 115;
                case 24 -> 229;
                case 1 -> 234;
                case 19 -> 156;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

