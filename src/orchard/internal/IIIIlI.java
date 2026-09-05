/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.IIIIlI
 * Purpose not identified - name is the original obfuscated one.
 *
 * Recovered strings in this class:
 *   - PvPTiers Default
 *   - Dia Crystal
 *   - OG Vanilla
 *   - McPvP Club
 *   - u5q1d7/c4n8
 *   - u5q1d7/p7v2
 *   - u5q1d7/m9t3
 *   - u5q1d7/s6b1
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
 *  net.minecraft.text.StyleSpriteSource
 *  net.minecraft.text.StyleSpriteSource$Font
 *  net.minecraft.text.Text
 *  net.minecraft.text.TextColor
 *  net.minecraft.util.Identifier
 */
package orchard.internal;

import java.util.Locale;
import java.util.Map;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.text.MutableText;
import net.minecraft.text.Style;
import net.minecraft.text.StyleSpriteSource;
import net.minecraft.text.Text;
import net.minecraft.text.TextColor;
import net.minecraft.util.Identifier;
import orchard.core.StringFactory;
import orchard.internal.IIIIIlllI;
import orchard.internal.IIIlIIIII;
import orchard.internal.IIIllllI;
import orchard.internal.IlIIIIIl;
import orchard.internal.IlIIIIIll;
import orchard.internal.IlIlIlll;
import orchard.internal.lIlIlllI;
import orchard.internal.llIIIlIl;
import orchard.internal.llIllllI;
import orchard.internal.llllII;

@Environment(value=EnvType.CLIENT)
public final class IIIIlI {
    private static final IIIlIIIII I;
    private static final IIIlIIIII l;
    private static final IIIlIIIII II;
    private static final Map<Long, Integer> Il;
    private static final IIIlIIIII lI;
    private static final IIIlIIIII ll;
    private static final Map<Long, Integer> III;
    public static final IIIlIIIII[] IIl;
    public static final IIIlIIIII[] IlI;
    private static final IIIlIIIII Ill;
    public static final IIIlIIIII[] lII;
    private static final IIIlIIIII lIl;
    private static final IIIlIIIII llI;
    private static final IIIlIIIII lll;
    private static final Map<Long, Integer> IIII;
    private static final IIIlIIIII IIIl;
    private static final IIIlIIIII IIlI;
    private static final IIIlIIIII IIll;
    private static final IIIlIIIII IlII;
    private static final Map<Long, Character> IlIl;
    public static final IIIlIIIII[] IllI;
    private static final IIIlIIIII Illl;
    private static final Map<Long, Character> lIII;
    public static final IIIlIIIII[] lIIl;
    public static final IIIlIIIII[] lIlI;
    private static final Map<Long, Integer> lIll;
    private static final IIIlIIIII llII;
    private static final IIIlIIIII llIl;
    private static final IIIlIIIII lllI;
    private static final Map<Long, Integer> llll;
    private static final IIIlIIIII IIIII;
    private static final IIIlIIIII IIIIl;
    private static final IIIlIIIII IIIlI;
    private static final IIIlIIIII IIIll;
    private static final Map<Long, Integer> IIlII;
    private static final int[] IIlIl;
    private static final String[] IIllI;
    private static final Object[] IIlll;

    /*
     * Enabled aggressive block sorting
     */
    public static Text I(String string, IIIIIlllI iIIIIlllI, llllII llllII2, IIIllllI iIIllllI, IlIIIIIl ilIIIIIl, llIIIlIl llIIIlIl2, IlIlIlll ilIlIlll, boolean bl) {
        Record record;
        String string2 = IIIIlI.llIl(string).trim();
        if (string2.isEmpty()) {
            string2 = "Player";
        }
        MutableText mutableText = Text.empty().append(IlIIIIIll.II(string2));
        if (iIIIIlllI == null) return mutableText;
        if (iIIIIlllI == IIIIIlllI.llI) {
            return mutableText;
        }
        IIIllllI iIIllllI2 = iIIllllI == null ? IIIllllI.I : iIIllllI;
        IlIIIIIl ilIIIIIl2 = ilIIIIIl != null ? ilIIIIIl : IlIIIIIl.I;
        llIIIlIl llIIIlIl3 = llIIIlIl2 != null ? llIIIlIl2 : llIIIlIl.Il;
        IlIlIlll ilIlIlll2 = ilIlIlll == null ? IlIlIlll.Il : ilIlIlll;
        int n = IIIIlI.lllI(llIIIlIl3).getOrDefault(iIIIIlllI.II().llII(), 0xD3D3D3);
        MutableText mutableText2 = Text.empty();
        if (bl) {
            record = IIIIlI.llII(llllII2, ilIIIIIl2);
            mutableText2.append((Text)Text.literal((String)String.valueOf(((llIllllI)record).I)).setStyle(IIIIlI.IIlI(Style.EMPTY.withColor(TextColor.fromRgb((int)IIIIlI.llI(iIIIIlllI, llllII2, ilIIIIIl2, llIIIlIl3))), ((llIllllI)record).l)));
            if (iIIllllI2 == IIIllllI.l) {
                mutableText2.append((Text)Text.literal((String)" "));
            }
        }
        mutableText2.append((Text)Text.literal((String)iIIIIlllI.II().IIII()).setStyle(Style.EMPTY.withColor(TextColor.fromRgb((int)n))));
        record = IIIIlI.lll(iIIIIlllI, iIIllllI2, llIIIlIl3, ilIlIlll2);
        mutableText2.append((Text)Text.literal((String)((lIlIlllI)record).l().IIII()).setStyle(Style.EMPTY.withColor(TextColor.fromRgb((int)((lIlIlllI)record).I()))));
        mutableText2.append((Text)mutableText);
        return mutableText2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Map<Long, Integer> l(String string) {
        Map<Long, Integer> map;
        String string2 = IIIIlI.IIIII(string);
        if (llI.lII(string2)) {
            return IIII;
        }
        if (!IIIll.lII(string2)) {
            map = lIll;
            return map;
        }
        map = IIlII;
        return map;
    }

    /*
     * Handled impossible loop by adding 'first' condition
     * Enabled aggressive block sorting
     */
    static {
        int n = 1845;
        String string = "\u76ad\u76b4\u76d6\u7680\u76d6\u768c\u76a6\u76b0\u2ae4\u2ab5\u2ae1\u2ae1\u9d29\u9d35\u9d29\u9d06\u9d02\u9d56\u9d72\u9d72\u12fc\u12e4\u12ee\u12e7\ubeb3\ubeda\ubea0\ubead\u105b\u1033\u1035\u102f\u2341\u5c94\u5c9e\u5c90\uaf03\uaf4b\uaf5d\uaf56\u59aa\u59a3\u59a5\u59ae\ucfef\ucfe7\ucf19\ucf19\u3098\u377d\u376b\u376b\u7071\u7199\u7067\u7062\u8e80\u8ed5\u8ed3\u8ede\u8e02\u8e0e\u8e02\u8e3d\u8e29\u8e2d\u8e79\u8e79\u644a\u6448\u6436\u645f\u642c\u642a\u6436\u645a\u642b\u642f\u6593\u6593\uc290\uc153\uc145\uc161\uc299\uc29f\uc157\uc154\uaaf1\uaa15\uaaf6\uaa1c\uab60\uab27\uab45\uab69\ua495\uab62\uab2c\uab42\uab7b\uab7c\uab58\uab58\ua07f\ua192\ua044\ua18f\u7a8d\u7abd\u7abb\u7ace\u922b\u9269\u9200\u920d\uaa51\uaa2b\uaa37\uaa35\uaa5a\uaa3e\uab8a\uab8a\u2465\u259a\u2474\u2479\ue8eb\ue8e8\ue8f4\ue8e4\ude57\udf90\ude36\ude3e\ude5f\ude33\ude58\ude3d\ude33\ude21\udf8f\udf8f\ue65c\ue638\ue60c\ue633\ue659\ue630\ue789\ue630\ua3bf\ua3a3\ua3bd\ua3d7\ua3be\ua3d6\ua3b9\ua3d8\uaa81\uaadb\uaaa7\uaabe\uaaa9\uaade\uaa85\uaadb\uaaa3\uaade\uaafa\uaafa\ucd47\ucd65\ucd0c\ucd7c\ucd68\ucd6d\ucd43\ucd62\ucd6c\ucd72\ucd72\ucd38\uaacf\uaa14\uaaaa\uaaaa\uaaa3\uaaaa\uaa08\uaa13\ua0d7\ua0ba\ua0af\ua0ad\ua0a6\ua087\ua0c9\ua0af\ua0b7\ua082\ua016\ua016\uf93f\uf93b\uf949\uf954\uf937\uf955\uf92d\uf953\u7459\u743d\u7464\u7439\u7466\u742f\u745b\u7429\u7406\u7404\u759e\u742f\u7436\u740d\u7430\u7460\u50b8\u50dc\u50c5\u50d8\u50fb\u50cb\u5086\u50f8\u50ad\u50d5\u50c1\u50c1\uf691\uf550\uf57a\uf572\uf69e\uf565\uf565\uf56b\uf570\uf573\uf54c\uf563\uf54c\uf57e\uf54a\uf54a\u1374\u0c9c\u133d\u1364\u132b\u0c9b\u1376\u0c9a\u0c8b\u0c94\u0c9b\u0c8b\u0c8b\u1360\u137a\u1334\u136e\u137a\u1374\u0c9c\u1342\u1329\u1345\u0c88\u0c8f\u1360\u136f\u136a\u0c9e\u1342\u0c89\u1367\u137f\u136f\u1341\u0c9d\u0c9e\u137f\u1374\u1364\u1342\u136f\u1331\u1331\u5096\u574e\u5743\u576c\u5096\u577b\u577b\u5774\u5776\u5098\u5720\u577d\u5740\u5749\u5089\u5746\u5746\u575e\u577e\u5752\u8ccf\u8c0f\u8cac\u8caa\u8cae\u8cc9\u8cd4\u8cdf\u8caf\u8c0b\u8cd3\u8cad\u8c8c\u8c83\u8cbe\u8caa\u8c85\u8cd4\u8cb4\u8c15\u8ca2\u8cbe\u8cdf\u8cdb\u8cb6\u8cc9\u8c17\u8c17\ua156\ua10e\ua103\ua12c\ua156\ua13b\ua13b\ua134\ua136\ua158\ua160\ua13d\ua100\ua289\ua149\ua106\ua106\ua29e\ua15b\ua126\ua294\ua14b\ua138\ua13d\ua128\ua28a\ua10e\ua10c\uc880\uc8be\uc8b0\uc8b1\uc8a8\uc8ae\uc884\uc8d2\uc8a3\uc8c3\uc8bb\uc8b5\uc8d4\uc8cb\uc8a6\uc8a2\uc8dd\uc880\uc8b7\uc8b7\uc880\uc8c7\uc887\uc8be\uc8a1\uc8a9\uc8c4\uc8ff\ub2bb\ub2a3\ub2ce\ub2cb\ub2c4\ub2c9\ub2c6\ub2a4\ub2df\ub2bd\ub2fb\ub2d4\ub2cb\ub2de\ub284\ub2c2\u7de9\u7de1\u7de0\u7dc7\u7de9\u7d18\u7d18\u7d0f\u7d09\u7dfb\u7d83\u7d12\u7dee\u7de0\u7dea\u7dc4\u7de6\u7def\u7df8\u7d0f\u7dc1\u7dfb\u7dbd\u7dbd\u0427\u0405\u0457\u0456\u0454\u0454\u0456\u043b\u045e\u045b\u043e\u043e\u043e\u0427\u0464\u0464\u043e\u0427\u043b\u0451\u0454\u0460\u040e\u043c\u4a3d\u4a25\u4a7c\u4a5d\u4a05\u4a3f\u4a5d\u4a05\u4a50\u4a5d\u4a30\u4a5c\u4a27\u4a54\u4a73\u4a68\u15a3\u15b9\u15d3\u15ca\u15c8\u15c8\u15ca\u15bf\u15d2\u15df\u15b2\u15b2\u15b2\u15de\u15e4\u15e4\uc762\uc088\uc74f\uc745\uc763\uc76a\uc76b\uc753\u16eb\u16fc\u1617\u1617\u16fb\u16e3\u168d\u161e\u615a\u615e\u6152\u612d\u6159\u613d\u6289\u6289\uaa3d\uaa39\uaa4b\uaa4a\uaa3d\uaa48\uaa27\uaa22\uaa5a\uaa4a\uaa4e\uaa4e\ucdc0\ucdf4\ucd1a\ucd1b\ucdc0\ucde5\ucd1e\ucdec\ucd1c\ucde9\ucdf9\ucdb7\u457d\u469d\u469c\u4689\ud515\ud5ad\ud50a\ud5f0\ud514\ud513\ud5a5\ud5a5\u9dc2\u9d1c\u9dfa\u9d19\u9dcd\u9dff\u9dc3\u9db1\u5e34\u5e54\u5e55\u5e50\u5e34\u5e5d\u5e5d\u5e2e\u5e2c\u5e32\u5e7b\u5e78\u2830\u2820\u2841\u2848\uc3bf\uc3d5\uc387\uc3ac\uc3bf\uc3dd\uc3ab\uc3a1\uc3dc\uc3b2\uc3e8\uc3e8\ued3a\ued72\ued05\ued57\ued3b\ued30\ued3d\ued02\ued52\ued30\ued6a\ued6a\uebd1\ueb83\uebc9\uebaa\uebde\uebc8\uebd1\uebba\ueb8d\uebb6\uebd2\uebbf\u4e5c\u4e3c\u4e65\u4e04\u4e5c\u4e4f\u4e65\u4e3f\u4e38\u4e2e\u4e59\u4e3b\u4e2f\u4e4f\u4e61\u4e61\u3160\u3168\u3172\u3173\u08fe\u081f\u08e1\u08ec\u4b1e\u4bc6\u4bcc\u4bc2\u5448\u540d\u543b\u5439\u8fbe\u8fa6\u8fac\u8fdb\u1a9f\u197e\u1974\u1973\u8b3e\u8b26\u8b2c\u8b2c\u158a\u1443\u1445\u1445\u8aed\u8af5\u8af3\u8afe\u277a\u2093\u2095\u2094\u42e2\u42ea\u42f0\u42fd\u7c99\u437c\u4376\u436f\uf982\uf9ca\uf9d0\uf9de\uea98\ue97d\ue96b\ue969\u5076\u506e\u5064\u5063\uf800\uf855\uf853\uf854\u7626\u763e\u7634\u7634\u3b32\u3b5b\u3b2d\u3b2d\ub0ee\ub0f6\ub0fc\ub0fd\u8526\u8537\u8529\u8528\ud9d9\ud9b1\ud9af\ud9b6\ud8da\ud8b3\ud8b5\ud8a8\u4d90\u4c78\u4c42\u4c4c\u281a\u28f3\u28f5\u28ef\u69b0\u69d8\u69a2\u69d9\ud30c\ud349\ud357\ud348\u6dc7\u6d0f\u6d11\u6d11\ua396\ua247\ua279\ua279\ub461\ub469\ub477\ub472\ud0a3\ud0aa\ud0b0\ud0b1\u607c\u6060\u6047\u6199\ued77\ued6d\uee99\ued63\ued70\ued64\ued00\ued00\u134f\u1323\u1331\u133c\u134f\u133d\u1305\u132b\u608b\u6767\u677d\u6770\u608b\u6772\u6779\u676f\u677f\u676e\u609e\u6724\ufdd6\ufdab\ufda1\ufdbe\uf21a\uf2de\uf2e5\uf2ce\u68a6\u6811\u68bf\u68a3\u68db\u68a5\u681d\u680a\u66ad\u66bd\u66d3\u66b3\u252f\u2501\u2523\u2532\u2535\u2527\u2523\u2537\u252e\u2522\u2546\u2546\u2839\u283e\u2820\u285d\u73d8\u73d3\u73d7\u7387\u13bc\u13fb\u13a1\u13d9\u13bc\u13d8\u13b3\u13da\u13d8\u13b6\u13cc\u13cc\uc825\uc839\uc80d\uc83e\uc858\uc831\uc988\uc831\ufbce\ufbb5\ufb17\ufbe3\ufbc7\ufbf4\ufbaa\ufb14\ufb11\ufb1a\ufbbe\ufbbe\u571c\u57f0\u57d9\u57c4\u5713\u57e2\u571a\u57f4\u57ff\u57f9\u57d7\u57f6\u57ef\u57c0\u57fd\u57ad\ue112\ue1fe\ue1db\ue1fa\ue111\ue119\ue1e4\ue10b\ue1fb\ue1eb\ue1a7\ue1a7\u579f\u566b\u5665\u567f\u5666\u564e\u5791\u5670\u4ac5\u4a0f\u4a13\u4ac2\u4ac5\u4ae2\u4ae9\u4a0f\u4a17\u4ae2\u4ab6\u4ab6\u65c0\u651e\u65ab\u65fb\u65c7\u6516\u65f4\u6509\u650b\u65f9\u65f9\u65b7\u3049\u3062\u302f\u3023\u3056\u3055\u3055\u303b\u3000\u3003\u303c\u3053\u303c\u300e\u319a\u319a\u12b9\u12fe\u12d0\u12d0\u1285\u12d0\u12f2\u12f5\u069c\u057d\u054c\u068a\u0691\u0574\u056e\u054c\u0544\u0575\u0521\u0521\ufa34\ufa58\ufa3f\ufa21\u33cc\u3312\u3316\u3310\u33c3\u330f\u33b3\u33b3\u8916\u89e2\u89fc\u89f1\u8916\u89f0\u89f8\u89ea\uca8b\uc967\uc97d\uc970\uca8b\uc972\uc979\uc96f\uc97f\uc96e\uca9e\uc924\u893f\u895a\u893c\u8927\ufdef\ufd83\ufdf4\ufd13\uc229\uc24e\uc254\uc230\uc228\uc22a\uc242\uc245\uc9d2\uc982\uc9a0\uc980\ufeff\ufef1\ufe13\ufec2\ufec5\ufe17\ufe13\ufec7\ufe1e\ufe12\ufeb6\ufeb6\u182f\u180c\u1852\u1823\u9d70\u9d7b\u9d7f\u9e8f\u574a\u5761\u573b\u5703\u574a\u570e\u5749\u570c\u570e\u5750\u509a\u509a\u5e08\u5ef4\u5ef0\u5ec7\u5e15\u5ecc\u5ea5\u5ecc\ufce2\ufcc9\ufcf3\ufcc7\ufce3\ufc08\ufcd6\ufce8\ufcfd\ufcc6\ufcd2\ufcd2\u9bba\u9ba6\u9bf3\u9bd2\u9bb9\u9bb4\u9bbc\u9ba2\u9bdd\u9bd3\u9bc5\u9ba0\u9bad\u9bd6\u9bdf\u9bef\uc7ca\uc7b6\uc7e3\uc782\uc7c9\uc7a1\uc7ac\uc7d3\uc783\uc7b3\uc71f\uc71f\ub7f0\ub7ec\ub7fe\ub710\ub7fd\ub715\ub7fa\ub71f\u34e7\u34fd\u34e9\u34e4\u34e7\u34c4\u3413\u34fd\u34f5\u34c4\u34d0\u34d0\ue92f\ue925\ue94c\ue93c\ue928\ue92d\ue903\ue922\ue92c\ue932\ue932\ue978\ubf3e\ubf45\ubf5c\ubf38\ubf31\ubf32\ubf32\ubf20\ubf5b\ubf58\ubf4f\ubf28\ubf4f\ubf59\ubf4d\ubf4d\uaac9\uaaee\uaa80\uaa80\uaad5\uaa80\uaae2\uaae5\u0108\u01e9\u01f8\u011e\u0115\u01f0\u011a\u01f8\u01c0\u01f1\u01a5\u01a5\u1ec5\u1e09\u1eea\u1e10\u25c0\u251e\u250a\u251c\u25c7\u250b\u25b7\u25b7\u93d3\u93df\u93b5\u93a8\u93d3\u93a9\u9381\u93b7\ucf6d\uc889\ucf7b\ucf7a\ucf6d\ucf78\ucf77\ucf41\ucf71\uc894\ucf64\ucf5e\ub5fe\ub513\ub5f9\ub516\ufffb\uffb7\ufff8\uffe7\ue44f\ue46c\ue436\ue452\ue44a\ue448\ue460\ue59b\u193e\u192e\u190c\u192c\u71cb\u71ad\u7187\u71de\u71c9\u7183\u7187\u71d3\u7182\u718e\u711a\u711a\ueff4\uefc7\uef1d\uefe0\u345d\u345a\u3426\u3436\udf58\ud897\udf35\udf3d\udf58\udf3c\udf5f\udf3e\udf3c\udf22\ud888\ud888\u7b02\u7b2e\u7b5a\u7b49\u7b03\u7b56\u7b73\u7b56\u9843\u9834\u9992\u986e\u9842\u9875\u982f\u9995\u9990\u999f\u9833\u9833\u32ac\u3280\u3209\u32b4\u32a3\u32d2\u32ca\u3284\u32af\u32a9\u32e7\u3286\u32bf\u32b0\u328d\u321d\u4f15\u4fe9\u4fa0\u4fcd\u4f16\u4fee\u4fe7\u4f10\u4fc0\u4ff0\u4fa4\u4fa4\u0ef7\u0ee3\u0efd\u0e17\u0efe\u0e16\u0ef9\u0e18\u2af8\u2a16\u2a12\u2ac3\u2af8\u2ae3\u2af4\u2a16\u2a1e\u2ae3\u2aaf\u2aaf\ue91c\ue9c2\ue9df\ue90f\ue913\ue9fa\ue918\ue9c5\ue9ff\ue915\ue915\ue9a3\ue5cf\ue5e0\ue5a9\ue5ad\ue5d4\ue5cb\ue5cb\ue585\ue582\ue58d\ue5be\ue5dd\ue5be\ue58c\ue518\ue518\ua569\ua50e\ua560\ua560\ua575\ua560\ua502\ua505\uff59\uff38\uff29\uff23\uff24\uff01\uff4f\uff29\uff31\uff00\uf894\uf894\u11dd\u1187\u111a\u11ca\u11de\u11bf\u11d9\u1184\u11ba\u11d4\u11d4\u11ee\uc9c0\uc9ec\uc918\uc90f\uc9cd\uc914\uc9bd\uc914\u70ea\u70e6\u70f4\u700a\u70eb\u7013\u70c0\u70e1\u9916\u99a1\u99c3\u99c3\u990a\u99c3\u99ad\u99da\u0b54\u0b63\u0b39\u0b01\u0b54\u0b00\u0b4b\u0b02\u0b00\u0b5e\u0b64\u0b64\ud980\ud9de\ud9ca\ud9bb\ud980\ud9db\ud9bc\ud9de\ud9d6\ud9db\ud9f7\ud9f7\ub97a\ub966\ub933\uba92\ub979\ub971\ub97c\ub943\uba93\ub963\ub92f\ub92f\uf589\uf46e\uf462\uf472\u788a\u7f6d\u7f77\u7f4e\ub2a5\ub21e\ub2bb\ub2d7\ub2da\ub2d9\ub2d9\ub2af\ub2bc\ub2b7\ub280\ub2a7\ub280\ub2b2\ub216\ub216\ua8e9\ua808\ua819\ua8f3\ua8f4\ua811\ua8ff\ua819\ua8e1\ua810\ua884\ua884\u4aec\u4acb\u4af1\u4acd\u4ae1\u4a16\u4ac8\u4af6\u4af7\u4af8\u4adc\u4adc\ufd47\ufd69\ufe8b\ufd7a\ufd4d\ufe8f\ufe8b\ufd7f\ufe96\ufe8a\ufd3e\ufd3e\u3da3\u3d87\u3d0a\u3dab\u3dac\u3dd1\u3dc9\u3dbb\u3da8\u3daa\u3de0\u3d85\u3db8\u3db7\u3d8e\u3d1e\ud436\ud426\ud404\ud424\u69fa\u691f\u69fd\u69e2\u8629\u860d\u8657\u865e\u8629\u8653\u865b\u8655\u2768\u274c\u2092\u2093\u2768\u209d\u2766\u2094\u2764\u2741\u2771\u273f\u2882\u28f6\u288d\u28a6\u2eba\u2efd\u2edb\u2e87\u2ebf\u2eb9\u2ef1\u2ef6\ue2f8\ue214\ue2eb\ue21d\u75d2\u758c\u75b8\u758e\u75d1\u7585\u75e1\u75e1\u83cd\u83b5\u8314\u8319\u83c0\u83eb\u83bd\u83bd\u7d81\u7dba\u7da5\u7da5\u7db1\u7dc9\u7def\u7dd8\u7da7\u7db7\u7dce\u7ddb\u7dd9\u7daa\u7dba\u7dfc\u2e65\u2e6e\u2e41\u2e41\u2f95\u2e7d\u2e53\u2e4c\u2e7b\u2f92\u2f95\u2e4c\u2e7b\u2f9e\u2e53\u2e48\u65f7\u65e8\u650b\u650b\u65c7\u651f\u65b9\u650a\u6511\u65c1\u6511\u651c\u6511\u651e\u65c4\u658e\u3acf\u3ad0\u3ab3\u3ab3\u3adf\u3a87\u3ae1\u3ab2\u3aa9\u3aac\u3a14\u3ab7\u3ab0\u3aa0\u3aed\u3ae6\uc7ee\uc7ab\uc7d1\uc787\u652f\u6565\u657a\u6688\u6528\u669a\u653e\u653e\ud34b\ud30e\ud32c\ud32a\ud32c\ud336\ud35c\ud33a\u9396\u923b\u9397\u9397";
        char[] cArray = "\u073d\u0731\u073d\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u073d\u0739\u073d\u0731\u0739\u0731\u0731\u0731\u073d\u0731\u0731\u0739\u073d\u073d\u0739\u0739\u073d\u0739\u073d\u0725\u0739\u0725\u0719\u0721\u0729\u0729\u0729\u0725\u072d\u072d\u0725\u0725\u073d\u073d\u073d\u0739\u0739\u0731\u073d\u073d\u0739\u0731\u0739\u0739\u0739\u0725\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u0731\u073d\u073d\u0739\u0731\u0731\u073d\u0731\u0739\u0731\u0731\u0739\u073d\u0739\u0725\u0739\u073d\u0739\u0739\u0725\u073d\u0739\u0731\u073d\u073d\u0739\u0731\u0731\u073d\u0731\u0739\u0731\u0731\u0739\u073d\u0739\u0725\u0739\u073d\u0739\u0739\u0725\u073d\u0739\u0731\u073d\u073d\u0739\u0731\u0731\u073d\u0731\u0739\u0731\u0731\u0739\u073d\u0739\u0725\u0739\u073d\u0739\u0739\u0725\u073d\u0739\u0739\u073d\u073d\u073d\u0739\u0739\u0739\u0731\u0731\u0725\u0739\u0739\u0739\u0725\u0731\u0731\u073d\u0739\u0731\u073d\u0731\u073d\u073d\u0725\u0725\u0725\u0725\u0731\u073d\u073d\u0731".toCharArray();
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
        IIllI = stringArray;
        IIlll = new Object[stringArray.length];
        int n6 = 893473004;
        byte[] byArray = "%#t\\\u001a%{\u00dc\u00ac\u00c7g{\u00f4\u0092W\u00ab\u00ee\u00ecS\u0095$F\u00ba\u00d5\u00a3\u0083\u00d9L\u0002uO\u00ab\u0015d\u000eUg\u008e\u00d5\u00b7\t>\u0082\u00a4\u008bwv\u00f3N\u00d2\u00a5\u00d4\u00af\u00a3f\u00e5 \u00c6\u000f\u00a6[\u00f0\u009d\u00b5\u00db\u00b2\\F\u008f\u00ad\u0083\u00eb\u009a=\u000e\u00a0\u00f7\u00bf\u00efQM\u00d0)1\u00075\u00c5\t\u00fb\u00b9e\u00afU\u00b8\u00a7C\u00a9\u000b\u00bf\u0090[i\u0006\u00e3jY\u00df~\u00d5\u00ecw#\u0007N\u00d2fw\u00ae\u0081M\u00afX\u000e\u00e6J(\u0001\u00b9R~\u00ab\u008cn\u00da\u0015\u001bs|p^\u0010\u00fb\u00b4\u00b6\u00a9\u00c4\u00fa\u00a1\u0012\u00f6t*\tu\u008biq\u00f6\u001c\u0013\u00e7\u0002|\u0018\u00f4\u0013)\u00fa\u00b2N`\u00bd72\u009d\u00e8.\u0086\u0086\u00ae\u0081Q\u00f2p\u0082\u00d68\u00e6\u0006r\u00dfJ\u00ea\rfR'[z\f\u00c5\u00fd\u00b0\u00e4!\u00ee\u00b3\u0006C\f7\u00c5%@[v\u00af\u001f\u008bgH\u00f6dl\u00e6\u009a\u00ff\u00fe\u0098#\u0012r\u001e\u00fe\u00a5\u00f7\u00e5\u0089\u00e1\u00fb\u00b7\u00fe\u0010I\u001cJ\u001b?O\u00e26\u0015\re\u000b$Ec\u00e0\u0003#\u009e\u00bd\u00a8)\u0083\u00e3\u0017 @\u00ee+f\u00ab\u00ad=\u00baQG7\rI\u00ea_L<\u00b3\u00dbV_h\u00c8\u00e3\u0088J\u00c3\u0080jN\u00ce\u00dfjoQ\u00f2+\u00f6\u001eI)T\u008fs\u0018*\u00e3\u0082\u00dd?\u0003`\u00be\u00ac\u00cc\u00fbM\u00d5\u00b0x\u00f3\u00d32\u0089\u00d3T\u00cf_\u0090\u00d8\u00e2\u00e1\u00e3(/\u0099%\u00a0|Pl\u00c5k%\u00815\u00f0\u009e>\u00c7\u001as\u0085z~^\f\u00c89\u00b8\u00e6S(S9\u00c8\u00c5\u00b8\u00eb\u00878d\u0003\u00afa\u00dfq[\t=b\u00d8\u0084\u00952\u008c\u008b\u00c6_Am`\u001aJ~\u0087\u00bb\u00da\u00bf\u00d0\u009d\u008cq\u008c\u0093|\u00d8\u009b\u0089\u00f6V1\u00d5\u00a9\u00da\u000e\u009ca2\u00da\u001df$\bT\u00d0BCr\u0014z\u00fel\u00e4\u00c5\u00a4Q ]\r\u008f\u009f\u00e7\u001b\u00ce3,\u00dd\u00acz\u0086\"\u00fe~\u0097-\u00dd&1\\_\u001b\u00dc\u001fR\u0080\b\n\u00c5\u00cf\u00f5D^\u00fe|3i\u00eb\u00ad \u0005\u00bd\u000f\u00e3\u000e+ \u00db\u00b2\u0097\u00eb\u00189\u0014\u0004;\u001d\u0084DL\u0081Wb\u0018]Py\u0082i\u001c9W\u0010!bv\u008d}\u00a7#\u0087<W$~h\u00cf\u00f3\u00e0\u008c\u0002\u009c\u00a2\u00ce\u00d7X\u000bh~3\u0083\u000bB{\u0088\u00cf\u00c0\u00caYF\u00b0\u00b3j\u009d\u00fb\u00ca.\u00df\u0091\u00bd\u001fK\u00c4\u00f2\u00ec\u009ak<\u00dcl<\u0092h$ \u00fd\u00b7\u008cWP\u009bu=<!H#\u008a\u009f\u00df\u0082m7\u0082AW9)!2\u00d8\u0013\u00d8\u0080!\u001b\u0086\u00ab)\u0000\u00ea\u007fU\u00835A\u008fW\u00af\u00e8\u00b4\u00cf\u000b\u00ceR\u00df\u00d0\u009a\u00ee@mT\u00b4\u0012*\u00eeW=\u008c\u00bc\u00e5\u008a\u001a\u00ca\u00a4\u00e4\u00c8\u00c5\u00df\u0018I\u00f5\u00f1\u00d4\u0086\u00b2\u00efis\u00fbu\u00df\u008ey]\u0010\u0091\u0086a\u00a3-\u008fvF\u00c1K\u00c4\u00c2\u001c.~V\b\u009ep\u001e\u00d8\u0010\u0090\u0006l\u0082N\u007f5|\u00e8\u00f4Y\u0012}Hvg\u00d13\u00a6\u00a7\u00a85\u00da\u00b6\u0084\u00c8:\u00d0\u0001\u0097\u00a7\u00c9\u0015\u00a9\u0092W\u0011t\u00cd+\u00e1\u00f126he\u0081\u009aG.\"\u00f0\u00d4\u00b1\u0005K\u0094f\u0006\u00f7m2\u00cb\u0082\u00ee>=\u0084Fo\u00c92\u00bd0\u00d8\u00aei\u00c6\u00f0\u00d2\u00cf\u00b0F\u0003\u0002\u000b\u00b4\u0018\u00cdx\u0099\u00cfIe\u00b1e\u00d0\u00f8\u0011nE\u0099\u00a1\u0095DI\u00ab\u0096\u000b\u00bc\u00cc>~\u00f5\u00fe\u008bkxR\u00c1\u007fH\rlS\u00dd\u00cf\u00bb\u00c8\u0089dr\u00c47\u001d\u00a55\u00f8\u0091z\u0093\u00b8\u00a0\u00c95\nbWX\u009b\u00a8=\u00d6\u00fe\u00b86j\u00d9\u00bc\u00f5F\u008a\u00e3\u00df\u00a4F\u00d6M\u00c7AXe\u00f6\u00ce\u009b6[pS\u008c\u00a3/x\"/\u00fdb\u00eb\u00acX\u00f8h(T\u008b\u0001\u00d8\u00f35\u0081t\u00ab\u00b2\u00c6\u00fd\u008e\u00fa\u00ac\u008c\u00acYv\u001b)l\u009ee\u00d0\u00e9JV\u00fb\u00f9\u0082u(\u00a2\u00aaW\u00c3\u00b7\u0005\rCj\u00c27\u00a0\u0005l\u00e1 \rH` \u00b0\u00e7\u00aeM\b".getBytes("ISO-8859-1");
        int n7 = byArray.length / 4;
        IIlIl = new int[n7];
        int n8 = 0;
        int n9 = 0;
        do {
            int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
            IIIIlI.IIlIl[n9] = n10 ^= n6;
            n8 += 4;
        } while (++n9 < n7);
        lIlI = IIIIlI.lIll(StringFactory.IIII("tptamQ=="), StringFactory.IIII("HT1"), StringFactory.IIII("LT1"), StringFactory.IIII("HT2"), StringFactory.IIII("tKAG"), StringFactory.IIII("HT3"), StringFactory.IIII("LT3"), StringFactory.IIII("HT4"), StringFactory.IIII("tKAA"), StringFactory.IIII("HT5"), StringFactory.IIII("LT5"));
        IIl = IIIIlI.lIll(StringFactory.IIII("tptamQ=="), StringFactory.IIII("Vanilla"), StringFactory.IIII("Sword"), StringFactory.IIII("uYxR"), StringFactory.IIII("Crystal"), StringFactory.IIII("Pot"), StringFactory.IIII("UHC"), StringFactory.IIII("q7lk"), StringFactory.IIII("Mace"), StringFactory.IIII("Bed"), StringFactory.IIII("Bow"), StringFactory.IIII("u4ZRmQlSQg=="), StringFactory.IIII("Debuff"), StringFactory.IIII("Elytra"), StringFactory.IIII("tZValAxZRA=="), StringFactory.IIII("Minecart"), StringFactory.IIII("Speed"), StringFactory.IIII("rIZdmBxZRA=="), StringFactory.IIII("Nethop"), StringFactory.IIII("Dia Crystal"), StringFactory.IIII("vJ1V3Cp6YA=="), StringFactory.IIII("OG Vanilla"));
        IlI = IIIIlI.lIll(StringFactory.IIII("rZ9B3CpDSRCSSNd2HdrZl5aVWNwtXlUOgwmYXgrBlw=="), StringFactory.IIII("qIJkqBBSQg/XO4tAA9Y="));
        lII = IIIIlI.lIll(StringFactory.IIII("u5hVjwpeU1ykHIZVCpP3nZeaRw=="), StringFactory.IIII("qIJkqBBSQg/XO4tAA9ba3rGXW5IK"), StringFactory.IIII("tbdglRxFQ1ykHIZVCteet5ubWo8="));
        IllI = IIIIlI.lIll(StringFactory.IIII("rZ9B3D1SVh2CBIs="), StringFactory.IIII("PvPTiers Default"), StringFactory.IIII("tZdkiikXcxCCCt99CtXfi5SA"));
        lIIl = IIIIlI.lIll(StringFactory.IIII("rJ1RjlRjURuQDY0="), StringFactory.IIII("McPvP Club"));
        lI = StringFactory.IIII("virel");
        l = StringFactory.IIII("u5q1d7");
        IIll = StringFactory.IIII("none");
        I = StringFactory.IIII("neth_op");
        II = StringFactory.IIII("neth_pot");
        IIIII = StringFactory.IIII("pvp");
        llIl = StringFactory.IIII("club");
        lll = StringFactory.IIII("mcpvp");
        llI = StringFactory.IIII("pvptiers");
        IIlI = StringFactory.IIII("uku");
        IlII = StringFactory.IIII("mctiers");
        IIIIl = StringFactory.IIII("classic");
        IIIll = StringFactory.IIII("mcpvpclub");
        llII = StringFactory.IIII("tiertagger");
        lIll = Map.ofEntries(IIIIlI.IlII(StringFactory.IIII("sKAF"), 15252026), IIIIlI.IlII(StringFactory.IIII("LT1"), 14005077), IIIIlI.IlII(StringFactory.IIII("sKAG"), 12899303), IIIIlI.IlII(StringFactory.IIII("LT2"), 10528690), IIIIlI.IlII(StringFactory.IIII("sKAH"), 16293722), IIIIlI.IlII(StringFactory.IIII("LT3"), 13007682), IIIIlI.IlII(StringFactory.IIII("sKAA"), 8483994), IIIIlI.IlII(StringFactory.IIII("LT4"), 6642553), IIIIlI.IlII(StringFactory.IIII("sKAB"), 9405096), IIIIlI.IlII(StringFactory.IIII("LT5"), 6642553));
        IIII = Map.ofEntries(IIIIlI.IlII(StringFactory.IIII("sKAF"), 16109133), IIIIlI.IlII(StringFactory.IIII("LT1"), 16109133), IIIIlI.IlII(StringFactory.IIII("sKAG"), 12570070), IIIIlI.IlII(StringFactory.IIII("LT2"), 12570070), IIIIlI.IlII(StringFactory.IIII("sKAH"), 11560019), IIIIlI.IlII(StringFactory.IIII("LT3"), 11560019), IIIIlI.IlII(StringFactory.IIII("sKAA"), 10498621), IIIIlI.IlII(StringFactory.IIII("LT4"), 10498621), IIIIlI.IlII(StringFactory.IIII("sKAB"), 0xBCBBC1), IIIIlI.IlII(StringFactory.IIII("LT5"), 0xBCBBC1));
        IIlII = Map.ofEntries(IIIIlI.IlII(StringFactory.IIII("sKAF"), 15974194), IIIIlI.IlII(StringFactory.IIII("LT1"), 13807956), IIIIlI.IlII(StringFactory.IIII("sKAG"), 12899303), IIIIlI.IlII(StringFactory.IIII("LT2"), 7368302), IIIIlI.IlII(StringFactory.IIII("sKAH"), 14320204), IIIIlI.IlII(StringFactory.IIII("LT3"), 12088115), IIIIlI.IlII(StringFactory.IIII("sKAA"), 8483994), IIIIlI.IlII(StringFactory.IIII("LT4"), 6642553), IIIIlI.IlII(StringFactory.IIII("sKAB"), 9405096), IIIIlI.IlII(StringFactory.IIII("LT5"), 6642553));
        llll = Map.ofEntries(IIIIlI.IlII(StringFactory.IIII("mYxR"), 5569620), IIIIlI.IlII(StringFactory.IIII("mace"), 0xA8A8A8), IIIIlI.IlII(StringFactory.IIII("lpFAlBZH"), 8145215), IIIIlI.IlII(StringFactory.IIII("neth_pot"), 8145215), IIIIlI.IlII(StringFactory.IIII("iJtA"), 0xFC0000), IIIIlI.IlII(StringFactory.IIII("smp"), 15321412), IIIIlI.IlII(StringFactory.IIII("i4Nbjh0="), 10681069), IIIIlI.IlII(StringFactory.IIII("uhc"), 16274259), IIIIlI.IlII(StringFactory.IIII("jpValRVbUQ=="), 16536828), IIIIlI.IlII(StringFactory.IIII("bed"), 11677737), IIIIlI.IlII(StringFactory.IIII("mptD"), 9597277), IIIIlI.IlII(StringFactory.IIII("creeper"), 6864774), IIIIlI.IlII(StringFactory.IIII("nJFWiR9R"), 15518533), IIIIlI.IlII(StringFactory.IIII("crystal"), 16536828), IIIIlI.IlII(StringFactory.IIII("nJ1VoxpFSQ+DCZM="), 16536828), IIIIlI.IlII(StringFactory.IIII("dia_smp"), 7689354), IIIIlI.IlII(StringFactory.IIII("nZhNiAtW"), 7632308), IIIIlI.IlII(StringFactory.IIII("manhunt"), 0x424242), IIIIlI.IlII(StringFactory.IIII("lZ1amRpWQgg="), 14369818), IIIIlI.IlII(StringFactory.IIII("og_vanilla"), 15382608), IIIIlI.IlII(StringFactory.IIII("i4RRmR0="), 7193805), IIIIlI.IlII(StringFactory.IIII("trident"), 4363646));
        III = Map.ofEntries(IIIIlI.IlII(StringFactory.IIII("mYxR"), 9328155), IIIIlI.IlII(StringFactory.IIII("mace"), 6647684), IIIIlI.IlII(StringFactory.IIII("lpFAlBZH"), 4795506), IIIIlI.IlII(StringFactory.IIII("neth_pot"), 4795506), IIIIlI.IlII(StringFactory.IIII("iJtA"), 10817857), IIIIlI.IlII(StringFactory.IIII("smp"), 1136463), IIIIlI.IlII(StringFactory.IIII("i4Nbjh0="), 179406), IIIIlI.IlII(StringFactory.IIII("uhc"), 15794179), IIIIlI.IlII(StringFactory.IIII("jpValRVbUQ=="), 14837759), IIIIlI.IlII(StringFactory.IIII("bed"), 11611944), IIIIlI.IlII(StringFactory.IIII("mptD"), 9531484), IIIIlI.IlII(StringFactory.IIII("creeper"), 9035657), IIIIlI.IlII(StringFactory.IIII("nJFWiR9R"), 14922038), IIIIlI.IlII(StringFactory.IIII("crystal"), 14837759), IIIIlI.IlII(StringFactory.IIII("nJ1VoxpFSQ+DCZM="), 14837759), IIIIlI.IlII(StringFactory.IIII("dia_smp"), 9332108), IIIIlI.IlII(StringFactory.IIII("nZhNiAtW"), 0x8B8CC8), IIIIlI.IlII(StringFactory.IIII("manhunt"), 0x424242), IIIIlI.IlII(StringFactory.IIII("lZ1amRpWQgg="), 14369818), IIIIlI.IlII(StringFactory.IIII("og_vanilla"), 15316816), IIIIlI.IlII(StringFactory.IIII("i4RRmR0="), 7193805), IIIIlI.IlII(StringFactory.IIII("trident"), 4363646));
        Il = Map.ofEntries(IIIIlI.IlII(StringFactory.IIII("mYxR"), 6395353), IIIIlI.IlII(StringFactory.IIII("mace"), 5000283), IIIIlI.IlII(StringFactory.IIII("lpFAlBZH"), 9400997), IIIIlI.IlII(StringFactory.IIII("neth_pot"), 9400997), IIIIlI.IlII(StringFactory.IIII("iJtA"), 14046324), IIIIlI.IlII(StringFactory.IIII("smp"), 1003589), IIIIlI.IlII(StringFactory.IIII("i4Nbjh0="), 7454685), IIIIlI.IlII(StringFactory.IIII("uhc"), 13913680), IIIIlI.IlII(StringFactory.IIII("jpValRVbUQ=="), 13142502), IIIIlI.IlII(StringFactory.IIII("bed"), 11611944), IIIIlI.IlII(StringFactory.IIII("mptD"), 9531484), IIIIlI.IlII(StringFactory.IIII("creeper"), 9035657), IIIIlI.IlII(StringFactory.IIII("nJFWiR9R"), 14922038), IIIIlI.IlII(StringFactory.IIII("crystal"), 13142502), IIIIlI.IlII(StringFactory.IIII("nJ1VoxpFSQ+DCZM="), 13142502), IIIIlI.IlII(StringFactory.IIII("dia_smp"), 9332108), IIIIlI.IlII(StringFactory.IIII("nZhNiAtW"), 0x8B8CC8), IIIIlI.IlII(StringFactory.IIII("manhunt"), 0x424242), IIIIlI.IlII(StringFactory.IIII("lZ1amRpWQgg="), 14369818), IIIIlI.IlII(StringFactory.IIII("og_vanilla"), 15316816), IIIIlI.IlII(StringFactory.IIII("i4RRmR0="), 7193805), IIIIlI.IlII(StringFactory.IIII("trident"), 4363646));
        lIII = Map.ofEntries(IIIIlI.IIIl(StringFactory.IIII("lZ1amRpWQgg="), '\uf000'), IIIIlI.IIIl(StringFactory.IIII("nJFWiR9R"), '\uf002'), IIIIlI.IIIl(StringFactory.IIII("nZhNiAtW"), '\uf003'), IIIIlI.IIIl(StringFactory.IIII("i4RRmR0="), '\uf004'), IIIIlI.IIIl(StringFactory.IIII("m4ZRmQlSQg=="), '\uf005'), IIIIlI.IIIl(StringFactory.IIII("lZValAxZRA=="), '\uf006'), IIIIlI.IIIl(StringFactory.IIII("nJ1VowpaQA=="), '\uf007'), IIIIlI.IIIl(StringFactory.IIII("mptD"), '\uf008'), IIIIlI.IIIl(StringFactory.IIII("mpFQ"), '\uf009'), IIIIlI.IIIl(StringFactory.IIII("l5NrihhZWRCbCQ=="), '\uf00a'), IIIIlI.IIIl(StringFactory.IIII("jIZdmBxZRA=="), '\uf00b'));
        IlIl = Map.ofEntries(IIIIlI.IIIl(StringFactory.IIII("m4ZNjw1WXA=="), '\uf000'), IIIIlI.IIIl(StringFactory.IIII("jpValRVbUQ=="), '\uf000'), IIIIlI.IIIl(StringFactory.IIII("nJ1VoxpFSQ+DCZM="), '\uf000'), IIIIlI.IIIl(StringFactory.IIII("jZxX"), '\uf001'), IIIIlI.IIIl(StringFactory.IIII("iJtA"), '\uf002'), IIIIlI.IIIl(StringFactory.IIII("lpFAlBZH"), '\uf003'), IIIIlI.IIIl(StringFactory.IIII("lpFAlCZHXwg="), '\uf003'), IIIIlI.IIIl(StringFactory.IIII("i5lE"), '\uf004'), IIIIlI.IIIl(StringFactory.IIII("i4Nbjh0="), '\uf005'), IIIIlI.IIIl(StringFactory.IIII("mYxR"), '\uf006'), IIIIlI.IIIl(StringFactory.IIII("lZVXmQ=="), '\uf007'));
        IIIlI = StringFactory.IIII("cats");
        Illl = StringFactory.IIII("u5q1d7/c4n8");
        lllI = StringFactory.IIII("u5q1d7/p7v2");
        Ill = StringFactory.IIII("u5q1d7/m9t3");
        lIl = StringFactory.IIII("u5q1d7/s6b1");
        ll = StringFactory.IIII(" | ");
        IIIl = StringFactory.IIII("2DaS3A==");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static llIllllI II(String string, String string2) {
        llIllllI llIllllI2;
        String string3 = IIIIlI.IIlII(string);
        if (string3.isEmpty()) {
            return new llIllllI('\u2022', IIIIlI.ll(Illl));
        }
        Character c = lIII.get(StringFactory.I(string3));
        if (c == null) {
            llIllllI2 = new llIllllI(IIIIlI.Illl(string3), IIIIlI.IIlIl(string2));
            return llIllllI2;
        }
        llIllllI2 = new llIllllI(c.charValue(), IIIIlI.ll(lIl));
        return llIllllI2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String Il(String string) {
        IIIlIIIII iIIlIIIII;
        String string2 = IIIIlI.IIIII(string);
        if (llI.lII(string2)) {
            return IllI[1].IIII();
        }
        if (!IIIll.lII(string2)) {
            iIIlIIIII = IllI[0];
            return iIIlIIIII.IIII();
        }
        iIIlIIIII = IllI[2];
        return iIIlIIIII.IIII();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String lI(String string) {
        IIIlIIIII iIIlIIIII;
        block1: {
            String string2 = IIIIlI.Ill(string);
            if (llI.lII(string2)) return lII[1].IIII();
            if (!IlII.lII(string2)) break block1;
            iIIlIIIII = lII[2];
            return iIIlIIIII.IIII();
        }
        iIIlIIIII = lII[0];
        return iIIlIIIII.IIII();
    }

    private static Identifier ll(IIIlIIIII iIIlIIIII) {
        return Identifier.of((String)IIIlI.IIII(), (String)iIIlIIIII.IIII());
    }

    public static String III(String string, String string2, String string3, String string4, String string5, String string6, String string7, boolean bl) {
        return IIIIlI.IIl(string, string2, string3, string4, string5, string6, string7, bl).getString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Text IIl(String string, String string2, String string3, String string4, String string5, String string6, String string7, boolean bl) {
        String string8 = IIIIlI.llIl(string).trim();
        if (string8.isEmpty()) {
            string8 = "Player";
        }
        Text text = IlIIIIIll.II(string8);
        MutableText mutableText = Text.empty().append(text);
        String string9 = IIIIlI.IIllI(string2);
        if (!string9.isEmpty()) {
            String string10 = IIIIlI.IIIll(string4);
            lIlIlllI lIlIlllI2 = IIIIlI.IIlll(string10, string9, string6, string7);
            MutableText mutableText2 = Text.empty();
            mutableText2.append(IIIIlI.lII(string9, string3, string10, string5, string6, bl));
            mutableText2.append((Text)Text.literal((String)lIlIlllI2.l().IIII()).setStyle(Style.EMPTY.withColor(TextColor.fromRgb((int)lIlIlllI2.I()))));
            mutableText2.append((Text)mutableText);
            return mutableText2;
        }
        return mutableText;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Map<Long, Integer> IlI(IlIIIIIl ilIIIIIl) {
        Map<Long, Integer> map;
        switch (ilIIIIIl) {
            case Il: {
                map = Il;
                return map;
            }
            default: {
                throw new MatchException(null, null);
            }
            case lI: {
                map = III;
                return map;
            }
            case I: 
        }
        map = llll;
        return map;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String Ill(String string) {
        String string2 = IIIIlI.llIl(string).trim().toLowerCase(Locale.ROOT);
        if (IlII.IIl(string2)) {
            return IlII.IIII();
        }
        if (!IIIII.IIl(string2)) return IIIIl.IIII();
        return llI.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static Text lII(String string, String string2, String string3, String string4, String string5, boolean bl) {
        MutableText mutableText;
        int n;
        String string6;
        block2: {
            String string7;
            block3: {
                block1: {
                    string6 = IIIIlI.IIllI(string);
                    if (string6.isEmpty()) break block1;
                    string7 = IIIIlI.IIIll(string3);
                    n = IIIIlI.IllI(string6, string5);
                    mutableText = Text.empty();
                    if (!bl) break block2;
                    break block3;
                }
                return Text.empty();
            }
            llIllllI llIllllI2 = IIIIlI.II(string2, string4);
            mutableText.append((Text)Text.literal((String)String.valueOf(llIllllI2.I)).setStyle(IIIIlI.IIlI(Style.EMPTY.withColor(TextColor.fromRgb((int)IIIIlI.llll(string6, string2, string4, string5))), llIllllI2.l)));
            if (llI.lII(string7)) {
                mutableText.append((Text)Text.literal((String)" "));
            }
        }
        mutableText.append((Text)Text.literal((String)string6).setStyle(Style.EMPTY.withColor(TextColor.fromRgb((int)n))));
        return mutableText;
    }

    public static int lIl(String string) {
        return IIIIlI.lIII(string, IIIIl.IIII());
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int llI(IIIIIlllI iIIIIlllI, llllII llllII2, IlIIIIIl ilIIIIIl, llIIIlIl llIIIlIl2) {
        if (ilIIIIIl != IlIIIIIl.I) {
            return 0xFFFFFF;
        }
        if (llIIIlIl2 == llIIIlIl.II) {
            return IIIIlI.lllI(llIIIlIl2).getOrDefault(iIIIIlllI.II().llII(), 0xD3D3D3);
        }
        IlIIIIIl ilIIIIIl2 = llIIIlIl2 == llIIIlIl.I ? IlIIIIIl.lI : IlIIIIIl.I;
        long l2 = llllII2 == null ? 0L : llllII2.II().lIl();
        return IIIIlI.IlI(ilIIIIIl2).getOrDefault(l2, 0xFFFFFF);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static lIlIlllI lll(IIIIIlllI iIIIIlllI, IIIllllI iIIllllI, llIIIlIl llIIIlIl2, IlIlIlll ilIlIlll) {
        int n;
        if (ilIlIlll == IlIlIlll.II) {
            return new lIlIlllI(IIIl, 0xACA9AC);
        }
        int n2 = IIIIlI.lllI(llIIIlIl2).getOrDefault(iIIIIlllI.II().llII(), 0xD3D3D3);
        if (iIIllllI == IIIllllI.l) {
            n = n2;
            return new lIlIlllI(ll, n);
        }
        n = 0xAAAAAA;
        return new lIlIlllI(ll, n);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Map<Long, Integer> IIII(String string) {
        Map<Long, Integer> map;
        String string2 = IIIIlI.Ill(string);
        if (llI.lII(string2)) return III;
        if (!IlII.lII(string2)) {
            map = llll;
            return map;
        }
        map = Il;
        return map;
    }

    private static Map.Entry<Long, Character> IIIl(IIIlIIIII iIIlIIIII, char c) {
        return Map.entry(iIIlIIIII.llII(), Character.valueOf(c));
    }

    private static Style IIlI(Style style, Identifier identifier) {
        if (style != null && identifier != null) {
            return style.withFont((StyleSpriteSource)new StyleSpriteSource.Font(identifier));
        }
        return style;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String IIll(String string) {
        IIIlIIIII iIIlIIIII;
        if (llI.lII(IIIIlI.IIIll(string))) {
            iIIlIIIII = IlI[1];
            return iIIlIIIII.IIII();
        }
        iIIlIIIII = IlI[0];
        return iIIlIIIII.IIII();
    }

    private static Map.Entry<Long, Integer> IlII(IIIlIIIII iIIlIIIII, int n) {
        return Map.entry(iIIlIIIII.llII(), n);
    }

    /*
     * Enabled aggressive block sorting
     */
    static boolean IlIl(Style style) {
        if (style == null) return false;
        if (style.getFont() == null) return false;
        String string = style.getFont().toString();
        if (!lI.IIl(string)) return false;
        if (l.IIl(string)) return true;
        return false;
    }

    public static int IllI(String string, String string2) {
        return IIIIlI.l(string2).getOrDefault(StringFactory.I(IIIIlI.IIllI(string)), 0xD3D3D3);
    }

    private static char Illl(String string) {
        return IlIl.getOrDefault(StringFactory.I(string), Character.valueOf('\u2022')).charValue();
    }

    public static int lIII(String string, String string2) {
        return IIIIlI.IIII(string2).getOrDefault(StringFactory.I(IIIIlI.IIlII(string)), 0xFFFFFF);
    }

    public static int lIIl(String string) {
        return IIIIlI.IllI(string, IIlI.IIII());
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String lIlI(String string) {
        String string2 = IIIIlI.llIl(string).trim().toLowerCase(Locale.ROOT);
        if (llIl.IIl(string2)) return IIIll.IIII();
        if (!lll.IIl(string2)) return llII.IIII();
        return IIIll.IIII();
    }

    private static IIIlIIIII[] lIll(IIIlIIIII ... iIIlIIIIIArray) {
        return (IIIlIIIII[])iIIlIIIIIArray.clone();
    }

    /*
     * Enabled aggressive block sorting
     */
    private static llIllllI llII(llllII llllII2, IlIIIIIl ilIIIIIl) {
        if (llllII2 == null) return new llIllllI('\u2022', IIIIlI.ll(Illl));
        if (llllII2 != llllII.Illl) {
            llIllllI llIllllI2;
            long l2 = llllII2.II().lIl();
            Character c = lIII.get(l2);
            if (c == null) {
                llIllllI2 = new llIllllI(IlIl.getOrDefault(l2, Character.valueOf('\u2022')).charValue(), IIIIlI.IIIIl(ilIIIIIl));
                return llIllllI2;
            }
            llIllllI2 = new llIllllI(c.charValue(), IIIIlI.ll(lIl));
            return llIllllI2;
        }
        return new llIllllI('\u2022', IIIIlI.ll(Illl));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String llIl(String string) {
        if (string == null) {
            return "";
        }
        String string2 = string;
        return string2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static Map<Long, Integer> lllI(llIIIlIl llIIIlIl2) {
        Map<Long, Integer> map;
        switch (llIIIlIl2) {
            case II: {
                map = IIlII;
                return map;
            }
            case Il: {
                map = lIll;
                return map;
            }
            default: {
                throw new MatchException(null, null);
            }
            case I: 
        }
        map = IIII;
        return map;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int llll(String string, String string2, String string3, String string4) {
        int n;
        String string5 = IIIIlI.Ill(string3);
        String string6 = IIIIlI.IIIII(string4);
        if (!IIIIl.lII(string5)) {
            return 0xFFFFFF;
        }
        if (IIIll.lII(string6)) {
            return IIIIlI.IllI(string, string6);
        }
        if (!llI.lII(string6)) {
            n = IIIIlI.lIII(string2, IIIIl.IIII());
            return n;
        }
        n = IIIIlI.lIII(string2, llI.IIII());
        return n;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String IIIII(String string) {
        String string2 = IIIIlI.llIl(string).trim().toLowerCase(Locale.ROOT);
        if (llIl.IIl(string2)) return IIIll.IIII();
        if (lll.IIl(string2)) {
            return IIIll.IIII();
        }
        if (!IIIII.IIl(string2)) return IIlI.IIII();
        return llI.IIII();
    }

    private IIIIlI() {
    }

    private static Identifier IIIIl(IlIIIIIl ilIIIIIl) {
        return switch (ilIIIIIl) {
            case IlIIIIIl.lI -> IIIIlI.ll(lllI);
            default -> throw new MatchException(null, null);
            case IlIIIIIl.I -> IIIIlI.ll(Illl);
            case IlIIIIIl.Il -> IIIIlI.ll(Ill);
        };
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String IIIlI(String string) {
        IIIlIIIII iIIlIIIII;
        block1: {
            if (!IIIll.lII(IIIIlI.lIlI(string))) break block1;
            iIIlIIIII = lIIl[1];
            return iIIlIIIII.IIII();
        }
        iIIlIIIII = lIIl[0];
        return iIIlIIIII.IIII();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String IIIll(String string) {
        IIIlIIIII iIIlIIIII;
        String string2 = IIIIlI.llIl(string).trim().toLowerCase(Locale.ROOT);
        if (IIIII.IIl(string2)) {
            iIIlIIIII = llI;
            return iIIlIIIII.IIII();
        }
        iIIlIIIII = IIlI;
        return iIIlIIIII.IIII();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String IIlII(String string) {
        String string2 = IIIIlI.llIl(string).trim().toLowerCase(Locale.ROOT);
        if (string2.isEmpty()) return "";
        if (IIll.lII(string2)) {
            return "";
        }
        if (I.lII(string2 = string2.replace(' ', '_'))) {
            string2 = II.IIII();
        }
        if (!llll.containsKey(StringFactory.I(string2))) return "";
        String string3 = string2;
        return string3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static Identifier IIlIl(String string) {
        String string2 = IIIIlI.Ill(string);
        if (!llI.lII(string2)) {
            Identifier identifier;
            if (!IlII.lII(string2)) {
                identifier = IIIIlI.ll(Illl);
                return identifier;
            }
            identifier = IIIIlI.ll(Ill);
            return identifier;
        }
        return IIIIlI.ll(lllI);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String IIllI(String string) {
        String string2 = IIIIlI.llIl(string).trim().toUpperCase(Locale.ROOT);
        if (!lIll.containsKey(StringFactory.I(string2))) return "";
        String string3 = string2;
        return string3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static lIlIlllI IIlll(String string, String string2, String string3, String string4) {
        if (IIIll.lII(IIIIlI.lIlI(string4))) {
            return new lIlIlllI(IIIl, 0xACA9AC);
        }
        int n = IIIIlI.IllI(string2, string3);
        int n2 = llI.lII(IIIIlI.IIIll(string)) ? n : 0xAAAAAA;
        return new lIlIlllI(ll, n2);
    }

    private static int IlIII(int n, int n2) {
        return IIlIl[n ^ 0x98FCF118] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String IlIIl(int n, char c, short s) {
        StackTraceElement[] stackTraceElementArray;
        int n2 = c ^ 0xA0DE;
        char[] cArray = IIllI[n2].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIlll[n2];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            stackTraceElementArray = new Throwable().getStackTrace();
            IIIIlI.IIlll[n2] = stackTraceElementArray;
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n3 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x1C25;
        int n4 = 0;
        do {
            int n5 = n4++;
            int n6 = cArray[n5] ^ 0xE364;
            n6 += 33478;
            n6 += 729;
            n6 -= 3543;
            n6 += 45517;
            n6 ^= 0xA0EE;
            cArray[n5] = (char)((n6 ^= 0x9264) ^ n3 ^ s ^ n >> 16);
        } while (n4 < cArray.length);
        return new String(cArray).intern();
    }
}

