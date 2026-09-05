/*
 * Orchard Client 1.7.8+1.21.11 (nitro) - deobfuscated for analysis.
 *
 * Original class : q96.x.llIllIIl
 * Module         : Auto Reconnect  [PLAYER]
 * Description    : Reconnects to the last multiplayer server after a configurable delay.   (client's own text)
 *
 * Recovered strings in this class:
 *   - AutoReconnectInput
 *   - .getBytes(
 *   - getKeycode
 *   - reconnect
 *   - modifiers
 *   - asNumber
 *   - toString
 *   - onPress
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
 *  net.minecraft.client.gui.Element
 *  net.minecraft.client.gui.screen.DisconnectedScreen
 *  net.minecraft.client.gui.screen.Screen
 *  net.minecraft.client.gui.screen.TitleScreen
 *  net.minecraft.client.gui.screen.multiplayer.ConnectScreen
 *  net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen
 *  net.minecraft.client.gui.widget.ButtonWidget
 *  net.minecraft.client.network.CookieStorage
 *  net.minecraft.client.network.ServerAddress
 *  net.minecraft.client.network.ServerInfo
 */
package orchard.module.player;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Locale;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.Element;
import net.minecraft.client.gui.screen.DisconnectedScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.TitleScreen;
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.client.network.CookieStorage;
import net.minecraft.client.network.ServerAddress;
import net.minecraft.client.network.ServerInfo;
import orchard.core.Category;
import orchard.core.ModuleBase;
import orchard.core.StringFactory;
import orchard.internal.Illlll;
import orchard.internal.lIlIIlI;
import orchard.internal.lllIIIIl;

@Environment(value=EnvType.CLIENT)
public final class AutoReconnect
extends ModuleBase {
    private Object I;
    private static String[] l;
    private long II;
    private ServerInfo Il;
    private final lIlIIlI lI = this.IIlllIl(new lIlIIlI(StringFactory.IIII("Delay"), 3.0, 0.5, 30.0, 0.5).IIIl("s"));
    private static final int[] ll;
    private static final String[] III;
    private static final Object[] IIl;

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void III() {
        MinecraftClient minecraftClient = MinecraftClient.getInstance();
        if (minecraftClient == null) {
            this.IlII();
            return;
        }
        this.lIII(minecraftClient);
        Screen screen = minecraftClient.currentScreen;
        if (!(screen instanceof DisconnectedScreen)) {
            this.IlII();
            return;
        }
        DisconnectedScreen disconnectedScreen = (DisconnectedScreen)screen;
        if (!this.IIII(minecraftClient)) {
            this.IlII();
            return;
        }
        long l2 = System.nanoTime() / 1000000L;
        if (this.I != disconnectedScreen) {
            this.I = disconnectedScreen;
            this.II = l2 + Math.max(0L, Math.round((Double)this.lI.lIl() * 1000.0));
            return;
        }
        if (l2 < this.II) {
            return;
        }
        if (this.lI(disconnectedScreen)) {
            this.IlII();
            return;
        }
        ServerInfo serverInfo = this.IllI(this.Il);
        if (serverInfo != null) {
            this.IlII();
            ConnectScreen.connect((Screen)this.Illl(disconnectedScreen), (MinecraftClient)minecraftClient, (ServerAddress)ServerAddress.parse((String)serverInfo.address), (ServerInfo)serverInfo, (boolean)false, (CookieStorage)Illlll.I());
            return;
        }
        this.IlII();
    }

    /*
     * Unable to fully structure code
     */
    private boolean lI(DisconnectedScreen var1_1) {
        block7: {
            block6: {
                if (var1_1 == null) {
                    return false;
                    return false;
                }
                var2_2 = var1_1.children().iterator();
                break block6;
lbl7:
                // 1 sources

                while (true) {
                    var3_3 = (Element)var2_2.next();
                    if (!(var3_3 instanceof ButtonWidget)) break block6;
                    break block7;
                    break;
                }
lbl11:
                // 1 sources

                return true;
            }
lbl14:
            // 3 sources

            while (true) {
                if (!var2_2.hasNext()) ** continue;
                ** continue;
                break;
            }
lbl17:
            // 1 sources

            while (true) {
                if (!this.IIlI(var4_4)) ** GOTO lbl14
                ** continue;
                break;
            }
        }
        var4_4 = (ButtonWidget)var3_3;
        if (this.lII(var4_4)) ** break;
        ** while (true)
        ** while (true)
    }

    private static void IIl() {
        AutoReconnect.l[0] = AutoReconnect.IlI(AutoReconnect.lIll(-2088267710, 381159931).toCharArray(), 63833L, -1081415207);
        AutoReconnect.l[1] = AutoReconnect.IlI(AutoReconnect.lIll(-2088267709, 987386198).toCharArray(), 89216L, -958337275);
        AutoReconnect.l[2] = AutoReconnect.IlI(AutoReconnect.lIll(-2088267712, -1693511303).toCharArray(), 68605L, -322724471);
        AutoReconnect.l[3] = AutoReconnect.IlI(AutoReconnect.lIll(-2088267711, 292751356).toCharArray(), 13601L, -347280265);
        AutoReconnect.l[4] = AutoReconnect.IlI(AutoReconnect.lIll(-2088267706, 1249729040).toCharArray(), 83902L, 1439895675);
        AutoReconnect.l[5] = AutoReconnect.IlI(AutoReconnect.lIll(-2088267705, 1522169644).toCharArray(), 7702L, -1826979644);
        AutoReconnect.l[6] = AutoReconnect.IlI(AutoReconnect.lIll(-2088267708, -1741932963).toCharArray(), 80986L, -1077150567);
        AutoReconnect.l[7] = AutoReconnect.IlI(AutoReconnect.lIll(-2088267707, -949329879).toCharArray(), 20369L, 1071511063);
        AutoReconnect.l[8] = AutoReconnect.IlI("".toCharArray(), 69992L, -600762846);
        AutoReconnect.l[9] = AutoReconnect.IlI(AutoReconnect.lIll(-2088267702, -106361949).toCharArray(), 52207L, -660353247);
        AutoReconnect.l[10] = AutoReconnect.IlI(AutoReconnect.lIll(-2088267701, -67100634).toCharArray(), 26624L, -1047953165);
        AutoReconnect.l[11] = AutoReconnect.IlI(AutoReconnect.lIll(-2088267704, -1889380383).toCharArray(), 19595L, -558466353);
        AutoReconnect.l[12] = AutoReconnect.IlI(AutoReconnect.lIll(-2088267703, -1981322762).toCharArray(), 69958L, -1913668121);
        AutoReconnect.l[13] = AutoReconnect.IlI(AutoReconnect.lIll(-2088267698, 1242172398).toCharArray(), 70635L, -1980459028);
    }

    public AutoReconnect() {
        super(StringFactory.IIII("Auto Reconnect"), Category.IIl, StringFactory.IIII("Reconnects to the last multiplayer server after a configurable delay."));
    }

    private static String IlI(char[] cArray, long l2, int n) {
        int n2 = 0xC76DAA3 ^ n;
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

    @Override
    public String II() {
        double d = (Double)this.lI.lIl();
        if (Math.abs(d - Math.rint(d)) < 0.001) {
            String string = "s";
            int n = (int)Math.rint(d);
            return n + string;
        }
        return String.format(Locale.ROOT, "%.1fs", d);
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean lII(ButtonWidget buttonWidget) {
        if (buttonWidget == null) return false;
        if (!buttonWidget.active) return false;
        if (!buttonWidget.visible) return false;
        String string = buttonWidget.getMessage() == null ? "" : buttonWidget.getMessage().getString();
        if (string == null) return false;
        if (!string.toLowerCase(Locale.ROOT).contains("reconnect")) return false;
        return true;
    }

    @Override
    public void llll() {
        this.IlII();
    }

    private Screen lIl() {
        return new MultiplayerScreen((Screen)new TitleScreen());
    }

    private Screen lll(DisconnectedScreen disconnectedScreen) {
        if (disconnectedScreen == null) {
            return null;
        }
        try {
            Field field = DisconnectedScreen.class.getDeclaredField("parent");
            field.setAccessible(true);
            Object object = field.get(disconnectedScreen);
            if (object instanceof Screen) {
                Screen screen = (Screen)object;
                return screen;
            }
            return null;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        int n = 10668;
        String string = "\u5e5c\u9b12\ud295\u11f2\u9c6c\u092b\u32a7\u4f89\uc084\uddc6\uba5a\ud29a\uab29\ub36f\uec78\u6171\u0491\u093b\u6fed\ub627\u9264\u5473\ue22d\u042c\uebcf\u91ca\ud136\ue4dc\u81b5\u1fb5\u1423\u4461\ud77e\ua0c8\u11bf\u0b71\u75b3\u50bb\u90c4\u13e4\u35cb\ud32f\ub2b7\u98bf\u3980\uc377\u6007\u15d9\ubf13\u5567\uad3a\u6e69\ucefd\u4b41\ua161\u8b7e\uc64d\ub971\u4ea3\u7bce\u71ac\u2bae\u6890\ue30b\u0232\u8d4f\u3fa9\u5987\ud046\uca22\u6573\u016f\u5b04\u3111\u90b4\u148c\u3f31\ue7a9\ufbdd\u02a6\u80f7\ub760\u8ea9\u3e6d\u77ec\ueeee\u0dd4\u2a7b\u10cb\uf6a1\u8575\u3565\u08b0\ud837\uffd9\ud785\ud8ed\u751a\uc0ce\ue6be\u0d8a\uda09\ubad2\uc074\u9281\u86d5\u3827\uc9f2\u7ea0\ue07a\u90ee\uf35c\u4809\ub7bc\u18a6\u2309\udd55\uc59a\uda0a\u37d2\u0817\uf89c\ube08\ueec5\u6fb4\u094e\ubb36\ud7f2\u68c7\u3fa1\u8dad\ua29d\uc316\u4014\u4109\ueaa7\udaa4\u31c1?\u44d6\u6fb8\u2da1\u7cea\u888d\ue839\uf2c7\uc312\u3fb4\u2174\u44f1\u4e14\u9577\u389c\u4cb6\u6fec\u486c\u3fbd\u0483\uf9aa\u140d\ud003\u8189\uaa20\ubb5f\uf43f\u108e\u403e\ubb8b\ud8a7\ud131\uba87\uc2d2\uee20\uadba\u1826\u455d\ue909\uc822\uc1e1\u1349\ua95c\udbd6\u7a26\u8c52\u9964\ub7ed\u4366\ucc84\ud4b4\uc6cf\ue6fa\u2e73\u4254\uf1c7\u04be\uf95b\u114a\ube51\u8167\u0d43\uac7c\ub803\ub36c\u6e73\ua684\uced9\u865a\ub100\u876b\u4a0b\u1e48\u5822\ucae1\u9d44\uac03\u44e6\uf6b6\u778c\ue06f\u9495\uf35e\u97e3\ufef6";
        char[] cArray = "\u29a6\u29a4\u29b4\u29a4\u29a5\u29a0\u29a8\u29a4\u29a0\u29a4\u29f0\u29a4\u29b8".toCharArray();
        String[] stringArray = new String[cArray.length];
        int n2 = -1;
        while (true) {
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            if (n2 != 0) {
                do {
                    n5 = cArray[n3] ^ n;
                    stringArray[n3] = string.substring(n4, n4 + n5);
                    n4 += n5;
                } while (++n3 < cArray.length);
            } else {
                III = stringArray;
                IIl = new Object[stringArray.length];
                int n6 = 1780592049;
                byte[] byArray = "+\u001eBO\u00fepz\u00a5>\u00a8Y\u00b1k#<\u00ca\r\u00c6tM\u008d#\u0012e\u00f5\u0094/\u0097\u00dbJ\u00c7?\u00ebU\u0010\u0095+\u00cf\u00e6\u008dj\u0085\u00cb\u00ba\u0010x\u009d!\u0092A*\u008fm\u00fbt7\u0085\u00bc\u00f7\u0015\u001a\u00d1\u00b0\u00ec\u00a0\u00e7\u00ce\u00ae\u00e8\u0093\u00c6P%\u00dd\u00b6\u0095\u00dc\u0082k\u009d\u001c\u00d8\u00cc\u0093\u000e\u00cd\u0007Ls,\u00b3]h\u00ddOY~T\u00cdp\u00aa\n\u0010\u0018\u00ea\u0014\u0094\u0003\u00ac7\u00fd\u00aa\u00a6v\u0090\u0085\u00d8\u00ce2\u00d810\u00ea\u00b8Qs$h\u00c2R}h3z\u00d0\u00ee".getBytes("ISO-8859-1");
                int n7 = byArray.length / 4;
                ll = new int[n7];
                int n8 = 0;
                int n9 = 0;
                do {
                    int n10 = (byArray[n8] & 0xFF) << 24 | (byArray[n8 + 1] & 0xFF) << 16 | (byArray[n8 + 2] & 0xFF) << 8 | byArray[n8 + 3] & 0xFF;
                    AutoReconnect.ll[n9] = n10 ^= n6;
                    n8 += 4;
                } while (++n9 < n7);
                l = new String[14];
                AutoReconnect.IIl();
                return;
            }
            n2 = 0;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private boolean IIII(MinecraftClient minecraftClient) {
        if (minecraftClient.isInSingleplayer()) return false;
        if (this.Il == null) return false;
        String string = this.Il.address;
        if (string == null) return false;
        if (string.isBlank()) return false;
        if (!ServerAddress.isValid((String)string)) return false;
        if (lllIIIIl.l(string)) return false;
        return true;
    }

    private boolean IIlI(ButtonWidget buttonWidget) {
        if (buttonWidget == null) {
            return false;
        }
        try {
            Method method = buttonWidget.getClass().getMethod("onPress", new Class[0]);
            method.invoke((Object)buttonWidget, new Object[0]);
            return true;
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            for (Method method : buttonWidget.getClass().getMethods()) {
                if (!method.getName().equals("onPress") || method.getParameterCount() != 1) continue;
                Class<?> clazz = method.getParameterTypes()[0];
                Object object = clazz.isInterface() ? Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, AutoReconnect::lIIl) : null;
                try {
                    method.invoke((Object)buttonWidget, object);
                    return true;
                }
                catch (ReflectiveOperationException reflectiveOperationException2) {
                    // empty catch block
                }
            }
            return false;
        }
    }

    private void IlII() {
        this.I = null;
        this.II = 0L;
    }

    private ServerInfo IllI(ServerInfo serverInfo) {
        if (serverInfo == null) {
            return null;
        }
        ServerInfo serverInfo2 = new ServerInfo(serverInfo.name, serverInfo.address, serverInfo.getServerType());
        serverInfo2.copyFrom(serverInfo);
        return serverInfo2;
    }

    private Screen Illl(DisconnectedScreen disconnectedScreen) {
        Screen screen = this.lll(disconnectedScreen);
        if (screen != null) {
            return screen;
        }
        return this.lIl();
    }

    /*
     * Enabled aggressive block sorting
     */
    private void lIII(MinecraftClient minecraftClient) {
        if (minecraftClient.isInSingleplayer()) {
            return;
        }
        ServerInfo serverInfo = minecraftClient.getCurrentServerEntry();
        if (serverInfo == null) return;
        if (serverInfo.address == null) return;
        if (!serverInfo.address.isBlank()) {
            this.Il = this.IllI(serverInfo);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Object lIIl(Object var0, Method var1_1, Object[] var2_2) throws Throwable {
        block12: {
            var3_3 = var1_1.getName();
            var4_4 = -1;
            switch (var3_3.hashCode()) {
                case -1417910757: {
                    if (!var3_3.equals("asNumber")) ** GOTO lbl14
                    var4_4 = 2;
                    break block12;
                }
                case -1901045636: {
                    if (!var3_3.equals("modifiers")) ** GOTO lbl14
                    var4_4 = 1;
                    break block12;
                }
                case -1776922004: {
                    if (var3_3.equals("toString")) ** GOTO lbl16
                }
lbl14:
                // 4 sources

                default: {
                    break block12;
                }
lbl16:
                // 1 sources

                var4_4 = 3;
                break block12;
                case 221855894: 
            }
            if (var3_3.equals("getKeycode")) {
                var4_4 = 0;
            }
        }
        switch (var4_4) {
            case 3: {
                return "AutoReconnectInput";
            }
            case 0: 
            case 1: 
            case 2: {
                v0 = 0;
                return v0;
            }
        }
        if (var1_1.getReturnType() != Boolean.TYPE) {
            v0 = 0;
            return v0;
        }
        v0 = Boolean.FALSE;
        return v0;
    }

    private static int lIlI(int n, int n2) {
        return ll[n ^ 0xA4548DED] ^ n2 ^ n;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static String lIll(int n, int n2) {
        StackTraceElement[] stackTraceElementArray;
        int n3 = n ^ 0x83879042;
        char[] cArray = III[n3].toCharArray();
        StackTraceElement[] stackTraceElementArray2 = (StackTraceElement[])IIl[n3];
        if (stackTraceElementArray2 != null) {
            stackTraceElementArray = stackTraceElementArray2;
        } else {
            AutoReconnect.IIl[n3] = stackTraceElementArray = new Throwable().getStackTrace();
        }
        StackTraceElement stackTraceElement = stackTraceElementArray[1];
        int n4 = (stackTraceElement.getClassName().hashCode() ^ stackTraceElement.getMethodName().hashCode()) >> 16 ^ 0x8E194651;
        int n5 = 0;
        do {
            cArray[n5] = cArray[n5] ^ (switch (n5 & 0x1F) {
                case 31 -> 100;
                case 19 -> 80;
                case 4 -> 245;
                case 20 -> 157;
                case 18 -> 223;
                case 28 -> 208;
                case 11 -> 221;
                default -> 34;
                case 16 -> 197;
                case 8 -> 198;
                case 3 -> 132;
                case 10 -> 13;
                case 23 -> 220;
                case 17 -> 174;
                case 2 -> 176;
                case 1 -> 160;
                case 27 -> 189;
                case 12 -> 226;
                case 21 -> 17;
                case 29 -> 177;
                case 30 -> 202;
                case 13 -> 97;
                case 25 -> 210;
                case 6 -> 49;
                case 5 -> 23;
                case 14 -> 157;
                case 15 -> 187;
                case 22 -> 170;
                case 7 -> 163;
                case 26 -> 78;
                case 9 -> 50;
                case 24 -> 89;
            }) ^ n2 >> 16 ^ n4;
        } while (++n5 < cArray.length);
        return new String(cArray).intern();
    }
}

