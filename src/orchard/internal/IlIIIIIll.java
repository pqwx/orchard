/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IlIIIIIll
 * Purpose not identified - name is the original obfuscated one.
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
 *  net.minecraft.text.MutableText
 *  net.minecraft.text.Style
 *  net.minecraft.text.Text
 *  net.minecraft.text.TextColor
 *  net.minecraft.util.Formatting
 */
package orchard.internal;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Formatting;

@Environment(value=EnvType.CLIENT)
public final class IlIIIIIll {
    private static final int[] I;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Style I(Style style, Formatting formatting) {
        Style style2;
        switch (formatting) {
            case BOLD: {
                style2 = style.withBold(Boolean.valueOf(true));
                return style2;
            }
            default: {
                style2 = style;
                return style2;
            }
            case OBFUSCATED: {
                style2 = style.withObfuscated(Boolean.valueOf(true));
                return style2;
            }
            case STRIKETHROUGH: {
                style2 = style.withStrikethrough(Boolean.valueOf(true));
                return style2;
            }
            case ITALIC: {
                style2 = style.withItalic(Boolean.valueOf(true));
                return style2;
            }
            case UNDERLINE: 
        }
        style2 = style.withUnderline(Boolean.valueOf(true));
        return style2;
    }

    private IlIIIIIll() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Formatting l(char c) {
        Formatting formatting;
        c = Character.toLowerCase(c);
        switch (c) {
            case '2': {
                formatting = Formatting.DARK_GREEN;
                return formatting;
            }
            case 'e': {
                formatting = Formatting.YELLOW;
                return formatting;
            }
            case '7': {
                formatting = Formatting.GRAY;
                return formatting;
            }
            case 'k': {
                formatting = Formatting.OBFUSCATED;
                return formatting;
            }
            case 'm': {
                formatting = Formatting.STRIKETHROUGH;
                return formatting;
            }
            default: {
                return null;
            }
            case '6': {
                formatting = Formatting.GOLD;
                return formatting;
            }
            case 'o': {
                formatting = Formatting.ITALIC;
                return formatting;
            }
            case 'b': {
                formatting = Formatting.AQUA;
                return formatting;
            }
            case '8': {
                formatting = Formatting.DARK_GRAY;
                return formatting;
            }
            case '4': {
                formatting = Formatting.DARK_RED;
                return formatting;
            }
            case '0': {
                formatting = Formatting.BLACK;
                return formatting;
            }
            case 'a': {
                formatting = Formatting.GREEN;
                return formatting;
            }
            case 'd': {
                formatting = Formatting.LIGHT_PURPLE;
                return formatting;
            }
            case 'n': {
                formatting = Formatting.UNDERLINE;
                return formatting;
            }
            case '1': {
                formatting = Formatting.DARK_BLUE;
                return formatting;
            }
            case '5': {
                formatting = Formatting.DARK_PURPLE;
                return formatting;
            }
            case '9': {
                formatting = Formatting.BLUE;
                return formatting;
            }
            case 'f': {
                formatting = Formatting.WHITE;
                return formatting;
            }
            case 'r': {
                formatting = Formatting.RESET;
                return formatting;
            }
            case '3': {
                formatting = Formatting.DARK_AQUA;
                return formatting;
            }
            case 'l': {
                formatting = Formatting.BOLD;
                return formatting;
            }
            case 'c': 
        }
        formatting = Formatting.RED;
        return formatting;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    public static Text II(String string) {
        MutableText mutableText = Text.empty();
        StringBuilder stringBuilder = new StringBuilder();
        Style style = Style.EMPTY;
        int n = 0;
        boolean bl = true;
        block0: while (true) {
            String string2;
            if (!bl || (bl = false) || !true) {
                int n2 = Integer.parseInt(string2, 16);
                style = style.withColor(TextColor.fromRgb((int)n2));
                n += 8;
            }
            while (true) {
                block9: {
                    char c;
                    block10: {
                        char c2;
                        if (n >= string.length()) {
                            if (stringBuilder.isEmpty()) return mutableText;
                            mutableText.append((Text)Text.literal((String)stringBuilder.toString()).setStyle(style));
                            return mutableText;
                        }
                        c = string.charAt(n);
                        if (c != '&' || n + 1 >= string.length()) break block10;
                        if (!stringBuilder.isEmpty()) {
                            mutableText.append((Text)Text.literal((String)stringBuilder.toString()).setStyle(style));
                            stringBuilder.setLength(0);
                        }
                        if ((c2 = string.charAt(n + 1)) == '#' && n + 7 < string.length() && IlIIIIIll.Il(string2 = string.substring(n + 2, n + 8))) continue block0;
                        Formatting formatting = IlIIIIIll.l(c2);
                        if (formatting == null) break block10;
                        if (formatting != Formatting.RESET) {
                            if (formatting.isColor()) {
                                style = style.withColor(TextColor.fromFormatting((Formatting)formatting));
                                style = style.withBold(Boolean.valueOf(false)).withItalic(Boolean.valueOf(false)).withUnderline(Boolean.valueOf(false)).withStrikethrough(Boolean.valueOf(false)).withObfuscated(Boolean.valueOf(false));
                                break block9;
                            } else {
                                style = IlIIIIIll.I(style, formatting);
                            }
                            break block9;
                        } else {
                            style = Style.EMPTY;
                        }
                        break block9;
                    }
                    stringBuilder.append(c);
                    ++n;
                    continue;
                }
                n += 2;
            }
            break;
        }
    }

    /*
     * Unable to fully structure code
     */
    private static boolean Il(String var0) {
        block16: {
            block15: {
                block12: {
                    block9: {
                        block11: {
                            block10: {
                                block8: {
                                    block13: {
                                        block14: {
                                            if (var0.length() == 6) break block13;
                                            break block14;
lbl3:
                                            // 2 sources

                                            while (true) {
                                                if (var2_2 < 'A') break block8;
                                                break block9;
                                                break;
                                            }
lbl6:
                                            // 1 sources

                                            while (true) {
                                                var2_2 = var0.charAt(var1_1);
                                                if (var2_2 < '0') break block10;
                                                break block11;
lbl10:
                                                // 1 sources

                                                while (var2_2 > 'f') {
                                                    ** GOTO lbl3
                                                }
                                                break block12;
                                                break;
                                            }
                                        }
                                        return false;
lbl15:
                                        // 2 sources

                                        while (!(var3_3 = v0)) {
                                            return false;
                                        }
                                        break block15;
                                    }
                                    var1_1 = 0;
                                    break block16;
                                }
lbl22:
                                // 2 sources

                                while (true) {
                                    v0 = false;
                                    ** GOTO lbl15
                                    break;
                                }
                            }
lbl26:
                            // 2 sources

                            while (true) {
                                if (var2_2 >= 'a') ** break;
                                ** continue;
                                ** GOTO lbl10
                                break;
                            }
                        }
                        if (var2_2 > '9') {
                            ** continue;
                        }
                        break block12;
                    }
                    ** while (var2_2 > 'F')
lbl36:
                    // 1 sources

                    break block12;
lbl37:
                    // 1 sources

                    return true;
                }
                v0 = true;
                ** GOTO lbl15
            }
            ++var1_1;
        }
        ** while (var1_1 >= 6)
lbl46:
        // 1 sources

        ** while (true)
    }

    private static int lI(int n, int n2) {
        return I[n ^ 0xBE32FDCF] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 751218383;
        byte[] byArray = "\u00db\u00f2\u00c3|\u00ec(\u009b\u0001\u00e1\u00b6\u00c4c\u00f7\u0091V\u009eOJ6\u0092\u00f2\u00a5\u00fb\u008d8\u0099\u001d\u00f8=\u00ce;\u00d6\u00b9\u00a2\u00e1\u00cd\u00c4\u008f\u0083-\u0010\u00a2\u00ca\u00ce\u001bGt\nm\u00f0\u00bf\u008b".getBytes("ISO-8859-1");
        int n2 = byArray.length / 4;
        I = new int[n2];
        int n3 = 0;
        int n4 = 0;
        do {
            int n5 = (byArray[n3] & 0xFF) << 24 | (byArray[n3 + 1] & 0xFF) << 16 | (byArray[n3 + 2] & 0xFF) << 8 | byArray[n3 + 3] & 0xFF;
            IlIIIIIll.I[n4] = n5 ^= n;
            n3 += 4;
        } while (++n4 < n2);
    }
}

