/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lIllIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - Download the latest build to stay compatible.
 *   - Upload failed. Drop a valid .json config.
 *   - Click Confirm to apply this setting.
 *   - Escape, Backspace, or Delete clears
 *   - Drop a .json config file here
 *   - Press a key or mouse button
 *   - Imported clipboard profile
 *   - Dangerous AltMask action
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
 *  net.minecraft.client.gui.Click
 *  net.minecraft.client.gui.DrawContext
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.input.CharInput
 *  net.minecraft.client.input.KeyInput
 *  net.minecraft.client.texture.AbstractTexture
 *  net.minecraft.client.texture.NativeImage
 *  net.minecraft.client.texture.NativeImageBackedTexture
 *  net.minecraft.client.util.InputUtil
 *  net.minecraft.client.util.InputUtil$Key
 *  net.minecraft.text.Text
 *  net.minecraft.util.Identifier
 *  net.minecraft.util.Util
 *  org.lwjgl.glfw.GLFW
 */
package orchard.internal;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.invoke.LambdaMetafactory;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import javax.imageio.ImageIO;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Click;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.input.CharInput;
import net.minecraft.client.input.KeyInput;
import net.minecraft.client.texture.AbstractTexture;
import net.minecraft.client.texture.NativeImage;
import net.minecraft.client.texture.NativeImageBackedTexture;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Util;
import orchard.config.CloudConfigManager;
import orchard.core.Category;
import orchard.core.ClientEntrypoint;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.core.Theme;
import orchard.internal.IIIIIIIIl;
import orchard.internal.IIIIlIII;
import orchard.internal.IIIIlIIII;
import orchard.internal.IIIIllIll;
import orchard.internal.IIIlI;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIlIlIIl;
import orchard.internal.IIIlIlll;
import orchard.internal.IIllI;
import orchard.internal.IIllIIIII;
import orchard.internal.IIllIIIll;
import orchard.internal.IIllIl;
import orchard.internal.IIlllIIl;
import orchard.internal.IIlllIll;
import orchard.internal.IIllll;
import orchard.internal.IIlllllI;
import orchard.internal.IlIIIIll;
import orchard.internal.IlIIIlI;
import orchard.internal.IlIIlIIIl;
import orchard.internal.IlIIllI;
import orchard.internal.IlIlIIlIl;
import orchard.internal.IlIlIllI;
import orchard.internal.IlIllIIl;
import orchard.internal.IlIlllII;
import orchard.internal.Illl;
import orchard.internal.IlllIll;
import orchard.internal.IlllIllI;
import orchard.internal.Illllll;
import orchard.internal.lIIIIlll;
import orchard.internal.lIIllII;
import orchard.internal.lIIllllI;
import orchard.internal.lIlIIlI;
import orchard.internal.llIIIlll;
import orchard.internal.llIlIlI;
import orchard.internal.llIlIlII;
import orchard.internal.llIlIlIl;
import orchard.internal.llIll;
import orchard.internal.llIllIII;
import orchard.internal.lllIIlI;
import orchard.internal.lllIlI;
import orchard.internal.lllIlIII;
import orchard.internal.lllIlIlI;
import orchard.module.combat.BreachSwap;
import orchard.module.combat.PotAssist;
import orchard.module.iface.ClickSimulations;
import orchard.module.iface.Interface;
import orchard.module.iface.Panic;
import orchard.module.iface.VisualSwitch;
import orchard.module.movement.MoveFix;
import orchard.module.render.Rotations;
import org.lwjgl.glfw.GLFW;

@Environment(value=EnvType.CLIENT)
public final class lIllIIlI
extends Screen {
    private static final IIIlIIIII I;
    private String l = "";
    private String II = "Preset";
    private double Il;
    private static final double lI = 8.0;
    private boolean ll;
    private static final double III = 8.5;
    private final Map<Enum<?>, Double> IIl;
    private llIlIlII IlI;
    private static final long Ill = 524288L;
    private static final double lII = 8.0;
    private static final Category[] lIl;
    private boolean llI = false;
    private static final double lll = 18.0;
    private String IIII;
    private static final int IIIl = 0x800000;
    private boolean IIlI = true;
    private static final double IIll = 31.0;
    private boolean IlII;
    private static final IIIlIIIII IlIl;
    private lllIlIII IllI;
    private double Illl;
    private final Map<Long, Double> lIII;
    private static final double lIIl = 0.58;
    private double lIlI;
    private static final long lIll = 750000000L;
    private boolean llII;
    private double llIl = -1.0;
    private static final double lllI = 6.0;
    private static final Set<Long> llll;
    private double IIIII;
    private final EnumMap<Theme, Double> IIIIl;
    private double IIIlI = 0.016666666666666666;
    private double IIIll;
    private IIIlIIIII IIlII;
    private static final int IIlIl = -15395044;
    private double IIllI;
    private Category IIlll = null;
    private static final double IlIII = 190.0;
    private IlIIlIIIl IlIIl;
    private boolean IlIlI;
    private double IlIll = -1.0;
    private final IlIIIlI IllII = new IlIIIlI();
    private static final double IllIl = 24.0;
    private static final double IlllI = 360.0;
    private lIlIIlI Illll;
    private double lIIII = 0.0;
    private static final double lIIIl = 14.0;
    private double lIIlI;
    private static final double lIIll = 12.0;
    private boolean lIlII;
    private final ClientEntrypoint lIlIl;
    private static final double lIllI = 44.0;
    private double lIlll;
    private String llIII;
    private final Map<IIllIl<?>, IIllll> llIIl;
    private IlIlIllI llIlI;
    private IlIlIIlIl llIll;
    private String lllII = "";
    private double lllIl;
    private double llllI;
    private static final double lllll = 4.0;
    private double IIIIII;
    private long IIIIIl;
    private llIIIlll IIIIlI = null;
    private static final double IIIIll = 0.92;
    private boolean IIIlII = false;
    private static final IIIlIIIII IIIlIl;
    private static final double IIIllI = 39.0;
    private double IIIlll;
    private double IIlIII;
    private boolean IIlIIl;
    private final IIIIlIIII IIlIlI = new IIIIlIIII();
    private double IIlIll;
    private String IIllII = "";
    private double IIllIl;
    private boolean IIlllI;
    private double IIllll;
    private final Map<Long, Double> IlIIII;
    private double IlIIIl;
    private boolean IlIIlI;
    private static final double IlIIll = 22.0;
    private double IlIlII;
    private final CloudConfigManager IlIlIl;
    private static final double IlIllI = 6.0;
    private static final double IlIlll = 0.82;
    private static final int IllIII = 4096;
    private static final double IllIIl = 10.0;
    private boolean IllIlI;
    private double IllIll;
    private static final double IlllII = 0.015;
    private long IlllIl;
    private double IllllI = -1.0;
    private double Illlll = -1.0;
    private static final double lIIIII = 5.0;
    private static final double lIIIIl = 184.0;
    private static final Illl[] lIIIlI;
    private static final Set<Long> lIIIll;
    private static final double lIIlII = 0.95;
    private double lIIlIl;
    private double lIIllI = -1.0;
    private static final int lIIlll = 16;
    private static final IIIlIIIII lIlIII;
    private double lIlIIl;
    private String lIlIlI = "default";
    private String lIlIll = "";
    private static final IIIlIIIII lIllII;
    private final EnumMap<Theme, Double> lIllIl;
    private final Map<Long, Double> lIlllI;
    private static final double lIllll = 28.0;
    private final llIllIII llIIII = new llIllIII();
    private DrawContext llIIIl;
    private IIIlIlIIl llIIlI;
    private final Screen llIIll;
    private double llIlII = -1.0;
    private static final IIIlIIIII llIlIl;
    private double llIllI = 1.0;
    private llIIIlll llIlll;
    private IIlllllI lllIII = IIlllllI.l;
    private IlIlllII lllIIl;
    private static final int[] lllIlI;
    private static final String[] lllIll;
    private static final Object[] llllII;

    /*
     * Enabled aggressive block sorting
     */
    private void I(double d, double d2, double d3) {
        this.llI = true;
        this.IlIll = d;
        this.lIIllI = d2;
        this.Illlll = d3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void l(ModuleBase moduleBase, double d, double d2, double d3) {
        IIIlIIIII iIIlIIIII = StringFactory.IIII("Reset Module");
        double d4 = this.IlIIIIl(iIIlIIIII, d, d3);
        double d5 = Math.max(0.0, d + d3 - d4);
        double d6 = d2 + Math.max(0.0, (24.0 - orchard.internal.IIIlI.IllIII(this.textRenderer) * 0.82) * 0.5);
        this.IIlIlI.lIl(iIIlIIIII, d, d6, Math.max(0.0, d4 - d - 8.0), -1, 0.82);
        this.IIlIlI.l(d4, d2 + 2.0, d5, 20.0, iIIlIIIII, false, 0.82);
        this.llIIII.II(d4, d2, d5, 24.0, (click, bl) -> {
            moduleBase.IIIllll();
            this.IllI();
            return true;
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private double Il(ModuleBase moduleBase, boolean bl, boolean bl2) {
        double d;
        long l2 = moduleBase.IlIIllI();
        double d2 = this.IlIIII.getOrDefault(l2, 0.0);
        double d3 = !bl2 ? d2 : (d = this.lllI(d2, bl ? 1.0 : 0.0, 10.0));
        if (!bl && d < 0.01) {
            this.IlIIII.remove(l2);
            return 0.0;
        }
        this.IlIIII.put(l2, d);
        return d;
    }

    private static String lI(double d) {
        if (Math.abs(d - Math.rint(d)) < 1.0E-4) {
            return Integer.toString((int)Math.rint(d));
        }
        return String.format(Locale.ROOT, "%.2f", d);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIl(KeyInput keyInput) {
        int n = keyInput.key();
        int n2 = keyInput.modifiers();
        if (n != 67) return false;
        if ((n2 & 0xA) != 0) return true;
        if (this.lIIlllI()) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlI() {
        long l2 = System.nanoTime();
        if (this.IIIIIl <= 0L) {
            this.IIIIIl = l2;
            this.IIIlI = 0.016666666666666666;
        } else {
            this.IIIlI = Math.max(0.004166666666666667, Math.min(0.05, (double)(l2 - this.IIIIIl) / 1.0E9));
            this.IIIIIl = l2;
        }
        this.lIIlI = this.lllI(this.lIIlI, this.IlIlI ? 0.0 : 1.0, this.IlIlI ? 60.0 : 9.0);
        if (this.IllII.IlII != this.IIlll || this.llIlll != this.IIIIlI) {
            this.IIlll = this.IllII.IlII;
            this.IIIIlI = this.llIlll;
            this.llIllI = 0.0;
        }
        this.llIllI += this.IIIlI;
        if (!this.llI) {
            this.llIl = -1.0;
            this.llIlII = -1.0;
            this.IllllI = -1.0;
            this.lIIII = 0.0;
            return;
        }
        if (this.llIl < 0.0) {
            this.llIl = this.IlIll;
            this.llIlII = this.lIIllI;
            this.IllllI = this.Illlll;
        } else if (!(Math.abs(this.llIl - this.IlIll) > 40.0) && !(Math.abs(this.llIlII - this.lIIllI) > 40.0)) {
            this.llIl = this.lllI(this.llIl, this.IlIll, 22.0);
            this.llIlII = this.lllI(this.llIlII, this.lIIllI, 22.0);
            this.IllllI = this.lllI(this.IllllI, this.Illlll, 22.0);
        } else {
            this.llIl = this.IlIll;
            this.llIlII = this.lIIllI;
            this.IllllI = this.Illlll;
        }
        this.lIIII += this.IIIlI;
    }

    Illl Ill() {
        return this.IllII.l;
    }

    /*
     * Enabled aggressive block sorting
     */
    private IlIllIIl lII(double d, double d2, double d3, double d4, String string, Runnable runnable) {
        double d5 = (double)this.IIlIlI.IIlI(string) + 20.0;
        if (d + d5 > d3 + d4 && d > d3) {
            d = d3;
            d2 += 28.0;
        }
        this.IIIll = d2;
        this.IIlIlI.IllII(d, d2, d5, 22.0, string, false);
        this.llIIII.II(d, d2, d5, 22.0, (click, bl) -> {
            runnable.run();
            return true;
        });
        return new IlIllIIl(d + d5 + 6.0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIl(DrawContext drawContext) {
        if (this.llIll == null) {
            return;
        }
        double d = 224.0;
        double d2 = 48.0;
        double d3 = ((double)this.IlIIl.I() - d) * 0.5;
        double d4 = ((double)this.IlIIl.ll() - d2) * 0.5;
        this.IIlIlI.IIlII(d3, d4, d, d2, true);
        this.IIlIlI.IlllI("Press a key or mouse button", d3 + d * 0.5, d4 + 11.0, this.IIlIlI.llIII(), d - 18.0);
        this.IIlIlI.IlllI("Escape, Backspace, or Delete clears", d3 + d * 0.5, d4 + 28.0, this.IIlIlI.II(), d - 18.0);
    }

    /*
     * Unable to fully structure code
     */
    private List<String> IIII(String var1_1, double var2_2) {
        block25: {
            block17: {
                block20: {
                    block22: {
                        block21: {
                            block18: {
                                block19: {
                                    block24: {
                                        block16: {
                                            block15: {
                                                block23: {
                                                    var4_3 = new ArrayList<String>();
                                                    break block23;
                                                    while (true) {
                                                        if (var5_4.isEmpty()) break block15;
                                                        break block16;
                                                        break;
                                                    }
lbl6:
                                                    // 1 sources

                                                    while (var1_1.isBlank()) {
                                                        break block17;
                                                    }
                                                    break block24;
                                                }
                                                if (var1_1 == null) break block17;
                                                ** GOTO lbl6
lbl12:
                                                // 1 sources

                                                while (true) {
                                                    var4_3.add(var1_1);
                                                    break block18;
                                                    break;
                                                }
                                            }
lbl17:
                                            // 2 sources

                                            while (var4_3.isEmpty()) {
                                                ** continue;
lbl19:
                                                // 1 sources

                                                ** GOTO lbl12
                                            }
                                            break block18;
lbl21:
                                            // 1 sources

                                            while (true) {
                                                var6_5 = var1_1.trim().split(" ");
                                                var7_6 = var6_5.length;
                                                var8_7 = 0;
                                                break block19;
                                                break;
                                            }
lbl26:
                                            // 1 sources

                                            while (true) {
                                                var5_4.append(var10_9);
                                                break block20;
                                                break;
                                            }
lbl30:
                                            // 1 sources

                                            while (true) {
                                                continue;
                                                break;
                                            }
lbl32:
                                            // 1 sources

                                            while (var5_4.isEmpty()) {
                                                break block21;
                                            }
                                            break block25;
                                        }
                                        var4_3.add(var5_4.toString());
                                        ** GOTO lbl17
                                    }
                                    var5_4 = new StringBuilder();
                                    ** while (true)
lbl42:
                                    // 1 sources

                                    while (true) {
                                        if ((double)orchard.internal.IIIlI.IIIlll(this.textRenderer, var10_9) <= var2_2) break block21;
                                        ** GOTO lbl32
                                        break;
                                    }
                                }
lbl46:
                                // 2 sources

                                while (true) {
                                    if (var8_7 >= var7_6) ** continue;
                                    ** continue;
                                    break;
                                }
                                while (true) {
                                    var13_12 = var9_8;
                                    var12_11 = " ";
                                    var11_10 = String.valueOf(var5_4);
                                    v0 = var11_10 + var12_11 + var13_12;
                                    break block22;
                                    break;
                                }
lbl55:
                                // 1 sources

                                while (true) {
                                    v0 = var9_8;
                                    break block22;
                                    break;
                                }
                            }
                            return var4_3;
                        }
                        var5_4.setLength(0);
                        ** while (true)
                    }
                    var10_9 = v0;
                    ** while (true)
                }
lbl67:
                // 3 sources

                while (true) {
                    ++var8_7;
                    ** continue;
                    break;
                }
lbl70:
                // 1 sources

                while (true) {
                    if (!var5_4.isEmpty()) ** continue;
                    ** continue;
                    break;
                }
            }
            return var4_3;
lbl75:
            // 1 sources

            while (true) {
                var5_4.append(var9_8);
                ** GOTO lbl67
                break;
            }
        }
        var4_3.add(var5_4.toString());
        var5_4.setLength(0);
        ** while (true)
        var9_8 = var6_5[var8_7];
        ** while (!var9_8.isBlank())
lbl86:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private IIIlIIIII IIIl(IIllIl<?> iIllIl) {
        if (iIllIl == null) {
            return StringFactory.IIII("");
        }
        IIIlIIIII iIIlIIIII = iIllIl.llIl();
        if (iIIlIIIII == null) return StringFactory.IIII("");
        if (iIIlIIIII.lll()) {
            return StringFactory.IIII("");
        }
        long l2 = iIIlIIIII.llII();
        if (l2 == 987285141359180347L) return lIlIII;
        if (l2 == 685730863380850843L) {
            return lIlIII;
        }
        if (l2 != 2806431867873202689L) return iIIlIIIII;
        return llIlIl;
    }

    private static byte[] IIlI(String string) {
        if (string == null) {
            return null;
        }
        try {
            URI uRI = URI.create(string.trim());
            if (IIIlIl.IIII().equalsIgnoreCase(uRI.getScheme())) {
                Path path = Path.of(uRI);
                if (!Files.isRegularFile(path, new LinkOption[0])) {
                    return null;
                }
                long l2 = Files.size(path);
                return l2 > 0L && l2 <= 0x800000L ? Files.readAllBytes(path) : null;
            }
        }
        catch (Exception exception) {
            return null;
        }
        return lIllIIlI.llIII(string);
    }

    /*
     * Unable to fully structure code
     */
    private void IIll(double var1_1, double var3_2, double var5_3, double var7_4) {
        block85: {
            block72: {
                block59: {
                    block69: {
                        block71: {
                            block84: {
                                block89: {
                                    block57: {
                                        block75: {
                                            block82: {
                                                block80: {
                                                    block87: {
                                                        block78: {
                                                            block62: {
                                                                block88: {
                                                                    block60: {
                                                                        block73: {
                                                                            block86: {
                                                                                block67: {
                                                                                    block64: {
                                                                                        block70: {
                                                                                            block83: {
                                                                                                block76: {
                                                                                                    block81: {
                                                                                                        block66: {
                                                                                                            block79: {
                                                                                                                block74: {
                                                                                                                    block65: {
                                                                                                                        block68: {
                                                                                                                            block63: {
                                                                                                                                block77: {
                                                                                                                                    block58: {
                                                                                                                                        block61: {
                                                                                                                                            break block73;
lbl1:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                continue;
                                                                                                                                                break;
                                                                                                                                            }
lbl3:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                v0 = 220.0;
                                                                                                                                                break block57;
                                                                                                                                                break;
                                                                                                                                            }
lbl6:
                                                                                                                                            // 2 sources

                                                                                                                                            while (true) {
                                                                                                                                                if (var31_27 >= var30_25) break block58;
                                                                                                                                                break block59;
                                                                                                                                                break;
                                                                                                                                            }
lbl9:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                continue;
                                                                                                                                                break;
                                                                                                                                            }
lbl11:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                v1 = var61_46 << 24 | this.IIlIlI.IIlIIl() & 0xFFFFFF;
                                                                                                                                                break block60;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            while (true) {
                                                                                                                                                if (!var29_23) break block61;
                                                                                                                                                break block62;
                                                                                                                                                break;
                                                                                                                                            }
lbl17:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                continue;
                                                                                                                                                break;
                                                                                                                                            }
lbl19:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                continue;
                                                                                                                                                break;
                                                                                                                                            }
lbl21:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                var45_35 = (Theme)var44_8.next();
                                                                                                                                                ** continue;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                            while (true) {
                                                                                                                                                v2 = 0.0;
                                                                                                                                                break block63;
                                                                                                                                                break;
                                                                                                                                            }
lbl27:
                                                                                                                                            // 1 sources

                                                                                                                                            while (true) {
                                                                                                                                                continue;
                                                                                                                                                break;
                                                                                                                                            }
                                                                                                                                        }
lbl30:
                                                                                                                                        // 2 sources

                                                                                                                                        while (true) {
                                                                                                                                            if (var9_5 != lIIIIlll.ll) break block64;
                                                                                                                                            break block65;
                                                                                                                                            break;
                                                                                                                                        }
lbl33:
                                                                                                                                        // 1 sources

                                                                                                                                        while (true) {
                                                                                                                                            var25_21 = var23_20 + var16_16;
                                                                                                                                            break block66;
                                                                                                                                            break;
                                                                                                                                        }
lbl36:
                                                                                                                                        // 1 sources

                                                                                                                                        while (true) {
                                                                                                                                            continue;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    if (var9_5 == lIIIIlll.lI) break block74;
                                                                                                                                    break block75;
                                                                                                                                    var46_10 = this.lIlIl.IlI().lIIIII();
                                                                                                                                    break block76;
lbl43:
                                                                                                                                    // 1 sources

                                                                                                                                    while (true) {
                                                                                                                                        if (!var9_5.ll(var32_28)) break block67;
                                                                                                                                        break block68;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                    var43_34 = 0;
                                                                                                                                    var44_8 = var28_22.iterator();
                                                                                                                                    break block77;
                                                                                                                                    while (true) {
                                                                                                                                        v3 = 0;
                                                                                                                                        break block69;
                                                                                                                                        break;
                                                                                                                                    }
lbl52:
                                                                                                                                    // 1 sources

                                                                                                                                    while (true) {
                                                                                                                                        continue;
                                                                                                                                        break;
                                                                                                                                    }
lbl54:
                                                                                                                                    // 1 sources

                                                                                                                                    while (true) {
                                                                                                                                        v4 = 0;
lbl56:
                                                                                                                                        // 2 sources

                                                                                                                                        while (true) {
                                                                                                                                            continue;
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        break;
                                                                                                                                    }
lbl58:
                                                                                                                                    // 1 sources

                                                                                                                                    while (true) {
                                                                                                                                        continue;
                                                                                                                                        break;
                                                                                                                                    }
lbl60:
                                                                                                                                    // 1 sources

                                                                                                                                    while (true) {
                                                                                                                                        continue;
                                                                                                                                        break;
                                                                                                                                    }
lbl62:
                                                                                                                                    // 1 sources

                                                                                                                                    while (true) {
                                                                                                                                        continue;
                                                                                                                                        break;
                                                                                                                                    }
                                                                                                                                }
lbl65:
                                                                                                                                // 2 sources

                                                                                                                                while (true) {
                                                                                                                                    if (!var44_8.hasNext()) ** continue;
                                                                                                                                    ** continue;
                                                                                                                                    break;
                                                                                                                                }
lbl68:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    continue;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                this.IIlIlI.I(var46_12, var57_49, var19_18, var23_20, var21_19, Theme.Illl, var59_50, var55_48);
                                                                                                                                if (!var59_50) break block78;
                                                                                                                                break block79;
lbl73:
                                                                                                                                // 1 sources

                                                                                                                                return;
lbl75:
                                                                                                                                // 1 sources

                                                                                                                                while (true) {
                                                                                                                                    ++var43_34;
                                                                                                                                    ** continue;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                            }
lbl79:
                                                                                                                            // 2 sources

                                                                                                                            while (true) {
                                                                                                                                continue;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        var28_22.add(var32_28);
                                                                                                                        break block67;
                                                                                                                        var60_45 = v4;
                                                                                                                        break block80;
                                                                                                                        while (true) {
                                                                                                                            v1 = var61_46 << 24 | 0xFFFFFF;
                                                                                                                            break block60;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        var14_15 = Math.max(0.0, var5_3 - 20.0);
                                                                                                                        break block81;
lbl92:
                                                                                                                        // 1 sources

                                                                                                                        while (true) {
                                                                                                                            this.IIIIl.keySet().removeIf((Predicate<Theme>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, IlllIll(java.util.Set orchard.core.Theme ), (Lorchard/core/Theme;)Z)(var27_6));
                                                                                                                            ** continue;
                                                                                                                            break;
                                                                                                                        }
lbl96:
                                                                                                                        // 1 sources

                                                                                                                        while (true) {
                                                                                                                            v3 = 1;
                                                                                                                            break block69;
                                                                                                                            break;
                                                                                                                        }
                                                                                                                        var48_38 = var41_33 + (double)var46_11 * (var19_18 + var16_16);
                                                                                                                        var50_39 = var12_14 + 8.0 + (double)var47_37 * var25_21 - var39_32;
                                                                                                                        ** while (true)
                                                                                                                        var55_48 = this.IlIl(var51_51);
                                                                                                                        break block82;
                                                                                                                    }
                                                                                                                    var44_7 = var12_14 + 8.0 + (double)((var43_34 + var18_17 - 1) / var18_17) * var25_21 - var39_32 + 8.0;
                                                                                                                    ** while (true)
lbl107:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        if (var60_45 == 0) ** continue;
                                                                                                                        ** continue;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
lbl111:
                                                                                                                // 2 sources

                                                                                                                while (true) {
                                                                                                                    v5 = true;
                                                                                                                    break block70;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
                                                                                                            v6 = 255.0;
                                                                                                            break block83;
                                                                                                        }
                                                                                                        var27_6 = EnumSet.noneOf(Theme.class);
                                                                                                        break block84;
lbl120:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            this.IIIIl.put(var50_40, var53_52);
                                                                                                            ** continue;
                                                                                                            break;
                                                                                                        }
lbl124:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            continue;
                                                                                                            break;
                                                                                                        }
                                                                                                    }
                                                                                                    var16_16 = 8.0;
                                                                                                    break block85;
                                                                                                }
                                                                                                this.Illll(var46_10, var46_10.Illl(), StringFactory.IIII("Primary color"), var1_1 + 10.0, var44_7, var5_3 - 20.0);
                                                                                                this.Illll(var46_10, var46_10.IllII(), StringFactory.IIII("Secondary color"), var1_1 + 10.0, var44_7 + 48.0, var5_3 - 20.0);
                                                                                                break block64;
                                                                                                var27_6.add(var50_40);
                                                                                                var51_51 = this.lllI(this.lIllIl.getOrDefault(var50_40, 0.0), 1.0, 13.5);
                                                                                                break block86;
lbl137:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    v7 = var28_22.size();
                                                                                                    if (!var29_23) ** continue;
                                                                                                    ** continue;
                                                                                                    break;
                                                                                                }
lbl141:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    v8 = false;
                                                                                                    break block71;
                                                                                                    break;
                                                                                                }
lbl144:
                                                                                                // 1 sources

                                                                                                while (true) {
                                                                                                    continue;
                                                                                                    break;
                                                                                                }
                                                                                            }
lbl147:
                                                                                            // 2 sources

                                                                                            while (true) {
                                                                                                continue;
                                                                                                break;
                                                                                            }
lbl149:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                continue;
                                                                                                break;
                                                                                            }
lbl151:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                continue;
                                                                                                break;
                                                                                            }
lbl153:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                v5 = false;
                                                                                                break block70;
                                                                                                break;
                                                                                            }
lbl156:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                v8 = true;
                                                                                                break block71;
                                                                                                break;
                                                                                            }
lbl159:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                var23_20 = var21_19 + 24.0;
                                                                                                ** continue;
                                                                                                break;
                                                                                            }
                                                                                            var31_26 = v2;
                                                                                            var33_29 = (double)var30_25 * var25_21 + 8.0 + var31_26;
                                                                                            ** while (true)
lbl165:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                if (var9_5 != lIIIIlll.ll) ** continue;
                                                                                                break block72;
                                                                                                break;
                                                                                            }
lbl168:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                continue;
                                                                                                break;
                                                                                            }
lbl170:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                v4 = 1;
                                                                                                ** continue;
                                                                                                break;
                                                                                            }
lbl173:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                v9 = var60_45 << 24 | this.IIlIlI.IIlIIl() & 0xFFFFFF;
lbl175:
                                                                                                // 2 sources

                                                                                                while (true) {
                                                                                                    var61_46 = v9;
                                                                                                    this.lIlIIII(Theme.Illl.toString(), var46_12, var57_49, var19_18, var21_19, var61_46);
                                                                                                    ** continue;
                                                                                                    break;
                                                                                                }
                                                                                                break;
                                                                                            }
                                                                                            var45_36 = var43_34 / var18_17;
                                                                                            break block87;
lbl181:
                                                                                            // 1 sources

                                                                                            while (true) {
                                                                                                this.IIIIl.put(var45_35, var54_42);
                                                                                                ** continue;
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        var29_23 = v5;
                                                                                        ** while (true)
                                                                                    }
                                                                                    orchard.internal.IIIlI.lIllll(this.lllIll());
                                                                                    this.lIllIl.keySet().removeIf((Predicate<Theme>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Z, lIlIlI(java.util.Set orchard.core.Theme ), (Lorchard/core/Theme;)Z)(var27_6));
                                                                                    ** while (true)
lbl193:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var53_52 = this.lllI(this.IIIIl.getOrDefault(var50_40, var48_38 + 18.0), var48_38, 14.0);
                                                                                        ** continue;
                                                                                        break;
                                                                                    }
lbl196:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        v0 = 255.0;
                                                                                        break block57;
                                                                                        break;
                                                                                    }
                                                                                }
lbl200:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    ++var31_27;
                                                                                    ** GOTO lbl6
                                                                                    break;
                                                                                }
                                                                            }
                                                                            this.lIllIl.put(var50_40, var51_51);
                                                                            ** while (true)
                                                                        }
                                                                        var9_5 = this.IllII.lIl;
                                                                        break block88;
lbl210:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            this.llIIII.Il(var1_1, var12_14, var5_3, Math.max(0.0, var7_4 - (var12_14 - var3_2)), null, (lllIlIlI)LambdaMetafactory.metafactory(null, null, null, (DDDD)Z, lIIIlII(double double double double ), (DDDD)Z)((lIllIIlI)this));
                                                                            ** continue;
                                                                            break;
                                                                        }
                                                                    }
                                                                    var62_47 = v1;
                                                                    ** while (true)
                                                                }
                                                                var10_13 = this.IIlIIlI(var1_1 + 8.0, var3_2 + 8.0, Math.max(0.0, var5_3 - 16.0), var9_5);
                                                                var12_14 = var10_13 + 8.0;
                                                                ** while (true)
lbl220:
                                                                // 1 sources

                                                                while (true) {
                                                                    v9 = var60_45 << 24 | 0xFFFFFF;
                                                                    ** continue;
                                                                    break;
                                                                }
                                                            }
                                                            var44_9 = var43_34 % var18_17;
                                                            ** while (true)
                                                        }
                                                        v6 = 220.0;
                                                        ** while (true)
                                                        var46_11 = var43_34 % var18_17;
                                                        var47_37 = var43_34 / var18_17;
                                                        ** while (true)
lbl232:
                                                        // 1 sources

                                                        while (true) {
                                                            var50_40 = Theme.Illl;
                                                            ** continue;
                                                            break;
                                                        }
                                                    }
                                                    var46_12 = var41_33 + (double)var44_9 * (var19_18 + var16_16);
                                                    var48_38 = var12_14 + 8.0 + (double)var45_36 * var25_21 - var39_32;
                                                    ** while (true)
lbl239:
                                                    // 1 sources

                                                    while (true) {
                                                        orchard.internal.IIIlI.llII(this.lllIll(), var1_1, var12_14, var1_1 + var5_3, var12_14 + var35_30);
                                                        ** continue;
                                                        break;
                                                    }
                                                }
                                                this.IIlIlI.I(var48_38, var58_44, var19_18, var23_20, var21_19, var45_35, (boolean)var60_45, var56_43);
                                                ** while (var60_45 == 0)
lbl245:
                                                // 1 sources

                                                ** while (true)
                                            }
                                            var57_49 = var53_52 + (1.0 - var55_48) * 10.0;
                                            ** while (this.lIlIl.IlI().lIIIII().lIll() != Theme.Illl)
lbl249:
                                            // 1 sources

                                            ** while (true)
                                            var56_43 = this.IlIl(var52_41);
                                            break block89;
                                        }
                                        ** while (var9_5 != lIIIIlll.ll)
lbl254:
                                        // 1 sources

                                        ** while (true)
                                        var27_6.add(var45_35);
                                        var52_41 = this.lllI(this.lIllIl.getOrDefault(var45_35, 0.0), 1.0, 13.5);
                                        ** while (true)
                                        var60_45 = (int)Math.round(var55_48 * v6);
                                        ** while (!var59_50)
lbl261:
                                        // 1 sources

                                        ** while (true)
                                    }
                                    var61_46 = (int)Math.round(var56_43 * v0);
                                    ** while (true)
                                    var39_32 = this.IIIIIl(4L, this.IllII.lllI);
                                    var41_33 = var1_1 + 10.0 + Math.max(0.0, (var14_15 - ((double)var18_17 * var19_18 + (double)(var18_17 - 1) * var16_16)) * 0.5);
                                    ** while (true)
                                }
                                var58_44 = var54_42 + (1.0 - var56_43) * 10.0;
                                ** while (this.lIlIl.IlI().lIIIII().lIll() != var45_35)
lbl271:
                                // 1 sources

                                ** while (true)
                            }
                            var28_22 = new ArrayList<Theme>();
                            var29_24 = Theme.values();
                            var30_25 = var29_24.length;
                            var31_27 = 0;
                            ** while (true)
                        }
                        var59_50 = v8;
                        ** while (true)
                    }
                    var30_25 = (v7 + v3 + var18_17 - 1) / var18_17;
                    ** while (true)
                    var35_30 = Math.max(0.0, var7_4 - (var12_14 - var3_2));
                    var37_31 = Math.max(0.0, var33_29 - var35_30);
                    this.IllII.lllI = Math.max(0.0, Math.min(var37_31, this.IllII.lllI));
                    ** while (true)
                    this.lIllIl.put(var45_35, var52_41);
                    var54_42 = this.lllI(this.IIIIl.getOrDefault(var45_35, var50_39 + 18.0), var50_39, 14.0);
                    ** while (true)
                }
                var32_28 = var29_24[var31_27];
                ** while (var32_28 == Theme.Illl)
lbl295:
                // 1 sources

                ** while (true)
lbl296:
                // 1 sources

                while (true) {
                    var21_19 = Math.max(32.0, var19_18 * 0.48);
                    ** continue;
                    break;
                }
            }
            v2 = 100.0;
            ** while (true)
        }
        var18_17 = Math.max(1, Math.min(4, (int)((var14_15 + var16_16) / (74.0 + var16_16))));
        var19_18 = Math.max(1.0, (var14_15 - var16_16 * (double)(var18_17 - 1)) / (double)var18_17);
        ** while (true)
        this.llIIII.II(var46_12, var57_49, var19_18, var23_20, (IIIIlIII)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/client/gui/Click;Z)Z, lIlIIl(net.minecraft.client.gui.Click boolean ), (Lnet/minecraft/client/gui/Click;Z)Z)((lIllIIlI)this));
        ++var43_34;
        ** while (true)
        this.lIlIIII(var45_35.toString(), var48_38, var58_44, var19_18, var21_19, var62_47);
        this.llIIII.II(var48_38, var58_44, var19_18, var23_20, (IIIIlIII)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/client/gui/Click;Z)Z, lllll(orchard.core.Theme net.minecraft.client.gui.Click boolean ), (Lnet/minecraft/client/gui/Click;Z)Z)((lIllIIlI)this, (Theme)var45_35));
        ** while (true)
    }

    public void onFilesDropped(List<Path> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        if (this.IllII.l != orchard.internal.Illl.ll) {
            return;
        }
        if (this.IlII) {
            this.IllII(list);
            return;
        }
        try {
            if (Files.size(list.get(0)) > 524288L) {
                this.IIllII = StringFactory.IIl(lIllIIlI.llIlIII('\ub37f', (short)62767, 1290751456));
                return;
            }
            String string = Files.readString(list.get(0));
            boolean bl = this.IlIlIl.IlIlI(string, this.lIlIl.IlI());
            String string2 = this.IIllII = bl ? StringFactory.IIl(lIllIIlI.llIlIII('\ub37e', (short)56115, 951020056)) : StringFactory.IIl(lIllIIlI.llIlIII('\ub37d', (short)43113, -74115819));
            if (bl) {
                this.lIlIl.I();
            }
        }
        catch (Exception exception) {
            this.IIllII = StringFactory.IIl(lIllIIlI.llIlIII('\ub37c', (short)30187, -1578427701));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IlII(ModuleBase ... moduleBaseArray) {
        double d = 0.0;
        int n = 0;
        ModuleBase[] moduleBaseArray2 = moduleBaseArray;
        int n2 = moduleBaseArray2.length;
        int n3 = 0;
        while (n3 < n2) {
            ModuleBase moduleBase = moduleBaseArray2[n3];
            if (moduleBase != null) {
                d += this.lIIIlI(moduleBase);
                ++n;
            }
            ++n3;
        }
        return d + (double)Math.max(0, n - 1) * 6.0;
    }

    private double IlIl(double d) {
        double d2 = Math.max(0.0, Math.min(1.0, d));
        double d3 = 1.0 - d2;
        return 1.0 - d3 * d3 * d3;
    }

    private void IllI() {
        this.lIIlll();
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lIII(ModuleBase moduleBase, IIllIl<?> iIllIl) {
        if (iIllIl instanceof llIlIlI) {
            llIlIlI llIlIlI2 = (llIlIlI)iIllIl;
            return 24.0 + (double)Math.max(1, llIlIlI2.IIIl().size()) * 21.0;
        }
        if (iIllIl instanceof Illllll) {
            Illllll illllll = (Illllll)iIllIl;
            int n = Math.max(1, illllll.lll().size());
            if (this.lllIIl == null) return 31.0 + (double)n * 21.0;
            if (!this.lllIIl.I(illllll, illllll.lll().size())) return 31.0 + (double)n * 21.0;
            n = Math.max(n, illllll.lll().size() + 1);
            return 31.0 + (double)n * 21.0;
        }
        if (iIllIl instanceof lIlIIlI) return 44.0;
        if (iIllIl instanceof IIIlIlIIl) return 44.0;
        if (iIllIl instanceof llIlIlII) return 44.0;
        return 27.0;
    }

    public boolean shouldPause() {
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIl(IlIlllII ilIlllII, String string) {
        if (this.lllIIl == null || !this.lllIIl.Il(ilIlllII)) {
            this.llIlII();
            this.lllIIl = ilIlllII;
            this.l = string != null ? string : "";
            return;
        }
    }

    private int lIlI(int n, double d) {
        double d2 = Math.max(0.0, Math.min(1.0, d));
        int n2 = (int)Math.round((double)(n >>> 24 & 0xFF) * d2);
        return n2 << 24 | n & 0xFFFFFF;
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean lIll(ModuleBase moduleBase, long l2, lllIlIII lllIlIII2, Click click, boolean bl) {
        if (moduleBase == null) return true;
        if (!moduleBase.lllllI()) return true;
        moduleBase.llllIl();
        if (moduleBase.IIIlIIl()) {
            this.IllII.III(l2);
        } else {
            if (this.IllII.lI(l2)) {
                this.IllII.ll();
            }
            if (this.IllI == lllIlIII2) {
                this.IllI = null;
            }
        }
        this.IllI();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean mouseDragged(Click click, double d, double d2) {
        this.IIIIIIl();
        Click click2 = this.llIIlII(this.IIIIlIl(click));
        double d3 = click2.x();
        double d4 = click2.y();
        if (this.lllIII == IIlllllI.I) {
            this.IllII.IllI = d3 - this.IIllIl;
            this.IllII.III = d4 - this.IIllll;
            this.IllII.lll(this.IlIIl.I(), this.IlIIl.ll());
            this.lIIlll();
            return true;
        }
        if (this.lllIII == IIlllllI.II) {
            this.IlIIl(d3, d4);
            return true;
        }
        if (this.IllI != null) {
            this.lIllI(d3, d4);
            return true;
        }
        if (this.Illll != null) {
            this.IIlII(this.Illll, d3);
            return true;
        }
        if (this.llIIlI != null) {
            this.IllIlll(this.llIIlI, d3, this.lIlII);
            return true;
        }
        if (this.IlI == null) return true;
        this.lIIllll(this.IlI, d3, click2.button() == 1);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void llIl() {
        this.llIlI = null;
        this.IIlII = null;
        this.IIII = null;
    }

    private double lllI(double d, double d2, double d3) {
        double d4 = Math.max(0.0, Math.min(1.0, this.IIIlI * d3));
        return d + (d2 - d) * d4;
    }

    private double llll(IIlllIll iIlllIll) {
        return 56.0 + (double)Math.max(1, iIlllIll.lllII().size()) * 25.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIIIl(Click click) {
        double d = this.lIlIIll();
        List<String> list = this.IlIlllI(d);
        double d2 = 11.0;
        double d3 = this.lllIII(list.size(), d2);
        double d4 = ((double)this.IlIIl.I() - d) * 0.5;
        double d5 = ((double)this.IlIIl.ll() - d3) * 0.5;
        double d6 = d5 + d3 - 27.0;
        double d7 = d4 + d * 0.5 - 80.0;
        double d8 = d4 + d * 0.5 + 10.0;
        if (!lIllIIlI.IlIIIll(click.x(), click.y(), d8 - 4.0, d6 - 4.0, 78.0, 27.0)) {
            if (lIllIIlI.IlIIIll(click.x(), click.y(), d7 - 4.0, d6 - 4.0, 78.0, 27.0)) {
                this.llIl();
                return true;
            }
            if (lIllIIlI.IlIIIll(click.x(), click.y(), d4 - 4.0, d5 - 4.0, d + 8.0, d3 + 8.0)) return true;
            this.llIl();
            return true;
        }
        IlIlIllI ilIlIllI = this.llIlI;
        this.llIl();
        if (ilIlIllI != null) {
            ilIlIllI.I();
        }
        this.IllI();
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private static boolean IIIlI(String var0) {
        block6: {
            block7: {
                block9: {
                    block8: {
                        if (var0 != null) break block7;
lbl2:
                        // 2 sources

                        return false;
lbl4:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
lbl6:
                        // 1 sources

                        return false;
                        var2_2 = var0.charAt(var1_1);
                        if (var2_2 == '_' || Character.isDigit(var2_2)) break block8;
                        break block9;
lbl11:
                        // 1 sources

                        while (true) {
                            var1_1 = 0;
lbl13:
                            // 2 sources

                            while (var1_1 < var0.length()) {
                                ** continue;
lbl15:
                                // 1 sources

                                ** GOTO lbl4
                            }
                            break block6;
                            break;
                        }
                    }
lbl18:
                    // 2 sources

                    while (true) {
                        ++var1_1;
                        ** GOTO lbl13
                        break;
                    }
                }
                ** while (Character.isUpperCase((char)var2_2))
lbl23:
                // 1 sources

                ** while (true)
            }
            ** while (!var0.isEmpty())
lbl26:
            // 1 sources

            ** while (true)
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIll(boolean bl) {
        String string;
        String string2 = lIllIIlI.lIIIII(this.lIlIlI);
        if (string2.isBlank()) {
            this.IIllII = "Profile name required";
            return;
        }
        if (string2.length() > 20) {
            string2 = string2.substring(0, 20);
        }
        if (!bl && this.IlIlIl.ll().contains(string2)) {
            this.IIllII = "Profile already exists";
            return;
        }
        boolean bl2 = this.IlIlIl.IIII(string2, this.lIlIl.IlI());
        if (bl2) {
            String string3 = string2;
            String string4 = "Saved ";
            string = string4 + string3;
        } else {
            string = "Save failed";
        }
        this.IIllII = string;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IIlII(lIlIIlI lIlIIlI2, double d) {
        double d2 = IIIIlIIII.IIII((d - this.lIlIIl) / Math.max(1.0, this.llllI), 0.0, 1.0);
        lIlIIlI2.lI(lIlIIlI2.Ill() + (lIlIIlI2.Il() - lIlIIlI2.Ill()) * d2);
        this.IllI();
    }

    /*
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static String IIlIl(String string) {
        if (string == null) return "";
        if (string.isEmpty()) return "";
        int n = string.length();
        int n2 = n - 1;
        while (n2 >= 0 && Character.isWhitespace(string.charAt(n2))) {
            --n2;
        }
        while (n2 >= 0) {
            if (Character.isWhitespace(string.charAt(n2))) return string.substring(0, Math.max(0, n2 + 1));
            --n2;
        }
        return string.substring(0, Math.max(0, n2 + 1));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIllI() {
        Path path = this.lIlIl.IIl().IlIII();
        if (path == null) return;
        Util.getOperatingSystem().open(path);
        this.IIllII = "Opened profile folder";
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IIlll(IIIlIIIII iIIlIIIII, String string, IlIlIllI ilIlIllI) {
        this.IIlII = iIIlIIIII;
        this.IIII = string;
        this.llIlI = ilIlIllI;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IlIII(ModuleBase moduleBase) {
        double d = 27.0;
        for (IIllIl<?> iIllIl : moduleBase.IlIlIl()) {
            d += this.lIII(moduleBase, iIllIl);
        }
        if (moduleBase != null && moduleBase.lllllI()) {
            d += 27.0;
        }
        if (!(moduleBase instanceof IIlllIll)) return d;
        IIlllIll iIlllIll = (IIlllIll)moduleBase;
        return d += this.llll(iIlllIll);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIl(double d, double d2) {
        double d3 = this.IlllI(this.lIlIl.IlI().IIlIlI().size());
        this.IllII.IIlI = Math.max(8.0, Math.min(d - this.IIllIl, (double)this.IlIIl.I() - 190.0 - 8.0));
        this.IllII.lIIl = Math.max(8.0, Math.min(d2 - this.IIllll, (double)this.IlIIl.ll() - d3 - 8.0));
        this.lIIlll();
    }

    private static NativeImage IlIlI(byte[] byArray) {
        ByteArrayInputStream byteArrayInputStream;
        if (byArray == null || byArray.length < 12 || byArray.length > 0x800000) {
            return null;
        }
        NativeImage nativeImage = null;
        try {
            byteArrayInputStream = new ByteArrayInputStream(byArray);
            try {
                nativeImage = NativeImage.read((InputStream)byteArrayInputStream);
            }
            finally {
                byteArrayInputStream.close();
            }
        }
        catch (Throwable throwable) {
            nativeImage = null;
        }
        if (nativeImage == null) {
            try {
                byteArrayInputStream = new ByteArrayInputStream(byArray);
                try {
                    BufferedImage bufferedImage = ImageIO.read(byteArrayInputStream);
                    if (bufferedImage != null) {
                        nativeImage = lIllIIlI.llllI(bufferedImage);
                    }
                }
                finally {
                    byteArrayInputStream.close();
                }
            }
            catch (Throwable throwable) {
                nativeImage = null;
            }
        }
        if (nativeImage == null) {
            return null;
        }
        int n = nativeImage.getWidth();
        int n2 = nativeImage.getHeight();
        if (n < 16 || n > 4096 || n2 < 16 || n2 > 4096 || (long)n * (long)n2 > 0x1000000L) {
            try {
                nativeImage.close();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            return null;
        }
        return nativeImage;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void IlIll(int n) {
        int n2;
        int n3;
        block2: {
            n3 = 0;
            n2 = 0;
            boolean bl = true;
            do {
                if (!bl || (bl = false) || !true) {
                    ++n2;
                }
                if (n2 >= lIl.length) break block2;
            } while (lIl[n2] != this.IllII.IlII);
            n3 = n2;
        }
        n2 = (n3 + n + lIl.length) % lIl.length;
        this.IlIIIl(lIl[n2]);
        this.IllII.l = orchard.internal.Illl.Il;
        this.IlIIlI = false;
        this.lIIlll();
    }

    private void IllII(List<Path> list) {
        int n = 0;
        String string = null;
        for (Path path : list) {
            try {
                String string2;
                String string3;
                if (path == null || !Files.isRegularFile(path, new LinkOption[0]) || Files.size(path) > 18432L || !(string3 = path.getFileName().toString()).toLowerCase(Locale.ROOT).endsWith(".json") || (string2 = lIllIIlI.lIIIII(string3.substring(0, string3.length() - 5))).isBlank() || string2.length() > 20 || !this.IlIlIl.IIIlI(string2, Files.readString(path))) continue;
                ++n;
                string = string2;
            }
            catch (Exception exception) {}
        }
        this.IlII = false;
        if (n == 1) {
            String string4 = string;
            String string5 = "Config uploaded: ";
            this.IIllII = string5 + string4;
        } else if (n > 1) {
            String string6 = " configs uploaded.";
            int n2 = n;
            String string7 = "Uploaded ";
            this.IIllII = string7 + n2 + string6;
        } else {
            this.IIllII = "Upload failed. Drop a valid .json config.";
        }
    }

    private double IllIl(double d) {
        if (this.IllII.l != orchard.internal.Illl.I) {
            double d2 = this.IllII.IllI + this.IllII.llI * 0.5;
            return d2 + (d - d2) / this.IIllll();
        }
        return d;
    }

    /*
     * Enabled aggressive block sorting
     */
    public lIllIIlI(ClientEntrypoint clientEntrypoint, Illl illl) {
        super((Text)Text.literal((String)"Client"));
        Screen screen;
        this.IIIII = Double.NaN;
        this.Illl = Double.NaN;
        this.IlIIII = new HashMap<Long, Double>();
        this.lIlllI = new HashMap<Long, Double>();
        this.lIII = new HashMap<Long, Double>();
        this.lIllIl = new EnumMap(Theme.class);
        this.IIIIl = new EnumMap(Theme.class);
        this.llIIl = new HashMap();
        this.lIlI = Double.NaN;
        this.IIlIll = Double.NaN;
        this.Il = Double.NaN;
        this.lIIlIl = Double.NaN;
        this.IlIlII = Double.NaN;
        this.IIl = new HashMap();
        this.IlIIl = new IlIIlIIIl(1, 1, 1.0, 1.0);
        this.llIlll = llIIIlll.II;
        this.lIlIl = clientEntrypoint;
        this.IlIlIl = new CloudConfigManager(clientEntrypoint.IIl());
        this.lIlIl.IlIl().Il();
        this.IllII.l = illl != null ? illl : orchard.internal.Illl.Il;
        this.IllII.IIl(clientEntrypoint.IIl().lIIlI());
        this.IIIIlI(this.IllII.IlII);
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        Screen screen2 = screen = minecraftClient != null ? minecraftClient.currentScreen : null;
        if (screen instanceof lIllIIlI) {
            this.llIIll = null;
            return;
        }
        this.llIIll = screen;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IlllI(int n) {
        double d = this.IIlIllI();
        double d2 = (double)Math.max(0, n) * this.IIIlII();
        double d3 = Math.min(Math.max(184.0, (double)this.IlIIl.ll() - 44.0), 360.0);
        return Math.min(d3, Math.max(d + 7.0, d + 7.0 + d2));
    }

    /*
     * Enabled aggressive block sorting
     */
    private void Illll(Interface interface_, llIlIlII llIlIlII2, IIIlIIIII iIIlIIIII, double d, double d2, double d3) {
        Color color = (Color)llIlIlII2.lIl();
        this.IIIlIlI(iIIlIIIII, "", d, d2, Math.max(0.0, d3 - 19.0));
        orchard.internal.IIIlI.Illl(this.lllIll(), d + d3 - 16.0, d2 + 2.0, 14.0, 14.0, 4.0, IIIIlIIII.lllIl(color, color.getAlpha()));
        double d4 = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null)[0];
        this.IIlIlI.lIIll(d, d2 + 8.0, d3, d4, "", 0.82);
        this.llIIII.II(d, d2 + 12.0, d3, 28.0, (click, bl) -> {
            interface_.lIl(Theme.Illl);
            this.IllII.IIll = Theme.Illl;
            this.IlI = llIlIlII2;
            this.lIlIIl = d;
            this.llllI = d3;
            this.lIIllll(llIlIlII2, click.x(), click.button() == 1);
            return true;
        });
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private String lIIII() {
        if (this.client == null) {
            return "";
        }
        String string = this.client.keyboard.getClipboard();
        return string;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void close() {
        if (this.IlIlI) {
            return;
        }
        this.IlIlI = true;
        this.IlllIl = System.nanoTime();
        this.lIIlIll();
        this.lllIII = IIlllllI.l;
        this.IllI = null;
        this.Illll = null;
        this.llIIlI = null;
        this.IlI = null;
        this.IIllllI();
    }

    /*
     * Unable to fully structure code
     */
    private void lIIIl(DrawContext var1_1, int var2_2, int var3_3, float var4_4) {
        block15: {
            block16: {
                block14: {
                    block11: {
                        block13: {
                            block12: {
                                break block15;
lbl1:
                                // 1 sources

                                while (true) {
                                    var14_10 = var13_9.iterator();
                                    break block11;
                                    while (true) {
                                        var15_11.llII(var1_1, var2_2, var3_3, var4_4, false);
                                        break block11;
                                        while (true) {
                                            break block12;
                                            break;
                                        }
lbl9:
                                        // 1 sources

                                        while (true) {
                                            if (lIllIIlI.lIllll(var15_11)) ** continue;
                                            break block13;
                                            break;
                                        }
                                        while (true) {
                                            var14_10 = var13_9.iterator();
                                            break block13;
                                            break;
                                        }
                                        break;
                                    }
                                    break;
                                }
lbl15:
                                // 1 sources

                                while (true) {
                                    continue;
                                    break;
                                }
                            }
                            var16_12 = lIllIIlI.lIIllIl(var15_11);
                            this.llIIII.II(var15_11.IlII(), var15_11.IlIl(), Math.max(4.0, var15_11.III()), Math.max(4.0, var15_11.IIll()), (IIIIlIII)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/client/gui/Click;Z)Z, IlllIII(long orchard.internal.lllIlIII net.minecraft.client.gui.Click boolean ), (Lnet/minecraft/client/gui/Click;Z)Z)((lIllIIlI)this, (long)var16_12, (lllIlIII)var15_11));
                        }
                        if (var14_10.hasNext()) {
                            var15_11 = var14_10.next();
                            ** continue;
                        }
                        break block16;
                    }
lbl26:
                    // 2 sources

                    while (true) {
                        if (!var14_10.hasNext()) ** continue;
                        break block14;
                        break;
                    }
lbl29:
                    // 1 sources

                    while (true) {
                        orchard.internal.IIIlI.Illlll(var1_1, var9_7, 0.0, var9_7, var7_6, 1.0, this.IIlIlI.lIll(72));
                        ** continue;
                        break;
                    }
lbl32:
                    // 1 sources

                    while (true) {
                        if (lIllIIlI.lIllll(var15_11)) ** continue;
                        ** continue;
                        break;
                    }
lbl35:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var15_11 = var14_10.next();
                ** while (true)
                orchard.internal.IIIlI.Illlll(var1_1, 0.0, var11_8, var5_5, var11_8, 1.0, this.IIlIlI.lIll(72));
                var13_9 = this.lIlIl.IlI().IIlIlI();
                ** while (true)
            }
            this.llIIlI(var1_1, var13_9);
            return;
        }
        var5_5 = this.IlIIl.I();
        var7_6 = this.IlIIl.ll();
        ** while (true)
        var9_7 = var5_5 * 0.5;
        var11_8 = var7_6 * 0.5;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIllI(double d, double d2) {
        if (this.IllI == null) {
            return;
        }
        double d3 = d - this.IIllI;
        double d4 = d2 - this.IllIll;
        d3 = lIllIIlI.llIIIl(d3, this.IlIIl.I(), this.IllI.III());
        d4 = lIllIIlI.llIIIl(d4, this.IlIIl.ll(), this.IllI.IIll());
        this.IllI.lllI(d3, d4);
        this.IllI();
    }

    public void renderBackground(DrawContext drawContext, int n, int n2, float f) {
    }

    /*
     * Exception decompiling
     */
    private static byte[] llIII(String var0) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[TRYBLOCK]], but top level block is 22[WHILELOOP]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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
    public void resize(int n, int n2) {
        super.resize(n, n2);
        this.IIIIIIl();
        if (this.IllII.l == orchard.internal.Illl.I) return;
        this.IllII.lIl(this.IlIIl.I(), this.IlIIl.ll());
        this.lIIlll();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void llIIl(DrawContext drawContext, double d5, double d6, double d7, double d8) {
        boolean bl = this.lIlIll != null && !this.lIlIll.isBlank();
        List<ModuleBase> list = !bl ? this.lIlIl.IlI().III(this.IllII.IlII) : this.lIlIl.IlI().IIIIIll();
        List<ModuleBase> list2 = this.IIllIl(list);
        list2 = this.llIIIII(list2);
        double d9 = 22.0;
        this.IlIllII(drawContext, d5, d6, Math.max(0.0, d7), d9);
        double d10 = d6 + d9 + 8.0;
        double d11 = this.lIIlIlI(d5, d10, d7);
        double d12 = d11 + 8.0;
        double d13 = Math.max(0.0, d6 + d8 - d12);
        this.llIIII.Il(d5, d12, d7, d13, null, (d, d2, d3, d4) -> {
            this.IllII.lII(this.IllII.IlII, this.IllII.llI(this.IllII.IlII) - d4 * 28.0);
            this.lIIlll();
            return true;
        });
        double d14 = 6.0;
        double d15 = Math.max(0.0, (d7 - d14) * 0.5);
        double d16 = Math.max(0.0, this.IIIlIIl(list2) - d13);
        double d17 = Math.max(0.0, Math.min(d16, this.IllII.llI(this.IllII.IlII)));
        if (d17 != this.IllII.llI(this.IllII.IlII)) {
            this.IllII.lII(this.IllII.IlII, d17);
            this.lIIlll();
        }
        double d18 = this.IIIIIl(this.lIllIlI(this.IllII.IlII), d17);
        double d19 = d12 - d18;
        double d20 = d12 - d18;
        orchard.internal.IIIlI.llII(drawContext, d5 - 10.0, d12, d5 + d7 + 10.0, d6 + d8);
        if (list2.isEmpty()) {
            String string;
            if (this.lIlIll.isBlank()) {
                var53_21 = lIllIIlI.IllIIII(this.IllII.IlII);
                String string2 = "No modules in ";
                string = string2 + var53_21;
            } else {
                String string3 = this.lIlIll.trim();
                var53_21 = "No matches for ";
                string = var53_21 + string3;
            }
            String string4 = string;
            this.IIlIlI.IlllI(string4, d5 + d7 * 0.5, d12 + d13 * 0.45, this.IIlIlI.II(), d7 - 20.0);
        }
        double d21 = d12 + d13;
        this.llIIII.lI(d5 - 10.0, d12, d7 + 20.0, d13);
        try {
            for (int i = 0; i < list2.size(); ++i) {
                ModuleBase moduleBase = list2.get(i);
                double d22 = this.lIlIlII(moduleBase);
                double d23 = this.llIllI - (double)i * 0.03;
                double d24 = Math.max(0.0, Math.min(1.0, d23 / 0.22));
                double d25 = this.IllllI(d24);
                double d26 = (1.0 - d25) * 15.0;
                if (i % 2 == 0) {
                    if (d19 + d22 > d12 && d19 < d21) {
                        this.IIllIlI(drawContext, moduleBase, d5, d19 + d26, d15, d12, d21, d24);
                    }
                    d19 += d22 + d14;
                    continue;
                }
                if (d20 + d22 > d12 && d20 < d21) {
                    this.IIllIlI(drawContext, moduleBase, d5 + d15 + d14, d20 + d26, d15, d12, d21, d24);
                }
                d20 += d22 + d14;
            }
        }
        finally {
            this.llIIII.l();
        }
        orchard.internal.IIIlI.lIllll(drawContext);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIlI(KeyInput keyInput) {
        int n = keyInput.key();
        int n2 = keyInput.modifiers();
        if (n != 65) return false;
        if ((n2 & 0xA) != 0) return true;
        if (!this.lIIlllI()) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void llIll(DrawContext drawContext, double d, double d6, double d7, double d8) {
        this.IIlIlI.lIIl(StringFactory.IIII("Control Panel"), d + d7 * 0.5, d6 + 4.0, this.IIlIlI.llIII(), d7);
        this.IIlIlI.lIIl(StringFactory.IIII("Core movement, rendering, input simulation, and emergency controls"), d + d7 * 0.5, d6 + 18.0, this.IIlIlI.II(), d7);
        MoveFix moveFix = this.lIlIl.IlI().lIIlll();
        Rotations rotations = this.lIlIl.IlI().llIIII();
        ClickSimulations clickSimulations = this.lIlIl.IlI().lIlII();
        VisualSwitch visualSwitch = this.lIlIl.IlI().IIIlII();
        Interface interface_ = this.lIlIl.IlI().lIIIII();
        Panic panic = this.lIlIl.IlI().IlllI();
        double d9 = Math.min(520.0, Math.max(0.0, d7));
        double d10 = d + (d7 - d9) * 0.5;
        boolean bl = d9 >= 340.0;
        double d11 = this.IlII(moveFix, rotations, clickSimulations);
        double d12 = this.IlII(visualSwitch, interface_, panic);
        double d13 = bl ? Math.max(d11, d12) : d11 + 6.0 + d12;
        double d14 = d6 + 34.0;
        double d15 = Math.max(0.0, d8 - 34.0);
        double d16 = Math.max(0.0, d13 - d15);
        double d17 = Math.max(0.0, Math.min(d16, this.IllII.IIII));
        if (d17 != this.IllII.IIII) {
            this.IllII.IIII = d17;
            this.lIIlll();
        }
        double d18 = d14 - d17;
        this.llIIII.Il(d10, d14, d9, d15, null, (d2, d3, d4, d5) -> {
            this.IllII.IIII = Math.max(0.0, Math.min(d16, this.IllII.IIII - d5 * 28.0));
            this.lIIlll();
            return true;
        });
        orchard.internal.IIIlI.llII(drawContext, d10, d14, d10 + d9, d14 + d15);
        this.llIIII.lI(d10, d14, d9, d15);
        try {
            if (bl) {
                double d19 = (d9 - 6.0) * 0.5;
                double d20 = d18;
                d20 += this.IlIlll(drawContext, moveFix, d10, d20, d19) + 6.0;
                d20 += this.IlIlll(drawContext, rotations, d10, d20, d19) + 6.0;
                this.IlIlll(drawContext, clickSimulations, d10, d20, d19);
                double d21 = d18;
                d21 += this.IlIlll(drawContext, visualSwitch, d10 + d19 + 6.0, d21, d19) + 6.0;
                d21 += this.IlIlll(drawContext, interface_, d10 + d19 + 6.0, d21, d19) + 6.0;
                this.IlIlll(drawContext, panic, d10 + d19 + 6.0, d21, d19);
            } else {
                double d22 = d18;
                d22 += this.IlIlll(drawContext, moveFix, d10, d22, d9) + 6.0;
                d22 += this.IlIlll(drawContext, rotations, d10, d22, d9) + 6.0;
                d22 += this.IlIlll(drawContext, clickSimulations, d10, d22, d9) + 6.0;
                d22 += this.IlIlll(drawContext, visualSwitch, d10, d22, d9) + 6.0;
                d22 += this.IlIlll(drawContext, interface_, d10, d22, d9) + 6.0;
                this.IlIlll(drawContext, panic, d10, d22, d9);
            }
        }
        finally {
            this.llIIII.l();
            orchard.internal.IIIlI.lIllll(drawContext);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean mouseScrolled(double d, double d2, double d3, double d4) {
        if (this.IlIlI) {
            return true;
        }
        this.IIIIIIl();
        double d5 = this.IllIl(this.IlIIl.l(d));
        double d6 = this.Illlll(this.IlIIl.II(d2));
        return this.llIIII.I(d5, d6, d3, d4);
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private void lllIl(double d5, double d6, double d7, double d8) {
        double d9 = this.IIIIIl(3L, this.IllII.llII);
        double d10 = d6 + 8.0 - d9;
        this.llIIII.Il(d5, d6, d7, d8, null, (d, d2, d3, d4) -> {
            this.IllII.llII = Math.max(0.0, this.IllII.llII - d4 * 28.0);
            this.lIIlll();
            return true;
        });
        orchard.internal.IIIlI.llII(this.lllIll(), d5, d6, d5 + d7, d6 + d8);
        this.IlIIIlI(StringFactory.IIII("Menu"), lIIllllI.IlIl(this.lIlIl.IIl().IlIll()), d5, d10, d7, () -> this.lIIIll(IlIlIIlIl.III(this.lIlIl)));
        d10 += 30.0;
        for (Object object : this.lIlIl.IlI().IIIIIll()) {
            this.IlIIIlI(((ModuleBase)object).IIIlllI(), lIIllllI.IlIl(((ModuleBase)object).IIIllII()), d5, d10, d7, () -> this.llIIIll((ModuleBase)object));
            d10 += 27.0;
        }
        IIlllIll iIlllIll = this.lIlIl.IlI().IllI();
        if (iIlllIll != null) {
            Object object;
            object = iIlllIll.lllII().iterator();
            boolean bl = true;
            while (true) {
                llIlIlIl llIlIlIl2;
                String string;
                if (!bl || (bl = false) || !true) {
                    String string2 = string;
                    this.IlIIIlI(StringFactory.IIII("Preset: ").llIl(StringFactory.lIl(llIlIlIl2.II())), string2, d5, d10, d7, () -> this.lIIIll(IlIlIIlIl.II(iIlllIll, llIlIlIl2.Il())));
                    d10 += 27.0;
                }
                if (!object.hasNext()) break;
                llIlIlIl2 = (llIlIlIl)object.next();
                if (llIlIlIl2.l() != null && !llIlIlIl2.l().isBlank()) {
                    string = llIlIlIl2.l();
                    continue;
                }
                string = "Bind";
            }
        }
        orchard.internal.IIIlI.lIllll(this.lllIll());
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    private static NativeImage llllI(BufferedImage bufferedImage) {
        if (bufferedImage == null) {
            return null;
        }
        int n = bufferedImage.getWidth();
        int n2 = bufferedImage.getHeight();
        if (n < 16) return null;
        if (n > 4096) return null;
        if (n2 < 16) return null;
        if (n2 > 4096) {
            return null;
        }
        NativeImage nativeImage = new NativeImage(n, n2, true);
        int n3 = 0;
        boolean bl = true;
        block0: while (true) {
            if (!bl || (bl = false) || !true) {
                ++n3;
            }
            if (n3 >= n2) return nativeImage;
            int n4 = 0;
            while (true) {
                if (n4 >= n) continue block0;
                nativeImage.setColorArgb(n4, n3, bufferedImage.getRGB(n4, n3));
                ++n4;
            }
            break;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean lllll(Theme theme, Click click, boolean bl) {
        this.lIlIl.IlI().lIIIII().lIl(theme);
        this.IllII.IIll = theme;
        this.IIllII = "";
        this.IllI();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIII(ModuleBase moduleBase) {
        if (moduleBase == null) {
            return;
        }
        String string = moduleBase.llIlll();
        if (!moduleBase.IIIlIIl() && string != null && !string.isBlank()) {
            this.IIlII = moduleBase.IIIlllI();
            this.IIII = string;
            this.llIlI = () -> moduleBase.IIlIIll(true);
            return;
        }
        moduleBase.llllIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IIIIIl(long l2, double d) {
        double d2 = this.lIII.getOrDefault(l2, d);
        d2 = Double.isFinite(d2) && !(Math.abs(d2 - d) < 0.35) ? this.lllI(d2, d, 18.0) : d;
        this.lIII.put(l2, d2);
        return d2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIIlI(Category category) {
        if (category == null) {
            return;
        }
        this.IllII.lII(category, 0.0);
        this.lIII.put(this.lIllIlI(category), 0.0);
    }

    private double IIIlII() {
        return 23.0;
    }

    private static long IIIlIl(long l2, long l3, long l4) {
        long l5 = l2;
        l5 = (l5 ^ l3) * 1099511628211L;
        return (l5 ^ l4) * 1099511628211L;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIllI(DrawContext drawContext) {
        if (this.llIl < 0.0) {
            this.llIl = this.IlIll;
            this.llIlII = this.lIIllI;
            this.IllllI = this.Illlll;
        }
        double d = Math.sin(this.lIIII * 6.28 * 1.5) * 0.5 + 0.5;
        int n = (int)(d * 255.0);
        int n2 = this.IIlIlI.llIII() & 0xFFFFFF | n << 24;
        orchard.internal.IIIlI.Illl(drawContext, this.llIl, this.llIlII, 1.5, this.IllllI, 0.75, n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIlIIl(ModuleBase moduleBase) {
        if (moduleBase == null) {
            return false;
        }
        if (moduleBase.IlIlIIl() == Category.l) return true;
        if (moduleBase.IlIlIIl() != Category.I) {
            if (moduleBase instanceof PotAssist) return true;
            if (moduleBase instanceof BreachSwap) {
                return true;
            }
            long l2 = moduleBase.IlIIIll().lIl();
            if (!llll.contains(l2)) return lIIIll.contains(l2);
            return false;
        }
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IIllII(double d, double d2, double d3) {
        int n = this.IIIlII ? IIIIlIIII.lllIl(new Color(21, 23, 28), 210) : -15395044;
        orchard.internal.IIIlI.Illl(this.lllIll(), d + 6.0, d2 + 6.0, 100.0, d3 - 12.0, 7.0, n);
        double d4 = d2 + 52.0;
        for (Category category : lIl) {
            int n2;
            int n3;
            double d5;
            boolean bl2 = this.IllII.l == orchard.internal.Illl.Il && this.IllII.IlII == category;
            double d6 = this.IIl.getOrDefault((Object)category, 0.0);
            double d7 = bl2 ? 2.0 : 0.0;
            double d8 = this.lllI(d6, d7, 18.0);
            this.IIl.put(category, d8);
            double d9 = d + 18.0 + d8;
            double d10 = d4 - 6.0;
            double d11 = 24.0;
            double d12 = 92.0;
            double d13 = 0.85;
            double d14 = orchard.internal.IIIlI.IllIII(this.textRenderer);
            double d15 = d10 + (d11 - d14 * d13) * 0.5;
            String string = lIllIIlI.IllIIII(category);
            double d16 = lIllIIlI.lIIlIII(d10, d11);
            double d17 = d9 + 20.0;
            double d18 = d5 = d7 <= 0.0 ? 0.0 : d8 / d7;
            if (d5 > 0.01) {
                n3 = this.IlIlIl(this.IIlIlI.IIlIIl(), d + 10.0, d10, 0);
                n2 = (int)(d5 * 150.0);
                int n4 = n3 & 0xFFFFFF | n2 << 24;
                orchard.internal.IIIlI.Illl(this.lllIll(), d + 10.0, d10, d12, d11, 6.0, n4);
            }
            n3 = -1;
            n2 = -1;
            orchard.internal.IIIlI.lIlIIl(this.lllIll());
            try {
                orchard.internal.IIIlI.Ill(this.lllIll(), d17, d15);
                orchard.internal.IIIlI.IIlll(this.lllIll(), d13, d13);
                this.IIlIlI.IllI(string, 0.0, 0.0, n3);
            }
            finally {
                orchard.internal.IIIlI.IlIllI(this.lllIll());
            }
            this.IIlIlI.lllII(category, d9, d16, n2);
            this.llIIII.II(d + 10.0, d10, d12, d11, (click, bl) -> {
                this.IlIIlIl();
                this.IlIIIl(category);
                this.IllII.l = orchard.internal.Illl.Il;
                this.IlIIlI = false;
                this.lIIlll();
                return true;
            });
            d4 += 28.0;
        }
        this.lIlllll(d, d2, d3);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void render(DrawContext drawContext, int n, int n2, float f) {
        boolean bl = this.lIlIl.IlI().IIIlIIl().IIIlIIl();
        drawContext = this.lIlIl.IlI().IIIlIIl().IIl(drawContext, n, n2);
        if (!bl && this.llIIll != null) {
            try {
                this.llIIll.render(drawContext, n, n2, f);
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
        this.llI = false;
        Interface interface_ = this.lIlIl.IlI().lIIIII();
        this.IIIIIIl();
        int n3 = this.IlIIl.I();
        int n4 = this.IlIIl.ll();
        int n5 = (int)Math.round(this.IlIIl.l(n));
        int n6 = (int)Math.round(this.IlIIl.II(n2));
        this.IlI();
        if (this.IIllIIl(System.nanoTime())) {
            this.IIIlllI();
            return;
        }
        this.IllII.IIll = interface_.lIll();
        this.IllII.IIIl(n3, n4);
        if (this.IIlI && this.IllII.l != orchard.internal.Illl.I) {
            this.IllII.lIl(n3, n4);
            this.IIlI = false;
            this.lIIlll();
        } else if (this.IIlI) {
            this.IIlI = false;
        }
        double d = this.IllIl(n5);
        double d2 = this.Illlll(n6);
        this.IIlIII = d;
        this.lllIl = d2;
        this.llIIIl = drawContext;
        this.llIIII.ll();
        this.llIII = null;
        orchard.internal.IIIlI.lIIIII(drawContext);
        this.IIlIlI.lIlI(drawContext, this.textRenderer, interface_);
        Boolean bl2 = orchard.internal.IIIlI.lIl(false);
        orchard.internal.IIIlI.lIlIIl(drawContext);
        try {
            orchard.internal.IIIlI.IIlll(drawContext, this.IlIIl.Il(), this.IlIIl.lI());
            if (!bl) {
                this.IIlIlI.ll(n3, n4);
                if (interface_.lllI()) {
                    this.IIIllII(drawContext, interface_);
                }
            }
            if (this.IllII.l == orchard.internal.Illl.I) {
                this.lIIIl(drawContext, n5, n6, f);
            } else {
                double d3 = this.IIllll();
                double d4 = this.IllII.IllI + this.IllII.llI * 0.5;
                double d5 = this.IllII.III + this.IllII.IIl * 0.5;
                orchard.internal.IIIlI.lIlIIl(drawContext);
                try {
                    orchard.internal.IIIlI.Ill(drawContext, d4, d5);
                    orchard.internal.IIIlI.IIlll(drawContext, d3, d3);
                    orchard.internal.IIIlI.Ill(drawContext, -d4, -d5);
                    this.IlIIlI(drawContext, (int)Math.round(d), (int)Math.round(d2), f);
                    this.lIIllI(drawContext);
                }
                finally {
                    orchard.internal.IIIlI.IlIllI(drawContext);
                }
            }
            orchard.internal.IIIlI.lIIIII(drawContext);
            this.lIl(drawContext);
            this.IIIllIl(drawContext);
            this.IlIIlll(drawContext);
            this.IlllIl(drawContext);
            orchard.internal.IIIlI.lIIIII(drawContext);
        }
        finally {
            orchard.internal.IIIlI.IlIllI(drawContext);
            orchard.internal.IIIlI.IlIll(bl2);
        }
        orchard.internal.IIIlI.lIIIII(drawContext);
    }

    /*
     * Enabled aggressive block sorting
     */
    private List<ModuleBase> IIllIl(List<ModuleBase> list) {
        String string;
        String string2 = string = this.lIlIll == null ? "" : this.lIlIll.trim().toLowerCase(Locale.ROOT);
        if (string.isEmpty()) {
            return list;
        }
        ArrayList<ModuleBase> arrayList = new ArrayList<ModuleBase>();
        Iterator<ModuleBase> iterator = list.iterator();
        while (iterator.hasNext()) {
            ModuleBase moduleBase = iterator.next();
            if (!lIllIIlI.IlIIllI(moduleBase.IIIlllI(), string) && !lIllIIlI.IlIIllI(moduleBase.IlIIIll(), string)) continue;
            arrayList.add(moduleBase);
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlllI(ModuleBase moduleBase, double d, double d2, double d3, boolean bl, double d4) {
        IIIlIIIII iIIlIIIII = this.IIlIlI.IIIll(moduleBase.IIIlllI(), d3 / 0.92);
        int n = !bl ? -1 : this.IIlIlI.IIlIIl();
        n = this.lIlI(n, d4);
        int n2 = n;
        Runnable runnable = () -> {
            orchard.internal.IIIlI.lIlIIl(this.lllIll());
            try {
                orchard.internal.IIIlI.Ill(this.lllIll(), d, d2);
                orchard.internal.IIIlI.IIlll(this.lllIll(), 0.92, 0.92);
                this.IIlIlI.Illl(iIIlIIIII, 0.0, 0.0, n2);
            }
            finally {
                orchard.internal.IIIlI.IlIllI(this.lllIll());
            }
        };
        if (bl && this.lIlllII(moduleBase)) {
            orchard.internal.IIIlI.lllIII(true, runnable);
            return;
        }
        runnable.run();
    }

    private double IIllll() {
        return (0.82 + this.IlIl(this.lIIlI) * 0.18) * 0.95;
    }

    private void IlIIII(MinecraftClient minecraftClient) {
        if (this.IIIlII && minecraftClient != null && minecraftClient.getTextureManager() != null) {
            try {
                minecraftClient.getTextureManager().destroyTexture(lIllIIlI.IIlIIII());
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            this.IIIlII = false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIIl(Category category) {
        if (category == null) {
            return;
        }
        if (category != this.IllII.IlII) {
            this.IllII.IIII();
            this.IIIIlI(category);
        }
        this.IllII.IlII = category;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IlIIlI(DrawContext drawContext, int n, int n2, float f) {
        double d;
        int n3;
        double d2 = this.IllII.IllI;
        double d3 = this.IllII.III;
        double d4 = this.IllII.llI;
        double d5 = this.IllII.IIl;
        Interface interface_ = this.lIlIl.IlI().lIIIII();
        MinecraftClient minecraftClient = this.client != null ? this.client : MinecraftClient.getInstance();
        this.IIlIlll(minecraftClient, interface_);
        this.IIlIlI.IIlII(d2, d3, d4, d5, true);
        orchard.internal.IIIlI.Illl(this.lllIll(), d2 + 6.0, d3 + 6.0, d4 - 12.0, d5 - 12.0, 7.0, -15395044);
        if (this.IIIlII && (n3 = (int)Math.round(255.0 * (d = interface_ == null ? 1.0 : interface_.IIllI()))) > 0) {
            double d6 = d2 + 6.0;
            double d7 = d3 + 6.0;
            double d8 = d4 - 12.0;
            double d9 = d5 - 12.0;
            double d10 = 7.0;
            int n4 = n3 << 24 | 0xFFFFFF;
            orchard.internal.IIIlI.IIlIll(this.lllIll(), lIllIIlI.IIlIIII(), d6, d7, d8, d9, d10, n4);
        }
        this.llIIII.II(d2, d3, d4, 31.0, (click, bl) -> {
            this.lllIII = IIlllllI.I;
            this.IIllIl = click.x() - this.IllII.IllI;
            this.IIllll = click.y() - this.IllII.III;
            return true;
        });
        this.IIllII(d2, d3, d5);
        d = orchard.internal.IIIlI.IllIII(this.textRenderer);
        double d11 = 1.42;
        double d12 = 0.7;
        String string = "Orchard";
        String string2 = this.lIlIl.IlIl().II();
        double d13 = (double)this.IIlIlI.IIlI(string) * d11;
        double d14 = (double)this.IIlIlI.IIlI(string2) * d12;
        double d15 = 2.0;
        double d16 = d13 + d15 + d14;
        double d17 = d2 + (112.0 - d16) * 0.5;
        double d18 = d3 + 6.0;
        double d19 = d3 + 46.0;
        double d20 = d18 + (d19 - d18 - d * d11) * 0.5;
        double d21 = d17 + d13 + d15;
        double d22 = d20 + d * d11 - d * d12;
        orchard.internal.IIIlI.lIlIIl(this.lllIll());
        try {
            orchard.internal.IIIlI.Ill(this.lllIll(), d17, d20);
            orchard.internal.IIIlI.IIlll(this.lllIll(), d11, d11);
            this.IIlIlI.IllI(string, 0.0, 0.0, this.IIlIlI.llIII());
        }
        finally {
            orchard.internal.IIIlI.IlIllI(this.lllIll());
        }
        orchard.internal.IIIlI.lIlIIl(this.lllIll());
        try {
            orchard.internal.IIIlI.Ill(this.lllIll(), d21, d22);
            orchard.internal.IIIlI.IIlll(this.lllIll(), d12, d12);
            this.IIlIlI.IllI(string2, 0.0, 0.0, -6511686);
        }
        finally {
            orchard.internal.IIIlI.IlIllI(this.lllIll());
        }
        double d23 = d2 + 112.0 + 14.0;
        double d24 = d3 + 8.0;
        double d25 = d4 - 112.0 - 28.0;
        double d26 = d5 - 16.0;
        if (this.IllII.l == orchard.internal.Illl.Il) {
            this.llIIl(drawContext, d23, d24, d25, d26);
        } else if (this.IllII.l == orchard.internal.Illl.III) {
            this.llIll(drawContext, d23, d24, d25, d26);
        } else if (this.IllII.l == orchard.internal.Illl.ll) {
            this.lIllIII(drawContext, d23, d24, d25, d26);
        } else if (this.IllII.l == orchard.internal.Illl.lI) {
            this.lllIl(d23, d24, d25, d26);
        } else if (this.IllII.l == orchard.internal.Illl.II) {
            this.IIll(d23, d24, d25, d26);
        }
        this.lIlIIIl(n, n2, d2, d3, d4, d5);
        orchard.internal.IIIlI.lIIIII(drawContext);
    }

    /*
     * Unable to fully structure code
     */
    private String IlIlII(Enum<?> var1_1) {
        block16: {
            block12: {
                block15: {
                    block9: {
                        block13: {
                            block11: {
                                block10: {
                                    block14: {
                                        if (var1_1 != null) break block13;
                                        break block14;
                                        return var4_2.toString();
lbl5:
                                        // 1 sources

                                        while (true) {
                                            var4_2.append(' ');
                                            break block9;
                                            break;
                                        }
lbl9:
                                        // 1 sources

                                        while (true) {
                                            if (var4_2.isEmpty()) break block9;
                                            ** continue;
                                            break;
                                        }
lbl12:
                                        // 1 sources

                                        while (true) {
                                            if (!lIllIIlI.IIIlI(var2_3)) break block10;
                                            break block11;
                                            break;
                                        }
                                    }
                                    return "";
lbl17:
                                    // 1 sources

                                    while (true) {
                                        var5_5 = var3_4;
                                        var6_6 = var5_5.length;
                                        var7_7 = 0;
lbl21:
                                        // 2 sources

                                        while (true) {
                                            if (var7_7 >= var6_6) ** continue;
                                            break block12;
                                            break;
                                        }
                                        break;
                                    }
                                }
lbl25:
                                // 2 sources

                                return var2_3;
lbl27:
                                // 1 sources

                                while (true) {
                                    var4_2 = new StringBuilder(var2_3.length());
                                    ** continue;
                                    break;
                                }
                            }
                            if (var1_1.getDeclaringClass() == IIllI.class) {
                                ** continue;
                            }
                            break block15;
                        }
                        var2_3 = var1_1.toString();
                        ** while (true)
                    }
                    var4_2.append(Character.toUpperCase(var8_8.charAt(0))).append(var8_8.substring(1));
                    break block16;
                }
                var3_4 = var2_3.toLowerCase(Locale.ROOT).split("_");
                ** while (true)
            }
            var8_8 = var5_5[var7_7];
            ** while (!var8_8.isEmpty())
        }
        ++var7_7;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private int IlIlIl(int n, double d, double d2, int n2) {
        int n3 = n >>> 24 & 0xFF;
        if (n3 <= 0) return n;
        if ((n & 0xFFFFFF) != 0) return orchard.internal.IIIlI.IIIIl(n3, (int)Math.round(d), (int)Math.round(d2), n2);
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IlIllI(double d, double d2) {
        if (Double.isNaN(this.IIIII)) return false;
        if (!(d >= this.IIIII)) return false;
        if (!(d2 >= this.Illl)) return false;
        if (!(d <= this.IIIII + this.IlIIIl)) return false;
        if (!(d2 <= this.Illl + this.IIIlll)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double IlIlll(DrawContext drawContext, ModuleBase moduleBase, double d, double d2, double d3) {
        double d4;
        if (moduleBase == null) {
            return 0.0;
        }
        double d5 = this.lIIIlI(moduleBase);
        orchard.internal.IIIlI.Illl(drawContext, d, d2, d3, d5, 5.0, -450944470);
        this.IIlIlI.llIIl(moduleBase.IIIlllI(), d + 8.0, d2 + 5.0, d3 - 50.0, this.IIlIlI.llIII());
        this.IIlIlI.lIl(moduleBase.IIllIIl(), d + 8.0, d2 + 18.0, d3 - 16.0, this.IIlIlI.II(), 0.58);
        if (moduleBase.lllllI()) {
            d4 = d + d3 - 8.0 - orchard.internal.IIIlI.IlIlI();
            double d6 = d2 + 6.0;
            this.IIlIlI.IIllI(d4, d6, moduleBase.IIIlIIl());
            this.llIIII.II(d4 - 4.0, d2 + 2.0, orchard.internal.IIIlI.IlIlI() + 8.0, 22.0, (click, bl) -> {
                this.IIIIII(moduleBase);
                this.IllI();
                return true;
            });
        }
        d4 = d2 + 31.0;
        Iterator<IIllIl<?>> iterator = moduleBase.IlIlIl().iterator();
        while (true) {
            if (!iterator.hasNext()) {
                if (!(moduleBase instanceof Panic)) return d5;
                this.IllIIl(moduleBase, d + 8.0, d4, d3 - 16.0);
                return d5;
            }
            IIllIl<?> iIllIl = iterator.next();
            d4 += this.IllllII(drawContext, moduleBase, iIllIl, d + 8.0, d4, d3 - 16.0);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllIII() {
        String string = this.client == null ? "" : this.client.keyboard.getClipboard();
        boolean bl = this.IlIlIl.IlIlI(string, this.lIlIl.IlI());
        this.IIllII = !bl ? "Clipboard import failed" : "Imported clipboard profile";
        if (!bl) return;
        this.lIlIl.I();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllIIl(ModuleBase moduleBase, double d, double d2, double d3) {
        IIIlIIIII iIIlIIIII = StringFactory.IIII("Bind");
        double d4 = this.IlIIIIl(iIIlIIIII, d, d3);
        double d5 = Math.max(0.0, d + d3 - d4);
        double d6 = d2 + Math.max(0.0, (24.0 - orchard.internal.IIIlI.IllIII(this.textRenderer) * 0.82) * 0.5);
        this.IIlIlI.lIl(iIIlIIIII, d, d6, Math.max(0.0, d4 - d - 8.0), -1, 0.82);
        this.IIlIlI.lIlll(d4, d2 + 2.0, d5, 20.0, lIIllllI.IlIl(moduleBase.IIIllII()), false, 0.82);
        this.llIIII.II(d4, d2, d5, 24.0, (click, bl) -> {
            this.lIIIll(IlIlIIlIl.l(moduleBase));
            return true;
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllIll(Click click) {
        double d = Math.min(320.0, Math.max(240.0, (double)this.IlIIl.I() - 30.0));
        double d2 = 118.0;
        double d3 = ((double)this.IlIIl.I() - d) * 0.5;
        double d4 = ((double)this.IlIIl.ll() - d2) * 0.5;
        double d5 = 76.0;
        double d6 = 20.0;
        double d7 = d3 + (d - d5) * 0.5;
        double d8 = d4 + d2 - 28.0;
        if (!lIllIIlI.IlIIIll(click.x(), click.y(), d7, d8, d5, d6)) {
            if (lIllIIlI.IlIIIll(click.x(), click.y(), d3, d4, d, d2)) return true;
        }
        this.IlII = false;
        return true;
    }

    private void IlllII(double d, double d2, double d3, String string, Runnable runnable) {
        this.IIlIlI.IllII(d, d2, d3, 22.0, string, false);
        this.llIIII.II(d, d2, d3, 22.0, (click, bl) -> {
            runnable.run();
            return true;
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlllIl(DrawContext drawContext) {
        if (!this.lIlIIlI()) {
            return;
        }
        IIllIIIll iIllIIIll = this.lIlIl.IlIl().IIl();
        double d = this.lIlIII();
        double d2 = 112.0;
        double d3 = ((double)this.IlIIl.I() - d) * 0.5;
        double d4 = ((double)this.IlIIl.ll() - d2) * 0.5;
        double d5 = d4 + d2 - 28.0;
        double d6 = d3 + d * 0.5 - 92.0;
        double d7 = d3 + d * 0.5 + 8.0;
        this.IIlIlI.IIlII(d3, d4, d, d2, true);
        this.IIlIlI.lIIl(StringFactory.IIII("t4ZXlBhFVFy0BJZcAceei4iQVYgcF1EKlgGTWA3f2w=="), d3 + d * 0.5, d4 + 11.0, this.IIlIlI.llIII(), d - 18.0);
        String string = this.IIIlIII(iIllIIIll.l());
        String string2 = "Current: ";
        this.IIlIlI.IlllI(string2 + string, d3 + d * 0.5, d4 + 32.0, this.IIlIlI.II(), d - 18.0);
        String string3 = this.IllIlII(iIllIIIll.ll());
        string = "Latest: ";
        this.IIlIlI.IlllI(string + string3, d3 + d * 0.5, d4 + 46.0, this.IIlIlI.II(), d - 18.0);
        this.IIlIlI.IlllI("Download the latest build to stay compatible.", d3 + d * 0.5, d4 + 63.0, -1, d - 18.0);
        this.IIlIlI.IllII(d6, d5, 84.0, 20.0, "Later", false);
        this.IIlIlI.IllII(d7, d5, 84.0, 20.0, "Download", true);
        this.llIIII.II(d6, d5, 84.0, 20.0, (click, bl) -> {
            this.llII = true;
            return true;
        });
        this.llIIII.II(d7, d5, 84.0, 20.0, (click, bl) -> {
            this.lIllIll(iIllIIIll.ll());
            this.llII = true;
            return true;
        });
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double IllllI(double d) {
        double d2 = 1.25;
        double d3 = d2 + 1.0;
        double d4 = d - 1.0;
        return 1.0 + d3 * d4 * d4 * d4 + d2 * d4 * d4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double Illlll(double d) {
        if (this.IllII.l == orchard.internal.Illl.I) {
            return d;
        }
        double d2 = this.IllII.III + this.IllII.IIl * 0.5;
        return d2 + (d - d2) / this.IIllll();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIIIII(String string) {
        String string2 = string == null ? "" : string.trim();
        String string3 = string2.replaceAll("[^A-Za-z0-9_. -]", "_");
        if (string3.length() <= 20) return string3;
        return string3.substring(0, 20);
    }

    /*
     * Enabled aggressive block sorting
     */
    private double lIIIlI(ModuleBase moduleBase) {
        double d;
        if (moduleBase == null) {
            return 0.0;
        }
        double d2 = 0.0;
        for (IIllIl<?> iIllIl : moduleBase.IlIlIl()) {
            d2 += this.lIII(moduleBase, iIllIl);
        }
        if (moduleBase instanceof Panic) {
            d = 27.0;
            return 34.0 + d2 + d;
        }
        d = 0.0;
        return 34.0 + d2 + d;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIIll(IlIlIIlIl ilIlIIlIl) {
        this.llIlII();
        this.llIll = ilIlIIlIl;
        this.IIlllI = false;
        this.lllIIl = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIlII(IIllIl<?> iIllIl2, double d, double d2, double d3, String string) {
        String string2 = string == null ? "" : string;
        IIllll iIllll = this.llIIl.computeIfAbsent(iIllIl2, iIllIl -> new IIllll(string2));
        if (!string2.equals(iIllll.I)) {
            iIllll.l = iIllll.I;
            iIllll.I = string2;
            iIllll.II = 0.0;
        } else if (iIllll.II < 1.0) {
            iIllll.II = Math.min(1.0, iIllll.II + this.IIIlI * 8.5);
        }
        this.IIlIlI.IIIlII(d, d2, d3, 20.0, iIllll.l, iIllll.I, iIllll.II, 0.82);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lIIlIl(DrawContext drawContext, IIlllIll iIlllIll, double d, double d2, double d3) {
        double d4;
        double d5;
        String string;
        List<llIlIlIl> list = iIlllIll.lllII();
        this.IIlIlI.IIlIlI("Inventory presets", d, d2 + 5.0, Math.max(0.0, d3 * 0.56), this.IIlIlI.II());
        this.IIlIlI.IIlIlI(iIlllIll.IIlI(), d + d3 * 0.58, d2 + 5.0, Math.max(0.0, d3 * 0.42), this.IIlIlI.II());
        double d6 = Math.max(48.0, d3 - 31.0);
        double d7 = 20.0;
        double d8 = d2 + 25.0;
        boolean bl2 = this.lllIIl != null && this.lllIIl.II;
        String string2 = string = bl2 ? this.l : this.II;
        if (bl2) {
            int n = -12960442;
            int n2 = -12170926;
            double d9 = Math.min(4.5, d7 * 0.5);
            orchard.internal.IIIlI.Illl(this.lllIll(), d, d8, d6, d7, d9, n2);
            orchard.internal.IIIlI.Illl(this.lllIll(), d + 1.0, d8 + 1.0, d6 - 2.0, d7 - 2.0, Math.max(1.0, d9 - 1.0), n);
            d5 = 6.0;
            d4 = Math.max(10.0, d6 - d5 * 2.0);
            String string3 = string == null || string.isBlank() ? "Preset" : string;
            double d10 = this.IIlIlI.IIlI(string3);
            double d11 = Math.max(0.0, d10 - d4);
            double d12 = d + d5 - d11;
            double d13 = d8 + (d7 - orchard.internal.IIIlI.IllIII(this.textRenderer)) * 0.5;
            orchard.internal.IIIlI.llII(this.lllIll(), d + 3.0, d8 + 1.0, d + d6 - 3.0, d8 + d7 - 1.0);
            try {
                if (this.ll && !string3.isEmpty()) {
                    int n3 = IlIIIIll.III().getRGB();
                    orchard.internal.IIIlI.Illl(this.lllIll(), d12 - 1.0, d13 - 1.0, d10 + 2.0, orchard.internal.IIIlI.IllIII(this.textRenderer) + 2.0, 2.0, n3 & 0xFFFFFF | Integer.MIN_VALUE);
                }
                this.IIlIlI.IllI(string3, d12, d13, -1);
            }
            finally {
                orchard.internal.IIIlI.lIllll(this.lllIll());
            }
            double d14 = Math.min(d + d6 - 5.0, d12 + d10);
            double d15 = d8 + (d7 - 12.0) * 0.5;
            this.I(d14, d15, 12.0);
            this.IIIllI(drawContext);
        } else {
            this.IIlIlI.IllII(d, d8, d6, d7, string == null || string.isBlank() ? "Preset" : string, false);
        }
        this.IIlIlI.IllII(d + d6 + 7.0, d8, 24.0, 20.0, "", false);
        this.lIlIll(drawContext, d + d6 + 19.0, d8 + 10.0, 7.0, -1);
        this.llIIII.II(d, d8, d6, d7, (click, bl) -> {
            this.lIIl(IlIlllII.l(), this.II);
            return true;
        });
        this.llIIII.II(d + d6 + 7.0, d2 + 23.0, 24.0, 24.0, (click, bl) -> {
            try {
                iIlllIll.IllI(this.II);
                String string = this.II;
                String string2 = "Created ";
                this.IIllII = string2 + string;
                this.IllI();
            }
            catch (Exception exception) {
                this.IIllII = "Could not create preset";
            }
            return true;
        });
        double d16 = d2 + 53.0;
        if (list.isEmpty()) {
            this.IIlIlI.IIlIlI("No presets", d + 6.0, this.llllII(d16, 23.0), Math.max(0.0, d3 - 12.0), this.IIlIlI.II());
            return;
        }
        for (llIlIlIl llIlIlIl2 : list) {
            this.IIlIlI.lI(d, d16, d3, false, false);
            d5 = 38.0;
            d4 = 46.0;
            double d17 = 24.0;
            double d18 = Math.max(40.0, d3 - d5 - d4 - d17 - 42.0);
            int n = llIlIlIl2.I();
            String string4 = ", ";
            String string5 = llIlIlIl2.II();
            this.IIlIlI.IIlIlI(string5 + string4 + n, d + 7.0, this.llllII(d16, 23.0), d18, this.IIlIlI.llIII());
            double d19 = d + d3 - d5 - d4 - d17 - 24.0;
            double d20 = d + d3 - d4 - d17 - 17.0;
            double d21 = d + d3 - d17 - 8.0;
            this.IIlIlI.IllII(d19, d16 + 4.0, d5, 16.0, "Load", false);
            this.IIlIlI.IllII(d20, d16 + 4.0, d4, 16.0, llIlIlIl2.l() == null || llIlIlIl2.l().isBlank() ? "Bind" : llIlIlIl2.l(), false);
            this.IIlIlI.IllII(d21, d16 + 4.0, d17, 16.0, "-", false);
            this.llIIII.II(d19, d16 + 2.0, d5, 20.0, (click, bl) -> {
                try {
                    iIlllIll.lIIIl(llIlIlIl2.Il());
                    this.IIllII = "";
                }
                catch (Exception exception) {
                    String string = exception.getMessage();
                    String string2 = "Load failed: ";
                    this.IIllII = string2 + string;
                }
                return true;
            });
            this.llIIII.II(d20, d16 + 2.0, d4, 20.0, (click, bl) -> {
                this.lIIIll(IlIlIIlIl.II(iIlllIll, llIlIlIl2.Il()));
                return true;
            });
            this.llIIII.II(d21, d16 + 2.0, d17, 20.0, (click, bl) -> {
                try {
                    iIlllIll.IlIlI(llIlIlIl2.Il());
                    String string = llIlIlIl2.II();
                    String string2 = "Deleted ";
                    this.IIllII = string2 + string;
                    this.IllI();
                }
                catch (Exception exception) {
                    this.IIllII = "Delete failed";
                }
                return true;
            });
            d16 += 25.0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIllI(DrawContext drawContext) {
        if (this.llIII == null) return;
        if (this.llIII.isBlank()) {
            return;
        }
        double d = 220.0;
        List<String> list = this.IIII(this.llIII, d - 14.0);
        double d2 = 0.0;
        for (String string : list) {
            d2 = Math.max(d2, (double)orchard.internal.IIIlI.IIIlll(this.textRenderer, string));
        }
        double d3 = Math.max(72.0, Math.min(d, d2 + 14.0));
        Objects.requireNonNull(this.textRenderer);
        double d4 = 9.0 + 3.0;
        int n = list.size();
        Objects.requireNonNull(this.textRenderer);
        double d5 = (double)(n * 9) + (double)Math.max(0, list.size() - 1) * 3.0;
        double d6 = d5 + 12.0;
        double d7 = Math.min(this.IllII.IllI + this.IllII.llI - d3 - 8.0, this.IIIIII + 12.0);
        double d8 = this.lIlll;
        orchard.internal.IIIlI.lI(drawContext, d7, d8, d3, d6, 5.5, -1442840576, 9.0, 5, 0.35);
        orchard.internal.IIIlI.Illl(drawContext, d7, d8, d3, d6, 5.5, -300804836);
        double d9 = d8 + (d6 - d5) * 0.5;
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            this.IIlIlI.IllI(string, d7 + 7.0, d9, this.IIlIlI.llIII());
            d9 += d4;
        }
    }

    private void lIIlll() {
        this.lIlIl.IIl().IIlIlI(this.IllII.llIl());
    }

    private double lIlIII() {
        return Math.min(390.0, Math.max(260.0, (double)this.IlIIl.I() - 30.0));
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean lIlIIl(Click click, boolean bl) {
        this.lIlIl.IlI().lIIIII().lIl(Theme.Illl);
        this.IllII.IIll = Theme.Illl;
        this.IIllII = "";
        this.IllI();
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static /* synthetic */ boolean lIlIlI(Set set, Theme theme) {
        if (set.contains(theme)) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlIll(DrawContext drawContext, double d, double d2, double d3, int n) {
        double d4 = d3 * 0.5;
        double d5 = 1.35;
        orchard.internal.IIIlI.Illl(drawContext, d - d4, d2 - d5 * 0.5, d3, d5, 0.0, n);
        orchard.internal.IIIlI.Illl(drawContext, d - d5 * 0.5, d2 - d4, d5, d3, 0.0, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void lIllII(Illl illl) {
        this.IllII.l = illl == null ? orchard.internal.Illl.Il : illl;
        this.lIIlll();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 20654;
        String string = "\u6349\u634a\u633c\u6332\u6315\u62e9\u630a\u62e2\u631c\u62e8\u6333\u632e\u6332\u62e0\u6334\u6317\u655e\u65c7\u65c2\u656a\u65c0\u65ca\u6550\u6550\u56e7\u570f\u5742\u574a\u5732\u572d\u5735\u5740\u574b\u570e\u56df\u5739\u571c\u573f\u573f\u5742\u5717\u5713\u571d\u573b\u5731\u5dab\u573b\u571a\u574a\u5dab\u5734\u5742\u570e\u574b\u574b\u570f\u573d\u572d\u573b\u574a\u73d2\u73fb\u7400\u73fc\u740a\u73f3\u7408\u73f5\u73ec\u72a2\u73db\u7413\u72a5\u73fe\u73dc\u73f5\u73ec\u72a7\u73f4\u7402\u740a\u73fe\u7415\u73fb\u72a2\u73ee\u72a7\u72a8\u72a2\u7415\u73f3\u73fe\u7407\u73d1\u7416\u72a8\u73fc\u729f\u7449\u73f3\u7414\u73d4\u73cf\u73fe\u73cc\u73cd\u7405\u7417\u0c27\u0b9a\u0c26\u0c26\uce5a\uce67\uce53\uce53\ub1ba\ub1c2\ub18f\ub1ad\ub160\ub197\ub161\ub1cb\ub198\ub19b\ub1b2\ub19e\ub1c7\ub17e\ub1c3\ub19c\ub1c1\ub19a\ub176\ub176\uf6b6\uf672\uf6bf\uf69d\uf6ac\uf6bd\uf661\uf691\uf692\uf696\uf66f\uf6c8\uf694\uf6cb\uf6bd\uf690\uf6c6\uf67e\uf6bb\uf6ca\ufc29\ufb69\ufb76\ufb7a\ufb74\ufb5c\ufc2a\ufb85\ufb89\ufb4d\ufb68\ufb8a\ufb8b\ufb54\ufb84\ufb89\ufb56\ufb65\ufc24\ufb51\ufb75\ufc2a\ufb75\ufb8b\ufb88\ufb84\ufb89\ufb88\ufb89\ufb72\ufb4d\ufb61\ud5af\ud598\ud5ae\ud5c5\ud567\ud5b3\ud5b6\ud5c6\ud594\ud590\ud568\ud59a\ud5c6\ud5c9\ud571\ud593\ud5ca\ud57a\ud592\ud560\ud5ad\ud5b6\ud569\ud59a\ud593\ud575\ud5c9\ud564\ud59a\ud5ae\ud55f\ud57d\u6554\u6629\u6578\u6580\u6588\u6621\u654e\u656f\u6574\u6624\u6559\u6570\u6621\u6578\u656c\u657f\u6576\u659a\u6576\u6584\u6588\u6586\u6589\u6581\u6573\u6596\u658a\u6578\u6574\u658a\u6621\u656d\u658a\u6571\u6585\u6578\u6575\u6621\u6572\u6573\uc6e9\ucda9\uc6ea\uc71c\uc733\uc71c\uc6ee\uc746\uc746\uc736\uc70f\uc71a\uc74b\uc714\uc744\uc749\uc716\ucda5\uc6e4\uc711\uc735\uc6ea\uc735\uc70d\uc70c\uc72e\uc711\uc714\uc70c\uc6ed\uc749\uc745\uc6ed\uc6e7\ucda8\uc747\uc748\uc70d\uc72f\ucda1\u9e6d\u9e55\u9e84\u9e7c\u9e71\u9e76\u9e5c\u9e7c\u9e88\u9e88\u9f25\u9e84\u9e5b\u9e84\u9e54\u9e7b\u9e8a\u9e66\u9e56\u9e7c\u9e74\u9e6a\u9eac\u9e7a\u9e4c\u9e6e\u9e73\u9e7a\u8b48\u8b30\u8ae1\u8b19\u8b14\u8b0f\u8b39\u8b19\u8b2d\u8b2d\u8b40\u8b2e\u8b39\u8b30\u8b08\u8b1a\u8b3b\u8b4b\u8b1d\u8b2f\u8b0a\u8b47\u8b09\u8b34\u8adf\u8ae0\u8aff\u8b35\u8ae9\u8b38\u8b04\u8b04\u2eb9\u2e7d\u2e9c\u2ec7\u2e65\u2e98\u2e7a\u2e92\uf8b1\uf875\uf894\uf8bf\uf8ad\uf894\uf8ae\uf890\uf895\uf890\uf893\uf860\uf8c6\uf898\uf8af\uf87d\u9778\u97b8\u975e\u975e\u9825\u9824\u9774\u9758\u9787\u978b\u9773\u978a\u974e\u97b7\u9820\u975b\u978b\u97b3\u982b\u9827\u981f\u9786\u9827\u9753\u9757\u9786\u9825\u9780\u1f4b\u1ecc\u1f47\u1ef4\u1ed5\u1f04\u1edd\u1f3f\u65a7\u5ee7\u65a8\u5efb\u5eef\u5ef4\u5ede\u5f0b\u5ed7\u5edb\u5eef\u5ed4\u5ede\u5ed6\u5ede\u5f03\u5edd\u5ee3\u5efe\u5efb\u65a4\u5ed2\u5ef9\u5edf\u7005\u6fec\u6ea5\u6fec\u6fde\u700b\u6fdb\u6e9f\u6ea1\u6ea5\u6fdd\u6eab\u9ea0\ua018\ua036\ua030\ua037\ua03a\u9ea9\ua035\ua044\u9fe3\u9ffb\ua04a\ua01a\ua049\u9ea9\ua044\ua011\ua01c\ua01e\ua031\ua03d\u9ea5\u9fe8\ua031\u721d\u7234\u723d\u7234\u7246\u7213\u7243\u7237\u71e8\u722d\u721c\u723a\u722c\u7235\u71e1\u720e\u722e\u71d8\u71dd\u7248\u7218\u7242\u721c\u720d\u723d\u71e1\u721a\u7234\u71e9\u71db\u7234\u7247\u7240\u721a\u71ea\u720d\u71ea\u7238\u71e3\u7235\u7215\u7235\u71ea\u723a\u71dc\u71e9\u7248\u7237\u71e9\u71dc\u71e9\u7235\u71ea\u71d4\u7246\u71d0\u0bc2\u0b82\u0b9d\u0b91\u0b9a\u0b63\u0b91\u0bb1\u80f7\u80db\u80cf\u8104\u80f7\u8106\u80ed\u80f3\u8103\u80d6\u80ea\u80ea\u9cee\u9cd6\u9d03\u9d0b\u9cf3\u9ba5\u9ba5\u9cd9\uc544\uc538\uc534\uc4e9\uc51d\uc4e1\uc501\uc4df\uc4e4\uc534\uc543\uc4cd\u0d5b\u0e1f\u0e2b\u0d72\u0d86\u0d7a\u0d9a\u0d78\u0d6e\u0e27\u0d5a\u0d7c\u0e2a\u0d6f\u0e23\u0d88\u0e28\u0d5c\u0d96\u0d96\u7854\u7893\u7924\u7883\ue465\ue48c\ue4af\ue4c5\ue4bd\ue4b7\ue4c5\ue525\ue4c1\ue46b\ue4b8\ue48d\ue49b\ue494\ue528\ue528\u67a5\u6907\u67a5\u68dc\u68fd\u68ff\u6903\u68ef\u6906\u6903\u6901\u68d0\u68ff\u67a0\u68e9\u6907\u68ff\u6938\u6905\u6909\u68f8\u68d7\u67aa\u68ef\u6902\u68e5\u68ea\u6907\u68f6\u6904\u68ff\u68f0\u67a9\u68fd\u68f7\u68ff\u68d0\u6903\u6900\u6905\u68e3\u6907\u68f6\u6904\u67a4\u68f4\u68d5\u68d9\u6904\u6906\u68e9\u68d4\u6900\u68db\u68e6\u68da\u67a3\u68f8\u68f8\u68f3\u68e0\u68ea\u67a6\u67a1\u68fb\u6907\u6907\u693c\u68fd\u6902\u68e1\u690a\u68cf\u6906\u693c\u68d2\u68ff\u67a0\u67a4\u6901\u6905\u68e6\u67a3\u68e2\u67a5\u67a2\u67aa\u68e6\u68f6\u68db\u68cf\u6907\u6904\u68e2\u68f8\u6909\u68f8\u68f8\u68fa\u68e5\u6909\u68d2\u67a7\u690a\u68e1\u68f5\u68f3\u690a\u67a5\u68e2\u67aa\u68dc\u68d3\u68fd\u67a1\u6903\u6906\u68e9\u6907\u68f2\u67a7\u68ff\u68f5\u68f3\u68fb\u690a\u68e4\u6902\u67aa\u68db\u68ff\u68fb\u68fb\u68ff\u68ea\u6904\u6902\u68f9\u6909\u690a\u6909\u68f0\u67a4\u68dc\u6902\u690a\u68d0\u68da\u2c86\u2d27\u2c55\u2d29\u2c5e\u2d22\u2c5d\u2c75\u2d41\u2d32\u2d44\u2d3e\u2d43\u2d10\u2d1d\u2d2f\u2d3b\u2d37\u2d17\u2d4b\u2d2c\u2d1c\u2ce6\u2d37\u2ce7\u2d1c\u2ce4\u2d32\u2d43\u2ccf\u2d4b\u2d2c\u2d3b\u2d32\u2cdc\u2ce2\u2d2d\u2cd7\u2d41\u2d3a\u2d44\u2d0d\u2d01\u2d47\u2d2e\u2d0d\u2cdd\u2d2c\u2cd8\u2ce2\u2d46\u2d3b\u2d46\u2d3e\u2d43\u2d0c\u2ce0\u2d44\u2cdf\u2d0e\u2d2c\u2cdc\u2ceb\u2d38\u2cd7\u2ceb\u2ceb\u2ce9\u2cd9\u2cdb\u2ce1\u2d30\u2d44\u2d32\u2d3e\u2d3c\u2d43\u2d3e\u2d2f\u2d0c\u2ce0\u2d2e\u2d4a\u2d2f\u2d37\u2d19\u2d3a\u2cdf\u2d3b\u2d45\u2ce5\u2d37\u2d10\u2d0d\u2cd3\u2cd3\ue08a\ue074\ue08a\ue126\ue050\ue06d\ue08d\ue059\ue126\ue086\ue075\ue0c1\ubaea\ubb48\ubb41\ubb40\ubae9\ubb40\ubb2e\ubb0d\ubb47\ubaf0\ubb0c\ubafc\ua0b9\ua097\ua092\ua08f\ua0ba\ua093\ua09b\ua0c7\ua098\ua065\ua12b\ua12b\ud6c5\ud6c1\ud6c0\ud666\ud698\ud65f\ud667\ud665\ud65f\ud65f\ud6b0\ud660\ud6b4\ud68a\ud68a\ud662\ud6b2\ud667\ud6be\ud64e\ud210\ud214\ud215\ud22f\ud20d\ud236\ud20c\ud1e0\ud22f\ud21c\ud235\ud235\ud1e1\ud1db\ud1db\ud242\ud1e3\ud1e7\ud1e1\ud23f\u1234\u11f4\u1233\u11e0\u11e8\u1240\u1233\u1218\u1217\u1245\u1238\u122d\u1242\u1219\u1245\u11e2\u1240\u1236\u11fc\u11fc\ua5f1\ua631\ua5f2\ua5ff\ua4a9\ua5d0\ua4aa\ua4a5\ua5de\ua5ef\ua5f5\ua5d3\ua604\ua5dc\ua5f6\ua5de\ua5ff\ua631\ua5eb\ua4a1\ua5ec\ua5cc\ua634\ua4a5\ua5d1\ua5cc\ua4ab\ua60a\ua5de\ua4aa\ua632\ua4a4\ua634\ua636\ua5ed\ua5cf\ua5d0\ua5fe\ua5e7\ua5ff\ua5fd\ua5f2\ua630\ua60a\ua4a8\ua5d0\ua4a9\ua5cc\ua600\ua5d0\ua5dc\ua601\ua600\ua5dc\ua49f\ua5ff\ua636\ua5fe\ua4ab\ua607\ua633\ua4a2\ua5f4\ua4a1\ua4a8\ua5dc\ua4aa\ua5d4\ua5ec\ua5ee\ua631\ua5d3\ua5de\ua5ee\ua5eb\ua607\ua5d3\ua5cc\ua5fe\ua5cf\ua605\ua4a3\ua4a0\ua609\ua4ab\ua5dc\ua5d3\ua5ce\u8f33\u8f1a\u8f39\u8f46\u8ee8\u8f34\u8f35\u8f45\u8f13\u8f0f\u8ee7\u8f19\u39ba\u3993\u39b4\u39c7\u3965\u39b9\u39b8\u39c8\u39c7\u398e\u39bb\u3999\u39cb\u3996\u39c2\u39ad\u398d\u39b9\u396f\u396f\ua833\ua819\ua845\ua7e0\ua7e8\ua810\ua7fc\ua7fc\u5239\u523e\u51fd\u522d\u51e1\u520d\u51f1\u51f1\u5082\u507a\u5127\u511f\u5057\u5089\u5089\u5075\u5070\u505d\u5084\u508e\u5fe1\u5ea1\u604b\u600d\u6039\u6013\u603d\u600f\u603f\u6016\u5eaa\u5eaa\ubaa0\ubaa5\ubbeb\ubbeb\uc922\uc889\uc87b\uc854\uc87a\uc926\uc923\uc853\uc885\uc881\uc879\uc887\uc852\uc864\uc85d\uc880\uc857\uc868\uc857\uc881\uc87d\uc863\uc920\uc880\uc855\uc858\uc926\uc85b\uc886\uc855\uc888\uc885\uc87c\uc926\uc85f\uc8ac\ud188\ud1c8\ud153\ud157\ud155\ud17d\ud187\ud224\ud228\ud16c\ud1c9\ud227\ud16e\ud175\ud225\ud228\ud173\ud1c4\ud185\ud170\ud154\ud187\ud154\ud16e\ud229\ud225\ud228\ud229\ud228\ud14f\ud16c\ud1c0\u47f5\u47f2\u4831\u46a1\u47ed\u4801\u483d\u483d\u9a89\u9ac9\u9b23\u9b25\u9a51\u9a7b\u9a55\u9a77\u9b27\u9a77\u9a86\u9a8d\u9a7b\u9a73\u9b23\u9a5c\u9a7e\u9a5c\u9a5a\u9a5a\u9a56\u9ac9\u9a56\u9a6e\u9b27\u9b26\u9a58\u9a5c\u9a77\u9a8e\u9a7a\u9a74\u9a51\u9a58\u9a78\u9b29\u9b28\u9a7e\u9a8c\u9a57\u9acb\u9a88\u9ac2\u9ac2\u164b\u15cc\u163e\u163d\u1612\u1610\u1640\u15e2\u15ea\u163b\u161a\u15e0\u1728\u1656\u168a\u165b\u166f\u168b\u166c\u1658\u165d\u1670\u1729\u165f\u0d6c\u0d50\u0d6e\u0d5e\u0d6f\u0d72\u0d4c\u0d81\u0d4d\u0d88\u0d70\u0d82\u0d52\u0d50\u0d7e\u0d77\u0d4e\u0d61\u0db3\u0d7c\u0d71\u0e2a\u0d68\u0d52\u0d89\u0d54\u0e2b\u0d78\u0d89\u0d76\u0d6f\u0d89\u0d6f\u0d6a\u0d71\u0d56\u0d4c\u0d6f\u0db3\u0d59\u0e21\u0e2a\u0daf\u0d58\u0d69\u0d5c\u0d7d\u0d4e\u0d5c\u0d5d\u0d7e\u0d88\u0d57\u0d50\u0dae\u0d4f\u0d6f\u0d69\u0e22\u0d58\u8d2c\u8d12\u8d0e\u8d17\u8d33\u8d47\u8ce9\u8ba3\ue6fd\ue701\ue6fb\ue70b\ueda2\ued9f\ue6dd\ue6d0\ue6dc\ue6d9\ue6ee\ue734\ufcc6\ufc5d\ufc97\ufc58\ufc57\ufcba\ufc65\ufcbe\ufc5f\ufcb8\ufcc9\ufc5f\ufcb9\ufcca\ufcb1\ufcc4\ufcb8\ufcb1\ufc66\ufcbb\ufcc6\ufc9e\ufc54\ufc54\uf40d\uf448\uf402\uf402\u6202\u61fe\u61f2\u60ab\u61d7\u60a3\u6243\u60a5\u60a2\u61f2\u6201\u6247\uc1bf\uc1bb\uc1af\uc1ae\uc19a\uc166\uc186\uc164\uc1b2\uc1b3\uc1c6\uc160\uc1b6\uc16b\uc1b7\uc194\uc1b4\uc1c0\uc18a\uc18a\u9086\u906d\u9083\u9076\u9058\u9125\u904f\u906f\u912b\u9082\u90c1\u907a\u9126\u907c\u908c\u9077\u9076\u9086\u906f\u9055\u905c\u905a\u9086\u90c8\u8c46\u8c3e\u8beb\u8be3\u8c1b\u8c0d\u8c0d\u8c31\ud05c\ud124\ud075\ud07d\ud085\ud053\ud053\ud127\ud562\ud566\ud563\ud5c1\ud5bc\ud595\ud562\ud5c3\ud5c5\ud5ae\ud5b9\ud592\ud58f\ud55f\ud629\ud629\u5945\u58f8\u57a5\u5949\u6739\u6743\u6739\u6717\u66e2\u670e\u66f2\u66f2\u8784\u877f\u87c0\u8750\u875c\u8770\u878c\u878c\u5da1\u5741\u56ed\u56ed\uba5f\ubabd\uba7e\uba96\uba62\uba9e\uba72\uba72\u5ee2\u5f0e\u5f38\u5f0f\u5f3b\u5f13\u5f13\u65a7\u57e8\u5844\u5832\u5819\u5835\u581d\u581d\u5846\u5846\u581c\u5847\u5819\u5816\u581d\u56a1\u56a1\ue38c\ue36c\ue3c0\ue3c0\ubf8b\ubf77\uc026\uc01f\ubf89\ubf58\ubf72\ubf75\ubf73\ubf58\ubf89\ubf9b\u454a\u453c\u4530\u453e\u4549\u4535\u4516\u44e5\u4531\u4535\u450f\u44d9\u49e6\u4a0f\u49fa\u4a0f\u49e3\u4a1a\u4a39\u4a0e\u4a1c\u4a1a\u48a0\u4a0d\u2b69\u2bc8\u2b99\u2b63\u2bac\u2bb7\u2b74\u2b92\u2b90\u2b67\u2b75\u2b98\u2bc7\u2bc0\u2b7c\u2b7c\uac45\uac19\uac1d\uac0d\uac40\uac0c\uabda\uac38\uac3a\uac41\uabd7\uac3e\uabe1\uabea\uabd6\uabd6\u32a2\u343c\u340a\u33de\u32a2\u3407\u3433\u3433\u4f94\u4fc8\u4f8c\u4f6a\u4f93\u4f90\u4f7f\u4f69\u4f6b\u4f8d\u4f8f\u4fba\u4fb7\u4f62\u4fc8\u4fb5\u8192\u8196\u81bd\u8161\u8191\u81b8\u81cb\u816a\u8168\u81bf\u8194\u81bb\u0199\u0181\u019e\u0192\u0198\u018e\u01bc\u01be\u0160\u0164\u0184\u01b0\u01b4\u01b5\u0189\u0189\u639c\u63bd\u63b1\u6361\u639d\u639b\u6361\u6360\u6360\u6364\u639c\u6360\u63b4\u63b4\u6388\u6388\uf635\uf5ed\uf632\uf63e\uf634\uf5e2\uf610\uf612\uf60d\uf5e2\uf4a8\uf61e\uf617\uf5ed\uf637\uf4a5\ub05c\ub0c4\ub125\ub076\ub058\ub071\ub057\ub074\ub120\ub087\ub126\ub074\ub077\ub070\ub08c\ub08c\ud4ca\ud4be\ud45f\ud466\ud48c\ud490\ud452\ud4b0\ud4bd\ud463\ud4c4\ud45a\ud610\ud60c\ud648\ud617\ud613\ud62e\ud62e\ud634\ud5ea\ud63e\ud60f\ud61e\ud63d\ud5e3\ud5e3\ud5ff\u983d\u981c\u9810\u980f\u9839\u983e\u982e\u9841\u9844\u9815\u97e1\u9831\u9814\u97e6\u97e2\u9835\u9814\u97ed\u981a\u9819\u9839\u980c\u96a6\u96a9\ud421\ud3be\ud358\ud38b\ud426\ud358\ud36e\ud34e\ud359\ud422\ud425\ud34d\ud34e\ud351\ud377\ud3b5\u3b39\u41a6\u3b40\u3b13\u3b3e\u3b40\u3b36\u3b16\u1af8\u1ae4\u219f\u1b05\u1af9\u1ad0\u1ae0\u1b06\u1b00\u1ad0\u1b2c\u1b2c\udaf2\udb06\udad7\udade\udaf4\ue1a8\udb2e\udb06\udb05\ue1a5\udade\udae2\u4ace\u4b16\u4b09\u4b05\u4b0b\u4ad9\u51a7\u51a6\u4af4\u4aef\u51a4\u51a0\u519f\u51a7\u4b16\u51ab\u519f\u4ad5\u4ad7\u4af2\u4b07\u4af2\u4b1e\u4b1e\ub293\ub25f\ub291\ub2b3\ub292\ub2ba\ub28d\ub2ac\ub26a\ub28c\ub28e\ub2ac\ub2bc\ub2ba\ub286\ub286\u554b\u5511\u5533\u54e9\u554a\u54e2\u550d\u553f\u5536\u552f\u5508\u5530\u5df5\u5e2e\u5e00\u5dd4\u5df0\u5cab\u5de9\u5e0b\u5e02\u5dd8\u5dd3\u5dd2\u5dd2\u5dd0\u5e00\u5dcd\u5dd8\u5ca7\u5dde\u5df8\u5df0\u5dd9\u5de5\u5de5\u753d\u73a6\u7548\u751c\u7538\u74e3\u73a1\u7543\u754a\u7510\u751b\u751a\u751a\u7518\u7548\u7545\u7510\u74df\u753c\u7530\u7538\u7511\u74ed\u74ed\u0fdc\u1000\u1004\u0eaa\u0fdc\u0e9f\u1000\u0ff3\u0ea6\u0ff2\u0fdb\u0fd2\u0ff1\u0ea7\u0ea7\u104b\uddb6\udd6a\udd9c\udd97\uddb5\uddc9\uddae\uddb9\uddcb\uddc9\udd6f\udd9d\u73fc\u73fa\u73dc\u7402\u72a1\u7407\u73cc\u72a4\uaf66\uaf60\uafc6\uaf98\uafb7\uaf94\uaf60\uafc5\uafbf\uafb5\uafb5\ub02b\u640c\u63cf\u6435\u6435\u6449\u6434\u640f\u6445\u6435\u6435\u642e\u6434\u63df\u6434\u63d8\u63d8\u3364\u3420\u336b\u33af\u33b8\u33c5\u33c1\u33bf\u33b6\u33b2\u3421\u33c6\u3396\u338d\u33c5\u33b6\u339b\u33c4\u3428\u3428\u9a1d\u9a1e\u99e9\u9a13\u9a1c\u99e1\u9a13\u99e3\u99e0\u9a46\u99cc\u99cc\ua231\ua0ab\ua21e\ua216\ua232\ua1e0\ua21a\ua237\ua24a\ua24a\ua219\ua20d\ua210\ua212\ua242\ua20d\ua217\ua239\ua217\ua0a3\ue1f6\ue1d6\ue1da\ue20a\ue1f5\ue20b\ue1f1\ue1df\u2bf6\u2c36\u2bf5\u2a9f\u2aa8\u2bff\u2c32\u2bda\u2bcf\u2bf9\u2c0a\u2c3e\u7b4b\u7b15\u7b2f\u7ae0\u7b49\u7b33\u7b0d\u7b2f\u7b30\u7b33\u7ae4\u7b42\u7b2d\u7b2e\u7b3e\u7ada\u7aad\u7a95\u7a9a\u7a69\u7a6d\u7a98\u7a8e\u7ac3\u7aca\u7a9b\u7aaf\u7abe\u7a98\u7ac3\u7a69\u7b1f\ub830\ub848\ub819\ub811\ub7e9\ub837\ub837\ub843\ud945\ud937\ud945\ud8e3\ud91e\ud92f\ud949\ud8e5\ud936\ud932\ud8ce\ud8ce\u6166\u6198\u6166\u61c4\u61bd\u6194\u61be\u61c0\u61c5\u61c0\u61c3\u61b0\u6196\u61c8\u615f\u616d\u3b41\u3b31\u3b17\u3b0d\u3b42\u3b3f\u3b31\u3ae8\u3b2f\u3b0e\u3ad4\u3ad4\u9a8b\u9ab3\u9a63\u9abb\u9a91\u9a6b\u9a67\u9a69\u9aba\u9abe\u9a82\u9a82\u467c\u4680\u465c\u4729\u4725\u4672\u4672\u464c\u4652\u467b\u4725\u464d\u4657\u4686\u46bd\u465c\u468b\u4663\u46bb\u466c\u4720\u4650\u465a\u465d\u465c\u4650\u46b2\u4684\u4652\u4726\u46b2\u4657\u7611\u75d1\u7630\u7645\u7648\u761e\u761e\u7644\ue834\ue7f4\ue833\ue7e0\ue82c\ue7e7\ue841\ue845\ue817\ue810\ue7fc\ue7fc\uc3b1\uc429\uc3c8\uc39d\uc3b4\uc367\uc421\uc421\u0771\u0751\u075d\u0754\u0770\u0758\u081f\u075d\u074d\u0788\u07b6\u0780\u075b\u076b\u0827\u0788\u0788\u0755\u075b\u0753\u0771\u0780\u0820\u0779\u074e\u0778\u0754\u0779\u074d\u0773\u0754\u077f\u0772\u0759\u0828\u0788\u078b\u0758\u074f\u077f\u9e31\u9e0d\u9e41\u9de4\u9e2d\u9e3b\u9e45\u9e3f\u9e16\u9e11\u9e3d\u9e1c\u9e16\u9e47\u9df4\u9e47\u9e46\u9e2f\u9e47\u9ddf\u9de7\u9de2\u9df8\u9df8\uc8c2\uc860\uc869\uc868\uc8c1\uc868\uc8c6\uc865\uc85f\uc858\uc864\uc854\u57bf\u5761\u5768\u5769\u57c0\u57ad\u5765\u57b1\u5762\u579b\u5755\u5755\u0dbe\u0d93\u0d9e\u0d93\u0d65\u0db4\u0d64\u0d98\u0dc7\u0dc8\u0e25\u0d93\u0d8e\u0dbc\u0d60\u0d9b\u0d8d\u0dcb\u0d6f\u0d6f\ud4ee\ud4cf\ud502\ud4fa\ud4f2\ud4de\ud4f4\ud4cd\ud4db\ud4de\ud4d1\ud4fc\ud4dd\ud4eb\ud4da\ud500\ud4cc\ud4df\ud4dc\ud50a\ud4f1\ud4d2\ud52e\ud4fc\ud50b\ud4df\ud4ed\ud4fe\ud500\ud4f4\ud4ed\ud502\ud4e7\ud4ed\ud4d9\ud4f7\ud509\ud4ed\ud4f5\ud4e3\u6979\u69b9\u6a26\u696c\u6a24\u6976\u6977\u69b1\u3995\u3952\u3987\u3985\u1db1\u1d76\u1e2b\u1e21\u97e9\u97ed\u981c\u980c\u9830\u9832\u97ea\u983c\u1572\u15b2\u156d\u1621\u1627\u157d\u154e\u155d\u1624\u157d\u1588\u155b\u1581\u1575\u155b\u1589\u1586\u1575\u1555\u154c\u156c\u1621\u156e\u154f\u1553\u154e\u1570\u154f\u1551\u156d\u1586\u154e\u1627\u1570\u1580\u158a\u1580\u1553\u157b\u1550\u157e\u1628\u1576\u1553\u162a\u1629\u1555\u1554\u1386\u137b\u135d\u141f\u135d\u1423\u134d\u136f\u2b19\u2ad9\u2b1a\u2b34\u2b40\u2b46\u2b46\u2aea\ua37c\ua352\ua37c\ua389\ua423\ua35a\ua35a\ua359\ua350\ua36d\ua36d\ua3b3\ue78e\ue78d\ue7b7\ue79e\ue792\ue7bb\ue7c5\ue7b7\u8a2c\u8a16\u8a17\u8a0e\uc75a\uc771\uc757\uc828\uc784\uc778\uc75b\uc779\uc77c\uc779\uc7c2\uc77a\u07bd\u07bf\u07bd\u079b\u0766\u07cb\u0765\u0797\u079e\u0797\u079c\u0767\u078d\u078f\u07b8\u078d\u079d\u07bc\u0776\u0776\u78c3\u78b3\u789d\u78c7\u78c4\u78c5\u78b3\u78ae\u78b5\u78c8\u7852\u7852\u3411\u32a9\u33f9\u32a1\u340b\u33f1\u33f5\u33f3\u32a4\u32a0\u341c\u341c\uc79c\uc77c\uc790\uc790\ub3dd\ub2a7\ub442\ub3d2\ubf3e\ubf48\ubf44\ubf1d\u8a3a\u8a16\u89e0\u8a47\u89e3\u8a4b\u8a4b\u89ef\u8477\u847f\u8452\u852a\u8523\u8520\u848a\u852a\u845e\u845e\u846f\u845b\u848a\u84bc\u84af\u8457\u8489\u847c\u8529\u84b3\u01b5\u0175\u01b6\u0161\u0169\u01c1\u01b6\u0199\u019a\u01c4\u01b9\u01ac\u01bf\u0198\u01c4\u015f\u01c1\u01b3\u017d\u017d\uf4e2\uf54a\uf4e0\uf547\uf539\uf4e8\uf538\uf544\uf513\uf514\uf51d\uf516\uf511\uf3a3\uf534\uf547\uf518\uf534\uf531\uf3ab\uce88\ucec7\ucf25\uce6d\uce51\uce6c\uce8c\uce6e\ucf29\uce79\uce8a\ucec0\u3dc7\u3d87\u3dc8\u3dbe\u3d95\u3dbe\u3d4c\u3d64\u3d64\u3d94\u3db1\u3db8\u3dad\u3db6\u3dc4\u3db0\u3dbd\u3dc8\u3db0\u3db5\u3d8f\u3d83\u3d93\u3db7\u3dae\u3d8c\u3d95\u3db5\u3d67\u3d95\u3d6b\u3d7f\u0a48\u09ea\u09df\u09e2\u0a47\u09e2\u0a0c\u09eb\u09e9\u09d2\u0a2e\u09de\ucc39\ucc17\ucc12\ucc0f\ucc3a\ucc13\ucc1b\ucc47\ucc18\ucbe5\ucaab\ucaab\u1754\u1778\u174e\u1825\u1789\u1821\u1821\u179d\ua241\ua22d\ua217\ua230\ua21c\ua234\ua234\ua208\udd53\udd94\udd7a\udd72\udd4e\udd6f\udd8f\udd71\u32ea\u32ee\u334b\u3318\u3336\u334a\u19a6\u19a6\uc07c\uc07a\uc07e\uc051\uc125\uc088\uc072\uc04c\u12a2\u1407\u1402\u1407\u13f9\u12a8\u13f8\u1404\u3384\u3380\u3381\u3423\u335a\u3388\u3358\u3372\u3426\u3422\u335a\u3428\u3375\u3377\u33bf\u3425\u3371\u3354\u3382\u3421\u335b\u33c4\u3386\u3423\u3424\u342a\u3359\u337e\u721f\u715d\u721f\u7181\u7178\u7154\u7168\u7168\uc9a5\ue308\uc9a7\ue2d4\ue2fa\uc9a6\uc9a3\ue2d3\u5075\u5089\u5085\u5058\u506c\u5050\u50b0\u5052\ue183\ue227\ue16f\ue155\ue15a\ue16f\ue227\ue173\ube00\ubca8\ube02\ubca9\ubdd7\ube0a\ubdda\ubca6\ubdf5\ubdf6\ubdfb\ubdf4\ubdef\ube45\ubdd6\ubca9\ubdfa\ubdd6\ubdd5\ubdd5\ubddc\ube45\ubdd1\ubca1\ubdf4\ubdf8\ubdd3\ubca1\ubca0\ubdf4\ubdf5\ubdd5\ubddd\ube03\ube3f\ubdd4\ubcaa\ubdf0\ubddc\ubca3\ube08\ubdf9\ubdd4\ubca9\ubdde\ubca4\ubdd5\ubdf9\ubdf5\ubdf5\ubdf4\ubca4\ubcaa\ubdf8\ubddb\ubdfa\ubddd\ube42\ube03\ubdf6\ube41\ubddb\ubdf5\ube0d";
        char[] cArray = "\u50be\u50a6\u508a\u509e\u50aa\u50aa\u50ba\u50ba\u508e\u508e\u5086\u5086\u50b2\u508e\u50a6\u50be\u50b2\u50a6\u50b6\u50a2\u50b6\u5096\u50a6\u50a2\u50a6\u50a2\u50ba\u50aa\u50be\u503a\u50a6\u50f6\u50a2\u50a2\u50a2\u50ba\u50ba\u50ba\u50f6\u50a2\u50ba\u50a6\u50a6\u50a2\u50a2\u50aa\u508a\u508e\u50a6\u5082\u50a2\u50a2\u5092\u50a6\u50a2\u50b6\u50aa\u50a2\u50ba\u50b6\u50a6\u50a6\u50be\u50aa\u50a6\u50a6\u50aa\u50a6\u50a6\u50be\u50aa\u50a2\u50a2\u50a2\u50be\u50be\u50a6\u50be\u50a2\u50be\u50be\u50be\u50be\u50a2\u50be\u50b6\u50be\u50a6\u50a2\u50a2\u50b6\u50be\u50a2\u50b6\u50b6\u50be\u50a2\u50a6\u50a2\u50be\u50ba\u50a2\u50ba\u50a6\u50a2\u50be\u50be\u50a6\u50a2\u50be\u50a2\u50a2\u508e\u50a6\u50a2\u50a6\u5086\u50b6\u50a2\u50a2\u50ba\u5086\u50a6\u50aa\u50aa\u50a6\u509e\u50a6\u50a6\u50a2\u50a6\u50aa\u50a2\u50ba\u50a2\u50a2\u50aa\u50aa\u50aa\u50a6\u50ba\u50ba\u50ba\u50a2\u508e\u50a2\u50a2\u50a6\u50a6\u50a6\u50a6\u50a6\u50a6\u50b2\u50a6\u50a6\u50a6\u50a6\u50ee".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 == 0) {
                lllIll = stringArray;
                llllII = new Object[stringArray.length];
                int n6 = -1129104773;
                byte[] byArray = "R\u00f8]\u008e\u00ff~\u0083\u00a4\u0099\u008a\u00e01y\u009e\u008aj\u00e9\u000b\u00b8\u00ad\u00c3 \u00cc?\u00f0[W\u00f3\t\u00b4l\u00e1\u00a4\u00830\u008bx\u00ec\u00f2\u0010\u00e9!PE/\u00f2\u0007Lo\u001bJd\u0083\u00c5??X\u0080\u00e1N\u00e3\u00ea5'\u00f8\u00f5\u009bL\u00b4b\u001cv3\u00db\u009f\u00c08\"\u0003*Ge\u009e\u00b8<\u0097b&`n\u00a5\u0084\u00ab\u0098\u00c7b4u2\u00c9\u00a9\u0010,\u00c2\u001a\u0095\u00cd\u00ab\u00f717;a\u0011\u00ce\u0095,\u0081>c\u00d7\u008f\u0001\u000b\u00e5:W\u00fe\u00c6b\u008f\u008ft\u0007\u00bc\u00c6V\u008c\u00d9\u00e9\u00e2\u00e6\u0088\u00e9\u00e7V\u0088\u00d83\u008c\u00c4X\u00f6\u00e7lo\u00136\u00db\u0000$\u00bd\u00dc\u00bb~w\u0086J\u00c8\u00f15ZJ\u00fc\u00f96\u0014\u00efE\u007f\u009b\u00cc\u001e\u00c2\u0094Q\u00ed\u00db\u0014\u00c7\u00ccA\u00fd\u00dd\u008dPg\u001e\u00f2\u00e1Z\u00dc\u00d9\"\u0083o\u00ee\u0088\u0011\u007f%N\u00delq\u001d\fi\u0091g\u0010\u00ff\u00e1A\u000f\u009fk\u00d6\u008aI\u001bH\u00e2\u00c8\u0011\u00bem%qL\u0018\r\u00a7\u009c\u00df\u00a6\u000f\u00f9R\u0002\u00ea\u00a8\u00be\u00ddN\u00d3\u0086X\b\u0084\u007f9a\u00f8#\u0093\u00bdRk\u00cf\u001f\u0088\u00df\u00af*3[1\u00a1\u00b8CF\u00beD\u00e0\bb{\u00aa\u00b0\u00da7t\u007fM\u0097\u0003l/\u00b58=7x\u00829\u009d\u00f81E\u00d7\u0099\u0085M\u0017\u00e4\u00eeo\u00f3\u00e3b\u008a\u00a1\\>\u0099s\u00cc\b#\u00b5\u00ab\u00f1\u00e6O\u00113\u0004\u0005DC\u0086N\u00ff\u0089\u00c7\u008f`R\u00fc\u00e5;\u00d7\u00efQU3p\u00966\u00d2\b\u00e7\u00e0{\u0081\u00c4\u00d8\u0013\u0094\u0000/%\u001c\u007f\u0080m\u00aa\u001c\u00ad\u00e6P\u0090\u00c3nt\u00ab\u009e\u0015\u00ce\u00ee\u00e0&\u0005\u0084\r\u00d5$LQ\u00b4>`\u009ei9\u00b5\u001bb\u00b9\u00c5\u0006S\u00f8\u00abC\u00d7\u000f\u0004\u00e3P\u00fa\u00a3\"\u000f-\u009e\u0083\r\u00f6\r\u0082`\u00aa\u0095\u00ee\u00d3\"\u001b\u00b8\u0001\u00f2f\u00abI\u00fbU\u0002DQ%_>\u00caW\u0094\u0005\u00f5E\u00e1)L\u009fL\t\u00c6\u0090ZF[\u00f9\u00b5\u00c15\u0002\u00fd\u0093EE\u00e0\u00d2\u00c9\u00a1\u00d55\u00a5\u0013\u00b4:\u009b\u00b4\u0092\u0012(\u00ec\u0097\u001d\u00c6\u0099\u0007\u0084|e\u00e1\u0088L\u008c\u001b\u00ff\u0093\u0080F\t\u00af\u00cb\u00e6\u00c6\u00cf I\u0015\u009b5IZ\u00d4'\u000b\u00d9\u00fc/\u00acV\u0015\"L{\u00a0\u00e1q\u00a4\u00b0D8\u00d7\u00ed\u0084T\u00e3\u00c8\u001b\u000f\u00a5\u00e6\u0019\u00abA\u000f\u00ee\u0002\u00b3!.\u00b4\u00e2\u0001\u0087\u00c5\u00fe\ny\u001a\u0001\u00c3\u001e\u00db\u00fa\u001f+\u00cf\u00e42M\u00a1\u00a2\u00c6\u00be\u0002\u0098AJB\u00e6Du\u00a0\u0010\u0087\u00c1F\u0094#\u00e3:N\u0005\u00da\u001ao\u00fc!\u00b1\u00e6\u00da\u0005>[wE\u008b\u00ffb\u0015\u00eb\u00f9\u00f8yZ\u00d2\u00d9~\u0011M]\u0089\u0094o\u00d6C8\u008c\u0096X\u0003\u00c2}\u007f\u00fb\u0005\u00fdP\t\u00cc\u00f6\u00a1v/\u0013:\u0014\u00f7\u00db\u00e6-\u00a4\u00f0\u00b8\r-\u00e7\u008e\u001c\u0000\u008b\u0019\u00ed\u000e\u0004\u00a4IK\u00b3\u0087\u00d8>\u0085\u00bb\u00eb$\u0084\rH&N\u00eb\u0087\f\u009e\u00ba\u00c9(\u0012\u00ac\u00c3\u00d0\"\u00e8\u0012_\u00c8\u00d8\u00b0\u00d8cT\u00a3\u00d4\u00d3\u001b\u00e7)u\u00ce\u00ea\u00ad\u00e3|\u008b'\u00dd,b\u008d3V\u008d.wTc\u00c1\u00f5\u00e5\u00d2*R\u00e3kFE\u0001I\u0019\u00ac\u0011\u001a\bV\u00d3\u00bd\u0097\u0015r\u0095u\u00c8\u0098\u00e5\u0012\u00e8a+\u00b0\u0092wBl&<T".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                lllIlI = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    lIllIIlI.lllIlI[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                IIIlIl = StringFactory.IIII("file");
                I = StringFactory.IIII("Empty");
                IlIl = StringFactory.IIII("Empty list");
                lIllII = StringFactory.IIII("-");
                lIl = new Category[]{Category.II, Category.ll, Category.IIl, Category.l, Category.I};
                lIIIlI = new Illl[]{orchard.internal.Illl.I, orchard.internal.Illl.ll, orchard.internal.Illl.lI, orchard.internal.Illl.II};
                llll = Set.of(Long.valueOf(StringFactory.IIII("mYFAkxRWUxk=").lIl()), Long.valueOf(StringFactory.IIII("lZVXmQpAUQw=").lIl()));
                lIIIll = Set.of(StringFactory.IIII("mZ1ZnQpEWQ+D").lIl(), StringFactory.IIII("jIZdmx5SQh6YHA==").lIl(), StringFactory.IIII("lptdkg1SQh2UHA==").lIl(), StringFactory.IIII("j4BVjA==").lIl(), StringFactory.IIII("lptRmh9SUwiBAZpO").lIl(), StringFactory.IIII("koFZjAtSQxmD").lIl(), StringFactory.IIII("m5hdnxJHVR2FBA==").lIl(), StringFactory.IIII("iJFVjhVUUQiUAA==").lIl(), StringFactory.IIII("m5hdnxJHUx2DC5c=").lIl(), StringFactory.IIII("m5VGiBhEQxWEHA==").lIl(), StringFactory.IIII("mYFAkw5WXBc=").lIl(), StringFactory.IIII("lpteiRRHVBmbCYY=").lIl(), StringFactory.IIII("iJFGmhxURAueBptaB9LMmZ0=").lIl(), StringFactory.IIII("i4RGlRdDQhmEDYs=").lIl(), StringFactory.IIII("i4RGlRdD").lIl(), StringFactory.IIII("i5pVjA1WQA==").lIl(), StringFactory.IIII("mYFAkw1YXxA=").lIl(), StringFactory.IIII("m5hdnxJEWRGCBJ5NBtzQjQ==").lIl(), StringFactory.IIII("nZhNiAtWQwuWGA==").lIl(), StringFactory.IIII("npVHiAlbUR+S").lIl(), StringFactory.IIII("m4ZNjw1WXBOHHJZUBsDbjA==").lIl(), StringFactory.IIII("m4ZNjw1WXBOHHJZUBsnbjA==").lIl(), StringFactory.IIII("lptZlQpEVBmbCYY=").lIl(), StringFactory.IIII("lpFCmQtaWQ+E").lIl(), StringFactory.IIII("vpVHiCFn").lIl(), StringFactory.IIII("vpVHiDpWQgg=").lIl(), StringFactory.IIII("i4RRnQtbRRKQDQ==").lIl(), StringFactory.IIII("q5xdmRVTcg6SCZRcHQ==").lIl(), StringFactory.IIII("noZdmRdTQw==").lIl(), StringFactory.IIII("k5FNjxBaRRCWHJZWAcA=").lIl(), StringFactory.IIII("jJFVkQo=").lIl());
                lIlIII = StringFactory.IIII("Cooldown");
                llIlIl = StringFactory.IIII("variability");
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
    private static boolean lIllll(lllIlIII lllIlIII2) {
        ModuleBase moduleBase = lIllIIlI.lIIIllI(lllIlIII2);
        if (moduleBase == null) return true;
        if (moduleBase.IIIlIIl()) return true;
        if (!moduleBase.lllllI()) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static double llIIIl(double d, double d2, double d3) {
        double d4 = (d2 - d3) * 0.5;
        double d5 = Math.max(0.0, d2 - d3);
        if (Math.abs(d - d4) <= 5.0) {
            return d4;
        }
        if (Math.abs(d) <= 4.0) {
            return 0.0;
        }
        if (!(Math.abs(d - d5) <= 4.0)) return d;
        return d5;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private void llIIlI(DrawContext var1_1, List<lllIlIII> var2_2) {
        block6: {
            block7: {
                var3_3 = 190.0;
                var5_4 = this.IIlIllI();
                var7_5 = this.IIIlII();
                var9_6 = (double)var2_2.size() * var7_5;
                var11_7 = this.IlllI(var2_2.size());
                var13_8 = Math.max(8.0, (double)this.IlIIl.I() - var3_3 - 10.0);
                var15_9 = 12.0;
                var17_10 = this.IllII.IIlI;
                var19_11 = this.IllII.lIIl;
                if (!Double.isFinite(var17_10) || var17_10 < 8.0 || var17_10 > (double)this.IlIIl.I() - var3_3 - 8.0) {
                    var17_10 = var13_8;
                }
                if (!Double.isFinite(var19_11) || var19_11 < 8.0 || var19_11 > (double)this.IlIIl.ll() - var11_7 - 8.0) {
                    var19_11 = var15_9;
                }
                this.IllII.IIlI = var17_10;
                this.IllII.lIIl = var19_11;
                var21_12 = var19_11 + var5_4;
                var23_13 = Math.max(0.0, var11_7 - var5_4 - 7.0);
                var25_14 = Math.max(0.0, var9_6 - var23_13);
                this.IllII.llIl = Math.max(0.0, Math.min(var25_14, this.IllII.llIl));
                var27_15 = this.IIIIIl(5L, this.IllII.llIl);
                this.IIlIlI.IIlII(var17_10, var19_11, var3_3, var11_7, false);
                this.IIlIlI.IlllI("HUD Modules", var17_10 + var3_3 * 0.5, this.llllII(var19_11, var5_4), this.IIlIlI.llIII(), var3_3 - 18.0);
                this.llIIII.II(var17_10, var19_11, var3_3, var5_4, (IIIIlIII)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/client/gui/Click;Z)Z, IIIllll(net.minecraft.client.gui.Click boolean ), (Lnet/minecraft/client/gui/Click;Z)Z)((lIllIIlI)this));
                this.llIIII.Il(var17_10, var21_12, var3_3, var23_13, null, (lllIlIlI)LambdaMetafactory.metafactory(null, null, null, (DDDD)Z, lIIIIII(double double double double double double ), (DDDD)Z)((lIllIIlI)this, (double)var25_14, (double)var7_5));
                orchard.internal.IIIlI.llII(var1_1, var17_10 + 6.0, var21_12, var17_10 + var3_3 - 6.0, var21_12 + var23_13);
                var29_16 = var21_12 + 3.0 - var27_15;
                var31_17 = var2_2.iterator();
                break block7;
lbl29:
                // 2 sources

                while (true) {
                    var50_29 = v0;
                    this.IIlIlI.llIIl(lIllIIlI.llllIl(var32_18), var38_23 + 10.0, this.llllII(var29_16, var7_5 - 2.0), Math.max(0.0, var46_27 - var38_23 - 10.0 - 8.0), var50_29);
                    this.IIlIlI.IIllI(var46_27, var48_28, var34_20);
                    this.llIIII.II(var38_23, var29_16, var40_24, var7_5 - 2.0, (IIIIlIII)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/client/gui/Click;Z)Z, lIll(orchard.core.ModuleBase long orchard.internal.lllIlIII net.minecraft.client.gui.Click boolean ), (Lnet/minecraft/client/gui/Click;Z)Z)((lIllIIlI)this, (ModuleBase)var33_19, (long)var35_21, (lllIlIII)var32_18));
                    break block6;
                    break;
                }
lbl35:
                // 1 sources

                while (var29_16 <= var21_12 + var23_13) {
                    block8: {
                        var33_19 = lIllIIlI.lIIIllI(var32_18);
                        var34_20 = lIllIIlI.lIllll(var32_18);
                        var35_21 = lIllIIlI.lIIllIl(var32_18);
                        var37_22 = this.IllII.lI(var35_21);
                        var38_23 = var17_10 + 8.0;
                        var40_24 = var3_3 - 16.0;
                        var42_25 = orchard.internal.IIIlI.IlIlI();
                        var44_26 = orchard.internal.IIIlI.llIIll();
                        var46_27 = var38_23 + var40_24 - 10.0 - var42_25;
                        var48_28 = var29_16 + (var7_5 - 2.0 - var44_26) * 0.5;
                        this.IIlIlI.lI(var38_23, var29_16, var40_24, false, false);
                        if (!var34_20) break block8;
                        v0 = this.IIlIlI.llIII();
                        ** GOTO lbl29
                    }
                    v0 = this.IIlIlI.II();
                    ** continue;
lbl54:
                    // 1 sources

                    ** GOTO lbl29
                }
                break block6;
            }
lbl57:
            // 2 sources

            while (true) {
                if (!var31_17.hasNext()) {
                    orchard.internal.IIIlI.lIllll(var1_1);
                    return;
                }
                var32_18 = var31_17.next();
                if (var29_16 + var7_5 >= var21_12) ** GOTO lbl35
                break;
            }
        }
        var29_16 += var7_5;
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIlII() {
        block2: {
            String string;
            block6: {
                block4: {
                    block5: {
                        block3: {
                            block1: {
                                if (this.lllIIl == null) {
                                    return false;
                                }
                                if (!this.lllIIl.I) break block1;
                                this.lIlIlI = lIllIIlI.lIIIII(this.l);
                                break block2;
                            }
                            if (!this.lllIIl.II) break block3;
                            if (this.l != null) break block4;
                            break block5;
                        }
                        this.lllIIl.II(this.l);
                        break block2;
                    }
                    string = "";
                    break block6;
                }
                string = this.l.trim();
            }
            String string2 = string;
            this.II = string2.isBlank() ? "Preset" : string2;
        }
        this.lllIIl = null;
        this.IllI();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIlIl(int n) {
        if (this.client == null) return false;
        if (this.client.getWindow() == null) return false;
        if (GLFW.glfwGetKey((long)this.client.getWindow().getHandle(), (int)n) != 1) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean keyPressed(KeyInput keyInput) {
        int n;
        block62: {
            block29: {
                block28: {
                    String string;
                    block51: {
                        int n2;
                        block63: {
                            block38: {
                                block36: {
                                    String string2;
                                    block50: {
                                        block35: {
                                            block39: {
                                                block61: {
                                                    block59: {
                                                        block25: {
                                                            block60: {
                                                                block58: {
                                                                    block57: {
                                                                        block56: {
                                                                            block37: {
                                                                                block40: {
                                                                                    block31: {
                                                                                        block45: {
                                                                                            block54: {
                                                                                                block55: {
                                                                                                    block53: {
                                                                                                        block52: {
                                                                                                            block44: {
                                                                                                                String string3;
                                                                                                                block48: {
                                                                                                                    String string4;
                                                                                                                    block49: {
                                                                                                                        block47: {
                                                                                                                            block46: {
                                                                                                                                block43: {
                                                                                                                                    block42: {
                                                                                                                                        block41: {
                                                                                                                                            block34: {
                                                                                                                                                block32: {
                                                                                                                                                    block33: {
                                                                                                                                                        block30: {
                                                                                                                                                            block27: {
                                                                                                                                                                block26: {
                                                                                                                                                                    if (this.IlIlI) {
                                                                                                                                                                        return true;
                                                                                                                                                                    }
                                                                                                                                                                    n = keyInput.key();
                                                                                                                                                                    if (this.IlII) break block26;
                                                                                                                                                                    if (this.llIll == null) break block27;
                                                                                                                                                                    if (n == 256 || n == 259 || n == 261) break block28;
                                                                                                                                                                    this.llIll.IlI(lIIllllI.IlIIIll(n));
                                                                                                                                                                    break block29;
                                                                                                                                                                }
                                                                                                                                                                if (n != 256) return true;
                                                                                                                                                                this.IlII = false;
                                                                                                                                                                return true;
                                                                                                                                                            }
                                                                                                                                                            if (this.lIlIIlI()) {
                                                                                                                                                                if (n != 256) return true;
                                                                                                                                                                this.llII = true;
                                                                                                                                                                return true;
                                                                                                                                                            }
                                                                                                                                                            if (!this.IlIIlI) break block30;
                                                                                                                                                            if (n == 256) break block31;
                                                                                                                                                            break block32;
                                                                                                                                                        }
                                                                                                                                                        if (this.lllIIl == null) break block33;
                                                                                                                                                        if (n != 256) break block34;
                                                                                                                                                        break block35;
                                                                                                                                                    }
                                                                                                                                                    if (this.llIlI != null && n == 256) break block36;
                                                                                                                                                    if (n == 256) {
                                                                                                                                                        if (this.IllII.l == orchard.internal.Illl.Il) {
                                                                                                                                                            this.close();
                                                                                                                                                            return true;
                                                                                                                                                        }
                                                                                                                                                        this.IllII.l = orchard.internal.Illl.Il;
                                                                                                                                                        this.IlIIlI = false;
                                                                                                                                                        this.lllIIl = null;
                                                                                                                                                        this.ll = false;
                                                                                                                                                        this.lIIlll();
                                                                                                                                                        return true;
                                                                                                                                                    }
                                                                                                                                                    if (this.IllII.l == orchard.internal.Illl.I) {
                                                                                                                                                        return true;
                                                                                                                                                    }
                                                                                                                                                    if (n != 258) break block37;
                                                                                                                                                    if ((keyInput.modifiers() & 1) == 0) break block38;
                                                                                                                                                    break block39;
                                                                                                                                                }
                                                                                                                                                if (n != 257 && n != 335) break block40;
                                                                                                                                                break block31;
                                                                                                                                            }
                                                                                                                                            if (this.llIlI(keyInput)) {
                                                                                                                                                this.ll = true;
                                                                                                                                                return true;
                                                                                                                                            }
                                                                                                                                            if (this.IIl(keyInput)) {
                                                                                                                                                if (this.client == null) return true;
                                                                                                                                                if (this.l.isEmpty()) return true;
                                                                                                                                                this.client.keyboard.setClipboard(this.l);
                                                                                                                                                return true;
                                                                                                                                            }
                                                                                                                                            if (this.Illllll(keyInput)) {
                                                                                                                                                if (this.client != null && !this.l.isEmpty()) {
                                                                                                                                                    this.client.keyboard.setClipboard(this.l);
                                                                                                                                                }
                                                                                                                                                this.l = "";
                                                                                                                                                this.ll = false;
                                                                                                                                                return true;
                                                                                                                                            }
                                                                                                                                            if (!this.IllIlIl(keyInput)) break block41;
                                                                                                                                            string3 = this.lIIII();
                                                                                                                                            if (!this.lllIIl.I) break block42;
                                                                                                                                            break block43;
                                                                                                                                        }
                                                                                                                                        if (n != 257 && n != 335) break block44;
                                                                                                                                        break block45;
                                                                                                                                    }
                                                                                                                                    if (!this.ll) {
                                                                                                                                        String string5 = string3;
                                                                                                                                        String string6 = this.l;
                                                                                                                                        this.l = string6 + string5;
                                                                                                                                        return true;
                                                                                                                                    }
                                                                                                                                    this.l = string3;
                                                                                                                                    this.ll = false;
                                                                                                                                    return true;
                                                                                                                                }
                                                                                                                                if (!this.ll) break block46;
                                                                                                                                if (string3.length() <= 20) break block47;
                                                                                                                                break block48;
                                                                                                                            }
                                                                                                                            String string7 = string3;
                                                                                                                            String string8 = this.l;
                                                                                                                            string4 = string8 + string7;
                                                                                                                            if (string4.length() <= 20) break block49;
                                                                                                                            string2 = string4.substring(0, 20);
                                                                                                                            break block50;
                                                                                                                        }
                                                                                                                        string = string3;
                                                                                                                        break block51;
                                                                                                                    }
                                                                                                                    string2 = string4;
                                                                                                                    break block50;
                                                                                                                }
                                                                                                                string = string3.substring(0, 20);
                                                                                                                break block51;
                                                                                                            }
                                                                                                            if (n != 259) break block52;
                                                                                                            if (this.ll) {
                                                                                                                this.l = "";
                                                                                                                this.ll = false;
                                                                                                                return true;
                                                                                                            }
                                                                                                            if ((keyInput.modifiers() & 0xA) == 0 && !this.lIIlllI()) {
                                                                                                                if (this.l.isEmpty()) return true;
                                                                                                                this.l = this.l.substring(0, this.l.length() - 1);
                                                                                                                return true;
                                                                                                            }
                                                                                                            break block53;
                                                                                                        }
                                                                                                        if (n == 261) {
                                                                                                            this.l = "";
                                                                                                            this.ll = false;
                                                                                                            return true;
                                                                                                        }
                                                                                                        if (n == 263 || n == 262 || n == 268) break block54;
                                                                                                        break block55;
                                                                                                    }
                                                                                                    this.l = lIllIIlI.IIlIl(this.l);
                                                                                                    return true;
                                                                                                }
                                                                                                if (n != 269) {
                                                                                                    this.ll = false;
                                                                                                    return true;
                                                                                                }
                                                                                            }
                                                                                            this.ll = false;
                                                                                            return true;
                                                                                        }
                                                                                        this.llIlII();
                                                                                        this.ll = false;
                                                                                        return true;
                                                                                    }
                                                                                    this.IlIIlI = false;
                                                                                    this.ll = false;
                                                                                    return true;
                                                                                }
                                                                                if (this.llIlI(keyInput)) {
                                                                                    this.ll = true;
                                                                                    return true;
                                                                                }
                                                                                break block56;
                                                                            }
                                                                            if (n != 263 && n != 265) {
                                                                                if (n != 262) {
                                                                                    if (n != 264) return super.keyPressed(keyInput);
                                                                                }
                                                                                this.IlIll(1);
                                                                                return true;
                                                                            }
                                                                            this.IlIll(-1);
                                                                            return true;
                                                                        }
                                                                        if (this.IIl(keyInput)) {
                                                                            if (this.client == null) return true;
                                                                            if (this.lIlIll.isEmpty()) return true;
                                                                            this.client.keyboard.setClipboard(this.lIlIll);
                                                                            return true;
                                                                        }
                                                                        if (this.Illllll(keyInput)) {
                                                                            if (this.client != null && !this.lIlIll.isEmpty()) {
                                                                                this.client.keyboard.setClipboard(this.lIlIll);
                                                                            }
                                                                            this.lIlIll = "";
                                                                            this.ll = false;
                                                                            this.IllII.lII(this.IllII.IlII, 0.0);
                                                                            return true;
                                                                        }
                                                                        if (!this.IllIlIl(keyInput)) break block57;
                                                                        if (!this.ll) {
                                                                            String string9 = this.lIIII();
                                                                            String string10 = this.lIlIll;
                                                                            this.lIlIll = string10 + string9;
                                                                            break block25;
                                                                        } else {
                                                                            this.lIlIll = this.lIIII();
                                                                            this.ll = false;
                                                                        }
                                                                        break block25;
                                                                    }
                                                                    if (n != 259) break block58;
                                                                    if (this.ll) break block59;
                                                                    if ((keyInput.modifiers() & 0xA) != 0 || this.lIIlllI()) break block60;
                                                                    if (!this.lIlIll.isEmpty()) {
                                                                        this.lIlIll = this.lIlIll.substring(0, this.lIlIll.length() - 1);
                                                                    }
                                                                    break block61;
                                                                }
                                                                if (n == 261) {
                                                                    this.lIlIll = "";
                                                                    this.ll = false;
                                                                    this.IllII.lII(this.IllII.IlII, 0.0);
                                                                    return true;
                                                                }
                                                                break block62;
                                                            }
                                                            this.lIlIll = lIllIIlI.IIlIl(this.lIlIll);
                                                            break block61;
                                                        }
                                                        this.IllII.lII(this.IllII.IlII, 0.0);
                                                        return true;
                                                    }
                                                    this.lIlIll = "";
                                                    this.ll = false;
                                                }
                                                this.IllII.lII(this.IllII.IlII, 0.0);
                                                return true;
                                            }
                                            n2 = -1;
                                            break block63;
                                        }
                                        this.lllIIl = null;
                                        this.ll = false;
                                        return true;
                                    }
                                    this.l = string2;
                                    return true;
                                }
                                this.llIl();
                                return true;
                            }
                            n2 = 1;
                        }
                        this.IlIll(n2);
                        return true;
                    }
                    this.l = string;
                    this.ll = false;
                    return true;
                }
                this.llIll.IlI(InputUtil.UNKNOWN_KEY);
            }
            this.llIll = null;
            this.IllI();
            return true;
        }
        if (n != 263 && n != 262 && n != 268 && n != 269) {
            this.ll = false;
            return true;
        }
        this.ll = false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double llIllI(ModuleBase moduleBase, IIllIl<?> iIllIl, String string, double d) {
        long l2 = lIllIIlI.IIIlIl(moduleBase.IlIIllI(), iIllIl.lllI(), StringFactory.I(string));
        double d2 = this.lIlllI.getOrDefault(l2, d);
        double d3 = this.lllI(d2, d, 18.0);
        this.lIlllI.put(l2, d3);
        return d3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private double llIlll(ModuleBase moduleBase, double d, double d2, double d3) {
        if (moduleBase == null) {
            return d2;
        }
        double d4 = 48.0;
        boolean bl2 = moduleBase.IIIlIIl();
        this.IIlIlI.IIlIl(d, d2, d3, d4, false, false, 1.0);
        double d5 = orchard.internal.IIIlI.IlIlI();
        double d6 = orchard.internal.IIIlI.llIIll();
        double d7 = d + d3 - 10.0 - d5;
        double d8 = d2 + (d4 - d6) * 0.5;
        double d9 = Math.max(0.0, d7 - d - 20.0);
        this.IIlIlI.llIIl(moduleBase.IIIlllI(), d + 10.0, d2 + 8.0, d9, this.IIlIlI.llIII());
        this.IIlIlI.lIl(moduleBase.IIllIIl(), d + 10.0, d2 + 26.0, d9, this.IIlIlI.II(), 0.68);
        this.IIlIlI.IIllI(d7, d8, bl2);
        this.llIIII.II(d, d2, d3, d4, (click, bl) -> {
            this.IIIIII(moduleBase);
            this.IllI();
            return true;
        });
        return d2 + d4 + 8.0;
    }

    private double lllIII(int n, double d) {
        return Math.min((double)this.IlIIl.ll() - 30.0, Math.max(82.0, 58.0 + (double)Math.max(1, n) * d));
    }

    private DrawContext lllIll() {
        return this.llIIIl;
    }

    private double llllII(double d, double d2) {
        return d + Math.max(0.0, (d2 - orchard.internal.IIIlI.IllIII(this.textRenderer)) * 0.5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static IIIlIIIII llllIl(lllIlIII lllIlIII2) {
        IIIlIIIII iIIlIIIII;
        if (lllIlIII2 instanceof ModuleBase) {
            ModuleBase moduleBase = (ModuleBase)((Object)lllIlIII2);
            return moduleBase.IIIlllI();
        }
        if (lllIlIII2 != null) {
            iIIlIIIII = StringFactory.lIl(lllIlIII2.getClass().getSimpleName());
            return iIIlIIIII;
        }
        iIIlIIIII = StringFactory.IIII("");
        return iIIlIIIII;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean IIIIIII() {
        if (this.IlIlI) return false;
        if (this.IlIIlI) return false;
        if (this.lllIIl != null) return false;
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IIIIIIl() {
        block5: {
            block4: {
                if (this.client == null) break block4;
                if (this.client.getWindow() != null) break block5;
            }
            this.IlIIl = lIllIIlI.IIIIlII(this.width, this.height, this.width, this.height);
            return;
        }
        this.IlIIl = lIllIIlI.IIIIlII(this.width, this.height, this.client.getWindow().getFramebufferWidth(), this.client.getWindow().getFramebufferHeight());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIIIIll(ModuleBase moduleBase) {
        if (moduleBase == null) return false;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static IlIIlIIIl IIIIlII(int n, int n2, int n3, int n4) {
        int n5 = Math.max(1, n);
        int n6 = Math.max(1, n2);
        int n7 = n3 > 0 ? n3 : n5;
        int n8 = n4 <= 0 ? n6 : n4;
        double d = (double)n7 / (double)n5;
        double d2 = (double)n8 / (double)n6;
        double d3 = Math.max(1.0, Math.min(d, d2));
        double d4 = IlIIllI.Illl(d3, n7, n8);
        int n9 = Math.max(1, (int)Math.ceil((double)n7 / d4));
        int n10 = Math.max(1, (int)Math.ceil((double)n8 / d4));
        return new IlIIlIIIl(n9, n10, (double)n5 / (double)n9, (double)n6 / (double)n10);
    }

    public void tick() {
        super.tick();
        if (this.IIllIIl(System.nanoTime())) {
            this.IIIlllI();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean charTyped(CharInput charInput) {
        if (this.lIlIIlI()) {
            return true;
        }
        if (this.lllIIl == null) {
            if (!this.IlIIlI) return false;
            if (!charInput.isValidChar()) {
                return false;
            }
        } else {
            if (!charInput.isValidChar()) {
                return false;
            }
            if (this.lllIIl.I) {
                if (this.ll) {
                    this.l = charInput.asString();
                    this.ll = false;
                    return true;
                }
                if (this.l.length() >= 20) {
                    return true;
                }
            }
            if (this.ll) {
                this.l = charInput.asString();
                this.ll = false;
                return true;
            }
            String string = charInput.asString();
            String string2 = this.l;
            this.l = string2 + string;
            return true;
        }
        if (this.ll) {
            this.lIlIll = charInput.asString();
            this.ll = false;
        } else {
            String string = charInput.asString();
            String string3 = this.lIlIll;
            this.lIlIll = string3 + string;
        }
        this.IllII.lII(this.IllII.IlII, 0.0);
        return true;
    }

    private Click IIIIlIl(Click click) {
        return new Click(this.IlIIl.l(click.x()), this.IlIIl.II(click.y()), click.buttonInfo());
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void IIIIlll(IIIlIIIII iIIlIIIII, double d, double d2, boolean bl) {
        this.IIlIlI.Illl(iIIlIIIII, d, d2, bl ? this.IIlIlI.llIII() : this.IIlIlI.II());
    }

    private String IIIlIII(IIllIIIII iIllIIIII) {
        if (iIllIIIII == null) {
            return "unknown";
        }
        int n = iIllIIIII.II();
        String string = " build ";
        String string2 = IIlllIIl.I(iIllIIIII.I(), iIllIIIII.l());
        return string2 + string + n;
    }

    /*
     * Unable to fully structure code
     */
    private double IIIlIIl(List<ModuleBase> var1_1) {
        block12: {
            block11: {
                block15: {
                    block9: {
                        block13: {
                            if (var1_1 != null) break block13;
lbl2:
                            // 2 sources

                            return 0.0;
lbl4:
                            // 1 sources

                            while (true) {
                                block10: {
                                    block14: {
                                        var9_6 = var1_1.get(var8_5);
                                        break block14;
lbl7:
                                        // 2 sources

                                        while (true) {
                                            var4_3 += var10_7;
                                            break block9;
                                            break;
                                        }
                                        while (true) {
                                            var2_2 += var6_4;
                                            break block10;
                                            break;
                                        }
                                    }
                                    var10_7 = this.lIlIlII(var9_6);
                                    if (var8_5 % 2 != 0) break block11;
                                    if (var2_2 > 0.0) ** continue;
                                }
                                var2_2 += var10_7;
                                break block9;
lbl20:
                                // 1 sources

                                while (true) {
                                    var4_3 += var6_4;
                                    ** GOTO lbl7
                                    break;
                                }
                                break;
                            }
lbl23:
                            // 1 sources

                            while (true) {
                                continue;
                                break;
                            }
lbl25:
                            // 1 sources

                            return Math.max(var2_2, var4_3);
                        }
                        if (var1_1.isEmpty()) {
                            ** continue;
                        }
                        break block15;
                    }
                    ++var8_5;
                    break block12;
lbl34:
                    // 1 sources

                    while (true) {
                        var8_5 = 0;
                        break block12;
                        break;
                    }
                    var4_3 = 0.0;
                    var6_4 = 6.0;
                    ** while (true)
                }
                var2_2 = 0.0;
                ** while (true)
            }
            if (var4_3 > 0.0) ** break;
            ** while (true)
            ** while (true)
        }
        ** while (var8_5 >= var1_1.size())
lbl49:
        // 1 sources

        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIlIlI(IIIlIIIII iIIlIIIII, String string, double d, double d2, double d3) {
        double d4 = d2 + 6.0;
        String string2 = string != null ? string : "";
        double d5 = string2.isBlank() ? 0.0 : Math.min(d3 * 0.48, Math.max(24.0, (double)this.IIlIlI.IIlI(string2) * 0.82 + 2.0));
        double d6 = Math.max(0.0, d3 - d5 - (!(d5 > 0.0) ? 0.0 : 7.0));
        this.IIlIlI.lIl(iIIlIIIII, d, d4, d6, -1, 0.82);
        if (string2.isBlank()) return;
        String string3 = this.IIlIlI.lIlII(string2, Math.max(0.0, d5 / 0.82));
        double d7 = (double)this.IIlIlI.IIlI(string3) * 0.82;
        this.IIlIlI.llI(string3, d + d3 - d7, d4, -1, 0.82);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIIlIll() {
        if (this.llIlIl(340)) return true;
        if (!this.llIlIl(344)) return false;
        return true;
    }

    private void IIIllII(DrawContext drawContext, Interface interface_) {
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIIllIl(DrawContext drawContext) {
        if (this.llIlI == null) {
            return;
        }
        double d = this.lIlIIll();
        List<String> list = this.IlIlllI(d);
        double d2 = 11.0;
        double d3 = this.lllIII(list.size(), d2);
        double d4 = ((double)this.IlIIl.I() - d) * 0.5;
        double d5 = ((double)this.IlIIl.ll() - d3) * 0.5;
        double d6 = d5 + d3 - 27.0;
        this.IIlIlI.IIlII(d4, d5, d, d3, true);
        this.IIlIlI.lIIl(this.IIlII == null ? StringFactory.IIII("Dangerous AltMask action") : this.IIlII, d4 + d * 0.5, d5 + 10.0, this.IIlIlI.llIII(), d - 18.0);
        double d7 = d5 + 29.0;
        Iterator<String> iterator = list.iterator();
        while (true) {
            if (!iterator.hasNext()) {
                this.IIlIlI.IllII(d4 + d * 0.5 - 80.0, d6, 70.0, 19.0, "Cancel", false);
                this.IIlIlI.IllII(d4 + d * 0.5 + 10.0, d6, 70.0, 19.0, "Confirm", true);
                this.llIIII.II(d4 + d * 0.5 - 80.0, d6, 70.0, 19.0, (click, bl) -> {
                    this.llIl();
                    return true;
                });
                this.llIIII.II(d4 + d * 0.5 + 10.0, d6, 70.0, 19.0, (click, bl) -> {
                    this.llIlI.I();
                    this.llIl();
                    this.IllI();
                    return true;
                });
                return;
            }
            String string = iterator.next();
            this.IIlIlI.IlllI(string, d4 + d * 0.5, d7, this.IIlIlI.II(), d - 18.0);
            d7 += d2;
        }
    }

    private void IIIlllI() {
        if (this.IllIlI) {
            return;
        }
        this.IllIlI = true;
        try {
            this.IIllllI();
        }
        finally {
            this.l = "";
            this.lIlIlI = "";
            this.II = "";
            this.IIllII = "";
            this.lIlIll = "";
            this.IIII = null;
            this.llIII = null;
            this.lIII.clear();
            this.lIllIl.clear();
            this.IIIIl.clear();
            this.IIl.clear();
            if (this.llIIll != null && this.client != null) {
                this.client.setScreen(this.llIIll);
            } else {
                super.close();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean IIIllll(Click click, boolean bl) {
        this.lllIII = IIlllllI.II;
        this.IIllIl = click.x() - this.IllII.IIlI;
        this.IIllll = click.y() - this.IllII.lIIl;
        return true;
    }

    private static Identifier IIlIIII() {
        return Identifier.of((String)"cats", (String)"textures/gui/custom_background");
    }

    /*
     * Unable to fully structure code
     */
    private double IIlIIlI(double var1_1, double var3_2, double var5_3, lIIIIlll var7_4) {
        block47: {
            block44: {
                block54: {
                    block55: {
                        block52: {
                            block45: {
                                block51: {
                                    block38: {
                                        block37: {
                                            block48: {
                                                block53: {
                                                    block42: {
                                                        block46: {
                                                            block43: {
                                                                block41: {
                                                                    block40: {
                                                                        block49: {
                                                                            block39: {
                                                                                block50: {
                                                                                    break block49;
lbl1:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        ++var28_21;
                                                                                        break block37;
                                                                                        break;
                                                                                    }
lbl4:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl6:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl8:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        this.Il = this.lllI(this.Il, var24_17, 18.0);
                                                                                        ** GOTO lbl4
                                                                                        break;
                                                                                    }
lbl11:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl13:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl15:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var12_7 = 0.0;
                                                                                        break block38;
                                                                                        break;
                                                                                    }
lbl18:
                                                                                    // 3 sources

                                                                                    while (true) {
                                                                                        if (var29_23 != var7_4) break block39;
                                                                                        break block40;
                                                                                        break;
                                                                                    }
lbl21:
                                                                                    // 2 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl23:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var18_14 += var8_5 + var10_6;
                                                                                        ** GOTO lbl18
                                                                                        break;
                                                                                    }
lbl26:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        v0 = true;
                                                                                        ** GOTO lbl6
                                                                                        break;
                                                                                    }
lbl29:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        v1 = 0;
                                                                                        ** GOTO lbl21
                                                                                        break;
                                                                                    }
lbl32:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var24_17 = var30_25;
                                                                                        break block39;
                                                                                        break;
                                                                                    }
lbl35:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        continue;
                                                                                        break;
                                                                                    }
lbl37:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        this.IIlIll = this.lllI(this.IIlIll, var22_16, 18.0);
                                                                                        ** continue;
                                                                                        break;
                                                                                    }
                                                                                    this.lIlI = var20_15;
                                                                                    break block50;
lbl42:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        var12_7 += var10_6;
                                                                                        break block41;
                                                                                        break;
                                                                                    }
lbl45:
                                                                                    // 1 sources

                                                                                    while (true) {
                                                                                        ++var30_26;
                                                                                        break block42;
                                                                                        break;
                                                                                    }
                                                                                }
                                                                                this.IIlIll = var22_16;
                                                                                this.Il = var24_17;
                                                                                ** while (true)
lbl52:
                                                                                // 1 sources

                                                                                while (var12_7 > 0.0) {
                                                                                    ** continue;
lbl54:
                                                                                    // 1 sources

                                                                                    ** GOTO lbl42
                                                                                }
                                                                                break block41;
lbl56:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    continue;
                                                                                    break;
                                                                                }
                                                                                var34_28 = v0;
                                                                                v2 = this.lllIll();
                                                                                if (var34_28) {
                                                                                    ** continue;
                                                                                }
                                                                                break block51;
                                                                            }
                                                                            var16_11 += var30_25 + var10_6;
                                                                            ** while (true)
lbl66:
                                                                            // 3 sources

                                                                            while (true) {
                                                                                if (var31_29 == var7_4) {
                                                                                    ** continue;
                                                                                }
                                                                                break block43;
                                                                                break;
                                                                            }
                                                                        }
                                                                        var8_5 = 20.0;
                                                                        var10_6 = 6.0;
                                                                        ** while (true)
lbl74:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            continue;
                                                                            break;
                                                                        }
lbl76:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var22_16 = var18_14;
                                                                            ** continue;
                                                                            break;
                                                                        }
lbl79:
                                                                        // 1 sources

                                                                        while (true) {
                                                                            var17_13 = var14_9[var16_12];
                                                                            ** GOTO lbl52
                                                                            break;
                                                                        }
                                                                    }
                                                                    var20_15 = var16_11;
                                                                    ** while (true)
lbl85:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
lbl87:
                                                                    // 1 sources

                                                                    while (Double.isNaN(this.lIlI)) {
                                                                        ** continue;
lbl89:
                                                                        // 1 sources

                                                                        ** GOTO lbl11
                                                                    }
                                                                    break block52;
lbl91:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        if (!(var16_11 > var1_1)) ** GOTO lbl66
                                                                        break block44;
                                                                        break;
                                                                    }
lbl94:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        ++var16_12;
                                                                        break block45;
                                                                        break;
                                                                    }
lbl97:
                                                                    // 1 sources

                                                                    while (true) {
                                                                        continue;
                                                                        break;
                                                                    }
                                                                }
                                                                var12_7 += Math.max(42.0, (double)this.IIlIlI.lIlIl(var17_13.lI()) + 20.0);
                                                                ** while (true)
                                                                var31_29 = var28_22[var30_26];
                                                                var32_27 = Math.max(42.0, (double)this.IIlIlI.lIlIl(var31_29.lI()) + 20.0);
                                                                ** while (true)
lbl105:
                                                                // 1 sources

                                                                while (true) {
                                                                    var26_19 = var3_2 + var8_5;
                                                                    break block46;
                                                                    break;
                                                                }
lbl108:
                                                                // 1 sources

                                                                while (true) {
                                                                    var18_14 = var3_2;
                                                                    ** continue;
                                                                    break;
                                                                }
                                                            }
                                                            v0 = false;
                                                            ** while (true)
lbl114:
                                                            // 1 sources

                                                            return var26_19;
lbl116:
                                                            // 1 sources

                                                            while (true) {
                                                                break block47;
                                                                break;
                                                            }
                                                        }
                                                        var28_22 = lIIIIlll.values();
                                                        var29_24 = var28_22.length;
                                                        var30_26 = 0;
                                                    }
                                                    ** while (var30_26 >= var29_24)
lbl124:
                                                    // 1 sources

                                                    ** while (true)
                                                    orchard.internal.IIIlI.Illl(v2, var16_11, var18_14, var32_27, var8_5, 6.0, v1);
                                                    v3 = var31_29.lI();
                                                    v4 = this.llllII(var18_14, var8_5);
                                                    if (!var34_28) break block53;
                                                    break block54;
lbl130:
                                                    // 1 sources

                                                    while (true) {
                                                        if (!(var16_11 + var30_25 > var1_1 + var5_3)) ** GOTO lbl18
                                                        break block48;
                                                        break;
                                                    }
                                                    var29_23 = var26_18[var28_21];
                                                    var30_25 = Math.max(42.0, (double)this.IIlIlI.lIlIl(var29_23.lI()) + 20.0);
                                                    if (var16_11 > var1_1) ** break;
                                                    ** while (true)
                                                    ** while (true)
                                                }
                                                v5 = this.IIlIlI.II();
                                                ** GOTO lbl56
                                                orchard.internal.IIIlI.Illl(this.lllIll(), this.lIlI, this.IIlIll, this.Il, var8_5, 6.0, this.IIlIlI.lIll(116));
                                                var16_11 = var14_8;
                                                ** while (true)
                                            }
                                            var16_11 = var1_1;
                                            ** while (true)
                                        }
lbl148:
                                        // 2 sources

                                        while (var28_21 < var27_20) {
                                            ** continue;
lbl150:
                                            // 1 sources

                                            ** GOTO lbl35
                                        }
                                        ** GOTO lbl87
                                    }
                                    var14_9 = lIIIIlll.values();
                                    var15_10 = var14_9.length;
                                    var16_12 = 0;
                                    break block45;
lbl157:
                                    // 1 sources

                                    while (true) {
                                        continue;
                                        break;
                                    }
                                }
                                v1 = 0x18FFFFFF;
                                ** while (true)
                                var22_16 = var3_2;
                                break block55;
                                var26_19 = Math.max(var26_19, var18_14 + var8_5);
                                var16_11 += var32_27 + var10_6;
                                ** while (true)
                                this.IIlIlI.lIIl(v3, var16_11 + var32_27 * 0.5, v4, v5, var32_27 - 10.0);
                                this.llIIII.II(var16_11, var18_14, var32_27, var8_5, (IIIIlIII)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/client/gui/Click;Z)Z, IIllIII(orchard.internal.lIIIIlll net.minecraft.client.gui.Click boolean ), (Lnet/minecraft/client/gui/Click;Z)Z)((lIllIIlI)this, (lIIIIlll)var31_29));
                                ** while (true)
                            }
                            ** while (var16_12 >= var15_10)
lbl172:
                            // 1 sources

                            ** while (true)
                        }
                        this.lIlI = this.lllI(this.lIlI, var20_15, 18.0);
                        ** while (true)
                        var16_11 = var1_1;
                        var18_14 += var8_5 + var10_6;
                        ** GOTO lbl66
                    }
                    var24_17 = 0.0;
                    var26_18 = lIIIIlll.values();
                    var27_20 = var26_18.length;
                    var28_21 = 0;
                    ** GOTO lbl148
                }
                v5 = this.IIlIlI.llIII();
                ** while (true)
            }
            if (var16_11 + var32_27 > var1_1 + var5_3) ** break;
            ** while (true)
            ** while (true)
        }
        var14_8 = var1_1 + Math.max(0.0, (var5_3 - var12_7) * 0.5);
        var16_11 = var14_8;
        ** while (true)
        var18_14 = var3_2;
        var20_15 = var14_8;
        ** while (true)
    }

    private void IIlIlIl(MinecraftClient minecraftClient, String string) {
        CompletableFuture.runAsync(() -> {
            NativeImage nativeImage;
            byte[] byArray = lIllIIlI.IIlI(string);
            NativeImage nativeImage2 = nativeImage = byArray == null ? null : lIllIIlI.IlIlI(byArray);
            if (minecraftClient == null) {
                if (nativeImage != null) {
                    try {
                        nativeImage.close();
                    }
                    catch (Throwable throwable) {
                        // empty catch block
                    }
                }
                return;
            }
            minecraftClient.execute(() -> {
                if (!string.equals(this.lllII)) {
                    if (nativeImage != null) {
                        try {
                            nativeImage.close();
                        }
                        catch (Throwable throwable) {
                            // empty catch block
                        }
                    }
                    return;
                }
                this.IlIIII(minecraftClient);
                if (nativeImage != null && minecraftClient.getTextureManager() != null) {
                    try {
                        Identifier identifier = lIllIIlI.IIlIIII();
                        minecraftClient.getTextureManager().registerTexture(identifier, (AbstractTexture)new NativeImageBackedTexture(() -> ((Identifier)identifier).toString(), nativeImage));
                        this.IIIlII = true;
                    }
                    catch (Throwable throwable) {
                        try {
                            nativeImage.close();
                        }
                        catch (Throwable throwable2) {
                            // empty catch block
                        }
                    }
                }
            });
        });
    }

    private double IIlIllI() {
        return 28.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IIlIlll(MinecraftClient minecraftClient, Interface interface_) {
        String string = interface_ == null ? "" : interface_.llII().trim();
        if (string.equals(this.lllII)) return;
        this.lllII = string;
        if (!string.isEmpty() && lIllIIlI.IlIIlII(string)) {
            this.IIlIlIl(minecraftClient, string);
            return;
        }
        this.IlIIII(minecraftClient);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean IIllIII(lIIIIlll lIIIIlll2, Click click, boolean bl) {
        this.IllII.lIl = lIIIIlll2;
        this.IllII.lllI = 0.0;
        this.lIllIl.clear();
        this.IIIIl.clear();
        this.lIIlll();
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIllIIl(long l2) {
        if (!this.IlIlI) return false;
        if (this.lIIlI <= 0.015) return true;
        if (this.IlllIl <= 0L) return false;
        if (l2 - this.IlllIl < 750000000L) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private double IIllIlI(DrawContext var1_1, ModuleBase var2_2, double var3_3, double var5_4, double var7_5, double var9_6, double var11_7, double var13_8) {
        block49: {
            block50: {
                block61: {
                    block37: {
                        block60: {
                            block51: {
                                block43: {
                                    block58: {
                                        block55: {
                                            block57: {
                                                block42: {
                                                    block53: {
                                                        block59: {
                                                            block52: {
                                                                block38: {
                                                                    block36: {
                                                                        block40: {
                                                                            block54: {
                                                                                block35: {
                                                                                    block45: {
                                                                                        block56: {
                                                                                            block47: {
                                                                                                block46: {
                                                                                                    block48: {
                                                                                                        block39: {
                                                                                                            block44: {
                                                                                                                block41: {
                                                                                                                    break block53;
lbl1:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        this.lIIlIl(var1_1, (IIlllIll)var38_14, var3_3 + 7.0, var29_12 + 2.0, var7_5 - 14.0);
                                                                                                                        break block35;
                                                                                                                        break;
                                                                                                                    }
lbl4:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        if (var15_9) break block36;
                                                                                                                        break block37;
                                                                                                                        break;
                                                                                                                    }
lbl7:
                                                                                                                    // 2 sources

                                                                                                                    while (true) {
                                                                                                                        v0 = false;
                                                                                                                        break block38;
                                                                                                                        break;
                                                                                                                    }
lbl10:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        if (!(var29_12 < var11_7)) break block35;
                                                                                                                        ** continue;
                                                                                                                        break;
                                                                                                                    }
lbl13:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        if (!(var29_12 + var40_28 > var9_6)) break block39;
                                                                                                                        break block40;
lbl16:
                                                                                                                        // 2 sources

                                                                                                                        return var25_10;
                                                                                                                    }
lbl18:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        continue;
                                                                                                                        break;
                                                                                                                    }
lbl20:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        if (!(var29_12 < var11_7)) break block41;
                                                                                                                        break block42;
                                                                                                                        break;
                                                                                                                    }
lbl23:
                                                                                                                    // 2 sources

                                                                                                                    while (true) {
                                                                                                                        v1 = true;
                                                                                                                        break block43;
                                                                                                                        break;
                                                                                                                    }
lbl26:
                                                                                                                    // 2 sources

                                                                                                                    while (true) {
                                                                                                                        var38_14 = var2_2.IlIlIl().iterator();
                                                                                                                        break block44;
                                                                                                                        break;
                                                                                                                    }
lbl29:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        if (!var2_2.lllllI()) ** GOTO lbl26
                                                                                                                        break block45;
                                                                                                                        break;
                                                                                                                    }
lbl32:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        continue;
                                                                                                                        break;
                                                                                                                    }
lbl34:
                                                                                                                    // 2 sources

                                                                                                                    while (true) {
                                                                                                                        continue;
                                                                                                                        break;
                                                                                                                    }
lbl36:
                                                                                                                    // 2 sources

                                                                                                                    while (true) {
                                                                                                                        continue;
                                                                                                                        break;
                                                                                                                    }
lbl38:
                                                                                                                    // 1 sources

                                                                                                                    while (true) {
                                                                                                                        if (!(var29_12 < var11_7)) break block46;
                                                                                                                        break block47;
                                                                                                                        break;
                                                                                                                    }
                                                                                                                }
lbl42:
                                                                                                                // 3 sources

                                                                                                                while (true) {
                                                                                                                    var29_12 += var36_27;
                                                                                                                    ** continue;
                                                                                                                    break;
                                                                                                                }
lbl45:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    continue;
                                                                                                                    break;
                                                                                                                }
lbl47:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    v2 = true;
                                                                                                                    break block48;
                                                                                                                    break;
                                                                                                                }
lbl50:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    continue;
                                                                                                                    break;
                                                                                                                }
                                                                                                                var25_10 = 39.0;
                                                                                                                if (!var15_9) break block54;
                                                                                                                break block55;
lbl55:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    this.IlIIII.remove(var2_2.IlIIllI());
                                                                                                                    break block36;
                                                                                                                    break;
                                                                                                                }
lbl59:
                                                                                                                // 1 sources

                                                                                                                while (true) {
                                                                                                                    continue;
                                                                                                                    break;
                                                                                                                }
                                                                                                            }
lbl62:
                                                                                                            // 2 sources

                                                                                                            while (var38_14.hasNext()) {
                                                                                                                break block49;
                                                                                                            }
                                                                                                            break block56;
lbl65:
                                                                                                            // 1 sources

                                                                                                            while (true) {
                                                                                                                continue;
                                                                                                                break;
                                                                                                            }
                                                                                                        }
lbl68:
                                                                                                        // 3 sources

                                                                                                        while (true) {
                                                                                                            var29_12 += var40_28;
                                                                                                            ** GOTO lbl62
                                                                                                            break;
                                                                                                        }
lbl71:
                                                                                                        // 1 sources

                                                                                                        while (true) {
                                                                                                            var33_25 = 2.0 + var31_13 * var27_11;
                                                                                                            break block50;
                                                                                                            break;
                                                                                                        }
                                                                                                        var36_27 = 27.0;
                                                                                                        if (!(var29_12 + var36_27 > var9_6)) ** GOTO lbl42
                                                                                                        ** while (true)
                                                                                                    }
lbl78:
                                                                                                    // 2 sources

                                                                                                    while (true) {
                                                                                                        var16_18 = v2;
                                                                                                        ** continue;
                                                                                                        break;
                                                                                                    }
                                                                                                }
lbl82:
                                                                                                // 3 sources

                                                                                                while (true) {
                                                                                                    var29_12 += var38_15;
                                                                                                    ** continue;
                                                                                                    break;
                                                                                                }
                                                                                            }
                                                                                            this.IllIIl(var2_2, var3_3 + 7.0, var29_12, var7_5 - 14.0);
                                                                                            ** GOTO lbl82
                                                                                        }
                                                                                        if (!(var2_2 instanceof IIlllIll)) break block51;
                                                                                        break block57;
                                                                                    }
                                                                                    var38_15 = 27.0;
                                                                                    if (var29_12 + var38_15 > var9_6) ** break;
                                                                                    ** while (true)
                                                                                    ** while (true)
                                                                                }
lbl97:
                                                                                // 2 sources

                                                                                while (true) {
                                                                                    var29_12 += var39_16;
                                                                                    break block51;
                                                                                    break;
                                                                                }
lbl100:
                                                                                // 1 sources

                                                                                while (this.IllII.II(var2_2)) {
                                                                                    ** continue;
lbl102:
                                                                                    // 1 sources

                                                                                    ** GOTO lbl47
                                                                                }
                                                                                break block58;
lbl104:
                                                                                // 1 sources

                                                                                while (true) {
                                                                                    if (!(var5_4 < var11_7)) ** GOTO lbl7
                                                                                    break block52;
                                                                                    break;
                                                                                }
                                                                                var19_21 = this.IllII.I(var2_2);
                                                                                var20_22 = var3_3 + var7_5 - 10.0;
                                                                                ** while (true)
                                                                            }
                                                                            v3 = 0.0;
                                                                            ** GOTO lbl34
                                                                            var29_12 = var5_4 + 39.0;
                                                                            var31_13 = this.IlIII(var2_2);
                                                                            ** while (true)
lbl116:
                                                                            // 1 sources

                                                                            while (true) {
                                                                                var40_28 = this.IllllII(var1_1, var2_2, var39_17, var3_3 + 7.0, var29_12, var7_5 - 14.0);
                                                                                ** GOTO lbl68
                                                                                break;
                                                                            }
                                                                            var27_11 = v3;
                                                                            if (!(var27_11 > 0.01)) ** GOTO lbl16
                                                                            ** while (true)
lbl122:
                                                                            // 1 sources

                                                                            while (var2_2.IIIlIIl()) {
                                                                                ** GOTO lbl23
                                                                            }
                                                                            break block59;
                                                                        }
                                                                        if (var29_12 < var11_7) ** break;
                                                                        ** while (true)
                                                                        ** while (true)
                                                                    }
                                                                    var17_19 = var2_2.lllllI();
                                                                    if (var17_19) ** break;
                                                                    ** while (true)
                                                                    ** GOTO lbl122
                                                                }
lbl135:
                                                                // 2 sources

                                                                while (true) {
                                                                    continue;
                                                                    break;
                                                                }
                                                            }
                                                            v0 = true;
                                                            ** while (true)
                                                        }
                                                        v1 = false;
                                                        break block43;
                                                        var22_23 = Math.max(0.0, var20_22 - (var3_3 + 10.0) - 10.0);
                                                        break block60;
                                                    }
                                                    var15_9 = this.IIIIIll(var2_2);
                                                    if (!var15_9) break block58;
                                                    ** GOTO lbl100
                                                }
                                                this.l(var2_2, var3_3 + 7.0, var29_12, var7_5 - 14.0);
                                                ** while (true)
                                            }
                                            var38_14 = (IIlllIll)var2_2;
                                            ** while (true)
                                        }
                                        v3 = this.Il(var2_2, var16_18, false);
                                        ** while (true)
                                    }
                                    v2 = false;
                                    ** while (true)
                                }
                                var18_20 = v1;
                                ** while (true)
                                var24_24 = v0;
                                if (!var24_24) ** GOTO lbl36
                                break block61;
                                var39_16 = this.llll((IIlllIll)var38_14);
                                ** while (!(var29_12 + var39_16 > var9_6))
lbl169:
                                // 1 sources

                                ** while (true)
                            }
                            while (true) {
                                var25_10 += var31_13 * var27_11;
                                ** continue;
                                break;
                            }
lbl174:
                            // 1 sources

                            while (true) {
                                if (!var16_18 || !(var27_11 > 0.92)) ** continue;
                                ** continue;
                                break;
                            }
                        }
                        this.IIlIlI.IIlIl(var3_3, var5_4, var7_5, 39.0, false, false, var13_8);
                        this.IIlllI(var2_2, var3_3 + 10.0, var5_4 + 6.0, var22_23, var18_20, var13_8);
                        ** while (true)
                    }
                    this.IllII.IIll(var2_2);
                    ** while (true)
                }
                this.llIIII.II(var3_3, var5_4, var7_5, 37.0, (IIIIlIII)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/client/gui/Click;Z)Z, lIIlIIl(orchard.core.ModuleBase boolean net.minecraft.client.gui.Click boolean ), (Lnet/minecraft/client/gui/Click;Z)Z)((lIllIIlI)this, (ModuleBase)var2_2, (boolean)var15_9));
                ** while (true)
                this.IlIlIll(var2_2, var3_3 + 10.0, var5_4 + 22.0, var22_23, var18_20, var13_8);
                if (var5_4 + 39.0 > var9_6) ** break;
                ** while (true)
                ** while (true)
            }
            var35_26 = IIIIlIIII.lllIl(new Color(28, 30, 34), (int)(255.0 * var13_8));
            orchard.internal.IIIlI.Illl(var1_1, var3_3, var29_12 - 2.0, var7_5, var33_25, 5.0, var35_26);
            ** while (true)
        }
        var39_17 = var38_14.next();
        var40_28 = this.lIII(var2_2, var39_17);
        ** while (true)
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IIllIll(IIllIl<?> iIllIl) {
        if (!(iIllIl instanceof lIlIIlI)) return false;
        if (iIllIl.lllI() != StringFactory.IIII("Density / Breach").llII()) return false;
        return true;
    }

    private void IIllllI() {
        if (this.IIlIIl) {
            return;
        }
        try {
            this.IllI();
        }
        catch (RuntimeException runtimeException) {
        }
        finally {
            this.IIlIIl = true;
        }
    }

    private double IlIIIIl(IIIlIIIII iIIlIIIII, double d, double d2) {
        double d3 = Math.max(48.0, Math.min(92.0, d2 * 0.34));
        double d4 = d + d2 * 0.42;
        return Math.min(d4, d + d2 - d3);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIIlI(IIIlIIIII iIIlIIIII, String string, double d, double d2, double d3, Runnable runnable) {
        double d4 = 23.0;
        double d5 = 88.0;
        double d6 = 19.0;
        double d7 = d + d3 - d5 - 10.0;
        double d8 = d2 + (d4 - d6) * 0.5;
        this.IIlIlI.lI(d, d2, d3, false, false);
        this.IIlIlI.llIIl(iIIlIIIII, d + 10.0, this.llllII(d2, d4), Math.max(0.0, d7 - d - 18.0), this.IIlIlI.llIII());
        this.IIlIlI.IllII(d7, d8, d5, d6, string, false);
        this.llIIII.II(d, d2, d3, d4, (click, bl) -> {
            runnable.run();
            return true;
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IlIIIll(double d, double d2, double d3, double d4, double d5, double d6) {
        if (!(d >= d3)) return false;
        if (!(d <= d3 + d5)) return false;
        if (!(d2 >= d4)) return false;
        if (!(d2 <= d4 + d6)) return false;
        return true;
    }

    private static boolean IlIIlII(String string) {
        if (string == null) {
            return false;
        }
        String string2 = string.trim();
        if (string2.isEmpty() || string2.length() > 2048) {
            return false;
        }
        if (string2.startsWith("https://") || string2.startsWith("http://")) {
            return true;
        }
        try {
            return IIIlIl.IIII().equalsIgnoreCase(URI.create(string2).getScheme());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean mouseReleased(Click click) {
        this.lllIII = IIlllllI.l;
        this.IllI = null;
        this.Illll = null;
        this.llIIlI = null;
        this.IlI = null;
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIlIl() {
        this.lIIlIll();
        this.lllIII = IIlllllI.l;
        this.IllI = null;
        this.Illll = null;
        this.llIIlI = null;
        this.IlI = null;
        this.llIll = null;
        this.llIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static boolean IlIIllI(IIIlIIIII iIIlIIIII, String string) {
        if (iIIlIIIII == null) return false;
        if (string == null) return false;
        if (!string.isEmpty()) {
            int n = string.length();
            int[] nArray = new int[]{0};
            boolean[] blArray = new boolean[]{false};
            iIIlIIIII.llI(n2 -> {
                if (blArray[0]) {
                    return;
                }
                int n3 = Character.toLowerCase(n2);
                if (n3 == string.charAt(nArray[0])) {
                    nArray[0] = nArray[0] + 1;
                    if (nArray[0] != n) return;
                    blArray[0] = true;
                    return;
                }
                nArray[0] = n3 == string.charAt(0) ? 1 : 0;
            });
            return blArray[0];
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IlIIlll(DrawContext drawContext) {
        if (!this.IlII) {
            return;
        }
        double d = Math.min(320.0, Math.max(240.0, (double)this.IlIIl.I() - 30.0));
        double d2 = 118.0;
        double d3 = ((double)this.IlIIl.I() - d) * 0.5;
        double d4 = ((double)this.IlIIl.ll() - d2) * 0.5;
        this.IIlIlI.IIlII(d3, d4, d, d2, true);
        this.IIlIlI.IlllI("Upload Config", d3 + d * 0.5, d4 + 12.0, this.IIlIlI.llIII(), d - 24.0);
        double d5 = d3 + 16.0;
        double d6 = d4 + 32.0;
        double d7 = d - 32.0;
        double d8 = 46.0;
        int n = 0x22000000;
        int n2 = 0x33FFFFFF;
        orchard.internal.IIIlI.Illl(this.lllIll(), d5, d6, d7, d8, 4.0, n2);
        orchard.internal.IIIlI.Illl(this.lllIll(), d5 + 1.0, d6 + 1.0, d7 - 2.0, d8 - 2.0, 3.0, n);
        double d9 = d6 + (d8 - orchard.internal.IIIlI.IllIII(this.textRenderer)) * 0.5;
        this.IIlIlI.IlllI("Drop a .json config file here", d3 + d * 0.5, d9, this.IIlIlI.llIII(), d7 - 16.0);
        double d10 = 76.0;
        double d11 = 20.0;
        double d12 = d3 + (d - d10) * 0.5;
        double d13 = d4 + d2 - 28.0;
        this.IIlIlI.IllII(d12, d13, d10, d11, "Close", false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IlIlIll(ModuleBase moduleBase, double d, double d2, double d3, boolean bl, double d4) {
        String string;
        String string2;
        String string3 = string2 = moduleBase == null ? "" : moduleBase.IIlllll();
        if (string2 == null || string2.isBlank() || d3 <= 0.0) {
            return;
        }
        double d5 = d3 / 0.58;
        List<String> list = this.IIII(string2, d5);
        int n = this.lIlI(-1433627736, d4);
        if (list.isEmpty()) {
            return;
        }
        String string4 = list.get(0);
        if (list.size() > 1 || (double)orchard.internal.IIIlI.IIIlll(this.textRenderer, string4) > d5) {
            string = "...";
            String string5 = string4;
            string4 = this.IIlIlI.lIlII(string5 + string, d5);
        }
        if (string4.length() > 96) {
            String string6 = "...";
            string = string4.substring(0, 96);
            string4 = this.IIlIlI.lIlII(string + string6, d5);
        }
        orchard.internal.IIIlI.lIlIIl(this.lllIll());
        try {
            orchard.internal.IIIlI.Ill(this.lllIll(), d, d2);
            orchard.internal.IIIlI.IIlll(this.lllIll(), 0.58, 0.58);
            this.IIlIlI.IIlIlI(string4, 0.0, 0.0, d5, n);
        }
        finally {
            orchard.internal.IIIlI.IlIllI(this.lllIll());
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void IlIllII(DrawContext drawContext, double d, double d2, double d3, double d4) {
        this.IIIII = d;
        this.Illl = d2;
        this.IlIIIl = d3;
        this.IIIlll = d4;
        boolean bl2 = this.IlIIlI;
        orchard.internal.IIIlI.Illl(this.lllIll(), d, d2, d3, d4, 6.0, -14013131);
        double d5 = 14.0;
        double d6 = d + 7.0;
        double d7 = d + 25.0;
        double d8 = Math.max(10.0, d3 - 32.0);
        int n = !this.lIlIll.isBlank() ? this.IIlIlI.llIII() : this.IIlIlI.II();
        this.IIlIlI.IIlll(d6, d2 + Math.max(0.0, (d4 - d5) * 0.5), n);
        if (bl2) {
            String string = this.lIlIll;
            double d9 = this.IIlIlI.IIlI(string);
            double d10 = Math.max(0.0, d9 - d8);
            double d11 = d7 - d10;
            double d12 = this.llllII(d2, d4);
            orchard.internal.IIIlI.llII(this.lllIll(), d7, d2 + 1.0, d + d3 - 4.0, d2 + d4 - 1.0);
            try {
                if (this.ll && !string.isEmpty()) {
                    int n2 = IlIIIIll.III().getRGB();
                    orchard.internal.IIIlI.Illl(this.lllIll(), d11 - 1.0, d12 - 1.0, d9 + 2.0, orchard.internal.IIIlI.IllIII(this.textRenderer) + 2.0, 2.0, n2 & 0xFFFFFF | Integer.MIN_VALUE);
                }
                this.IIlIlI.IllI(string, d11, d12, n);
            }
            finally {
                orchard.internal.IIIlI.lIllll(this.lllIll());
            }
            double d13 = Math.min(d + d3 - 6.0, d11 + d9);
            this.I(d13, d2 + (d4 - 12.0) * 0.5, 12.0);
            this.IIIllI(drawContext);
        } else {
            String string = this.lIlIll.isBlank() ? "Search" : this.lIlIll;
            String string2 = this.IIlIlI.lIlII(string, d8);
            this.IIlIlI.IllI(string2, d7, this.llllII(d2, d4), n);
        }
        this.llIIII.II(d, d2, d3, d4, (click, bl) -> {
            this.IlIIlI = true;
            this.lllIIl = null;
            this.ll = false;
            return true;
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private List<String> IlIlllI(double d) {
        String string = this.IIII == null ? "Click Confirm to apply this setting." : this.IIII;
        return this.IIII(string, Math.max(80.0, d - 22.0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void IlIllll() {
        this.IlII = true;
        this.lllIIl = null;
        this.IlIIlI = false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String IllIIII(Category category) {
        switch (category) {
            case I: {
                return "Hud";
            }
            case II: {
                return "Combat";
            }
            case ll: {
                return "Movement";
            }
            default: {
                throw new MatchException(null, null);
            }
            case IIl: {
                return "Player";
            }
            case l: {
                return "Render";
            }
            case lI: 
        }
        return "Interface";
    }

    private double IllIIll(ModuleBase moduleBase, IIllIl<?> iIllIl, double d) {
        return this.llIllI(moduleBase, iIllIl, "", d);
    }

    private String IllIlII(IIIlIlll iIIlIlll) {
        if (iIIlIlll == null) {
            return "unknown";
        }
        int n = iIIlIlll.l();
        String string = " build ";
        String string2 = IIlllIIl.I(iIIlIlll.ll(), iIIlIlll.Il());
        return string2 + string + n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IllIlIl(KeyInput keyInput) {
        int n = keyInput.key();
        int n2 = keyInput.modifiers();
        boolean bl = n == 86 && ((n2 & 0xA) != 0 || this.lIIlllI());
        boolean bl2 = n == 260 && ((n2 & 1) != 0 || this.IIIlIll());
        if (bl) return true;
        if (bl2) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllIlll(IIIlIlIIl iIIlIlIIl, double d, boolean bl) {
        double d2 = IIIIlIIII.IIII((d - this.lIlIIl) / Math.max(1.0, this.llllI), 0.0, 1.0);
        double d3 = iIIlIlIIl.IIlI() + (iIIlIlIIl.IlI() - iIIlIlIIl.IIlI()) * d2;
        if (bl) {
            iIIlIlIIl.I(new double[]{d3, iIIlIlIIl.IIII()});
        } else {
            iIIlIlIIl.I(new double[]{iIIlIlIIl.IIIl(), d3});
        }
        this.IllI();
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean IlllIII(long l2, lllIlIII lllIlIII2, Click click, boolean bl) {
        this.IllII.III(l2);
        this.IllI = lllIlIII2;
        this.IIllI = click.x() - lllIlIII2.IlII();
        this.IllIll = click.y() - lllIlIII2.IlIl();
        this.lIllI(click.x(), click.y());
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private String IlllIIl(IIIlIlll iIIlIlll) {
        if (this.lIlIlll(iIIlIlll.lI())) {
            return iIIlIlll.lI().trim();
        }
        if (!this.lIlIlll(iIIlIlll.I())) return "";
        return iIIlIlll.I().trim();
    }

    private static /* synthetic */ boolean IlllIll(Set set, Theme theme) {
        return !set.contains(theme);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private double IllllII(DrawContext drawContext, ModuleBase moduleBase, IIllIl<?> iIllIl, double d, double d2, double d3) {
        IIIlIIIII iIIlIIIII = this.IIIl(iIllIl);
        boolean bl2 = iIllIl instanceof llIll;
        boolean bl3 = iIllIl instanceof lIlIIlI || iIllIl instanceof IIIlIlIIl || iIllIl instanceof llIlIlII;
        double d4 = bl2 ? d + d3 - 4.0 - orchard.internal.IIIlI.IlIlI() : this.IlIIIIl(iIIlIIIII, d, d3);
        double d5 = Math.max(0.0, d + d3 - d4);
        double d6 = d2 + Math.max(0.0, (24.0 - orchard.internal.IIIlI.IllIII(this.textRenderer) * 0.82) * 0.5);
        if (!bl3) {
            this.IIlIlI.lIl(iIIlIIIII, d, d6, Math.max(0.0, d4 - d - 8.0), -1, 0.82);
        }
        if (iIllIl instanceof llIll) {
            llIll llIll2 = (llIll)iIllIl;
            double d7 = d4;
            double d8 = d2 + (24.0 - orchard.internal.IIIlI.llIIll()) * 0.5;
            this.IIlIlI.IIllI(d7, d8, (Boolean)llIll2.lIl());
            this.llIIII.II(d, d2, d3, 24.0, (click, bl) -> {
                this.lIIIIll(moduleBase, llIll2, (Boolean)llIll2.lIl() == false);
                return true;
            });
            return 27.0;
        }
        if (iIllIl instanceof lIlIIlI) {
            lIlIIlI lIlIIlI2 = (lIlIIlI)iIllIl;
            String string = lIlIIlI2.lII().IIII();
            String string2 = lIllIIlI.lI((Double)lIlIIlI2.lIl());
            String string3 = string2 + string;
            this.IIIlIlI(iIIlIIIII, string3, d, d2, d3);
            double d9 = d;
            double d10 = d3;
            double d11 = ((Double)lIlIIlI2.lIl() - lIlIIlI2.Ill()) / Math.max(1.0E-4, lIlIIlI2.Il() - lIlIIlI2.Ill());
            this.IIlIlI.llIll(d9, d2 + 8.0, d10, this.IllIIll(moduleBase, iIllIl, d11), "", !this.IIllIll(iIllIl), 0.82);
            this.llIIII.II(d9, d2 + 12.0, d10, 28.0, (click, bl) -> {
                this.Illll = lIlIIlI2;
                this.lIlIIl = d9;
                this.llllI = d10;
                this.IIlII(lIlIIlI2, click.x());
                return true;
            });
            return 44.0;
        }
        if (iIllIl instanceof IIIlIlIIl) {
            IIIlIlIIl iIIlIlIIl = (IIIlIlIIl)iIllIl;
            String string = iIIlIlIIl.IlII().IIII();
            String string4 = lIllIIlI.lI(iIIlIlIIl.IIII());
            String string5 = "-";
            String string6 = lIllIIlI.lI(iIIlIlIIl.IIIl());
            String string7 = string6 + string5 + string4 + string;
            this.IIIlIlI(iIIlIIIII, string7, d, d2, d3);
            double d12 = d;
            double d13 = d3;
            double d14 = (iIIlIlIIl.IIIl() - iIIlIlIIl.IIlI()) / Math.max(1.0E-4, iIIlIlIIl.IlI() - iIIlIlIIl.IIlI());
            double d15 = (iIIlIlIIl.IIII() - iIIlIlIIl.IIlI()) / Math.max(1.0E-4, iIIlIlIIl.IlI() - iIIlIlIIl.IIlI());
            this.IIlIlI.llIl(d12, d2 + 8.0, d13, this.llIllI(moduleBase, iIllIl, "min", d14), this.llIllI(moduleBase, iIllIl, "max", d15), "", 0.82);
            this.llIIII.II(d12, d2 + 12.0, d13, 28.0, (click, bl) -> {
                this.llIIlI = iIIlIlIIl;
                this.lIlII = Math.abs(click.x() - (d12 + d13 * d14)) < Math.abs(click.x() - (d12 + d13 * d15));
                this.lIlIIl = d12;
                this.llllI = d13;
                this.IllIlll(iIIlIlIIl, click.x(), this.lIlII);
                return true;
            });
            return 44.0;
        }
        if (iIllIl instanceof IIIIIIIIl) {
            IIIIIIIIl iIIIIIIIl = (IIIIIIIIl)iIllIl;
            String string = this.IlIlII((Enum)iIIIIIIIl.lIl());
            this.lIIlII(iIllIl, d4, d2 + 2.0, d5, string);
            this.llIIII.II(d4, d2, d5, 24.0, (click, bl) -> {
                iIIIIIIIl.IIl();
                this.IllI();
                return true;
            });
            return 27.0;
        }
        if (iIllIl instanceof llIlIlI) {
            llIlIlI llIlIlI2 = (llIlIlI)iIllIl;
            double d16 = d2 + 23.0;
            for (IlllIll illlIll : llIlIlI2.IIIl()) {
                boolean bl4 = llIlIlI2.IIII(illlIll);
                this.IIlIlI.l(d, d16, d3, 18.0, illlIll.II(), bl4, 0.82);
                this.llIIII.II(d, d16, d3, 18.0, (click, bl) -> {
                    llIlIlI2.lll(illlIll);
                    this.IllI();
                    return true;
                });
                d16 += 21.0;
            }
            return 24.0 + (double)Math.max(1, llIlIlI2.IIIl().size()) * 21.0;
        }
        if (iIllIl instanceof llIlIlII) {
            llIlIlII llIlIlII2 = (llIlIlII)iIllIl;
            Color color = (Color)llIlIlII2.lIl();
            this.IIIlIlI(iIIlIIIII, "", d, d2, Math.max(0.0, d3 - 19.0));
            orchard.internal.IIIlI.Illl(drawContext, d + d3 - 16.0, d2 + 2.0, 14.0, 14.0, 4.0, IIIIlIIII.lllIl(color, color.getAlpha()));
            double d17 = d;
            double d18 = d3;
            double d19 = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null)[0];
            this.IIlIlI.lIIll(d17, d2 + 8.0, d18, this.IllIIll(moduleBase, iIllIl, d19), "", 0.82);
            this.llIIII.II(d17, d2 + 12.0, d18, 28.0, (click, bl) -> {
                this.IlI = llIlIlII2;
                this.lIlIIl = d17;
                this.llllI = d18;
                this.lIIllll(llIlIlII2, click.x(), click.button() == 1);
                return true;
            });
            return 44.0;
        }
        if (iIllIl instanceof lIIllII) {
            lIIllII lIIllII2 = (lIIllII)iIllIl;
            String string = lIIllllI.IlIl((InputUtil.Key)lIIllII2.lIl());
            this.IIlIlI.lIlll(d4, d2 + 2.0, d5, 20.0, string, false, 0.82);
            this.llIIII.II(d4, d2, d5, 24.0, (click, bl) -> {
                this.lIIIll(IlIlIIlIl.Ill(lIIllII2));
                return true;
            });
            return 27.0;
        }
        if (iIllIl instanceof lllIlI) {
            lllIlI lllIlI2 = (lllIlI)iIllIl;
            boolean bl5 = this.lllIIl != null && this.lllIIl.Il == lllIlI2;
            double d20 = d2 + 2.0;
            double d21 = 20.0;
            if (bl5) {
                String string = this.l;
                int n = -12960442;
                int n2 = -12170926;
                double d22 = Math.min(4.5, d21 * 0.5);
                orchard.internal.IIIlI.Illl(this.lllIll(), d4, d20, d5, d21, d22, n2);
                orchard.internal.IIIlI.Illl(this.lllIll(), d4 + 1.0, d20 + 1.0, d5 - 2.0, d21 - 2.0, Math.max(1.0, d22 - 1.0), n);
                double d23 = 6.0;
                double d24 = Math.max(10.0, d5 - d23 * 2.0);
                double d25 = 0.82;
                String string8 = string == null || string.isBlank() ? I.IIII() : string;
                double d26 = (double)this.IIlIlI.IIlI(string8) * d25;
                double d27 = Math.max(0.0, d26 - d24);
                double d28 = d4 + d23 - d27;
                double d29 = d20 + (d21 - orchard.internal.IIIlI.IllIII(this.textRenderer) * d25) * 0.5;
                orchard.internal.IIIlI.llII(this.lllIll(), d4 + 3.0, d20 + 1.0, d4 + d5 - 3.0, d20 + d21 - 1.0);
                try {
                    if (this.ll && !string8.isEmpty()) {
                        int n3 = IlIIIIll.III().getRGB();
                        orchard.internal.IIIlI.Illl(this.lllIll(), d28 - 1.0, d29 - 1.0, d26 + 2.0, orchard.internal.IIIlI.IllIII(this.textRenderer) * d25 + 2.0, 2.0, n3 & 0xFFFFFF | Integer.MIN_VALUE);
                    }
                    this.IIlIlI.llI(string8, d28, d29, -1, d25);
                }
                finally {
                    orchard.internal.IIIlI.lIllll(this.lllIll());
                }
                double d30 = Math.min(d4 + d5 - 5.0, d28 + d26);
                double d31 = d20 + (d21 - 12.0) * 0.5;
                this.I(d30, d31, 12.0);
                this.IIIllI(drawContext);
            } else {
                IIIlIIIII iIIlIIIII2 = lllIlI2.lI();
                this.IIlIlI.l(d4, d20, d5, d21, iIIlIIIII2.lIlI() ? I : iIIlIIIII2, false, 0.82);
            }
            this.llIIII.II(d4, d2, d5, 24.0, (click, bl) -> {
                this.lIIl(IlIlllII.IIl(lllIlI2), lllIlI2.I());
                return true;
            });
            return 27.0;
        }
        if (iIllIl instanceof Illllll) {
            double d32;
            double d33;
            double d34;
            double d35;
            double d36;
            int n;
            boolean bl6;
            Illllll illllll = (Illllll)iIllIl;
            double d37 = d;
            double d38 = d3;
            double d39 = 24.0;
            this.IIlIlI.lIlll(d37 + d38 - d39, d2 + 2.0, d39, 20.0, "", false, 0.82);
            this.lIlIll(drawContext, d37 + d38 - d39 * 0.5, d2 + 12.0, 7.0, -1);
            this.llIIII.II(d37 + d38 - d39, d2, d39, 24.0, (click, bl) -> {
                this.lIIl(IlIlllII.lI(illllll, illllll.IIll().size()), "");
                return true;
            });
            double d40 = d2 + 27.0;
            List<IIIlIIIII> list = illllll.IIll();
            boolean bl7 = bl6 = this.lllIIl != null && this.lllIIl.I(illllll, list.size());
            if (list.isEmpty() && !bl6) {
                this.IIlIlI.lIl(IlIl, d37, d40 + 4.0, d38, -1, 0.82);
                d40 += 21.0;
            }
            for (int i = 0; i < list.size(); ++i) {
                int n4 = i;
                IIIlIIIII iIIlIIIII3 = list.get(n4);
                n = this.lllIIl != null && this.lllIIl.I(illllll, n4) ? 1 : 0;
                double d41 = Math.max(28.0, d38 - 24.0 - 5.0);
                if (n != 0) {
                    String string = this.l;
                    int n5 = -12960442;
                    int n6 = -12170926;
                    d36 = Math.min(4.5, 9.0);
                    orchard.internal.IIIlI.Illl(this.lllIll(), d37, d40, d41, 18.0, d36, n6);
                    orchard.internal.IIIlI.Illl(this.lllIll(), d37 + 1.0, d40 + 1.0, d41 - 2.0, 16.0, Math.max(1.0, d36 - 1.0), n5);
                    d35 = 6.0;
                    double d42 = Math.max(10.0, d41 - d35 * 2.0);
                    double d43 = 0.82;
                    String string9 = string == null || string.isBlank() ? I.IIII() : string;
                    d34 = (double)this.IIlIlI.IIlI(string9) * d43;
                    d33 = Math.max(0.0, d34 - d42);
                    double d44 = d37 + d35 - d33;
                    d32 = d40 + (18.0 - orchard.internal.IIIlI.IllIII(this.textRenderer) * d43) * 0.5;
                    orchard.internal.IIIlI.llII(this.lllIll(), d37 + 3.0, d40 + 1.0, d37 + d41 - 3.0, d40 + 17.0);
                    try {
                        if (this.ll && !string9.isEmpty()) {
                            int n7 = IlIIIIll.III().getRGB();
                            orchard.internal.IIIlI.Illl(this.lllIll(), d44 - 1.0, d32 - 1.0, d34 + 2.0, orchard.internal.IIIlI.IllIII(this.textRenderer) * d43 + 2.0, 2.0, n7 & 0xFFFFFF | Integer.MIN_VALUE);
                        }
                        this.IIlIlI.llI(string9, d44, d32, -1, d43);
                    }
                    finally {
                        orchard.internal.IIIlI.lIllll(this.lllIll());
                    }
                    double d45 = Math.min(d37 + d41 - 5.0, d44 + d34);
                    double d46 = d40 + 3.0;
                    this.I(d45, d46, 12.0);
                    this.IIIllI(drawContext);
                } else {
                    this.IIlIlI.l(d37, d40, d41, 18.0, iIIlIIIII3.lIlI() ? I : iIIlIIIII3, false, 0.82);
                }
                this.IIlIlI.l(d37 + d41 + 5.0, d40, 24.0, 18.0, lIllII, false, 0.82);
                this.llIIII.II(d37, d40, d41, 18.0, (click, bl) -> {
                    this.lIIl(IlIlllII.lI(illllll, n4), iIIlIIIII3.IIII());
                    return true;
                });
                this.llIIII.II(d37 + d41 + 5.0, d40, 24.0, 18.0, (click, bl) -> {
                    this.lllIIl = null;
                    illllll.IllI(n4);
                    this.IllI();
                    return true;
                });
                d40 += 21.0;
            }
            if (bl6) {
                String string = this.l;
                double d47 = Math.max(28.0, d38 - 24.0 - 5.0);
                n = -12960442;
                int n8 = -12170926;
                double d48 = Math.min(4.5, 9.0);
                orchard.internal.IIIlI.Illl(this.lllIll(), d37, d40, d47, 18.0, d48, n8);
                orchard.internal.IIIlI.Illl(this.lllIll(), d37 + 1.0, d40 + 1.0, d47 - 2.0, 16.0, Math.max(1.0, d48 - 1.0), n);
                double d49 = 6.0;
                d36 = Math.max(10.0, d47 - d49 * 2.0);
                d35 = 0.82;
                String string10 = string.isBlank() ? "Empty" : string;
                double d50 = (double)this.IIlIlI.IIlI(string10) * d35;
                double d51 = Math.max(0.0, d50 - d36);
                d34 = d37 + d49 - d51;
                d33 = d40 + (18.0 - orchard.internal.IIIlI.IllIII(this.textRenderer) * d35) * 0.5;
                orchard.internal.IIIlI.llII(this.lllIll(), d37 + 3.0, d40 + 1.0, d37 + d47 - 3.0, d40 + 17.0);
                try {
                    if (this.ll && !string10.isEmpty()) {
                        int n9 = IlIIIIll.III().getRGB();
                        orchard.internal.IIIlI.Illl(this.lllIll(), d34 - 1.0, d33 - 1.0, d50 + 2.0, orchard.internal.IIIlI.IllIII(this.textRenderer) * d35 + 2.0, 2.0, n9 & 0xFFFFFF | Integer.MIN_VALUE);
                    }
                    this.IIlIlI.llI(string10, d34, d33, -1, d35);
                }
                finally {
                    orchard.internal.IIIlI.lIllll(this.lllIll());
                }
                double d52 = Math.min(d37 + d47 - 5.0, d34 + d50);
                d32 = d40 + 3.0;
                this.I(d52, d32, 12.0);
                this.IIIllI(drawContext);
                this.IIlIlI.l(d37 + d47 + 5.0, d40, 24.0, 18.0, lIllII, false, 0.82);
                this.llIIII.II(d37, d40, d47, 18.0, (click, bl) -> {
                    this.lIIl(IlIlllII.lI(illllll, list.size()), this.l);
                    return true;
                });
                this.llIIII.II(d37 + d47 + 5.0, d40, 24.0, 18.0, (click, bl) -> {
                    this.lllIIl = null;
                    return true;
                });
            }
            return this.lIII(moduleBase, illllll);
        }
        if (iIllIl instanceof IIIIllIll) {
            IIIIllIll iIIIllIll = (IIIIllIll)iIllIl;
            this.IIlIlI.lIlll(d4, d2 + 2.0, d5, 20.0, iIIIllIll.lI(), false, 0.82);
            this.llIIII.II(d4, d2, d5, 24.0, (click, bl) -> {
                iIIIllIll.IIl();
                this.IllI();
                return true;
            });
            return 27.0;
        }
        this.IIlIlI.lIIII(String.valueOf(iIllIl.lIl()), d4, d2 + 5.0, d5, -1, 0.82);
        return 27.0;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void IllllIl() {
        if (this.client == null) return;
        this.client.keyboard.setClipboard(this.IlIlIl.IlIIl(this.lIlIl.IlI()));
        this.IIllII = "Profile copied";
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean Illllll(KeyInput keyInput) {
        int n = keyInput.key();
        int n2 = keyInput.modifiers();
        if (n != 88) return false;
        if ((n2 & 0xA) != 0) return true;
        if (this.lIIlllI()) return true;
        return false;
    }

    private /* synthetic */ boolean lIIIIII(double d, double d2, double d3, double d4, double d5, double d6) {
        this.IllII.llIl = Math.max(0.0, Math.min(d, this.IllII.llIl - d6 * d2));
        this.lIIlll();
        return true;
    }

    private void lIIIIll(ModuleBase moduleBase, llIll llIll2, boolean bl) {
        llIll2.II(bl);
        this.IllI();
    }

    private /* synthetic */ boolean lIIIlII(double d, double d2, double d3, double d4) {
        this.IllII.lllI = Math.max(0.0, this.IllII.lllI - d4 * 28.0);
        this.lIIlll();
        return true;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static ModuleBase lIIIllI(lllIlIII lllIlIII2) {
        ModuleBase moduleBase;
        if (!(lllIlIII2 instanceof ModuleBase)) return null;
        ModuleBase moduleBase2 = moduleBase = (ModuleBase)((Object)lllIlIII2);
        return moduleBase2;
    }

    private static double lIIlIII(double d, double d2) {
        return d + Math.max(0.0, (d2 - 14.0) * 0.5);
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ boolean lIIlIIl(ModuleBase moduleBase, boolean bl, Click click, boolean bl2) {
        this.IllII.l(moduleBase);
        if (click.button() == 1) {
            if (!bl) return true;
            this.IllII.lIll(moduleBase);
            this.lIIlll();
            return true;
        }
        if (!moduleBase.lllllI()) return true;
        this.IIIIII(moduleBase);
        this.IllI();
        return true;
    }

    /*
     * Unable to fully structure code
     */
    private double lIIlIlI(double var1_1, double var3_2, double var5_3) {
        block22: {
            block19: {
                block16: {
                    block21: {
                        block18: {
                            block15: {
                                block17: {
                                    block20: {
                                        block14: {
                                            break block20;
lbl1:
                                            // 1 sources

                                            while (true) {
                                                ++var16_10;
                                                break block14;
                                                break;
                                            }
lbl4:
                                            // 1 sources

                                            while (true) {
                                                var25_17.run();
                                                break block15;
                                                break;
                                            }
lbl7:
                                            // 1 sources

                                            while (true) {
                                                v0 = -14013131;
                                                break block16;
                                                break;
                                            }
                                        }
lbl11:
                                        // 2 sources

                                        while (true) {
                                            if (var16_10 >= var15_9) break block17;
                                            break block18;
                                            break;
                                        }
lbl14:
                                        // 1 sources

                                        while (true) {
                                            orchard.internal.IIIlI.lllIII(true, var25_17);
                                            break block15;
                                            break;
                                        }
lbl17:
                                        // 1 sources

                                        while (true) {
                                            v1 = true;
                                            break block19;
                                            break;
                                        }
lbl20:
                                        // 1 sources

                                        while (true) {
                                            var12_7 += var10_6 + var7_4;
                                            ** continue;
                                            break;
                                        }
lbl23:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
lbl25:
                                        // 1 sources

                                        while (true) {
                                            v1 = false;
                                            break block19;
                                            break;
                                        }
lbl28:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    var7_4 = 6.0;
                                    break block21;
                                }
                                return var3_2 + 22.0;
lbl35:
                                // 1 sources

                                while (true) {
                                    var14_8 = var9_5;
                                    var15_9 = var14_8.length;
                                    var16_10 = 0;
                                    ** continue;
                                    break;
                                }
                            }
                            this.llIIII.II(var12_7, var3_2, var10_6, 22.0, (IIIIlIII)LambdaMetafactory.metafactory(null, null, null, (Lnet/minecraft/client/gui/Click;Z)Z, lIlIllI(orchard.internal.llIIIlll net.minecraft.client.gui.Click boolean ), (Lnet/minecraft/client/gui/Click;Z)Z)((lIllIIlI)this, (llIIIlll)var17_11));
                            ** while (true)
                        }
                        var17_11 = var14_8[var16_10];
                        ** while (this.llIlll != var17_11)
lbl46:
                        // 1 sources

                        ** while (true)
lbl47:
                        // 1 sources

                        while (true) {
                            continue;
                            break;
                        }
                    }
                    var9_5 = llIIIlll.values();
                    break block22;
                }
lbl53:
                // 2 sources

                while (true) {
                    var19_13 = v0;
                    ** continue;
                    break;
                }
lbl56:
                // 1 sources

                while (true) {
                    v0 = -13289408;
                    ** continue;
                    break;
                }
                var21_15 = var12_7 + (var10_6 - (double)this.IIlIlI.lIlIl(var20_14)) * 0.5;
                var23_16 = this.llllII(var3_2, 22.0);
                ** while (true)
                var25_17 = (Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, IIIIlll(orchard.internal.IIIlIIIII double double boolean ), ()V)((lIllIIlI)this, (IIIlIIIII)var20_14, (double)var21_15, (double)var23_16, (boolean)var18_12);
                ** while (!var18_12)
lbl64:
                // 1 sources

                ** while (true)
            }
            var18_12 = v1;
            ** while (!var18_12)
lbl68:
            // 1 sources

            ** while (true)
            orchard.internal.IIIlI.Illl(this.lllIll(), var12_7, var3_2, var10_6, 22.0, 6.0, var19_13);
            var20_14 = this.IIlIlI.IIIll(var17_11.II(), var10_6 - 8.0);
            ** while (true)
        }
        var10_6 = Math.max(58.0, (var5_3 - var7_4 * (double)(var9_5.length - 1)) / (double)var9_5.length);
        var12_7 = var1_1;
        ** while (true)
    }

    private void lIIlIll() {
        this.llIlII();
        this.IlIIlI = false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIllII(double d, double d2) {
        if (this.IllII.l == orchard.internal.Illl.I) {
            return true;
        }
        double d3 = 208.0;
        double d4 = 26.0;
        double d5 = this.IllII.IllI + (this.IllII.llI - d3) * 0.5;
        double d6 = this.IllII.III + this.IllII.IIl + 6.0;
        if (lIllIIlI.IlIIIll(d, d2, this.IllII.IllI, this.IllII.III, this.IllII.llI, this.IllII.IIl)) return true;
        if (lIllIIlI.IlIIIll(d, d2, d5, d6, d3, d4)) return true;
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static long lIIllIl(lllIlIII lllIlIII2) {
        block3: {
            block2: {
                block1: {
                    if (!(lllIlIII2 instanceof ModuleBase)) break block1;
                    break block2;
                }
                if (lllIlIII2 == null) return 0L;
                break block3;
            }
            ModuleBase moduleBase = (ModuleBase)((Object)lllIlIII2);
            return moduleBase.IlIIllI();
        }
        long l2 = StringFactory.I(lllIlIII2.getClass().getSimpleName());
        return l2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIIlllI() {
        if (this.llIlIl(341)) return true;
        if (this.llIlIl(345)) return true;
        if (this.llIlIl(343)) return true;
        if (this.llIlIl(347)) return true;
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIIllll(llIlIlII llIlIlII2, double d, boolean bl) {
        double d2 = IIIIlIIII.IIII((d - this.lIlIIl) / Math.max(1.0, this.llllI), 0.0, 1.0);
        Color color = (Color)llIlIlII2.lIl();
        if (!bl) {
            int n = Color.HSBtoRGB((float)d2, 0.65f, 1.0f);
            llIlIlII2.II(new Color(n >> 16 & 0xFF, n >> 8 & 0xFF, n & 0xFF, color.getAlpha()));
        } else {
            llIlIlII2.II(new Color(color.getRed(), color.getGreen(), color.getBlue(), (int)Math.round(d2 * 255.0)));
        }
        this.IllI();
    }

    private void lIlIIII(String string, double d, double d2, double d3, double d4, int n) {
        double d5 = this.llllII(d2 + d4, 24.0);
        this.IIlIlI.IllI(this.IIlIlI.lIlII(string, Math.max(0.0, d3 - 16.0)), d + 8.0, d5, n);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIlIIIl(int n, int n2, double d, double d2, double d3, double d4) {
        int n3;
        double d5 = 100.0;
        double d6 = 100.0;
        double d7 = 8.0;
        double d8 = d5 + d7 + d6;
        double d9 = 20.0;
        double d10 = d + (d3 - d8) * 0.5;
        double d11 = d2 + d4 + 6.0;
        double d12 = d10;
        boolean bl2 = this.IllII.l == orchard.internal.Illl.III;
        boolean bl3 = lIllIIlI.IlIIIll(n, n2, d12, d11, d5, d9);
        int n4 = bl2 ? -265671372 : (n3 = bl3 ? -266197716 : -333898976);
        int n5 = bl2 ? -11183258 : (bl3 ? -12236204 : -13354942);
        orchard.internal.IIIlI.lI(this.lllIll(), d12, d11, d5, d9, 6.0, Integer.MIN_VALUE, 6.0, 4, 0.45);
        orchard.internal.IIIlI.IllllI(this.lllIll(), d12, d11, d5, d9, 6.0, n5);
        orchard.internal.IIIlI.Illl(this.lllIll(), d12 + 1.0, d11 + 1.0, d5 - 2.0, d9 - 2.0, 5.0, n3);
        double d13 = 0.72;
        IIIlIIIII iIIlIIIII = StringFactory.IIII("Control Panel");
        double d14 = (double)this.IIlIlI.lIlIl(iIIlIIIII) * d13;
        double d15 = d12 + (d5 - d14) * 0.5;
        double d16 = d11 + (d9 - orchard.internal.IIIlI.IllIII(this.textRenderer) * d13) * 0.5;
        this.IIlIlI.Illll(iIIlIIIII, d15, d16, -1, d13);
        this.llIIII.II(d12 - 2.0, d11 - 2.0, d5 + 4.0, d9 + 4.0, (click, bl) -> {
            this.IlIIlIl();
            this.IllII.l = orchard.internal.Illl.III;
            this.IlIIlI = false;
            this.lllIIl = null;
            this.lIIlll();
            return true;
        });
        double d17 = d10 + d5 + d7;
        boolean bl4 = lIllIIlI.IlIIIll(n, n2, d17, d11, d6, d9);
        int n6 = !bl4 ? 1894128154 : -1325456862;
        int n7 = bl4 ? -48060 : -3399134;
        int n8 = !bl4 ? -4645860 : -2349530;
        orchard.internal.IIIlI.lI(this.lllIll(), d17, d11, d6, d9, 6.0, n6, 8.0, 4, 0.65);
        orchard.internal.IIIlI.IllllI(this.lllIll(), d17, d11, d6, d9, 6.0, n7);
        orchard.internal.IIIlI.Illl(this.lllIll(), d17 + 1.0, d11 + 1.0, d6 - 2.0, d9 - 2.0, 5.0, n8);
        IIIlIIIII iIIlIIIII2 = StringFactory.IIII("Unload Orchard");
        double d18 = 0.74;
        double d19 = (double)this.IIlIlI.lIlIl(iIIlIIIII2) * d18;
        double d20 = d17 + (d6 - d19) * 0.5;
        double d21 = d11 + (d9 - orchard.internal.IIIlI.IllIII(this.textRenderer) * d18) * 0.5;
        this.IIlIlI.Illll(iIIlIIIII2, d20, d21, -1, d18);
        this.llIIII.II(d17, d11, d6, d9, (click, bl) -> {
            this.IIlll(iIIlIIIII2, StringFactory.IIII("rZpYkxhTEDOFC5dYHdeen5aQFJgQRFEemw3fXBnWzIfYlVeIEEFVXJoHm0wD1oE=").IIII(), () -> {
                this.lIlIl.IlI().IIIlIll().IIlIIll(true);
                MinecraftClient minecraftClient = MinecraftClient.getInstance();
                lllIIlI lllIIlI2 = this.lIlIl != null ? this.lIlIl.IlI() : null;
                IlllIllI.l(minecraftClient, lllIIlI2);
            });
            return true;
        });
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlIIlI() {
        if (this.llII) return false;
        if (this.llIll != null) return false;
        if (this.llIlI != null) return false;
        IIllIIIll iIllIIIll = this.lIlIl.IlIl().IIl();
        if (iIllIIIll == null) return false;
        if (!iIllIIIll.Il()) return false;
        if (iIllIIIll.l() == null) return false;
        if (iIllIIIll.ll() != null) return true;
        return false;
    }

    private double lIlIIll() {
        return Math.min(370.0, Math.max(220.0, (double)this.IlIIl.I() - 30.0));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private double lIlIlII(ModuleBase moduleBase) {
        double d = 39.0;
        if (!this.IIIIIll(moduleBase)) {
            return d;
        }
        d += this.IlIII(moduleBase) * this.Il(moduleBase, this.IllII.II(moduleBase), true);
        return d;
    }

    private /* synthetic */ boolean lIlIllI(llIIIlll llIIIlll2, Click click, boolean bl) {
        this.llIlll = llIIIlll2;
        this.IIIIlI(this.IllII.IlII);
        this.lIIlll();
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lIlIlll(String string) {
        if (string == null) {
            return false;
        }
        String string2 = string.trim();
        if (string2.startsWith("https://")) return true;
        if (string2.startsWith("http://")) return true;
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lIllIII(DrawContext drawContext, double d5, double d6, double d7, double d8) {
        double d9;
        double d10;
        double d11;
        String string;
        double d12 = Math.max(90.0, Math.min(d7, 180.0));
        double d13 = 22.0;
        double d14 = d6 + 5.0;
        boolean bl2 = this.lllIIl != null && this.lllIIl.I;
        String string2 = string = bl2 ? this.l : this.lIlIlI;
        if (bl2) {
            int n = -12960442;
            int n2 = -12170926;
            d11 = Math.min(4.5, d13 * 0.5);
            orchard.internal.IIIlI.Illl(this.lllIll(), d5, d14, d12, d13, d11, n2);
            orchard.internal.IIIlI.Illl(this.lllIll(), d5 + 1.0, d14 + 1.0, d12 - 2.0, d13 - 2.0, Math.max(1.0, d11 - 1.0), n);
            d10 = 6.0;
            d9 = Math.max(10.0, d12 - d10 * 2.0);
            String string3 = string == null || string.isBlank() ? "Empty" : string;
            double d15 = this.IIlIlI.IIlI(string3);
            double d16 = Math.max(0.0, d15 - d9);
            double d17 = d5 + d10 - d16;
            double d18 = d14 + (d13 - orchard.internal.IIIlI.IllIII(this.textRenderer)) * 0.5;
            orchard.internal.IIIlI.llII(this.lllIll(), d5 + 3.0, d14 + 1.0, d5 + d12 - 3.0, d14 + d13 - 1.0);
            try {
                if (this.ll && !string3.isEmpty()) {
                    int n3 = IlIIIIll.III().getRGB();
                    orchard.internal.IIIlI.Illl(this.lllIll(), d17 - 1.0, d18 - 1.0, d15 + 2.0, orchard.internal.IIIlI.IllIII(this.textRenderer) + 2.0, 2.0, n3 & 0xFFFFFF | Integer.MIN_VALUE);
                }
                this.IIlIlI.IllI(string3, d17, d18, -1);
            }
            finally {
                orchard.internal.IIIlI.lIllll(this.lllIll());
            }
            double d19 = Math.min(d5 + d12 - 5.0, d17 + d15);
            double d20 = d14 + (d13 - 12.0) * 0.5;
            this.I(d19, d20, 12.0);
            this.IIIllI(drawContext);
        } else {
            this.IIlIlI.IllII(d5, d14, d12, d13, string == null || string.isBlank() ? "Empty" : string, false);
        }
        this.llIIII.II(d5, d14, d12, d13, (click, bl) -> {
            this.lIIl(IlIlllII.ll(), this.lIlIlI);
            return true;
        });
        double d21 = d5 + d12 + 8.0;
        d11 = d6 + 5.0;
        d10 = 6.0;
        d9 = d5 + d7 - d21;
        double d22 = (d9 - d10 * 2.0) / 3.0;
        String string4 = "Create";
        String string5 = "Save";
        String string6 = "Folder";
        Runnable runnable = this::IIllI;
        string6 = "Upload";
        runnable = this::IlIllll;
        double d23 = (double)Math.max(this.IIlIlI.IIlI(string4), Math.max(this.IIlIlI.IIlI(string5), this.IIlIlI.IIlI(string6))) + 20.0;
        if (d22 >= d23) {
            this.IlllII(d21, d11, d22, string4, () -> this.IIIll(false));
            this.IlllII(d21 += d22 + d10, d11, d22, string5, () -> this.IIIll(true));
            this.IlllII(d21 += d22 + d10, d11, d22, string6, runnable);
            this.IIIll = d11;
        } else {
            d21 = this.lII(d21, d11, d5, d7, string4, () -> this.IIIll(false)).I();
            d11 = this.IIIll;
            d21 = this.lII(d21, d11, d5, d7, string5, () -> this.IIIll(true)).I();
            d11 = this.IIIll;
            this.lII(d21, d11, d5, d7, string6, runnable);
        }
        double d24 = this.IIIll + 30.0;
        double d25 = this.IIIIIl(2L, this.IllII.lI);
        double d26 = d24 + 4.0 - d25;
        this.llIIII.Il(d5, d24, d7, d8 - (d24 - d6), null, (d, d2, d3, d4) -> {
            this.IllII.lI = Math.max(0.0, this.IllII.lI - d4 * 28.0);
            this.lIIlll();
            return true;
        });
        orchard.internal.IIIlI.llII(this.lllIll(), d5, d24, d5 + d7, d6 + d8);
        List<String> list = this.IlIlIl.ll();
        if (list.isEmpty()) {
            this.IIlIlI.IlllI("No saved profiles yet", d5 + d7 * 0.5, d6 + d8 * 0.48, this.IIlIlI.II(), d7 - 20.0);
        }
        for (String string7 : list) {
            this.IIlIlI.lI(d5, d26, d7, false, false);
            this.IIlIlI.IlllI(string7, d5 + Math.max(0.0, d7 - 170.0) * 0.5, this.llllII(d26, 23.0), this.IIlIlI.llIII(), Math.max(20.0, d7 - 175.0));
            this.IIlIlI.IllII(d5 + d7 - 156.0, d26 + 4.0, 48.0, 16.0, "Load", false);
            this.IIlIlI.IllII(d5 + d7 - 104.0, d26 + 4.0, 50.0, 16.0, "Export", false);
            this.IIlIlI.IllII(d5 + d7 - 50.0, d26 + 4.0, 48.0, 16.0, "Delete", false);
            double d27 = d26;
            this.llIIII.II(d5, d27, d7 - 162.0, 23.0, (click, bl) -> {
                this.lIlIlI = string7;
                this.lllIIl = null;
                return true;
            });
            this.llIIII.II(d5 + d7 - 156.0, d27 + 3.0, 48.0, 18.0, (click, bl) -> {
                String string2;
                boolean bl2 = this.IlIlIl.I(string7, this.lIlIl.IlI());
                if (bl2) {
                    String string3 = string7;
                    String string4 = "Loaded ";
                    string2 = string4 + string3;
                } else {
                    string2 = "Load failed";
                }
                this.IIllII = string2;
                if (!bl2) return true;
                this.lIlIl.I();
                return true;
            });
            this.llIIII.II(d5 + d7 - 104.0, d27 + 3.0, 50.0, 18.0, (click, bl) -> {
                String string2;
                boolean bl2 = this.IlIlIl.llll(string7);
                if (!bl2) {
                    string2 = "Export failed";
                } else {
                    String string3 = string7;
                    String string4 = "Exported ";
                    string2 = string4 + string3;
                }
                this.IIllII = string2;
                return true;
            });
            this.llIIII.II(d5 + d7 - 50.0, d27 + 3.0, 48.0, 18.0, (click, bl) -> {
                String string2;
                block2: {
                    block1: {
                        boolean bl2 = this.IlIlIl.lll(string7);
                        if (bl2) break block1;
                        string2 = "Delete failed";
                        break block2;
                    }
                    String string3 = string7;
                    String string4 = "Deleted ";
                    string2 = string4 + string3;
                }
                this.IIllII = string2;
                return true;
            });
            d26 += 29.0;
        }
        orchard.internal.IIIlI.lIllll(this.lllIll());
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean mouseClicked(Click click, boolean bl) {
        if (this.IlIlI) {
            return true;
        }
        this.IIIIIIl();
        Click click2 = this.IIIIlIl(click);
        if (this.llIll != null) {
            if (!this.IIlllI) {
                this.llIll.IlI(lIIllllI.lllII(click2.button()));
                this.llIll = null;
                this.IllI();
                return true;
            }
            this.IIlllI = false;
            return true;
        }
        if (this.llIlI != null) {
            this.IIIIl(click2);
            return true;
        }
        if (this.IlII) {
            this.IllIll(click2);
            return true;
        }
        if (this.lIlIIlI()) {
            this.llIIIIl(click2);
            return true;
        }
        Click click3 = this.llIIlII(click2);
        if (!this.IlIllI(click3.x(), click3.y())) {
            this.IlIIlI = false;
        }
        if (!this.lIIllII(click3.x(), click3.y())) {
            this.lIIlIll();
            return true;
        }
        if (this.lllIIl != null) {
            this.llIlII();
        }
        if (this.llIIII.III(click3, bl)) {
            return true;
        }
        this.lIIlIll();
        return true;
    }

    private long lIllIlI(Category category) {
        return 256L + (category == null ? 0L : (long)category.ordinal() + 1L);
    }

    private void lIllIll(IIIlIlll iIIlIlll) {
        if (iIIlIlll == null) {
            return;
        }
        String string = this.IlllIIl(iIIlIlll);
        if (string.isBlank()) {
            return;
        }
        try {
            Util.getOperatingSystem().open(string);
        }
        catch (RuntimeException runtimeException) {
            // empty catch block
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean lIlllII(ModuleBase moduleBase) {
        if (moduleBase == null) return false;
        if (!moduleBase.IIIlIIl()) return false;
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void lIlllll(double d, double d2, double d3) {
        double d4 = 24.0;
        double d5 = 7.0;
        double d6 = d2 + 52.0 - 6.0 + (double)(lIl.length + 1) * 28.0 + d4;
        double d7 = d6 + 20.0;
        for (Illl illl : lIIIlI) {
            int n;
            int n2;
            double d8;
            boolean bl2 = this.IllII.l == illl;
            double d9 = this.IIl.getOrDefault((Object)illl, 0.0);
            double d10 = bl2 ? 2.0 : 0.0;
            double d11 = this.lllI(d9, d10, 18.0);
            this.IIl.put(illl, d11);
            double d12 = d + 18.0 + d11;
            double d13 = d7 - 6.0;
            double d14 = 92.0;
            double d15 = 0.85;
            double d16 = orchard.internal.IIIlI.IllIII(this.textRenderer);
            double d17 = d13 + (d4 - d16 * d15) * 0.5;
            IIIlIIIII iIIlIIIII = illl == orchard.internal.Illl.I ? StringFactory.IIII("Editor") : illl.l();
            double d18 = lIllIIlI.lIIlIII(d13, d4);
            double d19 = d12 + 20.0;
            double d20 = d8 = d10 <= 0.0 ? 0.0 : d11 / d10;
            if (d8 > 0.01) {
                n2 = this.IlIlIl(this.IIlIlI.IIlIIl(), d + 10.0, d13, 0);
                n = (int)(d8 * 150.0);
                int n3 = n2 & 0xFFFFFF | n << 24;
                orchard.internal.IIIlI.Illl(this.lllIll(), d + 10.0, d13, d14, d4, 6.0, n3);
            }
            n2 = -1;
            n = -1;
            orchard.internal.IIIlI.lIlIIl(this.lllIll());
            try {
                orchard.internal.IIIlI.Ill(this.lllIll(), d19, d17);
                orchard.internal.IIIlI.IIlll(this.lllIll(), d15, d15);
                this.IIlIlI.Illl(iIIlIIIII, 0.0, 0.0, n2);
            }
            finally {
                orchard.internal.IIIlI.IlIllI(this.lllIll());
            }
            this.IIlIlI.IIlIII(illl, d12, d18, n);
            this.llIIII.II(d + 18.0 - 8.0, d13, d14, d4, (click, bl) -> {
                this.IlIIlIl();
                this.IllII.l = illl;
                this.IlIIlI = false;
                this.lllIIl = null;
                this.lIIlll();
                return true;
            });
            d7 += d4 + d5;
        }
    }

    /*
     * Unable to fully structure code
     */
    private List<ModuleBase> llIIIII(List<ModuleBase> var1_1) {
        block15: {
            block13: {
                block9: {
                    block16: {
                        block14: {
                            block11: {
                                block12: {
                                    block10: {
                                        if (this.llIlll == llIIIlll.II) break block12;
                                        break block14;
                                        return var2_2;
lbl5:
                                        // 2 sources

                                        while (true) {
                                            if (this.llIlll != llIIIlll.l) break block9;
                                            break block10;
                                            break;
                                        }
lbl8:
                                        // 1 sources

                                        while (true) {
                                            if (!var1_1.isEmpty()) break block11;
                                            break block12;
                                            break;
                                        }
lbl11:
                                        // 1 sources

                                        while (true) {
                                            continue;
                                            break;
                                        }
                                    }
                                    if (var5_5) break block9;
                                    break block15;
lbl16:
                                    // 1 sources

                                    while (true) {
                                        var2_2 = new ArrayList<ModuleBase>();
                                        var3_3 = var1_1.iterator();
                                        break block9;
                                        break;
                                    }
lbl20:
                                    // 2 sources

                                    return var1_1;
                                }
lbl23:
                                // 2 sources

                                return var1_1;
lbl25:
                                // 1 sources

                                while (!var5_5) {
                                    ** GOTO lbl5
                                }
                                break block15;
                            }
                            if (this.IllII.IlII == Category.l) ** GOTO lbl20
                            break block16;
                        }
                        ** while (var1_1 == null)
lbl33:
                        // 1 sources

                        ** while (true)
                    }
                    ** while (this.IllII.IlII != Category.I)
lbl36:
                    // 1 sources

                    ** while (true)
                }
lbl38:
                // 2 sources

                while (true) {
                    if (!var3_3.hasNext()) ** continue;
                    break block13;
                    break;
                }
                var5_5 = this.IIlIIl(var4_4);
                if (this.llIlll == llIIIlll.lI) ** break;
                ** while (true)
                ** GOTO lbl25
            }
            var4_4 = var3_3.next();
            ** while (true)
        }
        var2_2.add(var4_4);
        ** while (true)
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean llIIIIl(Click click) {
        if (!this.lIlIIlI()) {
            return false;
        }
        IIllIIIll iIllIIIll = this.lIlIl.IlIl().IIl();
        double d = this.lIlIII();
        double d2 = 112.0;
        double d3 = ((double)this.IlIIl.I() - d) * 0.5;
        double d4 = ((double)this.IlIIl.ll() - d2) * 0.5;
        double d5 = d4 + d2 - 28.0;
        double d6 = d3 + d * 0.5 - 92.0;
        double d7 = d3 + d * 0.5 + 8.0;
        if (lIllIIlI.IlIIIll(click.x(), click.y(), d6, d5, 84.0, 20.0)) {
            this.llII = true;
            return true;
        }
        if (!lIllIIlI.IlIIIll(click.x(), click.y(), d7, d5, 84.0, 20.0)) return true;
        this.lIllIll(iIllIIIll.ll());
        this.llII = true;
        return true;
    }

    private /* synthetic */ void llIIIll(ModuleBase moduleBase) {
        this.lIIIll(IlIlIIlIl.l(moduleBase));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private Click llIIlII(Click click) {
        if (this.IllII.l != orchard.internal.Illl.I) return new Click(this.IllIl(click.x()), this.Illlll(click.y()), click.buttonInfo());
        return click;
    }

    private static int llIIlll(int n, int n2) {
        return lllIlI[n ^ 0x9DB78DBD] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String llIlIII(char c, short s, int n) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xB377;
        char[] cArray = lllIll[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])llllII[n2];
        if (stackTraceElementArray2 == null) {
            stackTraceElementArray = new Throwable().getStackTrace();
            lIllIIlI.llllII[n2] = stackTraceElementArray;
        } else {
            stackTraceElementArray = stackTraceElementArray2;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x7759;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] + 14772;
            n6 ^= 0x4315;
            n6 ^= 0xF3A3;
            n6 ^= 0x3E0D;
            n6 ^= 0x3DE4;
            n6 -= 21517;
            cArray[n5] = (char)((n6 ^= 0x4B83) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

