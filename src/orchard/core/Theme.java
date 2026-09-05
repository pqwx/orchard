/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.lllIllI
 * Identified from direct evidence; see README.md
 *
 * Recovered strings in this class:
 *   - Rose Pine
 *   - .getBytes(
 *   - Tangerine
 *   - Sapphire
 *   - Emerald
 *   - Magenta
 *   - Dracula
 *   - Custom
 *
 * Method and field names remain obfuscated (not recoverable).
 */
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package orchard.core;

import java.awt.Color;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import orchard.core.StringFactory;
import orchard.internal.IIIlIIIII;
import orchard.internal.lIIlll;

@Environment(value=EnvType.CLIENT)
public final class Theme
extends Enum<Theme>
implements lIIlll {
    public static final /* enum */ Theme I;
    public static final /* enum */ Theme l;
    public static final /* enum */ Theme II;
    public static final /* enum */ Theme Il;
    public static final /* enum */ Theme lI;
    public static final /* enum */ Theme ll;
    public static final /* enum */ Theme III;
    public static final /* enum */ Theme IIl;
    public static final /* enum */ Theme IlI;
    private final Color Ill;
    public static final /* enum */ Theme lII;
    public static final /* enum */ Theme lIl;
    public static final /* enum */ Theme llI;
    private final Color lll;
    public static final /* enum */ Theme IIII;
    public static final /* enum */ Theme IIIl;
    public static final /* enum */ Theme IIlI;
    public static final /* enum */ Theme IIll;
    private final IIIlIIIII IlII;
    private final Color IlIl;
    private static final /* synthetic */ Theme[] IllI;
    public static final /* enum */ Theme Illl;
    private final Color lIII;
    public static final /* enum */ Theme lIIl;
    public static final /* enum */ Theme lIlI;
    public static final /* enum */ Theme lIll;
    public static final /* enum */ Theme llII;
    private static String[] llIl;
    private final Color lllI;
    private final Color llll;
    public static final /* enum */ Theme IIIII;
    public static final /* enum */ Theme IIIIl;
    public static final /* enum */ Theme IIIlI;
    public static final /* enum */ Theme IIIll;
    private final Color IIlII;
    public static final /* enum */ Theme IIlIl;
    private final Color IIllI;
    public static final /* enum */ Theme IIlll;
    public static final /* enum */ Theme IlIII;
    public static final /* enum */ Theme IlIIl;
    private static final int[] IlIlI;
    private static final String[] IlIll;
    private static final Object[] IllII;

    public Color II() {
        return this.IIllI;
    }

    public Color Il() {
        return this.llll;
    }

    public static Theme[] values() {
        return (Theme[])IllI.clone();
    }

    public String toString() {
        return this.IlII.IIII();
    }

    public Color lI() {
        return this.IlIl;
    }

    public Color ll() {
        return this.lIII;
    }

    public static Theme III(String string) {
        return Enum.valueOf(Theme.class, string);
    }

    public Color IIl() {
        return this.Ill;
    }

    public Color IlI() {
        return this.lll;
    }

    public Color Ill() {
        return this.IIlII;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 21381;
        String string = "\uaa5c\ubf2a\u8ab3\uee20\u9af3\u5599\ud941\uf374\ue289\u56d4\u08e3\u53e2\u4dff\u5e70\ue2e4\u8112\u3e9f\udaba\u1c6b\u5baf\u4eac\u6854\u250f\u0533\u16a9\uf8cd\u93f7\u39c0\ud64d\u8612\ufdf3\u8953\ucd70\ue91e\u568f\uf05a\u4393\u0090\u4319\ua747\uaa6e\ue346\u554c\ua2eb\u8fab\u479d\u84ea\ua457\uc505\u3dda\u7d99\u78f7\u3bdb\uddd6\u73e3\u5a76\u55f8\u49de\u51af\udb0f\u3f38\u529c\udf1c\u3d87\u2585\u62b6\u24c7\u820d\u280a\u8fa6\u2539\ufb1f\u79f0\u2358\ud74f\u04bf\u9487\ub2be\u6940\ud908\u191e\ufbc7\u472a\ub9b3\u3730\u9579\u58df\ue4b2\u10f7\u7d3f\uc2ee\u5607\u8617\u6710\u5200\u812f\u25fc\u9de4\u0a9f\u70db\u7ae8\u59eb\u0097\uc0f2\ua14b\ud36f\u8135\ufde2\uece3\ud19f\ub355\u2d73\u3267\u05c3\u3a2b\ub96d\ud2b2\u7ff7\u3bb6\u3694\uffcb\uc560\ub07d\u7f94\u1f66\u8dd7\ub0bd\u9fee\uf46f\u4474\u5f88\uae9e\u47f5\u5c71\u95a7\u68fa\u415d\uf8e9\u39e9\u378e\uec26\u8f3d\uef3d\u5a7d\u7946\u0d2e\ucc5b\uc48f\ub979\u6687\u3adc\u0d4d\u8fdf\u5ec7\udb21\u4869\ub830\ub718\u0e9d\ud5ba\u7dc6\u951e\u78a7\ua66f\u6b26\uc495\u9a30\u05a8\u7564\u3eb5\ua343\u4e09\u8371\u4702\u5e07\ua94a\u3b5e\u123b\u189c\u65f3\u2d37\uaf9d\uc06c\ud824\u3b05\uf471\u33ab\u8f62\u597c\u6408\u8c3f\u1e3e\ucf48\ue598\u9a09\u50ff\u41be\u48e4\ude6d\u1a9d\ud581\ueb15\u4821\u45fd\u99a8\u828d\u0595\ud78a\u3697\ue08e\u48cc\u3bb7\u901d\u20cb\u6878\ubc15\u67c0\u9860\u2550\u41d5\u2067\u8519\u74d2\u19cb\u0c0c\u084d\u7d59\ued1c\udfe4\uac64\ua157\u2f38\ubac8\uc51fm\u3146\u1a9a\u2359\ua03f\u4454\ubedb\u0c30\u1fb8\u8f53\udb3b\u8675\ua3fa\u41d8\uc5c5\u1c04\u70a3\u2a31\uaafd\ue0ef\u27fd\ua202\ub133\ub899\uc027\u164e\u4c0f\ufb54\u3013\uf991\u0780\u0a15\u213f\ubc52\u85ab\u26f0\u7440\u7bdd\uca67\u6117\u366c\u8b5a\udf7c\uce31\u644e\u9a99\u0388\ud708\u7c1f\u0dcf\ufc9d\u3a8c\u07ea\uf2b7\u0ed3\u214a\u79d2\ub624\u7151\uad2f\u86fb\u94c0\ufe60\uef9f\u89ce\u3bb9\u4c8e\ub3f7\ude7c\uae27\u700e\u63f4\uf44a\u3742\ucbe8\uf777\ueab9\u2d25\ub195\u2034\uea94\uaef5\u03f9\u79f4\u4e94\ucec6\u338d\ud45a\u5654\u424e\ue0ad\ue58a\ub80e\u153a\u8837\uae2a\ud2e4\u12ee\u23f2\ud48e\u14b0\u276b\ud963\u2001\ud69b\u398e\ued84\u6b2f\uf01e\ud4fe\u4663\ufc03\ud577\u022d\u48a8\ud644\uabc9\ub49b\u830a\u7d39\ue63b\u2e83\u53b4\ud3f9\ucf38\u3cba\uf279\ue091\uf0a7\u1b0e\u9b17\u2c68\ua8c5\uad0a\u4ebf\u27e8\ueb62\ufb3d\u2612\u4f15\u6919\udc71\ue3c2\ub3e1\u371e\ufde2\uce70\u6cf1\u043b\u6cb3\ub05f\u6f82\u3b52\uf834\u0a33\u7edb\uf823\uc339\ua055\u20b9\u6d11\ud5e2\u75a6\ubceb\u860f\u72d6\u8d16\uae85\u1818\u6d9e\u2e1a\uecb5\u233a\u2d41\u8d40\uc993\ufd2f\ub2c6";
        char[] cArray = "\u538d\u5382\u5382\u538d\u5383\u538d\u5383\u5389\u5380\u5389\u538d\u5381\u538c\u5389\u538d\u538d\u538d\u5381\u538d\u5380\u5380\u538d\u5380\u538d\u5380\u5382\u538d\u5381\u5383\u5380\u538d\u5381\u5381\u5380\u5383\u538d\u5381\u5383\u5380\u538d\u538d\u5389\u5383\u5389\u5386\u538d\u538d\u538d\u538d\u538d\u538c\u5389\u5381\u538d\u538d\u5383\u5381\u538d".toCharArray();
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
        IlIll = stringArray;
        IllII = new Object[stringArray.length];
        int n6 = 1074196130;
        byte[] byArray = "\u00f0\u00a5\u00d7b]\u001d)\u0082\u009b\u009bec\u00d1\u0001]P\u001b?\n,\u00cfoq\u00eb\u00d7\u00a7\u00be\u00be2\u0080\u00a8\u001bw[a\u00e8e\u00b3\u00aa\u00e1\u00eb\u00c3\u0003\u00df\u00a9\u0002y\u00a5\u00f9\u00e9\u00ea\u000ep TN\u0091\u00b0\u00b0\u00a3o\u00e4Qr*\u00e3\u008f\ro\b/\u00e8n\u0098\u001cS\u001fQ\u0017\u00f5F\u00c8[!H\u00bc\u001c\u00b8\u00adc\u0091\u00c5\u0090z\u0095_\nU\u009fo\u00cc\u00bcu\u0011\u0016\u00bbR\u0007\u00db*\u00c5\u00bfS\u00af\u00c9\u00c8\u00df\u008eliA/vWX\u0095T]\u00d4\r\t\u008fb\u008a\"\u0082]\u00f1d\u00e2\u00e51Kn\u00b3\u0088\u0014\u00b4\u00c2\u00b0\u00be\u0096j\u001b\u0015\u00f1U\u00a4z\u000b\u00d5\u00e8\u0003\u00cfx\u00a8\u00c4\u001b\u00ec\u00b3\u00f66?\u00ee\u00b4\u00fe\u0080\u0001\u008f\u0091\u00b1\u009e\u00f7q\u00c2\u00cc\"9ojYluP\u00a3\u00bfo\u00aa\u0080\u001f\u009d\u00b0\u00bfa\u00bf\u00b0V\u0010\u00bc\u00f9\u00db\u00a8\u00d3\u00efF\u0093^\u0007\u0094\u00e8\u00e6\u009f#\u0097\u00da\u00ed\u0094\u00b3\u0003\u00be\u0098'\u00b9~\u00b3<\u00af\u0096\u009d\u0094\u00fe\u00c0\u00d9\u00fd\u00be\n\u00cb)q\u00c3\u0084o\u0003G\u00ea\u00b6S\u0018\u00f5\u00ed\u0083\u0013k\u00d2\u0004\u008d\u001a\u00b8 \u00a5jB\u00bfW\u0096g\u009d\u0018\u00fe\\S\u00bd\u00bfW\u0005\u00a5\u00f47\u00a2r?\u0005\u008c\u008a*z\u00ea\u00b2\u00e6W1<\u00cd\u009eQ\u00c0\u00bb\u00ad\u00ed\u00c7|%\u0082\u00e6\u00cc\bE|<\"\u0091\u00e6\u0007;\u009b\u0097\u00ef\u00ech\u00f5\u0098\u00db\u0014(1C\u0017^o=\u00f9I\"xh4\u00a3\u00b9Cd+!R\u001f\u00ab\u0013J\u0006\u00a3\u00fb\u0095R\u0089\u00c4\u00ea\u00f1ix\u00ed\u00a0\u009e\u00b4\u00e4|\u00b3\u00fc\u00dc\u001e\u00f3\u0012\u00e2\u00c4[\u000fF\u00a4\u0085\u00c8\u00edr^\u00d0\u0099\u00e0&f\u00ae\u00c7\u00e0j2u\u00ff,\u0018`\f\u00e0Gja\u00a1\u00de\u00d3\u00f7\u00e0M\u00aa\u0012!l\u0003\u00dd}.\u00d3\u00bb\u001c\u00eer\u00ce\u00aewp\u00daE43\u009d\u0096\u009b\u0005\u00dfS\u00b3\n>s\u00cfe\u00c0\u00b8\u008e\u00f2\u0013\u00f6\u00bf\u001eP\u00d0A\u00c1\u00e8^\u0093~EZ\\\u0093\u00a6\u0006k\u0013\u009e=\u00e27\u0003Z\u00eaaR\u00ac\u00c0\u00e7\u00d3\u0011\u00c1\u00e6\u008c\u008f\u00e5X\u00d3\u00fe\u0099?8;\u0099\u00f7^3if; \u00e0\b\u009b\u00ae\u00df\u0093#L\f\u007f\u0090\u008fMTh\u00b4\u00d9\u00ff<B\u00ff\u008a\u009fd\u00c6\u00c7p\u009e\u00938n\u00bd9\u0094\u0086d\u00d4\u00f7\u0086\u00a3q\u0090s\u00c6H\u00ceFw\u00ea\u008d\u00bdm[l\u008c\u00efV\u0098c\u00b2%\u0012V\r/\u00fc\u00faT=\u00a5\u00dc\u000e\u00eev\u00baIn\u00bel\u00ae\u0087\u008b_*\u000e\u00ec\u00a2T\u00fa\u00bb&A\u0082\u00d3\u00e5\u00ddd8\u00dc\u00cf/\u0011\u0019 M\u00c0\u001a\u0000\u00f5D\u00a3\u008f\u001f.X\u009c\u00a2q\u001bQ\u009e\u00c2\u00020\u0019#\u00d8iAh\u00b7\u00ae\u00d9\u00ccx\u00c4\u0005(;i\u00a5\u00c2\u0095g!\u0005\u00c7!W\u0088\u00b9\u0014\u00f2\u00b4\u0001\u00ff?\u00bd\u00dd\u009el4\u00c7\u0086o\u0017\u00a1\"4\u00ce\u00c7 \u009cd3\np\u00fe0q]\u009e\u0018P\u00e3\u00a53\u00f9\u00dfK\u00c3\u00a1L1\u00bd>\u009f\u00e5\u00ab:+\u009eBA\u000795M\u00ff\u00c8\u00ec$\u0094$Y(\u0093\u00fe\r\u00f6*\u00c6oj\u00f1\u00a8\u00cd\u0007\u00cc\u009bc%\u00e4\u00f1`\u00ffr\u00d6\u00dd\u00fc\u001eY\u00d5\u00d9\u008d\u00ee\u00f3\u00d8HMsm\u0011\u0088d\u00cd\u0082\u00d7GHe\u00bc\u00cd&\u00d4-J0s\u00aa\u0091\u009aq\u009b\u00ee\u00ea3t\u00ec\u00d03\ng\u00c6\u00fce\u00d9p\u00b1<\u00872-\u00b5{\u0018=\u00bc\u0007v\u00a9\u00b3\u00c6\u0015/\u0011\u00c0\u00eb\\\u00cd\u00aa\u00cb\u0083\u00a4(=\u0093K\u00bb+{j\u00bdi\u00f9?\u00a4\u0092E\u00d4p\n\u00ef\u001apf\u0082:B\u00aeiW\u00ff\u00e2\u00c6\u0087\u009c\u0090\u00ccg#\u00a2\u001c=k\u00c0\u00da\u00ba\u000e+\u00e3\u00b5P\u0002l/\u00eaT\u00cag\u00da\u008a|6\u008c\u009d\u00ce\u00f8\u00bf\u001bd\u00da\f\u0083\u00b6z\u00eaJ\u00a8Z\u0084\u008a\u00dc\u009fAkL\u00e1KF&\u00a2\u00fd;\u0092\u0094\u000b\u0097L\u008a+D\u00eb\u00a3\u0091\u00b1\u00a1\u00dd\u00dey\u00f7#>3jl\u0097m\u00c1z\u00a2\u00e6\u00dcu\u00ee\u00a0\u0010\u0083p\u00f2\u0096(\u001f\u00d8X\u0087\u00a2\u00c8X\u00bbWML\u0091\u00e9\u00e6\u00e3\u0092\n\u0090\u0007JU%2V$\n\u001d\u0006^\u0099Kn\u00b0\u00fc\u00b601\u0017\u00afy\u00b1\u00be\u00eat\u00a9\u00db\u00ce\u00c14\u00f0\u00c8\u00aaE'\u00fbE\u0005B\u00a3\u00ebiQX\u00ff\u00d3c\u00d3\u0015\u0005\u00c1\u001e\u009e?\u0091\t_\u0004\u0088\u00b4\u001a\u00cc\u001c=\u00dcO\u0010f\u00a5\u009a\u00d3\u00edIY\u001f\u001c\u00bc\u00e0\u00df*\u00d2ec\u00ea\u00a7\u00ba\u00d2\r\u00f7\u00ff\u00e3\u00b7\u00c3X\u007f\u000f\u0010v9\u00b2\u00c5\u00e2\u00e6\t\u00c6\u0003w\u0004\u00f4p\u0012\u009a\u0088G\u00d2\u00ce\u0010z\u0018r\u009d\u008a\u0081\u00c3O\u00d3\u0093Pw\u00cbN\u0094_\u00c9J\u00f2J\u00ee\u00ff7Z\u0016\u0004$\u00d2K\u00ae*\u00a7\u00a0\r\u000b\u00dd\u0014\u00d0]\u00c9\u00bb\u001d\u00af\u00ce1\u0082\u00d6\u0086\u008c\u00ed\u0000\u009d\u00e7\u0017\u00828w\u00b6k\u0016S\u0087\u00ffM\u00805\u0000\u0014\u008dW\u00c9\u0012\u007f-\u00b4\u00f3\u00cc\u00c3t\u00f4}e\u0082Q\u00f8 \u00c4\u00bb\u0092ay\u00b06\u00d9\u00c53I\u000fB\u00c6\u00fdk\u00f5nKc\u0097\u009d\u0094-S\u00d3ql\u00ad\u00c2\u009a\u00b0\u00adG\u00cdC_\u00ff\u00d0\u00b6\u00ff$f}\u00b1\u00b5$\u009d\u0082\u0083\\Hx&\u00052S\u001a\u00bd\u00b2lJa\u0081\u00ad\u00afHI\u00a4Y\u00db[\u00fb\u00ed\u00c2\u00e0\u0001S\u00e0\u00b5\u00d81P=\u00da/\u009b\u00b5\u00b7S\u00f5]\u00a5\u00d4\u0011\u001c\u00b7\u00d0\u0080}Q\u009a\u00f4w\u0000\u00eb\u00bb\u00c8\u0002\u0082U\u00a6\u0016\u008d\u00fc\u0010\u00fb\u007f=0\u008f\u0005\u001f\u00ec@\u0012\u00bd\u00dc\u001dT{\"\u008b\u00fe\u00feR\u0016'M\u0019\u00fe?7\u00f2\u00a2<pZ_&+Rsx\u00fd\u00d2\u00deZ<?\u00ebK\u00beY\u00b9*f*\b\u00a6\u00c0h\r`\u0096\u0005)\u00e7\u001a>C\u009d\u009d\u0017\u00d2/kNCmh\u00f2~\u0089\u0084@\u00af\u00d2\u0006\u008e\u00e0\u001e\u0091\u00e7\u007f}f\u0091\u0081\u0093\u0081d\u0086g\u00ac\u00cf\u00af\u00e0+f\u00e8\u00be\u00df\u00ff*\u00e0\u0097J\u00ff\u00f2\u00e9Fs@M\u00a72\u001d\u009d+\u00836<\u0016\u00c7\u00c5\f@\u00d3i`\u00a4\u00ad\u00bc\u0002\u008f\u00c2gA\u0084\u00ac8|\u00f7\u009e\u00b9\u00a8\u00c7>^3\u00d2>\u00c4\u0012\u00ab\u008aR\"\u00da\u00d1\u00c1a\u0005\u009c\u00ca\u00bf\u00a9W\u00e2\u009cX/\u0094 v\u0015\u00e3\u00c9\u00ed\u0017\u00ab]\u0089m\u00c7\u0084 \ns\u0016\u00cc\u008ey7<>\u00b4;\u00bc\u00a9?\u00a3\u00e7\u00de}\u001a\u00bb\u0090l\u00b1\u00c4.7\u0090\u00abc*\u00ecy\u00a8\u00d6/\u00ab\u0080Bzf\u00a3\u009a\u0090i\u00eb^#l\u00af\u00a0i\t<\n\"%\u00cf\u000eyF\u00adf\u00b7\u00bb\u009e\u00da\u0094\u00c2\u008c\u00ab\u00ed\u00d4i1\u00f0P\u00c8\u001d-r\u00db@J\u001a\u008drE\u001c\"\u009a\u00b7/\u009br\u009d\u00b3&\u00e4si\u009cU\u00d9\u0091|`[\u001f\u00a8\u00e8\u001f\u0097\u00beE\u00cbr\u00ce\u0016\u00e6\u009b\n{]\u0098~\u00fc\u0088!\u00b2\u008a\u0081\u00d69\u00berg#\u00e5\u00ddOhI)^\u00ee\u001b\u00cdW\u00aa\u00ff\u00f5\u0002|w=t\u000e\u00a1z\u00bf\u00a1\u00e1\u00f1\u00fb\u00b3_/\u00dcP\u00b4\u00aa\u00e3\u0012=\u008fQ]\u0094\u0014R~\u00fd\u00fa\u00a6\u00f7\u00bd@\u00da\u0099\u0087\u00df\u00d8Dp\u00b1\u00e9\u0097\u00a6\u00da\u00c1\u0085\u00f2\u00b5aL;\u00a4\u00d2\u00ec\u0001\u0004\rX\u0086\u00f15\u00a9w\u00a3\u001c\u007f@@\u00c8\u00b8\u0006\u00c9\u00d9\u00ef\u00c2\u001f\u0095\u00c5\b&\u0015\u001bU\u00d0\u00f3\u00b1\u00a1\u00e9\u00ac;\u0084e\u00bd\u000b0\u00f9\u00e6\u00fc\u00b1\u00bdE\u0097\u001aC?\u00f5*e/uA\u009f\u001a\u00be[\u0086\u00d8\u00e3\u0088G\u008c(S\u00b2N`\u0085\u0084&\u00c0p2\u008cS\u0006\u00db\u001a!\u0080\u00ff\u00acHg\u0000\u00d9\u00d8\u00f81\u0001\u0083g\u001d\u0080k\u00e7\u000f\u00b7\u000e\n\u00b9\u0016\u00bdE\u00abA\u00a2\u0096\u00b7a\u00a3\u009e*\u008f\u00e7hY\u00a9A6\u00b1\u00d8O\u001aV\u00c2\u00eb\u0098\u0092\u001f\u00b7C\u00f1\u00f7q\u000fd\u00cbc\u00d8\u0016\u00f5\u00d4\u00cfn\u0013`~\u00cf\u0017,\u00cc\u000eO4\u00e0\u008d\u00dcv\u008fR\u00f4C5\u001co\u00ad\u00e67\u008de\u0010\u0084\u00e4V\u009e\u00bd\u00fd\u00fd>)x\u00d9\u001a\u00c9?+cL\u0088\u0003:\u009b\u00cd\u00a5\u00f2i\u0087\u0086\u00d3\u00127F2\u00868\u00cc2\u00ba\u001fob\u00db\u00a2\u0086-t\u0086R\u001b\u008c\u00a2\u0003\u00baQa\u00e5\u009d\u0081\u00f6\u00d4\u0017\n\u0003`\u00f4s\u00ea\u001e`\u00a8\u0018f\u00dd=\u0098K\u00e0\u00f9z\u0090\u00d3\u00af'\u0085f\u00861\u00f8\u00e8\u0080]\u00e2'\u00beSm#.wTcTp)\u0004z\u00a4[q\n7\u00f0\u001c\f\u0006\u00d1\u008cl\u00a0\u00ca\u00ed\u00de\u0003\u0014J\u00c2dEX\u0005\u0084\u0095j\u00b8$D:\u008b\u0001#\u008b$\u00feX<b\u009e;<$\u00cd\u00f6E\u00fc\u00ccUP\u00c5\u00d9\u00d8\u00d4\u00ca\u00e0\u00a4\u00bb\u001e\u0088]|\u00b2\u0002\u00dc\u00c9Y\u00ac\u00b2\r\u00c1C\u0005\u00b0 \u00c3f\u00e0\u00a3\u0001L\u00dbz\u00b0*q\u00cc\u0005WV\u001f\u000b\u00de\u0015\u009eqg\u00b6\u0094\u0011C\u00e5\u00ded\u001f|\u00f3\u0015\u001dM\u00e5\u00e2_\u00fe\u00ab\u00e0O\u0000j\u00cfTQ\u00fa\u00ef\\\\X8s\u0081zF;\u00c1_u\u00e4\u00a7\u00f1\u00cc\u00db\u00b9\u00f7\u00f7\u009a\u00c1k>\u0094\u008e\u00a4p\u00fc\u001c\u00d5\u0015I:I\n\u009d\u00c8\u00d4\u00f6z\u0014\u00be\u0017\u00ea\u00e9\u0081RM\u00b2:\u00c6\u00e9\u0099\u0005\u0017\u00c6(\u00e8\u0088\u00b9\u00b7\u00d2-\u00b6R!jWy\u0098\u00a3\u00f8\u000b\u00aeQd\u00966\u00dc\u0006Q\u00a7b0\u00e7\u00878\u00a4c\u001dF\u00c7\u008a\u00d6`\u008e3\u00aeh\u00039\u00ec\u00c7\u00d1?\u008d{\t\bm\u00d3\u00df+=\u00c9\u00c5\u0085B<,\u0084\u00bd13(\u0085B\u009319\r\u00ee\u00aa\u0086\u00bc\u00c8\u00c1\u0087\u00f5F\u0084\u00cc\u00d8\u00051\u00d2\u0003Y\u00bb\u0096\u0086\u00d3\u00a3#J\u0017\u00d1\u00de\u00d8\u0087\u009e\u00da\u0015\u008f\u0084\u00a4\u0006^\u0098\u008eL\u0088\u00b7\u00bb\u0019\u00e9\b\u0005q\u00b5\u0086NF\u00df\u00ff.\u0086_\u00b3\u0087\u00c5!\u00eb\u00952\u00ca\u00ff\u00e3s\u00e1\u0087\u00d0\u00af%\u00f9\u00ee\u00ae\u00e6\u00c4\u00ba\t\u00b2\u00c5\u008d\u0095\u0096\u0080a\u00e4\u00b1c\u0006\u00d4jZ\u00dd\u007f\u0017w\u00e9X|\u0001N1\u00e0\u00d8@\u0012\u00ed\u00d8\u00f2W\u00c7\u0004\u00e5k\u00bd\u0089\u00b0\u0092\u0002r\u00db;\u008c=\u00eb&H\u00acT\u000e\u00ab\u009f\u0014u\u00a0\u00f7\u00e0\u0080x!R\u00da?\u00d4\u0083\u00deE\"\u0000\u00d1\u00d8\u0015\u00ec\u0005)\u00e2`\u00f8\u00e9\u001a\u0093\u00e7\u0007Y\u00b6_\u000f\u001dQ+\u0099\u0088@\u00be\u00abO\u00e5[\u0002:\u00af\u0010\u008b`X\u0011y\u00e0\u001a\u00f4\u00ec\u0086\u00bfj\u00deHH8\u0086b\u0013J\u00ab\u00caq\u00f4\u0006+\u00ab\u0019s\u00b1\u00feHHE\u00884\u00a9ZZ\u0084\u0089\u0094N\u00e8\u0091ib\u00e8\u00ce\u0016-\u00f4\u0080}\u00ca\u00cc\u008a\u009c8\u00f2\u00af\u0082\u001c\u00de\u00bd3:An\u00df\u008e\u00a8Z\u0082\u00c1c\u00e0GR\u008b^\u00f6iS\u00dd\u00fd\u00e6\u00e1\u009c\u00b4M\u0092\u0089\u0097x\u0084\u00a9k;\u00d5`\u00f6U\"z3Oc\u00ffu4\u0097\u009a\u00c6\u00f9\u00fan\f\u00c3_\u00d6\"]\u0010\u00bd\u00adr\u0098\u00a65\u00c1PC\u00cd\u00f51=\"\u0004\u0088J\u00a26\u00ce\u00fb\u00dd\u0095,\u008b\u001cYM\\\u00ca\u0091z;\u0094\u00a5\u008c\u0094\u0012\u0012N\u0086\u0000\u0001\u0004\u00e9\u00d2\u00b2[\u0092nw1\u0018\u007f\u0095\u00f0-\u008d\u00d3\u0095\u00dcT_H\u0092\u0092\u00fe\u0084\u0090vg\u0099\u0013\u001f\u00e7Yjb \u00d3\u00a0\u00ca\u00e8\u00ad\u00e6o\u00f3J\u00b4kW\u00cfn\u00eb\u0001\u0092\u00c2@\u00b3\rq\u00a8\u0084b\u00e1\u00d7*n\u00e7\u00e9o\u008d\u000e\u00f3\u0012\u001f\u00f1\u000bOp\u00aa\u0013\u0088\u001c\u00a2\u0003\u001e\u0001X\u0095\u0000\\\u009d\u00e1^\u00fe\r\u00f9\u00fe\u009b\u0080\u0002\u00be\u00d2\u001b\u008c\u00a2\u00cf\u001c\u00a3v\u0001\u0091\u00cf\u00be\r`\u00d1\u00ed\u00e8HDiw\u00fe\u009c\u00e4\u0092EG]\u00a2w@[\u00b8Dg\u00d5F\u00f2)l)\u0006\u00aa\u008e\u0085#\u0088\u0083wN\u0002\u00f3\u00bf\u00b5\u00db%\u00a8\u00a0\u009e\u00e7\u00d1\u008d\u00f3Ym\u0094#\u009bh+\u00dd\u00b0\u00f2a\u0082\u00ac\u008b\u008b\u008d\u009b%\u008fO:\u00d8\\\u00b5\r\u00b3\u00f9~\u008drU\u009fC-\u0018p\u0090,\u00a9/\u0092\u000f\u00cb \u0083\u0087\u00ebM\u00b4\u00df\u00a9Po\u00c41\u00864\u0015\u008b^\u000b\u00fdG\u0080\u00c5\u00ee\u00fd1p\u00a16L\u000f\u00aa[\u00f6]\u0087\u001a\u00ec&\u00bdb\u00c7V[\u00b1(E\u00a1\u00c1\u00d55\u00ac-Z\u0086\u00ef6z\u00d6\u00ab3\u00b8\u0004-l\u00b3\u00b1\u009aM\u00ef\u00ff\u00f8\u00b5\u00d1d\u00f4\u00f8\u00e2\u00e9q\u0000\u00a8\r\u0004!\u000f\u00c34X\u00a8\u00f0\u0087d\u00c1H\u00f6\u0081Ap\u00a4\u0080~y\u00b9j\f\u000f\u00e9\u00e7C_\u00a70\u00dd/\u0019\u0098\u00039\u00be \u0082P\u00b6o\u00b2V\u00b1v\u00a410\u001as\u00e9U\u00d2h\u0098\u0010\u00d6\u00c6(\u008f\u00ea\u00dc\u00fd\u00dd\u0016k\u0091\u00b8jnb\u00da\u00d5\u008b`\u00cajf\u00cfB\u00b0\u00ff\bk\u00d5\u00d4;\t\u00beo-\u009c&\u0015\u0014\u00b0\u000e\u00034'\u000b7IH5\u0001\u001f\u00e8H$\u00b4#rqT\u0081\u000e\u008bm%\u00a9^]\u00f7\u0098\u00ff\u00b1\u00c1\u0017\t\u00d0\u001b\u008e\u0089\u00e0\u00b5\u00a6\u00d3\u001d8\u0017\t\u00b3\u00ea\u00c2h\u0086\u0081Tu\u00b9L\u00a3\u0089\u00ab\u00f7\u00de\u0004Zs[\u00d2^G0\u00caOX\u0015\u00d9j\u00f2\u00dd\u00d7ZtU\u00f1\u0080\u00c4\u0004\u0083|\u00cdn\u00c7\u00b99\u009a\u00d9 \u0018Jm\u00f9\u00f3=\u00e1\u00c8\u00c2`\u00ff\u00c9~B\u0014\u00f4\u00be\u0086\u00dc\f#\u00c3_J2\u00ccc\u0019\n\u0098\u009cbx\u001b\u00bb\u00d2\u009a\u00b7K\u00f9g\u00c3\n\u00dfN\u00c4\u00bd\u00a39s\u0098\u0084\u00b0\u00c4c .c-\u00d9\b\u0085E\u00aaJPu\u000f\u0092{\u001e\u00ed\u00ad\u00ecOyX\u00c4\u00c5\u00ce\u0003\u00eb\u009do\u0095 \u000eT\u0094y\u00d3\u00ae8\u0015\n\u00b2FW\u00e5\u0014\u00b8\u00e9\u00d1\u009b1@x\u00edM'kB!\u00b3\u00d4\u007f\u00e0\u001c~=m\u00e7q\u00c7:\u00edL/\u0095\u00b3\u0006\u00c9\u00fa\rs\u0018\u00be\u00c7=\u009a\u00a92\u00b2\u00ca7*\u00b5\u0085\u00d1P\n\u00cc\u001a\u00e1^\u00dbe\u00fd\u00b9L\u00d4\u00e7\u008a\u0006\u00f1\u009c\u00fdE>\u001ax\u0002\u00d7\u00fd0\u0005\u00e8l7\u00b6\u0083T\u0019\u0093\u009bsz\u00ec\u0012\u0090@\u00a3\u0093\u000f\u008e\u00e6]\u001aqv\u00fdf\u00b1\"\u008d\u00a59L{\u0012\u009d\u0092h -\u00fa\u00f60\u00fa\u00b1\u00b3!\u0080\u00ba\u00fc\u00d3\u00ee^L\u00e0\u001d\u000e\u00fbF\u0095\u00b3\u008c@\u001e\u0085\u0080\u00e5x\u00c7\u00c4\u00e5,\u00f0hh\u0003mr\u0089\u0088V\u00fa\u0000S\b\u00ba\u00ca\b\u0016j\u00ff\u00f13\u0014\u009f\b\u00e2(\u0017\u00e9\u0085\u00bao\u00ab\u00af}\u009eA!j\u00be\u0004\u00f1\u00e0\u008bi\u00daF\u001cS\u0098\u00ea\u00a5##\u0012\u00b6\u00c7i\u00d1y\u00d0\u001fF\u00cay-\u0088L\u00ea\u00f5\u00e7\u00f8\u00a5\u00bcB7\u0091!\u00bd,j\u00d7Y\u0005\u00d4EH".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IlIlI = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            Theme.IlIlI[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        llIl = new String[58];
        Theme.lll();
        Illl = new Theme("Custom", null, null, null, null, null, null, null, null);
        IIIII = new Theme("Ruby", Theme.lIl(255, 24, 64), Theme.lIl(255, 106, 75), Theme.lIl(255, 126, 150), Theme.lIl(42, 20, 25), Theme.lIl(17, 6, 9), Theme.lIl(10, 2, 5), Theme.lIl(255, 232, 237), Theme.lIl(196, 127, 139));
        IIll = new Theme("Tangerine", Theme.lIl(255, 125, 32), Theme.lIl(255, 203, 63), Theme.lIl(255, 190, 124), Theme.lIl(40, 27, 18), Theme.lIl(18, 10, 5), Theme.lIl(11, 5, 2), Theme.lIl(255, 238, 215), Theme.lIl(194, 151, 111));
        IIlI = new Theme("Sun", Theme.lIl(255, 228, 58), Theme.lIl(190, 255, 82), Theme.lIl(255, 241, 142), Theme.lIl(36, 34, 18), Theme.lIl(15, 14, 5), Theme.lIl(8, 8, 2), Theme.lIl(255, 251, 221), Theme.lIl(184, 176, 116));
        IIIll = new Theme("Lime", Theme.lIl(118, 255, 61), Theme.lIl(48, 231, 148), Theme.lIl(190, 255, 140), Theme.lIl(23, 37, 24), Theme.lIl(8, 16, 8), Theme.lIl(3, 9, 3), Theme.lIl(232, 255, 222), Theme.lIl(135, 187, 127));
        llI = new Theme("Emerald", Theme.lIl(42, 235, 145), Theme.lIl(34, 205, 205), Theme.lIl(148, 255, 205), Theme.lIl(20, 35, 30), Theme.lIl(7, 16, 13), Theme.lIl(3, 9, 7), Theme.lIl(224, 255, 239), Theme.lIl(127, 179, 156));
        IlI = new Theme("Cyan", Theme.lIl(47, 237, 255), Theme.lIl(74, 160, 255), Theme.lIl(155, 247, 255), Theme.lIl(19, 34, 38), Theme.lIl(7, 15, 18), Theme.lIl(3, 8, 10), Theme.lIl(222, 251, 255), Theme.lIl(126, 181, 190));
        I = new Theme("Azure", Theme.lIl(70, 139, 255), Theme.lIl(90, 222, 255), Theme.lIl(166, 200, 255), Theme.lIl(20, 27, 40), Theme.lIl(8, 12, 20), Theme.lIl(3, 6, 12), Theme.lIl(228, 238, 255), Theme.lIl(132, 153, 193));
        lIll = new Theme("Violet", Theme.lIl(178, 86, 255), Theme.lIl(255, 93, 206), Theme.lIl(214, 174, 255), Theme.lIl(32, 22, 42), Theme.lIl(14, 8, 20), Theme.lIl(8, 4, 12), Theme.lIl(244, 232, 255), Theme.lIl(168, 135, 194));
        IIl = new Theme("Magenta", Theme.lIl(255, 68, 180), Theme.lIl(255, 95, 116), Theme.lIl(255, 173, 218), Theme.lIl(39, 20, 33), Theme.lIl(18, 7, 14), Theme.lIl(11, 3, 8), Theme.lIl(255, 230, 244), Theme.lIl(193, 129, 164));
        lIlI = new Theme("Orchid", Theme.lIl(166, 131, 229), Theme.lIl(116, 141, 255), Theme.lIl(194, 202, 255), Theme.lIl(28, 31, 42), Theme.lIl(13, 15, 21), Theme.lIl(6, 7, 12), Theme.lIl(229, 233, 255), Theme.lIl(138, 145, 174));
        ll = new Theme("Neon", Theme.lIl(0, 245, 255), Theme.lIl(255, 43, 214), Theme.lIl(139, 255, 248), Theme.lIl(18, 27, 38), Theme.lIl(5, 9, 18), Theme.lIl(2, 4, 10), Theme.lIl(226, 253, 255), Theme.lIl(128, 185, 203));
        lI = new Theme("Sunset", Theme.lIl(255, 111, 97), Theme.lIl(255, 154, 0), Theme.lIl(255, 181, 128), Theme.lIl(42, 26, 33), Theme.lIl(18, 8, 18), Theme.lIl(9, 3, 10), Theme.lIl(255, 235, 222), Theme.lIl(204, 146, 136));
        IIlIl = new Theme("Ocean", Theme.lIl(0, 194, 203), Theme.lIl(52, 116, 255), Theme.lIl(132, 231, 224), Theme.lIl(18, 32, 42), Theme.lIl(5, 13, 22), Theme.lIl(2, 7, 13), Theme.lIl(226, 248, 250), Theme.lIl(128, 175, 190));
        Il = new Theme("Aurora", Theme.lIl(99, 255, 181), Theme.lIl(164, 105, 255), Theme.lIl(181, 255, 222), Theme.lIl(22, 35, 34), Theme.lIl(7, 14, 18), Theme.lIl(3, 7, 10), Theme.lIl(227, 255, 241), Theme.lIl(137, 190, 175));
        IlIIl = new Theme("Dracula", Theme.lIl(255, 121, 198), Theme.lIl(139, 233, 253), Theme.lIl(255, 184, 223), Theme.lIl(36, 39, 58), Theme.lIl(20, 22, 34), Theme.lIl(11, 12, 20), Theme.lIl(248, 248, 242), Theme.lIl(182, 188, 205));
        llII = new Theme("Nord", Theme.lIl(136, 192, 208), Theme.lIl(180, 142, 173), Theme.lIl(191, 229, 236), Theme.lIl(36, 44, 58), Theme.lIl(18, 24, 34), Theme.lIl(9, 13, 20), Theme.lIl(236, 239, 244), Theme.lIl(163, 174, 191));
        IIIIl = new Theme("Rose Pine", Theme.lIl(235, 111, 146), Theme.lIl(156, 207, 216), Theme.lIl(246, 193, 209), Theme.lIl(38, 35, 48), Theme.lIl(22, 20, 30), Theme.lIl(10, 8, 14), Theme.lIl(242, 233, 222), Theme.lIl(196, 167, 176));
        IIII = new Theme("Cherry", Theme.lIl(255, 58, 92), Theme.lIl(255, 136, 118), Theme.lIl(255, 160, 176), Theme.lIl(43, 18, 27), Theme.lIl(18, 6, 11), Theme.lIl(10, 2, 6), Theme.lIl(255, 233, 238), Theme.lIl(201, 129, 146));
        IIIlI = new Theme("Coral", Theme.lIl(255, 101, 82), Theme.lIl(255, 172, 95), Theme.lIl(255, 183, 158), Theme.lIl(43, 24, 23), Theme.lIl(18, 8, 7), Theme.lIl(10, 4, 3), Theme.lIl(255, 236, 225), Theme.lIl(203, 143, 127));
        III = new Theme("Amber", Theme.lIl(255, 184, 55), Theme.lIl(255, 231, 105), Theme.lIl(255, 214, 137), Theme.lIl(39, 31, 17), Theme.lIl(17, 12, 5), Theme.lIl(9, 6, 2), Theme.lIl(255, 246, 220), Theme.lIl(194, 166, 111));
        lIl = new Theme("Mint", Theme.lIl(95, 255, 170), Theme.lIl(97, 224, 255), Theme.lIl(178, 255, 214), Theme.lIl(20, 38, 31), Theme.lIl(7, 16, 12), Theme.lIl(3, 9, 6), Theme.lIl(226, 255, 240), Theme.lIl(130, 189, 159));
        IIlll = new Theme("Lagoon", Theme.lIl(36, 217, 202), Theme.lIl(77, 151, 255), Theme.lIl(146, 244, 231), Theme.lIl(18, 34, 40), Theme.lIl(6, 14, 20), Theme.lIl(2, 7, 12), Theme.lIl(224, 250, 251), Theme.lIl(126, 179, 191));
        lIIl = new Theme("Frost", Theme.lIl(124, 211, 255), Theme.lIl(173, 148, 255), Theme.lIl(193, 233, 255), Theme.lIl(24, 31, 43), Theme.lIl(10, 13, 22), Theme.lIl(4, 7, 13), Theme.lIl(232, 245, 255), Theme.lIl(145, 168, 200));
        IIIl = new Theme("Sapphire", Theme.lIl(66, 110, 255), Theme.lIl(73, 225, 255), Theme.lIl(158, 184, 255), Theme.lIl(18, 24, 43), Theme.lIl(7, 10, 22), Theme.lIl(3, 5, 13), Theme.lIl(227, 236, 255), Theme.lIl(126, 148, 197));
        II = new Theme("Grape", Theme.lIl(149, 91, 255), Theme.lIl(232, 93, 255), Theme.lIl(202, 170, 255), Theme.lIl(30, 22, 43), Theme.lIl(13, 8, 21), Theme.lIl(7, 4, 13), Theme.lIl(241, 232, 255), Theme.lIl(164, 134, 197));
        IlIII = new Theme("Candy", Theme.lIl(255, 89, 204), Theme.lIl(255, 129, 156), Theme.lIl(255, 181, 230), Theme.lIl(41, 20, 37), Theme.lIl(18, 7, 16), Theme.lIl(10, 3, 9), Theme.lIl(255, 231, 247), Theme.lIl(199, 132, 171));
        lII = new Theme("Slate", Theme.lIl(151, 164, 184), Theme.lIl(96, 112, 136), Theme.lIl(210, 218, 230), Theme.lIl(31, 34, 41), Theme.lIl(13, 15, 19), Theme.lIl(6, 7, 10), Theme.lIl(240, 243, 248), Theme.lIl(158, 166, 180));
        l = new Theme("Mono", Theme.lIl(222, 226, 236), Theme.lIl(129, 139, 159), Theme.lIl(242, 244, 249), Theme.lIl(30, 32, 37), Theme.lIl(12, 13, 16), Theme.lIl(5, 6, 8), Theme.lIl(245, 246, 251), Theme.lIl(154, 160, 174));
        IllI = Theme.llI();
    }

    public Color lII() {
        return this.lllI;
    }

    @Override
    public boolean l() {
        return this != Illl;
    }

    private static Color lIl(int n, int n2, int n3) {
        return new Color(n, n2, n3, 255);
    }

    private static /* synthetic */ Theme[] llI() {
        return new Theme[]{Illl, IIIII, IIll, IIlI, IIIll, llI, IlI, I, lIll, IIl, lIlI, ll, lI, IIlIl, Il, IlIIl, llII, IIIIl, IIII, IIIlI, III, lIl, IIlll, lIIl, IIIl, II, IlIII, lII, l};
    }

    private static void lll() {
        Theme.llIl[0] = Theme.IIII(Theme.IIlI(-899425329, -472167817).toCharArray(), 73918L, 1642515155);
        Theme.llIl[1] = Theme.IIII(Theme.IIlI(-899425330, 1673744437).toCharArray(), 55007L, -980493597);
        Theme.llIl[2] = Theme.IIII(Theme.IIlI(-899425331, 692521578).toCharArray(), 50585L, 1025079195);
        Theme.llIl[3] = Theme.IIII(Theme.IIlI(-899425332, -1060810115).toCharArray(), 60614L, -399026359);
        Theme.llIl[4] = Theme.IIII(Theme.IIlI(-899425333, 363530418).toCharArray(), 50507L, -1426446168);
        Theme.llIl[5] = Theme.IIII(Theme.IIlI(-899425334, -775021430).toCharArray(), 36593L, -418696117);
        Theme.llIl[6] = Theme.IIII(Theme.IIlI(-899425335, -281454282).toCharArray(), 14393L, 1794888751);
        Theme.llIl[7] = Theme.IIII(Theme.IIlI(-899425336, -230070680).toCharArray(), 31080L, 1825891973);
        Theme.llIl[8] = Theme.IIII(Theme.IIlI(-899425337, -634899821).toCharArray(), 77526L, -1651546600);
        Theme.llIl[9] = Theme.IIII(Theme.IIlI(-899425338, 169548008).toCharArray(), 36677L, -1982467772);
        Theme.llIl[10] = Theme.IIII(Theme.IIlI(-899425339, 1742342720).toCharArray(), 67201L, -1018684524);
        Theme.llIl[11] = Theme.IIII(Theme.IIlI(-899425340, -1864541217).toCharArray(), 36512L, -848215529);
        Theme.llIl[12] = Theme.IIII(Theme.IIlI(-899425341, -546606408).toCharArray(), 90051L, 538059375);
        Theme.llIl[13] = Theme.IIII(Theme.IIlI(-899425342, 710023327).toCharArray(), 94885L, -1784669101);
        Theme.llIl[14] = Theme.IIII(Theme.IIlI(-899425343, 1074479332).toCharArray(), 71703L, 144723668);
        Theme.llIl[15] = Theme.IIII(Theme.IIlI(-899425344, 385973468).toCharArray(), 65738L, -1536618639);
        Theme.llIl[16] = Theme.IIII(Theme.IIlI(-899425313, -1680510202).toCharArray(), 51883L, 1771596663);
        Theme.llIl[17] = Theme.IIII(Theme.IIlI(-899425314, -3987710).toCharArray(), 74934L, -174099292);
        Theme.llIl[18] = Theme.IIII(Theme.IIlI(-899425315, -275240917).toCharArray(), 48113L, -2133964791);
        Theme.llIl[19] = Theme.IIII(Theme.IIlI(-899425316, 1914666303).toCharArray(), 6695L, -877991430);
        Theme.llIl[20] = Theme.IIII(Theme.IIlI(-899425317, 784097376).toCharArray(), 13875L, 2023361363);
        Theme.llIl[21] = Theme.IIII(Theme.IIlI(-899425318, 81400764).toCharArray(), 84670L, 420652348);
        Theme.llIl[22] = Theme.IIII(Theme.IIlI(-899425319, -191488218).toCharArray(), 34419L, 1409838674);
        Theme.llIl[23] = Theme.IIII(Theme.IIlI(-899425320, 1640711725).toCharArray(), 16602L, -664222713);
        Theme.llIl[24] = Theme.IIII(Theme.IIlI(-899425321, 1387729342).toCharArray(), 12981L, 1285208094);
        Theme.llIl[25] = Theme.IIII(Theme.IIlI(-899425322, -813627149).toCharArray(), 32361L, -169078294);
        Theme.llIl[26] = Theme.IIII(Theme.IIlI(-899425323, 1781683537).toCharArray(), 34744L, -810263895);
        Theme.llIl[27] = Theme.IIII(Theme.IIlI(-899425324, 1416788325).toCharArray(), 87563L, -88056409);
        Theme.llIl[28] = Theme.IIII(Theme.IIlI(-899425325, -1698072494).toCharArray(), 88729L, -654125852);
        Theme.llIl[29] = Theme.IIII(Theme.IIlI(-899425326, -506001897).toCharArray(), 31355L, -1701904549);
        Theme.llIl[30] = Theme.IIII(Theme.IIlI(-899425327, -1228784184).toCharArray(), 78242L, -262651129);
        Theme.llIl[31] = Theme.IIII(Theme.IIlI(-899425328, -875866497).toCharArray(), 51479L, -1130747983);
        Theme.llIl[32] = Theme.IIII(Theme.IIlI(-899425297, -1741140060).toCharArray(), 48517L, -2015306595);
        Theme.llIl[33] = Theme.IIII(Theme.IIlI(-899425298, -1556081974).toCharArray(), 80523L, -41047007);
        Theme.llIl[34] = Theme.IIII(Theme.IIlI(-899425299, 1467622995).toCharArray(), 53385L, 2064272363);
        Theme.llIl[35] = Theme.IIII(Theme.IIlI(-899425300, 283991078).toCharArray(), 57277L, 1996493218);
        Theme.llIl[36] = Theme.IIII(Theme.IIlI(-899425301, -839443467).toCharArray(), 96044L, 55995153);
        Theme.llIl[37] = Theme.IIII(Theme.IIlI(-899425302, -601019465).toCharArray(), 884L, 673899579);
        Theme.llIl[38] = Theme.IIII(Theme.IIlI(-899425303, 9852971).toCharArray(), 66977L, -252647155);
        Theme.llIl[39] = Theme.IIII(Theme.IIlI(-899425304, -1530264270).toCharArray(), 3810L, 479210875);
        Theme.llIl[40] = Theme.IIII(Theme.IIlI(-899425305, -1567200876).toCharArray(), 47864L, -943317022);
        Theme.llIl[41] = Theme.IIII(Theme.IIlI(-899425306, -1938750445).toCharArray(), 59177L, 1297353614);
        Theme.llIl[42] = Theme.IIII(Theme.IIlI(-899425307, -382655304).toCharArray(), 25017L, 1176962978);
        Theme.llIl[43] = Theme.IIII(Theme.IIlI(-899425308, -1916255856).toCharArray(), 37541L, 1059767291);
        Theme.llIl[44] = Theme.IIII(Theme.IIlI(-899425309, 1597727893).toCharArray(), 84672L, 1552536913);
        Theme.llIl[45] = Theme.IIII(Theme.IIlI(-899425310, -750052371).toCharArray(), 85142L, -2115200147);
        Theme.llIl[46] = Theme.IIII(Theme.IIlI(-899425311, -1476902730).toCharArray(), 65118L, 1297027969);
        Theme.llIl[47] = Theme.IIII(Theme.IIlI(-899425312, 1666536833).toCharArray(), 95109L, -1098506791);
        Theme.llIl[48] = Theme.IIII(Theme.IIlI(-899425281, 1457278406).toCharArray(), 10032L, -453591787);
        Theme.llIl[49] = Theme.IIII(Theme.IIlI(-899425282, 1234468530).toCharArray(), 88280L, 194030071);
        Theme.llIl[50] = Theme.IIII(Theme.IIlI(-899425283, -947555105).toCharArray(), 74235L, 634606881);
        Theme.llIl[51] = Theme.IIII(Theme.IIlI(-899425284, 525367384).toCharArray(), 41375L, -1599271666);
        Theme.llIl[52] = Theme.IIII(Theme.IIlI(-899425285, 972625515).toCharArray(), 99817L, 280902677);
        Theme.llIl[53] = Theme.IIII(Theme.IIlI(-899425286, -1615498772).toCharArray(), 76016L, 1385670310);
        Theme.llIl[54] = Theme.IIII(Theme.IIlI(-899425287, 1852182797).toCharArray(), 51929L, -1756993086);
        Theme.llIl[55] = Theme.IIII(Theme.IIlI(-899425288, -2047010842).toCharArray(), 72622L, 1930302147);
        Theme.llIl[56] = Theme.IIII(Theme.IIlI(-899425289, -1255577157).toCharArray(), 26998L, -2006170792);
        Theme.llIl[57] = Theme.IIII(Theme.IIlI(-899425290, -370598502).toCharArray(), 69445L, -158866114);
    }

    private Theme(String string2, Color color, Color color2, Color color3, Color color4, Color color5, Color color6, Color color7, Color color8) {
        this.IlII = StringFactory.lIl(string2);
        this.lIII = color;
        this.lllI = color2;
        this.IIlII = color3;
        this.Ill = color4;
        this.lll = color5;
        this.IIllI = color6;
        this.IlIl = color7;
        this.llll = color8;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIII(char[] cArray, long l2, int n) {
        int n2 = 0x31137081 ^ n;
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

    private static int IIIl(int n, int n2) {
        return IlIlI[n ^ 0x87D29A17] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IIlI(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0xCA63DBCF;
        char[] cArray = IlIll[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IllII[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            Theme.IllII[n3] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0xF53C6857;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 20 -> 246;
                case 21 -> 102;
                case 29 -> 127;
                case 27 -> 110;
                case 9 -> 175;
                case 5 -> 74;
                case 22 -> 156;
                case 6 -> 225;
                case 2 -> 170;
                case 15 -> 212;
                case 28 -> 171;
                case 26 -> 207;
                case 4 -> 31;
                case 16 -> 209;
                case 3 -> 125;
                case 7 -> 29;
                case 18 -> 239;
                case 17 -> 164;
                case 24 -> 234;
                case 1 -> 12;
                default -> 187;
                case 12 -> 222;
                case 10 -> 120;
                case 25 -> 35;
                case 13 -> 251;
                case 30 -> 61;
                case 11 -> 11;
                case 14 -> 146;
                case 8 -> 183;
                case 23 -> 248;
                case 19 -> 141;
                case 31 -> 214;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

