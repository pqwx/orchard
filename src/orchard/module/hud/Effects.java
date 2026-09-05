/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIllIIl
 * Module         : Effects  [HUD]
 * Description    : Displays your active potion effects   (client's own text)
 *
 * Recovered strings in this class:
 *   - ), 200.0, 0.0, 4000.0, 1.0).IIIl(
 *   - ), 6.0, 0.0, 4000.0, 1.0).IIIl(
 *   - Decompilation failed
 *   - Color By Category
 *   - Show Amplifier
 *   - Pulse Expiring
 *   - Row Height
 *   - Text Color
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
 *  net.minecraft.entity.effect.StatusEffect
 *  net.minecraft.entity.effect.StatusEffectInstance
 *  net.minecraft.entity.effect.StatusEffectUtil
 *  net.minecraft.registry.Registries
 *  net.minecraft.registry.entry.RegistryEntry
 *  net.minecraft.text.Text
 *  net.minecraft.util.Formatting
 *  net.minecraft.util.Identifier
 */
package orchard.module.hud;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffectUtil;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.IIIlI;
import orchard.internal.IIIllIII;
import orchard.internal.IIllIIlII;
import orchard.internal.IlIIIIll;
import orchard.internal.lIlIIIlI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIIlIlI;
import orchard.internal.llIlIlII;
import orchard.internal.llIll;
import orchard.internal.llIlllIl;
import orchard.internal.lllIlIII;

@Environment(value=EnvType.CLIENT)
public final class Effects
extends ModuleBase
implements lllIlIII {
    private final lIlIIlI I;
    private final llIll l;
    private static final double II = 0.78;
    private static final double Il = 2.3;
    private static String[] lI;
    private long ll;
    private static final double III = 138.0;
    private static final double IIl = 0.9;
    private static final double IlI = 6.0;
    private final lIlIIlI Ill;
    private final Map<String, llIIlIlI> lII;
    private final llIll lIl;
    private double llI = 32.0;
    private final llIll lll;
    private double IIII = 138.0;
    private static final double IIIl = 7.0;
    private static final double IIlI = 5.8;
    private static final double IIll = 5.0;
    private static final int IlII = 96;
    private final llIlIlII IlIl;
    private final lIlIIlI IllI;
    private static final IIIllIII Illl;
    private final lIlIIlI lIII;
    private final lIlIIlI lIIl;
    private static final double lIlI = 0.18;
    private final llIll lIll;
    private final lIlIIlI llII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("X"), 6.0, 0.0, 4000.0, 1.0).IIIl("px"));
    private static final double llIl = 200.0;
    private static final int[] lllI;
    private static final String[] llll;
    private static final Object[] IIIII;

    private static String I(char[] cArray, long l2, int n) {
        int n2 = 0x37361780 ^ n;
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
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void l(DrawContext drawContext, TextRenderer textRenderer, String string, double d, double d2, int n, double d3) {
        IIIlI.lIlIIl(drawContext);
        try {
            IIIlI.Ill(drawContext, d, d2);
            IIIlI.IIlll(drawContext, d3, d3);
            IIIlI.IlIIll(drawContext, textRenderer, string, 0.0, 0.0, n);
        }
        finally {
            IIIlI.IlIllI(drawContext);
        }
    }

    @Override
    public double III() {
        return this.IIII * this.IIIII();
    }

    public Effects() {
        super(StringFactory.IIII("Effects"), Category.I, StringFactory.IIII("Displays your active potion effects"), true);
        this.Ill = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Y"), 200.0, 0.0, 4000.0, 1.0).IIIl("px"));
        this.I = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Scale"), 100.0, 60.0, 180.0, 5.0).IIIl("%"));
        this.lIIl = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Row Height"), 32.0, 20.0, 46.0, 1.0).IIIl("px"));
        this.lIII = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Spacing"), 4.0, 0.0, 12.0, 1.0).IIIl("px"));
        this.IllI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Padding"), 10.0, 4.0, 18.0, 1.0).IIIl("px"));
        this.l = this.IIlllIl(new llIll((Object)StringFactory.IIII("Show Amplifier"), true));
        this.lll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Show Time"), true));
        this.lIll = this.IIlllIl(new llIll((Object)StringFactory.IIII("Color By Category"), false));
        this.lIl = this.IIlllIl(new llIll((Object)StringFactory.IIII("Pulse Expiring"), false));
        this.IlIl = this.IIlllIl(new llIlIlII((Object)StringFactory.IIII("Text Color"), new Color(215, 222, 232, 255)));
        this.lII = new HashMap<String, llIIlIlI>();
    }

    private void lI(DrawContext drawContext, double d, double d2, double d3, double d4, double d5, int n, int n2) {
        double d6 = IIllIIlII.II(d5);
        IIIlI.IlIlll(drawContext, d, d2, d3, d4, n2);
        if (d6 <= 0.001) {
            return;
        }
        IIIlI.IllIl(drawContext, d, d2, d3, d4, d6, n);
    }

    @Override
    public void lllI(double d, double d2) {
        this.llII.lI(Math.max(0.0, d));
        this.Ill.lI(Math.max(0.0, d2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIl(long l2) {
        if (this.ll <= 0L) {
            this.ll = l2;
            return 0.016666666666666666;
        }
        double d = Math.max(0.0, Math.min(0.12, (double)(l2 - this.ll) / 1000.0));
        this.ll = l2;
        if (d <= 0.0) return 0.016666666666666666;
        double d2 = d;
        return d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private List<llIIlIlI> IlI(double d) {
        ArrayList<llIIlIlI> arrayList = new ArrayList<llIIlIlI>();
        Iterator<Map.Entry<String, llIIlIlI>> iterator = this.lII.entrySet().iterator();
        while (iterator.hasNext()) {
            llIIlIlI llIIlIlI2 = iterator.next().getValue();
            double d2 = llIIlIlI2.ll ? 1.0 : 0.0;
            double d3 = llIIlIlI2.ll ? 0.24 : 0.18;
            llIIlIlI2.Il = IIllIIlII.III(llIIlIlI2.Il, d2, d3, d);
            if (llIIlIlI2.ll || !(llIIlIlI2.Il <= 0.015)) {
                if (llIIlIlI2.I == null || !(llIIlIlI2.Il > 0.015)) continue;
            } else {
                iterator.remove();
                continue;
            }
            arrayList.add(llIIlIlI2);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIlIIIlI lII(TextRenderer textRenderer) {
        String string = "Speed II";
        String string2 = "1:20";
        int n = Formatting.AQUA.getColorValue() == null ? -11141121 : 0xFF000000 | Formatting.AQUA.getColorValue();
        double d = (double)textRenderer.getWidth(string) * 0.9;
        double d2 = textRenderer.getWidth(string2);
        lIlIIIlI lIlIIIlI2 = new lIlIIIlI(string, string2, n, false, 0.6, d, d2, 0.72, 2340);
        lIlIIIlI2.ll = this.IllI() + 11.6 + 5.0 + d + 7.0 + d2 * 0.78 + this.IllI() + 4.0;
        return lIlIIIlI2;
    }

    @Override
    public double IIll() {
        return this.llI * this.IIIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIl(StatusEffectInstance statusEffectInstance) {
        StatusEffect statusEffect = (StatusEffect)statusEffectInstance.getEffectType().value();
        Identifier identifier = Registries.STATUS_EFFECT.getId((Object)statusEffect);
        String string = identifier == null ? statusEffect.getTranslationKey() : identifier.toString();
        int n = statusEffectInstance.getAmplifier();
        String string2 = " ";
        String string3 = string;
        return string3 + string2 + n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private lIlIIIlI llI(MinecraftClient minecraftClient, TextRenderer textRenderer, StatusEffectInstance statusEffectInstance, int n) {
        RegistryEntry registryEntry = statusEffectInstance.getEffectType();
        StatusEffect statusEffect = (StatusEffect)registryEntry.value();
        String string = Text.translatable((String)statusEffect.getTranslationKey()).getString();
        int n2 = statusEffectInstance.getAmplifier();
        if (((Boolean)this.l.lIl()).booleanValue() && n2 > 0) {
            String string2 = Effects.IIlI(n2 + 1);
            String string3 = " ";
            String string4 = string;
            string = string4 + string3 + string2;
        }
        String string5 = (Boolean)this.lll.lIl() != false ? Effects.lIlI(statusEffectInstance, minecraftClient) : "";
        int n3 = this.lIIl(statusEffect);
        int n4 = statusEffectInstance.isInfinite() ? Integer.MAX_VALUE : Math.max(0, statusEffectInstance.getDuration());
        boolean bl = !statusEffectInstance.isInfinite() && n4 <= 200;
        double d = statusEffectInstance.isInfinite() ? 1.0 : IIllIIlII.II((double)n4 / (double)Math.max(1, n));
        double d2 = (double)textRenderer.getWidth(string) * 0.9;
        double d3 = string5.isEmpty() ? 0.0 : (double)textRenderer.getWidth(string5);
        double d4 = (double)Math.abs(statusEffect.getTranslationKey().hashCode() % 1000) / 90.0;
        lIlIIIlI lIlIIIlI2 = new lIlIIIlI(string, string5, n3, bl, d4, d2, d3, d, n4);
        lIlIIIlI2.ll = this.IllI() + 11.6 + 5.0 + d2 + (string5.isEmpty() ? 0.0 : 7.0 + d3 * 0.78) + this.IllI() + 4.0;
        return lIlIIIlI2;
    }

    @Override
    public void llII(DrawContext drawContext, int n, int n2, float f, boolean bl) {
        this.llIl(drawContext, true, bl);
    }

    /*
     * Recovered potentially malformed switches.  Disable with '--allowmalformedswitch false'
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    static {
        var6 = 15220;
        var7_2 = "\ueb8e\u1252\u7fcb\u4e09\u0370\u23d1\u34fa\ua08b\u593c\uf87d\u1b6e\u3c9e\ua530\uf1ac\u6b7d\ucd0d\u62f9\u3314\u49e9\u509d\u9098\uacda\u9d3a\u5ee6\uf8cc\uc23f\u6842\u634b\u9a90\uf2c2\u0e44\u7c1c\u6579\u73e8\u5a81\u8227\u817a\u73a3\u1420\u0981\u60b7\u1a71\u98ec\u4904\u69d7\u86bd\ue5c3\u21cb\uc135\u581c\u9d77\u247e\u70d7\u3811\u3ff0\ud729\uc84c\u7f72\u7612\ue3e4\ufdff\u40c1\u92c4\u5570\u41f2\u2e31\u2012\uc94b\u473b\u02cf\u2d6c\u83a8\uc666\u95c3\ue678\u1efc\ub09a\ubb5d\u988c\u5265\u7d5b\ue946\u551f\uf1f6\uf201\u12a1\uf0fb\u418e\u3f75Y\u3714\u3fe4\u90d1\u104e\ud79d\u89cf\u6dbd\u02de\ue56c\u0602\u93bc\u8ae3\u582f\u8351\u065a\ua010\u15e7\uc87a\u7c9d\u7495\u7ebe\u7fd9\ua650\ubd5a\uc2f6\u93de\ue576\u0567\uda87\ud651\u6beb\u4b98\ud6e1\u8b99\ubaee\u479b\u9377\u2fac\uf99f\uc854\u1901\u6afa\udcb4\u215d\u71e3\u2e14\ufd31\ue60a\u7e9f\u337c\u55cc\u5471\uf2fb\u3c18\u3d32\u6ce4\uf001\ue355\u5fb0\udbdc\ua0f9\uc2cd\uf934\ud176\u5303\u92bf\ude80\uf50e\u88a8\u034d\u5047\ud6be\ufc7a\ub91c\ufbb5\u599c\u04d2\ufbd7\uf02e\u2471\u0903\u47a9\ud7f8\u207d\u4297\ued9c\ube0c\u0759\u55ee\u5a98\u00eb\u16f3\uba7b\u3893\u3d51\u2433\uee4b\u2b2f\u8086\u696f\u3711\uedbf\u6fe0\u6ae5\u3c48\u622a\u3925\ucd96\ub253\u5e1f\uc6d4\u9628\ufeb3\u22f1\u5999\u6900\ubecb\u9df0\u62f7\u67b5\u6251\u26a6\u20de\u24bf\ud2e4\ue305\ufa89\uf641\u9dee\u0a1b\ub608\u6ee8\u4efb\u3f76\uc249\ufc7a\u2391\ua481\ub682\u7824\ub339\ub09e\u67d0\u1a10\u20ef\u88a2\u50d8\ufe58\u40c8\u058f\u4217\u4e86\ue002\u3db7\u6849\u8f30\u2c09\u0e62\udbed\ud9fa\u4a65\ua814\ub592\u197f\u6342\u06cb\uad24\u4449\u10aa\u7e96\ufe78\u370f\u22eb\u26ae\ud246\u8bef\u12fd\u803a\ue88f\uf565\ub5ef\uf386\u32f2\ub778\u1c32\u1cc8\ueb40\u2ef8\u3072\u3ec4\u4dc3\ud95b\u7dee\u6fee\ubbc9\u47af\u2762\u7752\ub667\ud56f\uc848\u9039\u85d6\u274d\u5a49\u9428\ub360\u7edd\uebc1\ucd6a\ubb16\u0425\uf890\uccf9\ue7bc\u5f22\u00b8\u3eff\ud0e1\u09a6\ud6d7\u4c69\u2a60\u1005\u2762\u12d2\u05c8\uf18d\uacf8\u2edc\u910c\uabf0\u5d93\u6da9\u6efc\u9275\ua531\uf897\u2eed\u78e1\uec2c\u1553\ue1b9\u7cbc\ua32f\u2e33\ud259\u8511\ua4fb\u38bb\ub0bb\u6f84\ud2f0\u80a9\u81b9\u3400\u2902\ub6ac\ubcb7\u11d2\u6da3\uc571\ub8ed\u8ee0\u27f8\uc38e\u038c\u2414\ucab3\uc413\u9488\u6a59\ubc19\u34a0\u1591\ubb23\u823c\u51a1\uc401\ue77b\u300b\u61b9\uba0d\u51fb\u978e\ufe72\u975c\u2bf6\uf842\u0e14\uff36\u2ee5\u6629\u7acc\u56b0\ud7d9\ucf27\u31e8\u943d\ufc69\ud2ee\u5a92\u96a3\u5950\u2f1e\u471e\u799b\uf1d1\ufa3d\uaa76\u9537\u67c9\u19a1\u8732\u7587\uf556\u683e\u9e5e\u51cf\u4ddc\u19d3\ubb1c\ue67a\u5e76\ubd63\uc0c7\ub413\ud16e\u2086\u1f8d\u9fba\u5493\u4c7e\ucaec\u73b0\u5617\ue865\uc816\u0351\ue794\uc57c\u714d\ufa80\u1bfd\ua982\ube69\u62d5\ufcbc\u3620\u9144\u6c90\ucbe8\u5235\u1d3f\ud251\u233e\uc134\uedb2\uc951\u4e57\u7020\u3f09\u51b0\ub096\u475e\u5212\u17bd\u8a88\u065a\uf79a\u81a1\udf25\u326b\u4de8\ue2eb\u7986\uea2a\ub0af\ub663\u3a87\u7b44\u6b23\ufc6d\ub7e9\uf215\u8572\uf91c\u4c95\uae81\u48ee\u52f8\ud34f\u7063\uadce\udec1\ud0ac\u01d7\u7196\ue54e\ucb17\u30c6\u3cf7\uaf15\u6fa0\u71fd\u7488\u4e50\u9068\u1037\u2865\ud2b3\ue98f\uf24c\uf82c\u0d58\u3106\ued3e\u6526\ub095\u1753\u2c95\u1b8c\uee57\u6738\udd75\ubda1\udb41\u36dc\u738c\ua56e\u48a5\ufcf8\ua5c2\u49a3\u06e7\u8f2b\u019f\u9956\u231f\uf031\u40d0\u8f00\uc186\u2855\u0dc2\ub77a\u61f5\u6bc3\u36bd\u3cbf\uf45c\u8edd\ua2dc\ue5cc\u0bd4\u85a7\u3f9d\ufa3c\u4809\u56f1\u31db\u67ba\ue409\uae33\ub67c\ufe00\u3d92\u9041\ue703\u1a91\ua30c\ue3d1\u1e72\uc84f\uac15\u5645\u0aeb\u5fe4\u9803\u1cef\uf59f\ue53c\u43df\u9989\u6ebe\udfc2\u9549\udf81\u946a\u91a2\u6b94\u37445\u4671\ub7d7\u0b01\u030e\ue321\u717a\u17c5\uc77e\uc37f\u4caf\u2d63\u854a\u007f\u759b\uf757\u75ef\u0cb5\u1fa4\u72e3\u3d6d\u94ac\u3d3a";
        var8_3 = "\b\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\u0004\b\u0004\f\u0004\f0\u0014\u0010\u0014\f\u0004\b\f\u0004\u0010\f\u0004\u0018\f\b\u000e\b\u0005\f\b\u0004\u000e\u0006\n\n\u0007\f\u0013\n\b\u0006\n\n\f\u0006\u000f\b\f\u000e\u000f\f\t\u0006\u0005\b\u0006".toCharArray();
        var9_4 = new String[var8_3.length];
        var13_8 = -1;
        ** GOTO lbl46
lbl7:
        // 2 sources

        while (true) {
            var12_7 = var8_3[var10_5];
            var14_9 = var7_2.substring(var11_6, var11_6 + var12_7).toCharArray();
            var15_10 = 0;
            if (true) ** GOTO lbl28
            break;
        }
lbl12:
        // 1 sources

        while (true) {
            if (var13_8 != 0) ** GOTO lbl7
            Effects.llll = var9_4;
            Effects.IIIII = new Object[var9_4.length];
            var2_11 = -56147315;
            var0_12 = "\u007f\u00c4h\u0001\u001f\u00b6G\\U\u00a6\u00ebIq\u00b6eYU\u001f\u00a9\u00b7\u0015\u00d1\u00c5Bkp\u0006k\u0096\u00f9\u00ef\u00f1\u0085\f.\u00ffB\"\u009c\u0010\u0094\u00bdK~\u00f3Z/\u0083\u00c8\u00dc>\u00cf8\u00da\u00ff\u00b9\u00de\u00fa\u00ae\u00029\u0018\u00a9eI\u00d9\u0001\u0004\u00efp\"\u00b6\"PL\u009d\u0082~\u00bc\u00e4\u00c3U\u00ddW\u0099P^\u00ca\u00b3]\u00ec\u00c0c\u00cd\u00b3mZ\u0016g\u00ca;\u00f6\u0094\u0012n As|\u009b\f\u00a1\u0014o/\u00c8\u00d4\u00d1^\u00ac\u00da\u00bb\u00c4\u00bd\u000b\u00ef\u00cff`\u00b2\u00d21\u00e7\u00acS\u009a\u0099@\u00ed \u0087\u00dc1U\u00c1hv\u00aa1t\u00d3\u00c2\u0092\u00ffG\u00bd\u00cdMi\u00caUq\u0007\u00b0\u00d1\u00e3\u00a9\u00f0S<^\u008c\u00f1\u00b3\u00c9\nv\u00ab\u00ae\u0080)\u00cf\u00c2Pf\u0017\"}\u00c4\u00d8\u00e0\u00b7~w\u00c3\u0091m@\u0093Z\u00cd\u00c2\u00ef\u00eb\u00d6\u00fc\u001d\u0000\u00f0\u0007\t\u00c5\u00c0\u00b6\u00cd\u00ea\u00c4\u00be\u00d3\u0084\u00e7\u0015\u00ed\rZH-\u00ff8\u00b6<a\u00b0\u00fbV\u00060\u00be,U>\u00de\u0081\u00bc\u00b3\u00f6\f\u001d\u00c5\u0089\u00b8\u00b8$\u00b7\u0015uE\u00d5\u00da\u0013m3\u00f9\u000b\u0087l\u00c4\u00fc\u00baK\u0093\u0006\u00eb\u00a1\u007f\u0099\u00ce~'\u00eam\u00f0\u00e8\u00eb\u00ae\u0013JN\u00a8_\u00ce5\u00a1\u00c1g\u00cbJ\r\u00d6\u0004\u0091\u008a\u00d1P2\u00cc\u00f8\u00c09C\u0011D\u00ec~]\u00fc\u0086\u00e3\u0000\u0016S\u00fcB\u00e1\u00ff\u008c\u0018)\u009e\u00c5\t5-\u0083\u00dd\u00baa\u00bf\u0014t\u0003V\u00c0\u00f3\u00f4\u0017\t\u00bd%@&\u00dfm\u00ff\u00bcX\u0096\u009d\u00c5\u00d1=q}\u0003\u0099\u0097o\tB1\u00a1NK\u0019(\u00f1X\u00c1\u00aeo\u008dK\u00f0\u00dc\u00a6\u000b\u00fe!\u00db\u0084\u0006G1;w\u0086csrVy\r\u00f8\u0099\u00d9\u00d3\u00f9\u00eaC\u009c4\u00d1\u00c0\u00c1\u0089\u00a1o-\u0017i\u001d\u0004\u009b\u00e0n\u0016\u0098i\u001ad\u0098&<\u00c8,\u00ccq\u0081M\u00b5D\u00d8h\u00c8\u00a6wz\u00bf\u00a7\u009bUi\u0011\u00bd\u0086\u0081\u00ef\u00ec\u00d4\u0084A\u0089~\u00c3\u00e7*]\u00c8\u00ae\u007f\u00d1\nU\u00d9T\u00dd?^\u001bO%t@+\u00fc|\u00c6\u000b\u00ab\u00b6\u009bu\u009b\u00c2 \u001c,\u00dd&\u0092@\u00cb\u00cf}\r\u00fam\u00d6u\u0095\u0017\u00fa\u00eel\u00af\u0006\u00d3\u00e9A\u0012\r\fD\u00a6X\u008di\u0090\u00a5{m\u0001\u008e\u00ec\u00b8\r\u00feq\u0098<\u0090T\u00e4'cMm\u008b#\u009f\\@(=O\u00aa\u00fc\u0018\u0005\u00ec^l\u00ba\u0093\u00b3\u0015\u00d8\u00e3\u0007?h\u00bf@<N\u00a9,n6\u0011=\u00a3\u0092\u00a5\u009d\u00d0\u00acH\u008c\u00e0\u00b1\u00a7M?\u00ce\u00cc\u00eaY:\u00e6/s\u009d\u0002Z\u00e6p\u0084\u0098\u009b\u0010\u00beL\u0019M~\u00a0\u00c7M\u00ce\u009e`~W\u0016\u0085\u0098\u00c7\u00b3Z8.\u00bd\"Q`\"\u00b9\u00bf\u00c7\u00ed\u009c\u00db)\u0086},y\u00ea\u00d4\u0013\u001f\u00de\u00c190\u0090\u00e6\u00c8\u001c\u00fe\u00f5\u0086>]A\u0086\u00ac\u0015(\u00fe{\u008f\u00f7<\u00aeE=\u00a8\u00d2C\u00c1*\u00a5\u000eF\u00d7\u00b8\u00fc\u001e\u00ed\u00cez\u00bc\u0002\u00da\u00ccC\u0080\u00de\u00df\u00ff\u0094_\u00ca\u0087\u00e3\u00a0\u001b\u00d0[\u00b1\u0006-$P\u00c6J\u00d2\nz\u00a8\u00c6\u00e3\u0080Z#{\u00a0\u00a6\u0081\u0007\u00ef\u009dB\u0081\u00f0\u0097?\u0096\t\u00ca\u00de\u00bad\u00a2\u00b4\u007f\u0086&\u00b6\u00cd\u008e\u00ee\u0084\u00c1\u0091\u00f2(c\u00c8\u00e2z\u00fbW\u00bd\u00ad\u00fd\u00aaG5^#\u00b7\u00f1\u001a\u00dcU\u00f4\u0018\u00a6&\u0015\u009c\u0090\u0082\u00c54f|Ct\u009b\u00d5<j\u0012\u00d2\u00ca\u0012\"eN\u000b\u001f\u00e76\u001f\u0017\u00c5\u00a5]\u00adbi\u00f6\u00ba\u00f9\u0085\u008d\f\u009c\u001d\\\u0016\u00e8\u00f3\u00c9~Hw\u00eb\u00e6\u001c\u009b\u00a8f8l3\u009f\u00af\u00de\u00b9Q\u0088\u00a8\u00b5\u00b4\u001bO\u0094\u0087\u00cf\t\to\u0004/5\u001c\u008du\u001a\u00dc\u00d288\u00a15\u00c1\u00cd\u00b5\u00f0u\u00a9\u00bf\u00feF\u00d6\u008a\u00da\u00edc\u0094u(n^\u00eb\u00bc\u008b\u00a1\u00a6\u00d3\u00a7\u0016\u00fb\b\u008bH3\u0017\u00dcq\u00bc9+|\u00aeJ\u00d5\u0014\u00fc\u00af\u0085?2\u0099D\u00b47~\u00b8\u00dd\u00c5\u00a9B%\u00fb\u00a3]-\u0089\u00a1\u00ce\u009f\u0006\u00c9CT\u001e\u00e8dr}\u00fc\u0086\u0012OJ\u0012R+\u00b6\u0095\u000bh\u00c0SZ\u0084\u0000\u008f;K\u007f\u00f3>\u00d0\u00f9F)\u00e4\u008e\u0004\u00e8l\u00bf&Z\u0087\u00e2\u00ae\u00d2\u009a\u00c3\u00b2Q\u0083\u008e\u00a4V\u0082\u001c\u00c9\u001e\u00bb>,\u00a3,\r\u008a\u00e1\u008a\u00be-g\u00c9\u001bZ-\u0085\u00a8\u00fa\u0097*\u00e2$\u0088\u00caP\u0083:ikQ-\u00b4qp\u00017}v".getBytes("ISO-8859-1");
            var1_13 = var0_12.length / 4;
            Effects.lllI = new int[var1_13];
            var3_14 = 0;
            var4_15 = 0;
            if (true) ** GOTO lbl56
            break;
        }
        block8: while (true) {
            var16_1 = v0;
            v1 = var15_10++;
            var14_9[v1] = (char)(var14_9[v1] ^ var16_1 ^ var6);
            if (var15_10 >= var14_9.length) ** GOTO lbl41
lbl28:
            // 2 sources

            switch (var15_10 % 5) {
                default: {
                    v0 = 25;
                    continue block8;
                }
                case 3: {
                    v0 = 0;
                    continue block8;
                }
                case 4: {
                    v0 = 109;
                    continue block8;
                }
                case 2: {
                    v0 = 17;
                    continue block8;
                }
lbl41:
                // 1 sources

                var9_4[var10_5] = new String(var14_9).intern();
                var11_6 += var12_7;
                if (++var10_5 >= var8_3.length) ** break;
                ** continue;
                var13_8 = 0;
lbl46:
                // 2 sources

                var10_5 = 0;
                var11_6 = 0;
                var12_7 = '\u0000';
                ** continue;
                case 1: 
            }
            v0 = 97;
        }
        while (true) {
            var3_14 += 4;
            if (++var4_15 >= var1_13) break;
lbl56:
            // 2 sources

            var5_16 = (var0_12[var3_14] & 255) << 24 | (var0_12[var3_14 + 1] & 255) << 16 | (var0_12[var3_14 + 2] & 255) << 8 | var0_12[var3_14 + 3] & 255;
            Effects.lllI[var4_15] = var5_16 ^= var2_11;
        }
        Effects.lI = new String[62];
        Effects.lll();
        Effects.Illl = IIIllIII.l;
    }

    private static void lll() {
        Effects.lI[0] = Effects.I(Effects.IIIlI('\uac86', '\u55c8', 699213352).toCharArray(), 65862L, -1968003008);
        Effects.lI[1] = Effects.I(Effects.IIIlI('\uac87', '\ue698', -861835909).toCharArray(), 66880L, 1785248494);
        Effects.lI[2] = Effects.I(Effects.IIIlI('\uac84', '\u6674', 1116090466).toCharArray(), 54179L, 89591720);
        Effects.lI[3] = Effects.I(Effects.IIIlI('\uac85', '\u42c5', -1804916540).toCharArray(), 40475L, 742597698);
        Effects.lI[4] = Effects.I(Effects.IIIlI('\uac82', '\u946d', 1516797713).toCharArray(), 21094L, -2058558430);
        Effects.lI[5] = Effects.I(Effects.IIIlI('\uac83', '\ue94f', -707300443).toCharArray(), 79586L, 1021559818);
        Effects.lI[6] = Effects.I(Effects.IIIlI('\uac80', '\u24e1', 425596318).toCharArray(), 28281L, -1843636098);
        Effects.lI[7] = Effects.I(Effects.IIIlI('\uac81', '\ueac1', 626083983).toCharArray(), 64382L, 566490470);
        Effects.lI[8] = Effects.I(Effects.IIIlI('\uac8e', '\udd5f', 207712476).toCharArray(), 32669L, -1468142505);
        Effects.lI[9] = Effects.I(Effects.IIIlI('\uac8f', '\ua22e', 477702506).toCharArray(), 15190L, 1104920529);
        Effects.lI[10] = Effects.I("".toCharArray(), 41069L, -1839687304);
        Effects.lI[11] = Effects.I(Effects.IIIlI('\uac8c', '\u14f1', 2009662853).toCharArray(), 22898L, 910099923);
        Effects.lI[12] = Effects.I(Effects.IIIlI('\uac8d', '\ua5cc', 1266566268).toCharArray(), 33773L, -205900707);
        Effects.lI[13] = Effects.I(Effects.IIIlI('\uac8a', '\u49e2', 1213424466).toCharArray(), 84488L, -79146490);
        Effects.lI[14] = Effects.I(Effects.IIIlI('\uac8b', '\u604c', -1348240077).toCharArray(), 36408L, 1582184178);
        Effects.lI[15] = Effects.I(Effects.IIIlI('\uac88', '\u6634', -494132243).toCharArray(), 2952L, 1771804227);
        Effects.lI[16] = Effects.I(Effects.IIIlI('\uac89', '\u5e8a', -80866404).toCharArray(), 69232L, 1067755731);
        Effects.lI[17] = Effects.I(Effects.IIIlI('\uac96', '\ua8e0', -258794258).toCharArray(), 62089L, 1929005867);
        Effects.lI[18] = Effects.I(Effects.IIIlI('\uac97', '\uf426', 1670849658).toCharArray(), 40937L, 1285813086);
        Effects.lI[19] = Effects.I(Effects.IIIlI('\uac94', '\ua170', 1502153420).toCharArray(), 71692L, 1360149418);
        Effects.lI[20] = Effects.I(Effects.IIIlI('\uac95', '\u3aeb', -1663019032).toCharArray(), 4871L, 1789591297);
        Effects.lI[21] = Effects.I(Effects.IIIlI('\uac92', '\u2b0e', 1143227617).toCharArray(), 54580L, 821438835);
        Effects.lI[22] = Effects.I(Effects.IIIlI('\uac93', '\u9f67', 531049287).toCharArray(), 32519L, -504066659);
        Effects.lI[23] = Effects.I(Effects.IIIlI('\uac90', '\u7789', -823835619).toCharArray(), 67967L, 1874195644);
        Effects.lI[24] = Effects.I(Effects.IIIlI('\uac91', '\uaf37', -1110348005).toCharArray(), 84599L, 313781824);
        Effects.lI[25] = Effects.I(Effects.IIIlI('\uac9e', '\ua000', 1023494865).toCharArray(), 73834L, -479093681);
        Effects.lI[26] = Effects.I(Effects.IIIlI('\uac9f', '\u7e78', 2062091473).toCharArray(), 6862L, -2043329849);
        Effects.lI[27] = Effects.I(Effects.IIIlI('\uac9c', '\uf9e8', -792902741).toCharArray(), 21857L, 252053101);
        Effects.lI[28] = Effects.I(Effects.IIIlI('\uac9d', '\u15fb', 640821444).toCharArray(), 43105L, 607283714);
        Effects.lI[29] = Effects.I(Effects.IIIlI('\uac9a', '\u726f', -414630798).toCharArray(), 93742L, -204152318);
        Effects.lI[30] = Effects.I(Effects.IIIlI('\uac9b', '\u13d4', 1175928454).toCharArray(), 34924L, 1166815122);
        Effects.lI[31] = Effects.I(Effects.IIIlI('\uac98', '\ucd19', -525312545).toCharArray(), 17946L, 1949164908);
        Effects.lI[32] = Effects.I(Effects.IIIlI('\uac99', '\u98ca', -1604093230).toCharArray(), 63574L, -1959297362);
        Effects.lI[33] = Effects.I(Effects.IIIlI('\uaca6', '\uacee', -2138821228).toCharArray(), 637L, 2014142052);
        Effects.lI[34] = Effects.I(Effects.IIIlI('\uaca7', '\u2e7d', 2067016813).toCharArray(), 27985L, 496010448);
        Effects.lI[35] = Effects.I(Effects.IIIlI('\uaca4', '\u1325', 1250830318).toCharArray(), 33638L, -1909277373);
        Effects.lI[36] = Effects.I(Effects.IIIlI('\uaca5', '\u6c2b', 2022839843).toCharArray(), 48306L, -1066955396);
        Effects.lI[37] = Effects.I(Effects.IIIlI('\uaca2', '\ub835', -943364840).toCharArray(), 80086L, -1905425151);
        Effects.lI[38] = Effects.I(Effects.IIIlI('\uaca3', '\u983b', -133860605).toCharArray(), 95891L, -1761609111);
        Effects.lI[39] = Effects.I(Effects.IIIlI('\uaca0', '\u1a0a', 849680353).toCharArray(), 59850L, -973991688);
        Effects.lI[40] = Effects.I(Effects.IIIlI('\uaca1', '\u7890', 1647795770).toCharArray(), 46218L, 1297431804);
        Effects.lI[41] = Effects.I(Effects.IIIlI('\uacae', '\u1eac', -1313067191).toCharArray(), 19612L, -827962799);
        Effects.lI[42] = Effects.I(Effects.IIIlI('\uacaf', '\u6c37', 724709471).toCharArray(), 35095L, -1711007315);
        Effects.lI[43] = Effects.I(Effects.IIIlI('\uacac', '\uc11e', -1647228761).toCharArray(), 92929L, 490990488);
        Effects.lI[44] = Effects.I(Effects.IIIlI('\uacad', '\u1df5', -995930191).toCharArray(), 42135L, -1282873976);
        Effects.lI[45] = Effects.I(Effects.IIIlI('\uacaa', '\u29cd', -1078699982).toCharArray(), 43773L, -1543061648);
        Effects.lI[46] = Effects.I(Effects.IIIlI('\uacab', '\u2130', 1205360744).toCharArray(), 7572L, 475900926);
        Effects.lI[47] = Effects.I(Effects.IIIlI('\uaca8', '\u6614', 688006920).toCharArray(), 26515L, -2112153041);
        Effects.lI[48] = Effects.I(Effects.IIIlI('\uaca9', '\u720b', -727693903).toCharArray(), 74692L, -118603908);
        Effects.lI[49] = Effects.I(Effects.IIIlI('\uacb6', '\u27c4', 1314081557).toCharArray(), 43891L, 113655186);
        Effects.lI[50] = Effects.I(Effects.IIIlI('\uacb7', '\u6b6b', 81219691).toCharArray(), 71304L, 126205143);
        Effects.lI[51] = Effects.I(Effects.IIIlI('\uacb4', '\ua8ad', 857021658).toCharArray(), 93265L, 1490398291);
        Effects.lI[52] = Effects.I(Effects.IIIlI('\uacb5', '\udcab', -45584365).toCharArray(), 34268L, -1439637247);
        Effects.lI[53] = Effects.I(Effects.IIIlI('\uacb2', '\u1bc6', 1589922921).toCharArray(), 43840L, 687950366);
        Effects.lI[54] = Effects.I(Effects.IIIlI('\uacb3', '\ua5cb', -647205906).toCharArray(), 64536L, -1963712258);
        Effects.lI[55] = Effects.I(Effects.IIIlI('\uacb0', '\u44ec', 467104780).toCharArray(), 75141L, 270033376);
        Effects.lI[56] = Effects.I(Effects.IIIlI('\uacb1', '\u5512', 1042487029).toCharArray(), 63070L, 1547324807);
        Effects.lI[57] = Effects.I(Effects.IIIlI('\uacbe', '\u0af5', -1198060435).toCharArray(), 36401L, 1684890594);
        Effects.lI[58] = Effects.I(Effects.IIIlI('\uacbf', '\uadb9', -1812639202).toCharArray(), 3575L, -141706381);
        Effects.lI[59] = Effects.I(Effects.IIIlI('\uacbc', '\uc885', 202523726).toCharArray(), 73182L, -1443611541);
        Effects.lI[60] = Effects.I(Effects.IIIlI('\uacbd', '\u68e3', 1322006970).toCharArray(), 63643L, 874988244);
        Effects.lI[61] = Effects.I(Effects.IIIlI('\uacba', '\ueef3', -1625594743).toCharArray(), 31774L, -1923301131);
    }

    @Override
    public void Il(DrawContext drawContext, int n, int n2, float f) {
        if (!this.IIIlIIl()) {
            return;
        }
        this.llIl(drawContext, false, false);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIII(DrawContext drawContext, TextRenderer textRenderer, double d, double d2, double d3, double d4, lIlIIIlI lIlIIIlI2, int n, double d5, boolean bl) {
        int n2;
        double d6 = IIllIIlII.II(d5);
        if (d6 <= 0.01) {
            return;
        }
        double d7 = 1.0;
        double d8 = IIllIIlII.II(d6 * d7);
        IlIIIIll.IlI(drawContext, Illl, d, d2, d3, d4, bl, d6);
        double d9 = this.IllI();
        double d10 = d + d9 + 5.8;
        double d11 = d2 + d4 * 0.5;
        double d12 = (Boolean)this.lll.lIl() != false ? lIlIIIlI2.Ill * 0.78 : 0.0;
        double d13 = d + d3 - d9 - 4.0;
        double d14 = d13 - d12;
        double d15 = d10 + 5.8 + 5.0;
        double d16 = d2 + d4 * 0.5;
        Objects.requireNonNull(textRenderer);
        double d17 = d16 - 9.0 * 0.9 * 0.5;
        double d18 = Math.max(22.0, ((Boolean)this.lll.lIl() != false && !lIlIIIlI2.IIl.isEmpty() ? d14 - 7.0 : d13) - d15);
        String string = IIIlI.llIIIl(textRenderer, lIlIIIlI2.IlI, d18 / 0.9);
        int n3 = llIlllIl.Ill(n, -2629912, 0.72);
        int n4 = llIlllIl.ll(n3, 0.94 * d8);
        this.l(drawContext, textRenderer, string, d15, d17, n4, 0.9);
        if (((Boolean)this.lll.lIl()).booleanValue() && lIlIIIlI2.IIl != null && !lIlIIIlI2.IIl.isEmpty()) {
            n2 = llIlllIl.ll(lIlIIIlI2.l, lIlIIIlI2.II ? 0.96 * d8 : 0.86 * d6);
            Objects.requireNonNull(textRenderer);
            double d19 = d16 - 9.0 * 0.78 * 0.5;
            this.l(drawContext, textRenderer, lIlIIIlI2.IIl, d14, d19, n2, 0.78);
        }
        n2 = llIlllIl.Ill(lIlIIIlI2.l, -15393496, 0.7);
        int n5 = llIlllIl.ll(n2, d6);
        int n6 = llIlllIl.ll(lIlIIIlI2.l, d6);
        this.lI(drawContext, d10, d11, 5.8, 2.3, lIlIIIlI2.I, n6, n5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlI(int n) {
        if (n <= 0) {
            return "";
        }
        switch (n) {
            case 6: {
                return "VI";
            }
            case 4: {
                return "IV";
            }
            case 3: {
                return "III";
            }
            case 7: {
                return "VII";
            }
            case 5: {
                return "V";
            }
            case 8: {
                return "VIII";
            }
            case 2: {
                return "II";
            }
            default: {
                String string = String.valueOf(n);
                return string;
            }
            case 1: {
                return "I";
            }
            case 10: {
                return "X";
            }
            case 9: 
        }
        return "IX";
    }

    private double IllI() {
        return Math.max(8.0, (Double)this.IllI.lIl());
    }

    /*
     * Exception decompiling
     */
    private int lIIl(StatusEffect var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous, and can't clone.
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:611)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:94)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:517)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
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

    private static String lIlI(StatusEffectInstance statusEffectInstance, MinecraftClient minecraftClient) {
        if (statusEffectInstance.isInfinite()) {
            return StringFactory.IIl("Gnyq");
        }
        try {
            return StatusEffectUtil.getDurationText((StatusEffectInstance)statusEffectInstance, (float)1.0f, (float)(minecraftClient.world == null ? 20.0f : minecraftClient.world.getTickManager().getTickRate())).getString();
        }
        catch (Throwable throwable) {
            int n = Math.max(0, statusEffectInstance.getDuration() / 20);
            int n2 = n / 60;
            int n3 = n % 60;
            return String.format("%d:%02d", n2, n3);
        }
    }

    @Override
    public double IlII() {
        return (Double)this.llII.lIl();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void llIl(DrawContext drawContext, boolean bl, boolean bl2) {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null || minecraftClient.textRenderer == null || minecraftClient.player == null) {
            return;
        }
        TextRenderer textRenderer = minecraftClient.textRenderer;
        long l2 = System.currentTimeMillis();
        double d = this.IIl(l2);
        for (llIIlIlI object22 : this.lII.values()) {
            object22.ll = false;
        }
        int n = 0;
        ArrayList<StatusEffectInstance> arrayList = new ArrayList<StatusEffectInstance>(minecraftClient.player.getStatusEffects());
        arrayList.sort(Comparator.comparingInt(StatusEffectInstance::getDuration).reversed());
        for (Object d2 : arrayList) {
            int n2;
            String string = Effects.lIl(d2);
            llIIlIlI d3 = this.lII.computeIfAbsent(string, llIIlIlI::new);
            d3.ll = true;
            d3.lI = n++;
            int n3 = n2 = d2.isInfinite() ? Integer.MAX_VALUE : Math.max(0, d2.getDuration());
            if (d2.isInfinite()) {
                d3.II = Integer.MAX_VALUE;
            } else if (n2 > d3.II || d3.II <= 0) {
                d3.II = Math.max(1, n2);
            }
            d3.I = this.llI(minecraftClient, textRenderer, (StatusEffectInstance)d2, d3.II);
        }
        List<llIIlIlI> list = this.IlI(d);
        if (list.isEmpty() && bl) {
            Object d2;
            d2 = new llIIlIlI("Xcee");
            d2.ll = true;
            d2.Il = 1.0;
            d2.I = this.lII(textRenderer);
            list.add((llIIlIlI)d2);
        }
        if (list.isEmpty()) {
            this.llI = 0.0;
            return;
        }
        list.sort((llIIlIlI2, llIIlIlI3) -> {
            int n = Integer.compare(llIIlIlI3.I.III, llIIlIlI2.I.III);
            return n != 0 ? n : Integer.compare(llIIlIlI2.lI, llIIlIlI3.lI);
        });
        double d2 = (Double)this.lIIl.lIl();
        double d3 = (Double)this.lIII.lIl();
        double d4 = 138.0;
        for (llIIlIlI llIIlIlI4 : list) {
            d4 = Math.max(d4, llIIlIlI4.I.ll);
        }
        double d5 = (double)list.size() * d2 + (double)Math.max(0, list.size() - 1) * d3;
        this.IIII = d4;
        this.llI = d5;
        double d6 = this.IIIII();
        IIIlI.lIlIIl(drawContext);
        try {
            IIIlI.Ill(drawContext, (Double)this.llII.lIl(), (Double)this.Ill.lIl());
            IIIlI.IIlll(drawContext, d6, d6);
            double d7 = 0.0;
            int n4 = this.IlIl.lIl() == null ? -1 : ((Color)this.IlIl.lIl()).getRGB();
            for (llIIlIlI llIIlIlI5 : list) {
                double d8 = Math.max(138.0, llIIlIlI5.I.ll);
                this.IIII(drawContext, textRenderer, 0.0, d7, d8, d2, llIIlIlI5.I, n4, llIIlIlI5.Il, bl2);
                d7 += d2 + d3;
            }
        }
        finally {
            IIIlI.IlIllI(drawContext);
        }
    }

    private double IIIII() {
        return Math.max(0.4, (Double)this.I.lIl() / 100.0);
    }

    @Override
    public double IlIl() {
        return (Double)this.Ill.lIl();
    }

    @Override
    public void lIII(DrawContext drawContext, int n, int n2, float f) {
        this.llIl(drawContext, false, false);
    }

    private static int IIIIl(int n, int n2) {
        return lllI[n ^ 0xABA28F04] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIIlI(char c, char c2, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xAC86;
        char[] cArray = llll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIIII[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Effects.IIIII[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x6805;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0x4657;
            n6 += 10336;
            n6 += 21177;
            n6 -= 17129;
            n6 -= 18215;
            n6 -= 35238;
            n6 -= 56549;
            n6 += 63879;
            n6 -= 34317;
            cArray[n5] = (char)((n6 += 49202) ^ n3 ^ c2 ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

